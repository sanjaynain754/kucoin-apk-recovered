package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\b\u001f !\"#$%&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J2\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J$\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0016\u0010\u001a\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0002J&\u0010\u001b\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eH\u0002¨\u0006'"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "collectAnimEffects", "", "animationInfos", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "collectEffects", "operations", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "createTransitionEffect", "transitionInfos", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "firstOut", "lastIn", "findNamedViews", "namedViews", "", "", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "syncAnimations", "retainMatchingViews", "Landroidx/collection/ArrayMap;", "names", "", "AnimationEffect", "AnimationInfo", "AnimatorEffect", "Api24Impl", "Api26Impl", "SpecialEffectsInfo", "TransitionEffect", "TransitionInfo", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1129:1\n288#2,2:1130\n533#2,6:1132\n1360#2:1138\n1446#2,5:1139\n819#2:1144\n847#2,2:1145\n766#2:1147\n857#2,2:1148\n1789#2,3:1150\n1726#2,3:1153\n1855#2,2:1156\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n52#1:1130,2\n58#1:1132,6\n117#1:1138\n117#1:1139,5\n190#1:1144\n190#1:1145,2\n193#1:1147\n193#1:1148,2\n197#1:1150,3\n355#1:1153,3\n366#1:1156,2\n*E\n"})
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "animationInfo", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "getAnimationInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "onCancel", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onCommit", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class AnimationEffect extends SpecialEffectsController.Effect {

        @NotNull
        private final AnimationInfo animationInfo;

        public AnimationEffect(@NotNull AnimationInfo animationInfo) {
            Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        @NotNull
        public final AnimationInfo getAnimationInfo() {
            return this.animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().completeEffect(this);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animationInfo.isVisibilityUnchanged()) {
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            Context context = container.getContext();
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            AnimationInfo animationInfo = this.animationInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation2 = animation.animation;
            if (animation2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                view.startAnimation(animation2);
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            container.startViewTransition(view);
            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view);
            endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$AnimationEffect$onCommit$1(operation, container, view, this));
            view.startAnimation(endViewTransitionAnimation);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has started.");
            }
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Z)V", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "isAnimLoaded", "getAnimation", "context", "Landroid/content/Context;", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class AnimationInfo extends SpecialEffectsInfo {

        @Nullable
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(@NotNull SpecialEffectsController.Operation operation, boolean z11) {
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.isPop = z11;
        }

        @Nullable
        public final FragmentAnim.AnimationOrAnimator getAnimation(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = animationOrAnimatorLoadAnimation;
            this.isAnimLoaded = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "animatorInfo", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "animator", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "getAnimatorInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "isSeekingSupported", "", "()Z", "onCancel", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onCommit", "onProgress", "backEvent", "Landroidx/activity/BackEventCompat;", "onStart", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class AnimatorEffect extends SpecialEffectsController.Effect {

        @Nullable
        private AnimatorSet animator;

        @NotNull
        private final AnimationInfo animatorInfo;

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: isSeekingSupported */
        public boolean getIsSeekingSupported() {
            return true;
        }

        public AnimatorEffect(@NotNull AnimationInfo animatorInfo) {
            Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        @Nullable
        public final AnimatorSet getAnimator() {
            return this.animator;
        }

        @NotNull
        public final AnimationInfo getAnimatorInfo() {
            return this.animatorInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            if (!operation.getIsSeeking()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                Api26Impl.INSTANCE.reverse(animatorSet);
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(operation);
                sb2.append(" has been canceled");
                sb2.append(operation.getIsSeeking() ? " with seeking." : C33978va.f72339h);
                sb2.append(' ');
                Log.v(FragmentManager.TAG, sb2.toString());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(@NotNull BackEventCompat backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().mTransitioning) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long j11 = Api24Impl.INSTANCE.totalDuration(animatorSet);
            long progress = (long) (backEvent.getProgress() * j11);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == j11) {
                progress = j11 - 1;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation);
            }
            Api26Impl.INSTANCE.setCurrentPlayTime(animatorSet, progress);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(@NotNull final ViewGroup container) {
            final AnimatorEffect animatorEffect;
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animatorInfo.isVisibilityUnchanged()) {
                return;
            }
            Context context = container.getContext();
            AnimationInfo animationInfo = this.animatorInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            this.animator = animation != null ? animation.animator : null;
            final SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            Fragment fragment = operation.getFragment();
            final boolean z11 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
            final View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorEffect = this;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator anim) {
                        Intrinsics.checkNotNullParameter(anim, "anim");
                        container.endViewTransition(view);
                        if (z11) {
                            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                            View viewToAnimate = view;
                            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                            finalState.applyState(viewToAnimate, container);
                        }
                        animatorEffect.getAnimatorInfo().getOperation().completeEffect(animatorEffect);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has ended.");
                        }
                    }
                });
            } else {
                animatorEffect = this;
            }
            AnimatorSet animatorSet2 = animatorEffect.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final void setAnimator(@Nullable AnimatorSet animatorSet) {
            this.animator = animatorSet;
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @RequiresApi(24)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;", "", "()V", "totalDuration", "", "animatorSet", "Landroid/animation/AnimatorSet;", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Api24Impl {

        @NotNull
        public static final Api24Impl INSTANCE = new Api24Impl();

        @DoNotInline
        public final long totalDuration(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }

        private Api24Impl() {
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @RequiresApi(26)
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;", "", "()V", "reverse", "", "animatorSet", "Landroid/animation/AnimatorSet;", "setCurrentPlayTime", "time", "", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Api26Impl {

        @NotNull
        public static final Api26Impl INSTANCE = new Api26Impl();

        @DoNotInline
        public final void reverse(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        @DoNotInline
        public final void setCurrentPlayTime(@NotNull AnimatorSet animatorSet, long time) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(time);
        }

        private Api26Impl() {
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "isVisibilityUnchanged", "", "()Z", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static class SpecialEffectsInfo {

        @NotNull
        private final SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(@NotNull SpecialEffectsController.Operation operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
        }

        @NotNull
        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final boolean isVisibilityUnchanged() {
            View view = this.operation.getFragment().mView;
            SpecialEffectsController.Operation.State stateAsOperationState = view != null ? SpecialEffectsController.Operation.State.INSTANCE.asOperationState(view) : null;
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (stateAsOperationState == finalState) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (stateAsOperationState == state || finalState == state) ? false : true;
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001BÝ\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ(\u0010;\u001a\u00020<2\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010>\u001a\u00020\u000eH\u0002J@\u0010?\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0004\u0012\u00020\u000b0@2\u0006\u0010A\u001a\u00020B2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010C\u001a\u00020<2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010D\u001a\u00020<2\u0006\u0010A\u001a\u00020BH\u0016J\u0018\u0010E\u001a\u00020<2\u0006\u0010F\u001a\u00020G2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010H\u001a\u00020<2\u0006\u0010A\u001a\u00020BH\u0016J6\u0010I\u001a\u00020<2\u0016\u0010J\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010A\u001a\u00020B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020<0LH\u0002R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR!\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R!\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010'R\u0014\u0010(\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R!\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u00103\u001a\u000204¢\u0006\u000e\n\u0000\u0012\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b:\u0010'¨\u0006M"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "transitionInfos", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "firstOut", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "lastIn", "transitionImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "sharedElementTransition", "", "sharedElementFirstOutViews", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementLastInViews", "sharedElementNameMapping", "Landroidx/collection/ArrayMap;", "", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "isPop", "", "(Ljava/util/List;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/FragmentTransitionImpl;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;Z)V", "controller", "getController", "()Ljava/lang/Object;", "setController", "(Ljava/lang/Object;)V", "getEnteringNames", "()Ljava/util/ArrayList;", "getExitingNames", "getFirstOut", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "getFirstOutViews", "()Landroidx/collection/ArrayMap;", "()Z", "isSeekingSupported", "getLastIn", "getLastInViews", "getSharedElementFirstOutViews", "getSharedElementLastInViews", "getSharedElementNameMapping", "getSharedElementTransition", "getTransitionImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "getTransitionInfos", "()Ljava/util/List;", "transitionSignal", "Landroidx/core/os/CancellationSignal;", "getTransitionSignal$annotations", "()V", "getTransitionSignal", "()Landroidx/core/os/CancellationSignal;", "transitioning", "getTransitioning", "captureTransitioningViews", "", "transitioningViews", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "createMergedTransition", "Lkotlin/Pair;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onCancel", "onCommit", "onProgress", "backEvent", "Landroidx/activity/BackEventCompat;", "onStart", "runTransition", "enteringViews", "executeTransition", "Lkotlin/Function0;", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1129:1\n1726#2,3:1130\n1726#2,3:1133\n1855#2,2:1136\n1549#2:1138\n1620#2,3:1139\n1855#2,2:1142\n1855#2,2:1145\n1549#2:1147\n1620#2,3:1148\n1855#2,2:1151\n1#3:1144\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n*L\n722#1:1130,3\n731#1:1133,3\n739#1:1136,2\n768#1:1138\n768#1:1139,3\n768#1:1142,2\n824#1:1145,2\n845#1:1147\n845#1:1148,3\n845#1:1151,2\n*E\n"})
    public static final class TransitionEffect extends SpecialEffectsController.Effect {

        @Nullable
        private Object controller;

        @NotNull
        private final ArrayList<String> enteringNames;

        @NotNull
        private final ArrayList<String> exitingNames;

        @Nullable
        private final SpecialEffectsController.Operation firstOut;

        @NotNull
        private final ArrayMap<String, View> firstOutViews;
        private final boolean isPop;

        @Nullable
        private final SpecialEffectsController.Operation lastIn;

        @NotNull
        private final ArrayMap<String, View> lastInViews;

        @NotNull
        private final ArrayList<View> sharedElementFirstOutViews;

        @NotNull
        private final ArrayList<View> sharedElementLastInViews;

        @NotNull
        private final ArrayMap<String, String> sharedElementNameMapping;

        @Nullable
        private final Object sharedElementTransition;

        @NotNull
        private final FragmentTransitionImpl transitionImpl;

        @NotNull
        private final List<TransitionInfo> transitionInfos;

        @NotNull
        private final CancellationSignal transitionSignal;

        private final void runTransition(ArrayList<View> enteringViews, ViewGroup container, Function0<Unit> executeTransition) {
            FragmentTransition.setViewVisibility(enteringViews, 4);
            ArrayList<String> arrayListPrepareSetNameOverridesReordered = this.transitionImpl.prepareSetNameOverridesReordered(this.sharedElementLastInViews);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, ">>>>> Beginning transition <<<<<");
                Log.v(FragmentManager.TAG, ">>>>> SharedElementFirstOutViews <<<<<");
                for (View sharedElementFirstOutViews : this.sharedElementFirstOutViews) {
                    Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = sharedElementFirstOutViews;
                    Log.v(FragmentManager.TAG, "View: " + view + " Name: " + ViewCompat.getTransitionName(view));
                }
                Log.v(FragmentManager.TAG, ">>>>> SharedElementLastInViews <<<<<");
                for (View sharedElementLastInViews : this.sharedElementLastInViews) {
                    Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = sharedElementLastInViews;
                    Log.v(FragmentManager.TAG, "View: " + view2 + " Name: " + ViewCompat.getTransitionName(view2));
                }
            }
            executeTransition.invoke();
            this.transitionImpl.setNameOverridesReordered(container, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListPrepareSetNameOverridesReordered, this.sharedElementNameMapping);
            FragmentTransition.setViewVisibility(enteringViews, 0);
            this.transitionImpl.swapSharedElementTargets(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        private final void captureTransitioningViews(ArrayList<View> transitioningViews, View view) {
            if (!(view instanceof ViewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View child = viewGroup.getChildAt(i11);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    captureTransitioningViews(transitioningViews, child);
                }
            }
        }

        private final Pair<ArrayList<View>, Object> createMergedTransition(ViewGroup container, final SpecialEffectsController.Operation lastIn, final SpecialEffectsController.Operation firstOut) {
            lastIn = lastIn;
            View view = new View(container.getContext());
            final Rect rect = new Rect();
            Iterator<TransitionInfo> it = this.transitionInfos.iterator();
            boolean z11 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().hasSharedElementTransition() && firstOut != null && lastIn != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    FragmentTransition.callSharedElementStartEnd(lastIn.getFragment(), firstOut.getFragment(), this.isPop, this.firstOutViews, true);
                    OneShotPreDrawListener.add(container, new Runnable() { // from class: androidx.fragment.app.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$12(lastIn, firstOut, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        Intrinsics.checkNotNullExpressionValue(str, "exitingNames[0]");
                        view2 = this.firstOutViews.get(str);
                        this.transitionImpl.setEpicenter(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[0]");
                        final View view3 = this.lastInViews.get(str2);
                        if (view3 != null) {
                            final FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                            OneShotPreDrawListener.add(container, new Runnable() { // from class: androidx.fragment.app.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$13(fragmentTransitionImpl, view3, rect);
                                }
                            });
                            z11 = true;
                        }
                    }
                    this.transitionImpl.setSharedElementTargets(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    FragmentTransitionImpl fragmentTransitionImpl2 = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    fragmentTransitionImpl2.scheduleRemoveTargets(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<TransitionInfo> it2 = this.transitionInfos.iterator();
            Object objMergeTransitionsTogether = null;
            Object objMergeTransitionsTogether2 = null;
            while (it2.hasNext()) {
                TransitionInfo next = it2.next();
                SpecialEffectsController.Operation operation = next.getOperation();
                z11 = z11;
                Object objCloneTransition = this.transitionImpl.cloneTransition(next.getTransition());
                if (objCloneTransition != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    Iterator<TransitionInfo> it3 = it2;
                    View view4 = operation.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                    captureTransitioningViews(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation == firstOut || operation == lastIn)) {
                        if (operation == firstOut) {
                            arrayList2.removeAll(CollectionsKt.toSet(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(CollectionsKt.toSet(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.addTarget(objCloneTransition, view);
                    } else {
                        this.transitionImpl.addTargets(objCloneTransition, arrayList2);
                        this.transitionImpl.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList2, null, null, null, null);
                        if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation.setAwaitingContainerChanges(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation.getFragment().mView);
                            this.transitionImpl.scheduleHideFragmentView(objCloneTransition, operation.getFragment().mView, arrayList3);
                            OneShotPreDrawListener.add(container, new Runnable() { // from class: androidx.fragment.app.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$14(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z11) {
                            this.transitionImpl.setEpicenter(objCloneTransition, rect);
                        }
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Entering Transition: " + objCloneTransition);
                            Log.v(FragmentManager.TAG, ">>>>> EnteringViews <<<<<");
                            for (View transitioningViews : arrayList2) {
                                Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                                Log.v(FragmentManager.TAG, "View: " + transitioningViews);
                            }
                        }
                    } else {
                        this.transitionImpl.setEpicenter(objCloneTransition, view2);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Exiting Transition: " + objCloneTransition);
                            Log.v(FragmentManager.TAG, ">>>>> ExitingViews <<<<<");
                            for (View transitioningViews2 : arrayList2) {
                                Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                                Log.v(FragmentManager.TAG, "View: " + transitioningViews2);
                            }
                        }
                    }
                    if (next.getIsOverlapAllowed()) {
                        objMergeTransitionsTogether = this.transitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether, objCloneTransition, null);
                    } else {
                        objMergeTransitionsTogether2 = this.transitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether2, objCloneTransition, null);
                    }
                    it2 = it3;
                }
            }
            Object objMergeTransitionsInSequence = this.transitionImpl.mergeTransitionsInSequence(objMergeTransitionsTogether, objMergeTransitionsTogether2, this.sharedElementTransition);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Final merged transition: " + objMergeTransitionsInSequence);
            }
            return new Pair<>(arrayList, objMergeTransitionsInSequence);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$13(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
            Intrinsics.checkNotNullParameter(impl, "$impl");
            Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.getBoundsOnScreen(view, lastInEpicenterRect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$14(ArrayList transitioningViews) {
            Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
            FragmentTransition.setViewVisibility(transitioningViews, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCommit$lambda$11$lambda$10(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
            }
            operation.completeEffect(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onStart$lambda$6$lambda$4(Ref.ObjectRef seekCancelLambda) {
            Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
            Function0 function0 = (Function0) seekCancelLambda.element;
            if (function0 != null) {
                function0.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onStart$lambda$6$lambda$5(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
            }
            operation.completeEffect(this$0);
        }

        @Nullable
        public final Object getController() {
            return this.controller;
        }

        @NotNull
        public final ArrayList<String> getEnteringNames() {
            return this.enteringNames;
        }

        @NotNull
        public final ArrayList<String> getExitingNames() {
            return this.exitingNames;
        }

        @Nullable
        public final SpecialEffectsController.Operation getFirstOut() {
            return this.firstOut;
        }

        @NotNull
        public final ArrayMap<String, View> getFirstOutViews() {
            return this.firstOutViews;
        }

        @Nullable
        public final SpecialEffectsController.Operation getLastIn() {
            return this.lastIn;
        }

        @NotNull
        public final ArrayMap<String, View> getLastInViews() {
            return this.lastInViews;
        }

        @NotNull
        public final ArrayList<View> getSharedElementFirstOutViews() {
            return this.sharedElementFirstOutViews;
        }

        @NotNull
        public final ArrayList<View> getSharedElementLastInViews() {
            return this.sharedElementLastInViews;
        }

        @NotNull
        public final ArrayMap<String, String> getSharedElementNameMapping() {
            return this.sharedElementNameMapping;
        }

        @Nullable
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        @NotNull
        public final FragmentTransitionImpl getTransitionImpl() {
            return this.transitionImpl;
        }

        @NotNull
        public final List<TransitionInfo> getTransitionInfos() {
            return this.transitionInfos;
        }

        @NotNull
        public final CancellationSignal getTransitionSignal() {
            return this.transitionSignal;
        }

        public final boolean getTransitioning() {
            List<TransitionInfo> list = this.transitionInfos;
            if (list != null && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((TransitionInfo) it.next()).getOperation().getFragment().mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: isPop, reason: from getter */
        public final boolean getIsPop() {
            return this.isPop;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: isSeekingSupported */
        public boolean getIsSeekingSupported() {
            if (!this.transitionImpl.isSeekingSupported()) {
                return false;
            }
            List<TransitionInfo> list = this.transitionInfos;
            if (list == null || !list.isEmpty()) {
                for (TransitionInfo transitionInfo : list) {
                    if (Build.VERSION.SDK_INT < 34 || transitionInfo.getTransition() == null || !this.transitionImpl.isSeekingSupported(transitionInfo.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.isSeekingSupported(obj);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.transitionSignal.cancel();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@NotNull final ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                for (TransitionInfo transitionInfo : this.transitionInfos) {
                    SpecialEffectsController.Operation operation = transitionInfo.getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                    }
                    transitionInfo.getOperation().completeEffect(this);
                }
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                Intrinsics.checkNotNull(obj);
                fragmentTransitionImpl.animateToEnd(obj);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> pairCreateMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
            ArrayList<View> arrayListComponent1 = pairCreateMergedTransition.component1();
            final Object objComponent2 = pairCreateMergedTransition.component2();
            List<TransitionInfo> list = this.transitionInfos;
            ArrayList<SpecialEffectsController.Operation> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TransitionInfo) it.next()).getOperation());
            }
            for (final SpecialEffectsController.Operation operation2 : arrayList) {
                this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), objComponent2, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.TransitionEffect.onCommit$lambda$11$lambda$10(operation2, this);
                    }
                });
            }
            runTransition(arrayListComponent1, container, new Function0<Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.getTransitionImpl().beginDelayedTransition(container, objComponent2);
                }
            });
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(@NotNull BackEventCompat backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.setCurrentPlayTime(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(@NotNull final ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((TransitionInfo) it.next()).getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            if (getTransitioning() && this.sharedElementTransition != null && !getIsSeekingSupported()) {
                Log.i(FragmentManager.TAG, "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (getIsSeekingSupported() && getTransitioning()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Pair<ArrayList<View>, Object> pairCreateMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
                ArrayList<View> arrayListComponent1 = pairCreateMergedTransition.component1();
                final Object objComponent2 = pairCreateMergedTransition.component2();
                List<TransitionInfo> list = this.transitionInfos;
                ArrayList<SpecialEffectsController.Operation> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((TransitionInfo) it2.next()).getOperation());
                }
                for (final SpecialEffectsController.Operation operation2 : arrayList) {
                    this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), objComponent2, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$4(objectRef);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$5(operation2, this);
                        }
                    });
                }
                runTransition(arrayListComponent1, container, new Function0<Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4

                    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2 */
                    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
                    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1129:1\n1855#2,2:1130\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$2\n*L\n799#1:1130,2\n*E\n"})
                    public static final class C25172 extends Lambda implements Function0<Unit> {
                        final /* synthetic */ ViewGroup $container;
                        final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

                        @Override // p852kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C25172(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup) {
                            super(0);
                            this.this$0 = transitionEffect;
                            this.$container = viewGroup;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animating to start");
                            }
                            FragmentTransitionImpl transitionImpl = this.this$0.getTransitionImpl();
                            Object controller = this.this$0.getController();
                            Intrinsics.checkNotNull(controller);
                            final DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                            final ViewGroup viewGroup = this.$container;
                            transitionImpl.animateToStart(controller, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0026: INVOKE 
                                  (r0v3 'transitionImpl' androidx.fragment.app.FragmentTransitionImpl)
                                  (r1v1 'controller' java.lang.Object)
                                  (wrap java.lang.Runnable:0x0023: CONSTRUCTOR 
                                  (r2v0 'transitionEffect' androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect A[DONT_INLINE])
                                  (r3v0 'viewGroup' android.view.ViewGroup A[DONT_INLINE])
                                 A[MD:(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect, android.view.ViewGroup):void (m), WRAPPED] call: androidx.fragment.app.i.<init>(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect, android.view.ViewGroup):void type: CONSTRUCTOR)
                                 VIRTUAL call: androidx.fragment.app.FragmentTransitionImpl.animateToStart(java.lang.Object, java.lang.Runnable):void A[MD:(java.lang.Object, java.lang.Runnable):void (m)] in method: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.2.invoke():void, file: classes34.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.fragment.app.i, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 15 more
                                */
                            /*
                                this = this;
                                r0 = 2
                                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                                if (r0 == 0) goto Le
                                java.lang.String r0 = "FragmentManager"
                                java.lang.String r1 = "Animating to start"
                                android.util.Log.v(r0, r1)
                            Le:
                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r5.this$0
                                androidx.fragment.app.FragmentTransitionImpl r0 = r0.getTransitionImpl()
                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r5.this$0
                                java.lang.Object r1 = r1.getController()
                                p852kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r5.this$0
                                android.view.ViewGroup r3 = r5.$container
                                androidx.fragment.app.i r4 = new androidx.fragment.app.i
                                r4.<init>(r2, r3)
                                r0.animateToStart(r1, r4)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.C25172.invoke2():void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void invoke$lambda$1(DefaultSpecialEffectsController.TransitionEffect this$0, ViewGroup container) {
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(container, "$container");
                            Iterator<T> it = this$0.getTransitionInfos().iterator();
                            while (it.hasNext()) {
                                SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation();
                                View view = operation.getFragment().getView();
                                if (view != null) {
                                    operation.getFinalState().applyState(view, container);
                                }
                            }
                        }
                    }

                    @Override // p852kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r1v6, types: [T, androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2] */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                        transitionEffect.setController(transitionEffect.getTransitionImpl().controlDelayedTransition(container, objComponent2));
                        boolean z11 = this.this$0.getController() != null;
                        Object obj = objComponent2;
                        ViewGroup viewGroup = container;
                        if (!z11) {
                            throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                        }
                        objectRef.element = new C25172(this.this$0, viewGroup);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Started executing operations from " + this.this$0.getFirstOut() + " to " + this.this$0.getLastIn());
                        }
                    }
                });
            }
        }

        public final void setController(@Nullable Object obj) {
            this.controller = obj;
        }

        public TransitionEffect(@NotNull List<TransitionInfo> transitionInfos, @Nullable SpecialEffectsController.Operation operation, @Nullable SpecialEffectsController.Operation operation2, @NotNull FragmentTransitionImpl transitionImpl, @Nullable Object obj, @NotNull ArrayList<View> sharedElementFirstOutViews, @NotNull ArrayList<View> sharedElementLastInViews, @NotNull ArrayMap<String, String> sharedElementNameMapping, @NotNull ArrayList<String> enteringNames, @NotNull ArrayList<String> exitingNames, @NotNull ArrayMap<String, View> firstOutViews, @NotNull ArrayMap<String, View> lastInViews, boolean z11) {
            Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
            Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
            Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
            Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
            Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
            Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
            Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
            Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = operation;
            this.lastIn = operation2;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z11;
            this.transitionSignal = new CancellationSignal();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$12(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, TransitionEffect this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), this$0.isPop, this$0.lastInViews, false);
        }

        public static /* synthetic */ void getTransitionSignal$annotations() {
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\u0006\u0010\u0014\u001a\u00020\u0005R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "providesSharedElementTransition", "(Landroidx/fragment/app/SpecialEffectsController$Operation;ZZ)V", "handlingImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "isOverlapAllowed", "()Z", "sharedElementTransition", "", "getSharedElementTransition", "()Ljava/lang/Object;", "transition", "getTransition", "hasSharedElementTransition", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;

        @Nullable
        private final Object sharedElementTransition;

        @Nullable
        private final Object transition;

        @Nullable
        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(@NotNull SpecialEffectsController.Operation operation, boolean z11, boolean z12) {
            Object returnTransition;
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                returnTransition = z11 ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z11 ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            this.isOverlapAllowed = operation.getFinalState() == state ? z11 ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap() : true;
            this.sharedElementTransition = z12 ? z11 ? operation.getFragment().getSharedElementReturnTransition() : operation.getFragment().getSharedElementEnterTransition() : null;
        }

        @Nullable
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        @Nullable
        public final Object getTransition() {
            return this.transition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        /* JADX INFO: renamed from: isOverlapAllowed, reason: from getter */
        public final boolean getIsOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        private final FragmentTransitionImpl getHandlingImpl(Object transition) {
            if (transition == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(transition)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(transition)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(@NotNull ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    private final void collectAnimEffects(List<AnimationInfo> animationInfos) {
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = animationInfos.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((AnimationInfo) it.next()).getOperation().getEffects$fragment_release());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z11 = false;
        for (AnimationInfo animationInfo : animationInfos) {
            Context context = getContainer().getContext();
            SpecialEffectsController.Operation operation = animationInfo.getOperation();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation != null) {
                if (animation.animator == null) {
                    arrayList.add(animationInfo);
                } else {
                    Fragment fragment = operation.getFragment();
                    if (operation.getEffects$fragment_release().isEmpty()) {
                        if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation.setAwaitingContainerChanges(false);
                        }
                        operation.addEffect(new AnimatorEffect(animationInfo));
                        z11 = true;
                    } else if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (AnimationInfo animationInfo2 : arrayList) {
            SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (zIsEmpty) {
                if (!z11) {
                    operation2.addEffect(new AnimationEffect(animationInfo2));
                } else if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    private final void createTransitionEffect(List<TransitionInfo> transitionInfos, boolean isPop, SpecialEffectsController.Operation firstOut, SpecialEffectsController.Operation lastIn) {
        Iterator it;
        ArrayList arrayList;
        FragmentTransitionImpl fragmentTransitionImpl;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        int i11;
        String strFindKeyForValue;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : transitionInfos) {
            if (!((TransitionInfo) obj2).isVisibilityUnchanged()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<TransitionInfo> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (((TransitionInfo) obj3).getHandlingImpl() != null) {
                arrayList5.add(obj3);
            }
        }
        FragmentTransitionImpl fragmentTransitionImpl2 = null;
        Object obj4 = null;
        for (TransitionInfo transitionInfo : arrayList5) {
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl2 != null && handlingImpl != fragmentTransitionImpl2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl2 = handlingImpl;
        }
        if (fragmentTransitionImpl2 == null) {
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayMap arrayMap = new ArrayMap();
        ArrayList<String> arrayList8 = new ArrayList<>();
        ArrayList<String> arrayList9 = new ArrayList<>();
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
        ArrayList<String> sharedElementTargetNames = arrayList8;
        Iterator it2 = arrayList5.iterator();
        ArrayList<String> sharedElementSourceNames = arrayList9;
        while (it2.hasNext()) {
            TransitionInfo transitionInfo2 = (TransitionInfo) it2.next();
            if (!transitionInfo2.hasSharedElementTransition() || firstOut == null || lastIn == null) {
                it = it2;
                arrayList = arrayList5;
                fragmentTransitionImpl = fragmentTransitionImpl2;
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
            } else {
                Object objWrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(transitionInfo2.getSharedElementTransition()));
                sharedElementSourceNames = lastIn.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = firstOut.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames2 = firstOut.getFragment().getSharedElementTargetNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames2.size();
                it = it2;
                arrayList = arrayList5;
                int i12 = 0;
                while (i12 < size) {
                    FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i12));
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i12));
                    }
                    i12++;
                    fragmentTransitionImpl2 = fragmentTransitionImpl3;
                }
                fragmentTransitionImpl = fragmentTransitionImpl2;
                sharedElementTargetNames = lastIn.getFragment().getSharedElementTargetNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                Pair pairM90091to = !isPop ? TuplesKt.m90091to(firstOut.getFragment().getExitTransitionCallback(), lastIn.getFragment().getEnterTransitionCallback()) : TuplesKt.m90091to(firstOut.getFragment().getEnterTransitionCallback(), lastIn.getFragment().getExitTransitionCallback());
                SharedElementCallback sharedElementCallback = (SharedElementCallback) pairM90091to.component1();
                SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pairM90091to.component2();
                int size2 = sharedElementSourceNames.size();
                int i13 = 0;
                while (true) {
                    arrayList2 = arrayList6;
                    if (i13 >= size2) {
                        break;
                    }
                    ArrayList arrayList10 = arrayList7;
                    String str = sharedElementSourceNames.get(i13);
                    Intrinsics.checkNotNullExpressionValue(str, "exitingNames[i]");
                    String str2 = sharedElementTargetNames.get(i13);
                    Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[i]");
                    arrayMap.put(str, str2);
                    i13++;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList10;
                }
                arrayList3 = arrayList7;
                int i14 = 2;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                    Iterator<String> it3 = sharedElementTargetNames.iterator();
                    while (true) {
                        i11 = i14;
                        if (!it3.hasNext()) {
                            break;
                        }
                        Iterator<String> it4 = it3;
                        Log.v(FragmentManager.TAG, "Name: " + it3.next());
                        objWrapTransitionInSet = objWrapTransitionInSet;
                        i14 = i11;
                        it3 = it4;
                    }
                    obj = objWrapTransitionInSet;
                    Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                    for (Iterator<String> it5 = sharedElementSourceNames.iterator(); it5.hasNext(); it5 = it5) {
                        Log.v(FragmentManager.TAG, "Name: " + it5.next());
                    }
                } else {
                    obj = objWrapTransitionInSet;
                    i11 = 2;
                }
                View view = firstOut.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view, "firstOut.fragment.mView");
                findNamedViews(arrayMap2, view);
                arrayMap2.retainAll(sharedElementSourceNames);
                if (sharedElementCallback != null) {
                    if (FragmentManager.isLoggingEnabled(i11)) {
                        Log.v(FragmentManager.TAG, "Executing exit callback for operation " + firstOut);
                    }
                    sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap2);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i15 = size3 - 1;
                            String str3 = sharedElementSourceNames.get(size3);
                            Intrinsics.checkNotNullExpressionValue(str3, "exitingNames[i]");
                            String str4 = str3;
                            View view2 = arrayMap2.get(str4);
                            if (view2 == null) {
                                arrayMap.remove(str4);
                            } else if (!Intrinsics.areEqual(str4, ViewCompat.getTransitionName(view2))) {
                                arrayMap.put(ViewCompat.getTransitionName(view2), (String) arrayMap.remove(str4));
                            }
                            if (i15 < 0) {
                                break;
                            } else {
                                size3 = i15;
                            }
                        }
                    }
                } else {
                    arrayMap.retainAll(arrayMap2.keySet());
                }
                View view3 = lastIn.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view3, "lastIn.fragment.mView");
                findNamedViews(arrayMap3, view3);
                arrayMap3.retainAll(sharedElementTargetNames);
                arrayMap3.retainAll(arrayMap.values());
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.isLoggingEnabled(i11)) {
                        Log.v(FragmentManager.TAG, "Executing enter callback for operation " + lastIn);
                    }
                    sharedElementCallback2.onMapSharedElements(sharedElementTargetNames, arrayMap3);
                    int size4 = sharedElementTargetNames.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i16 = size4 - 1;
                            String str5 = sharedElementTargetNames.get(size4);
                            Intrinsics.checkNotNullExpressionValue(str5, "enteringNames[i]");
                            String str6 = str5;
                            View view4 = arrayMap3.get(str6);
                            if (view4 == null) {
                                String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, str6);
                                if (strFindKeyForValue2 != null) {
                                    arrayMap.remove(strFindKeyForValue2);
                                }
                            } else if (!Intrinsics.areEqual(str6, ViewCompat.getTransitionName(view4)) && (strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap, str6)) != null) {
                                arrayMap.put(strFindKeyForValue, ViewCompat.getTransitionName(view4));
                            }
                            if (i16 < 0) {
                                break;
                            } else {
                                size4 = i16;
                            }
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap, arrayMap3);
                }
                Collection<String> collectionKeySet = arrayMap.keySet();
                Intrinsics.checkNotNullExpressionValue(collectionKeySet, "sharedElementNameMapping.keys");
                retainMatchingViews(arrayMap2, collectionKeySet);
                Collection<String> collectionValues = arrayMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                retainMatchingViews(arrayMap3, collectionValues);
                if (arrayMap.isEmpty()) {
                    Log.i(FragmentManager.TAG, "Ignoring shared elements transition " + obj + " between " + firstOut + " and " + lastIn + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                    arrayList2.clear();
                    arrayList3.clear();
                    it2 = it;
                    arrayList5 = arrayList;
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    obj4 = null;
                } else {
                    obj4 = obj;
                }
            }
            it2 = it;
            arrayList5 = arrayList;
            fragmentTransitionImpl2 = fragmentTransitionImpl;
            arrayList6 = arrayList2;
            arrayList7 = arrayList3;
        }
        ArrayList arrayList11 = arrayList5;
        FragmentTransitionImpl fragmentTransitionImpl4 = fragmentTransitionImpl2;
        ArrayList arrayList12 = arrayList6;
        ArrayList arrayList13 = arrayList7;
        if (obj4 == null) {
            if (arrayList11.isEmpty()) {
                return;
            }
            Iterator it6 = arrayList11.iterator();
            while (it6.hasNext()) {
                if (((TransitionInfo) it6.next()).getTransition() == null) {
                }
            }
            return;
        }
        TransitionEffect transitionEffect = new TransitionEffect(arrayList11, firstOut, lastIn, fragmentTransitionImpl4, obj4, arrayList12, arrayList13, arrayMap, sharedElementTargetNames, sharedElementSourceNames, arrayMap2, arrayMap3, isPop);
        Iterator it7 = arrayList11.iterator();
        while (it7.hasNext()) {
            ((TransitionInfo) it7.next()).getOperation().addEffect(transitionEffect);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    @Override // androidx.fragment.app.SpecialEffectsController
    public void collectEffects(@NotNull List<? extends SpecialEffectsController.Operation> operations, boolean isPop) {
        SpecialEffectsController.Operation operation;
        Object next;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator<T> it = operations.iterator();
        while (true) {
            operation = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) next;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.INSTANCE;
            View view = operation2.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State stateAsOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (stateAsOperationState == state && operation2.getFinalState() != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) next;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
        while (listIterator.hasPrevious()) {
            SpecialEffectsController.Operation operationPrevious = listIterator.previous();
            SpecialEffectsController.Operation operation4 = operationPrevious;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.INSTANCE;
            View view2 = operation4.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            SpecialEffectsController.Operation.State stateAsOperationState2 = companion2.asOperationState(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (stateAsOperationState2 != state2 && operation4.getFinalState() == state2) {
                operation = operationPrevious;
                break;
            }
        }
        SpecialEffectsController.Operation operation5 = operation;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Executing operations from " + operation3 + " to " + operation5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        syncAnimations(operations);
        for (final SpecialEffectsController.Operation operation6 : operations) {
            arrayList.add(new AnimationInfo(operation6, isPop));
            boolean z11 = false;
            if (isPop) {
                if (operation6 == operation3) {
                    z11 = true;
                }
            } else if (operation6 == operation5) {
                z11 = true;
            }
            arrayList2.add(new TransitionInfo(operation6, isPop, z11));
            operation6.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.collectEffects$lambda$2(this.f2712b, operation6);
                }
            });
        }
        createTransitionEffect(arrayList2, isPop, operation3, operation5);
        collectAnimEffects(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectEffects$lambda$2(DefaultSpecialEffectsController this$0, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.applyContainerChangesToOperation$fragment_release(operation);
    }

    private final void findNamedViews(Map<String, View> namedViews, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            namedViews.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View child = viewGroup.getChildAt(i11);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    findNamedViews(namedViews, child);
                }
            }
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, final Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = arrayMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.retainAll(entries, new Function1<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.retainMatchingViews.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Map.Entry<String, View> entry) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                return Boolean.valueOf(CollectionsKt.contains(collection, ViewCompat.getTransitionName(entry.getValue())));
            }
        });
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> operations) {
        Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt.last((List) operations)).getFragment();
        for (SpecialEffectsController.Operation operation : operations) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }
}
