package com.trtc.uikit.livekit.features.endstatistics;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.timepicker.TimeModel;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import ge0.C37873a;
import ge0.C37874b;
import java.util.Arrays;
import java.util.Locale;
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
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u001f\u001a\u00020\u001aH\u0014J\b\u0010 \u001a\u00020\u001aH\u0014J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020&H\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020&H\u0002J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020&H\u0002J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020&H\u0002J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020&H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/endstatistics/AnchorEndStatisticsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "store", "Lcom/trtc/uikit/livekit/features/endstatistics/store/EndStatisticsStore;", "state", "Lcom/trtc/uikit/livekit/features/endstatistics/store/EndStatisticsState;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "textDuration", "Landroid/widget/TextView;", "textViewersCount", "textMessageCount", "textGiftSenderCount", "textGiftIncome", "textLikeCount", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/features/endstatistics/EndStatisticsDefine$AnchorEndStatisticsViewListener;", "initView", "", "init", "info", "Lcom/trtc/uikit/livekit/features/endstatistics/EndStatisticsDefine$AnchorEndStatisticsInfo;", "setListener", "onAttachedToWindow", "onDetachedFromWindow", "addObserver", "removeObserver", "onExitClick", "onLiveDurationChange", "durationMS", "", "onMaxViewersCountChange", "count", "onMessageCountChange", "onLikeCountChange", "onGiftIncomeChange", "onGiftSenderCountChange", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnchorEndStatisticsView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveKitLogger f78998b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C37874b f78999c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final C37873a f79000d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC41775x1 f79001e;

    /* JADX INFO: renamed from: f */
    public TextView f79002f;

    /* JADX INFO: renamed from: g */
    public TextView f79003g;

    /* JADX INFO: renamed from: h */
    public TextView f79004h;

    /* JADX INFO: renamed from: i */
    public TextView f79005i;

    /* JADX INFO: renamed from: j */
    public TextView f79006j;

    /* JADX INFO: renamed from: k */
    public TextView f79007k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public InterfaceC36371d f79008l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AnchorEndStatisticsView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AnchorEndStatisticsView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: j */
    public final void m81324j(@Nullable AnchorEndStatisticsInfo anchorEndStatisticsInfo) {
        if (anchorEndStatisticsInfo == null) {
            this.f78998b.m79403a("init, info is null");
            return;
        }
        this.f78999c.m85517k(anchorEndStatisticsInfo.getRoomId());
        this.f78999c.m85512f(anchorEndStatisticsInfo.getLiveDurationMS());
        this.f78999c.m85513g(Math.max(0L, anchorEndStatisticsInfo.getMaxViewersCount() - 1));
        this.f78999c.m85514h(Math.max(0L, anchorEndStatisticsInfo.getMessageCount() - 1));
        this.f78999c.m85511e(anchorEndStatisticsInfo.getLikeCount());
        this.f78999c.m85509c(anchorEndStatisticsInfo.getGiftIncome());
        this.f78999c.m85510d(anchorEndStatisticsInfo.getGiftSenderCount());
        this.f78998b.m79404b("init, " + this.f79000d);
    }

    /* JADX INFO: renamed from: m */
    public final void m81326m() {
        InterfaceC36371d interfaceC36371d = this.f79008l;
        if (interfaceC36371d != null) {
            interfaceC36371d.mo81368a();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m81327n(long j11) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        TextView textView = this.f79006j;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textGiftIncome");
            textView = null;
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: o */
    public final void m81328o(long j11) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        TextView textView = this.f79005i;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textGiftSenderCount");
            textView = null;
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: p */
    public final void m81329p(long j11) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        TextView textView = this.f79007k;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textLikeCount");
            textView = null;
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: q */
    public final void m81330q(long j11) {
        String strM85507a = this.f78999c.m85507a((int) (j11 / ((long) 1000)));
        TextView textView = this.f79002f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textDuration");
            textView = null;
        }
        textView.setText(strM85507a);
    }

    /* JADX INFO: renamed from: r */
    public final void m81331r(long j11) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        TextView textView = this.f79003g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewersCount");
            textView = null;
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m81332s(long j11) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        TextView textView = this.f79004h;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textMessageCount");
            textView = null;
        }
        textView.setText(str);
    }

    public final void setListener(@Nullable InterfaceC36371d interfaceC36371d) {
        this.f79008l = interfaceC36371d;
    }

    /* JADX INFO: renamed from: t */
    public final void m81333t() {
        InterfaceC41775x1 interfaceC41775x1 = this.f79001e;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnchorEndStatisticsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78998b = LiveKitLogger.f77564c.getFeaturesLogger("AnchorEndStatisticsView");
        C37874b c37874b = new C37874b();
        this.f78999c = c37874b;
        this.f79000d = c37874b.getF85249a();
        m81325k();
    }

    /* JADX INFO: renamed from: l */
    public static final void m81322l(AnchorEndStatisticsView anchorEndStatisticsView, View view) {
        anchorEndStatisticsView.m81326m();
    }

    /* JADX INFO: renamed from: i */
    public final void m81323i() {
        this.f79001e = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new AnchorEndStatisticsView$addObserver$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m81325k() {
        LayoutInflater.from(getContext()).inflate(R$layout.livekit_anchor_dashboard_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.tv_duration);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f79002f = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.tv_viewers);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f79003g = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.tv_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f79004h = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.tv_gift_income);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f79006j = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.tv_gift_people);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f79005i = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.tv_like);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f79007k = (TextView) viewFindViewById6;
        ((ImageView) findViewById(R$id.iv_back)).setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.endstatistics.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnchorEndStatisticsView.m81322l(this.f79024b, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m81323i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m81333t();
    }
}
