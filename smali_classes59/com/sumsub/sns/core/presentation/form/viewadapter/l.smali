.class public final Lcom/sumsub/sns/core/presentation/form/viewadapter/l;
.super Lcom/sumsub/sns/core/presentation/form/viewadapter/o;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final d:Lcom/sumsub/sns/core/presentation/form/a;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;Lcom/sumsub/sns/core/presentation/form/a;Lcom/sumsub/sns/core/presentation/form/d;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;-><init>(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/core/presentation/form/a;Lcom/sumsub/sns/core/presentation/form/d;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/l;->d:Lcom/sumsub/sns/core/presentation/form/a;

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

.method public static final a(Lcom/sumsub/sns/core/presentation/form/viewadapter/l;Lcom/sumsub/sns/internal/core/presentation/form/model/C;Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;)Lkotlin/Unit;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/l;->d:Lcom/sumsub/sns/core/presentation/form/a;

    if-eqz p0, :cond_0

    invoke-virtual {p2}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->getPickFileAnchor$idensic_mobile_sdk_aar_defaultRelease()Landroid/view/View;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/form/h;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Landroid/view/View;)V

    .line 19
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/core/presentation/form/viewadapter/l;Lcom/sumsub/sns/internal/core/presentation/form/model/C;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/l;->d:Lcom/sumsub/sns/core/presentation/form/a;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/form/a;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V

    .line 21
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->c:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;

    .line 23
    check-cast v0, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->cleanup()V

    return-void
.end method

.method public final bridge synthetic a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;

    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/form/model/C;

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/l;->a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/C;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/C;)V
    .locals 4

    .line 2
    new-instance v0, Lcom/sumsub/sns/core/presentation/form/viewadapter/i0;

    invoke-direct {v0, p0, p2, p1}, Lcom/sumsub/sns/core/presentation/form/viewadapter/i0;-><init>(Lcom/sumsub/sns/core/presentation/form/viewadapter/l;Lcom/sumsub/sns/internal/core/presentation/form/model/C;Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;)V

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->setPickFileClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 3
    new-instance v0, Lcom/sumsub/sns/core/presentation/form/viewadapter/j0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/j0;-><init>(Lcom/sumsub/sns/core/presentation/form/viewadapter/l;Lcom/sumsub/sns/internal/core/presentation/form/model/C;)V

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->setDeleteFileClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 4
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    const-string v0, ""

    :goto_0
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->setPickFileLabel(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->k:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 7
    sget-object v1, Lcom/sumsub/sns/core/presentation/form/viewadapter/k;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    if-ne v0, v2, :cond_1

    .line 8
    sget-object v0, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;->DEFAULT:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;

    goto :goto_1

    .line 9
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 10
    :cond_2
    sget-object v0, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;->LOADING:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;

    .line 11
    :goto_1
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->setState(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;)V

    .line 12
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/C;->i:Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;

    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v1, p2

    if-eq p2, v3, :cond_4

    if-ne p2, v2, :cond_3

    .line 14
    sget-object p2, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;->DEFAULT:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;

    goto :goto_2

    .line 15
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 16
    :cond_4
    sget-object p2, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;->LOADING:Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView$State;

    .line 17
    :goto_2
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataFileFieldView;->setItemStates(Ljava/util/List;)V

    return-void
.end method
