.class public final Lcom/revolut/revolutpay/ui_kit/delegate/a$c;
.super Lra0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revolut/revolutpay/ui_kit/delegate/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lra0/a<",
        "Lcom/revolut/revolutpay/ui_kit/delegate/a$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:Lcom/revolut/revolutpay/ui_kit/widget/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/revolut/revolutpay/ui_kit/widget/a;)V
    .locals 1
    .param p1    # Lcom/revolut/revolutpay/ui_kit/widget/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "rowWidget"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lra0/a;-><init>(Landroid/view/View;)V

    .line 10
    .line 11
    iput-object p1, p0, Lcom/revolut/revolutpay/ui_kit/delegate/a$c;->g:Lcom/revolut/revolutpay/ui_kit/widget/a;

    .line 12
    return-void
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


# virtual methods
.method public final a(Landroid/view/View$OnClickListener;)V
    .locals 1
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/revolut/revolutpay/ui_kit/delegate/a$c;->g:Lcom/revolut/revolutpay/ui_kit/widget/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    return-void
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

.method public b(Lcom/revolut/revolutpay/ui_kit/delegate/a$b;)V
    .locals 2
    .param p1    # Lcom/revolut/revolutpay/ui_kit/delegate/a$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "item"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/revolut/revolutpay/ui_kit/delegate/a$c;->g:Lcom/revolut/revolutpay/ui_kit/widget/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;->e()Lxa0/a;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/revolut/revolutpay/ui_kit/widget/a;->setTitle$revolut_pay_sdk_2_0_release(Lxa0/a;)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/revolut/revolutpay/ui_kit/delegate/a$c;->g:Lcom/revolut/revolutpay/ui_kit/widget/a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;->d()Lxa0/a;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/revolut/revolutpay/ui_kit/widget/a;->setSubtitle$revolut_pay_sdk_2_0_release(Lxa0/a;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;->c()Lcom/revolut/revolutpay/ui_kit/delegate/a$a;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    instance-of v1, v0, Lcom/revolut/revolutpay/ui_kit/delegate/a$a$b;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lcom/revolut/revolutpay/ui_kit/delegate/a$c;->g:Lcom/revolut/revolutpay/ui_kit/widget/a;

    .line 34
    .line 35
    const/16 v1, 0x28

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {v0, v1}, Lcom/revolut/revolutpay/ui_kit/widget/a;->setImageSize$revolut_pay_sdk_2_0_release(I)V

    .line 39
    goto :goto_1

    .line 40
    .line 41
    :cond_0
    instance-of v0, v0, Lcom/revolut/revolutpay/ui_kit/delegate/a$a$a;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Lcom/revolut/revolutpay/ui_kit/delegate/a$c;->g:Lcom/revolut/revolutpay/ui_kit/widget/a;

    .line 46
    .line 47
    const/16 v1, 0x18

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/revolut/revolutpay/ui_kit/delegate/a$c;->g:Lcom/revolut/revolutpay/ui_kit/widget/a;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;->c()Lcom/revolut/revolutpay/ui_kit/delegate/a$a;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/revolut/revolutpay/ui_kit/delegate/a$a;->a()Lxa0/c;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/revolut/revolutpay/ui_kit/widget/a;->setMainImage$revolut_pay_sdk_2_0_release(Lxa0/c;)V

    .line 62
    .line 63
    iget-object v0, p0, Lcom/revolut/revolutpay/ui_kit/delegate/a$c;->g:Lcom/revolut/revolutpay/ui_kit/widget/a;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/revolut/revolutpay/ui_kit/delegate/a$b;->b()Lxa0/c;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lcom/revolut/revolutpay/ui_kit/widget/a;->setBadgeImage$revolut_pay_sdk_2_0_release(Lxa0/c;)V

    .line 71
    return-void
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
