package com.sumsub.sns.internal.features.data.model.common;

import kotlinx.serialization.encoding.InterfaceC41787b;
import tg0.InterfaceC44951d;
import vg0.AbstractC45532e;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.R0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29047R0 implements InterfaceC44951d {

    /* JADX INFO: renamed from: a */
    public static final C29047R0 f58985a = new C29047R0();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC45533f f58986b = C45540m.m100542c("FieldName", AbstractC45532e.i.f102607a);

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return f58986b;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        interfaceC45830c.encodeString(((AbstractC29103d2) obj).mo69715b());
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        String strDecodeString = interfaceC41787b.decodeString();
        AbstractC29103d2.Companion.getClass();
        return C29051S0.m69736a(strDecodeString);
    }
}
