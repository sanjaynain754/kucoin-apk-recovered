.class public final Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM$a;
.super Landroid/os/CountDownTimer;
.source "BuyCommonConfirmVM.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;->W(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u0006\u001a\u00020\u0003H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM$startCountDown$1",
        "Landroid/os/CountDownTimer;",
        "onTick",
        "",
        "millisUntilFinished",
        "",
        "onFinish",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;


# direct methods
.method public constructor <init>(JLcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;)V
    .locals 2

    .line 1
    .line 2
    iput-object p3, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM$a;->a:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;

    .line 3
    .line 4
    const-wide/16 v0, 0x3e8

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, v0, v1}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 8
    return-void
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
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM$a;->a:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;->P()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;->E(Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;Z)V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM$a;->a:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;->v(Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;)Landroidx/lifecycle/MutableLiveData;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const-string v1, "0"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 21
    return-void
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

.method public onTick(J)V
    .locals 2

    .line 1
    long-to-double p1, p1

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 7
    div-double/2addr p1, v0

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2}, Lkotlin/math/MathKt;->roundToInt(D)I

    .line 11
    move-result p1

    .line 12
    .line 13
    iget-object p2, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM$a;->a:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;->v(Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;)Landroidx/lifecycle/MutableLiveData;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 25
    return-void
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
.end method
