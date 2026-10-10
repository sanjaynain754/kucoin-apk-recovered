package jc0;

import android.content.Context;
import com.tencent.bugly.proguard.JceStruct;
import com.tencentcloudapi.cls.android.producer.common.Constants;
import oc0.C43014a;
import oc0.C43017d;

/* JADX INFO: renamed from: jc0.b */
/* JADX INFO: compiled from: AsyncProducerConfig.java */
/* JADX INFO: loaded from: classes2.dex */
public class C40384b {

    /* JADX INFO: renamed from: a */
    public String f89677a;

    /* JADX INFO: renamed from: b */
    public String f89678b;

    /* JADX INFO: renamed from: c */
    public String f89679c;

    /* JADX INFO: renamed from: d */
    public String f89680d;

    /* JADX INFO: renamed from: e */
    public String f89681e;

    /* JADX INFO: renamed from: f */
    public String f89682f;

    /* JADX INFO: renamed from: g */
    public String f89683g;

    /* JADX INFO: renamed from: h */
    public final Context f89684h;

    /* JADX INFO: renamed from: i */
    public int f89685i = JceStruct.f68783p;

    /* JADX INFO: renamed from: j */
    public long f89686j = 60000;

    /* JADX INFO: renamed from: k */
    public int f89687k = Constants.f77445c;

    /* JADX INFO: renamed from: l */
    public int f89688l = 524288;

    /* JADX INFO: renamed from: m */
    public int f89689m = 4096;

    /* JADX INFO: renamed from: n */
    public int f89690n = 2000;

    /* JADX INFO: renamed from: o */
    public int f89691o = 10;

    /* JADX INFO: renamed from: p */
    public int f89692p = 11;

    /* JADX INFO: renamed from: q */
    public long f89693q = 100;

    /* JADX INFO: renamed from: r */
    public long f89694r = 50000;

    /* JADX INFO: renamed from: a */
    public long m88983a() {
        return this.f89693q;
    }

    /* JADX INFO: renamed from: b */
    public int m88984b() {
        return this.f89689m;
    }

    /* JADX INFO: renamed from: c */
    public int m88985c() {
        return this.f89688l;
    }

    /* JADX INFO: renamed from: d */
    public String m88986d() {
        return this.f89678b;
    }

    /* JADX INFO: renamed from: e */
    public String m88987e() {
        return this.f89677a;
    }

    /* JADX INFO: renamed from: f */
    public int m88988f() {
        return this.f89690n;
    }

    /* JADX INFO: renamed from: g */
    public long m88989g() {
        return this.f89686j;
    }

    /* JADX INFO: renamed from: h */
    public int m88990h() {
        return this.f89692p;
    }

    /* JADX INFO: renamed from: i */
    public long m88991i() {
        return this.f89694r;
    }

    /* JADX INFO: renamed from: j */
    public int m88992j() {
        return this.f89691o;
    }

    /* JADX INFO: renamed from: k */
    public String m88993k() {
        return this.f89679c;
    }

    /* JADX INFO: renamed from: l */
    public String m88994l() {
        return this.f89680d;
    }

    /* JADX INFO: renamed from: m */
    public String m88995m() {
        return this.f89681e;
    }

    /* JADX INFO: renamed from: n */
    public int m88996n() {
        return this.f89687k;
    }

    /* JADX INFO: renamed from: o */
    public String m88997o() {
        return this.f89682f;
    }

    /* JADX INFO: renamed from: p */
    public int m88998p() {
        return this.f89685i;
    }

    /* JADX INFO: renamed from: q */
    public void m88999q(String str, String str2, String str3) {
        C43014a.m94482b(str, "secretId");
        C43014a.m94482b(str2, "secretKey");
        this.f89679c = str;
        this.f89680d = str2;
        this.f89681e = str3;
        if (str3 == null || str3.isEmpty()) {
            this.f89681e = "";
        }
    }

    /* JADX INFO: renamed from: r */
    public void m89000r(String str, String str2) {
        C43014a.m94482b(str, "endpoint");
        C43014a.m94482b(str2, "topicId");
        if (str.startsWith("http://")) {
            this.f89678b = str.substring(7);
            this.f89677a = "http://";
        } else if (str.startsWith("https://")) {
            this.f89678b = str.substring(8);
            this.f89677a = "https://";
        } else {
            this.f89678b = str;
            this.f89677a = "http://";
        }
        while (this.f89678b.endsWith("/")) {
            String str3 = this.f89678b;
            this.f89678b = str3.substring(0, str3.length() - 1);
        }
        if (C43017d.m94488b(this.f89678b)) {
            throw new IllegalArgumentException("EndpointInvalid", new Exception("The ip address is not supported"));
        }
        this.f89683g = str2;
    }

    public C40384b(Context context, String str, String str2, String str3, String str4, String str5) {
        C43014a.m94482b(str, "endpoint");
        C43014a.m94482b(str2, "secretId");
        C43014a.m94482b(str3, "secretKey");
        if (str.startsWith("http://")) {
            this.f89678b = str.substring(7);
            this.f89677a = "http://";
        } else if (str.startsWith("https://")) {
            this.f89678b = str.substring(8);
            this.f89677a = "https://";
        } else {
            this.f89678b = str;
            this.f89677a = "http://";
        }
        while (this.f89678b.endsWith("/")) {
            String str6 = this.f89678b;
            this.f89678b = str6.substring(0, str6.length() - 1);
        }
        if (!C43017d.m94488b(this.f89678b)) {
            this.f89679c = str2;
            this.f89680d = str3;
            this.f89682f = str5;
            this.f89684h = context;
            if (str5 == null) {
                this.f89682f = "";
            }
            this.f89681e = str4;
            if (str4 != null && !str4.isEmpty()) {
                return;
            }
            this.f89681e = "";
            return;
        }
        throw new IllegalArgumentException("EndpointInvalid", new Exception("The ip address is not supported"));
    }
}
