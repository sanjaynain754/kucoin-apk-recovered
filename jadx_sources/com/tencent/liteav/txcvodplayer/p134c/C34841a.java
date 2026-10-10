package com.tencent.liteav.txcvodplayer.p134c;

import android.text.TextUtils;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.liteav.base.storage.PersistStorage;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.txcplayer.common.C34809a;
import com.tencent.liteav.txcplayer.common.C34810b;
import com.tencent.liteav.txcplayer.p131a.C34804a;
import com.tencent.liteav.txcplayer.p131a.C34806c;
import com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder;
import com.tencent.liteav.txcvodplayer.p133b.C34836c;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.c.a */
/* JADX INFO: loaded from: classes59.dex */
public class C34841a {

    /* JADX INFO: renamed from: d */
    private static C34841a f74011d;

    /* JADX INFO: renamed from: a */
    public final C34806c f74012a;

    /* JADX INFO: renamed from: b */
    public final Object f74013b = new Object();

    /* JADX INFO: renamed from: c */
    public final Set<String> f74014c;

    /* JADX INFO: renamed from: e */
    private final C34806c f74015e;

    /* JADX INFO: renamed from: f */
    private volatile long f74016f;

    /* JADX INFO: renamed from: g */
    private final C34806c f74017g;

    /* JADX INFO: renamed from: a */
    public static C34841a m76410a() {
        synchronized (C34841a.class) {
            try {
                if (f74011d == null) {
                    f74011d = new C34841a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f74011d;
    }

    /* JADX INFO: renamed from: b */
    public final void m76419b() {
        String strM76231a = C34810b.m76231a();
        if (TextUtils.isEmpty(strM76231a)) {
            LiteavLog.m76087i("PlayInfoProtocolV4Storage", "clean cacheDir is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / FundingRateEntity.MILLIS_PER_HOUR;
        if (this.f74016f <= 0 || jCurrentTimeMillis - this.f74016f >= 24) {
            this.f74016f = jCurrentTimeMillis;
            C34809a.m76230a().execute(RunnableC34844d.m76423a(this, strM76231a, jCurrentTimeMillis));
        } else {
            LiteavLog.m76087i("PlayInfoProtocolV4Storage", "clean mLastCacheCleanTime: " + this.f74016f + " not more than 24h");
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m76420c() {
        String strM76227b = this.f74017g.m76227b("vld_host");
        return strM76227b == null ? "" : strM76227b;
    }

    private C34841a() {
        long jLongValue;
        C34806c c34806c = new C34806c("v4_cache");
        this.f74015e = c34806c;
        Long l11 = c34806c.f73729b.getLong("clean_time");
        if (l11 == null) {
            PersistStorage persistStorage = c34806c.f73728a;
            if (persistStorage != null) {
                l11 = persistStorage.getLong("clean_time");
                if (l11 != null) {
                    c34806c.f73729b.put("clean_time", l11.longValue());
                    c34806c.f73728a.clear("clean_time");
                    c34806c.f73729b.commit();
                    c34806c.f73728a.commit();
                }
            } else {
                l11 = null;
            }
        }
        if (l11 == null) {
            jLongValue = 0;
        } else {
            jLongValue = l11.longValue();
        }
        this.f74016f = jLongValue;
        this.f74012a = new C34806c("v4_download");
        this.f74017g = new C34806c("v4_common");
        this.f74014c = new HashSet();
    }

    /* JADX INFO: renamed from: a */
    public final void m76417a(int i11, String str, C34836c.b bVar, String str2) {
        if (!TextUtils.isEmpty(str) && bVar != null && !TextUtils.isEmpty(bVar.f73966a) && !TextUtils.isEmpty(bVar.f73967b) && !TextUtils.isEmpty(bVar.f73968c) && !TextUtils.isEmpty(bVar.f73969d) && !TextUtils.isEmpty(str2)) {
            C34809a.m76230a().execute(RunnableC34842b.m76421a(this, i11, str, str2, bVar));
            return;
        }
        LiteavLog.m76093w("PlayInfoProtocolV4Storage", "put params empty fileId: " + str + " url:" + str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m76414b(int i11, String str) {
        return i11 + "_" + str;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76412a(C34841a c34841a, int i11, String str, String str2, C34836c.b bVar) {
        String strM76414b = m76414b(i11, str);
        String strM76217d = C34804a.m76217d(str2);
        String strM76425a = TXCHLSEncoder.m76425a(i11, "default", str, 0);
        String strM76427a = TXCHLSEncoder.m76427a(strM76425a, bVar.f73966a);
        String strM76427a2 = TXCHLSEncoder.m76427a(strM76425a, bVar.f73967b);
        StringBuilder sb2 = new StringBuilder(strM76427a);
        sb2.append("_");
        sb2.append(strM76427a2);
        sb2.append("_");
        sb2.append(strM76217d);
        sb2.append("_");
        sb2.append(System.currentTimeMillis() / FundingRateEntity.MILLIS_PER_HOUR);
        sb2.append("_");
        sb2.append(bVar.f73968c);
        sb2.append("_");
        sb2.append(bVar.f73969d);
        c34841a.f74015e.m76226a(strM76414b, sb2.toString());
        c34841a.f74015e.m76224a();
        LiteavLog.m76087i("PlayInfoProtocolV4Storage", "put cache key: " + strM76414b + " value:" + sb2.toString());
    }

    /* JADX INFO: renamed from: a */
    public final void m76416a(int i11, String str, C34836c.b bVar) {
        if (!TextUtils.isEmpty(str) && bVar != null && !TextUtils.isEmpty(bVar.f73966a) && !TextUtils.isEmpty(bVar.f73967b) && !TextUtils.isEmpty(bVar.f73968c) && !TextUtils.isEmpty(bVar.f73969d)) {
            C34809a.m76230a().execute(RunnableC34843c.m76422a(this, i11, str, bVar));
        } else {
            LiteavLog.m76093w("PlayInfoProtocolV4Storage", "put params empty fileId: ".concat(String.valueOf(str)));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76411a(C34841a c34841a, int i11, String str, C34836c.b bVar) {
        String strM76414b = m76414b(i11, str);
        String strM76425a = TXCHLSEncoder.m76425a(i11, "default", str, 0);
        String strM76427a = TXCHLSEncoder.m76427a(strM76425a, bVar.f73966a);
        String strM76427a2 = TXCHLSEncoder.m76427a(strM76425a, bVar.f73967b);
        StringBuilder sb2 = new StringBuilder(strM76427a);
        sb2.append("_");
        sb2.append(strM76427a2);
        sb2.append("_");
        sb2.append(bVar.f73968c);
        sb2.append("_");
        sb2.append(bVar.f73969d);
        c34841a.f74012a.m76226a(strM76414b, sb2.toString());
        c34841a.f74012a.m76224a();
        LiteavLog.m76087i("PlayInfoProtocolV4Storage", "put download key: " + strM76414b + " value:" + sb2.toString());
    }

    /* JADX INFO: renamed from: a */
    public final C34836c.b m76415a(int i11, String str) {
        boolean z11;
        String[] strArrSplit;
        C34836c.b bVar = null;
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m76093w("PlayInfoProtocolV4Storage", "get fileId is empty");
            return null;
        }
        String strM76414b = m76414b(i11, str);
        String strM76227b = this.f74012a.m76227b(strM76414b);
        if (TextUtils.isEmpty(strM76227b)) {
            strM76227b = this.f74015e.m76227b(strM76414b);
            z11 = false;
        } else {
            z11 = true;
        }
        if (!TextUtils.isEmpty(strM76227b) && (strArrSplit = strM76227b.split("_")) != null && strArrSplit.length >= 2) {
            bVar = new C34836c.b();
            String strM76425a = TXCHLSEncoder.m76425a(i11, "default", str, 0);
            bVar.f73966a = TXCHLSEncoder.m76428b(strM76425a, strArrSplit[0]);
            bVar.f73967b = TXCHLSEncoder.m76428b(strM76425a, strArrSplit[1]);
            if (z11) {
                if (strArrSplit.length >= 4) {
                    bVar.f73968c = strArrSplit[2];
                    bVar.f73969d = strArrSplit[3];
                }
            } else if (strArrSplit.length >= 6) {
                bVar.f73968c = strArrSplit[4];
                bVar.f73969d = strArrSplit[5];
            }
            LiteavLog.m76087i("PlayInfoProtocolV4Storage", "get key: " + bVar.f73966a + " iv: " + bVar.f73967b);
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00fb, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76413a(C34841a c34841a, String str, long j11) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        String[] strArrM76228b = c34841a.f74015e.m76228b();
        if (strArrM76228b == null) {
            return;
        }
        for (String str2 : strArrM76228b) {
            String strM76227b = c34841a.f74015e.m76227b(str2);
            if (strM76227b != null) {
                String[] strArrSplit = strM76227b.split("_");
                if (strArrSplit.length >= 4) {
                    try {
                        long j12 = j11 - Long.parseLong(strArrSplit[3]);
                        if (str2.startsWith("666_")) {
                            if (j12 >= 24) {
                                if (new File(str + "tp_dp_file/" + strArrSplit[2]).exists()) {
                                    continue;
                                } else {
                                    synchronized (c34841a.f74013b) {
                                        try {
                                            if (!c34841a.f74014c.contains(strArrSplit[2])) {
                                                c34841a.f74015e.m76225a(str2);
                                                c34841a.f74015e.m76224a();
                                                LiteavLog.m76087i("PlayInfoProtocolV4Storage", "clean key: " + str2 + " value: " + strM76227b);
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (j12 >= 24) {
                            if (j12 < 72) {
                                if (!new File(str + strArrSplit[2]).exists()) {
                                    if (!new File(str + C33978va.f72339h + strArrSplit[2] + ".m3u8").exists()) {
                                        c34841a.f74015e.m76225a(str2);
                                        c34841a.f74015e.m76224a();
                                        LiteavLog.m76087i("PlayInfoProtocolV4Storage", "clean key: " + str2 + " value: " + strM76227b);
                                    }
                                }
                            } else {
                                c34841a.f74015e.m76225a(str2);
                                c34841a.f74015e.m76224a();
                                LiteavLog.m76087i("PlayInfoProtocolV4Storage", "clean key: " + str2 + " value: " + strM76227b);
                            }
                        }
                    } catch (Exception unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        C34806c c34806c = c34841a.f74015e;
        c34806c.f73729b.put("clean_time", c34841a.f74016f);
        PersistStorage persistStorage = c34806c.f73728a;
        if (persistStorage != null) {
            persistStorage.clear("clean_time");
        }
        c34841a.f74015e.m76224a();
    }

    /* JADX INFO: renamed from: a */
    public final void m76418a(String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(m76420c())) {
            return;
        }
        this.f74017g.m76226a("vld_host", str);
        this.f74017g.m76224a();
        LiteavLog.m76087i("PlayInfoProtocolV4Storage", "save host: ".concat(str));
    }
}
