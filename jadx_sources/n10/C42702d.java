package n10;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: n10.d */
/* JADX INFO: compiled from: StrokeFontSpan.java */
/* JADX INFO: loaded from: classes43.dex */
public class C42702d extends AbstractC42699a {

    /* JADX INFO: renamed from: c */
    public final Paint f94514c = new Paint();

    /* JADX INFO: renamed from: d */
    public int f94515d;

    /* JADX INFO: renamed from: e */
    public int f94516e;

    @Override // n10.AbstractC42699a
    /* JADX INFO: renamed from: b */
    public void mo93588b(@NonNull Canvas canvas, @NonNull Paint paint, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15) {
        this.f94514c.set(paint);
        this.f94514c.setAntiAlias(true);
        this.f94514c.setDither(true);
        this.f94514c.setTextSize(paint.getTextSize());
        this.f94514c.setStrokeWidth(this.f94516e);
        this.f94514c.setStyle(Paint.Style.STROKE);
        this.f94514c.setColor(this.f94515d);
        canvas.drawText(charSequence, i11, i12, f11, i14, this.f94514c);
    }

    /* JADX INFO: renamed from: d */
    public C42702d m93593d(int i11) {
        this.f94515d = i11;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C42702d m93594e(int i11) {
        this.f94516e = i11;
        return this;
    }

    @Override // n10.AbstractC42699a
    /* JADX INFO: renamed from: c */
    public float mo93589c(@NonNull Paint paint, @Nullable Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, int i11, int i12) {
        return super.mo93589c(paint, fontMetricsInt, charSequence, i11, i12);
    }
}
