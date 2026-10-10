package com.kubi.home.main;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.CardAdapter;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.interpolator.KcInterpolators$Expressive;
import com.kubi.resources.widget.interpolator.KcInterpolatorsKt;
import com.kubi.sdk.DiffCallBack;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.wallet.api.IWalletService;
import com.tencent.qcloud.tuicore.TUIConstants;
import fj.C37516e0;
import java.util.Iterator;
import java.util.List;
import lb0.InterpolatorC42155b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeUIHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0002J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0002J\u001c\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100#J\u0010\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0007H\u0002J\u0018\u0010&\u001a\u00020\u00072\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010#R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/home/main/HomeUIHelper;", "", "binding", "Lcom/kubi/home/databinding/KucoinFragmentHomeBinding;", "<init>", "(Lcom/kubi/home/databinding/KucoinFragmentHomeBinding;)V", "enableNavAlpha", "", "initCardListView", "", "onMoveStart", "Lkotlin/Function0;", "onMoveStop", "onScrolled", "builder", "Lcom/kubi/kucoin/home/cards/CardAdapter$Builder;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "cardAdapterBuilder", "scrollTopOffset", "", "Ljava/lang/Integer;", "animationNavBgWhenScroll", "reset", "isShowBg", "isAnimating", "animatorSet", "Landroid/animation/AnimatorSet;", "showAnimation", "showBg", "resetAnimation", "cardHorizontalMargin", ViewProps.POSITION, "refreshAfterAdapter", "needScrollToTop", "cards", "", "refreshViewByCards", "hasNoLoginedWelfare", "hasTopWelfareCard", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeUIHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeUIHelper.kt\ncom/kubi/home/main/HomeUIHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,231:1\n1#2:232\n1761#3,3:233\n91#4,14:236\n*S KotlinDebug\n*F\n+ 1 HomeUIHelper.kt\ncom/kubi/home/main/HomeUIHelper\n*L\n229#1:233,3\n162#1:236,14\n*E\n"})
public final class HomeUIHelper {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final C37516e0 f25731a;

    /* JADX INFO: renamed from: c */
    @Nullable
    public CardAdapter.a<BaseCardData> f25733c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Integer f25734d;

    /* JADX INFO: renamed from: f */
    public boolean f25736f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public AnimatorSet f25737g;

    /* JADX INFO: renamed from: b */
    public boolean f25732b = true;

    /* JADX INFO: renamed from: e */
    public boolean f25735e = true;

