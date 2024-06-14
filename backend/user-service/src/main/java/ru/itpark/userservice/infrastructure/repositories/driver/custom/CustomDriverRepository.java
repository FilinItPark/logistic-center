package ru.itpark.userservice.infrastructure.repositories.driver.custom;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.itpark.userservice.domain.driver.Driver;
import ru.itpark.userservice.domain.user.User;
import ru.itpark.userservice.presentation.web.driver.contracts.query.SearchDriverQuery;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomDriverRepository {
    private final EntityManager em;

    public List<Driver> search(SearchDriverQuery params) {
        var cb = em.getCriteriaBuilder();
        var query = cb.createQuery(Driver.class);

        var root = query.from(Driver.class);

        List<Predicate> predicates = new ArrayList<>();

        if (params.getId() != null) {
            predicates.add(
                    cb.equal(root.get("id"), params.getId())
            );
        }

        if (params.getRating() != null) {
            predicates.add(
                    cb.equal(root.get("rating"), params.getRating())
            );
        }

        if (params.getDriverLicenseId() != null) {
            predicates.add(
                    cb.equal(root.get("driverLicense").get("id"), params.getDriverLicenseId())
            );
        }

        if (params.getOwnerId() != null) {
            predicates.add(
                    cb.equal(root.get("owner").get("id"), params.getOwnerId())
            );
        }

        if (params.getSumWay() != null) {
            predicates.add(
                    cb.equal(root.get("sumWay"), params.getSumWay())
            );
        }

        if (params.getExperienceMonth() != null) {
            predicates.add(
                    cb.equal(root.get("experienceMonth"), params.getExperienceMonth())
            );
        }

        final Predicate[] a = new Predicate[0];

        query.where(cb.and(predicates.toArray(a)));

        var typedQuery = em.createQuery(query);

        if (params.getLimit() != null && params.getLimit() > 0) {
            typedQuery.setMaxResults(params.getLimit());
        }

        if (params.getOffset() != null && params.getOffset() >= 0) {
            typedQuery.setFirstResult(params.getOffset());
        }

        return typedQuery.getResultList();

    }
}
