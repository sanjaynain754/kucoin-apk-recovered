package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ua */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class RunnableC33958ua implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final String f72250e = "sosha1_";

    /* JADX INFO: renamed from: f */
    public static final String f72251f = "#";

    /* JADX INFO: renamed from: b */
    public Context f72252b;

    /* JADX INFO: renamed from: c */
    public String f72253c;

    /* JADX INFO: renamed from: d */
    public List<File> f72254d;

    /* JADX INFO: renamed from: a */
    public static void m75172a(List<File> list, String str) {
        File[] fileArrListFiles;
        if (str == null) {
            C34012x4.m75444f("so path is empty, won't add.", new Object[0]);
            return;
        }
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new a())) != null) {
                for (File file2 : fileArrListFiles) {
                    if (!list.contains(file2)) {
                        list.add(file2);
                    }
                }
            }
        } catch (Exception e11) {
            C34012x4.m75438b(e11);
            C34012x4.m75431a(LogState.WARN, "Failed to add so files.", new Object[0]);
        }
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        C33620e4 c33620e4;
        C34012x4.m75434a("rqdp{ run libs file record task }", new Object[0]);
        ArrayList arrayList = new ArrayList(20);
        List<File> list = this.f72254d;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(this.f72254d);
        }
        m75172a(arrayList, this.f72253c);
        List<PlugInBean> listM75169a = m75169a();
        HashMap map = new HashMap(20);
        for (PlugInBean plugInBean : listM75169a) {
            try {
                String str = plugInBean.f68559b.split(f72251f)[0];
                map.put(str, new PlugInBean(str, plugInBean.f68560c, plugInBean.f68561d));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (!map.isEmpty()) {
            C33765l2.m73827s().m73861b(map);
        }
        List<PlugInBean> listM75170a = m75170a(arrayList, listM75169a);
        C33620e4.m72891a().m72910a(1003, (String) null, (InterfaceC33599d4) null, true);
        for (PlugInBean plugInBean2 : listM75170a) {
            synchronized (C33620e4.class) {
                c33620e4 = C33620e4.f69668a;
            }
            c33620e4.m72912a(1003, f72250e + plugInBean2.f68561d, C33571bi.m72596a(plugInBean2), (InterfaceC33599d4) null, true);
        }
        m75171a(listM75170a);
        C34012x4.m75431a(LogState.DEBUG, "rqdp{ libs file record task finished }", new Object[0]);
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ua$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith("so");
        }
    }

    public RunnableC33958ua(Context context, String str, List<File> list) {
        this.f72252b = context;
        this.f72253c = str;
        this.f72254d = list;
    }

    /* JADX INFO: renamed from: a */
    public static List<PlugInBean> m75169a() {
        ArrayList arrayList = new ArrayList(20);
        try {
            for (Map.Entry<String, byte[]> entry : C33620e4.m72891a().m72907a(1003, (InterfaceC33599d4) null, true).entrySet()) {
                if (entry.getKey().startsWith(f72250e)) {
                    arrayList.add((PlugInBean) C33571bi.m72571a(entry.getValue(), PlugInBean.CREATOR));
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static List<PlugInBean> m75170a(List<File> list, List<PlugInBean> list2) throws Throwable {
        ArrayList arrayList = new ArrayList(20);
        for (File file : list) {
            Iterator<PlugInBean> it = list2.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                try {
                    PlugInBean next = it.next();
                    if (m75173a(next, file)) {
                        it.remove();
                        arrayList.add(next);
                        z11 = true;
                        C34012x4.m75434a("rqdp{  BufFB existed n:}%s ,ar:%s, md:%s", next.f68559b, next.f68560c, next.f68561d);
                        break;
                    }
                    continue;
                } catch (Throwable th2) {
                    if (!C34012x4.m75438b(th2)) {
                        th2.printStackTrace();
                    }
                }
            }
            if (!z11) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                PlugInBean plugInBeanM75168a = m75168a(file);
                if (plugInBeanM75168a != null) {
                    arrayList.add(plugInBeanM75168a);
                } else {
                    C34012x4.m75434a("rqdp{  Error BufFB md fail! pth:}%s , rqdp{  cs:}%d", file.getAbsolutePath(), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75173a(PlugInBean plugInBean, File file) {
        try {
            String[] strArrSplit = plugInBean.f68559b.split(f72251f, 3);
            return file.getAbsolutePath().equals(strArrSplit[0]) && file.lastModified() == Long.parseLong(strArrSplit[2]) && file.length() == Long.parseLong(strArrSplit[1]) && plugInBean.f68561d != null;
        } catch (Exception e11) {
            C34012x4.m75438b(e11);
            C34012x4.m75431a(LogState.WARN, "Failed to judge whether plugin is legal or not.", new Object[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static PlugInBean m75168a(File file) throws Throwable {
        String strM72579a = C33571bi.m72579a(file, "SHA-1");
        if (strM72579a == null) {
            return null;
        }
        PlugInBean plugInBean = new PlugInBean(file.getAbsolutePath() + f72251f + file.length() + f72251f + file.lastModified(), C33765l2.m73827s().m73886l(), strM72579a);
        C34012x4.m75434a("rqdp{  BufFB new }plugid:%s , plugtype:%s , plugsha1:%s", plugInBean.f68559b, plugInBean.f68560c, plugInBean.f68561d);
        return plugInBean;
    }

    /* JADX INFO: renamed from: a */
    public static void m75171a(List<PlugInBean> list) {
        HashMap map = new HashMap(20);
        for (PlugInBean plugInBean : list) {
            try {
                String str = plugInBean.f68559b.split(f72251f)[0];
                map.put(str, new PlugInBean(str, plugInBean.f68560c, plugInBean.f68561d));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        C33765l2.m73827s().m73861b(map);
    }
}
