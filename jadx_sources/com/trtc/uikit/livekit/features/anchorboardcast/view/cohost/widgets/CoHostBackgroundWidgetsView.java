package com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
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

/* JADX INFO: compiled from: CoHostBackgroundWidgetsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0014J\b\u0010\u0019\u001a\u00020\u0011H\u0014J\u000e\u0010\u001a\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u001bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/widgets/CoHostBackgroundWidgetsView;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "imageAvatar", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "init", "", "manager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "seatInfo", "initView", "refreshView", "initUserAvatarView", "addObserver", "removeObserver", "onPipModeObserver", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoHostBackgroundWidgetsView extends BasicView {

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Companion f78409q = new Companion(null);

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final LiveKitLogger f78410r = LiveKitLogger.f77564c.getFeaturesLogger("CoHost-BackgroundWidgetsView");

    /* JADX INFO: renamed from: n */
    @NotNull
    public SeatInfo f78411n;

    /* JADX INFO: renamed from: o */
    public AtomicAvatar f78412o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public InterfaceC41775x1 f78413p;

    /* JADX INFO: compiled from: CoHostBackgroundWidgetsView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/widgets/CoHostBackgroundWidgetsView$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets.CoHostBackgroundWidgetsView$a */
    /* JADX INFO: compiled from: CoHostBackgroundWidgetsView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36157a<T> implements InterfaceC41635f {
        public C36157a() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m80559a(boolean z11, Continuation<? super Unit> continuation) {
            CoHostBackgroundWidgetsView.this.setVisibility(z11 ? 8 : 0);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80559a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoHostBackgroundWidgetsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoHostBackgroundWidgetsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: h */
    private final void m80556h() {
        AtomicAvatar atomicAvatar = this.f78412o;
        if (atomicAvatar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageAvatar");
            atomicAvatar = null;
        }
        atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(this.f78411n.getUserInfo().getAvatarURL(), R$drawable.livekit_ic_avatar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m80557i(Continuation<? super Unit> continuation) {
        CoHostBackgroundWidgetsView$onPipModeObserver$1 coHostBackgroundWidgetsView$onPipModeObserver$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101183c;
        if (continuation instanceof CoHostBackgroundWidgetsView$onPipModeObserver$1) {
            coHostBackgroundWidgetsView$onPipModeObserver$1 = (CoHostBackgroundWidgetsView$onPipModeObserver$1) continuation;
            int i11 = coHostBackgroundWidgetsView$onPipModeObserver$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                coHostBackgroundWidgetsView$onPipModeObserver$1.label = i11 - Integer.MIN_VALUE;
            } else {
                coHostBackgroundWidgetsView$onPipModeObserver$1 = new CoHostBackgroundWidgetsView$onPipModeObserver$1(this, continuation);
            }
        } else {
            coHostBackgroundWidgetsView$onPipModeObserver$1 = new CoHostBackgroundWidgetsView$onPipModeObserver$1(this, continuation);
        }
        Object obj = coHostBackgroundWidgetsView$onPipModeObserver$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = coHostBackgroundWidgetsView$onPipModeObserver$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            MediaState f78202g = getF78202g();
            if (f78202g == null || (interfaceC41678wM101183c = f78202g.m101183c()) == null) {
                return Unit.INSTANCE;
            }
            C36157a c36157a = new C36157a();
            coHostBackgroundWidgetsView$onPipModeObserver$1.label = 1;
            if (interfaceC41678wM101183c.collect(c36157a, coHostBackgroundWidgetsView$onPipModeObserver$1) == coroutine_suspended) {
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
    /* JADX INFO: renamed from: e */
    public void mo80120e() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78413p;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m80558g(@NotNull AnchorStore manager, @NotNull SeatInfo seatInfo) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(seatInfo, "seatInfo");
        f78410r.m79404b("init userId:" + seatInfo.getUserInfo().getUserID() + ",roomId:" + seatInfo.getUserInfo().getLiveID());
        this.f78411n = seatInfo;
        super.m80259b(manager);
    }

    public /* synthetic */ CoHostBackgroundWidgetsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80110a() {
        this.f78413p = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new CoHostBackgroundWidgetsView$addObserver$1(this, null), 3, null);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80115c() {
        LayoutInflater.from(getF78197b()).inflate(R$layout.livekit_co_guest_background_widgets_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.iv_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78412o = (AtomicAvatar) viewFindViewById;
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: d */
    public void mo80117d() {
        m80556h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoHostBackgroundWidgetsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78411n = new SeatInfo(0, false, null, null, 15, null);
    }
}
