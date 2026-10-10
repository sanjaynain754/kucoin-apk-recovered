package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.InterfaceC6268a;
import com.fasterxml.jackson.annotation.InterfaceC6270b;
import com.fasterxml.jackson.annotation.InterfaceC6272c;
import com.fasterxml.jackson.annotation.InterfaceC6273d;
import com.fasterxml.jackson.annotation.InterfaceC6274e;
import com.fasterxml.jackson.annotation.InterfaceC6275f;
import com.fasterxml.jackson.annotation.InterfaceC6276g;
import com.fasterxml.jackson.annotation.InterfaceC6277h;
import com.fasterxml.jackson.annotation.InterfaceC6278i;
import com.fasterxml.jackson.annotation.InterfaceC6279j;
import com.fasterxml.jackson.annotation.InterfaceC6280k;
import com.fasterxml.jackson.annotation.InterfaceC6281l;
import com.fasterxml.jackson.annotation.InterfaceC6282m;
import com.fasterxml.jackson.annotation.InterfaceC6283n;
import com.fasterxml.jackson.annotation.InterfaceC6284o;
import com.fasterxml.jackson.annotation.InterfaceC6285p;
import com.fasterxml.jackson.annotation.InterfaceC6286q;
import com.fasterxml.jackson.annotation.InterfaceC6287r;
import com.fasterxml.jackson.annotation.InterfaceC6288s;
import com.fasterxml.jackson.annotation.InterfaceC6289t;
import com.fasterxml.jackson.annotation.InterfaceC6290u;
import com.fasterxml.jackson.annotation.InterfaceC6291v;
import com.fasterxml.jackson.annotation.InterfaceC6292w;
import com.fasterxml.jackson.annotation.InterfaceC6293x;
import com.fasterxml.jackson.annotation.InterfaceC6294y;
import com.fasterxml.jackson.annotation.InterfaceC6295z;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$None;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.C6347e;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.impl.C6439h;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6498o;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p450m7.InterfaceC42436b;
import p450m7.InterfaceC42437c;
import p450m7.InterfaceC42438d;
import p450m7.InterfaceC42439e;
import p450m7.InterfaceC42440f;
import p450m7.InterfaceC42441g;
import p450m7.InterfaceC42442h;
import p465n7.AbstractC42762d;

