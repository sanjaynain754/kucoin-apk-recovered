package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpq;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzad extends zzor {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:105:0x0257  */
    /* JADX WARN: Code duplicated, block: B:107:0x0262  */
    /* JADX WARN: Code duplicated, block: B:111:0x028f A[Catch: all -> 0x02aa, SQLiteException -> 0x02ac, LOOP:11: B:111:0x028f->B:515:?, LOOP_START, TryCatch #4 {all -> 0x02aa, blocks: (B:109:0x0289, B:111:0x028f, B:113:0x02a0, B:119:0x02ae, B:122:0x02c3, B:131:0x02d1), top: B:436:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a0 A[Catch: all -> 0x02aa, SQLiteException -> 0x02ac, TryCatch #4 {all -> 0x02aa, blocks: (B:109:0x0289, B:111:0x028f, B:113:0x02a0, B:119:0x02ae, B:122:0x02c3, B:131:0x02d1), top: B:436:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c3 A[Catch: all -> 0x02aa, SQLiteException -> 0x02ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x02aa, blocks: (B:109:0x0289, B:111:0x028f, B:113:0x02a0, B:119:0x02ae, B:122:0x02c3, B:131:0x02d1), top: B:436:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:140:0x030c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0323  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:172:0x0405  */
    /* JADX WARN: Code duplicated, block: B:174:0x0425  */
    /* JADX WARN: Code duplicated, block: B:180:0x043c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0458  */
    /* JADX WARN: Code duplicated, block: B:185:0x0461  */
    /* JADX WARN: Code duplicated, block: B:189:0x046f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0486  */
    /* JADX WARN: Code duplicated, block: B:201:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:206:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:208:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:209:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:214:0x050e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x0597  */
    /* JADX WARN: Code duplicated, block: B:242:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:248:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:256:0x0622  */
    /* JADX WARN: Code duplicated, block: B:263:0x064a A[Catch: all -> 0x0653, SQLiteException -> 0x0655, TryCatch #3 {SQLiteException -> 0x0655, blocks: (B:258:0x0625, B:259:0x0629, B:261:0x063a, B:263:0x064a, B:268:0x0657, B:271:0x066d, B:270:0x065c, B:275:0x067a), top: B:434:0x0625 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x0678  */
    /* JADX WARN: Code duplicated, block: B:276:0x067c A[PHI: r0 r7 r20 r22
      0x067c: PHI (r0v94 java.util.Map) = (r0v96 java.util.Map), (r0v102 java.util.Map) binds: [B:291:0x06b3, B:275:0x067a] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r7v22 android.database.Cursor) = (r7v23 android.database.Cursor), (r7v24 android.database.Cursor) binds: [B:291:0x06b3, B:275:0x067a] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r20v8 long) = (r20v9 long), (r20v12 long) binds: [B:291:0x06b3, B:275:0x067a] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r22v12 com.google.android.gms.measurement.internal.zzbc) = (r22v13 com.google.android.gms.measurement.internal.zzbc), (r22v15 com.google.android.gms.measurement.internal.zzbc) binds: [B:291:0x06b3, B:275:0x067a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:297:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:301:0x06da  */
    /* JADX WARN: Code duplicated, block: B:307:0x070b  */
    /* JADX WARN: Code duplicated, block: B:309:0x0734 A[LOOP:10: B:305:0x0705->B:309:0x0734, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:313:0x0748  */
    /* JADX WARN: Code duplicated, block: B:317:0x075c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0764  */
    /* JADX WARN: Code duplicated, block: B:323:0x0773  */
    /* JADX WARN: Code duplicated, block: B:325:0x0786  */
    /* JADX WARN: Code duplicated, block: B:329:0x07c0 A[Catch: all -> 0x07f1, SQLiteException -> 0x0801, LOOP:3: B:329:0x07c0->B:351:0x0828, LOOP_START, PHI: r3 r6
      0x07c0: PHI (r3v44 java.lang.String) = (r3v36 java.lang.String), (r3v48 java.lang.String) binds: [B:328:0x07be, B:351:0x0828] A[DONT_GENERATE, DONT_INLINE]
      0x07c0: PHI (r6v35 java.util.Iterator) = (r6v27 java.util.Iterator), (r6v37 java.util.Iterator) binds: [B:328:0x07be, B:351:0x0828] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #8 {all -> 0x07f1, blocks: (B:327:0x07ba, B:329:0x07c0, B:330:0x07c5, B:332:0x07d6, B:335:0x07e8, B:341:0x07fb, B:348:0x081d, B:364:0x0846, B:345:0x0806, B:347:0x0816, B:355:0x0833), top: B:442:0x07ba }] */
    /* JADX WARN: Code duplicated, block: B:334:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:340:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:351:0x0828 A[LOOP:3: B:329:0x07c0->B:351:0x0828, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:354:0x082f  */
    /* JADX WARN: Code duplicated, block: B:356:0x0835 A[PHI: r0 r13 r18 r38
      0x0835: PHI (r0v154 java.util.Map) = (r0v156 java.util.Map), (r0v162 java.util.Map) binds: [B:365:0x0859, B:355:0x0833] A[DONT_GENERATE, DONT_INLINE]
      0x0835: PHI (r13v11 android.database.Cursor) = (r13v12 android.database.Cursor), (r13v13 android.database.Cursor) binds: [B:365:0x0859, B:355:0x0833] A[DONT_GENERATE, DONT_INLINE]
      0x0835: PHI (r18v7 java.lang.String) = (r18v8 java.lang.String), (r18v13 java.lang.String) binds: [B:365:0x0859, B:355:0x0833] A[DONT_GENERATE, DONT_INLINE]
      0x0835: PHI (r38v7 java.util.Iterator) = (r38v8 java.util.Iterator), (r38v11 java.util.Iterator) binds: [B:365:0x0859, B:355:0x0833] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:371:0x0866  */
    /* JADX WARN: Code duplicated, block: B:375:0x0878  */
    /* JADX WARN: Code duplicated, block: B:379:0x089d  */
    /* JADX WARN: Code duplicated, block: B:382:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:384:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:386:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:388:0x08de  */
    /* JADX WARN: Code duplicated, block: B:390:0x090b  */
    /* JADX WARN: Code duplicated, block: B:393:0x0915  */
    /* JADX WARN: Code duplicated, block: B:402:0x095e  */
    /* JADX WARN: Code duplicated, block: B:403:0x0967  */
    /* JADX WARN: Code duplicated, block: B:407:0x0978 A[PHI: r16 r39
      0x0978: PHI (r16v9 java.lang.String) = (r16v10 java.lang.String), (r2v25 java.lang.String) binds: [B:406:0x0976, B:404:0x0968] A[DONT_GENERATE, DONT_INLINE]
      0x0978: PHI (r39v3 java.util.Map) = (r39v4 java.util.Map), (r0v136 java.util.Map) binds: [B:406:0x0976, B:404:0x0968] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:412:0x099d  */
    /* JADX WARN: Code duplicated, block: B:425:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:483:0x0823 A[EDGE_INSN: B:483:0x0823->B:350:0x0823 BREAK  A[LOOP:3: B:329:0x07c0->B:351:0x0828], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x088a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x097d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x094a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x0972 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x09f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0997 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x05d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x05a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x05a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x06fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x06ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0744 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x073e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0570 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x0436 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x0492 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x0480 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0329 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x020d A[EDGE_INSN: B:556:0x020d->B:83:0x020d BREAK  A[LOOP:20: B:70:0x01c1->B:84:0x0212], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x016d  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #7 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:441:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #7 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:441:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0212 A[LOOP:20: B:70:0x01c1->B:84:0x0212, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    @WorkerThread
    public final List zzb(String str, List list, List list2, Long l11, Long l12, boolean z11) throws Throwable {
        int i11;
        int i12;
        boolean z12;
        Map map;
        Cursor cursor;
        boolean z13;
        String str2;
        Cursor cursorQuery;
        Map map2;
        HashSet hashSet;
        HashSet<Integer> hashSet2;
        Map map3;
        com.google.android.gms.internal.measurement.zzii zziiVar;
        BitSet bitSet;
        BitSet bitSet2;
        ArrayMap arrayMap;
        com.google.android.gms.internal.measurement.zzii zziiVar2;
        List list3;
        int i13;
        boolean z14;
        Iterator it;
        com.google.android.gms.internal.measurement.zzik zzikVar;
        Long lValueOf;
        String str3;
        Map arrayMap2;
        SQLiteDatabase sQLiteDatabaseZze;
        ?? r11;
        Cursor cursorRawQuery;
        ArrayMap arrayMap3;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.zzii zziiVar3;
        List list4;
        Map map4;
        HashSet hashSet3;
        Iterator it3;
        Integer numValueOf;
        List arrayList;
        String str4;
        String str5;
        String str6;
        zzz zzzVar;
        ArrayMap arrayMap4;
        Iterator it4;
        com.google.android.gms.internal.measurement.zzhs zzhsVar;
        com.google.android.gms.internal.measurement.zzhs zzhsVarZza;
        zzpf zzpfVar;
        zzbc zzbcVarZzah;
        long j11;
        String strZzd;
        Map map5;
        zzbc zzbcVar;
        long j12;
        String str7;
        String str8;
        int iIntValue;
        Iterator it5;
        boolean zZzd;
        Map map6;
        zzaa zzaaVar;
        zzav zzavVarZzj;
        String str9;
        ArrayMap arrayMap5;
        Cursor cursor2;
        Cursor cursorQuery2;
        Integer numValueOf2;
        List arrayList2;
        String str10;
        String str11;
        ArrayList arrayList3;
        zzav zzavVarZzj2;
        String str12;
        ContentValues contentValues;
        ArrayMap arrayMap6;
        Iterator it6;
        String strZzc;
        Map map7;
        String str13;
        Iterator it7;
        boolean zZzd2;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        zzib zzibVar;
        Integer numValueOf3;
        zzac zzacVar;
        Integer numValueOf4;
        zzav zzavVarZzj3;
        String str14;
        ArrayMap arrayMap7;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf5;
        List list5;
        List arrayList4;
        ArrayMap arrayMap8;
        int i14;
        Cursor cursorQuery4;
        List arrayList5;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l11;
        this.zze = l12;
        Iterator it8 = list.iterator();
        while (true) {
            i11 = 0;
            i12 = 1;
            if (!it8.hasNext()) {
                z12 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it8.next()).zzd())) {
                z12 = true;
                break;
            }
        }
        zzpq.zza();
        zzib zzibVar2 = this.zzu;
        boolean zZzp = zzibVar2.zzc().zzp(this.zza, zzfx.zzaF);
        zzpq.zza();
        boolean zZzp2 = zzibVar2.zzc().zzp(this.zza, zzfx.zzaE);
        if (z12) {
            zzav zzavVarZzj4 = this.zzg.zzj();
            String str15 = this.zza;
            zzavVarZzj4.zzay();
            zzavVarZzj4.zzg();
            Preconditions.checkNotEmpty(str15);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                zzavVarZzj4.zze().update(DbParams.TABLE_EVENTS, contentValues2, "app_id = ?", new String[]{str15});
            } catch (SQLiteException e11) {
                zzavVarZzj4.zzu.zzaV().zzb().zzc("Error resetting session-scoped event counts. appId", zzgt.zzl(str15), e11);
            }
        }
        Map map8 = Collections.EMPTY_MAP;
        String str16 = "data";
        String str17 = "audience_id";
        if (zZzp2 && zZzp) {
            zzav zzavVarZzj5 = this.zzg.zzj();
            String str18 = this.zza;
            Preconditions.checkNotEmpty(str18);
            ArrayMap arrayMap9 = new ArrayMap();
            try {
                cursorQuery4 = zzavVarZzj5.zze().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str18}, null, null, null);
                try {
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpj.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery4.getBlob(i12))).zzbc();
                                    if (zzffVar.zzg()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i11));
                                        List list6 = (List) arrayMap9.get(numValueOf6);
                                        if (list6 == null) {
                                            arrayList5 = new ArrayList();
                                            arrayMap9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list6;
                                        }
                                        arrayList5.add(zzffVar);
                                    }
                                } catch (IOException e12) {
                                    zzavVarZzj5.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgt.zzl(str18), e12);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i11 = 0;
                                i12 = 1;
                            }
                            cursorQuery4.close();
                            map = arrayMap9;
                        } else {
                            cursorQuery4.close();
                            map = map8;
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        zzavVarZzj5.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgt.zzl(str18), e);
                        map8 = Collections.EMPTY_MAP;
                        if (cursorQuery4 != null) {
                        }
                        map = map8;
                        zzav zzavVarZzj6 = this.zzg.zzj();
                        String str19 = this.zza;
                        zzavVarZzj6.zzay();
                        zzavVarZzj6.zzg();
                        Preconditions.checkNotEmpty(str19);
                        cursorQuery = zzavVarZzj6.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str19}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    arrayMap8 = new ArrayMap();
                                    while (true) {
                                        i14 = cursorQuery.getInt(0);
                                        try {
                                            arrayMap8.put(Integer.valueOf(i14), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpj.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                                            z13 = z12;
                                            str2 = str16;
                                        } catch (IOException e14) {
                                            z13 = z12;
                                            str2 = str16;
                                            try {
                                                zzavVarZzj6.zzu.zzaV().zzb().zzd("Failed to merge filter results. appId, audienceId, error", zzgt.zzl(str19), Integer.valueOf(i14), e14);
                                            } catch (SQLiteException e15) {
                                                e = e15;
                                                str17 = str17;
                                                zzavVarZzj6.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgt.zzl(str19), e);
                                                Map map9 = Collections.EMPTY_MAP;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = map9;
                                                if (!map2.isEmpty()) {
                                                    hashSet = new HashSet(map2.keySet());
                                                    if (z13) {
                                                        String str20 = this.zza;
                                                        zzav zzavVarZzj7 = this.zzg.zzj();
                                                        str3 = this.zza;
                                                        zzavVarZzj7.zzay();
                                                        zzavVarZzj7.zzg();
                                                        Preconditions.checkNotEmpty(str3);
                                                        arrayMap2 = new ArrayMap();
                                                        sQLiteDatabaseZze = zzavVarZzj7.zze();
                                                        try {
                                                            try {
                                                                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) arrayMap2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                arrayMap2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        arrayMap2 = Collections.EMPTY_MAP;
                                                                    }
                                                                } catch (SQLiteException e16) {
                                                                    e = e16;
                                                                    zzavVarZzj7.zzu.zzaV().zzb().zzc("Database error querying scoped filters. appId", zzgt.zzl(str3), e);
                                                                    arrayMap2 = Collections.EMPTY_MAP;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    Preconditions.checkNotEmpty(str20);
                                                                    Preconditions.checkNotNull(map2);
                                                                    arrayMap3 = new ArrayMap();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.intValue();
                                                                            zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                            list4 = (List) arrayMap2.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = arrayMap2;
                                                                            hashSet3 = hashSet;
                                                                            it3 = it2;
                                                                            arrayMap3.put(num, zziiVar3);
                                                                            arrayMap2 = map4;
                                                                            hashSet = hashSet3;
                                                                            it2 = it3;
                                                                        }
                                                                    }
                                                                    hashSet2 = hashSet;
                                                                    map3 = arrayMap3;
                                                                    for (Integer num2 : hashSet2) {
                                                                        num2.intValue();
                                                                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num2);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        arrayMap = new ArrayMap();
                                                                        if (zziiVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.zze()) {
                                                                                if (zzhqVar.zza()) {
                                                                                    Map map10 = map3;
                                                                                    Integer numValueOf7 = Integer.valueOf(zzhqVar.zzb());
                                                                                    if (zzhqVar.zzc()) {
                                                                                        lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    arrayMap.put(numValueOf7, lValueOf);
                                                                                    map3 = map10;
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map11 = map3;
                                                                        ArrayMap arrayMap10 = new ArrayMap();
                                                                        if (zziiVar != null) {
                                                                            it = zziiVar.zzg().iterator();
                                                                            while (it.hasNext()) {
                                                                                zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                                if (!zzikVar.zza()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        zziiVar2 = zziiVar;
                                                                        if (zziiVar2 != null) {
                                                                            i13 = 0;
                                                                            while (i13 < zziiVar2.zzb() * 64) {
                                                                                if (zzpj.zzn(zziiVar2.zza(), i13)) {
                                                                                    z14 = zZzp;
                                                                                    this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i13));
                                                                                    bitSet2.set(i13);
                                                                                    if (zzpj.zzn(zziiVar2.zzc(), i13)) {
                                                                                        bitSet.set(i13);
                                                                                    }
                                                                                    i13++;
                                                                                    zZzp = z14;
                                                                                } else {
                                                                                    z14 = zZzp;
                                                                                }
                                                                                arrayMap.remove(Integer.valueOf(i13));
                                                                                i13++;
                                                                                zZzp = z14;
                                                                            }
                                                                        }
                                                                        boolean z15 = zZzp;
                                                                        com.google.android.gms.internal.measurement.zzii zziiVar4 = (com.google.android.gms.internal.measurement.zzii) map2.get(num2);
                                                                        if (!zZzp2) {
                                                                        }
                                                                        this.zzc.put(num2, new zzy(this, this.zza, zziiVar4, bitSet, bitSet2, arrayMap, arrayMap10, null));
                                                                        zZzp = z15;
                                                                        map3 = map11;
                                                                    }
                                                                    str4 = str2;
                                                                    str5 = str17;
                                                                    str6 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        zzzVar = new zzz(this, null);
                                                                        arrayMap4 = new ArrayMap();
                                                                        it4 = list.iterator();
                                                                        while (it4.hasNext()) {
                                                                            zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                                                            zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                                            if (zzhsVarZza != null) {
                                                                                zzpfVar = this.zzg;
                                                                                zzbcVarZzah = zzpfVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                                                                                zzpfVar.zzj().zzh(zzbcVarZzah);
                                                                                if (!z11) {
                                                                                    j11 = zzbcVarZzah.zzc;
                                                                                    strZzd = zzhsVarZza.zzd();
                                                                                    map5 = (Map) arrayMap4.get(strZzd);
                                                                                    if (map5 == null) {
                                                                                        zzavVarZzj = zzpfVar.zzj();
                                                                                        str9 = this.zza;
                                                                                        zzavVarZzj.zzay();
                                                                                        zzavVarZzj.zzg();
                                                                                        Preconditions.checkNotEmpty(str9);
                                                                                        Preconditions.checkNotEmpty(strZzd);
                                                                                        arrayMap5 = new ArrayMap();
                                                                                        str7 = str4;
                                                                                        str8 = str5;
                                                                                        try {
                                                                                            try {
                                                                                                zzbcVar = zzbcVarZzah;
                                                                                                try {
                                                                                                    cursorQuery2 = zzavVarZzj.zze().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                                j12 = j11;
                                                                                                                do {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            com.google.android.gms.internal.measurement.zzff zzffVar2 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpj.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                                                                                                            numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                            arrayList2 = (List) arrayMap5.get(numValueOf2);
                                                                                                                            if (arrayList2 == null) {
                                                                                                                                arrayList2 = new ArrayList();
                                                                                                                                arrayMap5.put(numValueOf2, arrayList2);
                                                                                                                            }
                                                                                                                            arrayList2.add(zzffVar2);
                                                                                                                        } catch (IOException e17) {
                                                                                                                            zzavVarZzj.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgt.zzl(str9), e17);
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e18) {
                                                                                                                        e = e18;
                                                                                                                        zzavVarZzj.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgt.zzl(str9), e);
                                                                                                                        map5 = Collections.EMPTY_MAP;
                                                                                                                        if (cursorQuery2 != null) {
                                                                                                                            cursorQuery2.close();
                                                                                                                        }
                                                                                                                    }
                                                                                                                } while (cursorQuery2.moveToNext());
                                                                                                                cursorQuery2.close();
                                                                                                                map5 = arrayMap5;
                                                                                                            } else {
                                                                                                                j12 = j11;
                                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                                cursorQuery2.close();
                                                                                                            }
                                                                                                        } catch (SQLiteException e19) {
                                                                                                            e = e19;
                                                                                                            j12 = j11;
                                                                                                        }
                                                                                                    } catch (Throwable th2) {
                                                                                                        th = th2;
                                                                                                        cursor2 = cursorQuery2;
                                                                                                        if (cursor2 != null) {
                                                                                                            cursor2.close();
                                                                                                        }
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (SQLiteException e21) {
                                                                                                    e = e21;
                                                                                                    j12 = j11;
                                                                                                    cursorQuery2 = null;
                                                                                                    zzavVarZzj.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgt.zzl(str9), e);
                                                                                                    map5 = Collections.EMPTY_MAP;
                                                                                                    if (cursorQuery2 != null) {
                                                                                                        cursorQuery2.close();
                                                                                                    }
                                                                                                    arrayMap4.put(strZzd, map5);
                                                                                                    for (Integer num3 : map5.keySet()) {
                                                                                                        iIntValue = num3.intValue();
                                                                                                        if (this.zzb.contains(num3)) {
                                                                                                            this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                                                                                                        } else {
                                                                                                            it5 = ((List) map5.get(num3)).iterator();
                                                                                                            zZzd = true;
                                                                                                            while (true) {
                                                                                                                if (!it5.hasNext()) {
                                                                                                                    map6 = map5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar3);
                                                                                                                map6 = map5;
                                                                                                                zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbcVar, zzd(iIntValue, zzffVar3.zzb()));
                                                                                                                if (!zZzd) {
                                                                                                                    this.zzb.add(num3);
                                                                                                                    break;
                                                                                                                }
                                                                                                                zzc(num3).zza(zzaaVar);
                                                                                                                map5 = map6;
                                                                                                            }
                                                                                                            if (!zZzd) {
                                                                                                                this.zzb.add(num3);
                                                                                                            }
                                                                                                            map5 = map6;
                                                                                                        }
                                                                                                    }
                                                                                                    str4 = str7;
                                                                                                    str5 = str8;
                                                                                                    zzzVar = zzzVar;
                                                                                                    it4 = it4;
                                                                                                }
                                                                                            } catch (Throwable th3) {
                                                                                                th = th3;
                                                                                                cursor2 = null;
                                                                                            }
                                                                                        } catch (SQLiteException e22) {
                                                                                            e = e22;
                                                                                            zzbcVar = zzbcVarZzah;
                                                                                        }
                                                                                        arrayMap4.put(strZzd, map5);
                                                                                    } else {
                                                                                        zzbcVar = zzbcVarZzah;
                                                                                        j12 = j11;
                                                                                        str7 = str4;
                                                                                        str8 = str5;
                                                                                    }
                                                                                    while (r6.hasNext()) {
                                                                                        iIntValue = num3.intValue();
                                                                                        if (this.zzb.contains(num3)) {
                                                                                            this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                                                                                        } else {
                                                                                            it5 = ((List) map5.get(num3)).iterator();
                                                                                            zZzd = true;
                                                                                            while (true) {
                                                                                                if (!it5.hasNext()) {
                                                                                                    map6 = map5;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar4);
                                                                                                map6 = map5;
                                                                                                zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbcVar, zzd(iIntValue, zzffVar4.zzb()));
                                                                                                if (!zZzd) {
                                                                                                    this.zzb.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                zzc(num3).zza(zzaaVar);
                                                                                                map5 = map6;
                                                                                            }
                                                                                            if (!zZzd) {
                                                                                                this.zzb.add(num3);
                                                                                            }
                                                                                            map5 = map6;
                                                                                        }
                                                                                    }
                                                                                    str4 = str7;
                                                                                    str5 = str8;
                                                                                    zzzVar = zzzVar;
                                                                                    it4 = it4;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    str10 = str4;
                                                                    str11 = str5;
                                                                    if (!z11) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        arrayMap6 = new ArrayMap();
                                                                        it6 = list2.iterator();
                                                                        while (it6.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it6.next();
                                                                            strZzc = zziuVar.zzc();
                                                                            map7 = (Map) arrayMap6.get(strZzc);
                                                                            if (map7 == null) {
                                                                                zzavVarZzj3 = this.zzg.zzj();
                                                                                str14 = this.zza;
                                                                                zzavVarZzj3.zzay();
                                                                                zzavVarZzj3.zzg();
                                                                                Preconditions.checkNotEmpty(str14);
                                                                                Preconditions.checkNotEmpty(strZzc);
                                                                                arrayMap7 = new ArrayMap();
                                                                                try {
                                                                                    cursorQuery3 = zzavVarZzj3.zze().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpj.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                                                                                        numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                        list5 = (List) arrayMap7.get(numValueOf5);
                                                                                                        if (list5 == null) {
                                                                                                            str13 = str10;
                                                                                                            try {
                                                                                                                arrayList4 = new ArrayList();
                                                                                                                arrayMap7.put(numValueOf5, arrayList4);
                                                                                                            } catch (SQLiteException e23) {
                                                                                                                e = e23;
                                                                                                                it6 = it6;
                                                                                                                zzavVarZzj3.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgt.zzl(str14), e);
                                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery3 != null) {
                                                                                                                    cursorQuery3.close();
                                                                                                                }
                                                                                                                arrayMap6.put(strZzc, map7);
                                                                                                                for (Integer num4 : map7.keySet()) {
                                                                                                                    int iIntValue2 = num4.intValue();
                                                                                                                    if (this.zzb.contains(num4)) {
                                                                                                                        this.zzu.zzaV().zzk().zzb(str6, num4);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    it7 = ((List) map7.get(num4)).iterator();
                                                                                                                    zZzd2 = true;
                                                                                                                    while (true) {
                                                                                                                        if (it7.hasNext()) {
                                                                                                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it7.next();
                                                                                                                            zzibVar = this.zzu;
                                                                                                                            if (Log.isLoggable(zzibVar.zzaV().zzn(), 2)) {
                                                                                                                                zzgr zzgrVarZzk = zzibVar.zzaV().zzk();
                                                                                                                                if (zzfnVar.zza()) {
                                                                                                                                    numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                                } else {
                                                                                                                                    numValueOf4 = null;
                                                                                                                                }
                                                                                                                                zzgrVarZzk.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, zzibVar.zzl().zzc(zzfnVar.zzc()));
                                                                                                                                zzibVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                                                            }
                                                                                                                            if (zzfnVar.zza()) {
                                                                                                                            }
                                                                                                                            zzgr zzgrVarZze = zzibVar.zzaV().zze();
                                                                                                                            Object objZzl = zzgt.zzl(this.zza);
                                                                                                                            if (zzfnVar.zza()) {
                                                                                                                                numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                            } else {
                                                                                                                                numValueOf3 = null;
                                                                                                                            }
                                                                                                                            zzgrVarZze.zzc("Invalid property filter ID. appId, id", objZzl, String.valueOf(numValueOf3));
                                                                                                                            this.zzb.add(num4);
                                                                                                                            map7 = map7;
                                                                                                                            str6 = str6;
                                                                                                                        } else {
                                                                                                                            map7 = map7;
                                                                                                                            str6 = str6;
                                                                                                                        }
                                                                                                                        if (!zZzd2) {
                                                                                                                            this.zzb.add(num4);
                                                                                                                        }
                                                                                                                        map7 = map7;
                                                                                                                        str6 = str6;
                                                                                                                        zzc(num4).zza(zzacVar);
                                                                                                                        map7 = map7;
                                                                                                                        str6 = str6;
                                                                                                                    }
                                                                                                                }
                                                                                                                it6 = it6;
                                                                                                                str10 = str13;
                                                                                                            }
                                                                                                        } else {
                                                                                                            str13 = str10;
                                                                                                            arrayList4 = list5;
                                                                                                        }
                                                                                                        arrayList4.add(zzfnVar2);
                                                                                                    } catch (IOException e24) {
                                                                                                        str13 = str10;
                                                                                                        zzavVarZzj3.zzu.zzaV().zzb().zzc("Failed to merge filter", zzgt.zzl(str14), e24);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery3.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it6 = it6;
                                                                                                        str10 = str13;
                                                                                                    } catch (SQLiteException e25) {
                                                                                                        e = e25;
                                                                                                        zzavVarZzj3.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgt.zzl(str14), e);
                                                                                                        map7 = Collections.EMPTY_MAP;
                                                                                                        if (cursorQuery3 != null) {
                                                                                                            cursorQuery3.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery3.close();
                                                                                                map7 = arrayMap7;
                                                                                            } else {
                                                                                                str13 = str10;
                                                                                                it6 = it6;
                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                cursorQuery3.close();
                                                                                            }
                                                                                        } catch (Throwable th4) {
                                                                                            th = th4;
                                                                                            cursor3 = cursorQuery3;
                                                                                            if (cursor3 != null) {
                                                                                                cursor3.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteException e26) {
                                                                                        e = e26;
                                                                                        str13 = str10;
                                                                                    }
                                                                                } catch (SQLiteException e27) {
                                                                                    e = e27;
                                                                                    str13 = str10;
                                                                                    it6 = it6;
                                                                                    cursorQuery3 = null;
                                                                                } catch (Throwable th5) {
                                                                                    th = th5;
                                                                                    cursor3 = null;
                                                                                }
                                                                                arrayMap6.put(strZzc, map7);
                                                                            } else {
                                                                                str13 = str10;
                                                                                it6 = it6;
                                                                            }
                                                                            while (r3.hasNext()) {
                                                                                int iIntValue3 = num4.intValue();
                                                                                if (this.zzb.contains(num4)) {
                                                                                    this.zzu.zzaV().zzk().zzb(str6, num4);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map7.get(num4)).iterator();
                                                                                zZzd2 = true;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it7.next();
                                                                                        zzibVar = this.zzu;
                                                                                        if (Log.isLoggable(zzibVar.zzaV().zzn(), 2)) {
                                                                                            zzgr zzgrVarZzk2 = zzibVar.zzaV().zzk();
                                                                                            if (zzfnVar.zza()) {
                                                                                                numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            zzgrVarZzk2.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, zzibVar.zzl().zzc(zzfnVar.zzc()));
                                                                                            zzibVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                        }
                                                                                        if (zzfnVar.zza()) {
                                                                                        }
                                                                                        zzgr zzgrVarZze2 = zzibVar.zzaV().zze();
                                                                                        Object objZzl2 = zzgt.zzl(this.zza);
                                                                                        if (zzfnVar.zza()) {
                                                                                            numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        zzgrVarZze2.zzc("Invalid property filter ID. appId, id", objZzl2, String.valueOf(numValueOf3));
                                                                                        this.zzb.add(num4);
                                                                                        map7 = map7;
                                                                                        str6 = str6;
                                                                                    } else {
                                                                                        map7 = map7;
                                                                                        str6 = str6;
                                                                                    }
                                                                                    if (!zZzd2) {
                                                                                        this.zzb.add(num4);
                                                                                    }
                                                                                    map7 = map7;
                                                                                    str6 = str6;
                                                                                    zzc(num4).zza(zzacVar);
                                                                                    map7 = map7;
                                                                                    str6 = str6;
                                                                                }
                                                                            }
                                                                            it6 = it6;
                                                                            str10 = str13;
                                                                        }
                                                                    }
                                                                    arrayList3 = new ArrayList();
                                                                    Set<Integer> setKeySet = this.zzc.keySet();
                                                                    setKeySet.removeAll(this.zzb);
                                                                    for (Integer num5 : setKeySet) {
                                                                        int iIntValue4 = num5.intValue();
                                                                        zzy zzyVar = (zzy) this.zzc.get(num5);
                                                                        Preconditions.checkNotNull(zzyVar);
                                                                        com.google.android.gms.internal.measurement.zzhg zzhgVarZzb = zzyVar.zzb(iIntValue4);
                                                                        arrayList3.add(zzhgVarZzb);
                                                                        zzavVarZzj2 = this.zzg.zzj();
                                                                        str12 = this.zza;
                                                                        com.google.android.gms.internal.measurement.zzii zziiVarZzc = zzhgVarZzb.zzc();
                                                                        zzavVarZzj2.zzay();
                                                                        zzavVarZzj2.zzg();
                                                                        Preconditions.checkNotEmpty(str12);
                                                                        Preconditions.checkNotNull(zziiVarZzc);
                                                                        byte[] bArrZzcc = zziiVarZzc.zzcc();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str12);
                                                                        contentValues.put(str11, num5);
                                                                        contentValues.put("current_results", bArrZzcc);
                                                                        try {
                                                                            try {
                                                                                if (zzavVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    zzavVarZzj2.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgt.zzl(str12));
                                                                                }
                                                                            } catch (SQLiteException e28) {
                                                                                e = e28;
                                                                                zzavVarZzj2.zzu.zzaV().zzb().zzc("Error storing filter results. appId", zzgt.zzl(str12), e);
                                                                            }
                                                                        } catch (SQLiteException e29) {
                                                                            e = e29;
                                                                        }
                                                                    }
                                                                    return arrayList3;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                r11 = sQLiteDatabaseZze;
                                                                if (r11 != 0) {
                                                                    r11.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e31) {
                                                            e = e31;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            r11 = 0;
                                                            if (r11 != 0) {
                                                                r11.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        Preconditions.checkNotEmpty(str20);
                                                        Preconditions.checkNotNull(map2);
                                                        arrayMap3 = new ArrayMap();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.intValue();
                                                                zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                list4 = (List) arrayMap2.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                map4 = arrayMap2;
                                                                hashSet3 = hashSet;
                                                                it3 = it2;
                                                                arrayMap3.put(num, zziiVar3);
                                                                arrayMap2 = map4;
                                                                hashSet = hashSet3;
                                                                it2 = it3;
                                                            }
                                                        }
                                                        hashSet2 = hashSet;
                                                        map3 = arrayMap3;
                                                    } else {
                                                        hashSet2 = hashSet;
                                                        map3 = map2;
                                                    }
                                                    while (r16.hasNext()) {
                                                        num2.intValue();
                                                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num2);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        arrayMap = new ArrayMap();
                                                        if (zziiVar != null) {
                                                            while (r7.hasNext()) {
                                                                if (zzhqVar.zza()) {
                                                                    Map map12 = map3;
                                                                    Integer numValueOf8 = Integer.valueOf(zzhqVar.zzb());
                                                                    if (zzhqVar.zzc()) {
                                                                        lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    arrayMap.put(numValueOf8, lValueOf);
                                                                    map3 = map12;
                                                                }
                                                            }
                                                        }
                                                        Map map13 = map3;
                                                        ArrayMap arrayMap11 = new ArrayMap();
                                                        if (zziiVar != null) {
                                                            it = zziiVar.zzg().iterator();
                                                            while (it.hasNext()) {
                                                                zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                if (!zzikVar.zza()) {
                                                                }
                                                            }
                                                        }
                                                        zziiVar2 = zziiVar;
                                                        if (zziiVar2 != null) {
                                                            i13 = 0;
                                                            while (i13 < zziiVar2.zzb() * 64) {
                                                                if (zzpj.zzn(zziiVar2.zza(), i13)) {
                                                                    z14 = zZzp;
                                                                    this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i13));
                                                                    bitSet2.set(i13);
                                                                    if (zzpj.zzn(zziiVar2.zzc(), i13)) {
                                                                        bitSet.set(i13);
                                                                    }
                                                                    i13++;
                                                                    zZzp = z14;
                                                                } else {
                                                                    z14 = zZzp;
                                                                }
                                                                arrayMap.remove(Integer.valueOf(i13));
                                                                i13++;
                                                                zZzp = z14;
                                                            }
                                                        }
                                                        boolean z16 = zZzp;
                                                        com.google.android.gms.internal.measurement.zzii zziiVar5 = (com.google.android.gms.internal.measurement.zzii) map2.get(num2);
                                                        if (!zZzp2) {
                                                        }
                                                        this.zzc.put(num2, new zzy(this, this.zza, zziiVar5, bitSet, bitSet2, arrayMap, arrayMap11, null));
                                                        zZzp = z16;
                                                        map3 = map13;
                                                    }
                                                }
                                                str4 = str2;
                                                str5 = str17;
                                                str6 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    zzzVar = new zzz(this, null);
                                                    arrayMap4 = new ArrayMap();
                                                    it4 = list.iterator();
                                                    while (it4.hasNext()) {
                                                        zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                                        zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                        if (zzhsVarZza != null) {
                                                            zzpfVar = this.zzg;
                                                            zzbcVarZzah = zzpfVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                                                            zzpfVar.zzj().zzh(zzbcVarZzah);
                                                            if (!z11) {
                                                                j11 = zzbcVarZzah.zzc;
                                                                strZzd = zzhsVarZza.zzd();
                                                                map5 = (Map) arrayMap4.get(strZzd);
                                                                if (map5 == null) {
                                                                    zzavVarZzj = zzpfVar.zzj();
                                                                    str9 = this.zza;
                                                                    zzavVarZzj.zzay();
                                                                    zzavVarZzj.zzg();
                                                                    Preconditions.checkNotEmpty(str9);
                                                                    Preconditions.checkNotEmpty(strZzd);
                                                                    arrayMap5 = new ArrayMap();
                                                                    str7 = str4;
                                                                    str8 = str5;
                                                                    zzbcVar = zzbcVarZzah;
                                                                    cursorQuery2 = zzavVarZzj.zze().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                                                    if (cursorQuery2.moveToFirst()) {
                                                                        j12 = j11;
                                                                        do {
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar5 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpj.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                                                            numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                            arrayList2 = (List) arrayMap5.get(numValueOf2);
                                                                            if (arrayList2 == null) {
                                                                                arrayList2 = new ArrayList();
                                                                                arrayMap5.put(numValueOf2, arrayList2);
                                                                            }
                                                                            arrayList2.add(zzffVar5);
                                                                        } while (cursorQuery2.moveToNext());
                                                                        cursorQuery2.close();
                                                                        map5 = arrayMap5;
                                                                    } else {
                                                                        j12 = j11;
                                                                        map5 = Collections.EMPTY_MAP;
                                                                        cursorQuery2.close();
                                                                    }
                                                                    arrayMap4.put(strZzd, map5);
                                                                } else {
                                                                    zzbcVar = zzbcVarZzah;
                                                                    j12 = j11;
                                                                    str7 = str4;
                                                                    str8 = str5;
                                                                }
                                                                while (r6.hasNext()) {
                                                                    iIntValue = num3.intValue();
                                                                    if (this.zzb.contains(num3)) {
                                                                        this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                                                                    } else {
                                                                        it5 = ((List) map5.get(num3)).iterator();
                                                                        zZzd = true;
                                                                        while (true) {
                                                                            if (!it5.hasNext()) {
                                                                                map6 = map5;
                                                                                break;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar6 = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                                                            zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar6);
                                                                            map6 = map5;
                                                                            zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbcVar, zzd(iIntValue, zzffVar6.zzb()));
                                                                            if (!zZzd) {
                                                                                this.zzb.add(num3);
                                                                                break;
                                                                            }
                                                                            zzc(num3).zza(zzaaVar);
                                                                            map5 = map6;
                                                                        }
                                                                        if (!zZzd) {
                                                                            this.zzb.add(num3);
                                                                        }
                                                                        map5 = map6;
                                                                    }
                                                                }
                                                                str4 = str7;
                                                                str5 = str8;
                                                                zzzVar = zzzVar;
                                                                it4 = it4;
                                                            }
                                                        }
                                                    }
                                                }
                                                str10 = str4;
                                                str11 = str5;
                                                if (!z11) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    arrayMap6 = new ArrayMap();
                                                    it6 = list2.iterator();
                                                    while (it6.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it6.next();
                                                        strZzc = zziuVar2.zzc();
                                                        map7 = (Map) arrayMap6.get(strZzc);
                                                        if (map7 == null) {
                                                            zzavVarZzj3 = this.zzg.zzj();
                                                            str14 = this.zza;
                                                            zzavVarZzj3.zzay();
                                                            zzavVarZzj3.zzg();
                                                            Preconditions.checkNotEmpty(str14);
                                                            Preconditions.checkNotEmpty(strZzc);
                                                            arrayMap7 = new ArrayMap();
                                                            cursorQuery3 = zzavVarZzj3.zze().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                                                            if (cursorQuery3.moveToFirst()) {
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.zzfn zzfnVar3 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpj.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                    list5 = (List) arrayMap7.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        str13 = str10;
                                                                        arrayList4 = new ArrayList();
                                                                        arrayMap7.put(numValueOf5, arrayList4);
                                                                    } else {
                                                                        str13 = str10;
                                                                        arrayList4 = list5;
                                                                    }
                                                                    arrayList4.add(zzfnVar3);
                                                                    if (!cursorQuery3.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it6 = it6;
                                                                    str10 = str13;
                                                                }
                                                                cursorQuery3.close();
                                                                map7 = arrayMap7;
                                                            } else {
                                                                str13 = str10;
                                                                it6 = it6;
                                                                map7 = Collections.EMPTY_MAP;
                                                                cursorQuery3.close();
                                                            }
                                                            arrayMap6.put(strZzc, map7);
                                                        } else {
                                                            str13 = str10;
                                                            it6 = it6;
                                                        }
                                                        while (r3.hasNext()) {
                                                            int iIntValue5 = num4.intValue();
                                                            if (this.zzb.contains(num4)) {
                                                                this.zzu.zzaV().zzk().zzb(str6, num4);
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map7.get(num4)).iterator();
                                                            zZzd2 = true;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it7.next();
                                                                    zzibVar = this.zzu;
                                                                    if (Log.isLoggable(zzibVar.zzaV().zzn(), 2)) {
                                                                        zzgr zzgrVarZzk3 = zzibVar.zzaV().zzk();
                                                                        if (zzfnVar.zza()) {
                                                                            numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        zzgrVarZzk3.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, zzibVar.zzl().zzc(zzfnVar.zzc()));
                                                                        zzibVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                    }
                                                                    if (zzfnVar.zza()) {
                                                                    }
                                                                    zzgr zzgrVarZze3 = zzibVar.zzaV().zze();
                                                                    Object objZzl3 = zzgt.zzl(this.zza);
                                                                    if (zzfnVar.zza()) {
                                                                        numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    zzgrVarZze3.zzc("Invalid property filter ID. appId, id", objZzl3, String.valueOf(numValueOf3));
                                                                    this.zzb.add(num4);
                                                                    map7 = map7;
                                                                    str6 = str6;
                                                                } else {
                                                                    map7 = map7;
                                                                    str6 = str6;
                                                                }
                                                                if (!zZzd2) {
                                                                    this.zzb.add(num4);
                                                                }
                                                                map7 = map7;
                                                                str6 = str6;
                                                                zzc(num4).zza(zzacVar);
                                                                map7 = map7;
                                                                str6 = str6;
                                                            }
                                                        }
                                                        it6 = it6;
                                                        str10 = str13;
                                                    }
                                                }
                                                arrayList3 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.zzc.keySet();
                                                setKeySet2.removeAll(this.zzb);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num5.intValue();
                                                    zzy zzyVar2 = (zzy) this.zzc.get(num5);
                                                    Preconditions.checkNotNull(zzyVar2);
                                                    com.google.android.gms.internal.measurement.zzhg zzhgVarZzb2 = zzyVar2.zzb(iIntValue6);
                                                    arrayList3.add(zzhgVarZzb2);
                                                    zzavVarZzj2 = this.zzg.zzj();
                                                    str12 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzii zziiVarZzc2 = zzhgVarZzb2.zzc();
                                                    zzavVarZzj2.zzay();
                                                    zzavVarZzj2.zzg();
                                                    Preconditions.checkNotEmpty(str12);
                                                    Preconditions.checkNotNull(zziiVarZzc2);
                                                    byte[] bArrZzcc2 = zziiVarZzc2.zzcc();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str12);
                                                    contentValues.put(str11, num5);
                                                    contentValues.put("current_results", bArrZzcc2);
                                                    if (zzavVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        zzavVarZzj2.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgt.zzl(str12));
                                                    }
                                                }
                                                return arrayList3;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            z12 = z13;
                                            str16 = str2;
                                            str17 = str17;
                                        } catch (SQLiteException e32) {
                                            e = e32;
                                            zzavVarZzj6.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgt.zzl(str19), e);
                                            Map map14 = Collections.EMPTY_MAP;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = map14;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = arrayMap8;
                                } else {
                                    Map map15 = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    map2 = map15;
                                    z13 = z12;
                                    str2 = "data";
                                    str17 = "audience_id";
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e33) {
                            e = e33;
                            z13 = z12;
                            str2 = "data";
                        }
                        if (!map2.isEmpty()) {
                            hashSet = new HashSet(map2.keySet());
                            if (z13) {
                                String str21 = this.zza;
                                zzav zzavVarZzj8 = this.zzg.zzj();
                                str3 = this.zza;
                                zzavVarZzj8.zzay();
                                zzavVarZzj8.zzg();
                                Preconditions.checkNotEmpty(str3);
                                arrayMap2 = new ArrayMap();
                                sQLiteDatabaseZze = zzavVarZzj8.zze();
                                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) arrayMap2.get(numValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            arrayMap2.put(numValueOf, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    arrayMap2 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                Preconditions.checkNotEmpty(str21);
                                Preconditions.checkNotNull(map2);
                                arrayMap3 = new ArrayMap();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.intValue();
                                        zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                        list4 = (List) arrayMap2.get(num);
                                        if (list4 != null) {
                                        }
                                        map4 = arrayMap2;
                                        hashSet3 = hashSet;
                                        it3 = it2;
                                        arrayMap3.put(num, zziiVar3);
                                        arrayMap2 = map4;
                                        hashSet = hashSet3;
                                        it2 = it3;
                                    }
                                }
                                hashSet2 = hashSet;
                                map3 = arrayMap3;
                            } else {
                                hashSet2 = hashSet;
                                map3 = map2;
                            }
                            while (r16.hasNext()) {
                                num2.intValue();
                                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num2);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                arrayMap = new ArrayMap();
                                if (zziiVar != null) {
                                    while (r7.hasNext()) {
                                        if (zzhqVar.zza()) {
                                            Map map16 = map3;
                                            Integer numValueOf9 = Integer.valueOf(zzhqVar.zzb());
                                            if (zzhqVar.zzc()) {
                                                lValueOf = Long.valueOf(zzhqVar.zzd());
                                            } else {
                                                lValueOf = null;
                                            }
                                            arrayMap.put(numValueOf9, lValueOf);
                                            map3 = map16;
                                        }
                                    }
                                }
                                Map map17 = map3;
                                ArrayMap arrayMap12 = new ArrayMap();
                                if (zziiVar != null) {
                                    it = zziiVar.zzg().iterator();
                                    while (it.hasNext()) {
                                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                        if (!zzikVar.zza()) {
                                        }
                                    }
                                }
                                zziiVar2 = zziiVar;
                                if (zziiVar2 != null) {
                                    i13 = 0;
                                    while (i13 < zziiVar2.zzb() * 64) {
                                        if (zzpj.zzn(zziiVar2.zza(), i13)) {
                                            z14 = zZzp;
                                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i13));
                                            bitSet2.set(i13);
                                            if (zzpj.zzn(zziiVar2.zzc(), i13)) {
                                                bitSet.set(i13);
                                            }
                                            i13++;
                                            zZzp = z14;
                                        } else {
                                            z14 = zZzp;
                                        }
                                        arrayMap.remove(Integer.valueOf(i13));
                                        i13++;
                                        zZzp = z14;
                                    }
                                }
                                boolean z17 = zZzp;
                                com.google.android.gms.internal.measurement.zzii zziiVar6 = (com.google.android.gms.internal.measurement.zzii) map2.get(num2);
                                if (!zZzp2) {
                                }
                                this.zzc.put(num2, new zzy(this, this.zza, zziiVar6, bitSet, bitSet2, arrayMap, arrayMap12, null));
                                zZzp = z17;
                                map3 = map17;
                            }
                        }
                        str4 = str2;
                        str5 = str17;
                        str6 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            zzzVar = new zzz(this, null);
                            arrayMap4 = new ArrayMap();
                            it4 = list.iterator();
                            while (it4.hasNext()) {
                                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                if (zzhsVarZza != null) {
                                    zzpfVar = this.zzg;
                                    zzbcVarZzah = zzpfVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                                    zzpfVar.zzj().zzh(zzbcVarZzah);
                                    if (!z11) {
                                        j11 = zzbcVarZzah.zzc;
                                        strZzd = zzhsVarZza.zzd();
                                        map5 = (Map) arrayMap4.get(strZzd);
                                        if (map5 == null) {
                                            zzavVarZzj = zzpfVar.zzj();
                                            str9 = this.zza;
                                            zzavVarZzj.zzay();
                                            zzavVarZzj.zzg();
                                            Preconditions.checkNotEmpty(str9);
                                            Preconditions.checkNotEmpty(strZzd);
                                            arrayMap5 = new ArrayMap();
                                            str7 = str4;
                                            str8 = str5;
                                            zzbcVar = zzbcVarZzah;
                                            cursorQuery2 = zzavVarZzj.zze().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                j12 = j11;
                                                do {
                                                    com.google.android.gms.internal.measurement.zzff zzffVar7 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpj.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                                    numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    arrayList2 = (List) arrayMap5.get(numValueOf2);
                                                    if (arrayList2 == null) {
                                                        arrayList2 = new ArrayList();
                                                        arrayMap5.put(numValueOf2, arrayList2);
                                                    }
                                                    arrayList2.add(zzffVar7);
                                                } while (cursorQuery2.moveToNext());
                                                cursorQuery2.close();
                                                map5 = arrayMap5;
                                            } else {
                                                j12 = j11;
                                                map5 = Collections.EMPTY_MAP;
                                                cursorQuery2.close();
                                            }
                                            arrayMap4.put(strZzd, map5);
                                        } else {
                                            zzbcVar = zzbcVarZzah;
                                            j12 = j11;
                                            str7 = str4;
                                            str8 = str5;
                                        }
                                        while (r6.hasNext()) {
                                            iIntValue = num3.intValue();
                                            if (this.zzb.contains(num3)) {
                                                this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                                            } else {
                                                it5 = ((List) map5.get(num3)).iterator();
                                                zZzd = true;
                                                while (true) {
                                                    if (!it5.hasNext()) {
                                                        map6 = map5;
                                                        break;
                                                    }
                                                    com.google.android.gms.internal.measurement.zzff zzffVar8 = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                                    zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar8);
                                                    map6 = map5;
                                                    zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbcVar, zzd(iIntValue, zzffVar8.zzb()));
                                                    if (!zZzd) {
                                                        this.zzb.add(num3);
                                                        break;
                                                    }
                                                    zzc(num3).zza(zzaaVar);
                                                    map5 = map6;
                                                }
                                                if (!zZzd) {
                                                    this.zzb.add(num3);
                                                }
                                                map5 = map6;
                                            }
                                        }
                                        str4 = str7;
                                        str5 = str8;
                                        zzzVar = zzzVar;
                                        it4 = it4;
                                    }
                                }
                            }
                        }
                        str10 = str4;
                        str11 = str5;
                        if (!z11) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            arrayMap6 = new ArrayMap();
                            it6 = list2.iterator();
                            while (it6.hasNext()) {
                                com.google.android.gms.internal.measurement.zziu zziuVar3 = (com.google.android.gms.internal.measurement.zziu) it6.next();
                                strZzc = zziuVar3.zzc();
                                map7 = (Map) arrayMap6.get(strZzc);
                                if (map7 == null) {
                                    zzavVarZzj3 = this.zzg.zzj();
                                    str14 = this.zza;
                                    zzavVarZzj3.zzay();
                                    zzavVarZzj3.zzg();
                                    Preconditions.checkNotEmpty(str14);
                                    Preconditions.checkNotEmpty(strZzc);
                                    arrayMap7 = new ArrayMap();
                                    cursorQuery3 = zzavVarZzj3.zze().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                                    if (cursorQuery3.moveToFirst()) {
                                        while (true) {
                                            com.google.android.gms.internal.measurement.zzfn zzfnVar4 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpj.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                            list5 = (List) arrayMap7.get(numValueOf5);
                                            if (list5 == null) {
                                                str13 = str10;
                                                arrayList4 = new ArrayList();
                                                arrayMap7.put(numValueOf5, arrayList4);
                                            } else {
                                                str13 = str10;
                                                arrayList4 = list5;
                                            }
                                            arrayList4.add(zzfnVar4);
                                            if (!cursorQuery3.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it6 = it6;
                                            str10 = str13;
                                        }
                                        cursorQuery3.close();
                                        map7 = arrayMap7;
                                    } else {
                                        str13 = str10;
                                        it6 = it6;
                                        map7 = Collections.EMPTY_MAP;
                                        cursorQuery3.close();
                                    }
                                    arrayMap6.put(strZzc, map7);
                                } else {
                                    str13 = str10;
                                    it6 = it6;
                                }
                                while (r3.hasNext()) {
                                    int iIntValue7 = num4.intValue();
                                    if (this.zzb.contains(num4)) {
                                        this.zzu.zzaV().zzk().zzb(str6, num4);
                                        break;
                                        break;
                                    }
                                    it7 = ((List) map7.get(num4)).iterator();
                                    zZzd2 = true;
                                    while (true) {
                                        if (it7.hasNext()) {
                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it7.next();
                                            zzibVar = this.zzu;
                                            if (Log.isLoggable(zzibVar.zzaV().zzn(), 2)) {
                                                zzgr zzgrVarZzk4 = zzibVar.zzaV().zzk();
                                                if (zzfnVar.zza()) {
                                                    numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                zzgrVarZzk4.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, zzibVar.zzl().zzc(zzfnVar.zzc()));
                                                zzibVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                            }
                                            if (zzfnVar.zza()) {
                                            }
                                            zzgr zzgrVarZze4 = zzibVar.zzaV().zze();
                                            Object objZzl4 = zzgt.zzl(this.zza);
                                            if (zzfnVar.zza()) {
                                                numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                            } else {
                                                numValueOf3 = null;
                                            }
                                            zzgrVarZze4.zzc("Invalid property filter ID. appId, id", objZzl4, String.valueOf(numValueOf3));
                                            this.zzb.add(num4);
                                            map7 = map7;
                                            str6 = str6;
                                        } else {
                                            map7 = map7;
                                            str6 = str6;
                                        }
                                        if (!zZzd2) {
                                            this.zzb.add(num4);
                                        }
                                        map7 = map7;
                                        str6 = str6;
                                        zzc(num4).zza(zzacVar);
                                        map7 = map7;
                                        str6 = str6;
                                    }
                                }
                                it6 = it6;
                                str10 = str13;
                            }
                        }
                        arrayList3 = new ArrayList();
                        Set<Integer> setKeySet3 = this.zzc.keySet();
                        setKeySet3.removeAll(this.zzb);
                        while (r3.hasNext()) {
                            int iIntValue8 = num5.intValue();
                            zzy zzyVar3 = (zzy) this.zzc.get(num5);
                            Preconditions.checkNotNull(zzyVar3);
                            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb3 = zzyVar3.zzb(iIntValue8);
                            arrayList3.add(zzhgVarZzb3);
                            zzavVarZzj2 = this.zzg.zzj();
                            str12 = this.zza;
                            com.google.android.gms.internal.measurement.zzii zziiVarZzc3 = zzhgVarZzb3.zzc();
                            zzavVarZzj2.zzay();
                            zzavVarZzj2.zzg();
                            Preconditions.checkNotEmpty(str12);
                            Preconditions.checkNotNull(zziiVarZzc3);
                            byte[] bArrZzcc3 = zziiVarZzc3.zzcc();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str12);
                            contentValues.put(str11, num5);
                            contentValues.put("current_results", bArrZzcc3);
                            if (zzavVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                zzavVarZzj2.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgt.zzl(str12));
                            }
                        }
                        return arrayList3;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    if (cursorQuery4 != null) {
                        cursorQuery4.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e34) {
                e = e34;
                cursorQuery4 = null;
            } catch (Throwable th10) {
                th = th10;
                cursorQuery4 = null;
                if (cursorQuery4 != null) {
                    cursorQuery4.close();
                }
                throw th;
            }
        } else {
            map = map8;
        }
        zzav zzavVarZzj9 = this.zzg.zzj();
        String str110 = this.zza;
        zzavVarZzj9.zzay();
        zzavVarZzj9.zzg();
        Preconditions.checkNotEmpty(str110);
        try {
            cursorQuery = zzavVarZzj9.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str110}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map18 = Collections.EMPTY_MAP;
                cursorQuery.close();
                map2 = map18;
                z13 = z12;
                str2 = "data";
                str17 = "audience_id";
            } else {
                arrayMap8 = new ArrayMap();
                while (true) {
                    i14 = cursorQuery.getInt(0);
                    arrayMap8.put(Integer.valueOf(i14), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpj.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                    z13 = z12;
                    str2 = str16;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    z12 = z13;
                    str16 = str2;
                    str17 = str17;
                }
                cursorQuery.close();
                map2 = arrayMap8;
            }
        } catch (SQLiteException e35) {
            e = e35;
            z13 = z12;
            str2 = "data";
            str17 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th11) {
            th = th11;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            hashSet = new HashSet(map2.keySet());
            if (z13) {
                String str22 = this.zza;
                zzav zzavVarZzj10 = this.zzg.zzj();
                str3 = this.zza;
                zzavVarZzj10.zzay();
                zzavVarZzj10.zzg();
                Preconditions.checkNotEmpty(str3);
                arrayMap2 = new ArrayMap();
                sQLiteDatabaseZze = zzavVarZzj10.zze();
                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) arrayMap2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayMap2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    arrayMap2 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                Preconditions.checkNotEmpty(str22);
                Preconditions.checkNotNull(map2);
                arrayMap3 = new ArrayMap();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.intValue();
                        zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                        list4 = (List) arrayMap2.get(num);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = arrayMap2;
                            hashSet3 = hashSet;
                            it3 = it2;
                            arrayMap3.put(num, zziiVar3);
                            arrayMap2 = map4;
                            hashSet = hashSet3;
                            it2 = it3;
                        } else {
                            zzpf zzpfVar2 = this.zzg;
                            map4 = arrayMap2;
                            hashSet3 = hashSet;
                            List listZzq = zzpfVar2.zzp().zzq(zziiVar3.zzc(), list4);
                            if (listZzq.isEmpty()) {
                                arrayMap2 = map4;
                                hashSet = hashSet3;
                            } else {
                                com.google.android.gms.internal.measurement.zzih zzihVar = (com.google.android.gms.internal.measurement.zzih) zziiVar3.zzcl();
                                zzihVar.zzd();
                                zzihVar.zzc(listZzq);
                                List listZzq2 = zzpfVar2.zzp().zzq(zziiVar3.zza(), list4);
                                zzihVar.zzb();
                                zzihVar.zza(listZzq2);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it9 = zziiVar3.zze().iterator();
                                while (it9.hasNext()) {
                                    Iterator it10 = it2;
                                    com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) it9.next();
                                    Iterator it11 = it9;
                                    if (!list4.contains(Integer.valueOf(zzhqVar2.zzb()))) {
                                        arrayList6.add(zzhqVar2);
                                    }
                                    it2 = it10;
                                    it9 = it11;
                                }
                                it3 = it2;
                                zzihVar.zzf();
                                zzihVar.zze(arrayList6);
                                ArrayList arrayList7 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.zzik zzikVar2 : zziiVar3.zzg()) {
                                    if (!list4.contains(Integer.valueOf(zzikVar2.zzb()))) {
                                        arrayList7.add(zzikVar2);
                                    }
                                }
                                zzihVar.zzh();
                                zzihVar.zzg(arrayList7);
                                arrayMap3.put(num, (com.google.android.gms.internal.measurement.zzii) zzihVar.zzbc());
                                arrayMap2 = map4;
                                hashSet = hashSet3;
                                it2 = it3;
                            }
                        }
                    }
                }
                hashSet2 = hashSet;
                map3 = arrayMap3;
            } else {
                hashSet2 = hashSet;
                map3 = map2;
            }
            while (r16.hasNext()) {
                num2.intValue();
                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num2);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                arrayMap = new ArrayMap();
                if (zziiVar != null && zziiVar.zzf() != 0) {
                    while (r7.hasNext()) {
                        if (zzhqVar.zza()) {
                            Map map19 = map3;
                            Integer numValueOf10 = Integer.valueOf(zzhqVar.zzb());
                            if (zzhqVar.zzc()) {
                                lValueOf = Long.valueOf(zzhqVar.zzd());
                            } else {
                                lValueOf = null;
                            }
                            arrayMap.put(numValueOf10, lValueOf);
                            map3 = map19;
                        }
                    }
                }
                Map map110 = map3;
                ArrayMap arrayMap13 = new ArrayMap();
                if (zziiVar != null && zziiVar.zzh() != 0) {
                    it = zziiVar.zzg().iterator();
                    while (it.hasNext()) {
                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                        if (!zzikVar.zza() && zzikVar.zzd() > 0) {
                            arrayMap13.put(Integer.valueOf(zzikVar.zzb()), Long.valueOf(zzikVar.zze(zzikVar.zzd() - 1)));
                            it = it;
                            zziiVar = zziiVar;
                        }
                    }
                }
                zziiVar2 = zziiVar;
                if (zziiVar2 != null) {
                    i13 = 0;
                    while (i13 < zziiVar2.zzb() * 64) {
                        if (zzpj.zzn(zziiVar2.zza(), i13)) {
                            z14 = zZzp;
                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i13));
                            bitSet2.set(i13);
                            if (zzpj.zzn(zziiVar2.zzc(), i13)) {
                                bitSet.set(i13);
                            }
                            i13++;
                            zZzp = z14;
                        } else {
                            z14 = zZzp;
                        }
                        arrayMap.remove(Integer.valueOf(i13));
                        i13++;
                        zZzp = z14;
                    }
                }
                boolean z18 = zZzp;
                com.google.android.gms.internal.measurement.zzii zziiVar7 = (com.google.android.gms.internal.measurement.zzii) map2.get(num2);
                if (!zZzp2 && z18 && (list3 = (List) map.get(num2)) != null && this.zze != null && this.zzd != null) {
                    Iterator it12 = list3.iterator();
                    while (it12.hasNext()) {
                        com.google.android.gms.internal.measurement.zzff zzffVar9 = (com.google.android.gms.internal.measurement.zzff) it12.next();
                        int iZzb = zzffVar9.zzb();
                        Iterator it13 = it12;
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzffVar9.zzj()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf11 = Integer.valueOf(iZzb);
                        if (arrayMap.containsKey(numValueOf11)) {
                            arrayMap.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        if (arrayMap13.containsKey(numValueOf11)) {
                            arrayMap13.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        it12 = it13;
                    }
                }
                this.zzc.put(num2, new zzy(this, this.zza, zziiVar7, bitSet, bitSet2, arrayMap, arrayMap13, null));
                zZzp = z18;
                map3 = map110;
            }
        }
        str4 = str2;
        str5 = str17;
        str6 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            zzzVar = new zzz(this, null);
            arrayMap4 = new ArrayMap();
            it4 = list.iterator();
            while (it4.hasNext()) {
                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                if (zzhsVarZza != null) {
                    zzpfVar = this.zzg;
                    zzbcVarZzah = zzpfVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                    zzpfVar.zzj().zzh(zzbcVarZzah);
                    if (!z11) {
                        j11 = zzbcVarZzah.zzc;
                        strZzd = zzhsVarZza.zzd();
                        map5 = (Map) arrayMap4.get(strZzd);
                        if (map5 == null) {
                            zzavVarZzj = zzpfVar.zzj();
                            str9 = this.zza;
                            zzavVarZzj.zzay();
                            zzavVarZzj.zzg();
                            Preconditions.checkNotEmpty(str9);
                            Preconditions.checkNotEmpty(strZzd);
                            arrayMap5 = new ArrayMap();
                            str7 = str4;
                            str8 = str5;
                            zzbcVar = zzbcVarZzah;
                            cursorQuery2 = zzavVarZzj.zze().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                            if (cursorQuery2.moveToFirst()) {
                                j12 = j11;
                                do {
                                    com.google.android.gms.internal.measurement.zzff zzffVar10 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpj.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                    numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                    arrayList2 = (List) arrayMap5.get(numValueOf2);
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                        arrayMap5.put(numValueOf2, arrayList2);
                                    }
                                    arrayList2.add(zzffVar10);
                                } while (cursorQuery2.moveToNext());
                                cursorQuery2.close();
                                map5 = arrayMap5;
                            } else {
                                j12 = j11;
                                map5 = Collections.EMPTY_MAP;
                                cursorQuery2.close();
                            }
                            arrayMap4.put(strZzd, map5);
                        } else {
                            zzbcVar = zzbcVarZzah;
                            j12 = j11;
                            str7 = str4;
                            str8 = str5;
                        }
                        while (r6.hasNext()) {
                            iIntValue = num3.intValue();
                            if (this.zzb.contains(num3)) {
                                this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                            } else {
                                it5 = ((List) map5.get(num3)).iterator();
                                zZzd = true;
                                while (true) {
                                    if (!it5.hasNext()) {
                                        map6 = map5;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.zzff zzffVar11 = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                    zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar11);
                                    map6 = map5;
                                    zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbcVar, zzd(iIntValue, zzffVar11.zzb()));
                                    if (!zZzd) {
                                        this.zzb.add(num3);
                                        break;
                                    }
                                    zzc(num3).zza(zzaaVar);
                                    map5 = map6;
                                }
                                if (!zZzd) {
                                    this.zzb.add(num3);
                                }
                                map5 = map6;
                            }
                        }
                        str4 = str7;
                        str5 = str8;
                        zzzVar = zzzVar;
                        it4 = it4;
                    }
                }
            }
        }
        str10 = str4;
        str11 = str5;
        if (!z11) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            arrayMap6 = new ArrayMap();
            it6 = list2.iterator();
            while (it6.hasNext()) {
                com.google.android.gms.internal.measurement.zziu zziuVar4 = (com.google.android.gms.internal.measurement.zziu) it6.next();
                strZzc = zziuVar4.zzc();
                map7 = (Map) arrayMap6.get(strZzc);
                if (map7 == null) {
                    zzavVarZzj3 = this.zzg.zzj();
                    str14 = this.zza;
                    zzavVarZzj3.zzay();
                    zzavVarZzj3.zzg();
                    Preconditions.checkNotEmpty(str14);
                    Preconditions.checkNotEmpty(strZzc);
                    arrayMap7 = new ArrayMap();
                    cursorQuery3 = zzavVarZzj3.zze().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        while (true) {
                            com.google.android.gms.internal.measurement.zzfn zzfnVar5 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpj.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                            list5 = (List) arrayMap7.get(numValueOf5);
                            if (list5 == null) {
                                str13 = str10;
                                arrayList4 = new ArrayList();
                                arrayMap7.put(numValueOf5, arrayList4);
                            } else {
                                str13 = str10;
                                arrayList4 = list5;
                            }
                            arrayList4.add(zzfnVar5);
                            if (!cursorQuery3.moveToNext()) {
                                break;
                                break;
                            }
                            it6 = it6;
                            str10 = str13;
                        }
                        cursorQuery3.close();
                        map7 = arrayMap7;
                    } else {
                        str13 = str10;
                        it6 = it6;
                        map7 = Collections.EMPTY_MAP;
                        cursorQuery3.close();
                    }
                    arrayMap6.put(strZzc, map7);
                } else {
                    str13 = str10;
                    it6 = it6;
                }
                while (r3.hasNext()) {
                    int iIntValue9 = num4.intValue();
                    if (this.zzb.contains(num4)) {
                        this.zzu.zzaV().zzk().zzb(str6, num4);
                        break;
                        break;
                    }
                    it7 = ((List) map7.get(num4)).iterator();
                    zZzd2 = true;
                    while (true) {
                        if (it7.hasNext()) {
                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it7.next();
                            zzibVar = this.zzu;
                            if (Log.isLoggable(zzibVar.zzaV().zzn(), 2)) {
                                zzgr zzgrVarZzk5 = zzibVar.zzaV().zzk();
                                if (zzfnVar.zza()) {
                                    numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf4 = null;
                                }
                                zzgrVarZzk5.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, zzibVar.zzl().zzc(zzfnVar.zzc()));
                                zzibVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                            }
                            if (zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                zzgr zzgrVarZze5 = zzibVar.zzaV().zze();
                                Object objZzl5 = zzgt.zzl(this.zza);
                                if (zzfnVar.zza()) {
                                    numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf3 = null;
                                }
                                zzgrVarZze5.zzc("Invalid property filter ID. appId, id", objZzl5, String.valueOf(numValueOf3));
                                this.zzb.add(num4);
                                map7 = map7;
                                str6 = str6;
                            } else {
                                zzacVar = new zzac(this, this.zza, iIntValue9, zzfnVar);
                                zZzd2 = zzacVar.zzd(this.zzd, this.zze, zziuVar4, zzd(iIntValue9, zzfnVar.zzb()));
                                if (zZzd2) {
                                    zzc(num4).zza(zzacVar);
                                    map7 = map7;
                                    str6 = str6;
                                } else {
                                    this.zzb.add(num4);
                                }
                            }
                        } else {
                            map7 = map7;
                            str6 = str6;
                        }
                        if (!zZzd2) {
                            this.zzb.add(num4);
                        }
                        map7 = map7;
                        str6 = str6;
                    }
                }
                it6 = it6;
                str10 = str13;
            }
        }
        arrayList3 = new ArrayList();
        Set<Integer> setKeySet4 = this.zzc.keySet();
        setKeySet4.removeAll(this.zzb);
        while (r3.hasNext()) {
            int iIntValue10 = num5.intValue();
            zzy zzyVar4 = (zzy) this.zzc.get(num5);
            Preconditions.checkNotNull(zzyVar4);
            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb4 = zzyVar4.zzb(iIntValue10);
            arrayList3.add(zzhgVarZzb4);
            zzavVarZzj2 = this.zzg.zzj();
            str12 = this.zza;
            com.google.android.gms.internal.measurement.zzii zziiVarZzc4 = zzhgVarZzb4.zzc();
            zzavVarZzj2.zzay();
            zzavVarZzj2.zzg();
            Preconditions.checkNotEmpty(str12);
            Preconditions.checkNotNull(zziiVarZzc4);
            byte[] bArrZzcc4 = zziiVarZzc4.zzcc();
            contentValues = new ContentValues();
            contentValues.put("app_id", str12);
            contentValues.put(str11, num5);
            contentValues.put("current_results", bArrZzcc4);
            if (zzavVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzavVarZzj2.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgt.zzl(str12));
            }
        }
        return arrayList3;
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    public final boolean zzbb() {
        return false;
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i11, int i12) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i11));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i12);
    }

    public zzad(zzpf zzpfVar) {
        super(zzpfVar);
    }
}
