package com.kubi.resources.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.shimmer.mask.SkeletonShimmerDirection;
import com.kubi.sdk.res.R$styleable;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p213dw.C36985a;
import p213dw.InterfaceC36986b;
import p242ew.AbstractC37270d;
import p242ew.C37273g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SkeletonLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0010J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J0\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0014J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\tH\u0014J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0014H\u0016J\b\u0010$\u001a\u00020\u0017H\u0014J\b\u0010%\u001a\u00020\u0017H\u0014J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0014J\b\u0010)\u001a\u00020\u0017H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\t8WX\u0096\u000f¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0018\u0010/\u001a\u000200X\u0096\u000f¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00105\u001a\u00020\tX\u0096\u000f¢\u0006\f\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\u001a\u00108\u001a\u00020\t8WX\u0096\u000f¢\u0006\f\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u0018\u0010;\u001a\u00020<X\u0096\u000f¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0018\u0010A\u001a\u00020BX\u0096\u000f¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006G"}, m90084d2 = {"Lcom/kubi/resources/shimmer/SkeletonLayout;", "Landroid/widget/FrameLayout;", "Lcom/kubi/resources/shimmer/Skeleton;", "Lcom/kubi/resources/shimmer/SkeletonStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "originView", "Landroid/view/View;", "config", "Lcom/kubi/resources/shimmer/SkeletonConfig;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;Lcom/kubi/resources/shimmer/SkeletonConfig;)V", "(Landroid/view/View;Lcom/kubi/resources/shimmer/SkeletonConfig;)V", "mask", "Lcom/kubi/resources/shimmer/mask/SkeletonMask;", "isSkeleton", "", "isRendered", "showOriginal", "", "showSkeleton", ViewProps.ON_LAYOUT, "changed", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "onVisibilityChanged", "changedView", "visibility", "onWindowFocusChanged", "hasWindowFocus", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "invalidateMask", "maskColor", "getMaskColor", "()I", "setMaskColor", "(I)V", "maskCornerRadius", "", "getMaskCornerRadius", "()F", "setMaskCornerRadius", "(F)V", "shimmerAngle", "getShimmerAngle", "setShimmerAngle", "shimmerColor", "getShimmerColor", "setShimmerColor", "shimmerDirection", "Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;", "getShimmerDirection", "()Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;", "setShimmerDirection", "(Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;)V", "shimmerDurationInMillis", "", "getShimmerDurationInMillis", "()J", "setShimmerDurationInMillis", "(J)V", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSkeletonLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkeletonLayout.kt\ncom/kubi/resources/shimmer/SkeletonLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1#2:149\n1869#3,2:150\n1869#3,2:152\n*S KotlinDebug\n*F\n+ 1 SkeletonLayout.kt\ncom/kubi/resources/shimmer/SkeletonLayout\n*L\n62#1:150,2\n74#1:152,2\n*E\n"})
public class SkeletonLayout extends FrameLayout implements InterfaceC36986b {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SkeletonConfig f43690b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AbstractC37270d f43691c;

    /* JADX INFO: renamed from: d */
    public boolean f43692d;

    /* JADX INFO: renamed from: e */
    public boolean f43693e;

