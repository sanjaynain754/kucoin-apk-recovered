.class public final Lcom/kubi/payment/fast/sell/p2p/P2PSellConfirmFragment$Companion;
.super Ljava/lang/Object;
.source "P2PSellConfirmFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/payment/fast/sell/p2p/P2PSellConfirmFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/payment/fast/sell/p2p/P2PSellConfirmFragment$Companion;",
        "",
        "<init>",
        "()V",
        "launch",
        "",
        "context",
        "Landroid/content/Context;",
        "extraParams",
        "Lcom/kubi/payment/fast/common/confirm/p2p/P2PExtraParams;",
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

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/payment/fast/sell/p2p/P2PSellConfirmFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final launch(Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/p2p/P2PExtraParams;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fast/common/confirm/p2p/P2PExtraParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "extraParams"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/sdk/BaseActivity;->Companion:Lcom/kubi/sdk/BaseActivity$Companion;

    .line 13
    .line 14
    new-instance v1, Lcom/kubi/utils/h;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Lcom/kubi/utils/h;-><init>()V

    .line 18
    .line 19
    sget v2, Lcom/kubi/otc/R$string;->pay_fast_confirm_sell_title:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    const-string v3, "title"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v3, v2}, Lcom/kubi/utils/h;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/utils/h;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    const-string v2, "data"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2, p2}, Lcom/kubi/utils/h;->e(Ljava/lang/String;Landroid/os/Parcelable;)Lcom/kubi/utils/h;

    .line 35
    move-result-object p2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lcom/kubi/utils/h;->a()Landroid/os/Bundle;

    .line 39
    move-result-object p2

    .line 40
    .line 41
    const-class v1, Lcom/kubi/payment/fast/sell/p2p/P2PSellConfirmFragment;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1, v1, p2}, Lcom/kubi/sdk/BaseActivity$Companion;->launch(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 45
    return-void
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
