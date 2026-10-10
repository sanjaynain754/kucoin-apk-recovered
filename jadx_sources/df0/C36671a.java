package df0;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import java.util.Arrays;
import java.util.Locale;
import qf0.AbstractC43726a;
import qf0.C43727b;

/* JADX INFO: renamed from: df0.a */
/* JADX INFO: compiled from: MarkwonTheme.java */
/* JADX INFO: loaded from: classes60.dex */
public class C36671a {

    /* JADX INFO: renamed from: x */
    public static final float[] f79493x = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: a */
    public final int f79494a;

    /* JADX INFO: renamed from: b */
    public final boolean f79495b;

    /* JADX INFO: renamed from: c */
    public final int f79496c;

    /* JADX INFO: renamed from: d */
    public final int f79497d;

    /* JADX INFO: renamed from: e */
    public final int f79498e;

    /* JADX INFO: renamed from: f */
    public final int f79499f;

    /* JADX INFO: renamed from: g */
    public final int f79500g;

    /* JADX INFO: renamed from: h */
    public final int f79501h;

    /* JADX INFO: renamed from: i */
    public final int f79502i;

    /* JADX INFO: renamed from: j */
    public final int f79503j;

    /* JADX INFO: renamed from: k */
    public final int f79504k;

    /* JADX INFO: renamed from: l */
    public final int f79505l;

    /* JADX INFO: renamed from: m */
    public final int f79506m;

    /* JADX INFO: renamed from: n */
    public final Typeface f79507n;

    /* JADX INFO: renamed from: o */
    public final Typeface f79508o;

    /* JADX INFO: renamed from: p */
    public final int f79509p;

    /* JADX INFO: renamed from: q */
    public final int f79510q;

    /* JADX INFO: renamed from: r */
    public final int f79511r;

    /* JADX INFO: renamed from: s */
    public final int f79512s;

    /* JADX INFO: renamed from: t */
    public final Typeface f79513t;

    /* JADX INFO: renamed from: u */
    public final float[] f79514u;

    /* JADX INFO: renamed from: v */
    public final int f79515v;

    /* JADX INFO: renamed from: w */
    public final int f79516w;

    /* JADX INFO: renamed from: df0.a$a */
    /* JADX INFO: compiled from: MarkwonTheme.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f79517a;

        /* JADX INFO: renamed from: c */
        public int f79519c;

        /* JADX INFO: renamed from: d */
        public int f79520d;

        /* JADX INFO: renamed from: e */
        public int f79521e;

        /* JADX INFO: renamed from: f */
        public int f79522f;

        /* JADX INFO: renamed from: g */
        public int f79523g;

        /* JADX INFO: renamed from: h */
        public int f79524h;

        /* JADX INFO: renamed from: i */
        public int f79525i;

        /* JADX INFO: renamed from: j */
        public int f79526j;

        /* JADX INFO: renamed from: k */
        public int f79527k;

        /* JADX INFO: renamed from: l */
        public int f79528l;

        /* JADX INFO: renamed from: m */
        public int f79529m;

        /* JADX INFO: renamed from: n */
        public Typeface f79530n;

        /* JADX INFO: renamed from: o */
        public Typeface f79531o;

        /* JADX INFO: renamed from: p */
        public int f79532p;

        /* JADX INFO: renamed from: q */
        public int f79533q;

        /* JADX INFO: renamed from: s */
        public int f79535s;

        /* JADX INFO: renamed from: t */
        public Typeface f79536t;

        /* JADX INFO: renamed from: u */
        public float[] f79537u;

        /* JADX INFO: renamed from: v */
        public int f79538v;

        /* JADX INFO: renamed from: b */
        public boolean f79518b = true;

        /* JADX INFO: renamed from: r */
        public int f79534r = -1;

        /* JADX INFO: renamed from: w */
        public int f79539w = -1;

