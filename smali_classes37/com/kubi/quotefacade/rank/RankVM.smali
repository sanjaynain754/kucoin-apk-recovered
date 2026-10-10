.class public final Lcom/kubi/quotefacade/rank/RankVM;
.super Lcom/kubi/mvi/state/m;
.source "RankVM.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/quotefacade/rank/RankVM$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/m<",
        "Lcom/kubi/quotefacade/rank/RankContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u00192\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0094@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0002\u0010\u0016J\u0008\u0010\u0017\u001a\u00020\u0011H\u0002J\u0008\u0010\u0018\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/kubi/quotefacade/rank/RankVM;",
        "Lcom/kubi/mvi/state/SingleSimpleStateVM;",
        "Lcom/kubi/quotefacade/rank/RankContract$UIState;",
        "<init>",
        "()V",
        "repository",
        "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;",
        "rankEntityMapper",
        "Lcom/kubi/quotefacade/mapper/RankEntityMapper;",
        "getRankEntityMapper",
        "()Lcom/kubi/quotefacade/mapper/RankEntityMapper;",
        "rankEntityMapper$delegate",
        "Lkotlin/Lazy;",
        "initState",
        "getInitState",
        "()Lcom/kubi/quotefacade/rank/RankContract$UIState;",
        "dispatchIntent",
        "",
        "intent",
        "Lcom/kubi/mvi/state/IIntent;",
        "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchNewAllList",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "checkToShowRedDot",
        "fetchMarket",
        "Companion",
        "QuoteFacadeLib_googleRelease"
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
        "SMAP\nRankVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankVM.kt\ncom/kubi/quotefacade/rank/RankVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1869#2:95\n1563#2:96\n1634#2,3:97\n1870#2:100\n*S KotlinDebug\n*F\n+ 1 RankVM.kt\ncom/kubi/quotefacade/rank/RankVM\n*L\n56#1:95\n68#1:96\n68#1:97,3\n56#1:100\n*E\n"
    }
.end annotation


# static fields
.field public static final Z:Lcom/kubi/quotefacade/rank/RankVM$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final X:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/rank/RankVM$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/quotefacade/rank/RankVM$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/quotefacade/rank/RankVM;->Z:Lcom/kubi/quotefacade/rank/RankVM$Companion;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/m;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/quotefacade/rank/RankVM;->X:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/quotefacade/rank/n;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/kubi/quotefacade/rank/n;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    iput-object v0, p0, Lcom/kubi/quotefacade/rank/RankVM;->Y:Lkotlin/Lazy;

    .line 22
    return-void
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
.end method

.method public static synthetic n()Lkv/j;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/quotefacade/rank/RankVM;->w()Lkv/j;

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
.end method

