package com.trtc.uikit.livekit.features.anchorprepare;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import be0.C4579a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.trtc.uikit.livekit.R$color;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.common.p179ui.RoundFrameLayout;
import com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareState;
import com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareStore;
import com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView;
import fd0.C37436d;
import io.trtc.tuikit.atomicx.widget.basicwidget.button.AtomicButton;
import io.trtc.tuikit.atomicx.widget.basicwidget.button.ButtonColorType;
import io.trtc.tuikit.atomicx.widget.basicwidget.button.ButtonIconPosition;
import io.trtc.tuikit.atomicx.widget.basicwidget.button.ButtonSize;
import io.trtc.tuikit.atomicx.widget.basicwidget.button.ButtonVariant;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.view.CoreViewType;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import jd0.C40392a;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import uc0.C45152a;

/* JADX INFO: compiled from: AnchorPrepareView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!J\b\u0010#\u001a\u00020\u001aH\u0014J\b\u0010$\u001a\u00020\u001aH\u0014J\b\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u001aH\u0002J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010(\u001a\u00020\u001aH\u0002J\b\u0010)\u001a\u00020\u001aH\u0002J\b\u0010*\u001a\u00020\u001aH\u0002J\b\u0010+\u001a\u00020\u001aH\u0002J\b\u0010,\u001a\u00020\u001aH\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u0004\u0018\u000100J\u000e\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u000203J\u0010\u00104\u001a\u00020\u001a2\u0006\u00102\u001a\u000203H\u0007J\u0010\u00105\u001a\u00020\u001a2\u0006\u00102\u001a\u000203H\u0007J\u0010\u00106\u001a\u00020\u001a2\u0006\u00102\u001a\u000203H\u0007J\u000e\u00107\u001a\u00020\u001a2\u0006\u00102\u001a\u000203J\u000e\u00108\u001a\u00020\u001a2\u0006\u00102\u001a\u000203J\u000e\u00109\u001a\u00020\u001a2\u0006\u00102\u001a\u000203R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "layoutRoot", "prepareStore", "Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;", "state", "Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareState;", "liveCoreView", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "functionView", "Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/PrepareFunctionView;", "imageBack", "Landroid/widget/ImageView;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "initView", "", "init", "roomId", "", "getCoreView", "addAnchorPrepareViewListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareViewListener;", "removeAnchorPrepareViewListener", "onAttachedToWindow", "onDetachedFromWindow", "addObserver", "removeObserver", "initPrepareStore", "initComponent", "initBackView", "initCoreView", "initLiveInfoEditView", "initFunctionView", "initStartLiveButton", "onFeatureMenuDisable", "getState", "Lcom/trtc/uikit/livekit/features/anchorprepare/PrepareState;", "disableFeatureMenu", "disable", "", "disableMenuSwitchButton", "disableMenuBeautyButton", "disableMenuAudioEffectButton", "disableMenuSwitchCamera", "disableMenuBeauty", "disableMenuAudioEffect", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnchorPrepareView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveKitLogger f78450b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f78451c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public AnchorPrepareStore f78452d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public AnchorPrepareState f78453e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public LiveCoreView f78454f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public PrepareFunctionView f78455g;

    /* JADX INFO: renamed from: h */
    public ImageView f78456h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public InterfaceC41775x1 f78457i;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.AnchorPrepareView$a */
    /* JADX INFO: compiled from: AnchorPrepareView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorprepare/AnchorPrepareView$initCoreView$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36173a implements CompletionHandler {
        public C36173a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            ErrorLocalized.f77561a.onError(code);
            Context context = AnchorPrepareView.this.getContext();
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnchorPrepareView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnchorPrepareView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: h */
    public static final void m80601h(AnchorPrepareView anchorPrepareView, View view) {
        AnchorPrepareStore anchorPrepareStore = anchorPrepareView.f78452d;
        if (anchorPrepareStore != null) {
            anchorPrepareStore.m80645n();
        }
        C37436d.m84222d();
        C40392a.m89013a();
        AudioEffectStore.INSTANCE.shared().reset();
        DeviceStore.INSTANCE.shared().reset();
    }

    /* JADX INFO: renamed from: d */
    public final void m80603d(@NotNull AnchorPrepareViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AnchorPrepareStore anchorPrepareStore = this.f78452d;
        if (anchorPrepareStore != null) {
            anchorPrepareStore.m80637e(listener);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m80605f(@NotNull String roomId, @Nullable LiveCoreView liveCoreView) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        this.f78450b.m79404b("AnchorPrepareView init. roomId:" + roomId + ",liveCoreView:" + liveCoreView);
        if (liveCoreView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            liveCoreView = new LiveCoreView(context, null, 0, CoreViewType.PUSH_VIEW);
            liveCoreView.setLiveId(roomId);
        }
        this.f78454f = liveCoreView;
        m80610l(roomId);
        m80607i();
    }

    /* JADX INFO: renamed from: g */
    public final void m80606g() {
        ImageView imageView = this.f78456h;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageBack");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorprepare.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnchorPrepareView.m80601h(this.f78462b, view);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: getCoreView, reason: from getter */
    public final LiveCoreView getF78454f() {
        return this.f78454f;
    }

    @Nullable
    public final PrepareState getState() {
        AnchorPrepareStore anchorPrepareStore = this.f78452d;
        if (anchorPrepareStore != null) {
            return anchorPrepareStore.getF78483b();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m80608j() {
        InterfaceC41669n<Boolean> interfaceC41669nM80627h;
        LiveCoreView liveCoreView = this.f78454f;
        if (liveCoreView == null) {
            this.f78450b.m79403a("Please call the AnchorPrepareView.init() method first.");
            return;
        }
        RoundFrameLayout roundFrameLayout = (RoundFrameLayout) findViewById(R$id.fl_video_view_container);
        FrameLayout frameLayout = null;
        if (liveCoreView.getParent() == null) {
            roundFrameLayout.setRadius(C45152a.m99799a(16.0f));
            roundFrameLayout.addView(liveCoreView, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout2 = this.f78451c;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setBackgroundColor(getResources().getColor(R$color.common_black));
        } else {
            roundFrameLayout.setVisibility(8);
            FrameLayout frameLayout3 = this.f78451c;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
            } else {
                frameLayout = frameLayout3;
            }
            frameLayout.setBackgroundColor(getResources().getColor(R$color.common_design_standard_transparent));
        }
        AnchorPrepareState anchorPrepareState = this.f78453e;
        if (anchorPrepareState != null && (interfaceC41669nM80627h = anchorPrepareState.m80627h()) != null) {
            interfaceC41669nM80627h.setValue(DeviceStore.INSTANCE.shared().getDeviceState().isFrontCamera().getValue());
        }
        AnchorPrepareStore anchorPrepareStore = this.f78452d;
        if (anchorPrepareStore != null) {
            anchorPrepareStore.m80644m(new C36173a());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m80609k() {
        AnchorPrepareStore anchorPrepareStore;
        LiveCoreView liveCoreView;
        if (C4579a.f4058a.m4445a().getValue().booleanValue()) {
            PrepareFunctionView prepareFunctionView = this.f78455g;
            if (prepareFunctionView != null) {
                ViewParent parent = prepareFunctionView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(prepareFunctionView);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f78455g != null || (anchorPrepareStore = this.f78452d) == null || (liveCoreView = this.f78454f) == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PrepareFunctionView prepareFunctionView2 = new PrepareFunctionView(context, null, 0, 6, null);
        this.f78455g = prepareFunctionView2;
        prepareFunctionView2.m80664k(anchorPrepareStore, liveCoreView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, ScreenUtil.dip2px(56.0f));
        layoutParams.setMarginStart(ScreenUtil.dip2px(22.0f));
        layoutParams.setMarginEnd(ScreenUtil.dip2px(22.0f));
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = ScreenUtil.dip2px(144.0f);
        addView(this.f78455g, layoutParams);
    }

    /* JADX INFO: renamed from: l */
    public final void m80610l(String str) {
        if (this.f78454f != null) {
            AnchorPrepareStore anchorPrepareStore = new AnchorPrepareStore();
            this.f78452d = anchorPrepareStore;
            AnchorPrepareState f78482a = anchorPrepareStore.getF78482a();
            this.f78453e = f78482a;
            if (f78482a != null) {
                f78482a.m80628i(str);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m80611m() {
        final AnchorPrepareStore anchorPrepareStore = this.f78452d;
        if (anchorPrepareStore != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AtomicButton atomicButton = new AtomicButton(context, null, 0, 6, null);
            String string = atomicButton.getContext().getString(R$string.common_start_live);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            atomicButton.setText(string);
            atomicButton.setVariant(ButtonVariant.FILLED);
            atomicButton.setColorType(ButtonColorType.PRIMARY);
            atomicButton.setSize(ButtonSize.L);
            atomicButton.setIconPosition(ButtonIconPosition.NONE);
            atomicButton.setBold(true);
            atomicButton.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorprepare.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnchorPrepareView.m80602n(anchorPrepareStore, view);
                }
            });
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, ScreenUtil.dip2px(52.0f));
            layoutParams.setMarginStart(ScreenUtil.dip2px(24.0f));
            layoutParams.setMarginEnd(ScreenUtil.dip2px(24.0f));
            layoutParams.bottomMargin = ScreenUtil.dip2px(60.0f);
            layoutParams.gravity = 81;
            addView(atomicButton, layoutParams);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m80614q(@NotNull AnchorPrepareViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AnchorPrepareStore anchorPrepareStore = this.f78452d;
        if (anchorPrepareStore != null) {
            anchorPrepareStore.m80640h(listener);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m80615r() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78457i;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    public /* synthetic */ AnchorPrepareView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: n */
    public static final void m80602n(AnchorPrepareStore anchorPrepareStore, View view) {
        anchorPrepareStore.m80643k();
    }

    /* JADX INFO: renamed from: e */
    public final void m80604e() {
        this.f78457i = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new AnchorPrepareView$addObserver$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m80607i() {
        m80606g();
        m80608j();
        m80609k();
        m80611m();
    }

    /* JADX INFO: renamed from: o */
    public final void m80612o() {
        LayoutInflater.from(getContext()).inflate(R$layout.anchor_prepare_layout_prepare_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.fl_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78451c = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.iv_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78456h = (ImageView) viewFindViewById2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m80604e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m80615r();
    }

    /* JADX INFO: renamed from: p */
    public final void m80613p() {
        m80609k();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnchorPrepareView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LiveKitLogger featuresLogger = LiveKitLogger.f77564c.getFeaturesLogger("AnchorPrepareView");
        this.f78450b = featuresLogger;
        featuresLogger.m79404b("AnchorPrepareView Constructor.");
        m80612o();
    }
}
