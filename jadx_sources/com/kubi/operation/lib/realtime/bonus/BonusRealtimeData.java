package com.kubi.operation.lib.realtime.bonus;

import androidx.annotation.Keep;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.RealTimeViewType;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BonusRealtimeData.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;", "Lcom/kubi/home/realtime/IRealTimeData;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/operation/lib/realtime/bonus/BonusItemEntity;", "<init>", "(Lcom/kubi/operation/lib/realtime/bonus/BonusItemEntity;)V", "getEntity", "()Lcom/kubi/operation/lib/realtime/bonus/BonusItemEntity;", "businessId", "", "getBusinessId", "()Ljava/lang/String;", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "getViewType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BonusRealtimeData extends IRealTimeData {

    @NotNull
    private final String businessId;

    @Nullable
    private final BonusItemEntity entity;

    @NotNull
    private final RealTimeViewType viewType;

    /* JADX WARN: Multi-variable type inference failed */
    public BonusRealtimeData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BonusRealtimeData) && Intrinsics.areEqual(this.entity, ((BonusRealtimeData) other).entity);
    }

    public /* synthetic */ BonusRealtimeData(BonusItemEntity bonusItemEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bonusItemEntity);
    }

    public static /* synthetic */ BonusRealtimeData copy$default(BonusRealtimeData bonusRealtimeData, BonusItemEntity bonusItemEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bonusItemEntity = bonusRealtimeData.entity;
        }
        return bonusRealtimeData.copy(bonusItemEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BonusItemEntity getEntity() {
        return this.entity;
    }

    @NotNull
    public final BonusRealtimeData copy(@Nullable BonusItemEntity entity) {
        return new BonusRealtimeData(entity);
    }

    @Override // com.kubi.home.realtime.IRealTimeData
    @NotNull
    public String getBusinessId() {
        return this.businessId;
    }

    @Nullable
    public final BonusItemEntity getEntity() {
        return this.entity;
    }

    @Override // com.kubi.home.realtime.IRealTimeData
    @NotNull
    public RealTimeViewType getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        BonusItemEntity bonusItemEntity = this.entity;
        if (bonusItemEntity == null) {
            return 0;
        }
        return bonusItemEntity.hashCode();
    }

    @NotNull
    public String toString() {
        return "BonusRealtimeData(entity=" + this.entity + ')';
    }

    public BonusRealtimeData(@Nullable BonusItemEntity bonusItemEntity) {
        this.entity = bonusItemEntity;
        String taskId = bonusItemEntity != null ? bonusItemEntity.getTaskId() : null;
        this.businessId = taskId == null ? "" : taskId;
        this.viewType = RealTimeViewType.WELFARE_BONUS;
    }
}
