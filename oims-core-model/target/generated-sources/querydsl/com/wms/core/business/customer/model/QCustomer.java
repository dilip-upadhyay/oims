package com.wms.core.business.customer.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = -741618570L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomer customer = new QCustomer("customer");

    public final com.wms.core.business.generic.model.QSalesManagerEntity _super = new com.wms.core.business.generic.model.QSalesManagerEntity(this);

    public final BooleanPath anonymous = createBoolean("anonymous");

    public final SetPath<com.wms.core.business.customer.model.attribute.CustomerAttribute, com.wms.core.business.customer.model.attribute.QCustomerAttribute> attributes = this.<com.wms.core.business.customer.model.attribute.CustomerAttribute, com.wms.core.business.customer.model.attribute.QCustomerAttribute>createSet("attributes", com.wms.core.business.customer.model.attribute.CustomerAttribute.class, com.wms.core.business.customer.model.attribute.QCustomerAttribute.class, PathInits.DIRECT2);

    public final com.wms.core.business.common.model.QBilling billing;

    public final StringPath company = createString("company");

    public final DateTimePath<java.util.Date> dateOfBirth = createDateTime("dateOfBirth", java.util.Date.class);

    public final com.wms.core.business.reference.language.model.QLanguage defaultLanguage;

    public final com.wms.core.business.common.model.QDelivery delivery;

    public final StringPath emailAddress = createString("emailAddress");

    public final EnumPath<CustomerGender> gender = createEnum("gender", CustomerGender.class);

    public final ListPath<com.wms.core.business.user.model.Group, com.wms.core.business.user.model.QGroup> groups = this.<com.wms.core.business.user.model.Group, com.wms.core.business.user.model.QGroup>createList("groups", com.wms.core.business.user.model.Group.class, com.wms.core.business.user.model.QGroup.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.wms.core.business.merchant.model.QMerchantStore merchantStore;

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final StringPath nick = createString("nick");

    public final StringPath password = createString("password");

    public final ListPath<com.wms.core.business.catalog.product.model.review.ProductReview, com.wms.core.business.catalog.product.model.review.QProductReview> reviews = this.<com.wms.core.business.catalog.product.model.review.ProductReview, com.wms.core.business.catalog.product.model.review.QProductReview>createList("reviews", com.wms.core.business.catalog.product.model.review.ProductReview.class, com.wms.core.business.catalog.product.model.review.QProductReview.class, PathInits.DIRECT2);

    public QCustomer(String variable) {
        this(Customer.class, forVariable(variable), INITS);
    }

    public QCustomer(Path<? extends Customer> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomer(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomer(PathMetadata<?> metadata, PathInits inits) {
        this(Customer.class, metadata, inits);
    }

    public QCustomer(Class<? extends Customer> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.billing = inits.isInitialized("billing") ? new com.wms.core.business.common.model.QBilling(forProperty("billing"), inits.get("billing")) : null;
        this.defaultLanguage = inits.isInitialized("defaultLanguage") ? new com.wms.core.business.reference.language.model.QLanguage(forProperty("defaultLanguage"), inits.get("defaultLanguage")) : null;
        this.delivery = inits.isInitialized("delivery") ? new com.wms.core.business.common.model.QDelivery(forProperty("delivery"), inits.get("delivery")) : null;
        this.merchantStore = inits.isInitialized("merchantStore") ? new com.wms.core.business.merchant.model.QMerchantStore(forProperty("merchantStore"), inits.get("merchantStore")) : null;
    }

}

