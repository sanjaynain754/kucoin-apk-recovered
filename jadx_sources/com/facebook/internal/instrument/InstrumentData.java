package com.facebook.internal.instrument;

import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.C5760c;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.proguard.AbstractC34022xe;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p394k6.C40926i;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: InstrumentData.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 32\u00020\u0001:\u0003\u001945B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0012\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB\u001d\b\u0012\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0004\u0010\u000eB\u0011\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0018\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0018\u0010'\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0011\u0010-\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b&\u0010,R\u0016\u00100\u001a\u0004\u0018\u00010.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010/R\u0016\u00101\u001a\u0004\u0018\u00010.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010/R\u0016\u00102\u001a\u0004\u0018\u00010.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010/¨\u00066"}, m90084d2 = {"Lcom/facebook/internal/instrument/InstrumentData;", "", "Lorg/json/JSONArray;", AbstractC34022xe.f72514e, "<init>", "(Lorg/json/JSONArray;)V", "", "e", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "t", "(Ljava/lang/Throwable;Lcom/facebook/internal/instrument/InstrumentData$Type;)V", "", "anrCause", CmcdConfiguration.KEY_STREAM_TYPE, "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "data", "", "b", "(Lcom/facebook/internal/instrument/InstrumentData;)I", "", "g", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "filename", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "type", "c", "Lorg/json/JSONArray;", "featureNames", "d", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "cause", "f", "stackTrace", "", "Ljava/lang/Long;", "timestamp", "", "()Z", "isValid", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "parameters", "analysisReportParameters", "exceptionReportParameters", CmcdData.Factory.STREAMING_FORMAT_HLS, "Companion", "Type", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InstrumentData {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String filename;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Type type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public JSONArray featureNames;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String appVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public String cause;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public String stackTrace;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Long timestamp;

    /* JADX INFO: compiled from: InstrumentData.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Companion;", "", "<init>", "()V", "", "filename", "Lcom/facebook/internal/instrument/InstrumentData$Type;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lcom/facebook/internal/instrument/InstrumentData$Type;", "PARAM_APP_VERSION", "Ljava/lang/String;", "PARAM_CALLSTACK", "PARAM_DEVICE_MODEL", "PARAM_DEVICE_OS", "PARAM_FEATURE_NAMES", "PARAM_REASON", "PARAM_TIMESTAMP", "PARAM_TYPE", "UNKNOWN", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Type m10122a(String filename) {
            if (StringsKt.startsWith$default(filename, "crash_log_", false, 2, (Object) null)) {
                return Type.CrashReport;
            }
            if (StringsKt.startsWith$default(filename, "shield_log_", false, 2, (Object) null)) {
                return Type.CrashShield;
            }
            if (StringsKt.startsWith$default(filename, "thread_check_log_", false, 2, (Object) null)) {
                return Type.ThreadCheck;
            }
            if (StringsKt.startsWith$default(filename, "analysis_log_", false, 2, (Object) null)) {
                return Type.Analysis;
            }
            return StringsKt.startsWith$default(filename, "anr_log_", false, 2, (Object) null) ? Type.AnrReport : Type.Unknown;
        }
    }

    /* JADX INFO: compiled from: InstrumentData.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Type;", "", "(Ljava/lang/String;I)V", "logPrefix", "", "getLogPrefix", "()Ljava/lang/String;", "toString", "Unknown", "Analysis", "AnrReport", "CrashReport", "CrashShield", "ThreadCheck", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* JADX INFO: renamed from: com.facebook.internal.instrument.InstrumentData$Type$a */
        /* JADX INFO: compiled from: InstrumentData.kt */
        @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
        public /* synthetic */ class C5761a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.Analysis.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.AnrReport.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Type.CrashReport.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Type.CrashShield.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Type.ThreadCheck.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @NotNull
        public final String getLogPrefix() {
            int i11 = C5761a.$EnumSwitchMapping$0[ordinal()];
            if (i11 == 1) {
                return "analysis_log_";
            }
            if (i11 == 2) {
                return "anr_log_";
            }
            if (i11 == 3) {
                return "crash_log_";
            }
            if (i11 != 4) {
                return i11 != 5 ? "Unknown" : "thread_check_log_";
            }
            return "shield_log_";
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            int i11 = C5761a.$EnumSwitchMapping$0[ordinal()];
            if (i11 == 1) {
                return "Analysis";
            }
            if (i11 == 2) {
                return "AnrReport";
            }
            if (i11 == 3) {
                return "CrashReport";
            }
            if (i11 != 4) {
                return i11 != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.instrument.InstrumentData$a */
    /* JADX INFO: compiled from: InstrumentData.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/internal/instrument/InstrumentData$a;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lcom/facebook/internal/instrument/InstrumentData;", "d", "(Ljava/io/File;)Lcom/facebook/internal/instrument/InstrumentData;", "", "e", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "t", "b", "(Ljava/lang/Throwable;Lcom/facebook/internal/instrument/InstrumentData$Type;)Lcom/facebook/internal/instrument/InstrumentData;", "Lorg/json/JSONArray;", AbstractC34022xe.f72514e, "c", "(Lorg/json/JSONArray;)Lcom/facebook/internal/instrument/InstrumentData;", "", "anrCause", CmcdConfiguration.KEY_STREAM_TYPE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/internal/instrument/InstrumentData;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5762a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C5762a f9668a = new C5762a();

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public static final InstrumentData m10124a(@Nullable String anrCause, @Nullable String st2) {
            return new InstrumentData(anrCause, st2, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public static final InstrumentData m10126c(@NotNull JSONArray features) {
            Intrinsics.checkNotNullParameter(features, "features");
            return new InstrumentData(features, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public static final InstrumentData m10127d(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new InstrumentData(file, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public static final InstrumentData m10125b(@Nullable Throwable e11, @NotNull Type t11) {
            Intrinsics.checkNotNullParameter(t11, "t");
            return new InstrumentData(e11, t11, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ InstrumentData(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    /* JADX INFO: renamed from: com.facebook.internal.instrument.InstrumentData$b */
    /* JADX INFO: compiled from: InstrumentData.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class C5763b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Analysis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.AnrReport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ InstrumentData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m10115a() {
        C40926i.m89625d(this.filename);
    }

    /* JADX INFO: renamed from: b */
    public final int m10116b(@NotNull InstrumentData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l11 = this.timestamp;
        if (l11 == null) {
            return -1;
        }
        long jLongValue = l11.longValue();
        Long l12 = data.timestamp;
        if (l12 != null) {
            return Intrinsics.compare(l12.longValue(), jLongValue);
        }
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m10117c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.featureNames;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l11 = this.timestamp;
            if (l11 != null) {
                jSONObject.put("timestamp", l11);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m10118d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put(TPDownloadProxyEnum.USER_DEVICE_MODEL, Build.MODEL);
            String str = this.appVersion;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l11 = this.timestamp;
            if (l11 != null) {
                jSONObject.put("timestamp", l11);
            }
            String str2 = this.cause;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.stackTrace;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            Type type = this.type;
            if (type != null) {
                jSONObject.put("type", type);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m10119e() {
        Type type = this.type;
        int i11 = type == null ? -1 : C5763b.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            return m10117c();
        }
        if (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) {
            return m10118d();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10120f() {
        Type type = this.type;
        int i11 = type == null ? -1 : C5763b.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            return (this.featureNames == null || this.timestamp == null) ? false : true;
        }
        if (i11 != 2) {
            return ((i11 != 3 && i11 != 4 && i11 != 5) || this.stackTrace == null || this.timestamp == null) ? false : true;
        }
        return (this.stackTrace == null || this.cause == null || this.timestamp == null) ? false : true;
    }

    public /* synthetic */ InstrumentData(Throwable th2, Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, type);
    }

    /* JADX INFO: renamed from: g */
    public final void m10121g() {
        if (!m10120f()) {
            return;
        }
        C40926i.m89641t(this.filename, toString());
    }

    @NotNull
    public String toString() {
        JSONObject jSONObjectM10119e = m10119e();
        if (jSONObjectM10119e == null) {
            String string = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject().toString()");
            return string;
        }
        String string2 = jSONObjectM10119e.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "params.toString()");
        return string2;
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    public InstrumentData(JSONArray jSONArray) {
        this.type = Type.Analysis;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.featureNames = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n         …)\n            .toString()");
        this.filename = string;
    }

    public InstrumentData(Throwable th2, Type type) {
        this.type = type;
        this.appVersion = C5760c.m10087u();
        this.cause = C40926i.m89626e(th2);
        this.stackTrace = C40926i.m89629h(th2);
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(type.getLogPrefix());
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.filename = string;
    }

    public InstrumentData(String str, String str2) {
        this.type = Type.AnrReport;
        this.appVersion = C5760c.m10087u();
        this.cause = str;
        this.stackTrace = str2;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n         …)\n            .toString()");
        this.filename = string;
    }

    public InstrumentData(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.filename = name;
        this.type = INSTANCE.m10122a(name);
        JSONObject jSONObjectM89639r = C40926i.m89639r(this.filename, true);
        if (jSONObjectM89639r != null) {
            this.timestamp = Long.valueOf(jSONObjectM89639r.optLong("timestamp", 0L));
            this.appVersion = jSONObjectM89639r.optString("app_version", null);
            this.cause = jSONObjectM89639r.optString("reason", null);
            this.stackTrace = jSONObjectM89639r.optString("callstack", null);
            this.featureNames = jSONObjectM89639r.optJSONArray("feature_names");
        }
    }
}
