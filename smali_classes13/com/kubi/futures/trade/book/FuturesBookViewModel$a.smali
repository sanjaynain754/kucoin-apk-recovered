.class public final Lcom/kubi/futures/trade/book/FuturesBookViewModel$a;
.super Landroid/os/CountDownTimer;
.source "FuturesBookViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/futures/trade/book/FuturesBookViewModel;->G0(Ljava/lang/Long;)V
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
        "com/kubi/futures/trade/book/FuturesBookViewModel$startUpFundingRateCountdown$1",
        "Landroid/os/CountDownTimer;",
        "onTick",
        "",
        "millisUntilFinished",
        "",
        "onFinish",
        "KumexLib_googleRelease"
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
.field public final synthetic a:Lcom/kubi/futures/trade/book/FuturesBookViewModel;


# direct methods
.method public constructor <init>(Lcom/kubi/futures/trade/book/FuturesBookViewModel;J)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/futures/trade/book/FuturesBookViewModel$a;->a:Lcom/kubi/futures/trade/book/FuturesBookViewModel;

    .line 3
    .line 4
    const-wide/16 v0, 0x3e8

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2, p3, v0, v1}, Landroid/os/CountDownTimer;-><init>(JJ)V

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
.end method


# virtual methods
.method public onFinish()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/book/FuturesBookViewModel$a;->a:Lcom/kubi/futures/trade/book/FuturesBookViewModel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/futures/trade/book/FuturesBookViewModel;->j0()Landroidx/lifecycle/MutableLiveData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/futures/trade/book/FuturesBookViewModel$a;->a:Lcom/kubi/futures/trade/book/FuturesBookViewModel;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/kubi/futures/trade/book/FuturesBookViewModel;->V(Lcom/kubi/futures/trade/book/FuturesBookViewModel;)V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/futures/trade/book/FuturesBookViewModel$a;->a:Lcom/kubi/futures/trade/book/FuturesBookViewModel;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/kubi/futures/trade/book/FuturesBookViewModel;->S(Lcom/kubi/futures/trade/book/FuturesBookViewModel;)V

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public onTick(J)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/book/FuturesBookViewModel$a;->a:Lcom/kubi/futures/trade/book/FuturesBookViewModel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/futures/trade/book/FuturesBookViewModel;->j0()Landroidx/lifecycle/MutableLiveData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const/16 v1, 0x3e8

    .line 9
    int-to-long v1, v1

    .line 10
    div-long/2addr p1, v1

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 18
    return-void
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
.end method
