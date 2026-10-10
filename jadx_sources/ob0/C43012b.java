package ob0;

import com.squareup.moshi.AbstractC27800f;
import com.squareup.moshi.C27809o;
import com.squareup.moshi.C27811q;
import com.squareup.moshi.InterfaceC27801g;
import com.squareup.moshi.InterfaceC27802h;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ob0.b */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C43012b {

    /* JADX INFO: renamed from: a */
    public static final Set<Annotation> f95182a = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: b */
    public static final Type[] f95183b = new Type[0];

    /* JADX INFO: renamed from: c */
    public static final Class<?> f95184c;

    /* JADX INFO: renamed from: d */
    public static final Class<? extends Annotation> f95185d;

    /* JADX INFO: renamed from: e */
    public static final Map<Class<?>, Class<?>> f95186e;

    /* JADX INFO: renamed from: ob0.b$a */
    /* JADX INFO: compiled from: Util.java */
    public static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: b */
        public final Type f95187b;

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C27811q.m68771d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f95187b;
        }

        public int hashCode() {
            return this.f95187b.hashCode();
        }

        public String toString() {
            return C43012b.m94478r(this.f95187b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }

        public a(Type type) {
            this.f95187b = C43012b.m94461a(type);
        }
    }

    /* JADX INFO: renamed from: ob0.b$b */
    /* JADX INFO: compiled from: Util.java */
    public static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: b */
        public final Type f95188b;

        /* JADX INFO: renamed from: c */
        public final Type f95189c;

        /* JADX INFO: renamed from: d */
        public final Type[] f95190d;

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C27811q.m68771d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f95190d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f95188b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f95189c;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f95190d) ^ this.f95189c.hashCode()) ^ C43012b.m94466f(this.f95188b);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f95190d.length + 1) * 30);
            sb2.append(C43012b.m94478r(this.f95189c));
            if (this.f95190d.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(C43012b.m94478r(this.f95190d[0]));
            for (int i11 = 1; i11 < this.f95190d.length; i11++) {
                sb2.append(", ");
                sb2.append(C43012b.m94478r(this.f95190d[i11]));
            }
            sb2.append(">");
            return sb2.toString();
        }

        public b(Type type, Type type2, Type... typeArr) {
            Type typeM94461a;
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C27811q.m68774g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            if (type == null) {
                typeM94461a = null;
            } else {
                typeM94461a = C43012b.m94461a(type);
            }
            this.f95188b = typeM94461a;
            this.f95189c = C43012b.m94461a(type2);
            this.f95190d = (Type[]) typeArr.clone();
            int i11 = 0;
            while (true) {
                Type[] typeArr2 = this.f95190d;
                if (i11 < typeArr2.length) {
                    typeArr2[i11].getClass();
                    C43012b.m94462b(this.f95190d[i11]);
                    Type[] typeArr3 = this.f95190d;
                    typeArr3[i11] = C43012b.m94461a(typeArr3[i11]);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ob0.b$c */
    /* JADX INFO: compiled from: Util.java */
    public static final class c implements WildcardType {

        /* JADX INFO: renamed from: b */
        public final Type f95191b;

        /* JADX INFO: renamed from: c */
        public final Type f95192c;

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C27811q.m68771d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f95192c;
            return type != null ? new Type[]{type} : C43012b.f95183b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f95191b};
        }

        public int hashCode() {
            Type type = this.f95192c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f95191b.hashCode() + 31);
        }

        public String toString() {
            if (this.f95192c != null) {
                return "? super " + C43012b.m94478r(this.f95192c);
            }
            if (this.f95191b == Object.class) {
                return "?";
            }
            return "? extends " + C43012b.m94478r(this.f95191b);
        }

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        typeArr2[0].getClass();
                        C43012b.m94462b(typeArr2[0]);
                        if (typeArr[0] == Object.class) {
                            this.f95192c = C43012b.m94461a(typeArr2[0]);
                            this.f95191b = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    typeArr[0].getClass();
                    C43012b.m94462b(typeArr[0]);
                    this.f95192c = null;
                    this.f95191b = C43012b.m94461a(typeArr[0]);
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m94467g(Object[] objArr, Object obj) {
        for (int i11 = 0; i11 < objArr.length; i11++) {
            if (obj.equals(objArr[i11])) {
                return i11;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: k */
    public static Set<? extends Annotation> m94471k(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC27802h.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f95182a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<? extends Annotation> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = 0;
        }
        f95185d = cls;
        f95184c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f95186e = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static Type m94461a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(m94461a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: b */
    public static void m94462b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC27800f<?> m94464d(C27809o c27809o, Type type, Class<?> cls) {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        InterfaceC27801g interfaceC27801g = (InterfaceC27801g) cls.getAnnotation(InterfaceC27801g.class);
        Class<?> cls2 = null;
        if (interfaceC27801g == null || !interfaceC27801g.generateAdapter()) {
            return null;
        }
        try {
            try {
                cls2 = Class.forName(C27811q.m68772e(cls.getName()), true, cls.getClassLoader());
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(C27809o.class, Type[].class);
                        objArr = new Object[]{c27809o, actualTypeArguments};
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                        objArr = new Object[]{actualTypeArguments};
                    }
                } else {
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(C27809o.class);
                        objArr = new Object[]{c27809o};
                    } catch (NoSuchMethodException unused2) {
                        declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                        objArr = new Object[0];
                    }
                }
                declaredConstructor.setAccessible(true);
                return ((AbstractC27800f) declaredConstructor.newInstance(objArr)).m68684d();
            } catch (NoSuchMethodException e11) {
                if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e11);
                }
                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e12);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e14);
        } catch (InvocationTargetException e15) {
            throw m94476p(e15);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Type m94465e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i11 = 0; i11 < length; i11++) {
                Class<?> cls3 = interfaces[i11];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i11];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m94465e(cls.getGenericInterfaces()[i11], interfaces[i11], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m94465e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: f */
    public static int m94466f(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* JADX INFO: renamed from: h */
    public static boolean m94468h(Class<?> cls) {
        Class<? extends Annotation> cls2 = f95185d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    /* JADX INFO: renamed from: l */
    public static Type m94472l(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: m */
    public static Type m94473m(Type type, Class<?> cls, Type type2) {
        return m94474n(type, cls, type2, new LinkedHashSet());
    }

    /* JADX INFO: renamed from: n */
    public static Type m94474n(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
        Type type3;
        WildcardType wildcardType;
        Type typeM94474n;
        while (type2 instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = m94475o(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM94474n2 = m94474n(type, cls, componentType, collection);
                return componentType == typeM94474n2 ? cls2 : C27811q.m68769b(typeM94474n2);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM94474n3 = m94474n(type, cls, genericComponentType, collection);
            return genericComponentType == typeM94474n3 ? genericArrayType : C27811q.m68769b(typeM94474n3);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM94474n4 = m94474n(type, cls, ownerType, collection);
            boolean z11 = typeM94474n4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i11 = 0; i11 < length; i11++) {
                Type typeM94474n5 = m94474n(type, cls, actualTypeArguments[i11], collection);
                if (typeM94474n5 != actualTypeArguments[i11]) {
                    if (!z11) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z11 = true;
                    }
                    actualTypeArguments[i11] = typeM94474n5;
                }
            }
            return z11 ? new b(typeM94474n4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type2 instanceof WildcardType) {
            wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM94474n6 = m94474n(type, cls, lowerBounds[0], collection);
                if (typeM94474n6 != lowerBounds[0]) {
                    type3 = type2;
                    type3 = wildcardType;
                    return C27811q.m68778k(typeM94474n6);
                }
            } else if (upperBounds.length == 1 && (typeM94474n = m94474n(type, cls, upperBounds[0], collection)) != upperBounds[0]) {
                type3 = type2;
                type3 = wildcardType;
                type3 = wildcardType;
                return C27811q.m68777j(typeM94474n);
            }
        }
        type3 = type2;
        type3 = wildcardType;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        return type3;
    }

    /* JADX INFO: renamed from: q */
    public static String m94477q(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m94478r(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m94463c(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m94469i(Class<?> cls) {
        String name = cls.getName();
        if (!name.startsWith("android.") && !name.startsWith("androidx.") && !name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("kotlin.") && !name.startsWith("kotlinx.") && !name.startsWith("scala.")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static Set<? extends Annotation> m94470j(AnnotatedElement annotatedElement) {
        return m94471k(annotatedElement.getAnnotations());
    }

    /* JADX INFO: renamed from: o */
    public static Type m94475o(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsM94463c = m94463c(typeVariable);
        if (clsM94463c != null) {
            Type typeM94465e = m94465e(type, cls, clsM94463c);
            if (typeM94465e instanceof ParameterizedType) {
                return ((ParameterizedType) typeM94465e).getActualTypeArguments()[m94467g(clsM94463c.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* JADX INFO: renamed from: p */
    public static RuntimeException m94476p(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (!(targetException instanceof RuntimeException)) {
            if (targetException instanceof Error) {
                throw ((Error) targetException);
            }
            throw new RuntimeException(targetException);
        }
        throw ((RuntimeException) targetException);
    }
}
