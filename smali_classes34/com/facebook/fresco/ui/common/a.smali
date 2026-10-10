.class public final Lcom/facebook/fresco/ui/common/a;
.super Lg5/c;
.source "ImagePerfState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0003\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00062\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001b\u0010\u0017J\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001d\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001f\u0010\u0017J\u0015\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0014\u00a2\u0006\u0004\u0008!\u0010\u0017J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0014\u00a2\u0006\u0004\u0008#\u0010\u0017J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010)\u001a\u00020\u00062\u0008\u0010(\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008)\u0010\u0013J\u0015\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*\u00a2\u0006\u0004\u0008,\u0010-J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020*\u00a2\u0006\u0004\u0008/\u0010-J\u0017\u00102\u001a\u00020\u00062\u0008\u00101\u001a\u0004\u0018\u000100\u00a2\u0006\u0004\u00082\u00103J\u0015\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020$\u00a2\u0006\u0004\u00085\u0010\'J\r\u00107\u001a\u000206\u00a2\u0006\u0004\u00087\u00108J\u0017\u0010;\u001a\u00020\u00062\u0008\u0010:\u001a\u0004\u0018\u000109\u00a2\u0006\u0004\u0008;\u0010<R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010>R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR$\u0010F\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008B\u0010A\u001a\u0004\u0008C\u0010D\"\u0004\u0008E\u0010\u0013R\u0018\u0010(\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010AR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010!R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010!R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010!R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010!R\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010!R\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010!R\u0016\u0010H\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010GR\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u0010\u0012R\u0016\u0010.\u001a\u00020*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010\u0012R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010IR\"\u0010P\u001a\u00020J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010N\"\u0004\u0008K\u0010OR\u0016\u0010S\u001a\u00020Q8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010RR\"\u0010W\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010!\u001a\u0004\u0008T\u0010U\"\u0004\u0008V\u0010\u0017R\u0016\u0010\"\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010!R\u0018\u0010Y\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010X\u00a8\u0006Z"
    }
    d2 = {
        "Lcom/facebook/fresco/ui/common/a;",
        "Lg5/c;",
        "Lcom/facebook/fresco/ui/common/ImageRenderingInfra;",
        "infra",
        "<init>",
        "(Lcom/facebook/fresco/ui/common/ImageRenderingInfra;)V",
        "",
        "w",
        "()V",
        "x",
        "",
        "controllerId",
        "B",
        "(Ljava/lang/String;)V",
        "requestId",
        "P",
        "",
        "imageRequest",
        "I",
        "(Ljava/lang/Object;)V",
        "",
        "controllerSubmitTimeMs",
        "D",
        "(J)V",
        "controllerIntermediateImageSetTimeMs",
        "C",
        "controllerFinalImageSetTimeMs",
        "A",
        "controllerFailureTimeMs",
        "z",
        "imageRequestStartTimeMs",
        "K",
        "imageRequestEndTimeMs",
        "J",
        "invisibilityEventTimeMs",
        "L",
        "",
        "prefetch",
        "O",
        "(Z)V",
        "imageInfo",
        "G",
        "",
        "onScreenWidthPx",
        "N",
        "(I)V",
        "onScreenHeightPx",
        "M",
        "",
        "errorThrowable",
        "E",
        "(Ljava/lang/Throwable;)V",
        "visible",
        "R",
        "Lcom/facebook/fresco/ui/common/ImagePerfData;",
        "S",
        "()Lcom/facebook/fresco/ui/common/ImagePerfData;",
        "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;",
        "extraData",
        "F",
        "(Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V",
        "s",
        "Ljava/lang/String;",
        "t",
        "u",
        "Ljava/lang/Object;",
        "v",
        "getCallerContext",
        "()Ljava/lang/Object;",
        "y",
        "callerContext",
        "Z",
        "isPrefetch",
        "Ljava/lang/Throwable;",
        "Lcom/facebook/fresco/ui/common/ImageLoadStatus;",
        "H",
        "Lcom/facebook/fresco/ui/common/ImageLoadStatus;",
        "getImageLoadStatus",
        "()Lcom/facebook/fresco/ui/common/ImageLoadStatus;",
        "(Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V",
        "imageLoadStatus",
        "Lcom/facebook/fresco/ui/common/VisibilityState;",
        "Lcom/facebook/fresco/ui/common/VisibilityState;",
        "visibilityState",
        "getVisibilityEventTimeMs",
        "()J",
        "Q",
        "visibilityEventTimeMs",
        "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;",
        "_extraData",
        "ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public D:Z

.field public E:I

.field public F:I

.field public G:Ljava/lang/Throwable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public H:Lcom/facebook/fresco/ui/common/ImageLoadStatus;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public I:Lcom/facebook/fresco/ui/common/VisibilityState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public J:J

.field public K:J

.field public L:Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public s:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public t:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public u:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public v:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public w:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public x:J

.field public y:J

.field public z:J


# direct methods
.method public constructor <init>(Lcom/facebook/fresco/ui/common/ImageRenderingInfra;)V
    .locals 2
    .param p1    # Lcom/facebook/fresco/ui/common/ImageRenderingInfra;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "infra"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lg5/c;-><init>(Lcom/facebook/fresco/ui/common/ImageRenderingInfra;)V

    .line 9
    .line 10
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->x:J

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->y:J

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->z:J

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->A:J

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->B:J

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->C:J

    .line 23
    const/4 p1, -0x1

    .line 24
    .line 25
    iput p1, p0, Lcom/facebook/fresco/ui/common/a;->E:I

    .line 26
    .line 27
    iput p1, p0, Lcom/facebook/fresco/ui/common/a;->F:I

    .line 28
    .line 29
    sget-object p1, Lcom/facebook/fresco/ui/common/ImageLoadStatus;->UNKNOWN:Lcom/facebook/fresco/ui/common/ImageLoadStatus;

    .line 30
    .line 31
    iput-object p1, p0, Lcom/facebook/fresco/ui/common/a;->H:Lcom/facebook/fresco/ui/common/ImageLoadStatus;

    .line 32
    .line 33
    sget-object p1, Lcom/facebook/fresco/ui/common/VisibilityState;->UNKNOWN:Lcom/facebook/fresco/ui/common/VisibilityState;

    .line 34
    .line 35
    iput-object p1, p0, Lcom/facebook/fresco/ui/common/a;->I:Lcom/facebook/fresco/ui/common/VisibilityState;

    .line 36
    .line 37
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->J:J

    .line 38
    .line 39
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->K:J

    .line 40
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
.end method


# virtual methods
.method public final A(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/facebook/fresco/ui/common/a;->z:J

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
.end method

.method public final B(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/fresco/ui/common/a;->s:Ljava/lang/String;

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
.end method

.method public final C(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/facebook/fresco/ui/common/a;->y:J

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
.end method

.method public final D(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/facebook/fresco/ui/common/a;->x:J

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
.end method

.method public final E(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/fresco/ui/common/a;->G:Ljava/lang/Throwable;

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
.end method

.method public final F(Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V
    .locals 0
    .param p1    # Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/fresco/ui/common/a;->L:Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;

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
.end method

.method public final G(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/fresco/ui/common/a;->w:Ljava/lang/Object;

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
.end method

.method public final H(Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V
    .locals 1
    .param p1    # Lcom/facebook/fresco/ui/common/ImageLoadStatus;
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
    iput-object p1, p0, Lcom/facebook/fresco/ui/common/a;->H:Lcom/facebook/fresco/ui/common/ImageLoadStatus;

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
.end method

.method public final I(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/fresco/ui/common/a;->u:Ljava/lang/Object;

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
.end method

.method public final J(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/facebook/fresco/ui/common/a;->C:J

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
.end method

.method public final K(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/facebook/fresco/ui/common/a;->B:J

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
.end method

.method public final L(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/facebook/fresco/ui/common/a;->K:J

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
.end method

.method public final M(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/fresco/ui/common/a;->F:I

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
.end method

.method public final N(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/fresco/ui/common/a;->E:I

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
.end method

.method public final O(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/facebook/fresco/ui/common/a;->D:Z

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
.end method

.method public final P(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/fresco/ui/common/a;->t:Ljava/lang/String;

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
.end method

.method public final Q(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/facebook/fresco/ui/common/a;->J:J

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
.end method

.method public final R(Z)V
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget-object p1, Lcom/facebook/fresco/ui/common/VisibilityState;->VISIBLE:Lcom/facebook/fresco/ui/common/VisibilityState;

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    sget-object p1, Lcom/facebook/fresco/ui/common/VisibilityState;->INVISIBLE:Lcom/facebook/fresco/ui/common/VisibilityState;

    .line 8
    .line 9
    :goto_0
    iput-object p1, p0, Lcom/facebook/fresco/ui/common/a;->I:Lcom/facebook/fresco/ui/common/VisibilityState;

    .line 10
    return-void
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
.end method

.method public final S()Lcom/facebook/fresco/ui/common/ImagePerfData;
    .locals 50
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/facebook/fresco/ui/common/ImagePerfData;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lg5/c;->j()Lcom/facebook/fresco/ui/common/ImageRenderingInfra;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    iget-object v3, v0, Lcom/facebook/fresco/ui/common/a;->s:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v4, v0, Lcom/facebook/fresco/ui/common/a;->t:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v5, v0, Lcom/facebook/fresco/ui/common/a;->u:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v6, v0, Lcom/facebook/fresco/ui/common/a;->v:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v7, v0, Lcom/facebook/fresco/ui/common/a;->w:Ljava/lang/Object;

    .line 19
    .line 20
    iget-wide v8, v0, Lcom/facebook/fresco/ui/common/a;->x:J

    .line 21
    .line 22
    iget-wide v10, v0, Lcom/facebook/fresco/ui/common/a;->y:J

    .line 23
    .line 24
    iget-wide v12, v0, Lcom/facebook/fresco/ui/common/a;->z:J

    .line 25
    .line 26
    iget-wide v14, v0, Lcom/facebook/fresco/ui/common/a;->A:J

    .line 27
    .line 28
    move-object/from16 v16, v1

    .line 29
    .line 30
    move-object/from16 v17, v2

    .line 31
    .line 32
    iget-wide v1, v0, Lcom/facebook/fresco/ui/common/a;->B:J

    .line 33
    .line 34
    move-wide/from16 v18, v1

    .line 35
    .line 36
    iget-wide v1, v0, Lcom/facebook/fresco/ui/common/a;->C:J

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lg5/c;->f()Ljava/lang/Long;

    .line 40
    move-result-object v20

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lg5/c;->n()Ljava/lang/Long;

    .line 44
    move-result-object v21

    .line 45
    .line 46
    move-wide/from16 v22, v1

    .line 47
    .line 48
    iget-boolean v1, v0, Lcom/facebook/fresco/ui/common/a;->D:Z

    .line 49
    .line 50
    iget v2, v0, Lcom/facebook/fresco/ui/common/a;->E:I

    .line 51
    .line 52
    move/from16 v24, v1

    .line 53
    .line 54
    iget v1, v0, Lcom/facebook/fresco/ui/common/a;->F:I

    .line 55
    .line 56
    move/from16 v25, v1

    .line 57
    .line 58
    iget-object v1, v0, Lcom/facebook/fresco/ui/common/a;->G:Ljava/lang/Throwable;

    .line 59
    .line 60
    move-object/from16 v26, v1

    .line 61
    .line 62
    iget-object v1, v0, Lcom/facebook/fresco/ui/common/a;->I:Lcom/facebook/fresco/ui/common/VisibilityState;

    .line 63
    .line 64
    move-object/from16 v28, v1

    .line 65
    .line 66
    move/from16 v27, v2

    .line 67
    .line 68
    iget-wide v1, v0, Lcom/facebook/fresco/ui/common/a;->J:J

    .line 69
    .line 70
    move-wide/from16 v29, v1

    .line 71
    .line 72
    iget-wide v1, v0, Lcom/facebook/fresco/ui/common/a;->K:J

    .line 73
    .line 74
    move-wide/from16 v31, v1

    .line 75
    .line 76
    iget-object v1, v0, Lcom/facebook/fresco/ui/common/a;->L:Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lg5/c;->a()Ljava/lang/String;

    .line 80
    move-result-object v33

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lg5/c;->o()Ljava/lang/String;

    .line 84
    move-result-object v34

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lg5/c;->c()[Ljava/lang/String;

    .line 88
    move-result-object v35

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lg5/c;->d()Ljava/lang/String;

    .line 92
    move-result-object v36

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lg5/c;->b()Ljava/lang/String;

    .line 96
    move-result-object v37

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lg5/c;->r()Ljava/lang/String;

    .line 100
    move-result-object v38

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lg5/c;->q()Ljava/lang/String;

    .line 104
    move-result-object v39

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lg5/c;->l()Ljava/lang/Long;

    .line 108
    move-result-object v40

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Lg5/c;->p()Ljava/lang/String;

    .line 112
    move-result-object v41

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lg5/c;->k()Ljava/util/List;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    .line 119
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 120
    move-result-object v42

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Lg5/c;->m()Z

    .line 124
    move-result v43

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Lg5/c;->h()Ljava/lang/String;

    .line 128
    move-result-object v44

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lg5/c;->i()Ljava/lang/String;

    .line 132
    move-result-object v45

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Lg5/c;->g()Ljava/lang/Integer;

    .line 136
    move-result-object v46

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lg5/c;->e()Ljava/lang/Integer;

    .line 140
    move-result-object v47

    .line 141
    .line 142
    move-object/from16 v2, v17

    .line 143
    .line 144
    move-wide/from16 v48, v31

    .line 145
    .line 146
    move-object/from16 v32, v1

    .line 147
    .line 148
    move-object/from16 v1, v16

    .line 149
    .line 150
    move-wide/from16 v16, v18

    .line 151
    .line 152
    move-wide/from16 v18, v22

    .line 153
    .line 154
    move/from16 v22, v24

    .line 155
    .line 156
    move/from16 v24, v25

    .line 157
    .line 158
    move-object/from16 v25, v26

    .line 159
    .line 160
    move/from16 v23, v27

    .line 161
    .line 162
    move-object/from16 v26, v28

    .line 163
    .line 164
    move-wide/from16 v27, v29

    .line 165
    .line 166
    move-wide/from16 v29, v48

    .line 167
    .line 168
    const/16 v31, 0x0

    .line 169
    .line 170
    .line 171
    invoke-direct/range {v1 .. v47}, Lcom/facebook/fresco/ui/common/ImagePerfData;-><init>(Lcom/facebook/fresco/ui/common/ImageRenderingInfra;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJJJJJLjava/lang/Long;Ljava/lang/Long;ZIILjava/lang/Throwable;Lcom/facebook/fresco/ui/common/VisibilityState;JJLg5/a;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 172
    return-object v1
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
.end method

.method public final w()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/facebook/fresco/ui/common/a;->t:Ljava/lang/String;

    .line 4
    .line 5
    iput-object v0, p0, Lcom/facebook/fresco/ui/common/a;->u:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/facebook/fresco/ui/common/a;->v:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/fresco/ui/common/a;->w:Ljava/lang/Object;

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    iput-boolean v1, p0, Lcom/facebook/fresco/ui/common/a;->D:Z

    .line 13
    const/4 v1, -0x1

    .line 14
    .line 15
    iput v1, p0, Lcom/facebook/fresco/ui/common/a;->E:I

    .line 16
    .line 17
    iput v1, p0, Lcom/facebook/fresco/ui/common/a;->F:I

    .line 18
    .line 19
    iput-object v0, p0, Lcom/facebook/fresco/ui/common/a;->G:Ljava/lang/Throwable;

    .line 20
    .line 21
    sget-object v1, Lcom/facebook/fresco/ui/common/ImageLoadStatus;->UNKNOWN:Lcom/facebook/fresco/ui/common/ImageLoadStatus;

    .line 22
    .line 23
    iput-object v1, p0, Lcom/facebook/fresco/ui/common/a;->H:Lcom/facebook/fresco/ui/common/ImageLoadStatus;

    .line 24
    .line 25
    sget-object v1, Lcom/facebook/fresco/ui/common/VisibilityState;->UNKNOWN:Lcom/facebook/fresco/ui/common/VisibilityState;

    .line 26
    .line 27
    iput-object v1, p0, Lcom/facebook/fresco/ui/common/a;->I:Lcom/facebook/fresco/ui/common/VisibilityState;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/facebook/fresco/ui/common/a;->L:Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/fresco/ui/common/a;->x()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lg5/c;->s()V

    .line 36
    return-void
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
.end method

.method public final x()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, -0x1

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->B:J

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->C:J

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->x:J

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->z:J

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->A:J

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->J:J

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/facebook/fresco/ui/common/a;->K:J

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lg5/c;->k()Ljava/util/List;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lg5/c;->u(Z)V

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lg5/c;->t(Ljava/lang/Long;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lg5/c;->v(Ljava/lang/Long;)V

    .line 35
    return-void
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
.end method

.method public final y(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/fresco/ui/common/a;->v:Ljava/lang/Object;

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
.end method

.method public final z(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/facebook/fresco/ui/common/a;->A:J

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
.end method
