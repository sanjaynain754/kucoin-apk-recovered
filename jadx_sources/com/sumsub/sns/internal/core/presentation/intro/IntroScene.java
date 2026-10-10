package com.sumsub.sns.internal.core.presentation.intro;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;", "", "sceneName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSceneName", "()Ljava/lang/String;", "FACESCAN", "VIDEOSELFIE", "PHOTOSELFIE", "SCAN_FRONTSIDE", "SCAN_BACKSIDE", "DATA", "CONFIRMATION", "QUESTIONNAIRE", "VIDEO_IDENT", "GEO", "MRTD_PREPARING", "MRTD_SCANNING", "MRTD_SCANNED", "MRTD_FAILED", "PORTRAIT_SELFIE", "EKYC", "ESIGN", "PAYMENT_METHOD_BANK_CARD", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum IntroScene {
    FACESCAN("facescan"),
    VIDEOSELFIE("videoSelfie"),
    PHOTOSELFIE("photoSelfie"),
    SCAN_FRONTSIDE("scan_frontSide"),
    SCAN_BACKSIDE("scan_backSide"),
    DATA("data"),
    CONFIRMATION("confirmation"),
    QUESTIONNAIRE("questionnaire"),
    VIDEO_IDENT("videoident"),
    GEO("geolocation"),
    MRTD_PREPARING("mrtd_preparing"),
    MRTD_SCANNING("mrtd_scanning"),
    MRTD_SCANNED("mrtd_scanned"),
    MRTD_FAILED("mrtd_failed"),
    PORTRAIT_SELFIE("portraitSelfie"),
    EKYC("ekyc"),
    ESIGN("esign"),
    PAYMENT_METHOD_BANK_CARD("paymentMethod_bankCard");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String sceneName;

    @NotNull
    public static EnumEntries<IntroScene> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getSceneName() {
        return this.sceneName;
    }

    IntroScene(String str) {
        this.sceneName = str;
    }
}
