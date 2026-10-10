.class public final Lcom/kubi/rn/kline/TradingViewLegacyStorageModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "TradingViewLegacyStorageModule.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/rn/kline/TradingViewLegacyStorageModule;",
        "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "getName",
        "",
        "readSnapshots",
        "",
        "promise",
        "Lcom/facebook/react/bridge/Promise;",
        "BReactNativeLib_googleRelease"
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
        "SMAP\nTradingViewLegacyStorageModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingViewLegacyStorageModule.kt\ncom/kubi/rn/kline/TradingViewLegacyStorageModule\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,63:1\n18#2:64\n*S KotlinDebug\n*F\n+ 1 TradingViewLegacyStorageModule.kt\ncom/kubi/rn/kline/TradingViewLegacyStorageModule\n*L\n43#1:64\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1
    .param p1    # Lcom/facebook/react/bridge/ReactApplicationContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

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
.end method

.method private static final readSnapshots$add(Ljava/util/Set;Lcom/tencent/mmkv/MMKV;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/mmkv/MMKV;",
            "Lorg/json/JSONArray;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "margin"

    .line 3
    .line 4
    const-string v1, "futures"

    .line 5
    .line 6
    const-string v2, "spot"

    .line 7
    .line 8
    .line 9
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    .line 23
    invoke-static {p4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const/16 v1, 0x5f

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const/16 v1, 0x2d

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-interface {p0, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 59
    move-result p0

    .line 60
    .line 61
    if-nez p0, :cond_1

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_1
    if-eqz p1, :cond_3

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/tencent/mmkv/MMKV;->decodeString(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    move-result-object p0

    .line 69
    .line 70
    if-nez p0, :cond_2

    .line 71
    goto :goto_0

    .line 72
    .line 73
    :cond_2
    new-instance p1, Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 77
    .line 78
    const-string v0, "market"

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    const-string p3, "symbol"

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    const-string p3, "userId"

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p3, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    const-string p3, "json"

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p3, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    move-result-object p0

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 104
    :cond_3
    :goto_0
    return-void
    .line 105
    .line 106
    .line 107
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "TradingViewLegacyStorage"

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
.end method

.method public final readSnapshots(Lcom/facebook/react/bridge/Promise;)V
    .locals 26
    .param p1    # Lcom/facebook/react/bridge/Promise;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p1

    .line 3
    .line 4
    const-string v0, "substring(...)"

    .line 5
    .line 6
    const-string v2, "optString(...)"

    .line 7
    .line 8
    const-string v3, "mmkvWithID(...)"

    .line 9
    .line 10
    const-string v4, "promise"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    :try_start_0
    sget-object v4, Lcom/kubi/sdk/site/SiteType;->Companion:Lcom/kubi/sdk/site/SiteType$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4}, Lcom/kubi/sdk/site/SiteType$Companion;->getCurrentSiteType()Ljava/lang/String;

    .line 19
    move-result-object v4

    .line 20
    .line 21
    .line 22
    invoke-static {v4}, Lcom/kubi/sdk/site/e;->a(Ljava/lang/String;)Z

    .line 23
    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    const-string v6, "flutter_tv_chart"

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    :try_start_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    const-string v7, "flutter_tv_chart.site_"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    move-result-object v5

    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception v0

    .line 47
    .line 48
    goto/16 :goto_6

    .line 49
    :cond_0
    move-object v5, v6

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-static {v5}, Lcom/tencent/mmkv/MMKV;->mmkvWithID(Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 53
    move-result-object v8

    .line 54
    .line 55
    .line 56
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v6}, Lcom/tencent/mmkv/MMKV;->mmkvWithID(Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 60
    move-result-object v5

    .line 61
    .line 62
    .line 63
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    new-instance v6, Lorg/json/JSONArray;

    .line 66
    .line 67
    const-string v7, "tv_chart_slots_registry"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v7}, Lcom/tencent/mmkv/MMKV;->decodeString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    move-result-object v7

    .line 72
    .line 73
    if-nez v7, :cond_1

    .line 74
    .line 75
    const-string v7, "[]"

    .line 76
    .line 77
    .line 78
    :cond_1
    invoke-direct {v6, v7}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    new-instance v9, Lorg/json/JSONArray;

    .line 81
    .line 82
    .line 83
    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 84
    .line 85
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 86
    .line 87
    .line 88
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 92
    move-result v13

    .line 93
    const/4 v15, 0x0

    .line 94
    .line 95
    :goto_1
    if-ge v15, v13, :cond_3

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6, v15}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 99
    move-result-object v10

    .line 100
    .line 101
    if-nez v10, :cond_2

    .line 102
    goto :goto_2

    .line 103
    .line 104
    :cond_2
    const-string v11, "businessType"

    .line 105
    .line 106
    .line 107
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    move-result-object v11

    .line 109
    .line 110
    .line 111
    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    const-string v12, "symbol"

    .line 114
    .line 115
    .line 116
    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    move-result-object v12

    .line 118
    .line 119
    .line 120
    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    const-string v14, "userId"

    .line 123
    .line 124
    .line 125
    invoke-virtual {v10, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    move-result-object v10

    .line 127
    .line 128
    .line 129
    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    move-object/from16 v25, v12

    .line 132
    move-object v12, v10

    .line 133
    move-object v10, v11

    .line 134
    .line 135
    move-object/from16 v11, v25

    .line 136
    .line 137
    .line 138
    invoke-static/range {v7 .. v12}, Lcom/kubi/rn/kline/TradingViewLegacyStorageModule;->readSnapshots$add(Ljava/util/Set;Lcom/tencent/mmkv/MMKV;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    :goto_2
    add-int/lit8 v15, v15, 0x1

    .line 141
    goto :goto_1

    .line 142
    .line 143
    :cond_3
    sget-object v2, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Lcom/kubi/user/config/UserInfo;->i()Ljava/lang/String;

    .line 147
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 148
    .line 149
    const-string v6, ""

    .line 150
    .line 151
    if-nez v2, :cond_4

    .line 152
    move-object v2, v6

    .line 153
    .line 154
    .line 155
    :cond_4
    :try_start_2
    filled-new-array {v2, v6}, [Ljava/lang/String;

    .line 156
    move-result-object v2

    .line 157
    .line 158
    .line 159
    invoke-static {v2}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    .line 160
    move-result-object v2

    .line 161
    .line 162
    .line 163
    invoke-virtual {v8}, Lcom/tencent/mmkv/MMKV;->allKeys()[Ljava/lang/String;

    .line 164
    move-result-object v6

    .line 165
    .line 166
    if-nez v6, :cond_5

    .line 167
    const/4 v10, 0x0

    .line 168
    .line 169
    new-array v6, v10, [Ljava/lang/String;

    .line 170
    :cond_5
    array-length v13, v6

    .line 171
    const/4 v14, 0x0

    .line 172
    .line 173
    :goto_3
    if-ge v14, v13, :cond_8

    .line 174
    .line 175
    aget-object v15, v6, v14

    .line 176
    .line 177
    .line 178
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 179
    move-result-object v16

    .line 180
    .line 181
    .line 182
    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    move-result v10

    .line 184
    .line 185
    if-eqz v10, :cond_7

    .line 186
    .line 187
    .line 188
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    move-result-object v10

    .line 190
    move-object v12, v10

    .line 191
    .line 192
    check-cast v12, Ljava/lang/String;

    .line 193
    .line 194
    new-instance v10, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    const/16 v11, 0x2d

    .line 200
    .line 201
    .line 202
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    move-result-object v10

    .line 210
    .line 211
    .line 212
    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 213
    const/4 v11, 0x2

    .line 214
    .line 215
    move-object/from16 v17, v2

    .line 216
    const/4 v2, 0x0

    .line 217
    .line 218
    move-object/from16 v18, v6

    .line 219
    const/4 v6, 0x0

    .line 220
    .line 221
    .line 222
    invoke-static {v15, v10, v6, v11, v2}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 223
    move-result v2

    .line 224
    .line 225
    if-eqz v2, :cond_6

    .line 226
    .line 227
    .line 228
    invoke-static {v15, v10}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 229
    move-result-object v19

    .line 230
    .line 231
    const/16 v23, 0x6

    .line 232
    .line 233
    const/16 v24, 0x0

    .line 234
    .line 235
    const/16 v20, 0x5f

    .line 236
    .line 237
    const/16 v21, 0x0

    .line 238
    .line 239
    const/16 v22, 0x0

    .line 240
    .line 241
    .line 242
    invoke-static/range {v19 .. v24}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 243
    move-result v2

    .line 244
    .line 245
    move-object/from16 v6, v19

    .line 246
    .line 247
    if-lez v2, :cond_6

    .line 248
    const/4 v10, 0x0

    .line 249
    .line 250
    .line 251
    invoke-virtual {v6, v10, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 252
    move-result-object v11

    .line 253
    .line 254
    .line 255
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    add-int/lit8 v2, v2, 0x1

    .line 258
    .line 259
    .line 260
    invoke-virtual {v6, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 261
    move-result-object v2

    .line 262
    .line 263
    .line 264
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    move-object v10, v11

    .line 266
    move-object v11, v2

    .line 267
    .line 268
    .line 269
    invoke-static/range {v7 .. v12}, Lcom/kubi/rn/kline/TradingViewLegacyStorageModule;->readSnapshots$add(Ljava/util/Set;Lcom/tencent/mmkv/MMKV;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    .line 271
    :cond_6
    move-object/from16 v2, v17

    .line 272
    .line 273
    move-object/from16 v6, v18

    .line 274
    goto :goto_4

    .line 275
    .line 276
    :cond_7
    move-object/from16 v17, v2

    .line 277
    .line 278
    move-object/from16 v18, v6

    .line 279
    .line 280
    add-int/lit8 v14, v14, 0x1

    .line 281
    goto :goto_3

    .line 282
    .line 283
    .line 284
    :cond_8
    invoke-static {v4}, Lcom/kubi/sdk/site/e;->a(Ljava/lang/String;)Z

    .line 285
    move-result v0

    .line 286
    .line 287
    if-eqz v0, :cond_9

    .line 288
    .line 289
    new-instance v0, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 293
    .line 294
    const-string v2, "flutter_kline_module.site_"

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    move-result-object v0

    .line 305
    goto :goto_5

    .line 306
    .line 307
    :cond_9
    const-string v0, "flutter_kline_module"

    .line 308
    .line 309
    .line 310
    :goto_5
    invoke-static {v0}, Lcom/tencent/mmkv/MMKV;->mmkvWithID(Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 311
    move-result-object v0

    .line 312
    .line 313
    .line 314
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 315
    .line 316
    new-instance v2, Lorg/json/JSONObject;

    .line 317
    .line 318
    .line 319
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 320
    .line 321
    const-string v3, "site"

    .line 322
    .line 323
    .line 324
    invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 325
    move-result-object v4

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 329
    move-result-object v2

    .line 330
    .line 331
    const-string v3, "snapshots"

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 335
    move-result-object v2

    .line 336
    .line 337
    const-string v3, "firstSeen"

    .line 338
    .line 339
    new-instance v4, Lorg/json/JSONObject;

    .line 340
    .line 341
    const-string v6, "tv_chart_lines_first_seen"

    .line 342
    .line 343
    .line 344
    invoke-virtual {v5, v6}, Lcom/tencent/mmkv/MMKV;->decodeString(Ljava/lang/String;)Ljava/lang/String;

    .line 345
    move-result-object v5

    .line 346
    .line 347
    if-nez v5, :cond_a

    .line 348
    .line 349
    const-string v5, "{}"

    .line 350
    .line 351
    .line 352
    :cond_a
    invoke-direct {v4, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 356
    move-result-object v2

    .line 357
    .line 358
    const-string v3, "settingsVisited"

    .line 359
    .line 360
    const-string v4, "settings_red_dot_clicked_key"

    .line 361
    const/4 v10, 0x0

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v4, v10}, Lcom/tencent/mmkv/MMKV;->decodeBool(Ljava/lang/String;Z)Z

    .line 365
    move-result v0

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 369
    move-result-object v0

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 373
    move-result-object v0

    .line 374
    .line 375
    .line 376
    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 377
    return-void

    .line 378
    .line 379
    :goto_6
    const-string v2, "TV_LEGACY_READ_FAILED"

    .line 380
    .line 381
    const-string v3, "TradingView legacy storage read failed"

    .line 382
    .line 383
    .line 384
    invoke-interface {v1, v2, v3, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 385
    return-void
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
.end method
