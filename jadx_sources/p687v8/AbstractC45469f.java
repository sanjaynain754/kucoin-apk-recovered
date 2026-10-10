package p687v8;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hcaptcha.sdk.HCaptchaError;
import com.hcaptcha.sdk.HCaptchaException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: v8.f */
/* JADX INFO: loaded from: classes56.dex */
public abstract class AbstractC45469f<R> {

    /* JADX INFO: renamed from: a */
    public boolean f102483a;

    /* JADX INFO: renamed from: b */
    public boolean f102484b;

    /* JADX INFO: renamed from: c */
    public R f102485c;

    /* JADX INFO: renamed from: d */
    public HCaptchaException f102486d;

    /* JADX INFO: renamed from: h */
    public final Handler f102490h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList<InterfaceC45467d<R>> f102487e = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArrayList<InterfaceC45464a> f102488f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g */
    public final CopyOnWriteArrayList<InterfaceC45466c> f102489g = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g */
    public final void m100418g() {
        this.f102483a = false;
        this.f102484b = false;
        this.f102485c = null;
        this.f102486d = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m100412a(AbstractC45469f abstractC45469f) {
        Iterator<InterfaceC45464a> it = abstractC45469f.f102488f.iterator();
        while (it.hasNext()) {
            it.next().mo13945w(new HCaptchaException(HCaptchaError.TOKEN_TIMEOUT));
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC45469f<R> m100413b(@NonNull InterfaceC45464a interfaceC45464a) {
        this.f102488f.add(interfaceC45464a);
        m100422k();
        return this;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC45469f<R> m100414c(@NonNull InterfaceC45467d<R> interfaceC45467d) {
        this.f102487e.add(interfaceC45467d);
        m100422k();
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m100415d() {
        Iterator<InterfaceC45466c> it = this.f102489g.iterator();
        while (it.hasNext()) {
            it.next().mo13944u2();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public HCaptchaException m100416e() {
        return this.f102486d;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public R m100417f() {
        return this.f102485c;
    }

    /* JADX INFO: renamed from: h */
    public void m100419h(long j11) {
        this.f102490h.postDelayed(new Runnable() { // from class: v8.e
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC45469f.m100412a(this.f102482b);
            }
        }, TimeUnit.SECONDS.toMillis(j11));
    }

    /* JADX INFO: renamed from: i */
    public void m100420i(@NonNull HCaptchaException hCaptchaException) {
        this.f102486d = hCaptchaException;
        this.f102484b = false;
        this.f102483a = true;
        m100422k();
    }

    /* JADX INFO: renamed from: j */
    public void m100421j(R r11) {
        this.f102485c = r11;
        this.f102484b = true;
        this.f102483a = true;
        m100422k();
    }

    public AbstractC45469f() {
        m100418g();
    }

    /* JADX INFO: renamed from: k */
    public final void m100422k() {
        boolean z11 = false;
        if (m100417f() != null) {
            Iterator<InterfaceC45467d<R>> it = this.f102487e.iterator();
            while (it.hasNext()) {
                it.next().onSuccess(m100417f());
                z11 = true;
            }
        }
        if (m100416e() != null) {
            Iterator<InterfaceC45464a> it2 = this.f102488f.iterator();
            while (it2.hasNext()) {
                it2.next().mo13945w(m100416e());
                z11 = true;
            }
        }
        if (z11) {
            m100418g();
        }
    }
}
