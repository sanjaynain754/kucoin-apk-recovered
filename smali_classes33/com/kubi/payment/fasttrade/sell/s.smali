.class public final Lcom/kubi/payment/fasttrade/sell/s;
.super Ljava/lang/Object;
.source "FastSellHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J*\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005J,\u0010\u0010\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010\u0011\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010\u0012\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\u001c\u0010\u0013\u001a\u00020\u00142\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\u0015\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u001b\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/payment/fasttrade/sell/FastSellHelper;",
        "",
        "<init>",
        "()V",
        "PAY_WITH_NEW_BANK_CARD_URL",
        "",
        "UPDATE_BANK_CARD_URL",
        "fastSell",
        "",
        "context",
        "Landroid/content/Context;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "paymentMethod",
        "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;",
        "cryptoAmount",
        "handleBankCard",
        "handleBalance",
        "handleP2P",
        "buildSellCommonConfirmExtraParams",
        "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;",
        "launchSellConfirmPage",
        "extraParams",
        "postcard",
        "Lcom/kubi/router/model/Postcard;",
        "launchSellP2PConfirmPage",
        "launchSellBalanceConfirmPage",
        "launchSellBankCardConfirmPage",
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
        "SMAP\nFastSellHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastSellHelper.kt\ncom/kubi/payment/fasttrade/sell/FastSellHelper\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,242:1\n44#2,2:243\n44#2,2:253\n29#3:245\n29#3:255\n35#4,4:246\n39#4:252\n44#5,2:250\n*S KotlinDebug\n*F\n+ 1 FastSellHelper.kt\ncom/kubi/payment/fasttrade/sell/FastSellHelper\n*L\n80#1:243,2\n208#1:253,2\n98#1:245\n113#1:255\n190#1:246,4\n190#1:252\n190#1:250,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/payment/fasttrade/sell/s;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/fasttrade/sell/s;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/payment/fasttrade/sell/s;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/payment/fasttrade/sell/s;->a:Lcom/kubi/payment/fasttrade/sell/s;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/kubi/host/HostManager;->e()Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "/express/pay-with-new-card"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    sput-object v0, Lcom/kubi/payment/fasttrade/sell/s;->b:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/kubi/host/HostManager;->e()Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v1, "/express/payment-method/bank-card/update"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    sput-object v0, Lcom/kubi/payment/fasttrade/sell/s;->c:Ljava/lang/String;

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
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static synthetic a(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/payment/fasttrade/sell/s;->f(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Landroid/content/DialogInterface;I)V

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
.end method

.method public static final f(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Landroid/content/DialogInterface;I)V
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/PaymentWebActivity;->t:Lcom/kubi/otc/PaymentWebActivity$Companion;

    .line 3
    .line 4
    new-instance p2, Lay/a;

    .line 5
    .line 6
    sget-object p3, Lcom/kubi/payment/fasttrade/sell/s;->c:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 10
    move-result-object p3

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x2

    .line 13
    .line 14
    .line 15
    invoke-direct {p2, p3, v1, v2, v1}, Lay/a;-><init>(Landroid/net/Uri;Landroid/os/Bundle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getCardInfo()Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;->getCardId()Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    const-string p3, "cardId"

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p3, p1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    const-string p3, "needLogin"

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p3, p2}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    const-string p3, "appNeedLang"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p3, p2}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lay/a;->h()Ljava/lang/String;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    const/16 v7, 0x3c

    .line 50
    const/4 v8, 0x0

    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    move-object v1, p0

    .line 56
    .line 57
    .line 58
    invoke-static/range {v0 .. v8}, Lcom/kubi/otc/PaymentWebActivity$Companion;->openUrl$default(Lcom/kubi/otc/PaymentWebActivity$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)V

    .line 59
    return-void
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
.end method


