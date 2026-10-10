.class public final Lcom/sumsub/sns/internal/core/analytics/e;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static a:Lcom/sumsub/sns/internal/features/data/repository/analytics/a;

.field public static final b:Ljava/util/List;

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final d:Lkotlinx/coroutines/m0;

.field public static final e:Lkotlinx/coroutines/j0;

.field public static f:Lkotlinx/coroutines/x1;

.field public static g:Lkotlin/jvm/functions/Function1;

.field public static h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sput-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->b:Ljava/util/List;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 17
    .line 18
    sput-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x1

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2, v1}, Lkotlinx/coroutines/q2;->b(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/z;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    sput-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->d:Lkotlinx/coroutines/m0;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lkotlinx/coroutines/j0;->limitedParallelism(I)Lkotlinx/coroutines/j0;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    sput-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->e:Lkotlinx/coroutines/j0;

    .line 49
    .line 50
    sput-boolean v2, Lcom/sumsub/sns/internal/core/analytics/e;->h:Z

    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
