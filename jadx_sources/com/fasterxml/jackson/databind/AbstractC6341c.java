package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.InterfaceC6269a0;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.introspect.C6419p;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.c */
/* JADX INFO: compiled from: DatabindContext.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6341c {
    public final String _format(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    public abstract boolean canOverrideAccessModifiers();

    public abstract JavaType constructSpecializedType(JavaType javaType, Class<?> cls);

    public InterfaceC6491h<Object, Object> converterInstance(AbstractC6404a abstractC6404a, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC6491h) {
            return (InterfaceC6491h) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == InterfaceC6491h.a.class || C6490g.m11907J(cls)) {
            return null;
        }
        if (InterfaceC6491h.class.isAssignableFrom(cls)) {
            MapperConfig<?> config = getConfig();
            config.getHandlerInstantiator();
            return (InterfaceC6491h) C6490g.m11946l(cls, config.canOverrideAccessModifiers());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
    }

    public abstract Class<?> getActiveView();

    public abstract AnnotationIntrospector getAnnotationIntrospector();

    public abstract Object getAttribute(Object obj);

    public abstract MapperConfig<?> getConfig();

    public abstract JsonFormat.Value getDefaultPropertyFormat(Class<?> cls);

    public abstract Locale getLocale();

    public abstract TimeZone getTimeZone();

    public abstract TypeFactory getTypeFactory();

    public abstract JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2);

    public abstract boolean isEnabled(MapperFeature mapperFeature);

    public abstract <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException;

    public <T> T reportBadDefinition(Class<?> cls, String str) throws JsonMappingException {
        return (T) reportBadDefinition(constructType(cls), str);
    }

    public abstract AbstractC6341c setAttribute(Object obj, Object obj2);

    public String _colonConcat(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + ": " + str2;
    }

    public String _desc(String str) {
        return str == null ? "[N/A]" : _truncate(str);
    }

    public String _quotedString(String str) {
        return str == null ? "[N/A]" : String.format("\"%s\"", _truncate(str));
    }

    public <T> T _throwNotASubtype(JavaType javaType, String str) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }

    public <T> T _throwSubtypeClassNotAllowed(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + C6490g.m11938h(polymorphicTypeValidator) + ") denied resolution");
    }

    public <T> T _throwSubtypeNameNotAllowed(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + C6490g.m11938h(polymorphicTypeValidator) + ") denied resolution");
    }

    public final String _truncate(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
    }

    public JavaType constructType(Type type) {
        if (type == null) {
            return null;
        }
        return getTypeFactory().constructType(type);
    }

    public JavaType resolveAndValidateSubType(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        int iIndexOf = str.indexOf(60);
        if (iIndexOf > 0) {
            return m11181a(javaType, str, polymorphicTypeValidator, iIndexOf);
        }
        MapperConfig<?> config = getConfig();
        PolymorphicTypeValidator.Validity validityValidateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str);
        if (validityValidateSubClassName == PolymorphicTypeValidator.Validity.DENIED) {
            return (JavaType) _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        }
        try {
            Class<?> clsFindClass = getTypeFactory().findClass(str);
            if (!javaType.isTypeOrSuperTypeOf(clsFindClass)) {
                return (JavaType) _throwNotASubtype(javaType, str);
            }
            JavaType javaTypeConstructSpecializedType = config.getTypeFactory().constructSpecializedType(javaType, clsFindClass);
            return (validityValidateSubClassName != PolymorphicTypeValidator.Validity.INDETERMINATE || polymorphicTypeValidator.validateSubType(config, javaType, javaTypeConstructSpecializedType) == PolymorphicTypeValidator.Validity.ALLOWED) ? javaTypeConstructSpecializedType : (JavaType) _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e11) {
            throw invalidTypeIdException(javaType, str, String.format("problem: (%s) %s", e11.getClass().getName(), C6490g.m11952o(e11)));
        }
    }

    public JavaType resolveSubType(JavaType javaType, String str) throws JsonMappingException {
        if (str.indexOf(60) > 0) {
            JavaType javaTypeConstructFromCanonical = getTypeFactory().constructFromCanonical(str);
            if (javaTypeConstructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
                return javaTypeConstructFromCanonical;
            }
        } else {
            try {
                Class<?> clsFindClass = getTypeFactory().findClass(str);
                if (javaType.isTypeOrSuperTypeOf(clsFindClass)) {
                    return getTypeFactory().constructSpecializedType(javaType, clsFindClass);
                }
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (Exception e11) {
                throw invalidTypeIdException(javaType, str, String.format("problem: (%s) %s", e11.getClass().getName(), C6490g.m11952o(e11)));
            }
        }
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }

    /* JADX INFO: renamed from: a */
    public final JavaType m11181a(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator, int i11) throws JsonMappingException {
        MapperConfig<?> config = getConfig();
        PolymorphicTypeValidator.Validity validityValidateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str.substring(0, i11));
        if (validityValidateSubClassName == PolymorphicTypeValidator.Validity.DENIED) {
            return (JavaType) _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        }
        JavaType javaTypeConstructFromCanonical = getTypeFactory().constructFromCanonical(str);
        if (!javaTypeConstructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
            return (JavaType) _throwNotASubtype(javaType, str);
        }
        PolymorphicTypeValidator.Validity validity = PolymorphicTypeValidator.Validity.ALLOWED;
        if (validityValidateSubClassName != validity && polymorphicTypeValidator.validateSubType(config, javaType, javaTypeConstructFromCanonical) != validity) {
            return (JavaType) _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
        }
        return javaTypeConstructFromCanonical;
    }

    public ObjectIdGenerator<?> objectIdGeneratorInstance(AbstractC6404a abstractC6404a, C6419p c6419p) throws JsonMappingException {
        Class<? extends ObjectIdGenerator<?>> clsM11572c = c6419p.m11572c();
        MapperConfig<?> config = getConfig();
        config.getHandlerInstantiator();
        return ((ObjectIdGenerator) C6490g.m11946l(clsM11572c, config.canOverrideAccessModifiers())).forScope(c6419p.m11575f());
    }

    public InterfaceC6269a0 objectIdResolverInstance(AbstractC6404a abstractC6404a, C6419p c6419p) {
        Class<? extends InterfaceC6269a0> clsM11574e = c6419p.m11574e();
        MapperConfig<?> config = getConfig();
        config.getHandlerInstantiator();
        return (InterfaceC6269a0) C6490g.m11946l(clsM11574e, config.canOverrideAccessModifiers());
    }
}
