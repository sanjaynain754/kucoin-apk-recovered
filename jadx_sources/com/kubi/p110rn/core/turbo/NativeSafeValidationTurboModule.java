package com.kubi.p110rn.core.turbo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5258a;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kubi.fingerprint.C12598b;
import com.kubi.p110rn.Constants;
import com.kubi.safe.api.service.ITradeSecurityService;
import com.kubi.safe.api.tradesecurity.TradeSecurityScene;
import com.kubi.safe.lib.tradesecurity.g;
import com.kubi.safe.lib.validation.a;
import com.kubi.safe.lib.validation.v2.b;
import com.kubi.sdk.util.C24267r0;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function7;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: NativeSafeValidationTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J2\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u0007H\u0002J:\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u0007H\u0002J\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSafeValidationTurboModule;", "Lcom/kubi/rn/core/turbo/NativeSafeValidationTurboModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "TAG", "", "mainHandler", "Landroid/os/Handler;", "openSafeValidation", "", "bizType", "businessData", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "openFuturesTradeSecurityValidation", "hostActivity", "Landroid/app/Activity;", DropFrameTable.COLUMN_SCENE, "Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;", "resolveFuturesTradeSecurityScene", "buildSafeValidationResult", "", "code", "", "msg", "validationToken", "serverErrorCode", "attachOnDestroy", "", "activity", "onContainerClosed", "Lkotlin/Function0;", "Companion", "SafeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NativeSafeValidationTurboModule extends NativeSafeValidationTurboModuleSpec {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String FUTURES_CLASSIC_SAFE_BIZ_TYPE = "RV_CLASSIC_FUTURES";

    @Deprecated
    @NotNull
    public static final String FUTURES_UNIFIED_SAFE_BIZ_TYPE = "RV_UTA_TRADE";

    @Deprecated
    public static final int FUTURES_VALIDATION_CANCELLED_CODE = -1;

    @Deprecated
    public static final int FUTURES_VALIDATION_FAILED_CODE = -2;

    @Deprecated
    public static final int FUTURES_VALIDATION_SUCCESS_CODE = 0;

    @NotNull
    private final String TAG;

    @NotNull
    private final Handler mainHandler;

    /* JADX INFO: compiled from: NativeSafeValidationTurboModule.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSafeValidationTurboModule$Companion;", "", "<init>", "()V", "FUTURES_CLASSIC_SAFE_BIZ_TYPE", "", "FUTURES_UNIFIED_SAFE_BIZ_TYPE", "FUTURES_VALIDATION_SUCCESS_CODE", "", "FUTURES_VALIDATION_CANCELLED_CODE", "FUTURES_VALIDATION_FAILED_CODE", "SafeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.turbo.NativeSafeValidationTurboModule$openFuturesTradeSecurityValidation$2 */
    /* JADX INFO: compiled from: NativeSafeValidationTurboModule.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "validationToken", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.turbo.NativeSafeValidationTurboModule$openFuturesTradeSecurityValidation$2", m90122f = "NativeSafeValidationTurboModule.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C233492 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $hostActivity;
        final /* synthetic */ boolean $isRnPath;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ AtomicBoolean $resolved;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C233492(boolean z11, Activity activity, AtomicBoolean atomicBoolean, Promise promise, Continuation<? super C233492> continuation) {
            super(2, continuation);
            this.$isRnPath = z11;
            this.$hostActivity = activity;
            this.$resolved = atomicBoolean;
            this.$promise = promise;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C233492 c233492 = NativeSafeValidationTurboModule.this.new C233492(this.$isRnPath, this.$hostActivity, this.$resolved, this.$promise, continuation);
            c233492.L$0 = obj;
            return c233492;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C233492) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z11 = this.$isRnPath;
            Activity activity = this.$hostActivity;
            NativeSafeValidationTurboModule nativeSafeValidationTurboModule = NativeSafeValidationTurboModule.this;
            AtomicBoolean atomicBoolean = this.$resolved;
            Promise promise = this.$promise;
            if (str == null) {
                str = "";
            }
            NativeSafeValidationTurboModule.openFuturesTradeSecurityValidation$resolveAfterSecurityContainer(z11, activity, nativeSafeValidationTurboModule, atomicBoolean, promise, NativeSafeValidationTurboModule.buildSafeValidationResult$default(nativeSafeValidationTurboModule, 0, null, str, null, 10, null));
            return Unit.INSTANCE;
        }
    }

    private static final void openFuturesTradeSecurityValidation$resolveOnce$8(AtomicBoolean atomicBoolean, NativeSafeValidationTurboModule nativeSafeValidationTurboModule, final Promise promise, final Map<String, String> map) {
        if (atomicBoolean.compareAndSet(false, true)) {
            nativeSafeValidationTurboModule.mainHandler.post(new Runnable() { // from class: com.kubi.rn.core.turbo.b3
                @Override // java.lang.Runnable
                public final void run() {
                    NativeSafeValidationTurboModule.openFuturesTradeSecurityValidation$resolveOnce$8$lambda$7(promise, map);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openSafeValidation$lambda$6(NativeSafeValidationTurboModule nativeSafeValidationTurboModule, boolean z11, AtomicReference atomicReference, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, Promise promise, int i11, String str, String str2, Boolean bool, Boolean bool2, String str3, Map map) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        String str4 = nativeSafeValidationTurboModule.TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("currentCallback code=");
        sb2.append(i11);
        sb2.append(" hasToken=");
        sb2.append(!(str2 == null || str2.length() == 0));
        sb2.append(" serverErrorCode=");
        String string = null;
        String string2 = (map == null || (obj2 = map.get("serverErrorCode")) == null) ? null : obj2.toString();
        if (string2 == null) {
            string2 = "";
        }
        sb2.append(string2);
        C44128b.m97261e(str4, sb2.toString());
        if (map != null && (obj = map.get("serverErrorCode")) != null) {
            string = obj.toString();
        }
        if (string == null) {
            string = "";
        }
        boolean z12 = i11 == 78858;
        Map<String, String> mapBuildSafeValidationResult = nativeSafeValidationTurboModule.buildSafeValidationResult(i11, (!z12 || str3 == null) ? "" : str3, z12 ? "" : C27041f.m66668h(str2), string);
        if (z11) {
            openSafeValidation$deferRnResultUntilContainerClosed(nativeSafeValidationTurboModule, atomicReference, atomicBoolean, atomicBoolean2, promise, mapBuildSafeValidationResult);
        } else {
            C44128b.m97261e(nativeSafeValidationTurboModule.TAG, "flutter path resolve immediately code=" + i11);
            openSafeValidation$resolveOnce(atomicBoolean2, nativeSafeValidationTurboModule, promise, mapBuildSafeValidationResult);
        }
        return Unit.INSTANCE;
    }

    private static final void openSafeValidation$resolveOnce(AtomicBoolean atomicBoolean, NativeSafeValidationTurboModule nativeSafeValidationTurboModule, Promise promise, Map<String, String> map) {
        Boolean boolValueOf;
        if (!atomicBoolean.compareAndSet(false, true)) {
            C44128b.m97261e(nativeSafeValidationTurboModule.TAG, "resolveOnce skip: already resolved code=" + map.get("code"));
            return;
        }
        String str = nativeSafeValidationTurboModule.TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("resolveOnce code=");
        sb2.append(map.get("code"));
        sb2.append(" hasToken=");
        String str2 = map.get("X-VALIDATION-TOKEN");
        if (str2 != null) {
            boolValueOf = Boolean.valueOf(str2.length() > 0);
        } else {
            boolValueOf = null;
        }
        sb2.append(boolValueOf);
        C44128b.m97261e(str, sb2.toString());
        b.a.b();
        if (promise != null) {
            C24267r0.m58525i(promise, map);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSafeValidationTurboModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.TAG = "NativeSafeValidationTurboModule";
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean attachOnDestroy(final Activity activity, final Function0<Unit> onContainerClosed) {
        LifecycleOwner lifecycleOwner = activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null;
        if (lifecycleOwner == null) {
            C44128b.m97261e(this.TAG, "attachOnDestroy fail: activity is not LifecycleOwner class=" + activity.getClass().getName());
            return false;
        }
        if (lifecycleOwner.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            C44128b.m97261e(this.TAG, "attachOnDestroy: activity already destroyed class=" + activity.getClass().getSimpleName() + ", resolve immediately");
            onContainerClosed.invoke();
            return true;
        }
        try {
            lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.kubi.rn.core.turbo.NativeSafeValidationTurboModule.attachOnDestroy.1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    C44128b.m97261e(NativeSafeValidationTurboModule.this.TAG, "security container onDestroy " + activity.getClass().getSimpleName());
                    owner.getLifecycle().removeObserver(this);
                    onContainerClosed.invoke();
                }
            });
            return true;
        } catch (Throwable th2) {
            C44128b.m97261e(this.TAG, "attachOnDestroy fail: addObserver exception class=" + activity.getClass().getSimpleName() + " msg=" + th2.getMessage());
            return false;
        }
    }

    private final Map<String, String> buildSafeValidationResult(int code, String msg, String validationToken, String serverErrorCode) {
        String second;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", String.valueOf(code));
        linkedHashMap.put("msg", msg);
        linkedHashMap.put("X-VALIDATION-TOKEN", validationToken);
        linkedHashMap.put("ORIGIN-APP-SESSION-ID", C27041f.m66668h(UserInfo.a.l()));
        Pair<String, String> pairM23781i = C12598b.f21975a.m23781i("safe_validation_h5");
        if (pairM23781i == null || (second = pairM23781i.getSecond()) == null) {
            second = "";
        }
        linkedHashMap.put("ORIGIN-APP-TOKEN-SM", second);
        linkedHashMap.put("serverErrorCode", serverErrorCode);
        return linkedHashMap;
    }

    public static /* synthetic */ Map buildSafeValidationResult$default(NativeSafeValidationTurboModule nativeSafeValidationTurboModule, int i11, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = "";
        }
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        if ((i12 & 8) != 0) {
            str3 = "";
        }
        return nativeSafeValidationTurboModule.buildSafeValidationResult(i11, str, str2, str3);
    }

    private final void openFuturesTradeSecurityValidation(final Activity hostActivity, TradeSecurityScene scene, String bizType, String businessData, final Promise promise) {
        Fragment fragmentB = g.b(hostActivity instanceof FragmentActivity ? (FragmentActivity) hostActivity : null);
        if (fragmentB == null) {
            if (promise != null) {
                C24267r0.m58525i(promise, buildSafeValidationResult$default(this, -2, null, null, null, 14, null));
            }
        } else {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final boolean zF = b.a.f(bizType);
            ITradeSecurityService.m56325b(ITradeSecurityService.f46326a.get(), scene, fragmentB, LifecycleOwnerKt.getLifecycleScope(fragmentB), businessData, null, false, false, false, null, new Function0() { // from class: com.kubi.rn.core.turbo.c3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NativeSafeValidationTurboModule.openFuturesTradeSecurityValidation$lambda$10();
                }
            }, new C233492(zF, hostActivity, atomicBoolean, promise, null), new Function0() { // from class: com.kubi.rn.core.turbo.d3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NativeSafeValidationTurboModule.openFuturesTradeSecurityValidation$lambda$11(this.f45765b, zF, hostActivity, atomicBoolean, promise);
                }
            }, new Function1() { // from class: com.kubi.rn.core.turbo.e3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NativeSafeValidationTurboModule.openFuturesTradeSecurityValidation$lambda$12(this.f45780b, zF, hostActivity, atomicBoolean, promise, (Throwable) obj);
                }
            }, 432, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openFuturesTradeSecurityValidation$lambda$10() {
        IUserService iUserService = IUserService.a.get();
        if (iUserService != null) {
            iUserService.B0();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openFuturesTradeSecurityValidation$lambda$11(NativeSafeValidationTurboModule nativeSafeValidationTurboModule, boolean z11, Activity activity, AtomicBoolean atomicBoolean, Promise promise) {
        openFuturesTradeSecurityValidation$resolveAfterSecurityContainer(z11, activity, nativeSafeValidationTurboModule, atomicBoolean, promise, buildSafeValidationResult$default(nativeSafeValidationTurboModule, -1, null, null, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openFuturesTradeSecurityValidation$lambda$12(NativeSafeValidationTurboModule nativeSafeValidationTurboModule, boolean z11, Activity activity, AtomicBoolean atomicBoolean, Promise promise, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String message = it.getMessage();
        if (message == null) {
            message = "";
        }
        openFuturesTradeSecurityValidation$resolveAfterSecurityContainer(z11, activity, nativeSafeValidationTurboModule, atomicBoolean, promise, buildSafeValidationResult$default(nativeSafeValidationTurboModule, -2, message, null, null, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openFuturesTradeSecurityValidation$resolveOnce$8$lambda$7(Promise promise, Map map) {
        if (promise != null) {
            C24267r0.m58525i(promise, map);
        }
    }

    private static final void openSafeValidation$deferRnResultUntilContainerClosed(final NativeSafeValidationTurboModule nativeSafeValidationTurboModule, final AtomicReference<Map<String, String>> atomicReference, final AtomicBoolean atomicBoolean, final AtomicBoolean atomicBoolean2, final Promise promise, Map<String, String> map) {
        C44128b.m97261e(nativeSafeValidationTurboModule.TAG, "safeValidation callback cached code=" + map.get("code"));
        atomicReference.set(map);
        if (atomicBoolean.compareAndSet(false, true)) {
            nativeSafeValidationTurboModule.mainHandler.post(new Runnable() { // from class: com.kubi.rn.core.turbo.g3
                @Override // java.lang.Runnable
                public final void run() {
                    NativeSafeValidationTurboModule.openSafeValidation$deferRnResultUntilContainerClosed$lambda$5(atomicBoolean, nativeSafeValidationTurboModule, atomicReference, atomicBoolean2, promise);
                }
            });
        } else {
            C44128b.m97261e(nativeSafeValidationTurboModule.TAG, "deferRnResult skip: destroy observer already attached");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openSafeValidation$lambda$2$lambda$0(NativeSafeValidationTurboModule nativeSafeValidationTurboModule, Activity activity, TradeSecurityScene tradeSecurityScene, String str, String str2, Promise promise) {
        if (str2 == null) {
            str2 = "";
        }
        nativeSafeValidationTurboModule.openFuturesTradeSecurityValidation(activity, tradeSecurityScene, str, str2, promise);
        return Unit.INSTANCE;
    }

    private static final void openSafeValidation$resolveAfterRnContainerClosed(final NativeSafeValidationTurboModule nativeSafeValidationTurboModule, final AtomicReference<Map<String, String>> atomicReference, final AtomicBoolean atomicBoolean, final Promise promise) {
        C44128b.m97261e(nativeSafeValidationTurboModule.TAG, "rnContainer onDestroy -> post resolve");
        nativeSafeValidationTurboModule.mainHandler.post(new Runnable() { // from class: com.kubi.rn.core.turbo.f3
            @Override // java.lang.Runnable
            public final void run() {
                NativeSafeValidationTurboModule.openSafeValidation$resolveAfterRnContainerClosed$lambda$3(atomicReference, nativeSafeValidationTurboModule, atomicBoolean, promise);
            }
        });
    }

    private final TradeSecurityScene resolveFuturesTradeSecurityScene(String bizType) {
        if (Intrinsics.areEqual(bizType, FUTURES_CLASSIC_SAFE_BIZ_TYPE)) {
            return TradeSecurityScene.CONTRACT_AMEND;
        }
        if (Intrinsics.areEqual(bizType, FUTURES_UNIFIED_SAFE_BIZ_TYPE)) {
            return TradeSecurityScene.UTA_CONTRACT_SUBMIT;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openFuturesTradeSecurityValidation$resolveAfterSecurityContainer(boolean z11, Activity activity, final NativeSafeValidationTurboModule nativeSafeValidationTurboModule, final AtomicBoolean atomicBoolean, final Promise promise, final Map<String, String> map) {
        Activity activityM6125h = C5258a.m6125h();
        if (z11 && activityM6125h != null && activityM6125h != activity) {
            if (!nativeSafeValidationTurboModule.attachOnDestroy(activityM6125h, new Function0() { // from class: com.kubi.rn.core.turbo.x2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NativeSafeValidationTurboModule.m55946xa4fa275c(map, atomicBoolean, nativeSafeValidationTurboModule, promise);
                }
            })) {
                openFuturesTradeSecurityValidation$resolveOnce$8(atomicBoolean, nativeSafeValidationTurboModule, promise, map);
                return;
            }
            return;
        }
        openFuturesTradeSecurityValidation$resolveOnce$8(atomicBoolean, nativeSafeValidationTurboModule, promise, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: openFuturesTradeSecurityValidation$resolveAfterSecurityContainer$lambda$9 */
    public static final Unit m55946xa4fa275c(Map map, AtomicBoolean atomicBoolean, NativeSafeValidationTurboModule nativeSafeValidationTurboModule, Promise promise) {
        openFuturesTradeSecurityValidation$resolveOnce$8(atomicBoolean, nativeSafeValidationTurboModule, promise, map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void openSafeValidation$deferRnResultUntilContainerClosed$lambda$5(AtomicBoolean atomicBoolean, final NativeSafeValidationTurboModule nativeSafeValidationTurboModule, final AtomicReference atomicReference, final AtomicBoolean atomicBoolean2, final Promise promise) {
        String string;
        String strName;
        Lifecycle lifecycle;
        Lifecycle.State state;
        Bundle extras;
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h == 0) {
            atomicBoolean.set(false);
            C44128b.m97261e(nativeSafeValidationTurboModule.TAG, "deferRnResult fail: topActivity is null");
            return;
        }
        Intent intent = activityM6125h.getIntent();
        LifecycleOwner lifecycleOwner = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            string = extras.getString(Constants.COMPONENT);
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        if (activityM6125h instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) activityM6125h;
        }
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null || (state = lifecycle.getState()) == null || (strName = state.name()) == null) {
            strName = "unknown";
        }
        C44128b.m97261e(nativeSafeValidationTurboModule.TAG, "deferRnResult attach onDestroy activity=" + activityM6125h.getClass().getSimpleName() + " component=" + string + " lifecycle=" + strName);
        if (!nativeSafeValidationTurboModule.attachOnDestroy(activityM6125h, new Function0() { // from class: com.kubi.rn.core.turbo.a3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NativeSafeValidationTurboModule.m55947xd6c5e8e5(this.f45735b, atomicReference, atomicBoolean2, promise);
            }
        })) {
            atomicBoolean.set(false);
            C44128b.m97261e(nativeSafeValidationTurboModule.TAG, "deferRnResult fail: attachOnDestroy returned false");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: openSafeValidation$deferRnResultUntilContainerClosed$lambda$5$lambda$4 */
    public static final Unit m55947xd6c5e8e5(NativeSafeValidationTurboModule nativeSafeValidationTurboModule, AtomicReference atomicReference, AtomicBoolean atomicBoolean, Promise promise) {
        openSafeValidation$resolveAfterRnContainerClosed(nativeSafeValidationTurboModule, atomicReference, atomicBoolean, promise);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openSafeValidation$resolveAfterRnContainerClosed$lambda$3(AtomicReference atomicReference, NativeSafeValidationTurboModule nativeSafeValidationTurboModule, AtomicBoolean atomicBoolean, Promise promise) {
        Map map = (Map) atomicReference.get();
        if (map == null) {
            C44128b.m97261e(nativeSafeValidationTurboModule.TAG, "rnContainer post resolve skip: pendingResult empty");
            return;
        }
        C44128b.m97261e(nativeSafeValidationTurboModule.TAG, "rnContainer post resolve code=" + ((String) map.get("code")));
        openSafeValidation$resolveOnce(atomicBoolean, nativeSafeValidationTurboModule, promise, map);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSafeValidationTurboModuleSpec
    public void openSafeValidation(@Nullable String bizType, @Nullable final String businessData, @Nullable final Promise promise) {
        final String str;
        final Activity activity;
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h == null) {
            if (promise != null) {
                promise.resolve(null);
                return;
            }
            return;
        }
        if (bizType == null) {
            str = "";
        } else {
            str = bizType;
        }
        final TradeSecurityScene tradeSecuritySceneResolveFuturesTradeSecurityScene = resolveFuturesTradeSecurityScene(str);
        if (tradeSecuritySceneResolveFuturesTradeSecurityScene != null) {
            Activity currentActivity = getReactApplicationContext().getCurrentActivity();
            if (currentActivity == null) {
                activity = activityM6125h;
            } else {
                activity = currentActivity;
            }
            final Function0 function0 = new Function0() { // from class: com.kubi.rn.core.turbo.w2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NativeSafeValidationTurboModule.openSafeValidation$lambda$2$lambda$0(this.f45976b, activity, tradeSecuritySceneResolveFuturesTradeSecurityScene, str, businessData, promise);
                }
            };
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                function0.invoke();
                return;
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.kubi.rn.core.turbo.y2
                    @Override // java.lang.Runnable
                    public final void run() {
                        function0.invoke();
                    }
                });
                return;
            }
        }
        String str2 = str;
        final boolean zF = b.a.f(str2);
        C44128b.m97261e(this.TAG, "openSafeValidation start bizType=" + str2 + " isRnPath=" + zF);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicReference atomicReference = new AtomicReference(null);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        a aVar = a.a;
        Activity activityM6125h2 = C5258a.m6125h();
        Intrinsics.checkNotNullExpressionValue(activityM6125h2, "getTopActivity(...)");
        if (businessData == null) {
            businessData = "";
        }
        a.b(aVar, activityM6125h2, str2, businessData, 2, false, new Function7() { // from class: com.kubi.rn.core.turbo.z2
            @Override // p852kotlin.jvm.functions.Function7
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return NativeSafeValidationTurboModule.openSafeValidation$lambda$6(this.f46007b, zF, atomicReference, atomicBoolean2, atomicBoolean, promise, ((Integer) obj).intValue(), (String) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, (Map) obj7);
            }
        }, 16, (Object) null);
    }
}
