package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.cg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33590cg {

    /* JADX INFO: renamed from: c */
    public static final String f69433c = "BuglyJavaCrash";

    /* JADX INFO: renamed from: d */
    public static final String f69434d = "BuglyJavaCrashReport";

    /* JADX INFO: renamed from: e */
    public static final String f69435e = "BuglyNativeCrash";

    /* JADX INFO: renamed from: f */
    public static final String f69436f = "BuglyNativeCrashReport";

    /* JADX INFO: renamed from: g */
    public static final String f69437g = "BuglyAnrCrash";

    /* JADX INFO: renamed from: h */
    public static final String f69438h = "BuglyAnrCrashReport";

    /* JADX INFO: renamed from: i */
    public static final String f69439i = "realtime";

    /* JADX INFO: renamed from: j */
    public static final String f69440j = "cache";

    /* JADX INFO: renamed from: k */
    public static final String f69441k = "expired";

    /* JADX INFO: renamed from: l */
    public static final int f69442l = 7;

    /* JADX INFO: renamed from: m */
    public static final long f69443m = 86400000;

    /* JADX INFO: renamed from: n */
    public static final int f69444n = 30;

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f69445a;

    /* JADX INFO: renamed from: b */
    public final C33888r0 f69446b;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.cg$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f69447b;

        public a(List list) {
            this.f69447b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33590cg.this.m72714d(this.f69447b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.cg$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C33590cg f69449a = new C33590cg();
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.cg$c */
    /* JADX INFO: compiled from: BUGLY */
    public static class c {

        /* JADX INFO: renamed from: a */
        public String f69450a;

        /* JADX INFO: renamed from: b */
        public long f69451b;

        /* JADX INFO: renamed from: c */
        public String f69452c;

        /* JADX INFO: renamed from: b */
        public String m72721b() {
            return this.f69450a;
        }

        /* JADX INFO: renamed from: a */
        public void m72719a(long j11) {
            this.f69451b = j11;
        }

        /* JADX INFO: renamed from: b */
        public void m72722b(String str) {
            this.f69450a = str;
        }

        /* JADX INFO: renamed from: c */
        public long m72723c() {
            return this.f69451b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SLAData{uuid='");
            sb2.append(this.f69450a);
            sb2.append("', time=");
            sb2.append(this.f69451b);
            sb2.append(", data='");
            return C34025xh.m75464a(sb2, this.f69452c, "'}");
        }

        /* JADX INFO: renamed from: a */
        public String m72718a() {
            return this.f69452c;
        }

        /* JADX INFO: renamed from: a */
        public void m72720a(String str) {
            this.f69452c = str;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.cg$d */
    /* JADX INFO: compiled from: BUGLY */
    public static class d {

        /* JADX INFO: renamed from: a */
        public String f69453a;

        /* JADX INFO: renamed from: b */
        public String f69454b;

        /* JADX INFO: renamed from: c */
        public long f69455c;

        /* JADX INFO: renamed from: d */
        public boolean f69456d;

        /* JADX INFO: renamed from: e */
        public long f69457e;

        /* JADX INFO: renamed from: f */
        public String f69458f;

        /* JADX INFO: renamed from: g */
        public String f69459g;

        public d(String str, String str2, long j11, boolean z11, long j12, String str3, String str4) {
            this.f69453a = str;
            this.f69454b = str2;
            this.f69455c = j11;
            this.f69456d = z11;
            this.f69457e = j12;
            this.f69458f = str3;
            this.f69459g = str4;
        }

        /* JADX INFO: renamed from: b */
        public String m72729b() {
            return this.f69453a;
        }

        /* JADX INFO: renamed from: c */
        public long m72732c() {
            return this.f69455c;
        }

        /* JADX INFO: renamed from: d */
        public String m72734d() {
            return this.f69454b;
        }

        /* JADX INFO: renamed from: a */
        public void m72727a(String str) {
            this.f69453a = str;
        }

        /* JADX INFO: renamed from: b */
        public void m72731b(String str) {
            this.f69454b = str;
        }

        /* JADX INFO: renamed from: c */
        public void m72733c(String str) {
            this.f69458f = str;
        }

        /* JADX INFO: renamed from: d */
        public void m72735d(String str) {
            this.f69459g = str;
        }

        /* JADX INFO: renamed from: e */
        public String m72736e() {
            return this.f69458f;
        }

        /* JADX INFO: renamed from: f */
        public String m72737f() {
            return this.f69459g;
        }

        /* JADX INFO: renamed from: g */
        public boolean m72738g() {
            return this.f69456d;
        }

        /* JADX INFO: renamed from: a */
        public void m72728a(boolean z11) {
            this.f69456d = z11;
        }

        /* JADX INFO: renamed from: b */
        public void m72730b(long j11) {
            this.f69455c = j11;
        }

        /* JADX INFO: renamed from: a */
        public long m72725a() {
            return this.f69457e;
        }

        /* JADX INFO: renamed from: a */
        public void m72726a(long j11) {
            this.f69457e = j11;
        }

        public d() {
        }
    }

    public /* synthetic */ C33590cg(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: b */
    public void m72708b(d dVar) {
        if (dVar == null || TextUtils.isEmpty(dVar.m72734d())) {
            C34012x4.m75444f("sla report event is null", new Object[0]);
        } else {
            C34012x4.m75434a("sla report single event", new Object[0]);
            m72709b(Collections.singletonList(dVar));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m72710c() {
        List<c> listM72707b = m72707b();
        if (listM72707b == null || listM72707b.isEmpty()) {
            C34012x4.m75434a("sla local data is null", new Object[0]);
            return;
        }
        C34012x4.m75434a("sla load local data list size:%s", Integer.valueOf(listM72707b.size()));
        Iterator<c> it = listM72707b.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            c next = it.next();
            if (m72705a(next.m72723c())) {
                C34012x4.m75431a(LogState.DEBUG, "sla local data is expired:%s", next.m72718a());
                arrayList.add(next);
                it.remove();
            }
        }
        m72704a(arrayList);
        m72712c(listM72707b);
    }

    /* JADX INFO: renamed from: d */
    public final void m72714d(List<c> list) {
        if (list == null || list.isEmpty()) {
            C34012x4.m75434a("sla batch report data is empty", new Object[0]);
            return;
        }
        C34012x4.m75434a("sla batch report list size:%s", Integer.valueOf(list.size()));
        if (list.size() > 30) {
            list = list.subList(0, 29);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m72718a());
        }
        Pair<Integer, String> pairM74707a = this.f69446b.m74707a(arrayList);
        C34012x4.m75431a(LogState.DEBUG, "sla batch report result, rspCode:%s rspMsg:%s", pairM74707a.first, pairM74707a.second);
        if (((Integer) pairM74707a.first).intValue() == 200) {
            m72704a(list);
        }
    }

    public C33590cg() {
        this.f69445a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        this.f69446b = new C33888r0();
    }

    /* JADX INFO: renamed from: a */
    public static C33590cg m72699a() {
        return b.f69449a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72705a(long j11) {
        return j11 < C33571bi.m72601b() - 604800000;
    }

    /* JADX INFO: renamed from: e */
    public final void m72715e(List<c> list) {
        for (c cVar : list) {
            C34012x4.m75434a("sla save id:%s time:%s msg:%s", cVar.m72721b(), Long.valueOf(cVar.m72723c()), cVar.m72718a());
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", cVar.m72721b());
                contentValues.put(C33641f4.f69827n, Long.valueOf(cVar.m72723c()));
                contentValues.put(C33641f4.f69830q, cVar.m72718a());
                C33620e4.m72891a().m72899a(C33641f4.f69824k, contentValues, (InterfaceC33599d4) null, true);
            } catch (Throwable th2) {
                C34012x4.m75432a(LogState.ERROR, th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final c m72701a(d dVar) {
        if (dVar != null && !TextUtils.isEmpty(dVar.m72734d())) {
            C33765l2 c33765l2M73827s = C33765l2.m73827s();
            if (c33765l2M73827s == null) {
                C34012x4.m75444f("sla convert failed because ComInfoManager is null", new Object[0]);
                return null;
            }
            StringBuilder sb2 = new StringBuilder("&app_version=");
            sb2.append(c33765l2M73827s.f70714F);
            sb2.append("&app_name=");
            sb2.append(c33765l2M73827s.f70716H);
            sb2.append("&app_bundle_id=");
            sb2.append(c33765l2M73827s.f70743e);
            sb2.append("&client_type=android&user_id=");
            sb2.append(c33765l2M73827s.m73833F());
            sb2.append("&sdk_version=");
            sb2.append(c33765l2M73827s.f70755k);
            sb2.append("&event_code=");
            sb2.append(dVar.m72734d());
            sb2.append("&event_result=");
            sb2.append(dVar.m72738g() ? 1 : 0);
            sb2.append("&event_time=");
            sb2.append(this.f69445a.format(new Date(dVar.m72732c())));
            sb2.append("&event_cost=");
            sb2.append(dVar.m72725a());
            sb2.append("&device_id=");
            sb2.append(c33765l2M73827s.m73890n());
            sb2.append("&debug=");
            sb2.append(c33765l2M73827s.f70742d0 ? 1 : 0);
            sb2.append("&param_0=");
            sb2.append(dVar.m72736e());
            sb2.append("&param_1=");
            sb2.append(dVar.m72729b());
            sb2.append("&param_2=");
            sb2.append(c33765l2M73827s.f70756k0 ? "rqd" : "ext");
            sb2.append("&param_4=");
            sb2.append(c33765l2M73827s.m73872e());
            String string = sb2.toString();
            if (!TextUtils.isEmpty(dVar.f69459g)) {
                string = string + "&param_3=" + dVar.f69459g;
            }
            C34012x4.m75434a("sla convert eventId:%s eventType:%s, eventTime:%s success:%s cost:%s from:%s uploadMsg:", dVar.m72729b(), dVar.m72734d(), Long.valueOf(dVar.m72732c()), Boolean.valueOf(dVar.m72738g()), Long.valueOf(dVar.m72725a()), dVar.m72736e(), dVar.m72737f());
            String str = dVar.m72729b() + C33820nf.f71144W + dVar.m72734d();
            c cVar = new c();
            cVar.f69450a = str;
            cVar.f69451b = dVar.m72732c();
            cVar.f69452c = string;
            return cVar;
        }
        C34012x4.m75444f("sla convert event is null", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m72709b(List<d> list) {
        if (list != null && !list.isEmpty()) {
            C34012x4.m75434a("sla batch report event size:%s", Integer.valueOf(list.size()));
            ArrayList arrayList = new ArrayList();
            Iterator<d> it = list.iterator();
            while (it.hasNext()) {
                c cVarM72701a = m72701a(it.next());
                if (cVarM72701a != null) {
                    arrayList.add(cVarM72701a);
                }
            }
            m72715e(arrayList);
            m72712c(arrayList);
            return;
        }
        C34012x4.m75444f("sla batch report event is null", new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public c m72706b(String str) {
        String[] strArrSplit = str.split("\t");
        if (strArrSplit.length != 13) {
            C34012x4.m75437b("Not a valid crash processing record!", new Object[0]);
            m72711c(str);
            return null;
        }
        if (strArrSplit[0].length() == 1 && Character.isDigit(strArrSplit[0].charAt(0)) && strArrSplit[1].length() == 1 && Character.isDigit(strArrSplit[1].charAt(0))) {
            C33765l2 c33765l2M73827s = C33765l2.m73827s();
            long jCurrentTimeMillis = System.currentTimeMillis();
            c cVar = new c();
            try {
                String str2 = "&app_version=" + c33765l2M73827s.f70714F + "&app_name=" + c33765l2M73827s.f70716H + "&app_bundle_id=" + c33765l2M73827s.f70743e + "&client_type=android&user_id=" + c33765l2M73827s.m73833F() + "&sdk_version=" + c33765l2M73827s.f70755k + "&event_time=" + this.f69445a.format(new Date(jCurrentTimeMillis)) + "&device_id=" + c33765l2M73827s.m73890n() + "&debug=" + (c33765l2M73827s.f70742d0 ? 1 : 0) + "&event_code=BuglyCrashCatchEvent&cpu_arch=" + c33765l2M73827s.m73888m() + "&param_0=" + strArrSplit[0] + "&event_result=" + strArrSplit[1] + "&error_code=" + strArrSplit[2] + "&param_7=" + strArrSplit[3] + "&param_2=" + strArrSplit[4] + "&param_1=" + strArrSplit[5] + "&param_3=" + strArrSplit[6] + "&param_4=" + strArrSplit[7] + "&param_5=" + strArrSplit[8] + "&param_6=" + strArrSplit[9] + "&param_10=" + strArrSplit[10] + "&use_time=" + strArrSplit[11] + "&app_foreground=" + strArrSplit[12];
                C34012x4.m75434a("Processing record: %s", str2);
                cVar.f69450a = strArrSplit[2];
                cVar.f69451b = jCurrentTimeMillis;
                cVar.f69452c = str2;
                return cVar;
            } catch (Throwable th2) {
                C34012x4.m75434a(C33799mf.m74131a("Crash processing record is invalid!", th2), new Object[0]);
                m72711c(str);
                return null;
            }
        }
        C34012x4.m75437b("Not a valid crash processing record!", new Object[0]);
        m72711c(str);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m72713d(String str) {
        C34012x4.m75442d("Crash processing record dir path: %s", str);
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles.length > 0) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.exists()) {
                    C34012x4.m75431a(LogState.INFO, "Crash processing record file exist, path: %s", file.toString());
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            } else {
                                arrayList2.add(line);
                            }
                        }
                        bufferedReader.close();
                        inputStreamReader.close();
                    } catch (FileNotFoundException e11) {
                        e11.printStackTrace();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        c cVarM72706b = m72706b((String) it.next());
                        if (cVarM72706b != null) {
                            arrayList.add(cVarM72706b);
                        }
                    }
                    file.delete();
                    C34012x4.m75431a(LogState.INFO, "Delete crash processing record file: %s", file.toString());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m72715e(arrayList);
        C34012x4.m75431a(LogState.INFO, "Success save crash processing info.", new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m72712c(List<c> list) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C33784m0.m74004c().m74006a(new a(list));
        } else {
            m72714d(list);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m72711c(String str) {
        C33765l2 c33765l2M73827s = C33765l2.m73827s();
        String str2 = "&app_version=" + c33765l2M73827s.f70714F + "&app_name=" + c33765l2M73827s.f70716H + "&app_bundle_id=" + c33765l2M73827s.f70743e + "&client_type=android&user_id=" + c33765l2M73827s.m73833F() + "&sdk_version=" + c33765l2M73827s.f70755k + "&event_time=" + this.f69445a.format(new Date(System.currentTimeMillis())) + "&device_id=" + c33765l2M73827s.m73890n() + "&debug=" + (c33765l2M73827s.f70742d0 ? 1 : 0) + "&event_code=BuglyCrashCatchInvalid&param_0=" + str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Pair<Integer, String> pairM74707a = this.f69446b.m74707a(arrayList);
        C34012x4.m75434a("Report an invalid crash processing record, rspCode:%s rspMsg:%s", pairM74707a.first, pairM74707a.second);
    }

    /* JADX INFO: renamed from: a */
    public final void m72703a(String str) {
        C34012x4.m75434a("sla delete id:%s", str);
        try {
            C33620e4.m72891a().m72897a(C33641f4.f69824k, "_id = ?", new String[]{"" + str}, (InterfaceC33599d4) null, true);
        } catch (Throwable th2) {
            C34012x4.m75432a(LogState.ERROR, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m72704a(List<c> list) {
        if (list != null && !list.isEmpty()) {
            C34012x4.m75434a("sla batch delete list size:%s", Integer.valueOf(list.size()));
            try {
                String str = "_id in (" + m72702a(",", list) + ")";
                C34012x4.m75431a(LogState.DEBUG, "sla batch delete where:%s", str);
                C33620e4.m72891a().m72897a(C33641f4.f69824k, str, (String[]) null, (InterfaceC33599d4) null, true);
                return;
            } catch (Throwable th2) {
                C34012x4.m75432a(LogState.ERROR, th2);
                return;
            }
        }
        C34012x4.m75434a("sla batch delete list is null", new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public final List<c> m72707b() {
        Cursor cursorM72903a = C33620e4.m72891a().m72903a(false, C33641f4.f69824k, new String[]{"_id", C33641f4.f69827n, C33641f4.f69830q}, (String) null, (String[]) null, (String) null, (String) null, C33641f4.f69827n, "30", (InterfaceC33599d4) null, true);
        if (cursorM72903a == null) {
            return null;
        }
        if (cursorM72903a.getCount() < 1) {
            cursorM72903a.close();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursorM72903a.moveToNext()) {
            try {
                c cVar = new c();
                cVar.f69450a = cursorM72903a.getString(cursorM72903a.getColumnIndex("_id"));
                cVar.f69451b = cursorM72903a.getLong(cursorM72903a.getColumnIndex(C33641f4.f69827n));
                cVar.f69452c = cursorM72903a.getString(cursorM72903a.getColumnIndex(C33641f4.f69830q));
                C34012x4.m75434a(cVar.toString(), new Object[0]);
                arrayList.add(cVar);
            } catch (Throwable th2) {
                try {
                    C34012x4.m75435a(th2);
                    return arrayList;
                } finally {
                    cursorM72903a.close();
                }
            }
        }
        cursorM72903a.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m72702a(String str, Iterable<c> iterable) {
        Iterator<c> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("'");
        sb2.append(it.next().f69450a);
        sb2.append("'");
        while (it.hasNext()) {
            sb2.append(str);
            sb2.append("'");
            sb2.append(it.next().f69450a);
            sb2.append("'");
        }
        return sb2.toString();
    }
}
