package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.v1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33969v1 implements C33695hg.c {

    /* JADX INFO: renamed from: f */
    public static final int f72285f = 20;

    /* JADX INFO: renamed from: g */
    public static final int f72286g = 50;

    /* JADX INFO: renamed from: h */
    public static final long f72287h = 604800000;

    /* JADX INFO: renamed from: i */
    public static final long f72288i = 86400000;

    /* JADX INFO: renamed from: j */
    public static final String f72289j = "bugly_last_us_up_tm";

    /* JADX INFO: renamed from: k */
    public static boolean f72290k = true;

    /* JADX INFO: renamed from: a */
    public long f72291a;

    /* JADX INFO: renamed from: b */
    public Context f72292b;

    /* JADX INFO: renamed from: c */
    public long f72293c;

    /* JADX INFO: renamed from: d */
    public int f72294d;

    /* JADX INFO: renamed from: e */
    public boolean f72295e;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.v1$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UserInfoBean f72296b;

        public a(UserInfoBean userInfoBean) {
            this.f72296b = userInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33969v1.this.m75245a(Collections.singletonList(this.f72296b), true);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.v1$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements InterfaceC33885qh {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f72298a;

        public b(List list) {
            this.f72298a = list;
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33885qh
        /* JADX INFO: renamed from: a */
        public void mo74226a(int i11, C33983vf c33983vf, long j11, long j12, boolean z11, String str, String str2, long j13) {
            if (z11) {
                C34012x4.m75434a("[UserInfo] Successfully uploaded user info.", new Object[0]);
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (UserInfoBean userInfoBean : this.f72298a) {
                    userInfoBean.f68544g = jCurrentTimeMillis;
                    C33969v1.this.m75243a(userInfoBean, true);
                }
            }
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33885qh
        public void onUploadStart(int i11) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.v1$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f72300b;

        public c(boolean z11) {
            this.f72300b = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C33969v1.this.m75255d(this.f72300b);
            } catch (Throwable th2) {
                C34012x4.m75438b(th2);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.v1$d */
    /* JADX INFO: compiled from: BUGLY */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b */
        public boolean f72302b;

        /* JADX INFO: renamed from: c */
        public UserInfoBean f72303c;

        public d(UserInfoBean userInfoBean, boolean z11) {
            this.f72303c = userInfoBean;
            this.f72302b = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C33969v1.this.f72295e) {
                try {
                    UserInfoBean userInfoBean = this.f72303c;
                    if (userInfoBean != null) {
                        C33969v1.this.m75242a(userInfoBean);
                        C34012x4.m75434a("[UserInfo] Record user info.", new Object[0]);
                        C33969v1.this.m75243a(this.f72303c, false);
                    }
                    if (this.f72302b) {
                        C33969v1.this.m75254c(false);
                    }
                } catch (Throwable th2) {
                    if (C34012x4.m75438b(th2)) {
                        return;
                    }
                    th2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.v1$e */
    /* JADX INFO: compiled from: BUGLY */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis < C33969v1.this.f72293c) {
                C33784m0.m74004c().m74007a(C33969v1.this.new e(), (C33969v1.this.f72293c - jCurrentTimeMillis) + 5000);
            } else {
                C33969v1.this.m75240a(3, false, 0L);
                C33969v1.this.m75238a();
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.v1$f */
    /* JADX INFO: compiled from: BUGLY */
    public class f implements Runnable {

        /* JADX INFO: renamed from: b */
        public long f72306b;

        public f(long j11) {
            this.f72306b = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33969v1.this.m75254c(false);
            C33969v1.this.m75250b(this.f72306b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m75233c() {
        return f72290k;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75246a(long j11, long j12) {
        return j11 >= j12 && j11 - j12 <= 86400000;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m75252b(boolean z11) {
        AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C34065zh.f72635i);
        boolean z12 = false;
        if (abstractC34022xeM77083a != null && (abstractC34022xeM77083a instanceof C34065zh) && !((C34065zh) abstractC34022xeM77083a).m75604d()) {
            C34012x4.m75434a("userinfo upload is disabled by remote", new Object[0]);
            return false;
        }
        if (!f72290k || z11) {
            return true;
        }
        File file = new File(this.f72292b.getFilesDir(), f72289j);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!file.exists()) {
            C33539a7.m72315a(file, String.valueOf(jCurrentTimeMillis), 1024L, false);
            return true;
        }
        BufferedReader bufferedReaderM72567a = C33571bi.m72567a(file);
        if (bufferedReaderM72567a != null) {
            try {
                long jLongValue = Long.valueOf(bufferedReaderM72567a.readLine().trim()).longValue();
                if (!m75246a(jCurrentTimeMillis, jLongValue) || jCurrentTimeMillis - jLongValue >= this.f72291a) {
                    C33539a7.m72315a(file, String.valueOf(jCurrentTimeMillis), 1024L, false);
                    z12 = true;
                }
            } catch (Throwable th2) {
                try {
                    C34012x4.m75435a(th2);
                    C33539a7.m72315a(file, String.valueOf(jCurrentTimeMillis), 1024L, false);
                    try {
                        return true;
                    } catch (Exception e11) {
                        return true;
                    }
                } finally {
                    try {
                        bufferedReaderM72567a.close();
                    } catch (Exception e12) {
                        C34012x4.m75432a(LogState.WARN, e12);
                    }
                }
            }
        } else {
            z12 = true;
        }
        if (bufferedReaderM72567a != null) {
            try {
                bufferedReaderM72567a.close();
            } catch (Exception e13) {
                C34012x4.m75438b(e13);
            }
        }
        return z12;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m75255d(boolean z11) {
        try {
            if (m75251b()) {
                String str = C33765l2.m73825a(this.f72292b).f70745f;
                ArrayList arrayList = new ArrayList();
                List<UserInfoBean> listM75235a = m75235a(str);
                boolean z12 = true;
                if (listM75235a != null) {
                    m75228a(listM75235a, arrayList);
                    m75232b(listM75235a, arrayList);
                    int iM75223a = m75223a(listM75235a, 600000L);
                    if (iM75223a > 15) {
                        C34012x4.m75444f("[UserInfo] Upload user info too many times in 10 min: %d", Integer.valueOf(iM75223a));
                        z12 = false;
                    }
                } else {
                    listM75235a = new ArrayList<>();
                }
                if (arrayList.size() > 0) {
                    m75244a(arrayList);
                }
                if (z12 && listM75235a.size() != 0) {
                    C34012x4.m75434a("[UserInfo] Upload user info(size: %d)", Integer.valueOf(listM75235a.size()));
                    m75245a(listM75235a, z11);
                    return;
                }
                C34012x4.m75434a("[UserInfo] There is no user info in local database.", new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m75253c(long j11) {
        if (0 >= j11 || j11 >= 604800000) {
            return;
        }
        this.f72291a = j11;
        C33571bi.m72616c("userInfoMinInterval", String.valueOf(j11));
    }

    public C33969v1(Context context, boolean z11) {
        this.f72291a = 300000L;
        this.f72292b = context;
        this.f72295e = z11;
        try {
            this.f72291a = Long.parseLong(C33571bi.m72604b("userInfoMinInterval", "300000"));
            AbstractC34022xe abstractC34022xeM77083a = C35101b.m77082d().m77083a(C34065zh.f72635i);
            if ((abstractC34022xeM77083a instanceof C34065zh) && ((C34065zh) abstractC34022xeM77083a).m75604d() && ((C34065zh) abstractC34022xeM77083a).m75603c()) {
                C33695hg.m73279c().m73285a(true);
                C33695hg.m73279c().m73283a(this);
                C33695hg.m73279c().m73282a(((C34065zh) abstractC34022xeM77083a).m75602b());
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m75254c(boolean z11) {
        C33784m0 c33784m0M74004c = C33784m0.m74004c();
        if (c33784m0M74004c != null) {
            c33784m0M74004c.m74006a(new c(z11));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75229a(boolean z11) {
        f72290k = z11;
    }

    /* JADX INFO: renamed from: a */
    public static UserInfoBean m75224a(Context context, int i11) {
        C33765l2 c33765l2M73825a = C33765l2.m73825a(context);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f68540c = i11;
        userInfoBean.f68541d = c33765l2M73825a.f70745f;
        userInfoBean.f68542e = c33765l2M73825a.m73833F();
        userInfoBean.f68543f = System.currentTimeMillis();
        userInfoBean.f68544g = -1L;
        userInfoBean.f68552o = c33765l2M73825a.f70714F;
        userInfoBean.f68553p = i11 != 1 ? 0 : 1;
        userInfoBean.f68550m = c33765l2M73825a.m73838K();
        userInfoBean.f68551n = c33765l2M73825a.f70733Y;
        userInfoBean.f68545h = c33765l2M73825a.f70734Z;
        userInfoBean.f68546i = c33765l2M73825a.f70736a0;
        userInfoBean.f68547j = c33765l2M73825a.f70738b0;
        userInfoBean.f68549l = c33765l2M73825a.f70740c0;
        userInfoBean.f68556s = c33765l2M73825a.m73880i();
        userInfoBean.f68557t = c33765l2M73825a.m73878h();
        userInfoBean.f68554q = c33765l2M73825a.m73835H();
        userInfoBean.f68555r = c33765l2M73825a.m73828A();
        JSONObject jSONObjectM77158f = C33991w3.m75338a().m77158f();
        if (jSONObjectM77158f != null) {
            userInfoBean.m72175a("user_custom", jSONObjectM77158f.toString());
        }
        return userInfoBean;
    }

    /* JADX INFO: renamed from: b */
    public void m75250b(long j11) {
        C33784m0.m74004c().m74007a(new f(j11), j11);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m75251b() {
        C33905rh c33905rhM74876d;
        C33863pg c33863pgM74576b;
        if (!this.f72295e || (c33905rhM74876d = C33905rh.m74876d()) == null || (c33863pgM74576b = C33863pg.m74576b()) == null) {
            return false;
        }
        return !c33863pgM74576b.m74583d() || c33905rhM74876d.m74890a(1001);
    }

    /* JADX INFO: renamed from: a */
    public void m75240a(int i11, boolean z11, long j11) {
        C33863pg c33863pgM74576b = C33863pg.m74576b();
        if (c33863pgM74576b != null && !c33863pgM74576b.m74582c().f68569e && i11 != 1 && i11 != 3) {
            C34012x4.m75437b("UserInfo is disable", new Object[0]);
            return;
        }
        if (i11 == 1 || i11 == 3) {
            this.f72294d++;
        }
        C33784m0.m74004c().m74007a(new d(m75224a(this.f72292b, i11), z11), j11);
    }

    /* JADX INFO: renamed from: b */
    public static void m75232b(List<UserInfoBean> list, List<UserInfoBean> list2) {
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            UserInfoBean next = it.next();
            if (next.f68544g != -1) {
                it.remove();
                if (next.f68543f < C33571bi.m72601b()) {
                    list2.add(next);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75239a(int i11) {
        if (m75251b()) {
            UserInfoBean userInfoBeanM75224a = m75224a(this.f72292b, i11);
            m75242a(userInfoBeanM75224a);
            C33784m0.m74004c().m74006a(new a(userInfoBeanM75224a));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75241a(long j11) {
        C33784m0.m74004c().m74007a(new d(null, true), j11);
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m75248b(C33943tf c33943tf, C34005wh c34005wh) {
        C33765l2 c33765l2M73825a = C33765l2.m73825a(this.f72292b);
        JSONObject jSONObject = new JSONObject();
        try {
            UserMeta userMeta = new UserMeta();
            userMeta.uin = c33765l2M73825a.m73833F();
            userMeta.buildNumber = c33765l2M73825a.f70748g0;
            userMeta.appKey = "unknow_app_key";
            userMeta.appId = c33765l2M73825a.m73872e();
            userMeta.appVersion = c33765l2M73825a.f70714F;
            userMeta.sdkVersion = c33765l2M73825a.f70755k;
            userMeta.setModel(c33765l2M73825a.m73892o());
            userMeta.setUniqueID(c33765l2M73825a.m73890n());
            userMeta.setAppVersionMode(C33791m7.m74054e().getAppVersionMode());
            jSONObject = C33820nf.m74303a(this.f72292b, InterfaceC33617e1.f69654c, "union_dau", userMeta);
            jSONObject.put(C33820nf.f71164t, 3);
            JSONObject jSONObjectM75236a = m75236a(c33943tf, c34005wh);
            jSONObject.put(C33820nf.f71160p, jSONObjectM75236a);
            C34012x4.m75442d("[UserInfo] client_identify: %s, session_id: %s", jSONObject.opt(C33820nf.f71156l), jSONObjectM75236a.opt("session_id"));
            return jSONObject;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75238a() {
        this.f72293c = C33571bi.m72601b() + 86400000;
        C33784m0.m74004c().m74007a(new e(), (this.f72293c - System.currentTimeMillis()) + 5000);
    }

    /* JADX INFO: renamed from: a */
    public final void m75242a(UserInfoBean userInfoBean) {
        C33765l2 c33765l2M73827s;
        if (userInfoBean == null || (c33765l2M73827s = C33765l2.m73827s()) == null) {
            return;
        }
        userInfoBean.f68548k = c33765l2M73827s.m73829B();
    }

    @Override // com.tencent.bugly.proguard.C33695hg.c
    /* JADX INFO: renamed from: a */
    public void mo73289a(String str, boolean z11) {
        try {
            C33808n3.m74181a(C33598d3.m72772c(), C33695hg.f70134o, str);
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
        if (z11) {
            m75239a(9);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75228a(List<UserInfoBean> list, List<UserInfoBean> list2) {
        int size = list.size() - 20;
        if (size > 0) {
            int i11 = 0;
            while (i11 < list.size() - 1) {
                int i12 = i11 + 1;
                for (int i13 = i12; i13 < list.size(); i13++) {
                    if (list.get(i11).f68543f > list.get(i13).f68543f) {
                        UserInfoBean userInfoBean = list.get(i11);
                        list.set(i11, list.get(i13));
                        list.set(i13, userInfoBean);
                    }
                }
                i11 = i12;
            }
            for (int i14 = 0; i14 < size; i14++) {
                list2.add(list.get(i14));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m75223a(List<UserInfoBean> list, long j11) {
        int i11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        for (UserInfoBean userInfoBean : list) {
            if (userInfoBean.f68543f > jCurrentTimeMillis - j11 && ((i11 = userInfoBean.f68540c) == 1 || i11 == 4 || i11 == 3)) {
                i12++;
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: b */
    public ContentValues m75247b(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j11 = userInfoBean.f68539b;
            if (j11 > 0) {
                contentValues.put("_id", Long.valueOf(j11));
            }
            contentValues.put(C33641f4.f69827n, Long.valueOf(userInfoBean.f68543f));
            contentValues.put(C33641f4.f69829p, Long.valueOf(userInfoBean.f68544g));
            contentValues.put(C33641f4.f69828o, Integer.valueOf(userInfoBean.f68540c));
            contentValues.put(C33641f4.f69835v, userInfoBean.f68541d);
            contentValues.put(C33641f4.f69830q, C33571bi.m72596a(userInfoBean));
            return contentValues;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m75237a(C34005wh c34005wh) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (C33944tg c33944tg : c34005wh.f72466t) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("startTime", c33944tg.f72113q);
                jSONObject2.put("startType", (int) c33944tg.f72114r);
                jSONObject2.put("userId", c33944tg.f72115s);
                jSONObject2.put("proceName", c33944tg.f72116t);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("list", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75249b(int i11) {
        this.f72294d = i11;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m75236a(C33943tf c33943tf, C34005wh c34005wh) {
        JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
        try {
            boolean z11 = true;
            if (this.f72294d != 1) {
                z11 = false;
            }
            jSONObjectM74304a.put("first_report", z11);
            jSONObjectM74304a.put("feature_id_enabled", C33589cf.m72692a().m72695b());
            jSONObjectM74304a.put("app_channel", C33765l2.m73827s().m73868d());
            jSONObjectM74304a.put("process_name", c34005wh.f72464r);
            jSONObjectM74304a.put("component_info_str", c34005wh.f72467u.get("C04_SDK_INFO"));
            jSONObjectM74304a.put("apn", c33943tf.f72093F);
            jSONObjectM74304a.put("custom_upload_anything", C33765l2.m73827s().f70786z0);
            jSONObjectM74304a.put("upload_type", (int) c34005wh.f72463q);
            if (C33695hg.m73279c().m73287d()) {
                jSONObjectM74304a.put("session_id", C33695hg.m73279c().m73286b());
            }
            jSONObjectM74304a.put("sBuffer", m75237a(c34005wh));
            JSONObject jSONObjectM77158f = C33991w3.m75338a().m77158f();
            if (jSONObjectM77158f != null) {
                jSONObjectM74304a.put("user_custom", jSONObjectM77158f);
                return jSONObjectM74304a;
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
        return jSONObjectM74304a;
    }

    /* JADX INFO: renamed from: a */
    public void m75245a(List<UserInfoBean> list, boolean z11) {
        if (C33791m7.m74059g()) {
            C34012x4.m75444f("upload user info fail for app in standalone mode.", new Object[0]);
            return;
        }
        if (!m75252b(z11)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : list) {
                userInfoBean.f68544g = jCurrentTimeMillis;
                m75243a(userInfoBean, true);
            }
            C34012x4.m75444f("uploadCheck failed", new Object[0]);
            return;
        }
        C33695hg.m73279c().m73281a();
        C34005wh c34005whM75184a = C33962ue.m75184a(list, this.f72294d == 1 ? 1 : 2);
        if (c34005whM75184a == null) {
            C34012x4.m75444f("[UserInfo] Failed to create UserInfoPackage.", new Object[0]);
            return;
        }
        byte[] bArrM75185a = C33962ue.m75185a((JceStruct) c34005whM75184a);
        if (bArrM75185a == null) {
            C34012x4.m75444f("[UserInfo] Failed to encode data.", new Object[0]);
            return;
        }
        C33943tf c33943tfM75181a = C33962ue.m75181a(this.f72292b, C33556b3.f69067m, true, bArrM75185a);
        if (c33943tfM75181a == null) {
            C34012x4.m75444f("[UserInfo] Request package is null.", new Object[0]);
            return;
        }
        b bVar = new b(list);
        String str = C33863pg.m74576b().m74582c().f68579o;
        String str2 = StrategyBean.f68563w;
        C33765l2 c33765l2M73825a = C33765l2.m73825a(this.f72292b);
        if (c33765l2M73825a.m73843P()) {
            C34012x4.m75442d("user info with new protoc", new Object[0]);
            JSONObject jSONObjectM75248b = m75248b(c33943tfM75181a, c34005whM75184a);
            C33905rh.m74876d().m74886a(1001, jSONObjectM75248b.toString().getBytes(), C33597d2.m72768b() + "/v1/" + c33765l2M73825a.m73872e() + "/upload-json", C33597d2.f69500p + "/v1/" + c33765l2M73825a.m73872e() + "/upload-json", (InterfaceC33885qh) bVar, this.f72294d == 1, true);
            return;
        }
        C34012x4.m75442d("user info with old protoc", new Object[0]);
        C33905rh.m74876d().m74886a(1001, C33571bi.m72611b(C33962ue.m75186a((Object) c33943tfM75181a), 2), str, str2, (InterfaceC33885qh) bVar, this.f72294d == 1, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m75243a(UserInfoBean userInfoBean, boolean z11) {
        List<UserInfoBean> listM75235a;
        if (userInfoBean == null) {
            return;
        }
        if (!z11 && userInfoBean.f68540c != 1 && (listM75235a = m75235a(C33765l2.m73825a(this.f72292b).f70745f)) != null && listM75235a.size() >= 20) {
            C34012x4.m75442d("[UserInfo] There are too many user info in local: %d", Integer.valueOf(listM75235a.size()));
            return;
        }
        long jM72899a = C33620e4.m72891a().m72899a(C33641f4.f69818e, m75247b(userInfoBean), (InterfaceC33599d4) null, true);
        if (jM72899a >= 0) {
            C34012x4.m75434a("[Database] insert %s success with ID: %d", C33641f4.f69818e, Long.valueOf(jM72899a));
            userInfoBean.f68539b = jM72899a;
        }
    }

    /* JADX INFO: renamed from: a */
    public List<UserInfoBean> m75235a(String str) {
        Cursor cursorM72901a;
        String str2;
        try {
            if (C33571bi.m72617c(str)) {
                str2 = null;
            } else {
                str2 = "_pc = '" + str + "'";
            }
            cursorM72901a = C33620e4.m72891a().m72901a(C33641f4.f69818e, null, str2, null, null, true);
            if (cursorM72901a == null) {
                if (cursorM72901a != null) {
                    cursorM72901a.close();
                }
                return null;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                while (cursorM72901a.moveToNext()) {
                    UserInfoBean userInfoBeanM75234a = m75234a(cursorM72901a);
                    if (userInfoBeanM75234a != null) {
                        arrayList.add(userInfoBeanM75234a);
                    } else {
                        try {
                            long j11 = cursorM72901a.getLong(cursorM72901a.getColumnIndex("_id"));
                            sb2.append(" or ");
                            sb2.append("_id");
                            sb2.append(" = ");
                            sb2.append(j11);
                        } catch (Throwable unused) {
                            C34012x4.m75444f("[Database] unknown id.", new Object[0]);
                        }
                    }
                }
                String string = sb2.toString();
                if (string.length() > 0) {
                    C34012x4.m75444f("[Database] deleted %s error data %d", C33641f4.f69818e, Integer.valueOf(C33620e4.m72891a().m72897a(C33641f4.f69818e, string.substring(4), (String[]) null, (InterfaceC33599d4) null, true)));
                }
                cursorM72901a.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!C34012x4.m75438b(th)) {
                        th.printStackTrace();
                    }
                    return null;
                } finally {
                    if (cursorM72901a != null) {
                        cursorM72901a.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorM72901a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75244a(List<UserInfoBean> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size() && i11 < 50; i11++) {
            UserInfoBean userInfoBean = list.get(i11);
            sb2.append(" or _id = ");
            sb2.append(userInfoBean.f68539b);
        }
        String string = sb2.toString();
        if (string.length() > 0) {
            string = string.substring(4);
        }
        String str = string;
        sb2.setLength(0);
        try {
            C34012x4.m75434a("[Database] deleted %s data %d", C33641f4.f69818e, Integer.valueOf(C33620e4.m72891a().m72897a(C33641f4.f69818e, str, (String[]) null, (InterfaceC33599d4) null, true)));
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public UserInfoBean m75234a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex(C33641f4.f69830q));
            if (blob == null) {
                return null;
            }
            long j11 = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) C33571bi.m72571a(blob, UserInfoBean.CREATOR);
            if (userInfoBean == null) {
                return userInfoBean;
            }
            userInfoBean.f68539b = j11;
            return userInfoBean;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }
}
