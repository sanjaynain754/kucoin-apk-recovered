.class public final Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public synthetic a:Lkotlinx/coroutines/flow/f;

.field public synthetic b:Ljava/lang/Throwable;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;->c:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 3
    const/4 p1, 0x3

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
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Throwable;

    .line 5
    .line 6
    check-cast p3, Lkotlin/coroutines/Continuation;

    .line 7
    .line 8
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;->c:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, p3}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;->a:Lkotlinx/coroutines/flow/f;

    .line 16
    .line 17
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;->b:Ljava/lang/Throwable;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    return-object p1
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

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
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;->a:Lkotlinx/coroutines/flow/f;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;->b:Ljava/lang/Throwable;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;->c:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 13
    .line 14
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->a:Landroid/os/Bundle;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const-string v3, "arg_iddocsettype"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    :cond_0
    const-string v2, "TYPE_UNKNOWN"

    .line 27
    :cond_1
    const/4 v4, 0x4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 33
    .line 34
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    const-string v0, ""

    .line 47
    .line 48
    :cond_2
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p1, v0, v1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/l;->c:Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    sget-object v3, Lkotlinx/coroutines/g2;->b:Lkotlinx/coroutines/g2;

    .line 60
    .line 61
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/imageviewer/k;

    .line 62
    const/4 p1, 0x0

    .line 63
    .line 64
    .line 65
    invoke-direct {v5, v1, p1}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/k;-><init>(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V

    .line 66
    const/4 v6, 0x2

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v4, 0x0

    .line 69
    .line 70
    .line 71
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 72
    .line 73
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 74
    return-object p1
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
