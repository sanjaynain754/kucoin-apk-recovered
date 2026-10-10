package com.swmansion.rnscreens;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.swmansion.rnscreens.bottomsheet.DimmingViewManager;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.swmansion.rnscreens.bottomsheet.SheetUtilsKt;
import com.swmansion.rnscreens.events.ScreenAnimationDelegate;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.swmansion.rnscreens.events.ScreenEventEmitter;
import com.swmansion.rnscreens.ext.ViewExtKt;
import com.swmansion.rnscreens.stack.views.ScreensCoordinatorLayout;
import com.swmansion.rnscreens.transition.ExternalBoundaryValuesEvaluator;
import com.swmansion.rnscreens.utils.DeviceUtils;
import com.swmansion.rnscreens.utils.ViewBackgroundUtilsKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ScreenStackFragment.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\b\u0010.\u001a\u00020\rH\u0016J\b\u0010/\u001a\u00020\u001bH\u0016J\u0010\u00100\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\rH\u0016J\u0010\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\rH\u0016J\b\u00105\u001a\u00020\u001bH\u0016J\b\u00106\u001a\u00020\u001bH\u0016J\b\u00107\u001a\u00020\u001bH\u0002J\r\u00108\u001a\u00020\u001bH\u0000¢\u0006\u0002\b9J\r\u0010:\u001a\u00020\u001bH\u0000¢\u0006\u0002\b;J\u0012\u0010<\u001a\u00020\u001b2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J$\u0010?\u001a\u00020\u00102\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010D\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\"\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020IH\u0016J\"\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020IH\u0016J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040OH\u0002J\u0017\u0010P\u001a\u0004\u0018\u00010I2\u0006\u0010Q\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020\u0004H\u0002J\b\u0010T\u001a\u00020\u001bH\u0016J\b\u0010U\u001a\u00020\u001bH\u0016J\u0010\u0010V\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020XH\u0016J\u0018\u0010Y\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020X2\u0006\u0010@\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020\rH\u0002J\u0010\u0010\\\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020XH\u0002J\n\u0010]\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010^\u001a\u00020\rH\u0016J\b\u0010_\u001a\u00020\u001bH\u0016J\u0012\u0010`\u001a\u00020'2\b\b\u0002\u0010a\u001a\u00020\rH\u0002J\b\u0010b\u001a\u00020)H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R7\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006c"}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreenStackFragment;", "Lcom/swmansion/rnscreens/ScreenFragment;", "Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;", "screenView", "Lcom/swmansion/rnscreens/Screen;", "<init>", "(Lcom/swmansion/rnscreens/Screen;)V", "()V", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "isToolbarShadowHidden", "", "isToolbarTranslucent", "lastFocusedChild", "Landroid/view/View;", TUIConstants.TUIConversation.SEARCH_VIEW, "Lcom/swmansion/rnscreens/CustomSearchView;", "getSearchView", "()Lcom/swmansion/rnscreens/CustomSearchView;", "setSearchView", "(Lcom/swmansion/rnscreens/CustomSearchView;)V", "onSearchViewCreate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "getOnSearchViewCreate", "()Lkotlin/jvm/functions/Function1;", "setOnSearchViewCreate", "(Lkotlin/jvm/functions/Function1;)V", "coordinatorLayout", "Lcom/swmansion/rnscreens/stack/views/ScreensCoordinatorLayout;", "screenStack", "Lcom/swmansion/rnscreens/ScreenStack;", "getScreenStack", "()Lcom/swmansion/rnscreens/ScreenStack;", "dimmingDelegate", "Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager;", "sheetDelegate", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;", "getSheetDelegate$react_native_screens_release", "()Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;", "setSheetDelegate$react_native_screens_release", "(Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;)V", "isTranslucent", "removeToolbar", "setToolbar", "setToolbarShadowHidden", ViewProps.HIDDEN, "setToolbarTranslucent", "translucent", "onContainerUpdate", "onViewAnimationEnd", "notifyViewAppearTransitionEnd", "dismissSelf", "dismissSelf$react_native_screens_release", "onSheetCornerRadiusChange", "onSheetCornerRadiusChange$react_native_screens_release", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "nextAnim", "onCreateAnimator", "Landroid/animation/Animator;", "createBottomSheetBehaviour", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "resolveBackgroundColor", "screen", "(Lcom/swmansion/rnscreens/Screen;)Ljava/lang/Integer;", "attachShapeToScreen", "onStart", "onStop", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onCreateOptionsMenu", "Landroid/view/MenuInflater;", "shouldShowSearchBar", "updateToolbarMenu", "findLastFocusedChild", "canNavigateBack", "dismissFromContainer", "requireDimmingDelegate", "forceCreation", "requireSheetDelegate", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScreenStackFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStackFragment.kt\ncom/swmansion/rnscreens/ScreenStackFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,491:1\n1#2:492\n*E\n"})
public final class ScreenStackFragment extends ScreenFragment implements ScreenStackFragmentWrapper {

