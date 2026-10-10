.class final Lcom/revolut/revolutpay/ui/button/RevolutPayButton$applyButtonSize$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revolut/revolutpay/ui/button/RevolutPayButton;->e(Lcom/revolut/revolutpay/api/params/Size;Landroid/widget/TextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $buttonSize:Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;

.field final synthetic this$0:Lcom/revolut/revolutpay/ui/button/RevolutPayButton;


# direct methods
.method public constructor <init>(Lcom/revolut/revolutpay/ui/button/RevolutPayButton;Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$applyButtonSize$2;->this$0:Lcom/revolut/revolutpay/ui/button/RevolutPayButton;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$applyButtonSize$2;->$buttonSize:Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    return-void
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
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    invoke-virtual {p0, p1}, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$applyButtonSize$2;->invoke(Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;)V
    .locals 2
    .param p1    # Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 2
    const-string v0, "$this$updateLayoutParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$applyButtonSize$2;->this$0:Lcom/revolut/revolutpay/ui/button/RevolutPayButton;

    iget-object v1, p0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$applyButtonSize$2;->$buttonSize:Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;

    invoke-virtual {v1}, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;->f()F

    move-result v1

    invoke-static {v0, v1}, Lcom/revolut/revolutpay/ui/button/RevolutPayButton;->b(Lcom/revolut/revolutpay/ui/button/RevolutPayButton;F)I

    move-result v0

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v0, p0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$applyButtonSize$2;->this$0:Lcom/revolut/revolutpay/ui/button/RevolutPayButton;

    iget-object v1, p0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$applyButtonSize$2;->$buttonSize:Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;

    invoke-virtual {v1}, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;->c()F

    move-result v1

    invoke-static {v0, v1}, Lcom/revolut/revolutpay/ui/button/RevolutPayButton;->b(Lcom/revolut/revolutpay/ui/button/RevolutPayButton;F)I

    move-result v0

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget-object v0, p0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$applyButtonSize$2;->this$0:Lcom/revolut/revolutpay/ui/button/RevolutPayButton;

    iget-object v1, p0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$applyButtonSize$2;->$buttonSize:Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;

    invoke-virtual {v1}, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$b;->e()F

    move-result v1

    invoke-static {v0, v1}, Lcom/revolut/revolutpay/ui/button/RevolutPayButton;->b(Lcom/revolut/revolutpay/ui/button/RevolutPayButton;F)I

    move-result v0

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    return-void
.end method
