.class public final enum Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;
.super Ljava/lang/Enum;
.source "RankHelper.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/spot/quote/market/rank/RankHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MarketRankType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0019\u0008\u0086\u0081\u0002\u0018\u0000 #2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#BK\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u000c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u0010\"\u0004\u0008\u001a\u0010\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;",
        "",
        "topRes",
        "",
        "titleRes",
        "contentRes",
        "textColor",
        "drawBg",
        "Landroid/graphics/drawable/Drawable;",
        "drawableIcon",
        "jumpUri",
        "",
        "rank",
        "<init>",
        "(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;I)V",
        "getTopRes",
        "()I",
        "getTitleRes",
        "getContentRes",
        "getTextColor",
        "getDrawBg",
        "()Landroid/graphics/drawable/Drawable;",
        "getDrawableIcon",
        "getJumpUri",
        "()Ljava/lang/String;",
        "getRank",
        "setRank",
        "(I)V",
        "RANK_SEARCH",
        "RANK_GAIN",
        "RANK_NEW",
        "RANK_HOT",
        "RANK_VOL",
        "RANK_LOSE",
        "RANK_NONE",
        "Companion",
        "SpotLib_googleRelease"
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
.field public static final Companion:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum RANK_GAIN:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

.field public static final enum RANK_HOT:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

.field public static final enum RANK_LOSE:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

.field public static final enum RANK_NEW:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

.field public static final enum RANK_NONE:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

.field public static final enum RANK_SEARCH:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

.field public static final enum RANK_VOL:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

