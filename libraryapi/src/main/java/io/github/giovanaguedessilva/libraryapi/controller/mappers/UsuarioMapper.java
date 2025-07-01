package io.github.giovanaguedessilva.libraryapi.controller.mappers;

import io.github.giovanaguedessilva.libraryapi.controller.dto.UsuarioDTO;
import io.github.giovanaguedessilva.libraryapi.model.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toEntity(UsuarioDTO dto);
}
