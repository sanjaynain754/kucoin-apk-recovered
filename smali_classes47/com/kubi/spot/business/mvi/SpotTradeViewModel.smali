.class public final Lcom/kubi/spot/business/mvi/SpotTradeViewModel;
.super Lcom/kubi/mvi/state/m;
.source "SpotTradeViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/m<",
        "Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0094@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0002\u0010\u001aJ\u0008\u0010\u001b\u001a\u00020\u001cH\u0002J\u0008\u0010\u001d\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000c\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/spot/business/mvi/SpotTradeViewModel;",
        "Lcom/kubi/mvi/state/SingleSimpleStateVM;",
        "Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;",
        "<init>",
        "()V",
        "repository",
        "Lcom/kubi/spot/business/mvi/SpotTradeRepository;",
        "initState",
        "getInitState",
        "()Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;",
        "protocolScope",
        "Lcom/kubi/spot/utils/ParentCoroutineScope;",
        "subPushChannelApi",
        "Lcom/kubi/spot/api/IRestfulApi;",
        "getSubPushChannelApi",
        "()Lcom/kubi/spot/api/IRestfulApi;",
        "subPushChannelApi$delegate",
        "Lkotlin/Lazy;",
        "dispatchIntent",
        "",
        "intent",
        "Lcom/kubi/mvi/state/IIntent;",
        "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getRiskWarning",
        "symbol",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "subscribeBannerData",
        "Lkotlinx/coroutines/Job;",
        "onHide",
        "SpotLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSpotTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotTradeViewModel.kt\ncom/kubi/spot/business/mvi/SpotTradeViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,116:1\n25#2:117\n26#2:119\n25#2:122\n26#2:124\n1#3:118\n1#3:123\n17#4,2:120\n*S KotlinDebug\n*F\n+ 1 SpotTradeViewModel.kt\ncom/kubi/spot/business/mvi/SpotTradeViewModel\n*L\n60#1:117\n60#1:119\n72#1:122\n72#1:124\n60#1:118\n72#1:123\n69#1:120,2\n*E\n"
    }
.end annotation


# instance fields
.field public final X:Lcom/kubi/spot/business/mvi/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Lf30/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Z:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/m;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/spot/business/mvi/d;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/spot/business/mvi/d;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->X:Lcom/kubi/spot/business/mvi/d;

    .line 11
    .line 12
    new-instance v0, Lf30/f;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lf30/f;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->Y:Lf30/f;

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/spot/business/mvi/i;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/kubi/spot/business/mvi/i;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iput-object v0, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->Z:Lkotlin/Lazy;

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
.end method

