package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeTrackTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J!\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\fJ+\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0012J'\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0019J\u001d\u0010\u001b\u001a\u0004\u0018\u00010\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001dH\u0016¢\u0006\u0002\u0010\u001eJ+\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010#J!\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010%\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010&J!\u0010'\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010&J!\u0010(\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010&J!\u0010)\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\fJ\u001f\u0010*\u001a\u00020+\"\b\b\u0000\u0010,*\u00020-2\b\u0010.\u001a\u0004\u0018\u0001H,¢\u0006\u0002\u0010/¨\u00061"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeTrackTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "afTrack", "", "eventId", ReportDataTable.COLUMN_PARAMS, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "kunlunTrack", "eventName", "dimensions", "Lcom/facebook/react/bridge/ReadableMap;", C33675gh.f70007m, "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "kunlunEventTrack", "category", "code", "", "(Ljava/lang/String;Ljava/lang/String;D)Ljava/lang/Boolean;", "kunlunBizTrack", "(Ljava/lang/String;D)Ljava/lang/Boolean;", "kunlunTechTrack", "setKunlunMonitorApis", "apiList", "", "(Ljava/util/List;)Ljava/lang/Boolean;", "kunlunLog", "message", FirebaseAnalytics.Param.LEVEL, "tag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "clsTrack", "content", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "fbTrack", "firebaseTrack", "firebaseAddBreadcrumb", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeTrackTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "Track";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeTrackTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Nullable
    public Boolean afTrack(@NotNull String eventId, @Nullable String params) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return null;
    }

    @Nullable
    public Boolean clsTrack(@NotNull String content, @Nullable ReadableMap dimensions) {
        Intrinsics.checkNotNullParameter(content, "content");
        return null;
    }

    @Nullable
    public Boolean fbTrack(@NotNull String eventName, @Nullable ReadableMap params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return null;
    }

    @Nullable
    public Boolean firebaseAddBreadcrumb(@NotNull String message, @Nullable String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        return null;
    }

    @Nullable
    public Boolean firebaseTrack(@NotNull String eventName, @Nullable ReadableMap params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Track";
    }

    @Nullable
    public Boolean kunlunBizTrack(@NotNull String category, double code) {
        Intrinsics.checkNotNullParameter(category, "category");
        return null;
    }

    @Nullable
    public Boolean kunlunEventTrack(@NotNull String eventName, @NotNull String category, double code) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(category, "category");
        return null;
    }

    @Nullable
    public Boolean kunlunLog(@NotNull String message, @Nullable String level, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        return null;
    }

    @Nullable
    public Boolean kunlunTechTrack(@NotNull String category, double code) {
        Intrinsics.checkNotNullParameter(category, "category");
        return null;
    }

    @Nullable
    public Boolean kunlunTrack(@NotNull String eventName, @Nullable ReadableMap dimensions, @Nullable ReadableMap metrics) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return null;
    }

    @Nullable
    public Boolean setKunlunMonitorApis(@NotNull List<String> apiList) {
        Intrinsics.checkNotNullParameter(apiList, "apiList");
        return null;
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
