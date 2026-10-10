package com.trtc.uikit.livekit.component.networkInfo.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$color;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.component.networkInfo.store.NetworkInfoState;
import com.trtc.uikit.livekit.component.networkInfo.store.NetworkInfoStore;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkInfoPanel.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001NB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020)H\u0016J\b\u0010.\u001a\u00020)H\u0016J\b\u0010/\u001a\u00020)H\u0002J\b\u00100\u001a\u00020)H\u0002J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H\u0002J\b\u00103\u001a\u00020)H\u0002J\b\u00104\u001a\u00020)H\u0002J\u0012\u00105\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0012\u00108\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010;\u001a\u00020)2\b\u0010<\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010=\u001a\u00020)2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u0017\u0010@\u001a\u00020)2\b\u0010A\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010BJ\u0012\u0010C\u001a\u00020)2\b\u0010D\u001a\u0004\u0018\u00010EH\u0002J\u0017\u0010F\u001a\u00020)2\b\u0010G\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0002\u0010BJ\u0017\u0010H\u001a\u00020)2\b\u0010I\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010BJ\u0017\u0010J\u001a\u00020)2\b\u0010K\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010BJ\u0017\u0010L\u001a\u00020)2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010MR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", NotificationCompat.CATEGORY_SERVICE, "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;", "isTakeSeat", "", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;Z)V", "state", "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;", "colorNormal", "", "colorAbnormal", "isRtl", "imageVideoStatus", "Landroid/widget/ImageView;", "imageAudioStatus", "imageDeviceTemp", "imageNetworkStatus", "textVideoStatus", "Landroid/widget/TextView;", "textAudioStatus", "textDeviceTemp", "textNetworkStatus", "textResolution", "textAudioMode", "textVideoDescription", "layoutStreamStatus", "Landroid/widget/LinearLayout;", "textRTT", "textDownLoss", "textUpLoss", "seekVolume", "Landroid/widget/SeekBar;", "textVolume", "layoutAudioMode", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "initView", "", "bindViewId", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onAttachedToWindow", "onDetachedFromWindow", "addObserver", "removeObserver", "initVolumeView", "initStreamStatusVisible", "initAudioModeView", "initDeviceTempView", "onVideoResolutionChange", "resolution", "", "onVideoStatusChange", "videoStatus", "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;", "onAudioStatusChange", "audioStatus", "onAudioQualityChange", "audioQuality", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;", "onVolumeChange", "volume", "(Ljava/lang/Integer;)V", "onNetWorkStatusChange", "networkQuality", "Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;", "onRTTChange", "rtt", "onUpLossChange", "upLoss", "onDownLossChange", "downLoss", "onTakeSeatStatusChange", "(Ljava/lang/Boolean;)V", "OnAudioModeListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NetworkInfoPanel extends AtomicPopover {

    /* JADX INFO: renamed from: A */
    public TextView f77948A;

    /* JADX INFO: renamed from: B */
    public TextView f77949B;

    /* JADX INFO: renamed from: C */
    public TextView f77950C;

    /* JADX INFO: renamed from: D */
    public TextView f77951D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f77952E;

    /* JADX INFO: renamed from: F */
    public TextView f77953F;

    /* JADX INFO: renamed from: G */
    public TextView f77954G;

    /* JADX INFO: renamed from: H */
    public TextView f77955H;

    /* JADX INFO: renamed from: I */
    public SeekBar f77956I;

    /* JADX INFO: renamed from: J */
    public TextView f77957J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f77958K;

    /* JADX INFO: renamed from: L */
    @Nullable
    public InterfaceC41775x1 f77959L;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Context f77960m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final NetworkInfoStore f77961n;

    /* JADX INFO: renamed from: o */
    public boolean f77962o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final NetworkInfoState f77963p;

    /* JADX INFO: renamed from: q */
    public final int f77964q;

    /* JADX INFO: renamed from: r */
    public final int f77965r;

    /* JADX INFO: renamed from: s */
    public final boolean f77966s;

    /* JADX INFO: renamed from: t */
    public ImageView f77967t;

    /* JADX INFO: renamed from: u */
    public ImageView f77968u;

    /* JADX INFO: renamed from: v */
    public ImageView f77969v;

    /* JADX INFO: renamed from: w */
    public ImageView f77970w;

    /* JADX INFO: renamed from: x */
    public TextView f77971x;

    /* JADX INFO: renamed from: y */
    public TextView f77972y;

    /* JADX INFO: renamed from: z */
    public TextView f77973z;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$a */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel$OnAudioModeListener;", "", "onAudioModeChecked", "", "audioQuality", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC35949a {
        /* JADX INFO: renamed from: a */
        void mo79889a(@NotNull TUIRoomDefine.AudioQuality audioQuality);
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$c */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel$initAudioModeView$1$1", "Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel$OnAudioModeListener;", "onAudioModeChecked", "", "audioQuality", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35961c implements InterfaceC35949a {
        public C35961c() {
        }

        @Override // com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel.InterfaceC35949a
        /* JADX INFO: renamed from: a */
        public void mo79889a(TUIRoomDefine.AudioQuality audioQuality) {
            Intrinsics.checkNotNullParameter(audioQuality, "audioQuality");
            NetworkInfoPanel.this.f77961n.m79840x(audioQuality);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$d */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel$initVolumeView$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35962d implements SeekBar.OnSeekBarChangeListener {
        public C35962d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            TextView textView = NetworkInfoPanel.this.f77957J;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textVolume");
                textView = null;
            }
            textView.setText(String.valueOf(progress));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            NetworkInfoPanel.this.f77961n.m79837u(seekBar.getProgress());
            NetworkInfoPanel.this.f77961n.m79842z(seekBar.getProgress());
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$b */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C35960b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[TUIRoomDefine.AudioQuality.values().length];
            try {
                iArr[TUIRoomDefine.AudioQuality.SPEECH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TUIRoomDefine.AudioQuality.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TUIRoomDefine.AudioQuality.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NetworkInfoState.Status.values().length];
            try {
                iArr2[NetworkInfoState.Status.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NetworkInfoState.Status.Abnormal.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NetworkQuality.values().length];
            try {
                iArr3[NetworkQuality.POOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[NetworkQuality.BAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[NetworkQuality.VERY_BAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[NetworkQuality.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkInfoPanel(@NotNull Context context, @NotNull NetworkInfoStore service, boolean z11) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f77960m = context;
        this.f77961n = service;
        this.f77962o = z11;
        this.f77963p = service.getF77928a();
        this.f77964q = ContextCompat.getColor(context, R$color.common_text_color_normal);
        this.f77965r = ContextCompat.getColor(context, R$color.common_text_color_abnormal);
        this.f77966s = context.getResources().getConfiguration().getLayoutDirection() == 1;
        m79873W();
    }

    /* JADX INFO: renamed from: R */
    private final void m79871R(View view) {
        View viewFindViewById = view.findViewById(R$id.ll_host_stream_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f77952E = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.iv_video_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f77967t = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.iv_audio_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f77968u = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.iv_device_temp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f77969v = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.iv_network_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f77970w = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.tv_video_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f77971x = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R$id.tv_audio_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f77972y = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R$id.tv_device_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f77973z = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R$id.tv_network_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f77948A = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R$id.tv_resolution);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f77949B = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R$id.tv_audio_mode);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f77950C = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R$id.tv_video_quality);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f77951D = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R$id.tv_rtt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f77953F = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R$id.tv_down_loss);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f77954G = (TextView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R$id.tv_up_loss);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f77955H = (TextView) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R$id.sb_audio_volume);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.f77956I = (SeekBar) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R$id.tv_audio_volume);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        this.f77957J = (TextView) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(R$id.ll_audio_mode);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        this.f77958K = (LinearLayout) viewFindViewById18;
    }

    /* JADX INFO: renamed from: W */
    private final void m79873W() {
        View viewInflate = LayoutInflater.from(this.f77960m).inflate(R$layout.network_info_panel, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m79871R(viewInflate);
        m79878X();
        m88181q(viewInflate);
    }

    /* JADX INFO: renamed from: i0 */
    private final void m79874i0() {
        InterfaceC41775x1 interfaceC41775x1 = this.f77959L;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m79875S() {
        int i11;
        int i12 = C35960b.$EnumSwitchMapping$0[this.f77963p.m79800b().getValue().ordinal()];
        if (i12 != 1) {
            i11 = i12 != 2 ? R$string.common_audio_mode_default : R$string.common_audio_mode_music;
        } else {
            i11 = R$string.common_audio_mode_speech;
        }
        TextView textView = this.f77950C;
        LinearLayout linearLayout = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textAudioMode");
            textView = null;
        }
        textView.setText(i11);
        LinearLayout linearLayout2 = this.f77958K;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutAudioMode");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.component.networkInfo.view.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NetworkInfoPanel.m79872T(this.f77995b, view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m79876U() {
        this.f77961n.m79824h(this.f77960m);
        int i11 = this.f77963p.getF77920i() ? R$drawable.network_info_device_temp_abnormal : R$drawable.network_info_device_temp_normal;
        ImageView imageView = this.f77969v;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageDeviceTemp");
            imageView = null;
        }
        imageView.setImageResource(i11);
        int i12 = this.f77963p.getF77920i() ? R$string.common_exception : R$string.common_normal;
        TextView textView2 = this.f77973z;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textDeviceTemp");
        } else {
            textView = textView2;
        }
        textView.setText(i12);
    }

    /* JADX INFO: renamed from: V */
    public final void m79877V() {
        LinearLayout linearLayout = this.f77952E;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutStreamStatus");
            linearLayout = null;
        }
        linearLayout.setVisibility(this.f77962o ? 0 : 8);
    }

    /* JADX INFO: renamed from: X */
    public final void m79878X() {
        SeekBar seekBar = this.f77956I;
        SeekBar seekBar2 = null;
        if (seekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekVolume");
            seekBar = null;
        }
        seekBar.setMax(100);
        SeekBar seekBar3 = this.f77956I;
        if (seekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekVolume");
        } else {
            seekBar2 = seekBar3;
        }
        seekBar2.setOnSeekBarChangeListener(new C35962d());
    }

    /* JADX INFO: renamed from: Y */
    public final void m79879Y(TUIRoomDefine.AudioQuality audioQuality) {
        int i11;
        int i12 = audioQuality == null ? -1 : C35960b.$EnumSwitchMapping$0[audioQuality.ordinal()];
        if (i12 != 1) {
            i11 = i12 != 3 ? R$string.common_audio_mode_music : R$string.common_audio_mode_default;
        } else {
            i11 = R$string.common_audio_mode_speech;
        }
        TextView textView = this.f77950C;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textAudioMode");
            textView = null;
        }
        textView.setText(i11);
    }

    /* JADX INFO: renamed from: Z */
    public final void m79880Z(NetworkInfoState.Status status) {
        int i11 = status == null ? -1 : C35960b.$EnumSwitchMapping$1[status.ordinal()];
        TextView textView = null;
        if (i11 == 1) {
            ImageView imageView = this.f77968u;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageAudioStatus");
                imageView = null;
            }
            imageView.setImageResource(R$drawable.network_info_audio_status_normal);
            TextView textView2 = this.f77972y;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textAudioStatus");
            } else {
                textView = textView2;
            }
            textView.setText(R$string.common_normal);
            return;
        }
        if (i11 != 2) {
            ImageView imageView2 = this.f77968u;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageAudioStatus");
                imageView2 = null;
            }
            imageView2.setImageResource(R$drawable.network_info_audio_status_abnormal);
            TextView textView3 = this.f77972y;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textAudioStatus");
            } else {
                textView = textView3;
            }
            textView.setText(R$string.common_close);
            return;
        }
        ImageView imageView3 = this.f77968u;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageAudioStatus");
            imageView3 = null;
        }
        imageView3.setImageResource(R$drawable.network_info_audio_status_abnormal);
        TextView textView4 = this.f77972y;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textAudioStatus");
        } else {
            textView = textView4;
        }
        textView.setText(R$string.common_exception);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m79881a0(Integer num) {
        StringBuilder sb2;
        if (num != null) {
            int iIntValue = num.intValue();
            TextView textView = this.f77954G;
            TextView textView2 = null;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textDownLoss");
                textView = null;
            }
            if (this.f77966s) {
                sb2 = new StringBuilder();
                sb2.append(iIntValue);
                sb2.append('%');
            } else {
                sb2 = new StringBuilder();
                sb2.append('%');
                sb2.append(iIntValue);
            }
            textView.setText(sb2.toString());
            TextView textView3 = this.f77954G;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textDownLoss");
            } else {
                textView2 = textView3;
            }
            textView2.setTextColor(iIntValue > 10 ? this.f77965r : this.f77964q);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m79882b0(NetworkQuality networkQuality) {
        int i11 = networkQuality == null ? -1 : C35960b.$EnumSwitchMapping$2[networkQuality.ordinal()];
        TextView textView = null;
        if (i11 == 1) {
            ImageView imageView = this.f77970w;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageNetworkStatus");
                imageView = null;
            }
            imageView.setImageResource(R$drawable.network_info_network_status_poor);
            TextView textView2 = this.f77948A;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textNetworkStatus");
            } else {
                textView = textView2;
            }
            textView.setText(R$string.common_exception);
            return;
        }
        if (i11 == 2) {
            ImageView imageView2 = this.f77970w;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageNetworkStatus");
                imageView2 = null;
            }
            imageView2.setImageResource(R$drawable.network_info_network_status_very_bad);
            TextView textView3 = this.f77948A;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textNetworkStatus");
            } else {
                textView = textView3;
            }
            textView.setText(R$string.common_exception);
            return;
        }
        if (i11 == 3 || i11 == 4) {
            ImageView imageView3 = this.f77970w;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageNetworkStatus");
                imageView3 = null;
            }
            imageView3.setImageResource(R$drawable.network_info_network_status_down);
            TextView textView4 = this.f77948A;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textNetworkStatus");
            } else {
                textView = textView4;
            }
            textView.setText(R$string.common_exception);
            return;
        }
        ImageView imageView4 = this.f77970w;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageNetworkStatus");
            imageView4 = null;
        }
        imageView4.setImageResource(R$drawable.network_info_network_status_good);
        TextView textView5 = this.f77948A;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textNetworkStatus");
        } else {
            textView = textView5;
        }
        textView.setText(R$string.common_normal);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c0 */
    public final void m79883c0(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            TextView textView = this.f77953F;
            TextView textView2 = null;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textRTT");
                textView = null;
            }
            textView.setText(iIntValue + "ms");
            TextView textView3 = this.f77953F;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textRTT");
            } else {
                textView2 = textView3;
            }
            textView2.setTextColor(iIntValue > 100 ? this.f77965r : this.f77964q);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m79884d0(Boolean bool) {
        LinearLayout linearLayout = this.f77952E;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutStreamStatus");
            linearLayout = null;
        }
        linearLayout.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m79885e0(Integer num) {
        StringBuilder sb2;
        if (num != null) {
            int iIntValue = num.intValue();
            TextView textView = this.f77955H;
            TextView textView2 = null;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textUpLoss");
                textView = null;
            }
            if (this.f77966s) {
                sb2 = new StringBuilder();
                sb2.append(iIntValue);
                sb2.append('%');
            } else {
                sb2 = new StringBuilder();
                sb2.append('%');
                sb2.append(iIntValue);
            }
            textView.setText(sb2.toString());
            TextView textView3 = this.f77955H;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textUpLoss");
            } else {
                textView2 = textView3;
            }
            textView2.setTextColor(iIntValue > 10 ? this.f77965r : this.f77964q);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m79886f0(String str) {
        TextView textView = this.f77949B;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textResolution");
            textView = null;
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m79887g0(NetworkInfoState.Status status) {
        int i11 = status == null ? -1 : C35960b.$EnumSwitchMapping$1[status.ordinal()];
        TextView textView = null;
        if (i11 == 1) {
            ImageView imageView = this.f77967t;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageVideoStatus");
                imageView = null;
            }
            imageView.setImageResource(R$drawable.network_info_video_status_normal);
            TextView textView2 = this.f77971x;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textVideoStatus");
                textView2 = null;
            }
            textView2.setText(R$string.common_normal);
            TextView textView3 = this.f77951D;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textVideoDescription");
            } else {
                textView = textView3;
            }
            textView.setText(R$string.common_video_stream_smooth);
            return;
        }
        if (i11 != 2) {
            ImageView imageView2 = this.f77967t;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageVideoStatus");
                imageView2 = null;
            }
            imageView2.setImageResource(R$drawable.network_info_video_status_abnormal);
            TextView textView4 = this.f77971x;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textVideoStatus");
                textView4 = null;
            }
            textView4.setText(R$string.common_close);
            TextView textView5 = this.f77951D;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textVideoDescription");
            } else {
                textView = textView5;
            }
            textView.setText(R$string.common_video_capture_closed);
            return;
        }
        ImageView imageView3 = this.f77967t;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageVideoStatus");
            imageView3 = null;
        }
        imageView3.setImageResource(R$drawable.network_info_video_status_abnormal);
        TextView textView6 = this.f77971x;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textVideoStatus");
            textView6 = null;
        }
        textView6.setText(R$string.common_exception);
        TextView textView7 = this.f77951D;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textVideoDescription");
        } else {
            textView = textView7;
        }
        textView.setText(R$string.common_video_stream_freezing);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79888h0(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            SeekBar seekBar = this.f77956I;
            TextView textView = null;
            if (seekBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekVolume");
                seekBar = null;
            }
            seekBar.setProgress(iIntValue);
            TextView textView2 = this.f77957J;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textVolume");
            } else {
                textView = textView2;
            }
            textView.setText(String.valueOf(iIntValue));
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m79870Q() {
        this.f77959L = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new NetworkInfoPanel$addObserver$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: T */
    public static final void m79872T(NetworkInfoPanel networkInfoPanel, View view) {
        networkInfoPanel.hide();
        AudioModePanel audioModePanel = new AudioModePanel(networkInfoPanel.f77960m);
        audioModePanel.setAudioModeListener(networkInfoPanel.new C35961c());
        audioModePanel.show();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f77961n.m79831o();
        m79870Q();
        m79877V();
        m79876U();
        m79875S();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m79874i0();
    }
}
