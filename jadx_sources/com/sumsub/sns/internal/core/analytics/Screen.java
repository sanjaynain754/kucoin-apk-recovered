package com.sumsub.sns.internal.core.analytics;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\bI\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bK¨\u0006L"}, m90084d2 = {"Lcom/sumsub/sns/internal/core/analytics/Screen;", "Lcom/sumsub/sns/internal/core/analytics/s;", "", "", "text", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Companion", "com/sumsub/sns/internal/core/analytics/r", "StatusScreen", "DocTypeSelectorScreen", "CountriesScreen", "InstructionsScreen", "CameraScreen", "VideoScreen", "PreviewScreen", "MrtdScreen", "LivenessScreen", "ApplicantDataScreen", "ConfirmationContactScreen", "ConfirmationCodeScreen", "QuestionnaireScreen", "ExitSurveyScreen", "SupportScreen", "AgreementScreen", "AgreementSelectorScreen", "OopsFatalScreen", "OopsNetworkScreen", "OopsActionScreen", "RestrictionsScreen", "SystemImagePicker", "SystemDocumentPicker", "VideoidentScreen", "ProofOfAddressScreen", "ProofOfAddressFormScreen", "ImageViewer", "EkycFormScreen", "EkycOtpConfirmationScreen", "EkycOauthConfirmationScreen", "EkycFinishScreen", "VideoidentLangSelectorScreen", "EidPinSelection", "EidPinInfo", "EidServiceInfo", "EidIdentInfo", "EidNfcScan", "EidPinPad", "EidUnlockSuccess", "EidPinChangeSuccess", "EidCanRequired", "OtpAgreementsScreen", "OtpConfirmationScreen", "ESignAgreementScreen", "ESignDocumentsScreen", "ESignDataScreen", "ESignOtpConfirmationScreen", "ESignFinishScreen", "ESignDocumentPreviewScreen", "SumsubIdEmailScreen", "SumsubIdAgreementScreen", "SumsubIdCodeScreen", "SumsubIdReuseScreen", "SumsubIdProfileScreen", "SumsubIdGreetingScreen", "SumsubIdDataProcessedScreen", "PoaUploadScreen", "PoaInstructionsScreen", "DocumentPreviewScreen", "MrtdTipsScreen", "SumsubIdLearnMoreScreen", "PaymentMethodsSelectorScreen", "PaymentMethodsBankCardUploadScreen", "Other", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum Screen implements InterfaceC28380s {
    StatusScreen("statusScreen"),
    DocTypeSelectorScreen("docTypeSelectorScreen"),
    CountriesScreen("countriesScreen"),
    InstructionsScreen("instructionsScreen"),
    CameraScreen("cameraScreen"),
    VideoScreen("videoScreen"),
    PreviewScreen("previewScreen"),
    MrtdScreen("mrtdScreen"),
    LivenessScreen("livenessScreen"),
    ApplicantDataScreen("applicantDataScreen"),
    ConfirmationContactScreen("confirmationContactScreen"),
    ConfirmationCodeScreen("confirmationCodeScreen"),
    QuestionnaireScreen("questionnaireScreen"),
    ExitSurveyScreen("exitSurveyScreen"),
    SupportScreen("supportScreen"),
    AgreementScreen("agreementScreen"),
    AgreementSelectorScreen("agreementSelectorScreen"),
    OopsFatalScreen("oopsFatalScreen"),
    OopsNetworkScreen("oopsNetworkScreen"),
    OopsActionScreen("oopsActionScreen"),
    RestrictionsScreen("restrictionsScreen"),
    SystemImagePicker("systemImagePicker"),
    SystemDocumentPicker("systemDocumentPicker"),
    VideoidentScreen("videoidentScreen"),
    ProofOfAddressScreen("poaGeolocationScreen"),
    ProofOfAddressFormScreen("poaFormScreen"),
    ImageViewer("photoViewerScreen"),
    EkycFormScreen("ekycFormScreen"),
    EkycOtpConfirmationScreen("ekycOtpConfirmationScreen"),
    EkycOauthConfirmationScreen("ekycOauthConfirmationScreen"),
    EkycFinishScreen("ekycFinishScreen"),
    VideoidentLangSelectorScreen("videoidentLangSelectorScreen"),
    EidPinSelection("eidPinSelectionScreen"),
    EidPinInfo("eidPinInfoScreen"),
    EidServiceInfo("eidServiceInfoScreen"),
    EidIdentInfo("eidIdentInfoScreen"),
    EidNfcScan("eidNfcScanScreen"),
    EidPinPad("eidPinPadScreen"),
    EidUnlockSuccess("eidUnlockSuccessScreen"),
    EidPinChangeSuccess("eidPinChangeSuccessScreen"),
    EidCanRequired("eidCanRequiredScreen"),
    OtpAgreementsScreen("otpAgreementsScreen"),
    OtpConfirmationScreen("otpConfirmationScreen"),
    ESignAgreementScreen("esignAgreementScreen"),
    ESignDocumentsScreen("esignDocumentsScreen"),
    ESignDataScreen("esignDataScreen"),
    ESignOtpConfirmationScreen("esignOtpConfirmationScreen"),
    ESignFinishScreen("esignFinishScreen"),
    ESignDocumentPreviewScreen("esignDocumentPreviewScreen"),
    SumsubIdEmailScreen("sumsubidContactScreen"),
    SumsubIdAgreementScreen("sumsubidAgreementScreen"),
    SumsubIdCodeScreen("sumsubidCodeScreen"),
    SumsubIdReuseScreen("sumsubidReuseScreen"),
    SumsubIdProfileScreen("sumsubidProfileScreen"),
    SumsubIdGreetingScreen("sumsubIdGreetingScreen"),
    SumsubIdDataProcessedScreen("sumsubIdDataProcessedScreen"),
    PoaUploadScreen("poaUploadScreen"),
    PoaInstructionsScreen("poaInstructionsScreen"),
    DocumentPreviewScreen("documentPreviewScreen"),
    MrtdTipsScreen("mrtdTipsScreen"),
    SumsubIdLearnMoreScreen("sumsubIdLearnMoreScreen"),
    PaymentMethodsSelectorScreen("paymentMethodsSelectorScreen"),
    PaymentMethodsBankCardUploadScreen("paymentMethodsBankCardUploadScreen"),
    Other("other");


    @NotNull
    private final String text;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final C28379r Companion = new C28379r();

    @NotNull
    public static EnumEntries<Screen> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public String getText() {
        return this.text;
    }

    Screen(String str) {
        this.text = str;
    }
}
