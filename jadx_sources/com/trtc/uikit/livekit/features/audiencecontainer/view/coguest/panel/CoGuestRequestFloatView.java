package com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.bugly.proguard.C33978va;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoGuestRequestFloatView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\b\u0010\u0014\u001a\u00020\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CoGuestRequestFloatView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textWaitingPass", "Landroid/widget/TextView;", "dotCount", "timerHandler", "Landroid/os/Handler;", "timerRunnable", "Ljava/lang/Runnable;", "initView", "", "onAttachedToWindow", "onDetachedFromWindow", "initUserAvatarView", "bindViewId", "stopTimerTask", "startTimerTask", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoGuestRequestFloatView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f78812f = new Companion(null);

    /* JADX INFO: renamed from: b */
    public TextView f78813b;

    /* JADX INFO: renamed from: c */
    public int f78814c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Handler f78815d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Runnable f78816e;

    /* JADX INFO: compiled from: CoGuestRequestFloatView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CoGuestRequestFloatView$Companion;", "", "<init>", "()V", "MIN_DOT_COUNT", "", "MAX_DOT_COUNT", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestRequestFloatView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestRequestFloatView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public static final void m81094f(CoGuestRequestFloatView coGuestRequestFloatView) {
        int i11 = coGuestRequestFloatView.f78814c + 1;
        coGuestRequestFloatView.f78814c = i11;
        if (i11 > 3) {
            coGuestRequestFloatView.f78814c = 1;
        }
        StringBuilder sb2 = new StringBuilder(coGuestRequestFloatView.getContext().getString(R$string.common_waiting_pass));
        int i12 = coGuestRequestFloatView.f78814c;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(C33978va.f72339h);
        }
        TextView textView = coGuestRequestFloatView.f78813b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textWaitingPass");
            textView = null;
        }
        textView.setText(sb2.toString());
        Handler handler = coGuestRequestFloatView.f78815d;
        if (handler != null) {
            Runnable runnable = coGuestRequestFloatView.f78816e;
            Intrinsics.checkNotNull(runnable);
            handler.postDelayed(runnable, 1000L);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m81095b() {
        View viewFindViewById = findViewById(R$id.text_waiting_pass);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78813b = (TextView) viewFindViewById;
    }

    /* JADX INFO: renamed from: c */
    public final void m81096c() {
        String avatarURL;
        AtomicAvatar atomicAvatar = (AtomicAvatar) findViewById(R$id.link_mic_audience_icon);
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (value == null || (avatarURL = value.getAvatarURL()) == null) {
            avatarURL = "";
        }
        atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(avatarURL, R$drawable.livekit_ic_avatar));
    }

    /* JADX INFO: renamed from: e */
    public final void m81098e() {
        this.f78815d = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.v
            @Override // java.lang.Runnable
            public final void run() {
                CoGuestRequestFloatView.m81094f(this.f78884b);
            }
        };
        this.f78816e = runnable;
        Handler handler = this.f78815d;
        if (handler != null) {
            Intrinsics.checkNotNull(runnable);
            handler.post(runnable);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m81099g() {
        Handler handler = this.f78815d;
        if (handler != null) {
            Runnable runnable = this.f78816e;
            Intrinsics.checkNotNull(runnable);
            handler.removeCallbacks(runnable);
        }
        this.f78815d = null;
        this.f78816e = null;
    }

    public /* synthetic */ CoGuestRequestFloatView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public final void m81097d() {
        LayoutInflater.from(getContext()).inflate(R$layout.livekit_audience_link_mic_waiting_pass, (ViewGroup) this, true);
        m81095b();
        m81096c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m81098e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m81099g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestRequestFloatView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78814c = 1;
        m81097d();
    }
}
