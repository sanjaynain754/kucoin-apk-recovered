package io.trtc.tuikit.atomicxcore.api.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.C39390R;
import io.trtc.tuikit.atomicxcore.api.device.DeviceFocusOwner;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.live.BattleEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDeprecated;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39732e0;
import io.trtc.tuikit.atomicxcore.impl.live.C39760n1;
import io.trtc.tuikit.atomicxcore.impl.live.C39763o1;
import io.trtc.tuikit.atomicxcore.impl.view.live.AbstractC40069N;
import io.trtc.tuikit.atomicxcore.impl.view.live.AbstractC40145z;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40067M;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40071O;
import io.trtc.tuikit.atomicxcore.impl.view.live.layer.C40114a;
import io.trtc.tuikit.atomicxcore.impl.view.live.layer.C40115b;
import io.trtc.tuikit.atomicxcore.impl.view.live.layer.C40116c;
import io.trtc.tuikit.atomicxcore.impl.view.live.layer.C40117d;
import io.trtc.tuikit.atomicxcore.impl.view.live.layer.C40118e;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u009c\u00012\u00020\u0001:\u0006\u009d\u0001\u009c\u0001\u009e\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010!\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b#\u0010\u001bR\"\u0010%\u001a\u00020$8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020+8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\"\u00105\u001a\u00020+8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\"\u00109\u001a\u0002088\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010M\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010E\u001a\u0004\bN\u0010G\"\u0004\bO\u0010PR\"\u0010Q\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010E\u001a\u0004\bR\u0010G\"\u0004\bS\u0010PR\u001a\u0010U\u001a\u00020T8\u0000X\u0080D¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR$\u0010Z\u001a\u0004\u0018\u00010Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010`\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010f\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010\u0017R6\u0010n\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020l0kj\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020l`m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR6\u0010r\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020l0kj\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020l`m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010o\u001a\u0004\bs\u0010qR6\u0010u\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020t0kj\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020t`m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010o\u001a\u0004\bv\u0010qR6\u0010x\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020w0kj\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020w`m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010o\u001a\u0004\by\u0010qR%\u0010{\u001a\u0004\u0018\u00010z8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R,\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0083\u0001\u001a\u0006\b\u0089\u0001\u0010\u0085\u0001\"\u0006\b\u008a\u0001\u0010\u0087\u0001R0\u0010\u008c\u0001\u001a\t\u0018\u00010\u008b\u0001R\u00020\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R0\u0010\u0093\u0001\u001a\t\u0018\u00010\u0092\u0001R\u00020\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R&\u0010\u0099\u0001\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010a\u001a\u0005\b\u009a\u0001\u0010c\"\u0005\b\u009b\u0001\u0010e¨\u0006\u009f\u0001"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;", "viewType", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILio/trtc/tuikit/atomicxcore/api/view/CoreViewType;)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;", "adapter", "setVideoViewAdapter", "(Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;)V", "", "liveId", "setLiveId", "(Ljava/lang/String;)V", "roomId", "", "isMuteAudio", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;", TUIConstants.TUIChat.CALL_BACK, "startPreviewLiveStream", "(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V", "stopPreviewLiveStream", "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;", "layoutMixStreamLayer", "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;", "getLayoutMixStreamLayer$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;", "setLayoutMixStreamLayer$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;)V", "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;", "layoutBackgroundWidgetsLayer", "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;", "getLayoutBackgroundWidgetsLayer$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;", "setLayoutBackgroundWidgetsLayer$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;)V", "layoutMultiStreamLayer", "getLayoutMultiStreamLayer$atomicxcore_release", "setLayoutMultiStreamLayer$atomicxcore_release", "layoutForegroundWidgetsLayer", "getLayoutForegroundWidgetsLayer$atomicxcore_release", "setLayoutForegroundWidgetsLayer$atomicxcore_release", "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;", "layoutBattleWidgetsLayerLayer", "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;", "getLayoutBattleWidgetsLayerLayer$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;", "setLayoutBattleWidgetsLayerLayer$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;)V", "Lio/trtc/tuikit/atomicxcore/impl/common/r;", "logger", "Lio/trtc/tuikit/atomicxcore/impl/common/r;", "getLogger$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/common/r;", "oid", "I", "getOid$atomicxcore_release", "()I", "Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;", "getViewType$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;", "setViewType$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;)V", "viewWidth", "getViewWidth$atomicxcore_release", "setViewWidth$atomicxcore_release", "(I)V", "viewHeight", "getViewHeight$atomicxcore_release", "setViewHeight$atomicxcore_release", "", "elevationBaseline", "F", "getElevationBaseline$atomicxcore_release", "()F", "Lio/trtc/tuikit/atomicxcore/impl/live/o1;", "lastSeatLayout", "Lio/trtc/tuikit/atomicxcore/impl/live/o1;", "getLastSeatLayout$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/live/o1;", "setLastSeatLayout$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V", "isFullScreenLayout", "Z", "isFullScreenLayout$atomicxcore_release", "()Z", "setFullScreenLayout$atomicxcore_release", "(Z)V", "videoViewAdapter", "Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;", "getVideoViewAdapter$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;", "setVideoViewAdapter$atomicxcore_release", "Ljava/util/HashMap;", "Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;", "Lkotlin/collections/HashMap;", "tuiVideoViewMap", "Ljava/util/HashMap;", "getTuiVideoViewMap$atomicxcore_release", "()Ljava/util/HashMap;", "videoPlaceHolderMap", "getVideoPlaceHolderMap$atomicxcore_release", "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;", "foregroundViewMap", "getForegroundViewMap$atomicxcore_release", "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;", "backgroundViewMap", "getBackgroundViewMap$atomicxcore_release", "Lio/trtc/tuikit/atomicxcore/impl/view/live/O;", "liveCoreViewImplObserver", "Lio/trtc/tuikit/atomicxcore/impl/view/live/O;", "getLiveCoreViewImplObserver$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/view/live/O;", "setLiveCoreViewImplObserver$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/impl/view/live/O;)V", "Lkotlinx/coroutines/x1;", "subscribeStateAfterEnterRoomJob", "Lkotlinx/coroutines/x1;", "getSubscribeStateAfterEnterRoomJob$atomicxcore_release", "()Lkotlinx/coroutines/x1;", "setSubscribeStateAfterEnterRoomJob$atomicxcore_release", "(Lkotlinx/coroutines/x1;)V", "subscribeStateBeforeEnterRoomJob", "getSubscribeStateBeforeEnterRoomJob$atomicxcore_release", "setSubscribeStateBeforeEnterRoomJob$atomicxcore_release", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;", "battleListenerImpl", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;", "getBattleListenerImpl$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;", "setBattleListenerImpl$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;)V", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;", "leaveRoomListenerImpl", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;", "getLeaveRoomListenerImpl$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;", "setLeaveRoomListenerImpl$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;)V", "isBattleStartedWaitingSEI", "isBattleStartedWaitingSEI$atomicxcore_release", "setBattleStartedWaitingSEI$atomicxcore_release", "Companion", "BattleListenerImpl", "LeaveRoomListenerImpl", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class LiveCoreView extends LiveCoreViewDeprecated {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final HashMap<String, C40114a> backgroundViewMap;

    @Nullable
    private BattleListenerImpl battleListenerImpl;
    private final float elevationBaseline;

    @NotNull
    private final HashMap<String, C40116c> foregroundViewMap;
    private boolean isBattleStartedWaitingSEI;
    private boolean isFullScreenLayout;

    @Nullable
    private C39763o1 lastSeatLayout;
    public C40118e layoutBackgroundWidgetsLayer;
    public C40115b layoutBattleWidgetsLayerLayer;
    public C40118e layoutForegroundWidgetsLayer;
    public C40117d layoutMixStreamLayer;
    public C40118e layoutMultiStreamLayer;

    @Nullable
    private LeaveRoomListenerImpl leaveRoomListenerImpl;

    @Nullable
    private C40071O liveCoreViewImplObserver;

    @NotNull
    private final C39510r logger;
    private final int oid;

    @Nullable
    private InterfaceC41775x1 subscribeStateAfterEnterRoomJob;

    @Nullable
    private InterfaceC41775x1 subscribeStateBeforeEnterRoomJob;

    @NotNull
    private final HashMap<String, TUIVideoView> tuiVideoViewMap;

    @NotNull
    private final HashMap<String, TUIVideoView> videoPlaceHolderMap;

    @Nullable
    private VideoViewAdapter videoViewAdapter;
    private int viewHeight;

    @NotNull
    private CoreViewType viewType;
    private int viewWidth;

    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¨\u0006\u000e"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;", "Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;", "(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V", "onBattleEnded", "", "battleInfo", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;", "onBattleStarted", "inviter", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "invitees", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public final class BattleListenerImpl extends BattleListener {
        public BattleListenerImpl() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleEnded(@NotNull BattleInfo battleInfo, @Nullable BattleEndedReason reason) {
            Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
            LiveCoreView liveCoreView = LiveCoreView.this;
            Intrinsics.checkNotNullParameter(liveCoreView, "<this>");
            Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
            liveCoreView.setBattleStartedWaitingSEI$atomicxcore_release(false);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleStarted(@NotNull BattleInfo battleInfo, @NotNull SeatUserInfo inviter, @NotNull List<SeatUserInfo> invitees) throws Exception {
            Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(invitees, "invitees");
            AbstractC40069N.m88433a(LiveCoreView.this, inviter, invitees);
        }
    }

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$Companion;", "", "()V", "callExperimentalAPI", "", "jsonStr", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void callExperimentalAPI(@NotNull String jsonStr) {
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            AbstractC40145z.m88494a(jsonStr);
        }
    }

    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;", "Lio/trtc/tuikit/atomicxcore/impl/live/e0;", "<init>", "(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V", "", "liveID", "", "onWillLeaveRoom", "(Ljava/lang/String;)V", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public final class LeaveRoomListenerImpl extends AbstractC39732e0 {
        public LeaveRoomListenerImpl() {
        }

        @Override // io.trtc.tuikit.atomicxcore.impl.live.AbstractC39732e0
        public void onWillLeaveRoom(@NotNull String liveID) {
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            LiveCoreView liveCoreView = LiveCoreView.this;
            Intrinsics.checkNotNullParameter(liveCoreView, "<this>");
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            C39510r logger = liveCoreView.getLogger();
            String message = "oid:" + liveCoreView.getOid() + ", onWillLeaveRoomInternal liveCoreView-liveId:" + liveCoreView.getLiveId() + ",leaveRoom-liveID:" + liveID;
            logger.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            logger.m88251a(0, message);
            if (Intrinsics.areEqual(liveID, liveCoreView.getLiveId())) {
                AbstractC40069N.m88430a(liveCoreView);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveCoreView(@NotNull Context context) {
        this(context, null, 0, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveCoreView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmStatic
    public static final void callExperimentalAPI(@NotNull String str) {
        INSTANCE.callExperimentalAPI(str);
    }

    @NotNull
    public final HashMap<String, C40114a> getBackgroundViewMap$atomicxcore_release() {
        return this.backgroundViewMap;
    }

    @Nullable
    /* JADX INFO: renamed from: getBattleListenerImpl$atomicxcore_release, reason: from getter */
    public final BattleListenerImpl getBattleListenerImpl() {
        return this.battleListenerImpl;
    }

    /* JADX INFO: renamed from: getElevationBaseline$atomicxcore_release, reason: from getter */
    public final float getElevationBaseline() {
        return this.elevationBaseline;
    }

    @NotNull
    public final HashMap<String, C40116c> getForegroundViewMap$atomicxcore_release() {
        return this.foregroundViewMap;
    }

    @Nullable
    /* JADX INFO: renamed from: getLastSeatLayout$atomicxcore_release, reason: from getter */
    public final C39763o1 getLastSeatLayout() {
        return this.lastSeatLayout;
    }

    @NotNull
    public final C40118e getLayoutBackgroundWidgetsLayer$atomicxcore_release() {
        C40118e c40118e = this.layoutBackgroundWidgetsLayer;
        if (c40118e != null) {
            return c40118e;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutBackgroundWidgetsLayer");
        return null;
    }

    @NotNull
    public final C40115b getLayoutBattleWidgetsLayerLayer$atomicxcore_release() {
        C40115b c40115b = this.layoutBattleWidgetsLayerLayer;
        if (c40115b != null) {
            return c40115b;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutBattleWidgetsLayerLayer");
        return null;
    }

    @NotNull
    public final C40118e getLayoutForegroundWidgetsLayer$atomicxcore_release() {
        C40118e c40118e = this.layoutForegroundWidgetsLayer;
        if (c40118e != null) {
            return c40118e;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutForegroundWidgetsLayer");
        return null;
    }

    @NotNull
    public final C40117d getLayoutMixStreamLayer$atomicxcore_release() {
        C40117d c40117d = this.layoutMixStreamLayer;
        if (c40117d != null) {
            return c40117d;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutMixStreamLayer");
        return null;
    }

    @NotNull
    public final C40118e getLayoutMultiStreamLayer$atomicxcore_release() {
        C40118e c40118e = this.layoutMultiStreamLayer;
        if (c40118e != null) {
            return c40118e;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutMultiStreamLayer");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getLeaveRoomListenerImpl$atomicxcore_release, reason: from getter */
    public final LeaveRoomListenerImpl getLeaveRoomListenerImpl() {
        return this.leaveRoomListenerImpl;
    }

    @Nullable
    /* JADX INFO: renamed from: getLiveCoreViewImplObserver$atomicxcore_release, reason: from getter */
    public final C40071O getLiveCoreViewImplObserver() {
        return this.liveCoreViewImplObserver;
    }

    @NotNull
    /* JADX INFO: renamed from: getLogger$atomicxcore_release, reason: from getter */
    public final C39510r getLogger() {
        return this.logger;
    }

    /* JADX INFO: renamed from: getOid$atomicxcore_release, reason: from getter */
    public final int getOid() {
        return this.oid;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubscribeStateAfterEnterRoomJob$atomicxcore_release, reason: from getter */
    public final InterfaceC41775x1 getSubscribeStateAfterEnterRoomJob() {
        return this.subscribeStateAfterEnterRoomJob;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubscribeStateBeforeEnterRoomJob$atomicxcore_release, reason: from getter */
    public final InterfaceC41775x1 getSubscribeStateBeforeEnterRoomJob() {
        return this.subscribeStateBeforeEnterRoomJob;
    }

    @NotNull
    public final HashMap<String, TUIVideoView> getTuiVideoViewMap$atomicxcore_release() {
        return this.tuiVideoViewMap;
    }

    @NotNull
    public final HashMap<String, TUIVideoView> getVideoPlaceHolderMap$atomicxcore_release() {
        return this.videoPlaceHolderMap;
    }

    @Nullable
    /* JADX INFO: renamed from: getVideoViewAdapter$atomicxcore_release, reason: from getter */
    public final VideoViewAdapter getVideoViewAdapter() {
        return this.videoViewAdapter;
    }

    /* JADX INFO: renamed from: getViewHeight$atomicxcore_release, reason: from getter */
    public final int getViewHeight() {
        return this.viewHeight;
    }

    @NotNull
    /* JADX INFO: renamed from: getViewType$atomicxcore_release, reason: from getter */
    public final CoreViewType getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: getViewWidth$atomicxcore_release, reason: from getter */
    public final int getViewWidth() {
        return this.viewWidth;
    }

    /* JADX INFO: renamed from: isBattleStartedWaitingSEI$atomicxcore_release, reason: from getter */
    public final boolean getIsBattleStartedWaitingSEI() {
        return this.isBattleStartedWaitingSEI;
    }

    /* JADX INFO: renamed from: isFullScreenLayout$atomicxcore_release, reason: from getter */
    public final boolean getIsFullScreenLayout() {
        return this.isFullScreenLayout;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        C39510r logger = getLogger();
        String message = "unsubscribeDataBeforeEnterRoom new OID:" + getOid();
        logger.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger.m88251a(0, message);
        InterfaceC41775x1 subscribeStateBeforeEnterRoomJob = getSubscribeStateBeforeEnterRoomJob();
        if (subscribeStateBeforeEnterRoomJob != null) {
            InterfaceC41775x1.a.m91377a(subscribeStateBeforeEnterRoomJob, null, 1, null);
        }
        super.onDetachedFromWindow();
    }

    public final void setBattleListenerImpl$atomicxcore_release(@Nullable BattleListenerImpl battleListenerImpl) {
        this.battleListenerImpl = battleListenerImpl;
    }

    public final void setBattleStartedWaitingSEI$atomicxcore_release(boolean z11) {
        this.isBattleStartedWaitingSEI = z11;
    }

    public final void setFullScreenLayout$atomicxcore_release(boolean z11) {
        this.isFullScreenLayout = z11;
    }

    public final void setLastSeatLayout$atomicxcore_release(@Nullable C39763o1 c39763o1) {
        this.lastSeatLayout = c39763o1;
    }

    public final void setLayoutBackgroundWidgetsLayer$atomicxcore_release(@NotNull C40118e c40118e) {
        Intrinsics.checkNotNullParameter(c40118e, "<set-?>");
        this.layoutBackgroundWidgetsLayer = c40118e;
    }

    public final void setLayoutBattleWidgetsLayerLayer$atomicxcore_release(@NotNull C40115b c40115b) {
        Intrinsics.checkNotNullParameter(c40115b, "<set-?>");
        this.layoutBattleWidgetsLayerLayer = c40115b;
    }

    public final void setLayoutForegroundWidgetsLayer$atomicxcore_release(@NotNull C40118e c40118e) {
        Intrinsics.checkNotNullParameter(c40118e, "<set-?>");
        this.layoutForegroundWidgetsLayer = c40118e;
    }

    public final void setLayoutMixStreamLayer$atomicxcore_release(@NotNull C40117d c40117d) {
        Intrinsics.checkNotNullParameter(c40117d, "<set-?>");
        this.layoutMixStreamLayer = c40117d;
    }

    public final void setLayoutMultiStreamLayer$atomicxcore_release(@NotNull C40118e c40118e) {
        Intrinsics.checkNotNullParameter(c40118e, "<set-?>");
        this.layoutMultiStreamLayer = c40118e;
    }

    public final void setLeaveRoomListenerImpl$atomicxcore_release(@Nullable LeaveRoomListenerImpl leaveRoomListenerImpl) {
        this.leaveRoomListenerImpl = leaveRoomListenerImpl;
    }

    public final void setLiveCoreViewImplObserver$atomicxcore_release(@Nullable C40071O c40071o) {
        this.liveCoreViewImplObserver = c40071o;
    }

    public final void setLiveId(@NotNull String liveId) {
        Intrinsics.checkNotNullParameter(liveId, "liveId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(liveId, "liveId");
        setLiveId$atomicxcore_release(liveId);
    }

    public final void setSubscribeStateAfterEnterRoomJob$atomicxcore_release(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        this.subscribeStateAfterEnterRoomJob = interfaceC41775x1;
    }

    public final void setSubscribeStateBeforeEnterRoomJob$atomicxcore_release(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        this.subscribeStateBeforeEnterRoomJob = interfaceC41775x1;
    }

    public final void setVideoViewAdapter(@Nullable VideoViewAdapter adapter) {
        this.videoViewAdapter = adapter;
    }

    public final void setVideoViewAdapter$atomicxcore_release(@Nullable VideoViewAdapter videoViewAdapter) {
        this.videoViewAdapter = videoViewAdapter;
    }

    public final void setViewHeight$atomicxcore_release(int i11) {
        this.viewHeight = i11;
    }

    public final void setViewType$atomicxcore_release(@NotNull CoreViewType coreViewType) {
        Intrinsics.checkNotNullParameter(coreViewType, "<set-?>");
        this.viewType = coreViewType;
    }

    public final void setViewWidth$atomicxcore_release(int i11) {
        this.viewWidth = i11;
    }

    public final void startPreviewLiveStream(@NotNull String roomId, boolean isMuteAudio, @Nullable TUIRoomDefine.PlayCallback callback) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Object extension = TUIRoomEngine.sharedInstance().getExtension(TUICommonDefine.ExtensionType.LIVE_LIST_MANAGER);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveListManager");
        ((TUILiveListManager) extension).startPreloadVideoStream(roomId, isMuteAudio, getLayoutMixStreamLayer$atomicxcore_release().getTUIVideoView(), callback);
    }

    public final void stopPreviewLiveStream(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Object extension = TUIRoomEngine.sharedInstance().getExtension(TUICommonDefine.ExtensionType.LIVE_LIST_MANAGER);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveListManager");
        ((TUILiveListManager) extension).stopPreloadVideoStream(roomId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveCoreView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Intrinsics.checkNotNullParameter(this, "<this>");
        C39510r logger = getLogger();
        String message = "subscribeDataBeforeEnterRoom new OID:" + getOid();
        logger.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger.m88251a(0, message);
        InterfaceC41775x1 subscribeStateBeforeEnterRoomJob = getSubscribeStateBeforeEnterRoomJob();
        if (subscribeStateBeforeEnterRoomJob != null) {
            InterfaceC41775x1.a.m91377a(subscribeStateBeforeEnterRoomJob, null, 1, null);
        }
        setSubscribeStateBeforeEnterRoomJob$atomicxcore_release(C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C40067M(this, null), 3, null));
        Intrinsics.checkNotNullParameter(this, "<this>");
        C39510r logger2 = getLogger();
        String message2 = "setFocusInternal new OID:" + getOid();
        logger2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        logger2.m88251a(0, message2);
        DeviceStore.INSTANCE.shared().setFocus$atomicxcore_release(DeviceFocusOwner.LIVE);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Intrinsics.checkNotNullParameter(this, "<this>");
        setViewWidth$atomicxcore_release(measuredWidth);
        setViewHeight$atomicxcore_release(measuredHeight);
    }

    public /* synthetic */ LiveCoreView(Context context, AttributeSet attributeSet, int i11, CoreViewType coreViewType, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? CoreViewType.PLAY_VIEW : coreViewType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveCoreView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, @NotNull CoreViewType viewType) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.logger = AbstractC39398a.m88229a("LiveCoreView", "file", "AtomicXCore-Live", "LiveCoreView");
        this.oid = hashCode();
        CoreViewType coreViewType = CoreViewType.PLAY_VIEW;
        this.viewType = coreViewType;
        this.viewWidth = 720;
        this.viewHeight = 1280;
        this.elevationBaseline = 4.0f;
        this.isFullScreenLayout = true;
        this.tuiVideoViewMap = new HashMap<>();
        this.videoPlaceHolderMap = new HashMap<>();
        this.foregroundViewMap = new HashMap<>();
        this.backgroundViewMap = new HashMap<>();
        C39760n1.f88350d.m88323a();
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        C39510r logger = getLogger();
        String message = "initAttributes OID:" + getOid() + ",roomId:" + getLiveId() + ",viewType:" + viewType;
        logger.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger.m88251a(0, message);
        CoreViewType coreViewType2 = CoreViewType.PUSH_VIEW;
        if (viewType == coreViewType2) {
            setViewType$atomicxcore_release(coreViewType2);
        } else if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39390R.styleable.LiveCoreView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                setViewType$atomicxcore_release(typedArrayObtainStyledAttributes.getInt(C39390R.styleable.LiveCoreView_viewType, coreViewType.ordinal()) == 1 ? coreViewType2 : coreViewType);
                C39510r logger2 = getLogger();
                String message2 = "LiveCoreView initAttributes typedArray OID:" + getOid() + ",roomId:" + getLiveId() + ",viewType:" + viewType;
                logger2.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                logger2.m88251a(0, message2);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                C39510r logger3 = getLogger();
                String message3 = "LiveCoreView initAttributes typedArray OID:" + getOid() + ",roomId:" + getLiveId() + ",viewType:" + viewType;
                logger3.getClass();
                Intrinsics.checkNotNullParameter(message3, "message");
                logger3.m88251a(0, message3);
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        AbstractC40069N.m88440c(this);
    }
}
