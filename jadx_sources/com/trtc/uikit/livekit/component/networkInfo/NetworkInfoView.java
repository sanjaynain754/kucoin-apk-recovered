package com.trtc.uikit.livekit.component.networkInfo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.p179ui.BasicView;
import com.trtc.uikit.livekit.component.networkInfo.store.NetworkInfoState;
import com.trtc.uikit.livekit.component.networkInfo.store.NetworkInfoStore;
import com.trtc.uikit.livekit.component.networkInfo.view.NetworkBadTipsDialog;
import com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import java.util.Arrays;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: NetworkInfoView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u001f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010#\u001a\u00020\"H\u0014J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020\"H\u0002J\b\u0010(\u001a\u00020\"H\u0002J\b\u0010)\u001a\u00020\"H\u0014J\b\u0010*\u001a\u00020\"H\u0014J\b\u0010+\u001a\u00020\"H\u0014J\b\u0010,\u001a\u00020\"H\u0014J\b\u0010-\u001a\u00020\"H\u0002J\b\u0010.\u001a\u00020\"H\u0002J\b\u0010/\u001a\u00020\"H\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0017H\u0003J\u0010\u00103\u001a\u00020\"2\u0006\u00104\u001a\u000205H\u0002J\u0017\u00106\u001a\u00020\"2\b\u00107\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0002\u00108R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010 ¨\u00069"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;", "Lcom/trtc/uikit/livekit/common/ui/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "networkInfoStore", "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;", "state", "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;", "imageNetworkStatus", "Landroid/widget/ImageView;", "textCreateTime", "Landroid/widget/TextView;", "networkInfoPanel", "Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel;", "layoutNetworkInfo", "Landroid/widget/LinearLayout;", TUIConstantDefine.CREATE_TIME, "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "liveTimeRunnable", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "liveListListener", "com/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$liveListListener$1", "Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$liveListListener$1;", "init", "", "initStore", "setScreenOrientation", "isPortrait", "", "initView", "bindViewId", "onAttachedToWindow", "onDetachedFromWindow", "addObserver", "removeObserver", "initNetworkView", "startLiveTimer", "stopLiveTimer", "formatDuration", "", "durationMillis", "onNetworkQualityChange", "networkQuality", "Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;", "onNetworkWeakTipsChange", "isShow", "(Ljava/lang/Boolean;)V", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNetworkInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkInfoView.kt\ncom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
public final class NetworkInfoView extends BasicView {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NetworkInfoStore f77893d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final NetworkInfoState f77894e;

    /* JADX INFO: renamed from: f */
    public ImageView f77895f;

    /* JADX INFO: renamed from: g */
    public TextView f77896g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public NetworkInfoPanel f77897h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f77898i;

    /* JADX INFO: renamed from: j */
    public long f77899j;

