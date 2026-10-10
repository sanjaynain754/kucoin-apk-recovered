.class final Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "KCRNBridgePaymentCallImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl;->N(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
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
    c = "com.kubi.payment.rn.KCRNBridgePaymentCallImpl$showCouponPopup$1$1"
    f = "KCRNBridgePaymentCallImpl.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x27c
    }
    m = "invokeSuspend"
    n = {
        "viewModelFactory",
        "viewModel$delegate",
        "this_$iv",
        "json$iv",
        "$i$f$fromJsonOrNull"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKCRNBridgePaymentCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,620:1\n75#2,13:621\n196#3,3:634\n*S KotlinDebug\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1\n*L\n380#1:621,13\n381#1:634,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Boolean;",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $data:Ljava/lang/String;

.field final synthetic $this_run:Landroidx/fragment/app/FragmentActivity;

.field final synthetic $topActivity:Landroid/app/Activity;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentActivity;",
            "Ljava/lang/String;",
            "Landroid/app/Activity;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$this_run:Landroidx/fragment/app/FragmentActivity;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$data:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$topActivity:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 9
    const/4 p1, 0x2

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 13
    return-void
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
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public static synthetic a(Ltt/b;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->f(Ltt/b;)Landroidx/lifecycle/ViewModelProvider$Factory;

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
.end method

.method public static final f(Ltt/b;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
    .line 4
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

.method public static final g(Lkotlin/Lazy;)Lcom/kubi/payment/fasttradev2/FastTradeViewModel;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Lcom/kubi/payment/fasttradev2/FastTradeViewModel;",
            ">;)",
            "Lcom/kubi/payment/fasttradev2/FastTradeViewModel;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel;

    .line 7
    return-object p0
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
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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
    new-instance v0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$this_run:Landroidx/fragment/app/FragmentActivity;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$data:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$topActivity:Landroid/app/Activity;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 11
    move-object v5, p2

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;-><init>(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    .line 15
    return-object v0
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

    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->label:I

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->L$3:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->L$2:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/kubi/utils/x;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->L$1:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lkotlin/Lazy;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->L$0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ltt/b;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    throw p1

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    new-instance p1, Ltt/b;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ltt/a;->d()Lcom/kubi/payment/fast/data/source/a;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    sget-object v4, Lcom/kubi/sdk/BaseApplication;->Companion:Lcom/kubi/sdk/BaseApplication$Companion;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Lcom/kubi/sdk/BaseApplication$Companion;->get()Landroid/app/Application;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, v1, v4}, Ltt/b;-><init>(Lcom/kubi/payment/fast/data/source/a;Landroid/app/Application;)V

    .line 59
    .line 60
    iget-object v1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$this_run:Landroidx/fragment/app/FragmentActivity;

    .line 61
    .line 62
    new-instance v4, Lcom/kubi/payment/rn/u;

    .line 63
    .line 64
    .line 65
    invoke-direct {v4, p1}, Lcom/kubi/payment/rn/u;-><init>(Ltt/b;)V

    .line 66
    .line 67
    new-instance v5, Landroidx/lifecycle/ViewModelLazy;

    .line 68
    .line 69
    const-class v6, Lcom/kubi/payment/fasttradev2/FastTradeViewModel;

    .line 70
    .line 71
    .line 72
    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 73
    move-result-object v6

    .line 74
    .line 75
    new-instance v7, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1$invokeSuspend$$inlined$viewModels$default$2;

    .line 76
    .line 77
    .line 78
    invoke-direct {v7, v1}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1$invokeSuspend$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 79
    .line 80
    new-instance v8, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1$invokeSuspend$$inlined$viewModels$default$3;

    .line 81
    .line 82
    .line 83
    invoke-direct {v8, v2, v1}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1$invokeSuspend$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v5, v6, v7, v4, v8}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 87
    .line 88
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 89
    .line 90
    iget-object v4, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$data:Ljava/lang/String;

    .line 91
    .line 92
    new-instance v6, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1$invokeSuspend$$inlined$fromJsonOrNull$1;

    .line 93
    .line 94
    .line 95
    invoke-direct {v6, v4, v2}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1$invokeSuspend$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v6}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 99
    move-result-object v6

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 103
    move-result-object v7

    .line 104
    .line 105
    .line 106
    invoke-static {v6, v7}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 107
    move-result-object v6

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    iput-object p1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v5, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->L$1:Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    iput-object p1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->L$2:Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    iput-object p1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->L$3:Ljava/lang/Object;

    .line 128
    const/4 p1, 0x0

    .line 129
    .line 130
    iput p1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->I$0:I

    .line 131
    .line 132
    iput v3, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->label:I

    .line 133
    .line 134
    .line 135
    invoke-static {v6, p0}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    if-ne p1, v0, :cond_2

    .line 139
    return-object v0

    .line 140
    :cond_2
    move-object v0, v5

    .line 141
    .line 142
    :goto_0
    check-cast p1, Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;

    .line 143
    .line 144
    if-eqz p1, :cond_3

    .line 145
    .line 146
    .line 147
    invoke-static {v0}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->g(Lkotlin/Lazy;)Lcom/kubi/payment/fasttradev2/FastTradeViewModel;

    .line 148
    move-result-object v0

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, p1}, Lcom/kubi/payment/fasttradev2/FastTradeViewModel;->S0(Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;)V

    .line 152
    .line 153
    :cond_3
    new-instance p1, Lcom/kubi/payment/fasttradev2/coupon/MarketingCouponDisplayDialog;

    .line 154
    .line 155
    .line 156
    invoke-direct {p1}, Lcom/kubi/payment/fasttradev2/coupon/MarketingCouponDisplayDialog;-><init>()V

    .line 157
    .line 158
    iget-object v0, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$topActivity:Landroid/app/Activity;

    .line 159
    .line 160
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 161
    .line 162
    const-string v1, "FastTradeMarketingCouponDialog"

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->t3(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;)V

    .line 166
    .line 167
    iget-object p1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 168
    .line 169
    .line 170
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 171
    move-result-object v0

    .line 172
    .line 173
    .line 174
    invoke-interface {p1, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 177
    return-object p1
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
