package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgk extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgi zzb;
    private boolean zzc;

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    @WorkerThread
    public final boolean zzn() {
        return zzs(3, new byte[0]);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #14 {all -> 0x0099, blocks: (B:30:0x008e, B:32:0x0094, B:45:0x00b7, B:47:0x00db, B:49:0x00e5, B:51:0x00ed, B:61:0x0107, B:75:0x012f, B:77:0x0135, B:78:0x0138, B:93:0x016d, B:85:0x0158), top: B:109:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:80:0x014d  */
    /* JADX WARN: Code duplicated, block: B:88:0x015f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0164 A[PHI: r8 r10 r17
      0x0164: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:81:0x0150, B:96:0x0184, B:89:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:81:0x0150, B:96:0x0184, B:89:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:81:0x0150, B:96:0x0184, B:89:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0181  */
    @WorkerThread
    private final boolean zzs(int i11, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzp;
        boolean z11;
        boolean z12;
        Cursor cursorRawQuery;
        zzg();
        boolean z13 = false;
        z13 = false;
        if (!this.zzc) {
            zzib zzibVar = this.zzu;
            zzal zzalVarZzc = zzibVar.zzc();
            zzfw zzfwVar = zzfx.zzbc;
            Cursor cursor = null;
            cursor = null;
            zzr zzrVarZzh = zzalVarZzc.zzp(null, zzfwVar) ? this.zzu.zzv().zzh(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i11));
            contentValues.put("entry", bArr);
            if (zzibVar.zzc().zzp(null, zzfwVar) && zzrVarZzh != null) {
                contentValues.put("app_version", zzrVarZzh.zzc);
                contentValues.put("app_version_int", Long.valueOf(zzrVarZzh.zzj));
            }
            zzibVar.zzc();
            int i12 = 0;
            int i13 = 5;
            for (int i14 = 5; i12 < i14; i14 = 5) {
                try {
                    sQLiteDatabaseZzp = zzp();
                    if (sQLiteDatabaseZzp == null) {
                        this.zzc = true;
                    } else {
                        try {
                            sQLiteDatabaseZzp.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseZzp.rawQuery("select count(1) from messages", null);
                            long j11 = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j11 = cursorRawQuery.getLong(z13 ? 1 : 0);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursorRawQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseZzp != null) {
                                            sQLiteDatabaseZzp.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z11 = z13 ? 1 : 0;
                                    SystemClock.sleep(i13);
                                    i13 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i12++;
                                    z13 = z11;
                                } catch (SQLiteFullException e11) {
                                    e = e11;
                                    z11 = z13 ? 1 : 0;
                                    this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                    this.zzc = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i12++;
                                    z13 = z11;
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    z11 = z13 ? 1 : 0;
                                    z12 = true;
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.endTransaction();
                                    }
                                    this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                    this.zzc = z12;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i12++;
                                    z13 = z11;
                                }
                            }
                            if (j11 >= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                zzibVar.zzaV().zzb().zza("Data loss, local db full");
                                long j12 = 100001 - j11;
                                long jDelete = sQLiteDatabaseZzp.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j12)});
                                if (jDelete != j12) {
                                    zzgr zzgrVarZzb = zzibVar.zzaV().zzb();
                                    z11 = z13 ? 1 : 0;
                                    try {
                                        try {
                                            z12 = true;
                                            try {
                                                zzgrVarZzb.zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j12), Long.valueOf(jDelete), Long.valueOf(j12 - jDelete));
                                            } catch (SQLiteFullException e13) {
                                                e = e13;
                                                this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                                this.zzc = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseZzp != null) {
                                                    sQLiteDatabaseZzp.close();
                                                }
                                                i12++;
                                                z13 = z11;
                                            } catch (SQLiteException e14) {
                                                e = e14;
                                                if (sQLiteDatabaseZzp != null && sQLiteDatabaseZzp.inTransaction()) {
                                                    sQLiteDatabaseZzp.endTransaction();
                                                }
                                                this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                                this.zzc = z12;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseZzp != null) {
                                                    sQLiteDatabaseZzp.close();
                                                }
                                                i12++;
                                                z13 = z11;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i13);
                                            i13 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseZzp != null) {
                                                sQLiteDatabaseZzp.close();
                                            }
                                            i12++;
                                            z13 = z11;
                                        }
                                    } catch (SQLiteFullException e15) {
                                        e = e15;
                                        this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                        this.zzc = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzp != null) {
                                            sQLiteDatabaseZzp.close();
                                        }
                                        i12++;
                                        z13 = z11;
                                    } catch (SQLiteException e16) {
                                        e = e16;
                                        z12 = true;
                                        if (sQLiteDatabaseZzp != null) {
                                            sQLiteDatabaseZzp.endTransaction();
                                        }
                                        this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                        this.zzc = z12;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzp != null) {
                                            sQLiteDatabaseZzp.close();
                                        }
                                        i12++;
                                        z13 = z11;
                                    }
                                } else {
                                    z11 = z13 ? 1 : 0;
                                    z12 = true;
                                }
                            } else {
                                z11 = z13 ? 1 : 0;
                                z12 = true;
                            }
                            sQLiteDatabaseZzp.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseZzp.setTransactionSuccessful();
                            sQLiteDatabaseZzp.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseZzp.close();
                            return z12;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z11 = z13 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e17) {
                            e = e17;
                            z11 = z13 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e18) {
                            e = e18;
                            z11 = z13 ? 1 : 0;
                            z12 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z11 = z13 ? 1 : 0;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e19) {
                    e = e19;
                    z11 = z13 ? 1 : 0;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e21) {
                    e = e21;
                    z11 = z13 ? 1 : 0;
                    z12 = true;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabaseZzp = null;
                }
            }
            boolean z14 = z13 ? 1 : 0;
            this.zzu.zzaV().zzk().zza("Failed to write entry to local database");
            return z14;
        }
        return z13;
    }

    public final boolean zzk(zzah zzahVar) {
        zzib zzibVar = this.zzu;
        byte[] bArrZzae = zzibVar.zzk().zzae(zzahVar);
        if (bArrZzae.length <= 131072) {
            return zzs(2, bArrZzae);
        }
        zzibVar.zzaV().zzc().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzl(zzbe zzbeVar) {
        zzib zzibVar = this.zzu;
        byte[] bArrZzae = zzibVar.zzk().zzae(zzbeVar);
        if (bArrZzae == null) {
            zzibVar.zzaV().zzc().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrZzae.length <= 131072) {
            return zzs(4, bArrZzae);
        }
        zzibVar.zzaV().zzc().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x033a A[Catch: all -> 0x0113, TryCatch #40 {all -> 0x0113, blocks: (B:38:0x00e0, B:40:0x00e6, B:42:0x00f9, B:44:0x00ff, B:58:0x0139, B:63:0x0151, B:65:0x0156, B:183:0x0334, B:185:0x033a, B:186:0x033d, B:193:0x035f, B:201:0x0379, B:80:0x018b, B:81:0x018e, B:79:0x0187, B:89:0x01a1, B:91:0x01b5, B:98:0x01d0, B:99:0x01d9, B:100:0x01dc, B:96:0x01ca, B:103:0x01e0, B:107:0x01f6, B:121:0x021d, B:122:0x0227, B:123:0x022a, B:119:0x0217, B:126:0x0230, B:130:0x0244, B:144:0x0269, B:146:0x0273, B:147:0x0276, B:142:0x0263, B:150:0x027b, B:151:0x028b, B:158:0x02ca, B:160:0x02e7, B:161:0x02f6), top: B:235:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x034f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0366  */
    /* JADX WARN: Code duplicated, block: B:198:0x036b A[PHI: r6 r11 r13 r17 r19 r21
      0x036b: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:189:0x0352, B:204:0x038e, B:197:0x0369] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:189:0x0352, B:204:0x038e, B:197:0x0369] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r13v9 ??) = (r13v5 ??), (r13v7 ??), (r13v10 ??) binds: [B:189:0x0352, B:204:0x038e, B:197:0x0369] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:189:0x0352, B:204:0x038e, B:197:0x0369] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:189:0x0352, B:204:0x038e, B:197:0x0369] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:189:0x0352, B:204:0x038e, B:197:0x0369] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x038b  */
    /* JADX WARN: Code duplicated, block: B:208:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:235:0x0334 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0391 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x0391 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0391 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.google.android.gms.measurement.internal.zzal] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    public final List zzm(int i11) {
        Cursor cursor;
        ?? r13;
        ?? Zzp;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j11;
        ?? r17;
        ?? r16;
        long j12;
        String string;
        zzib zzibVar;
        int i12;
        int i13;
        zzbe zzbeVarCreateFromParcel;
        zzah zzahVarCreateFromParcel;
        zzpk zzpkVarCreateFromParcel;
        String str = "entry";
        String str2 = "type";
        String str3 = "rowid";
        zzg();
        ?? r11 = 0;
        if (this.zzc) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzq()) {
            return arrayList;
        }
        int i14 = 0;
        int i15 = 5;
        int i16 = 0;
        for (int i17 = 5; i16 < i17; i17 = 5) {
            try {
                Zzp = zzp();
                try {
                    if (Zzp == 0) {
                        this.zzc = true;
                        return r11;
                    }
                    try {
                        Zzp.beginTransaction();
                        try {
                            cursorQuery2 = Zzp.query("messages", new String[]{str3}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                            try {
                                long j13 = -1;
                                if (cursorQuery2.moveToFirst()) {
                                    j11 = cursorQuery2.getLong(i14);
                                    cursorQuery2.close();
                                } else {
                                    cursorQuery2.close();
                                    j11 = -1;
                                }
                                if (j11 != -1) {
                                    String[] strArr = new String[1];
                                    strArr[i14] = String.valueOf(j11);
                                    r16 = "rowid<?";
                                    r17 = strArr;
                                } else {
                                    ?? r18 = r11;
                                    r17 = r18;
                                    r16 = r18;
                                }
                                String[] strArr2 = {str3, str2, str};
                                zzib zzibVar2 = this.zzu;
                                ?? Zzc = zzibVar2.zzc();
                                int i18 = 1;
                                zzfw zzfwVar = zzfx.zzbc;
                                boolean zZzp = Zzc.zzp(r11, zzfwVar);
                                int i19 = 4;
                                int i21 = 3;
                                int i22 = 2;
                                if (zZzp) {
                                    strArr2 = new String[i17];
                                    strArr2[i14] = str3;
                                    strArr2[1] = str2;
                                    strArr2[2] = str;
                                    strArr2[3] = "app_version";
                                    strArr2[4] = "app_version_int";
                                }
                                String[] strArr3 = strArr2;
                                zzib zzibVar3 = zzibVar2;
                                cursorQuery = Zzp.query("messages", strArr3, r16, r17, null, null, "rowid asc", Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j13 = cursorQuery.getLong(i14);
                                        int i23 = cursorQuery.getInt(i18);
                                        byte[] blob = cursorQuery.getBlob(i22);
                                        try {
                                            if (zzibVar3.zzc().zzp(null, zzfwVar)) {
                                                string = cursorQuery.getString(i21);
                                                j12 = cursorQuery.getLong(i19);
                                            } else {
                                                j12 = 0;
                                                string = null;
                                            }
                                            String str4 = str;
                                            long j14 = j12;
                                            str2 = str2;
                                            if (i23 == 0) {
                                                try {
                                                    Parcel parcelObtain = Parcel.obtain();
                                                    zzibVar = zzibVar3;
                                                    try {
                                                        str3 = str3;
                                                        try {
                                                            try {
                                                                parcelObtain.unmarshall(blob, 0, blob.length);
                                                                parcelObtain.setDataPosition(0);
                                                                zzbg zzbgVarCreateFromParcel = zzbg.CREATOR.createFromParcel(parcelObtain);
                                                                try {
                                                                    parcelObtain.recycle();
                                                                    if (zzbgVarCreateFromParcel != null) {
                                                                        arrayList.add(new zzgj(zzbgVarCreateFromParcel, string, j14));
                                                                    }
                                                                    str = str4;
                                                                    i13 = 2;
                                                                    i12 = 3;
                                                                    i14 = 0;
                                                                } catch (SQLiteDatabaseLockedException unused) {
                                                                    str = str4;
                                                                    i14 = 0;
                                                                    SystemClock.sleep(i15);
                                                                    i15 += 20;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzp != 0) {
                                                                        Zzp.close();
                                                                    }
                                                                    i16++;
                                                                    i14 = i14;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r11 = 0;
                                                                } catch (SQLiteFullException e11) {
                                                                    e = e11;
                                                                    str = str4;
                                                                    i14 = 0;
                                                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                    this.zzc = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzp != 0) {
                                                                        Zzp.close();
                                                                    }
                                                                    i16++;
                                                                    i14 = i14;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r11 = 0;
                                                                } catch (SQLiteException e12) {
                                                                    e = e12;
                                                                    str = str4;
                                                                    i14 = 0;
                                                                    if (Zzp != 0) {
                                                                        try {
                                                                            if (Zzp.inTransaction()) {
                                                                                Zzp.endTransaction();
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            cursor = cursorQuery;
                                                                            r13 = Zzp;
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                            if (r13 != 0) {
                                                                                r13.close();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                    this.zzc = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzp != 0) {
                                                                        Zzp.close();
                                                                    }
                                                                    i16++;
                                                                    i14 = i14;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r11 = 0;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                parcelObtain.recycle();
                                                                throw th;
                                                            }
                                                        } catch (SafeParcelReader.ParseException unused2) {
                                                            this.zzu.zzaV().zzb().zza("Failed to load event from local database");
                                                            parcelObtain.recycle();
                                                        }
                                                    } catch (SafeParcelReader.ParseException unused3) {
                                                        str3 = str3;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused4) {
                                                    str3 = str3;
                                                } catch (SQLiteFullException e13) {
                                                    e = e13;
                                                    str3 = str3;
                                                } catch (SQLiteException e14) {
                                                    e = e14;
                                                    str3 = str3;
                                                }
                                            } else {
                                                zzibVar = zzibVar3;
                                                str3 = str3;
                                                if (i23 == 1) {
                                                    Parcel parcelObtain2 = Parcel.obtain();
                                                    try {
                                                        try {
                                                            parcelObtain2.unmarshall(blob, 0, blob.length);
                                                            parcelObtain2.setDataPosition(0);
                                                            zzpkVarCreateFromParcel = zzpk.CREATOR.createFromParcel(parcelObtain2);
                                                            parcelObtain2.recycle();
                                                        } catch (Throwable th5) {
                                                            parcelObtain2.recycle();
                                                            throw th5;
                                                        }
                                                    } catch (SafeParcelReader.ParseException unused5) {
                                                        this.zzu.zzaV().zzb().zza("Failed to load user property from local database");
                                                        parcelObtain2.recycle();
                                                        zzpkVarCreateFromParcel = null;
                                                    }
                                                    if (zzpkVarCreateFromParcel != null) {
                                                        arrayList.add(new zzgj(zzpkVarCreateFromParcel, string, j14));
                                                    }
                                                    str = str4;
                                                    i13 = 2;
                                                    i12 = 3;
                                                    i14 = 0;
                                                } else {
                                                    i13 = 2;
                                                    if (i23 == 2) {
                                                        Parcel parcelObtain3 = Parcel.obtain();
                                                        try {
                                                            str = str4;
                                                            try {
                                                                try {
                                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain3.setDataPosition(0);
                                                                    zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
                                                                    try {
                                                                        parcelObtain3.recycle();
                                                                        if (zzahVarCreateFromParcel != null) {
                                                                            arrayList.add(new zzgj(zzahVarCreateFromParcel, string, j14));
                                                                        }
                                                                        i12 = 3;
                                                                        i14 = 0;
                                                                    } catch (SQLiteDatabaseLockedException unused6) {
                                                                        i14 = 0;
                                                                        SystemClock.sleep(i15);
                                                                        i15 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzp != 0) {
                                                                            Zzp.close();
                                                                        }
                                                                        i16++;
                                                                        i14 = i14;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r11 = 0;
                                                                    } catch (SQLiteFullException e15) {
                                                                        e = e15;
                                                                        i14 = 0;
                                                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                        this.zzc = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzp != 0) {
                                                                            Zzp.close();
                                                                        }
                                                                        i16++;
                                                                        i14 = i14;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r11 = 0;
                                                                    } catch (SQLiteException e16) {
                                                                        e = e16;
                                                                        i14 = 0;
                                                                        if (Zzp != 0) {
                                                                            if (Zzp.inTransaction()) {
                                                                                Zzp.endTransaction();
                                                                            }
                                                                        }
                                                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                        this.zzc = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzp != 0) {
                                                                            Zzp.close();
                                                                        }
                                                                        i16++;
                                                                        i14 = i14;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r11 = 0;
                                                                    }
                                                                } catch (SafeParcelReader.ParseException unused7) {
                                                                    this.zzu.zzaV().zzb().zza("Failed to load conditional user property from local database");
                                                                    parcelObtain3.recycle();
                                                                    zzahVarCreateFromParcel = null;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                parcelObtain3.recycle();
                                                                throw th;
                                                            }
                                                        } catch (SafeParcelReader.ParseException unused8) {
                                                            str = str4;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            str = str4;
                                                        }
                                                    } else {
                                                        str = str4;
                                                        if (i23 == 4) {
                                                            Parcel parcelObtain4 = Parcel.obtain();
                                                            try {
                                                                i14 = 0;
                                                                try {
                                                                    try {
                                                                        parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                        parcelObtain4.setDataPosition(0);
                                                                        zzbeVarCreateFromParcel = zzbe.CREATOR.createFromParcel(parcelObtain4);
                                                                        try {
                                                                            parcelObtain4.recycle();
                                                                            if (zzbeVarCreateFromParcel != null) {
                                                                                arrayList.add(new zzgj(zzbeVarCreateFromParcel, string, j14));
                                                                            }
                                                                            i12 = 3;
                                                                        } catch (SQLiteDatabaseLockedException unused9) {
                                                                            SystemClock.sleep(i15);
                                                                            i15 += 20;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzp != 0) {
                                                                                Zzp.close();
                                                                            }
                                                                            i16++;
                                                                            i14 = i14;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r11 = 0;
                                                                        } catch (SQLiteFullException e17) {
                                                                            e = e17;
                                                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                            this.zzc = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzp != 0) {
                                                                                Zzp.close();
                                                                            }
                                                                            i16++;
                                                                            i14 = i14;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r11 = 0;
                                                                        } catch (SQLiteException e18) {
                                                                            e = e18;
                                                                            if (Zzp != 0) {
                                                                                if (Zzp.inTransaction()) {
                                                                                    Zzp.endTransaction();
                                                                                }
                                                                            }
                                                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                            this.zzc = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzp != 0) {
                                                                                Zzp.close();
                                                                            }
                                                                            i16++;
                                                                            i14 = i14;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r11 = 0;
                                                                        }
                                                                    } catch (SafeParcelReader.ParseException unused10) {
                                                                        this.zzu.zzaV().zzb().zza("Failed to load default event parameters from local database");
                                                                        parcelObtain4.recycle();
                                                                        zzbeVarCreateFromParcel = null;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    parcelObtain4.recycle();
                                                                    throw th;
                                                                }
                                                            } catch (SafeParcelReader.ParseException unused11) {
                                                                i14 = 0;
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } else {
                                                            i12 = 3;
                                                            i14 = 0;
                                                            if (i23 == 3) {
                                                                this.zzu.zzaV().zzk().zza("Skipping app launch break");
                                                            } else {
                                                                this.zzu.zzaV().zzb().zza("Unknown record type in local database");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i21 = i12;
                                            i14 = i14;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                            i18 = 1;
                                            i19 = 4;
                                            i22 = i13;
                                            zzibVar3 = zzibVar;
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteFullException e19) {
                                            e = e19;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteException e21) {
                                            e = e21;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused13) {
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i14 = i14;
                                    } catch (SQLiteFullException e22) {
                                        e = e22;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i14 = i14;
                                    } catch (SQLiteException e23) {
                                        e = e23;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i14 = i14;
                                    }
                                }
                                if (Zzp.delete("messages", "rowid <= ?", new String[]{Long.toString(j13)}) < arrayList.size()) {
                                    this.zzu.zzaV().zzb().zza("Fewer entries removed from local database than expected");
                                }
                                Zzp.setTransactionSuccessful();
                                Zzp.endTransaction();
                                cursorQuery.close();
                                Zzp.close();
                                return arrayList;
                            } catch (Throwable th10) {
                                th = th10;
                                if (cursorQuery2 != null) {
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused14) {
                                        cursorQuery = null;
                                        SystemClock.sleep(i15);
                                        i15 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (Zzp != 0) {
                                            Zzp.close();
                                        }
                                        i16++;
                                        i14 = i14;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r11 = 0;
                                    } catch (SQLiteFullException e24) {
                                        e = e24;
                                        Zzp = Zzp;
                                        cursorQuery = null;
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (Zzp != 0) {
                                            Zzp.close();
                                        }
                                        i16++;
                                        i14 = i14;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r11 = 0;
                                    } catch (SQLiteException e25) {
                                        e = e25;
                                        Zzp = Zzp;
                                        cursorQuery = null;
                                        if (Zzp != 0) {
                                            if (Zzp.inTransaction()) {
                                                Zzp.endTransaction();
                                            }
                                        }
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (Zzp != 0) {
                                            Zzp.close();
                                        }
                                        i16++;
                                        i14 = i14;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r11 = 0;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            cursorQuery2 = null;
                        }
                    } catch (SQLiteDatabaseLockedException unused15) {
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i14 = i14;
                    } catch (SQLiteFullException e26) {
                        e = e26;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i14 = i14;
                        Zzp = Zzp;
                    } catch (SQLiteException e27) {
                        e = e27;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i14 = i14;
                        Zzp = Zzp;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    cursor = null;
                    r13 = Zzp;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (r13 != 0) {
                        r13.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused16) {
                str = str;
                str2 = str2;
                str3 = str3;
                i14 = i14;
                Zzp = 0;
            } catch (SQLiteFullException e28) {
                e = e28;
                str = str;
                str2 = str2;
                str3 = str3;
                i14 = i14;
                Zzp = 0;
            } catch (SQLiteException e29) {
                e = e29;
                str = str;
                str2 = str2;
                str3 = str3;
                i14 = i14;
                Zzp = 0;
            } catch (Throwable th13) {
                th = th13;
                cursor = null;
                r13 = 0;
            }
        }
        this.zzu.zzaV().zze().zza("Failed to read events from database in reasonable time");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c A[PHI: r4
      0x006c: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:34:0x007f, B:31:0x006a, B:28:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    @WorkerThread
    public final boolean zzo() {
        zzg();
        if (!this.zzc && zzq()) {
            int i11 = 5;
            for (int i12 = 0; i12 < 5; i12++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseZzp = zzp();
                            if (sQLiteDatabaseZzp != null) {
                                sQLiteDatabaseZzp.beginTransaction();
                                sQLiteDatabaseZzp.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                sQLiteDatabaseZzp.setTransactionSuccessful();
                                sQLiteDatabaseZzp.endTransaction();
                                sQLiteDatabaseZzp.close();
                                return true;
                            }
                            this.zzc = true;
                        } catch (SQLiteException e11) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th2;
                                }
                            }
                            this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e11);
                            this.zzc = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i11);
                        i11 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e12) {
                    this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e12);
                    this.zzc = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.zzu.zzaV().zze().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase zzp() throws SQLiteException {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    @VisibleForTesting
    public final boolean zzq() {
        zzib zzibVar = this.zzu;
        Context contextZzaY = zzibVar.zzaY();
        zzibVar.zzc();
        return contextZzaY.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public zzgk(zzib zzibVar) {
        super(zzibVar);
        Context contextZzaY = this.zzu.zzaY();
        this.zzu.zzc();
        this.zzb = new zzgi(this, contextZzaY, "google_app_measurement_local.db");
    }

    @WorkerThread
    public final void zzh() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzp = zzp();
            if (sQLiteDatabaseZzp != null && (iDelete = sQLiteDatabaseZzp.delete("messages", null, null)) > 0) {
                this.zzu.zzaV().zzk().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e11) {
            this.zzu.zzaV().zzb().zzb("Error resetting local analytics data. error", e11);
        }
    }

    public final boolean zzi(zzbg zzbgVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbh.zza(zzbgVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            this.zzu.zzaV().zzc().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zzs(0, bArrMarshall);
    }

    public final boolean zzj(zzpk zzpkVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzpl.zza(zzpkVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            this.zzu.zzaV().zzc().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zzs(1, bArrMarshall);
    }
}
