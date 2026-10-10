package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.C6419p;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import p528p7.InterfaceC43404j;

/* JADX INFO: loaded from: classes45.dex */
public abstract class SettableBeanProperty extends ConcreteBeanPropertyBase implements Serializable {
    protected static final AbstractC6390e<Object> MISSING_VALUE_DESERIALIZER = new FailingDeserializer("No _valueDeserializer assigned");
    protected final transient InterfaceC6484a _contextAnnotations;
    protected String _managedReferenceName;
    protected final InterfaceC6375j _nullProvider;
    protected C6419p _objectIdInfo;
    protected final PropertyName _propName;
    protected int _propertyIndex;
    protected final JavaType _type;
    protected final AbstractC6390e<Object> _valueDeserializer;
    protected final AbstractC6428b _valueTypeDeserializer;
    protected ViewMatcher _viewMatcher;
    protected final PropertyName _wrapperName;

    public static abstract class Delegating extends SettableBeanProperty {
        protected final SettableBeanProperty delegate;

        public abstract SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty);

        public SettableBeanProperty _with(SettableBeanProperty settableBeanProperty) {
            return settableBeanProperty == this.delegate ? this : withDelegate(settableBeanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void assignIndex(int i11) {
            this.delegate.assignIndex(i11);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            this.delegate.deserializeAndSet(jsonParser, deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            return this.delegate.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void fixAccess(DeserializationConfig deserializationConfig) {
            this.delegate.fixAccess(deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return (A) this.delegate.getAnnotation(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public int getCreatorIndex() {
            return this.delegate.getCreatorIndex();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Class<?> getDeclaringClass() {
            return this.delegate.getDeclaringClass();
        }

        public SettableBeanProperty getDelegate() {
            return this.delegate;
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object getInjectableValueId() {
            return this.delegate.getInjectableValueId();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public String getManagedReferenceName() {
            return this.delegate.getManagedReferenceName();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember getMember() {
            return this.delegate.getMember();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public C6419p getObjectIdInfo() {
            return this.delegate.getObjectIdInfo();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public int getPropertyIndex() {
            return this.delegate.getPropertyIndex();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public AbstractC6390e<Object> getValueDeserializer() {
            return this.delegate.getValueDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public AbstractC6428b getValueTypeDeserializer() {
            return this.delegate.getValueTypeDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean hasValueDeserializer() {
            return this.delegate.hasValueDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean hasValueTypeDeserializer() {
            return this.delegate.hasValueTypeDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean hasViews() {
            return this.delegate.hasViews();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean isInjectionOnly() {
            return this.delegate.isInjectionOnly();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void set(Object obj, Object obj2) throws IOException {
            this.delegate.set(obj, obj2);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object setAndReturn(Object obj, Object obj2) throws IOException {
            return this.delegate.setAndReturn(obj, obj2);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean visibleInView(Class<?> cls) {
            return this.delegate.visibleInView(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withName(PropertyName propertyName) {
            return _with(this.delegate.withName(propertyName));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withNullProvider(InterfaceC6375j interfaceC6375j) {
            return _with(this.delegate.withNullProvider(interfaceC6375j));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withValueDeserializer(AbstractC6390e<?> abstractC6390e) {
            return _with(this.delegate.withValueDeserializer(abstractC6390e));
        }

        public Delegating(SettableBeanProperty settableBeanProperty) {
            super(settableBeanProperty);
            this.delegate = settableBeanProperty;
        }
    }

    public SettableBeanProperty(AbstractC6414k abstractC6414k, JavaType javaType, AbstractC6428b abstractC6428b, InterfaceC6484a interfaceC6484a) {
        this(abstractC6414k.getFullName(), javaType, abstractC6414k.getWrapperName(), abstractC6428b, interfaceC6484a, abstractC6414k.getMetadata());
    }

    public void _throwAsIOE(JsonParser jsonParser, Exception exc, Object obj) throws IOException {
        if (!(exc instanceof IllegalArgumentException)) {
            _throwAsIOE(jsonParser, exc);
            return;
        }
        String strM11938h = C6490g.m11938h(obj);
        StringBuilder sb2 = new StringBuilder("Problem deserializing property '");
        sb2.append(getName());
        sb2.append("' (expected type: ");
        sb2.append(getType());
        sb2.append("; actual type: ");
        sb2.append(strM11938h);
        sb2.append(")");
        String strM11952o = C6490g.m11952o(exc);
        if (strM11952o != null) {
            sb2.append(", problem: ");
            sb2.append(strM11952o);
        } else {
            sb2.append(" (no error message provided)");
        }
        throw JsonMappingException.from(jsonParser, sb2.toString(), exc);
    }

    public abstract void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public abstract Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    public Object getInjectableValueId() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract AnnotatedMember getMember();

    public boolean isIgnorable() {
        return false;
    }

    public boolean isInjectionOnly() {
        return false;
    }

    public abstract void set(Object obj, Object obj2) throws IOException;

    public abstract Object setAndReturn(Object obj, Object obj2) throws IOException;

    public abstract SettableBeanProperty withName(PropertyName propertyName);

    public abstract SettableBeanProperty withNullProvider(InterfaceC6375j interfaceC6375j);

    public abstract SettableBeanProperty withValueDeserializer(AbstractC6390e<?> abstractC6390e);

    public void assignIndex(int i11) {
        if (this._propertyIndex == -1) {
            this._propertyIndex = i11;
            return;
        }
        throw new IllegalStateException("Property '" + getName() + "' already had index (" + this._propertyIndex + "), trying to assign " + i11);
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo10890k0(JsonToken.VALUE_NULL)) {
            return this._nullProvider.getNullValue(deserializationContext);
        }
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        if (abstractC6428b != null) {
            return this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
        }
        Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        return objDeserialize == null ? this._nullProvider.getNullValue(deserializationContext) : objDeserialize;
    }

    public final Object deserializeWith(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (!jsonParser.mo10890k0(JsonToken.VALUE_NULL)) {
            if (this._valueTypeDeserializer != null) {
                deserializationContext.reportBadDefinition(getType(), String.format("Cannot merge polymorphic property '%s'", getName()));
            }
            Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext, obj);
            if (objDeserialize != null) {
                return objDeserialize;
            }
            if (!NullsConstantProvider.isSkipper(this._nullProvider)) {
                return this._nullProvider.getNullValue(deserializationContext);
            }
        } else if (!NullsConstantProvider.isSkipper(this._nullProvider)) {
            return this._nullProvider.getNullValue(deserializationContext);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return (A) this._contextAnnotations.get(cls);
    }

    public int getCreatorIndex() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", getName(), getClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getFullName() {
        return this._propName;
    }

    public String getManagedReferenceName() {
        return this._managedReferenceName;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.InterfaceC6494k
    public final String getName() {
        return this._propName.getSimpleName();
    }

    public InterfaceC6375j getNullValueProvider() {
        return this._nullProvider;
    }

    public C6419p getObjectIdInfo() {
        return this._objectIdInfo;
    }

    public int getPropertyIndex() {
        return this._propertyIndex;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._type;
    }

    public AbstractC6390e<Object> getValueDeserializer() {
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        if (abstractC6390e == MISSING_VALUE_DESERIALIZER) {
            return null;
        }
        return abstractC6390e;
    }

    public AbstractC6428b getValueTypeDeserializer() {
        return this._valueTypeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    public boolean hasValueDeserializer() {
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        return (abstractC6390e == null || abstractC6390e == MISSING_VALUE_DESERIALIZER) ? false : true;
    }

    public boolean hasValueTypeDeserializer() {
        return this._valueTypeDeserializer != null;
    }

    public boolean hasViews() {
        return this._viewMatcher != null;
    }

    public void setManagedReferenceName(String str) {
        this._managedReferenceName = str;
    }

    public void setObjectIdInfo(C6419p c6419p) {
        this._objectIdInfo = c6419p;
    }

    public void setViews(Class<?>[] clsArr) {
        if (clsArr == null) {
            this._viewMatcher = null;
        } else {
            this._viewMatcher = ViewMatcher.construct(clsArr);
        }
    }

    public String toString() {
        return "[property '" + getName() + "']";
    }

    public boolean visibleInView(Class<?> cls) {
        ViewMatcher viewMatcher = this._viewMatcher;
        return viewMatcher == null || viewMatcher.isVisibleForView(cls);
    }

    public SettableBeanProperty withSimpleName(String str) {
        PropertyName propertyName = this._propName;
        PropertyName propertyName2 = propertyName == null ? new PropertyName(str) : propertyName.withSimpleName(str);
        return propertyName2 == this._propName ? this : withName(propertyName2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(InterfaceC43404j interfaceC43404j, AbstractC6446m abstractC6446m) throws JsonMappingException {
        if (isRequired()) {
            interfaceC43404j.m95586j(this);
        } else {
            interfaceC43404j.m95585g(this);
        }
    }

    public Class<?> getDeclaringClass() {
        return getMember().getDeclaringClass();
    }

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AbstractC6428b abstractC6428b, InterfaceC6484a interfaceC6484a, PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
        this._propertyIndex = -1;
        if (propertyName == null) {
            this._propName = PropertyName.NO_NAME;
        } else {
            this._propName = propertyName.internSimpleName();
        }
        this._type = javaType;
        this._wrapperName = propertyName2;
        this._contextAnnotations = interfaceC6484a;
        this._viewMatcher = null;
        this._valueTypeDeserializer = abstractC6428b != null ? abstractC6428b.forProperty(this) : abstractC6428b;
        AbstractC6390e<Object> abstractC6390e = MISSING_VALUE_DESERIALIZER;
        this._valueDeserializer = abstractC6390e;
        this._nullProvider = abstractC6390e;
    }

    public IOException _throwAsIOE(JsonParser jsonParser, Exception exc) throws IOException {
        C6490g.m11941i0(exc);
        C6490g.m11943j0(exc);
        Throwable thM11903F = C6490g.m11903F(exc);
        throw JsonMappingException.from(jsonParser, C6490g.m11952o(thM11903F), thM11903F);
    }

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyMetadata propertyMetadata, AbstractC6390e<Object> abstractC6390e) {
        super(propertyMetadata);
        this._propertyIndex = -1;
        if (propertyName == null) {
            this._propName = PropertyName.NO_NAME;
        } else {
            this._propName = propertyName.internSimpleName();
        }
        this._type = javaType;
        this._wrapperName = null;
        this._contextAnnotations = null;
        this._viewMatcher = null;
        this._valueTypeDeserializer = null;
        this._valueDeserializer = abstractC6390e;
        this._nullProvider = abstractC6390e;
    }

    public void markAsIgnorable() {
    }

    @Deprecated
    public IOException _throwAsIOE(Exception exc) throws IOException {
        return _throwAsIOE((JsonParser) null, exc);
    }

    public void _throwAsIOE(Exception exc, Object obj) throws IOException {
        _throwAsIOE(null, exc, obj);
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty) {
        super(settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = settableBeanProperty._nullProvider;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, AbstractC6390e<?> abstractC6390e, InterfaceC6375j interfaceC6375j) {
        super(settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        if (abstractC6390e == null) {
            this._valueDeserializer = MISSING_VALUE_DESERIALIZER;
        } else {
            this._valueDeserializer = abstractC6390e;
        }
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = interfaceC6375j == MISSING_VALUE_DESERIALIZER ? this._valueDeserializer : interfaceC6375j;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, PropertyName propertyName) {
        super(settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = propertyName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = settableBeanProperty._nullProvider;
    }
}
