package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.provider.CredentialEntry;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.j3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33724j3 {

    /* JADX INFO: renamed from: h */
    public static int f70324h = 0;

    /* JADX INFO: renamed from: i */
    public static final String f70325i = "hasUserCallback";

    /* JADX INFO: renamed from: j */
    public static final List<Integer> f70326j = new a();

    /* JADX INFO: renamed from: k */
    public static final Map<Integer, Pair<String, String>> f70327k = new b();

    /* JADX INFO: renamed from: l */
    public static final ArrayList<g> f70328l = new c();

    /* JADX INFO: renamed from: m */
    public static final Map<Integer, Integer> f70329m = new d();

    /* JADX INFO: renamed from: n */
    public static final Map<Integer, String> f70330n = new e();

    /* JADX INFO: renamed from: o */
    public static final Map<Integer, String> f70331o = new f();

    /* JADX INFO: renamed from: a */
    public final Context f70332a;

    /* JADX INFO: renamed from: b */
    public final C33905rh f70333b;

    /* JADX INFO: renamed from: c */
    public final C33620e4 f70334c;

    /* JADX INFO: renamed from: d */
    public final C33863pg f70335d;

    /* JADX INFO: renamed from: e */
    public InterfaceC34063zf f70336e;

    /* JADX INFO: renamed from: f */
    public C33555b2.a f70337f;

    /* JADX INFO: renamed from: g */
    public boolean f70338g;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$g */
    /* JADX INFO: compiled from: BUGLY */
    public static abstract class g {

        /* JADX INFO: renamed from: a */
        public final int f70339a;

        public /* synthetic */ g(int i11, a aVar) {
            this(i11);
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo73521a();

        public g(int i11) {
            this.f70339a = i11;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m73522a(CrashDetailBean crashDetailBean) {
            return this.f70339a == crashDetailBean.f68631c;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$h */
    /* JADX INFO: compiled from: BUGLY */
    public static class h extends g {
        public /* synthetic */ h(a aVar) {
            this();
        }

        public h() {
            super(3, null);
        }

        @Override // com.tencent.bugly.proguard.C33724j3.g
        /* JADX INFO: renamed from: a */
        public boolean mo73521a() {
            return C33745k3.m73653l().m73686r();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$i */
    /* JADX INFO: compiled from: BUGLY */
    public static class i extends g {
        public /* synthetic */ i(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33724j3.g
        /* JADX INFO: renamed from: a */
        public boolean mo73521a() {
            return true;
        }

        public i() {
            super(7, null);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$j */
    /* JADX INFO: compiled from: BUGLY */
    public static class j extends g {
        public /* synthetic */ j(a aVar) {
            this();
        }

        @Override // com.tencent.bugly.proguard.C33724j3.g
        /* JADX INFO: renamed from: a */
        public boolean mo73521a() {
            return true;
        }

        public j() {
            super(2, null);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$k */
    /* JADX INFO: compiled from: BUGLY */
    public static class k extends g {
        public /* synthetic */ k(a aVar) {
            this();
        }

        public k() {
            super(0, null);
        }

        @Override // com.tencent.bugly.proguard.C33724j3.g
        /* JADX INFO: renamed from: a */
        public boolean mo73521a() {
            return C33745k3.m73653l().m73687s();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$l */
    /* JADX INFO: compiled from: BUGLY */
    public static class l extends g {
        public /* synthetic */ l(a aVar) {
            this();
        }

        public l() {
            super(5, null);
        }

        @Override // com.tencent.bugly.proguard.C33724j3.g
        /* JADX INFO: renamed from: a */
        public boolean mo73521a() {
            return C33745k3.m73653l().m73688t();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$m */
    /* JADX INFO: compiled from: BUGLY */
    public static class m extends g {
        public /* synthetic */ m(a aVar) {
            this();
        }

        public m() {
            super(6, null);
        }

        @Override // com.tencent.bugly.proguard.C33724j3.g
        /* JADX INFO: renamed from: a */
        public boolean mo73521a() {
            return C33745k3.m73653l().m73689u();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$n */
    /* JADX INFO: compiled from: BUGLY */
    public static class n extends g {
        public /* synthetic */ n(a aVar) {
            this();
        }

        public n() {
            super(1, null);
        }

        @Override // com.tencent.bugly.proguard.C33724j3.g
        /* JADX INFO: renamed from: a */
        public boolean mo73521a() {
            return C33745k3.m73653l().m73687s();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$o */
    /* JADX INFO: compiled from: BUGLY */
    public static class o extends g {
        public /* synthetic */ o(a aVar) {
            this();
        }

        public o() {
            super(4, null);
        }

        @Override // com.tencent.bugly.proguard.C33724j3.g
        /* JADX INFO: renamed from: a */
        public boolean mo73521a() {
            return C33745k3.m73653l().m73690v();
        }
    }

    /* JADX INFO: renamed from: a */
    public CrashDetailBean m73492a(List<C33619e3> list, CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2;
        List<CrashDetailBean> listM73495a;
        if (list == null || list.isEmpty()) {
            return crashDetailBean;
        }
        ArrayList arrayList = new ArrayList(10);
        for (C33619e3 c33619e3 : list) {
            if (c33619e3.f69666f) {
                arrayList.add(c33619e3);
            }
        }
        if (arrayList.isEmpty() || (listM73495a = m73495a(arrayList)) == null || listM73495a.isEmpty()) {
            crashDetailBean2 = null;
        } else {
            Collections.sort(listM73495a);
            crashDetailBean2 = listM73495a.get(0);
            m73466a(crashDetailBean2, listM73495a);
        }
        CrashDetailBean crashDetailBeanM73481b = m73481b(crashDetailBean2, crashDetailBean);
        m73482b(crashDetailBeanM73481b, list);
        m73465a(crashDetailBeanM73481b, crashDetailBean);
        return crashDetailBeanM73481b;
    }

    /* JADX INFO: renamed from: b */
    public List<C33619e3> m73508b(List<C33619e3> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (C33619e3 c33619e3 : list) {
            if (c33619e3.f69665e && c33619e3.f69663c <= jCurrentTimeMillis - 86400000) {
                arrayList.add(c33619e3);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public ContentValues m73511c(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j11 = crashDetailBean.f68629b;
            if (j11 > 0) {
                contentValues.put("_id", Long.valueOf(j11));
            }
            contentValues.put(C33641f4.f69827n, Long.valueOf(crashDetailBean.f68602A));
            contentValues.put(C33641f4.f69831r, crashDetailBean.f68605D);
            contentValues.put(C33641f4.f69832s, Integer.valueOf(crashDetailBean.f68639g ? 1 : 0));
            contentValues.put(C33641f4.f69833t, Integer.valueOf(crashDetailBean.f68662s ? 1 : 0));
            contentValues.put(C33641f4.f69834u, Integer.valueOf(crashDetailBean.f68664u));
            contentValues.put(C33641f4.f69830q, C33571bi.m72596a(crashDetailBean));
            return contentValues;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m73513d(List<CrashDetailBean> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                for (CrashDetailBean crashDetailBean : list) {
                    sb2.append(" or ");
                    sb2.append("_id");
                    sb2.append(" = ");
                    sb2.append(crashDetailBean.f68629b);
                }
                String string = sb2.toString();
                if (string.length() > 0) {
                    string = string.substring(4);
                }
                sb2.setLength(0);
                C34012x4.m75434a("deleted %s data %d", C33641f4.f69817d, Integer.valueOf(C33620e4.m72891a().m72897a(C33641f4.f69817d, string, (String[]) null, (InterfaceC33599d4) null, true)));
            } catch (Throwable th2) {
                if (C34012x4.m75438b(th2)) {
                    return;
                }
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m73514e(List<C33619e3> list) {
        List<CrashDetailBean> listM73495a = m73495a(list);
        if (listM73495a == null || listM73495a.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CrashDetailBean crashDetailBean : listM73495a) {
            String str = f70331o.get(Integer.valueOf(crashDetailBean.f68631c));
            if (!TextUtils.isEmpty(str)) {
                C34012x4.m75434a("find expired data,crashId:%s eventType:%s", crashDetailBean.f68633d, str);
                arrayList.add(new C33590cg.d(crashDetailBean.f68633d, str, crashDetailBean.f68602A, false, 0L, C33590cg.f69441k, null));
            }
        }
        C33590cg.b.f69449a.m72709b(arrayList);
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends ArrayList<Integer> {
        public a() {
            add(0);
            add(1);
            add(3);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b extends HashMap<Integer, Pair<String, String>> {
        public b() {
            put(3, new Pair(C33556b3.f69016Z, C33556b3.f69013Y));
            put(7, new Pair(C33556b3.f69044g0, C33556b3.f69048h0));
            put(0, new Pair("200", C33556b3.f68995S));
            put(1, new Pair("201", C33556b3.f69001U));
            put(2, new Pair(C33556b3.f69010X, C33556b3.f69007W));
            put(4, new Pair(C33556b3.f69024b0, "104"));
            put(6, new Pair("206", C33556b3.f69032d0));
            put(5, new Pair(C33556b3.f69036e0, C33556b3.f69040f0));
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c extends ArrayList<g> {
        public c() {
            a aVar = null;
            add(new h(aVar));
            add(new i(aVar));
            add(new j(aVar));
            add(new k(aVar));
            add(new n(aVar));
            add(new o(aVar));
            add(new l(aVar));
            add(new m(aVar));
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$d */
    /* JADX INFO: compiled from: BUGLY */
    public class d extends HashMap<Integer, Integer> {
        public d() {
            put(3, 4);
            put(7, 7);
            put(2, 1);
            put(0, 0);
            put(1, 2);
            put(4, 3);
            put(5, 5);
            put(6, 6);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$e */
    /* JADX INFO: compiled from: BUGLY */
    public class e extends HashMap<Integer, String> {
        public e() {
            put(3, C33590cg.f69437g);
            put(0, C33590cg.f69433c);
            put(1, C33590cg.f69435e);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.j3$f */
    /* JADX INFO: compiled from: BUGLY */
    public class f extends HashMap<Integer, String> {
        public f() {
            put(3, C33590cg.f69438h);
            put(0, C33590cg.f69434d);
            put(1, C33590cg.f69436f);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m73490k(CrashDetailBean crashDetailBean) {
        for (g gVar : f70328l) {
            if (gVar.m73522a(crashDetailBean)) {
                return gVar.mo73521a();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static void m73491l(CrashDetailBean crashDetailBean) {
        try {
            if (!f70326j.contains(Integer.valueOf(crashDetailBean.f68631c))) {
                C34012x4.m75443e("[crash] a caught exception occur, handling...", new Object[0]);
                return;
            }
            C33543ab c33543ab = new C33543ab();
            c33543ab.f68820b = 1;
            c33543ab.f68821c = crashDetailBean.f68611J;
            c33543ab.f68822d = crashDetailBean.f68612K;
            c33543ab.f68823e = crashDetailBean.f68602A;
            C33620e4.m72891a().m72916c(1);
            C33620e4.m72891a().m72918d(c33543ab);
            C34012x4.m75443e("[crash] a crash occur, handling...", new Object[0]);
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m73515f(CrashDetailBean crashDetailBean) {
        C33765l2 c33765l2;
        if (crashDetailBean == null) {
            return;
        }
        if (this.f70337f == null && this.f70336e == null) {
            return;
        }
        if (!m73490k(crashDetailBean)) {
            C34012x4.m75434a("Should not call back.", new Object[0]);
            return;
        }
        try {
            Map<Integer, Integer> map = f70329m;
            if (!map.containsKey(Integer.valueOf(crashDetailBean.f68631c))) {
                C34012x4.m75444f("Cannot get crash type for crashBean type:" + crashDetailBean.f68631c, new Object[0]);
                return;
            }
            int iIntValue = map.get(Integer.valueOf(crashDetailBean.f68631c)).intValue();
            boolean z11 = true;
            if (crashDetailBean.f68631c != 1) {
                z11 = false;
            }
            m73467a(crashDetailBean, m73509b(crashDetailBean, iIntValue, z11, -1234567890));
            C34012x4.m75442d("[crash callback] start user's callback:onCrashHandleStart2GetExtraDatas()", new Object[0]);
            m73468a(crashDetailBean, m73503a(crashDetailBean, iIntValue, z11, -1234567890));
            m73498a(crashDetailBean, z11, -1234567890);
            crashDetailBean.f68638f0 = C33765l2.m73827s().m73835H();
            synchronized (C33765l2.class) {
                c33765l2 = C33765l2.f70700C0;
            }
            crashDetailBean.f68640g0 = c33765l2.m73828A();
            crashDetailBean.f68642h0 = C33765l2.m73827s().m73880i();
            crashDetailBean.f68644i0 = C33765l2.m73827s().m73878h();
            if (crashDetailBean.f68642h0 == null) {
                crashDetailBean.f68642h0 = new HashMap();
            }
            crashDetailBean.f68642h0.put(f70325i, CredentialEntry.TRUE_STRING);
        } catch (Throwable th2) {
            C34012x4.m75444f("crash handle callback something wrong! %s", th2.getClass().getName());
            if (C34012x4.m75432a(LogState.WARN, th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m73516g(CrashDetailBean crashDetailBean) {
        int i11 = crashDetailBean.f68631c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3 && !C33745k3.m73653l().m73686r()) {
                    return;
                }
            } else if (!C33745k3.m73653l().m73687s()) {
                return;
            }
        } else if (!C33745k3.m73653l().m73687s()) {
            return;
        }
        if (this.f70336e != null) {
            C34012x4.m75434a("Calling 'onCrashHandleEnd' of RQD crash listener.", new Object[0]);
            this.f70336e.onCrashHandleEnd(crashDetailBean.f68631c == 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m73517h(CrashDetailBean crashDetailBean) {
        String str = f70330n.get(Integer.valueOf(crashDetailBean.f68631c));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C33590cg.b.f69449a.m72708b(new C33590cg.d(crashDetailBean.f68633d, str, crashDetailBean.f68602A, true, 0L, C33590cg.f69439i, null));
    }

    /* JADX INFO: renamed from: i */
    public void m73518i(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return;
        }
        ContentValues contentValuesM73511c = m73511c(crashDetailBean);
        if (contentValuesM73511c != null) {
            long jM72899a = C33620e4.m72891a().m72899a(C33641f4.f69817d, contentValuesM73511c, (InterfaceC33599d4) null, true);
            if (jM72899a >= 0) {
                C34012x4.m75434a("insert %s success!", C33641f4.f69817d);
                crashDetailBean.f68629b = jM72899a;
            }
        }
        if (C33745k3.f70494F) {
            m73519j(crashDetailBean);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m73519j(CrashDetailBean crashDetailBean) {
        String absolutePath;
        try {
            C34012x4.m75434a("save eup logs", new Object[0]);
            String str = "#--------\npackage:" + C33765l2.m73827s().m73872e() + "\nversion:" + crashDetailBean.f68649l + "\nsdk:" + crashDetailBean.f68647k + "\nprocess:" + crashDetailBean.f68611J + "\ndate:" + C33571bi.m72606b(new Date(crashDetailBean.f68602A)) + "\ntype:" + crashDetailBean.f68666w + "\nmessage:" + crashDetailBean.f68667x + "\nstack:\n" + crashDetailBean.f68669z + "\neupID:" + crashDetailBean.f68633d + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
            if (C33745k3.f70495G == null) {
                File externalFilesDir = this.f70332a.getExternalFilesDir("/Tencent/Bugly");
                absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
            } else {
                File file = new File(C33745k3.f70495G);
                if (file.isFile()) {
                    file = file.getParentFile();
                }
                absolutePath = file.getAbsolutePath();
            }
            C33539a7.m72318a(absolutePath + "/euplog.txt", str, C33745k3.f70496H);
        } catch (Throwable th2) {
            C34012x4.m75444f("rqdp{  save error} %s", th2.toString());
            if (C34012x4.m75432a(LogState.WARN, th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public C33724j3(int i11, Context context, C33905rh c33905rh, C33620e4 c33620e4, C33863pg c33863pg, C33555b2.a aVar, InterfaceC34063zf interfaceC34063zf) {
        this.f70338g = false;
        f70324h = i11;
        this.f70332a = context;
        this.f70333b = c33905rh;
        this.f70334c = c33620e4;
        this.f70335d = c33863pg;
        this.f70337f = aVar;
        this.f70336e = interfaceC34063zf;
        AbstractC34022xe abstractC34022xeM77083a = C35101b.m77082d().m77083a(C33600d5.f69503h);
        if (abstractC34022xeM77083a instanceof C33600d5) {
            this.f70338g = ((C33600d5) abstractC34022xeM77083a).m72775b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static CrashDetailBean m73481b(CrashDetailBean crashDetailBean, CrashDetailBean crashDetailBean2) {
        if (crashDetailBean != null) {
            return crashDetailBean;
        }
        crashDetailBean2.f68662s = true;
        crashDetailBean2.f68604C = 0;
        crashDetailBean2.f68603B = "";
        return crashDetailBean2;
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList<C33987w> m73489e(CrashDetailBean crashDetailBean) {
        Map<String, PlugInBean> map = crashDetailBean.f68659q;
        if (map == null || map.isEmpty()) {
            return null;
        }
        ArrayList<C33987w> arrayList = new ArrayList<>(crashDetailBean.f68659q.size());
        for (Map.Entry<String, PlugInBean> entry : crashDetailBean.f68659q.entrySet()) {
            C33987w c33987w = new C33987w();
            c33987w.f72388q = entry.getValue().f68559b;
            c33987w.f72390s = entry.getValue().f68561d;
            c33987w.f72392u = entry.getValue().f68560c;
            arrayList.add(c33987w);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m73482b(CrashDetailBean crashDetailBean, List<C33619e3> list) {
        StringBuilder sb2 = new StringBuilder(64);
        for (C33619e3 c33619e3 : list) {
            if (!c33619e3.f69666f && !c33619e3.f69665e) {
                if (!crashDetailBean.f68603B.contains("" + c33619e3.f69663c)) {
                    crashDetailBean.f68604C++;
                    sb2.append(c33619e3.f69663c);
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
            }
        }
        crashDetailBean.f68603B += sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public void m73512c(List<C33619e3> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        Iterator<C33619e3> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().f69662b);
            sb2.append(",");
        }
        StringBuilder sb3 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
        sb3.append(")");
        String string = sb3.toString();
        sb3.setLength(0);
        try {
            C34012x4.m75434a("deleted %s data %d", C33641f4.f69817d, Integer.valueOf(C33620e4.m72891a().m72897a(C33641f4.f69817d, string, (String[]) null, (InterfaceC33599d4) null, true)));
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m73488d(CrashDetailBean crashDetailBean) {
        try {
            Pair<String, String> pair = f70327k.get(Integer.valueOf(crashDetailBean.f68631c));
            if (pair == null) {
                C34012x4.m75437b("crash type error! %d", Integer.valueOf(crashDetailBean.f68631c));
                return "";
            }
            if (crashDetailBean.f68662s) {
                return (String) pair.first;
            }
            return (String) pair.second;
        } catch (Exception e11) {
            C34012x4.m75438b(e11);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73466a(CrashDetailBean crashDetailBean, List<CrashDetailBean> list) {
        String[] strArrSplit;
        StringBuilder sb2 = new StringBuilder(128);
        for (int i11 = 1; i11 < list.size(); i11++) {
            String str = list.get(i11).f68603B;
            if (str != null && (strArrSplit = str.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE)) != null) {
                for (String str2 : strArrSplit) {
                    if (!crashDetailBean.f68603B.contains(str2)) {
                        crashDetailBean.f68604C++;
                        sb2.append(str2);
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                }
            }
        }
        crashDetailBean.f68603B += sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m73486b(String str) {
        String str2 = C33745k3.f70505Q;
        if (str2 != null && !str2.isEmpty()) {
            try {
                C34012x4.m75434a("Crash regular filter for crash stack is: %s", C33745k3.f70505Q);
                if (Pattern.compile(C33745k3.f70505Q).matcher(str).find()) {
                    C34012x4.m75431a(LogState.WARN, "This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                    return true;
                }
            } catch (Exception e11) {
                C34012x4.m75438b(e11);
                C34012x4.m75431a(LogState.WARN, "Failed to compile " + C33745k3.f70505Q, new Object[0]);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m73465a(CrashDetailBean crashDetailBean, CrashDetailBean crashDetailBean2) {
        if (crashDetailBean.f68602A != crashDetailBean2.f68602A) {
            if (crashDetailBean.f68603B.contains("" + crashDetailBean2.f68602A)) {
                return;
            }
            crashDetailBean.f68604C++;
            crashDetailBean.f68603B += crashDetailBean2.f68602A + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m73487c(ArrayList<C33908s0> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C33908s0((byte) 1, "log.txt", str.getBytes("utf-8")));
            } catch (Exception e11) {
                e11.printStackTrace();
                C34012x4.m75438b(e11);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C33619e3 m73506b(CrashDetailBean crashDetailBean) {
        try {
            C33619e3 c33619e3 = new C33619e3();
            c33619e3.f69662b = crashDetailBean.f68629b;
            c33619e3.f69663c = crashDetailBean.f68602A;
            c33619e3.f69664d = crashDetailBean.f68605D;
            c33619e3.f69665e = crashDetailBean.f68639g;
            c33619e3.f69666f = crashDetailBean.f68662s;
            c33619e3.f69667g = crashDetailBean.f68664u;
            return c33619e3;
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m73502a(CrashDetailBean crashDetailBean, boolean z11) {
        return m73501a(crashDetailBean, -123456789, z11);
    }

    /* JADX INFO: renamed from: a */
    public boolean m73501a(CrashDetailBean crashDetailBean, int i11, boolean z11) {
        if (crashDetailBean == null) {
            C34012x4.m75444f("CrashBean is null, won't handle.", new Object[0]);
            return true;
        }
        m73518i(crashDetailBean);
        if (crashDetailBean.f68631c == 0) {
            C33922se.m74981a().m74985a(C33922se.c.save.ordinal(), true, true);
        }
        if (crashDetailBean.f68631c == 3) {
            NativeCrashHandler.getInstance().modifyProcessingState(C33922se.c.save.ordinal(), true);
        }
        if (crashDetailBean.f68631c == 1 && i11 != -123456789) {
            NativeCrashHandler.getInstance().modifyProcessingState(C33922se.c.save.ordinal(), true);
        }
        if (crashDetailBean.f68631c != 1) {
            String strM72574a = C33571bi.m72574a(this.f70332a, C33745k3.f70517x, C33745k3.f70518y, C33745k3.f70493E, crashDetailBean.f68602A, C33745k3.f70499K, C33745k3.f70519z);
            crashDetailBean.f68607F = strM72574a;
            if (strM72574a != null && strM72574a.length() >= 50) {
                int i12 = crashDetailBean.f68631c;
                if (i12 == 0) {
                    C33922se.m74981a().m74983a(C33922se.b.syslogFile.ordinal(), true);
                } else if (i12 == 3) {
                    NativeCrashHandler.getInstance().modifyAttachmentState(C33922se.b.syslogFile.ordinal());
                }
            }
        }
        if (z11) {
            m73515f(crashDetailBean);
        }
        if (crashDetailBean.f68631c == 0) {
            C33922se.m74981a().m74985a(C33922se.c.callback.ordinal(), false, true);
        }
        if (crashDetailBean.f68631c == 3) {
            NativeCrashHandler.getInstance().modifyProcessingState(C33922se.c.callback.ordinal(), false);
        }
        if (crashDetailBean.f68631c == 1 && i11 != -123456789) {
            NativeCrashHandler.getInstance().modifyProcessingState(C33922se.c.callback.ordinal(), false);
        }
        if (m73480a(crashDetailBean.f68669z) || m73486b(crashDetailBean.f68669z)) {
            return true;
        }
        m73491l(crashDetailBean);
        List<C33619e3> listM73494a = m73494a();
        ArrayList arrayList = new ArrayList(10);
        if (listM73494a != null && listM73494a.size() > 0) {
            arrayList.addAll(m73508b(listM73494a));
            listM73494a.removeAll(arrayList);
            if (listM73494a.size() > 20) {
                m73496a(5);
            }
            if (m73510b(crashDetailBean, listM73494a, arrayList)) {
                return true;
            }
        }
        m73518i(crashDetailBean);
        m73517h(crashDetailBean);
        m73512c(arrayList);
        C34012x4.m75443e("[crash] save crash success", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m73510b(CrashDetailBean crashDetailBean, List<C33619e3> list, List<C33619e3> list2) {
        C33619e3 c33619e3M73506b;
        if (!m73500a(crashDetailBean)) {
            return false;
        }
        ArrayList<C33619e3> arrayList = new ArrayList(10);
        if (!m73479a(crashDetailBean, list, arrayList)) {
            try {
                if (arrayList.size() >= C33745k3.f70515v) {
                }
            } catch (Exception e11) {
                C34012x4.m75438b(e11);
                C34012x4.m75431a(LogState.WARN, "Failed to merge crash.", new Object[0]);
            }
            return false;
        }
        C34012x4.m75442d("same crash occur too much do merged!", new Object[0]);
        CrashDetailBean crashDetailBeanM73492a = m73492a((List<C33619e3>) arrayList, crashDetailBean);
        for (C33619e3 c33619e3 : arrayList) {
            if (c33619e3.f69662b != crashDetailBeanM73492a.f68629b) {
                list2.add(c33619e3);
            }
        }
        if (crashDetailBean.f68629b != crashDetailBeanM73492a.f68629b && (c33619e3M73506b = m73506b(crashDetailBean)) != null) {
            list2.add(c33619e3M73506b);
        }
        m73518i(crashDetailBeanM73492a);
        m73512c(list2);
        C34012x4.m75431a(LogState.INFO, "[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public List<CrashDetailBean> m73507b() {
        StrategyBean strategyBeanM74582c = C33863pg.m74576b().m74582c();
        if (strategyBeanM74582c == null) {
            C34012x4.m75444f("have not synced remote!", new Object[0]);
            return null;
        }
        if (!strategyBeanM74582c.f68568d) {
            C34012x4.m75444f("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            C34012x4.m75431a(LogState.INFO, "[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM72601b = C33571bi.m72601b();
        List<C33619e3> listM73494a = m73494a();
        C34012x4.m75434a("Size of crash list loaded from DB: %s", Integer.valueOf(listM73494a.size()));
        if (listM73494a.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(m73508b(listM73494a));
        listM73494a.removeAll(arrayList);
        Iterator<C33619e3> it = listM73494a.iterator();
        while (it.hasNext()) {
            C33619e3 next = it.next();
            long j11 = next.f69663c;
            if (j11 < jM72601b - C33745k3.f70492D) {
                arrayList2.add(next);
                it.remove();
                arrayList.add(next);
            } else if (next.f69665e) {
                if (j11 >= jCurrentTimeMillis - 86400000) {
                    it.remove();
                } else if (!next.f69666f) {
                    it.remove();
                    arrayList.add(next);
                }
            } else if (next.f69667g >= 3 && j11 < jCurrentTimeMillis - 86400000) {
                it.remove();
                arrayList.add(next);
            }
        }
        m73514e(arrayList2);
        if (arrayList.size() > 0) {
            m73512c(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        List<CrashDetailBean> listM73495a = m73495a(listM73494a);
        if (listM73495a != null && listM73495a.size() > 0) {
            String str = C33765l2.m73827s().f70714F;
            Iterator<CrashDetailBean> it2 = listM73495a.iterator();
            while (it2.hasNext()) {
                CrashDetailBean next2 = it2.next();
                if (!str.equals(next2.f68649l)) {
                    it2.remove();
                    arrayList3.add(next2);
                }
            }
        }
        if (arrayList3.size() > 0) {
            m73513d(arrayList3);
        }
        return listM73495a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73480a(String str) {
        String str2 = C33745k3.f70504P;
        if (str2 != null && !str2.isEmpty()) {
            C34012x4.m75434a("Crash filter for crash stack is: %s", C33745k3.f70504P);
            if (str.contains(C33745k3.f70504P)) {
                C34012x4.m75431a(LogState.WARN, "This crash contains the filter string set. It will not be record and upload.", new Object[0]);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73479a(CrashDetailBean crashDetailBean, List<C33619e3> list, List<C33619e3> list2) {
        boolean z11 = false;
        for (C33619e3 c33619e3 : list) {
            if (crashDetailBean.f68629b != c33619e3.f69662b && crashDetailBean.f68605D.equals(c33619e3.f69664d)) {
                if (c33619e3.f69666f) {
                    z11 = true;
                }
                list2.add(c33619e3);
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: a */
    public boolean m73500a(CrashDetailBean crashDetailBean) {
        int i11 = crashDetailBean.f68631c;
        boolean z11 = i11 == 0 || i11 == 1 || i11 == 3;
        if (C33900rc.f71640i) {
            return false;
        }
        if (!z11) {
            return !this.f70338g;
        }
        if (crashDetailBean.f68637f.booleanValue() || C33765l2.m73827s().m73838K()) {
            return false;
        }
        return C33745k3.f70516w;
    }

    /* JADX INFO: renamed from: a */
    public void m73497a(CrashDetailBean crashDetailBean, long j11, boolean z11) {
        if (C33745k3.f70497I) {
            C34012x4.m75442d("try to upload right now", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(crashDetailBean);
            m73499a(arrayList, j11, z11, crashDetailBean.f68631c == 7, z11);
            return;
        }
        C34012x4.m75442d("do not upload spot crash right now, crash would be uploaded when app next start", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public void m73499a(List<CrashDetailBean> list, long j11, boolean z11, boolean z12, boolean z13) {
        C33905rh c33905rh = this.f70333b;
        if (c33905rh == null) {
            C34012x4.m75444f("warn: upload manager is null", new Object[0]);
            return;
        }
        if (!z13 && !c33905rh.m74890a(C33745k3.f70507n)) {
            C34012x4.m75444f("warn: not crashHappen or not should upload", new Object[0]);
            return;
        }
        if (!this.f70335d.m74582c().f68568d) {
            C34012x4.m75444f("[crash] server closed bugly in this app. please check your app id if is correct, and re-install it", new Object[0]);
            return;
        }
        if (list != null && list.size() != 0) {
            if (C33765l2.f70705H0) {
                C33971v3.m75269a(this.f70332a, this.f70333b, list, j11, z11);
                return;
            } else {
                C33971v3.m75267a(this.f70332a, this.f70335d, f70324h, this.f70333b, list, j11, z11, z12);
                return;
            }
        }
        C34012x4.m75444f("warn: crashList is null or crashList num is 0", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public List<CrashDetailBean> m73495a(List<C33619e3> list) {
        Throwable th2;
        Cursor cursorM72901a;
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        Iterator<C33619e3> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().f69662b);
            sb2.append(",");
        }
        if (sb2.toString().contains(",")) {
            sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
        }
        sb2.append(")");
        String string = sb2.toString();
        sb2.setLength(0);
        try {
            cursorM72901a = C33620e4.m72891a().m72901a(C33641f4.f69817d, null, string, null, null, true);
            if (cursorM72901a == null) {
                if (cursorM72901a != null) {
                    cursorM72901a.close();
                }
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                sb2.append("_id");
                sb2.append(" in ");
                sb2.append("(");
                int i11 = 0;
                while (cursorM72901a.moveToNext()) {
                    CrashDetailBean crashDetailBeanM73505b = m73505b(cursorM72901a);
                    if (crashDetailBeanM73505b != null) {
                        arrayList.add(crashDetailBeanM73505b);
                    } else {
                        try {
                            sb2.append(cursorM72901a.getLong(cursorM72901a.getColumnIndex("_id")));
                            sb2.append(",");
                            i11++;
                        } catch (Throwable unused) {
                            C34012x4.m75444f("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb2.toString().contains(",")) {
                    sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
                }
                sb2.append(")");
                String string2 = sb2.toString();
                if (i11 > 0) {
                    C34012x4.m75444f("deleted %s illegal data %d", C33641f4.f69817d, Integer.valueOf(C33620e4.m72891a().m72897a(C33641f4.f69817d, string2, (String[]) null, (InterfaceC33599d4) null, true)));
                }
                cursorM72901a.close();
                return arrayList;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    if (!C34012x4.m75438b(th2)) {
                        th2.printStackTrace();
                    }
                    return null;
                } finally {
                    if (cursorM72901a != null) {
                        cursorM72901a.close();
                    }
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            cursorM72901a = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public CrashDetailBean m73505b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex(C33641f4.f69830q));
            if (blob == null) {
                return null;
            }
            long j11 = cursor.getLong(cursor.getColumnIndex("_id"));
            CrashDetailBean crashDetailBean = (CrashDetailBean) C33571bi.m72571a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean == null) {
                return crashDetailBean;
            }
            crashDetailBean.f68629b = j11;
            return crashDetailBean;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m73509b(CrashDetailBean crashDetailBean, int i11, boolean z11, int i12) {
        if (this.f70336e != null) {
            C34012x4.m75434a("Calling 'onCrashHandleStart' of RQD crash listener.", new Object[0]);
            this.f70336e.onCrashHandleStart(z11, crashDetailBean.f68667x);
            C34012x4.m75431a(LogState.DEBUG, "Calling 'getCrashExtraMessage' of RQD crash listener.", new Object[0]);
            String crashExtraMessage = this.f70336e.getCrashExtraMessage(z11, crashDetailBean.f68666w, crashDetailBean.f68668y, crashDetailBean.f68669z, i12, crashDetailBean.f68602A);
            if (crashExtraMessage == null) {
                return null;
            }
            HashMap map = new HashMap(1);
            map.put(TUIConstants.TUIContact.USER_DATA, crashExtraMessage);
            return map;
        }
        if (this.f70337f == null) {
            return null;
        }
        C34012x4.m75434a("Calling 'onCrashHandleStart' of Bugly crash listener.", new Object[0]);
        return this.f70337f.m72452a(i11, crashDetailBean.f68666w, crashDetailBean.f68667x, crashDetailBean.f68669z);
    }

    /* JADX INFO: renamed from: b */
    public static void m73484b(ArrayList<C33908s0> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new C33908s0((byte) 1, "jniLog.txt", str.getBytes("utf-8")));
            } catch (Exception e11) {
                e11.printStackTrace();
                C34012x4.m75438b(e11);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m73485b(ArrayList<C33908s0> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            C33908s0 c33908s0 = new C33908s0((byte) 2, "buglylog.zip", bArr);
            C34012x4.m75434a("attach user log", new Object[0]);
            arrayList.add(c33908s0);
        } catch (Exception e11) {
            C34012x4.m75438b(e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m73483b(ArrayList<C33908s0> arrayList, CrashDetailBean crashDetailBean, Context context) {
        String str;
        if (crashDetailBean.f68631c == 1 && (str = crashDetailBean.f68606E) != null) {
            try {
                C33908s0 c33908s0M73462a = m73462a("tomb.zip", context, str);
                if (c33908s0M73462a != null) {
                    C34012x4.m75434a("attach tombs", new Object[0]);
                    arrayList.add(c33908s0M73462a);
                }
            } catch (Exception e11) {
                C34012x4.m75438b(e11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C33619e3 m73493a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C33619e3 c33619e3 = new C33619e3();
            c33619e3.f69662b = cursor.getLong(cursor.getColumnIndex("_id"));
            c33619e3.f69663c = cursor.getLong(cursor.getColumnIndex(C33641f4.f69827n));
            c33619e3.f69664d = cursor.getString(cursor.getColumnIndex(C33641f4.f69831r));
            c33619e3.f69665e = cursor.getInt(cursor.getColumnIndex(C33641f4.f69832s)) == 1;
            c33619e3.f69666f = cursor.getInt(cursor.getColumnIndex(C33641f4.f69833t)) == 1;
            c33619e3.f69667g = cursor.getInt(cursor.getColumnIndex(C33641f4.f69834u));
            return c33619e3;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public List<C33619e3> m73494a() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorM72901a = C33620e4.m72891a().m72901a(C33641f4.f69817d, new String[]{"_id", C33641f4.f69827n, C33641f4.f69831r, C33641f4.f69832s, C33641f4.f69833t, C33641f4.f69834u}, null, null, null, true);
            if (cursorM72901a == null) {
                if (cursorM72901a != null) {
                    cursorM72901a.close();
                }
                return null;
            }
            try {
                if (cursorM72901a.getCount() < 1) {
                    cursorM72901a.close();
                    return arrayList;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("_id");
                sb2.append(" in ");
                sb2.append("(");
                int i11 = 0;
                while (cursorM72901a.moveToNext()) {
                    try {
                        C33619e3 c33619e3M73493a = m73493a(cursorM72901a);
                        if (c33619e3M73493a != null) {
                            arrayList.add(c33619e3M73493a);
                        } else {
                            try {
                                sb2.append(cursorM72901a.getLong(cursorM72901a.getColumnIndex("_id")));
                                sb2.append(",");
                                i11++;
                            } catch (Throwable unused) {
                                C34012x4.m75444f("unknown id!", new Object[0]);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (sb2.toString().contains(",")) {
                    sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
                }
                sb2.append(")");
                String string = sb2.toString();
                sb2.setLength(0);
                if (i11 > 0) {
                    C34012x4.m75444f("deleted %s illegal data %d", C33641f4.f69817d, Integer.valueOf(C33620e4.m72891a().m72897a(C33641f4.f69817d, string, (String[]) null, (InterfaceC33599d4) null, true)));
                }
                cursorM72901a.close();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
            }
            cursor = cursorM72901a;
            try {
                if (!C34012x4.m75438b(th)) {
                    th.printStackTrace();
                }
                return arrayList;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73496a(int i11) {
        if (i11 <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (SELECT _id FROM t_cr order by _id limit ");
        sb2.append(i11);
        sb2.append(")");
        String string = sb2.toString();
        sb2.setLength(0);
        try {
            C34012x4.m75434a("deleted first record %s data %d", C33641f4.f69817d, Integer.valueOf(C33620e4.m72891a().m72897a(C33641f4.f69817d, string, (String[]) null, (InterfaceC33599d4) null, true)));
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C33684h5 m73460a(Context context, CrashDetailBean crashDetailBean, C33765l2 c33765l2) {
        if (context != null && crashDetailBean != null && c33765l2 != null) {
            C33684h5 c33684h5 = new C33684h5();
            c33684h5.f70076q = m73488d(crashDetailBean);
            c33684h5.f70077r = crashDetailBean.f68602A;
            c33684h5.f70078s = crashDetailBean.f68666w;
            c33684h5.f70079t = crashDetailBean.f68667x;
            c33684h5.f70080u = crashDetailBean.f68668y;
            c33684h5.f70082w = crashDetailBean.f68669z;
            c33684h5.f70083x = crashDetailBean.f68610I;
            c33684h5.f70084y = crashDetailBean.f68633d;
            c33684h5.f70085z = null;
            c33684h5.f70066B = crashDetailBean.f68665v;
            c33684h5.f70067C = crashDetailBean.f68643i;
            c33684h5.f70081v = crashDetailBean.f68612K;
            c33684h5.f70068D = null;
            c33684h5.f70070F = m73489e(crashDetailBean);
            C34012x4.m75434a("libInfo %s", c33684h5.f70069E);
            c33684h5.f70071G = m73463a(crashDetailBean, c33765l2, context, false);
            if (crashDetailBean.f68662s) {
                c33684h5.f70065A = crashDetailBean.f68604C;
            }
            c33684h5.f70072H = m73464a(crashDetailBean, c33765l2, true);
            c33684h5.f70073I = new HashMap();
            Map<String, String> map = crashDetailBean.f68634d0;
            if (map != null && map.size() > 0) {
                c33684h5.f70073I.putAll(crashDetailBean.f68634d0);
                C34012x4.m75431a(LogState.INFO, "setted message size %d", Integer.valueOf(c33684h5.f70073I.size()));
            }
            m73478a(c33684h5.f70073I, crashDetailBean, c33765l2);
            C34012x4.m75431a(LogState.DEBUG, "%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", crashDetailBean.f68666w, crashDetailBean.f68633d, c33765l2.m73829B(), Long.valueOf((crashDetailBean.f68602A - crashDetailBean.f68630b0) / 1000), Boolean.valueOf(crashDetailBean.f68663t), Boolean.valueOf(crashDetailBean.f68632c0), Boolean.valueOf(crashDetailBean.f68662s), Boolean.valueOf(crashDetailBean.f68631c == 1), Integer.valueOf(crashDetailBean.f68604C), crashDetailBean.f68603B, Boolean.valueOf(crashDetailBean.f68639g), Integer.valueOf(c33684h5.f70072H.size()));
            return c33684h5;
        }
        C34012x4.m75444f("enExp args == null", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m73478a(Map<String, String> map, CrashDetailBean crashDetailBean, C33765l2 c33765l2) {
        C34012x4.m75434a("pss:" + crashDetailBean.f68619R + " vss:" + crashDetailBean.f68620S + " javaHeap:" + crashDetailBean.f68621T + " jvmMaxRam:" + crashDetailBean.f68622U + " jvmAllocRam:" + crashDetailBean.f68623V, new Object[0]);
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(crashDetailBean.f68619R);
        map.put(C33577c3.f69366w, sb2.toString());
        StringBuilder sb3 = new StringBuilder("");
        sb3.append(crashDetailBean.f68620S);
        map.put(C33577c3.f69367x, sb3.toString());
        StringBuilder sb4 = new StringBuilder("");
        sb4.append(crashDetailBean.f68621T);
        map.put(C33577c3.f69368y, sb4.toString());
        map.put(C33577c3.f69369z, "" + crashDetailBean.f68622U);
        map.put(C33577c3.f69327A, "" + crashDetailBean.f68623V);
        map.put(C33577c3.f69328B, "" + c33765l2.m73893p());
        map.put(C33577c3.f69329C, "" + c33765l2.m73894q());
        LogState logState = LogState.DEBUG;
        C34012x4.m75431a(logState, "emulator confidence: " + c33765l2.f70720L + "\nemulator reason: " + c33765l2.f70721M, new Object[0]);
        String strM73888m = c33765l2.m73888m();
        StringBuilder sb5 = new StringBuilder("");
        sb5.append(strM73888m);
        map.put(C33577c3.f69330D, sb5.toString());
        C34012x4.m75431a(logState, "device cpu type: " + strM73888m, new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public static C33705i5 m73461a(Context context, List<CrashDetailBean> list, C33765l2 c33765l2) {
        if (context != null && list != null && list.size() != 0 && c33765l2 != null) {
            C33705i5 c33705i5 = new C33705i5();
            c33705i5.f70192q = new ArrayList<>();
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                c33705i5.f70192q.add(m73460a(context, it.next(), c33765l2));
            }
            return c33705i5;
        }
        C34012x4.m75444f("enEXPPkg args == null!", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C33908s0 m73462a(String str, Context context, String str2) {
        FileInputStream fileInputStream;
        if (str2 != null && context != null) {
            C34012x4.m75434a("zip %s", str2);
            File file = new File(str2);
            File file2 = new File(context.getCacheDir(), str);
            if (!C33571bi.m72594a(file, file2, 5000)) {
                C34012x4.m75431a(LogState.WARN, "zip fail!", new Object[0]);
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i11 = fileInputStream.read(bArr);
                        if (i11 <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i11);
                        byteArrayOutputStream.flush();
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C34012x4.m75431a(LogState.DEBUG, "read bytes :%d", Integer.valueOf(byteArray.length));
                    C33908s0 c33908s0 = new C33908s0((byte) 2, file2.getName(), byteArray);
                    try {
                        fileInputStream.close();
                    } catch (IOException e11) {
                        if (!C34012x4.m75432a(LogState.WARN, e11)) {
                            e11.printStackTrace();
                        }
                    }
                    if (file2.exists()) {
                        C34012x4.m75431a(LogState.DEBUG, "del tmp", new Object[0]);
                        file2.delete();
                    }
                    return c33908s0;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (!C34012x4.m75432a(LogState.WARN, th)) {
                            th.printStackTrace();
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e12) {
                                if (!C34012x4.m75432a(LogState.WARN, e12)) {
                                    e12.printStackTrace();
                                }
                            }
                        }
                        if (file2.exists()) {
                            C34012x4.m75431a(LogState.DEBUG, "del tmp", new Object[0]);
                        }
                        return null;
                    } finally {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e13) {
                                if (!C34012x4.m75432a(LogState.WARN, e13)) {
                                    e13.printStackTrace();
                                }
                            }
                        }
                        if (file2.exists()) {
                            C34012x4.m75431a(LogState.DEBUG, "del tmp", new Object[0]);
                            file2.delete();
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } else {
            C34012x4.m75444f("rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m73504a(List<CrashDetailBean> list, boolean z11) {
        if (list != null && list.size() != 0) {
            try {
                C33705i5 c33705i5M73461a = m73461a(this.f70332a, list, C33765l2.m73827s());
                if (c33705i5M73461a == null) {
                    C34012x4.m75444f("create eupPkg fail!", new Object[0]);
                    return null;
                }
                byte[] bArrM75185a = C33962ue.m75185a((JceStruct) c33705i5M73461a);
                if (bArrM75185a == null) {
                    C34012x4.m75444f("send encode fail!", new Object[0]);
                    return null;
                }
                byte[] bArrM75186a = C33962ue.m75186a((Object) C33962ue.m75181a(this.f70332a, C33556b3.f69047h, true, bArrM75185a));
                C33971v3.m75271a(z11, list);
                return bArrM75186a;
            } catch (Throwable th2) {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m73469a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
        C33765l2 c33765l2;
        String str6;
        C33765l2 c33765l2M73827s = C33765l2.m73827s();
        if (c33765l2M73827s == null || crashDetailBean == null) {
            return;
        }
        C34012x4.m75437b("#++++++++++Record By Bugly++++++++++#", new Object[0]);
        Object[] objArr = {c33765l2M73827s.f70743e};
        LogState logState = LogState.ERROR;
        C34012x4.m75431a(logState, "# PKG NAME: %s", objArr);
        C34012x4.m75431a(logState, "# APP VER: %s", crashDetailBean.f68649l);
        C34012x4.m75431a(logState, "# SDK VER: %s", crashDetailBean.f68647k);
        synchronized (C33765l2.class) {
            c33765l2 = C33765l2.f70700C0;
        }
        C34012x4.m75431a(logState, "# LAUNCH TIME: %s", C33571bi.m72606b(new Date(c33765l2.f70739c)));
        C34012x4.m75431a(logState, "# CRASH TYPE: %s", str);
        C34012x4.m75431a(logState, "# CRASH TIME: %s", str2);
        C34012x4.m75431a(logState, "# CRASH PROCESS: %s", str3);
        C34012x4.m75431a(logState, "# CRASH FOREGROUND: %s", Boolean.valueOf(c33765l2M73827s.m73838K()));
        C34012x4.m75431a(logState, "# CRASH THREAD: %s", str4);
        C34012x4.m75431a(logState, "# REPORT ID: %s", crashDetailBean.f68633d);
        C34012x4.m75431a(logState, "# CRASH DEVICE: %s %s", crashDetailBean.f68645j, c33765l2M73827s.m73896t().booleanValue() ? "ROOTED" : "UNROOT");
        C34012x4.m75431a(logState, "# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f68613L), Long.valueOf(crashDetailBean.f68614M), Long.valueOf(crashDetailBean.f68615N));
        C34012x4.m75431a(logState, "# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.f68616O), Long.valueOf(crashDetailBean.f68617P), Long.valueOf(crashDetailBean.f68618Q));
        if (!C33571bi.m72617c(crashDetailBean.f68627Z)) {
            C34012x4.m75431a(logState, "# EXCEPTION FIRED BY %s %s", crashDetailBean.f68627Z, crashDetailBean.f68626Y);
        } else if (crashDetailBean.f68631c == 3) {
            if (crashDetailBean.f68636e0 == null) {
                str6 = "null";
            } else {
                str6 = "" + crashDetailBean.f68636e0.get(CrashDetailBean.f68592G0);
            }
            C34012x4.m75431a(logState, "# EXCEPTION ANR MESSAGE:\n %s", str6);
        }
        if (!C33571bi.m72617c(str5)) {
            C34012x4.m75431a(logState, "# CRASH STACK: ", new Object[0]);
            C34012x4.m75431a(logState, str5, new Object[0]);
        }
        C34012x4.m75431a(logState, "#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m73503a(CrashDetailBean crashDetailBean, int i11, boolean z11, int i12) {
        if (this.f70336e != null) {
            C34012x4.m75434a("Calling 'getCrashExtraData' of RQD crash listener.", new Object[0]);
            return this.f70336e.getCrashExtraData(z11, crashDetailBean.f68666w, crashDetailBean.f68668y, crashDetailBean.f68669z, i12, crashDetailBean.f68602A);
        }
        if (this.f70337f == null) {
            return null;
        }
        C34012x4.m75434a("Calling 'onCrashHandleStart2GetExtraDatas' of Bugly crash listener.", new Object[0]);
        return this.f70337f.m72453b(i11, crashDetailBean.f68666w, crashDetailBean.f68667x, crashDetailBean.f68669z);
    }

    /* JADX INFO: renamed from: a */
    public static void m73468a(CrashDetailBean crashDetailBean, byte[] bArr) {
        if (bArr == null) {
            C34012x4.m75444f("extra user byte is null. CrashBean won't have userExtraByteDatas.", new Object[0]);
            return;
        }
        if (bArr.length <= 100000) {
            crashDetailBean.f68646j0 = bArr;
        } else {
            C34012x4.m75444f("extra bytes size %d is over limit %d will drop over part", Integer.valueOf(bArr.length), 100000);
            crashDetailBean.f68646j0 = Arrays.copyOf(bArr, 100000);
        }
        C34012x4.m75442d("add extra bytes %d ", Integer.valueOf(bArr.length));
    }

    /* JADX INFO: renamed from: a */
    public final void m73498a(CrashDetailBean crashDetailBean, boolean z11, int i11) {
        if (this.f70336e != null) {
            C34012x4.m75434a("Calling 'onCrashSaving' of RQD crash listener.", new Object[0]);
            if (this.f70336e.mo74225a(z11, crashDetailBean.f68666w, crashDetailBean.f68667x, crashDetailBean.f68668y, crashDetailBean.f68669z, i11, crashDetailBean.f68602A, crashDetailBean.f68665v, crashDetailBean.f68643i, crashDetailBean.f68633d, crashDetailBean.f68611J, crashDetailBean.f68612K)) {
                return;
            }
            C34012x4.m75431a(LogState.WARN, "Crash listener 'onCrashSaving' return 'false' thus will not handle this crash.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73467a(CrashDetailBean crashDetailBean, Map<String, String> map) {
        String value;
        if (map != null && !map.isEmpty()) {
            crashDetailBean.f68634d0 = new LinkedHashMap(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!C33571bi.m72617c(entry.getKey())) {
                    String key = entry.getKey();
                    if (key.length() > 100) {
                        key = key.substring(0, 100);
                        C34012x4.m75444f("setted key length is over limit %d substring to %s", 100, key);
                    }
                    if (!C33571bi.m72617c(entry.getValue()) && entry.getValue().length() > 100000) {
                        value = entry.getValue().substring(entry.getValue().length() - 100000);
                        C34012x4.m75444f("setted %s value length is over limit %d substring", key, 100000);
                    } else {
                        value = entry.getValue();
                    }
                    crashDetailBean.f68634d0.put(key, value);
                    C34012x4.m75442d("add setted key %s value size:%d", key, Integer.valueOf(value.length()));
                }
            }
            return;
        }
        C34012x4.m75444f("extra map is empty. CrashBean won't have userDatas.", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<C33908s0> m73463a(CrashDetailBean crashDetailBean, C33765l2 c33765l2, Context context, boolean z11) {
        ArrayList<C33908s0> arrayList = new ArrayList<>(20);
        m73470a(arrayList, crashDetailBean);
        m73487c(arrayList, crashDetailBean.f68607F);
        m73484b(arrayList, crashDetailBean.f68608G);
        m73472a(arrayList, crashDetailBean.f68648k0);
        m73485b(arrayList, crashDetailBean.f68609H);
        m73471a(arrayList, crashDetailBean, context);
        m73483b(arrayList, crashDetailBean, context);
        m73475a(arrayList, crashDetailBean.f68657p);
        m73476a(arrayList, crashDetailBean.f68646j0);
        if (z11) {
            Map<String, String> map = crashDetailBean.f68634d0;
            if (map != null && map.size() > 0) {
                m73474a(arrayList, "user_datas.log", crashDetailBean.f68634d0.toString());
            }
            Map<String, String> map2 = crashDetailBean.f68642h0;
            if (map2 != null && map2.size() > 0) {
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry<String, String> entry : crashDetailBean.f68642h0.entrySet()) {
                    sb2.append(C33556b3.f69018Z1 + entry.getKey());
                    sb2.append(C33844oi.f71346o);
                    sb2.append(entry.getValue());
                    sb2.append(";");
                }
                m73474a(arrayList, "valueMapOthers.txt", sb2.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m73470a(ArrayList<C33908s0> arrayList, CrashDetailBean crashDetailBean) {
        String str;
        if (crashDetailBean.f68662s && (str = crashDetailBean.f68603B) != null && str.length() > 0) {
            try {
                arrayList.add(new C33908s0((byte) 1, "alltimes.txt", crashDetailBean.f68603B.getBytes("utf-8")));
            } catch (Exception e11) {
                e11.printStackTrace();
                C34012x4.m75438b(e11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73474a(ArrayList<C33908s0> arrayList, String str, String str2) {
        if (str2 != null) {
            try {
                arrayList.add(new C33908s0((byte) 1, str, str2.getBytes("utf-8")));
            } catch (Throwable th2) {
                C34012x4.m75435a(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73472a(ArrayList<C33908s0> arrayList, String str) {
        if (C33571bi.m72617c(str)) {
            return;
        }
        try {
            C33908s0 c33908s0 = new C33908s0((byte) 1, "crashInfos.txt", str.getBytes("utf-8"));
            C34012x4.m75434a("attach crash infos", new Object[0]);
            arrayList.add(c33908s0);
        } catch (Exception e11) {
            e11.printStackTrace();
            C34012x4.m75438b(e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73473a(ArrayList<C33908s0> arrayList, String str, Context context) {
        if (str != null) {
            try {
                C33908s0 c33908s0M73462a = m73462a("backupRecord.zip", context, str);
                if (c33908s0M73462a != null) {
                    C34012x4.m75434a("attach backup record", new Object[0]);
                    arrayList.add(c33908s0M73462a);
                }
            } catch (Exception e11) {
                C34012x4.m75438b(e11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73471a(ArrayList<C33908s0> arrayList, CrashDetailBean crashDetailBean, Context context) {
        C33908s0 c33908s0M73462a;
        if (crashDetailBean.f68631c != 3) {
            return;
        }
        C34012x4.m75434a("crashBean.anrMessages:%s", crashDetailBean.f68636e0);
        try {
            Map<String, String> map = crashDetailBean.f68636e0;
            if (map != null && map.containsKey(CrashDetailBean.f68592G0)) {
                if (!TextUtils.isEmpty(crashDetailBean.f68636e0.get(CrashDetailBean.f68592G0))) {
                    arrayList.add(new C33908s0((byte) 1, "anrMessage.txt", crashDetailBean.f68636e0.get(CrashDetailBean.f68592G0).getBytes("utf-8")));
                    C34012x4.m75431a(LogState.DEBUG, "attach anr message", new Object[0]);
                }
                crashDetailBean.f68636e0.remove(CrashDetailBean.f68592G0);
            }
            String str = crashDetailBean.f68606E;
            if (str == null || (c33908s0M73462a = m73462a("trace.zip", context, str)) == null) {
                return;
            }
            C34012x4.m75431a(LogState.DEBUG, "attach traces", new Object[0]);
            arrayList.add(c33908s0M73462a);
        } catch (Exception e11) {
            e11.printStackTrace();
            C34012x4.m75432a(LogState.WARN, e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73475a(ArrayList<C33908s0> arrayList, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        try {
            arrayList.add(new C33908s0((byte) 1, "martianlog.txt", sb2.toString().getBytes("utf-8")));
            C34012x4.m75434a("attach pageTracingList", new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73476a(ArrayList<C33908s0> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            arrayList.add(new C33908s0((byte) 1, "userExtraByteData", bArr));
            C34012x4.m75434a("attach extraData", new Object[0]);
        } catch (Exception e11) {
            C34012x4.m75438b(e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m73464a(CrashDetailBean crashDetailBean, C33765l2 c33765l2, boolean z11) {
        HashMap map = new HashMap(30);
        try {
            map.put(C33556b3.f68944E0, "" + crashDetailBean.f68613L);
            map.put(C33556b3.f68952G0, "" + crashDetailBean.f68614M);
            map.put(C33556b3.f68948F0, "" + crashDetailBean.f68615N);
            map.put(C33556b3.f68990Q0, "" + crashDetailBean.f68649l);
            Objects.requireNonNull(c33765l2);
            map.put(C33556b3.f68936C0, "");
            map.put(C33556b3.f68932B0, "" + c33765l2.m73884k());
            map.put(C33556b3.f68928A0, "" + c33765l2.m73888m());
            map.put(C33556b3.f69104v0, "" + c33765l2.m73890n());
            map.put(C33556b3.f69120z0, "" + crashDetailBean.f68617P);
            map.put(C33556b3.f69116y0, "" + crashDetailBean.f68616O);
            map.put(C33556b3.f68993R0, "" + c33765l2.f70763o);
            map.put(C33556b3.f68964J0, "" + crashDetailBean.f68618Q);
            map.put(C33556b3.f68996S0, "" + c33765l2.m73890n());
            map.put(C33556b3.f68984O0, "" + c33765l2.m73882j());
            map.put(C33556b3.f68960I0, "" + c33765l2.m73896t());
            map.put(C33556b3.f69025b1, "" + crashDetailBean.f68611J);
            if (z11) {
                int i11 = crashDetailBean.f68631c;
                if (i11 != 3 && i11 != 0 && i11 != 1) {
                    map.put("crash_identify", UUID.randomUUID().toString());
                } else {
                    map.put("crash_identify", crashDetailBean.f68635e);
                }
            }
            map.put(C33556b3.f69122z2, "" + crashDetailBean.f68651m);
            map.put(C33556b3.f68999T0, "" + URLEncoder.encode(crashDetailBean.f68624W, "utf-8"));
            if (crashDetailBean.f68631c == 1) {
                map.put(C33556b3.f69002U0, "" + crashDetailBean.f68627Z);
                map.put(C33556b3.f69005V0, "" + crashDetailBean.f68626Y);
                map.put(C33556b3.f69008W0, "" + crashDetailBean.f68663t);
            }
            map.put(C33556b3.f69011X0, "" + crashDetailBean.f68628a0);
            map.put(C33556b3.f68968K0, "" + crashDetailBean.f68630b0);
            map.put(C33556b3.f69033d1, "" + (true ^ crashDetailBean.f68632c0));
            map.put(C33556b3.f68950F2, "" + c33765l2.f70734Z);
            map.put(C33556b3.f68954G2, "" + c33765l2.f70736a0);
            map.put(C33556b3.f68958H2, "" + c33765l2.m73829B());
            map.put(C33556b3.f68962I2, "" + c33765l2.f70738b0);
            map.put(C33556b3.f68966J2, "" + c33765l2.f70733Y);
            map.put(C33556b3.f68974L2, "" + c33765l2.f70744e0);
            map.put(C33556b3.f68978M2, "" + c33765l2.f70746f0);
            map.put(C33556b3.f68982N2, "" + c33765l2.f70740c0);
            m73477a(map, crashDetailBean);
            return map;
        } catch (Exception e11) {
            e11.printStackTrace();
            C34012x4.m75438b(e11);
            return map;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73477a(Map<String, String> map, CrashDetailBean crashDetailBean) {
        if (crashDetailBean.f68638f0 >= 0) {
            map.put(C33556b3.f69012X1, "" + crashDetailBean.f68638f0);
        }
        if (crashDetailBean.f68640g0 >= 0) {
            map.put(C33556b3.f69015Y1, "" + crashDetailBean.f68640g0);
        }
        Map<String, String> map2 = crashDetailBean.f68642h0;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : crashDetailBean.f68642h0.entrySet()) {
                map.put(C33556b3.f69018Z1 + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = crashDetailBean.f68644i0;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry2 : crashDetailBean.f68644i0.entrySet()) {
            map.put(C33556b3.f69022a2 + entry2.getKey(), entry2.getValue());
        }
    }
}
