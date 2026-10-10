package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeLaunchTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0017\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rH\u0016J\u001f\u0010\u000e\u001a\u00020\u000f\"\b\b\u0000\u0010\u0010*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u0001H\u0010¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeLaunchTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "enterHome", "", "mode", "(Ljava/lang/String;)Ljava/lang/Boolean;", "supportedModes", "", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeLaunchTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "Launch";

    @Nullable
    public List<String> supportedModes() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLaunchTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Nullable
    public Boolean enterHome(@NotNull String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Launch";
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
