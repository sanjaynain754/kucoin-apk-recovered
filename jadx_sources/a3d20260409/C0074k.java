package a3d20260409;

import ai.advance.common.recorder_old.VideoRecorder;
import android.os.Build;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;
import p326i.C38390w;
import p387k.C40832g;

/* JADX INFO: renamed from: a3d20260409.k */
/* JADX INFO: loaded from: classes23.dex */
public class C0074k {

    /* JADX INFO: renamed from: a */
    public VideoRecorder f310a;

    /* JADX INFO: renamed from: b */
    public JSONObject f311b;

    /* JADX INFO: renamed from: c */
    public int f312c;

    /* JADX INFO: renamed from: d */
    public int f313d;

    /* JADX INFO: renamed from: e */
    public int f314e;

    /* JADX INFO: renamed from: a */
    public JSONObject m351a() {
        return this.f311b;
    }

    /* JADX INFO: renamed from: b */
    public void m352b(int i11, int i12, int i13) {
        this.f313d = i11;
        this.f314e = i12;
        this.f312c = i13;
    }

    /* JADX INFO: renamed from: c */
    public void m353c(C38390w c38390w) {
        VideoRecorder videoRecorder = this.f310a;
        if (videoRecorder != null) {
            videoRecorder.m1236n(c38390w);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m354d(String str) throws Exception {
        if (this.f310a != null) {
            return false;
        }
        VideoRecorder videoRecorder = new VideoRecorder();
        this.f310a = videoRecorder;
        videoRecorder.m1241s(this.f312c);
        String strM529R = C0109v.m529R();
        if (C40832g.m89352g(strM529R)) {
            JSONObject jSONObject = new JSONObject(strM529R);
            int iM89349d = C40832g.m89349d(jSONObject, "bitRate");
            if (iM89349d != 0) {
                this.f310a.m1237o(iM89349d);
            }
            int iM89349d2 = C40832g.m89349d(jSONObject, "frameRate");
            if (iM89349d != 0) {
                this.f310a.m1239q(iM89349d2);
            }
            int iM89349d3 = C40832g.m89349d(jSONObject, "encodeQueueMaxSize");
            if (iM89349d != 0) {
                this.f310a.m1238p(iM89349d3);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("color19DeviceModelList");
            if (jSONArrayOptJSONArray != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    if (Build.MODEL.equals(jSONArrayOptJSONArray.getString(i11))) {
                        this.f310a.m1240r(19);
                    }
                }
            }
        }
        File file = new File(str);
        this.f310a.m1242t(this.f313d, this.f314e, C0106s.f433m * 1000, file);
        j3d20260409.O0ooEoo0oo(file.getName());
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m355e() {
        VideoRecorder videoRecorder = this.f310a;
        return videoRecorder != null && videoRecorder.m1235m();
    }

    /* JADX INFO: renamed from: f */
    public void m356f() throws Exception {
        VideoRecorder videoRecorder = this.f310a;
        if (videoRecorder == null || !videoRecorder.m1235m()) {
            return;
        }
        this.f310a.m1243u();
        this.f311b = this.f310a.m1234l();
        this.f310a = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m357g() {
        return C0106s.f432l || C0109v.m514C();
    }
}
