package com.ggomzirak.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSalt is a Querydsl query type for Salt
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSalt extends EntityPathBase<Salt> {

    private static final long serialVersionUID = -302429379L;

    public static final QSalt salt1 = new QSalt("salt1");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath salt = createString("salt");

    public QSalt(String variable) {
        super(Salt.class, forVariable(variable));
    }

    public QSalt(Path<? extends Salt> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSalt(PathMetadata metadata) {
        super(Salt.class, metadata);
    }

}

