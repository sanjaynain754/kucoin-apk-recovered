package com.kubi.p110rn.modules.bridge;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.p110rn.modules.BridgeUtilsKt;
import com.kubi.p110rn.modules.command.impl.TakePictureCommand;
import com.kubi.sdk.BaseActivity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KRNPhotoBridge.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/rn/modules/bridge/KRNPhotoBridge;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "takePicture", "", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KRNPhotoBridge extends ReactContextBaseJavaModule {

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KRNPhotoBridge(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "KRNPhotoBridge";
    }

    @ReactMethod
    public final void takePicture(@NotNull ReadableMap params, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BaseActivity baseActivity = (BaseActivity) getCurrentActivity();
        if (baseActivity == null) {
            promise.reject(BridgeUtilsKt.ERROR_CODE_PARAM, "currentActivity is null");
            return;
        }
        new TakePictureCommand(promise, baseActivity, this.reactContext, BridgeUtilsKt.optBoolean(params, BridgeParamKeyKt.CAPTURE, true), BridgeUtilsKt.optInt(params, BridgeParamKeyKt.MAX_COUNT, 1), null, null, 96, null).execute();
    }
}
