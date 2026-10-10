package com.trtc.uikit.livekit.component.gift.view.animation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.firebase.messaging.Constants;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.component.gift.view.GiftBulletFrameLayout;
import com.trtc.uikit.livekit.component.gift.view.animation.ImageAnimationView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImageAnimationView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "childViewCount", "", "childViews", "", "Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;", "[Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$Callback;", "playAnimation", "", "model", "Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$GiftImageAnimationInfo;", "stopPlay", "checkFinished", "setCallback", "Callback", "GiftImageAnimationInfo", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ImageAnimationView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public final int f77803b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final GiftBulletFrameLayout[] f77804c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public InterfaceC35928b f77805d;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.animation.ImageAnimationView$a */
    /* JADX INFO: compiled from: ImageAnimationView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$1", "Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$Callback;", "onFinished", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35927a implements GiftBulletFrameLayout.InterfaceC35922a {
        public C35927a() {
        }

        @Override // com.trtc.uikit.livekit.component.gift.view.GiftBulletFrameLayout.InterfaceC35922a
        /* JADX INFO: renamed from: a */
        public void mo79678a(int i11) {
            ImageAnimationView.this.m79694c();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.animation.ImageAnimationView$b */
    /* JADX INFO: compiled from: ImageAnimationView.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$Callback;", "", "onFinished", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC35928b {
        /* JADX INFO: renamed from: a */
        void mo79659a(int i11);
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.animation.ImageAnimationView$c */
    /* JADX INFO: compiled from: ImageAnimationView.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$GiftImageAnimationInfo;", "", "<init>", "()V", "senderAvatarUrl", "", "getSenderAvatarUrl", "()Ljava/lang/String;", "setSenderAvatarUrl", "(Ljava/lang/String;)V", "senderName", "getSenderName", "setSenderName", "giftName", "getGiftName", "setGiftName", "giftImageUrl", "getGiftImageUrl", "setGiftImageUrl", "giftCount", "", "getGiftCount", "()I", "setGiftCount", "(I)V", "reset", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35929c {

        /* JADX INFO: renamed from: a */
        @Nullable
        public String f77807a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public String f77808b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public String f77809c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public String f77810d;

        /* JADX INFO: renamed from: e */
        public int f77811e;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF77811e() {
            return this.f77811e;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF77810d() {
            return this.f77810d;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF77809c() {
            return this.f77809c;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF77807a() {
            return this.f77807a;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getF77808b() {
            return this.f77808b;
        }

        /* JADX INFO: renamed from: f */
        public final void m79702f() {
            this.f77807a = "";
            this.f77808b = "";
            this.f77809c = "";
            this.f77810d = "";
            this.f77811e = 0;
        }

        /* JADX INFO: renamed from: g */
        public final void m79703g(int i11) {
            this.f77811e = i11;
        }

        /* JADX INFO: renamed from: h */
        public final void m79704h(@Nullable String str) {
            this.f77810d = str;
        }

        /* JADX INFO: renamed from: i */
        public final void m79705i(@Nullable String str) {
            this.f77809c = str;
        }

        /* JADX INFO: renamed from: j */
        public final void m79706j(@Nullable String str) {
            this.f77807a = str;
        }

        /* JADX INFO: renamed from: k */
        public final void m79707k(@Nullable String str) {
            this.f77808b = str;
        }

        public C35929c() {
            m79702f();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ImageAnimationView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ImageAnimationView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public final void m79694c() {
        for (GiftBulletFrameLayout giftBulletFrameLayout : this.f77804c) {
            if (giftBulletFrameLayout.getVisibility() == 4) {
                InterfaceC35928b interfaceC35928b = this.f77805d;
                if (interfaceC35928b != null) {
                    Intrinsics.checkNotNull(interfaceC35928b);
                    interfaceC35928b.mo79659a(0);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m79695d(@NotNull C35929c model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!isAttachedToWindow()) {
            postDelayed(new Runnable() { // from class: nd0.a
                @Override // java.lang.Runnable
                public final void run() {
                    ImageAnimationView.m79693e(this.f94821b);
                }
            }, 500L);
            return;
        }
        for (GiftBulletFrameLayout giftBulletFrameLayout : this.f77804c) {
            if (giftBulletFrameLayout.getVisibility() == 4) {
                giftBulletFrameLayout.setGiftInfo(model);
                giftBulletFrameLayout.m79676g();
                break;
            }
        }
        m79694c();
    }

    /* JADX INFO: renamed from: f */
    public final void m79696f() {
        for (GiftBulletFrameLayout giftBulletFrameLayout : this.f77804c) {
            giftBulletFrameLayout.m79677i();
        }
    }

    public final void setCallback(@Nullable InterfaceC35928b interfaceC35928b) {
        this.f77805d = interfaceC35928b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77803b = 3;
        GiftBulletFrameLayout[] giftBulletFrameLayoutArr = new GiftBulletFrameLayout[3];
        this.f77804c = giftBulletFrameLayoutArr;
        setOrientation(1);
        int length = giftBulletFrameLayoutArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            GiftBulletFrameLayout giftBulletFrameLayout = new GiftBulletFrameLayout(context, null, 2, null);
            giftBulletFrameLayout.setCallback(new C35927a());
            this.f77804c[i11] = giftBulletFrameLayout;
            addView(giftBulletFrameLayout);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m79693e(ImageAnimationView imageAnimationView) {
        imageAnimationView.m79694c();
    }
}
