package com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
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
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import wd0.MediaState;

/* JADX INFO: compiled from: AnchorEmptySeatView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0014J\u000e\u0010\u001a\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u001bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/widgets/AnchorEmptySeatView;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "seatInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "textSeatIndex", "Landroid/widget/TextView;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "init", "", "manager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "initView", "refreshView", "addObserver", "removeObserver", "onPipModeObserver", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnchorEmptySeatView extends BasicView {

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LiveKitLogger f78345n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public SeatInfo f78346o;

    /* JADX INFO: renamed from: p */
    public TextView f78347p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public InterfaceC41775x1 f78348q;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.widgets.AnchorEmptySeatView$a */
    /* JADX INFO: compiled from: AnchorEmptySeatView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36133a<T> implements InterfaceC41635f {
        public C36133a() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m80472a(boolean z11, Continuation<? super Unit> continuation) {
            AnchorEmptySeatView.this.setVisibility(z11 ? 8 : 0);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80472a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnchorEmptySeatView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnchorEmptySeatView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m80470h(Continuation<? super Unit> continuation) {
        AnchorEmptySeatView$onPipModeObserver$1 anchorEmptySeatView$onPipModeObserver$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101183c;
        if (continuation instanceof AnchorEmptySeatView$onPipModeObserver$1) {
            anchorEmptySeatView$onPipModeObserver$1 = (AnchorEmptySeatView$onPipModeObserver$1) continuation;
            int i11 = anchorEmptySeatView$onPipModeObserver$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorEmptySeatView$onPipModeObserver$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorEmptySeatView$onPipModeObserver$1 = new AnchorEmptySeatView$onPipModeObserver$1(this, continuation);
            }
        } else {
            anchorEmptySeatView$onPipModeObserver$1 = new AnchorEmptySeatView$onPipModeObserver$1(this, continuation);
        }
        Object obj = anchorEmptySeatView$onPipModeObserver$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorEmptySeatView$onPipModeObserver$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            MediaState f78202g = getF78202g();
            if (f78202g == null || (interfaceC41678wM101183c = f78202g.m101183c()) == null) {
                return Unit.INSTANCE;
            }
            C36133a c36133a = new C36133a();
            anchorEmptySeatView$onPipModeObserver$1.label = 1;
            if (interfaceC41678wM101183c.collect(c36133a, anchorEmptySeatView$onPipModeObserver$1) == coroutine_suspended) {
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

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: d */
    public void mo80117d() {
        SeatInfo seatInfo = this.f78346o;
        if (seatInfo != null) {
            String strValueOf = String.valueOf(seatInfo.getIndex());
            TextView textView = this.f78347p;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textSeatIndex");
                textView = null;
            }
            textView.setText(strValueOf);
        }
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: e */
    public void mo80120e() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78348q;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m80471g(@NotNull AnchorStore manager, @NotNull SeatInfo seatInfo) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(seatInfo, "seatInfo");
        this.f78345n.m79404b("init seatInfo:" + new Gson().toJson(seatInfo));
        this.f78346o = seatInfo;
        super.m80259b(manager);
    }

    public /* synthetic */ AnchorEmptySeatView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80110a() {
        this.f78348q = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new AnchorEmptySeatView$addObserver$1(this, null), 3, null);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80115c() {
        LayoutInflater.from(getF78197b()).inflate(R$layout.livekit_co_guest_empty_anchor_widgets_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.tv_seat_index);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78347p = (TextView) viewFindViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnchorEmptySeatView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78345n = LiveKitLogger.f77564c.getFeaturesLogger("coGuest-AnchorEmptySeatView");
    }
}
