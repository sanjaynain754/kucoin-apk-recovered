package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33571bi;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class UserInfoBean implements Parcelable {

    /* JADX INFO: renamed from: A */
    public static final int f68528A = 9;

    /* JADX INFO: renamed from: B */
    public static final int f68529B = 10;

    /* JADX INFO: renamed from: C */
    public static final int f68530C = 11;
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new C33517a();

    /* JADX INFO: renamed from: D */
    public static final int f68531D = 12;

    /* JADX INFO: renamed from: E */
    public static final int f68532E = 13;

    /* JADX INFO: renamed from: F */
    public static final int f68533F = 14;

    /* JADX INFO: renamed from: v */
    public static final int f68534v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f68535w = 2;

    /* JADX INFO: renamed from: x */
    public static final int f68536x = 3;

    /* JADX INFO: renamed from: y */
    public static final int f68537y = 4;

    /* JADX INFO: renamed from: z */
    public static final int f68538z = 8;

    /* JADX INFO: renamed from: b */
    public long f68539b;

    /* JADX INFO: renamed from: c */
    public int f68540c;

    /* JADX INFO: renamed from: d */
    public String f68541d;

    /* JADX INFO: renamed from: e */
    public String f68542e;

    /* JADX INFO: renamed from: f */
    public long f68543f;

    /* JADX INFO: renamed from: g */
    public long f68544g;

    /* JADX INFO: renamed from: h */
    public long f68545h;

    /* JADX INFO: renamed from: i */
    public long f68546i;

    /* JADX INFO: renamed from: j */
    public long f68547j;

    /* JADX INFO: renamed from: k */
    public String f68548k;

    /* JADX INFO: renamed from: l */
    public long f68549l;

    /* JADX INFO: renamed from: m */
    public boolean f68550m;

    /* JADX INFO: renamed from: n */
    public String f68551n;

    /* JADX INFO: renamed from: o */
    public String f68552o;

    /* JADX INFO: renamed from: p */
    public int f68553p;

    /* JADX INFO: renamed from: q */
    public int f68554q;

    /* JADX INFO: renamed from: r */
    public int f68555r;

    /* JADX INFO: renamed from: s */
    public Map<String, String> f68556s;

    /* JADX INFO: renamed from: t */
    public Map<String, String> f68557t;

    /* JADX INFO: renamed from: u */
    public Map<String, String> f68558u;

    /* JADX INFO: renamed from: com.tencent.bugly.crashreport.biz.UserInfoBean$a */
    /* JADX INFO: compiled from: BUGLY */
    public class C33517a implements Parcelable.Creator<UserInfoBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfoBean createFromParcel(Parcel parcel) {
            return new UserInfoBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfoBean[] newArray(int i11) {
            return new UserInfoBean[i11];
        }
    }

    public UserInfoBean() {
        this.f68549l = 0L;
        this.f68550m = false;
        this.f68551n = "unknown";
        this.f68554q = -1;
        this.f68555r = -1;
        this.f68556s = null;
        this.f68557t = null;
        this.f68558u = null;
    }

    /* JADX INFO: renamed from: a */
    public void m72175a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f68558u == null) {
            this.f68558u = new ConcurrentHashMap();
        }
        this.f68558u.put(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f68540c);
        parcel.writeString(this.f68541d);
        parcel.writeString(this.f68542e);
        parcel.writeLong(this.f68543f);
        parcel.writeLong(this.f68544g);
        parcel.writeLong(this.f68545h);
        parcel.writeLong(this.f68546i);
        parcel.writeLong(this.f68547j);
        parcel.writeString(this.f68548k);
        parcel.writeLong(this.f68549l);
        parcel.writeByte(this.f68550m ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68551n);
        parcel.writeInt(this.f68554q);
        parcel.writeInt(this.f68555r);
        C33571bi.m72608b(parcel, this.f68556s);
        C33571bi.m72608b(parcel, this.f68557t);
        parcel.writeString(this.f68552o);
        parcel.writeInt(this.f68553p);
        C33571bi.m72608b(parcel, this.f68558u);
    }

    /* JADX INFO: renamed from: a */
    public String m72174a(String str) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.f68558u) == null) {
            return null;
        }
        return map.get(str);
    }

    public UserInfoBean(Parcel parcel) {
        this.f68549l = 0L;
        this.f68550m = false;
        this.f68551n = "unknown";
        this.f68554q = -1;
        this.f68555r = -1;
        this.f68556s = null;
        this.f68557t = null;
        this.f68558u = null;
        this.f68540c = parcel.readInt();
        this.f68541d = parcel.readString();
        this.f68542e = parcel.readString();
        this.f68543f = parcel.readLong();
        this.f68544g = parcel.readLong();
        this.f68545h = parcel.readLong();
        this.f68546i = parcel.readLong();
        this.f68547j = parcel.readLong();
        this.f68548k = parcel.readString();
        this.f68549l = parcel.readLong();
        this.f68550m = parcel.readByte() == 1;
        this.f68551n = parcel.readString();
        this.f68554q = parcel.readInt();
        this.f68555r = parcel.readInt();
        this.f68556s = C33571bi.m72607b(parcel);
        this.f68557t = C33571bi.m72607b(parcel);
        this.f68552o = parcel.readString();
        this.f68553p = parcel.readInt();
        this.f68558u = C33571bi.m72607b(parcel);
    }
}
