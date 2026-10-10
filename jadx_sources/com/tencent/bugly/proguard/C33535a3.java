package com.tencent.bugly.proguard;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.a3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C33535a3 implements InterfaceC33834o8 {

    /* JADX INFO: renamed from: b */
    public static final String f68793b = "RMonitor_config";

    /* JADX INFO: renamed from: a */
    public C33890r2 f68794a = null;

    @Override // com.tencent.bugly.proguard.InterfaceC33834o8
    /* JADX INFO: renamed from: a */
    public C33890r2 mo72289a() {
        return m72290a(C33632eg.m72965b());
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33834o8
    /* JADX INFO: renamed from: a */
    public boolean mo72291a(C33890r2 c33890r2) {
        String message;
        boolean z11 = false;
        if (c33890r2 == null) {
            return false;
        }
        this.f68794a = c33890r2;
        SharedPreferences.Editor editorM72964a = C33632eg.m72964a();
        if (editorM72964a != null) {
            try {
                C33930t2 c33930t2M74721b = c33890r2.m74721b();
                editorM72964a.putLong(InterfaceC33611dg.f69600i, c33930t2M74721b.f72030d);
                editorM72964a.putLong(InterfaceC33611dg.f69601j, c33930t2M74721b.f72031e);
                editorM72964a.putLong("config_latest_update_time", c33930t2M74721b.f72032f);
                message = "";
                if (c33890r2.m74722c()) {
                    JSONObject jSONObject = c33930t2M74721b.f72027a;
                    String string = jSONObject == null ? "" : jSONObject.toString();
                    if (string == null) {
                        string = "";
                    }
                    editorM72964a.putString(InterfaceC33611dg.f69597f, string);
                    editorM72964a.putString(InterfaceC33611dg.f69599h, c33930t2M74721b.f72029c);
                }
                JSONObject jSONObjectM74903a = c33890r2.m74719a().m74903a();
                String string2 = jSONObjectM74903a == null ? "" : jSONObjectM74903a.toString();
                if (string2 == null) {
                    string2 = "";
                }
                editorM72964a.putString(InterfaceC33611dg.f69602k, string2);
                editorM72964a.commit();
                z11 = true;
            } catch (Throwable th2) {
                message = th2.getMessage();
            }
        } else {
            message = "editor is null.";
        }
        if (!z11) {
            Logger.INSTANCE.mo77131e("RMonitor_config", C33770l7.m73937a("save config apply data fail for ", message));
        }
        return z11;
    }

    /* JADX INFO: renamed from: a */
    public final C33890r2 m72290a(SharedPreferences sharedPreferences) {
        C33890r2 c33890r2 = new C33890r2();
        if (sharedPreferences == null) {
            return c33890r2;
        }
        try {
            C33930t2 c33930t2 = c33890r2.f71603c;
            String string = sharedPreferences.getString(InterfaceC33611dg.f69597f, null);
            if (!TextUtils.isEmpty(string)) {
                c33930t2.f72027a = new JSONObject(string);
            }
            c33930t2.f72029c = sharedPreferences.getString(InterfaceC33611dg.f69599h, c33930t2.f72029c);
            c33930t2.f72030d = sharedPreferences.getLong(InterfaceC33611dg.f69600i, c33930t2.f72030d);
            c33930t2.f72032f = sharedPreferences.getLong("config_latest_update_time", c33930t2.f72032f);
            C33910s2 c33910s2 = c33890r2.f71602b;
            String string2 = sharedPreferences.getString(InterfaceC33611dg.f69602k, "");
            if (!TextUtils.isEmpty(string2)) {
                c33910s2.m74905a(new JSONObject(string2));
            }
            c33930t2.m75019a("apply result from cache");
            return c33890r2;
        } catch (Throwable th2) {
            C33890r2 c33890r3 = this.f68794a;
            if (c33890r3 != null) {
                c33890r2 = c33890r3;
            }
            Logger.INSTANCE.mo77131e("RMonitor_config", C33799mf.m74131a("load apply result fail for ", th2));
            return c33890r2;
        }
    }
}
