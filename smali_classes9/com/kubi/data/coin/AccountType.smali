.class public final enum Lcom/kubi/data/coin/AccountType;
.super Ljava/lang/Enum;
.source "TransferType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/data/coin/AccountType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/data/coin/AccountType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0019\u0008\u0086\u0081\u0002\u0018\u0000  2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B)\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lcom/kubi/data/coin/AccountType;",
        "",
        "strRes",
        "",
        "nickNameRes",
        "colorString",
        "",
        "supportTransfer",
        "",
        "<init>",
        "(Ljava/lang/String;IIILjava/lang/String;Z)V",
        "getStrRes",
        "()I",
        "getNickNameRes",
        "getColorString",
        "()Ljava/lang/String;",
        "getSupportTransfer",
        "()Z",
        "MAIN",
        "TRADE",
        "UNIFIED",
        "CONTRACT",
        "MARGIN",
        "ISOLATED",
        "FINANCE",
        "SAVINGS",
        "SUB",
        "TRADE_HF",
        "OPTION",
        "LEVER",
        "MINING",
        "UNKNOWN",
        "Companion",
        "LAppRouter_googleRelease"
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
        "SMAP\nTransferType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferType.kt\ncom/kubi/data/coin/AccountType\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,68:1\n17#2,2:69\n17#2,2:71\n17#2,2:73\n17#2,2:75\n*S KotlinDebug\n*F\n+ 1 TransferType.kt\ncom/kubi/data/coin/AccountType\n*L\n36#1:69,2\n39#1:71,2\n44#1:73,2\n47#1:75,2\n*E\n"
    }
.end annotation


# static fields
.field public static final enum CONTRACT:Lcom/kubi/data/coin/AccountType;

.field public static final Companion:Lcom/kubi/data/coin/AccountType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum FINANCE:Lcom/kubi/data/coin/AccountType;

.field public static final enum ISOLATED:Lcom/kubi/data/coin/AccountType;

.field public static final enum LEVER:Lcom/kubi/data/coin/AccountType;

.field public static final enum MAIN:Lcom/kubi/data/coin/AccountType;

.field public static final enum MARGIN:Lcom/kubi/data/coin/AccountType;

.field public static final enum MINING:Lcom/kubi/data/coin/AccountType;

.field public static final enum OPTION:Lcom/kubi/data/coin/AccountType;

.field public static final enum SAVINGS:Lcom/kubi/data/coin/AccountType;

.field public static final enum SUB:Lcom/kubi/data/coin/AccountType;

.field public static final enum TRADE:Lcom/kubi/data/coin/AccountType;

.field public static final enum TRADE_HF:Lcom/kubi/data/coin/AccountType;

.field public static final enum UNIFIED:Lcom/kubi/data/coin/AccountType;

.field public static final enum UNKNOWN:Lcom/kubi/data/coin/AccountType;

