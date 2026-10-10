package p852kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;

/* JADX INFO: compiled from: JavaClassesTracker.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaClassesTracker {

    /* JADX INFO: compiled from: JavaClassesTracker.kt */
    public static final class Default implements JavaClassesTracker {

        @NotNull
        public static final Default INSTANCE = new Default();

        @Override // p852kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker
        public void reportClass(@NotNull JavaClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        }

        private Default() {
        }
    }

    void reportClass(@NotNull JavaClassDescriptor javaClassDescriptor);
}
