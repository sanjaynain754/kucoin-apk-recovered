.class public final Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;
.super Ljava/lang/Object;
.source "Flutter2RNRouter.kt"

# interfaces
.implements Lzx/b;
.implements Lcu/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$Companion;,
        Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;,
        Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0003\u001c\u001d\u001eB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R!\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\n\u001a\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\n\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;",
        "Lcom/kubi/router/interceptor/IInterceptor;",
        "Lcom/kubi/payment/interceptor/route/IFastTradeRNRouter;",
        "<init>",
        "()V",
        "rnFiatRechargeToggle",
        "",
        "getRnFiatRechargeToggle",
        "()Z",
        "rnFiatRechargeToggle$delegate",
        "Lkotlin/Lazy;",
        "routeConfigs",
        "",
        "Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteConfig;",
        "getRouteConfigs",
        "()Ljava/util/List;",
        "routeConfigs$delegate",
        "rnNotifyTransmit",
        "Lcom/kubi/sdk/flutter/transmit/IRNNotifyTransmit;",
        "getRnNotifyTransmit",
        "()Lcom/kubi/sdk/flutter/transmit/IRNNotifyTransmit;",
        "rnNotifyTransmit$delegate",
        "intercept",
        "chain",
        "Lcom/kubi/router/interceptor/IChain;",
        "interceptForRN",
        "postcard",
        "Lcom/kubi/router/model/Postcard;",
        "RouteTarget",
        "RouteConfig",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFlutter2RNRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Flutter2RNRouter.kt\ncom/kubi/payment/interceptor/route/Flutter2RNRouter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,101:1\n295#2,2:102\n29#3:104\n29#3:107\n216#4,2:105\n35#5,4:108\n39#5:114\n44#6,2:112\n*S KotlinDebug\n*F\n+ 1 Flutter2RNRouter.kt\ncom/kubi/payment/interceptor/route/Flutter2RNRouter\n*L\n76#1:102,2\n82#1:104\n88#1:107\n87#1:105,2\n34#1:108,4\n34#1:114\n34#1:112,2\n*E\n"
    }
.end annotation


# static fields
.field public static final d:Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$Companion;
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

.field public final c:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->d:Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$Companion;

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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcu/c;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcu/c;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->a:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcu/d;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcu/d;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->b:Lkotlin/Lazy;

    .line 26
    .line 27
    new-instance v0, Lcu/e;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Lcu/e;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iput-object v0, p0, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->c:Lkotlin/Lazy;

    .line 37
    return-void
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
.end method

.method public static synthetic c()Lwy/m;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->k()Lwy/m;

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
.end method

.method public static synthetic d()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->j()Z

    .line 4
    move-result v0

    .line 5
    return v0
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

.method public static synthetic e()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->l()Ljava/util/List;

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
.end method

.method public static final j()Z
    .locals 8

    .line 1
    .line 2
    const-string v0, "payment_android_fiatRecharge_rn_new"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$c;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$c;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object v2, v0

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 28
    .line 29
    const/16 v6, 0x8

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    const-string v3, "RemoteConfig"

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    const/4 v1, 0x0

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 50
    move-result v0

    .line 51
    return v0
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
.end method

.method public static final k()Lwy/m;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    const-class v1, Lwy/m;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->l(Ljava/lang/Class;)Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lwy/m;

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
.end method

