.class public abstract Lcom/sumsub/sns/internal/features/presentation/utils/i;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Lcom/sumsub/sns/internal/features/domain/appdata/g;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 2
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/data/model/common/h;->i:Ljava/util/Map;

    if-eqz v4, :cond_0

    .line 3
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/T3;

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    const-string/jumbo v5, "sns_data_%s_%s"

    const/4 v6, 0x2

    const-string/jumbo v7, "tin"

    if-eqz v1, :cond_1

    .line 4
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/h;->n:Ljava/util/Map;

    if-eqz v1, :cond_1

    .line 5
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_2

    .line 6
    :cond_1
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 7
    const-string v0, "field"

    filled-new-array {v0, v7}, [Ljava/lang/Object;

    move-result-object v0

    .line 8
    invoke-static {v0, v6, v5, v2}, Lcom/sumsub/sns/internal/core/presentation/intro/d;->a([Ljava/lang/Object;ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    const-string v1, ""

    if-eqz v4, :cond_3

    .line 9
    iget-object v8, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/T3;->a:Ljava/util/List;

    if-eqz v8, :cond_3

    .line 10
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_4

    :cond_3
    move-object v8, v1

    :cond_4
    if-eqz v4, :cond_7

    .line 11
    iget-object v9, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/T3;->a:Ljava/util/List;

    if-eqz v9, :cond_7

    .line 12
    new-instance v15, Lcom/sumsub/sns/internal/features/presentation/utils/f0;

    invoke-direct {v15}, Lcom/sumsub/sns/internal/features/presentation/utils/f0;-><init>()V

    const/16 v16, 0x1e

    const/16 v17, 0x0

    const-string v10, ", "

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v9 .. v17}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    if-eqz v20, :cond_7

    .line 13
    sget-object v9, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 14
    const-string v9, "hint"

    filled-new-array {v9, v7}, [Ljava/lang/Object;

    move-result-object v7

    .line 15
    invoke-static {v7, v6, v5, v2}, Lcom/sumsub/sns/internal/core/presentation/intro/d;->a([Ljava/lang/Object;ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object v18

    if-eqz v18, :cond_5

    const/16 v22, 0x4

    const/16 v23, 0x0

    .line 16
    const-string/jumbo v19, "{example}"

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :cond_5
    if-nez v3, :cond_6

    goto :goto_1

    :cond_6
    move-object v1, v3

    .line 17
    :cond_7
    :goto_1
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/appdata/g;

    invoke-direct {v2, v0, v4, v8, v1}, Lcom/sumsub/sns/internal/features/domain/appdata/g;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/T3;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public static final a(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/D;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/Boolean;)Ljava/lang/String;
    .locals 7

    .line 18
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;

    const-string/jumbo v1, "sns_data_error_fieldIsRequired"

    const/4 v2, 0x0

    if-eqz v0, :cond_11

    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 19
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->g:Lcom/sumsub/sns/internal/features/data/model/common/M0;

    if-eqz v0, :cond_3

    .line 20
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a:Ljava/util/Map;

    .line 21
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const-string v5, ""

    if-eqz v4, :cond_1

    .line 23
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v6, 0x1

    if-ne v4, v6, :cond_1

    .line 24
    const-string/jumbo v0, "sns_quiestionnaire_field_isRequired"

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, v0

    goto :goto_0

    .line 25
    :cond_1
    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/util/a;->a(Lcom/sumsub/sns/internal/features/data/model/common/M0;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 26
    const-string/jumbo v0, "sns_quiestionnaire_field_isNotValid"

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    .line 27
    :cond_2
    :goto_0
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v5, v2

    :goto_1
    if-nez v5, :cond_10

    .line 28
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    if-eqz v0, :cond_4

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    .line 30
    :cond_4
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    if-eqz v0, :cond_5

    .line 31
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 32
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/C1;->b:Lcom/sumsub/sns/internal/features/data/model/common/C1;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 33
    :goto_2
    invoke-virtual {p2, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 34
    :cond_5
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/d2;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/S0;

    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/Y0;->b:Lcom/sumsub/sns/internal/features/data/model/common/Y0;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string/jumbo v4, "sns_data_error_fieldIsMalformed"

    if-nez v3, :cond_7

    .line 36
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/m1;->b:Lcom/sumsub/sns/internal/features/data/model/common/m1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    .line 37
    :cond_6
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/FieldType;->date:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    if-ne v1, v3, :cond_b

    .line 38
    :cond_7
    :goto_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_b

    .line 39
    :try_start_0
    new-instance p3, Ljava/text/SimpleDateFormat;

    const-string/jumbo v1, "yyyy-MM-dd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {p3, v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {p3, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 40
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 41
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8

    sget-object p3, Lcom/sumsub/sns/internal/features/data/model/common/m1;->b:Lcom/sumsub/sns/internal/features/data/model/common/m1;

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    .line 42
    :cond_8
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p0

    if-ltz p0, :cond_9

    goto :goto_4

    :cond_9
    move-object p1, v2

    :goto_4
    if-eqz p1, :cond_a

    .line 43
    invoke-virtual {p2, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_a
    return-object v2

    .line 44
    :catch_0
    invoke-virtual {p2, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 45
    :cond_b
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 46
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/a1;->b:Lcom/sumsub/sns/internal/features/data/model/common/a1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_e

    .line 47
    sget-object p0, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    if-nez p0, :cond_c

    goto :goto_5

    :cond_c
    move-object p1, v2

    :goto_5
    if-eqz p1, :cond_d

    .line 48
    invoke-virtual {p2, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_d
    return-object v2

    .line 49
    :cond_e
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 50
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/C1;->b:Lcom/sumsub/sns/internal/features/data/model/common/C1;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_f

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_f

    .line 51
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p3, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_f

    invoke-virtual {p2, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    return-object v2

    :cond_10
    return-object v5

    .line 52
    :cond_11
    instance-of p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/u;

    if-eqz p3, :cond_14

    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/u;

    .line 53
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 54
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/u;->d:Ljava/lang/Boolean;

    .line 55
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto :goto_6

    :cond_12
    invoke-virtual {p2, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_13
    :goto_6
    return-object v2

    .line 56
    :cond_14
    instance-of p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/C;

    if-eqz p0, :cond_15

    return-object v2

    .line 57
    :cond_15
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
