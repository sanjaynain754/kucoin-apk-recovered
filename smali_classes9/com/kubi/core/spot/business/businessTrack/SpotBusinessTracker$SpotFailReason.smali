.class public final enum Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;
.super Ljava/lang/Enum;
.source "SpotBusinessTracker.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SpotFailReason"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0017\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;",
        "",
        "errorCode",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getErrorCode",
        "()I",
        "DOWNTIME",
        "NOT_LOGIN",
        "LEVEL_NOT_OPEN",
        "CURRENCY_STOP",
        "TRANSACTION_PASS_NOT_SET",
        "NUM_RANGE_ILLEGAL",
        "LIMIT_PRICE_ILLEGAL",
        "BALANCE_INSUFFICIENT",
        "INPUT_PRICE_ILLEGAL",
        "TURNOVER_ILLEGAL",
        "APP_IS_BACKGROUND",
        "LOADING_VIEW_FAILED",
        "PASSWORD_FAILED",
        "UNKNOWN_ERROR",
        "PRICE_RANGE_ILLEGAL",
        "TRADINGSTOP_PRICE_RANGE_ILLEGAL",
        "TRADINGSTOP_PERCENT_RANGE_ILLEGAL",
        "PRICE_PROTECT_CANCEL",
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


# static fields
.field public static final enum APP_IS_BACKGROUND:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum BALANCE_INSUFFICIENT:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum CURRENCY_STOP:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum DOWNTIME:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum INPUT_PRICE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum LEVEL_NOT_OPEN:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum LIMIT_PRICE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum LOADING_VIEW_FAILED:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum NOT_LOGIN:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum NUM_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum PASSWORD_FAILED:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum PRICE_PROTECT_CANCEL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum PRICE_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum TRADINGSTOP_PERCENT_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum TRADINGSTOP_PRICE_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum TRANSACTION_PASS_NOT_SET:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum TURNOVER_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final enum UNKNOWN_ERROR:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final synthetic b:[Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

.field public static final synthetic c:Lkotlin/enums/EnumEntries;


# instance fields
.field private final errorCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const/16 v2, -0x2710

    .line 6
    .line 7
    const-string v3, "DOWNTIME"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 11
    .line 12
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->DOWNTIME:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 13
    .line 14
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    const/16 v2, -0x2711

    .line 18
    .line 19
    const-string v3, "NOT_LOGIN"

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->NOT_LOGIN:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 25
    .line 26
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 27
    const/4 v1, 0x2

    .line 28
    .line 29
    const/16 v2, -0x2712

    .line 30
    .line 31
    const-string v3, "LEVEL_NOT_OPEN"

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 35
    .line 36
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->LEVEL_NOT_OPEN:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 37
    .line 38
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 39
    const/4 v1, 0x3

    .line 40
    .line 41
    const/16 v2, -0x2713

    .line 42
    .line 43
    const-string v3, "CURRENCY_STOP"

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->CURRENCY_STOP:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 49
    .line 50
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 51
    const/4 v1, 0x4

    .line 52
    .line 53
    const/16 v2, -0x271d

    .line 54
    .line 55
    const-string v3, "TRANSACTION_PASS_NOT_SET"

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->TRANSACTION_PASS_NOT_SET:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 61
    .line 62
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 63
    const/4 v1, 0x5

    .line 64
    .line 65
    const/16 v2, -0x2714

    .line 66
    .line 67
    const-string v3, "NUM_RANGE_ILLEGAL"

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 71
    .line 72
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->NUM_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 73
    .line 74
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 75
    const/4 v1, 0x6

    .line 76
    .line 77
    const/16 v2, -0x2715

    .line 78
    .line 79
    const-string v3, "LIMIT_PRICE_ILLEGAL"

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 83
    .line 84
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->LIMIT_PRICE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 85
    .line 86
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 87
    const/4 v1, 0x7

    .line 88
    .line 89
    const/16 v2, -0x2716

    .line 90
    .line 91
    const-string v3, "BALANCE_INSUFFICIENT"

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 95
    .line 96
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->BALANCE_INSUFFICIENT:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 97
    .line 98
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 99
    .line 100
    const/16 v1, 0x8

    .line 101
    .line 102
    const/16 v2, -0x2717

    .line 103
    .line 104
    const-string v3, "INPUT_PRICE_ILLEGAL"

    .line 105
    .line 106
    .line 107
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 108
    .line 109
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->INPUT_PRICE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 110
    .line 111
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 112
    .line 113
    const/16 v1, 0x9

    .line 114
    .line 115
    const/16 v2, -0x2718

    .line 116
    .line 117
    const-string v3, "TURNOVER_ILLEGAL"

    .line 118
    .line 119
    .line 120
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 121
    .line 122
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->TURNOVER_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 123
    .line 124
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 125
    .line 126
    const/16 v1, 0xa

    .line 127
    .line 128
    const/16 v2, -0x2719

    .line 129
    .line 130
    const-string v3, "APP_IS_BACKGROUND"

    .line 131
    .line 132
    .line 133
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 134
    .line 135
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->APP_IS_BACKGROUND:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 136
    .line 137
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 138
    .line 139
    const/16 v1, 0xb

    .line 140
    .line 141
    const/16 v2, -0x271a

    .line 142
    .line 143
    const-string v3, "LOADING_VIEW_FAILED"

    .line 144
    .line 145
    .line 146
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 147
    .line 148
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->LOADING_VIEW_FAILED:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 149
    .line 150
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 151
    .line 152
    const/16 v1, 0xc

    .line 153
    .line 154
    const/16 v2, -0x271b

    .line 155
    .line 156
    const-string v3, "PASSWORD_FAILED"

    .line 157
    .line 158
    .line 159
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 160
    .line 161
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->PASSWORD_FAILED:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 162
    .line 163
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 164
    .line 165
    const/16 v1, 0xd

    .line 166
    .line 167
    const/16 v2, -0x271c

    .line 168
    .line 169
    const-string v3, "UNKNOWN_ERROR"

    .line 170
    .line 171
    .line 172
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 173
    .line 174
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->UNKNOWN_ERROR:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 175
    .line 176
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 177
    .line 178
    const/16 v1, 0xe

    .line 179
    .line 180
    const/16 v2, -0x271e

    .line 181
    .line 182
    const-string v3, "PRICE_RANGE_ILLEGAL"

    .line 183
    .line 184
    .line 185
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 186
    .line 187
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->PRICE_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 188
    .line 189
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 190
    .line 191
    const/16 v1, 0xf

    .line 192
    .line 193
    const/16 v2, -0x271f

    .line 194
    .line 195
    const-string v3, "TRADINGSTOP_PRICE_RANGE_ILLEGAL"

    .line 196
    .line 197
    .line 198
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 199
    .line 200
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->TRADINGSTOP_PRICE_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 201
    .line 202
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 203
    .line 204
    const/16 v1, 0x10

    .line 205
    .line 206
    const/16 v2, -0x2720

    .line 207
    .line 208
    const-string v3, "TRADINGSTOP_PERCENT_RANGE_ILLEGAL"

    .line 209
    .line 210
    .line 211
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 212
    .line 213
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->TRADINGSTOP_PERCENT_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 214
    .line 215
    new-instance v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 216
    .line 217
    const/16 v1, 0x11

    .line 218
    .line 219
    const/16 v2, -0x2721

    .line 220
    .line 221
    const-string v3, "PRICE_PROTECT_CANCEL"

    .line 222
    .line 223
    .line 224
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;-><init>(Ljava/lang/String;II)V

    .line 225
    .line 226
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->PRICE_PROTECT_CANCEL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 227
    .line 228
    .line 229
    invoke-static {}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->a()[Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 230
    move-result-object v0

    .line 231
    .line 232
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->b:[Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 233
    .line 234
    .line 235
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 236
    move-result-object v0

    .line 237
    .line 238
    sput-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->c:Lkotlin/enums/EnumEntries;

    .line 239
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->errorCode:I

    .line 6
    return-void
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
.end method

.method public static final synthetic a()[Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;
    .locals 19

    .line 1
    .line 2
    sget-object v1, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->DOWNTIME:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 3
    .line 4
    sget-object v2, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->NOT_LOGIN:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 5
    .line 6
    sget-object v3, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->LEVEL_NOT_OPEN:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 7
    .line 8
    sget-object v4, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->CURRENCY_STOP:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 9
    .line 10
    sget-object v5, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->TRANSACTION_PASS_NOT_SET:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 11
    .line 12
    sget-object v6, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->NUM_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 13
    .line 14
    sget-object v7, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->LIMIT_PRICE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 15
    .line 16
    sget-object v8, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->BALANCE_INSUFFICIENT:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 17
    .line 18
    sget-object v9, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->INPUT_PRICE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 19
    .line 20
    sget-object v10, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->TURNOVER_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 21
    .line 22
    sget-object v11, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->APP_IS_BACKGROUND:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 23
    .line 24
    sget-object v12, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->LOADING_VIEW_FAILED:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 25
    .line 26
    sget-object v13, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->PASSWORD_FAILED:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 27
    .line 28
    sget-object v14, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->UNKNOWN_ERROR:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 29
    .line 30
    sget-object v15, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->PRICE_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 31
    .line 32
    sget-object v16, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->TRADINGSTOP_PRICE_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 33
    .line 34
    sget-object v17, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->TRADINGSTOP_PERCENT_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 35
    .line 36
    sget-object v18, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->PRICE_PROTECT_CANCEL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 37
    .line 38
    .line 39
    filled-new-array/range {v1 .. v18}, [Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 40
    move-result-object v0

    .line 41
    return-object v0
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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->c:Lkotlin/enums/EnumEntries;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

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

.method public static values()[Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->b:[Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

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
.end method


# virtual methods
.method public final getErrorCode()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->errorCode:I

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
.end method
