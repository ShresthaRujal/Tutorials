package com.rujal.multitenent.domain;

import io.gitlab.rujal_sh.annotation.internal.TenantHolder;
import io.gitlab.rujal_sh.database.domain.DataSourceComponent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@TenantHolder
public class UserDetail
        extends DataSourceComponent
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String username;

    private String password;

    private String schemaId;

    private String name;

    private boolean enable;

    @Column(unique = true)
    private String email;


}

