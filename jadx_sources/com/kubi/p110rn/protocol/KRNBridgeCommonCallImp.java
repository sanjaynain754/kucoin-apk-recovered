package com.kubi.p110rn.protocol;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Vibrator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kubi.advert.api.IAdvertService;
import com.kubi.event.api.C12572a;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.p111ui.ReactContainerActivity;
import com.kubi.p110rn.p111ui.ReactRootFragment;
import com.kubi.p110rn.p111ui.RnDialogCallbackManager;
import com.kubi.p110rn.p111ui.RnDialogInstanceManager;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCommonAppCpsInfo;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27012a;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import e00.InterfaceC37011c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KRNBridgeCommonCallImp.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J8\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J.\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J.\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J8\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J8\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016JB\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J.\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J.\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/rn/protocol/KRNBridgeCommonCallImp;", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCommonCall;", "<init>", "()V", "closeDialog", "", "ctx", "Landroid/content/Context;", "dialogId", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", RNConstantKt.SEND_PAGE_MOUNT, "subPath", "refreshAppUserInfo", "reload", "sharePageView", "reactContext", "qrCodeUrl", "showAddHomePageDialog", "shortcutId", "submitData", "data", "vibrate", "syncCpsFromApp", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCommonAppCpsInfo;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKRNBridgeCommonCallImp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KRNBridgeCommonCallImp.kt\ncom/kubi/rn/protocol/KRNBridgeCommonCallImp\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n295#2,2:212\n1#3:214\n*S KotlinDebug\n*F\n+ 1 KRNBridgeCommonCallImp.kt\ncom/kubi/rn/protocol/KRNBridgeCommonCallImp\n*L\n115#1:212,2\n*E\n"})
public final class KRNBridgeCommonCallImp implements InterfaceC37011c {

    /* JADX INFO: renamed from: com.kubi.rn.protocol.KRNBridgeCommonCallImp$sharePageView$2 */
    /* JADX INFO: compiled from: KRNBridgeCommonCallImp.kt */
    /* JADX INFO: loaded from: classes39.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.protocol.KRNBridgeCommonCallImp$sharePageView$2", m90122f = "KRNBridgeCommonCallImp.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C235812 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
        final /* synthetic */ Ref.ObjectRef<BaseFragment> $fragment;
        final /* synthetic */ String $qrCodeUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C235812(Ref.ObjectRef<BaseFragment> objectRef, Function2<? super Boolean, ? super ProtocolException, Unit> function2, String str, Continuation<? super C235812> continuation) {
            super(2, continuation);
            this.$fragment = objectRef;
            this.$callback = function2;
            this.$qrCodeUrl = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C235812(this.$fragment, this.$callback, this.$qrCodeUrl, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C235812) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.$callback.invoke(Boxing.boxBoolean(true), null);
            return Unit.INSTANCE;
        }
    }

    @Override // e00.InterfaceC37011c
    public void closeDialog(@NotNull Context ctx, @Nullable String dialogId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (RnDialogInstanceManager.INSTANCE.closeDialog(dialogId)) {
                callback.invoke(Boolean.TRUE, null);
            } else {
                callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("Dialog not found or already closed"), null, false, 12, null));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("closeDialog failed: " + thM103847exceptionOrNullimpl.getMessage()), null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37011c
    public void onPageMount(@NotNull Context ctx, @Nullable String subPath, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (subPath == null) {
                subPath = "";
            }
            linkedHashMap.put("subPath", subPath);
            linkedHashMap.put("pageMount", Long.valueOf(System.currentTimeMillis()));
            C12572a.m23695d(RNConstantKt.SEND_PAGE_MOUNT, linkedHashMap, 0L, 4, null);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("onPageMount failed: " + thM103847exceptionOrNullimpl.getMessage()), null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37011c
    public void refreshAppUserInfo(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            IUserService.z(IUserService.a.get(), (Function0) null, 1, (Object) null);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("刷新失败"), null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37011c
    public void reload(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            Activity activityM66494h = C27012a.m66486i().m66494h();
            Intent intent = activityM66494h.getIntent();
            activityM66494h.finish();
            activityM66494h.startActivity(intent);
            activityM66494h.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("刷新失败"), null, false, 12, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.kubi.sdk.BaseFragment] */
    @Override // e00.InterfaceC37011c
    public void sharePageView(@NotNull Context reactContext, @Nullable String qrCodeUrl, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        Object next;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (reactContext instanceof ReactApplicationContext) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) reactContext;
            if (reactApplicationContext.getCurrentActivity() instanceof BaseActivity) {
                Activity currentActivity = reactApplicationContext.getCurrentActivity();
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
        }
        T t11 = objectRef.element;
        if (t11 == 0 || ((BaseFragment) t11).isDetached() || ((BaseFragment) objectRef.element).isRemoving()) {
            callback.invoke(Boolean.FALSE, new ProtocolException(null, new RuntimeException("reactContext must be ReactApplicationContext,or fragment cannot be used"), null, false, 13, null));
        } else {
            LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) objectRef.element).launchWhenStarted(new C235812(objectRef, callback, qrCodeUrl, null));
        }
    }

    @Override // e00.InterfaceC37011c
    public void showAddHomePageDialog(@NotNull Context ctx, @Nullable String shortcutId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (ctx instanceof ReactApplicationContext) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) ctx;
            if (reactApplicationContext.getCurrentActivity() instanceof ReactContainerActivity) {
                Activity currentActivity = reactApplicationContext.getCurrentActivity();
                Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type com.kubi.rn.ui.ReactContainerActivity");
                IAppletService.f46452a.get().mo15070e((ReactContainerActivity) currentActivity, shortcutId, callback);
                return;
            }
        }
        callback.invoke(Boolean.FALSE, new ProtocolException("showAddHomePageDialog failed,check ctx", null, null, false, 14, null));
    }

    @Override // e00.InterfaceC37011c
    public void submitData(@NotNull Context ctx, @Nullable String dialogId, @Nullable String data, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (dialogId == null || dialogId.length() == 0) {
                RnDialogInstanceManager rnDialogInstanceManager = RnDialogInstanceManager.INSTANCE;
                DialogFragmentHelper dialog = rnDialogInstanceManager.getDialog(null);
                dialogId = dialog != null ? rnDialogInstanceManager.getDialogId(dialog) : null;
            }
            if (dialogId == null) {
                callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("Dialog not found"), null, false, 12, null));
                return;
            }
            RnDialogCallbackManager.INSTANCE.invokeCallback(dialogId, data, null);
            callback.invoke(Boolean.TRUE, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("submitData failed: " + thM103847exceptionOrNullimpl.getMessage()), null, false, 12, null));
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // e00.InterfaceC37011c
    public void syncCpsFromApp(@NotNull Context ctx, @NotNull Function2<? super KCBridgeCommonAppCpsInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IAdvertService iAdvertService = IAdvertService.f15070a.get();
        callback.invoke(new KCBridgeCommonAppCpsInfo(iAdvertService.getAppInstanceId(), iAdvertService.mo14760b(), iAdvertService.mo14762d(), iAdvertService.mo14761c(), iAdvertService.mo14759a()), null);
    }

    @Override // e00.InterfaceC37011c
    public void vibrate(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object systemService = ctx.getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
        callback.invoke(Boolean.TRUE, null);
    }
}
