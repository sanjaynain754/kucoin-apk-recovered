.class public final Lcom/kubi/assets/overview/coin/AssetCoinViewModel;
.super Lcom/kubi/mvi/state/l;
.source "AssetCoinViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/l<",
        "Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0094@\u00a2\u0006\u0002\u0010\u001aJ(\u0010\u001b\u001a\u00020\u00142\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010&\u001a\u00020\u0017H\u0082@\u00a2\u0006\u0002\u0010\'J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0014H\u0002J\u001c\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\n\u0012\u0004\u0012\u00020\u001e\u0018\u0001`,H\u0002J\u0008\u0010-\u001a\u00020\u0017H\u0016J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u001eH\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u001b\u0010\u000c\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000b\u001a\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u00100\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u00081\u00102\u00a8\u00063"
    }
    d2 = {
        "Lcom/kubi/assets/overview/coin/AssetCoinViewModel;",
        "Lcom/kubi/mvi/state/SimpleStateVM;",
        "Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;",
        "<init>",
        "()V",
        "api",
        "Lcom/kubi/assets/AssetV2Api;",
        "kotlin.jvm.PlatformType",
        "getApi",
        "()Lcom/kubi/assets/AssetV2Api;",
        "api$delegate",
        "Lkotlin/Lazy;",
        "restfulApi",
        "Lcom/kubi/assets/IRestfulApi;",
        "getRestfulApi",
        "()Lcom/kubi/assets/IRestfulApi;",
        "restfulApi$delegate",
        "protocolScope",
        "Lcom/kubi/assets/utils/ParentCoroutineScope;",
        "category",
        "",
        "keys",
        "dispatchIntentOnIO",
        "",
        "intent",
        "Lcom/kubi/mvi/state/IIntent;",
        "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getTip",
        "showList",
        "Ljava/util/ArrayList;",
        "Lcom/kubi/assets/entity/AssetCoinEntity;",
        "isChecked",
        "",
        "size",
        "",
        "convertSpan",
        "Landroid/text/SpannableString;",
        "tip",
        "handleGetCoinList",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "subscribeSpotWS",
        "Lkotlinx/coroutines/Job;",
        "spotSymbols",
        "getCoinCache",
        "Lkotlin/collections/ArrayList;",
        "onHide",
        "getTradeCode",
        "entity",
        "initState",
        "getInitState",
        "()Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;",
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
        "SMAP\nAssetCoinViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinViewModel.kt\ncom/kubi/assets/overview/coin/AssetCoinViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 5 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 6 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 7 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,237:1\n774#2:238\n865#2,2:239\n1563#2:242\n1634#2,3:243\n1869#2:251\n1870#2:259\n1#3:241\n1#3:247\n25#4:246\n26#4:248\n250#5,2:249\n281#5,4:252\n139#6:256\n17#6:257\n178#7:258\n*S KotlinDebug\n*F\n+ 1 AssetCoinViewModel.kt\ncom/kubi/assets/overview/coin/AssetCoinViewModel\n*L\n83#1:238\n83#1:239,2\n143#1:242\n143#1:243,3\n219#1:251\n219#1:259\n185#1:247\n185#1:246\n185#1:248\n213#1:249,2\n220#1:252,4\n220#1:256\n220#1:257\n220#1:258\n*E\n"
    }
.end annotation


# instance fields
.field public final W:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final X:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Llb/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Z:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a0:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/l;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/assets/overview/coin/j;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/assets/overview/coin/j;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->W:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/assets/overview/coin/k;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/kubi/assets/overview/coin/k;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->X:Lkotlin/Lazy;

    .line 26
    .line 27
    new-instance v0, Llb/f;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v1}, Llb/f;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    .line 35
    .line 36
    iput-object v0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->Y:Llb/f;

    .line 37
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    const-string v1, "asset_coin_cache"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    sget-object v1, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/kubi/assets/service/a;->j()Lcom/kubi/user/api/IUserService;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Lcom/kubi/user/api/IUserService;->d()Ljava/lang/String;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    iput-object v0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->Z:Ljava/lang/String;

    .line 66
    .line 67
    const-string v0, "asset_codes"

    .line 68
    .line 69
    iput-object v0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->a0:Ljava/lang/String;

    .line 70
    return-void
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
.end method

