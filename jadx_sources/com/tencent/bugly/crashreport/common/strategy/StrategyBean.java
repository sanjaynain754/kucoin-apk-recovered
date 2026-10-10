package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.C33571bi;
import java.util.Map;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new C33519a();

    /* JADX INFO: renamed from: v */
    public static final String f68562v = "https://android.bugly.qq.com/rqd/async";

    /* JADX INFO: renamed from: w */
    public static String f68563w = "https://android.bugly.qq.com/rqd/async";

    /* JADX INFO: renamed from: x */
    public static String f68564x = "https://android.bugly.qq.com/rqd/async";

    /* JADX INFO: renamed from: y */
    public static String f68565y;

    /* JADX INFO: renamed from: b */
    public long f68566b;

    /* JADX INFO: renamed from: c */
    public long f68567c;

    /* JADX INFO: renamed from: d */
    public boolean f68568d;

    /* JADX INFO: renamed from: e */
    public boolean f68569e;

    /* JADX INFO: renamed from: f */
    public boolean f68570f;

    /* JADX INFO: renamed from: g */
    public boolean f68571g;

    /* JADX INFO: renamed from: h */
    public boolean f68572h;

    /* JADX INFO: renamed from: i */
    public boolean f68573i;

    /* JADX INFO: renamed from: j */
    public boolean f68574j;

    /* JADX INFO: renamed from: k */
    public boolean f68575k;

    /* JADX INFO: renamed from: l */
    public boolean f68576l;

    /* JADX INFO: renamed from: m */
    public long f68577m;

    /* JADX INFO: renamed from: n */
    public long f68578n;

    /* JADX INFO: renamed from: o */
    public String f68579o;

    /* JADX INFO: renamed from: p */
    public String f68580p;

    /* JADX INFO: renamed from: q */
    public String f68581q;

    /* JADX INFO: renamed from: r */
    public Map<String, String> f68582r;

    /* JADX INFO: renamed from: s */
    public int f68583s;

    /* JADX INFO: renamed from: t */
    public long f68584t;

    /* JADX INFO: renamed from: u */
    public long f68585u;

    /* JADX INFO: renamed from: com.tencent.bugly.crashreport.common.strategy.StrategyBean$a */
    /* JADX INFO: compiled from: BUGLY */
    public class C33519a implements Parcelable.Creator<StrategyBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StrategyBean createFromParcel(Parcel parcel) {
            return new StrategyBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StrategyBean[] newArray(int i11) {
            return new StrategyBean[i11];
        }
    }

    public StrategyBean() {
        this.f68566b = -1L;
        this.f68567c = -1L;
        this.f68568d = true;
        this.f68569e = true;
        this.f68570f = true;
        this.f68571g = true;
        this.f68572h = false;
        this.f68573i = true;
        this.f68574j = true;
        this.f68575k = true;
        this.f68576l = true;
        this.f68578n = 30000L;
        this.f68579o = f68563w;
        this.f68580p = f68564x;
        this.f68583s = 10;
        this.f68584t = 300000L;
        this.f68585u = -1L;
        this.f68567c = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S(@L@L@)");
        f68565y = sb2.toString();
        sb2.setLength(0);
        sb2.append("*^");
        sb2.append("@K#K");
        sb2.append("@!");
        this.f68581q = sb2.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f68567c);
        parcel.writeByte(this.f68568d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68569e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68570f ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68579o);
        parcel.writeString(this.f68580p);
        parcel.writeString(this.f68581q);
        C33571bi.m72608b(parcel, this.f68582r);
        parcel.writeByte(this.f68571g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68572h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68575k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68576l ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f68578n);
        parcel.writeByte(this.f68573i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68574j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f68577m);
        parcel.writeInt(this.f68583s);
        parcel.writeLong(this.f68584t);
        parcel.writeLong(this.f68585u);
    }

    public StrategyBean(Parcel parcel) {
        this.f68566b = -1L;
        this.f68567c = -1L;
        boolean z11 = true;
        this.f68568d = true;
        this.f68569e = true;
        this.f68570f = true;
        this.f68571g = true;
        this.f68572h = false;
        this.f68573i = true;
        this.f68574j = true;
        this.f68575k = true;
        this.f68576l = true;
        this.f68578n = 30000L;
        this.f68579o = f68563w;
        this.f68580p = f68564x;
        this.f68583s = 10;
        this.f68584t = 300000L;
        this.f68585u = -1L;
        try {
            f68565y = "S(@L@L@)";
            this.f68567c = parcel.readLong();
            this.f68568d = parcel.readByte() == 1;
            this.f68569e = parcel.readByte() == 1;
            this.f68570f = parcel.readByte() == 1;
            this.f68579o = parcel.readString();
            this.f68580p = parcel.readString();
            this.f68581q = parcel.readString();
            this.f68582r = C33571bi.m72607b(parcel);
            this.f68571g = parcel.readByte() == 1;
            this.f68572h = parcel.readByte() == 1;
            this.f68575k = parcel.readByte() == 1;
            this.f68576l = parcel.readByte() == 1;
            this.f68578n = parcel.readLong();
            this.f68573i = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z11 = false;
            }
            this.f68574j = z11;
            this.f68577m = parcel.readLong();
            this.f68583s = parcel.readInt();
            this.f68584t = parcel.readLong();
            this.f68585u = parcel.readLong();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
