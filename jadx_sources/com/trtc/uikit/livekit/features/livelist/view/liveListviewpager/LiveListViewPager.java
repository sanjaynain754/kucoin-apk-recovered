package com.trtc.uikit.livekit.features.livelist.view.liveListviewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import com.trtc.uikit.livekit.features.livelist.view.liveListviewpager.LiveListViewPager;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveListViewPager.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rJ\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u001c\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPager;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "liveListViewAdapter", "Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter;", "currentPosition", "positionOffset", "", "willSlideInPosition", "willSlideOutPosition", "setAdapter", "", "adapter", "currentItem", "getCurrentItem", "()I", "initView", "isSlideToPrevious", "", ViewProps.POSITION, "isSliding", "onSlideToNext", "onSlideToPrevious", "onScrollEnd", "onFragmentWillSlideIn", "onFragmentDidSlideIn", "onFragmentSlideInCancelled", "onFragmentWillSlideOut", "onFragmentDidSlideOut", "onFragmentSlideOutCancelled", "findViewByPosition", "Landroid/view/View;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveListViewPager extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public ViewPager2 f79098b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public LiveListViewPagerAdapter f79099c;

    /* JADX INFO: renamed from: d */
    public int f79100d;

    /* JADX INFO: renamed from: e */
    public float f79101e;

    /* JADX INFO: renamed from: f */
    public int f79102f;

    /* JADX INFO: renamed from: g */
    public int f79103g;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.liveListviewpager.LiveListViewPager$a */
    /* JADX INFO: compiled from: LiveListViewPager.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPager$initView$1$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageScrollStateChanged", "", "state", "", "onPageSelected", ViewProps.POSITION, "onPageScrolled", "positionOffset", "", "positionOffsetPixels", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36387a extends ViewPager2.OnPageChangeCallback {
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            if (positionOffset > 0.0f && !LiveListViewPager.this.m81440r()) {
                if (LiveListViewPager.this.m81439q(position, positionOffset)) {
                    LiveListViewPager.this.m81436A();
                } else {
                    LiveListViewPager.this.m81448z();
                }
                LiveListViewPager.this.f79101e = positionOffset;
            }
        }

        public C36387a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int state) {
            if (state == 0) {
                LiveListViewPager.this.m81447y();
            } else {
                if (state != 1) {
                    return;
                }
                LiveListViewPager.this.f79102f = -1;
                LiveListViewPager.this.f79103g = -1;
                LiveListViewPager.this.f79101e = -1.0f;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            if (LiveListViewPager.this.f79100d == -1) {
                LiveListViewPager.this.m81441s(position);
                LiveListViewPager.this.f79100d = position;
            } else if (LiveListViewPager.this.m81440r()) {
                LiveListViewPager liveListViewPager = LiveListViewPager.this;
                liveListViewPager.m81442t(liveListViewPager.f79100d);
                LiveListViewPager.this.m81441s(position);
                LiveListViewPager.this.f79100d = position;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveListViewPager(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveListViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAdapter$lambda$1(final LiveListViewPager liveListViewPager) {
        liveListViewPager.post(new Runnable() { // from class: ie0.b
            @Override // java.lang.Runnable
            public final void run() {
                LiveListViewPager.setAdapter$lambda$1$lambda$0(this.f86492b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAdapter$lambda$1$lambda$0(LiveListViewPager liveListViewPager) {
        if (liveListViewPager.f79100d != -1) {
            int currentItem = liveListViewPager.getCurrentItem();
            liveListViewPager.m81442t(liveListViewPager.f79100d);
            liveListViewPager.m81441s(currentItem);
            liveListViewPager.f79100d = currentItem;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m81436A() {
        int i11 = this.f79100d;
        if (i11 <= 0) {
            return;
        }
        this.f79103g = i11;
        this.f79102f = i11 - 1;
        m81446x(i11);
        m81445w(this.f79102f);
    }

    public final int getCurrentItem() {
        ViewPager2 viewPager2 = this.f79098b;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        return viewPager2.getCurrentItem();
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final View m81437o(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f79099c;
        Fragment fragmentM81457o = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81457o(i11) : null;
        LiveListFragment liveListFragment = fragmentM81457o instanceof LiveListFragment ? (LiveListFragment) fragmentM81457o : null;
        if (liveListFragment != null) {
            return liveListFragment.getView();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m81438p() {
        ViewPager2 viewPager2 = new ViewPager2(getContext());
        viewPager2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setOrientation(1);
        viewPager2.registerOnPageChangeCallback(new C36387a());
        this.f79098b = viewPager2;
        addView(viewPager2);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m81439q(int i11, float f11) {
        if (i11 < this.f79100d) {
            float f12 = this.f79101e;
            if (f12 == -1.0f || f11 < f12) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m81440r() {
        return (this.f79102f == -1 && this.f79103g == -1) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public final void m81441s(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter;
        List<LiveInfo> listM81456n;
        LiveListViewPagerAdapter liveListViewPagerAdapter2 = this.f79099c;
        Fragment fragmentM81457o = liveListViewPagerAdapter2 != null ? liveListViewPagerAdapter2.m81457o(i11) : null;
        LiveListFragment liveListFragment = fragmentM81457o instanceof LiveListFragment ? (LiveListFragment) fragmentM81457o : null;
        if (liveListFragment != null) {
            liveListFragment.m81415d3();
            LiveListViewPagerAdapter liveListViewPagerAdapter3 = this.f79099c;
            if (i11 < ((liveListViewPagerAdapter3 == null || (listM81456n = liveListViewPagerAdapter3.m81456n()) == null) ? 0 : listM81456n.size()) - 2 || (liveListViewPagerAdapter = this.f79099c) == null) {
                return;
            }
            liveListViewPagerAdapter.m81455m();
        }
    }

    public final void setAdapter(@NotNull LiveListViewPagerAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f79099c = adapter;
        ViewPager2 viewPager2 = this.f79098b;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        viewPager2.setAdapter(adapter);
        adapter.setOnDataChangedListener(new LiveListViewPagerAdapter.InterfaceC36389b() { // from class: ie0.a
            @Override // com.trtc.uikit.livekit.features.livelist.view.liveListviewpager.LiveListViewPagerAdapter.InterfaceC36389b
            /* JADX INFO: renamed from: a */
            public final void mo81467a() {
                LiveListViewPager.setAdapter$lambda$1(this.f86491a);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m81442t(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f79099c;
        Fragment fragmentM81457o = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81457o(i11) : null;
        LiveListFragment liveListFragment = fragmentM81457o instanceof LiveListFragment ? (LiveListFragment) fragmentM81457o : null;
        if (liveListFragment != null) {
            liveListFragment.m81416e3();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m81443u(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f79099c;
        Fragment fragmentM81457o = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81457o(i11) : null;
        LiveListFragment liveListFragment = fragmentM81457o instanceof LiveListFragment ? (LiveListFragment) fragmentM81457o : null;
        if (liveListFragment != null) {
            liveListFragment.m81417f3();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m81444v(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f79099c;
        Fragment fragmentM81457o = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81457o(i11) : null;
        LiveListFragment liveListFragment = fragmentM81457o instanceof LiveListFragment ? (LiveListFragment) fragmentM81457o : null;
        if (liveListFragment != null) {
            liveListFragment.m81418g3();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m81445w(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f79099c;
        Fragment fragmentM81457o = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81457o(i11) : null;
        LiveListFragment liveListFragment = fragmentM81457o instanceof LiveListFragment ? (LiveListFragment) fragmentM81457o : null;
        if (liveListFragment != null) {
            liveListFragment.m81419h3();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m81446x(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f79099c;
        Fragment fragmentM81457o = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81457o(i11) : null;
        LiveListFragment liveListFragment = fragmentM81457o instanceof LiveListFragment ? (LiveListFragment) fragmentM81457o : null;
        if (liveListFragment != null) {
            liveListFragment.m81420i3();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m81448z() {
        List<LiveInfo> listM81456n;
        int i11 = this.f79100d;
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f79099c;
        if (i11 >= ((liveListViewPagerAdapter == null || (listM81456n = liveListViewPagerAdapter.m81456n()) == null) ? 0 : listM81456n.size()) - 1) {
            return;
        }
        int i12 = this.f79100d;
        this.f79103g = i12;
        this.f79102f = i12 + 1;
        m81446x(i12);
        m81445w(this.f79102f);
    }

    public /* synthetic */ LiveListViewPager(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: y */
    public final void m81447y() {
        int i11;
        int size;
        int i12;
        List<LiveInfo> listM81456n;
        List<LiveInfo> listM81456n2;
        if (m81440r() && (i11 = this.f79102f) >= 0) {
            LiveListViewPagerAdapter liveListViewPagerAdapter = this.f79099c;
            int size2 = 0;
            if (liveListViewPagerAdapter != null && (listM81456n2 = liveListViewPagerAdapter.m81456n()) != null) {
                size = listM81456n2.size();
            } else {
                size = 0;
            }
            if (i11 < size && (i12 = this.f79103g) >= 0) {
                LiveListViewPagerAdapter liveListViewPagerAdapter2 = this.f79099c;
                if (liveListViewPagerAdapter2 != null && (listM81456n = liveListViewPagerAdapter2.m81456n()) != null) {
                    size2 = listM81456n.size();
                }
                if (i12 < size2) {
                    if (this.f79102f != getCurrentItem()) {
                        m81443u(this.f79102f);
                        m81444v(this.f79103g);
                    }
                    this.f79102f = -1;
                    this.f79103g = -1;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveListViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f79100d = -1;
        this.f79101e = -1.0f;
        this.f79102f = -1;
        this.f79103g = -1;
        m81438p();
    }
}
