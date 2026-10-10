package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeSocketJsTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0019\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0010J\n\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016J\u001f\u0010\u0012\u001a\u00020\u0013\"\b\b\u0000\u0010\u0014*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u0001H\u0014¢\u0006\u0002\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSocketJsTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "createPlainSocketTask", "Lcom/facebook/react/bridge/ReadableMap;", "task", "createPollingSocketTask", "createHybridSocketHttpTask", "startTask", "pollImmediate", "", "(Ljava/lang/Boolean;)Lcom/facebook/react/bridge/ReadableMap;", "pauseTask", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeSocketJsTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "SocketJs";

    @Nullable
    public ReadableMap pauseTask() {
        return null;
    }

    @Nullable
    public ReadableMap startTask(@Nullable Boolean pollImmediate) {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSocketJsTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Nullable
    public ReadableMap createHybridSocketHttpTask(@NotNull ReadableMap task) {
        Intrinsics.checkNotNullParameter(task, "task");
        return null;
    }

    @Nullable
    public ReadableMap createPlainSocketTask(@NotNull ReadableMap task) {
        Intrinsics.checkNotNullParameter(task, "task");
        return null;
    }

    @Nullable
    public ReadableMap createPollingSocketTask(@NotNull ReadableMap task) {
        Intrinsics.checkNotNullParameter(task, "task");
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "SocketJs";
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
