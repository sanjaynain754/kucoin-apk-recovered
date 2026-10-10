package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.kubi.sdk.res.R$style;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.core.C27029c;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StepView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 <2\u00020\u0001:\u0001<B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\fJ\u0018\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fH\u0014J\u0010\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.H\u0014J\u000e\u0010/\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001eJ@\u00100\u001a\u00020#2\u0006\u0010-\u001a\u00020.2\u0006\u0010&\u001a\u00020\f2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0002J0\u00107\u001a\u00020#2\u0006\u0010-\u001a\u00020.2\u0006\u0010&\u001a\u00020\f2\u0006\u00108\u001a\u0002052\u0006\u00109\u001a\u0002052\u0006\u0010:\u001a\u000205H\u0002J\b\u0010;\u001a\u00020\u001eH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\f0 j\b\u0012\u0004\u0012\u00020\f`!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b(\u0010\u000f¨\u0006="}, m90084d2 = {"Lcom/kubi/resources/widget/StepView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mSteps", "", "", "value", "", "currentStep", "getCurrentStep", "()I", "mCircleColor", "mStrokeColor", "mTextColor", "mUnTextColor", "mSelectedColor", "mFillRadius", "mStrokeWidth", "mLineWidth", "mDrawablePadding", "mPaint", "Landroid/graphics/Paint;", "mPath", "Landroid/graphics/Path;", "isDrawText", "", "hasSelectedSteps", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setSteps", "", "steps", "selectedStep", "step", "stepCount", "getStepCount", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setDrawText", "drawableStep", "halfFontHeightOffset", "fontHeight", "bigRadius", "circleCenterX", "", "circleCenterY", "drawableLine", "startX", "endX", "centerY", "isRtl", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StepView extends View {

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Companion f44055q = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<String> f44056b;

    /* JADX INFO: renamed from: c */
    public int f44057c;

    /* JADX INFO: renamed from: d */
    public final int f44058d;

    /* JADX INFO: renamed from: e */
    public final int f44059e;

    /* JADX INFO: renamed from: f */
    public final int f44060f;

    /* JADX INFO: renamed from: g */
    public final int f44061g;

    /* JADX INFO: renamed from: h */
    public final int f44062h;

    /* JADX INFO: renamed from: i */
    public final int f44063i;

    /* JADX INFO: renamed from: j */
    public final int f44064j;

    /* JADX INFO: renamed from: k */
    public final int f44065k;

    /* JADX INFO: renamed from: l */
    public final int f44066l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Paint f44067m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Path f44068n;

    /* JADX INFO: renamed from: o */
    public boolean f44069o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public ArrayList<Integer> f44070p;

    /* JADX INFO: compiled from: StepView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/resources/widget/StepView$Companion;", "", "<init>", "()V", "START_STEP", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m54784d(int i11) {
        if (i11 < 1) {
            i11 = 1;
        } else if (i11 > this.f44056b.size()) {
            i11 = this.f44056b.size();
        }
        this.f44057c = i11;
        this.f44070p.add(Integer.valueOf(i11));
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44056b = new ArrayList();
        this.f44057c = 1;
        this.f44069o = true;
        this.f44070p = new ArrayList<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StepView, 0, R$style.StepView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f44058d = typedArrayObtainStyledAttributes.getColor(R$styleable.StepView_svCircleColor, 0);
        this.f44059e = typedArrayObtainStyledAttributes.getColor(R$styleable.StepView_svStrokeColor, 0);
        this.f44060f = typedArrayObtainStyledAttributes.getColor(R$styleable.StepView_svTextColor, 0);
        this.f44061g = typedArrayObtainStyledAttributes.getColor(R$styleable.StepView_svUnTextColor, 0);
        this.f44062h = typedArrayObtainStyledAttributes.getColor(R$styleable.StepView_svSelectedColor, 0);
        this.f44063i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.StepView_svFillRadius, 0);
        this.f44064j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.StepView_svStrokeWidth, 0);
        this.f44065k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.StepView_svLineWidth, 0);
        this.f44066l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.StepView_svDrawablePadding, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.StepView_svTextSize, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(5);
        this.f44067m = paint;
        paint.setTextSize(dimensionPixelSize);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f44068n = new Path();
        if (isInEditMode()) {
            setSteps(CollectionsKt.mutableListOf("Step 1", "Step 2", "Step 3", "Step 4", "Step 5"));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m54781a(Canvas canvas, int i11, float f11, float f12, float f13) {
        this.f44067m.setColor(this.f44057c > i11 ? this.f44062h : this.f44058d);
        this.f44067m.setStyle(Paint.Style.STROKE);
        this.f44067m.setStrokeWidth(this.f44065k);
        this.f44067m.setPathEffect(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
        this.f44068n.reset();
        this.f44068n.moveTo(m54783c() ? (getWidth() - f11) - C27029c.m66601d(this, 8) : C27029c.m66601d(this, 8) + f11, f13);
        this.f44068n.lineTo(m54783c() ? (getWidth() - f12) + C27029c.m66601d(this, 8) : f12 - C27029c.m66601d(this, 8), f13);
        canvas.drawPath(this.f44068n, this.f44067m);
    }

    /* JADX INFO: renamed from: b */
    public final void m54782b(Canvas canvas, int i11, int i12, int i13, int i14, float f11, float f12) {
        String str = this.f44056b.get(i11 - 1);
        boolean zContains = this.f44070p.contains(Integer.valueOf(i11));
        this.f44067m.setPathEffect(null);
        if (zContains) {
            this.f44067m.setStyle(Paint.Style.FILL);
            this.f44067m.setColor(this.f44062h);
            canvas.drawCircle(f11, f12, i14, this.f44067m);
        } else {
            this.f44067m.setStrokeWidth(this.f44064j);
            this.f44067m.setStyle(Paint.Style.STROKE);
            this.f44067m.setColor(this.f44059e);
            canvas.drawCircle(f11, f12, this.f44063i + (this.f44064j / 2), this.f44067m);
            this.f44067m.setColor(this.f44058d);
            this.f44067m.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f11, f12, this.f44063i, this.f44067m);
        }
        this.f44067m.setFakeBoldText(true);
        this.f44067m.setColor(zContains ? this.f44060f : this.f44061g);
        canvas.drawText(String.valueOf(i11), f11, i12 + f12, this.f44067m);
        this.f44067m.setFakeBoldText(false);
        if (this.f44069o) {
            canvas.drawText(str, f11, f12 + i14 + this.f44066l + (i13 / 2), this.f44067m);
        }
    }

    /* JADX INFO: renamed from: getCurrentStep, reason: from getter */
    public final int getF44057c() {
        return this.f44057c;
    }

    public final int getStepCount() {
        return this.f44056b.size();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int i11;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int size = this.f44056b.size();
        if (size == 0) {
            return;
        }
        int width = getWidth();
        float fAscent = this.f44067m.ascent();
        float fDescent = this.f44067m.descent();
        int iCeil = (int) Math.ceil(fDescent - fAscent);
        int i12 = ((int) (-(fAscent + fDescent))) / 2;
        int i13 = this.f44064j + this.f44063i;
        float paddingTop = getPaddingTop() + i13;
        int i14 = size - 1;
        int i15 = width / (i14 == 0 ? 1 : i14);
        if (1 <= size) {
            int i16 = 1;
            while (true) {
                if (i16 == 1) {
                    float f11 = ((i15 * i16) - i15) + i13;
                    if (m54783c()) {
                        f11 = width - f11;
                    }
                    m54782b(canvas, i16, i12, iCeil, i13, f11, paddingTop);
                } else if (i16 == size) {
                    float f12 = ((i15 * i16) - i15) - i13;
                    if (m54783c()) {
                        f12 = width - f12;
                    }
                    m54782b(canvas, i16, i12, iCeil, i13, f12, paddingTop);
                } else {
                    float f13 = (i15 * i16) - i15;
                    if (m54783c()) {
                        f13 = width - f13;
                    }
                    m54782b(canvas, i16, i12, iCeil, i13, f13, paddingTop);
                }
                i11 = i13;
                if (i16 == size) {
                    break;
                }
                i16++;
                i13 = i11;
            }
        } else {
            i11 = i13;
        }
        for (int i17 = 1; i17 < size; i17++) {
            if (i17 == 1) {
                m54781a(canvas, i17, ((i15 * i17) - i15) + (i11 * 2), (((i17 + 1) * i15) - i15) - i11, paddingTop);
            } else if (i17 == i14) {
                m54781a(canvas, i17, ((i15 * i17) - i15) + i11, (((i17 + 1) * i15) - i15) - (i11 * 2), paddingTop);
            } else {
                m54781a(canvas, i17, ((i15 * i17) - i15) + i11, (((i17 + 1) * i15) - i15) - i11, paddingTop);
            }
        }
    }

    public final void setDrawText(boolean isDrawText) {
        this.f44069o = isDrawText;
    }

    public final void setSteps(@NotNull List<String> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f44056b.clear();
        this.f44056b.addAll(steps);
        m54784d(1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m54783c() {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE) {
            int iCeil = (int) Math.ceil(this.f44067m.descent() - this.f44067m.ascent());
            int paddingTop = getPaddingTop() + getPaddingBottom() + ((this.f44063i + this.f44064j) * 2) + this.f44066l;
            if (!this.f44069o) {
                iCeil = 0;
            }
            size2 = paddingTop + iCeil;
        }
        setMeasuredDimension(size, size2);
    }
}
