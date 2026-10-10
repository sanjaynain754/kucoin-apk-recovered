package p852kotlin.jvm.internal;

import com.tencent.bugly.proguard.C33978va;
import java.util.Arrays;
import p852kotlin.KotlinNullPointerException;
import p852kotlin.SinceKotlin;
import p852kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes23.dex */
public class Intrinsics {
    public static boolean areEqual(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void checkFieldIsNotNull(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException("Field specified as non-null is null: " + str + C33978va.f72339h + str2)));
    }

    public static void checkHasClass(String str) throws ClassNotFoundException {
        String strReplace = str.replace('/', '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e11) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException("Class " + strReplace + " is not found. Please update the Kotlin runtime to the latest version", e11)));
        }
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throwJavaNpe();
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException("Method specified as non-null returned null: " + str + C33978va.f72339h + str2)));
    }

    public static int compare(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i11 == i12 ? 0 : 1;
    }

    public static void needClassReification() {
        throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int i11, String str) {
        throwUndefinedForReified();
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t11) {
        return (T) sanitizeStackTrace(t11, Intrinsics.class.getName());
    }

    public static void throwAssert() {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError()));
    }

    public static void throwIllegalArgument() {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException()));
    }

    public static void throwIllegalState() {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException()));
    }

    @SinceKotlin(version = "1.4")
    public static void throwJavaNpe() {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException()));
    }

    public static void throwNpe() {
        throw ((KotlinNullPointerException) sanitizeStackTrace(new KotlinNullPointerException()));
    }

    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX INFO: loaded from: classes61.dex */
    @SinceKotlin(version = "1.4")
    public static class Kotlin {
        private Kotlin() {
        }
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Double d11, Double d12) {
        if (d11 == null) {
            return d12 == null;
        }
        return d12 != null && d11.doubleValue() == d12.doubleValue();
    }

    public static void checkExpressionValueIsNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str + " must not be null")));
    }

    public static void checkFieldIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throwJavaNpe(str);
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(str + " must not be null")));
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullNPE(str);
        }
    }

    public static void checkParameterIsNotNull(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullIAE(str);
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static int compare(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    public static void needClassReification(String str) {
        throwUndefinedForReified(str);
    }

    public static void reifiedOperationMarker(int i11, String str, String str2) {
        throwUndefinedForReified(str2);
    }

    public static <T extends Throwable> T sanitizeStackTrace(T t11, String str) {
        StackTraceElement[] stackTrace = t11.getStackTrace();
        int length = stackTrace.length;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.equals(stackTrace[i12].getClassName())) {
                i11 = i12;
            }
        }
        t11.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i11 + 1, length));
        return t11;
    }

    public static String stringPlus(String str, Object obj) {
        return str + obj;
    }

    public static void throwAssert(String str) {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError(str)));
    }

    public static void throwIllegalArgument(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(str)));
    }

    public static void throwIllegalState(String str) {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
    }

    @SinceKotlin(version = "1.4")
    public static void throwJavaNpe(String str) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(str)));
    }

    public static void throwNpe(String str) {
        throw ((KotlinNullPointerException) sanitizeStackTrace(new KotlinNullPointerException(str)));
    }

    private static void throwParameterIsNullIAE(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(createParameterIsNullExceptionMessage(str))));
    }

    private static void throwParameterIsNullNPE(String str) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(createParameterIsNullExceptionMessage(str))));
    }

    public static void throwUndefinedForReified(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void throwUninitializedProperty(String str) {
        throw ((UninitializedPropertyAccessException) sanitizeStackTrace(new UninitializedPropertyAccessException(str)));
    }

    public static void throwUninitializedPropertyAccessException(String str) {
        throwUninitializedProperty("lateinit property " + str + " has not been initialized");
    }

    private Intrinsics() {
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Double d11, double d12) {
        return d11 != null && d11.doubleValue() == d12;
    }

    private static String createParameterIsNullExceptionMessage(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i11 = 0;
        while (!stackTrace[i11].getClassName().equals(name)) {
            i11++;
        }
        while (stackTrace[i11].getClassName().equals(name)) {
            i11++;
        }
        StackTraceElement stackTraceElement = stackTrace[i11];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + C33978va.f72339h + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(double d11, Double d12) {
        return d12 != null && d11 == d12.doubleValue();
    }

    public static void checkHasClass(String str, String str2) throws ClassNotFoundException {
        String strReplace = str.replace('/', '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e11) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException("Class " + strReplace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e11)));
        }
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Float f11, Float f12) {
        if (f11 == null) {
            return f12 == null;
        }
        return f12 != null && f11.floatValue() == f12.floatValue();
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Float f11, float f12) {
        return f11 != null && f11.floatValue() == f12;
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(float f11, Float f12) {
        return f12 != null && f11 == f12.floatValue();
    }
}
