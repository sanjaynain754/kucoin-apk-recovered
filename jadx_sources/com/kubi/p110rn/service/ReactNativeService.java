package com.kubi.p110rn.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.api.error.KRNContainerDelegate;
import com.kubi.p110rn.api.error.KRNContainerDelegateRegistry;
import com.kubi.p110rn.core.BundleLoader;
import com.kubi.p110rn.core.RNEventDispatcher;
import com.kubi.p110rn.core.RNInstanceManagerHolder;
import com.kubi.p110rn.debug.KRNPanelManager;
import com.kubi.p110rn.modules.RNPublishSubject;
import com.kubi.p110rn.modules.bridge.KRNSocketEventEmitter;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.p110rn.p111ui.OnDialogDismissedListener;
import com.kubi.p110rn.p111ui.ReactContainerActivity;
import com.kubi.p110rn.p111ui.ReactRootFragment;
import com.kubi.p110rn.p111ui.RnDialogHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.pkg.bundle.BundleManager;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: ReactNativeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J<\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072*\u0010\u0013\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014j\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u0001`\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010 \u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020#H\u0016JB\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u00072\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\r0\u000bH\u0016J\u0018\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0005H\u0016J\u0010\u0010-\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u0007H\u0016J\u0018\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\r2\u0006\u0010/\u001a\u000200H\u0016J0\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0016J\u0010\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020:H\u0016¨\u0006;"}, m90084d2 = {"Lcom/kubi/rn/service/ReactNativeService;", "Lcom/kubi/rn/api/IReactNativeService;", "<init>", "()V", "openRnDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "route", "", "onDismissed", "Lcom/kubi/rn/ui/OnDialogDismissedListener;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/rn/ui/KCBridgeRejecterError;", "", "cleanAll", "context", "Landroid/content/Context;", "nativeNotifyRn", "eventName", "data", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "nativeWebSocketDataToRn", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/WritableMap;", "getRnRootFragment", "Lcom/kubi/sdk/BaseFragment;", "arguments", "Landroid/os/Bundle;", "exposeReportSensor", "fragment", "emitOpenRoute", "", "isEngineInitialized", "", "showAddHomePageDialog", "ctx", "obj", "Ljava/lang/Object;", "shortcutId", "Lcom/kubi/sdk/protocol/ProtocolException;", "registerDialogId", "dialogId", "dialog", "unregisterDialogId", "registerContainerDelegate", "rootView", "Lcom/facebook/react/ReactRootView;", "delegate", "Lcom/kubi/rn/api/error/KRNContainerDelegate;", "unregisterContainerDelegate", "getLatestBundle", "Lkotlin/Pair;", Constants.BIZ, "entry", "showKrnPanelEntry", "activity", "Landroid/app/Activity;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ReactNativeService implements IReactNativeService {
    @Override // com.kubi.p110rn.api.IReactNativeService
    public void cleanAll(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BundleLoader.INSTANCE.clearCache();
        BundleManager.f47277a.m57489x(context);
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    public void emitOpenRoute(@NotNull String route, @Nullable Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(route, "route");
        RNEventDispatcher.INSTANCE.emitOpenRoute(route, params);
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    public void exposeReportSensor(@Nullable BaseFragment fragment) {
        ReactRootFragment reactRootFragment = fragment instanceof ReactRootFragment ? (ReactRootFragment) fragment : null;
        if (reactRootFragment != null) {
            reactRootFragment.exposeReportSensor();
        }
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    @Nullable
    public Pair<String, String> getLatestBundle(@NotNull Context context, @NotNull String biz, @NotNull String entry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        return BundleManager.f47277a.m57474I(context, biz, entry);
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    @NotNull
    public BaseFragment getRnRootFragment(@Nullable Bundle arguments) {
        return ReactRootFragment.INSTANCE.newInstance(arguments);
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    public boolean isEngineInitialized() {
        try {
            ReactInstanceManager currentInstanceManager = RNInstanceManagerHolder.INSTANCE.getCurrentInstanceManager();
            ReactContext currentReactContext = currentInstanceManager != null ? currentInstanceManager.getCurrentReactContext() : null;
            boolean z11 = currentReactContext != null && currentReactContext.hasActiveReactInstance();
            C44128b.m97266j("ReactNativeService", "isEngineInitialized check: " + z11);
            return z11;
        } catch (Exception e11) {
            C44128b.m97266j("ReactNativeService", "Error checking RN initialization: " + e11.getMessage());
            return false;
        }
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    public void nativeNotifyRn(@NotNull String eventName, @Nullable HashMap<String, Object> data) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        C23985b.f47489a.m57877e("sendEvent", "nativeNotifyRn eventName: " + eventName + ", data: " + data);
        RNPublishSubject.INSTANCE.getNativeNotifyRn().onNext(new Pair<>(eventName, data));
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    public void nativeWebSocketDataToRn(@NotNull WritableMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            KRNSocketEventEmitter companion = KRNSocketEventEmitter.INSTANCE.getInstance();
            if (companion != null) {
                companion.emitSocketEvent(params);
            } else {
                C44128b.m97260d("KRNSocketEventEmitter not initialized");
            }
        } catch (Exception e11) {
            C44128b.m97263g("Failed to notify RN:", e11);
        }
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    @NotNull
    public DialogFragmentHelper openRnDialog(@NotNull String route, @Nullable OnDialogDismissedListener onDismissed, @NotNull Function2<? super String, ? super KCBridgeRejecterError, Unit> callback) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return RnDialogHelper.INSTANCE.openRnDialog(route, callback, onDismissed);
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    public void registerContainerDelegate(@NotNull ReactRootView rootView, @NotNull KRNContainerDelegate delegate) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        KRNContainerDelegateRegistry.INSTANCE.register(rootView.getRootViewTag(), delegate);
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    public void registerDialogId(@NotNull String dialogId, @NotNull DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        RnDialogHelper.INSTANCE.registerDialogId(dialogId, dialog);
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    public void showAddHomePageDialog(@NotNull Context ctx, @Nullable Object obj, @Nullable String shortcutId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
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

    @Override // com.kubi.p110rn.api.IReactNativeService
    public void showKrnPanelEntry(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        KRNPanelManager.INSTANCE.show(activity);
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    public void unregisterContainerDelegate(@NotNull ReactRootView rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        KRNContainerDelegateRegistry.INSTANCE.unregister(rootView.getRootViewTag());
    }

    @Override // com.kubi.p110rn.api.IReactNativeService
    public void unregisterDialogId(@NotNull String dialogId) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        RnDialogHelper.INSTANCE.unregisterDialogId(dialogId);
    }
}
