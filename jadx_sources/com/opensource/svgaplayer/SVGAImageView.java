package com.opensource.svgaplayer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import j90.C40354c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Map;
import k90.C40965c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TypeCastException;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SVGAImageView.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003xEyB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u0010!J!\u00101\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b1\u0010\u001fJ\r\u00102\u001a\u00020\n¢\u0006\u0004\b2\u0010!J\r\u00103\u001a\u00020\n¢\u0006\u0004\b3\u0010!J\u0015\u00105\u001a\u00020\n2\u0006\u00104\u001a\u00020\u001c¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b7\u0010\u0019J!\u0010:\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\u00020\n2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\u001c2\b\u0010A\u001a\u0004\u0018\u00010@H\u0017¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\nH\u0014¢\u0006\u0004\bD\u0010!R\u0014\u0010G\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010K\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\"\u0010S\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR(\u0010X\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bT\u0010J\u0012\u0004\bW\u0010!\u001a\u0004\bU\u0010L\"\u0004\bV\u00106R\"\u0010\\\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010J\u001a\u0004\bZ\u0010L\"\u0004\b[\u00106R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010k\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010lR\u0016\u0010n\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010JR\u0016\u0010o\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010JR\u0014\u0010r\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010qR\u0014\u0010u\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010tR\u0016\u0010v\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010NR\u0016\u0010w\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010N¨\u0006z"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGAImageView;", "Landroid/widget/ImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "k", "(Landroid/util/AttributeSet;)V", "", "source", "n", "(Ljava/lang/String;)V", "Ljava/lang/ref/WeakReference;", "ref", "Lcom/opensource/svgaplayer/SVGAParser$b;", "i", "(Ljava/lang/ref/WeakReference;)Lcom/opensource/svgaplayer/SVGAParser$b;", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V", "Lj90/c;", SessionDescription.ATTR_RANGE, "", "reverse", "o", "(Lj90/c;Z)V", "q", "()V", "Lcom/opensource/svgaplayer/d;", "getSVGADrawable", "()Lcom/opensource/svgaplayer/d;", "", "j", "()D", "Landroid/animation/ValueAnimator;", "animator", "m", "(Landroid/animation/ValueAnimator;)V", "Landroid/animation/Animator;", "animation", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/animation/Animator;)V", "r", "t", CmcdData.Factory.STREAMING_FORMAT_HLS, "u", "clear", "v", "(Z)V", "setVideoItem", "Lcom/opensource/svgaplayer/e;", "dynamicItem", "p", "(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lcom/opensource/svgaplayer/e;)V", "Lcom/opensource/svgaplayer/c;", "clickListener", "setOnAnimKeyClickListener", "(Lcom/opensource/svgaplayer/c;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "b", "Ljava/lang/String;", "TAG", "<set-?>", "c", "Z", "isAnimating", "()Z", "d", "I", "getLoops", "()I", "setLoops", "(I)V", "loops", "e", "getClearsAfterStop", "setClearsAfterStop", "clearsAfterStop$annotations", "clearsAfterStop", "f", "getClearsAfterDetached", "setClearsAfterDetached", "clearsAfterDetached", "Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "g", "Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "getFillMode", "()Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "setFillMode", "(Lcom/opensource/svgaplayer/SVGAImageView$FillMode;)V", "fillMode", "Lcom/opensource/svgaplayer/b;", "Lcom/opensource/svgaplayer/b;", "getCallback", "()Lcom/opensource/svgaplayer/b;", "setCallback", "(Lcom/opensource/svgaplayer/b;)V", TUIConstants.TUIChat.CALL_BACK, "Landroid/animation/ValueAnimator;", "mAnimator", "mAntiAlias", "mAutoPlay", "Lcom/opensource/svgaplayer/SVGAImageView$a;", "Lcom/opensource/svgaplayer/SVGAImageView$a;", "mAnimatorListener", "Lcom/opensource/svgaplayer/SVGAImageView$b;", "Lcom/opensource/svgaplayer/SVGAImageView$b;", "mAnimatorUpdateListener", "mStartFrame", "mEndFrame", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "FillMode", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public class SVGAImageView extends ImageView {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String TAG;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isAnimating;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int loops;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean clearsAfterStop;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean clearsAfterDetached;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public FillMode fillMode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public InterfaceC27319b callback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public ValueAnimator mAnimator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean mAntiAlias;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean mAutoPlay;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final C27301a mAnimatorListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final C27302b mAnimatorUpdateListener;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int mStartFrame;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int mEndFrame;

    /* JADX INFO: compiled from: SVGAImageView.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "", "(Ljava/lang/String;I)V", "Backward", "Forward", "Clear", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 1, 15})
    public enum FillMode {
        Backward,
        Forward,
        Clear
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAImageView$a */
    /* JADX INFO: compiled from: SVGAImageView.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGAImageView$a;", "Landroid/animation/Animator$AnimatorListener;", "Lcom/opensource/svgaplayer/SVGAImageView;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "<init>", "(Lcom/opensource/svgaplayer/SVGAImageView;)V", "Landroid/animation/Animator;", "animation", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "Ljava/lang/ref/WeakReference;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/ref/WeakReference;", "weakReference", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class C27301a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final WeakReference<SVGAImageView> weakReference;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@Nullable Animator animation) {
            SVGAImageView sVGAImageView = this.weakReference.get();
            if (sVGAImageView != null) {
                sVGAImageView.isAnimating = false;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Nullable Animator animation) {
            SVGAImageView sVGAImageView = this.weakReference.get();
            if (sVGAImageView != null) {
                sVGAImageView.m67665l(animation);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@Nullable Animator animation) {
            InterfaceC27319b callback;
            SVGAImageView sVGAImageView = this.weakReference.get();
            if (sVGAImageView == null || (callback = sVGAImageView.getCallback()) == null) {
                return;
            }
            callback.mo67741c();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@Nullable Animator animation) {
            SVGAImageView sVGAImageView = this.weakReference.get();
            if (sVGAImageView != null) {
                sVGAImageView.isAnimating = true;
            }
        }

        public C27301a(@NotNull SVGAImageView sVGAImageView) {
            this.weakReference = new WeakReference<>(sVGAImageView);
        }
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAImageView$b */
    /* JADX INFO: compiled from: SVGAImageView.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/opensource/svgaplayer/SVGAImageView$b;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Lcom/opensource/svgaplayer/SVGAImageView;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "<init>", "(Lcom/opensource/svgaplayer/SVGAImageView;)V", "Landroid/animation/ValueAnimator;", "animation", "", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "weakReference", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class C27302b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final WeakReference<SVGAImageView> weakReference;

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@Nullable ValueAnimator animation) {
            SVGAImageView sVGAImageView = this.weakReference.get();
            if (sVGAImageView != null) {
                sVGAImageView.m67666m(animation);
            }
        }

        public C27302b(@NotNull SVGAImageView sVGAImageView) {
            this.weakReference = new WeakReference<>(sVGAImageView);
        }
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAImageView$c */
    /* JADX INFO: compiled from: SVGAImageView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"com/opensource/svgaplayer/SVGAImageView$c", "Lcom/opensource/svgaplayer/SVGAParser$b;", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "", "b", "(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class C27303c implements SVGAParser.InterfaceC27307b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WeakReference f55426a;

        public C27303c(WeakReference weakReference) {
            this.f55426a = weakReference;
        }

        @Override // com.opensource.svgaplayer.SVGAParser.InterfaceC27307b
        /* JADX INFO: renamed from: b */
        public void mo67677b(@NotNull SVGAVideoEntity videoItem) {
            SVGAImageView sVGAImageView = (SVGAImageView) this.f55426a.get();
            if (sVGAImageView != null) {
                sVGAImageView.m67672s(videoItem);
            }
        }

        @Override // com.opensource.svgaplayer.SVGAParser.InterfaceC27307b
        /* JADX INFO: renamed from: a */
        public void mo67676a() {
        }
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAImageView$d */
    /* JADX INFO: compiled from: SVGAImageView.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
    public static final class RunnableC27304d implements Runnable {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SVGAVideoEntity f55428c;

        public RunnableC27304d(SVGAVideoEntity sVGAVideoEntity) {
            this.f55428c = sVGAVideoEntity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f55428c.m67735x(SVGAImageView.this.mAntiAlias);
            SVGAImageView.this.setVideoItem(this.f55428c);
            C27321d sVGADrawable = SVGAImageView.this.getSVGADrawable();
            if (sVGADrawable != null) {
                ImageView.ScaleType scaleType = SVGAImageView.this.getScaleType();
                Intrinsics.checkExpressionValueIsNotNull(scaleType, "scaleType");
                sVGADrawable.m67748g(scaleType);
            }
            if (SVGAImageView.this.mAutoPlay) {
                SVGAImageView.this.m67671r();
            }
        }
    }

    @JvmOverloads
    public SVGAImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m67665l(Animator animation) {
        this.isAnimating = false;
        m67674u();
        C27321d sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            int i11 = C27324f.$EnumSwitchMapping$0[this.fillMode.ordinal()];
            if (i11 == 1) {
                sVGADrawable.m67747f(this.mStartFrame);
            } else if (i11 == 2) {
                sVGADrawable.m67747f(this.mEndFrame);
            } else if (i11 == 3) {
                sVGADrawable.m67746e(true);
            }
        }
        InterfaceC27319b interfaceC27319b = this.callback;
        if (interfaceC27319b != null) {
            interfaceC27319b.mo67739a();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m67671r() {
        m67673t(null, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m67673t(@Nullable C40354c range, boolean reverse) {
        m67675v(false);
        m67668o(range, reverse);
    }

    @JvmOverloads
    public SVGAImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Nullable
    public final InterfaceC27319b getCallback() {
        return this.callback;
    }

    public final boolean getClearsAfterDetached() {
        return this.clearsAfterDetached;
    }

    public final boolean getClearsAfterStop() {
        return this.clearsAfterStop;
    }

    @NotNull
    public final FillMode getFillMode() {
        return this.fillMode;
    }

    public final int getLoops() {
        return this.loops;
    }

    /* JADX INFO: renamed from: i */
    public final SVGAParser.InterfaceC27307b m67662i(WeakReference<SVGAImageView> ref) {
        return new C27303c(ref);
    }

    /* JADX INFO: renamed from: j */
    public final double m67663j() {
        double d11 = 1.0d;
        try {
            Class<?> cls = Class.forName("android.animation.ValueAnimator");
            Method declaredMethod = cls.getDeclaredMethod("getDurationScale", new Class[0]);
            if (declaredMethod == null) {
                return 1.0d;
            }
            Object objInvoke = declaredMethod.invoke(cls, new Object[0]);
            if (objInvoke == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            double dFloatValue = ((Float) objInvoke).floatValue();
            if (dFloatValue == 0.0d) {
                try {
                    Method declaredMethod2 = cls.getDeclaredMethod("setDurationScale", Float.TYPE);
                    if (declaredMethod2 != null) {
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(cls, Float.valueOf(1.0f));
                        C40965c.f91057a.m89717e(this.TAG, "The animation duration scale has been reset to 1.0x, because you closed it on developer options.");
                        return 1.0d;
                    }
                } catch (Exception e11) {
                    e = e11;
                    d11 = dFloatValue;
                    e.printStackTrace();
                    return d11;
                }
            }
            return dFloatValue;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m67667n(String source) {
        WeakReference<SVGAImageView> weakReference = new WeakReference<>(this);
        SVGAParser sVGAParser = new SVGAParser(getContext());
        if (StringsKt.startsWith$default(source, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(source, "https://", false, 2, (Object) null)) {
            SVGAParser.m67693u(sVGAParser, new URL(source), m67662i(weakReference), null, 4, null);
        } else {
            SVGAParser.m67692p(sVGAParser, source, m67662i(weakReference), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m67668o(C40354c range, boolean reverse) {
        C40965c.f91057a.m89717e(this.TAG, "================ start animation ================");
        C27321d sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            m67670q();
            this.mStartFrame = Math.max(0, 0);
            SVGAVideoEntity videoItem = sVGADrawable.getVideoItem();
            int iMin = Math.min(videoItem.getFrames() - 1, Integer.MAX_VALUE - 1);
            this.mEndFrame = iMin;
            ValueAnimator animator = ValueAnimator.ofInt(this.mStartFrame, iMin);
            Intrinsics.checkExpressionValueIsNotNull(animator, "animator");
            animator.setInterpolator(new LinearInterpolator());
            animator.setDuration((long) (((double) (((this.mEndFrame - this.mStartFrame) + 1) * (1000 / videoItem.getFPS()))) / m67663j()));
            int i11 = this.loops;
            animator.setRepeatCount(i11 <= 0 ? DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE : i11 - 1);
            animator.addUpdateListener(this.mAnimatorUpdateListener);
            animator.addListener(this.mAnimatorListener);
            if (reverse) {
                animator.reverse();
            } else {
                animator.start();
            }
            this.mAnimator = animator;
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (event == null || event.getAction() != 0) {
            return super.onTouchEvent(event);
        }
        C27321d sVGADrawable = getSVGADrawable();
        if (sVGADrawable == null) {
            return super.onTouchEvent(event);
        }
        for (Map.Entry<String, int[]> entry : sVGADrawable.getDynamicItem().m67759j().entrySet()) {
            entry.getKey();
            int[] value = entry.getValue();
            if (event.getX() >= value[0] && event.getX() <= value[2] && event.getY() >= value[1]) {
                event.getY();
                int i11 = value[3];
            }
        }
        return super.onTouchEvent(event);
    }

    /* JADX INFO: renamed from: p */
    public final void m67669p(@Nullable SVGAVideoEntity videoItem, @Nullable C27322e dynamicItem) {
        if (videoItem == null) {
            setImageDrawable(null);
            return;
        }
        if (dynamicItem == null) {
            dynamicItem = new C27322e();
        }
        C27321d c27321d = new C27321d(videoItem, dynamicItem);
        c27321d.m67746e(true);
        setImageDrawable(c27321d);
    }

    /* JADX INFO: renamed from: s */
    public final void m67672s(SVGAVideoEntity videoItem) {
        post(new RunnableC27304d(videoItem));
    }

    public final void setCallback(@Nullable InterfaceC27319b interfaceC27319b) {
        this.callback = interfaceC27319b;
    }

    public final void setClearsAfterDetached(boolean z11) {
        this.clearsAfterDetached = z11;
    }

    public final void setClearsAfterStop(boolean z11) {
        this.clearsAfterStop = z11;
    }

    public final void setFillMode(@NotNull FillMode fillMode) {
        this.fillMode = fillMode;
    }

    public final void setLoops(int i11) {
        this.loops = i11;
    }

    public final void setVideoItem(@Nullable SVGAVideoEntity videoItem) {
        m67669p(videoItem, new C27322e());
    }

    /* JADX INFO: renamed from: u */
    public final void m67674u() {
        m67675v(this.clearsAfterStop);
    }

    /* JADX INFO: renamed from: v */
    public final void m67675v(boolean clear) {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.mAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.mAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        C27321d sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            sVGADrawable.m67749h();
        }
        C27321d sVGADrawable2 = getSVGADrawable();
        if (sVGADrawable2 != null) {
            sVGADrawable2.m67746e(clear);
        }
    }

    public /* synthetic */ SVGAImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C27321d getSVGADrawable() {
        Drawable drawable = getDrawable();
        if (!(drawable instanceof C27321d)) {
            drawable = null;
        }
        return (C27321d) drawable;
    }

    /* JADX INFO: renamed from: h */
    public final void m67661h() {
        C27321d sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            sVGADrawable.m67746e(true);
        }
        C27321d sVGADrawable2 = getSVGADrawable();
        if (sVGADrawable2 != null) {
            sVGADrawable2.m67742a();
        }
        setImageDrawable(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: k */
    public final void m67664k(AttributeSet attrs) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R$styleable.SVGAImageView, 0, 0);
        this.loops = typedArrayObtainStyledAttributes.getInt(R$styleable.SVGAImageView_loopCount, 0);
        this.clearsAfterStop = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SVGAImageView_clearsAfterStop, false);
        this.clearsAfterDetached = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SVGAImageView_clearsAfterDetached, false);
        this.mAntiAlias = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SVGAImageView_antiAlias, true);
        this.mAutoPlay = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SVGAImageView_autoPlay, true);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.SVGAImageView_fillMode);
        if (string != null) {
            switch (string.hashCode()) {
                case 48:
                    if (string.equals("0")) {
                        this.fillMode = FillMode.Backward;
                    }
                    break;
                case 49:
                    if (string.equals("1")) {
                        this.fillMode = FillMode.Forward;
                    }
                    break;
                case 50:
                    if (string.equals("2")) {
                        this.fillMode = FillMode.Clear;
                    }
                    break;
            }
        }
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.SVGAImageView_source);
        if (string2 != null) {
            m67667n(string2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: m */
    public final void m67666m(ValueAnimator animator) {
        Object animatedValue;
        C27321d sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            if (animator != null) {
                animatedValue = animator.getAnimatedValue();
            } else {
                animatedValue = null;
            }
            if (animatedValue != null) {
                sVGADrawable.m67747f(((Integer) animatedValue).intValue());
                double currentFrame = ((double) (sVGADrawable.getCurrentFrame() + 1)) / ((double) sVGADrawable.getVideoItem().getFrames());
                InterfaceC27319b interfaceC27319b = this.callback;
                if (interfaceC27319b != null) {
                    interfaceC27319b.mo67740b(sVGADrawable.getCurrentFrame(), currentFrame);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m67675v(this.clearsAfterDetached);
        if (this.clearsAfterDetached) {
            m67661h();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m67670q() {
        C27321d sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            sVGADrawable.m67746e(false);
            ImageView.ScaleType scaleType = getScaleType();
            Intrinsics.checkExpressionValueIsNotNull(scaleType, "scaleType");
            sVGADrawable.m67748g(scaleType);
        }
    }

    @JvmOverloads
    public SVGAImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.TAG = "SVGAImageView";
        this.fillMode = FillMode.Forward;
        this.mAntiAlias = true;
        this.mAutoPlay = true;
        this.mAnimatorListener = new C27301a(this);
        this.mAnimatorUpdateListener = new C27302b(this);
        if (attributeSet != null) {
            m67664k(attributeSet);
        }
    }

    public final void setOnAnimKeyClickListener(@NotNull InterfaceC27320c clickListener) {
    }
}
