package p852kotlin.reflect.jvm.internal.impl.p409km;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class KmTypeProjection {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final KmTypeProjection STAR = new KmTypeProjection(null, null);

    @Nullable
    private KmType type;

    @Nullable
    private KmVariance variance;

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
        if (!(obj instanceof KmTypeProjection)) {
            return false;
        }
        KmTypeProjection kmTypeProjection = (KmTypeProjection) obj;
        return this.variance == kmTypeProjection.variance && Intrinsics.areEqual(this.type, kmTypeProjection.type);
    }

    @Nullable
    public final KmVariance component1() {
        return this.variance;
    }

    @Nullable
    public final KmType component2() {
        return this.type;
    }

    public int hashCode() {
        KmVariance kmVariance = this.variance;
        int iHashCode = (kmVariance == null ? 0 : kmVariance.hashCode()) * 31;
        KmType kmType = this.type;
        return iHashCode + (kmType != null ? kmType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KmTypeProjection(variance=" + this.variance + ", type=" + this.type + ')';
    }

    public KmTypeProjection(@Nullable KmVariance kmVariance, @Nullable KmType kmType) {
        this.variance = kmVariance;
        this.type = kmType;
    }
}
