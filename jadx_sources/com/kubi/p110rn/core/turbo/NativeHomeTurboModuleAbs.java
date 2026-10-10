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

/* JADX INFO: compiled from: NativeHomeTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u000bH\u0016J!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\f2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\u001f\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\u0016*\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u0001H\u0016¢\u0006\u0002\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeHomeTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "setHomeFeedRouteReadyState", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "recordStartupTrace", "eventName", "properties", "Lcom/facebook/react/bridge/ReadableMap;", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "setHomeBottomTabScrollToTopState", "enabled", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeHomeTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "Home";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeHomeTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Home";
    }

    @Nullable
    public Boolean recordStartupTrace(@NotNull String eventName, @Nullable ReadableMap properties) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return null;
    }

    public void setHomeBottomTabScrollToTopState(boolean enabled, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void setHomeFeedRouteReadyState(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
