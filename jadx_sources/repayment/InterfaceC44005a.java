package repayment;

import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: repayment.a */
/* JADX INFO: compiled from: RepayContract.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lrepayment/RepayContract$UiIntent;", "Lrepayment/RepayContract;", "LoadRepayInfo", "OnAssetListDismiss", "OnLiabilityListDismiss", "ConfirmRepay", "CalculatePreRepayPrice", "SearchAssets", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44005a {

    /* JADX INFO: renamed from: repayment.a$a */
    /* JADX INFO: compiled from: RepayContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lrepayment/RepayContract$UiIntent$CalculatePreRepayPrice;", "Lrepayment/RepayContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a implements InterfaceC44005a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f97260a = new a();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @NotNull
        public String toString() {
            return "CalculatePreRepayPrice";
        }

        public int hashCode() {
            return 443198669;
        }
    }

    /* JADX INFO: renamed from: repayment.a$b */
    /* JADX INFO: compiled from: RepayContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lrepayment/RepayContract$UiIntent$ConfirmRepay;", "Lrepayment/RepayContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b implements InterfaceC44005a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f97261a = new b();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "ConfirmRepay";
        }

        public int hashCode() {
            return -803136367;
        }
    }

    /* JADX INFO: renamed from: repayment.a$c, reason: from toString */
    /* JADX INFO: compiled from: RepayContract.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lrepayment/RepayContract$UiIntent$LoadRepayInfo;", "Lrepayment/RepayContract$UiIntent;", "liabilityCurrencyCode", "", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getLiabilityCurrencyCode", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadRepayInfo implements InterfaceC44005a {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String liabilityCurrencyCode;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final BigDecimal amount;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadRepayInfo)) {
                return false;
            }
            LoadRepayInfo loadRepayInfo = (LoadRepayInfo) other;
            return Intrinsics.areEqual(this.liabilityCurrencyCode, loadRepayInfo.liabilityCurrencyCode) && Intrinsics.areEqual(this.amount, loadRepayInfo.amount);
        }

        public LoadRepayInfo(@NotNull String liabilityCurrencyCode, @Nullable BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(liabilityCurrencyCode, "liabilityCurrencyCode");
            this.liabilityCurrencyCode = liabilityCurrencyCode;
            this.amount = bigDecimal;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLiabilityCurrencyCode() {
            return this.liabilityCurrencyCode;
        }

        public int hashCode() {
            int iHashCode = this.liabilityCurrencyCode.hashCode() * 31;
            BigDecimal bigDecimal = this.amount;
            return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        @NotNull
        public String toString() {
            return "LoadRepayInfo(liabilityCurrencyCode=" + this.liabilityCurrencyCode + ", amount=" + this.amount + ')';
        }
    }

    /* JADX INFO: renamed from: repayment.a$d, reason: from toString */
    /* JADX INFO: compiled from: RepayContract.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lrepayment/RepayContract$UiIntent$OnAssetListDismiss;", "Lrepayment/RepayContract$UiIntent;", "selectedAssetList", "", "Lrepayment/UnifyAssetData;", "<init>", "(Ljava/util/List;)V", "getSelectedAssetList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class OnAssetListDismiss implements InterfaceC44005a {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final List<UnifyAssetData> selectedAssetList;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnAssetListDismiss) && Intrinsics.areEqual(this.selectedAssetList, ((OnAssetListDismiss) other).selectedAssetList);
        }

        public OnAssetListDismiss(@NotNull List<UnifyAssetData> selectedAssetList) {
            Intrinsics.checkNotNullParameter(selectedAssetList, "selectedAssetList");
            this.selectedAssetList = selectedAssetList;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<UnifyAssetData> m97015a() {
            return this.selectedAssetList;
        }

        public int hashCode() {
            return this.selectedAssetList.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnAssetListDismiss(selectedAssetList=" + this.selectedAssetList + ')';
        }
    }

    /* JADX INFO: renamed from: repayment.a$e, reason: from toString */
    /* JADX INFO: compiled from: RepayContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lrepayment/RepayContract$UiIntent$OnLiabilityListDismiss;", "Lrepayment/RepayContract$UiIntent;", "selectedLiability", "Lrepayment/UnifyLiabilityData;", "<init>", "(Lrepayment/UnifyLiabilityData;)V", "getSelectedLiability", "()Lrepayment/UnifyLiabilityData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class OnLiabilityListDismiss implements InterfaceC44005a {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final UnifyLiabilityData selectedLiability;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnLiabilityListDismiss) && Intrinsics.areEqual(this.selectedLiability, ((OnLiabilityListDismiss) other).selectedLiability);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UnifyLiabilityData getSelectedLiability() {
            return this.selectedLiability;
        }

        public int hashCode() {
            UnifyLiabilityData unifyLiabilityData = this.selectedLiability;
            if (unifyLiabilityData == null) {
                return 0;
            }
            return unifyLiabilityData.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnLiabilityListDismiss(selectedLiability=" + this.selectedLiability + ')';
        }

        public OnLiabilityListDismiss(@Nullable UnifyLiabilityData unifyLiabilityData) {
            this.selectedLiability = unifyLiabilityData;
        }
    }

    /* JADX INFO: renamed from: repayment.a$f, reason: from toString */
    /* JADX INFO: compiled from: RepayContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lrepayment/RepayContract$UiIntent$SearchAssets;", "Lrepayment/RepayContract$UiIntent;", "keyword", "", "<init>", "(Ljava/lang/String;)V", "getKeyword", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SearchAssets implements InterfaceC44005a {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String keyword;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchAssets) && Intrinsics.areEqual(this.keyword, ((SearchAssets) other).keyword);
        }

        public SearchAssets(@NotNull String keyword) {
            Intrinsics.checkNotNullParameter(keyword, "keyword");
            this.keyword = keyword;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getKeyword() {
            return this.keyword;
        }

        public int hashCode() {
            return this.keyword.hashCode();
        }

        @NotNull
        public String toString() {
            return "SearchAssets(keyword=" + this.keyword + ')';
        }
    }
}
