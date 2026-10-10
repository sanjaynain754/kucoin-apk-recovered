package com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import java.util.ArrayList;
import java.util.List;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AnchorCoGuestManageDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0010H\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020\u001bH\u0003J\b\u0010'\u001a\u00020\u001bH\u0003J\u000e\u0010(\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010)R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestManageDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "anchorManager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "liveStream", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V", "textMicUpTitle", "Landroid/widget/TextView;", "textMicDownTitle", "imageBack", "Landroid/widget/ImageView;", "viewSeparation", "Landroid/view/View;", "recyclerLinkAudienceView", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerApplyLinkAudienceView", "anchorLinkMicAdapter", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;", "anchorApplyLinkMicAdapter", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorApplyCoGuestAdapter;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "initView", "", "initViewSeparation", "onAttachedToWindow", "onDetachedFromWindow", "addObserver", "removeObserver", "bindViewId", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initBackView", "initApplyLinkAudienceListView", "initLinkAudienceListView", "initMicDownTitleView", "initMicUpTitleView", "onLinkAudienceListChange", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onApplyLinkAudienceListChange", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAnchorCoGuestManageDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorCoGuestManageDialog.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestManageDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n827#2:179\n855#2,2:180\n827#2:182\n855#2,2:183\n*S KotlinDebug\n*F\n+ 1 AnchorCoGuestManageDialog.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestManageDialog\n*L\n63#1:179\n63#1:180,2\n147#1:182\n147#1:183,2\n*E\n"})
public final class AnchorCoGuestManageDialog extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    @Nullable
    public final AnchorStore f78264m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LiveCoreView f78265n;

    /* JADX INFO: renamed from: o */
    public TextView f78266o;

    /* JADX INFO: renamed from: p */
    public TextView f78267p;

    /* JADX INFO: renamed from: q */
    public ImageView f78268q;

    /* JADX INFO: renamed from: r */
    public View f78269r;

    /* JADX INFO: renamed from: s */
    public RecyclerView f78270s;

    /* JADX INFO: renamed from: t */
    public RecyclerView f78271t;

    /* JADX INFO: renamed from: u */
    public AnchorCoGuestAdapter f78272u;

    /* JADX INFO: renamed from: v */
    public AnchorApplyCoGuestAdapter f78273v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public InterfaceC41775x1 f78274w;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorCoGuestManageDialog$a */
    /* JADX INFO: compiled from: AnchorCoGuestManageDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36096a<T> implements InterfaceC41635f {
        public C36096a() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<LiveUserInfo> list, Continuation<? super Unit> continuation) {
            AnchorCoGuestManageDialog.this.m80371Q();
            AnchorCoGuestManageDialog.this.m80373T();
            AnchorApplyCoGuestAdapter anchorApplyCoGuestAdapter = AnchorCoGuestManageDialog.this.f78273v;
            if (anchorApplyCoGuestAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anchorApplyLinkMicAdapter");
                anchorApplyCoGuestAdapter = null;
            }
            anchorApplyCoGuestAdapter.m80464o();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorCoGuestManageDialog$b */
    /* JADX INFO: compiled from: AnchorCoGuestManageDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36099b<T> implements InterfaceC41635f {
        public C36099b() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
            AnchorCoGuestManageDialog.this.m80372R();
            AnchorCoGuestManageDialog.this.m80373T();
            AnchorCoGuestAdapter anchorCoGuestAdapter = AnchorCoGuestManageDialog.this.f78272u;
            if (anchorCoGuestAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anchorLinkMicAdapter");
                anchorCoGuestAdapter = null;
            }
            anchorCoGuestAdapter.m80351o();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorCoGuestManageDialog(@NotNull Context context, @Nullable AnchorStore anchorStore, @NotNull LiveCoreView liveStream) {
        super(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(liveStream, "liveStream");
        this.f78264m = anchorStore;
        this.f78265n = liveStream;
        m80366S();
    }

    /* JADX INFO: renamed from: L */
    private final void m80364L(View view) {
        View viewFindViewById = view.findViewById(R$id.tv_mic_up_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78266o = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.tv_mic_down_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78267p = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.view_separation);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78269r = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.rv_link_user_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78270s = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.rv_apply_link_user_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f78271t = (RecyclerView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.iv_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f78268q = (ImageView) viewFindViewById6;
    }

    /* JADX INFO: renamed from: W */
    private final void m80367W() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78274w;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m80368M() {
        RecyclerView recyclerView = this.f78271t;
        AnchorApplyCoGuestAdapter anchorApplyCoGuestAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerApplyLinkAudienceView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f78273v = new AnchorApplyCoGuestAdapter(context);
        RecyclerView recyclerView2 = this.f78271t;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerApplyLinkAudienceView");
            recyclerView2 = null;
        }
        AnchorApplyCoGuestAdapter anchorApplyCoGuestAdapter2 = this.f78273v;
        if (anchorApplyCoGuestAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorApplyLinkMicAdapter");
        } else {
            anchorApplyCoGuestAdapter = anchorApplyCoGuestAdapter2;
        }
        recyclerView2.setAdapter(anchorApplyCoGuestAdapter);
    }

    /* JADX INFO: renamed from: N */
    public final void m80369N() {
        ImageView imageView = this.f78268q;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageBack");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnchorCoGuestManageDialog.m80365O(this.f78331b, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final void m80370P() {
        RecyclerView recyclerView = this.f78270s;
        AnchorCoGuestAdapter anchorCoGuestAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerLinkAudienceView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f78272u = new AnchorCoGuestAdapter(context);
        RecyclerView recyclerView2 = this.f78270s;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerLinkAudienceView");
            recyclerView2 = null;
        }
        AnchorCoGuestAdapter anchorCoGuestAdapter2 = this.f78272u;
        if (anchorCoGuestAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorLinkMicAdapter");
        } else {
            anchorCoGuestAdapter = anchorCoGuestAdapter2;
        }
        recyclerView2.setAdapter(anchorCoGuestAdapter);
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: Q */
    public final void m80371Q() {
        List<LiveUserInfo> value = CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoGuestState().getApplicants().getValue();
        TextView textView = null;
        if (value.isEmpty()) {
            TextView textView2 = this.f78267p;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textMicDownTitle");
                textView2 = null;
            }
            textView2.setVisibility(8);
        } else {
            TextView textView3 = this.f78267p;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textMicDownTitle");
                textView3 = null;
            }
            textView3.setVisibility(0);
        }
        TextView textView4 = this.f78267p;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textMicDownTitle");
        } else {
            textView = textView4;
        }
        textView.setText(getContext().getString(R$string.common_seat_application_title, Integer.valueOf(value.size())));
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: R */
    public final void m80372R() {
        List<SeatUserInfo> value = CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoGuestState().getConnected().getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (Intrinsics.areEqual(((SeatUserInfo) obj).getLiveID(), LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID())) {
                arrayList.add(obj);
            }
        }
        TextView textView = null;
        if (arrayList.size() <= 1) {
            TextView textView2 = this.f78266o;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textMicUpTitle");
            } else {
                textView = textView2;
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView3 = this.f78266o;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textMicUpTitle");
            textView3 = null;
        }
        textView3.setVisibility(0);
        TextView textView4 = this.f78266o;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textMicUpTitle");
        } else {
            textView = textView4;
        }
        textView.setText(getContext().getString(R$string.common_seat_list_title, Integer.valueOf(arrayList.size() - 1)));
    }

    /* JADX INFO: renamed from: T */
    public final void m80373T() {
        CoGuestStore.Companion companion = CoGuestStore.INSTANCE;
        LiveListStore.Companion companion2 = LiveListStore.INSTANCE;
        List<LiveUserInfo> value = companion.create(companion2.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoGuestState().getApplicants().getValue();
        List<SeatUserInfo> value2 = companion.create(companion2.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoGuestState().getConnected().getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value2) {
            if (Intrinsics.areEqual(((SeatUserInfo) obj).getLiveID(), LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID())) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = value.isEmpty();
        View view = null;
        if (zIsEmpty || arrayList.size() <= 1) {
            View view2 = this.f78269r;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewSeparation");
            } else {
                view = view2;
            }
            view.setVisibility(8);
            return;
        }
        View view3 = this.f78269r;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewSeparation");
        } else {
            view = view3;
        }
        view.setVisibility(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: U */
    public final Object m80374U(Continuation<? super Unit> continuation) throws Exception {
        AnchorCoGuestManageDialog$onApplyLinkAudienceListChange$1 anchorCoGuestManageDialog$onApplyLinkAudienceListChange$1;
        if (continuation instanceof AnchorCoGuestManageDialog$onApplyLinkAudienceListChange$1) {
            anchorCoGuestManageDialog$onApplyLinkAudienceListChange$1 = (AnchorCoGuestManageDialog$onApplyLinkAudienceListChange$1) continuation;
            int i11 = anchorCoGuestManageDialog$onApplyLinkAudienceListChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorCoGuestManageDialog$onApplyLinkAudienceListChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorCoGuestManageDialog$onApplyLinkAudienceListChange$1 = new AnchorCoGuestManageDialog$onApplyLinkAudienceListChange$1(this, continuation);
            }
        } else {
            anchorCoGuestManageDialog$onApplyLinkAudienceListChange$1 = new AnchorCoGuestManageDialog$onApplyLinkAudienceListChange$1(this, continuation);
        }
        Object obj = anchorCoGuestManageDialog$onApplyLinkAudienceListChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorCoGuestManageDialog$onApplyLinkAudienceListChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            CoGuestStore coGuestStoreCreate = CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID());
            InterfaceC41678w<List<LiveUserInfo>> applicants = coGuestStoreCreate.getCoGuestState().getApplicants();
            C36096a c36096a = new C36096a();
            anchorCoGuestManageDialog$onApplyLinkAudienceListChange$1.L$0 = SpillingKt.nullOutSpilledVariable(coGuestStoreCreate);
            anchorCoGuestManageDialog$onApplyLinkAudienceListChange$1.label = 1;
            if (applicants.collect(c36096a, anchorCoGuestManageDialog$onApplyLinkAudienceListChange$1) == coroutine_suspended) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: V */
    public final Object m80375V(Continuation<? super Unit> continuation) throws Exception {
        AnchorCoGuestManageDialog$onLinkAudienceListChange$1 anchorCoGuestManageDialog$onLinkAudienceListChange$1;
        if (continuation instanceof AnchorCoGuestManageDialog$onLinkAudienceListChange$1) {
            anchorCoGuestManageDialog$onLinkAudienceListChange$1 = (AnchorCoGuestManageDialog$onLinkAudienceListChange$1) continuation;
            int i11 = anchorCoGuestManageDialog$onLinkAudienceListChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorCoGuestManageDialog$onLinkAudienceListChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorCoGuestManageDialog$onLinkAudienceListChange$1 = new AnchorCoGuestManageDialog$onLinkAudienceListChange$1(this, continuation);
            }
        } else {
            anchorCoGuestManageDialog$onLinkAudienceListChange$1 = new AnchorCoGuestManageDialog$onLinkAudienceListChange$1(this, continuation);
        }
        Object obj = anchorCoGuestManageDialog$onLinkAudienceListChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorCoGuestManageDialog$onLinkAudienceListChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            CoGuestStore coGuestStoreCreate = CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID());
            InterfaceC41678w<List<SeatUserInfo>> connected = coGuestStoreCreate.getCoGuestState().getConnected();
            C36099b c36099b = new C36099b();
            anchorCoGuestManageDialog$onLinkAudienceListChange$1.L$0 = SpillingKt.nullOutSpilledVariable(coGuestStoreCreate);
            anchorCoGuestManageDialog$onLinkAudienceListChange$1.label = 1;
            if (connected.collect(c36099b, anchorCoGuestManageDialog$onLinkAudienceListChange$1) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: K */
    private final void m80363K() {
        this.f78274w = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new AnchorCoGuestManageDialog$addObserver$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: O */
    public static final void m80365O(AnchorCoGuestManageDialog anchorCoGuestManageDialog, View view) {
        anchorCoGuestManageDialog.dismiss();
    }

    /* JADX INFO: renamed from: S */
    private final void m80366S() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.livekit_layout_anchor_link_manage_panel, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m80364L(viewInflate);
        m80369N();
        m80372R();
        m80371Q();
        m80373T();
        m80370P();
        m80368M();
        m88181q(viewInflate);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m80363K();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m80367W();
    }
}
