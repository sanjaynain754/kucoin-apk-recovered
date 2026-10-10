package p384jx;

import android.os.Handler;
import android.os.Message;
import com.kubi.resources.widget.wheel.view.WheelView;

/* JADX INFO: renamed from: jx.b */
/* JADX INFO: compiled from: MessageHandler.java */
/* JADX INFO: loaded from: classes13.dex */
public final class HandlerC40818b extends Handler {

    /* JADX INFO: renamed from: a */
    public final WheelView f90673a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 1000) {
            this.f90673a.invalidate();
        } else if (i11 == 2000) {
            this.f90673a.m55618q(WheelView.ACTION.FLING);
        } else {
            if (i11 != 3000) {
                return;
            }
            this.f90673a.m55614m();
        }
    }

    public HandlerC40818b(WheelView wheelView) {
        this.f90673a = wheelView;
    }
}
