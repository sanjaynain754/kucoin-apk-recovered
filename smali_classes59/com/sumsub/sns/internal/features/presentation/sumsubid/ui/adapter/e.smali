.class public final Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/e;
.super Lcom/sumsub/sns/core/presentation/base/adapter/c;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic g:I


# instance fields
.field public final a:Lcom/sumsub/sns/databinding/H;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/presentation/base/adapter/c;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    sget v0, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget v0, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    new-instance v0, Lcom/sumsub/sns/databinding/H;

    .line 26
    .line 27
    check-cast p1, Landroid/widget/LinearLayout;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p1, v1, v2}, Lcom/sumsub/sns/databinding/H;-><init>(Landroid/widget/LinearLayout;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 31
    .line 32
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/e;->a:Lcom/sumsub/sns/databinding/H;

    .line 33
    return-void

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    new-instance v0, Ljava/lang/NullPointerException;

    .line 44
    .line 45
    const-string v1, "Missing required view with ID: "

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    throw v0
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
.end method


# virtual methods
.method public final a(Ljava/lang/Object;I)V
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;

    .line 3
    .line 4
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/k;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/e;->a:Lcom/sumsub/sns/databinding/H;

    .line 10
    .line 11
    iget-object p2, p2, Lcom/sumsub/sns/databinding/H;->c:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 12
    .line 13
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/k;

    .line 14
    .line 15
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/k;->a:Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/e;->a:Lcom/sumsub/sns/databinding/H;

    .line 21
    .line 22
    iget-object p2, p2, Lcom/sumsub/sns/databinding/H;->b:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/k;->b:Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    return-void
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
