package p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JvmMemberSignature.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class JvmMemberSignature {

    /* JADX INFO: compiled from: JvmMemberSignature.kt */
    public static final class Field extends JvmMemberSignature {

        @NotNull
        private final String desc;

        @NotNull
        private final String name;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.areEqual(this.name, field.name) && Intrinsics.areEqual(this.desc, field.desc);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(@NotNull String name, @NotNull String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.name = name;
            this.desc = desc;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return getName() + ':' + getDesc();
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.desc;
        }

        @NotNull
        public String getDesc() {
            return this.desc;
        }

        @NotNull
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.desc.hashCode();
        }
    }

    /* JADX INFO: compiled from: JvmMemberSignature.kt */
    public static final class Method extends JvmMemberSignature {

        @NotNull
        private final String desc;

        @NotNull
        private final String name;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return Intrinsics.areEqual(this.name, method.name) && Intrinsics.areEqual(this.desc, method.desc);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(@NotNull String name, @NotNull String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.name = name;
            this.desc = desc;
        }

        public static /* synthetic */ Method copy$default(Method method, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = method.name;
            }
            if ((i11 & 2) != 0) {
                str2 = method.desc;
            }
            return method.copy(str, str2);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return getName() + getDesc();
        }

        @NotNull
        public final Method copy(@NotNull String name, @NotNull String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new Method(name, desc);
        }

        @NotNull
        public String getDesc() {
            return this.desc;
        }

        @NotNull
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.desc.hashCode();
        }
    }

    public /* synthetic */ JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String asString();

    private JvmMemberSignature() {
    }

    @NotNull
    public final String toString() {
        return asString();
    }
}
