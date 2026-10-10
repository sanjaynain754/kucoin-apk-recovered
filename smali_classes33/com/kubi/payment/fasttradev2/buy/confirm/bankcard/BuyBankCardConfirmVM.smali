.class public final Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;
.super Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;
.source "BuyBankCardConfirmVM.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u000c\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0002\u0010\u001fJ\u0008\u0010 \u001a\u00020\u0014H\u0002J\u0010\u0010!\u001a\u0004\u0018\u00010\u0014H\u0082@\u00a2\u0006\u0002\u0010\u001fJ \u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u00142\u0008\u0010$\u001a\u0004\u0018\u00010\u0014H\u0082@\u00a2\u0006\u0002\u0010%J&\u0010&\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0082@\u00a2\u0006\u0002\u0010+J\u0018\u0010,\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00140\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0012\u00a8\u0006."
    }
    d2 = {
        "Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;",
        "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;",
        "repository",
        "Lcom/kubi/payment/fast/data/source/IFastRepository;",
        "extraParams",
        "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;",
        "<init>",
        "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;)V",
        "getRepository",
        "()Lcom/kubi/payment/fast/data/source/IFastRepository;",
        "getExtraParams",
        "()Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;",
        "_needShowInputCVV",
        "Landroidx/lifecycle/MutableLiveData;",
        "",
        "needShowInputCVV",
        "Landroidx/lifecycle/LiveData;",
        "getNeedShowInputCVV",
        "()Landroidx/lifecycle/LiveData;",
        "_htmlString",
        "",
        "htmlString",
        "getHtmlString",
        "_redirectUrl",
        "redirectUrl",
        "getRedirectUrl",
        "placeOrder",
        "",
        "submitCVV",
        "cvv",
        "realPlaceOrder",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cardToken",
        "loadRiskSessionId",
        "queryCollectStatus",
        "orderId",
        "overTimeStr",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "queryStatus",
        "startTime",
        "",
        "overTime",
        "",
        "(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "buildHtmlString",
        "threeDSMethodData",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBuyBankCardConfirmVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyBankCardConfirmVM.kt\ncom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,266:1\n48#2,2:267\n*S KotlinDebug\n*F\n+ 1 BuyBankCardConfirmVM.kt\ncom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM\n*L\n175#1:267,2\n*E\n"
    }
.end annotation


# instance fields
.field public final m0:Lcom/kubi/payment/fast/data/source/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n0:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final o0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/payment/fast/data/source/a;Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;)V
    .locals 1
    .param p1    # Lcom/kubi/payment/fast/data/source/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;
        .annotation build Lorg/jetbrains/annotations/Nullable;
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
    invoke-direct {p0, p1, p2}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;-><init>(Lcom/kubi/payment/fast/data/source/a;Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;)V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->m0:Lcom/kubi/payment/fast/data/source/a;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->n0:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 13
    .line 14
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 18
    .line 19
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->o0:Landroidx/lifecycle/MutableLiveData;

    .line 20
    .line 21
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    .line 24
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 25
    .line 26
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->p0:Landroidx/lifecycle/MutableLiveData;

    .line 27
    .line 28
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 29
    .line 30
    .line 31
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 32
    .line 33
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->q0:Landroidx/lifecycle/MutableLiveData;

    .line 34
    return-void
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

