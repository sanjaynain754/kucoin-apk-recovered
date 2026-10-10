package p852kotlin.reflect.jvm.internal.impl.p409km.jvm;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: JvmMemberSignature.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class JvmMemberSignature {
    public /* synthetic */ JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getDescriptor();

    @NotNull
    public abstract String getName();

    @NotNull
    public abstract String toString();

    private JvmMemberSignature() {
    }
}
