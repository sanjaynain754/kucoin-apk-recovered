package com.squareup.moshi;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import ob0.C43012b;

/* JADX INFO: renamed from: com.squareup.moshi.q */
/* JADX INFO: compiled from: Types.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27811q {
    /* JADX INFO: renamed from: d */
    public static boolean m68771d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m68771d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m68771d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof C43012b.b ? ((C43012b.b) parameterizedType).f95190d : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof C43012b.b ? ((C43012b.b) parameterizedType2).f95190d : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m68771d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return m68771d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: i */
    public static Type[] m68776i(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeM68775h = m68775h(type, cls, Map.class);
        return typeM68775h instanceof ParameterizedType ? ((ParameterizedType) typeM68775h).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* JADX INFO: renamed from: k */
    public static WildcardType m68778k(Type type) {
        return new C43012b.c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* JADX INFO: renamed from: a */
    public static Type m68768a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static GenericArrayType m68769b(Type type) {
        return new C43012b.a(type);
    }

    /* JADX INFO: renamed from: c */
    public static Type m68770c(Type type, Class<?> cls) {
        Type typeM68775h = m68775h(type, cls, Collection.class);
        if (typeM68775h instanceof WildcardType) {
            typeM68775h = ((WildcardType) typeM68775h).getUpperBounds()[0];
        }
        return typeM68775h instanceof ParameterizedType ? ((ParameterizedType) typeM68775h).getActualTypeArguments()[0] : Object.class;
    }

    /* JADX INFO: renamed from: e */
    public static String m68772e(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    /* JADX INFO: renamed from: g */
    public static Class<?> m68774g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m68774g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m68774g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: j */
    public static WildcardType m68777j(Type type) {
        return new C43012b.c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, C43012b.f95183b);
    }

    /* JADX INFO: renamed from: f */
    public static Type m68773f(Type type) {
        Class<?> clsM68774g = m68774g(type);
        return C43012b.m94473m(type, clsM68774g, clsM68774g.getGenericSuperclass());
    }

    /* JADX INFO: renamed from: h */
    public static Type m68775h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C43012b.m94473m(type, cls, C43012b.m94465e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }
}
