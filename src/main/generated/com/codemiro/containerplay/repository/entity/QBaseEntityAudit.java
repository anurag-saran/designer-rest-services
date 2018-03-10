package com.codemiro.containerplay.repository.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseEntityAudit is a Querydsl query type for BaseEntityAudit
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QBaseEntityAudit extends EntityPathBase<BaseEntityAudit> {

    private static final long serialVersionUID = -1082287412L;

    public static final QBaseEntityAudit baseEntityAudit = new QBaseEntityAudit("baseEntityAudit");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final DateTimePath<java.util.Date> updatedAt = createDateTime("updatedAt", java.util.Date.class);

    public final StringPath updatedBy = createString("updatedBy");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QBaseEntityAudit(String variable) {
        super(BaseEntityAudit.class, forVariable(variable));
    }

    public QBaseEntityAudit(Path<? extends BaseEntityAudit> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseEntityAudit(PathMetadata metadata) {
        super(BaseEntityAudit.class, metadata);
    }

}

