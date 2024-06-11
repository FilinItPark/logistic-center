package ru.itpark.userservice.domain.managers;

import ru.itpark.userservice.domain.managers.VO.Tariff;
import ru.itpark.userservice.domain.user.User;

public class ManagerFactory {

    public static Manager createManager(User owner, float rating, Tariff tariff) {
        return Manager
                .builder()
                .owner(owner)
                .rating(rating)
                .tariff(tariff)
                .build();
    }

    public static ManagersCompanies createManagersCompanies(Manager manager, Long companyId)  {
        return ManagersCompanies
                .builder()
                .manager(manager)
                .companyId(companyId)
                .build();
    }
}
