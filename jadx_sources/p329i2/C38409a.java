package p329i2;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p523p2.C43364k;

/* JADX INFO: renamed from: i2.a */
/* JADX INFO: compiled from: ActivityFragmentLifecycle.java */
/* JADX INFO: loaded from: classes.dex */
public class C38409a implements InterfaceC38420l {

    /* JADX INFO: renamed from: a */
    public final Set<InterfaceC38421m> f86200a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public boolean f86201b;

    /* JADX INFO: renamed from: c */
    public boolean f86202c;

    /* JADX INFO: renamed from: c */
    public void m86604c() {
        this.f86202c = true;
        Iterator it = C43364k.m95517j(this.f86200a).iterator();
        while (it.hasNext()) {
            ((InterfaceC38421m) it.next()).onDestroy();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m86605d() {
        this.f86201b = true;
        Iterator it = C43364k.m95517j(this.f86200a).iterator();
        while (it.hasNext()) {
            ((InterfaceC38421m) it.next()).onStart();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m86606e() {
        this.f86201b = false;
        Iterator it = C43364k.m95517j(this.f86200a).iterator();
        while (it.hasNext()) {
            ((InterfaceC38421m) it.next()).onStop();
        }
    }

    @Override // p329i2.InterfaceC38420l
    /* JADX INFO: renamed from: a */
    public void mo86602a(@NonNull InterfaceC38421m interfaceC38421m) {
        this.f86200a.remove(interfaceC38421m);
    }

    @Override // p329i2.InterfaceC38420l
    /* JADX INFO: renamed from: b */
    public void mo86603b(@NonNull InterfaceC38421m interfaceC38421m) {
        this.f86200a.add(interfaceC38421m);
        if (this.f86202c) {
            interfaceC38421m.onDestroy();
        } else if (this.f86201b) {
            interfaceC38421m.onStart();
        } else {
            interfaceC38421m.onStop();
        }
    }
}
