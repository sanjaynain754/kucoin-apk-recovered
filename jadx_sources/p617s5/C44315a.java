package p617s5;

import android.util.Log;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import p006a4.AbstractC0110a;
import p006a4.InterfaceC0117h;
import p653u5.InterfaceC45123a;
import p747x3.C45999a;

/* JADX INFO: renamed from: s5.a */
/* JADX INFO: compiled from: CloseableReferenceFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C44315a {

    /* JADX INFO: renamed from: a */
    public final AbstractC0110a.c f97944a;

    /* JADX INFO: renamed from: s5.a$a */
    /* JADX INFO: compiled from: CloseableReferenceFactory.java */
    public class a implements AbstractC0110a.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC45123a f97945a;

        public a(InterfaceC45123a interfaceC45123a) {
            this.f97945a = interfaceC45123a;
        }

        @Override // p006a4.AbstractC0110a.c
        /* JADX INFO: renamed from: a */
        public boolean mo569a() {
            return this.f97945a.mo99745b();
        }

        @Override // p006a4.AbstractC0110a.c
        /* JADX INFO: renamed from: b */
        public void mo570b(SharedReference<Object> sharedReference, Throwable th2) {
            this.f97945a.mo99744a(sharedReference, th2);
            Object objM8547f = sharedReference.m8547f();
            C45999a.m101490K("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), objM8547f != null ? objM8547f.getClass().getName() : "<value is null>", C44315a.m97775d(th2));
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m97775d(Throwable th2) {
        return th2 == null ? "" : Log.getStackTraceString(th2);
    }

    /* JADX INFO: renamed from: b */
    public <U extends Closeable> AbstractC0110a<U> m97776b(U u11) {
        return AbstractC0110a.m559q(u11, this.f97944a);
    }

    /* JADX INFO: renamed from: c */
    public <T> AbstractC0110a<T> m97777c(T t11, InterfaceC0117h<T> interfaceC0117h) {
        return AbstractC0110a.m561v(t11, interfaceC0117h, this.f97944a);
    }

    public C44315a(InterfaceC45123a interfaceC45123a) {
        this.f97944a = new a(interfaceC45123a);
    }
}
