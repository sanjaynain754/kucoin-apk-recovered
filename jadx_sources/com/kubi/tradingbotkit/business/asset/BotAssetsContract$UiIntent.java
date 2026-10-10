package com.kubi.tradingbotkit.business.asset;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BotAssetsContract.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "GetAssetTotal", "HideOrShowNumber", "ExpendList", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UiIntent$ExpendList;", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UiIntent$GetAssetTotal;", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UiIntent$HideOrShowNumber;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BotAssetsContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: BotAssetsContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UiIntent$ExpendList;", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UiIntent;", "expend", "", "<init>", "(Z)V", "getExpend", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ExpendList extends BotAssetsContract$UiIntent {
        private final boolean expend;

        public ExpendList(boolean z11) {
            super(null);
            this.expend = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExpendList) && this.expend == ((ExpendList) other).expend;
        }

        public final boolean getExpend() {
            return this.expend;
        }

        public int hashCode() {
            return Boolean.hashCode(this.expend);
        }

        @NotNull
        public String toString() {
            return "ExpendList(expend=" + this.expend + ')';
        }
    }

    /* JADX INFO: compiled from: BotAssetsContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UiIntent$GetAssetTotal;", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UiIntent;", "<init>", "()V", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetAssetTotal extends BotAssetsContract$UiIntent {

        @NotNull
        public static final GetAssetTotal INSTANCE = new GetAssetTotal();

        private GetAssetTotal() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BotAssetsContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UiIntent$HideOrShowNumber;", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UiIntent;", "hideNumber", "", "<init>", "(Z)V", "getHideNumber", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HideOrShowNumber extends BotAssetsContract$UiIntent {
        private final boolean hideNumber;

        public HideOrShowNumber(boolean z11) {
            super(null);
            this.hideNumber = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HideOrShowNumber) && this.hideNumber == ((HideOrShowNumber) other).hideNumber;
        }

        public final boolean getHideNumber() {
            return this.hideNumber;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideNumber);
        }

        @NotNull
        public String toString() {
            return "HideOrShowNumber(hideNumber=" + this.hideNumber + ')';
        }
    }

    public /* synthetic */ BotAssetsContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BotAssetsContract$UiIntent() {
    }
}
