.class public final Lcom/kubi/assets/search/depositandwithdraw/r0;
.super Ljava/lang/Object;
.source "SearchCoinVM.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "getNewSearchCoinVMHelper",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinVMHelper;",
        "fromType",
        "",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(I)Lcom/kubi/assets/search/depositandwithdraw/q0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper;-><init>()V

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    new-instance p0, Lcom/kubi/assets/search/depositandwithdraw/WithdrawSearchCoinVMHelper;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/kubi/assets/search/depositandwithdraw/WithdrawSearchCoinVMHelper;-><init>()V

    .line 15
    return-object p0
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
.end method
