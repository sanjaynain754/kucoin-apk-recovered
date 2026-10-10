package p852kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;

/* JADX INFO: compiled from: DescriptorBasedDeprecationInfo.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DescriptorBasedDeprecationInfoKt {

    @NotNull
    private static final CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo> DEPRECATED_FUNCTION_KEY = new CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt$DEPRECATED_FUNCTION_KEY$1
    };

    @NotNull
    public static final CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo> getDEPRECATED_FUNCTION_KEY() {
        return DEPRECATED_FUNCTION_KEY;
    }
}
