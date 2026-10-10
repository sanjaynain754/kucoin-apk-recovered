.class final Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SellBankCardConfirmInterceptor.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor;->f(Lay/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/m0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.payment.fasttrade.sell.confirm.bankcard.SellBankCardConfirmInterceptor$handleJump$1"
    f = "SellBankCardConfirmInterceptor.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x5e
    }
    m = "invokeSuspend"
    n = {
        "bundle",
        "cardId",
        "confirmExtraParamsString",
        "this_$iv",
        "json$iv",
        "$i$f$fromJsonOrNull"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSellBankCardConfirmInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellBankCardConfirmInterceptor.kt\ncom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,89:1\n48#2,2:90\n48#2,2:95\n48#2,2:97\n196#3,3:92\n*S KotlinDebug\n*F\n+ 1 SellBankCardConfirmInterceptor.kt\ncom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1\n*L\n56#1:90,2\n64#1:95,2\n71#1:97,2\n62#1:92,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $postcard:Lay/a;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lay/a;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lay/a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->$postcard:Lay/a;

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    return-void
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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
.end method

.method public static synthetic a(Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->f(Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final f(Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment;->Z:Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment$Companion;

    .line 3
    const/4 v4, 0x4

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v2, p0

    .line 7
    move-object v1, p1

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment$Companion;->launch$default(Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment$Companion;Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;Ljava/lang/String;ILjava/lang/Object;)V

    .line 11
    .line 12
    instance-of p0, v1, Lcom/kubi/otc/PaymentWebActivity;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 18
    .line 19
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    return-object p0
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


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance p1, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->$postcard:Lay/a;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;-><init>(Lay/a;Lkotlin/coroutines/Continuation;)V

    .line 8
    return-object p1
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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->label:I

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->L$4:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->L$3:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lcom/kubi/utils/x;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->L$2:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->L$1:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    throw p1

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    .line 50
    iget-object p1, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->$postcard:Lay/a;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lay/a;->d()Landroid/os/Bundle;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    const-string v1, "cardId"

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v1}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    const-string v5, "extraParams"

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v5}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    move-result-object v5

    .line 67
    .line 68
    if-eqz v5, :cond_9

    .line 69
    .line 70
    .line 71
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 72
    move-result v6

    .line 73
    .line 74
    if-nez v6, :cond_2

    .line 75
    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_2
    sget-object v6, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 79
    .line 80
    new-instance v7, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1$invokeSuspend$$inlined$fromJsonOrNull$1;

    .line 81
    .line 82
    .line 83
    invoke-direct {v7, v5, v4}, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1$invokeSuspend$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v7}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 87
    move-result-object v7

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 91
    move-result-object v8

    .line 92
    .line 93
    .line 94
    invoke-static {v7, v8}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 95
    move-result-object v7

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    iput-object p1, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v1, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->L$1:Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    iput-object p1, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->L$2:Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    iput-object p1, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->L$3:Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    iput-object p1, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->L$4:Ljava/lang/Object;

    .line 122
    const/4 p1, 0x0

    .line 123
    .line 124
    iput p1, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->I$0:I

    .line 125
    .line 126
    iput v2, p0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$handleJump$1;->label:I

    .line 127
    .line 128
    .line 129
    invoke-static {v7, p0}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 130
    move-result-object p1

    .line 131
    .line 132
    if-ne p1, v0, :cond_3

    .line 133
    return-object v0

    .line 134
    :cond_3
    move-object v0, v1

    .line 135
    .line 136
    :goto_0
    check-cast p1, Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;

    .line 137
    .line 138
    if-nez p1, :cond_4

    .line 139
    .line 140
    new-instance v5, Lcom/kubi/otc/exception/OtcMessage;

    .line 141
    const/4 v9, 0x4

    .line 142
    const/4 v10, 0x0

    .line 143
    .line 144
    const-string v6, "confirmExtraParams is null"

    .line 145
    .line 146
    const-string v7, "SellBankCardConfirmInterceptor"

    .line 147
    const/4 v8, 0x0

    .line 148
    .line 149
    .line 150
    invoke-direct/range {v5 .. v10}, Lcom/kubi/otc/exception/OtcMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v5, v4, v3, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 154
    .line 155
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 156
    return-object p1

    .line 157
    .line 158
    :cond_4
    if-eqz v0, :cond_6

    .line 159
    .line 160
    .line 161
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 162
    move-result v1

    .line 163
    .line 164
    if-nez v1, :cond_5

    .line 165
    goto :goto_1

    .line 166
    .line 167
    .line 168
    :cond_5
    invoke-virtual {p1, v0}, Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;->setCardId(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_6
    :goto_1
    invoke-virtual {p1}, Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;->getCardId()Ljava/lang/String;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    if-eqz v0, :cond_8

    .line 175
    .line 176
    .line 177
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 178
    move-result v0

    .line 179
    .line 180
    if-nez v0, :cond_7

    .line 181
    goto :goto_2

    .line 182
    .line 183
    :cond_7
    new-instance v0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/e;

    .line 184
    .line 185
    .line 186
    invoke-direct {v0, p1}, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/e;-><init>(Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v0}, Lny/b;->c(Lkotlin/jvm/functions/Function1;)V

    .line 190
    .line 191
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 192
    return-object p1

    .line 193
    .line 194
    :cond_8
    :goto_2
    new-instance v5, Lcom/kubi/otc/exception/OtcMessage;

    .line 195
    const/4 v9, 0x4

    .line 196
    const/4 v10, 0x0

    .line 197
    .line 198
    const-string v6, "cardId is null or empty"

    .line 199
    .line 200
    const-string v7, "SellBankCardConfirmInterceptor"

    .line 201
    const/4 v8, 0x0

    .line 202
    .line 203
    .line 204
    invoke-direct/range {v5 .. v10}, Lcom/kubi/otc/exception/OtcMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v5, v4, v3, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 208
    .line 209
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 210
    return-object p1

    .line 211
    .line 212
    :cond_9
    :goto_3
    new-instance v5, Lcom/kubi/otc/exception/OtcMessage;

    .line 213
    const/4 v9, 0x4

    .line 214
    const/4 v10, 0x0

    .line 215
    .line 216
    const-string v6, "confirmExtraParamsString is null or empty"

    .line 217
    .line 218
    const-string v7, "SellBankCardConfirmInterceptor"

    .line 219
    const/4 v8, 0x0

    .line 220
    .line 221
    .line 222
    invoke-direct/range {v5 .. v10}, Lcom/kubi/otc/exception/OtcMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 223
    .line 224
    .line 225
    invoke-static {v5, v4, v3, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 226
    .line 227
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 228
    return-object p1
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
.end method