# virtual methods
.method public final b(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;
    .locals 13

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getPaymentMethodName()Ljava/lang/String;

    .line 9
    move-result-object v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v2, v1

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object v3, v1

    .line 24
    .line 25
    .line 26
    :goto_1
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getChannelId()Ljava/lang/String;

    .line 33
    move-result-object v4

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-object v4, v1

    .line 36
    .line 37
    .line 38
    :goto_2
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 45
    move-result-object v5

    .line 46
    goto :goto_3

    .line 47
    :cond_3
    move-object v5, v1

    .line 48
    .line 49
    .line 50
    :goto_3
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getCryptoCurrency()Ljava/lang/String;

    .line 57
    move-result-object v6

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    move-object v6, v1

    .line 60
    .line 61
    .line 62
    :goto_4
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    move-result-object v6

    .line 64
    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getCardInfo()Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;

    .line 69
    move-result-object v7

    .line 70
    .line 71
    if-eqz v7, :cond_5

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;->getCardId()Ljava/lang/String;

    .line 75
    move-result-object v7

    .line 76
    goto :goto_5

    .line 77
    :cond_5
    move-object v7, v1

    .line 78
    .line 79
    :goto_5
    if-eqz p1, :cond_6

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getP2pInfo()Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;->getAdId()Ljava/lang/String;

    .line 89
    move-result-object v1

    .line 90
    :cond_6
    move-object v8, v1

    .line 91
    .line 92
    const/16 v11, 0x300

    .line 93
    const/4 v12, 0x0

    .line 94
    const/4 v9, 0x0

    .line 95
    const/4 v10, 0x0

    .line 96
    move-object v1, v2

    .line 97
    move-object v2, v3

    .line 98
    move-object v3, v4

    .line 99
    move-object v4, v5

    .line 100
    move-object v5, v6

    .line 101
    move-object v6, p2

    .line 102
    .line 103
    .line 104
    invoke-direct/range {v0 .. v12}, Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 105
    return-object v0
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
.end method

.method public final c(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
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
    const-string v0, "fragmentManager"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/payment/fasttrade/a;->a:Lcom/kubi/payment/fasttrade/a;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v1

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getChannelId()Ljava/lang/String;

    .line 31
    move-result-object v3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v3, v1

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2, v3}, Lcom/kubi/payment/fasttrade/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/payment/fasttrade/FastTradeChannel;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    instance-of v2, v0, Lcom/kubi/payment/fasttrade/FastTradeChannel$BankCard;

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/payment/fasttrade/sell/s;->e(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)V

    .line 49
    return-void

    .line 50
    .line 51
    :cond_2
    instance-of p2, v0, Lcom/kubi/payment/fasttrade/FastTradeChannel$Balance;

    .line 52
    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1, p3, p4}, Lcom/kubi/payment/fasttrade/sell/s;->d(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)V

    .line 57
    return-void

    .line 58
    .line 59
    :cond_3
    instance-of p2, v0, Lcom/kubi/payment/fasttrade/FastTradeChannel$P2P;

    .line 60
    .line 61
    if-eqz p2, :cond_4

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1, p3, p4}, Lcom/kubi/payment/fasttrade/sell/s;->g(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)V

    .line 65
    return-void

    .line 66
    .line 67
    :cond_4
    new-instance v3, Ljava/lang/Exception;

    .line 68
    .line 69
    new-instance p1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    const-string p2, "payment fast sell unsupported channel:"

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-direct {v3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    new-instance v2, Lcom/kubi/otc/exception/OtcException;

    .line 90
    .line 91
    const/16 v7, 0x8

    .line 92
    const/4 v8, 0x0

    .line 93
    .line 94
    const-string v4, "FastSellHelper"

    .line 95
    const/4 v5, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    .line 98
    .line 99
    invoke-direct/range {v2 .. v8}, Lcom/kubi/otc/exception/OtcException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 100
    const/4 p1, 0x2

    .line 101
    .line 102
    .line 103
    invoke-static {v2, v1, p1, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 104
    return-void
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
.end method

.method public final d(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)V
    .locals 20

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/payment/helper/e;->a:Lcom/kubi/payment/helper/e;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Lcom/kubi/payment/helper/e;->a()Z

    .line 12
    move-result v3

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    move-object/from16 v11, p3

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2, v11}, Lcom/kubi/payment/fasttrade/sell/s;->b(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Lcom/kubi/payment/fasttrade/sell/s;->h(Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    move-object/from16 v11, p3

    .line 27
    .line 28
    sget-object v3, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;->b0:Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment$Companion;

    .line 29
    .line 30
    new-instance v4, Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;

    .line 31
    const/4 v5, 0x0

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    .line 37
    move-result-object v6

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v6, v5

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    move-result-object v7

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 49
    move-result-object v6

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v6, v5

    .line 52
    .line 53
    .line 54
    :goto_1
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    move-result-object v8

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getCryptoCurrency()Ljava/lang/String;

    .line 61
    move-result-object v6

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-object v6, v5

    .line 64
    .line 65
    .line 66
    :goto_2
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    move-result-object v10

    .line 68
    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getPaymentMethodName()Ljava/lang/String;

    .line 73
    move-result-object v5

    .line 74
    .line 75
    .line 76
    :cond_4
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    move-result-object v14

    .line 78
    .line 79
    const/16 v18, 0x1d90

    .line 80
    .line 81
    const/16 v19, 0x0

    .line 82
    .line 83
    const-string v5, "SELL"

    .line 84
    .line 85
    const-string v6, "BALANCE"

    .line 86
    const/4 v9, 0x0

    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v13, 0x0

    .line 89
    const/4 v15, 0x0

    .line 90
    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    const/16 v17, 0x0

    .line 94
    .line 95
    .line 96
    invoke-direct/range {v4 .. v19}, Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/payment/fast/buy/recurring/RecurringFrequency;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v1, v4}, Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment$Companion;->launch(Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V

    .line 100
    return-void
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
.end method

.method public final e(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getCardInfo()Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    :goto_0
    const/4 v2, 0x0

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p3, p4}, Lcom/kubi/payment/fasttrade/sell/s;->b(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;

    .line 16
    move-result-object p2

    .line 17
    const/4 p3, 0x2

    .line 18
    .line 19
    .line 20
    invoke-static {p2, v2, p3, v0}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 21
    move-result-object p2

    .line 22
    .line 23
    new-instance p4, Lay/a;

    .line 24
    .line 25
    sget-object v1, Lcom/kubi/payment/fasttrade/sell/s;->b:Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-direct {p4, v1, v0, p3, v0}, Lay/a;-><init>(Landroid/net/Uri;Landroid/os/Bundle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    const-string p3, "side"

    .line 35
    .line 36
    const-string v0, "SELL"

    .line 37
    .line 38
    .line 39
    invoke-virtual {p4, p3, v0}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 40
    move-result-object p3

    .line 41
    .line 42
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    const-string v0, "appNeedLang"

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, v0, p4}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 48
    move-result-object p3

    .line 49
    .line 50
    const-string v0, "needLogin"

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, v0, p4}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 54
    move-result-object p3

    .line 55
    .line 56
    const-string p4, "extraParams"

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object p2

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, p4, p2}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lay/a;->h()Ljava/lang/String;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    sget-object v0, Lcom/kubi/otc/PaymentWebActivity;->t:Lcom/kubi/otc/PaymentWebActivity$Companion;

    .line 71
    .line 72
    const/16 v7, 0x3c

    .line 73
    const/4 v8, 0x0

    .line 74
    const/4 v3, 0x0

    .line 75
    const/4 v4, 0x0

    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v6, 0x0

    .line 78
    move-object v1, p1

    .line 79
    .line 80
    .line 81
    invoke-static/range {v0 .. v8}, Lcom/kubi/otc/PaymentWebActivity$Companion;->openUrl$default(Lcom/kubi/otc/PaymentWebActivity$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)V

    .line 82
    return-void

    .line 83
    :cond_1
    move-object v1, p1

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getCardInfo()Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;->getHasExpired()Ljava/lang/Boolean;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 95
    move-result p1

    .line 96
    .line 97
    if-eqz p1, :cond_2

    .line 98
    .line 99
    sget-object p1, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    sget p4, Lcom/kubi/otc/R$drawable;->ic2_common_warning:I

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, p4}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->V4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    sget p4, Lcom/kubi/otc/R$string;->payment_update_card_title:I

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p4}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 115
    move-result-object p1

    .line 116
    const/4 p4, 0x1

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, p4}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->Z4(Z)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    sget v3, Lcom/kubi/otc/R$string;->payment_update_card_content:I

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->J4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p4}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->N4(Z)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 130
    move-result-object p1

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->R4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    sget p4, Lcom/kubi/otc/R$string;->payment_cancel:I

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, p4, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->P4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    sget p4, Lcom/kubi/otc/R$string;->payment_update:I

    .line 143
    .line 144
    new-instance v0, Lcom/kubi/payment/fasttrade/sell/r;

    .line 145
    .line 146
    .line 147
    invoke-direct {v0, v1, p3}, Lcom/kubi/payment/fasttrade/sell/r;-><init>(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, p4, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 151
    move-result-object p1

    .line 152
    .line 153
    const-string p3, "payment_fast_sell_bankcard_expired"

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, p2, p3}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 157
    return-void

    .line 158
    .line 159
    .line 160
    :cond_2
    invoke-virtual {p0, p3, p4}, Lcom/kubi/payment/fasttrade/sell/s;->b(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;

    .line 161
    move-result-object p1

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v1, p1}, Lcom/kubi/payment/fasttrade/sell/s;->i(Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V

    .line 165
    return-void
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
.end method

.method public final g(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p2, p3}, Lcom/kubi/payment/fasttrade/sell/s;->b(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;)Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;

    .line 4
    move-result-object p3

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;->getP2pInfo()Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;->getPayTypeCode()Ljava/lang/String;

    .line 16
    move-result-object p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p2, 0x0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p3, p2}, Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;->setPayTypeCode(Ljava/lang/String;)V

    .line 22
    .line 23
    const-string p2, "FAST_TRADE_SELL"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3, p2}, Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;->setP2pBusinessType(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, p3}, Lcom/kubi/payment/fasttrade/sell/s;->k(Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V

    .line 30
    return-void
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
.end method

.method public final h(Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/fasttrade/sell/confirm/balance/SellBalanceConfirmFragment;->a0:Lcom/kubi/payment/fasttrade/sell/confirm/balance/SellBalanceConfirmFragment$Companion;

    .line 3
    const/4 v4, 0x4

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v1, p1

    .line 7
    move-object v2, p2

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lcom/kubi/payment/fasttrade/sell/confirm/balance/SellBalanceConfirmFragment$Companion;->launch$default(Lcom/kubi/payment/fasttrade/sell/confirm/balance/SellBalanceConfirmFragment$Companion;Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;Ljava/lang/String;ILjava/lang/Object;)V

    .line 11
    return-void
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
.end method

.method public final i(Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment;->Z:Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment$Companion;

    .line 3
    const/4 v4, 0x4

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v1, p1

    .line 7
    move-object v2, p2

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment$Companion;->launch$default(Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment$Companion;Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;Ljava/lang/String;ILjava/lang/Object;)V

    .line 11
    return-void
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
.end method

.method public final j(Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;Lay/a;)V
    .locals 11
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lay/a;
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
    const-string v0, "extraParams"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "postcard"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    sget-object v0, Lcom/kubi/payment/fasttrade/a;->a:Lcom/kubi/payment/fasttrade/a;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;->getPaymentMethodCode()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;->getChannelId()Ljava/lang/String;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lcom/kubi/payment/fasttrade/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/payment/fasttrade/FastTradeChannel;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    instance-of v1, v0, Lcom/kubi/payment/fasttrade/FastTradeChannel$P2P;

    .line 40
    const/4 v2, 0x2

    .line 41
    const/4 v3, 0x0

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const-string v0, "payment_android_p2p_rn"

    .line 46
    .line 47
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 48
    .line 49
    new-instance v1, Lcom/kubi/payment/fasttrade/sell/s$a;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1}, Lcom/kubi/payment/fasttrade/sell/s$a;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    const-string v4, "object : TypeToken<T>() {}.type"

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 65
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    move-object v5, v0

    .line 69
    .line 70
    new-instance v4, Lcom/kubi/config/exception/KCConfigException;

    .line 71
    .line 72
    const/16 v9, 0x8

    .line 73
    const/4 v10, 0x0

    .line 74
    .line 75
    const-string v6, "RemoteConfig"

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v8, 0x0

    .line 78
    .line 79
    .line 80
    invoke-direct/range {v4 .. v10}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v4, v3, v2, v3}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 84
    .line 85
    :goto_0
    check-cast v3, Ljava/lang/Boolean;

    .line 86
    const/4 v0, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static {v3, v0}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 90
    move-result v0

    .line 91
    .line 92
    if-eqz v0, :cond_0

    .line 93
    .line 94
    const-string p1, "payment/fastTrade/sell/confirm"

    .line 95
    .line 96
    .line 97
    invoke-static {p3, p1}, Llt/j;->a(Lay/a;Ljava/lang/String;)V

    .line 98
    goto :goto_1

    .line 99
    .line 100
    .line 101
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fasttrade/sell/s;->k(Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V

    .line 102
    :goto_1
    return-void

    .line 103
    .line 104
    :cond_1
    instance-of p3, v0, Lcom/kubi/payment/fasttrade/FastTradeChannel$Balance;

    .line 105
    .line 106
    if-eqz p3, :cond_2

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fasttrade/sell/s;->h(Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V

    .line 110
    return-void

    .line 111
    .line 112
    :cond_2
    instance-of p3, v0, Lcom/kubi/payment/fasttrade/FastTradeChannel$BankCard;

    .line 113
    .line 114
    if-eqz p3, :cond_3

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fasttrade/sell/s;->i(Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V

    .line 118
    return-void

    .line 119
    .line 120
    :cond_3
    new-instance v5, Ljava/lang/Exception;

    .line 121
    .line 122
    new-instance p1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    const-string p2, "payment fast sell unsupported channel:"

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    .line 140
    invoke-direct {v5, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    new-instance v4, Lcom/kubi/otc/exception/OtcException;

    .line 143
    .line 144
    const/16 v9, 0x8

    .line 145
    const/4 v10, 0x0

    .line 146
    .line 147
    const-string v6, "FastSellHelper"

    .line 148
    const/4 v7, 0x0

    .line 149
    const/4 v8, 0x0

    .line 150
    .line 151
    .line 152
    invoke-direct/range {v4 .. v10}, Lcom/kubi/otc/exception/OtcException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v4, v3, v2, v3}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 156
    return-void
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
.end method

.method public final k(Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/fasttrade/sell/confirm/p2p/SellP2PConfirmFragment;->a0:Lcom/kubi/payment/fasttrade/sell/confirm/p2p/SellP2PConfirmFragment$Companion;

    .line 3
    const/4 v4, 0x4

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v1, p1

    .line 7
    move-object v2, p2

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lcom/kubi/payment/fasttrade/sell/confirm/p2p/SellP2PConfirmFragment$Companion;->launch$default(Lcom/kubi/payment/fasttrade/sell/confirm/p2p/SellP2PConfirmFragment$Companion;Landroid/content/Context;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;Ljava/lang/String;ILjava/lang/Object;)V

    .line 11
    return-void
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
.end method
