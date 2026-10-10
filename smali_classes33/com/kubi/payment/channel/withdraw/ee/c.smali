.class public final Lcom/kubi/payment/channel/withdraw/ee/c;
.super Lcom/kubi/payment/channel/withdraw/common/confirm/CommonWithDrawConfirmVM;
.source "EasyEuroWithdrawConfirmVM.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/kubi/payment/channel/withdraw/ee/EasyEuroWithdrawConfirmVM;",
        "Lcom/kubi/payment/channel/withdraw/common/confirm/CommonWithDrawConfirmVM;",
        "repository",
        "Lcom/kubi/payment/channel/data/source/IChannelRepository;",
        "<init>",
        "(Lcom/kubi/payment/channel/data/source/IChannelRepository;)V",
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
.field public final d0:Lcom/kubi/payment/channel/data/source/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/payment/channel/data/source/a;)V
    .locals 1
    .param p1    # Lcom/kubi/payment/channel/data/source/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "repository"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/kubi/payment/channel/withdraw/common/confirm/CommonWithDrawConfirmVM;-><init>(Lcom/kubi/payment/channel/data/source/a;)V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/payment/channel/withdraw/ee/c;->d0:Lcom/kubi/payment/channel/data/source/a;

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
