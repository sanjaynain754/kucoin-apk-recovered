package com.jumio.core.util;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\rJ[\u0010\u000e\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0010J=\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\u0013\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\f\"\b\u0012\u0002\b\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\u0014J,\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001J\u0016\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\tJ\"\u0010\u001e\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aJ7\u0010\u001f\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0018\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\tJ\f\u0010\"\u001a\u00020\u0016*\u00020\u0012H\u0002J\u0014\u0010#\u001a\u00020\u0016*\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0002¨\u0006&"}, m90084d2 = {"Lcom/jumio/core/util/ReflectionUtil;", "", "<init>", "()V", "invokeVoidMethod", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "methodName", "", "target", ReportDataTable.COLUMN_PARAMS, "", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "invokeMethodWithArgs", "argTypes", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "getMethod", "Ljava/lang/reflect/Method;", "actualParamTypes", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "setStaticMember", "", "targetClass", "fieldName", "forceAccess", "", "newValue", "getClass", "className", "getStaticMember", "getMember", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Z)Ljava/lang/Object;", "hasClass", "makeAccessible", "shouldSetAccessible", "Ljava/lang/reflect/Field;", "accessible", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ReflectionUtil {

    @NotNull
    public static final ReflectionUtil INSTANCE = new ReflectionUtil();

    @Nullable
    public final Class<?> getClass(@Nullable String className) {
        if (className != null) {
            try {
                if (className.length() != 0) {
                    return Class.forName(className);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean hasClass(@Nullable String className) {
        if (className != null) {
            try {
                if (className.length() != 0) {
                    Class.forName(className);
                    return true;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        return false;
    }

    public final <T> T getMember(@NotNull Class<?> clazz, @NotNull String fieldName, @Nullable Object target, boolean forceAccess) throws IllegalAccessException, NoSuchFieldException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Field declaredField = clazz.getDeclaredField(fieldName);
        Intrinsics.checkNotNull(declaredField);
        if (forceAccess) {
            declaredField.setAccessible(true);
        }
        return (T) declaredField.get(target);
    }

    @Nullable
    public final Method getMethod(@NotNull Object target, @NotNull String methodName, @NotNull Class<?>... actualParamTypes) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(actualParamTypes, "actualParamTypes");
        if (actualParamTypes.length == 0 || actualParamTypes[0] == null) {
            Iterator it = ArrayIteratorKt.iterator(target.getClass().getDeclaredMethods());
            while (it.hasNext()) {
                Method method = (Method) it.next();
                String name = method.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.contains$default((CharSequence) name, (CharSequence) methodName, false, 2, (Object) null)) {
                    return method;
                }
            }
            return null;
        }
        Iterator it2 = ArrayIteratorKt.iterator(target.getClass().getDeclaredMethods());
        while (it2.hasNext()) {
            Method method2 = (Method) it2.next();
            if (Intrinsics.areEqual(method2.getName(), methodName)) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (actualParamTypes.length == parameterTypes.length) {
                    int length = actualParamTypes.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        Class<?> cls = actualParamTypes[i11];
                        if (cls == null || parameterTypes[i11].isAssignableFrom(cls)) {
                        }
                    }
                    return method2;
                }
                continue;
            }
        }
        return target.getClass().getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(actualParamTypes, actualParamTypes.length));
    }

    @NotNull
    public final Object getStaticMember(@NotNull Class<?> targetClass, @NotNull String fieldName, boolean forceAccess) throws IllegalAccessException, NoSuchFieldException {
        Intrinsics.checkNotNullParameter(targetClass, "targetClass");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Field declaredField = targetClass.getDeclaredField(fieldName);
        Intrinsics.checkNotNull(declaredField);
        if (forceAccess) {
            declaredField.setAccessible(true);
        }
        Object obj = declaredField.get(null);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return obj;
    }

    @Nullable
    public final <T> T invokeMethodWithArgs(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull Class<?>[] argTypes, @Nullable Object target, @NotNull Object... params) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            Method declaredMethod = argTypes.length == 1 ? clazz.getDeclaredMethod(methodName, argTypes[0]) : clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(argTypes, argTypes.length));
            Intrinsics.checkNotNull(declaredMethod);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            return (T) declaredMethod.invoke(target, Arrays.copyOf(params, params.length));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public final <T> T invokeVoidMethod(@NotNull Class<?> clazz, @NotNull String methodName, @Nullable Object target, @NotNull Object... params) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            Method declaredMethod = clazz.getDeclaredMethod(methodName, new Class[0]);
            Intrinsics.checkNotNull(declaredMethod);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            return (T) declaredMethod.invoke(target, Arrays.copyOf(params, params.length));
        } catch (Exception unused) {
            return null;
        }
    }

    public final void setStaticMember(@NotNull Class<?> targetClass, @NotNull String fieldName, boolean forceAccess, @Nullable Object newValue) throws IllegalAccessException, NoSuchFieldException {
        Intrinsics.checkNotNullParameter(targetClass, "targetClass");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Field declaredField = targetClass.getDeclaredField(fieldName);
        Intrinsics.checkNotNull(declaredField);
        if (forceAccess) {
            declaredField.setAccessible(true);
        }
        declaredField.set(null, newValue);
    }
}
