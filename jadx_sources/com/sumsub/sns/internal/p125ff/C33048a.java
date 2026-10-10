package com.sumsub.sns.internal.p125ff;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import com.sumsub.sns.internal.p125ff.core.C33051b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ff.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33048a {

    /* JADX INFO: renamed from: A */
    public static final C33050a f67438A;

    /* JADX INFO: renamed from: B */
    public static final C33050a f67439B;

    /* JADX INFO: renamed from: C */
    public static final C33050a f67440C;

    /* JADX INFO: renamed from: D */
    public static final C33050a f67441D;

    /* JADX INFO: renamed from: E */
    public static final C33050a f67442E;

    /* JADX INFO: renamed from: F */
    public static final C33050a f67443F;

    /* JADX INFO: renamed from: G */
    public static final C33050a f67444G;

    /* JADX INFO: renamed from: H */
    public static final C33050a f67445H;

    /* JADX INFO: renamed from: I */
    public static final C33050a f67446I;

    /* JADX INFO: renamed from: J */
    public static final C33050a f67447J;

    /* JADX INFO: renamed from: K */
    public static final C33050a f67448K;

    /* JADX INFO: renamed from: L */
    public static final C33050a f67449L;

    /* JADX INFO: renamed from: M */
    public static final C33050a f67450M;

    /* JADX INFO: renamed from: N */
    public static final C33050a f67451N;

    /* JADX INFO: renamed from: O */
    public static final C33050a f67452O;

    /* JADX INFO: renamed from: P */
    public static final C33050a f67453P;

    /* JADX INFO: renamed from: Q */
    public static final C33050a f67454Q;

    /* JADX INFO: renamed from: R */
    public static final C33050a f67455R;

    /* JADX INFO: renamed from: S */
    public static final C33050a f67456S;

    /* JADX INFO: renamed from: T */
    public static final C33050a f67457T;

    /* JADX INFO: renamed from: U */
    public static final C33050a f67458U;

    /* JADX INFO: renamed from: V */
    public static final C33050a f67459V;

    /* JADX INFO: renamed from: W */
    public static final C33050a f67460W;

    /* JADX INFO: renamed from: X */
    public static final C33050a f67461X;

    /* JADX INFO: renamed from: Y */
    public static final C33050a f67462Y;

    /* JADX INFO: renamed from: Z */
    public static final C33050a f67463Z;

    /* JADX INFO: renamed from: a */
    public static final C33048a f67464a = new C33048a();

    /* JADX INFO: renamed from: a0 */
    public static final C33050a f67465a0;

    /* JADX INFO: renamed from: b */
    public static final C33051b f67466b;

    /* JADX INFO: renamed from: b0 */
    public static final C33050a f67467b0;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f67468c;

    /* JADX INFO: renamed from: c0 */
    public static final C33050a f67469c0;

    /* JADX INFO: renamed from: d */
    public static final C33050a f67470d;

    /* JADX INFO: renamed from: d0 */
    public static final C33050a f67471d0;

    /* JADX INFO: renamed from: e */
    public static final C33050a f67472e;

    /* JADX INFO: renamed from: f */
    public static final C33050a f67473f;

    /* JADX INFO: renamed from: g */
    public static final C33050a f67474g;

    /* JADX INFO: renamed from: h */
    public static final C33050a f67475h;

    /* JADX INFO: renamed from: i */
    public static final C33050a f67476i;

    /* JADX INFO: renamed from: j */
    public static final C33050a f67477j;

    /* JADX INFO: renamed from: k */
    public static final C33050a f67478k;

    /* JADX INFO: renamed from: l */
    public static final C33050a f67479l;

    /* JADX INFO: renamed from: m */
    public static final C33050a f67480m;

    /* JADX INFO: renamed from: n */
    public static final C33050a f67481n;

    /* JADX INFO: renamed from: o */
    public static final C33050a f67482o;

    /* JADX INFO: renamed from: p */
    public static final C33050a f67483p;

    /* JADX INFO: renamed from: q */
    public static final C33050a f67484q;

    /* JADX INFO: renamed from: r */
    public static final C33050a f67485r;

    /* JADX INFO: renamed from: s */
    public static final C33050a f67486s;

    /* JADX INFO: renamed from: t */
    public static final C33050a f67487t;

    /* JADX INFO: renamed from: u */
    public static final C33050a f67488u;

    /* JADX INFO: renamed from: v */
    public static final C33050a f67489v;

    /* JADX INFO: renamed from: w */
    public static final C33050a f67490w;

    /* JADX INFO: renamed from: x */
    public static final C33050a f67491x;

    /* JADX INFO: renamed from: y */
    public static final C33050a f67492y;

    /* JADX INFO: renamed from: z */
    public static final C33050a f67493z;

    /* JADX INFO: renamed from: a */
    public static final CharSequence m71431a(C33050a c33050a) {
        String str = c33050a.f67494a;
        String str2 = c33050a.m71435b().f67504b;
        return str + " = " + (str2 != null ? StringsKt.replace$default(str2, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "", false, 4, (Object) null) : null);
    }

    static {
        C33051b c33051b = new C33051b();
        f67466b = c33051b;
        f67468c = new ConcurrentHashMap();
        f67470d = c33051b.m71436a("androidVideoIdentConfig", "{\"codec\":\"vp8\"}", false, "Video ident config.\n\nPreferred video encoding codec used in VI.\nKey: 'codec'. Values: h264 or vp8");
        f67472e = c33051b.m71436a("videoIdentSkipNotificationPermission", null, true, "Disables notification permission request for Android 13 or later");
        f67473f = c33051b.m71436a("androidMlKitFaceDetectorToggle", null, false, "Enabling MlKit face detector on Android");
        f67474g = c33051b.m71436a("androidTFFaceDetectorToggle", null, false, "Enabling Tensorflow face detector on Android");
        f67475h = c33051b.m71436a("androidDisableFaceDetectorSwitching", null, false, "Disable face detector switching");
        f67476i = c33051b.m71436a("androidUseVerification2", null, false, "Use refactored verification step with host fragment and sub-fragments");
        f67477j = c33051b.m71436a("skipGeolocationForm", null, true, "Skip address confirmation form");
        f67478k = c33051b.m71436a("livenessFullscreenCamera", null, true, "Full-screen camera in liveness check (transparent status bar)");
        f67479l = c33051b.m71436a("enableFaceDetectionDebug", null, true, "Draw a box around face during liveness");
        f67480m = c33051b.m71436a("enableFaceShowSettings", null, true, "Display a dialog asking for edit settings, in order to change the brightness to full during liveness to highlight the face");
        f67481n = c33051b.m71436a("makeCountryStateDropdownRequiredIfNeeded", null, false, "On the Applicant Data screen, set the State (StateOfBirth) field required if the corresponding field (Country or CountryOfBirth) is required and there is a list of states for the selected country");
        f67482o = c33051b.m71436a("stringResourcesKeys", null, true, "Show string key instead of empty value, or show only keys (value = key)");
        f67483p = c33051b.m71436a("forcePhotoDocumentPickerGallery", null, true, "Force enable gallery picker");
        f67484q = c33051b.m71436a("unsatisfactoryPhotosMobileConfigV2", "{\n  \"android\":{\n    \"model\":\"unsatisfactory_photos_v2.tflite\",\n    \"high_quality_threshold\":0.75,\n    \"low_quality_threshold\":0.2,\n    \"execution_timeout_ms\":3000,\n    \"allow_cache\":true,\n    \"max_blocked_attempts\": 1,\n    \"allowed_steps\":[\n      \"IDENTITY\",\n      \"IDENTITY2\",\n      \"IDENTITY3\",\n      \"IDENTITY4\"\n    ]\n  }\n}", false, "Config for unsatisfactory photos detector in document capture.");
        f67485r = c33051b.m71436a("seamlessDocaptureAndroidToggle", null, false, "Disable seamless android only. Just in case and for testing purposes");
        f67486s = c33051b.m71436a("seamlessDocaptureMobileConfig", "{\n    \"android\": {\n        \"videoBitrate\": 1500000,\n        \"maxRecordedDurationSec\": 60,\n        \"videoQuality\": \"HD\",\n        \"videoFallbackQuality\": \"SD\",\n        \"maxRecordedFileSizeMB\": 30\n    }\n}", false, "For advanced seamlessDocapture configuration ....");
        f67487t = c33051b.m71436a("documentAutocaptureMobileToggle", null, false, "Enabling autocapture as separate feature");
        f67488u = c33051b.m71436a("msdkCameraV2", null, false, "Enabling updated UI for document auto capture.");
        f67489v = c33051b.m71436a("documentAutocaptureMobileConfigV2", "{\n    \"android\": {\n        \"requiredFrameFillRatio\": 0.4,\n        \"requiredFrameFillRatioV2\": 0.2,\n        \"requiredLargestSizeOffsetRatio\": 0.2,\n        \"requiredLargestSizeOffsetRatioV2\": 0.4,\n        \"frameAspectRatio\": 1.0,\n        \"showBounds\": false,\n        \"autoCaptureModel\": {\n            \"name\": \"autocapture_v2.tflite\",\n            \"threshold\": 0.7,\n            \"allowCache\": true,\n            \"inputSize\": {\n                \"width\": 384,\n                \"height\": 640\n            },\n            \"outputSize\": 5040\n        }\n    }\n}", false, "Json configuration documentAutocapture ....");
        f67490w = c33051b.m71436a("w2AskToTiltDocumentOnSeamless", null, false, "Enable document tilting during Seamless capture to validate document liveness and security features, ensuring the document is real, physically present, and not a static or spoofed image.");
        f67491x = c33051b.m71436a("w2AskToTiltDocumentOnSeamlessConfig", "{\n    \"tiltAnimationCycleDurationSec\": 3.0,\n    \"tiltAnimationNumberOfCycles\": 1,\n    \"tiltWaitAfterAnimationSec\": 3.0\n}", false, "Tunable timing for the document tilt animation shown during Seamless capture.");
        f67492y = c33051b.m71436a("ekycTestMasks", null, true, "Ekyc masks configuration");
        f67493z = c33051b.m71436a("msdkSkipAgreementSigning", null, false, "Don't show agreement selector screen if multiple agreements available, or skip signing the agreement on status screen if only one agreement available.");
        f67438A = c33051b.m71436a("msdkSkipIdStepPreview", null, false, "Skip the ID document preview/confirmation screen and upload directly from the camera.");
        f67439B = c33051b.m71436a("agreementsCount", "2", true, "Specify agreements count for the agreement selector screen. Random countries with random agreements will be generated.");
        f67440C = c33051b.m71436a("testIpHeader", "85.214.132.117", true, "value to pass X-Test-Ip over.");
        f67441D = c33051b.m71436a("msdkEnableVerificationExitPopup", null, false, "Show confirmation dialog on closing VideoIdent flow and close the SDK");
        f67442E = c33051b.m71436a("msdkExitSurvey", null, false, "Show exit survey on skipping verification.");
        f67443F = c33051b.m71436a("msdkExitSurveyConfig", "{\n    \"options\": [\n        \"dontWantProvideDocuments\",\n        \"dontHaveDocumentWithMe\",\n        \"cantTakeGoodPhoto\",\n        \"cantTakeSelfie\",\n        \"other\"\n    ]\n}", false, "Exit survey configuration");
        f67444G = c33051b.m71436a("overrideVerificationUrl", "{\n    \"verificationUrl\": \"http://dev-in.sumsub.com/\",\n    \"accessToken\" : \"AAA\"\n}", false, "Override base URL and access token to emulate verificationUrl and accessToken on msdkInit");
        f67445H = c33051b.m71436a("androidAllowFaceScanFrameCalibration", null, false, "Enable fingerprint collection with FaceScan segment");
        f67446I = c33051b.m71436a("nfcShareKinegramData", null, false, "Enable sharing kinegram data to backend");
        f67447J = c33051b.m71436a("androidDisableAALCardUnblocking", null, false, "Disable eid card using PUK");
        f67448K = c33051b.m71436a("eidPinChangeTesting", null, true, "Allow to change 5-digit PIN to 6-digit PIN multiple times.\n\nIMPORTANT: under the hood this is a real 6-digit to 6-digit PIN changing! Be careful and try not to block the card by providing the wrong PIN!\n\nHow to use: on the first screen provide first 5 digits of the old 6-digit PIN, then on the second test screen provide the last digit of the old 6-digit PIN. On the third and fourth screens provide the new 6-digit PIN.");
        f67449L = c33051b.m71436a("levelChangeTimeout", "60000", true, "Allow to change the timeout of waiting for level change in SNSAppViewModel.");
        f67450M = c33051b.m71436a("faceDetectorImageResizingDisabled", null, false, "Disable face detector ImageProxy resizing to avoid black stripes issue");
        f67451N = c33051b.m71436a("msdkHideStepsOnPendingScreen", null, false, "Toggles the visibility of steps in applicant status screen when in Review state");
        f67452O = c33051b.m71436a("overrideShowWelcomeWithAgreement", null, true, "Override AppConfig.showWelcomeWithAgreement to false");
        f67453P = c33051b.m71436a("disableCamera", null, true, "Disables camera initialization in ID and Liveness fragments");
        c33051b.m71436a("uiTestMockSelfieLiveness", null, true, "In UI tests: send a mock selfie file");
        f67454Q = c33051b.m71436a("disableEidNfcCheck", null, true, "Disable NFC check on EID screen. For testing only.");
        f67455R = c33051b.m71436a("disableNfcHardware", null, true, "Diable NFC hardware. For testing only.");
        f67456S = c33051b.m71436a("mockESign", null, true, "Mock ESign for screenshot tests");
        f67457T = c33051b.m71436a("androidDisableLivenessV2", null, false, "Disables new Liveness implementation");
        f67458U = c33051b.m71436a("ekycOpenOAuthInExternalBrowser", null, true, "Open oAuth sources always in external browser/app");
        f67459V = c33051b.m71436a("androidDisableEkycRedirectConfirm", null, false, "Disable the redirect-confirm bottom sheet shown before submitting an eKYC OAuth source. When enabled, source instructions are rendered inline in the form as before, and the Continue button submits immediately without showing the sheet.");
        f67460W = c33051b.m71436a("androidDisablePoaV2", null, false, "Disables PoA redesign");
        f67461X = c33051b.m71436a("fishermanSimulationConfig", "{\n  \"-visitor_id\": \"123\",\n  \"-request_id\": \"321\"\n}", true, "FishermanSDK simulation config json, Value with '-' means that parameter is disabled. Both disabled values mean that simulation config is completely disabled (Default).");
        f67462Y = c33051b.m71436a("hideRealStepStatusUntilApplicantIsReviewed", null, false, "Hides real steps status until applicant is reviewed and shows them as Under Review.");
        f67463Z = c33051b.m71436a("androidDisableScreenTransitionAnimations", null, false, "Disables screen transitions animations.");
        f67465a0 = c33051b.m71436a("sumsubIdDisabledByDefault", null, true, "Sets SumsubID switch to disabled by default");
        f67467b0 = c33051b.m71436a("msdkServerNavigation", null, false, "Enables server navigation");
        f67469c0 = c33051b.m71436a("msdkAskPhoneNumberBeforeVI", null, false, "Allows to ask mobile number before video session started.");
        f67471d0 = c33051b.m71436a("androidApplicantPollingConfig", "{\n    \"periodSec\": 120,\n    \"armedRefresh\": false,\n    \"waitForConnection\": true,\n    \"waitTimeoutMs\": 3000,\n    \"stopTimeoutMs\": 5000\n}", false, "Fallback applicant data polling that catches updates missed by the websocket.\n\nPolling period in seconds.\nKey: 'periodSec'. Values: any positive integer\n\nArm a data refresh on the next socket connect when waiting for the connection timed out.\nKey: 'armedRefresh'. Values: true/false\n\nWait for the socket connection (with a timeout) before executing a request that expects live updates.\nKey: 'waitForConnection'. Values: true/false\n\nHow long to wait for the socket connection, in milliseconds.\nKey: 'waitTimeoutMs'. Values: any non-negative integer\n\nHow long the socket stays alive after the last subscriber leaves, in milliseconds.\nKey: 'stopTimeoutMs'. Values: any non-negative integer");
    }

    /* JADX INFO: renamed from: a */
    public static void m71432a() {
        C33051b c33051b = f67466b;
        List listPlus = CollectionsKt.plus(c33051b.f67501a.values(), (Iterable) c33051b.f67502b.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listPlus) {
            if (((C33050a) obj).m71434a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList2.add(((C33050a) obj2).f67494a);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj3 = arrayList.get(i11);
            i11++;
            if (((C33050a) obj3).m71435b().f67504b != null) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
        String strJoinToString$default = arrayList4 != null ? CollectionsKt.joinToString$default(arrayList4, ",\n", "[\n", "\n]", 0, null, new Function1() { // from class: com.sumsub.sns.internal.ff.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                return C33048a.m71431a((C33050a) obj4);
            }
        }, 24, null) : null;
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("Features", "enabled FFs: " + arrayList2, null);
        if (strJoinToString$default != null) {
            c33270a.f67810a.mo68955d("Features", "enabled FFs with custom values: " + strJoinToString$default, null);
        }
    }
}
