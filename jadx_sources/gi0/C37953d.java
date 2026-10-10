package gi0;

import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.d */
/* JADX INFO: compiled from: DefaultImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37953d implements InterfaceC37504d {
    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        return false;
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (interfaceC37503c == null) {
            return;
        }
        interfaceC37503c.mo84444b(new OAIDException("Unsupported"));
    }
}
