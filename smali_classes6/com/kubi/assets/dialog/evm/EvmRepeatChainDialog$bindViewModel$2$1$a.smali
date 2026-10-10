.class public final Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog$bindViewModel$2$1$a;
.super Ljava/lang/Object;
.source "EvmRepeatChainDialog.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog$bindViewModel$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic b:Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;


# direct methods
.method public constructor <init>(Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog$bindViewModel$2$1$a;->b:Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;

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
.method public final a(Lcom/kubi/assets/dialog/evm/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/dialog/evm/r;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of p2, p1, Lcom/kubi/assets/dialog/evm/r$b;

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog$bindViewModel$2$1$a;->b:Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;->x4(Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;)V

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    instance-of p2, p1, Lcom/kubi/assets/dialog/evm/r$c;

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog$bindViewModel$2$1$a;->b:Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;->y4(Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;)V

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_1
    instance-of p2, p1, Lcom/kubi/assets/dialog/evm/r$d;

    .line 23
    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog$bindViewModel$2$1$a;->b:Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;->z4(Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;)V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_2
    instance-of p2, p1, Lcom/kubi/assets/dialog/evm/r$a;

    .line 33
    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    iget-object p1, p0, Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog$bindViewModel$2$1$a;->b:Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_3
    instance-of p2, p1, Lcom/kubi/assets/dialog/evm/r$e;

    .line 43
    .line 44
    if-eqz p2, :cond_4

    .line 45
    .line 46
    check-cast p1, Lcom/kubi/assets/dialog/evm/r$e;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/kubi/assets/dialog/evm/r$e;->a()Ljava/lang/String;

    .line 50
    move-result-object p1

    .line 51
    const/4 p2, 0x0

    .line 52
    .line 53
    new-array p2, p2, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    return-object p1

    .line 60
    .line 61
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 62
    .line 63
    .line 64
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 65
    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/assets/dialog/evm/r;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog$bindViewModel$2$1$a;->a(Lcom/kubi/assets/dialog/evm/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
