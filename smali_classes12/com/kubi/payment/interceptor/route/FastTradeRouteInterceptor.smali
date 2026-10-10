.class public final Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;
.super Lil/c;
.source "FastTradeRouteInterceptor.kt"

# interfaces
.implements Lcu/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$Companion;,
        Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0002\u001e\u001fB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00112\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u00072\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0002R\'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\'\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000b\u001a\u0004\u0008\r\u0010\tR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;",
        "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;",
        "Lcom/kubi/payment/interceptor/route/IFastTradeRNRouter;",
        "<init>",
        "()V",
        "go2RNToggleKeys",
        "",
        "",
        "getGo2RNToggleKeys",
        "()Ljava/util/Map;",
        "go2RNToggleKeys$delegate",
        "Lkotlin/Lazy;",
        "notify2RNToggleKeys",
        "getNotify2RNToggleKeys",
        "notify2RNToggleKeys$delegate",
        "togglesCache",
        "",
        "",
        "isRNSwitchOpen",
        "Lkotlin/Pair;",
        "Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;",
        "path",
        "intercept",
        "chain",
        "Lcom/kubi/router/interceptor/IChain;",
        "notify2RNPage",
        "oriPath",
        "bundle",
        "Landroid/os/Bundle;",
        "routeName",
        "Companion",
        "InterceptType",
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
        "SMAP\nFastTradeRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeRouteInterceptor.kt\ncom/kubi/payment/interceptor/route/FastTradeRouteInterceptor\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,221:1\n382#2,3:222\n385#2,4:232\n35#3,4:225\n39#3:231\n44#4,2:229\n29#5:236\n*S KotlinDebug\n*F\n+ 1 FastTradeRouteInterceptor.kt\ncom/kubi/payment/interceptor/route/FastTradeRouteInterceptor\n*L\n122#1:222,3\n122#1:232,4\n123#1:225,4\n123#1:231\n123#1:229,2\n155#1:236\n*E\n"
    }
.end annotation


# static fields
.field public static final d:Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->d:Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$Companion;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lil/c;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcu/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcu/a;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->a:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcu/b;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcu/b;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->b:Lkotlin/Lazy;

    .line 26
    .line 27
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    iput-object v0, p0, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->c:Ljava/util/Map;

    .line 33
    return-void
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
.end method

.method public static synthetic c()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->g()Ljava/util/Map;

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
.end method

.method public static synthetic d()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->j()Ljava/util/Map;

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
.end method

