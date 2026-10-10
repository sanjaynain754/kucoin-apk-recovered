package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeSecurityTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016J6\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\rH\u0016J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u001b\"\b\b\u0000\u0010\u001c*\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u0001H\u001c¢\u0006\u0002\u0010\u001f¨\u0006!"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSecurityTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "refreshTokenByManual", "", "refreshTimeLimit", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "advanceLivenessRecognition", AppsFlyerProperties.CHANNEL, "advanceToken", "bizType", "Lcom/kubi/rn/core/turbo/FaceResultInfo;", "handleSafeSecurityCallback", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "hasLogin", "()Ljava/lang/Boolean;", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeSecurityTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "Security";

    @Nullable
    public Boolean hasLogin() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSecurityTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public void advanceLivenessRecognition(@NotNull String channel, @NotNull String advanceToken, @NotNull String bizType, @NotNull Function1<? super FaceResultInfo, Unit> callback) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(advanceToken, "advanceToken");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Security";
    }

    @Nullable
    public Boolean handleSafeSecurityCallback(@NotNull ReadableMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return null;
    }

    public void refreshTokenByManual(double refreshTimeLimit, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
