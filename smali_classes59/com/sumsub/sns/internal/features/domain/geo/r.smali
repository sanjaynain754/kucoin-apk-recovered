.class public final Lcom/sumsub/sns/internal/features/domain/geo/r;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/common/a;

.field public final c:Lcom/sumsub/sns/internal/features/domain/geo/i;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/domain/geo/i;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/geo/r;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/geo/r;->b:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/domain/geo/r;->c:Lcom/sumsub/sns/internal/features/domain/geo/i;

    .line 10
    return-void
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


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/geo/a;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/domain/geo/p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/domain/geo/p;

    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/geo/p;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/geo/p;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/geo/p;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/domain/geo/p;-><init>(Lcom/sumsub/sns/internal/features/domain/geo/r;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/domain/geo/p;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 5
    iget v2, v0, Lcom/sumsub/sns/internal/features/domain/geo/p;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 6
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/geo/r;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    iput v3, v0, Lcom/sumsub/sns/internal/features/domain/geo/p;->c:I

    .line 7
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 8
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 9
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 10
    sget-object v2, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 11
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/geo/a;->a:[B

    .line 12
    sget-object p1, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    const-string v4, "application/json"

    invoke-virtual {p1, v4}, Lokhttp3/MediaType$Companion;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lokhttp3/RequestBody$Companion;->create$default(Lokhttp3/RequestBody$Companion;[BLokhttp3/MediaType;IIILjava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-interface {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 13
    :cond_3
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/geo/d;

    .line 14
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/model/geo/d;->a:Ljava/util/List;

    if-nez p1, :cond_4

    .line 15
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 16
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string/jumbo v3, "uncertainGpsLocation"

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    .line 18
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 19
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 20
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    .line 21
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/geo/n;

    .line 22
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/geo/d;->c:Ljava/lang/Long;

    .line 23
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/domain/geo/n;-><init>(Ljava/util/ArrayList;Ljava/lang/Long;)V

    return-object p1

    .line 24
    :cond_7
    invoke-interface {p1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 25
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/geo/m;

    .line 26
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/geo/d;->c:Ljava/lang/Long;

    .line 27
    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/domain/geo/m;-><init>(Ljava/lang/Long;)V

    return-object p1

    .line 28
    :cond_8
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/model/geo/d;->b:Ljava/util/Map;

    if-nez p1, :cond_9

    .line 29
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    .line 30
    :cond_9
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/geo/l;

    .line 31
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/geo/d;->c:Ljava/lang/Long;

    .line 32
    invoke-direct {v0, p1, p2}, Lcom/sumsub/sns/internal/features/domain/geo/l;-><init>(Ljava/util/Map;Ljava/lang/Long;)V

    return-object v0
.end method

.method public final a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/geo/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/domain/geo/q;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/domain/geo/q;

    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/geo/q;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/geo/q;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/geo/q;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/domain/geo/q;-><init>(Lcom/sumsub/sns/internal/features/domain/geo/r;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/domain/geo/q;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/domain/geo/q;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    :try_start_1
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/domain/geo/r;->c:Lcom/sumsub/sns/internal/features/domain/geo/i;

    invoke-virtual {p3, p1, p2}, Lcom/sumsub/sns/internal/features/domain/geo/i;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/geo/e;)Lcom/sumsub/sns/internal/features/data/model/geo/a;

    move-result-object p1

    .line 3
    iput v3, v0, Lcom/sumsub/sns/internal/features/domain/geo/q;->c:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/domain/geo/r;->a(Lcom/sumsub/sns/internal/features/data/model/geo/a;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/features/domain/geo/o;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p3

    .line 4
    :goto_2
    new-instance p2, Lcom/sumsub/sns/internal/features/domain/geo/k;

    iget-object p3, p0, Lcom/sumsub/sns/internal/features/domain/geo/r;->b:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    invoke-static {p3, p1}, Lcom/sumsub/sns/internal/core/domain/base/c;->a(Lcom/sumsub/sns/internal/features/data/repository/common/a;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/domain/geo/k;-><init>(Ljava/lang/Exception;)V

    return-object p2
.end method
