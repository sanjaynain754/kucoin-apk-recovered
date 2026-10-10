.class final Lcom/kubi/abtest/KCABTestService$getOrCreateRequest$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "KCABTestService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/abtest/KCABTestService;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/abtest/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.abtest.KCABTestService"
    f = "KCABTestService.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x9d
    }
    m = "getOrCreateRequest"
    n = {
        "cacheKey",
        "experimentId",
        "defaultValue",
        "identity",
        "$this$withLock_u24default$iv",
        "$i$f$withLock"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "I$0"
    }
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/kubi/abtest/KCABTestService;


# direct methods
.method public constructor <init>(Lcom/kubi/abtest/KCABTestService;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/abtest/KCABTestService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/abtest/KCABTestService$getOrCreateRequest$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/abtest/KCABTestService$getOrCreateRequest$1;->this$0:Lcom/kubi/abtest/KCABTestService;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 6
    return-void
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
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/abtest/KCABTestService$getOrCreateRequest$1;->result:Ljava/lang/Object;

    .line 3
    .line 4
    iget p1, p0, Lcom/kubi/abtest/KCABTestService$getOrCreateRequest$1;->label:I

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    or-int/2addr p1, v0

    .line 8
    .line 9
    iput p1, p0, Lcom/kubi/abtest/KCABTestService$getOrCreateRequest$1;->label:I

    .line 10
    .line 11
    iget-object v0, p0, Lcom/kubi/abtest/KCABTestService$getOrCreateRequest$1;->this$0:Lcom/kubi/abtest/KCABTestService;

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v5, p0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lcom/kubi/abtest/KCABTestService;->e(Lcom/kubi/abtest/KCABTestService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/abtest/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    return-object p1
    .line 22
    .line 23
.end method
