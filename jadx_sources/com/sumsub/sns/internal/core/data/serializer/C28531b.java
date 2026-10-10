package com.sumsub.sns.internal.core.data.serializer;

import com.sumsub.sns.core.data.model.FlowActionType;
import kotlinx.serialization.encoding.InterfaceC41787b;
import tg0.InterfaceC44951d;
import vg0.AbstractC45532e;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.serializer.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28531b implements InterfaceC44951d {

    /* JADX INFO: renamed from: a */
    public static final C28531b f58082a = new C28531b();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC45533f f58083b = C45540m.m100542c("com.sumsub.sns.internal.core.data.serializer.FlowActionTypeSerializer", AbstractC45532e.i.f102607a);

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return f58083b;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        interfaceC45830c.encodeString(((FlowActionType) obj).getValue());
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        return FlowActionType.INSTANCE.get(interfaceC41787b.decodeString());
    }
}
