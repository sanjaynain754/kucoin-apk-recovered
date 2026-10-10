.class public abstract Lcom/sumsub/sns/core/presentation/form/viewadapter/o;
.super Lcom/sumsub/sns/core/presentation/base/adapter/c;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/core/presentation/form/a;

.field public final b:Lcom/sumsub/sns/core/presentation/form/d;

.field public final c:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/core/presentation/form/a;Lcom/sumsub/sns/core/presentation/form/d;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/presentation/base/adapter/c;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->a:Lcom/sumsub/sns/core/presentation/form/a;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->b:Lcom/sumsub/sns/core/presentation/form/d;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->c:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;

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

.method public static final a(Lcom/sumsub/sns/core/presentation/form/viewadapter/o;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Lkotlin/Unit;
    .locals 0

    .line 143
    iget-object p0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->a:Lcom/sumsub/sns/core/presentation/form/a;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lcom/sumsub/sns/core/presentation/form/a;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/core/presentation/form/viewadapter/o;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 141
    iget-object p0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->a:Lcom/sumsub/sns/core/presentation/form/a;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/form/a;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V

    .line 142
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 8
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v4

    .line 9
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->b:Ljava/lang/String;

    const-string v6, ""

    if-eqz v5, :cond_0

    .line 10
    invoke-static {v5, v3}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 11
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v7

    .line 12
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    .line 13
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 14
    invoke-static {v5, v3, v7}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/text/Spanned;Landroid/content/Context;Z)Ljava/lang/CharSequence;

    move-result-object v5

    if-nez v5, :cond_1

    :cond_0
    move-object v5, v6

    :cond_1
    invoke-virtual {v1, v5}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setLabel(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->c:Ljava/lang/String;

    if-eqz v5, :cond_2

    .line 16
    invoke-static {v5, v3}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v5

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v1, v5}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setExample(Ljava/lang/CharSequence;)V

    .line 17
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->h()Z

    move-result v5

    invoke-virtual {v1, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 18
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->g:Ljava/lang/String;

    .line 19
    invoke-virtual {v1, v4}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setHint(Ljava/lang/CharSequence;)V

    .line 20
    new-instance v4, Lcom/sumsub/sns/core/presentation/form/viewadapter/k0;

    invoke-direct {v4, v0, v2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/k0;-><init>(Lcom/sumsub/sns/core/presentation/form/viewadapter/o;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V

    invoke-virtual {v1, v4}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setOnLinkClicked(Lkotlin/jvm/functions/Function1;)V

    .line 21
    iget-object v4, v0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->b:Lcom/sumsub/sns/core/presentation/form/d;

    .line 22
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    if-nez v5, :cond_41

    .line 23
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/b0;

    if-eqz v5, :cond_3

    goto/16 :goto_1e

    .line 24
    :cond_3
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/l;

    const/4 v8, 0x0

    if-eqz v5, :cond_6

    .line 25
    instance-of v5, v1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBoolFieldView;

    if-eqz v5, :cond_4

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBoolFieldView;

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_42

    invoke-virtual {v4, v2}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v8

    :cond_5
    invoke-virtual {v5, v8}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBoolFieldView;->setChecked(Z)V

    goto/16 :goto_1f

    .line 26
    :cond_6
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/s;

    if-eqz v5, :cond_9

    instance-of v5, v1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataCalendarFieldView;

    if-eqz v5, :cond_7

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataCalendarFieldView;

    goto :goto_2

    :cond_7
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_42

    invoke-virtual {v4, v2}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lcom/sumsub/sns/core/presentation/form/viewutils/b;->a:Ljava/text/SimpleDateFormat;

    if-eqz v4, :cond_8

    .line 27
    :try_start_0
    sget-object v6, Lcom/sumsub/sns/core/presentation/form/viewutils/b;->a:Ljava/text/SimpleDateFormat;

    invoke-virtual {v6, v4}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    :cond_8
    const/4 v4, 0x0

    .line 28
    :goto_3
    invoke-virtual {v5, v4}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataCalendarFieldView;->setSelectedDate(Ljava/util/Date;)V

    goto/16 :goto_1f

    .line 29
    :cond_9
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/u;

    if-eqz v5, :cond_c

    instance-of v5, v1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataDateTimeFieldView;

    if-eqz v5, :cond_a

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataDateTimeFieldView;

    goto :goto_4

    :cond_a
    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_42

    .line 30
    invoke-virtual {v4, v2}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lcom/sumsub/sns/core/presentation/form/viewutils/a;->a:Ljava/text/SimpleDateFormat;

    if-eqz v4, :cond_b

    .line 31
    :try_start_1
    sget-object v6, Lcom/sumsub/sns/core/presentation/form/viewutils/a;->a:Ljava/text/SimpleDateFormat;

    invoke-virtual {v6, v4}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    :cond_b
    const/4 v4, 0x0

    .line 32
    :goto_5
    invoke-virtual {v5, v4}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataDateTimeFieldView;->setSelectedDate(Ljava/util/Date;)V

    goto/16 :goto_1f

    .line 33
    :cond_c
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/T;

    if-eqz v5, :cond_10

    instance-of v5, v1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataRadioGroupView;

    if-eqz v5, :cond_d

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataRadioGroupView;

    goto :goto_6

    :cond_d
    const/4 v5, 0x0

    :goto_6
    if-eqz v5, :cond_42

    invoke-virtual {v4, v2}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-virtual {v5}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataRadioGroupView;->getItems()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/z;

    .line 35
    iget-object v9, v9, Lcom/sumsub/sns/internal/features/data/model/common/z;->a:Ljava/lang/String;

    .line 36
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_7

    :cond_f
    const/4 v8, 0x0

    .line 37
    :goto_7
    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/z;

    invoke-virtual {v5, v8}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataRadioGroupView;->setSelectedItem(Lcom/sumsub/sns/internal/features/data/model/common/z;)V

    goto/16 :goto_1f

    .line 38
    :cond_10
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/V;

    if-eqz v5, :cond_16

    instance-of v5, v1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionFieldView;

    if-eqz v5, :cond_11

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionFieldView;

    goto :goto_8

    :cond_11
    const/4 v5, 0x0

    :goto_8
    if-eqz v5, :cond_42

    .line 39
    invoke-virtual {v4, v2}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object v4

    .line 40
    invoke-virtual {v5}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionFieldView;->getItems()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_12
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_13

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/z;

    .line 41
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/z;->a:Ljava/lang/String;

    .line 42
    invoke-static {v10, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_12

    goto :goto_9

    :cond_13
    const/4 v9, 0x0

    .line 43
    :goto_9
    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/z;

    if-eqz v9, :cond_14

    .line 44
    invoke-virtual {v5, v9}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionFieldView;->setSelectedItem(Lcom/sumsub/sns/internal/features/data/model/common/z;)V

    goto/16 :goto_1f

    :cond_14
    if-nez v4, :cond_15

    goto :goto_a

    :cond_15
    move-object v6, v4

    .line 45
    :goto_a
    invoke-virtual {v5, v6}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setValue(Ljava/lang/String;)V

    goto/16 :goto_1f

    .line 46
    :cond_16
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    if-eqz v5, :cond_1a

    instance-of v5, v1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionCountryFieldView;

    if-eqz v5, :cond_17

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionCountryFieldView;

    goto :goto_b

    :cond_17
    const/4 v5, 0x0

    :goto_b
    if-eqz v5, :cond_42

    .line 47
    move-object v8, v2

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    invoke-virtual {v4, v2}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object v4

    .line 48
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/form/model/q;->f:Ljava/util/Map;

    if-eqz v4, :cond_19

    .line 49
    invoke-interface {v8, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_18

    goto :goto_c

    :cond_18
    move-object v6, v4

    :cond_19
    :goto_c
    invoke-virtual {v5, v6}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionCountryFieldView;->setValue(Ljava/lang/String;)V

    goto/16 :goto_1f

    .line 50
    :cond_1a
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    if-eqz v5, :cond_1e

    instance-of v5, v1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;

    if-eqz v5, :cond_1b

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;

    goto :goto_d

    :cond_1b
    const/4 v5, 0x0

    :goto_d
    if-eqz v5, :cond_42

    .line 51
    move-object v8, v2

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    .line 52
    iget-object v9, v8, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->f:Ljava/util/Map;

    .line 53
    invoke-interface {v9}, Ljava/util/Map;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1d

    invoke-virtual {v4, v8}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1c

    goto :goto_e

    :cond_1c
    move-object v6, v4

    :cond_1d
    :goto_e
    invoke-virtual {v5, v6}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setValue(Ljava/lang/String;)V

    goto/16 :goto_1f

    .line 54
    :cond_1e
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    if-eqz v5, :cond_22

    instance-of v5, v1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;

    if-eqz v5, :cond_1f

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;

    goto :goto_f

    :cond_1f
    const/4 v5, 0x0

    :goto_f
    if-eqz v5, :cond_42

    .line 55
    move-object v6, v2

    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    invoke-virtual {v4, v2}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_20

    .line 56
    new-instance v8, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$Attachment;

    .line 57
    iget-object v9, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->m:Ljava/lang/String;

    .line 58
    iget-object v10, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->l:Ljava/lang/String;

    .line 59
    iget-object v11, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->j:Lcom/sumsub/sns/internal/core/presentation/form/model/A;

    .line 60
    invoke-direct {v8, v4, v9, v10, v11}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/model/A;)V

    .line 61
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->setFiles(Ljava/util/List;)V

    .line 62
    :cond_20
    iget-object v4, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->f:Ljava/lang/String;

    if-nez v4, :cond_21

    .line 63
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->setFiles(Ljava/util/List;)V

    .line 64
    :cond_21
    invoke-virtual {v5}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->getFiles()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    invoke-virtual {v5, v4}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->setShowPickFile(Z)V

    goto/16 :goto_1f

    .line 65
    :cond_22
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/M;

    if-eqz v5, :cond_2c

    instance-of v5, v1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataMutilselectFieldView;

    if-eqz v5, :cond_23

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataMutilselectFieldView;

    goto :goto_10

    :cond_23
    const/4 v5, 0x0

    :goto_10
    if-eqz v5, :cond_42

    .line 66
    move-object v8, v2

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/form/model/M;

    invoke-virtual {v4, v2}, Lcom/sumsub/sns/core/presentation/form/d;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/util/List;

    move-result-object v4

    .line 67
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/form/model/M;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 68
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->i:Ljava/util/List;

    if-nez v8, :cond_24

    goto/16 :goto_1f

    :cond_24
    if-eqz v4, :cond_42

    .line 69
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 70
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_25
    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 71
    check-cast v10, Ljava/lang/String;

    .line 72
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_26
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_27

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;

    .line 73
    iget-object v13, v13, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;->a:Ljava/lang/String;

    .line 74
    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_26

    goto :goto_12

    :cond_27
    const/4 v12, 0x0

    .line 75
    :goto_12
    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;

    if-eqz v12, :cond_2a

    .line 76
    new-instance v10, Lcom/sumsub/sns/internal/features/data/model/common/z;

    .line 77
    iget-object v11, v12, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;->a:Ljava/lang/String;

    if-nez v11, :cond_28

    move-object v11, v6

    .line 78
    :cond_28
    iget-object v13, v12, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;->b:Ljava/lang/String;

    if-nez v13, :cond_29

    move-object v13, v6

    .line 79
    :cond_29
    iget-object v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;->c:Ljava/lang/String;

    .line 80
    invoke-direct {v10, v11, v13, v12}, Lcom/sumsub/sns/internal/features/data/model/common/z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_13

    :cond_2a
    const/4 v10, 0x0

    :goto_13
    if-eqz v10, :cond_25

    .line 81
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 82
    :cond_2b
    invoke-virtual {v5, v9}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataMutilselectFieldView;->setSelectedItems(Ljava/util/List;)V

    goto/16 :goto_1f

    .line 83
    :cond_2c
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    if-eqz v5, :cond_39

    instance-of v5, v1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;

    if-eqz v5, :cond_2d

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;

    goto :goto_14

    :cond_2d
    const/4 v5, 0x0

    :goto_14
    if-eqz v5, :cond_42

    .line 84
    move-object v6, v2

    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/model/K;

    invoke-virtual {v4, v2}, Lcom/sumsub/sns/core/presentation/form/d;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_34

    .line 85
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_2e

    move-object v9, v4

    goto :goto_15

    :cond_2e
    const/4 v9, 0x0

    :goto_15
    if-eqz v9, :cond_34

    .line 86
    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v9, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_16
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_33

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 88
    check-cast v11, Ljava/lang/String;

    .line 89
    iget-object v12, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->n:Ljava/lang/String;

    .line 90
    iget-object v13, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->m:Ljava/util/Map;

    if-eqz v13, :cond_2f

    .line 91
    invoke-interface {v13, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    goto :goto_17

    :cond_2f
    const/4 v13, 0x0

    .line 92
    :goto_17
    iget-object v14, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->k:Ljava/util/List;

    if-eqz v14, :cond_32

    .line 93
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_30
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_31

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object v7, v15

    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/form/model/A;

    .line 94
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/presentation/form/model/A;->a:Ljava/lang/String;

    .line 95
    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_30

    goto :goto_18

    :cond_31
    const/4 v15, 0x0

    :goto_18
    check-cast v15, Lcom/sumsub/sns/internal/core/presentation/form/model/A;

    goto :goto_19

    :cond_32
    const/4 v15, 0x0

    .line 96
    :goto_19
    new-instance v7, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$Attachment;

    invoke-direct {v7, v11, v12, v13, v15}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/model/A;)V

    .line 97
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    .line 98
    :cond_33
    invoke-virtual {v5, v10}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->setFiles(Ljava/util/List;)V

    :cond_34
    if-nez v4, :cond_35

    .line 99
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->setFiles(Ljava/util/List;)V

    .line 100
    :cond_35
    iget-object v4, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/K;->d:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 101
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/common/M0;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/v0;

    .line 102
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->f:Ljava/lang/String;

    .line 103
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lcom/sumsub/sns/internal/features/data/model/common/v0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/M0;

    move-result-object v4

    .line 104
    instance-of v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/B0;

    if-eqz v6, :cond_36

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/B0;

    .line 105
    iget-wide v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/B0;->a:D

    .line 106
    invoke-virtual {v5}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->getFiles()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    int-to-double v9, v4

    sub-double/2addr v6, v9

    invoke-static {v6, v7}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v4

    goto :goto_1a

    .line 107
    :cond_36
    instance-of v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/t0;

    if-eqz v6, :cond_37

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/t0;

    .line 108
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/t0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/K;

    .line 109
    iget-wide v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/K;->b:D

    .line 110
    invoke-virtual {v5}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->getFiles()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    int-to-double v9, v4

    sub-double/2addr v6, v9

    invoke-static {v6, v7}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v4

    goto :goto_1a

    :cond_37
    const v4, 0x7fffffff

    :goto_1a
    if-lez v4, :cond_38

    const/4 v8, 0x1

    .line 111
    :cond_38
    invoke-virtual {v5, v8}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->setShowPickFile(Z)V

    goto/16 :goto_1f

    .line 112
    :cond_39
    instance-of v5, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/o;

    if-eqz v5, :cond_3f

    instance-of v5, v1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataMultipleCountrySelectionFieldView;

    if-eqz v5, :cond_3a

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataMultipleCountrySelectionFieldView;

    goto :goto_1b

    :cond_3a
    const/4 v5, 0x0

    :goto_1b
    if-eqz v5, :cond_42

    .line 113
    move-object v6, v2

    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/form/model/o;

    invoke-virtual {v4, v2}, Lcom/sumsub/sns/core/presentation/form/d;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/util/List;

    move-result-object v4

    if-nez v4, :cond_3b

    .line 114
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 115
    :cond_3b
    iget-object v6, v6, Lcom/sumsub/sns/internal/core/presentation/form/model/o;->f:Ljava/util/Map;

    .line 116
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 117
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3c
    :goto_1c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 118
    check-cast v8, Ljava/lang/String;

    .line 119
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_3d

    const/4 v10, 0x0

    goto :goto_1d

    .line 120
    :cond_3d
    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/country/b;

    invoke-direct {v10, v8, v9}, Lcom/sumsub/sns/internal/features/presentation/country/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1d
    if-eqz v10, :cond_3c

    .line 121
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    .line 122
    :cond_3e
    invoke-virtual {v5, v7}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataMultipleCountrySelectionFieldView;->setSelectedCountries(Ljava/util/List;)V

    goto :goto_1f

    .line 123
    :cond_3f
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/w;

    if-nez v4, :cond_42

    .line 124
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    if-nez v4, :cond_42

    .line 125
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/G;

    if-nez v4, :cond_42

    .line 126
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/y;

    if-nez v4, :cond_42

    .line 127
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/Q;

    if-nez v4, :cond_42

    .line 128
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/X;

    if-nez v4, :cond_42

    .line 129
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/d0;

    if-nez v4, :cond_42

    .line 130
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/h;

    if-nez v4, :cond_42

    .line 131
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/form/model/I;

    if-eqz v4, :cond_40

    goto :goto_1f

    .line 132
    :cond_40
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 133
    :cond_41
    :goto_1e
    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->getEditText()Landroid/widget/EditText;

    move-result-object v5

    if-eqz v5, :cond_42

    invoke-virtual {v4, v2}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    :cond_42
    :goto_1f
    iget-object v4, v0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->c:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->b()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setError(Ljava/lang/CharSequence;)V

    .line 135
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->e()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_43

    .line 136
    sget-object v5, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v5

    invoke-interface {v5, v3, v4}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_20

    :cond_43
    const/4 v3, 0x0

    .line 137
    :goto_20
    invoke-virtual {v1, v3}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setTitleIcon(Landroid/graphics/drawable/Drawable;)V

    .line 138
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->i()Z

    move-result v3

    if-eqz v3, :cond_44

    new-instance v7, Lcom/sumsub/sns/core/presentation/form/viewadapter/l0;

    invoke-direct {v7, v0, v2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/l0;-><init>(Lcom/sumsub/sns/core/presentation/form/viewadapter/o;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V

    goto :goto_21

    :cond_44
    const/4 v7, 0x0

    .line 139
    :goto_21
    invoke-virtual {v1, v7}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setOnTitleClickCallback(Lkotlin/jvm/functions/Function0;)V

    .line 140
    invoke-virtual/range {p0 .. p2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->b(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V

    return-void
.end method

.method public abstract a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;I)V
.end method

.method public final a(Ljava/lang/Object;I)V
    .locals 1

    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 3
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->c:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;

    .line 4
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->reset()V

    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->c:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;

    invoke-virtual {p0, v0, p1, p2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;I)V

    .line 6
    iget-object p2, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->c:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;

    invoke-virtual {p0, p2, p1}, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V

    return-void
.end method

.method public b(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/M0;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/v0;

    .line 7
    .line 8
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->f:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/v0;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/M0;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->getEditText()Landroid/widget/EditText;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/presentation/util/a;->a(Landroid/widget/EditText;Lcom/sumsub/sns/internal/features/data/model/common/M0;)V

    .line 27
    :cond_0
    return-void
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
