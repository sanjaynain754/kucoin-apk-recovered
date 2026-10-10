package p616s4;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: s4.a */
/* JADX INFO: compiled from: GestureDetector.java */
/* JADX INFO: loaded from: classes34.dex */
public class C44311a {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public a f97935a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final float f97936b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public boolean f97937c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public boolean f97938d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public long f97939e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public float f97940f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public float f97941g;

    /* JADX INFO: renamed from: s4.a$a */
    /* JADX INFO: compiled from: GestureDetector.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo94310a();
    }

    /* JADX INFO: renamed from: a */
    public void m97761a() {
        this.f97935a = null;
        m97764e();
    }

    /* JADX INFO: renamed from: e */
    public void m97764e() {
        this.f97937c = false;
        this.f97938d = false;
    }

    /* JADX INFO: renamed from: c */
    public static C44311a m97760c(Context context) {
        return new C44311a(context);
    }

    /* JADX INFO: renamed from: b */
    public boolean m97762b() {
        return this.f97937c;
    }

    /* JADX INFO: renamed from: f */
    public void m97765f(a aVar) {
        this.f97935a = aVar;
    }

    public C44311a(Context context) {
        this.f97936b = ViewConfiguration.get(context).getScaledTouchSlop();
        m97761a();
    }

    /* JADX INFO: renamed from: d */
    public boolean m97763d(MotionEvent motionEvent) {
        a aVar;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.f97937c = false;
                        this.f97938d = false;
                    }
                } else if (Math.abs(motionEvent.getX() - this.f97940f) > this.f97936b || Math.abs(motionEvent.getY() - this.f97941g) > this.f97936b) {
                    this.f97938d = false;
                }
            } else {
                this.f97937c = false;
                if (Math.abs(motionEvent.getX() - this.f97940f) > this.f97936b || Math.abs(motionEvent.getY() - this.f97941g) > this.f97936b) {
                    this.f97938d = false;
                }
                if (this.f97938d && motionEvent.getEventTime() - this.f97939e <= ViewConfiguration.getLongPressTimeout() && (aVar = this.f97935a) != null) {
                    aVar.mo94310a();
                }
                this.f97938d = false;
            }
        } else {
            this.f97937c = true;
            this.f97938d = true;
            this.f97939e = motionEvent.getEventTime();
            this.f97940f = motionEvent.getX();
            this.f97941g = motionEvent.getY();
        }
        return true;
    }
}
