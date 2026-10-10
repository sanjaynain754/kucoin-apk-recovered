.class public final Ltb0/h;
.super Ltb0/b;
.source "PinchGestureHandlerEventDataBuilder.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltb0/b<",
        "Lrb0/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\r\u00a8\u0006\u0017"
    }
    d2 = {
        "Ltb0/h;",
        "Ltb0/b;",
        "Lrb0/n;",
        "handler",
        "<init>",
        "(Lrb0/n;)V",
        "Lcom/facebook/react/bridge/WritableMap;",
        "eventData",
        "",
        "a",
        "(Lcom/facebook/react/bridge/WritableMap;)V",
        "",
        "e",
        "D",
        "scale",
        "",
        "f",
        "F",
        "focalX",
        "g",
        "focalY",
        "h",
        "velocity",
        "react-native-gesture-handler_release"
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
.field public final e:D

.field public final f:F

.field public final g:F

.field public final h:D


# direct methods
.method public constructor <init>(Lrb0/n;)V
    .locals 2
    .param p1    # Lrb0/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "handler"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Ltb0/b;-><init>(Lcom/swmansion/gesturehandler/core/GestureHandler;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lrb0/n;->Z0()D

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    iput-wide v0, p0, Ltb0/h;->e:D

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lrb0/n;->X0()F

    .line 18
    move-result v0

    .line 19
    .line 20
    iput v0, p0, Ltb0/h;->f:F

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lrb0/n;->Y0()F

    .line 24
    move-result v0

    .line 25
    .line 26
    iput v0, p0, Ltb0/h;->g:F

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lrb0/n;->a1()D

    .line 30
    move-result-wide v0

    .line 31
    .line 32
    iput-wide v0, p0, Ltb0/h;->h:D

    .line 33
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
.end method


# virtual methods
.method public a(Lcom/facebook/react/bridge/WritableMap;)V
    .locals 3
    .param p1    # Lcom/facebook/react/bridge/WritableMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "eventData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Ltb0/b;->a(Lcom/facebook/react/bridge/WritableMap;)V

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "scale"

    .line 12
    .line 13
    iget-wide v1, p0, Ltb0/h;->e:D

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 17
    .line 18
    iget v0, p0, Ltb0/h;->f:F

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 22
    move-result v0

    .line 23
    float-to-double v0, v0

    .line 24
    .line 25
    const-string v2, "focalX"

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 29
    .line 30
    iget v0, p0, Ltb0/h;->g:F

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 34
    move-result v0

    .line 35
    float-to-double v0, v0

    .line 36
    .line 37
    const-string v2, "focalY"

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 41
    .line 42
    .line 43
    const-string/jumbo v0, "velocity"

    .line 44
    .line 45
    iget-wide v1, p0, Ltb0/h;->h:D

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 49
    return-void
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
.end method
