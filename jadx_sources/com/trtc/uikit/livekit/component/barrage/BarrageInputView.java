package com.trtc.uikit.livekit.component.barrage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.p179ui.BasicView;
import com.trtc.uikit.livekit.component.barrage.view.BarrageSendView;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BarrageInputView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u000f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0014J\b\u0010\u0018\u001a\u00020\u0012H\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0019"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;", "Lcom/trtc/uikit/livekit/common/ui/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "barrageSendView", "Lcom/trtc/uikit/livekit/component/barrage/view/BarrageSendView;", "barrageStore", "Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;", "liveListListener", "com/trtc/uikit/livekit/component/barrage/BarrageInputView$liveListListener$1", "Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView$liveListListener$1;", "init", "", "roomId", "", "initStore", "initView", "addObserver", "removeObserver", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class BarrageInputView extends BasicView {

    /* JADX INFO: renamed from: d */
    @Nullable
    public BarrageSendView f77607d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public BarrageStore f77608e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final C35880a f77609f;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.barrage.BarrageInputView$a */
    /* JADX INFO: compiled from: BarrageInputView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/component/barrage/BarrageInputView$liveListListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "onLiveEnded", "", "liveId", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35880a extends LiveListListener {
        public C35880a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onLiveEnded(String liveId, LiveEndedReason reason, String message) {
            Intrinsics.checkNotNullParameter(liveId, "liveId");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            BarrageSendView barrageSendView = BarrageInputView.this.f77607d;
            if (barrageSendView != null) {
                barrageSendView.dismiss();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BarrageInputView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BarrageInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: i */
    private final void m79463i() {
        setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.component.barrage.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarrageInputView.m79464j(this.f77624b, view);
            }
        });
        findViewById(R$id.rl_emoticons).setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.component.barrage.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarrageInputView.m79465k(this.f77625b, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final void m79464j(BarrageInputView barrageInputView, View view) {
        Context context = barrageInputView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BarrageSendView barrageSendView = new BarrageSendView(context, barrageInputView.getF77568c());
        barrageInputView.f77607d = barrageSendView;
        if (!barrageSendView.isShowing()) {
            barrageSendView.m79521Q(false);
        }
        C43852m.m96591c("B1FeedLive", "commentInput", null, null, 12, null);
    }

    /* JADX INFO: renamed from: k */
    public static final void m79465k(BarrageInputView barrageInputView, View view) {
        Context context = barrageInputView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BarrageSendView barrageSendView = new BarrageSendView(context, barrageInputView.getF77568c());
        barrageInputView.f77607d = barrageSendView;
        if (barrageSendView.isShowing()) {
            return;
        }
        barrageSendView.m79521Q(true);
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: a */
    public void mo79408a() {
        LiveListStore.INSTANCE.shared().addLiveListListener(this.f77609f);
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: b */
    public void mo79409b(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        setRoomId(roomId);
        m79463i();
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: c */
    public void mo79410c() {
        this.f77608e = BarrageStore.INSTANCE.create(getF77568c());
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: d */
    public void mo79411d() {
        LiveListStore.INSTANCE.shared().removeLiveListListener(this.f77609f);
    }

    public /* synthetic */ BarrageInputView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BarrageInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77609f = new C35880a();
        LayoutInflater.from(context).inflate(R$layout.livekit_barrage_view_send, this);
    }
}
