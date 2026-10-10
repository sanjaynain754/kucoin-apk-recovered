.class public abstract Lcom/sumsub/sns/internal/core/presentation/helper/camera/b;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/m;Lcom/sumsub/sns/internal/core/presentation/intro/g;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)Lcom/sumsub/sns/internal/core/presentation/helper/camera/f;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 2
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/X;->f()Z

    move-result v3

    const-string v4, ""

    const/4 v5, 0x1

    if-eqz v3, :cond_4

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual/range {p2 .. p2}, Lcom/sumsub/sns/internal/features/data/model/common/m;->e()Z

    move-result v3

    if-ne v3, v5, :cond_0

    const-string/jumbo v3, "portrait"

    goto :goto_0

    :cond_0
    const-string/jumbo v3, "photo"

    .line 4
    :goto_0
    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;

    .line 5
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 6
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v8, "sns_step_"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "_"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "_title"

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    move-object v7, v4

    .line 7
    :cond_1
    iget-object v9, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 8
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "_brief"

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_2

    move-object v9, v4

    .line 9
    :cond_2
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 10
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_details"

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v0

    .line 11
    :goto_1
    invoke-direct {v5, v7, v9, v4, v2}, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/intro/g;)V

    return-object v5

    .line 12
    :cond_4
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v5, :cond_5

    .line 13
    invoke-static/range {p4 .. p4}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/q2;

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    if-eqz p5, :cond_6

    .line 14
    invoke-virtual/range {p5 .. p5}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->getValue()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6

    .line 15
    sget-object v8, Lcom/sumsub/sns/internal/core/analytics/e;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/a;

    sget-object v8, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->IdDocSubType:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    .line 16
    sget-object v9, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v9, v8, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    if-nez p5, :cond_7

    const/4 v7, -0x1

    goto :goto_3

    .line 17
    :cond_7
    sget-object v7, Lcom/sumsub/sns/internal/core/presentation/helper/camera/a;->a:[I

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v7, v7, v8

    :goto_3
    const-string v8, "details"

    const-string v9, "brief"

    const-string v10, "defaults"

    const-string/jumbo v11, "title"

    const/4 v12, 0x5

    const-string/jumbo v13, "sns_step_%s_%s_%s_%s::%s"

    const-string/jumbo v14, "sns_step_%s_%s_%s_%s"

    const/4 v15, 0x4

    const-string/jumbo v6, "scan"

    if-eq v7, v5, :cond_c

    const/4 v4, 0x2

    if-eq v7, v4, :cond_8

    .line 18
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/helper/camera/e;->a:Lcom/sumsub/sns/internal/core/presentation/helper/camera/e;

    return-object v0

    .line 19
    :cond_8
    sget-object v4, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 20
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    if-eqz v3, :cond_9

    .line 21
    iget-object v5, v3, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    goto :goto_4

    :cond_9
    const/4 v5, 0x0

    .line 22
    :goto_4
    const-string v7, "backSide"

    filled-new-array {v4, v6, v7, v11, v5}, [Ljava/lang/Object;

    move-result-object v4

    .line 23
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v13, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 24
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 25
    filled-new-array {v5, v6, v7, v11}, [Ljava/lang/Object;

    move-result-object v5

    .line 26
    invoke-static {v5, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v14, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 27
    filled-new-array {v10, v6, v7, v11}, [Ljava/lang/Object;

    move-result-object v11

    .line 28
    invoke-static {v11, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 29
    filled-new-array {v4, v5, v11}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 30
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    if-eqz v3, :cond_a

    .line 31
    iget-object v11, v3, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    goto :goto_5

    :cond_a
    const/4 v11, 0x0

    .line 32
    :goto_5
    filled-new-array {v5, v6, v7, v9, v11}, [Ljava/lang/Object;

    move-result-object v5

    .line 33
    invoke-static {v5, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 34
    iget-object v11, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 35
    filled-new-array {v11, v6, v7, v9}, [Ljava/lang/Object;

    move-result-object v11

    .line 36
    invoke-static {v11, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 37
    filled-new-array {v10, v6, v7, v9}, [Ljava/lang/Object;

    move-result-object v9

    .line 38
    invoke-static {v9, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    invoke-static {v14, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 39
    filled-new-array {v5, v11, v9}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 40
    iget-object v9, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    if-eqz v3, :cond_b

    .line 41
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    goto :goto_6

    :cond_b
    const/4 v3, 0x0

    .line 42
    :goto_6
    filled-new-array {v9, v6, v7, v8, v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 43
    invoke-static {v3, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 44
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 45
    filled-new-array {v1, v6, v7, v8}, [Ljava/lang/Object;

    move-result-object v1

    .line 46
    invoke-static {v1, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v14, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 47
    filled-new-array {v10, v6, v7, v8}, [Ljava/lang/Object;

    move-result-object v6

    .line 48
    invoke-static {v6, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v14, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 49
    filled-new-array {v3, v1, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;

    invoke-direct {v1, v4, v5, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/intro/g;)V

    return-object v1

    .line 51
    :cond_c
    const-string/jumbo v7, "sns_iddoc_listing_join"

    invoke-virtual {v0, v7}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_d

    move-object/from16 v17, v4

    goto :goto_7

    :cond_d
    move-object/from16 v17, v7

    :goto_7
    new-instance v7, Lcom/sumsub/sns/internal/core/presentation/helper/camera/g;

    invoke-direct {v7, v0}, Lcom/sumsub/sns/internal/core/presentation/helper/camera/g;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)V

    const/16 v23, 0x1e

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, p4

    move-object/from16 v22, v7

    invoke-static/range {v16 .. v24}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 52
    const-string/jumbo v5, "sns_iddoc_listing_join_details"

    invoke-virtual {v0, v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_e

    move-object/from16 v17, v4

    goto :goto_8

    :cond_e
    move-object/from16 v17, v5

    :goto_8
    new-instance v4, Lcom/sumsub/sns/internal/core/presentation/helper/camera/h;

    invoke-direct {v4, v0}, Lcom/sumsub/sns/internal/core/presentation/helper/camera/h;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)V

    const/16 v23, 0x1e

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, p4

    move-object/from16 v22, v4

    invoke-static/range {v16 .. v24}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 53
    sget-object v5, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 54
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    if-eqz v3, :cond_f

    .line 55
    iget-object v15, v3, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    :goto_9
    move-object/from16 p4, v4

    goto :goto_a

    :cond_f
    const/4 v15, 0x0

    goto :goto_9

    .line 56
    :goto_a
    const-string v4, "frontSide"

    filled-new-array {v5, v6, v4, v11, v15}, [Ljava/lang/Object;

    move-result-object v5

    .line 57
    invoke-static {v5, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 58
    iget-object v15, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 59
    filled-new-array {v15, v6, v4, v11}, [Ljava/lang/Object;

    move-result-object v15

    const/4 v12, 0x4

    .line 60
    invoke-static {v15, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v15

    invoke-static {v14, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 61
    filled-new-array {v10, v6, v4, v11}, [Ljava/lang/Object;

    move-result-object v11

    .line 62
    invoke-static {v11, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 63
    filled-new-array {v5, v15, v11}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 64
    iget-object v11, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    if-eqz v3, :cond_10

    .line 65
    iget-object v12, v3, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    goto :goto_b

    :cond_10
    const/4 v12, 0x0

    .line 66
    :goto_b
    filled-new-array {v11, v6, v4, v9, v12}, [Ljava/lang/Object;

    move-result-object v11

    const/4 v12, 0x5

    .line 67
    invoke-static {v11, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v11

    invoke-static {v13, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 68
    iget-object v12, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 69
    filled-new-array {v12, v6, v4, v9}, [Ljava/lang/Object;

    move-result-object v12

    const/4 v15, 0x4

    .line 70
    invoke-static {v12, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    invoke-static {v14, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 71
    filled-new-array {v10, v6, v4, v9}, [Ljava/lang/Object;

    move-result-object v9

    .line 72
    invoke-static {v9, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    invoke-static {v14, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 73
    filled-new-array {v11, v12, v9}, [Ljava/lang/String;

    move-result-object v9

    .line 74
    invoke-virtual {v0, v9}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const/16 v21, 0x4

    const/16 v22, 0x0

    .line 75
    const-string/jumbo v18, "{doctypes}"

    const-string v19, "%s"

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 76
    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const/4 v11, 0x1

    .line 77
    invoke-static {v7, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v9, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 78
    iget-object v9, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    if-eqz v3, :cond_11

    .line 79
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    goto :goto_c

    :cond_11
    const/4 v3, 0x0

    .line 80
    :goto_c
    filled-new-array {v9, v6, v4, v8, v3}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v12, 0x5

    .line 81
    invoke-static {v3, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 82
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 83
    filled-new-array {v1, v6, v4, v8}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v12, 0x4

    .line 84
    invoke-static {v1, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v14, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 85
    filled-new-array {v10, v6, v4, v8}, [Ljava/lang/Object;

    move-result-object v4

    .line 86
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 87
    filled-new-array {v3, v1, v4}, [Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v12, 0x4

    const/4 v13, 0x0

    .line 89
    const-string/jumbo v9, "{doctypes}"

    const-string v10, "%s"

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 90
    filled-new-array/range {p4 .. p4}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v11, 0x1

    .line 91
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 92
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;

    invoke-direct {v1, v5, v7, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/intro/g;)V

    return-object v1
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/q2;)Ljava/lang/CharSequence;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p0, v0}, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/q2;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0, v0}, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    move-result-object p0

    .line 6
    return-object p0
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
