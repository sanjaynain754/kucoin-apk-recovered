package n10;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: n10.b */
/* JADX INFO: compiled from: LinearGradientFontSpan.java */
/* JADX INFO: loaded from: classes43.dex */
public class C42700b extends AbstractC42699a {

    /* JADX INFO: renamed from: c */
    public int f94509c;

    /* JADX INFO: renamed from: d */
    public int[] f94510d;

    /* JADX INFO: renamed from: e */
    public float[] f94511e;

    @Override // n10.AbstractC42699a
    /* JADX INFO: renamed from: b */
    public void mo93588b(@NonNull Canvas canvas, @NonNull Paint paint, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15) {
        paint.setShader(this.f94509c == 1 ? new LinearGradient(0.0f, 0.0f, 0.0f, paint.descent() - paint.ascent(), this.f94510d, this.f94511e, Shader.TileMode.REPEAT) : new LinearGradient(f11, 0.0f, f11 + m93587a(), 0.0f, this.f94510d, this.f94511e, Shader.TileMode.REPEAT));
        canvas.drawText(charSequence, i11, i12, f11, i14, paint);
    }

    /* JADX INFO: renamed from: d */
    public C42700b m93590d(int[] iArr) {
        this.f94510d = iArr;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C42700b m93591e(int i11) {
        this.f94509c = i11;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C42700b m93592f(float[] fArr) {
        this.f94511e = fArr;
        return this;
    }
}
