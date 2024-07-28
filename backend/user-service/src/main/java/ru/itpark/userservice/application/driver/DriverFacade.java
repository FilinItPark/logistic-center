package ru.itpark.userservice.application.driver;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.application.driver.command.CommandDriverService;
import ru.itpark.userservice.application.driver.query.QueryDriverService;
import ru.itpark.userservice.application.driver.response.SearchDriverQueryResponse;
import ru.itpark.userservice.application.driverLicense.query.QueryDriverLicenseService;
import ru.itpark.userservice.application.user.query.SearchUserFacade;
import ru.itpark.userservice.application.user.query.contracts.SearchParams;
import ru.itpark.userservice.domain.DriverLicense.DriverLicense;
import ru.itpark.userservice.domain.user.User;
import ru.itpark.userservice.presentation.web.driver.contracts.query.CreateDriverCommand;
import ru.itpark.userservice.presentation.web.driver.contracts.query.SearchDriverQuery;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class DriverFacade {
    private final QueryDriverService queryDriverService;
    private final CommandDriverService commandDriverService;
    private final QueryDriverLicenseService queryDriverLicenseService;
    private final SearchUserFacade searchUserFacade;
    private final DriverMapper mapper;

    public List<SearchDriverQueryResponse> search(SearchDriverQuery searchDriverQuery) {
        return
                mapper.toDto(
                        queryDriverService.search(searchDriverQuery)
                );
    }

    public void add(CreateDriverCommand createDriverCommand) {
        final List<User> searchResult = searchUserFacade.search(SearchParams.builder()
                .id(createDriverCommand.ownerId())
                .build()
        );

        if (searchResult.size() != 1) throw new IllegalArgumentException("Некорректные данные");

        User owner = searchResult.get(0);

        if (owner == null) {
            log.error("DriverFacade.add | User with id {} not found.", createDriverCommand.ownerId());
            throw new EntityNotFoundException("Такой пользователь не существует");
        }

        DriverLicense driverLicense = queryDriverLicenseService.get(createDriverCommand.driverLicenseId());


        commandDriverService.save(createDriverCommand, owner, driverLicense);
    }
}
