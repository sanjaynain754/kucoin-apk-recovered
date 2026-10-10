package p330i3;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: i3.e */
/* JADX INFO: compiled from: RedactedEventsManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\rR2\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u0006`\u00110\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Li3/e;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "eventName", "d", "(Ljava/lang/String;)Ljava/lang/String;", "c", "b", "", "Z", "enabled", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/Map;", "redactedEvents", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRedactedEventsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedactedEventsManager.kt\ncom/facebook/appevents/integrity/RedactedEventsManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1855#2,2:84\n*S KotlinDebug\n*F\n+ 1 RedactedEventsManager.kt\ncom/facebook/appevents/integrity/RedactedEventsManager\n*L\n73#1:84,2\n*E\n"})
public final class C38433e {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38433e f86242a = new C38433e();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static Map<String, HashSet<String>> redactedEvents = new HashMap();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m86680a() {
        if (C42757a.m93689d(C38433e.class)) {
            return;
        }
        try {
            f86242a.m86683c();
            if (redactedEvents.isEmpty()) {
                return;
            }
            enabled = true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38433e.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m86681d(@NotNull String eventName) {
        String strM86682b;
        if (C42757a.m93689d(C38433e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            return (!enabled || (strM86682b = f86242a.m86682b(eventName)) == null) ? eventName : strM86682b;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38433e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m86682b(String eventName) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            for (String str : redactedEvents.keySet()) {
                HashSet<String> hashSet = redactedEvents.get(str);
                if (hashSet != null && hashSet.contains(eventName)) {
                    return str;
                }
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m86683c() {
        HashSet<String> hashSetM10074l;
        if (!C42757a.m93689d(this)) {
            try {
                FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false);
                if (fetchedAppSettingsM9982u != null) {
                    try {
                        redactedEvents = new HashMap();
                        JSONArray redactedEvents2 = fetchedAppSettingsM9982u.getRedactedEvents();
                        if (redactedEvents2 != null && redactedEvents2.length() != 0) {
                            int length = redactedEvents2.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                JSONObject jSONObject = redactedEvents2.getJSONObject(i11);
                                boolean zHas = jSONObject.has("key");
                                boolean zHas2 = jSONObject.has("value");
                                if (zHas && zHas2) {
                                    String string = jSONObject.getString("key");
                                    JSONArray jSONArray = jSONObject.getJSONArray("value");
                                    if (string != null && (hashSetM10074l = C5760c.m10074l(jSONArray)) != null) {
                                        redactedEvents.put(string, hashSetM10074l);
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }
}
