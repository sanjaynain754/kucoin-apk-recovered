package com.kubi.margin.entity;

import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/margin/entity/WsMarketSnapshotWrapperEntity;", "", JPushConstants.Operation.KEY_SEQUENCE, "", "data", "Lcom/kubi/margin/entity/WsMarketSnapshotEntity;", "<init>", "(Ljava/lang/String;Lcom/kubi/margin/entity/WsMarketSnapshotEntity;)V", "getSequence", "()Ljava/lang/String;", "getData", "()Lcom/kubi/margin/entity/WsMarketSnapshotEntity;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsMarketSnapshotWrapperEntity {

    @Nullable
    private final WsMarketSnapshotEntity data;

    @Nullable
    private final String sequence;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsMarketSnapshotWrapperEntity)) {
            return false;
        }
        WsMarketSnapshotWrapperEntity wsMarketSnapshotWrapperEntity = (WsMarketSnapshotWrapperEntity) other;
        return Intrinsics.areEqual(this.sequence, wsMarketSnapshotWrapperEntity.sequence) && Intrinsics.areEqual(this.data, wsMarketSnapshotWrapperEntity.data);
    }

    public static /* synthetic */ WsMarketSnapshotWrapperEntity copy$default(WsMarketSnapshotWrapperEntity wsMarketSnapshotWrapperEntity, String str, WsMarketSnapshotEntity wsMarketSnapshotEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsMarketSnapshotWrapperEntity.sequence;
        }
        if ((i11 & 2) != 0) {
            wsMarketSnapshotEntity = wsMarketSnapshotWrapperEntity.data;
        }
        return wsMarketSnapshotWrapperEntity.copy(str, wsMarketSnapshotEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSequence() {
        return this.sequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WsMarketSnapshotEntity getData() {
        return this.data;
    }

    @NotNull
    public final WsMarketSnapshotWrapperEntity copy(@Nullable String sequence, @Nullable WsMarketSnapshotEntity data) {
        return new WsMarketSnapshotWrapperEntity(sequence, data);
    }

    @Nullable
    public final WsMarketSnapshotEntity getData() {
        return this.data;
    }

    @Nullable
    public final String getSequence() {
        return this.sequence;
    }

    public int hashCode() {
        String str = this.sequence;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        WsMarketSnapshotEntity wsMarketSnapshotEntity = this.data;
        return iHashCode + (wsMarketSnapshotEntity != null ? wsMarketSnapshotEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WsMarketSnapshotWrapperEntity(sequence=" + this.sequence + ", data=" + this.data + ')';
    }

    public WsMarketSnapshotWrapperEntity(@Nullable String str, @Nullable WsMarketSnapshotEntity wsMarketSnapshotEntity) {
        this.sequence = str;
        this.data = wsMarketSnapshotEntity;
    }
}
