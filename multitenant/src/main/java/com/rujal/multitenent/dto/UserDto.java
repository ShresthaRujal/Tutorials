package com.rujal.multitenent.dto;

import io.gitlab.rujal_sh.database.domain.DataSourceConfig;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private String name;
    private String email;
    private String password;
    private DataSourceConfig dataSourceConfig;

}
