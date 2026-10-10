.class public final Lcom/sumsub/sns/internal/features/domain/mrtd/i;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final b:Lcom/sumsub/sns/internal/features/domain/mrtd/G;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/domain/mrtd/G;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/domain/mrtd/G;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/i;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 19
    .line 20
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/i;->b:Lcom/sumsub/sns/internal/features/domain/mrtd/G;

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static final a(Lkotlin/Pair;)Ljava/lang/CharSequence;
    .locals 0

    .line 102
    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/m;Ljava/util/ArrayList;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/g;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;

    iget v4, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->i:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->i:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/domain/mrtd/g;-><init>(Lcom/sumsub/sns/internal/features/domain/mrtd/i;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->g:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 1
    iget v5, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->i:I

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->b:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->a:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    goto/16 :goto_c

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v1, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->f:Z

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->e:Ljava/util/Iterator;

    iget-object v10, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->d:Ljava/util/Collection;

    iget-object v11, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->c:Ljava/util/List;

    iget-object v12, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->b:Ljava/lang/Object;

    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/common/m;

    iget-object v13, v3, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->a:Ljava/lang/Object;

    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v15, v3

    move-object v3, v11

    move-object v11, v10

    move-object v10, v5

    move v5, v1

    move-object v1, v13

    goto/16 :goto_4

    :cond_3
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/model/common/m;->n:Ljava/lang/String;

    if-eqz v2, :cond_4

    .line 3
    const-string v5, "disabled"

    invoke-static {v2, v5, v8}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    goto :goto_1

    :cond_4
    move v2, v7

    :goto_1
    if-eqz v2, :cond_5

    .line 4
    sget-object v10, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v11, "SumSubNfc"

    const-string v12, "NFC disabled, skipping.."

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 5
    invoke-static {v9}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 6
    :cond_5
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/model/common/m;->n:Ljava/lang/String;

    if-eqz v2, :cond_6

    const-string/jumbo v5, "optional"

    invoke-static {v2, v5, v8}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    goto :goto_2

    :cond_6
    move v2, v8

    .line 7
    :goto_2
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v15, v3

    move-object v11, v5

    move-object/from16 v3, p3

    move v5, v2

    move-object v2, v1

    move-object/from16 v1, p1

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 9
    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    .line 10
    iput-object v1, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->a:Ljava/lang/Object;

    iput-object v2, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->b:Ljava/lang/Object;

    iput-object v3, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->c:Ljava/util/List;

    iput-object v11, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->d:Ljava/util/Collection;

    iput-object v10, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->e:Ljava/util/Iterator;

    iput-boolean v5, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->f:Z

    iput v8, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->i:I

    invoke-virtual {v0, v12, v1, v5, v15}, Lcom/sumsub/sns/internal/features/domain/mrtd/i;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;Lcom/sumsub/sns/internal/features/data/model/common/Document;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v4, :cond_7

    goto/16 :goto_b

    :cond_7
    move-object/from16 v22, v12

    move-object v12, v2

    move-object/from16 v2, v22

    :goto_4
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    if-eqz v2, :cond_8

    .line 11
    invoke-interface {v11, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_8
    move-object v2, v12

    goto :goto_3

    .line 12
    :cond_9
    check-cast v11, Ljava/util/List;

    .line 13
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 14
    instance-of v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/E2;

    if-eqz v12, :cond_a

    goto :goto_5

    :cond_b
    move-object v10, v9

    :goto_5
    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    if-nez v10, :cond_c

    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    goto :goto_6

    :cond_c
    move-object v5, v10

    :goto_6
    if-nez v5, :cond_16

    .line 15
    sget-object v16, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 16
    iget-object v10, v2, Lcom/sumsub/sns/internal/features/data/model/common/m;->n:Ljava/lang/String;

    .line 17
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Skipping NFC check - missing info, nfcMode="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, ", docType="

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    const/16 v20, 0x4

    const/16 v21, 0x0

    .line 18
    const-string v17, "SumSubNfc"

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 19
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/m;->n:Ljava/lang/String;

    if-eqz v2, :cond_d

    const-string/jumbo v10, "required"

    invoke-static {v2, v10, v8}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    goto :goto_7

    :cond_d
    move v2, v7

    :goto_7
    if-eqz v2, :cond_16

    .line 20
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "NFC required but some values are missing, should be rejected in dashboard. docType="

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    const/16 v20, 0x4

    const/16 v21, 0x0

    .line 21
    const-string v17, "SumSubNfc"

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 22
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    .line 23
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/domain/mrtd/i;->b:Lcom/sumsub/sns/internal/features/domain/mrtd/G;

    if-eqz v1, :cond_e

    .line 24
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->e:Ljava/lang/String;

    move-object v11, v2

    goto :goto_8

    :cond_e
    move-object v11, v9

    :goto_8
    if-eqz v1, :cond_f

    .line 25
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    move-object v12, v2

    goto :goto_9

    :cond_f
    move-object v12, v9

    :goto_9
    if-eqz v1, :cond_10

    .line 26
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

    move-object v13, v1

    goto :goto_a

    :cond_10
    move-object v13, v9

    .line 27
    :goto_a
    sget-object v14, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->AccessDataMissing:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 28
    iput-object v3, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->a:Ljava/lang/Object;

    iput-object v5, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->b:Ljava/lang/Object;

    iput-object v9, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->c:Ljava/util/List;

    iput-object v9, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->d:Ljava/util/Collection;

    iput-object v9, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->e:Ljava/util/Iterator;

    iput v6, v15, Lcom/sumsub/sns/internal/features/domain/mrtd/g;->i:I

    invoke-virtual/range {v10 .. v15}, Lcom/sumsub/sns/internal/features/domain/mrtd/G;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_11

    :goto_b
    return-object v4

    :cond_11
    move-object v1, v5

    :goto_c
    if-eqz v3, :cond_12

    .line 29
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_d

    .line 30
    :cond_12
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v3, :cond_13

    .line 31
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->d()Z

    move-result v3

    if-ne v3, v8, :cond_13

    move v7, v8

    :cond_14
    :goto_d
    if-nez v7, :cond_15

    .line 32
    new-instance v10, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v11, "NFC required but mrtdSeed=null, should have been rejected in dashboard."

    const-string/jumbo v12, "mrtdAccessDataMissing"

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v1

    move-object v9, v10

    goto :goto_e

    :cond_15
    move-object v5, v1

    :cond_16
    :goto_e
    if-eqz v9, :cond_17

    .line 33
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v9}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 34
    :cond_17
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/data/model/common/remote/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p7

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/domain/mrtd/f;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;

    iget v3, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->i:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->i:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/domain/mrtd/f;-><init>(Lcom/sumsub/sns/internal/features/domain/mrtd/i;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->g:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 68
    iget v4, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->i:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-boolean v3, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->f:Z

    iget-object v4, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    iget-object v6, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->d:Ljava/lang/String;

    iget-object v7, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->c:Ljava/lang/String;

    iget-object v8, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move v11, v3

    move-object v10, v6

    move-object v9, v7

    move-object v7, v2

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/domain/mrtd/i;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    move-object/from16 v4, p1

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    move-object/from16 v6, p2

    iput-object v6, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->b:Ljava/lang/String;

    move-object/from16 v7, p3

    iput-object v7, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->c:Ljava/lang/String;

    move-object/from16 v8, p4

    iput-object v8, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->d:Ljava/lang/String;

    move-object/from16 v9, p6

    iput-object v9, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    move/from16 v10, p5

    iput-boolean v10, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->f:Z

    iput v5, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->i:I

    .line 70
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v11, 0x0

    invoke-virtual {v1, v11, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    move-object v11, v7

    move-object v7, v4

    move-object v4, v9

    move-object v9, v11

    move v11, v10

    move-object v10, v8

    move-object v8, v6

    .line 71
    :goto_1
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 72
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/h;->s:Lcom/sumsub/sns/internal/features/data/model/common/remote/X;

    if-eqz v1, :cond_4

    .line 73
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/X;->b:Ljava/lang/String;

    .line 74
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/X;->a:Ljava/lang/String;

    .line 75
    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    if-nez v1, :cond_5

    .line 76
    :cond_4
    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, v2, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    :cond_5
    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, Ljava/lang/String;

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Ljava/lang/String;

    .line 78
    iget-object v1, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->c:Ljava/lang/String;

    .line 79
    iget-object v3, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->d:Ljava/lang/String;

    .line 80
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->e:Ljava/lang/String;

    .line 81
    iget-object v12, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->g:Ljava/lang/String;

    if-eqz v17, :cond_6

    if-eqz v18, :cond_6

    if-eqz v1, :cond_6

    if-eqz v3, :cond_6

    if-eqz v6, :cond_6

    if-nez v12, :cond_7

    :cond_6
    move-object/from16 p1, v2

    move-object v4, v3

    move-object v5, v6

    move-object v6, v12

    move-object/from16 v3, v18

    move-object v2, v1

    move-object/from16 v1, v17

    goto/16 :goto_8

    .line 82
    :cond_7
    iget-object v13, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->i:Ljava/lang/Integer;

    if-eqz v13, :cond_8

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    goto :goto_2

    :cond_8
    move v13, v5

    .line 83
    :goto_2
    iget-object v14, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->j:Ljava/lang/Integer;

    if-eqz v14, :cond_a

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v15

    if-lez v15, :cond_9

    goto :goto_3

    :cond_9
    move-object v14, v2

    :goto_3
    if-eqz v14, :cond_a

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    goto :goto_4

    :cond_a
    const v14, 0x7fffffff

    .line 84
    :goto_4
    iget-object v15, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->k:Ljava/lang/String;

    if-eqz v15, :cond_d

    .line 85
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDInstructionType;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_c

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v19

    check-cast v20, Lcom/sumsub/sns/internal/features/data/model/common/MRTDInstructionType;

    move-object/from16 p1, v2

    invoke-virtual/range {v20 .. v20}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDInstructionType;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v15, v5}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_b

    move-object/from16 v2, v19

    goto :goto_6

    :cond_b
    move-object/from16 v2, p1

    goto :goto_5

    :cond_c
    move-object/from16 p1, v2

    :goto_6
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/MRTDInstructionType;

    goto :goto_7

    :cond_d
    move-object/from16 p1, v2

    .line 86
    :goto_7
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->f:Ljava/lang/String;

    move-object/from16 v23, v6

    .line 87
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/common/E2;

    const/16 v16, 0x0

    const/4 v15, 0x0

    move-object/from16 v21, v1

    move-object/from16 v22, v3

    move-object/from16 v19, v4

    move-object/from16 v20, v12

    move v12, v13

    move v13, v14

    move-object v14, v2

    .line 88
    invoke-direct/range {v6 .. v23}, Lcom/sumsub/sns/internal/features/data/model/common/E2;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILcom/sumsub/sns/internal/features/data/model/common/MRTDInstructionType;Lcom/sumsub/sns/internal/features/data/model/common/A2;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6

    .line 89
    :goto_8
    const-string v7, "clientUrl"

    invoke-static {v7, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 90
    const-string v7, "clientId"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    .line 91
    const-string v7, "documentNumber"

    invoke-static {v7, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 92
    const-string v7, "birthDate"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 93
    const-string v7, "expirationDate"

    invoke-static {v7, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 94
    const-string v7, "emrtdSessionId"

    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    move-object/from16 p2, v1

    move-object/from16 p4, v2

    move-object/from16 p3, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    filled-new-array/range {p2 .. p7}, [Lkotlin/Pair;

    move-result-object v1

    .line 95
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 96
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 97
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lkotlin/Pair;

    .line 98
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_e

    .line 99
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 100
    :cond_f
    new-instance v8, Lcom/sumsub/sns/internal/features/domain/mrtd/a0;

    invoke-direct {v8}, Lcom/sumsub/sns/internal/features/domain/mrtd/a0;-><init>()V

    const/16 v9, 0x1f

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v10}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 101
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Some values are missing: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x4

    const/4 v4, 0x0

    const-string v5, "SumSubNfc"

    const/4 v6, 0x0

    move-object/from16 p4, v1

    move-object/from16 p2, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p3, v5

    move-object/from16 p5, v6

    invoke-static/range {p2 .. p7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->w$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;Lcom/sumsub/sns/internal/features/data/model/common/Document;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/domain/mrtd/h;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/domain/mrtd/h;

    iget v3, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/h;->e:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/domain/mrtd/h;->e:I

    move-object/from16 v3, p0

    :goto_0
    move-object v10, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/mrtd/h;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v1}, Lcom/sumsub/sns/internal/features/domain/mrtd/h;-><init>(Lcom/sumsub/sns/internal/features/domain/mrtd/i;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    goto :goto_0

    :goto_1
    iget-object v1, v10, Lcom/sumsub/sns/internal/features/domain/mrtd/h;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 35
    iget v4, v10, Lcom/sumsub/sns/internal/features/domain/mrtd/h;->e:I

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v11, :cond_1

    iget-object v0, v10, Lcom/sumsub/sns/internal/features/domain/mrtd/h;->b:Lcom/sumsub/sns/internal/features/data/model/common/C2;

    iget-object v2, v10, Lcom/sumsub/sns/internal/features/domain/mrtd/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->f:Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    if-nez v9, :cond_3

    return-object v12

    .line 37
    :cond_3
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

    if-eqz v1, :cond_11

    .line 38
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    if-eqz v4, :cond_11

    .line 39
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->e:Ljava/lang/String;

    if-nez v4, :cond_4

    goto/16 :goto_a

    .line 40
    :cond_4
    sget-object v13, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "NfcSessionInfo: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    const/16 v17, 0x4

    const/16 v18, 0x0

    const-string v14, "SumSubNfc"

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 41
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

    .line 42
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    .line 43
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->e:Ljava/lang/String;

    .line 44
    iget-object v6, v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->b:Ljava/lang/String;

    if-nez v6, :cond_5

    const/16 v17, 0x4

    const/16 v18, 0x0

    .line 45
    const-string v14, "SumSubNfc"

    const-string v15, "MrtdSeed is null"

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->w$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    move-object v14, v12

    goto/16 :goto_8

    .line 46
    :cond_5
    new-instance v14, Lcom/sumsub/sns/internal/features/data/model/common/C2;

    .line 47
    iget-object v7, v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->i:Ljava/lang/Integer;

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move/from16 v20, v7

    goto :goto_2

    :cond_6
    move/from16 v20, v11

    .line 48
    :goto_2
    iget-object v7, v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->j:Ljava/lang/Integer;

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v8

    if-lez v8, :cond_7

    goto :goto_3

    :cond_7
    move-object v7, v12

    :goto_3
    if-eqz v7, :cond_8

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :goto_4
    move/from16 v21, v7

    goto :goto_5

    :cond_8
    const v7, 0x7fffffff

    goto :goto_4

    .line 49
    :goto_5
    iget-object v7, v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->k:Ljava/lang/String;

    if-eqz v7, :cond_b

    .line 50
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDInstructionType;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v15, v13

    check-cast v15, Lcom/sumsub/sns/internal/features/data/model/common/MRTDInstructionType;

    invoke-virtual {v15}, Lcom/sumsub/sns/internal/features/data/model/common/MRTDInstructionType;->getValue()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v7, v11}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v15

    if-eqz v15, :cond_9

    goto :goto_6

    :cond_a
    move-object v13, v12

    :goto_6
    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/common/MRTDInstructionType;

    move-object/from16 v22, v13

    goto :goto_7

    :cond_b
    move-object/from16 v22, v12

    .line 51
    :goto_7
    iget-object v7, v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->h:Ljava/lang/String;

    const/16 v24, 0x0

    const/16 v23, 0x0

    move-object/from16 v15, p2

    move/from16 v19, p3

    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v25, v6

    move-object/from16 v26, v7

    .line 52
    invoke-direct/range {v14 .. v26}, Lcom/sumsub/sns/internal/features/data/model/common/C2;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILcom/sumsub/sns/internal/features/data/model/common/MRTDInstructionType;Lcom/sumsub/sns/internal/features/data/model/common/A2;ILjava/lang/String;Ljava/lang/String;)V

    .line 53
    :goto_8
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

    .line 54
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    .line 55
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->e:Ljava/lang/String;

    .line 56
    iput-object v9, v10, Lcom/sumsub/sns/internal/features/domain/mrtd/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    iput-object v14, v10, Lcom/sumsub/sns/internal/features/domain/mrtd/h;->b:Lcom/sumsub/sns/internal/features/data/model/common/C2;

    iput v11, v10, Lcom/sumsub/sns/internal/features/domain/mrtd/h;->e:I

    move-object/from16 v4, p2

    move/from16 v8, p3

    invoke-virtual/range {v3 .. v10}, Lcom/sumsub/sns/internal/features/domain/mrtd/i;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/data/model/common/remote/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_c

    return-object v2

    :cond_c
    move-object v2, v9

    move-object v0, v14

    .line 57
    :goto_9
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/E2;

    .line 58
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->a:Ljava/lang/String;

    .line 59
    const-string v4, "basic"

    invoke-static {v3, v4, v11}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_e

    if-eqz v0, :cond_d

    .line 60
    invoke-virtual {v0, v1, v4}, Lcom/sumsub/sns/internal/features/data/model/common/C2;->a(Lcom/sumsub/sns/internal/features/data/model/common/A2;I)Lcom/sumsub/sns/internal/features/data/model/common/A2;

    move-result-object v0

    return-object v0

    :cond_d
    return-object v12

    .line 61
    :cond_e
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;->a:Ljava/lang/String;

    const-string v3, "kinegram"

    invoke-static {v2, v3, v11}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_10

    if-eqz v1, :cond_f

    .line 62
    invoke-virtual {v1, v0, v4}, Lcom/sumsub/sns/internal/features/data/model/common/E2;->a(Lcom/sumsub/sns/internal/features/data/model/common/A2;I)Lcom/sumsub/sns/internal/features/data/model/common/A2;

    move-result-object v0

    :cond_f
    return-object v0

    :cond_10
    return-object v12

    .line 63
    :cond_11
    :goto_a
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 64
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    .line 65
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->e:Ljava/lang/String;

    .line 66
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "idDocType, country or imageId is null: idDocType="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", country="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imageId="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v2

    .line 67
    const-string v2, "SumSubNfc"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-object v12
.end method
