package p852kotlin.reflect.jvm.internal.impl.resolve;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: compiled from: OverridingStrategy.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class NonReportingOverrideStrategy extends OverridingStrategy {
    public abstract void conflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void inheritanceConflict(@NotNull CallableMemberDescriptor first, @NotNull CallableMemberDescriptor second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        conflict(first, second);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void overrideConflict(@NotNull CallableMemberDescriptor fromSuper, @NotNull CallableMemberDescriptor fromCurrent) {
        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
        conflict(fromSuper, fromCurrent);
    }
}
