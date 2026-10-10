.class public final Lhh/h;
.super Ljava/lang/Object;
.source "ICrossSocketApiDelegate.kt"

# interfaces
.implements Lsg/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0008\u0010\u0019\u001a\u00020\u001aH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\n\u001a\u0004\u0008\u000c\u0010\u0008\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/kubi/futures/classic/cross/delegate/ICrossSocketApiDelegate;",
        "Lcom/kubi/function/cross/IMultiSocketCrossApi;",
        "<init>",
        "()V",
        "periodApi",
        "Lcom/kubi/futures/classic/cross/api/ICrossSocketApi;",
        "kotlin.jvm.PlatformType",
        "getPeriodApi",
        "()Lcom/kubi/futures/classic/cross/api/ICrossSocketApi;",
        "periodApi$delegate",
        "Lkotlin/Lazy;",
        "socketApi",
        "getSocketApi",
        "socketApi$delegate",
        "observeMarginMode",
        "Lio/reactivex/Observable;",
        "",
        "",
        "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;",
        "isTrial",
        "",
        "observeCrossLeverage",
        "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;",
        "observeOccupancyBalance",
        "",
        "multiBizType",
        "Lcom/kubi/broker/MultiBizType;",
        "KumexLib_googleRelease"
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
        "SMAP\nICrossSocketApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ICrossSocketApiDelegate.kt\ncom/kubi/futures/classic/cross/delegate/ICrossSocketApiDelegate\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n463#2:116\n413#2:117\n1252#3,4:118\n*S KotlinDebug\n*F\n+ 1 ICrossSocketApiDelegate.kt\ncom/kubi/futures/classic/cross/delegate/ICrossSocketApiDelegate\n*L\n50#1:116\n50#1:117\n50#1:118,4\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lhh/d;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lhh/d;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lhh/h;->a:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lhh/e;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lhh/e;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lhh/h;->b:Lkotlin/Lazy;

    .line 26
    return-void
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
.end method

.method public static synthetic F0(Ljava/util/HashMap;)Ljava/util/Map;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lhh/h;->W0(Ljava/util/HashMap;)Ljava/util/Map;

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
.end method

.method public static synthetic U()Lgh/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lhh/h;->k1()Lgh/a;

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
.end method

.method public static final W0(Ljava/util/HashMap;)Ljava/util/Map;
    .locals 6

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/collections/MapsKt;->toMap(Ljava/util/Map;)Ljava/util/Map;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 15
    move-result v1

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 19
    move-result v1

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    move-result-object p0

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    check-cast v1, Ljava/util/Map$Entry;

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    new-instance v3, Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    check-cast v1, Ljava/lang/String;

    .line 55
    const/4 v4, 0x2

    .line 56
    const/4 v5, 0x0

    .line 57
    .line 58
    .line 59
    invoke-direct {v3, v1, v5, v4, v5}, Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    goto :goto_0

    .line 64
    .line 65
    .line 66
    :cond_0
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 67
    move-result-object p0

    .line 68
    return-object p0
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
.end method

.method public static synthetic a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lhh/h;->j1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/Map;

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
.end method

.method private static final j1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Ljava/util/Map;

    .line 12
    return-object p0
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
.end method

.method public static final k1()Lgh/a;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lmr/a;->a:Lmr/a;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lhr/c;->a(Lmr/a;)Lretrofit2/Retrofit;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-class v1, Lgh/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lgh/a;

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static final l1()Lgh/a;
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
    new-instance v1, Lgr/g;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ler/b;->b()Ler/a;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Lgr/g;-><init>(Ler/a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b$a;->b(Lkr/b;)Lcom/kubi/network/restful/b$a;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    new-instance v1, Lgr/h;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1}, Lgr/h;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b$a;->c(Lkr/d;)Lcom/kubi/network/restful/b$a;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/kubi/network/restful/b$a;->a()Lcom/kubi/network/restful/b;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    const-class v1, Lgh/a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    check-cast v0, Lgh/a;

    .line 40
    return-object v0
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
.end method

