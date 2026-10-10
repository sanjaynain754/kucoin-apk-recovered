package zg0;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: zg0.d */
/* JADX INFO: compiled from: MultiTypePool.java */
/* JADX INFO: loaded from: classes61.dex */
public class C46845d implements InterfaceC46847f {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final List<Class<?>> f104680a = new ArrayList();

    /* JADX INFO: renamed from: b */
    @NonNull
    public final List<AbstractC46843b<?, ?>> f104681b = new ArrayList();

    /* JADX INFO: renamed from: c */
    @NonNull
    public final List<InterfaceC46844c<?>> f104682c = new ArrayList();

    @Override // zg0.InterfaceC46847f
    @NonNull
    /* JADX INFO: renamed from: a */
    public AbstractC46843b<?, ?> mo103187a(int i11) {
        return this.f104681b.get(i11);
    }

    @Override // zg0.InterfaceC46847f
    @NonNull
    /* JADX INFO: renamed from: d */
    public InterfaceC46844c<?> mo103190d(int i11) {
        return this.f104682c.get(i11);
    }

    @Override // zg0.InterfaceC46847f
    /* JADX INFO: renamed from: b */
    public boolean mo103188b(@NonNull Class<?> cls) {
        C46846e.m103192a(cls);
        boolean z11 = false;
        while (true) {
            int iIndexOf = this.f104680a.indexOf(cls);
            if (iIndexOf != -1) {
                this.f104680a.remove(iIndexOf);
                this.f104681b.remove(iIndexOf);
                this.f104682c.remove(iIndexOf);
                z11 = true;
            } else {
                return z11;
            }
        }
    }

    @Override // zg0.InterfaceC46847f
    /* JADX INFO: renamed from: c */
    public int mo103189c(@NonNull Class<?> cls) {
        C46846e.m103192a(cls);
        int iIndexOf = this.f104680a.indexOf(cls);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        for (int i11 = 0; i11 < this.f104680a.size(); i11++) {
            if (this.f104680a.get(i11).isAssignableFrom(cls)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // zg0.InterfaceC46847f
    /* JADX INFO: renamed from: e */
    public <T> void mo103191e(@NonNull Class<? extends T> cls, @NonNull AbstractC46843b<T, ?> abstractC46843b, @NonNull InterfaceC46844c<T> interfaceC46844c) {
        C46846e.m103192a(cls);
        C46846e.m103192a(abstractC46843b);
        C46846e.m103192a(interfaceC46844c);
        this.f104680a.add(cls);
        this.f104681b.add(abstractC46843b);
        this.f104682c.add(interfaceC46844c);
    }
}
