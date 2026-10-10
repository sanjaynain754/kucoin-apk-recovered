.class public final Lcom/sumsub/sns/internal/core/domain/facedetector/b;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/facedetector/d;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/b;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/internal/core/domain/facedetector/b;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/b;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/core/domain/facedetector/b;-><init>(Lcom/sumsub/sns/internal/core/domain/facedetector/d;Lkotlin/coroutines/Continuation;)V

    .line 8
    return-object p1
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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance p1, Lcom/sumsub/sns/internal/core/domain/facedetector/b;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/b;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/core/domain/facedetector/b;-><init>(Lcom/sumsub/sns/internal/core/domain/facedetector/d;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/core/domain/facedetector/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 7
    .line 8
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/domain/facedetector/b;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/domain/facedetector/d;->a()Lcom/sumsub/sns/internal/core/domain/facedetector/g;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/g;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 21
    .line 22
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;->FaceDetection:Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;)Lcom/sumsub/sns/internal/core/analytics/g;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    .line 29
    .line 30
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;->Completed:Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Lcom/sumsub/sns/internal/core/domain/facedetector/g;->getName()Ljava/lang/String;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    const-string v1, "detector"

    .line 40
    .line 41
    .line 42
    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 43
    move-result-object p1

    .line 44
    const/4 v1, 0x1

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    const-string/jumbo v2, "start"

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    filled-new-array {p1, v1}, [Lkotlin/Pair;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    iput-object p1, v0, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 70
    const/4 p1, 0x0

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    .line 74
    .line 75
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 76
    return-object p1
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
