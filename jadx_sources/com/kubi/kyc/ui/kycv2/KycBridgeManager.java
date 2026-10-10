package com.kubi.kyc.ui.kycv2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.appsflyer.AppsFlyerProperties;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kyc.R$string;
import com.kubi.kyc.ui.DialogHelper;
import com.kubi.kyc.ui.kycv2.advance.AdvancePreviewFragment;
import com.kubi.kyc.ui.kycv2.camera.KycCameraFragment;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKycKycAdvanceResult;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKycKycFaceDataResult;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33577c3;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import gn.InterfaceC37974a;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p566qn.C43791a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.functions.Function6;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import tn.C45052j;
import xb0.C46126b;

/* JADX INFO: compiled from: KycBridgeManager.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u00182\b\u00102\u001a\u0004\u0018\u00010\u00182\u0006\u00103\u001a\u0002042\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001a0\u0016J4\u00107\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00182\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001a0\u0016H\u0002J2\u00108\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0018J\u001e\u0010=\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000204J2\u0010A\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0001JZ\u0010C\u001a\u00020\u001a2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0018J-\u0010K\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001a0MH\u0000¢\u0006\u0002\bNJ\u0010\u0010O\u001a\u00020\u001a2\u0006\u0010/\u001a\u000200H\u0002J*\u0010P\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\u0006\u0010Q\u001a\u00020\u00182\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001a0\u0016J6\u0010R\u001a\u00020\u001a2\b\u0010S\u001a\u0004\u0018\u00010\u00012\b\u0010;\u001a\u0004\u0018\u00010\u00012\u0006\u0010/\u001a\u0002002\u0006\u0010@\u001a\u0002042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0018J\u0006\u0010T\u001a\u00020\u001aJ¼\u0001\u0010U\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\b\u0010@\u001a\u0004\u0018\u0001042\b\u00101\u001a\u0004\u0018\u00010\u00182\u0097\u0001\u00105\u001a\u0092\u0001\u0012\u0015\u0012\u0013\u0018\u00010W¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(Z\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b([\u0012\u0015\u0012\u0013\u0018\u00010\\¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(]\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(^\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(_\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(`\u0012\u0004\u0012\u00020\u001a0VJÆ\u0001\u0010U\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\b\u0010@\u001a\u0004\u0018\u0001042\b\u00101\u001a\u0004\u0018\u00010\u00182\b\u0010a\u001a\u0004\u0018\u00010\u00182\u0097\u0001\u00105\u001a\u0092\u0001\u0012\u0015\u0012\u0013\u0018\u00010W¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(Z\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b([\u0012\u0015\u0012\u0013\u0018\u00010\\¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(]\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(^\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(_\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(`\u0012\u0004\u0012\u00020\u001a0VJB\u0010b\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\u0006\u0010@\u001a\u0002042\u0006\u00101\u001a\u00020\u00182\u0006\u0010c\u001a\u00020\u00182\u0006\u0010d\u001a\u00020\u00182\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001a0\u0016JR\u0010e\u001a\u0002062\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u00182\b\b\u0002\u0010_\u001a\u00020\u00182\b\b\u0002\u0010`\u001a\u00020\u00182\b\b\u0002\u0010f\u001a\u00020\u00182\b\b\u0002\u0010g\u001a\u00020\u00182\b\b\u0002\u0010h\u001a\u00020\u00182\b\b\u0002\u0010i\u001a\u00020\u0018R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000RD\u0010\u0015\u001a,\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0001`\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000¨\u0006j"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/KycBridgeManager;", "", "<init>", "()V", "safeVerifyFlowEvent", "Lkotlinx/coroutines/Job;", "caputureFlowEvent", "getCaputureFlowEvent", "()Lkotlinx/coroutines/Job;", "setCaputureFlowEvent", "(Lkotlinx/coroutines/Job;)V", "advanceFaceLivenessEvent", "getAdvanceFaceLivenessEvent", "setAdvanceFaceLivenessEvent", "uploadManualyFlowEvent", "getUploadManualyFlowEvent", "setUploadManualyFlowEvent", "advanceFlowEvent", "getAdvanceFlowEvent", "setAdvanceFlowEvent", "maunalFlowEvent", "call", "Lkotlin/Function1;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "", "getCall", "()Lkotlin/jvm/functions/Function1;", "setCall", "(Lkotlin/jvm/functions/Function1;)V", "MAUNAL_RESULT", "TAG", "START_GET_PHOTO", "FINISH_GET_PHOTO", "SUCCESS_GET_PHOTO", "FAILED_GET_PHOTO", "ACTIVITY_FINISH", "KUCOIN_CAMERA", "ADVANCE_IQA_CAMERA", "USER_BACK", "KUCOIN_ALBUM", "FRONT", "BACK", "PASSPORT", "IDCARD", "launchJumio", "context", "Landroidx/fragment/app/FragmentActivity;", InterfaceC33826o0.f71244p, "dataCenter", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "callBack", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKycKycAdvanceResult;", "jumioLaunch", "launchCameraActivity", "Landroid/content/Context;", "frontPath", "type", "ekycFlowId", "launchAdvance", "bundle", "Landroid/os/Bundle;", "destroyDisposable", "launchImagePreviewActivity", "backPath", "trackEvent", "get_photo_status", "get_photo_result", "fail_reason", "supplier_name", "photo_side", "id_photo_type", "shoot_type", "checkCameraPermission", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "checkCameraPermission$KycLib_googleRelease", "showOpenCameraDialog", "launchManual", "kycInfoJson", "caputure", "way", "release", "launchLivenessAdvance", "Lkotlin/Function6;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKycKycFaceDataResult;", "Lkotlin/ParameterName;", "name", DbParams.KEY_CHANNEL_RESULT, "transactionId", "", "isSuccess", AppsFlyerProperties.CHANNEL, "errorCode", "errorMessage", "businessType", "launchSumsub", "idDocType", "country", "buildKycCallBackResult", "advanceLivenessId", C33577c3.f69334H, "skey", "image", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycBridgeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycBridgeManager.kt\ncom/kubi/kyc/ui/kycv2/KycBridgeManager\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,469:1\n17#2,2:470\n37#3:472\n36#3,3:473\n81#4,2:476\n81#4,2:478\n*S KotlinDebug\n*F\n+ 1 KycBridgeManager.kt\ncom/kubi/kyc/ui/kycv2/KycBridgeManager\n*L\n249#1:470,2\n253#1:472\n253#1:473,3\n284#1:476,2\n375#1:478,2\n*E\n"})
public final class KycBridgeManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KycBridgeManager f31425a = new KycBridgeManager();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static InterfaceC41775x1 f31426b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static InterfaceC41775x1 f31427c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public static InterfaceC41775x1 f31428d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public static InterfaceC41775x1 f31429e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public static Function1<? super HashMap<String, Object>, Unit> f31430f;

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m37155O(KycBridgeManager kycBridgeManager, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        if ((i11 & 16) != 0) {
            str5 = null;
        }
        if ((i11 & 32) != 0) {
            str6 = null;
        }
        if ((i11 & 64) != 0) {
            str7 = null;
        }
        kycBridgeManager.m37182N(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ KCFlutterBridgeKycKycAdvanceResult m37166l(KycBridgeManager kycBridgeManager, boolean z11, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        if ((i11 & 8) != 0) {
            str3 = "";
        }
        if ((i11 & 16) != 0) {
            str4 = "";
        }
        if ((i11 & 32) != 0) {
            str5 = "";
        }
        if ((i11 & 64) != 0) {
            str6 = "";
        }
        if ((i11 & 128) != 0) {
            str7 = "";
        }
        return kycBridgeManager.m37183k(z11, str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX INFO: renamed from: K */
    public final void m37179K() {
        f31430f = null;
        f31427c = null;
        f31426b = null;
        f31429e = null;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m37152F(String str, String str2, FragmentActivity fragmentActivity) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("data", str);
        }
        if (str2 != null && str2.length() != 0) {
            bundle.putString("data_1", C27041f.m66668h(str2));
        }
        BaseFragmentActivity.m56574n0(fragmentActivity, "", AdvanceFaceFragment.class.getName(), bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m37153I(FragmentActivity fragmentActivity, String str, String str2, String str3, final Function1 function1) {
        C45052j.f101449a.m99644u(fragmentActivity, str, str2, str3, new Function1() { // from class: com.kubi.kyc.ui.kycv2.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycBridgeManager.m37154J(function1, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m37154J(Function1 function1, boolean z11) {
        C44128b.m97259c("KycBridgeManager", "[launchSumsub] isSuccess:" + z11);
        function1.invoke(m37166l(f31425a, z11, "SUMSUB", null, null, null, null, null, null, 252, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m37167n(FragmentActivity fragmentActivity, Object obj, String str) throws JSONException {
        KycBridgeManager kycBridgeManager = f31425a;
        m37172x(kycBridgeManager, fragmentActivity, null, obj, str, 2, null);
        m37155O(kycBridgeManager, "start_get_photo", null, null, "kucoin_camera", ConstantsKt.FACE_CAPTURE_MODE_FRONT, obj instanceof String ? (String) obj : null, null, 70, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m37170t(Function1 function1, boolean z11, Bundle bundle, String errorMsg, String code) {
        Intrinsics.checkNotNullParameter(bundle, "<unused var>");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intrinsics.checkNotNullParameter(code, "code");
        C44128b.m97259c("KycBridgeManager", "[jumioLaunch] isSuccess=" + z11 + ", errorMsg=" + errorMsg + ", code=" + code);
        if (z11) {
            function1.invoke(m37166l(f31425a, true, "JUMIO", null, null, null, null, null, null, 252, null));
        } else {
            function1.invoke(m37166l(f31425a, false, "JUMIO", code, errorMsg, null, null, null, null, 240, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m37171v(FragmentActivity fragmentActivity, Bundle bundle) {
        BaseActivity.INSTANCE.launch(fragmentActivity, AdvancePreviewFragment.class, bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m37172x(KycBridgeManager kycBridgeManager, Context context, String str, Object obj, String str2, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            obj = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        kycBridgeManager.m37189w(context, str, obj, str2);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m37173z(KycBridgeManager kycBridgeManager, FragmentActivity fragmentActivity, String str, String str2, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            obj = null;
        }
        kycBridgeManager.m37190y(fragmentActivity, str, str2, obj);
    }

    /* JADX INFO: renamed from: A */
    public final void m37174A(@NotNull final FragmentActivity context, @Nullable final String str, @Nullable final String str2, @NotNull CompositeDisposable compositeDisposable, @NotNull final Function1<? super KCFlutterBridgeKycKycAdvanceResult, Unit> callBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        C44128b.m97259c("KycBridgeManager", "[launchJumio]");
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            ToastCompat.m66436B(context.getString(R$string.kyc_text_submit_fail), new Object[0]);
            return;
        }
        C43791a c43791a = C43791a.f96834a;
        if (!c43791a.m96440e(context)) {
            m37187s(context, str, str2, callBack);
            return;
        }
        C46126b c46126b = new C46126b(context);
        String[] strArrM96439b = c43791a.m96439b(context);
        Observable<Boolean> observableM101655n = c46126b.m101655n((String[]) Arrays.copyOf(strArrM96439b, strArrM96439b.length));
        final Function1 function1 = new Function1() { // from class: com.kubi.kyc.ui.kycv2.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycBridgeManager.m37150B(context, str, str2, callBack, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableM101655n.subscribe(new Consumer() { // from class: com.kubi.kyc.ui.kycv2.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KycBridgeManager.m37151C(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: D */
    public final void m37175D(@NotNull final FragmentActivity context, @Nullable CompositeDisposable compositeDisposable, @Nullable final String str, @Nullable final String str2, @NotNull Function6<? super KCFlutterBridgeKycKycFaceDataResult, ? super String, ? super Boolean, ? super String, ? super String, ? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        C44128b.m97259c("KycBridgeManager", "[launchLivenessAdvance]");
        InterfaceC41775x1 interfaceC41775x1 = f31428d;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.kyc.event.KycEvent:advance_liveness_event".length();
        }
        f31428d = C12572a.m23692a(context, false, new KycBridgeManager$launchLivenessAdvance$$inlined$bindFlowEvent$1("com.kubi.kyc.event.KycEvent:advance_liveness_event", null, callBack));
        m37185o(context, compositeDisposable, new Function0() { // from class: com.kubi.kyc.ui.kycv2.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KycBridgeManager.m37152F(str, str2, context);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m37176E(@NotNull FragmentActivity context, @Nullable CompositeDisposable compositeDisposable, @Nullable String str, @NotNull Function6<? super KCFlutterBridgeKycKycFaceDataResult, ? super String, ? super Boolean, ? super String, ? super String, ? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        m37175D(context, compositeDisposable, str, "", callBack);
    }

    /* JADX INFO: renamed from: G */
    public final void m37177G(@NotNull FragmentActivity context, @NotNull String kycInfoJson, @NotNull Function1<? super KCFlutterBridgeKycKycAdvanceResult, Unit> callBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(kycInfoJson, "kycInfoJson");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        C44128b.m97259c("KycBridgeManager", "[launchManual]");
        if (f31429e == null) {
            if (C12573b.f21598a.m23696a()) {
                "MaunalResult".length();
            }
            f31429e = C12572a.m23692a(context, false, new KycBridgeManager$launchManual$$inlined$bindFlowEvent$1("MaunalResult", null, callBack));
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(context), null, null, new KycBridgeManager$launchManual$2(kycInfoJson, context, null), 3, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m37178H(@NotNull final FragmentActivity context, @NotNull CompositeDisposable destroyDisposable, @NotNull final String token, @NotNull final String idDocType, @NotNull final String country, @NotNull final Function1<? super KCFlutterBridgeKycKycAdvanceResult, Unit> callBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destroyDisposable, "destroyDisposable");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(idDocType, "idDocType");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        C44128b.m97259c("KycBridgeManager", "[launchSumsub]");
        m37185o(context, destroyDisposable, new Function0() { // from class: com.kubi.kyc.ui.kycv2.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KycBridgeManager.m37153I(context, token, idDocType, country, callBack);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final void m37180L(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        f31427c = interfaceC41775x1;
    }

    /* JADX INFO: renamed from: M */
    public final void m37181M(FragmentActivity fragmentActivity) {
        String string = fragmentActivity.getString(R$string.camera_authorization_tips, fragmentActivity.getString(R$string.camera_storage_authorization));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogHelper.m37110d(fragmentActivity, string, supportFragmentManager, null, null, 24, null);
    }

    /* JADX INFO: renamed from: N */
    public final void m37182N(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("get_photo_status", str);
        }
        if (str2 != null) {
            jSONObject.put("get_photo_result", str2);
        }
        if (str3 != null) {
            jSONObject.put("fail_reason", str3);
        }
        if (str4 != null) {
            jSONObject.put("supplier_name", str4);
        }
        if (str5 != null) {
            jSONObject.put("photo_side", str5);
        }
        if (str6 != null) {
            jSONObject.put("id_photo_type", str6);
        }
        if (str7 != null) {
            jSONObject.put("shoot_type", str7);
        }
        C43852m.m96605q("kyc2_get_id_photo", jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final KCFlutterBridgeKycKycAdvanceResult m37183k(boolean z11, @NotNull String channel, @NotNull String errorCode, @NotNull String errorMessage, @NotNull String advanceLivenessId, @NotNull String deviceId, @NotNull String skey, @NotNull String image) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(advanceLivenessId, "advanceLivenessId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(skey, "skey");
        Intrinsics.checkNotNullParameter(image, "image");
        return new KCFlutterBridgeKycKycAdvanceResult(z11, errorCode, errorMessage, channel, C27099x.m66919i(new KCFlutterBridgeKycKycFaceDataResult(channel, advanceLivenessId, deviceId, skey, image), false, 2, null));
    }

    /* JADX INFO: renamed from: m */
    public final void m37184m(@Nullable Object obj, @Nullable final Object obj2, @NotNull final FragmentActivity context, @NotNull CompositeDisposable destroyDisposable, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destroyDisposable, "destroyDisposable");
        if (Intrinsics.areEqual(obj, (Object) 1)) {
            m37185o(context, destroyDisposable, new Function0() { // from class: com.kubi.kyc.ui.kycv2.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KycBridgeManager.m37167n(context, obj2, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m37185o(@NotNull final FragmentActivity context, @Nullable CompositeDisposable compositeDisposable, @NotNull final Function0<Unit> callback) {
        List<String> listListOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37974a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (listListOf = ((InterfaceC37974a) objM56186h).mo4567a()) == null) {
            listListOf = CollectionsKt.listOf((Object[]) new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        }
        String[] strArr = (String[]) listListOf.toArray(new String[0]);
        Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(new C46126b(context), (String[]) Arrays.copyOf(strArr, strArr.length));
        final Function1 function1 = new Function1() { // from class: com.kubi.kyc.ui.kycv2.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycBridgeManager.m37168p(callback, context, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableM49936e.subscribe(new Consumer() { // from class: com.kubi.kyc.ui.kycv2.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KycBridgeManager.m37169q(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        if (compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final InterfaceC41775x1 m37186r() {
        return f31427c;
    }

    /* JADX INFO: renamed from: s */
    public final void m37187s(FragmentActivity fragmentActivity, String str, String str2, final Function1<? super KCFlutterBridgeKycKycAdvanceResult, Unit> function1) {
        C44128b.m97259c("KycBridgeManager", "[jumioLaunch]");
        C43791a.m96437d(fragmentActivity, str, str2, false, new Function4() { // from class: com.kubi.kyc.ui.kycv2.s
            @Override // p852kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return KycBridgeManager.m37170t(function1, ((Boolean) obj).booleanValue(), (Bundle) obj2, (String) obj3, (String) obj4);
            }
        }, 8, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m37188u(@NotNull final FragmentActivity context, @NotNull final Bundle bundle, @NotNull CompositeDisposable destroyDisposable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(destroyDisposable, "destroyDisposable");
        C44128b.m97259c("KycBridgeManager", "[launchAdvance]");
        bundle.putString(BaseActivity.TITLE_BAR, CredentialEntry.FALSE_STRING);
        m37185o(context, destroyDisposable, new Function0() { // from class: com.kubi.kyc.ui.kycv2.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KycBridgeManager.m37171v(context, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m37189w(@NotNull Context context, @Nullable String str, @Nullable Object obj, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        C44128b.m97259c("KycBridgeManager", "[launchCameraActivity]");
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("front_photo_path", str);
        }
        if (obj != null) {
            bundle.putString("data", obj instanceof String ? (String) obj : null);
        }
        if (str2 != null) {
            bundle.putString("data_1", str2);
        }
        BaseFragmentActivity.m56574n0(context, "", KycCameraFragment.class.getName(), bundle);
    }

    /* JADX INFO: renamed from: y */
    public final void m37190y(@NotNull FragmentActivity context, @Nullable String str, @Nullable String str2, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        C44128b.m97259c("KycBridgeManager", "[launchImagePreviewActivity]");
        Intent intent = new Intent(context, (Class<?>) ImagePreviewActivity.class);
        if (obj != null) {
            intent.putExtra("data", obj instanceof String ? (String) obj : null);
        }
        if (str != null) {
            intent.putExtra("front_photo_path", str);
        }
        if (str2 != null) {
            intent.putExtra("back_photo_path", str2);
        }
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m37150B(FragmentActivity fragmentActivity, String str, String str2, Function1 function1, Boolean bool) {
        if (bool.booleanValue()) {
            f31425a.m37187s(fragmentActivity, str, str2, function1);
        } else {
            String string = fragmentActivity.getString(R$string.camera_authorization_tips, fragmentActivity.getString(com.kubi.sdk.R$string.kyc_camera));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            DialogHelper.m37110d(fragmentActivity, string, supportFragmentManager, null, null, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final void m37151C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m37168p(Function0 function0, FragmentActivity fragmentActivity, Boolean bool) {
        if (bool.booleanValue()) {
            function0.invoke();
        } else {
            f31425a.m37181M(fragmentActivity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m37169q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
