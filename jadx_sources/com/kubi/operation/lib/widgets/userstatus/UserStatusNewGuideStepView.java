package com.kubi.operation.lib.widgets.userstatus;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.operation.lib.R$color;
import com.kubi.operation.lib.R$drawable;
import com.kubi.operation.lib.R$font;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: UserStatusNewGuideStepView.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001FB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010)\u001a\u00020*2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010'2\b\u0010,\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0007J\u0018\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H\u0014J\u0010\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\u0007H\u0016J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u000206H\u0014J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u00108\u001a\u00020\u0007H\u0002J\u001e\u00109\u001a\u00020*2\u0006\u00105\u001a\u0002062\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100'H\u0002J(\u0010;\u001a\u00020*2\u0006\u00105\u001a\u0002062\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020(H\u0002J(\u0010?\u001a\u00020*2\u0006\u00105\u001a\u0002062\u0006\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020(2\u0006\u0010@\u001a\u00020AH\u0002J \u0010B\u001a\u00020*2\u0006\u00105\u001a\u0002062\u0006\u0010C\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u0007H\u0002J\u0018\u0010E\u001a\u00020*2\u0006\u00105\u001a\u0002062\u0006\u0010C\u001a\u00020\u0010H\u0002R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusNewGuideStepView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "steps", "", "", "selectedIndex", "viewHeight", "labelTop", "", "labelLineHeight", "markerCenterY", "markerRadius", "checkIconSize", "dashedLineGap", "stepGap", "selectedTextColor", "normalTextColor", "selectedMarkerColor", "normalMarkerColor", "lineColor", "regularTypeface", "Landroid/graphics/Typeface;", "mediumTypeface", "textPaint", "Landroid/text/TextPaint;", "markerPaint", "Landroid/graphics/Paint;", "linePaint", "checkDrawable", "Landroid/graphics/drawable/Drawable;", "stepLayouts", "", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusNewGuideStepView$StepLayout;", "setSteps", "", "stepList", "currentIndex", "(Ljava/util/List;Ljava/lang/Integer;)V", "setSelectedIndex", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRtlPropertiesChanged", ViewProps.LAYOUT_DIRECTION, "onDraw", "canvas", "Landroid/graphics/Canvas;", "buildStepLayouts", "measuredWidth", "drawConnectors", "centers", "drawStep", "index", "title", "stepLayout", "drawLabel", "isSelected", "", "drawCircle", "centerX", "color", "drawCheck", "StepLayout", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserStatusNewGuideStepView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserStatusNewGuideStepView.kt\ncom/kubi/operation/lib/widgets/userstatus/UserStatusNewGuideStepView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,249:1\n1563#2:250\n1634#2,3:251\n1878#2,3:254\n1573#2:257\n1604#2,4:258\n1563#2:262\n1634#2,3:263\n1869#2,2:266\n*S KotlinDebug\n*F\n+ 1 UserStatusNewGuideStepView.kt\ncom/kubi/operation/lib/widgets/userstatus/UserStatusNewGuideStepView\n*L\n139#1:250\n139#1:251,3\n140#1:254,3\n157#1:257\n157#1:258,4\n167#1:262\n167#1:263,3\n183#1:266,2\n*E\n"})
public final class UserStatusNewGuideStepView extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<String> f36966b;

    /* JADX INFO: renamed from: c */
    public int f36967c;

    /* JADX INFO: renamed from: d */
    public final int f36968d;

    /* JADX INFO: renamed from: e */
    public final float f36969e;

    /* JADX INFO: renamed from: f */
    public final float f36970f;

    /* JADX INFO: renamed from: g */
    public final float f36971g;

    /* JADX INFO: renamed from: h */
    public final float f36972h;

    /* JADX INFO: renamed from: i */
    public final int f36973i;

    /* JADX INFO: renamed from: j */
    public final float f36974j;

    /* JADX INFO: renamed from: k */
    public final float f36975k;

    /* JADX INFO: renamed from: l */
    public final int f36976l;

    /* JADX INFO: renamed from: m */
    public final int f36977m;

    /* JADX INFO: renamed from: n */
    public final int f36978n;

    /* JADX INFO: renamed from: o */
    public final int f36979o;

    /* JADX INFO: renamed from: p */
    public final int f36980p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final Typeface f36981q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final Typeface f36982r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final TextPaint f36983s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final Paint f36984t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final Paint f36985u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public final Drawable f36986v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public List<StepLayout> f36987w;

    /* JADX INFO: renamed from: com.kubi.operation.lib.widgets.userstatus.UserStatusNewGuideStepView$a, reason: from toString */
    /* JADX INFO: compiled from: UserStatusNewGuideStepView.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusNewGuideStepView$StepLayout;", "", "centerX", "", "textWidth", "<init>", "(FF)V", "getCenterX", "()F", "getTextWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class StepLayout {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final float centerX;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final float textWidth;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepLayout)) {
                return false;
            }
            StepLayout stepLayout = (StepLayout) other;
            return Float.compare(this.centerX, stepLayout.centerX) == 0 && Float.compare(this.textWidth, stepLayout.textWidth) == 0;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getCenterX() {
            return this.centerX;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getTextWidth() {
            return this.textWidth;
        }

        public int hashCode() {
            return (Float.hashCode(this.centerX) * 31) + Float.hashCode(this.textWidth);
        }

        @NotNull
        public String toString() {
            return "StepLayout(centerX=" + this.centerX + ", textWidth=" + this.textWidth + ')';
        }

        public StepLayout(float f11, float f12) {
            this.centerX = f11;
            this.textWidth = f12;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserStatusNewGuideStepView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserStatusNewGuideStepView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final List<StepLayout> m43810a(int i11) {
        if (this.f36966b.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        float paddingLeft = getPaddingLeft();
        float paddingRight = i11 - getPaddingRight();
        float f11 = paddingRight - paddingLeft;
        if (f11 <= 0.0f) {
            return CollectionsKt.emptyList();
        }
        int i12 = 0;
        float fCoerceAtLeast = RangesKt.coerceAtLeast((f11 - (this.f36975k * RangesKt.coerceAtLeast(this.f36966b.size() - 1, 0))) / this.f36966b.size(), 0.0f);
        List<String> list = this.f36966b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            this.f36983s.setTypeface(i12 == this.f36967c ? this.f36982r : this.f36981q);
            arrayList.add(Float.valueOf(RangesKt.coerceAtMost(this.f36983s.measureText(str), fCoerceAtLeast)));
            i12 = i13;
        }
        float fCoerceAtLeast2 = this.f36966b.size() > 1 ? RangesKt.coerceAtLeast((f11 - CollectionsKt.sumOfFloat(arrayList)) / (this.f36966b.size() - 1), this.f36975k) : 0.0f;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        float f12 = paddingLeft;
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            float f13 = (fFloatValue / 2.0f) + f12;
            f12 += fFloatValue + fCoerceAtLeast2;
            if (getLayoutDirection() == 1) {
                f13 = paddingRight - (f13 - paddingLeft);
            }
            arrayList2.add(new StepLayout(f13, fFloatValue));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public final void m43811b(Canvas canvas, float f11) {
        Drawable drawable = this.f36986v;
        if (drawable == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f11 - (this.f36973i / 2.0f), (getPaddingTop() + this.f36971g) - (this.f36973i / 2.0f));
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: c */
    public final void m43812c(Canvas canvas, float f11, int i11) {
        this.f36984t.setColor(i11);
        canvas.drawCircle(f11, getPaddingTop() + this.f36971g, this.f36972h, this.f36984t);
    }

    /* JADX INFO: renamed from: e */
    public final void m43814e(Canvas canvas, String str, StepLayout stepLayout, boolean z11) {
        this.f36983s.setColor(z11 ? this.f36976l : this.f36977m);
        this.f36983s.setTypeface(z11 ? this.f36982r : this.f36981q);
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(str, this.f36983s, stepLayout.getTextWidth(), TextUtils.TruncateAt.END);
        Paint.FontMetrics fontMetrics = this.f36983s.getFontMetrics();
        canvas.drawText(charSequenceEllipsize.toString(), stepLayout.getCenterX(), getPaddingTop() + this.f36969e + (((this.f36970f - fontMetrics.descent) - fontMetrics.ascent) / 2.0f), this.f36983s);
    }

    /* JADX INFO: renamed from: f */
    public final void m43815f(Canvas canvas, int i11, String str, StepLayout stepLayout) {
        boolean z11 = i11 == this.f36967c;
        m43814e(canvas, str, stepLayout, z11);
        if (i11 < this.f36967c) {
            m43811b(canvas, stepLayout.getCenterX());
        } else if (z11) {
            m43812c(canvas, stepLayout.getCenterX(), this.f36978n);
        } else {
            m43812c(canvas, stepLayout.getCenterX(), this.f36979o);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m43816g(@Nullable List<String> list, @Nullable Integer num) {
        if (list == null || list.isEmpty()) {
            C27046k.m66700o(this);
            return;
        }
        C27046k.m66685H(this);
        int iIntValue = (num == null || num.intValue() > list.size() + (-1) || num.intValue() < 0) ? 0 : num.intValue();
        this.f36966b.clear();
        this.f36966b.addAll(list);
        this.f36967c = iIntValue;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.f36966b.isEmpty() && this.f36987w.size() == this.f36966b.size()) {
            List<StepLayout> list = this.f36987w;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(((StepLayout) it.next()).getCenterX()));
            }
            m43813d(canvas, arrayList);
            int i11 = 0;
            for (Object obj : this.f36966b) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                m43815f(canvas, i11, (String) obj, this.f36987w.get(i11));
                i11 = i12;
            }
        }
    }

    public final void setSelectedIndex(int currentIndex) {
        this.f36967c = RangesKt.coerceIn(currentIndex, 0, RangesKt.coerceAtLeast(this.f36966b.size() - 1, 0));
        invalidate();
    }

    public /* synthetic */ UserStatusNewGuideStepView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public final void m43813d(Canvas canvas, List<Float> list) {
        Canvas canvas2;
        if (list.size() >= 2) {
            for (List list2 : CollectionsKt.windowed$default(list, 2, 1, false, 4, null)) {
                float fMin = Math.min(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue()) + this.f36974j;
                float fMax = Math.max(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue()) - this.f36974j;
                if (fMax > fMin) {
                    canvas2 = canvas;
                    canvas2.drawLine(fMin, getPaddingTop() + this.f36971g, fMax, getPaddingTop() + this.f36971g, this.f36985u);
                } else {
                    canvas2 = canvas;
                }
                canvas = canvas2;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iResolveSize = View.resolveSize(getPaddingTop() + this.f36968d + getPaddingBottom(), heightMeasureSpec);
        int iResolveSize2 = View.resolveSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        setMeasuredDimension(iResolveSize2, iResolveSize);
        this.f36987w = m43810a(iResolveSize2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserStatusNewGuideStepView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36966b = new ArrayList();
        this.f36968d = C27040e.m66658b(45);
        this.f36969e = C27040e.m66658b(4);
        this.f36970f = C27040e.m66658b(17);
        this.f36971g = C27040e.m66658b(28);
        this.f36972h = C27040e.m66658b(3);
        int iM66658b = C27040e.m66658b(12);
        this.f36973i = iM66658b;
        this.f36974j = C27040e.m66658b(9);
        this.f36975k = C27040e.m66658b(6);
        int i12 = R$color.c_text;
        this.f36976l = ContextCompat.getColor(context, i12);
        this.f36977m = ContextCompat.getColor(context, R$color.c_text40);
        this.f36978n = ContextCompat.getColor(context, i12);
        int i13 = R$color.c_text30;
        this.f36979o = ContextCompat.getColor(context, i13);
        int color = ContextCompat.getColor(context, i13);
        this.f36980p = color;
        Typeface font = ResourcesCompat.getFont(context, R$font.regular);
        this.f36981q = font;
        this.f36982r = ResourcesCompat.getFont(context, R$font.medium);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(C27040e.m66659c(12.0f));
        textPaint.setTypeface(font);
        this.f36983s = textPaint;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f36984t = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(color);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(C27040e.m66658b(1));
        paint2.setPathEffect(new DashPathEffect(new float[]{C27040e.m66658b(3), C27040e.m66658b(2)}, 0.0f));
        this.f36985u = paint2;
        Drawable drawable = ContextCompat.getDrawable(context, R$drawable.ic2_smallhook2_12);
        if (drawable != null) {
            drawable.setBounds(0, 0, iM66658b, iM66658b);
            drawable.setTint(ContextCompat.getColor(context, i13));
        } else {
            drawable = null;
        }
        this.f36986v = drawable;
        this.f36987w = CollectionsKt.emptyList();
        setWillNotDraw(false);
    }
}
