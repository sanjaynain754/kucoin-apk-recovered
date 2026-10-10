package com.swmansion.rnscreens.bottomsheet;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.bottomsheet.DimmingViewManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: DimmingViewManager.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0000X\u0080D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m90084d2 = {"Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager;", "", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "Lcom/swmansion/rnscreens/Screen;", "screen", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/Screen;)V", "Lcom/swmansion/rnscreens/bottomsheet/DimmingView;", "createDimmingView", "(Lcom/swmansion/rnscreens/Screen;)Lcom/swmansion/rnscreens/bottomsheet/DimmingView;", "", "forceCreation", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "requireBottomSheetCallback", "(Lcom/swmansion/rnscreens/Screen;Z)Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/ViewGroup;", "root", "", "onViewHierarchyCreated", "(Lcom/swmansion/rnscreens/Screen;Landroid/view/ViewGroup;)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "onBehaviourAttached", "(Lcom/swmansion/rnscreens/Screen;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "", "index", "willDimForDetentIndex", "(Lcom/swmansion/rnscreens/Screen;I)Z", "invalidate", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "dimmingView", "Lcom/swmansion/rnscreens/bottomsheet/DimmingView;", "getDimmingView$react_native_screens_release", "()Lcom/swmansion/rnscreens/bottomsheet/DimmingView;", "", "maxAlpha", "F", "getMaxAlpha$react_native_screens_release", "()F", "dimmingViewCallback", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDimmingViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DimmingViewManager.kt\ncom/swmansion/rnscreens/bottomsheet/DimmingViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
public final class DimmingViewManager {

    @NotNull
    private final DimmingView dimmingView;

    @Nullable
    private BottomSheetBehavior.BottomSheetCallback dimmingViewCallback;
    private final float maxAlpha;

    @NotNull
    private final ThemedReactContext reactContext;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.bottomsheet.DimmingViewManager$a */
    /* JADX INFO: compiled from: DimmingViewManager.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m90084d2 = {"Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Lcom/swmansion/rnscreens/Screen;", "screen", "Landroid/view/View;", "viewToAnimate", "", "maxAlpha", "<init>", "(Lcom/swmansion/rnscreens/Screen;Landroid/view/View;F)V", "bottomSheet", "", "newState", "", "onStateChanged", "(Landroid/view/View;I)V", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "index", "c", "(I)F", "b", "Lcom/swmansion/rnscreens/Screen;", "getScreen", "()Lcom/swmansion/rnscreens/Screen;", "Landroid/view/View;", "getViewToAnimate", "()Landroid/view/View;", "d", "F", "getMaxAlpha", "()F", "e", "largestUndimmedOffset", "f", "firstDimmedOffset", "g", "intervalLength", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", CmcdData.Factory.STREAMING_FORMAT_HLS, "Landroid/animation/ValueAnimator;", "animator", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33475a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Screen screen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final View viewToAnimate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final float maxAlpha;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public float largestUndimmedOffset;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public float firstDimmedOffset;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public float intervalLength;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public final ValueAnimator animator;

        /* JADX INFO: renamed from: b */
        public static final void m72118b(C33475a c33475a, ValueAnimator it) {
            Intrinsics.checkNotNullParameter(it, "it");
            View view = c33475a.viewToAnimate;
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }

