package p628t1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import p523p2.C43363j;

/* JADX INFO: renamed from: t1.d */
/* JADX INFO: compiled from: Option.java */
/* JADX INFO: loaded from: classes.dex */
public final class C44612d<T> {

    /* JADX INFO: renamed from: e */
    public static final b<Object> f98909e = new a();

    /* JADX INFO: renamed from: a */
    public final T f98910a;

    /* JADX INFO: renamed from: b */
    public final b<T> f98911b;

    /* JADX INFO: renamed from: c */
    public final String f98912c;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f98913d;

    /* JADX INFO: renamed from: t1.d$b */
    /* JADX INFO: compiled from: Option.java */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        void mo6860a(@NonNull byte[] bArr, @NonNull T t11, @NonNull MessageDigest messageDigest);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <T> C44612d<T> m98724a(@NonNull String str, @Nullable T t11, @NonNull b<T> bVar) {
        return new C44612d<>(str, t11, bVar);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <T> b<T> m98725b() {
        return (b<T>) f98909e;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <T> C44612d<T> m98726e(@NonNull String str) {
        return new C44612d<>(str, null, m98725b());
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <T> C44612d<T> m98727f(@NonNull String str, @NonNull T t11) {
        return new C44612d<>(str, t11, m98725b());
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public T m98728c() {
        return this.f98910a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final byte[] m98729d() {
        if (this.f98913d == null) {
            this.f98913d = this.f98912c.getBytes(InterfaceC44610b.f98907a);
        }
        return this.f98913d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C44612d) {
            return this.f98912c.equals(((C44612d) obj).f98912c);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m98730g(@NonNull T t11, @NonNull MessageDigest messageDigest) {
        this.f98911b.mo6860a(m98729d(), t11, messageDigest);
    }

    public int hashCode() {
        return this.f98912c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f98912c + "'}";
    }

    public C44612d(@NonNull String str, @Nullable T t11, @NonNull b<T> bVar) {
        this.f98912c = C43363j.m95504b(str);
        this.f98910a = t11;
        this.f98911b = (b) C43363j.m95506d(bVar);
    }

    /* JADX INFO: renamed from: t1.d$a */
    /* JADX INFO: compiled from: Option.java */
    public class a implements b<Object> {
        @Override // p628t1.C44612d.b
        /* JADX INFO: renamed from: a */
        public void mo6860a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
