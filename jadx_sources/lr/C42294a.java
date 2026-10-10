package lr;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lr.a */
/* JADX INFO: compiled from: TypeUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public class C42294a {

    /* JADX INFO: renamed from: a */
    public static final Type[] f93782a = new Type[0];

    /* JADX INFO: renamed from: a */
    public static <T> T m92826a(@Nullable T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m92828c(Type type) {
        m92826a(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m92828c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m92828c(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* JADX INFO: renamed from: b */
    public static Type m92827b(int i11, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i11 >= 0 && i11 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i11];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        throw new IllegalArgumentException("Index " + i11 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }
}
