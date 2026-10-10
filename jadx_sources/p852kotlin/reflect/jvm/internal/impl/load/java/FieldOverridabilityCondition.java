package p852kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* JADX INFO: compiled from: FieldOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public ExternalOverridabilityCondition.Result isOverridable(@NotNull CallableDescriptor superDescriptor, @NotNull CallableDescriptor subDescriptor, @Nullable ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if ((subDescriptor instanceof PropertyDescriptor) && (superDescriptor instanceof PropertyDescriptor)) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) subDescriptor;
            PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) superDescriptor;
            if (!Intrinsics.areEqual(propertyDescriptor.getName(), propertyDescriptor2.getName())) {
                return ExternalOverridabilityCondition.Result.UNKNOWN;
            }
            if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor) && JavaDescriptorUtilKt.isJavaField(propertyDescriptor2)) {
                return ExternalOverridabilityCondition.Result.OVERRIDABLE;
            }
            if (!JavaDescriptorUtilKt.isJavaField(propertyDescriptor) && !JavaDescriptorUtilKt.isJavaField(propertyDescriptor2)) {
                return ExternalOverridabilityCondition.Result.UNKNOWN;
            }
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
