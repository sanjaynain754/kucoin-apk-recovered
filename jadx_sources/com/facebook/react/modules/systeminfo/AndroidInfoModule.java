package com.facebook.react.modules.systeminfo;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.credentials.provider.CredentialEntry;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.module.annotations.ReactModule;
import com.tencent.bugly.proguard.C33789m5;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidInfoModule.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = NativePlatformConstantsAndroidSpec.NAME)
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;", "Lcom/facebook/fbreact/specs/NativePlatformConstantsAndroidSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "uiMode", "", "getTypedExportedConstants", "", "", "getAndroidID", "invalidate", "", "isRunningScreenshotTest", "", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SuppressLint({"HardwareIds"})
public final class AndroidInfoModule extends NativePlatformConstantsAndroidSpec {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String IS_DISABLE_ANIMATIONS = "IS_DISABLE_ANIMATIONS";

    @NotNull
    private static final String IS_TESTING = "IS_TESTING";

    /* JADX INFO: compiled from: AndroidInfoModule.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/react/modules/systeminfo/AndroidInfoModule$Companion;", "", "<init>", "()V", AndroidInfoModule.IS_TESTING, "", AndroidInfoModule.IS_DISABLE_ANIMATIONS, "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean isRunningScreenshotTest() {
        try {
            Class.forName("com.facebook.testing.react.screenshots.ReactAppScreenshotTestActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("Release", Build.VERSION.RELEASE);
        linkedHashMap.put("Serial", Build.SERIAL);
        linkedHashMap.put("Fingerprint", Build.FINGERPRINT);
        linkedHashMap.put(ExifInterface.TAG_MODEL, Build.MODEL);
        linkedHashMap.put("Manufacturer", Build.MANUFACTURER);
        linkedHashMap.put("Brand", Build.BRAND);
        if (ReactBuildConfig.DEBUG) {
            Context applicationContext = getReactApplicationContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            linkedHashMap.put("ServerHost", AndroidInfoHelpers.getServerHost(applicationContext));
        }
        linkedHashMap.put("isTesting", Boolean.valueOf(Intrinsics.areEqual(CredentialEntry.TRUE_STRING, System.getProperty(IS_TESTING)) || isRunningScreenshotTest()));
        String property = System.getProperty(IS_DISABLE_ANIMATIONS);
        if (property != null) {
            linkedHashMap.put("isDisableAnimations", Boolean.valueOf(Intrinsics.areEqual(CredentialEntry.TRUE_STRING, property)));
        }
        linkedHashMap.put("reactNativeVersion", ReactNativeVersion.VERSION);
        linkedHashMap.put("uiMode", uiMode());
        return linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInfoModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    private final String uiMode() {
        Object systemService = getReactApplicationContext().getSystemService("uimode");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        int currentModeType = ((UiModeManager) systemService).getCurrentModeType();
        if (currentModeType != 1) {
            if (currentModeType != 2) {
                if (currentModeType != 3) {
                    if (currentModeType != 4) {
                        if (currentModeType != 6) {
                            if (currentModeType != 7) {
                                return "unknown";
                            }
                            return "vrheadset";
                        }
                        return "watch";
                    }
                    return "tv";
                }
                return "car";
            }
            return "desk";
        }
        return C33789m5.f70921k;
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    @NotNull
    public String getAndroidID() {
        String string = Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
    }
}
