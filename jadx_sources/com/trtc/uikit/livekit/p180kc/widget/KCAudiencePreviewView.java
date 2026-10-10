package com.trtc.uikit.livekit.p180kc.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService;
import com.trtc.uikit.livekit.p180kc.roominfo.store.KCRoomInfoState;
import com.trtc.uikit.livekit.p180kc.roominfo.store.ReserveButtonState;
import com.trtc.uikit.livekit.p180kc.roominfo.store.ReserveInfoState;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p569qq.C43852m;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import wc0.C45791b;

/* JADX INFO: compiled from: KCAudiencePreviewView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u000bJ\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0002J\u0010\u0010,\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010-\u001a\u00020%H\u0002J\u0010\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020%H\u0002J\b\u00102\u001a\u00020%H\u0002J\b\u00103\u001a\u00020%H\u0014J\b\u00104\u001a\u00020%H\u0002J\b\u00105\u001a\u00020%H\u0014J\b\u00106\u001a\u00020%H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onViewDisplayListener", "Lcom/trtc/uikit/livekit/kc/widget/OnViewDisplayListener;", "kcRoomInfoService", "Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;", "roomId", "", "roomOwnerId", "ivPreviewCover", "Landroid/widget/ImageView;", "tvDaysValue", "Landroid/widget/TextView;", "tvHoursValue", "tvMinutesValue", "tvSecondsValue", "tvLiveTimeValue", "tvLiveContent", "subscribe", "targetEpochMillis", "", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "isCountDownFinished", "", "hasExecuted", "init", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "setOnViewDisplayListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "updateUI", "updateSubscribeButtonText", "setTargetEpochMillis", "startCountdown", "refreshCountDown", "countdownParts", "Lcom/trtc/uikit/livekit/kc/widget/CountdownParts;", "stopCountDown", "onReserveButtonClicked", "onAttachedToWindow", "addObserver", "onDetachedFromWindow", "removeObserver", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCAudiencePreviewView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public OnViewDisplayListener f79215b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public KCRoomInfoService f79216c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f79217d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f79218e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final ImageView f79219f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final TextView f79220g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final TextView f79221h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final TextView f79222i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final TextView f79223j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final TextView f79224k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final TextView f79225l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final TextView f79226m;

    /* JADX INFO: renamed from: n */
    public long f79227n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final InterfaceC41709m0 f79228o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public InterfaceC41775x1 f79229p;

    /* JADX INFO: renamed from: q */
    public boolean f79230q;

    /* JADX INFO: renamed from: r */
    public boolean f79231r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCAudiencePreviewView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCAudiencePreviewView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m81624c(KCAudiencePreviewView kCAudiencePreviewView, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kCAudiencePreviewView.m81638p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m81635q(KCAudiencePreviewView kCAudiencePreviewView) {
        KCRoomInfoState f79189g;
        InterfaceC41669n<ReserveButtonState> reserveButtonState;
        ReserveButtonState value;
        KCRoomInfoService kCRoomInfoService = kCAudiencePreviewView.f79216c;
        if (C27025c.m66566d((kCRoomInfoService == null || (f79189g = kCRoomInfoService.getF79189g()) == null || (reserveButtonState = f79189g.getReserveButtonState()) == null || (value = reserveButtonState.getValue()) == null) ? null : Boolean.valueOf(value.isReserved()))) {
            KCRoomInfoService kCRoomInfoService2 = kCAudiencePreviewView.f79216c;
            if (kCRoomInfoService2 != null) {
                kCRoomInfoService2.m81561f();
            }
            C43852m.m96591c("B1FeedLiveRoomDetail", "previewBtn", null, null, 12, null);
        } else {
            KCRoomInfoService kCRoomInfoService3 = kCAudiencePreviewView.f79216c;
            if (kCRoomInfoService3 != null) {
                kCRoomInfoService3.m81569n();
            }
            C43852m.m96591c("B1FeedLiveRoomDetail", "cancelPreviewBtn", null, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public final void m81636n() {
        C41696j.m91104d(this.f79228o, null, null, new KCAudiencePreviewView$addObserver$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m81637o(@NotNull LiveInfo liveInfo, @Nullable KCRoomInfoService kCRoomInfoService) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f79216c = kCRoomInfoService;
        this.f79217d = liveInfo.getLiveID();
        this.f79218e = liveInfo.getLiveOwner().getUserID();
        String str = this.f79217d;
        if (str == null || str.length() == 0) {
            setVisibility(8);
        } else {
            LiveSeatStore.INSTANCE.create(C27041f.m66668h(this.f79217d)).getLiveSeatState().getSeatList();
        }
        m81636n();
    }

    /* JADX INFO: renamed from: p */
    public final void m81638p() {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.trtc.uikit.livekit.kc.widget.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCAudiencePreviewView.m81635q(this.f79297b);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: r */
    public final void m81639r(CountdownParts countdownParts) {
        this.f79220g.setText(C36448c.m81708b(countdownParts.getDays()));
        this.f79221h.setText(C36448c.m81708b(countdownParts.getHours()));
        this.f79222i.setText(C36448c.m81708b(countdownParts.getMinutes()));
        this.f79223j.setText(C36448c.m81708b(countdownParts.getSeconds()));
        this.f79230q = countdownParts.getFinished();
    }

    public final void setOnViewDisplayListener(@Nullable OnViewDisplayListener onViewDisplayListener) {
        this.f79215b = onViewDisplayListener;
    }

    /* JADX INFO: renamed from: t */
    public final void m81641t() {
        this.f79229p = C41696j.m91104d(this.f79228o, null, null, new KCAudiencePreviewView$startCountdown$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m81642u() {
        InterfaceC41775x1 interfaceC41775x1 = this.f79229p;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f79227n = 0L;
    }

    /* JADX INFO: renamed from: v */
    public final void m81643v() {
        KCRoomInfoState f79189g;
        InterfaceC41669n<ReserveButtonState> reserveButtonState;
        ReserveButtonState value;
        KCRoomInfoService kCRoomInfoService = this.f79216c;
        this.f79226m.setText(C27025c.m66566d((kCRoomInfoService == null || (f79189g = kCRoomInfoService.getF79189g()) == null || (reserveButtonState = f79189g.getReserveButtonState()) == null || (value = reserveButtonState.getValue()) == null) ? null : Boolean.valueOf(value.isReserved())) ? getContext().getString(R$string.live_reserved) : getContext().getString(R$string.live_reserve));
        this.f79226m.setEnabled(true);
    }

    /* JADX INFO: renamed from: w */
    public final void m81644w() {
        KCRoomInfoState f79189g;
        InterfaceC41669n<ReserveInfoState> reserveInfoState;
        ReserveInfoState value;
        KCRoomInfoService kCRoomInfoService = this.f79216c;
        if (kCRoomInfoService == null || (f79189g = kCRoomInfoService.getF79189g()) == null || (reserveInfoState = f79189g.getReserveInfoState()) == null || (value = reserveInfoState.getValue()) == null) {
            return;
        }
        setTargetEpochMillis(value.getRoomOpenTime());
        this.f79225l.setText(value.getRoomTitle());
        C46338a.m102151a(getContext()).mo6634v(value.getReserveIconUrl()).m6594E0(this.f79219f);
    }

    public /* synthetic */ KCAudiencePreviewView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setTargetEpochMillis(long targetEpochMillis) {
        m81642u();
        this.f79227n = targetEpochMillis;
        this.f79224k.setText(C42179a.m92633f(targetEpochMillis, null, false, true, null, 11, null));
        this.f79230q = false;
        m81641t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m81640s();
    }

    /* JADX INFO: renamed from: s */
    public final void m81640s() {
        m81642u();
        C41713n0.m91129e(this.f79228o, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCAudiencePreviewView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.live_kc_audience_preview_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.ivPreviewCover);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f79219f = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.tvDaysValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f79220g = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.tvHoursValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f79221h = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.tvMinutesValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f79222i = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.tvSecondsValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f79223j = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.tvLiveTimeValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f79224k = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.tvLiveContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f79225l = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.subscribe);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById8;
        this.f79226m = textView;
        C45791b.m101117c(textView, 0L, new Function1() { // from class: com.trtc.uikit.livekit.kc.widget.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCAudiencePreviewView.m81624c(this.f79296b, (View) obj);
            }
        }, 1, null);
        this.f79228o = C41713n0.m91126b();
    }
}
