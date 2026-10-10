.class public Lcom/hcaptcha/sdk/HCaptchaDialogFragment$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hcaptcha/sdk/HCaptchaDialogFragment;->g3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/hcaptcha/sdk/HCaptchaDialogFragment;


# direct methods
.method public constructor <init>(Lcom/hcaptcha/sdk/HCaptchaDialogFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaDialogFragment$a;->a:Lcom/hcaptcha/sdk/HCaptchaDialogFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

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
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaDialogFragment$a;->a:Lcom/hcaptcha/sdk/HCaptchaDialogFragment;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/hcaptcha/sdk/HCaptchaDialogFragment;->f3(Lcom/hcaptcha/sdk/HCaptchaDialogFragment;)Landroid/widget/LinearLayout;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaDialogFragment$a;->a:Lcom/hcaptcha/sdk/HCaptchaDialogFragment;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/hcaptcha/sdk/HCaptchaDialogFragment;->f3(Lcom/hcaptcha/sdk/HCaptchaDialogFragment;)Landroid/widget/LinearLayout;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method
