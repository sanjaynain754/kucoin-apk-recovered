.class public final Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;
.super Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;,
        Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$Companion;,
        Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u0000 \u009c\u00012\u00020\u0001:\u0006\u009d\u0001\u009c\u0001\u009e\u0001B1\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000e2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\'\u0010!\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0018\u00a2\u0006\u0004\u0008#\u0010\u001bR\"\u0010%\u001a\u00020$8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\"\u0010,\u001a\u00020+8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101R\"\u00102\u001a\u00020+8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u00082\u0010-\u001a\u0004\u00083\u0010/\"\u0004\u00084\u00101R\"\u00105\u001a\u00020+8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u00085\u0010-\u001a\u0004\u00086\u0010/\"\u0004\u00087\u00101R\"\u00109\u001a\u0002088\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<\"\u0004\u0008=\u0010>R\u001a\u0010@\u001a\u00020?8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010CR\u001a\u0010D\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010GR\"\u0010\t\u001a\u00020\u00088\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010H\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010LR\"\u0010M\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008M\u0010E\u001a\u0004\u0008N\u0010G\"\u0004\u0008O\u0010PR\"\u0010Q\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008Q\u0010E\u001a\u0004\u0008R\u0010G\"\u0004\u0008S\u0010PR\u001a\u0010U\u001a\u00020T8\u0000X\u0080D\u00a2\u0006\u000c\n\u0004\u0008U\u0010V\u001a\u0004\u0008W\u0010XR$\u0010Z\u001a\u0004\u0018\u00010Y8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]\"\u0004\u0008^\u0010_R\"\u0010`\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008`\u0010a\u001a\u0004\u0008b\u0010c\"\u0004\u0008d\u0010eR$\u0010f\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008f\u0010g\u001a\u0004\u0008h\u0010i\"\u0004\u0008j\u0010\u0017R6\u0010n\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020l0kj\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020l`m8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008n\u0010o\u001a\u0004\u0008p\u0010qR6\u0010r\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020l0kj\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020l`m8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008r\u0010o\u001a\u0004\u0008s\u0010qR6\u0010u\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020t0kj\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020t`m8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008u\u0010o\u001a\u0004\u0008v\u0010qR6\u0010x\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020w0kj\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020w`m8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008x\u0010o\u001a\u0004\u0008y\u0010qR%\u0010{\u001a\u0004\u0018\u00010z8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0013\n\u0004\u0008{\u0010|\u001a\u0004\u0008}\u0010~\"\u0005\u0008\u007f\u0010\u0080\u0001R,\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001\"\u0006\u0008\u0086\u0001\u0010\u0087\u0001R,\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0088\u0001\u0010\u0083\u0001\u001a\u0006\u0008\u0089\u0001\u0010\u0085\u0001\"\u0006\u0008\u008a\u0001\u0010\u0087\u0001R0\u0010\u008c\u0001\u001a\t\u0018\u00010\u008b\u0001R\u00020\u00008\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001\u001a\u0006\u0008\u008e\u0001\u0010\u008f\u0001\"\u0006\u0008\u0090\u0001\u0010\u0091\u0001R0\u0010\u0093\u0001\u001a\t\u0018\u00010\u0092\u0001R\u00020\u00008\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001\u001a\u0006\u0008\u0095\u0001\u0010\u0096\u0001\"\u0006\u0008\u0097\u0001\u0010\u0098\u0001R&\u0010\u0099\u0001\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0099\u0001\u0010a\u001a\u0005\u0008\u009a\u0001\u0010c\"\u0005\u0008\u009b\u0001\u0010e\u00a8\u0006\u009f\u0001"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;",
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;",
        "viewType",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;ILio/trtc/tuikit/atomicxcore/api/view/CoreViewType;)V",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "",
        "onMeasure",
        "(II)V",
        "onAttachedToWindow",
        "()V",
        "onDetachedFromWindow",
        "Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;",
        "adapter",
        "setVideoViewAdapter",
        "(Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;)V",
        "",
        "liveId",
        "setLiveId",
        "(Ljava/lang/String;)V",
        "roomId",
        "",
        "isMuteAudio",
        "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;",
        "callback",
        "startPreviewLiveStream",
        "(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V",
        "stopPreviewLiveStream",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;",
        "layoutMixStreamLayer",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;",
        "getLayoutMixStreamLayer$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;",
        "setLayoutMixStreamLayer$atomicxcore_release",
        "(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;)V",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;",
        "layoutBackgroundWidgetsLayer",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;",
        "getLayoutBackgroundWidgetsLayer$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;",
        "setLayoutBackgroundWidgetsLayer$atomicxcore_release",
        "(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;)V",
        "layoutMultiStreamLayer",
        "getLayoutMultiStreamLayer$atomicxcore_release",
        "setLayoutMultiStreamLayer$atomicxcore_release",
        "layoutForegroundWidgetsLayer",
        "getLayoutForegroundWidgetsLayer$atomicxcore_release",
        "setLayoutForegroundWidgetsLayer$atomicxcore_release",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;",
        "layoutBattleWidgetsLayerLayer",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;",
        "getLayoutBattleWidgetsLayerLayer$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;",
        "setLayoutBattleWidgetsLayerLayer$atomicxcore_release",
        "(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;)V",
        "Lio/trtc/tuikit/atomicxcore/impl/common/r;",
        "logger",
        "Lio/trtc/tuikit/atomicxcore/impl/common/r;",
        "getLogger$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/impl/common/r;",
        "oid",
        "I",
        "getOid$atomicxcore_release",
        "()I",
        "Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;",
        "getViewType$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;",
        "setViewType$atomicxcore_release",
        "(Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;)V",
        "viewWidth",
        "getViewWidth$atomicxcore_release",
        "setViewWidth$atomicxcore_release",
        "(I)V",
        "viewHeight",
        "getViewHeight$atomicxcore_release",
        "setViewHeight$atomicxcore_release",
        "",
        "elevationBaseline",
        "F",
        "getElevationBaseline$atomicxcore_release",
        "()F",
        "Lio/trtc/tuikit/atomicxcore/impl/live/o1;",
        "lastSeatLayout",
        "Lio/trtc/tuikit/atomicxcore/impl/live/o1;",
        "getLastSeatLayout$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/impl/live/o1;",
        "setLastSeatLayout$atomicxcore_release",
        "(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V",
        "isFullScreenLayout",
        "Z",
        "isFullScreenLayout$atomicxcore_release",
        "()Z",
        "setFullScreenLayout$atomicxcore_release",
        "(Z)V",
        "videoViewAdapter",
        "Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;",
        "getVideoViewAdapter$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;",
        "setVideoViewAdapter$atomicxcore_release",
        "Ljava/util/HashMap;",
        "Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;",
        "Lkotlin/collections/HashMap;",
        "tuiVideoViewMap",
        "Ljava/util/HashMap;",
        "getTuiVideoViewMap$atomicxcore_release",
        "()Ljava/util/HashMap;",
        "videoPlaceHolderMap",
        "getVideoPlaceHolderMap$atomicxcore_release",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;",
        "foregroundViewMap",
        "getForegroundViewMap$atomicxcore_release",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;",
        "backgroundViewMap",
        "getBackgroundViewMap$atomicxcore_release",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/O;",
        "liveCoreViewImplObserver",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/O;",
        "getLiveCoreViewImplObserver$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/impl/view/live/O;",
        "setLiveCoreViewImplObserver$atomicxcore_release",
        "(Lio/trtc/tuikit/atomicxcore/impl/view/live/O;)V",
        "Lkotlinx/coroutines/x1;",
        "subscribeStateAfterEnterRoomJob",
        "Lkotlinx/coroutines/x1;",
        "getSubscribeStateAfterEnterRoomJob$atomicxcore_release",
        "()Lkotlinx/coroutines/x1;",
        "setSubscribeStateAfterEnterRoomJob$atomicxcore_release",
        "(Lkotlinx/coroutines/x1;)V",
        "subscribeStateBeforeEnterRoomJob",
        "getSubscribeStateBeforeEnterRoomJob$atomicxcore_release",
        "setSubscribeStateBeforeEnterRoomJob$atomicxcore_release",
        "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;",
        "battleListenerImpl",
        "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;",
        "getBattleListenerImpl$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;",
        "setBattleListenerImpl$atomicxcore_release",
        "(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;)V",
        "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;",
        "leaveRoomListenerImpl",
        "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;",
        "getLeaveRoomListenerImpl$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;",
        "setLeaveRoomListenerImpl$atomicxcore_release",
        "(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;)V",
        "isBattleStartedWaitingSEI",
        "isBattleStartedWaitingSEI$atomicxcore_release",
        "setBattleStartedWaitingSEI$atomicxcore_release",
        "Companion",
        "BattleListenerImpl",
        "LeaveRoomListenerImpl",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final backgroundViewMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private battleListenerImpl:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final elevationBaseline:F

