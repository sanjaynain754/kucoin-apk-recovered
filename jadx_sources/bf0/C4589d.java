package bf0;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: bf0.d */
/* JADX INFO: compiled from: ThreadLocalContextStorage.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C4589d extends C4587b.g {

    /* JADX INFO: renamed from: a */
    public static final Logger f4094a = Logger.getLogger(C4589d.class.getName());

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<C4587b> f4095b = new ThreadLocal<>();

    @Override // bf0.C4587b.g
    /* JADX INFO: renamed from: b */
    public C4587b mo4471b() {
        C4587b c4587b = f4095b.get();
        return c4587b == null ? C4587b.f4069i : c4587b;
    }

    @Override // bf0.C4587b.g
    /* JADX INFO: renamed from: c */
    public void mo4472c(C4587b c4587b, C4587b c4587b2) {
        if (mo4471b() != c4587b) {
            f4094a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c4587b2 != C4587b.f4069i) {
            f4095b.set(c4587b2);
        } else {
            f4095b.set(null);
        }
    }

    @Override // bf0.C4587b.g
    /* JADX INFO: renamed from: d */
    public C4587b mo4473d(C4587b c4587b) {
        C4587b c4587bMo4471b = mo4471b();
        f4095b.set(c4587b);
        return c4587bMo4471b;
    }
}