    /* JADX INFO: renamed from: k */
    public LiveInfo f77900k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Runnable f77901l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Handler f77902m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final C35943b f77903n;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$b */
    /* JADX INFO: compiled from: NetworkInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$liveListListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "onLiveEnded", "", "liveID", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35943b extends LiveListListener {
        public C35943b() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onLiveEnded(String liveID, LiveEndedReason reason, String message) {
            NetworkInfoPanel networkInfoPanel;
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            NetworkInfoPanel networkInfoPanel2 = NetworkInfoView.this.f77897h;
            if (networkInfoPanel2 == null || !networkInfoPanel2.isShowing() || (networkInfoPanel = NetworkInfoView.this.f77897h) == null) {
                return;
            }
            networkInfoPanel.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$c */
    /* JADX INFO: compiled from: NetworkInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$startLiveTimer$2", "Ljava/lang/Runnable;", "run", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC35944c implements Runnable {
        public RunnableC35944c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis() - NetworkInfoView.this.f77899j;
            TextView textView = NetworkInfoView.this.f77896g;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textCreateTime");
                textView = null;
            }
            textView.setText(NetworkInfoView.this.m79787r(jCurrentTimeMillis));
            NetworkInfoView.this.f77902m.postDelayed(this, 1000L);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NetworkInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$a */
    /* JADX INFO: compiled from: NetworkInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C35937a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkQuality.values().length];
            try {
                iArr[NetworkQuality.POOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkQuality.BAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkQuality.VERY_BAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkQuality.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NetworkInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: q */
    private final void m79784q() {
        View viewFindViewById = findViewById(R$id.ll_network_info);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f77898i = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.iv_network_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f77895f = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.tv_live_time);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f77896g = (TextView) viewFindViewById3;
    }

    /* JADX INFO: renamed from: u */
    public static final void m79785u(NetworkInfoView networkInfoView, View view) {
        Context context = networkInfoView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NetworkInfoPanel networkInfoPanel = new NetworkInfoPanel(context, networkInfoView.f77893d, networkInfoView.f77894e.m79811m().getValue().booleanValue());
        networkInfoView.f77897h = networkInfoPanel;
        networkInfoPanel.show();
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: a */
    public void mo79408a() {
        this.f77893d.m79822f();
        LiveListStore.INSTANCE.shared().addLiveListListener(this.f77903n);
        setSubscribeStateJob(C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new NetworkInfoView$addObserver$1(this, null), 3, null));
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: c */
    public void mo79410c() throws Exception {
        LiveSeatStore.Companion companion = LiveSeatStore.INSTANCE;
        LiveInfo liveInfo = this.f77900k;
        if (liveInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
            liveInfo = null;
        }
        companion.create(liveInfo.getLiveID());
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: d */
    public void mo79411d() {
        this.f77893d.m79836t();
        LiveListStore.INSTANCE.shared().removeLiveListListener(this.f77903n);
        InterfaceC41775x1 f77567b = getF77567b();
        if (f77567b != null) {
            InterfaceC41775x1.a.m91377a(f77567b, null, 1, null);
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: r */
    public final String m79787r(long j11) {
        long j12 = j11 / ((long) 1000);
        long j13 = 3600;
        long j14 = j12 / j13;
        long j15 = 60;
        long j16 = (j12 % j13) / j15;
        long j17 = j12 % j15;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14), Long.valueOf(j16), Long.valueOf(j17)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: s */
    public final void m79788s(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f77900k = liveInfo;
        mo79409b(liveInfo.getLiveID());
        this.f77899j = Math.min(liveInfo.getCreateTime(), System.currentTimeMillis());
        m79792y();
    }

    public final void setScreenOrientation(boolean isPortrait) {
        LinearLayout linearLayout = this.f77898i;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutNetworkInfo");
            linearLayout = null;
        }
        linearLayout.setEnabled(isPortrait);
    }

    /* JADX INFO: renamed from: t */
    public final void m79789t() {
        LinearLayout linearLayout = this.f77898i;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutNetworkInfo");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.component.networkInfo.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NetworkInfoView.m79785u(this.f77911b, view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m79790w(NetworkQuality networkQuality) {
        int i11;
        int i12 = C35937a.$EnumSwitchMapping$0[networkQuality.ordinal()];
        if (i12 == 1) {
            i11 = R$drawable.network_info_network_status_poor;
        } else if (i12 != 2) {
            i11 = (i12 == 3 || i12 == 4) ? R$drawable.network_info_network_status_down : R$drawable.network_info_network_status_good;
        } else {
            i11 = R$drawable.network_info_network_status_very_bad;
        }
        ImageView imageView = this.f77895f;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageNetworkStatus");
            imageView = null;
        }
        imageView.setImageResource(i11);
    }

    /* JADX INFO: renamed from: x */
    public final void m79791x(Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            new NetworkBadTipsDialog(context).show();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m79792y() {
        Runnable runnable = this.f77901l;
        if (runnable != null) {
            this.f77902m.removeCallbacks(runnable);
        }
        RunnableC35944c runnableC35944c = new RunnableC35944c();
        this.f77901l = runnableC35944c;
        Handler handler = this.f77902m;
        Intrinsics.checkNotNull(runnableC35944c);
        handler.post(runnableC35944c);
    }

    /* JADX INFO: renamed from: z */
    public final void m79793z() {
        Runnable runnable = this.f77901l;
        if (runnable != null) {
            this.f77902m.removeCallbacks(runnable);
            this.f77901l = null;
        }
    }

    public /* synthetic */ NetworkInfoView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: v */
    private final void m79786v() {
        LayoutInflater.from(getContext()).inflate(R$layout.network_info_view, (ViewGroup) this, true);
        m79784q();
        m79789t();
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m79793z();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NetworkInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        NetworkInfoStore networkInfoStore = new NetworkInfoStore(context);
        this.f77893d = networkInfoStore;
        this.f77894e = networkInfoStore.getF77928a();
        this.f77902m = new Handler(Looper.getMainLooper());
        this.f77903n = new C35943b();
        m79786v();
    }
}
