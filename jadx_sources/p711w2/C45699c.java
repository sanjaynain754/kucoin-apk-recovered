package p711w2;

import com.contrarywind.view.WheelView;
import java.util.TimerTask;

/* JADX INFO: renamed from: w2.c */
/* JADX INFO: compiled from: SmoothScrollTimerTask.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C45699c extends TimerTask {

    /* JADX INFO: renamed from: b */
    public int f103038b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public int f103039c = 0;

    /* JADX INFO: renamed from: d */
    public int f103040d;

    /* JADX INFO: renamed from: e */
    public final WheelView f103041e;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f103038b == Integer.MAX_VALUE) {
            this.f103038b = this.f103040d;
        }
        int i11 = this.f103038b;
        int i12 = (int) (i11 * 0.1f);
        this.f103039c = i12;
        if (i12 == 0) {
            if (i11 < 0) {
                this.f103039c = -1;
            } else {
                this.f103039c = 1;
            }
        }
        if (Math.abs(i11) <= 1) {
            this.f103041e.m6980b();
            this.f103041e.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f103041e;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f103039c);
        if (!this.f103041e.m6986h()) {
            float itemHeight = this.f103041e.getItemHeight();
            float f11 = (-this.f103041e.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f103041e.getItemsCount() - 1) - this.f103041e.getInitPosition()) * itemHeight;
            if (this.f103041e.getTotalScrollY() <= f11 || this.f103041e.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f103041e;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - this.f103039c);
                this.f103041e.m6980b();
                this.f103041e.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f103041e.getHandler().sendEmptyMessage(1000);
        this.f103038b -= this.f103039c;
    }

    public C45699c(WheelView wheelView, int i11) {
        this.f103041e = wheelView;
        this.f103040d = i11;
    }
}
