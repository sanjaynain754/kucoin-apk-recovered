.class public final Lcom/sumsub/sns/core/presentation/form/viewadapter/B;
.super Lcom/sumsub/sns/core/presentation/form/viewadapter/o;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final d:Lcom/sumsub/sns/core/presentation/form/a;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/SNSApplicantDataFieldView;Lcom/sumsub/sns/core/presentation/form/a;Lcom/sumsub/sns/core/presentation/form/d;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;-><init>(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/core/presentation/form/a;Lcom/sumsub/sns/core/presentation/form/d;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/B;->d:Lcom/sumsub/sns/core/presentation/form/a;

    .line 6
    return-void
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

.method public static final a(Lcom/sumsub/sns/core/presentation/form/viewadapter/B;Lcom/sumsub/sns/internal/core/presentation/form/model/Z;Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/B;->d:Lcom/sumsub/sns/core/presentation/form/a;

    if-eqz v0, :cond_0

    .line 7
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->c:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;

    .line 8
    invoke-static {v1, p1}, Lcom/sumsub/sns/core/presentation/form/g;->a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-interface {v0, p1, v1}, Lcom/sumsub/sns/core/presentation/form/a;->c(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_2

    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    .line 11
    :cond_1
    iget-object p0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/B;->d:Lcom/sumsub/sns/core/presentation/form/a;

    if-eqz p0, :cond_2

    invoke-interface {p0, p1}, Lcom/sumsub/sns/core/presentation/form/a;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V

    .line 12
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/Z;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/sumsub/sns/core/presentation/form/viewadapter/b0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/b0;-><init>(Lcom/sumsub/sns/core/presentation/form/viewadapter/B;Lcom/sumsub/sns/internal/core/presentation/form/model/Z;)V

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setTextChangedCallback(Lkotlin/jvm/functions/Function1;)V

    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->getInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    iget-boolean p2, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;->j:Z

    if-eqz p2, :cond_0

    const/16 p2, 0x8

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 5
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public final bridge synthetic a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/B;->a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/Z;)V

    return-void
.end method

.method public final b(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V
    .locals 2

    .line 1
    .line 2
    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    .line 3
    .line 4
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;->i:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    goto :goto_1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->getEditText()Landroid/widget/EditText;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    instance-of p2, p1, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    check-cast p1, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    .line 27
    :goto_0
    if-eqz p1, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->setMasksString(Ljava/util/List;)V

    .line 31
    :cond_2
    return-void

    .line 32
    .line 33
    .line 34
    :cond_3
    :goto_1
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->b(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V

    .line 35
    return-void
    .line 36
    .line 37
.end method
