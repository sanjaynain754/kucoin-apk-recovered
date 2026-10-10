package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.f0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6753f0 {

    /* JADX INFO: renamed from: a */
    public final Class f11353a;

    /* JADX INFO: renamed from: a */
    public abstract AbstractC6905w mo12595a(C6782i2 c6782i2);

    /* JADX INFO: renamed from: a */
    public AbstractC6905w mo12596a(AbstractC6931z abstractC6931z) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC6905w m12630a(AbstractC6735d0 abstractC6735d0) {
        String str;
        int i11 = abstractC6735d0.f11334b;
        if (i11 != 128) {
            if (i11 == 64) {
                str = "APPLICATION";
            } else if (i11 != 128) {
                str = i11 != 192 ? "UNIVERSAL" : "PRIVATE";
            } else {
                str = "CONTEXT";
            }
            throw new IllegalStateException("Expected CONTEXT tag but found ".concat(str));
        }
        if (1 == abstractC6735d0.f11333a) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        AbstractC6905w abstractC6905wMo12598d = abstractC6735d0.f11336d.mo12598d();
        int i12 = abstractC6735d0.f11333a;
        if (i12 == 3) {
            abstractC6905wMo12598d = mo12596a(abstractC6735d0.mo12623c(abstractC6905wMo12598d));
        } else if (i12 == 4) {
            abstractC6905wMo12598d = abstractC6905wMo12598d instanceof AbstractC6931z ? mo12596a((AbstractC6931z) abstractC6905wMo12598d) : mo12595a((C6782i2) abstractC6905wMo12598d);
        } else if (!this.f11353a.isInstance(abstractC6905wMo12598d)) {
            throw new IllegalStateException("unexpected object: ".concat(abstractC6905wMo12598d.getClass().getName()));
        }
        if (this.f11353a.isInstance(abstractC6905wMo12598d)) {
            return abstractC6905wMo12598d;
        }
        throw new IllegalStateException("unexpected object: ".concat(abstractC6905wMo12598d.getClass().getName()));
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public AbstractC6753f0(Class cls) {
        this.f11353a = cls;
    }
}
