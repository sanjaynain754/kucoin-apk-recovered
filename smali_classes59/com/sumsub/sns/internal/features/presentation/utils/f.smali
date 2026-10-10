.class public abstract Lcom/sumsub/sns/internal/features/presentation/utils/f;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static synthetic a(Lcom/sumsub/sns/internal/features/data/model/common/y;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/domain/appdata/b;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/jvm/functions/Function2;Ljava/lang/CharSequence;Ljava/util/Map;Ljava/util/Map;I)Lcom/sumsub/sns/internal/core/presentation/form/model/e0;
    .locals 12

    and-int/lit8 v0, p9, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object/from16 v7, p6

    :goto_0
    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    .line 32
    invoke-static/range {v1 .. v11}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/domain/appdata/b;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/jvm/functions/Function2;Ljava/lang/CharSequence;ZLjava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/y;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/domain/appdata/b;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/jvm/functions/Function2;Ljava/lang/CharSequence;ZLjava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)Lcom/sumsub/sns/internal/core/presentation/form/model/e0;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p9

    if-nez p5, :cond_0

    .line 33
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/utils/e0;

    invoke-direct {v5, v3}, Lcom/sumsub/sns/internal/features/presentation/utils/e0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)V

    goto :goto_0

    :cond_0
    move-object/from16 v5, p5

    .line 34
    :goto_0
    iget-object v9, v2, Lcom/sumsub/sns/internal/features/domain/appdata/b;->d:Ljava/util/Map;

    .line 35
    iget-object v13, v2, Lcom/sumsub/sns/internal/features/domain/appdata/b;->e:Ljava/util/Map;

    .line 36
    iget-object v6, v2, Lcom/sumsub/sns/internal/features/domain/appdata/b;->f:Ljava/util/Map;

    .line 37
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/domain/appdata/b;->c:Ljava/util/Map;

    .line 38
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    const/4 v10, 0x0

    if-eqz v8, :cond_1

    .line 39
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v10

    :goto_1
    if-eqz v8, :cond_2

    .line 40
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    move-object/from16 v17, v11

    goto :goto_2

    :cond_2
    move-object/from16 v17, v10

    :goto_2
    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz p8, :cond_3

    .line 41
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_4

    .line 42
    :cond_3
    iget-object v14, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->i:Ljava/lang/Boolean;

    .line 43
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    if-eqz v8, :cond_4

    move-object/from16 v14, p10

    invoke-interface {v14, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object v8, v10

    :goto_3
    if-eqz v8, :cond_6

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_5

    goto :goto_4

    :cond_5
    move/from16 v18, v11

    goto :goto_5

    :cond_6
    :goto_4
    move/from16 v18, v12

    .line 44
    :goto_5
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 45
    sget-object v14, Lcom/sumsub/sns/internal/features/data/model/common/U0;->b:Lcom/sumsub/sns/internal/features/data/model/common/U0;

    invoke-static {v8, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 46
    invoke-static {v0, v3, v10, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v8

    .line 47
    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    .line 48
    const-string v7, "appdata"

    const/16 v13, 0x40

    move-object/from16 v12, p6

    move-object/from16 v10, v17

    move/from16 v11, v18

    invoke-direct/range {v6 .. v13}, Lcom/sumsub/sns/internal/core/presentation/form/model/q;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/CharSequence;I)V

    return-object v6

    .line 49
    :cond_7
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 50
    sget-object v14, Lcom/sumsub/sns/internal/features/data/model/common/Q1;->b:Lcom/sumsub/sns/internal/features/data/model/common/Q1;

    invoke-static {v8, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 51
    invoke-static {v0, v3, v10, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v8

    .line 52
    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    .line 53
    const-string v7, "appdata"

    const/16 v13, 0x40

    move-object/from16 v12, p6

    move-object/from16 v10, v17

    move/from16 v11, v18

    invoke-direct/range {v6 .. v13}, Lcom/sumsub/sns/internal/core/presentation/form/model/q;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/CharSequence;I)V

    return-object v6

    .line 54
    :cond_8
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 55
    instance-of v14, v8, Lcom/sumsub/sns/internal/features/data/model/common/W1;

    if-eqz v14, :cond_9

    .line 56
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    .line 57
    invoke-static {v0, v3, v10, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v0

    .line 58
    const-string v2, "appdata"

    invoke-direct {v1, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/form/model/E;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)V

    return-object v1

    .line 59
    :cond_9
    instance-of v14, v8, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    if-eqz v14, :cond_c

    .line 60
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/y;->c()Ljava/lang/String;

    move-result-object v20

    .line 61
    const-string/jumbo v1, "sns_data_tax_information_country"

    invoke-virtual {v3, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 62
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    if-nez v1, :cond_a

    .line 63
    iget-boolean v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    if-eqz v1, :cond_b

    .line 64
    const-string/jumbo v1, "sns_data_placeholder_required"

    invoke-virtual {v3, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_a
    :goto_6
    move-object/from16 v26, v1

    goto :goto_7

    .line 65
    :cond_b
    const-string/jumbo v1, "sns_data_placeholder_optional"

    invoke-virtual {v3, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    .line 66
    :goto_7
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 67
    new-instance v8, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 68
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v24

    const/16 v28, 0x0

    const/16 v29, 0x3ac

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v19, v8

    .line 69
    invoke-direct/range {v19 .. v29}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 70
    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    .line 71
    const-string v7, "appdata"

    const/16 v13, 0x40

    move-object/from16 v12, p6

    move-object/from16 v10, v17

    move/from16 v11, v18

    invoke-direct/range {v6 .. v13}, Lcom/sumsub/sns/internal/core/presentation/form/model/q;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/CharSequence;I)V

    return-object v6

    .line 72
    :cond_c
    instance-of v9, v8, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    const-string v14, ""

    if-eqz v9, :cond_11

    .line 73
    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 74
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    .line 75
    iget v5, v8, Lcom/sumsub/sns/internal/features/data/model/common/Y1;->b:I

    .line 76
    invoke-direct {v2, v5}, Lcom/sumsub/sns/internal/features/data/model/common/U1;-><init>(I)V

    .line 77
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/d2;->a:Ljava/lang/String;

    .line 78
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Ljava/lang/String;

    if-nez v21, :cond_d

    goto :goto_8

    :cond_d
    move-object/from16 v14, v21

    .line 79
    :goto_8
    invoke-static {v14, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/utils/i;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Lcom/sumsub/sns/internal/features/domain/appdata/g;

    move-result-object v1

    .line 80
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 81
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 82
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/d2;->a:Ljava/lang/String;

    .line 83
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/domain/appdata/g;->a:Ljava/lang/CharSequence;

    if-eqz v3, :cond_e

    .line 84
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v24, v3

    goto :goto_9

    :cond_e
    move-object/from16 v24, v10

    .line 85
    :goto_9
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/domain/appdata/g;->d:Ljava/lang/String;

    .line 86
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/domain/appdata/g;->c:Ljava/lang/String;

    .line 87
    iget-boolean v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 88
    new-instance v22, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 89
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v27

    const/16 v31, 0x0

    const/16 v32, 0x388

    const/16 v26, 0x0

    .line 90
    const-string v28, "android_tetxt_cap_words"

    const/16 v30, 0x0

    move-object/from16 v29, v1

    move-object/from16 v23, v2

    move-object/from16 v25, v3

    invoke-direct/range {v22 .. v32}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 91
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    if-eqz v1, :cond_10

    .line 92
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v12

    if-ne v1, v12, :cond_10

    .line 93
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    :cond_f
    :goto_a
    move-object/from16 v20, v10

    goto :goto_b

    .line 94
    :cond_10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->e:Ljava/lang/String;

    if-eqz v0, :cond_f

    .line 95
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v10

    goto :goto_a

    .line 96
    :goto_b
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    .line 97
    const-string v16, "appdata"

    move-object/from16 v15, v22

    const/16 v22, 0x40

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v22}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    return-object v14

    .line 98
    :cond_11
    sget-object v9, Lcom/sumsub/sns/internal/features/data/model/common/g1;->b:Lcom/sumsub/sns/internal/features/data/model/common/g1;

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    .line 99
    invoke-static {v7}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object v1

    .line 100
    invoke-static {v0, v3, v1, v5, v10}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;Ljava/lang/Boolean;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v15

    .line 101
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/V;

    .line 102
    const-string v16, "appdata"

    const/16 v20, 0x20

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v20}, Lcom/sumsub/sns/internal/core/presentation/form/model/V;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;I)V

    return-object v14

    .line 103
    :cond_12
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 104
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/a1;->b:Lcom/sumsub/sns/internal/features/data/model/common/a1;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_13

    .line 105
    const-string v1, "email"

    invoke-static {v0, v3, v1, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v15

    .line 106
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/16 v21, 0x0

    const/16 v22, 0xe0

    .line 107
    const-string v16, "appdata"

    const/16 v20, 0x0

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v22}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    return-object v14

    .line 108
    :cond_13
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 109
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/C1;->b:Lcom/sumsub/sns/internal/features/data/model/common/C1;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16

    .line 110
    invoke-static {v0, v3, v10, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v12

    .line 111
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/domain/appdata/b;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz v0, :cond_15

    .line 112
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->g:Ljava/util/Map;

    if-nez v0, :cond_14

    goto :goto_d

    :cond_14
    :goto_c
    move-object v14, v0

    goto :goto_e

    .line 113
    :cond_15
    :goto_d
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_c

    .line 114
    :goto_e
    new-instance v10, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    .line 115
    const-string v11, "appdata"

    const/16 v16, 0x1

    move-object/from16 v15, p1

    move/from16 v19, v18

    move-object/from16 v18, p6

    invoke-direct/range {v10 .. v19}, Lcom/sumsub/sns/internal/core/presentation/form/model/O;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/CharSequence;Z)V

    return-object v10

    .line 116
    :cond_16
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/d2;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/S0;

    iget-object v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/Y0;->b:Lcom/sumsub/sns/internal/features/data/model/common/Y0;

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_35

    .line 118
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/m1;->b:Lcom/sumsub/sns/internal/features/data/model/common/m1;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    goto/16 :goto_19

    .line 119
    :cond_17
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/FieldType;->date:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    if-ne v7, v8, :cond_18

    goto/16 :goto_19

    .line 120
    :cond_18
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 121
    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/u1;->b:Lcom/sumsub/sns/internal/features/data/model/common/u1;

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19

    .line 122
    invoke-static {v0, v3, v10, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v12

    .line 123
    new-instance v10, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    .line 124
    const-string v11, "appdata"

    move-object/from16 v14, v17

    const/16 v17, 0x40

    move-object/from16 v16, p6

    move/from16 v15, v18

    invoke-direct/range {v10 .. v17}, Lcom/sumsub/sns/internal/core/presentation/form/model/q;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/CharSequence;I)V

    return-object v10

    .line 125
    :cond_19
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 126
    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/c1;->b:Lcom/sumsub/sns/internal/features/data/model/common/c1;

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v7, "android_tetxt_cap_words"

    if-nez v2, :cond_34

    .line 127
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 128
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/o1;->b:Lcom/sumsub/sns/internal/features/data/model/common/o1;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_34

    .line 129
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 130
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/s1;->b:Lcom/sumsub/sns/internal/features/data/model/common/s1;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    goto/16 :goto_18

    .line 131
    :cond_1a
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 132
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/M1;->b:Lcom/sumsub/sns/internal/features/data/model/common/M1;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    .line 133
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 134
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/O1;->b:Lcom/sumsub/sns/internal/features/data/model/common/O1;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    .line 135
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 136
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/a2;->b:Lcom/sumsub/sns/internal/features/data/model/common/a2;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    .line 137
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 138
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/E1;->b:Lcom/sumsub/sns/internal/features/data/model/common/E1;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    .line 139
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 140
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/G1;->b:Lcom/sumsub/sns/internal/features/data/model/common/G1;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    goto/16 :goto_17

    .line 141
    :cond_1b
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 142
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/q1;->b:Lcom/sumsub/sns/internal/features/data/model/common/q1;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    .line 143
    invoke-static {v0, v3, v7, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v15

    .line 144
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/16 v21, 0x0

    const/16 v22, 0xe0

    .line 145
    const-string v16, "appdata"

    const/16 v20, 0x0

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v22}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    return-object v14

    .line 146
    :cond_1c
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 147
    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/S1;->b:Lcom/sumsub/sns/internal/features/data/model/common/S1;

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21

    .line 148
    const-string/jumbo v2, "msdk_local_tin_validation_country"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Ljava/lang/String;

    if-nez v21, :cond_1d

    goto :goto_f

    :cond_1d
    move-object/from16 v14, v21

    .line 149
    :goto_f
    invoke-static {v14, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/utils/i;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Lcom/sumsub/sns/internal/features/domain/appdata/g;

    move-result-object v1

    .line 150
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 151
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v23

    .line 152
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/domain/appdata/g;->a:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1e

    .line 153
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v24, v2

    goto :goto_10

    :cond_1e
    move-object/from16 v24, v10

    .line 154
    :goto_10
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/domain/appdata/g;->d:Ljava/lang/String;

    .line 155
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/domain/appdata/g;->c:Ljava/lang/String;

    .line 156
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 157
    new-instance v22, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 158
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v27

    const/16 v31, 0x0

    const/16 v32, 0x388

    const/16 v26, 0x0

    .line 159
    const-string v28, "android_tetxt_cap_words"

    const/16 v30, 0x0

    move-object/from16 v29, v1

    move-object/from16 v25, v2

    invoke-direct/range {v22 .. v32}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 160
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    if-eqz v1, :cond_20

    .line 161
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v12

    if-ne v1, v12, :cond_20

    .line 162
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    :cond_1f
    :goto_11
    move-object/from16 v20, v10

    goto :goto_12

    .line 163
    :cond_20
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->e:Ljava/lang/String;

    if-eqz v0, :cond_1f

    .line 164
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v10

    goto :goto_11

    .line 165
    :goto_12
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    .line 166
    const-string v16, "appdata"

    move-object/from16 v15, v22

    const/16 v22, 0x40

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v22}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    return-object v14

    .line 167
    :cond_21
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 168
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/W0;->b:Lcom/sumsub/sns/internal/features/data/model/common/W0;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_22

    .line 169
    invoke-static {v0, v3, v10, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v12

    .line 170
    new-instance v10, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    .line 171
    const-string v11, "appdata"

    move-object/from16 v14, v17

    const/16 v17, 0x40

    move-object/from16 v16, p6

    move/from16 v15, v18

    invoke-direct/range {v10 .. v17}, Lcom/sumsub/sns/internal/core/presentation/form/model/q;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/CharSequence;I)V

    return-object v10

    .line 172
    :cond_22
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 173
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/K1;->b:Lcom/sumsub/sns/internal/features/data/model/common/K1;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "USA"

    if-eqz v1, :cond_29

    .line 174
    const-string v1, "countryOfBirth"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 175
    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    if-nez v4, :cond_23

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    .line 176
    :cond_23
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_24

    .line 177
    invoke-static {v0, v3, v10, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v15

    .line 178
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/16 v21, 0x0

    const/16 v22, 0xe0

    .line 179
    const-string v16, "appdata"

    const/16 v20, 0x0

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v22}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    return-object v14

    .line 180
    :cond_24
    invoke-static {v4}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object v6

    .line 181
    iget-boolean v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    if-nez v7, :cond_27

    if-eqz p7, :cond_25

    .line 182
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_27

    :cond_25
    if-eqz v1, :cond_26

    .line 183
    invoke-static {v1, v2, v12}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    goto :goto_13

    :cond_26
    move v1, v11

    :goto_13
    if-eqz v1, :cond_28

    :cond_27
    move v11, v12

    .line 184
    :cond_28
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 185
    invoke-static {v0, v3, v6, v5, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;Ljava/lang/Boolean;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v15

    .line 186
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/V;

    .line 187
    const-string v16, "appdata"

    const/16 v20, 0x20

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v20}, Lcom/sumsub/sns/internal/core/presentation/form/model/V;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;I)V

    return-object v14

    .line 188
    :cond_29
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 189
    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/I1;->b:Lcom/sumsub/sns/internal/features/data/model/common/I1;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_30

    .line 190
    const-string v1, "country"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 191
    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    if-nez v4, :cond_2a

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    .line 192
    :cond_2a
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2b

    .line 193
    invoke-static {v0, v3, v10, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v15

    .line 194
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/16 v21, 0x0

    const/16 v22, 0xe0

    .line 195
    const-string v16, "appdata"

    const/16 v20, 0x0

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v22}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    return-object v14

    .line 196
    :cond_2b
    invoke-static {v4}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object v6

    .line 197
    iget-boolean v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    if-nez v7, :cond_2e

    if-eqz p7, :cond_2c

    .line 198
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2e

    :cond_2c
    if-eqz v1, :cond_2d

    .line 199
    invoke-static {v1, v2, v12}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    goto :goto_14

    :cond_2d
    move v1, v11

    :goto_14
    if-eqz v1, :cond_2f

    :cond_2e
    move v11, v12

    .line 200
    :cond_2f
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 201
    invoke-static {v0, v3, v6, v5, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;Ljava/lang/Boolean;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v15

    .line 202
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/V;

    .line 203
    const-string v16, "appdata"

    const/16 v20, 0x20

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v20}, Lcom/sumsub/sns/internal/core/presentation/form/model/V;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;I)V

    return-object v14

    .line 204
    :cond_30
    invoke-static {v0, v3, v10, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v15

    .line 205
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    if-eqz v1, :cond_32

    .line 206
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v12

    if-ne v1, v12, :cond_32

    .line 207
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    :cond_31
    :goto_15
    move-object/from16 v20, v10

    goto :goto_16

    .line 208
    :cond_32
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->e:Ljava/lang/String;

    if-eqz v0, :cond_31

    .line 209
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v10

    goto :goto_15

    .line 210
    :goto_16
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/16 v21, 0x0

    const/16 v22, 0xc0

    .line 211
    const-string v16, "appdata"

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v22}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    return-object v14

    .line 212
    :cond_33
    :goto_17
    invoke-static {v0, v3, v7, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v15

    .line 213
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/16 v21, 0x0

    const/16 v22, 0xe0

    .line 214
    const-string v16, "appdata"

    const/16 v20, 0x0

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v22}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    return-object v14

    .line 215
    :cond_34
    :goto_18
    invoke-static {v0, v3, v7, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v15

    .line 216
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/16 v21, 0x0

    const/16 v22, 0xe0

    .line 217
    const-string v16, "appdata"

    const/16 v20, 0x0

    move-object/from16 v19, p6

    invoke-direct/range {v14 .. v22}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    return-object v14

    .line 218
    :cond_35
    :goto_19
    invoke-static {v0, v3, v10, v5}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v15

    .line 219
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 220
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/m1;->b:Lcom/sumsub/sns/internal/features/data/model/common/m1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_37

    :cond_36
    move v11, v12

    .line 221
    :cond_37
    new-instance v14, Lcom/sumsub/sns/internal/core/presentation/form/model/s;

    .line 222
    const-string v16, "appdata"

    move-object/from16 v19, p6

    move/from16 v20, v18

    move-object/from16 v18, v17

    move/from16 v17, v11

    invoke-direct/range {v14 .. v20}, Lcom/sumsub/sns/internal/core/presentation/form/model/s;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/CharSequence;Z)V

    return-object v14
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;
    .locals 11

    .line 240
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/y;->c()Ljava/lang/String;

    move-result-object v1

    .line 241
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 242
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const-string v3, "field"

    invoke-interface {p3, v3, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 243
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    if-eqz v3, :cond_1

    .line 244
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v2

    :cond_1
    const-string v3, "hint"

    invoke-interface {p3, v3, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    move-object v3, p3

    check-cast v3, Ljava/lang/String;

    .line 245
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    if-nez p3, :cond_2

    .line 246
    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    if-eqz p3, :cond_3

    .line 247
    const-string/jumbo p3, "sns_data_placeholder_required"

    invoke-virtual {p1, p3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :cond_2
    :goto_1
    move-object v7, p3

    goto :goto_2

    .line 248
    :cond_3
    const-string/jumbo p3, "sns_data_placeholder_optional"

    invoke-virtual {p1, p3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_1

    .line 249
    :goto_2
    iget-boolean p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    move-object v2, v0

    .line 250
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 251
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/4 v9, 0x0

    const/16 v10, 0x388

    const/4 v4, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 252
    invoke-direct/range {v0 .. v10}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;Ljava/lang/Boolean;)Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 225
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 226
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v3

    move-object v6, v3

    goto :goto_0

    :cond_0
    move-object v6, v4

    .line 227
    :goto_0
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    if-eqz v3, :cond_1

    .line 228
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    const-string v5, "field"

    invoke-interface {v2, v5, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    .line 229
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    if-eqz v3, :cond_2

    .line 230
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v4

    :cond_2
    const-string v3, "hint"

    invoke-interface {v2, v3, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    .line 231
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    if-nez v2, :cond_3

    .line 232
    iget-boolean v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    if-eqz v2, :cond_4

    .line 233
    const-string/jumbo v2, "sns_data_placeholder_required"

    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_3
    :goto_2
    move-object v12, v2

    goto :goto_3

    .line 234
    :cond_4
    const-string/jumbo v2, "sns_data_placeholder_optional"

    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :goto_3
    if-eqz p4, :cond_5

    .line 235
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_4

    .line 236
    :cond_5
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 237
    :goto_4
    new-instance v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 238
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const/4 v13, 0x0

    const/16 v15, 0x2a8

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v14, p2

    .line 239
    invoke-direct/range {v5 .. v15}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    return-object v5
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 223
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x2

    .line 224
    const-string/jumbo v0, "sns_data_%s_%s"

    invoke-static {p1, p2, v0, p0}, Lcom/sumsub/sns/internal/core/presentation/intro/d;->a([Ljava/lang/Object;ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Ljava/util/Map;)Ljava/util/ArrayList;
    .locals 4

    .line 253
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 254
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 255
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v2, v3, v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final a(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/appdata/b;)Ljava/util/LinkedHashMap;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 2
    iget-object p1, p3, Lcom/sumsub/sns/internal/features/domain/appdata/b;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 3
    iget-object p3, p3, Lcom/sumsub/sns/internal/features/domain/appdata/b;->d:Ljava/util/Map;

    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/U0;->b:Lcom/sumsub/sns/internal/features/data/model/common/U0;

    const-string v2, "country"

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 5
    invoke-interface {p3, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, v3

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    .line 6
    invoke-interface {p3, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    move-object p2, v4

    .line 7
    :goto_2
    invoke-interface {v0, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    sget-object p2, Lcom/sumsub/sns/internal/features/data/model/common/K1;->b:Lcom/sumsub/sns/internal/features/data/model/common/K1;

    invoke-static {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/d2;)Z

    move-result p2

    if-eqz p2, :cond_6

    sget-object p2, Lcom/sumsub/sns/internal/features/data/model/common/W0;->b:Lcom/sumsub/sns/internal/features/data/model/common/W0;

    invoke-static {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/d2;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 9
    const-string v3, "countryOfBirth"

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_5

    if-eqz p1, :cond_4

    .line 10
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/j;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/d2;)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_4
    move-object v5, v4

    .line 11
    :cond_5
    :goto_3
    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    :cond_6
    sget-object p2, Lcom/sumsub/sns/internal/features/data/model/common/Q1;->b:Lcom/sumsub/sns/internal/features/data/model/common/Q1;

    invoke-static {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/d2;)Z

    move-result p2

    const-string/jumbo v3, "msdk_local_tin_validation_country"

    if-eqz p2, :cond_c

    .line 13
    const-string/jumbo p2, "taxResidenceCountry"

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_8

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->f()Lcom/sumsub/sns/internal/features/data/model/common/j;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 14
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/data/model/common/j;->b:Ljava/lang/String;

    goto :goto_4

    :cond_7
    move-object v5, v4

    :cond_8
    :goto_4
    if-eqz v5, :cond_9

    .line 15
    invoke-interface {p3, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_5

    :cond_9
    move-object v5, v4

    .line 16
    :goto_5
    invoke-interface {v0, p2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/S1;->b:Lcom/sumsub/sns/internal/features/data/model/common/S1;

    invoke-static {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/d2;)Z

    move-result p1

    if-eqz p1, :cond_13

    if-nez v5, :cond_b

    .line 18
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/d2;)Z

    move-result p0

    if-eqz p0, :cond_a

    move-object v4, p1

    :cond_a
    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    .line 19
    :cond_b
    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    .line 20
    :cond_c
    sget-object p2, Lcom/sumsub/sns/internal/features/data/model/common/S1;->b:Lcom/sumsub/sns/internal/features/data/model/common/S1;

    invoke-static {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/d2;)Z

    move-result p2

    if-eqz p2, :cond_13

    .line 21
    invoke-static {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/f;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/d2;)Z

    move-result p0

    if-eqz p0, :cond_d

    .line 22
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_d

    .line 23
    invoke-interface {p3, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_d

    goto :goto_6

    :cond_d
    move-object p0, v4

    :goto_6
    if-eqz p1, :cond_10

    .line 24
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->f()Lcom/sumsub/sns/internal/features/data/model/common/j;

    move-result-object p2

    if-eqz p2, :cond_10

    .line 25
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/j;->b:Ljava/lang/String;

    if-eqz p2, :cond_10

    .line 26
    invoke-interface {p3, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    move-object p2, v4

    :goto_7
    if-nez p2, :cond_f

    goto :goto_8

    :cond_f
    move-object v4, p2

    goto :goto_9

    :cond_10
    :goto_8
    if-nez p0, :cond_11

    if-eqz p1, :cond_12

    .line 27
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->f()Lcom/sumsub/sns/internal/features/data/model/common/j;

    move-result-object p0

    if-eqz p0, :cond_12

    .line 28
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/j;->a:Ljava/lang/String;

    if-eqz p0, :cond_12

    .line 29
    invoke-interface {p3, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    :cond_11
    move-object v4, p0

    .line 30
    :cond_12
    :goto_9
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    :cond_13
    :goto_a
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/d2;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 257
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    .line 258
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/D;

    .line 259
    instance-of v2, v1, Lcom/sumsub/sns/internal/features/data/model/common/y;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/y;

    goto :goto_0

    :cond_2
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_3

    .line 260
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 261
    :cond_3
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_4
    return v0
.end method
