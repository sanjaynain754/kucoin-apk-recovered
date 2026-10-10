package com.trtc.uikit.livekit.features.livelist.view.singlecolumn;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.component.pippanel.PIPPanelStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sc0.C44385c;
import sc0.C44386d;

/* JADX INFO: compiled from: SingleColumnItemView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0015J\u0006\u0010#\u001a\u00020\u001aJ\n\u0010$\u001a\u0004\u0018\u00010 H\u0002J\u0006\u0010%\u001a\u00020\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/singlecolumn/SingleColumnItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "liveCoreView", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "ivCoverImage", "Landroid/widget/ImageView;", "widgetViewGroup", "Landroid/view/ViewGroup;", "liveListViewAdapter", "Lcom/trtc/uikit/livekit/features/livelist/LiveListViewAdapter;", "widgetView", "Landroid/view/View;", "isPlaying", "", "pauseByPictureInPicture", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "createLiveInfoView", "", "adapter", "updateLiveInfoView", "initView", "setLayoutBackground", "imageUrl", "", "startPreviewLiveStream", "isMuteAudio", "stopPreviewLiveStream", "getPictureInPictureRoomId", "isPauseByPictureInPicture", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSingleColumnItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleColumnItemView.kt\ncom/trtc/uikit/livekit/features/livelist/view/singlecolumn/SingleColumnItemView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
public final class SingleColumnItemView extends FrameLayout {

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Companion f79120h = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final LiveKitLogger f79121i = LiveKitLogger.f77564c.getComponentLogger("SingleColumnItemView");

    /* JADX INFO: renamed from: b */
    public LiveCoreView f79122b;

    /* JADX INFO: renamed from: c */
    public ImageView f79123c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f79124d;

    /* JADX INFO: renamed from: e */
    public boolean f79125e;

    /* JADX INFO: renamed from: f */
    public boolean f79126f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public LiveInfo f79127g;

    /* JADX INFO: compiled from: SingleColumnItemView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/singlecolumn/SingleColumnItemView$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "DEFAULT_COVER_URL", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleColumnItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleColumnItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final String getPictureInPictureRoomId() {
        return PIPPanelStore.f77996b.sharedInstance().getF77998a().m99359d().getValue();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF79126f() {
        return this.f79126f;
    }

    /* JADX INFO: renamed from: c */
    public final void m81475c(boolean z11) {
        LiveInfo liveInfo = this.f79127g;
        if (liveInfo == null) {
            f79121i.m79403a("startPreviewLiveStream failed, roomId is empty");
            return;
        }
        String liveID = liveInfo.getLiveID();
        if (TextUtils.isEmpty(liveID)) {
            f79121i.m79403a("startPreviewLiveStream failed, roomId is empty");
            return;
        }
        LiveCoreView liveCoreView = null;
        if (Intrinsics.areEqual(liveID, getPictureInPictureRoomId())) {
            LiveCoreView liveCoreView2 = this.f79122b;
            if (liveCoreView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            } else {
                liveCoreView = liveCoreView2;
            }
            liveCoreView.setVisibility(8);
            this.f79126f = true;
            f79121i.m79404b("picture in picture view is showing, startPreviewLiveStream ignore, roomId:" + liveInfo.getLiveID());
            return;
        }
        LiveCoreView liveCoreView3 = this.f79122b;
        if (liveCoreView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView3 = null;
        }
        liveCoreView3.setVisibility(0);
        f79121i.m79404b("startPreviewLiveStream, roomId:" + liveInfo.getLiveID());
        LiveCoreView liveCoreView4 = this.f79122b;
        if (liveCoreView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            liveCoreView4 = null;
        }
        liveCoreView4.startPreviewLiveStream(liveInfo.getLiveID(), z11, null);
        this.f79125e = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m81476d() {
        LiveInfo liveInfo = this.f79127g;
        if (liveInfo == null) {
            f79121i.m79403a("stopPreviewLiveStream failed, roomId is empty");
            return;
        }
        String liveID = liveInfo.getLiveID();
        if (TextUtils.isEmpty(liveID)) {
            f79121i.m79403a("stopPreviewLiveStream failed, roomId is empty");
            return;
        }
        LiveCoreView liveCoreView = null;
        if (Intrinsics.areEqual(liveID, getPictureInPictureRoomId())) {
            LiveCoreView liveCoreView2 = this.f79122b;
            if (liveCoreView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            } else {
                liveCoreView = liveCoreView2;
            }
            liveCoreView.setVisibility(8);
            f79121i.m79404b("picture in picture view is showing, stopPreviewLiveStream ignore, roomId:" + liveInfo.getLiveID());
            return;
        }
        f79121i.m79404b("stopPreviewLiveStream, roomId:" + liveID + ", isPlaying:" + this.f79125e);
        if (this.f79125e) {
            LiveCoreView liveCoreView3 = this.f79122b;
            if (liveCoreView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                liveCoreView3 = null;
            }
            liveCoreView3.stopPreviewLiveStream(liveInfo.getLiveID());
            LiveCoreView liveCoreView4 = this.f79122b;
            if (liveCoreView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
            } else {
                liveCoreView = liveCoreView4;
            }
            liveCoreView.setVisibility(8);
            this.f79125e = false;
            this.f79126f = false;
        }
    }

    public /* synthetic */ SingleColumnItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setLayoutBackground(String imageUrl) {
        ImageView imageView = null;
        if (TextUtils.isEmpty(imageUrl)) {
            imageUrl = null;
        }
        if (imageUrl == null) {
            imageUrl = "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover1.png";
        }
        Context context = getContext();
        ImageView imageView2 = this.f79123c;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivCoverImage");
        } else {
            imageView = imageView2;
        }
        C44385c.m97894d(context, imageView, imageUrl, new C44386d.b().m97911g(80.0f).m97910f());
    }

    /* JADX INFO: renamed from: a */
    public final void m81473a() {
        LayoutInflater.from(getContext()).inflate(R$layout.livelist_single_column_item, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.live_core_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f79122b = (LiveCoreView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.cover_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f79123c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.widget_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f79124d = (ViewGroup) viewFindViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleColumnItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        m81473a();
    }
}
