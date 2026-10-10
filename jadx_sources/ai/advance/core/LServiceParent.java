package ai.advance.core;

import ai.advance.common.entity.BaseResultEntity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import com.tencent.bugly.proguard.C33556b3;
import java.io.File;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import p387k.C40829d;
import p387k.C40832g;

/* JADX INFO: loaded from: classes23.dex */
public abstract class LServiceParent extends JobIntentService {

    /* JADX INFO: renamed from: d */
    public static boolean f931d = true;

    /* JADX INFO: renamed from: b */
    public final String f932b = "log";

    /* JADX INFO: renamed from: c */
    public final String f933c = "pictures";

    /* JADX INFO: renamed from: b */
    public abstract void mo1246b();

    /* JADX INFO: renamed from: c */
    public abstract JSONArray mo1247c();

    /* JADX INFO: renamed from: d */
    public abstract String m1248d();

    /* JADX INFO: renamed from: e */
    public abstract String m1249e(String str, String str2, String str3, String str4, long j11, long j12);

    /* JADX INFO: renamed from: f */
    public abstract String mo1250f(String str, String str2);

    /* JADX INFO: renamed from: a */
    public final void m1245a(Intent intent) {
        String stringExtra = intent.getStringExtra("eventInfo");
        if (C40832g.m89352g(stringExtra)) {
            JSONArray jSONArrayMo1247c = mo1247c();
            JSONObject jSONObject = new JSONObject();
            try {
                C40832g.m89354i(jSONObject, "log", new JSONObject(stringExtra));
            } catch (Exception unused) {
            }
            if (jSONArrayMo1247c != null && jSONArrayMo1247c.length() > 0) {
                C40832g.m89354i(jSONObject, "pictures", jSONArrayMo1247c);
            }
            C40829d.m89338c(this, System.currentTimeMillis() + m1248d(), jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1251g(String str) throws Throwable {
        String strM89337b = C40829d.m89337b(this, str);
        if (C40832g.m89352g(strM89337b)) {
            try {
                JSONObject jSONObject = new JSONObject(strM89337b);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("log");
                if (jSONObject.has("pictures") && f931d) {
                    JSONArray jSONArrayM89350e = C40832g.m89350e(jSONObject, "pictures");
                    String strMo1250f = mo1250f(jSONArrayM89350e.toString(), Locale.getDefault().toString());
                    if (TextUtils.isEmpty(strMo1250f)) {
                        strMo1250f = mo1250f(jSONArrayM89350e.toString(), Locale.getDefault().toString());
                    }
                    if (C40832g.m89352g(strMo1250f)) {
                        BaseResultEntity baseResultEntityM89353h = C40832g.m89353h(strMo1250f, BaseResultEntity.class);
                        if (baseResultEntityM89353h.success) {
                            String str2 = baseResultEntityM89353h.data;
                            if (C40832g.m89352g(str2)) {
                                String strM89351f = C40832g.m89351f(new JSONObject(str2), "fileId");
                                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("info");
                                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(C33556b3.f68963J);
                                jSONObjectOptJSONObject3.putOpt("picture_file_id", strM89351f);
                                jSONObjectOptJSONObject2.putOpt(C33556b3.f68963J, jSONObjectOptJSONObject3);
                                jSONObjectOptJSONObject.putOpt("info", jSONObjectOptJSONObject2);
                                jSONObject.putOpt("log", jSONObjectOptJSONObject);
                            }
                        }
                    }
                    jSONObject.remove("pictures");
                    C40829d.m89338c(this, str, jSONObject.toString());
                }
                if (m1252h(jSONObjectOptJSONObject)) {
                    C40829d.m89336a(getApplicationContext(), str);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m1252h(JSONObject jSONObject) {
        String strM89351f = C40832g.m89351f(jSONObject, "bizType");
        String strM89351f2 = C40832g.m89351f(jSONObject, "info");
        String strM89351f3 = C40832g.m89351f(jSONObject, "eventType");
        long jOptLong = jSONObject.optLong("eventTimestamp", 0L);
        long jOptLong2 = jSONObject.optLong("eventCostInMilliSeconds", 0L);
        if (jOptLong2 == 0) {
            jOptLong2 = 1;
        }
        String strM1249e = m1249e(Locale.getDefault().toString(), strM89351f, strM89351f2, strM89351f3, jOptLong, jOptLong2);
        if (TextUtils.isEmpty(strM1249e)) {
            strM1249e = m1249e(Locale.getDefault().toString(), strM89351f, strM89351f2, strM89351f3, jOptLong, jOptLong2);
        }
        return C40832g.m89353h(strM1249e, BaseResultEntity.class).success;
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onDestroy() {
        mo1246b();
        super.onDestroy();
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) throws Throwable {
        try {
            m1245a(intent);
            for (File file : getFilesDir().listFiles()) {
                if (file != null && file.exists()) {
                    String name = file.getName();
                    if (name.endsWith(m1248d())) {
                        m1251g(name);
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
