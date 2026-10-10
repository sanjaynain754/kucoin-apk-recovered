package cy;

import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: cy.c */
/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes39.dex */
public class C36556c {

    /* JADX INFO: renamed from: d */
    public static volatile int f79393d;

    /* JADX INFO: renamed from: a */
    public final int f79394a = m81824a();

    /* JADX INFO: renamed from: b */
    public final Intent f79395b;

    /* JADX INFO: renamed from: c */
    public final WeakReference<InterfaceC36555b> f79396c;

    /* JADX INFO: renamed from: a */
    public static synchronized int m81824a() {
        if ((f79393d & SupportMenu.CATEGORY_MASK) == 0) {
            int i11 = f79393d;
            f79393d = i11 + 1;
            return i11;
        }
        f79393d = 0;
        return f79393d;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public Intent m81825b() {
        return this.f79395b;
    }

    /* JADX INFO: renamed from: c */
    public int m81826c() {
        return this.f79394a;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC36555b m81827d() {
        return this.f79396c.get();
    }

    public C36556c(Intent intent, InterfaceC36555b interfaceC36555b) {
        this.f79395b = intent;
        this.f79396c = new WeakReference<>(interfaceC36555b);
    }
}
