.class public abstract Lcom/sumsub/sns/internal/features/data/model/common/remote/U0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lcom/sumsub/sns/core/data/model/FlowType;)Lcom/sumsub/sns/core/data/model/FlowType;
    .locals 3

    const/4 v0, -0x1

    if-nez p0, :cond_0

    move v1, v0

    goto :goto_0

    .line 272
    :cond_0
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/T0;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    :goto_0
    if-eq v1, v0, :cond_2

    const/4 v0, 0x1

    if-eq v1, v0, :cond_1

    return-object p0

    .line 273
    :cond_1
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSInvalidParametersException;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/data/model/FlowType;->getValue()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported flow type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/data/model/SNSInvalidParametersException;-><init>(Ljava/util/List;)V

    throw v0

    .line 274
    :cond_2
    sget-object p0, Lcom/sumsub/sns/core/data/model/FlowType;->Standalone:Lcom/sumsub/sns/core/data/model/FlowType;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;)Lcom/sumsub/sns/internal/features/data/model/common/h;
    .locals 41

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->b:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 2
    const-string v1, "<unknown>"

    :cond_0
    move-object v3, v1

    .line 3
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->d:Lcom/sumsub/sns/core/data/model/FlowType;

    .line 4
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/U0;->a(Lcom/sumsub/sns/core/data/model/FlowType;)Lcom/sumsub/sns/core/data/model/FlowType;

    move-result-object v4

    .line 5
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->e:Ljava/lang/String;

    .line 6
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->j:Ljava/util/Map;

    if-eqz v1, :cond_e

    .line 7
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 9
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_2

    const/4 v9, 0x0

    :cond_2
    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_3

    goto/16 :goto_7

    .line 10
    :cond_3
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    instance-of v10, v8, Ljava/util/Map;

    if-eqz v10, :cond_4

    check-cast v8, Ljava/util/Map;

    goto :goto_1

    :cond_4
    const/4 v8, 0x0

    :goto_1
    if-eqz v8, :cond_c

    .line 11
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v10

    if-eqz v10, :cond_c

    .line 12
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 13
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_5

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 14
    :cond_6
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 15
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v13, 0x0

    :cond_7
    :goto_3
    if-ge v13, v12, :cond_a

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v13, v13, 0x1

    .line 16
    invoke-interface {v8, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    if-eqz v15, :cond_8

    goto :goto_4

    :cond_8
    const/4 v15, 0x0

    :goto_4
    if-eqz v15, :cond_9

    .line 17
    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    goto :goto_5

    :cond_9
    const/4 v14, 0x0

    :goto_5
    if-eqz v14, :cond_7

    .line 18
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 19
    :cond_a
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_6

    :cond_b
    const/4 v10, 0x0

    :goto_6
    if-eqz v10, :cond_c

    .line 20
    invoke-static {v10}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v8

    if-eqz v8, :cond_c

    .line 21
    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    goto :goto_8

    :cond_c
    :goto_7
    const/4 v8, 0x0

    :goto_8
    if-eqz v8, :cond_1

    .line 22
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 23
    :cond_d
    invoke-static {v7}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    goto :goto_9

    :cond_e
    const/4 v1, 0x0

    .line 24
    :goto_9
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->k:Ljava/util/Map;

    .line 25
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->a:Ljava/util/Map;

    .line 26
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->l:Ljava/util/Map;

    .line 27
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->n:Ljava/util/Map;

    .line 28
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->m:Ljava/util/Map;

    if-eqz v11, :cond_1b

    .line 29
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 30
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    .line 31
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 32
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    instance-of v15, v13, Ljava/util/Map;

    if-eqz v15, :cond_f

    check-cast v13, Ljava/util/Map;

    goto :goto_b

    :cond_f
    const/4 v13, 0x0

    :goto_b
    if-eqz v13, :cond_17

    .line 33
    const-string/jumbo v15, "regex"

    invoke-interface {v13, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    instance-of v2, v15, Ljava/lang/String;

    if-eqz v2, :cond_10

    check-cast v15, Ljava/lang/String;

    goto :goto_c

    :cond_10
    const/4 v15, 0x0

    .line 34
    :goto_c
    const-string/jumbo v2, "placeholders"

    invoke-interface {v13, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v6, v2, Ljava/util/List;

    if-eqz v6, :cond_11

    check-cast v2, Ljava/util/List;

    goto :goto_d

    :cond_11
    const/4 v2, 0x0

    :goto_d
    if-eqz v2, :cond_14

    .line 35
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v18, v1

    instance-of v1, v13, Ljava/lang/String;

    if-eqz v1, :cond_12

    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    move-object/from16 v1, v18

    goto :goto_e

    :cond_13
    move-object/from16 v18, v1

    goto :goto_10

    :cond_14
    move-object/from16 v18, v1

    .line 37
    const-string/jumbo v1, "placeholder"

    invoke-interface {v13, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_15

    check-cast v1, Ljava/lang/String;

    goto :goto_f

    :cond_15
    const/4 v1, 0x0

    :goto_f
    if-eqz v1, :cond_16

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    goto :goto_10

    :cond_16
    const/4 v6, 0x0

    .line 38
    :goto_10
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/T3;

    invoke-direct {v1, v15, v6}, Lcom/sumsub/sns/internal/features/data/model/common/remote/T3;-><init>(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_11

    :cond_17
    move-object/from16 v18, v1

    const/4 v1, 0x0

    :goto_11
    if-eqz v1, :cond_18

    .line 39
    invoke-static {v14, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_12

    :cond_18
    const/4 v1, 0x0

    :goto_12
    if-eqz v1, :cond_19

    .line 40
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    move-object/from16 v1, v18

    goto/16 :goto_a

    :cond_1a
    move-object/from16 v18, v1

    .line 41
    invoke-static {v12}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    move-object v11, v1

    goto :goto_13

    :cond_1b
    move-object/from16 v18, v1

    const/4 v11, 0x0

    .line 42
    :goto_13
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->j:Ljava/util/Map;

    if-eqz v1, :cond_39

    .line 43
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 44
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_29

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 45
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Ljava/lang/String;

    if-nez v13, :cond_1c

    const/4 v12, 0x0

    :cond_1c
    check-cast v12, Ljava/lang/String;

    if-nez v12, :cond_1e

    :cond_1d
    move-object/from16 v19, v1

    move-object/from16 v20, v3

    goto/16 :goto_1b

    .line 46
    :cond_1e
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    instance-of v13, v6, Ljava/util/Map;

    if-eqz v13, :cond_1f

    check-cast v6, Ljava/util/Map;

    goto :goto_15

    :cond_1f
    const/4 v6, 0x0

    :goto_15
    if-eqz v6, :cond_1d

    .line 47
    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v13

    if-eqz v13, :cond_1d

    .line 48
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 49
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_20
    :goto_16
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_21

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    if-eqz v15, :cond_20

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    .line 50
    :cond_21
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 51
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v15

    move-object/from16 v19, v1

    const/4 v1, 0x0

    :goto_17
    if-ge v1, v15, :cond_25

    move-object/from16 v20, v3

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v1, v1, 0x1

    .line 52
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v21

    if-eqz v21, :cond_22

    move-object/from16 v40, v21

    move/from16 v21, v1

    move-object/from16 v1, v40

    goto :goto_18

    :cond_22
    move/from16 v21, v1

    const/4 v1, 0x0

    :goto_18
    if-eqz v1, :cond_23

    .line 53
    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_19

    :cond_23
    const/4 v1, 0x0

    :goto_19
    if-eqz v1, :cond_24

    .line 54
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_24
    move-object/from16 v3, v20

    move/from16 v1, v21

    goto :goto_17

    :cond_25
    move-object/from16 v20, v3

    .line 55
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_26

    goto :goto_1a

    :cond_26
    const/4 v13, 0x0

    :goto_1a
    if-eqz v13, :cond_27

    .line 56
    invoke-static {v13}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_27

    .line 57
    invoke-static {v12, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_1c

    :cond_27
    :goto_1b
    const/4 v1, 0x0

    :goto_1c
    if-eqz v1, :cond_28

    .line 58
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_28
    move-object/from16 v1, v19

    move-object/from16 v3, v20

    goto/16 :goto_14

    :cond_29
    move-object/from16 v20, v3

    .line 59
    invoke-static {v2}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_38

    .line 60
    const-string v2, "countryStates"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_38

    .line 61
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 62
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_37

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 63
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    instance-of v12, v6, Ljava/lang/String;

    if-nez v12, :cond_2a

    const/4 v6, 0x0

    :cond_2a
    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_2c

    :cond_2b
    move-object/from16 v19, v1

    move-object/from16 v21, v4

    goto/16 :goto_24

    .line 64
    :cond_2c
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v12, v3, Ljava/util/Map;

    if-eqz v12, :cond_2d

    check-cast v3, Ljava/util/Map;

    goto :goto_1e

    :cond_2d
    const/4 v3, 0x0

    :goto_1e
    if-eqz v3, :cond_2b

    .line 65
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v12

    if-eqz v12, :cond_2b

    .line 66
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 67
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_2e
    :goto_1f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/lang/String;

    if-eqz v15, :cond_2e

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    .line 68
    :cond_2f
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 69
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x0

    :goto_20
    if-ge v15, v14, :cond_33

    move-object/from16 v19, v1

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v21, v4

    .line 70
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v22, v3

    .line 71
    instance-of v3, v4, Ljava/lang/String;

    if-eqz v3, :cond_30

    goto :goto_21

    :cond_30
    const/4 v4, 0x0

    :goto_21
    if-eqz v4, :cond_31

    .line 72
    check-cast v4, Ljava/lang/String;

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_22

    :cond_31
    const/4 v1, 0x0

    :goto_22
    if-eqz v1, :cond_32

    .line 73
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_32
    move-object/from16 v1, v19

    move-object/from16 v4, v21

    move-object/from16 v3, v22

    goto :goto_20

    :cond_33
    move-object/from16 v19, v1

    move-object/from16 v21, v4

    .line 74
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_34

    goto :goto_23

    :cond_34
    const/4 v12, 0x0

    :goto_23
    if-eqz v12, :cond_35

    .line 75
    invoke-static {v12}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_35

    .line 76
    invoke-static {v6, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_25

    :cond_35
    :goto_24
    const/4 v1, 0x0

    :goto_25
    if-eqz v1, :cond_36

    .line 77
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_36
    move-object/from16 v1, v19

    move-object/from16 v4, v21

    goto/16 :goto_1d

    :cond_37
    move-object/from16 v21, v4

    .line 78
    invoke-static {v2}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    move-object v12, v1

    goto :goto_28

    :cond_38
    :goto_26
    move-object/from16 v21, v4

    goto :goto_27

    :cond_39
    move-object/from16 v20, v3

    goto :goto_26

    :goto_27
    const/4 v12, 0x0

    .line 79
    :goto_28
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->o:Lcom/sumsub/sns/internal/features/data/model/common/remote/N;

    if-eqz v1, :cond_46

    .line 80
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 81
    sget-object v3, Lcom/sumsub/sns/internal/ff/a;->y:Lcom/sumsub/sns/internal/ff/core/a;

    .line 82
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v4

    if-eqz v4, :cond_3a

    .line 83
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/ff/core/a;->b()Lcom/sumsub/sns/internal/ff/core/c;

    move-result-object v3

    .line 84
    iget-object v3, v3, Lcom/sumsub/sns/internal/ff/core/c;->b:Ljava/lang/String;

    if-eqz v3, :cond_3a

    .line 85
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto :goto_29

    :cond_3a
    const/4 v4, 0x0

    .line 86
    :goto_29
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/N;->a:Ljava/util/Map;

    if-eqz v1, :cond_45

    .line 87
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_45

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    if-eqz v1, :cond_45

    .line 88
    :goto_2a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_45

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 89
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 90
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    if-eqz v4, :cond_3b

    .line 91
    invoke-virtual {v4, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v14

    goto :goto_2b

    :cond_3b
    const/4 v14, 0x0

    .line 92
    :goto_2b
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 93
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_44

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/P0;

    if-eqz v14, :cond_3c

    move-object/from16 v19, v1

    .line 94
    iget-object v1, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/P0;->a:Ljava/lang/String;

    .line 95
    invoke-virtual {v14, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_2d

    :cond_3c
    move-object/from16 v19, v1

    const/4 v1, 0x0

    :goto_2d
    if-eqz v1, :cond_43

    move-object/from16 v22, v3

    .line 96
    iget-object v3, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/P0;->d:Ljava/util/List;

    if-eqz v3, :cond_42

    move-object/from16 v23, v4

    .line 97
    new-instance v4, Ljava/util/ArrayList;

    move-object/from16 v24, v5

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_41

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 99
    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/y;

    move-object/from16 v25, v3

    .line 100
    iget-object v3, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    if-eqz v3, :cond_3d

    .line 101
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v3

    goto :goto_2f

    :cond_3d
    const/4 v3, 0x0

    :goto_2f
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-eqz v3, :cond_3f

    move-object/from16 v26, v1

    .line 102
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v27, v7

    .line 103
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v7

    move-object/from16 v28, v8

    const/4 v8, 0x0

    :goto_30
    if-ge v8, v7, :cond_3e

    move/from16 v29, v7

    .line 104
    invoke-virtual {v3, v8}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    move/from16 v7, v29

    goto :goto_30

    :cond_3e
    move-object/from16 v35, v1

    goto :goto_31

    :cond_3f
    move-object/from16 v26, v1

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    const/16 v35, 0x0

    :goto_31
    if-eqz v35, :cond_40

    .line 105
    iget-object v1, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    iget-boolean v3, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    iget-object v7, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    iget-object v8, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->g:Lcom/sumsub/sns/internal/features/data/model/common/M0;

    move-object/from16 v31, v1

    iget-object v1, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    move-object/from16 v37, v1

    iget-object v1, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->i:Ljava/lang/Boolean;

    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    .line 106
    new-instance v30, Lcom/sumsub/sns/internal/features/data/model/common/y;

    const/16 v34, 0x0

    move-object/from16 v38, v1

    move/from16 v32, v3

    move-object/from16 v39, v5

    move-object/from16 v33, v7

    move-object/from16 v36, v8

    invoke-direct/range {v30 .. v39}, Lcom/sumsub/sns/internal/features/data/model/common/y;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/d2;ZLcom/sumsub/sns/internal/features/data/model/common/FieldType;Ljava/lang/String;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/M0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    move-object/from16 v5, v30

    .line 107
    :cond_40
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, v25

    move-object/from16 v1, v26

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    goto :goto_2e

    :cond_41
    move-object/from16 v27, v7

    move-object/from16 v28, v8

    :goto_32
    move-object/from16 v33, v4

    goto :goto_33

    :cond_42
    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    const/16 v33, 0x0

    goto :goto_33

    :cond_43
    move-object/from16 v22, v3

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    .line 108
    iget-object v4, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/P0;->d:Ljava/util/List;

    goto :goto_32

    .line 109
    :goto_33
    new-instance v29, Lcom/sumsub/sns/internal/features/data/model/common/F;

    .line 110
    iget-object v1, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/P0;->a:Ljava/lang/String;

    .line 111
    iget-object v3, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/P0;->b:Ljava/lang/String;

    .line 112
    iget-object v4, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/P0;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationType;

    .line 113
    iget-object v5, v15, Lcom/sumsub/sns/internal/features/data/model/common/remote/P0;->e:Ljava/lang/String;

    move-object/from16 v30, v1

    move-object/from16 v31, v3

    move-object/from16 v32, v4

    move-object/from16 v34, v5

    .line 114
    invoke-direct/range {v29 .. v34}, Lcom/sumsub/sns/internal/features/data/model/common/F;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/ConfirmationType;Ljava/util/List;Ljava/lang/String;)V

    move-object/from16 v1, v29

    .line 115
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v19

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    move-object/from16 v5, v24

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    goto/16 :goto_2c

    :cond_44
    move-object/from16 v19, v1

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    .line 116
    invoke-interface {v2, v13, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2a

    :cond_45
    move-object/from16 v24, v5

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    move-object v13, v2

    goto :goto_34

    :cond_46
    move-object/from16 v24, v5

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    const/4 v13, 0x0

    .line 117
    :goto_34
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->o:Lcom/sumsub/sns/internal/features/data/model/common/remote/N;

    if-eqz v1, :cond_47

    .line 118
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/N;->b:Ljava/lang/Boolean;

    move-object v14, v1

    goto :goto_35

    :cond_47
    const/4 v14, 0x0

    .line 119
    :goto_35
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->r:Lcom/sumsub/sns/internal/features/data/model/common/remote/O3;

    if-eqz v1, :cond_4b

    .line 120
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/w3;

    .line 121
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/SumsubIdType;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/x3;

    .line 122
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/O3;->a:Ljava/lang/String;

    .line 123
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/SumsubIdType;->values()[Lcom/sumsub/sns/internal/features/data/model/common/SumsubIdType;

    move-result-object v3

    array-length v5, v3

    const/4 v6, 0x0

    :goto_36
    if-ge v6, v5, :cond_49

    aget-object v7, v3, v6

    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/SumsubIdType;->getType()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_48

    goto :goto_37

    :cond_48
    add-int/lit8 v6, v6, 0x1

    goto :goto_36

    :cond_49
    const/4 v7, 0x0

    .line 125
    :goto_37
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/O3;->b:Ljava/lang/Boolean;

    if-eqz v1, :cond_4a

    .line 126
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_38

    :cond_4a
    const/4 v1, 0x1

    .line 127
    :goto_38
    invoke-direct {v2, v7, v1}, Lcom/sumsub/sns/internal/features/data/model/common/w3;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/SumsubIdType;Z)V

    move-object v15, v2

    goto :goto_39

    :cond_4b
    const/4 v15, 0x0

    .line 128
    :goto_39
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->j:Ljava/util/Map;

    if-eqz v1, :cond_68

    .line 129
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 130
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_59

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 131
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-nez v5, :cond_4c

    const/4 v4, 0x0

    :cond_4c
    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_4e

    :cond_4d
    move-object/from16 v19, v1

    goto/16 :goto_41

    .line 132
    :cond_4e
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/util/Map;

    if-eqz v5, :cond_4f

    check-cast v3, Ljava/util/Map;

    goto :goto_3b

    :cond_4f
    const/4 v3, 0x0

    :goto_3b
    if-eqz v3, :cond_4d

    .line 133
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_4d

    .line 134
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 135
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_50
    :goto_3c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_51

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_50

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3c

    .line 136
    :cond_51
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 137
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_3d
    if-ge v8, v7, :cond_55

    move-object/from16 v19, v1

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v8, v8, 0x1

    .line 138
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v22

    if-eqz v22, :cond_52

    move-object/from16 v40, v22

    move-object/from16 v22, v3

    move-object/from16 v3, v40

    goto :goto_3e

    :cond_52
    move-object/from16 v22, v3

    const/4 v3, 0x0

    :goto_3e
    if-eqz v3, :cond_53

    .line 139
    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_3f

    :cond_53
    const/4 v1, 0x0

    :goto_3f
    if-eqz v1, :cond_54

    .line 140
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_54
    move-object/from16 v1, v19

    move-object/from16 v3, v22

    goto :goto_3d

    :cond_55
    move-object/from16 v19, v1

    .line 141
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_56

    goto :goto_40

    :cond_56
    const/4 v5, 0x0

    :goto_40
    if-eqz v5, :cond_57

    .line 142
    invoke-static {v5}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_57

    .line 143
    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_42

    :cond_57
    :goto_41
    const/4 v1, 0x0

    :goto_42
    if-eqz v1, :cond_58

    .line 144
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_58
    move-object/from16 v1, v19

    goto/16 :goto_3a

    .line 145
    :cond_59
    invoke-static {v2}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_68

    .line 146
    const-string v2, "countryDependingFields"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_68

    .line 147
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 148
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_43
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_67

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 149
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-nez v5, :cond_5a

    const/4 v4, 0x0

    :cond_5a
    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_5c

    :cond_5b
    move-object/from16 v19, v1

    goto/16 :goto_4a

    .line 150
    :cond_5c
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/util/Map;

    if-eqz v5, :cond_5d

    check-cast v3, Ljava/util/Map;

    goto :goto_44

    :cond_5d
    const/4 v3, 0x0

    :goto_44
    if-eqz v3, :cond_5b

    .line 151
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_5b

    .line 152
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 153
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5e
    :goto_45
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-eqz v8, :cond_5e

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_45

    .line 154
    :cond_5f
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 155
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_46
    if-ge v8, v7, :cond_63

    move-object/from16 v19, v1

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v22, v6

    .line 156
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v23, v3

    .line 157
    instance-of v3, v6, Ljava/lang/String;

    if-eqz v3, :cond_60

    goto :goto_47

    :cond_60
    const/4 v6, 0x0

    :goto_47
    if-eqz v6, :cond_61

    .line 158
    check-cast v6, Ljava/lang/String;

    invoke-static {v1, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_48

    :cond_61
    const/4 v1, 0x0

    :goto_48
    if-eqz v1, :cond_62

    .line 159
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_62
    move-object/from16 v1, v19

    move-object/from16 v6, v22

    move-object/from16 v3, v23

    goto :goto_46

    :cond_63
    move-object/from16 v19, v1

    .line 160
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_64

    goto :goto_49

    :cond_64
    const/4 v5, 0x0

    :goto_49
    if-eqz v5, :cond_65

    .line 161
    invoke-static {v5}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_65

    .line 162
    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_4b

    :cond_65
    :goto_4a
    const/4 v1, 0x0

    :goto_4b
    if-eqz v1, :cond_66

    .line 163
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_66
    move-object/from16 v1, v19

    goto/16 :goto_43

    .line 164
    :cond_67
    invoke-static {v2}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    goto :goto_4c

    :cond_68
    const/4 v1, 0x0

    .line 165
    :goto_4c
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->j:Ljava/util/Map;

    if-eqz v2, :cond_69

    .line 166
    const-string v3, "ekyc"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_4d

    :cond_69
    const/4 v2, 0x0

    :goto_4d
    instance-of v3, v2, Ljava/util/Map;

    if-eqz v3, :cond_6a

    check-cast v2, Ljava/util/Map;

    goto :goto_4e

    :cond_6a
    const/4 v2, 0x0

    :goto_4e
    if-eqz v2, :cond_71

    .line 167
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 168
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6b
    :goto_4f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_70

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 169
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/String;

    if-nez v6, :cond_6c

    const/4 v5, 0x0

    :cond_6c
    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_6d

    goto :goto_50

    .line 170
    :cond_6d
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_6e

    const/4 v4, 0x0

    :cond_6e
    if-nez v4, :cond_6f

    :goto_50
    const/4 v4, 0x0

    goto :goto_51

    .line 171
    :cond_6f
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    :goto_51
    if-eqz v4, :cond_6b

    .line 172
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4f

    .line 173
    :cond_70
    invoke-static {v3}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_71

    .line 174
    const-string/jumbo v3, "sources"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_52

    :cond_71
    const/4 v2, 0x0

    :goto_52
    instance-of v3, v2, Ljava/util/Map;

    if-eqz v3, :cond_72

    check-cast v2, Ljava/util/Map;

    goto :goto_53

    :cond_72
    const/4 v2, 0x0

    :goto_53
    if-eqz v2, :cond_94

    .line 175
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 176
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_73
    :goto_54
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_78

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 177
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/String;

    if-nez v6, :cond_74

    const/4 v5, 0x0

    :cond_74
    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_75

    goto :goto_55

    .line 178
    :cond_75
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_76

    const/4 v4, 0x0

    :cond_76
    if-nez v4, :cond_77

    :goto_55
    const/4 v4, 0x0

    goto :goto_56

    .line 179
    :cond_77
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    :goto_56
    if-eqz v4, :cond_73

    .line 180
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_54

    .line 181
    :cond_78
    invoke-static {v3}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_94

    .line 182
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 183
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_57
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_93

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 184
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 185
    instance-of v6, v4, Ljava/util/Map;

    if-eqz v6, :cond_79

    check-cast v4, Ljava/util/Map;

    goto :goto_58

    :cond_79
    const/4 v4, 0x0

    :goto_58
    if-eqz v4, :cond_91

    .line 186
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 187
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_59
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 188
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v19, v1

    instance-of v1, v8, Ljava/lang/String;

    if-nez v1, :cond_7a

    const/4 v8, 0x0

    :cond_7a
    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_7b

    goto :goto_5a

    .line 189
    :cond_7b
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7c

    const/4 v1, 0x0

    :cond_7c
    if-nez v1, :cond_7d

    :goto_5a
    const/4 v1, 0x0

    goto :goto_5b

    .line 190
    :cond_7d
    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    :goto_5b
    if-eqz v1, :cond_7e

    .line 191
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7e
    move-object/from16 v1, v19

    goto :goto_59

    :cond_7f
    move-object/from16 v19, v1

    .line 192
    invoke-static {v6}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_90

    .line 193
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 194
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_80
    :goto_5c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_81

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 195
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    instance-of v8, v8, Ljava/lang/String;

    if-eqz v8, :cond_80

    .line 196
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v4, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5c

    .line 197
    :cond_81
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 198
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_87

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 199
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v22, v2

    instance-of v2, v8, Ljava/lang/String;

    if-nez v2, :cond_82

    const/4 v8, 0x0

    :cond_82
    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_83

    goto :goto_5e

    .line 200
    :cond_83
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v7, v2, Ljava/lang/String;

    if-nez v7, :cond_84

    const/4 v2, 0x0

    :cond_84
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_85

    :goto_5e
    const/4 v2, 0x0

    goto :goto_5f

    .line 201
    :cond_85
    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    :goto_5f
    if-eqz v2, :cond_86

    .line 202
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_86
    move-object/from16 v2, v22

    goto :goto_5d

    :cond_87
    move-object/from16 v22, v2

    .line 203
    invoke-static {v6}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    .line 204
    const-string v4, "fields"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Ljava/util/Map;

    if-eqz v4, :cond_88

    check-cast v1, Ljava/util/Map;

    goto :goto_60

    :cond_88
    const/4 v1, 0x0

    :goto_60
    if-eqz v1, :cond_8f

    .line 205
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 206
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_89
    :goto_61
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 207
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_8a

    const/4 v7, 0x0

    :cond_8a
    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_8b

    goto :goto_62

    .line 208
    :cond_8b
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    instance-of v8, v6, Ljava/lang/String;

    if-nez v8, :cond_8c

    const/4 v6, 0x0

    :cond_8c
    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_8d

    :goto_62
    const/4 v6, 0x0

    goto :goto_63

    .line 209
    :cond_8d
    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    :goto_63
    if-eqz v6, :cond_89

    .line 210
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_61

    .line 211
    :cond_8e
    invoke-static {v4}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    goto :goto_64

    :cond_8f
    const/4 v1, 0x0

    .line 212
    :goto_64
    new-instance v4, Lcom/sumsub/sns/internal/features/data/model/common/s3;

    invoke-direct {v4, v2, v1}, Lcom/sumsub/sns/internal/features/data/model/common/s3;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 213
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_67

    :cond_90
    :goto_65
    move-object/from16 v22, v2

    goto :goto_66

    :cond_91
    move-object/from16 v19, v1

    goto :goto_65

    :goto_66
    const/4 v1, 0x0

    :goto_67
    if-eqz v1, :cond_92

    .line 214
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_92
    move-object/from16 v1, v19

    move-object/from16 v2, v22

    goto/16 :goto_57

    :cond_93
    move-object/from16 v19, v1

    .line 215
    invoke-static {v3}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    goto :goto_68

    :cond_94
    move-object/from16 v19, v1

    const/4 v1, 0x0

    .line 216
    :goto_68
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->p:Ljava/lang/String;

    .line 217
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->q:Ljava/lang/String;

    .line 218
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->s:Lcom/sumsub/sns/internal/features/data/model/common/remote/r0;

    if-eqz v4, :cond_95

    .line 219
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/r0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/X;

    goto :goto_69

    :cond_95
    const/4 v4, 0x0

    .line 220
    :goto_69
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->t:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;

    .line 221
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->u:Lcom/sumsub/sns/internal/features/data/model/common/remote/i4;

    if-eqz v6, :cond_97

    .line 222
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/i4;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/g4;

    if-eqz v6, :cond_96

    .line 223
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/common/z3;

    .line 224
    iget v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/g4;->a:I

    .line 225
    iget v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/g4;->b:I

    .line 226
    invoke-direct {v7, v8, v6}, Lcom/sumsub/sns/internal/features/data/model/common/z3;-><init>(II)V

    goto :goto_6a

    :cond_96
    const/4 v7, 0x0

    .line 227
    :goto_6a
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/common/A3;

    invoke-direct {v6, v7}, Lcom/sumsub/sns/internal/features/data/model/common/A3;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/z3;)V

    move-object/from16 v22, v6

    goto :goto_6b

    :cond_97
    const/16 v22, 0x0

    .line 228
    :goto_6b
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->v:Ljava/util/Map;

    if-eqz v6, :cond_a6

    .line 229
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 230
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    move-object/from16 v23, v1

    .line 231
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v25, v2

    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_98

    const/4 v1, 0x0

    :cond_98
    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_9a

    :cond_99
    move-object/from16 v26, v3

    move-object/from16 v29, v4

    move-object/from16 v30, v5

    move-object/from16 v31, v6

    goto/16 :goto_73

    .line 232
    :cond_9a
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v8, v2, Ljava/util/Map;

    if-eqz v8, :cond_9b

    check-cast v2, Ljava/util/Map;

    goto :goto_6d

    :cond_9b
    const/4 v2, 0x0

    :goto_6d
    if-eqz v2, :cond_99

    .line 233
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v8

    if-eqz v8, :cond_99

    move-object/from16 v26, v3

    .line 234
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 235
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_6e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v29

    if-eqz v29, :cond_9d

    move-object/from16 v29, v4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_9c

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9c
    move-object/from16 v4, v29

    goto :goto_6e

    :cond_9d
    move-object/from16 v29, v4

    .line 236
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 237
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    move-object/from16 v30, v5

    const/4 v5, 0x0

    :goto_6f
    if-ge v5, v8, :cond_a1

    move-object/from16 v31, v6

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    .line 238
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v32

    if-eqz v32, :cond_9e

    move-object/from16 v40, v32

    move-object/from16 v32, v2

    move-object/from16 v2, v40

    goto :goto_70

    :cond_9e
    move-object/from16 v32, v2

    const/4 v2, 0x0

    :goto_70
    if-eqz v2, :cond_9f

    .line 239
    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    goto :goto_71

    :cond_9f
    const/4 v2, 0x0

    :goto_71
    if-eqz v2, :cond_a0

    .line 240
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a0
    move-object/from16 v6, v31

    move-object/from16 v2, v32

    goto :goto_6f

    :cond_a1
    move-object/from16 v31, v6

    .line 241
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a2

    goto :goto_72

    :cond_a2
    const/4 v4, 0x0

    :goto_72
    if-eqz v4, :cond_a3

    .line 242
    invoke-static {v4}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_a3

    .line 243
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_74

    :cond_a3
    :goto_73
    const/4 v1, 0x0

    :goto_74
    if-eqz v1, :cond_a4

    .line 244
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a4
    move-object/from16 v1, v23

    move-object/from16 v2, v25

    move-object/from16 v3, v26

    move-object/from16 v4, v29

    move-object/from16 v5, v30

    move-object/from16 v6, v31

    goto/16 :goto_6c

    :cond_a5
    move-object/from16 v23, v1

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v29, v4

    move-object/from16 v30, v5

    .line 245
    invoke-static {v7}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    goto :goto_75

    :cond_a6
    move-object/from16 v23, v1

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v29, v4

    move-object/from16 v30, v5

    const/4 v1, 0x0

    .line 246
    :goto_75
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->w:Ljava/util/Map;

    if-eqz v2, :cond_b5

    .line 247
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 248
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_76
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 249
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/String;

    if-nez v6, :cond_a7

    const/4 v5, 0x0

    :cond_a7
    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_a9

    :cond_a8
    move-object/from16 v31, v1

    move-object/from16 v32, v2

    goto/16 :goto_7d

    .line 250
    :cond_a9
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Ljava/util/Map;

    if-eqz v6, :cond_aa

    check-cast v4, Ljava/util/Map;

    goto :goto_77

    :cond_aa
    const/4 v4, 0x0

    :goto_77
    if-eqz v4, :cond_a8

    .line 251
    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    if-eqz v6, :cond_a8

    .line 252
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 253
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_ab
    :goto_78
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_ac

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_ab

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_78

    .line 254
    :cond_ac
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 255
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    move-object/from16 v31, v1

    const/4 v1, 0x0

    :goto_79
    if-ge v1, v8, :cond_b0

    move-object/from16 v32, v2

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    .line 256
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v33

    if-eqz v33, :cond_ad

    move-object/from16 v40, v33

    move/from16 v33, v1

    move-object/from16 v1, v40

    goto :goto_7a

    :cond_ad
    move/from16 v33, v1

    const/4 v1, 0x0

    :goto_7a
    if-eqz v1, :cond_ae

    .line 257
    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_7b

    :cond_ae
    const/4 v1, 0x0

    :goto_7b
    if-eqz v1, :cond_af

    .line 258
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_af
    move-object/from16 v2, v32

    move/from16 v1, v33

    goto :goto_79

    :cond_b0
    move-object/from16 v32, v2

    .line 259
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b1

    goto :goto_7c

    :cond_b1
    const/4 v6, 0x0

    :goto_7c
    if-eqz v6, :cond_b2

    .line 260
    invoke-static {v6}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_b2

    .line 261
    invoke-static {v5, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_7e

    :cond_b2
    :goto_7d
    const/4 v1, 0x0

    :goto_7e
    if-eqz v1, :cond_b3

    .line 262
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b3
    move-object/from16 v1, v31

    move-object/from16 v2, v32

    goto/16 :goto_76

    :cond_b4
    move-object/from16 v31, v1

    .line 263
    invoke-static {v3}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    goto :goto_7f

    :cond_b5
    move-object/from16 v31, v1

    const/4 v1, 0x0

    .line 264
    :goto_7f
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->x:Ljava/lang/String;

    .line 265
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/g;

    .line 266
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->f:Ljava/lang/String;

    const-string v5, ""

    if-nez v4, :cond_b6

    move-object v4, v5

    .line 267
    :cond_b6
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->g:Lcom/sumsub/sns/core/data/model/FlowActionType;

    if-nez v6, :cond_b7

    .line 268
    sget-object v6, Lcom/sumsub/sns/core/data/model/FlowActionType;->Companion:Lcom/sumsub/sns/core/data/model/FlowActionType$Companion;

    invoke-virtual {v6, v5}, Lcom/sumsub/sns/core/data/model/FlowActionType$Companion;->get(Ljava/lang/String;)Lcom/sumsub/sns/core/data/model/FlowActionType;

    move-result-object v6

    .line 269
    :cond_b7
    invoke-direct {v3, v4, v6}, Lcom/sumsub/sns/internal/features/data/model/common/g;-><init>(Ljava/lang/String;Lcom/sumsub/sns/core/data/model/FlowActionType;)V

    .line 270
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;->f:Ljava/lang/String;

    if-eqz v0, :cond_b8

    move-object v6, v3

    :goto_80
    move-object/from16 v0, v18

    move-object/from16 v18, v25

    move-object/from16 v25, v2

    goto :goto_81

    :cond_b8
    const/4 v6, 0x0

    goto :goto_80

    .line 271
    :goto_81
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-object/from16 v16, v19

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    move-object/from16 v17, v23

    move-object/from16 v5, v24

    move-object/from16 v19, v26

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    move-object/from16 v21, v29

    move-object/from16 v20, v30

    move-object/from16 v23, v31

    move-object/from16 v24, v1

    move-object/from16 v26, v6

    move-object v6, v0

    invoke-direct/range {v2 .. v26}, Lcom/sumsub/sns/internal/features/data/model/common/h;-><init>(Ljava/lang/String;Lcom/sumsub/sns/core/data/model/FlowType;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/w3;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;Lcom/sumsub/sns/internal/features/data/model/common/remote/X;Lcom/sumsub/sns/internal/features/data/model/common/A3;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/g;)V

    return-object v2
.end method
