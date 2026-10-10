package com.kubi.quotefacade.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p241ev.C37266a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NoScrollQuoteViewPager.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J0\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0014J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/quotefacade/view/NoScrollQuoteViewPager;", "Lcom/kubi/resources/widget/CustomViewPager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TAG", "", "startX", "", "startY", "left", "right", ViewProps.TOP, ViewProps.BOTTOM, "scaledTouchSlop", "", "slidingTabLayout", "Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", ViewProps.ON_LAYOUT, "", "changed", CmcdData.Factory.STREAM_TYPE_LIVE, "t", "r", "b", "findChildView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNoScrollQuoteViewPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoScrollQuoteViewPager.kt\ncom/kubi/quotefacade/view/NoScrollQuoteViewPager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,99:1\n1#2:100\n45#3,7:101\n*S KotlinDebug\n*F\n+ 1 NoScrollQuoteViewPager.kt\ncom/kubi/quotefacade/view/NoScrollQuoteViewPager\n*L\n77#1:101,7\n*E\n"})
public final class NoScrollQuoteViewPager extends CustomViewPager {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f42743i;

    /* JADX INFO: renamed from: j */
    public float f42744j;

    /* JADX INFO: renamed from: k */
    public float f42745k;

    /* JADX INFO: renamed from: l */
    public float f42746l;

    /* JADX INFO: renamed from: m */
    public float f42747m;

    /* JADX INFO: renamed from: n */
    public float f42748n;

    /* JADX INFO: renamed from: o */
    public float f42749o;

