package com.trtc.uikit.livekit.features.endstatistics;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import ge0.C37873a;
import ge0.C37874b;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
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

/* JADX INFO: compiled from: AudienceEndStatisticsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001d\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u001e\u001a\u00020\u0017H\u0014J\b\u0010\u001f\u001a\u00020\u0017H\u0014J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u001aH\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u001aH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/endstatistics/AudienceEndStatisticsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "store", "Lcom/trtc/uikit/livekit/features/endstatistics/store/EndStatisticsStore;", "state", "Lcom/trtc/uikit/livekit/features/endstatistics/store/EndStatisticsState;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "textName", "Landroid/widget/TextView;", "imageHead", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/features/endstatistics/EndStatisticsDefine$AudienceEndStatisticsViewListener;", "initView", "", "init", "roomId", "", TUIConstantDefine.OWNER_NAME, TUIConstantDefine.OWNER_AVATAR_URL, "setListener", "onAttachedToWindow", "onDetachedFromWindow", "addObserver", "removeObserver", "onExitClick", "onOwnerNameChange", "name", "onOwnerAvatarUrlChange", "url", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AudienceEndStatisticsView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveKitLogger f79015b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C37874b f79016c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final C37873a f79017d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC41775x1 f79018e;

    /* JADX INFO: renamed from: f */
    public TextView f79019f;

    /* JADX INFO: renamed from: g */
    public AtomicAvatar f79020g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public InterfaceC36372e f79021h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AudienceEndStatisticsView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AudienceEndStatisticsView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final void m81346f(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        C37874b c37874b = this.f79016c;
        if (TextUtils.isEmpty(str)) {
            str = "";
        } else {
            Intrinsics.checkNotNull(str);
        }
        c37874b.m85517k(str);
        C37874b c37874b2 = this.f79016c;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        } else {
            Intrinsics.checkNotNull(str2);
        }
        c37874b2.m85516j(str2);
        C37874b c37874b3 = this.f79016c;
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        } else {
            Intrinsics.checkNotNull(str3);
        }
        c37874b3.m85515i(str3);
        this.f79015b.m79404b("init, " + this.f79017d);
    }

    /* JADX INFO: renamed from: i */
    public final void m81348i() {
        InterfaceC36372e interfaceC36372e = this.f79021h;
        if (interfaceC36372e != null) {
            interfaceC36372e.mo81369a();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m81349j(String str) {
        AtomicAvatar atomicAvatar = this.f79020g;
        if (atomicAvatar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageHead");
            atomicAvatar = null;
        }
        atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(str, R$drawable.livekit_ic_avatar));
    }

    /* JADX INFO: renamed from: k */
    public final void m81350k(String str) {
        TextView textView = this.f79019f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textName");
            textView = null;
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: l */
    public final void m81351l() {
        InterfaceC41775x1 interfaceC41775x1 = this.f79018e;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    public final void setListener(@Nullable InterfaceC36372e interfaceC36372e) {
        this.f79021h = interfaceC36372e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudienceEndStatisticsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f79015b = LiveKitLogger.f77564c.getFeaturesLogger("AudienceEndStatisticsView");
        C37874b c37874b = new C37874b();
        this.f79016c = c37874b;
        this.f79017d = c37874b.getF85249a();
        m81347g();
    }

    /* JADX INFO: renamed from: h */
    public static final void m81344h(AudienceEndStatisticsView audienceEndStatisticsView, View view) {
        audienceEndStatisticsView.m81348i();
    }

    /* JADX INFO: renamed from: e */
    public final void m81345e() {
        this.f79018e = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new AudienceEndStatisticsView$addObserver$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m81347g() {
        LayoutInflater.from(getContext()).inflate(R$layout.livekit_audience_dashboard_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.tv_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f79019f = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.iv_head);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f79020g = (AtomicAvatar) viewFindViewById2;
        ((ImageView) findViewById(R$id.iv_back)).setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.endstatistics.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceEndStatisticsView.m81344h(this.f79025b, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m81345e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m81351l();
    }
}
