package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.C6373h;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public class SettableAnyProperty implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC6394i _keyDeserializer;
    protected final BeanProperty _property;
    protected final AnnotatedMember _setter;
    final boolean _setterIsField;
    protected final JavaType _type;
    protected AbstractC6390e<Object> _valueDeserializer;
    protected final AbstractC6428b _valueTypeDeserializer;

    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, AbstractC6394i abstractC6394i, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b) {
        this._property = beanProperty;
        this._setter = annotatedMember;
        this._type = javaType;
        this._valueDeserializer = abstractC6390e;
        this._valueTypeDeserializer = abstractC6428b;
        this._keyDeserializer = abstractC6394i;
        this._setterIsField = annotatedMember instanceof AnnotatedField;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.SettableAnyProperty$a */
    public static class C6355a extends C6373h.a {

        /* JADX INFO: renamed from: c */
        public final SettableAnyProperty f10243c;

        /* JADX INFO: renamed from: d */
        public final Object f10244d;

        /* JADX INFO: renamed from: e */
        public final String f10245e;

        public C6355a(SettableAnyProperty settableAnyProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj, String str) {
            super(unresolvedForwardReference, cls);
            this.f10243c = settableAnyProperty;
            this.f10244d = obj;
            this.f10245e = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.C6373h.a
        /* JADX INFO: renamed from: c */
        public void mo11205c(Object obj, Object obj2) throws IOException {
            if (m11383d(obj)) {
                this.f10243c.set(this.f10244d, this.f10245e, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
        }
    }

    public void _throwAsIOE(Exception exc, Object obj, Object obj2) throws IOException {
        if (!(exc instanceof IllegalArgumentException)) {
            C6490g.m11941i0(exc);
            C6490g.m11943j0(exc);
            Throwable thM11903F = C6490g.m11903F(exc);
            throw new JsonMappingException((Closeable) null, C6490g.m11952o(thM11903F), thM11903F);
        }
        String strM11938h = C6490g.m11938h(obj2);
        StringBuilder sb2 = new StringBuilder("Problem deserializing \"any\" property '");
        sb2.append(obj);
        sb2.append("' of class " + m11216a() + " (expected type: ");
        sb2.append(this._type);
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
        throw new JsonMappingException((Closeable) null, sb2.toString(), exc);
    }

    /* JADX INFO: renamed from: a */
    public final String m11216a() {
        return this._setter.getDeclaringClass().getName();
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo10890k0(JsonToken.VALUE_NULL)) {
            return this._valueDeserializer.getNullValue(deserializationContext);
        }
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        return abstractC6428b != null ? this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b) : this._valueDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        try {
            AbstractC6394i abstractC6394i = this._keyDeserializer;
            set(obj, abstractC6394i == null ? str : abstractC6394i.deserializeKey(str, deserializationContext), deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e11) {
            if (this._valueDeserializer.getObjectIdReader() == null) {
                throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info.", e11);
            }
            e11.getRoid().m11373a(new C6355a(this, e11, this._type.getRawClass(), obj, str));
        }
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._setter.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public BeanProperty getProperty() {
        return this._property;
    }

    public JavaType getType() {
        return this._type;
    }

    public boolean hasValueDeserializer() {
        return this._valueDeserializer != null;
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this._setter;
        if (annotatedMember == null || annotatedMember.getAnnotated() == null) {
            throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
        }
        return this;
    }

    public void set(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            if (!this._setterIsField) {
                ((AnnotatedMethod) this._setter).callOnWith(obj, obj2, obj3);
                return;
            }
            Map map = (Map) ((AnnotatedField) this._setter).getValue(obj);
            if (map != null) {
                map.put(obj2, obj3);
            }
        } catch (Exception e11) {
            _throwAsIOE(e11, obj2, obj3);
        }
    }

    public String toString() {
        return "[any property on class " + m11216a() + "]";
    }

    public SettableAnyProperty withValueDeserializer(AbstractC6390e<Object> abstractC6390e) {
        return new SettableAnyProperty(this._property, this._setter, this._type, this._keyDeserializer, abstractC6390e, this._valueTypeDeserializer);
    }

    @Deprecated
    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b) {
        this(beanProperty, annotatedMember, javaType, null, abstractC6390e, abstractC6428b);
    }
}