.method public static final synthetic o(Lcom/kubi/quotefacade/rank/RankVM;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/rank/RankVM;->t(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic p(Lcom/kubi/quotefacade/rank/RankVM;)Lcom/kubi/quotefacade/repository/QuoteMarketRepository;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/quotefacade/rank/RankVM;->X:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

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
    .line 71
    .line 72
    .line 73
.end method

.method public static final synthetic q(Lcom/kubi/quotefacade/rank/RankVM;Ldr/a;)V
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
.end method

.method public static final w()Lkv/j;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lkv/j;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lkv/j;-><init>()V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public dispatchIntent(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
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
    instance-of v0, p1, Lcom/kubi/quotefacade/rank/RankContract$UiIntent$FetchNewAllList;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/kubi/quotefacade/rank/RankVM;->t(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    if-ne p1, p2, :cond_0

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    return-object p1

    .line 19
    .line 20
    :cond_1
    instance-of p2, p1, Lcom/kubi/quotefacade/rank/RankContract$UiIntent$CheckToShowNewTabRedDot;

    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/quotefacade/rank/RankVM;->r()V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_2
    instance-of p1, p1, Lcom/kubi/quotefacade/rank/RankContract$UiIntent$FetchMarket;

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/quotefacade/rank/RankVM;->s()V

    .line 34
    .line 35
    :cond_3
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 36
    return-object p1
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
.end method

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/rank/RankVM;->u()Lcom/kubi/quotefacade/rank/RankContract$UIState;

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
.end method

.method public final r()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v3, Lcom/kubi/quotefacade/rank/RankVM$checkToShowRedDot$1;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v3, p0, v1}, Lcom/kubi/quotefacade/rank/RankVM$checkToShowRedDot$1;-><init>(Lcom/kubi/quotefacade/rank/RankVM;Lkotlin/coroutines/Continuation;)V

    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 17
    return-void
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
.end method

.method public final s()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v3, Lcom/kubi/quotefacade/rank/RankVM$fetchMarket$1;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v3, p0, v1}, Lcom/kubi/quotefacade/rank/RankVM$fetchMarket$1;-><init>(Lcom/kubi/quotefacade/rank/RankVM;Lkotlin/coroutines/Continuation;)V

    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 17
    return-void
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
.end method

.method public final t(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    instance-of v2, v1, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;

    .line 12
    .line 13
    iget v3, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->label:I

    .line 14
    .line 15
    const/high16 v4, -0x80000000

    .line 16
    .line 17
    and-int v5, v3, v4

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    sub-int/2addr v3, v4

    .line 21
    .line 22
    iput v3, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->label:I

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v0, v1}, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;-><init>(Lcom/kubi/quotefacade/rank/RankVM;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    :goto_0
    iget-object v1, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->result:Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    iget v4, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->label:I

    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    const/4 v7, 0x0

    .line 40
    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    if-eq v4, v6, :cond_2

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    iget v4, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->I$0:I

    .line 48
    .line 49
    iget-object v8, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$4:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v8, Landroidx/lifecycle/MutableLiveData;

    .line 52
    .line 53
    iget-object v9, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$3:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v9, Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;

    .line 56
    .line 57
    iget-object v9, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v9, Ljava/util/Iterator;

    .line 60
    .line 61
    iget-object v10, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v10, Ljava/lang/Iterable;

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    .line 68
    goto/16 :goto_2

    .line 69
    .line 70
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    .line 75
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    throw v1

    .line 77
    .line 78
    :cond_2
    iget v4, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->I$0:I

    .line 79
    .line 80
    iget-object v8, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$4:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v8, Landroidx/lifecycle/MutableLiveData;

    .line 83
    .line 84
    iget-object v9, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$3:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v9, Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;

    .line 87
    .line 88
    iget-object v9, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$1:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v9, Ljava/util/Iterator;

    .line 91
    .line 92
    iget-object v10, v2, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v10, Ljava/lang/Iterable;

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 98
    .line 99
    goto/16 :goto_7

    .line 100
    .line 101
    .line 102
    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 103
    .line 104
    sget-object v1, Lcom/kubi/quotefacade/rank/config/e;->a:Lcom/kubi/quotefacade/rank/config/e;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/kubi/quotefacade/rank/config/e;->k()Lcom/kubi/quotefacade/rank/config/RankTabConfig;

    .line 108
    move-result-object v1

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Lcom/kubi/quotefacade/rank/config/RankTabConfig;->getSubTabs()Ljava/util/List;

    .line 112
    move-result-object v1

    .line 113
    .line 114
    .line 115
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    move-result-object v4

    .line 117
    move-object v13, v2

    .line 118
    move-object v2, v1

    .line 119
    move-object v1, v4

    .line 120
    move v4, v7

    .line 121
    .line 122
    .line 123
    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    move-result v8

    .line 125
    .line 126
    if-eqz v8, :cond_b

    .line 127
    .line 128
    .line 129
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    move-result-object v8

    .line 131
    move-object v9, v8

    .line 132
    .line 133
    check-cast v9, Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;

    .line 134
    .line 135
    sget-object v10, Lcom/kubi/quotefacade/rank/NewRankRedDotHelper;->a:Lcom/kubi/quotefacade/rank/NewRankRedDotHelper;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v9}, Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;->getType()Ljava/lang/String;

    .line 139
    move-result-object v11

    .line 140
    .line 141
    .line 142
    invoke-virtual {v10, v11}, Lcom/kubi/quotefacade/rank/NewRankRedDotHelper;->h(Ljava/lang/String;)Landroidx/lifecycle/MutableLiveData;

    .line 143
    move-result-object v10

    .line 144
    .line 145
    if-eqz v10, :cond_4

    .line 146
    .line 147
    .line 148
    invoke-virtual {v9}, Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;->isRankCoinSubTab()Z

    .line 149
    move-result v11

    .line 150
    .line 151
    if-nez v11, :cond_5

    .line 152
    .line 153
    .line 154
    invoke-virtual {v9}, Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;->isRankSpotSubTab()Z

    .line 155
    move-result v11

    .line 156
    .line 157
    if-eqz v11, :cond_6

    .line 158
    :cond_5
    move-object v11, v8

    .line 159
    .line 160
    goto/16 :goto_5

    .line 161
    .line 162
    .line 163
    :cond_6
    invoke-virtual {v9}, Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;->isRankFutureSubTab()Z

    .line 164
    move-result v11

    .line 165
    .line 166
    if-eqz v11, :cond_4

    .line 167
    .line 168
    iget-object v11, v0, Lcom/kubi/quotefacade/rank/RankVM;->X:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 169
    .line 170
    .line 171
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    move-result-object v12

    .line 173
    .line 174
    iput-object v12, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$0:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v1, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$1:Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    move-result-object v8

    .line 181
    .line 182
    iput-object v8, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$2:Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    move-result-object v8

    .line 187
    .line 188
    iput-object v8, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$3:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object v10, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$4:Ljava/lang/Object;

    .line 191
    .line 192
    iput v4, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->I$0:I

    .line 193
    .line 194
    iput v7, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->I$1:I

    .line 195
    .line 196
    iput v7, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->I$2:I

    .line 197
    .line 198
    iput v5, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->label:I

    .line 199
    .line 200
    const-string v8, "NEW_CURRENCY_V2"

    .line 201
    .line 202
    const-string v9, "CONTRACT"

    .line 203
    .line 204
    const-string v12, "HOMEPAGE"

    .line 205
    .line 206
    .line 207
    invoke-virtual {v11, v8, v9, v12, v13}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 208
    move-result-object v8

    .line 209
    .line 210
    if-ne v8, v3, :cond_7

    .line 211
    .line 212
    goto/16 :goto_6

    .line 213
    :cond_7
    move-object v9, v1

    .line 214
    move-object v1, v8

    .line 215
    move-object v8, v10

    .line 216
    move-object v10, v2

    .line 217
    move-object v2, v13

    .line 218
    .line 219
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 220
    .line 221
    if-eqz v1, :cond_9

    .line 222
    .line 223
    new-instance v11, Ljava/util/ArrayList;

    .line 224
    .line 225
    const/16 v12, 0xa

    .line 226
    .line 227
    .line 228
    invoke-static {v1, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 229
    move-result v12

    .line 230
    .line 231
    .line 232
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 236
    move-result-object v1

    .line 237
    .line 238
    .line 239
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    move-result v12

    .line 241
    .line 242
    if-eqz v12, :cond_8

    .line 243
    .line 244
    .line 245
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    move-result-object v12

    .line 247
    .line 248
    check-cast v12, Lcom/kubi/quotefacade/entity/RankFuturesEntity;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Lcom/kubi/quotefacade/rank/RankVM;->v()Lkv/j;

    .line 252
    move-result-object v13

    .line 253
    .line 254
    .line 255
    invoke-virtual {v13, v12}, Lkv/j;->b(Lcom/kubi/quotefacade/entity/RankFuturesEntity;)Lcom/kubi/quotefacade/entity/RankEntity;

    .line 256
    move-result-object v12

    .line 257
    .line 258
    .line 259
    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 260
    goto :goto_3

    .line 261
    .line 262
    .line 263
    :cond_8
    invoke-virtual {v8, v11}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 264
    :cond_9
    :goto_4
    move-object v13, v2

    .line 265
    move-object v1, v9

    .line 266
    move-object v2, v10

    .line 267
    .line 268
    goto/16 :goto_1

    .line 269
    .line 270
    :goto_5
    iget-object v8, v0, Lcom/kubi/quotefacade/rank/RankVM;->X:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 271
    .line 272
    .line 273
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    move-result-object v12

    .line 275
    .line 276
    iput-object v12, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$0:Ljava/lang/Object;

    .line 277
    .line 278
    iput-object v1, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$1:Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    move-result-object v11

    .line 283
    .line 284
    iput-object v11, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$2:Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    move-result-object v9

    .line 289
    .line 290
    iput-object v9, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$3:Ljava/lang/Object;

    .line 291
    .line 292
    iput-object v10, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->L$4:Ljava/lang/Object;

    .line 293
    .line 294
    iput v4, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->I$0:I

    .line 295
    .line 296
    iput v7, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->I$1:I

    .line 297
    .line 298
    iput v7, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->I$2:I

    .line 299
    .line 300
    iput v6, v13, Lcom/kubi/quotefacade/rank/RankVM$fetchNewAllList$1;->label:I

    .line 301
    .line 302
    const-string v9, "NEW_CURRENCY_V2"

    .line 303
    move-object v11, v10

    .line 304
    .line 305
    const-string v10, "COIN"

    .line 306
    move-object v12, v11

    .line 307
    .line 308
    const-string v11, "HOMEPAGE"

    .line 309
    move-object v14, v12

    .line 310
    const/4 v12, 0x0

    .line 311
    move-object v15, v14

    .line 312
    .line 313
    const/16 v14, 0x8

    .line 314
    .line 315
    move-object/from16 v16, v15

    .line 316
    const/4 v15, 0x0

    .line 317
    .line 318
    .line 319
    invoke-static/range {v8 .. v15}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->q(Lcom/kubi/quotefacade/repository/QuoteMarketRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 320
    move-result-object v8

    .line 321
    .line 322
    if-ne v8, v3, :cond_a

    .line 323
    :goto_6
    return-object v3

    .line 324
    :cond_a
    move-object v9, v1

    .line 325
    move-object v10, v2

    .line 326
    move-object v1, v8

    .line 327
    move-object v2, v13

    .line 328
    .line 329
    move-object/from16 v8, v16

    .line 330
    .line 331
    :goto_7
    check-cast v1, Ljava/util/List;

    .line 332
    .line 333
    if-eqz v1, :cond_9

    .line 334
    .line 335
    .line 336
    invoke-virtual {v8, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 337
    goto :goto_4

    .line 338
    .line 339
    :cond_b
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 340
    return-object v1
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
.end method

.method public u()Lcom/kubi/quotefacade/rank/RankContract$UIState;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/rank/RankContract$UIState;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2, v1}, Lcom/kubi/quotefacade/rank/RankContract$UIState;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    return-object v0
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
.end method

.method public final v()Lkv/j;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/rank/RankVM;->Y:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lkv/j;

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
.end method
