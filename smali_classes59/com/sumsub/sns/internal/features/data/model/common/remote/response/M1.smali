.class public abstract Lcom/sumsub/sns/internal/features/data/model/common/remote/response/M1;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/j;Lcom/sumsub/sns/internal/features/data/model/common/j;)Lcom/sumsub/sns/internal/features/data/model/common/j;
    .locals 19

    move-object/from16 v0, p0

    if-nez p1, :cond_0

    .line 103
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/j;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 104
    invoke-direct/range {v1 .. v16}, Lcom/sumsub/sns/internal/features/data/model/common/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    .line 105
    :goto_0
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->a:Ljava/lang/String;

    if-nez v2, :cond_1

    if-eqz v0, :cond_2

    .line 106
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/j;->a:Ljava/lang/String;

    :cond_1
    :goto_1
    move-object v4, v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    goto :goto_1

    .line 107
    :goto_2
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->b:Ljava/lang/String;

    iget-object v6, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->c:Ljava/lang/String;

    iget-object v7, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->d:Ljava/lang/String;

    iget-object v8, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->e:Ljava/lang/String;

    iget-object v9, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->f:Ljava/lang/String;

    iget-object v10, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->g:Ljava/lang/String;

    iget-object v11, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->h:Ljava/lang/String;

    iget-object v12, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->i:Ljava/lang/String;

    iget-object v13, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->j:Ljava/lang/String;

    iget-object v14, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->k:Ljava/lang/String;

    iget-object v15, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->l:Ljava/lang/String;

    iget-object v0, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->m:Ljava/util/List;

    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->n:Ljava/lang/String;

    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/j;->o:Ljava/lang/String;

    .line 108
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/j;

    move-object/from16 v16, v0

    move-object/from16 v18, v1

    move-object/from16 v17, v2

    invoke-direct/range {v3 .. v18}, Lcom/sumsub/sns/internal/features/data/model/common/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;)Lcom/sumsub/sns/internal/features/data/model/common/j;
    .locals 20

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->a:Ljava/lang/String;

    .line 2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->n:Ljava/lang/String;

    .line 3
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->b:Ljava/lang/String;

    .line 4
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->c:Ljava/lang/String;

    .line 5
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->d:Ljava/lang/String;

    .line 6
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->e:Ljava/lang/String;

    .line 7
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->f:Ljava/lang/String;

    .line 8
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->g:Ljava/lang/String;

    .line 9
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->h:Ljava/lang/String;

    .line 10
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->i:Ljava/lang/String;

    .line 11
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->j:Ljava/lang/String;

    .line 12
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->k:Ljava/lang/String;

    .line 13
    iget-object v13, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->l:Ljava/util/List;

    if-eqz v13, :cond_5

    .line 14
    new-instance v15, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v13, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v15, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 16
    check-cast v14, Ljava/util/Map;

    move-object/from16 v16, v1

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    invoke-interface {v14}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_3

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/util/Map$Entry;

    .line 19
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v2

    move-object/from16 v2, v18

    check-cast v2, Ljava/lang/String;

    move-object/from16 v18, v3

    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v4

    .line 20
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_0

    check-cast v3, Ljava/lang/String;

    goto :goto_2

    :cond_0
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_1

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    goto :goto_3

    :cond_1
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_2

    .line 21
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    move-object/from16 v4, v17

    move-object/from16 v3, v18

    move-object/from16 v2, v19

    goto :goto_1

    :cond_3
    move-object/from16 v19, v2

    move-object/from16 v18, v3

    move-object/from16 v17, v4

    .line 22
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    .line 23
    invoke-interface {v15, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v16

    goto :goto_0

    :cond_4
    move-object v13, v15

    :goto_4
    move-object/from16 v16, v1

    move-object/from16 v19, v2

    move-object/from16 v18, v3

    move-object/from16 v17, v4

    goto :goto_5

    :cond_5
    const/4 v13, 0x0

    goto :goto_4

    .line 24
    :goto_5
    iget-object v14, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->m:Ljava/lang/String;

    .line 25
    iget-object v15, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/L0;->o:Ljava/lang/String;

    .line 26
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/j;

    move-object/from16 v1, v16

    move-object/from16 v4, v17

    move-object/from16 v3, v18

    move-object/from16 v2, v19

    invoke-direct/range {v0 .. v15}, Lcom/sumsub/sns/internal/features/data/model/common/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/K1;)Lcom/sumsub/sns/internal/features/data/model/common/n3;
    .locals 6

    .line 93
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/n3;

    .line 94
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/K1;->a:Ljava/lang/String;

    .line 95
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/K1;->b:Ljava/lang/String;

    .line 96
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/K1;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    if-nez v3, :cond_0

    .line 97
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;->Unknown:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    .line 98
    :cond_0
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/K1;->d:Ljava/util/List;

    if-nez v4, :cond_1

    .line 99
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 100
    :cond_1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/K1;->e:Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;

    if-nez p0, :cond_2

    .line 101
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;->Unknown:Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;

    :cond_2
    move-object v5, p0

    .line 102
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/data/model/common/n3;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s1;)Lcom/sumsub/sns/internal/features/data/model/common/n;
    .locals 27

    move-object/from16 v0, p0

    .line 27
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s1;->a:Ljava/util/List;

    if-eqz v1, :cond_c

    .line 28
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 30
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;

    .line 31
    sget-object v4, Lcom/sumsub/sns/internal/features/data/model/common/X;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/V;

    .line 32
    iget-object v5, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->a:Ljava/lang/String;

    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lcom/sumsub/sns/internal/features/data/model/common/V;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v7

    .line 34
    iget-object v4, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->b:Ljava/util/List;

    if-nez v4, :cond_0

    .line 35
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    :cond_0
    move-object v8, v4

    .line 36
    iget-object v4, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->c:Ljava/util/List;

    if-nez v4, :cond_1

    .line 37
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    :cond_1
    move-object v9, v4

    .line 38
    iget-object v10, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->d:Ljava/lang/String;

    .line 39
    iget-object v11, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->e:Ljava/util/List;

    .line 40
    iget-object v12, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->f:Ljava/util/List;

    .line 41
    iget-object v13, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->g:Ljava/lang/String;

    .line 42
    iget-object v14, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->h:Ljava/lang/String;

    .line 43
    iget-object v15, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->i:Ljava/lang/String;

    .line 44
    iget-object v4, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->j:Ljava/lang/String;

    .line 45
    iget-object v5, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->k:Ljava/lang/Boolean;

    .line 46
    iget-object v6, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->l:Ljava/lang/String;

    move-object/from16 v24, v1

    .line 47
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->m:Ljava/lang/Boolean;

    move-object/from16 v18, v1

    .line 48
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->n:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/V0;

    const/16 v16, 0x0

    if-eqz v1, :cond_2

    .line 49
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/V0;->a:Ljava/lang/String;

    move-object/from16 v20, v1

    goto :goto_1

    :cond_2
    move-object/from16 v20, v16

    .line 50
    :goto_1
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->o:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Y0;

    if-eqz v1, :cond_3

    .line 51
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Y0;->a:Ljava/lang/Boolean;

    move-object/from16 v21, v1

    goto :goto_2

    :cond_3
    move-object/from16 v21, v16

    .line 52
    :goto_2
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->p:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/S0;

    if-eqz v1, :cond_4

    .line 53
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/S0;->a:Ljava/lang/Boolean;

    move-object/from16 v22, v1

    goto :goto_3

    :cond_4
    move-object/from16 v22, v16

    .line 54
    :goto_3
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/r1;->q:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/q1;

    if-eqz v1, :cond_a

    .line 55
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/q1;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/p1;

    if-eqz v1, :cond_9

    .line 56
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/p1;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/f1;

    if-eqz v3, :cond_5

    move-object/from16 v17, v4

    .line 57
    new-instance v4, Lcom/sumsub/sns/internal/features/data/model/common/G2;

    move-object/from16 v19, v5

    .line 58
    iget-object v5, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/f1;->a:Ljava/lang/Boolean;

    move-object/from16 v23, v6

    .line 59
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    .line 60
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/L2;

    .line 61
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/f1;->b:Ljava/lang/String;

    .line 62
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lcom/sumsub/sns/internal/features/data/model/common/L2;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;

    move-result-object v3

    .line 63
    invoke-direct {v4, v5, v3}, Lcom/sumsub/sns/internal/features/data/model/common/G2;-><init>(ZLcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;)V

    goto :goto_4

    :cond_5
    move-object/from16 v17, v4

    move-object/from16 v19, v5

    move-object/from16 v23, v6

    move-object/from16 v4, v16

    .line 64
    :goto_4
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/p1;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/c1;

    if-eqz v3, :cond_6

    .line 65
    new-instance v5, Lcom/sumsub/sns/internal/features/data/model/common/F2;

    .line 66
    iget-object v6, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/c1;->a:Ljava/lang/Boolean;

    move-object/from16 v25, v7

    .line 67
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    move-object/from16 v26, v8

    .line 68
    iget-object v8, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/c1;->b:Ljava/lang/Boolean;

    .line 69
    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    .line 70
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/c1;->c:Ljava/lang/Boolean;

    .line 71
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 72
    invoke-direct {v5, v6, v8, v3}, Lcom/sumsub/sns/internal/features/data/model/common/F2;-><init>(ZZZ)V

    goto :goto_5

    :cond_6
    move-object/from16 v25, v7

    move-object/from16 v26, v8

    move-object/from16 v5, v16

    .line 73
    :goto_5
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/p1;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m1;

    if-eqz v3, :cond_7

    .line 74
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/common/I2;

    .line 75
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/m1;->a:Ljava/lang/Boolean;

    .line 76
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    invoke-direct {v6, v3}, Lcom/sumsub/sns/internal/features/data/model/common/I2;-><init>(Z)V

    goto :goto_6

    :cond_7
    move-object/from16 v6, v16

    .line 77
    :goto_6
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/p1;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j1;

    if-eqz v1, :cond_8

    .line 78
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/H2;

    .line 79
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/j1;->a:Ljava/lang/Boolean;

    .line 80
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/data/model/common/H2;-><init>(Z)V

    goto :goto_7

    :cond_8
    move-object/from16 v3, v16

    .line 81
    :goto_7
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/J2;

    invoke-direct {v1, v4, v5, v6, v3}, Lcom/sumsub/sns/internal/features/data/model/common/J2;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/G2;Lcom/sumsub/sns/internal/features/data/model/common/F2;Lcom/sumsub/sns/internal/features/data/model/common/I2;Lcom/sumsub/sns/internal/features/data/model/common/H2;)V

    goto :goto_8

    :cond_9
    move-object/from16 v17, v4

    move-object/from16 v19, v5

    move-object/from16 v23, v6

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    move-object/from16 v1, v16

    .line 82
    :goto_8
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/K2;

    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/data/model/common/K2;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/J2;)V

    move-object/from16 v16, v3

    goto :goto_9

    :cond_a
    move-object/from16 v17, v4

    move-object/from16 v19, v5

    move-object/from16 v23, v6

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    .line 83
    :goto_9
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-object/from16 v7, v23

    move-object/from16 v23, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v7

    move-object/from16 v7, v25

    move-object/from16 v8, v26

    invoke-direct/range {v6 .. v23}, Lcom/sumsub/sns/internal/features/data/model/common/m;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/K2;)V

    .line 84
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v24

    goto/16 :goto_0

    :cond_b
    :goto_a
    move-object v4, v2

    goto :goto_b

    .line 85
    :cond_c
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_a

    .line 86
    :goto_b
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s1;->b:Ljava/lang/Boolean;

    if-eqz v1, :cond_d

    .line 87
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_c
    move v5, v1

    goto :goto_d

    :cond_d
    const/4 v1, 0x0

    goto :goto_c

    .line 88
    :goto_d
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s1;->c:Ljava/util/List;

    .line 89
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s1;->d:Ljava/util/List;

    .line 90
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s1;->e:Ljava/util/List;

    .line 91
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/s1;->f:Ljava/util/List;

    .line 92
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/n;

    invoke-direct/range {v3 .. v9}, Lcom/sumsub/sns/internal/features/data/model/common/n;-><init>(Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v3
.end method
