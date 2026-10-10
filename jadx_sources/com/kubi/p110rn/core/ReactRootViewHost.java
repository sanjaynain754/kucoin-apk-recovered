package com.kubi.p110rn.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.uimanager.UIManagerHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.mine.api.service.IMineService;
import com.kubi.mvi.common.MviExKt;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.api.error.KRNContainerDelegate;
import com.kubi.p110rn.api.error.KRNContainerDelegateRegistry;
import com.kubi.p110rn.api.error.KRNError;
import com.kubi.p110rn.api.error.KRNErrorType;
import com.kubi.p110rn.core.pageopen.KrnPageOpenRegistry;
import com.kubi.p110rn.exception.RNException;
import com.kubi.p110rn.modules.eventhub.RNEventHubRegistry;
import com.kubi.sdk.performance.pageopen.ElapsedRealtimePageOpenClock;
import com.kubi.sdk.performance.pageopen.PageOpenMode;
import com.kubi.sdk.performance.pageopen.PageOpenResult;
import com.kubi.sdk.performance.pageopen.PageOpenTrace;
import com.kubi.sdk.performance.pageopen.PageOpenTraceConfig;
import com.kubi.sdk.performance.pageopen.PageOpenValidation;
import com.kubi.sdk.res.R$style;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.InterfaceC41709m0;
import my.C42674m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p481ny.C42899b;
import p569qq.C43846g;
import p694vk.AbstractC45585n0;
import p694vk.C45590s;
import p852kotlin.ExceptionsKt;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import ro.C44128b;
import y70.C46396e;

