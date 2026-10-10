.class public final Ljumio/core/K2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljumio/core/L2;


# direct methods
.method public constructor <init>(Ljumio/core/L2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ljumio/core/K2;->d:Ljumio/core/L2;

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

.method public static final a(Landroid/os/FileObserver;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/os/FileObserver;->stopWatching()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljumio/core/K2;

    .line 3
    .line 4
    iget-object v1, p0, Ljumio/core/K2;->d:Ljumio/core/L2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Ljumio/core/K2;-><init>(Ljumio/core/L2;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Ljumio/core/K2;->c:Ljava/lang/Object;

    .line 10
    return-object v0
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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/channels/m;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Ljumio/core/K2;

    .line 7
    .line 8
    iget-object v1, p0, Ljumio/core/K2;->d:Ljumio/core/L2;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Ljumio/core/K2;-><init>(Ljumio/core/L2;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Ljumio/core/K2;->c:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljumio/core/K2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/K2;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lkotlinx/coroutines/channels/m;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget v2, p0, Ljumio/core/K2;->b:I

    .line 11
    const/4 v3, 0x1

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ljumio/core/K2;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/os/FileObserver;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 23
    goto :goto_1

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    throw p1

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 35
    .line 36
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    const/16 v2, 0x1d

    .line 39
    .line 40
    if-lt p1, v2, :cond_2

    .line 41
    .line 42
    iget-object p1, p0, Ljumio/core/K2;->d:Ljumio/core/L2;

    .line 43
    .line 44
    iget-object p1, p1, Ljumio/core/L2;->a:Ljava/io/File;

    .line 45
    .line 46
    new-instance v2, Ljumio/core/I2;

    .line 47
    .line 48
    iget-object v4, p0, Ljumio/core/K2;->d:Ljumio/core/L2;

    .line 49
    .line 50
    .line 51
    invoke-direct {v2, v0, v4, p1}, Ljumio/core/I2;-><init>(Lkotlinx/coroutines/channels/m;Ljumio/core/L2;Ljava/io/File;)V

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_2
    iget-object p1, p0, Ljumio/core/K2;->d:Ljumio/core/L2;

    .line 55
    .line 56
    iget-object p1, p1, Ljumio/core/L2;->a:Ljava/io/File;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    new-instance v2, Ljumio/core/J2;

    .line 63
    .line 64
    iget-object v4, p0, Ljumio/core/K2;->d:Ljumio/core/L2;

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, v0, v4, p1}, Ljumio/core/J2;-><init>(Lkotlinx/coroutines/channels/m;Ljumio/core/L2;Ljava/lang/String;)V

    .line 68
    :goto_0
    const/4 p1, 0x0

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/p;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/os/FileObserver;->startWatching()V

    .line 79
    .line 80
    new-instance p1, Llg0/l;

    .line 81
    .line 82
    .line 83
    invoke-direct {p1, v2}, Llg0/l;-><init>(Landroid/os/FileObserver;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    move-result-object v4

    .line 88
    .line 89
    iput-object v4, p0, Ljumio/core/K2;->c:Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    move-result-object v2

    .line 94
    .line 95
    iput-object v2, p0, Ljumio/core/K2;->a:Ljava/lang/Object;

    .line 96
    .line 97
    iput v3, p0, Ljumio/core/K2;->b:I

    .line 98
    .line 99
    .line 100
    invoke-static {v0, p1, p0}, Lkotlinx/coroutines/channels/ProduceKt;->a(Lkotlinx/coroutines/channels/m;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    if-ne p1, v1, :cond_3

    .line 104
    return-object v1

    .line 105
    .line 106
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 107
    return-object p1
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
