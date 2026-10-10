package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeCountryCodeTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016J&\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\rH\u0016J\u001e\u0010\u0011\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\rH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0015J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u001c\"\b\b\u0000\u0010\u001d*\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u0001H\u001d¢\u0006\u0002\u0010 ¨\u0006\""}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeCountryCodeTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "openPicker", "", "sceneCode", "businessCode", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReadableMap;", "loadCountries", "", "loadIpCountry", "getDefaultMobileCode", "isCountryCodeValid", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "isMobileCodeValid", "mobileCode", "isVoiceCodeSupported", "code", "(Ljava/lang/String;)Ljava/lang/Boolean;", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeCountryCodeTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "CountryCode";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeCountryCodeTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Nullable
    public String getDefaultMobileCode(@NotNull String sceneCode) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "CountryCode";
    }

    @Nullable
    public Boolean isCountryCodeValid(@NotNull String sceneCode, @NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return null;
    }

    @Nullable
    public Boolean isMobileCodeValid(@NotNull String sceneCode, @NotNull String mobileCode) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(mobileCode, "mobileCode");
        return null;
    }

    @Nullable
    public Boolean isVoiceCodeSupported(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return null;
    }

    public void loadCountries(@NotNull String sceneCode, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void loadIpCountry(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void openPicker(@NotNull String sceneCode, @NotNull String businessCode, @NotNull Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(businessCode, "businessCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
