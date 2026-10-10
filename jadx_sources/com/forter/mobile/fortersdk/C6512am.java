package com.forter.mobile.fortersdk;

import android.content.Context;
import androidx.annotation.NonNull;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.net.IDN;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p587r7.AbstractC43936b;
import p634t7.C44699a;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.am */
/* JADX INFO: loaded from: classes.dex */
public final class C6512am {

    /* JADX INFO: renamed from: g */
    @NonNull
    public static String f10849g = "";

    /* JADX INFO: renamed from: h */
    @NonNull
    public static String f10850h = "";

    /* JADX INFO: renamed from: a */
    public Map<String, String> f10851a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C6585p f10852b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final List<InterfaceC6530e> f10853c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final List<InterfaceC6624w3> f10854d;

    /* JADX INFO: renamed from: e */
    public C44699a f10855e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC6624w3 f10856f;

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.am$a */
    /* JADX INFO: loaded from: classes45.dex */
    public enum a {
        CONNECT,
        DATA
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.am$b */
    public class b implements InterfaceC6624w3 {
        public b() {
        }

        @Override // com.forter.mobile.fortersdk.InterfaceC6624w3
        /* JADX INFO: renamed from: a */
        public final void mo12149a(C6513as c6513as, C6595r c6595r) {
            Iterator it = C6512am.this.f10854d.iterator();
            while (it.hasNext()) {
                ((InterfaceC6624w3) it.next()).mo12149a(c6513as, c6595r);
            }
        }
    }

    public C6512am() {
        this(new C6585p());
    }

    /* JADX INFO: renamed from: i */
    public static boolean m12142i(String str) {
        try {
            IDN.toASCII(str, 2);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public C6512am(@NonNull C6585p c6585p) {
        this.f10855e = null;
        this.f10856f = new b();
        this.f10852b = c6585p;
        ArrayList arrayList = new ArrayList();
        this.f10853c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f10854d = arrayList2;
        HashMap map = new HashMap();
        C44699a c44699aM12197p = C6520c.m12182b().m12197p();
        this.f10855e = c44699aM12197p;
        if (c44699aM12197p != null) {
            map.put("User-agent", c44699aM12197p.m98878d());
            map.put("x-forter-siteid", this.f10855e.m98892r());
            map.put("x-forter-nativeapp", AbstractC6539f3.m12264K());
        }
        this.f10851a = map;
        arrayList.add(new C6570m());
        arrayList2.add(new C6575n());
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static String m12138a(@NonNull a aVar) {
        return f10849g + "/" + AbstractC6539f3.m12272f(aVar.toString());
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m12144e(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strM12176a = C6519bk.m12176a(jSONObject.toString());
            jSONObject2.put("data", strM12176a);
            jSONObject2.put("type", "enc");
            jSONObject2.put(TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, AbstractC6539f3.m12289w(this.f10855e.m98892r() + strM12176a.length()));
            jSONObject2.put("mobileUID", AbstractC6539f3.m12288v(this.f10855e.m98886l()));
            return jSONObject2;
        } catch (Exception unused) {
            AbstractC6524c3.m12212d();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12145f(@NonNull C6513as c6513as) {
        try {
            for (InterfaceC6530e interfaceC6530e : this.f10853c) {
                if (interfaceC6530e != null) {
                    interfaceC6530e.mo12226a(c6513as);
                }
            }
        } catch (Exception e11) {
            e11.getMessage();
            AbstractC6524c3.m12209a();
        }
        this.f10852b.m12463f(c6513as);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m12148k(@NonNull String str, @NonNull String str2, @NonNull JSONObject jSONObject) {
        try {
            if (this.f10855e.m98870G()) {
                jSONObject = m12144e(jSONObject);
            }
            C6513as c6600s = this.f10855e.m98872I() ? new C6600s(AbstractC6539f3.m12274h(str2, jSONObject), this.f10856f) : new C6605t(str2, jSONObject, this.f10856f);
            Map<String, String> map = this.f10851a;
            if (map != null) {
                c6600s.f10863c = map;
            }
            m12145f(c6600s);
            return true;
        } catch (Exception unused) {
            "Failed to create and queue request: ".concat(String.valueOf(str));
            AbstractC6524c3.m12214f();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m12139b(C44699a c44699a, Context context) {
        String strM98886l = c44699a.m98886l();
        try {
            if (m12142i(strM98886l)) {
                String strM96881a = AbstractC43936b.m96881a(context);
                if (m12142i(strM96881a)) {
                    return "error-no-ids";
                }
                return strM96881a;
            }
            return strM98886l;
        } catch (Exception e11) {
            e11.getMessage();
            AbstractC6524c3.m12214f();
            return "error-ex";
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m12141g(C44699a c44699a) {
        f10849g = c44699a.m98875a();
        f10850h = c44699a.m98879e();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final JSONObject m12143d(@NonNull InterfaceC6619v3 interfaceC6619v3) {
        JSONObject jSONObjectMo12306d = interfaceC6619v3.mo12306d();
        try {
            C44699a c44699aM12197p = C6520c.m12182b().m12197p();
            this.f10855e = c44699aM12197p;
            jSONObjectMo12306d.put("mobileUID", AbstractC6539f3.m12288v(c44699aM12197p.m98886l()));
            jSONObjectMo12306d.put("accountID", AbstractC6539f3.m12288v(this.f10855e.m98877c()));
            jSONObjectMo12306d.put("timestamp", Long.toString(interfaceC6619v3.mo12305c()));
            jSONObjectMo12306d.put("sentTS", Long.toString(System.currentTimeMillis()));
            return jSONObjectMo12306d;
        } catch (JSONException unused) {
            AbstractC6524c3.m12214f();
            return jSONObjectMo12306d;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12146h(@NonNull C6544g3 c6544g3) {
        JSONObject jSONObjectM12143d = m12143d(c6544g3);
        String strM12138a = m12138a(a.CONNECT);
        try {
            jSONObjectM12143d.put("localTime", AbstractC6539f3.m12256C());
        } catch (JSONException unused) {
            AbstractC6524c3.m12214f();
        }
        return m12148k("app/active", strM12138a, jSONObjectM12143d);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m12147j(String str, @NonNull Context context) {
        try {
            C44699a c44699aM12197p = C6520c.m12182b().m12197p();
            String strM12139b = m12139b(c44699aM12197p, context);
            String strM98892r = c44699aM12197p.m98892r();
            m12145f(new C6600s(str.replace("#SID#", strM98892r).replace("#MID#", strM12139b).replace("#GID#", AbstractC6539f3.m12267a()), this.f10856f));
            return true;
        } catch (Exception unused) {
            AbstractC6524c3.m12215g();
            return false;
        }
    }
}