        @NonNull
        /* JADX INFO: renamed from: A */
        public a m82094A(@Px int i11) {
            this.f79523g = i11;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: B */
        public a m82095B(@Px int i11) {
            this.f79524h = i11;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: C */
        public a m82096C(@Px int i11) {
            this.f79529m = i11;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: D */
        public a m82097D(@Px int i11) {
            this.f79534r = i11;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: E */
        public a m82098E(@Px int i11) {
            this.f79539w = i11;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: x */
        public a m82099x(@Px int i11) {
            this.f79519c = i11;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: y */
        public a m82100y(@Px int i11) {
            this.f79520d = i11;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: z */
        public C36671a m82101z() {
            return new C36671a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82057a(@NonNull Paint paint) {
        int iM96336a = this.f79498e;
        if (iM96336a == 0) {
            iM96336a = AbstractC43726a.m96336a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iM96336a);
    }

    /* JADX INFO: renamed from: b */
    public void m82058b(@NonNull Paint paint) {
        int i11 = this.f79503j;
        if (i11 == 0) {
            i11 = this.f79502i;
        }
        if (i11 != 0) {
            paint.setColor(i11);
        }
        Typeface typeface = this.f79508o;
        if (typeface == null) {
            typeface = this.f79507n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i12 = this.f79510q;
            if (i12 <= 0) {
                i12 = this.f79509p;
            }
            if (i12 > 0) {
                paint.setTextSize(i12);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i13 = this.f79510q;
        if (i13 <= 0) {
            i13 = this.f79509p;
        }
        if (i13 > 0) {
            paint.setTextSize(i13);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m82059c(@NonNull Paint paint) {
        int i11 = this.f79502i;
        if (i11 != 0) {
            paint.setColor(i11);
        }
        Typeface typeface = this.f79507n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i12 = this.f79509p;
            if (i12 > 0) {
                paint.setTextSize(i12);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i13 = this.f79509p;
        if (i13 > 0) {
            paint.setTextSize(i13);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m82060d(@NonNull Paint paint) {
        int iM96336a = this.f79512s;
        if (iM96336a == 0) {
            iM96336a = AbstractC43726a.m96336a(paint.getColor(), 75);
        }
        paint.setColor(iM96336a);
        paint.setStyle(Paint.Style.FILL);
        int i11 = this.f79511r;
        if (i11 >= 0) {
            paint.setStrokeWidth(i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m82061e(@NonNull Paint paint, @IntRange(from = 1, m1553to = 6) int i11) {
        Typeface typeface = this.f79513t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.f79514u;
        if (fArr == null) {
            fArr = f79493x;
        }
        if (fArr == null || fArr.length < i11) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i11), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i11 - 1]);
    }

    /* JADX INFO: renamed from: f */
    public void m82062f(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.f79495b);
        int i11 = this.f79494a;
        if (i11 != 0) {
            textPaint.setColor(i11);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m82063g(@NonNull Paint paint) {
        int color = this.f79499f;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(color);
        int i11 = this.f79500g;
        if (i11 != 0) {
            paint.setStrokeWidth(i11);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m82064h(@NonNull Paint paint) {
        int iM96336a = this.f79515v;
        if (iM96336a == 0) {
            iM96336a = AbstractC43726a.m96336a(paint.getColor(), 25);
        }
        paint.setColor(iM96336a);
        paint.setStyle(Paint.Style.FILL);
        int i11 = this.f79516w;
        if (i11 >= 0) {
            paint.setStrokeWidth(i11);
        }
    }

    /* JADX INFO: renamed from: j */
    public int m82065j() {
        return this.f79496c;
    }

    /* JADX INFO: renamed from: k */
    public int m82066k() {
        int i11 = this.f79497d;
        return i11 == 0 ? (int) ((this.f79496c * 0.25f) + 0.5f) : i11;
    }

    /* JADX INFO: renamed from: l */
    public int m82067l(int i11) {
        int iMin = Math.min(this.f79496c, i11) / 2;
        int i12 = this.f79501h;
        return (i12 == 0 || i12 > iMin) ? iMin : i12;
    }

    /* JADX INFO: renamed from: m */
    public int m82068m(@NonNull Paint paint) {
        int i11 = this.f79504k;
        return i11 != 0 ? i11 : AbstractC43726a.m96336a(paint.getColor(), 25);
    }

    /* JADX INFO: renamed from: n */
    public int m82069n(@NonNull Paint paint) {
        int i11 = this.f79505l;
        if (i11 == 0) {
            i11 = this.f79504k;
        }
        return i11 != 0 ? i11 : AbstractC43726a.m96336a(paint.getColor(), 25);
    }

    /* JADX INFO: renamed from: o */
    public int m82070o() {
        return this.f79506m;
    }

    public C36671a(@NonNull a aVar) {
        this.f79494a = aVar.f79517a;
        this.f79495b = aVar.f79518b;
        this.f79496c = aVar.f79519c;
        this.f79497d = aVar.f79520d;
        this.f79498e = aVar.f79521e;
        this.f79499f = aVar.f79522f;
        this.f79500g = aVar.f79523g;
        this.f79501h = aVar.f79524h;
        this.f79502i = aVar.f79525i;
        this.f79503j = aVar.f79526j;
        this.f79504k = aVar.f79527k;
        this.f79505l = aVar.f79528l;
        this.f79506m = aVar.f79529m;
        this.f79507n = aVar.f79530n;
        this.f79508o = aVar.f79531o;
        this.f79509p = aVar.f79532p;
        this.f79510q = aVar.f79533q;
        this.f79511r = aVar.f79534r;
        this.f79512s = aVar.f79535s;
        this.f79513t = aVar.f79536t;
        this.f79514u = aVar.f79537u;
        this.f79515v = aVar.f79538v;
        this.f79516w = aVar.f79539w;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static a m82056i(@NonNull Context context) {
        C43727b c43727bM96337a = C43727b.m96337a(context);
        return new a().m82096C(c43727bM96337a.m96338b(8)).m82099x(c43727bM96337a.m96338b(24)).m82100y(c43727bM96337a.m96338b(4)).m82094A(c43727bM96337a.m96338b(1)).m82097D(c43727bM96337a.m96338b(1)).m82098E(c43727bM96337a.m96338b(4));
    }
}
