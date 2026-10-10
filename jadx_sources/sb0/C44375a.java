package sb0;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sb0.a */
/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Landroid/content/Context;", "", "c", "(Landroid/content/Context;)Z", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "deviceEventEmitter", "Lcom/facebook/react/uimanager/UIManagerModule;", "b", "(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/react/uimanager/UIManagerModule;", UIManagerModule.NAME, "react-native-gesture-handler_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C44375a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final DeviceEventManagerModule.RCTDeviceEventEmitter m97873a(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        JavaScriptModule jSModule = reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        Intrinsics.checkNotNullExpressionValue(jSModule, "getJSModule(...)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final UIManagerModule m97874b(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        NativeModule nativeModule = reactContext.getNativeModule((Class<NativeModule>) UIManagerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        return (UIManagerModule) nativeModule;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m97875c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isTouchExplorationEnabled();
    }
}
