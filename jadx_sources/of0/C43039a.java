package of0;

import androidx.annotation.NonNull;
import cf0.InterfaceC4964s;
import java.util.ArrayList;
import java.util.List;
import lh0.InterfaceC42224a;

/* JADX INFO: renamed from: of0.a */
/* JADX INFO: compiled from: SimpleExtBuilder.java */
/* JADX INFO: loaded from: classes60.dex */
public class C43039a {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC42224a> f95223a = new ArrayList(2);

    /* JADX INFO: renamed from: b */
    public boolean f95224b;

    /* JADX INFO: renamed from: c */
    public final void m94525c() {
        if (this.f95224b) {
            throw new IllegalStateException("SimpleExtBuilder is already built, do not mutate SimpleExtPlugin after configuration is finished");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m94523a(int i11, char c11, char c12, @NonNull InterfaceC4964s interfaceC4964s) {
        m94525c();
        this.f95223a.add(new C43040b(c11, c12, i11, interfaceC4964s));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public List<InterfaceC42224a> m94524b() {
        m94525c();
        this.f95224b = true;
        return this.f95223a;
    }
}
