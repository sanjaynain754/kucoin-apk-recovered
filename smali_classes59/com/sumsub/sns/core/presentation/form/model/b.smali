.class public abstract Lcom/sumsub/sns/core/presentation/form/model/b;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lcom/sumsub/sns/internal/core/presentation/form/FieldId;
    .locals 3

    .line 122
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object p0

    .line 123
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, p0

    .line 124
    :goto_0
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/core/presentation/form/FieldId;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/form/model/O;)Lcom/sumsub/sns/internal/core/presentation/form/model/E;
    .locals 13

    .line 112
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    .line 113
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->d:Ljava/lang/String;

    .line 114
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "internal."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 115
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 116
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 117
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 118
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".countryCode"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 119
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v11, 0x0

    const/16 v12, 0x3e0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 120
    const-string/jumbo v6, "text"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 121
    invoke-direct {v0, v2, v1}, Lcom/sumsub/sns/internal/core/presentation/form/model/E;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;Lcom/sumsub/sns/internal/core/presentation/form/j;)Ljava/lang/String;
    .locals 2

    .line 108
    sget-object v0, Lcom/sumsub/sns/core/presentation/form/model/a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    if-eqz p1, :cond_0

    .line 109
    iget-object p0, p1, Lcom/sumsub/sns/internal/core/presentation/form/j;->b:Ljava/lang/String;

    return-object p0

    :cond_0
    return-object v1

    .line 110
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    if-eqz p1, :cond_3

    .line 111
    iget-object p0, p1, Lcom/sumsub/sns/internal/core/presentation/form/j;->a:Ljava/lang/String;

    return-object p0

    :cond_3
    return-object v1
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/form/model/K;Lcom/sumsub/sns/core/presentation/form/d;)Z
    .locals 9

    .line 78
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/core/presentation/form/d;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 79
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    .line 80
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 81
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    .line 82
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v1, :cond_4

    if-nez v0, :cond_3

    .line 83
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 84
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/M0;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/v0;

    .line 85
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->f:Ljava/lang/String;

    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/data/model/common/v0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/M0;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 87
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/t0;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/t0;

    .line 88
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/t0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/K;

    .line 89
    iget-wide v5, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/K;->a:D

    double-to-int v1, v5

    if-lez v1, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    move v1, v3

    .line 90
    :goto_0
    instance-of v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/F0;

    if-eqz v5, :cond_2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/F0;

    .line 91
    iget-wide v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/F0;->a:D

    const-wide/16 v7, 0x0

    cmpl-double v0, v5, v7

    if-lez v0, :cond_2

    move v0, v4

    goto :goto_1

    :cond_2
    move v0, v3

    :goto_1
    if-nez v1, :cond_4

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move v0, v3

    goto :goto_3

    :cond_4
    :goto_2
    move v0, v4

    .line 92
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    .line 93
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 94
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/M0;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/v0;

    .line 95
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->f:Ljava/lang/String;

    .line 96
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lcom/sumsub/sns/internal/features/data/model/common/v0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/M0;

    move-result-object v1

    if-nez v1, :cond_5

    const/4 v1, 0x0

    goto :goto_4

    .line 97
    :cond_5
    instance-of v5, v1, Lcom/sumsub/sns/internal/features/data/model/common/B0;

    if-eqz v5, :cond_6

    .line 98
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 99
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    .line 100
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    .line 101
    new-instance p0, Lcom/sumsub/sns/internal/features/data/model/common/t0;

    .line 102
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/K;

    .line 103
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/B0;

    .line 104
    iget-wide v5, v1, Lcom/sumsub/sns/internal/features/data/model/common/B0;->a:D

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 105
    invoke-direct {v2, v7, v8, v5, v6}, Lcom/sumsub/sns/internal/features/data/model/common/remote/K;-><init>(DD)V

    .line 106
    invoke-direct {p0, v2}, Lcom/sumsub/sns/internal/features/data/model/common/t0;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/K;)V

    move-object v1, p0

    :cond_6
    :goto_4
    if-eqz v0, :cond_8

    .line 107
    invoke-static {v1, p1}, Lcom/sumsub/sns/internal/core/presentation/util/a;->a(Lcom/sumsub/sns/internal/features/data/model/common/M0;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_7

    goto :goto_5

    :cond_7
    return v3

    :cond_8
    :goto_5
    return v4
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Lcom/sumsub/sns/core/presentation/form/d;)Z
    .locals 6

    .line 1
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2a

    .line 2
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/b0;

    if-nez v0, :cond_2a

    .line 3
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/l;

    if-nez v0, :cond_2a

    .line 4
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/s;

    if-nez v0, :cond_2a

    .line 5
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/u;

    if-nez v0, :cond_2a

    .line 6
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    if-eqz v0, :cond_0

    goto/16 :goto_d

    .line 7
    :cond_0
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/o;

    if-eqz v0, :cond_5

    .line 8
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/core/presentation/form/d;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move p1, v1

    goto :goto_1

    :cond_2
    :goto_0
    move p1, v2

    .line 9
    :goto_1
    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/form/model/o;

    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/o;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 11
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    .line 12
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    return v1

    :cond_4
    :goto_2
    return v2

    .line 13
    :cond_5
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/V;

    const/4 v3, 0x0

    if-eqz v0, :cond_f

    .line 14
    move-object v0, p0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/model/V;

    .line 15
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/V;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 16
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object p0

    .line 17
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/V;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 18
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->i:Ljava/util/List;

    if-nez p1, :cond_6

    .line 19
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 20
    :cond_6
    iget-object v0, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    .line 21
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz p0, :cond_7

    .line 22
    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 23
    :cond_7
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;->REQUIRED:Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;

    goto :goto_4

    .line 24
    :cond_8
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    if-eqz p0, :cond_d

    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_4

    .line 25
    :cond_9
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_3

    .line 26
    :cond_a
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;

    .line 27
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;->a:Ljava/lang/String;

    .line 28
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_4

    .line 29
    :cond_c
    :goto_3
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;->NOT_VALID:Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;

    :cond_d
    :goto_4
    if-nez v3, :cond_e

    return v2

    :cond_e
    return v1

    .line 30
    :cond_f
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    if-eqz v0, :cond_16

    .line 31
    move-object v0, p0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    .line 32
    invoke-static {v0}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/O;)Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    move-result-object v4

    .line 33
    invoke-virtual {p1, v4}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_10

    const-string p1, ""

    .line 35
    :cond_10
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/j0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, p1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/j0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 36
    iget-object v5, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 37
    invoke-static {v5, v4}, Lcom/sumsub/sns/internal/core/presentation/form/model/i0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;

    move-result-object v5

    if-nez v5, :cond_12

    .line 38
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/presentation/widget/autocompletePhone/util/a;->a(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_11

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_5

    :cond_11
    move-object p0, v3

    goto :goto_5

    :cond_12
    move-object p0, v5

    .line 39
    :goto_5
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 40
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    .line 41
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_14

    :cond_13
    if-eqz p0, :cond_15

    :cond_14
    move v1, v2

    :cond_15
    xor-int/lit8 p0, v1, 0x1

    return p0

    .line 42
    :cond_16
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/T;

    if-eqz v0, :cond_1b

    .line 43
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_18

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_17

    goto :goto_6

    :cond_17
    move p1, v1

    goto :goto_7

    :cond_18
    :goto_6
    move p1, v2

    .line 44
    :goto_7
    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/form/model/T;

    .line 45
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/T;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 46
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    .line 47
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1a

    if-nez p1, :cond_19

    goto :goto_8

    :cond_19
    return v1

    :cond_1a
    :goto_8
    return v2

    .line 48
    :cond_1b
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/M;

    if-eqz v0, :cond_20

    .line 49
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/core/presentation/form/d;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1d

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1c

    goto :goto_9

    :cond_1c
    move p1, v1

    goto :goto_a

    :cond_1d
    :goto_9
    move p1, v2

    .line 50
    :goto_a
    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/form/model/M;

    .line 51
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/M;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 52
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    .line 53
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1f

    if-nez p1, :cond_1e

    goto :goto_b

    :cond_1e
    return v1

    :cond_1f
    :goto_b
    return v2

    .line 54
    :cond_20
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    if-eqz v0, :cond_24

    .line 55
    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    .line 56
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object p1

    .line 57
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 58
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    .line 59
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    if-eqz p1, :cond_22

    .line 60
    :cond_21
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->j:Lcom/sumsub/sns/internal/core/presentation/form/model/A;

    if-eqz p0, :cond_23

    :cond_22
    return v1

    :cond_23
    return v2

    .line 61
    :cond_24
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    if-eqz v0, :cond_27

    .line 62
    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    invoke-static {p0, p1}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/K;Lcom/sumsub/sns/core/presentation/form/d;)Z

    move-result p1

    if-eqz p1, :cond_26

    .line 63
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->k:Ljava/util/List;

    if-eqz p0, :cond_25

    .line 64
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_26

    :cond_25
    return v2

    :cond_26
    return v1

    .line 65
    :cond_27
    instance-of p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/w;

    if-nez p1, :cond_29

    .line 66
    instance-of p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    if-nez p1, :cond_29

    .line 67
    instance-of p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    if-nez p1, :cond_29

    .line 68
    instance-of p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/X;

    if-nez p1, :cond_29

    .line 69
    instance-of p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/G;

    if-nez p1, :cond_29

    .line 70
    instance-of p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/y;

    if-nez p1, :cond_29

    .line 71
    instance-of p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/d0;

    if-nez p1, :cond_29

    .line 72
    instance-of p1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/h;

    if-nez p1, :cond_29

    .line 73
    instance-of p0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/I;

    if-eqz p0, :cond_28

    goto :goto_c

    .line 74
    :cond_28
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_29
    :goto_c
    return v2

    .line 75
    :cond_2a
    :goto_d
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v0

    .line 76
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object p0

    .line 77
    invoke-static {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/form/model/i0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/presentation/form/model/FieldError;

    move-result-object p0

    if-nez p0, :cond_2b

    return v2

    :cond_2b
    return v1
.end method

.method public static final b(Lcom/sumsub/sns/internal/core/presentation/form/model/O;)Lcom/sumsub/sns/internal/core/presentation/form/model/E;
    .locals 13

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->d:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v3, "internal."

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 24
    .line 25
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 26
    .line 27
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string p0, ".countryPhoneCode"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 47
    const/4 v11, 0x0

    .line 48
    .line 49
    const/16 v12, 0x3e0

    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    .line 53
    .line 54
    const-string/jumbo v6, "text"

    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    .line 59
    .line 60
    invoke-direct/range {v2 .. v12}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v2, v1}, Lcom/sumsub/sns/internal/core/presentation/form/model/E;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;)V

    .line 64
    return-object v0
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
.end method
