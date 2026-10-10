package com.trtc.uikit.livekit.component.gift.view.like;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GiftPathAnimator.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\b\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\tj\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/like/GiftPathAnimator;", "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;", "config", "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;", "<init>", "(Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;)V", "mCurrentPathCounts", "", "mPathVec", "Ljava/util/HashMap;", "Landroid/graphics/Path;", "Lkotlin/collections/HashMap;", "mRandom", "Ljava/security/SecureRandom;", "mCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "start", "", "child", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "FloatAnimation", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GiftPathAnimator extends GiftAbstractPathAnimator {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f77858g = new Companion(null);

    /* JADX INFO: renamed from: c */
    public int f77859c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final HashMap<Integer, Path> f77860d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final SecureRandom f77861e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final AtomicInteger f77862f;

    /* JADX INFO: compiled from: GiftPathAnimator.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/like/GiftPathAnimator$Companion;", "", "<init>", "()V", "MAX_PATH_COUNTS", "", "scale", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "c", "d", "e", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final float m79756a(double d11, double d12, double d13, double d14, double d15) {
            return (float) ((((d11 - d12) / (d13 - d12)) * (d15 - d14)) + d14);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.like.GiftPathAnimator$a */
    /* JADX INFO: compiled from: GiftPathAnimator.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/like/GiftPathAnimator$FloatAnimation;", "Landroid/view/animation/Animation;", "path", "Landroid/graphics/Path;", "mRotation", "", "parent", "Landroid/view/View;", "mView", "<init>", "(Landroid/graphics/Path;FLandroid/view/View;Landroid/view/View;)V", "mPm", "Landroid/graphics/PathMeasure;", "mDistance", "applyTransformation", "", "factor", "transformation", "Landroid/view/animation/Transformation;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35933a extends Animation {

        /* JADX INFO: renamed from: b */
        public final float f77863b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final View f77864c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final PathMeasure f77865d;

        /* JADX INFO: renamed from: e */
        public final float f77866e;

        public C35933a(@Nullable Path path, float f11, @NotNull View parent, @NotNull View mView) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(mView, "mView");
            this.f77863b = f11;
            this.f77864c = mView;
            PathMeasure pathMeasure = new PathMeasure(path, false);
            this.f77865d = pathMeasure;
            this.f77866e = pathMeasure.getLength();
            parent.setLayerType(1, null);
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float factor, @NotNull Transformation transformation) {
            float fM79756a;
            Intrinsics.checkNotNullParameter(transformation, "transformation");
            this.f77865d.getMatrix(this.f77866e * factor, transformation.getMatrix(), 1);
            this.f77864c.setRotation(this.f77863b * factor);
            float f11 = 3000.0f * factor;
            if (f11 < 200.0f) {
                fM79756a = GiftPathAnimator.f77858g.m79756a(factor, 0.0d, 0.06666667014360428d, 0.20000000298023224d, 1.100000023841858d);
            } else {
                fM79756a = f11 < 300.0f ? GiftPathAnimator.f77858g.m79756a(factor, 0.06666667014360428d, 0.10000000149011612d, 1.100000023841858d, 1.0d) : 1.0f;
            }
            this.f77864c.setScaleX(fM79756a);
            this.f77864c.setScaleY(fM79756a);
            transformation.setAlpha(1.0f - factor);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.like.GiftPathAnimator$b */
    /* JADX INFO: compiled from: GiftPathAnimator.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/view/like/GiftPathAnimator$start$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class AnimationAnimationListenerC35934b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f77867a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewGroup f77868b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GiftPathAnimator f77869c;

        public AnimationAnimationListenerC35934b(View view, ViewGroup viewGroup, GiftPathAnimator giftPathAnimator) {
            this.f77867a = view;
            this.f77868b = viewGroup;
            this.f77869c = giftPathAnimator;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f77867a.setAlpha(0.0f);
            this.f77868b.removeView(this.f77867a);
            this.f77869c.f77862f.decrementAndGet();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f77867a.setAlpha(1.0f);
            this.f77869c.f77862f.incrementAndGet();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftPathAnimator(@NotNull GiftAbstractPathAnimator.Config config) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        this.f77860d = new HashMap<>();
        this.f77861e = new SecureRandom();
        this.f77862f = new AtomicInteger(0);
    }

    @Override // com.trtc.uikit.livekit.component.gift.view.like.GiftAbstractPathAnimator
    /* JADX INFO: renamed from: d */
    public void mo79725d(@NotNull View child, @NotNull ViewGroup parent) {
        Path pathM79722a;
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.addView(child, new ViewGroup.LayoutParams(getF77826a().getF77836h(), getF77826a().getF77837i()));
        int i11 = this.f77859c + 1;
        this.f77859c = i11;
        if (i11 > 10) {
            pathM79722a = this.f77860d.get(Integer.valueOf(Math.abs(this.f77861e.nextInt() % 10) + 1));
        } else {
            pathM79722a = m79722a(this.f77862f, parent, 2);
            this.f77860d.put(Integer.valueOf(this.f77859c), pathM79722a);
        }
        C35933a c35933a = new C35933a(pathM79722a, m79724c(), parent, child);
        c35933a.setDuration(getF77826a().getF77838j());
        c35933a.setInterpolator(new LinearInterpolator());
        c35933a.setAnimationListener(new AnimationAnimationListenerC35934b(child, parent, this));
        child.startAnimation(c35933a);
    }
}
