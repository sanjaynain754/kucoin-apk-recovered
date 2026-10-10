package p329i2;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p445m2.InterfaceC42399j;
import p523p2.C43364k;

/* JADX INFO: renamed from: i2.s */
/* JADX INFO: compiled from: TargetTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class C38427s implements InterfaceC38421m {

    /* JADX INFO: renamed from: b */
    public final Set<InterfaceC42399j<?>> f86222b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public void m86642b() {
        this.f86222b.clear();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public List<InterfaceC42399j<?>> m86643d() {
        return C43364k.m95517j(this.f86222b);
    }

    /* JADX INFO: renamed from: j */
    public void m86644j(@NonNull InterfaceC42399j<?> interfaceC42399j) {
        this.f86222b.add(interfaceC42399j);
    }

    /* JADX INFO: renamed from: k */
    public void m86645k(@NonNull InterfaceC42399j<?> interfaceC42399j) {
        this.f86222b.remove(interfaceC42399j);
    }

    @Override // p329i2.InterfaceC38421m
    public void onDestroy() {
        Iterator it = C43364k.m95517j(this.f86222b).iterator();
        while (it.hasNext()) {
            ((InterfaceC42399j) it.next()).onDestroy();
        }
    }

    @Override // p329i2.InterfaceC38421m
    public void onStart() {
        Iterator it = C43364k.m95517j(this.f86222b).iterator();
        while (it.hasNext()) {
            ((InterfaceC42399j) it.next()).onStart();
        }
    }

    @Override // p329i2.InterfaceC38421m
    public void onStop() {
        Iterator it = C43364k.m95517j(this.f86222b).iterator();
        while (it.hasNext()) {
            ((InterfaceC42399j) it.next()).onStop();
        }
    }
}
