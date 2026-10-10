package p442m;

import android.content.Context;
import android.hardware.Camera;
import androidx.webkit.ProxyConfig;
import org.json.JSONObject;
import p387k.C40828c;
import p387k.C40834i;
import p579r.C43890a;

/* JADX INFO: renamed from: m.b */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC42332b extends C42336f {

    /* JADX INFO: renamed from: g */
    public JSONObject f93843g;

    /* JADX INFO: renamed from: h */
    public boolean f93844h;

    /* JADX INFO: renamed from: i */
    public long f93845i;

    /* JADX INFO: renamed from: m.b$a */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                AbstractC42332b.this.m92886k("front_camera_id", Integer.valueOf(C40828c.m89332f()));
                AbstractC42332b.this.m92886k("back_camera_id", Integer.valueOf(C40828c.m89330d()));
                AbstractC42332b.this.m92886k("camera_numbers", Integer.valueOf(C40828c.m89333g()));
            } catch (Exception unused) {
                AbstractC42332b.this.m92886k("front_camera_id", -1);
                AbstractC42332b.this.m92886k("back_camera_id", -1);
                AbstractC42332b.this.m92886k("camera_numbers", -1);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m92881m(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: o */
    public String m92887o(JSONObject jSONObject) {
        String string = null;
        try {
            synchronized (this) {
                string = jSONObject.toString();
            }
            return string;
        } catch (Exception unused) {
            return string;
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract String mo180p();

    /* JADX INFO: renamed from: q */
    public abstract String mo182q();

    /* JADX INFO: renamed from: r */
    public abstract String mo184r();

    /* JADX INFO: renamed from: s */
    public void m92888s(boolean z11, String str) {
        this.f93844h = false;
        if (!z11) {
            m92886k("failed_reason", "auth_failed");
            m92886k("auth_failed_reason", str);
        }
        m92886k("auth_duration", Long.valueOf(System.currentTimeMillis() - this.f93845i));
        m92886k("param_version", mo182q());
        m92886k("jni_version", mo184r());
        m92886k("native_model_version", mo180p());
    }

    /* JADX INFO: renamed from: t */
    public void m92889t() {
        this.f93844h = true;
        this.f93845i = System.currentTimeMillis();
    }

    public AbstractC42332b(Context context, String str, String str2) {
        super(context, str, str2, "event");
        this.f93844h = false;
        m92904h();
        m92886k("customer_user_id", C43890a.m96662c());
        m92886k("appName", m92880l(context));
        m92886k("appVersionCode", Integer.valueOf(m92881m(context)));
        m92886k("appVersionName", m92882n(context));
        m92886k("coreJarVersion", "6.0.12");
        new a("CameraInfoInit").start();
    }

    /* JADX INFO: renamed from: j */
    public void m92885j(Camera.Size size) {
        JSONObject jSONObject = this.f93843g;
        if (jSONObject == null || !jSONObject.has("camera_preview_size")) {
            m92886k("camera_preview_size", size.width + ProxyConfig.MATCH_ALL_SCHEMES + size.height);
            m92886k("screen_size", C40834i.f90707b + ProxyConfig.MATCH_ALL_SCHEMES + C40834i.f90708c);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m92886k(String str, Object obj) {
        if (this.f93843g == null) {
            this.f93843g = new JSONObject();
        }
        try {
            synchronized (this) {
                this.f93843g.putOpt(str, obj);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m92880l(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m92882n(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p442m.C42336f
    @Deprecated
    /* JADX INFO: renamed from: e */
    public JSONObject mo92883e(JSONObject jSONObject) {
        return super.mo92883e(jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public void m92884i(int i11) {
        m92886k("camera_angle", Integer.valueOf(i11));
    }
}
