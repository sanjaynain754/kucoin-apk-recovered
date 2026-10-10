package com.kubi.margin.trade.dialog;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CrossMarginCloseContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "InitCurrencyList", "CrossClosePosition", "CancelClosePositionCross", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent$CancelClosePositionCross;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent$CrossClosePosition;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent$InitCurrencyList;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface CrossMarginCloseContract$UiIntent extends InterfaceC19282d {

    /* JADX INFO: compiled from: CrossMarginCloseContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent$CrossClosePosition;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent;", "validationToken", "", "<init>", "(Ljava/lang/String;)V", "getValidationToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CrossClosePosition implements CrossMarginCloseContract$UiIntent {

        @Nullable
        private final String validationToken;

        /* JADX WARN: Multi-variable type inference failed */
        public CrossClosePosition() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CrossClosePosition) && Intrinsics.areEqual(this.validationToken, ((CrossClosePosition) other).validationToken);
        }

        public CrossClosePosition(@Nullable String str) {
            this.validationToken = str;
        }

        @Nullable
        public final String getValidationToken() {
            return this.validationToken;
        }

        public int hashCode() {
            String str = this.validationToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "CrossClosePosition(validationToken=" + this.validationToken + ')';
        }

        public /* synthetic */ CrossClosePosition(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: CrossMarginCloseContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent$CancelClosePositionCross;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent;", "<init>", "()V", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CancelClosePositionCross implements CrossMarginCloseContract$UiIntent {

        @NotNull
        public static final CancelClosePositionCross INSTANCE = new CancelClosePositionCross();

        private CancelClosePositionCross() {
        }
    }

    /* JADX INFO: compiled from: CrossMarginCloseContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent$InitCurrencyList;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent;", "<init>", "()V", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class InitCurrencyList implements CrossMarginCloseContract$UiIntent {

        @NotNull
        public static final InitCurrencyList INSTANCE = new InitCurrencyList();

        private InitCurrencyList() {
        }
    }
}
