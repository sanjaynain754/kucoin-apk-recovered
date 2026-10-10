.class public final Lte/a;
.super Ljava/lang/Object;
.source "WsRecentDealEntity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toTradeCoreWsRecentDealEntity",
        "Lcom/kubi/core/spot/entity/WsRecentDealEntity;",
        "Lcom/kubi/kucoin/manager/SpotMatchPushEntity;",
        "TradeCoreBizLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/kubi/kucoin/manager/SpotMatchPushEntity;)Lcom/kubi/core/spot/entity/WsRecentDealEntity;
    .locals 18
    .param p0    # Lcom/kubi/kucoin/manager/SpotMatchPushEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/core/spot/entity/WsRecentDealEntity;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getSequence()J

    .line 13
    move-result-wide v2

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getSymbol()Ljava/lang/String;

    .line 17
    move-result-object v4

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getSide()Ljava/lang/String;

    .line 21
    move-result-object v5

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getSize()Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    const-wide/16 v6, 0x0

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 37
    move-result-wide v8

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-wide v8, v6

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getPrice()Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 53
    move-result-wide v6

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getTakerOrderId()Ljava/lang/String;

    .line 57
    move-result-object v10

    .line 58
    .line 59
    .line 60
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getTime()J

    .line 61
    move-result-wide v11

    .line 62
    .line 63
    .line 64
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getType()Ljava/lang/String;

    .line 65
    move-result-object v13

    .line 66
    .line 67
    .line 68
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getMakerOrderId()Ljava/lang/String;

    .line 69
    move-result-object v14

    .line 70
    .line 71
    .line 72
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getTradeId()Ljava/lang/String;

    .line 73
    move-result-object v15

    .line 74
    .line 75
    move-wide/from16 v16, v8

    .line 76
    move-wide v8, v6

    .line 77
    .line 78
    move-wide/from16 v6, v16

    .line 79
    .line 80
    .line 81
    invoke-direct/range {v1 .. v15}, Lcom/kubi/core/spot/entity/WsRecentDealEntity;-><init>(JLjava/lang/String;Ljava/lang/String;DDLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    return-object v1
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
.end method
