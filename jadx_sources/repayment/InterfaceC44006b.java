package repayment;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: repayment.b */
/* JADX INFO: compiled from: RepayContract.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lrepayment/RepayContract$UiState;", "Lrepayment/RepayContract;", "PageLoading", "PageEmpty", "PageLoaded", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44006b {

    /* JADX INFO: renamed from: repayment.b$a, reason: from toString */
    /* JADX INFO: compiled from: RepayContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lrepayment/RepayContract$UiState$PageEmpty;", "Lrepayment/RepayContract$UiState;", "selectedLiability", "Lrepayment/UnifyLiabilityData;", "<init>", "(Lrepayment/UnifyLiabilityData;)V", "getSelectedLiability", "()Lrepayment/UnifyLiabilityData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PageEmpty implements InterfaceC44006b {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final UnifyLiabilityData selectedLiability;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PageEmpty) && Intrinsics.areEqual(this.selectedLiability, ((PageEmpty) other).selectedLiability);
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
            return "PageEmpty(selectedLiability=" + this.selectedLiability + ')';
        }

        public PageEmpty(@Nullable UnifyLiabilityData unifyLiabilityData) {
            this.selectedLiability = unifyLiabilityData;
        }
    }

    /* JADX INFO: renamed from: repayment.b$b, reason: from toString */
    /* JADX INFO: compiled from: RepayContract.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lrepayment/RepayContract$UiState$PageLoaded;", "Lrepayment/RepayContract$UiState;", "repayAsset", "Lrepayment/RepayAssetData;", "displayAssetsList", "", "Lrepayment/UnifyAssetData;", "<init>", "(Lrepayment/RepayAssetData;Ljava/util/List;)V", "getRepayAsset", "()Lrepayment/RepayAssetData;", "getDisplayAssetsList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PageLoaded implements InterfaceC44006b {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final RepayAssetData repayAsset;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final List<UnifyAssetData> displayAssetsList;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageLoaded)) {
                return false;
            }
            PageLoaded pageLoaded = (PageLoaded) other;
            return Intrinsics.areEqual(this.repayAsset, pageLoaded.repayAsset) && Intrinsics.areEqual(this.displayAssetsList, pageLoaded.displayAssetsList);
        }

        public PageLoaded(@NotNull RepayAssetData repayAsset, @NotNull List<UnifyAssetData> displayAssetsList) {
            Intrinsics.checkNotNullParameter(repayAsset, "repayAsset");
            Intrinsics.checkNotNullParameter(displayAssetsList, "displayAssetsList");
            this.repayAsset = repayAsset;
            this.displayAssetsList = displayAssetsList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ PageLoaded m97018b(PageLoaded pageLoaded, RepayAssetData repayAssetData, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                repayAssetData = pageLoaded.repayAsset;
            }
            if ((i11 & 2) != 0) {
                list = pageLoaded.displayAssetsList;
            }
            return pageLoaded.m97019a(repayAssetData, list);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final PageLoaded m97019a(@NotNull RepayAssetData repayAsset, @NotNull List<UnifyAssetData> displayAssetsList) {
            Intrinsics.checkNotNullParameter(repayAsset, "repayAsset");
            Intrinsics.checkNotNullParameter(displayAssetsList, "displayAssetsList");
            return new PageLoaded(repayAsset, displayAssetsList);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final List<UnifyAssetData> m97020c() {
            return this.displayAssetsList;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final RepayAssetData getRepayAsset() {
            return this.repayAsset;
        }

        public int hashCode() {
            return (this.repayAsset.hashCode() * 31) + this.displayAssetsList.hashCode();
        }

        @NotNull
        public String toString() {
            return "PageLoaded(repayAsset=" + this.repayAsset + ", displayAssetsList=" + this.displayAssetsList + ')';
        }
    }

    /* JADX INFO: renamed from: repayment.b$c */
    /* JADX INFO: compiled from: RepayContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lrepayment/RepayContract$UiState$PageLoading;", "Lrepayment/RepayContract$UiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class c implements InterfaceC44006b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final c f97270a = new c();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof c);
        }

        @NotNull
        public String toString() {
            return "PageLoading";
        }

        public int hashCode() {
            return -652910630;
        }
    }
}
