package com.kubi.kumex.data.trade.model;

import cm.BalancesWrapper;
import cm.PositionsWrapper;
import com.kubi.futures.trade.submit.panel.footer.r0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ComposeUserEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u000fHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/ComposeUserEntity;", "", "positionWrapper", "Lcom/kubi/kumex/data/trade/model/PositionsWrapper;", "balanceWrapper", "Lcom/kubi/kumex/data/trade/model/BalancesWrapper;", "leverageWrapper", "Lcom/kubi/kumex/data/trade/model/LeveragesWrapper;", "isHedge", "", "positionCouples", "", "", "Lcom/kubi/futures/trade/submit/panel/footer/PositionCouple;", "timeStamp", "", "<init>", "(Lcom/kubi/kumex/data/trade/model/PositionsWrapper;Lcom/kubi/kumex/data/trade/model/BalancesWrapper;Lcom/kubi/kumex/data/trade/model/LeveragesWrapper;ZLjava/util/Map;J)V", "getPositionWrapper", "()Lcom/kubi/kumex/data/trade/model/PositionsWrapper;", "getBalanceWrapper", "()Lcom/kubi/kumex/data/trade/model/BalancesWrapper;", "getLeverageWrapper", "()Lcom/kubi/kumex/data/trade/model/LeveragesWrapper;", "()Z", "getPositionCouples", "()Ljava/util/Map;", "getTimeStamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ComposeUserEntity {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f28832g = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final PositionsWrapper positionWrapper;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final BalancesWrapper balanceWrapper;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final LeveragesWrapper leverageWrapper;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final boolean isHedge;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final Map<String, r0> positionCouples;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final long timeStamp;

    /* JADX INFO: compiled from: ComposeUserEntity.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/ComposeUserEntity$Companion;", "", "<init>", "()V", "empty", "Lcom/kubi/kumex/data/trade/model/ComposeUserEntity;", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ComposeUserEntity empty() {
            return new ComposeUserEntity(new PositionsWrapper(CollectionsKt.emptyList(), null), new BalancesWrapper(CollectionsKt.emptyList(), null), LeveragesWrapper.f28839c.getDEFAULT(), false, MapsKt.emptyMap(), 0L, 32, null);
        }
    }

    public ComposeUserEntity(@NotNull PositionsWrapper positionWrapper, @NotNull BalancesWrapper balanceWrapper, @NotNull LeveragesWrapper leverageWrapper, boolean z11, @NotNull Map<String, r0> positionCouples, long j11) {
        Intrinsics.checkNotNullParameter(positionWrapper, "positionWrapper");
        Intrinsics.checkNotNullParameter(balanceWrapper, "balanceWrapper");
        Intrinsics.checkNotNullParameter(leverageWrapper, "leverageWrapper");
        Intrinsics.checkNotNullParameter(positionCouples, "positionCouples");
        this.positionWrapper = positionWrapper;
        this.balanceWrapper = balanceWrapper;
        this.leverageWrapper = leverageWrapper;
        this.isHedge = z11;
        this.positionCouples = positionCouples;
        this.timeStamp = j11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeUserEntity)) {
            return false;
        }
        ComposeUserEntity composeUserEntity = (ComposeUserEntity) other;
        return Intrinsics.areEqual(this.positionWrapper, composeUserEntity.positionWrapper) && Intrinsics.areEqual(this.balanceWrapper, composeUserEntity.balanceWrapper) && Intrinsics.areEqual(this.leverageWrapper, composeUserEntity.leverageWrapper) && this.isHedge == composeUserEntity.isHedge && Intrinsics.areEqual(this.positionCouples, composeUserEntity.positionCouples) && this.timeStamp == composeUserEntity.timeStamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ComposeUserEntity m33451b(ComposeUserEntity composeUserEntity, PositionsWrapper positionsWrapper, BalancesWrapper balancesWrapper, LeveragesWrapper leveragesWrapper, boolean z11, Map map, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            positionsWrapper = composeUserEntity.positionWrapper;
        }
        if ((i11 & 2) != 0) {
            balancesWrapper = composeUserEntity.balanceWrapper;
        }
        if ((i11 & 4) != 0) {
            leveragesWrapper = composeUserEntity.leverageWrapper;
        }
        if ((i11 & 8) != 0) {
            z11 = composeUserEntity.isHedge;
        }
        if ((i11 & 16) != 0) {
            map = composeUserEntity.positionCouples;
        }
        if ((i11 & 32) != 0) {
            j11 = composeUserEntity.timeStamp;
        }
        long j12 = j11;
        Map map2 = map;
        LeveragesWrapper leveragesWrapper2 = leveragesWrapper;
        return composeUserEntity.m33452a(positionsWrapper, balancesWrapper, leveragesWrapper2, z11, map2, j12);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ComposeUserEntity m33452a(@NotNull PositionsWrapper positionWrapper, @NotNull BalancesWrapper balanceWrapper, @NotNull LeveragesWrapper leverageWrapper, boolean z11, @NotNull Map<String, r0> positionCouples, long j11) {
        Intrinsics.checkNotNullParameter(positionWrapper, "positionWrapper");
        Intrinsics.checkNotNullParameter(balanceWrapper, "balanceWrapper");
        Intrinsics.checkNotNullParameter(leverageWrapper, "leverageWrapper");
        Intrinsics.checkNotNullParameter(positionCouples, "positionCouples");
        return new ComposeUserEntity(positionWrapper, balanceWrapper, leverageWrapper, z11, positionCouples, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BalancesWrapper getBalanceWrapper() {
        return this.balanceWrapper;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final LeveragesWrapper getLeverageWrapper() {
        return this.leverageWrapper;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Map<String, r0> m33455e() {
        return this.positionCouples;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final PositionsWrapper getPositionWrapper() {
        return this.positionWrapper;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsHedge() {
        return this.isHedge;
    }

    public int hashCode() {
        return (((((((((this.positionWrapper.hashCode() * 31) + this.balanceWrapper.hashCode()) * 31) + this.leverageWrapper.hashCode()) * 31) + Boolean.hashCode(this.isHedge)) * 31) + this.positionCouples.hashCode()) * 31) + Long.hashCode(this.timeStamp);
    }

    @NotNull
    public String toString() {
        return "ComposeUserEntity(positionWrapper=" + this.positionWrapper + ", balanceWrapper=" + this.balanceWrapper + ", leverageWrapper=" + this.leverageWrapper + ", isHedge=" + this.isHedge + ", positionCouples=" + this.positionCouples + ", timeStamp=" + this.timeStamp + ')';
    }

    public /* synthetic */ ComposeUserEntity(PositionsWrapper positionsWrapper, BalancesWrapper balancesWrapper, LeveragesWrapper leveragesWrapper, boolean z11, Map map, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(positionsWrapper, balancesWrapper, leveragesWrapper, z11, map, (i11 & 32) != 0 ? System.currentTimeMillis() : j11);
    }
}
