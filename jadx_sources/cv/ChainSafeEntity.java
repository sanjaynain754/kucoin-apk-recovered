package cv;

import com.tencent.bugly.proguard.C33556b3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cv.b, reason: from toString */
/* JADX INFO: compiled from: ChainSafeEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChainSafeEntity;", "", C33556b3.f68963J, "", "explain", "", "safeLevel", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getDetail", "()Ljava/lang/String;", "setDetail", "(Ljava/lang/String;)V", "getExplain", "()Ljava/lang/Boolean;", "setExplain", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSafeLevel", "setSafeLevel", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/quotefacade/entity/ChainSafeEntity;", "equals", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChainSafeEntity {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public String detail;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public Boolean explain;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public Boolean safeLevel;

    public ChainSafeEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChainSafeEntity)) {
            return false;
        }
        ChainSafeEntity chainSafeEntity = (ChainSafeEntity) other;
        return Intrinsics.areEqual(this.detail, chainSafeEntity.detail) && Intrinsics.areEqual(this.explain, chainSafeEntity.explain) && Intrinsics.areEqual(this.safeLevel, chainSafeEntity.safeLevel);
    }

    public ChainSafeEntity(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.detail = str;
        this.explain = bool;
        this.safeLevel = bool2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getExplain() {
        return this.explain;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getSafeLevel() {
        return this.safeLevel;
    }

    public int hashCode() {
        String str = this.detail;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.explain;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.safeLevel;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChainSafeEntity(detail=" + this.detail + ", explain=" + this.explain + ", safeLevel=" + this.safeLevel + ')';
    }

    public /* synthetic */ ChainSafeEntity(String str, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? Boolean.FALSE : bool, (i11 & 4) != 0 ? Boolean.FALSE : bool2);
    }
}
