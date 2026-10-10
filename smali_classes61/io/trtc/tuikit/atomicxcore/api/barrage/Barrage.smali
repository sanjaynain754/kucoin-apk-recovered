.class public final Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008*\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bk\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\u0015\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003Jo\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00107\u001a\u0002082\u0008\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020;H\u00d6\u0001J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0012\"\u0004\u0008\u0016\u0010\u0014R&\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u0012\"\u0004\u0008\u001c\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010\u0012\"\u0004\u0008*\u0010\u0014R\u001a\u0010\u0008\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010&\"\u0004\u0008,\u0010(\u00a8\u0006="
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;",
        "",
        "liveID",
        "",
        "sender",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
        "sequence",
        "",
        "timestampInSecond",
        "messageType",
        "Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;",
        "textContent",
        "extensionInfo",
        "",
        "businessID",
        "data",
        "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V",
        "getBusinessID",
        "()Ljava/lang/String;",
        "setBusinessID",
        "(Ljava/lang/String;)V",
        "getData",
        "setData",
        "getExtensionInfo",
        "()Ljava/util/Map;",
        "setExtensionInfo",
        "(Ljava/util/Map;)V",
        "getLiveID",
        "setLiveID",
        "getMessageType",
        "()Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;",
        "setMessageType",
        "(Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;)V",
        "getSender",
        "()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
        "setSender",
        "(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V",
        "getSequence",
        "()J",
        "setSequence",
        "(J)V",
        "getTextContent",
        "setTextContent",
        "getTimestampInSecond",
        "setTimestampInSecond",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private businessID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private data:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private extensionInfo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private liveID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private messageType:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private sender:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private sequence:J

.field private textContent:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private timestampInSecond:J


