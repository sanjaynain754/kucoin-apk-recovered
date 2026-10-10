package com.kubi.assets.unify;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetUnifiedContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchUnifiedOverviewData", "FetchUnifiedPnlOverview", "FetchAssetsList", "FetchMarginCurrencyList", "FetchProducts", "HideSmallOrFilter", "ShowInDebt", "HideOrShowNumber", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$FetchAssetsList;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$FetchMarginCurrencyList;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$FetchProducts;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$FetchUnifiedOverviewData;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$FetchUnifiedPnlOverview;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$HideOrShowNumber;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$HideSmallOrFilter;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$ShowInDebt;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AssetUnifiedContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: AssetUnifiedContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$FetchAssetsList;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchAssetsList extends AssetUnifiedContract$UiIntent {

        @NotNull
        public static final FetchAssetsList INSTANCE = new FetchAssetsList();

        private FetchAssetsList() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FetchAssetsList);
        }

        @NotNull
        public String toString() {
            return "FetchAssetsList";
        }

        public int hashCode() {
            return 1224802033;
        }
    }

    /* JADX INFO: compiled from: AssetUnifiedContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$FetchMarginCurrencyList;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchMarginCurrencyList extends AssetUnifiedContract$UiIntent {

        @NotNull
        public static final FetchMarginCurrencyList INSTANCE = new FetchMarginCurrencyList();

        private FetchMarginCurrencyList() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FetchMarginCurrencyList);
        }

        @NotNull
        public String toString() {
            return "FetchMarginCurrencyList";
        }

        public int hashCode() {
            return -1028974259;
        }
    }

    /* JADX INFO: compiled from: AssetUnifiedContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$FetchProducts;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchProducts extends AssetUnifiedContract$UiIntent {

        @NotNull
        public static final FetchProducts INSTANCE = new FetchProducts();

        private FetchProducts() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FetchProducts);
        }

        @NotNull
        public String toString() {
            return "FetchProducts";
        }

        public int hashCode() {
            return 1024327060;
        }
    }

    /* JADX INFO: compiled from: AssetUnifiedContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$FetchUnifiedOverviewData;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;", "baseCurrency", "", "<init>", "(Ljava/lang/String;)V", "getBaseCurrency", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchUnifiedOverviewData extends AssetUnifiedContract$UiIntent {

        @Nullable
        private final String baseCurrency;

        public FetchUnifiedOverviewData(@Nullable String str) {
            super(null);
            this.baseCurrency = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FetchUnifiedOverviewData) && Intrinsics.areEqual(this.baseCurrency, ((FetchUnifiedOverviewData) other).baseCurrency);
        }

        @Nullable
        public final String getBaseCurrency() {
            return this.baseCurrency;
        }

        public int hashCode() {
            String str = this.baseCurrency;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "FetchUnifiedOverviewData(baseCurrency=" + this.baseCurrency + ')';
        }
    }

    /* JADX INFO: compiled from: AssetUnifiedContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$FetchUnifiedPnlOverview;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchUnifiedPnlOverview extends AssetUnifiedContract$UiIntent {

        @NotNull
        public static final FetchUnifiedPnlOverview INSTANCE = new FetchUnifiedPnlOverview();

        private FetchUnifiedPnlOverview() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FetchUnifiedPnlOverview);
        }

        @NotNull
        public String toString() {
            return "FetchUnifiedPnlOverview";
        }

        public int hashCode() {
            return 1078803717;
        }
    }

    /* JADX INFO: compiled from: AssetUnifiedContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$HideOrShowNumber;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;", "isChecked", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HideOrShowNumber extends AssetUnifiedContract$UiIntent {
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

    /* JADX INFO: compiled from: AssetUnifiedContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$HideSmallOrFilter;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;", "checked", "", "keyword", "", "isManual", "<init>", "(ZLjava/lang/String;Z)V", "getChecked", "()Z", "getKeyword", "()Ljava/lang/String;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class HideSmallOrFilter extends AssetUnifiedContract$UiIntent {
        private final boolean checked;
        private final boolean isManual;

        @NotNull
        private final String keyword;

        public /* synthetic */ HideSmallOrFilter(boolean z11, String str, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, str, (i11 & 4) != 0 ? false : z12);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HideSmallOrFilter(boolean z11, @NotNull String keyword, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(keyword, "keyword");
            this.checked = z11;
            this.keyword = keyword;
            this.isManual = z12;
        }

        public final boolean getChecked() {
            return this.checked;
        }

        @NotNull
        public final String getKeyword() {
            return this.keyword;
        }

        /* JADX INFO: renamed from: isManual, reason: from getter */
        public final boolean getIsManual() {
            return this.isManual;
        }
    }

    /* JADX INFO: compiled from: AssetUnifiedContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent$ShowInDebt;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;", "checked", "", "isManual", "<init>", "(ZZ)V", "getChecked", "()Z", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ShowInDebt extends AssetUnifiedContract$UiIntent {
        private final boolean checked;
        private final boolean isManual;

        public ShowInDebt(boolean z11, boolean z12) {
            super(null);
            this.checked = z11;
            this.isManual = z12;
        }

        public final boolean getChecked() {
            return this.checked;
        }

        /* JADX INFO: renamed from: isManual, reason: from getter */
        public final boolean getIsManual() {
            return this.isManual;
        }
    }

    public /* synthetic */ AssetUnifiedContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AssetUnifiedContract$UiIntent() {
    }
}
