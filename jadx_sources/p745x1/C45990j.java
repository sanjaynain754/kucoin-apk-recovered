package p745x1;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p523p2.C43360g;
import p523p2.C43363j;
import p523p2.C43364k;
import p546q2.AbstractC43593c;
import p546q2.C43591a;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: x1.j */
/* JADX INFO: compiled from: SafeKeyGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class C45990j {

    /* JADX INFO: renamed from: a */
    public final C43360g<InterfaceC44610b, String> f103465a = new C43360g<>(1000);

    /* JADX INFO: renamed from: b */
    public final Pools.Pool<b> f103466b = C43591a.m95935d(10, new a());

    /* JADX INFO: renamed from: x1.j$a */
    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    public class a implements C43591a.d<b> {
        public a() {
        }

        @Override // p546q2.C43591a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* JADX INFO: renamed from: x1.j$b */
    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    public static final class b implements C43591a.f {

        /* JADX INFO: renamed from: b */
        public final MessageDigest f103468b;

        /* JADX INFO: renamed from: c */
        public final AbstractC43593c f103469c = AbstractC43593c.m95945a();

        @Override // p546q2.C43591a.f
        @NonNull
        /* JADX INFO: renamed from: e */
        public AbstractC43593c mo6704e() {
            return this.f103469c;
        }

        public b(MessageDigest messageDigest) {
            this.f103468b = messageDigest;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m101463a(InterfaceC44610b interfaceC44610b) {
        b bVar = (b) C43363j.m95506d(this.f103466b.acquire());
        try {
            interfaceC44610b.mo4268a(bVar.f103468b);
            return C43364k.m95531x(bVar.f103468b.digest());
        } finally {
            this.f103466b.release(bVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m101464b(InterfaceC44610b interfaceC44610b) {
        String strM95493g;
        synchronized (this.f103465a) {
            strM95493g = this.f103465a.m95493g(interfaceC44610b);
        }
        if (strM95493g == null) {
            strM95493g = m101463a(interfaceC44610b);
        }
        synchronized (this.f103465a) {
            this.f103465a.m95497k(interfaceC44610b, strM95493g);
        }
        return strM95493g;
    }
}
