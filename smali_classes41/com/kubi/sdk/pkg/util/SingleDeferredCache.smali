.class public final Lcom/kubi/sdk/pkg/util/SingleDeferredCache;
.super Ljava/lang/Object;
.source "SingleDeferredCache.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/pkg/util/SingleDeferredCache$Companion;,
        Lcom/kubi/sdk/pkg/util/SingleDeferredCache$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000  *\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0002!\u0011B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004JK\u0010\r\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\u001c\u0010\u000c\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJA\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u000c\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00160\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00190\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\""
    }
    d2 = {
        "Lcom/kubi/sdk/pkg/util/SingleDeferredCache;",
        "T",
        "",
        "<init>",
        "()V",
        "",
        "key",
        "Lkotlin/Function0;",
        "",
        "onReuse",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "action",
        "c",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "timeout",
        "a",
        "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "b",
        "(J)V",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Lkotlinx/coroutines/r0;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "singleCache",
        "Lcom/kubi/sdk/pkg/util/SingleDeferredCache$a;",
        "resultCache",
        "Lrg0/a;",
        "Lrg0/a;",
        "singleLock",
        "d",
        "resultLock",
        "e",
        "Companion",
        "Package_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSingleDeferredCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleDeferredCache.kt\ncom/kubi/sdk/pkg/util/SingleDeferredCache\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 SingleDeferredCache.kt\ncom/kubi/sdk/pkg/util/SingleDeferredCache$Companion\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n108#2,10:112\n108#2,10:133\n515#3:122\n500#3,2:123\n502#3,4:127\n26#4:125\n25#4:126\n1855#5,2:131\n*S KotlinDebug\n*F\n+ 1 SingleDeferredCache.kt\ncom/kubi/sdk/pkg/util/SingleDeferredCache\n*L\n47#1:112,10\n92#1:133,10\n78#1:122\n78#1:123,2\n78#1:127,4\n78#1:125\n78#1:126\n79#1:131,2\n*E\n"
    }
.end annotation


# static fields
.field public static final e:Lcom/kubi/sdk/pkg/util/SingleDeferredCache$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lkotlinx/coroutines/r0<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/kubi/sdk/pkg/util/SingleDeferredCache$a<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lrg0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lrg0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->e:Lcom/kubi/sdk/pkg/util/SingleDeferredCache$Companion;

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

.method public constructor <init>()V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->b:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 5
    invoke-static {v0, v1, v2}, Lrg0/f;->b(ZILjava/lang/Object;)Lrg0/a;

    move-result-object v3

    iput-object v3, p0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->c:Lrg0/a;

    .line 6
    invoke-static {v0, v1, v2}, Lrg0/f;->b(ZILjava/lang/Object;)Lrg0/a;

    move-result-object v0

    iput-object v0, p0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->d:Lrg0/a;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;-><init>()V

    return-void
.end method

