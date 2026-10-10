package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import p528p7.InterfaceC43404j;

/* JADX INFO: loaded from: classes45.dex */
public abstract class PropertyWriter extends ConcreteBeanPropertyBase implements Serializable {
    private static final long serialVersionUID = 1;

    public PropertyWriter(PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
    }

    @Deprecated
    public abstract void depositSchemaProperty(ObjectNode objectNode, AbstractC6446m abstractC6446m) throws JsonMappingException;

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract void depositSchemaProperty(InterfaceC43404j interfaceC43404j, AbstractC6446m abstractC6446m) throws JsonMappingException;

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract <A extends Annotation> A getContextAnnotation(Class<A> cls);

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract PropertyName getFullName();

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ AnnotatedMember getMember();

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.InterfaceC6494k
    public abstract String getName();

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ JavaType getType();

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ PropertyName getWrapperName();

    public abstract void serializeAsElement(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception;

    public abstract void serializeAsField(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception;

    public abstract void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception;

    public abstract void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception;

    public PropertyWriter(AbstractC6414k abstractC6414k) {
        super(abstractC6414k.getMetadata());
    }

    public PropertyWriter(PropertyWriter propertyWriter) {
        super(propertyWriter);
    }

    public <A extends Annotation> A findAnnotation(Class<A> cls) {
        A a11 = (A) getAnnotation(cls);
        if (a11 == null) {
            return (A) getContextAnnotation(cls);
        }
        return a11;
    }
}
