.class public final Lcom/kubi/assets/dialog/evm/EvmChainListDialog$initViews$3$1$a;
.super Ljava/lang/Object;
.source "EvmChainListDialog.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/dialog/evm/EvmChainListDialog$initViews$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/assets/dialog/evm/EvmChainListDialog;


# direct methods
.method public constructor <init>(Lcom/kubi/assets/dialog/evm/EvmChainListDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/dialog/evm/EvmChainListDialog$initViews$3$1$a;->b:Lcom/kubi/assets/dialog/evm/EvmChainListDialog;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a(Lcom/kubi/assets/dialog/evm/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/dialog/evm/d;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of p2, p1, Lcom/kubi/assets/dialog/evm/d$a;

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/kubi/assets/dialog/evm/EvmChainListDialog$initViews$3$1$a;->b:Lcom/kubi/assets/dialog/evm/EvmChainListDialog;

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lcom/kubi/assets/dialog/evm/EvmChainListDialog;->r4(Lcom/kubi/assets/dialog/evm/EvmChainListDialog;)V

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    sget-object p2, Lcom/kubi/assets/dialog/evm/d$b;->a:Lcom/kubi/assets/dialog/evm/d$b;

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    move-result p2

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lcom/kubi/assets/dialog/evm/EvmChainListDialog$initViews$3$1$a;->b:Lcom/kubi/assets/dialog/evm/EvmChainListDialog;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/kubi/assets/dialog/evm/EvmChainListDialog;->s4(Lcom/kubi/assets/dialog/evm/EvmChainListDialog;)V

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_1
    sget-object p2, Lcom/kubi/assets/dialog/evm/d$c;->a:Lcom/kubi/assets/dialog/evm/d$c;

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    move-result p1

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lcom/kubi/assets/dialog/evm/EvmChainListDialog$initViews$3$1$a;->b:Lcom/kubi/assets/dialog/evm/EvmChainListDialog;

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lcom/kubi/assets/dialog/evm/EvmChainListDialog;->t4(Lcom/kubi/assets/dialog/evm/EvmChainListDialog;)V

    .line 38
    .line 39
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    return-object p1

    .line 41
    .line 42
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 43
    .line 44
    .line 45
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 46
    throw p1
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
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/assets/dialog/evm/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/dialog/evm/EvmChainListDialog$initViews$3$1$a;->a(Lcom/kubi/assets/dialog/evm/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method
