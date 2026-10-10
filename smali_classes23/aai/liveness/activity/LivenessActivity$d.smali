.class public Laai/liveness/activity/LivenessActivity$d;
.super Ljava/lang/Object;
.source "LivenessActivity.java"

# interfaces
.implements Le/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laai/liveness/activity/LivenessActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Laai/liveness/activity/LivenessActivity;


# direct methods
.method public constructor <init>(Laai/liveness/activity/LivenessActivity;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Laai/liveness/activity/LivenessActivity$d;->a:Laai/liveness/activity/LivenessActivity;

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
    .line 24
.end method


# virtual methods
.method public a(Laai/liveness/http/entity/ResultEntity;)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p1, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "NO_RESPONSE"

    .line 7
    .line 8
    iget-object p1, p1, Lai/advance/common/entity/BaseResultEntity;->code:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Laai/liveness/activity/LivenessActivity$d;->a:Laai/liveness/activity/LivenessActivity;

    .line 17
    .line 18
    sget v0, Laai/liveness/activity/R$string;->liveness_failed_reason_bad_network:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, La3d20260409/u;->k(Ljava/lang/String;)V

    .line 26
    .line 27
    :cond_0
    iget-object p1, p0, Laai/liveness/activity/LivenessActivity$d;->a:Laai/liveness/activity/LivenessActivity;

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Laai/liveness/activity/LivenessActivity;->T(Laai/liveness/activity/LivenessActivity;)V

    .line 31
    return-void
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
.end method

.method public b()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Laai/liveness/activity/LivenessActivity$d;->a:Laai/liveness/activity/LivenessActivity;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Laai/liveness/activity/LivenessActivity;->N(Laai/liveness/activity/LivenessActivity;)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    iget-object v0, p0, Laai/liveness/activity/LivenessActivity$d;->a:Laai/liveness/activity/LivenessActivity;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Laai/liveness/activity/LivenessActivity;->O(Laai/liveness/activity/LivenessActivity;)Landroid/widget/TextView;

    .line 16
    move-result-object v0

    .line 17
    const/4 v2, 0x4

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    iget-object v0, p0, Laai/liveness/activity/LivenessActivity$d;->a:Laai/liveness/activity/LivenessActivity;

    .line 23
    .line 24
    iget-object v0, v0, Laai/liveness/activity/LivenessActivity;->j:Laai/liveness/LivenessView;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, La3d20260409/oOOOOOooooOo;->setVisibility(I)V

    .line 28
    .line 29
    iget-object v0, p0, Laai/liveness/activity/LivenessActivity$d;->a:Laai/liveness/activity/LivenessActivity;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Laai/liveness/activity/LivenessActivity;->P(Laai/liveness/activity/LivenessActivity;)Landroid/widget/CheckBox;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    iget-object v0, p0, Laai/liveness/activity/LivenessActivity$d;->a:Laai/liveness/activity/LivenessActivity;

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Laai/liveness/activity/LivenessActivity;->Q(Laai/liveness/activity/LivenessActivity;)Landroid/widget/ImageView;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 46
    .line 47
    iget-object v0, p0, Laai/liveness/activity/LivenessActivity$d;->a:Laai/liveness/activity/LivenessActivity;

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Laai/liveness/activity/LivenessActivity;->R(Laai/liveness/activity/LivenessActivity;)Landroid/widget/TextView;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    iget-object v0, p0, Laai/liveness/activity/LivenessActivity$d;->a:Laai/liveness/activity/LivenessActivity;

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Laai/liveness/activity/LivenessActivity;->S(Laai/liveness/activity/LivenessActivity;)Landroid/view/View;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 64
    return-void
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
.end method

.method public c(Laai/liveness/http/entity/ResultEntity;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Laai/liveness/activity/LivenessActivity$d;->a:Laai/liveness/activity/LivenessActivity;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Laai/liveness/activity/LivenessActivity;->T(Laai/liveness/activity/LivenessActivity;)V

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
.end method
