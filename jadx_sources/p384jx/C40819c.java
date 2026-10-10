package p384jx;

import com.kubi.resources.widget.wheel.view.WheelView;
import java.util.TimerTask;

/* JADX INFO: renamed from: jx.c */
/* JADX INFO: compiled from: SmoothScrollTimerTask.java */
/* JADX INFO: loaded from: classes13.dex */
public final class C40819c extends TimerTask {

    /* JADX INFO: renamed from: b */
    public int f90674b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public int f90675c = 0;

    /* JADX INFO: renamed from: d */
    public int f90676d;

    /* JADX INFO: renamed from: e */
    public final WheelView f90677e;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f90674b == Integer.MAX_VALUE) {
            this.f90674b = this.f90676d;
        }
        int i11 = this.f90674b;
        int i12 = (int) (i11 * 0.1f);
        this.f90675c = i12;
        if (i12 == 0) {
            if (i11 < 0) {
                this.f90675c = -1;
            } else {
                this.f90675c = 1;
            }
        }
        if (Math.abs(i11) <= 1) {
            this.f90677e.m55603b();
            this.f90677e.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f90677e;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f90675c);
        if (!this.f90677e.m55609h()) {
            float itemHeight = this.f90677e.getItemHeight();
            float f11 = (-this.f90677e.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f90677e.getItemsCount() - 1) - this.f90677e.getInitPosition()) * itemHeight;
            if (this.f90677e.getTotalScrollY() <= f11 || this.f90677e.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f90677e;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - this.f90675c);
                this.f90677e.m55603b();
                this.f90677e.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f90677e.getHandler().sendEmptyMessage(1000);
        this.f90674b -= this.f90675c;
    }

    public C40819c(WheelView wheelView, int i11) {
        this.f90677e = wheelView;
        this.f90676d = i11;
    }
}
