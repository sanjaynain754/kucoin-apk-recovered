package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeAssetsTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016JP\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016JH\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016J\u001e\u0010\u0014\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016J8\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016J\u001e\u0010\u001c\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016J\u001e\u0010\u001d\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016J\u001e\u0010\u001e\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0017J\u0017\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\"J\n\u0010#\u001a\u0004\u0018\u00010\u0007H\u0016J\u0017\u0010$\u001a\u0004\u0018\u00010\u00122\u0006\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\"J2\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u00072\b\u0010(\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016J\u001e\u0010)\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016J\u001f\u0010*\u001a\u00020+\"\b\b\u0000\u0010,*\u00020-2\b\u0010.\u001a\u0004\u0018\u0001H,¢\u0006\u0002\u0010/¨\u00061"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeAssetsTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "jumpMultiAddFundsDialog", "", "sceneCode", FirebaseAnalytics.Param.CURRENCY, "fiatMoney", "defaultAccount", "defaultAccountAmount", "toAccountTag", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "jumpMultiAccountUseDialog", "jumpHoldEarnDialog", "jumpMultiAccountSelectDialog", "getHideAssetsEyeStatus", "()Ljava/lang/Boolean;", "setHideAssetsEyeStatus", "isHide", "(Z)Ljava/lang/Boolean;", "goBindEmail", "goBindGoogle", "goBindPhone", "goSetPassword", "getPnlCalcMethod", "setPnlCalcMethod", "methodName", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getPnlDaysRange", "setPnlDaysRange", "daysRange", "setPricingCurrency", "pricingCrypto", "pricingFiat", "openPnlDietalDialog", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeAssetsTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "Assets";

    @Nullable
    public Boolean getHideAssetsEyeStatus() {
        return null;
    }

    @Nullable
    public Boolean getPnlCalcMethod() {
        return null;
    }

    @Nullable
    public String getPnlDaysRange() {
        return null;
    }

    @Nullable
    public Boolean setHideAssetsEyeStatus(boolean isHide) {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAssetsTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Assets";
    }

    public void goBindEmail(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void goBindGoogle(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void goBindPhone(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void goSetPassword(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void jumpHoldEarnDialog(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void jumpMultiAccountSelectDialog(@NotNull String sceneCode, @NotNull String currency, @Nullable String toAccountTag, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void jumpMultiAccountUseDialog(@NotNull String sceneCode, @NotNull String currency, @NotNull String fiatMoney, @NotNull String defaultAccountAmount, @Nullable String toAccountTag, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fiatMoney, "fiatMoney");
        Intrinsics.checkNotNullParameter(defaultAccountAmount, "defaultAccountAmount");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void jumpMultiAddFundsDialog(@NotNull String sceneCode, @NotNull String currency, @NotNull String fiatMoney, @NotNull String defaultAccount, @NotNull String defaultAccountAmount, @Nullable String toAccountTag, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fiatMoney, "fiatMoney");
        Intrinsics.checkNotNullParameter(defaultAccount, "defaultAccount");
        Intrinsics.checkNotNullParameter(defaultAccountAmount, "defaultAccountAmount");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void openPnlDietalDialog(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public Boolean setPnlCalcMethod(@NotNull String methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return null;
    }

    @Nullable
    public Boolean setPnlDaysRange(@NotNull String daysRange) {
        Intrinsics.checkNotNullParameter(daysRange, "daysRange");
        return null;
    }

    public void setPricingCurrency(@Nullable String pricingCrypto, @Nullable String pricingFiat, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
