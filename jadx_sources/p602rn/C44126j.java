package p602rn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blankj.utilcode.util.C5287o0;
import com.google.firebase.messaging.Constants;
import com.jumio.core.data.UploadType;
import com.jumio.sdk.JumioSDK;
import com.jumio.sdk.consent.JumioConsentItem;
import com.jumio.sdk.controller.JumioController;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.credentials.JumioCredentialCategory;
import com.jumio.sdk.credentials.JumioCredentialInfo;
import com.jumio.sdk.credentials.JumioFaceCredential;
import com.jumio.sdk.credentials.JumioIDCredential;
import com.jumio.sdk.data.JumioTiltState;
import com.jumio.sdk.document.JumioPhysicalDocument;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioDataCenter;
import com.jumio.sdk.enums.JumioScanMode;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.enums.JumioScanUpdate;
import com.jumio.sdk.error.JumioError;
import com.jumio.sdk.exceptions.SDKNotConfiguredException;
import com.jumio.sdk.interfaces.JumioControllerInterface;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.result.JumioIDResult;
import com.jumio.sdk.result.JumioResult;
import com.jumio.sdk.retry.JumioRetryReason;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.jumio.sdk.termsofuse.JumioTermsOfUse;
import com.kubi.kyc.KycKey;
import com.kubi.kyc.R$string;
import com.kubi.kyc.vendor.jumio.JumioException;
import com.kubi.kyc.vendor.jumio.entity.JumioResp;
import com.kubi.kyc.vendor.jumio.entity.KycStepEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kn.C41076a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p017an.InterfaceC0383a;
import p566qn.C43792b;
import p566qn.C43793c;
import p566qn.C43794d;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: rn.j */
/* JADX INFO: compiled from: JumioKubiViewModel.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020=2\u0006\u0010a\u001a\u00020=2\u0006\u0010W\u001a\u00020\bJ\b\u0010b\u001a\u00020]H\u0014J\u0010\u0010c\u001a\u00020]2\u0006\u0010d\u001a\u00020eH\u0016J\u0010\u0010f\u001a\u00020]2\u0006\u0010g\u001a\u00020hH\u0016J\u0010\u0010i\u001a\u00020]2\u0006\u0010g\u001a\u00020hH\u0002J0\u0010j\u001a\u00020]2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020P0l2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010l2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\b\u0010q\u001a\u00020]H\u0002J\b\u0010r\u001a\u00020]H\u0002J\u0006\u0010s\u001a\u00020]J\u001a\u0010t\u001a\u00020]2\u0006\u0010u\u001a\u00020v2\b\u0010w\u001a\u0004\u0018\u00010xH\u0016J\b\u0010y\u001a\u00020]H\u0002J\b\u0010z\u001a\u00020\bH\u0002J\u0010\u0010{\u001a\u00020]2\u0006\u0010|\u001a\u00020\u0013H\u0002J\u0006\u0010}\u001a\u00020]J\u001b\u0010~\u001a\u00020]2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010w\u001a\u0004\u0018\u00010xH\u0017J\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0011R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u0011R(\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\b0\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\u0011R(\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\b0\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\u0011R\"\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\u0011RH\u0010$\u001a0\u0012,\u0012*\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010&j\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u0001`'\u0018\u00010%0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\n\"\u0004\b)\u0010\u0011R\"\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\n\"\u0004\b,\u0010\u0011R0\u0010-\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020/0.j\b\u0012\u0004\u0012\u00020/`00\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\n\"\u0004\b2\u0010\u0011R\"\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\n\"\u0004\b5\u0010\u0011R\u001a\u00106\u001a\u000207X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\n\"\u0004\b?\u0010\u0011R(\u0010@\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010A0A0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\n\"\u0004\bC\u0010\u0011R\"\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\n\"\u0004\bG\u0010\u0011R\"\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\n\"\u0004\bJ\u0010\u0011R\u0016\u0010K\u001a\n \u001b*\u0004\u0018\u00010L0LX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020NX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010PX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Q\u001a\u0004\u0018\u00010PX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010T\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00170VX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010W\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006\u0083\u0001"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/viewmodel/JumioKubiViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/jumio/sdk/interfaces/JumioControllerInterface;", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "<init>", "()V", "loadingLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getLoadingLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadingTitleLiveData", "getLoadingTitleLiveData", "resultLiveData", "Lcom/kubi/kyc/vendor/jumio/entity/JumioResp;", "getResultLiveData", "setResultLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "scanViewLiveData", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "getScanViewLiveData", "setScanViewLiveData", "scanCredentialPartLiveData", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "getScanCredentialPartLiveData", "setScanCredentialPartLiveData", "scanViewLifecycleLiveData", "kotlin.jvm.PlatformType", "getScanViewLifecycleLiveData", "setScanViewLifecycleLiveData", "scanViewFallbackLiveData", "getScanViewFallbackLiveData", "setScanViewFallbackLiveData", "confirmViewLiveData", "getConfirmViewLiveData", "setConfirmViewLiveData", "rejectViewLiveData", "Lkotlin/Pair;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getRejectViewLiveData", "setRejectViewLiveData", "activityAttachLiveData", "getActivityAttachLiveData", "setActivityAttachLiveData", "kycStepLiveData", "Ljava/util/ArrayList;", "Lcom/kubi/kyc/vendor/jumio/entity/KycStepEntity;", "Lkotlin/collections/ArrayList;", "getKycStepLiveData", "setKycStepLiveData", "scanFlipIDLiveData", "getScanFlipIDLiveData", "setScanFlipIDLiveData", "jumioOcrResult", "Landroid/os/Bundle;", "getJumioOcrResult", "()Landroid/os/Bundle;", "setJumioOcrResult", "(Landroid/os/Bundle;)V", "scanIdHint", "", "getScanIdHint", "setScanIdHint", "jumioNFCScanMode", "", "getJumioNFCScanMode", "setJumioNFCScanMode", "jumioNFCFailReason", "Lcom/jumio/sdk/retry/JumioRetryReason;", "getJumioNFCFailReason", "setJumioNFCFailReason", "jumioNFCLayoutScanLiveData", "getJumioNFCLayoutScanLiveData", "setJumioNFCLayoutScanLiveData", "mApi", "Lcom/kubi/kyc/api/KycApi;", "jumioController", "Lcom/jumio/sdk/controller/JumioController;", "credentialID", "Lcom/jumio/sdk/credentials/JumioCredentialInfo;", "credentialFace", URLCredentialContract.FeedEntry.TABLE_NAME, "Lcom/jumio/sdk/credentials/JumioCredential;", "scanPart", "scanSideList", "", "needNFC", "getNeedNFC", "()Z", "setNeedNFC", "(Z)V", "initialize", "", "context", "Landroid/content/Context;", InterfaceC33826o0.f71244p, "dataCenter", "onCleared", "onError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/jumio/sdk/error/JumioError;", "onFinished", DbParams.KEY_CHANNEL_RESULT, "Lcom/jumio/sdk/result/JumioResult;", "handleJumioOrcResult", "onInitialized", "credentials", "", "consentItems", "Lcom/jumio/sdk/consent/JumioConsentItem;", "termsOfUse", "Lcom/jumio/sdk/termsofuse/JumioTermsOfUse;", "startCredentialScan", "startCardSideScan", "startFaceScan", "onScanStep", "jumioScanStep", "Lcom/jumio/sdk/enums/JumioScanStep;", "data", "", "handleFinish", "checkAndStartNFCScanPart", "startNFCScan", "jumioScanPart", "restartFCScan", "onUpdate", "jumioScanUpdate", "Lcom/jumio/sdk/enums/JumioScanUpdate;", "getKycStepTips", "Lio/reactivex/disposables/Disposable;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioKubiViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioKubiViewModel.kt\ncom/kubi/kyc/vendor/jumio/viewmodel/JumioKubiViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,615:1\n1869#2,2:616\n1#3:618\n*S KotlinDebug\n*F\n+ 1 JumioKubiViewModel.kt\ncom/kubi/kyc/vendor/jumio/viewmodel/JumioKubiViewModel\n*L\n270#1:616,2\n*E\n"})
public final class C44126j extends ViewModel implements JumioControllerInterface, JumioScanPartInterface {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<Boolean> f97431V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Boolean> f97432W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public MutableLiveData<JumioResp> f97433X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public MutableLiveData<JumioScanPart> f97434Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public MutableLiveData<JumioCredentialPart> f97435Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public MutableLiveData<Boolean> f97436a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public MutableLiveData<Boolean> f97437b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public MutableLiveData<JumioScanPart> f97438c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public MutableLiveData<Pair<JumioScanPart, HashMap<?, ?>>> f97439d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public MutableLiveData<JumioScanPart> f97440e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public MutableLiveData<ArrayList<KycStepEntity>> f97441f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public MutableLiveData<JumioScanPart> f97442g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public Bundle f97443h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public MutableLiveData<String> f97444i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public MutableLiveData<Integer> f97445j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public MutableLiveData<JumioRetryReason> f97446k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public MutableLiveData<JumioScanPart> f97447l0;

    /* JADX INFO: renamed from: m0 */
    public InterfaceC0383a f97448m0;

    /* JADX INFO: renamed from: n0 */
    public JumioController f97449n0;

    /* JADX INFO: renamed from: o0 */
    @Nullable
    public JumioCredentialInfo f97450o0;

    /* JADX INFO: renamed from: p0 */
    @Nullable
    public JumioCredentialInfo f97451p0;

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public JumioCredential f97452q0;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public JumioScanPart f97453r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public List<JumioCredentialPart> f97454s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f97455t0;

    /* JADX INFO: renamed from: rn.j$a */
    /* JADX INFO: compiled from: JumioKubiViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[JumioScanStep.values().length];
            try {
                iArr[JumioScanStep.PREPARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JumioScanStep.SCAN_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JumioScanStep.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JumioScanStep.IMAGE_TAKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JumioScanStep.PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[JumioScanStep.NEXT_PART.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[JumioScanStep.CONFIRMATION_VIEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[JumioScanStep.REJECT_VIEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[JumioScanStep.RETRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[JumioScanStep.CAN_FINISH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[JumioScanStep.ATTACH_ACTIVITY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[JumioScanStep.ADDON_SCAN_PART.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[JumioScanUpdate.values().length];
            try {
                iArr2[JumioScanUpdate.CAMERA_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[JumioScanUpdate.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[JumioScanUpdate.NFC_EXTRACTION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[JumioScanUpdate.NFC_EXTRACTION_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[JumioScanUpdate.NFC_EXTRACTION_FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[JumioScanUpdate.CENTER_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[JumioScanUpdate.HOLD_STRAIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[JumioScanUpdate.HOLD_STILL.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[JumioScanUpdate.MOVE_CLOSER.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[JumioScanUpdate.TOO_CLOSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[JumioScanUpdate.TILT.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[JumioScanUpdate.CENTER_FACE.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[JumioScanUpdate.LEVEL_EYES_AND_DEVICE.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[JumioScanUpdate.MOVE_FACE_CLOSER.ordinal()] = 14;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[JumioScanUpdate.FACE_TOO_CLOSE.ordinal()] = 15;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m97197Q(C44126j c44126j, Object obj) {
        Object objM103844constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            JumioScanPart jumioScanPart = c44126j.f97453r0;
            if (jumioScanPart != null) {
                jumioScanPart.retry((JumioRetryReason) obj);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new JumioException(thM103847exceptionOrNullimpl, "JumioLayoutScanCard", false, null, 12, null), null, 2, null);
            ToastCompat.m66437C(R$string.bd_error_retery);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public final void m97228S() throws JSONException {
        Object objM103844constructorimpl;
        JumioCredential jumioCredential;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!this.f97454s0.isEmpty()) {
                JumioCredentialPart jumioCredentialPart = (JumioCredentialPart) CollectionsKt.firstOrNull((List) this.f97454s0);
                JumioScanPart jumioScanPartInitScanPart = (jumioCredentialPart == null || (jumioCredential = this.f97452q0) == null) ? null : jumioCredential.initScanPart(jumioCredentialPart, this);
                this.f97453r0 = jumioScanPartInitScanPart;
                if (jumioScanPartInitScanPart != null) {
                    jumioScanPartInitScanPart.start();
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            MutableLiveData<JumioResp> mutableLiveData = this.f97433X;
            JumioResp jumioResp = new JumioResp();
            jumioResp.setCanRetry(true);
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            jumioResp.setErrorMsgCode(TuplesKt.m90091to(message, ""));
            jumioResp.setRetryFunc(new Function0() { // from class: rn.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44126j.m97198T(this.f97419b);
                }
            });
            mutableLiveData.setValue(jumioResp);
            C43793c.m96450a(thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
            JumioResp value = this.f97433X.getValue();
            C43794d.m96453a("logical_error", value != null ? value.getErrorMsgCode() : null);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m97229U() throws JSONException {
        Object objM103844constructorimpl;
        if (this.f97450o0 == null) {
            m97230V();
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            JumioController jumioController = this.f97449n0;
            if (jumioController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("jumioController");
                jumioController = null;
            }
            JumioCredentialInfo jumioCredentialInfo = this.f97450o0;
            Intrinsics.checkNotNull(jumioCredentialInfo);
            JumioCredential jumioCredentialStart = jumioController.start(jumioCredentialInfo);
            this.f97452q0 = jumioCredentialStart;
            if (jumioCredentialStart instanceof JumioIDCredential) {
                Intrinsics.checkNotNull(jumioCredentialStart, "null cannot be cast to non-null type com.jumio.sdk.credentials.JumioIDCredential");
                JumioIDCredential jumioIDCredential = (JumioIDCredential) jumioCredentialStart;
                if (!jumioIDCredential.getF14686f() && !jumioIDCredential.getCountries().isEmpty()) {
                    try {
                        String str = (String) CollectionsKt.firstOrNull(jumioIDCredential.getCountries().keySet());
                        List<JumioPhysicalDocument> list = jumioIDCredential.getCountries().get(str);
                        Intrinsics.checkNotNull(list);
                        JumioPhysicalDocument jumioPhysicalDocument = (JumioPhysicalDocument) CollectionsKt.firstOrNull((List) list);
                        if (jumioPhysicalDocument != null && str != null) {
                            C43793c.m96452c("onInitialized: country=" + str + ", jumioDocument=" + jumioPhysicalDocument);
                            jumioIDCredential.setConfiguration(str, jumioPhysicalDocument);
                        }
                        Result.m103844constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m103844constructorimpl(ResultKt.createFailure(th2));
                    }
                }
                if (jumioIDCredential.getF14686f()) {
                    this.f97454s0 = CollectionsKt.toMutableList((Collection) jumioIDCredential.getCredentialParts());
                    m97228S();
                } else {
                    MutableLiveData<JumioResp> mutableLiveData = this.f97433X;
                    JumioResp jumioResp = new JumioResp();
                    jumioResp.setErrorMsgCode(C43792b.f96836a.m96447g());
                    mutableLiveData.setValue(jumioResp);
                    C41076a.f91293a.m90059a("-200007");
                    C43793c.m96451b("onInitialized: idCredential.countries.isNullOrEmpty()", null, 2, null);
                    JumioResp value = this.f97433X.getValue();
                    C43794d.m96453a("init_empty_credentials", value != null ? value.getErrorMsgCode() : null);
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            MutableLiveData<JumioResp> mutableLiveData2 = this.f97433X;
            JumioResp jumioResp2 = new JumioResp();
            jumioResp2.setCanRetry(false);
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            jumioResp2.setErrorMsgCode(TuplesKt.m90091to(message, ""));
            mutableLiveData2.setValue(jumioResp2);
            C43793c.m96450a(thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
            JumioResp value2 = this.f97433X.getValue();
            C43794d.m96453a("logical_error", value2 != null ? value2.getErrorMsgCode() : null);
        }
        Result.m103843boximpl(objM103844constructorimpl);
    }

    /* JADX INFO: renamed from: V */
    public final void m97230V() throws JSONException {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JumioController jumioController = this.f97449n0;
            if (jumioController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("jumioController");
                jumioController = null;
            }
            JumioCredentialInfo jumioCredentialInfo = this.f97451p0;
            Intrinsics.checkNotNull(jumioCredentialInfo);
            JumioCredential jumioCredentialStart = jumioController.start(jumioCredentialInfo);
            this.f97452q0 = jumioCredentialStart;
            if (jumioCredentialStart instanceof JumioFaceCredential) {
                Intrinsics.checkNotNull(jumioCredentialStart, "null cannot be cast to non-null type com.jumio.sdk.credentials.JumioFaceCredential");
                this.f97454s0 = CollectionsKt.toMutableList((Collection) ((JumioFaceCredential) jumioCredentialStart).getCredentialParts());
                m97228S();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            MutableLiveData<JumioResp> mutableLiveData = this.f97433X;
            JumioResp jumioResp = new JumioResp();
            jumioResp.setCanRetry(true);
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            jumioResp.setErrorMsgCode(TuplesKt.m90091to(message, ""));
            jumioResp.setRetryFunc(new Function0() { // from class: rn.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44126j.m97199W(this.f97430b);
                }
            });
            mutableLiveData.setValue(jumioResp);
            C43793c.m96450a(thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
            JumioResp value = this.f97433X.getValue();
            C43794d.m96453a("logical_error", value != null ? value.getErrorMsgCode() : null);
        }
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m97196P(C44126j c44126j, JumioError jumioError) throws SDKNotConfiguredException {
        JumioController jumioController = c44126j.f97449n0;
        if (jumioController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jumioController");
            jumioController = null;
        }
        jumioController.retry(jumioError);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m97209w(C44126j c44126j, ArrayList arrayList) {
        c44126j.f97441f0.setValue(arrayList);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<Boolean> m97213A() {
        return this.f97431V;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final MutableLiveData<Boolean> m97214B() {
        return this.f97432W;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getF97455t0() {
        return this.f97455t0;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final MutableLiveData<Pair<JumioScanPart, HashMap<?, ?>>> m97216D() {
        return this.f97439d0;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final MutableLiveData<JumioResp> m97217E() {
        return this.f97433X;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final MutableLiveData<JumioCredentialPart> m97218F() {
        return this.f97435Z;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final MutableLiveData<JumioScanPart> m97219G() {
        return this.f97442g0;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final MutableLiveData<String> m97220H() {
        return this.f97444i0;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final MutableLiveData<Boolean> m97221I() {
        return this.f97437b0;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final MutableLiveData<Boolean> m97222J() {
        return this.f97436a0;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final MutableLiveData<JumioScanPart> m97223K() {
        return this.f97434Y;
    }

    /* JADX INFO: renamed from: L */
    public final void m97224L() throws JSONException {
        Object objM103844constructorimpl;
        MutableLiveData<Boolean> mutableLiveData = this.f97431V;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.f97434Y.setValue(null);
        this.f97436a0.setValue(bool);
        try {
            Result.Companion companion = Result.INSTANCE;
            JumioCredential jumioCredential = this.f97452q0;
            if (jumioCredential instanceof JumioIDCredential) {
                JumioScanPart jumioScanPart = this.f97453r0;
                if (jumioScanPart != null) {
                    jumioScanPart.finish();
                }
                if (m97232n()) {
                    return;
                }
                JumioCredential jumioCredential2 = this.f97452q0;
                if (jumioCredential2 != null) {
                    jumioCredential2.finish();
                }
                this.f97452q0 = null;
                if (this.f97451p0 == null) {
                    JumioController jumioController = this.f97449n0;
                    if (jumioController == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("jumioController");
                        jumioController = null;
                    }
                    jumioController.finish();
                } else {
                    JumioScanPart jumioScanPart2 = this.f97453r0;
                    if ((jumioScanPart2 != null ? jumioScanPart2.getScanMode() : null) != JumioScanMode.NFC) {
                        m97230V();
                    }
                }
            } else if (jumioCredential instanceof JumioFaceCredential) {
                this.f97431V.setValue(Boolean.TRUE);
                JumioScanPart jumioScanPart3 = this.f97453r0;
                if (jumioScanPart3 != null) {
                    jumioScanPart3.finish();
                }
                JumioCredential jumioCredential3 = this.f97452q0;
                if (jumioCredential3 != null) {
                    jumioCredential3.finish();
                }
                JumioController jumioController2 = this.f97449n0;
                if (jumioController2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("jumioController");
                    jumioController2 = null;
                }
                jumioController2.finish();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            MutableLiveData<JumioResp> mutableLiveData2 = this.f97433X;
            JumioResp jumioResp = new JumioResp();
            jumioResp.setErrorMsgCode(C43792b.f96836a.m96446f());
            mutableLiveData2.setValue(jumioResp);
            C41076a.f91293a.m90059a("-200008");
            C43793c.m96450a(thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
            JumioResp value = this.f97433X.getValue();
            C43794d.m96453a("logical_error", value != null ? value.getErrorMsgCode() : null);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m97226N(@NotNull final Context context, @NotNull final String token, @NotNull final String dataCenter, final boolean z11) throws JSONException {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(dataCenter, "dataCenter");
        MutableLiveData<Boolean> mutableLiveData = this.f97431V;
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(bool);
        this.f97432W.setValue(bool);
        C43794d.m96454b("init_sdk", null, 2, null);
        this.f97455t0 = z11;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f97454s0.clear();
            JumioSDK jumioSDK = new JumioSDK(context);
            jumioSDK.setToken(token);
            jumioSDK.setDataCenter(JumioDataCenter.valueOf(dataCenter));
            this.f97449n0 = jumioSDK.start(context, this);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            MutableLiveData<JumioResp> mutableLiveData2 = this.f97433X;
            JumioResp jumioResp = new JumioResp();
            jumioResp.setCanRetry(true);
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            jumioResp.setErrorMsgCode(TuplesKt.m90091to(message, ""));
            jumioResp.setRetryFunc(new Function0() { // from class: rn.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44126j.m97195O(this.f97425b, context, token, dataCenter, z11);
                }
            });
            mutableLiveData2.setValue(jumioResp);
            C41076a.f91293a.m90059a("-200003");
            C43793c.m96450a(thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
            JumioResp value = this.f97433X.getValue();
            C43794d.m96453a("logical_error", value != null ? value.getErrorMsgCode() : null);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m97227R() throws SDKNotConfiguredException {
        JumioRetryReason value = this.f97446k0.getValue();
        if (value != null) {
            JumioScanPart jumioScanPart = this.f97453r0;
            if (jumioScanPart != null) {
                jumioScanPart.retry(value);
            }
            JumioScanPart jumioScanPart2 = this.f97453r0;
            if (jumioScanPart2 != null) {
                jumioScanPart2.start();
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m97231X(JumioScanPart jumioScanPart) {
        this.f97453r0 = jumioScanPart;
        this.f97447l0.setValue(jumioScanPart);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m97232n() {
        if (!this.f97455t0) {
            return false;
        }
        JumioCredential jumioCredential = this.f97452q0;
        JumioScanPart f14678d = jumioCredential != null ? jumioCredential.getF14678d() : null;
        if (f14678d == null) {
            return false;
        }
        m97231X(f14678d);
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final MutableLiveData<JumioScanPart> m97233o() {
        return this.f97440e0;
    }

    @Override // com.jumio.sdk.interfaces.JumioControllerInterface
    public void onError(@NotNull final JumioError error) throws JSONException {
        Intrinsics.checkNotNullParameter(error, "error");
        MutableLiveData<JumioResp> mutableLiveData = this.f97433X;
        JumioResp jumioResp = new JumioResp();
        jumioResp.setCanRetry(error.getF14705a());
        jumioResp.setErrorMsgCode(TuplesKt.m90091to(error.getF14708d(), error.getF14707c()));
        jumioResp.setRetryFunc(new Function0() { // from class: rn.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44126j.m97196P(this.f97420b, error);
            }
        });
        mutableLiveData.setValue(jumioResp);
        C43793c.m96451b("onError: " + C27099x.m66919i(error, false, 2, null), null, 2, null);
        JumioResp value = this.f97433X.getValue();
        C43794d.m96453a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, value != null ? value.getErrorMsgCode() : null);
    }

    @Override // com.jumio.sdk.interfaces.JumioControllerInterface
    public void onFinished(@NotNull JumioResult result) {
        String f14708d;
        String f14707c;
        Intrinsics.checkNotNullParameter(result, "result");
        C43793c.m96452c("onFinished: " + C27099x.m66919i(result, false, 2, null));
        m97225M(result);
        MutableLiveData<JumioResp> mutableLiveData = this.f97433X;
        JumioResp jumioResp = new JumioResp();
        jumioResp.setSuccess(result.getF14738c());
        JumioError f14741f = result.getF14741f();
        String str = "";
        if (f14741f == null || (f14708d = f14741f.getF14708d()) == null) {
            f14708d = "";
        }
        JumioError f14741f2 = result.getF14741f();
        if (f14741f2 != null && (f14707c = f14741f2.getF14707c()) != null) {
            str = f14707c;
        }
        jumioResp.setErrorMsgCode(TuplesKt.m90091to(f14708d, str));
        mutableLiveData.setValue(jumioResp);
    }

    @Override // com.jumio.sdk.interfaces.JumioControllerInterface
    public void onInitialized(@NotNull List<JumioCredentialInfo> credentials, @Nullable List<JumioConsentItem> consentItems, @Nullable JumioTermsOfUse termsOfUse) throws JSONException, SDKNotConfiguredException {
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        C43793c.m96452c("onInitialized: " + C27099x.m66919i(credentials, false, 2, null) + ",policyUrl=" + consentItems);
        if (consentItems != null && !consentItems.isEmpty()) {
            for (JumioConsentItem jumioConsentItem : consentItems) {
                JumioController jumioController = this.f97449n0;
                if (jumioController == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("jumioController");
                    jumioController = null;
                }
                jumioController.userConsented(jumioConsentItem, true);
            }
        }
        if (credentials.isEmpty()) {
            MutableLiveData<JumioResp> mutableLiveData = this.f97433X;
            JumioResp jumioResp = new JumioResp();
            jumioResp.setErrorMsgCode(C43792b.f96836a.m96448h());
            mutableLiveData.setValue(jumioResp);
            C41076a.f91293a.m90059a("-200006");
            C43793c.m96451b("onInitialized: credentials.isNullOrEmpty()", null, 2, null);
            JumioResp value = this.f97433X.getValue();
            C43794d.m96453a("init_empty_credentials", value != null ? value.getErrorMsgCode() : null);
            return;
        }
        C43794d.m96454b("init_success", null, 2, null);
        for (JumioCredentialInfo jumioCredentialInfo : credentials) {
            if (Intrinsics.areEqual(jumioCredentialInfo.getF14681a().name(), "ID")) {
                this.f97450o0 = jumioCredentialInfo;
            }
            if (Intrinsics.areEqual(jumioCredentialInfo.getF14681a().name(), UploadType.FACE)) {
                this.f97451p0 = jumioCredentialInfo;
            }
        }
        m97229U();
    }

    @Override // com.jumio.sdk.interfaces.JumioScanPartInterface
    public void onScanStep(@NotNull JumioScanStep jumioScanStep, @Nullable final Object data) throws JSONException {
        Object obj;
        Intrinsics.checkNotNullParameter(jumioScanStep, "jumioScanStep");
        C43793c.m96452c("scanStep=" + jumioScanStep + ",data=" + C27099x.m66919i(data, false, 2, null));
        switch (a.$EnumSwitchMapping$0[jumioScanStep.ordinal()]) {
            case 1:
                this.f97431V.setValue(Boolean.TRUE);
                this.f97432W.setValue(Boolean.valueOf(this.f97452q0 instanceof JumioFaceCredential));
                break;
            case 2:
                this.f97434Y.setValue(this.f97453r0);
                this.f97436a0.setValue(Boolean.TRUE);
                break;
            case 3:
                this.f97431V.setValue(Boolean.FALSE);
                this.f97432W.setValue(Boolean.TRUE);
                obj = data instanceof JumioCredentialPart ? (JumioCredentialPart) data : null;
                if (obj != null) {
                    this.f97435Z.setValue((JumioCredentialPart) obj);
                }
                break;
            case 4:
                this.f97431V.setValue(Boolean.TRUE);
                this.f97432W.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f97431V.setValue(Boolean.TRUE);
                this.f97432W.setValue(Boolean.valueOf(this.f97452q0 instanceof JumioFaceCredential));
                break;
            case 6:
                this.f97431V.setValue(Boolean.FALSE);
                this.f97442g0.setValue(this.f97453r0);
                obj = data instanceof JumioCredentialPart ? (JumioCredentialPart) data : null;
                if (obj != null) {
                    this.f97435Z.setValue((JumioCredentialPart) obj);
                }
                break;
            case 7:
                this.f97431V.setValue(Boolean.FALSE);
                this.f97434Y.setValue(null);
                this.f97438c0.setValue(this.f97453r0);
                break;
            case 8:
                this.f97431V.setValue(Boolean.FALSE);
                this.f97434Y.setValue(null);
                this.f97439d0.setValue(TuplesKt.m90091to(this.f97453r0, data instanceof HashMap ? (HashMap) data : null));
                break;
            case 9:
                JumioScanPart jumioScanPart = this.f97453r0;
                if ((jumioScanPart != null ? jumioScanPart.getScanMode() : null) == JumioScanMode.NFC) {
                    this.f97445j0.setValue(4);
                    this.f97446k0.setValue((JumioRetryReason) (data instanceof JumioRetryReason ? (JumioRetryReason) data : null));
                } else if (data instanceof JumioRetryReason) {
                    MutableLiveData<JumioResp> mutableLiveData = this.f97433X;
                    JumioResp jumioResp = new JumioResp();
                    jumioResp.setCanRetry(true);
                    JumioRetryReason jumioRetryReason = (JumioRetryReason) data;
                    jumioResp.setErrorMsgCode(TuplesKt.m90091to(jumioRetryReason.getF14743b(), String.valueOf(jumioRetryReason.getF14742a())));
                    jumioResp.setRetryFunc(new Function0() { // from class: rn.a
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C44126j.m97197Q(this.f97417b, data);
                        }
                    });
                    mutableLiveData.setValue(jumioResp);
                }
                break;
            case 10:
                m97224L();
                break;
            case 11:
                this.f97440e0.setValue(this.f97453r0);
                break;
        }
    }

    @Override // com.jumio.sdk.interfaces.JumioScanPartInterface
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    public void onUpdate(@NotNull JumioScanUpdate jumioScanUpdate, @Nullable Object data) {
        Intrinsics.checkNotNullParameter(jumioScanUpdate, "jumioScanUpdate");
        C43793c.m96452c("scanUpdate=" + jumioScanUpdate + ",data=" + C27099x.m66919i(data, false, 2, null));
        switch (a.$EnumSwitchMapping$1[jumioScanUpdate.ordinal()]) {
            case 2:
                this.f97437b0.setValue(Boolean.TRUE);
                break;
            case 3:
                C43793c.m96452c("NFC_EXTRACTION_STARTED");
                this.f97445j0.setValue(1);
                break;
            case 4:
                C43793c.m96452c("NFC Extraction progress " + data);
                this.f97445j0.setValue(2);
                break;
            case 5:
                C43793c.m96452c("NFC_EXTRACTION_FINISHED");
                this.f97445j0.setValue(3);
                break;
            case 6:
                this.f97444i0.setValue(C5287o0.m6331a().getString(R$string.kc_jumio_id_scan_prompt_center_id));
                break;
            case 7:
                this.f97444i0.setValue(C5287o0.m6331a().getString(R$string.kc_jumio_id_scan_prompt_hold_straight));
                break;
            case 8:
                this.f97444i0.setValue(C5287o0.m6331a().getString(R$string.kc_jumio_id_scan_prompt_hold_still));
                break;
            case 9:
                this.f97444i0.setValue(C5287o0.m6331a().getString(R$string.kc_jumio_id_scan_prompt_move_closer));
                break;
            case 10:
                this.f97444i0.setValue(C5287o0.m6331a().getString(R$string.jc_jumio_id_scan_prompt_too_close));
                break;
            case 11:
                JumioTiltState jumioTiltState = data instanceof JumioTiltState ? (JumioTiltState) data : null;
                if (C27039d.m66650j(jumioTiltState != null ? Integer.valueOf(jumioTiltState.getCurrentAngle()) : null) - C27039d.m66650j(jumioTiltState != null ? Integer.valueOf(jumioTiltState.getTargetAngle()) : null) >= 0) {
                    this.f97444i0.setValue(C5287o0.m6331a().getString(R$string.kc_jumio_id_scan_prompt_tilt_less));
                } else {
                    this.f97444i0.setValue(C5287o0.m6331a().getString(R$string.kc_jumio_id_scan_prompt_tilt_more));
                }
                break;
            case 12:
                this.f97444i0.setValue(C5287o0.m6331a().getString(R$string.kc_jumio_face_scan_prompt_align_face));
                break;
            case 13:
                this.f97444i0.setValue(C5287o0.m6331a().getString(R$string.kc_jumio_face_scan_prompt_angle));
                break;
            case 14:
                this.f97444i0.setValue(C5287o0.m6331a().getString(R$string.kc_jumio_face_scan_prompt_too_far));
                break;
            case 15:
                this.f97444i0.setValue(C5287o0.m6331a().getString(R$string.kc_jumio_face_scan_prompt_too_close));
                break;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<JumioScanPart> m97234p() {
        return this.f97438c0;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final MutableLiveData<JumioRetryReason> m97235q() {
        return this.f97446k0;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<JumioScanPart> m97236r() {
        return this.f97447l0;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Integer> m97237s() {
        return this.f97445j0;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final Bundle getF97443h0() {
        return this.f97443h0;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<ArrayList<KycStepEntity>> m97239u() {
        return this.f97441f0;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final Disposable m97240v() {
        Observable<R> observableCompose = this.f97448m0.m1516d("JUMIO").compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: rn.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C44126j.m97209w(this.f97422b, (ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: rn.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C44126j.m97210x(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: rn.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C44126j.m97211y((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: rn.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C44126j.m97212z(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return disposableSubscribe;
    }

    public C44126j() {
        Boolean bool = Boolean.FALSE;
        this.f97431V = new MutableLiveData<>(bool);
        this.f97432W = new MutableLiveData<>(Boolean.TRUE);
        this.f97433X = new MutableLiveData<>(null);
        this.f97434Y = new MutableLiveData<>(null);
        this.f97435Z = new MutableLiveData<>(null);
        this.f97436a0 = new MutableLiveData<>(bool);
        this.f97437b0 = new MutableLiveData<>(bool);
        this.f97438c0 = new MutableLiveData<>(null);
        this.f97439d0 = new MutableLiveData<>(null);
        this.f97440e0 = new MutableLiveData<>(null);
        this.f97441f0 = new MutableLiveData<>(null);
        this.f97442g0 = new MutableLiveData<>(null);
        this.f97443h0 = new Bundle();
        this.f97444i0 = new MutableLiveData<>(null);
        this.f97445j0 = new MutableLiveData<>(0);
        this.f97446k0 = new MutableLiveData<>(null);
        this.f97447l0 = new MutableLiveData<>(null);
        this.f97448m0 = (InterfaceC0383a) C42597a.m93386b().create(InterfaceC0383a.class);
        this.f97454s0 = new ArrayList();
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m97195O(C44126j c44126j, Context context, String str, String str2, boolean z11) throws JSONException {
        c44126j.m97226N(context, str, str2, z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m97198T(C44126j c44126j) throws JSONException {
        c44126j.m97228S();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m97199W(C44126j c44126j) throws JSONException {
        c44126j.m97230V();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m97210x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m97211y(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final void m97212z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public final void m97225M(JumioResult jumioResult) {
        List<JumioCredentialInfo> credentialInfos;
        if (jumioResult.getF14738c() && (credentialInfos = jumioResult.getCredentialInfos()) != null) {
            JumioIDResult iDResult = null;
            for (JumioCredentialInfo jumioCredentialInfo : credentialInfos) {
                if (jumioCredentialInfo.getF14681a() == JumioCredentialCategory.ID) {
                    iDResult = jumioResult.getIDResult(jumioCredentialInfo);
                }
            }
            if (iDResult == null) {
                return;
            }
            this.f97443h0.putString("address", C27041f.m66668h(iDResult.getAddress()));
            this.f97443h0.putString("city", C27041f.m66668h(iDResult.getCity()));
            this.f97443h0.putString("country", C27041f.m66668h(iDResult.getCountry()));
            this.f97443h0.putString("dateOfBirth", C27041f.m66668h(iDResult.getDateOfBirth()));
            this.f97443h0.putString("documentNumber", C27041f.m66668h(iDResult.getDocumentNumber()));
            this.f97443h0.putString("expiryDate", C27041f.m66668h(iDResult.getExpiryDate()));
            this.f97443h0.putString(KycKey.firstName, C27041f.m66668h(iDResult.getFirstName()));
            this.f97443h0.putString(HintConstants.AUTOFILL_HINT_GENDER, C27041f.m66668h(iDResult.getGender()));
            this.f97443h0.putString(KycKey.idType, C27041f.m66668h(iDResult.getIdType()));
            this.f97443h0.putString("issuingCountry", C27041f.m66668h(iDResult.getIssuingCountry()));
            this.f97443h0.putString("issuingDate", C27041f.m66668h(iDResult.getIssuingDate()));
            this.f97443h0.putString(KycKey.lastName, C27041f.m66668h(iDResult.getLastName()));
            this.f97443h0.putString("mrzLine1", C27041f.m66668h(iDResult.getMrzLine1()));
            this.f97443h0.putString("mrzLine2", C27041f.m66668h(iDResult.getMrzLine2()));
            this.f97443h0.putString("mrzLine3", C27041f.m66668h(iDResult.getMrzLine3()));
            this.f97443h0.putString("national", C27041f.m66668h(iDResult.getNationality()));
            this.f97443h0.putString("personalNumber", C27041f.m66668h(iDResult.getPersonalNumber()));
            this.f97443h0.putString("placeOfBirth", C27041f.m66668h(iDResult.getPlaceOfBirth()));
            this.f97443h0.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, C27041f.m66668h(iDResult.getPostalCode()));
            this.f97443h0.putString("subdivision", C27041f.m66668h(iDResult.getSubdivision()));
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        JumioController jumioController = this.f97449n0;
        if (jumioController != null) {
            JumioController jumioController2 = null;
            if (jumioController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("jumioController");
                jumioController = null;
            }
            if (!jumioController.isComplete()) {
                JumioController jumioController3 = this.f97449n0;
                if (jumioController3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("jumioController");
                } else {
                    jumioController2 = jumioController3;
                }
                jumioController2.stop();
            }
        }
    }
}
