package com.facebook.react.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClassFinder.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m90084d2 = {"Lcom/facebook/react/common/ClassFinder;", "", "<init>", "()V", "canLoadClassesFromAnnotationProcessors", "", "findClass", "Ljava/lang/Class;", "className", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ClassFinder {

    @NotNull
    public static final ClassFinder INSTANCE = new ClassFinder();

    @JvmStatic
    public static final boolean canLoadClassesFromAnnotationProcessors() {
        return false;
    }

    @JvmStatic
    @Nullable
    public static final Class<?> findClass(@NotNull String className) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(className, "className");
        if (canLoadClassesFromAnnotationProcessors()) {
            return Class.forName(className);
        }
        return null;
    }

    private ClassFinder() {
    }
}
