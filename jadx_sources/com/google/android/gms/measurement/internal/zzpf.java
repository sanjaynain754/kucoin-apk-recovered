package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33590cg;
import com.tencent.bugly.proguard.C33641f4;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33978va;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzpf implements zzjf {
    private static volatile zzpf zzb;
    private List zzA;
    private long zzB;
    private final Map zzC;
    private final Map zzD;
    private final Map zzE;
    private zzlt zzG;
    private String zzH;
    private zzay zzI;
    private long zzJ;

    @VisibleForTesting
    long zza;
    private final zzhs zzc;
    private final zzgy zzd;
    private zzav zze;
    private zzha zzf;
    private zzoj zzg;
    private zzad zzh;
    private final zzpj zzi;
    private zzlo zzj;
    private zznm zzk;
    private final zzot zzl;
    private zzhj zzm;
    private final zzib zzn;
    private boolean zzp;
    private List zzq;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;
    private final AtomicBoolean zzo = new AtomicBoolean(false);
    private final Deque zzr = new LinkedList();
    private final Map zzF = new HashMap();
    private final zzpn zzK = new zzpa(this);

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @androidx.annotation.WorkerThread
    private final boolean zzaF(java.lang.String r46, long r47) {
        /*
            Method dump skipped, instruction units count: 3830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpf.zzaF(java.lang.String, long):boolean");
    }

    @VisibleForTesting
    private final void zzaG(com.google.android.gms.internal.measurement.zzic zzicVar, long j11, boolean z11) {
        Object obj;
        String str = true != z11 ? "_lte" : "_se";
        zzpm zzpmVarZzm = zzj().zzm(zzicVar.zzK(), str);
        zzpm zzpmVar = (zzpmVarZzm == null || (obj = zzpmVarZzm.zze) == null) ? new zzpm(zzicVar.zzK(), "auto", str, zzaZ().currentTimeMillis(), Long.valueOf(j11)) : new zzpm(zzicVar.zzK(), "auto", str, zzaZ().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j11));
        com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
        zzitVarZzm.zzb(str);
        zzitVarZzm.zza(zzaZ().currentTimeMillis());
        Object obj2 = zzpmVar.zze;
        zzitVarZzm.zze(((Long) obj2).longValue());
        com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc();
        int iZzx = zzpj.zzx(zzicVar, str);
        if (iZzx >= 0) {
            zzicVar.zzn(iZzx, zziuVar);
        } else {
            zzicVar.zzo(zziuVar);
        }
        if (j11 > 0) {
            zzj().zzl(zzpmVar);
            zzaV().zzk().zzc("Updated engagement user property. scope, value", true != z11 ? "lifetime" : "session-scoped", obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x036a A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x036f A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x038f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0391 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x03aa A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x03af A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:113:0x03e8 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0407  */
    /* JADX WARN: Code duplicated, block: B:117:0x040b A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x042b  */
    /* JADX WARN: Code duplicated, block: B:123:0x044b A[Catch: all -> 0x0179, TRY_ENTER, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0467 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0479 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x048d A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0501 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0538 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x054d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x05a7 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x05ed A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x05f8 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0603 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x060e A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x061a A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x062b A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x065a A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0675  */
    /* JADX WARN: Code duplicated, block: B:187:0x0682  */
    /* JADX WARN: Code duplicated, block: B:188:0x0684  */
    /* JADX WARN: Code duplicated, block: B:191:0x068c  */
    /* JADX WARN: Code duplicated, block: B:192:0x068e A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0698  */
    /* JADX WARN: Code duplicated, block: B:195:0x069a  */
    /* JADX WARN: Code duplicated, block: B:198:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:199:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:202:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:203:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:206:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:207:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:210:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:211:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:214:0x06db  */
    /* JADX WARN: Code duplicated, block: B:215:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:218:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:219:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:223:0x06fd A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x0723 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x0726 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x072c A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0732  */
    /* JADX WARN: Code duplicated, block: B:249:0x07b4 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x07c4 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x07e7 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:278:0x0874  */
    /* JADX WARN: Code duplicated, block: B:281:0x08b3 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:283:0x08bd A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x08ca A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x08e6 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:290:0x0928  */
    /* JADX WARN: Code duplicated, block: B:293:0x0931 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:298:0x0952 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x096e A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:304:0x09aa A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:315:0x0a2e A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x0a67 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:327:0x0ad9 A[Catch: all -> 0x0179, SQLiteException -> 0x0aed, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x0aed, blocks: (B:325:0x0ac8, B:327:0x0ad9), top: B:359:0x0ac8, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:350:0x04a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x09c9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0a3b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0a38 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:? A[LOOP:3: B:313:0x0a28->B:381:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0191 A[PHI: r28 r29
      0x0191: PHI (r28v6 java.lang.String) = (r28v1 java.lang.String), (r28v1 java.lang.String), (r28v7 java.lang.String) binds: [B:70:0x0210, B:72:0x021e, B:52:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x0191: PHI (r29v6 java.lang.String) = (r29v1 java.lang.String), (r29v1 java.lang.String), (r29v7 java.lang.String) binds: [B:70:0x0210, B:72:0x021e, B:52:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01a1 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01b6 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x0200 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0212 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0220 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x022e A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0234  */
    /* JADX WARN: Code duplicated, block: B:78:0x023a A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x02c9 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0307  */
    /* JADX WARN: Code duplicated, block: B:92:0x030a A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0317 A[Catch: all -> 0x0179, TryCatch #3 {all -> 0x0179, blocks: (B:36:0x0156, B:39:0x0166, B:41:0x016f, B:47:0x017c, B:89:0x02f6, B:98:0x0329, B:100:0x036a, B:102:0x036f, B:103:0x0386, B:105:0x0391, B:107:0x03aa, B:109:0x03af, B:110:0x03c6, B:113:0x03e8, B:117:0x040b, B:118:0x0422, B:120:0x042e, B:123:0x044b, B:124:0x045f, B:126:0x0467, B:128:0x0473, B:130:0x0479, B:131:0x0480, B:133:0x048d, B:135:0x0495, B:137:0x049d, B:139:0x04a5, B:140:0x04b1, B:141:0x04be, B:147:0x0501, B:148:0x0516, B:150:0x0538, B:153:0x054f, B:156:0x058a, B:158:0x05b5, B:160:0x05ed, B:161:0x05f0, B:163:0x05f8, B:164:0x05fb, B:166:0x0603, B:167:0x0606, B:169:0x060e, B:170:0x0611, B:172:0x061a, B:173:0x061e, B:175:0x062b, B:176:0x062e, B:178:0x065a, B:180:0x0664, B:184:0x0679, B:189:0x0685, B:192:0x068e, B:196:0x069b, B:200:0x06a9, B:204:0x06b7, B:208:0x06c5, B:212:0x06d3, B:216:0x06de, B:220:0x06eb, B:221:0x06f7, B:223:0x06fd, B:224:0x0700, B:226:0x0723, B:229:0x072c, B:232:0x0735, B:233:0x074f, B:235:0x0755, B:237:0x0769, B:239:0x0775, B:241:0x0782, B:244:0x079b, B:245:0x07ab, B:249:0x07b4, B:250:0x07b7, B:252:0x07c4, B:253:0x07c9, B:255:0x07e7, B:257:0x07eb, B:259:0x07fb, B:261:0x0806, B:262:0x080f, B:264:0x0819, B:266:0x0825, B:268:0x082f, B:270:0x0835, B:272:0x0844, B:274:0x085a, B:276:0x0860, B:277:0x0869, B:279:0x0877, B:281:0x08b3, B:283:0x08bd, B:284:0x08c0, B:286:0x08ca, B:288:0x08e6, B:289:0x08f1, B:291:0x0929, B:293:0x0931, B:295:0x093b, B:296:0x0948, B:298:0x0952, B:299:0x095f, B:300:0x0968, B:302:0x096e, B:304:0x09aa, B:306:0x09b4, B:308:0x09c6, B:310:0x09cc, B:311:0x0a11, B:312:0x0a1d, B:313:0x0a28, B:315:0x0a2e, B:324:0x0a7b, B:325:0x0ac8, B:327:0x0ad9, B:341:0x0b3a, B:332:0x0af1, B:333:0x0af4, B:318:0x0a3b, B:320:0x0a67, B:338:0x0b0d, B:339:0x0b24, B:340:0x0b25, B:227:0x0726, B:157:0x05a7, B:144:0x04e8, B:92:0x030a, B:93:0x0311, B:95:0x0317, B:97:0x0323, B:54:0x0195, B:56:0x01a1, B:58:0x01b6, B:64:0x01d6, B:69:0x020c, B:71:0x0212, B:73:0x0220, B:75:0x022e, B:78:0x023a, B:86:0x02bf, B:88:0x02c9, B:80:0x0263, B:81:0x027c, B:85:0x02a2, B:84:0x028f, B:67:0x01e2, B:68:0x0200), top: B:352:0x0156, inners: #0, #1, #5, #6, #7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    @WorkerThread
    public final void zzH(zzbg zzbgVar, zzr zzrVar) {
        zzbe zzbeVar;
        String strZzd;
        long jLongValue;
        String upperCase;
        String strConcat;
        zzpm zzpmVarZzm;
        zzav zzavVarZzj;
        zzpm zzpmVar;
        zzpm zzpmVar2;
        Object obj;
        double dDoubleValue;
        String str;
        boolean zZzh;
        boolean zEquals;
        zzbe zzbeVar2;
        zzbd zzbdVar;
        long length;
        Object objZza;
        String str2;
        zzbg zzbgVar2;
        zzar zzarVarZzx;
        long jZzH;
        long j11;
        ?? r11;
        Bundle bundleZzf;
        zzav zzavVarZzj2;
        long jDelete;
        zzbb zzbbVar;
        zzib zzibVar;
        String str3;
        zzbc zzbcVarZzf;
        zzbb zzbbVar2;
        zzbc zzbcVar;
        String str4;
        com.google.android.gms.internal.measurement.zzic zzicVarZzaE;
        String str5;
        String str6;
        String str7;
        long j12;
        String str8;
        zzjk zzjkVarZzs;
        long j13;
        com.google.android.gms.internal.measurement.zzjq zzjqVarZza;
        Map mapZzb;
        ArrayList arrayList;
        String str9;
        zzjk zzjkVarZzs2;
        zzjj zzjjVar;
        zzib zzibVar2;
        zzh zzhVarZzu;
        int i11;
        List listZzn;
        int i12;
        zzav zzavVarZzj3;
        zzav zzavVarZzj4;
        zzbd zzbdVar2;
        boolean zZzk;
        int i13;
        String str10;
        ContentValues contentValues;
        zzh zzhVarZzu2;
        long j14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object obj2;
        zzpm zzpmVarZzm2;
        Object obj3;
        long jMax;
        long jIntValue;
        String str11 = "app_id";
        String str12 = "_fx";
        String str13 = "raw_events";
        Preconditions.checkNotNull(zzrVar);
        String str14 = zzrVar.zza;
        Preconditions.checkNotEmpty(str14);
        long jNanoTime = System.nanoTime();
        zzaW().zzg();
        zzu();
        zzp();
        if (zzpj.zzD(zzbgVar, zzrVar)) {
            if (!zzrVar.zzh) {
                zzan(zzrVar);
                return;
            }
            zzhs zzhsVarZzh = zzh();
            String str15 = zzbgVar.zza;
            if (zzhsVarZzh.zzj(str14, str15)) {
                zzaV().zze().zzc("Dropping blocked event. appId", zzgt.zzl(str14), this.zzn.zzl().zza(str15));
                if (!zzh().zzn(str14) && !zzh().zzo(str14)) {
                    if ("_err".equals(str15)) {
                        return;
                    }
                    zzt().zzN(this.zzK, str14, 11, "_ev", str15, 0);
                    return;
                }
                zzh zzhVarZzu3 = zzj().zzu(str14);
                if (zzhVarZzu3 != null) {
                    long jAbs = Math.abs(zzaZ().currentTimeMillis() - Math.max(zzhVarZzu3.zzJ(), zzhVarZzu3.zzH()));
                    zzd();
                    if (jAbs > ((Long) zzfx.zzN.zzb(null)).longValue()) {
                        zzaV().zzj().zza("Fetching config for blocked app");
                        zzV(zzhVarZzu3);
                        return;
                    }
                    return;
                }
                return;
            }
            zzgu zzguVarZza = zzgu.zza(zzbgVar);
            zzt().zzG(zzguVarZza, zzd().zzd(str14));
            int iZzn = zzd().zzn(str14, zzfx.zzag, 10, 35);
            Bundle bundle = zzguVarZza.zzd;
            for (String str16 : new TreeSet(bundle.keySet())) {
                if (FirebaseAnalytics.Param.ITEMS.equals(str16)) {
                    zzt().zzH(bundle.getParcelableArray(str16), iZzn);
                }
            }
            zzbg zzbgVarZzb = zzguVarZza.zzb();
            if (Log.isLoggable(zzaV().zzn(), 2)) {
                zzaV().zzk().zzb("Logging event", this.zzn.zzl().zzd(zzbgVarZzb));
            }
            zzj().zzb();
            try {
                zzan(zzrVar);
                String str17 = zzbgVarZzb.zza;
                boolean z19 = "ecommerce_purchase".equals(str17) || FirebaseAnalytics.Event.PURCHASE.equals(str17) || FirebaseAnalytics.Event.REFUND.equals(str17);
                if ("_iap".equals(str17)) {
                    zzbeVar = zzbgVarZzb.zzb;
                    strZzd = zzbeVar.zzd(FirebaseAnalytics.Param.CURRENCY);
                    if (z19) {
                        dDoubleValue = zzbeVar.zzc("value").doubleValue() * 1000000.0d;
                        if (dDoubleValue == 0.0d) {
                            dDoubleValue = zzbeVar.zzb("value").longValue() * 1000000.0d;
                        }
                        if (dDoubleValue <= 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                            zzaV().zze().zzc("Data lost. Currency value is too big. appId", zzgt.zzl(str14), Double.valueOf(dDoubleValue));
                            zzj().zzc();
                        } else {
                            jLongValue = Math.round(dDoubleValue);
                            if (FirebaseAnalytics.Event.REFUND.equals(str17)) {
                                jLongValue = -jLongValue;
                            }
                        }
                    } else {
                        str11 = "app_id";
                        str12 = "_fx";
                        jLongValue = zzbeVar.zzb("value").longValue();
                    }
                    if (TextUtils.isEmpty(strZzd)) {
                        zzbgVarZzb = zzbgVarZzb;
                        str = zzbgVarZzb.zza;
                        zZzh = zzpo.zzh(str);
                        zEquals = "_err".equals(str);
                        zzt();
                        zzbeVar2 = zzbgVarZzb.zzb;
                        if (zzbeVar2 == null) {
                            length = 0;
                        } else {
                            zzbdVar = new zzbd(zzbeVar2);
                            length = 0;
                            while (zzbdVar.hasNext()) {
                                objZza = zzbeVar2.zza(zzbdVar.next());
                                if (objZza instanceof Parcelable[]) {
                                    length += (long) ((Parcelable[]) objZza).length;
                                }
                            }
                        }
                        str2 = str14;
                        zzbgVar2 = zzbgVarZzb;
                        zzarVarZzx = zzj().zzx(zzC(), str2, length + 1, true, zZzh, false, zEquals, false, false, false);
                        long j15 = zzarVarZzx.zzb;
                        zzd();
                        jZzH = j15 - zzal.zzH();
                        if (jZzH > 0) {
                            if (jZzH % 1000 == 1) {
                                zzaV().zzb().zzc("Data loss. Too many events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzb));
                            }
                            zzj().zzc();
                        } else {
                            if (zZzh) {
                                if (zEquals) {
                                    j11 = 1;
                                    r11 = 0;
                                    jMax = zzarVarZzx.zzd - ((long) Math.max(0, Math.min(1000000, zzd().zzm(zzrVar.zza, zzfx.zzl))));
                                    if (jMax > 0) {
                                        if (jMax == 1) {
                                            zzaV().zzb().zzc("Too many error events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzd));
                                        }
                                        zzj().zzc();
                                    }
                                } else {
                                    j11 = 1;
                                    r11 = 0;
                                }
                                bundleZzf = zzbeVar2.zzf();
                                zzpo zzpoVarZzt = zzt();
                                String str18 = zzbgVar2.zzc;
                                zzpoVarZzt.zzM(bundleZzf, "_o", str18);
                                if (zzt().zzaa(str2, zzrVar.zzB)) {
                                    zzpo zzpoVarZzt2 = zzt();
                                    Long lValueOf = Long.valueOf(j11);
                                    zzpoVarZzt2.zzM(bundleZzf, "_dbg", lValueOf);
                                    zzt().zzM(bundleZzf, "_r", lValueOf);
                                }
                                if ("_s".equals(str)) {
                                    obj3 = zzpmVarZzm2.zze;
                                    if (obj3 instanceof Long) {
                                        zzt().zzM(bundleZzf, "_sno", obj3);
                                    }
                                }
                                if (zzd().zzp(null, zzfx.zzaX)) {
                                    obj2 = bundleZzf.get("value");
                                    if (obj2 instanceof String) {
                                        double d11 = Double.parseDouble((String) obj2);
                                        bundleZzf.remove("value");
                                        bundleZzf.putDouble("value", d11);
                                    }
                                }
                                zzavVarZzj2 = zzj();
                                Preconditions.checkNotEmpty(str2);
                                zzavVarZzj2.zzg();
                                zzavVarZzj2.zzay();
                                jDelete = zzavVarZzj2.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str2, String.valueOf(Math.max((int) r11, Math.min(1000000, zzavVarZzj2.zzu.zzc().zzm(str2, zzfx.zzp))))});
                                if (jDelete > 0) {
                                    zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgt.zzl(str2), Long.valueOf(jDelete));
                                }
                                zzibVar = this.zzn;
                                zzbbVar = new zzbb(zzibVar, zzbgVar2.zzc, str2, zzbgVar2.zza, zzbgVar2.zzd, 0L, bundleZzf);
                                zzav zzavVarZzj5 = zzj();
                                str3 = zzbbVar.zzb;
                                zzbcVarZzf = zzavVarZzj5.zzf(str2, str3);
                                if (zzbcVarZzf != null) {
                                    if (zzj().zzU(str2) >= zzd().zzh(str2)) {
                                    }
                                    zzbcVar = new zzbc(str2, str3, 0L, 0L, 0L, zzbbVar.zzd, 0L, null, null, null, null);
                                    zzbbVar2 = zzbbVar;
                                } else {
                                    zzbb zzbbVarZza = zzbbVar.zza(zzibVar, zzbcVarZzf.zzf);
                                    zzbc zzbcVarZza = zzbcVarZzf.zza(zzbbVarZza.zzd);
                                    zzbbVar2 = zzbbVarZza;
                                    zzbcVar = zzbcVarZza;
                                }
                                zzj().zzh(zzbcVar);
                                zzaW().zzg();
                                zzu();
                                Preconditions.checkNotNull(zzbbVar2);
                                Preconditions.checkNotNull(zzrVar);
                                String str19 = zzbbVar2.zza;
                                Preconditions.checkNotEmpty(str19);
                                str4 = zzrVar.zza;
                                Preconditions.checkArgument(str19.equals(str4));
                                zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                                zzicVarZzaE.zza(1);
                                zzicVarZzaE.zzC("android");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzicVarZzaE.zzL(str4);
                                }
                                str5 = zzrVar.zzd;
                                if (!TextUtils.isEmpty(str5)) {
                                    zzicVarZzaE.zzJ(str5);
                                }
                                str6 = zzrVar.zzc;
                                if (!TextUtils.isEmpty(str6)) {
                                    zzicVarZzaE.zzM(str6);
                                }
                                str7 = zzrVar.zzu;
                                if (!TextUtils.isEmpty(str7)) {
                                    zzicVarZzaE.zzau(str7);
                                }
                                j12 = zzrVar.zzj;
                                if (j12 != -2147483648L) {
                                    zzicVarZzaE.zzaj((int) j12);
                                }
                                zzicVarZzaE.zzN(zzrVar.zze);
                                str8 = zzrVar.zzb;
                                if (!TextUtils.isEmpty(str8)) {
                                    zzicVarZzaE.zzad(str8);
                                }
                                zzjkVarZzs = zzB((String) Preconditions.checkNotNull(str4)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                zzicVarZzaE.zzat(zzjkVarZzs.zzk());
                                zzql.zza();
                                if (zzd().zzp(str4, zzfx.zzaP)) {
                                    zzicVarZzaE.zzaH(zzrVar.zzz);
                                    j14 = zzrVar.zzA;
                                    if (!zzjkVarZzs.zzo(zzjj.AD_STORAGE)) {
                                        j14 = (j14 & (-2)) | 32;
                                    }
                                    if (j14 == j11) {
                                        z11 = 1;
                                    } else {
                                        z11 = r11;
                                    }
                                    zzicVarZzaE.zzaz(z11);
                                    if (j14 == 0) {
                                        com.google.android.gms.internal.measurement.zzhd zzhdVarZzh = com.google.android.gms.internal.measurement.zzhe.zzh();
                                        if ((j14 & j11) != 0) {
                                            z12 = 1;
                                        } else {
                                            z12 = r11;
                                        }
                                        zzhdVarZzh.zza(z12);
                                        if ((j14 & 2) != 0) {
                                            z13 = 1;
                                        } else {
                                            z13 = r11;
                                        }
                                        zzhdVarZzh.zzb(z13);
                                        if ((j14 & 4) != 0) {
                                            z14 = 1;
                                        } else {
                                            z14 = r11;
                                        }
                                        zzhdVarZzh.zzc(z14);
                                        if ((j14 & 8) != 0) {
                                            z15 = 1;
                                        } else {
                                            z15 = r11;
                                        }
                                        zzhdVarZzh.zzd(z15);
                                        if ((j14 & 16) != 0) {
                                            z16 = 1;
                                        } else {
                                            z16 = r11;
                                        }
                                        zzhdVarZzh.zze(z16);
                                        if ((32 & j14) != 0) {
                                            z17 = 1;
                                        } else {
                                            z17 = r11;
                                        }
                                        zzhdVarZzh.zzf(z17);
                                        if ((j14 & 64) != 0) {
                                            z18 = 1;
                                        } else {
                                            z18 = r11;
                                        }
                                        zzhdVarZzh.zzg(z18);
                                        zzicVarZzaE.zzaI((com.google.android.gms.internal.measurement.zzhe) zzhdVarZzh.zzbc());
                                    }
                                }
                                j13 = zzrVar.zzf;
                                if (j13 != 0) {
                                    zzicVarZzaE.zzY(j13);
                                }
                                zzicVarZzaE.zzar(zzrVar.zzq);
                                zzpj zzpjVarZzp = zzp();
                                zzjqVarZza = com.google.android.gms.internal.measurement.zzjq.zza(zzpjVarZzp.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement"), zzfu.zza);
                                if (zzjqVarZza == null) {
                                    mapZzb = Collections.EMPTY_MAP;
                                } else {
                                    mapZzb = zzjqVarZza.zzb();
                                }
                                if (mapZzb == null) {
                                    arrayList = null;
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    zzicVarZzaE.zzaq(arrayList);
                                }
                                if (zzd().zzp(null, zzfx.zzbb)) {
                                    zzicVarZzaE.zzaP("");
                                }
                                str9 = zzrVar.zza;
                                zzjkVarZzs2 = zzB((String) Preconditions.checkNotNull(str9)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                zzjjVar = zzjj.AD_STORAGE;
                                if (zzjkVarZzs2.zzo(zzjjVar)) {
                                    str13 = "raw_events";
                                    zzjjVar = zzjjVar;
                                } else {
                                    str13 = "raw_events";
                                    zzjjVar = zzjjVar;
                                }
                                zzibVar2 = this.zzn;
                                zzibVar2.zzu().zzw();
                                zzicVarZzaE.zzF(Build.MODEL);
                                zzibVar2.zzu().zzw();
                                zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                                zzicVarZzaE.zzI((int) zzibVar2.zzu().zzb());
                                zzicVarZzaE.zzH(zzibVar2.zzu().zzc());
                                zzicVarZzaE.zzay(zzrVar.zzw);
                                if (zzibVar2.zzB()) {
                                    zzicVarZzaE.zzK();
                                    if (!TextUtils.isEmpty(null)) {
                                        zzicVarZzaE.zzam(null);
                                    }
                                }
                                zzhVarZzu = zzj().zzu(str9);
                                if (zzhVarZzu == null) {
                                    zzhVarZzu = new zzh(zzibVar2, str9);
                                    zzhVarZzu.zze(zzK(zzjkVarZzs2));
                                    zzhVarZzu.zzm(zzrVar.zzk);
                                    zzhVarZzu.zzg(zzrVar.zzb);
                                    if (zzjkVarZzs2.zzo(zzjjVar)) {
                                        zzhVarZzu.zzk(this.zzk.zzf(str9, zzrVar.zzn));
                                    }
                                    zzhVarZzu.zzF(0L);
                                    zzhVarZzu.zzo(0L);
                                    zzhVarZzu.zzq(0L);
                                    zzhVarZzu.zzs(zzrVar.zzc);
                                    zzhVarZzu.zzu(zzrVar.zzj);
                                    zzhVarZzu.zzw(zzrVar.zzd);
                                    zzhVarZzu.zzy(zzrVar.zze);
                                    zzhVarZzu.zzA(zzrVar.zzf);
                                    zzhVarZzu.zzE(zzrVar.zzh);
                                    zzhVarZzu.zzC(zzrVar.zzq);
                                    i11 = 0;
                                    zzj().zzv(zzhVarZzu, false, false);
                                } else {
                                    i11 = 0;
                                }
                                if (zzjkVarZzs2.zzo(zzjj.ANALYTICS_STORAGE)) {
                                    zzicVarZzaE.zzW((String) Preconditions.checkNotNull(zzhVarZzu.zzd()));
                                }
                                if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                    zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                                }
                                listZzn = zzj().zzn(str9);
                                for (i12 = i11; i12 < listZzn.size(); i12++) {
                                    com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
                                    zzitVarZzm.zzb(((zzpm) listZzn.get(i12)).zzc);
                                    zzitVarZzm.zza(((zzpm) listZzn.get(i12)).zzd);
                                    zzp().zzc(zzitVarZzm, ((zzpm) listZzn.get(i12)).zze);
                                    zzicVarZzaE.zzp(zzitVarZzm);
                                    if (!"_sid".equals(((zzpm) listZzn.get(i12)).zzc)) {
                                    }
                                }
                                zzavVarZzj3 = zzj();
                                com.google.android.gms.internal.measurement.zzid zzidVar = (com.google.android.gms.internal.measurement.zzid) zzicVarZzaE.zzbc();
                                zzavVarZzj3.zzg();
                                zzavVarZzj3.zzay();
                                Preconditions.checkNotNull(zzidVar);
                                Preconditions.checkNotEmpty(zzidVar.zzA());
                                byte[] bArrZzcc = zzidVar.zzcc();
                                long jZzt = zzavVarZzj3.zzg.zzp().zzt(bArrZzcc);
                                ContentValues contentValues2 = new ContentValues();
                                String str20 = str11;
                                contentValues2.put(str20, zzidVar.zzA());
                                contentValues2.put("metadata_fingerprint", Long.valueOf(jZzt));
                                contentValues2.put("metadata", bArrZzcc);
                                zzavVarZzj3.zze().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                zzavVarZzj4 = zzj();
                                zzbdVar2 = new zzbd(zzbbVar2.zzf);
                                while (true) {
                                    if (zzbdVar2.hasNext()) {
                                        zzhs zzhsVarZzh2 = zzh();
                                        String str21 = zzbbVar2.zza;
                                        zZzk = zzhsVarZzh2.zzk(str21, zzbbVar2.zzb);
                                        zzar zzarVarZzw = zzj().zzw(zzC(), str21, false, false, false, false, false, false, false);
                                        if (zZzk) {
                                        }
                                        i13 = i11;
                                        break;
                                    }
                                    if ("_r".equals(zzbdVar2.next())) {
                                    }
                                    i13 = 1;
                                    break;
                                }
                                zzavVarZzj4.zzg();
                                zzavVarZzj4.zzay();
                                Preconditions.checkNotNull(zzbbVar2);
                                str10 = zzbbVar2.zza;
                                Preconditions.checkNotEmpty(str10);
                                byte[] bArrZzcc2 = zzavVarZzj4.zzg.zzp().zzh(zzbbVar2).zzcc();
                                contentValues = new ContentValues();
                                contentValues.put(str20, str10);
                                contentValues.put("name", zzbbVar2.zzb);
                                contentValues.put("timestamp", Long.valueOf(zzbbVar2.zzd));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jZzt));
                                contentValues.put("data", bArrZzcc2);
                                contentValues.put(C33590cg.f69439i, Integer.valueOf(i13));
                                if (zzavVarZzj4.zze().insert(str13, null, contentValues) == -1) {
                                    zzavVarZzj4.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", zzgt.zzl(str10));
                                } else {
                                    this.zza = 0L;
                                }
                                zzj().zzc();
                                zzj().zzd();
                                zzaK();
                                zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                return;
                            }
                            long j16 = zzarVarZzx.zza;
                            zzd();
                            jIntValue = j16 - ((long) ((Integer) zzfx.zzm.zzb(null)).intValue());
                            if (jIntValue <= 0) {
                                if (zEquals) {
                                    j11 = 1;
                                    r11 = 0;
                                    jMax = zzarVarZzx.zzd - ((long) Math.max(0, Math.min(1000000, zzd().zzm(zzrVar.zza, zzfx.zzl))));
                                    if (jMax > 0) {
                                        if (jMax == 1) {
                                            zzaV().zzb().zzc("Too many error events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzd));
                                        }
                                        zzj().zzc();
                                    }
                                } else {
                                    j11 = 1;
                                    r11 = 0;
                                }
                                bundleZzf = zzbeVar2.zzf();
                                zzpo zzpoVarZzt3 = zzt();
                                String str110 = zzbgVar2.zzc;
                                zzpoVarZzt3.zzM(bundleZzf, "_o", str110);
                                if (zzt().zzaa(str2, zzrVar.zzB)) {
                                    zzpo zzpoVarZzt4 = zzt();
                                    Long lValueOf2 = Long.valueOf(j11);
                                    zzpoVarZzt4.zzM(bundleZzf, "_dbg", lValueOf2);
                                    zzt().zzM(bundleZzf, "_r", lValueOf2);
                                }
                                if ("_s".equals(str)) {
                                    obj3 = zzpmVarZzm2.zze;
                                    if (obj3 instanceof Long) {
                                        zzt().zzM(bundleZzf, "_sno", obj3);
                                    }
                                }
                                if (zzd().zzp(null, zzfx.zzaX)) {
                                    obj2 = bundleZzf.get("value");
                                    if (obj2 instanceof String) {
                                        double d12 = Double.parseDouble((String) obj2);
                                        bundleZzf.remove("value");
                                        bundleZzf.putDouble("value", d12);
                                    }
                                }
                                zzavVarZzj2 = zzj();
                                Preconditions.checkNotEmpty(str2);
                                zzavVarZzj2.zzg();
                                zzavVarZzj2.zzay();
                                jDelete = zzavVarZzj2.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str2, String.valueOf(Math.max((int) r11, Math.min(1000000, zzavVarZzj2.zzu.zzc().zzm(str2, zzfx.zzp))))});
                                if (jDelete > 0) {
                                    zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgt.zzl(str2), Long.valueOf(jDelete));
                                }
                                zzibVar = this.zzn;
                                zzbbVar = new zzbb(zzibVar, zzbgVar2.zzc, str2, zzbgVar2.zza, zzbgVar2.zzd, 0L, bundleZzf);
                                zzav zzavVarZzj6 = zzj();
                                str3 = zzbbVar.zzb;
                                zzbcVarZzf = zzavVarZzj6.zzf(str2, str3);
                                if (zzbcVarZzf != null) {
                                    if (zzj().zzU(str2) >= zzd().zzh(str2)) {
                                    }
                                    zzbcVar = new zzbc(str2, str3, 0L, 0L, 0L, zzbbVar.zzd, 0L, null, null, null, null);
                                    zzbbVar2 = zzbbVar;
                                } else {
                                    zzbb zzbbVarZza2 = zzbbVar.zza(zzibVar, zzbcVarZzf.zzf);
                                    zzbc zzbcVarZza2 = zzbcVarZzf.zza(zzbbVarZza2.zzd);
                                    zzbbVar2 = zzbbVarZza2;
                                    zzbcVar = zzbcVarZza2;
                                }
                                zzj().zzh(zzbcVar);
                                zzaW().zzg();
                                zzu();
                                Preconditions.checkNotNull(zzbbVar2);
                                Preconditions.checkNotNull(zzrVar);
                                String str111 = zzbbVar2.zza;
                                Preconditions.checkNotEmpty(str111);
                                str4 = zzrVar.zza;
                                Preconditions.checkArgument(str111.equals(str4));
                                zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                                zzicVarZzaE.zza(1);
                                zzicVarZzaE.zzC("android");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzicVarZzaE.zzL(str4);
                                }
                                str5 = zzrVar.zzd;
                                if (!TextUtils.isEmpty(str5)) {
                                    zzicVarZzaE.zzJ(str5);
                                }
                                str6 = zzrVar.zzc;
                                if (!TextUtils.isEmpty(str6)) {
                                    zzicVarZzaE.zzM(str6);
                                }
                                str7 = zzrVar.zzu;
                                if (!TextUtils.isEmpty(str7)) {
                                    zzicVarZzaE.zzau(str7);
                                }
                                j12 = zzrVar.zzj;
                                if (j12 != -2147483648L) {
                                    zzicVarZzaE.zzaj((int) j12);
                                }
                                zzicVarZzaE.zzN(zzrVar.zze);
                                str8 = zzrVar.zzb;
                                if (!TextUtils.isEmpty(str8)) {
                                    zzicVarZzaE.zzad(str8);
                                }
                                zzjkVarZzs = zzB((String) Preconditions.checkNotNull(str4)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                zzicVarZzaE.zzat(zzjkVarZzs.zzk());
                                zzql.zza();
                                if (zzd().zzp(str4, zzfx.zzaP)) {
                                    zzicVarZzaE.zzaH(zzrVar.zzz);
                                    j14 = zzrVar.zzA;
                                    if (!zzjkVarZzs.zzo(zzjj.AD_STORAGE)) {
                                        j14 = (j14 & (-2)) | 32;
                                    }
                                    if (j14 == j11) {
                                        z11 = 1;
                                    } else {
                                        z11 = r11;
                                    }
                                    zzicVarZzaE.zzaz(z11);
                                    if (j14 == 0) {
                                        com.google.android.gms.internal.measurement.zzhd zzhdVarZzh2 = com.google.android.gms.internal.measurement.zzhe.zzh();
                                        if ((j14 & j11) != 0) {
                                            z12 = 1;
                                        } else {
                                            z12 = r11;
                                        }
                                        zzhdVarZzh2.zza(z12);
                                        if ((j14 & 2) != 0) {
                                            z13 = 1;
                                        } else {
                                            z13 = r11;
                                        }
                                        zzhdVarZzh2.zzb(z13);
                                        if ((j14 & 4) != 0) {
                                            z14 = 1;
                                        } else {
                                            z14 = r11;
                                        }
                                        zzhdVarZzh2.zzc(z14);
                                        if ((j14 & 8) != 0) {
                                            z15 = 1;
                                        } else {
                                            z15 = r11;
                                        }
                                        zzhdVarZzh2.zzd(z15);
                                        if ((j14 & 16) != 0) {
                                            z16 = 1;
                                        } else {
                                            z16 = r11;
                                        }
                                        zzhdVarZzh2.zze(z16);
                                        if ((32 & j14) != 0) {
                                            z17 = 1;
                                        } else {
                                            z17 = r11;
                                        }
                                        zzhdVarZzh2.zzf(z17);
                                        if ((j14 & 64) != 0) {
                                            z18 = 1;
                                        } else {
                                            z18 = r11;
                                        }
                                        zzhdVarZzh2.zzg(z18);
                                        zzicVarZzaE.zzaI((com.google.android.gms.internal.measurement.zzhe) zzhdVarZzh2.zzbc());
                                    }
                                }
                                j13 = zzrVar.zzf;
                                if (j13 != 0) {
                                    zzicVarZzaE.zzY(j13);
                                }
                                zzicVarZzaE.zzar(zzrVar.zzq);
                                zzpj zzpjVarZzp2 = zzp();
                                zzjqVarZza = com.google.android.gms.internal.measurement.zzjq.zza(zzpjVarZzp2.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement"), zzfu.zza);
                                if (zzjqVarZza == null) {
                                    mapZzb = Collections.EMPTY_MAP;
                                } else {
                                    mapZzb = zzjqVarZza.zzb();
                                }
                                if (mapZzb == null) {
                                    arrayList = null;
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    zzicVarZzaE.zzaq(arrayList);
                                }
                                if (zzd().zzp(null, zzfx.zzbb)) {
                                    zzicVarZzaE.zzaP("");
                                }
                                str9 = zzrVar.zza;
                                zzjkVarZzs2 = zzB((String) Preconditions.checkNotNull(str9)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                zzjjVar = zzjj.AD_STORAGE;
                                if (zzjkVarZzs2.zzo(zzjjVar)) {
                                    str13 = "raw_events";
                                    zzjjVar = zzjjVar;
                                } else {
                                    str13 = "raw_events";
                                    zzjjVar = zzjjVar;
                                }
                                zzibVar2 = this.zzn;
                                zzibVar2.zzu().zzw();
                                zzicVarZzaE.zzF(Build.MODEL);
                                zzibVar2.zzu().zzw();
                                zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                                zzicVarZzaE.zzI((int) zzibVar2.zzu().zzb());
                                zzicVarZzaE.zzH(zzibVar2.zzu().zzc());
                                zzicVarZzaE.zzay(zzrVar.zzw);
                                if (zzibVar2.zzB()) {
                                    zzicVarZzaE.zzK();
                                    if (!TextUtils.isEmpty(null)) {
                                        zzicVarZzaE.zzam(null);
                                    }
                                }
                                zzhVarZzu = zzj().zzu(str9);
                                if (zzhVarZzu == null) {
                                    zzhVarZzu = new zzh(zzibVar2, str9);
                                    zzhVarZzu.zze(zzK(zzjkVarZzs2));
                                    zzhVarZzu.zzm(zzrVar.zzk);
                                    zzhVarZzu.zzg(zzrVar.zzb);
                                    if (zzjkVarZzs2.zzo(zzjjVar)) {
                                        zzhVarZzu.zzk(this.zzk.zzf(str9, zzrVar.zzn));
                                    }
                                    zzhVarZzu.zzF(0L);
                                    zzhVarZzu.zzo(0L);
                                    zzhVarZzu.zzq(0L);
                                    zzhVarZzu.zzs(zzrVar.zzc);
                                    zzhVarZzu.zzu(zzrVar.zzj);
                                    zzhVarZzu.zzw(zzrVar.zzd);
                                    zzhVarZzu.zzy(zzrVar.zze);
                                    zzhVarZzu.zzA(zzrVar.zzf);
                                    zzhVarZzu.zzE(zzrVar.zzh);
                                    zzhVarZzu.zzC(zzrVar.zzq);
                                    i11 = 0;
                                    zzj().zzv(zzhVarZzu, false, false);
                                } else {
                                    i11 = 0;
                                }
                                if (zzjkVarZzs2.zzo(zzjj.ANALYTICS_STORAGE)) {
                                    zzicVarZzaE.zzW((String) Preconditions.checkNotNull(zzhVarZzu.zzd()));
                                }
                                if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                    zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                                }
                                listZzn = zzj().zzn(str9);
                                while (i12 < listZzn.size()) {
                                    com.google.android.gms.internal.measurement.zzit zzitVarZzm2 = com.google.android.gms.internal.measurement.zziu.zzm();
                                    zzitVarZzm2.zzb(((zzpm) listZzn.get(i12)).zzc);
                                    zzitVarZzm2.zza(((zzpm) listZzn.get(i12)).zzd);
                                    zzp().zzc(zzitVarZzm2, ((zzpm) listZzn.get(i12)).zze);
                                    zzicVarZzaE.zzp(zzitVarZzm2);
                                    if (!"_sid".equals(((zzpm) listZzn.get(i12)).zzc)) {
                                    }
                                }
                                zzavVarZzj3 = zzj();
                                com.google.android.gms.internal.measurement.zzid zzidVar2 = (com.google.android.gms.internal.measurement.zzid) zzicVarZzaE.zzbc();
                                zzavVarZzj3.zzg();
                                zzavVarZzj3.zzay();
                                Preconditions.checkNotNull(zzidVar2);
                                Preconditions.checkNotEmpty(zzidVar2.zzA());
                                byte[] bArrZzcc3 = zzidVar2.zzcc();
                                long jZzt2 = zzavVarZzj3.zzg.zzp().zzt(bArrZzcc3);
                                ContentValues contentValues3 = new ContentValues();
                                String str22 = str11;
                                contentValues3.put(str22, zzidVar2.zzA());
                                contentValues3.put("metadata_fingerprint", Long.valueOf(jZzt2));
                                contentValues3.put("metadata", bArrZzcc3);
                                zzavVarZzj3.zze().insertWithOnConflict("raw_events_metadata", null, contentValues3, 4);
                                zzavVarZzj4 = zzj();
                                zzbdVar2 = new zzbd(zzbbVar2.zzf);
                                while (true) {
                                    if (zzbdVar2.hasNext()) {
                                        zzhs zzhsVarZzh3 = zzh();
                                        String str23 = zzbbVar2.zza;
                                        zZzk = zzhsVarZzh3.zzk(str23, zzbbVar2.zzb);
                                        zzar zzarVarZzw2 = zzj().zzw(zzC(), str23, false, false, false, false, false, false, false);
                                        if (zZzk) {
                                        }
                                        i13 = i11;
                                        break;
                                    }
                                    if ("_r".equals(zzbdVar2.next())) {
                                    }
                                    i13 = 1;
                                    break;
                                }
                                zzavVarZzj4.zzg();
                                zzavVarZzj4.zzay();
                                Preconditions.checkNotNull(zzbbVar2);
                                str10 = zzbbVar2.zza;
                                Preconditions.checkNotEmpty(str10);
                                byte[] bArrZzcc4 = zzavVarZzj4.zzg.zzp().zzh(zzbbVar2).zzcc();
                                contentValues = new ContentValues();
                                contentValues.put(str22, str10);
                                contentValues.put("name", zzbbVar2.zzb);
                                contentValues.put("timestamp", Long.valueOf(zzbbVar2.zzd));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jZzt2));
                                contentValues.put("data", bArrZzcc4);
                                contentValues.put(C33590cg.f69439i, Integer.valueOf(i13));
                                if (zzavVarZzj4.zze().insert(str13, null, contentValues) == -1) {
                                    zzavVarZzj4.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", zzgt.zzl(str10));
                                } else {
                                    this.zza = 0L;
                                }
                                zzj().zzc();
                                zzj().zzd();
                                zzaK();
                                zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                return;
                            }
                            if (jIntValue % 1000 == 1) {
                                zzaV().zzb().zzc("Data loss. Too many public events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zza));
                            }
                            zzt().zzN(this.zzK, str2, 16, "_ev", zzbgVar2.zza, 0);
                            zzj().zzc();
                        }
                    } else {
                        upperCase = strZzd.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            strConcat = "_ltv_".concat(upperCase);
                            zzpmVarZzm = zzj().zzm(str14, strConcat);
                            if (zzpmVarZzm != null) {
                                obj = zzpmVarZzm.zze;
                                if (obj instanceof Long) {
                                    zzpmVar = new zzpm(str14, zzbgVarZzb.zzc, strConcat, zzaZ().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                                    str14 = str14;
                                } else {
                                    zzavVarZzj = zzj();
                                    int iZzm = zzd().zzm(str14, zzfx.zzT) - 1;
                                    Preconditions.checkNotEmpty(str14);
                                    zzavVarZzj.zzg();
                                    zzavVarZzj.zzay();
                                    try {
                                        zzavVarZzj.zze().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str14, str14, String.valueOf(iZzm)});
                                    } catch (SQLiteException e11) {
                                        zzavVarZzj.zzu.zzaV().zzb().zzc("Error pruning currencies. appId", zzgt.zzl(str14), e11);
                                    }
                                    zzpmVar = new zzpm(str14, zzbgVarZzb.zzc, strConcat, zzaZ().currentTimeMillis(), Long.valueOf(jLongValue));
                                    str14 = str14;
                                }
                                zzpmVar2 = zzpmVar;
                                if (!zzj().zzl(zzpmVar2)) {
                                    zzaV().zzb().zzd("Too many unique user properties are set. Ignoring user property. appId", zzgt.zzl(str14), this.zzn.zzl().zzc(zzpmVar2.zzc), zzpmVar2.zze);
                                    zzt().zzN(this.zzK, str14, 9, null, null, 0);
                                }
                            } else {
                                zzavVarZzj = zzj();
                                int iZzm2 = zzd().zzm(str14, zzfx.zzT) - 1;
                                Preconditions.checkNotEmpty(str14);
                                zzavVarZzj.zzg();
                                zzavVarZzj.zzay();
                                zzavVarZzj.zze().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str14, str14, String.valueOf(iZzm2)});
                                zzpmVar = new zzpm(str14, zzbgVarZzb.zzc, strConcat, zzaZ().currentTimeMillis(), Long.valueOf(jLongValue));
                                str14 = str14;
                                zzpmVar2 = zzpmVar;
                                if (!zzj().zzl(zzpmVar2)) {
                                    zzaV().zzb().zzd("Too many unique user properties are set. Ignoring user property. appId", zzgt.zzl(str14), this.zzn.zzl().zzc(zzpmVar2.zzc), zzpmVar2.zze);
                                    zzt().zzN(this.zzK, str14, 9, null, null, 0);
                                }
                            }
                        } else {
                            zzbgVarZzb = zzbgVarZzb;
                        }
                        str = zzbgVarZzb.zza;
                        zZzh = zzpo.zzh(str);
                        zEquals = "_err".equals(str);
                        zzt();
                        zzbeVar2 = zzbgVarZzb.zzb;
                        if (zzbeVar2 == null) {
                            length = 0;
                        } else {
                            zzbdVar = new zzbd(zzbeVar2);
                            length = 0;
                            while (zzbdVar.hasNext()) {
                                objZza = zzbeVar2.zza(zzbdVar.next());
                                if (objZza instanceof Parcelable[]) {
                                    length += (long) ((Parcelable[]) objZza).length;
                                }
                            }
                        }
                        str2 = str14;
                        zzbgVar2 = zzbgVarZzb;
                        zzarVarZzx = zzj().zzx(zzC(), str2, length + 1, true, zZzh, false, zEquals, false, false, false);
                        long j17 = zzarVarZzx.zzb;
                        zzd();
                        jZzH = j17 - zzal.zzH();
                        if (jZzH > 0) {
                            if (jZzH % 1000 == 1) {
                                zzaV().zzb().zzc("Data loss. Too many events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzb));
                            }
                            zzj().zzc();
                        } else {
                            if (zZzh) {
                                if (zEquals) {
                                    j11 = 1;
                                    r11 = 0;
                                    jMax = zzarVarZzx.zzd - ((long) Math.max(0, Math.min(1000000, zzd().zzm(zzrVar.zza, zzfx.zzl))));
                                    if (jMax > 0) {
                                        if (jMax == 1) {
                                            zzaV().zzb().zzc("Too many error events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzd));
                                        }
                                        zzj().zzc();
                                    }
                                } else {
                                    j11 = 1;
                                    r11 = 0;
                                }
                                bundleZzf = zzbeVar2.zzf();
                                zzpo zzpoVarZzt5 = zzt();
                                String str112 = zzbgVar2.zzc;
                                zzpoVarZzt5.zzM(bundleZzf, "_o", str112);
                                if (zzt().zzaa(str2, zzrVar.zzB)) {
                                    zzpo zzpoVarZzt6 = zzt();
                                    Long lValueOf3 = Long.valueOf(j11);
                                    zzpoVarZzt6.zzM(bundleZzf, "_dbg", lValueOf3);
                                    zzt().zzM(bundleZzf, "_r", lValueOf3);
                                }
                                if ("_s".equals(str)) {
                                    obj3 = zzpmVarZzm2.zze;
                                    if (obj3 instanceof Long) {
                                        zzt().zzM(bundleZzf, "_sno", obj3);
                                    }
                                }
                                if (zzd().zzp(null, zzfx.zzaX)) {
                                    obj2 = bundleZzf.get("value");
                                    if (obj2 instanceof String) {
                                        double d13 = Double.parseDouble((String) obj2);
                                        bundleZzf.remove("value");
                                        bundleZzf.putDouble("value", d13);
                                    }
                                }
                                zzavVarZzj2 = zzj();
                                Preconditions.checkNotEmpty(str2);
                                zzavVarZzj2.zzg();
                                zzavVarZzj2.zzay();
                                jDelete = zzavVarZzj2.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str2, String.valueOf(Math.max((int) r11, Math.min(1000000, zzavVarZzj2.zzu.zzc().zzm(str2, zzfx.zzp))))});
                                if (jDelete > 0) {
                                    zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgt.zzl(str2), Long.valueOf(jDelete));
                                }
                                zzibVar = this.zzn;
                                zzbbVar = new zzbb(zzibVar, zzbgVar2.zzc, str2, zzbgVar2.zza, zzbgVar2.zzd, 0L, bundleZzf);
                                zzav zzavVarZzj7 = zzj();
                                str3 = zzbbVar.zzb;
                                zzbcVarZzf = zzavVarZzj7.zzf(str2, str3);
                                if (zzbcVarZzf != null) {
                                    if (zzj().zzU(str2) >= zzd().zzh(str2)) {
                                    }
                                    zzbcVar = new zzbc(str2, str3, 0L, 0L, 0L, zzbbVar.zzd, 0L, null, null, null, null);
                                    zzbbVar2 = zzbbVar;
                                } else {
                                    zzbb zzbbVarZza3 = zzbbVar.zza(zzibVar, zzbcVarZzf.zzf);
                                    zzbc zzbcVarZza3 = zzbcVarZzf.zza(zzbbVarZza3.zzd);
                                    zzbbVar2 = zzbbVarZza3;
                                    zzbcVar = zzbcVarZza3;
                                }
                                zzj().zzh(zzbcVar);
                                zzaW().zzg();
                                zzu();
                                Preconditions.checkNotNull(zzbbVar2);
                                Preconditions.checkNotNull(zzrVar);
                                String str113 = zzbbVar2.zza;
                                Preconditions.checkNotEmpty(str113);
                                str4 = zzrVar.zza;
                                Preconditions.checkArgument(str113.equals(str4));
                                zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                                zzicVarZzaE.zza(1);
                                zzicVarZzaE.zzC("android");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzicVarZzaE.zzL(str4);
                                }
                                str5 = zzrVar.zzd;
                                if (!TextUtils.isEmpty(str5)) {
                                    zzicVarZzaE.zzJ(str5);
                                }
                                str6 = zzrVar.zzc;
                                if (!TextUtils.isEmpty(str6)) {
                                    zzicVarZzaE.zzM(str6);
                                }
                                str7 = zzrVar.zzu;
                                if (!TextUtils.isEmpty(str7)) {
                                    zzicVarZzaE.zzau(str7);
                                }
                                j12 = zzrVar.zzj;
                                if (j12 != -2147483648L) {
                                    zzicVarZzaE.zzaj((int) j12);
                                }
                                zzicVarZzaE.zzN(zzrVar.zze);
                                str8 = zzrVar.zzb;
                                if (!TextUtils.isEmpty(str8)) {
                                    zzicVarZzaE.zzad(str8);
                                }
                                zzjkVarZzs = zzB((String) Preconditions.checkNotNull(str4)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                zzicVarZzaE.zzat(zzjkVarZzs.zzk());
                                zzql.zza();
                                if (zzd().zzp(str4, zzfx.zzaP)) {
                                    zzicVarZzaE.zzaH(zzrVar.zzz);
                                    j14 = zzrVar.zzA;
                                    if (!zzjkVarZzs.zzo(zzjj.AD_STORAGE)) {
                                        j14 = (j14 & (-2)) | 32;
                                    }
                                    if (j14 == j11) {
                                        z11 = 1;
                                    } else {
                                        z11 = r11;
                                    }
                                    zzicVarZzaE.zzaz(z11);
                                    if (j14 == 0) {
                                        com.google.android.gms.internal.measurement.zzhd zzhdVarZzh3 = com.google.android.gms.internal.measurement.zzhe.zzh();
                                        if ((j14 & j11) != 0) {
                                            z12 = 1;
                                        } else {
                                            z12 = r11;
                                        }
                                        zzhdVarZzh3.zza(z12);
                                        if ((j14 & 2) != 0) {
                                            z13 = 1;
                                        } else {
                                            z13 = r11;
                                        }
                                        zzhdVarZzh3.zzb(z13);
                                        if ((j14 & 4) != 0) {
                                            z14 = 1;
                                        } else {
                                            z14 = r11;
                                        }
                                        zzhdVarZzh3.zzc(z14);
                                        if ((j14 & 8) != 0) {
                                            z15 = 1;
                                        } else {
                                            z15 = r11;
                                        }
                                        zzhdVarZzh3.zzd(z15);
                                        if ((j14 & 16) != 0) {
                                            z16 = 1;
                                        } else {
                                            z16 = r11;
                                        }
                                        zzhdVarZzh3.zze(z16);
                                        if ((32 & j14) != 0) {
                                            z17 = 1;
                                        } else {
                                            z17 = r11;
                                        }
                                        zzhdVarZzh3.zzf(z17);
                                        if ((j14 & 64) != 0) {
                                            z18 = 1;
                                        } else {
                                            z18 = r11;
                                        }
                                        zzhdVarZzh3.zzg(z18);
                                        zzicVarZzaE.zzaI((com.google.android.gms.internal.measurement.zzhe) zzhdVarZzh3.zzbc());
                                    }
                                }
                                j13 = zzrVar.zzf;
                                if (j13 != 0) {
                                    zzicVarZzaE.zzY(j13);
                                }
                                zzicVarZzaE.zzar(zzrVar.zzq);
                                zzpj zzpjVarZzp3 = zzp();
                                zzjqVarZza = com.google.android.gms.internal.measurement.zzjq.zza(zzpjVarZzp3.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement"), zzfu.zza);
                                if (zzjqVarZza == null) {
                                    mapZzb = Collections.EMPTY_MAP;
                                } else {
                                    mapZzb = zzjqVarZza.zzb();
                                }
                                if (mapZzb == null) {
                                    arrayList = null;
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    zzicVarZzaE.zzaq(arrayList);
                                }
                                if (zzd().zzp(null, zzfx.zzbb)) {
                                    zzicVarZzaE.zzaP("");
                                }
                                str9 = zzrVar.zza;
                                zzjkVarZzs2 = zzB((String) Preconditions.checkNotNull(str9)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                zzjjVar = zzjj.AD_STORAGE;
                                if (zzjkVarZzs2.zzo(zzjjVar)) {
                                    str13 = "raw_events";
                                    zzjjVar = zzjjVar;
                                } else {
                                    str13 = "raw_events";
                                    zzjjVar = zzjjVar;
                                }
                                zzibVar2 = this.zzn;
                                zzibVar2.zzu().zzw();
                                zzicVarZzaE.zzF(Build.MODEL);
                                zzibVar2.zzu().zzw();
                                zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                                zzicVarZzaE.zzI((int) zzibVar2.zzu().zzb());
                                zzicVarZzaE.zzH(zzibVar2.zzu().zzc());
                                zzicVarZzaE.zzay(zzrVar.zzw);
                                if (zzibVar2.zzB()) {
                                    zzicVarZzaE.zzK();
                                    if (!TextUtils.isEmpty(null)) {
                                        zzicVarZzaE.zzam(null);
                                    }
                                }
                                zzhVarZzu = zzj().zzu(str9);
                                if (zzhVarZzu == null) {
                                    zzhVarZzu = new zzh(zzibVar2, str9);
                                    zzhVarZzu.zze(zzK(zzjkVarZzs2));
                                    zzhVarZzu.zzm(zzrVar.zzk);
                                    zzhVarZzu.zzg(zzrVar.zzb);
                                    if (zzjkVarZzs2.zzo(zzjjVar)) {
                                        zzhVarZzu.zzk(this.zzk.zzf(str9, zzrVar.zzn));
                                    }
                                    zzhVarZzu.zzF(0L);
                                    zzhVarZzu.zzo(0L);
                                    zzhVarZzu.zzq(0L);
                                    zzhVarZzu.zzs(zzrVar.zzc);
                                    zzhVarZzu.zzu(zzrVar.zzj);
                                    zzhVarZzu.zzw(zzrVar.zzd);
                                    zzhVarZzu.zzy(zzrVar.zze);
                                    zzhVarZzu.zzA(zzrVar.zzf);
                                    zzhVarZzu.zzE(zzrVar.zzh);
                                    zzhVarZzu.zzC(zzrVar.zzq);
                                    i11 = 0;
                                    zzj().zzv(zzhVarZzu, false, false);
                                } else {
                                    i11 = 0;
                                }
                                if (zzjkVarZzs2.zzo(zzjj.ANALYTICS_STORAGE)) {
                                    zzicVarZzaE.zzW((String) Preconditions.checkNotNull(zzhVarZzu.zzd()));
                                }
                                if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                    zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                                }
                                listZzn = zzj().zzn(str9);
                                while (i12 < listZzn.size()) {
                                    com.google.android.gms.internal.measurement.zzit zzitVarZzm3 = com.google.android.gms.internal.measurement.zziu.zzm();
                                    zzitVarZzm3.zzb(((zzpm) listZzn.get(i12)).zzc);
                                    zzitVarZzm3.zza(((zzpm) listZzn.get(i12)).zzd);
                                    zzp().zzc(zzitVarZzm3, ((zzpm) listZzn.get(i12)).zze);
                                    zzicVarZzaE.zzp(zzitVarZzm3);
                                    if (!"_sid".equals(((zzpm) listZzn.get(i12)).zzc)) {
                                    }
                                }
                                zzavVarZzj3 = zzj();
                                com.google.android.gms.internal.measurement.zzid zzidVar3 = (com.google.android.gms.internal.measurement.zzid) zzicVarZzaE.zzbc();
                                zzavVarZzj3.zzg();
                                zzavVarZzj3.zzay();
                                Preconditions.checkNotNull(zzidVar3);
                                Preconditions.checkNotEmpty(zzidVar3.zzA());
                                byte[] bArrZzcc5 = zzidVar3.zzcc();
                                long jZzt3 = zzavVarZzj3.zzg.zzp().zzt(bArrZzcc5);
                                ContentValues contentValues4 = new ContentValues();
                                String str24 = str11;
                                contentValues4.put(str24, zzidVar3.zzA());
                                contentValues4.put("metadata_fingerprint", Long.valueOf(jZzt3));
                                contentValues4.put("metadata", bArrZzcc5);
                                zzavVarZzj3.zze().insertWithOnConflict("raw_events_metadata", null, contentValues4, 4);
                                zzavVarZzj4 = zzj();
                                zzbdVar2 = new zzbd(zzbbVar2.zzf);
                                while (true) {
                                    if (zzbdVar2.hasNext()) {
                                        zzhs zzhsVarZzh4 = zzh();
                                        String str25 = zzbbVar2.zza;
                                        zZzk = zzhsVarZzh4.zzk(str25, zzbbVar2.zzb);
                                        zzar zzarVarZzw3 = zzj().zzw(zzC(), str25, false, false, false, false, false, false, false);
                                        if (zZzk) {
                                        }
                                        i13 = i11;
                                        break;
                                    }
                                    if ("_r".equals(zzbdVar2.next())) {
                                    }
                                    i13 = 1;
                                    break;
                                }
                                zzavVarZzj4.zzg();
                                zzavVarZzj4.zzay();
                                Preconditions.checkNotNull(zzbbVar2);
                                str10 = zzbbVar2.zza;
                                Preconditions.checkNotEmpty(str10);
                                byte[] bArrZzcc6 = zzavVarZzj4.zzg.zzp().zzh(zzbbVar2).zzcc();
                                contentValues = new ContentValues();
                                contentValues.put(str24, str10);
                                contentValues.put("name", zzbbVar2.zzb);
                                contentValues.put("timestamp", Long.valueOf(zzbbVar2.zzd));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jZzt3));
                                contentValues.put("data", bArrZzcc6);
                                contentValues.put(C33590cg.f69439i, Integer.valueOf(i13));
                                if (zzavVarZzj4.zze().insert(str13, null, contentValues) == -1) {
                                    zzavVarZzj4.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", zzgt.zzl(str10));
                                } else {
                                    this.zza = 0L;
                                }
                                zzj().zzc();
                                zzj().zzd();
                                zzaK();
                                zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                return;
                            }
                            long j18 = zzarVarZzx.zza;
                            zzd();
                            jIntValue = j18 - ((long) ((Integer) zzfx.zzm.zzb(null)).intValue());
                            if (jIntValue <= 0) {
                                if (jIntValue % 1000 == 1) {
                                    zzaV().zzb().zzc("Data loss. Too many public events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zza));
                                }
                                zzt().zzN(this.zzK, str2, 16, "_ev", zzbgVar2.zza, 0);
                                zzj().zzc();
                            } else {
                                if (zEquals) {
                                    j11 = 1;
                                    r11 = 0;
                                    jMax = zzarVarZzx.zzd - ((long) Math.max(0, Math.min(1000000, zzd().zzm(zzrVar.zza, zzfx.zzl))));
                                    if (jMax > 0) {
                                        if (jMax == 1) {
                                            zzaV().zzb().zzc("Too many error events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzd));
                                        }
                                        zzj().zzc();
                                    }
                                } else {
                                    j11 = 1;
                                    r11 = 0;
                                }
                                bundleZzf = zzbeVar2.zzf();
                                zzpo zzpoVarZzt7 = zzt();
                                String str114 = zzbgVar2.zzc;
                                zzpoVarZzt7.zzM(bundleZzf, "_o", str114);
                                if (zzt().zzaa(str2, zzrVar.zzB)) {
                                    zzpo zzpoVarZzt8 = zzt();
                                    Long lValueOf4 = Long.valueOf(j11);
                                    zzpoVarZzt8.zzM(bundleZzf, "_dbg", lValueOf4);
                                    zzt().zzM(bundleZzf, "_r", lValueOf4);
                                }
                                if ("_s".equals(str) && (zzpmVarZzm2 = zzj().zzm(zzrVar.zza, "_sno")) != null) {
                                    obj3 = zzpmVarZzm2.zze;
                                    if (obj3 instanceof Long) {
                                        zzt().zzM(bundleZzf, "_sno", obj3);
                                    }
                                }
                                if (zzd().zzp(null, zzfx.zzaX) && Objects.equals(str114, "am") && Objects.equals(str, "_ai")) {
                                    obj2 = bundleZzf.get("value");
                                    if (obj2 instanceof String) {
                                        try {
                                            double d14 = Double.parseDouble((String) obj2);
                                            bundleZzf.remove("value");
                                            bundleZzf.putDouble("value", d14);
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                }
                                zzavVarZzj2 = zzj();
                                Preconditions.checkNotEmpty(str2);
                                zzavVarZzj2.zzg();
                                zzavVarZzj2.zzay();
                                try {
                                    jDelete = zzavVarZzj2.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str2, String.valueOf(Math.max((int) r11, Math.min(1000000, zzavVarZzj2.zzu.zzc().zzm(str2, zzfx.zzp))))});
                                } catch (SQLiteException e12) {
                                    zzavVarZzj2.zzu.zzaV().zzb().zzc("Error deleting over the limit events. appId", zzgt.zzl(str2), e12);
                                    jDelete = 0;
                                }
                                if (jDelete > 0) {
                                    zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgt.zzl(str2), Long.valueOf(jDelete));
                                }
                                zzibVar = this.zzn;
                                zzbbVar = new zzbb(zzibVar, zzbgVar2.zzc, str2, zzbgVar2.zza, zzbgVar2.zzd, 0L, bundleZzf);
                                zzav zzavVarZzj8 = zzj();
                                str3 = zzbbVar.zzb;
                                zzbcVarZzf = zzavVarZzj8.zzf(str2, str3);
                                if (zzbcVarZzf != null) {
                                    zzbb zzbbVarZza4 = zzbbVar.zza(zzibVar, zzbcVarZzf.zzf);
                                    zzbc zzbcVarZza4 = zzbcVarZzf.zza(zzbbVarZza4.zzd);
                                    zzbbVar2 = zzbbVarZza4;
                                    zzbcVar = zzbcVarZza4;
                                } else if (zzj().zzU(str2) >= zzd().zzh(str2) || !zZzh) {
                                    zzbcVar = new zzbc(str2, str3, 0L, 0L, 0L, zzbbVar.zzd, 0L, null, null, null, null);
                                    zzbbVar2 = zzbbVar;
                                } else {
                                    zzaV().zzb().zzd("Too many event names used, ignoring event. appId, name, supported count", zzgt.zzl(str2), zzibVar.zzl().zza(str3), Integer.valueOf(zzd().zzh(str2)));
                                    zzt().zzN(this.zzK, str2, 8, null, null, 0);
                                }
                                zzj().zzh(zzbcVar);
                                zzaW().zzg();
                                zzu();
                                Preconditions.checkNotNull(zzbbVar2);
                                Preconditions.checkNotNull(zzrVar);
                                String str115 = zzbbVar2.zza;
                                Preconditions.checkNotEmpty(str115);
                                str4 = zzrVar.zza;
                                Preconditions.checkArgument(str115.equals(str4));
                                zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                                zzicVarZzaE.zza(1);
                                zzicVarZzaE.zzC("android");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzicVarZzaE.zzL(str4);
                                }
                                str5 = zzrVar.zzd;
                                if (!TextUtils.isEmpty(str5)) {
                                    zzicVarZzaE.zzJ(str5);
                                }
                                str6 = zzrVar.zzc;
                                if (!TextUtils.isEmpty(str6)) {
                                    zzicVarZzaE.zzM(str6);
                                }
                                str7 = zzrVar.zzu;
                                if (!TextUtils.isEmpty(str7)) {
                                    zzicVarZzaE.zzau(str7);
                                }
                                j12 = zzrVar.zzj;
                                if (j12 != -2147483648L) {
                                    zzicVarZzaE.zzaj((int) j12);
                                }
                                zzicVarZzaE.zzN(zzrVar.zze);
                                str8 = zzrVar.zzb;
                                if (!TextUtils.isEmpty(str8)) {
                                    zzicVarZzaE.zzad(str8);
                                }
                                zzjkVarZzs = zzB((String) Preconditions.checkNotNull(str4)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                zzicVarZzaE.zzat(zzjkVarZzs.zzk());
                                zzql.zza();
                                if (zzd().zzp(str4, zzfx.zzaP) && zzt().zzX(str4)) {
                                    zzicVarZzaE.zzaH(zzrVar.zzz);
                                    j14 = zzrVar.zzA;
                                    if (!zzjkVarZzs.zzo(zzjj.AD_STORAGE) && j14 != 0) {
                                        j14 = (j14 & (-2)) | 32;
                                    }
                                    if (j14 == j11) {
                                        z11 = 1;
                                    } else {
                                        z11 = r11;
                                    }
                                    zzicVarZzaE.zzaz(z11);
                                    if (j14 == 0) {
                                        com.google.android.gms.internal.measurement.zzhd zzhdVarZzh4 = com.google.android.gms.internal.measurement.zzhe.zzh();
                                        if ((j14 & j11) != 0) {
                                            z12 = 1;
                                        } else {
                                            z12 = r11;
                                        }
                                        zzhdVarZzh4.zza(z12);
                                        if ((j14 & 2) != 0) {
                                            z13 = 1;
                                        } else {
                                            z13 = r11;
                                        }
                                        zzhdVarZzh4.zzb(z13);
                                        if ((j14 & 4) != 0) {
                                            z14 = 1;
                                        } else {
                                            z14 = r11;
                                        }
                                        zzhdVarZzh4.zzc(z14);
                                        if ((j14 & 8) != 0) {
                                            z15 = 1;
                                        } else {
                                            z15 = r11;
                                        }
                                        zzhdVarZzh4.zzd(z15);
                                        if ((j14 & 16) != 0) {
                                            z16 = 1;
                                        } else {
                                            z16 = r11;
                                        }
                                        zzhdVarZzh4.zze(z16);
                                        if ((32 & j14) != 0) {
                                            z17 = 1;
                                        } else {
                                            z17 = r11;
                                        }
                                        zzhdVarZzh4.zzf(z17);
                                        if ((j14 & 64) != 0) {
                                            z18 = 1;
                                        } else {
                                            z18 = r11;
                                        }
                                        zzhdVarZzh4.zzg(z18);
                                        zzicVarZzaE.zzaI((com.google.android.gms.internal.measurement.zzhe) zzhdVarZzh4.zzbc());
                                    }
                                }
                                j13 = zzrVar.zzf;
                                if (j13 != 0) {
                                    zzicVarZzaE.zzY(j13);
                                }
                                zzicVarZzaE.zzar(zzrVar.zzq);
                                zzpj zzpjVarZzp4 = zzp();
                                zzjqVarZza = com.google.android.gms.internal.measurement.zzjq.zza(zzpjVarZzp4.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement"), zzfu.zza);
                                if (zzjqVarZza == null) {
                                    mapZzb = Collections.EMPTY_MAP;
                                } else {
                                    mapZzb = zzjqVarZza.zzb();
                                }
                                if (mapZzb == null && !mapZzb.isEmpty()) {
                                    arrayList = new ArrayList();
                                    int iIntValue = ((Integer) zzfx.zzaf.zzb(null)).intValue();
                                    for (Map.Entry entry : mapZzb.entrySet()) {
                                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                int i14 = Integer.parseInt((String) entry.getValue());
                                                if (i14 != 0) {
                                                    arrayList.add(Integer.valueOf(i14));
                                                    if (arrayList.size() >= iIntValue) {
                                                        zzpjVarZzp4.zzu.zzaV().zze().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (NumberFormatException e13) {
                                                zzpjVarZzp4.zzu.zzaV().zze().zzb("Experiment ID NumberFormatException", e13);
                                            }
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        arrayList = null;
                                    }
                                    zzj().zzd();
                                    throw th;
                                }
                                arrayList = null;
                                if (arrayList != null) {
                                    zzicVarZzaE.zzaq(arrayList);
                                }
                                if (zzd().zzp(null, zzfx.zzbb)) {
                                    zzicVarZzaE.zzaP("");
                                }
                                str9 = zzrVar.zza;
                                zzjkVarZzs2 = zzB((String) Preconditions.checkNotNull(str9)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                zzjjVar = zzjj.AD_STORAGE;
                                if (zzjkVarZzs2.zzo(zzjjVar) || !zzrVar.zzn) {
                                    str13 = "raw_events";
                                    zzjjVar = zzjjVar;
                                } else {
                                    Pair pairZzc = this.zzk.zzc(str9, zzjkVarZzs2);
                                    if (TextUtils.isEmpty((CharSequence) pairZzc.first)) {
                                        str13 = "raw_events";
                                        zzjjVar = zzjjVar;
                                    } else {
                                        zzicVarZzaE.zzQ((String) pairZzc.first);
                                        Object obj4 = pairZzc.second;
                                        if (obj4 != null) {
                                            zzicVarZzaE.zzT(((Boolean) obj4).booleanValue());
                                        }
                                        String str26 = str12;
                                        if (zzbbVar2.zzb.equals(str26) || ((String) pairZzc.first).equals("00000000-0000-0000-0000-000000000000") || (zzhVarZzu2 = zzj().zzu(str9)) == null || !zzhVarZzu2.zzaq()) {
                                            str13 = "raw_events";
                                            zzjjVar = zzjjVar;
                                        } else {
                                            zzR(str9, r11, null, null);
                                            Bundle bundle2 = new Bundle();
                                            Long lZzas = zzhVarZzu2.zzas();
                                            if (lZzas != null) {
                                                bundle2.putLong("_pfo", Math.max(0L, lZzas.longValue()));
                                            }
                                            Long lZzau = zzhVarZzu2.zzau();
                                            if (lZzau != null) {
                                                bundle2.putLong("_uwa", lZzau.longValue());
                                            }
                                            bundle2.putLong("_r", j11);
                                            this.zzK.zza(str9, str26, bundle2);
                                        }
                                    }
                                }
                                zzibVar2 = this.zzn;
                                zzibVar2.zzu().zzw();
                                zzicVarZzaE.zzF(Build.MODEL);
                                zzibVar2.zzu().zzw();
                                zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                                zzicVarZzaE.zzI((int) zzibVar2.zzu().zzb());
                                zzicVarZzaE.zzH(zzibVar2.zzu().zzc());
                                zzicVarZzaE.zzay(zzrVar.zzw);
                                if (zzibVar2.zzB()) {
                                    zzicVarZzaE.zzK();
                                    if (!TextUtils.isEmpty(null)) {
                                        zzicVarZzaE.zzam(null);
                                    }
                                }
                                zzhVarZzu = zzj().zzu(str9);
                                if (zzhVarZzu == null) {
                                    zzhVarZzu = new zzh(zzibVar2, str9);
                                    zzhVarZzu.zze(zzK(zzjkVarZzs2));
                                    zzhVarZzu.zzm(zzrVar.zzk);
                                    zzhVarZzu.zzg(zzrVar.zzb);
                                    if (zzjkVarZzs2.zzo(zzjjVar)) {
                                        zzhVarZzu.zzk(this.zzk.zzf(str9, zzrVar.zzn));
                                    }
                                    zzhVarZzu.zzF(0L);
                                    zzhVarZzu.zzo(0L);
                                    zzhVarZzu.zzq(0L);
                                    zzhVarZzu.zzs(zzrVar.zzc);
                                    zzhVarZzu.zzu(zzrVar.zzj);
                                    zzhVarZzu.zzw(zzrVar.zzd);
                                    zzhVarZzu.zzy(zzrVar.zze);
                                    zzhVarZzu.zzA(zzrVar.zzf);
                                    zzhVarZzu.zzE(zzrVar.zzh);
                                    zzhVarZzu.zzC(zzrVar.zzq);
                                    i11 = 0;
                                    zzj().zzv(zzhVarZzu, false, false);
                                } else {
                                    i11 = 0;
                                }
                                if (zzjkVarZzs2.zzo(zzjj.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzhVarZzu.zzd())) {
                                    zzicVarZzaE.zzW((String) Preconditions.checkNotNull(zzhVarZzu.zzd()));
                                }
                                if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                    zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                                }
                                listZzn = zzj().zzn(str9);
                                while (i12 < listZzn.size()) {
                                    com.google.android.gms.internal.measurement.zzit zzitVarZzm4 = com.google.android.gms.internal.measurement.zziu.zzm();
                                    zzitVarZzm4.zzb(((zzpm) listZzn.get(i12)).zzc);
                                    zzitVarZzm4.zza(((zzpm) listZzn.get(i12)).zzd);
                                    zzp().zzc(zzitVarZzm4, ((zzpm) listZzn.get(i12)).zze);
                                    zzicVarZzaE.zzp(zzitVarZzm4);
                                    if (!"_sid".equals(((zzpm) listZzn.get(i12)).zzc) && zzhVarZzu.zzam() != 0 && zzp().zzu(zzrVar.zzu) != zzhVarZzu.zzam()) {
                                        zzicVarZzaE.zzav();
                                    }
                                }
                                try {
                                    zzavVarZzj3 = zzj();
                                    com.google.android.gms.internal.measurement.zzid zzidVar4 = (com.google.android.gms.internal.measurement.zzid) zzicVarZzaE.zzbc();
                                    zzavVarZzj3.zzg();
                                    zzavVarZzj3.zzay();
                                    Preconditions.checkNotNull(zzidVar4);
                                    Preconditions.checkNotEmpty(zzidVar4.zzA());
                                    byte[] bArrZzcc7 = zzidVar4.zzcc();
                                    long jZzt4 = zzavVarZzj3.zzg.zzp().zzt(bArrZzcc7);
                                    ContentValues contentValues5 = new ContentValues();
                                    String str27 = str11;
                                    contentValues5.put(str27, zzidVar4.zzA());
                                    contentValues5.put("metadata_fingerprint", Long.valueOf(jZzt4));
                                    contentValues5.put("metadata", bArrZzcc7);
                                    try {
                                        zzavVarZzj3.zze().insertWithOnConflict("raw_events_metadata", null, contentValues5, 4);
                                        zzavVarZzj4 = zzj();
                                        zzbdVar2 = new zzbd(zzbbVar2.zzf);
                                        while (true) {
                                            if (zzbdVar2.hasNext()) {
                                                zzhs zzhsVarZzh5 = zzh();
                                                String str28 = zzbbVar2.zza;
                                                zZzk = zzhsVarZzh5.zzk(str28, zzbbVar2.zzb);
                                                zzar zzarVarZzw4 = zzj().zzw(zzC(), str28, false, false, false, false, false, false, false);
                                                if (zZzk || zzarVarZzw4.zze >= zzd().zzm(str28, zzfx.zzo)) {
                                                    i13 = i11;
                                                    break;
                                                }
                                            } else if ("_r".equals(zzbdVar2.next())) {
                                            }
                                            i13 = 1;
                                            break;
                                        }
                                        zzavVarZzj4.zzg();
                                        zzavVarZzj4.zzay();
                                        Preconditions.checkNotNull(zzbbVar2);
                                        str10 = zzbbVar2.zza;
                                        Preconditions.checkNotEmpty(str10);
                                        byte[] bArrZzcc8 = zzavVarZzj4.zzg.zzp().zzh(zzbbVar2).zzcc();
                                        contentValues = new ContentValues();
                                        contentValues.put(str27, str10);
                                        contentValues.put("name", zzbbVar2.zzb);
                                        contentValues.put("timestamp", Long.valueOf(zzbbVar2.zzd));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(jZzt4));
                                        contentValues.put("data", bArrZzcc8);
                                        contentValues.put(C33590cg.f69439i, Integer.valueOf(i13));
                                        try {
                                            if (zzavVarZzj4.zze().insert(str13, null, contentValues) == -1) {
                                                zzavVarZzj4.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", zzgt.zzl(str10));
                                            } else {
                                                this.zza = 0L;
                                            }
                                        } catch (SQLiteException e14) {
                                            zzavVarZzj4.zzu.zzaV().zzb().zzc("Error storing raw event. appId", zzgt.zzl(zzbbVar2.zza), e14);
                                        }
                                        zzj().zzc();
                                        zzj().zzd();
                                        zzaK();
                                        zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                        return;
                                    } catch (SQLiteException e15) {
                                        zzavVarZzj3.zzu.zzaV().zzb().zzc("Error storing raw event metadata. appId", zzgt.zzl(zzidVar4.zzA()), e15);
                                        throw e15;
                                    }
                                } catch (IOException e16) {
                                    zzaV().zzb().zzc("Data loss. Failed to insert raw event metadata. appId", zzgt.zzl(zzicVarZzaE.zzK()), e16);
                                }
                            }
                        }
                    }
                } else {
                    if (z19) {
                        z19 = true;
                        zzbeVar = zzbgVarZzb.zzb;
                        strZzd = zzbeVar.zzd(FirebaseAnalytics.Param.CURRENCY);
                        if (z19) {
                            dDoubleValue = zzbeVar.zzc("value").doubleValue() * 1000000.0d;
                            if (dDoubleValue == 0.0d) {
                                dDoubleValue = zzbeVar.zzb("value").longValue() * 1000000.0d;
                            }
                            if (dDoubleValue <= 9.223372036854776E18d) {
                            }
                            zzaV().zze().zzc("Data lost. Currency value is too big. appId", zzgt.zzl(str14), Double.valueOf(dDoubleValue));
                            zzj().zzc();
                        } else {
                            str11 = "app_id";
                            str12 = "_fx";
                            jLongValue = zzbeVar.zzb("value").longValue();
                        }
                        if (TextUtils.isEmpty(strZzd)) {
                            upperCase = strZzd.toUpperCase(Locale.US);
                            if (upperCase.matches("[A-Z]{3}")) {
                                strConcat = "_ltv_".concat(upperCase);
                                zzpmVarZzm = zzj().zzm(str14, strConcat);
                                if (zzpmVarZzm != null) {
                                    obj = zzpmVarZzm.zze;
                                    if (obj instanceof Long) {
                                        zzavVarZzj = zzj();
                                        int iZzm3 = zzd().zzm(str14, zzfx.zzT) - 1;
                                        Preconditions.checkNotEmpty(str14);
                                        zzavVarZzj.zzg();
                                        zzavVarZzj.zzay();
                                        zzavVarZzj.zze().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str14, str14, String.valueOf(iZzm3)});
                                        zzpmVar = new zzpm(str14, zzbgVarZzb.zzc, strConcat, zzaZ().currentTimeMillis(), Long.valueOf(jLongValue));
                                        str14 = str14;
                                    } else {
                                        zzpmVar = new zzpm(str14, zzbgVarZzb.zzc, strConcat, zzaZ().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                                        str14 = str14;
                                    }
                                    zzpmVar2 = zzpmVar;
                                    if (!zzj().zzl(zzpmVar2)) {
                                        zzaV().zzb().zzd("Too many unique user properties are set. Ignoring user property. appId", zzgt.zzl(str14), this.zzn.zzl().zzc(zzpmVar2.zzc), zzpmVar2.zze);
                                        zzt().zzN(this.zzK, str14, 9, null, null, 0);
                                    }
                                } else {
                                    zzavVarZzj = zzj();
                                    int iZzm4 = zzd().zzm(str14, zzfx.zzT) - 1;
                                    Preconditions.checkNotEmpty(str14);
                                    zzavVarZzj.zzg();
                                    zzavVarZzj.zzay();
                                    zzavVarZzj.zze().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str14, str14, String.valueOf(iZzm4)});
                                    zzpmVar = new zzpm(str14, zzbgVarZzb.zzc, strConcat, zzaZ().currentTimeMillis(), Long.valueOf(jLongValue));
                                    str14 = str14;
                                    zzpmVar2 = zzpmVar;
                                    if (!zzj().zzl(zzpmVar2)) {
                                        zzaV().zzb().zzd("Too many unique user properties are set. Ignoring user property. appId", zzgt.zzl(str14), this.zzn.zzl().zzc(zzpmVar2.zzc), zzpmVar2.zze);
                                        zzt().zzN(this.zzK, str14, 9, null, null, 0);
                                    }
                                }
                            }
                            str = zzbgVarZzb.zza;
                            zZzh = zzpo.zzh(str);
                            zEquals = "_err".equals(str);
                            zzt();
                            zzbeVar2 = zzbgVarZzb.zzb;
                            if (zzbeVar2 == null) {
                                length = 0;
                            } else {
                                zzbdVar = new zzbd(zzbeVar2);
                                length = 0;
                                while (zzbdVar.hasNext()) {
                                    objZza = zzbeVar2.zza(zzbdVar.next());
                                    if (objZza instanceof Parcelable[]) {
                                        length += (long) ((Parcelable[]) objZza).length;
                                    }
                                }
                            }
                            str2 = str14;
                            zzbgVar2 = zzbgVarZzb;
                            zzarVarZzx = zzj().zzx(zzC(), str2, length + 1, true, zZzh, false, zEquals, false, false, false);
                            long j19 = zzarVarZzx.zzb;
                            zzd();
                            jZzH = j19 - zzal.zzH();
                            if (jZzH > 0) {
                                if (jZzH % 1000 == 1) {
                                    zzaV().zzb().zzc("Data loss. Too many events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzb));
                                }
                                zzj().zzc();
                            } else {
                                if (zZzh) {
                                    if (zEquals) {
                                        j11 = 1;
                                        r11 = 0;
                                        jMax = zzarVarZzx.zzd - ((long) Math.max(0, Math.min(1000000, zzd().zzm(zzrVar.zza, zzfx.zzl))));
                                        if (jMax > 0) {
                                            if (jMax == 1) {
                                                zzaV().zzb().zzc("Too many error events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzd));
                                            }
                                            zzj().zzc();
                                        }
                                    } else {
                                        j11 = 1;
                                        r11 = 0;
                                    }
                                    bundleZzf = zzbeVar2.zzf();
                                    zzpo zzpoVarZzt9 = zzt();
                                    String str116 = zzbgVar2.zzc;
                                    zzpoVarZzt9.zzM(bundleZzf, "_o", str116);
                                    if (zzt().zzaa(str2, zzrVar.zzB)) {
                                        zzpo zzpoVarZzt10 = zzt();
                                        Long lValueOf5 = Long.valueOf(j11);
                                        zzpoVarZzt10.zzM(bundleZzf, "_dbg", lValueOf5);
                                        zzt().zzM(bundleZzf, "_r", lValueOf5);
                                    }
                                    if ("_s".equals(str)) {
                                        obj3 = zzpmVarZzm2.zze;
                                        if (obj3 instanceof Long) {
                                            zzt().zzM(bundleZzf, "_sno", obj3);
                                        }
                                    }
                                    if (zzd().zzp(null, zzfx.zzaX)) {
                                        obj2 = bundleZzf.get("value");
                                        if (obj2 instanceof String) {
                                            double d15 = Double.parseDouble((String) obj2);
                                            bundleZzf.remove("value");
                                            bundleZzf.putDouble("value", d15);
                                        }
                                    }
                                    zzavVarZzj2 = zzj();
                                    Preconditions.checkNotEmpty(str2);
                                    zzavVarZzj2.zzg();
                                    zzavVarZzj2.zzay();
                                    jDelete = zzavVarZzj2.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str2, String.valueOf(Math.max((int) r11, Math.min(1000000, zzavVarZzj2.zzu.zzc().zzm(str2, zzfx.zzp))))});
                                    if (jDelete > 0) {
                                        zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgt.zzl(str2), Long.valueOf(jDelete));
                                    }
                                    zzibVar = this.zzn;
                                    zzbbVar = new zzbb(zzibVar, zzbgVar2.zzc, str2, zzbgVar2.zza, zzbgVar2.zzd, 0L, bundleZzf);
                                    zzav zzavVarZzj9 = zzj();
                                    str3 = zzbbVar.zzb;
                                    zzbcVarZzf = zzavVarZzj9.zzf(str2, str3);
                                    if (zzbcVarZzf != null) {
                                        if (zzj().zzU(str2) >= zzd().zzh(str2)) {
                                        }
                                        zzbcVar = new zzbc(str2, str3, 0L, 0L, 0L, zzbbVar.zzd, 0L, null, null, null, null);
                                        zzbbVar2 = zzbbVar;
                                    } else {
                                        zzbb zzbbVarZza5 = zzbbVar.zza(zzibVar, zzbcVarZzf.zzf);
                                        zzbc zzbcVarZza5 = zzbcVarZzf.zza(zzbbVarZza5.zzd);
                                        zzbbVar2 = zzbbVarZza5;
                                        zzbcVar = zzbcVarZza5;
                                    }
                                    zzj().zzh(zzbcVar);
                                    zzaW().zzg();
                                    zzu();
                                    Preconditions.checkNotNull(zzbbVar2);
                                    Preconditions.checkNotNull(zzrVar);
                                    String str117 = zzbbVar2.zza;
                                    Preconditions.checkNotEmpty(str117);
                                    str4 = zzrVar.zza;
                                    Preconditions.checkArgument(str117.equals(str4));
                                    zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                                    zzicVarZzaE.zza(1);
                                    zzicVarZzaE.zzC("android");
                                    if (!TextUtils.isEmpty(str4)) {
                                        zzicVarZzaE.zzL(str4);
                                    }
                                    str5 = zzrVar.zzd;
                                    if (!TextUtils.isEmpty(str5)) {
                                        zzicVarZzaE.zzJ(str5);
                                    }
                                    str6 = zzrVar.zzc;
                                    if (!TextUtils.isEmpty(str6)) {
                                        zzicVarZzaE.zzM(str6);
                                    }
                                    str7 = zzrVar.zzu;
                                    if (!TextUtils.isEmpty(str7)) {
                                        zzicVarZzaE.zzau(str7);
                                    }
                                    j12 = zzrVar.zzj;
                                    if (j12 != -2147483648L) {
                                        zzicVarZzaE.zzaj((int) j12);
                                    }
                                    zzicVarZzaE.zzN(zzrVar.zze);
                                    str8 = zzrVar.zzb;
                                    if (!TextUtils.isEmpty(str8)) {
                                        zzicVarZzaE.zzad(str8);
                                    }
                                    zzjkVarZzs = zzB((String) Preconditions.checkNotNull(str4)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                    zzicVarZzaE.zzat(zzjkVarZzs.zzk());
                                    zzql.zza();
                                    if (zzd().zzp(str4, zzfx.zzaP)) {
                                        zzicVarZzaE.zzaH(zzrVar.zzz);
                                        j14 = zzrVar.zzA;
                                        if (!zzjkVarZzs.zzo(zzjj.AD_STORAGE)) {
                                            j14 = (j14 & (-2)) | 32;
                                        }
                                        if (j14 == j11) {
                                            z11 = 1;
                                        } else {
                                            z11 = r11;
                                        }
                                        zzicVarZzaE.zzaz(z11);
                                        if (j14 == 0) {
                                            com.google.android.gms.internal.measurement.zzhd zzhdVarZzh5 = com.google.android.gms.internal.measurement.zzhe.zzh();
                                            if ((j14 & j11) != 0) {
                                                z12 = 1;
                                            } else {
                                                z12 = r11;
                                            }
                                            zzhdVarZzh5.zza(z12);
                                            if ((j14 & 2) != 0) {
                                                z13 = 1;
                                            } else {
                                                z13 = r11;
                                            }
                                            zzhdVarZzh5.zzb(z13);
                                            if ((j14 & 4) != 0) {
                                                z14 = 1;
                                            } else {
                                                z14 = r11;
                                            }
                                            zzhdVarZzh5.zzc(z14);
                                            if ((j14 & 8) != 0) {
                                                z15 = 1;
                                            } else {
                                                z15 = r11;
                                            }
                                            zzhdVarZzh5.zzd(z15);
                                            if ((j14 & 16) != 0) {
                                                z16 = 1;
                                            } else {
                                                z16 = r11;
                                            }
                                            zzhdVarZzh5.zze(z16);
                                            if ((32 & j14) != 0) {
                                                z17 = 1;
                                            } else {
                                                z17 = r11;
                                            }
                                            zzhdVarZzh5.zzf(z17);
                                            if ((j14 & 64) != 0) {
                                                z18 = 1;
                                            } else {
                                                z18 = r11;
                                            }
                                            zzhdVarZzh5.zzg(z18);
                                            zzicVarZzaE.zzaI((com.google.android.gms.internal.measurement.zzhe) zzhdVarZzh5.zzbc());
                                        }
                                    }
                                    j13 = zzrVar.zzf;
                                    if (j13 != 0) {
                                        zzicVarZzaE.zzY(j13);
                                    }
                                    zzicVarZzaE.zzar(zzrVar.zzq);
                                    zzpj zzpjVarZzp5 = zzp();
                                    zzjqVarZza = com.google.android.gms.internal.measurement.zzjq.zza(zzpjVarZzp5.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement"), zzfu.zza);
                                    if (zzjqVarZza == null) {
                                        mapZzb = Collections.EMPTY_MAP;
                                    } else {
                                        mapZzb = zzjqVarZza.zzb();
                                    }
                                    if (mapZzb == null) {
                                        arrayList = null;
                                    } else {
                                        arrayList = null;
                                    }
                                    if (arrayList != null) {
                                        zzicVarZzaE.zzaq(arrayList);
                                    }
                                    if (zzd().zzp(null, zzfx.zzbb)) {
                                        zzicVarZzaE.zzaP("");
                                    }
                                    str9 = zzrVar.zza;
                                    zzjkVarZzs2 = zzB((String) Preconditions.checkNotNull(str9)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                    zzjjVar = zzjj.AD_STORAGE;
                                    if (zzjkVarZzs2.zzo(zzjjVar)) {
                                        str13 = "raw_events";
                                        zzjjVar = zzjjVar;
                                    } else {
                                        str13 = "raw_events";
                                        zzjjVar = zzjjVar;
                                    }
                                    zzibVar2 = this.zzn;
                                    zzibVar2.zzu().zzw();
                                    zzicVarZzaE.zzF(Build.MODEL);
                                    zzibVar2.zzu().zzw();
                                    zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                                    zzicVarZzaE.zzI((int) zzibVar2.zzu().zzb());
                                    zzicVarZzaE.zzH(zzibVar2.zzu().zzc());
                                    zzicVarZzaE.zzay(zzrVar.zzw);
                                    if (zzibVar2.zzB()) {
                                        zzicVarZzaE.zzK();
                                        if (!TextUtils.isEmpty(null)) {
                                            zzicVarZzaE.zzam(null);
                                        }
                                    }
                                    zzhVarZzu = zzj().zzu(str9);
                                    if (zzhVarZzu == null) {
                                        zzhVarZzu = new zzh(zzibVar2, str9);
                                        zzhVarZzu.zze(zzK(zzjkVarZzs2));
                                        zzhVarZzu.zzm(zzrVar.zzk);
                                        zzhVarZzu.zzg(zzrVar.zzb);
                                        if (zzjkVarZzs2.zzo(zzjjVar)) {
                                            zzhVarZzu.zzk(this.zzk.zzf(str9, zzrVar.zzn));
                                        }
                                        zzhVarZzu.zzF(0L);
                                        zzhVarZzu.zzo(0L);
                                        zzhVarZzu.zzq(0L);
                                        zzhVarZzu.zzs(zzrVar.zzc);
                                        zzhVarZzu.zzu(zzrVar.zzj);
                                        zzhVarZzu.zzw(zzrVar.zzd);
                                        zzhVarZzu.zzy(zzrVar.zze);
                                        zzhVarZzu.zzA(zzrVar.zzf);
                                        zzhVarZzu.zzE(zzrVar.zzh);
                                        zzhVarZzu.zzC(zzrVar.zzq);
                                        i11 = 0;
                                        zzj().zzv(zzhVarZzu, false, false);
                                    } else {
                                        i11 = 0;
                                    }
                                    if (zzjkVarZzs2.zzo(zzjj.ANALYTICS_STORAGE)) {
                                        zzicVarZzaE.zzW((String) Preconditions.checkNotNull(zzhVarZzu.zzd()));
                                    }
                                    if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                        zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                                    }
                                    listZzn = zzj().zzn(str9);
                                    while (i12 < listZzn.size()) {
                                        com.google.android.gms.internal.measurement.zzit zzitVarZzm5 = com.google.android.gms.internal.measurement.zziu.zzm();
                                        zzitVarZzm5.zzb(((zzpm) listZzn.get(i12)).zzc);
                                        zzitVarZzm5.zza(((zzpm) listZzn.get(i12)).zzd);
                                        zzp().zzc(zzitVarZzm5, ((zzpm) listZzn.get(i12)).zze);
                                        zzicVarZzaE.zzp(zzitVarZzm5);
                                        if (!"_sid".equals(((zzpm) listZzn.get(i12)).zzc)) {
                                        }
                                    }
                                    zzavVarZzj3 = zzj();
                                    com.google.android.gms.internal.measurement.zzid zzidVar5 = (com.google.android.gms.internal.measurement.zzid) zzicVarZzaE.zzbc();
                                    zzavVarZzj3.zzg();
                                    zzavVarZzj3.zzay();
                                    Preconditions.checkNotNull(zzidVar5);
                                    Preconditions.checkNotEmpty(zzidVar5.zzA());
                                    byte[] bArrZzcc9 = zzidVar5.zzcc();
                                    long jZzt5 = zzavVarZzj3.zzg.zzp().zzt(bArrZzcc9);
                                    ContentValues contentValues6 = new ContentValues();
                                    String str29 = str11;
                                    contentValues6.put(str29, zzidVar5.zzA());
                                    contentValues6.put("metadata_fingerprint", Long.valueOf(jZzt5));
                                    contentValues6.put("metadata", bArrZzcc9);
                                    zzavVarZzj3.zze().insertWithOnConflict("raw_events_metadata", null, contentValues6, 4);
                                    zzavVarZzj4 = zzj();
                                    zzbdVar2 = new zzbd(zzbbVar2.zzf);
                                    while (true) {
                                        if (zzbdVar2.hasNext()) {
                                            zzhs zzhsVarZzh6 = zzh();
                                            String str210 = zzbbVar2.zza;
                                            zZzk = zzhsVarZzh6.zzk(str210, zzbbVar2.zzb);
                                            zzar zzarVarZzw5 = zzj().zzw(zzC(), str210, false, false, false, false, false, false, false);
                                            if (zZzk) {
                                            }
                                            i13 = i11;
                                            break;
                                        }
                                        if ("_r".equals(zzbdVar2.next())) {
                                        }
                                        i13 = 1;
                                        break;
                                    }
                                    zzavVarZzj4.zzg();
                                    zzavVarZzj4.zzay();
                                    Preconditions.checkNotNull(zzbbVar2);
                                    str10 = zzbbVar2.zza;
                                    Preconditions.checkNotEmpty(str10);
                                    byte[] bArrZzcc10 = zzavVarZzj4.zzg.zzp().zzh(zzbbVar2).zzcc();
                                    contentValues = new ContentValues();
                                    contentValues.put(str29, str10);
                                    contentValues.put("name", zzbbVar2.zzb);
                                    contentValues.put("timestamp", Long.valueOf(zzbbVar2.zzd));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jZzt5));
                                    contentValues.put("data", bArrZzcc10);
                                    contentValues.put(C33590cg.f69439i, Integer.valueOf(i13));
                                    if (zzavVarZzj4.zze().insert(str13, null, contentValues) == -1) {
                                        zzavVarZzj4.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", zzgt.zzl(str10));
                                    } else {
                                        this.zza = 0L;
                                    }
                                    zzj().zzc();
                                    zzj().zzd();
                                    zzaK();
                                    zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                    return;
                                }
                                long j110 = zzarVarZzx.zza;
                                zzd();
                                jIntValue = j110 - ((long) ((Integer) zzfx.zzm.zzb(null)).intValue());
                                if (jIntValue <= 0) {
                                    if (zEquals) {
                                        j11 = 1;
                                        r11 = 0;
                                        jMax = zzarVarZzx.zzd - ((long) Math.max(0, Math.min(1000000, zzd().zzm(zzrVar.zza, zzfx.zzl))));
                                        if (jMax > 0) {
                                            if (jMax == 1) {
                                                zzaV().zzb().zzc("Too many error events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzd));
                                            }
                                            zzj().zzc();
                                        }
                                    } else {
                                        j11 = 1;
                                        r11 = 0;
                                    }
                                    bundleZzf = zzbeVar2.zzf();
                                    zzpo zzpoVarZzt11 = zzt();
                                    String str118 = zzbgVar2.zzc;
                                    zzpoVarZzt11.zzM(bundleZzf, "_o", str118);
                                    if (zzt().zzaa(str2, zzrVar.zzB)) {
                                        zzpo zzpoVarZzt12 = zzt();
                                        Long lValueOf6 = Long.valueOf(j11);
                                        zzpoVarZzt12.zzM(bundleZzf, "_dbg", lValueOf6);
                                        zzt().zzM(bundleZzf, "_r", lValueOf6);
                                    }
                                    if ("_s".equals(str)) {
                                        obj3 = zzpmVarZzm2.zze;
                                        if (obj3 instanceof Long) {
                                            zzt().zzM(bundleZzf, "_sno", obj3);
                                        }
                                    }
                                    if (zzd().zzp(null, zzfx.zzaX)) {
                                        obj2 = bundleZzf.get("value");
                                        if (obj2 instanceof String) {
                                            double d16 = Double.parseDouble((String) obj2);
                                            bundleZzf.remove("value");
                                            bundleZzf.putDouble("value", d16);
                                        }
                                    }
                                    zzavVarZzj2 = zzj();
                                    Preconditions.checkNotEmpty(str2);
                                    zzavVarZzj2.zzg();
                                    zzavVarZzj2.zzay();
                                    jDelete = zzavVarZzj2.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str2, String.valueOf(Math.max((int) r11, Math.min(1000000, zzavVarZzj2.zzu.zzc().zzm(str2, zzfx.zzp))))});
                                    if (jDelete > 0) {
                                        zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgt.zzl(str2), Long.valueOf(jDelete));
                                    }
                                    zzibVar = this.zzn;
                                    zzbbVar = new zzbb(zzibVar, zzbgVar2.zzc, str2, zzbgVar2.zza, zzbgVar2.zzd, 0L, bundleZzf);
                                    zzav zzavVarZzj10 = zzj();
                                    str3 = zzbbVar.zzb;
                                    zzbcVarZzf = zzavVarZzj10.zzf(str2, str3);
                                    if (zzbcVarZzf != null) {
                                        if (zzj().zzU(str2) >= zzd().zzh(str2)) {
                                        }
                                        zzbcVar = new zzbc(str2, str3, 0L, 0L, 0L, zzbbVar.zzd, 0L, null, null, null, null);
                                        zzbbVar2 = zzbbVar;
                                    } else {
                                        zzbb zzbbVarZza6 = zzbbVar.zza(zzibVar, zzbcVarZzf.zzf);
                                        zzbc zzbcVarZza6 = zzbcVarZzf.zza(zzbbVarZza6.zzd);
                                        zzbbVar2 = zzbbVarZza6;
                                        zzbcVar = zzbcVarZza6;
                                    }
                                    zzj().zzh(zzbcVar);
                                    zzaW().zzg();
                                    zzu();
                                    Preconditions.checkNotNull(zzbbVar2);
                                    Preconditions.checkNotNull(zzrVar);
                                    String str119 = zzbbVar2.zza;
                                    Preconditions.checkNotEmpty(str119);
                                    str4 = zzrVar.zza;
                                    Preconditions.checkArgument(str119.equals(str4));
                                    zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                                    zzicVarZzaE.zza(1);
                                    zzicVarZzaE.zzC("android");
                                    if (!TextUtils.isEmpty(str4)) {
                                        zzicVarZzaE.zzL(str4);
                                    }
                                    str5 = zzrVar.zzd;
                                    if (!TextUtils.isEmpty(str5)) {
                                        zzicVarZzaE.zzJ(str5);
                                    }
                                    str6 = zzrVar.zzc;
                                    if (!TextUtils.isEmpty(str6)) {
                                        zzicVarZzaE.zzM(str6);
                                    }
                                    str7 = zzrVar.zzu;
                                    if (!TextUtils.isEmpty(str7)) {
                                        zzicVarZzaE.zzau(str7);
                                    }
                                    j12 = zzrVar.zzj;
                                    if (j12 != -2147483648L) {
                                        zzicVarZzaE.zzaj((int) j12);
                                    }
                                    zzicVarZzaE.zzN(zzrVar.zze);
                                    str8 = zzrVar.zzb;
                                    if (!TextUtils.isEmpty(str8)) {
                                        zzicVarZzaE.zzad(str8);
                                    }
                                    zzjkVarZzs = zzB((String) Preconditions.checkNotNull(str4)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                    zzicVarZzaE.zzat(zzjkVarZzs.zzk());
                                    zzql.zza();
                                    if (zzd().zzp(str4, zzfx.zzaP)) {
                                        zzicVarZzaE.zzaH(zzrVar.zzz);
                                        j14 = zzrVar.zzA;
                                        if (!zzjkVarZzs.zzo(zzjj.AD_STORAGE)) {
                                            j14 = (j14 & (-2)) | 32;
                                        }
                                        if (j14 == j11) {
                                            z11 = 1;
                                        } else {
                                            z11 = r11;
                                        }
                                        zzicVarZzaE.zzaz(z11);
                                        if (j14 == 0) {
                                            com.google.android.gms.internal.measurement.zzhd zzhdVarZzh6 = com.google.android.gms.internal.measurement.zzhe.zzh();
                                            if ((j14 & j11) != 0) {
                                                z12 = 1;
                                            } else {
                                                z12 = r11;
                                            }
                                            zzhdVarZzh6.zza(z12);
                                            if ((j14 & 2) != 0) {
                                                z13 = 1;
                                            } else {
                                                z13 = r11;
                                            }
                                            zzhdVarZzh6.zzb(z13);
                                            if ((j14 & 4) != 0) {
                                                z14 = 1;
                                            } else {
                                                z14 = r11;
                                            }
                                            zzhdVarZzh6.zzc(z14);
                                            if ((j14 & 8) != 0) {
                                                z15 = 1;
                                            } else {
                                                z15 = r11;
                                            }
                                            zzhdVarZzh6.zzd(z15);
                                            if ((j14 & 16) != 0) {
                                                z16 = 1;
                                            } else {
                                                z16 = r11;
                                            }
                                            zzhdVarZzh6.zze(z16);
                                            if ((32 & j14) != 0) {
                                                z17 = 1;
                                            } else {
                                                z17 = r11;
                                            }
                                            zzhdVarZzh6.zzf(z17);
                                            if ((j14 & 64) != 0) {
                                                z18 = 1;
                                            } else {
                                                z18 = r11;
                                            }
                                            zzhdVarZzh6.zzg(z18);
                                            zzicVarZzaE.zzaI((com.google.android.gms.internal.measurement.zzhe) zzhdVarZzh6.zzbc());
                                        }
                                    }
                                    j13 = zzrVar.zzf;
                                    if (j13 != 0) {
                                        zzicVarZzaE.zzY(j13);
                                    }
                                    zzicVarZzaE.zzar(zzrVar.zzq);
                                    zzpj zzpjVarZzp6 = zzp();
                                    zzjqVarZza = com.google.android.gms.internal.measurement.zzjq.zza(zzpjVarZzp6.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement"), zzfu.zza);
                                    if (zzjqVarZza == null) {
                                        mapZzb = Collections.EMPTY_MAP;
                                    } else {
                                        mapZzb = zzjqVarZza.zzb();
                                    }
                                    if (mapZzb == null) {
                                        arrayList = null;
                                    } else {
                                        arrayList = null;
                                    }
                                    if (arrayList != null) {
                                        zzicVarZzaE.zzaq(arrayList);
                                    }
                                    if (zzd().zzp(null, zzfx.zzbb)) {
                                        zzicVarZzaE.zzaP("");
                                    }
                                    str9 = zzrVar.zza;
                                    zzjkVarZzs2 = zzB((String) Preconditions.checkNotNull(str9)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                                    zzjjVar = zzjj.AD_STORAGE;
                                    if (zzjkVarZzs2.zzo(zzjjVar)) {
                                        str13 = "raw_events";
                                        zzjjVar = zzjjVar;
                                    } else {
                                        str13 = "raw_events";
                                        zzjjVar = zzjjVar;
                                    }
                                    zzibVar2 = this.zzn;
                                    zzibVar2.zzu().zzw();
                                    zzicVarZzaE.zzF(Build.MODEL);
                                    zzibVar2.zzu().zzw();
                                    zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                                    zzicVarZzaE.zzI((int) zzibVar2.zzu().zzb());
                                    zzicVarZzaE.zzH(zzibVar2.zzu().zzc());
                                    zzicVarZzaE.zzay(zzrVar.zzw);
                                    if (zzibVar2.zzB()) {
                                        zzicVarZzaE.zzK();
                                        if (!TextUtils.isEmpty(null)) {
                                            zzicVarZzaE.zzam(null);
                                        }
                                    }
                                    zzhVarZzu = zzj().zzu(str9);
                                    if (zzhVarZzu == null) {
                                        zzhVarZzu = new zzh(zzibVar2, str9);
                                        zzhVarZzu.zze(zzK(zzjkVarZzs2));
                                        zzhVarZzu.zzm(zzrVar.zzk);
                                        zzhVarZzu.zzg(zzrVar.zzb);
                                        if (zzjkVarZzs2.zzo(zzjjVar)) {
                                            zzhVarZzu.zzk(this.zzk.zzf(str9, zzrVar.zzn));
                                        }
                                        zzhVarZzu.zzF(0L);
                                        zzhVarZzu.zzo(0L);
                                        zzhVarZzu.zzq(0L);
                                        zzhVarZzu.zzs(zzrVar.zzc);
                                        zzhVarZzu.zzu(zzrVar.zzj);
                                        zzhVarZzu.zzw(zzrVar.zzd);
                                        zzhVarZzu.zzy(zzrVar.zze);
                                        zzhVarZzu.zzA(zzrVar.zzf);
                                        zzhVarZzu.zzE(zzrVar.zzh);
                                        zzhVarZzu.zzC(zzrVar.zzq);
                                        i11 = 0;
                                        zzj().zzv(zzhVarZzu, false, false);
                                    } else {
                                        i11 = 0;
                                    }
                                    if (zzjkVarZzs2.zzo(zzjj.ANALYTICS_STORAGE)) {
                                        zzicVarZzaE.zzW((String) Preconditions.checkNotNull(zzhVarZzu.zzd()));
                                    }
                                    if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                        zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                                    }
                                    listZzn = zzj().zzn(str9);
                                    while (i12 < listZzn.size()) {
                                        com.google.android.gms.internal.measurement.zzit zzitVarZzm6 = com.google.android.gms.internal.measurement.zziu.zzm();
                                        zzitVarZzm6.zzb(((zzpm) listZzn.get(i12)).zzc);
                                        zzitVarZzm6.zza(((zzpm) listZzn.get(i12)).zzd);
                                        zzp().zzc(zzitVarZzm6, ((zzpm) listZzn.get(i12)).zze);
                                        zzicVarZzaE.zzp(zzitVarZzm6);
                                        if (!"_sid".equals(((zzpm) listZzn.get(i12)).zzc)) {
                                        }
                                    }
                                    zzavVarZzj3 = zzj();
                                    com.google.android.gms.internal.measurement.zzid zzidVar6 = (com.google.android.gms.internal.measurement.zzid) zzicVarZzaE.zzbc();
                                    zzavVarZzj3.zzg();
                                    zzavVarZzj3.zzay();
                                    Preconditions.checkNotNull(zzidVar6);
                                    Preconditions.checkNotEmpty(zzidVar6.zzA());
                                    byte[] bArrZzcc11 = zzidVar6.zzcc();
                                    long jZzt6 = zzavVarZzj3.zzg.zzp().zzt(bArrZzcc11);
                                    ContentValues contentValues7 = new ContentValues();
                                    String str211 = str11;
                                    contentValues7.put(str211, zzidVar6.zzA());
                                    contentValues7.put("metadata_fingerprint", Long.valueOf(jZzt6));
                                    contentValues7.put("metadata", bArrZzcc11);
                                    zzavVarZzj3.zze().insertWithOnConflict("raw_events_metadata", null, contentValues7, 4);
                                    zzavVarZzj4 = zzj();
                                    zzbdVar2 = new zzbd(zzbbVar2.zzf);
                                    while (true) {
                                        if (zzbdVar2.hasNext()) {
                                            zzhs zzhsVarZzh7 = zzh();
                                            String str212 = zzbbVar2.zza;
                                            zZzk = zzhsVarZzh7.zzk(str212, zzbbVar2.zzb);
                                            zzar zzarVarZzw6 = zzj().zzw(zzC(), str212, false, false, false, false, false, false, false);
                                            if (zZzk) {
                                            }
                                            i13 = i11;
                                            break;
                                        }
                                        if ("_r".equals(zzbdVar2.next())) {
                                        }
                                        i13 = 1;
                                        break;
                                    }
                                    zzavVarZzj4.zzg();
                                    zzavVarZzj4.zzay();
                                    Preconditions.checkNotNull(zzbbVar2);
                                    str10 = zzbbVar2.zza;
                                    Preconditions.checkNotEmpty(str10);
                                    byte[] bArrZzcc12 = zzavVarZzj4.zzg.zzp().zzh(zzbbVar2).zzcc();
                                    contentValues = new ContentValues();
                                    contentValues.put(str211, str10);
                                    contentValues.put("name", zzbbVar2.zzb);
                                    contentValues.put("timestamp", Long.valueOf(zzbbVar2.zzd));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jZzt6));
                                    contentValues.put("data", bArrZzcc12);
                                    contentValues.put(C33590cg.f69439i, Integer.valueOf(i13));
                                    if (zzavVarZzj4.zze().insert(str13, null, contentValues) == -1) {
                                        zzavVarZzj4.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", zzgt.zzl(str10));
                                    } else {
                                        this.zza = 0L;
                                    }
                                    zzj().zzc();
                                    zzj().zzd();
                                    zzaK();
                                    zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                    return;
                                }
                                if (jIntValue % 1000 == 1) {
                                    zzaV().zzb().zzc("Data loss. Too many public events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zza));
                                }
                                zzt().zzN(this.zzK, str2, 16, "_ev", zzbgVar2.zza, 0);
                                zzj().zzc();
                            }
                        }
                    } else {
                        str11 = "app_id";
                        str12 = "_fx";
                    }
                    zzbgVarZzb = zzbgVarZzb;
                    str = zzbgVarZzb.zza;
                    zZzh = zzpo.zzh(str);
                    zEquals = "_err".equals(str);
                    zzt();
                    zzbeVar2 = zzbgVarZzb.zzb;
                    if (zzbeVar2 == null) {
                        length = 0;
                    } else {
                        zzbdVar = new zzbd(zzbeVar2);
                        length = 0;
                        while (zzbdVar.hasNext()) {
                            objZza = zzbeVar2.zza(zzbdVar.next());
                            if (objZza instanceof Parcelable[]) {
                                length += (long) ((Parcelable[]) objZza).length;
                            }
                        }
                    }
                    str2 = str14;
                    zzbgVar2 = zzbgVarZzb;
                    zzarVarZzx = zzj().zzx(zzC(), str2, length + 1, true, zZzh, false, zEquals, false, false, false);
                    long j111 = zzarVarZzx.zzb;
                    zzd();
                    jZzH = j111 - zzal.zzH();
                    if (jZzH > 0) {
                        if (jZzH % 1000 == 1) {
                            zzaV().zzb().zzc("Data loss. Too many events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzb));
                        }
                        zzj().zzc();
                    } else {
                        if (zZzh) {
                            if (zEquals) {
                                j11 = 1;
                                r11 = 0;
                                jMax = zzarVarZzx.zzd - ((long) Math.max(0, Math.min(1000000, zzd().zzm(zzrVar.zza, zzfx.zzl))));
                                if (jMax > 0) {
                                    if (jMax == 1) {
                                        zzaV().zzb().zzc("Too many error events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzd));
                                    }
                                    zzj().zzc();
                                }
                            } else {
                                j11 = 1;
                                r11 = 0;
                            }
                            bundleZzf = zzbeVar2.zzf();
                            zzpo zzpoVarZzt13 = zzt();
                            String str1110 = zzbgVar2.zzc;
                            zzpoVarZzt13.zzM(bundleZzf, "_o", str1110);
                            if (zzt().zzaa(str2, zzrVar.zzB)) {
                                zzpo zzpoVarZzt14 = zzt();
                                Long lValueOf7 = Long.valueOf(j11);
                                zzpoVarZzt14.zzM(bundleZzf, "_dbg", lValueOf7);
                                zzt().zzM(bundleZzf, "_r", lValueOf7);
                            }
                            if ("_s".equals(str)) {
                                obj3 = zzpmVarZzm2.zze;
                                if (obj3 instanceof Long) {
                                    zzt().zzM(bundleZzf, "_sno", obj3);
                                }
                            }
                            if (zzd().zzp(null, zzfx.zzaX)) {
                                obj2 = bundleZzf.get("value");
                                if (obj2 instanceof String) {
                                    double d17 = Double.parseDouble((String) obj2);
                                    bundleZzf.remove("value");
                                    bundleZzf.putDouble("value", d17);
                                }
                            }
                            zzavVarZzj2 = zzj();
                            Preconditions.checkNotEmpty(str2);
                            zzavVarZzj2.zzg();
                            zzavVarZzj2.zzay();
                            jDelete = zzavVarZzj2.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str2, String.valueOf(Math.max((int) r11, Math.min(1000000, zzavVarZzj2.zzu.zzc().zzm(str2, zzfx.zzp))))});
                            if (jDelete > 0) {
                                zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgt.zzl(str2), Long.valueOf(jDelete));
                            }
                            zzibVar = this.zzn;
                            zzbbVar = new zzbb(zzibVar, zzbgVar2.zzc, str2, zzbgVar2.zza, zzbgVar2.zzd, 0L, bundleZzf);
                            zzav zzavVarZzj11 = zzj();
                            str3 = zzbbVar.zzb;
                            zzbcVarZzf = zzavVarZzj11.zzf(str2, str3);
                            if (zzbcVarZzf != null) {
                                if (zzj().zzU(str2) >= zzd().zzh(str2)) {
                                }
                                zzbcVar = new zzbc(str2, str3, 0L, 0L, 0L, zzbbVar.zzd, 0L, null, null, null, null);
                                zzbbVar2 = zzbbVar;
                            } else {
                                zzbb zzbbVarZza7 = zzbbVar.zza(zzibVar, zzbcVarZzf.zzf);
                                zzbc zzbcVarZza7 = zzbcVarZzf.zza(zzbbVarZza7.zzd);
                                zzbbVar2 = zzbbVarZza7;
                                zzbcVar = zzbcVarZza7;
                            }
                            zzj().zzh(zzbcVar);
                            zzaW().zzg();
                            zzu();
                            Preconditions.checkNotNull(zzbbVar2);
                            Preconditions.checkNotNull(zzrVar);
                            String str1111 = zzbbVar2.zza;
                            Preconditions.checkNotEmpty(str1111);
                            str4 = zzrVar.zza;
                            Preconditions.checkArgument(str1111.equals(str4));
                            zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                            zzicVarZzaE.zza(1);
                            zzicVarZzaE.zzC("android");
                            if (!TextUtils.isEmpty(str4)) {
                                zzicVarZzaE.zzL(str4);
                            }
                            str5 = zzrVar.zzd;
                            if (!TextUtils.isEmpty(str5)) {
                                zzicVarZzaE.zzJ(str5);
                            }
                            str6 = zzrVar.zzc;
                            if (!TextUtils.isEmpty(str6)) {
                                zzicVarZzaE.zzM(str6);
                            }
                            str7 = zzrVar.zzu;
                            if (!TextUtils.isEmpty(str7)) {
                                zzicVarZzaE.zzau(str7);
                            }
                            j12 = zzrVar.zzj;
                            if (j12 != -2147483648L) {
                                zzicVarZzaE.zzaj((int) j12);
                            }
                            zzicVarZzaE.zzN(zzrVar.zze);
                            str8 = zzrVar.zzb;
                            if (!TextUtils.isEmpty(str8)) {
                                zzicVarZzaE.zzad(str8);
                            }
                            zzjkVarZzs = zzB((String) Preconditions.checkNotNull(str4)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                            zzicVarZzaE.zzat(zzjkVarZzs.zzk());
                            zzql.zza();
                            if (zzd().zzp(str4, zzfx.zzaP)) {
                                zzicVarZzaE.zzaH(zzrVar.zzz);
                                j14 = zzrVar.zzA;
                                if (!zzjkVarZzs.zzo(zzjj.AD_STORAGE)) {
                                    j14 = (j14 & (-2)) | 32;
                                }
                                if (j14 == j11) {
                                    z11 = 1;
                                } else {
                                    z11 = r11;
                                }
                                zzicVarZzaE.zzaz(z11);
                                if (j14 == 0) {
                                    com.google.android.gms.internal.measurement.zzhd zzhdVarZzh7 = com.google.android.gms.internal.measurement.zzhe.zzh();
                                    if ((j14 & j11) != 0) {
                                        z12 = 1;
                                    } else {
                                        z12 = r11;
                                    }
                                    zzhdVarZzh7.zza(z12);
                                    if ((j14 & 2) != 0) {
                                        z13 = 1;
                                    } else {
                                        z13 = r11;
                                    }
                                    zzhdVarZzh7.zzb(z13);
                                    if ((j14 & 4) != 0) {
                                        z14 = 1;
                                    } else {
                                        z14 = r11;
                                    }
                                    zzhdVarZzh7.zzc(z14);
                                    if ((j14 & 8) != 0) {
                                        z15 = 1;
                                    } else {
                                        z15 = r11;
                                    }
                                    zzhdVarZzh7.zzd(z15);
                                    if ((j14 & 16) != 0) {
                                        z16 = 1;
                                    } else {
                                        z16 = r11;
                                    }
                                    zzhdVarZzh7.zze(z16);
                                    if ((32 & j14) != 0) {
                                        z17 = 1;
                                    } else {
                                        z17 = r11;
                                    }
                                    zzhdVarZzh7.zzf(z17);
                                    if ((j14 & 64) != 0) {
                                        z18 = 1;
                                    } else {
                                        z18 = r11;
                                    }
                                    zzhdVarZzh7.zzg(z18);
                                    zzicVarZzaE.zzaI((com.google.android.gms.internal.measurement.zzhe) zzhdVarZzh7.zzbc());
                                }
                            }
                            j13 = zzrVar.zzf;
                            if (j13 != 0) {
                                zzicVarZzaE.zzY(j13);
                            }
                            zzicVarZzaE.zzar(zzrVar.zzq);
                            zzpj zzpjVarZzp7 = zzp();
                            zzjqVarZza = com.google.android.gms.internal.measurement.zzjq.zza(zzpjVarZzp7.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement"), zzfu.zza);
                            if (zzjqVarZza == null) {
                                mapZzb = Collections.EMPTY_MAP;
                            } else {
                                mapZzb = zzjqVarZza.zzb();
                            }
                            if (mapZzb == null) {
                                arrayList = null;
                            } else {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                zzicVarZzaE.zzaq(arrayList);
                            }
                            if (zzd().zzp(null, zzfx.zzbb)) {
                                zzicVarZzaE.zzaP("");
                            }
                            str9 = zzrVar.zza;
                            zzjkVarZzs2 = zzB((String) Preconditions.checkNotNull(str9)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                            zzjjVar = zzjj.AD_STORAGE;
                            if (zzjkVarZzs2.zzo(zzjjVar)) {
                                str13 = "raw_events";
                                zzjjVar = zzjjVar;
                            } else {
                                str13 = "raw_events";
                                zzjjVar = zzjjVar;
                            }
                            zzibVar2 = this.zzn;
                            zzibVar2.zzu().zzw();
                            zzicVarZzaE.zzF(Build.MODEL);
                            zzibVar2.zzu().zzw();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) zzibVar2.zzu().zzb());
                            zzicVarZzaE.zzH(zzibVar2.zzu().zzc());
                            zzicVarZzaE.zzay(zzrVar.zzw);
                            if (zzibVar2.zzB()) {
                                zzicVarZzaE.zzK();
                                if (!TextUtils.isEmpty(null)) {
                                    zzicVarZzaE.zzam(null);
                                }
                            }
                            zzhVarZzu = zzj().zzu(str9);
                            if (zzhVarZzu == null) {
                                zzhVarZzu = new zzh(zzibVar2, str9);
                                zzhVarZzu.zze(zzK(zzjkVarZzs2));
                                zzhVarZzu.zzm(zzrVar.zzk);
                                zzhVarZzu.zzg(zzrVar.zzb);
                                if (zzjkVarZzs2.zzo(zzjjVar)) {
                                    zzhVarZzu.zzk(this.zzk.zzf(str9, zzrVar.zzn));
                                }
                                zzhVarZzu.zzF(0L);
                                zzhVarZzu.zzo(0L);
                                zzhVarZzu.zzq(0L);
                                zzhVarZzu.zzs(zzrVar.zzc);
                                zzhVarZzu.zzu(zzrVar.zzj);
                                zzhVarZzu.zzw(zzrVar.zzd);
                                zzhVarZzu.zzy(zzrVar.zze);
                                zzhVarZzu.zzA(zzrVar.zzf);
                                zzhVarZzu.zzE(zzrVar.zzh);
                                zzhVarZzu.zzC(zzrVar.zzq);
                                i11 = 0;
                                zzj().zzv(zzhVarZzu, false, false);
                            } else {
                                i11 = 0;
                            }
                            if (zzjkVarZzs2.zzo(zzjj.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW((String) Preconditions.checkNotNull(zzhVarZzu.zzd()));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            listZzn = zzj().zzn(str9);
                            while (i12 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm7 = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm7.zzb(((zzpm) listZzn.get(i12)).zzc);
                                zzitVarZzm7.zza(((zzpm) listZzn.get(i12)).zzd);
                                zzp().zzc(zzitVarZzm7, ((zzpm) listZzn.get(i12)).zze);
                                zzicVarZzaE.zzp(zzitVarZzm7);
                                if (!"_sid".equals(((zzpm) listZzn.get(i12)).zzc)) {
                                }
                            }
                            zzavVarZzj3 = zzj();
                            com.google.android.gms.internal.measurement.zzid zzidVar7 = (com.google.android.gms.internal.measurement.zzid) zzicVarZzaE.zzbc();
                            zzavVarZzj3.zzg();
                            zzavVarZzj3.zzay();
                            Preconditions.checkNotNull(zzidVar7);
                            Preconditions.checkNotEmpty(zzidVar7.zzA());
                            byte[] bArrZzcc13 = zzidVar7.zzcc();
                            long jZzt7 = zzavVarZzj3.zzg.zzp().zzt(bArrZzcc13);
                            ContentValues contentValues8 = new ContentValues();
                            String str213 = str11;
                            contentValues8.put(str213, zzidVar7.zzA());
                            contentValues8.put("metadata_fingerprint", Long.valueOf(jZzt7));
                            contentValues8.put("metadata", bArrZzcc13);
                            zzavVarZzj3.zze().insertWithOnConflict("raw_events_metadata", null, contentValues8, 4);
                            zzavVarZzj4 = zzj();
                            zzbdVar2 = new zzbd(zzbbVar2.zzf);
                            while (true) {
                                if (zzbdVar2.hasNext()) {
                                    zzhs zzhsVarZzh8 = zzh();
                                    String str214 = zzbbVar2.zza;
                                    zZzk = zzhsVarZzh8.zzk(str214, zzbbVar2.zzb);
                                    zzar zzarVarZzw7 = zzj().zzw(zzC(), str214, false, false, false, false, false, false, false);
                                    if (zZzk) {
                                    }
                                    i13 = i11;
                                    break;
                                }
                                if ("_r".equals(zzbdVar2.next())) {
                                }
                                i13 = 1;
                                break;
                            }
                            zzavVarZzj4.zzg();
                            zzavVarZzj4.zzay();
                            Preconditions.checkNotNull(zzbbVar2);
                            str10 = zzbbVar2.zza;
                            Preconditions.checkNotEmpty(str10);
                            byte[] bArrZzcc14 = zzavVarZzj4.zzg.zzp().zzh(zzbbVar2).zzcc();
                            contentValues = new ContentValues();
                            contentValues.put(str213, str10);
                            contentValues.put("name", zzbbVar2.zzb);
                            contentValues.put("timestamp", Long.valueOf(zzbbVar2.zzd));
                            contentValues.put("metadata_fingerprint", Long.valueOf(jZzt7));
                            contentValues.put("data", bArrZzcc14);
                            contentValues.put(C33590cg.f69439i, Integer.valueOf(i13));
                            if (zzavVarZzj4.zze().insert(str13, null, contentValues) == -1) {
                                zzavVarZzj4.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", zzgt.zzl(str10));
                            } else {
                                this.zza = 0L;
                            }
                            zzj().zzc();
                            zzj().zzd();
                            zzaK();
                            zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                            return;
                        }
                        long j112 = zzarVarZzx.zza;
                        zzd();
                        jIntValue = j112 - ((long) ((Integer) zzfx.zzm.zzb(null)).intValue());
                        if (jIntValue <= 0) {
                            if (zEquals) {
                                j11 = 1;
                                r11 = 0;
                                jMax = zzarVarZzx.zzd - ((long) Math.max(0, Math.min(1000000, zzd().zzm(zzrVar.zza, zzfx.zzl))));
                                if (jMax > 0) {
                                    if (jMax == 1) {
                                        zzaV().zzb().zzc("Too many error events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zzd));
                                    }
                                    zzj().zzc();
                                }
                            } else {
                                j11 = 1;
                                r11 = 0;
                            }
                            bundleZzf = zzbeVar2.zzf();
                            zzpo zzpoVarZzt15 = zzt();
                            String str1112 = zzbgVar2.zzc;
                            zzpoVarZzt15.zzM(bundleZzf, "_o", str1112);
                            if (zzt().zzaa(str2, zzrVar.zzB)) {
                                zzpo zzpoVarZzt16 = zzt();
                                Long lValueOf8 = Long.valueOf(j11);
                                zzpoVarZzt16.zzM(bundleZzf, "_dbg", lValueOf8);
                                zzt().zzM(bundleZzf, "_r", lValueOf8);
                            }
                            if ("_s".equals(str)) {
                                obj3 = zzpmVarZzm2.zze;
                                if (obj3 instanceof Long) {
                                    zzt().zzM(bundleZzf, "_sno", obj3);
                                }
                            }
                            if (zzd().zzp(null, zzfx.zzaX)) {
                                obj2 = bundleZzf.get("value");
                                if (obj2 instanceof String) {
                                    double d18 = Double.parseDouble((String) obj2);
                                    bundleZzf.remove("value");
                                    bundleZzf.putDouble("value", d18);
                                }
                            }
                            zzavVarZzj2 = zzj();
                            Preconditions.checkNotEmpty(str2);
                            zzavVarZzj2.zzg();
                            zzavVarZzj2.zzay();
                            jDelete = zzavVarZzj2.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str2, String.valueOf(Math.max((int) r11, Math.min(1000000, zzavVarZzj2.zzu.zzc().zzm(str2, zzfx.zzp))))});
                            if (jDelete > 0) {
                                zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgt.zzl(str2), Long.valueOf(jDelete));
                            }
                            zzibVar = this.zzn;
                            zzbbVar = new zzbb(zzibVar, zzbgVar2.zzc, str2, zzbgVar2.zza, zzbgVar2.zzd, 0L, bundleZzf);
                            zzav zzavVarZzj12 = zzj();
                            str3 = zzbbVar.zzb;
                            zzbcVarZzf = zzavVarZzj12.zzf(str2, str3);
                            if (zzbcVarZzf != null) {
                                if (zzj().zzU(str2) >= zzd().zzh(str2)) {
                                }
                                zzbcVar = new zzbc(str2, str3, 0L, 0L, 0L, zzbbVar.zzd, 0L, null, null, null, null);
                                zzbbVar2 = zzbbVar;
                            } else {
                                zzbb zzbbVarZza8 = zzbbVar.zza(zzibVar, zzbcVarZzf.zzf);
                                zzbc zzbcVarZza8 = zzbcVarZzf.zza(zzbbVarZza8.zzd);
                                zzbbVar2 = zzbbVarZza8;
                                zzbcVar = zzbcVarZza8;
                            }
                            zzj().zzh(zzbcVar);
                            zzaW().zzg();
                            zzu();
                            Preconditions.checkNotNull(zzbbVar2);
                            Preconditions.checkNotNull(zzrVar);
                            String str1113 = zzbbVar2.zza;
                            Preconditions.checkNotEmpty(str1113);
                            str4 = zzrVar.zza;
                            Preconditions.checkArgument(str1113.equals(str4));
                            zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                            zzicVarZzaE.zza(1);
                            zzicVarZzaE.zzC("android");
                            if (!TextUtils.isEmpty(str4)) {
                                zzicVarZzaE.zzL(str4);
                            }
                            str5 = zzrVar.zzd;
                            if (!TextUtils.isEmpty(str5)) {
                                zzicVarZzaE.zzJ(str5);
                            }
                            str6 = zzrVar.zzc;
                            if (!TextUtils.isEmpty(str6)) {
                                zzicVarZzaE.zzM(str6);
                            }
                            str7 = zzrVar.zzu;
                            if (!TextUtils.isEmpty(str7)) {
                                zzicVarZzaE.zzau(str7);
                            }
                            j12 = zzrVar.zzj;
                            if (j12 != -2147483648L) {
                                zzicVarZzaE.zzaj((int) j12);
                            }
                            zzicVarZzaE.zzN(zzrVar.zze);
                            str8 = zzrVar.zzb;
                            if (!TextUtils.isEmpty(str8)) {
                                zzicVarZzaE.zzad(str8);
                            }
                            zzjkVarZzs = zzB((String) Preconditions.checkNotNull(str4)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                            zzicVarZzaE.zzat(zzjkVarZzs.zzk());
                            zzql.zza();
                            if (zzd().zzp(str4, zzfx.zzaP)) {
                                zzicVarZzaE.zzaH(zzrVar.zzz);
                                j14 = zzrVar.zzA;
                                if (!zzjkVarZzs.zzo(zzjj.AD_STORAGE)) {
                                    j14 = (j14 & (-2)) | 32;
                                }
                                if (j14 == j11) {
                                    z11 = 1;
                                } else {
                                    z11 = r11;
                                }
                                zzicVarZzaE.zzaz(z11);
                                if (j14 == 0) {
                                    com.google.android.gms.internal.measurement.zzhd zzhdVarZzh8 = com.google.android.gms.internal.measurement.zzhe.zzh();
                                    if ((j14 & j11) != 0) {
                                        z12 = 1;
                                    } else {
                                        z12 = r11;
                                    }
                                    zzhdVarZzh8.zza(z12);
                                    if ((j14 & 2) != 0) {
                                        z13 = 1;
                                    } else {
                                        z13 = r11;
                                    }
                                    zzhdVarZzh8.zzb(z13);
                                    if ((j14 & 4) != 0) {
                                        z14 = 1;
                                    } else {
                                        z14 = r11;
                                    }
                                    zzhdVarZzh8.zzc(z14);
                                    if ((j14 & 8) != 0) {
                                        z15 = 1;
                                    } else {
                                        z15 = r11;
                                    }
                                    zzhdVarZzh8.zzd(z15);
                                    if ((j14 & 16) != 0) {
                                        z16 = 1;
                                    } else {
                                        z16 = r11;
                                    }
                                    zzhdVarZzh8.zze(z16);
                                    if ((32 & j14) != 0) {
                                        z17 = 1;
                                    } else {
                                        z17 = r11;
                                    }
                                    zzhdVarZzh8.zzf(z17);
                                    if ((j14 & 64) != 0) {
                                        z18 = 1;
                                    } else {
                                        z18 = r11;
                                    }
                                    zzhdVarZzh8.zzg(z18);
                                    zzicVarZzaE.zzaI((com.google.android.gms.internal.measurement.zzhe) zzhdVarZzh8.zzbc());
                                }
                            }
                            j13 = zzrVar.zzf;
                            if (j13 != 0) {
                                zzicVarZzaE.zzY(j13);
                            }
                            zzicVarZzaE.zzar(zzrVar.zzq);
                            zzpj zzpjVarZzp8 = zzp();
                            zzjqVarZza = com.google.android.gms.internal.measurement.zzjq.zza(zzpjVarZzp8.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement"), zzfu.zza);
                            if (zzjqVarZza == null) {
                                mapZzb = Collections.EMPTY_MAP;
                            } else {
                                mapZzb = zzjqVarZza.zzb();
                            }
                            if (mapZzb == null) {
                                arrayList = null;
                            } else {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                zzicVarZzaE.zzaq(arrayList);
                            }
                            if (zzd().zzp(null, zzfx.zzbb)) {
                                zzicVarZzaE.zzaP("");
                            }
                            str9 = zzrVar.zza;
                            zzjkVarZzs2 = zzB((String) Preconditions.checkNotNull(str9)).zzs(zzjk.zzf(zzrVar.zzs, 100));
                            zzjjVar = zzjj.AD_STORAGE;
                            if (zzjkVarZzs2.zzo(zzjjVar)) {
                                str13 = "raw_events";
                                zzjjVar = zzjjVar;
                            } else {
                                str13 = "raw_events";
                                zzjjVar = zzjjVar;
                            }
                            zzibVar2 = this.zzn;
                            zzibVar2.zzu().zzw();
                            zzicVarZzaE.zzF(Build.MODEL);
                            zzibVar2.zzu().zzw();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) zzibVar2.zzu().zzb());
                            zzicVarZzaE.zzH(zzibVar2.zzu().zzc());
                            zzicVarZzaE.zzay(zzrVar.zzw);
                            if (zzibVar2.zzB()) {
                                zzicVarZzaE.zzK();
                                if (!TextUtils.isEmpty(null)) {
                                    zzicVarZzaE.zzam(null);
                                }
                            }
                            zzhVarZzu = zzj().zzu(str9);
                            if (zzhVarZzu == null) {
                                zzhVarZzu = new zzh(zzibVar2, str9);
                                zzhVarZzu.zze(zzK(zzjkVarZzs2));
                                zzhVarZzu.zzm(zzrVar.zzk);
                                zzhVarZzu.zzg(zzrVar.zzb);
                                if (zzjkVarZzs2.zzo(zzjjVar)) {
                                    zzhVarZzu.zzk(this.zzk.zzf(str9, zzrVar.zzn));
                                }
                                zzhVarZzu.zzF(0L);
                                zzhVarZzu.zzo(0L);
                                zzhVarZzu.zzq(0L);
                                zzhVarZzu.zzs(zzrVar.zzc);
                                zzhVarZzu.zzu(zzrVar.zzj);
                                zzhVarZzu.zzw(zzrVar.zzd);
                                zzhVarZzu.zzy(zzrVar.zze);
                                zzhVarZzu.zzA(zzrVar.zzf);
                                zzhVarZzu.zzE(zzrVar.zzh);
                                zzhVarZzu.zzC(zzrVar.zzq);
                                i11 = 0;
                                zzj().zzv(zzhVarZzu, false, false);
                            } else {
                                i11 = 0;
                            }
                            if (zzjkVarZzs2.zzo(zzjj.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW((String) Preconditions.checkNotNull(zzhVarZzu.zzd()));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            listZzn = zzj().zzn(str9);
                            while (i12 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm8 = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm8.zzb(((zzpm) listZzn.get(i12)).zzc);
                                zzitVarZzm8.zza(((zzpm) listZzn.get(i12)).zzd);
                                zzp().zzc(zzitVarZzm8, ((zzpm) listZzn.get(i12)).zze);
                                zzicVarZzaE.zzp(zzitVarZzm8);
                                if (!"_sid".equals(((zzpm) listZzn.get(i12)).zzc)) {
                                }
                            }
                            zzavVarZzj3 = zzj();
                            com.google.android.gms.internal.measurement.zzid zzidVar8 = (com.google.android.gms.internal.measurement.zzid) zzicVarZzaE.zzbc();
                            zzavVarZzj3.zzg();
                            zzavVarZzj3.zzay();
                            Preconditions.checkNotNull(zzidVar8);
                            Preconditions.checkNotEmpty(zzidVar8.zzA());
                            byte[] bArrZzcc15 = zzidVar8.zzcc();
                            long jZzt8 = zzavVarZzj3.zzg.zzp().zzt(bArrZzcc15);
                            ContentValues contentValues9 = new ContentValues();
                            String str215 = str11;
                            contentValues9.put(str215, zzidVar8.zzA());
                            contentValues9.put("metadata_fingerprint", Long.valueOf(jZzt8));
                            contentValues9.put("metadata", bArrZzcc15);
                            zzavVarZzj3.zze().insertWithOnConflict("raw_events_metadata", null, contentValues9, 4);
                            zzavVarZzj4 = zzj();
                            zzbdVar2 = new zzbd(zzbbVar2.zzf);
                            while (true) {
                                if (zzbdVar2.hasNext()) {
                                    zzhs zzhsVarZzh9 = zzh();
                                    String str216 = zzbbVar2.zza;
                                    zZzk = zzhsVarZzh9.zzk(str216, zzbbVar2.zzb);
                                    zzar zzarVarZzw8 = zzj().zzw(zzC(), str216, false, false, false, false, false, false, false);
                                    if (zZzk) {
                                    }
                                    i13 = i11;
                                    break;
                                }
                                if ("_r".equals(zzbdVar2.next())) {
                                }
                                i13 = 1;
                                break;
                            }
                            zzavVarZzj4.zzg();
                            zzavVarZzj4.zzay();
                            Preconditions.checkNotNull(zzbbVar2);
                            str10 = zzbbVar2.zza;
                            Preconditions.checkNotEmpty(str10);
                            byte[] bArrZzcc16 = zzavVarZzj4.zzg.zzp().zzh(zzbbVar2).zzcc();
                            contentValues = new ContentValues();
                            contentValues.put(str215, str10);
                            contentValues.put("name", zzbbVar2.zzb);
                            contentValues.put("timestamp", Long.valueOf(zzbbVar2.zzd));
                            contentValues.put("metadata_fingerprint", Long.valueOf(jZzt8));
                            contentValues.put("data", bArrZzcc16);
                            contentValues.put(C33590cg.f69439i, Integer.valueOf(i13));
                            if (zzavVarZzj4.zze().insert(str13, null, contentValues) == -1) {
                                zzavVarZzj4.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", zzgt.zzl(str10));
                            } else {
                                this.zza = 0L;
                            }
                            zzj().zzc();
                            zzj().zzd();
                            zzaK();
                            zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                            return;
                        }
                        if (jIntValue % 1000 == 1) {
                            zzaV().zzb().zzc("Data loss. Too many public events logged. appId, count", zzgt.zzl(str2), Long.valueOf(zzarVarZzx.zza));
                        }
                        zzt().zzN(this.zzK, str2, 16, "_ev", zzbgVar2.zza, 0);
                        zzj().zzc();
                    }
                }
                zzj().zzd();
            } catch (Throwable th2) {
                zzj().zzd();
                throw th2;
            }
        }
    }

    @WorkerThread
    public final void zzI(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        com.google.android.gms.internal.measurement.zziu zziuVar;
        zzaW().zzg();
        zzu();
        zzan zzanVarZzd = zzan.zzd(zzicVar.zzaA());
        String strZzc = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzjk zzjkVarZzB = zzB(strZzc);
        zzjh zzjhVar = zzjh.UNINITIALIZED;
        int iOrdinal = zzjkVarZzB.zzp().ordinal();
        if (iOrdinal == 1) {
            zzanVarZzd.zzc(zzjj.AD_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            zzanVarZzd.zzb(zzjj.AD_STORAGE, zzjkVarZzB.zzb());
        } else {
            zzanVarZzd.zzc(zzjj.AD_STORAGE, zzam.FAILSAFE);
        }
        int iOrdinal2 = zzjkVarZzB.zzq().ordinal();
        if (iOrdinal2 == 1) {
            zzanVarZzd.zzc(zzjj.ANALYTICS_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            zzanVarZzd.zzb(zzjj.ANALYTICS_STORAGE, zzjkVarZzB.zzb());
        } else {
            zzanVarZzd.zzc(zzjj.ANALYTICS_STORAGE, zzam.FAILSAFE);
        }
        String strZzc2 = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzaz zzazVarZzz = zzz(strZzc2, zzx(strZzc2), zzB(strZzc2), zzanVarZzd);
        zzicVar.zzaD(((Boolean) Preconditions.checkNotNull(zzazVarZzz.zzj())).booleanValue());
        if (!TextUtils.isEmpty(zzazVarZzz.zzk())) {
            zzicVar.zzaF(zzazVarZzz.zzk());
        }
        zzaW().zzg();
        zzu();
        Iterator it = zzicVar.zzk().iterator();
        do {
            if (!it.hasNext()) {
                zziuVar = null;
                break;
            }
            zziuVar = (com.google.android.gms.internal.measurement.zziu) it.next();
        } while (!"_npa".equals(zziuVar.zzc()));
        if (zziuVar != null) {
            zzjj zzjjVar = zzjj.AD_PERSONALIZATION;
            if (zzanVarZzd.zza(zzjjVar) == zzam.UNSET) {
                zzpm zzpmVarZzm = zzj().zzm(zzhVar.zzc(), "_npa");
                if (zzpmVarZzm != null) {
                    String str = zzpmVarZzm.zzb;
                    if ("tcf".equals(str)) {
                        zzanVarZzd.zzc(zzjjVar, zzam.TCF);
                    } else if ("app".equals(str)) {
                        zzanVarZzd.zzc(zzjjVar, zzam.API);
                    } else {
                        zzanVarZzd.zzc(zzjjVar, zzam.MANIFEST);
                    }
                } else {
                    Boolean boolZzae = zzhVar.zzae();
                    if (boolZzae == null || ((boolZzae.booleanValue() && zziuVar.zzg() != 1) || !(boolZzae.booleanValue() || zziuVar.zzg() == 0))) {
                        zzanVarZzd.zzc(zzjjVar, zzam.API);
                    } else {
                        zzanVarZzd.zzc(zzjjVar, zzam.MANIFEST);
                    }
                }
            }
        } else {
            int iZzaB = zzaB(zzhVar.zzc(), zzanVarZzd);
            com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
            zzitVarZzm.zzb("_npa");
            zzitVarZzm.zza(zzaZ().currentTimeMillis());
            zzitVarZzm.zze(iZzaB);
            zzicVar.zzo((com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc());
            zzaV().zzk().zzc("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iZzaB));
        }
        zzicVar.zzaB(zzanVarZzd.toString());
        boolean zZzy = this.zzc.zzy(zzhVar.zzc());
        List listZzb = zzicVar.zzb();
        int i11 = 0;
        for (int i12 = 0; i12 < listZzb.size(); i12++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.zzhs) listZzb.get(i12)).zzd())) {
                com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) ((com.google.android.gms.internal.measurement.zzhs) listZzb.get(i12)).zzcl();
                List listZza = zzhrVar.zza();
                for (int i13 = 0; i13 < listZza.size(); i13++) {
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i13)).zzb())) {
                        String strZzd = ((com.google.android.gms.internal.measurement.zzhw) listZza.get(i13)).zzd();
                        if (zZzy && strZzd.length() > 4) {
                            char[] charArray = strZzd.toCharArray();
                            for (int i14 = 1; i14 < 64; i14++) {
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i14)) {
                                    i11 = i14;
                                    break;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i11);
                            strZzd = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                        zzhvVarZzn.zzb("_tcfd");
                        zzhvVarZzn.zzd(strZzd);
                        zzhrVar.zze(i13, zzhvVarZzn);
                        break;
                    }
                }
                zzicVar.zzf(i12, zzhrVar);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x023a  */
    /* JADX WARN: Code duplicated, block: B:115:0x024c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0259  */
    /* JADX WARN: Code duplicated, block: B:119:0x0267  */
    /* JADX WARN: Code duplicated, block: B:145:0x0384  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:175:0x045e A[LOOP:10: B:151:0x03da->B:175:0x045e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x0462  */
    /* JADX WARN: Code duplicated, block: B:177:0x0464 A[PHI: r10 r16 r23
      0x0464: PHI (r10v39 java.util.List) = (r10v40 java.util.List), (r10v38 java.util.List) binds: [B:184:0x048a, B:176:0x0462] A[DONT_GENERATE, DONT_INLINE]
      0x0464: PHI (r16v6 java.util.List) = (r16v7 java.util.List), (r16v13 java.util.List) binds: [B:184:0x048a, B:176:0x0462] A[DONT_GENERATE, DONT_INLINE]
      0x0464: PHI (r23v11 android.database.Cursor) = (r23v12 android.database.Cursor), (r23v22 android.database.Cursor) binds: [B:184:0x048a, B:176:0x0462] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x006f A[PHI: r0 r10 r23
      0x006f: PHI (r0v117 java.util.List) = (r0v8 java.util.List), (r0v141 java.util.List) binds: [B:108:0x022e, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r10v57 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v59 android.database.Cursor) binds: [B:108:0x022e, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r23v27 long) = (r23v2 long), (r23v28 long) binds: [B:108:0x022e, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:189:0x0498  */
    /* JADX WARN: Code duplicated, block: B:191:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:197:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:200:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:202:0x0500  */
    /* JADX WARN: Code duplicated, block: B:204:0x0503  */
    /* JADX WARN: Code duplicated, block: B:206:0x0509 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x050b  */
    /* JADX WARN: Code duplicated, block: B:208:0x050d  */
    /* JADX WARN: Code duplicated, block: B:209:0x050f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0511  */
    /* JADX WARN: Code duplicated, block: B:211:0x0516  */
    /* JADX WARN: Code duplicated, block: B:214:0x0526  */
    /* JADX WARN: Code duplicated, block: B:216:0x0529  */
    /* JADX WARN: Code duplicated, block: B:217:0x052b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0562  */
    /* JADX WARN: Code duplicated, block: B:224:0x0566  */
    /* JADX WARN: Code duplicated, block: B:228:0x056f  */
    /* JADX WARN: Code duplicated, block: B:231:0x057d  */
    /* JADX WARN: Code duplicated, block: B:234:0x0587  */
    /* JADX WARN: Code duplicated, block: B:239:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:242:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:245:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:251:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:254:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:257:0x0624  */
    /* JADX WARN: Code duplicated, block: B:259:0x0667  */
    /* JADX WARN: Code duplicated, block: B:261:0x066c  */
    /* JADX WARN: Code duplicated, block: B:263:0x0674  */
    /* JADX WARN: Code duplicated, block: B:266:0x067c  */
    /* JADX WARN: Code duplicated, block: B:268:0x0681  */
    /* JADX WARN: Code duplicated, block: B:271:0x068e  */
    /* JADX WARN: Code duplicated, block: B:275:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:278:0x06be  */
    /* JADX WARN: Code duplicated, block: B:282:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:286:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:289:0x070e  */
    /* JADX WARN: Code duplicated, block: B:294:0x072c  */
    /* JADX WARN: Code duplicated, block: B:296:0x0734  */
    /* JADX WARN: Code duplicated, block: B:300:0x0745  */
    /* JADX WARN: Code duplicated, block: B:302:0x0751  */
    /* JADX WARN: Code duplicated, block: B:305:0x076c  */
    /* JADX WARN: Code duplicated, block: B:310:0x0789  */
    /* JADX WARN: Code duplicated, block: B:312:0x0797  */
    /* JADX WARN: Code duplicated, block: B:314:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:315:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:318:0x07b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:319:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:320:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:322:0x07bd A[PHI: r8
      0x07bd: PHI (r8v6 boolean) = (r8v5 boolean), (r8v11 boolean) binds: [B:317:0x07b3, B:319:0x07b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:325:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:331:0x0801  */
    /* JADX WARN: Code duplicated, block: B:334:0x0812  */
    /* JADX WARN: Code duplicated, block: B:338:0x0828 A[LOOP:7: B:336:0x0822->B:338:0x0828, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:341:0x0853  */
    /* JADX WARN: Code duplicated, block: B:342:0x0856  */
    /* JADX WARN: Code duplicated, block: B:345:0x086b  */
    /* JADX WARN: Code duplicated, block: B:348:0x089d A[LOOP:8: B:346:0x0897->B:348:0x089d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:351:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:353:0x091c  */
    /* JADX WARN: Code duplicated, block: B:354:0x091f  */
    /* JADX WARN: Code duplicated, block: B:356:0x0928  */
    /* JADX WARN: Code duplicated, block: B:358:0x0935  */
    /* JADX WARN: Code duplicated, block: B:359:0x0938  */
    /* JADX WARN: Code duplicated, block: B:362:0x0947  */
    /* JADX WARN: Code duplicated, block: B:364:0x094a  */
    /* JADX WARN: Code duplicated, block: B:367:0x0957 A[LOOP:9: B:365:0x0951->B:367:0x0957, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:370:0x0992  */
    /* JADX WARN: Code duplicated, block: B:372:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:375:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:377:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:383:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:429:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x059b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:? A[LOOP:2: B:232:0x0581->B:431:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x071d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x06d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x06f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x07e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x07dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:? A[LOOP:6: B:323:0x07cb->B:444:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x041b A[EDGE_INSN: B:448:0x041b->B:164:0x041b BREAK  A[LOOP:10: B:151:0x03da->B:175:0x045e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x052c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:? A[RETURN, SYNTHETIC] */
    @VisibleForTesting
    public final void zzN(String str, long j11) throws Throwable {
        long j12;
        Cursor cursor;
        Cursor cursorQuery;
        List list;
        List<Pair> listSubList;
        zzal zzalVarZzd;
        zzfw zzfwVar;
        zzjk zzjkVarZzB;
        zzjj zzjjVar;
        com.google.android.gms.internal.measurement.zzhz zzhzVarZzh;
        int size;
        List arrayList;
        boolean z11;
        boolean zZzo;
        boolean zZzo2;
        boolean zZzp;
        zzot zzotVar;
        zzos zzosVarZza;
        int i11;
        com.google.android.gms.internal.measurement.zzib zzibVar;
        List arrayList2;
        boolean z12;
        Iterator it;
        String string;
        com.google.android.gms.internal.measurement.zzhz zzhzVarZzi;
        String strZzc;
        ArrayList arrayList3;
        Iterator it2;
        Object objZzh;
        com.google.android.gms.internal.measurement.zzib zzibVar2;
        Object objZzi;
        com.google.android.gms.internal.measurement.zzhz zzhzVar;
        int i12;
        com.google.android.gms.internal.measurement.zzhz zzhzVarZzh2;
        String strZzc2;
        zzos zzosVar;
        zzlr zzlrVar;
        zzlr zzlrVar2;
        boolean z13;
        com.google.android.gms.internal.measurement.zzic zzicVar;
        boolean z14;
        boolean z15;
        String strZzP;
        ArrayList arrayList4;
        Iterator it3;
        boolean z16;
        Long lValueOf;
        Long lValueOf2;
        boolean z17;
        boolean z18;
        List list2;
        boolean z19;
        int i13;
        com.google.android.gms.internal.measurement.zzhs zzhsVar;
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF;
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF2;
        com.google.android.gms.internal.measurement.zzis zzisVarZzd;
        Iterator it4;
        String strZzG;
        int i14;
        com.google.android.gms.internal.measurement.zzid zzidVar;
        com.google.android.gms.internal.measurement.zzid zzidVar2;
        ArrayList arrayList5;
        zzav zzavVarZzj;
        List arrayList6;
        List list3;
        Cursor cursor2;
        Cursor cursorQuery2;
        Iterator it5;
        boolean z21;
        com.google.android.gms.internal.measurement.zzic zzicVar2;
        com.google.android.gms.internal.measurement.zzgf zzgfVarZzx;
        ArrayList arrayList7;
        int i15;
        List list4;
        int i16;
        int i17;
        int iZzd;
        SQLiteDatabase sQLiteDatabaseZze;
        long jCurrentTimeMillis;
        Cursor cursor3;
        com.google.android.gms.internal.measurement.zzid zzidVar3;
        long jZzg;
        long j13;
        long jZzg2;
        int iZzm = zzd().zzm(str, zzfx.zzg);
        int i18 = 0;
        int iMax = Math.max(0, zzd().zzm(str, zzfx.zzh));
        zzav zzavVarZzj2 = zzj();
        zzavVarZzj2.zzg();
        zzavVarZzj2.zzay();
        int i19 = 1;
        Preconditions.checkArgument(iZzm > 0);
        Preconditions.checkArgument(iMax > 0);
        Preconditions.checkNotEmpty(str);
        try {
            try {
                j12 = -1;
                try {
                    cursorQuery = zzavVarZzj2.zze().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(iZzm));
                    try {
                        if (cursorQuery.moveToFirst()) {
                            listSubList = new ArrayList();
                            int length = 0;
                            while (true) {
                                long j14 = cursorQuery.getLong(i18);
                                try {
                                    byte[] blob = cursorQuery.getBlob(i19);
                                    zzpj zzpjVarZzp = zzavVarZzj2.zzg.zzp();
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i21 = gZIPInputStream.read(bArr);
                                            if (i21 <= 0) {
                                                break;
                                            }
                                            cursor3 = cursorQuery;
                                            try {
                                                byteArrayOutputStream.write(bArr, 0, i21);
                                                cursorQuery = cursor3;
                                            } catch (IOException e11) {
                                                e = e11;
                                            }
                                            try {
                                                zzpjVarZzp.zzu.zzaV().zzb().zzb("Failed to ungzip content", e);
                                                throw e;
                                            } catch (IOException e12) {
                                                e = e12;
                                                zzavVarZzj2.zzu.zzaV().zzb().zzc("Failed to unzip queued bundle. appId", zzgt.zzl(str), e);
                                                try {
                                                    if (cursor3.moveToNext()) {
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                    cursor3.close();
                                                } catch (SQLiteException e13) {
                                                    e = e13;
                                                    cursorQuery = cursor3;
                                                    try {
                                                        zzavVarZzj2.zzu.zzaV().zzb().zzc("Error querying bundles. appId", zzgt.zzl(str), e);
                                                        list = Collections.EMPTY_LIST;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        listSubList = list;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        cursor = cursorQuery;
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    cursor = cursor3;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    throw th;
                                                }
                                                if (listSubList.isEmpty()) {
                                                    return;
                                                }
                                                com.google.android.gms.internal.measurement.zzpk.zza();
                                                zzalVarZzd = zzd();
                                                zzfwVar = zzfx.zzbi;
                                                if (zzalVarZzd.zzp(null, zzfwVar)) {
                                                    com.google.android.gms.internal.measurement.zzpk.zza();
                                                    if (zzd().zzp(null, zzfwVar)) {
                                                        if (zzB(str).zzo(zzjj.ANALYTICS_STORAGE)) {
                                                            arrayList5 = new ArrayList(listSubList.size());
                                                            zzavVarZzj = zzj();
                                                            Preconditions.checkNotEmpty(str);
                                                            zzavVarZzj.zzg();
                                                            zzavVarZzj.zzay();
                                                            arrayList6 = new ArrayList();
                                                            sQLiteDatabaseZze = zzavVarZzj.zze();
                                                            jCurrentTimeMillis = zzavVarZzj.zzu.zzaZ().currentTimeMillis();
                                                            cursorQuery2 = sQLiteDatabaseZze.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                            list3 = listSubList;
                                                            if (cursorQuery2.moveToFirst()) {
                                                                while (true) {
                                                                    arrayList6.add((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(0))).zzbc());
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    cursorQuery2 = cursorQuery2;
                                                                }
                                                                cursorQuery2.close();
                                                                int iDelete = sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)});
                                                                zzgr zzgrVarZzk = zzavVarZzj.zzu.zzaV().zzk();
                                                                StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 34);
                                                                sb2.append("Pruned ");
                                                                sb2.append(iDelete);
                                                                sb2.append(" NO_DATA mode events. appId");
                                                                zzgrVarZzk.zzb(sb2.toString(), str);
                                                            } else {
                                                                cursorQuery2 = cursorQuery2;
                                                                cursorQuery2.close();
                                                            }
                                                            it5 = list3.iterator();
                                                            z21 = true;
                                                            while (it5.hasNext()) {
                                                                Pair pair = (Pair) it5.next();
                                                                zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) pair.first).zzcl();
                                                                if (z21) {
                                                                    List listZzb = zzicVar2.zzb();
                                                                    zzicVar2.zzi();
                                                                    zzicVar2.zzh(arrayList6);
                                                                    zzicVar2.zzh(listZzb);
                                                                    z21 = false;
                                                                }
                                                                com.google.android.gms.internal.measurement.zzhh zzhhVarZzb = com.google.android.gms.internal.measurement.zzho.zzb();
                                                                zzgfVarZzx = zzh().zzx(str);
                                                                arrayList7 = new ArrayList();
                                                                if (zzgfVarZzx != null) {
                                                                    for (com.google.android.gms.internal.measurement.zzfu zzfuVar : zzgfVarZzx.zza()) {
                                                                        com.google.android.gms.internal.measurement.zzhk zzhkVarZza = com.google.android.gms.internal.measurement.zzhl.zza();
                                                                        int iZzb = zzfuVar.zzb();
                                                                        zzjh zzjhVar = zzjh.UNINITIALIZED;
                                                                        Iterator it6 = it5;
                                                                        i15 = iZzb - 1;
                                                                        boolean z22 = z21;
                                                                        if (i15 == 1) {
                                                                            list4 = arrayList6;
                                                                            i16 = 3;
                                                                            i17 = 2;
                                                                        } else if (i15 != 2) {
                                                                            list4 = arrayList6;
                                                                            i16 = 3;
                                                                            if (i15 == 3) {
                                                                                i17 = 4;
                                                                            } else if (i15 != 4) {
                                                                                i17 = 1;
                                                                            } else {
                                                                                i17 = 5;
                                                                            }
                                                                        } else {
                                                                            list4 = arrayList6;
                                                                            i16 = 3;
                                                                            i17 = 3;
                                                                        }
                                                                        zzhkVarZza.zza(i17);
                                                                        iZzd = zzfuVar.zzd() - 1;
                                                                        if (iZzd == 1) {
                                                                            i16 = 2;
                                                                        } else if (iZzd != 2) {
                                                                            i16 = 1;
                                                                        }
                                                                        zzhkVarZza.zzb(i16);
                                                                        arrayList7.add((com.google.android.gms.internal.measurement.zzhl) zzhkVarZza.zzbc());
                                                                        z21 = z22;
                                                                        it5 = it6;
                                                                        arrayList6 = list4;
                                                                    }
                                                                }
                                                                Iterator it7 = it5;
                                                                boolean z23 = z21;
                                                                List list5 = arrayList6;
                                                                zzhhVarZzb.zza(arrayList7);
                                                                zzicVar2.zzaQ(zzhhVarZzb);
                                                                arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc(), (Long) pair.second));
                                                                z21 = z23;
                                                                it5 = it7;
                                                                arrayList6 = list5;
                                                            }
                                                            listSubList = arrayList5;
                                                        } else {
                                                            arrayList5 = new ArrayList(listSubList.size());
                                                            zzavVarZzj = zzj();
                                                            Preconditions.checkNotEmpty(str);
                                                            zzavVarZzj.zzg();
                                                            zzavVarZzj.zzay();
                                                            arrayList6 = new ArrayList();
                                                            try {
                                                                try {
                                                                    sQLiteDatabaseZze = zzavVarZzj.zze();
                                                                    jCurrentTimeMillis = zzavVarZzj.zzu.zzaZ().currentTimeMillis();
                                                                    cursorQuery2 = sQLiteDatabaseZze.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                                    list3 = listSubList;
                                                                    try {
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            while (true) {
                                                                                try {
                                                                                    arrayList6.add((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(0))).zzbc());
                                                                                } catch (com.google.android.gms.internal.measurement.zzmq e14) {
                                                                                    zzavVarZzj.zzu.zzaV().zzh().zzc("Failed to parse stored NO_DATA mode event, appId", zzgt.zzl(str), e14);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                        } else {
                                                                                            cursorQuery2 = cursorQuery2;
                                                                                        }
                                                                                    } catch (SQLiteException e15) {
                                                                                        e = e15;
                                                                                        zzavVarZzj.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgt.zzl(str), e);
                                                                                        arrayList6 = Collections.EMPTY_LIST;
                                                                                        if (cursorQuery2 != null) {
                                                                                            cursorQuery2.close();
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    cursor2 = cursorQuery2;
                                                                                    if (cursor2 != null) {
                                                                                        cursor2.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                            cursorQuery2.close();
                                                                            try {
                                                                                int iDelete2 = sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)});
                                                                                zzgr zzgrVarZzk2 = zzavVarZzj.zzu.zzaV().zzk();
                                                                                StringBuilder sb3 = new StringBuilder(String.valueOf(iDelete2).length() + 34);
                                                                                sb3.append("Pruned ");
                                                                                sb3.append(iDelete2);
                                                                                sb3.append(" NO_DATA mode events. appId");
                                                                                zzgrVarZzk2.zzb(sb3.toString(), str);
                                                                            } catch (SQLiteException e16) {
                                                                                e = e16;
                                                                                cursorQuery2 = null;
                                                                                zzavVarZzj.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgt.zzl(str), e);
                                                                                arrayList6 = Collections.EMPTY_LIST;
                                                                                if (cursorQuery2 != null) {
                                                                                    cursorQuery2.close();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cursorQuery2 = cursorQuery2;
                                                                            cursorQuery2.close();
                                                                        }
                                                                    } catch (SQLiteException e17) {
                                                                        e = e17;
                                                                        cursorQuery2 = cursorQuery2;
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        cursorQuery2 = cursorQuery2;
                                                                        cursor2 = cursorQuery2;
                                                                        if (cursor2 != null) {
                                                                            cursor2.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    cursor2 = null;
                                                                    if (cursor2 != null) {
                                                                        cursor2.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (SQLiteException e18) {
                                                                e = e18;
                                                                list3 = listSubList;
                                                            }
                                                            it5 = list3.iterator();
                                                            z21 = true;
                                                            while (it5.hasNext()) {
                                                                Pair pair2 = (Pair) it5.next();
                                                                zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) pair2.first).zzcl();
                                                                if (z21) {
                                                                    List listZzb2 = zzicVar2.zzb();
                                                                    zzicVar2.zzi();
                                                                    zzicVar2.zzh(arrayList6);
                                                                    zzicVar2.zzh(listZzb2);
                                                                    z21 = false;
                                                                }
                                                                com.google.android.gms.internal.measurement.zzhh zzhhVarZzb2 = com.google.android.gms.internal.measurement.zzho.zzb();
                                                                zzgfVarZzx = zzh().zzx(str);
                                                                arrayList7 = new ArrayList();
                                                                if (zzgfVarZzx != null) {
                                                                    while (r12.hasNext()) {
                                                                        com.google.android.gms.internal.measurement.zzhk zzhkVarZza2 = com.google.android.gms.internal.measurement.zzhl.zza();
                                                                        int iZzb2 = zzfuVar.zzb();
                                                                        zzjh zzjhVar2 = zzjh.UNINITIALIZED;
                                                                        Iterator it8 = it5;
                                                                        i15 = iZzb2 - 1;
                                                                        boolean z24 = z21;
                                                                        if (i15 == 1) {
                                                                            list4 = arrayList6;
                                                                            i16 = 3;
                                                                            i17 = 2;
                                                                        } else if (i15 != 2) {
                                                                            list4 = arrayList6;
                                                                            i16 = 3;
                                                                            if (i15 == 3) {
                                                                                i17 = 4;
                                                                            } else if (i15 != 4) {
                                                                                i17 = 1;
                                                                            } else {
                                                                                i17 = 5;
                                                                            }
                                                                        } else {
                                                                            list4 = arrayList6;
                                                                            i16 = 3;
                                                                            i17 = 3;
                                                                        }
                                                                        zzhkVarZza2.zza(i17);
                                                                        iZzd = zzfuVar.zzd() - 1;
                                                                        if (iZzd == 1) {
                                                                            i16 = 2;
                                                                        } else if (iZzd != 2) {
                                                                            i16 = 1;
                                                                        }
                                                                        zzhkVarZza2.zzb(i16);
                                                                        arrayList7.add((com.google.android.gms.internal.measurement.zzhl) zzhkVarZza2.zzbc());
                                                                        z21 = z24;
                                                                        it5 = it8;
                                                                        arrayList6 = list4;
                                                                    }
                                                                }
                                                                Iterator it9 = it5;
                                                                boolean z25 = z21;
                                                                List list6 = arrayList6;
                                                                zzhhVarZzb2.zza(arrayList7);
                                                                zzicVar2.zzaQ(zzhhVarZzb2);
                                                                arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc(), (Long) pair2.second));
                                                                z21 = z25;
                                                                it5 = it9;
                                                                arrayList6 = list6;
                                                            }
                                                            listSubList = arrayList5;
                                                        }
                                                    }
                                                    if (listSubList.isEmpty()) {
                                                        return;
                                                    }
                                                }
                                                zzjkVarZzB = zzB(str);
                                                zzjjVar = zzjj.AD_STORAGE;
                                                if (zzjkVarZzB.zzo(zzjjVar)) {
                                                    it4 = listSubList.iterator();
                                                    while (true) {
                                                        if (!it4.hasNext()) {
                                                            strZzG = null;
                                                            break;
                                                        }
                                                        zzidVar2 = (com.google.android.gms.internal.measurement.zzid) ((Pair) it4.next()).first;
                                                        if (!zzidVar2.zzG().isEmpty()) {
                                                            strZzG = zzidVar2.zzG();
                                                            break;
                                                        }
                                                    }
                                                    if (strZzG != null) {
                                                        for (i14 = 0; i14 < listSubList.size(); i14++) {
                                                            zzidVar = (com.google.android.gms.internal.measurement.zzid) ((Pair) listSubList.get(i14)).first;
                                                            if (!zzidVar.zzG().isEmpty()) {
                                                                listSubList = listSubList.subList(0, i14);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                zzhzVarZzh = com.google.android.gms.internal.measurement.zzib.zzh();
                                                size = listSubList.size();
                                                arrayList = new ArrayList(listSubList.size());
                                                if (zzd().zzC(str)) {
                                                    z11 = false;
                                                } else {
                                                    z11 = false;
                                                }
                                                zZzo = zzB(str).zzo(zzjjVar);
                                                zZzo2 = zzB(str).zzo(zzjj.ANALYTICS_STORAGE);
                                                zzqu.zza();
                                                zZzp = zzd().zzp(str, zzfx.zzaM);
                                                zzotVar = this.zzl;
                                                zzosVarZza = zzotVar.zza(str);
                                                i11 = 0;
                                                while (i11 < size) {
                                                    z13 = zZzo;
                                                    zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) ((Pair) listSubList.get(i11)).first).zzcl();
                                                    int i22 = size;
                                                    arrayList.add((Long) ((Pair) listSubList.get(i11)).second);
                                                    zzd().zzi();
                                                    z14 = z11;
                                                    z15 = zZzo2;
                                                    zzicVar.zzO(130000L);
                                                    zzicVar.zzs(j11);
                                                    this.zzn.zzaU();
                                                    zzicVar.zzae(false);
                                                    if (!z14) {
                                                        zzicVar.zzan();
                                                    }
                                                    if (!z13) {
                                                        zzicVar.zzR();
                                                        zzicVar.zzU();
                                                    }
                                                    if (!z15) {
                                                        zzicVar.zzX();
                                                    }
                                                    zzS(str, zzicVar);
                                                    if (!zZzp) {
                                                        zzicVar.zzav();
                                                    }
                                                    if (!z15) {
                                                        zzicVar.zzag();
                                                    }
                                                    strZzP = zzicVar.zzP();
                                                    if (TextUtils.isEmpty(strZzP)) {
                                                        arrayList4 = new ArrayList(zzicVar.zzb());
                                                        it3 = arrayList4.iterator();
                                                        z16 = z14;
                                                        lValueOf = null;
                                                        lValueOf2 = null;
                                                        z17 = false;
                                                        z18 = false;
                                                        while (it3.hasNext()) {
                                                            listSubList = listSubList;
                                                            zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it3.next();
                                                            zZzp = zZzp;
                                                            i11 = i11;
                                                            if ("_fx".equals(zzhsVar.zzd())) {
                                                                it3.remove();
                                                                z17 = true;
                                                            } else if ("_f".equals(zzhsVar.zzd())) {
                                                                zzp();
                                                                zzhwVarZzF = zzpj.zzF(zzhsVar, "_pfo");
                                                                if (zzhwVarZzF != null) {
                                                                    lValueOf = Long.valueOf(zzhwVarZzF.zzf());
                                                                }
                                                                zzp();
                                                                zzhwVarZzF2 = zzpj.zzF(zzhsVar, "_uwa");
                                                                if (zzhwVarZzF2 != null) {
                                                                    lValueOf2 = Long.valueOf(zzhwVarZzF2.zzf());
                                                                }
                                                            } else {
                                                                zZzp = zZzp;
                                                                listSubList = listSubList;
                                                                i11 = i11;
                                                            }
                                                            z18 = true;
                                                        }
                                                        list2 = listSubList;
                                                        z19 = zZzp;
                                                        i13 = i11;
                                                        if (z17) {
                                                            zzicVar.zzi();
                                                            zzicVar.zzh(arrayList4);
                                                        }
                                                        if (z18) {
                                                            zzR(zzicVar.zzK(), true, lValueOf, lValueOf2);
                                                        }
                                                    } else {
                                                        arrayList4 = new ArrayList(zzicVar.zzb());
                                                        it3 = arrayList4.iterator();
                                                        z16 = z14;
                                                        lValueOf = null;
                                                        lValueOf2 = null;
                                                        z17 = false;
                                                        z18 = false;
                                                        while (it3.hasNext()) {
                                                            listSubList = listSubList;
                                                            zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it3.next();
                                                            zZzp = zZzp;
                                                            i11 = i11;
                                                            if ("_fx".equals(zzhsVar.zzd())) {
                                                                it3.remove();
                                                                z17 = true;
                                                            } else if ("_f".equals(zzhsVar.zzd())) {
                                                                zzp();
                                                                zzhwVarZzF = zzpj.zzF(zzhsVar, "_pfo");
                                                                if (zzhwVarZzF != null) {
                                                                    lValueOf = Long.valueOf(zzhwVarZzF.zzf());
                                                                }
                                                                zzp();
                                                                zzhwVarZzF2 = zzpj.zzF(zzhsVar, "_uwa");
                                                                if (zzhwVarZzF2 != null) {
                                                                    lValueOf2 = Long.valueOf(zzhwVarZzF2.zzf());
                                                                }
                                                            } else {
                                                                zZzp = zZzp;
                                                                listSubList = listSubList;
                                                                i11 = i11;
                                                            }
                                                            z18 = true;
                                                        }
                                                        list2 = listSubList;
                                                        z19 = zZzp;
                                                        i13 = i11;
                                                        if (z17) {
                                                            zzicVar.zzi();
                                                            zzicVar.zzh(arrayList4);
                                                        }
                                                        if (z18) {
                                                            zzR(zzicVar.zzK(), true, lValueOf, lValueOf2);
                                                        }
                                                    }
                                                    if (zzicVar.zzc() != 0) {
                                                        if (zzd().zzp(str, zzfx.zzaC)) {
                                                            zzicVar.zzas(zzp().zzt(((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc()).zzcc()));
                                                        }
                                                        zzisVarZzd = zzosVarZza.zzd();
                                                        if (zzisVarZzd != null) {
                                                            zzicVar.zzaN(zzisVarZzd);
                                                        }
                                                        zzhzVarZzh.zze(zzicVar);
                                                    }
                                                    i11 = i13 + 1;
                                                    zZzo2 = z15;
                                                    zZzo = z13;
                                                    size = i22;
                                                    z11 = z16;
                                                    zZzp = z19;
                                                    listSubList = list2;
                                                }
                                                if (zzhzVarZzh.zzb() == 0) {
                                                    zzL(arrayList);
                                                    zzU(false, 204, null, null, str, Collections.EMPTY_LIST);
                                                    return;
                                                }
                                                zzibVar = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                                                arrayList2 = new ArrayList();
                                                if (zzosVarZza.zzc() == zzlr.SGTM_CLIENT) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (zzosVarZza.zzc() == zzlr.SGTM) {
                                                    it = ((com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc()).zza().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            if (((com.google.android.gms.internal.measurement.zzid) it.next()).zzY()) {
                                                                string = UUID.randomUUID().toString();
                                                                break;
                                                            }
                                                        } else {
                                                            string = null;
                                                            break;
                                                        }
                                                    }
                                                    com.google.android.gms.internal.measurement.zzib zzibVar3 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                                                    zzaW().zzg();
                                                    zzu();
                                                    zzhzVarZzi = com.google.android.gms.internal.measurement.zzib.zzi(zzibVar3);
                                                    if (!TextUtils.isEmpty(string)) {
                                                        zzhzVarZzi.zzi(string);
                                                    }
                                                    strZzc = zzh().zzc(str);
                                                    if (!TextUtils.isEmpty(strZzc)) {
                                                        zzhzVarZzi.zzj(strZzc);
                                                    }
                                                    arrayList3 = new ArrayList();
                                                    it2 = zzibVar3.zza().iterator();
                                                    while (it2.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzic zzicVarZzaF = com.google.android.gms.internal.measurement.zzid.zzaF((com.google.android.gms.internal.measurement.zzid) it2.next());
                                                        zzicVarZzaF.zzan();
                                                        arrayList3.add((com.google.android.gms.internal.measurement.zzid) zzicVarZzaF.zzbc());
                                                    }
                                                    zzhzVarZzi.zzg();
                                                    zzhzVarZzi.zzf(arrayList3);
                                                    zzgr zzgrVarZzk3 = zzaV().zzk();
                                                    if (TextUtils.isEmpty(string)) {
                                                        objZzh = "null";
                                                    } else {
                                                        objZzh = zzhzVarZzi.zzh();
                                                    }
                                                    zzgrVarZzk3.zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", objZzh);
                                                    zzibVar2 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzi.zzbc();
                                                    if (TextUtils.isEmpty(string)) {
                                                        objZzi = null;
                                                    } else {
                                                        com.google.android.gms.internal.measurement.zzib zzibVar4 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                                                        zzaW().zzg();
                                                        zzu();
                                                        zzhzVarZzh2 = com.google.android.gms.internal.measurement.zzib.zzh();
                                                        zzaV().zzk().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", string);
                                                        zzhzVarZzh2.zzi(string);
                                                        for (com.google.android.gms.internal.measurement.zzid zzidVar4 : zzibVar4.zza()) {
                                                            com.google.android.gms.internal.measurement.zzic zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                                                            zzicVarZzaE.zzam(zzidVar4.zzZ());
                                                            zzicVarZzaE.zzaJ(zzidVar4.zzav());
                                                            zzhzVarZzh2.zze(zzicVarZzaE);
                                                        }
                                                        com.google.android.gms.internal.measurement.zzib zzibVar5 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh2.zzbc();
                                                        strZzc2 = zzotVar.zzg.zzh().zzc(str);
                                                        if (TextUtils.isEmpty(strZzc2)) {
                                                            objZzi = null;
                                                            String str2 = (String) zzfx.zzr.zzb(null);
                                                            if (z12) {
                                                                zzlrVar = zzlr.GOOGLE_SIGNAL_PENDING;
                                                            } else {
                                                                zzlrVar = zzlr.GOOGLE_SIGNAL;
                                                            }
                                                            zzosVar = new zzos(str2, Collections.EMPTY_MAP, zzlrVar, null);
                                                        } else {
                                                            Uri uri = Uri.parse((String) zzfx.zzr.zzb(null));
                                                            Uri.Builder builderBuildUpon = uri.buildUpon();
                                                            String authority = uri.getAuthority();
                                                            StringBuilder sb4 = new StringBuilder(String.valueOf(strZzc2).length() + 1 + String.valueOf(authority).length());
                                                            sb4.append(strZzc2);
                                                            sb4.append(C33978va.f72339h);
                                                            sb4.append(authority);
                                                            builderBuildUpon.authority(sb4.toString());
                                                            String string2 = builderBuildUpon.build().toString();
                                                            if (z12) {
                                                                zzlrVar2 = zzlr.GOOGLE_SIGNAL_PENDING;
                                                            } else {
                                                                zzlrVar2 = zzlr.GOOGLE_SIGNAL;
                                                            }
                                                            objZzi = null;
                                                            zzosVar = new zzos(string2, Collections.EMPTY_MAP, zzlrVar2, null);
                                                        }
                                                        arrayList2.add(Pair.create(zzibVar5, zzosVar));
                                                    }
                                                    if (z12) {
                                                        zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar2.zzcl();
                                                        for (i12 = 0; i12 < zzibVar2.zzb(); i12++) {
                                                            com.google.android.gms.internal.measurement.zzic zzicVar3 = (com.google.android.gms.internal.measurement.zzic) zzibVar2.zzc(i12).zzcl();
                                                            zzicVar3.zzt();
                                                            zzicVar3.zzaO(j11);
                                                            zzhzVar.zzd(i12, zzicVar3);
                                                        }
                                                        arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc(), zzosVarZza));
                                                        zzL(arrayList);
                                                        zzU(false, 204, null, null, str, arrayList2);
                                                        if (zzO(str, zzosVarZza.zza())) {
                                                            zzaV().zzk().zzb("[sgtm] Sending sgtm batches available notification to app", str);
                                                            Intent intent = new Intent();
                                                            intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                            intent.setPackage(str);
                                                            zzaP(this.zzn.zzaY(), intent);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    zzibVar = zzibVar2;
                                                } else if (z12) {
                                                    z12 = true;
                                                    it = ((com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc()).zza().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            if (((com.google.android.gms.internal.measurement.zzid) it.next()).zzY()) {
                                                                string = UUID.randomUUID().toString();
                                                                break;
                                                            }
                                                        } else {
                                                            string = null;
                                                            break;
                                                        }
                                                    }
                                                    com.google.android.gms.internal.measurement.zzib zzibVar6 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                                                    zzaW().zzg();
                                                    zzu();
                                                    zzhzVarZzi = com.google.android.gms.internal.measurement.zzib.zzi(zzibVar6);
                                                    if (!TextUtils.isEmpty(string)) {
                                                        zzhzVarZzi.zzi(string);
                                                    }
                                                    strZzc = zzh().zzc(str);
                                                    if (!TextUtils.isEmpty(strZzc)) {
                                                        zzhzVarZzi.zzj(strZzc);
                                                    }
                                                    arrayList3 = new ArrayList();
                                                    it2 = zzibVar6.zza().iterator();
                                                    while (it2.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzic zzicVarZzaF2 = com.google.android.gms.internal.measurement.zzid.zzaF((com.google.android.gms.internal.measurement.zzid) it2.next());
                                                        zzicVarZzaF2.zzan();
                                                        arrayList3.add((com.google.android.gms.internal.measurement.zzid) zzicVarZzaF2.zzbc());
                                                    }
                                                    zzhzVarZzi.zzg();
                                                    zzhzVarZzi.zzf(arrayList3);
                                                    zzgr zzgrVarZzk4 = zzaV().zzk();
                                                    if (TextUtils.isEmpty(string)) {
                                                        objZzh = "null";
                                                    } else {
                                                        objZzh = zzhzVarZzi.zzh();
                                                    }
                                                    zzgrVarZzk4.zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", objZzh);
                                                    zzibVar2 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzi.zzbc();
                                                    if (TextUtils.isEmpty(string)) {
                                                        com.google.android.gms.internal.measurement.zzib zzibVar7 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                                                        zzaW().zzg();
                                                        zzu();
                                                        zzhzVarZzh2 = com.google.android.gms.internal.measurement.zzib.zzh();
                                                        zzaV().zzk().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", string);
                                                        zzhzVarZzh2.zzi(string);
                                                        while (r0.hasNext()) {
                                                            com.google.android.gms.internal.measurement.zzic zzicVarZzaE2 = com.google.android.gms.internal.measurement.zzid.zzaE();
                                                            zzicVarZzaE2.zzam(zzidVar4.zzZ());
                                                            zzicVarZzaE2.zzaJ(zzidVar4.zzav());
                                                            zzhzVarZzh2.zze(zzicVarZzaE2);
                                                        }
                                                        com.google.android.gms.internal.measurement.zzib zzibVar8 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh2.zzbc();
                                                        strZzc2 = zzotVar.zzg.zzh().zzc(str);
                                                        if (TextUtils.isEmpty(strZzc2)) {
                                                            Uri uri2 = Uri.parse((String) zzfx.zzr.zzb(null));
                                                            Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                                                            String authority2 = uri2.getAuthority();
                                                            StringBuilder sb5 = new StringBuilder(String.valueOf(strZzc2).length() + 1 + String.valueOf(authority2).length());
                                                            sb5.append(strZzc2);
                                                            sb5.append(C33978va.f72339h);
                                                            sb5.append(authority2);
                                                            builderBuildUpon2.authority(sb5.toString());
                                                            String string3 = builderBuildUpon2.build().toString();
                                                            if (z12) {
                                                                zzlrVar2 = zzlr.GOOGLE_SIGNAL_PENDING;
                                                            } else {
                                                                zzlrVar2 = zzlr.GOOGLE_SIGNAL;
                                                            }
                                                            objZzi = null;
                                                            zzosVar = new zzos(string3, Collections.EMPTY_MAP, zzlrVar2, null);
                                                        } else {
                                                            objZzi = null;
                                                            String str3 = (String) zzfx.zzr.zzb(null);
                                                            if (z12) {
                                                                zzlrVar = zzlr.GOOGLE_SIGNAL_PENDING;
                                                            } else {
                                                                zzlrVar = zzlr.GOOGLE_SIGNAL;
                                                            }
                                                            zzosVar = new zzos(str3, Collections.EMPTY_MAP, zzlrVar, null);
                                                        }
                                                        arrayList2.add(Pair.create(zzibVar8, zzosVar));
                                                    } else {
                                                        objZzi = null;
                                                    }
                                                    if (z12) {
                                                        zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar2.zzcl();
                                                        while (i12 < zzibVar2.zzb()) {
                                                            com.google.android.gms.internal.measurement.zzic zzicVar4 = (com.google.android.gms.internal.measurement.zzic) zzibVar2.zzc(i12).zzcl();
                                                            zzicVar4.zzt();
                                                            zzicVar4.zzaO(j11);
                                                            zzhzVar.zzd(i12, zzicVar4);
                                                        }
                                                        arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc(), zzosVarZza));
                                                        zzL(arrayList);
                                                        zzU(false, 204, null, null, str, arrayList2);
                                                        if (zzO(str, zzosVarZza.zza())) {
                                                            zzaV().zzk().zzb("[sgtm] Sending sgtm batches available notification to app", str);
                                                            Intent intent2 = new Intent();
                                                            intent2.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                            intent2.setPackage(str);
                                                            zzaP(this.zzn.zzaY(), intent2);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    zzibVar = zzibVar2;
                                                } else {
                                                    objZzi = null;
                                                }
                                                if (zzi().zzb()) {
                                                    if (Log.isLoggable(zzaV().zzn(), 2)) {
                                                        objZzi = zzp().zzi(zzibVar);
                                                    }
                                                    zzp();
                                                    byte[] bArrZzcc = zzibVar.zzcc();
                                                    zzL(arrayList);
                                                    this.zzk.zze.zzb(j11);
                                                    zzaV().zzk().zzd("Uploading data. app, uncompressed size, data", str, Integer.valueOf(bArrZzcc.length), objZzi);
                                                    this.zzv = true;
                                                    zzi().zzc(str, zzosVarZza, zzibVar, new zzov(this, str, arrayList2));
                                                }
                                            }
                                        }
                                        gZIPInputStream.close();
                                        byteArrayInputStream.close();
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        if (listSubList.isEmpty() || byteArray.length + length <= iMax) {
                                            try {
                                                com.google.android.gms.internal.measurement.zzic zzicVar5 = (com.google.android.gms.internal.measurement.zzic) zzpj.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), byteArray);
                                                if (!listSubList.isEmpty()) {
                                                    com.google.android.gms.internal.measurement.zzid zzidVar5 = (com.google.android.gms.internal.measurement.zzid) ((Pair) listSubList.get(0)).first;
                                                    com.google.android.gms.internal.measurement.zzid zzidVar6 = (com.google.android.gms.internal.measurement.zzid) zzicVar5.zzbc();
                                                    if (zzidVar5.zzaf().equals(zzidVar6.zzaf()) && zzidVar5.zzam().equals(zzidVar6.zzam()) && zzidVar5.zzao() == zzidVar6.zzao() && zzidVar5.zzaq().equals(zzidVar6.zzaq())) {
                                                        Iterator it10 = zzidVar5.zzf().iterator();
                                                        while (true) {
                                                            Iterator it11 = it10;
                                                            if (!it10.hasNext()) {
                                                                zzidVar3 = zzidVar6;
                                                                jZzg = -1;
                                                                break;
                                                            }
                                                            com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it11.next();
                                                            zzidVar3 = zzidVar6;
                                                            if ("_npa".equals(zziuVar.zzc())) {
                                                                jZzg = zziuVar.zzg();
                                                                break;
                                                            } else {
                                                                it10 = it11;
                                                                zzidVar6 = zzidVar3;
                                                            }
                                                        }
                                                        Iterator it12 = zzidVar3.zzf().iterator();
                                                        while (true) {
                                                            if (!it12.hasNext()) {
                                                                j13 = jZzg;
                                                                jZzg2 = -1;
                                                                break;
                                                            }
                                                            com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it12.next();
                                                            j13 = jZzg;
                                                            if ("_npa".equals(zziuVar2.zzc())) {
                                                                jZzg2 = zziuVar2.zzg();
                                                                break;
                                                            }
                                                            jZzg = j13;
                                                        }
                                                        if (j13 != jZzg2) {
                                                        }
                                                    }
                                                }
                                                if (!cursorQuery.isNull(2)) {
                                                    zzicVar5.zzao(cursorQuery.getInt(2));
                                                }
                                                length += byteArray.length;
                                                listSubList.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar5.zzbc(), Long.valueOf(j14)));
                                            } catch (IOException e19) {
                                                zzavVarZzj2.zzu.zzaV().zzb().zzc("Failed to merge queued bundle. appId", zzgt.zzl(str), e19);
                                            }
                                            cursor3 = cursorQuery;
                                            if (cursor3.moveToNext() || length > iMax) {
                                                break;
                                                break;
                                            } else {
                                                cursorQuery = cursor3;
                                                i18 = 0;
                                                i19 = 1;
                                            }
                                        }
                                        cursor3 = cursorQuery;
                                        break;
                                    } catch (IOException e21) {
                                        e = e21;
                                        cursor3 = cursorQuery;
                                    }
                                } catch (IOException e22) {
                                    e = e22;
                                    cursor3 = cursorQuery;
                                }
                            }
                            cursor3.close();
                        } else {
                            list = Collections.EMPTY_LIST;
                            cursorQuery.close();
                            listSubList = list;
                        }
                    } catch (SQLiteException e23) {
                        e = e23;
                        cursor3 = cursorQuery;
                    } catch (Throwable th7) {
                        th = th7;
                        cursor3 = cursorQuery;
                    }
                } catch (SQLiteException e24) {
                    e = e24;
                    cursorQuery = null;
                    zzavVarZzj2.zzu.zzaV().zzb().zzc("Error querying bundles. appId", zzgt.zzl(str), e);
                    list = Collections.EMPTY_LIST;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    listSubList = list;
                    if (listSubList.isEmpty()) {
                        return;
                    }
                    com.google.android.gms.internal.measurement.zzpk.zza();
                    zzalVarZzd = zzd();
                    zzfwVar = zzfx.zzbi;
                    if (zzalVarZzd.zzp(null, zzfwVar)) {
                        com.google.android.gms.internal.measurement.zzpk.zza();
                        if (zzd().zzp(null, zzfwVar)) {
                            if (zzB(str).zzo(zzjj.ANALYTICS_STORAGE)) {
                                arrayList5 = new ArrayList(listSubList.size());
                                zzavVarZzj = zzj();
                                Preconditions.checkNotEmpty(str);
                                zzavVarZzj.zzg();
                                zzavVarZzj.zzay();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseZze = zzavVarZzj.zze();
                                jCurrentTimeMillis = zzavVarZzj.zzu.zzaZ().currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseZze.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                list3 = listSubList;
                                if (cursorQuery2.moveToFirst()) {
                                    while (true) {
                                        arrayList6.add((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(0))).zzbc());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        }
                                        cursorQuery2 = cursorQuery2;
                                    }
                                    cursorQuery2.close();
                                    int iDelete3 = sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)});
                                    zzgr zzgrVarZzk5 = zzavVarZzj.zzu.zzaV().zzk();
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(iDelete3).length() + 34);
                                    sb6.append("Pruned ");
                                    sb6.append(iDelete3);
                                    sb6.append(" NO_DATA mode events. appId");
                                    zzgrVarZzk5.zzb(sb6.toString(), str);
                                } else {
                                    cursorQuery2 = cursorQuery2;
                                    cursorQuery2.close();
                                }
                                it5 = list3.iterator();
                                z21 = true;
                                while (it5.hasNext()) {
                                    Pair pair3 = (Pair) it5.next();
                                    zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) pair3.first).zzcl();
                                    if (z21) {
                                        List listZzb3 = zzicVar2.zzb();
                                        zzicVar2.zzi();
                                        zzicVar2.zzh(arrayList6);
                                        zzicVar2.zzh(listZzb3);
                                        z21 = false;
                                    }
                                    com.google.android.gms.internal.measurement.zzhh zzhhVarZzb3 = com.google.android.gms.internal.measurement.zzho.zzb();
                                    zzgfVarZzx = zzh().zzx(str);
                                    arrayList7 = new ArrayList();
                                    if (zzgfVarZzx != null) {
                                        while (r12.hasNext()) {
                                            com.google.android.gms.internal.measurement.zzhk zzhkVarZza3 = com.google.android.gms.internal.measurement.zzhl.zza();
                                            int iZzb3 = zzfuVar.zzb();
                                            zzjh zzjhVar3 = zzjh.UNINITIALIZED;
                                            Iterator it13 = it5;
                                            i15 = iZzb3 - 1;
                                            boolean z26 = z21;
                                            if (i15 == 1) {
                                                list4 = arrayList6;
                                                i16 = 3;
                                                i17 = 2;
                                            } else if (i15 != 2) {
                                                list4 = arrayList6;
                                                i16 = 3;
                                                if (i15 == 3) {
                                                    i17 = 4;
                                                } else if (i15 != 4) {
                                                    i17 = 1;
                                                } else {
                                                    i17 = 5;
                                                }
                                            } else {
                                                list4 = arrayList6;
                                                i16 = 3;
                                                i17 = 3;
                                            }
                                            zzhkVarZza3.zza(i17);
                                            iZzd = zzfuVar.zzd() - 1;
                                            if (iZzd == 1) {
                                                i16 = 2;
                                            } else if (iZzd != 2) {
                                                i16 = 1;
                                            }
                                            zzhkVarZza3.zzb(i16);
                                            arrayList7.add((com.google.android.gms.internal.measurement.zzhl) zzhkVarZza3.zzbc());
                                            z21 = z26;
                                            it5 = it13;
                                            arrayList6 = list4;
                                        }
                                    }
                                    Iterator it14 = it5;
                                    boolean z27 = z21;
                                    List list7 = arrayList6;
                                    zzhhVarZzb3.zza(arrayList7);
                                    zzicVar2.zzaQ(zzhhVarZzb3);
                                    arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc(), (Long) pair3.second));
                                    z21 = z27;
                                    it5 = it14;
                                    arrayList6 = list7;
                                }
                                listSubList = arrayList5;
                            } else {
                                arrayList5 = new ArrayList(listSubList.size());
                                zzavVarZzj = zzj();
                                Preconditions.checkNotEmpty(str);
                                zzavVarZzj.zzg();
                                zzavVarZzj.zzay();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseZze = zzavVarZzj.zze();
                                jCurrentTimeMillis = zzavVarZzj.zzu.zzaZ().currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseZze.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                list3 = listSubList;
                                if (cursorQuery2.moveToFirst()) {
                                    while (true) {
                                        arrayList6.add((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(0))).zzbc());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        }
                                        cursorQuery2 = cursorQuery2;
                                    }
                                    cursorQuery2.close();
                                    int iDelete4 = sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)});
                                    zzgr zzgrVarZzk6 = zzavVarZzj.zzu.zzaV().zzk();
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(iDelete4).length() + 34);
                                    sb7.append("Pruned ");
                                    sb7.append(iDelete4);
                                    sb7.append(" NO_DATA mode events. appId");
                                    zzgrVarZzk6.zzb(sb7.toString(), str);
                                } else {
                                    cursorQuery2 = cursorQuery2;
                                    cursorQuery2.close();
                                }
                                it5 = list3.iterator();
                                z21 = true;
                                while (it5.hasNext()) {
                                    Pair pair4 = (Pair) it5.next();
                                    zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) pair4.first).zzcl();
                                    if (z21) {
                                        List listZzb4 = zzicVar2.zzb();
                                        zzicVar2.zzi();
                                        zzicVar2.zzh(arrayList6);
                                        zzicVar2.zzh(listZzb4);
                                        z21 = false;
                                    }
                                    com.google.android.gms.internal.measurement.zzhh zzhhVarZzb4 = com.google.android.gms.internal.measurement.zzho.zzb();
                                    zzgfVarZzx = zzh().zzx(str);
                                    arrayList7 = new ArrayList();
                                    if (zzgfVarZzx != null) {
                                        while (r12.hasNext()) {
                                            com.google.android.gms.internal.measurement.zzhk zzhkVarZza4 = com.google.android.gms.internal.measurement.zzhl.zza();
                                            int iZzb4 = zzfuVar.zzb();
                                            zzjh zzjhVar4 = zzjh.UNINITIALIZED;
                                            Iterator it15 = it5;
                                            i15 = iZzb4 - 1;
                                            boolean z28 = z21;
                                            if (i15 == 1) {
                                                list4 = arrayList6;
                                                i16 = 3;
                                                i17 = 2;
                                            } else if (i15 != 2) {
                                                list4 = arrayList6;
                                                i16 = 3;
                                                if (i15 == 3) {
                                                    i17 = 4;
                                                } else if (i15 != 4) {
                                                    i17 = 1;
                                                } else {
                                                    i17 = 5;
                                                }
                                            } else {
                                                list4 = arrayList6;
                                                i16 = 3;
                                                i17 = 3;
                                            }
                                            zzhkVarZza4.zza(i17);
                                            iZzd = zzfuVar.zzd() - 1;
                                            if (iZzd == 1) {
                                                i16 = 2;
                                            } else if (iZzd != 2) {
                                                i16 = 1;
                                            }
                                            zzhkVarZza4.zzb(i16);
                                            arrayList7.add((com.google.android.gms.internal.measurement.zzhl) zzhkVarZza4.zzbc());
                                            z21 = z28;
                                            it5 = it15;
                                            arrayList6 = list4;
                                        }
                                    }
                                    Iterator it16 = it5;
                                    boolean z29 = z21;
                                    List list8 = arrayList6;
                                    zzhhVarZzb4.zza(arrayList7);
                                    zzicVar2.zzaQ(zzhhVarZzb4);
                                    arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc(), (Long) pair4.second));
                                    z21 = z29;
                                    it5 = it16;
                                    arrayList6 = list8;
                                }
                                listSubList = arrayList5;
                            }
                        }
                        if (listSubList.isEmpty()) {
                            return;
                        }
                    }
                    zzjkVarZzB = zzB(str);
                    zzjjVar = zzjj.AD_STORAGE;
                    if (zzjkVarZzB.zzo(zzjjVar)) {
                        it4 = listSubList.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                strZzG = null;
                                break;
                            }
                            zzidVar2 = (com.google.android.gms.internal.measurement.zzid) ((Pair) it4.next()).first;
                            if (!zzidVar2.zzG().isEmpty()) {
                                strZzG = zzidVar2.zzG();
                                break;
                            }
                        }
                        if (strZzG != null) {
                            while (i14 < listSubList.size()) {
                                zzidVar = (com.google.android.gms.internal.measurement.zzid) ((Pair) listSubList.get(i14)).first;
                                if (!zzidVar.zzG().isEmpty()) {
                                    listSubList = listSubList.subList(0, i14);
                                    break;
                                }
                            }
                        }
                    }
                    zzhzVarZzh = com.google.android.gms.internal.measurement.zzib.zzh();
                    size = listSubList.size();
                    arrayList = new ArrayList(listSubList.size());
                    if (zzd().zzC(str)) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    zZzo = zzB(str).zzo(zzjjVar);
                    zZzo2 = zzB(str).zzo(zzjj.ANALYTICS_STORAGE);
                    zzqu.zza();
                    zZzp = zzd().zzp(str, zzfx.zzaM);
                    zzotVar = this.zzl;
                    zzosVarZza = zzotVar.zza(str);
                    i11 = 0;
                    while (i11 < size) {
                        z13 = zZzo;
                        zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) ((Pair) listSubList.get(i11)).first).zzcl();
                        int i23 = size;
                        arrayList.add((Long) ((Pair) listSubList.get(i11)).second);
                        zzd().zzi();
                        z14 = z11;
                        z15 = zZzo2;
                        zzicVar.zzO(130000L);
                        zzicVar.zzs(j11);
                        this.zzn.zzaU();
                        zzicVar.zzae(false);
                        if (!z14) {
                            zzicVar.zzan();
                        }
                        if (!z13) {
                            zzicVar.zzR();
                            zzicVar.zzU();
                        }
                        if (!z15) {
                            zzicVar.zzX();
                        }
                        zzS(str, zzicVar);
                        if (!zZzp) {
                            zzicVar.zzav();
                        }
                        if (!z15) {
                            zzicVar.zzag();
                        }
                        strZzP = zzicVar.zzP();
                        if (TextUtils.isEmpty(strZzP)) {
                            arrayList4 = new ArrayList(zzicVar.zzb());
                            it3 = arrayList4.iterator();
                            z16 = z14;
                            lValueOf = null;
                            lValueOf2 = null;
                            z17 = false;
                            z18 = false;
                            while (it3.hasNext()) {
                                listSubList = listSubList;
                                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it3.next();
                                zZzp = zZzp;
                                i11 = i11;
                                if ("_fx".equals(zzhsVar.zzd())) {
                                    it3.remove();
                                    z17 = true;
                                } else if ("_f".equals(zzhsVar.zzd())) {
                                    zzp();
                                    zzhwVarZzF = zzpj.zzF(zzhsVar, "_pfo");
                                    if (zzhwVarZzF != null) {
                                        lValueOf = Long.valueOf(zzhwVarZzF.zzf());
                                    }
                                    zzp();
                                    zzhwVarZzF2 = zzpj.zzF(zzhsVar, "_uwa");
                                    if (zzhwVarZzF2 != null) {
                                        lValueOf2 = Long.valueOf(zzhwVarZzF2.zzf());
                                    }
                                } else {
                                    zZzp = zZzp;
                                    listSubList = listSubList;
                                    i11 = i11;
                                }
                                z18 = true;
                            }
                            list2 = listSubList;
                            z19 = zZzp;
                            i13 = i11;
                            if (z17) {
                                zzicVar.zzi();
                                zzicVar.zzh(arrayList4);
                            }
                            if (z18) {
                                zzR(zzicVar.zzK(), true, lValueOf, lValueOf2);
                            }
                        } else {
                            arrayList4 = new ArrayList(zzicVar.zzb());
                            it3 = arrayList4.iterator();
                            z16 = z14;
                            lValueOf = null;
                            lValueOf2 = null;
                            z17 = false;
                            z18 = false;
                            while (it3.hasNext()) {
                                listSubList = listSubList;
                                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it3.next();
                                zZzp = zZzp;
                                i11 = i11;
                                if ("_fx".equals(zzhsVar.zzd())) {
                                    it3.remove();
                                    z17 = true;
                                } else if ("_f".equals(zzhsVar.zzd())) {
                                    zzp();
                                    zzhwVarZzF = zzpj.zzF(zzhsVar, "_pfo");
                                    if (zzhwVarZzF != null) {
                                        lValueOf = Long.valueOf(zzhwVarZzF.zzf());
                                    }
                                    zzp();
                                    zzhwVarZzF2 = zzpj.zzF(zzhsVar, "_uwa");
                                    if (zzhwVarZzF2 != null) {
                                        lValueOf2 = Long.valueOf(zzhwVarZzF2.zzf());
                                    }
                                } else {
                                    zZzp = zZzp;
                                    listSubList = listSubList;
                                    i11 = i11;
                                }
                                z18 = true;
                            }
                            list2 = listSubList;
                            z19 = zZzp;
                            i13 = i11;
                            if (z17) {
                                zzicVar.zzi();
                                zzicVar.zzh(arrayList4);
                            }
                            if (z18) {
                                zzR(zzicVar.zzK(), true, lValueOf, lValueOf2);
                            }
                        }
                        if (zzicVar.zzc() != 0) {
                            if (zzd().zzp(str, zzfx.zzaC)) {
                                zzicVar.zzas(zzp().zzt(((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc()).zzcc()));
                            }
                            zzisVarZzd = zzosVarZza.zzd();
                            if (zzisVarZzd != null) {
                                zzicVar.zzaN(zzisVarZzd);
                            }
                            zzhzVarZzh.zze(zzicVar);
                        }
                        i11 = i13 + 1;
                        zZzo2 = z15;
                        zZzo = z13;
                        size = i23;
                        z11 = z16;
                        zZzp = z19;
                        listSubList = list2;
                    }
                    if (zzhzVarZzh.zzb() == 0) {
                        zzL(arrayList);
                        zzU(false, 204, null, null, str, Collections.EMPTY_LIST);
                        return;
                    }
                    zzibVar = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                    arrayList2 = new ArrayList();
                    if (zzosVarZza.zzc() == zzlr.SGTM_CLIENT) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (zzosVarZza.zzc() == zzlr.SGTM) {
                        it = ((com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc()).zza().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((com.google.android.gms.internal.measurement.zzid) it.next()).zzY()) {
                                    string = UUID.randomUUID().toString();
                                    break;
                                }
                            } else {
                                string = null;
                                break;
                            }
                        }
                        com.google.android.gms.internal.measurement.zzib zzibVar9 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                        zzaW().zzg();
                        zzu();
                        zzhzVarZzi = com.google.android.gms.internal.measurement.zzib.zzi(zzibVar9);
                        if (!TextUtils.isEmpty(string)) {
                            zzhzVarZzi.zzi(string);
                        }
                        strZzc = zzh().zzc(str);
                        if (!TextUtils.isEmpty(strZzc)) {
                            zzhzVarZzi.zzj(strZzc);
                        }
                        arrayList3 = new ArrayList();
                        it2 = zzibVar9.zza().iterator();
                        while (it2.hasNext()) {
                            com.google.android.gms.internal.measurement.zzic zzicVarZzaF3 = com.google.android.gms.internal.measurement.zzid.zzaF((com.google.android.gms.internal.measurement.zzid) it2.next());
                            zzicVarZzaF3.zzan();
                            arrayList3.add((com.google.android.gms.internal.measurement.zzid) zzicVarZzaF3.zzbc());
                        }
                        zzhzVarZzi.zzg();
                        zzhzVarZzi.zzf(arrayList3);
                        zzgr zzgrVarZzk7 = zzaV().zzk();
                        if (TextUtils.isEmpty(string)) {
                            objZzh = "null";
                        } else {
                            objZzh = zzhzVarZzi.zzh();
                        }
                        zzgrVarZzk7.zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", objZzh);
                        zzibVar2 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzi.zzbc();
                        if (TextUtils.isEmpty(string)) {
                            com.google.android.gms.internal.measurement.zzib zzibVar10 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                            zzaW().zzg();
                            zzu();
                            zzhzVarZzh2 = com.google.android.gms.internal.measurement.zzib.zzh();
                            zzaV().zzk().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", string);
                            zzhzVarZzh2.zzi(string);
                            while (r0.hasNext()) {
                                com.google.android.gms.internal.measurement.zzic zzicVarZzaE3 = com.google.android.gms.internal.measurement.zzid.zzaE();
                                zzicVarZzaE3.zzam(zzidVar4.zzZ());
                                zzicVarZzaE3.zzaJ(zzidVar4.zzav());
                                zzhzVarZzh2.zze(zzicVarZzaE3);
                            }
                            com.google.android.gms.internal.measurement.zzib zzibVar11 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh2.zzbc();
                            strZzc2 = zzotVar.zzg.zzh().zzc(str);
                            if (TextUtils.isEmpty(strZzc2)) {
                                Uri uri3 = Uri.parse((String) zzfx.zzr.zzb(null));
                                Uri.Builder builderBuildUpon3 = uri3.buildUpon();
                                String authority3 = uri3.getAuthority();
                                StringBuilder sb8 = new StringBuilder(String.valueOf(strZzc2).length() + 1 + String.valueOf(authority3).length());
                                sb8.append(strZzc2);
                                sb8.append(C33978va.f72339h);
                                sb8.append(authority3);
                                builderBuildUpon3.authority(sb8.toString());
                                String string4 = builderBuildUpon3.build().toString();
                                if (z12) {
                                    zzlrVar2 = zzlr.GOOGLE_SIGNAL_PENDING;
                                } else {
                                    zzlrVar2 = zzlr.GOOGLE_SIGNAL;
                                }
                                objZzi = null;
                                zzosVar = new zzos(string4, Collections.EMPTY_MAP, zzlrVar2, null);
                            } else {
                                objZzi = null;
                                String str4 = (String) zzfx.zzr.zzb(null);
                                if (z12) {
                                    zzlrVar = zzlr.GOOGLE_SIGNAL_PENDING;
                                } else {
                                    zzlrVar = zzlr.GOOGLE_SIGNAL;
                                }
                                zzosVar = new zzos(str4, Collections.EMPTY_MAP, zzlrVar, null);
                            }
                            arrayList2.add(Pair.create(zzibVar11, zzosVar));
                        } else {
                            objZzi = null;
                        }
                        if (z12) {
                            zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar2.zzcl();
                            while (i12 < zzibVar2.zzb()) {
                                com.google.android.gms.internal.measurement.zzic zzicVar6 = (com.google.android.gms.internal.measurement.zzic) zzibVar2.zzc(i12).zzcl();
                                zzicVar6.zzt();
                                zzicVar6.zzaO(j11);
                                zzhzVar.zzd(i12, zzicVar6);
                            }
                            arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc(), zzosVarZza));
                            zzL(arrayList);
                            zzU(false, 204, null, null, str, arrayList2);
                            if (zzO(str, zzosVarZza.zza())) {
                                zzaV().zzk().zzb("[sgtm] Sending sgtm batches available notification to app", str);
                                Intent intent3 = new Intent();
                                intent3.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                intent3.setPackage(str);
                                zzaP(this.zzn.zzaY(), intent3);
                                return;
                            }
                            return;
                        }
                        zzibVar = zzibVar2;
                    } else if (z12) {
                        z12 = true;
                        it = ((com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc()).zza().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((com.google.android.gms.internal.measurement.zzid) it.next()).zzY()) {
                                    string = UUID.randomUUID().toString();
                                    break;
                                }
                            } else {
                                string = null;
                                break;
                            }
                        }
                        com.google.android.gms.internal.measurement.zzib zzibVar12 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                        zzaW().zzg();
                        zzu();
                        zzhzVarZzi = com.google.android.gms.internal.measurement.zzib.zzi(zzibVar12);
                        if (!TextUtils.isEmpty(string)) {
                            zzhzVarZzi.zzi(string);
                        }
                        strZzc = zzh().zzc(str);
                        if (!TextUtils.isEmpty(strZzc)) {
                            zzhzVarZzi.zzj(strZzc);
                        }
                        arrayList3 = new ArrayList();
                        it2 = zzibVar12.zza().iterator();
                        while (it2.hasNext()) {
                            com.google.android.gms.internal.measurement.zzic zzicVarZzaF4 = com.google.android.gms.internal.measurement.zzid.zzaF((com.google.android.gms.internal.measurement.zzid) it2.next());
                            zzicVarZzaF4.zzan();
                            arrayList3.add((com.google.android.gms.internal.measurement.zzid) zzicVarZzaF4.zzbc());
                        }
                        zzhzVarZzi.zzg();
                        zzhzVarZzi.zzf(arrayList3);
                        zzgr zzgrVarZzk8 = zzaV().zzk();
                        if (TextUtils.isEmpty(string)) {
                            objZzh = "null";
                        } else {
                            objZzh = zzhzVarZzi.zzh();
                        }
                        zzgrVarZzk8.zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", objZzh);
                        zzibVar2 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzi.zzbc();
                        if (TextUtils.isEmpty(string)) {
                            com.google.android.gms.internal.measurement.zzib zzibVar13 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                            zzaW().zzg();
                            zzu();
                            zzhzVarZzh2 = com.google.android.gms.internal.measurement.zzib.zzh();
                            zzaV().zzk().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", string);
                            zzhzVarZzh2.zzi(string);
                            while (r0.hasNext()) {
                                com.google.android.gms.internal.measurement.zzic zzicVarZzaE4 = com.google.android.gms.internal.measurement.zzid.zzaE();
                                zzicVarZzaE4.zzam(zzidVar4.zzZ());
                                zzicVarZzaE4.zzaJ(zzidVar4.zzav());
                                zzhzVarZzh2.zze(zzicVarZzaE4);
                            }
                            com.google.android.gms.internal.measurement.zzib zzibVar14 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh2.zzbc();
                            strZzc2 = zzotVar.zzg.zzh().zzc(str);
                            if (TextUtils.isEmpty(strZzc2)) {
                                Uri uri4 = Uri.parse((String) zzfx.zzr.zzb(null));
                                Uri.Builder builderBuildUpon4 = uri4.buildUpon();
                                String authority4 = uri4.getAuthority();
                                StringBuilder sb9 = new StringBuilder(String.valueOf(strZzc2).length() + 1 + String.valueOf(authority4).length());
                                sb9.append(strZzc2);
                                sb9.append(C33978va.f72339h);
                                sb9.append(authority4);
                                builderBuildUpon4.authority(sb9.toString());
                                String string5 = builderBuildUpon4.build().toString();
                                if (z12) {
                                    zzlrVar2 = zzlr.GOOGLE_SIGNAL_PENDING;
                                } else {
                                    zzlrVar2 = zzlr.GOOGLE_SIGNAL;
                                }
                                objZzi = null;
                                zzosVar = new zzos(string5, Collections.EMPTY_MAP, zzlrVar2, null);
                            } else {
                                objZzi = null;
                                String str5 = (String) zzfx.zzr.zzb(null);
                                if (z12) {
                                    zzlrVar = zzlr.GOOGLE_SIGNAL_PENDING;
                                } else {
                                    zzlrVar = zzlr.GOOGLE_SIGNAL;
                                }
                                zzosVar = new zzos(str5, Collections.EMPTY_MAP, zzlrVar, null);
                            }
                            arrayList2.add(Pair.create(zzibVar14, zzosVar));
                        } else {
                            objZzi = null;
                        }
                        if (z12) {
                            zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar2.zzcl();
                            while (i12 < zzibVar2.zzb()) {
                                com.google.android.gms.internal.measurement.zzic zzicVar7 = (com.google.android.gms.internal.measurement.zzic) zzibVar2.zzc(i12).zzcl();
                                zzicVar7.zzt();
                                zzicVar7.zzaO(j11);
                                zzhzVar.zzd(i12, zzicVar7);
                            }
                            arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc(), zzosVarZza));
                            zzL(arrayList);
                            zzU(false, 204, null, null, str, arrayList2);
                            if (zzO(str, zzosVarZza.zza())) {
                                zzaV().zzk().zzb("[sgtm] Sending sgtm batches available notification to app", str);
                                Intent intent4 = new Intent();
                                intent4.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                intent4.setPackage(str);
                                zzaP(this.zzn.zzaY(), intent4);
                                return;
                            }
                            return;
                        }
                        zzibVar = zzibVar2;
                    } else {
                        objZzi = null;
                    }
                    if (zzi().zzb()) {
                        if (Log.isLoggable(zzaV().zzn(), 2)) {
                            objZzi = zzp().zzi(zzibVar);
                        }
                        zzp();
                        byte[] bArrZzcc2 = zzibVar.zzcc();
                        zzL(arrayList);
                        this.zzk.zze.zzb(j11);
                        zzaV().zzk().zzd("Uploading data. app, uncompressed size, data", str, Integer.valueOf(bArrZzcc2.length), objZzi);
                        this.zzv = true;
                        zzi().zzc(str, zzosVarZza, zzibVar, new zzov(this, str, arrayList2));
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                cursor = null;
            }
        } catch (SQLiteException e25) {
            e = e25;
            j12 = -1;
        }
        if (listSubList.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.measurement.zzpk.zza();
        zzalVarZzd = zzd();
        zzfwVar = zzfx.zzbi;
        if (zzalVarZzd.zzp(null, zzfwVar)) {
            com.google.android.gms.internal.measurement.zzpk.zza();
            if (zzd().zzp(null, zzfwVar)) {
                if (zzB(str).zzo(zzjj.ANALYTICS_STORAGE) || !zzh().zzB(str)) {
                    arrayList5 = new ArrayList(listSubList.size());
                    zzavVarZzj = zzj();
                    Preconditions.checkNotEmpty(str);
                    zzavVarZzj.zzg();
                    zzavVarZzj.zzay();
                    arrayList6 = new ArrayList();
                    sQLiteDatabaseZze = zzavVarZzj.zze();
                    jCurrentTimeMillis = zzavVarZzj.zzu.zzaZ().currentTimeMillis();
                    cursorQuery2 = sQLiteDatabaseZze.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                    list3 = listSubList;
                    if (cursorQuery2.moveToFirst()) {
                        while (true) {
                            arrayList6.add((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(0))).zzbc());
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            cursorQuery2 = cursorQuery2;
                        }
                        cursorQuery2.close();
                        int iDelete5 = sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)});
                        zzgr zzgrVarZzk9 = zzavVarZzj.zzu.zzaV().zzk();
                        StringBuilder sb10 = new StringBuilder(String.valueOf(iDelete5).length() + 34);
                        sb10.append("Pruned ");
                        sb10.append(iDelete5);
                        sb10.append(" NO_DATA mode events. appId");
                        zzgrVarZzk9.zzb(sb10.toString(), str);
                    } else {
                        cursorQuery2 = cursorQuery2;
                        cursorQuery2.close();
                    }
                    it5 = list3.iterator();
                    z21 = true;
                    while (it5.hasNext()) {
                        Pair pair5 = (Pair) it5.next();
                        zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) pair5.first).zzcl();
                        if (z21 && !arrayList6.isEmpty()) {
                            List listZzb5 = zzicVar2.zzb();
                            zzicVar2.zzi();
                            zzicVar2.zzh(arrayList6);
                            zzicVar2.zzh(listZzb5);
                            z21 = false;
                        }
                        com.google.android.gms.internal.measurement.zzhh zzhhVarZzb5 = com.google.android.gms.internal.measurement.zzho.zzb();
                        zzgfVarZzx = zzh().zzx(str);
                        arrayList7 = new ArrayList();
                        if (zzgfVarZzx != null) {
                            while (r12.hasNext()) {
                                com.google.android.gms.internal.measurement.zzhk zzhkVarZza5 = com.google.android.gms.internal.measurement.zzhl.zza();
                                int iZzb5 = zzfuVar.zzb();
                                zzjh zzjhVar5 = zzjh.UNINITIALIZED;
                                Iterator it17 = it5;
                                i15 = iZzb5 - 1;
                                boolean z210 = z21;
                                if (i15 == 1) {
                                    list4 = arrayList6;
                                    i16 = 3;
                                    i17 = 2;
                                } else if (i15 != 2) {
                                    list4 = arrayList6;
                                    i16 = 3;
                                    if (i15 == 3) {
                                        i17 = 4;
                                    } else if (i15 != 4) {
                                        i17 = 1;
                                    } else {
                                        i17 = 5;
                                    }
                                } else {
                                    list4 = arrayList6;
                                    i16 = 3;
                                    i17 = 3;
                                }
                                zzhkVarZza5.zza(i17);
                                iZzd = zzfuVar.zzd() - 1;
                                if (iZzd == 1) {
                                    i16 = 2;
                                } else if (iZzd != 2) {
                                    i16 = 1;
                                }
                                zzhkVarZza5.zzb(i16);
                                arrayList7.add((com.google.android.gms.internal.measurement.zzhl) zzhkVarZza5.zzbc());
                                z21 = z210;
                                it5 = it17;
                                arrayList6 = list4;
                            }
                        }
                        Iterator it18 = it5;
                        boolean z211 = z21;
                        List list9 = arrayList6;
                        zzhhVarZzb5.zza(arrayList7);
                        zzicVar2.zzaQ(zzhhVarZzb5);
                        arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc(), (Long) pair5.second));
                        z21 = z211;
                        it5 = it18;
                        arrayList6 = list9;
                    }
                    listSubList = arrayList5;
                } else {
                    List listAsList = Arrays.asList(((String) zzfx.zzbj.zzb(null)).split(","));
                    for (Pair pair6 : listSubList) {
                        try {
                            zzj().zzH(((Long) pair6.second).longValue());
                            for (com.google.android.gms.internal.measurement.zzhs zzhsVar2 : ((com.google.android.gms.internal.measurement.zzid) pair6.first).zzc()) {
                                if (listAsList.contains(zzhsVar2.zzd())) {
                                    if (zzhsVar2.zzd().equals("_f") || zzhsVar2.zzd().equals("_v")) {
                                        com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzhsVar2.zzcl();
                                        zzp();
                                        zzpj.zzC(zzhrVar, "_dac", 1L);
                                        zzhsVar2 = (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc();
                                    }
                                    zzav zzavVarZzj3 = zzj();
                                    zzavVarZzj3.zzg();
                                    zzavVarZzj3.zzay();
                                    Preconditions.checkNotNull(zzhsVar2);
                                    Preconditions.checkNotEmpty(str);
                                    zzib zzibVar15 = zzavVarZzj3.zzu;
                                    zzibVar15.zzaV().zzk().zzb("Caching events in NO_DATA mode", zzhsVar2);
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("app_id", str);
                                    contentValues.put("name", zzhsVar2.zzd());
                                    contentValues.put("data", zzhsVar2.zzcc());
                                    contentValues.put("timestamp_millis", Long.valueOf(zzhsVar2.zzf()));
                                    try {
                                        if (zzavVarZzj3.zze().insert("no_data_mode_events", null, contentValues) == j12) {
                                            zzibVar15.zzaV().zzb().zzb("Failed to insert NO_DATA mode event (got -1). appId", zzgt.zzl(str));
                                        }
                                    } catch (SQLiteException e26) {
                                        zzavVarZzj3.zzu.zzaV().zzb().zzc("Error storing NO_DATA mode event. appId", zzgt.zzl(str), e26);
                                    }
                                }
                            }
                        } catch (SQLiteException unused) {
                            zzaV().zzh().zzb("Failed handling NO_DATA mode bundles. appId", str);
                        }
                    }
                    listSubList = Collections.EMPTY_LIST;
                }
            }
            if (listSubList.isEmpty()) {
                return;
            }
        }
        zzjkVarZzB = zzB(str);
        zzjjVar = zzjj.AD_STORAGE;
        if (zzjkVarZzB.zzo(zzjjVar)) {
            it4 = listSubList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    strZzG = null;
                    break;
                }
                zzidVar2 = (com.google.android.gms.internal.measurement.zzid) ((Pair) it4.next()).first;
                if (!zzidVar2.zzG().isEmpty()) {
                    strZzG = zzidVar2.zzG();
                    break;
                }
            }
            if (strZzG != null) {
                while (i14 < listSubList.size()) {
                    zzidVar = (com.google.android.gms.internal.measurement.zzid) ((Pair) listSubList.get(i14)).first;
                    if (!zzidVar.zzG().isEmpty() && !zzidVar.zzG().equals(strZzG)) {
                        listSubList = listSubList.subList(0, i14);
                        break;
                    }
                }
            }
        }
        zzhzVarZzh = com.google.android.gms.internal.measurement.zzib.zzh();
        size = listSubList.size();
        arrayList = new ArrayList(listSubList.size());
        if (zzd().zzC(str) || !zzB(str).zzo(zzjjVar)) {
            z11 = false;
        } else {
            z11 = true;
        }
        zZzo = zzB(str).zzo(zzjjVar);
        zZzo2 = zzB(str).zzo(zzjj.ANALYTICS_STORAGE);
        zzqu.zza();
        zZzp = zzd().zzp(str, zzfx.zzaM);
        zzotVar = this.zzl;
        zzosVarZza = zzotVar.zza(str);
        i11 = 0;
        while (i11 < size) {
            z13 = zZzo;
            zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) ((Pair) listSubList.get(i11)).first).zzcl();
            int i24 = size;
            arrayList.add((Long) ((Pair) listSubList.get(i11)).second);
            zzd().zzi();
            z14 = z11;
            z15 = zZzo2;
            zzicVar.zzO(130000L);
            zzicVar.zzs(j11);
            this.zzn.zzaU();
            zzicVar.zzae(false);
            if (!z14) {
                zzicVar.zzan();
            }
            if (!z13) {
                zzicVar.zzR();
                zzicVar.zzU();
            }
            if (!z15) {
                zzicVar.zzX();
            }
            zzS(str, zzicVar);
            if (!zZzp) {
                zzicVar.zzav();
            }
            if (!z15) {
                zzicVar.zzag();
            }
            strZzP = zzicVar.zzP();
            if (TextUtils.isEmpty(strZzP) || strZzP.equals("00000000-0000-0000-0000-000000000000")) {
                arrayList4 = new ArrayList(zzicVar.zzb());
                it3 = arrayList4.iterator();
                z16 = z14;
                lValueOf = null;
                lValueOf2 = null;
                z17 = false;
                z18 = false;
                while (it3.hasNext()) {
                    listSubList = listSubList;
                    zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it3.next();
                    zZzp = zZzp;
                    i11 = i11;
                    if ("_fx".equals(zzhsVar.zzd())) {
                        it3.remove();
                        z17 = true;
                    } else if ("_f".equals(zzhsVar.zzd())) {
                        zzp();
                        zzhwVarZzF = zzpj.zzF(zzhsVar, "_pfo");
                        if (zzhwVarZzF != null) {
                            lValueOf = Long.valueOf(zzhwVarZzF.zzf());
                        }
                        zzp();
                        zzhwVarZzF2 = zzpj.zzF(zzhsVar, "_uwa");
                        if (zzhwVarZzF2 != null) {
                            lValueOf2 = Long.valueOf(zzhwVarZzF2.zzf());
                        }
                    } else {
                        zZzp = zZzp;
                        listSubList = listSubList;
                        i11 = i11;
                    }
                    z18 = true;
                }
                list2 = listSubList;
                z19 = zZzp;
                i13 = i11;
                if (z17) {
                    zzicVar.zzi();
                    zzicVar.zzh(arrayList4);
                }
                if (z18) {
                    zzR(zzicVar.zzK(), true, lValueOf, lValueOf2);
                }
            } else {
                z16 = z14;
                list2 = listSubList;
                z19 = zZzp;
                i13 = i11;
            }
            if (zzicVar.zzc() != 0) {
                if (zzd().zzp(str, zzfx.zzaC)) {
                    zzicVar.zzas(zzp().zzt(((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc()).zzcc()));
                }
                zzisVarZzd = zzosVarZza.zzd();
                if (zzisVarZzd != null) {
                    zzicVar.zzaN(zzisVarZzd);
                }
                zzhzVarZzh.zze(zzicVar);
            }
            i11 = i13 + 1;
            zZzo2 = z15;
            zZzo = z13;
            size = i24;
            z11 = z16;
            zZzp = z19;
            listSubList = list2;
        }
        if (zzhzVarZzh.zzb() == 0) {
            zzL(arrayList);
            zzU(false, 204, null, null, str, Collections.EMPTY_LIST);
            return;
        }
        zzibVar = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
        arrayList2 = new ArrayList();
        if (zzosVarZza.zzc() == zzlr.SGTM_CLIENT) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (zzosVarZza.zzc() == zzlr.SGTM) {
            it = ((com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc()).zza().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((com.google.android.gms.internal.measurement.zzid) it.next()).zzY()) {
                        string = UUID.randomUUID().toString();
                        break;
                    }
                } else {
                    string = null;
                    break;
                }
            }
            com.google.android.gms.internal.measurement.zzib zzibVar16 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
            zzaW().zzg();
            zzu();
            zzhzVarZzi = com.google.android.gms.internal.measurement.zzib.zzi(zzibVar16);
            if (!TextUtils.isEmpty(string)) {
                zzhzVarZzi.zzi(string);
            }
            strZzc = zzh().zzc(str);
            if (!TextUtils.isEmpty(strZzc)) {
                zzhzVarZzi.zzj(strZzc);
            }
            arrayList3 = new ArrayList();
            it2 = zzibVar16.zza().iterator();
            while (it2.hasNext()) {
                com.google.android.gms.internal.measurement.zzic zzicVarZzaF5 = com.google.android.gms.internal.measurement.zzid.zzaF((com.google.android.gms.internal.measurement.zzid) it2.next());
                zzicVarZzaF5.zzan();
                arrayList3.add((com.google.android.gms.internal.measurement.zzid) zzicVarZzaF5.zzbc());
            }
            zzhzVarZzi.zzg();
            zzhzVarZzi.zzf(arrayList3);
            zzgr zzgrVarZzk10 = zzaV().zzk();
            if (TextUtils.isEmpty(string)) {
                objZzh = "null";
            } else {
                objZzh = zzhzVarZzi.zzh();
            }
            zzgrVarZzk10.zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", objZzh);
            zzibVar2 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzi.zzbc();
            if (TextUtils.isEmpty(string)) {
                com.google.android.gms.internal.measurement.zzib zzibVar17 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                zzaW().zzg();
                zzu();
                zzhzVarZzh2 = com.google.android.gms.internal.measurement.zzib.zzh();
                zzaV().zzk().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", string);
                zzhzVarZzh2.zzi(string);
                while (r0.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarZzaE5 = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzicVarZzaE5.zzam(zzidVar4.zzZ());
                    zzicVarZzaE5.zzaJ(zzidVar4.zzav());
                    zzhzVarZzh2.zze(zzicVarZzaE5);
                }
                com.google.android.gms.internal.measurement.zzib zzibVar18 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh2.zzbc();
                strZzc2 = zzotVar.zzg.zzh().zzc(str);
                if (TextUtils.isEmpty(strZzc2)) {
                    Uri uri5 = Uri.parse((String) zzfx.zzr.zzb(null));
                    Uri.Builder builderBuildUpon5 = uri5.buildUpon();
                    String authority5 = uri5.getAuthority();
                    StringBuilder sb11 = new StringBuilder(String.valueOf(strZzc2).length() + 1 + String.valueOf(authority5).length());
                    sb11.append(strZzc2);
                    sb11.append(C33978va.f72339h);
                    sb11.append(authority5);
                    builderBuildUpon5.authority(sb11.toString());
                    String string6 = builderBuildUpon5.build().toString();
                    if (z12) {
                        zzlrVar2 = zzlr.GOOGLE_SIGNAL_PENDING;
                    } else {
                        zzlrVar2 = zzlr.GOOGLE_SIGNAL;
                    }
                    objZzi = null;
                    zzosVar = new zzos(string6, Collections.EMPTY_MAP, zzlrVar2, null);
                } else {
                    objZzi = null;
                    String str6 = (String) zzfx.zzr.zzb(null);
                    if (z12) {
                        zzlrVar = zzlr.GOOGLE_SIGNAL_PENDING;
                    } else {
                        zzlrVar = zzlr.GOOGLE_SIGNAL;
                    }
                    zzosVar = new zzos(str6, Collections.EMPTY_MAP, zzlrVar, null);
                }
                arrayList2.add(Pair.create(zzibVar18, zzosVar));
            } else {
                objZzi = null;
            }
            if (z12) {
                zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar2.zzcl();
                while (i12 < zzibVar2.zzb()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar8 = (com.google.android.gms.internal.measurement.zzic) zzibVar2.zzc(i12).zzcl();
                    zzicVar8.zzt();
                    zzicVar8.zzaO(j11);
                    zzhzVar.zzd(i12, zzicVar8);
                }
                arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc(), zzosVarZza));
                zzL(arrayList);
                zzU(false, 204, null, null, str, arrayList2);
                if (zzO(str, zzosVarZza.zza())) {
                    zzaV().zzk().zzb("[sgtm] Sending sgtm batches available notification to app", str);
                    Intent intent5 = new Intent();
                    intent5.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    intent5.setPackage(str);
                    zzaP(this.zzn.zzaY(), intent5);
                    return;
                }
                return;
            }
            zzibVar = zzibVar2;
        } else if (z12) {
            z12 = true;
            it = ((com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc()).zza().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((com.google.android.gms.internal.measurement.zzid) it.next()).zzY()) {
                        string = UUID.randomUUID().toString();
                        break;
                    }
                } else {
                    string = null;
                    break;
                }
            }
            com.google.android.gms.internal.measurement.zzib zzibVar19 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
            zzaW().zzg();
            zzu();
            zzhzVarZzi = com.google.android.gms.internal.measurement.zzib.zzi(zzibVar19);
            if (!TextUtils.isEmpty(string)) {
                zzhzVarZzi.zzi(string);
            }
            strZzc = zzh().zzc(str);
            if (!TextUtils.isEmpty(strZzc)) {
                zzhzVarZzi.zzj(strZzc);
            }
            arrayList3 = new ArrayList();
            it2 = zzibVar19.zza().iterator();
            while (it2.hasNext()) {
                com.google.android.gms.internal.measurement.zzic zzicVarZzaF6 = com.google.android.gms.internal.measurement.zzid.zzaF((com.google.android.gms.internal.measurement.zzid) it2.next());
                zzicVarZzaF6.zzan();
                arrayList3.add((com.google.android.gms.internal.measurement.zzid) zzicVarZzaF6.zzbc());
            }
            zzhzVarZzi.zzg();
            zzhzVarZzi.zzf(arrayList3);
            zzgr zzgrVarZzk11 = zzaV().zzk();
            if (TextUtils.isEmpty(string)) {
                objZzh = "null";
            } else {
                objZzh = zzhzVarZzi.zzh();
            }
            zzgrVarZzk11.zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", objZzh);
            zzibVar2 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzi.zzbc();
            if (TextUtils.isEmpty(string)) {
                com.google.android.gms.internal.measurement.zzib zzibVar110 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                zzaW().zzg();
                zzu();
                zzhzVarZzh2 = com.google.android.gms.internal.measurement.zzib.zzh();
                zzaV().zzk().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", string);
                zzhzVarZzh2.zzi(string);
                while (r0.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarZzaE6 = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzicVarZzaE6.zzam(zzidVar4.zzZ());
                    zzicVarZzaE6.zzaJ(zzidVar4.zzav());
                    zzhzVarZzh2.zze(zzicVarZzaE6);
                }
                com.google.android.gms.internal.measurement.zzib zzibVar111 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh2.zzbc();
                strZzc2 = zzotVar.zzg.zzh().zzc(str);
                if (TextUtils.isEmpty(strZzc2)) {
                    Uri uri6 = Uri.parse((String) zzfx.zzr.zzb(null));
                    Uri.Builder builderBuildUpon6 = uri6.buildUpon();
                    String authority6 = uri6.getAuthority();
                    StringBuilder sb12 = new StringBuilder(String.valueOf(strZzc2).length() + 1 + String.valueOf(authority6).length());
                    sb12.append(strZzc2);
                    sb12.append(C33978va.f72339h);
                    sb12.append(authority6);
                    builderBuildUpon6.authority(sb12.toString());
                    String string7 = builderBuildUpon6.build().toString();
                    if (z12) {
                        zzlrVar2 = zzlr.GOOGLE_SIGNAL_PENDING;
                    } else {
                        zzlrVar2 = zzlr.GOOGLE_SIGNAL;
                    }
                    objZzi = null;
                    zzosVar = new zzos(string7, Collections.EMPTY_MAP, zzlrVar2, null);
                } else {
                    objZzi = null;
                    String str7 = (String) zzfx.zzr.zzb(null);
                    if (z12) {
                        zzlrVar = zzlr.GOOGLE_SIGNAL_PENDING;
                    } else {
                        zzlrVar = zzlr.GOOGLE_SIGNAL;
                    }
                    zzosVar = new zzos(str7, Collections.EMPTY_MAP, zzlrVar, null);
                }
                arrayList2.add(Pair.create(zzibVar111, zzosVar));
            } else {
                objZzi = null;
            }
            if (z12) {
                zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar2.zzcl();
                while (i12 < zzibVar2.zzb()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar9 = (com.google.android.gms.internal.measurement.zzic) zzibVar2.zzc(i12).zzcl();
                    zzicVar9.zzt();
                    zzicVar9.zzaO(j11);
                    zzhzVar.zzd(i12, zzicVar9);
                }
                arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc(), zzosVarZza));
                zzL(arrayList);
                zzU(false, 204, null, null, str, arrayList2);
                if (zzO(str, zzosVarZza.zza())) {
                    zzaV().zzk().zzb("[sgtm] Sending sgtm batches available notification to app", str);
                    Intent intent6 = new Intent();
                    intent6.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    intent6.setPackage(str);
                    zzaP(this.zzn.zzaY(), intent6);
                    return;
                }
                return;
            }
            zzibVar = zzibVar2;
        } else {
            objZzi = null;
        }
        if (zzi().zzb()) {
            if (Log.isLoggable(zzaV().zzn(), 2)) {
                objZzi = zzp().zzi(zzibVar);
            }
            zzp();
            byte[] bArrZzcc3 = zzibVar.zzcc();
            zzL(arrayList);
            this.zzk.zze.zzb(j11);
            zzaV().zzk().zzd("Uploading data. app, uncompressed size, data", str, Integer.valueOf(bArrZzcc3.length), objZzi);
            this.zzv = true;
            zzi().zzc(str, zzosVarZza, zzibVar, new zzov(this, str, arrayList2));
        }
    }

    private final int zzaB(String str, zzan zzanVar) {
        zzjj zzjjVar;
        zzjh zzjhVarZzA;
        zzhs zzhsVar = this.zzc;
        if (zzhsVar.zzx(str) == null) {
            zzanVar.zzc(zzjj.AD_PERSONALIZATION, zzam.FAILSAFE);
            return 1;
        }
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null && zze.zzc(zzhVarZzu.zzaH()).zza() == zzjh.POLICY && (zzjhVarZzA = zzhsVar.zzA(str, (zzjjVar = zzjj.AD_PERSONALIZATION))) != zzjh.UNINITIALIZED) {
            zzanVar.zzc(zzjjVar, zzam.REMOTE_ENFORCED_DEFAULT);
            return zzjhVarZzA == zzjh.GRANTED ? 0 : 1;
        }
        zzjj zzjjVar2 = zzjj.AD_PERSONALIZATION;
        zzanVar.zzc(zzjjVar2, zzam.REMOTE_DEFAULT);
        return zzhsVar.zzv(str, zzjjVar2) ? 0 : 1;
    }

    private final Map zzaC(com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        HashMap map = new HashMap();
        zzp();
        for (Map.Entry entry : zzpj.zzH(zzhsVar, "gad_").entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    private final zzay zzaD() {
        if (this.zzI == null) {
            this.zzI = new zzox(this, this.zzn);
        }
        return this.zzI;
    }

    private static String zzaJ(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    @WorkerThread
    private final void zzaK() {
        long jMax;
        long jMax2;
        zzaW().zzg();
        zzu();
        if (this.zza > 0) {
            long jAbs = FundingRateEntity.MILLIS_PER_HOUR - Math.abs(zzaZ().elapsedRealtime() - this.zza);
            if (jAbs > 0) {
                zzaV().zzk().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzk().zzb();
                zzl().zzd();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzH() || !zzaI()) {
            zzaV().zzk().zza("Nothing to upload or uploading impossible");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        long jCurrentTimeMillis = zzaZ().currentTimeMillis();
        zzd();
        long jMax3 = Math.max(0L, ((Long) zzfx.zzO.zzb(null)).longValue());
        boolean z11 = true;
        if (!zzj().zzR() && !zzj().zzG()) {
            z11 = false;
        }
        if (z11) {
            String strZzA = zzd().zzA();
            if (TextUtils.isEmpty(strZzA) || ".none.".equals(strZzA)) {
                zzd();
                jMax = Math.max(0L, ((Long) zzfx.zzI.zzb(null)).longValue());
            } else {
                zzd();
                jMax = Math.max(0L, ((Long) zzfx.zzJ.zzb(null)).longValue());
            }
        } else {
            zzd();
            jMax = Math.max(0L, ((Long) zzfx.zzH.zzb(null)).longValue());
        }
        long jZza = this.zzk.zzd.zza();
        long jZza2 = this.zzk.zze.zza();
        long j11 = 0;
        boolean z12 = z11;
        long jMax4 = Math.max(zzj().zzM(), zzj().zzO());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = jCurrentTimeMillis - Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            jMax2 = jMax3 + jAbs2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z12 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            if (!zzp().zzs(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i11 = 0;
                while (true) {
                    zzd();
                    if (i11 >= Math.min(20, Math.max(0, ((Integer) zzfx.zzQ.zzb(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    zzd();
                    jMax2 += Math.max(j11, ((Long) zzfx.zzP.zzb(null)).longValue()) * (1 << i11);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                    i11++;
                    j11 = 0;
                }
            }
            j11 = 0;
        }
        if (jMax2 == j11) {
            zzaV().zzk().zza("Next upload time is 0");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        if (!zzi().zzb()) {
            zzaV().zzk().zza("No network");
            zzk().zza();
            zzl().zzd();
            return;
        }
        long jZza3 = this.zzk.zzc.zza();
        zzd();
        long jMax6 = Math.max(0L, ((Long) zzfx.zzF.zzb(null)).longValue());
        if (!zzp().zzs(jZza3, jMax6)) {
            jMax2 = Math.max(jMax2, jZza3 + jMax6);
        }
        zzk().zzb();
        long jCurrentTimeMillis2 = jMax2 - zzaZ().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzd();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzfx.zzK.zzb(null)).longValue());
            this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
        }
        zzaV().zzk().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzl().zzc(jCurrentTimeMillis2);
    }

    @WorkerThread
    private final zzr zzaN(String str) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu == null || TextUtils.isEmpty(zzhVarZzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzaM = zzaM(zzhVarZzu);
        if (boolZzaM == null || boolZzaM.booleanValue()) {
            return new zzr(str, zzhVarZzu.zzf(), zzhVarZzu.zzr(), zzhVarZzu.zzt(), zzhVarZzu.zzv(), zzhVarZzu.zzx(), zzhVarZzu.zzz(), (String) null, zzhVarZzu.zzD(), false, zzhVarZzu.zzl(), 0L, 0, zzhVarZzu.zzac(), false, zzhVarZzu.zzae(), zzhVarZzu.zzB(), zzhVarZzu.zzag(), zzB(str).zzl(), "", (String) null, zzhVarZzu.zzai(), zzhVarZzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzhVarZzu.zzao(), zzhVarZzu.zzaw(), zzhVarZzu.zzay(), zzhVarZzu.zzaH(), 0L, zzhVarZzu.zzaL());
        }
        zzaV().zzb().zzb("App version does not match; dropping. appId", zzgt.zzl(str));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzaP(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    private static final boolean zzaQ(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.zzb);
    }

    private static final zzor zzaS(zzor zzorVar) {
        if (zzorVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzorVar.zzax()) {
            return zzorVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzorVar.getClass())));
    }

    private static final Boolean zzaT(zzr zzrVar) {
        Boolean bool = zzrVar.zzp;
        String str = zzrVar.zzC;
        if (!TextUtils.isEmpty(str)) {
            zzjh zzjhVarZza = zze.zzc(str).zza();
            zzjh zzjhVar = zzjh.UNINITIALIZED;
            int iOrdinal = zzjhVarZza.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    @WorkerThread
    public final zzjk zzB(String str) {
        zzjk zzjkVar = zzjk.zza;
        zzaW().zzg();
        zzu();
        zzjk zzjkVarZzZ = (zzjk) this.zzC.get(str);
        if (zzjkVarZzZ == null) {
            zzjkVarZzZ = zzj().zzZ(str);
            if (zzjkVarZzZ == null) {
                zzjkVarZzZ = zzjk.zza;
            }
            zzA(str, zzjkVarZzZ);
        }
        return zzjkVarZzZ;
    }

    @WorkerThread
    public final void zzD(zzbg zzbgVar, String str) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu == null || TextUtils.isEmpty(zzhVarZzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzaM = zzaM(zzhVarZzu);
        if (boolZzaM == null) {
            if (!"_ui".equals(zzbgVar.zza)) {
                zzaV().zze().zzb("Could not find package. appId", zzgt.zzl(str));
            }
        } else if (!boolZzaM.booleanValue()) {
            zzaV().zzb().zzb("App version does not match; dropping event. appId", zzgt.zzl(str));
            return;
        }
        zzE(zzbgVar, new zzr(str, zzhVarZzu.zzf(), zzhVarZzu.zzr(), zzhVarZzu.zzt(), zzhVarZzu.zzv(), zzhVarZzu.zzx(), zzhVarZzu.zzz(), (String) null, zzhVarZzu.zzD(), false, zzhVarZzu.zzl(), 0L, 0, zzhVarZzu.zzac(), false, zzhVarZzu.zzae(), zzhVarZzu.zzB(), zzhVarZzu.zzag(), zzB(str).zzl(), "", (String) null, zzhVarZzu.zzai(), zzhVarZzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzhVarZzu.zzao(), zzhVarZzu.zzaw(), zzhVarZzu.zzay(), zzhVarZzu.zzaH(), 0L, zzhVarZzu.zzaL()));
    }

    @WorkerThread
    public final void zzE(zzbg zzbgVar, zzr zzrVar) {
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzgu zzguVarZza = zzgu.zza(zzbgVar);
        zzt().zzI(zzguVarZza.zzd, zzj().zzW(str));
        zzt().zzG(zzguVarZza, zzd().zzd(str));
        zzbg zzbgVarZzb = zzguVarZza.zzb();
        if (!zzd().zzp(null, zzfx.zzbg) && Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzbgVarZzb.zza)) {
            zzbe zzbeVar = zzbgVarZzb.zzb;
            if ("referrer API v2".equals(zzbeVar.zzd("_cis"))) {
                String strZzd = zzbeVar.zzd("gclid");
                if (!TextUtils.isEmpty(strZzd)) {
                    zzab(new zzpk("_lgclid", zzbgVarZzb.zzd, strZzd, "auto"), zzrVar);
                }
            }
        }
        zzF(zzbgVarZzb, zzrVar);
    }

    @WorkerThread
    public final void zzF(zzbg zzbgVar, zzr zzrVar) {
        zzbg zzbgVar2;
        List<zzah> listZzt;
        List<zzah> listZzt2;
        List<zzah> listZzt3;
        String str;
        Preconditions.checkNotNull(zzrVar);
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzaW().zzg();
        zzu();
        long j11 = zzbgVar.zzd;
        zzgu zzguVarZza = zzgu.zza(zzbgVar);
        zzaW().zzg();
        zzpo.zzav((this.zzG == null || (str = this.zzH) == null || !str.equals(str2)) ? null : this.zzG, zzguVarZza.zzd, false);
        zzbg zzbgVarZzb = zzguVarZza.zzb();
        zzp();
        if (zzpj.zzD(zzbgVarZzb, zzrVar)) {
            if (!zzrVar.zzh) {
                zzan(zzrVar);
                return;
            }
            List list = zzrVar.zzr;
            if (list != null) {
                String str3 = zzbgVarZzb.zza;
                if (!list.contains(str3)) {
                    zzaV().zzj().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzbgVarZzb.zza, zzbgVarZzb.zzc);
                    return;
                } else {
                    Bundle bundleZzf = zzbgVarZzb.zzb.zzf();
                    bundleZzf.putLong("ga_safelisted", 1L);
                    zzbgVar2 = new zzbg(str3, new zzbe(bundleZzf), zzbgVarZzb.zzc, zzbgVarZzb.zzd);
                }
            } else {
                zzbgVar2 = zzbgVarZzb;
            }
            zzj().zzb();
            try {
                String str4 = zzbgVar2.zza;
                if ("_s".equals(str4) && !zzj().zzQ(str2, "_s") && zzbgVar2.zzb.zzb("_sid").longValue() != 0) {
                    if (zzj().zzQ(str2, "_f") || zzj().zzQ(str2, "_v")) {
                        zzj().zzY(str2, null, "_sid", zzG(str2, zzbgVar2));
                    } else {
                        zzj().zzY(str2, Long.valueOf(zzaZ().currentTimeMillis() - 15000), "_sid", zzG(str2, zzbgVar2));
                    }
                }
                zzav zzavVarZzj = zzj();
                Preconditions.checkNotEmpty(str2);
                zzavVarZzj.zzg();
                zzavVarZzj.zzay();
                if (j11 < 0) {
                    zzavVarZzj.zzu.zzaV().zze().zzc("Invalid time querying timed out conditional properties", zzgt.zzl(str2), Long.valueOf(j11));
                    listZzt = Collections.EMPTY_LIST;
                } else {
                    listZzt = zzavVarZzj.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j11)});
                }
                for (zzah zzahVar : listZzt) {
                    if (zzahVar != null) {
                        zzaV().zzk().zzd("User property timed out", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb), zzahVar.zzc.zza());
                        zzbg zzbgVar3 = zzahVar.zzg;
                        if (zzbgVar3 != null) {
                            zzH(new zzbg(zzbgVar3, j11), zzrVar);
                        }
                        zzj().zzr(str2, zzahVar.zzc.zzb);
                    }
                }
                zzav zzavVarZzj2 = zzj();
                Preconditions.checkNotEmpty(str2);
                zzavVarZzj2.zzg();
                zzavVarZzj2.zzay();
                if (j11 < 0) {
                    zzavVarZzj2.zzu.zzaV().zze().zzc("Invalid time querying expired conditional properties", zzgt.zzl(str2), Long.valueOf(j11));
                    listZzt2 = Collections.EMPTY_LIST;
                } else {
                    listZzt2 = zzavVarZzj2.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j11)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzah zzahVar2 : listZzt2) {
                    if (zzahVar2 != null) {
                        zzaV().zzk().zzd("User property expired", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                        zzj().zzk(str2, zzahVar2.zzc.zzb);
                        zzbg zzbgVar4 = zzahVar2.zzk;
                        if (zzbgVar4 != null) {
                            arrayList.add(zzbgVar4);
                        }
                        zzj().zzr(str2, zzahVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzH(new zzbg((zzbg) it.next(), j11), zzrVar);
                }
                zzav zzavVarZzj3 = zzj();
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str4);
                zzavVarZzj3.zzg();
                zzavVarZzj3.zzay();
                if (j11 < 0) {
                    zzib zzibVar = zzavVarZzj3.zzu;
                    zzibVar.zzaV().zze().zzd("Invalid time querying triggered conditional properties", zzgt.zzl(str2), zzibVar.zzl().zza(str4), Long.valueOf(j11));
                    listZzt3 = Collections.EMPTY_LIST;
                } else {
                    listZzt3 = zzavVarZzj3.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j11)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzah zzahVar3 : listZzt3) {
                    if (zzahVar3 != null) {
                        zzpk zzpkVar = zzahVar3.zzc;
                        zzpm zzpmVar = new zzpm((String) Preconditions.checkNotNull(zzahVar3.zza), zzahVar3.zzb, zzpkVar.zzb, j11, Preconditions.checkNotNull(zzpkVar.zza()));
                        if (zzj().zzl(zzpmVar)) {
                            zzaV().zzk().zzd("User property triggered", zzahVar3.zza, this.zzn.zzl().zzc(zzpmVar.zzc), zzpmVar.zze);
                        } else {
                            zzaV().zzb().zzd("Too many active user properties, ignoring", zzgt.zzl(zzahVar3.zza), this.zzn.zzl().zzc(zzpmVar.zzc), zzpmVar.zze);
                        }
                        zzbg zzbgVar5 = zzahVar3.zzi;
                        if (zzbgVar5 != null) {
                            arrayList2.add(zzbgVar5);
                        }
                        zzahVar3.zzc = new zzpk(zzpmVar);
                        zzahVar3.zze = true;
                        zzj().zzp(zzahVar3);
                    }
                }
                zzH(zzbgVar2, zzrVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzH(new zzbg((zzbg) it2.next(), j11), zzrVar);
                }
                zzj().zzc();
            } finally {
                zzj().zzd();
            }
        }
    }

    public final Bundle zzG(String str, zzbg zzbgVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbgVar.zzb.zzb("_sid").longValue());
        zzpm zzpmVarZzm = zzj().zzm(str, "_sno");
        if (zzpmVarZzm != null) {
            Object obj = zzpmVarZzm.zze;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    @WorkerThread
    public final String zzK(zzjk zzjkVar) {
        if (!zzjkVar.zzo(zzjj.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzt().zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @VisibleForTesting
    public final void zzT(String str, com.google.android.gms.internal.measurement.zzhv zzhvVar, Bundle bundle, String str2) {
        List listListOf = CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
        long jZzf = (zzpo.zzZ(zzhvVar.zza()) || zzpo.zzZ(str)) ? zzd().zzf(str2, true) : zzd().zze(str2, true);
        long jCodePointCount = zzhvVar.zzc().codePointCount(0, zzhvVar.zzc().length());
        zzpo zzpoVarZzt = zzt();
        String strZza = zzhvVar.zza();
        zzd();
        String strZzC = zzpoVarZzt.zzC(strZza, 40, true);
        if (jCodePointCount <= jZzf || listListOf.contains(zzhvVar.zza())) {
            return;
        }
        if ("_ev".equals(zzhvVar.zza())) {
            bundle.putString("_ev", zzt().zzC(zzhvVar.zzc(), zzd().zzf(str2, true), true));
            return;
        }
        zzaV().zzh().zzc("Param value is too long; discarded. Name, value length", strZzC, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strZzC);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(zzhvVar.zza());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x008c A[Catch: all -> 0x0016, PHI: r0
      0x008c: PHI (r0v2 int) = (r0v0 int), (r0v37 int) binds: [B:9:0x0027, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0034, B:21:0x0080, B:20:0x0071, B:22:0x008c, B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7, B:88:0x0267), top: B:95:0x0013, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c4 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d7 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fc A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0139  */
    /* JADX WARN: Code duplicated, block: B:50:0x0163 A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01ba A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01dd A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01f8 A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0232 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0242 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x024c A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0256 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0113 A[SYNTHETIC] */
    @VisibleForTesting
    @WorkerThread
    public final void zzU(boolean z11, int i11, Throwable th2, byte[] bArr, String str, List list) {
        byte[] bArr2;
        Integer numValueOf;
        HashMap map;
        Iterator it;
        Iterator it2;
        List listZzC;
        long jZzg;
        com.google.android.gms.internal.measurement.zzib zzibVar;
        zzos zzosVar;
        com.google.android.gms.internal.measurement.zzib zzibVar2;
        zzos zzosVar2;
        long jZzA;
        int i12 = i11;
        zzaW().zzg();
        zzu();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th3) {
                this.zzv = false;
                zzaL();
                throw th3;
            }
        } else {
            bArr2 = bArr;
        }
        List<Long> list2 = (List) Preconditions.checkNotNull(this.zzz);
        this.zzz = null;
        if (z11) {
            if (i12 == 200) {
                if (th2 != null) {
                    zzgr zzgrVarZzk = zzaV().zzk();
                    numValueOf = Integer.valueOf(i12);
                    zzgrVarZzk.zzc("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z11));
                    if (z11) {
                        this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
                    }
                    this.zzk.zze.zzb(0L);
                    zzaK();
                    if (z11) {
                        zzaV().zzk().zzc("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                    } else {
                        zzaV().zzk().zza("Purged empty bundles");
                    }
                    zzj().zzb();
                    map = new HashMap();
                    it = list.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        zzibVar2 = (com.google.android.gms.internal.measurement.zzib) pair.first;
                        zzosVar2 = (zzos) pair.second;
                        if (zzosVar2.zzc() != zzlr.SGTM_CLIENT) {
                            jZzA = zzj().zzA(str, zzibVar2, zzosVar2.zza(), zzosVar2.zzb(), zzosVar2.zzc(), null);
                            if (zzosVar2.zzc() == zzlr.GOOGLE_SIGNAL_PENDING) {
                                map.put(zzibVar2.zze(), Long.valueOf(jZzA));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair2 = (Pair) it2.next();
                        zzibVar = (com.google.android.gms.internal.measurement.zzib) pair2.first;
                        zzosVar = (zzos) pair2.second;
                        if (zzosVar.zzc() == zzlr.SGTM_CLIENT) {
                            zzj().zzA(str, zzibVar, zzosVar.zza(), zzosVar.zzb(), zzosVar.zzc(), (Long) map.get(zzibVar.zze()));
                        }
                    }
                    listZzC = zzj().zzC(str, zzon.zza(zzlr.SGTM_CLIENT), 1);
                    if (!listZzC.isEmpty()) {
                        jZzg = ((zzpi) listZzC.get(0)).zzg();
                        if (zzaZ().currentTimeMillis() > ((Long) zzfx.zzE.zzb(null)).longValue() + jZzg) {
                            zzaV().zze().zzc("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(jZzg));
                        }
                    }
                    for (Long l11 : list2) {
                        zzj().zzH(l11.longValue());
                    }
                    zzj().zzc();
                    zzj().zzd();
                    this.zzA = null;
                    if (!zzi().zzb()) {
                        if (zzi().zzb()) {
                            this.zzB = -1L;
                            zzaK();
                        } else {
                            this.zzB = -1L;
                            zzaK();
                        }
                    } else if (zzi().zzb()) {
                        this.zzB = -1L;
                        zzaK();
                    } else {
                        this.zzB = -1L;
                        zzaK();
                    }
                    this.zza = 0L;
                }
            } else if (i12 == 204) {
                i12 = 204;
                if (th2 != null) {
                    zzgr zzgrVarZzk2 = zzaV().zzk();
                    numValueOf = Integer.valueOf(i12);
                    zzgrVarZzk2.zzc("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z11));
                    if (z11) {
                        this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
                    }
                    this.zzk.zze.zzb(0L);
                    zzaK();
                    if (z11) {
                        zzaV().zzk().zzc("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                    } else {
                        zzaV().zzk().zza("Purged empty bundles");
                    }
                    zzj().zzb();
                    map = new HashMap();
                    it = list.iterator();
                    while (it.hasNext()) {
                        Pair pair3 = (Pair) it.next();
                        zzibVar2 = (com.google.android.gms.internal.measurement.zzib) pair3.first;
                        zzosVar2 = (zzos) pair3.second;
                        if (zzosVar2.zzc() != zzlr.SGTM_CLIENT) {
                            jZzA = zzj().zzA(str, zzibVar2, zzosVar2.zza(), zzosVar2.zzb(), zzosVar2.zzc(), null);
                            if (zzosVar2.zzc() == zzlr.GOOGLE_SIGNAL_PENDING) {
                                map.put(zzibVar2.zze(), Long.valueOf(jZzA));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair4 = (Pair) it2.next();
                        zzibVar = (com.google.android.gms.internal.measurement.zzib) pair4.first;
                        zzosVar = (zzos) pair4.second;
                        if (zzosVar.zzc() == zzlr.SGTM_CLIENT) {
                            zzj().zzA(str, zzibVar, zzosVar.zza(), zzosVar.zzb(), zzosVar.zzc(), (Long) map.get(zzibVar.zze()));
                        }
                    }
                    listZzC = zzj().zzC(str, zzon.zza(zzlr.SGTM_CLIENT), 1);
                    if (!listZzC.isEmpty()) {
                        jZzg = ((zzpi) listZzC.get(0)).zzg();
                        if (zzaZ().currentTimeMillis() > ((Long) zzfx.zzE.zzb(null)).longValue() + jZzg) {
                            zzaV().zze().zzc("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(jZzg));
                        }
                    }
                    while (r2.hasNext()) {
                        zzj().zzH(l11.longValue());
                    }
                    zzj().zzc();
                    zzj().zzd();
                    this.zzA = null;
                    if (!zzi().zzb()) {
                        if (zzi().zzb()) {
                            this.zzB = -1L;
                            zzaK();
                        } else {
                            this.zzB = -1L;
                            zzaK();
                        }
                    } else if (zzi().zzb()) {
                        this.zzB = -1L;
                        zzaK();
                    } else {
                        this.zzB = -1L;
                        zzaK();
                    }
                    this.zza = 0L;
                }
            }
            String str2 = new String(bArr2, StandardCharsets.UTF_8);
            zzaV().zzh().zzd("Network upload failed. Will retry later. code, error", Integer.valueOf(i12), th2, str2.substring(0, Math.min(32, str2.length())));
            this.zzk.zze.zzb(zzaZ().currentTimeMillis());
            if (i12 == 503 || i12 == 429) {
                this.zzk.zzc.zzb(zzaZ().currentTimeMillis());
            }
            zzj().zzJ(list2);
            zzaK();
        } else {
            zzgr zzgrVarZzk3 = zzaV().zzk();
            numValueOf = Integer.valueOf(i12);
            zzgrVarZzk3.zzc("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z11));
            if (z11) {
                try {
                    this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
                } catch (SQLiteException e11) {
                    zzaV().zzb().zzb("Database error while trying to delete uploaded bundles", e11);
                    this.zza = zzaZ().elapsedRealtime();
                    zzaV().zzk().zzb("Disable upload, time", Long.valueOf(this.zza));
                }
            }
            this.zzk.zze.zzb(0L);
            zzaK();
            if (z11) {
                zzaV().zzk().zzc("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
            } else {
                zzaV().zzk().zza("Purged empty bundles");
            }
            zzj().zzb();
            try {
                map = new HashMap();
                it = list.iterator();
                while (it.hasNext()) {
                    Pair pair5 = (Pair) it.next();
                    zzibVar2 = (com.google.android.gms.internal.measurement.zzib) pair5.first;
                    zzosVar2 = (zzos) pair5.second;
                    if (zzosVar2.zzc() != zzlr.SGTM_CLIENT) {
                        jZzA = zzj().zzA(str, zzibVar2, zzosVar2.zza(), zzosVar2.zzb(), zzosVar2.zzc(), null);
                        if (zzosVar2.zzc() == zzlr.GOOGLE_SIGNAL_PENDING && jZzA != -1 && !zzibVar2.zze().isEmpty()) {
                            map.put(zzibVar2.zze(), Long.valueOf(jZzA));
                        }
                    }
                }
                it2 = list.iterator();
                while (it2.hasNext()) {
                    Pair pair6 = (Pair) it2.next();
                    zzibVar = (com.google.android.gms.internal.measurement.zzib) pair6.first;
                    zzosVar = (zzos) pair6.second;
                    if (zzosVar.zzc() == zzlr.SGTM_CLIENT) {
                        zzj().zzA(str, zzibVar, zzosVar.zza(), zzosVar.zzb(), zzosVar.zzc(), (Long) map.get(zzibVar.zze()));
                    }
                }
                listZzC = zzj().zzC(str, zzon.zza(zzlr.SGTM_CLIENT), 1);
                if (!listZzC.isEmpty()) {
                    jZzg = ((zzpi) listZzC.get(0)).zzg();
                    if (zzaZ().currentTimeMillis() > ((Long) zzfx.zzE.zzb(null)).longValue() + jZzg) {
                        zzaV().zze().zzc("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(jZzg));
                    }
                }
                while (r2.hasNext()) {
                    try {
                        zzj().zzH(l11.longValue());
                    } catch (SQLiteException e12) {
                        List list3 = this.zzA;
                        if (list3 == null || !list3.contains(l11)) {
                            throw e12;
                        }
                    }
                }
                zzj().zzc();
                zzj().zzd();
                this.zzA = null;
                if (!zzi().zzb() && zzj().zzD(str)) {
                    zzP(str);
                } else if (zzi().zzb() || !zzaI()) {
                    this.zzB = -1L;
                    zzaK();
                } else {
                    zzM();
                }
                this.zza = 0L;
            } catch (Throwable th4) {
                zzj().zzd();
                throw th4;
            }
        }
        this.zzv = false;
        zzaL();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final zzae zzaU() {
        return this.zzn.zzaU();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final zzgt zzaV() {
        return ((zzib) Preconditions.checkNotNull(this.zzn)).zzaV();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final zzhy zzaW() {
        return ((zzib) Preconditions.checkNotNull(this.zzn)).zzaW();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final Context zzaY() {
        return this.zzn.zzaY();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final Clock zzaZ() {
        return ((zzib) Preconditions.checkNotNull(this.zzn)).zzaZ();
    }

    @VisibleForTesting(otherwise = 4)
    @WorkerThread
    public final void zzaa(zzr zzrVar) {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzA = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzav zzavVarZzj = zzj();
        String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        Preconditions.checkNotEmpty(str);
        zzavVarZzj.zzg();
        zzavVarZzj.zzay();
        try {
            SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZze.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZze.delete(DbParams.TABLE_EVENTS, "app_id=?", strArr) + sQLiteDatabaseZze.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseZze.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZze.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZze.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZze.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZze.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseZze.delete("upload_queue", "app_id=?", strArr);
            com.google.android.gms.internal.measurement.zzpk.zza();
            zzib zzibVar = zzavVarZzj.zzu;
            if (zzibVar.zzc().zzp(null, zzfx.zzbi)) {
                iDelete += sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (iDelete > 0) {
                zzibVar.zzaV().zzk().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e11) {
            zzavVarZzj.zzu.zzaV().zzb().zzc("Error resetting analytics data. appId, error", zzgt.zzl(str), e11);
        }
        if (zzrVar.zzh) {
            zzag(zzrVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:43:0x0103  */
    @WorkerThread
    public final void zzab(zzpk zzpkVar, zzr zzrVar) {
        zzpm zzpmVarZzm;
        zzbc zzbcVarZzf;
        long jLongValue;
        zzaW().zzg();
        zzu();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzan(zzrVar);
                return;
            }
            zzpo zzpoVarZzt = zzt();
            String str = zzpkVar.zzb;
            int iZzp = zzpoVarZzt.zzp(str);
            int length = 0;
            if (iZzp != 0) {
                zzpo zzpoVarZzt2 = zzt();
                zzd();
                zzt().zzN(this.zzK, zzrVar.zza, iZzp, "_ev", zzpoVarZzt2.zzC(str, 24, true), str != null ? str.length() : 0);
                return;
            }
            int iZzK = zzt().zzK(str, zzpkVar.zza());
            if (iZzK != 0) {
                zzpo zzpoVarZzt3 = zzt();
                zzd();
                String strZzC = zzpoVarZzt3.zzC(str, 24, true);
                Object objZza = zzpkVar.zza();
                if (objZza != null && ((objZza instanceof String) || (objZza instanceof CharSequence))) {
                    length = objZza.toString().length();
                }
                zzt().zzN(this.zzK, zzrVar.zza, iZzK, "_ev", strZzC, length);
                return;
            }
            Object objZzL = zzt().zzL(str, zzpkVar.zza());
            if (objZzL != null) {
                if ("_sid".equals(str)) {
                    long j11 = zzpkVar.zzc;
                    String str2 = zzpkVar.zzf;
                    String str3 = (String) Preconditions.checkNotNull(zzrVar.zza);
                    zzpm zzpmVarZzm2 = zzj().zzm(str3, "_sno");
                    if (zzpmVarZzm2 != null) {
                        Object obj = zzpmVarZzm2.zze;
                        if (obj instanceof Long) {
                            jLongValue = ((Long) obj).longValue();
                        } else {
                            if (zzpmVarZzm2 != null) {
                                zzaV().zze().zzb("Retrieved last session number from database does not contain a valid (long) value", zzpmVarZzm2.zze);
                            }
                            zzbcVarZzf = zzj().zzf(str3, "_s");
                            if (zzbcVarZzf != null) {
                                zzgr zzgrVarZzk = zzaV().zzk();
                                long j12 = zzbcVarZzf.zzc;
                                zzgrVarZzk.zzb("Backfill the session number. Last used session number", Long.valueOf(j12));
                                jLongValue = j12;
                            } else {
                                jLongValue = 0;
                            }
                        }
                    } else {
                        if (zzpmVarZzm2 != null) {
                            zzaV().zze().zzb("Retrieved last session number from database does not contain a valid (long) value", zzpmVarZzm2.zze);
                        }
                        zzbcVarZzf = zzj().zzf(str3, "_s");
                        if (zzbcVarZzf != null) {
                            zzgr zzgrVarZzk2 = zzaV().zzk();
                            long j13 = zzbcVarZzf.zzc;
                            zzgrVarZzk2.zzb("Backfill the session number. Last used session number", Long.valueOf(j13));
                            jLongValue = j13;
                        } else {
                            jLongValue = 0;
                        }
                    }
                    zzab(new zzpk("_sno", j11, Long.valueOf(jLongValue + 1), str2), zzrVar);
                }
                String str4 = zzrVar.zza;
                zzpm zzpmVar = new zzpm((String) Preconditions.checkNotNull(str4), (String) Preconditions.checkNotNull(zzpkVar.zzf), str, zzpkVar.zzc, objZzL);
                zzgr zzgrVarZzk3 = zzaV().zzk();
                zzib zzibVar = this.zzn;
                String str5 = zzpmVar.zzc;
                zzgrVarZzk3.zzc("Setting user property", zzibVar.zzl().zzc(str5), objZzL);
                zzj().zzb();
                try {
                    if ("_id".equals(str5) && (zzpmVarZzm = zzj().zzm(str4, "_id")) != null && !zzpmVar.zze.equals(zzpmVarZzm.zze)) {
                        zzj().zzk(str4, "_lair");
                    }
                    zzan(zzrVar);
                    boolean zZzl = zzj().zzl(zzpmVar);
                    if ("_sid".equals(str)) {
                        long jZzu = zzp().zzu(zzrVar.zzu);
                        zzh zzhVarZzu = zzj().zzu(str4);
                        if (zzhVarZzu != null) {
                            zzhVarZzu.zzan(jZzu);
                            if (zzhVarZzu.zza()) {
                                zzj().zzv(zzhVarZzu, false, false);
                            }
                        }
                    }
                    zzj().zzc();
                    if (!zZzl) {
                        zzaV().zzb().zzc("Too many unique user properties are set. Ignoring user property", zzibVar.zzl().zzc(str5), zzpmVar.zze);
                        zzt().zzN(this.zzK, str4, 9, null, null, 0);
                    }
                } finally {
                    zzj().zzd();
                }
            }
        }
    }

    public final void zzad() {
        this.zzs++;
    }

    public final void zzae() {
        this.zzt++;
    }

    public final zzib zzaf() {
        return this.zzn;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0328  */
    @WorkerThread
    public final void zzag(zzr zzrVar) {
        long j11;
        long j12;
        zzbc zzbcVarZzf;
        boolean z11;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        long j13;
        boolean z12;
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        if (zzaQ(zzrVar)) {
            zzh zzhVarZzu = zzj().zzu(str);
            if (zzhVarZzu != null && TextUtils.isEmpty(zzhVarZzu.zzf()) && !TextUtils.isEmpty(zzrVar.zzb)) {
                zzhVarZzu.zzI(0L);
                zzj().zzv(zzhVarZzu, false, false);
                zzh().zzh(str);
            }
            if (!zzrVar.zzh) {
                zzan(zzrVar);
                return;
            }
            long jCurrentTimeMillis = zzrVar.zzl;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = zzaZ().currentTimeMillis();
            }
            long j14 = jCurrentTimeMillis;
            int i11 = zzrVar.zzm;
            if (i11 != 0 && i11 != 1) {
                zzaV().zze().zzc("Incorrect app type, assuming installed app. appId, appType", zzgt.zzl(str), Integer.valueOf(i11));
                i11 = 0;
            }
            zzj().zzb();
            try {
                zzpm zzpmVarZzm = zzj().zzm(str, "_npa");
                Boolean boolZzaT = zzaT(zzrVar);
                if (zzpmVarZzm != null && !"auto".equals(zzpmVarZzm.zzb)) {
                    j11 = j14;
                    j12 = 1;
                } else if (boolZzaT != null) {
                    zzpk zzpkVar = new zzpk("_npa", j14, Long.valueOf(true != boolZzaT.booleanValue() ? 0L : 1L), "auto");
                    j12 = 1;
                    j11 = j14;
                    if (zzpmVarZzm == null || !zzpmVarZzm.zze.equals(zzpkVar.zzd)) {
                        zzab(zzpkVar, zzrVar);
                    }
                } else {
                    j11 = j14;
                    j12 = 1;
                    if (zzpmVarZzm != null) {
                        zzac("_npa", zzrVar);
                    }
                }
                if (zzd().zzp(null, zzfx.zzbc)) {
                    zzam(zzrVar, zzrVar.zzD);
                } else {
                    zzam(zzrVar, j11);
                }
                zzan(zzrVar);
                if (i11 == 0) {
                    zzbcVarZzf = zzj().zzf(str, "_f");
                    z11 = false;
                } else {
                    zzbcVarZzf = zzj().zzf(str, "_v");
                    z11 = true;
                }
                if (zzbcVarZzf == null) {
                    long j15 = ((j11 / FundingRateEntity.MILLIS_PER_HOUR) + j12) * FundingRateEntity.MILLIS_PER_HOUR;
                    if (z11) {
                        long j16 = j11;
                        zzab(new zzpk("_fvt", j16, Long.valueOf(j15), "auto"), zzrVar);
                        zzaW().zzg();
                        zzu();
                        Bundle bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (zzrVar.zzo) {
                            bundle.putLong("_dac", 1L);
                        }
                        zzE(new zzbg("_v", new zzbe(bundle), "auto", j16), zzrVar);
                    } else {
                        Long lValueOf = Long.valueOf(j15);
                        long j17 = j11;
                        zzab(new zzpk("_fot", j17, lValueOf, "auto"), zzrVar);
                        zzaW().zzg();
                        zzhj zzhjVar = (zzhj) Preconditions.checkNotNull(this.zzm);
                        if (str == null || str.isEmpty()) {
                            zzhjVar.zza.zzaV().zzf().zza("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            zzib zzibVar = zzhjVar.zza;
                            zzibVar.zzaW().zzg();
                            if (zzhjVar.zza()) {
                                zzhi zzhiVar = new zzhi(zzhjVar, str);
                                zzibVar.zzaW().zzg();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = zzibVar.zzaY().getPackageManager();
                                if (packageManager == null) {
                                    zzibVar.zzaV().zzf().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        zzibVar.zzaV().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str2 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(str2) && zzhjVar.zza()) {
                                                try {
                                                    zzibVar.zzaV().zzk().zzb("Install Referrer Service is", ConnectionTracker.getInstance().bindService(zzibVar.zzaY(), new Intent(intent), zzhiVar, 1) ? "available" : "not available");
                                                } catch (RuntimeException e11) {
                                                    zzhjVar.zza.zzaV().zzb().zzb("Exception occurred while binding to Install Referrer Service", e11.getMessage());
                                                }
                                            } else {
                                                zzibVar.zzaV().zze().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                }
                            } else {
                                zzibVar.zzaV().zzi().zza("Install Referrer Reporter is not available");
                            }
                        }
                        zzaW().zzg();
                        zzu();
                        Bundle bundle2 = new Bundle();
                        long j18 = j12;
                        bundle2.putLong("_c", j18);
                        bundle2.putLong("_r", j18);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        bundle2.putLong("_et", j18);
                        if (zzrVar.zzo) {
                            bundle2.putLong("_dac", j18);
                        }
                        String str3 = (String) Preconditions.checkNotNull(zzrVar.zza);
                        zzav zzavVarZzj = zzj();
                        Preconditions.checkNotEmpty(str3);
                        zzavVarZzj.zzg();
                        zzavVarZzj.zzay();
                        long jZzN = zzavVarZzj.zzN(str3, "first_open_count");
                        zzib zzibVar2 = this.zzn;
                        if (zzibVar2.zzaY().getPackageManager() == null) {
                            zzaV().zzb().zzb("PackageManager is null, first open report might be inaccurate. appId", zzgt.zzl(str3));
                        } else {
                            try {
                                packageInfo = Wrappers.packageManager(zzibVar2.zzaY()).getPackageInfo(str3, 0);
                            } catch (PackageManager.NameNotFoundException e12) {
                                zzaV().zzb().zzc("Package info is null, first open report might be inaccurate. appId", zzgt.zzl(str3), e12);
                                packageInfo = null;
                            }
                            if (packageInfo != null) {
                                long j19 = packageInfo.firstInstallTime;
                                if (j19 != 0) {
                                    if (j19 != packageInfo.lastUpdateTime) {
                                        applicationInfo = null;
                                        if (!zzd().zzp(null, zzfx.zzaI)) {
                                            bundle2.putLong("_uwa", 1L);
                                        } else if (jZzN == 0) {
                                            bundle2.putLong("_uwa", 1L);
                                            jZzN = 0;
                                        }
                                        z12 = false;
                                    } else {
                                        applicationInfo = null;
                                        z12 = true;
                                    }
                                    zzab(new zzpk("_fi", j17, Long.valueOf(true != z12 ? 0L : 1L), "auto"), zzrVar);
                                } else {
                                    applicationInfo = null;
                                }
                            } else {
                                applicationInfo = null;
                            }
                            try {
                                applicationInfo2 = Wrappers.packageManager(this.zzn.zzaY()).getApplicationInfo(str3, 0);
                            } catch (PackageManager.NameNotFoundException e13) {
                                zzaV().zzb().zzc("Application info is null, first open report might be inaccurate. appId", zzgt.zzl(str3), e13);
                                applicationInfo2 = applicationInfo;
                            }
                            if (applicationInfo2 != null) {
                                if ((applicationInfo2.flags & 1) != 0) {
                                    j13 = 1;
                                    bundle2.putLong("_sys", 1L);
                                } else {
                                    j13 = 1;
                                }
                                if ((applicationInfo2.flags & 128) != 0) {
                                    bundle2.putLong("_sysu", j13);
                                }
                            }
                        }
                        if (jZzN >= 0) {
                            bundle2.putLong("_pfo", jZzN);
                        }
                        zzE(new zzbg("_f", new zzbe(bundle2), "auto", j17), zzrVar);
                    }
                } else {
                    long j21 = j11;
                    if (zzrVar.zzi) {
                        zzE(new zzbg("_cd", new zzbe(new Bundle()), "auto", j21), zzrVar);
                    }
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th2) {
                zzj().zzd();
                throw th2;
            }
        }
    }

    @WorkerThread
    public final void zzai(zzah zzahVar) {
        zzr zzrVarZzaN = zzaN((String) Preconditions.checkNotNull(zzahVar.zza));
        if (zzrVarZzaN != null) {
            zzaj(zzahVar, zzrVarZzaN);
        }
    }

    @WorkerThread
    public final void zzak(zzah zzahVar) {
        zzr zzrVarZzaN = zzaN((String) Preconditions.checkNotNull(zzahVar.zza));
        if (zzrVarZzaN != null) {
            zzal(zzahVar, zzrVarZzaN);
        }
    }

    @WorkerThread
    public final void zzam(zzr zzrVar, long j11) {
        zzh zzhVarZzu = zzj().zzu((String) Preconditions.checkNotNull(zzrVar.zza));
        if (zzhVarZzu != null && zzt().zzB(zzrVar.zzb, zzhVarZzu.zzf())) {
            zzaV().zze().zzb("New GMP App Id passed in. Removing cached database data. appId", zzgt.zzl(zzhVarZzu.zzc()));
            zzav zzavVarZzj = zzj();
            String strZzc = zzhVarZzu.zzc();
            zzavVarZzj.zzay();
            zzavVarZzj.zzg();
            Preconditions.checkNotEmpty(strZzc);
            try {
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
                String[] strArr = {strZzc};
                int iDelete = sQLiteDatabaseZze.delete(DbParams.TABLE_EVENTS, "app_id=?", strArr) + sQLiteDatabaseZze.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZze.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZze.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZze.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZze.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZze.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZze.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseZze.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.zzpk.zza();
                zzib zzibVar = zzavVarZzj.zzu;
                if (zzibVar.zzc().zzp(null, zzfx.zzbi)) {
                    iDelete += sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (iDelete > 0) {
                    zzibVar.zzaV().zzk().zzc("Deleted application data. app, records", strZzc, Integer.valueOf(iDelete));
                }
            } catch (SQLiteException e11) {
                zzavVarZzj.zzu.zzaV().zzb().zzc("Error deleting application data. appId, error", zzgt.zzl(strZzc), e11);
            }
            zzhVarZzu = null;
        }
        if (zzhVarZzu != null) {
            boolean z11 = (zzhVarZzu.zzt() == -2147483648L || zzhVarZzu.zzt() == zzrVar.zzj) ? false : true;
            String strZzr = zzhVarZzu.zzr();
            if (z11 || ((zzhVarZzu.zzt() != -2147483648L || strZzr == null || strZzr.equals(zzrVar.zzc)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strZzr);
                zzbg zzbgVar = new zzbg("_au", new zzbe(bundle), "auto", j11);
                if (zzd().zzp(null, zzfx.zzbd)) {
                    zzE(zzbgVar, zzrVar);
                } else {
                    zzF(zzbgVar, zzrVar);
                }
            }
        }
    }

    @WorkerThread
    public final List zzap(zzr zzrVar, Bundle bundle) {
        zzaW().zzg();
        zzql.zza();
        zzal zzalVarZzd = zzd();
        String str = zzrVar.zza;
        if (!zzalVarZzd.zzp(str, zzfx.zzaP) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzaV().zzb().zza("Uri sources and timestamps do not match");
                } else {
                    for (int i11 = 0; i11 < intArray.length; i11++) {
                        zzav zzavVarZzj = zzj();
                        int i12 = intArray[i11];
                        long j11 = longArray[i11];
                        Preconditions.checkNotEmpty(str);
                        zzavVarZzj.zzg();
                        zzavVarZzj.zzay();
                        try {
                            int iDelete = zzavVarZzj.zze().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i12), String.valueOf(j11)});
                            zzgr zzgrVarZzk = zzavVarZzj.zzu.zzaV().zzk();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(iDelete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            zzgrVarZzk.zzd(sb2.toString(), str, Integer.valueOf(i12), Long.valueOf(j11));
                        } catch (SQLiteException e11) {
                            zzavVarZzj.zzu.zzaV().zzb().zzc("Error pruning trigger URIs. appId", zzgt.zzl(str), e11);
                        }
                    }
                }
            }
        }
        zzav zzavVarZzj2 = zzj();
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzavVarZzj2.zzg();
        zzavVarZzj2.zzay();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zzavVarZzj2.zze().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzog(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e12) {
            zzavVarZzj2.zzu.zzaV().zzb().zzc("Error querying trigger uris. appId", zzgt.zzl(str2), e12);
            arrayList = Collections.EMPTY_LIST;
        }
        return arrayList;
    }

    public final /* synthetic */ zzib zzaw() {
        return this.zzn;
    }

    public final /* synthetic */ Deque zzax() {
        return this.zzr;
    }

    public final /* synthetic */ void zzay(long j11) {
        this.zzJ = j11;
    }

    public final zzal zzd() {
        return ((zzib) Preconditions.checkNotNull(this.zzn)).zzc();
    }

    public final zzot zzf() {
        return this.zzl;
    }

    public final zzhs zzh() {
        zzhs zzhsVar = this.zzc;
        zzaS(zzhsVar);
        return zzhsVar;
    }

    public final zzgy zzi() {
        zzgy zzgyVar = this.zzd;
        zzaS(zzgyVar);
        return zzgyVar;
    }

    public final zzav zzj() {
        zzav zzavVar = this.zze;
        zzaS(zzavVar);
        return zzavVar;
    }

    public final zzha zzk() {
        zzha zzhaVar = this.zzf;
        if (zzhaVar != null) {
            return zzhaVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzoj zzl() {
        zzoj zzojVar = this.zzg;
        zzaS(zzojVar);
        return zzojVar;
    }

    public final zzad zzm() {
        zzad zzadVar = this.zzh;
        zzaS(zzadVar);
        return zzadVar;
    }

    public final zzlo zzn() {
        zzlo zzloVar = this.zzj;
        zzaS(zzloVar);
        return zzloVar;
    }

    public final zzpj zzp() {
        zzpj zzpjVar = this.zzi;
        zzaS(zzpjVar);
        return zzpjVar;
    }

    public final zznm zzq() {
        return this.zzk;
    }

    public final zzgm zzs() {
        return this.zzn.zzl();
    }

    public final zzpo zzt() {
        return ((zzib) Preconditions.checkNotNull(this.zzn)).zzk();
    }

    public final void zzu() {
        if (!this.zzo.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public zzpf(zzpg zzpgVar, zzib zzibVar) {
        Preconditions.checkNotNull(zzpgVar);
        this.zzn = zzib.zzy(zzpgVar.zza, null, null);
        this.zzB = -1L;
        this.zzl = new zzot(this);
        zzpj zzpjVar = new zzpj(this);
        zzpjVar.zzaz();
        this.zzi = zzpjVar;
        zzgy zzgyVar = new zzgy(this);
        zzgyVar.zzaz();
        this.zzd = zzgyVar;
        zzhs zzhsVar = new zzhs(this);
        zzhsVar.zzaz();
        this.zzc = zzhsVar;
        this.zzC = new HashMap();
        this.zzD = new HashMap();
        this.zzE = new HashMap();
        zzaW().zzj(new zzou(this, zzpgVar));
    }

    public static zzpf zza(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzpf.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzpf((zzpg) Preconditions.checkNotNull(new zzpg(context)), null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zzb;
    }

    @VisibleForTesting
    public static final void zzaA(com.google.android.gms.internal.measurement.zzhr zzhrVar, @NonNull String str) {
        List listZza = zzhrVar.zza();
        for (int i11 = 0; i11 < listZza.size(); i11++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i11)).zzb())) {
                zzhrVar.zzj(i11);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public final void zzau() {
        zzaW().zzg();
        if (!this.zzr.isEmpty() && !zzaD().zzc()) {
            long jMax = Math.max(0L, ((long) ((Integer) zzfx.zzaB.zzb(null)).intValue()) - (zzaZ().elapsedRealtime() - this.zzJ));
            zzaV().zzk().zzb("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
            zzaD().zzb(jMax);
        }
    }

    private final boolean zzaH(com.google.android.gms.internal.measurement.zzhr zzhrVar, com.google.android.gms.internal.measurement.zzhr zzhrVar2) {
        String strZzd;
        Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF = zzpj.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_sc");
        String strZzd2 = null;
        if (zzhwVarZzF == null) {
            strZzd = null;
        } else {
            strZzd = zzhwVarZzF.zzd();
        }
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF2 = zzpj.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), C33641f4.f69835v);
        if (zzhwVarZzF2 != null) {
            strZzd2 = zzhwVarZzF2.zzd();
        }
        if (strZzd2 != null && strZzd2.equals(strZzd)) {
            Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
            zzp();
            com.google.android.gms.internal.measurement.zzhw zzhwVarZzF3 = zzpj.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_et");
            if (zzhwVarZzF3 != null && zzhwVarZzF3.zze() && zzhwVarZzF3.zzf() > 0) {
                long jZzf = zzhwVarZzF3.zzf();
                zzp();
                com.google.android.gms.internal.measurement.zzhw zzhwVarZzF4 = zzpj.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_et");
                if (zzhwVarZzF4 != null && zzhwVarZzF4.zzf() > 0) {
                    jZzf += zzhwVarZzF4.zzf();
                }
                zzp();
                zzpj.zzC(zzhrVar2, "_et", Long.valueOf(jZzf));
                zzp();
                zzpj.zzC(zzhrVar, "_fr", 1L);
                return true;
            }
            return true;
        }
        return false;
    }

    private final boolean zzaI() {
        zzaW().zzg();
        zzu();
        if (!zzj().zzP() && TextUtils.isEmpty(zzj().zzF())) {
            return false;
        }
        return true;
    }

    @WorkerThread
    private final void zzaL() {
        zzaW().zzg();
        if (!this.zzu && !this.zzv && !this.zzw) {
            zzaV().zzk().zza("Stopping uploading service(s)");
            List list = this.zzq;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ((List) Preconditions.checkNotNull(this.zzq)).clear();
            return;
        }
        zzaV().zzk().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
    }

    @WorkerThread
    private final Boolean zzaM(zzh zzhVar) {
        try {
            if (zzhVar.zzt() != -2147483648L) {
                if (zzhVar.zzt() == Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionName;
                String strZzr = zzhVar.zzr();
                if (strZzr != null && strZzr.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    private final boolean zzaO(String str, String str2) {
        zzbc zzbcVarZzf = zzj().zzf(str, str2);
        if (zzbcVarZzf != null && zzbcVarZzf.zzc >= 1) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    public static final void zzaz(com.google.android.gms.internal.measurement.zzhr zzhrVar, int i11, String str) {
        List listZza = zzhrVar.zza();
        for (int i12 = 0; i12 < listZza.size(); i12++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i12)).zzb())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzhvVarZzn.zzb("_err");
        zzhvVarZzn.zzf(i11);
        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn.zzbc();
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzhvVarZzn2.zzb("_ev");
        zzhvVarZzn2.zzd(str);
        com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn2.zzbc();
        zzhrVar.zzf(zzhwVar);
        zzhrVar.zzf(zzhwVar2);
    }

    @WorkerThread
    public final void zzA(String str, zzjk zzjkVar) {
        zzaW().zzg();
        zzu();
        this.zzC.put(str, zzjkVar);
        zzj().zzab(str, zzjkVar);
    }

    public final long zzC() {
        long jCurrentTimeMillis = zzaZ().currentTimeMillis();
        zznm zznmVar = this.zzk;
        zznmVar.zzay();
        zznmVar.zzg();
        zzhd zzhdVar = zznmVar.zzf;
        long jZza = zzhdVar.zza();
        if (jZza == 0) {
            jZza = ((long) zznmVar.zzu.zzk().zzf().nextInt(86400000)) + 1;
            zzhdVar.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    @WorkerThread
    public final void zzJ(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        zzaW().zzg();
        zzu();
        com.google.android.gms.internal.measurement.zzgx zzgxVarZzr = com.google.android.gms.internal.measurement.zzha.zzr();
        byte[] bArrZzaJ = zzhVar.zzaJ();
        if (bArrZzaJ != null) {
            try {
                zzgxVarZzr = (com.google.android.gms.internal.measurement.zzgx) zzpj.zzw(zzgxVarZzr, bArrZzaJ);
            } catch (com.google.android.gms.internal.measurement.zzmq unused) {
                zzaV().zze().zzb("Failed to parse locally stored ad campaign info. appId", zzgt.zzl(zzhVar.zzc()));
            }
        }
        for (com.google.android.gms.internal.measurement.zzhs zzhsVar : zzicVar.zzb()) {
            if (zzhsVar.zzd().equals(Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                String str = (String) zzpj.zzJ(zzhsVar, "gclid", "");
                String str2 = (String) zzpj.zzJ(zzhsVar, "gbraid", "");
                String str3 = (String) zzpj.zzJ(zzhsVar, "gad_source", "");
                String[] strArrSplit = ((String) zzfx.zzbh.zzb(null)).split(",");
                zzp();
                if (!zzpj.zzG(zzhsVar, strArrSplit).isEmpty()) {
                    long jLongValue = ((Long) zzpj.zzJ(zzhsVar, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = zzhsVar.zzf();
                    }
                    if ("referrer API v2".equals(zzpj.zzI(zzhsVar, "_cis"))) {
                        if (jLongValue > zzgxVarZzr.zzo()) {
                            if (str.isEmpty()) {
                                zzgxVarZzr.zzj();
                            } else {
                                zzgxVarZzr.zzi(str);
                            }
                            if (str2.isEmpty()) {
                                zzgxVarZzr.zzl();
                            } else {
                                zzgxVarZzr.zzk(str2);
                            }
                            if (str3.isEmpty()) {
                                zzgxVarZzr.zzn();
                            } else {
                                zzgxVarZzr.zzm(str3);
                            }
                            zzgxVarZzr.zzp(jLongValue);
                            zzgxVarZzr.zzs();
                            zzgxVarZzr.zzt(zzaC(zzhsVar));
                        }
                    } else if (jLongValue > zzgxVarZzr.zzg()) {
                        if (str.isEmpty()) {
                            zzgxVarZzr.zzb();
                        } else {
                            zzgxVarZzr.zza(str);
                        }
                        if (str2.isEmpty()) {
                            zzgxVarZzr.zzd();
                        } else {
                            zzgxVarZzr.zzc(str2);
                        }
                        if (str3.isEmpty()) {
                            zzgxVarZzr.zzf();
                        } else {
                            zzgxVarZzr.zze(str3);
                        }
                        zzgxVarZzr.zzh(jLongValue);
                        zzgxVarZzr.zzq();
                        zzgxVarZzr.zzr(zzaC(zzhsVar));
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc()).equals(com.google.android.gms.internal.measurement.zzha.zzs())) {
            zzicVar.zzaM((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc());
        }
        zzhVar.zzaI(((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc()).zzcc());
        if (zzhVar.zza()) {
            zzj().zzv(zzhVar, false, false);
        }
        if (zzd().zzp(null, zzfx.zzbg)) {
            zzj().zzk(zzhVar.zzc(), "_lgclid");
        }
    }

    @VisibleForTesting
    public final void zzL(List list) {
        Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzaV().zzb().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01b4 A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #6 {all -> 0x002c, blocks: (B:3:0x000e, B:5:0x001d, B:8:0x002f, B:10:0x0035, B:11:0x0044, B:13:0x004c, B:14:0x0051, B:16:0x005c, B:17:0x006b, B:19:0x0075, B:20:0x0087, B:22:0x00a6, B:24:0x00ac, B:25:0x00af, B:27:0x00c8, B:28:0x00df, B:30:0x00ef, B:32:0x00f5, B:35:0x010a, B:45:0x0128, B:47:0x012d, B:48:0x0130, B:49:0x0131, B:50:0x0136, B:55:0x0172, B:71:0x0199, B:73:0x019f, B:75:0x01a9, B:79:0x01b4, B:80:0x01b7, B:33:0x00f9, B:37:0x010e, B:42:0x0116), top: B:90:0x000e, inners: #2 }] */
    @WorkerThread
    public final void zzM() {
        Throwable th2;
        SQLiteException e11;
        Cursor cursorRawQuery;
        zzh zzhVarZzu;
        zzaW().zzg();
        zzu();
        this.zzw = true;
        try {
            zzib zzibVar = this.zzn;
            zzibVar.zzaU();
            Boolean boolZzJ = zzibVar.zzt().zzJ();
            if (boolZzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (boolZzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaK();
            } else {
                zzaW().zzg();
                if (this.zzz != null) {
                    zzaV().zzk().zza("Uploading requested multiple times");
                } else if (!zzi().zzb()) {
                    zzaV().zzk().zza("Network not connected, ignoring upload request");
                    zzaK();
                } else {
                    long jCurrentTimeMillis = zzaZ().currentTimeMillis();
                    Cursor cursor = null;
                    cursorRawQuery = null;
                    Cursor cursorRawQuery2 = null;
                    string = null;
                    string = null;
                    String string = null;
                    int iZzm = zzd().zzm(null, zzfx.zzai);
                    zzd();
                    long jZzF = jCurrentTimeMillis - zzal.zzF();
                    for (int i11 = 0; i11 < iZzm && zzaF(null, jZzF); i11++) {
                    }
                    zzql.zza();
                    zzaW().zzg();
                    zzau();
                    long jZza = this.zzk.zzd.zza();
                    if (jZza != 0) {
                        zzaV().zzj().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jCurrentTimeMillis - jZza)));
                    }
                    String strZzF = zzj().zzF();
                    long j11 = -1;
                    if (!TextUtils.isEmpty(strZzF)) {
                        if (this.zzB == -1) {
                            zzav zzavVarZzj = zzj();
                            try {
                                try {
                                    cursorRawQuery2 = zzavVarZzj.zze().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursorRawQuery2.moveToFirst()) {
                                        j11 = cursorRawQuery2.getLong(0);
                                    }
                                } catch (Throwable th3) {
                                    if (cursorRawQuery2 != null) {
                                        cursorRawQuery2.close();
                                    }
                                    throw th3;
                                }
                            } catch (SQLiteException e12) {
                                zzavVarZzj.zzu.zzaV().zzb().zzb("Error querying raw events", e12);
                                if (cursorRawQuery2 != null) {
                                }
                                this.zzB = j11;
                                zzN(strZzF, jCurrentTimeMillis);
                                this.zzw = false;
                                zzaL();
                            }
                            cursorRawQuery2.close();
                            this.zzB = j11;
                        }
                        zzN(strZzF, jCurrentTimeMillis);
                    } else {
                        this.zzB = -1L;
                        zzav zzavVarZzj2 = zzj();
                        zzd();
                        long jZzF2 = jCurrentTimeMillis - zzal.zzF();
                        zzavVarZzj2.zzg();
                        zzavVarZzj2.zzay();
                        try {
                            cursorRawQuery = zzavVarZzj2.zze().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jZzF2)});
                            try {
                                try {
                                    if (!cursorRawQuery.moveToFirst()) {
                                        zzavVarZzj2.zzu.zzaV().zzk().zza("No expired configs for apps with pending events");
                                    } else {
                                        string = cursorRawQuery.getString(0);
                                    }
                                } catch (SQLiteException e13) {
                                    e11 = e13;
                                    zzavVarZzj2.zzu.zzaV().zzb().zzb("Error selecting expired configs", e11);
                                    if (cursorRawQuery != null) {
                                    }
                                    if (!TextUtils.isEmpty(string)) {
                                        zzV(zzhVarZzu);
                                    }
                                    this.zzw = false;
                                    zzaL();
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                cursor = cursorRawQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th2;
                            }
                        } catch (SQLiteException e14) {
                            e11 = e14;
                            cursorRawQuery = null;
                        } catch (Throwable th5) {
                            th2 = th5;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th2;
                        }
                        cursorRawQuery.close();
                        if (!TextUtils.isEmpty(string) && (zzhVarZzu = zzj().zzu(string)) != null) {
                            zzV(zzhVarZzu);
                        }
                    }
                }
            }
            this.zzw = false;
            zzaL();
        } catch (Throwable th6) {
            this.zzw = false;
            zzaL();
            throw th6;
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final boolean zzO(String str, String str2) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null && zzt().zzaa(str, zzhVarZzu.zzay())) {
            this.zzF.remove(str2);
            return true;
        }
        zzpd zzpdVar = (zzpd) this.zzF.get(str2);
        if (zzpdVar == null) {
            return true;
        }
        return zzpdVar.zzb();
    }

    @WorkerThread
    public final void zzP(String str) {
        zzpi zzpiVar;
        com.google.android.gms.internal.measurement.zzib zzibVarZzd;
        zzaW().zzg();
        zzu();
        this.zzw = true;
        try {
            zzib zzibVar = this.zzn;
            zzibVar.zzaU();
            Boolean boolZzJ = zzibVar.zzt().zzJ();
            if (boolZzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (boolZzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaK();
            } else if (!zzi().zzb()) {
                zzaV().zzk().zza("Network not connected, ignoring upload request");
                zzaK();
            } else if (!zzj().zzD(str)) {
                zzaV().zzk().zzb("[sgtm] Upload queue has no batches for appId", str);
            } else {
                zzav zzavVarZzj = zzj();
                Preconditions.checkNotEmpty(str);
                zzavVarZzj.zzg();
                zzavVarZzj.zzay();
                List listZzC = zzavVarZzj.zzC(str, zzon.zza(zzlr.GOOGLE_SIGNAL), 1);
                if (listZzC.isEmpty()) {
                    zzpiVar = null;
                } else {
                    zzpiVar = (zzpi) listZzC.get(0);
                }
                if (zzpiVar != null && (zzibVarZzd = zzpiVar.zzd()) != null) {
                    zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, type, url", str, zzpiVar.zzf(), zzpiVar.zze());
                    byte[] bArrZzcc = zzibVarZzd.zzcc();
                    if (Log.isLoggable(zzaV().zzn(), 2)) {
                        zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrZzcc.length), zzp().zzi(zzibVarZzd));
                    }
                    zzos zzosVarZza = zzpiVar.zza();
                    this.zzv = true;
                    zzi().zzc(str, zzosVarZza, zzibVarZzd, new zzow(this, str, zzpiVar));
                }
            }
        } finally {
            this.zzw = false;
            zzaL();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:19:0x005a, B:22:0x0080, B:13:0x001e, B:15:0x0048, B:17:0x0052, B:18:0x0056), top: B:27:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:19:0x005a, B:22:0x0080, B:13:0x001e, B:15:0x0048, B:17:0x0052, B:18:0x0056), top: B:27:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:19:0x005a A[Catch: all -> 0x0010, PHI: r5
      0x005a: PHI (r5v7 int) = (r5v1 int), (r5v0 int) binds: [B:12:0x001c, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:19:0x005a, B:22:0x0080, B:13:0x001e, B:15:0x0048, B:17:0x0052, B:18:0x0056), top: B:27:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    @VisibleForTesting
    @WorkerThread
    public final void zzQ(@NonNull String str, int i11, Throwable th2, byte[] bArr, zzpi zzpiVar) {
        String strSubstring;
        Object obj;
        zzaW().zzg();
        zzu();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzv = false;
                zzaL();
            }
        }
        if (i11 != 200) {
            if (i11 == 204) {
                i11 = 204;
                if (th2 == null) {
                    zzj().zzE(Long.valueOf(zzpiVar.zzc()));
                    zzaV().zzk().zzc("Successfully uploaded batch from upload queue. appId, status", str, Integer.valueOf(i11));
                    if (!zzi().zzb()) {
                        zzaK();
                    } else {
                        zzaK();
                    }
                } else {
                    String str2 = new String(bArr, StandardCharsets.UTF_8);
                    strSubstring = str2.substring(0, Math.min(32, str2.length()));
                    zzgr zzgrVarZzh = zzaV().zzh();
                    Integer numValueOf = Integer.valueOf(i11);
                    obj = th2;
                    if (th2 == null) {
                        obj = strSubstring;
                    }
                    zzgrVarZzh.zzd("Network upload failed. Will retry later. appId, status, error", str, numValueOf, obj);
                    zzj().zzK(Long.valueOf(zzpiVar.zzc()));
                    zzaK();
                }
            } else {
                String str3 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str3.substring(0, Math.min(32, str3.length()));
                zzgr zzgrVarZzh2 = zzaV().zzh();
                Integer numValueOf2 = Integer.valueOf(i11);
                obj = th2;
                if (th2 == null) {
                    obj = strSubstring;
                }
                zzgrVarZzh2.zzd("Network upload failed. Will retry later. appId, status, error", str, numValueOf2, obj);
                zzj().zzK(Long.valueOf(zzpiVar.zzc()));
                zzaK();
            }
        } else if (th2 == null) {
            zzj().zzE(Long.valueOf(zzpiVar.zzc()));
            zzaV().zzk().zzc("Successfully uploaded batch from upload queue. appId, status", str, Integer.valueOf(i11));
            if (!zzi().zzb() && zzj().zzD(str)) {
                zzP(str);
            } else {
                zzaK();
            }
        } else {
            String str4 = new String(bArr, StandardCharsets.UTF_8);
            strSubstring = str4.substring(0, Math.min(32, str4.length()));
            zzgr zzgrVarZzh3 = zzaV().zzh();
            Integer numValueOf3 = Integer.valueOf(i11);
            obj = th2;
            if (th2 == null) {
                obj = strSubstring;
            }
            zzgrVarZzh3.zzd("Network upload failed. Will retry later. appId, status, error", str, numValueOf3, obj);
            zzj().zzK(Long.valueOf(zzpiVar.zzc()));
            zzaK();
        }
    }

    @WorkerThread
    public final void zzR(String str, boolean z11, Long l11, Long l12) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null) {
            zzhVarZzu.zzar(z11);
            zzhVarZzu.zzat(l11);
            zzhVarZzu.zzav(l12);
            if (zzhVarZzu.zza()) {
                zzj().zzv(zzhVarZzu, false, false);
            }
        }
    }

    public final void zzS(String str, com.google.android.gms.internal.measurement.zzic zzicVar) {
        int iZzx;
        int iIndexOf;
        Set setZzl = zzh().zzl(str);
        if (setZzl != null) {
            zzicVar.zzaw(setZzl);
        }
        if (zzh().zzp(str)) {
            zzicVar.zzG();
        }
        if (zzh().zzq(str)) {
            String strZzD = zzicVar.zzD();
            if (!TextUtils.isEmpty(strZzD) && (iIndexOf = strZzD.indexOf(C33978va.f72339h)) != -1) {
                zzicVar.zzE(strZzD.substring(0, iIndexOf));
            }
        }
        if (zzh().zzr(str) && (iZzx = zzpj.zzx(zzicVar, "_id")) != -1) {
            zzicVar.zzr(iZzx);
        }
        if (zzh().zzs(str)) {
            zzicVar.zzan();
        }
        if (zzh().zzt(str)) {
            zzicVar.zzX();
            if (zzB(str).zzo(zzjj.ANALYTICS_STORAGE)) {
                Map map = this.zzE;
                zzpc zzpcVar = (zzpc) map.get(str);
                if (zzpcVar == null || zzpcVar.zzb + zzd().zzl(str, zzfx.zzak) < zzaZ().elapsedRealtime()) {
                    zzpcVar = new zzpc(this, (byte[]) null);
                    map.put(str, zzpcVar);
                }
                zzicVar.zzax(zzpcVar.zza);
            }
        }
        if (zzh().zzu(str)) {
            zzicVar.zzav();
        }
    }

    @WorkerThread
    public final void zzV(zzh zzhVar) {
        zzaW().zzg();
        if (TextUtils.isEmpty(zzhVar.zzf())) {
            zzW((String) Preconditions.checkNotNull(zzhVar.zzc()), 204, null, null, null);
            return;
        }
        String str = (String) Preconditions.checkNotNull(zzhVar.zzc());
        zzaV().zzk().zzb("Fetching remote configuration", str);
        com.google.android.gms.internal.measurement.zzgl zzglVarZzb = zzh().zzb(str);
        String strZzd = zzh().zzd(str);
        ArrayMap arrayMap = null;
        if (zzglVarZzb != null) {
            if (!TextUtils.isEmpty(strZzd)) {
                arrayMap = new ArrayMap();
                arrayMap.put(HttpHeaders.IF_MODIFIED_SINCE, strZzd);
            }
            String strZze = zzh().zze(str);
            if (!TextUtils.isEmpty(strZze)) {
                if (arrayMap == null) {
                    arrayMap = new ArrayMap();
                }
                arrayMap.put(HttpHeaders.IF_NONE_MATCH, strZze);
            }
        }
        this.zzu = true;
        zzi().zzd(zzhVar, arrayMap, new zzgv() { // from class: com.google.android.gms.measurement.internal.zzpe
            @Override // com.google.android.gms.measurement.internal.zzgv
            public final /* synthetic */ void zza(String str2, int i11, Throwable th2, byte[] bArr, Map map) {
                this.zza.zzW(str2, i11, th2, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045 A[PHI: r8
      0x0045: PHI (r8v12 int) = (r8v2 int), (r8v0 int) binds: [B:15:0x0047, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    @VisibleForTesting
    @WorkerThread
    public final void zzW(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        boolean z11;
        zzaW().zzg();
        zzu();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.zzu = false;
                zzaL();
                throw th3;
            }
        }
        zzgr zzgrVarZzk = zzaV().zzk();
        Integer numValueOf = Integer.valueOf(bArr.length);
        zzgrVarZzk.zzb("onConfigFetched. Response size", numValueOf);
        zzj().zzb();
        try {
            zzh zzhVarZzu = zzj().zzu(str);
            if (i11 != 200 && i11 != 204) {
                if (i11 == 304) {
                    i11 = 304;
                    if (th2 == null) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
            } else if (th2 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (zzhVarZzu == null) {
                zzaV().zze().zzb("App does not exist in onConfigFetched. appId", zzgt.zzl(str));
            } else if (!z11 && i11 != 404) {
                zzhVarZzu.zzK(zzaZ().currentTimeMillis());
                zzj().zzv(zzhVarZzu, false, false);
                zzaV().zzk().zzc("Fetching config failed. code, error", Integer.valueOf(i11), th2);
                zzh().zzf(str);
                this.zzk.zze.zzb(zzaZ().currentTimeMillis());
                if (i11 == 503 || i11 == 429) {
                    this.zzk.zzc.zzb(zzaZ().currentTimeMillis());
                }
                zzaK();
            } else {
                String strZzaJ = zzaJ(map, HttpHeaders.LAST_MODIFIED);
                String strZzaJ2 = zzaJ(map, HttpHeaders.ETAG);
                if (i11 != 404 && i11 != 304) {
                    zzh().zzi(str, bArr, strZzaJ, strZzaJ2);
                } else if (zzh().zzb(str) == null) {
                    zzh().zzi(str, null, null, null);
                }
                zzhVarZzu.zzI(zzaZ().currentTimeMillis());
                zzj().zzv(zzhVarZzu, false, false);
                if (i11 == 404) {
                    zzaV().zzh().zzb("Config not found. Using empty config. appId", str);
                } else {
                    zzaV().zzk().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i11), numValueOf);
                }
                if (zzi().zzb() && zzaI()) {
                    zzM();
                } else if (zzi().zzb() && zzj().zzD(zzhVarZzu.zzc())) {
                    zzP(zzhVarZzu.zzc());
                } else {
                    zzaK();
                }
            }
            zzj().zzc();
            zzj().zzd();
            this.zzu = false;
            zzaL();
        } catch (Throwable th4) {
            zzj().zzd();
            throw th4;
        }
    }

    @WorkerThread
    public final void zzX(Runnable runnable) {
        zzaW().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    @WorkerThread
    public final void zzY() {
        zzaW().zzg();
        zzu();
        if (!this.zzp) {
            this.zzp = true;
            if (zzZ()) {
                FileChannel fileChannel = this.zzy;
                zzaW().zzg();
                int i11 = 0;
                if (fileChannel != null && fileChannel.isOpen()) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0L);
                        int i12 = fileChannel.read(byteBufferAllocate);
                        if (i12 != 4) {
                            if (i12 != -1) {
                                zzaV().zze().zzb("Unexpected data length. Bytes read", Integer.valueOf(i12));
                            }
                        } else {
                            byteBufferAllocate.flip();
                            i11 = byteBufferAllocate.getInt();
                        }
                    } catch (IOException e11) {
                        zzaV().zzb().zzb("Failed to read from channel", e11);
                    }
                } else {
                    zzaV().zzb().zza("Bad channel to read from");
                }
                int iZzm = this.zzn.zzv().zzm();
                zzaW().zzg();
                if (i11 > iZzm) {
                    zzaV().zzb().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i11), Integer.valueOf(iZzm));
                    return;
                }
                if (i11 < iZzm) {
                    FileChannel fileChannel2 = this.zzy;
                    zzaW().zzg();
                    if (fileChannel2 != null && fileChannel2.isOpen()) {
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                        byteBufferAllocate2.putInt(iZzm);
                        byteBufferAllocate2.flip();
                        try {
                            fileChannel2.truncate(0L);
                            fileChannel2.write(byteBufferAllocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                zzaV().zzb().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            zzaV().zzk().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i11), Integer.valueOf(iZzm));
                            return;
                        } catch (IOException e12) {
                            zzaV().zzb().zzb("Failed to write to channel", e12);
                        }
                    } else {
                        zzaV().zzb().zza("Bad channel to read from");
                    }
                    zzaV().zzb().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i11), Integer.valueOf(iZzm));
                }
            }
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final boolean zzZ() {
        zzaW().zzg();
        FileLock fileLock = this.zzx;
        if (fileLock != null && fileLock.isValid()) {
            zzaV().zzk().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzu.zzc();
        File filesDir = this.zzn.zzaY().getFilesDir();
        com.google.android.gms.internal.measurement.zzbv.zza();
        int i11 = com.google.android.gms.internal.measurement.zzca.zzb;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.zzy = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzx = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzaV().zzk().zza("Storage concurrent access okay");
                return true;
            }
            zzaV().zzb().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e11) {
            zzaV().zzb().zzb("Failed to acquire storage lock", e11);
            return false;
        } catch (IOException e12) {
            zzaV().zzb().zzb("Failed to access storage lock file", e12);
            return false;
        } catch (OverlappingFileLockException e13) {
            zzaV().zze().zzb("Storage lock already acquired", e13);
            return false;
        }
    }

    @WorkerThread
    public final void zzac(String str, zzr zzrVar) {
        long j11;
        zzaW().zzg();
        zzu();
        if (!zzaQ(zzrVar)) {
            return;
        }
        if (!zzrVar.zzh) {
            zzan(zzrVar);
            return;
        }
        Boolean boolZzaT = zzaT(zzrVar);
        if ("_npa".equals(str) && boolZzaT != null) {
            zzaV().zzj().zza("Falling back to manifest metadata value for ad personalization");
            long jCurrentTimeMillis = zzaZ().currentTimeMillis();
            if (true != boolZzaT.booleanValue()) {
                j11 = 0;
            } else {
                j11 = 1;
            }
            zzab(new zzpk("_npa", jCurrentTimeMillis, Long.valueOf(j11), "auto"), zzrVar);
            return;
        }
        zzgr zzgrVarZzj = zzaV().zzj();
        zzib zzibVar = this.zzn;
        zzgrVarZzj.zzb("Removing user property", zzibVar.zzl().zzc(str));
        zzj().zzb();
        try {
            zzan(zzrVar);
            if ("_id".equals(str)) {
                zzj().zzk((String) Preconditions.checkNotNull(zzrVar.zza), "_lair");
            }
            zzj().zzk((String) Preconditions.checkNotNull(zzrVar.zza), str);
            zzj().zzc();
            zzaV().zzj().zzb("User property removed", zzibVar.zzl().zzc(str));
        } finally {
            zzj().zzd();
        }
    }

    @WorkerThread
    public final void zzah(zzr zzrVar) throws Throwable {
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        int i11 = 0;
        if (zzd().zzp(null, zzfx.zzaz)) {
            long jCurrentTimeMillis = zzaZ().currentTimeMillis();
            int iZzm = zzd().zzm(null, zzfx.zzai);
            zzd();
            long jZzF = jCurrentTimeMillis - zzal.zzF();
            while (i11 < iZzm && zzaF(null, jZzF)) {
                i11++;
            }
        } else {
            zzd();
            long jZzH = zzal.zzH();
            while (i11 < jZzH && zzaF(str, 0L)) {
                i11++;
            }
        }
        if (zzd().zzp(null, zzfx.zzaA)) {
            zzaW().zzg();
            zzau();
        }
        if (this.zzl.zzc(str, com.google.android.gms.internal.measurement.zzin.zzb(zzrVar.zzE))) {
            zzaV().zzk().zzb("[sgtm] Going background, trigger client side upload. appId", str);
            zzN(str, zzaZ().currentTimeMillis());
        }
    }

    @WorkerThread
    public final void zzaj(zzah zzahVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotEmpty(zzahVar.zza);
        Preconditions.checkNotNull(zzahVar.zzb);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (!zzaQ(zzrVar)) {
            return;
        }
        if (!zzrVar.zzh) {
            zzan(zzrVar);
            return;
        }
        zzah zzahVar2 = new zzah(zzahVar);
        boolean z11 = false;
        zzahVar2.zze = false;
        zzj().zzb();
        try {
            zzah zzahVarZzq = zzj().zzq((String) Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzc.zzb);
            if (zzahVarZzq != null && !zzahVarZzq.zzb.equals(zzahVar2.zzb)) {
                zzaV().zze().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzb, zzahVarZzq.zzb);
            }
            if (zzahVarZzq != null && zzahVarZzq.zze) {
                zzahVar2.zzb = zzahVarZzq.zzb;
                zzahVar2.zzd = zzahVarZzq.zzd;
                zzahVar2.zzh = zzahVarZzq.zzh;
                zzahVar2.zzf = zzahVarZzq.zzf;
                zzahVar2.zzi = zzahVarZzq.zzi;
                zzahVar2.zze = true;
                zzpk zzpkVar = zzahVar2.zzc;
                zzahVar2.zzc = new zzpk(zzpkVar.zzb, zzahVarZzq.zzc.zzc, zzpkVar.zza(), zzahVarZzq.zzc.zzf);
            } else if (TextUtils.isEmpty(zzahVar2.zzf)) {
                zzpk zzpkVar2 = zzahVar2.zzc;
                zzahVar2.zzc = new zzpk(zzpkVar2.zzb, zzahVar2.zzd, zzpkVar2.zza(), zzahVar2.zzc.zzf);
                zzahVar2.zze = true;
                z11 = true;
            }
            if (zzahVar2.zze) {
                zzpk zzpkVar3 = zzahVar2.zzc;
                zzpm zzpmVar = new zzpm((String) Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzb, zzpkVar3.zzb, zzpkVar3.zzc, Preconditions.checkNotNull(zzpkVar3.zza()));
                if (zzj().zzl(zzpmVar)) {
                    zzaV().zzj().zzd("User property updated immediately", zzahVar2.zza, this.zzn.zzl().zzc(zzpmVar.zzc), zzpmVar.zze);
                } else {
                    zzaV().zzb().zzd("(2)Too many active user properties, ignoring", zzgt.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzpmVar.zzc), zzpmVar.zze);
                }
                if (z11 && zzahVar2.zzi != null) {
                    zzH(new zzbg(zzahVar2.zzi, zzahVar2.zzd), zzrVar);
                }
            }
            if (zzj().zzp(zzahVar2)) {
                zzaV().zzj().zzd("Conditional property added", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
            } else {
                zzaV().zzb().zzd("Too many conditional properties, ignoring", zzgt.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
            }
            zzj().zzc();
        } finally {
            zzj().zzd();
        }
    }

    @WorkerThread
    public final void zzal(zzah zzahVar, zzr zzrVar) {
        Bundle bundleZzf;
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotEmpty(zzahVar.zza);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (!zzaQ(zzrVar)) {
            return;
        }
        if (!zzrVar.zzh) {
            zzan(zzrVar);
            return;
        }
        zzj().zzb();
        try {
            zzan(zzrVar);
            String str = (String) Preconditions.checkNotNull(zzahVar.zza);
            zzah zzahVarZzq = zzj().zzq(str, zzahVar.zzc.zzb);
            if (zzahVarZzq != null) {
                zzaV().zzj().zzc("Removing conditional user property", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                zzj().zzr(str, zzahVar.zzc.zzb);
                if (zzahVarZzq.zze) {
                    zzj().zzk(str, zzahVar.zzc.zzb);
                }
                zzbg zzbgVar = zzahVar.zzk;
                if (zzbgVar != null) {
                    zzbe zzbeVar = zzbgVar.zzb;
                    if (zzbeVar != null) {
                        bundleZzf = zzbeVar.zzf();
                    } else {
                        bundleZzf = null;
                    }
                    zzH((zzbg) Preconditions.checkNotNull(zzt().zzac(str, ((zzbg) Preconditions.checkNotNull(zzbgVar)).zza, bundleZzf, zzahVarZzq.zzb, zzbgVar.zzd, true, true)), zzrVar);
                }
            } else {
                zzaV().zze().zzc("Conditional user property doesn't exist", zzgt.zzl(zzahVar.zza), this.zzn.zzl().zzc(zzahVar.zzc.zzb));
            }
            zzj().zzc();
        } finally {
            zzj().zzd();
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0136  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0158  */
    /* JADX WARN: Code duplicated, block: B:62:0x016d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:0x0199  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x01e2  */
    @WorkerThread
    public final zzh zzan(zzr zzrVar) {
        String strZzf;
        boolean z11;
        String str;
        long j11;
        String str2;
        String str3;
        String str4;
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str5 = zzrVar.zza;
        Preconditions.checkNotEmpty(str5);
        String str6 = zzrVar.zzt;
        byte[] bArr = null;
        if (!str6.isEmpty()) {
            this.zzE.put(str5, new zzpc(this, str6, bArr));
        }
        zzh zzhVarZzu = zzj().zzu(str5);
        zzjk zzjkVarZzs = zzB(str5).zzs(zzjk.zzf(zzrVar.zzs, 100));
        zzjj zzjjVar = zzjj.AD_STORAGE;
        if (zzjkVarZzs.zzo(zzjjVar)) {
            strZzf = this.zzk.zzf(str5, zzrVar.zzn);
        } else {
            strZzf = "";
        }
        boolean z12 = true;
        if (zzhVarZzu == null) {
            zzh zzhVar = new zzh(this.zzn, str5);
            if (zzjkVarZzs.zzo(zzjj.ANALYTICS_STORAGE)) {
                zzhVar.zze(zzK(zzjkVarZzs));
            }
            if (zzjkVarZzs.zzo(zzjjVar)) {
                zzhVar.zzk(strZzf);
            }
            zzhVarZzu = zzhVar;
        } else {
            if (zzjkVarZzs.zzo(zzjjVar) && strZzf != null && !strZzf.equals(zzhVarZzu.zzj())) {
                boolean zIsEmpty = TextUtils.isEmpty(zzhVarZzu.zzj());
                zzhVarZzu.zzk(strZzf);
                if (zzrVar.zzn && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzc(str5, zzjkVarZzs).first) && !zIsEmpty) {
                    if (zzjkVarZzs.zzo(zzjj.ANALYTICS_STORAGE)) {
                        zzhVarZzu.zze(zzK(zzjkVarZzs));
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (zzj().zzm(str5, "_id") != null && zzj().zzm(str5, "_lair") == null) {
                        zzj().zzl(new zzpm(str5, "auto", "_lair", zzaZ().currentTimeMillis(), 1L));
                    }
                } else if (TextUtils.isEmpty(zzhVarZzu.zzd()) && zzjkVarZzs.zzo(zzjj.ANALYTICS_STORAGE)) {
                    zzhVarZzu.zze(zzK(zzjkVarZzs));
                }
                zzhVarZzu.zzg(zzrVar.zzb);
                str = zzrVar.zzk;
                if (!TextUtils.isEmpty(str)) {
                    zzhVarZzu.zzm(str);
                }
                j11 = zzrVar.zze;
                if (j11 != 0) {
                    zzhVarZzu.zzy(j11);
                }
                str2 = zzrVar.zzc;
                if (!TextUtils.isEmpty(str2)) {
                    zzhVarZzu.zzs(str2);
                }
                zzhVarZzu.zzu(zzrVar.zzj);
                str3 = zzrVar.zzd;
                if (str3 != null) {
                    zzhVarZzu.zzw(str3);
                }
                zzhVarZzu.zzA(zzrVar.zzf);
                zzhVarZzu.zzE(zzrVar.zzh);
                str4 = zzrVar.zzg;
                if (!TextUtils.isEmpty(str4)) {
                    zzhVarZzu.zzab(str4);
                }
                zzhVarZzu.zzad(zzrVar.zzn);
                zzhVarZzu.zzaf(zzrVar.zzp);
                zzhVarZzu.zzC(zzrVar.zzq);
                zzhVarZzu.zzi(zzrVar.zzu);
                com.google.android.gms.internal.measurement.zzpn.zza();
                if (zzd().zzp(null, zzfx.zzaL)) {
                    zzhVarZzu.zzah(zzrVar.zzr);
                } else {
                    com.google.android.gms.internal.measurement.zzpn.zza();
                    if (zzd().zzp(null, zzfx.zzaK)) {
                        zzhVarZzu.zzah(null);
                    }
                }
                zzhVarZzu.zzaj(zzrVar.zzv);
                zzhVarZzu.zzaz(zzrVar.zzB);
                zzql.zza();
                if (zzd().zzp(null, zzfx.zzaP)) {
                    zzhVarZzu.zzap(zzrVar.zzz);
                }
                zzhVarZzu.zzal(zzrVar.zzw);
                zzhVarZzu.zzaG(zzrVar.zzC);
                zzhVarZzu.zzaK(zzrVar.zzE);
                if (!zzhVarZzu.zza()) {
                    if (!z11) {
                        return zzhVarZzu;
                    }
                } else {
                    z12 = z11;
                }
                zzj().zzv(zzhVarZzu, z12, false);
                return zzhVarZzu;
            }
            if (TextUtils.isEmpty(zzhVarZzu.zzd()) && zzjkVarZzs.zzo(zzjj.ANALYTICS_STORAGE)) {
                zzhVarZzu.zze(zzK(zzjkVarZzs));
            }
        }
        z11 = false;
        zzhVarZzu.zzg(zzrVar.zzb);
        str = zzrVar.zzk;
        if (!TextUtils.isEmpty(str)) {
            zzhVarZzu.zzm(str);
        }
        j11 = zzrVar.zze;
        if (j11 != 0) {
            zzhVarZzu.zzy(j11);
        }
        str2 = zzrVar.zzc;
        if (!TextUtils.isEmpty(str2)) {
            zzhVarZzu.zzs(str2);
        }
        zzhVarZzu.zzu(zzrVar.zzj);
        str3 = zzrVar.zzd;
        if (str3 != null) {
            zzhVarZzu.zzw(str3);
        }
        zzhVarZzu.zzA(zzrVar.zzf);
        zzhVarZzu.zzE(zzrVar.zzh);
        str4 = zzrVar.zzg;
        if (!TextUtils.isEmpty(str4)) {
            zzhVarZzu.zzab(str4);
        }
        zzhVarZzu.zzad(zzrVar.zzn);
        zzhVarZzu.zzaf(zzrVar.zzp);
        zzhVarZzu.zzC(zzrVar.zzq);
        zzhVarZzu.zzi(zzrVar.zzu);
        com.google.android.gms.internal.measurement.zzpn.zza();
        if (zzd().zzp(null, zzfx.zzaL)) {
            zzhVarZzu.zzah(zzrVar.zzr);
        } else {
            com.google.android.gms.internal.measurement.zzpn.zza();
            if (zzd().zzp(null, zzfx.zzaK)) {
                zzhVarZzu.zzah(null);
            }
        }
        zzhVarZzu.zzaj(zzrVar.zzv);
        zzhVarZzu.zzaz(zzrVar.zzB);
        zzql.zza();
        if (zzd().zzp(null, zzfx.zzaP)) {
            zzhVarZzu.zzap(zzrVar.zzz);
        }
        zzhVarZzu.zzal(zzrVar.zzw);
        zzhVarZzu.zzaG(zzrVar.zzC);
        zzhVarZzu.zzaK(zzrVar.zzE);
        if (!zzhVarZzu.zza()) {
            if (!z11) {
                return zzhVarZzu;
            }
        } else {
            z12 = z11;
        }
        zzj().zzv(zzhVarZzu, z12, false);
        return zzhVarZzu;
    }

    public final String zzao(zzr zzrVar) {
        try {
            return (String) zzaW().zzh(new zzoy(this, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            zzaV().zzb().zzc("Failed to get app instance id. appId", zzgt.zzl(zzrVar.zza), e11);
            return null;
        }
    }

    @WorkerThread
    public final void zzaq(String str, zzaf zzafVar) {
        zzaW().zzg();
        zzu();
        zzav zzavVarZzj = zzj();
        long j11 = zzafVar.zza;
        zzpi zzpiVarZzB = zzavVarZzj.zzB(j11);
        if (zzpiVarZzB == null) {
            zzaV().zze().zzc("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j11));
            return;
        }
        String strZze = zzpiVarZzB.zze();
        if (zzafVar.zzb == zzlq.SUCCESS.zza()) {
            Map map = this.zzF;
            if (map.containsKey(strZze)) {
                map.remove(strZze);
            }
            zzav zzavVarZzj2 = zzj();
            Long lValueOf = Long.valueOf(j11);
            zzavVarZzj2.zzE(lValueOf);
            zzaV().zzk().zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, lValueOf);
            long j12 = zzafVar.zzc;
            if (j12 > 0) {
                zzav zzavVarZzj3 = zzj();
                zzavVarZzj3.zzg();
                zzavVarZzj3.zzay();
                Long lValueOf2 = Long.valueOf(j12);
                Preconditions.checkNotNull(lValueOf2);
                ContentValues contentValues = new ContentValues();
                contentValues.put("upload_type", Integer.valueOf(zzlr.GOOGLE_SIGNAL.zza()));
                zzib zzibVar = zzavVarZzj3.zzu;
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzibVar.zzaZ().currentTimeMillis()));
                try {
                    if (zzavVarZzj3.zze().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j12), str, String.valueOf(zzlr.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                        zzibVar.zzaV().zze().zzc("Google Signal pending batch not updated. appId, rowId", str, lValueOf2);
                    }
                    zzaV().zzk().zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzafVar.zzc));
                    zzP(str);
                    return;
                } catch (SQLiteException e11) {
                    zzavVarZzj3.zzu.zzaV().zzb().zzd("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j12), e11);
                    throw e11;
                }
            }
            return;
        }
        if (zzafVar.zzb == zzlq.BACKOFF.zza()) {
            Map map2 = this.zzF;
            zzpd zzpdVar = (zzpd) map2.get(strZze);
            if (zzpdVar == null) {
                zzpdVar = new zzpd(this);
                map2.put(strZze, zzpdVar);
            } else {
                zzpdVar.zza();
            }
            zzaV().zzk().zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, strZze, Long.valueOf((zzpdVar.zzc() - zzaZ().currentTimeMillis()) / 1000));
        }
        zzav zzavVarZzj4 = zzj();
        Long lValueOf3 = Long.valueOf(zzafVar.zza);
        zzavVarZzj4.zzK(lValueOf3);
        zzaV().zzk().zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, lValueOf3);
    }

    public final void zzar(boolean z11) {
        zzaK();
    }

    @WorkerThread
    public final void zzas(String str, zzlt zzltVar) {
        zzaW().zzg();
        String str2 = this.zzH;
        if (str2 != null && !str2.equals(str) && zzltVar == null) {
            return;
        }
        this.zzH = str;
        this.zzG = zzltVar;
    }

    public final /* synthetic */ void zzat(zzpg zzpgVar) {
        zzaW().zzg();
        this.zzm = new zzhj(this);
        zzav zzavVar = new zzav(this);
        zzavVar.zzaz();
        this.zze = zzavVar;
        zzd().zza((zzak) Preconditions.checkNotNull(this.zzc));
        zznm zznmVar = new zznm(this);
        zznmVar.zzaz();
        this.zzk = zznmVar;
        zzad zzadVar = new zzad(this);
        zzadVar.zzaz();
        this.zzh = zzadVar;
        zzlo zzloVar = new zzlo(this);
        zzloVar.zzaz();
        this.zzj = zzloVar;
        zzoj zzojVar = new zzoj(this);
        zzojVar.zzaz();
        this.zzg = zzojVar;
        this.zzf = new zzha(this);
        if (this.zzs != this.zzt) {
            zzaV().zzb().zzc("Not all upload components initialized", Integer.valueOf(this.zzs), Integer.valueOf(this.zzt));
        }
        this.zzo.set(true);
        zzaV().zzk().zza("UploadController is now fully initialized");
    }

    @WorkerThread
    public final void zzc() {
        zzaW().zzg();
        zzj().zzI();
        zzav zzavVarZzj = zzj();
        zzavVarZzj.zzg();
        zzavVarZzj.zzay();
        if (zzavVarZzj.zzai()) {
            zzfw zzfwVar = zzfx.zzav;
            if (((Long) zzfwVar.zzb(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
                zzib zzibVar = zzavVarZzj.zzu;
                int iDelete = sQLiteDatabaseZze.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(zzibVar.zzaZ().currentTimeMillis()), String.valueOf(zzfwVar.zzb(null))});
                if (iDelete > 0) {
                    zzibVar.zzaV().zzk().zzb("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        if (this.zzk.zzd.zza() == 0) {
            this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
        }
        zzaK();
    }

    @WorkerThread
    public final void zzv(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzjk zzjkVarZzf = zzjk.zzf(zzrVar.zzs, zzrVar.zzx);
        zzB(str);
        zzaV().zzk().zzc("Setting storage consent for package", str, zzjkVarZzf);
        zzA(str, zzjkVarZzf);
    }

    @WorkerThread
    public final void zzw(zzr zzrVar) {
        boolean z11;
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzaz zzazVarZzg = zzaz.zzg(zzrVar.zzy);
        zzaV().zzk().zzc("Setting DMA consent for package", str, zzazVarZzg);
        zzaW().zzg();
        zzu();
        zzjh zzjhVarZzc = zzaz.zzh(zzy(str), 100).zzc();
        this.zzD.put(str, zzazVarZzg);
        zzj().zzad(str, zzazVarZzg);
        zzjh zzjhVarZzc2 = zzaz.zzh(zzy(str), 100).zzc();
        zzaW().zzg();
        zzu();
        zzjh zzjhVar = zzjh.DENIED;
        boolean z12 = true;
        if (zzjhVarZzc == zzjhVar && zzjhVarZzc2 == zzjh.GRANTED) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (zzjhVarZzc != zzjh.GRANTED || zzjhVarZzc2 != zzjhVar) {
            z12 = false;
        }
        if (!z11 && !z12) {
            return;
        }
        zzaV().zzk().zzb("Generated _dcu event for", str);
        Bundle bundle = new Bundle();
        if (zzj().zzw(zzC(), str, false, false, false, false, false, false, false).zzf < zzd().zzm(str, zzfx.zzam)) {
            bundle.putLong("_r", 1L);
            zzaV().zzk().zzc("_dcu realtime event count", str, Long.valueOf(zzj().zzw(zzC(), str, false, false, false, false, false, true, false).zzf));
        }
        this.zzK.zza(str, "_dcu", bundle);
    }

    @WorkerThread
    public final zzaz zzx(String str) {
        zzaW().zzg();
        zzu();
        Map map = this.zzD;
        zzaz zzazVar = (zzaz) map.get(str);
        if (zzazVar == null) {
            zzaz zzazVarZzac = zzj().zzac(str);
            map.put(str, zzazVarZzac);
            return zzazVarZzac;
        }
        return zzazVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @WorkerThread
    public final Bundle zzy(String str) {
        ?? ZzaB;
        String str2;
        zzaW().zzg();
        zzu();
        if (zzh().zzx(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjk zzjkVarZzB = zzB(str);
        bundle.putAll(zzjkVarZzB.zzn());
        bundle.putAll(zzz(str, zzx(str), zzjkVarZzB, new zzan()).zzf());
        zzpm zzpmVarZzm = zzj().zzm(str, "_npa");
        if (zzpmVarZzm != null) {
            ZzaB = zzpmVarZzm.zze.equals(1L);
        } else {
            ZzaB = zzaB(str, new zzan());
        }
        if (1 != ZzaB) {
            str2 = "granted";
        } else {
            str2 = "denied";
        }
        bundle.putString("ad_personalization", str2);
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    @VisibleForTesting
    @WorkerThread
    public final zzaz zzz(String str, zzaz zzazVar, zzjk zzjkVar, zzan zzanVar) {
        zzjh zzjhVar;
        zzhs zzhsVar;
        zzjj zzjjVar;
        zzjj zzjjVarZzw;
        zzjh zzjhVarZzp;
        boolean z11;
        int iZzb = 90;
        if (zzh().zzx(str) == null) {
            if (zzazVar.zzc() == zzjh.DENIED) {
                iZzb = zzazVar.zzb();
                zzanVar.zzb(zzjj.AD_USER_DATA, iZzb);
            } else {
                zzanVar.zzc(zzjj.AD_USER_DATA, zzam.FAILSAFE);
            }
            return new zzaz(Boolean.FALSE, iZzb, Boolean.TRUE, C33820nf.f71144W);
        }
        zzjh zzjhVarZzc = zzazVar.zzc();
        zzjh zzjhVar2 = zzjh.GRANTED;
        if (zzjhVarZzc != zzjhVar2 && zzjhVarZzc != (zzjhVar = zzjh.DENIED)) {
            if (zzjhVarZzc == zzjh.POLICY) {
                zzhs zzhsVar2 = this.zzc;
                zzjj zzjjVar2 = zzjj.AD_USER_DATA;
                zzjh zzjhVarZzA = zzhsVar2.zzA(str, zzjjVar2);
                if (zzjhVarZzA != zzjh.UNINITIALIZED) {
                    zzanVar.zzc(zzjjVar2, zzam.REMOTE_ENFORCED_DEFAULT);
                    zzjhVarZzc = zzjhVarZzA;
                } else {
                    zzhsVar = this.zzc;
                    zzjjVar = zzjj.AD_USER_DATA;
                    zzjjVarZzw = zzhsVar.zzw(str, zzjjVar);
                    zzjhVarZzp = zzjkVar.zzp();
                    if (zzjhVarZzp != zzjhVar2 || zzjhVarZzp == zzjhVar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (zzjjVarZzw != zzjj.AD_STORAGE && z11) {
                        zzanVar.zzc(zzjjVar, zzam.REMOTE_DELEGATION);
                        zzjhVarZzc = zzjhVarZzp;
                    } else {
                        zzanVar.zzc(zzjjVar, zzam.REMOTE_DEFAULT);
                        if (true != zzhsVar.zzv(str, zzjjVar)) {
                            zzjhVarZzc = zzjhVar;
                        } else {
                            zzjhVarZzc = zzjhVar2;
                        }
                    }
                }
            } else {
                zzhsVar = this.zzc;
                zzjjVar = zzjj.AD_USER_DATA;
                zzjjVarZzw = zzhsVar.zzw(str, zzjjVar);
                zzjhVarZzp = zzjkVar.zzp();
                if (zzjhVarZzp != zzjhVar2) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (zzjjVarZzw != zzjj.AD_STORAGE) {
                    zzanVar.zzc(zzjjVar, zzam.REMOTE_DEFAULT);
                    if (true != zzhsVar.zzv(str, zzjjVar)) {
                        zzjhVarZzc = zzjhVar;
                    } else {
                        zzjhVarZzc = zzjhVar2;
                    }
                } else {
                    zzanVar.zzc(zzjjVar, zzam.REMOTE_DEFAULT);
                    if (true != zzhsVar.zzv(str, zzjjVar)) {
                        zzjhVarZzc = zzjhVar;
                    } else {
                        zzjhVarZzc = zzjhVar2;
                    }
                }
            }
        } else {
            iZzb = zzazVar.zzb();
            zzanVar.zzb(zzjj.AD_USER_DATA, iZzb);
        }
        boolean zZzy = this.zzc.zzy(str);
        SortedSet sortedSetZzz = zzh().zzz(str);
        if (zzjhVarZzc != zzjh.DENIED && !sortedSetZzz.isEmpty()) {
            Boolean bool = Boolean.TRUE;
            Boolean boolValueOf = Boolean.valueOf(zZzy);
            String strJoin = "";
            if (zZzy) {
                strJoin = TextUtils.join("", sortedSetZzz);
            }
            return new zzaz(bool, iZzb, boolValueOf, strJoin);
        }
        return new zzaz(Boolean.FALSE, iZzb, Boolean.valueOf(zZzy), C33820nf.f71144W);
    }

    private static final void zzaR(com.google.android.gms.internal.measurement.zzic zzicVar) {
        zzicVar.zzv(Long.MAX_VALUE);
        zzicVar.zzx(Long.MIN_VALUE);
        for (int i11 = 0; i11 < zzicVar.zzc(); i11++) {
            com.google.android.gms.internal.measurement.zzhs zzhsVarZzd = zzicVar.zzd(i11);
            if (zzhsVarZzd.zzf() < zzicVar.zzu()) {
                zzicVar.zzv(zzhsVarZzd.zzf());
            }
            if (zzhsVarZzd.zzf() > zzicVar.zzw()) {
                zzicVar.zzx(zzhsVarZzd.zzf());
            }
        }
    }
}
