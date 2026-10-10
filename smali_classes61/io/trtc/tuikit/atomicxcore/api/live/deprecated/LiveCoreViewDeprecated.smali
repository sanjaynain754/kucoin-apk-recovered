.class public abstract Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008&\u0018\u0000 \u008a\u00012\u00020\u0001:\u0002\u008a\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\r\u001a\u0004\u0018\u00010\u0013H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u0016\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0018H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0019J!\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ!\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0013H\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008\u001f\u0010\u0017J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0007\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020 H\u0007\u00a2\u0006\u0004\u0008%\u0010#J!\u0010\'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020 2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008\'\u0010(J\u0019\u0010)\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008)\u0010\u0017J\u000f\u0010*\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008*\u0010+J\u0019\u0010,\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008,\u0010\u0017J\u000f\u0010-\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008-\u0010+J\u000f\u0010.\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008.\u0010+J1\u00102\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020 2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u00082\u00103J9\u00102\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00105\u001a\u00020 2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u00082\u00106J!\u00107\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u001a2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u00087\u00108J)\u0010:\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00109\u001a\u00020 2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008:\u0010;J!\u0010<\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u001a2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008<\u00108J\u000f\u0010=\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008=\u0010+J)\u0010?\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010>H\u0007\u00a2\u0006\u0004\u0008?\u0010@J!\u0010A\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008A\u00108J)\u0010B\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00109\u001a\u00020 2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008B\u0010;J\u000f\u0010C\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008C\u0010+J7\u0010I\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020D2\u000c\u0010G\u001a\u0008\u0012\u0004\u0012\u00020\u001a0F2\u0006\u00100\u001a\u00020\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010HH\u0007\u00a2\u0006\u0004\u0008I\u0010JJ/\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u001a2\u000c\u0010G\u001a\u0008\u0012\u0004\u0012\u00020\u001a0F2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008L\u0010MJ)\u0010N\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u001a2\u0006\u00109\u001a\u00020 2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008N\u0010;J!\u0010O\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u001a2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008O\u00108J\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020PH\u0007\u00a2\u0006\u0004\u0008R\u0010SJ\u0017\u0010T\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020PH\u0007\u00a2\u0006\u0004\u0008T\u0010SJ\u0017\u0010V\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020UH\u0007\u00a2\u0006\u0004\u0008V\u0010WJ\u0017\u0010X\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020UH\u0007\u00a2\u0006\u0004\u0008X\u0010WJ\'\u0010]\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010[\u001a\u00020 2\u0006\u0010\\\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\u0008]\u0010^J#\u0010b\u001a\u00020\u000e2\u0008\u0010`\u001a\u0004\u0018\u00010_2\u0008\u0010a\u001a\u0004\u0018\u00010_H\u0007\u00a2\u0006\u0004\u0008b\u0010cJ\u0011\u0010e\u001a\u0004\u0018\u00010dH\u0007\u00a2\u0006\u0004\u0008e\u0010fR\"\u0010g\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008g\u0010h\u001a\u0004\u0008i\u0010j\"\u0004\u0008k\u0010lR\"\u0010n\u001a\u00020m8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008n\u0010o\u001a\u0004\u0008p\u0010q\"\u0004\u0008r\u0010sR\u001a\u0010u\u001a\u00020t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008u\u0010v\u001a\u0004\u0008w\u0010xR$\u0010y\u001a\u0004\u0018\u00010_8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008y\u0010z\u001a\u0004\u0008{\u0010|\"\u0004\u0008}\u0010~R&\u0010\u007f\u001a\u0004\u0018\u00010_8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0014\n\u0004\u0008\u007f\u0010z\u001a\u0005\u0008\u0080\u0001\u0010|\"\u0005\u0008\u0081\u0001\u0010~R(\u0010\u0082\u0001\u001a\u00020 8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001\"\u0005\u0008\u0086\u0001\u0010#R(\u0010\u0087\u0001\u001a\u00020 8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0087\u0001\u0010\u0083\u0001\u001a\u0006\u0008\u0088\u0001\u0010\u0085\u0001\"\u0005\u0008\u0089\u0001\u0010#\u00a8\u0006\u008b\u0001"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;",
        "roomInfo",
        "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;",
        "callback",
        "",
        "startLiveStream",
        "(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;",
        "liveInfo",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;",
        "(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V",
        "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
        "stopLiveStream",
        "(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$StopLiveCallback;",
        "(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$StopLiveCallback;)V",
        "",
        "roomId",
        "joinLiveStream",
        "(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V",
        "(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V",
        "leaveLiveStream",
        "",
        "isFront",
        "switchCamera",
        "(Z)V",
        "enable",
        "enableMirror",
        "useFrontCamera",
        "startCamera",
        "(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V",
        "startMicrophone",
        "muteMicrophone",
        "()V",
        "unmuteMicrophone",
        "stopCamera",
        "stopMicrophone",
        "userId",
        "timeout",
        "openCamera",
        "requestIntraRoomConnection",
        "(Ljava/lang/String;IZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V",
        "index",
        "open",
        "(Ljava/lang/String;IIZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V",
        "cancelIntraRoomConnection",
        "(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V",
        "isAccepted",
        "respondIntraRoomConnection",
        "(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V",
        "disconnectUser",
        "terminateIntraRoomConnection",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;",
        "requestCrossRoomConnection",
        "(Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;)V",
        "cancelCrossRoomConnection",
        "respondToCrossRoomConnection",
        "terminateCrossRoomConnection",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;",
        "config",
        "",
        "userIdList",
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleRequestCallback;",
        "requestBattle",
        "(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleRequestCallback;)V",
        "battleId",
        "cancelBattle",
        "(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V",
        "respondToBattle",
        "terminateBattle",
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;",
        "observer",
        "registerConnectionObserver",
        "(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V",
        "unregisterConnectionObserver",
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;",
        "registerBattleObserver",
        "(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;)V",
        "unregisterBattleObserver",
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$LayoutMode;",
        "layoutModel",
        "showEmptySeat",
        "layoutJson",
        "setLayoutMode",
        "(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$LayoutMode;ZLjava/lang/String;)V",
        "Landroid/graphics/Bitmap;",
        "bigBitmap",
        "smallBitmap",
        "setLocalVideoMuteImage",
        "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V",
        "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;",
        "getCoreState",
        "()Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;",
        "liveId",
        "Ljava/lang/String;",
        "getLiveId$atomicxcore_release",
        "()Ljava/lang/String;",
        "setLiveId$atomicxcore_release",
        "(Ljava/lang/String;)V",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;",
        "callbackHandler",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;",
        "getCallbackHandler$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;",
        "setCallbackHandler$atomicxcore_release",
        "(Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;)V",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;",
        "coreStateProvider",
        "Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;",
        "getCoreStateProvider$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;",
        "bigPlaceholderBitmap",
        "Landroid/graphics/Bitmap;",
        "getBigPlaceholderBitmap$atomicxcore_release",
        "()Landroid/graphics/Bitmap;",
        "setBigPlaceholderBitmap$atomicxcore_release",
        "(Landroid/graphics/Bitmap;)V",
        "smallPlaceholderBitmap",
        "getSmallPlaceholderBitmap$atomicxcore_release",
        "setSmallPlaceholderBitmap$atomicxcore_release",
        "coGuestAutoOpenCamera",
        "Z",
        "getCoGuestAutoOpenCamera$atomicxcore_release",
        "()Z",
        "setCoGuestAutoOpenCamera$atomicxcore_release",
        "coGuestAutoOpenMicrophone",
        "getCoGuestAutoOpenMicrophone$atomicxcore_release",
        "setCoGuestAutoOpenMicrophone$atomicxcore_release",
        "Companion",
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
.field public static final Companion:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static coHostTemplateId:I


# instance fields
.field private bigPlaceholderBitmap:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private callbackHandler:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private coGuestAutoOpenCamera:Z

.field private coGuestAutoOpenMicrophone:Z

