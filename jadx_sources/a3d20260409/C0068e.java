package a3d20260409;

import android.graphics.PointF;
import android.graphics.RectF;
import com.jumio.liveness.DaClient;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: a3d20260409.e */
/* JADX INFO: loaded from: classes23.dex */
public class C0068e {

    /* JADX INFO: renamed from: i */
    public PointF[] f144i;

    /* JADX INFO: renamed from: j */
    public RectF f145j;

    /* JADX INFO: renamed from: k */
    public RectF f146k;

    /* JADX INFO: renamed from: l */
    public RectF f147l;

    /* JADX INFO: renamed from: b */
    public float f137b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f138c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f139d = 0.0f;

    /* JADX INFO: renamed from: e */
    public float f140e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f141f = -1.0f;

    /* JADX INFO: renamed from: g */
    public float f142g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f143h = -1.0f;

    /* JADX INFO: renamed from: m */
    public boolean f148m = false;

    /* JADX INFO: renamed from: a */
    public RectF f136a = new RectF();

    /* JADX INFO: renamed from: a3d20260409.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static C0068e m138a(JSONObject jSONObject) {
            try {
                C0068e c0068e = new C0068e();
                c0068e.f142g = (float) jSONObject.optDouble("leftEyeOpenProb");
                c0068e.f143h = (float) jSONObject.optDouble("rightEyeOpenProb");
                c0068e.f141f = (float) jSONObject.optDouble("mouthOpenProb");
                c0068e.f140e = (float) jSONObject.optDouble("faceQuality");
                c0068e.f137b = (float) jSONObject.optDouble(DaClient.ATTR_YAW);
                c0068e.f138c = (float) jSONObject.optDouble(DaClient.ATTR_PITCH);
                c0068e.f139d = (float) jSONObject.optDouble(DaClient.ATTR_ROLL);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("faceBoundingbox");
                c0068e.f136a.left = (float) jSONArrayOptJSONArray.optDouble(0);
                c0068e.f136a.top = (float) jSONArrayOptJSONArray.optDouble(1);
                c0068e.f136a.right = (float) jSONArrayOptJSONArray.optDouble(2);
                c0068e.f136a.bottom = (float) jSONArrayOptJSONArray.optDouble(3);
                c0068e.f145j = C0068e.m131b(jSONObject, "leftEyeRect");
                c0068e.f146k = C0068e.m131b(jSONObject, "rightEyeRect");
                c0068e.f147l = C0068e.m131b(jSONObject, "mouthRect");
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("landmark");
                if (jSONArrayOptJSONArray2.length() % 2 == 0) {
                    c0068e.f144i = new PointF[jSONArrayOptJSONArray2.length() / 2];
                    int i11 = 0;
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length() / 2; i12++) {
                        c0068e.f144i[i12] = new PointF();
                        c0068e.f144i[i12].x = (float) jSONArrayOptJSONArray2.optDouble(i11);
                        c0068e.f144i[i12].y = (float) jSONArrayOptJSONArray2.optDouble(i11 + 1);
                        i11 += 2;
                    }
                }
                return c0068e;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public String toString() {
        return "FaceInfo{ position=" + this.f136a.toShortString() + ", yaw=" + this.f137b + ", faceQuality=" + this.f140e + ", mouthOpenProb=" + this.f141f + "}";
    }

    /* JADX INFO: renamed from: b */
    public static RectF m131b(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 4) {
            RectF rectF = new RectF();
            rectF.left = (float) jSONArrayOptJSONArray.optDouble(0);
            rectF.top = (float) jSONArrayOptJSONArray.optDouble(1);
            rectF.right = (float) jSONArrayOptJSONArray.optDouble(2);
            rectF.bottom = (float) jSONArrayOptJSONArray.optDouble(3);
            return rectF;
        }
        return null;
    }
}
