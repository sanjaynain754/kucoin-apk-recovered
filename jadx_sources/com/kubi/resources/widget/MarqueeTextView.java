package com.kubi.resources.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$styleable;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import ro.C44128b;

/* JADX INFO: loaded from: classes13.dex */
public class MarqueeTextView extends BaseTextView {

    /* JADX INFO: renamed from: A */
    public boolean f43902A;

    /* JADX INFO: renamed from: B */
    public ValueAnimator f43903B;

    /* JADX INFO: renamed from: C */
    public ValueAnimator f43904C;

    /* JADX INFO: renamed from: D */
    public ValueAnimator f43905D;

    /* JADX INFO: renamed from: E */
    public ValueAnimator f43906E;

    /* JADX INFO: renamed from: F */
    public boolean f43907F;

    /* JADX INFO: renamed from: b */
    public List<? extends InterfaceC22932e> f43908b;

    /* JADX INFO: renamed from: c */
    public String f43909c;

    /* JADX INFO: renamed from: d */
    public int f43910d;

    /* JADX INFO: renamed from: e */
    public int f43911e;

    /* JADX INFO: renamed from: f */
    public int f43912f;

    /* JADX INFO: renamed from: g */
    public int f43913g;

    /* JADX INFO: renamed from: h */
    public int f43914h;

    /* JADX INFO: renamed from: i */
    public int f43915i;

    /* JADX INFO: renamed from: j */
    public int f43916j;

    /* JADX INFO: renamed from: k */
    public int f43917k;

    /* JADX INFO: renamed from: l */
    public int f43918l;

    /* JADX INFO: renamed from: m */
    public int f43919m;

    /* JADX INFO: renamed from: n */
    public int f43920n;

    /* JADX INFO: renamed from: o */
    public int f43921o;

    /* JADX INFO: renamed from: p */
    public boolean f43922p;

    /* JADX INFO: renamed from: q */
    public int f43923q;

    /* JADX INFO: renamed from: r */
    public int f43924r;

    /* JADX INFO: renamed from: s */
    public int f43925s;

    /* JADX INFO: renamed from: t */
    public int f43926t;

    /* JADX INFO: renamed from: u */
    public int f43927u;

    /* JADX INFO: renamed from: v */
    public Paint f43928v;

    /* JADX INFO: renamed from: w */
    public int f43929w;

    /* JADX INFO: renamed from: x */
    public int f43930x;

    /* JADX INFO: renamed from: y */
    public int f43931y;

    /* JADX INFO: renamed from: z */
    public boolean f43932z;

    /* JADX INFO: renamed from: com.kubi.resources.widget.MarqueeTextView$a */
    public class C22928a extends AnimatorListenerAdapter {
        public C22928a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            MarqueeTextView.this.m54682s();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.MarqueeTextView$b */
    public class C22929b extends AnimatorListenerAdapter {
        public C22929b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            MarqueeTextView.m54669f(MarqueeTextView.this);
            MarqueeTextView marqueeTextView = MarqueeTextView.this;
            marqueeTextView.f43923q = marqueeTextView.f43926t;
            MarqueeTextView.this.f43902A = false;
            MarqueeTextView.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.MarqueeTextView$c */
    public class C22930c extends AnimatorListenerAdapter {
        public C22930c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            MarqueeTextView.this.f43932z = false;
            MarqueeTextView.this.f43902A = true;
            MarqueeTextView.this.m54681r();
            MarqueeTextView.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.MarqueeTextView$d */
    public class C22931d extends AnimatorListenerAdapter {
        public C22931d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            MarqueeTextView.this.f43932z = false;
            MarqueeTextView.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.MarqueeTextView$e */
    public interface InterfaceC22932e {
        String getDisplayString();
    }

    public MarqueeTextView(Context context) {
        super(context);
        this.f43908b = new ArrayList();
        this.f43909c = "";
        this.f43910d = 500;
        this.f43911e = 2000;
        this.f43912f = 500;
        this.f43913g = 500;
        this.f43920n = -1;
        this.f43921o = 100;
        this.f43922p = false;
        this.f43923q = 0;
        this.f43924r = 0;
        this.f43925s = 0;
        this.f43926t = 0;
        this.f43927u = 0;
        this.f43930x = 0;
        this.f43931y = 0;
        this.f43932z = false;
        this.f43902A = false;
        this.f43907F = false;
        m54675l();
    }

