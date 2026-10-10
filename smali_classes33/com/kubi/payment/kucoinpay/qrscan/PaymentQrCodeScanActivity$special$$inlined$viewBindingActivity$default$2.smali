.class public final Lcom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity$special$$inlined$viewBindingActivity$default$2;
.super Lkotlin/jvm/internal/Lambda;
.source "ActivityViewBindings.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity;",
        "Lft/r0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0003\"\u0008\u0008\u0001\u0010\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "T",
        "A",
        "Landroidx/activity/ComponentActivity;",
        "Landroidx/viewbinding/ViewBinding;",
        "activity",
        "invoke",
        "(Landroidx/activity/ComponentActivity;)Landroidx/viewbinding/ViewBinding;",
        "com/kubi/sdk/viewbindingdelegate/ActivityViewBindings$viewBinding1$3"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nActivityViewBindings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings$viewBinding1$3\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings$viewBinding$1\n+ 3 PaymentQrCodeScanActivity.kt\ncom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity\n*L\n1#1,109:1\n47#2:110\n68#3:111\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    return-void
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
.end method


# virtual methods
.method public final invoke(Landroidx/activity/ComponentActivity;)Landroidx/viewbinding/ViewBinding;
    .locals 1
    .param p1    # Landroidx/activity/ComponentActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity;",
            ")",
            "Lft/r0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lw00/b;->a(Landroid/app/Activity;)Landroid/view/View;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lft/r0;->a(Landroid/view/View;)Lft/r0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/activity/ComponentActivity;

    invoke-virtual {p0, p1}, Lcom/kubi/payment/kucoinpay/qrscan/PaymentQrCodeScanActivity$special$$inlined$viewBindingActivity$default$2;->invoke(Landroidx/activity/ComponentActivity;)Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    return-object p1
.end method
