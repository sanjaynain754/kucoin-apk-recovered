package com.geetest.gtc4;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.geetest.gtc4.l3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6810l3 extends AbstractC6879t0 {

    /* JADX INFO: renamed from: h */
    public final C6857q5 f11426h;

    /* JADX INFO: renamed from: i */
    public final C6867r6 f11427i;

    @Override // com.geetest.gtc4.AbstractC6879t0
    /* JADX INFO: renamed from: a */
    public final int mo12670a() {
        C6709a1 c6709a1 = this.f11511g;
        if (c6709a1 != null && c6709a1.f11280b != null) {
            return c6709a1.f11279a.intValue();
        }
        C6709a1 c6709a2 = this.f11510f;
        if (c6709a2 == null || c6709a2.f11280b == null) {
            return -1;
        }
        return c6709a2.f11279a.intValue();
    }

    @Override // com.geetest.gtc4.AbstractC6879t0
    /* JADX INFO: renamed from: b */
    public final C6867r6 mo12671b() {
        return this.f11427i;
    }

    @Override // com.geetest.gtc4.AbstractC6879t0
    public final String toString() {
        return super.toString() + "\nEncoded CBOR: " + this.f11426h;
    }

    public C6810l3(X509Certificate x509Certificate) throws CertificateParsingException {
        super(x509Certificate);
        byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.25");
        if (extensionValue != null && extensionValue.length != 0) {
            C6844p1 c6844p1 = new C6844p1(new ByteArrayInputStream(AbstractC6852q0.m12695a((InterfaceC6752f) AbstractC6852q0.m12692a(extensionValue))));
            LinkedList linkedList = new LinkedList();
            while (true) {
                AbstractC6756f3 abstractC6756f3M12690a = c6844p1.m12690a();
                if (abstractC6756f3M12690a == null) {
                    break;
                } else {
                    linkedList.add(abstractC6756f3M12690a);
                }
            }
            int i11 = 0;
            C6857q5 c6857q5 = (C6857q5) linkedList.get(0);
            this.f11426h = c6857q5;
            Iterator it = c6857q5.f11474e.iterator();
            ArrayList arrayList = null;
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            byte[] bArrM12702b = null;
            byte[] bArrM12702b2 = null;
            while (true) {
                int i12 = 2;
                if (it.hasNext()) {
                    AbstractC6756f3 abstractC6756f3 = (AbstractC6756f3) it.next();
                    int iIntValue = ((AbstractC6741d6) abstractC6756f3).f11339c.intValue();
                    if (iIntValue != -76003) {
                        if (iIntValue != -76002) {
                            if (iIntValue != -76000) {
                                if (iIntValue != -75008) {
                                    if (iIntValue != 7) {
                                        switch (iIntValue) {
                                            case -82006:
                                                zBooleanValue2 = AbstractC6862r1.m12701a(this.f11426h, abstractC6756f3).booleanValue();
                                                break;
                                            case -82005:
                                                this.f11506b = AbstractC6862r1.m12704d(this.f11426h, abstractC6756f3);
                                                break;
                                            case -82004:
                                                this.f11505a = AbstractC6862r1.m12704d(this.f11426h, abstractC6756f3);
                                                break;
                                            case -82003:
                                                bArrM12702b = AbstractC6862r1.m12702b(this.f11426h, abstractC6756f3);
                                                break;
                                            case -82002:
                                                zBooleanValue = AbstractC6862r1.m12701a(this.f11426h, abstractC6756f3).booleanValue();
                                                break;
                                            case -82001:
                                                bArrM12702b2 = AbstractC6862r1.m12702b(this.f11426h, abstractC6756f3);
                                                break;
                                            default:
                                                throw new CertificateParsingException("Unknown EAT tag: " + abstractC6756f3 + "\n in EAT extension:\n" + this);
                                        }
                                    } else {
                                        this.f11509e = AbstractC6862r1.m12702b(this.f11426h, abstractC6756f3);
                                    }
                                } else {
                                    this.f11508d = AbstractC6862r1.m12702b(this.f11426h, abstractC6756f3);
                                }
                            } else {
                                C6857q5 c6857q6 = (C6857q5) ((AbstractC6756f3) this.f11426h.f11473d.get(abstractC6756f3));
                                this.f11510f = new C6709a1((C6857q5) ((AbstractC6756f3) c6857q6.f11473d.get(new C6868r7("software"))));
                                this.f11511g = new C6709a1((C6857q5) ((AbstractC6756f3) c6857q6.f11473d.get(new C6868r7("tee"))));
                            }
                        } else {
                            int iM12704d = AbstractC6862r1.m12704d(this.f11426h, abstractC6756f3);
                            if (iM12704d != 1) {
                                if (iM12704d != 3) {
                                    if (iM12704d != 4) {
                                        throw new RuntimeException("Invalid EAT security level: " + iM12704d);
                                    }
                                } else {
                                    i12 = 1;
                                }
                            } else {
                                i12 = 0;
                            }
                            this.f11507c = i12;
                        }
                    } else {
                        C6857q5 c6857q7 = this.f11426h;
                        C6807l0 c6807l0 = (C6807l0) ((AbstractC6756f3) c6857q7.f11473d.get(abstractC6756f3));
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = c6807l0.f11421d.iterator();
                        while (it2.hasNext()) {
                            EnumC6903v6 enumC6903v6 = ((C6894u6) ((AbstractC6756f3) it2.next())).f11530e;
                            if (enumC6903v6 == EnumC6903v6.FALSE) {
                                arrayList2.add(Boolean.FALSE);
                            } else if (enumC6903v6 == EnumC6903v6.TRUE) {
                                arrayList2.add(Boolean.TRUE);
                            } else {
                                throw new RuntimeException("Map contains more than booleans: " + c6857q7);
                            }
                        }
                        arrayList = arrayList2;
                    }
                } else {
                    if (arrayList != null) {
                        if (arrayList.size() == 5) {
                            if (!((Boolean) arrayList.get(4)).booleanValue()) {
                                boolean zBooleanValue3 = ((Boolean) arrayList.get(0)).booleanValue();
                                if (zBooleanValue3 != ((Boolean) arrayList.get(1)).booleanValue() && zBooleanValue3 != ((Boolean) arrayList.get(2)).booleanValue() && zBooleanValue3 != ((Boolean) arrayList.get(3)).booleanValue()) {
                                    throw new RuntimeException("Unexpected boot state: " + arrayList);
                                }
                                if (zBooleanValue2) {
                                    if (!zBooleanValue3) {
                                        throw new AssertionError("Non-verified official build");
                                    }
                                } else if (zBooleanValue3) {
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                }
                            } else {
                                throw new RuntimeException("debug-permanent-disable must never be true: " + arrayList);
                            }
                        } else {
                            throw new RuntimeException("Boot state map has unexpected size: " + arrayList.size());
                        }
                    } else {
                        i11 = -1;
                    }
                    this.f11427i = new C6867r6(bArrM12702b2, zBooleanValue, i11, bArrM12702b);
                    return;
                }
            }
        } else {
            throw new CertificateParsingException("Did not find extension with OID 1.3.6.1.4.1.11129.2.1.25");
        }
    }
}
