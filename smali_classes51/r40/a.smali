.class public final Lr40/a;
.super Ljava/lang/Object;
.source "AllCouponsMapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001e\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000c\u001a\u00060\rj\u0002`\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/kubi/tradingbotkit/business/coupons/map/AllCouponsMapper;",
        "Lcom/kubi/tradingbotkit/mapper/IMapper;",
        "Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;",
        "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;",
        "<init>",
        "()V",
        "map",
        "input",
        "handleShowStrategyName",
        "",
        "rules",
        "Lcom/kubi/tradingbotkit/entity/coupons/Rules;",
        "name",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "showRules",
        "model",
        "TradingBotKitLib_googleRelease"
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
        "SMAP\nAllCouponsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCouponsMapper.kt\ncom/kubi/tradingbotkit/business/coupons/map/AllCouponsMapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,166:1\n216#2,2:167\n*S KotlinDebug\n*F\n+ 1 AllCouponsMapper.kt\ncom/kubi/tradingbotkit/business/coupons/map/AllCouponsMapper\n*L\n60#1:167,2\n*E\n"
    }
.end annotation


# direct methods
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
.end method


# virtual methods
.method public final a(Lcom/kubi/tradingbotkit/entity/coupons/Rules;Ljava/lang/StringBuilder;)V
    .locals 3

    .line 1
    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getScope()Ljava/util/LinkedHashMap;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getStrategyNames()Ljava/util/Map;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    new-instance p1, Ljava/util/HashMap;

    .line 22
    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    move-result v1

    .line 37
    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    const-string v2, "next(...)"

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    check-cast v1, Ljava/util/Map$Entry;

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    check-cast v2, Ljava/lang/CharSequence;

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 65
    move-result v2

    .line 66
    .line 67
    if-nez v2, :cond_3

    .line 68
    goto :goto_0

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 72
    move-result v2

    .line 73
    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    .line 77
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    check-cast v1, Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    goto :goto_0

    .line 89
    .line 90
    :cond_4
    const-string v2, ","

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    check-cast v1, Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    goto :goto_0

    .line 108
    :cond_5
    return-void
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
.end method

