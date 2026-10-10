package p384jx;

import com.kubi.resources.widget.wheel.view.WheelView;
import java.util.TimerTask;

/* JADX INFO: renamed from: jx.a */
/* JADX INFO: compiled from: InertiaTimerTask.java */
/* JADX INFO: loaded from: classes13.dex */
public final class C40817a extends TimerTask {

    /* JADX INFO: renamed from: b */
    public float f90670b = 2.1474836E9f;

    /* JADX INFO: renamed from: c */
    public final float f90671c;

    /* JADX INFO: renamed from: d */
    public final WheelView f90672d;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f90670b == 2.1474836E9f) {
            if (Math.abs(this.f90671c) > 2000.0f) {
                this.f90670b = this.f90671c <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f90670b = this.f90671c;
            }
        }
        if (Math.abs(this.f90670b) >= 0.0f && Math.abs(this.f90670b) <= 20.0f) {
            this.f90672d.m55603b();
            this.f90672d.getHandler().sendEmptyMessage(2000);
            return;
        }
        int i11 = (int) (this.f90670b / 100.0f);
        WheelView wheelView = this.f90672d;
        float f11 = i11;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f11);
        if (!this.f90672d.m55609h()) {
            float itemHeight = this.f90672d.getItemHeight();
            float totalScrollY = (-this.f90672d.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f90672d.getItemsCount() - 1) - this.f90672d.getInitPosition()) * itemHeight;
            double d11 = ((double) itemHeight) * 0.25d;
            if (((double) this.f90672d.getTotalScrollY()) - d11 < totalScrollY) {
                totalScrollY = this.f90672d.getTotalScrollY() + f11;
            } else if (((double) this.f90672d.getTotalScrollY()) + d11 > itemsCount) {
                itemsCount = this.f90672d.getTotalScrollY() + f11;
            }
            if (this.f90672d.getTotalScrollY() <= totalScrollY) {
                this.f90670b = 40.0f;
                this.f90672d.setTotalScrollY((int) totalScrollY);
            } else if (this.f90672d.getTotalScrollY() >= itemsCount) {
                this.f90672d.setTotalScrollY((int) itemsCount);
                this.f90670b = -40.0f;
            }
        }
        float f12 = this.f90670b;
        if (f12 < 0.0f) {
            this.f90670b = f12 + 20.0f;
        } else {
            this.f90670b = f12 - 20.0f;
        }
        this.f90672d.getHandler().sendEmptyMessage(1000);
    }

    public C40817a(WheelView wheelView, float f11) {
        this.f90672d = wheelView;
        this.f90671c = f11;
    }
}
