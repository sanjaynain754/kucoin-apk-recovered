package p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface PlatformDependentDeclarationFilter {

    /* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class All implements PlatformDependentDeclarationFilter {

        @NotNull
        public static final All INSTANCE = new All();

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return true;
        }

        private All() {
        }
    }

    /* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class NoPlatformDependent implements PlatformDependentDeclarationFilter {

        @NotNull
        public static final NoPlatformDependent INSTANCE = new NoPlatformDependent();

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME());
        }

        private NoPlatformDependent() {
        }
    }

    boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor);
}