# direct methods
.method public constructor <init>()V
    .locals 14

    const/16 v12, 0x1ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v13}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
            "JJ",
            "Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "liveID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sender"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageType"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "textContent"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extensionInfo"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "businessID"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->liveID:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sender:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 5
    iput-wide p3, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sequence:J

    .line 6
    iput-wide p5, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->timestampInSecond:J

    .line 7
    iput-object p7, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->messageType:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

    .line 8
    iput-object p8, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->textContent:Ljava/lang/String;

    .line 9
    iput-object p9, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->extensionInfo:Ljava/util/Map;

    .line 10
    iput-object p10, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->businessID:Ljava/lang/String;

    .line 11
    iput-object p11, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->data:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    const-string v2, ""

    if-eqz v1, :cond_0

    move-object p1, v2

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 12
    new-instance v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v3

    :cond_1
    and-int/lit8 v1, v0, 0x4

    const-wide/16 v3, 0x0

    if-eqz v1, :cond_2

    move-wide v5, v3

    goto :goto_0

    :cond_2
    move-wide v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move-wide v3, p5

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    .line 13
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;->TEXT:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

    goto :goto_2

    :cond_4
    move-object/from16 v1, p7

    :goto_2
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move-object v7, v2

    goto :goto_3

    :cond_5
    move-object/from16 v7, p8

    :goto_3
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    .line 14
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v8

    goto :goto_4

    :cond_6
    move-object/from16 v8, p9

    :goto_4
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move-object v9, v2

    goto :goto_5

    :cond_7
    move-object/from16 v9, p10

    :goto_5
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    move-object/from16 p12, v2

    :goto_6
    move-object p3, p2

    move-object/from16 p8, v1

    move-wide/from16 p6, v3

    move-wide p4, v5

    move-object/from16 p9, v7

    move-object/from16 p10, v8

    move-object/from16 p11, v9

    move-object p2, p1

    move-object p1, p0

    goto :goto_7

    :cond_8
    move-object/from16 p12, p11

    goto :goto_6

    .line 15
    :goto_7
    invoke-direct/range {p1 .. p12}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p13, p12, 0x1

    .line 3
    .line 4
    if-eqz p13, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->liveID:Ljava/lang/String;

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p13, p12, 0x2

    .line 9
    .line 10
    if-eqz p13, :cond_1

    .line 11
    .line 12
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sender:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 13
    .line 14
    :cond_1
    and-int/lit8 p13, p12, 0x4

    .line 15
    .line 16
    if-eqz p13, :cond_2

    .line 17
    .line 18
    iget-wide p3, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sequence:J

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p13, p12, 0x8

    .line 21
    .line 22
    if-eqz p13, :cond_3

    .line 23
    .line 24
    iget-wide p5, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->timestampInSecond:J

    .line 25
    .line 26
    :cond_3
    and-int/lit8 p13, p12, 0x10

    .line 27
    .line 28
    if-eqz p13, :cond_4

    .line 29
    .line 30
    iget-object p7, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->messageType:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

    .line 31
    .line 32
    :cond_4
    and-int/lit8 p13, p12, 0x20

    .line 33
    .line 34
    if-eqz p13, :cond_5

    .line 35
    .line 36
    iget-object p8, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->textContent:Ljava/lang/String;

    .line 37
    .line 38
    :cond_5
    and-int/lit8 p13, p12, 0x40

    .line 39
    .line 40
    if-eqz p13, :cond_6

    .line 41
    .line 42
    iget-object p9, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->extensionInfo:Ljava/util/Map;

    .line 43
    .line 44
    :cond_6
    and-int/lit16 p13, p12, 0x80

    .line 45
    .line 46
    if-eqz p13, :cond_7

    .line 47
    .line 48
    iget-object p10, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->businessID:Ljava/lang/String;

    .line 49
    .line 50
    :cond_7
    and-int/lit16 p12, p12, 0x100

    .line 51
    .line 52
    if-eqz p12, :cond_8

    .line 53
    .line 54
    iget-object p11, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->data:Ljava/lang/String;

    .line 55
    :cond_8
    move-object p12, p10

    .line 56
    move-object p13, p11

    .line 57
    move-object p10, p8

    .line 58
    move-object p11, p9

    .line 59
    move-object p9, p7

    .line 60
    move-wide p7, p5

    .line 61
    move-wide p5, p3

    .line 62
    move-object p3, p1

    .line 63
    move-object p4, p2

    .line 64
    move-object p2, p0

    .line 65
    .line 66
    .line 67
    invoke-virtual/range {p2 .. p13}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->copy(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;

    .line 68
    move-result-object p0

    .line 69
    return-object p0
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
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->liveID:Ljava/lang/String;

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

.method public final component2()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sender:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

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

.method public final component3()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sequence:J

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

.method public final component4()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->timestampInSecond:J

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

.method public final component5()Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->messageType:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

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

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->textContent:Ljava/lang/String;

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

.method public final component7()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->extensionInfo:Ljava/util/Map;

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

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->businessID:Ljava/lang/String;

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

.method public final component9()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->data:Ljava/lang/String;

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

.method public final copy(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
            "JJ",
            "Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "liveID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "sender"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "messageType"

    .line 13
    .line 14
    move-object/from16 v8, p7

    .line 15
    .line 16
    .line 17
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string/jumbo v0, "textContent"

    .line 21
    .line 22
    move-object/from16 v9, p8

    .line 23
    .line 24
    .line 25
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    const-string v0, "extensionInfo"

    .line 28
    .line 29
    move-object/from16 v10, p9

    .line 30
    .line 31
    .line 32
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    const-string v0, "businessID"

    .line 35
    .line 36
    move-object/from16 v11, p10

    .line 37
    .line 38
    .line 39
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    const-string v0, "data"

    .line 42
    .line 43
    move-object/from16 v12, p11

    .line 44
    .line 45
    .line 46
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;

    .line 49
    move-object v2, p1

    .line 50
    move-object v3, p2

    .line 51
    .line 52
    move-wide/from16 v4, p3

    .line 53
    .line 54
    move-wide/from16 v6, p5

    .line 55
    .line 56
    .line 57
    invoke-direct/range {v1 .. v12}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    return-object v1
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
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;

    .line 13
    .line 14
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->liveID:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->liveID:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sender:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 26
    .line 27
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sender:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    return v2

    .line 35
    .line 36
    :cond_3
    iget-wide v3, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sequence:J

    .line 37
    .line 38
    iget-wide v5, p1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sequence:J

    .line 39
    .line 40
    cmp-long v1, v3, v5

    .line 41
    .line 42
    if-eqz v1, :cond_4

    .line 43
    return v2

    .line 44
    .line 45
    :cond_4
    iget-wide v3, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->timestampInSecond:J

    .line 46
    .line 47
    iget-wide v5, p1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->timestampInSecond:J

    .line 48
    .line 49
    cmp-long v1, v3, v5

    .line 50
    .line 51
    if-eqz v1, :cond_5

    .line 52
    return v2

    .line 53
    .line 54
    :cond_5
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->messageType:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

    .line 55
    .line 56
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->messageType:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

    .line 57
    .line 58
    if-eq v1, v3, :cond_6

    .line 59
    return v2

    .line 60
    .line 61
    :cond_6
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->textContent:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->textContent:Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v1

    .line 68
    .line 69
    if-nez v1, :cond_7

    .line 70
    return v2

    .line 71
    .line 72
    :cond_7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->extensionInfo:Ljava/util/Map;

    .line 73
    .line 74
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->extensionInfo:Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    move-result v1

    .line 79
    .line 80
    if-nez v1, :cond_8

    .line 81
    return v2

    .line 82
    .line 83
    :cond_8
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->businessID:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->businessID:Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    move-result v1

    .line 90
    .line 91
    if-nez v1, :cond_9

    .line 92
    return v2

    .line 93
    .line 94
    :cond_9
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->data:Ljava/lang/String;

    .line 95
    .line 96
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->data:Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    move-result p1

    .line 101
    .line 102
    if-nez p1, :cond_a

    .line 103
    return v2

    .line 104
    :cond_a
    return v0
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

.method public final getBusinessID()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->businessID:Ljava/lang/String;

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

.method public final getData()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->data:Ljava/lang/String;

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

.method public final getExtensionInfo()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->extensionInfo:Ljava/util/Map;

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

.method public final getLiveID()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->liveID:Ljava/lang/String;

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

.method public final getMessageType()Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->messageType:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

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

.method public final getSender()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sender:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

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

.method public final getSequence()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sequence:J

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

.method public final getTextContent()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->textContent:Ljava/lang/String;

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

.method public final getTimestampInSecond()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->timestampInSecond:J

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

.method public hashCode()I
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->liveID:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sender:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->hashCode()I

    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    .line 19
    iget-wide v3, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sequence:J

    .line 20
    .line 21
    .line 22
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    .line 27
    iget-wide v2, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->timestampInSecond:J

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    .line 35
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->messageType:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v2

    .line 41
    mul-int/2addr v0, v1

    .line 42
    .line 43
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->textContent:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/barrage/a;->a(Ljava/lang/String;II)I

    .line 47
    move-result v0

    .line 48
    .line 49
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->extensionInfo:Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 53
    move-result v2

    .line 54
    add-int/2addr v2, v0

    .line 55
    mul-int/2addr v2, v1

    .line 56
    .line 57
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->businessID:Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/api/barrage/a;->a(Ljava/lang/String;II)I

    .line 61
    move-result v0

    .line 62
    .line 63
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->data:Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 67
    move-result v1

    .line 68
    add-int/2addr v1, v0

    .line 69
    return v1
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

.method public final setBusinessID(Ljava/lang/String;)V
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->businessID:Ljava/lang/String;

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

.method public final setData(Ljava/lang/String;)V
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->data:Ljava/lang/String;

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

.method public final setExtensionInfo(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->extensionInfo:Ljava/util/Map;

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

.method public final setLiveID(Ljava/lang/String;)V
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->liveID:Ljava/lang/String;

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

.method public final setMessageType(Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->messageType:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

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

.method public final setSender(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sender:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

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

.method public final setSequence(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sequence:J

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

.method public final setTextContent(Ljava/lang/String;)V
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->textContent:Ljava/lang/String;

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

.method public final setTimestampInSecond(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->timestampInSecond:J

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

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "Barrage(liveID="

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->liveID:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, ", sender="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sender:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, ", sequence="

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget-wide v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->sequence:J

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, ", timestampInSecond="

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget-wide v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->timestampInSecond:J

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, ", messageType="

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->messageType:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, ", textContent="

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->textContent:Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, ", extensionInfo="

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->extensionInfo:Ljava/util/Map;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, ", businessID="

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->businessID:Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v1, ", data="

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;->data:Ljava/lang/String;

    .line 90
    .line 91
    const/16 v2, 0x29

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/barrage/b;->a(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 95
    move-result-object v0

    .line 96
    return-object v0
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
