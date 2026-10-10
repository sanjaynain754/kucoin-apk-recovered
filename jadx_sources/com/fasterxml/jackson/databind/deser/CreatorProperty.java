package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import java.io.IOException;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes45.dex */
public class CreatorProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedParameter _annotated;
    protected final int _creatorIndex;
    protected SettableBeanProperty _fallbackSetter;
    protected boolean _ignorable;
    protected final JacksonInject.Value _injectableValue;

    public CreatorProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AbstractC6428b abstractC6428b, InterfaceC6484a interfaceC6484a, AnnotatedParameter annotatedParameter, int i11, JacksonInject.Value value, PropertyMetadata propertyMetadata) {
        super(propertyName, javaType, propertyName2, abstractC6428b, interfaceC6484a, propertyMetadata);
        this._annotated = annotatedParameter;
        this._creatorIndex = i11;
        this._injectableValue = value;
        this._fallbackSetter = null;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void markAsIgnorable() {
        this._ignorable = true;
    }

    public static CreatorProperty construct(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AbstractC6428b abstractC6428b, InterfaceC6484a interfaceC6484a, AnnotatedParameter annotatedParameter, int i11, JacksonInject.Value value, PropertyMetadata propertyMetadata) {
        return new CreatorProperty(propertyName, javaType, propertyName2, abstractC6428b, interfaceC6484a, annotatedParameter, i11, value, propertyMetadata);
    }

    /* JADX INFO: renamed from: a */
    public final void m11211a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str = "No fallback setter/field defined for creator property " + C6490g.m11919V(getName());
        if (deserializationContext == null) {
            throw InvalidDefinitionException.from(jsonParser, str, getType());
        }
        deserializationContext.reportBadDefinition(getType(), str);
    }

    /* JADX INFO: renamed from: b */
    public final void m11212b() throws IOException {
        if (this._fallbackSetter == null) {
            m11211a(null, null);
        }
    }

    @Deprecated
    public Object findInjectableValue(DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        if (this._injectableValue == null) {
            deserializationContext.reportBadDefinition(C6490g.m11940i(obj), String.format("Property %s (type %s) has no injectable value id configured", C6490g.m11919V(getName()), C6490g.m11938h(this)));
        }
        return deserializationContext.findInjectableValue(this._injectableValue.getId(), this, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this._fallbackSetter;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(deserializationConfig);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedParameter annotatedParameter = this._annotated;
        if (annotatedParameter == null) {
            return null;
        }
        return (A) annotatedParameter.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public int getCreatorIndex() {
        return this._creatorIndex;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object getInjectableValueId() {
        JacksonInject.Value value = this._injectableValue;
        if (value == null) {
            return null;
        }
        return value.getId();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._annotated;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public boolean isIgnorable() {
        return this._ignorable;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public boolean isInjectionOnly() {
        JacksonInject.Value value = this._injectableValue;
        return (value == null || value.willUseInput(true)) ? false : true;
    }

    public void setFallbackSetter(SettableBeanProperty settableBeanProperty) {
        this._fallbackSetter = settableBeanProperty;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public String toString() {
        return "[creator property, name " + C6490g.m11919V(getName()) + "; inject id '" + getInjectableValueId() + "']";
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new CreatorProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(InterfaceC6375j interfaceC6375j) {
        return new CreatorProperty(this, this._valueDeserializer, interfaceC6375j);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(AbstractC6390e<?> abstractC6390e) {
        AbstractC6390e<?> abstractC6390e2 = this._valueDeserializer;
        if (abstractC6390e2 == abstractC6390e) {
            return this;
        }
        InterfaceC6375j interfaceC6375j = this._nullProvider;
        if (abstractC6390e2 == interfaceC6375j) {
            interfaceC6375j = abstractC6390e;
        }
        return new CreatorProperty(this, abstractC6390e, interfaceC6375j);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        m11212b();
        this._fallbackSetter.set(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        m11212b();
        return this._fallbackSetter.setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyMetadata getMetadata() {
        PropertyMetadata metadata = super.getMetadata();
        SettableBeanProperty settableBeanProperty = this._fallbackSetter;
        if (settableBeanProperty != null) {
            return metadata.withMergeInfo(settableBeanProperty.getMetadata().getMergeInfo());
        }
        return metadata;
    }

    @Deprecated
    public void inject(DeserializationContext deserializationContext, Object obj) throws IOException {
        set(obj, findInjectableValue(deserializationContext, obj));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        m11212b();
        this._fallbackSetter.set(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        m11212b();
        return this._fallbackSetter.setAndReturn(obj, obj2);
    }

    @Deprecated
    public CreatorProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AbstractC6428b abstractC6428b, InterfaceC6484a interfaceC6484a, AnnotatedParameter annotatedParameter, int i11, Object obj, PropertyMetadata propertyMetadata) {
        this(propertyName, javaType, propertyName2, abstractC6428b, interfaceC6484a, annotatedParameter, i11, obj != null ? JacksonInject.Value.construct(obj, null) : null, propertyMetadata);
    }

    public CreatorProperty(CreatorProperty creatorProperty, PropertyName propertyName) {
        super(creatorProperty, propertyName);
        this._annotated = creatorProperty._annotated;
        this._injectableValue = creatorProperty._injectableValue;
        this._fallbackSetter = creatorProperty._fallbackSetter;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._ignorable = creatorProperty._ignorable;
    }

    public CreatorProperty(CreatorProperty creatorProperty, AbstractC6390e<?> abstractC6390e, InterfaceC6375j interfaceC6375j) {
        super(creatorProperty, abstractC6390e, interfaceC6375j);
        this._annotated = creatorProperty._annotated;
        this._injectableValue = creatorProperty._injectableValue;
        this._fallbackSetter = creatorProperty._fallbackSetter;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._ignorable = creatorProperty._ignorable;
    }
}
