package com.kubi.quotefacade.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.kubi.quotefacade.alpha.AlphaFragment;
import com.kubi.quotefacade.chain.ChainContainerFragment;
import com.kubi.quotefacade.market.QuoteMarketFragment;
import com.kubi.resources.widget.CustomViewPager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QuoteViewPager.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/quotefacade/view/QuoteViewPager;", "Lcom/kubi/resources/widget/CustomViewPager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "startX", "", "startY", "quoteMarketCurrentItem", "", "alphaMarketCurrentItem", "quoteChainCurrentItem", "quoteMarketPageSize", "alphaMarketPageSize", "scaledTouchSlop", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QuoteViewPager extends CustomViewPager {

    /* JADX INFO: renamed from: i */
    public float f42752i;

    /* JADX INFO: renamed from: j */
    public float f42753j;

    /* JADX INFO: renamed from: k */
    public int f42754k;

    /* JADX INFO: renamed from: l */
    public int f42755l;

    /* JADX INFO: renamed from: m */
    public int f42756m;

    /* JADX INFO: renamed from: n */
    public int f42757n;

    /* JADX INFO: renamed from: o */
    public int f42758o;

    /* JADX INFO: renamed from: p */
    public final int f42759p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteViewPager(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42754k = -1;
        this.f42755l = -1;
        this.f42756m = -1;
        this.f42759p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // com.kubi.resources.widget.CustomViewPager, com.kubi.resources.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev2) {
        Integer numM50735q3;
        Integer numM50325x3;
        Integer numM52372p3;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        int action = ev2.getAction();
        if (action == 0) {
            this.f42752i = ev2.getX();
            this.f42753j = ev2.getY();
            PagerAdapter adapter = getAdapter();
            Intrinsics.checkNotNull(adapter);
            Object objInstantiateItem = adapter.instantiateItem((ViewGroup) this, getCurrentItem());
            QuoteMarketFragment quoteMarketFragment = objInstantiateItem instanceof QuoteMarketFragment ? (QuoteMarketFragment) objInstantiateItem : null;
            int iIntValue = -1;
            this.f42754k = (quoteMarketFragment == null || (numM52372p3 = quoteMarketFragment.m52372p3()) == null) ? -1 : numM52372p3.intValue();
            this.f42757n = quoteMarketFragment != null ? quoteMarketFragment.m52373q3() : 0;
            PagerAdapter adapter2 = getAdapter();
            Intrinsics.checkNotNull(adapter2);
            Object objInstantiateItem2 = adapter2.instantiateItem((ViewGroup) this, getCurrentItem());
            AlphaFragment alphaFragment = objInstantiateItem2 instanceof AlphaFragment ? (AlphaFragment) objInstantiateItem2 : null;
            this.f42755l = (alphaFragment == null || (numM50325x3 = alphaFragment.m50325x3()) == null) ? -1 : numM50325x3.intValue();
            this.f42758o = alphaFragment != null ? alphaFragment.m50326y3() : 0;
            PagerAdapter adapter3 = getAdapter();
            Intrinsics.checkNotNull(adapter3);
            Object objInstantiateItem3 = adapter3.instantiateItem((ViewGroup) this, getCurrentItem());
            ChainContainerFragment chainContainerFragment = objInstantiateItem3 instanceof ChainContainerFragment ? (ChainContainerFragment) objInstantiateItem3 : null;
            if (chainContainerFragment != null && (numM50735q3 = chainContainerFragment.m50735q3()) != null) {
                iIntValue = numM50735q3.intValue();
            }
            this.f42756m = iIntValue;
        } else if (action == 2) {
            float x11 = ev2.getX() - this.f42752i;
            if (Math.abs(x11) > Math.abs(ev2.getY() - this.f42753j) && Math.abs(x11) > this.f42759p) {
                int i11 = this.f42757n;
                if (i11 > 0) {
                    if (x11 < 0.0f && this.f42754k == i11 - 1) {
                        return true;
                    }
                    if (x11 > 0.0f && this.f42754k == 0) {
                        return true;
                    }
                }
                if (x11 > 0.0f && this.f42756m == 0) {
                    return true;
                }
                int i12 = this.f42758o;
                if (i12 > 0) {
                    if (x11 < 0.0f && this.f42755l == i12 - 1) {
                        return true;
                    }
                    if (x11 > 0.0f && this.f42755l == 0) {
                        return true;
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(ev2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42754k = -1;
        this.f42755l = -1;
        this.f42756m = -1;
        this.f42759p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
