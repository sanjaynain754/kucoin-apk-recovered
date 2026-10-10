package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeserializedContainerSource.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class PreReleaseInfo {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final PreReleaseInfo DEFAULT_VISIBLE = new PreReleaseInfo(false, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    private final boolean isInvisible;

    @NotNull
    private final List<String> poisoningFeatures;

    /* JADX INFO: compiled from: DeserializedContainerSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PreReleaseInfo(boolean z11, @NotNull List<String> poisoningFeatures) {
        Intrinsics.checkNotNullParameter(poisoningFeatures, "poisoningFeatures");
        this.isInvisible = z11;
        this.poisoningFeatures = poisoningFeatures;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreReleaseInfo)) {
            return false;
        }
        PreReleaseInfo preReleaseInfo = (PreReleaseInfo) obj;
        return this.isInvisible == preReleaseInfo.isInvisible && Intrinsics.areEqual(this.poisoningFeatures, preReleaseInfo.poisoningFeatures);
    }

    public /* synthetic */ PreReleaseInfo(boolean z11, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isInvisible) * 31) + this.poisoningFeatures.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreReleaseInfo(isInvisible=" + this.isInvisible + ", poisoningFeatures=" + this.poisoningFeatures + ')';
    }
}
