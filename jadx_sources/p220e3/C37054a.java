package p220e3;

import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: e3.a */
/* JADX INFO: compiled from: EventDeactivationManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Le3/a;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Lcom/facebook/appevents/AppEvent;", DbParams.TABLE_EVENTS, "d", "(Ljava/util/List;)V", "", "", "parameters", "eventName", "c", "(Ljava/util/Map;Ljava/lang/String;)V", "b", "", "Z", "enabled", "Le3/a$a;", "Ljava/util/List;", "deprecatedParamFilters", "", "Ljava/util/Set;", "deprecatedEvents", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C37054a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37054a f82310a = new C37054a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<a> deprecatedParamFilters = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> deprecatedEvents = new HashSet();

    /* JADX INFO: renamed from: e3.a$a */
    /* JADX INFO: compiled from: EventDeactivationManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Le3/a$a;", "", "", "eventName", "", "deprecateParams", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "Ljava/util/List;", "()Ljava/util/List;", "c", "(Ljava/util/List;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public String eventName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public List<String> deprecateParams;

        public a(@NotNull String eventName, @NotNull List<String> deprecateParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
            this.eventName = eventName;
            this.deprecateParams = deprecateParams;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<String> m82963a() {
            return this.deprecateParams;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        /* JADX INFO: renamed from: c */
        public final void m82965c(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.deprecateParams = list;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m82962b() {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false);
            if (fetchedAppSettingsM9982u == null) {
                return;
            }
            String restrictiveDataSetting = fetchedAppSettingsM9982u.getRestrictiveDataSetting();
            if (restrictiveDataSetting != null && restrictiveDataSetting.length() > 0) {
                JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
                deprecatedParamFilters.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            Set<String> set = deprecatedEvents;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            set.add(key);
                        } else {
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            a aVar = new a(key, new ArrayList());
                            if (jSONArrayOptJSONArray != null) {
                                aVar.m82965c(C5760c.m10075m(jSONArrayOptJSONArray));
                            }
                            deprecatedParamFilters.add(aVar);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m82959a() {
        if (C42757a.m93689d(C37054a.class)) {
            return;
        }
        try {
            enabled = true;
            f82310a.m82962b();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C37054a.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m82960c(@NotNull Map<String, String> parameters, @NotNull String eventName) {
        if (C42757a.m93689d(C37054a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (enabled) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (a aVar : new ArrayList(deprecatedParamFilters)) {
                    if (Intrinsics.areEqual(aVar.getEventName(), eventName)) {
                        for (String str : arrayList) {
                            if (aVar.m82963a().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C37054a.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m82961d(@NotNull List<AppEvent> events) {
        if (C42757a.m93689d(C37054a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(events, "events");
            if (enabled) {
                Iterator<AppEvent> it = events.iterator();
                while (it.hasNext()) {
                    if (deprecatedEvents.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C37054a.class);
        }
    }
}
