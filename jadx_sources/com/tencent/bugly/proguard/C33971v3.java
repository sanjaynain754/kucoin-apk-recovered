package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.upload.UploadProxy;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.rmonitor.common.logger.LogState;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.v3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33971v3 {

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.v3$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CrashDetailBean f72312b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ UploadProxy f72313c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ReportData f72314d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f72315e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Context f72316f;

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.v3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BUGLY */
        public class C46997a implements IReporter.ReportCallback {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ long f72317i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ C33905rh f72318j;

            public C46997a(long j11, C33905rh c33905rh) {
                this.f72317i = j11;
                this.f72318j = c33905rh;
            }

            @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
            public void onBlocked(int i11) {
                C34012x4.m75442d(C34025xh.m75464a(new StringBuilder(), a.this.f72312b.f68666w, ", crash upload fail for blocked."), new Object[0]);
            }

            @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
            public void onCached() {
                C34012x4.m75442d(C34025xh.m75464a(new StringBuilder(), a.this.f72312b.f68666w, ", crash upload suspended for cached."), new Object[0]);
            }

            @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
            public void onFailure(int i11, String str, int i12, int i13) {
                InterfaceC33885qh interfaceC33885qh;
                C34012x4.m75442d(a.this.f72312b.f68666w + ", crash upload failed! ,errorCode = " + i11 + ",errorMsg = " + str, new Object[0]);
                if (C33765l2.m73827s().f70786z0) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f72317i;
                ArrayList arrayList = new ArrayList();
                arrayList.add(a.this.f72312b);
                C33971v3.m75270a((List<CrashDetailBean>) arrayList, false, jCurrentTimeMillis, a.this.f72315e ? C33590cg.f69439i : C33590cg.f69440j, str);
                C33971v3.m75271a(false, (List<CrashDetailBean>) arrayList);
                C33905rh c33905rh = this.f72318j;
                if (c33905rh == null || (interfaceC33885qh = c33905rh.f71762c) == null) {
                    return;
                }
                int i14 = a.this.f72312b.f68631c;
                String str2 = "upload fail,error code = " + i11 + ", errorMsg = " + str;
                CrashDetailBean crashDetailBean = a.this.f72312b;
                interfaceC33885qh.mo74226a(i14, null, 0L, 0L, false, str2, crashDetailBean.f68666w, crashDetailBean.f68602A);
            }

            @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
            public void onSuccess(int i11, int i12) {
                InterfaceC33885qh interfaceC33885qh;
                int i13;
                C34012x4.m75442d(C34025xh.m75464a(new StringBuilder(), a.this.f72312b.f68666w, ", crash upload success!"), new Object[0]);
                if (C33765l2.m73827s().f70786z0) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f72317i;
                ArrayList arrayList = new ArrayList();
                arrayList.add(a.this.f72312b);
                C33971v3.m75270a((List<CrashDetailBean>) arrayList, true, jCurrentTimeMillis, a.this.f72315e ? C33590cg.f69439i : C33590cg.f69440j, "upload success");
                C33971v3.m75271a(true, (List<CrashDetailBean>) arrayList);
                a aVar = a.this;
                if (!aVar.f72315e && ((i13 = aVar.f72312b.f68631c) == 0 || i13 == 1 || i13 == 3)) {
                    C33557b4 c33557b4M72455c = C33557b4.m72455c();
                    a aVar2 = a.this;
                    c33557b4M72455c.m72475e(aVar2.f72316f, aVar2.f72312b.f68635e);
                }
                C33905rh c33905rh = this.f72318j;
                if (c33905rh == null || (interfaceC33885qh = c33905rh.f71762c) == null) {
                    return;
                }
                CrashDetailBean crashDetailBean = a.this.f72312b;
                interfaceC33885qh.mo74226a(crashDetailBean.f68631c, null, i12, 0L, true, " crash upload success", crashDetailBean.f68666w, crashDetailBean.f68602A);
            }
        }

        public a(CrashDetailBean crashDetailBean, UploadProxy uploadProxy, ReportData reportData, boolean z11, Context context) {
            this.f72312b = crashDetailBean;
            this.f72313c = uploadProxy;
            this.f72314d = reportData;
            this.f72315e = z11;
            this.f72316f = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC33885qh interfaceC33885qh;
            try {
                C33905rh c33905rhM74876d = C33905rh.m74876d();
                if (c33905rhM74876d != null && (interfaceC33885qh = c33905rhM74876d.f71762c) != null) {
                    interfaceC33885qh.onUploadStart(this.f72312b.f68631c);
                }
                this.f72313c.reportFile(this.f72314d, this.f72313c.getFileUploadUrl(1) + this.f72313c.getMD5Params(this.f72314d), new C46997a(System.currentTimeMillis(), c33905rhM74876d));
            } catch (Throwable th2) {
                C34012x4.m75435a(th2);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.v3$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements InterfaceC33885qh {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f72320a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f72321b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f72322c;

        public b(long j11, List list, boolean z11) {
            this.f72320a = j11;
            this.f72321b = list;
            this.f72322c = z11;
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33885qh
        /* JADX INFO: renamed from: a */
        public void mo74226a(int i11, C33983vf c33983vf, long j11, long j12, boolean z11, String str, String str2, long j13) {
            String str3;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f72320a;
            List list = this.f72321b;
            if (this.f72322c) {
                str3 = C33590cg.f69439i;
            } else {
                str3 = C33590cg.f69440j;
            }
            C33971v3.m75270a((List<CrashDetailBean>) list, z11, jCurrentTimeMillis, str3, str);
            C33971v3.m75271a(z11, (List<CrashDetailBean>) this.f72321b);
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33885qh
        public void onUploadStart(int i11) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m75266a(CrashDetailBean crashDetailBean) {
        JSONObject jSONObjectM74302a = C33820nf.m74302a();
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject.put("system_free", crashDetailBean.f68613L);
            jSONObject.put("system_total", crashDetailBean.f68616O);
            jSONObject.put("java_heap", crashDetailBean.f68621T);
            jSONObject.put("java_heap_max", crashDetailBean.f68622U);
            jSONObject.put("java_heap_alloc", crashDetailBean.f68623V);
            jSONObject.put("pss", crashDetailBean.f68619R);
            jSONObject.put("vss", crashDetailBean.f68620S);
            jSONObject2.put("total", crashDetailBean.f68617P);
            jSONObject2.put("free", crashDetailBean.f68614M);
            jSONObject3.put("total", crashDetailBean.f68618Q);
            jSONObject3.put("free", crashDetailBean.f68615N);
            jSONObjectM74302a.put("exp_info", m75278f(crashDetailBean));
            jSONObjectM74302a.put("app_info", "");
            jSONObjectM74302a.put(C33820nf.f71130I, new JSONObject(m75279g(crashDetailBean)));
            jSONObjectM74302a.put(C33820nf.f71135N, m75280h(crashDetailBean));
            jSONObjectM74302a.put("component_info", m75276d(crashDetailBean));
            jSONObjectM74302a.put("process_name", crashDetailBean.f68611J);
            jSONObjectM74302a.put("app_channel", crashDetailBean.f68653n);
            jSONObjectM74302a.put(InterfaceC33617e1.f69653b, jSONObject);
            jSONObjectM74302a.put("storage", jSONObject2);
            jSONObjectM74302a.put("sd", jSONObject3);
            jSONObjectM74302a.put("app_start_time", crashDetailBean.f68630b0 / 1000);
            jSONObjectM74302a.put("is_root", C33765l2.m73827s().m73896t());
            jSONObjectM74302a.put("is_development", C33765l2.m73827s().f70750h0);
            jSONObjectM74302a.put("is_first_install", crashDetailBean.f68641h);
            jSONObjectM74302a.put("app_in_foreground", crashDetailBean.f68632c0);
            jSONObjectM74302a.put("custom_upload_anything", C33765l2.m73827s().f70786z0);
            jSONObjectM74302a.put(C33820nf.f71127F, crashDetailBean.f68657p);
            try {
                if (!TextUtils.isEmpty(crashDetailBean.f68660q0) && crashDetailBean.f68631c == 3) {
                    jSONObjectM74302a.put(C33820nf.f71136O, new JSONObject(crashDetailBean.f68660q0));
                }
                Map<String, String> map = crashDetailBean.f68642h0;
                if (map != null && map.containsKey(C33695hg.f70134o) && C33695hg.m73279c().m73287d()) {
                    jSONObjectM74302a.put("session_id", crashDetailBean.f68642h0.get(C33695hg.f70134o));
                }
            } catch (Throwable th2) {
                C34012x4.m75435a(th2);
            }
            C33663g5.m73148b(jSONObjectM74302a, crashDetailBean);
        } catch (Throwable th3) {
            C34012x4.m75435a(th3);
        }
        return jSONObjectM74302a;
    }

    /* JADX INFO: renamed from: b */
    public static String m75273b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("\\(");
        return (strArrSplit == null || strArrSplit.length < 2) ? str : strArrSplit[0];
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m75275c(CrashDetailBean crashDetailBean) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("stacks", m75281i(crashDetailBean));
            jSONObject.put("attributed_stack", m75274b(crashDetailBean));
            jSONObject.put("exception_info", m75277e(crashDetailBean));
            return jSONObject;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: d */
    public static JSONArray m75276d(CrashDetailBean crashDetailBean) {
        String[] strArrSplit;
        JSONArray jSONArray = new JSONArray();
        try {
            Map<String, String> map = crashDetailBean.f68644i0;
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : crashDetailBean.f68644i0.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase("SDK_INFO") && (strArrSplit = entry.getValue().split("[\\[\\], ]+")) != null && strArrSplit.length > 2) {
                        for (int i11 = 1; i11 < strArrSplit.length; i11 += 2) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("product_id", strArrSplit[i11]);
                            jSONObject.put("version", strArrSplit[i11 + 1]);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m75277e(CrashDetailBean crashDetailBean) {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, String> mapM73464a = C33724j3.m73464a(crashDetailBean, C33765l2.m73827s(), false);
            JSONArray jSONArray = new JSONArray();
            if (mapM73464a != null) {
                for (Map.Entry<String, String> entry : mapM73464a.entrySet()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("key", entry.getKey());
                    jSONObject2.put("value", entry.getValue());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("value_map", jSONArray);
            jSONObject.put("reserved_map", m75264a());
            jSONObject.put("lib_info", "");
            return jSONObject;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: f */
    public static JSONObject m75278f(CrashDetailBean crashDetailBean) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", C33724j3.m73488d(crashDetailBean));
            jSONObject.put("name", crashDetailBean.f68666w);
            jSONObject.put("message", crashDetailBean.f68667x);
            jSONObject.put(C33954u6.f72239j, crashDetailBean.f68668y);
            return jSONObject;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Map<String, String> m75279g(CrashDetailBean crashDetailBean) {
        HashMap map = new HashMap();
        try {
            Map<String, String> map2 = crashDetailBean.f68642h0;
            if (map2 != null && map2.size() > 0) {
                for (Map.Entry<String, String> entry : crashDetailBean.f68642h0.entrySet()) {
                    map.put(C33556b3.f69018Z1 + entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m75280h(CrashDetailBean crashDetailBean) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", crashDetailBean.f68652m0);
            jSONObject.put("switch", crashDetailBean.f68654n0);
            jSONObject.put("sdk_version", C33571bi.m72604b("G10", ""));
            return jSONObject;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: i */
    public static JSONArray m75281i(CrashDetailBean crashDetailBean) {
        JSONArray jSONArray = new JSONArray();
        try {
            Map<String, String> map = crashDetailBean.f68610I;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("call_stack", entry.getValue());
                    jSONObject.put("thread_name", m75273b(entry.getKey()));
                    jSONObject.put("thread_id", m75263a(entry.getKey()));
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: j */
    public static String m75282j(CrashDetailBean crashDetailBean) {
        int i11 = crashDetailBean.f68631c;
        if (i11 == 0 || i11 == 1) {
            return "crash";
        }
        return i11 == 3 ? "anr" : Constants.IPC_BUNDLE_KEY_SEND_ERROR;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m75274b(CrashDetailBean crashDetailBean) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("call_stack", crashDetailBean.f68669z);
            jSONObject.put("thread_name", m75273b(crashDetailBean.f68612K));
            jSONObject.put("thread_id", m75263a(crashDetailBean.f68612K));
            return jSONObject;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C33928t0 m75272b(Context context, CrashDetailBean crashDetailBean) {
        C33928t0 c33928t0 = new C33928t0();
        for (C33908s0 c33908s0 : C33724j3.m73463a(crashDetailBean, C33765l2.m73827s(), context, true)) {
            C33928t0.a aVar = new C33928t0.a();
            aVar.f72025c = c33908s0.f71782s;
            aVar.f72024b = c33908s0.f71781r;
            aVar.f72023a = c33908s0.f71780q;
            c33928t0.f72022a.add(aVar);
        }
        return c33928t0;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m75264a() throws JSONException {
        String str;
        JSONArray jSONArray = new JSONArray();
        C33765l2 c33765l2M73827s = C33765l2.m73827s();
        HashMap map = new HashMap();
        map.put(C33556b3.f68999T0, "" + c33765l2M73827s.m73900x());
        map.put(C33577c3.f69363t, "");
        map.put(C33577c3.f69364u, "" + c33765l2M73827s.m73836I());
        map.put(C33577c3.f69352i, "" + c33765l2M73827s.f70752i0);
        map.put(C33577c3.f69353j, "" + c33765l2M73827s.f70750h0);
        map.put(C33577c3.f69346c, "" + c33765l2M73827s.f70716H);
        List<AbstractC33575c1> list = C33900rc.f71635d;
        if (list != null) {
            for (AbstractC33575c1 abstractC33575c1 : list) {
                String str2 = abstractC33575c1.f69319c;
                if (str2 != null && (str = abstractC33575c1.f69320d) != null) {
                    map.put(str2, str);
                }
            }
        }
        Map<String, String> mapM73876g = c33765l2M73827s.m73876g();
        if (mapM73876g != null) {
            for (Map.Entry<String, String> entry : mapM73876g.entrySet()) {
                if (!TextUtils.isEmpty(entry.getValue())) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", entry2.getKey());
            jSONObject.put("value", entry2.getValue());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static String m75263a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("\\(");
        return (strArrSplit == null || strArrSplit.length < 2) ? str : strArrSplit[1].replace(")", "");
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m75265a(Context context, CrashDetailBean crashDetailBean) {
        C33765l2 c33765l2;
        C33765l2 c33765l2M73825a = C33765l2.m73825a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            UserMeta userMeta = new UserMeta();
            String str = crashDetailBean.f68665v;
            if (str == null) {
                str = "";
            }
            userMeta.uin = str;
            userMeta.buildNumber = crashDetailBean.f68651m;
            userMeta.appId = c33765l2M73825a.m73872e();
            userMeta.appVersion = crashDetailBean.f68649l;
            userMeta.sdkVersion = crashDetailBean.f68647k;
            userMeta.setModel(crashDetailBean.f68645j);
            userMeta.setUniqueID(crashDetailBean.f68643i);
            userMeta.setAppVersionMode(C33791m7.m74054e().getAppVersionMode());
            JSONObject jSONObjectM75266a = m75266a(crashDetailBean);
            JSONObject jSONObjectM75275c = m75275c(crashDetailBean);
            jSONObject = C33820nf.m74303a(context, m75282j(crashDetailBean), "basic_info", userMeta);
            jSONObject.put("event_time", crashDetailBean.f68602A / 1000);
            jSONObject.put(C33820nf.f71148d, crashDetailBean.f68602A);
            jSONObject.put("app_name", c33765l2M73825a.f70716H);
            jSONObject.put(C33820nf.f71160p, jSONObjectM75266a);
            jSONObject.put(C33820nf.f71161q, jSONObjectM75275c);
            jSONObject.put(C33820nf.f71156l, crashDetailBean.f68633d);
            jSONObject.put("process_launch_id", crashDetailBean.f68635e);
            if (!TextUtils.equals(C33591ch.m72746d(), crashDetailBean.f68635e)) {
                jSONObject.put("launch_id", crashDetailBean.f68635e);
            }
            try {
                jSONObject.getJSONObject(C33820nf.f71159o).put(TPDownloadProxyEnum.USER_NETWORK_TYPE, C33830o4.m74391a(context));
                JSONObject jSONObject2 = jSONObject.getJSONObject(C33820nf.f71159o);
                synchronized (C33765l2.class) {
                    c33765l2 = C33765l2.f70700C0;
                }
                jSONObject2.put("cpu_type", c33765l2.m73901y());
                jSONObject.getJSONObject(C33820nf.f71159o).put("arch_ver", C33765l2.m73827s().m73888m());
                jSONObject.getJSONObject(C33820nf.f71159o).put("country_code", "");
                jSONObject.getJSONObject(C33820nf.f71159o).put("rom", C33765l2.m73827s().m73900x());
                jSONObject.getJSONObject(C33820nf.f71159o).put(C33577c3.f69337K, C33765l2.m73827s().m73893p());
                jSONObject.getJSONObject(C33820nf.f71159o).put(C33577c3.f69338L, C33765l2.m73827s().m73894q());
                C34012x4.m75442d(crashDetailBean.f68666w + ", client_identify: " + crashDetailBean.f68633d + ", session_id: " + jSONObjectM75266a.opt("session_id"), new Object[0]);
            } catch (Throwable th2) {
                C34012x4.m75435a(th2);
            }
        } catch (Throwable th3) {
            C34012x4.m75435a(th3);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m75268a(Context context, C33905rh c33905rh, CrashDetailBean crashDetailBean, long j11, boolean z11) {
        C33765l2 c33765l2;
        UploadProxy uploadProxy = new UploadProxy(context, C33765l2.m73827s().m73872e());
        JSONObject jSONObjectM75265a = m75265a(context, crashDetailBean);
        synchronized (C33765l2.class) {
            c33765l2 = C33765l2.f70700C0;
        }
        ReportData reportData = new ReportData(c33765l2.m73833F(), 1, "CrashUploadEvent", jSONObjectM75265a);
        reportData.updateAttachment(m75272b(context, crashDetailBean));
        a aVar = new a(crashDetailBean, uploadProxy, reportData, z11, context);
        if (z11) {
            c33905rh.m74889a(aVar, true, true, j11);
        } else {
            c33905rh.m74889a(aVar, false, false, 0L);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75269a(Context context, C33905rh c33905rh, List<CrashDetailBean> list, long j11, boolean z11) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                Iterator<CrashDetailBean> it = list.iterator();
                while (it.hasNext()) {
                    Context context2 = context;
                    C33905rh c33905rh2 = c33905rh;
                    long j12 = j11;
                    boolean z12 = z11;
                    m75268a(context2, c33905rh2, it.next(), j12, z12);
                    context = context2;
                    c33905rh = c33905rh2;
                    j11 = j12;
                    z11 = z12;
                }
            } catch (Throwable th2) {
                C34012x4.m75435a(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75267a(Context context, C33863pg c33863pg, int i11, C33905rh c33905rh, List<CrashDetailBean> list, long j11, boolean z11, boolean z12) {
        try {
            String str = c33863pg.m74582c().f68580p;
            String str2 = StrategyBean.f68564x;
            C33705i5 c33705i5M73461a = C33724j3.m73461a(context, list, C33765l2.m73827s());
            if (c33705i5M73461a == null) {
                C34012x4.m75444f("create eupPkg fail!", new Object[0]);
                return;
            }
            byte[] bArrM75185a = C33962ue.m75185a((JceStruct) c33705i5M73461a);
            if (bArrM75185a == null) {
                C34012x4.m75444f("send encode fail!", new Object[0]);
                return;
            }
            C33943tf c33943tfM75181a = C33962ue.m75181a(context, C33556b3.f69063l, z11, bArrM75185a);
            if (c33943tfM75181a == null) {
                C34012x4.m75444f("request package is null.", new Object[0]);
                return;
            }
            b bVar = new b(System.currentTimeMillis(), list, z11);
            if (z11) {
                c33905rh.m74883a(i11, c33943tfM75181a, str, str2, bVar, j11, z12);
            } else {
                c33905rh.m74884a(i11, c33943tfM75181a, str, str2, bVar, false);
            }
        } catch (Throwable th2) {
            C34012x4.m75437b("req cr error %s", th2.toString());
            if (C34012x4.m75432a(LogState.ERROR, th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75270a(List<CrashDetailBean> list, boolean z11, long j11, String str, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CrashDetailBean crashDetailBean : list) {
            String str3 = C33724j3.f70331o.get(Integer.valueOf(crashDetailBean.f68631c));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new C33590cg.d(crashDetailBean.f68633d, str3, crashDetailBean.f68602A, z11, j11, str, str2));
            }
        }
        C33590cg.b.f69449a.m72709b(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static void m75271a(boolean z11, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            C34012x4.m75434a("up finish update state %b", Boolean.valueOf(z11));
            for (CrashDetailBean crashDetailBean : list) {
                Object[] objArr = {crashDetailBean.f68633d, Integer.valueOf(crashDetailBean.f68664u), Boolean.valueOf(crashDetailBean.f68639g), Boolean.valueOf(crashDetailBean.f68662s)};
                LogState logState = LogState.DEBUG;
                C34012x4.m75431a(logState, "pre uid:%s uc:%d re:%b me:%b", objArr);
                int i11 = crashDetailBean.f68664u + 1;
                crashDetailBean.f68664u = i11;
                crashDetailBean.f68639g = z11;
                C34012x4.m75431a(logState, "set uid:%s uc:%d re:%b me:%b", crashDetailBean.f68633d, Integer.valueOf(i11), Boolean.valueOf(crashDetailBean.f68639g), Boolean.valueOf(crashDetailBean.f68662s));
            }
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                C33745k3.m73653l().m73662a(it.next());
            }
            C34012x4.m75431a(LogState.DEBUG, "update state size %d", Integer.valueOf(list.size()));
        }
        if (z11) {
            return;
        }
        C34012x4.m75443e("[crash] upload fail.", new Object[0]);
    }
}
