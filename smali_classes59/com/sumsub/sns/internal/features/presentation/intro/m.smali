.class public final Lcom/sumsub/sns/internal/features/presentation/intro/m;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/intro/n;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/intro/n;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/intro/m;->a:Lcom/sumsub/sns/internal/features/presentation/intro/n;

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/intro/m;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/intro/m;->a:Lcom/sumsub/sns/internal/features/presentation/intro/n;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/intro/m;-><init>(Lcom/sumsub/sns/internal/features/presentation/intro/n;Lkotlin/coroutines/Continuation;)V

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
    check-cast p1, Lcom/sumsub/sns/core/presentation/base/s;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/intro/m;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/intro/m;->a:Lcom/sumsub/sns/internal/features/presentation/intro/n;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/intro/m;-><init>(Lcom/sumsub/sns/internal/features/presentation/intro/n;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/intro/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/intro/l;

    .line 9
    .line 10
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/intro/g;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/intro/m;->a:Lcom/sumsub/sns/internal/features/presentation/intro/n;

    .line 13
    .line 14
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->c:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->d:Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v2, v3, v4, v5}, Lcom/sumsub/sns/internal/core/presentation/intro/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/intro/b;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 29
    move-result-object v7

    .line 30
    .line 31
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/intro/m;->a:Lcom/sumsub/sns/internal/features/presentation/intro/n;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 40
    :goto_0
    move-object v8, v1

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/4 v1, 0x0

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :goto_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/intro/m;->a:Lcom/sumsub/sns/internal/features/presentation/intro/n;

    .line 46
    .line 47
    iget-object v9, v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->a:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v10, v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->b:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v11, v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->c:Ljava/lang/String;

    .line 52
    const/4 v12, 0x0

    .line 53
    .line 54
    .line 55
    invoke-direct/range {v6 .. v12}, Lcom/sumsub/sns/internal/core/presentation/intro/b;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 56
    .line 57
    iget-object v1, v6, Lcom/sumsub/sns/internal/core/presentation/intro/b;->e:Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/intro/l;-><init>(Lcom/sumsub/sns/internal/core/presentation/intro/g;Ljava/util/Map;)V

    .line 61
    return-object p1
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
.end method
