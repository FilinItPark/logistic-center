package ru.itpark.userservice.application.driver;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.application.driver.query.DriverQueryService;
import ru.itpark.userservice.application.driver.response.DriverResponse;
import ru.itpark.userservice.presentation.web.driver.contracts.query.SearchDriverQuery;

import java.util.List;

@AllArgsConstructor
@Service
public class DriverFacade {
    private final DriverQueryService driverQueryService;
    private final DriverMapper mapper;

    public List<DriverResponse> search(SearchDriverQuery searchDriverQuery) {
        return
                mapper.toDto(
                        driverQueryService.search(searchDriverQuery)
                );
    }
}
