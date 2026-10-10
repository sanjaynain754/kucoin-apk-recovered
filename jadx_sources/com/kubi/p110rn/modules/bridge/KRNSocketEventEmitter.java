package com.kubi.p110rn.modules.bridge;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.kubi.p110rn.modules.bridge.KRNSocketEventEmitter;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KRNSocketEventEmitter.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007H\u0007J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/rn/modules/bridge/KRNSocketEventEmitter;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "listenerCount", "", "invalidated", "", "getName", "", "initialize", "", "invalidate", "addListener", "eventName", "removeListeners", "count", "emitSocketEvent", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/WritableMap;", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KRNSocketEventEmitter extends ReactContextBaseJavaModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EVENT_NAME = "KRN_SOCKET_EVENT";

    @NotNull
    private static final String TAG = "KRNSocketEventEmitter";

    @Nullable
    private static volatile KRNSocketEventEmitter instance;
    private volatile boolean invalidated;
    private volatile int listenerCount;

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX INFO: compiled from: KRNSocketEventEmitter.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/rn/modules/bridge/KRNSocketEventEmitter$Companion;", "", "<init>", "()V", "TAG", "", "EVENT_NAME", "instance", "Lcom/kubi/rn/modules/bridge/KRNSocketEventEmitter;", "getInstance", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final KRNSocketEventEmitter getInstance() {
            return KRNSocketEventEmitter.instance;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KRNSocketEventEmitter(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void emitSocketEvent$lambda$2(KRNSocketEventEmitter kRNSocketEventEmitter, WritableMap writableMap) {
        Object objM103844constructorimpl;
        if (kRNSocketEventEmitter.invalidated || !kRNSocketEventEmitter.reactContext.hasActiveReactInstance()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) kRNSocketEventEmitter.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(EVENT_NAME, writableMap);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97266j(TAG, "emitSocketEvent failed: error=" + thM103847exceptionOrNullimpl.getMessage());
        }
    }

    @ReactMethod
    public final void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.listenerCount++;
        C44128b.m97266j(TAG, "addListener: eventName=" + eventName + ", listenerCount=" + this.listenerCount);
    }

    public final void emitSocketEvent(@NotNull final WritableMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (this.invalidated) {
            C44128b.m97266j(TAG, "emitSocketEvent skipped: invalidated");
            return;
        }
        if (this.listenerCount <= 0) {
            C44128b.m97266j(TAG, "emitSocketEvent skipped: no active listeners");
        } else if (this.reactContext.hasActiveReactInstance()) {
            this.reactContext.runOnJSQueueThread(new Runnable() { // from class: px.q
                @Override // java.lang.Runnable
                public final void run() {
                    KRNSocketEventEmitter.emitSocketEvent$lambda$2(this.f96118b, params);
                }
            });
        } else {
            C44128b.m97266j(TAG, "emitSocketEvent skipped: no active react instance");
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void removeListeners(int count) {
        this.listenerCount -= count;
        if (this.listenerCount < 0) {
            this.listenerCount = 0;
        }
        C44128b.m97266j(TAG, "removeListeners: count=" + count + ", listenerCount=" + this.listenerCount);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.invalidated = false;
        instance = this;
        C44128b.m97266j(TAG, "initialize");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.invalidated = true;
        instance = null;
        C44128b.m97266j(TAG, "invalidate");
    }
}
