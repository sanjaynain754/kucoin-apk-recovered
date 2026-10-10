.class public final Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;
.super Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;
.source "BalanceSellConfirmFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment<",
        "Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "\u5e9f\u5f03"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u001d2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0008\u0010\r\u001a\u00020\u000cH\u0002J\u0010\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u000cH\u0014J\u0010\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0008\u0010\u0015\u001a\u00020\u000cH\u0014J\u0010\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0008\u0010\u0019\u001a\u00020\u001aH\u0014J\u000e\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001cH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;",
        "Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;",
        "Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;",
        "<init>",
        "()V",
        "trackData",
        "Lcom/kubi/payment/track/FastTrackData;",
        "getTrackData",
        "()Lcom/kubi/payment/track/FastTrackData;",
        "trackData$delegate",
        "Lkotlin/Lazy;",
        "initViews",
        "",
        "placeOrder",
        "onPreviewOrderResponseReady",
        "previewOrder",
        "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;",
        "observeData",
        "trackOrderError",
        "error",
        "Lcom/kubi/network/retrofit/exception/ApiException;",
        "trackRiskError",
        "launchResultPage",
        "orderId",
        "",
        "isSell",
        "",
        "viewModelClass",
        "Lkotlin/reflect/KClass;",
        "Companion",
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


# static fields
.field public static final b0:Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->b0:Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment$Companion;

    .line 9
    return-void
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/payment/fast/sell/balance/c;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/kubi/payment/fast/sell/balance/c;-><init>(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->a0:Lkotlin/Lazy;

    .line 15
    .line 16
    const-string v0, "B7SellCryBalance"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 20
    return-void
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
.end method

.method private final A4()V
    .locals 8

    .line 1
    .line 2
    sget-object v1, Lcom/kubi/data/constance/ValidationBizEnum;->VERIFY_WITHDRAWAL_PASSWORD:Lcom/kubi/data/constance/ValidationBizEnum;

    .line 3
    .line 4
    new-instance v3, Lcom/kubi/payment/fast/sell/balance/d;

    .line 5
    .line 6
    .line 7
    invoke-direct {v3, p0}, Lcom/kubi/payment/fast/sell/balance/d;-><init>(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;)V

    .line 8
    .line 9
    new-instance v4, Lcom/kubi/payment/fast/sell/balance/e;

    .line 10
    .line 11
    .line 12
    invoke-direct {v4, p0}, Lcom/kubi/payment/fast/sell/balance/e;-><init>(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;)V

    .line 13
    .line 14
    const/16 v6, 0x24

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    move-object v0, p0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v0 .. v7}, Lht/b1;->H(Lcom/kubi/sdk/BaseFragment;Lcom/kubi/data/constance/ValidationBizEnum;Lio/reactivex/Observable;Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;Landroid/content/DialogInterface$OnDismissListener;ILjava/lang/Object;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static final B4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;Ljava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    move-result p1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    check-cast p0, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;->T()V

    .line 22
    :cond_0
    return-void
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

.method public static final C4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 7
    const/4 v0, 0x4

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, v1, v0, v1}, Lht/b1;->O(Lcom/kubi/sdk/BaseFragment;Lcom/kubi/network/retrofit/exception/ApiException;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 12
    .line 13
    :cond_0
    sget-object p1, Lcom/kubi/payment/track/IPaymentTrack;->a:Lcom/kubi/payment/track/IPaymentTrack$Companion;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/payment/track/IPaymentTrack$Companion;->getTrack()Lcom/kubi/payment/track/IPaymentTrack;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    const-string v0, "-10006:CHECK_PWD_ERROR"

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->w4()Lcom/kubi/payment/track/FastTrackData;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    const-string v1, "CHECK_PWD_ERROR"

    .line 26
    const/4 v2, 0x0

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v1, v2, v0, p0}, Lcom/kubi/payment/track/IPaymentTrack;->j(Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/payment/track/FastTrackData;)V

    .line 30
    return-void
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

