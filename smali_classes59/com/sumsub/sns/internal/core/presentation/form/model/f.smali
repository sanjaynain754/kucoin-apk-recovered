.class public abstract Lcom/sumsub/sns/internal/core/presentation/form/model/f;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final a:Lcom/sumsub/sns/internal/core/presentation/form/model/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/form/model/h0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/presentation/form/model/h0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/core/presentation/form/model/f;->a:Lcom/sumsub/sns/internal/core/presentation/form/model/h0;

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
.end method

.method public static a(Ljava/util/ArrayList;Lcom/sumsub/sns/internal/core/presentation/form/l;)Lcom/sumsub/sns/internal/core/presentation/form/model/e;
    .locals 13

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :cond_0
    :goto_0
    if-ge v5, v3, :cond_1

    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    instance-of v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    if-eqz v7, :cond_0

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v6, v4

    :cond_2
    :goto_1
    if-ge v6, v5, :cond_3

    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    move-object v8, v7

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 7
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v8

    .line 8
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-eqz v8, :cond_2

    .line 9
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 10
    :cond_3
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v7, v4

    :goto_2
    if-ge v7, v6, :cond_5

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    .line 12
    move-object v9, v8

    check-cast v9, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 13
    invoke-virtual {v9}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v9

    .line 14
    invoke-virtual {v5, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_4

    .line 15
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 16
    invoke-interface {v5, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    :cond_4
    check-cast v10, Ljava/util/List;

    .line 18
    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 19
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v6, v4

    :cond_6
    :goto_3
    if-ge v6, v3, :cond_c

    .line 20
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    .line 21
    iget-object v8, v7, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;->e:Ljava/lang/String;

    .line 22
    invoke-virtual {v5, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    .line 23
    invoke-static {v7, p0, v1, v0, p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/f;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Lcom/sumsub/sns/internal/core/presentation/form/l;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/4 v9, 0x1

    if-eqz v8, :cond_8

    .line 24
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    if-eqz v8, :cond_8

    .line 25
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 26
    invoke-static {v10, p0, v1, v0, p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/f;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Lcom/sumsub/sns/internal/core/presentation/form/l;)Z

    move-result v11

    if-nez v11, :cond_7

    .line 27
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_7

    .line 28
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v11

    .line 29
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-eqz v11, :cond_7

    .line 30
    new-instance v11, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    invoke-virtual {v10}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v10

    .line 31
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 32
    invoke-direct {v11, v12, v10}, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    move v9, v4

    goto :goto_4

    :cond_8
    if-eqz v9, :cond_6

    .line 33
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;->e:Ljava/lang/String;

    .line 34
    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    if-eqz v8, :cond_6

    .line 35
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    if-eqz v7, :cond_6

    .line 36
    :cond_a
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 37
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_b

    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v9

    .line 38
    iget-object v9, v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-eqz v9, :cond_b

    .line 39
    new-instance v9, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v11

    .line 40
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 41
    invoke-direct {v9, v10, v11}, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    invoke-interface {v0, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    :cond_b
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-interface {v1, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 44
    :cond_c
    new-instance p0, Lcom/sumsub/sns/internal/core/presentation/form/model/e;

    invoke-direct {p0, v1, v0}, Lcom/sumsub/sns/internal/core/presentation/form/model/e;-><init>(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;)V

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Lcom/sumsub/sns/internal/core/presentation/form/l;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    .line 45
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    const/4 v5, 0x1

    if-eqz v4, :cond_2d

    .line 46
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_2d

    .line 47
    iget-object v6, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    if-eqz v6, :cond_0

    .line 49
    sget-object v7, Lcom/sumsub/sns/internal/core/presentation/form/model/Logic;->OR:Lcom/sumsub/sns/internal/core/presentation/form/model/Logic;

    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/Logic;->getRawValue()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/sumsub/sns/internal/core/presentation/form/model/Logic;->AND:Lcom/sumsub/sns/internal/core/presentation/form/model/Logic;

    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/Logic;->getRawValue()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v7, v8}, [Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v7

    goto :goto_0

    :cond_0
    move-object v7, v4

    :goto_0
    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v7, :cond_5

    .line 50
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Ljava/lang/String;

    .line 51
    const-string v10, "!="

    invoke-static {v11, v10, v9, v8, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 52
    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v12

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v10

    .line 53
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v12}, Lcom/sumsub/sns/internal/features/data/model/common/remote/U;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/remote/T;

    move-result-object v12

    if-eqz v12, :cond_2

    .line 54
    new-instance v13, Lcom/sumsub/sns/internal/core/presentation/form/model/c;

    .line 55
    iget-object v14, v12, Lcom/sumsub/sns/internal/features/data/model/common/remote/T;->a:Ljava/lang/String;

    .line 56
    invoke-static {v14}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    .line 57
    iget-object v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/remote/T;->b:Ljava/lang/String;

    .line 58
    invoke-static {v12}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    .line 59
    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 60
    invoke-direct {v13, v11, v14, v12, v10}, Lcom/sumsub/sns/internal/core/presentation/form/model/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object v13, v4

    goto :goto_2

    .line 61
    :cond_3
    const-string v10, "="

    invoke-static {v11, v10, v9, v8, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    .line 62
    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v12

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v10

    .line 63
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v12}, Lcom/sumsub/sns/internal/features/data/model/common/remote/U;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/remote/T;

    move-result-object v12

    if-eqz v12, :cond_2

    .line 64
    new-instance v13, Lcom/sumsub/sns/internal/core/presentation/form/model/a;

    .line 65
    iget-object v14, v12, Lcom/sumsub/sns/internal/features/data/model/common/remote/T;->a:Ljava/lang/String;

    .line 66
    invoke-static {v14}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    .line 67
    iget-object v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/remote/T;->b:Ljava/lang/String;

    .line 68
    invoke-static {v12}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    .line 69
    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 70
    invoke-direct {v13, v11, v14, v12, v10}, Lcom/sumsub/sns/internal/core/presentation/form/model/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 71
    :cond_4
    invoke-static {v11}, Lcom/sumsub/sns/internal/features/data/model/common/remote/U;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/remote/T;

    move-result-object v10

    if-eqz v10, :cond_2

    .line 72
    new-instance v13, Lcom/sumsub/sns/internal/core/presentation/form/model/b;

    .line 73
    iget-object v12, v10, Lcom/sumsub/sns/internal/features/data/model/common/remote/T;->a:Ljava/lang/String;

    .line 74
    invoke-static {v12}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    .line 75
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/remote/T;->b:Ljava/lang/String;

    .line 76
    invoke-static {v10}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    .line 77
    invoke-direct {v13, v11, v12, v10}, Lcom/sumsub/sns/internal/core/presentation/form/model/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    if-eqz v13, :cond_1

    .line 78
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 79
    :cond_5
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 80
    new-instance v7, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v0, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v10, v6

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v11, " "

    if-eqz v6, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 82
    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/model/d;

    .line 83
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/d;->c()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/d;->b()Ljava/lang/String;

    move-result-object v13

    .line 84
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v14

    move v15, v9

    :goto_4
    if-ge v15, v14, :cond_7

    move-object/from16 v4, p1

    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v17, v16

    check-cast v17, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    move/from16 v18, v5

    .line 85
    invoke-virtual/range {v17 .. v17}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual/range {v17 .. v17}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v5

    .line 86
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 87
    invoke-static {v5, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_5

    :cond_6
    move/from16 v5, v18

    const/4 v4, 0x0

    goto :goto_4

    :cond_7
    move-object/from16 v4, p1

    move/from16 v18, v5

    const/16 v16, 0x0

    .line 88
    :goto_5
    check-cast v16, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    const-string v5, ""

    if-eqz v16, :cond_a

    .line 89
    invoke-virtual/range {v16 .. v16}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_8

    move-object v12, v5

    :cond_8
    invoke-virtual/range {v16 .. v16}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v13

    .line 90
    iget-object v13, v13, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-nez v13, :cond_9

    move-object v13, v5

    .line 91
    :cond_9
    invoke-interface {v3, v12, v13}, Lcom/sumsub/sns/internal/core/presentation/form/l;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_a

    .line 92
    new-instance v13, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/d;->c()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/d;->b()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v13, v14, v15}, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    .line 93
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/d;->c()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v1, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    goto :goto_6

    :cond_a
    const/4 v12, 0x0

    :goto_6
    if-eqz v16, :cond_e

    .line 94
    invoke-virtual/range {v16 .. v16}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_b

    move-object v13, v5

    :cond_b
    invoke-virtual/range {v16 .. v16}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v14

    .line 95
    iget-object v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-nez v14, :cond_c

    goto :goto_7

    :cond_c
    move-object v5, v14

    .line 96
    :goto_7
    invoke-interface {v3, v13, v5}, Lcom/sumsub/sns/internal/core/presentation/form/l;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_e

    .line 97
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_d

    goto :goto_8

    :cond_d
    const/4 v5, 0x0

    :goto_8
    if-eqz v5, :cond_e

    .line 98
    new-instance v13, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/d;->c()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/d;->b()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v13, v14, v15}, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_e

    .line 99
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/d;->c()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v1, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_e

    goto :goto_9

    :cond_e
    const/4 v5, 0x0

    .line 100
    :goto_9
    instance-of v13, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/a;

    if-eqz v13, :cond_10

    .line 101
    move-object v13, v6

    check-cast v13, Lcom/sumsub/sns/internal/core/presentation/form/model/a;

    .line 102
    iget-object v14, v13, Lcom/sumsub/sns/internal/core/presentation/form/model/a;->d:Ljava/lang/String;

    .line 103
    invoke-static {v14}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v5, :cond_f

    .line 104
    iget-object v13, v13, Lcom/sumsub/sns/internal/core/presentation/form/model/a;->d:Ljava/lang/String;

    .line 105
    invoke-static {v13}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v5, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_a

    :cond_f
    move v5, v9

    :goto_a
    if-nez v12, :cond_19

    if-eqz v5, :cond_18

    goto/16 :goto_10

    .line 106
    :cond_10
    instance-of v13, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/b;

    if-eqz v13, :cond_14

    if-eqz v12, :cond_12

    .line 107
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    if-nez v13, :cond_11

    goto :goto_b

    :cond_11
    const-string v13, "false"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_12

    move/from16 v12, v18

    goto :goto_c

    :cond_12
    :goto_b
    move v12, v9

    :goto_c
    if-eqz v5, :cond_13

    .line 108
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    goto :goto_d

    :cond_13
    move v5, v9

    :goto_d
    if-nez v12, :cond_19

    if-eqz v5, :cond_18

    goto :goto_10

    .line 109
    :cond_14
    instance-of v13, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/c;

    if-eqz v13, :cond_1b

    if-eqz v5, :cond_15

    .line 110
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_16

    .line 111
    :cond_15
    move-object v13, v6

    check-cast v13, Lcom/sumsub/sns/internal/core/presentation/form/model/c;

    .line 112
    iget-object v13, v13, Lcom/sumsub/sns/internal/core/presentation/form/model/c;->d:Ljava/lang/String;

    .line 113
    invoke-static {v13}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_16

    move/from16 v12, v18

    goto :goto_e

    :cond_16
    move v12, v9

    :goto_e
    if-eqz v5, :cond_17

    .line 114
    move-object v13, v6

    check-cast v13, Lcom/sumsub/sns/internal/core/presentation/form/model/c;

    .line 115
    iget-object v13, v13, Lcom/sumsub/sns/internal/core/presentation/form/model/c;->d:Ljava/lang/String;

    .line 116
    invoke-static {v13}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v5, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    move/from16 v5, v18

    goto :goto_f

    :cond_17
    move v5, v9

    :goto_f
    if-nez v12, :cond_19

    if-eqz v5, :cond_18

    goto :goto_10

    :cond_18
    move v5, v9

    goto :goto_11

    :cond_19
    :goto_10
    move/from16 v5, v18

    :goto_11
    if-eqz v10, :cond_1a

    .line 117
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/d;->a()Ljava/lang/String;

    move-result-object v6

    .line 118
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object v11, v6

    .line 119
    invoke-static/range {v10 .. v15}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    move-object v10, v5

    goto :goto_12

    :cond_1a
    const/4 v10, 0x0

    .line 120
    :goto_12
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 121
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v5, v18

    const/4 v4, 0x0

    goto/16 :goto_3

    .line 122
    :cond_1b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1c
    move/from16 v18, v5

    .line 123
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/form/model/f;->a:Lcom/sumsub/sns/internal/core/presentation/form/model/h0;

    if-eqz v10, :cond_1d

    invoke-static {v10}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1e

    :cond_1d
    const-string/jumbo v1, "true"

    :cond_1e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 125
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz v2, :cond_28

    .line 126
    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1f

    goto/16 :goto_19

    .line 127
    :cond_1f
    new-instance v10, Ljava/util/Stack;

    invoke-direct {v10}, Ljava/util/Stack;-><init>()V

    .line 128
    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 129
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_27

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 130
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/h0;->a:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_23

    .line 131
    :goto_14
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_22

    invoke-virtual {v10}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 132
    const-string v5, "&&"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_20

    move v4, v8

    goto :goto_15

    :cond_20
    move/from16 v4, v18

    .line 133
    :goto_15
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    move v5, v8

    goto :goto_16

    :cond_21
    move/from16 v5, v18

    :goto_16
    if-lt v4, v5, :cond_22

    .line 134
    invoke-virtual {v10}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    .line 135
    :cond_22
    invoke-virtual {v10, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_13

    .line 136
    :cond_23
    const-string v4, "("

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_24

    .line 137
    invoke-virtual {v10, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_13

    .line 138
    :cond_24
    const-string v5, ")"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    .line 139
    :goto_17
    invoke-virtual {v10}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    .line 140
    invoke-virtual {v10}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    .line 141
    :cond_25
    invoke-virtual {v10}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    goto :goto_13

    .line 142
    :cond_26
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 143
    :cond_27
    :goto_18
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_28

    .line 144
    invoke-virtual {v10}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    .line 145
    :cond_28
    :goto_19
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_29

    return v9

    .line 146
    :cond_29
    new-instance v2, Ljava/util/Stack;

    invoke-direct {v2}, Ljava/util/Stack;-><init>()V

    .line 147
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    :goto_1a
    if-ge v9, v3, :cond_2c

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v9, v9, 0x1

    check-cast v4, Ljava/lang/String;

    .line 148
    iget-object v5, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/h0;->a:Ljava/util/Map;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/jvm/functions/Function2;

    if-eqz v5, :cond_2b

    .line 149
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-ge v4, v8, :cond_2a

    return v18

    .line 150
    :cond_2a
    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v4, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_1a

    .line 151
    :cond_2b
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_1a

    .line 152
    :cond_2c
    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_2d
    move/from16 v18, v5

    return v18
.end method
