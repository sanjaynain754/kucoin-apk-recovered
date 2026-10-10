package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.InterfaceC6269a0;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6348d;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.C6373h;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public abstract class DefaultDeserializationContext extends DeserializationContext implements Serializable {
    private static final long serialVersionUID = 1;
    private List<InterfaceC6269a0> _objectIdResolvers;
    protected transient LinkedHashMap<ObjectIdGenerator.IdKey, C6373h> _objectIds;

    public static final class Impl extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1;

        public Impl(AbstractC6362g abstractC6362g) {
            super(abstractC6362g, (DeserializerCache) null);
        }

        public Impl(Impl impl, DeserializationConfig deserializationConfig, JsonParser jsonParser, AbstractC6348d abstractC6348d) {
            super(impl, deserializationConfig, jsonParser, abstractC6348d);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext copy() {
            C6490g.m11951n0(Impl.class, this, "copy");
            return new Impl(this);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext createDummyInstance(DeserializationConfig deserializationConfig) {
            return new Impl(this, deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, AbstractC6348d abstractC6348d) {
            return new Impl(this, deserializationConfig, jsonParser, abstractC6348d);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext with(AbstractC6362g abstractC6362g) {
            return new Impl(this, abstractC6362g);
        }

        public Impl(Impl impl) {
            super(impl);
        }

        public Impl(Impl impl, AbstractC6362g abstractC6362g) {
            super(impl, abstractC6362g);
        }

        public Impl(Impl impl, DeserializationConfig deserializationConfig) {
            super(impl, deserializationConfig);
        }
    }

    public DefaultDeserializationContext(AbstractC6362g abstractC6362g, DeserializerCache deserializerCache) {
        super(abstractC6362g, deserializerCache);
    }

    public abstract DefaultDeserializationContext createDummyInstance(DeserializationConfig deserializationConfig);

    public abstract DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, AbstractC6348d abstractC6348d);

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public AbstractC6390e<Object> deserializerInstance(AbstractC6404a abstractC6404a, Object obj) throws JsonMappingException {
        AbstractC6390e<Object> abstractC6390e;
        if (obj == null) {
            return null;
        }
        if (obj instanceof AbstractC6390e) {
            abstractC6390e = (AbstractC6390e) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == AbstractC6390e.a.class || C6490g.m11907J(cls)) {
                return null;
            }
            if (!AbstractC6390e.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonDeserializer>");
            }
            this._config.getHandlerInstantiator();
            abstractC6390e = (AbstractC6390e) C6490g.m11946l(cls, this._config.canOverrideAccessModifiers());
        }
        if (abstractC6390e instanceof InterfaceC6376k) {
            ((InterfaceC6376k) abstractC6390e).resolve(this);
        }
        return abstractC6390e;
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public C6373h findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, InterfaceC6269a0 interfaceC6269a0) {
        InterfaceC6269a0 interfaceC6269a0Mo10780c = null;
        if (obj == null) {
            return null;
        }
        ObjectIdGenerator.IdKey idKeyKey = objectIdGenerator.key(obj);
        LinkedHashMap<ObjectIdGenerator.IdKey, C6373h> linkedHashMap = this._objectIds;
        if (linkedHashMap == null) {
            this._objectIds = new LinkedHashMap<>();
        } else {
            C6373h c6373h = linkedHashMap.get(idKeyKey);
            if (c6373h != null) {
                return c6373h;
            }
        }
        List<InterfaceC6269a0> list = this._objectIdResolvers;
        if (list != null) {
            for (InterfaceC6269a0 interfaceC6269a1 : list) {
                if (interfaceC6269a1.mo10781d(interfaceC6269a0)) {
                    interfaceC6269a0Mo10780c = interfaceC6269a1;
                    break;
                }
            }
        } else {
            this._objectIdResolvers = new ArrayList(8);
        }
        if (interfaceC6269a0Mo10780c == null) {
            interfaceC6269a0Mo10780c = interfaceC6269a0.mo10780c(this);
            this._objectIdResolvers.add(interfaceC6269a0Mo10780c);
        }
        C6373h c6373hCreateReadableObjectId = createReadableObjectId(idKeyKey);
        c6373hCreateReadableObjectId.m11379g(interfaceC6269a0Mo10780c);
        this._objectIds.put(idKeyKey, c6373hCreateReadableObjectId);
        return c6373hCreateReadableObjectId;
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public final AbstractC6394i keyDeserializerInstance(AbstractC6404a abstractC6404a, Object obj) throws JsonMappingException {
        AbstractC6394i abstractC6394i;
        if (obj == null) {
            return null;
        }
        if (obj instanceof AbstractC6394i) {
            abstractC6394i = (AbstractC6394i) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == AbstractC6394i.a.class || C6490g.m11907J(cls)) {
                return null;
            }
            if (!AbstractC6394i.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<KeyDeserializer>");
            }
            this._config.getHandlerInstantiator();
            abstractC6394i = (AbstractC6394i) C6490g.m11946l(cls, this._config.canOverrideAccessModifiers());
        }
        if (abstractC6394i instanceof InterfaceC6376k) {
            ((InterfaceC6376k) abstractC6394i).resolve(this);
        }
        return abstractC6394i;
    }

    public abstract DefaultDeserializationContext with(AbstractC6362g abstractC6362g);

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, AbstractC6348d abstractC6348d) {
        super(defaultDeserializationContext, deserializationConfig, jsonParser, abstractC6348d);
    }

    public Object _unwrapAndDeserialize(JsonParser jsonParser, JavaType javaType, AbstractC6390e<Object> abstractC6390e, Object obj) throws IOException {
        String simpleName = this._config.findRootName(javaType).getSimpleName();
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (jsonTokenMo10889k != jsonToken) {
            reportWrongTokenException(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", C6490g.m11919V(simpleName), jsonParser.mo10889k());
        }
        JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonTokenMo10905t0 != jsonToken2) {
            reportWrongTokenException(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name %s), but %s", C6490g.m11919V(simpleName), jsonParser.mo10889k());
        }
        String strMo10887j = jsonParser.mo10887j();
        if (!simpleName.equals(strMo10887j)) {
            reportPropertyInputMismatch(javaType, strMo10887j, "Root name (%s) does not match expected (%s) for type %s", C6490g.m11919V(strMo10887j), C6490g.m11919V(simpleName), C6490g.m11904G(javaType));
        }
        jsonParser.mo10905t0();
        Object objDeserialize = obj == null ? abstractC6390e.deserialize(jsonParser, this) : abstractC6390e.deserialize(jsonParser, this, obj);
        JsonToken jsonTokenMo10905t1 = jsonParser.mo10905t0();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenMo10905t1 != jsonToken3) {
            reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", C6490g.m11919V(simpleName), jsonParser.mo10889k());
        }
        return objDeserialize;
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public void checkUnresolvedObjectId() throws UnresolvedForwardReference {
        if (this._objectIds != null && isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            Iterator<Map.Entry<ObjectIdGenerator.IdKey, C6373h>> it = this._objectIds.entrySet().iterator();
            UnresolvedForwardReference unresolvedForwardReferenceWithStackTrace = null;
            while (it.hasNext()) {
                C6373h value = it.next().getValue();
                if (value.m11376d() && !tryToResolveUnresolvedObjectId(value)) {
                    if (unresolvedForwardReferenceWithStackTrace == null) {
                        unresolvedForwardReferenceWithStackTrace = new UnresolvedForwardReference(getParser(), "Unresolved forward references for: ").withStackTrace();
                    }
                    Object obj = value.m11375c().key;
                    Iterator<C6373h.a> itM11377e = value.m11377e();
                    while (itM11377e.hasNext()) {
                        C6373h.a next = itM11377e.next();
                        unresolvedForwardReferenceWithStackTrace.addUnresolvedId(obj, next.m11381a(), next.m11382b());
                    }
                }
            }
            if (unresolvedForwardReferenceWithStackTrace != null) {
                throw unresolvedForwardReferenceWithStackTrace;
            }
        }
    }

    public DefaultDeserializationContext copy() {
        throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
    }

    public C6373h createReadableObjectId(ObjectIdGenerator.IdKey idKey) {
        return new C6373h(idKey);
    }

    public Object readRootValue(JsonParser jsonParser, JavaType javaType, AbstractC6390e<Object> abstractC6390e, Object obj) throws IOException {
        if (this._config.useRootWrapping()) {
            return _unwrapAndDeserialize(jsonParser, javaType, abstractC6390e, obj);
        }
        return obj == null ? abstractC6390e.deserialize(jsonParser, this) : abstractC6390e.deserialize(jsonParser, this, obj);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig) {
        super(defaultDeserializationContext, deserializationConfig);
    }

    public boolean tryToResolveUnresolvedObjectId(C6373h c6373h) {
        return c6373h.m11380h(this);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, AbstractC6362g abstractC6362g) {
        super(defaultDeserializationContext, abstractC6362g);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext) {
        super(defaultDeserializationContext);
    }
}
