.class public abstract Lcom/sumsub/sns/internal/features/domain/k0;
.super Lcom/sumsub/sns/internal/core/domain/base/b;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

.field public final c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/internal/core/domain/base/b;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/k0;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/domain/k0;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public static a(Lcom/sumsub/sns/internal/features/domain/k0;Lcom/sumsub/sns/internal/features/domain/f0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/domain/j0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/domain/j0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/j0;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/j0;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/j0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/domain/j0;-><init>(Lcom/sumsub/sns/internal/features/domain/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/domain/j0;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/domain/j0;->g:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_6

    if-eq v2, v7, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lcom/sumsub/sns/internal/features/domain/j0;->a:Lcom/sumsub/sns/internal/features/domain/k0;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_7

    :cond_3
    iget-object p0, v0, Lcom/sumsub/sns/internal/features/domain/j0;->a:Lcom/sumsub/sns/internal/features/domain/k0;

    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_4

    :cond_4
    iget-object p0, v0, Lcom/sumsub/sns/internal/features/domain/j0;->d:Ljava/lang/String;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/domain/j0;->c:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/domain/j0;->b:Lcom/sumsub/sns/internal/features/domain/f0;

    iget-object v6, v0, Lcom/sumsub/sns/internal/features/domain/j0;->a:Lcom/sumsub/sns/internal/features/domain/k0;

    :try_start_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object v7, p0

    move-object p0, v6

    goto/16 :goto_3

    :catch_1
    move-exception p0

    goto/16 :goto_8

    :cond_5
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/domain/j0;->b:Lcom/sumsub/sns/internal/features/domain/f0;

    iget-object p0, v0, Lcom/sumsub/sns/internal/features/domain/j0;->a:Lcom/sumsub/sns/internal/features/domain/k0;

    :try_start_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :cond_6
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    :try_start_4
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/k0;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/domain/j0;->a:Lcom/sumsub/sns/internal/features/domain/k0;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/domain/j0;->b:Lcom/sumsub/sns/internal/features/domain/f0;

    iput v7, v0, Lcom/sumsub/sns/internal/features/domain/j0;->g:I

    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p2, v7, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto/16 :goto_9

    .line 4
    :cond_7
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 5
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    move-result-object v2

    .line 6
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/j3;->b:Ljava/util/List;

    .line 7
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/domain/f0;->b:Ljava/lang/String;

    if-nez v7, :cond_c

    .line 8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_8
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v10}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getCountry()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_8

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    if-nez v10, :cond_a

    goto :goto_2

    :cond_9
    move-object v9, v8

    :cond_a
    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    if-eqz v9, :cond_b

    invoke-virtual {v9}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getCountry()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_c

    .line 9
    :cond_b
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->b()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_c

    const-string v7, "ATA"

    .line 10
    :cond_c
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/domain/j0;->a:Lcom/sumsub/sns/internal/features/domain/k0;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/domain/j0;->b:Lcom/sumsub/sns/internal/features/domain/f0;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/domain/j0;->c:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/domain/j0;->d:Ljava/lang/String;

    iput v6, v0, Lcom/sumsub/sns/internal/features/domain/j0;->g:I

    invoke-virtual {p0, v2, p1, v0}, Lcom/sumsub/sns/internal/features/domain/k0;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/domain/f0;Lcom/sumsub/sns/internal/features/domain/j0;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_d

    goto :goto_9

    :cond_d
    move-object v2, p1

    move-object p1, p2

    .line 11
    :goto_3
    iget-boolean p2, v2, Lcom/sumsub/sns/internal/features/domain/f0;->c:Z

    if-eqz p2, :cond_f

    .line 12
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/domain/j0;->a:Lcom/sumsub/sns/internal/features/domain/k0;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/domain/j0;->b:Lcom/sumsub/sns/internal/features/domain/f0;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/domain/j0;->c:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/domain/j0;->d:Ljava/lang/String;

    iput v5, v0, Lcom/sumsub/sns/internal/features/domain/j0;->g:I

    invoke-virtual {p0, v2, p1, v7, v0}, Lcom/sumsub/sns/internal/features/domain/k0;->b(Lcom/sumsub/sns/internal/features/domain/f0;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/j0;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_e

    goto :goto_9

    :cond_e
    :goto_4
    check-cast p2, Ljava/util/List;

    goto :goto_6

    .line 13
    :cond_f
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/domain/j0;->a:Lcom/sumsub/sns/internal/features/domain/k0;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/domain/j0;->b:Lcom/sumsub/sns/internal/features/domain/f0;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/domain/j0;->c:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/domain/j0;->d:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/domain/j0;->g:I

    invoke-virtual {p0, v2, p1, v7, v0}, Lcom/sumsub/sns/internal/features/domain/k0;->a(Lcom/sumsub/sns/internal/features/domain/f0;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/j0;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_10

    goto :goto_9

    .line 14
    :cond_10
    :goto_5
    check-cast p2, Ljava/util/List;

    .line 15
    :goto_6
    new-instance p1, Lcom/sumsub/sns/internal/features/data/model/common/Z;

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/data/model/common/Z;-><init>(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object p1

    :goto_7
    move-object v6, p0

    move-object p0, p1

    .line 16
    :goto_8
    iput-object v8, v0, Lcom/sumsub/sns/internal/features/domain/j0;->a:Lcom/sumsub/sns/internal/features/domain/k0;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/domain/j0;->b:Lcom/sumsub/sns/internal/features/domain/f0;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/domain/j0;->c:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/domain/j0;->d:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/domain/j0;->g:I

    .line 17
    iget-object p1, v6, Lcom/sumsub/sns/internal/core/domain/base/b;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 18
    invoke-static {p1, p0}, Lcom/sumsub/sns/internal/core/domain/base/c;->a(Lcom/sumsub/sns/internal/features/data/repository/common/a;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object p2

    if-ne p2, v1, :cond_11

    :goto_9
    return-object v1

    .line 19
    :cond_11
    :goto_a
    new-instance p0, Lcom/sumsub/sns/internal/features/data/model/common/Y;

    invoke-direct {p0, p2}, Lcom/sumsub/sns/internal/features/data/model/common/Y;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/internal/features/domain/k0;Ljava/util/List;Lcom/sumsub/sns/internal/features/domain/f0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/domain/i0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/domain/i0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/i0;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/i0;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/i0;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/domain/i0;-><init>(Lcom/sumsub/sns/internal/features/domain/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/domain/i0;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 20
    iget v2, v0, Lcom/sumsub/sns/internal/features/domain/i0;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/sumsub/sns/internal/features/domain/i0;->b:Ljava/util/Iterator;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/domain/i0;->a:Lcom/sumsub/sns/internal/features/domain/k0;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    :try_start_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v2, p3

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    .line 22
    iget-object v4, p2, Lcom/sumsub/sns/internal/features/domain/f0;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 23
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_4
    const/4 p3, 0x0

    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getResult()Lcom/sumsub/sns/internal/features/data/model/common/M;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 24
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/M;->d:Ljava/util/List;

    if-nez p1, :cond_6

    .line 25
    :cond_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 26
    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v5, p1

    move-object p1, p0

    move-object p0, v5

    :cond_7
    :goto_2
    :try_start_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    .line 27
    iget-object p3, p1, Lcom/sumsub/sns/internal/features/domain/k0;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/domain/i0;->a:Lcom/sumsub/sns/internal/features/domain/k0;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/domain/i0;->b:Ljava/util/Iterator;

    iput v3, v0, Lcom/sumsub/sns/internal/features/domain/i0;->e:I

    check-cast p3, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;

    invoke-virtual {p3, p2, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p2, v1, :cond_7

    return-object v1

    :goto_3
    move-object v5, p1

    move-object p1, p0

    move-object p0, v5

    .line 28
    :goto_4
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 29
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string p3, "Pre process error"

    invoke-virtual {p2, p0, p3, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    :cond_8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public abstract a(Lcom/sumsub/sns/internal/features/domain/f0;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/j0;)Ljava/lang/Object;
.end method

.method public a(Ljava/util/List;Lcom/sumsub/sns/internal/features/domain/f0;Lcom/sumsub/sns/internal/features/domain/j0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/sumsub/sns/internal/features/domain/k0;->a(Lcom/sumsub/sns/internal/features/domain/k0;Ljava/util/List;Lcom/sumsub/sns/internal/features/domain/f0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(Lcom/sumsub/sns/internal/features/domain/f0;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/j0;)Ljava/lang/Object;
.end method
