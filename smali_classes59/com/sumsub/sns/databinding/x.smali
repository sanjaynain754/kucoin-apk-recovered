.class public final Lcom/sumsub/sns/databinding/x;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final a:Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;

.field public final b:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

.field public final c:Lcom/sumsub/sns/core/widget/SNSH1TextView;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/databinding/x;->a:Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/databinding/x;->b:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/databinding/x;->c:Lcom/sumsub/sns/core/widget/SNSH1TextView;

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

.method public static a(Landroid/view/View;)Lcom/sumsub/sns/databinding/x;
    .locals 4

    .line 1
    move-object v0, p0

    .line 2
    .line 3
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;

    .line 4
    .line 5
    sget v1, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 9
    move-result-object v2

    .line 10
    .line 11
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    sget v1, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    sget v1, Lcom/sumsub/sns/R$id;->sns_progress_bar:I

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSProgressBarView;

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    sget v1, Lcom/sumsub/sns/R$id;->sns_reviewing_content_subtitle:I

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    sget v1, Lcom/sumsub/sns/R$id;->sns_reviewing_content_title:I

    .line 46
    .line 47
    .line 48
    invoke-static {p0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 52
    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    new-instance p0, Lcom/sumsub/sns/databinding/x;

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v0, v2, v3}, Lcom/sumsub/sns/databinding/x;-><init>(Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 59
    return-object p0

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 67
    move-result-object p0

    .line 68
    .line 69
    new-instance v0, Ljava/lang/NullPointerException;

    .line 70
    .line 71
    const-string v1, "Missing required view with ID: "

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    move-result-object p0

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 79
    throw v0
    .line 80
    .line 81
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/databinding/x;->a:Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method
