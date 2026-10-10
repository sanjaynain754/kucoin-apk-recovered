package p852kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: compiled from: ImplicitClassReceiver.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface ThisClassReceiver extends ReceiverValue {
    @NotNull
    ClassDescriptor getClassDescriptor();
}