.method public static final D4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;)Lcom/kubi/payment/track/FastTrackData;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/track/FastTrackData;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/CommonConfirmFragment;->I3()Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;->getPaymentType()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v2

    .line 16
    .line 17
    :goto_0
    const-string v3, "sell"

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v3, v1}, Lcom/kubi/payment/track/FastTrackData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/CommonConfirmFragment;->I3()Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;->getFiatCurrency()Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object v1, v2

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-virtual {v0, v1}, Lcom/kubi/payment/track/PaymentTrackData;->setFiatCurrency(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/CommonConfirmFragment;->I3()Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;

    .line 39
    move-result-object p0

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;->getCryptoCurrency()Ljava/lang/String;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-virtual {v0, v2}, Lcom/kubi/payment/track/PaymentTrackData;->setCryptoCurrency(Ljava/lang/String;)V

    .line 49
    return-object v0
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

.method public static synthetic r4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;)Lcom/kubi/payment/track/FastTrackData;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->D4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;)Lcom/kubi/payment/track/FastTrackData;

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

.method public static synthetic s4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->x4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;)Lkotlin/Unit;

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

.method public static synthetic t4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->C4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;Ljava/lang/Throwable;)V

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

.method public static synthetic u4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->z4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;Ljava/lang/String;)Lkotlin/Unit;

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

.method public static synthetic v4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->B4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;Ljava/lang/Object;)V

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

.method private final w4()Lcom/kubi/payment/track/FastTrackData;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->a0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/payment/track/FastTrackData;

    .line 9
    return-object v0
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
.end method

