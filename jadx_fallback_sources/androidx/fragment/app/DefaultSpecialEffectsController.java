package androidx.fragment.app;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\b\u001f !\"#$%&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J2\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J$\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0016\u0010\u001a\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0002J&\u0010\u001b\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eH\u0002¨\u0006'"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "container", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "collectAnimEffects", "", "animationInfos", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "collectEffects", "operations", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "createTransitionEffect", "transitionInfos", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "firstOut", "lastIn", "findNamedViews", "namedViews", "", "", "Landroid/view/View;", "view", "syncAnimations", "retainMatchingViews", "Landroidx/collection/ArrayMap;", "names", "", "AnimationEffect", "AnimationInfo", "AnimatorEffect", "Api24Impl", "Api26Impl", "SpecialEffectsInfo", "TransitionEffect", "TransitionInfo", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1129:1\n288#2,2:1130\n533#2,6:1132\n1360#2:1138\n1446#2,5:1139\n819#2:1144\n847#2,2:1145\n766#2:1147\n857#2,2:1148\n1789#2,3:1150\n1726#2,3:1153\n1855#2,2:1156\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n52#1:1130,2\n58#1:1132,6\n117#1:1138\n117#1:1139,5\n190#1:1144\n190#1:1145,2\n193#1:1147\n193#1:1148,2\n197#1:1150,3\n355#1:1153,3\n366#1:1156,2\n*E\n"})
public final class DefaultSpecialEffectsController extends androidx.fragment.app.SpecialEffectsController {

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @kotlin.Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "animationInfo", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "getAnimationInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "onCancel", "", "container", "Landroid/view/ViewGroup;", "onCommit", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class AnimationEffect extends androidx.fragment.app.SpecialEffectsController.Effect {

        @org.jetbrains.annotations.NotNull
        private final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animationInfo;

