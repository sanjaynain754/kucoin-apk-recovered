package p546q2;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: q2.c */
/* JADX INFO: compiled from: StateVerifier.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC43593c {

    /* JADX INFO: renamed from: q2.c$b */
    /* JADX INFO: compiled from: StateVerifier.java */
    public static class b extends AbstractC43593c {

        /* JADX INFO: renamed from: a */
        public volatile boolean f96245a;

        public b() {
            super();
        }

        @Override // p546q2.AbstractC43593c
        /* JADX INFO: renamed from: b */
        public void mo95946b(boolean z11) {
            this.f96245a = z11;
        }

        @Override // p546q2.AbstractC43593c
        /* JADX INFO: renamed from: c */
        public void mo95947c() {
            if (this.f96245a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo95946b(boolean z11);

    /* JADX INFO: renamed from: c */
    public abstract void mo95947c();

    public AbstractC43593c() {
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static AbstractC43593c m95945a() {
        return new b();
    }
}