    /* JADX INFO: renamed from: p */
    public final void m54679p() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43906E = valueAnimatorOfFloat;
        int i11 = this.f43916j;
        int i12 = this.f43925s;
        int i13 = this.f43921o;
        if ((i11 * i12) / i13 < 0) {
            this.f43932z = false;
            return;
        }
        valueAnimatorOfFloat.setDuration((this.f43917k * i12) / i13);
        this.f43906E.setInterpolator(new LinearInterpolator());
        this.f43906E.start();
        this.f43906E.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.resources.widget.p1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MarqueeTextView.m54666c(this.f45015b, valueAnimator);
            }
        });
        this.f43906E.addListener(new C22931d());
    }

    /* JADX INFO: renamed from: q */
    public final void m54680q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43905D = valueAnimatorOfFloat;
        int i11 = this.f43916j;
        int i12 = this.f43925s;
        int i13 = this.f43921o;
        if ((i11 * i12) / i13 < 0) {
            this.f43932z = false;
            return;
        }
        valueAnimatorOfFloat.setDuration((i11 * i12) / i13);
        this.f43905D.setInterpolator(new LinearInterpolator());
        this.f43905D.start();
        this.f43905D.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.resources.widget.n1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MarqueeTextView.m54665b(this.f44999b, valueAnimator);
            }
        });
        this.f43905D.addListener(new C22930c());
    }

    /* JADX INFO: renamed from: r */
    public final void m54681r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43904C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f43915i);
        this.f43904C.setInterpolator(new LinearInterpolator());
        this.f43904C.start();
        this.f43904C.addListener(new C22928a());
    }

    /* JADX INFO: renamed from: s */
    public final void m54682s() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43903B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f43914h);
        this.f43903B.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f43903B.start();
        this.f43903B.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.resources.widget.o1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MarqueeTextView.m54667d(this.f45010b, valueAnimator);
            }
        });
        this.f43903B.addListener(new C22929b());
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m54669f(MarqueeTextView marqueeTextView) {
        int i11 = marqueeTextView.f43927u;
        marqueeTextView.f43927u = i11 + 1;
        return i11;
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: l */
    private void m54675l() {
        Paint paint = new Paint();
        this.f43928v = paint;
        paint.setAntiAlias(true);
        this.f43928v.setDither(true);
        this.f43928v.setTextSize(this.f43921o);
        this.f43928v.setColor(this.f43920n);
        this.f43928v.setTypeface(ResourcesCompat.getFont(getContext(), R$font.medium));
    }

    @Deprecated
    public InterfaceC22932e getCurrentIndex() {
        try {
            return this.f43908b.get(this.f43927u);
        } catch (Exception e11) {
            C44128b.m97264h(e11);
            return this.f43908b.get(0);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m54677n() {
        ValueAnimator valueAnimator = this.f43903B;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        ValueAnimator valueAnimator2 = this.f43904C;
        if (valueAnimator2 != null) {
            valueAnimator2.pause();
        }
        ValueAnimator valueAnimator3 = this.f43905D;
        if (valueAnimator3 != null) {
            valueAnimator3.pause();
        }
        ValueAnimator valueAnimator4 = this.f43906E;
        if (valueAnimator4 != null) {
            valueAnimator4.pause();
        }
        this.f43907F = true;
    }

    /* JADX INFO: renamed from: o */
    public void m54678o() {
        ValueAnimator valueAnimator = this.f43903B;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
        ValueAnimator valueAnimator2 = this.f43904C;
        if (valueAnimator2 != null) {
            valueAnimator2.resume();
        }
        ValueAnimator valueAnimator3 = this.f43905D;
        if (valueAnimator3 != null) {
            valueAnimator3.resume();
        }
        ValueAnimator valueAnimator4 = this.f43906E;
        if (valueAnimator4 != null) {
            valueAnimator4.resume();
        }
        this.f43907F = false;
    }

    public void setContentColor(int i11) {
        this.f43920n = i11;
        this.f43928v.setColor(i11);
    }

    public void setContentList(@NotNull List<? extends InterfaceC22932e> list) {
        this.f43908b = list;
        if (list.size() == 1) {
            setSingleText(list.get(0).getDisplayString());
        } else {
            requestLayout();
            postInvalidate();
        }
    }

    public void setContentTextSize(int i11) {
        this.f43921o = i11;
        this.f43928v.setTextSize(i11);
    }

    public void setHorizontalScrollSpeed(int i11) {
        this.f43916j = i11;
        postInvalidate();
    }

    public void setSingleText(String str) {
        this.f43909c = str;
        requestLayout();
    }

    public void setVerticalSwitchInterval(int i11) {
        this.f43915i = i11;
        postInvalidate();
    }

    public void setVerticalSwitchSpeed(int i11) {
        this.f43914h = i11;
        postInvalidate();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m54665b(MarqueeTextView marqueeTextView, ValueAnimator valueAnimator) {
        marqueeTextView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (marqueeTextView.getLayoutDirection() == 1) {
            marqueeTextView.f43924r = (int) (marqueeTextView.f43925s * fFloatValue);
        } else {
            marqueeTextView.f43924r = (int) ((-marqueeTextView.f43925s) * fFloatValue);
        }
        marqueeTextView.postInvalidate();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m54666c(MarqueeTextView marqueeTextView, ValueAnimator valueAnimator) {
        marqueeTextView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (marqueeTextView.getLayoutDirection() == 1) {
            marqueeTextView.f43924r = (int) (marqueeTextView.f43925s * fFloatValue);
        } else {
            marqueeTextView.f43924r = (int) ((-marqueeTextView.f43925s) * fFloatValue);
        }
        marqueeTextView.postInvalidate();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m54667d(MarqueeTextView marqueeTextView, ValueAnimator valueAnimator) {
        marqueeTextView.getClass();
        marqueeTextView.f43923q = (int) (marqueeTextView.f43926t - ((((Float) valueAnimator.getAnimatedValue()).floatValue() * marqueeTextView.f43918l) * 1.0f));
        marqueeTextView.postInvalidate();
    }

    /* JADX INFO: renamed from: m */
    public final void m54676m(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MarqueeTextView);
        this.f43914h = typedArrayObtainStyledAttributes.getInt(R$styleable.MarqueeTextView_vertical_switch_speed, this.f43910d);
        this.f43915i = typedArrayObtainStyledAttributes.getInt(R$styleable.MarqueeTextView_vertical_switch_interval, this.f43911e);
        this.f43916j = typedArrayObtainStyledAttributes.getInt(R$styleable.MarqueeTextView_horizontal_scroll_speed, this.f43912f);
        this.f43917k = typedArrayObtainStyledAttributes.getInt(R$styleable.MarqueeTextView_horizontal_loop_speed, this.f43913g);
        this.f43920n = typedArrayObtainStyledAttributes.getColor(R$styleable.MarqueeTextView_content_text_color, ViewCompat.MEASURED_STATE_MASK);
        this.f43921o = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.MarqueeTextView_content_text_size, C5275i0.m6241f(15.0f));
        this.f43909c = typedArrayObtainStyledAttributes.getString(R$styleable.MarqueeTextView_content_single_text);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<? extends InterfaceC22932e> list = this.f43908b;
        if (list != null && list.size() > 1) {
            if (this.f43927u >= this.f43908b.size()) {
                this.f43927u = 0;
            }
            this.f43918l = getMeasuredHeight();
            this.f43919m = getMeasuredWidth();
            String displayString = this.f43908b.get(this.f43927u).getDisplayString();
            int i11 = this.f43927u;
            int i12 = i11 + 1;
            if (i11 + 1 >= this.f43908b.size()) {
                i12 = 0;
            }
            String displayString2 = this.f43908b.get(i12).getDisplayString();
            Rect rect = new Rect();
            this.f43928v.getTextBounds(displayString, 0, displayString.length(), rect);
            int iWidth = rect.width();
            this.f43929w = iWidth;
            this.f43925s = iWidth - this.f43919m;
            Paint.FontMetrics fontMetrics = this.f43928v.getFontMetrics();
            int i13 = (this.f43918l / 2) + (this.f43931y / 4) + (((int) (((-fontMetrics.ascent) - fontMetrics.descent) / 2.0f)) / 4);
            this.f43926t = i13;
            if (!this.f43922p) {
                this.f43922p = true;
                this.f43923q = i13;
            }
            int i14 = this.f43925s;
            if (i14 > 0) {
                this.f43925s = i14 + (this.f43921o * 2);
                if (!this.f43932z && !this.f43902A) {
                    this.f43932z = true;
                    m54680q();
                    this.f43924r = 0;
                }
            } else if (!this.f43902A) {
                this.f43902A = true;
                m54681r();
                this.f43924r = 0;
            }
            if (getLayoutDirection() == 1) {
                canvas.drawText(displayString, this.f43924r - this.f43925s, this.f43923q, this.f43928v);
                Rect rect2 = new Rect();
                this.f43928v.getTextBounds(displayString2, 0, displayString2.length(), rect2);
                int iWidth2 = rect2.width();
                this.f43929w = iWidth2;
                int i15 = iWidth2 - this.f43919m;
                if (i15 > 0) {
                    i15 += this.f43921o * 2;
                }
                canvas.drawText(displayString2, -i15, this.f43923q + this.f43918l, this.f43928v);
                return;
            }
            canvas.drawText(displayString, this.f43924r, this.f43923q, this.f43928v);
            canvas.drawText(displayString2, 0.0f, this.f43923q + this.f43918l, this.f43928v);
            return;
        }
        if (!TextUtils.isEmpty(this.f43909c)) {
            this.f43918l = getMeasuredHeight();
            this.f43919m = getMeasuredWidth();
            Rect rect3 = new Rect();
            Paint paint = this.f43928v;
            String str = this.f43909c;
            paint.getTextBounds(str, 0, str.length(), rect3);
            int iWidth3 = rect3.width();
            this.f43929w = iWidth3;
            this.f43925s = iWidth3 - this.f43919m;
            Paint.FontMetrics fontMetrics2 = this.f43928v.getFontMetrics();
            this.f43926t = (this.f43918l / 2) + (this.f43931y / 4) + (((int) (((-fontMetrics2.ascent) - fontMetrics2.descent) / 2.0f)) / 4);
            if (!this.f43922p) {
                this.f43922p = true;
                this.f43924r = 0;
            }
            int i16 = this.f43925s;
            if (i16 > 0) {
                this.f43925s = i16 + (this.f43921o * 2);
                if (!this.f43932z) {
                    this.f43932z = true;
                    this.f43924r = 0;
                    m54679p();
                }
            } else {
                this.f43924r = 0;
            }
            canvas.drawText(this.f43909c, this.f43924r, this.f43926t, this.f43928v);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f43919m = getMeasuredWidth();
        this.f43918l = getMeasuredHeight();
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i12);
        List<? extends InterfaceC22932e> list = this.f43908b;
        if (list != null && list.size() > 0) {
            for (int i13 = 0; i13 < this.f43908b.size(); i13++) {
                String displayString = this.f43908b.get(i13).getDisplayString();
                Rect rect = new Rect();
                this.f43928v.getTextBounds(displayString, 0, displayString.length(), rect);
                int iWidth = rect.width();
                this.f43931y = Math.max(this.f43931y, rect.height());
                this.f43930x = Math.max(this.f43930x, iWidth);
            }
        } else if (!TextUtils.isEmpty(this.f43909c)) {
            Rect rect2 = new Rect();
            Paint paint = this.f43928v;
            String str = this.f43909c;
            paint.getTextBounds(str, 0, str.length(), rect2);
            this.f43930x = rect2.width();
            this.f43931y = rect2.height();
        }
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (mode == 1073741824) {
            setMeasuredDimension(size, this.f43931y);
        } else if (mode2 == 1073741824) {
            setMeasuredDimension(this.f43930x, size2);
        } else {
            setMeasuredDimension(this.f43930x, this.f43931y);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43908b = new ArrayList();
        this.f43909c = "";
        this.f43910d = 500;
        this.f43911e = 2000;
        this.f43912f = 500;
        this.f43913g = 500;
        this.f43920n = -1;
        this.f43921o = 100;
        this.f43922p = false;
        this.f43923q = 0;
        this.f43924r = 0;
        this.f43925s = 0;
        this.f43926t = 0;
        this.f43927u = 0;
        this.f43930x = 0;
        this.f43931y = 0;
        this.f43932z = false;
        this.f43902A = false;
        this.f43907F = false;
        m54676m(attributeSet);
        m54675l();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f43908b = new ArrayList();
        this.f43909c = "";
        this.f43910d = 500;
        this.f43911e = 2000;
        this.f43912f = 500;
        this.f43913g = 500;
        this.f43920n = -1;
        this.f43921o = 100;
        this.f43922p = false;
        this.f43923q = 0;
        this.f43924r = 0;
        this.f43925s = 0;
        this.f43926t = 0;
        this.f43927u = 0;
        this.f43930x = 0;
        this.f43931y = 0;
        this.f43932z = false;
        this.f43902A = false;
        this.f43907F = false;
        m54676m(attributeSet);
        m54675l();
    }
}