        public AnimationEffect(@org.jetbrains.annotations.NotNull androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo r2) {
                r1 = this;
                java.lang.String r0 = "animationInfo"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.animationInfo = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo getAnimationInfo() {
                r1 = this;
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r1.animationInfo
                return r0
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@org.jetbrains.annotations.NotNull android.view.ViewGroup r3) {
                r2 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r2.animationInfo
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r0.getOperation()
                androidx.fragment.app.Fragment r1 = r0.getFragment()
                android.view.View r1 = r1.mView
                r1.clearAnimation()
                r3.endViewTransition(r1)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r3 = r2.animationInfo
                androidx.fragment.app.SpecialEffectsController$Operation r3 = r3.getOperation()
                r3.completeEffect(r2)
                r3 = 2
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                if (r3 == 0) goto L42
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r1 = "Animation from operation "
                r3.append(r1)
                r3.append(r0)
                java.lang.String r0 = " has been cancelled."
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r3)
            L42:
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@org.jetbrains.annotations.NotNull android.view.ViewGroup r6) {
                r5 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r5.animationInfo
                boolean r0 = r0.isVisibilityUnchanged()
                if (r0 == 0) goto L17
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r6 = r5.animationInfo
                androidx.fragment.app.SpecialEffectsController$Operation r6 = r6.getOperation()
                r6.completeEffect(r5)
                return
            L17:
                android.content.Context r0 = r6.getContext()
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r1 = r5.animationInfo
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r1.getOperation()
                androidx.fragment.app.Fragment r2 = r1.getFragment()
                android.view.View r2 = r2.mView
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r3 = r5.animationInfo
                java.lang.String r4 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = r3.getAnimation(r0)
                java.lang.String r3 = "Required value was null."
                if (r0 == 0) goto L8b
                android.view.animation.Animation r0 = r0.animation
                if (r0 == 0) goto L85
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r1.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r3 == r4) goto L4f
                r2.startAnimation(r0)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r6 = r5.animationInfo
                androidx.fragment.app.SpecialEffectsController$Operation r6 = r6.getOperation()
                r6.completeEffect(r5)
                return
            L4f:
                r6.startViewTransition(r2)
                androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r3 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
                r3.<init>(r0, r6, r2)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1 r0 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1
                r0.<init>(r1, r6, r2, r5)
                r3.setAnimationListener(r0)
                r2.startAnimation(r3)
                r6 = 2
                boolean r6 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
                if (r6 == 0) goto L84
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Animation from operation "
                r6.append(r0)
                r6.append(r1)
                java.lang.String r0 = " has started."
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r6)
            L84:
                return
            L85:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r6.<init>(r3)
                throw r6
            L8b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r6.<init>(r3)
                throw r6
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Z)V", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "isAnimLoaded", "getAnimation", "context", "Landroid/content/Context;", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class AnimationInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {

        @org.jetbrains.annotations.Nullable
        private androidx.fragment.app.FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        public AnimationInfo(@org.jetbrains.annotations.NotNull androidx.fragment.app.SpecialEffectsController.Operation r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                r1.isPop = r3
                return
        }

        @org.jetbrains.annotations.Nullable
        public final androidx.fragment.app.FragmentAnim.AnimationOrAnimator getAnimation(@org.jetbrains.annotations.NotNull android.content.Context r5) {
                r4 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                boolean r0 = r4.isAnimLoaded
                if (r0 == 0) goto Lc
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = r4.animation
                return r5
            Lc:
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r4.getOperation()
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r4.getOperation()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r3 = 1
                if (r1 != r2) goto L23
                r1 = r3
                goto L24
            L23:
                r1 = 0
            L24:
                boolean r2 = r4.isPop
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = androidx.fragment.app.FragmentAnim.loadAnimation(r5, r0, r1, r2)
                r4.animation = r5
                r4.isAnimLoaded = r3
                return r5
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @kotlin.Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "animatorInfo", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "animator", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "getAnimatorInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "isSeekingSupported", "", "()Z", "onCancel", "", "container", "Landroid/view/ViewGroup;", "onCommit", "onProgress", "backEvent", "Landroidx/activity/BackEventCompat;", "onStart", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class AnimatorEffect extends androidx.fragment.app.SpecialEffectsController.Effect {

        @org.jetbrains.annotations.Nullable
        private android.animation.AnimatorSet animator;

        @org.jetbrains.annotations.NotNull
        private final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animatorInfo;

        public AnimatorEffect(@org.jetbrains.annotations.NotNull androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo r2) {
                r1 = this;
                java.lang.String r0 = "animatorInfo"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.animatorInfo = r2
                return
        }

        @org.jetbrains.annotations.Nullable
        public final android.animation.AnimatorSet getAnimator() {
                r1 = this;
                android.animation.AnimatorSet r0 = r1.animator
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo getAnimatorInfo() {
                r1 = this;
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r1.animatorInfo
                return r0
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
                r3 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                android.animation.AnimatorSet r4 = r3.animator
                if (r4 != 0) goto L13
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r4 = r3.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r4 = r4.getOperation()
                r4.completeEffect(r3)
                return
            L13:
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r3.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r0.getOperation()
                boolean r1 = r0.isSeeking()
                if (r1 == 0) goto L2b
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto L2e
                androidx.fragment.app.DefaultSpecialEffectsController$Api26Impl r1 = androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl.INSTANCE
                r1.reverse(r4)
                goto L2e
            L2b:
                r4.end()
            L2e:
                r4 = 2
                boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
                if (r4 == 0) goto L63
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r1 = "Animator from operation "
                r4.append(r1)
                r4.append(r0)
                java.lang.String r1 = " has been canceled"
                r4.append(r1)
                boolean r0 = r0.isSeeking()
                if (r0 == 0) goto L50
                java.lang.String r0 = " with seeking."
                goto L52
            L50:
                java.lang.String r0 = "."
            L52:
                r4.append(r0)
                r0 = 32
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r4)
            L63:
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@org.jetbrains.annotations.NotNull android.view.ViewGroup r3) {
                r2 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r3 = r2.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r3 = r3.getOperation()
                android.animation.AnimatorSet r0 = r2.animator
                if (r0 != 0) goto L19
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r3 = r2.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r3 = r3.getOperation()
                r3.completeEffect(r2)
                return
            L19:
                r0.start()
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto L3e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Animator from operation "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " has started."
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r3)
            L3e:
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(@org.jetbrains.annotations.NotNull androidx.activity.BackEventCompat r11, @org.jetbrains.annotations.NotNull android.view.ViewGroup r12) {
                r10 = this;
                java.lang.String r0 = "backEvent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r12 = r10.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r12 = r12.getOperation()
                android.animation.AnimatorSet r0 = r10.animator
                if (r0 != 0) goto L1e
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r11 = r10.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r11 = r11.getOperation()
                r11.completeEffect(r10)
                return
            L1e:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 34
                if (r1 < r2) goto L94
                androidx.fragment.app.Fragment r1 = r12.getFragment()
                boolean r1 = r1.mTransitioning
                if (r1 == 0) goto L94
                r1 = 2
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
                java.lang.String r3 = "FragmentManager"
                if (r2 == 0) goto L49
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Adding BackProgressCallbacks for Animators to operation "
                r2.append(r4)
                r2.append(r12)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r3, r2)
            L49:
                androidx.fragment.app.DefaultSpecialEffectsController$Api24Impl r2 = androidx.fragment.app.DefaultSpecialEffectsController.Api24Impl.INSTANCE
                long r4 = r2.totalDuration(r0)
                float r11 = r11.getProgress()
                float r2 = (float) r4
                float r11 = r11 * r2
                long r6 = (long) r11
                r8 = 0
                int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                r8 = 1
                if (r11 != 0) goto L5f
                r6 = r8
            L5f:
                int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r11 != 0) goto L65
                long r6 = r4 - r8
            L65:
                boolean r11 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
                if (r11 == 0) goto L8f
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r1 = "Setting currentPlayTime to "
                r11.append(r1)
                r11.append(r6)
                java.lang.String r1 = " for Animator "
                r11.append(r1)
                r11.append(r0)
                java.lang.String r1 = " on operation "
                r11.append(r1)
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                android.util.Log.v(r3, r11)
            L8f:
                androidx.fragment.app.DefaultSpecialEffectsController$Api26Impl r11 = androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl.INSTANCE
                r11.setCurrentPlayTime(r0, r6)
            L94:
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(@org.jetbrains.annotations.NotNull android.view.ViewGroup r8) {
                r7 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r7.animatorInfo
                boolean r0 = r0.isVisibilityUnchanged()
                if (r0 == 0) goto Lf
                r6 = r7
                goto L59
            Lf:
                android.content.Context r0 = r8.getContext()
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r1 = r7.animatorInfo
                java.lang.String r2 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = r1.getAnimation(r0)
                if (r0 == 0) goto L23
                android.animation.AnimatorSet r0 = r0.animator
                goto L24
            L23:
                r0 = 0
            L24:
                r7.animator = r0
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r7.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r5 = r0.getOperation()
                androidx.fragment.app.Fragment r0 = r5.getFragment()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r5.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
                if (r1 != r2) goto L3b
                r1 = 1
            L39:
                r4 = r1
                goto L3d
            L3b:
                r1 = 0
                goto L39
            L3d:
                android.view.View r3 = r0.mView
                r8.startViewTransition(r3)
                android.animation.AnimatorSet r0 = r7.animator
                if (r0 == 0) goto L51
                androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1 r1 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                r6 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r0.addListener(r1)
                goto L52
            L51:
                r6 = r7
            L52:
                android.animation.AnimatorSet r8 = r6.animator
                if (r8 == 0) goto L59
                r8.setTarget(r3)
            L59:
                return
        }

        public final void setAnimator(@org.jetbrains.annotations.Nullable android.animation.AnimatorSet r1) {
                r0 = this;
                r0.animator = r1
                return
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @androidx.annotation.RequiresApi(24)
    @kotlin.Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;", "", "()V", "totalDuration", "", "animatorSet", "Landroid/animation/AnimatorSet;", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Api24Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.fragment.app.DefaultSpecialEffectsController.Api24Impl INSTANCE = null;

        static {
                androidx.fragment.app.DefaultSpecialEffectsController$Api24Impl r0 = new androidx.fragment.app.DefaultSpecialEffectsController$Api24Impl
                r0.<init>()
                androidx.fragment.app.DefaultSpecialEffectsController.Api24Impl.INSTANCE = r0
                return
        }

        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public final long totalDuration(@org.jetbrains.annotations.NotNull android.animation.AnimatorSet r3) {
                r2 = this;
                java.lang.String r0 = "animatorSet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                long r0 = r3.getTotalDuration()
                return r0
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @androidx.annotation.RequiresApi(26)
    @kotlin.Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;", "", "()V", "reverse", "", "animatorSet", "Landroid/animation/AnimatorSet;", "setCurrentPlayTime", "time", "", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Api26Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl INSTANCE = null;

        static {
                androidx.fragment.app.DefaultSpecialEffectsController$Api26Impl r0 = new androidx.fragment.app.DefaultSpecialEffectsController$Api26Impl
                r0.<init>()
                androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl.INSTANCE = r0
                return
        }

        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public final void reverse(@org.jetbrains.annotations.NotNull android.animation.AnimatorSet r2) {
                r1 = this;
                java.lang.String r0 = "animatorSet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r2.reverse()
                return
        }

        @androidx.annotation.DoNotInline
        public final void setCurrentPlayTime(@org.jetbrains.annotations.NotNull android.animation.AnimatorSet r2, long r3) {
                r1 = this;
                java.lang.String r0 = "animatorSet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r2.setCurrentPlayTime(r3)
                return
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "isVisibilityUnchanged", "", "()Z", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static class SpecialEffectsInfo {

        @org.jetbrains.annotations.NotNull
        private final androidx.fragment.app.SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(@org.jetbrains.annotations.NotNull androidx.fragment.app.SpecialEffectsController.Operation r2) {
                r1 = this;
                java.lang.String r0 = "operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.operation = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.fragment.app.SpecialEffectsController.Operation getOperation() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.operation
                return r0
        }

        public final boolean isVisibilityUnchanged() {
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.operation
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r0 = r0.mView
                if (r0 == 0) goto L11
                androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r1.asOperationState(r0)
                goto L12
            L11:
                r0 = 0
            L12:
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.operation
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                if (r0 == r1) goto L23
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L21
                if (r1 == r2) goto L21
                goto L23
            L21:
                r0 = 0
                return r0
            L23:
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @kotlin.Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001BÝ\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ(\u0010;\u001a\u00020<2\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010>\u001a\u00020\u000eH\u0002J@\u0010?\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0004\u0012\u00020\u000b0@2\u0006\u0010A\u001a\u00020B2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010C\u001a\u00020<2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010D\u001a\u00020<2\u0006\u0010A\u001a\u00020BH\u0016J\u0018\u0010E\u001a\u00020<2\u0006\u0010F\u001a\u00020G2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010H\u001a\u00020<2\u0006\u0010A\u001a\u00020BH\u0016J6\u0010I\u001a\u00020<2\u0016\u0010J\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010A\u001a\u00020B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020<0LH\u0002R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR!\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R!\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010'R\u0014\u0010(\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R!\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u00103\u001a\u000204¢\u0006\u000e\n\u0000\u0012\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b:\u0010'¨\u0006M"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "transitionInfos", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "firstOut", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "lastIn", "transitionImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "sharedElementTransition", "", "sharedElementFirstOutViews", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementLastInViews", "sharedElementNameMapping", "Landroidx/collection/ArrayMap;", "", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "isPop", "", "(Ljava/util/List;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/FragmentTransitionImpl;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;Z)V", "controller", "getController", "()Ljava/lang/Object;", "setController", "(Ljava/lang/Object;)V", "getEnteringNames", "()Ljava/util/ArrayList;", "getExitingNames", "getFirstOut", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "getFirstOutViews", "()Landroidx/collection/ArrayMap;", "()Z", "isSeekingSupported", "getLastIn", "getLastInViews", "getSharedElementFirstOutViews", "getSharedElementLastInViews", "getSharedElementNameMapping", "getSharedElementTransition", "getTransitionImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "getTransitionInfos", "()Ljava/util/List;", "transitionSignal", "Landroidx/core/os/CancellationSignal;", "getTransitionSignal$annotations", "()V", "getTransitionSignal", "()Landroidx/core/os/CancellationSignal;", "transitioning", "getTransitioning", "captureTransitioningViews", "", "transitioningViews", "view", "createMergedTransition", "Lkotlin/Pair;", "container", "Landroid/view/ViewGroup;", "onCancel", "onCommit", "onProgress", "backEvent", "Landroidx/activity/BackEventCompat;", "onStart", "runTransition", "enteringViews", "executeTransition", "Lkotlin/Function0;", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1129:1\n1726#2,3:1130\n1726#2,3:1133\n1855#2,2:1136\n1549#2:1138\n1620#2,3:1139\n1855#2,2:1142\n1855#2,2:1145\n1549#2:1147\n1620#2,3:1148\n1855#2,2:1151\n1#3:1144\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n*L\n722#1:1130,3\n731#1:1133,3\n739#1:1136,2\n768#1:1138\n768#1:1139,3\n768#1:1142,2\n824#1:1145,2\n845#1:1147\n845#1:1148,3\n845#1:1151,2\n*E\n"})
    public static final class TransitionEffect extends androidx.fragment.app.SpecialEffectsController.Effect {

        @org.jetbrains.annotations.Nullable
        private java.lang.Object controller;

        @org.jetbrains.annotations.NotNull
        private final java.util.ArrayList<java.lang.String> enteringNames;

        @org.jetbrains.annotations.NotNull
        private final java.util.ArrayList<java.lang.String> exitingNames;

        @org.jetbrains.annotations.Nullable
        private final androidx.fragment.app.SpecialEffectsController.Operation firstOut;

        @org.jetbrains.annotations.NotNull
        private final androidx.collection.ArrayMap<java.lang.String, android.view.View> firstOutViews;
        private final boolean isPop;

        @org.jetbrains.annotations.Nullable
        private final androidx.fragment.app.SpecialEffectsController.Operation lastIn;

        @org.jetbrains.annotations.NotNull
        private final androidx.collection.ArrayMap<java.lang.String, android.view.View> lastInViews;

        @org.jetbrains.annotations.NotNull
        private final java.util.ArrayList<android.view.View> sharedElementFirstOutViews;

        @org.jetbrains.annotations.NotNull
        private final java.util.ArrayList<android.view.View> sharedElementLastInViews;

        @org.jetbrains.annotations.NotNull
        private final androidx.collection.ArrayMap<java.lang.String, java.lang.String> sharedElementNameMapping;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object sharedElementTransition;

        @org.jetbrains.annotations.NotNull
        private final androidx.fragment.app.FragmentTransitionImpl transitionImpl;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> transitionInfos;

        @org.jetbrains.annotations.NotNull
        private final androidx.core.os.CancellationSignal transitionSignal;

        public TransitionEffect(@org.jetbrains.annotations.NotNull java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r2, @org.jetbrains.annotations.Nullable androidx.fragment.app.SpecialEffectsController.Operation r3, @org.jetbrains.annotations.Nullable androidx.fragment.app.SpecialEffectsController.Operation r4, @org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentTransitionImpl r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.NotNull java.util.ArrayList<android.view.View> r7, @org.jetbrains.annotations.NotNull java.util.ArrayList<android.view.View> r8, @org.jetbrains.annotations.NotNull androidx.collection.ArrayMap<java.lang.String, java.lang.String> r9, @org.jetbrains.annotations.NotNull java.util.ArrayList<java.lang.String> r10, @org.jetbrains.annotations.NotNull java.util.ArrayList<java.lang.String> r11, @org.jetbrains.annotations.NotNull androidx.collection.ArrayMap<java.lang.String, android.view.View> r12, @org.jetbrains.annotations.NotNull androidx.collection.ArrayMap<java.lang.String, android.view.View> r13, boolean r14) {
                r1 = this;
                java.lang.String r0 = "transitionInfos"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "transitionImpl"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "sharedElementFirstOutViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "sharedElementLastInViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "sharedElementNameMapping"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r0 = "enteringNames"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "exitingNames"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "firstOutViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r0 = "lastInViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                r1.<init>()
                r1.transitionInfos = r2
                r1.firstOut = r3
                r1.lastIn = r4
                r1.transitionImpl = r5
                r1.sharedElementTransition = r6
                r1.sharedElementFirstOutViews = r7
                r1.sharedElementLastInViews = r8
                r1.sharedElementNameMapping = r9
                r1.enteringNames = r10
                r1.exitingNames = r11
                r1.firstOutViews = r12
                r1.lastInViews = r13
                r1.isPop = r14
                androidx.core.os.CancellationSignal r2 = new androidx.core.os.CancellationSignal
                r2.<init>()
                r1.transitionSignal = r2
                return
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2821a(androidx.fragment.app.SpecialEffectsController.Operation r0, androidx.fragment.app.SpecialEffectsController.Operation r1, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r2) {
                createMergedTransition$lambda$12(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m2822b(androidx.fragment.app.FragmentTransitionImpl r0, android.view.View r1, android.graphics.Rect r2) {
                createMergedTransition$lambda$13(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m2823c(java.util.ArrayList r0) {
                createMergedTransition$lambda$14(r0)
                return
        }

        private final void captureTransitioningViews(java.util.ArrayList<android.view.View> r5, android.view.View r6) {
                r4 = this;
                boolean r0 = r6 instanceof android.view.ViewGroup
                if (r0 == 0) goto L33
                r0 = r6
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                boolean r1 = androidx.core.view.ViewGroupCompat.isTransitionGroup(r0)
                if (r1 == 0) goto L17
                boolean r0 = r5.contains(r6)
                if (r0 != 0) goto L3c
                r5.add(r6)
                return
            L17:
                int r6 = r0.getChildCount()
                r1 = 0
            L1c:
                if (r1 >= r6) goto L3c
                android.view.View r2 = r0.getChildAt(r1)
                int r3 = r2.getVisibility()
                if (r3 != 0) goto L30
                java.lang.String r3 = "child"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r4.captureTransitioningViews(r5, r2)
            L30:
                int r1 = r1 + 1
                goto L1c
            L33:
                boolean r0 = r5.contains(r6)
                if (r0 != 0) goto L3c
                r5.add(r6)
            L3c:
                return
        }

        private final kotlin.Pair<java.util.ArrayList<android.view.View>, java.lang.Object> createMergedTransition(android.view.ViewGroup r31, androidx.fragment.app.SpecialEffectsController.Operation r32, androidx.fragment.app.SpecialEffectsController.Operation r33) {
                r30 = this;
                r0 = r30
                r1 = r31
                r2 = r32
                r3 = r33
                android.view.View r4 = new android.view.View
                android.content.Context r5 = r1.getContext()
                r4.<init>(r5)
                android.graphics.Rect r5 = new android.graphics.Rect
                r5.<init>()
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r6 = r0.transitionInfos
                java.util.Iterator r6 = r6.iterator()
                r8 = 0
                r10 = r8
                r9 = 0
            L1f:
                boolean r11 = r6.hasNext()
                if (r11 == 0) goto Ldd
                java.lang.Object r11 = r6.next()
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r11 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r11
                boolean r11 = r11.hasSharedElementTransition()
                if (r11 == 0) goto L1f
                if (r3 == 0) goto L1f
                if (r2 == 0) goto L1f
                androidx.collection.ArrayMap<java.lang.String, java.lang.String> r11 = r0.sharedElementNameMapping
                boolean r11 = r11.isEmpty()
                if (r11 != 0) goto L1f
                java.lang.Object r11 = r0.sharedElementTransition
                if (r11 == 0) goto L1f
                androidx.fragment.app.Fragment r11 = r2.getFragment()
                androidx.fragment.app.Fragment r12 = r3.getFragment()
                boolean r13 = r0.isPop
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r14 = r0.firstOutViews
                r15 = 1
                androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(r11, r12, r13, r14, r15)
                androidx.fragment.app.c r11 = new androidx.fragment.app.c
                r11.<init>(r2, r3, r0)
                androidx.core.view.OneShotPreDrawListener.add(r1, r11)
                java.util.ArrayList<android.view.View> r11 = r0.sharedElementFirstOutViews
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r12 = r0.firstOutViews
                java.util.Collection r12 = r12.values()
                r11.addAll(r12)
                java.util.ArrayList<java.lang.String> r11 = r0.exitingNames
                boolean r11 = r11.isEmpty()
                if (r11 != 0) goto L88
                java.util.ArrayList<java.lang.String> r9 = r0.exitingNames
                java.lang.Object r9 = r9.get(r8)
                java.lang.String r11 = "exitingNames[0]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r11)
                java.lang.String r9 = (java.lang.String) r9
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r11 = r0.firstOutViews
                java.lang.Object r9 = r11.get(r9)
                android.view.View r9 = (android.view.View) r9
                androidx.fragment.app.FragmentTransitionImpl r11 = r0.transitionImpl
                java.lang.Object r12 = r0.sharedElementTransition
                r11.setEpicenter(r12, r9)
            L88:
                java.util.ArrayList<android.view.View> r11 = r0.sharedElementLastInViews
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r12 = r0.lastInViews
                java.util.Collection r12 = r12.values()
                r11.addAll(r12)
                java.util.ArrayList<java.lang.String> r11 = r0.enteringNames
                boolean r11 = r11.isEmpty()
                if (r11 != 0) goto Lbd
                java.util.ArrayList<java.lang.String> r11 = r0.enteringNames
                java.lang.Object r11 = r11.get(r8)
                java.lang.String r12 = "enteringNames[0]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
                java.lang.String r11 = (java.lang.String) r11
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r12 = r0.lastInViews
                java.lang.Object r11 = r12.get(r11)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto Lbd
                androidx.fragment.app.FragmentTransitionImpl r10 = r0.transitionImpl
                androidx.fragment.app.d r12 = new androidx.fragment.app.d
                r12.<init>(r10, r11, r5)
                androidx.core.view.OneShotPreDrawListener.add(r1, r12)
                r10 = r15
            Lbd:
                androidx.fragment.app.FragmentTransitionImpl r11 = r0.transitionImpl
                java.lang.Object r12 = r0.sharedElementTransition
                java.util.ArrayList<android.view.View> r13 = r0.sharedElementFirstOutViews
                r11.setSharedElementTargets(r12, r4, r13)
                androidx.fragment.app.FragmentTransitionImpl r14 = r0.transitionImpl
                java.lang.Object r15 = r0.sharedElementTransition
                r19 = 0
                java.util.ArrayList<android.view.View> r11 = r0.sharedElementLastInViews
                r16 = 0
                r17 = 0
                r18 = 0
                r20 = r15
                r21 = r11
                r14.scheduleRemoveTargets(r15, r16, r17, r18, r19, r20, r21)
                goto L1f
            Ldd:
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r11 = r0.transitionInfos
                java.util.Iterator r11 = r11.iterator()
                r12 = 0
                r13 = 0
            Lea:
                boolean r14 = r11.hasNext()
                r16 = 2
                java.lang.String r15 = "FragmentManager"
                if (r14 == 0) goto L25d
                java.lang.Object r14 = r11.next()
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r14 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r14
                androidx.fragment.app.SpecialEffectsController$Operation r7 = r14.getOperation()
                androidx.fragment.app.FragmentTransitionImpl r8 = r0.transitionImpl
                r19 = r10
                java.lang.Object r10 = r14.getTransition()
                java.lang.Object r8 = r8.cloneTransition(r10)
                if (r8 == 0) goto L258
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                r28 = r11
                androidx.fragment.app.Fragment r11 = r7.getFragment()
                android.view.View r11 = r11.mView
                r29 = r14
                java.lang.String r14 = "operation.fragment.mView"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r14)
                r0.captureTransitioningViews(r10, r11)
                java.lang.Object r11 = r0.sharedElementTransition
                if (r11 == 0) goto L141
                if (r7 == r3) goto L12c
                if (r7 != r2) goto L141
            L12c:
                if (r7 != r3) goto L138
                java.util.ArrayList<android.view.View> r11 = r0.sharedElementFirstOutViews
                java.util.Set r11 = kotlin.collections.CollectionsKt.toSet(r11)
                r10.removeAll(r11)
                goto L141
            L138:
                java.util.ArrayList<android.view.View> r11 = r0.sharedElementLastInViews
                java.util.Set r11 = kotlin.collections.CollectionsKt.toSet(r11)
                r10.removeAll(r11)
            L141:
                boolean r11 = r10.isEmpty()
                if (r11 == 0) goto L14d
                androidx.fragment.app.FragmentTransitionImpl r11 = r0.transitionImpl
                r11.addTarget(r8, r4)
                goto L194
            L14d:
                androidx.fragment.app.FragmentTransitionImpl r11 = r0.transitionImpl
                r11.addTargets(r8, r10)
                androidx.fragment.app.FragmentTransitionImpl r11 = r0.transitionImpl
                r26 = 0
                r27 = 0
                r24 = 0
                r25 = 0
                r22 = r8
                r21 = r8
                r23 = r10
                r20 = r11
                r20.scheduleRemoveTargets(r21, r22, r23, r24, r25, r26, r27)
                androidx.fragment.app.SpecialEffectsController$Operation$State r11 = r7.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r14 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
                if (r11 != r14) goto L194
                r11 = 0
                r7.setAwaitingContainerChanges(r11)
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>(r10)
                androidx.fragment.app.Fragment r11 = r7.getFragment()
                android.view.View r11 = r11.mView
                r14.remove(r11)
                androidx.fragment.app.FragmentTransitionImpl r11 = r0.transitionImpl
                androidx.fragment.app.Fragment r2 = r7.getFragment()
                android.view.View r2 = r2.mView
                r11.scheduleHideFragmentView(r8, r2, r14)
                androidx.fragment.app.e r2 = new androidx.fragment.app.e
                r2.<init>(r10)
                androidx.core.view.OneShotPreDrawListener.add(r1, r2)
            L194:
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = r7.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                java.lang.String r11 = "View: "
                java.lang.String r14 = "transitioningViews"
                if (r2 != r7) goto L1f0
                r6.addAll(r10)
                if (r19 == 0) goto L1ab
                androidx.fragment.app.FragmentTransitionImpl r2 = r0.transitionImpl
                r2.setEpicenter(r8, r5)
            L1ab:
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r16)
                if (r2 == 0) goto L23a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "Entering Transition: "
                r2.append(r7)
                r2.append(r8)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r15, r2)
                java.lang.String r2 = ">>>>> EnteringViews <<<<<"
                android.util.Log.v(r15, r2)
                java.util.Iterator r2 = r10.iterator()
            L1ce:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L23a
                java.lang.Object r7 = r2.next()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r14)
                android.view.View r7 = (android.view.View) r7
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r11)
                r10.append(r7)
                java.lang.String r7 = r10.toString()
                android.util.Log.v(r15, r7)
                goto L1ce
            L1f0:
                androidx.fragment.app.FragmentTransitionImpl r2 = r0.transitionImpl
                r2.setEpicenter(r8, r9)
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r16)
                if (r2 == 0) goto L23a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "Exiting Transition: "
                r2.append(r7)
                r2.append(r8)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r15, r2)
                java.lang.String r2 = ">>>>> ExitingViews <<<<<"
                android.util.Log.v(r15, r2)
                java.util.Iterator r2 = r10.iterator()
            L218:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L23a
                java.lang.Object r7 = r2.next()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r14)
                android.view.View r7 = (android.view.View) r7
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r11)
                r10.append(r7)
                java.lang.String r7 = r10.toString()
                android.util.Log.v(r15, r7)
                goto L218
            L23a:
                boolean r2 = r29.isOverlapAllowed()
                if (r2 == 0) goto L250
                androidx.fragment.app.FragmentTransitionImpl r2 = r0.transitionImpl
                r7 = 0
                java.lang.Object r12 = r2.mergeTransitionsTogether(r12, r8, r7)
            L247:
                r2 = r32
                r10 = r19
                r11 = r28
            L24d:
                r8 = 0
                goto Lea
            L250:
                r7 = 0
                androidx.fragment.app.FragmentTransitionImpl r2 = r0.transitionImpl
                java.lang.Object r13 = r2.mergeTransitionsTogether(r13, r8, r7)
                goto L247
            L258:
                r2 = r32
                r10 = r19
                goto L24d
            L25d:
                androidx.fragment.app.FragmentTransitionImpl r1 = r0.transitionImpl
                java.lang.Object r2 = r0.sharedElementTransition
                java.lang.Object r1 = r1.mergeTransitionsInSequence(r12, r13, r2)
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r16)
                if (r2 == 0) goto L27f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Final merged transition: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r15, r2)
            L27f:
                kotlin.Pair r2 = new kotlin.Pair
                r2.<init>(r6, r1)
                return r2
        }

        private static final void createMergedTransition$lambda$12(androidx.fragment.app.SpecialEffectsController.Operation r2, androidx.fragment.app.SpecialEffectsController.Operation r3, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r4) {
                java.lang.String r0 = "this$0"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                androidx.fragment.app.Fragment r3 = r3.getFragment()
                boolean r0 = r4.isPop
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r4 = r4.lastInViews
                r1 = 0
                androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(r2, r3, r0, r4, r1)
                return
        }

        private static final void createMergedTransition$lambda$13(androidx.fragment.app.FragmentTransitionImpl r1, android.view.View r2, android.graphics.Rect r3) {
                java.lang.String r0 = "$impl"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                java.lang.String r0 = "$lastInEpicenterRect"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.getBoundsOnScreen(r2, r3)
                return
        }

        private static final void createMergedTransition$lambda$14(java.util.ArrayList r1) {
                java.lang.String r0 = "$transitioningViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                r0 = 4
                androidx.fragment.app.FragmentTransition.setViewVisibility(r1, r0)
                return
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m2824d(kotlin.jvm.internal.Ref.ObjectRef r0) {
                onStart$lambda$6$lambda$4(r0)
                return
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m2825e(androidx.fragment.app.SpecialEffectsController.Operation r0, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r1) {
                onCommit$lambda$11$lambda$10(r0, r1)
                return
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m2826f(androidx.fragment.app.SpecialEffectsController.Operation r0, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r1) {
                onStart$lambda$6$lambda$5(r0, r1)
                return
        }

        public static /* synthetic */ void getTransitionSignal$annotations() {
                return
        }

        private static final void onCommit$lambda$11$lambda$10(androidx.fragment.app.SpecialEffectsController.Operation r2, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r3) {
                java.lang.String r0 = "$operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "this$0"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto L2d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Transition for operation "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = " has completed"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
            L2d:
                r2.completeEffect(r3)
                return
        }

        private static final void onStart$lambda$6$lambda$4(kotlin.jvm.internal.Ref.ObjectRef r1) {
                java.lang.String r0 = "$seekCancelLambda"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                T r1 = r1.element
                kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                if (r1 == 0) goto Le
                r1.invoke()
            Le:
                return
        }

        private static final void onStart$lambda$6$lambda$5(androidx.fragment.app.SpecialEffectsController.Operation r2, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r3) {
                java.lang.String r0 = "$operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "this$0"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto L2d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Transition for operation "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = " has completed"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
            L2d:
                r2.completeEffect(r3)
                return
        }

        private final void runTransition(java.util.ArrayList<android.view.View> r9, android.view.ViewGroup r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11) {
                r8 = this;
                r0 = 4
                androidx.fragment.app.FragmentTransition.setViewVisibility(r9, r0)
                androidx.fragment.app.FragmentTransitionImpl r0 = r8.transitionImpl
                java.util.ArrayList<android.view.View> r1 = r8.sharedElementLastInViews
                java.util.ArrayList r6 = r0.prepareSetNameOverridesReordered(r1)
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto L92
                java.lang.String r0 = ">>>>> Beginning transition <<<<<"
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
                java.lang.String r0 = ">>>>> SharedElementFirstOutViews <<<<<"
                android.util.Log.v(r1, r0)
                java.util.ArrayList<android.view.View> r0 = r8.sharedElementFirstOutViews
                java.util.Iterator r0 = r0.iterator()
            L25:
                boolean r2 = r0.hasNext()
                java.lang.String r3 = " Name: "
                java.lang.String r4 = "View: "
                if (r2 == 0) goto L58
                java.lang.Object r2 = r0.next()
                java.lang.String r5 = "sharedElementFirstOutViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
                android.view.View r2 = (android.view.View) r2
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                r5.append(r2)
                r5.append(r3)
                java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r2)
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                android.util.Log.v(r1, r2)
                goto L25
            L58:
                java.lang.String r0 = ">>>>> SharedElementLastInViews <<<<<"
                android.util.Log.v(r1, r0)
                java.util.ArrayList<android.view.View> r0 = r8.sharedElementLastInViews
                java.util.Iterator r0 = r0.iterator()
            L63:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L92
                java.lang.Object r2 = r0.next()
                java.lang.String r5 = "sharedElementLastInViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
                android.view.View r2 = (android.view.View) r2
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                r5.append(r2)
                r5.append(r3)
                java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r2)
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                android.util.Log.v(r1, r2)
                goto L63
            L92:
                r11.invoke()
                androidx.fragment.app.FragmentTransitionImpl r2 = r8.transitionImpl
                java.util.ArrayList<android.view.View> r4 = r8.sharedElementFirstOutViews
                java.util.ArrayList<android.view.View> r5 = r8.sharedElementLastInViews
                androidx.collection.ArrayMap<java.lang.String, java.lang.String> r7 = r8.sharedElementNameMapping
                r3 = r10
                r2.setNameOverridesReordered(r3, r4, r5, r6, r7)
                r10 = 0
                androidx.fragment.app.FragmentTransition.setViewVisibility(r9, r10)
                androidx.fragment.app.FragmentTransitionImpl r9 = r8.transitionImpl
                java.lang.Object r10 = r8.sharedElementTransition
                java.util.ArrayList<android.view.View> r11 = r8.sharedElementFirstOutViews
                java.util.ArrayList<android.view.View> r0 = r8.sharedElementLastInViews
                r9.swapSharedElementTargets(r10, r11, r0)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getController() {
                r1 = this;
                java.lang.Object r0 = r1.controller
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<java.lang.String> getEnteringNames() {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.enteringNames
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<java.lang.String> getExitingNames() {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.exitingNames
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final androidx.fragment.app.SpecialEffectsController.Operation getFirstOut() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.firstOut
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.collection.ArrayMap<java.lang.String, android.view.View> getFirstOutViews() {
                r1 = this;
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r0 = r1.firstOutViews
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final androidx.fragment.app.SpecialEffectsController.Operation getLastIn() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.lastIn
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.collection.ArrayMap<java.lang.String, android.view.View> getLastInViews() {
                r1 = this;
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r0 = r1.lastInViews
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<android.view.View> getSharedElementFirstOutViews() {
                r1 = this;
                java.util.ArrayList<android.view.View> r0 = r1.sharedElementFirstOutViews
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<android.view.View> getSharedElementLastInViews() {
                r1 = this;
                java.util.ArrayList<android.view.View> r0 = r1.sharedElementLastInViews
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.collection.ArrayMap<java.lang.String, java.lang.String> getSharedElementNameMapping() {
                r1 = this;
                androidx.collection.ArrayMap<java.lang.String, java.lang.String> r0 = r1.sharedElementNameMapping
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.sharedElementTransition
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.fragment.app.FragmentTransitionImpl getTransitionImpl() {
                r1 = this;
                androidx.fragment.app.FragmentTransitionImpl r0 = r1.transitionImpl
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> getTransitionInfos() {
                r1 = this;
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r0 = r1.transitionInfos
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.core.os.CancellationSignal getTransitionSignal() {
                r1 = this;
                androidx.core.os.CancellationSignal r0 = r1.transitionSignal
                return r0
        }

        public final boolean getTransitioning() {
                r3 = this;
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r0 = r3.transitionInfos
                r1 = 1
                if (r0 == 0) goto Lc
                boolean r2 = r0.isEmpty()
                if (r2 == 0) goto Lc
                return r1
            Lc:
                java.util.Iterator r0 = r0.iterator()
            L10:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2a
                java.lang.Object r2 = r0.next()
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                boolean r2 = r2.mTransitioning
                if (r2 != 0) goto L10
                r0 = 0
                return r0
            L2a:
                return r1
        }

        public final boolean isPop() {
                r1 = this;
                boolean r0 = r1.isPop
                return r0
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
                r4 = this;
                androidx.fragment.app.FragmentTransitionImpl r0 = r4.transitionImpl
                boolean r0 = r0.isSeekingSupported()
                if (r0 == 0) goto L4a
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r0 = r4.transitionInfos
                if (r0 == 0) goto L13
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L13
                goto L3c
            L13:
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3c
                java.lang.Object r1 = r0.next()
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 34
                if (r2 < r3) goto L4a
                java.lang.Object r2 = r1.getTransition()
                if (r2 == 0) goto L4a
                androidx.fragment.app.FragmentTransitionImpl r2 = r4.transitionImpl
                java.lang.Object r1 = r1.getTransition()
                boolean r1 = r2.isSeekingSupported(r1)
                if (r1 == 0) goto L4a
                goto L17
            L3c:
                java.lang.Object r0 = r4.sharedElementTransition
                if (r0 == 0) goto L48
                androidx.fragment.app.FragmentTransitionImpl r1 = r4.transitionImpl
                boolean r0 = r1.isSeekingSupported(r0)
                if (r0 == 0) goto L4a
            L48:
                r0 = 1
                return r0
            L4a:
                r0 = 0
                return r0
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@org.jetbrains.annotations.NotNull android.view.ViewGroup r2) {
                r1 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                androidx.core.os.CancellationSignal r2 = r1.transitionSignal
                r2.cancel()
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@org.jetbrains.annotations.NotNull android.view.ViewGroup r12) {
                r11 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                boolean r0 = r12.isLaidOut()
                java.lang.String r1 = "FragmentManager"
                r2 = 2
                if (r0 != 0) goto L4e
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r0 = r11.transitionInfos
                java.util.Iterator r0 = r0.iterator()
            L14:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L105
                java.lang.Object r3 = r0.next()
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r3 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r3
                androidx.fragment.app.SpecialEffectsController$Operation r4 = r3.getOperation()
                boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r5 == 0) goto L46
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "SpecialEffectsController: Container "
                r5.append(r6)
                r5.append(r12)
                java.lang.String r6 = " has not been laid out. Completing operation "
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                android.util.Log.v(r1, r4)
            L46:
                androidx.fragment.app.SpecialEffectsController$Operation r3 = r3.getOperation()
                r3.completeEffect(r11)
                goto L14
            L4e:
                java.lang.Object r0 = r11.controller
                java.lang.String r3 = " to "
                if (r0 == 0) goto L81
                androidx.fragment.app.FragmentTransitionImpl r12 = r11.transitionImpl
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r12.animateToEnd(r0)
                boolean r12 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r12 == 0) goto L105
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "Ending execution of operations from "
                r12.append(r0)
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r11.firstOut
                r12.append(r0)
                r12.append(r3)
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r11.lastIn
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                android.util.Log.v(r1, r12)
                return
            L81:
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r11.lastIn
                androidx.fragment.app.SpecialEffectsController$Operation r4 = r11.firstOut
                kotlin.Pair r0 = r11.createMergedTransition(r12, r0, r4)
                java.lang.Object r4 = r0.component1()
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                java.lang.Object r0 = r0.component2()
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r5 = r11.transitionInfos
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r7)
                r6.<init>(r7)
                java.util.Iterator r5 = r5.iterator()
            La4:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto Lb8
                java.lang.Object r7 = r5.next()
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r7 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r7
                androidx.fragment.app.SpecialEffectsController$Operation r7 = r7.getOperation()
                r6.add(r7)
                goto La4
            Lb8:
                java.util.Iterator r5 = r6.iterator()
            Lbc:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto Ld9
                java.lang.Object r6 = r5.next()
                androidx.fragment.app.SpecialEffectsController$Operation r6 = (androidx.fragment.app.SpecialEffectsController.Operation) r6
                androidx.fragment.app.FragmentTransitionImpl r7 = r11.transitionImpl
                androidx.fragment.app.Fragment r8 = r6.getFragment()
                androidx.core.os.CancellationSignal r9 = r11.transitionSignal
                androidx.fragment.app.h r10 = new androidx.fragment.app.h
                r10.<init>(r6, r11)
                r7.setListenerForTransitionEnd(r8, r0, r9, r10)
                goto Lbc
            Ld9:
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4 r5 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                r5.<init>(r11, r12, r0)
                r11.runTransition(r4, r12, r5)
                boolean r12 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r12 == 0) goto L105
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "Completed executing operations from "
                r12.append(r0)
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r11.firstOut
                r12.append(r0)
                r12.append(r3)
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r11.lastIn
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                android.util.Log.v(r1, r12)
            L105:
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(@org.jetbrains.annotations.NotNull androidx.activity.BackEventCompat r2, @org.jetbrains.annotations.NotNull android.view.ViewGroup r3) {
                r1 = this;
                java.lang.String r0 = "backEvent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.Object r3 = r1.controller
                if (r3 == 0) goto L17
                androidx.fragment.app.FragmentTransitionImpl r0 = r1.transitionImpl
                float r2 = r2.getProgress()
                r0.setCurrentPlayTime(r3, r2)
            L17:
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(@org.jetbrains.annotations.NotNull android.view.ViewGroup r11) {
                r10 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                boolean r0 = r11.isLaidOut()
                java.lang.String r1 = "FragmentManager"
                if (r0 != 0) goto L47
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r0 = r10.transitionInfos
                java.util.Iterator r0 = r0.iterator()
            L13:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L100
                java.lang.Object r2 = r0.next()
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                r3 = 2
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                if (r3 == 0) goto L13
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "SpecialEffectsController: Container "
                r3.append(r4)
                r3.append(r11)
                java.lang.String r4 = " has not been laid out. Skipping onStart for operation "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                android.util.Log.v(r1, r2)
                goto L13
            L47:
                boolean r0 = r10.getTransitioning()
                if (r0 == 0) goto L86
                java.lang.Object r0 = r10.sharedElementTransition
                if (r0 == 0) goto L86
                boolean r0 = r10.isSeekingSupported()
                if (r0 != 0) goto L86
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Ignoring shared elements transition "
                r0.append(r2)
                java.lang.Object r2 = r10.sharedElementTransition
                r0.append(r2)
                java.lang.String r2 = " between "
                r0.append(r2)
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r10.firstOut
                r0.append(r2)
                java.lang.String r2 = " and "
                r0.append(r2)
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r10.lastIn
                r0.append(r2)
                java.lang.String r2 = " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed."
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.util.Log.i(r1, r0)
            L86:
                boolean r0 = r10.isSeekingSupported()
                if (r0 == 0) goto L100
                boolean r0 = r10.getTransitioning()
                if (r0 == 0) goto L100
                kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
                r0.<init>()
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r10.lastIn
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r10.firstOut
                kotlin.Pair r1 = r10.createMergedTransition(r11, r1, r2)
                java.lang.Object r2 = r1.component1()
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                java.lang.Object r5 = r1.component2()
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r1 = r10.transitionInfos
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r4)
                r3.<init>(r4)
                java.util.Iterator r1 = r1.iterator()
            Lba:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto Lce
                java.lang.Object r4 = r1.next()
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r4 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r4
                androidx.fragment.app.SpecialEffectsController$Operation r4 = r4.getOperation()
                r3.add(r4)
                goto Lba
            Lce:
                java.util.Iterator r1 = r3.iterator()
            Ld2:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto Lf8
                java.lang.Object r3 = r1.next()
                androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3
                androidx.fragment.app.f r7 = new androidx.fragment.app.f
                r7.<init>(r0)
                r4 = r3
                androidx.fragment.app.FragmentTransitionImpl r3 = r10.transitionImpl
                r6 = r4
                androidx.fragment.app.Fragment r4 = r6.getFragment()
                r8 = r6
                androidx.core.os.CancellationSignal r6 = r10.transitionSignal
                r9 = r8
                androidx.fragment.app.g r8 = new androidx.fragment.app.g
                r8.<init>(r9, r10)
                r3.setListenerForTransitionEnd(r4, r5, r6, r7, r8)
                goto Ld2
            Lf8:
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4 r1 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4
                r1.<init>(r10, r11, r5, r0)
                r10.runTransition(r2, r11, r1)
            L100:
                return
        }

        public final void setController(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
                r0 = this;
                r0.controller = r1
                return
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\u0006\u0010\u0014\u001a\u00020\u0005R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m90084d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "providesSharedElementTransition", "(Landroidx/fragment/app/SpecialEffectsController$Operation;ZZ)V", "handlingImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "isOverlapAllowed", "()Z", "sharedElementTransition", "", "getSharedElementTransition", "()Ljava/lang/Object;", "transition", "getTransition", "hasSharedElementTransition", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class TransitionInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private final boolean isOverlapAllowed;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object sharedElementTransition;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object transition;

        public TransitionInfo(@org.jetbrains.annotations.NotNull androidx.fragment.app.SpecialEffectsController.Operation r3, boolean r4, boolean r5) {
                r2 = this;
                java.lang.String r0 = "operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r2.<init>(r3)
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r3.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 != r1) goto L20
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                if (r4 == 0) goto L1b
                java.lang.Object r0 = r0.getReenterTransition()
                goto L2f
            L1b:
                java.lang.Object r0 = r0.getEnterTransition()
                goto L2f
            L20:
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                if (r4 == 0) goto L2b
                java.lang.Object r0 = r0.getReturnTransition()
                goto L2f
            L2b:
                java.lang.Object r0 = r0.getExitTransition()
            L2f:
                r2.transition = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r3.getFinalState()
                if (r0 != r1) goto L4b
                if (r4 == 0) goto L42
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                boolean r0 = r0.getAllowReturnTransitionOverlap()
                goto L4c
            L42:
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                boolean r0 = r0.getAllowEnterTransitionOverlap()
                goto L4c
            L4b:
                r0 = 1
            L4c:
                r2.isOverlapAllowed = r0
                if (r5 == 0) goto L64
                if (r4 == 0) goto L5b
                androidx.fragment.app.Fragment r3 = r3.getFragment()
                java.lang.Object r3 = r3.getSharedElementReturnTransition()
                goto L65
            L5b:
                androidx.fragment.app.Fragment r3 = r3.getFragment()
                java.lang.Object r3 = r3.getSharedElementEnterTransition()
                goto L65
            L64:
                r3 = 0
            L65:
                r2.sharedElementTransition = r3
                return
        }

        private final androidx.fragment.app.FragmentTransitionImpl getHandlingImpl(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 0
                return r4
            L4:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                if (r0 == 0) goto Lf
                boolean r1 = r0.canHandle(r4)
                if (r1 == 0) goto Lf
                return r0
            Lf:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                if (r0 == 0) goto L1a
                boolean r1 = r0.canHandle(r4)
                if (r1 == 0) goto L1a
                return r0
            L1a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Transition "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " for fragment "
                r1.append(r4)
                androidx.fragment.app.SpecialEffectsController$Operation r4 = r3.getOperation()
                androidx.fragment.app.Fragment r4 = r4.getFragment()
                r1.append(r4)
                java.lang.String r4 = " is not a valid framework Transition or AndroidX Transition"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @org.jetbrains.annotations.Nullable
        public final androidx.fragment.app.FragmentTransitionImpl getHandlingImpl() {
                r2 = this;
                java.lang.Object r0 = r2.transition
                androidx.fragment.app.FragmentTransitionImpl r0 = r2.getHandlingImpl(r0)
                java.lang.Object r1 = r2.sharedElementTransition
                androidx.fragment.app.FragmentTransitionImpl r1 = r2.getHandlingImpl(r1)
                if (r0 == 0) goto L4a
                if (r1 == 0) goto L4a
                if (r0 != r1) goto L13
                goto L4a
            L13:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
                r0.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r2.getOperation()
                androidx.fragment.app.Fragment r1 = r1.getFragment()
                r0.append(r1)
                java.lang.String r1 = " returned Transition "
                r0.append(r1)
                java.lang.Object r1 = r2.transition
                r0.append(r1)
                java.lang.String r1 = " which uses a different Transition  type than its shared element transition "
                r0.append(r1)
                java.lang.Object r1 = r2.sharedElementTransition
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L4a:
                if (r0 != 0) goto L4d
                return r1
            L4d:
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.sharedElementTransition
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getTransition() {
                r1 = this;
                java.lang.Object r0 = r1.transition
                return r0
        }

        public final boolean hasSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.sharedElementTransition
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        public final boolean isOverlapAllowed() {
                r1 = this;
                boolean r0 = r1.isOverlapAllowed
                return r0
        }
    }


    public DefaultSpecialEffectsController(@org.jetbrains.annotations.NotNull android.view.ViewGroup r2) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            return
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2819c(androidx.fragment.app.DefaultSpecialEffectsController r0, androidx.fragment.app.SpecialEffectsController.Operation r1) {
            collectEffects$lambda$2(r0, r1)
            return
    }

    @android.annotation.SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    private final void collectAnimEffects(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r11.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r3 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r3
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r3.getOperation()
            java.util.List r3 = r3.getEffects$fragment_release()
            kotlin.collections.CollectionsKt.addAll(r1, r3)
            goto Le
        L26:
            boolean r1 = r1.isEmpty()
            java.util.Iterator r11 = r11.iterator()
            r2 = 0
            r3 = r2
        L30:
            boolean r4 = r11.hasNext()
            java.lang.String r5 = "FragmentManager"
            r6 = 2
            if (r4 == 0) goto La2
            java.lang.Object r4 = r11.next()
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r4 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r4
            android.view.ViewGroup r7 = r10.getContainer()
            android.content.Context r7 = r7.getContext()
            androidx.fragment.app.SpecialEffectsController$Operation r8 = r4.getOperation()
            java.lang.String r9 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r7 = r4.getAnimation(r7)
            if (r7 != 0) goto L57
            goto L30
        L57:
            android.animation.AnimatorSet r7 = r7.animator
            if (r7 != 0) goto L5f
            r0.add(r4)
            goto L30
        L5f:
            androidx.fragment.app.Fragment r7 = r8.getFragment()
            java.util.List r9 = r8.getEffects$fragment_release()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L8d
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r4 == 0) goto L30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Ignoring Animator set on "
            r4.append(r6)
            r4.append(r7)
            java.lang.String r6 = " as this Fragment was involved in a Transition."
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r5, r4)
            goto L30
        L8d:
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r8.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r3 != r5) goto L98
            r8.setAwaitingContainerChanges(r2)
        L98:
            androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect r3 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect
            r3.<init>(r4)
            r8.addEffect(r3)
            r3 = 1
            goto L30
        La2:
            java.util.Iterator r11 = r0.iterator()
        La6:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L105
            java.lang.Object r0 = r11.next()
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r0
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r0.getOperation()
            androidx.fragment.app.Fragment r4 = r2.getFragment()
            java.lang.String r7 = "Ignoring Animation set on "
            if (r1 != 0) goto Ldc
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r0 == 0) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r4)
            java.lang.String r2 = " as Animations cannot run alongside Transitions."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r5, r0)
            goto La6
        Ldc:
            if (r3 == 0) goto Lfc
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r0 == 0) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r4)
            java.lang.String r2 = " as Animations cannot run alongside Animators."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r5, r0)
            goto La6
        Lfc:
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect r4 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect
            r4.<init>(r0)
            r2.addEffect(r4)
            goto La6
        L105:
            return
    }

    private static final void collectEffects$lambda$2(androidx.fragment.app.DefaultSpecialEffectsController r1, androidx.fragment.app.SpecialEffectsController.Operation r2) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "$operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.applyContainerChangesToOperation$fragment_release(r2)
            return
    }

    private final void createTransitionEffect(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r26, boolean r27, androidx.fragment.app.SpecialEffectsController.Operation r28, androidx.fragment.app.SpecialEffectsController.Operation r29) {
            r25 = this;
            r0 = r25
            r3 = r28
            r4 = r29
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r26.iterator()
        Lf:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L26
            java.lang.Object r5 = r2.next()
            r6 = r5
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r6 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r6
            boolean r6 = r6.isVisibilityUnchanged()
            if (r6 != 0) goto Lf
            r1.add(r5)
            goto Lf
        L26:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r1.next()
            r6 = r5
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r6 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r6
            androidx.fragment.app.FragmentTransitionImpl r6 = r6.getHandlingImpl()
            if (r6 == 0) goto L2f
            r2.add(r5)
            goto L2f
        L46:
            java.util.Iterator r1 = r2.iterator()
            r5 = 0
            r6 = r5
        L4c:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L97
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r7 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r7
            androidx.fragment.app.FragmentTransitionImpl r8 = r7.getHandlingImpl()
            if (r5 == 0) goto L95
            if (r8 != r5) goto L61
            goto L95
        L61:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r1.append(r2)
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r7.getOperation()
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            r1.append(r2)
            java.lang.String r2 = " returned Transition "
            r1.append(r2)
            java.lang.Object r2 = r7.getTransition()
            r1.append(r2)
            java.lang.String r2 = " which uses a different Transition type than other Fragments."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L95:
            r5 = r8
            goto L4c
        L97:
            if (r5 != 0) goto L9b
            goto L3d5
        L9b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            androidx.collection.ArrayMap r9 = new androidx.collection.ArrayMap
            r9.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            androidx.collection.ArrayMap r12 = new androidx.collection.ArrayMap
            r12.<init>()
            androidx.collection.ArrayMap r13 = new androidx.collection.ArrayMap
            r13.<init>()
            java.util.Iterator r11 = r2.iterator()
            r14 = r10
            r10 = r1
            r1 = r11
            r11 = r14
            r14 = r6
        Lc7:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto L385
            java.lang.Object r15 = r1.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r15 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r15
            boolean r16 = r15.hasSharedElementTransition()
            if (r16 == 0) goto L37a
            if (r3 == 0) goto L37a
            if (r4 == 0) goto L37a
            java.lang.Object r6 = r15.getSharedElementTransition()
            java.lang.Object r6 = r5.cloneTransition(r6)
            java.lang.Object r6 = r5.wrapTransitionInSet(r6)
            androidx.fragment.app.Fragment r10 = r4.getFragment()
            java.util.ArrayList r11 = r10.getSharedElementSourceNames()
            java.lang.String r10 = "lastIn.fragment.sharedElementSourceNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r10)
            androidx.fragment.app.Fragment r10 = r3.getFragment()
            java.util.ArrayList r10 = r10.getSharedElementSourceNames()
            java.lang.String r15 = "firstOut.fragment.sharedElementSourceNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r15)
            androidx.fragment.app.Fragment r15 = r3.getFragment()
            java.util.ArrayList r15 = r15.getSharedElementTargetNames()
            java.lang.String r14 = "firstOut.fragment.sharedElementTargetNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r14)
            int r14 = r15.size()
            r16 = 0
            r17 = r1
            r18 = r2
            r1 = r16
        L11c:
            r2 = -1
            if (r1 >= r14) goto L137
            r19 = r5
            java.lang.Object r5 = r15.get(r1)
            int r5 = r11.indexOf(r5)
            if (r5 == r2) goto L132
            java.lang.Object r2 = r10.get(r1)
            r11.set(r5, r2)
        L132:
            int r1 = r1 + 1
            r5 = r19
            goto L11c
        L137:
            r19 = r5
            androidx.fragment.app.Fragment r1 = r4.getFragment()
            java.util.ArrayList r10 = r1.getSharedElementTargetNames()
            java.lang.String r1 = "lastIn.fragment.sharedElementTargetNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            if (r27 != 0) goto L15d
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            androidx.core.app.SharedElementCallback r1 = r1.getExitTransitionCallback()
            androidx.fragment.app.Fragment r5 = r4.getFragment()
            androidx.core.app.SharedElementCallback r5 = r5.getEnterTransitionCallback()
            kotlin.Pair r1 = kotlin.TuplesKt.m90091to(r1, r5)
            goto L171
        L15d:
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            androidx.core.app.SharedElementCallback r1 = r1.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r5 = r4.getFragment()
            androidx.core.app.SharedElementCallback r5 = r5.getExitTransitionCallback()
            kotlin.Pair r1 = kotlin.TuplesKt.m90091to(r1, r5)
        L171:
            java.lang.Object r5 = r1.component1()
            androidx.core.app.SharedElementCallback r5 = (androidx.core.app.SharedElementCallback) r5
            java.lang.Object r1 = r1.component2()
            androidx.core.app.SharedElementCallback r1 = (androidx.core.app.SharedElementCallback) r1
            int r14 = r11.size()
            r15 = r16
            r16 = r2
        L185:
            java.lang.String r2 = "enteringNames[i]"
            r20 = r7
            java.lang.String r7 = "exitingNames[i]"
            if (r15 >= r14) goto L1ab
            r21 = r8
            java.lang.Object r8 = r11.get(r15)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r10.get(r15)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            java.lang.String r7 = (java.lang.String) r7
            r9.put(r8, r7)
            int r15 = r15 + 1
            r7 = r20
            r8 = r21
            goto L185
        L1ab:
            r21 = r8
            r8 = 2
            boolean r14 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r8)
            java.lang.String r15 = "FragmentManager"
            if (r14 == 0) goto L21c
            java.lang.String r14 = ">>> entering view names <<<"
            android.util.Log.v(r15, r14)
            java.util.Iterator r14 = r10.iterator()
        L1bf:
            boolean r22 = r14.hasNext()
            r23 = r8
            java.lang.String r8 = "Name: "
            if (r22 == 0) goto L1ee
            java.lang.Object r22 = r14.next()
            r24 = r14
            r14 = r22
            java.lang.String r14 = (java.lang.String) r14
            r22 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r15, r6)
            r6 = r22
            r8 = r23
            r14 = r24
            goto L1bf
        L1ee:
            r22 = r6
            java.lang.String r6 = ">>> exiting view names <<<"
            android.util.Log.v(r15, r6)
            java.util.Iterator r6 = r11.iterator()
        L1f9:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L220
            java.lang.Object r14 = r6.next()
            java.lang.String r14 = (java.lang.String) r14
            r24 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r15, r6)
            r6 = r24
            goto L1f9
        L21c:
            r22 = r6
            r23 = r8
        L220:
            androidx.fragment.app.Fragment r6 = r3.getFragment()
            android.view.View r6 = r6.mView
            java.lang.String r8 = "firstOut.fragment.mView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            r0.findNamedViews(r12, r6)
            r12.retainAll(r11)
            if (r5 == 0) goto L28b
            boolean r6 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r23)
            if (r6 == 0) goto L24d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Executing exit callback for operation "
            r6.append(r8)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r15, r6)
        L24d:
            r5.onMapSharedElements(r11, r12)
            int r5 = r11.size()
            int r5 = r5 + (-1)
            if (r5 < 0) goto L292
        L258:
            int r6 = r5 + (-1)
            java.lang.Object r5 = r11.get(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r12.get(r5)
            android.view.View r8 = (android.view.View) r8
            if (r8 != 0) goto L26f
            r9.remove(r5)
            goto L286
        L26f:
            java.lang.String r14 = androidx.core.view.ViewCompat.getTransitionName(r8)
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r14)
            if (r14 != 0) goto L286
            java.lang.Object r5 = r9.remove(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r8 = androidx.core.view.ViewCompat.getTransitionName(r8)
            r9.put(r8, r5)
        L286:
            if (r6 >= 0) goto L289
            goto L292
        L289:
            r5 = r6
            goto L258
        L28b:
            java.util.Set r5 = r12.keySet()
            r9.retainAll(r5)
        L292:
            androidx.fragment.app.Fragment r5 = r4.getFragment()
            android.view.View r5 = r5.mView
            java.lang.String r6 = "lastIn.fragment.mView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.findNamedViews(r13, r5)
            r13.retainAll(r10)
            java.util.Collection r5 = r9.values()
            r13.retainAll(r5)
            if (r1 == 0) goto L30a
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r23)
            if (r5 == 0) goto L2c6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Executing enter callback for operation "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r15, r5)
        L2c6:
            r1.onMapSharedElements(r10, r13)
            int r1 = r10.size()
            int r1 = r1 + (-1)
            if (r1 < 0) goto L30d
        L2d1:
            int r5 = r1 + (-1)
            java.lang.Object r1 = r10.get(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r13.get(r1)
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L2ee
            java.lang.String r1 = androidx.fragment.app.FragmentTransition.findKeyForValue(r9, r1)
            if (r1 == 0) goto L305
            r9.remove(r1)
            goto L305
        L2ee:
            java.lang.String r7 = androidx.core.view.ViewCompat.getTransitionName(r6)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)
            if (r7 != 0) goto L305
            java.lang.String r1 = androidx.fragment.app.FragmentTransition.findKeyForValue(r9, r1)
            if (r1 == 0) goto L305
            java.lang.String r6 = androidx.core.view.ViewCompat.getTransitionName(r6)
            r9.put(r1, r6)
        L305:
            if (r5 >= 0) goto L308
            goto L30d
        L308:
            r1 = r5
            goto L2d1
        L30a:
            androidx.fragment.app.FragmentTransition.retainValues(r9, r13)
        L30d:
            java.util.Set r1 = r9.keySet()
            java.lang.String r2 = "sharedElementNameMapping.keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.retainMatchingViews(r12, r1)
            java.util.Collection r1 = r9.values()
            java.lang.String r2 = "sharedElementNameMapping.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.retainMatchingViews(r13, r1)
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L36c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Ignoring shared elements transition "
            r1.append(r2)
            r2 = r22
            r1.append(r2)
            java.lang.String r2 = " between "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " and "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r15, r1)
            r20.clear()
            r21.clear()
            r1 = r17
            r2 = r18
            r5 = r19
            r7 = r20
            r8 = r21
            r6 = 0
        L369:
            r14 = 0
            goto Lc7
        L36c:
            r2 = r22
            r6 = r2
        L36f:
            r1 = r17
            r2 = r18
            r5 = r19
            r7 = r20
            r8 = r21
            goto L369
        L37a:
            r17 = r1
            r18 = r2
            r19 = r5
            r20 = r7
            r21 = r8
            goto L36f
        L385:
            r18 = r2
            r19 = r5
            r20 = r7
            r21 = r8
            if (r6 != 0) goto L3ae
            boolean r1 = r18.isEmpty()
            if (r1 == 0) goto L396
            return
        L396:
            java.util.Iterator r1 = r18.iterator()
        L39a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3ad
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
            java.lang.Object r2 = r2.getTransition()
            if (r2 != 0) goto L3ae
            goto L39a
        L3ad:
            return
        L3ae:
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect
            r14 = r27
            r2 = r18
            r5 = r19
            r7 = r20
            r8 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.util.Iterator r2 = r2.iterator()
        L3c1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3d5
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r3 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r3
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r3.getOperation()
            r3.addEffect(r1)
            goto L3c1
        L3d5:
            return
    }

    private final void findNamedViews(java.util.Map<java.lang.String, android.view.View> r5, android.view.View r6) {
            r4 = this;
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r6)
            if (r0 == 0) goto L9
            r5.put(r0, r6)
        L9:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2b
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L2b
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L28
            java.lang.String r3 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.findNamedViews(r5, r2)
        L28:
            int r1 = r1 + 1
            goto L14
        L2b:
            return
    }

    private final void retainMatchingViews(androidx.collection.ArrayMap<java.lang.String, android.view.View> r2, java.util.Collection<java.lang.String> r3) {
            r1 = this;
            java.util.Set r2 = r2.entrySet()
            java.lang.String r0 = "entries"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1 r0 = new androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
            r0.<init>(r3)
            kotlin.collections.CollectionsKt.retainAll(r2, r0)
            return
    }

    private final void syncAnimations(java.util.List<? extends androidx.fragment.app.SpecialEffectsController.Operation> r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last(r5)
            androidx.fragment.app.SpecialEffectsController$Operation r0 = (androidx.fragment.app.SpecialEffectsController.Operation) r0
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r5.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r3 = r0.mAnimationInfo
            int r3 = r3.mEnterAnim
            r2.mEnterAnim = r3
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r3 = r0.mAnimationInfo
            int r3 = r3.mExitAnim
            r2.mExitAnim = r3
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r3 = r0.mAnimationInfo
            int r3 = r3.mPopEnterAnim
            r2.mPopEnterAnim = r3
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r1 = r1.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r2 = r0.mAnimationInfo
            int r2 = r2.mPopExitAnim
            r1.mPopExitAnim = r2
            goto Le
        L4b:
            return
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void collectEffects(@org.jetbrains.annotations.NotNull java.util.List<? extends androidx.fragment.app.SpecialEffectsController.Operation> r9, boolean r10) {
            r8 = this;
            java.lang.String r0 = "operations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.Iterator r0 = r9.iterator()
        L9:
            boolean r1 = r0.hasNext()
            r2 = 0
            java.lang.String r3 = "operation.fragment.mView"
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4
            androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
            androidx.fragment.app.Fragment r6 = r4.getFragment()
            android.view.View r6 = r6.mView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = r5.asOperationState(r6)
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r5 != r6) goto L9
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r4.getFinalState()
            if (r4 == r6) goto L9
            goto L34
        L33:
            r1 = r2
        L34:
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L3e:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r0.previous()
            r5 = r4
            androidx.fragment.app.SpecialEffectsController$Operation r5 = (androidx.fragment.app.SpecialEffectsController.Operation) r5
            androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
            androidx.fragment.app.Fragment r7 = r5.getFragment()
            android.view.View r7 = r7.mView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r6.asOperationState(r7)
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r6 == r7) goto L3e
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = r5.getFinalState()
            if (r5 != r7) goto L3e
            r2 = r4
        L65:
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Executing operations from "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = " to "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r0)
        L8c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8.syncAnimations(r9)
            java.util.Iterator r9 = r9.iterator()
        L9d:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Lcd
            java.lang.Object r4 = r9.next()
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo
            r5.<init>(r4, r10)
            r0.add(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo
            r6 = 0
            r7 = 1
            if (r10 == 0) goto Lbb
            if (r4 != r1) goto Lbe
        Lb9:
            r6 = r7
            goto Lbe
        Lbb:
            if (r4 != r2) goto Lbe
            goto Lb9
        Lbe:
            r5.<init>(r4, r10, r6)
            r3.add(r5)
            androidx.fragment.app.a r5 = new androidx.fragment.app.a
            r5.<init>(r8, r4)
            r4.addCompletionListener(r5)
            goto L9d
        Lcd:
            r8.createTransitionEffect(r3, r10, r1, r2)
            r8.collectAnimEffects(r0)
            return
    }
}
