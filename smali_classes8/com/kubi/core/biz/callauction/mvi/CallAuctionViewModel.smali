.class public final Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;
.super Lcom/kubi/mvi/state/m;
.source "CallAuctionViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/m<",
        "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0094@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u0014H\u0082@\u00a2\u0006\u0002\u0010!J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u001a\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u000202H\u0002J\u0008\u00103\u001a\u00020\u0014H\u0002J\u000e\u00104\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0002\u0010!J\u0008\u00105\u001a\u00020\u0014H\u0002J\u0008\u00106\u001a\u00020\u0014H\u0016J\u0008\u00107\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\u00080\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00068"
    }
    d2 = {
        "Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;",
        "Lcom/kubi/mvi/state/SingleSimpleStateVM;",
        "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;",
        "<init>",
        "()V",
        "repository",
        "Lcom/kubi/core/spot/business/callAuction/api/CallAuctionRepository;",
        "apiRequest",
        "Lcom/kubi/core/biz/callauction/api/ICallAuctionSocketRequest;",
        "kotlin.jvm.PlatformType",
        "getApiRequest",
        "()Lcom/kubi/core/biz/callauction/api/ICallAuctionSocketRequest;",
        "apiRequest$delegate",
        "Lkotlin/Lazy;",
        "oldTopicString",
        "",
        "initState",
        "getInitState",
        "()Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;",
        "dispatchIntent",
        "",
        "intent",
        "Lcom/kubi/mvi/state/IIntent;",
        "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getTradeItemBean",
        "Lcom/kubi/core/spot/entity/TradeItemBeanEquals;",
        "symbol",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "requestGetConfig",
        "useCountDown",
        "",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getCallAuctionStatus",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "oldRequest",
        "Lokhttp3/Request;",
        "getOldRequest",
        "()Lokhttp3/Request;",
        "setOldRequest",
        "(Lokhttp3/Request;)V",
        "socketObserver",
        "getTopic",
        "updateCallAuctionInfo",
        "Lcom/kubi/core/spot/business/callAuction/bean/CallAuctionInfo;",
        "wsEntity",
        "Lcom/kubi/core/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;",
        "countDownJob",
        "Lkotlinx/coroutines/Job;",
        "countDown",
        "remainSec",
        "",
        "cancelCountDown",
        "gotoSecondStage",
        "updateSocketSymbol",
        "onHide",
        "onShow",
        "TradeCoreBizLib_googleRelease"
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
        "SMAP\nCallAuctionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/core/biz/callauction/mvi/CallAuctionViewModel\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,332:1\n35#2,3:333\n196#3,3:336\n136#4,4:339\n140#4:344\n182#4:345\n220#4,2:346\n1#5:343\n*S KotlinDebug\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/core/biz/callauction/mvi/CallAuctionViewModel\n*L\n91#1:333,3\n90#1:336,3\n169#1:339,4\n169#1:344\n169#1:345\n316#1:346,2\n169#1:343\n*E\n"
    }
.end annotation


# instance fields
.field public final X:Lje/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Z:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public a0:Lokhttp3/Request;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b0:Lkotlinx/coroutines/x1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/m;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lje/b;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lje/b;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->X:Lje/b;

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/core/biz/callauction/mvi/a;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/kubi/core/biz/callauction/mvi/a;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    iput-object v0, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->Y:Lkotlin/Lazy;

    .line 22
    .line 23
    const-string v0, ""

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->Z:Ljava/lang/String;

    .line 26
    return-void
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
.end method

.method public static final A(Lcom/kubi/mvi/state/d;Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;)Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;
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
    check-cast p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$MockChangePhase;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$MockChangePhase;->getPhase()Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$Phase;

    .line 11
    move-result-object v3

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
    invoke-static/range {v0 .. v8}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;->copy$default(Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;Lke/a;Lcom/kubi/core/biz/callauction/bean/CallAuctionConfigBean;Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$Phase;Ljava/lang/String;Lcom/kubi/core/spot/entity/TradeItemBeanEquals;Lcom/kubi/core/spot/entity/TradeItemBeanEquals;ILjava/lang/Object;)Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

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
.end method

.method private final B()Lld/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->Y:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lld/a;

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
.end method

