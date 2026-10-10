package p852kotlin.reflect.jvm.internal.impl.p409km.jvm;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* JADX INFO: compiled from: JvmMemberSignature.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmMemberSignatureKt {
    @NotNull
    public static final JvmMethodSignature wrapAsPublic(@NotNull JvmMemberSignature.Method method) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        return new JvmMethodSignature(method.getName(), method.getDesc());
    }

    @NotNull
    public static final JvmFieldSignature wrapAsPublic(@NotNull JvmMemberSignature.Field field) {
        Intrinsics.checkNotNullParameter(field, "<this>");
        return new JvmFieldSignature(field.getName(), field.getDesc());
    }
}
