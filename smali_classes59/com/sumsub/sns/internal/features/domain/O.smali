.class public final Lcom/sumsub/sns/internal/features/domain/O;
.super Lcom/sumsub/sns/internal/core/domain/base/b;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final b:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

.field public final c:Lcom/sumsub/sns/internal/features/data/repository/log/b;

.field public final d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 9
    .line 10
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/domain/h;->e:Lkotlin/Lazy;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 17
    .line 18
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/domain/h;->m:Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/log/b;

    .line 25
    .line 26
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0}, Lcom/sumsub/sns/internal/core/domain/base/b;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;)V

    .line 36
    .line 37
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/domain/O;->b:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 38
    .line 39
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/domain/O;->c:Lcom/sumsub/sns/internal/features/data/repository/log/b;

    .line 40
    .line 41
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/O;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 42
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v3, 0x1

    instance-of v4, v0, Lcom/sumsub/sns/internal/features/domain/N;

    if-eqz v4, :cond_0

    move-object v4, v0

    check-cast v4, Lcom/sumsub/sns/internal/features/domain/N;

    iget v5, v4, Lcom/sumsub/sns/internal/features/domain/N;->f:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/sumsub/sns/internal/features/domain/N;->f:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/sumsub/sns/internal/features/domain/N;

    invoke-direct {v4, v1, v0}, Lcom/sumsub/sns/internal/features/domain/N;-><init>(Lcom/sumsub/sns/internal/features/domain/O;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v0, v4, Lcom/sumsub/sns/internal/features/domain/N;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 2
    iget v6, v4, Lcom/sumsub/sns/internal/features/domain/N;->f:I

    const/4 v7, 0x0

    packed-switch v6, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1a

    :pswitch_1
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/domain/N;->c:Ljava/lang/Object;

    check-cast v6, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    iget-object v8, v4, Lcom/sumsub/sns/internal/features/domain/N;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v9, v4, Lcom/sumsub/sns/internal/features/domain/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/sumsub/sns/core/data/model/SNSApplicantNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v23, 0x0

    goto/16 :goto_c

    :catch_0
    move-exception v0

    goto/16 :goto_16

    :catch_1
    move-exception v0

    goto/16 :goto_18

    :pswitch_2
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/domain/N;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v8, v4, Lcom/sumsub/sns/internal/features/domain/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/sumsub/sns/core/data/model/SNSApplicantNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/16 v23, 0x0

    :cond_1
    move-object v9, v8

    move-object v8, v6

    goto/16 :goto_b

    :pswitch_3
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/domain/N;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v8, v4, Lcom/sumsub/sns/internal/features/domain/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    :try_start_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/sumsub/sns/core/data/model/SNSApplicantNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_2
    const/16 v23, 0x0

    goto/16 :goto_a

    :pswitch_4
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/domain/N;->c:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v8, v4, Lcom/sumsub/sns/internal/features/domain/N;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v9, v4, Lcom/sumsub/sns/internal/features/domain/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    :try_start_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Lcom/sumsub/sns/core/data/model/SNSApplicantNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object/from16 v24, v8

    move-object v8, v6

    move-object/from16 v6, v24

    goto/16 :goto_9

    :pswitch_5
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/domain/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    :try_start_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v6

    goto :goto_2

    :pswitch_6
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_4
    .catch Lcom/sumsub/sns/core/data/model/SNSApplicantNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :pswitch_7
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    :try_start_5
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/domain/O;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v3, v4, Lcom/sumsub/sns/internal/features/domain/N;->f:I

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v0, v3, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->c(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_3

    goto/16 :goto_19

    .line 4
    :cond_3
    :goto_1
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 5
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->a:Ljava/lang/String;

    .line 6
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_1e

    .line 7
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/domain/O;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object v0, v4, Lcom/sumsub/sns/internal/features/domain/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    const/4 v8, 0x2

    iput v8, v4, Lcom/sumsub/sns/internal/features/domain/N;->f:I

    check-cast v6, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v6, v3, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_4

    goto/16 :goto_19

    :cond_4
    move-object v8, v0

    move-object v0, v6

    .line 8
    :goto_2
    move-object v6, v0

    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 9
    invoke-static {v8}, Lcom/sumsub/sns/internal/features/data/model/common/i;->k(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 10
    const-string v0, "faceEnrollment"

    .line 11
    iget-object v9, v8, Lcom/sumsub/sns/internal/features/data/model/common/h;->x:Lcom/sumsub/sns/internal/features/data/model/common/g;

    if-eqz v9, :cond_5

    .line 12
    iget-object v9, v9, Lcom/sumsub/sns/internal/features/data/model/common/g;->b:Lcom/sumsub/sns/core/data/model/FlowActionType;

    if-eqz v9, :cond_5

    .line 13
    invoke-virtual {v9}, Lcom/sumsub/sns/core/data/model/FlowActionType;->getValue()Ljava/lang/String;

    move-result-object v9

    goto :goto_3

    :cond_5
    move-object v9, v7

    :goto_3
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_4

    .line 14
    :cond_6
    new-instance v2, Lcom/sumsub/sns/core/data/model/SNSInvalidParametersException;

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\""

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" action type is deprecated"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 16
    invoke-direct {v2, v0}, Lcom/sumsub/sns/core/data/model/SNSInvalidParametersException;-><init>(Ljava/util/List;)V

    throw v2

    .line 17
    :cond_7
    :goto_4
    invoke-static {v8}, Lcom/sumsub/sns/internal/features/data/model/common/i;->k(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 18
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v0

    .line 19
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->h:Ljava/lang/String;

    if-eqz v0, :cond_8

    .line 20
    sget-object v9, Lcom/sumsub/sns/internal/core/analytics/e;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/a;

    sget-object v9, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->LevelName:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    .line 21
    sget-object v10, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v10, v9, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 22
    :cond_8
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/a;

    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->LevelName:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    .line 23
    sget-object v9, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v9, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    :goto_5
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/p;->f()Lcom/sumsub/sns/internal/features/data/model/common/j;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 25
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/j;->a:Ljava/lang/String;

    if-eqz v0, :cond_9

    .line 26
    sget-object v9, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->Country:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    .line 27
    sget-object v10, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v10, v9, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    .line 28
    :cond_9
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->Country:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    .line 29
    sget-object v9, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v9, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    :goto_6
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object v0

    .line 31
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/n;->a:Ljava/util/List;

    .line 32
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 34
    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 35
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 36
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/features/data/model/common/X;->g()Z

    move-result v11

    if-nez v11, :cond_b

    goto :goto_8

    :cond_b
    move-object v10, v7

    :goto_8
    if-eqz v10, :cond_a

    .line 37
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 38
    :cond_c
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 39
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/domain/O;->b:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    iput-object v8, v4, Lcom/sumsub/sns/internal/features/domain/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v6, v4, Lcom/sumsub/sns/internal/features/domain/N;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v9, v4, Lcom/sumsub/sns/internal/features/domain/N;->c:Ljava/lang/Object;

    const/4 v10, 0x3

    iput v10, v4, Lcom/sumsub/sns/internal/features/domain/N;->f:I

    invoke-virtual {v0, v4}, Lcom/sumsub/sns/internal/features/data/repository/settings/c;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_d

    goto/16 :goto_19

    :cond_d
    move-object/from16 v24, v9

    move-object v9, v8

    move-object/from16 v8, v24

    .line 40
    :goto_9
    check-cast v0, Ljava/lang/String;

    .line 41
    iget-object v10, v1, Lcom/sumsub/sns/internal/features/domain/O;->c:Lcom/sumsub/sns/internal/features/data/repository/log/b;

    .line 42
    sget-object v21, Lcom/sumsub/sns/internal/features/data/model/common/LogType;->Warn:Lcom/sumsub/sns/internal/features/data/model/common/LogType;

    .line 43
    new-instance v17, Lcom/sumsub/sns/internal/features/data/model/common/LogParams;

    .line 44
    const-string v18, ""

    .line 45
    const-string v19, "PrepareSDKUseCase.kt"

    .line 46
    new-instance v14, Lcom/sumsub/sns/internal/features/domain/y0;

    invoke-direct {v14}, Lcom/sumsub/sns/internal/features/domain/y0;-><init>()V

    const/16 v15, 0x1f

    const/16 v16, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move-object/from16 v20, v12

    const/4 v12, 0x0

    move-object/from16 v22, v13

    const/4 v13, 0x0

    move-object/from16 v3, v20

    move-object/from16 v2, v22

    const/16 v23, 0x0

    invoke-static/range {v8 .. v16}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Unknown idDocSetType type: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v12, v18

    .line 47
    const-string v18, ""

    move-object/from16 v14, v19

    const/16 v19, 0x41

    const/16 v20, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v10, v17

    const/16 v17, 0x0

    move-object v15, v0

    .line 48
    invoke-direct/range {v10 .. v20}, Lcom/sumsub/sns/internal/features/data/model/common/LogParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 49
    iput-object v2, v4, Lcom/sumsub/sns/internal/features/domain/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v6, v4, Lcom/sumsub/sns/internal/features/domain/N;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v7, v4, Lcom/sumsub/sns/internal/features/domain/N;->c:Ljava/lang/Object;

    const/4 v0, 0x4

    iput v0, v4, Lcom/sumsub/sns/internal/features/domain/N;->f:I

    .line 50
    iget-object v0, v3, Lcom/sumsub/sns/internal/features/data/repository/log/b;->a:Lcom/sumsub/sns/internal/features/data/repository/log/a;

    .line 51
    invoke-virtual/range {v21 .. v21}, Lcom/sumsub/sns/internal/features/data/model/common/LogType;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v10}, Lcom/sumsub/sns/internal/features/data/model/common/y2;->a(Lcom/sumsub/sns/internal/features/data/model/common/LogParams;)Ljava/util/LinkedHashMap;

    move-result-object v8

    invoke-interface {v0, v3, v8, v4}, Lcom/sumsub/sns/internal/features/data/repository/log/a;->a(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_e

    goto/16 :goto_19

    :cond_e
    move-object v8, v2

    .line 52
    :goto_a
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/domain/O;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object v8, v4, Lcom/sumsub/sns/internal/features/domain/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v6, v4, Lcom/sumsub/sns/internal/features/domain/N;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    const/4 v2, 0x5

    iput v2, v4, Lcom/sumsub/sns/internal/features/domain/N;->f:I

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v0, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_1

    goto/16 :goto_19

    .line 53
    :goto_b
    move-object v6, v0

    check-cast v6, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 54
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getSupportItems()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1d

    .line 55
    iget-object v0, v1, Lcom/sumsub/sns/internal/core/domain/base/b;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 56
    iput-object v9, v4, Lcom/sumsub/sns/internal/features/domain/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v8, v4, Lcom/sumsub/sns/internal/features/domain/N;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v6, v4, Lcom/sumsub/sns/internal/features/domain/N;->c:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v4, Lcom/sumsub/sns/internal/features/domain/N;->f:I

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    invoke-virtual {v0, v4}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_f

    goto/16 :goto_19

    .line 57
    :cond_f
    :goto_c
    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_1a

    .line 58
    const-string/jumbo v10, "supportEmail"

    const/16 v2, 0x2f

    int-to-char v2, v2

    const/4 v3, 0x1

    .line 59
    new-array v11, v3, [C

    aput-char v2, v11, v23

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 60
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 61
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/16 v22, 0x1

    add-int/lit8 v0, v0, -0x1

    move/from16 v10, v23

    invoke-static {v10, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    .line 62
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_18

    move-object v10, v0

    check-cast v10, Lkotlin/collections/IntIterator;

    invoke-virtual {v10}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v10

    .line 63
    iget-object v11, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v11, Ljava/util/Map;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Ljava/util/Map;

    if-eqz v11, :cond_10

    check-cast v10, Ljava/util/Map;

    goto :goto_e

    :cond_10
    move-object v10, v7

    :goto_e
    if-eqz v10, :cond_1a

    .line 64
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 65
    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_11
    :goto_f
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_16

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    .line 66
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Ljava/lang/String;

    if-nez v14, :cond_12

    move-object v13, v7

    :cond_12
    check-cast v13, Ljava/lang/String;

    if-nez v13, :cond_13

    goto :goto_10

    .line 67
    :cond_13
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_14

    move-object v12, v7

    :cond_14
    if-nez v12, :cond_15

    :goto_10
    move-object v12, v7

    goto :goto_11

    .line 68
    :cond_15
    invoke-static {v13, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    :goto_11
    if-eqz v12, :cond_11

    .line 69
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 70
    :cond_16
    invoke-static {v11}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v10

    if-nez v10, :cond_17

    goto :goto_12

    .line 71
    :cond_17
    iput-object v10, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_d

    .line 72
    :cond_18
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    if-nez v2, :cond_19

    move-object v0, v7

    :cond_19
    check-cast v0, Ljava/lang/String;

    move-object v14, v0

    goto :goto_13

    :cond_1a
    :goto_12
    move-object v14, v7

    .line 73
    :goto_13
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    if-eqz v14, :cond_1c

    .line 74
    invoke-static {v14}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_14

    .line 75
    :cond_1b
    new-instance v10, Lcom/sumsub/sns/core/data/model/SNSSupportItem;

    .line 76
    const-string/jumbo v0, "sns_support_EMAIL_title"

    invoke-virtual {v6, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 77
    const-string/jumbo v0, "sns_support_EMAIL_description"

    invoke-virtual {v6, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 78
    sget-object v13, Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;->Email:Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;

    .line 79
    sget-object v0, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->MAIL:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v16

    const/16 v18, 0x50

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    .line 80
    invoke-direct/range {v10 .. v19}, Lcom/sumsub/sns/core/data/model/SNSSupportItem;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_15

    .line 81
    :cond_1c
    :goto_14
    new-instance v10, Lcom/sumsub/sns/core/data/model/SNSSupportItem;

    .line 82
    const-string/jumbo v0, "sns_support_URL_title"

    invoke-virtual {v6, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 83
    const-string/jumbo v0, "sns_support_URL_description"

    invoke-virtual {v6, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 84
    sget-object v13, Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;->Url:Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;

    .line 85
    const-string v14, "https://support.sumsub.com/hc/"

    .line 86
    sget-object v0, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->MAIL:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v16

    const/16 v18, 0x50

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    .line 87
    invoke-direct/range {v10 .. v19}, Lcom/sumsub/sns/core/data/model/SNSSupportItem;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 88
    :goto_15
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 89
    sget-object v2, Lcom/sumsub/sns/internal/core/common/k0;->u:Lkotlin/jvm/functions/Function1;

    if-eqz v2, :cond_1d

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    :cond_1d
    sget-object v10, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 91
    const-string v11, "PrepareSDKUseCase"

    .line 92
    iget-object v0, v9, Lcom/sumsub/sns/internal/features/data/model/common/h;->b:Lcom/sumsub/sns/core/data/model/FlowType;

    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SDK got the following data: Config is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", Flow type is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    .line 94
    invoke-static/range {v10 .. v15}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 95
    const-string v0, "PrepareSDKUseCase"

    .line 96
    iget-object v2, v9, Lcom/sumsub/sns/internal/features/data/model/common/h;->b:Lcom/sumsub/sns/core/data/model/FlowType;

    .line 97
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "SDK got the config for flow type "

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 98
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 99
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 100
    invoke-virtual {v3, v0, v2, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/Z;

    new-instance v2, Lcom/sumsub/sns/internal/features/domain/M;

    invoke-direct {v2, v9, v8, v6}, Lcom/sumsub/sns/internal/features/domain/M;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)V

    invoke-direct {v0, v2}, Lcom/sumsub/sns/internal/features/data/model/common/Z;-><init>(Ljava/lang/Object;)V

    return-object v0

    .line 102
    :cond_1e
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSApplicantNotFoundException;

    const/4 v3, 0x1

    invoke-direct {v0, v7, v3, v7}, Lcom/sumsub/sns/core/data/model/SNSApplicantNotFoundException;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
    :try_end_5
    .catch Lcom/sumsub/sns/core/data/model/SNSApplicantNotFoundException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 103
    :goto_16
    instance-of v2, v0, Lcom/sumsub/sns/core/data/model/SNSInvalidParametersException;

    if-eqz v2, :cond_1f

    new-instance v2, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$InvalidParameters;

    move-object v3, v0

    check-cast v3, Lcom/sumsub/sns/core/data/model/SNSInvalidParametersException;

    invoke-virtual {v3}, Lcom/sumsub/sns/core/data/model/SNSInvalidParametersException;->getMessages()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$InvalidParameters;-><init>(Ljava/util/List;)V

    goto :goto_17

    .line 104
    :cond_1f
    new-instance v2, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$InitialLoadingFailed;

    invoke-direct {v2, v0}, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$InitialLoadingFailed;-><init>(Ljava/lang/Exception;)V

    .line 105
    :goto_17
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/domain/base/b;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 106
    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    invoke-virtual {v3, v2}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 107
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/Y;

    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/data/model/common/Y;-><init>(Ljava/lang/Object;)V

    goto :goto_1b

    .line 108
    :goto_18
    iput-object v7, v4, Lcom/sumsub/sns/internal/features/domain/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v7, v4, Lcom/sumsub/sns/internal/features/domain/N;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v7, v4, Lcom/sumsub/sns/internal/features/domain/N;->c:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, v4, Lcom/sumsub/sns/internal/features/domain/N;->f:I

    .line 109
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/domain/base/b;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    invoke-static {v2, v0}, Lcom/sumsub/sns/internal/core/domain/base/c;->a(Lcom/sumsub/sns/internal/features/data/repository/common/a;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    if-ne v0, v5, :cond_20

    :goto_19
    return-object v5

    .line 110
    :cond_20
    :goto_1a
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/Y;

    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/data/model/common/Y;-><init>(Ljava/lang/Object;)V

    :goto_1b
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