        /* JADX INFO: renamed from: c */
        public final float m72119c(int index) {
            int size = this.screen.getSheetDetents().size();
            if (size == 1) {
                return (index == -1 || index != 0) ? -1.0f : 1.0f;
            }
            if (size == 2) {
                if (index == -1) {
                    return -1.0f;
                }
                if (index != 0) {
                    return index != 1 ? -1.0f : 1.0f;
                }
                return 0.0f;
            }
            if (size != 3 || index == -1) {
                return -1.0f;
            }
            if (index == 0) {
                return 0.0f;
            }
            if (index != 1) {
                return index != 2 ? -1.0f : 1.0f;
            }
            BottomSheetBehavior<Screen> sheetBehavior = this.screen.getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior);
            return sheetBehavior.getHalfExpandedRatio();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NotNull View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            float f11 = this.largestUndimmedOffset;
            if (f11 >= slideOffset || slideOffset >= this.firstDimmedOffset) {
                return;
            }
            this.animator.setCurrentFraction((slideOffset - f11) / this.intervalLength);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NotNull View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (newState == 1 || newState == 2) {
                this.largestUndimmedOffset = m72119c(this.screen.getSheetLargestUndimmedDetentIndex());
                float fM72119c = m72119c(RangesKt.coerceIn(this.screen.getSheetLargestUndimmedDetentIndex() + 1, 0, this.screen.getSheetDetents().size() - 1));
                this.firstDimmedOffset = fM72119c;
                this.intervalLength = fM72119c - this.largestUndimmedOffset;
            }
        }

        public C33475a(@NotNull Screen screen, @NotNull View viewToAnimate, float f11) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(viewToAnimate, "viewToAnimate");
            this.screen = screen;
            this.viewToAnimate = viewToAnimate;
            this.maxAlpha = f11;
            this.largestUndimmedOffset = m72119c(screen.getSheetLargestUndimmedDetentIndex());
            float fM72119c = m72119c(RangesKt.coerceIn(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().size() - 1));
            this.firstDimmedOffset = fM72119c;
            this.intervalLength = fM72119c - this.largestUndimmedOffset;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f11);
            valueAnimatorOfFloat.setDuration(1L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ub0.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DimmingViewManager.C33475a.m72118b(this.f101593b, valueAnimator);
                }
            });
            this.animator = valueAnimatorOfFloat;
        }
    }

    private final DimmingView createDimmingView(final Screen screen) {
        DimmingView dimmingView = new DimmingView(this.reactContext, this.maxAlpha);
        dimmingView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dimmingView.setOnClickListener(new View.OnClickListener() { // from class: ub0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DimmingViewManager.createDimmingView$lambda$2$lambda$1(screen, view);
            }
        });
        return dimmingView;
    }

    private final BottomSheetBehavior.BottomSheetCallback requireBottomSheetCallback(Screen screen, boolean forceCreation) {
        if (this.dimmingViewCallback == null || forceCreation) {
            this.dimmingViewCallback = new C33475a(screen, this.dimmingView, this.maxAlpha);
        }
        BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.dimmingViewCallback;
        Intrinsics.checkNotNull(bottomSheetCallback);
        return bottomSheetCallback;
    }

    public static /* synthetic */ BottomSheetBehavior.BottomSheetCallback requireBottomSheetCallback$default(DimmingViewManager dimmingViewManager, Screen screen, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return dimmingViewManager.requireBottomSheetCallback(screen, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: getDimmingView$react_native_screens_release, reason: from getter */
    public final DimmingView getDimmingView() {
        return this.dimmingView;
    }

    /* JADX INFO: renamed from: getMaxAlpha$react_native_screens_release, reason: from getter */
    public final float getMaxAlpha() {
        return this.maxAlpha;
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    public final void invalidate(@Nullable BottomSheetBehavior<Screen> behavior) {
        BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.dimmingViewCallback;
        if (bottomSheetCallback == null || behavior == null) {
            return;
        }
        behavior.removeBottomSheetCallback(bottomSheetCallback);
    }

    public DimmingViewManager(@NotNull ThemedReactContext reactContext, @NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.reactContext = reactContext;
        this.dimmingView = createDimmingView(screen);
        this.maxAlpha = 0.3f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDimmingView$lambda$2$lambda$1(Screen screen, View view) {
        if (screen.getSheetClosesOnTouchOutside()) {
            Fragment fragment = screen.getFragment();
            Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
            ((ScreenStackFragment) fragment).dismissSelf$react_native_screens_release();
        }
    }

    public final void onBehaviourAttached(@NotNull Screen screen, @NotNull BottomSheetBehavior<Screen> behavior) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        behavior.addBottomSheetCallback(requireBottomSheetCallback(screen, true));
    }

    public final void onViewHierarchyCreated(@NotNull Screen screen, @NotNull ViewGroup root) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(root, "root");
        root.addView(this.dimmingView, 0);
        if (!willDimForDetentIndex(screen, screen.getSheetInitialDetentIndex())) {
            this.dimmingView.setAlpha(0.0f);
        } else {
            this.dimmingView.setAlpha(this.maxAlpha);
        }
    }

    public final boolean willDimForDetentIndex(@NotNull Screen screen, int index) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (index > screen.getSheetLargestUndimmedDetentIndex()) {
            return true;
        }
        return false;
    }
}