.method public static synthetic d(Lcom/kubi/sdk/pkg/util/SingleDeferredCache;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p5, p5, 0x2

    .line 3
    .line 4
    if-eqz p5, :cond_0

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.end method


# virtual methods
.method public final a(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p5

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->label:I

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
    iput v1, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->label:I

    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p5}, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;-><init>(Lcom/kubi/sdk/pkg/util/SingleDeferredCache;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p5, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->label:I

    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    const/4 v8, 0x0

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    if-eq v1, v3, :cond_2

    .line 42
    .line 43
    if-ne v1, v2, :cond_1

    .line 44
    .line 45
    iget-object p1, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lrg0/a;

    .line 48
    .line 49
    iget-object p2, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, Ljava/lang/String;

    .line 52
    .line 53
    iget-object p3, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p3, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;

    .line 56
    .line 57
    .line 58
    :try_start_0
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    move-object p2, v0

    .line 63
    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    throw p1

    .line 73
    .line 74
    :cond_2
    iget-wide p2, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->J$0:J

    .line 75
    .line 76
    iget-object p1, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$3:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Lrg0/a;

    .line 79
    .line 80
    iget-object p4, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$2:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p4, Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    iget-object v1, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$1:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Ljava/lang/String;

    .line 87
    .line 88
    iget-object v3, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;

    .line 91
    .line 92
    .line 93
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 94
    move-object p5, p1

    .line 95
    move-object p1, v1

    .line 96
    move-object v1, v3

    .line 97
    :goto_2
    move-object v4, p4

    .line 98
    goto :goto_3

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 102
    .line 103
    iget-object p5, p0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->d:Lrg0/a;

    .line 104
    .line 105
    iput-object p0, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$0:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object p1, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$1:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object p4, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$2:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object p5, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$3:Ljava/lang/Object;

    .line 112
    .line 113
    iput-wide p2, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->J$0:J

    .line 114
    .line 115
    iput v3, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->label:I

    .line 116
    .line 117
    .line 118
    invoke-interface {p5, v8, v5}, Lrg0/a;->d(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    if-ne v1, v0, :cond_4

    .line 122
    goto :goto_4

    .line 123
    :cond_4
    move-object v1, p0

    .line 124
    goto :goto_2

    .line 125
    .line 126
    .line 127
    :goto_3
    :try_start_1
    invoke-virtual {v1, p2, p3}, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->b(J)V

    .line 128
    .line 129
    iget-object p2, v1, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    move-result-object p2

    .line 134
    .line 135
    check-cast p2, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$a;

    .line 136
    .line 137
    if-eqz p2, :cond_5

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$a;->b()Ljava/lang/Object;

    .line 141
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 142
    .line 143
    .line 144
    invoke-interface {p5, v8}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 145
    return-object p1

    .line 146
    :catchall_1
    move-exception v0

    .line 147
    move-object p2, v0

    .line 148
    move-object p1, p5

    .line 149
    goto :goto_6

    .line 150
    .line 151
    :cond_5
    :try_start_2
    iput-object v1, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$0:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object p1, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$1:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object p5, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$2:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v8, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->L$3:Ljava/lang/Object;

    .line 158
    .line 159
    iput v2, v5, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$cache$1;->label:I

    .line 160
    const/4 v3, 0x0

    .line 161
    const/4 v6, 0x2

    .line 162
    const/4 v7, 0x0

    .line 163
    move-object v2, p1

    .line 164
    .line 165
    .line 166
    invoke-static/range {v1 .. v7}, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->d(Lcom/kubi/sdk/pkg/util/SingleDeferredCache;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 167
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 168
    .line 169
    if-ne p1, v0, :cond_6

    .line 170
    :goto_4
    return-object v0

    .line 171
    :cond_6
    move-object p2, p5

    .line 172
    move-object p5, p1

    .line 173
    move-object p1, p2

    .line 174
    move-object p3, v1

    .line 175
    move-object p2, v2

    .line 176
    .line 177
    :goto_5
    :try_start_3
    iget-object p3, p3, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 178
    .line 179
    new-instance p4, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$a;

    .line 180
    .line 181
    .line 182
    invoke-direct {p4, p5}, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$a;-><init>(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-interface {p3, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 186
    .line 187
    .line 188
    invoke-interface {p1, v8}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 189
    return-object p5

    .line 190
    .line 191
    .line 192
    :goto_6
    invoke-interface {p1, v8}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 193
    throw p2
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
.end method

.method public final b(J)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Ljava/util/Map$Entry;

    .line 28
    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    check-cast v3, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$a;->a()J

    .line 37
    move-result-wide v3

    .line 38
    .line 39
    const-wide/16 v5, 0x0

    .line 40
    .line 41
    cmp-long v5, p1, v5

    .line 42
    .line 43
    if-lez v5, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    move-result-wide v5

    .line 48
    sub-long/2addr v5, v3

    .line 49
    .line 50
    cmp-long v3, v5, p1

    .line 51
    .line 52
    if-lez v3, :cond_0

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 56
    move-result-object v3

    .line 57
    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    goto :goto_0

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toList(Ljava/util/Map;)Ljava/util/List;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    .line 71
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    move-result p2

    .line 77
    .line 78
    if-eqz p2, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    move-result-object p2

    .line 83
    .line 84
    check-cast p2, Lkotlin/Pair;

    .line 85
    .line 86
    iget-object v0, p0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 90
    move-result-object p2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    return-void
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
.end method

.method public final c(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p4, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p4

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->label:I

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
    iput v1, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p4}, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;-><init>(Lcom/kubi/sdk/pkg/util/SingleDeferredCache;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p4, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->label:I

    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    if-eq v2, v5, :cond_3

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    iget-object p1, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$2:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lkotlinx/coroutines/w;

    .line 49
    .line 50
    iget-object p2, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, Ljava/lang/String;

    .line 53
    .line 54
    iget-object p3, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p3, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;

    .line 57
    .line 58
    .line 59
    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    :catchall_0
    move-exception p4

    .line 63
    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    throw p1

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    return-object p4

    .line 77
    .line 78
    :cond_3
    iget-object p1, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$6:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Lrg0/a;

    .line 81
    .line 82
    iget-object p2, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$5:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 85
    .line 86
    iget-object p3, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$4:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p3, Lkotlinx/coroutines/w;

    .line 89
    .line 90
    iget-object v2, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$3:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 93
    .line 94
    iget-object v7, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$2:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 97
    .line 98
    iget-object v8, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$1:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v8, Ljava/lang/String;

    .line 101
    .line 102
    iget-object v9, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v9, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;

    .line 105
    .line 106
    .line 107
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 108
    move-object p4, v2

    .line 109
    move-object v2, p2

    .line 110
    move-object p2, v7

    .line 111
    move-object v7, p1

    .line 112
    move-object p1, v8

    .line 113
    goto :goto_1

    .line 114
    .line 115
    .line 116
    :cond_4
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v6, v5, v6}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    .line 120
    move-result-object p4

    .line 121
    .line 122
    new-instance v2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 123
    .line 124
    .line 125
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 126
    .line 127
    iget-object v7, p0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->c:Lrg0/a;

    .line 128
    .line 129
    iput-object p0, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object p1, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$1:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object p2, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$2:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object p3, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$3:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object p4, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$4:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object v2, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$5:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v7, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$6:Ljava/lang/Object;

    .line 142
    .line 143
    iput v5, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->label:I

    .line 144
    .line 145
    .line 146
    invoke-interface {v7, v6, v0}, Lrg0/a;->d(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 147
    move-result-object v8

    .line 148
    .line 149
    if-ne v8, v1, :cond_5

    .line 150
    goto :goto_3

    .line 151
    :cond_5
    move-object v9, p4

    .line 152
    move-object p4, p3

    .line 153
    move-object p3, v9

    .line 154
    move-object v9, p0

    .line 155
    .line 156
    :goto_1
    :try_start_1
    iget-object v8, v9, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    move-result-object v8

    .line 161
    .line 162
    check-cast v8, Lkotlinx/coroutines/r0;

    .line 163
    .line 164
    if-eqz v8, :cond_6

    .line 165
    .line 166
    if-eqz p2, :cond_7

    .line 167
    .line 168
    .line 169
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 170
    goto :goto_2

    .line 171
    :catchall_1
    move-exception p1

    .line 172
    goto :goto_6

    .line 173
    .line 174
    :cond_6
    iget-object p2, v9, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 175
    .line 176
    .line 177
    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    iput-boolean v5, v2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 180
    move-object v8, p3

    .line 181
    .line 182
    .line 183
    :cond_7
    :goto_2
    invoke-interface {v7, v6}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 184
    .line 185
    iget-boolean p2, v2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 186
    .line 187
    if-nez p2, :cond_9

    .line 188
    .line 189
    iput-object v6, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$0:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v6, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$1:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v6, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$2:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v6, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$3:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v6, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$4:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object v6, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$5:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object v6, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$6:Ljava/lang/Object;

    .line 202
    .line 203
    iput v4, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->label:I

    .line 204
    .line 205
    .line 206
    invoke-interface {v8, v0}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 207
    move-result-object p1

    .line 208
    .line 209
    if-ne p1, v1, :cond_8

    .line 210
    goto :goto_3

    .line 211
    :cond_8
    return-object p1

    .line 212
    .line 213
    :cond_9
    :try_start_2
    iput-object v9, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$0:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object p1, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$1:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object p3, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$2:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v6, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$3:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v6, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$4:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v6, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$5:Ljava/lang/Object;

    .line 224
    .line 225
    iput-object v6, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->L$6:Ljava/lang/Object;

    .line 226
    .line 227
    iput v3, v0, Lcom/kubi/sdk/pkg/util/SingleDeferredCache$single$1;->label:I

    .line 228
    .line 229
    .line 230
    invoke-interface {p4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    move-result-object p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 232
    .line 233
    if-ne p4, v1, :cond_a

    .line 234
    :goto_3
    return-object v1

    .line 235
    :cond_a
    move-object p2, p1

    .line 236
    move-object p1, p3

    .line 237
    move-object p3, v9

    .line 238
    .line 239
    .line 240
    :goto_4
    :try_start_3
    invoke-interface {p1, p4}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 241
    .line 242
    iget-object p3, p3, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p3, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    return-object p4

    .line 247
    :catchall_2
    move-exception p4

    .line 248
    move-object p2, p1

    .line 249
    move-object p1, p3

    .line 250
    move-object p3, v9

    .line 251
    .line 252
    .line 253
    :goto_5
    :try_start_4
    invoke-interface {p1, p4}, Lkotlinx/coroutines/w;->m(Ljava/lang/Throwable;)Z

    .line 254
    throw p4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 255
    :catchall_3
    move-exception p4

    .line 256
    .line 257
    iget-object p3, p3, Lcom/kubi/sdk/pkg/util/SingleDeferredCache;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p3, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    throw p4

    .line 262
    .line 263
    .line 264
    :goto_6
    invoke-interface {v7, v6}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 265
    throw p1
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
.end method
