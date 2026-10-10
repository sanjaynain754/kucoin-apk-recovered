.class public final Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0007\n\u0002\u0008\u000f\n\u0002\u0010\u0006\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ/\u0010$\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008$\u0010%J\u0019\u0010(\u001a\u00020\u000f2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008*\u0010\u001fJ\u001f\u0010/\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008/\u00100R\u001a\u00101\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104R\u001a\u00106\u001a\u0002058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R\u001a\u0010;\u001a\u00020:8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R$\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010?\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010\u0013R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010C\u001a\u0004\u0008D\u0010E\"\u0004\u0008F\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010G\u001a\u0004\u0008H\u0010I\"\u0004\u0008J\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010K\u001a\u0004\u0008L\u0010M\"\u0004\u0008N\u0010\u001dR\"\u0010P\u001a\u00020O8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008P\u0010Q\u001a\u0004\u0008R\u0010S\"\u0004\u0008T\u0010UR\"\u0010V\u001a\u00020O8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008V\u0010Q\u001a\u0004\u0008W\u0010S\"\u0004\u0008X\u0010UR\"\u0010Y\u001a\u00020O8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008Y\u0010Q\u001a\u0004\u0008Z\u0010S\"\u0004\u0008[\u0010UR\"\u0010\\\u001a\u00020O8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\\\u0010Q\u001a\u0004\u0008]\u0010S\"\u0004\u0008^\u0010UR\"\u0010`\u001a\u00020_8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008`\u0010a\u001a\u0004\u0008b\u0010c\"\u0004\u0008d\u0010eR\"\u0010f\u001a\u00020_8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008f\u0010a\u001a\u0004\u0008g\u0010c\"\u0004\u0008h\u0010eR\"\u0010i\u001a\u00020O8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008i\u0010Q\u001a\u0004\u0008j\u0010S\"\u0004\u0008k\u0010UR\"\u0010l\u001a\u00020O8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008l\u0010Q\u001a\u0004\u0008m\u0010S\"\u0004\u0008n\u0010UR$\u0010p\u001a\u0004\u0018\u00010o8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008p\u0010q\u001a\u0004\u0008r\u0010s\"\u0004\u0008t\u0010uR$\u0010\'\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010v\u001a\u0004\u0008w\u0010x\"\u0004\u0008y\u0010)R\"\u0010z\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008z\u0010K\u001a\u0004\u0008{\u0010M\"\u0004\u0008|\u0010\u001d\u00a8\u0006}"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/view/View$OnTouchListener;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;",
        "streamType",
        "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;",
        "participant",
        "",
        "init",
        "(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V",
        "updateStreamType",
        "(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;)V",
        "updateParticipant",
        "(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V",
        "Lio/trtc/tuikit/atomicxcore/api/view/FillMode;",
        "fillMode",
        "setFillMode",
        "(Lio/trtc/tuikit/atomicxcore/api/view/FillMode;)V",
        "",
        "isActive",
        "setActive",
        "(Z)V",
        "onDetachedFromWindow",
        "()V",
        "w",
        "h",
        "oldw",
        "oldh",
        "onSizeChanged",
        "(IIII)V",
        "Landroid/view/View$OnClickListener;",
        "clickListener",
        "setOnClickListener",
        "(Landroid/view/View$OnClickListener;)V",
        "requestLayout",
        "Landroid/view/View;",
        "view",
        "Landroid/view/MotionEvent;",
        "event",
        "onTouch",
        "(Landroid/view/View;Landroid/view/MotionEvent;)Z",
        "oid",
        "I",
        "getOid$atomicxcore_release",
        "()I",
        "Lio/trtc/tuikit/atomicxcore/impl/common/r;",
        "log",
        "Lio/trtc/tuikit/atomicxcore/impl/common/r;",
        "getLog$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/impl/common/r;",
        "Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;",
        "videoView",
        "Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;",
        "getVideoView$atomicxcore_release",
        "()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;",
        "Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;",
        "getStreamType$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;",
        "setStreamType$atomicxcore_release",
        "Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;",
        "getParticipant$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;",
        "setParticipant$atomicxcore_release",
        "Lio/trtc/tuikit/atomicxcore/api/view/FillMode;",
        "getFillMode$atomicxcore_release",
        "()Lio/trtc/tuikit/atomicxcore/api/view/FillMode;",
        "setFillMode$atomicxcore_release",
        "Z",
        "isActive$atomicxcore_release",
        "()Z",
        "setActive$atomicxcore_release",
        "",
        "pressedPoint1X",
        "F",
        "getPressedPoint1X$atomicxcore_release",
        "()F",
        "setPressedPoint1X$atomicxcore_release",
        "(F)V",
        "pressedPoint2X",
        "getPressedPoint2X$atomicxcore_release",
        "setPressedPoint2X$atomicxcore_release",
        "pressedPoint1Y",
        "getPressedPoint1Y$atomicxcore_release",
        "setPressedPoint1Y$atomicxcore_release",
        "pressedPoint2Y",
        "getPressedPoint2Y$atomicxcore_release",
        "setPressedPoint2Y$atomicxcore_release",
        "",
        "distBeforeMove",
        "D",
        "getDistBeforeMove$atomicxcore_release",
        "()D",
        "setDistBeforeMove$atomicxcore_release",
        "(D)V",
        "distAfterMove",
        "getDistAfterMove$atomicxcore_release",
        "setDistAfterMove$atomicxcore_release",
        "touchDownPointX",
        "getTouchDownPointX$atomicxcore_release",
        "setTouchDownPointX$atomicxcore_release",
        "touchDownPointY",
        "getTouchDownPointY$atomicxcore_release",
        "setTouchDownPointY$atomicxcore_release",
        "Ljava/lang/Runnable;",
        "measureLayoutRunnable",
        "Ljava/lang/Runnable;",
        "getMeasureLayoutRunnable$atomicxcore_release",
        "()Ljava/lang/Runnable;",
        "setMeasureLayoutRunnable$atomicxcore_release",
        "(Ljava/lang/Runnable;)V",
        "Landroid/view/View$OnClickListener;",
        "getClickListener$atomicxcore_release",
        "()Landroid/view/View$OnClickListener;",
        "setClickListener$atomicxcore_release",
        "isClickAction",
        "isClickAction$atomicxcore_release",
        "setClickAction$atomicxcore_release",
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


# instance fields
.field private clickListener:Landroid/view/View$OnClickListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private distAfterMove:D

.field private distBeforeMove:D

.field private fillMode:Lio/trtc/tuikit/atomicxcore/api/view/FillMode;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isActive:Z

.field private isClickAction:Z

.field private final log:Lio/trtc/tuikit/atomicxcore/impl/common/r;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private measureLayoutRunnable:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final oid:I

.field private participant:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private pressedPoint1X:F

.field private pressedPoint1Y:F

.field private pressedPoint2X:F

.field private pressedPoint2Y:F

.field private streamType:Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private touchDownPointX:F

.field private touchDownPointY:F

.field private final videoView:Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
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

    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p2

    iput p2, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->oid:I

    .line 6
    const-string p2, "file"

    const-string p3, "AtomicXCore-Room"

    const-string v0, "RoomParticipantView"

    invoke-static {v0, p2, p3, v0}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object p2

    .line 7
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->log:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    new-instance p2, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->videoView:Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    .line 9
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->a(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)V

    .line 10
    invoke-virtual {p0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

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
    invoke-direct {p0, p1, p2, p3}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final getClickListener$atomicxcore_release()Landroid/view/View$OnClickListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->clickListener:Landroid/view/View$OnClickListener;

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

.method public final getDistAfterMove$atomicxcore_release()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->distAfterMove:D

    .line 3
    return-wide v0
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

.method public final getDistBeforeMove$atomicxcore_release()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->distBeforeMove:D

    .line 3
    return-wide v0
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

.method public final getFillMode$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/FillMode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->fillMode:Lio/trtc/tuikit/atomicxcore/api/view/FillMode;

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

.method public final getLog$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->log:Lio/trtc/tuikit/atomicxcore/impl/common/r;

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

.method public final getMeasureLayoutRunnable$atomicxcore_release()Ljava/lang/Runnable;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->measureLayoutRunnable:Ljava/lang/Runnable;

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
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->oid:I

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

.method public final getParticipant$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->participant:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

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

.method public final getPressedPoint1X$atomicxcore_release()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->pressedPoint1X:F

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

.method public final getPressedPoint1Y$atomicxcore_release()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->pressedPoint1Y:F

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

.method public final getPressedPoint2X$atomicxcore_release()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->pressedPoint2X:F

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

.method public final getPressedPoint2Y$atomicxcore_release()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->pressedPoint2Y:F

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

.method public final getStreamType$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->streamType:Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;

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

.method public final getTouchDownPointX$atomicxcore_release()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->touchDownPointX:F

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

.method public final getTouchDownPointY$atomicxcore_release()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->touchDownPointY:F

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

.method public final getVideoView$atomicxcore_release()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->videoView:Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

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

.method public final init(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V
    .locals 3
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "streamType"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v1, "participant"

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
    .line 25
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setStreamType$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setParticipant$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->c(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-static {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->a(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V

    .line 38
    :cond_0
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public final isActive$atomicxcore_release()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->isActive:Z

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

.method public final isClickAction$atomicxcore_release()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->isClickAction:Z

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

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->d(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 7
    return-void
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

.method public onSizeChanged(IIII)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 4
    .line 5
    const-string p2, "<this>"

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    if-eq p1, p3, :cond_2

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->c(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getParticipant$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    sget-object p2, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->f:Lkotlin/Lazy;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/view/room/d;->a()Lio/trtc/tuikit/atomicxcore/impl/view/room/i;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getVideoView$atomicxcore_release()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    .line 36
    move-result-object p3

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const-string/jumbo p4, "userID"

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string/jumbo p4, "view"

    .line 49
    .line 50
    .line 51
    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    iget-object p4, p2, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->d:Ljava/util/HashMap;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    move-result-object p4

    .line 58
    .line 59
    check-cast p4, Lio/trtc/tuikit/atomicxcore/impl/view/room/e;

    .line 60
    .line 61
    if-nez p4, :cond_0

    .line 62
    goto :goto_1

    .line 63
    .line 64
    :cond_0
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->c:Ljava/util/HashSet;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/util/HashSet;->size()I

    .line 68
    move-result p2

    .line 69
    const/4 v0, 0x5

    .line 70
    .line 71
    if-lt p2, v0, :cond_1

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    .line 75
    move-result p2

    .line 76
    .line 77
    const/16 p3, 0x3c0

    .line 78
    .line 79
    if-gt p2, p3, :cond_1

    .line 80
    .line 81
    sget-object p2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM_LOW:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 82
    goto :goto_0

    .line 83
    .line 84
    :cond_1
    sget-object p2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 85
    .line 86
    :goto_0
    iget-object p3, p4, Lio/trtc/tuikit/atomicxcore/impl/view/room/e;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 87
    .line 88
    if-eq p2, p3, :cond_2

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/view/room/d;->a()Lio/trtc/tuikit/atomicxcore/impl/view/room/i;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getVideoView$atomicxcore_release()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    .line 96
    move-result-object p3

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, p1, p3}, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 100
    :cond_2
    :goto_1
    return-void
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
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "view"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "event"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->a(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 15
    move-result p1

    .line 16
    return p1
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
.end method

.method public requestLayout()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->requestLayout()V

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
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getMeasureLayoutRunnable$atomicxcore_release()Ljava/lang/Runnable;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public final setActive(Z)V
    .locals 1

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
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setActive$atomicxcore_release(Z)V

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->d(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)V

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->c(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)Z

    .line 18
    move-result p1

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getStreamType$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getParticipant$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->a(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V

    .line 38
    :cond_1
    return-void
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

.method public final setActive$atomicxcore_release(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->isActive:Z

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

.method public final setClickAction$atomicxcore_release(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->isClickAction:Z

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

.method public final setClickListener$atomicxcore_release(Landroid/view/View$OnClickListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->clickListener:Landroid/view/View$OnClickListener;

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

.method public final setDistAfterMove$atomicxcore_release(D)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->distAfterMove:D

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

.method public final setDistBeforeMove$atomicxcore_release(D)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->distBeforeMove:D

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

.method public final setFillMode(Lio/trtc/tuikit/atomicxcore/api/view/FillMode;)V
    .locals 2
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/view/FillMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "fillMode"

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
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setFillMode$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/FillMode;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->c(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getStreamType$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getParticipant$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->a(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;Lio/trtc/tuikit/atomicxcore/api/view/FillMode;)V

    .line 40
    :cond_0
    return-void
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

.method public final setFillMode$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/FillMode;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/view/FillMode;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->fillMode:Lio/trtc/tuikit/atomicxcore/api/view/FillMode;

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

.method public final setMeasureLayoutRunnable$atomicxcore_release(Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->measureLayoutRunnable:Ljava/lang/Runnable;

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

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    .line 5
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->clickListener:Landroid/view/View$OnClickListener;

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

.method public final setParticipant$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->participant:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

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

.method public final setPressedPoint1X$atomicxcore_release(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->pressedPoint1X:F

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

.method public final setPressedPoint1Y$atomicxcore_release(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->pressedPoint1Y:F

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

.method public final setPressedPoint2X$atomicxcore_release(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->pressedPoint2X:F

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

.method public final setPressedPoint2Y$atomicxcore_release(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->pressedPoint2Y:F

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

.method public final setStreamType$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->streamType:Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;

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

.method public final setTouchDownPointX$atomicxcore_release(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->touchDownPointX:F

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

.method public final setTouchDownPointY$atomicxcore_release(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->touchDownPointY:F

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

.method public final updateParticipant(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V
    .locals 2
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "participant"

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
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setParticipant$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->c(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getStreamType$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->a(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V

    .line 33
    :cond_0
    return-void
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
.end method

.method public final updateStreamType(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;)V
    .locals 2
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "streamType"

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
    .line 17
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->setStreamType$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->c(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;->getParticipant$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/b;->a(Lio/trtc/tuikit/atomicxcore/api/view/RoomParticipantView;Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V

    .line 34
    :cond_0
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
