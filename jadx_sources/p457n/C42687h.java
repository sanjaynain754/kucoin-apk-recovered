package p457n;

import android.text.TextUtils;
import java.io.InputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: n.h */
/* JADX INFO: loaded from: classes23.dex */
public class C42687h {

    /* JADX INFO: renamed from: a */
    public String f94485a;

    /* JADX INFO: renamed from: b */
    public String f94486b;

    /* JADX INFO: renamed from: c */
    public InputStream f94487c;

    /* JADX INFO: renamed from: d */
    public C42692m f94488d;

    /* JADX INFO: renamed from: e */
    public boolean f94489e = false;

    /* JADX INFO: renamed from: a */
    public String m93549a() {
        return this.f94485a;
    }

    /* JADX INFO: renamed from: b */
    public C42692m m93550b() {
        return this.f94488d;
    }

    /* JADX INFO: renamed from: c */
    public String m93551c() {
        if (TextUtils.isEmpty(this.f94485a)) {
            return null;
        }
        try {
            return new JSONObject(this.f94485a).getString("transactionId");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m93552d() {
        return this.f94489e;
    }

    /* JADX INFO: renamed from: e */
    public void m93553e(InputStream inputStream) {
        this.f94487c = inputStream;
    }

    /* JADX INFO: renamed from: f */
    public void m93554f(boolean z11) {
        this.f94489e = z11;
    }

    /* JADX INFO: renamed from: g */
    public void m93555g(String str) {
        this.f94486b = str;
    }

    /* JADX INFO: renamed from: h */
    public void m93556h(String str) {
        this.f94485a = str;
    }

    public C42687h(String str, C42692m c42692m) {
        this.f94485a = str;
        this.f94488d = c42692m;
    }
}
