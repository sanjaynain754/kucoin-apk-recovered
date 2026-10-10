package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;

/* JADX INFO: compiled from: RuntimeErrorReporter.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class RuntimeErrorReporter implements ErrorReporter {

    @NotNull
    public static final RuntimeErrorReporter INSTANCE = new RuntimeErrorReporter();

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void reportCannotInferVisibility(@NotNull CallableMemberDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void reportIncompleteHierarchy(@NotNull ClassDescriptor descriptor, @NotNull List<String> unresolvedSuperClasses) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }

    private RuntimeErrorReporter() {
    }
}
