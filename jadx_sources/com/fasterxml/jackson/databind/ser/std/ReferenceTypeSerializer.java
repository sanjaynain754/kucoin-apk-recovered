package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.ser.impl.AbstractC6464b;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.C6485b;
import com.fasterxml.jackson.databind.util.C6487d;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements InterfaceC6455d {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected transient AbstractC6464b _dynamicSerializers;
    protected final BeanProperty _property;
    protected final JavaType _referredType;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected final NameTransformer _unwrapper;
    protected final AbstractC6393h<Object> _valueSerializer;
    protected final AbstractC6431e _valueTypeSerializer;

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h) {
        super(referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = abstractC6431e;
        this._valueSerializer = abstractC6393h;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._dynamicSerializers = AbstractC6464b.m11798c();
    }

    public abstract Object _getReferenced(T t11);

    public abstract Object _getReferencedIfPresent(T t11);

    public abstract boolean _isValuePresent(T t11);

    public abstract ReferenceTypeSerializer<T> withContentInclusion(Object obj, boolean z11);

    public abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, NameTransformer nameTransformer);

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer$a */
    public static /* synthetic */ class C6475a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10657a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f10657a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10657a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10657a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10657a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10657a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10657a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC6393h<Object> m11834a(AbstractC6446m abstractC6446m, Class<?> cls) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hMo11808k = this._dynamicSerializers.mo11808k(cls);
        if (abstractC6393hMo11808k != null) {
            return abstractC6393hMo11808k;
        }
        AbstractC6393h<Object> abstractC6393hFindPrimaryPropertySerializer = this._referredType.hasGenericTypes() ? abstractC6446m.findPrimaryPropertySerializer(abstractC6446m.constructSpecializedType(this._referredType, cls), this._property) : abstractC6446m.findPrimaryPropertySerializer(cls, this._property);
        NameTransformer nameTransformer = this._unwrapper;
        if (nameTransformer != null) {
            abstractC6393hFindPrimaryPropertySerializer = abstractC6393hFindPrimaryPropertySerializer.unwrappingSerializer(nameTransformer);
        }
        this._dynamicSerializers = this._dynamicSerializers.mo11807j(cls, abstractC6393hFindPrimaryPropertySerializer);
        return abstractC6393hFindPrimaryPropertySerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hM11835b = this._valueSerializer;
        if (abstractC6393hM11835b == null) {
            abstractC6393hM11835b = m11835b(interfaceC43399e.mo95575a(), this._referredType, this._property);
            NameTransformer nameTransformer = this._unwrapper;
            if (nameTransformer != null) {
                abstractC6393hM11835b = abstractC6393hM11835b.unwrappingSerializer(nameTransformer);
            }
        }
        abstractC6393hM11835b.acceptJsonFormatVisitor(interfaceC43399e, this._referredType);
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        JsonInclude.Value valueFindPropertyInclusion;
        JsonInclude.Include contentInclusion;
        Object objM11895b;
        AbstractC6431e abstractC6431eMo11689a = this._valueTypeSerializer;
        if (abstractC6431eMo11689a != null) {
            abstractC6431eMo11689a = abstractC6431eMo11689a.mo11689a(beanProperty);
        }
        AbstractC6393h<?> abstractC6393hFindAnnotatedContentSerializer = findAnnotatedContentSerializer(abstractC6446m, beanProperty);
        if (abstractC6393hFindAnnotatedContentSerializer == null) {
            abstractC6393hFindAnnotatedContentSerializer = this._valueSerializer;
            if (abstractC6393hFindAnnotatedContentSerializer != null) {
                abstractC6393hFindAnnotatedContentSerializer = abstractC6446m.handlePrimaryContextualization(abstractC6393hFindAnnotatedContentSerializer, beanProperty);
            } else if (_useStatic(abstractC6446m, beanProperty, this._referredType)) {
                abstractC6393hFindAnnotatedContentSerializer = m11835b(abstractC6446m, this._referredType, beanProperty);
            }
        }
        ReferenceTypeSerializer<T> referenceTypeSerializerWithResolved = (this._property == beanProperty && this._valueTypeSerializer == abstractC6431eMo11689a && this._valueSerializer == abstractC6393hFindAnnotatedContentSerializer) ? this : withResolved(beanProperty, abstractC6431eMo11689a, abstractC6393hFindAnnotatedContentSerializer, this._unwrapper);
        if (beanProperty != null && (valueFindPropertyInclusion = beanProperty.findPropertyInclusion(abstractC6446m.getConfig(), handledType())) != null && (contentInclusion = valueFindPropertyInclusion.getContentInclusion()) != JsonInclude.Include.USE_DEFAULTS) {
            int i11 = C6475a.f10657a[contentInclusion.ordinal()];
            boolean zIncludeFilterSuppressNulls = true;
            if (i11 != 1) {
                objM11895b = null;
                if (i11 != 2) {
                    if (i11 == 3) {
                        objM11895b = MARKER_FOR_EMPTY;
                    } else if (i11 == 4) {
                        objM11895b = abstractC6446m.includeFilterInstance(null, valueFindPropertyInclusion.getContentFilter());
                        if (objM11895b != null) {
                            zIncludeFilterSuppressNulls = abstractC6446m.includeFilterSuppressNulls(objM11895b);
                        }
                    } else if (i11 != 5) {
                        zIncludeFilterSuppressNulls = false;
                    }
                } else if (this._referredType.isReferenceType()) {
                    objM11895b = MARKER_FOR_EMPTY;
                }
            } else {
                objM11895b = C6487d.m11895b(this._referredType);
                if (objM11895b != null && objM11895b.getClass().isArray()) {
                    objM11895b = C6485b.m11877b(objM11895b);
                }
            }
            if (this._suppressableValue != objM11895b || this._suppressNulls != zIncludeFilterSuppressNulls) {
                return referenceTypeSerializerWithResolved.withContentInclusion(objM11895b, zIncludeFilterSuppressNulls);
            }
        }
        return referenceTypeSerializerWithResolved;
    }

    public JavaType getReferredType() {
        return this._referredType;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isUnwrappingSerializer() {
        return this._unwrapper != null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public AbstractC6393h<T> unwrappingSerializer(NameTransformer nameTransformer) {
        AbstractC6393h<?> abstractC6393hUnwrappingSerializer = this._valueSerializer;
        if (abstractC6393hUnwrappingSerializer == null || (abstractC6393hUnwrappingSerializer = abstractC6393hUnwrappingSerializer.unwrappingSerializer(nameTransformer)) != this._valueSerializer) {
            NameTransformer nameTransformer2 = this._unwrapper;
            if (nameTransformer2 != null) {
                nameTransformer = NameTransformer.chainedTransformer(nameTransformer, nameTransformer2);
            }
            if (this._valueSerializer != abstractC6393hUnwrappingSerializer || this._unwrapper != nameTransformer) {
                return withResolved(this._property, this._valueTypeSerializer, abstractC6393hUnwrappingSerializer, nameTransformer);
            }
        }
        return this;
    }

    public boolean _useStatic(AbstractC6446m abstractC6446m, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = abstractC6446m.getAnnotationIntrospector();
        if (annotationIntrospector != null && beanProperty != null && beanProperty.getMember() != null) {
            JsonSerialize.Typing typingFindSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (typingFindSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (typingFindSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return abstractC6446m.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC6393h<Object> m11835b(AbstractC6446m abstractC6446m, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return abstractC6446m.findPrimaryPropertySerializer(javaType, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, T t11) {
        if (!_isValuePresent(t11)) {
            return true;
        }
        Object obj_getReferenced = _getReferenced(t11);
        if (obj_getReferenced == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        AbstractC6393h<Object> abstractC6393hM11834a = this._valueSerializer;
        if (abstractC6393hM11834a == null) {
            try {
                abstractC6393hM11834a = m11834a(abstractC6446m, obj_getReferenced.getClass());
            } catch (JsonMappingException e11) {
                throw new RuntimeJsonMappingException(e11);
            }
        }
        Object obj = this._suppressableValue;
        if (obj == MARKER_FOR_EMPTY) {
            return abstractC6393hM11834a.isEmpty(abstractC6446m, obj_getReferenced);
        }
        return obj.equals(obj_getReferenced);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t11);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                abstractC6446m.defaultSerializeNull(jsonGenerator);
                return;
            }
            return;
        }
        AbstractC6393h<Object> abstractC6393hM11834a = this._valueSerializer;
        if (abstractC6393hM11834a == null) {
            abstractC6393hM11834a = m11834a(abstractC6446m, obj_getReferencedIfPresent.getClass());
        }
        AbstractC6431e abstractC6431e = this._valueTypeSerializer;
        if (abstractC6431e != null) {
            abstractC6393hM11834a.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, abstractC6446m, abstractC6431e);
        } else {
            abstractC6393hM11834a.serialize(obj_getReferencedIfPresent, jsonGenerator, abstractC6446m);
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t11);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                abstractC6446m.defaultSerializeNull(jsonGenerator);
            }
        } else {
            AbstractC6393h<Object> abstractC6393hM11834a = this._valueSerializer;
            if (abstractC6393hM11834a == null) {
                abstractC6393hM11834a = m11834a(abstractC6446m, obj_getReferencedIfPresent.getClass());
            }
            abstractC6393hM11834a.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, abstractC6446m, abstractC6431e);
        }
    }

    public ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, NameTransformer nameTransformer, Object obj, boolean z11) {
        super(referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = AbstractC6464b.m11798c();
        this._property = beanProperty;
        this._valueTypeSerializer = abstractC6431e;
        this._valueSerializer = abstractC6393h;
        this._unwrapper = nameTransformer;
        this._suppressableValue = obj;
        this._suppressNulls = z11;
    }
}
