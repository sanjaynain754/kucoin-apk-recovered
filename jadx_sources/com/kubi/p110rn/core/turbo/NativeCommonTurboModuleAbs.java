package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeCommonTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 O2\u00020\u0001:\u0001OB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0012J!\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u001bJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u001eJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0012J&\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u001e\u0010$\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u001e\u0010%\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u000f\u0010&\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010'J\u0019\u0010(\u001a\u0004\u0018\u00010\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u0012J\u001e\u0010*\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u000f\u0010+\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010'J(\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u000f\u0010.\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010'J\u0017\u0010/\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0012J(\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u001e\u00102\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000b0\rH\u0016J&\u00103\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0016J(\u00104\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0016J2\u00106\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\u00072\b\u00107\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\n\u00108\u001a\u0004\u0018\u00010#H\u0016J\u0017\u00109\u001a\u0004\u0018\u00010\u000e2\u0006\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0012J\n\u0010;\u001a\u0004\u0018\u00010<H\u0016J\n\u0010=\u001a\u0004\u0018\u00010>H\u0016J&\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000e2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\n\u0010A\u001a\u0004\u0018\u00010#H\u0016J(\u0010B\u001a\u00020\u000b2\b\u0010C\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u001e\u0010D\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010E\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u000f\u0010F\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010'J\u0012\u0010G\u001a\u0004\u0018\u00010\u00072\u0006\u0010H\u001a\u00020\u0007H\u0016J\u0012\u0010I\u001a\u0004\u0018\u00010\u00072\u0006\u0010H\u001a\u00020\u0007H\u0016J\u001f\u0010J\u001a\u00020K\"\b\b\u0000\u0010L*\u00020M2\b\u00107\u001a\u0004\u0018\u0001HL¢\u0006\u0002\u0010N¨\u0006P"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeCommonTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getAppInfo", "Lcom/kubi/rn/core/turbo/AppInfo;", "refreshAppSession", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "getAppVersion", "showToast", "content", "(Ljava/lang/String;)Ljava/lang/Boolean;", "setStatusStyle", TtmlNode.TAG_STYLE, "updateRnContainerUi", "type", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "close", "animated", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;", "setNavSwipe", "canSwipe", "(Z)Ljava/lang/Boolean;", "canIUse", "apiName", "openFlutterDialog", "route", "Lcom/facebook/react/bridge/ReadableMap;", "getAppNotificationPermissionEnabled", "openAppNotificationSettings", "showAppUpgradeAlert", "()Ljava/lang/Boolean;", "openSupportTicketPage", "formId", "refreshAppUserInfo", "reload", "sharePageView", "qrCodeUrl", "vibrate", "playAppSound", "showAddHomePageDialog", "shortcutId", "getPasteBoardContent", "copyToClipboard", "closeDialog", "dialogId", "submitData", "data", "getAllBizControlConfig", "queryBizControlConfig", "uiSpmId", "syncCpsFromApp", "Lcom/kubi/rn/core/turbo/AppCpsInfo;", "getDeviceInfo", "Lcom/kubi/rn/core/turbo/DeviceInfo;", "setClipboardReadAccessOpen", "enabled", "getLegalPriceRate", "getFingerToken", "event", "openScan", "Lcom/kubi/rn/core/turbo/OpenScanResult;", "isUtaTrading", "getFormatSymbol", "symbol", "getContract", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeCommonTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "Common";

    @Nullable
    public Boolean close(@Nullable Boolean animated) {
        return null;
    }

    @Nullable
    public ReadableMap getAllBizControlConfig() {
        return null;
    }

    @Nullable
    public AppInfo getAppInfo() {
        return null;
    }

    @Nullable
    public String getAppVersion() {
        return null;
    }

    @Nullable
    public DeviceInfo getDeviceInfo() {
        return null;
    }

    @Nullable
    public ReadableMap getLegalPriceRate() {
        return null;
    }

    @Nullable
    public Boolean isUtaTrading() {
        return null;
    }

    @Nullable
    public Boolean openSupportTicketPage(@Nullable String formId) {
        return null;
    }

    @Nullable
    public Boolean reload() {
        return null;
    }

    @Nullable
    public Boolean setNavSwipe(boolean canSwipe) {
        return null;
    }

    @Nullable
    public Boolean showAppUpgradeAlert() {
        return null;
    }

    @Nullable
    public AppCpsInfo syncCpsFromApp() {
        return null;
    }

    @Nullable
    public Boolean vibrate() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeCommonTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Nullable
    public Boolean canIUse(@NotNull String apiName) {
        Intrinsics.checkNotNullParameter(apiName, "apiName");
        return null;
    }

    public void closeDialog(@Nullable String dialogId, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void copyToClipboard(@NotNull String content, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void getAppNotificationPermissionEnabled(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public String getContract(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return null;
    }

    public void getFingerToken(@Nullable String event, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public String getFormatSymbol(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Common";
    }

    public void getPasteBoardContent(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void openAppNotificationSettings(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void openFlutterDialog(@NotNull String route, @NotNull Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void openScan(@NotNull Function1<? super OpenScanResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public Boolean playAppSound(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return null;
    }

    @Nullable
    public Boolean queryBizControlConfig(@NotNull String uiSpmId) {
        Intrinsics.checkNotNullParameter(uiSpmId, "uiSpmId");
        return null;
    }

    public void refreshAppSession(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void refreshAppUserInfo(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void setClipboardReadAccessOpen(boolean enabled, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public Boolean setStatusStyle(@NotNull String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return null;
    }

    public void sharePageView(@Nullable String qrCodeUrl, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void showAddHomePageDialog(@Nullable String shortcutId, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public Boolean showToast(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return null;
    }

    public void submitData(@Nullable String dialogId, @Nullable String data, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public Boolean updateRnContainerUi(@NotNull String type, @Nullable Boolean enable) {
        Intrinsics.checkNotNullParameter(type, "type");
        return null;
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
