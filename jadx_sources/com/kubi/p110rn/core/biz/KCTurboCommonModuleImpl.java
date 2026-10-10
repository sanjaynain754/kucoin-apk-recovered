package com.kubi.p110rn.core.biz;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5276j;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.kubi.data.ClipboardDataHelper;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.p110rn.core.turbo.AppCpsInfo;
import com.kubi.p110rn.core.turbo.AppInfo;
import com.kubi.p110rn.core.turbo.DeviceInfo;
import com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs;
import com.kubi.p110rn.core.turbo.OpenScanResult;
import com.kubi.p110rn.exception.RNMessage;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.p110rn.p111ui.ReactContainerActivity;
import com.kubi.p110rn.p111ui.ReactRootFragment;
import com.kubi.p110rn.protocol.KRNBridgeCommonCallImp;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiCommonAppCpsInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiCommonAppInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiCommonOpenScanResult;
import com.kubi.sdk.util.C24267r0;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36566d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p646ty.C45078a;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KCTurboCommonModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001e\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0016J!\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u001fJ\u0017\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\"J\u0017\u0010#\u001a\u0004\u0018\u00010\u00122\u0006\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0016J&\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u001e\u0010(\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u001e\u0010)\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u000f\u0010*\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010+J\u0019\u0010,\u001a\u0004\u0018\u00010\u00122\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u0016J\u001e\u0010.\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u000f\u0010/\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010+J(\u00100\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u000f\u00102\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010+J\u0017\u00103\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0016J(\u00104\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u001e\u00106\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J&\u00107\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J(\u00108\u001a\u00020\u000f2\b\u00109\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J2\u0010:\u001a\u00020\u000f2\b\u00109\u001a\u0004\u0018\u00010\u00072\b\u0010;\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\n\u0010<\u001a\u0004\u0018\u00010'H\u0016J\u0017\u0010=\u001a\u0004\u0018\u00010\u00122\u0006\u0010>\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0016J\n\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010A\u001a\u0004\u0018\u00010\u00072\u0006\u0010B\u001a\u00020\u0007H\u0016J\u0012\u0010C\u001a\u0004\u0018\u00010\u00072\u0006\u0010B\u001a\u00020\u0007H\u0016J\n\u0010D\u001a\u0004\u0018\u00010'H\u0016J(\u0010E\u001a\u00020\u000f2\b\u0010F\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u001e\u0010G\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010H\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u000f\u0010I\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010+J&\u0010J\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u00122\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\n\u0010L\u001a\u0004\u0018\u00010MH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006N"}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboCommonModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeCommonTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "commonBridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiCommonModule;", "getAppInfo", "Lcom/kubi/rn/core/turbo/AppInfo;", "refreshAppSession", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "getAppVersion", "showToast", "content", "(Ljava/lang/String;)Ljava/lang/Boolean;", "setStatusStyle", TtmlNode.TAG_STYLE, "updateRnContainerUi", "type", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "close", "animated", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;", "setNavSwipe", "canSwipe", "(Z)Ljava/lang/Boolean;", "canIUse", "apiName", "openFlutterDialog", "route", "Lcom/facebook/react/bridge/ReadableMap;", "getAppNotificationPermissionEnabled", "openAppNotificationSettings", "showAppUpgradeAlert", "()Ljava/lang/Boolean;", "openSupportTicketPage", "formId", "refreshAppUserInfo", "reload", "sharePageView", "qrCodeUrl", "vibrate", "playAppSound", "showAddHomePageDialog", "shortcutId", "getPasteBoardContent", "copyToClipboard", "closeDialog", "dialogId", "submitData", "data", "getAllBizControlConfig", "queryBizControlConfig", "uiSpmId", "syncCpsFromApp", "Lcom/kubi/rn/core/turbo/AppCpsInfo;", "getFormatSymbol", "symbol", "getContract", "getLegalPriceRate", "getFingerToken", "event", "openScan", "Lcom/kubi/rn/core/turbo/OpenScanResult;", "isUtaTrading", "setClipboardReadAccessOpen", "enabled", "getDeviceInfo", "Lcom/kubi/rn/core/turbo/DeviceInfo;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeCommonTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboCommonModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboCommonModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboCommonModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,632:1\n295#2,2:633\n19#3,2:635\n19#3,2:637\n19#3,2:639\n*S KotlinDebug\n*F\n+ 1 KCTurboCommonModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboCommonModuleImpl\n*L\n327#1:633,2\n425#1:635,2\n560#1:637,2\n611#1:639,2\n*E\n"})
public final class KCTurboCommonModuleImpl extends NativeCommonTurboModuleAbs {

    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: com.kubi.rn.core.biz.KCTurboCommonModuleImpl$sharePageView$2 */
    /* JADX INFO: compiled from: KCTurboCommonModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.biz.KCTurboCommonModuleImpl$sharePageView$2", m90122f = "KCTurboCommonModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C232372 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ Ref.ObjectRef<BaseFragment> $fragment;
        final /* synthetic */ String $qrCodeUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C232372(Ref.ObjectRef<BaseFragment> objectRef, Function1<? super Boolean, Unit> function1, String str, Continuation<? super C232372> continuation) {
            super(2, continuation);
            this.$fragment = objectRef;
            this.$callback = function1;
            this.$qrCodeUrl = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C232372(this.$fragment, this.$callback, this.$qrCodeUrl, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C232372) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapM66591v = ViewExtKt.m66591v(this.$fragment.element.getContentView(), 0, 1, null);
            IShareService iShareService = IShareService.f49268a.get();
            ImageShareParam imageShareParam = new ImageShareParam("hottopic", null, false, null, false, null, null, null, null, null, 1022, null);
            String str = this.$qrCodeUrl;
            imageShareParam.setBitmap(bitmapM66591v);
            imageShareParam.setQrCodeUrl(str);
            imageShareParam.setNeedQrCode(!(str == null || str.length() == 0));
            IShareService.m59640c(iShareService, imageShareParam, null, 2, null);
            this.$callback.invoke(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openScan$lambda$50$lambda$49(Function1 function1, KCJSApiCommonOpenScanResult kCJSApiCommonOpenScanResult, ProtocolException protocolException) {
        if (protocolException != null) {
            function1.invoke(null);
        } else {
            function1.invoke(kCJSApiCommonOpenScanResult != null ? new OpenScanResult(Boolean.valueOf(kCJSApiCommonOpenScanResult.getSuccess()), kCJSApiCommonOpenScanResult.getQrCode(), null, 4, null) : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboCommonModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.TAG = "RTNCommonBridgeTurboModule";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit canIUse$lambda$9(Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        objectRef.element = bool;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit close$lambda$8(Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        objectRef.element = bool;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeDialog$lambda$32(KCTurboCommonModuleImpl kCTurboCommonModuleImpl, String str, final Function1 function1) {
        KRNBridgeCommonCallImp kRNBridgeCommonCallImp = new KRNBridgeCommonCallImp();
        ReactApplicationContext reactApplicationContext = kCTurboCommonModuleImpl.getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        kRNBridgeCommonCallImp.closeDialog(reactApplicationContext, str, new Function2() { // from class: com.kubi.rn.core.biz.g0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.closeDialog$lambda$32$lambda$31(function1, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    private final InterfaceC36566d commonBridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36566d) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copyToClipboard$lambda$30(Function1 function1, Boolean bool, ProtocolException protocolException) {
        if (protocolException != null) {
            function1.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getAllBizControlConfig$lambda$34(Ref.ObjectRef objectRef, Map map, ProtocolException protocolException) {
        T tEmptyMap = map;
        if (map == null) {
            tEmptyMap = MapsKt.emptyMap();
        }
        objectRef.element = tEmptyMap;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getAppInfo$lambda$1(Ref.ObjectRef objectRef, KCJSApiCommonAppInfo kCJSApiCommonAppInfo, ProtocolException protocolException) {
        objectRef.element = kCJSApiCommonAppInfo;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAppNotificationPermissionEnabled$lambda$13(Function1 function1, Boolean bool, ProtocolException protocolException) {
        if (protocolException != null) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getAppVersion$lambda$5(Ref.ObjectRef objectRef, String str, ProtocolException protocolException) {
        objectRef.element = str;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFingerToken$lambda$46(Function1 function1, String str, ProtocolException protocolException) {
        if (protocolException != null) {
            function1.invoke("");
        } else {
            if (str == null) {
                str = "";
            }
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getLegalPriceRate$lambda$44(Ref.ObjectRef objectRef, Map map, ProtocolException protocolException) {
        T tEmptyMap = map;
        if (map == null) {
            tEmptyMap = MapsKt.emptyMap();
        }
        objectRef.element = tEmptyMap;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPasteBoardContent$lambda$28(Function1 function1, String str, ProtocolException protocolException) {
        if (protocolException != null) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit isUtaTrading$lambda$52(Ref.ObjectRef objectRef, KCTurboCommonModuleImpl kCTurboCommonModuleImpl, Boolean bool, ProtocolException protocolException) {
        objectRef.element = bool;
        if (protocolException == null) {
            return Unit.INSTANCE;
        }
        new RNMessage("isUtaTrading exception: " + protocolException.getMessage(), kCTurboCommonModuleImpl.TAG, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openAppNotificationSettings$lambda$15(Function1 function1, Boolean bool, ProtocolException protocolException) {
        if (protocolException != null) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openFlutterDialog$lambda$11(Function1 function1, Map map, ProtocolException protocolException) {
        if (protocolException != null) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }
        function1.invoke(C24267r0.m58522f(map));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openSupportTicketPage$lambda$17(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit queryBizControlConfig$lambda$35(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        objectRef.element = protocolException;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAppUserInfo$lambda$19(Function1 function1, Boolean bool, ProtocolException protocolException) {
        if (protocolException != null) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reload$lambda$21(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAppUpgradeAlert$lambda$16(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showToast$lambda$6(Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        objectRef.element = bool;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit syncCpsFromApp$lambda$38(Ref.ObjectRef objectRef, KCTurboCommonModuleImpl kCTurboCommonModuleImpl, KCJSApiCommonAppCpsInfo kCJSApiCommonAppCpsInfo, ProtocolException protocolException) {
        objectRef.element = kCJSApiCommonAppCpsInfo;
        if (protocolException == null) {
            return Unit.INSTANCE;
        }
        new RNMessage("queryBizControlConfig exception: " + protocolException.getMessage(), kCTurboCommonModuleImpl.TAG, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRnContainerUi$lambda$7(String str, ReactContainerActivity reactContainerActivity, Boolean bool, KCTurboCommonModuleImpl kCTurboCommonModuleImpl) {
        try {
            if (Intrinsics.areEqual(str, BridgeParamKeyKt.RN_CONTAINER_UI_TYPE_IMMERSIVE_STATUS_BAR)) {
                reactContainerActivity.updateImmersiveStatusBar(Intrinsics.areEqual(bool, Boolean.TRUE));
            }
            C44128b.m97266j(kCTurboCommonModuleImpl.TAG, "updateRnContainerUi: success, type=" + str + ", enable=" + bool);
        } catch (Exception e11) {
            C44128b.m97266j(kCTurboCommonModuleImpl.TAG, "updateRnContainerUi: exception, type=" + str + ", enable=" + bool + ", error=" + e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit vibrate$lambda$24(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean canIUse(@NotNull String apiName) {
        Intrinsics.checkNotNullParameter(apiName, "apiName");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("canIUse exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31664C(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, apiName, new Function2() { // from class: com.kubi.rn.core.biz.z
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.canIUse$lambda$9(objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return (Boolean) objectRef.element;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void closeDialog(@Nullable final String dialogId, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.rn.core.biz.v
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboCommonModuleImpl.closeDialog$lambda$32(this.f45640b, dialogId, callback);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void copyToClipboard(@NotNull String content, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            callback.invoke(Boolean.FALSE);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31683p(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, content, new Function2() { // from class: com.kubi.rn.core.biz.n
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.copyToClipboard$lambda$30(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void getAppNotificationPermissionEnabled(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31672e(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.p
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.getAppNotificationPermissionEnabled$lambda$13(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public String getContract(@NotNull String symbol) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IKuMexService.f28731a.get().mo33257F(symbol));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            new RNMessage("getContract exception: " + thM103847exceptionOrNullimpl.getMessage(), this.TAG, false, 4, null);
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (String) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public DeviceInfo getDeviceInfo() {
        try {
            return new DeviceInfo(C45590s.f102687a.m100661L(), Boolean.valueOf(C5276j.m6250i()));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void getFingerToken(@Nullable String event, @NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("getFingerToken exception: common bridge service not found", this.TAG, false, 4, null);
            callback.invoke("");
        } else {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            interfaceC36566dCommonBridge.mo31689v(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, event, new Function2() { // from class: com.kubi.rn.core.biz.a0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KCTurboCommonModuleImpl.getFingerToken$lambda$46(callback, (String) obj, (ProtocolException) obj2);
                }
            });
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public String getFormatSymbol(@NotNull String symbol) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IKuMexService.f28731a.get().mo33255D(symbol, false).toString());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            new RNMessage("getFormatSymbol exception: " + thM103847exceptionOrNullimpl.getMessage(), this.TAG, false, 4, null);
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (String) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void getPasteBoardContent(@NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31673f(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.getPasteBoardContent$lambda$28(callback, (String) obj, (ProtocolException) obj2);
            }
        });
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void openAppNotificationSettings(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31686s(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.d0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.openAppNotificationSettings$lambda$15(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void openFlutterDialog(@NotNull String route, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            callback.invoke(null);
            return;
        }
        Context currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
        }
        Context context = currentActivity;
        Intrinsics.checkNotNull(context);
        interfaceC36566dCommonBridge.mo31679l(context, null, KCTurboFileModuleImpl.SOURCE_RN, route, new Function2() { // from class: com.kubi.rn.core.biz.b0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.openFlutterDialog$lambda$11(callback, (Map) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void openScan(@NotNull final Function1<? super OpenScanResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.rn.core.biz.i
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboCommonModuleImpl.openScan$lambda$50(this.f45598b, callback);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean playAppSound(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Boolean.valueOf(C45078a.f101478a.m99684a(type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean queryBizControlConfig(@NotNull String uiSpmId) {
        Intrinsics.checkNotNullParameter(uiSpmId, "uiSpmId");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("queryBizControlConfig exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31681n(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, uiSpmId, new Function2() { // from class: com.kubi.rn.core.biz.h0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.queryBizControlConfig$lambda$35(booleanRef, objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        ProtocolException protocolException = (ProtocolException) objectRef.element;
        if (protocolException != null) {
            new RNMessage("queryBizControlConfig exception: " + protocolException.getMessage(), this.TAG, false, 4, null);
        }
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void refreshAppSession(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31682o(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.x
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.refreshAppSession$lambda$4(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void refreshAppUserInfo(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31666E(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.t
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.refreshAppUserInfo$lambda$19(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void setClipboardReadAccessOpen(final boolean enabled, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.rn.core.biz.c0
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboCommonModuleImpl.setClipboardReadAccessOpen$lambda$53(enabled, callback);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean setNavSwipe(boolean canSwipe) {
        return Boolean.FALSE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean setStatusStyle(@NotNull String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, com.kubi.sdk.BaseFragment] */
    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void sharePageView(@Nullable String qrCodeUrl, @NotNull Function1<? super Boolean, Unit> callback) {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        Object next;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (getReactApplicationContext() != null && (getReactApplicationContext().getCurrentActivity() instanceof BaseActivity)) {
            Activity currentActivity = getReactApplicationContext().getCurrentActivity();
            BaseActivity baseActivity = currentActivity instanceof BaseActivity ? (BaseActivity) currentActivity : null;
            if (baseActivity == null || (supportFragmentManager = baseActivity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
                fragment = null;
            } else {
                Iterator<T> it = fragments.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Fragment) next) instanceof ReactRootFragment));
                fragment = (Fragment) next;
            }
            objectRef.element = (BaseFragment) fragment;
        }
        T t11 = objectRef.element;
        if (t11 == 0 || ((BaseFragment) t11).isDetached() || ((BaseFragment) objectRef.element).isRemoving()) {
            callback.invoke(null);
        } else {
            LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) objectRef.element).launchWhenStarted(new C232372(objectRef, callback, qrCodeUrl, null));
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void showAddHomePageDialog(@Nullable String shortcutId, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (shortcutId == null) {
            shortcutId = "";
        }
        interfaceC36566dCommonBridge.mo31676i(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, shortcutId, new Function2() { // from class: com.kubi.rn.core.biz.s
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.showAddHomePageDialog$lambda$26(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean showToast(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("showToast exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31688u(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, content, new Function2() { // from class: com.kubi.rn.core.biz.u
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.showToast$lambda$6(objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return (Boolean) objectRef.element;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    public void submitData(@Nullable String dialogId, @Nullable String data, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        KRNBridgeCommonCallImp kRNBridgeCommonCallImp = new KRNBridgeCommonCallImp();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        kRNBridgeCommonCallImp.submitData(reactApplicationContext, dialogId, data, new Function2() { // from class: com.kubi.rn.core.biz.m
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.submitData$lambda$33(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean updateRnContainerUi(@NotNull final String type, @Nullable final Boolean enable) {
        Intrinsics.checkNotNullParameter(type, "type");
        C44128b.m97266j(this.TAG, "updateRnContainerUi: type=" + type + ", enable=" + enable);
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        final ReactContainerActivity reactContainerActivity = currentActivity instanceof ReactContainerActivity ? (ReactContainerActivity) currentActivity : null;
        if (reactContainerActivity == null) {
            C44128b.m97266j(this.TAG, "updateRnContainerUi: currentActivity is not ReactContainerActivity");
            return Boolean.FALSE;
        }
        if (type.length() == 0) {
            C44128b.m97266j(this.TAG, "updateRnContainerUi: empty type");
            return Boolean.FALSE;
        }
        reactContainerActivity.runOnUiThread(new Runnable() { // from class: com.kubi.rn.core.biz.f
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboCommonModuleImpl.updateRnContainerUi$lambda$7(type, reactContainerActivity, enable, this);
            }
        });
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeDialog$lambda$32$lambda$31(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openScan$lambda$50(KCTurboCommonModuleImpl kCTurboCommonModuleImpl, final Function1 function1) {
        InterfaceC36566d interfaceC36566dCommonBridge = kCTurboCommonModuleImpl.commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("openScan exception: common bridge service not found", kCTurboCommonModuleImpl.TAG, false, 4, null);
            function1.invoke(null);
        } else {
            ReactApplicationContext reactApplicationContext = kCTurboCommonModuleImpl.getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            interfaceC36566dCommonBridge.mo31691x(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.k
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KCTurboCommonModuleImpl.openScan$lambda$50$lambda$49(function1, (KCJSApiCommonOpenScanResult) obj, (ProtocolException) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAppSession$lambda$4(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClipboardReadAccessOpen$lambda$53(boolean z11, Function1 function1) {
        ClipboardDataHelper.m23651b(z11);
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAddHomePageDialog$lambda$26(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitData$lambda$33(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean close(@Nullable Boolean animated) {
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("close exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31663B(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, Intrinsics.areEqual(animated, Boolean.TRUE), new Function2() { // from class: com.kubi.rn.core.biz.o
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.close$lambda$8(objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return (Boolean) objectRef.element;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.Map] */
    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public ReadableMap getAllBizControlConfig() {
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("getAllBizControlConfig exception: common bridge service not found", this.TAG, false, 4, null);
            return C24267r0.m58522f(MapsKt.emptyMap());
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = MapsKt.emptyMap();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31690w(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.j
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.getAllBizControlConfig$lambda$34(objectRef, (Map) obj, (ProtocolException) obj2);
            }
        });
        return C24267r0.m58522f((Map) objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public AppInfo getAppInfo() {
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("getAppInfo exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31669b(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.h
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.getAppInfo$lambda$1(objectRef, (KCJSApiCommonAppInfo) obj, (ProtocolException) obj2);
            }
        });
        KCJSApiCommonAppInfo kCJSApiCommonAppInfo = (KCJSApiCommonAppInfo) objectRef.element;
        if (kCJSApiCommonAppInfo == null) {
            return null;
        }
        String legal = kCJSApiCommonAppInfo.getLegal();
        String legalSymbol = kCJSApiCommonAppInfo.getLegalSymbol();
        String lang = kCJSApiCommonAppInfo.getLang();
        String version = kCJSApiCommonAppInfo.getVersion();
        String webHost = kCJSApiCommonAppInfo.getWebHost();
        String feeLevel = kCJSApiCommonAppInfo.getFeeLevel();
        boolean darkMode = kCJSApiCommonAppInfo.getDarkMode();
        boolean cstyle = kCJSApiCommonAppInfo.getCstyle();
        String siteType = kCJSApiCommonAppInfo.getSiteType();
        String appMode = kCJSApiCommonAppInfo.getAppMode();
        boolean zIsInland = kCJSApiCommonAppInfo.isInland();
        String deviceId = kCJSApiCommonAppInfo.getDeviceId();
        String networkType = kCJSApiCommonAppInfo.getNetworkType();
        String xversion = kCJSApiCommonAppInfo.getXversion();
        String apiType = kCJSApiCommonAppInfo.getApiType();
        String appPciHost = kCJSApiCommonAppInfo.getAppPciHost();
        String anonymousId = kCJSApiCommonAppInfo.getAnonymousId();
        boolean zIsTurnoverLegal = kCJSApiCommonAppInfo.isTurnoverLegal();
        return new AppInfo(legal, legalSymbol, lang, version, webHost, feeLevel, Boolean.valueOf(darkMode), Boolean.valueOf(cstyle), siteType, appMode, Boolean.valueOf(zIsInland), deviceId, networkType, xversion, apiType, appPciHost, Boolean.valueOf(zIsTurnoverLegal), anonymousId, kCJSApiCommonAppInfo.getH5Host());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public String getAppVersion() {
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("getAppVersion exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31678k(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.f0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.getAppVersion$lambda$5(objectRef, (String) obj, (ProtocolException) obj2);
            }
        });
        return (String) objectRef.element;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.Map] */
    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public ReadableMap getLegalPriceRate() {
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("getLegalPriceRate exception: common bridge service not found", this.TAG, false, 4, null);
            return C24267r0.m58522f(MapsKt.emptyMap());
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = MapsKt.emptyMap();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31670c(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.i0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.getLegalPriceRate$lambda$44(objectRef, (Map) obj, (ProtocolException) obj2);
            }
        });
        return C24267r0.m58522f((Map) objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean isUtaTrading() {
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("isUtaTrading exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31662A(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.r
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.isUtaTrading$lambda$52(objectRef, this, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return (Boolean) objectRef.element;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean openSupportTicketPage(@Nullable String formId) {
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("openSupportTicketPage exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31692y(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, formId, new Function2() { // from class: com.kubi.rn.core.biz.l
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.openSupportTicketPage$lambda$17(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean reload() {
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31680m(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.e0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.reload$lambda$21(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean showAppUpgradeAlert() {
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("showAppUpgradeAlert exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31684q(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.w
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.showAppUpgradeAlert$lambda$16(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public AppCpsInfo syncCpsFromApp() {
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            new RNMessage("openSupportTicketPage exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31668a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.q
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.syncCpsFromApp$lambda$38(objectRef, this, (KCJSApiCommonAppCpsInfo) obj, (ProtocolException) obj2);
            }
        });
        C44128b.m97266j("syncCpsFromApp", "jsapi turbo = " + objectRef.element);
        KCJSApiCommonAppCpsInfo kCJSApiCommonAppCpsInfo = (KCJSApiCommonAppCpsInfo) objectRef.element;
        if (kCJSApiCommonAppCpsInfo == null) {
            return null;
        }
        return new AppCpsInfo(kCJSApiCommonAppCpsInfo.getClientId(), kCJSApiCommonAppCpsInfo.getClickId(), kCJSApiCommonAppCpsInfo.getUtmSource(), kCJSApiCommonAppCpsInfo.getUtmMedium(), kCJSApiCommonAppCpsInfo.getUtmCampaign());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleAbs
    @Nullable
    public Boolean vibrate() {
        InterfaceC36566d interfaceC36566dCommonBridge = commonBridge();
        if (interfaceC36566dCommonBridge == null) {
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36566dCommonBridge.mo31665D(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.y
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCommonModuleImpl.vibrate$lambda$24(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }
}