    /* JADX INFO: renamed from: com.kubi.resources.shimmer.SkeletonLayout$2 */
    /* JADX INFO: compiled from: SkeletonLayout.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C229102 extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        public C229102(Object obj) {
            super(0, obj, SkeletonLayout.class, "invalidateMask", "invalidateMask()V", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((SkeletonLayout) this.receiver).m54394c();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SkeletonLayout(@NotNull Context context) {
        this(context, null, 0, null, null, 30, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public void m54395d() {
        this.f43692d = false;
        if (getChildCount() > 0) {
            Iterator<T> it = C36985a.m82807e(this).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(0);
            }
            AbstractC37270d abstractC37270d = this.f43691c;
            if (abstractC37270d != null) {
                abstractC37270d.stop();
            }
            this.f43691c = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SkeletonLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final void m54394c() {
        if (!this.f43693e) {
            C36985a.m82805c("Skipping invalidation until view is rendered");
            return;
        }
        AbstractC37270d abstractC37270d = this.f43691c;
        if (abstractC37270d != null) {
            abstractC37270d.stop();
        }
        this.f43691c = null;
        if (this.f43692d) {
            if (getWidth() <= 0 || getHeight() <= 0) {
                C36985a.m82805c("Failed to mask view with invalid width and height");
                return;
            }
            C37273g c37273g = new C37273g(this, this.f43690b.m54378c(), this.f43690b.m54381f(), this.f43690b.m54383h(), this.f43690b.m54382g(), this.f43690b.m54380e());
            c37273g.m83431s(this, getMaskCornerRadius());
            this.f43691c = c37273g;
        }
    }

    @ColorInt
    public int getMaskColor() {
        return this.f43690b.m54378c();
    }

    public float getMaskCornerRadius() {
        return this.f43690b.m54379d();
    }

    public int getShimmerAngle() {
        return this.f43690b.m54380e();
    }

    @ColorInt
    public int getShimmerColor() {
        return this.f43690b.m54381f();
    }

    @NotNull
    public SkeletonShimmerDirection getShimmerDirection() {
        return this.f43690b.m54382g();
    }

    public long getShimmerDurationInMillis() {
        return this.f43690b.m54383h();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        AbstractC37270d abstractC37270d = this.f43691c;
        if (abstractC37270d != null) {
            abstractC37270d.m83421i(canvas);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        AbstractC37270d abstractC37270d = this.f43691c;
        if (abstractC37270d != null) {
            abstractC37270d.invalidate();
        }
    }

    public void setMaskColor(int i11) {
        this.f43690b.m54386k(i11);
    }

    public void setMaskCornerRadius(float f11) {
        this.f43690b.m54387l(f11);
    }

    public void setShimmerAngle(int i11) {
        this.f43690b.m54388m(i11);
    }

    public void setShimmerColor(int i11) {
        this.f43690b.m54389n(i11);
    }

    public void setShimmerDirection(@NotNull SkeletonShimmerDirection skeletonShimmerDirection) {
        Intrinsics.checkNotNullParameter(skeletonShimmerDirection, "<set-?>");
        this.f43690b.m54390o(skeletonShimmerDirection);
    }

    public void setShimmerDurationInMillis(long j11) {
        this.f43690b.m54391p(j11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SkeletonLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p213dw.InterfaceC36987c
    /* JADX INFO: renamed from: a */
    public void mo54393a() {
        if (C22911a.m54401f()) {
            this.f43692d = true;
            if (this.f43693e) {
                if (getChildCount() > 0) {
                    Iterator<T> it = C36985a.m82807e(this).iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setVisibility(4);
                    }
                    setWillNotDraw(false);
                    m54394c();
                    AbstractC37270d abstractC37270d = this.f43691c;
                    if (abstractC37270d != null) {
                        abstractC37270d.invalidate();
                        return;
                    }
                    return;
                }
                C36985a.m82805c("No views to mask");
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f43693e) {
            m54394c();
            AbstractC37270d abstractC37270d = this.f43691c;
            if (abstractC37270d != null) {
                abstractC37270d.start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC37270d abstractC37270d = this.f43691c;
        if (abstractC37270d != null) {
            abstractC37270d.stop();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.f43693e = true;
        if (this.f43692d) {
            mo54393a();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus) {
            AbstractC37270d abstractC37270d = this.f43691c;
            if (abstractC37270d != null) {
                abstractC37270d.start();
                return;
            }
            return;
        }
        if (!hasWindowFocus) {
            AbstractC37270d abstractC37270d2 = this.f43691c;
            if (abstractC37270d2 != null) {
                abstractC37270d2.stop();
                return;
            }
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ SkeletonLayout(Context context, AttributeSet attributeSet, int i11, View view, SkeletonConfig skeletonConfig, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : view, (i12 & 16) != 0 ? SkeletonConfig.Companion.create$default(SkeletonConfig.f43680h, context, 0.0f, 2, null) : skeletonConfig);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SkeletonLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, @Nullable View view, @NotNull SkeletonConfig config) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f43690b = config;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SkeletonLayout, i11, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            setMaskColor(typedArrayObtainStyledAttributes.getColor(R$styleable.SkeletonLayout_skeleton_maskColor, getMaskColor()));
            setMaskCornerRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SkeletonLayout_skeleton_maskCornerRadius, (int) getMaskCornerRadius()));
            setShimmerColor(typedArrayObtainStyledAttributes.getColor(R$styleable.SkeletonLayout_skeleton_shimmerColor, getShimmerColor()));
            setShimmerDurationInMillis(typedArrayObtainStyledAttributes.getInt(R$styleable.SkeletonLayout_skeleton_shimmerDuration, (int) getShimmerDurationInMillis()));
            SkeletonShimmerDirection skeletonShimmerDirectionValueOf = SkeletonShimmerDirection.INSTANCE.valueOf(typedArrayObtainStyledAttributes.getInt(R$styleable.SkeletonLayout_skeleton_shimmerDirection, getShimmerDirection().ordinal()));
            setShimmerDirection(skeletonShimmerDirectionValueOf == null ? SkeletonShimmerDirection.LEFT_TO_RIGHT : skeletonShimmerDirectionValueOf);
            setShimmerAngle(typedArrayObtainStyledAttributes.getInt(R$styleable.SkeletonLayout_skeleton_shimmerAngle, getShimmerAngle()));
            typedArrayObtainStyledAttributes.recycle();
        }
        config.m54377b(new C229102(this));
        if (view != null) {
            addView(view);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SkeletonLayout(@NotNull View originView, @NotNull SkeletonConfig config) {
        Intrinsics.checkNotNullParameter(originView, "originView");
        Intrinsics.checkNotNullParameter(config, "config");
        Context context = originView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this(context, null, 0, originView, config);
    }
}