.method public static final g()Ljava/util/Map;
    .locals 9

    .line 1
    .line 2
    const-string v0, "payment/fastTrade"

    .line 3
    .line 4
    const-string v1, "payment_android_fast_rn_new"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    const-string v0, "otc/fiat/recharge"

    .line 11
    .line 12
    const-string v3, "payment_android_fiatRecharge_rn_new"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    const-string v4, "otc/fiat/withdraw"

    .line 19
    .line 20
    const-string v5, "payment_android_fiatWithdraw_rn_new"

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    const-string v6, "otc/orderList"

    .line 27
    .line 28
    .line 29
    invoke-static {v6, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    const-string v6, "otc/fiat/orderList"

    .line 33
    .line 34
    .line 35
    invoke-static {v6, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 36
    move-result-object v6

    .line 37
    .line 38
    const-string v7, "otc/fiat/recharge/orderDetail"

    .line 39
    .line 40
    .line 41
    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 42
    move-result-object v7

    .line 43
    .line 44
    const-string v3, "otc/fiat/withdraw/orderDetail"

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 48
    move-result-object v8

    .line 49
    move-object v3, v0

    .line 50
    move-object v5, v1

    .line 51
    .line 52
    .line 53
    filled-new-array/range {v2 .. v8}, [Lkotlin/Pair;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 58
    move-result-object v0

    .line 59
    return-object v0
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
.end method

.method public static final j()Ljava/util/Map;
    .locals 4

    .line 1
    .line 2
    const-string v0, "payment/channel/recharge/ivyConfirm"

    .line 3
    .line 4
    const-string v1, "payment_android_fiatRecharge_rn_new"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "payment/fastTrade/buy/ivyConfirm"

    .line 11
    .line 12
    const-string v2, "payment_android_fast_rn_new"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    const-string v3, "payment/fast/recurring/result"

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 30
    move-result-object v0

    .line 31
    return-object v0
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
.end method


# virtual methods
.method public b(Lzx/a;)Z
    .locals 6
    .param p1    # Lzx/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "chain"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/otc/service/a;->a:Lcom/kubi/otc/service/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/otc/service/a;->o()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-super {p0, p1}, Lil/c;->b(Lzx/a;)Z

    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-interface {p1}, Lzx/a;->b()Lay/a;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lay/a;->j()Landroid/net/Uri;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lcom/kubi/router/utils/RouteExKt;->G(Landroid/net/Uri;)Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->h(Ljava/lang/String;)Lkotlin/Pair;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    check-cast v3, Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    move-result v3

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    check-cast v2, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;

    .line 51
    const/4 v4, 0x1

    .line 52
    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    sget-object v5, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;->GO_2_RN:Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;

    .line 56
    .line 57
    if-ne v2, v5, :cond_1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    invoke-interface {p0, v0, p1}, Lcu/f;->a(Lay/a;Ljava/lang/String;)V

    .line 65
    return v4

    .line 66
    .line 67
    :cond_1
    if-eqz v3, :cond_2

    .line 68
    .line 69
    sget-object v3, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;->NOTIFY_RN:Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;

    .line 70
    .line 71
    if-ne v2, v3, :cond_2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lay/a;->d()Landroid/os/Bundle;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v1, v2}, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->i(Ljava/lang/String;Landroid/os/Bundle;)Z

    .line 79
    move-result v2

    .line 80
    .line 81
    if-eqz v2, :cond_2

    .line 82
    return v4

    .line 83
    .line 84
    :cond_2
    const-string v2, "payment/fastTrade"

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    move-result v1

    .line 89
    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    sget-object v1, Lcom/kubi/payment/helper/e;->a:Lcom/kubi/payment/helper/e;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Lcom/kubi/payment/helper/e;->a()Z

    .line 96
    move-result v1

    .line 97
    .line 98
    if-eqz v1, :cond_3

    .line 99
    .line 100
    .line 101
    invoke-interface {p1}, Lzx/a;->b()Lay/a;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    invoke-interface {p1, v0}, Lzx/a;->a(Lay/a;)Z

    .line 106
    move-result p1

    .line 107
    return p1

    .line 108
    .line 109
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lay/a;->j()Landroid/net/Uri;

    .line 116
    move-result-object v1

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v1, "://otc"

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    .line 135
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lay/a;->d()Landroid/os/Bundle;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    const-string v1, "type"

    .line 143
    .line 144
    const-string v2, "2"

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    new-instance v1, Lay/a;

    .line 150
    .line 151
    .line 152
    invoke-direct {v1, p1, v0}, Lay/a;-><init>(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Lay/a;->k()Z

    .line 156
    return v4

    .line 157
    .line 158
    .line 159
    :cond_4
    invoke-interface {p1}, Lzx/a;->b()Lay/a;

    .line 160
    move-result-object v0

    .line 161
    .line 162
    .line 163
    invoke-interface {p1, v0}, Lzx/a;->a(Lay/a;)Z

    .line 164
    move-result p1

    .line 165
    return p1
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
.end method

.method public final e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/Map;

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
.end method

.method public final f()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/Map;

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
.end method

.method public final h(Ljava/lang/String;)Lkotlin/Pair;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_6

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;->DEFAULT:Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->e()Ljava/util/Map;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    sget-object v1, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;->GO_2_RN:Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->e()Ljava/util/Map;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    goto :goto_0

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->f()Ljava/util/Map;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 44
    move-result v1

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    sget-object v1, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;->NOTIFY_RN:Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->f()Ljava/util/Map;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    check-cast p1, Ljava/lang/String;

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object v1, v0

    .line 61
    move-object p1, v2

    .line 62
    .line 63
    :goto_0
    if-eqz p1, :cond_5

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 67
    move-result v3

    .line 68
    .line 69
    if-nez v3, :cond_3

    .line 70
    goto :goto_2

    .line 71
    .line 72
    :cond_3
    iget-object v3, p0, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;->c:Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    :try_start_0
    sget-object v0, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 81
    .line 82
    new-instance v0, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$a;

    .line 83
    .line 84
    .line 85
    invoke-direct {v0}, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$a;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    const-string v4, "object : TypeToken<T>() {}.type"

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 98
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    goto :goto_1

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    move-object v5, v0

    .line 102
    .line 103
    new-instance v4, Lcom/kubi/config/exception/KCConfigException;

    .line 104
    .line 105
    const/16 v9, 0x8

    .line 106
    const/4 v10, 0x0

    .line 107
    .line 108
    const-string v6, "RemoteConfig"

    .line 109
    const/4 v7, 0x0

    .line 110
    const/4 v8, 0x0

    .line 111
    .line 112
    .line 113
    invoke-direct/range {v4 .. v10}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 114
    const/4 v0, 0x2

    .line 115
    .line 116
    .line 117
    invoke-static {v4, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 118
    .line 119
    :goto_1
    check-cast v2, Ljava/lang/Boolean;

    .line 120
    const/4 v0, 0x0

    .line 121
    .line 122
    .line 123
    invoke-static {v2, v0}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 124
    move-result v0

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    .line 131
    invoke-interface {v3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    :cond_4
    check-cast v0, Ljava/lang/Boolean;

    .line 134
    .line 135
    new-instance p1, Lkotlin/Pair;

    .line 136
    .line 137
    .line 138
    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    return-object p1

    .line 140
    .line 141
    :cond_5
    :goto_2
    new-instance p1, Lkotlin/Pair;

    .line 142
    .line 143
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 144
    .line 145
    .line 146
    invoke-direct {p1, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 147
    return-object p1

    .line 148
    .line 149
    :cond_6
    :goto_3
    new-instance p1, Lkotlin/Pair;

    .line 150
    .line 151
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 152
    .line 153
    sget-object v1, Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;->DEFAULT:Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;

    .line 154
    .line 155
    .line 156
    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    return-object p1
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
.end method

.method public final i(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_9

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 7
    move-result v1

    .line 8
    .line 9
    .line 10
    const v2, -0x6b6e1233

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    if-eq v1, v2, :cond_6

    .line 15
    .line 16
    .line 17
    const v2, 0x2fac7199

    .line 18
    .line 19
    if-eq v1, v2, :cond_3

    .line 20
    .line 21
    .line 22
    const v2, 0x5afdd907

    .line 23
    .line 24
    if-eq v1, v2, :cond_0

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_0
    const-string v1, "payment/channel/recharge/ivyConfirm"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result p1

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_1
    const-string p1, "rechargeId"

    .line 39
    .line 40
    .line 41
    invoke-static {p2, p1}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 50
    move-result p1

    .line 51
    .line 52
    if-lez p1, :cond_9

    .line 53
    .line 54
    sget-object p1, Lcom/kubi/rn/api/IReactNativeService;->Companion:Lcom/kubi/rn/api/IReactNativeService$Companion;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/kubi/rn/api/IReactNativeService$Companion;->get()Lcom/kubi/rn/api/IReactNativeService;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    invoke-static {p2}, Lcom/kubi/router/utils/RouteExKt;->d0(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    if-eqz p2, :cond_2

    .line 65
    move-object v4, p2

    .line 66
    .line 67
    :cond_2
    const-string p2, "jumpRechargeResultPage"

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, p2, v4}, Lcom/kubi/rn/api/IReactNativeService;->nativeNotifyRn(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 71
    return v3

    .line 72
    .line 73
    :cond_3
    const-string v1, "payment/fast/recurring/result"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    move-result p1

    .line 78
    .line 79
    if-nez p1, :cond_4

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :cond_4
    const-string p1, "orderId"

    .line 83
    .line 84
    .line 85
    invoke-static {p2, p1}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    .line 93
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 94
    move-result p1

    .line 95
    .line 96
    if-lez p1, :cond_9

    .line 97
    .line 98
    sget-object p1, Lcom/kubi/rn/api/IReactNativeService;->Companion:Lcom/kubi/rn/api/IReactNativeService$Companion;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/kubi/rn/api/IReactNativeService$Companion;->get()Lcom/kubi/rn/api/IReactNativeService;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    .line 105
    invoke-static {p2}, Lcom/kubi/router/utils/RouteExKt;->d0(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 106
    move-result-object p2

    .line 107
    .line 108
    if-eqz p2, :cond_5

    .line 109
    move-object v4, p2

    .line 110
    .line 111
    :cond_5
    const-string p2, "jumpFastRecurringResultPage"

    .line 112
    .line 113
    .line 114
    invoke-interface {p1, p2, v4}, Lcom/kubi/rn/api/IReactNativeService;->nativeNotifyRn(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 115
    return v3

    .line 116
    .line 117
    :cond_6
    const-string v1, "payment/fastTrade/buy/ivyConfirm"

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    move-result p1

    .line 122
    .line 123
    if-nez p1, :cond_7

    .line 124
    goto :goto_0

    .line 125
    .line 126
    :cond_7
    const-string p1, "fastBuyOrderId"

    .line 127
    .line 128
    .line 129
    invoke-static {p2, p1}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    move-result-object p1

    .line 131
    .line 132
    .line 133
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    .line 137
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 138
    move-result p1

    .line 139
    .line 140
    if-lez p1, :cond_9

    .line 141
    .line 142
    sget-object p1, Lcom/kubi/rn/api/IReactNativeService;->Companion:Lcom/kubi/rn/api/IReactNativeService$Companion;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/kubi/rn/api/IReactNativeService$Companion;->get()Lcom/kubi/rn/api/IReactNativeService;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    .line 149
    invoke-static {p2}, Lcom/kubi/router/utils/RouteExKt;->d0(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 150
    move-result-object p2

    .line 151
    .line 152
    if-eqz p2, :cond_8

    .line 153
    move-object v4, p2

    .line 154
    .line 155
    :cond_8
    const-string p2, "jumpIvyFastResultPage"

    .line 156
    .line 157
    .line 158
    invoke-interface {p1, p2, v4}, Lcom/kubi/rn/api/IReactNativeService;->nativeNotifyRn(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 159
    return v3

    .line 160
    :cond_9
    :goto_0
    return v0
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
.end method

.method public final k(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_7

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :sswitch_0
    const-string v0, "otc/fiat/orderList"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    const-string p1, "FiatFundingRecordPage"

    .line 22
    return-object p1

    .line 23
    .line 24
    :sswitch_1
    const-string v0, "otc/orderList"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    move-result p1

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    const-string p1, "OrderListPage"

    .line 34
    return-object p1

    .line 35
    .line 36
    :sswitch_2
    const-string v0, "otc/fiat/recharge/orderDetail"

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-nez p1, :cond_2

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_2
    const-string p1, "FiatRechargeOrderDetailPage"

    .line 46
    return-object p1

    .line 47
    .line 48
    :sswitch_3
    const-string v0, "payment/fastTrade"

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    move-result p1

    .line 53
    .line 54
    if-nez p1, :cond_3

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :cond_3
    const-string p1, "FastTradeHomePage"

    .line 58
    return-object p1

    .line 59
    .line 60
    :sswitch_4
    const-string v0, "otc/fiat/withdraw/orderDetail"

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    move-result p1

    .line 65
    .line 66
    if-nez p1, :cond_4

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :cond_4
    const-string p1, "FiatWithdrawOrderDetailPage"

    .line 70
    return-object p1

    .line 71
    .line 72
    :sswitch_5
    const-string v0, "otc/fiat/recharge"

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    move-result p1

    .line 77
    .line 78
    if-nez p1, :cond_5

    .line 79
    goto :goto_0

    .line 80
    .line 81
    :cond_5
    const-string p1, "FiatRechargePage"

    .line 82
    return-object p1

    .line 83
    .line 84
    :sswitch_6
    const-string v0, "otc/fiat/withdraw"

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    move-result p1

    .line 89
    .line 90
    if-nez p1, :cond_6

    .line 91
    goto :goto_0

    .line 92
    .line 93
    :cond_6
    const-string p1, "FiatWithdrawPage"

    .line 94
    return-object p1

    .line 95
    .line 96
    :cond_7
    :goto_0
    const-string p1, ""

    .line 97
    return-object p1

    .line 98
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x4c28446e -> :sswitch_6
        -0x442ad0d1 -> :sswitch_5
        0x1633a642 -> :sswitch_4
        0x1da7a99f -> :sswitch_3
        0x2cf7965f -> :sswitch_2
        0x3de0fb5b -> :sswitch_1
        0x7918b584 -> :sswitch_0
    .end sparse-switch
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
.end method
