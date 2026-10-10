package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/entity/OnGoingEntity;", "", ViewProps.MARGIN, "Lcom/kubi/assets/entity/Margin;", "isolated", "Lcom/kubi/assets/entity/Isolated;", "robot", "Lcom/kubi/assets/entity/Robot;", "pool", "Lcom/kubi/assets/entity/Pool;", "copyTrading", "Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;", "leadTrading", "Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;", "<init>", "(Lcom/kubi/assets/entity/Margin;Lcom/kubi/assets/entity/Isolated;Lcom/kubi/assets/entity/Robot;Lcom/kubi/assets/entity/Pool;Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;)V", "getMargin", "()Lcom/kubi/assets/entity/Margin;", "getIsolated", "()Lcom/kubi/assets/entity/Isolated;", "getRobot", "()Lcom/kubi/assets/entity/Robot;", "getPool", "()Lcom/kubi/assets/entity/Pool;", "getCopyTrading", "()Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;", "getLeadTrading", "()Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OnGoingEntity {

    @Nullable
    private final CopyTradingOnGoingEntity copyTrading;

    @Nullable
    private final Isolated isolated;

    @Nullable
    private final LeadTradingOnGoingEntity leadTrading;

    @Nullable
    private final Margin margin;

    @Nullable
    private final Pool pool;

    @Nullable
    private final Robot robot;

    public OnGoingEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnGoingEntity)) {
            return false;
        }
        OnGoingEntity onGoingEntity = (OnGoingEntity) other;
        return Intrinsics.areEqual(this.margin, onGoingEntity.margin) && Intrinsics.areEqual(this.isolated, onGoingEntity.isolated) && Intrinsics.areEqual(this.robot, onGoingEntity.robot) && Intrinsics.areEqual(this.pool, onGoingEntity.pool) && Intrinsics.areEqual(this.copyTrading, onGoingEntity.copyTrading) && Intrinsics.areEqual(this.leadTrading, onGoingEntity.leadTrading);
    }

    public OnGoingEntity(@Nullable Margin margin, @Nullable Isolated isolated, @Nullable Robot robot, @Nullable Pool pool, @Nullable CopyTradingOnGoingEntity copyTradingOnGoingEntity, @Nullable LeadTradingOnGoingEntity leadTradingOnGoingEntity) {
        this.margin = margin;
        this.isolated = isolated;
        this.robot = robot;
        this.pool = pool;
        this.copyTrading = copyTradingOnGoingEntity;
        this.leadTrading = leadTradingOnGoingEntity;
    }

    public static /* synthetic */ OnGoingEntity copy$default(OnGoingEntity onGoingEntity, Margin margin, Isolated isolated, Robot robot, Pool pool, CopyTradingOnGoingEntity copyTradingOnGoingEntity, LeadTradingOnGoingEntity leadTradingOnGoingEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            margin = onGoingEntity.margin;
        }
        if ((i11 & 2) != 0) {
            isolated = onGoingEntity.isolated;
        }
        if ((i11 & 4) != 0) {
            robot = onGoingEntity.robot;
        }
        if ((i11 & 8) != 0) {
            pool = onGoingEntity.pool;
        }
        if ((i11 & 16) != 0) {
            copyTradingOnGoingEntity = onGoingEntity.copyTrading;
        }
        if ((i11 & 32) != 0) {
            leadTradingOnGoingEntity = onGoingEntity.leadTrading;
        }
        CopyTradingOnGoingEntity copyTradingOnGoingEntity2 = copyTradingOnGoingEntity;
        LeadTradingOnGoingEntity leadTradingOnGoingEntity2 = leadTradingOnGoingEntity;
        return onGoingEntity.copy(margin, isolated, robot, pool, copyTradingOnGoingEntity2, leadTradingOnGoingEntity2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Margin getMargin() {
        return this.margin;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Isolated getIsolated() {
        return this.isolated;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Robot getRobot() {
        return this.robot;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Pool getPool() {
        return this.pool;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CopyTradingOnGoingEntity getCopyTrading() {
        return this.copyTrading;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LeadTradingOnGoingEntity getLeadTrading() {
        return this.leadTrading;
    }

    @NotNull
    public final OnGoingEntity copy(@Nullable Margin margin, @Nullable Isolated isolated, @Nullable Robot robot, @Nullable Pool pool, @Nullable CopyTradingOnGoingEntity copyTrading, @Nullable LeadTradingOnGoingEntity leadTrading) {
        return new OnGoingEntity(margin, isolated, robot, pool, copyTrading, leadTrading);
    }

    @Nullable
    public final CopyTradingOnGoingEntity getCopyTrading() {
        return this.copyTrading;
    }

    @Nullable
    public final Isolated getIsolated() {
        return this.isolated;
    }

    @Nullable
    public final LeadTradingOnGoingEntity getLeadTrading() {
        return this.leadTrading;
    }

    @Nullable
    public final Margin getMargin() {
        return this.margin;
    }

    @Nullable
    public final Pool getPool() {
        return this.pool;
    }

    @Nullable
    public final Robot getRobot() {
        return this.robot;
    }

    public int hashCode() {
        Margin margin = this.margin;
        int iHashCode = (margin == null ? 0 : margin.hashCode()) * 31;
        Isolated isolated = this.isolated;
        int iHashCode2 = (iHashCode + (isolated == null ? 0 : isolated.hashCode())) * 31;
        Robot robot = this.robot;
        int iHashCode3 = (iHashCode2 + (robot == null ? 0 : robot.hashCode())) * 31;
        Pool pool = this.pool;
        int iHashCode4 = (iHashCode3 + (pool == null ? 0 : pool.hashCode())) * 31;
        CopyTradingOnGoingEntity copyTradingOnGoingEntity = this.copyTrading;
        int iHashCode5 = (iHashCode4 + (copyTradingOnGoingEntity == null ? 0 : copyTradingOnGoingEntity.hashCode())) * 31;
        LeadTradingOnGoingEntity leadTradingOnGoingEntity = this.leadTrading;
        return iHashCode5 + (leadTradingOnGoingEntity != null ? leadTradingOnGoingEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OnGoingEntity(margin=" + this.margin + ", isolated=" + this.isolated + ", robot=" + this.robot + ", pool=" + this.pool + ", copyTrading=" + this.copyTrading + ", leadTrading=" + this.leadTrading + ')';
    }

    public /* synthetic */ OnGoingEntity(Margin margin, Isolated isolated, Robot robot, Pool pool, CopyTradingOnGoingEntity copyTradingOnGoingEntity, LeadTradingOnGoingEntity leadTradingOnGoingEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : margin, (i11 & 2) != 0 ? null : isolated, (i11 & 4) != 0 ? null : robot, (i11 & 8) != 0 ? null : pool, (i11 & 16) != 0 ? null : copyTradingOnGoingEntity, (i11 & 32) != 0 ? null : leadTradingOnGoingEntity);
    }
}
