.class public abstract Lcom/sumsub/sns/internal/features/presentation/sumsubid/V0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/Q;
    .locals 1

    .line 42
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/L;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/L;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final a(Z)Lcom/sumsub/sns/core/presentation/base/Q;
    .locals 1

    .line 43
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/D;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/D;-><init>(Z)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/h;Z)Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;
    .locals 16

    move-object/from16 v0, p0

    .line 16
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 17
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 18
    const-string/jumbo v4, "sumsubid.agreement.title"

    invoke-static {v4, v3}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v0, :cond_1

    .line 19
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 20
    const-string/jumbo v5, "sumsubid.agreement.subtitle"

    invoke-static {v5, v4}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v2

    :goto_1
    if-eqz v0, :cond_2

    .line 21
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 22
    const-string/jumbo v6, "sumsubid.agreement.actionContinue"

    invoke-static {v6, v5}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v2

    :goto_2
    if-eqz v0, :cond_3

    .line 23
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 24
    const-string/jumbo v7, "sumsubid.agreement.actionSkip"

    invoke-static {v7, v6}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_3
    move-object v6, v2

    :goto_3
    if-eqz v0, :cond_4

    .line 25
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 26
    const-string/jumbo v8, "sumsubid.agreement.benefits.instantly"

    invoke-static {v8, v7}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :cond_4
    move-object v7, v2

    :goto_4
    if-eqz v0, :cond_5

    .line 27
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 28
    const-string/jumbo v9, "sumsubid.agreement.benefits.securely"

    invoke-static {v9, v8}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    :cond_5
    move-object v8, v2

    :goto_5
    if-eqz v0, :cond_6

    .line 29
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 30
    const-string/jumbo v10, "sumsubid.agreement.benefits.optionally"

    invoke-static {v10, v9}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    goto :goto_6

    :cond_6
    move-object v9, v2

    :goto_6
    if-eqz v0, :cond_7

    .line 31
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 32
    const-string/jumbo v11, "sumsubid.agreement.optionPrivacy"

    invoke-static {v11, v10}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    goto :goto_7

    :cond_7
    move-object v10, v2

    :goto_7
    if-eqz v0, :cond_8

    .line 33
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 34
    const-string/jumbo v2, "sumsubid.agreement.footer"

    invoke-static {v2, v0}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    .line 35
    :cond_8
    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/sumsubid/d1;

    invoke-direct {v11}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/d1;-><init>()V

    new-instance v12, Lcom/sumsub/sns/internal/features/presentation/sumsubid/e1;

    invoke-direct {v12}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/e1;-><init>()V

    .line 36
    new-instance v13, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    sget-object v14, Lcom/sumsub/sns/internal/features/presentation/sumsubid/E;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/E;

    invoke-direct {v13, v0, v14}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Control;Lcom/sumsub/sns/internal/features/presentation/sumsubid/N;)V

    .line 37
    new-instance v14, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    .line 38
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Control;->SkipButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 39
    new-instance v15, Lcom/sumsub/sns/internal/features/presentation/sumsubid/B;

    invoke-direct {v15}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/B;-><init>()V

    .line 40
    invoke-direct {v14, v0, v15}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Control;Lcom/sumsub/sns/internal/features/presentation/sumsubid/N;)V

    move-object v0, v1

    move-object v1, v3

    move-object v3, v5

    move-object v5, v7

    move-object v7, v9

    move-object v9, v2

    move-object v2, v4

    move-object v4, v6

    move-object v6, v8

    move-object v8, v10

    move/from16 v10, p1

    .line 41
    invoke-direct/range {v0 .. v14}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Z)Lcom/sumsub/sns/internal/features/presentation/sumsubid/R0;
    .locals 13

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/R0;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 2
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 3
    const-string/jumbo v3, "sumsubid.contact.title"

    invoke-static {v3, v2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 4
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 5
    const-string/jumbo v4, "sumsubid.contact.description"

    invoke-static {v4, v3}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    const/4 v9, 0x4

    const/4 v10, 0x0

    .line 6
    const-string/jumbo v6, "{learnMoreLink}"

    const-string/jumbo v7, "sumsub://sumsubid-learn-more"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    if-eqz p0, :cond_2

    .line 7
    const-string/jumbo v4, "sns_data_field_email"

    invoke-virtual {p0, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v1

    :goto_2
    if-nez p4, :cond_4

    if-eqz p0, :cond_3

    .line 8
    const-string/jumbo v5, "sns_confirmation_contact_action_send"

    invoke-virtual {p0, v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    move-object v6, p0

    goto :goto_3

    :cond_3
    move-object v6, v1

    goto :goto_3

    :cond_4
    move-object/from16 v6, p4

    :goto_3
    if-eqz p1, :cond_5

    .line 9
    iget-object p0, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 10
    const-string/jumbo p1, "sumsubid.contact.actionSkip"

    invoke-static {p1, p0}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    move-object v8, p0

    goto :goto_4

    :cond_5
    move-object v8, v1

    .line 11
    :goto_4
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f1;

    invoke-direct {v9}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f1;-><init>()V

    .line 12
    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/H;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/H;

    invoke-direct {v10, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Control;Lcom/sumsub/sns/internal/features/presentation/sumsubid/N;)V

    .line 13
    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Control;->SkipButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/B;

    const/4 v5, 0x0

    invoke-direct {p1, v5}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/B;-><init>(I)V

    invoke-direct {v11, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Control;Lcom/sumsub/sns/internal/features/presentation/sumsubid/N;)V

    .line 14
    new-instance v12, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    sget-object p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/I;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/I;

    invoke-direct {v12, v1, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Control;Lcom/sumsub/sns/internal/features/presentation/sumsubid/N;)V

    move-object/from16 v5, p3

    move/from16 v7, p5

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, p2

    .line 15
    invoke-direct/range {v0 .. v12}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/R0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/c;)Lcom/sumsub/sns/internal/features/presentation/sumsubid/T0;
    .locals 4

    .line 44
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/T0;

    .line 45
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/c;->a:Ljava/lang/String;

    .line 46
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/c;->b:Ljava/lang/String;

    .line 47
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/c;->c:Ljava/lang/String;

    .line 48
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/sumsubid/c1;

    invoke-direct {v3}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/c1;-><init>()V

    .line 49
    invoke-direct {v0, v1, v2, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/T0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static final b(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/Q;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/G;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/G;-><init>(Ljava/lang/String;)V

    .line 6
    return-object v0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static final c(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/Q;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/L;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/L;-><init>(Ljava/lang/String;)V

    .line 6
    return-object v0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
