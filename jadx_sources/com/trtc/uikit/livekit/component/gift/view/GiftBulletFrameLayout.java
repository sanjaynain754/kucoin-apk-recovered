package com.trtc.uikit.livekit.component.gift.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import com.google.firebase.messaging.Constants;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.component.gift.view.GiftBulletFrameLayout;
import com.trtc.uikit.livekit.component.gift.view.animation.ImageAnimationView;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import ld0.C42171a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GiftBulletFrameLayout.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001eJ\b\u0010!\u001a\u00020\u001eH\u0002J\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u001eJ\u0010\u0010$\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;", "Landroid/widget/FrameLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "handler", "Landroid/os/Handler;", "layoutInflater", "Landroid/view/LayoutInflater;", "isRtl", "", "giftEndAnimationRunnable", "Ljava/lang/Runnable;", "giftGroup", "Landroid/widget/RelativeLayout;", "imageGiftIcon", "Landroidx/constraintlayout/utils/widget/ImageFilterView;", "imageSendUserIcon", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "textSendUserName", "Landroid/widget/TextView;", "textGiftTitle", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$Callback;", "giftImageAnimationInfo", "Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$GiftImageAnimationInfo;", "setGiftInfo", "", "info", "stopPlay", "initLayoutState", "startAnimation", "endAnimation", "setCallback", "Callback", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GiftBulletFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f77776n = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Context f77777b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Handler f77778c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final LayoutInflater f77779d;

    /* JADX INFO: renamed from: e */
    public final boolean f77780e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Runnable f77781f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public RelativeLayout f77782g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public ImageFilterView f77783h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public AtomicAvatar f77784i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public TextView f77785j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public TextView f77786k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public InterfaceC35922a f77787l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final ImageAnimationView.C35929c f77788m;

    /* JADX INFO: compiled from: GiftBulletFrameLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$Companion;", "", "<init>", "()V", "GIFT_DISMISS_TIME", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.GiftBulletFrameLayout$a */
    /* JADX INFO: compiled from: GiftBulletFrameLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$Callback;", "", "onFinished", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC35922a {
        /* JADX INFO: renamed from: a */
        void mo79678a(int i11);
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.GiftBulletFrameLayout$b */
    /* JADX INFO: compiled from: GiftBulletFrameLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$endAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35923b extends AnimatorListenerAdapter {
        public C35923b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            GiftBulletFrameLayout.this.setVisibility(4);
            GiftBulletFrameLayout.this.setAlpha(1.0f);
            InterfaceC35922a interfaceC35922a = GiftBulletFrameLayout.this.f77787l;
            if (interfaceC35922a != null) {
                interfaceC35922a.mo79678a(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.GiftBulletFrameLayout$c */
    /* JADX INFO: compiled from: GiftBulletFrameLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$startAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35924c extends AnimatorListenerAdapter {
        public C35924c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            GiftBulletFrameLayout.this.m79675f();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.GiftBulletFrameLayout$d */
    /* JADX INFO: compiled from: GiftBulletFrameLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$startAnimation$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35925d extends AnimatorListenerAdapter {
        public C35925d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ImageFilterView imageFilterView = GiftBulletFrameLayout.this.f77783h;
            if (imageFilterView != null) {
                imageFilterView.setVisibility(0);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public GiftBulletFrameLayout(@NotNull Context mContext) {
        this(mContext, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    /* JADX INFO: renamed from: g */
    public final void m79676g() {
        setVisibility(0);
        ImageFilterView imageFilterView = this.f77783h;
        if (imageFilterView != null) {
            imageFilterView.setVisibility(0);
        }
        float width = this.f77780e ? getWidth() : -getWidth();
        C42171a c42171a = C42171a.f93622a;
        ObjectAnimator objectAnimatorM92594a = c42171a.m92594a(this.f77782g, width, 0.0f, 400, new OvershootInterpolator());
        objectAnimatorM92594a.addListener(new C35924c());
        ObjectAnimator objectAnimatorM92594a2 = c42171a.m92594a(this.f77783h, width, 0.0f, 400, new DecelerateInterpolator());
        objectAnimatorM92594a2.addListener(new C35925d());
        c42171a.m92596c(objectAnimatorM92594a, objectAnimatorM92594a2);
        Runnable runnable = new Runnable() { // from class: ld0.b
            @Override // java.lang.Runnable
            public final void run() {
                GiftBulletFrameLayout.m79673h(this.f93623b);
            }
        };
        this.f77781f = runnable;
        Handler handler = this.f77778c;
        Intrinsics.checkNotNull(runnable);
        handler.postDelayed(runnable, 3000L);
    }

    /* JADX INFO: renamed from: i */
    public final void m79677i() {
        setVisibility(4);
        Runnable runnable = this.f77781f;
        if (runnable != null) {
            Handler handler = this.f77778c;
            Intrinsics.checkNotNull(runnable);
            handler.removeCallbacks(runnable);
        }
        this.f77788m.m79702f();
    }

    public /* synthetic */ GiftBulletFrameLayout(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public final void m79674e() {
        float f11 = this.f77780e ? 100.0f : -100.0f;
        C42171a c42171a = C42171a.f93622a;
        ObjectAnimator objectAnimatorM92595b = c42171a.m92595b(this, 0.0f, f11, 500, 0);
        ObjectAnimator objectAnimatorM92595b2 = c42171a.m92595b(this, 100.0f, 0.0f, 0, 0);
        objectAnimatorM92595b2.addListener(new C35923b());
        c42171a.m92596c(objectAnimatorM92595b, objectAnimatorM92595b2);
    }

    public final void setCallback(@Nullable InterfaceC35922a interfaceC35922a) {
        this.f77787l = interfaceC35922a;
    }

    public final void setGiftInfo(@NotNull ImageAnimationView.C35929c info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f77788m.m79706j(info.m79700d());
        this.f77788m.m79707k(info.m79701e());
        this.f77788m.m79703g(info.m79697a());
        this.f77788m.m79705i(info.m79699c());
        this.f77788m.m79704h(info.m79698b());
        TextView textView = this.f77785j;
        if (textView != null) {
            textView.setText(this.f77788m.m79701e());
        }
        TextView textView2 = this.f77786k;
        if (textView2 != null) {
            textView2.setText(this.f77788m.m79699c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftBulletFrameLayout(@NotNull Context mContext, @Nullable AttributeSet attributeSet) {
        super(mContext, attributeSet);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f77777b = mContext;
        this.f77778c = new Handler(Looper.getMainLooper());
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(mContext);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.f77779d = layoutInflaterFrom;
        this.f77780e = mContext.getResources().getConfiguration().getLayoutDirection() == 1;
        this.f77788m = new ImageAnimationView.C35929c();
        View viewInflate = layoutInflaterFrom.inflate(R$layout.gift_layout_bullet, this);
        this.f77782g = (RelativeLayout) viewInflate.findViewById(R$id.gift_group);
        this.f77783h = (ImageFilterView) viewInflate.findViewById(R$id.iv_gift_icon);
        this.f77784i = (AtomicAvatar) viewInflate.findViewById(R$id.iv_send_user_icon);
        this.f77785j = (TextView) viewInflate.findViewById(R$id.tv_send_user_name);
        this.f77786k = (TextView) viewInflate.findViewById(R$id.tv_gift_title);
        setVisibility(4);
    }

    /* JADX INFO: renamed from: h */
    public static final void m79673h(GiftBulletFrameLayout giftBulletFrameLayout) {
        giftBulletFrameLayout.m79674e();
    }

    /* JADX INFO: renamed from: f */
    public final void m79675f() {
        ImageFilterView imageFilterView;
        if (!isAttachedToWindow()) {
            Log.w("GiftBulletFrameLayout", "initLayoutState: isAttachedToWindow is false");
            return;
        }
        setVisibility(0);
        if (!TextUtils.isEmpty(this.f77788m.m79698b()) && (imageFilterView = this.f77783h) != null) {
            ImageLoader imageLoader = ImageLoader.f77792a;
            Context context = this.f77777b;
            Intrinsics.checkNotNull(imageFilterView);
            ImageLoader.m79679b(imageLoader, context, imageFilterView, this.f77788m.m79698b(), R$drawable.gift_default_avatar, 0, 16, null);
        }
        AtomicAvatar atomicAvatar = this.f77784i;
        if (atomicAvatar != null) {
            String strM79700d = this.f77788m.m79700d();
            if (strM79700d == null) {
                strM79700d = "";
            }
            atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(strM79700d, R$drawable.gift_default_avatar));
        }
    }
}
