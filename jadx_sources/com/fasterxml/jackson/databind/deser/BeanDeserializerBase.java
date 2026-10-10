package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.InterfaceC6269a0;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.C6369d;
import com.fasterxml.jackson.databind.deser.impl.C6373h;
import com.fasterxml.jackson.databind.deser.impl.C6374i;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.C6419p;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6499p;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements InterfaceC6358c, InterfaceC6376k, Serializable {
    protected static final PropertyName TEMP_PROPERTY_NAME = new PropertyName("#temporary-name");
    private static final long serialVersionUID = 1;
    protected SettableAnyProperty _anySetter;
    protected AbstractC6390e<Object> _arrayDelegateDeserializer;
    protected final Map<String, SettableBeanProperty> _backRefs;
    protected final BeanPropertyMap _beanProperties;
    protected final JavaType _beanType;
    protected AbstractC6390e<Object> _delegateDeserializer;
    protected C6369d _externalTypeIdHandler;
    protected final Set<String> _ignorableProps;
    protected final boolean _ignoreAllUnknown;
    protected final Set<String> _includableProps;
    protected final ValueInjector[] _injectables;
    protected final boolean _needViewProcesing;
    protected boolean _nonStandardCreation;
    protected final ObjectIdReader _objectIdReader;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected final JsonFormat.Shape _serializationShape;
    protected transient HashMap<ClassKey, AbstractC6390e<Object>> _subDeserializers;
    protected C6374i _unwrappedPropertyHandler;
    protected final ValueInstantiator _valueInstantiator;
    protected boolean _vanillaProcessing;

    public BeanDeserializerBase(C6356a c6356a, AbstractC6340b abstractC6340b, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z11, Set<String> set2, boolean z12) {
        super(abstractC6340b.m11151A());
        this._beanType = abstractC6340b.m11151A();
        ValueInstantiator valueInstantiatorM11240v = c6356a.m11240v();
        this._valueInstantiator = valueInstantiatorM11240v;
        this._delegateDeserializer = null;
        this._arrayDelegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._beanProperties = beanPropertyMap;
        this._backRefs = map;
        this._ignorableProps = set;
        this._ignoreAllUnknown = z11;
        this._includableProps = set2;
        this._anySetter = c6356a.m11235q();
        List<ValueInjector> listM11237s = c6356a.m11237s();
        ValueInjector[] valueInjectorArr = (listM11237s == null || listM11237s.isEmpty()) ? null : (ValueInjector[]) listM11237s.toArray(new ValueInjector[listM11237s.size()]);
        this._injectables = valueInjectorArr;
        ObjectIdReader objectIdReaderM11238t = c6356a.m11238t();
        this._objectIdReader = objectIdReaderM11238t;
        this._nonStandardCreation = this._unwrappedPropertyHandler != null || valueInstantiatorM11240v.canCreateUsingDelegate() || valueInstantiatorM11240v.canCreateFromObjectWith() || !valueInstantiatorM11240v.canCreateUsingDefault();
        this._serializationShape = abstractC6340b.mo11161g(null).getShape();
        this._needViewProcesing = z12;
        this._vanillaProcessing = !this._nonStandardCreation && valueInjectorArr == null && !z12 && objectIdReaderM11238t == null;
    }

    public abstract Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public AbstractC6390e<Object> _findSubclassDeserializer(DeserializationContext deserializationContext, Object obj, C6499p c6499p) throws IOException {
        AbstractC6390e<Object> abstractC6390e;
        synchronized (this) {
            HashMap<ClassKey, AbstractC6390e<Object>> map = this._subDeserializers;
            abstractC6390e = map == null ? null : map.get(new ClassKey(obj.getClass()));
        }
        if (abstractC6390e != null) {
            return abstractC6390e;
        }
        AbstractC6390e<Object> abstractC6390eFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(deserializationContext.constructType(obj.getClass()));
        if (abstractC6390eFindRootValueDeserializer == null) {
            return abstractC6390eFindRootValueDeserializer;
        }
        synchronized (this) {
            try {
                if (this._subDeserializers == null) {
                    this._subDeserializers = new HashMap<>();
                }
                this._subDeserializers.put(new ClassKey(obj.getClass()), abstractC6390eFindRootValueDeserializer);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC6390eFindRootValueDeserializer;
    }

    public abstract BeanDeserializerBase asArrayDeserializer();

    public abstract Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public SettableBeanProperty findProperty(PropertyName propertyName) {
        return findProperty(propertyName.getSimpleName());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public abstract AbstractC6390e<Object> unwrappingDeserializer(NameTransformer nameTransformer);

    public abstract BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2);

    public abstract BeanDeserializerBase withIgnoreAllUnknown(boolean z11);

    public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader);

    public final AbstractC6390e<Object> _delegateDeserializer() {
        AbstractC6390e<Object> abstractC6390e = this._delegateDeserializer;
        return abstractC6390e == null ? this._arrayDelegateDeserializer : abstractC6390e;
    }

    public Object _handleTypedObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Object obj2) throws IOException {
        AbstractC6390e<Object> deserializer = this._objectIdReader.getDeserializer();
        if (deserializer.handledType() != obj2.getClass()) {
            obj2 = _convertObjectId(jsonParser, deserializationContext, obj2, deserializer);
        }
        ObjectIdReader objectIdReader = this._objectIdReader;
        deserializationContext.findObjectId(obj2, objectIdReader.generator, objectIdReader.resolver).m11374b(obj);
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        return settableBeanProperty != null ? settableBeanProperty.setAndReturn(obj, obj2) : obj;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC6390e<Object> m11207a(DeserializationContext deserializationContext, JavaType javaType, AnnotatedWithParams annotatedWithParams) throws JsonMappingException {
        BeanProperty.Std std = new BeanProperty.Std(TEMP_PROPERTY_NAME, javaType, null, annotatedWithParams, PropertyMetadata.STD_OPTIONAL);
        AbstractC6428b abstractC6428bFindTypeDeserializer = (AbstractC6428b) javaType.getTypeHandler();
        if (abstractC6428bFindTypeDeserializer == null) {
            abstractC6428bFindTypeDeserializer = deserializationContext.getConfig().findTypeDeserializer(javaType);
        }
        AbstractC6390e<?> abstractC6390e = (AbstractC6390e) javaType.getValueHandler();
        AbstractC6390e<?> abstractC6390eFindDeserializer = abstractC6390e == null ? findDeserializer(deserializationContext, javaType, std) : deserializationContext.handleSecondaryContextualization(abstractC6390e, std, javaType);
        return abstractC6428bFindTypeDeserializer != null ? new TypeWrappedDeserializer(abstractC6428bFindTypeDeserializer.forProperty(std), abstractC6390eFindDeserializer) : abstractC6390eFindDeserializer;
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m11208b(Throwable th2, DeserializationContext deserializationContext) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        C6490g.m11939h0(th2);
        boolean z11 = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z11 || !(th2 instanceof JacksonException)) {
                throw ((IOException) th2);
            }
        } else if (!z11) {
            C6490g.m11943j0(th2);
        }
        return th2;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        BeanPropertyMap beanPropertyMap;
        BeanPropertyMap beanPropertyMapWithCaseInsensitivity;
        C6419p c6419pFindObjectIdInfo;
        SettableBeanProperty settableBeanProperty;
        JavaType javaType;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        ObjectIdReader objectIdReaderConstruct = this._objectIdReader;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        JsonFormat.Shape shape = null;
        AnnotatedMember member = StdDeserializer._neitherNull(beanProperty, annotationIntrospector) ? beanProperty.getMember() : null;
        if (member != null && (c6419pFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) != null) {
            C6419p c6419pFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, c6419pFindObjectIdInfo);
            Class<? extends ObjectIdGenerator<?>> clsM11572c = c6419pFindObjectReferenceInfo.m11572c();
            InterfaceC6269a0 interfaceC6269a0ObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, c6419pFindObjectReferenceInfo);
            if (clsM11572c == ObjectIdGenerators$PropertyGenerator.class) {
                PropertyName propertyNameM11573d = c6419pFindObjectReferenceInfo.m11573d();
                SettableBeanProperty settableBeanPropertyFindProperty = findProperty(propertyNameM11573d);
                if (settableBeanPropertyFindProperty == null) {
                    return (AbstractC6390e) deserializationContext.reportBadDefinition(this._beanType, String.format("Invalid Object Id definition for %s: cannot find property with name %s", C6490g.m11921X(handledType()), C6490g.m11918U(propertyNameM11573d)));
                }
                JavaType type = settableBeanPropertyFindProperty.getType();
                settableBeanProperty = settableBeanPropertyFindProperty;
                objectIdGeneratorObjectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(c6419pFindObjectReferenceInfo.m11575f());
                javaType = type;
            } else {
                settableBeanProperty = null;
                javaType = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) clsM11572c), ObjectIdGenerator.class)[0];
                objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(member, c6419pFindObjectReferenceInfo);
            }
            objectIdReaderConstruct = ObjectIdReader.construct(javaType, c6419pFindObjectReferenceInfo.m11573d(), objectIdGeneratorObjectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, interfaceC6269a0ObjectIdResolverInstance);
        }
        BeanDeserializerBase beanDeserializerBaseWithObjectIdReader = (objectIdReaderConstruct == null || objectIdReaderConstruct == this._objectIdReader) ? this : withObjectIdReader(objectIdReaderConstruct);
        if (member != null) {
            beanDeserializerBaseWithObjectIdReader = _handleByNameInclusion(deserializationContext, annotationIntrospector, beanDeserializerBaseWithObjectIdReader, member);
        }
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            shape = valueFindFormatOverrides.hasShape() ? valueFindFormatOverrides.getShape() : null;
            Boolean feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            if (feature != null && (beanPropertyMapWithCaseInsensitivity = (beanPropertyMap = this._beanProperties).withCaseInsensitivity(feature.booleanValue())) != beanPropertyMap) {
                beanDeserializerBaseWithObjectIdReader = beanDeserializerBaseWithObjectIdReader.withBeanProperties(beanPropertyMapWithCaseInsensitivity);
            }
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        return shape == JsonFormat.Shape.ARRAY ? beanDeserializerBaseWithObjectIdReader.asArrayDeserializer() : beanDeserializerBaseWithObjectIdReader;
    }

    public Iterator<SettableBeanProperty> creatorProperties() {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        return propertyBasedCreator == null ? Collections.EMPTY_LIST.iterator() : propertyBasedCreator.m11301f().iterator();
    }

    public Object deserializeFromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        AbstractC6390e<Object> abstractC6390e_delegateDeserializer = _delegateDeserializer();
        if (abstractC6390e_delegateDeserializer == null || this._valueInstantiator.canCreateFromString()) {
            Object objMo10858J = jsonParser.mo10858J();
            return (objMo10858J == null || this._beanType.isTypeOrSuperTypeOf(objMo10858J.getClass())) ? objMo10858J : deserializationContext.handleWeirdNativeValue(this._beanType, objMo10858J, jsonParser);
        }
        Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e_delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate);
        }
        return objCreateUsingDelegate;
    }

    public Object deserializeFromNumber(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        AbstractC6390e<Object> abstractC6390e_delegateDeserializer = _delegateDeserializer();
        JsonParser.NumberType numberTypeMo10862P = jsonParser.mo10862P();
        if (numberTypeMo10862P == JsonParser.NumberType.INT) {
            if (abstractC6390e_delegateDeserializer == null || this._valueInstantiator.canCreateFromInt()) {
                return this._valueInstantiator.createFromInt(deserializationContext, jsonParser.mo10860M());
            }
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        if (numberTypeMo10862P == JsonParser.NumberType.LONG) {
            if (abstractC6390e_delegateDeserializer == null || this._valueInstantiator.canCreateFromInt()) {
                return this._valueInstantiator.createFromLong(deserializationContext, jsonParser.mo10861O());
            }
            Object objCreateUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate2);
            }
            return objCreateUsingDelegate2;
        }
        if (numberTypeMo10862P != JsonParser.NumberType.BIG_INTEGER) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.mo10863Q());
        }
        if (abstractC6390e_delegateDeserializer == null || this._valueInstantiator.canCreateFromBigInteger()) {
            return this._valueInstantiator.createFromBigInteger(deserializationContext, jsonParser.mo10895n());
        }
        Object objCreateUsingDelegate3 = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e_delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate3);
        }
        return objCreateUsingDelegate3;
    }

    public Object deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        C6373h c6373hFindObjectId = deserializationContext.findObjectId(objectReference, objectIdReader.generator, objectIdReader.resolver);
        Object objM11378f = c6373hFindObjectId.m11378f();
        if (objM11378f != null) {
            return objM11378f;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + objectReference + "] (for " + this._beanType + ").", jsonParser.mo10908v(), c6373hFindObjectId);
    }

    public Object deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        AbstractC6390e<Object> abstractC6390e_delegateDeserializer = _delegateDeserializer();
        if (abstractC6390e_delegateDeserializer == null || this._valueInstantiator.canCreateFromString()) {
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e_delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate);
        }
        return objCreateUsingDelegate;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        Object objMo10865S;
        if (this._objectIdReader != null) {
            if (jsonParser.mo10881g() && (objMo10865S = jsonParser.mo10865S()) != null) {
                return _handleTypedObjectId(jsonParser, deserializationContext, abstractC6428b.deserializeTypedFromObject(jsonParser, deserializationContext), objMo10865S);
            }
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k != null) {
                if (jsonTokenMo10889k.isScalarValue()) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
                if (jsonTokenMo10889k == JsonToken.START_OBJECT) {
                    jsonTokenMo10889k = jsonParser.mo10905t0();
                }
                if (jsonTokenMo10889k == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.mo10887j(), jsonParser)) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
            }
        }
        return abstractC6428b.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefs;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public SettableBeanProperty findProperty(String str) {
        PropertyBasedCreator propertyBasedCreator;
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        SettableBeanProperty settableBeanPropertyFind = beanPropertyMap == null ? null : beanPropertyMap.find(str);
        return (settableBeanPropertyFind != null || (propertyBasedCreator = this._propertyBasedCreator) == null) ? settableBeanPropertyFind : propertyBasedCreator.m11300e(str);
    }

    @Deprecated
    public final Class<?> getBeanClass() {
        return this._beanType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        try {
            return this._valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e11) {
            return C6490g.m11937g0(deserializationContext, e11);
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Collection<Object> getKnownPropertyNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<SettableBeanProperty> it = this._beanProperties.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.ALWAYS_NULL;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public int getPropertyCount() {
        return this._beanProperties.size();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._beanType;
    }

    public void handleIgnoredProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            throw IgnoredPropertyException.from(jsonParser, obj, str, getKnownPropertyNames());
        }
        jsonParser.mo10856C0();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (this._ignoreAllUnknown) {
            jsonParser.mo10856C0();
            return;
        }
        if (IgnorePropertiesUtil.m11868c(str, this._ignorableProps, this._includableProps)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
        }
        super.handleUnknownProperty(jsonParser, deserializationContext, obj, str);
    }

    public void handleUnknownVanilla(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (IgnorePropertiesUtil.m11868c(str, this._ignorableProps, this._includableProps)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty == null) {
            handleUnknownProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        try {
            settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, str);
        } catch (Exception e11) {
            wrapAndThrow(e11, obj, str, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Class<?> handledType() {
        return this._beanType.getRawClass();
    }

    public boolean hasProperty(String str) {
        return this._beanProperties.find(str) != null;
    }

    public boolean hasViews() {
        return this._needViewProcesing;
    }

    public void injectValues(DeserializationContext deserializationContext, Object obj) throws IOException {
        for (ValueInjector valueInjector : this._injectables) {
            valueInjector.inject(deserializationContext, obj);
        }
    }

    public boolean isCaseInsensitive() {
        return this._beanProperties.isCaseInsensitive();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.POJO;
    }

    public Iterator<SettableBeanProperty> properties() {
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        if (beanPropertyMap != null) {
            return beanPropertyMap.iterator();
        }
        throw new IllegalStateException("Can only call after BeanDeserializer has been resolved");
    }

    public void replaceProperty(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        this._beanProperties.replace(settableBeanProperty, settableBeanProperty2);
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6376k
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        SettableBeanProperty[] fromObjectArguments;
        AbstractC6390e<Object> valueDeserializer;
        AbstractC6390e<Object> abstractC6390eUnwrappingDeserializer;
        boolean z11 = false;
        C6369d.a aVarM11332d = null;
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            fromObjectArguments = this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            if (this._ignorableProps != null || this._includableProps != null) {
                int length = fromObjectArguments.length;
                for (int i11 = 0; i11 < length; i11++) {
                    if (IgnorePropertiesUtil.m11868c(fromObjectArguments[i11].getName(), this._ignorableProps, this._includableProps)) {
                        fromObjectArguments[i11].markAsIgnorable();
                    }
                }
            }
        } else {
            fromObjectArguments = null;
        }
        for (SettableBeanProperty settableBeanProperty : this._beanProperties) {
            if (!settableBeanProperty.hasValueDeserializer()) {
                AbstractC6390e<Object> abstractC6390eFindConvertingDeserializer = findConvertingDeserializer(deserializationContext, settableBeanProperty);
                if (abstractC6390eFindConvertingDeserializer == null) {
                    abstractC6390eFindConvertingDeserializer = deserializationContext.findNonContextualValueDeserializer(settableBeanProperty.getType());
                }
                _replaceProperty(this._beanProperties, fromObjectArguments, settableBeanProperty, settableBeanProperty.withValueDeserializer(abstractC6390eFindConvertingDeserializer));
            }
        }
        C6374i c6374i = null;
        for (SettableBeanProperty settableBeanProperty2 : this._beanProperties) {
            SettableBeanProperty settableBeanProperty_resolveManagedReferenceProperty = _resolveManagedReferenceProperty(deserializationContext, settableBeanProperty2.withValueDeserializer(deserializationContext.handlePrimaryContextualization(settableBeanProperty2.getValueDeserializer(), settableBeanProperty2, settableBeanProperty2.getType())));
            if (!(settableBeanProperty_resolveManagedReferenceProperty instanceof ManagedReferenceProperty)) {
                settableBeanProperty_resolveManagedReferenceProperty = _resolvedObjectIdProperty(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty);
            }
            NameTransformer nameTransformer_findPropertyUnwrapper = _findPropertyUnwrapper(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty);
            if (nameTransformer_findPropertyUnwrapper == null || (abstractC6390eUnwrappingDeserializer = (valueDeserializer = settableBeanProperty_resolveManagedReferenceProperty.getValueDeserializer()).unwrappingDeserializer(nameTransformer_findPropertyUnwrapper)) == valueDeserializer || abstractC6390eUnwrappingDeserializer == null) {
                SettableBeanProperty settableBeanProperty_resolveInnerClassValuedProperty = _resolveInnerClassValuedProperty(deserializationContext, _resolveMergeAndNullSettings(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty, settableBeanProperty_resolveManagedReferenceProperty.getMetadata()));
                if (settableBeanProperty_resolveInnerClassValuedProperty != settableBeanProperty2) {
                    _replaceProperty(this._beanProperties, fromObjectArguments, settableBeanProperty2, settableBeanProperty_resolveInnerClassValuedProperty);
                }
                if (settableBeanProperty_resolveInnerClassValuedProperty.hasValueTypeDeserializer()) {
                    AbstractC6428b valueTypeDeserializer = settableBeanProperty_resolveInnerClassValuedProperty.getValueTypeDeserializer();
                    if (valueTypeDeserializer.getTypeInclusion() == JsonTypeInfo.EnumC6265As.EXTERNAL_PROPERTY) {
                        if (aVarM11332d == null) {
                            aVarM11332d = C6369d.m11332d(this._beanType);
                        }
                        aVarM11332d.m11342b(settableBeanProperty_resolveInnerClassValuedProperty, valueTypeDeserializer);
                        this._beanProperties.remove(settableBeanProperty_resolveInnerClassValuedProperty);
                    }
                }
            } else {
                SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanProperty_resolveManagedReferenceProperty.withValueDeserializer(abstractC6390eUnwrappingDeserializer);
                if (c6374i == null) {
                    c6374i = new C6374i();
                }
                c6374i.m11384a(settableBeanPropertyWithValueDeserializer);
                this._beanProperties.remove(settableBeanPropertyWithValueDeserializer);
            }
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null && !settableAnyProperty.hasValueDeserializer()) {
            SettableAnyProperty settableAnyProperty2 = this._anySetter;
            this._anySetter = settableAnyProperty2.withValueDeserializer(findDeserializer(deserializationContext, settableAnyProperty2.getType(), this._anySetter.getProperty()));
        }
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._beanType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", C6490g.m11904G(javaType), C6490g.m11938h(this._valueInstantiator)));
            }
            this._delegateDeserializer = m11207a(deserializationContext, delegateType, this._valueInstantiator.getDelegateCreator());
        }
        if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._beanType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", C6490g.m11904G(javaType2), C6490g.m11938h(this._valueInstantiator)));
            }
            this._arrayDelegateDeserializer = m11207a(deserializationContext, arrayDelegateType, this._valueInstantiator.getArrayDelegateCreator());
        }
        if (fromObjectArguments != null) {
            this._propertyBasedCreator = PropertyBasedCreator.m11296b(deserializationContext, this._valueInstantiator, fromObjectArguments, this._beanProperties);
        }
        if (aVarM11332d != null) {
            this._externalTypeIdHandler = aVarM11332d.m11343c(this._beanProperties);
            this._nonStandardCreation = true;
        }
        this._unwrappedPropertyHandler = c6374i;
        if (c6374i != null) {
            this._nonStandardCreation = true;
        }
        if (this._vanillaProcessing && !this._nonStandardCreation) {
            z11 = true;
        }
        this._vanillaProcessing = z11;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        throw new UnsupportedOperationException("Class " + getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    @Deprecated
    public BeanDeserializerBase withIgnorableProperties(Set<String> set) {
        return withByNameInclusion(set, this._includableProps);
    }

    public Object wrapInstantiationProblem(Throwable th2, DeserializationContext deserializationContext) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        C6490g.m11939h0(th2);
        if (th2 instanceof IOException) {
            throw ((IOException) th2);
        }
        if (deserializationContext == null) {
            throw new IllegalArgumentException(th2.getMessage(), th2);
        }
        if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            C6490g.m11943j0(th2);
        }
        return deserializationContext.handleInstantiationProblem(this._beanType.getRawClass(), null, th2);
    }

    public Object _convertObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, AbstractC6390e<Object> abstractC6390e) throws IOException {
        C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        if (obj instanceof String) {
            c6499pBufferForInputBuffering.mo10787C0((String) obj);
        } else if (obj instanceof Long) {
            c6499pBufferForInputBuffering.mo10816f0(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            c6499pBufferForInputBuffering.mo10815e0(((Integer) obj).intValue());
        } else {
            c6499pBufferForInputBuffering.mo10826k0(obj);
        }
        JsonParser jsonParserM12013T0 = c6499pBufferForInputBuffering.m12013T0();
        jsonParserM12013T0.mo10905t0();
        return abstractC6390e.deserialize(jsonParserM12013T0, deserializationContext);
    }

    public NameTransformer _findPropertyUnwrapper(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        NameTransformer nameTransformerFindUnwrappingNameTransformer;
        AnnotatedMember member = settableBeanProperty.getMember();
        if (member != null && (nameTransformerFindUnwrappingNameTransformer = deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(member)) != null) {
            if (settableBeanProperty instanceof CreatorProperty) {
                deserializationContext.reportBadDefinition(getValueType(), String.format("Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported", settableBeanProperty.getName()));
            }
            return nameTransformerFindUnwrappingNameTransformer;
        }
        return null;
    }

    public BeanDeserializerBase _handleByNameInclusion(DeserializationContext deserializationContext, AnnotationIntrospector annotationIntrospector, BeanDeserializerBase beanDeserializerBase, AnnotatedMember annotatedMember) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JsonIgnoreProperties.Value valueFindPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, annotatedMember);
        if (valueFindPropertyIgnoralByName.getIgnoreUnknown() && !this._ignoreAllUnknown) {
            beanDeserializerBase = beanDeserializerBase.withIgnoreAllUnknown(true);
        }
        Set<String> setFindIgnoredForDeserialization = valueFindPropertyIgnoralByName.findIgnoredForDeserialization();
        Set<String> set = beanDeserializerBase._ignorableProps;
        if (setFindIgnoredForDeserialization.isEmpty()) {
            setFindIgnoredForDeserialization = set;
        } else if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            hashSet.addAll(setFindIgnoredForDeserialization);
            setFindIgnoredForDeserialization = hashSet;
        }
        Set<String> set2 = beanDeserializerBase._includableProps;
        Set<String> setM11867b = IgnorePropertiesUtil.m11867b(set2, annotationIntrospector.findPropertyInclusionByName(config, annotatedMember).getIncluded());
        if (setFindIgnoredForDeserialization == set && setM11867b == set2) {
            return beanDeserializerBase;
        }
        return beanDeserializerBase.withByNameInclusion(setFindIgnoredForDeserialization, setM11867b);
    }

    public void _replaceProperty(BeanPropertyMap beanPropertyMap, SettableBeanProperty[] settableBeanPropertyArr, SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        beanPropertyMap.replace(settableBeanProperty, settableBeanProperty2);
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (settableBeanPropertyArr[i11] == settableBeanProperty) {
                    settableBeanPropertyArr[i11] = settableBeanProperty2;
                    return;
                }
            }
        }
    }

    public SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        Class<?> rawClass;
        Class<?> clsM11902E;
        AbstractC6390e<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        if ((valueDeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase) valueDeserializer).getValueInstantiator().canCreateUsingDefault() && (clsM11902E = C6490g.m11902E((rawClass = settableBeanProperty.getType().getRawClass()))) != null && clsM11902E == this._beanType.getRawClass()) {
            for (Constructor<?> constructor : rawClass.getConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && clsM11902E.equals(parameterTypes[0])) {
                    if (deserializationContext.canOverrideAccessModifiers()) {
                        C6490g.m11936g(constructor, deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return new InnerClassProperty(settableBeanProperty, constructor);
                }
            }
        }
        return settableBeanProperty;
    }

    public SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        String managedReferenceName = settableBeanProperty.getManagedReferenceName();
        if (managedReferenceName == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty settableBeanPropertyFindBackReference = settableBeanProperty.getValueDeserializer().findBackReference(managedReferenceName);
        if (settableBeanPropertyFindBackReference == null) {
            return (SettableBeanProperty) deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference %s: no back reference property found from type %s", C6490g.m11919V(managedReferenceName), C6490g.m11904G(settableBeanProperty.getType())));
        }
        JavaType javaType = this._beanType;
        JavaType type = settableBeanPropertyFindBackReference.getType();
        boolean zIsContainerType = settableBeanProperty.getType().isContainerType();
        if (!type.getRawClass().isAssignableFrom(javaType.getRawClass())) {
            deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference %s: back reference type (%s) not compatible with managed type (%s)", C6490g.m11919V(managedReferenceName), C6490g.m11904G(type), javaType.getRawClass().getName()));
        }
        return new ManagedReferenceProperty(settableBeanProperty, managedReferenceName, settableBeanPropertyFindBackReference, zIsContainerType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r0.f10198b != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SettableBeanProperty _resolveMergeAndNullSettings(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) throws JsonMappingException {
        PropertyMetadata.C6338a mergeInfo = propertyMetadata.getMergeInfo();
        if (mergeInfo != null) {
            AbstractC6390e<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
            Boolean boolSupportsUpdate = valueDeserializer.supportsUpdate(deserializationContext.getConfig());
            if (boolSupportsUpdate != null) {
                if (!boolSupportsUpdate.booleanValue()) {
                    if (!mergeInfo.f10198b) {
                        deserializationContext.handleBadMerge(valueDeserializer);
                    }
                    return settableBeanProperty;
                }
                AnnotatedMember annotatedMember = mergeInfo.f10197a;
                annotatedMember.fixAccess(deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                if (!(settableBeanProperty instanceof SetterlessProperty)) {
                    settableBeanProperty = MergingSettableBeanProperty.construct(settableBeanProperty, annotatedMember);
                }
            }
        }
        InterfaceC6375j interfaceC6375jFindValueNullProvider = findValueNullProvider(deserializationContext, settableBeanProperty, propertyMetadata);
        if (interfaceC6375jFindValueNullProvider != null) {
            return settableBeanProperty.withNullProvider(interfaceC6375jFindValueNullProvider);
        }
        return settableBeanProperty;
    }

    public SettableBeanProperty _resolvedObjectIdProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        ObjectIdReader objectIdReader;
        C6419p objectIdInfo = settableBeanProperty.getObjectIdInfo();
        AbstractC6390e<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        if (valueDeserializer == null) {
            objectIdReader = null;
        } else {
            objectIdReader = valueDeserializer.getObjectIdReader();
        }
        if (objectIdInfo == null && objectIdReader == null) {
            return settableBeanProperty;
        }
        return new ObjectIdReferenceProperty(settableBeanProperty, objectIdInfo);
    }

    @Deprecated
    public Object deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeFromArray(jsonParser, deserializationContext);
    }

    public Object deserializeFromBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        boolean z11;
        AbstractC6390e<Object> abstractC6390e_delegateDeserializer = _delegateDeserializer();
        if (abstractC6390e_delegateDeserializer != null && !this._valueInstantiator.canCreateFromBoolean()) {
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        if (jsonParser.mo10889k() == JsonToken.VALUE_TRUE) {
            z11 = true;
        } else {
            z11 = false;
        }
        return this._valueInstantiator.createFromBoolean(deserializationContext, z11);
    }

    public Object deserializeFromDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser.NumberType numberTypeMo10862P = jsonParser.mo10862P();
        if (numberTypeMo10862P != JsonParser.NumberType.DOUBLE && numberTypeMo10862P != JsonParser.NumberType.FLOAT) {
            if (numberTypeMo10862P == JsonParser.NumberType.BIG_DECIMAL) {
                AbstractC6390e<Object> abstractC6390e_delegateDeserializer = _delegateDeserializer();
                if (abstractC6390e_delegateDeserializer != null && !this._valueInstantiator.canCreateFromBigDecimal()) {
                    Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e_delegateDeserializer.deserialize(jsonParser, deserializationContext));
                    if (this._injectables != null) {
                        injectValues(deserializationContext, objCreateUsingDelegate);
                    }
                    return objCreateUsingDelegate;
                }
                return this._valueInstantiator.createFromBigDecimal(deserializationContext, jsonParser.mo10855C());
            }
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.mo10863Q());
        }
        AbstractC6390e<Object> abstractC6390e_delegateDeserializer2 = _delegateDeserializer();
        if (abstractC6390e_delegateDeserializer2 != null && !this._valueInstantiator.canCreateFromDouble()) {
            Object objCreateUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e_delegateDeserializer2.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate2);
            }
            return objCreateUsingDelegate2;
        }
        return this._valueInstantiator.createFromDouble(deserializationContext, jsonParser.mo10857E());
    }

    public Object deserializeFromObjectUsingNonDefault(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        AbstractC6390e<Object> abstractC6390e_delegateDeserializer = _delegateDeserializer();
        if (abstractC6390e_delegateDeserializer != null) {
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        Class<?> rawClass = this._beanType.getRawClass();
        if (C6490g.m11914Q(rawClass)) {
            return deserializationContext.handleMissingInstantiator(rawClass, null, jsonParser, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]);
        }
        return deserializationContext.handleMissingInstantiator(rawClass, getValueInstantiator(), jsonParser, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
    }

    public Object deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    public AbstractC6390e<Object> findConvertingDeserializer(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        Object objFindDeserializationConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null && (objFindDeserializationConverter = annotationIntrospector.findDeserializationConverter(settableBeanProperty.getMember())) != null) {
            InterfaceC6491h<Object, Object> interfaceC6491hConverterInstance = deserializationContext.converterInstance(settableBeanProperty.getMember(), objFindDeserializationConverter);
            JavaType javaTypeMo11360a = interfaceC6491hConverterInstance.mo11360a(deserializationContext.getTypeFactory());
            return new StdDelegatingDeserializer(interfaceC6491hConverterInstance, javaTypeMo11360a, deserializationContext.findNonContextualValueDeserializer(javaTypeMo11360a));
        }
        return null;
    }

    public Object handlePolymorphic(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, C6499p c6499p) throws IOException {
        AbstractC6390e<Object> abstractC6390e_findSubclassDeserializer = _findSubclassDeserializer(deserializationContext, obj, c6499p);
        if (abstractC6390e_findSubclassDeserializer != null) {
            if (c6499p != null) {
                c6499p.mo10806X();
                JsonParser jsonParserM12013T0 = c6499p.m12013T0();
                jsonParserM12013T0.mo10905t0();
                obj = abstractC6390e_findSubclassDeserializer.deserialize(jsonParserM12013T0, deserializationContext, obj);
            }
            if (jsonParser != null) {
                return abstractC6390e_findSubclassDeserializer.deserialize(jsonParser, deserializationContext, obj);
            }
            return obj;
        }
        if (c6499p != null) {
            obj = handleUnknownProperties(deserializationContext, obj, c6499p);
        }
        if (jsonParser != null) {
            return deserialize(jsonParser, deserializationContext, obj);
        }
        return obj;
    }

    public Object handleUnknownProperties(DeserializationContext deserializationContext, Object obj, C6499p c6499p) throws IOException {
        c6499p.mo10806X();
        JsonParser jsonParserM12013T0 = c6499p.m12013T0();
        while (jsonParserM12013T0.mo10905t0() != JsonToken.END_OBJECT) {
            String strMo10887j = jsonParserM12013T0.mo10887j();
            jsonParserM12013T0.mo10905t0();
            handleUnknownProperty(jsonParserM12013T0, deserializationContext, obj, strMo10887j);
        }
        return obj;
    }

    public void wrapAndThrow(Throwable th2, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw JsonMappingException.wrapWithPath(m11208b(th2, deserializationContext), obj, str);
    }

    public SettableBeanProperty findProperty(int i11) {
        PropertyBasedCreator propertyBasedCreator;
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        SettableBeanProperty settableBeanPropertyFind = beanPropertyMap == null ? null : beanPropertyMap.find(i11);
        return (settableBeanPropertyFind != null || (propertyBasedCreator = this._propertyBasedCreator) == null) ? settableBeanPropertyFind : propertyBasedCreator.m11299d(i11);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase) {
        this(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z11) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanDeserializerBase._beanProperties;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = z11;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = nameTransformer != null || beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        C6374i c6374iM11386c = beanDeserializerBase._unwrappedPropertyHandler;
        if (nameTransformer != null) {
            c6374iM11386c = c6374iM11386c != null ? c6374iM11386c.m11386c(nameTransformer) : c6374iM11386c;
            this._beanProperties = beanDeserializerBase._beanProperties.renameAll(nameTransformer);
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties;
        }
        this._unwrappedPropertyHandler = c6374iM11386c;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._objectIdReader = objectIdReader;
        if (objectIdReader == null) {
            this._beanProperties = beanDeserializerBase._beanProperties;
            this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties.withProperty(new ObjectIdValueProperty(objectIdReader, PropertyMetadata.STD_REQUIRED));
            this._vanillaProcessing = false;
        }
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = set;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = set2;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._beanProperties = beanDeserializerBase._beanProperties.withoutProperties(set, set2);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanPropertyMap;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    @Deprecated
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        this(beanDeserializerBase, set, beanDeserializerBase._includableProps);
    }
}
