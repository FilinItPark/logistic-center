package ru.itpark.userservice.domain.managers.converters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import jakarta.persistence.AttributeConverter;
import org.springframework.stereotype.Component;
import ru.itpark.userservice.domain.managers.VO.Tariff;
import ru.itpark.userservice.domain.user.VO.Language;

import java.lang.reflect.Type;
import java.util.List;


@Component
public class TariffConverter implements AttributeConverter<List<Tariff>, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(List<Tariff> o) {
        try {
            return objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException exception) {
            throw new IllegalArgumentException("Не удалось преобразовать объект в строку. " + o);
        }
    }

    @Override
    public List<Tariff> convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, new TypeReference<List<Tariff>>() {
                @Override
                public Type getType() {
                    TypeToken<List<Tariff>> typeToken = new TypeToken<List<Tariff>>() {
                    };

                    return typeToken.getType();
                }
            });
        } catch (JsonProcessingException exception) {
            throw new IllegalArgumentException("Не удалось преобразовать строку в объект. " + dbData);
        }
    }
}
