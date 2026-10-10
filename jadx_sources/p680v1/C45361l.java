package p680v1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: v1.l */
/* JADX INFO: compiled from: ResourceRecycler.java */
/* JADX INFO: loaded from: classes.dex */
public class C45361l {

    /* JADX INFO: renamed from: a */
    public boolean f101984a;

    /* JADX INFO: renamed from: b */
    public final Handler f101985b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: v1.l$a */
    /* JADX INFO: compiled from: ResourceRecycler.java */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC45359j) message.obj).recycle();
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m100265a(InterfaceC45359j<?> interfaceC45359j, boolean z11) {
        try {
            if (this.f101984a || z11) {
                this.f101985b.obtainMessage(1, interfaceC45359j).sendToTarget();
            } else {
                this.f101984a = true;
                interfaceC45359j.recycle();
                this.f101984a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
