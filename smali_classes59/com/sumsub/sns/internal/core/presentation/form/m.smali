.class public abstract Lcom/sumsub/sns/internal/core/presentation/form/m;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lcom/sumsub/sns/internal/core/presentation/form/model/C;)Lcom/sumsub/sns/internal/core/presentation/form/model/C;
    .locals 8

    const/4 v6, 0x0

    const/16 v7, 0x3bf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    .line 36
    invoke-static/range {v0 .. v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/C;Ljava/lang/String;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Lcom/sumsub/sns/internal/core/presentation/form/model/A;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/lang/String;I)Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    move-result-object p0

    .line 37
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    .line 38
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final a(Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Lcom/sumsub/sns/internal/core/presentation/form/model/C;)Lcom/sumsub/sns/internal/core/presentation/form/model/C;
    .locals 8

    if-eqz p0, :cond_0

    const/4 v6, 0x0

    const/16 v7, 0x3df

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    move-object v0, p2

    .line 67
    invoke-static/range {v0 .. v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/C;Ljava/lang/String;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Lcom/sumsub/sns/internal/core/presentation/form/model/A;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/lang/String;I)Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object v3, p1

    move-object v0, p2

    const/4 v6, 0x0

    const/16 v7, 0x37f

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 68
    invoke-static/range {v0 .. v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/C;Ljava/lang/String;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Lcom/sumsub/sns/internal/core/presentation/form/model/A;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/lang/String;I)Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    move-result-object p0

    .line 69
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    .line 70
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final a(Ljava/util/List;Ljava/util/List;Lcom/sumsub/sns/internal/core/presentation/form/model/C;)Lcom/sumsub/sns/internal/core/presentation/form/model/C;
    .locals 8

    if-eqz p0, :cond_0

    .line 42
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    :goto_0
    move-object v1, p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    .line 43
    :goto_1
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Ljava/lang/String;

    .line 44
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;->DEFAULT:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    const/4 v5, 0x0

    const/16 v7, 0x2db

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p2

    .line 45
    invoke-static/range {v0 .. v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/C;Ljava/lang/String;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Lcom/sumsub/sns/internal/core/presentation/form/model/A;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/lang/String;I)Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    move-result-object p0

    .line 46
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    .line 47
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final a(Ljava/util/Map;Lcom/sumsub/sns/internal/core/presentation/form/model/C;)Lcom/sumsub/sns/internal/core/presentation/form/model/C;
    .locals 8

    .line 91
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->f:Ljava/lang/String;

    .line 92
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/sumsub/sns/internal/core/presentation/form/model/A;

    const/4 v6, 0x0

    const/16 v7, 0x3bf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/C;Ljava/lang/String;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Lcom/sumsub/sns/internal/core/presentation/form/model/A;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/lang/String;I)Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    move-result-object p0

    .line 93
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    .line 94
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final a(Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Lcom/sumsub/sns/internal/core/presentation/form/model/K;)Lcom/sumsub/sns/internal/core/presentation/form/model/K;
    .locals 9

    if-eqz p0, :cond_5

    .line 104
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->f:Ljava/util/List;

    if-eqz v0, :cond_4

    .line 105
    invoke-interface {v0, p0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result p0

    .line 106
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->j:Ljava/util/List;

    .line 107
    new-instance v4, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_1

    .line 109
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    if-ne p0, v1, :cond_2

    move-object v2, p1

    .line 110
    :cond_2
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    const/16 v8, 0x7bf

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    .line 111
    invoke-static/range {v1 .. v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/K;Ljava/util/List;Ljava/lang/CharSequence;Ljava/util/List;Ljava/util/ArrayList;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/util/Map;I)Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    move-result-object p0

    move-object v0, v1

    goto :goto_2

    :cond_4
    move-object v0, p2

    move-object p0, v0

    goto :goto_2

    :cond_5
    move-object v0, p2

    const/4 v6, 0x0

    const/16 v7, 0x6ff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p1

    .line 112
    invoke-static/range {v0 .. v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/K;Ljava/util/List;Ljava/lang/CharSequence;Ljava/util/List;Ljava/util/ArrayList;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/util/Map;I)Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    move-result-object p0

    .line 113
    :goto_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    .line 114
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final a(Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/model/K;)Lcom/sumsub/sns/internal/core/presentation/form/model/K;
    .locals 10

    if-eqz p0, :cond_4

    .line 115
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->k:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 116
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 117
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/form/model/A;

    .line 118
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/form/model/A;->a:Ljava/lang/String;

    .line 119
    invoke-static {v3, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 120
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 121
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v6, v1

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v1, 0x0

    goto :goto_1

    :goto_3
    const/4 v8, 0x0

    const/16 v9, 0x77f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    .line 122
    invoke-static/range {v2 .. v9}, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/K;Ljava/util/List;Ljava/lang/CharSequence;Ljava/util/List;Ljava/util/ArrayList;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/util/Map;I)Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    move-result-object p0

    move-object v0, v2

    .line 123
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    .line 124
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    return-object p0

    :cond_4
    move-object v0, p1

    const/4 v6, 0x0

    const/16 v7, 0x77f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 125
    invoke-static/range {v0 .. v7}, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/K;Ljava/util/List;Ljava/lang/CharSequence;Ljava/util/List;Ljava/util/ArrayList;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/util/Map;I)Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    move-result-object p0

    .line 126
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    .line 127
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final a(Ljava/util/List;Ljava/util/List;Lcom/sumsub/sns/internal/core/presentation/form/model/K;)Lcom/sumsub/sns/internal/core/presentation/form/model/K;
    .locals 9

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 48
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->zip(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 49
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 51
    check-cast v2, Lkotlin/Pair;

    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 52
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    if-eqz v2, :cond_0

    .line 53
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 54
    :cond_2
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    :cond_3
    move-object v7, v0

    if-eqz v7, :cond_5

    .line 55
    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 58
    check-cast v1, Ljava/lang/String;

    .line 59
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;->DEFAULT:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 60
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    :goto_3
    move-object v4, v0

    goto :goto_4

    .line 61
    :cond_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_3

    :goto_4
    const/4 v6, 0x0

    const/16 v8, 0x5bb

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v1, p2

    .line 62
    invoke-static/range {v1 .. v8}, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/K;Ljava/util/List;Ljava/lang/CharSequence;Ljava/util/List;Ljava/util/ArrayList;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/util/Map;I)Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    move-result-object p0

    .line 63
    iget-object p1, v1, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    .line 64
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final a(Ljava/util/Map;Lcom/sumsub/sns/internal/core/presentation/form/model/K;)Lcom/sumsub/sns/internal/core/presentation/form/model/K;
    .locals 10

    .line 95
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->f:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 96
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 97
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 98
    check-cast v2, Ljava/lang/String;

    .line 99
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/form/model/A;

    if-eqz v2, :cond_0

    .line 100
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    move-object v6, v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    goto :goto_1

    :goto_2
    const/4 v8, 0x0

    const/16 v9, 0x77f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    .line 101
    invoke-static/range {v2 .. v9}, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/K;Ljava/util/List;Ljava/lang/CharSequence;Ljava/util/List;Ljava/util/ArrayList;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;Ljava/util/Map;I)Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    move-result-object p0

    .line 102
    iget-object p1, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    .line 103
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/List;
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0xa

    .line 2
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    .line 3
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_1

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    .line 5
    move-object v6, v5

    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/model/A;

    .line 6
    iget-object v6, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/A;->a:Ljava/lang/String;

    .line 7
    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    .line 9
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/form/n;

    invoke-direct {v1, v2}, Lcom/sumsub/sns/internal/core/presentation/form/n;-><init>(Ljava/util/Map;)V

    new-instance v4, Lcom/sumsub/sns/internal/core/presentation/form/o;

    invoke-direct {v4, v2}, Lcom/sumsub/sns/internal/core/presentation/form/o;-><init>(Ljava/util/Map;)V

    .line 10
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    return-object p0

    .line 11
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v5

    :goto_2
    if-ge v3, v5, :cond_b

    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v3, v3, 0x1

    .line 13
    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 14
    iget-object v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/h;->d:Ljava/util/List;

    .line 15
    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 17
    check-cast v9, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 18
    instance-of v10, v9, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    const/4 v11, 0x0

    if-eqz v10, :cond_5

    move-object v10, v9

    check-cast v10, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    .line 19
    iget-object v12, v10, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->f:Ljava/lang/String;

    .line 20
    invoke-static {p1, v12}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    move-object v11, v9

    .line 21
    :cond_3
    check-cast v11, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    if-eqz v11, :cond_4

    .line 22
    invoke-interface {v1, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    if-eqz v9, :cond_4

    goto :goto_5

    :cond_4
    move-object v9, v10

    goto :goto_5

    .line 23
    :cond_5
    instance-of v10, v9, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    if-eqz v10, :cond_9

    move-object v10, v9

    check-cast v10, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    .line 24
    iget-object v12, v10, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->f:Ljava/util/List;

    if-eqz v12, :cond_8

    .line 25
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_4

    .line 26
    :cond_6
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 27
    invoke-interface {p1, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    move-object v11, v9

    .line 28
    :cond_8
    :goto_4
    check-cast v11, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    if-eqz v11, :cond_4

    .line 29
    invoke-interface {v4, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    if-eqz v9, :cond_4

    .line 30
    :cond_9
    :goto_5
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 31
    :cond_a
    iget v7, v6, Lcom/sumsub/sns/internal/core/presentation/form/h;->a:I

    iget-object v9, v6, Lcom/sumsub/sns/internal/core/presentation/form/h;->b:Ljava/lang/String;

    iget-object v6, v6, Lcom/sumsub/sns/internal/core/presentation/form/h;->c:Ljava/lang/String;

    .line 32
    new-instance v10, Lcom/sumsub/sns/internal/core/presentation/form/h;

    invoke-direct {v10, v7, v9, v6, v8}, Lcom/sumsub/sns/internal/core/presentation/form/h;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 33
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_b
    return-object v2
.end method

.method public static final a(Ljava/util/List;Lcom/sumsub/sns/internal/core/presentation/form/FieldId;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 34
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/form/t;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/presentation/form/t;-><init>()V

    .line 35
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/form/u;

    invoke-direct {v1, p2}, Lcom/sumsub/sns/internal/core/presentation/form/u;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p1, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/form/m;->a(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Ljava/util/List;Lcom/sumsub/sns/internal/core/presentation/form/FieldId;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;)Ljava/util/List;
    .locals 2

    .line 65
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 66
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/form/p;

    invoke-direct {v0, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/form/p;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;)V

    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/form/q;

    invoke-direct {v1, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/form/q;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;)V

    invoke-static {p0, p1, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/form/m;->a(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Ljava/util/List;Lcom/sumsub/sns/internal/core/presentation/form/FieldId;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 2

    if-eqz p3, :cond_1

    .line 39
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 40
    :cond_0
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 41
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/form/r;

    invoke-direct {v0, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/form/r;-><init>(Ljava/util/List;Ljava/util/List;)V

    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/form/s;

    invoke-direct {v1, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/form/s;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-static {p0, p1, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/form/m;->a(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static final a(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 9

    .line 71
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 72
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 74
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 75
    iget-object v3, v2, Lcom/sumsub/sns/internal/core/presentation/form/h;->d:Ljava/util/List;

    .line 76
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 78
    check-cast v5, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 79
    instance-of v6, v5, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    move-object v6, v5

    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    .line 80
    invoke-static {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/f0;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    move-result-object v8

    invoke-interface {p1, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move-object v7, v5

    .line 81
    :cond_1
    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    if-eqz v7, :cond_2

    .line 82
    invoke-interface {p2, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v5, v6

    goto :goto_2

    .line 83
    :cond_3
    instance-of v6, v5, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    if-eqz v6, :cond_5

    move-object v6, v5

    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    .line 84
    invoke-static {v6}, Lcom/sumsub/sns/internal/core/presentation/form/model/f0;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    move-result-object v8

    invoke-interface {p1, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move-object v7, v5

    .line 85
    :cond_4
    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    if-eqz v7, :cond_2

    .line 86
    invoke-interface {p3, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    if-eqz v5, :cond_2

    .line 87
    :cond_5
    :goto_2
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 88
    :cond_6
    iget v3, v2, Lcom/sumsub/sns/internal/core/presentation/form/h;->a:I

    iget-object v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/h;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/form/h;->c:Ljava/lang/String;

    .line 89
    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/form/h;

    invoke-direct {v6, v3, v5, v2, v4}, Lcom/sumsub/sns/internal/core/presentation/form/h;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 90
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    return-object v0
.end method
