package y90;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r90.C43959b;

/* JADX INFO: renamed from: y90.c */
/* JADX INFO: compiled from: MultiResizer.java */
/* JADX INFO: loaded from: classes59.dex */
public class C46417c implements InterfaceC46418d {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC46418d> f104088a = new ArrayList();

    @Override // y90.InterfaceC46418d
    @NonNull
    /* JADX INFO: renamed from: a */
    public C43959b mo102388a(@NonNull C43959b c43959b) throws Exception {
        Iterator<InterfaceC46418d> it = this.f104088a.iterator();
        while (it.hasNext()) {
            c43959b = it.next().mo102388a(c43959b);
        }
        return c43959b;
    }

    /* JADX INFO: renamed from: b */
    public void m102389b(@NonNull InterfaceC46418d interfaceC46418d) {
        this.f104088a.add(interfaceC46418d);
    }
}
