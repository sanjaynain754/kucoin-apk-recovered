package com.tencent.thumbplayer.tcmedia.adapter;

import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.net.HttpHeaders;
import com.tencent.bugly.proguard.RunnableC33958ua;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.b */
/* JADX INFO: loaded from: classes62.dex */
public class C35244b {

    /* JADX INFO: renamed from: t */
    private static String f75690t = "TPPlaybackInfo";

    /* JADX INFO: renamed from: a */
    private String f75691a;

    /* JADX INFO: renamed from: b */
    private String f75692b;

    /* JADX INFO: renamed from: c */
    private int f75693c;

    /* JADX INFO: renamed from: d */
    private int f75694d;

    /* JADX INFO: renamed from: e */
    private long f75695e;

    /* JADX INFO: renamed from: f */
    private long f75696f;

    /* JADX INFO: renamed from: g */
    private long f75697g;

    /* JADX INFO: renamed from: h */
    private String f75698h;

    /* JADX INFO: renamed from: i */
    private int f75699i;

    /* JADX INFO: renamed from: j */
    private long f75700j;

    /* JADX INFO: renamed from: k */
    private int f75701k;

    /* JADX INFO: renamed from: l */
    private long f75702l;

    /* JADX INFO: renamed from: m */
    private int f75703m;

    /* JADX INFO: renamed from: n */
    private long f75704n;

    /* JADX INFO: renamed from: o */
    private long f75705o;

    /* JADX INFO: renamed from: p */
    private long f75706p;

    /* JADX INFO: renamed from: q */
    private int f75707q;

    /* JADX INFO: renamed from: r */
    private String f75708r;

    /* JADX INFO: renamed from: s */
    private long[] f75709s = {-1, -1};

    /* JADX INFO: renamed from: u */
    private int f75710u;

    /* JADX INFO: renamed from: a */
    public long m77644a() {
        return this.f75695e;
    }

    /* JADX INFO: renamed from: b */
    public long m77648b() {
        return this.f75696f;
    }

    /* JADX INFO: renamed from: c */
    public String m77652c() {
        return this.f75691a;
    }

    /* JADX INFO: renamed from: d */
    public String m77656d() {
        return this.f75708r;
    }

    /* JADX INFO: renamed from: e */
    public int m77660e() {
        return this.f75693c;
    }

    /* JADX INFO: renamed from: f */
    public long m77664f() {
        return this.f75697g;
    }

    /* JADX INFO: renamed from: g */
    public long m77667g() {
        return this.f75700j;
    }

    /* JADX INFO: renamed from: h */
    public int m77670h() {
        return this.f75703m;
    }

    /* JADX INFO: renamed from: o */
    public void m77678o() {
        this.f75691a = null;
        this.f75692b = null;
        this.f75693c = 0;
        this.f75694d = 0;
        this.f75695e = 0L;
        this.f75696f = 0L;
        this.f75697g = 0L;
        this.f75698h = null;
        this.f75699i = 0;
        this.f75700j = 0L;
        this.f75701k = 0;
        this.f75702l = 0L;
        this.f75707q = 2;
        this.f75703m = 0;
        this.f75704n = 0L;
        this.f75705o = 0L;
        this.f75706p = 0L;
        this.f75710u = 0;
        this.f75709s = new long[]{-1, -1};
    }

