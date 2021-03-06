package com.mq135.mq135project.persistence.mapper;

import com.mq135.mq135project.domain.Mq135Domain;
import com.mq135.mq135project.persistence.entity.mq135;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface mq135Mapper {

    @Mappings({
            @Mapping(source = "idMq135", target = "id_mq135"),
            @Mapping(source = "dataMq135", target = "data_mq135"),
            @Mapping(source = "dateMq135", target = "date_mq135")
    })
    Mq135Domain toMq135Domain(mq135 mq_135);
    List<Mq135Domain> toMq135Domains(List<mq135> mq_135);
}
