package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcelable;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import com.tencent.bugly.proguard.C33978va;
import java.util.List;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28841e0 implements Parcelable {

    /* JADX INFO: renamed from: c */
    public static final C28855m f58666c = new C28855m();

    /* JADX INFO: renamed from: a */
    public final C29470F f58667a;

    /* JADX INFO: renamed from: b */
    public String f58668b = null;

    /* JADX INFO: renamed from: b */
    public CharSequence mo69641b() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo69643d();

    /* JADX INFO: renamed from: e */
    public String mo69647e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public String mo69644f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public List mo69646g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo69649h() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo69648i() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public C29470F mo69642c() {
        return this.f58667a;
    }

    public AbstractC28841e0(C29470F c29470f) {
        this.f58667a = c29470f;
    }

    /* JADX INFO: renamed from: j */
    public final String m69653j() {
        boolean z11;
        String strM69333a = AbstractC28458h.m69333a(this);
        String strMo69643d = mo69643d();
        String str = mo69642c().f59466a;
        Boolean bool = mo69642c().f59470e;
        String strMo69644f = mo69644f();
        boolean z12 = false;
        if (strMo69644f != null && strMo69644f.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z13 = !z11;
        List listMo69646g = mo69646g();
        if (listMo69646g == null || listMo69646g.isEmpty()) {
            z12 = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM69333a);
        sb2.append(" (");
        sb2.append(strMo69643d);
        sb2.append(C33978va.f72339h);
        sb2.append(str);
        sb2.append(", isRequired=");
        sb2.append(bool);
        sb2.append(", hasValue=");
        sb2.append(z13);
        sb2.append("), hasValues=");
        sb2.append(!z12);
        sb2.append(")");
        return sb2.toString();
    }
}
