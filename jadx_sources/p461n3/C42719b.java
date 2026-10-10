package p461n3;

import android.content.SharedPreferences;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.C5760c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p189d3.C36605c;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: n3.b */
/* JADX INFO: compiled from: PredictionHistoryManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0003R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Ln3/b;", "", "<init>", "()V", "", "pathID", "predictedEvent", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "text", "b", "(Landroid/view/View;Ljava/lang/String;)Ljava/lang/String;", "d", "(Ljava/lang/String;)Ljava/lang/String;", "c", "", "Ljava/util/Map;", "clickedViewPaths", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "shardPreferences", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C42719b {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static SharedPreferences shardPreferences;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42719b f94540a = new C42719b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, String> clickedViewPaths = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m93612a(@NotNull String pathID, @NotNull String predictedEvent) {
        if (C42757a.m93689d(C42719b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Intrinsics.checkNotNullParameter(predictedEvent, "predictedEvent");
            if (!initialized.get()) {
                f94540a.m93615c();
            }
            Map<String, String> map = clickedViewPaths;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = shardPreferences;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", C5760c.m10067f0(MapsKt.toMap(map))).apply();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42719b.class);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m93614d(@NotNull String pathID) {
        if (C42757a.m93689d(C42719b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Map<String, String> map = clickedViewPaths;
            if (map.containsKey(pathID)) {
                return map.get(pathID);
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42719b.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m93615c() {
        String str = "";
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…RE, Context.MODE_PRIVATE)");
            shardPreferences = sharedPreferences;
            Map<String, String> map = clickedViewPaths;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(C5760c.m10062c0(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m93613b(@NotNull View view, @NotNull String text) {
        if (C42757a.m93689d(C42719b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = C36605c.m81906j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return C5760c.m10086t0(jSONObject.toString());
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42719b.class);
            return null;
        }
    }
}
