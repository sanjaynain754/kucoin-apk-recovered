.class public abstract Lcom/sumsub/sns/internal/core/presentation/helper/b;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static synthetic a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;Lcom/sumsub/sns/internal/core/presentation/helper/c;I)Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;
    .locals 0

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    const/4 p4, 0x0

    goto :goto_0

    :cond_0
    const/4 p4, 0x1

    .line 1
    :goto_0
    invoke-static {p0, p1, p2, p4, p3}, Lcom/sumsub/sns/internal/core/presentation/helper/b;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;ZLcom/sumsub/sns/internal/core/presentation/helper/c;)Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;ZLcom/sumsub/sns/internal/core/presentation/helper/c;)Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    const/4 v3, -0x1

    .line 16
    sget-object v4, Lcom/sumsub/sns/internal/ff/a;->Y:Lcom/sumsub/sns/internal/ff/core/a;

    .line 17
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v5

    .line 18
    sget-object v6, Lcom/sumsub/sns/internal/core/presentation/helper/a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    const/4 v7, 0x1

    if-eq v6, v7, :cond_6

    const/4 v8, 0x2

    if-eq v6, v8, :cond_2

    const/4 v5, 0x3

    if-eq v6, v5, :cond_0

    .line 19
    invoke-static/range {p1 .. p1}, Lcom/sumsub/sns/internal/core/presentation/helper/b;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;)Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    move-result-object v5

    :goto_0
    move-object v9, v5

    goto :goto_1

    .line 20
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v5

    if-nez v5, :cond_1

    if-eqz p3, :cond_1

    .line 21
    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    goto :goto_0

    .line 22
    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/sumsub/sns/internal/core/presentation/helper/b;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;)Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    move-result-object v5

    goto :goto_0

    .line 23
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v6

    if-nez v6, :cond_3

    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->INIT:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    goto :goto_0

    .line 24
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isRejected()Z

    move-result v6

    if-eqz v6, :cond_4

    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    goto :goto_0

    :cond_4
    if-nez v5, :cond_5

    .line 25
    invoke-static/range {p1 .. p1}, Lcom/sumsub/sns/internal/core/presentation/helper/b;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;)Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    move-result-object v5

    goto :goto_0

    .line 26
    :cond_5
    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->PENDING:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    goto :goto_0

    .line 27
    :cond_6
    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->PENDING:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    goto :goto_0

    .line 28
    :goto_1
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v4

    .line 29
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Reviewed:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    const/4 v6, 0x0

    if-ne v1, v5, :cond_7

    move v5, v7

    goto :goto_2

    :cond_7
    move v5, v6

    .line 30
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v8

    invoke-virtual {v8, v0}, Lcom/sumsub/sns/internal/features/data/model/common/X;->b(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object v10

    .line 31
    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Reviewing:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    if-ne v1, v8, :cond_8

    .line 32
    const-string/jumbo v1, "sns_iddoc_status_reviewing"

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    move-object v11, v0

    goto/16 :goto_c

    :cond_8
    if-eqz v5, :cond_9

    .line 33
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    if-ne v9, v1, :cond_9

    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v1

    if-nez v1, :cond_9

    .line 34
    const-string/jumbo v1, "sns_iddoc_status_notSubmitted"

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_9
    const/4 v1, 0x0

    if-eqz v5, :cond_a

    .line 35
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isRejected()Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    sget-object v8, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    if-ne v9, v8, :cond_12

    .line 36
    :cond_b
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getReview()Lcom/sumsub/sns/internal/features/data/model/common/n3;

    move-result-object v2

    if-eqz v2, :cond_10

    .line 37
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/n3;->a:Ljava/lang/String;

    if-eqz v2, :cond_e

    .line 38
    invoke-static {v2}, Lkotlin/text/StringsKt;->getLastIndex(Ljava/lang/CharSequence;)I

    move-result v4

    :goto_4
    if-ge v3, v4, :cond_d

    .line 39
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v8, 0xa

    if-ne v5, v8, :cond_c

    add-int/2addr v4, v3

    goto :goto_4

    :cond_c
    add-int/2addr v4, v7

    .line 40
    invoke-virtual {v2, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    .line 41
    :cond_d
    const-string v2, ""

    :goto_5
    if-eqz v2, :cond_e

    .line 42
    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_e
    if-nez v1, :cond_f

    goto :goto_6

    :cond_f
    move-object v11, v1

    goto/16 :goto_c

    .line 43
    :cond_10
    :goto_6
    const-string/jumbo v1, "sns_iddoc_status_declined"

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    goto :goto_3

    .line 44
    :cond_11
    const-string v0, "Rejected"

    goto :goto_3

    :cond_12
    if-nez v5, :cond_13

    if-nez v4, :cond_14

    .line 45
    :cond_13
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isApproved()Z

    move-result v3

    if-eqz v3, :cond_14

    .line 46
    const-string/jumbo v1, "sns_iddoc_status_approved"

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 47
    :cond_14
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isReviewing()Z

    move-result v3

    if-nez v3, :cond_1d

    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v3

    if-eqz v3, :cond_15

    goto/16 :goto_b

    .line 48
    :cond_15
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/X;->e()Z

    move-result v3

    if-eqz v3, :cond_18

    .line 49
    iget-object v1, v2, Lcom/sumsub/sns/internal/core/presentation/helper/c;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz v1, :cond_16

    .line 50
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-result-object v1

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/m;->b()Z

    move-result v1

    if-ne v1, v7, :cond_16

    move v1, v7

    goto :goto_7

    :cond_16
    move v1, v6

    .line 51
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    .line 52
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 53
    sget-object v3, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const-string/jumbo v4, "sns_step_%s_prompt"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_17

    .line 54
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string/jumbo v2, "sns_step_%s_geolocation_prompt"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_8

    :cond_17
    move-object v1, v3

    .line 55
    :goto_8
    const-string/jumbo v2, "sns_step_defaults_prompt"

    filled-new-array {v1, v3, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    .line 56
    :cond_18
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/helper/c;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 57
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object v2

    .line 58
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/n;->a:Ljava/util/List;

    .line 59
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 60
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_19
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 61
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 62
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_19

    .line 63
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 64
    :cond_1a
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 65
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v4, v6

    :goto_a
    if-ge v4, v2, :cond_1b

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/2addr v4, v7

    .line 66
    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 67
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/m;->b:Ljava/util/List;

    .line 68
    invoke-static {v11, v5}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_a

    .line 69
    :cond_1b
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/helper/d;

    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/core/presentation/helper/d;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)V

    const/16 v18, 0x1e

    const/16 v19, 0x0

    const-string v12, ", "

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v2

    invoke-static/range {v11 .. v19}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v22

    .line 70
    const-string/jumbo v2, "videoident"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-static/range {v22 .. v22}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1c

    .line 71
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/X;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v20

    const/16 v24, 0x4

    const/16 v25, 0x0

    const-string/jumbo v21, "{doctypes}"

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    .line 72
    :cond_1c
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/X;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    .line 73
    :cond_1d
    :goto_b
    const-string/jumbo v1, "sns_iddoc_status_submitted"

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    .line 74
    :goto_c
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    if-ne v9, v0, :cond_1e

    move v12, v7

    goto :goto_d

    :cond_1e
    move v12, v6

    .line 75
    :goto_d
    new-instance v13, Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;

    .line 76
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/base/adapter/SNSDocumentViewTypeInfo$Type;->DOCUMENT:Lcom/sumsub/sns/internal/core/presentation/base/adapter/SNSDocumentViewTypeInfo$Type;

    move-object/from16 v1, p1

    .line 77
    invoke-direct {v13, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;-><init>(Lcom/sumsub/sns/internal/core/presentation/base/adapter/SNSDocumentViewTypeInfo$Type;Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 78
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    invoke-direct/range {v8 .. v13}, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;-><init>(Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLcom/sumsub/sns/internal/core/presentation/base/adapter/c;)V

    return-object v8
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/Document;)Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;
    .locals 3

    .line 4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->INIT:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getReview()Lcom/sumsub/sns/internal/features/data/model/common/n3;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/n3;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 7
    :goto_0
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;->Red:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    if-ne v0, v2, :cond_2

    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    return-object p0

    .line 8
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getReview()Lcom/sumsub/sns/internal/features/data/model/common/n3;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 9
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/n3;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    .line 10
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;->Green:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    if-ne v1, v0, :cond_4

    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->APPROVED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    return-object p0

    .line 11
    :cond_4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isRejected()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    return-object p0

    .line 12
    :cond_5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isApproved()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->APPROVED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    return-object p0

    .line 13
    :cond_6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->PENDING:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    return-object p0

    .line 14
    :cond_7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isReviewing()Z

    move-result p0

    if-eqz p0, :cond_8

    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->PENDING:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    return-object p0

    .line 15
    :cond_8
    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->INIT:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1

    .line 2
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/data/model/common/g2;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/q2;

    move-result-object p1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, p0, v0}, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method
