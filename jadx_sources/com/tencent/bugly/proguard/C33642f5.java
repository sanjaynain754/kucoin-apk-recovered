package com.tencent.bugly.proguard;

import com.jumio.commons.log.LogUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.f5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33642f5 {

    /* JADX INFO: renamed from: a */
    public final String f69842a;

    /* JADX INFO: renamed from: b */
    public final String f69843b;

    /* JADX INFO: renamed from: c */
    public final String f69844c;

    /* JADX INFO: renamed from: d */
    public final String f69845d;

    /* JADX INFO: renamed from: e */
    public final int f69846e;

    /* JADX INFO: renamed from: f */
    public final int f69847f;

    /* JADX INFO: renamed from: g */
    public final int f69848g;

    /* JADX INFO: renamed from: h */
    public final int f69849h;

    /* JADX INFO: renamed from: i */
    public final int f69850i;

    /* JADX INFO: renamed from: j */
    public final long f69851j;

    /* JADX INFO: renamed from: k */
    public String f69852k;

    /* JADX INFO: renamed from: l */
    public final long f69853l;

    /* JADX INFO: renamed from: a */
    public final boolean m72999a(C33642f5 c33642f5) {
        return this.f69846e == c33642f5.f69846e && this.f69847f == c33642f5.f69847f && this.f69848g == c33642f5.f69848g && this.f69849h == c33642f5.f69849h && this.f69850i == c33642f5.f69850i && C33839od.m74441a(this.f69842a, c33642f5.f69842a) && C33839od.m74441a(this.f69844c, c33642f5.f69844c) && C33839od.m74441a(this.f69852k, c33642f5.f69852k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m72999a((C33642f5) obj);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f69842a, this.f69844c, Integer.valueOf(this.f69846e), Integer.valueOf(this.f69847f), Integer.valueOf(this.f69848g), Integer.valueOf(this.f69849h), Integer.valueOf(this.f69850i), this.f69852k});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(this.f69853l);
        sb2.append(",");
        sb2.append(this.f69842a);
        sb2.append(",");
        sb2.append(this.f69848g);
        sb2.append(",");
        sb2.append(this.f69849h);
        sb2.append(",");
        sb2.append(this.f69846e);
        sb2.append(",");
        sb2.append(this.f69847f);
        sb2.append(",");
        sb2.append(this.f69844c);
        sb2.append(",");
        sb2.append(this.f69843b);
        sb2.append(",");
        sb2.append(this.f69845d);
        sb2.append(",");
        sb2.append(this.f69850i);
        sb2.append(",");
        sb2.append(this.f69851j);
        sb2.append(",");
        sb2.append(this.f69852k);
        sb2.append(LogUtils.NEW_LINE);
        return String.format("ExceedBitmapInfo{%s}", sb2);
    }

    public C33642f5(String str, String str2, String str3, String str4, int i11, int i12, int i13, int i14, int i15, long j11, String str5, long j12) {
        this.f69842a = str;
        this.f69843b = str2;
        this.f69845d = str3;
        this.f69844c = str4;
        this.f69846e = i11;
        this.f69847f = i12;
        this.f69848g = i13;
        this.f69849h = i14;
        this.f69850i = i15;
        this.f69851j = j11;
        this.f69852k = str5;
        this.f69853l = j12;
    }
}
