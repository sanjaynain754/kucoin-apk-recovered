package p817z1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Queue;
import p523p2.C43360g;
import p523p2.C43364k;

/* JADX INFO: renamed from: z1.m */
/* JADX INFO: compiled from: ModelCache.java */
/* JADX INFO: loaded from: classes.dex */
public class C46634m<A, B> {

    /* JADX INFO: renamed from: a */
    public final C43360g<b<A>, B> f104421a;

    /* JADX INFO: renamed from: z1.m$a */
    /* JADX INFO: compiled from: ModelCache.java */
    public class a extends C43360g<b<A>, B> {
        public a(long j11) {
            super(j11);
        }

        @Override // p523p2.C43360g
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo95496j(@NonNull b<A> bVar, @Nullable B b11) {
            bVar.m102847c();
        }
    }

    /* JADX INFO: renamed from: z1.m$b */
    /* JADX INFO: compiled from: ModelCache.java */
    /* JADX INFO: loaded from: classes34.dex */
    @VisibleForTesting
    public static final class b<A> {

        /* JADX INFO: renamed from: d */
        public static final Queue<b<?>> f104423d = C43364k.m95513f(0);

        /* JADX INFO: renamed from: a */
        public int f104424a;

        /* JADX INFO: renamed from: b */
        public int f104425b;

        /* JADX INFO: renamed from: c */
        public A f104426c;

        /* JADX INFO: renamed from: a */
        public static <A> b<A> m102845a(A a11, int i11, int i12) {
            b<A> bVar;
            Queue<b<?>> queue = f104423d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.m102846b(a11, i11, i12);
            return bVar;
        }

        /* JADX INFO: renamed from: b */
        public final void m102846b(A a11, int i11, int i12) {
            this.f104426c = a11;
            this.f104425b = i11;
            this.f104424a = i12;
        }

        /* JADX INFO: renamed from: c */
        public void m102847c() {
            Queue<b<?>> queue = f104423d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f104425b == bVar.f104425b && this.f104424a == bVar.f104424a && this.f104426c.equals(bVar.f104426c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f104424a * 31) + this.f104425b) * 31) + this.f104426c.hashCode();
        }
    }

    public C46634m(long j11) {
        this.f104421a = new a(j11);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public B m102842a(A a11, int i11, int i12) {
        b<A> bVarM102845a = b.m102845a(a11, i11, i12);
        B bM95493g = this.f104421a.m95493g(bVarM102845a);
        bVarM102845a.m102847c();
        return bM95493g;
    }

    /* JADX INFO: renamed from: b */
    public void m102843b(A a11, int i11, int i12, B b11) {
        this.f104421a.m95497k(b.m102845a(a11, i11, i12), b11);
    }
}
