package com.trtc.uikit.livekit.features.livelist.view.doublecolumn;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.component.pippanel.PIPPanelStore;
import he0.InterfaceC38181a;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import sc0.C44385c;

/* JADX INFO: compiled from: DoubleColumnItemView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b*\u0001\u001a\u0018\u0000 +2\u00020\u0001:\u0001+B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0011J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0011J\b\u0010!\u001a\u00020\u001dH\u0014J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0006\u0010%\u001a\u00020\u001dJ\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020$H\u0002J\u0006\u0010(\u001a\u00020\u001dJ\b\u0010)\u001a\u00020$H\u0002J\u0006\u0010*\u001a\u00020\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001b¨\u0006,"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "liveCoreView", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "ivCoverImage", "Landroid/widget/ImageView;", "widgetViewGroup", "Landroid/view/ViewGroup;", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "liveListViewAdapter", "Lcom/trtc/uikit/livekit/features/livelist/LiveListViewAdapter;", "widgetView", "Landroid/view/View;", "isPlaying", "", "pauseByPictureInPicture", "handler", "com/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnItemView$handler$1", "Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnItemView$handler$1;", "createLiveInfoView", "", "adapter", "info", "updateLiveInfoView", "onDetachedFromWindow", "setLayoutBackground", "imageUrl", "", "startPreviewLiveStreamDelay", "startPreviewLiveStream", "roomId", "stopPreviewLiveStream", "getPictureInPictureRoomId", "isPauseByPictureInPicture", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DoubleColumnItemView extends FrameLayout {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f79046j = new Companion(null);

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final LiveKitLogger f79047k = LiveKitLogger.f77564c.getComponentLogger("DoubleColumnItemView");

    /* JADX INFO: renamed from: b */
    @NotNull
    public LiveCoreView f79048b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public ImageView f79049c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public ViewGroup f79050d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public LiveInfo f79051e;

    /* JADX INFO: renamed from: f */
    public View f79052f;

    /* JADX INFO: renamed from: g */
    public boolean f79053g;

    /* JADX INFO: renamed from: h */
    public boolean f79054h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final HandlerC36374a f79055i;

    /* JADX INFO: compiled from: DoubleColumnItemView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnItemView$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "DEFAULT_COVER_URL", "", "START_PLAY_VIDEO_STREAM", "", "START_PLAY_DELAY_MILLIS", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.DoubleColumnItemView$a */
    /* JADX INFO: compiled from: DoubleColumnItemView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnItemView$handler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class HandlerC36374a extends Handler {
        public HandlerC36374a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 10001) {
                removeMessages(10001);
                Object obj = msg.obj;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    DoubleColumnItemView.this.m81375d(str);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DoubleColumnItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DoubleColumnItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final String getPictureInPictureRoomId() {
        return PIPPanelStore.f77996b.sharedInstance().getF77998a().m99359d().getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m81373b(@NotNull InterfaceC38181a adapter, @NotNull LiveInfo info) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(info, "info");
        setLayoutBackground(info.getCoverURL());
        View viewM86144a = adapter.m86144a(info);
        this.f79052f = viewM86144a;
        ViewGroup viewGroup = this.f79050d;
        if (viewM86144a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetView");
            viewM86144a = null;
        }
        viewGroup.addView(viewM86144a);
        this.f79051e = info;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF79054h() {
        return this.f79054h;
    }

    /* JADX INFO: renamed from: d */
    public final void m81375d(String str) {
        LiveInfo liveInfo = this.f79051e;
        if (Intrinsics.areEqual(str, liveInfo != null ? liveInfo.getLiveID() : null)) {
            if (Intrinsics.areEqual(str, getPictureInPictureRoomId())) {
                this.f79048b.setVisibility(8);
                this.f79054h = true;
            } else {
                this.f79048b.setVisibility(0);
                this.f79048b.startPreviewLiveStream(str, true, null);
                this.f79053g = true;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m81376e() {
        String liveID;
        LiveInfo liveInfo = this.f79051e;
        if (liveInfo == null || (liveID = liveInfo.getLiveID()) == null) {
            liveID = "";
        }
        if (liveID.length() == 0) {
            return;
        }
        if (!Intrinsics.areEqual(liveID, getPictureInPictureRoomId())) {
            this.f79055i.removeMessages(10001);
            Message messageObtainMessage = this.f79055i.obtainMessage(10001, liveID);
            Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
            this.f79055i.sendMessageDelayed(messageObtainMessage, 500L);
            return;
        }
        f79047k.m79404b("picture in picture view is showing, startPreviewLiveStream ignore, roomId: " + liveID);
        this.f79054h = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m81377f() {
        String liveID;
        LiveInfo liveInfo = this.f79051e;
        if (liveInfo == null || (liveID = liveInfo.getLiveID()) == null) {
            return;
        }
        this.f79055i.removeMessages(10001);
        if (Intrinsics.areEqual(liveID, getPictureInPictureRoomId())) {
            this.f79048b.setVisibility(8);
        } else if (this.f79053g) {
            this.f79048b.stopPreviewLiveStream(liveID);
            this.f79048b.setVisibility(8);
            this.f79053g = false;
            this.f79054h = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m81378g(@NotNull LiveInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        setLayoutBackground(info.getCoverURL());
        m81377f();
        this.f79051e = info;
    }

    public /* synthetic */ DoubleColumnItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setLayoutBackground(String imageUrl) {
        Context context = getContext();
        ImageView imageView = this.f79049c;
        if (imageUrl == null) {
            imageUrl = "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover1.png";
        }
        C44385c.m97893c(context, imageView, imageUrl, R$drawable.livelist_default_cover);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f79055i.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DoubleColumnItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.livelist_double_column_item, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.live_core_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f79048b = (LiveCoreView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.cover_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f79049c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.widget_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f79050d = (ViewGroup) viewFindViewById3;
        this.f79055i = new HandlerC36374a(Looper.getMainLooper());
    }
}
