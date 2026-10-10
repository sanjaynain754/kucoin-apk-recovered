package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p062io.SerializedString;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.AbstractC6464b;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43404j;
import p551q7.C43651a;
import p551q7.InterfaceC43653c;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class BeanPropertyWriter extends PropertyWriter implements Serializable {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected transient Method _accessorMethod;
    protected final JavaType _cfgSerializationType;
    protected final transient InterfaceC6484a _contextAnnotations;
    protected final JavaType _declaredType;
    protected transient AbstractC6464b _dynamicSerializers;
    protected transient Field _field;
    protected final Class<?>[] _includeInViews;
    protected transient HashMap<Object, Object> _internalSettings;
    protected final AnnotatedMember _member;
    protected final SerializedString _name;
    protected JavaType _nonTrivialBaseType;
    protected AbstractC6393h<Object> _nullSerializer;
    protected AbstractC6393h<Object> _serializer;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected AbstractC6431e _typeSerializer;
    protected final PropertyName _wrapperName;

    public BeanPropertyWriter(AbstractC6414k abstractC6414k, AnnotatedMember annotatedMember, InterfaceC6484a interfaceC6484a, JavaType javaType, AbstractC6393h<?> abstractC6393h, AbstractC6431e abstractC6431e, JavaType javaType2, boolean z11, Object obj, Class<?>[] clsArr) {
        super(abstractC6414k);
        this._member = annotatedMember;
        this._contextAnnotations = interfaceC6484a;
        this._name = new SerializedString(abstractC6414k.getName());
        this._wrapperName = abstractC6414k.getWrapperName();
        this._declaredType = javaType;
        this._serializer = abstractC6393h;
        this._dynamicSerializers = abstractC6393h == null ? AbstractC6464b.m11798c() : null;
        this._typeSerializer = abstractC6431e;
        this._cfgSerializationType = javaType2;
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        } else {
            this._accessorMethod = null;
            this._field = null;
        }
        this._suppressNulls = z11;
        this._suppressableValue = obj;
        this._nullSerializer = null;
        this._includeInViews = clsArr;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(InterfaceC43404j interfaceC43404j, AbstractC6446m abstractC6446m) throws JsonMappingException {
        if (interfaceC43404j != null) {
            if (isRequired()) {
                interfaceC43404j.m95586j(this);
            } else {
                interfaceC43404j.m95585g(this);
            }
        }
    }

    public boolean isUnwrapping() {
        return false;
    }

    public AbstractC6393h<Object> _findAndAddDynamic(AbstractC6464b abstractC6464b, Class<?> cls, AbstractC6446m abstractC6446m) throws JsonMappingException {
        JavaType javaType = this._nonTrivialBaseType;
        AbstractC6464b.d dVarM11803f = javaType != null ? abstractC6464b.m11803f(abstractC6446m.constructSpecializedType(javaType, cls), abstractC6446m, this) : abstractC6464b.m11804g(cls, abstractC6446m, this);
        AbstractC6464b abstractC6464b2 = dVarM11803f.f10632b;
        if (abstractC6464b != abstractC6464b2) {
            this._dynamicSerializers = abstractC6464b2;
        }
        return dVarM11803f.f10631a;
    }

    public BeanPropertyWriter _new(PropertyName propertyName) {
        return new BeanPropertyWriter(this, propertyName);
    }

    public void assignNullSerializer(AbstractC6393h<Object> abstractC6393h) {
        AbstractC6393h<Object> abstractC6393h2 = this._nullSerializer;
        if (abstractC6393h2 != null && abstractC6393h2 != abstractC6393h) {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", C6490g.m11938h(this._nullSerializer), C6490g.m11938h(abstractC6393h)));
        }
        this._nullSerializer = abstractC6393h;
    }

    public void assignSerializer(AbstractC6393h<Object> abstractC6393h) {
        AbstractC6393h<Object> abstractC6393h2 = this._serializer;
        if (abstractC6393h2 != null && abstractC6393h2 != abstractC6393h) {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", C6490g.m11938h(this._serializer), C6490g.m11938h(abstractC6393h)));
        }
        this._serializer = abstractC6393h;
    }

    public void assignTypeSerializer(AbstractC6431e abstractC6431e) {
        this._typeSerializer = abstractC6431e;
    }

    public void fixAccess(SerializationConfig serializationConfig) {
        this._member.fixAccess(serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public final Object get(Object obj) throws Exception {
        Method method = this._accessorMethod;
        return method == null ? this._field.get(obj) : method.invoke(obj, null);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember == null) {
            return null;
        }
        return (A) annotatedMember.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        InterfaceC6484a interfaceC6484a = this._contextAnnotations;
        if (interfaceC6484a == null) {
            return null;
        }
        return (A) interfaceC6484a.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getFullName() {
        return new PropertyName(this._name.getValue());
    }

    @Deprecated
    public Type getGenericPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getGenericReturnType();
        }
        Field field = this._field;
        if (field != null) {
            return field.getGenericType();
        }
        return null;
    }

    public Object getInternalSetting(Object obj) {
        HashMap<Object, Object> map = this._internalSettings;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._member;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.InterfaceC6494k
    public String getName() {
        return this._name.getValue();
    }

    @Deprecated
    public Class<?> getPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getReturnType();
        }
        Field field = this._field;
        if (field != null) {
            return field.getType();
        }
        return null;
    }

    @Deprecated
    public Class<?> getRawSerializationType() {
        JavaType javaType = this._cfgSerializationType;
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public JavaType getSerializationType() {
        return this._cfgSerializationType;
    }

    public InterfaceC6306i getSerializedName() {
        return this._name;
    }

    public AbstractC6393h<Object> getSerializer() {
        return this._serializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._declaredType;
    }

    public AbstractC6431e getTypeSerializer() {
        return this._typeSerializer;
    }

    public Class<?>[] getViews() {
        return this._includeInViews;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    public boolean hasNullSerializer() {
        return this._nullSerializer != null;
    }

    public boolean hasSerializer() {
        return this._serializer != null;
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        }
        if (this._serializer == null) {
            this._dynamicSerializers = AbstractC6464b.m11798c();
        }
        return this;
    }

    public Object removeInternalSetting(Object obj) {
        HashMap<Object, Object> map = this._internalSettings;
        if (map == null) {
            return null;
        }
        Object objRemove = map.remove(obj);
        if (this._internalSettings.size() == 0) {
            this._internalSettings = null;
        }
        return objRemove;
    }

    public BeanPropertyWriter rename(NameTransformer nameTransformer) {
        String strTransform = nameTransformer.transform(this._name.getValue());
        return strTransform.equals(this._name.toString()) ? this : _new(PropertyName.construct(strTransform));
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        Method method = this._accessorMethod;
        Object objInvoke = method == null ? this._field.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            AbstractC6393h<Object> abstractC6393h = this._nullSerializer;
            if (abstractC6393h != null) {
                abstractC6393h.serialize(null, jsonGenerator, abstractC6446m);
                return;
            } else {
                jsonGenerator.mo10812b0();
                return;
            }
        }
        AbstractC6393h<?> abstractC6393h_findAndAddDynamic = this._serializer;
        if (abstractC6393h_findAndAddDynamic == null) {
            Class<?> cls = objInvoke.getClass();
            AbstractC6464b abstractC6464b = this._dynamicSerializers;
            AbstractC6393h<?> abstractC6393hMo11808k = abstractC6464b.mo11808k(cls);
            abstractC6393h_findAndAddDynamic = abstractC6393hMo11808k == null ? _findAndAddDynamic(abstractC6464b, cls, abstractC6446m) : abstractC6393hMo11808k;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (MARKER_FOR_EMPTY == obj2) {
                if (abstractC6393h_findAndAddDynamic.isEmpty(abstractC6446m, objInvoke)) {
                    serializeAsPlaceholder(obj, jsonGenerator, abstractC6446m);
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                serializeAsPlaceholder(obj, jsonGenerator, abstractC6446m);
                return;
            }
        }
        if (objInvoke == obj && _handleSelfReference(obj, jsonGenerator, abstractC6446m, abstractC6393h_findAndAddDynamic)) {
            return;
        }
        AbstractC6431e abstractC6431e = this._typeSerializer;
        if (abstractC6431e == null) {
            abstractC6393h_findAndAddDynamic.serialize(objInvoke, jsonGenerator, abstractC6446m);
        } else {
            abstractC6393h_findAndAddDynamic.serializeWithType(objInvoke, jsonGenerator, abstractC6446m, abstractC6431e);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        Method method = this._accessorMethod;
        Object objInvoke = method == null ? this._field.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            if (this._nullSerializer != null) {
                jsonGenerator.mo10808Z(this._name);
                this._nullSerializer.serialize(null, jsonGenerator, abstractC6446m);
                return;
            }
            return;
        }
        AbstractC6393h<?> abstractC6393h_findAndAddDynamic = this._serializer;
        if (abstractC6393h_findAndAddDynamic == null) {
            Class<?> cls = objInvoke.getClass();
            AbstractC6464b abstractC6464b = this._dynamicSerializers;
            AbstractC6393h<?> abstractC6393hMo11808k = abstractC6464b.mo11808k(cls);
            abstractC6393h_findAndAddDynamic = abstractC6393hMo11808k == null ? _findAndAddDynamic(abstractC6464b, cls, abstractC6446m) : abstractC6393hMo11808k;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (MARKER_FOR_EMPTY == obj2) {
                if (abstractC6393h_findAndAddDynamic.isEmpty(abstractC6446m, objInvoke)) {
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && _handleSelfReference(obj, jsonGenerator, abstractC6446m, abstractC6393h_findAndAddDynamic)) {
            return;
        }
        jsonGenerator.mo10808Z(this._name);
        AbstractC6431e abstractC6431e = this._typeSerializer;
        if (abstractC6431e == null) {
            abstractC6393h_findAndAddDynamic.serialize(objInvoke, jsonGenerator, abstractC6446m);
        } else {
            abstractC6393h_findAndAddDynamic.serializeWithType(objInvoke, jsonGenerator, abstractC6446m, abstractC6431e);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        AbstractC6393h<Object> abstractC6393h = this._nullSerializer;
        if (abstractC6393h != null) {
            abstractC6393h.serialize(null, jsonGenerator, abstractC6446m);
        } else {
            jsonGenerator.mo10812b0();
        }
    }

    public Object setInternalSetting(Object obj, Object obj2) {
        if (this._internalSettings == null) {
            this._internalSettings = new HashMap<>();
        }
        return this._internalSettings.put(obj, obj2);
    }

    public void setNonTrivialBaseType(JavaType javaType) {
        this._nonTrivialBaseType = javaType;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("property '");
        sb2.append(getName());
        sb2.append("' (");
        if (this._accessorMethod != null) {
            sb2.append("via method ");
            sb2.append(this._accessorMethod.getDeclaringClass().getName());
            sb2.append(RunnableC33958ua.f72251f);
            sb2.append(this._accessorMethod.getName());
        } else if (this._field != null) {
            sb2.append("field \"");
            sb2.append(this._field.getDeclaringClass().getName());
            sb2.append(RunnableC33958ua.f72251f);
            sb2.append(this._field.getName());
        } else {
            sb2.append("virtual");
        }
        if (this._serializer == null) {
            sb2.append(", no static serializer");
        } else {
            sb2.append(", static serializer of type " + this._serializer.getClass().getName());
        }
        sb2.append(')');
        return sb2.toString();
    }

    public BeanPropertyWriter unwrappingWriter(NameTransformer nameTransformer) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer);
    }

    public boolean willSuppressNulls() {
        return this._suppressNulls;
    }

    public boolean wouldConflictWithName(PropertyName propertyName) {
        PropertyName propertyName2 = this._wrapperName;
        if (propertyName2 != null) {
            return propertyName2.equals(propertyName);
        }
        return propertyName.hasSimpleName(this._name.getValue()) && !propertyName.hasNamespace();
    }

    public void _depositSchemaProperty(ObjectNode objectNode, AbstractC6391f abstractC6391f) {
        objectNode.set(getName(), abstractC6391f);
    }

    public boolean _handleSelfReference(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6393h<?> abstractC6393h) throws IOException {
        if (!abstractC6393h.usesObjectId()) {
            if (abstractC6446m.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)) {
                if (abstractC6393h instanceof BeanSerializerBase) {
                    abstractC6446m.reportBadDefinition(getType(), "Direct self-reference leading to cycle");
                    return false;
                }
                return false;
            }
            if (abstractC6446m.isEnabled(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL)) {
                if (this._nullSerializer != null) {
                    if (!jsonGenerator.mo10833o().m10937f()) {
                        jsonGenerator.mo10808Z(this._name);
                    }
                    this._nullSerializer.serialize(null, jsonGenerator, abstractC6446m);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        if (!jsonGenerator.m10821i()) {
            jsonGenerator.m10832n0(this._name.getValue());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    @Deprecated
    public void depositSchemaProperty(ObjectNode objectNode, AbstractC6446m abstractC6446m) throws JsonMappingException {
        AbstractC6391f abstractC6391fM96066a;
        JavaType serializationType = getSerializationType();
        Type type = serializationType == null ? getType() : serializationType.getRawClass();
        Object serializer = getSerializer();
        if (serializer == null) {
            serializer = abstractC6446m.findValueSerializer(getType(), this);
        }
        boolean z11 = !isRequired();
        if (serializer instanceof InterfaceC43653c) {
            abstractC6391fM96066a = ((InterfaceC43653c) serializer).getSchema(abstractC6446m, type, z11);
        } else {
            abstractC6391fM96066a = C43651a.m96066a();
        }
        _depositSchemaProperty(objectNode, abstractC6391fM96066a);
    }

    @Deprecated
    public BeanPropertyWriter(AbstractC6414k abstractC6414k, AnnotatedMember annotatedMember, InterfaceC6484a interfaceC6484a, JavaType javaType, AbstractC6393h<?> abstractC6393h, AbstractC6431e abstractC6431e, JavaType javaType2, boolean z11, Object obj) {
        this(abstractC6414k, annotatedMember, interfaceC6484a, javaType, abstractC6393h, abstractC6431e, javaType2, z11, obj, null);
    }

    public BeanPropertyWriter() {
        super(PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
        this._member = null;
        this._contextAnnotations = null;
        this._name = null;
        this._wrapperName = null;
        this._includeInViews = null;
        this._declaredType = null;
        this._serializer = null;
        this._dynamicSerializers = null;
        this._typeSerializer = null;
        this._cfgSerializationType = null;
        this._accessorMethod = null;
        this._field = null;
        this._suppressNulls = false;
        this._suppressableValue = null;
        this._nullSerializer = null;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter) {
        this(beanPropertyWriter, beanPropertyWriter._name);
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, PropertyName propertyName) {
        super(beanPropertyWriter);
        this._name = new SerializedString(propertyName.getSimpleName());
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._member = beanPropertyWriter._member;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, SerializedString serializedString) {
        super(beanPropertyWriter);
        this._name = serializedString;
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._member = beanPropertyWriter._member;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }
}
