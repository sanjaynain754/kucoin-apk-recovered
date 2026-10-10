package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.user.protocol.entity.SignTermItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeShareTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u008f\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u0018H\u0016¢\u0006\u0002\u0010\u0019J&\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00072\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u0018H\u0016J?\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u0018H\u0016¢\u0006\u0002\u0010\u001fJ&\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u0018H\u0016J\u001f\u0010\"\u001a\u00020#\"\b\b\u0000\u0010$*\u00020%2\b\u0010\u0015\u001a\u0004\u0018\u0001H$¢\u0006\u0002\u0010&¨\u0006("}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeShareTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", FirebaseAnalytics.Event.SHARE, "", "category", "utmSource", "rcode", BridgeParamKeyKt.SHARE_KEY_PIC, "qrCodeUrl", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "", "onlyDarkMode", "title", "content", BridgeParamKeyKt.SHARE_KEY_LINKURL, "data", "Lcom/facebook/react/bridge/ReadableMap;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/jvm/functions/Function1;)V", "saveShareImage", "imgData", "showShareView", SignTermItem.LINK, "isCopyText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "shareWithOptions", "options", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeShareTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "Share";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShareTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Share";
    }

    public void saveShareImage(@NotNull String imgData, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(imgData, "imgData");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void share(@NotNull String category, @Nullable String utmSource, @Nullable String rcode, @Nullable String pic, @Nullable String qrCodeUrl, @Nullable Boolean needQrCode, @Nullable Boolean onlyDarkMode, @Nullable String title, @Nullable String content, @Nullable String linkUrl, @Nullable ReadableMap data, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void shareWithOptions(@NotNull ReadableMap options, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void showShareView(@NotNull String content, @Nullable String link, @Nullable Boolean isCopyText, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