    /* JADX INFO: renamed from: com.kubi.home.main.HomeUIHelper$a */
    /* JADX INFO: compiled from: HomeUIHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016J(\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/home/main/HomeUIHelper$cardAdapterBuilder$1", "Lcom/kubi/sdk/DiffCallBack;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "areItemsTheSame", "", "oldPos", "", "oldItem", "newPos", "newItem", "areContentsTheSame", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14595a implements DiffCallBack<BaseCardData> {
        @Override // com.kubi.sdk.DiffCallBack
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo29353a(int i11, BaseCardData oldItem, int i12, BaseCardData newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.toString(), newItem.toString());
        }

        @Override // com.kubi.sdk.DiffCallBack
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo29354c(int i11, BaseCardData oldItem, int i12, BaseCardData newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getCode(), newItem.getCode());
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.HomeUIHelper$b */
    /* JADX INFO: compiled from: HomeUIHelper.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/home/main/HomeUIHelper$initCardListView$2", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14596b extends RecyclerView.ItemDecoration {
        public C14596b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int iM29349r = HomeUIHelper.this.m29349r(childAdapterPosition);
            outRect.left = iM29349r;
            outRect.right = iM29349r;
            if (childAdapterPosition > 0) {
                RecyclerView.Adapter adapter = parent.getAdapter();
                if (childAdapterPosition == C27039d.m66650j(adapter != null ? Integer.valueOf(adapter.getItemCount()) : null) - 1) {
                    outRect.bottom = C27040e.m66658b(16);
                }
                outRect.top = InterpolatorC42155b.m92540c(12.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.HomeUIHelper$c */
    /* JADX INFO: compiled from: HomeUIHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/home/main/HomeUIHelper$initCardListView$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14597c extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f25739a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0<Unit> f25740b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ HomeUIHelper f25741c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function0<Unit> f25742d;

        public C14597c(Function0<Unit> function0, Function0<Unit> function1, HomeUIHelper homeUIHelper, Function0<Unit> function2) {
            this.f25739a = function0;
            this.f25740b = function1;
            this.f25741c = homeUIHelper;
            this.f25742d = function2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState != 0) {
                if (newState != 1) {
                    return;
                }
                this.f25739a.invoke();
            } else {
                this.f25740b.invoke();
                if (this.f25741c.f25732b) {
                    this.f25741c.m29347m(true);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, dx2, dy2);
            Function0<Unit> function0 = this.f25742d;
            if (function0 != null) {
                function0.invoke();
            }
            if (this.f25741c.f25732b) {
                this.f25741c.m29347m(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.HomeUIHelper$d */
    /* JADX INFO: compiled from: Animator.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 HomeUIHelper.kt\ncom/kubi/home/main/HomeUIHelper\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n162#3:125\n94#4:126\n93#5:127\n*E\n"})
    public static final class C14598d implements Animator.AnimatorListener {
        public C14598d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            HomeUIHelper.this.f25736f = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m29322F(HomeUIHelper homeUIHelper, boolean z11) {
        View view;
        if (homeUIHelper.f25735e == z11) {
            return Unit.INSTANCE;
        }
        homeUIHelper.f25735e = z11;
        float f11 = z11 ? 0.0f : 1.0f;
        float f12 = z11 ? 1.0f : 0.0f;
        if (homeUIHelper.f25736f) {
            return Unit.INSTANCE;
        }
        homeUIHelper.f25736f = true;
        C37516e0 c37516e0 = homeUIHelper.f25731a;
        if (c37516e0 == null || (view = c37516e0.f83245g) == null) {
            return Unit.INSTANCE;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", f11, f12);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(homeUIHelper.f25731a.f83242d, "alpha", f12, f11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(KcInterpolatorsKt.create(KcInterpolators$Expressive.EASE_OUT));
        animatorSet.addListener(homeUIHelper.new C14598d());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        homeUIHelper.f25737g = animatorSet;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m29321C(HomeUIHelper homeUIHelper, boolean z11) {
        ImageView imageView;
        View view;
        AnimatorSet animatorSet = homeUIHelper.f25737g;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        AnimatorSet animatorSet2 = homeUIHelper.f25737g;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        homeUIHelper.f25737g = null;
        homeUIHelper.f25735e = z11;
        C37516e0 c37516e0 = homeUIHelper.f25731a;
        if (c37516e0 != null && (view = c37516e0.f83245g) != null) {
            view.setAlpha(z11 ? 1.0f : 0.0f);
        }
        C37516e0 c37516e1 = homeUIHelper.f25731a;
        if (c37516e1 != null && (imageView = c37516e1.f83242d) != null) {
            imageView.setAlpha(z11 ? 0.0f : 1.0f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m29335n(final HomeUIHelper homeUIHelper, final boolean z11) {
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        final View viewFindViewByPosition;
        C37516e0 c37516e0 = homeUIHelper.f25731a;
        if (c37516e0 == null || (recyclerView = c37516e0.f83240b) == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindViewByPosition = layoutManager.findViewByPosition(0)) == null) {
            return Unit.INSTANCE;
        }
        homeUIHelper.f25731a.f83240b.postDelayed(new Runnable() { // from class: com.kubi.home.main.a0
            @Override // java.lang.Runnable
            public final void run() {
                HomeUIHelper.m29336o(viewFindViewByPosition, homeUIHelper, z11);
            }
        }, z11 ? 100L : 0L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final void m29336o(final View view, final HomeUIHelper homeUIHelper, final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeUIHelper.m29337p(view, homeUIHelper, z11);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m29338t(HomeUIHelper homeUIHelper, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = null;
        }
        return homeUIHelper.m29350s(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m29339v(HomeUIHelper homeUIHelper, Function0 function0, Function0 function1, Function0 function2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        homeUIHelper.m29351u(function0, function1, function2);
    }

    /* JADX INFO: renamed from: x */
    public static final void m29340x(final HomeUIHelper homeUIHelper, final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeUIHelper.m29341y(this.f25751b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m29341y(final HomeUIHelper homeUIHelper, final boolean z11) {
        homeUIHelper.f25731a.f83240b.scrollToPosition(0);
        homeUIHelper.f25731a.f83240b.post(new Runnable() { // from class: com.kubi.home.main.c0
            @Override // java.lang.Runnable
            public final void run() {
                HomeUIHelper.m29342z(this.f25754b, z11);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m29343A(boolean z11) {
        C37516e0 c37516e0;
        ImageView imageView;
        C37516e0 c37516e1;
        View view;
        this.f25732b = z11;
        if (!z11 && (c37516e1 = this.f25731a) != null && (view = c37516e1.f83245g) != null) {
            view.setAlpha(1.0f);
        }
        if (z11 || (c37516e0 = this.f25731a) == null || (imageView = c37516e0.f83242d) == null) {
            return;
        }
        C27046k.m66700o(imageView);
    }

    /* JADX INFO: renamed from: B */
    public final void m29344B(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeUIHelper.m29321C(this.f25763b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final int m29345D() {
        Integer num = this.f25734d;
        if (num != null) {
            return num.intValue();
        }
        int iM66658b = C27040e.m66658b(IWalletService.f54542a.get().mo66941a() ? 15 : 30);
        this.f25734d = Integer.valueOf(iM66658b);
        return iM66658b;
    }

    /* JADX INFO: renamed from: E */
    public final void m29346E(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeUIHelper.m29322F(this.f25760b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m29347m(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeUIHelper.m29335n(this.f25831b, z11);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final CardAdapter.a<BaseCardData> m29348q() {
        CardAdapter.a<BaseCardData> aVar = this.f25733c;
        if (aVar != null) {
            return aVar;
        }
        CardAdapter.a<BaseCardData> aVarM32200d = new CardAdapter.a().m32200d(new C14595a());
        this.f25733c = aVarM32200d;
        return aVarM32200d;
    }

    /* JADX INFO: renamed from: r */
    public final int m29349r(int i11) {
        RecyclerView recyclerView;
        C37516e0 c37516e0 = this.f25731a;
        RecyclerView.Adapter adapter = (c37516e0 == null || (recyclerView = c37516e0.f83240b) == null) ? null : recyclerView.getAdapter();
        CardAdapter cardAdapter = adapter instanceof CardAdapter ? (CardAdapter) adapter : null;
        List data = cardAdapter != null ? cardAdapter.getData() : null;
        BaseCardData baseCardData = data != null ? (BaseCardData) CollectionsKt.getOrNull(data, i11) : null;
        return Intrinsics.areEqual(baseCardData != null ? baseCardData.getType() : null, "MENU") ? C27040e.m66658b(4) : C27040e.m66658b(16);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m29350s(@Nullable List<BaseCardData> list) {
        RecyclerView recyclerView;
        if (list == null) {
            C37516e0 c37516e0 = this.f25731a;
            RecyclerView.Adapter adapter = (c37516e0 == null || (recyclerView = c37516e0.f83240b) == null) ? null : recyclerView.getAdapter();
            CardAdapter cardAdapter = adapter instanceof CardAdapter ? (CardAdapter) adapter : null;
            list = cardAdapter != null ? cardAdapter.getData() : null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((BaseCardData) it.next()).getType(), "NO_LOGINED_WELFARE")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final void m29351u(@NotNull Function0<Unit> onMoveStart, @NotNull Function0<Unit> onMoveStop, @Nullable Function0<Unit> function0) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(onMoveStart, "onMoveStart");
        Intrinsics.checkNotNullParameter(onMoveStop, "onMoveStop");
        C37516e0 c37516e0 = this.f25731a;
        if (c37516e0 == null || (recyclerView = c37516e0.f83240b) == null) {
            return;
        }
        C27046k.m66703r(recyclerView);
        recyclerView.setAdapter(m29348q().m32198a());
        recyclerView.setHasFixedSize(true);
        C22912t.m54409g(recyclerView, false);
        final Context context = recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.kubi.home.main.HomeUIHelper$initCardListView$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(RecyclerView.State state, int[] extraLayoutSpace) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(extraLayoutSpace, "extraLayoutSpace");
                super.calculateExtraLayoutSpace(state, extraLayoutSpace);
                extraLayoutSpace[0] = extraLayoutSpace[0] + (C5267e0.m6182d() / 2);
                extraLayoutSpace[1] = extraLayoutSpace[1] + (C5267e0.m6182d() / 2);
            }
        });
        recyclerView.addItemDecoration(new C14596b());
        recyclerView.addOnScrollListener(new C14597c(onMoveStart, onMoveStop, this, function0));
    }

    /* JADX INFO: renamed from: w */
    public final void m29352w(boolean z11, @NotNull List<BaseCardData> cards) {
        FrameLayout frameLayout;
        RecyclerView recyclerView;
        FrameLayout frameLayout2;
        Intrinsics.checkNotNullParameter(cards, "cards");
        final boolean zM29350s = m29350s(cards);
        if (zM29350s) {
            C37516e0 c37516e0 = this.f25731a;
            if (c37516e0 != null && (frameLayout2 = c37516e0.f83243e) != null) {
                C27046k.m66692g(frameLayout2, 0);
            }
        } else {
            int iM58272j = EdgeToEdgeCompat.f48106a.m58272j() + C27040e.m66658b(44) + C27040e.m66658b(12);
            C37516e0 c37516e1 = this.f25731a;
            if (c37516e1 != null && (frameLayout = c37516e1.f83243e) != null) {
                C27046k.m66692g(frameLayout, iM58272j);
            }
        }
        if (!z11) {
            m29343A(zM29350s);
            return;
        }
        C37516e0 c37516e2 = this.f25731a;
        if (c37516e2 == null || (recyclerView = c37516e2.f83240b) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.kubi.home.main.y
            @Override // java.lang.Runnable
            public final void run() {
                HomeUIHelper.m29340x(this.f25829b, zM29350s);
            }
        }, 500L);
    }

    public HomeUIHelper(@Nullable C37516e0 c37516e0) {
        this.f25731a = c37516e0;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m29337p(View view, HomeUIHelper homeUIHelper, boolean z11) {
        boolean z12;
        if (C27039d.m66650j(Integer.valueOf(view.getTop())) < (-homeUIHelper.m29345D())) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11) {
            homeUIHelper.m29344B(z12);
        } else {
            homeUIHelper.m29346E(z12);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final void m29342z(HomeUIHelper homeUIHelper, boolean z11) {
        homeUIHelper.m29343A(z11);
    }
}
