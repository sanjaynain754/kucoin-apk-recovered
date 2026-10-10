.class public abstract Lcom/sumsub/sns/internal/features/data/model/common/p;
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


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object v0

    .line 2
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/n;->a:Ljava/util/List;

    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 4
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 5
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/m;

    return-object v1
.end method

.method public abstract a()Lcom/sumsub/sns/internal/features/data/model/common/remote/c;
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->f()Lcom/sumsub/sns/internal/features/data/model/common/j;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/j;->a:Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Lcom/sumsub/sns/internal/features/data/model/common/X;)Ljava/util/List;
    .locals 2

    .line 3
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/m;->b:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/data/model/common/g2;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/q2;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0

    .line 10
    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public final d()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/n;->b:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/n;->d:Ljava/util/List;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Lcom/sumsub/sns/internal/features/data/model/common/j;
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public abstract i()Ljava/util/List;
.end method

.method public abstract j()Lcom/sumsub/sns/internal/features/data/model/common/l;
.end method

.method public abstract k()Lcom/sumsub/sns/internal/features/data/model/common/n;
.end method

.method public abstract l()Lcom/sumsub/sns/internal/features/data/model/common/j3;
.end method

.method public abstract m()Lcom/sumsub/sns/internal/features/data/model/common/o;
.end method

.method public final n()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->e:Lcom/sumsub/sns/internal/features/data/model/common/n3;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/n3;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    :goto_0
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;->Green:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public final o()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->e:Lcom/sumsub/sns/internal/features/data/model/common/n3;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/n3;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/o;->e:Lcom/sumsub/sns/internal/features/data/model/common/n3;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/data/model/common/n3;->e:Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 30
    .line 31
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;->Red:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    .line 32
    .line 33
    if-ne v0, v3, :cond_3

    .line 34
    .line 35
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Completed:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 36
    .line 37
    if-ne v2, v0, :cond_3

    .line 38
    .line 39
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;->Final:Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;

    .line 40
    .line 41
    if-eq v1, v0, :cond_2

    .line 42
    .line 43
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;->External:Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;

    .line 44
    .line 45
    if-ne v1, v0, :cond_3

    .line 46
    :cond_2
    const/4 v0, 0x1

    .line 47
    return v0

    .line 48
    :cond_3
    const/4 v0, 0x0

    .line 49
    return v0
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public final p()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->e:Lcom/sumsub/sns/internal/features/data/model/common/n3;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/n3;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/o;->e:Lcom/sumsub/sns/internal/features/data/model/common/n3;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/data/model/common/n3;->e:Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;

    .line 24
    .line 25
    :cond_1
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;->Red:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    .line 26
    .line 27
    if-ne v0, v2, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 34
    .line 35
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Completed:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 36
    .line 37
    if-ne v0, v2, :cond_2

    .line 38
    .line 39
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;->Retry:Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;

    .line 40
    .line 41
    if-ne v1, v0, :cond_2

    .line 42
    const/4 v0, 0x1

    .line 43
    return v0

    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    return v0
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
