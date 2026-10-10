.class public final Ltb0/d;
.super Ltb0/b;
.source "LongPressGestureHandlerEventDataBuilder.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltb0/b<",
        "Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Ltb0/d;",
        "Ltb0/b;",
        "Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;",
        "handler",
        "<init>",
        "(Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;)V",
        "Lcom/facebook/react/bridge/WritableMap;",
        "eventData",
        "",
        "a",
        "(Lcom/facebook/react/bridge/WritableMap;)V",
        "",
        "e",
        "F",
        "x",
        "f",
        "y",
        "g",
        "absoluteX",
        "h",
        "absoluteY",
        "",
        "i",
        "I",
        "duration",
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
.field public final e:F

.field public final f:F

.field public final g:F

.field public final h:F

.field public final i:I


# direct methods
.method public constructor <init>(Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;)V
    .locals 1
    .param p1    # Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;
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
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->J()F

    .line 12
    move-result v0

    .line 13
    .line 14
    iput v0, p0, Ltb0/d;->e:F

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->K()F

    .line 18
    move-result v0

    .line 19
    .line 20
    iput v0, p0, Ltb0/d;->f:F

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->H()F

    .line 24
    move-result v0

    .line 25
    .line 26
    iput v0, p0, Ltb0/d;->g:F

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->I()F

    .line 30
    move-result v0

    .line 31
    .line 32
    iput v0, p0, Ltb0/d;->h:F

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;->V0()I

    .line 36
    move-result p1

    .line 37
    .line 38
    iput p1, p0, Ltb0/d;->i:I

    .line 39
    return-void
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
    iget v0, p0, Ltb0/d;->e:F

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 14
    move-result v0

    .line 15
    float-to-double v0, v0

    .line 16
    .line 17
    .line 18
    const-string/jumbo v2, "x"

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 22
    .line 23
    iget v0, p0, Ltb0/d;->f:F

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 27
    move-result v0

    .line 28
    float-to-double v0, v0

    .line 29
    .line 30
    .line 31
    const-string/jumbo v2, "y"

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 35
    .line 36
    iget v0, p0, Ltb0/d;->g:F

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 40
    move-result v0

    .line 41
    float-to-double v0, v0

    .line 42
    .line 43
    const-string v2, "absoluteX"

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 47
    .line 48
    iget v0, p0, Ltb0/d;->h:F

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 52
    move-result v0

    .line 53
    float-to-double v0, v0

    .line 54
    .line 55
    const-string v2, "absoluteY"

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 59
    .line 60
    const-string v0, "duration"

    .line 61
    .line 62
    iget v1, p0, Ltb0/d;->i:I

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 66
    return-void
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
