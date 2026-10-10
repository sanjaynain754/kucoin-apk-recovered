package p852kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;

/* JADX INFO: compiled from: ModuleClassResolver.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface ModuleClassResolver {
    @Nullable
    ClassDescriptor resolveClass(@NotNull JavaClass javaClass);
}
