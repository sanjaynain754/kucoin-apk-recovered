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
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p241ev.C37266a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CanScrollQuoteViewPager.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0014J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/quotefacade/view/CanScrollQuoteViewPager;", "Lcom/kubi/resources/widget/CustomViewPager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "startX", "", "startY", "scaledTouchSlop", "", "scrollViews", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/view/View;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "isTouchInView", ViewProps.ON_LAYOUT, "", "changed", CmcdData.Factory.STREAM_TYPE_LIVE, "t", "r", "b", "findChildView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCanScrollQuoteViewPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanScrollQuoteViewPager.kt\ncom/kubi/quotefacade/view/CanScrollQuoteViewPager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,84:1\n1869#2,2:85\n45#3,7:87\n*S KotlinDebug\n*F\n+ 1 CanScrollQuoteViewPager.kt\ncom/kubi/quotefacade/view/CanScrollQuoteViewPager\n*L\n53#1:85,2\n68#1:87,7\n*E\n"})
public final class CanScrollQuoteViewPager extends CustomViewPager {

    /* JADX INFO: renamed from: i */
    public float f42737i;

    /* JADX INFO: renamed from: j */
    public float f42738j;

    /* JADX INFO: renamed from: k */
    public final int f42739k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final CopyOnWriteArrayList<View> f42740l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanScrollQuoteViewPager(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42739k = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f42740l = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: renamed from: g */
    public final void m53305g(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                if (Intrinsics.areEqual(childAt.getTag(), "can_scroll")) {
                    this.f42740l.add(childAt);
                } else {
                    m53305g(childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m53306h(MotionEvent motionEvent) {
        for (View view : this.f42740l) {
            if (motionEvent.getX() > view.getLeft() && motionEvent.getX() < view.getRight() && motionEvent.getY() > view.getTop() && motionEvent.getY() < view.getBottom()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.kubi.resources.widget.CustomViewPager, com.kubi.resources.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        int action = ev2.getAction();
        if (action == 0) {
            this.f42737i = ev2.getX();
            this.f42738j = ev2.getY();
            if (m53306h(ev2)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 2) {
            float x11 = ev2.getX() - this.f42737i;
            return Math.abs(x11) > Math.abs(ev2.getY() - this.f42738j) && Math.abs(x11) > ((float) this.f42739k) && !m53306h(ev2);
        }
        return super.onInterceptTouchEvent(ev2);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        try {
            super.onLayout(changed, l11, t11, r11, b11);
            try {
                if (this.f42740l.isEmpty()) {
                    m53305g(this);
                }
            } catch (Exception e11) {
                e = e11;
                C37266a.m83411b(e, "CanScrollQuoteViewPager-onLayout");
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanScrollQuoteViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42739k = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f42740l = new CopyOnWriteArrayList<>();
    }
}
