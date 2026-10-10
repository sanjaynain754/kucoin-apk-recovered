package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Assetv2OverviewEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0015\u001a\u00020\bH\u0016J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J+\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\bJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006("}, m90084d2 = {"Lcom/kubi/assets/entity/OverviewItemEntity;", "Landroid/os/Parcelable;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "accountInfo", "Lcom/kubi/assets/entity/OverviewAccountInfo;", "historyInfo", "Lcom/kubi/assets/entity/HistoryRecordEntity;", "type", "", "<init>", "(Lcom/kubi/assets/entity/OverviewAccountInfo;Lcom/kubi/assets/entity/HistoryRecordEntity;I)V", "getAccountInfo", "()Lcom/kubi/assets/entity/OverviewAccountInfo;", "setAccountInfo", "(Lcom/kubi/assets/entity/OverviewAccountInfo;)V", "getHistoryInfo", "()Lcom/kubi/assets/entity/HistoryRecordEntity;", "getType", "()I", "setType", "(I)V", "getItemType", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OverviewItemEntity implements Parcelable, MultiItemEntity {
    public static final int TYPE_ACCOUNT = 1;
    public static final int TYPE_ACCOUNT_HEADER = 4;
    public static final int TYPE_DEPOSIT_RECORD = 2;
    public static final int TYPE_RECORD_HEADER = 3;
    public static final int TYPE_RECORD_MORE_HEADER = 5;

    @Nullable
    private OverviewAccountInfo accountInfo;

    @Nullable
    private final HistoryRecordEntity historyInfo;
    private int type;

    @NotNull
    public static final Parcelable.Creator<OverviewItemEntity> CREATOR = new Creator();

    /* JADX INFO: compiled from: Assetv2OverviewEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OverviewItemEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OverviewItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OverviewItemEntity(parcel.readInt() == 0 ? null : OverviewAccountInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HistoryRecordEntity.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OverviewItemEntity[] newArray(int i11) {
            return new OverviewItemEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverviewItemEntity)) {
            return false;
        }
        OverviewItemEntity overviewItemEntity = (OverviewItemEntity) other;
        return Intrinsics.areEqual(this.accountInfo, overviewItemEntity.accountInfo) && Intrinsics.areEqual(this.historyInfo, overviewItemEntity.historyInfo) && this.type == overviewItemEntity.type;
    }

    public static /* synthetic */ OverviewItemEntity copy$default(OverviewItemEntity overviewItemEntity, OverviewAccountInfo overviewAccountInfo, HistoryRecordEntity historyRecordEntity, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            overviewAccountInfo = overviewItemEntity.accountInfo;
        }
        if ((i12 & 2) != 0) {
            historyRecordEntity = overviewItemEntity.historyInfo;
        }
        if ((i12 & 4) != 0) {
            i11 = overviewItemEntity.type;
        }
        return overviewItemEntity.copy(overviewAccountInfo, historyRecordEntity, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OverviewAccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HistoryRecordEntity getHistoryInfo() {
        return this.historyInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final OverviewItemEntity copy(@Nullable OverviewAccountInfo accountInfo, @Nullable HistoryRecordEntity historyInfo, int type) {
        return new OverviewItemEntity(accountInfo, historyInfo, type);
    }

    @Nullable
    public final OverviewAccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    @Nullable
    public final HistoryRecordEntity getHistoryInfo() {
        return this.historyInfo;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return this.type;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        OverviewAccountInfo overviewAccountInfo = this.accountInfo;
        int iHashCode = (overviewAccountInfo == null ? 0 : overviewAccountInfo.hashCode()) * 31;
        HistoryRecordEntity historyRecordEntity = this.historyInfo;
        return ((iHashCode + (historyRecordEntity != null ? historyRecordEntity.hashCode() : 0)) * 31) + Integer.hashCode(this.type);
    }

    public final void setAccountInfo(@Nullable OverviewAccountInfo overviewAccountInfo) {
        this.accountInfo = overviewAccountInfo;
    }

    public final void setType(int i11) {
        this.type = i11;
    }

    @NotNull
    public String toString() {
        return "OverviewItemEntity(accountInfo=" + this.accountInfo + ", historyInfo=" + this.historyInfo + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OverviewAccountInfo overviewAccountInfo = this.accountInfo;
        if (overviewAccountInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            overviewAccountInfo.writeToParcel(dest, flags);
        }
        HistoryRecordEntity historyRecordEntity = this.historyInfo;
        if (historyRecordEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            historyRecordEntity.writeToParcel(dest, flags);
        }
        dest.writeInt(this.type);
    }

    public OverviewItemEntity(@Nullable OverviewAccountInfo overviewAccountInfo, @Nullable HistoryRecordEntity historyRecordEntity, int i11) {
        this.accountInfo = overviewAccountInfo;
        this.historyInfo = historyRecordEntity;
        this.type = i11;
    }
}
