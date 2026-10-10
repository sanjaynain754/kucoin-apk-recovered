package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Throwables {

    @J2ktIncompatible
    @GwtIncompatible
    private static final String JAVA_LANG_ACCESS_CLASSNAME = "sun.misc.JavaLangAccess";

    @VisibleForTesting
    @J2ktIncompatible
    @GwtIncompatible
    static final String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";

    @J2ktIncompatible
    @GwtIncompatible
    private static final Method getStackTraceDepthMethod;

    @J2ktIncompatible
    @GwtIncompatible
    private static final Method getStackTraceElementMethod;

    @J2ktIncompatible
    @GwtIncompatible
    private static final Object jla;

    @J2ktIncompatible
    @GwtIncompatible
    private static Object getJLA() {
        try {
            return Class.forName(SHARED_SECRETS_CLASSNAME, false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e11) {
            throw e11;
        } catch (Throwable unused) {
            return null;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Method getJlaMethod(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName(JAVA_LANG_ACCESS_CLASSNAME, false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e11) {
            throw e11;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable getRootCause(Throwable th2) {
        boolean z11 = false;
        Throwable cause = th2;
        while (true) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                return th2;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z11) {
                cause = cause.getCause();
            }
            z11 = !z11;
            th2 = cause2;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Method getSizeMethod(Object obj) {
        try {
            Method jlaMethod = getJlaMethod("getStackTraceDepth", Throwable.class);
            if (jlaMethod == null) {
                return null;
            }
            jlaMethod.invoke(obj, new Throwable());
            return jlaMethod;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static void propagateIfPossible(Throwable th2) {
        if (th2 != null) {
            throwIfUnchecked(th2);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Method getGetMethod() {
        return getJlaMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @GwtIncompatible
    public static String getStackTraceAsString(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        return (getStackTraceElementMethod == null || getStackTraceDepthMethod == null) ? false : true;
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X extends Throwable> void propagateIfInstanceOf(Throwable th2, Class<X> cls) throws Throwable {
        if (th2 != null) {
            throwIfInstanceOf(th2, cls);
        }
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X extends Throwable> void propagateIfPossible(Throwable th2, Class<X> cls) throws Throwable {
        propagateIfInstanceOf(th2, cls);
        propagateIfPossible(th2);
    }

    static {
        Method getMethod;
        Object jla2 = getJLA();
        jla = jla2;
        Method sizeMethod = null;
        if (jla2 == null) {
            getMethod = null;
        } else {
            getMethod = getGetMethod();
        }
        getStackTraceElementMethod = getMethod;
        if (jla2 != null) {
            sizeMethod = getSizeMethod(jla2);
        }
        getStackTraceDepthMethod = sizeMethod;
    }

    private Throwables() {
    }

    public static List<Throwable> getCausalChain(Throwable th2) {
        Preconditions.checkNotNull(th2);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th2);
        boolean z11 = false;
        Throwable cause = th2;
        while (true) {
            th2 = th2.getCause();
            if (th2 != null) {
                arrayList.add(th2);
                if (th2 != cause) {
                    if (z11) {
                        cause = cause.getCause();
                    }
                    z11 = !z11;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", th2);
                }
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    @GwtIncompatible
    public static <X extends Throwable> X getCauseAs(Throwable th2, Class<X> cls) {
        try {
            return cls.cast(th2.getCause());
        } catch (ClassCastException e11) {
            e11.initCause(th2);
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @J2ktIncompatible
    @GwtIncompatible
    public static Object invokeAccessibleNonThrowingMethod(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw propagate(e12.getCause());
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static List<StackTraceElement> jlaStackTrace(final Throwable th2) {
        Preconditions.checkNotNull(th2);
        return new AbstractList<StackTraceElement>() { // from class: com.google.common.base.Throwables.1
            @Override // java.util.AbstractList, java.util.List
            public StackTraceElement get(int i11) {
                Method method = Throwables.getStackTraceElementMethod;
                java.util.Objects.requireNonNull(method);
                Object obj = Throwables.jla;
                java.util.Objects.requireNonNull(obj);
                return (StackTraceElement) Throwables.invokeAccessibleNonThrowingMethod(method, obj, th2, Integer.valueOf(i11));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                Method method = Throwables.getStackTraceDepthMethod;
                java.util.Objects.requireNonNull(method);
                Object obj = Throwables.jla;
                java.util.Objects.requireNonNull(obj);
                return ((Integer) Throwables.invokeAccessibleNonThrowingMethod(method, obj, th2)).intValue();
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static List<StackTraceElement> lazyStackTrace(Throwable th2) {
        if (lazyStackTraceIsLazy()) {
            return jlaStackTrace(th2);
        }
        return Collections.unmodifiableList(Arrays.asList(th2.getStackTrace()));
    }

    @GwtIncompatible
    @Deprecated
    @CanIgnoreReturnValue
    @J2ktIncompatible
    public static RuntimeException propagate(Throwable th2) {
        throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @GwtIncompatible
    public static <X extends Throwable> void throwIfInstanceOf(Throwable th2, Class<X> cls) throws Throwable {
        Preconditions.checkNotNull(th2);
        if (!cls.isInstance(th2)) {
        } else {
            throw cls.cast(th2);
        }
    }

    public static void throwIfUnchecked(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (!(th2 instanceof RuntimeException)) {
            if (!(th2 instanceof Error)) {
                return;
            } else {
                throw ((Error) th2);
            }
        }
        throw ((RuntimeException) th2);
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(Throwable th2, Class<X1> cls, Class<X2> cls2) throws Throwable {
        Preconditions.checkNotNull(cls2);
        propagateIfInstanceOf(th2, cls);
        propagateIfPossible(th2, cls2);
    }
}
