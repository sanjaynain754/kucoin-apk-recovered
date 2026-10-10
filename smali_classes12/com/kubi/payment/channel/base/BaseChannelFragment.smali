.class public abstract Lcom/kubi/payment/channel/base/BaseChannelFragment;
.super Lcom/kubi/payment/base/BasePaymentFragment;
.source "BaseChannelFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VM:",
        "Lcom/kubi/payment/base/BasePaymentVM<",
        "Lcom/kubi/payment/channel/data/source/a;",
        ">;>",
        "Lcom/kubi/payment/base/BasePaymentFragment<",
        "TVM;",
        "Lcom/kubi/payment/channel/data/source/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008&\u0018\u0000*\u000e\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0004B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kubi/payment/channel/base/BaseChannelFragment;",
        "VM",
        "Lcom/kubi/payment/base/BasePaymentVM;",
        "Lcom/kubi/payment/channel/data/source/IChannelRepository;",
        "Lcom/kubi/payment/base/BasePaymentFragment;",
        "<init>",
        "()V",
        "viewModelFactory",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
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
    invoke-direct {p0}, Lcom/kubi/payment/base/BasePaymentFragment;-><init>()V

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
.end method


# virtual methods
.method public A3()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lot/a;->a:Lot/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lot/a;->d()Lcom/kubi/payment/channel/data/source/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lot/b;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v0}, Lot/b;-><init>(Lcom/kubi/payment/channel/data/source/a;)V

    .line 12
    return-object v1
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
.end method
