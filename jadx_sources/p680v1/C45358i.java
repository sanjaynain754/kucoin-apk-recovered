package p680v1;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import p523p2.C43363j;
import p546q2.AbstractC43593c;
import p546q2.C43591a;

/* JADX INFO: renamed from: v1.i */
/* JADX INFO: compiled from: LockedResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class C45358i<Z> implements InterfaceC45359j<Z>, C43591a.f {

    /* JADX INFO: renamed from: f */
    public static final Pools.Pool<C45358i<?>> f101970f = C43591a.m95935d(20, new a());

    /* JADX INFO: renamed from: b */
    public final AbstractC43593c f101971b = AbstractC43593c.m95945a();

    /* JADX INFO: renamed from: c */
    public InterfaceC45359j<Z> f101972c;

    /* JADX INFO: renamed from: d */
    public boolean f101973d;

    /* JADX INFO: renamed from: e */
    public boolean f101974e;

    /* JADX INFO: renamed from: v1.i$a */
    /* JADX INFO: compiled from: LockedResource.java */
    /* JADX INFO: loaded from: classes34.dex */
    public class a implements C43591a.d<C45358i<?>> {
        @Override // p546q2.C43591a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C45358i<?> create() {
            return new C45358i<>();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m100260d() {
        this.f101972c = null;
        f101970f.release(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m100261b(InterfaceC45359j<Z> interfaceC45359j) {
        this.f101974e = false;
        this.f101973d = true;
        this.f101972c = interfaceC45359j;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m100262f() {
        this.f101971b.mo95947c();
        if (!this.f101973d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f101973d = false;
        if (this.f101974e) {
            recycle();
        }
    }

    @Override // p680v1.InterfaceC45359j
    public synchronized void recycle() {
        this.f101971b.mo95947c();
        this.f101974e = true;
        if (!this.f101973d) {
            this.f101972c.recycle();
            m100260d();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <Z> C45358i<Z> m100259c(InterfaceC45359j<Z> interfaceC45359j) {
        C45358i<Z> c45358i = (C45358i) C43363j.m95506d(f101970f.acquire());
        c45358i.m100261b(interfaceC45359j);
        return c45358i;
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<Z> mo4266a() {
        return this.f101972c.mo4266a();
    }

    @Override // p546q2.C43591a.f
    @NonNull
    /* JADX INFO: renamed from: e */
    public AbstractC43593c mo6704e() {
        return this.f101971b;
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    public Z get() {
        return this.f101972c.get();
    }

    @Override // p680v1.InterfaceC45359j
    public int getSize() {
        return this.f101972c.getSize();
    }
}