.method public static final synthetic Y(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->g0()Ljava/lang/String;

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

.method public static final synthetic Z(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentVM;->p()Landroidx/lifecycle/MutableLiveData;

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

.method public static final synthetic a0(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->o0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object p0
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

.method public static final synthetic b0(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentVM;->r()Landroidx/lifecycle/MutableLiveData;

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

.method public static final synthetic c0(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->m0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method public static final synthetic d0(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct/range {p0 .. p5}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->p0(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method public static final synthetic e0(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->q0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method private final f0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "\n            <html>\n            <head>\n            \t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n            \t<title>KuCoin</title>\n            </head>\n            <body onload=\"document.getElementById(\'collect_form\').submit();\">\n            \t<form id=\"collect_form\" target=\"_self\" method=\"post\" action=\""

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string p1, "\">\n            \t\t<input type=\"hidden\" name=\"threeDSMethodData\" value=\""

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string p1, "\">\n            \t</form>\n            </body>\n            </html>\n        "

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object p1

    .line 31
    return-object p1
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

.method private final g0()Ljava/lang/String;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;->M()Landroidx/lifecycle/LiveData;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;->getCardInfo()Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyCardInfo;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyCardInfo;->getCardToken()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v0, v1

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 33
    move-result v2

    .line 34
    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    new-instance v3, Lcom/kubi/otc/exception/OtcMessage;

    .line 38
    const/4 v7, 0x4

    .line 39
    const/4 v8, 0x0

    .line 40
    .line 41
    const-string v4, "cardToken is empty"

    .line 42
    .line 43
    const-string v5, "BuyBankCardConfirmVM"

    .line 44
    const/4 v6, 0x0

    .line 45
    .line 46
    .line 47
    invoke-direct/range {v3 .. v8}, Lcom/kubi/otc/exception/OtcMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    const/4 v2, 0x2

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v1, v2, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 52
    :cond_1
    return-object v0
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
.end method

.method private final m0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$loadRiskSessionId$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$loadRiskSessionId$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$loadRiskSessionId$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$loadRiskSessionId$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$loadRiskSessionId$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$loadRiskSessionId$1;-><init>(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$loadRiskSessionId$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$loadRiskSessionId$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object v0, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$loadRiskSessionId$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 46
    goto :goto_3

    .line 47
    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    throw p1

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    iget-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->n0:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;->isRecurring()Z

    .line 65
    move-result p1

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 69
    move-result-object p1

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    move-object p1, v4

    .line 72
    .line 73
    .line 74
    :goto_1
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 75
    move-result p1

    .line 76
    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    const-string p1, "recurringByCrypto"

    .line 80
    goto :goto_2

    .line 81
    .line 82
    :cond_4
    const-string p1, "bycrypto"

    .line 83
    .line 84
    :goto_2
    iget-object v2, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->m0:Lcom/kubi/payment/fast/data/source/a;

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    move-result-object v5

    .line 89
    .line 90
    iput-object v5, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$loadRiskSessionId$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    iput v3, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$loadRiskSessionId$1;->label:I

    .line 93
    .line 94
    .line 95
    invoke-interface {v2, p1, v0}, Lcom/kubi/payment/fast/data/source/a;->M(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    if-ne p1, v1, :cond_5

    .line 99
    return-object v1

    .line 100
    .line 101
    :cond_5
    :goto_3
    check-cast p1, Lnt/k;

    .line 102
    .line 103
    instance-of v0, p1, Lnt/k$b;

    .line 104
    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    check-cast p1, Lnt/k$b;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lnt/k$b;->a()Ljava/lang/Object;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    check-cast p1, Lcom/kubi/payment/fast/data/entities/RiskSession;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/RiskSession;->getSessionId()Ljava/lang/String;

    .line 117
    move-result-object p1

    .line 118
    return-object p1

    .line 119
    .line 120
    :cond_6
    instance-of v0, p1, Lnt/k$a;

    .line 121
    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/kubi/payment/base/BasePaymentVM;->r()Landroidx/lifecycle/MutableLiveData;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    check-cast p1, Lnt/k$a;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lnt/k$a;->a()Ljava/lang/Exception;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 136
    return-object v4

    .line 137
    .line 138
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 139
    .line 140
    .line 141
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 142
    throw p1
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

.method private final o0(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v2

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {p2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 10
    move-result-object p2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    .line 14
    :goto_0
    const/16 v0, 0xf

    .line 15
    .line 16
    .line 17
    invoke-static {p2, v0}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 18
    move-result v4

    .line 19
    move-object v0, p0

    .line 20
    move-object v1, p1

    .line 21
    move-object v5, p3

    .line 22
    .line 23
    .line 24
    invoke-direct/range {v0 .. v5}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->p0(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    if-ne p1, p2, :cond_1

    .line 32
    return-object p1

    .line 33
    .line 34
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    return-object p1
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

.method private final p0(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p5

    .line 5
    .line 6
    instance-of v2, v1, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;

    .line 12
    .line 13
    iget v3, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->label:I

    .line 14
    .line 15
    const/high16 v4, -0x80000000

    .line 16
    .line 17
    and-int v5, v3, v4

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    sub-int/2addr v3, v4

    .line 21
    .line 22
    iput v3, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->label:I

    .line 23
    :goto_0
    move-object v5, v2

    .line 24
    goto :goto_1

    .line 25
    .line 26
    :cond_0
    new-instance v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, v0, v1}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;-><init>(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;Lkotlin/coroutines/Continuation;)V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :goto_1
    iget-object v1, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->result:Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 36
    move-result-object v6

    .line 37
    .line 38
    iget v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->label:I

    .line 39
    const/4 v3, 0x4

    .line 40
    const/4 v4, 0x3

    .line 41
    const/4 v7, 0x2

    .line 42
    const/4 v8, 0x1

    .line 43
    .line 44
    if-eqz v2, :cond_5

    .line 45
    .line 46
    if-eq v2, v8, :cond_4

    .line 47
    .line 48
    if-eq v2, v7, :cond_3

    .line 49
    .line 50
    if-eq v2, v4, :cond_2

    .line 51
    .line 52
    if-ne v2, v3, :cond_1

    .line 53
    .line 54
    iget-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Lnt/k;

    .line 57
    .line 58
    iget-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    .line 72
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    throw v1

    .line 74
    .line 75
    :cond_2
    iget-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$2:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;

    .line 78
    .line 79
    iget-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$1:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Lnt/k;

    .line 82
    .line 83
    iget-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 89
    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_3
    iget v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->I$0:I

    .line 93
    .line 94
    iget-wide v7, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->J$0:J

    .line 95
    .line 96
    iget-object v9, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v9, Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 102
    .line 103
    goto/16 :goto_3

    .line 104
    .line 105
    :cond_4
    iget v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->I$0:I

    .line 106
    .line 107
    iget-wide v8, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->J$0:J

    .line 108
    .line 109
    iget-object v10, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v10, Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 115
    goto :goto_2

    .line 116
    .line 117
    .line 118
    :cond_5
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 119
    .line 120
    move-object/from16 v1, p1

    .line 121
    .line 122
    iput-object v1, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 123
    .line 124
    move-wide/from16 v9, p2

    .line 125
    .line 126
    iput-wide v9, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->J$0:J

    .line 127
    .line 128
    move/from16 v2, p4

    .line 129
    .line 130
    iput v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->I$0:I

    .line 131
    .line 132
    iput v8, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->label:I

    .line 133
    .line 134
    const-wide/16 v11, 0x7d0

    .line 135
    .line 136
    .line 137
    invoke-static {v11, v12, v5}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 138
    move-result-object v8

    .line 139
    .line 140
    if-ne v8, v6, :cond_6

    .line 141
    .line 142
    goto/16 :goto_6

    .line 143
    :cond_6
    move-wide v8, v9

    .line 144
    move-object v10, v1

    .line 145
    .line 146
    .line 147
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 148
    move-result-wide v11

    .line 149
    sub-long/2addr v11, v8

    .line 150
    .line 151
    mul-int/lit16 v1, v2, 0x3e8

    .line 152
    int-to-long v13, v1

    .line 153
    .line 154
    cmp-long v1, v11, v13

    .line 155
    .line 156
    if-lez v1, :cond_7

    .line 157
    .line 158
    sget-object v11, Lf00/a;->a:Lf00/a;

    .line 159
    .line 160
    new-instance v1, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    sget-object v2, Let/d;->a:Let/d;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Let/d;->c()Ljava/lang/String;

    .line 169
    move-result-object v2

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const/16 v2, 0x2f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v2, "?appNeedLang=true"

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    move-result-object v12

    .line 190
    .line 191
    const/16 v19, 0x7e

    .line 192
    .line 193
    const/16 v20, 0x0

    .line 194
    const/4 v13, 0x0

    .line 195
    const/4 v14, 0x0

    .line 196
    const/4 v15, 0x0

    .line 197
    .line 198
    const/16 v16, 0x0

    .line 199
    .line 200
    const/16 v17, 0x0

    .line 201
    .line 202
    const/16 v18, 0x0

    .line 203
    .line 204
    .line 205
    invoke-static/range {v11 .. v20}, Lg00/r$a;->a(Lg00/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 206
    .line 207
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 208
    return-object v1

    .line 209
    .line 210
    :cond_7
    iget-object v1, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->m0:Lcom/kubi/payment/fast/data/source/a;

    .line 211
    .line 212
    iput-object v10, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 213
    .line 214
    iput-wide v8, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->J$0:J

    .line 215
    .line 216
    iput v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->I$0:I

    .line 217
    .line 218
    iput v7, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->label:I

    .line 219
    .line 220
    .line 221
    invoke-interface {v1, v10, v5}, Lcom/kubi/payment/fast/data/source/a;->s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 222
    move-result-object v1

    .line 223
    .line 224
    if-ne v1, v6, :cond_8

    .line 225
    .line 226
    goto/16 :goto_6

    .line 227
    :cond_8
    move-wide v7, v8

    .line 228
    move-object v9, v10

    .line 229
    .line 230
    :goto_3
    check-cast v1, Lnt/k;

    .line 231
    .line 232
    instance-of v10, v1, Lnt/k$b;

    .line 233
    .line 234
    if-eqz v10, :cond_d

    .line 235
    move-object v3, v1

    .line 236
    .line 237
    check-cast v3, Lnt/k$b;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3}, Lnt/k$b;->a()Ljava/lang/Object;

    .line 241
    move-result-object v3

    .line 242
    .line 243
    check-cast v3, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getRedirectUrlType()Ljava/lang/String;

    .line 247
    move-result-object v10

    .line 248
    .line 249
    const-string v11, "REDIRECT_COLLECT_INFO_URL"

    .line 250
    .line 251
    .line 252
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    move-result v10

    .line 254
    .line 255
    if-eqz v10, :cond_a

    .line 256
    .line 257
    .line 258
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    move-result-object v10

    .line 260
    .line 261
    iput-object v10, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    move-result-object v1

    .line 266
    .line 267
    iput-object v1, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$1:Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    move-result-object v1

    .line 272
    .line 273
    iput-object v1, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$2:Ljava/lang/Object;

    .line 274
    .line 275
    iput-wide v7, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->J$0:J

    .line 276
    .line 277
    iput v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->I$0:I

    .line 278
    .line 279
    iput v4, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->label:I

    .line 280
    move v4, v2

    .line 281
    move-wide v2, v7

    .line 282
    move-object v1, v9

    .line 283
    .line 284
    .line 285
    invoke-direct/range {v0 .. v5}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->p0(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 286
    move-result-object v1

    .line 287
    .line 288
    if-ne v1, v6, :cond_9

    .line 289
    goto :goto_6

    .line 290
    .line 291
    :cond_9
    :goto_4
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 292
    return-object v1

    .line 293
    .line 294
    .line 295
    :cond_a
    invoke-virtual {v3}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getRedirectUrl()Ljava/lang/String;

    .line 296
    move-result-object v1

    .line 297
    .line 298
    if-eqz v1, :cond_c

    .line 299
    .line 300
    .line 301
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 302
    move-result v1

    .line 303
    .line 304
    if-nez v1, :cond_b

    .line 305
    goto :goto_5

    .line 306
    .line 307
    :cond_b
    iget-object v1, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->q0:Landroidx/lifecycle/MutableLiveData;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getRedirectUrl()Ljava/lang/String;

    .line 311
    move-result-object v2

    .line 312
    .line 313
    .line 314
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 315
    move-result-object v2

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 319
    .line 320
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 321
    return-object v1

    .line 322
    .line 323
    :cond_c
    :goto_5
    sget v1, Lcom/kubi/otc/R$string;->system_error:I

    .line 324
    .line 325
    .line 326
    invoke-static {v1}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 327
    .line 328
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 329
    return-object v1

    .line 330
    :cond_d
    move v4, v2

    .line 331
    move-object v10, v9

    .line 332
    .line 333
    instance-of v2, v1, Lnt/k$a;

    .line 334
    .line 335
    if-eqz v2, :cond_f

    .line 336
    .line 337
    .line 338
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    move-result-object v2

    .line 340
    .line 341
    iput-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    move-result-object v1

    .line 346
    .line 347
    iput-object v1, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->L$1:Ljava/lang/Object;

    .line 348
    .line 349
    iput-wide v7, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->J$0:J

    .line 350
    .line 351
    iput v4, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->I$0:I

    .line 352
    .line 353
    iput v3, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$queryStatus$1;->label:I

    .line 354
    move-wide v2, v7

    .line 355
    move-object v1, v10

    .line 356
    .line 357
    .line 358
    invoke-direct/range {v0 .. v5}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->p0(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 359
    move-result-object v1

    .line 360
    .line 361
    if-ne v1, v6, :cond_e

    .line 362
    :goto_6
    return-object v6

    .line 363
    .line 364
    :cond_e
    :goto_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 365
    return-object v0

    .line 366
    .line 367
    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 368
    .line 369
    .line 370
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 371
    throw v0
.end method

.method private final q0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    instance-of v2, v1, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;

    .line 12
    .line 13
    iget v3, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->label:I

    .line 14
    .line 15
    const/high16 v4, -0x80000000

    .line 16
    .line 17
    and-int v5, v3, v4

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    sub-int/2addr v3, v4

    .line 21
    .line 22
    iput v3, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->label:I

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v0, v1}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;-><init>(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    :goto_0
    iget-object v1, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->result:Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    iget v4, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->label:I

    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x1

    .line 39
    const/4 v7, 0x2

    .line 40
    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    if-eq v4, v6, :cond_3

    .line 44
    .line 45
    if-eq v4, v7, :cond_2

    .line 46
    .line 47
    if-ne v4, v5, :cond_1

    .line 48
    .line 49
    iget-object v3, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$4:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;

    .line 52
    .line 53
    iget-object v3, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$3:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Lnt/k;

    .line 56
    .line 57
    iget-object v3, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$2:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;

    .line 60
    .line 61
    iget-object v3, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v3, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;

    .line 64
    .line 65
    iget-object v2, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 71
    .line 72
    goto/16 :goto_8

    .line 73
    .line 74
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    .line 79
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    throw v1

    .line 81
    .line 82
    :cond_2
    iget-object v4, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$2:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;

    .line 85
    .line 86
    iget-object v6, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$1:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v6, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;

    .line 89
    .line 90
    iget-object v7, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v7, Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 96
    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 101
    goto :goto_1

    .line 102
    .line 103
    .line 104
    :cond_4
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 105
    .line 106
    iput v6, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->label:I

    .line 107
    .line 108
    .line 109
    invoke-direct {v0, v2}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->m0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    if-ne v1, v3, :cond_5

    .line 113
    .line 114
    goto/16 :goto_7

    .line 115
    .line 116
    :cond_5
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 117
    .line 118
    if-eqz v1, :cond_16

    .line 119
    .line 120
    .line 121
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 122
    move-result v4

    .line 123
    .line 124
    if-nez v4, :cond_6

    .line 125
    .line 126
    goto/16 :goto_c

    .line 127
    .line 128
    .line 129
    :cond_6
    invoke-virtual {v0}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;->M()Landroidx/lifecycle/LiveData;

    .line 130
    move-result-object v4

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 134
    move-result-object v4

    .line 135
    move-object v6, v4

    .line 136
    .line 137
    check-cast v6, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;

    .line 138
    .line 139
    if-nez v6, :cond_7

    .line 140
    .line 141
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 142
    return-object v1

    .line 143
    .line 144
    :cond_7
    new-instance v9, Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;->getQuoteId()Ljava/lang/String;

    .line 148
    move-result-object v4

    .line 149
    .line 150
    .line 151
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    move-result-object v10

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;->getFiatCurrency()Ljava/lang/String;

    .line 156
    move-result-object v12

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;->getFiatAmount()Ljava/lang/String;

    .line 160
    move-result-object v13

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;->getCryptoCurrency()Ljava/lang/String;

    .line 164
    move-result-object v14

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;->getCryptoAmount()Ljava/lang/String;

    .line 168
    move-result-object v15

    .line 169
    .line 170
    new-instance v4, Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequestExtension;

    .line 171
    .line 172
    iget-object v11, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->n0:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 173
    .line 174
    if-eqz v11, :cond_8

    .line 175
    .line 176
    .line 177
    invoke-virtual {v11}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;->getCardId()Ljava/lang/String;

    .line 178
    move-result-object v11

    .line 179
    goto :goto_2

    .line 180
    :cond_8
    const/4 v11, 0x0

    .line 181
    .line 182
    :goto_2
    sget-object v8, Lcom/kubi/payment/util/ForterUtils;->a:Lcom/kubi/payment/util/ForterUtils;

    .line 183
    .line 184
    sget-object v16, Lcom/kubi/sdk/BaseApplication;->Companion:Lcom/kubi/sdk/BaseApplication$Companion;

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v16 .. v16}, Lcom/kubi/sdk/BaseApplication$Companion;->get()Landroid/app/Application;

    .line 188
    move-result-object v5

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8, v5}, Lcom/kubi/payment/util/ForterUtils;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 192
    move-result-object v5

    .line 193
    .line 194
    sget-object v8, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 195
    .line 196
    const-string v7, "BRAND"

    .line 197
    .line 198
    .line 199
    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-direct {v4, v11, v1, v5, v8}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequestExtension;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;->N()Landroidx/lifecycle/LiveData;

    .line 206
    move-result-object v5

    .line 207
    .line 208
    .line 209
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 210
    move-result-object v5

    .line 211
    .line 212
    move-object/from16 v20, v5

    .line 213
    .line 214
    check-cast v20, Ljava/lang/String;

    .line 215
    .line 216
    const/16 v21, 0x382

    .line 217
    .line 218
    const/16 v22, 0x0

    .line 219
    const/4 v11, 0x0

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const/16 v18, 0x0

    .line 224
    .line 225
    const/16 v19, 0x0

    .line 226
    .line 227
    move-object/from16 v16, v4

    .line 228
    .line 229
    .line 230
    invoke-direct/range {v9 .. v22}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequestExtension;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/GooglePaymentData;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 231
    .line 232
    iget-object v4, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->m0:Lcom/kubi/payment/fast/data/source/a;

    .line 233
    .line 234
    .line 235
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    move-result-object v5

    .line 237
    .line 238
    iput-object v5, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$0:Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    move-result-object v5

    .line 243
    .line 244
    iput-object v5, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$1:Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    move-result-object v5

    .line 249
    .line 250
    iput-object v5, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$2:Ljava/lang/Object;

    .line 251
    const/4 v5, 0x2

    .line 252
    .line 253
    iput v5, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->label:I

    .line 254
    .line 255
    .line 256
    invoke-interface {v4, v9, v2}, Lcom/kubi/payment/fast/data/source/a;->k0(Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 257
    move-result-object v4

    .line 258
    .line 259
    if-ne v4, v3, :cond_9

    .line 260
    .line 261
    goto/16 :goto_7

    .line 262
    :cond_9
    move-object v7, v1

    .line 263
    move-object v1, v4

    .line 264
    move-object v4, v9

    .line 265
    .line 266
    :goto_3
    check-cast v1, Lnt/k;

    .line 267
    .line 268
    instance-of v5, v1, Lnt/k$b;

    .line 269
    .line 270
    if-eqz v5, :cond_14

    .line 271
    move-object v5, v1

    .line 272
    .line 273
    check-cast v5, Lnt/k$b;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v5}, Lnt/k$b;->a()Ljava/lang/Object;

    .line 277
    move-result-object v5

    .line 278
    .line 279
    check-cast v5, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getRedirectUrlType()Ljava/lang/String;

    .line 283
    move-result-object v8

    .line 284
    .line 285
    const-string v9, "REDIRECT_COLLECT_INFO_URL"

    .line 286
    .line 287
    .line 288
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 289
    move-result v8

    .line 290
    .line 291
    if-eqz v8, :cond_11

    .line 292
    .line 293
    .line 294
    invoke-virtual {v5}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getRedirectUrl()Ljava/lang/String;

    .line 295
    move-result-object v8

    .line 296
    .line 297
    if-eqz v8, :cond_a

    .line 298
    .line 299
    .line 300
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 301
    move-result v8

    .line 302
    .line 303
    if-nez v8, :cond_c

    .line 304
    .line 305
    .line 306
    :cond_a
    invoke-virtual {v5}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getExt()Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponseExtension;

    .line 307
    move-result-object v8

    .line 308
    .line 309
    if-eqz v8, :cond_b

    .line 310
    .line 311
    .line 312
    invoke-virtual {v8}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponseExtension;->getRedirectUrlData()Ljava/lang/String;

    .line 313
    move-result-object v8

    .line 314
    goto :goto_4

    .line 315
    :cond_b
    const/4 v8, 0x0

    .line 316
    .line 317
    :goto_4
    if-eqz v8, :cond_10

    .line 318
    .line 319
    .line 320
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 321
    move-result v8

    .line 322
    .line 323
    if-nez v8, :cond_c

    .line 324
    goto :goto_9

    .line 325
    .line 326
    :cond_c
    iget-object v8, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->p0:Landroidx/lifecycle/MutableLiveData;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v5}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getRedirectUrl()Ljava/lang/String;

    .line 330
    move-result-object v9

    .line 331
    .line 332
    .line 333
    invoke-static {v9}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 334
    move-result-object v9

    .line 335
    .line 336
    .line 337
    invoke-virtual {v5}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getExt()Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponseExtension;

    .line 338
    move-result-object v10

    .line 339
    .line 340
    if-eqz v10, :cond_d

    .line 341
    .line 342
    .line 343
    invoke-virtual {v10}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponseExtension;->getRedirectUrlData()Ljava/lang/String;

    .line 344
    move-result-object v10

    .line 345
    goto :goto_5

    .line 346
    :cond_d
    const/4 v10, 0x0

    .line 347
    .line 348
    .line 349
    :goto_5
    invoke-static {v10}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 350
    move-result-object v10

    .line 351
    .line 352
    .line 353
    invoke-direct {v0, v9, v10}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->f0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 354
    move-result-object v9

    .line 355
    .line 356
    .line 357
    invoke-virtual {v8, v9}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v5}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getOrderId()Ljava/lang/String;

    .line 361
    move-result-object v8

    .line 362
    .line 363
    .line 364
    invoke-static {v8}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 365
    move-result-object v8

    .line 366
    .line 367
    .line 368
    invoke-virtual {v5}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getExt()Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponseExtension;

    .line 369
    move-result-object v9

    .line 370
    .line 371
    if-eqz v9, :cond_e

    .line 372
    .line 373
    .line 374
    invoke-virtual {v9}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponseExtension;->getDelayTimeSeconds()Ljava/lang/String;

    .line 375
    move-result-object v9

    .line 376
    goto :goto_6

    .line 377
    :cond_e
    const/4 v9, 0x0

    .line 378
    .line 379
    .line 380
    :goto_6
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    move-result-object v7

    .line 382
    .line 383
    iput-object v7, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$0:Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    move-result-object v6

    .line 388
    .line 389
    iput-object v6, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$1:Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    move-result-object v4

    .line 394
    .line 395
    iput-object v4, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$2:Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    move-result-object v1

    .line 400
    .line 401
    iput-object v1, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$3:Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    move-result-object v1

    .line 406
    .line 407
    iput-object v1, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->L$4:Ljava/lang/Object;

    .line 408
    const/4 v1, 0x3

    .line 409
    .line 410
    iput v1, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$realPlaceOrder$1;->label:I

    .line 411
    .line 412
    .line 413
    invoke-direct {v0, v8, v9, v2}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->o0(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 414
    move-result-object v1

    .line 415
    .line 416
    if-ne v1, v3, :cond_f

    .line 417
    :goto_7
    return-object v3

    .line 418
    .line 419
    :cond_f
    :goto_8
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 420
    return-object v1

    .line 421
    .line 422
    :cond_10
    :goto_9
    sget v1, Lcom/kubi/otc/R$string;->system_error:I

    .line 423
    .line 424
    .line 425
    invoke-static {v1}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 426
    .line 427
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 428
    return-object v1

    .line 429
    .line 430
    .line 431
    :cond_11
    invoke-virtual {v5}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getRedirectUrl()Ljava/lang/String;

    .line 432
    move-result-object v1

    .line 433
    .line 434
    if-eqz v1, :cond_13

    .line 435
    .line 436
    .line 437
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 438
    move-result v1

    .line 439
    .line 440
    if-nez v1, :cond_12

    .line 441
    goto :goto_a

    .line 442
    .line 443
    :cond_12
    iget-object v1, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->q0:Landroidx/lifecycle/MutableLiveData;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v5}, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;->getRedirectUrl()Ljava/lang/String;

    .line 447
    move-result-object v2

    .line 448
    .line 449
    .line 450
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 451
    move-result-object v2

    .line 452
    .line 453
    .line 454
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 455
    goto :goto_b

    .line 456
    .line 457
    :cond_13
    :goto_a
    sget v1, Lcom/kubi/otc/R$string;->system_error:I

    .line 458
    .line 459
    .line 460
    invoke-static {v1}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 461
    .line 462
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 463
    return-object v1

    .line 464
    .line 465
    :cond_14
    instance-of v2, v1, Lnt/k$a;

    .line 466
    .line 467
    if-eqz v2, :cond_15

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;->O()Landroidx/lifecycle/MutableLiveData;

    .line 471
    move-result-object v2

    .line 472
    .line 473
    check-cast v1, Lnt/k$a;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1}, Lnt/k$a;->a()Ljava/lang/Exception;

    .line 477
    move-result-object v1

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 481
    .line 482
    :goto_b
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 483
    return-object v1

    .line 484
    .line 485
    :cond_15
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 486
    .line 487
    .line 488
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 489
    throw v1

    .line 490
    .line 491
    :cond_16
    :goto_c
    sget-object v1, Lcom/kubi/payment/track/IPaymentTrack;->a:Lcom/kubi/payment/track/IPaymentTrack$Companion;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v1}, Lcom/kubi/payment/track/IPaymentTrack$Companion;->getTrack()Lcom/kubi/payment/track/IPaymentTrack;

    .line 495
    move-result-object v1

    .line 496
    .line 497
    new-instance v2, Lcom/kubi/payment/track/FastTrackData;

    .line 498
    .line 499
    const-string v3, "buy"

    .line 500
    const/4 v4, 0x0

    .line 501
    const/4 v5, 0x2

    .line 502
    .line 503
    .line 504
    invoke-direct {v2, v3, v4, v5, v4}, Lcom/kubi/payment/track/FastTrackData;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 505
    .line 506
    iget-object v3, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->n0:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 507
    .line 508
    if-eqz v3, :cond_17

    .line 509
    .line 510
    .line 511
    invoke-virtual {v3}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;->getFiatCurrency()Ljava/lang/String;

    .line 512
    move-result-object v3

    .line 513
    goto :goto_d

    .line 514
    :cond_17
    move-object v3, v4

    .line 515
    .line 516
    .line 517
    :goto_d
    invoke-virtual {v2, v3}, Lcom/kubi/payment/track/PaymentTrackData;->setFiatCurrency(Ljava/lang/String;)V

    .line 518
    .line 519
    iget-object v3, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->n0:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 520
    .line 521
    if-eqz v3, :cond_18

    .line 522
    .line 523
    .line 524
    invoke-virtual {v3}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;->getCryptoCurrency()Ljava/lang/String;

    .line 525
    move-result-object v3

    .line 526
    goto :goto_e

    .line 527
    :cond_18
    move-object v3, v4

    .line 528
    .line 529
    .line 530
    :goto_e
    invoke-virtual {v2, v3}, Lcom/kubi/payment/track/PaymentTrackData;->setCryptoCurrency(Ljava/lang/String;)V

    .line 531
    .line 532
    iget-object v3, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->n0:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 533
    .line 534
    if-eqz v3, :cond_19

    .line 535
    .line 536
    .line 537
    invoke-virtual {v3}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;->getPaymentMethodCode()Ljava/lang/String;

    .line 538
    move-result-object v3

    .line 539
    goto :goto_f

    .line 540
    :cond_19
    move-object v3, v4

    .line 541
    .line 542
    .line 543
    :goto_f
    invoke-virtual {v2, v3}, Lcom/kubi/payment/track/PaymentTrackData;->setPaymentMethodCode(Ljava/lang/String;)V

    .line 544
    .line 545
    iget-object v3, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->n0:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 546
    .line 547
    if-eqz v3, :cond_1a

    .line 548
    .line 549
    .line 550
    invoke-virtual {v3}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;->getChannelId()Ljava/lang/String;

    .line 551
    move-result-object v8

    .line 552
    goto :goto_10

    .line 553
    :cond_1a
    move-object v8, v4

    .line 554
    .line 555
    .line 556
    :goto_10
    invoke-virtual {v2, v8}, Lcom/kubi/payment/track/PaymentTrackData;->setChannelId(Ljava/lang/String;)V

    .line 557
    .line 558
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 559
    const/4 v3, 0x0

    .line 560
    .line 561
    const-string v4, "CHECK_RISK_ERROR"

    .line 562
    .line 563
    const-string v5, "-10007:CHECK_RISK_ERROR"

    .line 564
    .line 565
    .line 566
    invoke-interface {v1, v4, v3, v5, v2}, Lcom/kubi/payment/track/IPaymentTrack;->j(Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/payment/track/FastTrackData;)V

    .line 567
    .line 568
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 569
    return-object v1
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
.end method


# virtual methods
.method public final h0()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->p0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
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

.method public final i0()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->o0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
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

.method public final j0()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->q0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
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

.method public final l0()Lcom/kubi/payment/fast/data/source/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;->m0:Lcom/kubi/payment/fast/data/source/a;

    .line 3
    return-object v0
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

.method public final n0()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v3, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$placeOrder$1;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v3, p0, v1}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$placeOrder$1;-><init>(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;Lkotlin/coroutines/Continuation;)V

    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 17
    return-void
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

.method public final x0(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "cvv"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    new-instance v4, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$submitCVV$1;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v4, p0, p1, v0}, Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM$submitCVV$1;-><init>(Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 23
    return-void
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
