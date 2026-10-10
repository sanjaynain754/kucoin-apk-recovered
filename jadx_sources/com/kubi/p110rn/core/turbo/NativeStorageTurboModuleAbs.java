package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.kubi.p110rn.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeStorageTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J)\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J!\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u0018\"\b\b\u0000\u0010\u0019*\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u0001H\u0019¢\u0006\u0002\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeStorageTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "setItem", "", "key", "value", "Lcom/facebook/react/bridge/ReadableMap;", Constants.BIZ, "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Boolean;", "getItem", "removeItem", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "containsKey", "getAllKeys", "", "clear", "(Ljava/lang/String;)Ljava/lang/Boolean;", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeStorageTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "Storage";

    @Nullable
    public Boolean clear(@Nullable String biz) {
        return null;
    }

    @Nullable
    public List<String> getAllKeys(@Nullable String biz) {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeStorageTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Nullable
    public Boolean containsKey(@NotNull String key, @Nullable String biz) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Nullable
    public ReadableMap getItem(@NotNull String key, @Nullable String biz) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Storage";
    }

    @Nullable
    public Boolean removeItem(@NotNull String key, @Nullable String biz) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Nullable
    public Boolean setItem(@NotNull String key, @NotNull ReadableMap value, @Nullable String biz) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return null;
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
