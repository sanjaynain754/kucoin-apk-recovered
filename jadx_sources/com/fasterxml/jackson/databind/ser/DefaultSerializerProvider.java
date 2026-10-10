package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.C6467e;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p528p7.InterfaceC43399e;
import p551q7.C43651a;
import p551q7.InterfaceC43653c;

/* JADX INFO: loaded from: classes45.dex */
public abstract class DefaultSerializerProvider extends AbstractC6446m implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient JsonGenerator _generator;
    protected transient ArrayList<ObjectIdGenerator<?>> _objectIdGenerators;
    protected transient Map<Object, C6467e> _seenObjectIds;

    public static final class Impl extends DefaultSerializerProvider {
        private static final long serialVersionUID = 1;

        public Impl() {
        }

        public Impl(Impl impl) {
            super(impl);
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public DefaultSerializerProvider copy() {
            return new Impl(this);
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public Impl createInstance(SerializationConfig serializationConfig, AbstractC6468j abstractC6468j) {
            return new Impl(this, serializationConfig, abstractC6468j);
        }

        public Impl(AbstractC6446m abstractC6446m, SerializationConfig serializationConfig, AbstractC6468j abstractC6468j) {
            super(abstractC6446m, serializationConfig, abstractC6468j);
        }
    }

    public DefaultSerializerProvider() {
    }

    public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationConfig, AbstractC6468j abstractC6468j);

    @Deprecated
    public C43651a generateJsonSchema(Class<?> cls) throws JsonMappingException {
        Object objFindValueSerializer = findValueSerializer(cls, (BeanProperty) null);
        AbstractC6391f schema = objFindValueSerializer instanceof InterfaceC43653c ? ((InterfaceC43653c) objFindValueSerializer).getSchema(this, null) : C43651a.m96066a();
        if (schema instanceof ObjectNode) {
            return new C43651a((ObjectNode) schema);
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " would not be serialized as a JSON object and therefore has no schema");
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        Class<?> cls = obj.getClass();
        AbstractC6393h<Object> abstractC6393hFindTypedValueSerializer = findTypedValueSerializer(cls, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                m11738c(jsonGenerator, obj, abstractC6393hFindTypedValueSerializer, this._config.findRootName(cls));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            m11738c(jsonGenerator, obj, abstractC6393hFindTypedValueSerializer, fullRootName);
            return;
        }
        m11737b(jsonGenerator, obj, abstractC6393hFindTypedValueSerializer);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6446m
    public AbstractC6393h<Object> serializerInstance(AbstractC6404a abstractC6404a, Object obj) throws JsonMappingException {
        AbstractC6393h<?> abstractC6393h;
        if (obj == null) {
            return null;
        }
        if (obj instanceof AbstractC6393h) {
            abstractC6393h = (AbstractC6393h) obj;
        } else {
            if (!(obj instanceof Class)) {
                reportBadDefinition(abstractC6404a.getType(), "AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == AbstractC6393h.a.class || C6490g.m11907J(cls)) {
                return null;
            }
            if (!AbstractC6393h.class.isAssignableFrom(cls)) {
                reportBadDefinition(abstractC6404a.getType(), "AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
            }
            this._config.getHandlerInstantiator();
            abstractC6393h = (AbstractC6393h) C6490g.m11946l(cls, this._config.canOverrideAccessModifiers());
        }
        return _handleResolvable(abstractC6393h);
    }

    public DefaultSerializerProvider(AbstractC6446m abstractC6446m, SerializationConfig serializationConfig, AbstractC6468j abstractC6468j) {
        super(abstractC6446m, serializationConfig, abstractC6468j);
    }

    public Map<Object, C6467e> _createObjectIdMap() {
        return isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
    }

    public void acceptJsonFormatVisitor(JavaType javaType, InterfaceC43399e interfaceC43399e) throws JsonMappingException {
        if (javaType == null) {
            throw new IllegalArgumentException("A class must be provided");
        }
        interfaceC43399e.mo95576h(this);
        findValueSerializer(javaType, (BeanProperty) null).acceptJsonFormatVisitor(interfaceC43399e, javaType);
    }

    public int cachedSerializersCount() {
        return this._serializerCache.m11784h();
    }

    public DefaultSerializerProvider copy() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    /* JADX INFO: renamed from: d */
    public final IOException m11739d(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strM11952o = C6490g.m11952o(exc);
        if (strM11952o == null) {
            strM11952o = "[no message for " + exc.getClass().getName() + "]";
        }
        return new JsonMappingException(jsonGenerator, strM11952o, exc);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // com.fasterxml.jackson.databind.AbstractC6446m
    public C6467e findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator) {
        ObjectIdGenerator<?> objectIdGeneratorNewForSerialization;
        Map<Object, C6467e> map = this._seenObjectIds;
        if (map == null) {
            this._seenObjectIds = _createObjectIdMap();
        } else {
            C6467e c6467e = map.get(obj);
            if (c6467e != null) {
                return c6467e;
            }
        }
        ArrayList<ObjectIdGenerator<?>> arrayList = this._objectIdGenerators;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    objectIdGeneratorNewForSerialization = this._objectIdGenerators.get(i11);
                    if (objectIdGeneratorNewForSerialization.canUseFor(objectIdGenerator)) {
                        break;
                    }
                    i11++;
                }
            }
            if (objectIdGeneratorNewForSerialization == null) {
                objectIdGeneratorNewForSerialization = objectIdGenerator.newForSerialization(this);
                this._objectIdGenerators.add(objectIdGeneratorNewForSerialization);
            }
            C6467e c6467e2 = new C6467e(objectIdGeneratorNewForSerialization);
            this._seenObjectIds.put(obj, c6467e2);
            return c6467e2;
        }
        this._objectIdGenerators = new ArrayList<>(8);
        objectIdGeneratorNewForSerialization = null;
        if (objectIdGeneratorNewForSerialization == null) {
            objectIdGeneratorNewForSerialization = objectIdGenerator.newForSerialization(this);
            this._objectIdGenerators.add(objectIdGeneratorNewForSerialization);
        }
        C6467e c6467e3 = new C6467e(objectIdGeneratorNewForSerialization);
        this._seenObjectIds.put(obj, c6467e3);
        return c6467e3;
    }

    public void flushCachedSerializers() {
        this._serializerCache.m11782f();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6446m
    public JsonGenerator getGenerator() {
        return this._generator;
    }

    public boolean hasSerializerFor(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        if (cls == Object.class && !this._config.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            return true;
        }
        try {
            return _findExplicitUntypedSerializer(cls) != null;
        } catch (JsonMappingException e11) {
            if (atomicReference != null) {
                atomicReference.set(e11);
            }
            return false;
        } catch (RuntimeException e12) {
            if (atomicReference == null) {
                throw e12;
            }
            atomicReference.set(e12);
            return false;
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6446m
    public Object includeFilterInstance(AbstractC6414k abstractC6414k, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        this._config.getHandlerInstantiator();
        return C6490g.m11946l(cls, this._config.canOverrideAccessModifiers());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6446m
    public boolean includeFilterSuppressNulls(Object obj) throws JsonMappingException {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Throwable th2) {
            reportBadDefinition(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", obj.getClass().getName(), th2.getClass().getName(), C6490g.m11952o(th2)), th2);
            return false;
        }
    }

    public void serializePolymorphic(JsonGenerator jsonGenerator, Object obj, JavaType javaType, AbstractC6393h<Object> abstractC6393h, AbstractC6431e abstractC6431e) throws IOException {
        boolean zIsEnabled;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (abstractC6393h == null) {
            abstractC6393h = (javaType == null || !javaType.isContainerType()) ? findValueSerializer(obj.getClass(), (BeanProperty) null) : findValueSerializer(javaType, (BeanProperty) null);
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            zIsEnabled = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (zIsEnabled) {
                jsonGenerator.mo10850y0();
                jsonGenerator.mo10808Z(this._config.findRootName(obj.getClass()).simpleAsEncoded(this._config));
            }
        } else if (fullRootName.isEmpty()) {
            zIsEnabled = false;
        } else {
            jsonGenerator.mo10850y0();
            jsonGenerator.mo10810a0(fullRootName.getSimpleName());
            zIsEnabled = true;
        }
        try {
            abstractC6393h.serializeWithType(obj, jsonGenerator, this, abstractC6431e);
            if (zIsEnabled) {
                jsonGenerator.mo10806X();
            }
        } catch (Exception e11) {
            throw m11739d(jsonGenerator, e11);
        }
    }

    public DefaultSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        super(defaultSerializerProvider);
    }

    public void _serializeNull(JsonGenerator jsonGenerator) throws IOException {
        try {
            getDefaultNullValueSerializer().serialize(null, jsonGenerator, this);
        } catch (Exception e11) {
            throw m11739d(jsonGenerator, e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11737b(JsonGenerator jsonGenerator, Object obj, AbstractC6393h<Object> abstractC6393h) throws IOException {
        try {
            abstractC6393h.serialize(obj, jsonGenerator, this);
        } catch (Exception e11) {
            throw m11739d(jsonGenerator, e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11738c(JsonGenerator jsonGenerator, Object obj, AbstractC6393h<Object> abstractC6393h, PropertyName propertyName) throws IOException {
        try {
            jsonGenerator.mo10850y0();
            jsonGenerator.mo10808Z(propertyName.simpleAsEncoded(this._config));
            abstractC6393h.serialize(obj, jsonGenerator, this);
            jsonGenerator.mo10806X();
        } catch (Exception e11) {
            throw m11739d(jsonGenerator, e11);
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (!javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        AbstractC6393h<Object> abstractC6393hFindTypedValueSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                m11738c(jsonGenerator, obj, abstractC6393hFindTypedValueSerializer, this._config.findRootName(javaType));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            m11738c(jsonGenerator, obj, abstractC6393hFindTypedValueSerializer, fullRootName);
            return;
        }
        m11737b(jsonGenerator, obj, abstractC6393hFindTypedValueSerializer);
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType, AbstractC6393h<Object> abstractC6393h) throws IOException {
        PropertyName propertyNameFindRootName;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (abstractC6393h == null) {
            abstractC6393h = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                if (javaType == null) {
                    propertyNameFindRootName = this._config.findRootName(obj.getClass());
                } else {
                    propertyNameFindRootName = this._config.findRootName(javaType);
                }
                m11738c(jsonGenerator, obj, abstractC6393h, propertyNameFindRootName);
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            m11738c(jsonGenerator, obj, abstractC6393h, fullRootName);
            return;
        }
        m11737b(jsonGenerator, obj, abstractC6393h);
    }
}