.method public static synthetic x0()Lgh/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lhh/h;->l1()Lgh/a;

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
.end method


# virtual methods
.method public C(Z)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lhh/h;->T0()Lgh/a;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v1, v0, v1}, Lgh/a;->m(Lgh/a;Ljava/lang/String;ILjava/lang/Object;)Lhr/f;

    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {v2, v1, v0, v1}, Lgh/a;->q(Lgh/a;Ljava/lang/String;ILjava/lang/Object;)Lhr/f;

    .line 17
    move-result-object v2

    .line 18
    :goto_0
    const/4 v3, 0x2

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lhh/h;->V0()Lgh/a;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v2, v1, v3, v1}, Lgh/a;->v(Lgh/a;Lhr/f;Lkr/c;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 28
    move-result-object p1

    .line 29
    goto :goto_1

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Lhh/h;->V0()Lgh/a;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v2, v1, v3, v1}, Lgh/a;->p(Lgh/a;Lhr/f;Lkr/c;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-static {v2, v1, v0, v1}, Lkotlinx/coroutines/rx2/RxConvertKt;->d(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v0}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    const-string v0, "merge(...)"

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    return-object p1
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
.end method

.method public E(Z)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/Observable<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lhh/h;->T0()Lgh/a;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v2, v1, v2}, Lgh/a;->o(Lgh/a;Ljava/lang/String;ILjava/lang/Object;)Lhr/f;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lhh/h;->V0()Lgh/a;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    .line 20
    invoke-static {v3, p1, v2, v0, v2}, Lgh/a;->t(Lgh/a;Lhr/f;Lkr/c;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v2, v1, v2}, Lkotlinx/coroutines/rx2/RxConvertKt;->d(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-static {v0, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    new-instance v0, Lhh/f;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Lhh/f;-><init>()V

    .line 35
    .line 36
    new-instance v1, Lhh/g;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v0}, Lhh/g;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    const-string v0, "map(...)"

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    return-object p1

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {p0}, Lhh/h;->T0()Lgh/a;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v2, v1, v2}, Lgh/a;->r(Lgh/a;Ljava/lang/String;ILjava/lang/Object;)Lhr/f;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lhh/h;->V0()Lgh/a;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    .line 64
    invoke-static {v3, p1, v2, v0, v2}, Lgh/a;->n(Lgh/a;Lhr/f;Lkr/c;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v2, v1, v2}, Lkotlinx/coroutines/rx2/RxConvertKt;->d(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-static {v0, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    const-string v0, "merge(...)"

    .line 76
    .line 77
    .line 78
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    return-object p1
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
.end method

.method public final T0()Lgh/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lhh/h;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lgh/a;

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
.end method

.method public final V0()Lgh/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lhh/h;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lgh/a;

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
.end method

.method public p(Z)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lhh/h;->T0()Lgh/a;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lgh/a;->j()Lhr/f;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lhh/h;->V0()Lgh/a;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    new-instance v3, Lhh/j;

    .line 19
    .line 20
    .line 21
    invoke-direct {v3}, Lhh/j;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v2, p1, v3}, Lgh/a;->i(Lhr/f;Lkr/c;)Lio/reactivex/Observable;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v1, v0, v1}, Lkotlinx/coroutines/rx2/RxConvertKt;->d(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-static {v2, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 37
    return-object p1

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0}, Lhh/h;->T0()Lgh/a;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Lgh/a;->f()Lhr/f;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lhh/h;->V0()Lgh/a;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    new-instance v3, Lhh/i;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3}, Lhh/i;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v2, p1, v3}, Lgh/a;->k(Lhr/f;Lkr/c;)Lio/reactivex/Observable;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v1, v0, v1}, Lkotlinx/coroutines/rx2/RxConvertKt;->d(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-static {v2, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 70
    return-object p1
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
.end method

.method public x()Lcom/kubi/broker/MultiBizType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/broker/MultiBizType;->CLASSIC:Lcom/kubi/broker/MultiBizType;

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
    .line 22
.end method
