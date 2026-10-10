package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.e4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33620e4 {

    /* JADX INFO: renamed from: a */
    public static C33620e4 f69668a;

    /* JADX INFO: renamed from: b */
    public static C33641f4 f69669b;

    /* JADX INFO: renamed from: c */
    public static boolean f69670c;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.e4$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends Thread {

        /* JADX INFO: renamed from: t */
        public static final int f69671t = 1;

        /* JADX INFO: renamed from: u */
        public static final int f69672u = 2;

        /* JADX INFO: renamed from: v */
        public static final int f69673v = 3;

        /* JADX INFO: renamed from: w */
        public static final int f69674w = 4;

        /* JADX INFO: renamed from: x */
        public static final int f69675x = 5;

        /* JADX INFO: renamed from: y */
        public static final int f69676y = 6;

        /* JADX INFO: renamed from: b */
        public int f69677b;

        /* JADX INFO: renamed from: c */
        public InterfaceC33599d4 f69678c;

        /* JADX INFO: renamed from: d */
        public String f69679d;

        /* JADX INFO: renamed from: e */
        public ContentValues f69680e;

        /* JADX INFO: renamed from: f */
        public boolean f69681f;

        /* JADX INFO: renamed from: g */
        public String[] f69682g;

        /* JADX INFO: renamed from: h */
        public String f69683h;

        /* JADX INFO: renamed from: i */
        public String[] f69684i;

        /* JADX INFO: renamed from: j */
        public String f69685j;

        /* JADX INFO: renamed from: k */
        public String f69686k;

        /* JADX INFO: renamed from: l */
        public String f69687l;

        /* JADX INFO: renamed from: m */
        public String f69688m;

        /* JADX INFO: renamed from: n */
        public String f69689n;

        /* JADX INFO: renamed from: o */
        public String[] f69690o;

        /* JADX INFO: renamed from: p */
        public int f69691p;

        /* JADX INFO: renamed from: q */
        public String f69692q;

        /* JADX INFO: renamed from: r */
        public byte[] f69693r;

        /* JADX INFO: renamed from: a */
        public void m72922a(String str, ContentValues contentValues) {
            this.f69679d = str;
            this.f69680e = contentValues;
        }

        public a(int i11, InterfaceC33599d4 interfaceC33599d4) {
            this.f69677b = i11;
            this.f69678c = interfaceC33599d4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            switch (this.f69677b) {
                case 1:
                    C33620e4.this.m72898a(this.f69679d, this.f69680e, this.f69678c);
                    break;
                case 2:
                    C33620e4.this.m72896a(this.f69679d, this.f69689n, this.f69690o, this.f69678c);
                    break;
                case 3:
                    Cursor cursorM72902a = C33620e4.this.m72902a(this.f69681f, this.f69679d, this.f69682g, this.f69683h, this.f69684i, this.f69685j, this.f69686k, this.f69687l, this.f69688m, this.f69678c);
                    if (cursorM72902a != null) {
                        cursorM72902a.close();
                    }
                    break;
                case 4:
                    C33620e4.this.m72911a(this.f69691p, this.f69692q, this.f69693r, this.f69678c);
                    break;
                case 5:
                    C33620e4.this.m72906a(this.f69691p, this.f69678c);
                    break;
                case 6:
                    C33620e4.this.m72909a(this.f69691p, this.f69692q, this.f69678c);
                    break;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m72924a(boolean z11, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
            this.f69681f = z11;
            this.f69679d = str;
            this.f69682g = strArr;
            this.f69683h = str2;
            this.f69684i = strArr2;
            this.f69685j = str3;
            this.f69686k = str4;
            this.f69687l = str5;
            this.f69688m = str6;
        }

        /* JADX INFO: renamed from: a */
        public void m72923a(String str, String str2, String[] strArr) {
            this.f69679d = str;
            this.f69689n = str2;
            this.f69690o = strArr;
        }

        /* JADX INFO: renamed from: a */
        public void m72921a(int i11, String str, byte[] bArr) {
            this.f69691p = i11;
            this.f69692q = str;
            this.f69693r = bArr;
        }

        /* JADX INFO: renamed from: a */
        public void m72919a(int i11) {
            this.f69691p = i11;
        }

        /* JADX INFO: renamed from: a */
        public void m72920a(int i11, String str) {
            this.f69691p = i11;
            this.f69692q = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e4 A[Catch: all -> 0x002c, PHI: r3
      0x00e4: PHI (r3v2 android.database.sqlite.SQLiteDatabase) = (r3v1 android.database.sqlite.SQLiteDatabase), (r3v3 android.database.sqlite.SQLiteDatabase) binds: [B:56:0x00e2, B:42:0x00c5] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x002c, blocks: (B:10:0x0028, B:13:0x0030, B:15:0x0034, B:33:0x00b1, B:35:0x00b8, B:53:0x00db, B:54:0x00de, B:57:0x00e4, B:61:0x00eb, B:62:0x00ee, B:65:0x00f4, B:66:0x00f7, B:40:0x00c1, B:46:0x00cc, B:48:0x00d2), top: B:77:0x0004, inners: #2 }] */
    /* JADX INFO: renamed from: b */
    public final synchronized List<C33543ab> m72915b(int i11) {
        Throwable th2;
        Cursor cursorQuery;
        SQLiteDatabase writableDatabase;
        try {
            try {
                writableDatabase = f69669b.getWritableDatabase();
                if (writableDatabase == null) {
                    if (f69670c && writableDatabase != null) {
                        writableDatabase.close();
                    }
                    return null;
                }
                try {
                    String str = "_id = " + i11;
                    cursorQuery = writableDatabase.query(C33641f4.f69820g, null, str, null, null, null, null);
                    if (cursorQuery == null) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (f69670c) {
                            writableDatabase.close();
                        }
                        return null;
                    }
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        ArrayList arrayList = new ArrayList();
                        while (cursorQuery.moveToNext()) {
                            C33543ab c33543abM72914b = m72914b(cursorQuery);
                            if (c33543abM72914b != null) {
                                arrayList.add(c33543abM72914b);
                            } else {
                                try {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(C33641f4.f69828o));
                                    sb2.append(" or ");
                                    sb2.append(C33641f4.f69828o);
                                    sb2.append(" = ");
                                    sb2.append(string);
                                } catch (Throwable unused) {
                                    C34012x4.m75444f("[Database] unknown id.", new Object[0]);
                                }
                            }
                        }
                        if (sb2.length() > 0) {
                            sb2.append(" and ");
                            sb2.append("_id");
                            sb2.append(" = ");
                            sb2.append(i11);
                            C34012x4.m75444f("[Database] deleted %s illegal data %d.", C33641f4.f69820g, Integer.valueOf(writableDatabase.delete(C33641f4.f69820g, str.substring(4), null)));
                        }
                        cursorQuery.close();
                        if (f69670c) {
                            writableDatabase.close();
                        }
                        return arrayList;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            if (!C34012x4.m75438b(th2)) {
                                th2.printStackTrace();
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (f69670c && writableDatabase != null) {
                                writableDatabase.close();
                            }
                            return null;
                        } catch (Throwable th4) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (!f69670c || writableDatabase == null) {
                                throw th4;
                            }
                            writableDatabase.close();
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    cursorQuery = null;
                }
            } catch (Throwable th6) {
                th2 = th6;
                cursorQuery = null;
                writableDatabase = null;
            }
        } catch (Throwable th7) {
            throw th7;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m72917c(C33543ab c33543ab) {
        ContentValues contentValuesM72913b;
        if (c33543ab == null) {
            return false;
        }
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f69669b.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM72913b = m72913b(c33543ab)) == null) {
                if (f69670c && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            }
            long jReplace = writableDatabase.replace(C33641f4.f69820g, "_id", contentValuesM72913b);
            if (jReplace < 0) {
                if (f69670c) {
                    writableDatabase.close();
                }
                return false;
            }
            C34012x4.m75434a("[Database] insert %s success.", C33641f4.f69820g);
            c33543ab.f68819a = jReplace;
            if (f69670c) {
                writableDatabase.close();
            }
            return true;
        } catch (Throwable th2) {
            try {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
                return false;
            } finally {
                if (f69670c && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m72918d(C33543ab c33543ab) {
        ContentValues contentValuesM72900a;
        if (c33543ab == null) {
            return false;
        }
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f69669b.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM72900a = m72900a(c33543ab)) == null) {
                if (f69670c && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            }
            long jReplace = writableDatabase.replace(C33641f4.f69819f, "_id", contentValuesM72900a);
            if (jReplace < 0) {
                if (f69670c) {
                    writableDatabase.close();
                }
                return false;
            }
            C34012x4.m75434a("[Database] insert %s success.", C33641f4.f69819f);
            c33543ab.f68819a = jReplace;
            if (f69670c) {
                writableDatabase.close();
            }
            return true;
        } catch (Throwable th2) {
            try {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
                return false;
            } finally {
                if (f69670c && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    public C33620e4(Context context, List<AbstractC33575c1> list) {
        f69669b = new C33641f4(context, list);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C33620e4 m72892a(Context context, List<AbstractC33575c1> list) {
        try {
            if (f69668a == null) {
                f69668a = new C33620e4(context, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f69668a;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C33620e4 m72891a() {
        return f69668a;
    }

    /* JADX INFO: renamed from: a */
    public long m72899a(String str, ContentValues contentValues, InterfaceC33599d4 interfaceC33599d4, boolean z11) {
        if (!z11) {
            a aVar = new a(1, interfaceC33599d4);
            aVar.f69679d = str;
            aVar.f69680e = contentValues;
            C33784m0.m74004c().m74006a(aVar);
            return 0L;
        }
        return m72898a(str, contentValues, interfaceC33599d4);
    }

    /* JADX INFO: renamed from: a */
    public Cursor m72901a(String str, String[] strArr, String str2, String[] strArr2, InterfaceC33599d4 interfaceC33599d4, boolean z11) {
        return m72903a(false, str, strArr, str2, strArr2, (String) null, (String) null, (String) null, (String) null, interfaceC33599d4, z11);
    }

    /* JADX INFO: renamed from: a */
    public Cursor m72903a(boolean z11, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC33599d4 interfaceC33599d4, boolean z12) {
        if (!z12) {
            a aVar = new a(3, interfaceC33599d4);
            aVar.m72924a(z11, str, strArr, str2, strArr2, str3, str4, str5, str6);
            C33784m0.m74004c().m74006a(aVar);
            return null;
        }
        return m72902a(z11, str, strArr, str2, strArr2, str3, str4, str5, str6, interfaceC33599d4);
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m72916c(int i11) {
        String str;
        SQLiteDatabase writableDatabase = f69669b.getWritableDatabase();
        if (writableDatabase != null) {
            if (i11 >= 0) {
                try {
                    str = "_tp = " + i11;
                } catch (Throwable th2) {
                    try {
                        if (!C34012x4.m75438b(th2)) {
                            th2.printStackTrace();
                        }
                        if (f69670c) {
                        }
                    } catch (Throwable th3) {
                        if (f69670c) {
                            writableDatabase.close();
                        }
                        throw th3;
                    }
                }
            } else {
                str = null;
            }
            C34012x4.m75434a("[Database] deleted %s data %d", C33641f4.f69819f, Integer.valueOf(writableDatabase.delete(C33641f4.f69819f, str, null)));
            if (f69670c) {
                writableDatabase.close();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m72897a(String str, String str2, String[] strArr, InterfaceC33599d4 interfaceC33599d4, boolean z11) {
        if (!z11) {
            a aVar = new a(2, interfaceC33599d4);
            aVar.m72923a(str, str2, strArr);
            C33784m0.m74004c().m74006a(aVar);
            return 0;
        }
        return m72896a(str, str2, strArr, interfaceC33599d4);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m72898a(String str, ContentValues contentValues, InterfaceC33599d4 interfaceC33599d4) {
        long j11;
        j11 = -1;
        try {
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = f69669b.getWritableDatabase();
                if (writableDatabase != null && contentValues != null) {
                    long jReplace = writableDatabase.replace(str, "_id", contentValues);
                    if (jReplace >= 0) {
                        C34012x4.m75434a("[Database] insert %s success.", str);
                    } else {
                        C34012x4.m75444f("[Database] replace %s error.", str);
                    }
                    j11 = jReplace;
                }
                if (interfaceC33599d4 != null) {
                    interfaceC33599d4.m72773a(Long.valueOf(j11));
                }
                if (f69670c && writableDatabase != null) {
                    writableDatabase.close();
                }
            } catch (Throwable th2) {
                try {
                    if (!C34012x4.m75438b(th2)) {
                        th2.printStackTrace();
                    }
                    if (interfaceC33599d4 != null) {
                        interfaceC33599d4.m72773a(-1L);
                    }
                    if (f69670c && 0 != 0) {
                    }
                } catch (Throwable th3) {
                    if (interfaceC33599d4 != null) {
                        interfaceC33599d4.m72773a(-1L);
                    }
                    if (f69670c && 0 != 0) {
                        writableDatabase.close();
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return j11;
    }

    /* JADX INFO: renamed from: b */
    public ContentValues m72913b(C33543ab c33543ab) {
        if (c33543ab != null && !C33571bi.m72617c(c33543ab.f68824f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j11 = c33543ab.f68819a;
                if (j11 > 0) {
                    contentValues.put("_id", Long.valueOf(j11));
                }
                contentValues.put(C33641f4.f69828o, c33543ab.f68824f);
                contentValues.put(C33641f4.f69827n, Long.valueOf(c33543ab.f68823e));
                byte[] bArr = c33543ab.f68825g;
                if (bArr != null) {
                    contentValues.put(C33641f4.f69830q, bArr);
                }
                return contentValues;
            } catch (Throwable th2) {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x003a, PHI: r2
      0x0036: PHI (r2v2 android.database.Cursor) = (r2v0 android.database.Cursor), (r2v4 android.database.Cursor) binds: [B:19:0x0034, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:20:0x0036, B:27:0x0041, B:28:0x0044, B:13:0x0027, B:15:0x002d, B:5:0x0004, B:7:0x000c), top: B:33:0x0004, inners: #0, #1 }] */
    /* JADX INFO: renamed from: a */
    public final synchronized Cursor m72902a(boolean z11, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC33599d4 interfaceC33599d4) {
        Cursor cursorQuery;
        cursorQuery = null;
        try {
            SQLiteDatabase writableDatabase = f69669b.getWritableDatabase();
            cursorQuery = writableDatabase != null ? writableDatabase.query(z11, str, strArr, str2, strArr2, str3, str4, str5, str6) : null;
            if (interfaceC33599d4 != null) {
                interfaceC33599d4.m72773a(cursorQuery);
            }
        } catch (Throwable th2) {
            try {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
                if (interfaceC33599d4 != null) {
                    interfaceC33599d4.m72773a(cursorQuery);
                }
            } catch (Throwable th3) {
                if (interfaceC33599d4 != null) {
                    interfaceC33599d4.m72773a(null);
                    throw th3;
                }
                throw th3;
            }
        }
        return cursorQuery;
    }

    /* JADX INFO: renamed from: b */
    public C33543ab m72914b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C33543ab c33543ab = new C33543ab();
            c33543ab.f68819a = cursor.getLong(cursor.getColumnIndex("_id"));
            c33543ab.f68823e = cursor.getLong(cursor.getColumnIndex(C33641f4.f69827n));
            c33543ab.f68824f = cursor.getString(cursor.getColumnIndex(C33641f4.f69828o));
            c33543ab.f68825g = cursor.getBlob(cursor.getColumnIndex(C33641f4.f69830q));
            return c33543ab;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m72896a(String str, String str2, String[] strArr, InterfaceC33599d4 interfaceC33599d4) {
        int iDelete;
        iDelete = 0;
        try {
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = f69669b.getWritableDatabase();
                iDelete = writableDatabase != null ? writableDatabase.delete(str, str2, strArr) : 0;
                if (interfaceC33599d4 != null) {
                    interfaceC33599d4.m72773a(Integer.valueOf(iDelete));
                }
                if (f69670c && writableDatabase != null) {
                    writableDatabase.close();
                }
            } catch (Throwable th2) {
                try {
                    if (!C34012x4.m75438b(th2)) {
                        th2.printStackTrace();
                    }
                    if (interfaceC33599d4 != null) {
                        interfaceC33599d4.m72773a(0);
                    }
                    if (f69670c && writableDatabase != null) {
                    }
                } catch (Throwable th3) {
                    if (interfaceC33599d4 != null) {
                        interfaceC33599d4.m72773a(0);
                    }
                    if (f69670c && writableDatabase != null) {
                        writableDatabase.close();
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return iDelete;
    }

    /* JADX INFO: renamed from: a */
    public boolean m72912a(int i11, String str, byte[] bArr, InterfaceC33599d4 interfaceC33599d4, boolean z11) {
        if (!z11) {
            a aVar = new a(4, interfaceC33599d4);
            aVar.m72921a(i11, str, bArr);
            C33784m0.m74004c().m74006a(aVar);
            return true;
        }
        return m72911a(i11, str, bArr, interfaceC33599d4);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, byte[]> m72907a(int i11, InterfaceC33599d4 interfaceC33599d4, boolean z11) {
        if (!z11) {
            a aVar = new a(5, interfaceC33599d4);
            aVar.f69691p = i11;
            C33784m0.m74004c().m74006a(aVar);
            return null;
        }
        return m72906a(i11, interfaceC33599d4);
    }

    /* JADX INFO: renamed from: a */
    public boolean m72910a(int i11, String str, InterfaceC33599d4 interfaceC33599d4, boolean z11) {
        if (!z11) {
            a aVar = new a(6, interfaceC33599d4);
            aVar.f69691p = i11;
            aVar.f69692q = str;
            C33784m0.m74004c().m74006a(aVar);
            return false;
        }
        return m72909a(i11, str, interfaceC33599d4);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72911a(int i11, String str, byte[] bArr, InterfaceC33599d4 interfaceC33599d4) {
        try {
            C33543ab c33543ab = new C33543ab();
            c33543ab.f68819a = i11;
            c33543ab.f68824f = str;
            c33543ab.f68823e = System.currentTimeMillis();
            c33543ab.f68825g = bArr;
            boolean zM72917c = m72917c(c33543ab);
            if (interfaceC33599d4 != null) {
                interfaceC33599d4.m72773a(Boolean.valueOf(zM72917c));
            }
            return zM72917c;
        } catch (Throwable th2) {
            try {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
            } finally {
                if (interfaceC33599d4 != null) {
                    interfaceC33599d4.m72773a(Boolean.FALSE);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, byte[]> m72906a(int i11, InterfaceC33599d4 interfaceC33599d4) {
        HashMap map = null;
        try {
            List<C33543ab> listM72915b = m72915b(i11);
            if (listM72915b != null) {
                HashMap map2 = new HashMap();
                try {
                    for (C33543ab c33543ab : listM72915b) {
                        byte[] bArr = c33543ab.f68825g;
                        if (bArr != null) {
                            map2.put(c33543ab.f68824f, bArr);
                        }
                    }
                    map = map2;
                } catch (Throwable th2) {
                    th = th2;
                    map = map2;
                    try {
                        if (!C34012x4.m75438b(th)) {
                            th.printStackTrace();
                        }
                        return map;
                    } finally {
                        if (interfaceC33599d4 != null) {
                            interfaceC33599d4.m72773a(map);
                        }
                    }
                }
            }
            if (interfaceC33599d4 != null) {
                interfaceC33599d4.m72773a(map);
            }
            return map;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #0 {all -> 0x00c3, blocks: (B:42:0x00b9, B:44:0x00bf), top: B:63:0x00b9, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:3:0x0001, B:14:0x0032, B:17:0x003a, B:19:0x003e, B:37:0x00ad, B:39:0x00b4, B:49:0x00c8, B:50:0x00cb, B:52:0x00cf, B:54:0x00d5, B:55:0x00d8, B:57:0x00dc, B:58:0x00df, B:42:0x00b9, B:44:0x00bf), top: B:65:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:3:0x0001, B:14:0x0032, B:17:0x003a, B:19:0x003e, B:37:0x00ad, B:39:0x00b4, B:49:0x00c8, B:50:0x00cb, B:52:0x00cf, B:54:0x00d5, B:55:0x00d8, B:57:0x00dc, B:58:0x00df, B:42:0x00b9, B:44:0x00bf), top: B:65:0x0001, inners: #0 }] */
    /* JADX INFO: renamed from: a */
    public synchronized List<C33543ab> m72905a(int i11) {
        String str;
        Throwable th2;
        Cursor cursor;
        try {
            SQLiteDatabase writableDatabase = f69669b.getWritableDatabase();
            if (writableDatabase != null) {
                if (i11 >= 0) {
                    try {
                        str = "_tp = " + i11;
                    } catch (Throwable th3) {
                        th2 = th3;
                        cursor = null;
                        try {
                            if (!C34012x4.m75438b(th2)) {
                                th2.printStackTrace();
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (f69670c) {
                                writableDatabase.close();
                            }
                            return null;
                        } catch (Throwable th4) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (f69670c) {
                                writableDatabase.close();
                                throw th4;
                            }
                            throw th4;
                        }
                    }
                } else {
                    str = null;
                }
                Cursor cursorQuery = writableDatabase.query(C33641f4.f69819f, null, str, null, null, null, null);
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (f69670c) {
                        writableDatabase.close();
                    }
                    return null;
                }
                try {
                    StringBuilder sb2 = new StringBuilder();
                    ArrayList arrayList = new ArrayList();
                    while (cursorQuery.moveToNext()) {
                        C33543ab c33543abM72904a = m72904a(cursorQuery);
                        if (c33543abM72904a != null) {
                            arrayList.add(c33543abM72904a);
                        } else {
                            try {
                                long j11 = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
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
                        C34012x4.m75444f("[Database] deleted %s illegal data %d", C33641f4.f69819f, Integer.valueOf(writableDatabase.delete(C33641f4.f69819f, string.substring(4), null)));
                    }
                    cursorQuery.close();
                    if (f69670c) {
                        writableDatabase.close();
                    }
                    return arrayList;
                } catch (Throwable th5) {
                    cursor = cursorQuery;
                    th2 = th5;
                    if (!C34012x4.m75438b(th2)) {
                        th2.printStackTrace();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (f69670c) {
                        writableDatabase.close();
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m72908a(List<C33543ab> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    SQLiteDatabase writableDatabase = f69669b.getWritableDatabase();
                    if (writableDatabase != null) {
                        StringBuilder sb2 = new StringBuilder();
                        for (C33543ab c33543ab : list) {
                            sb2.append(" or _id = ");
                            sb2.append(c33543ab.f68819a);
                        }
                        String string = sb2.toString();
                        if (string.length() > 0) {
                            string = string.substring(4);
                        }
                        sb2.setLength(0);
                        try {
                            C34012x4.m75434a("[Database] deleted %s data %d", C33641f4.f69819f, Integer.valueOf(writableDatabase.delete(C33641f4.f69819f, string, null)));
                            if (f69670c) {
                                writableDatabase.close();
                            }
                        } catch (Throwable th2) {
                            try {
                                if (!C34012x4.m75438b(th2)) {
                                    th2.printStackTrace();
                                }
                                if (f69670c) {
                                }
                            } catch (Throwable th3) {
                                if (f69670c) {
                                    writableDatabase.close();
                                }
                                throw th3;
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public ContentValues m72900a(C33543ab c33543ab) {
        if (c33543ab == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j11 = c33543ab.f68819a;
            if (j11 > 0) {
                contentValues.put("_id", Long.valueOf(j11));
            }
            contentValues.put(C33641f4.f69828o, Integer.valueOf(c33543ab.f68820b));
            contentValues.put(C33641f4.f69835v, c33543ab.f68821c);
            contentValues.put(C33641f4.f69836w, c33543ab.f68822d);
            contentValues.put(C33641f4.f69827n, Long.valueOf(c33543ab.f68823e));
            byte[] bArr = c33543ab.f68825g;
            if (bArr != null) {
                contentValues.put(C33641f4.f69830q, bArr);
            }
            return contentValues;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public C33543ab m72904a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C33543ab c33543ab = new C33543ab();
            c33543ab.f68819a = cursor.getLong(cursor.getColumnIndex("_id"));
            c33543ab.f68820b = cursor.getInt(cursor.getColumnIndex(C33641f4.f69828o));
            c33543ab.f68821c = cursor.getString(cursor.getColumnIndex(C33641f4.f69835v));
            c33543ab.f68822d = cursor.getString(cursor.getColumnIndex(C33641f4.f69836w));
            c33543ab.f68823e = cursor.getLong(cursor.getColumnIndex(C33641f4.f69827n));
            c33543ab.f68825g = cursor.getBlob(cursor.getColumnIndex(C33641f4.f69830q));
            return c33543ab;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m72909a(int i11, String str, InterfaceC33599d4 interfaceC33599d4) {
        boolean z11;
        String str2;
        SQLiteDatabase sQLiteDatabase = null;
        z11 = false;
        try {
            try {
                SQLiteDatabase writableDatabase = f69669b.getWritableDatabase();
                if (writableDatabase != null) {
                    try {
                        if (C33571bi.m72617c(str)) {
                            str2 = "_id = " + i11;
                        } else {
                            str2 = "_id = " + i11 + " and _tp = \"" + str + "\"";
                        }
                        int iDelete = writableDatabase.delete(C33641f4.f69820g, str2, null);
                        C34012x4.m75434a("[Database] deleted %s data %d", C33641f4.f69820g, Integer.valueOf(iDelete));
                        if (iDelete > 0) {
                            z11 = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = writableDatabase;
                        try {
                            if (!C34012x4.m75438b(th)) {
                                th.printStackTrace();
                            }
                            if (interfaceC33599d4 != null) {
                                interfaceC33599d4.m72773a(Boolean.FALSE);
                            }
                            if (f69670c && sQLiteDatabase != null) {
                                writableDatabase = sQLiteDatabase;
                            }
                            return z11;
                        } catch (Throwable th3) {
                            if (interfaceC33599d4 != null) {
                                interfaceC33599d4.m72773a(Boolean.FALSE);
                            }
                            if (f69670c && sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            throw th3;
                        }
                    }
                }
                if (interfaceC33599d4 != null) {
                    interfaceC33599d4.m72773a(Boolean.valueOf(z11));
                }
                if (f69670c && writableDatabase != null) {
                    writableDatabase.close();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        return z11;
    }
}
