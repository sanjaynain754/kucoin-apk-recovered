package p852kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: SuperCallReceiverValue.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface SuperCallReceiverValue extends ReceiverValue {
    @NotNull
    KotlinType getThisType();
}
