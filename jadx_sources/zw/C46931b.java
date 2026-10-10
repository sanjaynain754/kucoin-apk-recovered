package zw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Random;

/* JADX INFO: renamed from: zw.b */
/* JADX INFO: compiled from: BadgeAnimator.java */
/* JADX INFO: loaded from: classes13.dex */
public class C46931b extends ValueAnimator {

    /* JADX INFO: renamed from: b */
    public c[][] f104794b;

    /* JADX INFO: renamed from: c */
    public WeakReference<QBadgeView> f104795c;

    /* JADX INFO: renamed from: zw.b$a */
    /* JADX INFO: compiled from: BadgeAnimator.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            QBadgeView qBadgeView = (QBadgeView) C46931b.this.f104795c.get();
            if (qBadgeView == null || !qBadgeView.isShown()) {
                C46931b.this.cancel();
            } else {
                qBadgeView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: zw.b$b */
    /* JADX INFO: compiled from: BadgeAnimator.java */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            QBadgeView qBadgeView = (QBadgeView) C46931b.this.f104795c.get();
            if (qBadgeView != null) {
                qBadgeView.m55449z();
            }
        }
    }

    /* JADX INFO: renamed from: zw.b$c */
    /* JADX INFO: compiled from: BadgeAnimator.java */
    public class c {

        /* JADX INFO: renamed from: a */
        public Random f104798a;

        /* JADX INFO: renamed from: b */
        public float f104799b;

        /* JADX INFO: renamed from: c */
        public float f104800c;

        /* JADX INFO: renamed from: d */
        public float f104801d;

        /* JADX INFO: renamed from: e */
        public int f104802e;

        /* JADX INFO: renamed from: f */
        public int f104803f;

        /* JADX INFO: renamed from: g */
        public Paint f104804g;

        public c() {
            Paint paint = new Paint();
            this.f104804g = paint;
            paint.setAntiAlias(true);
            this.f104804g.setStyle(Paint.Style.FILL);
            this.f104798a = new Random();
        }

        /* JADX INFO: renamed from: a */
        public void m103403a(float f11, Canvas canvas) {
            this.f104804g.setColor(this.f104802e);
            this.f104799b += this.f104798a.nextInt(this.f104803f) * 0.1f * (this.f104798a.nextFloat() - 0.5f);
            float fNextInt = this.f104800c + (this.f104798a.nextInt(this.f104803f) * 0.1f * (this.f104798a.nextFloat() - 0.5f));
            this.f104800c = fNextInt;
            float f12 = this.f104799b;
            float f13 = this.f104801d;
            canvas.drawCircle(f12, fNextInt, f13 - (f11 * f13), this.f104804g);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m103401b(Canvas canvas) {
        for (int i11 = 0; i11 < this.f104794b.length; i11++) {
            int i12 = 0;
            while (true) {
                c[] cVarArr = this.f104794b[i11];
                if (i12 < cVarArr.length) {
                    cVarArr[i12].m103403a(Float.parseFloat(getAnimatedValue().toString()), canvas);
                    i12++;
                }
            }
        }
    }

    public C46931b(Bitmap bitmap, PointF pointF, QBadgeView qBadgeView) {
        this.f104795c = new WeakReference<>(qBadgeView);
        setFloatValues(0.0f, 1.0f);
        setDuration(500L);
        this.f104794b = m103402c(bitmap, pointF);
        addUpdateListener(new a());
        addListener(new b());
    }

    /* JADX INFO: renamed from: c */
    public final c[][] m103402c(Bitmap bitmap, PointF pointF) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float fMin = Math.min(width, height) / 6.0f;
        float width2 = pointF.x - (bitmap.getWidth() / 2.0f);
        float height2 = pointF.y - (bitmap.getHeight() / 2.0f);
        c[][] cVarArr = (c[][]) Array.newInstance((Class<?>) c.class, (int) (height / fMin), (int) (width / fMin));
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            for (int i12 = 0; i12 < cVarArr[i11].length; i12++) {
                c cVar = new c();
                float f11 = i12 * fMin;
                float f12 = i11 * fMin;
                cVar.f104802e = bitmap.getPixel((int) f11, (int) f12);
                cVar.f104799b = f11 + width2;
                cVar.f104800c = f12 + height2;
                cVar.f104801d = fMin;
                cVar.f104803f = Math.max(width, height);
                cVarArr[i11][i12] = cVar;
            }
        }
        bitmap.recycle();
        return cVarArr;
    }
}
