package ru.itpark.userservice.presentation.web.driver;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itpark.userservice.application.driver.DriverFacade;
import ru.itpark.userservice.application.driver.response.DriverResponse;
import ru.itpark.userservice.presentation.web.driver.contracts.query.SearchDriverQuery;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/drivers")
@RestController
public class DriverController {
    private final DriverFacade facade;

    @PostMapping("/search")
    public List<DriverResponse> search(@RequestBody SearchDriverQuery query) {

        return facade.search(query);
    }
}