.field private final foregroundViewMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isBattleStartedWaitingSEI:Z

.field private isFullScreenLayout:Z

.field private lastSeatLayout:Lio/trtc/tuikit/atomicxcore/impl/live/o1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public layoutBackgroundWidgetsLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

.field public layoutBattleWidgetsLayerLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;

.field public layoutForegroundWidgetsLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

.field public layoutMixStreamLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;

.field public layoutMultiStreamLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

.field private leaveRoomListenerImpl:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private liveCoreViewImplObserver:Lio/trtc/tuikit/atomicxcore/impl/view/live/O;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final logger:Lio/trtc/tuikit/atomicxcore/impl/common/r;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final oid:I

.field private subscribeStateAfterEnterRoomJob:Lkotlinx/coroutines/x1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private subscribeStateBeforeEnterRoomJob:Lkotlinx/coroutines/x1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final tuiVideoViewMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final videoPlaceHolderMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private videoViewAdapter:Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private viewHeight:I

.field private viewType:Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private viewWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->Companion:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILio/trtc/tuikit/atomicxcore/api/view/CoreViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILio/trtc/tuikit/atomicxcore/api/view/CoreViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 3
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v7}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILio/trtc/tuikit/atomicxcore/api/view/CoreViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILio/trtc/tuikit/atomicxcore/api/view/CoreViewType;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "LiveCoreView initAttributes typedArray OID:"

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "viewType"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    const-string p1, "file"

    const-string p3, "AtomicXCore-Live"

    const-string v2, "LiveCoreView"

    invoke-static {v2, p1, p3, v2}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object p1

    .line 8
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->logger:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->oid:I

    .line 10
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;->PLAY_VIEW:Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;

    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->viewType:Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;

    const/16 p3, 0x2d0

    .line 11
    iput p3, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->viewWidth:I

    const/16 p3, 0x500

    .line 12
    iput p3, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->viewHeight:I

    const/high16 p3, 0x40800000    # 4.0f

    .line 13
    iput p3, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->elevationBaseline:F

    const/4 p3, 0x1

    .line 14
    iput-boolean p3, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->isFullScreenLayout:Z

    .line 15
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->tuiVideoViewMap:Ljava/util/HashMap;

    .line 16
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->videoPlaceHolderMap:Ljava/util/HashMap;

    .line 17
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->foregroundViewMap:Ljava/util/HashMap;

    .line 18
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->backgroundViewMap:Ljava/util/HashMap;

    .line 19
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/live/n1;->d:Lio/trtc/tuikit/atomicxcore/impl/live/n1;

    .line 20
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/impl/live/n1;->a()V

    .line 21
    const-string v2, "<this>"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initAttributes OID:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",roomId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ",viewType:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    const-string v5, "message"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    .line 24
    invoke-virtual {v1, v6, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 25
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;->PUSH_VIEW:Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;

    if-ne p4, v1, :cond_0

    .line 26
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setViewType$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;)V

    goto/16 :goto_0

    :cond_0
    if-eqz p2, :cond_2

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 28
    sget-object v7, Lio/trtc/tuikit/atomicxcore/R$styleable;->LiveCoreView:[I

    .line 29
    invoke-virtual {v2, p2, v7, v6, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v2, "obtainStyledAttributes(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    :try_start_0
    sget v2, Lio/trtc/tuikit/atomicxcore/R$styleable;->LiveCoreView_viewType:I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    invoke-virtual {p2, v2, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    if-ne v2, p3, :cond_1

    move-object p1, v1

    .line 31
    :cond_1
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setViewType$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-static {p3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1, v6, p3}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 35
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 36
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-static {p4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p3, v6, p4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 39
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1

    .line 40
    :cond_2
    :goto_0
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->c(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILio/trtc/tuikit/atomicxcore/api/view/CoreViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 4
    sget-object p4, Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;->PLAY_VIEW:Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILio/trtc/tuikit/atomicxcore/api/view/CoreViewType;)V

    return-void
.end method

.method public static final callExperimentalAPI(Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->Companion:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$Companion;->callExperimentalAPI(Ljava/lang/String;)V

    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final getBackgroundViewMap$atomicxcore_release()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->backgroundViewMap:Ljava/util/HashMap;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getBattleListenerImpl$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->battleListenerImpl:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getElevationBaseline$atomicxcore_release()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->elevationBaseline:F

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getForegroundViewMap$atomicxcore_release()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->foregroundViewMap:Ljava/util/HashMap;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLastSeatLayout$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/live/o1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->lastSeatLayout:Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLayoutBackgroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->layoutBackgroundWidgetsLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    const-string v0, "layoutBackgroundWidgetsLayer"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLayoutBattleWidgetsLayerLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->layoutBattleWidgetsLayerLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    const-string v0, "layoutBattleWidgetsLayerLayer"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLayoutForegroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->layoutForegroundWidgetsLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    const-string v0, "layoutForegroundWidgetsLayer"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLayoutMixStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->layoutMixStreamLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    const-string v0, "layoutMixStreamLayer"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->layoutMultiStreamLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    const-string v0, "layoutMultiStreamLayer"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLeaveRoomListenerImpl$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->leaveRoomListenerImpl:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLiveCoreViewImplObserver$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/O;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->liveCoreViewImplObserver:Lio/trtc/tuikit/atomicxcore/impl/view/live/O;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->logger:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getOid$atomicxcore_release()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->oid:I

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getSubscribeStateAfterEnterRoomJob$atomicxcore_release()Lkotlinx/coroutines/x1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->subscribeStateAfterEnterRoomJob:Lkotlinx/coroutines/x1;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getSubscribeStateBeforeEnterRoomJob$atomicxcore_release()Lkotlinx/coroutines/x1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->subscribeStateBeforeEnterRoomJob:Lkotlinx/coroutines/x1;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getTuiVideoViewMap$atomicxcore_release()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->tuiVideoViewMap:Ljava/util/HashMap;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getVideoPlaceHolderMap$atomicxcore_release()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->videoPlaceHolderMap:Ljava/util/HashMap;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getVideoViewAdapter$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->videoViewAdapter:Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getViewHeight$atomicxcore_release()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->viewHeight:I

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getViewType$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->viewType:Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getViewWidth$atomicxcore_release()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->viewWidth:I

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final isBattleStartedWaitingSEI$atomicxcore_release()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->isBattleStartedWaitingSEI:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final isFullScreenLayout$atomicxcore_release()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->isFullScreenLayout:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public onAttachedToWindow()V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 4
    .line 5
    const-string v0, "<this>"

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string/jumbo v3, "subscribeDataBeforeEnterRoom new OID:"

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    .line 24
    move-result v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    const-string v3, "message"

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    const/4 v4, 0x0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getSubscribeStateBeforeEnterRoomJob$atomicxcore_release()Lkotlinx/coroutines/x1;

    .line 47
    move-result-object v1

    .line 48
    const/4 v2, 0x0

    .line 49
    .line 50
    if-eqz v1, :cond_0

    .line 51
    const/4 v5, 0x1

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2, v5, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 62
    move-result-object v5

    .line 63
    .line 64
    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/view/live/M;

    .line 65
    .line 66
    .line 67
    invoke-direct {v8, p0, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/M;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lkotlin/coroutines/Continuation;)V

    .line 68
    const/4 v9, 0x3

    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    .line 73
    .line 74
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setSubscribeStateBeforeEnterRoomJob$atomicxcore_release(Lkotlinx/coroutines/x1;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    new-instance v1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v2, "setFocusInternal new OID:"

    .line 90
    .line 91
    .line 92
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    .line 96
    move-result v2

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v4, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 113
    .line 114
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;->LIVE:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->setFocus$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;)V

    .line 124
    return-void
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
.end method

.method public onDetachedFromWindow()V
    .locals 3

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "unsubscribeDataBeforeEnterRoom new OID:"

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    .line 21
    move-result v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    const-string v2, "message"

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    const/4 v2, 0x0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getSubscribeStateBeforeEnterRoomJob$atomicxcore_release()Lkotlinx/coroutines/x1;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    const/4 v1, 0x1

    .line 48
    const/4 v2, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 7
    move-result p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 11
    move-result p2

    .line 12
    .line 13
    const-string v0, "<this>"

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setViewWidth$atomicxcore_release(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p2}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setViewHeight$atomicxcore_release(I)V

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public final setBattleListenerImpl$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->battleListenerImpl:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setBattleStartedWaitingSEI$atomicxcore_release(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->isBattleStartedWaitingSEI:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setFullScreenLayout$atomicxcore_release(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->isFullScreenLayout:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setLastSeatLayout$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/impl/live/o1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->lastSeatLayout:Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setLayoutBackgroundWidgetsLayer$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->layoutBackgroundWidgetsLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setLayoutBattleWidgetsLayerLayer$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->layoutBattleWidgetsLayerLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setLayoutForegroundWidgetsLayer$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->layoutForegroundWidgetsLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setLayoutMixStreamLayer$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->layoutMixStreamLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setLayoutMultiStreamLayer$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->layoutMultiStreamLayer:Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setLeaveRoomListenerImpl$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->leaveRoomListenerImpl:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setLiveCoreViewImplObserver$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/O;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/impl/view/live/O;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->liveCoreViewImplObserver:Lio/trtc/tuikit/atomicxcore/impl/view/live/O;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setLiveId(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "liveId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "<this>"

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setLiveId$atomicxcore_release(Ljava/lang/String;)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setSubscribeStateAfterEnterRoomJob$atomicxcore_release(Lkotlinx/coroutines/x1;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/x1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->subscribeStateAfterEnterRoomJob:Lkotlinx/coroutines/x1;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setSubscribeStateBeforeEnterRoomJob$atomicxcore_release(Lkotlinx/coroutines/x1;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/x1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->subscribeStateBeforeEnterRoomJob:Lkotlinx/coroutines/x1;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setVideoViewAdapter(Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->videoViewAdapter:Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setVideoViewAdapter$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->videoViewAdapter:Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setViewHeight$atomicxcore_release(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->viewHeight:I

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setViewType$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->viewType:Lio/trtc/tuikit/atomicxcore/api/view/CoreViewType;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setViewWidth$atomicxcore_release(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->viewWidth:I

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final startPreviewLiveStream(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "roomId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "<this>"

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->LIVE_LIST_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getExtension(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;)Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v1, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveListManager"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMixStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;->getTUIVideoView()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, p2, v1, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;->startPreloadVideoStream(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/common/TUIVideoView;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V

    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
.end method

.method public final stopPreviewLiveStream(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "roomId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "<this>"

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->LIVE_LIST_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getExtension(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;)Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v1, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveListManager"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;->stopPreloadVideoStream(Ljava/lang/String;)V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
