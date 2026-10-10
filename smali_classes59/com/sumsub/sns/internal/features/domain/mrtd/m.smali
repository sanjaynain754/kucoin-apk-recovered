.class public final Lcom/sumsub/sns/internal/features/domain/mrtd/m;
.super Lcom/sumsub/sns/internal/features/domain/mrtd/y;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final c:Lcom/sumsub/sns/internal/features/data/model/common/C2;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;Lcom/sumsub/sns/internal/features/data/model/common/C2;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/domain/h;->j:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0, p1}, Lcom/sumsub/sns/internal/features/domain/mrtd/y;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/common/a;)V

    .line 20
    .line 21
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/m;->c:Lcom/sumsub/sns/internal/features/data/model/common/C2;

    .line 22
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/domain/mrtd/m;Ljava/lang/String;)Lcom/sumsub/sns/internal/nfc/a;
    .locals 4

    const/4 p0, 0x3

    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    if-eqz p1, :cond_0

    .line 3
    sget-object v1, Lcom/sumsub/sns/internal/nfc/j;->d:Ljava/util/Map;

    invoke-static {p1}, Lcom/sumsub/sns/internal/nfc/d;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 4
    :goto_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lcom/sumsub/sns/internal/nfc/a;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lcom/sumsub/sns/internal/nfc/a;-><init>(Ljava/util/List;I)V

    goto :goto_1

    :cond_1
    new-instance v1, Lcom/sumsub/sns/internal/nfc/a;

    invoke-direct {v1, v0, p0}, Lcom/sumsub/sns/internal/nfc/a;-><init>(Ljava/util/List;I)V

    .line 5
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 6
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_4

    .line 7
    :cond_2
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 8
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 9
    const-string v2, "ReadMRTDUseCase"

    const-string v3, "Failed to parse server config"

    invoke-virtual {p1, v2, v3, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    new-instance p1, Lcom/sumsub/sns/internal/nfc/a;

    invoke-direct {p1, v0, p0}, Lcom/sumsub/sns/internal/nfc/a;-><init>(Ljava/util/List;I)V

    .line 11
    :goto_4
    check-cast p1, Lcom/sumsub/sns/internal/nfc/a;

    return-object p1
.end method


# virtual methods
.method public final a(Landroid/nfc/tech/IsoDep;Lkotlin/jvm/functions/Function1;Lcom/sumsub/sns/internal/core/presentation/nfc/i;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v0

    new-instance v1, Lcom/sumsub/sns/internal/features/domain/mrtd/l;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/sumsub/sns/internal/features/domain/mrtd/l;-><init>(Lcom/sumsub/sns/internal/features/domain/mrtd/m;Landroid/nfc/tech/IsoDep;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