.method public static final x4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/payment/fast/common/confirm/CommonConfirmVM;->E()Z

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, Lcom/kubi/payment/fast/common/confirm/CommonConfirmVM;->K(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;->p4(Z)V

    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    return-object p0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v2, v1, v0}, Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;->q4(Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;ZILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->A4()V

    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 39
    return-object p0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method private final y4(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/fast/sell/result/SellResultFragment;->X:Lcom/kubi/payment/fast/sell/result/SellResultFragment$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->n3()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Lcom/kubi/payment/fast/sell/result/SellResultFragment$Companion;->startPayStatusSellFragment(Landroid/content/Context;Ljava/lang/String;)V

    .line 10
    return-void
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

.method public static final z4(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->y4(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->preformBackPressed()V

    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p0
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


# virtual methods
.method public O3(Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;)V
    .locals 4
    .param p1    # Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "previewOrder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;->O3(Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;->n4()Lft/j;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "--"

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, Lft/j;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;->getCryptoAmount()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-static {v3, v1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const/16 v3, 0x20

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;->getCryptoCurrency()Ljava/lang/String;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;->n4()Lft/j;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    iget-object v0, v0, Lft/j;->o:Lcom/kubi/resources/widget/BaseTextView;

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    new-instance v2, Lcom/kubi/utils/v0;

    .line 68
    .line 69
    .line 70
    invoke-direct {v2}, Lcom/kubi/utils/v0;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;->getDepositFiatAmount()Ljava/lang/String;

    .line 74
    move-result-object v3

    .line 75
    .line 76
    .line 77
    invoke-static {v3, v1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    const/16 v3, 0x10

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v3}, Lcom/kubi/utils/extensions/core/c;->f(Landroidx/fragment/app/Fragment;I)I

    .line 84
    move-result v3

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v1, v3}, Lcom/kubi/utils/v0;->g(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    const-string v2, " "

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;->getFiatCurrency()Ljava/lang/String;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    sget v2, Lcom/kubi/otc/R$color;->emphasis40:I

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v2}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 104
    move-result v2

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, p1, v2}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    :cond_1
    return-void
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

.method public X3(Lcom/kubi/network/retrofit/exception/ApiException;)V
    .locals 20
    .param p1    # Lcom/kubi/network/retrofit/exception/ApiException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "error"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v1, Lcom/kubi/payment/track/IPaymentTrack;->a:Lcom/kubi/payment/track/IPaymentTrack$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/kubi/payment/track/IPaymentTrack$Companion;->getTrack()Lcom/kubi/payment/track/IPaymentTrack;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    iget-object v3, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const/16 v3, 0x3a

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-direct/range {p0 .. p0}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->w4()Lcom/kubi/payment/track/FastTrackData;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    const-string v4, "PLACE_ORDER"

    .line 46
    const/4 v5, 0x0

    .line 47
    .line 48
    .line 49
    invoke-interface {v1, v4, v5, v2, v3}, Lcom/kubi/payment/track/IPaymentTrack;->j(Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/payment/track/FastTrackData;)V

    .line 50
    .line 51
    sget-object v6, Llt/a;->a:Llt/a;

    .line 52
    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    iget-object v2, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const/16 v2, 0x2d

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    move-result-object v8

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/payment/fast/common/confirm/CommonConfirmFragment;->I3()Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;

    .line 81
    move-result-object v0

    .line 82
    const/4 v1, 0x0

    .line 83
    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;->getCryptoCurrency()Ljava/lang/String;

    .line 88
    move-result-object v0

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move-object v0, v1

    .line 91
    .line 92
    .line 93
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    move-result-object v9

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/payment/fast/common/confirm/CommonConfirmFragment;->I3()Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;->getFiatCurrency()Ljava/lang/String;

    .line 104
    move-result-object v1

    .line 105
    .line 106
    .line 107
    :cond_1
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    move-result-object v10

    .line 109
    .line 110
    const/16 v18, 0x7c0

    .line 111
    .line 112
    const/16 v19, 0x0

    .line 113
    const/4 v7, 0x0

    .line 114
    .line 115
    const-string v11, "pay_fast_sell"

    .line 116
    .line 117
    const-string v12, "fast_balance"

    .line 118
    const/4 v13, 0x0

    .line 119
    const/4 v14, 0x0

    .line 120
    const/4 v15, 0x0

    .line 121
    .line 122
    const/16 v16, 0x0

    .line 123
    .line 124
    const/16 v17, 0x0

    .line 125
    .line 126
    .line 127
    invoke-static/range {v6 .. v19}, Llt/a;->b(Llt/a;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 128
    return-void
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

.method public Y3()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/payment/fast/common/confirm/CommonConfirmFragment;->Y3()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getPageId()Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    new-instance v4, Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 17
    .line 18
    const-string v0, "PaymentMethod"

    .line 19
    .line 20
    const-string v2, "balance"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/CommonConfirmFragment;->I3()Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;

    .line 27
    move-result-object v0

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;->getFiatCurrency()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v0, v2

    .line 37
    .line 38
    :goto_0
    const-string v3, "fiat"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/CommonConfirmFragment;->I3()Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;->getCryptoCurrency()Ljava/lang/String;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    :cond_1
    const-string v0, "crypto"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    .line 58
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    const/4 v5, 0x4

    .line 60
    const/4 v6, 0x0

    .line 61
    .line 62
    const-string v2, "dialog"

    .line 63
    const/4 v3, 0x0

    .line 64
    .line 65
    .line 66
    invoke-static/range {v1 .. v6}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 67
    return-void
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
.end method

.method public f4()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public p3()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;->p3()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;->n4()Lft/j;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lft/j;->p:Lcom/kubi/resources/widget/BaseTextView;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget v1, Lcom/kubi/otc/R$string;->payment_estimated_receive_amount:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;->n4()Lft/j;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, v0, Lft/j;->q:Landroid/widget/FrameLayout;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->n3()Landroid/content/Context;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    sget v2, Lcom/kubi/otc/R$drawable;->botc_selector_secondary_bg:I

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;->n4()Lft/j;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, v0, Lft/j;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    sget v1, Lcom/kubi/otc/R$string;->fast_pay_confirm_sell:I

    .line 58
    const/4 v2, 0x0

    .line 59
    .line 60
    new-array v2, v2, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;->n4()Lft/j;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    iget-object v1, v0, Lft/j;->q:Landroid/widget/FrameLayout;

    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    new-instance v4, Lcom/kubi/payment/fast/sell/balance/b;

    .line 80
    .line 81
    .line 82
    invoke-direct {v4, p0}, Lcom/kubi/payment/fast/sell/balance/b;-><init>(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;)V

    .line 83
    const/4 v5, 0x1

    .line 84
    const/4 v6, 0x0

    .line 85
    .line 86
    const-wide/16 v2, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 90
    :cond_3
    return-void
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
.end method

.method public r3()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/payment/fast/common/confirm/AbsFastConfirmFiatFragment;->r3()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentFragment;->o3()Lcom/kubi/payment/base/BasePaymentVM;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;->S()Landroidx/lifecycle/LiveData;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    new-instance v2, Lcom/kubi/payment/fast/sell/balance/a;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p0}, Lcom/kubi/payment/fast/sell/balance/a;-><init>(Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;)V

    .line 23
    .line 24
    new-instance v3, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment$a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v2}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 31
    return-void
.end method

.method public z3()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method
