package com.kubi.assets.overview;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19292n;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetV2OverviewContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "GetRecentTransitionData", "HideSmallAssetAccount", "HideOrShowNumber", "GetLineChartPoint", "GetProfitLoss", "GetRollbackData", "GetDynamicsData", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetDynamicsData;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetLineChartPoint;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetProfitLoss;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRollbackData;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideSmallAssetAccount;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AssetV2OverviewContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: AssetV2OverviewContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetDynamicsData;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetDynamicsData extends AssetV2OverviewContract$UiIntent {

        @NotNull
        public static final GetDynamicsData INSTANCE = new GetDynamicsData();

        private GetDynamicsData() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: AssetV2OverviewContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetLineChartPoint;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent;", SessionDescription.ATTR_RANGE, "", "<init>", "(Ljava/lang/String;)V", "getRange", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetLineChartPoint extends AssetV2OverviewContract$UiIntent {

        @NotNull
        private final String range;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetLineChartPoint) && Intrinsics.areEqual(this.range, ((GetLineChartPoint) other).range);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetLineChartPoint(@NotNull String range) {
            super(null);
            Intrinsics.checkNotNullParameter(range, "range");
            this.range = range;
        }

        @NotNull
        public final String getRange() {
            return this.range;
        }

        public int hashCode() {
            return this.range.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetLineChartPoint(range=" + this.range + ')';
        }
    }

    /* JADX INFO: compiled from: AssetV2OverviewContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetProfitLoss;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent;", SessionDescription.ATTR_RANGE, "", "<init>", "(Ljava/lang/String;)V", "getRange", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetProfitLoss extends AssetV2OverviewContract$UiIntent {

        @NotNull
        private final String range;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetProfitLoss) && Intrinsics.areEqual(this.range, ((GetProfitLoss) other).range);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetProfitLoss(@NotNull String range) {
            super(null);
            Intrinsics.checkNotNullParameter(range, "range");
            this.range = range;
        }

        @NotNull
        public final String getRange() {
            return this.range;
        }

        public int hashCode() {
            return this.range.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetProfitLoss(range=" + this.range + ')';
        }
    }

    /* JADX INFO: compiled from: AssetV2OverviewContract.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent;", "Lcom/kubi/mvi/state/SingleThreadIntent;", "data", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "<init>", "(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V", "getData", "()Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetRecentTransitionData extends AssetV2OverviewContract$UiIntent implements InterfaceC19292n {

        @Nullable
        private final AssetV2OverviewEntity data;

        public GetRecentTransitionData(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
            super(null);
            this.data = assetV2OverviewEntity;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetRecentTransitionData) && Intrinsics.areEqual(this.data, ((GetRecentTransitionData) other).data);
        }

        @Nullable
        public final AssetV2OverviewEntity getData() {
            return this.data;
        }

        public int hashCode() {
            AssetV2OverviewEntity assetV2OverviewEntity = this.data;
            if (assetV2OverviewEntity == null) {
                return 0;
            }
            return assetV2OverviewEntity.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetRecentTransitionData(data=" + this.data + ')';
        }
    }

    /* JADX INFO: compiled from: AssetV2OverviewContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRollbackData;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetRollbackData extends AssetV2OverviewContract$UiIntent {

        @NotNull
        public static final GetRollbackData INSTANCE = new GetRollbackData();

        private GetRollbackData() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: AssetV2OverviewContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent;", "isChecked", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HideOrShowNumber extends AssetV2OverviewContract$UiIntent {
        private final boolean isChecked;

        public HideOrShowNumber(boolean z11) {
            super(null);
            this.isChecked = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HideOrShowNumber) && this.isChecked == ((HideOrShowNumber) other).isChecked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        /* JADX INFO: renamed from: isChecked, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        @NotNull
        public String toString() {
            return "HideOrShowNumber(isChecked=" + this.isChecked + ')';
        }
    }

    /* JADX INFO: compiled from: AssetV2OverviewContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideSmallAssetAccount;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent;", TIMPushProvider.f75063o, "", "<init>", "(Z)V", "getHide", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HideSmallAssetAccount extends AssetV2OverviewContract$UiIntent {
        private final boolean hide;

        public HideSmallAssetAccount(boolean z11) {
            super(null);
            this.hide = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HideSmallAssetAccount) && this.hide == ((HideSmallAssetAccount) other).hide;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hide);
        }

        @NotNull
        public String toString() {
            return "HideSmallAssetAccount(hide=" + this.hide + ')';
        }
    }

    public /* synthetic */ AssetV2OverviewContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AssetV2OverviewContract$UiIntent() {
    }
}