.method public static final l()Ljava/util/List;
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$b;

    .line 5
    .line 6
    const-string v2, "jumpRechargeResultPage"

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$b;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v2, "payment/channel/recharge/result"

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v2, v1}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;-><init>(Ljava/lang/String;Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b;)V

    .line 15
    .line 16
    new-instance v1, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;

    .line 17
    .line 18
    new-instance v2, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$a;

    .line 19
    .line 20
    const-string v3, "FAST_BUY"

    .line 21
    .line 22
    const-string v4, "tradeType"

    .line 23
    .line 24
    .line 25
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    const-string v5, "FIAT"

    .line 29
    .line 30
    const-string v6, "inputMode"

    .line 31
    .line 32
    .line 33
    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    move-result-object v5

    .line 35
    .line 36
    .line 37
    filled-new-array {v3, v5}, [Lkotlin/Pair;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    .line 41
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    const-string v5, "FastTradeLitePaymentListPage"

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, v5, v3}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 48
    .line 49
    const-string v3, "payment/lite/fast/buy/selectPaymentMethod"

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v3, v2}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;-><init>(Ljava/lang/String;Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b;)V

    .line 53
    .line 54
    new-instance v2, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;

    .line 55
    .line 56
    new-instance v3, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$a;

    .line 57
    .line 58
    const-string v7, "FAST_SELL"

    .line 59
    .line 60
    .line 61
    invoke-static {v4, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 62
    move-result-object v4

    .line 63
    .line 64
    const-string v7, "CRYPTO"

    .line 65
    .line 66
    .line 67
    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 68
    move-result-object v6

    .line 69
    .line 70
    .line 71
    filled-new-array {v4, v6}, [Lkotlin/Pair;

    .line 72
    move-result-object v4

    .line 73
    .line 74
    .line 75
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 76
    move-result-object v4

    .line 77
    .line 78
    .line 79
    invoke-direct {v3, v5, v4}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 80
    .line 81
    const-string v4, "payment/lite/fast/sell/selectPaymentMethod"

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v4, v3}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;-><init>(Ljava/lang/String;Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b;)V

    .line 85
    .line 86
    .line 87
    filled-new-array {v0, v1, v2}, [Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 92
    move-result-object v0

    .line 93
    return-object v0
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


# virtual methods
.method public b(Lzx/a;)Z
    .locals 2
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
    .line 8
    invoke-interface {p1}, Lzx/a;->b()Lay/a;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->i(Lay/a;)Z

    .line 13
    move-result v1

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {p1, v0}, Lzx/a;->a(Lay/a;)Z

    .line 21
    move-result p1

    .line 22
    return p1
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

.method public final f()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    return v0
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

.method public final g()Lwy/m;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->c:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lwy/m;

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

.method public final h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

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

.method public final i(Lay/a;)Z
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lay/a;->j()Landroid/net/Uri;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/kubi/router/utils/RouteExKt;->G(Landroid/net/Uri;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "flutter"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lay/a;->j()Landroid/net/Uri;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/kubi/router/utils/RouteExKt;->G(Landroid/net/Uri;)Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    const-string v2, "/flutter"

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    return v1

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Lay/a;->j()Landroid/net/Uri;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    const-string v2, "route"

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    return v1

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->h()Ljava/util/List;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    .line 54
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    move-result v4

    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x1

    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    move-result-object v4

    .line 68
    move-object v7, v4

    .line 69
    .line 70
    check-cast v7, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;->a()Ljava/lang/String;

    .line 74
    move-result-object v7

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v7, v6}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 78
    move-result v7

    .line 79
    .line 80
    if-eqz v7, :cond_2

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move-object v4, v5

    .line 83
    .line 84
    :goto_0
    check-cast v4, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;

    .line 85
    .line 86
    if-nez v4, :cond_4

    .line 87
    return v1

    .line 88
    .line 89
    .line 90
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->f()Z

    .line 91
    move-result v3

    .line 92
    .line 93
    if-nez v3, :cond_5

    .line 94
    return v1

    .line 95
    .line 96
    .line 97
    :cond_5
    invoke-virtual {v4}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$a;->b()Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    instance-of v3, v1, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$b;

    .line 101
    .line 102
    if-eqz v3, :cond_7

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;->g()Lwy/m;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    if-eqz p1, :cond_9

    .line 109
    .line 110
    check-cast v1, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$b;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$b;->a()Ljava/lang/String;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    .line 117
    invoke-static {}, Landroidx/core/os/BundleKt;->bundleOf()Landroid/os/Bundle;

    .line 118
    move-result-object v2

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 122
    move-result-object v0

    .line 123
    .line 124
    .line 125
    invoke-static {v2, v0}, Lcom/kubi/router/utils/RouteExKt;->d(Landroid/os/Bundle;Landroid/net/Uri;)Landroid/os/Bundle;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    .line 129
    invoke-static {v0}, Lcom/kubi/router/utils/RouteExKt;->d0(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    if-eqz v0, :cond_6

    .line 133
    move-object v5, v0

    .line 134
    .line 135
    .line 136
    :cond_6
    invoke-interface {p1, v1, v5}, Lwy/m;->sendEventToRN(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 137
    goto :goto_2

    .line 138
    .line 139
    :cond_7
    instance-of v3, v1, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$a;

    .line 140
    .line 141
    if-eqz v3, :cond_a

    .line 142
    .line 143
    check-cast v1, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$a;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$a;->a()Ljava/util/Map;

    .line 147
    move-result-object v3

    .line 148
    .line 149
    .line 150
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 151
    move-result-object v3

    .line 152
    .line 153
    .line 154
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 155
    move-result-object v3

    .line 156
    .line 157
    .line 158
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    move-result v4

    .line 160
    .line 161
    if-eqz v4, :cond_8

    .line 162
    .line 163
    .line 164
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    move-result-object v4

    .line 166
    .line 167
    check-cast v4, Ljava/util/Map$Entry;

    .line 168
    .line 169
    .line 170
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 171
    move-result-object v5

    .line 172
    .line 173
    check-cast v5, Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 177
    move-result-object v4

    .line 178
    .line 179
    check-cast v4, Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Lay/a;->d()Landroid/os/Bundle;

    .line 183
    move-result-object v7

    .line 184
    .line 185
    .line 186
    invoke-virtual {v7, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    goto :goto_1

    .line 188
    .line 189
    .line 190
    :cond_8
    invoke-virtual {p1}, Lay/a;->d()Landroid/os/Bundle;

    .line 191
    move-result-object v3

    .line 192
    .line 193
    .line 194
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 195
    move-result-object v0

    .line 196
    .line 197
    .line 198
    invoke-static {v3, v0}, Lcom/kubi/router/utils/RouteExKt;->d(Landroid/os/Bundle;Landroid/net/Uri;)Landroid/os/Bundle;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Lay/a;->d()Landroid/os/Bundle;

    .line 202
    move-result-object v0

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$b$a;->b()Ljava/lang/String;

    .line 209
    move-result-object v0

    .line 210
    .line 211
    .line 212
    invoke-interface {p0, p1, v0}, Lcu/f;->a(Lay/a;Ljava/lang/String;)V

    .line 213
    :cond_9
    :goto_2
    return v6

    .line 214
    .line 215
    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 216
    .line 217
    .line 218
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 219
    throw p1
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