    @Nullable
    private AppBarLayout appBarLayout;
    private ScreensCoordinatorLayout coordinatorLayout;

    @Nullable
    private DimmingViewManager dimmingDelegate;
    private boolean isToolbarShadowHidden;
    private boolean isToolbarTranslucent;

    @Nullable
    private View lastFocusedChild;

    @Nullable
    private Function1<? super CustomSearchView, Unit> onSearchViewCreate;

    @Nullable
    private CustomSearchView searchView;

    @Nullable
    private SheetDelegate sheetDelegate;

    @Nullable
    private Toolbar toolbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ValidFragment"})
    public ScreenStackFragment(@NotNull Screen screenView) {
        super(screenView);
        Intrinsics.checkNotNullParameter(screenView, "screenView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float onCreateAnimator$lambda$12(Number number) {
        return Float.valueOf(0.0f);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        ScreensCoordinatorLayout screensCoordinatorLayout = null;
        if (!SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        final DimmingViewManager dimmingViewManagerRequireDimmingDelegate$default = requireDimmingDelegate$default(this, false, 1, null);
        if (enter) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, dimmingViewManagerRequireDimmingDelegate$default.getMaxAlpha());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.o
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$10$lambda$9(dimmingViewManagerRequireDimmingDelegate$default, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ExternalBoundaryValuesEvaluator(new Function1() { // from class: com.swmansion.rnscreens.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Float.valueOf(ScreenStackFragment.onCreateAnimator$lambda$11(this.f68458b, (Number) obj));
                }
            }, new Function1() { // from class: com.swmansion.rnscreens.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ScreenStackFragment.onCreateAnimator$lambda$12((Number) obj);
                }
            }), Float.valueOf(getScreen().getHeight()), Float.valueOf(0.0f));
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.s
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$15$lambda$14(this.f68459b, valueAnimator);
                }
            });
            AnimatorSet.Builder builderPlay = dimmingViewManagerRequireDimmingDelegate$default.willDimForDetentIndex(getScreen(), getScreen().getSheetInitialDetentIndex()) ? animatorSet.play(valueAnimatorOfObject) : null;
            if (builderPlay != null) {
                builderPlay.with(valueAnimatorOfFloat);
            }
        } else {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(dimmingViewManagerRequireDimmingDelegate$default.getDimmingView().getAlpha(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$19$lambda$18(dimmingViewManagerRequireDimmingDelegate$default, valueAnimator);
                }
            });
            ScreensCoordinatorLayout screensCoordinatorLayout2 = this.coordinatorLayout;
            if (screensCoordinatorLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            } else {
                screensCoordinatorLayout = screensCoordinatorLayout2;
            }
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, screensCoordinatorLayout.getBottom() - getScreen().getTop());
            valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.u
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$22$lambda$21(this.f68461b, valueAnimator);
                }
            });
            animatorSet.play(valueAnimatorOfFloat2).with(valueAnimatorOfFloat3);
        }
        animatorSet.addListener(new ScreenAnimationDelegate(this, new ScreenEventEmitter(getScreen()), enter ? ScreenAnimationDelegate.AnimationType.ENTER : ScreenAnimationDelegate.AnimationType.EXIT));
        return animatorSet;
    }

    public ScreenStackFragment() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    private final BottomSheetBehavior<Screen> createBottomSheetBehaviour() {
        return new BottomSheetBehavior<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$10$lambda$9(DimmingViewManager dimmingViewManager, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f11 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f11 != null) {
            dimmingViewManager.getDimmingView().setAlpha(f11.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$15$lambda$14(ScreenStackFragment screenStackFragment, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f11 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f11 != null) {
            screenStackFragment.getScreen().setTranslationY(f11.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$19$lambda$18(DimmingViewManager dimmingViewManager, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f11 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f11 != null) {
            dimmingViewManager.getDimmingView().setAlpha(f11.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$22$lambda$21(ScreenStackFragment screenStackFragment, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f11 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f11 != null) {
            screenStackFragment.getScreen().setTranslationY(f11.floatValue());
        }
    }

    private final DimmingViewManager requireDimmingDelegate(boolean forceCreation) {
        DimmingViewManager dimmingViewManager = this.dimmingDelegate;
        if (dimmingViewManager == null || forceCreation) {
            if (dimmingViewManager != null) {
                dimmingViewManager.invalidate(getScreen().getSheetBehavior());
            }
            this.dimmingDelegate = new DimmingViewManager(getScreen().getReactContext(), getScreen());
        }
        DimmingViewManager dimmingViewManager2 = this.dimmingDelegate;
        Intrinsics.checkNotNull(dimmingViewManager2);
        return dimmingViewManager2;
    }

    public static /* synthetic */ DimmingViewManager requireDimmingDelegate$default(ScreenStackFragment screenStackFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return screenStackFragment.requireDimmingDelegate(z11);
    }

    private final SheetDelegate requireSheetDelegate() {
        if (this.sheetDelegate == null) {
            this.sheetDelegate = new SheetDelegate(getScreen());
        }
        SheetDelegate sheetDelegate = this.sheetDelegate;
        Intrinsics.checkNotNull(sheetDelegate);
        return sheetDelegate;
    }

    @Nullable
    public final Function1<CustomSearchView, Unit> getOnSearchViewCreate() {
        return this.onSearchViewCreate;
    }

    @Nullable
    public final CustomSearchView getSearchView() {
        return this.searchView;
    }

    @Nullable
    /* JADX INFO: renamed from: getSheetDelegate$react_native_screens_release, reason: from getter */
    public final SheetDelegate getSheetDelegate() {
        return this.sheetDelegate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        updateToolbarMenu(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        CoordinatorLayout.Behavior scrollingViewBehavior;
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        AppBarLayout appBarLayout3;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.coordinatorLayout = new ScreensCoordinatorLayout(contextRequireContext, this);
        Screen screen = getScreen();
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -1);
        if (SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            scrollingViewBehavior = createBottomSheetBehaviour();
        } else {
            scrollingViewBehavior = this.isToolbarTranslucent ? null : new AppBarLayout.ScrollingViewBehavior();
        }
        layoutParams.setBehavior(scrollingViewBehavior);
        screen.setLayoutParams(layoutParams);
        ScreensCoordinatorLayout screensCoordinatorLayout = this.coordinatorLayout;
        if (screensCoordinatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            screensCoordinatorLayout = null;
        }
        screensCoordinatorLayout.addView(ViewExtKt.recycle(getScreen()));
        if (SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            getScreen().setClipToOutline(true);
            attachShapeToScreen(getScreen());
            getScreen().setElevation(getScreen().getSheetElevation());
            SheetDelegate sheetDelegateRequireSheetDelegate = requireSheetDelegate();
            BottomSheetBehavior<Screen> sheetBehavior = getScreen().getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior);
            SheetDelegate.m72120xec3b14d9(sheetDelegateRequireSheetDelegate, sheetBehavior, null, 0, 6, null);
            DimmingViewManager dimmingViewManagerRequireDimmingDelegate = requireDimmingDelegate(true);
            Screen screen2 = getScreen();
            ScreensCoordinatorLayout screensCoordinatorLayout2 = this.coordinatorLayout;
            if (screensCoordinatorLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout2 = null;
            }
            dimmingViewManagerRequireDimmingDelegate.onViewHierarchyCreated(screen2, screensCoordinatorLayout2);
            Screen screen3 = getScreen();
            BottomSheetBehavior<Screen> sheetBehavior2 = getScreen().getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior2);
            dimmingViewManagerRequireDimmingDelegate.onBehaviourAttached(screen3, sheetBehavior2);
            ScreenContainer container2 = getScreen().getContainer();
            Intrinsics.checkNotNull(container2);
            ScreensCoordinatorLayout screensCoordinatorLayout3 = this.coordinatorLayout;
            if (screensCoordinatorLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout3 = null;
            }
            screensCoordinatorLayout3.measure(View.MeasureSpec.makeMeasureSpec(container2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container2.getHeight(), 1073741824));
            ScreensCoordinatorLayout screensCoordinatorLayout4 = this.coordinatorLayout;
            if (screensCoordinatorLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout4 = null;
            }
            screensCoordinatorLayout4.layout(0, 0, container2.getWidth(), container2.getHeight());
            ViewCompat.setWindowInsetsAnimationCallback(getScreen(), new WindowInsetsAnimationCompat.Callback() { // from class: com.swmansion.rnscreens.ScreenStackFragment.onCreateView.5
                @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
                public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
                    return insets;
                }
            });
        } else {
            Context context = getContext();
            if (context != null) {
                appBarLayout = new AppBarLayout(context);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setLayoutParams(new AppBarLayout.LayoutParams(-1, -2));
            } else {
                appBarLayout = null;
            }
            this.appBarLayout = appBarLayout;
            ScreensCoordinatorLayout screensCoordinatorLayout5 = this.coordinatorLayout;
            if (screensCoordinatorLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout5 = null;
            }
            screensCoordinatorLayout5.addView(this.appBarLayout);
            if (this.isToolbarShadowHidden && (appBarLayout3 = this.appBarLayout) != null) {
                appBarLayout3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.toolbar;
            if (toolbar != null && (appBarLayout2 = this.appBarLayout) != null) {
                appBarLayout2.addView(ViewExtKt.recycle(toolbar));
            }
            setHasOptionsMenu(true);
        }
        ScreensCoordinatorLayout screensCoordinatorLayout6 = this.coordinatorLayout;
        if (screensCoordinatorLayout6 != null) {
            return screensCoordinatorLayout6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(@NotNull Menu menu) {
        ScreenStackHeaderConfig headerConfig;
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (!getScreen().isTranslucent() || ((headerConfig = getScreen().getHeaderConfig()) != null && !headerConfig.getIsHeaderHidden())) {
            updateToolbarMenu(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        View view = this.lastFocusedChild;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (DeviceUtils.INSTANCE.isPlatformAndroidTV(getContext())) {
            this.lastFocusedChild = findLastFocusedChild();
        }
        super.onStop();
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void removeToolbar() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null && (toolbar = this.toolbar) != null && toolbar.getParent() == appBarLayout) {
            appBarLayout.removeView(toolbar);
        }
        this.toolbar = null;
    }

    public final void setOnSearchViewCreate(@Nullable Function1<? super CustomSearchView, Unit> function1) {
        this.onSearchViewCreate = function1;
    }

    public final void setSearchView(@Nullable CustomSearchView customSearchView) {
        this.searchView = customSearchView;
    }

    public final void setSheetDelegate$react_native_screens_release(@Nullable SheetDelegate sheetDelegate) {
        this.sheetDelegate = sheetDelegate;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbarShadowHidden(boolean hidden) {
        if (this.isToolbarShadowHidden != hidden) {
            AppBarLayout appBarLayout = this.appBarLayout;
            if (appBarLayout != null) {
                appBarLayout.setElevation(hidden ? 0.0f : PixelUtil.toPixelFromDIP(4.0f));
            }
            AppBarLayout appBarLayout2 = this.appBarLayout;
            if (appBarLayout2 != null) {
                appBarLayout2.setStateListAnimator(null);
            }
            this.isToolbarShadowHidden = hidden;
        }
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbarTranslucent(boolean translucent) {
        if (this.isToolbarTranslucent != translucent) {
            ViewGroup.LayoutParams layoutParams = getScreen().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(translucent ? null : new AppBarLayout.ScrollingViewBehavior());
            this.isToolbarTranslucent = translucent;
        }
    }

    private final void attachShapeToScreen(Screen screen) {
        float pixelFromDIP = PixelUtil.toPixelFromDIP(screen.getSheetCornerRadius());
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        int iIntValue = 0;
        builder.setTopLeftCorner(0, pixelFromDIP);
        builder.setTopRightCorner(0, pixelFromDIP);
        ShapeAppearanceModel shapeAppearanceModelBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelBuild, "build(...)");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        Integer numResolveBackgroundColor = resolveBackgroundColor(screen);
        if (numResolveBackgroundColor != null) {
            iIntValue = numResolveBackgroundColor.intValue();
        }
        materialShapeDrawable.setTint(iIntValue);
        screen.setBackground(materialShapeDrawable);
    }

    private final View findLastFocusedChild() {
        View screen = getScreen();
        while (screen != null) {
            if (screen.isFocused()) {
                return screen;
            }
            if (screen instanceof ViewGroup) {
                screen = ((ViewGroup) screen).getFocusedChild();
            } else {
                screen = null;
            }
        }
        return null;
    }

    private final ScreenStack getScreenStack() {
        ScreenContainer container = getScreen().getContainer();
        if (container instanceof ScreenStack) {
            return (ScreenStack) container;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }

    private final void notifyViewAppearTransitionEnd() {
        ViewParent parent;
        View view = getView();
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof ScreenStack) {
            ((ScreenStack) parent).onViewAppearTransitionEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float onCreateAnimator$lambda$11(ScreenStackFragment screenStackFragment, Number number) {
        return screenStackFragment.getScreen().getHeight();
    }

    private final Integer resolveBackgroundColor(Screen screen) {
        ColorDrawable colorDrawable;
        MaterialShapeDrawable materialShapeDrawable;
        Integer numValueOf;
        ColorStateList tintList;
        Drawable background = screen.getBackground();
        if (background instanceof ColorDrawable) {
            colorDrawable = (ColorDrawable) background;
        } else {
            colorDrawable = null;
        }
        if (colorDrawable != null) {
            numValueOf = Integer.valueOf(colorDrawable.getColor());
        } else {
            Drawable background2 = screen.getBackground();
            if (background2 instanceof MaterialShapeDrawable) {
                materialShapeDrawable = (MaterialShapeDrawable) background2;
            } else {
                materialShapeDrawable = null;
            }
            if (materialShapeDrawable != null && (tintList = materialShapeDrawable.getTintList()) != null) {
                numValueOf = Integer.valueOf(tintList.getDefaultColor());
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        ScreenContentWrapper contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return null;
        }
        return ViewBackgroundUtilsKt.resolveBackgroundColor(contentWrapper);
    }

    private final boolean shouldShowSearchBar() {
        int configSubviewsCount;
        ScreenStackHeaderConfig headerConfig = getScreen().getHeaderConfig();
        if (headerConfig != null) {
            configSubviewsCount = headerConfig.getConfigSubviewsCount();
        } else {
            configSubviewsCount = 0;
        }
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i11 = 0; i11 < configSubviewsCount; i11++) {
                if (headerConfig.getConfigSubview(i11).getType() == ScreenStackHeaderSubview.Type.SEARCH_BAR) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void updateToolbarMenu(Menu menu) {
        menu.clear();
        if (shouldShowSearchBar()) {
            Context context = getContext();
            if (this.searchView == null && context != null) {
                CustomSearchView customSearchView = new CustomSearchView(context, this);
                this.searchView = customSearchView;
                Function1<? super CustomSearchView, Unit> function1 = this.onSearchViewCreate;
                if (function1 != null) {
                    function1.invoke(customSearchView);
                }
            }
            MenuItem menuItemAdd = menu.add("");
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setActionView(this.searchView);
        }
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public boolean canNavigateBack() {
        ScreenContainer container = getScreen().getContainer();
        if (container instanceof ScreenStack) {
            if (Intrinsics.areEqual(((ScreenStack) container).getRootScreen(), getScreen())) {
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof ScreenStackFragment) {
                    return ((ScreenStackFragment) parentFragment).canNavigateBack();
                }
                return false;
            }
            return true;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void dismissFromContainer() {
        getScreenStack().dismiss(this);
    }

    public final void dismissSelf$react_native_screens_release() {
        if (!isRemoving() || !isDetached()) {
            ThemedReactContext reactContext = getScreen().getReactContext();
            int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getScreen().getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new ScreenDismissedEvent(surfaceId, getScreen().getId()));
            }
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public boolean isTranslucent() {
        return getScreen().isTranslucent();
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onContainerUpdate() {
        super.onContainerUpdate();
        ScreenStackHeaderConfig headerConfig = getScreen().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.onUpdate();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public final void onSheetCornerRadiusChange$react_native_screens_release() {
        getScreen().onSheetCornerRadiusChange$react_native_screens_release();
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onViewAnimationEnd() {
        super.onViewAnimationEnd();
        notifyViewAppearTransitionEnd();
        getScreen().endRemovalTransition();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbar(@NotNull Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.setScrollFlags(0);
        toolbar.setLayoutParams(layoutParams);
        this.toolbar = toolbar;
    }
}
