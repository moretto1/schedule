package moretto.bruno.schedule.domain.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Mapper<D, E> {

    @Autowired
    private ModelMapper mapper;

    public D mapToDto(E entity, Class<D> dtoClass) {
        return mapper.map(entity, dtoClass);
    }

    public E mapToEntity(D dto, Class<E> entityClass) {
        return mapper.map(dto, entityClass);
    }

    public List<D> mapToDtoList(List<E> entityList, Class<D> dtoClass) {
        return entityList.stream()
                .map(element -> mapper.map(element, dtoClass))
                .collect(Collectors.toList());
    }

    public List<E> mapToEntityList(List<D> dtoList, Class<E> entityClass) {
        return dtoList.stream()
                .map(element -> mapper.map(element, entityClass))
                .collect(Collectors.toList());
    }

}
