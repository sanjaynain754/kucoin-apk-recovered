package com.kubi.assets.setting;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CustomOrderEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetV2SettingContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "GetData", "SubSwitchChanged", "SetUserConfig", "Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent$GetData;", "Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent$SetUserConfig;", "Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent$SubSwitchChanged;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AssetV2SettingContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: AssetV2SettingContract.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent$GetData;", "Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent;", "subAssetEntity", "Lcom/kubi/data/entity/SubAssetEntity;", "customOrderEntity", "Lcom/kubi/data/entity/CustomOrderEntity;", "<init>", "(Lcom/kubi/data/entity/SubAssetEntity;Lcom/kubi/data/entity/CustomOrderEntity;)V", "getSubAssetEntity", "()Lcom/kubi/data/entity/SubAssetEntity;", "getCustomOrderEntity", "()Lcom/kubi/data/entity/CustomOrderEntity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetData extends AssetV2SettingContract$UiIntent {

        @Nullable
        private final CustomOrderEntity customOrderEntity;

        @Nullable
        private final SubAssetEntity subAssetEntity;

        public GetData(@Nullable SubAssetEntity subAssetEntity, @Nullable CustomOrderEntity customOrderEntity) {
            super(null);
            this.subAssetEntity = subAssetEntity;
            this.customOrderEntity = customOrderEntity;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetData)) {
                return false;
            }
            GetData getData = (GetData) other;
            return Intrinsics.areEqual(this.subAssetEntity, getData.subAssetEntity) && Intrinsics.areEqual(this.customOrderEntity, getData.customOrderEntity);
        }

        @Nullable
        public final CustomOrderEntity getCustomOrderEntity() {
            return this.customOrderEntity;
        }

        @Nullable
        public final SubAssetEntity getSubAssetEntity() {
            return this.subAssetEntity;
        }

        public int hashCode() {
            SubAssetEntity subAssetEntity = this.subAssetEntity;
            int iHashCode = (subAssetEntity == null ? 0 : subAssetEntity.hashCode()) * 31;
            CustomOrderEntity customOrderEntity = this.customOrderEntity;
            return iHashCode + (customOrderEntity != null ? customOrderEntity.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "GetData(subAssetEntity=" + this.subAssetEntity + ", customOrderEntity=" + this.customOrderEntity + ')';
        }
    }

    /* JADX INFO: compiled from: AssetV2SettingContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent$SetUserConfig;", "Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent;", FirebaseAnalytics.Param.CURRENCY, "", "balanceCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getBalanceCurrency", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SetUserConfig extends AssetV2SettingContract$UiIntent {

        @Nullable
        private final String balanceCurrency;

        @Nullable
        private final String currency;

        public SetUserConfig(@Nullable String str, @Nullable String str2) {
            super(null);
            this.currency = str;
            this.balanceCurrency = str2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetUserConfig)) {
                return false;
            }
            SetUserConfig setUserConfig = (SetUserConfig) other;
            return Intrinsics.areEqual(this.currency, setUserConfig.currency) && Intrinsics.areEqual(this.balanceCurrency, setUserConfig.balanceCurrency);
        }

        @Nullable
        public final String getBalanceCurrency() {
            return this.balanceCurrency;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            String str = this.currency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.balanceCurrency;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SetUserConfig(currency=" + this.currency + ", balanceCurrency=" + this.balanceCurrency + ')';
        }
    }

    /* JADX INFO: compiled from: AssetV2SettingContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent$SubSwitchChanged;", "Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent;", "checked", "", "<init>", "(Z)V", "getChecked", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SubSwitchChanged extends AssetV2SettingContract$UiIntent {
        private final boolean checked;

        public SubSwitchChanged(boolean z11) {
            super(null);
            this.checked = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubSwitchChanged) && this.checked == ((SubSwitchChanged) other).checked;
        }

        public final boolean getChecked() {
            return this.checked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        @NotNull
        public String toString() {
            return "SubSwitchChanged(checked=" + this.checked + ')';
        }
    }

    public /* synthetic */ AssetV2SettingContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AssetV2SettingContract$UiIntent() {
    }
}
