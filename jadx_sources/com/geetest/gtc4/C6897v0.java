package com.geetest.gtc4;

import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.geetest.gtc4.v0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6897v0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final ArrayList f11532a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f11533b;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C6897v0 c6897v0) {
        int iCompare = Integer.compare(this.f11532a.size(), c6897v0.f11532a.size());
        if (iCompare != 0) {
            return iCompare;
        }
        for (int i11 = 0; i11 < this.f11532a.size(); i11++) {
            C6924y0 c6924y0 = (C6924y0) this.f11532a.get(i11);
            C6924y0 c6924y1 = (C6924y0) c6897v0.f11532a.get(i11);
            int iCompareTo = c6924y0.f11557a.compareTo(c6924y1.f11557a);
            if (iCompareTo == 0) {
                iCompareTo = Long.compare(c6924y0.f11558b, c6924y1.f11558b);
            }
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        int iCompare2 = Integer.compare(this.f11533b.size(), c6897v0.f11533b.size());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        for (int i12 = 0; i12 < this.f11533b.size(); i12++) {
            byte[] bArr = (byte[]) this.f11533b.get(i12);
            byte[] bArr2 = (byte[]) c6897v0.f11533b.get(i12);
            int iCompare3 = Integer.compare(bArr.length, bArr2.length);
            if (iCompare3 == 0) {
                for (int i13 = 0; i13 < bArr.length && (iCompare3 = Byte.compare(bArr[i13], bArr2[i13])) == 0; i13++) {
                }
            }
            iCompare2 = iCompare3;
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return iCompare2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6897v0) && compareTo((C6897v0) obj) == 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = this.f11532a.size();
        int i11 = 1;
        int i12 = 1;
        for (C6924y0 c6924y0 : this.f11532a) {
            sb2.append("Package info ");
            sb2.append(i12);
            sb2.append("/");
            sb2.append(size);
            sb2.append(":\n");
            sb2.append(c6924y0);
            i12++;
        }
        sb2.append('\n');
        int size2 = this.f11533b.size();
        for (byte[] bArr : this.f11533b) {
            sb2.append("Signature digest ");
            int i13 = i11 + 1;
            sb2.append(i11);
            sb2.append("/");
            sb2.append(size2);
            sb2.append(":\n");
            for (byte b11 : bArr) {
                sb2.append(String.format("%02X ", Byte.valueOf(b11)));
            }
            sb2.append('\n');
            i11 = i13;
        }
        return sb2.toString();
    }

    public C6897v0(AbstractC6905w abstractC6905w) throws CertificateParsingException {
        if (abstractC6905w instanceof AbstractC6931z) {
            AbstractC6931z abstractC6931z = (AbstractC6931z) abstractC6905w;
            InterfaceC6752f interfaceC6752fMo12672a = abstractC6931z.mo12672a(0);
            if (interfaceC6752fMo12672a instanceof AbstractC6717b0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((AbstractC6717b0) interfaceC6752fMo12672a).iterator();
                while (true) {
                    C6825n0 c6825n0 = (C6825n0) it;
                    if (!c6825n0.hasNext()) {
                        break;
                    } else {
                        arrayList.add(new C6924y0((InterfaceC6752f) c6825n0.next()));
                    }
                }
                this.f11532a = arrayList;
                Collections.sort(arrayList);
                InterfaceC6752f interfaceC6752fMo12672a2 = abstractC6931z.mo12672a(1);
                if (interfaceC6752fMo12672a2 instanceof AbstractC6717b0) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = ((AbstractC6717b0) interfaceC6752fMo12672a2).iterator();
                    while (true) {
                        C6825n0 c6825n1 = (C6825n0) it2;
                        if (c6825n1.hasNext()) {
                            arrayList2.add(AbstractC6852q0.m12695a((InterfaceC6752f) c6825n1.next()));
                        } else {
                            this.f11533b = arrayList2;
                            Collections.sort(arrayList2, new C6888u0());
                            return;
                        }
                    }
                } else {
                    throw new CertificateParsingException("Expected set for Signature digests, found ".concat(interfaceC6752fMo12672a2.getClass().getName()));
                }
            } else {
                throw new CertificateParsingException("Expected set for AttestationApplicationsInfos, found ".concat(interfaceC6752fMo12672a.getClass().getName()));
            }
        } else {
            throw new CertificateParsingException("Expected sequence for AttestationApplicationId, found ".concat(abstractC6905w.getClass().getName()));
        }
    }
}
