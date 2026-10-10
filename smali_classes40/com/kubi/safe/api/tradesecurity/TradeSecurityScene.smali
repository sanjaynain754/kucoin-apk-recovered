.class public final enum Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;
.super Ljava/lang/Enum;
.source "TradeSecurityScene.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SPOT_SUBMIT",
        "MARGIN_SUBMIT",
        "TRADE_CORE_SUBMIT",
        "CONTRACT_SUBMIT",
        "CONTRACT_AMEND",
        "CONTRACT_STOP_PROFIT_LOSS",
        "SPOT_AMEND",
        "MARGIN_AMEND",
        "MARGIN_ISOLATED_CLOSE",
        "MARGIN_CROSS_CLOSE",
        "UTA_CONTRACT_SUBMIT",
        "SafeApi_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum CONTRACT_AMEND:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final enum CONTRACT_STOP_PROFIT_LOSS:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final enum CONTRACT_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final enum MARGIN_AMEND:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final enum MARGIN_CROSS_CLOSE:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final enum MARGIN_ISOLATED_CLOSE:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final enum MARGIN_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final enum SPOT_AMEND:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final enum SPOT_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final enum TRADE_CORE_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final enum UTA_CONTRACT_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final synthetic b:[Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

.field public static final synthetic c:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 3
    .line 4
    const-string v1, "SPOT_SUBMIT"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->SPOT_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 13
    .line 14
    const-string v1, "MARGIN_SUBMIT"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->MARGIN_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 21
    .line 22
    new-instance v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 23
    .line 24
    const-string v1, "TRADE_CORE_SUBMIT"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->TRADE_CORE_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 31
    .line 32
    new-instance v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 33
    .line 34
    const-string v1, "CONTRACT_SUBMIT"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->CONTRACT_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 41
    .line 42
    new-instance v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 43
    .line 44
    const-string v1, "CONTRACT_AMEND"

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->CONTRACT_AMEND:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 51
    .line 52
    new-instance v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 53
    .line 54
    const-string v1, "CONTRACT_STOP_PROFIT_LOSS"

    .line 55
    const/4 v2, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1, v2}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->CONTRACT_STOP_PROFIT_LOSS:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 61
    .line 62
    new-instance v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 63
    .line 64
    const-string v1, "SPOT_AMEND"

    .line 65
    const/4 v2, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1, v2}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;-><init>(Ljava/lang/String;I)V

    .line 69
    .line 70
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->SPOT_AMEND:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 71
    .line 72
    new-instance v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 73
    .line 74
    const-string v1, "MARGIN_AMEND"

    .line 75
    const/4 v2, 0x7

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, v1, v2}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;-><init>(Ljava/lang/String;I)V

    .line 79
    .line 80
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->MARGIN_AMEND:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 81
    .line 82
    new-instance v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 83
    .line 84
    const-string v1, "MARGIN_ISOLATED_CLOSE"

    .line 85
    .line 86
    const/16 v2, 0x8

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, v1, v2}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;-><init>(Ljava/lang/String;I)V

    .line 90
    .line 91
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->MARGIN_ISOLATED_CLOSE:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 92
    .line 93
    new-instance v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 94
    .line 95
    const-string v1, "MARGIN_CROSS_CLOSE"

    .line 96
    .line 97
    const/16 v2, 0x9

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, v1, v2}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;-><init>(Ljava/lang/String;I)V

    .line 101
    .line 102
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->MARGIN_CROSS_CLOSE:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 103
    .line 104
    new-instance v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 105
    .line 106
    const-string v1, "UTA_CONTRACT_SUBMIT"

    .line 107
    .line 108
    const/16 v2, 0xa

    .line 109
    .line 110
    .line 111
    invoke-direct {v0, v1, v2}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;-><init>(Ljava/lang/String;I)V

    .line 112
    .line 113
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->UTA_CONTRACT_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->a()[Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->b:[Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    sput-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->c:Lkotlin/enums/EnumEntries;

    .line 126
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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
.end method

.method public static final synthetic a()[Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->SPOT_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->MARGIN_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->TRADE_CORE_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->CONTRACT_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 9
    .line 10
    sget-object v4, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->CONTRACT_AMEND:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 11
    .line 12
    sget-object v5, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->CONTRACT_STOP_PROFIT_LOSS:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 13
    .line 14
    sget-object v6, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->SPOT_AMEND:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 15
    .line 16
    sget-object v7, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->MARGIN_AMEND:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 17
    .line 18
    sget-object v8, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->MARGIN_ISOLATED_CLOSE:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 19
    .line 20
    sget-object v9, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->MARGIN_CROSS_CLOSE:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 21
    .line 22
    sget-object v10, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->UTA_CONTRACT_SUBMIT:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 23
    .line 24
    .line 25
    filled-new-array/range {v0 .. v10}, [Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 26
    move-result-object v0

    .line 27
    return-object v0
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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->c:Lkotlin/enums/EnumEntries;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 9
    return-object p0
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
.end method

.method public static values()[Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->b:[Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

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
.end method
