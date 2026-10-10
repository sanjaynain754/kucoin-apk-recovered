package org.springframework.web.util.pattern;

import com.tencent.bugly.proguard.C33844oi;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vh0.InterfaceC45553b;

/* JADX INFO: renamed from: org.springframework.web.util.pattern.b */
/* JADX INFO: compiled from: CaptureVariablePathElement.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43312b extends AbstractC43315e {

    /* JADX INFO: renamed from: f */
    public final String f95582f;

    /* JADX INFO: renamed from: g */
    public final Pattern f95583g;

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: a */
    public int mo95318a() {
        return 1;
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: b */
    public int mo95319b() {
        return 1;
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: c */
    public int mo95322c() {
        return 1;
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: e */
    public boolean mo95320e(int i11, C43316f.a aVar) {
        boolean zMo95320e = false;
        if (i11 >= aVar.f95621c) {
            return false;
        }
        String strM95352d = aVar.m95352d(i11);
        if (strM95352d.length() == 0) {
            return false;
        }
        Pattern pattern = this.f95583g;
        if (pattern != null) {
            Matcher matcher = pattern.matcher(strM95352d);
            if (matcher.groupCount() != 0) {
                throw new IllegalArgumentException("No capture groups allowed in the constraint regex: " + this.f95583g.pattern());
            }
            if (!matcher.matches()) {
                return false;
            }
        }
        int i12 = i11 + 1;
        if (m95333d()) {
            if (aVar.f95625g) {
                aVar.f95626h = i12;
            } else {
                boolean z11 = i12 == aVar.f95621c;
                if (z11 || !aVar.m95350b()) {
                    zMo95320e = z11;
                } else if (i11 + 2 == aVar.f95621c && aVar.m95351c(i12)) {
                }
            }
            zMo95320e = true;
        } else {
            AbstractC43315e abstractC43315e = this.f95604c;
            if (abstractC43315e != null) {
                zMo95320e = abstractC43315e.mo95320e(i12, aVar);
            }
        }
        if (zMo95320e && aVar.f95624f) {
            aVar.m95353e(this.f95582f, strM95352d, ((InterfaceC45553b.c) aVar.f95620b.get(i11)).mo100601b());
        }
        return zMo95320e;
    }

    /* JADX INFO: renamed from: f */
    public String m95323f() {
        return this.f95582f;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CaptureVariable({");
        sb2.append(this.f95582f);
        if (this.f95583g != null) {
            str = C33844oi.f71346o + this.f95583g.pattern();
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("})");
        return sb2.toString();
    }

    public C43312b(int i11, char[] cArr, boolean z11, char c11) {
        super(i11, c11);
        int i12 = 0;
        while (true) {
            if (i12 < cArr.length) {
                if (cArr[i12] == ':') {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 == -1) {
            this.f95582f = new String(cArr, 1, cArr.length - 2);
            this.f95583g = null;
        } else {
            this.f95582f = new String(cArr, 1, i12 - 1);
            this.f95583g = Pattern.compile(new String(cArr, i12 + 1, (cArr.length - i12) - 2), (z11 ? 0 : 2) | 32);
        }
    }
}
