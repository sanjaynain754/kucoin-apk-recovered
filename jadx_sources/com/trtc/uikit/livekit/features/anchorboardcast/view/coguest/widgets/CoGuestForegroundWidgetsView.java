package com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
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
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import wd0.MediaState;

/* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u001a\u001a\u00020\u0017H\u0014J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0014J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0014J\b\u0010!\u001a\u00020\u0017H\u0014J\u000e\u0010\"\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010#J\u000e\u0010%\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010#J\b\u0010&\u001a\u00020'H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/widgets/CoGuestForegroundWidgetsView;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "layoutUserInfo", "Landroid/widget/LinearLayout;", "textName", "Landroid/widget/TextView;", "imageMuteAudio", "Landroid/widget/ImageView;", "seatInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "init", "", "manager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "onAttachedToWindow", "onDetachedFromWindow", "initView", "refreshView", "initMuteAudioView", "initUserNameView", "addObserver", "removeObserver", "onPipModeObserver", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCoGuestChange", "onCoHostChange", "isShowUserInfo", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoGuestForegroundWidgetsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoGuestForegroundWidgetsView.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/widgets/CoGuestForegroundWidgetsView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n827#2:134\n855#2,2:135\n*S KotlinDebug\n*F\n+ 1 CoGuestForegroundWidgetsView.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/widgets/CoGuestForegroundWidgetsView\n*L\n127#1:134\n127#1:135,2\n*E\n"})
public final class CoGuestForegroundWidgetsView extends BasicView {

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LiveKitLogger f78355n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f78356o;

    /* JADX INFO: renamed from: p */
    public TextView f78357p;

    /* JADX INFO: renamed from: q */
    public ImageView f78358q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public SeatInfo f78359r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public InterfaceC41775x1 f78360s;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.widgets.CoGuestForegroundWidgetsView$a */
    /* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36135a<T> implements InterfaceC41635f {
        public C36135a() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
            CoGuestForegroundWidgetsView.this.m80485l();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.widgets.CoGuestForegroundWidgetsView$b */
    /* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36139b<T> implements InterfaceC41635f {
        public C36139b() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
            CoGuestForegroundWidgetsView.this.m80485l();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.widgets.CoGuestForegroundWidgetsView$c */
    /* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36140c<T> implements InterfaceC41635f {
        public C36140c() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m80491a(boolean z11, Continuation<? super Unit> continuation) {
            CoGuestForegroundWidgetsView.this.setVisibility(z11 ? 8 : 0);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80491a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestForegroundWidgetsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestForegroundWidgetsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m80482p(Continuation<? super Unit> continuation) {
        CoGuestForegroundWidgetsView$onPipModeObserver$1 coGuestForegroundWidgetsView$onPipModeObserver$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101183c;
        if (continuation instanceof CoGuestForegroundWidgetsView$onPipModeObserver$1) {
            coGuestForegroundWidgetsView$onPipModeObserver$1 = (CoGuestForegroundWidgetsView$onPipModeObserver$1) continuation;
            int i11 = coGuestForegroundWidgetsView$onPipModeObserver$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                coGuestForegroundWidgetsView$onPipModeObserver$1.label = i11 - Integer.MIN_VALUE;
            } else {
                coGuestForegroundWidgetsView$onPipModeObserver$1 = new CoGuestForegroundWidgetsView$onPipModeObserver$1(this, continuation);
            }
        } else {
            coGuestForegroundWidgetsView$onPipModeObserver$1 = new CoGuestForegroundWidgetsView$onPipModeObserver$1(this, continuation);
        }
        Object obj = coGuestForegroundWidgetsView$onPipModeObserver$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = coGuestForegroundWidgetsView$onPipModeObserver$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            MediaState f78202g = getF78202g();
            if (f78202g == null || (interfaceC41678wM101183c = f78202g.m101183c()) == null) {
                return Unit.INSTANCE;
            }
            C36140c c36140c = new C36140c();
            coGuestForegroundWidgetsView$onPipModeObserver$1.label = 1;
            if (interfaceC41678wM101183c.collect(c36140c, coGuestForegroundWidgetsView$onPipModeObserver$1) == coroutine_suspended) {
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
        InterfaceC41775x1 interfaceC41775x1 = this.f78360s;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m80483j(@NotNull AnchorStore manager, @NotNull SeatInfo seatInfo) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(seatInfo, "seatInfo");
        this.f78355n.m79404b("init userId:" + seatInfo.getUserInfo().getUserID());
        this.f78359r = seatInfo;
        super.m80259b(manager);
    }

    /* JADX INFO: renamed from: k */
    public final void m80484k() {
        ImageView imageView = this.f78358q;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageMuteAudio");
            imageView = null;
        }
        imageView.setVisibility(this.f78359r.getUserInfo().getMicrophoneStatus() == DeviceStatus.ON ? 8 : 0);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m80486m() {
        String liveID = LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID();
        if (liveID.length() == 0) {
            return false;
        }
        if (CoHostStore.INSTANCE.create(liveID).getCoHostState().getConnected().getValue().size() > 1) {
            return true;
        }
        List<SeatUserInfo> value = CoGuestStore.INSTANCE.create(liveID).getCoGuestState().getConnected().getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (Intrinsics.areEqual(((SeatUserInfo) obj).getLiveID(), liveID)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() > 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m80487n(Continuation<? super Unit> continuation) throws Exception {
        CoGuestForegroundWidgetsView$onCoGuestChange$1 coGuestForegroundWidgetsView$onCoGuestChange$1;
        if (continuation instanceof CoGuestForegroundWidgetsView$onCoGuestChange$1) {
            coGuestForegroundWidgetsView$onCoGuestChange$1 = (CoGuestForegroundWidgetsView$onCoGuestChange$1) continuation;
            int i11 = coGuestForegroundWidgetsView$onCoGuestChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                coGuestForegroundWidgetsView$onCoGuestChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                coGuestForegroundWidgetsView$onCoGuestChange$1 = new CoGuestForegroundWidgetsView$onCoGuestChange$1(this, continuation);
            }
        } else {
            coGuestForegroundWidgetsView$onCoGuestChange$1 = new CoGuestForegroundWidgetsView$onCoGuestChange$1(this, continuation);
        }
        Object obj = coGuestForegroundWidgetsView$onCoGuestChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = coGuestForegroundWidgetsView$onCoGuestChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            CoGuestStore coGuestStoreCreate = CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID());
            InterfaceC41678w<List<SeatUserInfo>> connected = coGuestStoreCreate.getCoGuestState().getConnected();
            C36135a c36135a = new C36135a();
            coGuestForegroundWidgetsView$onCoGuestChange$1.L$0 = SpillingKt.nullOutSpilledVariable(coGuestStoreCreate);
            coGuestForegroundWidgetsView$onCoGuestChange$1.label = 1;
            if (connected.collect(c36135a, coGuestForegroundWidgetsView$onCoGuestChange$1) == coroutine_suspended) {
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
    /* JADX INFO: renamed from: o */
    public final Object m80488o(Continuation<? super Unit> continuation) throws Exception {
        CoGuestForegroundWidgetsView$onCoHostChange$1 coGuestForegroundWidgetsView$onCoHostChange$1;
        if (continuation instanceof CoGuestForegroundWidgetsView$onCoHostChange$1) {
            coGuestForegroundWidgetsView$onCoHostChange$1 = (CoGuestForegroundWidgetsView$onCoHostChange$1) continuation;
            int i11 = coGuestForegroundWidgetsView$onCoHostChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                coGuestForegroundWidgetsView$onCoHostChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                coGuestForegroundWidgetsView$onCoHostChange$1 = new CoGuestForegroundWidgetsView$onCoHostChange$1(this, continuation);
            }
        } else {
            coGuestForegroundWidgetsView$onCoHostChange$1 = new CoGuestForegroundWidgetsView$onCoHostChange$1(this, continuation);
        }
        Object obj = coGuestForegroundWidgetsView$onCoHostChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = coGuestForegroundWidgetsView$onCoHostChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            CoHostStore coHostStoreCreate = CoHostStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID());
            InterfaceC41678w<List<SeatUserInfo>> connected = coHostStoreCreate.getCoHostState().getConnected();
            C36139b c36139b = new C36139b();
            coGuestForegroundWidgetsView$onCoHostChange$1.L$0 = SpillingKt.nullOutSpilledVariable(coHostStoreCreate);
            coGuestForegroundWidgetsView$onCoHostChange$1.label = 1;
            if (connected.collect(c36139b, coGuestForegroundWidgetsView$onCoHostChange$1) == coroutine_suspended) {
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

    public /* synthetic */ CoGuestForegroundWidgetsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80110a() {
        this.f78360s = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new CoGuestForegroundWidgetsView$addObserver$1(this, null), 3, null);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80115c() {
        LayoutInflater.from(getF78197b()).inflate(R$layout.livekit_co_guest_foreground_widgets_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.ll_user_info);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78356o = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.iv_mute_audio);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78358q = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.tv_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78357p = (TextView) viewFindViewById3;
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: d */
    public void mo80117d() {
        m80485l();
        m80484k();
    }

    /* JADX INFO: renamed from: l */
    public final void m80485l() {
        String userName;
        TextView textView = null;
        if (m80486m()) {
            LinearLayout linearLayout = this.f78356o;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutUserInfo");
                linearLayout = null;
            }
            linearLayout.setVisibility(0);
        } else {
            LinearLayout linearLayout2 = this.f78356o;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutUserInfo");
                linearLayout2 = null;
            }
            linearLayout2.setVisibility(8);
        }
        TextView textView2 = this.f78357p;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textName");
        } else {
            textView = textView2;
        }
        if (TextUtils.isEmpty(this.f78359r.getUserInfo().getUserName())) {
            userName = this.f78359r.getUserInfo().getUserID();
        } else {
            userName = this.f78359r.getUserInfo().getUserName();
        }
        textView.setText(userName);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f78355n.m79404b("onAttachedToWindow");
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f78355n.m79404b("onDetachedFromWindow");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestForegroundWidgetsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78355n = LiveKitLogger.f77564c.getFeaturesLogger("CoGuest-ForegroundWidgetsView");
        this.f78359r = new SeatInfo(0, false, null, null, 15, null);
    }
}
