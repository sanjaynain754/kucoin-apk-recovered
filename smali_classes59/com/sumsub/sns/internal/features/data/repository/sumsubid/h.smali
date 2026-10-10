.class public final Lcom/sumsub/sns/internal/features/data/repository/sumsubid/h;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/data/repository/sumsubid/e;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/d;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/sumsubid/d;Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/h;->a:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/d;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/h;->b:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;

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
.method public final a(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/f;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/f;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/f;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/f;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/f;-><init>(Lcom/sumsub/sns/internal/features/data/repository/sumsubid/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/f;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 12
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/f;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-eqz p1, :cond_9

    .line 13
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_9

    if-eqz p2, :cond_8

    .line 14
    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_8

    .line 15
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/h;->a:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/d;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/f;->c:I

    .line 16
    iget-object p3, p3, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/d;->a:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/i;

    .line 17
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/p;

    invoke-direct {v2, p1, p2}, Lcom/sumsub/sns/internal/features/data/model/sumsubid/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/i;->a(Lcom/sumsub/sns/internal/features/data/model/sumsubid/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    .line 18
    :cond_3
    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/features/data/model/sumsubid/m;

    const/4 p1, 0x0

    if-eqz p3, :cond_4

    .line 19
    iget-object p2, p3, Lcom/sumsub/sns/internal/features/data/model/sumsubid/m;->a:Ljava/lang/String;

    goto :goto_2

    :cond_4
    move-object p2, p1

    .line 20
    :goto_2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/sumsubid/SNSSumsubIdCheckCodeResponse$Status;->VERIFIED:Lcom/sumsub/sns/internal/features/data/model/sumsubid/SNSSumsubIdCheckCodeResponse$Status;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/sumsubid/SNSSumsubIdCheckCodeResponse$Status;->getStatus()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    .line 21
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/h;->b:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;

    if-eqz p3, :cond_5

    .line 22
    iget-object p1, p3, Lcom/sumsub/sns/internal/features/data/model/sumsubid/m;->c:Ljava/lang/String;

    :cond_5
    move-object v8, p1

    if-eqz p3, :cond_6

    .line 23
    iget-object p1, p3, Lcom/sumsub/sns/internal/features/data/model/sumsubid/m;->d:Lcom/sumsub/sns/internal/features/data/model/sumsubid/l;

    if-eqz p1, :cond_6

    .line 24
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/sumsubid/l;->b:Ljava/lang/Boolean;

    .line 25
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_3
    move v7, p1

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    goto :goto_3

    .line 26
    :goto_4
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;->a:Lkotlinx/coroutines/flow/n;

    .line 27
    :cond_7
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object p2

    .line 28
    move-object v4, p2

    check-cast v4, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    const/4 v5, 0x0

    const/4 v9, 0x1

    .line 29
    invoke-static/range {v4 .. v9}, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;->a(Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;Ljava/lang/String;ZZLjava/lang/String;I)Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    move-result-object v0

    .line 30
    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    return-object p3

    .line 31
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid code, "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 32
    :cond_9
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid id, "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/g;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/g;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/g;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/g;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/g;-><init>(Lcom/sumsub/sns/internal/features/data/repository/sumsubid/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/g;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/g;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-ne v2, v3, :cond_2

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/g;->a:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :cond_1
    move-object v3, p1

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/h;->a:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/d;

    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/B;

    invoke-direct {v2, p1}, Lcom/sumsub/sns/internal/features/data/model/sumsubid/B;-><init>(Ljava/lang/String;)V

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/g;->a:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/g;->d:I

    .line 3
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/d;->a:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/i;

    .line 4
    invoke-interface {p2, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/i;->a(Lcom/sumsub/sns/internal/features/data/model/sumsubid/B;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_4

    goto :goto_1

    :cond_4
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/F;

    :goto_1
    if-ne p2, v1, :cond_1

    return-object v1

    .line 5
    :goto_2
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/sumsubid/F;

    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/h;->b:Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;

    .line 7
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;->a:Lkotlinx/coroutines/flow/n;

    .line 8
    :cond_5
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 9
    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 10
    invoke-static/range {v2 .. v7}, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;->a(Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;Ljava/lang/String;ZZLjava/lang/String;I)Lcom/sumsub/sns/internal/features/data/repository/sumsubid/a;

    move-result-object v1

    .line 11
    invoke-interface {p1, v0, v1}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    return-object p2
.end method
