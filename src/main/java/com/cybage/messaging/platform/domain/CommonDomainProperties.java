package com.cybage.messaging.platform.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class CommonDomainProperties {

    @Column(name = "created_by")
    @Type(type = "org.hibernate.type.IntegerType")
    private Integer createdBy;
}
