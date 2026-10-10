package p711w2;

import com.contrarywind.view.WheelView;
import java.util.TimerTask;

/* JADX INFO: renamed from: w2.a */
/* JADX INFO: compiled from: InertiaTimerTask.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C45697a extends TimerTask {

    /* JADX INFO: renamed from: b */
    public float f103034b = 2.1474836E9f;

    /* JADX INFO: renamed from: c */
    public final float f103035c;

    /* JADX INFO: renamed from: d */
    public final WheelView f103036d;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f103034b == 2.1474836E9f) {
            if (Math.abs(this.f103035c) > 2000.0f) {
                this.f103034b = this.f103035c <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f103034b = this.f103035c;
            }
        }
        if (Math.abs(this.f103034b) >= 0.0f && Math.abs(this.f103034b) <= 20.0f) {
            this.f103036d.m6980b();
            this.f103036d.getHandler().sendEmptyMessage(2000);
            return;
        }
        int i11 = (int) (this.f103034b / 100.0f);
        WheelView wheelView = this.f103036d;
        float f11 = i11;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f11);
        if (!this.f103036d.m6986h()) {
            float itemHeight = this.f103036d.getItemHeight();
            float totalScrollY = (-this.f103036d.getInitPosition()) * itemHeight;
            float itemsCount = ((this.f103036d.getItemsCount() - 1) - this.f103036d.getInitPosition()) * itemHeight;
            double d11 = ((double) itemHeight) * 0.25d;
            if (((double) this.f103036d.getTotalScrollY()) - d11 < totalScrollY) {
                totalScrollY = this.f103036d.getTotalScrollY() + f11;
            } else if (((double) this.f103036d.getTotalScrollY()) + d11 > itemsCount) {
                itemsCount = this.f103036d.getTotalScrollY() + f11;
            }
            if (this.f103036d.getTotalScrollY() <= totalScrollY) {
                this.f103034b = 40.0f;
                this.f103036d.setTotalScrollY((int) totalScrollY);
            } else if (this.f103036d.getTotalScrollY() >= itemsCount) {
                this.f103036d.setTotalScrollY((int) itemsCount);
                this.f103034b = -40.0f;
            }
        }
        float f12 = this.f103034b;
        if (f12 < 0.0f) {
            this.f103034b = f12 + 20.0f;
        } else {
            this.f103034b = f12 - 20.0f;
        }
        this.f103036d.getHandler().sendEmptyMessage(1000);
    }

    public C45697a(WheelView wheelView, float f11) {
        this.f103036d = wheelView;
        this.f103035c = f11;
    }
}
