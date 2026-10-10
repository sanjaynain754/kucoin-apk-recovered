package com.kubi.futures.trade.challenge;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesTraderProChallengeUiState.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\u0097\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001J\u0013\u00105\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#¨\u0006:"}, m90084d2 = {"Lcom/kubi/futures/trade/challenge/FuturesTraderProChallengeUiState;", "", "challengeId", "", "title", "countdownEndTimeMillis", "", "amountText", "currencyText", "progressButtonText", "activateButtonText", "useButtonText", "progressUrl", "useUrl", "trialCode", "showActivateButton", "", "showUseButton", "showProgressButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getChallengeId", "()Ljava/lang/String;", "getTitle", "getCountdownEndTimeMillis", "()J", "getAmountText", "getCurrencyText", "getProgressButtonText", "getActivateButtonText", "getUseButtonText", "getProgressUrl", "getUseUrl", "getTrialCode", "getShowActivateButton", "()Z", "getShowUseButton", "getShowProgressButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesTraderProChallengeUiState {

    @NotNull
    private final String activateButtonText;

    @NotNull
    private final String amountText;

    @NotNull
    private final String challengeId;
    private final long countdownEndTimeMillis;

    @NotNull
    private final String currencyText;

    @NotNull
    private final String progressButtonText;

    @NotNull
    private final String progressUrl;
    private final boolean showActivateButton;
    private final boolean showProgressButton;
    private final boolean showUseButton;

    @NotNull
    private final String title;

    @Nullable
    private final String trialCode;

    @NotNull
    private final String useButtonText;

    @NotNull
    private final String useUrl;

    public FuturesTraderProChallengeUiState(@NotNull String challengeId, @NotNull String title, long j11, @NotNull String amountText, @NotNull String currencyText, @NotNull String progressButtonText, @NotNull String activateButtonText, @NotNull String useButtonText, @NotNull String progressUrl, @NotNull String useUrl, @Nullable String str, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(currencyText, "currencyText");
        Intrinsics.checkNotNullParameter(progressButtonText, "progressButtonText");
        Intrinsics.checkNotNullParameter(activateButtonText, "activateButtonText");
        Intrinsics.checkNotNullParameter(useButtonText, "useButtonText");
        Intrinsics.checkNotNullParameter(progressUrl, "progressUrl");
        Intrinsics.checkNotNullParameter(useUrl, "useUrl");
        this.challengeId = challengeId;
        this.title = title;
        this.countdownEndTimeMillis = j11;
        this.amountText = amountText;
        this.currencyText = currencyText;
        this.progressButtonText = progressButtonText;
        this.activateButtonText = activateButtonText;
        this.useButtonText = useButtonText;
        this.progressUrl = progressUrl;
        this.useUrl = useUrl;
        this.trialCode = str;
        this.showActivateButton = z11;
        this.showUseButton = z12;
        this.showProgressButton = z13;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesTraderProChallengeUiState)) {
            return false;
        }
        FuturesTraderProChallengeUiState futuresTraderProChallengeUiState = (FuturesTraderProChallengeUiState) other;
        return Intrinsics.areEqual(this.challengeId, futuresTraderProChallengeUiState.challengeId) && Intrinsics.areEqual(this.title, futuresTraderProChallengeUiState.title) && this.countdownEndTimeMillis == futuresTraderProChallengeUiState.countdownEndTimeMillis && Intrinsics.areEqual(this.amountText, futuresTraderProChallengeUiState.amountText) && Intrinsics.areEqual(this.currencyText, futuresTraderProChallengeUiState.currencyText) && Intrinsics.areEqual(this.progressButtonText, futuresTraderProChallengeUiState.progressButtonText) && Intrinsics.areEqual(this.activateButtonText, futuresTraderProChallengeUiState.activateButtonText) && Intrinsics.areEqual(this.useButtonText, futuresTraderProChallengeUiState.useButtonText) && Intrinsics.areEqual(this.progressUrl, futuresTraderProChallengeUiState.progressUrl) && Intrinsics.areEqual(this.useUrl, futuresTraderProChallengeUiState.useUrl) && Intrinsics.areEqual(this.trialCode, futuresTraderProChallengeUiState.trialCode) && this.showActivateButton == futuresTraderProChallengeUiState.showActivateButton && this.showUseButton == futuresTraderProChallengeUiState.showUseButton && this.showProgressButton == futuresTraderProChallengeUiState.showProgressButton;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChallengeId() {
        return this.challengeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUseUrl() {
        return this.useUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTrialCode() {
        return this.trialCode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getShowActivateButton() {
        return this.showActivateButton;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getShowUseButton() {
        return this.showUseButton;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getShowProgressButton() {
        return this.showProgressButton;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCountdownEndTimeMillis() {
        return this.countdownEndTimeMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAmountText() {
        return this.amountText;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrencyText() {
        return this.currencyText;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProgressButtonText() {
        return this.progressButtonText;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getActivateButtonText() {
        return this.activateButtonText;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUseButtonText() {
        return this.useButtonText;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProgressUrl() {
        return this.progressUrl;
    }

    @NotNull
    public final FuturesTraderProChallengeUiState copy(@NotNull String challengeId, @NotNull String title, long countdownEndTimeMillis, @NotNull String amountText, @NotNull String currencyText, @NotNull String progressButtonText, @NotNull String activateButtonText, @NotNull String useButtonText, @NotNull String progressUrl, @NotNull String useUrl, @Nullable String trialCode, boolean showActivateButton, boolean showUseButton, boolean showProgressButton) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(currencyText, "currencyText");
        Intrinsics.checkNotNullParameter(progressButtonText, "progressButtonText");
        Intrinsics.checkNotNullParameter(activateButtonText, "activateButtonText");
        Intrinsics.checkNotNullParameter(useButtonText, "useButtonText");
        Intrinsics.checkNotNullParameter(progressUrl, "progressUrl");
        Intrinsics.checkNotNullParameter(useUrl, "useUrl");
        return new FuturesTraderProChallengeUiState(challengeId, title, countdownEndTimeMillis, amountText, currencyText, progressButtonText, activateButtonText, useButtonText, progressUrl, useUrl, trialCode, showActivateButton, showUseButton, showProgressButton);
    }

    @NotNull
    public final String getActivateButtonText() {
        return this.activateButtonText;
    }

    @NotNull
    public final String getAmountText() {
        return this.amountText;
    }

    @NotNull
    public final String getChallengeId() {
        return this.challengeId;
    }

    public final long getCountdownEndTimeMillis() {
        return this.countdownEndTimeMillis;
    }

    @NotNull
    public final String getCurrencyText() {
        return this.currencyText;
    }

    @NotNull
    public final String getProgressButtonText() {
        return this.progressButtonText;
    }

    @NotNull
    public final String getProgressUrl() {
        return this.progressUrl;
    }

    public final boolean getShowActivateButton() {
        return this.showActivateButton;
    }

    public final boolean getShowProgressButton() {
        return this.showProgressButton;
    }

    public final boolean getShowUseButton() {
        return this.showUseButton;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTrialCode() {
        return this.trialCode;
    }

    @NotNull
    public final String getUseButtonText() {
        return this.useButtonText;
    }

    @NotNull
    public final String getUseUrl() {
        return this.useUrl;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.challengeId.hashCode() * 31) + this.title.hashCode()) * 31) + Long.hashCode(this.countdownEndTimeMillis)) * 31) + this.amountText.hashCode()) * 31) + this.currencyText.hashCode()) * 31) + this.progressButtonText.hashCode()) * 31) + this.activateButtonText.hashCode()) * 31) + this.useButtonText.hashCode()) * 31) + this.progressUrl.hashCode()) * 31) + this.useUrl.hashCode()) * 31;
        String str = this.trialCode;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showActivateButton)) * 31) + Boolean.hashCode(this.showUseButton)) * 31) + Boolean.hashCode(this.showProgressButton);
    }

    @NotNull
    public String toString() {
        return "FuturesTraderProChallengeUiState(challengeId=" + this.challengeId + ", title=" + this.title + ", countdownEndTimeMillis=" + this.countdownEndTimeMillis + ", amountText=" + this.amountText + ", currencyText=" + this.currencyText + ", progressButtonText=" + this.progressButtonText + ", activateButtonText=" + this.activateButtonText + ", useButtonText=" + this.useButtonText + ", progressUrl=" + this.progressUrl + ", useUrl=" + this.useUrl + ", trialCode=" + this.trialCode + ", showActivateButton=" + this.showActivateButton + ", showUseButton=" + this.showUseButton + ", showProgressButton=" + this.showProgressButton + ')';
    }

    public /* synthetic */ FuturesTraderProChallengeUiState(String str, String str2, long j11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j11, str3, str4, str5, str6, str7, str8, str9, (i11 & 1024) != 0 ? null : str10, (i11 & 2048) != 0 ? false : z11, (i11 & 4096) != 0 ? false : z12, (i11 & 8192) != 0 ? false : z13);
    }
}
