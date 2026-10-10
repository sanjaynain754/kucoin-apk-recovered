.class public final Lcom/sumsub/sns/internal/features/presentation/utils/a;
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

.method public static a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;)Z
    .locals 3

    .line 7
    invoke-static {p0}, Lcom/sumsub/sns/internal/features/data/model/common/i;->j(Lcom/sumsub/sns/internal/features/data/model/common/h;)Ljava/lang/Boolean;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    return v0

    .line 8
    :cond_0
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/a;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;)Z

    move-result p0

    if-nez p0, :cond_4

    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    .line 9
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/i;

    .line 11
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/e;->b:Lcom/sumsub/sns/internal/features/presentation/utils/a;

    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/utils/a;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/i;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 12
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 13
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    const/4 p1, 0x1

    if-le p0, p1, :cond_4

    return p1

    :cond_4
    :goto_1
    return v0
.end method

.method public static a(Lcom/sumsub/sns/internal/features/data/model/common/p;)Z
    .locals 0

    .line 14
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a()Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    move-result-object p0

    if-nez p0, :cond_1

    .line 15
    sget-object p0, Lcom/sumsub/sns/internal/ff/a;->z:Lcom/sumsub/sns/internal/ff/core/a;

    .line 16
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static a(Lcom/sumsub/sns/internal/features/data/model/common/remote/i;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/i;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/c;->d:Ljava/util/List;

    if-eqz p0, :cond_2

    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 5
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/e;->c:Ljava/util/List;

    .line 6
    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    return v0
.end method
