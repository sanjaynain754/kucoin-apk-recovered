package com.trtc.uikit.livekit.features.anchorprepare.view.function;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import be0.C4579a;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.component.audioeffect.AudioEffectPanel;
import com.trtc.uikit.livekit.component.beauty.tebeauty.TEBeautyManager;
import com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareState;
import com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareStore;
import com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.livetemplatepicker.LiveTemplatePicker;
import fd0.C37436d;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
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

/* JADX INFO: compiled from: PrepareFunctionView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u0017\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0002\u0010\"J\u0017\u0010#\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0002\u0010\"J\u0017\u0010$\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0002\u0010\"R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/PrepareFunctionView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "audioEffectPanel", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "videoSettingPanel", "Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/PrepareVideoSettingPanel;", "manager", "Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;", "liveCoreView", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "init", "", "onDetachedFromWindow", "addObserver", "removeObserver", "initView", "initBeautyButton", "initAudioEffectButton", "initFlipButton", "initLayoutButton", "initVideoSettingButton", "onMirrorDisableChange", "disable", "", "(Ljava/lang/Boolean;)V", "onAudioEffectDisableChange", "onBeautyDisableChange", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PrepareFunctionView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public AtomicPopover f78491b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public PrepareVideoSettingPanel f78492c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public AnchorPrepareStore f78493d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public LiveCoreView f78494e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public InterfaceC41775x1 f78495f;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView$a */
    /* JADX INFO: compiled from: PrepareFunctionView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorprepare/view/function/PrepareFunctionView$initAudioEffectButton$1$1", "Lcom/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel$OnBackButtonClickListener;", "onClick", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36181a implements AudioEffectPanel.InterfaceC35877a {
        public C36181a() {
        }

        @Override // com.trtc.uikit.livekit.component.audioeffect.AudioEffectPanel.InterfaceC35877a
        /* JADX INFO: renamed from: a */
        public void mo79459a() {
            AtomicPopover atomicPopover = PrepareFunctionView.this.f78491b;
            if (atomicPopover != null) {
                atomicPopover.dismiss();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrepareFunctionView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrepareFunctionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: m */
    public static final void m80658m(PrepareFunctionView prepareFunctionView, View view) {
        String f78473c;
        AnchorPrepareState f78482a;
        if (prepareFunctionView.f78491b == null) {
            Context context = prepareFunctionView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            prepareFunctionView.f78491b = new AtomicPopover(context, null, 2, null);
            Context context2 = prepareFunctionView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            AudioEffectPanel audioEffectPanel = new AudioEffectPanel(context2, null, 0, 6, null);
            AnchorPrepareStore anchorPrepareStore = prepareFunctionView.f78493d;
            if (anchorPrepareStore == null || (f78482a = anchorPrepareStore.getF78482a()) == null || (f78473c = f78482a.getF78473c()) == null) {
                f78473c = "";
            }
            audioEffectPanel.mo79409b(f78473c);
            audioEffectPanel.setOnBackButtonClickListener(prepareFunctionView.new C36181a());
            AtomicPopover atomicPopover = prepareFunctionView.f78491b;
            if (atomicPopover != null) {
                atomicPopover.m88181q(audioEffectPanel);
            }
        }
        AtomicPopover atomicPopover2 = prepareFunctionView.f78491b;
        if (atomicPopover2 != null) {
            atomicPopover2.show();
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m80660q(View view) {
        DeviceStore.Companion companion = DeviceStore.INSTANCE;
        companion.shared().switchCamera(!companion.shared().getDeviceState().isFrontCamera().getValue().booleanValue());
    }

    /* JADX INFO: renamed from: s */
    public static final void m80661s(PrepareFunctionView prepareFunctionView, View view) {
        LiveCoreView liveCoreView;
        AnchorPrepareStore anchorPrepareStore = prepareFunctionView.f78493d;
        if (anchorPrepareStore == null || (liveCoreView = prepareFunctionView.f78494e) == null) {
            return;
        }
        Context context = prepareFunctionView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        new LiveTemplatePicker(context, anchorPrepareStore, liveCoreView).show();
    }

    /* JADX INFO: renamed from: u */
    public static final void m80662u(PrepareFunctionView prepareFunctionView, View view) {
        LiveCoreView liveCoreView;
        if (prepareFunctionView.f78492c == null && (liveCoreView = prepareFunctionView.f78494e) != null) {
            Context context = prepareFunctionView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            prepareFunctionView.f78492c = new PrepareVideoSettingPanel(context, liveCoreView);
        }
        PrepareVideoSettingPanel prepareVideoSettingPanel = prepareFunctionView.f78492c;
        if (prepareVideoSettingPanel != null) {
            prepareVideoSettingPanel.show();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m80664k(@NotNull AnchorPrepareStore manager, @NotNull LiveCoreView liveCoreView) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(liveCoreView, "liveCoreView");
        this.f78493d = manager;
        this.f78494e = liveCoreView;
        TEBeautyManager.f77696a.m79595s();
        m80670v();
        m80663j();
    }

    /* JADX INFO: renamed from: l */
    public final void m80665l() {
        findViewById(R$id.iv_audio_effect).setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorprepare.view.function.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrepareFunctionView.m80658m(this.f78500b, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m80666n() {
        findViewById(R$id.iv_beauty).setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorprepare.view.function.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrepareFunctionView.m80659o(this.f78501b, view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m80667p() {
        findViewById(R$id.iv_flip).setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorprepare.view.function.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrepareFunctionView.m80660q(view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m80668r() {
        findViewById(R$id.iv_layout).setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorprepare.view.function.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrepareFunctionView.m80661s(this.f78503b, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m80669t() {
        findViewById(R$id.iv_video_setting).setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorprepare.view.function.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrepareFunctionView.m80662u(this.f78502b, view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m80671w(Boolean bool) {
        if (C4579a.f4058a.m4446b().getValue().booleanValue()) {
            findViewById(R$id.rl_audio_effect).setVisibility(8);
        } else {
            findViewById(R$id.rl_audio_effect).setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m80672x(Boolean bool) {
        if (C4579a.f4058a.m4447c().getValue().booleanValue()) {
            findViewById(R$id.rl_beauty).setVisibility(8);
        } else {
            findViewById(R$id.rl_beauty).setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m80673y(Boolean bool) {
        if (C4579a.f4058a.m4448d().getValue().booleanValue()) {
            findViewById(R$id.rl_flip).setVisibility(8);
        } else {
            findViewById(R$id.rl_flip).setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m80674z() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78495f;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    public /* synthetic */ PrepareFunctionView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: o */
    public static final void m80659o(PrepareFunctionView prepareFunctionView, View view) {
        Context context = prepareFunctionView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C37436d.m84223e(context);
    }

    /* JADX INFO: renamed from: j */
    public final void m80663j() {
        this.f78495f = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new PrepareFunctionView$addObserver$1(this, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m80674z();
    }

    /* JADX INFO: renamed from: v */
    public final void m80670v() {
        m80666n();
        m80665l();
        m80667p();
        m80668r();
        m80669t();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrepareFunctionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.anchor_prepare_layout_function, (ViewGroup) this, true);
    }
}