.method private static final A()Lcom/kubi/assets/h0;
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

.method public static final C(Ljava/util/ArrayList;Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;
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
    const/16 v7, 0x1e

    .line 8
    const/4 v8, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    move-object v2, p0

    .line 14
    move-object v1, p1

    .line 15
    .line 16
    .line 17
    invoke-static/range {v1 .. v8}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;->copy$default(Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;Ljava/util/ArrayList;Lcom/kubi/data/entity/WsMarketSnapshotEntity;ZLjava/util/ArrayList;Landroid/text/SpannableString;ILjava/lang/Object;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
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

.method public static final D(Lcom/kubi/mvi/state/d;Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;
    .locals 8

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    check-cast p0, Lcom/kubi/assets/overview/coin/AssetCoinContract$UiIntent$HideOrShowNumber;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UiIntent$HideOrShowNumber;->isChecked()Z

    .line 11
    move-result v3

    .line 12
    .line 13
    const/16 v6, 0x1b

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v0, p1

    .line 20
    .line 21
    .line 22
    invoke-static/range {v0 .. v7}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;->copy$default(Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;Ljava/util/ArrayList;Lcom/kubi/data/entity/WsMarketSnapshotEntity;ZLjava/util/ArrayList;Landroid/text/SpannableString;ILjava/lang/Object;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

    .line 23
    move-result-object p0

    .line 24
    return-object p0
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

.method public static final E(Ljava/util/ArrayList;Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Ljava/lang/String;ILcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;
    .locals 9

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p2, p3}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->B(Ljava/lang/String;I)Landroid/text/SpannableString;

    .line 9
    move-result-object v6

    .line 10
    const/4 v7, 0x7

    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v5, p0

    .line 16
    move-object v1, p4

    .line 17
    .line 18
    .line 19
    invoke-static/range {v1 .. v8}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;->copy$default(Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;Ljava/util/ArrayList;Lcom/kubi/data/entity/WsMarketSnapshotEntity;ZLjava/util/ArrayList;Landroid/text/SpannableString;ILjava/lang/Object;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

    .line 20
    move-result-object p0

    .line 21
    return-object p0
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
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
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
.end method

.method private final F()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->W:Lkotlin/Lazy;

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

.method private final L(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 28
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
    instance-of v2, v1, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;

    .line 12
    .line 13
    iget v3, v2, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;->label:I

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
    iput v3, v2, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;->label:I

    .line 23
    :goto_0
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    .line 26
    :cond_0
    new-instance v2, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, v0, v1}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;-><init>(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Lkotlin/coroutines/Continuation;)V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :goto_1
    iget-object v1, v6, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;->result:Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    iget v3, v6, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;->label:I

    .line 39
    const/4 v9, 0x2

    .line 40
    const/4 v10, 0x1

    .line 41
    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    if-eq v3, v10, :cond_2

    .line 45
    .line 46
    if-ne v3, v9, :cond_1

    .line 47
    .line 48
    iget-object v2, v6, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;->L$1:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Ljava/util/List;

    .line 51
    .line 52
    iget-object v2, v6, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Ljava/util/List;

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    throw v1

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 71
    goto :goto_2

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {v0}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->F()Lcom/kubi/assets/h0;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    invoke-interface {v1}, Lcom/kubi/assets/h0;->i0()Lkotlinx/coroutines/flow/e;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    iput v10, v6, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;->label:I

    .line 85
    const/4 v4, 0x0

    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v7, 0x2

    .line 88
    const/4 v8, 0x0

    .line 89
    .line 90
    .line 91
    invoke-static/range {v3 .. v8}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->g(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    if-ne v1, v2, :cond_4

    .line 95
    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :cond_4
    :goto_2
    check-cast v1, Lcom/kubi/network/retrofit/utils/f;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Lcom/kubi/network/retrofit/utils/f;->a()Ljava/lang/Object;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    check-cast v1, Ljava/util/List;

    .line 105
    const/4 v3, 0x0

    .line 106
    .line 107
    if-eqz v1, :cond_5

    .line 108
    .line 109
    new-instance v4, Ljava/util/ArrayList;

    .line 110
    .line 111
    const/16 v5, 0xa

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 115
    move-result v5

    .line 116
    .line 117
    .line 118
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    move-result-object v5

    .line 123
    .line 124
    .line 125
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    move-result v7

    .line 127
    .line 128
    if-eqz v7, :cond_6

    .line 129
    .line 130
    .line 131
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    move-result-object v7

    .line 133
    .line 134
    check-cast v7, Lcom/kubi/assets/entity/DelistCoinListResp;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7}, Lcom/kubi/assets/entity/DelistCoinListResp;->getCurrency()Ljava/lang/String;

    .line 138
    move-result-object v14

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7}, Lcom/kubi/assets/entity/DelistCoinListResp;->getCurrency()Ljava/lang/String;

    .line 142
    move-result-object v13

    .line 143
    .line 144
    .line 145
    invoke-virtual {v7}, Lcom/kubi/assets/entity/DelistCoinListResp;->getCurrencyIcon()Ljava/lang/String;

    .line 146
    move-result-object v21

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7}, Lcom/kubi/assets/entity/DelistCoinListResp;->getBalance()Ljava/lang/String;

    .line 150
    move-result-object v17

    .line 151
    .line 152
    new-instance v11, Lcom/kubi/assets/entity/AssetCoinEntity;

    .line 153
    .line 154
    .line 155
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 156
    move-result-object v25

    .line 157
    .line 158
    const/16 v26, 0x1cd1

    .line 159
    .line 160
    const/16 v27, 0x0

    .line 161
    const/4 v12, 0x0

    .line 162
    .line 163
    const-string v15, "0"

    .line 164
    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    const/16 v18, 0x0

    .line 168
    .line 169
    const/16 v19, 0x0

    .line 170
    .line 171
    const-string v20, ""

    .line 172
    .line 173
    const/16 v22, 0x0

    .line 174
    .line 175
    const/16 v23, 0x0

    .line 176
    .line 177
    const/16 v24, 0x0

    .line 178
    .line 179
    .line 180
    invoke-direct/range {v11 .. v27}, Lcom/kubi/assets/entity/AssetCoinEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/data/entity/CoinInfoEntity;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 184
    goto :goto_3

    .line 185
    :cond_5
    move-object v4, v3

    .line 186
    .line 187
    :cond_6
    if-nez v4, :cond_7

    .line 188
    .line 189
    .line 190
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 191
    move-result-object v4

    .line 192
    .line 193
    .line 194
    :cond_7
    invoke-direct {v0}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->F()Lcom/kubi/assets/h0;

    .line 195
    move-result-object v5

    .line 196
    .line 197
    .line 198
    invoke-static {v5, v3, v10, v3}, Lcom/kubi/assets/h0;->P0(Lcom/kubi/assets/h0;Ljava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 199
    move-result-object v5

    .line 200
    move-object v7, v5

    .line 201
    .line 202
    new-instance v5, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$2;

    .line 203
    .line 204
    .line 205
    invoke-direct {v5, v0, v4, v3}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$2;-><init>(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    move-result-object v1

    .line 210
    .line 211
    iput-object v1, v6, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;->L$0:Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    move-result-object v1

    .line 216
    .line 217
    iput-object v1, v6, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;->L$1:Ljava/lang/Object;

    .line 218
    .line 219
    iput v9, v6, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$1;->label:I

    .line 220
    const/4 v4, 0x0

    .line 221
    move-object v3, v7

    .line 222
    const/4 v7, 0x1

    .line 223
    const/4 v8, 0x0

    .line 224
    .line 225
    .line 226
    invoke-static/range {v3 .. v8}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 227
    move-result-object v1

    .line 228
    .line 229
    if-ne v1, v2, :cond_8

    .line 230
    :goto_4
    return-object v2

    .line 231
    .line 232
    :cond_8
    :goto_5
    check-cast v1, Lcom/kubi/network/retrofit/utils/f;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 236
    move-result-object v1

    .line 237
    .line 238
    if-eqz v1, :cond_9

    .line 239
    .line 240
    sget-object v1, Lcom/kubi/mvi/event/SingleEvent$c;->b:Lcom/kubi/mvi/event/SingleEvent$c;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v1}, Lcom/kubi/mvi/state/BaseStateVM;->sendSingleEvent(Ldr/a;)V

    .line 244
    .line 245
    :cond_9
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 246
    return-object v1
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
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
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
.end method

.method public static final M()Lcom/kubi/assets/y0;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/network/restful/b$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/network/restful/b$a;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lgr/b;

    .line 8
    .line 9
    const-string v2, "network/channel_default"

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Ler/b;->e(Ljava/lang/String;)Ler/a;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, Lgr/b;-><init>(Ler/a;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b$a;->b(Lkr/b;)Lcom/kubi/network/restful/b$a;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    new-instance v1, Lgr/h;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Lgr/h;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b$a;->c(Lkr/d;)Lcom/kubi/network/restful/b$a;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/kubi/network/restful/b$a;->a()Lcom/kubi/network/restful/b;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    const-class v1, Lcom/kubi/assets/y0;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    check-cast v0, Lcom/kubi/assets/y0;

    .line 42
    return-object v0
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
.end method

.method public static synthetic b(Ljava/util/ArrayList;Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Ljava/lang/String;ILcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->E(Ljava/util/ArrayList;Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Ljava/lang/String;ILcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

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
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
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
.end method

.method public static synthetic n()Lcom/kubi/assets/y0;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->M()Lcom/kubi/assets/y0;

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

.method public static synthetic o()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->A()Lcom/kubi/assets/h0;

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

.method public static synthetic p(Ljava/util/ArrayList;Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->C(Ljava/util/ArrayList;Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

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

.method public static synthetic q(Lcom/kubi/mvi/state/d;Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->D(Lcom/kubi/mvi/state/d;Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

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

.method public static final synthetic r(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;)Lcom/kubi/assets/h0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->F()Lcom/kubi/assets/h0;

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

.method public static final synthetic s(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->Z:Ljava/lang/String;

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
.end method

.method public static final synthetic t(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->a0:Ljava/lang/String;

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
.end method

.method public static final synthetic u(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;)Llb/f;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->Y:Llb/f;

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
.end method

.method public static final synthetic v(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;)Lcom/kubi/assets/y0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->I()Lcom/kubi/assets/y0;

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

.method public static final synthetic w(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Lcom/kubi/assets/entity/AssetCoinEntity;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->K(Lcom/kubi/assets/entity/AssetCoinEntity;)Ljava/lang/String;

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

.method public static final synthetic x(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->L(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method public static final synthetic y(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Ljava/lang/String;)Lkotlinx/coroutines/x1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->N(Ljava/lang/String;)Lkotlinx/coroutines/x1;

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

.method public static final synthetic z(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Lkotlin/jvm/functions/Function1;)Z
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


# virtual methods
.method public final B(Ljava/lang/String;I)Landroid/text/SpannableString;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Landroid/text/SpannableString;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 17
    move-result p1

    .line 18
    .line 19
    .line 20
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    move-result-object p2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 25
    move-result p2

    .line 26
    .line 27
    if-gez p1, :cond_0

    .line 28
    return-object v0

    .line 29
    .line 30
    :cond_0
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    .line 31
    .line 32
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 33
    .line 34
    sget v3, Lcom/kubi/assets/R$color;->c_text:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v3}, Lcom/kubi/utils/c;->a(I)I

    .line 38
    move-result v2

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 42
    add-int/2addr p2, p1

    .line 43
    .line 44
    const/16 v2, 0x11

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, p1, p2, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 48
    return-object v0
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

.method public final G()Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/assets/entity/AssetCoinEntity;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->a0:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->Z:Ljava/lang/String;

    .line 5
    .line 6
    const-string v2, ""

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v0, v2}, Ly70/e;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    .line 13
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    return-object v1

    .line 19
    .line 20
    :cond_0
    const-string v0, ","

    .line 21
    .line 22
    .line 23
    filled-new-array {v0}, [Ljava/lang/String;

    .line 24
    move-result-object v4

    .line 25
    const/4 v7, 0x6

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->toCollection(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    check-cast v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    new-instance v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    move-result v3

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    check-cast v3, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v4, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->Z:Ljava/lang/String;

    .line 67
    .line 68
    sget-object v5, Ly70/e;->a:Ly70/e;

    .line 69
    .line 70
    new-instance v5, Ly70/g;

    .line 71
    .line 72
    sget-object v6, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 73
    const/4 v7, 0x1

    .line 74
    .line 75
    .line 76
    invoke-direct {v5, v4, v3, v6, v7}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 77
    .line 78
    sget-object v3, Ly70/a;->a:Ly70/a;

    .line 79
    .line 80
    const-class v4, Lcom/kubi/assets/entity/AssetCoinEntity;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v5, v4, v1}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    check-cast v3, Lcom/kubi/assets/entity/AssetCoinEntity;

    .line 87
    .line 88
    if-eqz v3, :cond_1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    goto :goto_0

    .line 93
    :cond_2
    return-object v2
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
.end method

.method public H()Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

    .line 3
    .line 4
    const/16 v6, 0x1f

    .line 5
    const/4 v7, 0x0

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
    .line 12
    .line 13
    invoke-direct/range {v0 .. v7}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;-><init>(Ljava/util/ArrayList;Lcom/kubi/data/entity/WsMarketSnapshotEntity;ZLjava/util/ArrayList;Landroid/text/SpannableString;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    return-object v0
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

.method public final I()Lcom/kubi/assets/y0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->X:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/y0;

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

.method public final J(Ljava/util/ArrayList;ZI)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/assets/entity/AssetCoinEntity;",
            ">;ZI)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    move-result p1

    .line 8
    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    :cond_0
    if-eqz p3, :cond_2

    .line 12
    .line 13
    if-eqz p2, :cond_2

    .line 14
    .line 15
    sget-object p1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 16
    .line 17
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 18
    .line 19
    sget p2, Lcom/kubi/assets/R$string;->kc_assets_coin_empty_title:I

    .line 20
    .line 21
    new-array v0, v0, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    sget-object p3, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3}, Lcom/kubi/assets/service/AssetsHelper;->h()Lcom/kubi/assets/entity/SmallEntity;

    .line 35
    move-result-object p3

    .line 36
    .line 37
    if-eqz p3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3}, Lcom/kubi/assets/entity/SmallEntity;->showString()Ljava/lang/String;

    .line 41
    move-result-object p3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 p3, 0x0

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-static {p3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object p3

    .line 48
    .line 49
    .line 50
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    .line 51
    move-result-object p2

    .line 52
    const/4 p3, 0x2

    .line 53
    .line 54
    .line 55
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    move-result-object p2

    .line 57
    .line 58
    .line 59
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    const-string p2, "format(...)"

    .line 63
    .line 64
    .line 65
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    return-object p1

    .line 67
    .line 68
    :cond_2
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 69
    .line 70
    sget p2, Lcom/kubi/assets/R$string;->no_records:I

    .line 71
    .line 72
    new-array p3, v0, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2, p3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    move-result-object p1

    .line 77
    return-object p1
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

.method public final K(Lcom/kubi/assets/entity/AssetCoinEntity;)Ljava/lang/String;
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
    .line 8
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCode()Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const/16 v1, 0x2d

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetCoinEntity;->getQuote()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    return-object p1
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

.method public final N(Ljava/lang/String;)Lkotlinx/coroutines/x1;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->Y:Llb/f;

    .line 3
    .line 4
    new-instance v3, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1;-><init>(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1    # Lcom/kubi/mvi/state/d;
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
            "Lcom/kubi/mvi/state/d;",
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
    instance-of v0, p2, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;-><init>(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;->label:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 45
    .line 46
    .line 47
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    goto :goto_3

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 57
    .line 58
    :cond_2
    iget-object p1, v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 61
    .line 62
    .line 63
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    goto :goto_1

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    iput-object p1, v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    iput v4, v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;->label:I

    .line 72
    .line 73
    .line 74
    invoke-super {p0, p1, v0}, Lcom/kubi/mvi/state/BaseStateVM;->dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 75
    move-result-object p2

    .line 76
    .line 77
    if-ne p2, v1, :cond_4

    .line 78
    goto :goto_2

    .line 79
    .line 80
    :cond_4
    :goto_1
    instance-of p2, p1, Lcom/kubi/assets/overview/coin/AssetCoinContract$UiIntent$GetCoinList;

    .line 81
    .line 82
    if-eqz p2, :cond_7

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 86
    move-result-object p2

    .line 87
    .line 88
    check-cast p2, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;->getData()Ljava/util/ArrayList;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    if-nez p2, :cond_5

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->G()Ljava/util/ArrayList;

    .line 98
    move-result-object p2

    .line 99
    .line 100
    new-instance v2, Lcom/kubi/assets/overview/coin/l;

    .line 101
    .line 102
    .line 103
    invoke-direct {v2, p2}, Lcom/kubi/assets/overview/coin/l;-><init>(Ljava/util/ArrayList;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 107
    .line 108
    .line 109
    :cond_5
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    iput-object p1, v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    iput v3, v0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$dispatchIntentOnIO$1;->label:I

    .line 115
    .line 116
    .line 117
    invoke-direct {p0, v0}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->L(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    if-ne p1, v1, :cond_6

    .line 121
    :goto_2
    return-object v1

    .line 122
    .line 123
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 124
    return-object p1

    .line 125
    .line 126
    :cond_7
    instance-of p2, p1, Lcom/kubi/assets/overview/coin/AssetCoinContract$UiIntent$HideOrShowNumber;

    .line 127
    .line 128
    if-eqz p2, :cond_8

    .line 129
    .line 130
    new-instance p2, Lcom/kubi/assets/overview/coin/m;

    .line 131
    .line 132
    .line 133
    invoke-direct {p2, p1}, Lcom/kubi/assets/overview/coin/m;-><init>(Lcom/kubi/mvi/state/d;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 137
    .line 138
    goto/16 :goto_8

    .line 139
    .line 140
    :cond_8
    instance-of p2, p1, Lcom/kubi/assets/overview/coin/AssetCoinContract$UiIntent$ToggleSmallAssetsVisibility;

    .line 141
    .line 142
    if-eqz p2, :cond_10

    .line 143
    .line 144
    check-cast p1, Lcom/kubi/assets/overview/coin/AssetCoinContract$UiIntent$ToggleSmallAssetsVisibility;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UiIntent$ToggleSmallAssetsVisibility;->isChecked()Z

    .line 148
    move-result p2

    .line 149
    const/4 v0, 0x0

    .line 150
    .line 151
    if-eqz p2, :cond_e

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 155
    move-result-object p2

    .line 156
    .line 157
    check-cast p2, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;->getData()Ljava/util/ArrayList;

    .line 161
    move-result-object p2

    .line 162
    .line 163
    if-eqz p2, :cond_d

    .line 164
    .line 165
    .line 166
    invoke-static {p2}, Lcom/kubi/utils/extensions/b;->a(Ljava/util/List;)Ljava/util/List;

    .line 167
    move-result-object p2

    .line 168
    .line 169
    if-eqz p2, :cond_d

    .line 170
    .line 171
    new-instance v1, Ljava/util/ArrayList;

    .line 172
    .line 173
    .line 174
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    move-result-object p2

    .line 179
    .line 180
    .line 181
    :cond_9
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    move-result v2

    .line 183
    .line 184
    if-eqz v2, :cond_c

    .line 185
    .line 186
    .line 187
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    move-result-object v2

    .line 189
    move-object v3, v2

    .line 190
    .line 191
    check-cast v3, Lcom/kubi/assets/entity/AssetCoinEntity;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Lcom/kubi/assets/entity/AssetCoinEntity;->getTotalAmount()Ljava/lang/String;

    .line 195
    move-result-object v5

    .line 196
    .line 197
    .line 198
    invoke-static {v5, v0, v4, v0}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 199
    move-result-object v5

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCode()Ljava/lang/String;

    .line 203
    move-result-object v3

    .line 204
    .line 205
    sget-object v6, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6}, Lcom/kubi/assets/service/AssetsHelper;->h()Lcom/kubi/assets/entity/SmallEntity;

    .line 209
    move-result-object v7

    .line 210
    .line 211
    if-eqz v7, :cond_a

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7}, Lcom/kubi/assets/entity/SmallEntity;->getBaseCurrency()Ljava/lang/String;

    .line 215
    move-result-object v7

    .line 216
    goto :goto_5

    .line 217
    :cond_a
    move-object v7, v0

    .line 218
    .line 219
    .line 220
    :goto_5
    invoke-static {v5, v3, v7}, Lkf/a;->A(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 221
    move-result-object v3

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6}, Lcom/kubi/assets/service/AssetsHelper;->h()Lcom/kubi/assets/entity/SmallEntity;

    .line 225
    move-result-object v5

    .line 226
    .line 227
    if-eqz v5, :cond_b

    .line 228
    .line 229
    .line 230
    invoke-virtual {v5}, Lcom/kubi/assets/entity/SmallEntity;->getQuotaLimit()Ljava/math/BigDecimal;

    .line 231
    move-result-object v5

    .line 232
    goto :goto_6

    .line 233
    :cond_b
    move-object v5, v0

    .line 234
    .line 235
    .line 236
    :goto_6
    invoke-virtual {v3, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 237
    move-result v3

    .line 238
    .line 239
    if-ltz v3, :cond_9

    .line 240
    .line 241
    .line 242
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 243
    goto :goto_4

    .line 244
    .line 245
    :cond_c
    new-instance p2, Ljava/util/ArrayList;

    .line 246
    .line 247
    .line 248
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 249
    goto :goto_7

    .line 250
    :cond_d
    move-object p2, v0

    .line 251
    goto :goto_7

    .line 252
    .line 253
    .line 254
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 255
    move-result-object p2

    .line 256
    .line 257
    check-cast p2, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p2}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;->getData()Ljava/util/ArrayList;

    .line 261
    move-result-object p2

    .line 262
    .line 263
    .line 264
    :goto_7
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 265
    move-result-object v1

    .line 266
    .line 267
    check-cast v1, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;->getData()Ljava/util/ArrayList;

    .line 271
    move-result-object v1

    .line 272
    .line 273
    if-eqz v1, :cond_f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 277
    move-result v0

    .line 278
    .line 279
    .line 280
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 281
    move-result-object v0

    .line 282
    .line 283
    .line 284
    :cond_f
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 285
    move-result v0

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UiIntent$ToggleSmallAssetsVisibility;->isChecked()Z

    .line 289
    move-result p1

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0, p2, p1, v0}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->J(Ljava/util/ArrayList;ZI)Ljava/lang/String;

    .line 293
    move-result-object p1

    .line 294
    .line 295
    new-instance v1, Lcom/kubi/assets/overview/coin/n;

    .line 296
    .line 297
    .line 298
    invoke-direct {v1, p2, p0, p1, v0}, Lcom/kubi/assets/overview/coin/n;-><init>(Ljava/util/ArrayList;Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Ljava/lang/String;I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0, v1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 302
    .line 303
    :cond_10
    :goto_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 304
    return-object p1
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

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->H()Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

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

.method public onHide()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/vm/BaseVM;->onHide()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->Y:Llb/f;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Llb/f;->close()V

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
.end method
