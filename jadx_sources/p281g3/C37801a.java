package p281g3;

import android.adservices.common.AdData;
import android.adservices.customaudience.CustomAudience;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.p018os.OutcomeReceiver;
import android.util.Log;
import androidx.core.os.C1708b;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.GpsDebugLogger;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p708w.C45669a;
import p708w.C45671c;
import p743x.C45963a;
import p743x.C45964b;
import p743x.C45965c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: g3.a */
/* JADX INFO: compiled from: PACustomAudienceClient.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lg3/a;", "", "<init>", "()V", "", "c", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "Lcom/facebook/appevents/AppEvent;", "event", "d", "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)V", "e", "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)Ljava/lang/String;", "b", "Ljava/lang/String;", "TAG", "", "Z", "enabled", "Lx/a;", "Lx/a;", "customAudienceManager", "Lcom/facebook/appevents/gps/GpsDebugLogger;", "Lcom/facebook/appevents/gps/GpsDebugLogger;", "gpsDebugLogger", "f", "baseUri", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPACustomAudienceClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PACustomAudienceClient.kt\ncom/facebook/appevents/gps/pa/PACustomAudienceClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,148:1\n1#2:149\n29#3:150\n29#3:151\n29#3:152\n29#3:153\n*S KotlinDebug\n*F\n+ 1 PACustomAudienceClient.kt\ncom/facebook/appevents/gps/pa/PACustomAudienceClient\n*L\n106#1:150\n110#1:151\n118#1:152\n119#1:153\n*E\n"})
public final class C37801a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37801a f85158a = new C37801a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String TAG = "Fledge: " + C37801a.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static C45963a customAudienceManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static GpsDebugLogger gpsDebugLogger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static String baseUri;

    /* JADX INFO: renamed from: g3.a$a */
    /* JADX INFO: compiled from: PACustomAudienceClient.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00062\n\u0010\t\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"g3/a$a", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", DbParams.KEY_CHANNEL_RESULT, "", "onResult", "(Ljava/lang/Object;)V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Exception;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements OutcomeReceiver {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.e(C37801a.m85297b(), error.toString());
            GpsDebugLogger gpsDebugLoggerM85296a = C37801a.m85296a();
            if (gpsDebugLoggerM85296a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                gpsDebugLoggerM85296a = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", error.toString());
            Unit unit = Unit.INSTANCE;
            gpsDebugLoggerM85296a.m8108b("gps_pa_failed", bundle);
        }

        public void onResult(@NotNull Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Log.i(C37801a.m85297b(), "Successfully joined custom audience");
            GpsDebugLogger gpsDebugLoggerM85296a = C37801a.m85296a();
            if (gpsDebugLoggerM85296a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                gpsDebugLoggerM85296a = null;
            }
            gpsDebugLoggerM85296a.m8108b("gps_pa_succeed", null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ GpsDebugLogger m85296a() {
        if (C42757a.m93689d(C37801a.class)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C37801a.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ String m85297b() {
        if (C42757a.m93689d(C37801a.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C37801a.class);
            return null;
        }
    }

    @JvmStatic
    @TargetApi(34)
    /* JADX INFO: renamed from: c */
    public static final void m85298c() {
        String string;
        if (C42757a.m93689d(C37801a.class)) {
            return;
        }
        try {
            Context contextM7799m = C5501a.m7799m();
            gpsDebugLogger = new GpsDebugLogger(contextM7799m);
            baseUri = "https://www." + C5501a.m7807u() + "/privacy_sandbox/pa/logic";
            GpsDebugLogger gpsDebugLogger2 = null;
            try {
                try {
                    C45963a c45963aM101400a = C45963a.m101400a(contextM7799m);
                    customAudienceManager = c45963aM101400a;
                    if (c45963aM101400a != null) {
                        enabled = true;
                    }
                    string = null;
                } catch (Exception e11) {
                    string = e11.toString();
                    Log.w(TAG, "Failed to get CustomAudienceManager: " + e11);
                }
            } catch (NoClassDefFoundError e12) {
                string = e12.toString();
                Log.w(TAG, "Failed to get CustomAudienceManager: " + e12);
            } catch (NoSuchMethodError e13) {
                string = e13.toString();
                Log.w(TAG, "Failed to get CustomAudienceManager: " + e13);
            }
            if (enabled) {
                return;
            }
            GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
            if (gpsDebugLogger3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
            } else {
                gpsDebugLogger2 = gpsDebugLogger3;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            Unit unit = Unit.INSTANCE;
            gpsDebugLogger2.m8108b("gps_pa_failed", bundle);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C37801a.class);
        }
    }

    @TargetApi(34)
    /* JADX INFO: renamed from: d */
    public final void m85299d(@NotNull String appId, @NotNull AppEvent event) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (enabled) {
                OutcomeReceiver outcomeReceiverM2427a = C1708b.m2427a(new a());
                GpsDebugLogger gpsDebugLogger2 = null;
                try {
                    String strM85300e = m85300e(appId, event);
                    if (strM85300e == null) {
                        return;
                    }
                    AdData.Builder builder = new AdData.Builder();
                    StringBuilder sb2 = new StringBuilder();
                    String str = baseUri;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                        str = null;
                    }
                    sb2.append(str);
                    sb2.append("/ad");
                    Uri uri = Uri.parse(sb2.toString());
                    Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
                    builder.m1525c(uri).m1524b("{'isRealAd': false}").m1523a();
                    C45965c.a aVar = new C45965c.a();
                    StringBuilder sb3 = new StringBuilder();
                    String str2 = baseUri;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                        str2 = null;
                    }
                    sb3.append(str2);
                    sb3.append("?trusted_bidding");
                    Uri uri2 = Uri.parse(sb3.toString());
                    Intrinsics.checkExpressionValueIsNotNull(uri2, "Uri.parse(this)");
                    aVar.m101406c(uri2).m101405b(CollectionsKt.listOf("")).m101404a();
                    CustomAudience.Builder builderM1531f = new CustomAudience.Builder().m1531f(strM85300e);
                    C45671c.m100784a("facebook.com");
                    CustomAudience.Builder builderM1529d = builderM1531f.m1529d(null);
                    StringBuilder sb4 = new StringBuilder();
                    String str3 = baseUri;
                    if (str3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                        str3 = null;
                    }
                    sb4.append(str3);
                    sb4.append("?daily&app_id=");
                    sb4.append(appId);
                    Uri uri3 = Uri.parse(sb4.toString());
                    Intrinsics.checkExpressionValueIsNotNull(uri3, "Uri.parse(this)");
                    CustomAudience.Builder builderM1530e = builderM1529d.m1530e(uri3);
                    StringBuilder sb5 = new StringBuilder();
                    String str4 = baseUri;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                        str4 = null;
                    }
                    sb5.append(str4);
                    sb5.append("?bidding");
                    Uri uri4 = Uri.parse(sb5.toString());
                    Intrinsics.checkExpressionValueIsNotNull(uri4, "Uri.parse(this)");
                    CustomAudience.Builder builderM1532g = builderM1530e.m1528c(uri4).m1532g(null);
                    C45669a.m100783a("{}");
                    builderM1532g.m1533h(null).m1527b(CollectionsKt.listOf((Object) null)).m1526a();
                    Intrinsics.checkNotNullExpressionValue(null, "Builder()\n              …(listOf(dummyAd)).build()");
                    new C45964b.a().m101403b(null).m101402a();
                    Intrinsics.checkNotNullExpressionValue(null, "Builder().setCustomAudience(ca).build()");
                    C45963a c45963a = customAudienceManager;
                    if (c45963a != null) {
                        c45963a.m101401b(null, Executors.newSingleThreadExecutor(), outcomeReceiverM2427a);
                    }
                } catch (Exception e11) {
                    Log.w(TAG, "Failed to join Custom Audience: " + e11);
                    GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                    if (gpsDebugLogger3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    } else {
                        gpsDebugLogger2 = gpsDebugLogger3;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("gps_pa_failed_reason", e11.toString());
                    Unit unit = Unit.INSTANCE;
                    gpsDebugLogger2.m8108b("gps_pa_failed", bundle);
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m85300e(String appId, AppEvent event) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            String eventName = event.getJsonObject().getString("_eventName");
            if (!Intrinsics.areEqual(eventName, "_removed_")) {
                Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
                if (!StringsKt.contains$default((CharSequence) eventName, (CharSequence) "gps", false, 2, (Object) null)) {
                    return appId + '@' + eventName;
                }
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }
}
