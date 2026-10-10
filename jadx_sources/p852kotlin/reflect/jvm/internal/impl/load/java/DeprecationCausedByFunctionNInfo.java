package p852kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DeprecationCausedByFunctionNInfo extends DescriptorBasedDeprecationInfo {

    @NotNull
    private final DeclarationDescriptor target;

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    @NotNull
    public DeprecationLevelValue getDeprecationLevel() {
        return DeprecationLevelValue.ERROR;
    }

    public DeprecationCausedByFunctionNInfo(@NotNull DeclarationDescriptor target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.target = target;
    }
}