.field private final coreStateProvider:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private liveId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private smallPlaceholderBitmap:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;

    .line 9
    .line 10
    const/16 v0, 0x258

    .line 11
    .line 12
    sput v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->coHostTemplateId:I

    .line 13
    return-void
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
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
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

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
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

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    const-string p1, ""

    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->liveId:Ljava/lang/String;

    .line 6
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    invoke-direct {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;-><init>()V

    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->callbackHandler:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 7
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    invoke-direct {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;-><init>()V

    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->coreStateProvider:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 8
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->callbackHandler:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    const-string p2, "deprecated"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getCoHostTemplateId$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->coHostTemplateId:I

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

.method public static final synthetic access$setCoHostTemplateId$cp(I)V
    .locals 0

    .line 1
    .line 2
    sput p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->coHostTemplateId:I

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

.method public static final callExperimentalAPI(Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;->callExperimentalAPI(Ljava/lang/String;)V

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
.method public final cancelBattle(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "battleId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "userIdList"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v2, "<this>"

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    move-result v3

    .line 49
    .line 50
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore"

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 63
    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 70
    throw p1

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    move-result-object v3

    .line 75
    .line 76
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 80
    move-result-object v5

    .line 81
    .line 82
    .line 83
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    move-result v3

    .line 85
    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 101
    .line 102
    .line 103
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 104
    throw p1

    .line 105
    .line 106
    .line 107
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 108
    move-result-object v3

    .line 109
    .line 110
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 114
    move-result-object v5

    .line 115
    .line 116
    .line 117
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    move-result v3

    .line 119
    .line 120
    if-eqz v3, :cond_5

    .line 121
    .line 122
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 131
    .line 132
    goto/16 :goto_4

    .line 133
    .line 134
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 135
    .line 136
    .line 137
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 138
    throw p1

    .line 139
    .line 140
    .line 141
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 142
    move-result-object v3

    .line 143
    .line 144
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 148
    move-result-object v5

    .line 149
    .line 150
    .line 151
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    move-result v3

    .line 153
    .line 154
    if-eqz v3, :cond_7

    .line 155
    .line 156
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 157
    .line 158
    .line 159
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 160
    move-result-object v0

    .line 161
    .line 162
    if-eqz v0, :cond_6

    .line 163
    .line 164
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 165
    .line 166
    goto/16 :goto_4

    .line 167
    .line 168
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 169
    .line 170
    .line 171
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 172
    throw p1

    .line 173
    .line 174
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 175
    .line 176
    new-instance v4, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    const-string v5, "getStore "

    .line 179
    .line 180
    .line 181
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    const-string v5, " liveID is empty"

    .line 184
    .line 185
    const-string v6, "message"

    .line 186
    .line 187
    .line 188
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    move-result-object v4

    .line 190
    const/4 v5, 0x1

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 194
    .line 195
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    move-result-object v3

    .line 200
    .line 201
    if-nez v3, :cond_9

    .line 202
    .line 203
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 204
    .line 205
    .line 206
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    if-nez v0, :cond_8

    .line 213
    goto :goto_0

    .line 214
    :cond_8
    move-object v3, v0

    .line 215
    .line 216
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 217
    .line 218
    const-string v0, "getName(...)"

    .line 219
    .line 220
    .line 221
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    move-result-object v0

    .line 223
    .line 224
    .line 225
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    move-result-object v4

    .line 227
    .line 228
    if-nez v4, :cond_13

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 232
    move-result-object v4

    .line 233
    .line 234
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 238
    move-result-object v5

    .line 239
    .line 240
    .line 241
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    move-result v5

    .line 243
    .line 244
    if-eqz v5, :cond_a

    .line 245
    .line 246
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 247
    .line 248
    .line 249
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 250
    :goto_1
    move-object v4, v2

    .line 251
    .line 252
    goto/16 :goto_2

    .line 253
    .line 254
    .line 255
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 256
    move-result-object v2

    .line 257
    .line 258
    .line 259
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    move-result v2

    .line 261
    .line 262
    if-eqz v2, :cond_b

    .line 263
    .line 264
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 265
    .line 266
    .line 267
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 268
    goto :goto_1

    .line 269
    .line 270
    :cond_b
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 274
    move-result-object v2

    .line 275
    .line 276
    .line 277
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    move-result v2

    .line 279
    .line 280
    if-eqz v2, :cond_c

    .line 281
    .line 282
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 283
    .line 284
    .line 285
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 286
    goto :goto_1

    .line 287
    .line 288
    :cond_c
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 292
    move-result-object v2

    .line 293
    .line 294
    .line 295
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    move-result v2

    .line 297
    .line 298
    if-eqz v2, :cond_d

    .line 299
    .line 300
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 301
    .line 302
    .line 303
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 304
    goto :goto_1

    .line 305
    .line 306
    :cond_d
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 310
    move-result-object v2

    .line 311
    .line 312
    .line 313
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 314
    move-result v2

    .line 315
    .line 316
    if-eqz v2, :cond_e

    .line 317
    .line 318
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 319
    .line 320
    .line 321
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 322
    goto :goto_1

    .line 323
    .line 324
    :cond_e
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 328
    move-result-object v2

    .line 329
    .line 330
    .line 331
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    move-result v2

    .line 333
    .line 334
    if-eqz v2, :cond_f

    .line 335
    .line 336
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 337
    .line 338
    .line 339
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 340
    goto :goto_1

    .line 341
    .line 342
    :cond_f
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 346
    move-result-object v2

    .line 347
    .line 348
    .line 349
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    move-result v2

    .line 351
    .line 352
    if-eqz v2, :cond_10

    .line 353
    .line 354
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 355
    .line 356
    .line 357
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 358
    goto :goto_1

    .line 359
    .line 360
    :cond_10
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 364
    move-result-object v2

    .line 365
    .line 366
    .line 367
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    move-result v2

    .line 369
    .line 370
    if-eqz v2, :cond_11

    .line 371
    .line 372
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 373
    .line 374
    .line 375
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 376
    goto :goto_1

    .line 377
    .line 378
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 382
    move-result-object v2

    .line 383
    .line 384
    .line 385
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    move-result v2

    .line 387
    .line 388
    if-eqz v2, :cond_12

    .line 389
    .line 390
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 391
    .line 392
    .line 393
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    goto/16 :goto_1

    .line 396
    .line 397
    .line 398
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    goto :goto_3

    .line 400
    .line 401
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 402
    .line 403
    .line 404
    const-string/jumbo p2, "type is not supported"

    .line 405
    .line 406
    .line 407
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 408
    throw p1

    .line 409
    :cond_13
    :goto_3
    move-object v0, v4

    .line 410
    .line 411
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 412
    .line 413
    :goto_4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/a;

    .line 414
    .line 415
    .line 416
    invoke-direct {v1, p3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/a;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0, p1, p2, v1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->cancelBattleRequest(Ljava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 420
    return-void
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method

.method public final cancelCrossRoomConnection(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

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
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v3

    .line 40
    .line 41
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore"

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    move-result v3

    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 88
    .line 89
    goto/16 :goto_4

    .line 90
    .line 91
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 95
    throw p1

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    move-result-object v3

    .line 100
    .line 101
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 105
    move-result-object v5

    .line 106
    .line 107
    .line 108
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    move-result v3

    .line 110
    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 122
    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 126
    .line 127
    .line 128
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 129
    throw p1

    .line 130
    .line 131
    .line 132
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 133
    move-result-object v3

    .line 134
    .line 135
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 139
    move-result-object v5

    .line 140
    .line 141
    .line 142
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    move-result v3

    .line 144
    .line 145
    if-eqz v3, :cond_7

    .line 146
    .line 147
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 148
    .line 149
    .line 150
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    if-eqz v0, :cond_6

    .line 154
    .line 155
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 156
    .line 157
    goto/16 :goto_4

    .line 158
    .line 159
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 160
    .line 161
    .line 162
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 163
    throw p1

    .line 164
    .line 165
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 166
    .line 167
    new-instance v4, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-string v5, "getStore "

    .line 170
    .line 171
    .line 172
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    const-string v5, " liveID is empty"

    .line 175
    .line 176
    const-string v6, "message"

    .line 177
    .line 178
    .line 179
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    move-result-object v4

    .line 181
    const/4 v5, 0x1

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 185
    .line 186
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    move-result-object v3

    .line 191
    .line 192
    if-nez v3, :cond_9

    .line 193
    .line 194
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 195
    .line 196
    .line 197
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    if-nez v0, :cond_8

    .line 204
    goto :goto_0

    .line 205
    :cond_8
    move-object v3, v0

    .line 206
    .line 207
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 208
    .line 209
    const-string v0, "getName(...)"

    .line 210
    .line 211
    .line 212
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    .line 216
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    move-result-object v4

    .line 218
    .line 219
    if-nez v4, :cond_13

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 223
    move-result-object v4

    .line 224
    .line 225
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 229
    move-result-object v5

    .line 230
    .line 231
    .line 232
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    move-result v5

    .line 234
    .line 235
    if-eqz v5, :cond_a

    .line 236
    .line 237
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 238
    .line 239
    .line 240
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 241
    :goto_1
    move-object v4, v2

    .line 242
    .line 243
    goto/16 :goto_2

    .line 244
    .line 245
    :cond_a
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 249
    move-result-object v5

    .line 250
    .line 251
    .line 252
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    move-result v5

    .line 254
    .line 255
    if-eqz v5, :cond_b

    .line 256
    .line 257
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 258
    .line 259
    .line 260
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 261
    goto :goto_1

    .line 262
    .line 263
    :cond_b
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 267
    move-result-object v5

    .line 268
    .line 269
    .line 270
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    move-result v5

    .line 272
    .line 273
    if-eqz v5, :cond_c

    .line 274
    .line 275
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 276
    .line 277
    .line 278
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 279
    goto :goto_1

    .line 280
    .line 281
    .line 282
    :cond_c
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 283
    move-result-object v2

    .line 284
    .line 285
    .line 286
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    move-result v2

    .line 288
    .line 289
    if-eqz v2, :cond_d

    .line 290
    .line 291
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 292
    .line 293
    .line 294
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 295
    goto :goto_1

    .line 296
    .line 297
    :cond_d
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 301
    move-result-object v2

    .line 302
    .line 303
    .line 304
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    move-result v2

    .line 306
    .line 307
    if-eqz v2, :cond_e

    .line 308
    .line 309
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 310
    .line 311
    .line 312
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 313
    goto :goto_1

    .line 314
    .line 315
    :cond_e
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 319
    move-result-object v2

    .line 320
    .line 321
    .line 322
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 323
    move-result v2

    .line 324
    .line 325
    if-eqz v2, :cond_f

    .line 326
    .line 327
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 328
    .line 329
    .line 330
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 331
    goto :goto_1

    .line 332
    .line 333
    :cond_f
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 337
    move-result-object v2

    .line 338
    .line 339
    .line 340
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    move-result v2

    .line 342
    .line 343
    if-eqz v2, :cond_10

    .line 344
    .line 345
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 346
    .line 347
    .line 348
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 349
    goto :goto_1

    .line 350
    .line 351
    :cond_10
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 355
    move-result-object v2

    .line 356
    .line 357
    .line 358
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    move-result v2

    .line 360
    .line 361
    if-eqz v2, :cond_11

    .line 362
    .line 363
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 364
    .line 365
    .line 366
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 367
    goto :goto_1

    .line 368
    .line 369
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 373
    move-result-object v2

    .line 374
    .line 375
    .line 376
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 377
    move-result v2

    .line 378
    .line 379
    if-eqz v2, :cond_12

    .line 380
    .line 381
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 382
    .line 383
    .line 384
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    goto/16 :goto_1

    .line 387
    .line 388
    .line 389
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    goto :goto_3

    .line 391
    .line 392
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 393
    .line 394
    .line 395
    const-string/jumbo p2, "type is not supported"

    .line 396
    .line 397
    .line 398
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 399
    throw p1

    .line 400
    :cond_13
    :goto_3
    move-object v0, v4

    .line 401
    .line 402
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 403
    .line 404
    :goto_4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/b;

    .line 405
    .line 406
    .line 407
    invoke-direct {v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/b;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, p1, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->cancelHostConnection(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 411
    return-void
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method

.method public final cancelIntraRoomConnection(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userId"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v1, "<this>"

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    const-class v3, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    move-result v2

    .line 41
    .line 42
    const-string v3, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore"

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p1

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    move-result-object v4

    .line 73
    .line 74
    .line 75
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    move-result v2

    .line 77
    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    if-eqz p1, :cond_2

    .line 87
    .line 88
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 89
    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 96
    throw p1

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 106
    move-result-object v4

    .line 107
    .line 108
    .line 109
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    move-result v2

    .line 111
    .line 112
    if-eqz v2, :cond_5

    .line 113
    .line 114
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    if-eqz p1, :cond_4

    .line 121
    .line 122
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 123
    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 127
    .line 128
    .line 129
    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 130
    throw p1

    .line 131
    .line 132
    .line 133
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 134
    move-result-object v2

    .line 135
    .line 136
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 140
    move-result-object v4

    .line 141
    .line 142
    .line 143
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    move-result v2

    .line 145
    .line 146
    if-eqz v2, :cond_7

    .line 147
    .line 148
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 149
    .line 150
    .line 151
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    if-eqz p1, :cond_6

    .line 155
    .line 156
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 157
    .line 158
    goto/16 :goto_4

    .line 159
    .line 160
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 161
    .line 162
    .line 163
    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 164
    throw p1

    .line 165
    .line 166
    :cond_7
    iget-object v2, p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 167
    .line 168
    new-instance v3, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    const-string v4, "getStore "

    .line 171
    .line 172
    .line 173
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    const-string v4, " liveID is empty"

    .line 176
    .line 177
    const-string v5, "message"

    .line 178
    .line 179
    .line 180
    invoke-static {v1, v3, v4, v2, v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    move-result-object v3

    .line 182
    const/4 v4, 0x1

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 186
    .line 187
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    move-result-object v2

    .line 192
    .line 193
    if-nez v2, :cond_9

    .line 194
    .line 195
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 196
    .line 197
    .line 198
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    move-result-object p1

    .line 203
    .line 204
    if-nez p1, :cond_8

    .line 205
    goto :goto_0

    .line 206
    :cond_8
    move-object v2, p1

    .line 207
    .line 208
    :cond_9
    :goto_0
    check-cast v2, Ljava/util/Map;

    .line 209
    .line 210
    const-string p1, "getName(...)"

    .line 211
    .line 212
    .line 213
    invoke-static {v2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    move-result-object p1

    .line 215
    .line 216
    .line 217
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    move-result-object v3

    .line 219
    .line 220
    if-nez v3, :cond_13

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 224
    move-result-object v3

    .line 225
    .line 226
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 230
    move-result-object v4

    .line 231
    .line 232
    .line 233
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    move-result v4

    .line 235
    .line 236
    if-eqz v4, :cond_a

    .line 237
    .line 238
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 239
    .line 240
    .line 241
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 242
    :goto_1
    move-object v3, v1

    .line 243
    .line 244
    goto/16 :goto_2

    .line 245
    .line 246
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 250
    move-result-object v4

    .line 251
    .line 252
    .line 253
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    move-result v4

    .line 255
    .line 256
    if-eqz v4, :cond_b

    .line 257
    .line 258
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 259
    .line 260
    .line 261
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 262
    goto :goto_1

    .line 263
    .line 264
    .line 265
    :cond_b
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 266
    move-result-object v1

    .line 267
    .line 268
    .line 269
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    move-result v1

    .line 271
    .line 272
    if-eqz v1, :cond_c

    .line 273
    .line 274
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 275
    .line 276
    .line 277
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 278
    goto :goto_1

    .line 279
    .line 280
    :cond_c
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 284
    move-result-object v1

    .line 285
    .line 286
    .line 287
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    move-result v1

    .line 289
    .line 290
    if-eqz v1, :cond_d

    .line 291
    .line 292
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 293
    .line 294
    .line 295
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 296
    goto :goto_1

    .line 297
    .line 298
    :cond_d
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 302
    move-result-object v1

    .line 303
    .line 304
    .line 305
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    move-result v1

    .line 307
    .line 308
    if-eqz v1, :cond_e

    .line 309
    .line 310
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 311
    .line 312
    .line 313
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 314
    goto :goto_1

    .line 315
    .line 316
    :cond_e
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 320
    move-result-object v1

    .line 321
    .line 322
    .line 323
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    move-result v1

    .line 325
    .line 326
    if-eqz v1, :cond_f

    .line 327
    .line 328
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 329
    .line 330
    .line 331
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 332
    goto :goto_1

    .line 333
    .line 334
    :cond_f
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 338
    move-result-object v1

    .line 339
    .line 340
    .line 341
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 342
    move-result v1

    .line 343
    .line 344
    if-eqz v1, :cond_10

    .line 345
    .line 346
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 347
    .line 348
    .line 349
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 350
    goto :goto_1

    .line 351
    .line 352
    :cond_10
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 356
    move-result-object v1

    .line 357
    .line 358
    .line 359
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 360
    move-result v1

    .line 361
    .line 362
    if-eqz v1, :cond_11

    .line 363
    .line 364
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 365
    .line 366
    .line 367
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 368
    goto :goto_1

    .line 369
    .line 370
    :cond_11
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 374
    move-result-object v1

    .line 375
    .line 376
    .line 377
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 378
    move-result v1

    .line 379
    .line 380
    if-eqz v1, :cond_12

    .line 381
    .line 382
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 383
    .line 384
    .line 385
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    goto/16 :goto_1

    .line 388
    .line 389
    .line 390
    :goto_2
    invoke-interface {v2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    goto :goto_3

    .line 392
    .line 393
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 394
    .line 395
    .line 396
    const-string/jumbo p2, "type is not supported"

    .line 397
    .line 398
    .line 399
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 400
    throw p1

    .line 401
    :cond_13
    :goto_3
    move-object p1, v3

    .line 402
    .line 403
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 404
    .line 405
    :goto_4
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/c;

    .line 406
    .line 407
    .line 408
    invoke-direct {v0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/c;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->cancelApplication(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 412
    return-void
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method

.method public final disconnectUser(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userId"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v1, "<this>"

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    move-result v3

    .line 41
    .line 42
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore"

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p1

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    move-result-object v3

    .line 67
    .line 68
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    move-result-object v5

    .line 73
    .line 74
    .line 75
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    move-result v3

    .line 77
    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 89
    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 96
    throw p1

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 106
    move-result-object v5

    .line 107
    .line 108
    .line 109
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    move-result v3

    .line 111
    .line 112
    if-eqz v3, :cond_5

    .line 113
    .line 114
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 123
    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 127
    .line 128
    .line 129
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 130
    throw p1

    .line 131
    .line 132
    .line 133
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 134
    move-result-object v3

    .line 135
    .line 136
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 140
    move-result-object v5

    .line 141
    .line 142
    .line 143
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    move-result v3

    .line 145
    .line 146
    if-eqz v3, :cond_7

    .line 147
    .line 148
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 149
    .line 150
    .line 151
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 152
    move-result-object v0

    .line 153
    .line 154
    if-eqz v0, :cond_6

    .line 155
    .line 156
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 157
    .line 158
    goto/16 :goto_4

    .line 159
    .line 160
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 161
    .line 162
    .line 163
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 164
    throw p1

    .line 165
    .line 166
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 167
    .line 168
    new-instance v4, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    const-string v5, "getStore "

    .line 171
    .line 172
    .line 173
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    const-string v5, " liveID is empty"

    .line 176
    .line 177
    const-string v6, "message"

    .line 178
    .line 179
    .line 180
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    move-result-object v4

    .line 182
    const/4 v5, 0x1

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 186
    .line 187
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    move-result-object v3

    .line 192
    .line 193
    if-nez v3, :cond_9

    .line 194
    .line 195
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 196
    .line 197
    .line 198
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    move-result-object v0

    .line 203
    .line 204
    if-nez v0, :cond_8

    .line 205
    goto :goto_0

    .line 206
    :cond_8
    move-object v3, v0

    .line 207
    .line 208
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 209
    .line 210
    const-string v0, "getName(...)"

    .line 211
    .line 212
    .line 213
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    move-result-object v0

    .line 215
    .line 216
    .line 217
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    move-result-object v4

    .line 219
    .line 220
    if-nez v4, :cond_13

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 224
    move-result-object v4

    .line 225
    .line 226
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 230
    move-result-object v5

    .line 231
    .line 232
    .line 233
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    move-result v5

    .line 235
    .line 236
    if-eqz v5, :cond_a

    .line 237
    .line 238
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 239
    .line 240
    .line 241
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 242
    :goto_1
    move-object v4, v2

    .line 243
    .line 244
    goto/16 :goto_2

    .line 245
    .line 246
    :cond_a
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 250
    move-result-object v5

    .line 251
    .line 252
    .line 253
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    move-result v5

    .line 255
    .line 256
    if-eqz v5, :cond_b

    .line 257
    .line 258
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 259
    .line 260
    .line 261
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 262
    goto :goto_1

    .line 263
    .line 264
    :cond_b
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 268
    move-result-object v5

    .line 269
    .line 270
    .line 271
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 272
    move-result v5

    .line 273
    .line 274
    if-eqz v5, :cond_c

    .line 275
    .line 276
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 277
    .line 278
    .line 279
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 280
    goto :goto_1

    .line 281
    .line 282
    :cond_c
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 286
    move-result-object v5

    .line 287
    .line 288
    .line 289
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    move-result v5

    .line 291
    .line 292
    if-eqz v5, :cond_d

    .line 293
    .line 294
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 295
    .line 296
    .line 297
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 298
    goto :goto_1

    .line 299
    .line 300
    :cond_d
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 304
    move-result-object v5

    .line 305
    .line 306
    .line 307
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    move-result v5

    .line 309
    .line 310
    if-eqz v5, :cond_e

    .line 311
    .line 312
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 313
    .line 314
    .line 315
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 316
    goto :goto_1

    .line 317
    .line 318
    :cond_e
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 322
    move-result-object v5

    .line 323
    .line 324
    .line 325
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    move-result v5

    .line 327
    .line 328
    if-eqz v5, :cond_f

    .line 329
    .line 330
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 331
    .line 332
    .line 333
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 334
    goto :goto_1

    .line 335
    .line 336
    :cond_f
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 340
    move-result-object v5

    .line 341
    .line 342
    .line 343
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    move-result v5

    .line 345
    .line 346
    if-eqz v5, :cond_10

    .line 347
    .line 348
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 349
    .line 350
    .line 351
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 352
    goto :goto_1

    .line 353
    .line 354
    .line 355
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 356
    move-result-object v2

    .line 357
    .line 358
    .line 359
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 360
    move-result v2

    .line 361
    .line 362
    if-eqz v2, :cond_11

    .line 363
    .line 364
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 365
    .line 366
    .line 367
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 368
    goto :goto_1

    .line 369
    .line 370
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 374
    move-result-object v2

    .line 375
    .line 376
    .line 377
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 378
    move-result v2

    .line 379
    .line 380
    if-eqz v2, :cond_12

    .line 381
    .line 382
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 383
    .line 384
    .line 385
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    goto/16 :goto_1

    .line 388
    .line 389
    .line 390
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    goto :goto_3

    .line 392
    .line 393
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 394
    .line 395
    .line 396
    const-string/jumbo p2, "type is not supported"

    .line 397
    .line 398
    .line 399
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 400
    throw p1

    .line 401
    :cond_13
    :goto_3
    move-object v0, v4

    .line 402
    .line 403
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 404
    .line 405
    :goto_4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/d;

    .line 406
    .line 407
    .line 408
    invoke-direct {v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/d;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0, p1, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->kickUserOutOfSeat(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 412
    return-void
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method

.method public final enableMirror(Z)V
    .locals 7
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore"

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p1

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v3

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 87
    throw p1

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    move-result v3

    .line 100
    .line 101
    if-eqz v3, :cond_5

    .line 102
    .line 103
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 114
    .line 115
    .line 116
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 117
    throw p1

    .line 118
    .line 119
    .line 120
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    move-result-object v5

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    move-result v3

    .line 132
    .line 133
    if-eqz v3, :cond_7

    .line 134
    .line 135
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 144
    .line 145
    goto/16 :goto_4

    .line 146
    .line 147
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 148
    .line 149
    .line 150
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 151
    throw p1

    .line 152
    .line 153
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 154
    .line 155
    new-instance v4, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v5, "getStore "

    .line 158
    .line 159
    .line 160
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    const-string v5, " liveID is empty"

    .line 163
    .line 164
    const-string v6, "message"

    .line 165
    .line 166
    .line 167
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    move-result-object v4

    .line 169
    const/4 v5, 0x1

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 173
    .line 174
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    move-result-object v3

    .line 179
    .line 180
    if-nez v3, :cond_9

    .line 181
    .line 182
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 183
    .line 184
    .line 185
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    if-nez v0, :cond_8

    .line 192
    goto :goto_0

    .line 193
    :cond_8
    move-object v3, v0

    .line 194
    .line 195
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 196
    .line 197
    const-string v0, "getName(...)"

    .line 198
    .line 199
    .line 200
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    .line 204
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    move-result-object v4

    .line 206
    .line 207
    if-nez v4, :cond_13

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 211
    move-result-object v2

    .line 212
    .line 213
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 217
    move-result-object v4

    .line 218
    .line 219
    .line 220
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    move-result v4

    .line 222
    .line 223
    if-eqz v4, :cond_a

    .line 224
    .line 225
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 226
    .line 227
    .line 228
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 229
    :goto_1
    move-object v4, v2

    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 237
    move-result-object v4

    .line 238
    .line 239
    .line 240
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    move-result v4

    .line 242
    .line 243
    if-eqz v4, :cond_b

    .line 244
    .line 245
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 246
    .line 247
    .line 248
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 249
    goto :goto_1

    .line 250
    .line 251
    :cond_b
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 255
    move-result-object v4

    .line 256
    .line 257
    .line 258
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    move-result v4

    .line 260
    .line 261
    if-eqz v4, :cond_c

    .line 262
    .line 263
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 264
    .line 265
    .line 266
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 267
    goto :goto_1

    .line 268
    .line 269
    :cond_c
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 273
    move-result-object v4

    .line 274
    .line 275
    .line 276
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    move-result v4

    .line 278
    .line 279
    if-eqz v4, :cond_d

    .line 280
    .line 281
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 282
    .line 283
    .line 284
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 285
    goto :goto_1

    .line 286
    .line 287
    :cond_d
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 291
    move-result-object v4

    .line 292
    .line 293
    .line 294
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    move-result v4

    .line 296
    .line 297
    if-eqz v4, :cond_e

    .line 298
    .line 299
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 300
    .line 301
    .line 302
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 303
    goto :goto_1

    .line 304
    .line 305
    :cond_e
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 309
    move-result-object v4

    .line 310
    .line 311
    .line 312
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    move-result v4

    .line 314
    .line 315
    if-eqz v4, :cond_f

    .line 316
    .line 317
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 318
    .line 319
    .line 320
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 321
    goto :goto_1

    .line 322
    .line 323
    :cond_f
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 327
    move-result-object v4

    .line 328
    .line 329
    .line 330
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    move-result v4

    .line 332
    .line 333
    if-eqz v4, :cond_10

    .line 334
    .line 335
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 336
    .line 337
    .line 338
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 339
    goto :goto_1

    .line 340
    .line 341
    :cond_10
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 345
    move-result-object v4

    .line 346
    .line 347
    .line 348
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    move-result v4

    .line 350
    .line 351
    if-eqz v4, :cond_11

    .line 352
    .line 353
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 354
    .line 355
    .line 356
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    goto/16 :goto_1

    .line 359
    .line 360
    :cond_11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 364
    move-result-object v4

    .line 365
    .line 366
    .line 367
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    move-result v2

    .line 369
    .line 370
    if-eqz v2, :cond_12

    .line 371
    .line 372
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 373
    .line 374
    .line 375
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    .line 380
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    goto :goto_3

    .line 382
    .line 383
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 384
    .line 385
    .line 386
    const-string/jumbo v0, "type is not supported"

    .line 387
    .line 388
    .line 389
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 390
    throw p1

    .line 391
    :cond_13
    :goto_3
    move-object v0, v4

    .line 392
    .line 393
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 394
    .line 395
    :goto_4
    if-eqz p1, :cond_14

    .line 396
    .line 397
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;->ENABLE:Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;

    .line 398
    goto :goto_5

    .line 399
    .line 400
    :cond_14
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;->DISABLE:Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;

    .line 401
    .line 402
    .line 403
    :goto_5
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->switchMirror(Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;)V

    .line 404
    return-void
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
.end method

.method public final getBigPlaceholderBitmap$atomicxcore_release()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->bigPlaceholderBitmap:Landroid/graphics/Bitmap;

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

.method public final getCallbackHandler$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->callbackHandler:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

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

.method public final getCoGuestAutoOpenCamera$atomicxcore_release()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->coGuestAutoOpenCamera:Z

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

.method public final getCoGuestAutoOpenMicrophone$atomicxcore_release()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->coGuestAutoOpenMicrophone:Z

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

.method public final getCoreState()Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->coreStateProvider:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 3
    .line 4
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 5
    return-object v0
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

.method public final getCoreStateProvider$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->coreStateProvider:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

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

.method public final getLiveId$atomicxcore_release()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->liveId:Ljava/lang/String;

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

.method public final getSmallPlaceholderBitmap$atomicxcore_release()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->smallPlaceholderBitmap:Landroid/graphics/Bitmap;

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

.method public final joinLiveStream(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    const-string v0, "roomId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/z;->a(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V

    return-void
.end method

.method public final joinLiveStream(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    const-string v0, "roomId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/e;

    invoke-direct {v0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/e;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    invoke-static {p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/z;->a(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V

    return-void
.end method

.method public final leaveLiveStream(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 8
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

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
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCallbackHandler$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoreStateProvider$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->c:Lkotlinx/coroutines/x1;

    .line 23
    const/4 v1, 0x0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    goto :goto_0

    .line 27
    .line 28
    .line 29
    :cond_0
    const-string/jumbo v0, "subscribeAfterEnterRoomState"

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 33
    move-object v0, v1

    .line 34
    :goto_0
    const/4 v2, 0x1

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 38
    .line 39
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    const-class v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    move-result-object v4

    .line 54
    .line 55
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    move-result-object v5

    .line 60
    .line 61
    .line 62
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    move-result v4

    .line 64
    .line 65
    const-string v5, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore"

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 82
    .line 83
    .line 84
    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 85
    throw p1

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 89
    move-result-object v4

    .line 90
    .line 91
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    move-result-object v6

    .line 96
    .line 97
    .line 98
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    move-result v4

    .line 100
    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 112
    .line 113
    goto/16 :goto_5

    .line 114
    .line 115
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 116
    .line 117
    .line 118
    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 119
    throw p1

    .line 120
    .line 121
    .line 122
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 123
    move-result-object v4

    .line 124
    .line 125
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 129
    move-result-object v6

    .line 130
    .line 131
    .line 132
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    move-result v4

    .line 134
    .line 135
    if-eqz v4, :cond_6

    .line 136
    .line 137
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 138
    .line 139
    .line 140
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 146
    .line 147
    goto/16 :goto_5

    .line 148
    .line 149
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 150
    .line 151
    .line 152
    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 153
    throw p1

    .line 154
    .line 155
    .line 156
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 157
    move-result-object v4

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 161
    move-result-object v6

    .line 162
    .line 163
    .line 164
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    move-result v4

    .line 166
    .line 167
    if-eqz v4, :cond_8

    .line 168
    .line 169
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 170
    .line 171
    .line 172
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 173
    move-result-object v0

    .line 174
    .line 175
    if-eqz v0, :cond_7

    .line 176
    .line 177
    goto/16 :goto_5

    .line 178
    .line 179
    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    .line 180
    .line 181
    .line 182
    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 183
    throw p1

    .line 184
    .line 185
    :cond_8
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 186
    .line 187
    new-instance v5, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-string v6, "getStore "

    .line 190
    .line 191
    .line 192
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    const-string v6, " liveID is empty"

    .line 195
    .line 196
    const-string v7, "message"

    .line 197
    .line 198
    .line 199
    invoke-static {v3, v5, v6, v4, v7}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    move-result-object v5

    .line 201
    .line 202
    .line 203
    invoke-virtual {v4, v2, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 204
    .line 205
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    move-result-object v2

    .line 210
    .line 211
    if-nez v2, :cond_a

    .line 212
    .line 213
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 214
    .line 215
    .line 216
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    move-result-object v0

    .line 221
    .line 222
    if-nez v0, :cond_9

    .line 223
    goto :goto_1

    .line 224
    :cond_9
    move-object v2, v0

    .line 225
    .line 226
    :cond_a
    :goto_1
    check-cast v2, Ljava/util/Map;

    .line 227
    .line 228
    const-string v0, "getName(...)"

    .line 229
    .line 230
    .line 231
    invoke-static {v2, v3, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    move-result-object v0

    .line 233
    .line 234
    .line 235
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    move-result-object v4

    .line 237
    .line 238
    if-nez v4, :cond_14

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 242
    move-result-object v3

    .line 243
    .line 244
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 248
    move-result-object v4

    .line 249
    .line 250
    .line 251
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    move-result v4

    .line 253
    .line 254
    if-eqz v4, :cond_b

    .line 255
    .line 256
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 257
    .line 258
    .line 259
    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 260
    :goto_2
    move-object v4, v3

    .line 261
    .line 262
    goto/16 :goto_3

    .line 263
    .line 264
    :cond_b
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 268
    move-result-object v4

    .line 269
    .line 270
    .line 271
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 272
    move-result v4

    .line 273
    .line 274
    if-eqz v4, :cond_c

    .line 275
    .line 276
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 277
    .line 278
    .line 279
    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 280
    goto :goto_2

    .line 281
    .line 282
    :cond_c
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 286
    move-result-object v4

    .line 287
    .line 288
    .line 289
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    move-result v4

    .line 291
    .line 292
    if-eqz v4, :cond_d

    .line 293
    .line 294
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 295
    .line 296
    .line 297
    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 298
    goto :goto_2

    .line 299
    .line 300
    :cond_d
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 304
    move-result-object v4

    .line 305
    .line 306
    .line 307
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    move-result v4

    .line 309
    .line 310
    if-eqz v4, :cond_e

    .line 311
    .line 312
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 313
    .line 314
    .line 315
    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 316
    goto :goto_2

    .line 317
    .line 318
    :cond_e
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 322
    move-result-object v4

    .line 323
    .line 324
    .line 325
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    move-result v4

    .line 327
    .line 328
    if-eqz v4, :cond_f

    .line 329
    .line 330
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 331
    .line 332
    .line 333
    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 334
    goto :goto_2

    .line 335
    .line 336
    :cond_f
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 340
    move-result-object v4

    .line 341
    .line 342
    .line 343
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    move-result v4

    .line 345
    .line 346
    if-eqz v4, :cond_10

    .line 347
    .line 348
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 349
    .line 350
    .line 351
    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 352
    goto :goto_2

    .line 353
    .line 354
    :cond_10
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 358
    move-result-object v4

    .line 359
    .line 360
    .line 361
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 362
    move-result v4

    .line 363
    .line 364
    if-eqz v4, :cond_11

    .line 365
    .line 366
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 367
    .line 368
    .line 369
    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 370
    goto :goto_2

    .line 371
    .line 372
    :cond_11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 376
    move-result-object v4

    .line 377
    .line 378
    .line 379
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    move-result v4

    .line 381
    .line 382
    if-eqz v4, :cond_12

    .line 383
    .line 384
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 385
    .line 386
    .line 387
    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    goto/16 :goto_2

    .line 390
    .line 391
    :cond_12
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 395
    move-result-object v4

    .line 396
    .line 397
    .line 398
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    move-result v3

    .line 400
    .line 401
    if-eqz v3, :cond_13

    .line 402
    .line 403
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 404
    .line 405
    .line 406
    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    goto/16 :goto_2

    .line 409
    .line 410
    .line 411
    :goto_3
    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    goto :goto_4

    .line 413
    .line 414
    :cond_13
    new-instance p1, Ljava/lang/Exception;

    .line 415
    .line 416
    .line 417
    const-string/jumbo v0, "type is not supported"

    .line 418
    .line 419
    .line 420
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 421
    throw p1

    .line 422
    :cond_14
    :goto_4
    move-object v0, v4

    .line 423
    .line 424
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 425
    :goto_5
    move-object v1, p0

    .line 426
    .line 427
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 428
    .line 429
    .line 430
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBattleWidgetsLayerLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;

    .line 434
    move-result-object v1

    .line 435
    .line 436
    .line 437
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 438
    .line 439
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/g;

    .line 440
    .line 441
    .line 442
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/g;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->leaveLive(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 446
    return-void
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
.end method

.method public final muteMicrophone()V
    .locals 7
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore"

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    throw v0

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v3

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 87
    throw v0

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    move-result-object v5

    .line 98
    .line 99
    .line 100
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    move-result v3

    .line 102
    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 114
    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 118
    .line 119
    .line 120
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 121
    throw v0

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 125
    move-result-object v3

    .line 126
    .line 127
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 131
    move-result-object v5

    .line 132
    .line 133
    .line 134
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    move-result v3

    .line 136
    .line 137
    if-eqz v3, :cond_7

    .line 138
    .line 139
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 148
    .line 149
    goto/16 :goto_4

    .line 150
    .line 151
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 155
    throw v0

    .line 156
    .line 157
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 158
    .line 159
    new-instance v4, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v5, "getStore "

    .line 162
    .line 163
    .line 164
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    const-string v5, " liveID is empty"

    .line 167
    .line 168
    const-string v6, "message"

    .line 169
    .line 170
    .line 171
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    move-result-object v4

    .line 173
    const/4 v5, 0x1

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 177
    .line 178
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    move-result-object v3

    .line 183
    .line 184
    if-nez v3, :cond_9

    .line 185
    .line 186
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 187
    .line 188
    .line 189
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    if-nez v0, :cond_8

    .line 196
    goto :goto_0

    .line 197
    :cond_8
    move-object v3, v0

    .line 198
    .line 199
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 200
    .line 201
    const-string v0, "getName(...)"

    .line 202
    .line 203
    .line 204
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    move-result-object v0

    .line 206
    .line 207
    .line 208
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    move-result-object v4

    .line 210
    .line 211
    if-nez v4, :cond_13

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 215
    move-result-object v4

    .line 216
    .line 217
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 221
    move-result-object v5

    .line 222
    .line 223
    .line 224
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    move-result v5

    .line 226
    .line 227
    if-eqz v5, :cond_a

    .line 228
    .line 229
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 230
    .line 231
    .line 232
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 233
    :goto_1
    move-object v4, v2

    .line 234
    .line 235
    goto/16 :goto_2

    .line 236
    .line 237
    :cond_a
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 241
    move-result-object v5

    .line 242
    .line 243
    .line 244
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    move-result v5

    .line 246
    .line 247
    if-eqz v5, :cond_b

    .line 248
    .line 249
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 250
    .line 251
    .line 252
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 253
    goto :goto_1

    .line 254
    .line 255
    :cond_b
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 259
    move-result-object v5

    .line 260
    .line 261
    .line 262
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 263
    move-result v5

    .line 264
    .line 265
    if-eqz v5, :cond_c

    .line 266
    .line 267
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 268
    .line 269
    .line 270
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 271
    goto :goto_1

    .line 272
    .line 273
    :cond_c
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 277
    move-result-object v5

    .line 278
    .line 279
    .line 280
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    move-result v5

    .line 282
    .line 283
    if-eqz v5, :cond_d

    .line 284
    .line 285
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 286
    .line 287
    .line 288
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 289
    goto :goto_1

    .line 290
    .line 291
    :cond_d
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 295
    move-result-object v5

    .line 296
    .line 297
    .line 298
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    move-result v5

    .line 300
    .line 301
    if-eqz v5, :cond_e

    .line 302
    .line 303
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 304
    .line 305
    .line 306
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 307
    goto :goto_1

    .line 308
    .line 309
    :cond_e
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 313
    move-result-object v5

    .line 314
    .line 315
    .line 316
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 317
    move-result v5

    .line 318
    .line 319
    if-eqz v5, :cond_f

    .line 320
    .line 321
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 322
    .line 323
    .line 324
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 325
    goto :goto_1

    .line 326
    .line 327
    :cond_f
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 331
    move-result-object v5

    .line 332
    .line 333
    .line 334
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 335
    move-result v5

    .line 336
    .line 337
    if-eqz v5, :cond_10

    .line 338
    .line 339
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 340
    .line 341
    .line 342
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 343
    goto :goto_1

    .line 344
    .line 345
    .line 346
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 347
    move-result-object v2

    .line 348
    .line 349
    .line 350
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 351
    move-result v2

    .line 352
    .line 353
    if-eqz v2, :cond_11

    .line 354
    .line 355
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 356
    .line 357
    .line 358
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 359
    goto :goto_1

    .line 360
    .line 361
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 365
    move-result-object v2

    .line 366
    .line 367
    .line 368
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    move-result v2

    .line 370
    .line 371
    if-eqz v2, :cond_12

    .line 372
    .line 373
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 374
    .line 375
    .line 376
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    goto/16 :goto_1

    .line 379
    .line 380
    .line 381
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    goto :goto_3

    .line 383
    .line 384
    :cond_12
    new-instance v0, Ljava/lang/Exception;

    .line 385
    .line 386
    .line 387
    const-string/jumbo v1, "type is not supported"

    .line 388
    .line 389
    .line 390
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 391
    throw v0

    .line 392
    :cond_13
    :goto_3
    move-object v0, v4

    .line 393
    .line 394
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 395
    .line 396
    .line 397
    :goto_4
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->muteMicrophone()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoreStateProvider$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 401
    move-result-object v0

    .line 402
    .line 403
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 404
    .line 405
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->mediaState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$MediaState;

    .line 406
    .line 407
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$MediaState;->isMicrophoneMuted:Landroidx/lifecycle/LiveData;

    .line 408
    .line 409
    const-string v1, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>"

    .line 410
    .line 411
    .line 412
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 413
    .line 414
    check-cast v0, Landroidx/lifecycle/MutableLiveData;

    .line 415
    .line 416
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 420
    return-void
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

.method public final registerBattleObserver(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;)V
    .locals 2
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "observer"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->callbackHandler:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    iget-object v0, v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final registerConnectionObserver(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 2
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "observer"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->callbackHandler:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    iget-object v0, v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final requestBattle(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleRequestCallback;)V
    .locals 7
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleRequestCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleRequestCallback;",
            ")V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "userIdList"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v2, "<this>"

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    move-result v3

    .line 49
    .line 50
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore"

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 63
    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 70
    throw p1

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    move-result-object v3

    .line 75
    .line 76
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 80
    move-result-object v5

    .line 81
    .line 82
    .line 83
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    move-result v3

    .line 85
    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 101
    .line 102
    .line 103
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 104
    throw p1

    .line 105
    .line 106
    .line 107
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 108
    move-result-object v3

    .line 109
    .line 110
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 114
    move-result-object v5

    .line 115
    .line 116
    .line 117
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    move-result v3

    .line 119
    .line 120
    if-eqz v3, :cond_5

    .line 121
    .line 122
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 131
    .line 132
    goto/16 :goto_4

    .line 133
    .line 134
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 135
    .line 136
    .line 137
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 138
    throw p1

    .line 139
    .line 140
    .line 141
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 142
    move-result-object v3

    .line 143
    .line 144
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 148
    move-result-object v5

    .line 149
    .line 150
    .line 151
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    move-result v3

    .line 153
    .line 154
    if-eqz v3, :cond_7

    .line 155
    .line 156
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 157
    .line 158
    .line 159
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 160
    move-result-object v0

    .line 161
    .line 162
    if-eqz v0, :cond_6

    .line 163
    .line 164
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 165
    .line 166
    goto/16 :goto_4

    .line 167
    .line 168
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 169
    .line 170
    .line 171
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 172
    throw p1

    .line 173
    .line 174
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 175
    .line 176
    new-instance v4, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    const-string v5, "getStore "

    .line 179
    .line 180
    .line 181
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    const-string v5, " liveID is empty"

    .line 184
    .line 185
    const-string v6, "message"

    .line 186
    .line 187
    .line 188
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    move-result-object v4

    .line 190
    const/4 v5, 0x1

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 194
    .line 195
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    move-result-object v3

    .line 200
    .line 201
    if-nez v3, :cond_9

    .line 202
    .line 203
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 204
    .line 205
    .line 206
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    if-nez v0, :cond_8

    .line 213
    goto :goto_0

    .line 214
    :cond_8
    move-object v3, v0

    .line 215
    .line 216
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 217
    .line 218
    const-string v0, "getName(...)"

    .line 219
    .line 220
    .line 221
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    move-result-object v0

    .line 223
    .line 224
    .line 225
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    move-result-object v4

    .line 227
    .line 228
    if-nez v4, :cond_13

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 232
    move-result-object v4

    .line 233
    .line 234
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 238
    move-result-object v5

    .line 239
    .line 240
    .line 241
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    move-result v5

    .line 243
    .line 244
    if-eqz v5, :cond_a

    .line 245
    .line 246
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 247
    .line 248
    .line 249
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 250
    :goto_1
    move-object v4, v2

    .line 251
    .line 252
    goto/16 :goto_2

    .line 253
    .line 254
    .line 255
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 256
    move-result-object v2

    .line 257
    .line 258
    .line 259
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    move-result v2

    .line 261
    .line 262
    if-eqz v2, :cond_b

    .line 263
    .line 264
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 265
    .line 266
    .line 267
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 268
    goto :goto_1

    .line 269
    .line 270
    :cond_b
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 274
    move-result-object v2

    .line 275
    .line 276
    .line 277
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    move-result v2

    .line 279
    .line 280
    if-eqz v2, :cond_c

    .line 281
    .line 282
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 283
    .line 284
    .line 285
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 286
    goto :goto_1

    .line 287
    .line 288
    :cond_c
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 292
    move-result-object v2

    .line 293
    .line 294
    .line 295
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    move-result v2

    .line 297
    .line 298
    if-eqz v2, :cond_d

    .line 299
    .line 300
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 301
    .line 302
    .line 303
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 304
    goto :goto_1

    .line 305
    .line 306
    :cond_d
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 310
    move-result-object v2

    .line 311
    .line 312
    .line 313
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 314
    move-result v2

    .line 315
    .line 316
    if-eqz v2, :cond_e

    .line 317
    .line 318
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 319
    .line 320
    .line 321
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 322
    goto :goto_1

    .line 323
    .line 324
    :cond_e
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 328
    move-result-object v2

    .line 329
    .line 330
    .line 331
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    move-result v2

    .line 333
    .line 334
    if-eqz v2, :cond_f

    .line 335
    .line 336
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 337
    .line 338
    .line 339
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 340
    goto :goto_1

    .line 341
    .line 342
    :cond_f
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 346
    move-result-object v2

    .line 347
    .line 348
    .line 349
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    move-result v2

    .line 351
    .line 352
    if-eqz v2, :cond_10

    .line 353
    .line 354
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 355
    .line 356
    .line 357
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 358
    goto :goto_1

    .line 359
    .line 360
    :cond_10
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 364
    move-result-object v2

    .line 365
    .line 366
    .line 367
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    move-result v2

    .line 369
    .line 370
    if-eqz v2, :cond_11

    .line 371
    .line 372
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 373
    .line 374
    .line 375
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 376
    goto :goto_1

    .line 377
    .line 378
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 382
    move-result-object v2

    .line 383
    .line 384
    .line 385
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    move-result v2

    .line 387
    .line 388
    if-eqz v2, :cond_12

    .line 389
    .line 390
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 391
    .line 392
    .line 393
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    goto/16 :goto_1

    .line 396
    .line 397
    .line 398
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    goto :goto_3

    .line 400
    .line 401
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 402
    .line 403
    .line 404
    const-string/jumbo p2, "type is not supported"

    .line 405
    .line 406
    .line 407
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 408
    throw p1

    .line 409
    :cond_13
    :goto_3
    move-object v0, v4

    .line 410
    .line 411
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 412
    .line 413
    :goto_4
    const-string v1, "battleConfig"

    .line 414
    .line 415
    .line 416
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 417
    .line 418
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;

    .line 419
    .line 420
    iget v2, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->duration:I

    .line 421
    .line 422
    iget-boolean v3, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->needResponse:Z

    .line 423
    .line 424
    iget-object p1, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->extensionInfo:Ljava/lang/String;

    .line 425
    .line 426
    const-string v4, "extensionInfo"

    .line 427
    .line 428
    .line 429
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    invoke-direct {v1, v2, v3, p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;-><init>(IZLjava/lang/String;)V

    .line 433
    .line 434
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/h;

    .line 435
    .line 436
    .line 437
    invoke-direct {p1, p4}, Lio/trtc/tuikit/atomicxcore/impl/view/live/h;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleRequestCallback;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v1, p2, p3, p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->requestBattle(Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;)V

    .line 441
    return-void
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
.end method

.method public final requestCrossRoomConnection(Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;)V
    .locals 25
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p1

    .line 3
    .line 4
    move-object/from16 v0, p3

    .line 5
    .line 6
    const-string v2, "roomId"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v3, "<this>"

    .line 12
    .line 13
    move-object/from16 v6, p0

    .line 14
    .line 15
    .line 16
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    const-class v7, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    move-result-object v8

    .line 42
    .line 43
    .line 44
    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    move-result v5

    .line 46
    .line 47
    .line 48
    const-string/jumbo v8, "type is not supported"

    .line 49
    .line 50
    const-class v9, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 51
    .line 52
    const-class v10, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 53
    .line 54
    const-class v11, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 55
    .line 56
    const-class v12, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 57
    .line 58
    const-class v13, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 59
    .line 60
    const-class v14, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 61
    .line 62
    const-class v15, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 63
    .line 64
    move/from16 v16, v5

    .line 65
    .line 66
    const-string v5, "getName(...)"

    .line 67
    .line 68
    const-string v6, "message"

    .line 69
    .line 70
    move-object/from16 v17, v7

    .line 71
    .line 72
    const-string v7, " liveID is empty"

    .line 73
    .line 74
    move-object/from16 v18, v9

    .line 75
    .line 76
    const-string v9, "getStore "

    .line 77
    .line 78
    const-class v19, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 79
    .line 80
    const-class v20, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 81
    .line 82
    const-class v21, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 83
    .line 84
    move-object/from16 v22, v10

    .line 85
    .line 86
    const-string v10, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore"

    .line 87
    .line 88
    move-object/from16 v23, v11

    .line 89
    .line 90
    const-class v11, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 91
    .line 92
    if-eqz v16, :cond_1

    .line 93
    .line 94
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 98
    move-result-object v2

    .line 99
    .line 100
    if-eqz v2, :cond_0

    .line 101
    .line 102
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 103
    .line 104
    move-object/from16 v16, v12

    .line 105
    .line 106
    move-object/from16 v24, v13

    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 111
    .line 112
    .line 113
    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 114
    throw v0

    .line 115
    .line 116
    :cond_1
    move-object/from16 v16, v12

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    move-result-object v12

    .line 121
    .line 122
    move-object/from16 v24, v13

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 126
    move-result-object v13

    .line 127
    .line 128
    .line 129
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    move-result v12

    .line 131
    .line 132
    if-eqz v12, :cond_3

    .line 133
    .line 134
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 135
    .line 136
    .line 137
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 138
    move-result-object v2

    .line 139
    .line 140
    if-eqz v2, :cond_2

    .line 141
    .line 142
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 143
    .line 144
    goto/16 :goto_3

    .line 145
    .line 146
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 147
    .line 148
    .line 149
    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 150
    throw v0

    .line 151
    .line 152
    .line 153
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 154
    move-result-object v12

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 158
    move-result-object v13

    .line 159
    .line 160
    .line 161
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    move-result v12

    .line 163
    .line 164
    if-eqz v12, :cond_5

    .line 165
    .line 166
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 167
    .line 168
    .line 169
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 170
    move-result-object v2

    .line 171
    .line 172
    if-eqz v2, :cond_4

    .line 173
    .line 174
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 175
    .line 176
    goto/16 :goto_3

    .line 177
    .line 178
    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 179
    .line 180
    .line 181
    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 182
    throw v0

    .line 183
    .line 184
    .line 185
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 186
    move-result-object v12

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 190
    move-result-object v13

    .line 191
    .line 192
    .line 193
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    move-result v12

    .line 195
    .line 196
    if-eqz v12, :cond_7

    .line 197
    .line 198
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 199
    .line 200
    .line 201
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 202
    move-result-object v2

    .line 203
    .line 204
    if-eqz v2, :cond_6

    .line 205
    .line 206
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 207
    .line 208
    goto/16 :goto_3

    .line 209
    .line 210
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 211
    .line 212
    .line 213
    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 214
    throw v0

    .line 215
    .line 216
    :cond_7
    iget-object v10, v2, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 217
    .line 218
    new-instance v12, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-direct {v12, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v4, v12, v7, v10, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    move-result-object v12

    .line 226
    const/4 v13, 0x1

    .line 227
    .line 228
    .line 229
    invoke-virtual {v10, v13, v12}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 230
    .line 231
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    move-result-object v10

    .line 236
    .line 237
    if-nez v10, :cond_9

    .line 238
    .line 239
    new-instance v10, Ljava/util/concurrent/ConcurrentHashMap;

    .line 240
    .line 241
    .line 242
    invoke-direct {v10}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v3, v10}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    move-result-object v2

    .line 247
    .line 248
    if-nez v2, :cond_8

    .line 249
    goto :goto_0

    .line 250
    :cond_8
    move-object v10, v2

    .line 251
    .line 252
    :cond_9
    :goto_0
    check-cast v10, Ljava/util/Map;

    .line 253
    .line 254
    .line 255
    invoke-static {v10, v4, v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    move-result-object v2

    .line 257
    .line 258
    .line 259
    invoke-interface {v10, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    move-result-object v12

    .line 261
    .line 262
    if-nez v12, :cond_13

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 266
    move-result-object v12

    .line 267
    .line 268
    .line 269
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 270
    move-result-object v13

    .line 271
    .line 272
    .line 273
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    move-result v13

    .line 275
    .line 276
    if-eqz v13, :cond_a

    .line 277
    .line 278
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 279
    .line 280
    .line 281
    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    goto/16 :goto_1

    .line 284
    .line 285
    .line 286
    :cond_a
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 287
    move-result-object v13

    .line 288
    .line 289
    .line 290
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 291
    move-result v13

    .line 292
    .line 293
    if-eqz v13, :cond_b

    .line 294
    .line 295
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 296
    .line 297
    .line 298
    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    goto/16 :goto_1

    .line 301
    .line 302
    .line 303
    :cond_b
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 304
    move-result-object v13

    .line 305
    .line 306
    .line 307
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    move-result v13

    .line 309
    .line 310
    if-eqz v13, :cond_c

    .line 311
    .line 312
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 313
    .line 314
    .line 315
    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 316
    goto :goto_1

    .line 317
    .line 318
    .line 319
    :cond_c
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 320
    move-result-object v13

    .line 321
    .line 322
    .line 323
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    move-result v13

    .line 325
    .line 326
    if-eqz v13, :cond_d

    .line 327
    .line 328
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 329
    .line 330
    .line 331
    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 332
    goto :goto_1

    .line 333
    .line 334
    .line 335
    :cond_d
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 336
    move-result-object v13

    .line 337
    .line 338
    .line 339
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 340
    move-result v13

    .line 341
    .line 342
    if-eqz v13, :cond_e

    .line 343
    .line 344
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 345
    .line 346
    .line 347
    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 348
    goto :goto_1

    .line 349
    .line 350
    .line 351
    :cond_e
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 352
    move-result-object v13

    .line 353
    .line 354
    .line 355
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    move-result v13

    .line 357
    .line 358
    if-eqz v13, :cond_f

    .line 359
    .line 360
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 361
    .line 362
    .line 363
    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 364
    goto :goto_1

    .line 365
    .line 366
    .line 367
    :cond_f
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 368
    move-result-object v13

    .line 369
    .line 370
    .line 371
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 372
    move-result v13

    .line 373
    .line 374
    if-eqz v13, :cond_10

    .line 375
    .line 376
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 377
    .line 378
    .line 379
    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 380
    goto :goto_1

    .line 381
    .line 382
    .line 383
    :cond_10
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 384
    move-result-object v13

    .line 385
    .line 386
    .line 387
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    move-result v13

    .line 389
    .line 390
    if-eqz v13, :cond_11

    .line 391
    .line 392
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 393
    .line 394
    .line 395
    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 396
    goto :goto_1

    .line 397
    .line 398
    .line 399
    :cond_11
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 400
    move-result-object v13

    .line 401
    .line 402
    .line 403
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    move-result v12

    .line 405
    .line 406
    if-eqz v12, :cond_12

    .line 407
    .line 408
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 409
    .line 410
    .line 411
    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    :goto_1
    invoke-interface {v10, v2, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    goto :goto_2

    .line 416
    .line 417
    :cond_12
    new-instance v0, Ljava/lang/Exception;

    .line 418
    .line 419
    .line 420
    invoke-direct {v0, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 421
    throw v0

    .line 422
    :cond_13
    :goto_2
    move-object v2, v12

    .line 423
    .line 424
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 425
    .line 426
    .line 427
    :goto_3
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 428
    move-result-object v3

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getApplicants()Lkotlinx/coroutines/flow/w;

    .line 432
    move-result-object v3

    .line 433
    .line 434
    .line 435
    invoke-interface {v3}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 436
    move-result-object v3

    .line 437
    .line 438
    check-cast v3, Ljava/util/Collection;

    .line 439
    .line 440
    .line 441
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 442
    move-result v3

    .line 443
    .line 444
    if-eqz v3, :cond_2a

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 448
    move-result-object v3

    .line 449
    .line 450
    .line 451
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getInvitees()Lkotlinx/coroutines/flow/w;

    .line 452
    move-result-object v3

    .line 453
    .line 454
    .line 455
    invoke-interface {v3}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 456
    move-result-object v3

    .line 457
    .line 458
    check-cast v3, Ljava/util/Collection;

    .line 459
    .line 460
    .line 461
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 462
    move-result v3

    .line 463
    .line 464
    if-eqz v3, :cond_2a

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 468
    move-result-object v2

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getConnected()Lkotlinx/coroutines/flow/w;

    .line 472
    move-result-object v2

    .line 473
    .line 474
    .line 475
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 476
    move-result-object v2

    .line 477
    .line 478
    check-cast v2, Ljava/util/List;

    .line 479
    .line 480
    .line 481
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 482
    move-result v2

    .line 483
    const/4 v13, 0x1

    .line 484
    .line 485
    if-le v2, v13, :cond_14

    .line 486
    .line 487
    goto/16 :goto_a

    .line 488
    .line 489
    .line 490
    :cond_14
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 491
    move-result-object v2

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 495
    move-result-object v3

    .line 496
    .line 497
    .line 498
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 499
    move-result-object v10

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 503
    move-result-object v12

    .line 504
    .line 505
    .line 506
    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 507
    move-result v10

    .line 508
    .line 509
    const-string v12, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore"

    .line 510
    .line 511
    if-eqz v10, :cond_16

    .line 512
    .line 513
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 514
    .line 515
    .line 516
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 517
    move-result-object v2

    .line 518
    .line 519
    if-eqz v2, :cond_15

    .line 520
    .line 521
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 522
    .line 523
    goto/16 :goto_8

    .line 524
    .line 525
    :cond_15
    new-instance v0, Ljava/lang/NullPointerException;

    .line 526
    .line 527
    .line 528
    invoke-direct {v0, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 529
    throw v0

    .line 530
    .line 531
    .line 532
    :cond_16
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 533
    move-result-object v10

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 537
    move-result-object v13

    .line 538
    .line 539
    .line 540
    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 541
    move-result v10

    .line 542
    .line 543
    if-eqz v10, :cond_18

    .line 544
    .line 545
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 546
    .line 547
    .line 548
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 549
    move-result-object v2

    .line 550
    .line 551
    if-eqz v2, :cond_17

    .line 552
    .line 553
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 554
    .line 555
    goto/16 :goto_8

    .line 556
    .line 557
    :cond_17
    new-instance v0, Ljava/lang/NullPointerException;

    .line 558
    .line 559
    .line 560
    invoke-direct {v0, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 561
    throw v0

    .line 562
    .line 563
    .line 564
    :cond_18
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 565
    move-result-object v10

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 569
    move-result-object v13

    .line 570
    .line 571
    .line 572
    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 573
    move-result v10

    .line 574
    .line 575
    if-eqz v10, :cond_1a

    .line 576
    .line 577
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 578
    .line 579
    .line 580
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 581
    move-result-object v2

    .line 582
    .line 583
    if-eqz v2, :cond_19

    .line 584
    .line 585
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 586
    .line 587
    goto/16 :goto_8

    .line 588
    .line 589
    :cond_19
    new-instance v0, Ljava/lang/NullPointerException;

    .line 590
    .line 591
    .line 592
    invoke-direct {v0, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 593
    throw v0

    .line 594
    .line 595
    .line 596
    :cond_1a
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 597
    move-result-object v10

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 601
    move-result-object v13

    .line 602
    .line 603
    .line 604
    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 605
    move-result v10

    .line 606
    .line 607
    if-eqz v10, :cond_1c

    .line 608
    .line 609
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 610
    .line 611
    .line 612
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 613
    move-result-object v2

    .line 614
    .line 615
    if-eqz v2, :cond_1b

    .line 616
    .line 617
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 618
    .line 619
    goto/16 :goto_8

    .line 620
    .line 621
    :cond_1b
    new-instance v0, Ljava/lang/NullPointerException;

    .line 622
    .line 623
    .line 624
    invoke-direct {v0, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 625
    throw v0

    .line 626
    .line 627
    :cond_1c
    iget-object v10, v2, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 628
    .line 629
    new-instance v12, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-direct {v12, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    invoke-static {v11, v12, v7, v10, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 636
    move-result-object v6

    .line 637
    const/4 v13, 0x1

    .line 638
    .line 639
    .line 640
    invoke-virtual {v10, v13, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 641
    .line 642
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    move-result-object v6

    .line 647
    .line 648
    if-nez v6, :cond_1e

    .line 649
    .line 650
    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    .line 651
    .line 652
    .line 653
    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2, v3, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    move-result-object v2

    .line 658
    .line 659
    if-nez v2, :cond_1d

    .line 660
    goto :goto_4

    .line 661
    :cond_1d
    move-object v6, v2

    .line 662
    .line 663
    :cond_1e
    :goto_4
    check-cast v6, Ljava/util/Map;

    .line 664
    .line 665
    .line 666
    invoke-static {v6, v11, v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 667
    move-result-object v2

    .line 668
    .line 669
    .line 670
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    move-result-object v5

    .line 672
    .line 673
    if-nez v5, :cond_28

    .line 674
    .line 675
    .line 676
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 677
    move-result-object v5

    .line 678
    .line 679
    .line 680
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 681
    move-result-object v7

    .line 682
    .line 683
    .line 684
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 685
    move-result v7

    .line 686
    .line 687
    if-eqz v7, :cond_1f

    .line 688
    .line 689
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 690
    .line 691
    .line 692
    invoke-direct {v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 693
    :goto_5
    move-object v5, v4

    .line 694
    .line 695
    goto/16 :goto_6

    .line 696
    .line 697
    .line 698
    :cond_1f
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 699
    move-result-object v7

    .line 700
    .line 701
    .line 702
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 703
    move-result v7

    .line 704
    .line 705
    if-eqz v7, :cond_20

    .line 706
    .line 707
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 708
    .line 709
    .line 710
    invoke-direct {v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 711
    goto :goto_5

    .line 712
    .line 713
    .line 714
    :cond_20
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 715
    move-result-object v4

    .line 716
    .line 717
    .line 718
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 719
    move-result v4

    .line 720
    .line 721
    if-eqz v4, :cond_21

    .line 722
    .line 723
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 724
    .line 725
    .line 726
    invoke-direct {v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 727
    goto :goto_5

    .line 728
    .line 729
    .line 730
    :cond_21
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 731
    move-result-object v4

    .line 732
    .line 733
    .line 734
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 735
    move-result v4

    .line 736
    .line 737
    if-eqz v4, :cond_22

    .line 738
    .line 739
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 740
    .line 741
    .line 742
    invoke-direct {v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 743
    goto :goto_5

    .line 744
    .line 745
    .line 746
    :cond_22
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 747
    move-result-object v4

    .line 748
    .line 749
    .line 750
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 751
    move-result v4

    .line 752
    .line 753
    if-eqz v4, :cond_23

    .line 754
    .line 755
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 756
    .line 757
    .line 758
    invoke-direct {v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 759
    goto :goto_5

    .line 760
    .line 761
    .line 762
    :cond_23
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 763
    move-result-object v4

    .line 764
    .line 765
    .line 766
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 767
    move-result v4

    .line 768
    .line 769
    if-eqz v4, :cond_24

    .line 770
    .line 771
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 772
    .line 773
    .line 774
    invoke-direct {v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 775
    goto :goto_5

    .line 776
    .line 777
    .line 778
    :cond_24
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 779
    move-result-object v4

    .line 780
    .line 781
    .line 782
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 783
    move-result v4

    .line 784
    .line 785
    if-eqz v4, :cond_25

    .line 786
    .line 787
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 788
    .line 789
    .line 790
    invoke-direct {v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 791
    goto :goto_5

    .line 792
    .line 793
    .line 794
    :cond_25
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 795
    move-result-object v4

    .line 796
    .line 797
    .line 798
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 799
    move-result v4

    .line 800
    .line 801
    if-eqz v4, :cond_26

    .line 802
    .line 803
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 804
    .line 805
    .line 806
    invoke-direct {v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 807
    goto :goto_5

    .line 808
    .line 809
    .line 810
    :cond_26
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 811
    move-result-object v4

    .line 812
    .line 813
    .line 814
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 815
    move-result v4

    .line 816
    .line 817
    if-eqz v4, :cond_27

    .line 818
    .line 819
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 820
    .line 821
    .line 822
    invoke-direct {v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 823
    .line 824
    goto/16 :goto_5

    .line 825
    .line 826
    .line 827
    :goto_6
    invoke-interface {v6, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 828
    goto :goto_7

    .line 829
    .line 830
    :cond_27
    new-instance v0, Ljava/lang/Exception;

    .line 831
    .line 832
    .line 833
    invoke-direct {v0, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 834
    throw v0

    .line 835
    :cond_28
    :goto_7
    move-object v2, v5

    .line 836
    .line 837
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 838
    .line 839
    :goto_8
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/live/CoHostLayoutTemplate;->HOST_DYNAMIC_GRID:Lio/trtc/tuikit/atomicxcore/api/live/CoHostLayoutTemplate;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostLayoutTemplate;->getValue()I

    .line 843
    move-result v4

    .line 844
    .line 845
    sget-object v5, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;->getCoHostTemplateId()I

    .line 849
    move-result v5

    .line 850
    .line 851
    if-ne v4, v5, :cond_29

    .line 852
    goto :goto_9

    .line 853
    .line 854
    :cond_29
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/live/CoHostLayoutTemplate;->HOST_DYNAMIC_1V6:Lio/trtc/tuikit/atomicxcore/api/live/CoHostLayoutTemplate;

    .line 855
    .line 856
    :goto_9
    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/view/live/i;

    .line 857
    .line 858
    .line 859
    invoke-direct {v5, v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/i;-><init>(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;)V

    .line 860
    .line 861
    const-string v4, ""

    .line 862
    move-object v0, v2

    .line 863
    move-object v2, v3

    .line 864
    .line 865
    move/from16 v3, p2

    .line 866
    .line 867
    .line 868
    invoke-virtual/range {v0 .. v5}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->requestHostConnection(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/CoHostLayoutTemplate;ILjava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 869
    return-void

    .line 870
    .line 871
    :cond_2a
    :goto_a
    if-eqz v0, :cond_2b

    .line 872
    .line 873
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->ALREADY_IN_SEAT:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 874
    .line 875
    const-string v2, "Cross-room connections are not allowed when there are viewers connected in the room"

    .line 876
    .line 877
    .line 878
    invoke-interface {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 879
    :cond_2b
    return-void
.end method

.method public final requestIntraRoomConnection(Ljava/lang/String;IIZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    const-string/jumbo v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setCoGuestAutoOpenMicrophone$atomicxcore_release(Z)V

    .line 3
    invoke-virtual {p0, p4}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setCoGuestAutoOpenCamera$atomicxcore_release(Z)V

    .line 4
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v1

    .line 5
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore"

    if-eqz v3, :cond_1

    .line 6
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 8
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 10
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object p1

    if-eqz p1, :cond_4

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 12
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object p1

    if-eqz p1, :cond_6

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 14
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "getStore "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, " liveID is empty"

    .line 15
    const-string v6, "message"

    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 16
    invoke-virtual {v3, p1, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 17
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_9

    .line 19
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 20
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    move-object v0, p1

    .line 21
    :cond_9
    :goto_0
    check-cast v0, Ljava/util/Map;

    .line 22
    const-string p1, "getName(...)"

    invoke-static {v0, v2, p1}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_13

    .line 24
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    .line 25
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_1
    move-object v3, v2

    goto/16 :goto_2

    .line 26
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 27
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 28
    :cond_c
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 29
    :cond_d
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 30
    :cond_e
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 31
    :cond_f
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 32
    :cond_10
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 33
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 34
    :goto_2
    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 35
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    const-string/jumbo p2, "type is not supported"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 36
    :cond_13
    :goto_3
    move-object p1, v3

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 37
    :goto_4
    invoke-static {p4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p4

    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/k;

    invoke-direct {v0, p5}, Lio/trtc/tuikit/atomicxcore/impl/view/live/k;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    invoke-virtual {p1, p2, p3, p4, v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->applyForSeat(IILjava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    if-eqz p5, :cond_14

    .line 38
    invoke-interface {p5}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onSuccess()V

    :cond_14
    return-void
.end method

.method public final requestIntraRoomConnection(Ljava/lang/String;IZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    const-string/jumbo v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 40
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setCoGuestAutoOpenMicrophone$atomicxcore_release(Z)V

    .line 41
    invoke-virtual {p0, p3}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setCoGuestAutoOpenCamera$atomicxcore_release(Z)V

    .line 42
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v1

    .line 43
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore"

    if-eqz v3, :cond_1

    .line 44
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 45
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 46
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 47
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 48
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object p1

    if-eqz p1, :cond_4

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 49
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 50
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object p1

    if-eqz p1, :cond_6

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 51
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 52
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "getStore "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, " liveID is empty"

    .line 53
    const-string v6, "message"

    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 54
    invoke-virtual {v3, p1, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 55
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 56
    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_9

    .line 57
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 58
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    move-object v0, p1

    .line 59
    :cond_9
    :goto_0
    check-cast v0, Ljava/util/Map;

    .line 60
    const-string p1, "getName(...)"

    invoke-static {v0, v2, p1}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 61
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_13

    .line 62
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    .line 63
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_1
    move-object v3, v2

    goto/16 :goto_2

    .line 64
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 65
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 66
    :cond_c
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 67
    :cond_d
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 68
    :cond_e
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 69
    :cond_f
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 70
    :cond_10
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 71
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 72
    :goto_2
    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 73
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    const-string/jumbo p2, "type is not supported"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 74
    :cond_13
    :goto_3
    move-object p1, v3

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 75
    :goto_4
    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p3

    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/j;

    invoke-direct {v0, p4}, Lio/trtc/tuikit/atomicxcore/impl/view/live/j;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    const/4 v1, -0x1

    invoke-virtual {p1, v1, p2, p3, v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->applyForSeat(IILjava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    if-eqz p4, :cond_14

    .line 76
    invoke-interface {p4}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onSuccess()V

    :cond_14
    return-void
.end method

.method public final respondIntraRoomConnection(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = "This operation requires opening the camera and microphone. You need to have camera and microphone permissions before calling"
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userId"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v1, "<this>"

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    move-result v3

    .line 41
    .line 42
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore"

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p1

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    move-result-object v3

    .line 67
    .line 68
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    move-result-object v5

    .line 73
    .line 74
    .line 75
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    move-result v3

    .line 77
    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 89
    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 96
    throw p1

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 106
    move-result-object v5

    .line 107
    .line 108
    .line 109
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    move-result v3

    .line 111
    .line 112
    if-eqz v3, :cond_5

    .line 113
    .line 114
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 123
    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 127
    .line 128
    .line 129
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 130
    throw p1

    .line 131
    .line 132
    .line 133
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 134
    move-result-object v3

    .line 135
    .line 136
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 140
    move-result-object v5

    .line 141
    .line 142
    .line 143
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    move-result v3

    .line 145
    .line 146
    if-eqz v3, :cond_7

    .line 147
    .line 148
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 149
    .line 150
    .line 151
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 152
    move-result-object v0

    .line 153
    .line 154
    if-eqz v0, :cond_6

    .line 155
    .line 156
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 157
    .line 158
    goto/16 :goto_4

    .line 159
    .line 160
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 161
    .line 162
    .line 163
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 164
    throw p1

    .line 165
    .line 166
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 167
    .line 168
    new-instance v4, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    const-string v5, "getStore "

    .line 171
    .line 172
    .line 173
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    const-string v5, " liveID is empty"

    .line 176
    .line 177
    const-string v6, "message"

    .line 178
    .line 179
    .line 180
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    move-result-object v4

    .line 182
    const/4 v5, 0x1

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 186
    .line 187
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    move-result-object v3

    .line 192
    .line 193
    if-nez v3, :cond_9

    .line 194
    .line 195
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 196
    .line 197
    .line 198
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    move-result-object v0

    .line 203
    .line 204
    if-nez v0, :cond_8

    .line 205
    goto :goto_0

    .line 206
    :cond_8
    move-object v3, v0

    .line 207
    .line 208
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 209
    .line 210
    const-string v0, "getName(...)"

    .line 211
    .line 212
    .line 213
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    move-result-object v0

    .line 215
    .line 216
    .line 217
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    move-result-object v4

    .line 219
    .line 220
    if-nez v4, :cond_13

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 224
    move-result-object v4

    .line 225
    .line 226
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 230
    move-result-object v5

    .line 231
    .line 232
    .line 233
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    move-result v5

    .line 235
    .line 236
    if-eqz v5, :cond_a

    .line 237
    .line 238
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 239
    .line 240
    .line 241
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 242
    :goto_1
    move-object v4, v2

    .line 243
    .line 244
    goto/16 :goto_2

    .line 245
    .line 246
    :cond_a
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 250
    move-result-object v5

    .line 251
    .line 252
    .line 253
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    move-result v5

    .line 255
    .line 256
    if-eqz v5, :cond_b

    .line 257
    .line 258
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 259
    .line 260
    .line 261
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 262
    goto :goto_1

    .line 263
    .line 264
    .line 265
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 266
    move-result-object v2

    .line 267
    .line 268
    .line 269
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    move-result v2

    .line 271
    .line 272
    if-eqz v2, :cond_c

    .line 273
    .line 274
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 275
    .line 276
    .line 277
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 278
    goto :goto_1

    .line 279
    .line 280
    :cond_c
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 284
    move-result-object v2

    .line 285
    .line 286
    .line 287
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    move-result v2

    .line 289
    .line 290
    if-eqz v2, :cond_d

    .line 291
    .line 292
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 293
    .line 294
    .line 295
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 296
    goto :goto_1

    .line 297
    .line 298
    :cond_d
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 302
    move-result-object v2

    .line 303
    .line 304
    .line 305
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    move-result v2

    .line 307
    .line 308
    if-eqz v2, :cond_e

    .line 309
    .line 310
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 311
    .line 312
    .line 313
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 314
    goto :goto_1

    .line 315
    .line 316
    :cond_e
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 320
    move-result-object v2

    .line 321
    .line 322
    .line 323
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    move-result v2

    .line 325
    .line 326
    if-eqz v2, :cond_f

    .line 327
    .line 328
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 329
    .line 330
    .line 331
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 332
    goto :goto_1

    .line 333
    .line 334
    :cond_f
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 338
    move-result-object v2

    .line 339
    .line 340
    .line 341
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 342
    move-result v2

    .line 343
    .line 344
    if-eqz v2, :cond_10

    .line 345
    .line 346
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 347
    .line 348
    .line 349
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 350
    goto :goto_1

    .line 351
    .line 352
    :cond_10
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 356
    move-result-object v2

    .line 357
    .line 358
    .line 359
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 360
    move-result v2

    .line 361
    .line 362
    if-eqz v2, :cond_11

    .line 363
    .line 364
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 365
    .line 366
    .line 367
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 368
    goto :goto_1

    .line 369
    .line 370
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 374
    move-result-object v2

    .line 375
    .line 376
    .line 377
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 378
    move-result v2

    .line 379
    .line 380
    if-eqz v2, :cond_12

    .line 381
    .line 382
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 383
    .line 384
    .line 385
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    goto/16 :goto_1

    .line 388
    .line 389
    .line 390
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    goto :goto_3

    .line 392
    .line 393
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 394
    .line 395
    .line 396
    const-string/jumbo p2, "type is not supported"

    .line 397
    .line 398
    .line 399
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 400
    throw p1

    .line 401
    :cond_13
    :goto_3
    move-object v0, v4

    .line 402
    .line 403
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 404
    .line 405
    :goto_4
    if-eqz p2, :cond_14

    .line 406
    .line 407
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/l;

    .line 408
    .line 409
    .line 410
    invoke-direct {p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/l;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->acceptApplication(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 414
    return-void

    .line 415
    .line 416
    :cond_14
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/m;

    .line 417
    .line 418
    .line 419
    invoke-direct {p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/m;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->rejectApplication(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 423
    return-void
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method

.method public final respondToBattle(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "battleId"

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
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v3

    .line 40
    .line 41
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore"

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    move-result v3

    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 88
    .line 89
    goto/16 :goto_4

    .line 90
    .line 91
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 95
    throw p1

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    move-result-object v3

    .line 100
    .line 101
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 105
    move-result-object v5

    .line 106
    .line 107
    .line 108
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    move-result v3

    .line 110
    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 122
    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 126
    .line 127
    .line 128
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 129
    throw p1

    .line 130
    .line 131
    .line 132
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 133
    move-result-object v3

    .line 134
    .line 135
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 139
    move-result-object v5

    .line 140
    .line 141
    .line 142
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    move-result v3

    .line 144
    .line 145
    if-eqz v3, :cond_7

    .line 146
    .line 147
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 148
    .line 149
    .line 150
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    if-eqz v0, :cond_6

    .line 154
    .line 155
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 156
    .line 157
    goto/16 :goto_4

    .line 158
    .line 159
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 160
    .line 161
    .line 162
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 163
    throw p1

    .line 164
    .line 165
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 166
    .line 167
    new-instance v4, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-string v5, "getStore "

    .line 170
    .line 171
    .line 172
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    const-string v5, " liveID is empty"

    .line 175
    .line 176
    const-string v6, "message"

    .line 177
    .line 178
    .line 179
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    move-result-object v4

    .line 181
    const/4 v5, 0x1

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 185
    .line 186
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    move-result-object v3

    .line 191
    .line 192
    if-nez v3, :cond_9

    .line 193
    .line 194
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 195
    .line 196
    .line 197
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    if-nez v0, :cond_8

    .line 204
    goto :goto_0

    .line 205
    :cond_8
    move-object v3, v0

    .line 206
    .line 207
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 208
    .line 209
    const-string v0, "getName(...)"

    .line 210
    .line 211
    .line 212
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    .line 216
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    move-result-object v4

    .line 218
    .line 219
    if-nez v4, :cond_13

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 223
    move-result-object v4

    .line 224
    .line 225
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 229
    move-result-object v5

    .line 230
    .line 231
    .line 232
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    move-result v5

    .line 234
    .line 235
    if-eqz v5, :cond_a

    .line 236
    .line 237
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 238
    .line 239
    .line 240
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 241
    :goto_1
    move-object v4, v2

    .line 242
    .line 243
    goto/16 :goto_2

    .line 244
    .line 245
    .line 246
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 247
    move-result-object v2

    .line 248
    .line 249
    .line 250
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    move-result v2

    .line 252
    .line 253
    if-eqz v2, :cond_b

    .line 254
    .line 255
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 256
    .line 257
    .line 258
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 259
    goto :goto_1

    .line 260
    .line 261
    :cond_b
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 265
    move-result-object v2

    .line 266
    .line 267
    .line 268
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    move-result v2

    .line 270
    .line 271
    if-eqz v2, :cond_c

    .line 272
    .line 273
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 274
    .line 275
    .line 276
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 277
    goto :goto_1

    .line 278
    .line 279
    :cond_c
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 283
    move-result-object v2

    .line 284
    .line 285
    .line 286
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    move-result v2

    .line 288
    .line 289
    if-eqz v2, :cond_d

    .line 290
    .line 291
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 292
    .line 293
    .line 294
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 295
    goto :goto_1

    .line 296
    .line 297
    :cond_d
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 301
    move-result-object v2

    .line 302
    .line 303
    .line 304
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    move-result v2

    .line 306
    .line 307
    if-eqz v2, :cond_e

    .line 308
    .line 309
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 310
    .line 311
    .line 312
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 313
    goto :goto_1

    .line 314
    .line 315
    :cond_e
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 319
    move-result-object v2

    .line 320
    .line 321
    .line 322
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 323
    move-result v2

    .line 324
    .line 325
    if-eqz v2, :cond_f

    .line 326
    .line 327
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 328
    .line 329
    .line 330
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 331
    goto :goto_1

    .line 332
    .line 333
    :cond_f
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 337
    move-result-object v2

    .line 338
    .line 339
    .line 340
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    move-result v2

    .line 342
    .line 343
    if-eqz v2, :cond_10

    .line 344
    .line 345
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 346
    .line 347
    .line 348
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 349
    goto :goto_1

    .line 350
    .line 351
    :cond_10
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 355
    move-result-object v2

    .line 356
    .line 357
    .line 358
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    move-result v2

    .line 360
    .line 361
    if-eqz v2, :cond_11

    .line 362
    .line 363
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 364
    .line 365
    .line 366
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 367
    goto :goto_1

    .line 368
    .line 369
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 373
    move-result-object v2

    .line 374
    .line 375
    .line 376
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 377
    move-result v2

    .line 378
    .line 379
    if-eqz v2, :cond_12

    .line 380
    .line 381
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 382
    .line 383
    .line 384
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    goto/16 :goto_1

    .line 387
    .line 388
    .line 389
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    goto :goto_3

    .line 391
    .line 392
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 393
    .line 394
    .line 395
    const-string/jumbo p2, "type is not supported"

    .line 396
    .line 397
    .line 398
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 399
    throw p1

    .line 400
    :cond_13
    :goto_3
    move-object v0, v4

    .line 401
    .line 402
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 403
    .line 404
    :goto_4
    if-eqz p2, :cond_14

    .line 405
    .line 406
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/n;

    .line 407
    .line 408
    .line 409
    invoke-direct {p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/n;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->acceptBattle(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 413
    return-void

    .line 414
    .line 415
    :cond_14
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/o;

    .line 416
    .line 417
    .line 418
    invoke-direct {p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/o;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->rejectBattle(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 422
    return-void
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method

.method public final respondToCrossRoomConnection(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

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
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v3

    .line 40
    .line 41
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore"

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    move-result v3

    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 88
    .line 89
    goto/16 :goto_4

    .line 90
    .line 91
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 95
    throw p1

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    move-result-object v3

    .line 100
    .line 101
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 105
    move-result-object v5

    .line 106
    .line 107
    .line 108
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    move-result v3

    .line 110
    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 122
    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 126
    .line 127
    .line 128
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 129
    throw p1

    .line 130
    .line 131
    .line 132
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 133
    move-result-object v3

    .line 134
    .line 135
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 139
    move-result-object v5

    .line 140
    .line 141
    .line 142
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    move-result v3

    .line 144
    .line 145
    if-eqz v3, :cond_7

    .line 146
    .line 147
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 148
    .line 149
    .line 150
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    if-eqz v0, :cond_6

    .line 154
    .line 155
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 156
    .line 157
    goto/16 :goto_4

    .line 158
    .line 159
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 160
    .line 161
    .line 162
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 163
    throw p1

    .line 164
    .line 165
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 166
    .line 167
    new-instance v4, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-string v5, "getStore "

    .line 170
    .line 171
    .line 172
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    const-string v5, " liveID is empty"

    .line 175
    .line 176
    const-string v6, "message"

    .line 177
    .line 178
    .line 179
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    move-result-object v4

    .line 181
    const/4 v5, 0x1

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 185
    .line 186
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    move-result-object v3

    .line 191
    .line 192
    if-nez v3, :cond_9

    .line 193
    .line 194
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 195
    .line 196
    .line 197
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    if-nez v0, :cond_8

    .line 204
    goto :goto_0

    .line 205
    :cond_8
    move-object v3, v0

    .line 206
    .line 207
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 208
    .line 209
    const-string v0, "getName(...)"

    .line 210
    .line 211
    .line 212
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    .line 216
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    move-result-object v4

    .line 218
    .line 219
    if-nez v4, :cond_13

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 223
    move-result-object v4

    .line 224
    .line 225
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 229
    move-result-object v5

    .line 230
    .line 231
    .line 232
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    move-result v5

    .line 234
    .line 235
    if-eqz v5, :cond_a

    .line 236
    .line 237
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 238
    .line 239
    .line 240
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 241
    :goto_1
    move-object v4, v2

    .line 242
    .line 243
    goto/16 :goto_2

    .line 244
    .line 245
    :cond_a
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 249
    move-result-object v5

    .line 250
    .line 251
    .line 252
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    move-result v5

    .line 254
    .line 255
    if-eqz v5, :cond_b

    .line 256
    .line 257
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 258
    .line 259
    .line 260
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 261
    goto :goto_1

    .line 262
    .line 263
    :cond_b
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 267
    move-result-object v5

    .line 268
    .line 269
    .line 270
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    move-result v5

    .line 272
    .line 273
    if-eqz v5, :cond_c

    .line 274
    .line 275
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 276
    .line 277
    .line 278
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 279
    goto :goto_1

    .line 280
    .line 281
    .line 282
    :cond_c
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 283
    move-result-object v2

    .line 284
    .line 285
    .line 286
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    move-result v2

    .line 288
    .line 289
    if-eqz v2, :cond_d

    .line 290
    .line 291
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 292
    .line 293
    .line 294
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 295
    goto :goto_1

    .line 296
    .line 297
    :cond_d
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 301
    move-result-object v2

    .line 302
    .line 303
    .line 304
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    move-result v2

    .line 306
    .line 307
    if-eqz v2, :cond_e

    .line 308
    .line 309
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 310
    .line 311
    .line 312
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 313
    goto :goto_1

    .line 314
    .line 315
    :cond_e
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 319
    move-result-object v2

    .line 320
    .line 321
    .line 322
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 323
    move-result v2

    .line 324
    .line 325
    if-eqz v2, :cond_f

    .line 326
    .line 327
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 328
    .line 329
    .line 330
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 331
    goto :goto_1

    .line 332
    .line 333
    :cond_f
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 337
    move-result-object v2

    .line 338
    .line 339
    .line 340
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    move-result v2

    .line 342
    .line 343
    if-eqz v2, :cond_10

    .line 344
    .line 345
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 346
    .line 347
    .line 348
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 349
    goto :goto_1

    .line 350
    .line 351
    :cond_10
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 355
    move-result-object v2

    .line 356
    .line 357
    .line 358
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    move-result v2

    .line 360
    .line 361
    if-eqz v2, :cond_11

    .line 362
    .line 363
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 364
    .line 365
    .line 366
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 367
    goto :goto_1

    .line 368
    .line 369
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 373
    move-result-object v2

    .line 374
    .line 375
    .line 376
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 377
    move-result v2

    .line 378
    .line 379
    if-eqz v2, :cond_12

    .line 380
    .line 381
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 382
    .line 383
    .line 384
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    goto/16 :goto_1

    .line 387
    .line 388
    .line 389
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    goto :goto_3

    .line 391
    .line 392
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 393
    .line 394
    .line 395
    const-string/jumbo p2, "type is not supported"

    .line 396
    .line 397
    .line 398
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 399
    throw p1

    .line 400
    :cond_13
    :goto_3
    move-object v0, v4

    .line 401
    .line 402
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 403
    .line 404
    :goto_4
    if-eqz p2, :cond_14

    .line 405
    .line 406
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/p;

    .line 407
    .line 408
    .line 409
    invoke-direct {p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/p;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->acceptHostConnection(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 413
    return-void

    .line 414
    .line 415
    :cond_14
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/q;

    .line 416
    .line 417
    .line 418
    invoke-direct {p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/q;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->rejectHostConnection(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 422
    return-void
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method

.method public final setBigPlaceholderBitmap$atomicxcore_release(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->bigPlaceholderBitmap:Landroid/graphics/Bitmap;

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

.method public final setCallbackHandler$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->callbackHandler:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

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

.method public final setCoGuestAutoOpenCamera$atomicxcore_release(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->coGuestAutoOpenCamera:Z

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

.method public final setCoGuestAutoOpenMicrophone$atomicxcore_release(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->coGuestAutoOpenMicrophone:Z

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

.method public final setLayoutMode(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$LayoutMode;ZLjava/lang/String;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$LayoutMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string p2, "layoutModel"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "layoutJson"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    return-void
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

.method public final setLiveId$atomicxcore_release(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->liveId:Ljava/lang/String;

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

.method public final setLocalVideoMuteImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 3
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

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
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setBigPlaceholderBitmap$atomicxcore_release(Landroid/graphics/Bitmap;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setSmallPlaceholderBitmap$atomicxcore_release(Landroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoreStateProvider$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 18
    .line 19
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->coHostState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoHostState;

    .line 20
    .line 21
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoHostState;->connectedUserList:Landroidx/lifecycle/LiveData;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    check-cast p1, Ljava/util/List;

    .line 28
    const/4 p2, 0x0

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 34
    move-result p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move p1, p2

    .line 37
    :goto_0
    const/4 v1, 0x1

    .line 38
    .line 39
    if-le p1, v1, :cond_1

    .line 40
    move p1, p2

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move p1, v1

    .line 43
    .line 44
    .line 45
    :goto_1
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoreStateProvider$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 49
    .line 50
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->coGuestState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoGuestState;

    .line 51
    .line 52
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoGuestState;->connectedUserList:Landroidx/lifecycle/LiveData;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    check-cast v2, Ljava/util/List;

    .line 59
    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 64
    move-result v2

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move v2, p2

    .line 67
    .line 68
    :goto_2
    if-le v2, v1, :cond_3

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move p2, p1

    .line 71
    .line 72
    .line 73
    :goto_3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getBigPlaceholderBitmap$atomicxcore_release()Landroid/graphics/Bitmap;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    if-eqz p1, :cond_6

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getSmallPlaceholderBitmap$atomicxcore_release()Landroid/graphics/Bitmap;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    if-nez p1, :cond_4

    .line 86
    goto :goto_5

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    if-eqz p2, :cond_5

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getBigPlaceholderBitmap$atomicxcore_release()Landroid/graphics/Bitmap;

    .line 96
    move-result-object p2

    .line 97
    goto :goto_4

    .line 98
    .line 99
    .line 100
    :cond_5
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getSmallPlaceholderBitmap$atomicxcore_release()Landroid/graphics/Bitmap;

    .line 101
    move-result-object p2

    .line 102
    .line 103
    .line 104
    :goto_4
    invoke-virtual {p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setLocalVideoMuteImage(Landroid/graphics/Bitmap;)V

    .line 105
    :cond_6
    :goto_5
    return-void
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
.end method

.method public final setSmallPlaceholderBitmap$atomicxcore_release(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->smallPlaceholderBitmap:Landroid/graphics/Bitmap;

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

.method public final startCamera(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p2    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore"

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p1

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v3

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 87
    throw p1

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    move-result v3

    .line 100
    .line 101
    if-eqz v3, :cond_5

    .line 102
    .line 103
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 114
    .line 115
    .line 116
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 117
    throw p1

    .line 118
    .line 119
    .line 120
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    move-result-object v5

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    move-result v3

    .line 132
    .line 133
    if-eqz v3, :cond_7

    .line 134
    .line 135
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 144
    .line 145
    goto/16 :goto_4

    .line 146
    .line 147
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 148
    .line 149
    .line 150
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 151
    throw p1

    .line 152
    .line 153
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 154
    .line 155
    new-instance v4, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v5, "getStore "

    .line 158
    .line 159
    .line 160
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    const-string v5, " liveID is empty"

    .line 163
    .line 164
    const-string v6, "message"

    .line 165
    .line 166
    .line 167
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    move-result-object v4

    .line 169
    const/4 v5, 0x1

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 173
    .line 174
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    move-result-object v3

    .line 179
    .line 180
    if-nez v3, :cond_9

    .line 181
    .line 182
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 183
    .line 184
    .line 185
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    if-nez v0, :cond_8

    .line 192
    goto :goto_0

    .line 193
    :cond_8
    move-object v3, v0

    .line 194
    .line 195
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 196
    .line 197
    const-string v0, "getName(...)"

    .line 198
    .line 199
    .line 200
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    .line 204
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    move-result-object v4

    .line 206
    .line 207
    if-nez v4, :cond_13

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 211
    move-result-object v2

    .line 212
    .line 213
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 217
    move-result-object v4

    .line 218
    .line 219
    .line 220
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    move-result v4

    .line 222
    .line 223
    if-eqz v4, :cond_a

    .line 224
    .line 225
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 226
    .line 227
    .line 228
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 229
    :goto_1
    move-object v4, v2

    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 237
    move-result-object v4

    .line 238
    .line 239
    .line 240
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    move-result v4

    .line 242
    .line 243
    if-eqz v4, :cond_b

    .line 244
    .line 245
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 246
    .line 247
    .line 248
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 249
    goto :goto_1

    .line 250
    .line 251
    :cond_b
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 255
    move-result-object v4

    .line 256
    .line 257
    .line 258
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    move-result v4

    .line 260
    .line 261
    if-eqz v4, :cond_c

    .line 262
    .line 263
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 264
    .line 265
    .line 266
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 267
    goto :goto_1

    .line 268
    .line 269
    :cond_c
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 273
    move-result-object v4

    .line 274
    .line 275
    .line 276
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    move-result v4

    .line 278
    .line 279
    if-eqz v4, :cond_d

    .line 280
    .line 281
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 282
    .line 283
    .line 284
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 285
    goto :goto_1

    .line 286
    .line 287
    :cond_d
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 291
    move-result-object v4

    .line 292
    .line 293
    .line 294
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    move-result v4

    .line 296
    .line 297
    if-eqz v4, :cond_e

    .line 298
    .line 299
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 300
    .line 301
    .line 302
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 303
    goto :goto_1

    .line 304
    .line 305
    :cond_e
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 309
    move-result-object v4

    .line 310
    .line 311
    .line 312
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    move-result v4

    .line 314
    .line 315
    if-eqz v4, :cond_f

    .line 316
    .line 317
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 318
    .line 319
    .line 320
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 321
    goto :goto_1

    .line 322
    .line 323
    :cond_f
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 327
    move-result-object v4

    .line 328
    .line 329
    .line 330
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    move-result v4

    .line 332
    .line 333
    if-eqz v4, :cond_10

    .line 334
    .line 335
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 336
    .line 337
    .line 338
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 339
    goto :goto_1

    .line 340
    .line 341
    :cond_10
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 345
    move-result-object v4

    .line 346
    .line 347
    .line 348
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    move-result v4

    .line 350
    .line 351
    if-eqz v4, :cond_11

    .line 352
    .line 353
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 354
    .line 355
    .line 356
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    goto/16 :goto_1

    .line 359
    .line 360
    :cond_11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 364
    move-result-object v4

    .line 365
    .line 366
    .line 367
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    move-result v2

    .line 369
    .line 370
    if-eqz v2, :cond_12

    .line 371
    .line 372
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 373
    .line 374
    .line 375
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    .line 380
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    goto :goto_3

    .line 382
    .line 383
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 384
    .line 385
    .line 386
    const-string/jumbo p2, "type is not supported"

    .line 387
    .line 388
    .line 389
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 390
    throw p1

    .line 391
    :cond_13
    :goto_3
    move-object v0, v4

    .line 392
    .line 393
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 394
    .line 395
    :goto_4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/r;

    .line 396
    .line 397
    .line 398
    invoke-direct {v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/r;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, p1, v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->openLocalCamera(ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 402
    return-void
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method

.method public final startLiveStream(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V
    .locals 1
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    const-string v0, "liveInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-static {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/z;->a(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V

    return-void
.end method

.method public final startLiveStream(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 3
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    const-string v0, "roomInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;-><init>()V

    .line 4
    iget-object v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomId:Ljava/lang/String;

    .line 5
    iget-object v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerId:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerId:Ljava/lang/String;

    .line 6
    iget-object v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerName:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerName:Ljava/lang/String;

    .line 7
    iget-object v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerAvatarUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 8
    iget-object v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->name:Ljava/lang/String;

    .line 9
    iget-boolean v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isMessageDisableForAllUser:Z

    .line 10
    iget-boolean v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isSeatEnabled:Z

    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isSeatEnabled:Z

    .line 11
    iget-boolean v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->keepOwnerOnSeat:Z

    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->keepOwnerOnSeat:Z

    .line 12
    iget v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->maxSeatCount:I

    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->maxSeatCount:I

    .line 13
    iget-object v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 14
    iget-wide v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->createTime:J

    iput-wide v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->createTime:J

    .line 15
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->categoryList:Ljava/util/List;

    .line 16
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/s;

    invoke-direct {p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/s;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    invoke-static {p0, v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/z;->a(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V

    return-void
.end method

.method public final startMicrophone(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore"

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p1

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v3

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 87
    throw p1

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    move-result v3

    .line 100
    .line 101
    if-eqz v3, :cond_5

    .line 102
    .line 103
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 114
    .line 115
    .line 116
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 117
    throw p1

    .line 118
    .line 119
    .line 120
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    move-result-object v5

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    move-result v3

    .line 132
    .line 133
    if-eqz v3, :cond_7

    .line 134
    .line 135
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 144
    .line 145
    goto/16 :goto_4

    .line 146
    .line 147
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 148
    .line 149
    .line 150
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 151
    throw p1

    .line 152
    .line 153
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 154
    .line 155
    new-instance v4, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v5, "getStore "

    .line 158
    .line 159
    .line 160
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    const-string v5, " liveID is empty"

    .line 163
    .line 164
    const-string v6, "message"

    .line 165
    .line 166
    .line 167
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    move-result-object v4

    .line 169
    const/4 v5, 0x1

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 173
    .line 174
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    move-result-object v3

    .line 179
    .line 180
    if-nez v3, :cond_9

    .line 181
    .line 182
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 183
    .line 184
    .line 185
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    if-nez v0, :cond_8

    .line 192
    goto :goto_0

    .line 193
    :cond_8
    move-object v3, v0

    .line 194
    .line 195
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 196
    .line 197
    const-string v0, "getName(...)"

    .line 198
    .line 199
    .line 200
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    .line 204
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    move-result-object v4

    .line 206
    .line 207
    if-nez v4, :cond_13

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 211
    move-result-object v2

    .line 212
    .line 213
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 217
    move-result-object v4

    .line 218
    .line 219
    .line 220
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    move-result v4

    .line 222
    .line 223
    if-eqz v4, :cond_a

    .line 224
    .line 225
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 226
    .line 227
    .line 228
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 229
    :goto_1
    move-object v4, v2

    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 237
    move-result-object v4

    .line 238
    .line 239
    .line 240
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    move-result v4

    .line 242
    .line 243
    if-eqz v4, :cond_b

    .line 244
    .line 245
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 246
    .line 247
    .line 248
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 249
    goto :goto_1

    .line 250
    .line 251
    :cond_b
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 255
    move-result-object v4

    .line 256
    .line 257
    .line 258
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    move-result v4

    .line 260
    .line 261
    if-eqz v4, :cond_c

    .line 262
    .line 263
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 264
    .line 265
    .line 266
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 267
    goto :goto_1

    .line 268
    .line 269
    :cond_c
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 273
    move-result-object v4

    .line 274
    .line 275
    .line 276
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    move-result v4

    .line 278
    .line 279
    if-eqz v4, :cond_d

    .line 280
    .line 281
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 282
    .line 283
    .line 284
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 285
    goto :goto_1

    .line 286
    .line 287
    :cond_d
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 291
    move-result-object v4

    .line 292
    .line 293
    .line 294
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    move-result v4

    .line 296
    .line 297
    if-eqz v4, :cond_e

    .line 298
    .line 299
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 300
    .line 301
    .line 302
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 303
    goto :goto_1

    .line 304
    .line 305
    :cond_e
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 309
    move-result-object v4

    .line 310
    .line 311
    .line 312
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    move-result v4

    .line 314
    .line 315
    if-eqz v4, :cond_f

    .line 316
    .line 317
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 318
    .line 319
    .line 320
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 321
    goto :goto_1

    .line 322
    .line 323
    :cond_f
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 327
    move-result-object v4

    .line 328
    .line 329
    .line 330
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    move-result v4

    .line 332
    .line 333
    if-eqz v4, :cond_10

    .line 334
    .line 335
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 336
    .line 337
    .line 338
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 339
    goto :goto_1

    .line 340
    .line 341
    :cond_10
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 345
    move-result-object v4

    .line 346
    .line 347
    .line 348
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    move-result v4

    .line 350
    .line 351
    if-eqz v4, :cond_11

    .line 352
    .line 353
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 354
    .line 355
    .line 356
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    goto/16 :goto_1

    .line 359
    .line 360
    :cond_11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 364
    move-result-object v4

    .line 365
    .line 366
    .line 367
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    move-result v2

    .line 369
    .line 370
    if-eqz v2, :cond_12

    .line 371
    .line 372
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 373
    .line 374
    .line 375
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    .line 380
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    goto :goto_3

    .line 382
    .line 383
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 384
    .line 385
    .line 386
    const-string/jumbo v0, "type is not supported"

    .line 387
    .line 388
    .line 389
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 390
    throw p1

    .line 391
    :cond_13
    :goto_3
    move-object v0, v4

    .line 392
    .line 393
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 394
    .line 395
    :goto_4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/u;

    .line 396
    .line 397
    .line 398
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/u;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->openLocalMicrophone(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 402
    return-void
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
.end method

.method public final stopCamera()V
    .locals 7
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore"

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    throw v0

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v3

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 87
    throw v0

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    move-result v3

    .line 100
    .line 101
    if-eqz v3, :cond_5

    .line 102
    .line 103
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 117
    throw v0

    .line 118
    .line 119
    .line 120
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    move-result-object v5

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    move-result v3

    .line 132
    .line 133
    if-eqz v3, :cond_7

    .line 134
    .line 135
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 144
    .line 145
    goto/16 :goto_4

    .line 146
    .line 147
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 148
    .line 149
    .line 150
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 151
    throw v0

    .line 152
    .line 153
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 154
    .line 155
    new-instance v4, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v5, "getStore "

    .line 158
    .line 159
    .line 160
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    const-string v5, " liveID is empty"

    .line 163
    .line 164
    const-string v6, "message"

    .line 165
    .line 166
    .line 167
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    move-result-object v4

    .line 169
    const/4 v5, 0x1

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 173
    .line 174
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    move-result-object v3

    .line 179
    .line 180
    if-nez v3, :cond_9

    .line 181
    .line 182
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 183
    .line 184
    .line 185
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    if-nez v0, :cond_8

    .line 192
    goto :goto_0

    .line 193
    :cond_8
    move-object v3, v0

    .line 194
    .line 195
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 196
    .line 197
    const-string v0, "getName(...)"

    .line 198
    .line 199
    .line 200
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    .line 204
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    move-result-object v4

    .line 206
    .line 207
    if-nez v4, :cond_13

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 211
    move-result-object v2

    .line 212
    .line 213
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 217
    move-result-object v4

    .line 218
    .line 219
    .line 220
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    move-result v4

    .line 222
    .line 223
    if-eqz v4, :cond_a

    .line 224
    .line 225
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 226
    .line 227
    .line 228
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 229
    :goto_1
    move-object v4, v2

    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 237
    move-result-object v4

    .line 238
    .line 239
    .line 240
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    move-result v4

    .line 242
    .line 243
    if-eqz v4, :cond_b

    .line 244
    .line 245
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 246
    .line 247
    .line 248
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 249
    goto :goto_1

    .line 250
    .line 251
    :cond_b
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 255
    move-result-object v4

    .line 256
    .line 257
    .line 258
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    move-result v4

    .line 260
    .line 261
    if-eqz v4, :cond_c

    .line 262
    .line 263
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 264
    .line 265
    .line 266
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 267
    goto :goto_1

    .line 268
    .line 269
    :cond_c
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 273
    move-result-object v4

    .line 274
    .line 275
    .line 276
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    move-result v4

    .line 278
    .line 279
    if-eqz v4, :cond_d

    .line 280
    .line 281
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 282
    .line 283
    .line 284
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 285
    goto :goto_1

    .line 286
    .line 287
    :cond_d
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 291
    move-result-object v4

    .line 292
    .line 293
    .line 294
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    move-result v4

    .line 296
    .line 297
    if-eqz v4, :cond_e

    .line 298
    .line 299
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 300
    .line 301
    .line 302
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 303
    goto :goto_1

    .line 304
    .line 305
    :cond_e
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 309
    move-result-object v4

    .line 310
    .line 311
    .line 312
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    move-result v4

    .line 314
    .line 315
    if-eqz v4, :cond_f

    .line 316
    .line 317
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 318
    .line 319
    .line 320
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 321
    goto :goto_1

    .line 322
    .line 323
    :cond_f
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 327
    move-result-object v4

    .line 328
    .line 329
    .line 330
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    move-result v4

    .line 332
    .line 333
    if-eqz v4, :cond_10

    .line 334
    .line 335
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 336
    .line 337
    .line 338
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 339
    goto :goto_1

    .line 340
    .line 341
    :cond_10
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 345
    move-result-object v4

    .line 346
    .line 347
    .line 348
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    move-result v4

    .line 350
    .line 351
    if-eqz v4, :cond_11

    .line 352
    .line 353
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 354
    .line 355
    .line 356
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    goto/16 :goto_1

    .line 359
    .line 360
    :cond_11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 364
    move-result-object v4

    .line 365
    .line 366
    .line 367
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    move-result v2

    .line 369
    .line 370
    if-eqz v2, :cond_12

    .line 371
    .line 372
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 373
    .line 374
    .line 375
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    .line 380
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    goto :goto_3

    .line 382
    .line 383
    :cond_12
    new-instance v0, Ljava/lang/Exception;

    .line 384
    .line 385
    .line 386
    const-string/jumbo v1, "type is not supported"

    .line 387
    .line 388
    .line 389
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 390
    throw v0

    .line 391
    :cond_13
    :goto_3
    move-object v0, v4

    .line 392
    .line 393
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 394
    .line 395
    .line 396
    :goto_4
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->closeLocalCamera()V

    .line 397
    return-void
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

.method public final stopLiveStream(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$StopLiveCallback;)V
    .locals 8
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$StopLiveCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCallbackHandler$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->b(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoreStateProvider$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    move-result-object v0

    .line 4
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->c:Lkotlinx/coroutines/x1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    const-string/jumbo v0, "subscribeAfterEnterRoomState"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    const/4 v2, 0x1

    .line 6
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v1

    .line 8
    const-class v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore"

    if-eqz v4, :cond_2

    .line 9
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-class v6, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 11
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_5

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-class v6, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 13
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_5

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 15
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v0

    if-eqz v0, :cond_7

    goto/16 :goto_5

    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_8
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 17
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "getStore "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, " liveID is empty"

    .line 18
    const-string v7, "message"

    invoke-static {v3, v5, v6, v4, v7}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 19
    invoke-virtual {v4, v2, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 20
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_a

    .line 22
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_9

    goto :goto_1

    :cond_9
    move-object v2, v0

    .line 24
    :cond_a
    :goto_1
    check-cast v2, Ljava/util/Map;

    .line 25
    const-string v0, "getName(...)"

    invoke-static {v2, v3, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_14

    .line 27
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    .line 28
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_2
    move-object v4, v3

    goto/16 :goto_3

    .line 29
    :cond_b
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 30
    :cond_c
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 31
    :cond_d
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 32
    :cond_e
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 33
    :cond_f
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 34
    :cond_10
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 35
    :cond_11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 36
    :cond_12
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 37
    :goto_3
    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 38
    :cond_13
    new-instance p1, Ljava/lang/Exception;

    const-string/jumbo v0, "type is not supported"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 39
    :cond_14
    :goto_4
    move-object v0, v4

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 40
    :goto_5
    move-object v1, p0

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    .line 41
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/w;

    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/w;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$StopLiveCallback;)V

    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->endLive(Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;)V

    return-void
.end method

.method public final stopLiveStream(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 8
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 42
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCallbackHandler$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->b(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoreStateProvider$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    move-result-object v0

    .line 45
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->c:Lkotlinx/coroutines/x1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 46
    :cond_0
    const-string/jumbo v0, "subscribeAfterEnterRoomState"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    const/4 v2, 0x1

    .line 47
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 48
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v1

    .line 49
    const-class v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore"

    if-eqz v4, :cond_2

    .line 50
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 51
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-class v6, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 52
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_5

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 53
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-class v6, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 54
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_5

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 55
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 56
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v0

    if-eqz v0, :cond_7

    goto/16 :goto_5

    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 57
    :cond_8
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 58
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "getStore "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, " liveID is empty"

    .line 59
    const-string v7, "message"

    invoke-static {v3, v5, v6, v4, v7}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 60
    invoke-virtual {v4, v2, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 61
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 62
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_a

    .line 63
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 64
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_9

    goto :goto_1

    :cond_9
    move-object v2, v0

    .line 65
    :cond_a
    :goto_1
    check-cast v2, Ljava/util/Map;

    .line 66
    const-string v0, "getName(...)"

    invoke-static {v2, v3, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 67
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_14

    .line 68
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    .line 69
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_2
    move-object v4, v3

    goto/16 :goto_3

    .line 70
    :cond_b
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 71
    :cond_c
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 72
    :cond_d
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 73
    :cond_e
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 74
    :cond_f
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 75
    :cond_10
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 76
    :cond_11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 77
    :cond_12
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 78
    :goto_3
    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 79
    :cond_13
    new-instance p1, Ljava/lang/Exception;

    const-string/jumbo v0, "type is not supported"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 80
    :cond_14
    :goto_4
    move-object v0, v4

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 81
    :goto_5
    move-object v1, p0

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    .line 82
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/v;

    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/v;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->endLive(Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;)V

    return-void
.end method

.method public final stopMicrophone()V
    .locals 7
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore"

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    throw v0

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v3

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 87
    throw v0

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    move-result v3

    .line 100
    .line 101
    if-eqz v3, :cond_5

    .line 102
    .line 103
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 117
    throw v0

    .line 118
    .line 119
    .line 120
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    move-result-object v5

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    move-result v3

    .line 132
    .line 133
    if-eqz v3, :cond_7

    .line 134
    .line 135
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 144
    .line 145
    goto/16 :goto_4

    .line 146
    .line 147
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 148
    .line 149
    .line 150
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 151
    throw v0

    .line 152
    .line 153
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 154
    .line 155
    new-instance v4, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v5, "getStore "

    .line 158
    .line 159
    .line 160
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    const-string v5, " liveID is empty"

    .line 163
    .line 164
    const-string v6, "message"

    .line 165
    .line 166
    .line 167
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    move-result-object v4

    .line 169
    const/4 v5, 0x1

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 173
    .line 174
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    move-result-object v3

    .line 179
    .line 180
    if-nez v3, :cond_9

    .line 181
    .line 182
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 183
    .line 184
    .line 185
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    if-nez v0, :cond_8

    .line 192
    goto :goto_0

    .line 193
    :cond_8
    move-object v3, v0

    .line 194
    .line 195
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 196
    .line 197
    const-string v0, "getName(...)"

    .line 198
    .line 199
    .line 200
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    .line 204
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    move-result-object v4

    .line 206
    .line 207
    if-nez v4, :cond_13

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 211
    move-result-object v2

    .line 212
    .line 213
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 217
    move-result-object v4

    .line 218
    .line 219
    .line 220
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    move-result v4

    .line 222
    .line 223
    if-eqz v4, :cond_a

    .line 224
    .line 225
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 226
    .line 227
    .line 228
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 229
    :goto_1
    move-object v4, v2

    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 237
    move-result-object v4

    .line 238
    .line 239
    .line 240
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    move-result v4

    .line 242
    .line 243
    if-eqz v4, :cond_b

    .line 244
    .line 245
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 246
    .line 247
    .line 248
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 249
    goto :goto_1

    .line 250
    .line 251
    :cond_b
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 255
    move-result-object v4

    .line 256
    .line 257
    .line 258
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    move-result v4

    .line 260
    .line 261
    if-eqz v4, :cond_c

    .line 262
    .line 263
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 264
    .line 265
    .line 266
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 267
    goto :goto_1

    .line 268
    .line 269
    :cond_c
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 273
    move-result-object v4

    .line 274
    .line 275
    .line 276
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    move-result v4

    .line 278
    .line 279
    if-eqz v4, :cond_d

    .line 280
    .line 281
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 282
    .line 283
    .line 284
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 285
    goto :goto_1

    .line 286
    .line 287
    :cond_d
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 291
    move-result-object v4

    .line 292
    .line 293
    .line 294
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    move-result v4

    .line 296
    .line 297
    if-eqz v4, :cond_e

    .line 298
    .line 299
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 300
    .line 301
    .line 302
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 303
    goto :goto_1

    .line 304
    .line 305
    :cond_e
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 309
    move-result-object v4

    .line 310
    .line 311
    .line 312
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    move-result v4

    .line 314
    .line 315
    if-eqz v4, :cond_f

    .line 316
    .line 317
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 318
    .line 319
    .line 320
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 321
    goto :goto_1

    .line 322
    .line 323
    :cond_f
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 327
    move-result-object v4

    .line 328
    .line 329
    .line 330
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    move-result v4

    .line 332
    .line 333
    if-eqz v4, :cond_10

    .line 334
    .line 335
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 336
    .line 337
    .line 338
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 339
    goto :goto_1

    .line 340
    .line 341
    :cond_10
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 345
    move-result-object v4

    .line 346
    .line 347
    .line 348
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    move-result v4

    .line 350
    .line 351
    if-eqz v4, :cond_11

    .line 352
    .line 353
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 354
    .line 355
    .line 356
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    goto/16 :goto_1

    .line 359
    .line 360
    :cond_11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 364
    move-result-object v4

    .line 365
    .line 366
    .line 367
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    move-result v2

    .line 369
    .line 370
    if-eqz v2, :cond_12

    .line 371
    .line 372
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 373
    .line 374
    .line 375
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    .line 380
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    goto :goto_3

    .line 382
    .line 383
    :cond_12
    new-instance v0, Ljava/lang/Exception;

    .line 384
    .line 385
    .line 386
    const-string/jumbo v1, "type is not supported"

    .line 387
    .line 388
    .line 389
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 390
    throw v0

    .line 391
    :cond_13
    :goto_3
    move-object v0, v4

    .line 392
    .line 393
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 394
    .line 395
    .line 396
    :goto_4
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->closeLocalMicrophone()V

    .line 397
    return-void
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

.method public final switchCamera(Z)V
    .locals 7
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore"

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p1

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v3

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 87
    throw p1

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    move-result v3

    .line 100
    .line 101
    if-eqz v3, :cond_5

    .line 102
    .line 103
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 114
    .line 115
    .line 116
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 117
    throw p1

    .line 118
    .line 119
    .line 120
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    move-result-object v5

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    move-result v3

    .line 132
    .line 133
    if-eqz v3, :cond_7

    .line 134
    .line 135
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 144
    .line 145
    goto/16 :goto_4

    .line 146
    .line 147
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 148
    .line 149
    .line 150
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 151
    throw p1

    .line 152
    .line 153
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 154
    .line 155
    new-instance v4, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v5, "getStore "

    .line 158
    .line 159
    .line 160
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    const-string v5, " liveID is empty"

    .line 163
    .line 164
    const-string v6, "message"

    .line 165
    .line 166
    .line 167
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    move-result-object v4

    .line 169
    const/4 v5, 0x1

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 173
    .line 174
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    move-result-object v3

    .line 179
    .line 180
    if-nez v3, :cond_9

    .line 181
    .line 182
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 183
    .line 184
    .line 185
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    if-nez v0, :cond_8

    .line 192
    goto :goto_0

    .line 193
    :cond_8
    move-object v3, v0

    .line 194
    .line 195
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 196
    .line 197
    const-string v0, "getName(...)"

    .line 198
    .line 199
    .line 200
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    .line 204
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    move-result-object v4

    .line 206
    .line 207
    if-nez v4, :cond_13

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 211
    move-result-object v2

    .line 212
    .line 213
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 217
    move-result-object v4

    .line 218
    .line 219
    .line 220
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    move-result v4

    .line 222
    .line 223
    if-eqz v4, :cond_a

    .line 224
    .line 225
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 226
    .line 227
    .line 228
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 229
    :goto_1
    move-object v4, v2

    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 237
    move-result-object v4

    .line 238
    .line 239
    .line 240
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    move-result v4

    .line 242
    .line 243
    if-eqz v4, :cond_b

    .line 244
    .line 245
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 246
    .line 247
    .line 248
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 249
    goto :goto_1

    .line 250
    .line 251
    :cond_b
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 255
    move-result-object v4

    .line 256
    .line 257
    .line 258
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    move-result v4

    .line 260
    .line 261
    if-eqz v4, :cond_c

    .line 262
    .line 263
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 264
    .line 265
    .line 266
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 267
    goto :goto_1

    .line 268
    .line 269
    :cond_c
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 273
    move-result-object v4

    .line 274
    .line 275
    .line 276
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    move-result v4

    .line 278
    .line 279
    if-eqz v4, :cond_d

    .line 280
    .line 281
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 282
    .line 283
    .line 284
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 285
    goto :goto_1

    .line 286
    .line 287
    :cond_d
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 291
    move-result-object v4

    .line 292
    .line 293
    .line 294
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    move-result v4

    .line 296
    .line 297
    if-eqz v4, :cond_e

    .line 298
    .line 299
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 300
    .line 301
    .line 302
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 303
    goto :goto_1

    .line 304
    .line 305
    :cond_e
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 309
    move-result-object v4

    .line 310
    .line 311
    .line 312
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    move-result v4

    .line 314
    .line 315
    if-eqz v4, :cond_f

    .line 316
    .line 317
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 318
    .line 319
    .line 320
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 321
    goto :goto_1

    .line 322
    .line 323
    :cond_f
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 327
    move-result-object v4

    .line 328
    .line 329
    .line 330
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    move-result v4

    .line 332
    .line 333
    if-eqz v4, :cond_10

    .line 334
    .line 335
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 336
    .line 337
    .line 338
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 339
    goto :goto_1

    .line 340
    .line 341
    :cond_10
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 345
    move-result-object v4

    .line 346
    .line 347
    .line 348
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    move-result v4

    .line 350
    .line 351
    if-eqz v4, :cond_11

    .line 352
    .line 353
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 354
    .line 355
    .line 356
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    goto/16 :goto_1

    .line 359
    .line 360
    :cond_11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 364
    move-result-object v4

    .line 365
    .line 366
    .line 367
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    move-result v2

    .line 369
    .line 370
    if-eqz v2, :cond_12

    .line 371
    .line 372
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 373
    .line 374
    .line 375
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    .line 380
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    goto :goto_3

    .line 382
    .line 383
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 384
    .line 385
    .line 386
    const-string/jumbo v0, "type is not supported"

    .line 387
    .line 388
    .line 389
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 390
    throw p1

    .line 391
    :cond_13
    :goto_3
    move-object v0, v4

    .line 392
    .line 393
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 394
    .line 395
    .line 396
    :goto_4
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->switchCamera(Z)V

    .line 397
    return-void
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
.end method

.method public final terminateBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "battleId"

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
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v3

    .line 40
    .line 41
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore"

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    move-result v3

    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 88
    .line 89
    goto/16 :goto_4

    .line 90
    .line 91
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 95
    throw p1

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    move-result-object v3

    .line 100
    .line 101
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 105
    move-result-object v5

    .line 106
    .line 107
    .line 108
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    move-result v3

    .line 110
    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 122
    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 126
    .line 127
    .line 128
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 129
    throw p1

    .line 130
    .line 131
    .line 132
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 133
    move-result-object v3

    .line 134
    .line 135
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 139
    move-result-object v5

    .line 140
    .line 141
    .line 142
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    move-result v3

    .line 144
    .line 145
    if-eqz v3, :cond_7

    .line 146
    .line 147
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 148
    .line 149
    .line 150
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    if-eqz v0, :cond_6

    .line 154
    .line 155
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 156
    .line 157
    goto/16 :goto_4

    .line 158
    .line 159
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 160
    .line 161
    .line 162
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 163
    throw p1

    .line 164
    .line 165
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 166
    .line 167
    new-instance v4, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-string v5, "getStore "

    .line 170
    .line 171
    .line 172
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    const-string v5, " liveID is empty"

    .line 175
    .line 176
    const-string v6, "message"

    .line 177
    .line 178
    .line 179
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    move-result-object v4

    .line 181
    const/4 v5, 0x1

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 185
    .line 186
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    move-result-object v3

    .line 191
    .line 192
    if-nez v3, :cond_9

    .line 193
    .line 194
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 195
    .line 196
    .line 197
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    if-nez v0, :cond_8

    .line 204
    goto :goto_0

    .line 205
    :cond_8
    move-object v3, v0

    .line 206
    .line 207
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 208
    .line 209
    const-string v0, "getName(...)"

    .line 210
    .line 211
    .line 212
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    .line 216
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    move-result-object v4

    .line 218
    .line 219
    if-nez v4, :cond_13

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 223
    move-result-object v4

    .line 224
    .line 225
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 229
    move-result-object v5

    .line 230
    .line 231
    .line 232
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    move-result v5

    .line 234
    .line 235
    if-eqz v5, :cond_a

    .line 236
    .line 237
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 238
    .line 239
    .line 240
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 241
    :goto_1
    move-object v4, v2

    .line 242
    .line 243
    goto/16 :goto_2

    .line 244
    .line 245
    .line 246
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 247
    move-result-object v2

    .line 248
    .line 249
    .line 250
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    move-result v2

    .line 252
    .line 253
    if-eqz v2, :cond_b

    .line 254
    .line 255
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 256
    .line 257
    .line 258
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 259
    goto :goto_1

    .line 260
    .line 261
    :cond_b
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 265
    move-result-object v2

    .line 266
    .line 267
    .line 268
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    move-result v2

    .line 270
    .line 271
    if-eqz v2, :cond_c

    .line 272
    .line 273
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 274
    .line 275
    .line 276
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 277
    goto :goto_1

    .line 278
    .line 279
    :cond_c
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 283
    move-result-object v2

    .line 284
    .line 285
    .line 286
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    move-result v2

    .line 288
    .line 289
    if-eqz v2, :cond_d

    .line 290
    .line 291
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 292
    .line 293
    .line 294
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 295
    goto :goto_1

    .line 296
    .line 297
    :cond_d
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 301
    move-result-object v2

    .line 302
    .line 303
    .line 304
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    move-result v2

    .line 306
    .line 307
    if-eqz v2, :cond_e

    .line 308
    .line 309
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 310
    .line 311
    .line 312
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 313
    goto :goto_1

    .line 314
    .line 315
    :cond_e
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 319
    move-result-object v2

    .line 320
    .line 321
    .line 322
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 323
    move-result v2

    .line 324
    .line 325
    if-eqz v2, :cond_f

    .line 326
    .line 327
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 328
    .line 329
    .line 330
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 331
    goto :goto_1

    .line 332
    .line 333
    :cond_f
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 337
    move-result-object v2

    .line 338
    .line 339
    .line 340
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    move-result v2

    .line 342
    .line 343
    if-eqz v2, :cond_10

    .line 344
    .line 345
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 346
    .line 347
    .line 348
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 349
    goto :goto_1

    .line 350
    .line 351
    :cond_10
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 355
    move-result-object v2

    .line 356
    .line 357
    .line 358
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    move-result v2

    .line 360
    .line 361
    if-eqz v2, :cond_11

    .line 362
    .line 363
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 364
    .line 365
    .line 366
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 367
    goto :goto_1

    .line 368
    .line 369
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 373
    move-result-object v2

    .line 374
    .line 375
    .line 376
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 377
    move-result v2

    .line 378
    .line 379
    if-eqz v2, :cond_12

    .line 380
    .line 381
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 382
    .line 383
    .line 384
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    goto/16 :goto_1

    .line 387
    .line 388
    .line 389
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    goto :goto_3

    .line 391
    .line 392
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 393
    .line 394
    .line 395
    const-string/jumbo p2, "type is not supported"

    .line 396
    .line 397
    .line 398
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 399
    throw p1

    .line 400
    :cond_13
    :goto_3
    move-object v0, v4

    .line 401
    .line 402
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 403
    .line 404
    :goto_4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/x;

    .line 405
    .line 406
    .line 407
    invoke-direct {v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/x;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, p1, v1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->exitBattle(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 411
    return-void
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method

.method public final terminateCrossRoomConnection()V
    .locals 7
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore"

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    throw v0

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v3

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 87
    throw v0

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    move-result-object v5

    .line 98
    .line 99
    .line 100
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    move-result v3

    .line 102
    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 114
    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 118
    .line 119
    .line 120
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 121
    throw v0

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 125
    move-result-object v3

    .line 126
    .line 127
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 131
    move-result-object v5

    .line 132
    .line 133
    .line 134
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    move-result v3

    .line 136
    .line 137
    if-eqz v3, :cond_7

    .line 138
    .line 139
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 148
    .line 149
    goto/16 :goto_4

    .line 150
    .line 151
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 155
    throw v0

    .line 156
    .line 157
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 158
    .line 159
    new-instance v4, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v5, "getStore "

    .line 162
    .line 163
    .line 164
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    const-string v5, " liveID is empty"

    .line 167
    .line 168
    const-string v6, "message"

    .line 169
    .line 170
    .line 171
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    move-result-object v4

    .line 173
    const/4 v5, 0x1

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 177
    .line 178
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    move-result-object v3

    .line 183
    .line 184
    if-nez v3, :cond_9

    .line 185
    .line 186
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 187
    .line 188
    .line 189
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    if-nez v0, :cond_8

    .line 196
    goto :goto_0

    .line 197
    :cond_8
    move-object v3, v0

    .line 198
    .line 199
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 200
    .line 201
    const-string v0, "getName(...)"

    .line 202
    .line 203
    .line 204
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    move-result-object v0

    .line 206
    .line 207
    .line 208
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    move-result-object v4

    .line 210
    .line 211
    if-nez v4, :cond_13

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 215
    move-result-object v4

    .line 216
    .line 217
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 221
    move-result-object v5

    .line 222
    .line 223
    .line 224
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    move-result v5

    .line 226
    .line 227
    if-eqz v5, :cond_a

    .line 228
    .line 229
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 230
    .line 231
    .line 232
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 233
    :goto_1
    move-object v4, v2

    .line 234
    .line 235
    goto/16 :goto_2

    .line 236
    .line 237
    :cond_a
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 241
    move-result-object v5

    .line 242
    .line 243
    .line 244
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    move-result v5

    .line 246
    .line 247
    if-eqz v5, :cond_b

    .line 248
    .line 249
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 250
    .line 251
    .line 252
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 253
    goto :goto_1

    .line 254
    .line 255
    :cond_b
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 259
    move-result-object v5

    .line 260
    .line 261
    .line 262
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 263
    move-result v5

    .line 264
    .line 265
    if-eqz v5, :cond_c

    .line 266
    .line 267
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 268
    .line 269
    .line 270
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 271
    goto :goto_1

    .line 272
    .line 273
    .line 274
    :cond_c
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 275
    move-result-object v2

    .line 276
    .line 277
    .line 278
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    move-result v2

    .line 280
    .line 281
    if-eqz v2, :cond_d

    .line 282
    .line 283
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 284
    .line 285
    .line 286
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 287
    goto :goto_1

    .line 288
    .line 289
    :cond_d
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 293
    move-result-object v2

    .line 294
    .line 295
    .line 296
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 297
    move-result v2

    .line 298
    .line 299
    if-eqz v2, :cond_e

    .line 300
    .line 301
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 302
    .line 303
    .line 304
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 305
    goto :goto_1

    .line 306
    .line 307
    :cond_e
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 311
    move-result-object v2

    .line 312
    .line 313
    .line 314
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 315
    move-result v2

    .line 316
    .line 317
    if-eqz v2, :cond_f

    .line 318
    .line 319
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 320
    .line 321
    .line 322
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 323
    goto :goto_1

    .line 324
    .line 325
    :cond_f
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 329
    move-result-object v2

    .line 330
    .line 331
    .line 332
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    move-result v2

    .line 334
    .line 335
    if-eqz v2, :cond_10

    .line 336
    .line 337
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 338
    .line 339
    .line 340
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 341
    goto :goto_1

    .line 342
    .line 343
    :cond_10
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 347
    move-result-object v2

    .line 348
    .line 349
    .line 350
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 351
    move-result v2

    .line 352
    .line 353
    if-eqz v2, :cond_11

    .line 354
    .line 355
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 356
    .line 357
    .line 358
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 359
    goto :goto_1

    .line 360
    .line 361
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 365
    move-result-object v2

    .line 366
    .line 367
    .line 368
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    move-result v2

    .line 370
    .line 371
    if-eqz v2, :cond_12

    .line 372
    .line 373
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 374
    .line 375
    .line 376
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    goto/16 :goto_1

    .line 379
    .line 380
    .line 381
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    goto :goto_3

    .line 383
    .line 384
    :cond_12
    new-instance v0, Ljava/lang/Exception;

    .line 385
    .line 386
    .line 387
    const-string/jumbo v1, "type is not supported"

    .line 388
    .line 389
    .line 390
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 391
    throw v0

    .line 392
    :cond_13
    :goto_3
    move-object v0, v4

    .line 393
    .line 394
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 395
    :goto_4
    const/4 v1, 0x0

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->exitHostConnection(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 399
    return-void
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

.method public final terminateIntraRoomConnection()V
    .locals 7
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

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
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoGuestAutoOpenCamera$atomicxcore_release()Z

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->stopCamera()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setCoGuestAutoOpenCamera$atomicxcore_release(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoGuestAutoOpenMicrophone$atomicxcore_release()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->stopMicrophone()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setCoGuestAutoOpenMicrophone$atomicxcore_release(Z)V

    .line 31
    .line 32
    :cond_1
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 52
    move-result-object v4

    .line 53
    .line 54
    .line 55
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    move-result v3

    .line 57
    .line 58
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore"

    .line 59
    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 71
    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 78
    throw v0

    .line 79
    .line 80
    .line 81
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 88
    move-result-object v5

    .line 89
    .line 90
    .line 91
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    move-result v3

    .line 93
    .line 94
    if-eqz v3, :cond_5

    .line 95
    .line 96
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 105
    .line 106
    goto/16 :goto_4

    .line 107
    .line 108
    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 109
    .line 110
    .line 111
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 112
    throw v0

    .line 113
    .line 114
    .line 115
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 116
    move-result-object v3

    .line 117
    .line 118
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 122
    move-result-object v5

    .line 123
    .line 124
    .line 125
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    move-result v3

    .line 127
    .line 128
    if-eqz v3, :cond_7

    .line 129
    .line 130
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 131
    .line 132
    .line 133
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 139
    .line 140
    goto/16 :goto_4

    .line 141
    .line 142
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 143
    .line 144
    .line 145
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 146
    throw v0

    .line 147
    .line 148
    .line 149
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 150
    move-result-object v3

    .line 151
    .line 152
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    move-result-object v5

    .line 157
    .line 158
    .line 159
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    move-result v3

    .line 161
    .line 162
    if-eqz v3, :cond_9

    .line 163
    .line 164
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    if-eqz v0, :cond_8

    .line 171
    .line 172
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 173
    .line 174
    goto/16 :goto_4

    .line 175
    .line 176
    :cond_8
    new-instance v0, Ljava/lang/NullPointerException;

    .line 177
    .line 178
    .line 179
    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 180
    throw v0

    .line 181
    .line 182
    :cond_9
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 183
    .line 184
    new-instance v4, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v5, "getStore "

    .line 187
    .line 188
    .line 189
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    const-string v5, " liveID is empty"

    .line 192
    .line 193
    const-string v6, "message"

    .line 194
    .line 195
    .line 196
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    move-result-object v4

    .line 198
    const/4 v5, 0x1

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 202
    .line 203
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    move-result-object v3

    .line 208
    .line 209
    if-nez v3, :cond_b

    .line 210
    .line 211
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 212
    .line 213
    .line 214
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    move-result-object v0

    .line 219
    .line 220
    if-nez v0, :cond_a

    .line 221
    goto :goto_0

    .line 222
    :cond_a
    move-object v3, v0

    .line 223
    .line 224
    :cond_b
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 225
    .line 226
    const-string v0, "getName(...)"

    .line 227
    .line 228
    .line 229
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 230
    move-result-object v0

    .line 231
    .line 232
    .line 233
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    move-result-object v4

    .line 235
    .line 236
    if-nez v4, :cond_15

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 240
    move-result-object v4

    .line 241
    .line 242
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 246
    move-result-object v5

    .line 247
    .line 248
    .line 249
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    move-result v5

    .line 251
    .line 252
    if-eqz v5, :cond_c

    .line 253
    .line 254
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 255
    .line 256
    .line 257
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 258
    :goto_1
    move-object v4, v2

    .line 259
    .line 260
    goto/16 :goto_2

    .line 261
    .line 262
    :cond_c
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 266
    move-result-object v5

    .line 267
    .line 268
    .line 269
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    move-result v5

    .line 271
    .line 272
    if-eqz v5, :cond_d

    .line 273
    .line 274
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 275
    .line 276
    .line 277
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 278
    goto :goto_1

    .line 279
    .line 280
    .line 281
    :cond_d
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 282
    move-result-object v2

    .line 283
    .line 284
    .line 285
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    move-result v2

    .line 287
    .line 288
    if-eqz v2, :cond_e

    .line 289
    .line 290
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 291
    .line 292
    .line 293
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 294
    goto :goto_1

    .line 295
    .line 296
    :cond_e
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 300
    move-result-object v2

    .line 301
    .line 302
    .line 303
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    move-result v2

    .line 305
    .line 306
    if-eqz v2, :cond_f

    .line 307
    .line 308
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 309
    .line 310
    .line 311
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 312
    goto :goto_1

    .line 313
    .line 314
    :cond_f
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 318
    move-result-object v2

    .line 319
    .line 320
    .line 321
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    move-result v2

    .line 323
    .line 324
    if-eqz v2, :cond_10

    .line 325
    .line 326
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 327
    .line 328
    .line 329
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 330
    goto :goto_1

    .line 331
    .line 332
    :cond_10
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 336
    move-result-object v2

    .line 337
    .line 338
    .line 339
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 340
    move-result v2

    .line 341
    .line 342
    if-eqz v2, :cond_11

    .line 343
    .line 344
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 345
    .line 346
    .line 347
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 348
    goto :goto_1

    .line 349
    .line 350
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 354
    move-result-object v2

    .line 355
    .line 356
    .line 357
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    move-result v2

    .line 359
    .line 360
    if-eqz v2, :cond_12

    .line 361
    .line 362
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 363
    .line 364
    .line 365
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 366
    goto :goto_1

    .line 367
    .line 368
    :cond_12
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 372
    move-result-object v2

    .line 373
    .line 374
    .line 375
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 376
    move-result v2

    .line 377
    .line 378
    if-eqz v2, :cond_13

    .line 379
    .line 380
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 381
    .line 382
    .line 383
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 384
    goto :goto_1

    .line 385
    .line 386
    :cond_13
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 390
    move-result-object v2

    .line 391
    .line 392
    .line 393
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 394
    move-result v2

    .line 395
    .line 396
    if-eqz v2, :cond_14

    .line 397
    .line 398
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 399
    .line 400
    .line 401
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    goto/16 :goto_1

    .line 404
    .line 405
    .line 406
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    goto :goto_3

    .line 408
    .line 409
    :cond_14
    new-instance v0, Ljava/lang/Exception;

    .line 410
    .line 411
    .line 412
    const-string/jumbo v1, "type is not supported"

    .line 413
    .line 414
    .line 415
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 416
    throw v0

    .line 417
    :cond_15
    :goto_3
    move-object v0, v4

    .line 418
    .line 419
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 420
    :goto_4
    const/4 v1, 0x0

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->disconnect(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 424
    return-void
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

.method public final unmuteMicrophone(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 7
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore"

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p1

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v3

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 87
    throw p1

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    move-result-object v5

    .line 98
    .line 99
    .line 100
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    move-result v3

    .line 102
    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 114
    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 118
    .line 119
    .line 120
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 121
    throw p1

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 125
    move-result-object v3

    .line 126
    .line 127
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 131
    move-result-object v5

    .line 132
    .line 133
    .line 134
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    move-result v3

    .line 136
    .line 137
    if-eqz v3, :cond_7

    .line 138
    .line 139
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 148
    .line 149
    goto/16 :goto_4

    .line 150
    .line 151
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 152
    .line 153
    .line 154
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 155
    throw p1

    .line 156
    .line 157
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 158
    .line 159
    new-instance v4, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v5, "getStore "

    .line 162
    .line 163
    .line 164
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    const-string v5, " liveID is empty"

    .line 167
    .line 168
    const-string v6, "message"

    .line 169
    .line 170
    .line 171
    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    move-result-object v4

    .line 173
    const/4 v5, 0x1

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 177
    .line 178
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    move-result-object v3

    .line 183
    .line 184
    if-nez v3, :cond_9

    .line 185
    .line 186
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 187
    .line 188
    .line 189
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    if-nez v0, :cond_8

    .line 196
    goto :goto_0

    .line 197
    :cond_8
    move-object v3, v0

    .line 198
    .line 199
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 200
    .line 201
    const-string v0, "getName(...)"

    .line 202
    .line 203
    .line 204
    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    move-result-object v0

    .line 206
    .line 207
    .line 208
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    move-result-object v4

    .line 210
    .line 211
    if-nez v4, :cond_13

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 215
    move-result-object v4

    .line 216
    .line 217
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 221
    move-result-object v5

    .line 222
    .line 223
    .line 224
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    move-result v5

    .line 226
    .line 227
    if-eqz v5, :cond_a

    .line 228
    .line 229
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 230
    .line 231
    .line 232
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 233
    :goto_1
    move-object v4, v2

    .line 234
    .line 235
    goto/16 :goto_2

    .line 236
    .line 237
    :cond_a
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 241
    move-result-object v5

    .line 242
    .line 243
    .line 244
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    move-result v5

    .line 246
    .line 247
    if-eqz v5, :cond_b

    .line 248
    .line 249
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 250
    .line 251
    .line 252
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 253
    goto :goto_1

    .line 254
    .line 255
    :cond_b
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 259
    move-result-object v5

    .line 260
    .line 261
    .line 262
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 263
    move-result v5

    .line 264
    .line 265
    if-eqz v5, :cond_c

    .line 266
    .line 267
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 268
    .line 269
    .line 270
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 271
    goto :goto_1

    .line 272
    .line 273
    :cond_c
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 277
    move-result-object v5

    .line 278
    .line 279
    .line 280
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    move-result v5

    .line 282
    .line 283
    if-eqz v5, :cond_d

    .line 284
    .line 285
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 286
    .line 287
    .line 288
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 289
    goto :goto_1

    .line 290
    .line 291
    :cond_d
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 295
    move-result-object v5

    .line 296
    .line 297
    .line 298
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    move-result v5

    .line 300
    .line 301
    if-eqz v5, :cond_e

    .line 302
    .line 303
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 304
    .line 305
    .line 306
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 307
    goto :goto_1

    .line 308
    .line 309
    :cond_e
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 313
    move-result-object v5

    .line 314
    .line 315
    .line 316
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 317
    move-result v5

    .line 318
    .line 319
    if-eqz v5, :cond_f

    .line 320
    .line 321
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 322
    .line 323
    .line 324
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 325
    goto :goto_1

    .line 326
    .line 327
    :cond_f
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 331
    move-result-object v5

    .line 332
    .line 333
    .line 334
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 335
    move-result v5

    .line 336
    .line 337
    if-eqz v5, :cond_10

    .line 338
    .line 339
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 340
    .line 341
    .line 342
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 343
    goto :goto_1

    .line 344
    .line 345
    .line 346
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 347
    move-result-object v2

    .line 348
    .line 349
    .line 350
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 351
    move-result v2

    .line 352
    .line 353
    if-eqz v2, :cond_11

    .line 354
    .line 355
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 356
    .line 357
    .line 358
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 359
    goto :goto_1

    .line 360
    .line 361
    :cond_11
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 365
    move-result-object v2

    .line 366
    .line 367
    .line 368
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    move-result v2

    .line 370
    .line 371
    if-eqz v2, :cond_12

    .line 372
    .line 373
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 374
    .line 375
    .line 376
    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    goto/16 :goto_1

    .line 379
    .line 380
    .line 381
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    goto :goto_3

    .line 383
    .line 384
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 385
    .line 386
    .line 387
    const-string/jumbo v0, "type is not supported"

    .line 388
    .line 389
    .line 390
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 391
    throw p1

    .line 392
    :cond_13
    :goto_3
    move-object v0, v4

    .line 393
    .line 394
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 395
    .line 396
    :goto_4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/y;

    .line 397
    .line 398
    .line 399
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/y;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->unmuteMicrophone(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 403
    return-void
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
.end method

.method public final unregisterBattleObserver(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;)V
    .locals 2
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "observer"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->callbackHandler:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    iget-object v0, v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/V;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/V;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final unregisterConnectionObserver(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 2
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    .line 1
    .line 2
    const-string v0, "observer"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->callbackHandler:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    iget-object v0, v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/W;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/W;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
