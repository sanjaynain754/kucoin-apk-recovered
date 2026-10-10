.class public final Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment$b;
.super Lcom/kubi/sdk/util/c1;
.source "AbsFiatWithdrawInputFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;->e4(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment$getWithdrawAccounts$2",
        "Lcom/kubi/sdk/util/SimpleThrowableConsumer;",
        "accept",
        "",
        "throwable",
        "",
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
.field public final synthetic d:Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment$b;->d:Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/kubi/sdk/util/c1;-><init>(Lcom/kubi/sdk/base/ui/g;)V

    .line 6
    return-void
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


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment$b;->b(Ljava/lang/Throwable;)V

    .line 6
    return-void
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

.method public b(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/util/c1;->b(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    instance-of v0, p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment$b;->d:Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

    .line 10
    .line 11
    check-cast p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p1}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;->M3(Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;Lcom/kubi/network/retrofit/exception/ApiException;)V

    .line 15
    :cond_0
    return-void
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
