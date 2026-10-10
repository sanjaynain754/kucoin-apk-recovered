package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p450m7.C42443i;
import p450m7.InterfaceC42435a;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.g */
/* JADX INFO: compiled from: ClassUtil.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6490g {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f10724a = Object.class;

    /* JADX INFO: renamed from: b */
    public static final Annotation[] f10725b = new Annotation[0];

    /* JADX INFO: renamed from: c */
    public static final a[] f10726c = new a[0];

    /* JADX INFO: renamed from: d */
    public static final Iterator<?> f10727d = Collections.emptyIterator();

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.g$a */
    /* JADX INFO: compiled from: ClassUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Constructor<?> f10728a;

        /* JADX INFO: renamed from: b */
        public transient Annotation[] f10729b;

        /* JADX INFO: renamed from: c */
        public transient Annotation[][] f10730c;

        /* JADX INFO: renamed from: d */
        public int f10731d = -1;

        /* JADX INFO: renamed from: a */
        public Constructor<?> m11965a() {
            return this.f10728a;
        }

        /* JADX INFO: renamed from: b */
        public Annotation[] m11966b() {
            Annotation[] annotationArr = this.f10729b;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[] declaredAnnotations = this.f10728a.getDeclaredAnnotations();
            this.f10729b = declaredAnnotations;
            return declaredAnnotations;
        }

        /* JADX INFO: renamed from: c */
        public Class<?> m11967c() {
            return this.f10728a.getDeclaringClass();
        }

        /* JADX INFO: renamed from: d */
        public int m11968d() {
            int i11 = this.f10731d;
            if (i11 >= 0) {
                return i11;
            }
            int length = this.f10728a.getParameterTypes().length;
            this.f10731d = length;
            return length;
        }

        /* JADX INFO: renamed from: e */
        public Annotation[][] m11969e() {
            Annotation[][] annotationArr = this.f10730c;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this.f10728a.getParameterAnnotations();
            this.f10730c = parameterAnnotations;
            return parameterAnnotations;
        }

        public a(Constructor<?> constructor) {
            this.f10728a = constructor;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.g$b */
    /* JADX INFO: compiled from: ClassUtil.java */
    public static class b {

        /* JADX INFO: renamed from: e */
        public static final b f10732e = new b();

        /* JADX INFO: renamed from: a */
        public final Field f10733a;

        /* JADX INFO: renamed from: b */
        public final Field f10734b;

        /* JADX INFO: renamed from: c */
        public final String f10735c;

        /* JADX INFO: renamed from: d */
        public final String f10736d;

        public b() throws Exception {
            String string;
            Field fieldM11970d;
            String string2;
            Field fieldM11970d2 = null;
            try {
                fieldM11970d = m11970d(EnumSet.class, "elementType", Class.class);
                string = null;
            } catch (Exception e11) {
                string = e11.toString();
                fieldM11970d = null;
            }
            this.f10733a = fieldM11970d;
            this.f10735c = string;
            try {
                fieldM11970d2 = m11970d(EnumMap.class, "keyType", Class.class);
                string2 = null;
            } catch (Exception e12) {
                string2 = e12.toString();
            }
            this.f10734b = fieldM11970d2;
            this.f10736d = string2;
        }

        /* JADX INFO: renamed from: a */
        public Class<? extends Enum<?>> m11971a(EnumMap<?, ?> enumMap) {
            Field field = this.f10734b;
            if (field != null) {
                return (Class) m11973c(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + this.f10736d);
        }

        /* JADX INFO: renamed from: b */
        public Class<? extends Enum<?>> m11972b(EnumSet<?> enumSet) {
            Field field = this.f10733a;
            if (field != null) {
                return (Class) m11973c(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + this.f10735c);
        }

        /* JADX INFO: renamed from: d */
        public static Field m11970d(Class<?> cls, String str, Class<?> cls2) throws Exception {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            throw new IllegalStateException(String.format("No field named '%s' in class '%s'", str, cls.getName()));
        }

        /* JADX INFO: renamed from: c */
        public final Object m11973c(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e11) {
                throw new IllegalArgumentException(e11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static void m11936g(Member member, boolean z11) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z11 || m11910M(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e11) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            throw new IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e11.getMessage());
        } catch (RuntimeException e12) {
            if (!"InaccessibleObjectException".equals(e12.getClass().getSimpleName())) {
                throw e12;
            }
            throw new IllegalArgumentException(String.format("Failed to call `setAccess()` on %s '%s' (of class %s) due to `%s`, problem: %s", member.getClass().getSimpleName(), member.getName(), m11921X(member.getDeclaringClass()), e12.getClass().getName(), e12.getMessage()), e12);
        }
    }

    /* JADX INFO: renamed from: q */
    public static <T> Constructor<T> m11955q(Class<T> cls, boolean z11) throws IllegalArgumentException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z11) {
                m11936g(declaredConstructor, z11);
                return declaredConstructor;
            }
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                return declaredConstructor;
            }
            throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e11) {
            m11949m0(e11, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e11.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: G */
    public static String m11904G(JavaType javaType) {
        if (javaType == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append('`');
        sb2.append(javaType.toCanonical());
        sb2.append('`');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m11905H(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m11907J(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == C42443i.class;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m11909L(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: N */
    public static boolean m11911N(Class<?> cls) {
        return cls.getAnnotation(InterfaceC42435a.class) != null;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m11912O(Object obj) {
        return obj == null || m11911N(obj.getClass());
    }

    /* JADX INFO: renamed from: R */
    public static boolean m11915R(Class<?> cls) {
        return cls == f10724a || cls.isPrimitive();
    }

    /* JADX INFO: renamed from: U */
    public static String m11918U(PropertyName propertyName) {
        return propertyName == null ? "[null]" : m11930d(propertyName.getSimpleName());
    }

    /* JADX INFO: renamed from: V */
    public static String m11919V(String str) {
        return str == null ? "[null]" : m11930d(str);
    }

    /* JADX INFO: renamed from: W */
    public static String m11920W(InterfaceC6494k interfaceC6494k) {
        return interfaceC6494k == null ? "[null]" : m11930d(interfaceC6494k.getName());
    }

    /* JADX INFO: renamed from: X */
    public static String m11921X(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i11 = 0;
        while (cls.isArray()) {
            i11++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i11 > 0) {
            StringBuilder sb2 = new StringBuilder(simpleName);
            do {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                i11--;
            } while (i11 > 0);
            simpleName = sb2.toString();
        }
        return m11932e(simpleName);
    }

    /* JADX INFO: renamed from: Y */
    public static <T> T m11922Y(T t11, T t12) {
        return t11 == null ? t12 : t11;
    }

    /* JADX INFO: renamed from: Z */
    public static String m11923Z(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: a */
    public static void m11924a(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z11) {
        if (cls == cls2 || cls == null || cls == Object.class) {
            return;
        }
        if (z11) {
            if (collection.contains(cls)) {
                return;
            } else {
                collection.add(cls);
            }
        }
        for (Class<?> cls3 : m11928c(cls)) {
            m11924a(cls3, cls2, collection, true);
        }
        m11924a(cls.getSuperclass(), cls2, collection, true);
    }

    /* JADX INFO: renamed from: a0 */
    public static String m11925a0(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: b */
    public static Method[] m11926b(Class<?> cls, Throwable th2) throws IllegalArgumentException {
        throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), th2.getClass().getName(), th2.getMessage()), th2);
    }

    /* JADX INFO: renamed from: c0 */
    public static String m11929c0(Object obj, String str) {
        return obj == null ? str : String.format("\"%s\"", obj);
    }

    /* JADX INFO: renamed from: d */
    public static String m11930d(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\'');
        sb2.append(str);
        sb2.append('\'');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d0 */
    public static Class<?> m11931d0(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    /* JADX INFO: renamed from: e */
    public static String m11932e(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('`');
        sb2.append(str);
        sb2.append('`');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: g0 */
    public static <T> T m11937g0(DeserializationContext deserializationContext, IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        throw JsonMappingException.from(deserializationContext, iOException.getMessage()).withCause(iOException);
    }

    /* JADX INFO: renamed from: h */
    public static String m11938h(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return m11921X(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    /* JADX INFO: renamed from: h0 */
    public static Throwable m11939h0(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2;
    }

    /* JADX INFO: renamed from: i */
    public static Class<?> m11940i(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    /* JADX INFO: renamed from: i0 */
    public static Throwable m11941i0(Throwable th2) throws IOException {
        if (th2 instanceof IOException) {
            throw ((IOException) th2);
        }
        return th2;
    }

    /* JADX INFO: renamed from: j */
    public static void m11942j(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) throws IOException {
        if (jsonGenerator != null) {
            jsonGenerator.mo10829m(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception e11) {
                exc.addSuppressed(e11);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e12) {
                exc.addSuppressed(e12);
            }
        }
        m11941i0(exc);
        m11943j0(exc);
        throw new RuntimeException(exc);
    }

    /* JADX INFO: renamed from: j0 */
    public static Throwable m11943j0(Throwable th2) {
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        return th2;
    }

    /* JADX INFO: renamed from: k */
    public static void m11944k(JsonGenerator jsonGenerator, Exception exc) throws IOException {
        jsonGenerator.mo10829m(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception e11) {
            exc.addSuppressed(e11);
        }
        m11941i0(exc);
        m11943j0(exc);
        throw new RuntimeException(exc);
    }

    /* JADX INFO: renamed from: m */
    public static Object m11948m(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    /* JADX INFO: renamed from: n */
    public static <T> Iterator<T> m11950n() {
        return (Iterator<T>) f10727d;
    }

    /* JADX INFO: renamed from: o */
    public static String m11952o(Throwable th2) {
        if (th2 instanceof JacksonException) {
            return ((JacksonException) th2).getOriginalMessage();
        }
        return (!(th2 instanceof InvocationTargetException) || th2.getCause() == null) ? th2.getMessage() : th2.getCause().getMessage();
    }

    /* JADX INFO: renamed from: o0 */
    public static Class<?> m11953o0(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    /* JADX INFO: renamed from: w */
    public static List<Class<?>> m11961w(Class<?> cls, Class<?> cls2, boolean z11) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        m11924a(cls, cls2, arrayList, z11);
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static List<Class<?>> m11962x(Class<?> cls, Class<?> cls2, boolean z11) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z11) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static String m11963y(Object obj) {
        if (obj == null) {
            return "unknown";
        }
        return m11921X(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    /* JADX INFO: renamed from: A */
    public static a[] m11898A(Class<?> cls) {
        if (!cls.isInterface() && !m11915R(cls)) {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            a[] aVarArr = new a[length];
            for (int i11 = 0; i11 < length; i11++) {
                aVarArr[i11] = new a(declaredConstructors[i11]);
            }
            return aVarArr;
        }
        return f10726c;
    }

    /* JADX INFO: renamed from: B */
    public static Class<?> m11899B(Class<?> cls) {
        if (m11915R(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    /* JADX INFO: renamed from: C */
    public static Type[] m11900C(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    /* JADX INFO: renamed from: D */
    public static Type m11901D(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    /* JADX INFO: renamed from: E */
    public static Class<?> m11902E(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (m11906I(cls)) {
                    return null;
                }
                return m11899B(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static Throwable m11903F(Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m11906I(Class<?> cls) {
        if (!m11915R(cls) && cls.getEnclosingMethod() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m11908K(Class<?> cls) {
        if ((cls.getModifiers() & 1536) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m11910M(Class<?> cls) {
        String name = cls.getName();
        if (!name.startsWith("java.") && !name.startsWith("javax.")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public static String m11913P(Class<?> cls, boolean z11) {
        try {
            boolean zIsStatic = Modifier.isStatic(cls.getModifiers());
            if (!zIsStatic && m11906I(cls)) {
                return "local/anonymous";
            }
            if (!z11 && !zIsStatic && m11899B(cls) != null) {
                return "non-static member class";
            }
            return null;
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m11914Q(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers()) && m11899B(cls) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m11916S(Class<?> cls) {
        String name = cls.getName();
        if (!name.startsWith("net.sf.cglib.proxy.") && !name.startsWith("org.hibernate.proxy.")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m11917T(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && "com.android.tools.r8.RecordTag".equals(superclass.getName())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public static Class<?> m11927b0(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Class<?>[] m11928c(Class<?> cls) {
        return cls.getInterfaces();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m11933e0(Throwable th2) {
        m11935f0(th2, th2.getMessage());
    }

    /* JADX INFO: renamed from: f */
    public static String m11934f(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m11935f0(Throwable th2, String str) {
        m11943j0(th2);
        m11939h0(th2);
        throw new IllegalArgumentException(str, th2);
    }

    /* JADX INFO: renamed from: k0 */
    public static Throwable m11945k0(Throwable th2) throws IOException {
        return m11941i0(m11903F(th2));
    }

    /* JADX INFO: renamed from: l */
    public static <T> T m11946l(Class<T> cls, boolean z11) throws IllegalArgumentException {
        Constructor constructorM11955q = m11955q(cls, z11);
        if (constructorM11955q != null) {
            try {
                return (T) constructorM11955q.newInstance(new Object[0]);
            } catch (Exception e11) {
                m11949m0(e11, "Failed to instantiate class " + cls.getName() + ", problem: " + e11.getMessage());
                return null;
            }
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
    }

    /* JADX INFO: renamed from: l0 */
    public static void m11947l0(Throwable th2) {
        m11933e0(m11903F(th2));
    }

    /* JADX INFO: renamed from: m0 */
    public static void m11949m0(Throwable th2, String str) {
        m11935f0(m11903F(th2), str);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m11951n0(Class<?> cls, Object obj, String str) {
        if (obj.getClass() == cls) {
        } else {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", obj.getClass().getName(), cls.getName(), str));
        }
    }

    /* JADX INFO: renamed from: p */
    public static Annotation[] m11954p(Class<?> cls) {
        if (m11915R(cls)) {
            return f10725b;
        }
        return cls.getDeclaredAnnotations();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static Class<? extends Enum<?>> m11956r(Class<?> cls) {
        if (cls.getSuperclass() != Enum.class) {
            return cls.getSuperclass();
        }
        return cls;
    }

    /* JADX INFO: renamed from: s */
    public static Class<? extends Enum<?>> m11957s(Enum<?> r11) {
        return r11.getDeclaringClass();
    }

    /* JADX INFO: renamed from: t */
    public static Class<? extends Enum<?>> m11958t(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return m11957s((Enum) enumMap.keySet().iterator().next());
        }
        return b.f10732e.m11971a(enumMap);
    }

    /* JADX INFO: renamed from: u */
    public static Class<? extends Enum<?>> m11959u(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return m11957s((Enum) enumSet.iterator().next());
        }
        return b.f10732e.m11972b(enumSet);
    }

    /* JADX INFO: renamed from: v */
    public static <T extends Annotation> Enum<?> m11960v(Class<Enum<?>> cls, Class<T> cls2) {
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> r11 : cls.getEnumConstants()) {
                    if (name.equals(r11.name())) {
                        return r11;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static Method[] m11964z(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e11) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                return m11926b(cls, e11);
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (Throwable th2) {
                    return m11926b(cls, th2);
                }
            } catch (ClassNotFoundException e12) {
                e11.addSuppressed(e12);
                return m11926b(cls, e11);
            }
        } catch (Throwable th3) {
            return m11926b(cls, th3);
        }
    }
}
