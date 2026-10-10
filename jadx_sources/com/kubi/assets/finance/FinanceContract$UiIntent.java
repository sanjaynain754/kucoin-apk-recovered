package com.kubi.assets.finance;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FinanceContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "GetCoinList", "GetFinanceConfig", "HideOrShowNumber", "GetAutoEarnState", "Lcom/kubi/assets/finance/FinanceContract$UiIntent$GetAutoEarnState;", "Lcom/kubi/assets/finance/FinanceContract$UiIntent$GetCoinList;", "Lcom/kubi/assets/finance/FinanceContract$UiIntent$GetFinanceConfig;", "Lcom/kubi/assets/finance/FinanceContract$UiIntent$HideOrShowNumber;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class FinanceContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: FinanceContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceContract$UiIntent$GetAutoEarnState;", "Lcom/kubi/assets/finance/FinanceContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetAutoEarnState extends FinanceContract$UiIntent {

        @NotNull
        public static final GetAutoEarnState INSTANCE = new GetAutoEarnState();

        private GetAutoEarnState() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof GetAutoEarnState);
        }

        @NotNull
        public String toString() {
            return "GetAutoEarnState";
        }

        public int hashCode() {
            return -1001220095;
        }
    }

    /* JADX INFO: compiled from: FinanceContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceContract$UiIntent$GetCoinList;", "Lcom/kubi/assets/finance/FinanceContract$UiIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetCoinList extends FinanceContract$UiIntent {

        @NotNull
        public static final GetCoinList INSTANCE = new GetCoinList();

        private GetCoinList() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FinanceContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceContract$UiIntent$GetFinanceConfig;", "Lcom/kubi/assets/finance/FinanceContract$UiIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetFinanceConfig extends FinanceContract$UiIntent {

        @NotNull
        public static final GetFinanceConfig INSTANCE = new GetFinanceConfig();

        private GetFinanceConfig() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FinanceContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceContract$UiIntent$HideOrShowNumber;", "Lcom/kubi/assets/finance/FinanceContract$UiIntent;", "isChecked", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HideOrShowNumber extends FinanceContract$UiIntent {
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

    public /* synthetic */ FinanceContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FinanceContract$UiIntent() {
    }
}
