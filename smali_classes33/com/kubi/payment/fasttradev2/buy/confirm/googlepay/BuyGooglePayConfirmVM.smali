.class public final Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;
.super Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;
.source "BuyGooglePayConfirmVM.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0082@\u00a2\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010!\u001a\u0004\u0018\u00010\u000eH\u0082@\u00a2\u0006\u0002\u0010\"J \u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u000e2\u0008\u0010%\u001a\u0004\u0018\u00010\u000eH\u0082@\u00a2\u0006\u0002\u0010&J&\u0010\'\u001a\u00020 2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0082@\u00a2\u0006\u0002\u0010,J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0012R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"
    }
    d2 = {
        "Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;",
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
        "_htmlString",
        "Landroidx/lifecycle/MutableLiveData;",
        "",
        "htmlString",
        "Landroidx/lifecycle/LiveData;",
        "getHtmlString",
        "()Landroidx/lifecycle/LiveData;",
        "_redirectUrl",
        "redirectUrl",
        "getRedirectUrl",
        "googlePayClient",
        "Lcom/google/android/gms/wallet/PaymentsClient;",
        "loadPaymentDataTask",
        "Lcom/google/android/gms/tasks/Task;",
        "Lcom/google/android/gms/wallet/PaymentData;",
        "handlePaymentData",
        "Lcom/kubi/payment/fast/data/entities/GooglePaymentData;",
        "paymentData",
        "(Lcom/google/android/gms/wallet/PaymentData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "placeOrder",
        "",
        "loadRiskSessionId",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
        "SMAP\nBuyGooglePayConfirmVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyGooglePayConfirmVM.kt\ncom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,295:1\n1#2:296\n44#3,2:297\n*S KotlinDebug\n*F\n+ 1 BuyGooglePayConfirmVM.kt\ncom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM\n*L\n90#1:297,2\n*E\n"
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
            "Ljava/lang/String;",
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

.field public q0:Lcom/google/android/gms/wallet/PaymentsClient;
    .annotation build Lorg/jetbrains/annotations/Nullable;
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
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->m0:Lcom/kubi/payment/fast/data/source/a;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->n0:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 13
    .line 14
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 18
    .line 19
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->o0:Landroidx/lifecycle/MutableLiveData;

    .line 20
    .line 21
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    .line 24
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 25
    .line 26
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->p0:Landroidx/lifecycle/MutableLiveData;

    .line 27
    .line 28
    sget-object p1, Lcom/kubi/payment/fast/buy/popularpay/googlepay/h;->a:Lcom/kubi/payment/fast/buy/popularpay/googlepay/h;

    .line 29
    .line 30
    sget-object p2, Lcom/kubi/sdk/BaseApplication;->Companion:Lcom/kubi/sdk/BaseApplication$Companion;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/kubi/sdk/BaseApplication$Companion;->get()Landroid/app/Application;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Lcom/kubi/payment/fast/buy/popularpay/googlepay/h;->e(Landroid/content/Context;)Lcom/google/android/gms/wallet/PaymentsClient;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->q0:Lcom/google/android/gms/wallet/PaymentsClient;

    .line 41
    return-void
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

.method public static final synthetic Y(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

.method public static final synthetic Z(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->o0:Landroidx/lifecycle/MutableLiveData;

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

.method public static final synthetic a0(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;)Landroidx/lifecycle/MutableLiveData;
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

.method public static final synthetic b0(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;->O()Landroidx/lifecycle/MutableLiveData;

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

.method public static final synthetic c0(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->p0:Landroidx/lifecycle/MutableLiveData;

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

.method public static final synthetic d0(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;Lcom/google/android/gms/wallet/PaymentData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->n0(Lcom/google/android/gms/wallet/PaymentData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method public static final synthetic e0(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->p0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method public static final synthetic f0(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->x0(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public static final synthetic g0(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct/range {p0 .. p5}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->y0(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method private final h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
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

.method private final n0(Lcom/google/android/gms/wallet/PaymentData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wallet/PaymentData;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/payment/fast/data/entities/GooglePaymentData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$handlePaymentData$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1, v2}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$handlePaymentData$2;-><init>(Lcom/google/android/gms/wallet/PaymentData;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method private final p0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    instance-of v0, p1, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$loadRiskSessionId$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$loadRiskSessionId$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$loadRiskSessionId$1;->label:I

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
    iput v1, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$loadRiskSessionId$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$loadRiskSessionId$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$loadRiskSessionId$1;-><init>(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$loadRiskSessionId$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$loadRiskSessionId$1;->label:I

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
    iget-object v0, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$loadRiskSessionId$1;->L$0:Ljava/lang/Object;

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
    iget-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->n0:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

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
    iget-object v2, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->m0:Lcom/kubi/payment/fast/data/source/a;

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    move-result-object v5

    .line 89
    .line 90
    iput-object v5, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$loadRiskSessionId$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    iput v3, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$loadRiskSessionId$1;->label:I

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

.method private final x0(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    invoke-direct/range {v0 .. v5}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->y0(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method private final y0(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    instance-of v2, v1, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;

    .line 12
    .line 13
    iget v3, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->label:I

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
    iput v3, v2, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->label:I

    .line 23
    :goto_0
    move-object v5, v2

    .line 24
    goto :goto_1

    .line 25
    .line 26
    :cond_0
    new-instance v2, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, v0, v1}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;-><init>(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;Lkotlin/coroutines/Continuation;)V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :goto_1
    iget-object v1, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->result:Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 36
    move-result-object v6

    .line 37
    .line 38
    iget v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->label:I

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
    iget-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Lnt/k;

    .line 57
    .line 58
    iget-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

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
    iget-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$2:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;

    .line 78
    .line 79
    iget-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$1:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Lnt/k;

    .line 82
    .line 83
    iget-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

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
    iget v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->I$0:I

    .line 93
    .line 94
    iget-wide v7, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->J$0:J

    .line 95
    .line 96
    iget-object v9, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

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
    iget v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->I$0:I

    .line 106
    .line 107
    iget-wide v8, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->J$0:J

    .line 108
    .line 109
    iget-object v10, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

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
    iput-object v1, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 123
    .line 124
    move-wide/from16 v9, p2

    .line 125
    .line 126
    iput-wide v9, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->J$0:J

    .line 127
    .line 128
    move/from16 v2, p4

    .line 129
    .line 130
    iput v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->I$0:I

    .line 131
    .line 132
    iput v8, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->label:I

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
    iget-object v1, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->m0:Lcom/kubi/payment/fast/data/source/a;

    .line 211
    .line 212
    iput-object v10, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 213
    .line 214
    iput-wide v8, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->J$0:J

    .line 215
    .line 216
    iput v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->I$0:I

    .line 217
    .line 218
    iput v7, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->label:I

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
    iput-object v10, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    move-result-object v1

    .line 266
    .line 267
    iput-object v1, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$1:Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    move-result-object v1

    .line 272
    .line 273
    iput-object v1, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$2:Ljava/lang/Object;

    .line 274
    .line 275
    iput-wide v7, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->J$0:J

    .line 276
    .line 277
    iput v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->I$0:I

    .line 278
    .line 279
    iput v4, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->label:I

    .line 280
    move v4, v2

    .line 281
    move-wide v2, v7

    .line 282
    move-object v1, v9

    .line 283
    .line 284
    .line 285
    invoke-direct/range {v0 .. v5}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->y0(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    iget-object v1, v0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->p0:Landroidx/lifecycle/MutableLiveData;

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
    iput-object v2, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$0:Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    move-result-object v1

    .line 346
    .line 347
    iput-object v1, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->L$1:Ljava/lang/Object;

    .line 348
    .line 349
    iput-wide v7, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->J$0:J

    .line 350
    .line 351
    iput v4, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->I$0:I

    .line 352
    .line 353
    iput v3, v5, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$queryStatus$1;->label:I

    .line 354
    move-wide v2, v7

    .line 355
    move-object v1, v10

    .line 356
    .line 357
    .line 358
    invoke-direct/range {v0 .. v5}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->y0(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;

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


# virtual methods
.method public final i0()Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->n0:Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

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
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->o0:Landroidx/lifecycle/MutableLiveData;

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

.method public final l0()Landroidx/lifecycle/LiveData;
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
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->p0:Landroidx/lifecycle/MutableLiveData;

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

.method public final m0()Lcom/kubi/payment/fast/data/source/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->m0:Lcom/kubi/payment/fast/data/source/a;

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

.method public final o0()Lcom/google/android/gms/tasks/Task;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

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
    if-nez v0, :cond_0

    .line 14
    return-object v1

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;->getGooglePayInfo()Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyGooglePayInfo;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    return-object v1

    .line 22
    .line 23
    :cond_1
    :try_start_0
    sget-object v3, Lcom/kubi/payment/fast/buy/popularpay/googlepay/h;->a:Lcom/kubi/payment/fast/buy/popularpay/googlepay/h;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyGooglePayInfo;->getSupportedNetworks()Ljava/util/List;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;->getFiatAmount()Ljava/lang/String;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyGooglePayInfo;->getPublicKey()Ljava/lang/String;

    .line 35
    move-result-object v6

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyGooglePayInfo;->getMerchantName()Ljava/lang/String;

    .line 39
    move-result-object v7

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;->getFiatCurrency()Ljava/lang/String;

    .line 43
    move-result-object v8

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyGooglePayInfo;->getCountryCode()Ljava/lang/String;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    const-string v0, ""

    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    goto :goto_2

    .line 55
    .line 56
    .line 57
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 58
    move-result v2

    .line 59
    .line 60
    if-nez v2, :cond_3

    .line 61
    move-object v9, v1

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move-object v9, v0

    .line 64
    .line 65
    .line 66
    :goto_1
    invoke-virtual/range {v3 .. v9}, Lcom/kubi/payment/fast/buy/popularpay/googlepay/h;->d(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    const-string v2, "payment"

    .line 70
    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    const-string v4, "Google Pay paymentDataRequestJson:"

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v3}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lcom/google/android/gms/wallet/PaymentDataRequest;->fromJson(Ljava/lang/String;)Lcom/google/android/gms/wallet/PaymentDataRequest;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    const-string v2, "fromJson(...)"

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    iget-object v2, p0, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;->q0:Lcom/google/android/gms/wallet/PaymentsClient;

    .line 105
    .line 106
    if-eqz v2, :cond_4

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v0}, Lcom/google/android/gms/wallet/PaymentsClient;->loadPaymentData(Lcom/google/android/gms/wallet/PaymentDataRequest;)Lcom/google/android/gms/tasks/Task;

    .line 110
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    return-object v0

    .line 112
    :cond_4
    return-object v1

    .line 113
    .line 114
    :goto_2
    new-instance v3, Ljava/lang/Throwable;

    .line 115
    .line 116
    new-instance v2, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    const-string v4, "Google Pay load payment data error: "

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    .line 138
    invoke-direct {v3, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    new-instance v2, Lcom/kubi/otc/exception/OtcException;

    .line 141
    .line 142
    const/16 v7, 0x8

    .line 143
    const/4 v8, 0x0

    .line 144
    .line 145
    const-string v4, "payment"

    .line 146
    const/4 v5, 0x0

    .line 147
    const/4 v6, 0x0

    .line 148
    .line 149
    .line 150
    invoke-direct/range {v2 .. v8}, Lcom/kubi/otc/exception/OtcException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 151
    const/4 v0, 0x2

    .line 152
    .line 153
    .line 154
    invoke-static {v2, v1, v0, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 155
    return-object v1
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

.method public final q0(Lcom/google/android/gms/wallet/PaymentData;)V
    .locals 7
    .param p1    # Lcom/google/android/gms/wallet/PaymentData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "paymentData"

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
    new-instance v4, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$placeOrder$1;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v4, p0, p1, v0}, Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$placeOrder$1;-><init>(Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;Lcom/google/android/gms/wallet/PaymentData;Lkotlin/coroutines/Continuation;)V

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
