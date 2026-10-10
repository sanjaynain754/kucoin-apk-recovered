.class final Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "KCRNBridgePaymentCallImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl;->F(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
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
    c = "com.kubi.payment.rn.KCRNBridgePaymentCallImpl$selectRecurringFrequency$1"
    f = "KCRNBridgePaymentCallImpl.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentRecurringFrequencyInfo;",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $dayOfMonth:Ljava/lang/String;

.field final synthetic $dayOfWeek:Ljava/lang/String;

.field final synthetic $frequency:Ljava/lang/String;

.field final synthetic $timeOfDay:Ljava/lang/String;

.field final synthetic $timeZone:Ljava/lang/String;

.field final synthetic $topActivity:Landroid/app/Activity;

.field final synthetic $update:Z

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/app/Activity;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentRecurringFrequencyInfo;",
            "-",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$frequency:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$timeOfDay:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$timeZone:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$dayOfWeek:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$dayOfMonth:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$topActivity:Landroid/app/Activity;

    .line 13
    .line 14
    iput-boolean p7, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$update:Z

    .line 15
    .line 16
    iput-object p8, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 17
    const/4 p1, 0x2

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 21
    return-void
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
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function2;Landroid/app/Activity;Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->f(Lkotlin/jvm/functions/Function2;Landroid/app/Activity;Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;)Lkotlin/Unit;

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
.end method

.method public static final f(Lkotlin/jvm/functions/Function2;Landroid/app/Activity;Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;)Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;->getMode()Ljava/lang/String;

    .line 4
    move-result-object v1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;->getTimeOfDay()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v4

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;->getTimeZone()Ljava/lang/String;

    .line 16
    move-result-object v5

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;->getDayOfWeek()Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;->getDayOfMonth()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    sget-object v0, Lcom/kubi/payment/fast/buy/recurring/l;->a:Lcom/kubi/payment/fast/buy/recurring/l;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1, p2}, Lcom/kubi/payment/fast/buy/recurring/l;->c(Landroid/content/Context;Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;)Ljava/lang/String;

    .line 38
    move-result-object v6

    .line 39
    .line 40
    new-instance v0, Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentRecurringFrequencyInfo;

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v0 .. v6}, Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentRecurringFrequencyInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const/4 p1, 0x0

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    return-object p0
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 10
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
    new-instance v0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$frequency:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$timeOfDay:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$timeZone:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$dayOfWeek:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v5, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$dayOfMonth:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v6, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$topActivity:Landroid/app/Activity;

    .line 15
    .line 16
    iget-boolean v7, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$update:Z

    .line 17
    .line 18
    iget-object v8, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 19
    move-object v9, p2

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v0 .. v9}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    .line 23
    return-object v0
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

    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->label:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    .line 12
    new-instance v1, Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$frequency:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$timeOfDay:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v5, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$timeZone:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v7, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$dayOfWeek:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v9, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$dayOfMonth:Ljava/lang/String;

    .line 23
    .line 24
    const/16 v11, 0x154

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v10, 0x0

    .line 30
    .line 31
    .line 32
    invoke-direct/range {v1 .. v12}, Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    sget-object p1, Lcom/kubi/payment/fast/buy/recurring/RecurringFrequencyDialog;->S0:Lcom/kubi/payment/fast/buy/recurring/RecurringFrequencyDialog$Companion;

    .line 35
    .line 36
    iget-object v0, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$topActivity:Landroid/app/Activity;

    .line 37
    .line 38
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    const-string v2, "getSupportFragmentManager(...)"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    iget-boolean v2, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$update:Z

    .line 50
    .line 51
    xor-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    iget-object v3, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 54
    .line 55
    iget-object v4, p0, Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$selectRecurringFrequency$1;->$topActivity:Landroid/app/Activity;

    .line 56
    .line 57
    new-instance v5, Lcom/kubi/payment/rn/t;

    .line 58
    .line 59
    .line 60
    invoke-direct {v5, v3, v4}, Lcom/kubi/payment/rn/t;-><init>(Lkotlin/jvm/functions/Function2;Landroid/app/Activity;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0, v2, v1, v5}, Lcom/kubi/payment/fast/buy/recurring/RecurringFrequencyDialog$Companion;->showRecurringFrequencyDialog(Landroidx/fragment/app/FragmentManager;ZLcom/kubi/payment/fast/buy/recurring/RecurringFrequency;Lkotlin/jvm/functions/Function1;)V

    .line 64
    .line 65
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 66
    return-object p1

    .line 67
    .line 68
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    throw p1
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
