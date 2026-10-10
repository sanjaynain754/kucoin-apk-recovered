package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes61.dex */
public interface SimpleFunctionDescriptor extends FunctionDescriptor {
    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder();
}
