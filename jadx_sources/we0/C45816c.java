package we0;

import a3d20260409.C0067d;
import android.app.Application;
import android.util.Pair;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;
import p387k.C40830e;
import p387k.C40832g;
import p579r.C43890a;

/* JADX INFO: renamed from: we0.c */
/* JADX INFO: loaded from: classes60.dex */
public class C45816c {

    /* JADX INFO: renamed from: f */
    public int f103284f;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<String, List<Integer>> f103279a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> f103280b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public final C40830e f103281c = new C40830e();

    /* JADX INFO: renamed from: d */
    public final ExecutorService f103282d = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: e */
    public final long f103283e = System.currentTimeMillis();

    /* JADX INFO: renamed from: g */
    public final StringBuilder f103285g = new StringBuilder();

    /* JADX INFO: renamed from: we0.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C45816c.this.f103280b.clear();
                Application applicationM96661b = C43890a.m96661b();
                if (applicationM96661b == null) {
                    return;
                }
                File file = new File(applicationM96661b.getFilesDir(), "rpt_file.json");
                if (file.exists()) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb2.append(line);
                                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                            } catch (Throwable th2) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                    JSONObject jSONObject = new JSONObject(sb2.toString());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (System.currentTimeMillis() - Long.parseLong(next) <= ((long) C45816c.this.f103284f) * FundingRateEntity.MILLIS_PER_HOUR) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            Iterator<String> itKeys2 = jSONObject2.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                concurrentHashMap.put(next2, Integer.valueOf(jSONObject2.getInt(next2)));
                            }
                            C45816c.this.f103280b.put(next, concurrentHashMap);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: we0.c$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            try {
                String strValueOf = String.valueOf(C45816c.this.f103283e);
                if (!C45816c.this.f103280b.containsKey(strValueOf)) {
                    C45816c.this.f103280b.put(strValueOf, C45816c.this.m101206a());
                }
                JSONObject jSONObject = new JSONObject(C45816c.this.f103280b);
                FileWriter fileWriter = new FileWriter(new File(C43890a.m96661b().getFilesDir(), "rpt_file.json"));
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.close();
                } catch (Throwable th2) {
                    try {
                        fileWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public JSONArray m101208d() {
        return m101210g(false);
    }

    /* JADX INFO: renamed from: k */
    public JSONArray m101214k() {
        return m101210g(true);
    }

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<String, Integer> m101206a() {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        for (Map.Entry<String, List<Integer>> entry : this.f103279a.entrySet()) {
            concurrentHashMap.put(entry.getKey(), Integer.valueOf(entry.getValue().size()));
        }
        return concurrentHashMap;
    }

    /* JADX INFO: renamed from: c */
    public final void m101207c() {
        if (this.f103284f <= 0) {
            return;
        }
        this.f103282d.execute(new a());
    }

    /* JADX INFO: renamed from: g */
    public final JSONArray m101210g(boolean z11) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (List<Integer> list : this.f103279a.values()) {
                if (list.size() > 1) {
                    ArrayList arrayList = new ArrayList();
                    int i11 = -2;
                    for (Integer num : list) {
                        int iIntValue = num.intValue();
                        if (z11) {
                            arrayList.add(num);
                        } else if (iIntValue > i11 + 1) {
                            arrayList.add(num);
                            i11 = iIntValue;
                        }
                    }
                    if (arrayList.size() > 1) {
                        jSONArray.put(new JSONArray((Collection) arrayList));
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused) {
            return new JSONArray();
        }
    }

    /* JADX INFO: renamed from: h */
    public JSONObject m101211h() {
        JSONObject jSONObject = new JSONObject();
        try {
            Pair<Integer, Integer> pairM101216o = m101216o();
            C40832g.m89354i(jSONObject, "rpt_total_count", pairM101216o.first);
            C40832g.m89354i(jSONObject, "rpt_duplicate_count", pairM101216o.second);
            Pair<Integer, Integer> pairM101215l = m101215l();
            C40832g.m89354i(jSONObject, "rpt_total_count_app", pairM101215l.first);
            C40832g.m89354i(jSONObject, "rpt_duplicate_count_app", pairM101215l.second);
            C40832g.m89354i(jSONObject, "rpt_array", m101214k());
            C40832g.m89354i(jSONObject, "rpt_loop_array", m101208d());
            C40832g.m89354i(jSONObject, "rpt_sha256_avg_cost", Float.valueOf(m101217p()));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    public void m101212i(int i11) {
        this.f103284f = i11;
        m101207c();
    }

    /* JADX INFO: renamed from: l */
    public Pair<Integer, Integer> m101215l() {
        int iIntValue = 0;
        if (this.f103284f <= 0) {
            return Pair.create(0, 0);
        }
        try {
            this.f103280b.put(String.valueOf(this.f103283e), m101206a());
            Iterator<Map.Entry<String, ConcurrentHashMap<String, Integer>>> it = this.f103280b.entrySet().iterator();
            int iIntValue2 = 0;
            while (it.hasNext()) {
                Pair<Integer, Integer> pairM101209f = m101209f(it.next().getValue());
                iIntValue += ((Integer) pairM101209f.first).intValue();
                iIntValue2 += ((Integer) pairM101209f.second).intValue();
            }
            return Pair.create(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        } catch (Throwable unused) {
            return Pair.create(-1, -1);
        }
    }

    /* JADX INFO: renamed from: o */
    public Pair<Integer, Integer> m101216o() {
        try {
            int size = 0;
            int size2 = 0;
            for (List<Integer> list : this.f103279a.values()) {
                size += list.size();
                if (list.size() > 1) {
                    size2 += list.size();
                }
            }
            return Pair.create(Integer.valueOf(size), Integer.valueOf(size2));
        } catch (Throwable unused) {
            return Pair.create(-1, -1);
        }
    }

    /* JADX INFO: renamed from: p */
    public float m101217p() {
        return this.f103281c.m89340b();
    }

    /* JADX INFO: renamed from: q */
    public void m101218q() {
        if (this.f103284f <= 0) {
            return;
        }
        this.f103282d.execute(new c());
    }

    /* JADX INFO: renamed from: f */
    public final Pair<Integer, Integer> m101209f(ConcurrentHashMap<String, Integer> concurrentHashMap) {
        Iterator<Map.Entry<String, Integer>> it = concurrentHashMap.entrySet().iterator();
        int iIntValue = 0;
        int iIntValue2 = 0;
        while (it.hasNext()) {
            Integer value = it.next().getValue();
            if (value != null) {
                iIntValue += value.intValue();
                if (value.intValue() > 1) {
                    iIntValue2 += value.intValue();
                }
            }
        }
        return Pair.create(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }

    /* JADX INFO: renamed from: j */
    public void m101213j(C0067d c0067d) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(c0067d.getYuvData());
            this.f103285g.setLength(0);
            for (byte b11 : bArrDigest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    this.f103285g.append('0');
                }
                this.f103285g.append(hexString);
            }
            String string = this.f103285g.toString();
            if (!this.f103279a.containsKey(string)) {
                this.f103279a.put(string, Collections.synchronizedList(new ArrayList()));
            }
            this.f103279a.get(string).add(Integer.valueOf(c0067d.m116a()));
            this.f103281c.m89343e((int) (System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable unused) {
        }
    }
}
