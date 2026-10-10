package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeSystemSettingsTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tH\u0016J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J&\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J\u0010\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\tH\u0016J.\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J\u001e\u0010\u001b\u001a\u00020\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J\u001e\u0010\u001c\u001a\u00020\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001e\u0010 \u001a\u00020\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J&\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J&\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J&\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J\u001e\u0010(\u001a\u00020\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J\u001e\u0010)\u001a\u00020\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J\u001e\u0010*\u001a\u00020\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J\u0010\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\tH\u0016J\n\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001f\u0010/\u001a\u000200\"\b\b\u0000\u00101*\u0002022\b\u00103\u001a\u0004\u0018\u0001H1¢\u0006\u0002\u00104¨\u00066"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSystemSettingsTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getLanguageList", "", "Lcom/kubi/rn/core/turbo/LanguageItem;", "getCurrencyList", "Lcom/kubi/rn/core/turbo/CurrencyItem;", "changeLanguage", "", "language", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/rn/core/turbo/OperationResult;", "changeCurrency", FirebaseAnalytics.Param.CURRENCY, "getSoundSettings", "Lcom/kubi/rn/core/turbo/SoundSettingStateItem;", "setSoundSetting", "settingKey", "enabled", "", "closeAllSoundSettings", "getSettingsSnapshot", "Lcom/kubi/rn/core/turbo/SettingsSnapshot;", "getAppTheme", "Lcom/kubi/rn/core/turbo/AppThemeInfo;", "getCacheSize", "setAppTheme", "mode", "setUpDownColor", TtmlNode.TAG_STYLE, "setVolumeUnit", "index", "", "clearCache", "uploadMobileLog", "logout", "getEnvironmentInfo", "Lcom/kubi/rn/core/turbo/EnvironmentInfoItem;", "getTestFlightConfig", "Lcom/kubi/rn/core/turbo/TestFlightConfig;", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeSystemSettingsTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "SystemSettings";

    @Nullable
    public AppThemeInfo getAppTheme() {
        return null;
    }

    @Nullable
    public List<CurrencyItem> getCurrencyList() {
        return null;
    }

    @Nullable
    public List<EnvironmentInfoItem> getEnvironmentInfo() {
        return null;
    }

    @Nullable
    public List<LanguageItem> getLanguageList() {
        return null;
    }

    @Nullable
    public List<SoundSettingStateItem> getSoundSettings() {
        return null;
    }

    @Nullable
    public TestFlightConfig getTestFlightConfig() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSystemSettingsTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public void changeCurrency(@NotNull String currency, @NotNull Function1<? super OperationResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void changeLanguage(@NotNull String language, @NotNull Function1<? super OperationResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void clearCache(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void closeAllSoundSettings(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void getCacheSize(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "SystemSettings";
    }

    public void getSettingsSnapshot(@NotNull Function1<? super SettingsSnapshot, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void logout(@NotNull Function1<? super OperationResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void setAppTheme(@NotNull String mode, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void setSoundSetting(@NotNull String settingKey, boolean enabled, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(settingKey, "settingKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void setUpDownColor(@NotNull String style, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void setVolumeUnit(double index, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void uploadMobileLog(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
