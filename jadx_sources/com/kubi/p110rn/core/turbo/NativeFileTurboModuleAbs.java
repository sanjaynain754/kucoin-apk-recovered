package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
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

/* JADX INFO: compiled from: NativeFileTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016JA\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0016¢\u0006\u0002\u0010\u0011JQ\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\t0\u000fH\u0016¢\u0006\u0002\u0010\u001bJD\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\t0\u000fH\u0016J\u001f\u0010\u001f\u001a\u00020 \"\b\b\u0000\u0010!*\u00020\"2\b\u0010#\u001a\u0004\u0018\u0001H!¢\u0006\u0002\u0010$¨\u0006&"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeFileTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "pickFile", "", "fileTypes", BridgeParamKeyKt.MAX_COUNT, "", "maxSize", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/rn/core/turbo/PickFileResult;", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)V", "previewFile", "isRemoteUrl", "", "fileUrl", "fileName", "headers", "Lcom/facebook/react/bridge/ReadableMap;", "allowShare", "Lcom/kubi/rn/core/turbo/FileActionResult;", "(ZLjava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "downloadFile", "url", "target", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeFileTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "File";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeFileTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public void downloadFile(@NotNull String url, @Nullable String fileName, @Nullable ReadableMap headers, @Nullable String target, @NotNull Function1<? super FileActionResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "File";
    }

    public void pickFile(@Nullable String fileTypes, @Nullable Double maxCount, @Nullable Double maxSize, @NotNull Function1<? super PickFileResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void previewFile(boolean isRemoteUrl, @NotNull String fileUrl, @Nullable String fileName, @Nullable ReadableMap headers, @Nullable Boolean allowShare, @NotNull Function1<? super FileActionResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
