package com.facebook.appevents.gps.ara;

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
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.net.URLEncoder;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p250f3.C37329a;
import p464n6.C42757a;
import p708w.InterfaceC45670b;
import p780y.C46357a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: GpsAraTriggersManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u001e"}, m90084d2 = {"Lcom/facebook/appevents/gps/ara/GpsAraTriggersManager;", "", "<init>", "()V", "", "e", "", "applicationId", "Lcom/facebook/appevents/AppEvent;", "event", "i", "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "", "d", "()Z", "f", "(Lcom/facebook/appevents/AppEvent;)Ljava/lang/String;", "g", "(Lcom/facebook/appevents/AppEvent;)Z", "b", "Ljava/lang/String;", "TAG", "c", "Z", "enabled", "Lcom/facebook/appevents/gps/GpsDebugLogger;", "Lcom/facebook/appevents/gps/GpsDebugLogger;", "gpsDebugLogger", "serverUri", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGpsAraTriggersManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GpsAraTriggersManager.kt\ncom/facebook/appevents/gps/ara/GpsAraTriggersManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
public final class GpsAraTriggersManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GpsAraTriggersManager f7834a = new GpsAraTriggersManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String TAG;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static GpsDebugLogger gpsDebugLogger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static String serverUri;

    /* JADX INFO: renamed from: com.facebook.appevents.gps.ara.GpsAraTriggersManager$a */
    /* JADX INFO: compiled from: GpsAraTriggersManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001¨\u0006\u0005"}, m90084d2 = {"com/facebook/appevents/gps/ara/GpsAraTriggersManager$a", "Lw/b;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5525a implements InterfaceC45670b<Object, Exception> {
    }

    /* JADX INFO: renamed from: com.facebook.appevents.gps.ara.GpsAraTriggersManager$b */
    /* JADX INFO: compiled from: GpsAraTriggersManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00062\n\u0010\t\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"com/facebook/appevents/gps/ara/GpsAraTriggersManager$b", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", DbParams.KEY_CHANNEL_RESULT, "", "onResult", "(Ljava/lang/Object;)V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Exception;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5526b implements OutcomeReceiver {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.d(GpsAraTriggersManager.m8111c(), "OUTCOME_RECEIVER_TRIGGER_FAILURE");
            GpsDebugLogger gpsDebugLoggerM8110b = GpsAraTriggersManager.m8110b();
            if (gpsDebugLoggerM8110b == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                gpsDebugLoggerM8110b = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_ara_failed_reason", error.toString());
            Unit unit = Unit.INSTANCE;
            gpsDebugLoggerM8110b.m8108b("gps_ara_failed", bundle);
        }

        public void onResult(@NotNull Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Log.d(GpsAraTriggersManager.m8111c(), "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
            GpsDebugLogger gpsDebugLoggerM8110b = GpsAraTriggersManager.m8110b();
            if (gpsDebugLoggerM8110b == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                gpsDebugLoggerM8110b = null;
            }
            gpsDebugLoggerM8110b.m8108b("gps_ara_succeed", null);
        }
    }

    static {
        String string = GpsAraTriggersManager.class.toString();
        Intrinsics.checkNotNullExpressionValue(string, "GpsAraTriggersManager::class.java.toString()");
        TAG = string;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ GpsDebugLogger m8110b() {
        if (C42757a.m93689d(GpsAraTriggersManager.class)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, GpsAraTriggersManager.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ String m8111c() {
        if (C42757a.m93689d(GpsAraTriggersManager.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, GpsAraTriggersManager.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m8112e() {
        if (C42757a.m93689d(GpsAraTriggersManager.class)) {
            return;
        }
        try {
            enabled = true;
            gpsDebugLogger = new GpsDebugLogger(C5501a.m7799m());
            serverUri = "https://www." + C5501a.m7807u() + "/privacy_sandbox/mobile/register/trigger";
        } catch (Throwable th2) {
            C42757a.m93687b(th2, GpsAraTriggersManager.class);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8113j(String applicationId, AppEvent event) {
        if (C42757a.m93689d(GpsAraTriggersManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
            Intrinsics.checkNotNullParameter(event, "$event");
            f7834a.m8117h(applicationId, event);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, GpsAraTriggersManager.class);
        }
    }

    @TargetApi(34)
    /* JADX INFO: renamed from: h */
    public final void m8117h(@NotNull String applicationId, @NotNull AppEvent event) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (m8116g(event) && m8114d()) {
                Context contextM7799m = C5501a.m7799m();
                GpsDebugLogger gpsDebugLogger2 = null;
                try {
                    try {
                        try {
                            C46357a c46357aM102229a = (C46357a) contextM7799m.getSystemService(C46357a.class);
                            if (c46357aM102229a == null) {
                                c46357aM102229a = C46357a.m102229a(contextM7799m.getApplicationContext());
                            }
                            if (c46357aM102229a == null) {
                                Log.w(TAG, "FAILURE_GET_MEASUREMENT_MANAGER");
                                GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                                if (gpsDebugLogger3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                                    gpsDebugLogger3 = null;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                                Unit unit = Unit.INSTANCE;
                                gpsDebugLogger3.m8108b("gps_ara_failed", bundle);
                                return;
                            }
                            String strM8115f = m8115f(event);
                            StringBuilder sb2 = new StringBuilder();
                            String str = serverUri;
                            if (str == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("serverUri");
                                str = null;
                            }
                            sb2.append(str);
                            sb2.append('?');
                            sb2.append("app_id");
                            sb2.append('=');
                            sb2.append(applicationId);
                            sb2.append(Typography.amp);
                            sb2.append(strM8115f);
                            Uri uri = Uri.parse(sb2.toString());
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(\"$serverUri?$appId…=$applicationId&$params\")");
                            if (C37329a.m83908a()) {
                                c46357aM102229a.m102230b(uri, C5501a.m7806t(), C1708b.m2427a(new C5526b()));
                            } else {
                                c46357aM102229a.m102231c(uri, C5501a.m7806t(), new C5525a());
                            }
                        } catch (NoSuchMethodError e11) {
                            Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_NO_METHOD_FOUND");
                            GpsDebugLogger gpsDebugLogger4 = gpsDebugLogger;
                            if (gpsDebugLogger4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                            } else {
                                gpsDebugLogger2 = gpsDebugLogger4;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("gps_ara_failed_reason", e11.toString());
                            Unit unit2 = Unit.INSTANCE;
                            gpsDebugLogger2.m8108b("gps_ara_failed", bundle2);
                        }
                    } catch (Exception e12) {
                        Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                        GpsDebugLogger gpsDebugLogger5 = gpsDebugLogger;
                        if (gpsDebugLogger5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                        } else {
                            gpsDebugLogger2 = gpsDebugLogger5;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("gps_ara_failed_reason", e12.toString());
                        Unit unit3 = Unit.INSTANCE;
                        gpsDebugLogger2.m8108b("gps_ara_failed", bundle3);
                    }
                } catch (NoClassDefFoundError e13) {
                    Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_NO_CLASS_FOUND");
                    GpsDebugLogger gpsDebugLogger6 = gpsDebugLogger;
                    if (gpsDebugLogger6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    } else {
                        gpsDebugLogger2 = gpsDebugLogger6;
                    }
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("gps_ara_failed_reason", e13.toString());
                    Unit unit4 = Unit.INSTANCE;
                    gpsDebugLogger2.m8108b("gps_ara_failed", bundle4);
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8114d() {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            if (!enabled) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m8115f(AppEvent event) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            final JSONObject jsonObject = event.getJsonObject();
            if (jsonObject != null && jsonObject.length() != 0) {
                Iterator<String> itKeys = jsonObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "params.keys()");
                return SequencesKt.joinToString$default(SequencesKt.mapNotNull(SequencesKt.asSequence(itKeys), new Function1<String, String>() { // from class: com.facebook.appevents.gps.ara.GpsAraTriggersManager$getEventParameters$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p852kotlin.jvm.functions.Function1
                    @Nullable
                    public final String invoke(String str) {
                        Object objOpt = jsonObject.opt(str);
                        if (objOpt == null) {
                            return null;
                        }
                        try {
                            return URLEncoder.encode(str, "UTF-8") + '=' + URLEncoder.encode(objOpt.toString(), "UTF-8");
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                }), "&", null, null, 0, null, null, 62, null);
            }
            return "";
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8116g(AppEvent event) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            String eventName = event.getJsonObject().getString("_eventName");
            if (!Intrinsics.areEqual(eventName, "_removed_")) {
                Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
                if (!StringsKt.contains$default((CharSequence) eventName, (CharSequence) "gps", false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8118i(@NotNull final String applicationId, @NotNull final AppEvent event) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            C5501a.m7806t().execute(new Runnable() { // from class: com.facebook.appevents.gps.ara.a
                @Override // java.lang.Runnable
                public final void run() {
                    GpsAraTriggersManager.m8113j(applicationId, event);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
