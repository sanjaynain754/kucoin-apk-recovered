package com.kubi.assets;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19292n;
import com.kubi.mvi.state.InterfaceC19300v;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetV2Contract.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/AssetV2Contract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchAccountsInfo", "UpdateAssetInfo", "Lcom/kubi/assets/AssetV2Contract$UiIntent$FetchAccountsInfo;", "Lcom/kubi/assets/AssetV2Contract$UiIntent$UpdateAssetInfo;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AssetV2Contract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: AssetV2Contract.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/AssetV2Contract$UiIntent$FetchAccountsInfo;", "Lcom/kubi/assets/AssetV2Contract$UiIntent;", "Lcom/kubi/mvi/state/UniqueIntent;", "Lcom/kubi/mvi/state/SingleThreadIntent;", FirebaseAnalytics.Param.CURRENCY, "", "<init>", "(Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchAccountsInfo extends AssetV2Contract$UiIntent implements InterfaceC19300v, InterfaceC19292n {

        @NotNull
        private final String currency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FetchAccountsInfo) && Intrinsics.areEqual(this.currency, ((FetchAccountsInfo) other).currency);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchAccountsInfo(@NotNull String currency) {
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
            return "FetchAccountsInfo(currency=" + this.currency + ')';
        }
    }

    /* JADX INFO: compiled from: AssetV2Contract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/AssetV2Contract$UiIntent$UpdateAssetInfo;", "Lcom/kubi/assets/AssetV2Contract$UiIntent;", "total", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getTotal", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateAssetInfo extends AssetV2Contract$UiIntent {

        @NotNull
        private final BigDecimal total;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateAssetInfo) && Intrinsics.areEqual(this.total, ((UpdateAssetInfo) other).total);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateAssetInfo(@NotNull BigDecimal total) {
            super(null);
            Intrinsics.checkNotNullParameter(total, "total");
            this.total = total;
        }

        @NotNull
        public final BigDecimal getTotal() {
            return this.total;
        }

        public int hashCode() {
            return this.total.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateAssetInfo(total=" + this.total + ')';
        }
    }

    public /* synthetic */ AssetV2Contract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AssetV2Contract$UiIntent() {
    }
}
