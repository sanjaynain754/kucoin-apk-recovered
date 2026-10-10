package com.tencent.bugly.common.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\r"}, m90084d2 = {"Lcom/tencent/bugly/common/util/ClassUtil;", "", "()V", "classAvailable", "", "className", "", "getClassName", "obj", "withIndex", "", "(Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/String;", "objectIsInstanceClass", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ClassUtil {

    @NotNull
    public static final ClassUtil INSTANCE = new ClassUtil();

    @JvmStatic
    public static final boolean classAvailable(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static /* synthetic */ String getClassName$default(Object obj, Integer num, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        return getClassName(obj, num);
    }

    @JvmStatic
    public static final boolean objectIsInstanceClass(@Nullable Object obj, @NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        if (obj == null) {
            return false;
        }
        try {
            return Class.forName(className).isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private ClassUtil() {
    }

    @JvmStatic
    @NotNull
    public static final String getClassName(@NotNull Object obj, @Nullable Integer withIndex) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (withIndex != null) {
            String str = obj.getClass().getName() + '[' + withIndex.intValue() + ']';
            if (str != null) {
                return str;
            }
        }
        String name = obj.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "obj.javaClass.name");
        return name;
    }
}
