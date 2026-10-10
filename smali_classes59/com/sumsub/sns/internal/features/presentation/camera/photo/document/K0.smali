.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

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
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;->a:Ljava/lang/Object;

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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/N;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

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
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;->a:Ljava/lang/Object;

    .line 9
    move-object v0, p1

    .line 10
    .line 11
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/N;

    .line 12
    const/4 v5, 0x0

    .line 13
    .line 14
    const/16 v6, 0x37

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/presentation/camera/N;->a(Lcom/sumsub/sns/internal/features/presentation/camera/N;ZZZZLcom/sumsub/sns/internal/core/presentation/helper/camera/f;I)Lcom/sumsub/sns/internal/features/presentation/camera/N;

    .line 22
    move-result-object v7

    .line 23
    .line 24
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 25
    .line 26
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->B:Z

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    const/4 v12, 0x0

    .line 30
    .line 31
    const/16 v13, 0x39

    .line 32
    const/4 v8, 0x1

    .line 33
    const/4 v9, 0x1

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static/range {v7 .. v13}, Lcom/sumsub/sns/internal/features/presentation/camera/N;->a(Lcom/sumsub/sns/internal/features/presentation/camera/N;ZZZZLcom/sumsub/sns/internal/core/presentation/helper/camera/f;I)Lcom/sumsub/sns/internal/features/presentation/camera/N;

    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_0
    return-object v7
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
.end method
