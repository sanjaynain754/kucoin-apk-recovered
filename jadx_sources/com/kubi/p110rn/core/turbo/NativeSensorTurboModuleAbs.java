package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeSensorTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u001f\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u0016J;\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u001cJ.\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u001e0!H\u0016J\u001f\u0010\"\u001a\u00020#\"\b\b\u0000\u0010$*\u00020%2\b\u0010&\u001a\u0004\u0018\u0001H$¢\u0006\u0002\u0010'¨\u0006)"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSensorTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "fastFetchJsonTest", "Lcom/facebook/react/bridge/ReadableMap;", "keyName", "defaultValue", "fastFetchIntegerTest", "", "(Ljava/lang/String;D)Ljava/lang/Double;", "fastFetchStringTest", "fastFetchBoolTest", "", "(Ljava/lang/String;Z)Ljava/lang/Boolean;", "sensorsTrackTurbo", "eventId", "properties", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "sensorsExpose", "pageId", "blockId", "locationId", "siteId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "fetchKcAbTest", "", "experimentKey", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeSensorTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "Sensor";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSensorTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Nullable
    public Boolean fastFetchBoolTest(@NotNull String keyName, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        return null;
    }

    @Nullable
    public Double fastFetchIntegerTest(@NotNull String keyName, double defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        return null;
    }

    @Nullable
    public ReadableMap fastFetchJsonTest(@NotNull String keyName, @NotNull ReadableMap defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return null;
    }

    @Nullable
    public String fastFetchStringTest(@NotNull String keyName, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return null;
    }

    public void fetchKcAbTest(@NotNull String experimentKey, @NotNull String defaultValue, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(experimentKey, "experimentKey");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Sensor";
    }

    @Nullable
    public Boolean sensorsExpose(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable String siteId, @Nullable ReadableMap properties) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        return null;
    }

    @Nullable
    public Boolean sensorsTrackTurbo(@NotNull String eventId, @Nullable ReadableMap properties) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return null;
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
