package p330i3;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.p060ml.ModelManager;
import com.facebook.internal.C5758a;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i3.c */
/* JADX INFO: compiled from: IntegrityManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0015"}, m90084d2 = {"Li3/c;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "parameters", "c", "(Ljava/util/Map;)V", "input", "", "d", "(Ljava/lang/String;)Z", "textFeature", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Z", "enabled", "isSampleEnabled", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38431c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38431c f86235a = new C38431c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean isSampleEnabled;

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m86666a() {
        if (C42757a.m93689d(C38431c.class)) {
            return;
        }
        try {
            enabled = true;
            isSampleEnabled = C5758a.m10026d("FBSDKFeatureIntegritySample", C5501a.m7800n(), false);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38431c.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m86667c(@NotNull Map<String, String> parameters) {
        if (C42757a.m93689d(C38431c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            if (!enabled || parameters.isEmpty()) {
                return;
            }
            try {
                List<String> list = CollectionsKt.toList(parameters.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : list) {
                    String str2 = parameters.get(str);
                    if (str2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str3 = str2;
                    C38431c c38431c = f86235a;
                    if (c38431c.m86669d(str) || c38431c.m86669d(str3)) {
                        parameters.remove(str);
                        if (!isSampleEnabled) {
                            str3 = "";
                        }
                        jSONObject.put(str, str3);
                    }
                }
                if (jSONObject.length() != 0) {
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "restrictiveParamJson.toString()");
                    parameters.put("_onDeviceParams", string);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38431c.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m86668b(String textFeature) {
        String str;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String[] strArrM8300q = ModelManager.m8300q(ModelManager.Task.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{textFeature});
            if (strArrM8300q != null && (str = strArrM8300q[0]) != null) {
                return str;
            }
            return "none";
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m86669d(String input) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            return !Intrinsics.areEqual("none", m86668b(input));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }
}
