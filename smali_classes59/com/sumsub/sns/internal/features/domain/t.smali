.class public final Lcom/sumsub/sns/internal/features/domain/t;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final b:Lcom/sumsub/sns/internal/features/domain/j;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/j;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/t;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/t;->b:Lcom/sumsub/sns/internal/features/domain/j;

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
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    instance-of v4, v3, Lcom/sumsub/sns/internal/features/domain/r;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/sumsub/sns/internal/features/domain/r;

    iget v5, v4, Lcom/sumsub/sns/internal/features/domain/r;->c:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/sumsub/sns/internal/features/domain/r;->c:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/sumsub/sns/internal/features/domain/r;

    invoke-direct {v4, v0, v3}, Lcom/sumsub/sns/internal/features/domain/r;-><init>(Lcom/sumsub/sns/internal/features/domain/t;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v3, v4, Lcom/sumsub/sns/internal/features/domain/r;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 1
    iget v6, v4, Lcom/sumsub/sns/internal/features/domain/r;->c:I

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_2

    if-ne v6, v8, :cond_1

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "resolveDocumentSideness for "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " and "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 3
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 4
    iget-object v6, v6, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    const-string v9, "DocCapture"

    const/4 v10, 0x0

    invoke-virtual {v6, v9, v3, v10}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz v1, :cond_d

    .line 6
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/domain/t;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a()Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-result-object v3

    if-eqz v3, :cond_d

    .line 7
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/h;->e:Ljava/util/Map;

    if-eqz v3, :cond_d

    .line 8
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 9
    new-instance v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object v3, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 10
    invoke-static {v6, v8, v7}, Lcom/sumsub/sns/internal/core/presentation/intro/a;->a(Ljava/util/List;II)Ljava/util/Iterator;

    move-result-object v3

    .line 11
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    move-object v11, v3

    check-cast v11, Lkotlin/collections/IntIterator;

    invoke-virtual {v11}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v11

    .line 12
    iget-object v12, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v12, Ljava/util/Map;

    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Ljava/util/Map;

    if-eqz v12, :cond_3

    check-cast v11, Ljava/util/Map;

    goto :goto_2

    :cond_3
    move-object v11, v10

    :goto_2
    if-eqz v11, :cond_d

    .line 13
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_4
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    .line 15
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/lang/String;

    if-nez v15, :cond_5

    move-object v14, v10

    :cond_5
    check-cast v14, Ljava/lang/String;

    if-nez v14, :cond_6

    goto :goto_4

    .line 16
    :cond_6
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_7

    move-object v13, v10

    :cond_7
    if-nez v13, :cond_8

    :goto_4
    move-object v13, v10

    goto :goto_5

    .line 17
    :cond_8
    invoke-static {v14, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    :goto_5
    if-eqz v13, :cond_4

    .line 18
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 19
    :cond_9
    invoke-static {v12}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v11

    if-nez v11, :cond_a

    goto :goto_6

    .line 20
    :cond_a
    iput-object v11, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_1

    .line 21
    :cond_b
    iget-object v3, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Ljava/util/Map;

    if-nez v6, :cond_c

    move-object v3, v10

    :cond_c
    check-cast v3, Ljava/util/Map;

    goto :goto_7

    :cond_d
    :goto_6
    move-object v3, v10

    :goto_7
    if-eqz v2, :cond_18

    if-eqz v3, :cond_1a

    .line 22
    const-string v1, "doubleSided"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 24
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 25
    invoke-static {v1, v8, v7}, Lcom/sumsub/sns/internal/core/presentation/intro/a;->a(Ljava/util/List;II)Ljava/util/Iterator;

    move-result-object v3

    .line 26
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_16

    move-object v4, v3

    check-cast v4, Lkotlin/collections/IntIterator;

    invoke-virtual {v4}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v4

    .line 27
    iget-object v5, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/util/Map;

    if-eqz v5, :cond_e

    check-cast v4, Ljava/util/Map;

    goto :goto_9

    :cond_e
    move-object v4, v10

    :goto_9
    if-eqz v4, :cond_1a

    .line 28
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 29
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_f
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 30
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    instance-of v11, v9, Ljava/lang/String;

    if-nez v11, :cond_10

    move-object v9, v10

    :cond_10
    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_11

    goto :goto_b

    .line 31
    :cond_11
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_12

    move-object v6, v10

    :cond_12
    if-nez v6, :cond_13

    :goto_b
    move-object v6, v10

    goto :goto_c

    .line 32
    :cond_13
    invoke-static {v9, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    :goto_c
    if-eqz v6, :cond_f

    .line 33
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 34
    :cond_14
    invoke-static {v5}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v4

    if-nez v4, :cond_15

    goto :goto_f

    .line 35
    :cond_15
    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_8

    .line 36
    :cond_16
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Boolean;

    if-nez v2, :cond_17

    goto :goto_d

    :cond_17
    move-object v10, v1

    :goto_d
    check-cast v10, Ljava/lang/Boolean;

    goto :goto_f

    :cond_18
    if-eqz v1, :cond_1a

    .line 37
    iput v8, v4, Lcom/sumsub/sns/internal/features/domain/r;->c:I

    move-object/from16 v2, p1

    invoke-virtual {v0, v2, v1, v3, v4}, Lcom/sumsub/sns/internal/features/domain/t;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_19

    return-object v5

    :cond_19
    :goto_e
    move-object v10, v3

    check-cast v10, Ljava/lang/Boolean;

    .line 38
    :cond_1a
    :goto_f
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b

    sget-object v1, Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;->DOUBLE:Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    return-object v1

    .line 39
    :cond_1b
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    sget-object v1, Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;->SINGLE:Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    return-object v1

    .line 40
    :cond_1c
    sget-object v1, Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;->UNKNOWN:Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    return-object v1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p4, Lcom/sumsub/sns/internal/features/domain/s;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/sumsub/sns/internal/features/domain/s;

    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/s;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/s;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/s;

    invoke-direct {v0, p0, p4}, Lcom/sumsub/sns/internal/features/domain/s;-><init>(Lcom/sumsub/sns/internal/features/domain/t;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p4, v0, Lcom/sumsub/sns/internal/features/domain/s;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 41
    iget v2, v0, Lcom/sumsub/sns/internal/features/domain/s;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p3, v0, Lcom/sumsub/sns/internal/features/domain/s;->a:Ljava/util/Map;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 42
    iget-object p4, p0, Lcom/sumsub/sns/internal/features/domain/t;->b:Lcom/sumsub/sns/internal/features/domain/j;

    iput-object p3, v0, Lcom/sumsub/sns/internal/features/domain/s;->a:Ljava/util/Map;

    iput v3, v0, Lcom/sumsub/sns/internal/features/domain/s;->d:I

    invoke-virtual {p4, p1, p2, v0}, Lcom/sumsub/sns/internal/features/domain/j;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    .line 43
    :cond_3
    :goto_1
    check-cast p4, Ljava/lang/Iterable;

    .line 44
    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p4, p2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    const/4 v0, 0x0

    if-eqz p4, :cond_f

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 46
    check-cast p4, Ljava/lang/String;

    if-eqz p3, :cond_e

    .line 47
    const-string v1, "doubleSided"

    filled-new-array {p4, v1}, [Ljava/lang/String;

    move-result-object p4

    .line 48
    invoke-static {p4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p4

    .line 49
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p3, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    const/4 v2, 0x0

    .line 50
    invoke-static {p4, v3, v2}, Lcom/sumsub/sns/internal/core/presentation/intro/a;->a(Ljava/util/List;II)Ljava/util/Iterator;

    move-result-object v2

    .line 51
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    move-object v4, v2

    check-cast v4, Lkotlin/collections/IntIterator;

    invoke-virtual {v4}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v4

    .line 52
    iget-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    invoke-interface {p4, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/util/Map;

    if-eqz v5, :cond_4

    check-cast v4, Ljava/util/Map;

    goto :goto_4

    :cond_4
    move-object v4, v0

    :goto_4
    if-eqz v4, :cond_e

    .line 53
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 54
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 55
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_6

    move-object v7, v0

    :cond_6
    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_7

    goto :goto_6

    .line 56
    :cond_7
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_8

    move-object v6, v0

    :cond_8
    if-nez v6, :cond_9

    :goto_6
    move-object v6, v0

    goto :goto_7

    .line 57
    :cond_9
    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    :goto_7
    if-eqz v6, :cond_5

    .line 58
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 59
    :cond_a
    invoke-static {v5}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v4

    if-nez v4, :cond_b

    goto :goto_9

    .line 60
    :cond_b
    iput-object v4, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_3

    .line 61
    :cond_c
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-static {p4}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {v1, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    instance-of v1, p4, Ljava/lang/Boolean;

    if-nez v1, :cond_d

    goto :goto_8

    :cond_d
    move-object v0, p4

    :goto_8
    check-cast v0, Ljava/lang/Boolean;

    .line 62
    :cond_e
    :goto_9
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 63
    :cond_f
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    .line 64
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p2

    if-ne p2, v3, :cond_10

    goto :goto_a

    :cond_10
    move-object p1, v0

    :goto_a
    if-eqz p1, :cond_11

    .line 65
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1

    :cond_11
    return-object v0
.end method
