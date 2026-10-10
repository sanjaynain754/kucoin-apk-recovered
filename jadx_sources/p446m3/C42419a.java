package p446m3;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: m3.a */
/* JADX INFO: compiled from: RestrictiveDataManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001c\u0010\u0019\u001a\n \u0017*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006!"}, m90084d2 = {"Lm3/a;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "eventName", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "parameters", "f", "(Ljava/util/Map;Ljava/lang/String;)V", "c", "paramKey", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "d", "(Ljava/lang/String;)Z", "Z", "enabled", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "Lm3/a$a;", "Ljava/util/List;", "restrictiveParamFilters", "", "Ljava/util/Set;", "restrictedEvents", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C42419a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42419a f94033a = new C42419a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final String TAG = C42419a.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final List<a> restrictiveParamFilters = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> restrictedEvents = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: m3.a$a */
    /* JADX INFO: compiled from: RestrictiveDataManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lm3/a$a;", "", "", "eventName", "", "restrictiveParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "(Ljava/util/Map;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public String eventName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Map<String, String> restrictiveParams;

        public a(@NotNull String eventName, @NotNull Map<String, String> restrictiveParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
            this.eventName = eventName;
            this.restrictiveParams = restrictiveParams;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Map<String, String> m93114b() {
            return this.restrictiveParams;
        }

        /* JADX INFO: renamed from: c */
        public final void m93115c(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.restrictiveParams = map;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m93107a() {
        if (C42757a.m93689d(C42419a.class)) {
            return;
        }
        try {
            enabled = true;
            f94033a.m93111c();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42419a.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m93108e(@NotNull String eventName) {
        if (C42757a.m93689d(C42419a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            return (enabled && f94033a.m93112d(eventName)) ? "_removed_" : eventName;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42419a.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m93109f(@NotNull Map<String, String> parameters, @NotNull String eventName) {
        if (C42757a.m93689d(C42419a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (enabled) {
                HashMap map = new HashMap();
                for (String str : new ArrayList(parameters.keySet())) {
                    String strM93110b = f94033a.m93110b(eventName, str);
                    if (strM93110b != null) {
                        map.put(str, strM93110b);
                        parameters.remove(str);
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    parameters.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42419a.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m93110b(String eventName, String paramKey) {
        try {
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                for (a aVar : new ArrayList(restrictiveParamFilters)) {
                    if (aVar != null && Intrinsics.areEqual(eventName, aVar.getEventName())) {
                        for (String str : aVar.m93114b().keySet()) {
                            if (Intrinsics.areEqual(paramKey, str)) {
                                return aVar.m93114b().get(str);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                Log.w(TAG, "getMatchedRuleType failed", e11);
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m93111c() {
        String restrictiveDataSetting;
        if (!C42757a.m93689d(this)) {
            try {
                FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false);
                if (fetchedAppSettingsM9982u == null || (restrictiveDataSetting = fetchedAppSettingsM9982u.getRestrictiveDataSetting()) == null || restrictiveDataSetting.length() == 0) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
                restrictiveParamFilters.clear();
                restrictedEvents.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        a aVar = new a(key, new HashMap());
                        if (jSONObjectOptJSONObject != null) {
                            aVar.m93115c(C5760c.m10077o(jSONObjectOptJSONObject));
                            restrictiveParamFilters.add(aVar);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            restrictedEvents.add(aVar.getEventName());
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m93112d(String eventName) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            return restrictedEvents.contains(eventName);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }
}
