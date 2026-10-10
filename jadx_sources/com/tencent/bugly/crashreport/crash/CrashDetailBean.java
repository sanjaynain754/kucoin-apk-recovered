package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.C33571bi;
import com.tencent.bugly.proguard.C33765l2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {

    /* JADX INFO: renamed from: A0 */
    public static final String f68586A0 = "user_custom";

    /* JADX INFO: renamed from: B0 */
    public static final String f68587B0 = "stage";

    /* JADX INFO: renamed from: C0 */
    public static final String f68588C0 = "RDelivery";
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = new C33520a();

    /* JADX INFO: renamed from: D0 */
    public static final String f68589D0 = "caseLabel";

    /* JADX INFO: renamed from: E0 */
    public static final String f68590E0 = "testLabel";

    /* JADX INFO: renamed from: F0 */
    public static final String f68591F0 = "extend_info";

    /* JADX INFO: renamed from: G0 */
    public static final String f68592G0 = "BUGLY_CR_01";

    /* JADX INFO: renamed from: r0 */
    public static final int f68593r0 = 0;

    /* JADX INFO: renamed from: s0 */
    public static final int f68594s0 = 1;

    /* JADX INFO: renamed from: t0 */
    public static final int f68595t0 = 2;

    /* JADX INFO: renamed from: u0 */
    public static final int f68596u0 = 3;

    /* JADX INFO: renamed from: v0 */
    public static final int f68597v0 = 4;

    /* JADX INFO: renamed from: w0 */
    public static final int f68598w0 = 5;

    /* JADX INFO: renamed from: x0 */
    public static final int f68599x0 = 6;

    /* JADX INFO: renamed from: y0 */
    public static final int f68600y0 = 7;

    /* JADX INFO: renamed from: z0 */
    public static final int f68601z0 = 8;

    /* JADX INFO: renamed from: A */
    public long f68602A;

    /* JADX INFO: renamed from: B */
    public String f68603B;

    /* JADX INFO: renamed from: C */
    public int f68604C;

    /* JADX INFO: renamed from: D */
    public String f68605D;

    /* JADX INFO: renamed from: E */
    public String f68606E;

    /* JADX INFO: renamed from: F */
    public String f68607F;

    /* JADX INFO: renamed from: G */
    public String f68608G;

    /* JADX INFO: renamed from: H */
    public byte[] f68609H;

    /* JADX INFO: renamed from: I */
    public Map<String, String> f68610I;

    /* JADX INFO: renamed from: J */
    public String f68611J;

    /* JADX INFO: renamed from: K */
    public String f68612K;

    /* JADX INFO: renamed from: L */
    public long f68613L;

    /* JADX INFO: renamed from: M */
    public long f68614M;

    /* JADX INFO: renamed from: N */
    public long f68615N;

    /* JADX INFO: renamed from: O */
    public long f68616O;

    /* JADX INFO: renamed from: P */
    public long f68617P;

    /* JADX INFO: renamed from: Q */
    public long f68618Q;

    /* JADX INFO: renamed from: R */
    public long f68619R;

    /* JADX INFO: renamed from: S */
    public long f68620S;

    /* JADX INFO: renamed from: T */
    public long f68621T;

    /* JADX INFO: renamed from: U */
    public long f68622U;

    /* JADX INFO: renamed from: V */
    public long f68623V;

    /* JADX INFO: renamed from: W */
    public String f68624W;

    /* JADX INFO: renamed from: X */
    public String f68625X;

    /* JADX INFO: renamed from: Y */
    public String f68626Y;

    /* JADX INFO: renamed from: Z */
    public String f68627Z;

    /* JADX INFO: renamed from: a0 */
    public String f68628a0;

    /* JADX INFO: renamed from: b */
    public long f68629b;

    /* JADX INFO: renamed from: b0 */
    public long f68630b0;

    /* JADX INFO: renamed from: c */
    public int f68631c;

    /* JADX INFO: renamed from: c0 */
    public boolean f68632c0;

    /* JADX INFO: renamed from: d */
    public String f68633d;

    /* JADX INFO: renamed from: d0 */
    public Map<String, String> f68634d0;

    /* JADX INFO: renamed from: e */
    public String f68635e;

    /* JADX INFO: renamed from: e0 */
    public Map<String, String> f68636e0;

    /* JADX INFO: renamed from: f */
    public Boolean f68637f;

    /* JADX INFO: renamed from: f0 */
    public int f68638f0;

    /* JADX INFO: renamed from: g */
    public boolean f68639g;

    /* JADX INFO: renamed from: g0 */
    public int f68640g0;

    /* JADX INFO: renamed from: h */
    public boolean f68641h;

    /* JADX INFO: renamed from: h0 */
    public Map<String, String> f68642h0;

    /* JADX INFO: renamed from: i */
    public String f68643i;

    /* JADX INFO: renamed from: i0 */
    public Map<String, String> f68644i0;

    /* JADX INFO: renamed from: j */
    public String f68645j;

    /* JADX INFO: renamed from: j0 */
    public byte[] f68646j0;

    /* JADX INFO: renamed from: k */
    public String f68647k;

    /* JADX INFO: renamed from: k0 */
    public String f68648k0;

    /* JADX INFO: renamed from: l */
    public String f68649l;

    /* JADX INFO: renamed from: l0 */
    @Deprecated
    public String f68650l0;

    /* JADX INFO: renamed from: m */
    public String f68651m;

    /* JADX INFO: renamed from: m0 */
    public String f68652m0;

    /* JADX INFO: renamed from: n */
    public String f68653n;

    /* JADX INFO: renamed from: n0 */
    public String f68654n0;

    /* JADX INFO: renamed from: o */
    public String f68655o;

    /* JADX INFO: renamed from: o0 */
    public boolean f68656o0;

    /* JADX INFO: renamed from: p */
    public List<String> f68657p;

    /* JADX INFO: renamed from: p0 */
    public Map<String, String> f68658p0;

    /* JADX INFO: renamed from: q */
    public Map<String, PlugInBean> f68659q;

    /* JADX INFO: renamed from: q0 */
    public String f68660q0;

    /* JADX INFO: renamed from: r */
    public Map<String, PlugInBean> f68661r;

    /* JADX INFO: renamed from: s */
    public boolean f68662s;

    /* JADX INFO: renamed from: t */
    public boolean f68663t;

    /* JADX INFO: renamed from: u */
    public int f68664u;

    /* JADX INFO: renamed from: v */
    public String f68665v;

    /* JADX INFO: renamed from: w */
    public String f68666w;

    /* JADX INFO: renamed from: x */
    public String f68667x;

    /* JADX INFO: renamed from: y */
    public String f68668y;

    /* JADX INFO: renamed from: z */
    public String f68669z;

    /* JADX INFO: renamed from: com.tencent.bugly.crashreport.crash.CrashDetailBean$a */
    /* JADX INFO: compiled from: BUGLY */
    public class C33520a implements Parcelable.Creator<CrashDetailBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CrashDetailBean createFromParcel(Parcel parcel) {
            return new CrashDetailBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CrashDetailBean[] newArray(int i11) {
            return new CrashDetailBean[i11];
        }
    }

    public CrashDetailBean() {
        this.f68629b = -1L;
        this.f68631c = 0;
        this.f68633d = UUID.randomUUID().toString();
        this.f68635e = C33765l2.f70706I0;
        this.f68637f = Boolean.FALSE;
        this.f68639g = false;
        this.f68641h = false;
        this.f68643i = "";
        this.f68645j = "";
        this.f68647k = "";
        this.f68649l = "";
        this.f68651m = "";
        this.f68653n = "";
        this.f68655o = "";
        this.f68657p = null;
        this.f68659q = null;
        this.f68661r = null;
        this.f68662s = false;
        this.f68663t = false;
        this.f68664u = 0;
        this.f68665v = "";
        this.f68666w = "";
        this.f68667x = "";
        this.f68668y = "";
        this.f68669z = "";
        this.f68602A = -1L;
        this.f68603B = null;
        this.f68604C = 0;
        this.f68605D = "";
        this.f68606E = "";
        this.f68607F = null;
        this.f68608G = null;
        this.f68609H = null;
        this.f68610I = null;
        this.f68611J = "";
        this.f68612K = "";
        this.f68613L = -1L;
        this.f68614M = -1L;
        this.f68615N = -1L;
        this.f68616O = -1L;
        this.f68617P = -1L;
        this.f68618Q = -1L;
        this.f68619R = -1L;
        this.f68620S = -1L;
        this.f68621T = -1L;
        this.f68622U = -1L;
        this.f68623V = -1L;
        this.f68624W = "";
        this.f68625X = "";
        this.f68626Y = "";
        this.f68627Z = "";
        this.f68628a0 = "";
        this.f68630b0 = -1L;
        this.f68632c0 = false;
        this.f68634d0 = null;
        this.f68636e0 = null;
        this.f68638f0 = -1;
        this.f68640g0 = -1;
        this.f68642h0 = null;
        this.f68644i0 = null;
        this.f68646j0 = null;
        this.f68648k0 = null;
        this.f68650l0 = null;
        this.f68652m0 = null;
        this.f68654n0 = null;
        this.f68656o0 = false;
        this.f68658p0 = null;
        this.f68660q0 = "";
    }

    /* JADX INFO: renamed from: a */
    public void m72184a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (this.f68658p0 == null) {
            this.f68658p0 = new HashMap();
        }
        this.f68658p0.put(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f68631c);
        parcel.writeString(this.f68633d);
        parcel.writeString(this.f68635e);
        parcel.writeByte(this.f68637f.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68639g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68641h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68643i);
        parcel.writeString(this.f68645j);
        parcel.writeString(this.f68647k);
        parcel.writeString(this.f68649l);
        parcel.writeString(this.f68651m);
        parcel.writeString(this.f68653n);
        parcel.writeString(this.f68655o);
        parcel.writeStringList(this.f68657p);
        parcel.writeByte(this.f68662s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68663t ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f68664u);
        parcel.writeString(this.f68665v);
        parcel.writeString(this.f68666w);
        parcel.writeString(this.f68667x);
        parcel.writeString(this.f68668y);
        parcel.writeString(this.f68669z);
        parcel.writeLong(this.f68602A);
        parcel.writeString(this.f68603B);
        parcel.writeInt(this.f68604C);
        parcel.writeString(this.f68605D);
        parcel.writeString(this.f68606E);
        parcel.writeString(this.f68607F);
        C33571bi.m72608b(parcel, this.f68610I);
        parcel.writeString(this.f68611J);
        parcel.writeString(this.f68612K);
        parcel.writeLong(this.f68613L);
        parcel.writeLong(this.f68614M);
        parcel.writeLong(this.f68615N);
        parcel.writeLong(this.f68616O);
        parcel.writeLong(this.f68617P);
        parcel.writeLong(this.f68618Q);
        parcel.writeString(this.f68624W);
        parcel.writeString(this.f68625X);
        parcel.writeString(this.f68626Y);
        parcel.writeString(this.f68627Z);
        parcel.writeString(this.f68628a0);
        parcel.writeLong(this.f68630b0);
        parcel.writeByte(this.f68632c0 ? (byte) 1 : (byte) 0);
        C33571bi.m72608b(parcel, this.f68634d0);
        C33571bi.m72589a(parcel, this.f68659q);
        C33571bi.m72589a(parcel, this.f68661r);
        parcel.writeInt(this.f68638f0);
        parcel.writeInt(this.f68640g0);
        C33571bi.m72608b(parcel, this.f68642h0);
        C33571bi.m72608b(parcel, this.f68644i0);
        parcel.writeByteArray(this.f68646j0);
        parcel.writeByteArray(this.f68609H);
        parcel.writeString(this.f68648k0);
        parcel.writeString(this.f68650l0);
        parcel.writeString(this.f68608G);
        parcel.writeLong(this.f68619R);
        parcel.writeLong(this.f68620S);
        parcel.writeLong(this.f68621T);
        parcel.writeLong(this.f68622U);
        parcel.writeLong(this.f68623V);
        parcel.writeString(this.f68652m0);
        parcel.writeString(this.f68654n0);
        parcel.writeByte(this.f68656o0 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68660q0);
        C33571bi.m72608b(parcel, this.f68658p0);
    }

    /* JADX INFO: renamed from: a */
    public String m72183a(String str) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.f68658p0) == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return 1;
        }
        long j11 = this.f68602A - crashDetailBean.f68602A;
        if (j11 > 0) {
            return 1;
        }
        return j11 < 0 ? -1 : 0;
    }

    public CrashDetailBean(Parcel parcel) {
        this.f68629b = -1L;
        this.f68631c = 0;
        this.f68633d = UUID.randomUUID().toString();
        this.f68635e = C33765l2.f70706I0;
        this.f68637f = Boolean.FALSE;
        this.f68639g = false;
        this.f68641h = false;
        this.f68643i = "";
        this.f68645j = "";
        this.f68647k = "";
        this.f68649l = "";
        this.f68651m = "";
        this.f68653n = "";
        this.f68655o = "";
        this.f68657p = null;
        this.f68659q = null;
        this.f68661r = null;
        this.f68662s = false;
        this.f68663t = false;
        this.f68664u = 0;
        this.f68665v = "";
        this.f68666w = "";
        this.f68667x = "";
        this.f68668y = "";
        this.f68669z = "";
        this.f68602A = -1L;
        this.f68603B = null;
        this.f68604C = 0;
        this.f68605D = "";
        this.f68606E = "";
        this.f68607F = null;
        this.f68608G = null;
        this.f68609H = null;
        this.f68610I = null;
        this.f68611J = "";
        this.f68612K = "";
        this.f68613L = -1L;
        this.f68614M = -1L;
        this.f68615N = -1L;
        this.f68616O = -1L;
        this.f68617P = -1L;
        this.f68618Q = -1L;
        this.f68619R = -1L;
        this.f68620S = -1L;
        this.f68621T = -1L;
        this.f68622U = -1L;
        this.f68623V = -1L;
        this.f68624W = "";
        this.f68625X = "";
        this.f68626Y = "";
        this.f68627Z = "";
        this.f68628a0 = "";
        this.f68630b0 = -1L;
        this.f68632c0 = false;
        this.f68634d0 = null;
        this.f68636e0 = null;
        this.f68638f0 = -1;
        this.f68640g0 = -1;
        this.f68642h0 = null;
        this.f68644i0 = null;
        this.f68646j0 = null;
        this.f68648k0 = null;
        this.f68650l0 = null;
        this.f68652m0 = null;
        this.f68654n0 = null;
        this.f68656o0 = false;
        this.f68658p0 = null;
        this.f68660q0 = "";
        this.f68631c = parcel.readInt();
        this.f68633d = parcel.readString();
        this.f68635e = parcel.readString();
        this.f68637f = Boolean.valueOf(parcel.readByte() == 1);
        this.f68639g = parcel.readByte() == 1;
        this.f68641h = parcel.readByte() == 1;
        this.f68643i = parcel.readString();
        this.f68645j = parcel.readString();
        this.f68647k = parcel.readString();
        this.f68649l = parcel.readString();
        this.f68651m = parcel.readString();
        this.f68653n = parcel.readString();
        this.f68655o = parcel.readString();
        this.f68657p = parcel.createStringArrayList();
        this.f68662s = parcel.readByte() == 1;
        this.f68663t = parcel.readByte() == 1;
        this.f68664u = parcel.readInt();
        this.f68665v = parcel.readString();
        this.f68666w = parcel.readString();
        this.f68667x = parcel.readString();
        this.f68668y = parcel.readString();
        this.f68669z = parcel.readString();
        this.f68602A = parcel.readLong();
        this.f68603B = parcel.readString();
        this.f68604C = parcel.readInt();
        this.f68605D = parcel.readString();
        this.f68606E = parcel.readString();
        this.f68607F = parcel.readString();
        this.f68610I = C33571bi.m72607b(parcel);
        this.f68611J = parcel.readString();
        this.f68612K = parcel.readString();
        this.f68613L = parcel.readLong();
        this.f68614M = parcel.readLong();
        this.f68615N = parcel.readLong();
        this.f68616O = parcel.readLong();
        this.f68617P = parcel.readLong();
        this.f68618Q = parcel.readLong();
        this.f68624W = parcel.readString();
        this.f68625X = parcel.readString();
        this.f68626Y = parcel.readString();
        this.f68627Z = parcel.readString();
        this.f68628a0 = parcel.readString();
        this.f68630b0 = parcel.readLong();
        this.f68632c0 = parcel.readByte() == 1;
        this.f68634d0 = C33571bi.m72607b(parcel);
        this.f68659q = C33571bi.m72587a(parcel);
        this.f68661r = C33571bi.m72587a(parcel);
        this.f68638f0 = parcel.readInt();
        this.f68640g0 = parcel.readInt();
        this.f68642h0 = C33571bi.m72607b(parcel);
        this.f68644i0 = C33571bi.m72607b(parcel);
        this.f68646j0 = parcel.createByteArray();
        this.f68609H = parcel.createByteArray();
        this.f68648k0 = parcel.readString();
        this.f68650l0 = parcel.readString();
        this.f68608G = parcel.readString();
        this.f68619R = parcel.readLong();
        this.f68620S = parcel.readLong();
        this.f68621T = parcel.readLong();
        this.f68622U = parcel.readLong();
        this.f68623V = parcel.readLong();
        this.f68652m0 = parcel.readString();
        this.f68654n0 = parcel.readString();
        this.f68656o0 = parcel.readByte() == 1;
        this.f68660q0 = parcel.readString();
        this.f68658p0 = C33571bi.m72607b(parcel);
    }
}
