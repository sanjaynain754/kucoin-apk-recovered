.class Lcom/facebook/react/devsupport/RedBoxContentView$1;
.super Ljava/lang/Object;
.source "RedBoxContentView.java"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/RedBoxContentView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/RedBoxContentView;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public onReportError(Landroid/text/SpannedString;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/RedBoxContentView;->i(Lcom/facebook/react/devsupport/RedBoxContentView;Z)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->f(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/Button;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Landroid/widget/Button;

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->d(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/ProgressBar;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    check-cast v0, Landroid/widget/ProgressBar;

    .line 35
    .line 36
    const/16 v1, 0x8

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->h(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    check-cast v0, Landroid/widget/TextView;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    return-void
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
.end method

.method public onReportSuccess(Landroid/text/SpannedString;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/RedBoxContentView;->i(Lcom/facebook/react/devsupport/RedBoxContentView;Z)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->f(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/Button;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Landroid/widget/Button;

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->d(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/ProgressBar;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    check-cast v0, Landroid/widget/ProgressBar;

    .line 35
    .line 36
    const/16 v1, 0x8

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->h(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    check-cast v0, Landroid/widget/TextView;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    return-void
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
.end method
