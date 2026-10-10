package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$styleable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: VerticalDashedLineView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/resources/widget/VerticalDashedLineView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mPaint", "Landroid/graphics/Paint;", "mPath", "Landroid/graphics/Path;", "mDashGap", "", "mDashWidth", "mStrokeWidth", "mDashColor", "initAttrs", "", "init", "onDraw", "canvas", "Landroid/graphics/Canvas;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nVerticalDashedLineView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerticalDashedLineView.kt\ncom/kubi/resources/widget/VerticalDashedLineView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,76:1\n52#2,9:77\n*S KotlinDebug\n*F\n+ 1 VerticalDashedLineView.kt\ncom/kubi/resources/widget/VerticalDashedLineView\n*L\n40#1:77,9\n*E\n"})
public final class VerticalDashedLineView extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f44205b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Path f44206c;

    /* JADX INFO: renamed from: d */
    public float f44207d;

    /* JADX INFO: renamed from: e */
    public float f44208e;

    /* JADX INFO: renamed from: f */
    public float f44209f;

    /* JADX INFO: renamed from: g */
    public int f44210g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalDashedLineView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalDashedLineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final void m54928a() {
        this.f44205b.setStyle(Paint.Style.STROKE);
        this.f44205b.setStrokeWidth(this.f44209f);
        this.f44205b.setColor(this.f44210g);
        this.f44205b.setPathEffect(new DashPathEffect(new float[]{this.f44208e, this.f44207d}, 0.0f));
        this.f44205b.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth() / 2;
        this.f44206c.moveTo(width, 0.0f);
        this.f44206c.lineTo(width, getHeight());
        canvas.drawPath(this.f44206c, this.f44205b);
    }

    public /* synthetic */ VerticalDashedLineView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: b */
    public final void m54929b(AttributeSet attributeSet) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] VerticalDashedLineView = R$styleable.VerticalDashedLineView;
        Intrinsics.checkNotNullExpressionValue(VerticalDashedLineView, "VerticalDashedLineView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalDashedLineView, 0, 0);
        this.f44207d = typedArrayObtainStyledAttributes.getDimension(R$styleable.VerticalDashedLineView_dashGap, C5275i0.m6236a(1.0f));
        this.f44208e = typedArrayObtainStyledAttributes.getDimension(R$styleable.VerticalDashedLineView_dashWidth, C5275i0.m6236a(4.0f));
        this.f44209f = typedArrayObtainStyledAttributes.getDimension(R$styleable.VerticalDashedLineView_strokeWidth, C5275i0.m6236a(4.0f));
        this.f44210g = typedArrayObtainStyledAttributes.getColor(R$styleable.VerticalDashedLineView_dashColor, ContextCompat.getColor(getContext(), R$color.c_large));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalDashedLineView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44205b = new Paint();
        this.f44206c = new Path();
        this.f44210g = -1;
        m54929b(attributeSet);
        m54928a();
    }
}
