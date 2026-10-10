package com.kubi.p110rn.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.Constants;
import com.kubi.p110rn.api.error.KRNContainerDelegate;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.p110rn.p111ui.OnDialogDismissedListener;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: IReactNativeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 ;2\u00020\u0001:\u0001;JX\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072:\u0010\b\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H&J>\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00052,\b\u0002\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0016H&J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&J\u0012\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH&J(\u0010 \u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010!H&JB\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\u00052\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\u000f0\tH&J\b\u0010)\u001a\u00020'H&J\u0018\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0003H&J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u0005H&J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H&J\u0010\u00103\u001a\u00020\u000f2\u0006\u0010/\u001a\u000200H&J0\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005H&J\u0010\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020:H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006<À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/rn/api/IReactNativeService;", "", "openRnDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "route", "", "onDismissed", "Lcom/kubi/rn/ui/OnDialogDismissedListener;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "Lcom/kubi/rn/ui/KCBridgeRejecterError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "cleanAll", "context", "Landroid/content/Context;", "nativeNotifyRn", "eventName", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nativeWebSocketDataToRn", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/WritableMap;", "getRnRootFragment", "Lcom/kubi/sdk/BaseFragment;", "arguments", "Landroid/os/Bundle;", "exposeReportSensor", "fragment", "emitOpenRoute", "", "showAddHomePageDialog", "ctx", "obj", "Ljava/lang/Object;", "shortcutId", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "isEngineInitialized", "registerDialogId", "dialogId", "dialog", "unregisterDialogId", "registerContainerDelegate", "rootView", "Lcom/facebook/react/ReactRootView;", "delegate", "Lcom/kubi/rn/api/error/KRNContainerDelegate;", "unregisterContainerDelegate", "getLatestBundle", "Lkotlin/Pair;", com.kubi.p110rn.Constants.BIZ, "entry", "showKrnPanelEntry", "activity", "Landroid/app/Activity;", "Companion", "BReactNativeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IReactNativeService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: IReactNativeService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/rn/api/IReactNativeService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/rn/api/IReactNativeService;", "BReactNativeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public final IReactNativeService get() {
            return (IReactNativeService) Router.f46192a.m56192n(IReactNativeService.class);
        }

        private Companion() {
        }
    }

    void cleanAll(@NotNull Context context);

    void emitOpenRoute(@NotNull String route, @Nullable Map<String, ? extends Object> params);

    void exposeReportSensor(@Nullable BaseFragment fragment);

    @Nullable
    Pair<String, String> getLatestBundle(@NotNull Context context, @NotNull String biz, @NotNull String entry);

    @NotNull
    BaseFragment getRnRootFragment(@Nullable Bundle arguments);

    boolean isEngineInitialized();

    void nativeNotifyRn(@NotNull String eventName, @Nullable HashMap<String, Object> data);

    void nativeWebSocketDataToRn(@NotNull WritableMap params);

    @NotNull
    DialogFragmentHelper openRnDialog(@NotNull String route, @Nullable OnDialogDismissedListener onDismissed, @NotNull Function2<? super String, ? super KCBridgeRejecterError, Unit> callback);

    void registerContainerDelegate(@NotNull ReactRootView rootView, @NotNull KRNContainerDelegate delegate);

    void registerDialogId(@NotNull String dialogId, @NotNull DialogFragmentHelper dialog);

    void showAddHomePageDialog(@NotNull Context ctx, @Nullable Object obj, @Nullable String shortcutId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    void showKrnPanelEntry(@NotNull Activity activity);

    void unregisterContainerDelegate(@NotNull ReactRootView rootView);

    void unregisterDialogId(@NotNull String dialogId);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void emitOpenRoute$default(IReactNativeService iReactNativeService, String str, Map map, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: emitOpenRoute");
        }
        if ((i11 & 2) != 0) {
            map = null;
        }
        iReactNativeService.emitOpenRoute(str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void nativeNotifyRn$default(IReactNativeService iReactNativeService, String str, HashMap map, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nativeNotifyRn");
        }
        if ((i11 & 2) != 0) {
            map = null;
        }
        iReactNativeService.nativeNotifyRn(str, map);
    }

    static /* synthetic */ DialogFragmentHelper openRnDialog$default(IReactNativeService iReactNativeService, String str, OnDialogDismissedListener onDialogDismissedListener, Function2 function2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openRnDialog");
        }
        if ((i11 & 2) != 0) {
            onDialogDismissedListener = null;
        }
        return iReactNativeService.openRnDialog(str, onDialogDismissedListener, function2);
    }
}