    /* JADX INFO: renamed from: a */
    public static C35244b m77643a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C35244b();
        }
        String[] strArrSplit = str.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            if (!strArrSplit[i11].startsWith(RunnableC33958ua.f72251f) && strArrSplit[i11].contains("=")) {
                String[] strArrSplit2 = strArrSplit[i11].split("=");
                if (strArrSplit2 == null || strArrSplit2.length < 2) {
                    String str2 = f75690t;
                    StringBuilder sb2 = new StringBuilder("parseInfo, ");
                    sb2.append((strArrSplit2 == null || strArrSplit2.length <= 0) ? "param null, " : strArrSplit2[0]);
                    sb2.append("is empty");
                    TPLogUtil.m78800i(str2, sb2.toString());
                } else {
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                }
            }
        }
        C35244b c35244b = new C35244b();
        if (map.containsKey("ContainerFormat")) {
            c35244b.m77651b((String) map.get("ContainerFormat"));
        }
        if (map.containsKey("VideoCodec")) {
            c35244b.m77659d((String) map.get("VideoCodec"));
        }
        if (map.containsKey("AudioCodec")) {
            c35244b.m77663e((String) map.get("AudioCodec"));
        }
        if (map.containsKey(HttpHeaders.WIDTH)) {
            c35244b.m77646a(Long.valueOf((String) map.get(HttpHeaders.WIDTH)).longValue());
        }
        if (map.containsKey("Height")) {
            c35244b.m77650b(Long.valueOf((String) map.get("Height")).longValue());
        }
        if (map.containsKey("VideoBitRate")) {
            c35244b.m77654c(Long.valueOf((String) map.get("VideoBitRate")).longValue());
        }
        if (map.containsKey("AudioBitRate")) {
            c35244b.m77658d(Long.valueOf((String) map.get("AudioBitRate")).longValue());
        }
        if (map.containsKey("SampleRate")) {
            c35244b.m77662e(Long.valueOf((String) map.get("SampleRate")).longValue());
        }
        if (map.containsKey("Channels")) {
            c35244b.m77657d(Integer.valueOf((String) map.get("Channels")).intValue());
        }
        if (map.containsKey("Definition")) {
            c35244b.m77655c((String) map.get("Definition"));
        }
        return c35244b;
    }

    /* JADX INFO: renamed from: b */
    public void m77649b(int i11) {
        this.f75707q = i11;
    }

    /* JADX INFO: renamed from: c */
    public void m77653c(int i11) {
        this.f75699i = i11;
    }

    /* JADX INFO: renamed from: d */
    public void m77657d(int i11) {
        this.f75701k = i11;
    }

    /* JADX INFO: renamed from: e */
    public void m77661e(int i11) {
        this.f75703m = i11;
    }

    /* JADX INFO: renamed from: f */
    public void m77665f(int i11) {
        this.f75710u = i11;
    }

    /* JADX INFO: renamed from: g */
    public void m77668g(int i11) {
        this.f75694d = i11;
    }

    /* JADX INFO: renamed from: h */
    public void m77671h(long j11) {
        this.f75706p = j11;
    }

    /* JADX INFO: renamed from: i */
    public long m77672i() {
        return this.f75704n;
    }

    /* JADX INFO: renamed from: j */
    public long[] m77673j() {
        return this.f75709s;
    }

    /* JADX INFO: renamed from: k */
    public long m77674k() {
        return this.f75705o;
    }

    /* JADX INFO: renamed from: l */
    public long m77675l() {
        return this.f75706p;
    }

    /* JADX INFO: renamed from: m */
    public int m77676m() {
        return this.f75710u;
    }

    /* JADX INFO: renamed from: n */
    public int m77677n() {
        return this.f75694d;
    }

    /* JADX INFO: renamed from: a */
    public void m77645a(int i11) {
        this.f75693c = i11;
    }

    /* JADX INFO: renamed from: b */
    public void m77650b(long j11) {
        this.f75696f = j11;
    }

    /* JADX INFO: renamed from: c */
    public void m77654c(long j11) {
        this.f75697g = j11;
    }

    /* JADX INFO: renamed from: d */
    public void m77658d(long j11) {
        this.f75700j = j11;
    }

    /* JADX INFO: renamed from: e */
    public void m77662e(long j11) {
        this.f75702l = j11;
    }

    /* JADX INFO: renamed from: f */
    public void m77666f(long j11) {
        this.f75704n = j11;
    }

    /* JADX INFO: renamed from: g */
    public void m77669g(long j11) {
        this.f75705o = j11;
    }

    /* JADX INFO: renamed from: a */
    public void m77646a(long j11) {
        this.f75695e = j11;
    }

    /* JADX INFO: renamed from: b */
    public void m77651b(String str) {
        this.f75691a = str;
    }

    /* JADX INFO: renamed from: c */
    public void m77655c(String str) {
        this.f75708r = str;
    }

    /* JADX INFO: renamed from: d */
    public void m77659d(String str) {
        this.f75692b = str;
    }

    /* JADX INFO: renamed from: e */
    public void m77663e(String str) {
        this.f75698h = str;
    }

    /* JADX INFO: renamed from: a */
    public void m77647a(long[] jArr) {
        this.f75709s = jArr;
    }
}
