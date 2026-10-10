package com.facebook.react.modules.devloading;

import com.facebook.fbreact.specs.NativeDevLoadingViewSpec;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DevLoadingModule.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = "DevLoadingView")
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/react/modules/devloading/DevLoadingModule;", "Lcom/facebook/fbreact/specs/NativeDevLoadingViewSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "jsExceptionHandler", "Lcom/facebook/react/bridge/JSExceptionHandler;", "devLoadingViewManager", "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "showMessage", "", "message", "", "color", "", "backgroundColor", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", TIMPushProvider.f75063o, "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DevLoadingModule extends NativeDevLoadingViewSpec {

    @NotNull
    public static final String NAME = "DevLoadingView";

    @Nullable
    private DevLoadingViewManager devLoadingViewManager;

    @Nullable
    private final JSExceptionHandler jsExceptionHandler;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$1(DevLoadingModule devLoadingModule) {
        DevLoadingViewManager devLoadingViewManager = devLoadingModule.devLoadingViewManager;
        if (devLoadingViewManager != null) {
            devLoadingViewManager.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessage$lambda$0(DevLoadingModule devLoadingModule, String str) {
        DevLoadingViewManager devLoadingViewManager = devLoadingModule.devLoadingViewManager;
        if (devLoadingViewManager != null) {
            devLoadingViewManager.showMessage(str);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevLoadingViewSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: x6.a
            @Override // java.lang.Runnable
            public final void run() {
                DevLoadingModule.hide$lambda$1(this.f103531b);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeDevLoadingViewSpec
    public void showMessage(@NotNull final String message, @Nullable Double color, @Nullable Double backgroundColor) {
        Intrinsics.checkNotNullParameter(message, "message");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: x6.b
            @Override // java.lang.Runnable
            public final void run() {
                DevLoadingModule.showMessage$lambda$0(this.f103532b, message);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevLoadingModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        JSExceptionHandler jSExceptionHandler = reactContext.getJSExceptionHandler();
        this.jsExceptionHandler = jSExceptionHandler;
        if (jSExceptionHandler != null && (jSExceptionHandler instanceof DevSupportManagerBase)) {
            this.devLoadingViewManager = ((DevSupportManagerBase) jSExceptionHandler).getDevLoadingViewManager();
        }
    }
}
