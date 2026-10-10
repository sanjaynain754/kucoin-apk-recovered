package com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.credentials.provider.CredentialEntry;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.trtc.tuikit.common.permission.AbstractC35867d;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.common.p179ui.RoundFrameLayout;
import ee0.C37144f;
import fd0.C37436d;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.view.CameraView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import vc0.C45494c;
import vc0.C45495d;
import vc0.C45497f;

/* JADX INFO: compiled from: VideoCoGuestSettingsDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0004*\u0001\"\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0005J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#¨\u0006%"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore$AudienceViewListener;", "context", "Landroid/content/Context;", "audienceStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "seatIndex", "", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;I)V", "roundFrameLayout", "Lcom/trtc/uikit/livekit/common/ui/RoundFrameLayout;", "cameraView", "Lio/trtc/tuikit/atomicxcore/api/view/CameraView;", "buttonApplyLinkMic", "Landroid/widget/Button;", "recycleSettingsOption", "Landroidx/recyclerview/widget/RecyclerView;", "initView", "", "bindViewId", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onAttachedToWindow", "onDetachedFromWindow", "initRoundFrameLayout", "initApplyLinkMicButton", "initCameraView", "initRecycleSettingsOption", "onRoomDismissed", "roomId", "", "onMyItemClickListener", "com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$onMyItemClickListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$onMyItemClickListener$1;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class VideoCoGuestSettingsDialog extends AtomicPopover implements C37144f.a {

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Companion f78841t = new Companion(null);

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final LiveKitLogger f78842u = LiveKitLogger.f77564c.getLiveStreamLogger("VideoCoGuestSettingsDialog");

    /* JADX INFO: renamed from: m */
    @NotNull
    public final C37144f f78843m;

    /* JADX INFO: renamed from: n */
    public final int f78844n;

    /* JADX INFO: renamed from: o */
    public RoundFrameLayout f78845o;

    /* JADX INFO: renamed from: p */
    public CameraView f78846p;

    /* JADX INFO: renamed from: q */
    public Button f78847q;

    /* JADX INFO: renamed from: r */
    public RecyclerView f78848r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final C36275d f78849s;

    /* JADX INFO: compiled from: VideoCoGuestSettingsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsDialog$a */
    /* JADX INFO: compiled from: VideoCoGuestSettingsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$initApplyLinkMicButton$1$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onGranted", "", "onDenied", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36272a extends AbstractC35867d {

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsDialog$a$a */
        /* JADX INFO: compiled from: VideoCoGuestSettingsDialog.kt */
        @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$initApplyLinkMicButton$1$1$onGranted$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onGranted", "", "onDenied", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a extends AbstractC35867d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ VideoCoGuestSettingsDialog f78851a;

            public a(VideoCoGuestSettingsDialog videoCoGuestSettingsDialog) {
                this.f78851a = videoCoGuestSettingsDialog;
            }

            /* JADX INFO: renamed from: g */
            public static final Unit m81157g(final VideoCoGuestSettingsDialog videoCoGuestSettingsDialog, C45494c completionHandler) {
                Intrinsics.checkNotNullParameter(completionHandler, "$this$completionHandler");
                completionHandler.m100462i(new Function0() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.m0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return VideoCoGuestSettingsDialog.C36272a.a.m81158h(videoCoGuestSettingsDialog);
                    }
                });
                completionHandler.m100461h(new Function2() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.n0
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return VideoCoGuestSettingsDialog.C36272a.a.m81159i(videoCoGuestSettingsDialog, ((Integer) obj).intValue(), (String) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: i */
            public static final Unit m81159i(VideoCoGuestSettingsDialog videoCoGuestSettingsDialog, int i11, String str) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                videoCoGuestSettingsDialog.f78843m.getF82429k().m80790g(false);
                ErrorLocalized.f77561a.onError(i11);
                return Unit.INSTANCE;
            }

            @Override // com.trtc.tuikit.common.permission.AbstractC35867d
            /* JADX INFO: renamed from: b */
            public void mo79394b() {
                this.f78851a.f78843m.getF82429k().m80790g(true);
                this.f78851a.f78843m.getF82429k().m80789f(true);
                CoGuestStore f82424f = this.f78851a.f78843m.getF82424f();
                int i11 = this.f78851a.f78844n;
                final VideoCoGuestSettingsDialog videoCoGuestSettingsDialog = this.f78851a;
                f82424f.applyForSeat(i11, 60, CredentialEntry.TRUE_STRING, C45495d.m100463a(new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.l0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return VideoCoGuestSettingsDialog.C36272a.a.m81157g(videoCoGuestSettingsDialog, (C45494c) obj);
                    }
                }));
            }

            /* JADX INFO: renamed from: h */
            public static final Unit m81158h(VideoCoGuestSettingsDialog videoCoGuestSettingsDialog) {
                videoCoGuestSettingsDialog.f78843m.getF82429k().m80790g(false);
                return Unit.INSTANCE;
            }

            @Override // com.trtc.tuikit.common.permission.AbstractC35867d
            /* JADX INFO: renamed from: a */
            public void mo79393a() {
                VideoCoGuestSettingsDialog.f78842u.m79403a("requestCameraPermissions:[onDenied]");
            }
        }

        public C36272a() {
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: a */
        public void mo79393a() {
            VideoCoGuestSettingsDialog.f78842u.m79403a("requestCameraPermissions:[onDenied]");
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: b */
        public void mo79394b() {
            VideoCoGuestSettingsDialog.f78842u.m79404b("requestCameraPermissions:[onGranted]");
            C45497f c45497f = C45497f.f102528a;
            Context contextM79397b = ContextProvider.m79397b();
            Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
            c45497f.m100467b(contextM79397b, new a(VideoCoGuestSettingsDialog.this));
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsDialog$b */
    /* JADX INFO: compiled from: VideoCoGuestSettingsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$initCameraView$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onGranted", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36273b extends AbstractC35867d {
        public C36273b() {
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: b */
        public void mo79394b() throws Exception {
            VideoCoGuestSettingsDialog.this.f78843m.getF82420b().switchCamera(true);
            DeviceStore deviceStoreShared = DeviceStore.INSTANCE.shared();
            CameraView cameraView = VideoCoGuestSettingsDialog.this.f78846p;
            if (cameraView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraView");
                cameraView = null;
            }
            deviceStoreShared.startCameraTest(cameraView, null);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsDialog$c */
    /* JADX INFO: compiled from: VideoCoGuestSettingsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$initRecycleSettingsOption$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$OnItemClickListener;", "onBeautyItemClicked", "", "onFlipItemClicked", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36274c implements VideoCoGuestSettingsAdapter.InterfaceC36269b {
        public C36274c() {
        }

        @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsAdapter.InterfaceC36269b
        /* JADX INFO: renamed from: a */
        public void mo81136a() {
            Context context = VideoCoGuestSettingsDialog.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C37436d.m84223e(context);
        }

        @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsAdapter.InterfaceC36269b
        /* JADX INFO: renamed from: b */
        public void mo81137b() {
            VideoCoGuestSettingsDialog.this.f78843m.getF82420b().switchCamera(!VideoCoGuestSettingsDialog.this.f78843m.getF82420b().getDeviceState().isFrontCamera().getValue().booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsDialog$d */
    /* JADX INFO: compiled from: VideoCoGuestSettingsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$onMyItemClickListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$OnItemClickListener;", "onBeautyItemClicked", "", "onFlipItemClicked", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36275d implements VideoCoGuestSettingsAdapter.InterfaceC36269b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f78854a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VideoCoGuestSettingsDialog f78855b;

        public C36275d(Context context, VideoCoGuestSettingsDialog videoCoGuestSettingsDialog) {
            this.f78854a = context;
            this.f78855b = videoCoGuestSettingsDialog;
        }

        @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsAdapter.InterfaceC36269b
        /* JADX INFO: renamed from: a */
        public void mo81136a() {
            C37436d.m84223e(this.f78854a);
        }

        @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsAdapter.InterfaceC36269b
        /* JADX INFO: renamed from: b */
        public void mo81137b() {
            this.f78855b.f78843m.getF82420b().switchCamera(!this.f78855b.f78843m.getF82420b().getDeviceState().isFrontCamera().getValue().booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCoGuestSettingsDialog(@NotNull Context context, @NotNull C37144f audienceStore, int i11) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audienceStore, "audienceStore");
        this.f78843m = audienceStore;
        this.f78844n = i11;
        m81153N();
        this.f78849s = new C36275d(context, this);
    }

    /* JADX INFO: renamed from: H */
    private final void m81147H(View view) {
        View viewFindViewById = view.findViewById(R$id.preview_audience_video);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78846p = (CameraView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.btn_apply_link_mic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78847q = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.video_settings_options);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78848r = (RecyclerView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.fl_preview_audience_video);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78845o = (RoundFrameLayout) viewFindViewById4;
    }

    /* JADX INFO: renamed from: I */
    public final void m81149I() {
        Button button = this.f78847q;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonApplyLinkMic");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoCoGuestSettingsDialog.m81148J(this.f78874b, view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m81150K() {
        C45497f c45497f = C45497f.f102528a;
        Context contextM79397b = ContextProvider.m79397b();
        Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
        c45497f.m100466a(contextM79397b, new C36273b());
    }

    /* JADX INFO: renamed from: L */
    public final void m81151L() {
        RecyclerView recyclerView = this.f78848r;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycleSettingsOption");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        VideoCoGuestSettingsAdapter videoCoGuestSettingsAdapter = new VideoCoGuestSettingsAdapter(context);
        videoCoGuestSettingsAdapter.setOnItemClickListener(new C36274c());
        RecyclerView recyclerView3 = this.f78848r;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycleSettingsOption");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.setAdapter(videoCoGuestSettingsAdapter);
    }

    /* JADX INFO: renamed from: M */
    public final void m81152M() {
        RoundFrameLayout roundFrameLayout = this.f78845o;
        if (roundFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roundFrameLayout");
            roundFrameLayout = null;
        }
        roundFrameLayout.setRadius(ScreenUtil.dip2px(16.0f));
    }

    @Override // ee0.C37144f.a
    public void onRoomDismissed(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        dismiss();
        C37436d.m84222d();
        C37436d.m84221c();
    }

    /* JADX INFO: renamed from: J */
    public static final void m81148J(VideoCoGuestSettingsDialog videoCoGuestSettingsDialog, View view) {
        if (!view.isEnabled()) {
            return;
        }
        view.setEnabled(false);
        AtomicToast atomicToast = AtomicToast.f87566a;
        Context context = videoCoGuestSettingsDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String string = videoCoGuestSettingsDialog.getContext().getString(R$string.common_toast_apply_link_mic);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
        f78842u.m79404b("requestMicrophonePermissions success");
        C45497f c45497f = C45497f.f102528a;
        Context contextM79397b = ContextProvider.m79397b();
        Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
        c45497f.m100466a(contextM79397b, videoCoGuestSettingsDialog.new C36272a());
        videoCoGuestSettingsDialog.dismiss();
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: N */
    public final void m81153N() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.livekit_dialog_link_video_settings, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m81147H(viewInflate);
        m81151L();
        m81150K();
        m81149I();
        m81152M();
        m88181q(viewInflate);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f78843m.m83085d(this);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f78843m.m83081B(this);
        this.f78843m.getF82420b().stopCameraTest();
    }
}
