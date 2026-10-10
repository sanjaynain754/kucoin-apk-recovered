.class public final Lcom/kubi/mvi/state/IViewModelLog$DefaultImpls;
.super Ljava/lang/Object;
.source "IViewModelLog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/mvi/state/IViewModelLog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lcom/kubi/mvi/state/IViewModelLog;)Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/mvi/common/MVILogSwitchManager;->a:Lcom/kubi/mvi/common/MVILogSwitchManager;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lcom/kubi/mvi/state/IViewModelLog;->getBiz()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lcom/kubi/mvi/common/MVILogSwitchManager;->b(Ljava/lang/String;)Z

    .line 10
    move-result p0

    .line 11
    return p0
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
.end method

.method public static b(Lcom/kubi/mvi/state/IViewModelLog;Ljava/lang/String;)V
    .locals 2
    .param p0    # Lcom/kubi/mvi/state/IViewModelLog;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "$receiver"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/kubi/mvi/state/IViewModelLog$DefaultImpls;->a(Lcom/kubi/mvi/state/IViewModelLog;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    new-instance v1, Lcom/kubi/mvi/state/IViewModelLog$logData$1;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p1, p0}, Lcom/kubi/mvi/state/IViewModelLog$logData$1;-><init>(Ljava/lang/String;Lcom/kubi/mvi/state/IViewModelLog;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/kubi/mvi/common/MviExKt;->e(ZLkotlin/jvm/functions/Function0;)V

    .line 18
    return-void
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
.end method

.method public static c(Lcom/kubi/mvi/state/IViewModelLog;Ljava/lang/String;)V
    .locals 2
    .param p0    # Lcom/kubi/mvi/state/IViewModelLog;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "$receiver"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/kubi/mvi/state/IViewModelLog$DefaultImpls;->a(Lcom/kubi/mvi/state/IViewModelLog;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    new-instance v1, Lcom/kubi/mvi/state/IViewModelLog$logIntent$1;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p1, p0}, Lcom/kubi/mvi/state/IViewModelLog$logIntent$1;-><init>(Ljava/lang/String;Lcom/kubi/mvi/state/IViewModelLog;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/kubi/mvi/common/MviExKt;->e(ZLkotlin/jvm/functions/Function0;)V

    .line 18
    return-void
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
.end method

.method public static d(Lcom/kubi/mvi/state/IViewModelLog;Ljava/lang/String;)V
    .locals 2
    .param p0    # Lcom/kubi/mvi/state/IViewModelLog;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "$receiver"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/kubi/mvi/state/IViewModelLog$DefaultImpls;->a(Lcom/kubi/mvi/state/IViewModelLog;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    new-instance v1, Lcom/kubi/mvi/state/IViewModelLog$logState$1;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p1, p0}, Lcom/kubi/mvi/state/IViewModelLog$logState$1;-><init>(Ljava/lang/String;Lcom/kubi/mvi/state/IViewModelLog;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/kubi/mvi/common/MviExKt;->e(ZLkotlin/jvm/functions/Function0;)V

    .line 18
    return-void
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
.end method
