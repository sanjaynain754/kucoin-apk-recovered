package a3d20260409;

import aai.liveness.Detector$WarnCode;
import android.text.TextUtils;
import intl.o0oOOOOOooooo;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: a3d20260409.b */
/* JADX INFO: loaded from: classes23.dex */
public class C0065b {

    /* JADX INFO: renamed from: a */
    public JSONObject f108a;

    /* JADX INFO: renamed from: b */
    public Detector$WarnCode f109b;

    /* JADX INFO: renamed from: c */
    public o0oOOOOOooooo f110c;

    /* JADX INFO: renamed from: d */
    public o0oOOOOOooooo f111d;

    /* JADX INFO: renamed from: e */
    public C0068e f112e;

    /* JADX INFO: renamed from: f */
    public String f113f;

    /* JADX INFO: renamed from: g */
    public boolean f114g;

    /* JADX INFO: renamed from: h */
    public String f115h;

    /* JADX INFO: renamed from: i */
    public boolean f116i;

    /* JADX INFO: renamed from: j */
    public int f117j;

    /* JADX INFO: renamed from: k */
    public int f118k;

    /* JADX INFO: renamed from: l */
    public double f119l;

    /* JADX INFO: renamed from: m */
    public boolean f120m;

    /* JADX INFO: renamed from: a */
    public void m104a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f108a = jSONObject;
            String string = jSONObject.getString("code");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f109b = Detector$WarnCode.valueOf(string);
                } catch (Exception unused) {
                }
            }
            if (this.f109b == Detector$WarnCode.ERROR_FACEMISSING) {
                this.f109b = Detector$WarnCode.FACEMISSING;
            }
            if (this.f109b == Detector$WarnCode.ERROR_MULTIPLEFACES) {
                this.f109b = Detector$WarnCode.WARN_MULTIPLEFACES;
            }
            this.f110c = o0oOOOOOooooo.valueOf(this.f108a.getString("curStage"));
            this.f111d = o0oOOOOOooooo.valueOf(this.f108a.getString("nextStage"));
            if (!this.f108a.getString("faceInfo").equals("")) {
                this.f112e = C0068e.a.m138a(new JSONObject(this.f108a.getString("faceInfo")));
            }
            this.f113f = this.f108a.optString("debugInfo", "No debug info found");
            this.f116i = this.f108a.optBoolean("snapshot", false);
            this.f114g = this.f108a.optBoolean("isFrontal");
            this.f115h = this.f108a.optString("snapshotName", String.valueOf(this.f109b).toLowerCase(Locale.ENGLISH));
            this.f120m = this.f108a.optBoolean("isEyeClosed");
            this.f119l = this.f108a.optDouble("blinkCaptureScore", 0.0d);
        } catch (Exception unused2) {
        }
    }
}
