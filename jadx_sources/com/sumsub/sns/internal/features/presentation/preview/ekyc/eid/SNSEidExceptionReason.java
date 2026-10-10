package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/SNSEidExceptionReason;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "HTTPError", "GeneralError", "NetworkError", "InvalidToken", "TokenExpired", "SessionExpired", "InvalidProcessRequirements", "CertificatePinningFailed", "DocumentNotAllowed", "AuthenticationFailed", "IncompatibleClientVersion", "IncompatibleDevice", "AdditionalDataRequired", "CardLost", "InvalidEid", "NoEidCard", "NFCNotAvailable", "WrongPuk", "WrongCan", "CardLocked", "CardDeactivated", "WrongPinFirstAttempt", "WrongPinLastAttempt", "WrongTransportPinFirstAttempt", "WrongTransportPinLastAttempt", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum SNSEidExceptionReason {
    HTTPError("eidHTTPError"),
    GeneralError("eidGeneralError"),
    NetworkError("eidNetworkError"),
    InvalidToken("eidInvalidToken"),
    TokenExpired("eidTokenExpired"),
    SessionExpired("eidSessionExpired"),
    InvalidProcessRequirements("eidInvalidProcessRequirements"),
    CertificatePinningFailed("certificatePinningFailed"),
    DocumentNotAllowed("documentNotAllowed"),
    AuthenticationFailed("eidAuthenticationFailed"),
    IncompatibleClientVersion("eidIncompatibleClientVersion"),
    IncompatibleDevice("eidIncompatibleDevice"),
    AdditionalDataRequired("eidAdditionalDataRequired"),
    CardLost("eidCardLost"),
    InvalidEid("eidInvalid"),
    NoEidCard("eidNoCard"),
    NFCNotAvailable("eidNFCNotAvailable"),
    WrongPuk("eidWrongPuk"),
    WrongCan("eidWrongCan"),
    CardLocked("eidCardLocked"),
    CardDeactivated("eidCardDeactivated"),
    WrongPinFirstAttempt("eidWrongPinFirstAttempt"),
    WrongPinLastAttempt("eidWrongPinLastAttempt"),
    WrongTransportPinFirstAttempt("eidWrongTransportPinFirstAttempt"),
    WrongTransportPinLastAttempt("eidWrongTransportPinLastAttempt");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String code;

    @NotNull
    public static EnumEntries<SNSEidExceptionReason> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    SNSEidExceptionReason(String str) {
        this.code = str;
    }
}
