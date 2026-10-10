package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.InterfaceC6269a0;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.C6373h;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.C6419p;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public class AbstractDeserializer extends AbstractC6390e<Object> implements InterfaceC6358c, Serializable {
    private static final long serialVersionUID = 1;
    protected final boolean _acceptBoolean;
    protected final boolean _acceptDouble;
    protected final boolean _acceptInt;
    protected final boolean _acceptString;
    protected final Map<String, SettableBeanProperty> _backRefProperties;
    protected final JavaType _baseType;
    protected final ObjectIdReader _objectIdReader;
    protected transient Map<String, SettableBeanProperty> _properties;

    public AbstractDeserializer(C6356a c6356a, AbstractC6340b abstractC6340b, Map<String, SettableBeanProperty> map, Map<String, SettableBeanProperty> map2) {
        JavaType javaTypeM11151A = abstractC6340b.m11151A();
        this._baseType = javaTypeM11151A;
        this._objectIdReader = c6356a.m11238t();
        this._backRefProperties = map;
        this._properties = map2;
        Class<?> rawClass = javaTypeM11151A.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z11 = true;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass != Double.TYPE && !rawClass.isAssignableFrom(Double.class)) {
            z11 = false;
        }
        this._acceptDouble = z11;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public static AbstractDeserializer constructForNonPOJO(AbstractC6340b abstractC6340b) {
        return new AbstractDeserializer(abstractC6340b);
    }

    public Object _deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        C6373h c6373hFindObjectId = deserializationContext.findObjectId(objectReference, objectIdReader.generator, objectIdReader.resolver);
        Object objM11378f = c6373hFindObjectId.m11378f();
        if (objM11378f != null) {
            return objM11378f;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + objectReference + "] -- unresolved forward-reference?", jsonParser.mo10908v(), c6373hFindObjectId);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleMissingInstantiator(this._baseType.getRawClass(), new ValueInstantiator.Base(this._baseType), jsonParser, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        JsonToken jsonTokenMo10889k;
        if (this._objectIdReader != null && (jsonTokenMo10889k = jsonParser.mo10889k()) != null) {
            if (jsonTokenMo10889k.isScalarValue()) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
            if (jsonTokenMo10889k == JsonToken.START_OBJECT) {
                jsonTokenMo10889k = jsonParser.mo10905t0();
            }
            if (jsonTokenMo10889k == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.mo10887j(), jsonParser)) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
        }
        Object obj_deserializeIfNatural = _deserializeIfNatural(jsonParser, deserializationContext);
        return obj_deserializeIfNatural != null ? obj_deserializeIfNatural : abstractC6428b.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefProperties;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Class<?> handledType() {
        return this._baseType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.POJO;
    }

    public Object _deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.mo10891l()) {
            case 6:
                if (this._acceptString) {
                    return jsonParser.mo10869W();
                }
                return null;
            case 7:
                if (this._acceptInt) {
                    return Integer.valueOf(jsonParser.mo10860M());
                }
                return null;
            case 8:
                if (this._acceptDouble) {
                    return Double.valueOf(jsonParser.mo10857E());
                }
                return null;
            case 9:
                if (this._acceptBoolean) {
                    return Boolean.TRUE;
                }
                return null;
            case 10:
                if (this._acceptBoolean) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember member;
        C6419p c6419pFindObjectIdInfo;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        SettableBeanProperty settableBeanProperty;
        JavaType javaType;
        SettableBeanProperty settableBeanProperty2;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (beanProperty != null && annotationIntrospector != null && (member = beanProperty.getMember()) != null && (c6419pFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) != null) {
            InterfaceC6269a0 interfaceC6269a0ObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, c6419pFindObjectIdInfo);
            C6419p c6419pFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, c6419pFindObjectIdInfo);
            Class<? extends ObjectIdGenerator<?>> clsM11572c = c6419pFindObjectReferenceInfo.m11572c();
            if (clsM11572c == ObjectIdGenerators$PropertyGenerator.class) {
                PropertyName propertyNameM11573d = c6419pFindObjectReferenceInfo.m11573d();
                Map<String, SettableBeanProperty> map = this._properties;
                if (map == null) {
                    settableBeanProperty2 = null;
                } else {
                    settableBeanProperty2 = map.get(propertyNameM11573d.getSimpleName());
                }
                if (settableBeanProperty2 == null) {
                    deserializationContext.reportBadDefinition(this._baseType, String.format("Invalid Object Id definition for %s: cannot find property with name %s", C6490g.m11921X(handledType()), C6490g.m11918U(propertyNameM11573d)));
                }
                JavaType type = settableBeanProperty2.getType();
                objectIdGeneratorObjectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(c6419pFindObjectReferenceInfo.m11575f());
                javaType = type;
                settableBeanProperty = settableBeanProperty2;
            } else {
                interfaceC6269a0ObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, c6419pFindObjectReferenceInfo);
                JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) clsM11572c), ObjectIdGenerator.class)[0];
                objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(member, c6419pFindObjectReferenceInfo);
                settableBeanProperty = null;
                javaType = javaType2;
            }
            return new AbstractDeserializer(this, ObjectIdReader.construct(javaType, c6419pFindObjectReferenceInfo.m11573d(), objectIdGeneratorObjectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, interfaceC6269a0ObjectIdResolverInstance), (Map<String, SettableBeanProperty>) null);
        }
        if (this._properties == null) {
            return this;
        }
        return new AbstractDeserializer(this, this._objectIdReader, (Map<String, SettableBeanProperty>) null);
    }

    @Deprecated
    public AbstractDeserializer(C6356a c6356a, AbstractC6340b abstractC6340b, Map<String, SettableBeanProperty> map) {
        this(c6356a, abstractC6340b, map, null);
    }

    public AbstractDeserializer(AbstractC6340b abstractC6340b) {
        JavaType javaTypeM11151A = abstractC6340b.m11151A();
        this._baseType = javaTypeM11151A;
        this._objectIdReader = null;
        this._backRefProperties = null;
        Class<?> rawClass = javaTypeM11151A.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z11 = true;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass != Double.TYPE && !rawClass.isAssignableFrom(Double.class)) {
            z11 = false;
        }
        this._acceptDouble = z11;
    }

    public AbstractDeserializer(AbstractDeserializer abstractDeserializer, ObjectIdReader objectIdReader, Map<String, SettableBeanProperty> map) {
        this._baseType = abstractDeserializer._baseType;
        this._backRefProperties = abstractDeserializer._backRefProperties;
        this._acceptString = abstractDeserializer._acceptString;
        this._acceptBoolean = abstractDeserializer._acceptBoolean;
        this._acceptInt = abstractDeserializer._acceptInt;
        this._acceptDouble = abstractDeserializer._acceptDouble;
        this._objectIdReader = objectIdReader;
        this._properties = map;
    }
}
