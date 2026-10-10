.class public abstract Ljumio/core/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/jumio/commons/camera/ExposureLevel;)Lcom/jumio/commons/camera/CaptureSettings;
    .locals 7

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lcom/jumio/commons/camera/CaptureSettings;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/jumio/commons/camera/CaptureSettings;-><init>(Lcom/jumio/commons/camera/ExposureLevel;Lcom/jumio/commons/camera/WhiteBalance;Lcom/jumio/commons/camera/LensDistance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final a(Lcom/jumio/commons/camera/LensDistance;)Lcom/jumio/commons/camera/CaptureSettings;
    .locals 7

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v1, Lcom/jumio/commons/camera/CaptureSettings;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/jumio/commons/camera/CaptureSettings;-><init>(Lcom/jumio/commons/camera/ExposureLevel;Lcom/jumio/commons/camera/WhiteBalance;Lcom/jumio/commons/camera/LensDistance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final a(Lcom/jumio/commons/camera/WhiteBalance;)Lcom/jumio/commons/camera/CaptureSettings;
    .locals 7

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v1, Lcom/jumio/commons/camera/CaptureSettings;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Lcom/jumio/commons/camera/CaptureSettings;-><init>(Lcom/jumio/commons/camera/ExposureLevel;Lcom/jumio/commons/camera/WhiteBalance;Lcom/jumio/commons/camera/LensDistance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static a(ILjava/util/List;Lkotlin/enums/EnumEntries;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;
    .locals 8

    .line 89
    new-instance v0, Ljumio/core/f3;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ljumio/core/f3;-><init>(II)V

    .line 90
    invoke-static {p0, v0, p1}, Ljumio/core/g3;->a(ILjumio/core/f3;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    .line 91
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 92
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 93
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x2

    .line 94
    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    .line 95
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 96
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v4, v2

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-gez v4, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 97
    :cond_1
    move-object v7, v5

    check-cast v7, Ljava/lang/Enum;

    if-ne v4, v0, :cond_2

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    move v4, v6

    goto :goto_1

    .line 98
    :cond_3
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Enum;

    if-eqz v0, :cond_4

    .line 99
    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jumio/commons/camera/CaptureSettings;

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_0

    .line 100
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object p1
.end method

.method public static a(Ljumio/core/V;Ljava/lang/String;)Ljumio/core/W;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "config"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 4
    const-string v3, "-"

    const-string v4, ""

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    move v4, v3

    .line 6
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 7
    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x10

    invoke-static {v5, v6}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 8
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 9
    :cond_1
    iget-object v1, v0, Ljumio/core/V;->f:Ljumio/core/Z;

    .line 10
    invoke-static {}, Lcom/jumio/commons/camera/LensDistance;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x2

    sub-int/2addr v4, v5

    .line 11
    new-instance v6, Ljumio/core/f3;

    iget v7, v1, Ljumio/core/Z;->a:I

    iget v1, v1, Ljumio/core/Z;->b:I

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-direct {v6, v7, v1}, Ljumio/core/f3;-><init>(II)V

    .line 12
    iget-object v1, v0, Ljumio/core/V;->e:Ljumio/core/Z;

    .line 13
    invoke-static {}, Lcom/jumio/commons/camera/ExposureLevel;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v5

    .line 14
    new-instance v7, Ljumio/core/f3;

    iget v8, v1, Ljumio/core/Z;->a:I

    iget v1, v1, Ljumio/core/Z;->b:I

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-direct {v7, v8, v1}, Ljumio/core/f3;-><init>(II)V

    .line 15
    iget-object v1, v0, Ljumio/core/V;->g:Ljumio/core/Z;

    .line 16
    invoke-static {}, Lcom/jumio/commons/camera/WhiteBalance;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v5

    .line 17
    new-instance v8, Ljumio/core/f3;

    iget v9, v1, Ljumio/core/Z;->a:I

    iget v1, v1, Ljumio/core/Z;->b:I

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-direct {v8, v9, v1}, Ljumio/core/f3;-><init>(II)V

    .line 18
    filled-new-array {v6, v7, v8}, [Ljumio/core/f3;

    move-result-object v1

    .line 19
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 20
    const-string v4, "bounds"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "nonce"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    .line 22
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    move v8, v3

    :goto_1
    if-ge v8, v6, :cond_2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 23
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v9, v3

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v11, v9, 0x1

    if-gez v9, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    .line 24
    rem-int/2addr v9, v6

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    add-int/2addr v12, v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v7, v9, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move v9, v11

    goto :goto_2

    .line 25
    :cond_4
    new-instance v6, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/4 v11, 0x1

    if-eqz v10, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 27
    check-cast v10, Ljumio/core/f3;

    .line 28
    iget v12, v10, Ljumio/core/f3;->b:I

    .line 29
    iget v10, v10, Ljumio/core/f3;->a:I

    sub-int/2addr v12, v10

    add-int/2addr v12, v11

    .line 30
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 31
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 32
    :cond_5
    invoke-static {v7, v6}, Lkotlin/collections/CollectionsKt;->zip(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    .line 33
    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 35
    check-cast v9, Lkotlin/Pair;

    invoke-virtual {v9}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-virtual {v9}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    .line 36
    rem-int/2addr v10, v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 37
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 38
    :cond_6
    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt;->zip(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    .line 39
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 41
    check-cast v7, Lkotlin/Pair;

    invoke-virtual {v7}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljumio/core/f3;

    invoke-virtual {v7}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .line 42
    iget v9, v9, Ljumio/core/f3;->a:I

    add-int/2addr v9, v7

    .line 43
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 44
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 45
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    div-int/lit8 v1, v1, 0x3

    .line 46
    invoke-virtual {v2, v3, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v7

    mul-int/lit8 v9, v1, 0x2

    .line 47
    invoke-virtual {v2, v1, v9}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    .line 48
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-virtual {v2, v9, v10}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v9

    .line 49
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-static {}, Lcom/jumio/commons/camera/LensDistance;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v12

    new-instance v13, Llg0/b0;

    invoke-direct {v13}, Llg0/b0;-><init>()V

    invoke-static {v10, v7, v12, v13}, Ljumio/core/Y;->a(ILjava/util/List;Lkotlin/enums/EnumEntries;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object v7

    .line 50
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-static {}, Lcom/jumio/commons/camera/ExposureLevel;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v12

    new-instance v13, Llg0/c0;

    invoke-direct {v13}, Llg0/c0;-><init>()V

    invoke-static {v10, v1, v12, v13}, Ljumio/core/Y;->a(ILjava/util/List;Lkotlin/enums/EnumEntries;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object v1

    .line 51
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {}, Lcom/jumio/commons/camera/WhiteBalance;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v6

    new-instance v10, Llg0/d0;

    invoke-direct {v10}, Llg0/d0;-><init>()V

    invoke-static {v5, v9, v6, v10}, Ljumio/core/Y;->a(ILjava/util/List;Lkotlin/enums/EnumEntries;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object v5

    .line 52
    invoke-static {v7, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    .line 53
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->getIndices(Ljava/util/Collection;)Lkotlin/ranges/IntRange;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    .line 54
    const-string v6, "numbers"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v4

    .line 56
    new-instance v6, Ljumio/core/f3;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v11

    invoke-direct {v6, v3, v7}, Ljumio/core/f3;-><init>(II)V

    .line 57
    invoke-static {v4, v6, v2}, Ljumio/core/g3;->a(ILjumio/core/f3;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 58
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 60
    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    .line 61
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 62
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 63
    :cond_8
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v4, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v3, 0x1

    if-gez v3, :cond_9

    .line 65
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_9
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 66
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lcom/jumio/commons/camera/CaptureSettings;

    .line 67
    invoke-virtual {v9}, Lcom/jumio/commons/camera/CaptureSettings;->getLevel()Lcom/jumio/commons/camera/ExposureLevel;

    move-result-object v5

    sget-object v7, Lcom/jumio/commons/camera/ExposureLevel;->AUTO:Lcom/jumio/commons/camera/ExposureLevel;

    if-eq v5, v7, :cond_a

    .line 68
    iget-object v5, v0, Ljumio/core/V;->e:Ljumio/core/Z;

    goto :goto_8

    .line 69
    :cond_a
    invoke-virtual {v9}, Lcom/jumio/commons/camera/CaptureSettings;->getDistance()Lcom/jumio/commons/camera/LensDistance;

    move-result-object v5

    sget-object v7, Lcom/jumio/commons/camera/LensDistance;->AUTO:Lcom/jumio/commons/camera/LensDistance;

    if-eq v5, v7, :cond_b

    .line 70
    iget-object v5, v0, Ljumio/core/V;->f:Ljumio/core/Z;

    goto :goto_8

    .line 71
    :cond_b
    invoke-virtual {v9}, Lcom/jumio/commons/camera/CaptureSettings;->getWhiteBalance()Lcom/jumio/commons/camera/WhiteBalance;

    move-result-object v5

    sget-object v7, Lcom/jumio/commons/camera/WhiteBalance;->AUTO:Lcom/jumio/commons/camera/WhiteBalance;

    if-eq v5, v7, :cond_c

    .line 72
    iget-object v5, v0, Ljumio/core/V;->g:Ljumio/core/Z;

    goto :goto_8

    .line 73
    :cond_c
    new-instance v10, Ljumio/core/Z;

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 74
    invoke-direct/range {v10 .. v16}, Ljumio/core/Z;-><init>(IIFFJ)V

    move-object v5, v10

    .line 75
    :goto_8
    new-instance v7, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    .line 76
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    iget-object v10, v0, Ljumio/core/V;->d:Ljava/lang/String;

    .line 78
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v10, 0x5f

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 79
    iget v10, v5, Ljumio/core/Z;->c:F

    .line 80
    iget v11, v5, Ljumio/core/Z;->d:F

    .line 81
    iget-wide v12, v5, Ljumio/core/Z;->e:J

    const/16 v15, 0x20

    const/16 v16, 0x0

    const/4 v14, 0x0

    .line 82
    invoke-direct/range {v7 .. v16}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;-><init>(Ljava/lang/String;Lcom/jumio/commons/camera/CaptureSettings;FFJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 83
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v6

    goto :goto_7

    .line 84
    :cond_d
    new-instance v1, Ljumio/core/W;

    .line 85
    iget-boolean v3, v0, Ljumio/core/V;->b:Z

    .line 86
    iget-boolean v4, v0, Ljumio/core/V;->c:Z

    .line 87
    iget-object v0, v0, Ljumio/core/V;->d:Ljava/lang/String;

    .line 88
    invoke-direct {v1, v3, v4, v0, v2}, Ljumio/core/W;-><init>(ZZLjava/lang/String;Ljava/util/List;)V

    return-object v1
.end method
