package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.util.C6490g;
import java.util.Collection;
import p450m7.C42443i;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.impl.h */
/* JADX INFO: compiled from: StdTypeResolverBuilder.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6439h implements InterfaceC6430d<C6439h> {
    protected InterfaceC6429c _customIdResolver;
    protected Class<?> _defaultImpl;
    protected JsonTypeInfo.EnumC6266Id _idType;
    protected JsonTypeInfo.EnumC6265As _includeAs;
    protected boolean _typeIdVisible;
    protected String _typeProperty;

    public C6439h() {
        this._typeIdVisible = false;
    }

    public boolean allowPrimitiveTypes(MapperConfig<?> mapperConfig, JavaType javaType) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
    public /* bridge */ /* synthetic */ InterfaceC6430d defaultImpl(Class cls) {
        return defaultImpl((Class<?>) cls);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
    public /* bridge */ /* synthetic */ InterfaceC6430d withDefaultImpl(Class cls) {
        return withDefaultImpl((Class<?>) cls);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.impl.h$a */
    /* JADX INFO: compiled from: StdTypeResolverBuilder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10535a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10536b;

        static {
            int[] iArr = new int[JsonTypeInfo.EnumC6266Id.values().length];
            f10536b = iArr;
            try {
                iArr[JsonTypeInfo.EnumC6266Id.DEDUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10536b[JsonTypeInfo.EnumC6266Id.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10536b[JsonTypeInfo.EnumC6266Id.MINIMAL_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10536b[JsonTypeInfo.EnumC6266Id.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10536b[JsonTypeInfo.EnumC6266Id.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10536b[JsonTypeInfo.EnumC6266Id.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonTypeInfo.EnumC6265As.values().length];
            f10535a = iArr2;
            try {
                iArr2[JsonTypeInfo.EnumC6265As.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10535a[JsonTypeInfo.EnumC6265As.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10535a[JsonTypeInfo.EnumC6265As.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10535a[JsonTypeInfo.EnumC6265As.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10535a[JsonTypeInfo.EnumC6265As.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static C6439h noTypeInfoBuilder() {
        return new C6439h().init(JsonTypeInfo.EnumC6266Id.NONE, (InterfaceC6429c) null);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
    public AbstractC6428b buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.EnumC6266Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !allowPrimitiveTypes(deserializationConfig, javaType)) {
            return null;
        }
        InterfaceC6429c interfaceC6429cIdResolver = idResolver(deserializationConfig, javaType, verifyBaseTypeValidity(deserializationConfig, javaType), collection, false, true);
        JavaType javaTypeDefineDefaultImpl = defineDefaultImpl(deserializationConfig, javaType);
        if (this._idType == JsonTypeInfo.EnumC6266Id.DEDUCTION) {
            return new AsDeductionTypeDeserializer(javaType, interfaceC6429cIdResolver, javaTypeDefineDefaultImpl, deserializationConfig, collection);
        }
        int i11 = a.f10535a[this._includeAs.ordinal()];
        if (i11 == 1) {
            return new AsArrayTypeDeserializer(javaType, interfaceC6429cIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return new AsWrapperTypeDeserializer(javaType, interfaceC6429cIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
            }
            if (i11 == 4) {
                return new AsExternalTypeDeserializer(javaType, interfaceC6429cIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
            }
            if (i11 != 5) {
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
            }
        }
        return new AsPropertyTypeDeserializer(javaType, interfaceC6429cIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl, this._includeAs);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
    public AbstractC6431e buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.EnumC6266Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !allowPrimitiveTypes(serializationConfig, javaType)) {
            return null;
        }
        InterfaceC6429c interfaceC6429cIdResolver = idResolver(serializationConfig, javaType, subTypeValidator(serializationConfig), collection, true, false);
        if (this._idType == JsonTypeInfo.EnumC6266Id.DEDUCTION) {
            return new C6433b(interfaceC6429cIdResolver, null, this._typeProperty);
        }
        int i11 = a.f10535a[this._includeAs.ordinal()];
        if (i11 == 1) {
            return new C6432a(interfaceC6429cIdResolver, null);
        }
        if (i11 == 2) {
            return new C6435d(interfaceC6429cIdResolver, null, this._typeProperty);
        }
        if (i11 == 3) {
            return new C6436e(interfaceC6429cIdResolver, null);
        }
        if (i11 == 4) {
            return new C6434c(interfaceC6429cIdResolver, null, this._typeProperty);
        }
        if (i11 == 5) {
            return new C6433b(interfaceC6429cIdResolver, null, this._typeProperty);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
    public C6439h defaultImpl(Class<?> cls) {
        this._defaultImpl = cls;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r4.hasRawClass(r2._defaultImpl) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JavaType defineDefaultImpl(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> cls = this._defaultImpl;
        if (cls != null) {
            if (cls == Void.class || cls == C42443i.class) {
                return deserializationConfig.getTypeFactory().constructType(this._defaultImpl);
            }
            if (!javaType.hasRawClass(cls)) {
                if (javaType.isTypeOrSuperTypeOf(this._defaultImpl)) {
                    return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, this._defaultImpl);
                }
            }
            return javaType;
        }
        if (!deserializationConfig.isEnabled(MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL) || javaType.isAbstract()) {
            return null;
        }
        return javaType;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
    public Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    public String getTypeProperty() {
        return this._typeProperty;
    }

    public InterfaceC6429c idResolver(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator, Collection<NamedType> collection, boolean z11, boolean z12) {
        InterfaceC6429c interfaceC6429c = this._customIdResolver;
        if (interfaceC6429c != null) {
            return interfaceC6429c;
        }
        JsonTypeInfo.EnumC6266Id enumC6266Id = this._idType;
        if (enumC6266Id == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int i11 = a.f10536b[enumC6266Id.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return C6437f.m11703i(javaType, mapperConfig, polymorphicTypeValidator);
        }
        if (i11 == 3) {
            return C6438g.m11706j(javaType, mapperConfig, polymorphicTypeValidator);
        }
        if (i11 == 4) {
            return C6442k.m11710i(mapperConfig, javaType, collection, z11, z12);
        }
        if (i11 == 5) {
            return null;
        }
        throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this._idType);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
    public C6439h inclusion(JsonTypeInfo.EnumC6265As enumC6265As) {
        if (enumC6265As == null) {
            throw new IllegalArgumentException("includeAs cannot be null");
        }
        this._includeAs = enumC6265As;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
    public C6439h init(JsonTypeInfo.EnumC6266Id enumC6266Id, InterfaceC6429c interfaceC6429c) {
        if (enumC6266Id == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this._idType = enumC6266Id;
        this._customIdResolver = interfaceC6429c;
        this._typeProperty = enumC6266Id.getDefaultPropertyName();
        return this;
    }

    public boolean isTypeIdVisible() {
        return this._typeIdVisible;
    }

    public PolymorphicTypeValidator reportInvalidBaseType(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw new IllegalArgumentException(String.format("Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s", C6490g.m11938h(polymorphicTypeValidator), C6490g.m11938h(javaType.getRawClass())));
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
    public C6439h typeIdVisibility(boolean z11) {
        this._typeIdVisible = z11;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
    public C6439h typeProperty(String str) {
        if (str == null || str.isEmpty()) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6430d
    public C6439h withDefaultImpl(Class<?> cls) {
        if (this._defaultImpl == cls) {
            return this;
        }
        C6490g.m11951n0(C6439h.class, this, "withDefaultImpl");
        return new C6439h(this, cls);
    }

    public C6439h(JsonTypeInfo.EnumC6266Id enumC6266Id, JsonTypeInfo.EnumC6265As enumC6265As, String str) {
        this._typeIdVisible = false;
        this._idType = enumC6266Id;
        this._includeAs = enumC6265As;
        this._typeProperty = str;
    }

    public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
        return mapperConfig.getPolymorphicTypeValidator();
    }

    public PolymorphicTypeValidator verifyBaseTypeValidity(MapperConfig<?> mapperConfig, JavaType javaType) {
        PolymorphicTypeValidator polymorphicTypeValidatorSubTypeValidator = subTypeValidator(mapperConfig);
        JsonTypeInfo.EnumC6266Id enumC6266Id = this._idType;
        if (enumC6266Id == JsonTypeInfo.EnumC6266Id.CLASS || enumC6266Id == JsonTypeInfo.EnumC6266Id.MINIMAL_CLASS) {
            PolymorphicTypeValidator.Validity validityValidateBaseType = polymorphicTypeValidatorSubTypeValidator.validateBaseType(mapperConfig, javaType);
            if (validityValidateBaseType == PolymorphicTypeValidator.Validity.DENIED) {
                return reportInvalidBaseType(mapperConfig, javaType, polymorphicTypeValidatorSubTypeValidator);
            }
            if (validityValidateBaseType == PolymorphicTypeValidator.Validity.ALLOWED) {
                return LaissezFaireSubTypeValidator.instance;
            }
        }
        return polymorphicTypeValidatorSubTypeValidator;
    }

    public C6439h(C6439h c6439h, Class<?> cls) {
        this._typeIdVisible = false;
        this._idType = c6439h._idType;
        this._includeAs = c6439h._includeAs;
        this._typeProperty = c6439h._typeProperty;
        this._typeIdVisible = c6439h._typeIdVisible;
        this._customIdResolver = c6439h._customIdResolver;
        this._defaultImpl = cls;
    }
}
