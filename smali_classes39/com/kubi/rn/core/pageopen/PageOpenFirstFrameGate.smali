.class public final Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;
.super Ljava/lang/Object;
.source "KrnPageOpenRegistry.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\u0008J\u0006\u0010\t\u001a\u00020\u0008R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;",
        "",
        "<init>",
        "()V",
        "waitingVisibleAfterRender",
        "",
        "firstFrameRecorded",
        "onRenderReady",
        "Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;",
        "onVisibleFrame",
        "BReactNativeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private firstFrameRecorded:Z

.field private waitingVisibleAfterRender:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public final onRenderReady()Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;->firstFrameRecorded:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;->IGNORE:Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;

    .line 7
    return-object v0

    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;->waitingVisibleAfterRender:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;->IGNORE:Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;

    .line 14
    return-object v0

    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;->waitingVisibleAfterRender:Z

    .line 18
    .line 19
    sget-object v0, Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;->REQUEST_VISIBLE_FRAME:Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;

    .line 20
    return-object v0
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
.end method

.method public final onVisibleFrame()Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;->firstFrameRecorded:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;->IGNORE:Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;

    .line 7
    return-object v0

    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;->waitingVisibleAfterRender:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;->IGNORE:Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;

    .line 14
    return-object v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;->waitingVisibleAfterRender:Z

    .line 18
    const/4 v0, 0x1

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;->firstFrameRecorded:Z

    .line 21
    .line 22
    sget-object v0, Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;->RECORD_FIRST_FRAME:Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;

    .line 23
    return-object v0
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
.end method
