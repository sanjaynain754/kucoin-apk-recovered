.class public final Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;
.super Lcom/kubi/mvi/state/BaseStateVM;
.source "AssetFuturesCoinsContract.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/BaseStateVM<",
        "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;",
        "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0094@\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@\u00a2\u0006\u0002\u0010\u0018R#\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u00038TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;",
        "Lcom/kubi/mvi/state/BaseStateVM;",
        "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;",
        "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;",
        "<init>",
        "()V",
        "api",
        "Lcom/kubi/assets/AssetV2Api;",
        "kotlin.jvm.PlatformType",
        "getApi",
        "()Lcom/kubi/assets/AssetV2Api;",
        "api$delegate",
        "Lkotlin/Lazy;",
        "dispatchIntentOnIO",
        "",
        "intent",
        "(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "futuresTrialVersion",
        "",
        "fetchFuturesTrialList",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchFuturesTrialDetails",
        "code",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "initState",
        "getInitState",
        "()Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;",
        "AssetsCenterLib_googleRelease"
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
        "SMAP\nAssetFuturesCoinsContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n126#2,2:224\n136#2:226\n49#3:227\n51#3:231\n49#3:238\n51#3:242\n49#3:246\n51#3:250\n46#4:228\n51#4:230\n46#4:239\n51#4:241\n46#4:247\n51#4:249\n105#5:229\n105#5:240\n105#5:248\n25#6:232\n26#6:234\n25#6:235\n26#6:237\n25#6:243\n26#6:245\n25#6:251\n26#6:253\n1#7:233\n1#7:236\n1#7:244\n1#7:252\n*S KotlinDebug\n*F\n+ 1 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel\n*L\n85#1:224,2\n93#1:226\n97#1:227\n97#1:231\n152#1:238\n152#1:242\n174#1:246\n174#1:250\n97#1:228\n97#1:230\n152#1:239\n152#1:241\n174#1:247\n174#1:249\n97#1:229\n152#1:240\n174#1:248\n113#1:232\n113#1:234\n138#1:235\n138#1:237\n162#1:243\n162#1:245\n215#1:251\n215#1:253\n113#1:233\n138#1:236\n162#1:244\n215#1:252\n*E\n"
    }
.end annotation


# instance fields
.field public final V:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public W:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/BaseStateVM;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/assets/futures/coins/d;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/assets/futures/coins/d;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->V:Lkotlin/Lazy;

    .line 15
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
.end method

.method private final B()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->V:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/h0;

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
.end method

.method public static synthetic n()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->v()Lcom/kubi/assets/h0;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic o(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;)Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->y(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;)Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;

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
.end method

.method public static synthetic p(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;)Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->x(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;)Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;

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
.end method

