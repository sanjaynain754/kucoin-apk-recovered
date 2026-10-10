package p711w2;

import android.os.Handler;
import android.os.Message;
import com.contrarywind.view.WheelView;

/* JADX INFO: renamed from: w2.b */
/* JADX INFO: compiled from: MessageHandler.java */
/* JADX INFO: loaded from: classes34.dex */
public final class HandlerC45698b extends Handler {

    /* JADX INFO: renamed from: a */
    public final WheelView f103037a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 1000) {
            this.f103037a.invalidate();
        } else if (i11 == 2000) {
            this.f103037a.m6995q(WheelView.ACTION.FLING);
        } else {
            if (i11 != 3000) {
                return;
            }
            this.f103037a.m6991m();
        }
    }

    public HandlerC45698b(WheelView wheelView) {
        this.f103037a = wheelView;
    }
}