.field public static final synthetic b:[Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

.field public static final synthetic c:Lkotlin/enums/EnumEntries;


# instance fields
.field private final contentRes:I

.field private final drawBg:Landroid/graphics/drawable/Drawable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final drawableIcon:I

.field private final jumpUri:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private rank:I

.field private final textColor:I

.field private final titleRes:I

.field private final topRes:I


# direct methods
.method static constructor <clinit>()V
    .locals 36

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 3
    .line 4
    sget v3, Lcom/kubi/spot/R$string;->rank_hot_search_placeholder:I

    .line 5
    .line 6
    sget v4, Lcom/kubi/spot/R$string;->rank_hot_search_label:I

    .line 7
    .line 8
    sget v5, Lcom/kubi/spot/R$string;->rank_hot_search_desc:I

    .line 9
    .line 10
    sget v6, Lcom/kubi/spot/R$color;->c_ff7c33:I

    .line 11
    .line 12
    sget-object v13, Lcom/kubi/spot/quote/market/rank/RankHelper;->a:Lcom/kubi/spot/quote/market/rank/RankHelper;

    .line 13
    .line 14
    sget v14, Lcom/kubi/spot/R$color;->c_8_ff7c33:I

    .line 15
    .line 16
    .line 17
    invoke-static {v13, v14, v6}, Lcom/kubi/spot/quote/market/rank/RankHelper;->a(Lcom/kubi/spot/quote/market/rank/RankHelper;II)Landroid/graphics/drawable/Drawable;

    .line 18
    move-result-object v7

    .line 19
    .line 20
    sget v8, Lcom/kubi/spot/R$mipmap;->kucoin_ic_rank_search:I

    .line 21
    .line 22
    const-string v15, "discover/rankingList"

    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x2

    .line 25
    const/4 v9, 0x0

    .line 26
    move-object v10, v9

    .line 27
    .line 28
    .line 29
    invoke-static {v13, v15, v1, v2, v10}, Lcom/kubi/spot/quote/market/rank/RankHelper;->c(Lcom/kubi/spot/quote/market/rank/RankHelper;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 30
    move-result-object v9

    .line 31
    .line 32
    const/16 v11, 0x80

    .line 33
    const/4 v12, 0x0

    .line 34
    .line 35
    move/from16 v16, v1

    .line 36
    .line 37
    const-string v1, "RANK_SEARCH"

    .line 38
    .line 39
    move/from16 v17, v2

    .line 40
    const/4 v2, 0x0

    .line 41
    .line 42
    move-object/from16 v18, v10

    .line 43
    const/4 v10, 0x0

    .line 44
    .line 45
    move/from16 v19, v14

    .line 46
    .line 47
    move/from16 v14, v16

    .line 48
    .line 49
    .line 50
    invoke-direct/range {v0 .. v12}, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;-><init>(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    sput-object v0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_SEARCH:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 53
    .line 54
    new-instance v22, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 55
    .line 56
    sget v25, Lcom/kubi/spot/R$string;->rank_gain_placeholder:I

    .line 57
    .line 58
    sget v26, Lcom/kubi/spot/R$string;->rank_gain_label:I

    .line 59
    .line 60
    sget v27, Lcom/kubi/spot/R$string;->rank_gain_desc:I

    .line 61
    .line 62
    sget v0, Lcom/kubi/spot/R$color;->c_ffc050:I

    .line 63
    .line 64
    sget v1, Lcom/kubi/spot/R$color;->c_8_ffc050:I

    .line 65
    .line 66
    .line 67
    invoke-static {v13, v1, v0}, Lcom/kubi/spot/quote/market/rank/RankHelper;->a(Lcom/kubi/spot/quote/market/rank/RankHelper;II)Landroid/graphics/drawable/Drawable;

    .line 68
    move-result-object v29

    .line 69
    .line 70
    sget v30, Lcom/kubi/spot/R$mipmap;->kucoin_ic_rank_gain:I

    .line 71
    const/4 v1, 0x2

    .line 72
    const/4 v2, 0x0

    .line 73
    .line 74
    .line 75
    invoke-static {v13, v15, v14, v1, v2}, Lcom/kubi/spot/quote/market/rank/RankHelper;->c(Lcom/kubi/spot/quote/market/rank/RankHelper;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 76
    move-result-object v31

    .line 77
    .line 78
    const/16 v33, 0x80

    .line 79
    .line 80
    const/16 v34, 0x0

    .line 81
    .line 82
    const-string v23, "RANK_GAIN"

    .line 83
    .line 84
    const/16 v24, 0x1

    .line 85
    .line 86
    const/16 v32, 0x0

    .line 87
    .line 88
    move/from16 v28, v0

    .line 89
    .line 90
    .line 91
    invoke-direct/range {v22 .. v34}, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;-><init>(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 92
    .line 93
    sput-object v22, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_GAIN:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 94
    .line 95
    new-instance v23, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 96
    .line 97
    sget v26, Lcom/kubi/spot/R$string;->rank_new_placeholder:I

    .line 98
    .line 99
    sget v27, Lcom/kubi/spot/R$string;->rank_new_label:I

    .line 100
    .line 101
    sget v28, Lcom/kubi/spot/R$string;->rank_new_desc:I

    .line 102
    .line 103
    sget v0, Lcom/kubi/spot/R$color;->primary:I

    .line 104
    .line 105
    sget v3, Lcom/kubi/spot/R$color;->primary8:I

    .line 106
    .line 107
    .line 108
    invoke-static {v13, v3, v0}, Lcom/kubi/spot/quote/market/rank/RankHelper;->a(Lcom/kubi/spot/quote/market/rank/RankHelper;II)Landroid/graphics/drawable/Drawable;

    .line 109
    move-result-object v30

    .line 110
    .line 111
    sget v31, Lcom/kubi/spot/R$mipmap;->kucoin_ic_rank_new:I

    .line 112
    .line 113
    .line 114
    invoke-static {v13, v15, v14, v1, v2}, Lcom/kubi/spot/quote/market/rank/RankHelper;->c(Lcom/kubi/spot/quote/market/rank/RankHelper;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 115
    move-result-object v32

    .line 116
    .line 117
    const/16 v34, 0x80

    .line 118
    .line 119
    const/16 v35, 0x0

    .line 120
    .line 121
    const-string v24, "RANK_NEW"

    .line 122
    .line 123
    const/16 v25, 0x2

    .line 124
    .line 125
    const/16 v33, 0x0

    .line 126
    .line 127
    move/from16 v29, v0

    .line 128
    .line 129
    .line 130
    invoke-direct/range {v23 .. v35}, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;-><init>(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 131
    .line 132
    sput-object v23, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_NEW:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 133
    .line 134
    new-instance v0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 135
    .line 136
    sget v9, Lcom/kubi/spot/R$string;->rank_hot_placeholder:I

    .line 137
    .line 138
    sget v10, Lcom/kubi/spot/R$string;->rank_hot_label:I

    .line 139
    .line 140
    sget v11, Lcom/kubi/spot/R$string;->rank_hot_desc:I

    .line 141
    .line 142
    move/from16 v3, v19

    .line 143
    .line 144
    .line 145
    invoke-static {v13, v3, v6}, Lcom/kubi/spot/quote/market/rank/RankHelper;->a(Lcom/kubi/spot/quote/market/rank/RankHelper;II)Landroid/graphics/drawable/Drawable;

    .line 146
    move-result-object v3

    .line 147
    .line 148
    sget v4, Lcom/kubi/spot/R$mipmap;->kucoin_ic_rank_hot:I

    .line 149
    move-object v5, v15

    .line 150
    .line 151
    .line 152
    invoke-static {v13, v5, v14, v1, v2}, Lcom/kubi/spot/quote/market/rank/RankHelper;->c(Lcom/kubi/spot/quote/market/rank/RankHelper;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 153
    move-result-object v15

    .line 154
    .line 155
    const/16 v17, 0x80

    .line 156
    .line 157
    const/16 v18, 0x0

    .line 158
    .line 159
    const-string v7, "RANK_HOT"

    .line 160
    const/4 v8, 0x3

    .line 161
    .line 162
    const/16 v16, 0x0

    .line 163
    move v12, v6

    .line 164
    move-object v6, v0

    .line 165
    move-object v0, v13

    .line 166
    move-object v13, v3

    .line 167
    move v3, v14

    .line 168
    move v14, v4

    .line 169
    .line 170
    .line 171
    invoke-direct/range {v6 .. v18}, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;-><init>(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 172
    .line 173
    sput-object v6, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_HOT:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 174
    .line 175
    new-instance v7, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 176
    .line 177
    sget v10, Lcom/kubi/spot/R$string;->rank_vol_placeholder:I

    .line 178
    .line 179
    sget v11, Lcom/kubi/spot/R$string;->rank_vol_label:I

    .line 180
    .line 181
    sget v12, Lcom/kubi/spot/R$string;->rank_vol_desc:I

    .line 182
    .line 183
    sget v13, Lcom/kubi/spot/R$color;->c_ff666f:I

    .line 184
    .line 185
    sget v4, Lcom/kubi/spot/R$color;->c_8_ff666f:I

    .line 186
    .line 187
    .line 188
    invoke-static {v0, v4, v13}, Lcom/kubi/spot/quote/market/rank/RankHelper;->a(Lcom/kubi/spot/quote/market/rank/RankHelper;II)Landroid/graphics/drawable/Drawable;

    .line 189
    move-result-object v14

    .line 190
    .line 191
    sget v15, Lcom/kubi/spot/R$mipmap;->kucoin_ic_rank_vol:I

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v5, v3, v1, v2}, Lcom/kubi/spot/quote/market/rank/RankHelper;->c(Lcom/kubi/spot/quote/market/rank/RankHelper;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 195
    move-result-object v16

    .line 196
    .line 197
    const/16 v18, 0x80

    .line 198
    .line 199
    const/16 v19, 0x0

    .line 200
    .line 201
    const-string v8, "RANK_VOL"

    .line 202
    const/4 v9, 0x4

    .line 203
    .line 204
    const/16 v17, 0x0

    .line 205
    .line 206
    .line 207
    invoke-direct/range {v7 .. v19}, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;-><init>(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 208
    .line 209
    sput-object v7, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_VOL:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 210
    .line 211
    new-instance v8, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 212
    .line 213
    sget v11, Lcom/kubi/spot/R$string;->rank_lose_placeholder:I

    .line 214
    .line 215
    sget v12, Lcom/kubi/spot/R$string;->rank_lose_label:I

    .line 216
    .line 217
    sget v13, Lcom/kubi/spot/R$string;->rank_lose_desc:I

    .line 218
    .line 219
    sget v14, Lcom/kubi/spot/R$color;->c_4e9af8:I

    .line 220
    .line 221
    sget v4, Lcom/kubi/spot/R$color;->c_8_4e9af8:I

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v4, v14}, Lcom/kubi/spot/quote/market/rank/RankHelper;->a(Lcom/kubi/spot/quote/market/rank/RankHelper;II)Landroid/graphics/drawable/Drawable;

    .line 225
    move-result-object v15

    .line 226
    .line 227
    sget v16, Lcom/kubi/spot/R$mipmap;->kucoin_ic_rank_lose:I

    .line 228
    .line 229
    .line 230
    invoke-static {v0, v5, v3, v1, v2}, Lcom/kubi/spot/quote/market/rank/RankHelper;->c(Lcom/kubi/spot/quote/market/rank/RankHelper;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 231
    move-result-object v17

    .line 232
    .line 233
    const/16 v19, 0x80

    .line 234
    .line 235
    const/16 v20, 0x0

    .line 236
    .line 237
    const-string v9, "RANK_LOSE"

    .line 238
    const/4 v10, 0x5

    .line 239
    .line 240
    const/16 v18, 0x0

    .line 241
    .line 242
    .line 243
    invoke-direct/range {v8 .. v20}, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;-><init>(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 244
    .line 245
    sput-object v8, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_LOSE:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 246
    .line 247
    new-instance v9, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 248
    .line 249
    sget v15, Lcom/kubi/spot/R$color;->emphasis:I

    .line 250
    .line 251
    sget v1, Lcom/kubi/spot/R$color;->emphasis8:I

    .line 252
    .line 253
    .line 254
    invoke-static {v0, v1, v15}, Lcom/kubi/spot/quote/market/rank/RankHelper;->a(Lcom/kubi/spot/quote/market/rank/RankHelper;II)Landroid/graphics/drawable/Drawable;

    .line 255
    move-result-object v16

    .line 256
    .line 257
    sget v17, Lcom/kubi/spot/R$mipmap;->kucoin_icon_default_icon:I

    .line 258
    .line 259
    const/16 v20, 0x80

    .line 260
    .line 261
    const/16 v21, 0x0

    .line 262
    .line 263
    const-string v10, "RANK_NONE"

    .line 264
    const/4 v11, 0x6

    .line 265
    const/4 v12, 0x0

    .line 266
    const/4 v13, 0x0

    .line 267
    const/4 v14, 0x0

    .line 268
    .line 269
    const-string v18, ""

    .line 270
    .line 271
    const/16 v19, 0x0

    .line 272
    .line 273
    .line 274
    invoke-direct/range {v9 .. v21}, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;-><init>(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 275
    .line 276
    sput-object v9, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_NONE:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 277
    .line 278
    .line 279
    invoke-static {}, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->a()[Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 280
    move-result-object v0

    .line 281
    .line 282
    sput-object v0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->b:[Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 283
    .line 284
    .line 285
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 286
    move-result-object v0

    .line 287
    .line 288
    sput-object v0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->c:Lkotlin/enums/EnumEntries;

    .line 289
    .line 290
    new-instance v0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType$Companion;

    .line 291
    .line 292
    .line 293
    invoke-direct {v0, v2}, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 294
    .line 295
    sput-object v0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->Companion:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType$Companion;

    .line 296
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Landroid/graphics/drawable/Drawable;",
            "I",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->topRes:I

    .line 3
    iput p4, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->titleRes:I

    .line 4
    iput p5, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->contentRes:I

    .line 5
    iput p6, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->textColor:I

    .line 6
    iput-object p7, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->drawBg:Landroid/graphics/drawable/Drawable;

    .line 7
    iput p8, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->drawableIcon:I

    .line 8
    iput-object p9, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->jumpUri:Ljava/lang/String;

    .line 9
    iput p10, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->rank:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p11

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v11, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    goto :goto_1

    :cond_0
    move/from16 v11, p10

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {v1 .. v11}, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;-><init>(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_SEARCH:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_GAIN:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_NEW:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_HOT:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 9
    .line 10
    sget-object v4, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_VOL:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 11
    .line 12
    sget-object v5, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_LOSE:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 13
    .line 14
    sget-object v6, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->RANK_NONE:Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 15
    .line 16
    .line 17
    filled-new-array/range {v0 .. v6}, [Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 18
    move-result-object v0

    .line 19
    return-object v0
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

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->c:Lkotlin/enums/EnumEntries;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

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
.end method

.method public static values()[Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->b:[Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;

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


# virtual methods
.method public final getContentRes()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->contentRes:I

    .line 3
    return v0
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
.end method

.method public final getDrawBg()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->drawBg:Landroid/graphics/drawable/Drawable;

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
.end method

.method public final getDrawableIcon()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->drawableIcon:I

    .line 3
    return v0
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
.end method

.method public final getJumpUri()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->jumpUri:Ljava/lang/String;

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
.end method

.method public final getRank()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->rank:I

    .line 3
    return v0
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
.end method

.method public final getTextColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->textColor:I

    .line 3
    return v0
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
.end method

.method public final getTitleRes()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->titleRes:I

    .line 3
    return v0
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
.end method

.method public final getTopRes()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->topRes:I

    .line 3
    return v0
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
.end method

.method public final setRank(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;->rank:I

    .line 3
    return-void
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
.end method