.method public static final synthetic q(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->z(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic r(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic s(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->W:I

    .line 3
    return p0
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
.end method

.method public static final synthetic t(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Ldr/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->sendSingleEvent(Ldr/a;)V

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
.end method

.method public static final synthetic u(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Lkotlin/jvm/functions/Function1;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method private static final v()Lcom/kubi/assets/h0;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->c()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lcom/kubi/assets/h0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/kubi/assets/h0;

    .line 13
    return-object v0
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
.end method

.method public static final x(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;)Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;
    .locals 9

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    check-cast p0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$HideOrShowNumber;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$HideOrShowNumber;->isChecked()Z

    .line 11
    move-result v3

    .line 12
    .line 13
    const/16 v7, 0x3b

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v0, p1

    .line 21
    .line 22
    .line 23
    invoke-static/range {v0 .. v8}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;->copy$default(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;Ljava/util/List;Lcom/kubi/assets/entity/AssetFuturesEntity;ZLcom/kubi/assets/entity/FuturesTrialAssets;Ljava/lang/Boolean;Lcom/kubi/assets/entity/SpotAccountOverviewEntity;ILjava/lang/Object;)Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;

    .line 24
    move-result-object p0

    .line 25
    return-object p0
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

.method public static final y(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;)Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;
    .locals 10

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v8, 0x1f

    .line 8
    const/4 v9, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v9}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;->copy$default(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;Ljava/util/List;Lcom/kubi/assets/entity/AssetFuturesEntity;ZLcom/kubi/assets/entity/FuturesTrialAssets;Ljava/lang/Boolean;Lcom/kubi/assets/entity/SpotAccountOverviewEntity;ILjava/lang/Object;)Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;

    .line 19
    move-result-object p0

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
.end method


# virtual methods
.method public final A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
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
    instance-of v0, p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$1;-><init>(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$1;->label:I

    .line 35
    const/4 v2, 0x1

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    goto :goto_2

    .line 44
    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->B()Lcom/kubi/assets/h0;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    const/16 v1, 0xa

    .line 61
    .line 62
    const-string v3, "ALL"

    .line 63
    .line 64
    const-string v5, "ACTIVATE_FINISHED"

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v5, v2, v1, v3}, Lcom/kubi/assets/h0;->f(Ljava/lang/String;IILjava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    new-instance v1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$$inlined$map$1;

    .line 71
    .line 72
    .line 73
    invoke-direct {v1, p1}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 74
    .line 75
    new-instance v3, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$3;

    .line 76
    const/4 p1, 0x0

    .line 77
    .line 78
    .line 79
    invoke-direct {v3, p0, p1}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$3;-><init>(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Lkotlin/coroutines/Continuation;)V

    .line 80
    .line 81
    iput v2, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$1;->label:I

    .line 82
    const/4 v2, 0x0

    .line 83
    const/4 v5, 0x1

    .line 84
    const/4 v6, 0x0

    .line 85
    .line 86
    .line 87
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    if-ne p1, v0, :cond_3

    .line 91
    return-object v0

    .line 92
    .line 93
    :cond_3
    :goto_2
    check-cast p1, Lcom/kubi/network/retrofit/utils/f;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 105
    return-object p1
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
.end method

.method public C()Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;

    .line 3
    .line 4
    const/16 v7, 0x3f

    .line 5
    const/4 v8, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v8}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;-><init>(Ljava/util/List;Lcom/kubi/assets/entity/AssetFuturesEntity;ZLcom/kubi/assets/entity/FuturesTrialAssets;Ljava/lang/Boolean;Lcom/kubi/assets/entity/SpotAccountOverviewEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
.end method

.method public bridge synthetic dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->w(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->C()Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public w(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1    # Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;-><init>(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->label:I

    .line 35
    const/4 v2, 0x5

    .line 36
    const/4 v3, 0x4

    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x1

    .line 40
    .line 41
    if-eqz v1, :cond_6

    .line 42
    .line 43
    if-eq v1, v7, :cond_5

    .line 44
    .line 45
    if-eq v1, v6, :cond_4

    .line 46
    .line 47
    if-eq v1, v5, :cond_3

    .line 48
    .line 49
    if-eq v1, v3, :cond_2

    .line 50
    .line 51
    if-ne v1, v2, :cond_1

    .line 52
    .line 53
    iget-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;

    .line 56
    .line 57
    .line 58
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    throw p1

    .line 69
    .line 70
    :cond_2
    iget-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;

    .line 73
    .line 74
    .line 75
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_3
    iget-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;

    .line 82
    .line 83
    .line 84
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 85
    .line 86
    goto/16 :goto_4

    .line 87
    .line 88
    :cond_4
    iget-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;

    .line 91
    .line 92
    .line 93
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 94
    .line 95
    goto/16 :goto_3

    .line 96
    .line 97
    :cond_5
    iget-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;

    .line 100
    .line 101
    .line 102
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 103
    goto :goto_2

    .line 104
    .line 105
    .line 106
    :cond_6
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 107
    .line 108
    iput-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    iput v7, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->label:I

    .line 111
    .line 112
    .line 113
    invoke-super {p0, p1, v4}, Lcom/kubi/mvi/state/BaseStateVM;->dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 114
    move-result-object p2

    .line 115
    .line 116
    if-ne p2, v0, :cond_7

    .line 117
    .line 118
    goto/16 :goto_6

    .line 119
    .line 120
    :cond_7
    :goto_2
    instance-of p2, p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$HideOrShowNumber;

    .line 121
    .line 122
    if-eqz p2, :cond_8

    .line 123
    .line 124
    sget-object p2, Llb/h;->a:Llb/h;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2}, Llb/h;->D()Ly70/g;

    .line 128
    move-result-object p2

    .line 129
    move-object v0, p1

    .line 130
    .line 131
    check-cast v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$HideOrShowNumber;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$HideOrShowNumber;->isChecked()Z

    .line 135
    move-result v0

    .line 136
    .line 137
    .line 138
    invoke-static {p2, v0}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 139
    .line 140
    new-instance p2, Lcom/kubi/assets/futures/coins/e;

    .line 141
    .line 142
    .line 143
    invoke-direct {p2, p1}, Lcom/kubi/assets/futures/coins/e;-><init>(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 147
    move-result p1

    .line 148
    .line 149
    .line 150
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 151
    .line 152
    goto/16 :goto_8

    .line 153
    .line 154
    :cond_8
    instance-of p2, p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchFuturesList;

    .line 155
    const/4 v1, 0x0

    .line 156
    .line 157
    if-eqz p2, :cond_a

    .line 158
    .line 159
    sget-object p2, Llb/h;->a:Llb/h;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Llb/h;->q()Ly70/g;

    .line 163
    move-result-object p2

    .line 164
    .line 165
    .line 166
    invoke-static {p2, v7}, Ly70/a;->d(Ly70/g;Z)Z

    .line 167
    move-result p2

    .line 168
    .line 169
    .line 170
    invoke-direct {p0}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->B()Lcom/kubi/assets/h0;

    .line 171
    move-result-object v2

    .line 172
    .line 173
    sget-object v3, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Lcom/kubi/assets/service/a;->j()Lcom/kubi/user/api/IUserService;

    .line 177
    move-result-object v3

    .line 178
    .line 179
    .line 180
    invoke-interface {v3}, Lcom/kubi/user/api/IUserService;->d0()Lcom/kubi/user/model/LoginUserEntity;

    .line 181
    move-result-object v3

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3}, Lcom/kubi/user/model/LoginUserEntity;->getBalanceCurrency()Ljava/lang/String;

    .line 185
    move-result-object v3

    .line 186
    .line 187
    .line 188
    invoke-interface {v2, v3, p2}, Lcom/kubi/assets/h0;->e1(Ljava/lang/String;Z)Lkotlinx/coroutines/flow/e;

    .line 189
    move-result-object v2

    .line 190
    .line 191
    new-instance v3, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$$inlined$map$1;

    .line 192
    .line 193
    .line 194
    invoke-direct {v3, v2}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 195
    .line 196
    new-instance v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$4;

    .line 197
    .line 198
    .line 199
    invoke-direct {v2, p0, v1}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$4;-><init>(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Lkotlin/coroutines/Continuation;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v3, v2}, Lkotlinx/coroutines/flow/g;->S(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 203
    move-result-object v2

    .line 204
    .line 205
    new-instance v3, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$5;

    .line 206
    .line 207
    .line 208
    invoke-direct {v3, p0, v1}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$5;-><init>(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Lkotlin/coroutines/Continuation;)V

    .line 209
    .line 210
    .line 211
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    move-result-object p1

    .line 213
    .line 214
    iput-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 215
    .line 216
    iput-boolean p2, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->Z$0:Z

    .line 217
    .line 218
    iput v6, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->label:I

    .line 219
    move-object v1, v2

    .line 220
    const/4 v2, 0x0

    .line 221
    const/4 v5, 0x1

    .line 222
    const/4 v6, 0x0

    .line 223
    .line 224
    .line 225
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 226
    move-result-object p2

    .line 227
    .line 228
    if-ne p2, v0, :cond_9

    .line 229
    goto :goto_6

    .line 230
    .line 231
    :cond_9
    :goto_3
    check-cast p2, Lcom/kubi/network/retrofit/utils/f;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p2}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 235
    move-result-object p1

    .line 236
    .line 237
    if-eqz p1, :cond_10

    .line 238
    .line 239
    .line 240
    invoke-static {p1}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 241
    goto :goto_8

    .line 242
    .line 243
    :cond_a
    instance-of p2, p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchFuturesTrialDetails;

    .line 244
    .line 245
    if-eqz p2, :cond_c

    .line 246
    move-object p2, p1

    .line 247
    .line 248
    check-cast p2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchFuturesTrialDetails;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p2}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchFuturesTrialDetails;->getCode()Ljava/lang/String;

    .line 252
    move-result-object p2

    .line 253
    .line 254
    .line 255
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    move-result-object p1

    .line 257
    .line 258
    iput-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 259
    .line 260
    iput v5, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->label:I

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0, p2, v4}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->z(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 264
    move-result-object p1

    .line 265
    .line 266
    if-ne p1, v0, :cond_b

    .line 267
    goto :goto_6

    .line 268
    .line 269
    :cond_b
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 270
    return-object p1

    .line 271
    .line 272
    :cond_c
    instance-of p2, p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchTrialList;

    .line 273
    .line 274
    if-eqz p2, :cond_e

    .line 275
    .line 276
    .line 277
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    move-result-object p1

    .line 279
    .line 280
    iput-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 281
    .line 282
    iput v3, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->label:I

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0, v4}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 286
    move-result-object p1

    .line 287
    .line 288
    if-ne p1, v0, :cond_d

    .line 289
    goto :goto_6

    .line 290
    .line 291
    :cond_d
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 292
    return-object p1

    .line 293
    .line 294
    :cond_e
    instance-of p2, p1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchSpotPnlOverview;

    .line 295
    .line 296
    if-eqz p2, :cond_11

    .line 297
    .line 298
    .line 299
    invoke-direct {p0}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->B()Lcom/kubi/assets/h0;

    .line 300
    move-result-object p2

    .line 301
    .line 302
    .line 303
    invoke-interface {p2}, Lcom/kubi/assets/h0;->t()Lkotlinx/coroutines/flow/e;

    .line 304
    move-result-object p2

    .line 305
    .line 306
    new-instance v3, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$7;

    .line 307
    .line 308
    .line 309
    invoke-direct {v3, p0, v1}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$7;-><init>(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Lkotlin/coroutines/Continuation;)V

    .line 310
    .line 311
    .line 312
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    move-result-object p1

    .line 314
    .line 315
    iput-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 316
    .line 317
    iput v2, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$1;->label:I

    .line 318
    const/4 v2, 0x0

    .line 319
    const/4 v5, 0x1

    .line 320
    const/4 v6, 0x0

    .line 321
    move-object v1, p2

    .line 322
    .line 323
    .line 324
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 325
    move-result-object p2

    .line 326
    .line 327
    if-ne p2, v0, :cond_f

    .line 328
    :goto_6
    return-object v0

    .line 329
    .line 330
    :cond_f
    :goto_7
    check-cast p2, Lcom/kubi/network/retrofit/utils/f;

    .line 331
    .line 332
    .line 333
    invoke-virtual {p2}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 334
    move-result-object p1

    .line 335
    .line 336
    if-eqz p1, :cond_10

    .line 337
    .line 338
    .line 339
    invoke-static {p1}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 340
    .line 341
    new-instance p1, Lcom/kubi/assets/futures/coins/f;

    .line 342
    .line 343
    .line 344
    invoke-direct {p1}, Lcom/kubi/assets/futures/coins/f;-><init>()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 348
    .line 349
    :cond_10
    :goto_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 350
    return-object p1

    .line 351
    .line 352
    :cond_11
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 353
    .line 354
    .line 355
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 356
    throw p1
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
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
.end method

.method public final z(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
    instance-of v0, p2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1;-><init>(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1;->label:I

    .line 35
    const/4 v2, 0x1

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    iget-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    goto :goto_2

    .line 48
    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    throw p1

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    iget p2, p0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->W:I

    .line 61
    add-int/2addr p2, v2

    .line 62
    .line 63
    iput p2, p0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->W:I

    .line 64
    .line 65
    sget-object p2, Lcom/kubi/mvi/event/SingleEvent$h;->b:Lcom/kubi/mvi/event/SingleEvent$h;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->sendSingleEvent(Ldr/a;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->B()Lcom/kubi/assets/h0;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    .line 75
    invoke-interface {p2, p1}, Lcom/kubi/assets/h0;->w1(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 76
    move-result-object p2

    .line 77
    .line 78
    new-instance v1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1;

    .line 79
    .line 80
    .line 81
    invoke-direct {v1, p2, p0}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/e;Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;)V

    .line 82
    .line 83
    new-instance p2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$3;

    .line 84
    const/4 v3, 0x0

    .line 85
    .line 86
    .line 87
    invoke-direct {p2, p0, v3}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$3;-><init>(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Lkotlin/coroutines/Continuation;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v1, p2}, Lkotlinx/coroutines/flow/g;->S(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 91
    move-result-object v1

    .line 92
    move-object p2, v3

    .line 93
    .line 94
    new-instance v3, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$4;

    .line 95
    .line 96
    .line 97
    invoke-direct {v3, p0, p2}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$4;-><init>(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;Lkotlin/coroutines/Continuation;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    iput-object p1, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1;->L$0:Ljava/lang/Object;

    .line 104
    .line 105
    iput v2, v4, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$1;->label:I

    .line 106
    const/4 v2, 0x0

    .line 107
    const/4 v5, 0x1

    .line 108
    const/4 v6, 0x0

    .line 109
    .line 110
    .line 111
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 112
    move-result-object p2

    .line 113
    .line 114
    if-ne p2, v0, :cond_3

    .line 115
    return-object v0

    .line 116
    .line 117
    :cond_3
    :goto_2
    check-cast p2, Lcom/kubi/network/retrofit/utils/f;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 121
    move-result-object p1

    .line 122
    .line 123
    if-eqz p1, :cond_4

    .line 124
    .line 125
    .line 126
    invoke-static {p1}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 129
    return-object p1
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
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
.end method
