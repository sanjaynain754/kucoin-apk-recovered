package com.trtc.uikit.livekit.features.audiencecontainer.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.trtc.uikit.livekit.R$id;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AudiencePlayingRootView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "gestureDetector", "Landroid/view/GestureDetector;", "playingView", "Landroid/view/View;", "recoverLayout", "recoverImageView", "Landroid/widget/ImageView;", "onFinishInflate", "", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "startMoveXAnimation", "startX", "", "endX", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AudiencePlayingRootView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f78605f = new Companion(null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final LinearInterpolator f78606g = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    @NotNull
    public final GestureDetector f78607b;

    /* JADX INFO: renamed from: c */
    public View f78608c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f78609d;

    /* JADX INFO: renamed from: e */
    public ImageView f78610e;

    /* JADX INFO: compiled from: AudiencePlayingRootView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$Companion;", "", "<init>", "()V", "MOVE_ANIMATION_DURATION_MS", "", "MOVE_ANIMATION_INTERPOLATOR", "Landroid/view/animation/LinearInterpolator;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudiencePlayingRootView$a */
    /* JADX INFO: compiled from: AudiencePlayingRootView.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J*\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016¨\u0006\r"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "", "velocityY", "onScroll", "distanceX", "distanceY", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36206a extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e11, MotionEvent e12, float velocityX, float velocityY) {
            Intrinsics.checkNotNullParameter(e12, "e2");
            return super.onFling(e11, e12, velocityX, velocityY);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e11, MotionEvent e12, float distanceX, float distanceY) {
            Intrinsics.checkNotNullParameter(e12, "e2");
            return super.onScroll(e11, e12, distanceX, distanceY);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudiencePlayingRootView$b */
    /* JADX INFO: compiled from: AudiencePlayingRootView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$startMoveXAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onFinished", "cancel", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36207b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f78612b;

        public C36207b(float f11) {
            this.f78612b = f11;
        }

        /* JADX INFO: renamed from: a */
        public final void m80800a(boolean z11) {
            float x11;
            ImageView imageView = AudiencePlayingRootView.this.f78610e;
            FrameLayout frameLayout = null;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recoverImageView");
                imageView = null;
            }
            imageView.setEnabled(true);
            if (z11) {
                View view = AudiencePlayingRootView.this.f78608c;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playingView");
                    view = null;
                }
                x11 = view.getX();
            } else {
                x11 = this.f78612b;
            }
            View view2 = AudiencePlayingRootView.this.f78608c;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playingView");
                view2 = null;
            }
            if (x11 == view2.getWidth()) {
                FrameLayout frameLayout2 = AudiencePlayingRootView.this.f78609d;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recoverLayout");
                } else {
                    frameLayout = frameLayout2;
                }
                frameLayout.setVisibility(0);
                return;
            }
            FrameLayout frameLayout3 = AudiencePlayingRootView.this.f78609d;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recoverLayout");
            } else {
                frameLayout = frameLayout3;
            }
            frameLayout.setVisibility(8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            m80800a(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            m80800a(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AudiencePlayingRootView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AudiencePlayingRootView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public static final void m80798e(AudiencePlayingRootView audiencePlayingRootView, View view) {
        ImageView imageView = audiencePlayingRootView.f78610e;
        View view2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recoverImageView");
            imageView = null;
        }
        if (imageView.isEnabled()) {
            ImageView imageView2 = audiencePlayingRootView.f78610e;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recoverImageView");
                imageView2 = null;
            }
            imageView2.setEnabled(false);
            View view3 = audiencePlayingRootView.f78608c;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playingView");
            } else {
                view2 = view3;
            }
            audiencePlayingRootView.m80799f(view2.getX(), 0.0f);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m80799f(float f11, float f12) {
        View view = this.f78608c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playingView");
            view = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "X", f11, f12);
        objectAnimatorOfFloat.setInterpolator(f78606g);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new C36207b(f12));
        objectAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f78607b.onTouchEvent(event)) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        int action = event.getAction();
        if (action == 1 || action == 3) {
            View view = this.f78608c;
            View view2 = null;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playingView");
                view = null;
            }
            float width = view.getWidth();
            View view3 = this.f78608c;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playingView");
            } else {
                view2 = view3;
            }
            float x11 = view2.getX();
            if (x11 <= width / 2) {
                width = 0.0f;
            }
            m80799f(x11, width);
        }
        return super.onTouchEvent(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudiencePlayingRootView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78607b = new GestureDetector(context, new C36206a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R$id.fl_playing);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78608c = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.fl_recover);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78609d = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.iv_recover);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78610e = (ImageView) viewFindViewById3;
        FrameLayout frameLayout = this.f78609d;
        ImageView imageView = null;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recoverLayout");
            frameLayout = null;
        }
        frameLayout.setVisibility(8);
        ImageView imageView2 = this.f78610e;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recoverImageView");
        } else {
            imageView = imageView2;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudiencePlayingRootView.m80798e(this.f78724b, view);
            }
        });
    }
}
