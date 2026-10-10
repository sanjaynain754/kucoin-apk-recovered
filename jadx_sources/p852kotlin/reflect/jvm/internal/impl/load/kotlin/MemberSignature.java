package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* JADX INFO: compiled from: MemberSignature.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class MemberSignature {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String signature;

    /* JADX INFO: compiled from: MemberSignature.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromFieldNameAndDesc(@NotNull String name, @NotNull String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new MemberSignature(name + '#' + desc, null);
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethod(@NotNull NameResolver nameResolver, @NotNull JvmProtoBuf.JvmMethodSignature signature) {
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(signature, "signature");
            return fromMethodNameAndDesc(nameResolver.getString(signature.getName()), nameResolver.getString(signature.getDesc()));
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethodNameAndDesc(@NotNull String name, @NotNull String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new MemberSignature(name + desc, null);
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromJvmMemberSignature(@NotNull JvmMemberSignature signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            if (signature instanceof JvmMemberSignature.Method) {
                JvmMemberSignature.Method method = (JvmMemberSignature.Method) signature;
                return fromMethodNameAndDesc(method.getName(), method.getDesc());
            }
            if (signature instanceof JvmMemberSignature.Field) {
                JvmMemberSignature.Field field = (JvmMemberSignature.Field) signature;
                return fromFieldNameAndDesc(field.getName(), field.getDesc());
            }
            throw new NoWhenBranchMatchedException();
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethodSignatureAndParameterIndex(@NotNull MemberSignature signature, int i11) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            return new MemberSignature(signature.getSignature() + '@' + i11, null);
        }
    }

    public /* synthetic */ MemberSignature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && Intrinsics.areEqual(this.signature, ((MemberSignature) obj).signature);
    }

    private MemberSignature(String str) {
        this.signature = str;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.signature.hashCode();
    }

    @NotNull
    public String toString() {
        return "MemberSignature(signature=" + this.signature + ')';
    }
}
