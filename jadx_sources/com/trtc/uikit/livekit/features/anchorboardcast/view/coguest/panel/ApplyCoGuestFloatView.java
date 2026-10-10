package com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApplyCoGuestFloatView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u001c\u001a\u00020\u0019H\u0014J\b\u0010\u001d\u001a\u00020\u0019H\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0014J\b\u0010 \u001a\u00020\u0019H\u0014J\b\u0010!\u001a\u00020\u0019H\u0003J\u000e\u0010\"\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010#R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "layoutRoot", "Landroid/widget/LinearLayout;", "imageFirstApplyLinkAudience", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "imageSecondApplyLinkAudience", "layoutSecondApplyLinkAudience", "Landroid/widget/RelativeLayout;", "layoutEllipsis", "textApplyLinkAudienceCount", "Landroid/widget/TextView;", "liveStream", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "init", "", "manager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "initView", "refreshView", "initRootView", "addObserver", "removeObserver", "initApplyLinkAudienceListView", "onApplyLinkAudienceListChange", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class ApplyCoGuestFloatView extends BasicView {

    /* JADX INFO: renamed from: n */
    public LinearLayout f78305n;

    /* JADX INFO: renamed from: o */
    public AtomicAvatar f78306o;

    /* JADX INFO: renamed from: p */
    public AtomicAvatar f78307p;

    /* JADX INFO: renamed from: q */
    public RelativeLayout f78308q;

    /* JADX INFO: renamed from: r */
    public RelativeLayout f78309r;

    /* JADX INFO: renamed from: s */
    public TextView f78310s;

    /* JADX INFO: renamed from: t */
    public LiveCoreView f78311t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public InterfaceC41775x1 f78312u;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.ApplyCoGuestFloatView$a */
    /* JADX INFO: compiled from: ApplyCoGuestFloatView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36112a<T> implements InterfaceC41635f {
        public C36112a() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<LiveUserInfo> list, Continuation<? super Unit> continuation) {
            ApplyCoGuestFloatView.this.m80447k();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ApplyCoGuestFloatView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: n */
    public static final void m80445n(View view, DialogInterface dialogInterface) {
        view.setEnabled(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ApplyCoGuestFloatView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: e */
    public void mo80120e() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78312u;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m80446j(@NotNull AnchorStore manager, @NotNull LiveCoreView liveStream) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(liveStream, "liveStream");
        this.f78311t = liveStream;
        super.m80259b(manager);
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: k */
    public final void m80447k() {
        List<LiveUserInfo> value = CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoGuestState().getApplicants().getValue();
        if (value.isEmpty()) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(value);
        TextView textView = null;
        if (value.size() == 1) {
            RelativeLayout relativeLayout = this.f78308q;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutSecondApplyLinkAudience");
                relativeLayout = null;
            }
            relativeLayout.setVisibility(8);
            RelativeLayout relativeLayout2 = this.f78309r;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutEllipsis");
                relativeLayout2 = null;
            }
            relativeLayout2.setVisibility(8);
            AtomicAvatar atomicAvatar = this.f78306o;
            if (atomicAvatar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageFirstApplyLinkAudience");
                atomicAvatar = null;
            }
            atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(((LiveUserInfo) copyOnWriteArrayList.get(0)).getAvatarURL(), R$drawable.livekit_ic_avatar));
        } else if (value.size() == 2) {
            RelativeLayout relativeLayout3 = this.f78308q;
            if (relativeLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutSecondApplyLinkAudience");
                relativeLayout3 = null;
            }
            relativeLayout3.setVisibility(0);
            RelativeLayout relativeLayout4 = this.f78309r;
            if (relativeLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutEllipsis");
                relativeLayout4 = null;
            }
            relativeLayout4.setVisibility(8);
            AtomicAvatar atomicAvatar2 = this.f78306o;
            if (atomicAvatar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageFirstApplyLinkAudience");
                atomicAvatar2 = null;
            }
            String avatarURL = ((LiveUserInfo) copyOnWriteArrayList.get(0)).getAvatarURL();
            int i11 = R$drawable.livekit_ic_avatar;
            atomicAvatar2.setContent(new AtomicAvatar.AbstractC39363b.URL(avatarURL, i11));
            AtomicAvatar atomicAvatar3 = this.f78307p;
            if (atomicAvatar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageSecondApplyLinkAudience");
                atomicAvatar3 = null;
            }
            atomicAvatar3.setContent(new AtomicAvatar.AbstractC39363b.URL(((LiveUserInfo) copyOnWriteArrayList.get(1)).getAvatarURL(), i11));
        } else if (value.size() > 2) {
            RelativeLayout relativeLayout5 = this.f78308q;
            if (relativeLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutSecondApplyLinkAudience");
                relativeLayout5 = null;
            }
            relativeLayout5.setVisibility(0);
            RelativeLayout relativeLayout6 = this.f78309r;
            if (relativeLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutEllipsis");
                relativeLayout6 = null;
            }
            relativeLayout6.setVisibility(0);
            AtomicAvatar atomicAvatar4 = this.f78306o;
            if (atomicAvatar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageFirstApplyLinkAudience");
                atomicAvatar4 = null;
            }
            String avatarURL2 = ((LiveUserInfo) copyOnWriteArrayList.get(0)).getAvatarURL();
            int i12 = R$drawable.livekit_ic_avatar;
            atomicAvatar4.setContent(new AtomicAvatar.AbstractC39363b.URL(avatarURL2, i12));
            AtomicAvatar atomicAvatar5 = this.f78307p;
            if (atomicAvatar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageSecondApplyLinkAudience");
                atomicAvatar5 = null;
            }
            atomicAvatar5.setContent(new AtomicAvatar.AbstractC39363b.URL(((LiveUserInfo) copyOnWriteArrayList.get(1)).getAvatarURL(), i12));
        } else {
            setVisibility(8);
        }
        TextView textView2 = this.f78310s;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textApplyLinkAudienceCount");
        } else {
            textView = textView2;
        }
        textView.setText(getF78197b().getString(R$string.common_seat_application_title, Integer.valueOf(value.size())));
    }

    /* JADX INFO: renamed from: l */
    public final void m80448l() {
        LinearLayout linearLayout = this.f78305n;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplyCoGuestFloatView.m80444m(this.f78343b, view);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m80449o(Continuation<? super Unit> continuation) {
        ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1 applyCoGuestFloatView$onApplyLinkAudienceListChange$1;
        if (continuation instanceof ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1) {
            applyCoGuestFloatView$onApplyLinkAudienceListChange$1 = (ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1) continuation;
            int i11 = applyCoGuestFloatView$onApplyLinkAudienceListChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                applyCoGuestFloatView$onApplyLinkAudienceListChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                applyCoGuestFloatView$onApplyLinkAudienceListChange$1 = new ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1(this, continuation);
            }
        } else {
            applyCoGuestFloatView$onApplyLinkAudienceListChange$1 = new ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1(this, continuation);
        }
        Object obj = applyCoGuestFloatView$onApplyLinkAudienceListChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = applyCoGuestFloatView$onApplyLinkAudienceListChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            String liveID = LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID();
            InterfaceC41678w<List<LiveUserInfo>> applicants = CoGuestStore.INSTANCE.create(liveID).getCoGuestState().getApplicants();
            C36112a c36112a = new C36112a();
            applyCoGuestFloatView$onApplyLinkAudienceListChange$1.L$0 = SpillingKt.nullOutSpilledVariable(liveID);
            applyCoGuestFloatView$onApplyLinkAudienceListChange$1.label = 1;
            if (applicants.collect(c36112a, applyCoGuestFloatView$onApplyLinkAudienceListChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    public /* synthetic */ ApplyCoGuestFloatView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: m */
    public static final void m80444m(ApplyCoGuestFloatView applyCoGuestFloatView, final View view) {
        if (!view.isEnabled()) {
            return;
        }
        view.setEnabled(false);
        Context f78197b = applyCoGuestFloatView.getF78197b();
        AnchorStore f78203h = applyCoGuestFloatView.getF78203h();
        LiveCoreView liveCoreView = applyCoGuestFloatView.f78311t;
        if (liveCoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveStream");
            liveCoreView = null;
        }
        AnchorCoGuestManageDialog anchorCoGuestManageDialog = new AnchorCoGuestManageDialog(f78197b, f78203h, liveCoreView);
        anchorCoGuestManageDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.s
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ApplyCoGuestFloatView.m80445n(view, dialogInterface);
            }
        });
        anchorCoGuestManageDialog.show();
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80110a() {
        this.f78312u = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new ApplyCoGuestFloatView$addObserver$1(this, null), 3, null);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80115c() {
        LayoutInflater.from(getContext()).inflate(R$layout.livekit_layout_anchor_apply_link_audience, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.ll_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78305n = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.tv_apply_link_audience_count);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78310s = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.rl_second_apply_link_audience);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78308q = (RelativeLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.rl_ellipsis);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78309r = (RelativeLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.iv_first_apply_link_audience);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f78306o = (AtomicAvatar) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.iv_second_apply_link_audience);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f78307p = (AtomicAvatar) viewFindViewById6;
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: d */
    public void mo80117d() {
        m80447k();
        m80448l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ApplyCoGuestFloatView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