/* JADX INFO: compiled from: ReactRootViewHost.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u009b\u00012\u00020\u0001:\u0004\u009b\u0001\u009c\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010L\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0014\u0010M\u001a\u00020!2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020!0 J\u000e\u0010O\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010PJ\u0006\u0010Q\u001a\u00020!J\u0016\u0010R\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010TJ\u001e\u0010U\u001a\u00020\u001e2\u0006\u0010V\u001a\u00020\u00182\u0006\u0010S\u001a\u00020\u000bH\u0083@¢\u0006\u0002\u0010WJ\u0016\u0010X\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010TJ\u001e\u0010Y\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010[J\u0010\u0010\\\u001a\u00020!2\u0006\u0010Z\u001a\u00020\u0014H\u0002J\u0012\u0010]\u001a\u00020!2\b\u0010Z\u001a\u0004\u0018\u00010\u0014H\u0002J\"\u0010^\u001a\u00020\u001e2\u0006\u0010Z\u001a\u00020\u00142\u0006\u0010_\u001a\u0002052\b\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u0010\u0010b\u001a\u00020\u001e2\u0006\u0010c\u001a\u00020\u0014H\u0002J\b\u0010d\u001a\u00020\u001eH\u0002J\u0012\u0010e\u001a\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010f\u001a\u00020!H\u0002J\b\u0010g\u001a\u00020!H\u0002J\u0006\u0010h\u001a\u000205J\b\u0010i\u001a\u00020\u001eH\u0002J\u0006\u0010j\u001a\u00020!J\b\u0010k\u001a\u00020!H\u0002J\u001c\u0010l\u001a\u00020!2\b\u0010m\u001a\u0004\u0018\u0001052\b\b\u0002\u0010n\u001a\u00020\u001cH\u0002J\b\u0010o\u001a\u00020!H\u0002J\u0012\u0010p\u001a\u00020!2\b\u0010q\u001a\u0004\u0018\u00010\u0001H\u0002J\u0014\u0010r\u001a\u00020!2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010s\u001a\u00020!2\u0006\u0010t\u001a\u00020uH\u0002J\b\u0010v\u001a\u00020!H\u0002J\b\u0010w\u001a\u00020!H\u0002J\u0016\u0010x\u001a\u00020!2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0006\u0010z\u001a\u00020!J\u0012\u0010{\u001a\u00020!2\b\u0010|\u001a\u0004\u0018\u00010}H\u0002J\b\u0010~\u001a\u00020!H\u0002J\b\u0010\u007f\u001a\u00020!H\u0002J\u0007\u0010\u0080\u0001\u001a\u00020!J\u0007\u0010\u0081\u0001\u001a\u00020!J\u0007\u0010\u0082\u0001\u001a\u00020!J\u0007\u0010\u0083\u0001\u001a\u00020\u001eJ%\u0010\u0084\u0001\u001a\u00020!2\u0007\u0010\u0085\u0001\u001a\u00020\u001c2\u0007\u0010\u0086\u0001\u001a\u00020\u001c2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001J\u0018\u0010\u0089\u0001\u001a\u00020!2\r\u0010\u008a\u0001\u001a\b0\u008b\u0001j\u0003`\u008c\u0001H\u0002J\u001c\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u001c2\t\u0010\u008e\u0001\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0003\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u001e2\b\b\u0002\u0010n\u001a\u00020\u001cJ\u0010\u0010\u0091\u0001\u001a\u00020!2\u0007\u0010\u0092\u0001\u001a\u00020\u001cJ\u0007\u0010\u0093\u0001\u001a\u00020!J\u0007\u0010\u0094\u0001\u001a\u00020!J\t\u0010\u0095\u0001\u001a\u00020!H\u0002J+\u0010\u0096\u0001\u001a\u00020!2\u0006\u0010Z\u001a\u00020\u00142\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010}2\r\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\t\u0010\u0099\u0001\u001a\u00020!H\u0002J\t\u0010\u009a\u0001\u001a\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\u0004\u0018\u00010-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u00106\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010G\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bH\u0010I¨\u0006\u009d\u0001"}, m90084d2 = {"Lcom/kubi/rn/core/ReactRootViewHost;", "", "context", "Landroid/content/Context;", "currentActivity", "Landroid/app/Activity;", "backBtnHandler", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "initialPageOpenStartMs", "", "<init>", "(Landroid/content/Context;Landroid/app/Activity;Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;Landroidx/lifecycle/LifecycleOwner;Ljava/lang/Long;)V", "Ljava/lang/Long;", "themedContext", "Landroidx/appcompat/view/ContextThemeWrapper;", "reactRootView", "Lcom/facebook/react/ReactRootView;", "reactInstanceManager", "Lcom/facebook/react/ReactInstanceManager;", "engineExceptionHandler", "Lcom/kubi/rn/core/EngineExceptionHandler;", "initParam", "Lcom/kubi/rn/core/ReactInitParam;", "state", "Lcom/kubi/rn/core/ReactStateContext;", "lifecycleState", "", "callResumed", "", "crashListener", "Lkotlin/Function0;", "", "appearedListener", "Lcom/kubi/rn/core/ReactRootViewHost$AppearedListenerWrapper;", "exceptionHandler", "Lcom/facebook/react/bridge/JSExceptionHandler;", "isDestroyed", "startMutex", "Lkotlinx/coroutines/sync/Mutex;", "startGeneration", "Ljava/util/concurrent/atomic/AtomicLong;", "rootViewAttached", "containerDelegate", "Lcom/kubi/rn/api/error/KRNContainerDelegate;", "getContainerDelegate", "()Lcom/kubi/rn/api/error/KRNContainerDelegate;", "lastError", "Lcom/kubi/rn/api/error/KRNError;", "debugBundleInfo", "Lcom/kubi/rn/core/RnDebugBundleInfo;", "eventHubContainerId", "", "currentContainerId", "getCurrentContainerId", "()Ljava/lang/String;", "fcpTracker", "Lcom/kubi/rn/core/KrnFcpTracker;", "pageOpenAttemptStartMs", "pageOpenTraceId", "pageOpenAttemptSource", "pageOpenOwnerToken", "pageOpenTimeoutRunnable", "Ljava/lang/Runnable;", "hasStartedPageOpenAttempt", "pageOpenAttemptSequence", "timeoutHandler", "Landroid/os/Handler;", "timeoutRunnable", "isRenderTimedOut", "rnScreenCrashSwitch1", "getRnScreenCrashSwitch1", "()Z", "rnScreenCrashSwitch1$delegate", "Lkotlin/Lazy;", "initRootView", "setReactCrashListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "startReactAsync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPendingStart", "startReactAsyncInternal", "generation", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "param", "(Lcom/kubi/rn/core/ReactInitParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isStartActive", "abortIfStale", "manager", "(JLcom/facebook/react/ReactInstanceManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discardStaleInstanceManager", "cleanupFailedManager", "startReactApplication", Constants.COMPONENT, "customParameters", "Landroid/os/Bundle;", "ensureFabricUiManagerReady", "instanceManager", "isRnDevMode", "startRenderTimeout", "cancelRenderTimeout", "onRenderTimeout", "getDebugBundleDialogContent", "isFabricUiManagerGuardEnabled", "onResume", "onViewAppeared", "reportLoadFailed", com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, "fallbackCode", "beginPageOpenAttempt", "registerPageOpenTrace", "ownerToken", "schedulePageOpenVisibleFrame", "finishPageOpen", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "unregisterPageOpenContainer", "cancelPageOpenTimeout", "runPageOpenTaskOnMain", TUIConstants.TIMPush.NOTIFICATION.ACTION, "onAppBackground", "registerEventHubEndpoint", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "unregisterEventHubEndpoint", "showLeadUpgradeDialog", "onPause", "onDestroy", "showDevOptionsDialog", "handleBackPressed", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "handleException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "parseRootTagFromExtra", "extraDataAsJson", "(Ljava/lang/String;)Ljava/lang/Integer;", "notifyHostHandledError", "setWhitePageChecker", "code", "exposeReportSensor", "unmountReactRootView", "unmountRootView", "destroyAfterQueuesDrain", "ctx", "afterDestroy", "destroyCurrentInstanceManager", "clearBoundExceptionHandler", "Companion", "AppearedListenerWrapper", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReactRootViewHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactRootViewHost.kt\ncom/kubi/rn/core/ReactRootViewHost\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n*L\n1#1,1235:1\n116#2,11:1236\n35#3,4:1247\n39#3:1253\n35#3,4:1275\n39#3:1281\n44#4,2:1251\n44#4,2:1279\n1#5:1254\n45#6,2:1255\n45#6,2:1257\n45#6,2:1259\n45#6,2:1261\n45#6,2:1263\n45#6,2:1265\n45#6,2:1267\n45#6,2:1269\n45#6,2:1271\n45#6,2:1273\n45#6,2:1282\n45#6,2:1284\n*S KotlinDebug\n*F\n+ 1 ReactRootViewHost.kt\ncom/kubi/rn/core/ReactRootViewHost\n*L\n223#1:1236,11\n571#1:1247,4\n571#1:1253\n141#1:1275,4\n141#1:1281\n571#1:1251,2\n141#1:1279,2\n832#1:1255,2\n848#1:1257,2\n893#1:1259,2\n903#1:1261,2\n910#1:1263,2\n1037#1:1265,2\n1198#1:1267,2\n1204#1:1269,2\n1210#1:1271,2\n1219#1:1273,2\n1109#1:1282,2\n1113#1:1284,2\n*E\n"})
public final class ReactRootViewHost {
    private static final long DESTROY_TIMEOUT_MS = 1500;
    private static final int LIFECYCLE_STATE_CREATE = 1;
    private static final int LIFECYCLE_STATE_DESTROY = 4;
    private static final int LIFECYCLE_STATE_NONE = 0;
    private static final int LIFECYCLE_STATE_PAUSE = 3;
    private static final int LIFECYCLE_STATE_RESUME = 2;

    @NotNull
    private static final String MMKV_CATEGORY = "rn_lead_upgrade";

    @NotNull
    private static final String REMOTE_CONFIG_KEY = "kc_rn_fabric_uimanager_guard";
    private static final int RN_FAILED_WITH_H5 = 1;
    private static final int RN_FAILED_WITH_NATIVE = 2;

    @NotNull
    private static final String TAG = "ReactRootViewHolder";

    @NotNull
    private final C23225a appearedListener;

    @NotNull
    private final DefaultHardwareBackBtnHandler backBtnHandler;
    private boolean callResumed;

    @NotNull
    private final Context context;

    @Nullable
    private Function0<Unit> crashListener;

    @NotNull
    private final Activity currentActivity;

    @Nullable
    private RnDebugBundleInfo debugBundleInfo;

    @Nullable
    private EngineExceptionHandler engineExceptionHandler;

    @Nullable
    private String eventHubContainerId;

    @NotNull
    private final JSExceptionHandler exceptionHandler;

    @NotNull
    private final KrnFcpTracker fcpTracker;
    private boolean hasStartedPageOpenAttempt;

    @Nullable
    private ReactInitParam initParam;

    @Nullable
    private final Long initialPageOpenStartMs;
    private volatile boolean isDestroyed;
    private boolean isRenderTimedOut;

    @Nullable
    private volatile KRNError lastError;

    @NotNull
    private final LifecycleOwner lifecycleOwner;
    private int lifecycleState;
    private int pageOpenAttemptSequence;

    @NotNull
    private String pageOpenAttemptSource;
    private long pageOpenAttemptStartMs;

    @Nullable
    private Object pageOpenOwnerToken;

    @Nullable
    private Runnable pageOpenTimeoutRunnable;

    @NotNull
    private String pageOpenTraceId;

    @Nullable
    private ReactInstanceManager reactInstanceManager;

    @NotNull
    private final ReactRootView reactRootView;

    /* JADX INFO: renamed from: rnScreenCrashSwitch1$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rnScreenCrashSwitch1;
    private volatile boolean rootViewAttached;

    @NotNull
    private final AtomicLong startGeneration;

    @NotNull
    private final InterfaceC44082a startMutex;

    @NotNull
    private final ReactStateContext state;

    @NotNull
    private final ContextThemeWrapper themedContext;

    @NotNull
    private final Handler timeoutHandler;

    @Nullable
    private Runnable timeoutRunnable;

    @NotNull
    private static final Map<String, Boolean> isNotFirstEnter = new LinkedHashMap();

    /* JADX INFO: renamed from: com.kubi.rn.core.ReactRootViewHost$a */
    /* JADX INFO: compiled from: ReactRootViewHost.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/rn/core/ReactRootViewHost$AppearedListenerWrapper;", "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getCallback", "()Lkotlin/jvm/functions/Function0;", "logMarker", "name", "Lcom/facebook/react/bridge/ReactMarkerConstants;", "tag", "", "instanceKey", "", "init", "clean", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23225a implements ReactMarker.MarkerListener {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Function0<Unit> f45570a;

        public C23225a(@NotNull Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f45570a = callback;
        }

        @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
        public void logMarker(@Nullable ReactMarkerConstants name, @Nullable String tag, int instanceKey) {
            if (name == ReactMarkerConstants.CONTENT_APPEARED) {
                ReactMarker.removeListener(this);
                this.f45570a.invoke();
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m55731a() {
            ReactMarker.removeListener(this);
        }

        /* JADX INFO: renamed from: b */
        public final void m55732b() {
            ReactMarker.addListener(this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.ReactRootViewHost$abortIfStale$1 */
    /* JADX INFO: compiled from: ReactRootViewHost.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.ReactRootViewHost", m90122f = "ReactRootViewHost.kt", m90123i = {0, 0}, m90124l = {460}, m90125m = "abortIfStale", m90126n = {"manager", "generation"}, m90127s = {"L$0", "J$0"})
    public static final class C232261 extends ContinuationImpl {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C232261(Continuation<? super C232261> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactRootViewHost.this.abortIfStale(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.ReactRootViewHost$load$1 */
    /* JADX INFO: compiled from: ReactRootViewHost.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.ReactRootViewHost", m90122f = "ReactRootViewHost.kt", m90123i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6}, m90124l = {293, 304, 322, 362, 389, 402, 417}, m90125m = "load", m90126n = {"param", "generation", "param", "startedManager", "loader", "generation", "param", "startedManager", "loader", "generation", "param", "startedManager", "loader", "generation", "param", "startedManager", "loader", "generation", "param", "startedManager", "loader", "generation", "param", "startedManager", "loader", "generation"}, m90127s = {"L$0", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0"})
    public static final class C232281 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C232281(Continuation<? super C232281> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactRootViewHost.this.load(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.ReactRootViewHost$showLeadUpgradeDialog$1 */
    /* JADX INFO: compiled from: ReactRootViewHost.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.ReactRootViewHost$showLeadUpgradeDialog$1", m90122f = "ReactRootViewHost.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C232301 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C232301(Continuation<? super C232301> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m55736h() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final Unit m55735g(FragmentActivity fragmentActivity) {
            IMineService iMineService = IMineService.f35025a.get();
            AbstractC45585n0.a aVar = new AbstractC45585n0.a();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iMineService.mo41626i(aVar, supportFragmentManager, LifecycleOwnerKt.getLifecycleScope(fragmentActivity), new Function0() { // from class: com.kubi.rn.core.f0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(ReactRootViewHost.C232301.m55736h());
                }
            }, null);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C232301(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C232301) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C42899b.m94073c(new Function1() { // from class: com.kubi.rn.core.e0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ReactRootViewHost.C232301.m55735g((FragmentActivity) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.ReactRootViewHost$startReactAsync$1 */
    /* JADX INFO: compiled from: ReactRootViewHost.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.ReactRootViewHost", m90122f = "ReactRootViewHost.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m90124l = {1241, 225, 228}, m90125m = "startReactAsync", m90126n = {"$this$withLock_u24default$iv", "generation", "$i$f$withLock", "$this$withLock_u24default$iv", "generation", "$i$f$withLock", "$i$a$-withLock$default-ReactRootViewHost$startReactAsync$2", "$this$withLock_u24default$iv", "generation", "$i$f$withLock", "$i$a$-withLock$default-ReactRootViewHost$startReactAsync$2"}, m90127s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "I$1", "L$0", "J$0", "I$0", "I$1"})
    public static final class C232311 extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C232311(Continuation<? super C232311> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactRootViewHost.this.startReactAsync(this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.ReactRootViewHost$startReactAsyncInternal$1 */
    /* JADX INFO: compiled from: ReactRootViewHost.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.ReactRootViewHost", m90122f = "ReactRootViewHost.kt", m90123i = {0, 0, 1, 1, 1}, m90124l = {272, 280}, m90125m = "startReactAsyncInternal", m90126n = {"param", "generation", "param", "generation", "code"}, m90127s = {"L$0", "J$0", "L$0", "J$0", "I$0"})
    public static final class C232321 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C232321(Continuation<? super C232321> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactRootViewHost.this.startReactAsyncInternal(0L, this);
        }
    }

    public ReactRootViewHost(@NotNull Context context, @NotNull Activity currentActivity, @NotNull DefaultHardwareBackBtnHandler backBtnHandler, @NotNull LifecycleOwner lifecycleOwner, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        Intrinsics.checkNotNullParameter(backBtnHandler, "backBtnHandler");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.context = context;
        this.currentActivity = currentActivity;
        this.backBtnHandler = backBtnHandler;
        this.lifecycleOwner = lifecycleOwner;
        this.initialPageOpenStartMs = l11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(currentActivity, R$style.ReactNativeAppTheme);
        this.themedContext = contextThemeWrapper;
        this.reactRootView = new ReactRootView(contextThemeWrapper);
        this.state = new ReactStateContext();
        this.appearedListener = new C23225a(new Function0() { // from class: com.kubi.rn.core.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReactRootViewHost.appearedListener$lambda$0(this.f45720b);
            }
        });
        this.exceptionHandler = new JSExceptionHandler() { // from class: com.kubi.rn.core.t
            @Override // com.facebook.react.bridge.JSExceptionHandler
            public final void handleException(Exception exc) throws JSONException {
                ReactRootViewHost.exceptionHandler$lambda$1(this.f45722a, exc);
            }
        };
        this.startMutex = C44087f.m97144b(false, 1, null);
        this.startGeneration = new AtomicLong(0L);
        this.fcpTracker = new KrnFcpTracker();
        this.pageOpenTraceId = "";
        this.pageOpenAttemptSource = "route";
        this.timeoutHandler = new Handler(Looper.getMainLooper());
        this.rnScreenCrashSwitch1 = LazyKt.lazy(new Function0() { // from class: com.kubi.rn.core.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ReactRootViewHost.rnScreenCrashSwitch1_delegate$lambda$2());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyAfterQueuesDrain$lambda$42(AtomicBoolean atomicBoolean, AtomicReference atomicReference, ReactInstanceManager reactInstanceManager, Function0 function0) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        if (atomicBoolean.compareAndSet(false, true)) {
            C44128b.m97270n(TAG, "destroyAfterQueuesDrain: destroy fired via=" + ((String) atomicReference.get()));
            try {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    reactInstanceManager.destroy();
                    objM103844constructorimpl2 = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                if (thM103847exceptionOrNullimpl != null) {
                    C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
                }
            } finally {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    function0.invoke();
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
                }
                Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl2 != null) {
                    C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl2, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
                }
            }
        }
    }

    private static final boolean destroyAfterQueuesDrain$postNmBarrier(ReactRootViewHost reactRootViewHost, ReactContext reactContext, final AtomicBoolean atomicBoolean, final AtomicReference<String> atomicReference, final Handler handler, final Runnable runnable, final Runnable runnable2) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            MessageQueueThread nativeModulesMessageQueueThread = reactContext.getNativeModulesMessageQueueThread();
            objM103844constructorimpl = Result.m103844constructorimpl(nativeModulesMessageQueueThread != null ? Boolean.valueOf(nativeModulesMessageQueueThread.runOnQueue(new Runnable() { // from class: com.kubi.rn.core.h
                @Override // java.lang.Runnable
                public final void run() {
                    ReactRootViewHost.destroyAfterQueuesDrain$fireDestroy(atomicBoolean, atomicReference, handler, runnable, runnable2, "nm_barrier");
                }
            })) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        boolean zAreEqual = Intrinsics.areEqual(Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl, Boolean.TRUE);
        if (!zAreEqual) {
            C44128b.m97270n(TAG, "destroyAfterQueuesDrain: NM barrier enqueue failed, queue already finished");
        }
        return zAreEqual;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x021c A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0228 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:107:0x023e A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0247  */
    /* JADX WARN: Code duplicated, block: B:112:0x0251 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0283  */
    /* JADX WARN: Code duplicated, block: B:120:0x0285 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, PHI: r0 r3 r5 r6 r7
      0x0285: PHI (r0v65 java.lang.Object) = (r0v58 java.lang.Object), (r0v1 java.lang.Object) binds: [B:118:0x0281, B:36:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r3v26 long) = (r3v24 long), (r3v28 long) binds: [B:118:0x0281, B:36:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r5v14 com.kubi.rn.core.SplitBundleLoader) = (r5v11 com.kubi.rn.core.SplitBundleLoader), (r5v16 com.kubi.rn.core.SplitBundleLoader) binds: [B:118:0x0281, B:36:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r6v12 com.facebook.react.ReactInstanceManager) = (r6v9 com.facebook.react.ReactInstanceManager), (r6v14 com.facebook.react.ReactInstanceManager) binds: [B:118:0x0281, B:36:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r7v8 com.kubi.rn.core.ReactInitParam) = (r7v5 com.kubi.rn.core.ReactInitParam), (r7v12 com.kubi.rn.core.ReactInitParam) binds: [B:118:0x0281, B:36:0x0097] A[DONT_GENERATE, DONT_INLINE], TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:122:0x028d A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0293 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0299 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:128:0x02ba A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02c7 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02da A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02e6 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TRY_LEAVE, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:137:0x030d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0317 A[Catch: all -> 0x0048, ReactHostException -> 0x004b, CancellationException -> 0x0050, TryCatch #9 {ReactHostException -> 0x004b, CancellationException -> 0x0050, all -> 0x0048, blocks: (B:14:0x0043, B:159:0x03e5, B:161:0x03ed, B:163:0x03f3, B:164:0x0418, B:147:0x0375, B:149:0x037d, B:151:0x0383, B:153:0x03b4, B:155:0x03c1, B:33:0x0084, B:138:0x030f, B:140:0x0317, B:142:0x031d, B:60:0x012d), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:142:0x031d A[Catch: all -> 0x0048, ReactHostException -> 0x004b, CancellationException -> 0x0050, TRY_LEAVE, TryCatch #9 {ReactHostException -> 0x004b, CancellationException -> 0x0050, all -> 0x0048, blocks: (B:14:0x0043, B:159:0x03e5, B:161:0x03ed, B:163:0x03f3, B:164:0x0418, B:147:0x0375, B:149:0x037d, B:151:0x0383, B:153:0x03b4, B:155:0x03c1, B:33:0x0084, B:138:0x030f, B:140:0x0317, B:142:0x031d, B:60:0x012d), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0353 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:149:0x037d A[Catch: all -> 0x0048, ReactHostException -> 0x004b, CancellationException -> 0x0050, TryCatch #9 {ReactHostException -> 0x004b, CancellationException -> 0x0050, all -> 0x0048, blocks: (B:14:0x0043, B:159:0x03e5, B:161:0x03ed, B:163:0x03f3, B:164:0x0418, B:147:0x0375, B:149:0x037d, B:151:0x0383, B:153:0x03b4, B:155:0x03c1, B:33:0x0084, B:138:0x030f, B:140:0x0317, B:142:0x031d, B:60:0x012d), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0383 A[Catch: all -> 0x0048, ReactHostException -> 0x004b, CancellationException -> 0x0050, TryCatch #9 {ReactHostException -> 0x004b, CancellationException -> 0x0050, all -> 0x0048, blocks: (B:14:0x0043, B:159:0x03e5, B:161:0x03ed, B:163:0x03f3, B:164:0x0418, B:147:0x0375, B:149:0x037d, B:151:0x0383, B:153:0x03b4, B:155:0x03c1, B:33:0x0084, B:138:0x030f, B:140:0x0317, B:142:0x031d, B:60:0x012d), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:153:0x03b4 A[Catch: all -> 0x0048, ReactHostException -> 0x004b, CancellationException -> 0x0050, TryCatch #9 {ReactHostException -> 0x004b, CancellationException -> 0x0050, all -> 0x0048, blocks: (B:14:0x0043, B:159:0x03e5, B:161:0x03ed, B:163:0x03f3, B:164:0x0418, B:147:0x0375, B:149:0x037d, B:151:0x0383, B:153:0x03b4, B:155:0x03c1, B:33:0x0084, B:138:0x030f, B:140:0x0317, B:142:0x031d, B:60:0x012d), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:155:0x03c1 A[Catch: all -> 0x0048, ReactHostException -> 0x004b, CancellationException -> 0x0050, TryCatch #9 {ReactHostException -> 0x004b, CancellationException -> 0x0050, all -> 0x0048, blocks: (B:14:0x0043, B:159:0x03e5, B:161:0x03ed, B:163:0x03f3, B:164:0x0418, B:147:0x0375, B:149:0x037d, B:151:0x0383, B:153:0x03b4, B:155:0x03c1, B:33:0x0084, B:138:0x030f, B:140:0x0317, B:142:0x031d, B:60:0x012d), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:158:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ed A[Catch: all -> 0x0048, ReactHostException -> 0x004b, CancellationException -> 0x0050, TryCatch #9 {ReactHostException -> 0x004b, CancellationException -> 0x0050, all -> 0x0048, blocks: (B:14:0x0043, B:159:0x03e5, B:161:0x03ed, B:163:0x03f3, B:164:0x0418, B:147:0x0375, B:149:0x037d, B:151:0x0383, B:153:0x03b4, B:155:0x03c1, B:33:0x0084, B:138:0x030f, B:140:0x0317, B:142:0x031d, B:60:0x012d), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:163:0x03f3 A[Catch: all -> 0x0048, ReactHostException -> 0x004b, CancellationException -> 0x0050, TryCatch #9 {ReactHostException -> 0x004b, CancellationException -> 0x0050, all -> 0x0048, blocks: (B:14:0x0043, B:159:0x03e5, B:161:0x03ed, B:163:0x03f3, B:164:0x0418, B:147:0x0375, B:149:0x037d, B:151:0x0383, B:153:0x03b4, B:155:0x03c1, B:33:0x0084, B:138:0x030f, B:140:0x0317, B:142:0x031d, B:60:0x012d), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:182:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[PHI: r0 r3 r5 r6 r7
      0x0065: PHI (r0v99 java.lang.Object) = (r0v72 java.lang.Object), (r0v1 java.lang.Object) binds: [B:145:0x0372, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r3v31 long) = (r3v26 long), (r3v33 long) binds: [B:145:0x0372, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r5v18 com.kubi.rn.core.SplitBundleLoader) = (r5v14 com.kubi.rn.core.SplitBundleLoader), (r5v20 com.kubi.rn.core.SplitBundleLoader) binds: [B:145:0x0372, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r6v15 com.facebook.react.ReactInstanceManager) = (r6v12 com.facebook.react.ReactInstanceManager), (r6v18 com.facebook.react.ReactInstanceManager) binds: [B:145:0x0372, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r7v13 com.kubi.rn.core.ReactInitParam) = (r7v8 com.kubi.rn.core.ReactInitParam), (r7v15 com.kubi.rn.core.ReactInitParam) binds: [B:145:0x0372, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0166 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x0184  */
    /* JADX WARN: Code duplicated, block: B:77:0x0185  */
    /* JADX WARN: Code duplicated, block: B:80:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b3 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01de A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, PHI: r0 r3 r5 r6 r7
      0x01de: PHI (r0v48 java.lang.Object) = (r0v44 java.lang.Object), (r0v1 java.lang.Object) binds: [B:89:0x01da, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r3v24 long) = (r3v21 long), (r3v25 long) binds: [B:89:0x01da, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r5v11 com.kubi.rn.core.SplitBundleLoader) = (r5v8 com.kubi.rn.core.SplitBundleLoader), (r5v13 com.kubi.rn.core.SplitBundleLoader) binds: [B:89:0x01da, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r6v9 com.facebook.react.ReactInstanceManager) = (r6v6 com.facebook.react.ReactInstanceManager), (r6v11 com.facebook.react.ReactInstanceManager) binds: [B:89:0x01da, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r7v5 com.kubi.rn.core.ReactInitParam) = (r7v2 com.kubi.rn.core.ReactInitParam), (r7v7 com.kubi.rn.core.ReactInitParam) binds: [B:89:0x01da, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE], TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e6 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ec A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0203 A[Catch: all -> 0x006d, ReactHostException -> 0x0071, CancellationException -> 0x0074, TryCatch #11 {ReactHostException -> 0x0071, blocks: (B:24:0x0062, B:36:0x0097, B:120:0x0285, B:122:0x028d, B:124:0x0293, B:126:0x0299, B:128:0x02ba, B:130:0x02c7, B:132:0x02da, B:134:0x02e6, B:144:0x0353, B:39:0x00aa, B:91:0x01de, B:93:0x01e6, B:95:0x01ec, B:97:0x0203, B:98:0x0216, B:100:0x021c, B:102:0x0228, B:105:0x0234, B:107:0x023e, B:109:0x0248, B:110:0x024d, B:112:0x0251, B:114:0x0257, B:116:0x025b, B:117:0x0269, B:42:0x00bd, B:64:0x0154, B:70:0x0166, B:74:0x0175, B:78:0x0186, B:84:0x01a6, B:86:0x01b3, B:88:0x01c8), top: B:180:0x002c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x006e: MOVE (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:27:0x006e */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0072: MOVE (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:29:0x0072 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0075: MOVE (r14 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:31:0x0075 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.kubi.rn.core.ReactRootViewHost] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.facebook.react.ReactInstanceManager] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.facebook.react.ReactInstanceManager] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @SuppressLint({"VisibleForTests"})
    public final Object load(ReactInitParam reactInitParam, long j11, Continuation<? super Boolean> continuation) throws JSONException {
        C232281 c232281;
        Object obj;
        Object obj2;
        ?? r14;
        Object obj3;
        ?? r11;
        ?? r15;
        Object obj4;
        ?? r12;
        long j12;
        boolean z11;
        ReactInitParam reactInitParam2;
        SplitBundleLoader splitBundleLoader;
        ReactInstanceManager instanceManager;
        Object objAbortIfStale;
        ReactInstanceManager reactInstanceManager;
        ReactInitParam reactInitParam3;
        SplitBundleLoader splitBundleLoader2;
        long j13;
        boolean z12;
        String strM57542i;
        String str;
        String strM57535b;
        int loaderType;
        int i11;
        String strM57539f;
        String strM57534a;
        SplitBundleLoader splitBundleLoader3;
        long j14;
        ReactInstanceManager reactInstanceManager2;
        ReactInitParam reactInitParam4;
        SplitBundleLoader splitBundleLoader4;
        if (continuation instanceof C232281) {
            c232281 = (C232281) continuation;
            int i12 = c232281.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c232281.label = i12 - Integer.MIN_VALUE;
            } else {
                c232281 = new C232281(continuation);
            }
        } else {
            c232281 = new C232281(continuation);
        }
        C232281 c232282 = c232281;
        Object objLoadAsync = c232282.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r13 = c232282.label;
        try {
            try {
                try {
                    try {
                        try {
                            switch (r13) {
                                case 0:
                                    ResultKt.throwOnFailure(objLoadAsync);
                                    this.state.changeTo(ReactHostStates.Loading);
                                    this.fcpTracker.setFetchBundleStart(System.currentTimeMillis());
                                    this.fcpTracker.setModuleName(reactInitParam.getComponent());
                                    this.fcpTracker.setBundleName(reactInitParam.getBiz());
                                    try {
                                        BundleLoader bundleLoader = BundleLoader.INSTANCE;
                                        Application application = this.currentActivity.getApplication();
                                        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                                        KrnFcpTracker krnFcpTracker = this.fcpTracker;
                                        JSExceptionHandler jSExceptionHandler = this.exceptionHandler;
                                        c232282.L$0 = reactInitParam;
                                        j12 = j11;
                                        z11 = false;
                                        c232282.J$0 = j12;
                                        c232282.label = 1;
                                        objLoadAsync = bundleLoader.loadAsync(application, reactInitParam, krnFcpTracker, jSExceptionHandler, c232282);
                                        if (objLoadAsync != coroutine_suspended) {
                                            reactInitParam2 = reactInitParam;
                                            splitBundleLoader = (SplitBundleLoader) objLoadAsync;
                                            instanceManager = splitBundleLoader.getInstanceManager();
                                            this.reactInstanceManager = splitBundleLoader.getInstanceManager();
                                            this.engineExceptionHandler = splitBundleLoader.getExceptionHandler();
                                            ReactInstanceManager instanceManager2 = splitBundleLoader.getInstanceManager();
                                            c232282.L$0 = reactInitParam2;
                                            c232282.L$1 = instanceManager;
                                            c232282.L$2 = splitBundleLoader;
                                            c232282.J$0 = j12;
                                            c232282.label = 2;
                                            objAbortIfStale = abortIfStale(j12, instanceManager2, c232282);
                                            if (objAbortIfStale != coroutine_suspended) {
                                                reactInstanceManager = instanceManager;
                                                reactInitParam3 = reactInitParam2;
                                                splitBundleLoader2 = splitBundleLoader;
                                                objLoadAsync = objAbortIfStale;
                                                j13 = j12;
                                                z12 = z11;
                                                if (((Boolean) objLoadAsync).booleanValue()) {
                                                    try {
                                                        return Boxing.boxBoolean(z12);
                                                    } catch (ReactHostException e11) {
                                                        e = e11;
                                                        r12 = reactInstanceManager;
                                                        obj3 = null;
                                                        r15 = z12;
                                                        this.state.changeToFailed(e.getCode(), e.getMessage());
                                                        reportLoadFailed$default(this, e.getMessage(), r15, 2, obj3);
                                                        cleanupFailedManager(r12);
                                                        return Boxing.boxBoolean(r15);
                                                    }
                                                }
                                                KrnFcpTracker krnFcpTracker2 = this.fcpTracker;
                                                strM57542i = splitBundleLoader2.getLoadBundleConfig().m57542i();
                                                str = "";
                                                if (strM57542i == null) {
                                                    strM57542i = "";
                                                }
                                                krnFcpTracker2.setBundleVersion(strM57542i);
                                                KrnFcpTracker krnFcpTracker3 = this.fcpTracker;
                                                strM57535b = splitBundleLoader2.getLoadBundleConfig().m57535b();
                                                if (strM57535b != null) {
                                                    str = strM57535b;
                                                }
                                                krnFcpTracker3.setBaseBundleVersion(str);
                                                this.fcpTracker.setLocalBundle(splitBundleLoader2.getLoadBundleConfig().getIsLocalBundle());
                                                KrnFcpTracker krnFcpTracker4 = this.fcpTracker;
                                                loaderType = splitBundleLoader2.getLoaderType();
                                                if (loaderType == 0 && (loaderType == 1 || loaderType == 3)) {
                                                    i11 = 1;
                                                } else {
                                                    i11 = z12 ? 1 : 0;
                                                }
                                                krnFcpTracker4.setReuseType(i11);
                                                if (splitBundleLoader2.getInstanceManager().getCurrentReactContext() == null) {
                                                    this.state.changeToFailed(401, "初始化Bundle失败");
                                                    reportLoadFailed$default(this, "bundle_context_null", z12 ? 1 : 0, 2, null);
                                                    cleanupFailedManager(reactInstanceManager);
                                                    return Boxing.boxBoolean(z12);
                                                }
                                                ReactInstanceManager instanceManager3 = splitBundleLoader2.getInstanceManager();
                                                c232282.L$0 = reactInitParam3;
                                                c232282.L$1 = reactInstanceManager;
                                                c232282.L$2 = splitBundleLoader2;
                                                c232282.J$0 = j13;
                                                c232282.label = 3;
                                                objLoadAsync = abortIfStale(j13, instanceManager3, c232282);
                                                if (objLoadAsync != coroutine_suspended) {
                                                    if (((Boolean) objLoadAsync).booleanValue()) {
                                                        return Boxing.boxBoolean(false);
                                                    }
                                                    this.state.setBizVersion(splitBundleLoader2.getLoadBundleConfig().m57542i());
                                                    if (splitBundleLoader2.getLoadBundleConfig().getLeadUpgrade()) {
                                                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.kubi.rn.core.p
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                this.f45693b.showLeadUpgradeDialog();
                                                            }
                                                        }, 3000L);
                                                    }
                                                    if (ReactConstKt.getDeveloperSupport()) {
                                                        strM57539f = splitBundleLoader2.getLoadBundleConfig().getChildBundleFilePath();
                                                        if (strM57539f == null && (strM57539f = splitBundleLoader2.getLoadBundleConfig().getBaseBundleFilePath()) == null) {
                                                            strM57539f = "N/A";
                                                        }
                                                        if (splitBundleLoader2.getLoadBundleConfig().getChildBundleFilePath() != null) {
                                                            strM57534a = splitBundleLoader2.getLoadBundleConfig().getBaseBundleFilePath();
                                                        } else {
                                                            strM57534a = null;
                                                        }
                                                        this.debugBundleInfo = new RnDebugBundleInfo(strM57539f, strM57534a);
                                                    }
                                                    if (!this.callResumed && (getRnScreenCrashSwitch1() || this.lifecycleState == 2)) {
                                                        this.callResumed = true;
                                                        splitBundleLoader2.getInstanceManager().onHostResume(this.currentActivity, this.backBtnHandler);
                                                    }
                                                    this.appearedListener.m55732b();
                                                    ReactInstanceManager instanceManager4 = splitBundleLoader2.getInstanceManager();
                                                    c232282.L$0 = reactInitParam3;
                                                    c232282.L$1 = reactInstanceManager;
                                                    c232282.L$2 = splitBundleLoader2;
                                                    c232282.J$0 = j13;
                                                    c232282.label = 4;
                                                    objLoadAsync = abortIfStale(j13, instanceManager4, c232282);
                                                    if (objLoadAsync == coroutine_suspended) {
                                                        if (((Boolean) objLoadAsync).booleanValue()) {
                                                            return Boxing.boxBoolean(false);
                                                        }
                                                        if (isFabricUiManagerGuardEnabled()) {
                                                            this.reactInstanceManager = splitBundleLoader2.getInstanceManager();
                                                            this.fcpTracker.setCreateViewStart(System.currentTimeMillis());
                                                            if (!startReactApplication(splitBundleLoader2.getInstanceManager(), reactInitParam3.getComponent(), reactInitParam3.getCustomParameters())) {
                                                                cleanupFailedManager(reactInstanceManager);
                                                                reportLoadFailed$default(this, "root_view_already_attached", 0, 2, null);
                                                                return Boxing.boxBoolean(false);
                                                            }
                                                            this.fcpTracker.setCreateViewEnd(System.currentTimeMillis());
                                                            if (!ensureFabricUiManagerReady(splitBundleLoader2.getInstanceManager())) {
                                                                reportLoadFailed$default(this, "fabric_ui_manager_not_ready", 0, 2, null);
                                                                return Boxing.boxBoolean(false);
                                                            }
                                                            this.state.changeTo(ReactHostStates.LoadingSplit);
                                                            splitBundleLoader2.loadSplitBundle(this.fcpTracker);
                                                            ReactInstanceManager instanceManager5 = splitBundleLoader2.getInstanceManager();
                                                            c232282.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam3);
                                                            c232282.L$1 = reactInstanceManager;
                                                            c232282.L$2 = splitBundleLoader2;
                                                            c232282.J$0 = j13;
                                                            c232282.label = 5;
                                                            objLoadAsync = abortIfStale(j13, instanceManager5, c232282);
                                                            if (objLoadAsync != coroutine_suspended) {
                                                                splitBundleLoader3 = splitBundleLoader2;
                                                                if (((Boolean) objLoadAsync).booleanValue()) {
                                                                    return Boxing.boxBoolean(false);
                                                                }
                                                                this.state.changeTo(ReactHostStates.Loaded);
                                                                this.state.setLoadBizType(splitBundleLoader3.getLoaderType());
                                                                KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                                                registerPageOpenTrace(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                                                registerEventHubEndpoint(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                                                return Boxing.boxBoolean(true);
                                                            }
                                                        } else {
                                                            this.state.changeTo(ReactHostStates.LoadingSplit);
                                                            splitBundleLoader2.loadSplitBundle(this.fcpTracker);
                                                            ReactInstanceManager instanceManager6 = splitBundleLoader2.getInstanceManager();
                                                            c232282.L$0 = reactInitParam3;
                                                            c232282.L$1 = reactInstanceManager;
                                                            c232282.L$2 = splitBundleLoader2;
                                                            c232282.J$0 = j13;
                                                            c232282.label = 6;
                                                            objLoadAsync = abortIfStale(j13, instanceManager6, c232282);
                                                            if (objLoadAsync != coroutine_suspended) {
                                                                j14 = j13;
                                                                reactInstanceManager2 = reactInstanceManager;
                                                                reactInitParam4 = reactInitParam3;
                                                                if (((Boolean) objLoadAsync).booleanValue()) {
                                                                    return Boxing.boxBoolean(false);
                                                                }
                                                                this.state.changeTo(ReactHostStates.Loaded);
                                                                this.state.setLoadBizType(splitBundleLoader2.getLoaderType());
                                                                this.reactInstanceManager = splitBundleLoader2.getInstanceManager();
                                                                this.fcpTracker.setCreateViewStart(System.currentTimeMillis());
                                                                if (!startReactApplication(splitBundleLoader2.getInstanceManager(), reactInitParam4.getComponent(), reactInitParam4.getCustomParameters())) {
                                                                    cleanupFailedManager(reactInstanceManager2);
                                                                    reportLoadFailed$default(this, "root_view_already_attached", 0, 2, null);
                                                                    return Boxing.boxBoolean(false);
                                                                }
                                                                this.fcpTracker.setCreateViewEnd(System.currentTimeMillis());
                                                                ReactInstanceManager instanceManager7 = splitBundleLoader2.getInstanceManager();
                                                                c232282.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam4);
                                                                c232282.L$1 = reactInstanceManager2;
                                                                c232282.L$2 = splitBundleLoader2;
                                                                c232282.J$0 = j14;
                                                                c232282.label = 7;
                                                                objLoadAsync = abortIfStale(j14, instanceManager7, c232282);
                                                                if (objLoadAsync != coroutine_suspended) {
                                                                    splitBundleLoader4 = splitBundleLoader2;
                                                                    if (((Boolean) objLoadAsync).booleanValue()) {
                                                                        return Boxing.boxBoolean(false);
                                                                    }
                                                                    KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                                                    registerPageOpenTrace(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                                                    registerEventHubEndpoint(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                                                    return Boxing.boxBoolean(true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return coroutine_suspended;
                                    } catch (ReactHostException e12) {
                                        e = e12;
                                        obj3 = null;
                                        r15 = 0;
                                        r12 = 0;
                                        this.state.changeToFailed(e.getCode(), e.getMessage());
                                        reportLoadFailed$default(this, e.getMessage(), r15, 2, obj3);
                                        cleanupFailedManager(r12);
                                        return Boxing.boxBoolean(r15);
                                    } catch (CancellationException e13) {
                                        e = e13;
                                        r14 = 0;
                                        if (r14 != 0 && this.reactInstanceManager == r14) {
                                            destroyCurrentInstanceManager();
                                        }
                                        C44128b.m97261e(TAG, "load cancelled: " + e.getMessage());
                                        throw e;
                                    }
                                case 1:
                                    long j15 = c232282.J$0;
                                    reactInitParam2 = (ReactInitParam) c232282.L$0;
                                    ResultKt.throwOnFailure(objLoadAsync);
                                    j12 = j15;
                                    z11 = false;
                                    splitBundleLoader = (SplitBundleLoader) objLoadAsync;
                                    instanceManager = splitBundleLoader.getInstanceManager();
                                    this.reactInstanceManager = splitBundleLoader.getInstanceManager();
                                    this.engineExceptionHandler = splitBundleLoader.getExceptionHandler();
                                    ReactInstanceManager instanceManager8 = splitBundleLoader.getInstanceManager();
                                    c232282.L$0 = reactInitParam2;
                                    c232282.L$1 = instanceManager;
                                    c232282.L$2 = splitBundleLoader;
                                    c232282.J$0 = j12;
                                    c232282.label = 2;
                                    objAbortIfStale = abortIfStale(j12, instanceManager8, c232282);
                                    if (objAbortIfStale != coroutine_suspended) {
                                        reactInstanceManager = instanceManager;
                                        reactInitParam3 = reactInitParam2;
                                        splitBundleLoader2 = splitBundleLoader;
                                        objLoadAsync = objAbortIfStale;
                                        j13 = j12;
                                        z12 = z11;
                                        if (((Boolean) objLoadAsync).booleanValue()) {
                                            return Boxing.boxBoolean(z12);
                                        }
                                        KrnFcpTracker krnFcpTracker5 = this.fcpTracker;
                                        strM57542i = splitBundleLoader2.getLoadBundleConfig().m57542i();
                                        str = "";
                                        if (strM57542i == null) {
                                            strM57542i = "";
                                        }
                                        krnFcpTracker5.setBundleVersion(strM57542i);
                                        KrnFcpTracker krnFcpTracker6 = this.fcpTracker;
                                        strM57535b = splitBundleLoader2.getLoadBundleConfig().m57535b();
                                        if (strM57535b != null) {
                                            str = strM57535b;
                                        }
                                        krnFcpTracker6.setBaseBundleVersion(str);
                                        this.fcpTracker.setLocalBundle(splitBundleLoader2.getLoadBundleConfig().getIsLocalBundle());
                                        KrnFcpTracker krnFcpTracker7 = this.fcpTracker;
                                        loaderType = splitBundleLoader2.getLoaderType();
                                        if (loaderType == 0) {
                                            i11 = z12 ? 1 : 0;
                                        } else {
                                            i11 = z12 ? 1 : 0;
                                        }
                                        krnFcpTracker7.setReuseType(i11);
                                        if (splitBundleLoader2.getInstanceManager().getCurrentReactContext() == null) {
                                            this.state.changeToFailed(401, "初始化Bundle失败");
                                            reportLoadFailed$default(this, "bundle_context_null", z12 ? 1 : 0, 2, null);
                                            cleanupFailedManager(reactInstanceManager);
                                            return Boxing.boxBoolean(z12);
                                        }
                                        ReactInstanceManager instanceManager9 = splitBundleLoader2.getInstanceManager();
                                        c232282.L$0 = reactInitParam3;
                                        c232282.L$1 = reactInstanceManager;
                                        c232282.L$2 = splitBundleLoader2;
                                        c232282.J$0 = j13;
                                        c232282.label = 3;
                                        objLoadAsync = abortIfStale(j13, instanceManager9, c232282);
                                        if (objLoadAsync != coroutine_suspended) {
                                            if (((Boolean) objLoadAsync).booleanValue()) {
                                                return Boxing.boxBoolean(false);
                                            }
                                            this.state.setBizVersion(splitBundleLoader2.getLoadBundleConfig().m57542i());
                                            if (splitBundleLoader2.getLoadBundleConfig().getLeadUpgrade()) {
                                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.kubi.rn.core.p
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        this.f45693b.showLeadUpgradeDialog();
                                                    }
                                                }, 3000L);
                                            }
                                            if (ReactConstKt.getDeveloperSupport()) {
                                                strM57539f = splitBundleLoader2.getLoadBundleConfig().getChildBundleFilePath();
                                                if (strM57539f == null) {
                                                    strM57539f = "N/A";
                                                }
                                                if (splitBundleLoader2.getLoadBundleConfig().getChildBundleFilePath() != null) {
                                                    strM57534a = splitBundleLoader2.getLoadBundleConfig().getBaseBundleFilePath();
                                                } else {
                                                    strM57534a = null;
                                                }
                                                this.debugBundleInfo = new RnDebugBundleInfo(strM57539f, strM57534a);
                                            }
                                            if (!this.callResumed) {
                                                this.callResumed = true;
                                                splitBundleLoader2.getInstanceManager().onHostResume(this.currentActivity, this.backBtnHandler);
                                            }
                                            this.appearedListener.m55732b();
                                            ReactInstanceManager instanceManager10 = splitBundleLoader2.getInstanceManager();
                                            c232282.L$0 = reactInitParam3;
                                            c232282.L$1 = reactInstanceManager;
                                            c232282.L$2 = splitBundleLoader2;
                                            c232282.J$0 = j13;
                                            c232282.label = 4;
                                            objLoadAsync = abortIfStale(j13, instanceManager10, c232282);
                                            if (objLoadAsync == coroutine_suspended) {
                                                if (((Boolean) objLoadAsync).booleanValue()) {
                                                    return Boxing.boxBoolean(false);
                                                }
                                                if (isFabricUiManagerGuardEnabled()) {
                                                    this.reactInstanceManager = splitBundleLoader2.getInstanceManager();
                                                    this.fcpTracker.setCreateViewStart(System.currentTimeMillis());
                                                    if (!startReactApplication(splitBundleLoader2.getInstanceManager(), reactInitParam3.getComponent(), reactInitParam3.getCustomParameters())) {
                                                        cleanupFailedManager(reactInstanceManager);
                                                        reportLoadFailed$default(this, "root_view_already_attached", 0, 2, null);
                                                        return Boxing.boxBoolean(false);
                                                    }
                                                    this.fcpTracker.setCreateViewEnd(System.currentTimeMillis());
                                                    if (!ensureFabricUiManagerReady(splitBundleLoader2.getInstanceManager())) {
                                                        reportLoadFailed$default(this, "fabric_ui_manager_not_ready", 0, 2, null);
                                                        return Boxing.boxBoolean(false);
                                                    }
                                                    this.state.changeTo(ReactHostStates.LoadingSplit);
                                                    splitBundleLoader2.loadSplitBundle(this.fcpTracker);
                                                    ReactInstanceManager instanceManager11 = splitBundleLoader2.getInstanceManager();
                                                    c232282.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam3);
                                                    c232282.L$1 = reactInstanceManager;
                                                    c232282.L$2 = splitBundleLoader2;
                                                    c232282.J$0 = j13;
                                                    c232282.label = 5;
                                                    objLoadAsync = abortIfStale(j13, instanceManager11, c232282);
                                                    if (objLoadAsync != coroutine_suspended) {
                                                        splitBundleLoader3 = splitBundleLoader2;
                                                        if (((Boolean) objLoadAsync).booleanValue()) {
                                                            return Boxing.boxBoolean(false);
                                                        }
                                                        this.state.changeTo(ReactHostStates.Loaded);
                                                        this.state.setLoadBizType(splitBundleLoader3.getLoaderType());
                                                        KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                                        registerPageOpenTrace(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                                        registerEventHubEndpoint(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                                        return Boxing.boxBoolean(true);
                                                    }
                                                } else {
                                                    this.state.changeTo(ReactHostStates.LoadingSplit);
                                                    splitBundleLoader2.loadSplitBundle(this.fcpTracker);
                                                    ReactInstanceManager instanceManager12 = splitBundleLoader2.getInstanceManager();
                                                    c232282.L$0 = reactInitParam3;
                                                    c232282.L$1 = reactInstanceManager;
                                                    c232282.L$2 = splitBundleLoader2;
                                                    c232282.J$0 = j13;
                                                    c232282.label = 6;
                                                    objLoadAsync = abortIfStale(j13, instanceManager12, c232282);
                                                    if (objLoadAsync != coroutine_suspended) {
                                                        j14 = j13;
                                                        reactInstanceManager2 = reactInstanceManager;
                                                        reactInitParam4 = reactInitParam3;
                                                        if (((Boolean) objLoadAsync).booleanValue()) {
                                                            return Boxing.boxBoolean(false);
                                                        }
                                                        this.state.changeTo(ReactHostStates.Loaded);
                                                        this.state.setLoadBizType(splitBundleLoader2.getLoaderType());
                                                        this.reactInstanceManager = splitBundleLoader2.getInstanceManager();
                                                        this.fcpTracker.setCreateViewStart(System.currentTimeMillis());
                                                        if (!startReactApplication(splitBundleLoader2.getInstanceManager(), reactInitParam4.getComponent(), reactInitParam4.getCustomParameters())) {
                                                            cleanupFailedManager(reactInstanceManager2);
                                                            reportLoadFailed$default(this, "root_view_already_attached", 0, 2, null);
                                                            return Boxing.boxBoolean(false);
                                                        }
                                                        this.fcpTracker.setCreateViewEnd(System.currentTimeMillis());
                                                        ReactInstanceManager instanceManager13 = splitBundleLoader2.getInstanceManager();
                                                        c232282.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam4);
                                                        c232282.L$1 = reactInstanceManager2;
                                                        c232282.L$2 = splitBundleLoader2;
                                                        c232282.J$0 = j14;
                                                        c232282.label = 7;
                                                        objLoadAsync = abortIfStale(j14, instanceManager13, c232282);
                                                        if (objLoadAsync != coroutine_suspended) {
                                                            splitBundleLoader4 = splitBundleLoader2;
                                                            if (((Boolean) objLoadAsync).booleanValue()) {
                                                                return Boxing.boxBoolean(false);
                                                            }
                                                            KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                                            registerPageOpenTrace(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                                            registerEventHubEndpoint(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                                            return Boxing.boxBoolean(true);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return coroutine_suspended;
                                case 2:
                                    j13 = c232282.J$0;
                                    splitBundleLoader2 = (SplitBundleLoader) c232282.L$2;
                                    reactInstanceManager = (ReactInstanceManager) c232282.L$1;
                                    reactInitParam3 = (ReactInitParam) c232282.L$0;
                                    ResultKt.throwOnFailure(objLoadAsync);
                                    z12 = false;
                                    if (((Boolean) objLoadAsync).booleanValue()) {
                                        return Boxing.boxBoolean(z12);
                                    }
                                    KrnFcpTracker krnFcpTracker8 = this.fcpTracker;
                                    strM57542i = splitBundleLoader2.getLoadBundleConfig().m57542i();
                                    str = "";
                                    if (strM57542i == null) {
                                        strM57542i = "";
                                    }
                                    krnFcpTracker8.setBundleVersion(strM57542i);
                                    KrnFcpTracker krnFcpTracker9 = this.fcpTracker;
                                    strM57535b = splitBundleLoader2.getLoadBundleConfig().m57535b();
                                    if (strM57535b != null) {
                                        str = strM57535b;
                                    }
                                    krnFcpTracker9.setBaseBundleVersion(str);
                                    this.fcpTracker.setLocalBundle(splitBundleLoader2.getLoadBundleConfig().getIsLocalBundle());
                                    KrnFcpTracker krnFcpTracker10 = this.fcpTracker;
                                    loaderType = splitBundleLoader2.getLoaderType();
                                    if (loaderType == 0) {
                                        i11 = z12 ? 1 : 0;
                                    } else {
                                        i11 = z12 ? 1 : 0;
                                    }
                                    krnFcpTracker10.setReuseType(i11);
                                    if (splitBundleLoader2.getInstanceManager().getCurrentReactContext() == null) {
                                        this.state.changeToFailed(401, "初始化Bundle失败");
                                        reportLoadFailed$default(this, "bundle_context_null", z12 ? 1 : 0, 2, null);
                                        cleanupFailedManager(reactInstanceManager);
                                        return Boxing.boxBoolean(z12);
                                    }
                                    ReactInstanceManager instanceManager14 = splitBundleLoader2.getInstanceManager();
                                    c232282.L$0 = reactInitParam3;
                                    c232282.L$1 = reactInstanceManager;
                                    c232282.L$2 = splitBundleLoader2;
                                    c232282.J$0 = j13;
                                    c232282.label = 3;
                                    objLoadAsync = abortIfStale(j13, instanceManager14, c232282);
                                    if (objLoadAsync != coroutine_suspended) {
                                        if (((Boolean) objLoadAsync).booleanValue()) {
                                            return Boxing.boxBoolean(false);
                                        }
                                        this.state.setBizVersion(splitBundleLoader2.getLoadBundleConfig().m57542i());
                                        if (splitBundleLoader2.getLoadBundleConfig().getLeadUpgrade()) {
                                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.kubi.rn.core.p
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.f45693b.showLeadUpgradeDialog();
                                                }
                                            }, 3000L);
                                        }
                                        if (ReactConstKt.getDeveloperSupport()) {
                                            strM57539f = splitBundleLoader2.getLoadBundleConfig().getChildBundleFilePath();
                                            if (strM57539f == null) {
                                                strM57539f = "N/A";
                                            }
                                            if (splitBundleLoader2.getLoadBundleConfig().getChildBundleFilePath() != null) {
                                                strM57534a = splitBundleLoader2.getLoadBundleConfig().getBaseBundleFilePath();
                                            } else {
                                                strM57534a = null;
                                            }
                                            this.debugBundleInfo = new RnDebugBundleInfo(strM57539f, strM57534a);
                                        }
                                        if (!this.callResumed) {
                                            this.callResumed = true;
                                            splitBundleLoader2.getInstanceManager().onHostResume(this.currentActivity, this.backBtnHandler);
                                        }
                                        this.appearedListener.m55732b();
                                        ReactInstanceManager instanceManager15 = splitBundleLoader2.getInstanceManager();
                                        c232282.L$0 = reactInitParam3;
                                        c232282.L$1 = reactInstanceManager;
                                        c232282.L$2 = splitBundleLoader2;
                                        c232282.J$0 = j13;
                                        c232282.label = 4;
                                        objLoadAsync = abortIfStale(j13, instanceManager15, c232282);
                                        if (objLoadAsync == coroutine_suspended) {
                                            if (((Boolean) objLoadAsync).booleanValue()) {
                                                return Boxing.boxBoolean(false);
                                            }
                                            if (isFabricUiManagerGuardEnabled()) {
                                                this.reactInstanceManager = splitBundleLoader2.getInstanceManager();
                                                this.fcpTracker.setCreateViewStart(System.currentTimeMillis());
                                                if (!startReactApplication(splitBundleLoader2.getInstanceManager(), reactInitParam3.getComponent(), reactInitParam3.getCustomParameters())) {
                                                    cleanupFailedManager(reactInstanceManager);
                                                    reportLoadFailed$default(this, "root_view_already_attached", 0, 2, null);
                                                    return Boxing.boxBoolean(false);
                                                }
                                                this.fcpTracker.setCreateViewEnd(System.currentTimeMillis());
                                                if (!ensureFabricUiManagerReady(splitBundleLoader2.getInstanceManager())) {
                                                    reportLoadFailed$default(this, "fabric_ui_manager_not_ready", 0, 2, null);
                                                    return Boxing.boxBoolean(false);
                                                }
                                                this.state.changeTo(ReactHostStates.LoadingSplit);
                                                splitBundleLoader2.loadSplitBundle(this.fcpTracker);
                                                ReactInstanceManager instanceManager16 = splitBundleLoader2.getInstanceManager();
                                                c232282.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam3);
                                                c232282.L$1 = reactInstanceManager;
                                                c232282.L$2 = splitBundleLoader2;
                                                c232282.J$0 = j13;
                                                c232282.label = 5;
                                                objLoadAsync = abortIfStale(j13, instanceManager16, c232282);
                                                if (objLoadAsync != coroutine_suspended) {
                                                    splitBundleLoader3 = splitBundleLoader2;
                                                    if (((Boolean) objLoadAsync).booleanValue()) {
                                                        return Boxing.boxBoolean(false);
                                                    }
                                                    this.state.changeTo(ReactHostStates.Loaded);
                                                    this.state.setLoadBizType(splitBundleLoader3.getLoaderType());
                                                    KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                                    registerPageOpenTrace(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                                    registerEventHubEndpoint(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                                    return Boxing.boxBoolean(true);
                                                }
                                            } else {
                                                this.state.changeTo(ReactHostStates.LoadingSplit);
                                                splitBundleLoader2.loadSplitBundle(this.fcpTracker);
                                                ReactInstanceManager instanceManager17 = splitBundleLoader2.getInstanceManager();
                                                c232282.L$0 = reactInitParam3;
                                                c232282.L$1 = reactInstanceManager;
                                                c232282.L$2 = splitBundleLoader2;
                                                c232282.J$0 = j13;
                                                c232282.label = 6;
                                                objLoadAsync = abortIfStale(j13, instanceManager17, c232282);
                                                if (objLoadAsync != coroutine_suspended) {
                                                    j14 = j13;
                                                    reactInstanceManager2 = reactInstanceManager;
                                                    reactInitParam4 = reactInitParam3;
                                                    if (((Boolean) objLoadAsync).booleanValue()) {
                                                        return Boxing.boxBoolean(false);
                                                    }
                                                    this.state.changeTo(ReactHostStates.Loaded);
                                                    this.state.setLoadBizType(splitBundleLoader2.getLoaderType());
                                                    this.reactInstanceManager = splitBundleLoader2.getInstanceManager();
                                                    this.fcpTracker.setCreateViewStart(System.currentTimeMillis());
                                                    if (!startReactApplication(splitBundleLoader2.getInstanceManager(), reactInitParam4.getComponent(), reactInitParam4.getCustomParameters())) {
                                                        cleanupFailedManager(reactInstanceManager2);
                                                        reportLoadFailed$default(this, "root_view_already_attached", 0, 2, null);
                                                        return Boxing.boxBoolean(false);
                                                    }
                                                    this.fcpTracker.setCreateViewEnd(System.currentTimeMillis());
                                                    ReactInstanceManager instanceManager18 = splitBundleLoader2.getInstanceManager();
                                                    c232282.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam4);
                                                    c232282.L$1 = reactInstanceManager2;
                                                    c232282.L$2 = splitBundleLoader2;
                                                    c232282.J$0 = j14;
                                                    c232282.label = 7;
                                                    objLoadAsync = abortIfStale(j14, instanceManager18, c232282);
                                                    if (objLoadAsync != coroutine_suspended) {
                                                        splitBundleLoader4 = splitBundleLoader2;
                                                        if (((Boolean) objLoadAsync).booleanValue()) {
                                                            return Boxing.boxBoolean(false);
                                                        }
                                                        KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                                        registerPageOpenTrace(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                                        registerEventHubEndpoint(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                                        return Boxing.boxBoolean(true);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return coroutine_suspended;
                                case 3:
                                    j13 = c232282.J$0;
                                    splitBundleLoader2 = (SplitBundleLoader) c232282.L$2;
                                    reactInstanceManager = (ReactInstanceManager) c232282.L$1;
                                    reactInitParam3 = (ReactInitParam) c232282.L$0;
                                    ResultKt.throwOnFailure(objLoadAsync);
                                    if (((Boolean) objLoadAsync).booleanValue()) {
                                        return Boxing.boxBoolean(false);
                                    }
                                    this.state.setBizVersion(splitBundleLoader2.getLoadBundleConfig().m57542i());
                                    if (splitBundleLoader2.getLoadBundleConfig().getLeadUpgrade()) {
                                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.kubi.rn.core.p
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.f45693b.showLeadUpgradeDialog();
                                            }
                                        }, 3000L);
                                    }
                                    if (ReactConstKt.getDeveloperSupport()) {
                                        strM57539f = splitBundleLoader2.getLoadBundleConfig().getChildBundleFilePath();
                                        if (strM57539f == null) {
                                            strM57539f = "N/A";
                                        }
                                        if (splitBundleLoader2.getLoadBundleConfig().getChildBundleFilePath() != null) {
                                            strM57534a = splitBundleLoader2.getLoadBundleConfig().getBaseBundleFilePath();
                                        } else {
                                            strM57534a = null;
                                        }
                                        this.debugBundleInfo = new RnDebugBundleInfo(strM57539f, strM57534a);
                                    }
                                    if (!this.callResumed) {
                                        this.callResumed = true;
                                        splitBundleLoader2.getInstanceManager().onHostResume(this.currentActivity, this.backBtnHandler);
                                    }
                                    this.appearedListener.m55732b();
                                    ReactInstanceManager instanceManager19 = splitBundleLoader2.getInstanceManager();
                                    c232282.L$0 = reactInitParam3;
                                    c232282.L$1 = reactInstanceManager;
                                    c232282.L$2 = splitBundleLoader2;
                                    c232282.J$0 = j13;
                                    c232282.label = 4;
                                    objLoadAsync = abortIfStale(j13, instanceManager19, c232282);
                                    if (objLoadAsync == coroutine_suspended) {
                                        if (((Boolean) objLoadAsync).booleanValue()) {
                                            return Boxing.boxBoolean(false);
                                        }
                                        if (isFabricUiManagerGuardEnabled()) {
                                            this.reactInstanceManager = splitBundleLoader2.getInstanceManager();
                                            this.fcpTracker.setCreateViewStart(System.currentTimeMillis());
                                            if (!startReactApplication(splitBundleLoader2.getInstanceManager(), reactInitParam3.getComponent(), reactInitParam3.getCustomParameters())) {
                                                cleanupFailedManager(reactInstanceManager);
                                                reportLoadFailed$default(this, "root_view_already_attached", 0, 2, null);
                                                return Boxing.boxBoolean(false);
                                            }
                                            this.fcpTracker.setCreateViewEnd(System.currentTimeMillis());
                                            if (!ensureFabricUiManagerReady(splitBundleLoader2.getInstanceManager())) {
                                                reportLoadFailed$default(this, "fabric_ui_manager_not_ready", 0, 2, null);
                                                return Boxing.boxBoolean(false);
                                            }
                                            this.state.changeTo(ReactHostStates.LoadingSplit);
                                            splitBundleLoader2.loadSplitBundle(this.fcpTracker);
                                            ReactInstanceManager instanceManager110 = splitBundleLoader2.getInstanceManager();
                                            c232282.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam3);
                                            c232282.L$1 = reactInstanceManager;
                                            c232282.L$2 = splitBundleLoader2;
                                            c232282.J$0 = j13;
                                            c232282.label = 5;
                                            objLoadAsync = abortIfStale(j13, instanceManager110, c232282);
                                            if (objLoadAsync != coroutine_suspended) {
                                                splitBundleLoader3 = splitBundleLoader2;
                                                if (((Boolean) objLoadAsync).booleanValue()) {
                                                    return Boxing.boxBoolean(false);
                                                }
                                                this.state.changeTo(ReactHostStates.Loaded);
                                                this.state.setLoadBizType(splitBundleLoader3.getLoaderType());
                                                KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                                registerPageOpenTrace(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                                registerEventHubEndpoint(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                                return Boxing.boxBoolean(true);
                                            }
                                        } else {
                                            this.state.changeTo(ReactHostStates.LoadingSplit);
                                            splitBundleLoader2.loadSplitBundle(this.fcpTracker);
                                            ReactInstanceManager instanceManager111 = splitBundleLoader2.getInstanceManager();
                                            c232282.L$0 = reactInitParam3;
                                            c232282.L$1 = reactInstanceManager;
                                            c232282.L$2 = splitBundleLoader2;
                                            c232282.J$0 = j13;
                                            c232282.label = 6;
                                            objLoadAsync = abortIfStale(j13, instanceManager111, c232282);
                                            if (objLoadAsync != coroutine_suspended) {
                                                j14 = j13;
                                                reactInstanceManager2 = reactInstanceManager;
                                                reactInitParam4 = reactInitParam3;
                                                if (((Boolean) objLoadAsync).booleanValue()) {
                                                    return Boxing.boxBoolean(false);
                                                }
                                                this.state.changeTo(ReactHostStates.Loaded);
                                                this.state.setLoadBizType(splitBundleLoader2.getLoaderType());
                                                this.reactInstanceManager = splitBundleLoader2.getInstanceManager();
                                                this.fcpTracker.setCreateViewStart(System.currentTimeMillis());
                                                if (!startReactApplication(splitBundleLoader2.getInstanceManager(), reactInitParam4.getComponent(), reactInitParam4.getCustomParameters())) {
                                                    cleanupFailedManager(reactInstanceManager2);
                                                    reportLoadFailed$default(this, "root_view_already_attached", 0, 2, null);
                                                    return Boxing.boxBoolean(false);
                                                }
                                                this.fcpTracker.setCreateViewEnd(System.currentTimeMillis());
                                                ReactInstanceManager instanceManager112 = splitBundleLoader2.getInstanceManager();
                                                c232282.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam4);
                                                c232282.L$1 = reactInstanceManager2;
                                                c232282.L$2 = splitBundleLoader2;
                                                c232282.J$0 = j14;
                                                c232282.label = 7;
                                                objLoadAsync = abortIfStale(j14, instanceManager112, c232282);
                                                if (objLoadAsync != coroutine_suspended) {
                                                    splitBundleLoader4 = splitBundleLoader2;
                                                    if (((Boolean) objLoadAsync).booleanValue()) {
                                                        return Boxing.boxBoolean(false);
                                                    }
                                                    KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                                    registerPageOpenTrace(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                                    registerEventHubEndpoint(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                                    return Boxing.boxBoolean(true);
                                                }
                                            }
                                        }
                                    }
                                    return coroutine_suspended;
                                case 4:
                                    j13 = c232282.J$0;
                                    splitBundleLoader2 = (SplitBundleLoader) c232282.L$2;
                                    reactInstanceManager = (ReactInstanceManager) c232282.L$1;
                                    reactInitParam3 = (ReactInitParam) c232282.L$0;
                                    ResultKt.throwOnFailure(objLoadAsync);
                                    if (((Boolean) objLoadAsync).booleanValue()) {
                                        return Boxing.boxBoolean(false);
                                    }
                                    if (isFabricUiManagerGuardEnabled()) {
                                        this.reactInstanceManager = splitBundleLoader2.getInstanceManager();
                                        this.fcpTracker.setCreateViewStart(System.currentTimeMillis());
                                        if (!startReactApplication(splitBundleLoader2.getInstanceManager(), reactInitParam3.getComponent(), reactInitParam3.getCustomParameters())) {
                                            cleanupFailedManager(reactInstanceManager);
                                            reportLoadFailed$default(this, "root_view_already_attached", 0, 2, null);
                                            return Boxing.boxBoolean(false);
                                        }
                                        this.fcpTracker.setCreateViewEnd(System.currentTimeMillis());
                                        if (!ensureFabricUiManagerReady(splitBundleLoader2.getInstanceManager())) {
                                            reportLoadFailed$default(this, "fabric_ui_manager_not_ready", 0, 2, null);
                                            return Boxing.boxBoolean(false);
                                        }
                                        this.state.changeTo(ReactHostStates.LoadingSplit);
                                        splitBundleLoader2.loadSplitBundle(this.fcpTracker);
                                        ReactInstanceManager instanceManager113 = splitBundleLoader2.getInstanceManager();
                                        c232282.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam3);
                                        c232282.L$1 = reactInstanceManager;
                                        c232282.L$2 = splitBundleLoader2;
                                        c232282.J$0 = j13;
                                        c232282.label = 5;
                                        objLoadAsync = abortIfStale(j13, instanceManager113, c232282);
                                        if (objLoadAsync != coroutine_suspended) {
                                            splitBundleLoader3 = splitBundleLoader2;
                                            if (((Boolean) objLoadAsync).booleanValue()) {
                                                return Boxing.boxBoolean(false);
                                            }
                                            this.state.changeTo(ReactHostStates.Loaded);
                                            this.state.setLoadBizType(splitBundleLoader3.getLoaderType());
                                            KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                            registerPageOpenTrace(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                            registerEventHubEndpoint(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                            return Boxing.boxBoolean(true);
                                        }
                                    } else {
                                        this.state.changeTo(ReactHostStates.LoadingSplit);
                                        splitBundleLoader2.loadSplitBundle(this.fcpTracker);
                                        ReactInstanceManager instanceManager114 = splitBundleLoader2.getInstanceManager();
                                        c232282.L$0 = reactInitParam3;
                                        c232282.L$1 = reactInstanceManager;
                                        c232282.L$2 = splitBundleLoader2;
                                        c232282.J$0 = j13;
                                        c232282.label = 6;
                                        objLoadAsync = abortIfStale(j13, instanceManager114, c232282);
                                        if (objLoadAsync != coroutine_suspended) {
                                            j14 = j13;
                                            reactInstanceManager2 = reactInstanceManager;
                                            reactInitParam4 = reactInitParam3;
                                            if (((Boolean) objLoadAsync).booleanValue()) {
                                                return Boxing.boxBoolean(false);
                                            }
                                            this.state.changeTo(ReactHostStates.Loaded);
                                            this.state.setLoadBizType(splitBundleLoader2.getLoaderType());
                                            this.reactInstanceManager = splitBundleLoader2.getInstanceManager();
                                            this.fcpTracker.setCreateViewStart(System.currentTimeMillis());
                                            if (!startReactApplication(splitBundleLoader2.getInstanceManager(), reactInitParam4.getComponent(), reactInitParam4.getCustomParameters())) {
                                                cleanupFailedManager(reactInstanceManager2);
                                                reportLoadFailed$default(this, "root_view_already_attached", 0, 2, null);
                                                return Boxing.boxBoolean(false);
                                            }
                                            this.fcpTracker.setCreateViewEnd(System.currentTimeMillis());
                                            ReactInstanceManager instanceManager115 = splitBundleLoader2.getInstanceManager();
                                            c232282.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam4);
                                            c232282.L$1 = reactInstanceManager2;
                                            c232282.L$2 = splitBundleLoader2;
                                            c232282.J$0 = j14;
                                            c232282.label = 7;
                                            objLoadAsync = abortIfStale(j14, instanceManager115, c232282);
                                            if (objLoadAsync != coroutine_suspended) {
                                                splitBundleLoader4 = splitBundleLoader2;
                                                if (((Boolean) objLoadAsync).booleanValue()) {
                                                    return Boxing.boxBoolean(false);
                                                }
                                                KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                                registerPageOpenTrace(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                                registerEventHubEndpoint(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                                return Boxing.boxBoolean(true);
                                            }
                                        }
                                    }
                                    return coroutine_suspended;
                                case 5:
                                    splitBundleLoader3 = (SplitBundleLoader) c232282.L$2;
                                    ResultKt.throwOnFailure(objLoadAsync);
                                    if (((Boolean) objLoadAsync).booleanValue()) {
                                        return Boxing.boxBoolean(false);
                                    }
                                    this.state.changeTo(ReactHostStates.Loaded);
                                    this.state.setLoadBizType(splitBundleLoader3.getLoaderType());
                                    KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                    registerPageOpenTrace(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                    registerEventHubEndpoint(splitBundleLoader3.getInstanceManager().getCurrentReactContext());
                                    return Boxing.boxBoolean(true);
                                case 6:
                                    j13 = c232282.J$0;
                                    splitBundleLoader2 = (SplitBundleLoader) c232282.L$2;
                                    reactInstanceManager = (ReactInstanceManager) c232282.L$1;
                                    reactInitParam3 = (ReactInitParam) c232282.L$0;
                                    ResultKt.throwOnFailure(objLoadAsync);
                                    j14 = j13;
                                    reactInstanceManager2 = reactInstanceManager;
                                    reactInitParam4 = reactInitParam3;
                                    if (((Boolean) objLoadAsync).booleanValue()) {
                                        return Boxing.boxBoolean(false);
                                    }
                                    this.state.changeTo(ReactHostStates.Loaded);
                                    this.state.setLoadBizType(splitBundleLoader2.getLoaderType());
                                    this.reactInstanceManager = splitBundleLoader2.getInstanceManager();
                                    this.fcpTracker.setCreateViewStart(System.currentTimeMillis());
                                    if (!startReactApplication(splitBundleLoader2.getInstanceManager(), reactInitParam4.getComponent(), reactInitParam4.getCustomParameters())) {
                                        cleanupFailedManager(reactInstanceManager2);
                                        reportLoadFailed$default(this, "root_view_already_attached", 0, 2, null);
                                        return Boxing.boxBoolean(false);
                                    }
                                    this.fcpTracker.setCreateViewEnd(System.currentTimeMillis());
                                    ReactInstanceManager instanceManager116 = splitBundleLoader2.getInstanceManager();
                                    c232282.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam4);
                                    c232282.L$1 = reactInstanceManager2;
                                    c232282.L$2 = splitBundleLoader2;
                                    c232282.J$0 = j14;
                                    c232282.label = 7;
                                    objLoadAsync = abortIfStale(j14, instanceManager116, c232282);
                                    if (objLoadAsync != coroutine_suspended) {
                                        splitBundleLoader4 = splitBundleLoader2;
                                        if (((Boolean) objLoadAsync).booleanValue()) {
                                            return Boxing.boxBoolean(false);
                                        }
                                        KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                        registerPageOpenTrace(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                        registerEventHubEndpoint(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                        return Boxing.boxBoolean(true);
                                    }
                                    return coroutine_suspended;
                                case 7:
                                    splitBundleLoader4 = (SplitBundleLoader) c232282.L$2;
                                    ResultKt.throwOnFailure(objLoadAsync);
                                    if (((Boolean) objLoadAsync).booleanValue()) {
                                        return Boxing.boxBoolean(false);
                                    }
                                    KrnFcpTrackerRegistry.INSTANCE.register(this.reactRootView.getRootViewTag(), this.fcpTracker);
                                    registerPageOpenTrace(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                    registerEventHubEndpoint(splitBundleLoader4.getInstanceManager().getCurrentReactContext());
                                    return Boxing.boxBoolean(true);
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r13 = 0;
                            this.state.changeToFailed(401, th.getMessage());
                            reportLoadFailed$default(this, th.getMessage(), 0, 2, null);
                            cleanupFailedManager(r13);
                            return Boxing.boxBoolean(false);
                        }
                    } catch (ReactHostException e14) {
                        e = e14;
                        r13 = obj4;
                        obj3 = null;
                        r11 = r13;
                        r15 = 0;
                        r12 = r11;
                        this.state.changeToFailed(e.getCode(), e.getMessage());
                        reportLoadFailed$default(this, e.getMessage(), r15, 2, obj3);
                        cleanupFailedManager(r12);
                        return Boxing.boxBoolean(r15);
                    }
                } catch (ReactHostException e15) {
                    e = e15;
                    obj3 = null;
                    r11 = 0;
                    r15 = 0;
                    r12 = r11;
                    this.state.changeToFailed(e.getCode(), e.getMessage());
                    reportLoadFailed$default(this, e.getMessage(), r15, 2, obj3);
                    cleanupFailedManager(r12);
                    return Boxing.boxBoolean(r15);
                } catch (CancellationException e16) {
                    e = e16;
                    r14 = 0;
                }
            } catch (ReactHostException e17) {
                e = e17;
                obj3 = null;
                r11 = r13;
                r15 = 0;
                r12 = r11;
                this.state.changeToFailed(e.getCode(), e.getMessage());
                reportLoadFailed$default(this, e.getMessage(), r15, 2, obj3);
                cleanupFailedManager(r12);
                return Boxing.boxBoolean(r15);
            } catch (CancellationException e18) {
                e = e18;
                r14 = r13;
            } catch (Throwable th3) {
                th = th3;
                this.state.changeToFailed(401, th.getMessage());
                reportLoadFailed$default(this, th.getMessage(), 0, 2, null);
                cleanupFailedManager(r13);
                return Boxing.boxBoolean(false);
            }
        } catch (CancellationException e19) {
            e = e19;
            r14 = obj2;
        } catch (Throwable th4) {
            th = th4;
            r13 = obj;
            this.state.changeToFailed(401, th.getMessage());
            reportLoadFailed$default(this, th.getMessage(), 0, 2, null);
            cleanupFailedManager(r13);
            return Boxing.boxBoolean(false);
        }
    }

    private final Integer parseRootTagFromExtra(String extraDataAsJson) {
        if (extraDataAsJson != null && extraDataAsJson.length() != 0) {
            try {
                double dOptDouble = new JSONObject(extraDataAsJson).optDouble("rootTag");
                if (Double.isNaN(dOptDouble)) {
                    return null;
                }
                return Integer.valueOf((int) dOptDouble);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerPageOpenTrace$lambda$21$lambda$20$lambda$18(ReactRootViewHost reactRootViewHost, int i11, Object obj, PageOpenTrace pageOpenTrace) {
        reactRootViewHost.pageOpenTimeoutRunnable = null;
        KrnPageOpenRegistry.INSTANCE.timeout(i11, obj, pageOpenTrace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startReactAsyncInternal(long j11, Continuation<? super Boolean> continuation) throws Throwable {
        C232321 c232321;
        ReactInitParam reactInitParam;
        if (continuation instanceof C232321) {
            c232321 = (C232321) continuation;
            int i11 = c232321.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c232321.label = i11 - Integer.MIN_VALUE;
            } else {
                c232321 = new C232321(continuation);
            }
        } else {
            c232321 = new C232321(continuation);
        }
        Object objInitEngine = c232321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c232321.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objInitEngine);
            if (this.rootViewAttached) {
                return Boxing.boxBoolean(this.state.isIn(ReactHostStates.Loaded, ReactHostStates.Running));
            }
            beginPageOpenAttempt();
            this.fcpTracker.resetForRetry();
            this.lastError = null;
            startRenderTimeout(this.initParam);
            reactInitParam = this.initParam;
            if (reactInitParam == null) {
                this.state.changeToFailed(301, "校验参数失败");
                return Boxing.boxBoolean(false);
            }
            if ((ReactConstKt.getDeveloperSupport() && reactInitParam.isDebug()) || !ReactNativeEngine.INSTANCE.isDisableBundle(reactInitParam.getBiz(), reactInitParam.getEntry())) {
                this.state.changeTo(ReactHostStates.Prepare);
                this.fcpTracker.setFetchEngineStart(System.currentTimeMillis());
                ReactNativeEngine reactNativeEngine = ReactNativeEngine.INSTANCE;
                c232321.L$0 = reactInitParam;
                c232321.J$0 = j11;
                c232321.label = 1;
                objInitEngine = reactNativeEngine.initEngine(c232321);
                if (objInitEngine != coroutine_suspended) {
                }
            }
            this.state.changeToFailed(303, reactInitParam.getBiz() + '-' + reactInitParam.getEntry() + "被禁用");
            reportLoadFailed$default(this, "bundle_disabled:" + reactInitParam.getBiz() + '-' + reactInitParam.getEntry(), 0, 2, null);
            return Boxing.boxBoolean(false);
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInitEngine);
            return objInitEngine;
        }
        j11 = c232321.J$0;
        reactInitParam = (ReactInitParam) c232321.L$0;
        ResultKt.throwOnFailure(objInitEngine);
        int iIntValue = ((Number) objInitEngine).intValue();
        this.fcpTracker.setFetchEngineEnd(System.currentTimeMillis());
        this.fcpTracker.setEngineInitTimings(ReactNativeEngine.INSTANCE.getLastEngineInitTimings());
        if (iIntValue != 200) {
            this.state.changeToFailed(iIntValue, "准备RN引擎失败");
            reportLoadFailed$default(this, "engine_init_failed:" + iIntValue, 0, 2, null);
            return Boxing.boxBoolean(false);
        }
        c232321.L$0 = SpillingKt.nullOutSpilledVariable(reactInitParam);
        c232321.J$0 = j11;
        c232321.I$0 = iIntValue;
        c232321.label = 2;
        Object objLoad = load(reactInitParam, j11, c232321);
        return objLoad == coroutine_suspended ? coroutine_suspended : objLoad;
    }

    public final void onPause() {
        Object objM103844constructorimpl;
        this.lifecycleState = 3;
        Activity activity = this.currentActivity;
        if (activity != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                ReactInstanceManager reactInstanceManager = this.reactInstanceManager;
                if (reactInstanceManager != null) {
                    reactInstanceManager.onHostPause(activity);
                }
                if (this.reactInstanceManager != null) {
                    this.callResumed = false;
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
            }
        }
    }

    public final void onResume() {
        this.lifecycleState = 2;
        schedulePageOpenVisibleFrame$default(this, null, 1, null);
        ReactInstanceManager reactInstanceManager = this.reactInstanceManager;
        if (reactInstanceManager != null) {
            if (getRnScreenCrashSwitch1() && this.callResumed) {
                this.callResumed = false;
            } else {
                this.callResumed = true;
                reactInstanceManager.onHostResume(this.currentActivity, this.backBtnHandler);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object abortIfStale(long j11, ReactInstanceManager reactInstanceManager, Continuation<? super Boolean> continuation) {
        C232261 c232261;
        if (continuation instanceof C232261) {
            c232261 = (C232261) continuation;
            int i11 = c232261.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c232261.label = i11 - Integer.MIN_VALUE;
            } else {
                c232261 = new C232261(continuation);
            }
        } else {
            c232261 = new C232261(continuation);
        }
        Object objIsStartActive = c232261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c232261.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objIsStartActive);
            c232261.L$0 = reactInstanceManager;
            c232261.J$0 = j11;
            c232261.label = 1;
            objIsStartActive = isStartActive(j11, c232261);
            if (objIsStartActive == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reactInstanceManager = (ReactInstanceManager) c232261.L$0;
            ResultKt.throwOnFailure(objIsStartActive);
        }
        if (((Boolean) objIsStartActive).booleanValue()) {
            return Boxing.boxBoolean(false);
        }
        discardStaleInstanceManager(reactInstanceManager);
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    private final void beginPageOpenAttempt() {
        String pageTraceId;
        finishPageOpen(PageOpenResult.ABORT);
        long jMo57396a = ElapsedRealtimePageOpenClock.f47223a.mo57396a();
        boolean z11 = this.hasStartedPageOpenAttempt;
        Long l11 = this.initialPageOpenStartMs;
        if (l11 != null) {
            long jLongValue = l11.longValue();
            if (0 > jLongValue || jLongValue > jMo57396a || jMo57396a - jLongValue > 300000) {
                l11 = null;
            }
        } else {
            l11 = null;
        }
        this.pageOpenAttemptSequence++;
        if (z11) {
            pageTraceId = this.fcpTracker.getPageTraceId() + "-pageopen-" + this.pageOpenAttemptSequence;
        } else {
            pageTraceId = this.fcpTracker.getPageTraceId();
        }
        this.pageOpenTraceId = pageTraceId;
        if (!z11 && l11 != null) {
            jMo57396a = l11.longValue();
        }
        this.pageOpenAttemptStartMs = jMo57396a;
        this.pageOpenAttemptSource = !z11 ? "route" : "retry";
        this.hasStartedPageOpenAttempt = true;
    }

    private final void cancelPageOpenTimeout() {
        Runnable runnable = this.pageOpenTimeoutRunnable;
        if (runnable != null) {
            this.reactRootView.removeCallbacks(runnable);
        }
        this.pageOpenTimeoutRunnable = null;
    }

    private final void cancelRenderTimeout() {
        Runnable runnable = this.timeoutRunnable;
        if (runnable != null) {
            this.timeoutHandler.removeCallbacks(runnable);
        }
        this.timeoutRunnable = null;
    }

    private final void cleanupFailedManager(ReactInstanceManager manager) {
        if (manager != null && this.reactInstanceManager == manager) {
            destroyCurrentInstanceManager();
        } else if (isRnDevMode()) {
            destroyCurrentInstanceManager();
        }
    }

    private final void clearBoundExceptionHandler() {
        EngineExceptionHandler engineExceptionHandler = this.engineExceptionHandler;
        if (engineExceptionHandler != null) {
            engineExceptionHandler.unbindOwner(this.exceptionHandler);
        }
        this.engineExceptionHandler = null;
    }

    private final void destroyAfterQueuesDrain(final ReactInstanceManager manager, ReactContext ctx, final Function0<Unit> afterDestroy) {
        final Runnable runnable;
        final AtomicReference atomicReference;
        final ReactContext reactContext;
        Object objM103844constructorimpl;
        final Handler handler = new Handler(Looper.getMainLooper());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicReference atomicReference2 = new AtomicReference("unknown");
        final Runnable runnable2 = new Runnable() { // from class: com.kubi.rn.core.d0
            @Override // java.lang.Runnable
            public final void run() {
                ReactRootViewHost.destroyAfterQueuesDrain$lambda$42(atomicBoolean, atomicReference2, manager, afterDestroy);
            }
        };
        Runnable runnable3 = new Runnable() { // from class: com.kubi.rn.core.i
            @Override // java.lang.Runnable
            public final void run() {
                ReactRootViewHost.destroyAfterQueuesDrain$lambda$43(atomicBoolean, atomicReference2, runnable2);
            }
        };
        if (ctx == null) {
            destroyAfterQueuesDrain$fireDestroy(atomicBoolean, atomicReference2, handler, runnable3, runnable2, "ctx_null");
            return;
        }
        handler.postDelayed(runnable3, 1500L);
        try {
            Result.Companion companion = Result.INSTANCE;
            runnable = runnable3;
            atomicReference = atomicReference2;
            reactContext = ctx;
            try {
                Runnable runnable4 = new Runnable() { // from class: com.kubi.rn.core.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReactRootViewHost.destroyAfterQueuesDrain$lambda$47$lambda$46(this.f45674b, reactContext, atomicBoolean, atomicReference, handler, runnable, runnable2);
                    }
                };
                atomicBoolean = atomicBoolean;
                handler = handler;
                runnable2 = runnable2;
                try {
                    objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(reactContext.runOnJSQueueThread(runnable4)));
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
                }
            } catch (Throwable th4) {
                th = th4;
                atomicBoolean = atomicBoolean;
                handler = handler;
                runnable2 = runnable2;
            }
        } catch (Throwable th5) {
            th = th5;
            runnable = runnable3;
            atomicReference = atomicReference2;
            reactContext = ctx;
        }
        Object obj = Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("destroyAfterQueuesDrain: runOnJSQueueThread return=");
        sb2.append(obj);
        sb2.append(" type=");
        sb2.append(obj != null ? obj.getClass().getName() : null);
        sb2.append(" success=");
        sb2.append(Result.m103851isSuccessimpl(objM103844constructorimpl));
        sb2.append(" exception=");
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        sb2.append(thM103847exceptionOrNullimpl != null ? thM103847exceptionOrNullimpl.getClass().getName() : null);
        C44128b.m97270n(TAG, sb2.toString());
        if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
            return;
        }
        C44128b.m97270n(TAG, "destroyAfterQueuesDrain: JS barrier enqueue failed, queue already finished");
        Runnable runnable5 = runnable2;
        Handler handler2 = handler;
        AtomicBoolean atomicBoolean2 = atomicBoolean;
        boolean zDestroyAfterQueuesDrain$postNmBarrier = destroyAfterQueuesDrain$postNmBarrier(this, reactContext, atomicBoolean2, atomicReference, handler2, runnable, runnable5);
        AtomicReference atomicReference3 = atomicReference;
        Runnable runnable6 = runnable;
        if (zDestroyAfterQueuesDrain$postNmBarrier) {
            return;
        }
        destroyAfterQueuesDrain$fireDestroy(atomicBoolean2, atomicReference3, handler2, runnable6, runnable5, "js_and_nm_enqueue_fail");
    }

    private final void destroyCurrentInstanceManager() {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        Object objM103844constructorimpl3;
        Object objM103844constructorimpl4;
        this.appearedListener.m55731a();
        clearBoundExceptionHandler();
        ReactInstanceManager reactInstanceManager = this.reactInstanceManager;
        if (reactInstanceManager == null) {
            this.callResumed = false;
            return;
        }
        boolean z11 = this.callResumed;
        this.reactInstanceManager = null;
        this.callResumed = false;
        RNInstanceManagerHolder rNInstanceManagerHolder = RNInstanceManagerHolder.INSTANCE;
        rNInstanceManagerHolder.markDestroying(reactInstanceManager);
        if (rNInstanceManagerHolder.getCurrentInstanceManager() == reactInstanceManager) {
            rNInstanceManagerHolder.setCurrentInstanceManager(null);
        }
        if (z11) {
            try {
                Result.Companion companion = Result.INSTANCE;
                reactInstanceManager.onHostPause(this.currentActivity);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
            }
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            unmountRootView();
            objM103844constructorimpl2 = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
        if (thM103847exceptionOrNullimpl2 != null) {
            C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl2, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
        }
        try {
            reactInstanceManager.onHostDestroy(this.currentActivity);
            objM103844constructorimpl3 = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th4) {
            Result.Companion companion5 = Result.INSTANCE;
            objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        Throwable thM103847exceptionOrNullimpl3 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl3);
        if (thM103847exceptionOrNullimpl3 != null) {
            C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl3, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
        }
        try {
            reactInstanceManager.destroy();
            objM103844constructorimpl4 = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th5) {
            Result.Companion companion6 = Result.INSTANCE;
            objM103844constructorimpl4 = Result.m103844constructorimpl(ResultKt.createFailure(th5));
        }
        Throwable thM103847exceptionOrNullimpl4 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl4);
        if (thM103847exceptionOrNullimpl4 != null) {
            C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl4, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
        }
        RNInstanceManagerHolder.INSTANCE.clearDestroying(reactInstanceManager);
    }

    private final void discardStaleInstanceManager(final ReactInstanceManager manager) {
        if (this.reactInstanceManager == manager) {
            destroyCurrentInstanceManager();
        } else {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.rn.core.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReactRootViewHost.discardStaleInstanceManager$lambda$7(manager);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exceptionHandler$lambda$1(ReactRootViewHost reactRootViewHost, Exception it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        reactRootViewHost.handleException(it);
    }

    private final KRNContainerDelegate getContainerDelegate() {
        return KRNContainerDelegateRegistry.INSTANCE.get(this.reactRootView.getRootViewTag());
    }

    private final boolean getRnScreenCrashSwitch1() {
        return ((Boolean) this.rnScreenCrashSwitch1.getValue()).booleanValue();
    }

    private final void handleException(Exception e11) throws JSONException {
        int i11;
        if (this.isDestroyed) {
            return;
        }
        if (this.state.isIn(ReactHostStates.Loading)) {
            i11 = 405;
        } else {
            i11 = this.state.isIn(ReactHostStates.LoadingSplit) ? 401 : 500;
        }
        int i12 = i11;
        this.state.changeToFailed(i12, e11.getMessage());
        reportLoadFailed$default(this, e11.getMessage(), 0, 2, null);
        JavascriptException javascriptException = e11 instanceof JavascriptException ? (JavascriptException) e11 : null;
        boolean z11 = javascriptException != null;
        KRNErrorType kRNErrorType = z11 ? KRNErrorType.JS : KRNErrorType.NATIVE;
        String extraDataAsJson = javascriptException != null ? javascriptException.getExtraDataAsJson() : null;
        String strStackTraceToString = extraDataAsJson == null ? ExceptionsKt.stackTraceToString(e11) : extraDataAsJson;
        Integer rootTagFromExtra = parseRootTagFromExtra(extraDataAsJson);
        this.fcpTracker.reportPageError(kRNErrorType.getValue(), z11, e11.getMessage(), strStackTraceToString);
        this.lastError = new KRNError(kRNErrorType, z11, e11.getMessage(), i12, strStackTraceToString, rootTagFromExtra);
        Function0<Unit> function0 = this.crashListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final boolean isFabricUiManagerGuardEnabled() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new TypeToken<Boolean>() { // from class: com.kubi.rn.core.ReactRootViewHost$isFabricUiManagerGuardEnabled$$inlined$getConfig$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a(REMOTE_CONFIG_KEY, type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    public static /* synthetic */ boolean notifyHostHandledError$default(ReactRootViewHost reactRootViewHost, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 401;
        }
        return reactRootViewHost.notifyHostHandledError(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDestroy$lambda$34(ReactInstanceManager reactInstanceManager) {
        RNInstanceManagerHolder.INSTANCE.clearDestroying(reactInstanceManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRenderTimeout() throws JSONException {
        if (this.isRenderTimedOut) {
            return;
        }
        this.isRenderTimedOut = true;
        reportLoadFailed("render_timeout", ReactConstKt.CODE_RENDER_TIMEOUT);
        Function0<Unit> function0 = this.crashListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void onViewAppeared() {
        this.state.changeTo(ReactHostStates.Running);
        ReactInitParam reactInitParam = this.initParam;
        if (reactInitParam != null) {
            BundleLoader bundleLoader = BundleLoader.INSTANCE;
            Application application = this.currentActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            bundleLoader.afterInBackground(application, reactInitParam);
        }
    }

    private final void registerEventHubEndpoint(ReactContext reactContext) {
        if (reactContext == null) {
            C44128b.m97266j(TAG, "registerEventHubEndpoint skipped: reactContext is null");
            return;
        }
        String strValueOf = String.valueOf(this.reactRootView.getRootViewTag());
        this.eventHubContainerId = strValueOf;
        RNEventHubRegistry.INSTANCE.register(strValueOf, reactContext);
        C44128b.m97266j(TAG, "registerEventHubEndpoint containerId=" + strValueOf);
    }

    private final void registerPageOpenTrace(final Object ownerToken) {
        final int rootViewTag = this.reactRootView.getRootViewTag();
        String str = this.pageOpenTraceId;
        if (rootViewTag <= 0 || ownerToken == null || !PageOpenValidation.f47249a.m57426f(str)) {
            return;
        }
        Long lValueOf = Long.valueOf(this.pageOpenAttemptStartMs);
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        final PageOpenTrace pageOpenTrace = new PageOpenTrace(new PageOpenTraceConfig(str, null, PageOpenMode.CONTAINER_ENTRY, this.pageOpenAttemptSource, lValueOf != null ? lValueOf.longValue() : ElapsedRealtimePageOpenClock.f47223a.mo57396a(), 60000L, true), null, null, 6, null);
        this.pageOpenOwnerToken = ownerToken;
        KrnPageOpenRegistry krnPageOpenRegistry = KrnPageOpenRegistry.INSTANCE;
        if (krnPageOpenRegistry.register(rootViewTag, ownerToken, pageOpenTrace)) {
            krnPageOpenRegistry.attachTerminalListener(rootViewTag, ownerToken, new Function0() { // from class: com.kubi.rn.core.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReactRootViewHost.registerPageOpenTrace$lambda$16(this.f45685b, ownerToken);
                }
            });
            krnPageOpenRegistry.attachVisibleFrameScheduler(rootViewTag, ownerToken, new Function0() { // from class: com.kubi.rn.core.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReactRootViewHost.registerPageOpenTrace$lambda$17(this.f45687b, ownerToken);
                }
            });
            krnPageOpenRegistry.attachTimeoutScheduler(rootViewTag, ownerToken, new Function2() { // from class: com.kubi.rn.core.o
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReactRootViewHost.registerPageOpenTrace$lambda$21(this.f45689b, ownerToken, rootViewTag, pageOpenTrace, ((Long) obj).longValue(), (Function0) obj2);
                }
            });
            if (this.lifecycleState == 2) {
                schedulePageOpenVisibleFrame$default(this, null, 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerPageOpenTrace$lambda$16(final ReactRootViewHost reactRootViewHost, Object obj) {
        if (reactRootViewHost.pageOpenOwnerToken == obj) {
            reactRootViewHost.runPageOpenTaskOnMain(new Function0() { // from class: com.kubi.rn.core.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReactRootViewHost.registerPageOpenTrace$lambda$16$lambda$15(this.f45721b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerPageOpenTrace$lambda$21(final ReactRootViewHost reactRootViewHost, final Object obj, final int i11, final PageOpenTrace pageOpenTrace, final long j11, final Function0 isStillActive) {
        Intrinsics.checkNotNullParameter(isStillActive, "isStillActive");
        reactRootViewHost.runPageOpenTaskOnMain(new Function0() { // from class: com.kubi.rn.core.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReactRootViewHost.registerPageOpenTrace$lambda$21$lambda$20(this.f46015b, obj, isStillActive, i11, pageOpenTrace, j11);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerPageOpenTrace$lambda$21$lambda$20(final ReactRootViewHost reactRootViewHost, final Object obj, Function0 function0, final int i11, final PageOpenTrace pageOpenTrace, long j11) {
        if (reactRootViewHost.isDestroyed || reactRootViewHost.pageOpenOwnerToken != obj || !((Boolean) function0.invoke()).booleanValue()) {
            return Unit.INSTANCE;
        }
        reactRootViewHost.cancelPageOpenTimeout();
        Runnable runnable = new Runnable() { // from class: com.kubi.rn.core.q
            @Override // java.lang.Runnable
            public final void run() {
                ReactRootViewHost.registerPageOpenTrace$lambda$21$lambda$20$lambda$18(this.f45716b, i11, obj, pageOpenTrace);
            }
        };
        reactRootViewHost.reactRootView.postDelayed(runnable, j11);
        reactRootViewHost.pageOpenTimeoutRunnable = runnable;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void reportLoadFailed$default(ReactRootViewHost reactRootViewHost, String str, int i11, int i12, Object obj) throws JSONException {
        if ((i12 & 2) != 0) {
            i11 = 401;
        }
        reactRootViewHost.reportLoadFailed(str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rnScreenCrashSwitch1_delegate$lambda$2() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new TypeToken<Boolean>() { // from class: com.kubi.rn.core.ReactRootViewHost$rnScreenCrashSwitch1_delegate$lambda$2$$inlined$getConfig$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_rn_screen_crash_switch1", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    private final void schedulePageOpenVisibleFrame(final Object ownerToken) {
        final int rootViewTag;
        if (ownerToken != null && (rootViewTag = this.reactRootView.getRootViewTag()) > 0) {
            this.reactRootView.postOnAnimation(new Runnable() { // from class: com.kubi.rn.core.k
                @Override // java.lang.Runnable
                public final void run() {
                    ReactRootViewHost.schedulePageOpenVisibleFrame$lambda$22(this.f45681b, ownerToken, rootViewTag);
                }
            });
        }
    }

    public static /* synthetic */ void schedulePageOpenVisibleFrame$default(ReactRootViewHost reactRootViewHost, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = reactRootViewHost.pageOpenOwnerToken;
        }
        reactRootViewHost.schedulePageOpenVisibleFrame(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedulePageOpenVisibleFrame$lambda$22(ReactRootViewHost reactRootViewHost, Object obj, int i11) {
        if (reactRootViewHost.lifecycleState == 2 && reactRootViewHost.pageOpenOwnerToken == obj) {
            KrnPageOpenRegistry.INSTANCE.recordVisibleFrame(i11, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLeadUpgradeDialog() {
        try {
            Activity activity = this.currentActivity;
            FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
            if (fragmentActivity != null && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("lead_upgrade_shown_");
                C45590s c45590s = C45590s.f102687a;
                sb2.append(c45590s.m100675Z());
                String string = sb2.toString();
                if (!C46396e.m102347d(MMKV_CATEGORY, string, false)) {
                    C46396e.m102354k(MMKV_CATEGORY, string, true);
                    C44128b.m97266j(TAG, "showLeadUpgradeDialog");
                    MviExKt.m42518n(new C232301(null));
                } else {
                    C44128b.m97266j(TAG, "showLeadUpgradeDialog skipped (already shown in " + c45590s.m100675Z() + ')');
                }
            }
        } catch (Exception e11) {
            C43846g.m96568c(new RNException(e11, "leadUpgrade", false, null, 8, null), null, 2, null);
        }
    }

    private final boolean startReactApplication(ReactInstanceManager manager, String component, Bundle customParameters) {
        if (this.rootViewAttached) {
            C44128b.m97270n(TAG, "startReactApplication skipped: RootView is already attached");
            return false;
        }
        this.reactRootView.startReactApplication(manager, component, customParameters);
        this.rootViewAttached = true;
        return true;
    }

    private final void startRenderTimeout(ReactInitParam initParam) {
        Long timeout;
        if (initParam == null || initParam.isDebug() || (timeout = initParam.getTimeout()) == null) {
            return;
        }
        long jLongValue = timeout.longValue();
        if (jLongValue <= 0) {
            return;
        }
        cancelRenderTimeout();
        this.isRenderTimedOut = false;
        Runnable runnable = new Runnable() { // from class: com.kubi.rn.core.z
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                this.f46024b.onRenderTimeout();
            }
        };
        this.timeoutRunnable = runnable;
        this.timeoutHandler.postDelayed(runnable, jLongValue);
    }

    private final void unmountRootView() {
        this.reactRootView.unmountReactApplication();
        this.rootViewAttached = false;
    }

    private final void unregisterEventHubEndpoint() {
        String str = this.eventHubContainerId;
        if (str != null) {
            RNEventHubRegistry.INSTANCE.unregister(str);
            C42674m.f94426a.m93472h(str);
            C44128b.m97266j(TAG, "unregisterEventHubEndpoint containerId=" + str);
        }
        this.eventHubContainerId = null;
    }

    public final void cancelPendingStart() {
        this.startGeneration.incrementAndGet();
        cancelRenderTimeout();
    }

    public final void exposeReportSensor() {
        this.state.exposeReportSensor();
    }

    @Nullable
    /* JADX INFO: renamed from: getCurrentContainerId, reason: from getter */
    public final String getEventHubContainerId() {
        return this.eventHubContainerId;
    }

    public final boolean handleBackPressed() {
        ReactInstanceManager reactInstanceManager;
        if (!this.state.isIn(ReactHostStates.Running) || (reactInstanceManager = this.reactInstanceManager) == null) {
            return false;
        }
        reactInstanceManager.onBackPressed();
        return true;
    }

    @MainThread
    @NotNull
    public final ReactRootView initRootView(@Nullable ReactInitParam initParam) {
        this.initParam = initParam;
        this.fcpTracker.setPageEnterStart(System.currentTimeMillis());
        this.fcpTracker.setOnFcpReported(new Function0() { // from class: com.kubi.rn.core.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReactRootViewHost.initRootView$lambda$3(this.f45654b);
            }
        });
        if (initParam != null) {
            this.fcpTracker.initPageTraceId(initParam.getBiz(), initParam.getEntry(), initParam.getComponent());
        }
        if (initParam != null && initParam.getTransparent()) {
            this.reactRootView.setBackgroundColor(0);
        }
        if (ReactNativeFeatureFlags.enableFabricRenderer()) {
            this.reactRootView.setIsFabric(true);
        }
        if (initParam != null) {
            String backup = initParam.getBackup();
            this.state.initConfig(initParam, (backup == null || StringsKt.isBlank(backup)) ? 2 : 1, this.lifecycleOwner);
            Map<String, Boolean> map = isNotFirstEnter;
            if (map.get(initParam.getBiz()) == null) {
                this.state.isFirstEnter(true);
            } else {
                this.state.isFirstEnter(false);
            }
            map.put(initParam.getBiz(), Boolean.TRUE);
        }
        this.lifecycleState = 1;
        this.fcpTracker.setPageEnterEnd(System.currentTimeMillis());
        return this.reactRootView;
    }

    public final void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        ReactInstanceManager reactInstanceManager = this.reactInstanceManager;
        if (reactInstanceManager != null) {
            reactInstanceManager.onActivityResult(this.currentActivity, requestCode, resultCode, data);
        }
    }

    public final void onAppBackground() {
        finishPageOpen(PageOpenResult.BACKGROUND);
    }

    public final void onDestroy() {
        Object objM103844constructorimpl;
        Unit unit;
        Object objM103844constructorimpl2;
        Unit unit2;
        Object objM103844constructorimpl3;
        if (this.isDestroyed) {
            return;
        }
        cancelPendingStart();
        this.isDestroyed = true;
        cancelRenderTimeout();
        this.lifecycleState = 4;
        KrnFcpTrackerRegistry.INSTANCE.unregister(this.reactRootView.getRootViewTag());
        finishPageOpen(PageOpenResult.ABORT);
        unregisterPageOpenContainer();
        unregisterEventHubEndpoint();
        this.state.changeToFinish();
        this.appearedListener.m55731a();
        this.crashListener = null;
        clearBoundExceptionHandler();
        if (ReactConstKt.getDeveloperSupport()) {
            this.debugBundleInfo = null;
        }
        final ReactInstanceManager reactInstanceManager = this.reactInstanceManager;
        this.reactInstanceManager = null;
        if (isRnDevMode()) {
            this.callResumed = false;
        }
        RNInstanceManagerHolder rNInstanceManagerHolder = RNInstanceManagerHolder.INSTANCE;
        rNInstanceManagerHolder.markDestroying(reactInstanceManager);
        if (reactInstanceManager != null && rNInstanceManagerHolder.getCurrentInstanceManager() == reactInstanceManager) {
            rNInstanceManagerHolder.setCurrentInstanceManager(null);
        }
        if (isRnDevMode()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                if (reactInstanceManager != null) {
                    reactInstanceManager.onHostPause(this.currentActivity);
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
                C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
            }
        }
        ReactContext currentReactContext = reactInstanceManager != null ? reactInstanceManager.getCurrentReactContext() : null;
        try {
            Result.Companion companion3 = Result.INSTANCE;
            unmountRootView();
            objM103844constructorimpl2 = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
        if (thM103847exceptionOrNullimpl2 != null) {
            C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl2, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
        }
        if (reactInstanceManager != null) {
            try {
                reactInstanceManager.onHostDestroy(this.currentActivity);
                unit2 = Unit.INSTANCE;
            } catch (Throwable th4) {
                Result.Companion companion5 = Result.INSTANCE;
                objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th4));
            }
        } else {
            unit2 = null;
        }
        objM103844constructorimpl3 = Result.m103844constructorimpl(unit2);
        Throwable thM103847exceptionOrNullimpl3 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl3);
        if (thM103847exceptionOrNullimpl3 != null) {
            C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl3, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
        }
        if (reactInstanceManager != null) {
            destroyAfterQueuesDrain(reactInstanceManager, currentReactContext, new Function0() { // from class: com.kubi.rn.core.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReactRootViewHost.onDestroy$lambda$34(reactInstanceManager);
                }
            });
        }
    }

    public final void setReactCrashListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.crashListener = listener;
    }

    public final void setWhitePageChecker(int code) {
        this.state.setWhiteStatus(code);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004b, B:34:0x0090, B:37:0x009a), top: B:53:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object startReactAsync(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        C232311 c232311;
        long j11;
        InterfaceC44082a interfaceC44082a;
        int i11;
        InterfaceC44082a interfaceC44082a2;
        Throwable th2;
        InterfaceC44082a interfaceC44082a3;
        int i12;
        int i13;
        if (continuation instanceof C232311) {
            c232311 = (C232311) continuation;
            int i14 = c232311.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c232311.label = i14 - Integer.MIN_VALUE;
            } else {
                c232311 = new C232311(continuation);
            }
        } else {
            c232311 = new C232311(continuation);
        }
        Object objStartReactAsyncInternal = c232311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i15 = c232311.label;
        boolean zBooleanValue = false;
        try {
            if (i15 == 0) {
                ResultKt.throwOnFailure(objStartReactAsyncInternal);
                j11 = this.startGeneration.get();
                interfaceC44082a = this.startMutex;
                c232311.L$0 = interfaceC44082a;
                c232311.J$0 = j11;
                c232311.I$0 = 0;
                c232311.label = 1;
                if (interfaceC44082a.mo91344d(null, c232311) != coroutine_suspended) {
                    i11 = 0;
                }
                return coroutine_suspended;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC44082a2 = (InterfaceC44082a) c232311.L$0;
                    try {
                        ResultKt.throwOnFailure(objStartReactAsyncInternal);
                        zBooleanValue = ((Boolean) objStartReactAsyncInternal).booleanValue();
                        Boolean boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                        interfaceC44082a2.mo91345e(null);
                        return boolBoxBoolean;
                    } catch (Throwable th3) {
                        th2 = th3;
                        interfaceC44082a2.mo91345e(null);
                        throw th2;
                    }
                }
                i13 = c232311.I$1;
                i12 = c232311.I$0;
                j11 = c232311.J$0;
                interfaceC44082a3 = (InterfaceC44082a) c232311.L$0;
                try {
                    ResultKt.throwOnFailure(objStartReactAsyncInternal);
                    if (((Boolean) objStartReactAsyncInternal).booleanValue()) {
                        c232311.L$0 = interfaceC44082a3;
                        c232311.J$0 = j11;
                        c232311.I$0 = i12;
                        c232311.I$1 = i13;
                        c232311.label = 3;
                        objStartReactAsyncInternal = startReactAsyncInternal(j11, c232311);
                        if (objStartReactAsyncInternal != coroutine_suspended) {
                            interfaceC44082a2 = interfaceC44082a3;
                            zBooleanValue = ((Boolean) objStartReactAsyncInternal).booleanValue();
                        }
                        return coroutine_suspended;
                    }
                    interfaceC44082a2 = interfaceC44082a3;
                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(zBooleanValue);
                    interfaceC44082a2.mo91345e(null);
                    return boolBoxBoolean2;
                } catch (Throwable th4) {
                    th2 = th4;
                    interfaceC44082a2 = interfaceC44082a3;
                    interfaceC44082a2.mo91345e(null);
                    throw th2;
                }
            }
            i11 = c232311.I$0;
            j11 = c232311.J$0;
            InterfaceC44082a interfaceC44082a4 = (InterfaceC44082a) c232311.L$0;
            ResultKt.throwOnFailure(objStartReactAsyncInternal);
            interfaceC44082a = interfaceC44082a4;
            c232311.L$0 = interfaceC44082a;
            c232311.J$0 = j11;
            c232311.I$0 = i11;
            c232311.I$1 = 0;
            c232311.label = 2;
            Object objIsStartActive = isStartActive(j11, c232311);
            if (objIsStartActive != coroutine_suspended) {
                interfaceC44082a3 = interfaceC44082a;
                objStartReactAsyncInternal = objIsStartActive;
                i12 = i11;
                i13 = 0;
                if (((Boolean) objStartReactAsyncInternal).booleanValue()) {
                    interfaceC44082a2 = interfaceC44082a3;
                } else {
                    c232311.L$0 = interfaceC44082a3;
                    c232311.J$0 = j11;
                    c232311.I$0 = i12;
                    c232311.I$1 = i13;
                    c232311.label = 3;
                    objStartReactAsyncInternal = startReactAsyncInternal(j11, c232311);
                    if (objStartReactAsyncInternal != coroutine_suspended) {
                        interfaceC44082a2 = interfaceC44082a3;
                        zBooleanValue = ((Boolean) objStartReactAsyncInternal).booleanValue();
                    }
                }
                Boolean boolBoxBoolean3 = Boxing.boxBoolean(zBooleanValue);
                interfaceC44082a2.mo91345e(null);
                return boolBoxBoolean3;
            }
            return coroutine_suspended;
        } catch (Throwable th5) {
            interfaceC44082a2 = interfaceC44082a;
            th2 = th5;
            interfaceC44082a2.mo91345e(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appearedListener$lambda$0(ReactRootViewHost reactRootViewHost) {
        reactRootViewHost.onViewAppeared();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyAfterQueuesDrain$fireDestroy(AtomicBoolean atomicBoolean, AtomicReference<String> atomicReference, Handler handler, Runnable runnable, Runnable runnable2, String str) {
        if (atomicBoolean.get()) {
            return;
        }
        atomicReference.set(str);
        handler.removeCallbacks(runnable);
        handler.post(runnable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyAfterQueuesDrain$lambda$43(AtomicBoolean atomicBoolean, AtomicReference atomicReference, Runnable runnable) {
        if (atomicBoolean.get()) {
            return;
        }
        atomicReference.set("timeout");
        C44128b.m97270n(TAG, "destroyAfterQueuesDrain: timeout, barrier did not complete in 1500ms");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyAfterQueuesDrain$lambda$47$lambda$46(ReactRootViewHost reactRootViewHost, ReactContext reactContext, AtomicBoolean atomicBoolean, AtomicReference atomicReference, Handler handler, Runnable runnable, Runnable runnable2) {
        if (!destroyAfterQueuesDrain$postNmBarrier(reactRootViewHost, reactContext, atomicBoolean, atomicReference, handler, runnable, runnable2)) {
            destroyAfterQueuesDrain$fireDestroy(atomicBoolean, atomicReference, handler, runnable, runnable2, "nm_enqueue_fail");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit discardStaleInstanceManager$lambda$7(ReactInstanceManager reactInstanceManager) {
        reactInstanceManager.destroy();
        return Unit.INSTANCE;
    }

    private final boolean ensureFabricUiManagerReady(final ReactInstanceManager instanceManager) {
        UIManager uIManager;
        if (!ReactNativeFeatureFlags.enableFabricRenderer()) {
            return true;
        }
        ReactContext currentReactContext = instanceManager.getCurrentReactContext();
        if (currentReactContext != null) {
            uIManager = UIManagerHelper.getUIManager(currentReactContext, 2);
        } else {
            uIManager = null;
        }
        if (uIManager instanceof FabricUIManager) {
            return true;
        }
        if (isRnDevMode() && this.reactInstanceManager == instanceManager) {
            destroyCurrentInstanceManager();
        } else {
            clearBoundExceptionHandler();
            C27100x0.m66924e(new Function0() { // from class: com.kubi.rn.core.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReactRootViewHost.ensureFabricUiManagerReady$lambda$8(this.f45572b);
                }
            });
            C27100x0.m66924e(new Function0() { // from class: com.kubi.rn.core.b0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReactRootViewHost.ensureFabricUiManagerReady$lambda$9(instanceManager);
                }
            });
            this.reactInstanceManager = null;
        }
        this.state.changeToFailed(401, "Fabric UIManager 未初始化");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ensureFabricUiManagerReady$lambda$8(ReactRootViewHost reactRootViewHost) {
        reactRootViewHost.unmountRootView();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ensureFabricUiManagerReady$lambda$9(ReactInstanceManager reactInstanceManager) {
        reactInstanceManager.destroy();
        return Unit.INSTANCE;
    }

    private final void finishPageOpen(PageOpenResult result) {
        cancelPageOpenTimeout();
        Object obj = this.pageOpenOwnerToken;
        if (obj == null) {
            return;
        }
        KrnPageOpenRegistry.INSTANCE.finishAndRemove(this.reactRootView.getRootViewTag(), obj, result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRootView$lambda$3(ReactRootViewHost reactRootViewHost) {
        reactRootViewHost.cancelRenderTimeout();
        return Unit.INSTANCE;
    }

    private final boolean isRnDevMode() {
        ReactInitParam reactInitParam;
        if (ReactConstKt.getDeveloperSupport() && (reactInitParam = this.initParam) != null && reactInitParam.isDebug()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isStartActive(long j11, Continuation<? super Boolean> continuation) {
        boolean z11;
        C41783z1.m91406l(continuation.get$context());
        if (!this.isDestroyed && j11 == this.startGeneration.get()) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boxing.boxBoolean(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerPageOpenTrace$lambda$16$lambda$15(ReactRootViewHost reactRootViewHost) {
        reactRootViewHost.cancelPageOpenTimeout();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerPageOpenTrace$lambda$17(ReactRootViewHost reactRootViewHost, Object obj) {
        reactRootViewHost.schedulePageOpenVisibleFrame(obj);
        return Unit.INSTANCE;
    }

    private final void reportLoadFailed(String error, int fallbackCode) throws JSONException {
        cancelRenderTimeout();
        this.lastError = new KRNError(KRNErrorType.NATIVE, false, error, fallbackCode, null, null, 32, null);
        this.fcpTracker.reportLoadResult(false, error, Integer.valueOf(fallbackCode));
        KrnFcpTrackerRegistry.INSTANCE.unregister(this.reactRootView.getRootViewTag());
        finishPageOpen(PageOpenResult.ABORT);
        unregisterPageOpenContainer();
        unregisterEventHubEndpoint();
    }

    private final void runPageOpenTaskOnMain(final Function0<Unit> action) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            action.invoke();
        } else {
            this.reactRootView.post(new Runnable() { // from class: com.kubi.rn.core.y
                @Override // java.lang.Runnable
                public final void run() {
                    action.invoke();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unmountReactRootView$lambda$37(ReactRootViewHost reactRootViewHost) {
        reactRootViewHost.unmountRootView();
        return Unit.INSTANCE;
    }

    private final void unregisterPageOpenContainer() {
        cancelPageOpenTimeout();
        Object obj = this.pageOpenOwnerToken;
        if (obj == null) {
            return;
        }
        KrnPageOpenRegistry.INSTANCE.unregisterContainer(this.reactRootView.getRootViewTag(), obj);
        this.pageOpenOwnerToken = null;
    }

    @NotNull
    public final String getDebugBundleDialogContent() {
        if (!ReactConstKt.getDeveloperSupport()) {
            return "";
        }
        RnDebugBundleInfo rnDebugBundleInfo = this.debugBundleInfo;
        if (rnDebugBundleInfo == null) {
            rnDebugBundleInfo = new RnDebugBundleInfo(null, null, 3, null);
        }
        return rnDebugBundleInfo.toDialogContent();
    }

    public final boolean notifyHostHandledError(int fallbackCode) {
        Object objM103844constructorimpl;
        KRNContainerDelegate containerDelegate = getContainerDelegate();
        if (containerDelegate == null) {
            return false;
        }
        KRNError kRNError = this.lastError;
        if (kRNError == null) {
            kRNError = new KRNError(KRNErrorType.NATIVE, false, null, fallbackCode, null, null, 32, null);
        }
        this.lastError = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(containerDelegate.didFail(kRNError)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        return ((Boolean) objM103844constructorimpl).booleanValue();
    }

    public final void showDevOptionsDialog() {
        ReactInstanceManager reactInstanceManager;
        if (ReactConstKt.getDeveloperSupport() && (reactInstanceManager = this.reactInstanceManager) != null) {
            reactInstanceManager.showDevOptionsDialog();
        }
    }

    public final void unmountReactRootView() {
        cancelPendingStart();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.rn.core.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReactRootViewHost.unmountReactRootView$lambda$37(this.f46022b);
            }
        });
    }

    public /* synthetic */ ReactRootViewHost(Context context, Activity activity, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler, LifecycleOwner lifecycleOwner, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, activity, defaultHardwareBackBtnHandler, lifecycleOwner, (i11 & 16) != 0 ? null : l11);
    }
}
