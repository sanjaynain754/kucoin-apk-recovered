package com.trtc.uikit.livekit.component.audiencelist.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.component.audiencelist.AudienceListView;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceState;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
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
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import xc0.C46138c;

/* JADX INFO: compiled from: AudienceListPopupDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "audienceState", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;", "<init>", "(Landroid/content/Context;Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;)V", "imageBack", "Landroid/widget/ImageView;", "recycleAudienceList", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Lcom/trtc/uikit/livekit/component/audiencelist/view/adapter/AudienceListPanelAdapter;", "onUserItemClickListener", "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$OnUserItemClickListener;", "audienceListListener", "Lkotlinx/coroutines/Job;", "onAttachedToWindow", "", "onDetachedFromWindow", "setOnUserItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bindViewId", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initImageBackView", "initAudienceListView", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class AudienceListPopupDialog extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Context f77590m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LiveAudienceState f77591n;

    /* JADX INFO: renamed from: o */
    public ImageView f77592o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f77593p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public C46138c f77594q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public AudienceListView.InterfaceC35869a f77595r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public InterfaceC41775x1 f77596s;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.audiencelist.view.AudienceListPopupDialog$onAttachedToWindow$1 */
    /* JADX INFO: compiled from: AudienceListPopupDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.audiencelist.view.AudienceListPopupDialog$onAttachedToWindow$1", m90122f = "AudienceListPopupDialog.kt", m90123i = {}, m90124l = {43}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C358751 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.audiencelist.view.AudienceListPopupDialog$onAttachedToWindow$1$a */
        /* JADX INFO: compiled from: AudienceListPopupDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AudienceListPopupDialog f77597b;

            public a(AudienceListPopupDialog audienceListPopupDialog) {
                this.f77597b = audienceListPopupDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<LiveUserInfo> list, Continuation<? super Unit> continuation) {
                C46138c c46138c = this.f77597b.f77594q;
                if (c46138c != null) {
                    c46138c.m101688k();
                }
                return Unit.INSTANCE;
            }
        }

        public C358751(Continuation<? super C358751> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AudienceListPopupDialog.this.new C358751(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C358751) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41678w<List<LiveUserInfo>> audienceList = AudienceListPopupDialog.this.f77591n.getAudienceList();
                a aVar = new a(AudienceListPopupDialog.this);
                this.label = 1;
                if (audienceList.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceListPopupDialog(@NotNull Context context, @NotNull LiveAudienceState audienceState) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audienceState, "audienceState");
        this.f77590m = context;
        this.f77591n = audienceState;
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.audience_list_layout_panel, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m79436F(viewInflate);
        m79439H();
        m79438G();
        m88181q(viewInflate);
    }

    /* JADX INFO: renamed from: F */
    private final void m79436F(View view) {
        View viewFindViewById = view.findViewById(R$id.iv_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f77592o = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.rv_audience_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f77593p = (RecyclerView) viewFindViewById2;
    }

    /* JADX INFO: renamed from: G */
    public final void m79438G() {
        RecyclerView recyclerView = this.f77593p;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycleAudienceList");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f77590m, 1, false));
        this.f77594q = new C46138c(this.f77590m, this.f77591n);
        RecyclerView recyclerView3 = this.f77593p;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycleAudienceList");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.setAdapter(this.f77594q);
        C46138c c46138c = this.f77594q;
        if (c46138c != null) {
            c46138c.setOnItemClickListener(this.f77595r);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m79439H() {
        ImageView imageView = this.f77592o;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageBack");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.component.audiencelist.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceListPopupDialog.m79437I(this.f77598b, view);
            }
        });
    }

    public final void setOnUserItemClickListener(@Nullable AudienceListView.InterfaceC35869a interfaceC35869a) {
        this.f77595r = interfaceC35869a;
        C46138c c46138c = this.f77594q;
        if (c46138c != null) {
            c46138c.setOnItemClickListener(interfaceC35869a);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m79437I(AudienceListPopupDialog audienceListPopupDialog, View view) {
        audienceListPopupDialog.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f77596s = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C358751(null), 3, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC41775x1 interfaceC41775x1 = this.f77596s;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }
}
