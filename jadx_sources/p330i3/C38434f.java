package p330i3;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i3.f */
/* JADX INFO: compiled from: SensitiveParamsManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\b2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0016R2\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Li3/f;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/os/Bundle;", "parameters", "", "eventName", "c", "(Landroid/os/Bundle;Ljava/lang/String;)V", "b", "parameterKey", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "sensitiveParamsForEvent", "", "d", "(Ljava/lang/String;Ljava/util/HashSet;)Z", "Z", "enabled", "Ljava/util/HashSet;", "defaultSensitiveParameters", "", "Ljava/util/Map;", "sensitiveParameters", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38434f {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38434f f86245a = new C38434f();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static HashSet<String> defaultSensitiveParameters = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static Map<String, HashSet<String>> sensitiveParameters = new HashMap();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m86684a() {
        if (C42757a.m93689d(C38434f.class)) {
            return;
        }
        try {
            f86245a.m86686b();
            if (defaultSensitiveParameters.isEmpty() && sensitiveParameters.isEmpty()) {
                enabled = false;
            } else {
                enabled = true;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38434f.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m86685c(@Nullable Bundle parameters, @NotNull String eventName) {
        if (C42757a.m93689d(C38434f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (enabled && parameters != null) {
                if (!defaultSensitiveParameters.isEmpty() || sensitiveParameters.containsKey(eventName)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet<String> hashSet = sensitiveParameters.get(eventName);
                        for (String key : new ArrayList(parameters.keySet())) {
                            C38434f c38434f = f86245a;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            if (c38434f.m86687d(key, hashSet)) {
                                parameters.remove(key);
                                jSONArray.put(key);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        parameters.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38434f.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m86686b() {
        HashSet<String> hashSetM10074l;
        if (!C42757a.m93689d(this)) {
            try {
                FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false);
                if (fetchedAppSettingsM9982u != null) {
                    try {
                        defaultSensitiveParameters = new HashSet<>();
                        sensitiveParameters = new HashMap();
                        JSONArray sensitiveParams = fetchedAppSettingsM9982u.getSensitiveParams();
                        if (sensitiveParams != null && sensitiveParams.length() != 0) {
                            int length = sensitiveParams.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                JSONObject jSONObject = sensitiveParams.getJSONObject(i11);
                                boolean zHas = jSONObject.has("key");
                                boolean zHas2 = jSONObject.has("value");
                                if (zHas && zHas2) {
                                    String sensitiveParamsScope = jSONObject.getString("key");
                                    JSONArray jSONArray = jSONObject.getJSONArray("value");
                                    if (jSONArray != null && (hashSetM10074l = C5760c.m10074l(jSONArray)) != null) {
                                        if (sensitiveParamsScope.equals("_MTSDK_Default_")) {
                                            defaultSensitiveParameters = hashSetM10074l;
                                        } else {
                                            Map<String, HashSet<String>> map = sensitiveParameters;
                                            Intrinsics.checkNotNullExpressionValue(sensitiveParamsScope, "sensitiveParamsScope");
                                            map.put(sensitiveParamsScope, hashSetM10074l);
                                        }
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

    /* JADX INFO: renamed from: d */
    public final boolean m86687d(String parameterKey, HashSet<String> sensitiveParamsForEvent) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            if (!defaultSensitiveParameters.contains(parameterKey)) {
                if (sensitiveParamsForEvent == null || sensitiveParamsForEvent.isEmpty() || !sensitiveParamsForEvent.contains(parameterKey)) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }
}
