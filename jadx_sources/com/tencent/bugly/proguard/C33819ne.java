package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ne */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33819ne implements InterfaceC33937t9 {

    /* JADX INFO: renamed from: b */
    public static final int f71120b = 10000;

    /* JADX INFO: renamed from: a */
    public long f71121a = 0;

    @Override // com.tencent.bugly.proguard.InterfaceC33937t9
    /* JADX INFO: renamed from: a */
    public void mo74290a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        m74298c(str, str2, str3);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33937t9
    /* JADX INFO: renamed from: b */
    public void mo74295b(String str) {
        C33620e4 c33620e4M72891a = C33620e4.m72891a();
        if (c33620e4M72891a == null) {
            return;
        }
        m74289a(c33620e4M72891a, "_process_launch_id = ?", new String[]{String.valueOf(str)});
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m74296c() {
        C33620e4 c33620e4M72891a = C33620e4.m72891a();
        Cursor cursorM72903a = null;
        if (c33620e4M72891a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            cursorM72903a = c33620e4M72891a.m72903a(true, C33641f4.f69825l, new String[]{C33641f4.f69837x, "count(*) as count", "max(_tm) as max_time"}, (String) null, (String[]) null, C33641f4.f69837x, (String) null, "max_time desc", (String) null, (InterfaceC33599d4) null, true);
            if (cursorM72903a != null) {
                int i11 = 0;
                while (cursorM72903a.moveToNext()) {
                    String string = cursorM72903a.getString(cursorM72903a.getColumnIndex(C33641f4.f69837x));
                    int i12 = cursorM72903a.getInt(cursorM72903a.getColumnIndex("count"));
                    if (i12 >= 0) {
                        i11 += i12;
                    }
                    if (i11 >= 10000) {
                        arrayList.add(string);
                    }
                }
            }
            C34012x4.m75434a("ProcessContext, query expired process launch id size {%s}", Integer.valueOf(arrayList.size()));
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
        m74288a(cursorM72903a);
        return arrayList;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33937t9
    /* JADX INFO: renamed from: a */
    public void mo74291a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return;
        }
        m74294b();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                m74298c(str, key, entry.getValue());
            }
        }
        m74297c("update-map");
    }

    /* JADX INFO: renamed from: b */
    public final ContentValues m74293b(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C33641f4.f69837x, str);
        contentValues.put(C33641f4.f69838y, str2);
        if (str3 == null) {
            str3 = "";
        }
        contentValues.put(C33641f4.f69839z, str3);
        contentValues.put(C33641f4.f69827n, Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    /* JADX INFO: renamed from: b */
    public final void m74294b() {
        if (C33900rc.f71640i) {
            this.f71121a = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33937t9
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo74286a(String str) {
        C33620e4 c33620e4M72891a;
        Cursor cursorM72903a = null;
        if (TextUtils.isEmpty(str) || (c33620e4M72891a = C33620e4.m72891a()) == null) {
            return null;
        }
        m74294b();
        HashMap map = new HashMap();
        try {
            cursorM72903a = c33620e4M72891a.m72903a(false, C33641f4.f69825l, new String[]{C33641f4.f69837x, C33641f4.f69838y, C33641f4.f69839z, C33641f4.f69827n}, "_process_launch_id = ? ", new String[]{str}, (String) null, (String) null, "_tm desc", (String) null, (InterfaceC33599d4) null, true);
            if (cursorM72903a != null) {
                while (cursorM72903a.moveToNext()) {
                    String string = cursorM72903a.getString(cursorM72903a.getColumnIndex(C33641f4.f69838y));
                    String string2 = cursorM72903a.getString(cursorM72903a.getColumnIndex(C33641f4.f69839z));
                    if (!TextUtils.isEmpty(string)) {
                        if (string2 == null) {
                            string2 = "";
                        }
                        map.put(string, string2);
                    }
                }
            }
        } catch (Throwable unused) {
            C34012x4.m75434a("ProcessContext, load count:%s", 0);
        }
        m74288a(cursorM72903a);
        m74297c("load");
        return map;
    }

    /* JADX INFO: renamed from: c */
    public final void m74298c(String str, String str2, String str3) {
        C33620e4 c33620e4M72891a = C33620e4.m72891a();
        if (c33620e4M72891a == null) {
            return;
        }
        try {
            if (c33620e4M72891a.m72899a(C33641f4.f69825l, m74293b(str, str2, str3), (InterfaceC33599d4) null, true) < 0) {
                C34012x4.m75442d("ProcessContext, update fail processLaunchID: %s, key: %s", str, str2);
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m74297c(String str) {
        if (C33900rc.f71640i) {
            C34012x4.m75434a("ProcessContext %s cost %s ms", str, Long.valueOf(SystemClock.elapsedRealtime() - this.f71121a));
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33937t9
    /* JADX INFO: renamed from: a */
    public void mo74287a() {
        m74294b();
        mo74292a(m74296c());
        m74297c("clear expired data");
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33937t9
    /* JADX INFO: renamed from: a */
    public void mo74292a(List<String> list) {
        C33620e4 c33620e4M72891a;
        if (list == null || list.isEmpty() || (c33620e4M72891a = C33620e4.m72891a()) == null) {
            return;
        }
        int size = list.size();
        int i11 = (size + 29) % 30;
        StringBuilder sb2 = new StringBuilder(1024);
        int i12 = 0;
        for (int i13 = 0; i13 < i11 && i12 < size; i13++) {
            sb2.setLength(0);
            sb2.append(C33641f4.f69837x);
            sb2.append(" IN (");
            for (int i14 = 0; i14 < 30 && i12 < size; i14++) {
                if (i14 > 0) {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(list.get(i12));
                sb2.append("\"");
                i12++;
            }
            sb2.append(")");
            m74289a(c33620e4M72891a, sb2.toString(), (String[]) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74289a(C33620e4 c33620e4, String str, String[] strArr) {
        try {
            int iM72897a = c33620e4.m72897a(C33641f4.f69825l, str, strArr, (InterfaceC33599d4) null, true);
            if (iM72897a < 0) {
                C34012x4.m75442d("ProcessContext, deleteExpiredData fail result: %s", Integer.valueOf(iM72897a));
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74288a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }
}