/* JADX INFO: loaded from: classes45.dex */
public class JacksonAnnotationIntrospector extends AnnotationIntrospector implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final Class<? extends Annotation>[] f10387b = {JsonSerialize.class, InterfaceC6295z.class, JsonFormat.class, JsonTypeInfo.class, InterfaceC6288s.class, InterfaceC6293x.class, InterfaceC6274e.class, InterfaceC6284o.class};

    /* JADX INFO: renamed from: c */
    public static final Class<? extends Annotation>[] f10388c = {InterfaceC42437c.class, InterfaceC6295z.class, JsonFormat.class, JsonTypeInfo.class, InterfaceC6293x.class, InterfaceC6274e.class, InterfaceC6284o.class, InterfaceC6285p.class};

    /* JADX INFO: renamed from: d */
    public static final AbstractC42762d f10389d;
    private static final long serialVersionUID = 1;
    protected transient LRUMap<Class<?>, Boolean> _annotationsInside = new LRUMap<>(48, 48);
    protected boolean _cfgConstructorPropertiesImpliesCreator = true;

    public Class<?> _classIfExplicit(Class<?> cls) {
        if (cls == null || C6490g.m11907J(cls)) {
            return null;
        }
        return cls;
    }

    public BeanPropertyWriter _constructVirtualProperty(InterfaceC42436b.a aVar, MapperConfig<?> mapperConfig, C6406c c6406c, JavaType javaType) {
        PropertyMetadata propertyMetadata = aVar.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        String strValue = aVar.value();
        PropertyName propertyName_propertyName = _propertyName(aVar.propName(), aVar.propNamespace());
        if (!propertyName_propertyName.hasSimpleName()) {
            propertyName_propertyName = PropertyName.construct(strValue);
        }
        return AttributePropertyWriter.construct(strValue, C6498o.m11999A(mapperConfig, new VirtualAnnotatedMember(c6406c, c6406c.getRawType(), strValue, javaType), propertyName_propertyName, propertyMetadata, aVar.include()), c6406c.m11464h(), javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationContentType(AbstractC6404a abstractC6404a, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationKeyType(AbstractC6404a abstractC6404a, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationType(AbstractC6404a abstractC6404a, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(AbstractC6404a abstractC6404a) {
        return findPropertyIgnoralByName(null, abstractC6404a);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationContentType(AbstractC6404a abstractC6404a, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationKeyType(AbstractC6404a abstractC6404a, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationType(AbstractC6404a abstractC6404a) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
        Class<?> rawParameterType2 = annotatedMethod2.getRawParameterType(0);
        if (!rawParameterType.isPrimitive()) {
            if (!rawParameterType2.isPrimitive()) {
                if (rawParameterType == String.class) {
                    if (rawParameterType2 != String.class) {
                    }
                } else if (rawParameterType2 == String.class) {
                }
                return null;
            }
            return annotatedMethod2;
        }
        if (rawParameterType2.isPrimitive()) {
            return null;
        }
        return annotatedMethod;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$a */
    public static /* synthetic */ class C6401a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10390a;

        static {
            int[] iArr = new int[JsonSerialize.Inclusion.values().length];
            f10390a = iArr;
            try {
                iArr[JsonSerialize.Inclusion.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10390a[JsonSerialize.Inclusion.NON_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10390a[JsonSerialize.Inclusion.NON_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10390a[JsonSerialize.Inclusion.NON_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10390a[JsonSerialize.Inclusion.DEFAULT_INCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        AbstractC42762d abstractC42762dM93695d;
        try {
            abstractC42762dM93695d = AbstractC42762d.m93695d();
        } catch (Throwable unused) {
            abstractC42762dM93695d = null;
        }
        f10389d = abstractC42762dM93695d;
    }

    public Class<?> _classIfExplicit(Class<?> cls, Class<?> cls2) {
        Class<?> cls_classIfExplicit = _classIfExplicit(cls);
        if (cls_classIfExplicit == null || cls_classIfExplicit == cls2) {
            return null;
        }
        return cls_classIfExplicit;
    }

    public C6439h _constructStdTypeResolverBuilder() {
        return new C6439h();
    }

    public PropertyName _findConstructorName(AbstractC6404a abstractC6404a) {
        AbstractC42762d abstractC42762d;
        PropertyName propertyNameMo93696a;
        if (!(abstractC6404a instanceof AnnotatedParameter)) {
            return null;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) abstractC6404a;
        if (annotatedParameter.getOwner() == null || (abstractC42762d = f10389d) == null || (propertyNameMo93696a = abstractC42762d.mo93696a(annotatedParameter)) == null) {
            return null;
        }
        return propertyNameMo93696a;
    }

    public InterfaceC6430d<?> _findTypeResolver(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a, JavaType javaType) {
        InterfaceC6430d<?> interfaceC6430d_constructStdTypeResolverBuilder;
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) _findAnnotation(abstractC6404a, JsonTypeInfo.class);
        InterfaceC42441g interfaceC42441g = (InterfaceC42441g) _findAnnotation(abstractC6404a, InterfaceC42441g.class);
        if (interfaceC42441g != null) {
            if (jsonTypeInfo == null) {
                return null;
            }
            interfaceC6430d_constructStdTypeResolverBuilder = mapperConfig.typeResolverBuilderInstance(abstractC6404a, interfaceC42441g.value());
        } else {
            if (jsonTypeInfo == null) {
                return null;
            }
            if (jsonTypeInfo.use() == JsonTypeInfo.EnumC6266Id.NONE) {
                return _constructNoTypeResolverBuilder();
            }
            interfaceC6430d_constructStdTypeResolverBuilder = _constructStdTypeResolverBuilder();
        }
        InterfaceC42440f interfaceC42440f = (InterfaceC42440f) _findAnnotation(abstractC6404a, InterfaceC42440f.class);
        InterfaceC6429c interfaceC6429cTypeIdResolverInstance = interfaceC42440f != null ? mapperConfig.typeIdResolverInstance(abstractC6404a, interfaceC42440f.value()) : null;
        if (interfaceC6429cTypeIdResolverInstance != null) {
            interfaceC6429cTypeIdResolverInstance.mo11686d(javaType);
        }
        InterfaceC6430d interfaceC6430dInit = interfaceC6430d_constructStdTypeResolverBuilder.init(jsonTypeInfo.use(), interfaceC6429cTypeIdResolverInstance);
        JsonTypeInfo.EnumC6265As enumC6265AsInclude = jsonTypeInfo.include();
        if (enumC6265AsInclude == JsonTypeInfo.EnumC6265As.EXTERNAL_PROPERTY && (abstractC6404a instanceof C6406c)) {
            enumC6265AsInclude = JsonTypeInfo.EnumC6265As.PROPERTY;
        }
        InterfaceC6430d interfaceC6430dTypeProperty = interfaceC6430dInit.inclusion(enumC6265AsInclude).typeProperty(jsonTypeInfo.property());
        Class<?> clsDefaultImpl = jsonTypeInfo.defaultImpl();
        if (clsDefaultImpl != JsonTypeInfo.AbstractC6267a.class && !clsDefaultImpl.isAnnotation()) {
            interfaceC6430dTypeProperty = interfaceC6430dTypeProperty.defaultImpl(clsDefaultImpl);
        }
        return interfaceC6430dTypeProperty.typeIdVisibility(jsonTypeInfo.visible());
    }

    public boolean _isIgnorable(AbstractC6404a abstractC6404a) {
        Boolean boolMo93697b;
        InterfaceC6281l interfaceC6281l = (InterfaceC6281l) _findAnnotation(abstractC6404a, InterfaceC6281l.class);
        if (interfaceC6281l != null) {
            return interfaceC6281l.value();
        }
        AbstractC42762d abstractC42762d = f10389d;
        if (abstractC42762d == null || (boolMo93697b = abstractC42762d.mo93697b(abstractC6404a)) == null) {
            return false;
        }
        return boolMo93697b.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final JsonMappingException m11449a(String str) {
        return new JsonMappingException((Closeable) null, str);
    }

    /* JADX INFO: renamed from: b */
    public final JsonMappingException m11450b(Throwable th2, String str) {
        return new JsonMappingException((Closeable) null, str, th2);
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m11451c(AbstractC6404a abstractC6404a) {
        InterfaceC6287r interfaceC6287r = (InterfaceC6287r) _findAnnotation(abstractC6404a, InterfaceC6287r.class);
        if (interfaceC6287r == null || !interfaceC6287r.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: f */
    public final JsonInclude.Value m11454f(AbstractC6404a abstractC6404a, JsonInclude.Value value) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(abstractC6404a, JsonSerialize.class);
        if (jsonSerialize != null) {
            int i11 = C6401a.f10390a[jsonSerialize.include().ordinal()];
            if (i11 == 1) {
                return value.withValueInclusion(JsonInclude.Include.ALWAYS);
            }
            if (i11 == 2) {
                return value.withValueInclusion(JsonInclude.Include.NON_NULL);
            }
            if (i11 == 3) {
                return value.withValueInclusion(JsonInclude.Include.NON_DEFAULT);
            }
            if (i11 == 4) {
                return value.withValueInclusion(JsonInclude.Include.NON_EMPTY);
            }
        }
        return value;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, C6406c c6406c, List<BeanPropertyWriter> list) {
        InterfaceC42436b interfaceC42436b = (InterfaceC42436b) _findAnnotation(c6406c, InterfaceC42436b.class);
        if (interfaceC42436b == null) {
            return;
        }
        boolean zPrepend = interfaceC42436b.prepend();
        InterfaceC42436b.a[] aVarArrAttrs = interfaceC42436b.attrs();
        int length = aVarArrAttrs.length;
        JavaType javaTypeConstructType = null;
        for (int i11 = 0; i11 < length; i11++) {
            if (javaTypeConstructType == null) {
                javaTypeConstructType = mapperConfig.constructType(Object.class);
            }
            BeanPropertyWriter beanPropertyWriter_constructVirtualProperty = _constructVirtualProperty(aVarArrAttrs[i11], mapperConfig, c6406c, javaTypeConstructType);
            if (zPrepend) {
                list.add(i11, beanPropertyWriter_constructVirtualProperty);
            } else {
                list.add(beanPropertyWriter_constructVirtualProperty);
            }
        }
        InterfaceC42436b.b[] bVarArrProps = interfaceC42436b.props();
        int length2 = bVarArrProps.length;
        for (int i12 = 0; i12 < length2; i12++) {
            BeanPropertyWriter beanPropertyWriter_constructVirtualProperty2 = _constructVirtualProperty(bVarArrProps[i12], mapperConfig, c6406c);
            if (zPrepend) {
                list.add(i12, beanPropertyWriter_constructVirtualProperty2);
            } else {
                list.add(beanPropertyWriter_constructVirtualProperty2);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VisibilityChecker<?> findAutoDetectVisibility(C6406c c6406c, VisibilityChecker<?> visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) _findAnnotation(c6406c, JsonAutoDetect.class);
        return jsonAutoDetect == null ? visibilityChecker : visibilityChecker.with(jsonAutoDetect);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findClassDescription(C6406c c6406c) {
        InterfaceC6275f interfaceC6275f = (InterfaceC6275f) _findAnnotation(c6406c, InterfaceC6275f.class);
        if (interfaceC6275f == null) {
            return null;
        }
        return interfaceC6275f.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentDeserializer(AbstractC6404a abstractC6404a) {
        Class<? extends AbstractC6390e> clsContentUsing;
        InterfaceC42437c interfaceC42437c = (InterfaceC42437c) _findAnnotation(abstractC6404a, InterfaceC42437c.class);
        if (interfaceC42437c == null || (clsContentUsing = interfaceC42437c.contentUsing()) == AbstractC6390e.a.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentSerializer(AbstractC6404a abstractC6404a) {
        Class<? extends AbstractC6393h> clsContentUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(abstractC6404a, JsonSerialize.class);
        if (jsonSerialize == null || (clsContentUsing = jsonSerialize.contentUsing()) == AbstractC6393h.a.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        AbstractC42762d abstractC42762d;
        Boolean boolMo93698c;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(abstractC6404a, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode();
        }
        if (this._cfgConstructorPropertiesImpliesCreator && mapperConfig.isEnabled(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (abstractC6404a instanceof AnnotatedConstructor) && (abstractC42762d = f10389d) != null && (boolMo93698c = abstractC42762d.mo93698c(abstractC6404a)) != null && boolMo93698c.booleanValue()) {
            return JsonCreator.Mode.PROPERTIES;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonCreator.Mode findCreatorBinding(AbstractC6404a abstractC6404a) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(abstractC6404a, JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return C6490g.m11960v(cls, InterfaceC6276g.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        InterfaceC42437c interfaceC42437c = (InterfaceC42437c) _findAnnotation(annotatedMember, InterfaceC42437c.class);
        if (interfaceC42437c == null) {
            return null;
        }
        return _classIfExplicit(interfaceC42437c.contentConverter(), InterfaceC6491h.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationConverter(AbstractC6404a abstractC6404a) {
        InterfaceC42437c interfaceC42437c = (InterfaceC42437c) _findAnnotation(abstractC6404a, InterfaceC42437c.class);
        if (interfaceC42437c == null) {
            return null;
        }
        return _classIfExplicit(interfaceC42437c.converter(), InterfaceC6491h.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializer(AbstractC6404a abstractC6404a) {
        Class<? extends AbstractC6390e> clsUsing;
        InterfaceC42437c interfaceC42437c = (InterfaceC42437c) _findAnnotation(abstractC6404a, InterfaceC42437c.class);
        if (interfaceC42437c == null || (clsUsing = interfaceC42437c.using()) == AbstractC6390e.a.class) {
            return null;
        }
        return clsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findFilterId(AbstractC6404a abstractC6404a) {
        InterfaceC6277h interfaceC6277h = (InterfaceC6277h) _findAnnotation(abstractC6404a, InterfaceC6277h.class);
        if (interfaceC6277h == null) {
            return null;
        }
        String strValue = interfaceC6277h.value();
        if (strValue.isEmpty()) {
            return null;
        }
        return strValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonFormat.Value findFormat(AbstractC6404a abstractC6404a) {
        JsonFormat jsonFormat = (JsonFormat) _findAnnotation(abstractC6404a, JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        return JsonFormat.Value.from(jsonFormat);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        String name;
        JacksonInject jacksonInject = (JacksonInject) _findAnnotation(annotatedMember, JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        JacksonInject.Value valueFrom = JacksonInject.Value.from(jacksonInject);
        if (valueFrom.hasId()) {
            return valueFrom;
        }
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            name = annotatedMethod.getParameterCount() == 0 ? annotatedMember.getRawType().getName() : annotatedMethod.getRawParameterType(0).getName();
        } else {
            name = annotatedMember.getRawType().getName();
        }
        return valueFrom.withId(name);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeyDeserializer(AbstractC6404a abstractC6404a) {
        Class<? extends AbstractC6394i> clsKeyUsing;
        InterfaceC42437c interfaceC42437c = (InterfaceC42437c) _findAnnotation(abstractC6404a, InterfaceC42437c.class);
        if (interfaceC42437c == null || (clsKeyUsing = interfaceC42437c.keyUsing()) == AbstractC6394i.a.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeySerializer(AbstractC6404a abstractC6404a) {
        Class<? extends AbstractC6393h> clsKeyUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(abstractC6404a, JsonSerialize.class);
        if (jsonSerialize == null || (clsKeyUsing = jsonSerialize.keyUsing()) == AbstractC6393h.a.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findMergeInfo(AbstractC6404a abstractC6404a) {
        InterfaceC6285p interfaceC6285p = (InterfaceC6285p) _findAnnotation(abstractC6404a, InterfaceC6285p.class);
        if (interfaceC6285p == null) {
            return null;
        }
        return interfaceC6285p.value().asBoolean();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForDeserialization(AbstractC6404a abstractC6404a) {
        boolean z11;
        JsonSetter jsonSetter = (JsonSetter) _findAnnotation(abstractC6404a, JsonSetter.class);
        if (jsonSetter != null) {
            String strValue = jsonSetter.value();
            if (!strValue.isEmpty()) {
                return PropertyName.construct(strValue);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(abstractC6404a, JsonProperty.class);
        if (jsonProperty != null) {
            String strNamespace = jsonProperty.namespace();
            return PropertyName.construct(jsonProperty.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z11 || _hasOneOf(abstractC6404a, f10388c)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForSerialization(AbstractC6404a abstractC6404a) {
        boolean z11;
        InterfaceC6278i interfaceC6278i = (InterfaceC6278i) _findAnnotation(abstractC6404a, InterfaceC6278i.class);
        if (interfaceC6278i != null) {
            String strValue = interfaceC6278i.value();
            if (!strValue.isEmpty()) {
                return PropertyName.construct(strValue);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(abstractC6404a, JsonProperty.class);
        if (jsonProperty != null) {
            String strNamespace = jsonProperty.namespace();
            return PropertyName.construct(jsonProperty.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z11 || _hasOneOf(abstractC6404a, f10387b)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNamingStrategy(C6406c c6406c) {
        InterfaceC42438d interfaceC42438d = (InterfaceC42438d) _findAnnotation(c6406c, InterfaceC42438d.class);
        if (interfaceC42438d == null) {
            return null;
        }
        return interfaceC42438d.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNullSerializer(AbstractC6404a abstractC6404a) {
        Class<? extends AbstractC6393h> clsNullsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(abstractC6404a, JsonSerialize.class);
        if (jsonSerialize == null || (clsNullsUsing = jsonSerialize.nullsUsing()) == AbstractC6393h.a.class) {
            return null;
        }
        return clsNullsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public C6419p findObjectIdInfo(AbstractC6404a abstractC6404a) {
        InterfaceC6279j interfaceC6279j = (InterfaceC6279j) _findAnnotation(abstractC6404a, InterfaceC6279j.class);
        if (interfaceC6279j == null || interfaceC6279j.generator() == ObjectIdGenerators$None.class) {
            return null;
        }
        return new C6419p(PropertyName.construct(interfaceC6279j.property()), interfaceC6279j.scope(), interfaceC6279j.generator(), interfaceC6279j.resolver());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public C6419p findObjectReferenceInfo(AbstractC6404a abstractC6404a, C6419p c6419p) {
        InterfaceC6280k interfaceC6280k = (InterfaceC6280k) _findAnnotation(abstractC6404a, InterfaceC6280k.class);
        if (interfaceC6280k == null) {
            return c6419p;
        }
        if (c6419p == null) {
            c6419p = C6419p.m11570a();
        }
        return c6419p.m11576g(interfaceC6280k.alwaysAsId());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?> findPOJOBuilder(C6406c c6406c) {
        InterfaceC42437c interfaceC42437c = (InterfaceC42437c) _findAnnotation(c6406c, InterfaceC42437c.class);
        if (interfaceC42437c == null) {
            return null;
        }
        return _classIfExplicit(interfaceC42437c.builder());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC42439e.a findPOJOBuilderConfig(C6406c c6406c) {
        InterfaceC42439e interfaceC42439e = (InterfaceC42439e) _findAnnotation(c6406c, InterfaceC42439e.class);
        if (interfaceC42439e == null) {
            return null;
        }
        return new InterfaceC42439e.a(interfaceC42439e);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonProperty.Access findPropertyAccess(AbstractC6404a abstractC6404a) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(abstractC6404a, JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.access();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<PropertyName> findPropertyAliases(AbstractC6404a abstractC6404a) {
        InterfaceC6270b interfaceC6270b = (InterfaceC6270b) _findAnnotation(abstractC6404a, InterfaceC6270b.class);
        if (interfaceC6270b == null) {
            return null;
        }
        String[] strArrValue = interfaceC6270b.value();
        int length = strArrValue.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArrValue) {
            arrayList.add(PropertyName.construct(str));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDefaultValue(AbstractC6404a abstractC6404a) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(abstractC6404a, JsonProperty.class);
        if (jsonProperty == null) {
            return null;
        }
        String strDefaultValue = jsonProperty.defaultValue();
        if (strDefaultValue.isEmpty()) {
            return null;
        }
        return strDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDescription(AbstractC6404a abstractC6404a) {
        InterfaceC6286q interfaceC6286q = (InterfaceC6286q) _findAnnotation(abstractC6404a, InterfaceC6286q.class);
        if (interfaceC6286q == null) {
            return null;
        }
        return interfaceC6286q.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) _findAnnotation(abstractC6404a, JsonIgnoreProperties.class);
        return jsonIgnoreProperties == null ? JsonIgnoreProperties.Value.empty() : JsonIgnoreProperties.Value.from(jsonIgnoreProperties);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonInclude.Value findPropertyInclusion(AbstractC6404a abstractC6404a) {
        JsonInclude jsonInclude = (JsonInclude) _findAnnotation(abstractC6404a, JsonInclude.class);
        JsonInclude.Value valueEmpty = jsonInclude == null ? JsonInclude.Value.empty() : JsonInclude.Value.from(jsonInclude);
        return valueEmpty.getValueInclusion() == JsonInclude.Include.USE_DEFAULTS ? m11454f(abstractC6404a, valueEmpty) : valueEmpty;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        JsonIncludeProperties jsonIncludeProperties = (JsonIncludeProperties) _findAnnotation(abstractC6404a, JsonIncludeProperties.class);
        return jsonIncludeProperties == null ? JsonIncludeProperties.Value.all() : JsonIncludeProperties.Value.from(jsonIncludeProperties);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Integer findPropertyIndex(AbstractC6404a abstractC6404a) {
        int iIndex;
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(abstractC6404a, JsonProperty.class);
        if (jsonProperty == null || (iIndex = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(iIndex);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        InterfaceC6284o interfaceC6284o = (InterfaceC6284o) _findAnnotation(annotatedMember, InterfaceC6284o.class);
        if (interfaceC6284o != null) {
            return AnnotationIntrospector.ReferenceProperty.m11127e(interfaceC6284o.value());
        }
        InterfaceC6274e interfaceC6274e = (InterfaceC6274e) _findAnnotation(annotatedMember, InterfaceC6274e.class);
        if (interfaceC6274e != null) {
            return AnnotationIntrospector.ReferenceProperty.m11126a(interfaceC6274e.value());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRootName(C6406c c6406c) {
        InterfaceC6289t interfaceC6289t = (InterfaceC6289t) _findAnnotation(c6406c, InterfaceC6289t.class);
        if (interfaceC6289t == null) {
            return null;
        }
        String strNamespace = interfaceC6289t.namespace();
        return PropertyName.construct(interfaceC6289t.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotatedMember, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.contentConverter(), InterfaceC6491h.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationConverter(AbstractC6404a abstractC6404a) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(abstractC6404a, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.converter(), InterfaceC6491h.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findSerializationPropertyOrder(C6406c c6406c) {
        InterfaceC6287r interfaceC6287r = (InterfaceC6287r) _findAnnotation(c6406c, InterfaceC6287r.class);
        if (interfaceC6287r == null) {
            return null;
        }
        return interfaceC6287r.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSerialize.Typing findSerializationTyping(AbstractC6404a abstractC6404a) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(abstractC6404a, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializer(AbstractC6404a abstractC6404a) {
        Class<? extends AbstractC6393h> clsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(abstractC6404a, JsonSerialize.class);
        if (jsonSerialize != null && (clsUsing = jsonSerialize.using()) != AbstractC6393h.a.class) {
            return clsUsing;
        }
        InterfaceC6288s interfaceC6288s = (InterfaceC6288s) _findAnnotation(abstractC6404a, InterfaceC6288s.class);
        if (interfaceC6288s == null || !interfaceC6288s.value()) {
            return null;
        }
        return new RawSerializer(abstractC6404a.getRawType());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSetter.Value findSetterInfo(AbstractC6404a abstractC6404a) {
        return JsonSetter.Value.from((JsonSetter) _findAnnotation(abstractC6404a, JsonSetter.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<NamedType> findSubtypes(AbstractC6404a abstractC6404a) {
        InterfaceC6290u interfaceC6290u = (InterfaceC6290u) _findAnnotation(abstractC6404a, InterfaceC6290u.class);
        if (interfaceC6290u == null) {
            return null;
        }
        InterfaceC6290u.a[] aVarArrValue = interfaceC6290u.value();
        ArrayList arrayList = new ArrayList(aVarArrValue.length);
        for (InterfaceC6290u.a aVar : aVarArrValue) {
            arrayList.add(new NamedType(aVar.value(), aVar.name()));
            for (String str : aVar.names()) {
                arrayList.add(new NamedType(aVar.value(), str));
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findTypeName(C6406c c6406c) {
        InterfaceC6292w interfaceC6292w = (InterfaceC6292w) _findAnnotation(c6406c, InterfaceC6292w.class);
        if (interfaceC6292w == null) {
            return null;
        }
        return interfaceC6292w.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        InterfaceC6293x interfaceC6293x = (InterfaceC6293x) _findAnnotation(annotatedMember, InterfaceC6293x.class);
        if (interfaceC6293x == null || !interfaceC6293x.enabled()) {
            return null;
        }
        return NameTransformer.simpleTransformer(interfaceC6293x.prefix(), interfaceC6293x.suffix());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findValueInstantiator(C6406c c6406c) {
        InterfaceC42442h interfaceC42442h = (InterfaceC42442h) _findAnnotation(c6406c, InterfaceC42442h.class);
        if (interfaceC42442h == null) {
            return null;
        }
        return interfaceC42442h.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?>[] findViews(AbstractC6404a abstractC6404a) {
        InterfaceC6295z interfaceC6295z = (InterfaceC6295z) _findAnnotation(abstractC6404a, InterfaceC6295z.class);
        if (interfaceC6295z == null) {
            return null;
        }
        return interfaceC6295z.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnyGetter(AbstractC6404a abstractC6404a) {
        InterfaceC6272c interfaceC6272c = (InterfaceC6272c) _findAnnotation(abstractC6404a, InterfaceC6272c.class);
        if (interfaceC6272c == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC6272c.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, InterfaceC6272c.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnySetter(AbstractC6404a abstractC6404a) {
        InterfaceC6273d interfaceC6273d = (InterfaceC6273d) _findAnnotation(abstractC6404a, InterfaceC6273d.class);
        if (interfaceC6273d == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC6273d.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, InterfaceC6273d.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsKey(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        InterfaceC6283n interfaceC6283n = (InterfaceC6283n) _findAnnotation(abstractC6404a, InterfaceC6283n.class);
        if (interfaceC6283n == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC6283n.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsValue(AbstractC6404a abstractC6404a) {
        InterfaceC6294y interfaceC6294y = (InterfaceC6294y) _findAnnotation(abstractC6404a, InterfaceC6294y.class);
        if (interfaceC6294y == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC6294y.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        InterfaceC6294y interfaceC6294y = (InterfaceC6294y) _findAnnotation(annotatedMethod, InterfaceC6294y.class);
        return interfaceC6294y != null && interfaceC6294y.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasCreatorAnnotation(AbstractC6404a abstractC6404a) {
        AbstractC42762d abstractC42762d;
        Boolean boolMo93698c;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(abstractC6404a, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode() != JsonCreator.Mode.DISABLED;
        }
        if (!this._cfgConstructorPropertiesImpliesCreator || !(abstractC6404a instanceof AnnotatedConstructor) || (abstractC42762d = f10389d) == null || (boolMo93698c = abstractC42762d.mo93698c(abstractC6404a)) == null) {
            return false;
        }
        return boolMo93698c.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotatedMember, JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isIgnorableType(C6406c c6406c) {
        InterfaceC6282m interfaceC6282m = (InterfaceC6282m) _findAnnotation(c6406c, InterfaceC6282m.class);
        if (interfaceC6282m == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC6282m.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(_hasAnnotation(annotatedMember, InterfaceC6291v.class));
    }

    public Object readResolve() {
        if (this._annotationsInside == null) {
            this._annotationsInside = new LRUMap<>(48, 48);
        }
        return this;
    }

    public JacksonAnnotationIntrospector setConstructorPropertiesImpliesCreator(boolean z11) {
        this._cfgConstructorPropertiesImpliesCreator = z11;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Version version() {
        return C6347e.f10215a;
    }

    public C6439h _constructNoTypeResolverBuilder() {
        return C6439h.noTypeInfoBuilder();
    }

    public PropertyName _propertyName(String str, String str2) {
        if (str.isEmpty()) {
            return PropertyName.USE_DEFAULT;
        }
        if (str2 != null && !str2.isEmpty()) {
            return PropertyName.construct(str, str2);
        }
        return PropertyName.construct(str);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11452d(JavaType javaType, Class<?> cls) {
        if (javaType.isPrimitive()) {
            return javaType.hasRawClass(C6490g.m11927b0(cls));
        }
        if (!cls.isPrimitive() || cls != C6490g.m11927b0(javaType.getRawClass())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11453e(Class<?> cls, Class<?> cls2) {
        if (cls.isPrimitive()) {
            if (cls == C6490g.m11927b0(cls2)) {
                return true;
            }
            return false;
        }
        if (cls2.isPrimitive() && cls2 == C6490g.m11927b0(cls)) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        InterfaceC6270b interfaceC6270b;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (interfaceC6270b = (InterfaceC6270b) field.getAnnotation(InterfaceC6270b.class)) != null) {
                String[] strArrValue = interfaceC6270b.value();
                if (strArrValue.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        if (name.equals(enumArr[i11].name())) {
                            strArr[i11] = strArrValue;
                        }
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String findEnumValue(Enum<?> r11) {
        JsonProperty jsonProperty;
        String strValue;
        try {
            Field field = r11.getDeclaringClass().getField(r11.name());
            if (field != null && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null && (strValue = jsonProperty.value()) != null && !strValue.isEmpty()) {
                return strValue;
            }
        } catch (NoSuchFieldException | SecurityException unused) {
        }
        return r11.name();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        HashMap map = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                String strValue = jsonProperty.value();
                if (!strValue.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(field.getName(), strValue);
                }
            }
        }
        if (map != null) {
            int length = enumArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = (String) map.get(enumArr[i11].name());
                if (str != null) {
                    strArr[i11] = str;
                }
            }
        }
        return strArr;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        PropertyName propertyName_findConstructorName = _findConstructorName(annotatedMember);
        if (propertyName_findConstructorName == null) {
            return null;
        }
        return propertyName_findConstructorName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        JacksonInject.Value valueFindInjectableValue = findInjectableValue(annotatedMember);
        if (valueFindInjectableValue == null) {
            return null;
        }
        return valueFindInjectableValue.getId();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC6430d<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.getContentType() != null) {
            return _findTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC6430d<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (!javaType.isContainerType() && !javaType.isReferenceType()) {
            return _findTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findSerializationSortAlphabetically(AbstractC6404a abstractC6404a) {
        return m11451c(abstractC6404a);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC6430d<?> findTypeResolver(MapperConfig<?> mapperConfig, C6406c c6406c, JavaType javaType) {
        return _findTypeResolver(mapperConfig, c6406c, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return _isIgnorable(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean isAnnotationBundle(Annotation annotation) {
        boolean z11;
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Boolean boolValueOf = this._annotationsInside.get(clsAnnotationType);
        if (boolValueOf == null) {
            if (clsAnnotationType.getAnnotation(InterfaceC6268a.class) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolValueOf = Boolean.valueOf(z11);
            this._annotationsInside.putIfAbsent(clsAnnotationType, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a, JavaType javaType) throws JsonMappingException {
        Class<?> cls_classIfExplicit;
        Class<?> cls_classIfExplicit2;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        InterfaceC42437c interfaceC42437c = (InterfaceC42437c) _findAnnotation(abstractC6404a, InterfaceC42437c.class);
        Class<?> cls_classIfExplicit3 = null;
        if (interfaceC42437c == null) {
            cls_classIfExplicit = null;
        } else {
            cls_classIfExplicit = _classIfExplicit(interfaceC42437c.m93161as());
        }
        if (cls_classIfExplicit != null && !javaType.hasRawClass(cls_classIfExplicit) && !m11452d(javaType, cls_classIfExplicit)) {
            try {
                javaType = typeFactory.constructSpecializedType(javaType, cls_classIfExplicit);
            } catch (IllegalArgumentException e11) {
                throw m11450b(e11, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit.getName(), abstractC6404a.getName(), e11.getMessage()));
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            if (interfaceC42437c == null) {
                cls_classIfExplicit2 = null;
            } else {
                cls_classIfExplicit2 = _classIfExplicit(interfaceC42437c.keyAs());
            }
            if (cls_classIfExplicit2 != null && !m11452d(keyType, cls_classIfExplicit2)) {
                try {
                    javaType = ((MapLikeType) javaType).withKeyType(typeFactory.constructSpecializedType(keyType, cls_classIfExplicit2));
                } catch (IllegalArgumentException e12) {
                    throw m11450b(e12, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit2.getName(), abstractC6404a.getName(), e12.getMessage()));
                }
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null) {
            if (interfaceC42437c != null) {
                cls_classIfExplicit3 = _classIfExplicit(interfaceC42437c.contentAs());
            }
            if (cls_classIfExplicit3 != null && !m11452d(contentType, cls_classIfExplicit3)) {
                try {
                    return javaType.withContentType(typeFactory.constructSpecializedType(contentType, cls_classIfExplicit3));
                } catch (IllegalArgumentException e13) {
                    throw m11450b(e13, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit3.getName(), abstractC6404a.getName(), e13.getMessage()));
                }
            }
        }
        return javaType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a, JavaType javaType) throws JsonMappingException {
        Class<?> cls_classIfExplicit;
        JavaType javaTypeWithStaticTyping;
        Class<?> cls_classIfExplicit2;
        JavaType javaTypeWithStaticTyping2;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(abstractC6404a, JsonSerialize.class);
        Class<?> cls_classIfExplicit3 = null;
        if (jsonSerialize == null) {
            cls_classIfExplicit = null;
        } else {
            cls_classIfExplicit = _classIfExplicit(jsonSerialize.m11150as());
        }
        if (cls_classIfExplicit != null) {
            if (javaType.hasRawClass(cls_classIfExplicit)) {
                javaType = javaType.withStaticTyping();
            } else {
                Class<?> rawClass = javaType.getRawClass();
                try {
                    if (cls_classIfExplicit.isAssignableFrom(rawClass)) {
                        javaType = typeFactory.constructGeneralizedType(javaType, cls_classIfExplicit);
                    } else if (rawClass.isAssignableFrom(cls_classIfExplicit)) {
                        javaType = typeFactory.constructSpecializedType(javaType, cls_classIfExplicit);
                    } else if (m11453e(rawClass, cls_classIfExplicit)) {
                        javaType = javaType.withStaticTyping();
                    } else {
                        throw m11449a(String.format("Cannot refine serialization type %s into %s; types not related", javaType, cls_classIfExplicit.getName()));
                    }
                } catch (IllegalArgumentException e11) {
                    throw m11450b(e11, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit.getName(), abstractC6404a.getName(), e11.getMessage()));
                }
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            if (jsonSerialize == null) {
                cls_classIfExplicit2 = null;
            } else {
                cls_classIfExplicit2 = _classIfExplicit(jsonSerialize.keyAs());
            }
            if (cls_classIfExplicit2 != null) {
                if (keyType.hasRawClass(cls_classIfExplicit2)) {
                    javaTypeWithStaticTyping2 = keyType.withStaticTyping();
                } else {
                    Class<?> rawClass2 = keyType.getRawClass();
                    try {
                        if (cls_classIfExplicit2.isAssignableFrom(rawClass2)) {
                            javaTypeWithStaticTyping2 = typeFactory.constructGeneralizedType(keyType, cls_classIfExplicit2);
                        } else if (rawClass2.isAssignableFrom(cls_classIfExplicit2)) {
                            javaTypeWithStaticTyping2 = typeFactory.constructSpecializedType(keyType, cls_classIfExplicit2);
                        } else if (m11453e(rawClass2, cls_classIfExplicit2)) {
                            javaTypeWithStaticTyping2 = keyType.withStaticTyping();
                        } else {
                            throw m11449a(String.format("Cannot refine serialization key type %s into %s; types not related", keyType, cls_classIfExplicit2.getName()));
                        }
                    } catch (IllegalArgumentException e12) {
                        throw m11450b(e12, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit2.getName(), abstractC6404a.getName(), e12.getMessage()));
                    }
                }
                javaType = ((MapLikeType) javaType).withKeyType(javaTypeWithStaticTyping2);
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null) {
            if (jsonSerialize != null) {
                cls_classIfExplicit3 = _classIfExplicit(jsonSerialize.contentAs());
            }
            if (cls_classIfExplicit3 != null) {
                if (contentType.hasRawClass(cls_classIfExplicit3)) {
                    javaTypeWithStaticTyping = contentType.withStaticTyping();
                } else {
                    Class<?> rawClass3 = contentType.getRawClass();
                    try {
                        if (cls_classIfExplicit3.isAssignableFrom(rawClass3)) {
                            javaTypeWithStaticTyping = typeFactory.constructGeneralizedType(contentType, cls_classIfExplicit3);
                        } else if (rawClass3.isAssignableFrom(cls_classIfExplicit3)) {
                            javaTypeWithStaticTyping = typeFactory.constructSpecializedType(contentType, cls_classIfExplicit3);
                        } else if (m11453e(rawClass3, cls_classIfExplicit3)) {
                            javaTypeWithStaticTyping = contentType.withStaticTyping();
                        } else {
                            throw m11449a(String.format("Cannot refine serialization content type %s into %s; types not related", contentType, cls_classIfExplicit3.getName()));
                        }
                    } catch (IllegalArgumentException e13) {
                        throw m11450b(e13, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit3.getName(), abstractC6404a.getName(), e13.getMessage()));
                    }
                }
                return javaType.withContentType(javaTypeWithStaticTyping);
            }
        }
        return javaType;
    }

    public BeanPropertyWriter _constructVirtualProperty(InterfaceC42436b.b bVar, MapperConfig<?> mapperConfig, C6406c c6406c) {
        PropertyMetadata propertyMetadata = bVar.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        PropertyName propertyName_propertyName = _propertyName(bVar.name(), bVar.namespace());
        JavaType javaTypeConstructType = mapperConfig.constructType(bVar.type());
        C6498o c6498oM11999A = C6498o.m11999A(mapperConfig, new VirtualAnnotatedMember(c6406c, c6406c.getRawType(), propertyName_propertyName.getSimpleName(), javaTypeConstructType), propertyName_propertyName, propertyMetadata, bVar.include());
        Class<? extends VirtualBeanPropertyWriter> clsValue = bVar.value();
        mapperConfig.getHandlerInstantiator();
        return ((VirtualBeanPropertyWriter) C6490g.m11946l(clsValue, mapperConfig.canOverrideAccessModifiers())).withConfig(mapperConfig, c6406c, c6498oM11999A, javaTypeConstructType);
    }
}
