package com.google.api.client.util;

import com.tencent.bugly.proguard.C33627eb;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes56.dex */
public class Types {
    public static Type getArrayComponentType(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type getIterableParameter(Type type) {
        return getActualParameterAtPosition(type, Iterable.class, 0);
    }

    public static Type getMapValueParameter(Type type) {
        return getActualParameterAtPosition(type, Map.class, 1);
    }

    public static Class<?> getRawArrayComponentType(List<Type> list, Type type) {
        if (type instanceof TypeVariable) {
            type = resolveTypeVariable(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawArrayComponentType(list, getArrayComponentType(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getRawClass((ParameterizedType) type);
        }
        Preconditions.checkArgument(type == null, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    public static ParameterizedType getSuperParameterizedType(Type type, Class<?> cls) {
        Class<?> cls2;
        if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
            return null;
        }
        while (type != null && type != Object.class) {
            if (type instanceof Class) {
                cls2 = (Class) type;
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class<?> rawClass = getRawClass(parameterizedType);
                if (rawClass == cls) {
                    return parameterizedType;
                }
                if (cls.isInterface()) {
                    Type[] genericInterfaces = rawClass.getGenericInterfaces();
                    int length = genericInterfaces.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            Type type2 = genericInterfaces[i11];
                            if (cls.isAssignableFrom(type2 instanceof Class ? (Class) type2 : getRawClass((ParameterizedType) type2))) {
                                type = type2;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                cls2 = rawClass;
            }
            type = cls2.getGenericSuperclass();
        }
        return null;
    }

    private static IllegalArgumentException handleExceptionForNewInstance(Exception exc, Class<?> cls) {
        StringBuilder sb2 = new StringBuilder("unable to create new instance of class ");
        sb2.append(cls.getName());
        ArrayList<String> arrayList = new ArrayList();
        boolean z11 = false;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (Modifier.isPublic(cls.getModifiers())) {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            } else {
                arrayList.add("possibly because it is not public");
            }
        }
        for (String str : arrayList) {
            if (z11) {
                sb2.append(" and");
            } else {
                z11 = true;
            }
            sb2.append(C33627eb.f69716f);
            sb2.append(str);
        }
        return new IllegalArgumentException(sb2.toString(), exc);
    }

    public static boolean isArray(Type type) {
        if (type instanceof GenericArrayType) {
            return true;
        }
        return (type instanceof Class) && ((Class) type).isArray();
    }

    public static <T> Iterable<T> iterableOf(final Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        Preconditions.checkArgument(cls.isArray(), "not an array or Iterable: %s", cls);
        return !cls.getComponentType().isPrimitive() ? Arrays.asList((Object[]) obj) : new Iterable<T>() { // from class: com.google.api.client.util.Types.1
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return new Iterator<T>() { // from class: com.google.api.client.util.Types.1.1
                    int index = 0;
                    final int length;

                    {
                        this.length = Array.getLength(obj);
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.index < this.length;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    @Override // java.util.Iterator
                    public T next() {
                        if (hasNext()) {
                            Object obj2 = obj;
                            int i11 = this.index;
                            this.index = i11 + 1;
                            return (T) Array.get(obj2, i11);
                        }
                        throw new NoSuchElementException();
                    }
                };
            }
        };
    }

    private Types() {
    }

    private static Type getActualParameterAtPosition(Type type, Class<?> cls, int i11) {
        Type typeResolveTypeVariable;
        ParameterizedType superParameterizedType = getSuperParameterizedType(type, cls);
        if (superParameterizedType == null) {
            return null;
        }
        Type type2 = superParameterizedType.getActualTypeArguments()[i11];
        if ((type2 instanceof TypeVariable) && (typeResolveTypeVariable = resolveTypeVariable(Arrays.asList(type), (TypeVariable) type2)) != null) {
            return typeResolveTypeVariable;
        }
        return type2;
    }

    public static Type getBound(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    public static Class<?> getRawClass(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static boolean isAssignableToOrFrom(Class<?> cls, Class<?> cls2) {
        if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    public static <T> T newInstance(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e11) {
            throw handleExceptionForNewInstance(e11, cls);
        } catch (InstantiationException e12) {
            throw handleExceptionForNewInstance(e12, cls);
        }
    }

    public static Type resolveTypeVariable(List<Type> list, TypeVariable<?> typeVariable) {
        Type typeResolveTypeVariable;
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            ParameterizedType superParameterizedType = null;
            while (superParameterizedType == null) {
                size--;
                if (size < 0) {
                    break;
                }
                superParameterizedType = getSuperParameterizedType(list.get(size), cls);
            }
            if (superParameterizedType != null) {
                TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
                int i11 = 0;
                while (i11 < typeParameters.length && !typeParameters[i11].equals(typeVariable)) {
                    i11++;
                }
                Type type = superParameterizedType.getActualTypeArguments()[i11];
                if ((type instanceof TypeVariable) && (typeResolveTypeVariable = resolveTypeVariable(list, (TypeVariable) type)) != null) {
                    return typeResolveTypeVariable;
                }
                return type;
            }
        }
        return null;
    }

    public static Object toArray(Collection<?> collection, Class<?> cls) {
        if (cls.isPrimitive()) {
            Object objNewInstance = Array.newInstance(cls, collection.size());
            Iterator<?> it = collection.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Array.set(objNewInstance, i11, it.next());
                i11++;
            }
            return objNewInstance;
        }
        return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
    }
}
