package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeQrScanTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t0\fH\u0016J4\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\fH\u0016J\u001f\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\u0016*\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u0001H\u0016¢\u0006\u0002\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeQrScanTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "openQrScan", "", "bizType", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "scanQrCode", "supportedTypes", "", "", "callerHandlesUnknownCode", "", "Lcom/kubi/rn/core/turbo/ScanQrCodeResult;", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeQrScanTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "QrScan";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeQrScanTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "QrScan";
    }

    public void openQrScan(@Nullable String bizType, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void scanQrCode(@NotNull List<Double> supportedTypes, boolean callerHandlesUnknownCode, @NotNull Function1<? super ScanQrCodeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
