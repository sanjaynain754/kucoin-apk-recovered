.class public final Lcom/kubi/payment/fasttrade/sell/paymentmethod/a;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SellPaymentMethodAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
        "Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/payment/fasttrade/sell/paymentmethod/SellPaymentMethodDiffCallBack;",
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;",
        "Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;",
        "<init>",
        "()V",
        "areItemsTheSame",
        "",
        "oldItem",
        "newItem",
        "areContentsTheSame",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/DiffUtil$ItemCallback;-><init>()V

    .line 4
    return-void
    .line 5
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
.method public a(Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;)Z
    .locals 1
    .param p1    # Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "oldItem"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "newItem"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result p1

    .line 15
    return p1
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

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;

    .line 3
    .line 4
    check-cast p2, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fasttrade/sell/paymentmethod/a;->a(Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;)Z

    .line 8
    move-result p1

    .line 9
    return p1
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

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;

    .line 3
    .line 4
    check-cast p2, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fasttrade/sell/paymentmethod/a;->b(Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;)Z

    .line 8
    move-result p1

    .line 9
    return p1
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

.method public b(Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;)Z
    .locals 3
    .param p1    # Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "oldItem"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "newItem"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    instance-of v0, p1, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemCategory;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    instance-of v0, p2, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemCategory;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    check-cast p1, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemCategory;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemCategory;->getTitle()Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    check-cast p2, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemCategory;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemCategory;->getTitle()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemCategory;->getCanEdit()Z

    .line 41
    move-result p1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemCategory;->getCanEdit()Z

    .line 45
    move-result p2

    .line 46
    .line 47
    if-ne p1, p2, :cond_0

    .line 48
    const/4 p1, 0x1

    .line 49
    return p1

    .line 50
    :cond_0
    return v1
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
