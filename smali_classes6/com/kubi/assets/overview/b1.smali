.class public final Lcom/kubi/assets/overview/b1;
.super Ljava/lang/Object;
.source "OverviewAnalyticsReporter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bJ\u001e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001aJ\u0016\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001aJ \u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001aJ \u0010 \u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001aJ%\u0010!\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\"J%\u0010#\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\"J\'\u0010$\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0008\u0010%\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010&J\u0018\u0010\'\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0005J*\u0010(\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0008\u0010)\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001aJ*\u0010*\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0008\u0010)\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001aJ\u0010\u0010+\u001a\u00020\u00052\u0008\u0010,\u001a\u0004\u0018\u00010-J\u0016\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0005J\u0016\u00101\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0005J\u000e\u00102\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u00063"
    }
    d2 = {
        "Lcom/kubi/assets/overview/OverviewAnalyticsReporter;",
        "",
        "<init>",
        "()V",
        "pageId",
        "",
        "reportEvent",
        "",
        "eventName",
        "reportCoinListCount",
        "count",
        "",
        "reportAssetData",
        "asset",
        "Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
        "reportTabBtn",
        "position",
        "exposeTabBtn",
        "exposeRecommendationPage",
        "jumpRecommendationPage",
        "changeRecommendationPage",
        "size",
        "newSize",
        "cardTypeAndNum",
        "num",
        "hasMore",
        "",
        "exposeCrossMarginCard",
        "pnl",
        "clickCrossMarginCard",
        "exposeIsolatedMarginCard",
        "tag",
        "clickIsolatedMarginCard",
        "exposeBotCardCard",
        "(ILjava/lang/Integer;Z)V",
        "clickBotCardCard",
        "exposeEarnCard",
        "productNo",
        "(ILjava/lang/String;Ljava/lang/Integer;)V",
        "clickEarnCard",
        "exposeFutureCard",
        "marginMode",
        "clickFutureCard",
        "hasBalance",
        "totalBalance",
        "Ljava/math/BigDecimal;",
        "exposeDynamicsBar",
        "type",
        "style",
        "clickDynamicsBar",
        "exposeOverviewPnl",
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
        "SMAP\nOverviewAnalyticsReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverviewAnalyticsReporter.kt\ncom/kubi/assets/overview/OverviewAnalyticsReporter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1999#2,14:363\n774#2:377\n865#2,2:378\n*S KotlinDebug\n*F\n+ 1 OverviewAnalyticsReporter.kt\ncom/kubi/assets/overview/OverviewAnalyticsReporter\n*L\n65#1:363,14\n71#1:377\n71#1:378,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/assets/overview/b1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/b1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/overview/b1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 8
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static synthetic a(Lcom/kubi/assets/entity/AssetTrackEntity;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/b1;->v(Lcom/kubi/assets/entity/AssetTrackEntity;)Ljava/lang/CharSequence;

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

.method public static final v(Lcom/kubi/assets/entity/AssetTrackEntity;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/assets/entity/AssetTrackEntity;->getAccount()Ljava/lang/String;

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
.end method


# virtual methods
.method public final b(Ljava/lang/String;IZ)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "eventName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 11
    .line 12
    const-string v1, "bizNo"

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    const-string p2, "viewmore"

    .line 24
    .line 25
    const-string p3, "1"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    .line 30
    :cond_0
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    .line 32
    const-string p2, "B1overview"

    .line 33
    .line 34
    const-string p3, "ongoingArea"

    .line 35
    .line 36
    .line 37
    invoke-static {p2, p3, p1, v0}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 38
    return-void
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

.method public final c(II)V
    .locals 6

    .line 1
    .line 2
    if-eq p2, p1, :cond_1

    .line 3
    .line 4
    if-le p2, p1, :cond_0

    .line 5
    .line 6
    const-string p1, "addCard"

    .line 7
    :goto_0
    move-object v2, p1

    .line 8
    goto :goto_1

    .line 9
    .line 10
    :cond_0
    const-string p1, "reduceCard"

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :goto_1
    const/16 v4, 0x8

    .line 14
    const/4 v5, 0x0

    .line 15
    .line 16
    const-string v0, "B1overview"

    .line 17
    .line 18
    const-string v1, "ongoingArea"

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static/range {v0 .. v5}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 23
    :cond_1
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

.method public final d(ILjava/lang/Integer;Z)V
    .locals 2
    .param p2    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "botCard"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    new-instance v0, Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    const-string v1, "object"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    if-eqz p3, :cond_0

    .line 36
    .line 37
    const-string p2, "loss"

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    const-string p2, "profit"

    .line 41
    .line 42
    :goto_0
    const-string p3, "pnlDirection"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 48
    .line 49
    const-string p2, "B1overview"

    .line 50
    .line 51
    const-string p3, "ongoingArea"

    .line 52
    .line 53
    .line 54
    invoke-static {p2, p3, p1, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 55
    return-void
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

.method public final e(IZ)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    const-string v1, "amount"

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    const-string p1, "loss"

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    const-string p1, "profit"

    .line 22
    .line 23
    :goto_0
    const-string p2, "pnlDirection"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    .line 30
    const-string p1, "B1overview"

    .line 31
    .line 32
    const-string p2, "ongoingArea"

    .line 33
    .line 34
    const-string v1, "crossMarginCard"

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2, v1, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 38
    return-void
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

.method public final f(ILjava/lang/String;)V
    .locals 6
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "style"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "card"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    move-result p2

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    const-string p1, "autoEarn"

    .line 16
    :goto_0
    move-object v2, p1

    .line 17
    goto :goto_1

    .line 18
    .line 19
    :cond_0
    if-eqz p1, :cond_3

    .line 20
    const/4 p2, 0x1

    .line 21
    .line 22
    if-eq p1, p2, :cond_2

    .line 23
    const/4 p2, 0x2

    .line 24
    .line 25
    if-eq p1, p2, :cond_1

    .line 26
    .line 27
    const-string p1, ""

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_1
    const-string p1, "subscrip"

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_2
    const-string p1, "withdrawRecord"

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_3
    const-string p1, "depositRecord"

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :goto_1
    const/16 v4, 0x8

    .line 40
    const/4 v5, 0x0

    .line 41
    .line 42
    const-string v0, "B1overview"

    .line 43
    .line 44
    const-string v1, "activeBar"

    .line 45
    const/4 v3, 0x0

    .line 46
    .line 47
    .line 48
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 49
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
    .line 65
.end method

.method public final g(ILjava/lang/String;)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "earnCard"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    new-instance v0, Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    const-string v1, "object"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 36
    .line 37
    const-string p2, "B1overview"

    .line 38
    .line 39
    const-string v1, "ongoingArea"

    .line 40
    .line 41
    .line 42
    invoke-static {p2, v1, p1, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 43
    return-void
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

.method public final h(ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "futureCard"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    new-instance v0, Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    const-string v1, "object"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    .line 31
    const-string p2, "position"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    const-string p2, "loss"

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_0
    const-string p2, "profit"

    .line 42
    .line 43
    :goto_0
    const-string p3, "pnlDirection"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 47
    .line 48
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 49
    .line 50
    const-string p2, "B1overview"

    .line 51
    .line 52
    const-string p3, "ongoingArea"

    .line 53
    .line 54
    .line 55
    invoke-static {p2, p3, p1, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 56
    return-void
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
.end method

.method public final i(ILjava/lang/String;Z)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "isolatedMarginCard"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    new-instance v0, Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    const-string v1, "object"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    const-string p2, "loss"

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_0
    const-string p2, "profit"

    .line 37
    .line 38
    :goto_0
    const-string p3, "pnlDirection"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    .line 43
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 44
    .line 45
    const-string p2, "B1overview"

    .line 46
    .line 47
    const-string p3, "ongoingArea"

    .line 48
    .line 49
    .line 50
    invoke-static {p2, p3, p1, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 51
    return-void
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

.method public final j(ILjava/lang/Integer;Z)V
    .locals 2
    .param p2    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "botCard"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    new-instance v0, Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    const-string v1, "object"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    if-eqz p3, :cond_0

    .line 36
    .line 37
    const-string p2, "loss"

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    const-string p2, "profit"

    .line 41
    .line 42
    :goto_0
    const-string p3, "pnlDirection"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 48
    .line 49
    const-string p2, "B1overview"

    .line 50
    .line 51
    const-string p3, "ongoingArea"

    .line 52
    .line 53
    .line 54
    invoke-static {p2, p3, p1, v0}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 55
    return-void
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

.method public final k(IZ)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    const-string v1, "amount"

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    const-string p1, "loss"

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    const-string p1, "profit"

    .line 22
    .line 23
    :goto_0
    const-string p2, "pnlDirection"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    .line 30
    const-string p1, "B1overview"

    .line 31
    .line 32
    const-string p2, "ongoingArea"

    .line 33
    .line 34
    const-string v1, "crossMarginCard"

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2, v1, v0}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 38
    return-void
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

.method public final l(ILjava/lang/String;)V
    .locals 6
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "style"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "card"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    move-result p2

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    const-string p1, "autoEarn"

    .line 16
    :goto_0
    move-object v2, p1

    .line 17
    goto :goto_1

    .line 18
    .line 19
    :cond_0
    if-eqz p1, :cond_3

    .line 20
    const/4 p2, 0x1

    .line 21
    .line 22
    if-eq p1, p2, :cond_2

    .line 23
    const/4 p2, 0x2

    .line 24
    .line 25
    if-eq p1, p2, :cond_1

    .line 26
    .line 27
    const-string p1, ""

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_1
    const-string p1, "subscrip"

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_2
    const-string p1, "withdrawRecord"

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_3
    const-string p1, "depositRecord"

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :goto_1
    const/16 v4, 0x8

    .line 40
    const/4 v5, 0x0

    .line 41
    .line 42
    const-string v0, "B1overview"

    .line 43
    .line 44
    const-string v1, "activeBar"

    .line 45
    const/4 v3, 0x0

    .line 46
    .line 47
    .line 48
    invoke-static/range {v0 .. v5}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 49
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
    .line 65
.end method

.method public final m(ILjava/lang/String;Ljava/lang/Integer;)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "earnCard"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    new-instance v0, Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    const-string v1, "object"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    const-string p2, "productNo"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 41
    .line 42
    const-string p2, "B1overview"

    .line 43
    .line 44
    const-string p3, "ongoingArea"

    .line 45
    .line 46
    .line 47
    invoke-static {p2, p3, p1, v0}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 48
    return-void
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

.method public final n(ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "futureCard"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    new-instance v0, Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    const-string v1, "object"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    .line 31
    const-string p2, "position"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    const-string p2, "loss"

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_0
    const-string p2, "profit"

    .line 42
    .line 43
    :goto_0
    const-string p3, "pnlDirection"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 47
    .line 48
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 49
    .line 50
    const-string p2, "B1overview"

    .line 51
    .line 52
    const-string p3, "ongoingArea"

    .line 53
    .line 54
    .line 55
    invoke-static {p2, p3, p1, v0}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 56
    return-void
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
.end method

.method public final o(ILjava/lang/String;Z)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "isolatedMarginCard"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    new-instance v0, Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    const-string v1, "object"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    const-string p2, "loss"

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_0
    const-string p2, "profit"

    .line 37
    .line 38
    :goto_0
    const-string p3, "pnlDirection"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    .line 43
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 44
    .line 45
    const-string p2, "B1overview"

    .line 46
    .line 47
    const-string p3, "ongoingArea"

    .line 48
    .line 49
    .line 50
    invoke-static {p2, p3, p1, v0}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 51
    return-void
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

.method public final p(I)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->PNL1D:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    const-string p1, "PnL1D"

    .line 11
    :goto_0
    move-object v2, p1

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_0
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->PnL7D:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 18
    move-result v0

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    const-string p1, "PnL7D"

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->PnL30D:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 29
    move-result v0

    .line 30
    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    const-string p1, "PnL30D"

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_2
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->PnL3M:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 40
    move-result v0

    .line 41
    .line 42
    if-ne p1, v0, :cond_3

    .line 43
    .line 44
    const-string p1, "PnL3M"

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_3
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->PnL6M:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 51
    move-result v0

    .line 52
    .line 53
    if-ne p1, v0, :cond_4

    .line 54
    .line 55
    const-string p1, "PnL6M"

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_4
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->PnLUpdating:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 62
    move-result v0

    .line 63
    .line 64
    if-ne p1, v0, :cond_5

    .line 65
    .line 66
    const-string p1, "PnLUpdating"

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :cond_5
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->Profit:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 73
    move-result v0

    .line 74
    .line 75
    if-ne p1, v0, :cond_6

    .line 76
    .line 77
    const-string p1, "profit"

    .line 78
    goto :goto_0

    .line 79
    .line 80
    :cond_6
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->Loss:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 84
    move-result v0

    .line 85
    .line 86
    if-ne p1, v0, :cond_7

    .line 87
    .line 88
    const-string p1, "loss"

    .line 89
    goto :goto_0

    .line 90
    .line 91
    :cond_7
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->DescriptionHover:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 95
    move-result v0

    .line 96
    .line 97
    if-ne p1, v0, :cond_8

    .line 98
    .line 99
    const-string p1, "descriptionHover"

    .line 100
    goto :goto_0

    .line 101
    .line 102
    :cond_8
    const-string p1, ""

    .line 103
    goto :goto_0

    .line 104
    .line 105
    :goto_1
    const/16 v4, 0x8

    .line 106
    const/4 v5, 0x0

    .line 107
    .line 108
    const-string v0, "B1overview"

    .line 109
    .line 110
    const-string v1, "assetTrendNew"

    .line 111
    const/4 v3, 0x0

    .line 112
    .line 113
    .line 114
    invoke-static/range {v0 .. v5}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 115
    return-void
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

.method public final q(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "eventName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v5, 0x8

    .line 8
    const/4 v6, 0x0

    .line 9
    .line 10
    const-string v1, "B1overview"

    .line 11
    .line 12
    const-string v2, "ongoingArea"

    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v3, p1

    .line 15
    .line 16
    .line 17
    invoke-static/range {v1 .. v6}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 18
    return-void
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

.method public final r(I)V
    .locals 6

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    const-string p1, "ongoing"

    .line 8
    :goto_0
    move-object v2, p1

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    const-string p1, "account"

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_1
    const-string p1, "coin"

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :goto_1
    const/16 v4, 0x8

    .line 18
    const/4 v5, 0x0

    .line 19
    .line 20
    const-string v0, "B1overview"

    .line 21
    .line 22
    const-string v1, "TabBtn"

    .line 23
    const/4 v3, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v0 .. v5}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 27
    return-void
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

.method public final s(Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 2
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0, v1, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 12
    move-result p1

    .line 13
    .line 14
    if-lez p1, :cond_0

    .line 15
    .line 16
    const-string p1, "1"

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_0
    const-string p1, "0"

    .line 20
    return-object p1
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

.method public final t(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "eventName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v5, 0x8

    .line 8
    const/4 v6, 0x0

    .line 9
    .line 10
    const-string v1, "B1overview"

    .line 11
    .line 12
    const-string v2, "ongoingArea"

    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v3, p1

    .line 15
    .line 16
    .line 17
    invoke-static/range {v1 .. v6}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 18
    return-void
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

.method public final u(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V
    .locals 26
    .param p1    # Lcom/kubi/assets/entity/AssetV2OverviewEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "asset"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getMainAsset()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 18
    move-result-object v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v2, v3

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getSpotAsset()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 30
    move-result-object v4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object v4, v3

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getCrossMarginAsset()Lcom/kubi/margin/api/entity/LeverBalance;

    .line 36
    move-result-object v5

    .line 37
    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5}, Lcom/kubi/margin/api/entity/LeverBalance;->getTotalBalance()Ljava/math/BigDecimal;

    .line 42
    move-result-object v5

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move-object v5, v3

    .line 45
    :goto_2
    const/4 v6, 0x1

    .line 46
    .line 47
    .line 48
    invoke-static {v5, v3, v6, v3}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getIsolatedMarginAsset()Lcom/kubi/margin/api/entity/IsolateMarginPosition;

    .line 53
    move-result-object v7

    .line 54
    .line 55
    if-eqz v7, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7}, Lcom/kubi/margin/api/entity/IsolateMarginPosition;->getTotalBalance()Ljava/math/BigDecimal;

    .line 59
    move-result-object v7

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    move-object v7, v3

    .line 62
    .line 63
    .line 64
    :goto_3
    invoke-static {v7, v3, v6, v3}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 65
    move-result-object v7

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v7}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 69
    move-result-object v5

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getFutureAsset()Lcom/kubi/assets/entity/EquityEntity;

    .line 73
    move-result-object v7

    .line 74
    .line 75
    if-eqz v7, :cond_4

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7}, Lcom/kubi/assets/entity/EquityEntity;->getTotalEquity()Ljava/math/BigDecimal;

    .line 79
    move-result-object v7

    .line 80
    goto :goto_4

    .line 81
    :cond_4
    move-object v7, v3

    .line 82
    .line 83
    .line 84
    :goto_4
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getRobotAsset()Lcom/kubi/data/entity/SubAssetEntity;

    .line 85
    move-result-object v8

    .line 86
    .line 87
    if-eqz v8, :cond_5

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8}, Lcom/kubi/data/entity/SubAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 91
    move-result-object v8

    .line 92
    goto :goto_5

    .line 93
    :cond_5
    move-object v8, v3

    .line 94
    .line 95
    .line 96
    :goto_5
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getFinanceAsset()Lcom/kubi/assets/entity/EarnBalance;

    .line 97
    move-result-object v9

    .line 98
    .line 99
    if-eqz v9, :cond_6

    .line 100
    .line 101
    .line 102
    invoke-virtual {v9}, Lcom/kubi/assets/entity/EarnBalance;->getTotalValue()Ljava/math/BigDecimal;

    .line 103
    move-result-object v9

    .line 104
    goto :goto_6

    .line 105
    :cond_6
    move-object v9, v3

    .line 106
    .line 107
    :goto_6
    new-instance v10, Lcom/kubi/assets/entity/AssetTrackEntity;

    .line 108
    .line 109
    const-string v11, "main"

    .line 110
    .line 111
    .line 112
    invoke-direct {v10, v2, v11}, Lcom/kubi/assets/entity/AssetTrackEntity;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;)V

    .line 113
    .line 114
    new-instance v11, Lcom/kubi/assets/entity/AssetTrackEntity;

    .line 115
    .line 116
    const-string v12, "trade"

    .line 117
    .line 118
    .line 119
    invoke-direct {v11, v4, v12}, Lcom/kubi/assets/entity/AssetTrackEntity;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;)V

    .line 120
    .line 121
    new-instance v12, Lcom/kubi/assets/entity/AssetTrackEntity;

    .line 122
    .line 123
    const-string v13, "margin"

    .line 124
    .line 125
    .line 126
    invoke-direct {v12, v5, v13}, Lcom/kubi/assets/entity/AssetTrackEntity;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;)V

    .line 127
    .line 128
    new-instance v13, Lcom/kubi/assets/entity/AssetTrackEntity;

    .line 129
    .line 130
    const-string v14, "future"

    .line 131
    .line 132
    .line 133
    invoke-direct {v13, v7, v14}, Lcom/kubi/assets/entity/AssetTrackEntity;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;)V

    .line 134
    .line 135
    new-instance v14, Lcom/kubi/assets/entity/AssetTrackEntity;

    .line 136
    .line 137
    const-string v15, "robot"

    .line 138
    .line 139
    .line 140
    invoke-direct {v14, v8, v15}, Lcom/kubi/assets/entity/AssetTrackEntity;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;)V

    .line 141
    .line 142
    new-instance v15, Lcom/kubi/assets/entity/AssetTrackEntity;

    .line 143
    .line 144
    const-string v3, "finance"

    .line 145
    .line 146
    .line 147
    invoke-direct {v15, v9, v3}, Lcom/kubi/assets/entity/AssetTrackEntity;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    filled-new-array/range {v10 .. v15}, [Lcom/kubi/assets/entity/AssetTrackEntity;

    .line 151
    move-result-object v3

    .line 152
    .line 153
    .line 154
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 155
    move-result-object v3

    .line 156
    .line 157
    .line 158
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    move-result-object v10

    .line 160
    .line 161
    .line 162
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    move-result v11

    .line 164
    .line 165
    if-nez v11, :cond_7

    .line 166
    const/4 v11, 0x0

    .line 167
    goto :goto_8

    .line 168
    .line 169
    .line 170
    :cond_7
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    move-result-object v11

    .line 172
    .line 173
    .line 174
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    move-result v12

    .line 176
    .line 177
    if-nez v12, :cond_8

    .line 178
    goto :goto_8

    .line 179
    :cond_8
    move-object v12, v11

    .line 180
    .line 181
    check-cast v12, Lcom/kubi/assets/entity/AssetTrackEntity;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12}, Lcom/kubi/assets/entity/AssetTrackEntity;->getBalance()Ljava/math/BigDecimal;

    .line 185
    move-result-object v12

    .line 186
    .line 187
    if-nez v12, :cond_9

    .line 188
    .line 189
    sget-object v12, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 190
    .line 191
    .line 192
    :cond_9
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    move-result-object v13

    .line 194
    move-object v14, v13

    .line 195
    .line 196
    check-cast v14, Lcom/kubi/assets/entity/AssetTrackEntity;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v14}, Lcom/kubi/assets/entity/AssetTrackEntity;->getBalance()Ljava/math/BigDecimal;

    .line 200
    move-result-object v14

    .line 201
    .line 202
    if-nez v14, :cond_a

    .line 203
    .line 204
    sget-object v14, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 205
    .line 206
    .line 207
    :cond_a
    invoke-interface {v12, v14}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 208
    move-result v15

    .line 209
    .line 210
    if-gez v15, :cond_b

    .line 211
    move-object v11, v13

    .line 212
    move-object v12, v14

    .line 213
    .line 214
    .line 215
    :cond_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    move-result v13

    .line 217
    .line 218
    if-nez v13, :cond_13

    .line 219
    .line 220
    :goto_8
    check-cast v11, Lcom/kubi/assets/entity/AssetTrackEntity;

    .line 221
    .line 222
    if-eqz v11, :cond_c

    .line 223
    .line 224
    .line 225
    invoke-virtual {v11}, Lcom/kubi/assets/entity/AssetTrackEntity;->getBalance()Ljava/math/BigDecimal;

    .line 226
    move-result-object v10

    .line 227
    :goto_9
    const/4 v12, 0x0

    .line 228
    goto :goto_a

    .line 229
    :cond_c
    const/4 v10, 0x0

    .line 230
    goto :goto_9

    .line 231
    .line 232
    .line 233
    :goto_a
    invoke-static {v10, v12, v6, v12}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 234
    move-result-object v10

    .line 235
    .line 236
    sget-object v12, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v10, v12}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 240
    move-result v10

    .line 241
    .line 242
    const-string v12, "None"

    .line 243
    .line 244
    if-nez v10, :cond_d

    .line 245
    goto :goto_d

    .line 246
    .line 247
    :cond_d
    new-instance v10, Ljava/util/ArrayList;

    .line 248
    .line 249
    .line 250
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 254
    move-result-object v3

    .line 255
    .line 256
    .line 257
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    move-result v13

    .line 259
    .line 260
    if-eqz v13, :cond_10

    .line 261
    .line 262
    .line 263
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    move-result-object v13

    .line 265
    move-object v14, v13

    .line 266
    .line 267
    check-cast v14, Lcom/kubi/assets/entity/AssetTrackEntity;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v14}, Lcom/kubi/assets/entity/AssetTrackEntity;->getBalance()Ljava/math/BigDecimal;

    .line 271
    move-result-object v14

    .line 272
    const/4 v15, 0x0

    .line 273
    .line 274
    .line 275
    invoke-static {v14, v15, v6, v15}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 276
    move-result-object v14

    .line 277
    .line 278
    if-eqz v11, :cond_e

    .line 279
    .line 280
    .line 281
    invoke-virtual {v11}, Lcom/kubi/assets/entity/AssetTrackEntity;->getBalance()Ljava/math/BigDecimal;

    .line 282
    move-result-object v16

    .line 283
    .line 284
    move-object/from16 v1, v16

    .line 285
    goto :goto_c

    .line 286
    :cond_e
    move-object v1, v15

    .line 287
    .line 288
    .line 289
    :goto_c
    invoke-static {v1, v15, v6, v15}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 290
    move-result-object v1

    .line 291
    .line 292
    .line 293
    invoke-virtual {v14, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 294
    move-result v1

    .line 295
    .line 296
    if-nez v1, :cond_f

    .line 297
    .line 298
    .line 299
    invoke-interface {v10, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    :cond_f
    move-object/from16 v1, p1

    .line 302
    goto :goto_b

    .line 303
    .line 304
    .line 305
    :cond_10
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 306
    move-result v1

    .line 307
    .line 308
    if-nez v1, :cond_11

    .line 309
    .line 310
    new-instance v23, Lcom/kubi/assets/overview/a1;

    .line 311
    .line 312
    .line 313
    invoke-direct/range {v23 .. v23}, Lcom/kubi/assets/overview/a1;-><init>()V

    .line 314
    .line 315
    const/16 v24, 0x1e

    .line 316
    .line 317
    const/16 v25, 0x0

    .line 318
    .line 319
    const-string v18, ","

    .line 320
    .line 321
    const/16 v19, 0x0

    .line 322
    .line 323
    const/16 v20, 0x0

    .line 324
    .line 325
    const/16 v21, 0x0

    .line 326
    .line 327
    const/16 v22, 0x0

    .line 328
    .line 329
    move-object/from16 v17, v10

    .line 330
    .line 331
    .line 332
    invoke-static/range {v17 .. v25}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 333
    move-result-object v12

    .line 334
    .line 335
    :cond_11
    :goto_d
    new-instance v1, Lorg/json/JSONObject;

    .line 336
    .line 337
    .line 338
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 342
    move-result-object v3

    .line 343
    .line 344
    .line 345
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 346
    move-result-object v3

    .line 347
    .line 348
    const-string v6, "totalAssetUnit"

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 352
    .line 353
    sget-object v3, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v3, v2}, Lcom/kubi/assets/overview/b1;->s(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 357
    move-result-object v2

    .line 358
    .line 359
    const-string v6, "accountM"

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 363
    .line 364
    const-string v2, "accountT"

    .line 365
    .line 366
    .line 367
    invoke-virtual {v3, v4}, Lcom/kubi/assets/overview/b1;->s(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 368
    move-result-object v4

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 372
    .line 373
    const-string v2, "accountMA"

    .line 374
    .line 375
    .line 376
    invoke-virtual {v3, v5}, Lcom/kubi/assets/overview/b1;->s(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 377
    move-result-object v4

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 381
    .line 382
    const-string v2, "accountF"

    .line 383
    .line 384
    .line 385
    invoke-virtual {v3, v7}, Lcom/kubi/assets/overview/b1;->s(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 386
    move-result-object v4

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 390
    .line 391
    const-string v2, "accountR"

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3, v8}, Lcom/kubi/assets/overview/b1;->s(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 395
    move-result-object v4

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 399
    .line 400
    const-string v2, "accountFI"

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3, v9}, Lcom/kubi/assets/overview/b1;->s(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 404
    move-result-object v3

    .line 405
    .line 406
    .line 407
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 408
    .line 409
    const-string v2, "maxAssetAccount"

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 413
    .line 414
    sget-object v2, Lcom/kubi/profit/loss/analysis/api/a;->a:Lcom/kubi/profit/loss/analysis/api/a;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2}, Lcom/kubi/profit/loss/analysis/api/a;->c()Ljava/lang/String;

    .line 418
    move-result-object v3

    .line 419
    .line 420
    const-string v4, "-2"

    .line 421
    .line 422
    .line 423
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 424
    move-result v3

    .line 425
    .line 426
    if-nez v3, :cond_12

    .line 427
    .line 428
    const-string v3, "amountChange"

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Lcom/kubi/profit/loss/analysis/api/a;->c()Ljava/lang/String;

    .line 432
    move-result-object v2

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 436
    .line 437
    :cond_12
    const-string v2, "B1overview"

    .line 438
    .line 439
    const-string v3, "1"

    .line 440
    .line 441
    .line 442
    invoke-static {v2, v0, v3, v1}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 443
    return-void

    .line 444
    .line 445
    :cond_13
    move-object/from16 v1, p1

    .line 446
    .line 447
    goto/16 :goto_7
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

.method public final w(I)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 4
    move-result-object v2

    .line 5
    .line 6
    const/16 v4, 0x8

    .line 7
    const/4 v5, 0x0

    .line 8
    .line 9
    const-string v0, "B1overview"

    .line 10
    .line 11
    const-string v1, "coinList"

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v0 .. v5}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 16
    return-void
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

.method public final x(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "eventName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v5, 0x8

    .line 8
    const/4 v6, 0x0

    .line 9
    .line 10
    const-string v1, "B1overview"

    .line 11
    .line 12
    const-string v2, "tab"

    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v3, p1

    .line 15
    .line 16
    .line 17
    invoke-static/range {v1 .. v6}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 18
    return-void
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

.method public final y(I)V
    .locals 6

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    const-string p1, "ongoing"

    .line 8
    :goto_0
    move-object v2, p1

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    const-string p1, "account"

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_1
    const-string p1, "coin"

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :goto_1
    const/16 v4, 0x8

    .line 18
    const/4 v5, 0x0

    .line 19
    .line 20
    const-string v0, "B1overview"

    .line 21
    .line 22
    const-string v1, "TabBtn"

    .line 23
    const/4 v3, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 27
    return-void
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
