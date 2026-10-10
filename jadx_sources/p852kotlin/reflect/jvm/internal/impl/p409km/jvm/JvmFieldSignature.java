package p852kotlin.reflect.jvm.internal.impl.p409km.jvm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JvmMemberSignature.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmFieldSignature extends JvmMemberSignature {

    @NotNull
    private final String descriptor;

    @NotNull
    private final String name;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JvmFieldSignature)) {
            return false;
        }
        JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) obj;
        return Intrinsics.areEqual(this.name, jvmFieldSignature.name) && Intrinsics.areEqual(this.descriptor, jvmFieldSignature.descriptor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFieldSignature(@NotNull String name, @NotNull String descriptor) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.name = name;
        this.descriptor = descriptor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.jvm.JvmMemberSignature
    @NotNull
    public String getDescriptor() {
        return this.descriptor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.jvm.JvmMemberSignature
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.descriptor.hashCode();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.jvm.JvmMemberSignature
    @NotNull
    public String toString() {
        return getName() + ':' + getDescriptor();
    }
}
