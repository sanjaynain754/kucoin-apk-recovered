.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/d;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

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

.method public static a(Lcom/sumsub/sns/internal/features/data/model/prooface/M;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->d:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Green:Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    if-eqz p0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->e:Ljava/lang/Boolean;

    .line 4
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    .line 5
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->d:Ljava/lang/String;

    .line 6
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Yellow:Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 7
    :cond_3
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Red:Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/CharSequence;Ljava/util/List;)Ljava/lang/String;
    .locals 4

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0xa

    if-eqz p0, :cond_0

    .line 97
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "**"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    if-eqz p1, :cond_1

    .line 98
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    .line 99
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 100
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/prooface/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/prooface/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/a;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/a;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/d;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/a;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 22
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/a;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/a;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/4 p2, 0x0

    if-eqz p1, :cond_3

    .line 23
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->g:Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v2, p2

    :goto_1
    if-eqz v2, :cond_5

    .line 24
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/a;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/a;->d:I

    invoke-virtual {p0, v2, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/prooface/j1;

    :cond_5
    if-eqz p2, :cond_6

    return-object p2

    .line 25
    :cond_6
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 26
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 27
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/M;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 28
    const-string/jumbo v1, "sns_facescan_result_%s_title"

    invoke-static {v0, v3, v1, p2}, Lcom/sumsub/sns/internal/core/presentation/intro/d;->a([Ljava/lang/Object;ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object p2

    .line 29
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 30
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/M;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 31
    const-string/jumbo v1, "sns_facescan_result_%s_text"

    invoke-static {p1, v3, v1, v0}, Lcom/sumsub/sns/internal/core/presentation/intro/d;->a([Ljava/lang/Object;ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object p1

    .line 32
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/i1;

    invoke-direct {v0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/i1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/prooface/M;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/prooface/c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/d;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 8
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/e1;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/4 p3, 0x0

    if-eqz p1, :cond_3

    .line 9
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->d:Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v2, p3

    .line 10
    :goto_1
    sget-object v4, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Green:Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;->APPROVED:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;

    goto :goto_3

    :cond_4
    if-eqz p1, :cond_5

    .line 11
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->e:Ljava/lang/Boolean;

    .line 12
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_6

    .line 13
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->d:Ljava/lang/String;

    .line 14
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;->PENDING:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;

    goto :goto_3

    .line 15
    :cond_6
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;->REJECTED:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;

    :goto_3
    if-nez p2, :cond_7

    .line 16
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/prooface/e1;

    .line 17
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    const-string/jumbo v4, "sns_facescan_action_retry"

    invoke-virtual {p3, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 18
    invoke-direct {p2, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/e1;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    move-object p2, p3

    .line 19
    :goto_4
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/e1;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/c;->e:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_8

    return-object v1

    :cond_8
    move-object p1, v2

    .line 20
    :goto_5
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/prooface/k1;

    .line 21
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;

    invoke-direct {v0, p1, p3, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;Lcom/sumsub/sns/internal/features/presentation/prooface/k1;Lcom/sumsub/sns/internal/features/presentation/prooface/e1;)V

    return-object v0
.end method

.method public final a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/prooface/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/d;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 33
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b;->a:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b;->a:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/b;->d:I

    .line 35
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p2, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 36
    :cond_3
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/h;

    const/4 v0, 0x0

    if-eqz p2, :cond_32

    .line 37
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    if-nez p2, :cond_4

    goto/16 :goto_1e

    .line 38
    :cond_4
    const-string v1, "liveness"

    const-string/jumbo v2, "suggestions"

    filled-new-array {v1, v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 39
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 40
    invoke-static {p1, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/intro/a;->a(Ljava/util/List;II)Ljava/util/Iterator;

    move-result-object p2

    .line 41
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    move-object v2, p2

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 42
    iget-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/util/Map;

    if-eqz v5, :cond_5

    check-cast v2, Ljava/util/Map;

    goto :goto_3

    :cond_5
    move-object v2, v0

    :goto_3
    if-eqz v2, :cond_d

    .line 43
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 44
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 45
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_7

    move-object v7, v0

    :cond_7
    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_8

    goto :goto_5

    .line 46
    :cond_8
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_9

    move-object v6, v0

    :cond_9
    if-nez v6, :cond_a

    :goto_5
    move-object v6, v0

    goto :goto_6

    .line 47
    :cond_a
    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    :goto_6
    if-eqz v6, :cond_6

    .line 48
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 49
    :cond_b
    invoke-static {v5}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_c

    goto :goto_7

    .line 50
    :cond_c
    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_2

    :cond_d
    :goto_7
    move-object p1, v0

    goto :goto_8

    .line 51
    :cond_e
    iget-object p2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/Map;

    if-nez p2, :cond_f

    move-object p1, v0

    :cond_f
    check-cast p1, Ljava/util/Map;

    :goto_8
    if-nez p1, :cond_10

    return-object v0

    .line 52
    :cond_10
    const-string/jumbo p2, "title"

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 53
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 54
    invoke-static {p2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/intro/a;->a(Ljava/util/List;II)Ljava/util/Iterator;

    move-result-object v2

    .line 55
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1a

    move-object v5, v2

    check-cast v5, Lkotlin/collections/IntIterator;

    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v5

    .line 56
    iget-object v6, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/util/Map;

    if-eqz v6, :cond_11

    check-cast v5, Ljava/util/Map;

    goto :goto_a

    :cond_11
    move-object v5, v0

    :goto_a
    if-eqz v5, :cond_19

    .line 57
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 58
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_12
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 59
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_13

    move-object v8, v0

    :cond_13
    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_14

    goto :goto_c

    .line 60
    :cond_14
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_15

    move-object v7, v0

    :cond_15
    if-nez v7, :cond_16

    :goto_c
    move-object v7, v0

    goto :goto_d

    .line 61
    :cond_16
    invoke-static {v8, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    :goto_d
    if-eqz v7, :cond_12

    .line 62
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 63
    :cond_17
    invoke-static {v6}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v5

    if-nez v5, :cond_18

    goto :goto_e

    .line 64
    :cond_18
    iput-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_9

    :cond_19
    :goto_e
    move-object p2, v0

    goto :goto_f

    .line 65
    :cond_1a
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of v1, p2, Ljava/lang/CharSequence;

    if-nez v1, :cond_1b

    move-object p2, v0

    :cond_1b
    check-cast p2, Ljava/lang/CharSequence;

    .line 66
    :goto_f
    const-string/jumbo v1, "tipsTitle"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 67
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 68
    invoke-static {v1, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/intro/a;->a(Ljava/util/List;II)Ljava/util/Iterator;

    move-result-object v5

    .line 69
    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_25

    move-object v6, v5

    check-cast v6, Lkotlin/collections/IntIterator;

    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v6

    .line 70
    iget-object v7, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v7, Ljava/util/Map;

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ljava/util/Map;

    if-eqz v7, :cond_1c

    check-cast v6, Ljava/util/Map;

    goto :goto_11

    :cond_1c
    move-object v6, v0

    :goto_11
    if-eqz v6, :cond_24

    .line 71
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 72
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1d
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_22

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 73
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_1e

    move-object v9, v0

    :cond_1e
    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_1f

    goto :goto_13

    .line 74
    :cond_1f
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_20

    move-object v8, v0

    :cond_20
    if-nez v8, :cond_21

    :goto_13
    move-object v8, v0

    goto :goto_14

    .line 75
    :cond_21
    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    :goto_14
    if-eqz v8, :cond_1d

    .line 76
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    .line 77
    :cond_22
    invoke-static {v7}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v6

    if-nez v6, :cond_23

    goto :goto_15

    .line 78
    :cond_23
    iput-object v6, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_10

    :cond_24
    :goto_15
    move-object v1, v0

    goto :goto_16

    .line 79
    :cond_25
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/CharSequence;

    if-nez v2, :cond_26

    move-object v1, v0

    :cond_26
    check-cast v1, Ljava/lang/CharSequence;

    .line 80
    :goto_16
    const-string/jumbo v2, "tips"

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 81
    new-instance v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 82
    invoke-static {v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/intro/a;->a(Ljava/util/List;II)Ljava/util/Iterator;

    move-result-object p1

    .line 83
    :goto_17
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2f

    move-object v3, p1

    check-cast v3, Lkotlin/collections/IntIterator;

    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v3

    .line 84
    iget-object v4, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/util/Map;

    if-eqz v4, :cond_27

    check-cast v3, Ljava/util/Map;

    goto :goto_18

    :cond_27
    move-object v3, v0

    :goto_18
    if-eqz v3, :cond_31

    .line 85
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 86
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_28
    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 87
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_29

    move-object v7, v0

    :cond_29
    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_2a

    goto :goto_1a

    .line 88
    :cond_2a
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_2b

    move-object v6, v0

    :cond_2b
    if-nez v6, :cond_2c

    :goto_1a
    move-object v6, v0

    goto :goto_1b

    .line 89
    :cond_2c
    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    :goto_1b
    if-eqz v6, :cond_28

    .line 90
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_19

    .line 91
    :cond_2d
    invoke-static {v4}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_2e

    goto :goto_1d

    .line 92
    :cond_2e
    iput-object v3, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_17

    .line 93
    :cond_2f
    iget-object p1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Ljava/util/List;

    if-nez v2, :cond_30

    goto :goto_1c

    :cond_30
    move-object v0, p1

    :goto_1c
    check-cast v0, Ljava/util/List;

    .line 94
    :cond_31
    :goto_1d
    invoke-static {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/d;->a(Ljava/lang/CharSequence;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    .line 95
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/j1;

    invoke-direct {v0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/j1;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    :cond_32
    :goto_1e
    return-object v0
.end method
