.class public final Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/F;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
    .line 6
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
.end method

.method public static a(Ljava/util/List;)Ljava/util/Set;
    .locals 6

    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;

    .line 13
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/d2;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/S0;

    .line 14
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->b:Ljava/lang/String;

    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/data/model/common/S0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/d2;

    move-result-object v2

    .line 16
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/W1;->b:Lcom/sumsub/sns/internal/features/data/model/common/W1;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;

    if-nez v0, :cond_2

    .line 17
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p0

    return-object p0

    .line 18
    :cond_2
    iget-boolean p0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->d:Z

    if-nez p0, :cond_3

    .line 19
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p0

    return-object p0

    .line 20
    :cond_3
    iget-object p0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/w;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/p;

    .line 21
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;

    if-eqz v0, :cond_4

    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;

    goto :goto_1

    :cond_4
    move-object p0, v1

    :goto_1
    if-eqz p0, :cond_a

    .line 22
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;->a:Ljava/util/List;

    if-nez p0, :cond_5

    goto :goto_4

    .line 23
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v2, 0x0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 25
    :cond_6
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/R3;

    .line 26
    iget-object v5, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/R3;->a:Ljava/lang/String;

    if-eqz v5, :cond_7

    .line 27
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/R3;->b:Ljava/lang/String;

    if-eqz v3, :cond_7

    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_3

    :cond_7
    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_8

    .line 29
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    move v2, v4

    goto :goto_2

    .line 30
    :cond_9
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    .line 31
    :cond_a
    :goto_4
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/util/List;ILjava/lang/Integer;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 2
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/data/model/common/U1;-><init>(I)V

    const/4 v4, 0x0

    const/16 v5, 0x1fc

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 3
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/data/model/common/y;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/d2;ZLjava/lang/String;Ljava/lang/Boolean;I)V

    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 5
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    invoke-direct {v2, p1}, Lcom/sumsub/sns/internal/features/data/model/common/Y1;-><init>(I)V

    const/4 v5, 0x0

    const/16 v6, 0x1fc

    const/4 v3, 0x1

    .line 6
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/data/model/common/y;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/d2;ZLjava/lang/String;Ljava/lang/Boolean;I)V

    if-eqz p2, :cond_1

    .line 7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-lez p1, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-lt p1, v2, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-interface {p0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void

    .line 10
    :cond_1
    :goto_0
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