.method private final B(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->X:Lcom/kubi/spot/business/mvi/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/kubi/spot/business/mvi/d;->f(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    new-instance v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$getRiskWarning$2;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$getRiskWarning$2;-><init>(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v1, v0, p2}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 21
    move-result-object p2

    .line 22
    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    return-object p1

    .line 25
    .line 26
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 27
    return-object p1
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

.method public static final D()Le20/a;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/network/restful/b$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/network/restful/b$a;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lgr/b;

    .line 8
    .line 9
    const-string v2, "network/channel_default"

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Ler/b;->e(Ljava/lang/String;)Ler/a;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, Lgr/b;-><init>(Ler/a;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b$a;->b(Lkr/b;)Lcom/kubi/network/restful/b$a;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    new-instance v1, Lgr/h;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Lgr/h;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b$a;->c(Lkr/d;)Lcom/kubi/network/restful/b$a;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/kubi/network/restful/b$a;->a()Lcom/kubi/network/restful/b;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    const-class v1, Le20/a;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    check-cast v0, Le20/a;

    .line 42
    return-object v0
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
.end method

.method public static synthetic b(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->w(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic d(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->y(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic e(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->z(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic n()Le20/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->D()Le20/a;

    .line 4
    move-result-object v0

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
.end method

.method public static synthetic o(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->x(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic p(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;)Lf30/f;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->Y:Lf30/f;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic q(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;)Lcom/kubi/spot/business/mvi/d;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->X:Lcom/kubi/spot/business/mvi/d;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic r(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->B(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic s(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;)Le20/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->C()Le20/a;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic t(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;Ldr/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

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

.method public static final synthetic u(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;)Lkotlinx/coroutines/x1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->E()Lkotlinx/coroutines/x1;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic v(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;Lkotlin/jvm/functions/Function1;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static final w(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;
    .locals 10

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v8, 0x3d

    .line 8
    const/4 v9, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v9}, Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;->copy$default(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kubi/core/spot/entity/ComplianceInfoEntity;ILjava/lang/Object;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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
.end method

.method public static final x(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;
    .locals 10

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v8, 0x3b

    .line 8
    const/4 v9, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v9}, Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;->copy$default(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kubi/core/spot/entity/ComplianceInfoEntity;ILjava/lang/Object;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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
.end method

.method public static final y(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;
    .locals 10

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v8, 0x37

    .line 8
    const/4 v9, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v9}, Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;->copy$default(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kubi/core/spot/entity/ComplianceInfoEntity;ILjava/lang/Object;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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
.end method

.method public static final z(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;
    .locals 10

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v8, 0x1f

    .line 8
    const/4 v9, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v9}, Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;->copy$default(Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kubi/core/spot/entity/ComplianceInfoEntity;ILjava/lang/Object;)Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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
.end method


# virtual methods
.method public A()Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;

    .line 3
    .line 4
    const/16 v7, 0x3f

    .line 5
    const/4 v8, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v8}, Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;-><init>(ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kubi/core/spot/entity/ComplianceInfoEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    return-object v0
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
.end method

.method public final C()Le20/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->Z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Le20/a;

    .line 9
    return-object v0
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
.end method

.method public final E()Lkotlinx/coroutines/x1;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->Y:Lf30/f;

    .line 3
    .line 4
    new-instance v3, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$subscribeBannerData$1;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, v1}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$subscribeBannerData$1;-><init>(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
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
.end method

.method public dispatchIntent(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1    # Lcom/kubi/mvi/state/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/mvi/state/d;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;-><init>(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->label:I

    .line 33
    const/4 v3, 0x4

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    const/4 v7, 0x0

    .line 38
    .line 39
    if-eqz v2, :cond_5

    .line 40
    .line 41
    if-eq v2, v6, :cond_4

    .line 42
    .line 43
    if-eq v2, v5, :cond_3

    .line 44
    .line 45
    if-eq v2, v4, :cond_2

    .line 46
    .line 47
    if-ne v2, v3, :cond_1

    .line 48
    .line 49
    iget-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 52
    .line 53
    .line 54
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    throw p1

    .line 65
    .line 66
    :cond_2
    iget-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Ljava/lang/Throwable;

    .line 69
    .line 70
    iget-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Ljava/lang/Throwable;

    .line 73
    .line 74
    iget-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Lcom/kubi/network/retrofit/utils/f;

    .line 77
    .line 78
    iget-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 81
    .line 82
    .line 83
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    .line 85
    goto/16 :goto_6

    .line 86
    .line 87
    :cond_3
    iget-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 90
    .line 91
    .line 92
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 93
    goto :goto_2

    .line 94
    .line 95
    :cond_4
    iget-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 101
    goto :goto_1

    .line 102
    .line 103
    .line 104
    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 105
    .line 106
    instance-of p2, p1, Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetAssetTotal;

    .line 107
    const/4 v2, 0x0

    .line 108
    .line 109
    if-eqz p2, :cond_7

    .line 110
    .line 111
    iget-object p2, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->X:Lcom/kubi/spot/business/mvi/d;

    .line 112
    move-object v3, p1

    .line 113
    .line 114
    check-cast v3, Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetAssetTotal;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetAssetTotal;->getSymbol()Ljava/lang/String;

    .line 118
    move-result-object v3

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, v3}, Lcom/kubi/spot/business/mvi/d;->g(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 122
    move-result-object p2

    .line 123
    .line 124
    new-instance v3, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$2;

    .line 125
    .line 126
    .line 127
    invoke-direct {v3, p0, v2}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$2;-><init>(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 128
    .line 129
    .line 130
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    move-result-object p1

    .line 132
    .line 133
    iput-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 134
    .line 135
    iput v6, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->label:I

    .line 136
    .line 137
    .line 138
    invoke-static {p2, v7, v3, v0}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    if-ne p1, v1, :cond_6

    .line 142
    .line 143
    goto/16 :goto_4

    .line 144
    .line 145
    :cond_6
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 146
    return-object p1

    .line 147
    .line 148
    :cond_7
    instance-of p2, p1, Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetNoticeList;

    .line 149
    .line 150
    if-eqz p2, :cond_9

    .line 151
    .line 152
    iget-object p2, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->X:Lcom/kubi/spot/business/mvi/d;

    .line 153
    move-object v3, p1

    .line 154
    .line 155
    check-cast v3, Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetNoticeList;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3}, Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetNoticeList;->getSymbolCode()Ljava/lang/String;

    .line 159
    move-result-object v3

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, v3}, Lcom/kubi/spot/business/mvi/d;->e(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 163
    move-result-object p2

    .line 164
    .line 165
    new-instance v3, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$3;

    .line 166
    .line 167
    .line 168
    invoke-direct {v3, p0, p1, v2}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$3;-><init>(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)V

    .line 169
    .line 170
    iput-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 171
    .line 172
    iput v5, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->label:I

    .line 173
    .line 174
    .line 175
    invoke-static {p2, v7, v3, v0}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 176
    move-result-object p2

    .line 177
    .line 178
    if-ne p2, v1, :cond_8

    .line 179
    .line 180
    goto/16 :goto_4

    .line 181
    .line 182
    :cond_8
    :goto_2
    check-cast p2, Lcom/kubi/network/retrofit/utils/f;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 186
    move-result-object v2

    .line 187
    .line 188
    if-eqz v2, :cond_c

    .line 189
    .line 190
    new-instance v3, Lcom/kubi/spot/business/mvi/e;

    .line 191
    .line 192
    .line 193
    invoke-direct {v3}, Lcom/kubi/spot/business/mvi/e;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v3}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 197
    .line 198
    new-instance v3, Lcom/kubi/spot/business/mvi/f;

    .line 199
    .line 200
    .line 201
    invoke-direct {v3}, Lcom/kubi/spot/business/mvi/f;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v3}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 205
    .line 206
    new-instance v3, Lcom/kubi/spot/business/mvi/g;

    .line 207
    .line 208
    .line 209
    invoke-direct {v3}, Lcom/kubi/spot/business/mvi/g;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v3}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 213
    move-object v3, p1

    .line 214
    .line 215
    check-cast v3, Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetNoticeList;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3}, Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetNoticeList;->getSymbolCode()Ljava/lang/String;

    .line 219
    move-result-object v3

    .line 220
    .line 221
    .line 222
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    move-result-object p1

    .line 224
    .line 225
    iput-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 226
    .line 227
    iput-object p2, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    move-result-object p1

    .line 232
    .line 233
    iput-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    move-result-object p1

    .line 238
    .line 239
    iput-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 240
    .line 241
    iput v7, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->I$0:I

    .line 242
    .line 243
    iput v7, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->I$1:I

    .line 244
    .line 245
    iput v7, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->I$2:I

    .line 246
    .line 247
    iput v4, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->label:I

    .line 248
    .line 249
    .line 250
    invoke-direct {p0, v3, v0}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->B(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 251
    move-result-object p1

    .line 252
    .line 253
    if-ne p1, v1, :cond_c

    .line 254
    goto :goto_4

    .line 255
    .line 256
    :cond_9
    instance-of p2, p1, Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetComplianceInfo;

    .line 257
    .line 258
    if-eqz p2, :cond_c

    .line 259
    .line 260
    sget-object p2, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 261
    .line 262
    sget-object v4, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 266
    move-result-object v4

    .line 267
    .line 268
    const-class v5, Leg/b;

    .line 269
    .line 270
    .line 271
    invoke-virtual {p2, v5, v4}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 272
    move-result-object p2

    .line 273
    .line 274
    if-eqz p2, :cond_a

    .line 275
    .line 276
    check-cast p2, Leg/b;

    .line 277
    .line 278
    .line 279
    invoke-interface {p2}, Leg/b;->f()Z

    .line 280
    move-result p2

    .line 281
    goto :goto_3

    .line 282
    :cond_a
    move p2, v7

    .line 283
    .line 284
    :goto_3
    if-eqz p2, :cond_c

    .line 285
    .line 286
    iget-object p2, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->X:Lcom/kubi/spot/business/mvi/d;

    .line 287
    move-object v4, p1

    .line 288
    .line 289
    check-cast v4, Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetComplianceInfo;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v4}, Lcom/kubi/spot/business/mvi/SpotTradeContract$UiIntent$GetComplianceInfo;->getSymbol()Ljava/lang/String;

    .line 293
    move-result-object v4

    .line 294
    .line 295
    .line 296
    invoke-virtual {p2, v4}, Lcom/kubi/spot/business/mvi/d;->d(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 297
    move-result-object p2

    .line 298
    .line 299
    new-instance v4, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$7;

    .line 300
    .line 301
    .line 302
    invoke-direct {v4, p0, v2}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$7;-><init>(Lcom/kubi/spot/business/mvi/SpotTradeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 303
    .line 304
    .line 305
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    move-result-object p1

    .line 307
    .line 308
    iput-object p1, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 309
    .line 310
    iput v3, v0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$1;->label:I

    .line 311
    .line 312
    .line 313
    invoke-static {p2, v7, v4, v0}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 314
    move-result-object p2

    .line 315
    .line 316
    if-ne p2, v1, :cond_b

    .line 317
    :goto_4
    return-object v1

    .line 318
    .line 319
    :cond_b
    :goto_5
    check-cast p2, Lcom/kubi/network/retrofit/utils/f;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p2}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 323
    move-result-object p1

    .line 324
    .line 325
    if-eqz p1, :cond_c

    .line 326
    .line 327
    new-instance p1, Lcom/kubi/spot/business/mvi/h;

    .line 328
    .line 329
    .line 330
    invoke-direct {p1}, Lcom/kubi/spot/business/mvi/h;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 334
    .line 335
    :cond_c
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 336
    return-object p1
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
.end method

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->A()Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;

    .line 4
    move-result-object v0

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
.end method

.method public onHide()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/vm/BaseVM;->onHide()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/spot/business/mvi/SpotTradeViewModel;->Y:Lf30/f;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lf30/f;->close()V

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
.end method
