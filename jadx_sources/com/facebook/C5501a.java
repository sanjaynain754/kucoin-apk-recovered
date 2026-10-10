package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.AccessToken;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.iap.C5536d;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppLinkManager;
import com.facebook.appevents.internal.C5539a;
import com.facebook.appevents.ondeviceprocessing.C5543a;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.C5758a;
import com.facebook.internal.C5759b;
import com.facebook.internal.C5760c;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p005a3.C0027a0;
import p333i6.C38451j;
import p333i6.C38457p;
import p394k6.C40922e;
import p464n6.C42757a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.facebook.a */
/* JADX INFO: compiled from: FacebookSdk.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002q@B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010 \u001a\u00020\u000eH\u0007¢\u0006\u0004\b \u0010\u0003J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0012H\u0007¢\u0006\u0004\b(\u0010\u0014J\u000f\u0010)\u001a\u00020\u0017H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0012H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0012H\u0003¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0012H\u0007¢\u0006\u0004\b0\u0010\u0014J\u0017\u00101\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0017H\u0007¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0004\b3\u0010\u001aJ\u000f\u00104\u001a\u00020\u0012H\u0007¢\u0006\u0004\b4\u0010\u0014J\u0011\u00105\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b5\u0010\u0014J\u000f\u00106\u001a\u00020\u0012H\u0007¢\u0006\u0004\b6\u0010\u0014J\u000f\u00107\u001a\u00020\nH\u0007¢\u0006\u0004\b7\u0010\fJ\u0017\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\nH\u0007¢\u0006\u0004\b9\u0010\u0010J\u000f\u0010:\u001a\u00020\nH\u0007¢\u0006\u0004\b:\u0010\fJ\u0017\u0010;\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\nH\u0007¢\u0006\u0004\b;\u0010\u0010J\u000f\u0010<\u001a\u00020\nH\u0007¢\u0006\u0004\b<\u0010\fJ\u000f\u0010=\u001a\u00020\nH\u0007¢\u0006\u0004\b=\u0010\fJ\u0017\u0010>\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\nH\u0007¢\u0006\u0004\b>\u0010\u0010R\u001c\u0010B\u001a\n ?*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010G\u001a\u0012\u0012\u0004\u0012\u00020!0Cj\b\u0012\u0004\u0012\u00020!`D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010,\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010AR\u0018\u0010M\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010AR\u0018\u0010O\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010AR\u0018\u0010R\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010WR\u0016\u0010Y\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010WR\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020[0Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010\\R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010^R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010-R\u0014\u0010c\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010bR\u0016\u0010d\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010AR\u0016\u0010e\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u0010WR\u0016\u0010f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u0010WR\u0016\u0010g\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u0010WR\u0014\u0010j\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010iR\u0016\u0010k\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010AR\u0016\u0010l\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010AR\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010nR\u0016\u0010p\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010W¨\u0006r"}, m90084d2 = {"Lcom/facebook/a;", "", "<init>", "()V", "Ljava/util/concurrent/Executor;", "t", "()Ljava/util/concurrent/Executor;", "", "y", "()J", "", "B", "()Z", "enabled", "", ExifInterface.LONGITUDE_WEST, "(Z)V", ExifInterface.LONGITUDE_EAST, "", "v", "()Ljava/lang/String;", "C", "u", "Landroid/content/Context;", "applicationContext", "K", "(Landroid/content/Context;)V", "Lcom/facebook/a$b;", TUIConstants.TUIChat.CALL_BACK, "L", "(Landroid/content/Context;Lcom/facebook/a$b;)V", "D", "k", "Lcom/facebook/LoggingBehavior;", "behavior", "j", "(Lcom/facebook/LoggingBehavior;)V", "F", "(Lcom/facebook/LoggingBehavior;)Z", "X", "w", "m", "()Landroid/content/Context;", "context", "applicationId", "I", "(Landroid/content/Context;Ljava/lang/String;)V", "H", "z", "x", "(Landroid/content/Context;)Z", "G", "n", "o", "r", "p", "flag", "U", "q", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, CmcdData.Factory.STREAMING_FORMAT_SS, CmcdData.Factory.STREAM_TYPE_LIVE, ExifInterface.GPS_DIRECTION_TRUE, "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "c", "Ljava/util/HashSet;", "loggingBehaviors", "d", "Ljava/util/concurrent/Executor;", "executor", "e", "f", "applicationName", "g", "appClientToken", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/lang/Boolean;", "codelessDebugLogEnabled", "Ljava/util/concurrent/atomic/AtomicLong;", "i", "Ljava/util/concurrent/atomic/AtomicLong;", "onProgressThreshold", "Z", "isDebugEnabledField", "isLegacyTokenUpgradeSupported", "Li6/j;", "Ljava/io/File;", "Li6/j;", "cacheDir", "Landroid/content/Context;", "", "callbackRequestCodeOffset", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "LOCK", "graphApiVersion", "hasCustomTabsPrefetching", "ignoreAppSwitchToLoggedOut", "bypassAppSwitch", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sdkInitialized", "instagramDomain", "facebookDomain", "Lcom/facebook/a$a;", "Lcom/facebook/a$a;", "graphRequestCreator", "isFullyInitialized", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFacebookSdk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacebookSdk.kt\ncom/facebook/FacebookSdk\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1142:1\n1#2:1143\n*E\n"})
public final class C5501a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static Executor executor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static volatile String applicationId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static volatile String applicationName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static volatile String appClientToken;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public static volatile Boolean codelessDebugLogEnabled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static volatile boolean isDebugEnabledField;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static boolean isLegacyTokenUpgradeSupported;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static C38451j<File> cacheDir;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static Context applicationContext;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @JvmField
    public static boolean hasCustomTabsPrefetching;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @JvmField
    public static boolean ignoreAppSwitchToLoggedOut;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @JvmField
    public static boolean bypassAppSwitch;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public static boolean isFullyInitialized;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5501a f7617a = new C5501a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C5501a.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<LoggingBehavior> loggingBehaviors = SetsKt.hashSetOf(LoggingBehavior.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static AtomicLong onProgressThreshold = new AtomicLong(65536);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public static int callbackRequestCodeOffset = 64206;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static final ReentrantLock LOCK = new ReentrantLock();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public static String graphApiVersion = C5759b.m10037a();

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean sdkInitialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public static volatile String instagramDomain = "instagram.com";

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public static volatile String facebookDomain = "facebook.com";

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public static a graphRequestCreator = new a() { // from class: z2.f
        @Override // com.facebook.C5501a.a
        /* JADX INFO: renamed from: a */
        public final GraphRequest mo7815a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC5490b interfaceC5490b) {
            return C5501a.m7765A(accessToken, str, jSONObject, interfaceC5490b);
        }
    };

    /* JADX INFO: renamed from: com.facebook.a$a */
    /* JADX INFO: compiled from: FacebookSdk.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bá\u0080\u0001\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/facebook/a$a;", "", "Lcom/facebook/AccessToken;", "accessToken", "", "publishUrl", "Lorg/json/JSONObject;", "publishParams", "Lcom/facebook/GraphRequest$b;", TUIConstants.TUIChat.CALL_BACK, "Lcom/facebook/GraphRequest;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @VisibleForTesting
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        GraphRequest mo7815a(@Nullable AccessToken accessToken, @Nullable String publishUrl, @Nullable JSONObject publishParams, @Nullable GraphRequest.InterfaceC5490b callback);
    }

    /* JADX INFO: renamed from: com.facebook.a$b */
    /* JADX INFO: compiled from: FacebookSdk.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/facebook/a$b;", "", "", "onInitialized", "()V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface b {
        void onInitialized();
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m7797k() {
        isFullyInitialized = true;
    }

    /* JADX INFO: renamed from: A */
    public static final GraphRequest m7765A(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC5490b interfaceC5490b) {
        return GraphRequest.INSTANCE.newPostRequest(accessToken, str, jSONObject, interfaceC5490b);
    }

    @JvmStatic
    /* JADX INFO: renamed from: B */
    public static final boolean m7766B() {
        return isDebugEnabledField;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: C */
    public static final synchronized boolean m7767C() {
        return isFullyInitialized;
    }

    @JvmStatic
    /* JADX INFO: renamed from: D */
    public static final boolean m7768D() {
        return sdkInitialized.get();
    }

    @JvmStatic
    /* JADX INFO: renamed from: E */
    public static final boolean m7769E() {
        return isLegacyTokenUpgradeSupported;
    }

    @JvmStatic
    /* JADX INFO: renamed from: F */
    public static final boolean m7770F(@NotNull LoggingBehavior behavior) {
        boolean z11;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            z11 = m7766B() && hashSet.contains(behavior);
        }
        return z11;
    }

    @JvmStatic
    /* JADX INFO: renamed from: G */
    public static final void m7771G(@Nullable Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n                co…     return\n            }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (applicationId == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (StringsKt.startsWith$default(lowerCase, "fb", false, 2, (Object) null)) {
                        String strSubstring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        applicationId = strSubstring;
                    } else {
                        applicationId = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (applicationName == null) {
                applicationName = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (appClientToken == null) {
                appClientToken = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (callbackRequestCodeOffset == 64206) {
                callbackRequestCodeOffset = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (codelessDebugLogEnabled == null) {
                codelessDebugLogEnabled = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 3)
    /* JADX INFO: renamed from: I */
    public static final void m7772I(@NotNull Context context, @NotNull final String applicationId2) {
        if (C42757a.m93689d(C5501a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId2, "applicationId");
            final Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 == null) {
                return;
            }
            if (!C5758a.m10026d("app_events_killswitch", m7800n(), false)) {
                m7806t().execute(new Runnable() { // from class: z2.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5501a.m7773J(applicationContext2, applicationId2);
                    }
                });
            }
            if (FeatureManager.m9939g(FeatureManager.Feature.OnDeviceEventProcessing) && C5543a.m8338d()) {
                C5543a.m8341g(applicationId2, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5501a.class);
        }
    }

    /* JADX INFO: renamed from: J */
    public static final void m7773J(Context applicationContext2, String applicationId2) {
        Intrinsics.checkNotNullParameter(applicationContext2, "$applicationContext");
        Intrinsics.checkNotNullParameter(applicationId2, "$applicationId");
        f7617a.m7813H(applicationContext2, applicationId2);
    }

    @Deprecated(message = "")
    @JvmStatic
    /* JADX INFO: renamed from: K */
    public static final synchronized void m7774K(@NotNull Context applicationContext2) {
        Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
        m7775L(applicationContext2, null);
    }

    @Deprecated(message = "")
    @JvmStatic
    /* JADX INFO: renamed from: L */
    public static final synchronized void m7775L(@NotNull Context applicationContext2, @Nullable final b callback) {
        Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
        AtomicBoolean atomicBoolean = sdkInitialized;
        if (atomicBoolean.get()) {
            if (callback != null) {
                callback.onInitialized();
            }
            return;
        }
        C38457p.m86723b(applicationContext2, false);
        C38457p.m86724c(applicationContext2, false);
        Context applicationContext3 = applicationContext2.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "applicationContext.applicationContext");
        applicationContext = applicationContext3;
        AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(applicationContext2);
        Context context = applicationContext;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context = null;
        }
        m7771G(context);
        String str = applicationId;
        if (str == null || str.length() == 0) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = appClientToken;
        if (str2 == null || str2.length() == 0) {
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        atomicBoolean.set(true);
        if (m7802p()) {
            m7797k();
        }
        Context context3 = applicationContext;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context3 = null;
        }
        if ((context3 instanceof Application) && C5567d.m8560f()) {
            Context context4 = applicationContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context4 = null;
            }
            C5539a.m8278z((Application) context4, applicationId);
        } else {
            C5536d.m8212i();
        }
        AppLinkManager companion = AppLinkManager.INSTANCE.getInstance();
        if (companion != null) {
            Context context5 = applicationContext;
            if (context5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context5 = null;
            }
            companion.m8241i((Application) context5);
        }
        FetchedAppSettingsManager.m9977h();
        NativeProtocol.m10009m();
        BoltsMeasurementEventListener.Companion companion2 = BoltsMeasurementEventListener.INSTANCE;
        Context context6 = applicationContext;
        if (context6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        } else {
            context2 = context6;
        }
        companion2.getInstance(context2);
        cacheDir = new C38451j<>(new Callable() { // from class: z2.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5501a.m7776M();
            }
        });
        FeatureManager.m9936a(FeatureManager.Feature.Instrument, new FeatureManager.InterfaceC5749a() { // from class: z2.h
            @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
            /* JADX INFO: renamed from: a */
            public final void mo81a(boolean z11) {
                C5501a.m7777N(z11);
            }
        });
        FeatureManager.m9936a(FeatureManager.Feature.AppEvents, new FeatureManager.InterfaceC5749a() { // from class: z2.i
            @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
            /* JADX INFO: renamed from: a */
            public final void mo81a(boolean z11) {
                C5501a.m7778O(z11);
            }
        });
        FeatureManager.m9936a(FeatureManager.Feature.ChromeCustomTabsPrefetching, new FeatureManager.InterfaceC5749a() { // from class: z2.j
            @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
            /* JADX INFO: renamed from: a */
            public final void mo81a(boolean z11) {
                C5501a.m7779P(z11);
            }
        });
        FeatureManager.m9936a(FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, new FeatureManager.InterfaceC5749a() { // from class: z2.k
            @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
            /* JADX INFO: renamed from: a */
            public final void mo81a(boolean z11) {
                C5501a.m7780Q(z11);
            }
        });
        FeatureManager.m9936a(FeatureManager.Feature.BypassAppSwitch, new FeatureManager.InterfaceC5749a() { // from class: z2.l
            @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
            /* JADX INFO: renamed from: a */
            public final void mo81a(boolean z11) {
                C5501a.m7781R(z11);
            }
        });
        m7806t().execute(new FutureTask(new Callable() { // from class: z2.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5501a.m7782S(callback);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public static final File m7776M() {
        Context context = applicationContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context = null;
        }
        return context.getCacheDir();
    }

    /* JADX INFO: renamed from: N */
    public static final void m7777N(boolean z11) {
        if (z11) {
            C40922e.m89618d();
        }
    }

    /* JADX INFO: renamed from: O */
    public static final void m7778O(boolean z11) {
        if (z11) {
            C0027a0.m41a();
        }
    }

    /* JADX INFO: renamed from: P */
    public static final void m7779P(boolean z11) {
        if (z11) {
            hasCustomTabsPrefetching = true;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final void m7780Q(boolean z11) {
        if (z11) {
            ignoreAppSwitchToLoggedOut = true;
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m7781R(boolean z11) {
        if (z11) {
            bypassAppSwitch = true;
        }
    }

    /* JADX INFO: renamed from: S */
    public static final Void m7782S(b bVar) {
        AccessTokenManager.INSTANCE.getInstance().m7588j();
        ProfileManager.INSTANCE.getInstance().m7761d();
        if (AccessToken.INSTANCE.isCurrentAccessTokenActive()) {
            Profile.Companion companion = Profile.INSTANCE;
            if (companion.getCurrentProfile() == null) {
                companion.fetchProfileForCurrentAccessToken();
            }
        }
        if (bVar != null) {
            bVar.onInitialized();
        }
        AppEventsLogger.Companion companion2 = AppEventsLogger.INSTANCE;
        companion2.initializeLib(m7799m(), applicationId);
        C5567d.m8563n();
        Context applicationContext2 = m7799m().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext().applicationContext");
        companion2.newLogger(applicationContext2).m7840a();
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: W */
    public static final void m7786W(boolean enabled) {
        isDebugEnabledField = enabled;
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m7796j(@NotNull LoggingBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.add(behavior);
            f7617a.m7814X();
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: t */
    public static final Executor m7806t() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: u */
    public static final String m7807u() {
        return facebookDomain;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: v */
    public static final String m7808v() {
        String str = TAG;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        C5760c.m10065e0(str, str2);
        return graphApiVersion;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: w */
    public static final String m7809w() {
        AccessToken currentAccessToken = AccessToken.INSTANCE.getCurrentAccessToken();
        return C5760c.m10043D(currentAccessToken != null ? currentAccessToken.getGraphDomain() : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: x */
    public static final boolean m7810x(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C38457p.m86730i();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: z */
    public static final String m7812z() {
        return "18.0.2";
    }

    /* JADX INFO: renamed from: X */
    public final void m7814X() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        if (hashSet.contains(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
            if (hashSet.contains(loggingBehavior)) {
                return;
            }
            hashSet.add(loggingBehavior);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: T */
    public static final void m7783T(boolean flag) {
        C5567d.m8565s(flag);
    }

    @JvmStatic
    /* JADX INFO: renamed from: U */
    public static final void m7784U(boolean flag) {
        C5567d.m8566t(flag);
        if (flag) {
            m7797k();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: V */
    public static final void m7785V(boolean flag) {
        C5567d.m8567u(flag);
        if (flag) {
            Context contextM7799m = m7799m();
            Intrinsics.checkNotNull(contextM7799m, "null cannot be cast to non-null type android.app.Application");
            C5539a.m8278z((Application) contextM7799m, m7800n());
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m7798l() {
        return C5567d.m8558d();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final Context m7799m() {
        C38457p.m86730i();
        Context context = applicationContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            return null;
        }
        return context;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m7800n() {
        C38457p.m86730i();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: o */
    public static final String m7801o() {
        C38457p.m86730i();
        return applicationName;
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m7802p() {
        return C5567d.m8559e();
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final boolean m7803q() {
        return C5567d.m8560f();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: r */
    public static final String m7804r() {
        C38457p.m86730i();
        String str = appClientToken;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final boolean m7805s() {
        return C5567d.m8561g();
    }

    @JvmStatic
    /* JADX INFO: renamed from: y */
    public static final long m7811y() {
        C38457p.m86730i();
        return onProgressThreshold.get();
    }

    /* JADX INFO: renamed from: H */
    public final void m7813H(Context context, String applicationId2) {
        try {
            if (!C42757a.m93689d(this)) {
                try {
                    AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String str = applicationId2 + "ping";
                    long j11 = sharedPreferences.getLong(str, 0L);
                    try {
                        JSONObject jSONObjectM8231a = AppEventsLoggerUtility.m8231a(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionIdentifiers, AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(context), m7810x(context), context);
                        String installReferrer = AppEventsLoggerImpl.INSTANCE.getInstallReferrer();
                        if (installReferrer != null) {
                            jSONObjectM8231a.put("install_referrer", installReferrer);
                        }
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str2 = String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId2}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                        GraphRequest graphRequestMo7815a = graphRequestCreator.mo7815a(null, str2, jSONObjectM8231a, null);
                        if (j11 == 0 && graphRequestMo7815a.m7656l().getError() == null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putLong(str, System.currentTimeMillis());
                            editorEdit.apply();
                            Logger.Companion companion = Logger.INSTANCE;
                            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                            String TAG2 = TAG;
                            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                            companion.log(loggingBehavior, TAG2, "MOBILE_APP_INSTALL has been logged");
                        }
                    } catch (JSONException e11) {
                        throw new FacebookException("An error occurred while publishing install.", e11);
                    }
                } catch (Exception e12) {
                    C5760c.m10063d0("Facebook-publish", e12);
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
