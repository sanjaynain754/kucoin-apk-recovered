package p462n4;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import java.util.ArrayList;

/* JADX INFO: renamed from: n4.b */
/* JADX INFO: compiled from: DeferredReleaserConcurrentImpl.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42744b extends AbstractC42743a {

    /* JADX INFO: renamed from: b */
    public final Object f94690b = new Object();

    /* JADX INFO: renamed from: f */
    public final Runnable f94694f = new a();

    /* JADX INFO: renamed from: d */
    public ArrayList<AbstractC42743a.a> f94692d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ArrayList<AbstractC42743a.a> f94693e = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final Handler f94691c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n4.b$a */
    /* JADX INFO: compiled from: DeferredReleaserConcurrentImpl.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @MainThread
        public void run() {
            synchronized (C42744b.this.f94690b) {
                ArrayList arrayList = C42744b.this.f94693e;
                C42744b c42744b = C42744b.this;
                c42744b.f94693e = c42744b.f94692d;
                C42744b.this.f94692d = arrayList;
            }
            int size = C42744b.this.f94693e.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((AbstractC42743a.a) C42744b.this.f94693e.get(i11)).release();
            }
            C42744b.this.f94693e.clear();
        }
    }

    @Override // p462n4.AbstractC42743a
    @AnyThread
    /* JADX INFO: renamed from: a */
    public void mo93664a(AbstractC42743a.a aVar) {
        synchronized (this.f94690b) {
            this.f94692d.remove(aVar);
        }
    }

    @Override // p462n4.AbstractC42743a
    @AnyThread
    /* JADX INFO: renamed from: d */
    public void mo93665d(AbstractC42743a.a aVar) {
        if (!AbstractC42743a.m93663c()) {
            aVar.release();
            return;
        }
        synchronized (this.f94690b) {
            try {
                if (this.f94692d.contains(aVar)) {
                    return;
                }
                this.f94692d.add(aVar);
                boolean z11 = true;
                if (this.f94692d.size() != 1) {
                    z11 = false;
                }
                if (z11) {
                    this.f94691c.post(this.f94694f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
