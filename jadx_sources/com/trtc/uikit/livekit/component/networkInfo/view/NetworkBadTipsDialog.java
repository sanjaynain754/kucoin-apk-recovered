package com.trtc.uikit.livekit.component.networkInfo.view;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkBadTipsDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkBadTipsDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mImageClose", "Landroid/widget/ImageView;", "mTextSwitchNetwork", "Landroid/widget/TextView;", "mHandler", "Landroid/os/Handler;", "mDismissRunnable", "Ljava/lang/Runnable;", "initView", "", "bindViewId", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initCloseView", "initSwitchNetworkView", TIMPushProvider.f75062n, "dismiss", "safeDismiss", "setAutoDismiss", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NetworkBadTipsDialog extends Dialog {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f77943f = new Companion(null);

    /* JADX INFO: renamed from: b */
    public ImageView f77944b;

    /* JADX INFO: renamed from: c */
    public TextView f77945c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Handler f77946d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Runnable f77947e;

    /* JADX INFO: compiled from: NetworkBadTipsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkBadTipsDialog$Companion;", "", "<init>", "()V", "NETWORK_BAD_TIPS_DURATION", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkBadTipsDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77946d = new Handler(Looper.getMainLooper());
        this.f77947e = new Runnable() { // from class: com.trtc.uikit.livekit.component.networkInfo.view.c
            @Override // java.lang.Runnable
            public final void run() {
                NetworkBadTipsDialog.m79849j(this.f77992b);
            }
        };
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        m79853i();
    }

    /* JADX INFO: renamed from: h */
    public static final void m79848h(NetworkBadTipsDialog networkBadTipsDialog, View view) {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        intent.setFlags(268435456);
        networkBadTipsDialog.getContext().startActivity(intent);
        networkBadTipsDialog.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public final void m79850d(View view) {
        View viewFindViewById = view.findViewById(R$id.tv_switch_network);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f77945c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f77944b = (ImageView) viewFindViewById2;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f77946d.removeCallbacks(this.f77947e);
        super.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m79851e() {
        ImageView imageView = this.f77944b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImageClose");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.component.networkInfo.view.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NetworkBadTipsDialog.m79847f(this.f77993b, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m79852g() {
        TextView textView = this.f77945c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextSwitchNetwork");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.component.networkInfo.view.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NetworkBadTipsDialog.m79848h(this.f77994b, view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m79855l() {
        this.f77946d.postDelayed(this.f77947e, 5000L);
    }

    /* JADX INFO: renamed from: f */
    public static final void m79847f(NetworkBadTipsDialog networkBadTipsDialog, View view) {
        networkBadTipsDialog.dismiss();
    }

    /* JADX INFO: renamed from: j */
    public static final void m79849j(NetworkBadTipsDialog networkBadTipsDialog) {
        networkBadTipsDialog.m79854k();
    }

    /* JADX INFO: renamed from: i */
    public final void m79853i() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.network_info_network_bad_tips_view, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m79850d(viewInflate);
        m79851e();
        m79852g();
        setContentView(viewInflate);
    }

    /* JADX INFO: renamed from: k */
    public final void m79854k() {
        Window window;
        View decorView;
        IBinder windowToken;
        View decorView2;
        try {
            if (isShowing() && (window = getWindow()) != null && (decorView = window.getDecorView()) != null && decorView.isAttachedToWindow()) {
                Window window2 = getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null) {
                    windowToken = decorView2.getWindowToken();
                } else {
                    windowToken = null;
                }
                if (windowToken != null) {
                    dismiss();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m79855l();
    }
}
