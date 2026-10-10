package v90;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import q90.C43671b;
import q90.InterfaceC43670a;

/* JADX INFO: renamed from: v90.a */
/* JADX INFO: compiled from: ThumbnailsDispatcher.java */
/* JADX INFO: loaded from: classes59.dex */
public class C45483a {

    /* JADX INFO: renamed from: a */
    public final Handler f102506a;

    /* JADX INFO: renamed from: b */
    public final List<Object> f102507b = new ArrayList();

    /* JADX INFO: renamed from: v90.a$a */
    /* JADX INFO: compiled from: ThumbnailsDispatcher.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C45483a.m100437a(C45483a.this);
            throw null;
        }
    }

    /* JADX INFO: renamed from: v90.a$b */
    /* JADX INFO: compiled from: ThumbnailsDispatcher.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Throwable f102509b;

        public b(Throwable th2) {
            this.f102509b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C45483a.m100437a(C45483a.this);
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m100438b() {
        this.f102506a.post(new a());
    }

    /* JADX INFO: renamed from: c */
    public void m100439c(@NonNull Throwable th2) {
        this.f102506a.post(new b(th2));
    }

    public C45483a(@NonNull C43671b c43671b) {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC43670a m100437a(C45483a c45483a) {
        c45483a.getClass();
        return null;
    }
}
