package com.kubi.assets.overview.detail;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetCoinDetailContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "GetCoinDetail", "GetOnGoingData", "GetFutureData", "Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UiIntent$GetCoinDetail;", "Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UiIntent$GetFutureData;", "Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UiIntent$GetOnGoingData;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AssetCoinDetailContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: AssetCoinDetailContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UiIntent$GetCoinDetail;", "Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UiIntent;", FirebaseAnalytics.Param.CURRENCY, "", "<init>", "(Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetCoinDetail extends AssetCoinDetailContract$UiIntent {

        @NotNull
        private final String currency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetCoinDetail) && Intrinsics.areEqual(this.currency, ((GetCoinDetail) other).currency);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCoinDetail(@NotNull String currency) {
            super(null);
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.currency = currency;
        }

        @NotNull
        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            return this.currency.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetCoinDetail(currency=" + this.currency + ')';
        }
    }

    /* JADX INFO: compiled from: AssetCoinDetailContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UiIntent$GetFutureData;", "Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UiIntent;", FirebaseAnalytics.Param.CURRENCY, "", "<init>", "(Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetFutureData extends AssetCoinDetailContract$UiIntent {

        @NotNull
        private final String currency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetFutureData) && Intrinsics.areEqual(this.currency, ((GetFutureData) other).currency);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetFutureData(@NotNull String currency) {
            super(null);
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.currency = currency;
        }

        @NotNull
        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            return this.currency.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetFutureData(currency=" + this.currency + ')';
        }
    }

    /* JADX INFO: compiled from: AssetCoinDetailContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UiIntent$GetOnGoingData;", "Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UiIntent;", FirebaseAnalytics.Param.CURRENCY, "", "<init>", "(Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetOnGoingData extends AssetCoinDetailContract$UiIntent {

        @NotNull
        private final String currency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetOnGoingData) && Intrinsics.areEqual(this.currency, ((GetOnGoingData) other).currency);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetOnGoingData(@NotNull String currency) {
            super(null);
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.currency = currency;
        }

        @NotNull
        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            return this.currency.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetOnGoingData(currency=" + this.currency + ')';
        }
    }

    public /* synthetic */ AssetCoinDetailContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AssetCoinDetailContract$UiIntent() {
    }
}