.method public b(Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;)Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;
    .locals 30
    .param p1    # Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "input"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    new-instance v3, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;

    .line 12
    .line 13
    .line 14
    const v28, 0xffffff

    .line 15
    .line 16
    const/16 v29, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x0

    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    .line 30
    const/16 v16, 0x0

    .line 31
    .line 32
    const/16 v17, 0x0

    .line 33
    .line 34
    const/16 v18, 0x0

    .line 35
    .line 36
    const/16 v19, 0x0

    .line 37
    .line 38
    const/16 v20, 0x0

    .line 39
    .line 40
    const/16 v21, 0x0

    .line 41
    .line 42
    const/16 v22, 0x0

    .line 43
    .line 44
    const/16 v23, 0x0

    .line 45
    .line 46
    const/16 v24, 0x0

    .line 47
    .line 48
    const/16 v25, 0x0

    .line 49
    .line 50
    const/16 v26, 0x0

    .line 51
    .line 52
    const/16 v27, 0x0

    .line 53
    .line 54
    .line 55
    invoke-direct/range {v3 .. v29}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, v3}, Lr40/a;->c(Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getId()Ljava/lang/String;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setCouponsId(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getName()Ljava/lang/String;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setDiscountTitle(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getRules()Lcom/kubi/tradingbotkit/entity/coupons/Rules;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getRewardPercent()Ljava/math/BigDecimal;

    .line 82
    move-result-object v5

    .line 83
    .line 84
    if-eqz v5, :cond_0

    .line 85
    .line 86
    const/16 v13, 0x7d

    .line 87
    const/4 v14, 0x0

    .line 88
    const/4 v6, 0x0

    .line 89
    const/4 v7, 0x2

    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v9, 0x0

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v11, 0x0

    .line 94
    const/4 v12, 0x0

    .line 95
    .line 96
    .line 97
    invoke-static/range {v5 .. v14}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 98
    move-result-object v2

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    move-object v2, v4

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setDiscountPercentage(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getRules()Lcom/kubi/tradingbotkit/entity/coupons/Rules;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    if-eqz v2, :cond_1

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getRewardPercent()Ljava/math/BigDecimal;

    .line 113
    move-result-object v2

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    move-object v2, v4

    .line 116
    .line 117
    .line 118
    :goto_1
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setDiscountPercentageShowBd(Ljava/math/BigDecimal;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getReceiveTime()Ljava/lang/String;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    if-eqz v2, :cond_2

    .line 125
    .line 126
    .line 127
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 128
    move-result-wide v5

    .line 129
    .line 130
    .line 131
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    move-result-object v2

    .line 133
    goto :goto_2

    .line 134
    :cond_2
    move-object v2, v4

    .line 135
    .line 136
    .line 137
    :goto_2
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 138
    move-result-wide v5

    .line 139
    .line 140
    .line 141
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 142
    move-result-object v2

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setReceiveTime(Ljava/lang/Long;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->getReceiveTime()Ljava/lang/Long;

    .line 149
    move-result-object v2

    .line 150
    .line 151
    .line 152
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 153
    move-result-wide v5

    .line 154
    .line 155
    const/16 v11, 0xf

    .line 156
    const/4 v12, 0x0

    .line 157
    const/4 v7, 0x0

    .line 158
    const/4 v8, 0x0

    .line 159
    const/4 v9, 0x0

    .line 160
    const/4 v10, 0x0

    .line 161
    .line 162
    .line 163
    invoke-static/range {v5 .. v12}, Llf/a;->b(JLjava/util/Locale;ZLjava/util/TimeZone;ZILjava/lang/Object;)Ljava/lang/String;

    .line 164
    move-result-object v2

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setDiscountReceiveDateScope(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getExpirationTime()Ljava/lang/String;

    .line 171
    move-result-object v2

    .line 172
    .line 173
    if-eqz v2, :cond_3

    .line 174
    .line 175
    .line 176
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 177
    move-result-wide v5

    .line 178
    .line 179
    .line 180
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 181
    move-result-object v2

    .line 182
    goto :goto_3

    .line 183
    :cond_3
    move-object v2, v4

    .line 184
    .line 185
    .line 186
    :goto_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 187
    move-result-wide v5

    .line 188
    .line 189
    .line 190
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 191
    move-result-object v2

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setExpirationTime(Ljava/lang/Long;)V

    .line 195
    .line 196
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 197
    .line 198
    sget v5, Lcom/kubi/tradingbotkit/R$string;->kc_tb_coupon_expired:I

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->getExpirationTime()Ljava/lang/Long;

    .line 202
    move-result-object v6

    .line 203
    .line 204
    .line 205
    invoke-static {v6}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 206
    move-result-wide v7

    .line 207
    .line 208
    const/16 v13, 0xf

    .line 209
    const/4 v14, 0x0

    .line 210
    const/4 v9, 0x0

    .line 211
    const/4 v10, 0x0

    .line 212
    const/4 v11, 0x0

    .line 213
    const/4 v12, 0x0

    .line 214
    .line 215
    .line 216
    invoke-static/range {v7 .. v14}, Llf/a;->b(JLjava/util/Locale;ZLjava/util/TimeZone;ZILjava/lang/Object;)Ljava/lang/String;

    .line 217
    move-result-object v6

    .line 218
    .line 219
    const-string v7, "(UTC)"

    .line 220
    .line 221
    .line 222
    invoke-static {v6, v7}, Lcom/kubi/tradingbotkit/business/spot/viewmodel/t0;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 223
    move-result-object v6

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 227
    move-result-object v6

    .line 228
    .line 229
    .line 230
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 231
    move-result-object v6

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v5, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 235
    move-result-object v5

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3, v5}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setDiscountExpireDate(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->getExpirationTime()Ljava/lang/Long;

    .line 242
    move-result-object v5

    .line 243
    .line 244
    .line 245
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 246
    move-result-wide v8

    .line 247
    .line 248
    const/16 v14, 0xf

    .line 249
    const/4 v15, 0x0

    .line 250
    const/4 v10, 0x0

    .line 251
    const/4 v11, 0x0

    .line 252
    const/4 v12, 0x0

    .line 253
    const/4 v13, 0x0

    .line 254
    .line 255
    .line 256
    invoke-static/range {v8 .. v15}, Llf/a;->b(JLjava/util/Locale;ZLjava/util/TimeZone;ZILjava/lang/Object;)Ljava/lang/String;

    .line 257
    move-result-object v5

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v5}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setDiscountExpireDateScope(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getRules()Lcom/kubi/tradingbotkit/entity/coupons/Rules;

    .line 264
    move-result-object v5

    .line 265
    .line 266
    if-eqz v5, :cond_4

    .line 267
    .line 268
    .line 269
    invoke-virtual {v5}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getScope()Ljava/util/LinkedHashMap;

    .line 270
    move-result-object v5

    .line 271
    .line 272
    if-eqz v5, :cond_4

    .line 273
    .line 274
    .line 275
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 276
    move-result-object v5

    .line 277
    .line 278
    if-eqz v5, :cond_4

    .line 279
    .line 280
    .line 281
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 282
    move-result-object v5

    .line 283
    goto :goto_4

    .line 284
    :cond_4
    move-object v5, v4

    .line 285
    .line 286
    .line 287
    :goto_4
    invoke-virtual {v3, v5}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setSupportTypeCode(Ljava/util/List;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getRules()Lcom/kubi/tradingbotkit/entity/coupons/Rules;

    .line 291
    move-result-object v5

    .line 292
    .line 293
    if-eqz v5, :cond_5

    .line 294
    .line 295
    .line 296
    invoke-virtual {v5}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getStrategyNames()Ljava/util/Map;

    .line 297
    move-result-object v5

    .line 298
    .line 299
    if-eqz v5, :cond_5

    .line 300
    .line 301
    .line 302
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 303
    move-result-object v5

    .line 304
    .line 305
    if-eqz v5, :cond_5

    .line 306
    .line 307
    .line 308
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 309
    move-result-object v5

    .line 310
    goto :goto_5

    .line 311
    :cond_5
    move-object v5, v4

    .line 312
    :goto_5
    const/4 v6, 0x0

    .line 313
    .line 314
    if-eqz v5, :cond_7

    .line 315
    .line 316
    .line 317
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 318
    move-result v5

    .line 319
    .line 320
    if-eqz v5, :cond_6

    .line 321
    goto :goto_6

    .line 322
    .line 323
    .line 324
    :cond_6
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getRules()Lcom/kubi/tradingbotkit/entity/coupons/Rules;

    .line 325
    move-result-object v5

    .line 326
    .line 327
    new-instance v8, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v5, v8}, Lr40/a;->a(Lcom/kubi/tradingbotkit/entity/coupons/Rules;Ljava/lang/StringBuilder;)V

    .line 334
    .line 335
    sget v5, Lcom/kubi/tradingbotkit/R$string;->kc_tb_coupon_only_scope:I

    .line 336
    .line 337
    .line 338
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    move-result-object v8

    .line 340
    .line 341
    .line 342
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 343
    move-result-object v8

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v5, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 347
    move-result-object v2

    .line 348
    goto :goto_7

    .line 349
    .line 350
    :cond_7
    :goto_6
    sget v5, Lcom/kubi/tradingbotkit/R$string;->kc_tb_coupon_all_scope:I

    .line 351
    .line 352
    new-array v8, v6, [Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v5, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 356
    move-result-object v2

    .line 357
    .line 358
    .line 359
    :goto_7
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setShowTypeName(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getRules()Lcom/kubi/tradingbotkit/entity/coupons/Rules;

    .line 363
    move-result-object v2

    .line 364
    const/4 v5, 0x1

    .line 365
    .line 366
    if-eqz v2, :cond_a

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getScope()Ljava/util/LinkedHashMap;

    .line 370
    move-result-object v2

    .line 371
    .line 372
    if-eqz v2, :cond_a

    .line 373
    .line 374
    .line 375
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 376
    move-result-object v2

    .line 377
    .line 378
    .line 379
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 380
    move-result-object v2

    .line 381
    :goto_8
    move v8, v5

    .line 382
    .line 383
    .line 384
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 385
    move-result v9

    .line 386
    .line 387
    if-eqz v9, :cond_9

    .line 388
    .line 389
    .line 390
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 391
    move-result-object v9

    .line 392
    .line 393
    check-cast v9, Ljava/util/Map$Entry;

    .line 394
    .line 395
    if-eqz v8, :cond_8

    .line 396
    .line 397
    .line 398
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 399
    move-result-object v8

    .line 400
    .line 401
    check-cast v8, Ljava/util/List;

    .line 402
    .line 403
    .line 404
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 405
    move-result v8

    .line 406
    .line 407
    if-eqz v8, :cond_8

    .line 408
    goto :goto_8

    .line 409
    :cond_8
    move v8, v6

    .line 410
    goto :goto_9

    .line 411
    :cond_9
    move v5, v8

    .line 412
    .line 413
    :cond_a
    if-eqz v5, :cond_b

    .line 414
    .line 415
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 416
    .line 417
    sget v5, Lcom/kubi/tradingbotkit/R$string;->kc_tb_coupon_support_all:I

    .line 418
    .line 419
    new-array v8, v6, [Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2, v5, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 423
    move-result-object v2

    .line 424
    goto :goto_a

    .line 425
    .line 426
    :cond_b
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 427
    .line 428
    sget v5, Lcom/kubi/tradingbotkit/R$string;->kc_tb_coupon_support_part:I

    .line 429
    .line 430
    new-array v8, v6, [Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v5, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 434
    move-result-object v2

    .line 435
    .line 436
    .line 437
    :goto_a
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setShowSupportSymbol(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getRules()Lcom/kubi/tradingbotkit/entity/coupons/Rules;

    .line 441
    move-result-object v2

    .line 442
    .line 443
    if-eqz v2, :cond_c

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getMaxReward()Ljava/math/BigDecimal;

    .line 447
    move-result-object v2

    .line 448
    goto :goto_b

    .line 449
    :cond_c
    move-object v2, v4

    .line 450
    .line 451
    .line 452
    :goto_b
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setMaxReward(Ljava/math/BigDecimal;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getRules()Lcom/kubi/tradingbotkit/entity/coupons/Rules;

    .line 456
    move-result-object v2

    .line 457
    .line 458
    if-eqz v2, :cond_d

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getRewardSeconds()Ljava/math/BigDecimal;

    .line 462
    move-result-object v2

    .line 463
    goto :goto_c

    .line 464
    :cond_d
    move-object v2, v4

    .line 465
    .line 466
    :goto_c
    const-string v5, "0"

    .line 467
    .line 468
    .line 469
    invoke-static {v2, v5}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 470
    move-result-object v2

    .line 471
    .line 472
    .line 473
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setRewardSeconds(Ljava/math/BigDecimal;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getRules()Lcom/kubi/tradingbotkit/entity/coupons/Rules;

    .line 477
    move-result-object v2

    .line 478
    .line 479
    if-eqz v2, :cond_e

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getMinTotalInvestments()Ljava/math/BigDecimal;

    .line 483
    move-result-object v2

    .line 484
    goto :goto_d

    .line 485
    :cond_e
    move-object v2, v4

    .line 486
    .line 487
    .line 488
    :goto_d
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setMinTotalInvestments(Ljava/math/BigDecimal;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v3}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->getMinTotalInvestments()Ljava/math/BigDecimal;

    .line 492
    move-result-object v8

    .line 493
    .line 494
    if-eqz v8, :cond_f

    .line 495
    .line 496
    const/16 v17, 0xfe

    .line 497
    .line 498
    const/16 v18, 0x0

    .line 499
    .line 500
    const-string v9, "USDT"

    .line 501
    const/4 v10, 0x0

    .line 502
    const/4 v11, 0x0

    .line 503
    const/4 v12, 0x0

    .line 504
    const/4 v13, 0x0

    .line 505
    const/4 v14, 0x0

    .line 506
    const/4 v15, 0x0

    .line 507
    .line 508
    const/16 v16, 0x0

    .line 509
    .line 510
    .line 511
    invoke-static/range {v8 .. v18}, Lgf/j;->b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;

    .line 512
    move-result-object v4

    .line 513
    .line 514
    .line 515
    :cond_f
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 516
    move-result-object v2

    .line 517
    .line 518
    sget-object v4, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 519
    .line 520
    sget v5, Lcom/kubi/tradingbotkit/R$string;->kc_tb_coupon_least_invest:I

    .line 521
    .line 522
    const-string v8, "USDT"

    .line 523
    .line 524
    .line 525
    invoke-static {v2, v8}, Lcom/kubi/tradingbotkit/business/spot/viewmodel/t0;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 526
    move-result-object v2

    .line 527
    .line 528
    .line 529
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 530
    move-result-object v2

    .line 531
    .line 532
    .line 533
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 534
    move-result-object v2

    .line 535
    .line 536
    .line 537
    invoke-virtual {v4, v5, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 538
    move-result-object v2

    .line 539
    .line 540
    sget v5, Lcom/kubi/tradingbotkit/R$string;->kc_tb_coupon_validity_scope:I

    .line 541
    .line 542
    .line 543
    invoke-virtual {v3}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->getDiscountReceiveDateScope()Ljava/lang/String;

    .line 544
    move-result-object v8

    .line 545
    .line 546
    .line 547
    invoke-virtual {v3}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->getDiscountExpireDateScope()Ljava/lang/String;

    .line 548
    move-result-object v9

    .line 549
    .line 550
    .line 551
    invoke-static {v9}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 552
    move-result-object v9

    .line 553
    .line 554
    .line 555
    invoke-static {v9, v7}, Lcom/kubi/tradingbotkit/business/spot/viewmodel/t0;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 556
    move-result-object v7

    .line 557
    .line 558
    .line 559
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 560
    move-result-object v7

    .line 561
    .line 562
    .line 563
    filled-new-array {v8, v7}, [Ljava/lang/Object;

    .line 564
    move-result-object v7

    .line 565
    .line 566
    .line 567
    invoke-virtual {v4, v5, v7}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 568
    move-result-object v5

    .line 569
    .line 570
    .line 571
    invoke-virtual {v3, v5}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setValidityPeriod(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getUnUsableReason()Ljava/lang/String;

    .line 575
    move-result-object v5

    .line 576
    .line 577
    .line 578
    invoke-virtual {v3, v5}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setUnUsableReason(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v3}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->getUnUsableReason()Ljava/lang/String;

    .line 582
    move-result-object v5

    .line 583
    .line 584
    if-eqz v5, :cond_17

    .line 585
    .line 586
    .line 587
    invoke-virtual {v3}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->getUnUsableReason()Ljava/lang/String;

    .line 588
    move-result-object v5

    .line 589
    .line 590
    if-eqz v5, :cond_16

    .line 591
    .line 592
    .line 593
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 594
    move-result v7

    .line 595
    .line 596
    .line 597
    const v8, -0x701be12d

    .line 598
    .line 599
    if-eq v7, v8, :cond_14

    .line 600
    .line 601
    .line 602
    const v2, -0x6d539668

    .line 603
    .line 604
    if-eq v7, v2, :cond_12

    .line 605
    .line 606
    .line 607
    const v2, -0x66ca6c8d

    .line 608
    .line 609
    if-eq v7, v2, :cond_10

    .line 610
    goto :goto_e

    .line 611
    .line 612
    :cond_10
    const-string v2, "STRATEGY"

    .line 613
    .line 614
    .line 615
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 616
    move-result v2

    .line 617
    .line 618
    if-nez v2, :cond_11

    .line 619
    goto :goto_e

    .line 620
    .line 621
    .line 622
    :cond_11
    invoke-virtual {v3}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->getShowTypeName()Ljava/lang/String;

    .line 623
    move-result-object v2

    .line 624
    .line 625
    .line 626
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setUnUsableReasonShow(Ljava/lang/String;)V

    .line 627
    goto :goto_f

    .line 628
    .line 629
    :cond_12
    const-string v2, "SYMBOL"

    .line 630
    .line 631
    .line 632
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 633
    move-result v2

    .line 634
    .line 635
    if-nez v2, :cond_13

    .line 636
    goto :goto_e

    .line 637
    .line 638
    .line 639
    :cond_13
    invoke-virtual {v3}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->getShowSupportSymbol()Ljava/lang/String;

    .line 640
    move-result-object v2

    .line 641
    .line 642
    .line 643
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setUnUsableReasonShow(Ljava/lang/String;)V

    .line 644
    goto :goto_f

    .line 645
    .line 646
    :cond_14
    const-string v7, "INVESTMENT"

    .line 647
    .line 648
    .line 649
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 650
    move-result v5

    .line 651
    .line 652
    if-nez v5, :cond_15

    .line 653
    goto :goto_e

    .line 654
    .line 655
    .line 656
    :cond_15
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setUnUsableReasonShow(Ljava/lang/String;)V

    .line 657
    goto :goto_f

    .line 658
    .line 659
    :cond_16
    :goto_e
    sget v2, Lcom/kubi/tradingbotkit/R$string;->kc_tb_unknown_tip:I

    .line 660
    .line 661
    new-array v5, v6, [Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v4, v2, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 665
    move-result-object v2

    .line 666
    .line 667
    .line 668
    invoke-virtual {v3, v2}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setUnUsableReasonShow(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    :cond_17
    :goto_f
    invoke-virtual {v0, v1, v3}, Lr40/a;->c(Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;)V

    .line 672
    return-object v3
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
.end method

.method public final c(Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;->getRules()Lcom/kubi/tradingbotkit/entity/coupons/Rules;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    new-instance v0, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;

    .line 9
    .line 10
    const/16 v9, 0xff

    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v0 .. v10}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;-><init>(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/LinkedHashMap;Ljava/util/Map;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getMaxReward()Ljava/math/BigDecimal;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;->setMaxReward(Ljava/math/BigDecimal;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getMinTotalInvestments()Ljava/math/BigDecimal;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;->setMinTotalInvestments(Ljava/math/BigDecimal;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getRewardCurrency()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;->setRewardCurrency(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getRewardPercent()Ljava/math/BigDecimal;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;->setRewardPercent(Ljava/math/BigDecimal;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getRewardSeconds()Ljava/math/BigDecimal;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;->setRewardSeconds(Ljava/math/BigDecimal;)V

    .line 58
    .line 59
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getScope()Ljava/util/LinkedHashMap;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    move-result v3

    .line 81
    .line 82
    if-eqz v3, :cond_1

    .line 83
    .line 84
    .line 85
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    const-string v4, "next(...)"

    .line 89
    .line 90
    .line 91
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    check-cast v3, Ljava/util/Map$Entry;

    .line 94
    .line 95
    new-instance v4, Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 102
    move-result-object v5

    .line 103
    .line 104
    check-cast v5, Ljava/util/List;

    .line 105
    .line 106
    .line 107
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 108
    move-result-object v5

    .line 109
    .line 110
    .line 111
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    move-result v6

    .line 113
    .line 114
    if-eqz v6, :cond_0

    .line 115
    .line 116
    .line 117
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    move-result-object v6

    .line 119
    .line 120
    check-cast v6, Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    goto :goto_1

    .line 125
    .line 126
    .line 127
    :cond_0
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 128
    move-result-object v3

    .line 129
    .line 130
    .line 131
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    goto :goto_0

    .line 133
    .line 134
    .line 135
    :cond_1
    invoke-virtual {v0, v1}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;->setScope(Ljava/util/LinkedHashMap;)V

    .line 136
    .line 137
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 138
    .line 139
    .line 140
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getStrategyNames()Ljava/util/Map;

    .line 144
    move-result-object v2

    .line 145
    .line 146
    if-eqz v2, :cond_2

    .line 147
    .line 148
    .line 149
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 150
    move-result-object v2

    .line 151
    .line 152
    .line 153
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 154
    move-result-object v2

    .line 155
    .line 156
    .line 157
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    move-result v3

    .line 159
    .line 160
    if-eqz v3, :cond_2

    .line 161
    .line 162
    .line 163
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    move-result-object v3

    .line 165
    .line 166
    check-cast v3, Ljava/util/Map$Entry;

    .line 167
    .line 168
    .line 169
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 170
    move-result-object v4

    .line 171
    .line 172
    .line 173
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 174
    move-result-object v3

    .line 175
    .line 176
    .line 177
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    goto :goto_2

    .line 179
    .line 180
    .line 181
    :cond_2
    invoke-virtual {v0, v1}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;->setStrategyNames(Ljava/util/Map;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1}, Lcom/kubi/tradingbotkit/entity/coupons/Rules;->getValidPeriodSeconds()Ljava/lang/Long;

    .line 185
    move-result-object p1

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, p1}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;->setValidPeriodSeconds(Ljava/lang/Long;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, v0}, Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;->setRules(Lcom/kubi/tradingbotkit/model/AllCouponsItemModel$Rules;)V

    .line 192
    :cond_3
    return-void
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
.end method