.method private final E(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x2

    .line 7
    .line 8
    const-string v2, "/spotCallAuction/estimateOpeningPrice:%s"

    .line 9
    .line 10
    .line 11
    invoke-static {v2, p1, v0, v1, v0}, Lcom/kubi/utils/extensions/DowngradeExKt;->u(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public static synthetic I(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p4, 0x1

    .line 2
    and-int/2addr p3, p4

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    move p1, p4

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->H(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.end method

.method public static final K(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lcom/kubi/network/websocket/model/Message;)Z
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "heartbeat"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getTopic()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iget-object p0, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->Z:Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result p0

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 34
    return p0
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
.end method

.method public static synthetic b(Lcom/kubi/mvi/state/d;Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;)Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->A(Lcom/kubi/mvi/state/d;Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;)Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

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
.end method

.method public static synthetic d(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lcom/kubi/network/websocket/model/Message;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->K(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lcom/kubi/network/websocket/model/Message;)Z

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
.end method

.method public static synthetic e(Lcom/kubi/core/spot/entity/TradeItemBeanEquals;Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;)Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->z(Lcom/kubi/core/spot/entity/TradeItemBeanEquals;Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;)Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

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
.end method

.method public static synthetic n()Lld/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->w()Lld/a;

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
.end method

.method public static final synthetic o(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->y(J)V

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
.end method

.method public static final synthetic p(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->C(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic q(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->F(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic r(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->G(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic s(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->launchOnIO(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

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
.end method

.method public static final synthetic t(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->H(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic u(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lcom/kubi/core/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;Ljava/lang/String;)Lke/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->L(Lcom/kubi/core/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;Ljava/lang/String;)Lke/a;

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
.end method

.method public static final synthetic v(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lkotlin/jvm/functions/Function1;)Z
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
.end method

.method public static final w()Lld/a;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->f()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lld/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lld/a;

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
.end method

.method public static final z(Lcom/kubi/core/spot/entity/TradeItemBeanEquals;Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;)Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;
    .locals 10

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v8, 0x2f

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
    const/4 v7, 0x0

    .line 14
    move-object v6, p0

    .line 15
    move-object v1, p1

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v9}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;->copy$default(Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;Lke/a;Lcom/kubi/core/biz/callauction/bean/CallAuctionConfigBean;Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$Phase;Ljava/lang/String;Lcom/kubi/core/spot/entity/TradeItemBeanEquals;Lcom/kubi/core/spot/entity/TradeItemBeanEquals;ILjava/lang/Object;)Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

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
.end method


# virtual methods
.method public final C(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
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
    instance-of v0, p1, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->label:I

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
    iput v1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;-><init>(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->label:I

    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    iget-object v0, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    throw p1

    .line 60
    .line 61
    :cond_2
    iget v1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->I$0:I

    .line 62
    .line 63
    iget-object v3, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    goto :goto_2

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    check-cast p1, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;->getBean()Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    if-eqz p1, :cond_7

    .line 85
    .line 86
    iput-object p1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->L$0:Ljava/lang/Object;

    .line 87
    const/4 v1, 0x0

    .line 88
    .line 89
    iput v1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->I$0:I

    .line 90
    .line 91
    iput v3, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->label:I

    .line 92
    .line 93
    const-wide/16 v5, 0x7d0

    .line 94
    .line 95
    .line 96
    invoke-static {v5, v6, v4}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 97
    move-result-object v3

    .line 98
    .line 99
    if-ne v3, v0, :cond_4

    .line 100
    goto :goto_4

    .line 101
    :cond_4
    move-object v3, p1

    .line 102
    .line 103
    :goto_2
    const-string p1, "repository.getPreviewInfo"

    .line 104
    .line 105
    const-string v5, "CallAuctionViewModel"

    .line 106
    .line 107
    .line 108
    invoke-static {p1, v5}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    iget-object p1, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->X:Lje/b;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 114
    move-result-object v5

    .line 115
    .line 116
    const-string v6, "getSymbol(...)"

    .line 117
    .line 118
    .line 119
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 123
    move-result-object v6

    .line 124
    const/4 v7, 0x0

    .line 125
    .line 126
    if-eqz v6, :cond_5

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 130
    move-result-object v6

    .line 131
    goto :goto_3

    .line 132
    :cond_5
    move-object v6, v7

    .line 133
    .line 134
    .line 135
    :goto_3
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    move-result-object v6

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v5, v6}, Lje/b;->d(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 140
    move-result-object p1

    .line 141
    move-object v5, v3

    .line 142
    .line 143
    new-instance v3, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$2$1;

    .line 144
    .line 145
    .line 146
    invoke-direct {v3, v5, p0, v7}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$2$1;-><init>(Lcom/kubi/core/spot/entity/TradeItemBeanEquals;Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lkotlin/coroutines/Continuation;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    move-result-object v5

    .line 151
    .line 152
    iput-object v5, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->L$0:Ljava/lang/Object;

    .line 153
    .line 154
    iput v1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->I$0:I

    .line 155
    .line 156
    iput v2, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getCallAuctionStatus$1;->label:I

    .line 157
    const/4 v2, 0x0

    .line 158
    const/4 v5, 0x1

    .line 159
    const/4 v6, 0x0

    .line 160
    move-object v1, p1

    .line 161
    .line 162
    .line 163
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    if-ne p1, v0, :cond_6

    .line 167
    :goto_4
    return-object v0

    .line 168
    .line 169
    :cond_6
    :goto_5
    check-cast p1, Lcom/kubi/network/retrofit/utils/f;

    .line 170
    .line 171
    :cond_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 172
    return-object p1
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
.end method

.method public D()Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

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
    invoke-direct/range {v0 .. v8}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;-><init>(Lke/a;Lcom/kubi/core/biz/callauction/bean/CallAuctionConfigBean;Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$Phase;Ljava/lang/String;Lcom/kubi/core/spot/entity/TradeItemBeanEquals;Lcom/kubi/core/spot/entity/TradeItemBeanEquals;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
.end method

.method public final F(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/core/spot/entity/TradeItemBeanEquals;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->label:I

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
    iput v1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;-><init>(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/kubi/utils/x;

    .line 46
    .line 47
    iget-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    sget-object p2, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 67
    .line 68
    sget-object v2, Lgf/n;->a:Lgf/n;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p1}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    if-nez v2, :cond_3

    .line 75
    .line 76
    new-instance v2, Lcom/kubi/data/entity/TradeItemBean;

    .line 77
    .line 78
    .line 79
    invoke-direct {v2, p1}, Lcom/kubi/data/entity/TradeItemBean;-><init>(Ljava/lang/String;)V

    .line 80
    :cond_3
    const/4 v4, 0x2

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x0

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v5, v4, v6}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    if-nez v2, :cond_4

    .line 89
    .line 90
    const-string v2, ""

    .line 91
    .line 92
    :cond_4
    new-instance v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$$inlined$fromJsonOrNull$1;

    .line 93
    .line 94
    .line 95
    invoke-direct {v4, v2, v6}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 99
    move-result-object v4

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 103
    move-result-object v6

    .line 104
    .line 105
    .line 106
    invoke-static {v4, v6}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 107
    move-result-object v4

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    iput-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    iput-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->L$1:Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    iput-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->L$2:Ljava/lang/Object;

    .line 126
    .line 127
    iput v5, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->I$0:I

    .line 128
    .line 129
    iput v3, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$getTradeItemBean$1;->label:I

    .line 130
    .line 131
    .line 132
    invoke-static {v4, v0}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 133
    move-result-object p2

    .line 134
    .line 135
    if-ne p2, v1, :cond_5

    .line 136
    return-object v1

    .line 137
    .line 138
    :cond_5
    :goto_1
    check-cast p2, Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 139
    .line 140
    if-nez p2, :cond_6

    .line 141
    .line 142
    new-instance p1, Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 143
    .line 144
    .line 145
    invoke-direct {p1}, Lcom/kubi/core/spot/entity/TradeItemBeanEquals;-><init>()V

    .line 146
    return-object p1

    .line 147
    :cond_6
    return-object p2
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
.end method

.method public final G(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
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
    .line 3
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;->getBean()Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    const/4 v0, 0x1

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v2, p1, v0, v1}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->I(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-ne p1, v0, :cond_0

    .line 32
    return-object p1

    .line 33
    .line 34
    :cond_0
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
.end method

.method public final H(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->label:I

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
    iput v1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;-><init>(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->label:I

    .line 35
    const/4 v7, 0x0

    .line 36
    .line 37
    const-string v8, "getSymbol(...)"

    .line 38
    const/4 v9, 0x2

    .line 39
    const/4 v2, 0x1

    .line 40
    .line 41
    const-string v10, "CallAuctionViewModel"

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    if-eq v1, v2, :cond_2

    .line 46
    .line 47
    if-ne v1, v9, :cond_1

    .line 48
    .line 49
    iget-object p1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 52
    .line 53
    .line 54
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    throw p1

    .line 65
    .line 66
    :cond_2
    iget p1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->I$0:I

    .line 67
    .line 68
    iget-boolean v1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->Z$0:Z

    .line 69
    .line 70
    iget-object v2, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 73
    .line 74
    .line 75
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    move v11, p1

    .line 77
    move p1, v1

    .line 78
    goto :goto_2

    .line 79
    .line 80
    .line 81
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    .line 83
    const-string p2, "requestGetConfig"

    .line 84
    .line 85
    .line 86
    invoke-static {p2, v10}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 90
    move-result-object p2

    .line 91
    .line 92
    check-cast p2, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;->getBean()Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 96
    move-result-object p2

    .line 97
    .line 98
    if-eqz p2, :cond_6

    .line 99
    .line 100
    const-string v1, "repository.requestGetConfig"

    .line 101
    .line 102
    .line 103
    invoke-static {v1, v10}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    iget-object v1, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->X:Lje/b;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 109
    move-result-object v3

    .line 110
    .line 111
    .line 112
    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v3}, Lje/b;->f(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 116
    move-result-object v1

    .line 117
    .line 118
    new-instance v3, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$2$1;

    .line 119
    .line 120
    .line 121
    invoke-direct {v3, p0, p1, v7}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$2$1;-><init>(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;ZLkotlin/coroutines/Continuation;)V

    .line 122
    .line 123
    iput-object p2, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->L$0:Ljava/lang/Object;

    .line 124
    .line 125
    iput-boolean p1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->Z$0:Z

    .line 126
    const/4 v11, 0x0

    .line 127
    .line 128
    iput v11, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->I$0:I

    .line 129
    .line 130
    iput v2, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->label:I

    .line 131
    const/4 v2, 0x0

    .line 132
    const/4 v5, 0x1

    .line 133
    const/4 v6, 0x0

    .line 134
    .line 135
    .line 136
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    if-ne v1, v0, :cond_4

    .line 140
    goto :goto_3

    .line 141
    :cond_4
    move-object v2, p2

    .line 142
    .line 143
    :goto_2
    const-string p2, "repository.requestCallAuctionInfo"

    .line 144
    .line 145
    .line 146
    invoke-static {p2, v10}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    iget-object p2, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->X:Lje/b;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    .line 155
    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2, v1}, Lje/b;->e(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 159
    move-result-object v1

    .line 160
    .line 161
    new-instance v3, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$2$2;

    .line 162
    .line 163
    .line 164
    invoke-direct {v3, p0, v7}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$2$2;-><init>(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lkotlin/coroutines/Continuation;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    move-result-object p2

    .line 169
    .line 170
    iput-object p2, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->L$0:Ljava/lang/Object;

    .line 171
    .line 172
    iput-boolean p1, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->Z$0:Z

    .line 173
    .line 174
    iput v11, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->I$0:I

    .line 175
    .line 176
    iput v9, v4, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$requestGetConfig$1;->label:I

    .line 177
    const/4 v2, 0x0

    .line 178
    const/4 v5, 0x1

    .line 179
    const/4 v6, 0x0

    .line 180
    .line 181
    .line 182
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 183
    move-result-object p2

    .line 184
    .line 185
    if-ne p2, v0, :cond_5

    .line 186
    :goto_3
    return-object v0

    .line 187
    .line 188
    :cond_5
    :goto_4
    check-cast p2, Lcom/kubi/network/retrofit/utils/f;

    .line 189
    .line 190
    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 191
    return-object p1
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
.end method

.method public final J(Ljava/lang/String;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->B()Lld/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lld/a;->c(Ljava/lang/String;)Lokhttp3/Request;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->a0:Lokhttp3/Request;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->Z:Ljava/lang/String;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    const-string v1, "socketObserver:oldTopicString:"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->Z:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    const-string v1, "CallAuctionViewModel"

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    iget-object v4, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->Z:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->a0:Lokhttp3/Request;

    .line 45
    .line 46
    new-instance v3, Lcom/kubi/core/biz/callauction/mvi/d;

    .line 47
    .line 48
    .line 49
    invoke-direct {v3, p0}, Lcom/kubi/core/biz/callauction/mvi/d;-><init>(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;)V

    .line 50
    .line 51
    sget-object v1, Lcom/kubi/sdk/websocket/SocketTask;->i:Lcom/kubi/sdk/websocket/SocketTask$Companion;

    .line 52
    .line 53
    new-instance v2, Lg10/j;

    .line 54
    .line 55
    .line 56
    invoke-direct {v2}, Lg10/j;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v0}, Lg10/j;->e(Lokhttp3/Request;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v4, p0, v2}, Lcom/kubi/sdk/websocket/SocketTask$Companion;->obtain(Ljava/lang/String;Lcom/kubi/mvi/vm/c;Lg10/j;)Lcom/kubi/sdk/websocket/SocketTask;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    new-instance v2, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$a;

    .line 66
    move-object v7, p0

    .line 67
    move-object v8, p1

    .line 68
    move-object v6, p0

    .line 69
    move-object v5, p1

    .line 70
    .line 71
    .line 72
    invoke-direct/range {v2 .. v8}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2}, Lcom/kubi/sdk/websocket/SocketTask;->l(Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/websocket/SocketTask;

    .line 76
    return-void
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
.end method

.method public final L(Lcom/kubi/core/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;Ljava/lang/String;)Lke/a;
    .locals 28

    .line 1
    .line 2
    move-object/from16 v0, p2

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    check-cast v1, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;->getCallAuctionInfo()Lke/a;

    .line 12
    move-result-object v2

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-eqz v2, :cond_c

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;->getEstimatedDealPrice()Ljava/math/BigDecimal;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    const/16 v15, 0x8

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    sget-object v4, Lgf/n;->a:Lgf/n;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v0}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 41
    move-result v4

    .line 42
    .line 43
    .line 44
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    move-result-object v4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v4, v1

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-static {v4, v15}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 51
    move-result v5

    .line 52
    .line 53
    const/16 v13, 0x1fd

    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v10, 0x0

    .line 61
    const/4 v11, 0x0

    .line 62
    const/4 v12, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static/range {v3 .. v14}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 66
    move-result-object v3

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move-object v3, v1

    .line 69
    .line 70
    .line 71
    :goto_1
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    .line 75
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;->getEstimatedDealSize()Ljava/math/BigDecimal;

    .line 76
    move-result-object v16

    .line 77
    .line 78
    if-eqz v16, :cond_3

    .line 79
    .line 80
    sget-object v4, Lgf/n;->a:Lgf/n;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v0}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    .line 96
    move-result v4

    .line 97
    .line 98
    .line 99
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    move-result-object v4

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    move-object v4, v1

    .line 103
    .line 104
    .line 105
    :goto_2
    invoke-static {v4, v15}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 106
    move-result v18

    .line 107
    .line 108
    const/16 v26, 0x1fd

    .line 109
    .line 110
    const/16 v27, 0x0

    .line 111
    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    const/16 v19, 0x0

    .line 115
    .line 116
    const/16 v20, 0x0

    .line 117
    .line 118
    const/16 v21, 0x0

    .line 119
    .line 120
    const/16 v22, 0x0

    .line 121
    .line 122
    const/16 v23, 0x0

    .line 123
    .line 124
    const/16 v24, 0x0

    .line 125
    .line 126
    const/16 v25, 0x0

    .line 127
    .line 128
    .line 129
    invoke-static/range {v16 .. v27}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 130
    move-result-object v4

    .line 131
    goto :goto_3

    .line 132
    :cond_3
    move-object v4, v1

    .line 133
    .line 134
    .line 135
    :goto_3
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    move-result-object v4

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;->getLowestBuyDeclaredPrice()Ljava/math/BigDecimal;

    .line 140
    move-result-object v16

    .line 141
    .line 142
    if-eqz v16, :cond_5

    .line 143
    .line 144
    sget-object v5, Lgf/n;->a:Lgf/n;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v0}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 148
    move-result-object v5

    .line 149
    .line 150
    if-eqz v5, :cond_4

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 154
    move-result-object v5

    .line 155
    .line 156
    if-eqz v5, :cond_4

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 160
    move-result v5

    .line 161
    .line 162
    .line 163
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    move-result-object v5

    .line 165
    goto :goto_4

    .line 166
    :cond_4
    move-object v5, v1

    .line 167
    .line 168
    .line 169
    :goto_4
    invoke-static {v5, v15}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 170
    move-result v18

    .line 171
    .line 172
    const/16 v26, 0x1fd

    .line 173
    .line 174
    const/16 v27, 0x0

    .line 175
    .line 176
    const/16 v17, 0x0

    .line 177
    .line 178
    const/16 v19, 0x0

    .line 179
    .line 180
    const/16 v20, 0x0

    .line 181
    .line 182
    const/16 v21, 0x0

    .line 183
    .line 184
    const/16 v22, 0x0

    .line 185
    .line 186
    const/16 v23, 0x0

    .line 187
    .line 188
    const/16 v24, 0x0

    .line 189
    .line 190
    const/16 v25, 0x0

    .line 191
    .line 192
    .line 193
    invoke-static/range {v16 .. v27}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 194
    move-result-object v5

    .line 195
    goto :goto_5

    .line 196
    :cond_5
    move-object v5, v1

    .line 197
    .line 198
    .line 199
    :goto_5
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    move-result-object v5

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;->getHighestBuyDeclaredPrice()Ljava/math/BigDecimal;

    .line 204
    move-result-object v16

    .line 205
    .line 206
    if-eqz v16, :cond_7

    .line 207
    .line 208
    sget-object v6, Lgf/n;->a:Lgf/n;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6, v0}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 212
    move-result-object v6

    .line 213
    .line 214
    if-eqz v6, :cond_6

    .line 215
    .line 216
    .line 217
    invoke-virtual {v6}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 218
    move-result-object v6

    .line 219
    .line 220
    if-eqz v6, :cond_6

    .line 221
    .line 222
    .line 223
    invoke-virtual {v6}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 224
    move-result v6

    .line 225
    .line 226
    .line 227
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    move-result-object v6

    .line 229
    goto :goto_6

    .line 230
    :cond_6
    move-object v6, v1

    .line 231
    .line 232
    .line 233
    :goto_6
    invoke-static {v6, v15}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 234
    move-result v18

    .line 235
    .line 236
    const/16 v26, 0x1fd

    .line 237
    .line 238
    const/16 v27, 0x0

    .line 239
    .line 240
    const/16 v17, 0x0

    .line 241
    .line 242
    const/16 v19, 0x0

    .line 243
    .line 244
    const/16 v20, 0x0

    .line 245
    .line 246
    const/16 v21, 0x0

    .line 247
    .line 248
    const/16 v22, 0x0

    .line 249
    .line 250
    const/16 v23, 0x0

    .line 251
    .line 252
    const/16 v24, 0x0

    .line 253
    .line 254
    const/16 v25, 0x0

    .line 255
    .line 256
    .line 257
    invoke-static/range {v16 .. v27}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 258
    move-result-object v6

    .line 259
    goto :goto_7

    .line 260
    :cond_7
    move-object v6, v1

    .line 261
    .line 262
    .line 263
    :goto_7
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    move-result-object v6

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;->getLowestSellDeclaredPrice()Ljava/math/BigDecimal;

    .line 268
    move-result-object v16

    .line 269
    .line 270
    if-eqz v16, :cond_9

    .line 271
    .line 272
    sget-object v7, Lgf/n;->a:Lgf/n;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v7, v0}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 276
    move-result-object v7

    .line 277
    .line 278
    if-eqz v7, :cond_8

    .line 279
    .line 280
    .line 281
    invoke-virtual {v7}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 282
    move-result-object v7

    .line 283
    .line 284
    if-eqz v7, :cond_8

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 288
    move-result v7

    .line 289
    .line 290
    .line 291
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    move-result-object v7

    .line 293
    goto :goto_8

    .line 294
    :cond_8
    move-object v7, v1

    .line 295
    .line 296
    .line 297
    :goto_8
    invoke-static {v7, v15}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 298
    move-result v18

    .line 299
    .line 300
    const/16 v26, 0x1fd

    .line 301
    .line 302
    const/16 v27, 0x0

    .line 303
    .line 304
    const/16 v17, 0x0

    .line 305
    .line 306
    const/16 v19, 0x0

    .line 307
    .line 308
    const/16 v20, 0x0

    .line 309
    .line 310
    const/16 v21, 0x0

    .line 311
    .line 312
    const/16 v22, 0x0

    .line 313
    .line 314
    const/16 v23, 0x0

    .line 315
    .line 316
    const/16 v24, 0x0

    .line 317
    .line 318
    const/16 v25, 0x0

    .line 319
    .line 320
    .line 321
    invoke-static/range {v16 .. v27}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 322
    move-result-object v7

    .line 323
    goto :goto_9

    .line 324
    :cond_9
    move-object v7, v1

    .line 325
    .line 326
    .line 327
    :goto_9
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 328
    move-result-object v7

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/core/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;->getHighestSellDeclaredPrice()Ljava/math/BigDecimal;

    .line 332
    move-result-object v16

    .line 333
    .line 334
    if-eqz v16, :cond_b

    .line 335
    .line 336
    sget-object v8, Lgf/n;->a:Lgf/n;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v8, v0}, Lgf/n;->D(Ljava/lang/String;)Lcom/kubi/data/entity/TradeItemBean;

    .line 340
    move-result-object v0

    .line 341
    .line 342
    if-eqz v0, :cond_a

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 346
    move-result-object v0

    .line 347
    .line 348
    if-eqz v0, :cond_a

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 352
    move-result v0

    .line 353
    .line 354
    .line 355
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    move-result-object v1

    .line 357
    .line 358
    .line 359
    :cond_a
    invoke-static {v1, v15}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 360
    move-result v18

    .line 361
    .line 362
    const/16 v26, 0x1fd

    .line 363
    .line 364
    const/16 v27, 0x0

    .line 365
    .line 366
    const/16 v17, 0x0

    .line 367
    .line 368
    const/16 v19, 0x0

    .line 369
    .line 370
    const/16 v20, 0x0

    .line 371
    .line 372
    const/16 v21, 0x0

    .line 373
    .line 374
    const/16 v22, 0x0

    .line 375
    .line 376
    const/16 v23, 0x0

    .line 377
    .line 378
    const/16 v24, 0x0

    .line 379
    .line 380
    const/16 v25, 0x0

    .line 381
    .line 382
    .line 383
    invoke-static/range {v16 .. v27}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 384
    move-result-object v1

    .line 385
    .line 386
    .line 387
    :cond_b
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 388
    move-result-object v8

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v2 .. v8}, Lke/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lke/a;

    .line 392
    move-result-object v0

    .line 393
    return-object v0

    .line 394
    :cond_c
    return-object v1
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
.end method

.method public final M()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;->getBean()Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->Z:Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->Z:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 36
    move-result v1

    .line 37
    .line 38
    if-lez v1, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->Z:Ljava/lang/String;

    .line 41
    .line 42
    sget-object v2, Lg10/l;->a:Lg10/l;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v1, p0}, Lg10/l;->c(Ljava/lang/String;Lcom/kubi/mvi/vm/c;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p0, v0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->J(Ljava/lang/String;)V

    .line 49
    :cond_1
    return-void
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
.end method

.method public dispatchIntent(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
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
    instance-of v0, p2, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->label:I

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
    iput v1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;-><init>(Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->label:I

    .line 33
    const/4 v3, 0x4

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    .line 38
    if-eqz v2, :cond_5

    .line 39
    .line 40
    if-eq v2, v6, :cond_4

    .line 41
    .line 42
    if-eq v2, v5, :cond_3

    .line 43
    .line 44
    if-eq v2, v4, :cond_2

    .line 45
    .line 46
    if-ne v2, v3, :cond_1

    .line 47
    .line 48
    iget-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 51
    .line 52
    .line 53
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    throw p1

    .line 64
    .line 65
    :cond_2
    iget-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 68
    .line 69
    iget-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 72
    .line 73
    .line 74
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 75
    goto :goto_3

    .line 76
    .line 77
    :cond_3
    iget-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 80
    .line 81
    .line 82
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 83
    goto :goto_2

    .line 84
    .line 85
    :cond_4
    iget-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 88
    .line 89
    .line 90
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 91
    goto :goto_1

    .line 92
    .line 93
    .line 94
    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 95
    .line 96
    iput-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    iput v6, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->label:I

    .line 99
    .line 100
    .line 101
    invoke-super {p0, p1, v0}, Lcom/kubi/mvi/state/BaseStateVM;->dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 102
    move-result-object p2

    .line 103
    .line 104
    if-ne p2, v1, :cond_6

    .line 105
    goto :goto_4

    .line 106
    .line 107
    :cond_6
    :goto_1
    instance-of p2, p1, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$RequestCurrentStage;

    .line 108
    .line 109
    const-string v2, "CallAuctionViewModel"

    .line 110
    .line 111
    if-eqz p2, :cond_9

    .line 112
    .line 113
    const-string p2, "UiIntent.RequestCurrentStage"

    .line 114
    .line 115
    .line 116
    invoke-static {p2, v2}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    move-object p2, p1

    .line 118
    .line 119
    check-cast p2, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$RequestCurrentStage;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$RequestCurrentStage;->getSymbol()Ljava/lang/String;

    .line 123
    move-result-object p2

    .line 124
    .line 125
    iput-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 126
    .line 127
    iput v5, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->label:I

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, p2, v0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->F(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 131
    move-result-object p2

    .line 132
    .line 133
    if-ne p2, v1, :cond_7

    .line 134
    goto :goto_4

    .line 135
    .line 136
    :cond_7
    :goto_2
    check-cast p2, Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 137
    .line 138
    new-instance v2, Lcom/kubi/core/biz/callauction/mvi/b;

    .line 139
    .line 140
    .line 141
    invoke-direct {v2, p2}, Lcom/kubi/core/biz/callauction/mvi/b;-><init>(Lcom/kubi/core/spot/entity/TradeItemBeanEquals;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 145
    move-object v2, p1

    .line 146
    .line 147
    check-cast v2, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$RequestCurrentStage;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$RequestCurrentStage;->getUseCountDown()Z

    .line 151
    move-result v2

    .line 152
    .line 153
    .line 154
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    iput-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    move-result-object p1

    .line 162
    .line 163
    iput-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 164
    .line 165
    iput v4, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->label:I

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v2, v0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->H(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 169
    move-result-object p1

    .line 170
    .line 171
    if-ne p1, v1, :cond_8

    .line 172
    goto :goto_4

    .line 173
    .line 174
    .line 175
    :cond_8
    :goto_3
    invoke-virtual {p0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->M()V

    .line 176
    goto :goto_6

    .line 177
    .line 178
    :cond_9
    instance-of p2, p1, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$OnFragmentHide;

    .line 179
    .line 180
    if-eqz p2, :cond_a

    .line 181
    .line 182
    const-string p1, "UiIntent.OnFragmentHide"

    .line 183
    .line 184
    .line 185
    invoke-static {p1, v2}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->x()V

    .line 189
    goto :goto_6

    .line 190
    .line 191
    :cond_a
    instance-of p2, p1, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$GetCallAuction;

    .line 192
    .line 193
    if-eqz p2, :cond_c

    .line 194
    .line 195
    const-string p2, "UiIntent.GetCallAuction"

    .line 196
    .line 197
    .line 198
    invoke-static {p2, v2}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    move-result-object p1

    .line 203
    .line 204
    iput-object p1, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 205
    .line 206
    iput v3, v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$dispatchIntent$1;->label:I

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, v0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->C(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 210
    move-result-object p1

    .line 211
    .line 212
    if-ne p1, v1, :cond_b

    .line 213
    :goto_4
    return-object v1

    .line 214
    .line 215
    :cond_b
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 216
    return-object p1

    .line 217
    .line 218
    :cond_c
    instance-of p2, p1, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$MockChangePhase;

    .line 219
    .line 220
    if-eqz p2, :cond_e

    .line 221
    .line 222
    const-string p2, "UiIntent.MockChangePhase"

    .line 223
    .line 224
    .line 225
    invoke-static {p2, v2}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    move-object p2, p1

    .line 227
    .line 228
    check-cast p2, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$MockChangePhase;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$MockChangePhase;->getPhase()Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$Phase;

    .line 232
    move-result-object p2

    .line 233
    .line 234
    sget-object v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$Phase;->OPENING:Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$Phase;

    .line 235
    .line 236
    if-ne p2, v0, :cond_d

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 240
    move-result-object p2

    .line 241
    .line 242
    check-cast p2, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p2}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;->getBean()Lcom/kubi/core/spot/entity/TradeItemBeanEquals;

    .line 246
    move-result-object p2

    .line 247
    .line 248
    if-eqz p2, :cond_d

    .line 249
    .line 250
    sget-object v0, Lcom/kubi/core/biz/callauction/j;->a:Lcom/kubi/core/biz/callauction/j;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 254
    move-result-object p2

    .line 255
    .line 256
    const-string v1, "getSymbol(...)"

    .line 257
    .line 258
    .line 259
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, p2}, Lcom/kubi/core/biz/callauction/j;->d(Ljava/lang/String;)V

    .line 263
    .line 264
    :cond_d
    const-string p2, "updateState:phase"

    .line 265
    .line 266
    .line 267
    invoke-static {p2, v2}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    .line 269
    new-instance p2, Lcom/kubi/core/biz/callauction/mvi/c;

    .line 270
    .line 271
    .line 272
    invoke-direct {p2, p1}, Lcom/kubi/core/biz/callauction/mvi/c;-><init>(Lcom/kubi/mvi/state/d;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 276
    .line 277
    :cond_e
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 278
    return-object p1
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
.end method

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->D()Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;

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
.end method

.method public onHide()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/vm/BaseVM;->onHide()V

    .line 4
    .line 5
    const-string v0, "---->>>> onHide"

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lro/b;->b(Ljava/lang/String;)V

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
.end method

.method public onShow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/vm/BaseVM;->onShow()V

    .line 4
    .line 5
    const-string v0, "---->>>> onShow"

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lro/b;->b(Ljava/lang/String;)V

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
.end method

.method public final x()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->b0:Lkotlinx/coroutines/x1;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 12
    .line 13
    :cond_0
    iput-object v1, p0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->b0:Lkotlinx/coroutines/x1;

    .line 14
    :cond_1
    return-void
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
.end method

.method public final y(J)V
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->x()V

    .line 4
    .line 5
    new-instance v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 6
    .line 7
    .line 8
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 9
    .line 10
    new-instance v4, Lkotlin/jvm/internal/Ref$LongRef;

    .line 11
    .line 12
    .line 13
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 14
    .line 15
    new-instance v3, Lkotlin/jvm/internal/Ref$LongRef;

    .line 16
    .line 17
    .line 18
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 22
    move-result-object v10

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 26
    move-result-object v11

    .line 27
    .line 28
    new-instance v0, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$countDown$1;

    .line 29
    const/4 v9, 0x0

    .line 30
    .line 31
    const-wide/16 v6, 0x3e8

    .line 32
    move-object v8, p0

    .line 33
    move-wide v1, p1

    .line 34
    .line 35
    .line 36
    invoke-direct/range {v0 .. v9}, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$countDown$1;-><init>(JLkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$LongRef;JLcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;Lkotlin/coroutines/Continuation;)V

    .line 37
    move-object p1, v8

    .line 38
    move-object v6, v10

    .line 39
    const/4 v10, 0x2

    .line 40
    move-object v7, v11

    .line 41
    const/4 v11, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    move-object v9, v0

    .line 44
    .line 45
    .line 46
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    iput-object p2, p1, Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;->b0:Lkotlinx/coroutines/x1;

    .line 50
    return-void
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
.end method
