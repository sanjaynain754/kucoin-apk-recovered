package p852kotlin.reflect.jvm.internal.impl.resolve.deprecation;

/* JADX INFO: compiled from: DescriptorBasedDeprecationInfo.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class DescriptorBasedDeprecationInfo extends DeprecationInfo {
    public boolean getForcePropagationToOverrides() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    public boolean getPropagatesToOverrides() {
        return getForcePropagationToOverrides();
    }
}
