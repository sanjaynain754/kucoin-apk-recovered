package com.sumsub.sns.internal.core.analytics;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/sumsub/sns/internal/core/analytics/Popup;", "Lcom/sumsub/sns/internal/core/analytics/s;", "", "", "text", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "MrtdExitPopup", "NfcRequestPopup", "AgreementsPopup", "VideoIdentExitPopup", "VerificationExitPopup", "EkycConfirmationPopup", "BottomSheet", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum Popup implements InterfaceC28380s {
    MrtdExitPopup("mrtdExitPopup"),
    NfcRequestPopup("nfcRequestPopup"),
    AgreementsPopup("agreementsPopup"),
    VideoIdentExitPopup("videoidentExitPopup"),
    VerificationExitPopup("verificationExitPopup"),
    EkycConfirmationPopup("ekycConfirmationPopup"),
    BottomSheet("bottomSheet");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String text;

    @NotNull
    public static EnumEntries<Popup> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public String getText() {
        return this.text;
    }

    Popup(String str) {
        this.text = str;
    }
}
