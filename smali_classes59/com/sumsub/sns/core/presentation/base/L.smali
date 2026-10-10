.class public abstract Lcom/sumsub/sns/core/presentation/base/L;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/common/g;


# instance fields
.field public final a:Landroidx/lifecycle/SavedStateHandle;

.field public final b:Lcom/sumsub/sns/internal/features/data/model/common/X;

.field public final c:Lkotlinx/coroutines/m0;

.field public final d:Lkotlin/coroutines/jvm/internal/SuspendLambda;

.field public final e:Lkotlin/jvm/functions/Function2;

.field public final f:Lcom/sumsub/sns/internal/features/domain/utils/a;

.field public final g:Ljava/lang/String;

.field public final h:Lkotlinx/coroutines/flow/n;

.field public final i:Lkotlinx/coroutines/flow/w;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/X;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/base/L;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 3
    iput-object p3, p0, Lcom/sumsub/sns/core/presentation/base/L;->b:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 4
    iput-object p4, p0, Lcom/sumsub/sns/core/presentation/base/L;->c:Lkotlinx/coroutines/m0;

    .line 5
    check-cast p5, Lkotlin/coroutines/jvm/internal/SuspendLambda;

    iput-object p5, p0, Lcom/sumsub/sns/core/presentation/base/L;->d:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 6
    iput-object p6, p0, Lcom/sumsub/sns/core/presentation/base/L;->e:Lkotlin/jvm/functions/Function2;

    .line 7
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/utils/a;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/domain/utils/a;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/base/L;->f:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 8
    iput-object p2, p0, Lcom/sumsub/sns/core/presentation/base/L;->g:Ljava/lang/String;

    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/base/L;->h:Lkotlinx/coroutines/flow/n;

    .line 10
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/base/L;->i:Lkotlinx/coroutines/flow/w;

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/p0;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/X;)V
    .locals 7

    .line 11
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v4

    .line 12
    new-instance v5, Lcom/sumsub/sns/core/presentation/base/J;

    const/4 v0, 0x0

    invoke-direct {v5, p1, v0}, Lcom/sumsub/sns/core/presentation/base/J;-><init>(Lcom/sumsub/sns/core/presentation/base/p0;Lkotlin/coroutines/Continuation;)V

    .line 13
    new-instance v6, Lcom/sumsub/sns/core/presentation/base/e1;

    invoke-direct {v6, p1}, Lcom/sumsub/sns/core/presentation/base/e1;-><init>(Lcom/sumsub/sns/core/presentation/base/C;)V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/L;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/X;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;)Lkotlin/Unit;
    .locals 7

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 1
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/presentation/camera/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/sumsub/sns/core/presentation/base/K;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/core/presentation/base/K;

    iget v4, v3, Lcom/sumsub/sns/core/presentation/base/K;->f:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/core/presentation/base/K;->f:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/core/presentation/base/K;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/core/presentation/base/K;-><init>(Lcom/sumsub/sns/core/presentation/base/L;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/core/presentation/base/K;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 3
    iget v5, v3, Lcom/sumsub/sns/core/presentation/base/K;->f:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lcom/sumsub/sns/core/presentation/base/K;->c:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object v5, v3, Lcom/sumsub/sns/core/presentation/base/K;->b:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v7, v3, Lcom/sumsub/sns/core/presentation/base/K;->a:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/functions/Function4;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-object v1, v3, Lcom/sumsub/sns/core/presentation/base/K;->b:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function4;

    iget-object v5, v3, Lcom/sumsub/sns/core/presentation/base/K;->a:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v18, v2

    move-object v2, v1

    move-object v1, v5

    move-object/from16 v5, v18

    goto :goto_1

    :cond_4
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    iput-object v1, v3, Lcom/sumsub/sns/core/presentation/base/K;->a:Ljava/lang/Object;

    move-object/from16 v2, p2

    iput-object v2, v3, Lcom/sumsub/sns/core/presentation/base/K;->b:Ljava/lang/Object;

    iput v8, v3, Lcom/sumsub/sns/core/presentation/base/K;->f:I

    .line 5
    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v8, 0x0

    invoke-virtual {v5, v8, v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_5

    goto/16 :goto_3

    .line 6
    :cond_5
    :goto_1
    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/p;

    const/4 v8, 0x6

    if-nez v5, :cond_6

    .line 7
    const-string v10, "Failed to load applicant"

    invoke-virtual {v0, v10}, Lcom/sumsub/sns/core/presentation/base/L;->b(Ljava/lang/String;)V

    .line 8
    iget-object v10, v0, Lcom/sumsub/sns/core/presentation/base/L;->e:Lkotlin/jvm/functions/Function2;

    new-instance v11, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    new-instance v12, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    const/16 v16, 0x6

    const/16 v17, 0x0

    const-string v13, "Applicant null"

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v11, v12, v9, v9, v8}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    iget-object v12, v0, Lcom/sumsub/sns/core/presentation/base/L;->b:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 9
    iget-object v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 10
    invoke-interface {v10, v11, v12}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    :cond_6
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a()Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-result-object v1

    if-nez v1, :cond_7

    .line 12
    const-string v10, "Failed to load config"

    invoke-virtual {v0, v10}, Lcom/sumsub/sns/core/presentation/base/L;->b(Ljava/lang/String;)V

    .line 13
    iget-object v10, v0, Lcom/sumsub/sns/core/presentation/base/L;->e:Lkotlin/jvm/functions/Function2;

    new-instance v11, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    new-instance v12, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    const/16 v16, 0x6

    const/16 v17, 0x0

    const-string v13, "Config null"

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v11, v12, v9, v9, v8}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    iget-object v8, v0, Lcom/sumsub/sns/core/presentation/base/L;->b:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 14
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 15
    invoke-interface {v10, v11, v8}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    :cond_7
    iget-object v8, v0, Lcom/sumsub/sns/core/presentation/base/L;->d:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    iput-object v2, v3, Lcom/sumsub/sns/core/presentation/base/K;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/core/presentation/base/K;->b:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/core/presentation/base/K;->c:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v7, v3, Lcom/sumsub/sns/core/presentation/base/K;->f:I

    invoke-interface {v8, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_8

    goto :goto_3

    :cond_8
    move-object/from16 v18, v7

    move-object v7, v2

    move-object/from16 v2, v18

    .line 17
    :goto_2
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    if-eqz v5, :cond_a

    if-eqz v1, :cond_a

    .line 18
    iput-object v9, v3, Lcom/sumsub/sns/core/presentation/base/K;->a:Ljava/lang/Object;

    iput-object v9, v3, Lcom/sumsub/sns/core/presentation/base/K;->b:Ljava/lang/Object;

    iput-object v9, v3, Lcom/sumsub/sns/core/presentation/base/K;->c:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v6, v3, Lcom/sumsub/sns/core/presentation/base/K;->f:I

    invoke-interface {v7, v5, v1, v2, v3}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_9

    :goto_3
    return-object v4

    .line 19
    :cond_9
    :goto_4
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_a
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public abstract a()Ljava/lang/String;
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/L;->f:Lcom/sumsub/sns/internal/features/domain/utils/a;

    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/L;->g:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/L;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/L;->f:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/L;->g:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/L;->a()Ljava/lang/String;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, " "

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 34
    .line 35
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 36
    const/4 v2, 0x0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    return-void
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
.end method

.method public final getState()Lkotlinx/coroutines/flow/w;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/L;->i:Lkotlinx/coroutines/flow/w;

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
.end method