.field public static final synthetic b:[Lcom/kubi/data/coin/AccountType;

.field public static final synthetic c:Lkotlin/enums/EnumEntries;


# instance fields
.field private final colorString:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nickNameRes:I

.field private final strRes:I

.field private final supportTransfer:Z


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/data/coin/AccountType;

    .line 3
    .line 4
    sget v3, Lcom/kubi/app/router/R$string;->save_account:I

    .line 5
    .line 6
    sget v4, Lcom/kubi/app/router/R$string;->save_account_label:I

    .line 7
    .line 8
    const-string v5, "#18BB97"

    .line 9
    const/4 v6, 0x1

    .line 10
    .line 11
    const-string v1, "MAIN"

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 16
    .line 17
    sput-object v0, Lcom/kubi/data/coin/AccountType;->MAIN:Lcom/kubi/data/coin/AccountType;

    .line 18
    .line 19
    new-instance v1, Lcom/kubi/data/coin/AccountType;

    .line 20
    .line 21
    sget v4, Lcom/kubi/app/router/R$string;->trade_account:I

    .line 22
    .line 23
    sget v5, Lcom/kubi/app/router/R$string;->trading:I

    .line 24
    .line 25
    const-string v6, "#5C95E8"

    .line 26
    const/4 v7, 0x1

    .line 27
    .line 28
    const-string v2, "TRADE"

    .line 29
    const/4 v3, 0x1

    .line 30
    .line 31
    .line 32
    invoke-direct/range {v1 .. v7}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 33
    .line 34
    sput-object v1, Lcom/kubi/data/coin/AccountType;->TRADE:Lcom/kubi/data/coin/AccountType;

    .line 35
    .line 36
    new-instance v2, Lcom/kubi/data/coin/AccountType;

    .line 37
    .line 38
    sget v5, Lcom/kubi/app/router/R$string;->kc_unify_account:I

    .line 39
    .line 40
    sget v6, Lcom/kubi/app/router/R$string;->title_unify_trading:I

    .line 41
    .line 42
    const-string v7, "#929DBC"

    .line 43
    const/4 v8, 0x1

    .line 44
    .line 45
    const-string v3, "UNIFIED"

    .line 46
    const/4 v4, 0x2

    .line 47
    .line 48
    .line 49
    invoke-direct/range {v2 .. v8}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 50
    .line 51
    sput-object v2, Lcom/kubi/data/coin/AccountType;->UNIFIED:Lcom/kubi/data/coin/AccountType;

    .line 52
    .line 53
    new-instance v3, Lcom/kubi/data/coin/AccountType;

    .line 54
    .line 55
    sget v6, Lcom/kubi/app/router/R$string;->futures_account:I

    .line 56
    .line 57
    sget v7, Lcom/kubi/app/router/R$string;->futures:I

    .line 58
    .line 59
    const-string v8, "#72948A"

    .line 60
    const/4 v9, 0x1

    .line 61
    .line 62
    const-string v4, "CONTRACT"

    .line 63
    const/4 v5, 0x3

    .line 64
    .line 65
    .line 66
    invoke-direct/range {v3 .. v9}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 67
    .line 68
    sput-object v3, Lcom/kubi/data/coin/AccountType;->CONTRACT:Lcom/kubi/data/coin/AccountType;

    .line 69
    .line 70
    new-instance v4, Lcom/kubi/data/coin/AccountType;

    .line 71
    .line 72
    sget v7, Lcom/kubi/app/router/R$string;->margin_whole_account:I

    .line 73
    .line 74
    sget v8, Lcom/kubi/app/router/R$string;->margin_whole:I

    .line 75
    .line 76
    const-string v9, "#7A78E4"

    .line 77
    const/4 v10, 0x1

    .line 78
    .line 79
    const-string v5, "MARGIN"

    .line 80
    const/4 v6, 0x4

    .line 81
    .line 82
    .line 83
    invoke-direct/range {v4 .. v10}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 84
    .line 85
    sput-object v4, Lcom/kubi/data/coin/AccountType;->MARGIN:Lcom/kubi/data/coin/AccountType;

    .line 86
    .line 87
    new-instance v5, Lcom/kubi/data/coin/AccountType;

    .line 88
    .line 89
    sget v8, Lcom/kubi/app/router/R$string;->margin_single_account:I

    .line 90
    .line 91
    sget v9, Lcom/kubi/app/router/R$string;->margin_single:I

    .line 92
    .line 93
    const-string v10, "#7B78E3"

    .line 94
    const/4 v11, 0x1

    .line 95
    .line 96
    const-string v6, "ISOLATED"

    .line 97
    const/4 v7, 0x5

    .line 98
    .line 99
    .line 100
    invoke-direct/range {v5 .. v11}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 101
    .line 102
    sput-object v5, Lcom/kubi/data/coin/AccountType;->ISOLATED:Lcom/kubi/data/coin/AccountType;

    .line 103
    .line 104
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 105
    .line 106
    sget-object v1, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    const-class v3, Ljf/a;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v3, v2}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    if-eqz v2, :cond_0

    .line 119
    .line 120
    check-cast v2, Ljf/a;

    .line 121
    .line 122
    .line 123
    invoke-interface {v2}, Ljf/a;->a()I

    .line 124
    move-result v2

    .line 125
    :goto_0
    move v7, v2

    .line 126
    goto :goto_1

    .line 127
    .line 128
    :cond_0
    sget v2, Lcom/kubi/app/router/R$string;->kc_asset_earn_account:I

    .line 129
    goto :goto_0

    .line 130
    .line 131
    .line 132
    :goto_1
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 133
    move-result-object v2

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v3, v2}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 137
    move-result-object v2

    .line 138
    .line 139
    if-eqz v2, :cond_1

    .line 140
    .line 141
    check-cast v2, Ljf/a;

    .line 142
    .line 143
    .line 144
    invoke-interface {v2}, Ljf/a;->b()I

    .line 145
    move-result v2

    .line 146
    :goto_2
    move v8, v2

    .line 147
    goto :goto_3

    .line 148
    .line 149
    :cond_1
    sget v2, Lcom/kubi/app/router/R$string;->kc_asset_earn:I

    .line 150
    goto :goto_2

    .line 151
    .line 152
    :goto_3
    new-instance v4, Lcom/kubi/data/coin/AccountType;

    .line 153
    .line 154
    const-string v5, "FINANCE"

    .line 155
    const/4 v6, 0x6

    .line 156
    .line 157
    const-string v9, "#8CB2C0"

    .line 158
    const/4 v10, 0x0

    .line 159
    .line 160
    .line 161
    invoke-direct/range {v4 .. v10}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 162
    .line 163
    sput-object v4, Lcom/kubi/data/coin/AccountType;->FINANCE:Lcom/kubi/data/coin/AccountType;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 167
    move-result-object v2

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v3, v2}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 171
    move-result-object v2

    .line 172
    .line 173
    if-eqz v2, :cond_2

    .line 174
    .line 175
    check-cast v2, Ljf/a;

    .line 176
    .line 177
    .line 178
    invoke-interface {v2}, Ljf/a;->a()I

    .line 179
    move-result v2

    .line 180
    :goto_4
    move v7, v2

    .line 181
    goto :goto_5

    .line 182
    .line 183
    :cond_2
    sget v2, Lcom/kubi/app/router/R$string;->kc_asset_earn_account:I

    .line 184
    goto :goto_4

    .line 185
    .line 186
    .line 187
    :goto_5
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 188
    move-result-object v1

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v3, v1}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 192
    move-result-object v0

    .line 193
    .line 194
    if-eqz v0, :cond_3

    .line 195
    .line 196
    check-cast v0, Ljf/a;

    .line 197
    .line 198
    .line 199
    invoke-interface {v0}, Ljf/a;->b()I

    .line 200
    move-result v0

    .line 201
    :goto_6
    move v8, v0

    .line 202
    goto :goto_7

    .line 203
    .line 204
    :cond_3
    sget v0, Lcom/kubi/app/router/R$string;->kc_asset_earn:I

    .line 205
    goto :goto_6

    .line 206
    .line 207
    :goto_7
    new-instance v4, Lcom/kubi/data/coin/AccountType;

    .line 208
    .line 209
    const-string v5, "SAVINGS"

    .line 210
    const/4 v6, 0x7

    .line 211
    .line 212
    const-string v9, "#8CB2C0"

    .line 213
    const/4 v10, 0x1

    .line 214
    .line 215
    .line 216
    invoke-direct/range {v4 .. v10}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 217
    .line 218
    sput-object v4, Lcom/kubi/data/coin/AccountType;->SAVINGS:Lcom/kubi/data/coin/AccountType;

    .line 219
    .line 220
    new-instance v5, Lcom/kubi/data/coin/AccountType;

    .line 221
    .line 222
    sget v8, Lcom/kubi/app/router/R$string;->sub_account:I

    .line 223
    .line 224
    const-string v10, "#929DBC"

    .line 225
    const/4 v11, 0x0

    .line 226
    .line 227
    const-string v6, "SUB"

    .line 228
    .line 229
    const/16 v7, 0x8

    .line 230
    move v9, v8

    .line 231
    .line 232
    .line 233
    invoke-direct/range {v5 .. v11}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 234
    .line 235
    sput-object v5, Lcom/kubi/data/coin/AccountType;->SUB:Lcom/kubi/data/coin/AccountType;

    .line 236
    .line 237
    new-instance v6, Lcom/kubi/data/coin/AccountType;

    .line 238
    .line 239
    sget v9, Lcom/kubi/app/router/R$string;->deposit_account_high:I

    .line 240
    .line 241
    sget v10, Lcom/kubi/app/router/R$string;->pro_account_name:I

    .line 242
    .line 243
    const-string v11, "#929DBC"

    .line 244
    const/4 v12, 0x0

    .line 245
    .line 246
    const-string v7, "TRADE_HF"

    .line 247
    .line 248
    const/16 v8, 0x9

    .line 249
    .line 250
    .line 251
    invoke-direct/range {v6 .. v12}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 252
    .line 253
    sput-object v6, Lcom/kubi/data/coin/AccountType;->TRADE_HF:Lcom/kubi/data/coin/AccountType;

    .line 254
    .line 255
    new-instance v7, Lcom/kubi/data/coin/AccountType;

    .line 256
    .line 257
    sget v10, Lcom/kubi/app/router/R$string;->kc_options_account:I

    .line 258
    .line 259
    sget v11, Lcom/kubi/app/router/R$string;->kc_options_title:I

    .line 260
    .line 261
    const-string v12, "#929DBC"

    .line 262
    const/4 v13, 0x1

    .line 263
    .line 264
    const-string v8, "OPTION"

    .line 265
    .line 266
    const/16 v9, 0xa

    .line 267
    .line 268
    .line 269
    invoke-direct/range {v7 .. v13}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 270
    .line 271
    sput-object v7, Lcom/kubi/data/coin/AccountType;->OPTION:Lcom/kubi/data/coin/AccountType;

    .line 272
    .line 273
    new-instance v0, Lcom/kubi/data/coin/AccountType;

    .line 274
    .line 275
    sget v3, Lcom/kubi/app/router/R$string;->lever_account:I

    .line 276
    .line 277
    sget v4, Lcom/kubi/app/router/R$string;->lever:I

    .line 278
    .line 279
    const-string v5, "#929DBC"

    .line 280
    const/4 v6, 0x0

    .line 281
    .line 282
    const-string v1, "LEVER"

    .line 283
    .line 284
    const/16 v2, 0xb

    .line 285
    .line 286
    .line 287
    invoke-direct/range {v0 .. v6}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 288
    .line 289
    sput-object v0, Lcom/kubi/data/coin/AccountType;->LEVER:Lcom/kubi/data/coin/AccountType;

    .line 290
    .line 291
    new-instance v1, Lcom/kubi/data/coin/AccountType;

    .line 292
    .line 293
    sget v4, Lcom/kubi/app/router/R$string;->kc_account_name_mining:I

    .line 294
    .line 295
    const-string v6, "#929DBC"

    .line 296
    const/4 v7, 0x0

    .line 297
    .line 298
    const-string v2, "MINING"

    .line 299
    .line 300
    const/16 v3, 0xc

    .line 301
    move v5, v4

    .line 302
    .line 303
    .line 304
    invoke-direct/range {v1 .. v7}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 305
    .line 306
    sput-object v1, Lcom/kubi/data/coin/AccountType;->MINING:Lcom/kubi/data/coin/AccountType;

    .line 307
    .line 308
    new-instance v2, Lcom/kubi/data/coin/AccountType;

    .line 309
    .line 310
    sget v5, Lcom/kubi/app/router/R$string;->deposit_other_account:I

    .line 311
    .line 312
    const-string v7, "#929DBC"

    .line 313
    const/4 v8, 0x0

    .line 314
    .line 315
    const-string v3, "UNKNOWN"

    .line 316
    .line 317
    const/16 v4, 0xd

    .line 318
    move v6, v5

    .line 319
    .line 320
    .line 321
    invoke-direct/range {v2 .. v8}, Lcom/kubi/data/coin/AccountType;-><init>(Ljava/lang/String;IIILjava/lang/String;Z)V

    .line 322
    .line 323
    sput-object v2, Lcom/kubi/data/coin/AccountType;->UNKNOWN:Lcom/kubi/data/coin/AccountType;

    .line 324
    .line 325
    .line 326
    invoke-static {}, Lcom/kubi/data/coin/AccountType;->a()[Lcom/kubi/data/coin/AccountType;

    .line 327
    move-result-object v0

    .line 328
    .line 329
    sput-object v0, Lcom/kubi/data/coin/AccountType;->b:[Lcom/kubi/data/coin/AccountType;

    .line 330
    .line 331
    .line 332
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 333
    move-result-object v0

    .line 334
    .line 335
    sput-object v0, Lcom/kubi/data/coin/AccountType;->c:Lkotlin/enums/EnumEntries;

    .line 336
    .line 337
    new-instance v0, Lcom/kubi/data/coin/AccountType$Companion;

    .line 338
    const/4 v1, 0x0

    .line 339
    .line 340
    .line 341
    invoke-direct {v0, v1}, Lcom/kubi/data/coin/AccountType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 342
    .line 343
    sput-object v0, Lcom/kubi/data/coin/AccountType;->Companion:Lcom/kubi/data/coin/AccountType$Companion;

    .line 344
    return-void
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

.method public constructor <init>(Ljava/lang/String;IIILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/kubi/data/coin/AccountType;->strRes:I

    .line 6
    .line 7
    iput p4, p0, Lcom/kubi/data/coin/AccountType;->nickNameRes:I

    .line 8
    .line 9
    iput-object p5, p0, Lcom/kubi/data/coin/AccountType;->colorString:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p6, p0, Lcom/kubi/data/coin/AccountType;->supportTransfer:Z

    .line 12
    return-void
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
.end method

.method public static final synthetic a()[Lcom/kubi/data/coin/AccountType;
    .locals 14

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/AccountType;->MAIN:Lcom/kubi/data/coin/AccountType;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/data/coin/AccountType;->TRADE:Lcom/kubi/data/coin/AccountType;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/data/coin/AccountType;->UNIFIED:Lcom/kubi/data/coin/AccountType;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/data/coin/AccountType;->CONTRACT:Lcom/kubi/data/coin/AccountType;

    .line 9
    .line 10
    sget-object v4, Lcom/kubi/data/coin/AccountType;->MARGIN:Lcom/kubi/data/coin/AccountType;

    .line 11
    .line 12
    sget-object v5, Lcom/kubi/data/coin/AccountType;->ISOLATED:Lcom/kubi/data/coin/AccountType;

    .line 13
    .line 14
    sget-object v6, Lcom/kubi/data/coin/AccountType;->FINANCE:Lcom/kubi/data/coin/AccountType;

    .line 15
    .line 16
    sget-object v7, Lcom/kubi/data/coin/AccountType;->SAVINGS:Lcom/kubi/data/coin/AccountType;

    .line 17
    .line 18
    sget-object v8, Lcom/kubi/data/coin/AccountType;->SUB:Lcom/kubi/data/coin/AccountType;

    .line 19
    .line 20
    sget-object v9, Lcom/kubi/data/coin/AccountType;->TRADE_HF:Lcom/kubi/data/coin/AccountType;

    .line 21
    .line 22
    sget-object v10, Lcom/kubi/data/coin/AccountType;->OPTION:Lcom/kubi/data/coin/AccountType;

    .line 23
    .line 24
    sget-object v11, Lcom/kubi/data/coin/AccountType;->LEVER:Lcom/kubi/data/coin/AccountType;

    .line 25
    .line 26
    sget-object v12, Lcom/kubi/data/coin/AccountType;->MINING:Lcom/kubi/data/coin/AccountType;

    .line 27
    .line 28
    sget-object v13, Lcom/kubi/data/coin/AccountType;->UNKNOWN:Lcom/kubi/data/coin/AccountType;

    .line 29
    .line 30
    .line 31
    filled-new-array/range {v0 .. v13}, [Lcom/kubi/data/coin/AccountType;

    .line 32
    move-result-object v0

    .line 33
    return-object v0
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

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/kubi/data/coin/AccountType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/AccountType;->c:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/data/coin/AccountType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/data/coin/AccountType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/kubi/data/coin/AccountType;

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

.method public static values()[Lcom/kubi/data/coin/AccountType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/AccountType;->b:[Lcom/kubi/data/coin/AccountType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/data/coin/AccountType;

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
.method public final getColorString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/data/coin/AccountType;->colorString:Ljava/lang/String;

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

.method public final getNickNameRes()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/data/coin/AccountType;->nickNameRes:I

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

.method public final getStrRes()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/data/coin/AccountType;->strRes:I

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

.method public final getSupportTransfer()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/data/coin/AccountType;->supportTransfer:Z

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
