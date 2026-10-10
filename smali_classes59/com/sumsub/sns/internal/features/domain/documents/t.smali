.class public Lcom/sumsub/sns/internal/features/domain/documents/t;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/documents/t;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 6
    return-void
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
.end method

.method public static final a(Landroid/text/Spanned;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    if-eqz p1, :cond_0

    const/4 v4, 0x4

    const/4 v5, 0x0

    .line 31
    const-string/jumbo v1, "{docTypes}"

    const/4 v3, 0x0

    move-object v2, p0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/domain/documents/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/Object;
    .locals 12

    .line 2
    :try_start_0
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/domain/documents/p;->c:Ljava/util/List;

    .line 3
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/domain/documents/p;->d:Ljava/util/List;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v0, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v11, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 6
    check-cast v2, Ljava/lang/String;

    .line 7
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/domain/documents/t;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/data/model/common/g2;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/q2;

    move-result-object v2

    .line 8
    invoke-virtual {v2, p3, v11}, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    .line 9
    check-cast v3, Lcom/sumsub/sns/internal/core/domain/d;

    .line 10
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 11
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 12
    invoke-static {v2, v3}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_4

    .line 14
    :cond_0
    const-string v2, "\n"

    new-instance v7, Lcom/sumsub/sns/internal/features/domain/documents/a0;

    invoke-direct {v7}, Lcom/sumsub/sns/internal/features/domain/documents/a0;-><init>()V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    .line 15
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/documents/b0;

    invoke-direct {v0, p3}, Lcom/sumsub/sns/internal/features/domain/documents/b0;-><init>(Ljava/lang/String;)V

    .line 16
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    .line 17
    invoke-static {p2, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result p3

    const/16 v1, 0x10

    invoke-static {p3, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p3

    .line 18
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, p3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 19
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 20
    check-cast p3, Lcom/sumsub/sns/internal/features/domain/h0;

    .line 21
    iget-object v2, p3, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v2, :cond_3

    .line 22
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->d:Ljava/util/List;

    if-eqz v2, :cond_3

    .line 23
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    if-eqz p1, :cond_1

    .line 24
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->f(Lcom/sumsub/sns/internal/features/data/model/common/h;)Ljava/util/Map;

    move-result-object v3

    goto :goto_2

    :cond_1
    move-object v3, v11

    :goto_2
    invoke-virtual {p0, v2, v3}, Lcom/sumsub/sns/internal/features/domain/documents/t;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    if-eqz p1, :cond_4

    .line 25
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->f(Lcom/sumsub/sns/internal/features/data/model/common/h;)Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    move-object v2, v3

    goto :goto_3

    :cond_3
    move-object v2, v11

    .line 26
    :cond_4
    :goto_3
    iget-object p3, p3, Lcom/sumsub/sns/internal/features/domain/h0;->a:Ljava/lang/String;

    .line 27
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    .line 28
    invoke-virtual {p3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {v1, v2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 29
    :cond_5
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 30
    :goto_4
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    if-eqz p2, :cond_0

    .line 32
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    const-string p1, "default"

    return-object p1
.end method
