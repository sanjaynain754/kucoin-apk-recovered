.class public final Lcom/sumsub/sns/core/presentation/form/viewadapter/A;
.super Lcom/sumsub/sns/core/presentation/form/viewadapter/o;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final d:Lcom/sumsub/sns/core/presentation/form/a;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTextAreaFieldView;Lcom/sumsub/sns/core/presentation/form/a;Lcom/sumsub/sns/core/presentation/form/d;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;-><init>(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/core/presentation/form/a;Lcom/sumsub/sns/core/presentation/form/d;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/A;->d:Lcom/sumsub/sns/core/presentation/form/a;

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

.method public static final a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTextAreaFieldView;Lcom/sumsub/sns/core/presentation/form/viewadapter/A;Lcom/sumsub/sns/internal/core/presentation/form/model/b0;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->getEditText()Landroid/widget/EditText;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-nez p3, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    iget-object p3, p1, Lcom/sumsub/sns/core/presentation/form/viewadapter/A;->d:Lcom/sumsub/sns/core/presentation/form/a;

    if-eqz p3, :cond_2

    invoke-interface {p3, p2}, Lcom/sumsub/sns/core/presentation/form/a;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V

    .line 5
    :cond_2
    :goto_1
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/form/viewadapter/A;->d:Lcom/sumsub/sns/core/presentation/form/a;

    if-eqz p1, :cond_3

    .line 6
    invoke-static {p0, p2}, Lcom/sumsub/sns/core/presentation/form/g;->a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object p0

    .line 7
    invoke-interface {p1, p2, p0}, Lcom/sumsub/sns/core/presentation/form/a;->c(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V

    .line 8
    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTextAreaFieldView;

    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/form/model/b0;

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/A;->a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTextAreaFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/b0;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTextAreaFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/b0;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/sumsub/sns/core/presentation/form/viewadapter/a0;

    invoke-direct {v0, p1, p0, p2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/a0;-><init>(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTextAreaFieldView;Lcom/sumsub/sns/core/presentation/form/viewadapter/A;Lcom/sumsub/sns/internal/core/presentation/form/model/b0;)V

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setTextChangedCallback(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
