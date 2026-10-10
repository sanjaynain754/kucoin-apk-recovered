.class public final Lcom/sumsub/sns/internal/features/domain/e;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/e;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/e;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 8
    return-void
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
.method public final a(Lcom/sumsub/sns/internal/features/domain/n;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/sumsub/sns/internal/features/domain/c;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/features/domain/c;

    iget v3, v2, Lcom/sumsub/sns/internal/features/domain/c;->d:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/domain/c;->d:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/c;

    invoke-direct {v2, v1, v0}, Lcom/sumsub/sns/internal/features/domain/c;-><init>(Lcom/sumsub/sns/internal/features/domain/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/domain/c;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 47
    iget v4, v2, Lcom/sumsub/sns/internal/features/domain/c;->d:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/domain/c;->a:Lcom/sumsub/sns/internal/features/domain/n;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 48
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/domain/e;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v4, p1

    :try_start_2
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/domain/c;->a:Lcom/sumsub/sns/internal/features/domain/n;

    iput v5, v2, Lcom/sumsub/sns/internal/features/domain/c;->d:I

    .line 49
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->c(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, v4

    .line 50
    :goto_1
    :try_start_3
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 51
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->e:Ljava/util/Map;

    if-eqz v0, :cond_a

    .line 52
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    move-object v0, v6

    :goto_2
    if-nez v0, :cond_5

    goto/16 :goto_5

    .line 53
    :cond_5
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/domain/n;->c:Ljava/util/Map;

    .line 54
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 55
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 56
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    .line 57
    sget-boolean v7, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-eqz v7, :cond_7

    if-nez v5, :cond_7

    .line 58
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const-string v12, "CountriesUseCase"

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "filtered out "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_7
    if-eqz v5, :cond_6

    .line 59
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v10, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 60
    :cond_8
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/domain/n;->e:Ljava/lang/String;

    if-eqz v0, :cond_9

    .line 61
    invoke-interface {v10, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    move-object v12, v0

    goto :goto_4

    :cond_9
    move-object v12, v6

    .line 62
    :goto_4
    iget-object v8, v2, Lcom/sumsub/sns/internal/features/domain/n;->a:Ljava/util/Map;

    iget-object v9, v2, Lcom/sumsub/sns/internal/features/domain/n;->b:Ljava/util/Map;

    iget-object v11, v2, Lcom/sumsub/sns/internal/features/domain/n;->d:Ljava/util/Map;

    iget-object v13, v2, Lcom/sumsub/sns/internal/features/domain/n;->f:Lcom/sumsub/sns/internal/features/domain/m;

    .line 63
    new-instance v7, Lcom/sumsub/sns/internal/features/domain/n;

    invoke-direct/range {v7 .. v13}, Lcom/sumsub/sns/internal/features/domain/n;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/m;)V

    goto :goto_6

    :cond_a
    :goto_5
    move-object v7, v6

    .line 64
    :goto_6
    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_9

    :catchall_1
    move-exception v0

    :goto_7
    move-object v2, v4

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object/from16 v4, p1

    goto :goto_7

    :goto_8
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 65
    :goto_9
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_a

    :cond_b
    move-object v6, v0

    :goto_a
    check-cast v6, Lcom/sumsub/sns/internal/features/domain/n;

    if-nez v6, :cond_c

    goto :goto_b

    :cond_c
    move-object v2, v6

    :goto_b
    return-object v2
.end method

.method public final a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const/4 v2, 0x1

    const/4 v3, 0x0

    instance-of v4, v0, Lcom/sumsub/sns/internal/features/domain/d;

    if-eqz v4, :cond_0

    move-object v4, v0

    check-cast v4, Lcom/sumsub/sns/internal/features/domain/d;

    iget v5, v4, Lcom/sumsub/sns/internal/features/domain/d;->j:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/sumsub/sns/internal/features/domain/d;->j:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/sumsub/sns/internal/features/domain/d;

    invoke-direct {v4, v1, v0}, Lcom/sumsub/sns/internal/features/domain/d;-><init>(Lcom/sumsub/sns/internal/features/domain/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v0, v4, Lcom/sumsub/sns/internal/features/domain/d;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 1
    iget v6, v4, Lcom/sumsub/sns/internal/features/domain/d;->j:I

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v6, :cond_4

    if-eq v6, v2, :cond_3

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    iget-object v5, v4, Lcom/sumsub/sns/internal/features/domain/d;->g:Ljava/lang/String;

    iget-object v6, v4, Lcom/sumsub/sns/internal/features/domain/d;->f:Ljava/util/Map;

    iget-object v7, v4, Lcom/sumsub/sns/internal/features/domain/d;->e:Ljava/util/Map;

    iget-object v8, v4, Lcom/sumsub/sns/internal/features/domain/d;->d:Ljava/util/Map;

    iget-object v10, v4, Lcom/sumsub/sns/internal/features/domain/d;->c:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object v4, v4, Lcom/sumsub/sns/internal/features/domain/d;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v14, v7

    move-object v11, v8

    :goto_1
    move-object v13, v6

    goto/16 :goto_7

    :catch_0
    move-exception v0

    goto/16 :goto_12

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v6, v4, Lcom/sumsub/sns/internal/features/domain/d;->a:Z

    iget-object v8, v4, Lcom/sumsub/sns/internal/features/domain/d;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :cond_3
    iget-boolean v6, v4, Lcom/sumsub/sns/internal/features/domain/d;->a:Z

    :try_start_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :cond_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    :try_start_3
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/domain/e;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    move/from16 v6, p1

    iput-boolean v6, v4, Lcom/sumsub/sns/internal/features/domain/d;->a:Z

    iput v2, v4, Lcom/sumsub/sns/internal/features/domain/d;->j:I

    .line 3
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v0, v3, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_5

    goto :goto_6

    .line 4
    :cond_5
    :goto_2
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 5
    iget-object v10, v1, Lcom/sumsub/sns/internal/features/domain/e;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object v0, v4, Lcom/sumsub/sns/internal/features/domain/d;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-boolean v6, v4, Lcom/sumsub/sns/internal/features/domain/d;->a:Z

    iput v8, v4, Lcom/sumsub/sns/internal/features/domain/d;->j:I

    .line 6
    check-cast v10, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v10, v3, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->c(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v5, :cond_6

    goto :goto_6

    :cond_6
    move-object/from16 v21, v8

    move-object v8, v0

    move-object/from16 v0, v21

    .line 7
    :goto_3
    move-object v10, v0

    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 8
    invoke-static {v10}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_7

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    .line 9
    :cond_7
    invoke-static {v0, v8}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/common/p;)Ljava/util/Map;

    move-result-object v11

    if-nez v6, :cond_8

    move-object v6, v0

    goto :goto_4

    :cond_8
    move-object v6, v11

    .line 10
    :goto_4
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/common/p;->f()Lcom/sumsub/sns/internal/features/data/model/common/j;

    move-result-object v12

    if-eqz v12, :cond_9

    .line 11
    iget-object v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/j;->a:Ljava/lang/String;

    if-eqz v12, :cond_9

    .line 12
    invoke-interface {v6, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    goto :goto_5

    :cond_9
    move-object v12, v9

    .line 13
    :goto_5
    iget-object v13, v1, Lcom/sumsub/sns/internal/features/domain/e;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    iput-object v8, v4, Lcom/sumsub/sns/internal/features/domain/d;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v10, v4, Lcom/sumsub/sns/internal/features/domain/d;->c:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v0, v4, Lcom/sumsub/sns/internal/features/domain/d;->d:Ljava/util/Map;

    iput-object v11, v4, Lcom/sumsub/sns/internal/features/domain/d;->e:Ljava/util/Map;

    iput-object v6, v4, Lcom/sumsub/sns/internal/features/domain/d;->f:Ljava/util/Map;

    iput-object v12, v4, Lcom/sumsub/sns/internal/features/domain/d;->g:Ljava/lang/String;

    iput v7, v4, Lcom/sumsub/sns/internal/features/domain/d;->j:I

    check-cast v13, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    invoke-virtual {v13, v4}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_a

    :goto_6
    return-object v5

    :cond_a
    move-object v14, v11

    move-object v5, v12

    move-object v11, v0

    move-object v0, v4

    move-object v4, v8

    goto/16 :goto_1

    .line 14
    :goto_7
    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_16

    .line 15
    const-string v15, "geoIpCountry"

    const/16 v6, 0x2f

    int-to-char v6, v6

    .line 16
    new-array v7, v2, [C

    aput-char v6, v7, v3

    const/16 v19, 0x6

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v7

    invoke-static/range {v15 .. v20}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 17
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object v0, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 18
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-static {v3, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    move-object v2, v0

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 20
    iget-object v3, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/util/Map;

    if-eqz v3, :cond_b

    check-cast v2, Ljava/util/Map;

    goto :goto_9

    :cond_b
    move-object v2, v9

    :goto_9
    if-eqz v2, :cond_13

    .line 21
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 22
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 23
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    instance-of v15, v12, Ljava/lang/String;

    if-nez v15, :cond_d

    move-object v12, v9

    :cond_d
    check-cast v12, Ljava/lang/String;

    if-nez v12, :cond_e

    goto :goto_b

    .line 24
    :cond_e
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_f

    move-object v8, v9

    :cond_f
    if-nez v8, :cond_10

    :goto_b
    move-object v8, v9

    goto :goto_c

    .line 25
    :cond_10
    invoke-static {v12, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    :goto_c
    if-eqz v8, :cond_c

    .line 26
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 27
    :cond_11
    invoke-static {v3}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_12

    goto :goto_d

    .line 28
    :cond_12
    iput-object v2, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_8

    :cond_13
    :goto_d
    move-object v0, v9

    goto :goto_e

    .line 29
    :cond_14
    iget-object v0, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    if-nez v2, :cond_15

    move-object v0, v9

    :cond_15
    check-cast v0, Ljava/lang/String;

    :goto_e
    if-eqz v0, :cond_16

    .line 30
    invoke-interface {v13, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_f

    :cond_16
    move-object v0, v9

    :goto_f
    if-nez v5, :cond_17

    move-object v15, v0

    goto :goto_10

    :cond_17
    move-object v15, v5

    .line 31
    :goto_10
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, v10

    .line 32
    new-instance v10, Lcom/sumsub/sns/internal/features/domain/n;

    .line 33
    invoke-static {v2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->i(Lcom/sumsub/sns/internal/features/data/model/common/h;)Ljava/util/LinkedHashMap;

    move-result-object v2

    if-nez v2, :cond_18

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    :cond_18
    move-object v12, v2

    .line 34
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/m;

    .line 35
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/p;->j()Lcom/sumsub/sns/internal/features/data/model/common/l;

    move-result-object v3

    if-eqz v3, :cond_19

    .line 36
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/l;->a:Lcom/sumsub/sns/internal/features/data/model/common/j;

    if-eqz v3, :cond_19

    .line 37
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/j;->a:Ljava/lang/String;

    if-eqz v3, :cond_19

    .line 38
    invoke-interface {v13, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_19

    goto :goto_11

    :cond_19
    move-object v3, v9

    .line 39
    :goto_11
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/p;->j()Lcom/sumsub/sns/internal/features/data/model/common/l;

    move-result-object v4

    if-eqz v4, :cond_1a

    .line 40
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/l;->b:Lcom/sumsub/sns/internal/features/data/model/common/j;

    if-eqz v4, :cond_1a

    .line 41
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/j;->a:Ljava/lang/String;

    if-eqz v4, :cond_1a

    .line 42
    invoke-interface {v13, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1a

    move-object v9, v4

    .line 43
    :cond_1a
    invoke-direct {v2, v3, v9, v0}, Lcom/sumsub/sns/internal/features/domain/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v16, v2

    .line 44
    invoke-direct/range {v10 .. v16}, Lcom/sumsub/sns/internal/features/domain/n;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/m;)V

    .line 45
    invoke-static {v10}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-object v0

    .line 46
    :goto_12
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
