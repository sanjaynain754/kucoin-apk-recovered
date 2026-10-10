package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.o */
/* JADX INFO: compiled from: MethodGenericTypeResolver.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6418o {
    /* JADX INFO: renamed from: b */
    public static TypeVariable<?> m11564b(TypeVariable<?>[] typeVariableArr, String str) {
        if (typeVariableArr != null && str != null) {
            for (TypeVariable<?> typeVariable : typeVariableArr) {
                if (str.equals(typeVariable.getName())) {
                    return typeVariable;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m11569g(InterfaceC6423t interfaceC6423t, JavaType javaType, Type[] typeArr) {
        for (Type type : typeArr) {
            if (!m11568f(interfaceC6423t, javaType, type)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static ParameterizedType m11565c(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return m11565c(upperBounds[0]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static TypeVariable<?> m11566d(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return m11566d(upperBounds[0]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static TypeBindings m11563a(Method method, JavaType javaType, InterfaceC6423t interfaceC6423t) {
        JavaType boundType;
        TypeVariable<?> typeVariableM11564b;
        TypeVariable<Method>[] typeParameters = method.getTypeParameters();
        if (typeParameters.length == 0 || javaType.getBindings().isEmpty()) {
            return null;
        }
        Type genericReturnType = method.getGenericReturnType();
        if (!(genericReturnType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
        if (!Objects.equals(javaType.getRawClass(), parameterizedType.getRawType())) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        ArrayList arrayList2 = new ArrayList(typeParameters.length);
        for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
            TypeVariable<?> typeVariableM11566d = m11566d(actualTypeArguments[i11]);
            if (typeVariableM11566d != null) {
                String name = typeVariableM11566d.getName();
                if (name == null || (boundType = javaType.getBindings().getBoundType(i11)) == null || (typeVariableM11564b = m11564b(typeParameters, name)) == null) {
                    return null;
                }
                if (m11569g(interfaceC6423t, boundType, typeVariableM11564b.getBounds())) {
                    int iIndexOf = arrayList.indexOf(name);
                    if (iIndexOf != -1) {
                        JavaType javaType2 = (JavaType) arrayList2.get(iIndexOf);
                        if (boundType.equals(javaType2)) {
                            continue;
                        } else {
                            boolean zIsTypeOrSubTypeOf = javaType2.isTypeOrSubTypeOf(boundType.getRawClass());
                            boolean zIsTypeOrSubTypeOf2 = boundType.isTypeOrSubTypeOf(javaType2.getRawClass());
                            if (!zIsTypeOrSubTypeOf && !zIsTypeOrSubTypeOf2) {
                                return null;
                            }
                            if ((zIsTypeOrSubTypeOf ^ zIsTypeOrSubTypeOf2) && zIsTypeOrSubTypeOf2) {
                                arrayList2.set(iIndexOf, boundType);
                            }
                        }
                    } else {
                        arrayList.add(name);
                        arrayList2.add(boundType);
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TypeBindings.create(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC6423t m11567e(Method method, JavaType javaType, TypeFactory typeFactory, InterfaceC6423t interfaceC6423t) {
        TypeBindings typeBindingsM11563a = m11563a(method, javaType, interfaceC6423t);
        if (typeBindingsM11563a == null) {
            return interfaceC6423t;
        }
        return new InterfaceC6423t.a(typeFactory, typeBindingsM11563a);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11568f(InterfaceC6423t interfaceC6423t, JavaType javaType, Type type) {
        if (!javaType.isTypeOrSubTypeOf(interfaceC6423t.mo11457a(type).getRawClass())) {
            return false;
        }
        ParameterizedType parameterizedTypeM11565c = m11565c(type);
        if (parameterizedTypeM11565c != null && Objects.equals(javaType.getRawClass(), parameterizedTypeM11565c.getRawType())) {
            Type[] actualTypeArguments = parameterizedTypeM11565c.getActualTypeArguments();
            TypeBindings bindings = javaType.getBindings();
            if (bindings.size() != actualTypeArguments.length) {
                return false;
            }
            for (int i11 = 0; i11 < bindings.size(); i11++) {
                if (!m11568f(interfaceC6423t, bindings.getBoundType(i11), actualTypeArguments[i11])) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}
