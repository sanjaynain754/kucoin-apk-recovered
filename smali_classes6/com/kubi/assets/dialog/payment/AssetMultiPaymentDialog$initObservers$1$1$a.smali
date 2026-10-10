.class public final Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog$initObservers$1$1$a;
.super Ljava/lang/Object;
.source "AssetMultiPaymentDialog.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog$initObservers$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic b:Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog;


# direct methods
.method public constructor <init>(Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog$initObservers$1$1$a;->b:Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog;

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
.method public final a(Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object p2, Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$a$a;->a:Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$a$a;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result p2

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog$initObservers$1$1$a;->b:Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    sget-object p2, Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$a$c;->a:Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$a$c;

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result p2

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog$initObservers$1$1$a;->b:Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog;

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog;->u4(Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog;)V

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_1
    sget-object p2, Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$a$b;->a:Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$a$b;

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result p1

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget-object p1, p0, Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog$initObservers$1$1$a;->b:Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog;->v4(Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog;)V

    .line 42
    .line 43
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 44
    return-object p1
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

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/dialog/payment/AssetMultiPaymentDialog$initObservers$1$1$a;->a(Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