    /* JADX INFO: renamed from: p */
    public final int f42750p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public SlidingTabLayout f42751q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoScrollQuoteViewPager(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42743i = "NoScrollQuoteViewPager";
        this.f42750p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: g */
    private final void m53316g(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                if (Intrinsics.areEqual(childAt.getClass(), SlidingTabLayout.class)) {
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) childAt;
                    this.f42751q = slidingTabLayout;
                    Float fValueOf = Float.valueOf(slidingTabLayout.getLeft());
                    if (fValueOf.floatValue() <= 0.0f) {
                        fValueOf = null;
                    }
                    this.f42746l = fValueOf != null ? fValueOf.floatValue() : this.f42746l;
                    Float fValueOf2 = Float.valueOf(slidingTabLayout.getRight());
                    if (fValueOf2.floatValue() <= 0.0f) {
                        fValueOf2 = null;
                    }
                    this.f42747m = fValueOf2 != null ? fValueOf2.floatValue() : this.f42747m;
                    Float fValueOf3 = Float.valueOf(slidingTabLayout.getTop());
                    if (fValueOf3.floatValue() <= 0.0f) {
                        fValueOf3 = null;
                    }
                    this.f42748n = fValueOf3 != null ? fValueOf3.floatValue() : this.f42748n;
                    Float fValueOf4 = Float.valueOf(slidingTabLayout.getBottom());
                    Float f11 = fValueOf4.floatValue() > 0.0f ? fValueOf4 : null;
                    this.f42749o = f11 != null ? f11.floatValue() * 2 : this.f42749o;
                    return;
                }
                m53316g(childAt);
            }
        }
    }

    @Override // com.kubi.resources.widget.CustomViewPager, com.kubi.resources.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        int action = ev2.getAction();
        if (action == 0) {
            this.f42744j = ev2.getX();
            this.f42745k = ev2.getY();
            if (ev2.getX() > this.f42746l && ev2.getX() < this.f42747m && ev2.getY() > this.f42748n && ev2.getY() < this.f42749o) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 2) {
            float x11 = ev2.getX() - this.f42744j;
            if (Math.abs(x11) <= Math.abs(ev2.getY() - this.f42745k) || Math.abs(x11) <= this.f42750p) {
                return false;
            }
            return ev2.getX() <= this.f42746l || ev2.getX() >= this.f42747m || ev2.getY() <= this.f42748n || ev2.getY() >= this.f42749o;
        }
        return super.onInterceptTouchEvent(ev2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0005, B:6:0x000c, B:8:0x0012, B:10:0x0018, B:16:0x0025, B:20:0x002c, B:25:0x0041, B:27:0x0048, B:29:0x004e, B:34:0x0063, B:36:0x006a, B:38:0x0070, B:43:0x0085, B:45:0x008c, B:47:0x0092, B:51:0x00a6, B:53:0x00b0, B:52:0x00ae, B:44:0x008a, B:35:0x0068, B:26:0x0046, B:55:0x00b3), top: B:61:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0005, B:6:0x000c, B:8:0x0012, B:10:0x0018, B:16:0x0025, B:20:0x002c, B:25:0x0041, B:27:0x0048, B:29:0x004e, B:34:0x0063, B:36:0x006a, B:38:0x0070, B:43:0x0085, B:45:0x008c, B:47:0x0092, B:51:0x00a6, B:53:0x00b0, B:52:0x00ae, B:44:0x008a, B:35:0x0068, B:26:0x0046, B:55:0x00b3), top: B:61:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x008a A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0005, B:6:0x000c, B:8:0x0012, B:10:0x0018, B:16:0x0025, B:20:0x002c, B:25:0x0041, B:27:0x0048, B:29:0x004e, B:34:0x0063, B:36:0x006a, B:38:0x0070, B:43:0x0085, B:45:0x008c, B:47:0x0092, B:51:0x00a6, B:53:0x00b0, B:52:0x00ae, B:44:0x008a, B:35:0x0068, B:26:0x0046, B:55:0x00b3), top: B:61:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0005, B:6:0x000c, B:8:0x0012, B:10:0x0018, B:16:0x0025, B:20:0x002c, B:25:0x0041, B:27:0x0048, B:29:0x004e, B:34:0x0063, B:36:0x006a, B:38:0x0070, B:43:0x0085, B:45:0x008c, B:47:0x0092, B:51:0x00a6, B:53:0x00b0, B:52:0x00ae, B:44:0x008a, B:35:0x0068, B:26:0x0046, B:55:0x00b3), top: B:61:0x0005 }] */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        try {
            super.onLayout(changed, l11, t11, r11, b11);
            try {
                if ((this.f42746l != 0.0f || this.f42747m != 0.0f || this.f42748n != 0.0f || this.f42749o != 0.0f) && !changed) {
                    return;
                }
                SlidingTabLayout slidingTabLayout = this.f42751q;
                if (slidingTabLayout != null) {
                    Float f11 = null;
                    if (slidingTabLayout != null) {
                        Float fValueOf = Float.valueOf(slidingTabLayout.getLeft());
                        if (fValueOf.floatValue() <= 0.0f) {
                            fValueOf = null;
                        }
                        if (fValueOf != null) {
                            fFloatValue = fValueOf.floatValue();
                        } else {
                            fFloatValue = this.f42746l;
                        }
                    } else {
                        fFloatValue = this.f42746l;
                    }
                    this.f42746l = fFloatValue;
                    SlidingTabLayout slidingTabLayout2 = this.f42751q;
                    if (slidingTabLayout2 != null) {
                        Float fValueOf2 = Float.valueOf(slidingTabLayout2.getRight());
                        if (fValueOf2.floatValue() <= 0.0f) {
                            fValueOf2 = null;
                        }
                        if (fValueOf2 != null) {
                            fFloatValue2 = fValueOf2.floatValue();
                        } else {
                            fFloatValue2 = this.f42747m;
                        }
                    } else {
                        fFloatValue2 = this.f42747m;
                    }
                    this.f42747m = fFloatValue2;
                    SlidingTabLayout slidingTabLayout3 = this.f42751q;
                    if (slidingTabLayout3 != null) {
                        Float fValueOf3 = Float.valueOf(slidingTabLayout3.getTop());
                        if (fValueOf3.floatValue() <= 0.0f) {
                            fValueOf3 = null;
                        }
                        if (fValueOf3 != null) {
                            fFloatValue3 = fValueOf3.floatValue();
                        } else {
                            fFloatValue3 = this.f42748n;
                        }
                    } else {
                        fFloatValue3 = this.f42748n;
                    }
                    this.f42748n = fFloatValue3;
                    SlidingTabLayout slidingTabLayout4 = this.f42751q;
                    if (slidingTabLayout4 != null) {
                        Float fValueOf4 = Float.valueOf(slidingTabLayout4.getBottom());
                        if (fValueOf4.floatValue() > 0.0f) {
                            f11 = fValueOf4;
                        }
                        if (f11 != null) {
                            fFloatValue4 = f11.floatValue() * 2;
                        } else {
                            fFloatValue4 = this.f42749o;
                        }
                    } else {
                        fFloatValue4 = this.f42749o;
                    }
                    this.f42749o = fFloatValue4;
                    return;
                }
                m53316g(this);
            } catch (Exception e11) {
                e = e11;
                C37266a.m83411b(e, "NoScrollQuoteViewPager-onLayout");
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoScrollQuoteViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42743i = "NoScrollQuoteViewPager";
        this.f42750p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
