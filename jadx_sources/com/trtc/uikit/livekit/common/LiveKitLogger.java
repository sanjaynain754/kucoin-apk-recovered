package com.trtc.uikit.livekit.common;

import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.p110rn.RNConstantKt;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.trtc.TRTCCloud;
import com.trtc.tuikit.common.system.ContextProvider;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveKitLogger.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003J\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "", RNConstantKt.PARAM_MODULE_NAME, "", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "info", "message", "warn", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "log", FirebaseAnalytics.Param.LEVEL, "", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveKitLogger {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f77564c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f77565a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f77566b;

    /* JADX INFO: compiled from: LiveKitLogger.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0007J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0007J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0007J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0007J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0007J(\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;", "", "<init>", "()V", "MODULE_LIVE_STREAM_CORE", "", "MODULE_SEAT_GRID_CORE", "MODULE_FEATURES", "MODULE_COMPONENT", "MODULE_COMMON", "API", "LOG_KEY_API", "LOG_KEY_PARAMS", "LOG_KEY_PARAMS_LEVEL", "LOG_KEY_PARAMS_MESSAGE", "LOG_KEY_PARAMS_FILE", "LOG_KEY_PARAMS_MODULE", "LOG_KEY_PARAMS_LINE", "LOG_LEVEL_INFO", "", "LOG_LEVEL_WARNING", "LOG_LEVEL_ERROR", "getLiveStreamLogger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "file", "getVoiceRoomLogger", "getFeaturesLogger", "getComponentLogger", "getCommonLogger", "log", "module", FirebaseAnalytics.Param.LEVEL, "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m79407a(String str, String str2, int i11, String str3) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("api", "TuikitLog");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(FirebaseAnalytics.Param.LEVEL, i11);
                jSONObject2.put("message", str3);
                jSONObject2.put("module", str);
                jSONObject2.put("file", str2);
                jSONObject2.put("line", 0);
                Unit unit = Unit.INSTANCE;
                jSONObject.put(ReportDataTable.COLUMN_PARAMS, jSONObject2);
                String string = jSONObject.toString();
                TRTCCloud.sharedInstance(ContextProvider.m79397b()).callExperimentalAPI(string);
                Intrinsics.checkNotNull(string);
                return string;
            } catch (JSONException e11) {
                return Integer.valueOf(Log.e("Logger", e11.toString()));
            }
        }

        @JvmStatic
        @NotNull
        public final LiveKitLogger getCommonLogger(@NotNull String file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new LiveKitLogger("KitCommon", file, null);
        }

        @JvmStatic
        @NotNull
        public final LiveKitLogger getComponentLogger(@NotNull String file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new LiveKitLogger("KitComponent", file, null);
        }

        @JvmStatic
        @NotNull
        public final LiveKitLogger getFeaturesLogger(@NotNull String file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new LiveKitLogger("KitFeatures", file, null);
        }

        @JvmStatic
        @NotNull
        public final LiveKitLogger getLiveStreamLogger(@NotNull String file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new LiveKitLogger("KitLiveStream", file, null);
        }

        @JvmStatic
        @NotNull
        public final LiveKitLogger getVoiceRoomLogger(@NotNull String file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new LiveKitLogger("KitVoiceRoom", file, null);
        }
    }

    public /* synthetic */ LiveKitLogger(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public LiveKitLogger(String str, String str2) {
        this.f77565a = str;
        this.f77566b = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Object m79403a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return m79405c(2, message);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Object m79404b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return m79405c(0, message);
    }

    /* JADX INFO: renamed from: c */
    public final Object m79405c(int i11, String str) {
        return f77564c.m79407a(this.f77565a, this.f77566b, i11, str);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Object m79406d(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return m79405c(1, message);
    }
}
