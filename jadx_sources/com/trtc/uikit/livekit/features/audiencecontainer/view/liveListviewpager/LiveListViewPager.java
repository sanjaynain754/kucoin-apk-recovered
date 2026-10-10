package com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import ee0.C37139a;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveListViewPager.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rJ\b\u0010\u0018\u001a\u00020\u0016H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0014J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u0016H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0010\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u001f\u001a\u00020\u0007J\u0017\u0010,\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010.R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPager;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "liveListViewAdapter", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "currentPosition", "positionOffset", "", "willSlideInPosition", "willSlideOutPosition", "setAdapter", "", "adapter", "onAttachedToWindow", "onDetachedFromWindow", "getCurrentItem", "enableSliding", "enabled", "", "isSlideToPrevious", ViewProps.POSITION, "isSliding", "onSlideToNext", "onSlideToPrevious", "onScrollEnd", "onFragmentWillSlideIn", "onFragmentDidSlideIn", "onFragmentSlideInCancelled", "onFragmentWillSlideOut", "onFragmentDidSlideOut", "onFragmentSlideOutCancelled", "findViewByPosition", "Landroid/view/View;", "onRoomSlidingDisable", "disable", "(Ljava/lang/Boolean;)V", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveListViewPager extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ViewPager2 f78929b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public LiveListViewPagerAdapter f78930c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public InterfaceC41775x1 f78931d;

    /* JADX INFO: renamed from: e */
    public int f78932e;

    /* JADX INFO: renamed from: f */
    public float f78933f;

    /* JADX INFO: renamed from: g */
    public int f78934g;

    /* JADX INFO: renamed from: h */
    public int f78935h;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPager$a */
    /* JADX INFO: compiled from: LiveListViewPager.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPager$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageScrollStateChanged", "", "state", "", "onPageSelected", ViewProps.POSITION, "onPageScrolled", "positionOffset", "", "positionOffsetPixels", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36334a extends ViewPager2.OnPageChangeCallback {
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            if (positionOffset > 0.0f && !LiveListViewPager.this.m81242p()) {
                if (LiveListViewPager.this.m81241o(position, positionOffset)) {
                    LiveListViewPager.this.m81252z();
                } else {
                    LiveListViewPager.this.m81251y();
                }
                LiveListViewPager.this.f78933f = positionOffset;
            }
        }

        public C36334a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int state) {
            if (state == 0) {
                LiveListViewPager.this.m81250x();
            } else {
                if (state != 1) {
                    return;
                }
                LiveListViewPager.this.f78934g = -1;
                LiveListViewPager.this.f78935h = -1;
                LiveListViewPager.this.f78933f = -1.0f;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            if (LiveListViewPager.this.f78932e == -1) {
                LiveListViewPager.this.m81243q(position);
                LiveListViewPager.this.f78932e = position;
            } else if (LiveListViewPager.this.m81242p()) {
                LiveListViewPager liveListViewPager = LiveListViewPager.this;
                liveListViewPager.m81244r(liveListViewPager.f78932e);
                LiveListViewPager.this.m81243q(position);
                LiveListViewPager.this.f78932e = position;
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPager$onAttachedToWindow$1 */
    /* JADX INFO: compiled from: LiveListViewPager.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPager$onAttachedToWindow$1", m90122f = "LiveListViewPager.kt", m90123i = {}, m90124l = {98}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363351 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPager$onAttachedToWindow$1$a */
        /* JADX INFO: compiled from: LiveListViewPager.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LiveListViewPager f78937b;

            public a(LiveListViewPager liveListViewPager) {
                this.f78937b = liveListViewPager;
            }

            /* JADX INFO: renamed from: a */
            public final Object m81253a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78937b.m81249w(Boxing.boxBoolean(z11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m81253a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public C363351(Continuation<? super C363351> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiveListViewPager.this.new C363351(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363351) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41669n<Boolean> interfaceC41669nM83071e = C37139a.f82409a.m83071e();
                a aVar = new a(LiveListViewPager.this);
                this.label = 1;
                if (interfaceC41669nM83071e.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
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

    private final int getCurrentItem() {
        return this.f78929b.getCurrentItem();
    }

    /* JADX INFO: renamed from: n */
    public final void m81240n(boolean z11) {
        if (C37139a.f82409a.m83071e().getValue().booleanValue()) {
            return;
        }
        this.f78929b.setUserInputEnabled(z11);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m81241o(int i11, float f11) {
        if (i11 < this.f78932e) {
            float f12 = this.f78933f;
            if (f12 == -1.0f || f11 < f12) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m81242p() {
        return (this.f78934g == -1 && this.f78935h == -1) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final void m81243q(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78930c;
        Fragment fragmentM81261n = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81261n(i11) : null;
        LiveListFragment liveListFragment = fragmentM81261n instanceof LiveListFragment ? (LiveListFragment) fragmentM81261n : null;
        if (liveListFragment != null) {
            liveListFragment.m81221d3();
        }
        LiveListViewPagerAdapter liveListViewPagerAdapter2 = this.f78930c;
        if (liveListViewPagerAdapter2 == null || i11 < liveListViewPagerAdapter2.m81260m().size() - 2) {
            return;
        }
        liveListViewPagerAdapter2.m81259l();
    }

    /* JADX INFO: renamed from: r */
    public final void m81244r(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78930c;
        Fragment fragmentM81261n = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81261n(i11) : null;
        LiveListFragment liveListFragment = fragmentM81261n instanceof LiveListFragment ? (LiveListFragment) fragmentM81261n : null;
        if (liveListFragment != null) {
            liveListFragment.m81222e3();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m81245s(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78930c;
        Fragment fragmentM81261n = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81261n(i11) : null;
        LiveListFragment liveListFragment = fragmentM81261n instanceof LiveListFragment ? (LiveListFragment) fragmentM81261n : null;
        if (liveListFragment != null) {
            liveListFragment.m81223f3();
        }
    }

    public final void setAdapter(@NotNull LiveListViewPagerAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f78930c = adapter;
        this.f78929b.setAdapter(adapter);
    }

    /* JADX INFO: renamed from: t */
    public final void m81246t(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78930c;
        Fragment fragmentM81261n = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81261n(i11) : null;
        LiveListFragment liveListFragment = fragmentM81261n instanceof LiveListFragment ? (LiveListFragment) fragmentM81261n : null;
        if (liveListFragment != null) {
            liveListFragment.m81224g3();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m81247u(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78930c;
        Fragment fragmentM81261n = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81261n(i11) : null;
        LiveListFragment liveListFragment = fragmentM81261n instanceof LiveListFragment ? (LiveListFragment) fragmentM81261n : null;
        if (liveListFragment != null) {
            liveListFragment.m81225h3();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m81248v(int i11) {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78930c;
        Fragment fragmentM81261n = liveListViewPagerAdapter != null ? liveListViewPagerAdapter.m81261n(i11) : null;
        LiveListFragment liveListFragment = fragmentM81261n instanceof LiveListFragment ? (LiveListFragment) fragmentM81261n : null;
        if (liveListFragment != null) {
            liveListFragment.m81226i3();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m81249w(Boolean bool) {
        this.f78929b.setUserInputEnabled(!Intrinsics.areEqual(bool, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: y */
    public final void m81251y() {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78930c;
        if (liveListViewPagerAdapter == null || this.f78932e >= liveListViewPagerAdapter.m81260m().size() - 1) {
            return;
        }
        int i11 = this.f78932e;
        this.f78935h = i11;
        this.f78934g = i11 + 1;
        m81248v(i11);
        m81247u(this.f78934g);
    }

    /* JADX INFO: renamed from: z */
    public final void m81252z() {
        int i11 = this.f78932e;
        if (i11 <= 0) {
            return;
        }
        this.f78935h = i11;
        this.f78934g = i11 - 1;
        m81248v(i11);
        m81247u(this.f78934g);
    }

    public /* synthetic */ LiveListViewPager(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f78931d = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C363351(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC41775x1 interfaceC41775x1 = this.f78931d;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m81250x() {
        int i11;
        if (m81242p()) {
            LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78930c;
            if (liveListViewPagerAdapter != null) {
                int i12 = this.f78934g;
                if (i12 >= 0 && i12 < liveListViewPagerAdapter.m81260m().size() && (i11 = this.f78935h) >= 0 && i11 < liveListViewPagerAdapter.m81260m().size()) {
                    if (this.f78934g != getCurrentItem()) {
                        m81245s(this.f78934g);
                        m81246t(this.f78935h);
                    }
                } else {
                    return;
                }
            }
            this.f78934g = -1;
            this.f78935h = -1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveListViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78932e = -1;
        this.f78933f = -1.0f;
        this.f78934g = -1;
        this.f78935h = -1;
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.f78929b = viewPager2;
        addView(viewPager2, new RelativeLayout.LayoutParams(-1, -1));
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setOrientation(1);
        viewPager2.registerOnPageChangeCallback(new C36334a());
    }
}
