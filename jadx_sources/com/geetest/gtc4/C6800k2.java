package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.k2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6800k2 extends C6926y2 {
    @Override // com.geetest.gtc4.C6887u
    /* JADX INFO: renamed from: a */
    public final C6800k2 mo12665a() {
        return this;
    }

    @Override // com.geetest.gtc4.C6926y2, com.geetest.gtc4.C6887u
    /* JADX INFO: renamed from: a */
    public final void mo12667a(InterfaceC6752f[] interfaceC6752fArr) {
        for (InterfaceC6752f interfaceC6752f : interfaceC6752fArr) {
            interfaceC6752f.mo12598d().mo12600g().mo12613a(this, true);
        }
    }

    public C6800k2(ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
    }

    @Override // com.geetest.gtc4.C6926y2
    /* JADX INFO: renamed from: a */
    public final void mo12666a(AbstractC6905w abstractC6905w) {
        abstractC6905w.mo12600g().mo12613a(this, true);
    }

    @Override // com.geetest.gtc4.C6926y2, com.geetest.gtc4.C6887u
    /* JADX INFO: renamed from: a */
    public final void mo12668a(AbstractC6905w[] abstractC6905wArr) {
        for (AbstractC6905w abstractC6905w : abstractC6905wArr) {
            abstractC6905w.mo12600g().mo12613a(this, true);
        }
    }
}
