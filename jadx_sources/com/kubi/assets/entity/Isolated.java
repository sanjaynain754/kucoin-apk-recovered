package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/entity/Isolated;", "", "isolatedPositionDetail", "Lcom/kubi/assets/entity/IsolatedPositionDetail;", "execute", "", "hasMore", "totalCount", "", "<init>", "(Lcom/kubi/assets/entity/IsolatedPositionDetail;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getIsolatedPositionDetail", "()Lcom/kubi/assets/entity/IsolatedPositionDetail;", "getExecute", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasMore", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Lcom/kubi/assets/entity/IsolatedPositionDetail;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/kubi/assets/entity/Isolated;", "equals", "other", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Isolated {

    @Nullable
    private final Boolean execute;

    @Nullable
    private final Boolean hasMore;

    @Nullable
    private final IsolatedPositionDetail isolatedPositionDetail;

    @Nullable
    private final Integer totalCount;

    public Isolated() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Isolated)) {
            return false;
        }
        Isolated isolated = (Isolated) other;
        return Intrinsics.areEqual(this.isolatedPositionDetail, isolated.isolatedPositionDetail) && Intrinsics.areEqual(this.execute, isolated.execute) && Intrinsics.areEqual(this.hasMore, isolated.hasMore) && Intrinsics.areEqual(this.totalCount, isolated.totalCount);
    }

    public Isolated(@Nullable IsolatedPositionDetail isolatedPositionDetail, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num) {
        this.isolatedPositionDetail = isolatedPositionDetail;
        this.execute = bool;
        this.hasMore = bool2;
        this.totalCount = num;
    }

    public static /* synthetic */ Isolated copy$default(Isolated isolated, IsolatedPositionDetail isolatedPositionDetail, Boolean bool, Boolean bool2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            isolatedPositionDetail = isolated.isolatedPositionDetail;
        }
        if ((i11 & 2) != 0) {
            bool = isolated.execute;
        }
        if ((i11 & 4) != 0) {
            bool2 = isolated.hasMore;
        }
        if ((i11 & 8) != 0) {
            num = isolated.totalCount;
        }
        return isolated.copy(isolatedPositionDetail, bool, bool2, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IsolatedPositionDetail getIsolatedPositionDetail() {
        return this.isolatedPositionDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getExecute() {
        return this.execute;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final Isolated copy(@Nullable IsolatedPositionDetail isolatedPositionDetail, @Nullable Boolean execute, @Nullable Boolean hasMore, @Nullable Integer totalCount) {
        return new Isolated(isolatedPositionDetail, execute, hasMore, totalCount);
    }

    @Nullable
    public final Boolean getExecute() {
        return this.execute;
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final IsolatedPositionDetail getIsolatedPositionDetail() {
        return this.isolatedPositionDetail;
    }

    @Nullable
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        IsolatedPositionDetail isolatedPositionDetail = this.isolatedPositionDetail;
        int iHashCode = (isolatedPositionDetail == null ? 0 : isolatedPositionDetail.hashCode()) * 31;
        Boolean bool = this.execute;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.totalCount;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Isolated(isolatedPositionDetail=" + this.isolatedPositionDetail + ", execute=" + this.execute + ", hasMore=" + this.hasMore + ", totalCount=" + this.totalCount + ')';
    }

    public /* synthetic */ Isolated(IsolatedPositionDetail isolatedPositionDetail, Boolean bool, Boolean bool2, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : isolatedPositionDetail, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : num);
    }
}
