package com.kubi.operation.lib.entity;

import androidx.annotation.Keep;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/WsEntity;", "", "data", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "<init>", "(Lcom/kubi/data/entity/WsMarketSnapshotEntity;)V", "getData", "()Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsEntity {

    @NotNull
    private final WsMarketSnapshotEntity data;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WsEntity) && Intrinsics.areEqual(this.data, ((WsEntity) other).data);
    }

    public WsEntity(@NotNull WsMarketSnapshotEntity data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ WsEntity copy$default(WsEntity wsEntity, WsMarketSnapshotEntity wsMarketSnapshotEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wsMarketSnapshotEntity = wsEntity.data;
        }
        return wsEntity.copy(wsMarketSnapshotEntity);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WsMarketSnapshotEntity getData() {
        return this.data;
    }

    @NotNull
    public final WsEntity copy(@NotNull WsMarketSnapshotEntity data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new WsEntity(data);
    }

    @NotNull
    public final WsMarketSnapshotEntity getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "WsEntity(data=" + this.data + ')';
    }
}
