package p852kotlin.reflect.jvm.internal.impl.p409km;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class KmFlexibleTypeUpperBound {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private KmType type;

    @Nullable
    private String typeFlexibilityId;

    /* JADX INFO: compiled from: Nodes.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmFlexibleTypeUpperBound)) {
            return false;
        }
        KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound = (KmFlexibleTypeUpperBound) obj;
        return Intrinsics.areEqual(this.type, kmFlexibleTypeUpperBound.type) && Intrinsics.areEqual(this.typeFlexibilityId, kmFlexibleTypeUpperBound.typeFlexibilityId);
    }

    @NotNull
    public final KmType getType() {
        return this.type;
    }

    @Nullable
    public final String getTypeFlexibilityId() {
        return this.typeFlexibilityId;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.typeFlexibilityId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "KmFlexibleTypeUpperBound(type=" + this.type + ", typeFlexibilityId=" + this.typeFlexibilityId + ')';
    }

    public KmFlexibleTypeUpperBound(@NotNull KmType type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.typeFlexibilityId = str;
    }
}
