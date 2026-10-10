.class public final Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "MarginIsolatedPositionAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/kubi/margin/api/entity/MarginPosition;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001c\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0015J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u001c\u0010\u0015\u001a\u00020\u00112\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J+\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\"2\u0008\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002\u00a2\u0006\u0002\u0010$J+\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\"2\u0008\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002\u00a2\u0006\u0002\u0010$J\u001a\u0010&\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0002J\u0014\u0010)\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006*"
    }
    d2 = {
        "Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/margin/api/entity/MarginPosition;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "currentSymbol",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "fragment",
        "Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;",
        "<init>",
        "(Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;)V",
        "getCurrentSymbol",
        "()Lcom/kubi/data/entity/SymbolInfoEntity;",
        "setCurrentSymbol",
        "(Lcom/kubi/data/entity/SymbolInfoEntity;)V",
        "getFragment",
        "()Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;",
        "convert",
        "",
        "helper",
        "position",
        "handleCancelClosePosition",
        "toTransfer",
        "currency",
        "",
        "symbol",
        "showAssetDialog",
        "showAssetDebtDialog",
        "showShareView",
        "Landroid/graphics/Bitmap;",
        "direction",
        "",
        "getDebtRate",
        "",
        "getDebt",
        "Lkotlin/Pair;",
        "isBuy",
        "(Ljava/lang/Boolean;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Pair;",
        "getPositionAmount",
        "showMarginRiskDialog",
        "config",
        "Lcom/kubi/margin/entity/IsolateMarginPositionConfig;",
        "getShowSymbol",
        "MarginLib_googleRelease"
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
        "SMAP\nMarginIsolatedPositionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginIsolatedPositionAdapter.kt\ncom/kubi/margin/trade/position/MarginIsolatedPositionAdapter\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,694:1\n17#2,2:695\n35#3,4:697\n39#3:703\n44#4,2:701\n*S KotlinDebug\n*F\n+ 1 MarginIsolatedPositionAdapter.kt\ncom/kubi/margin/trade/position/MarginIsolatedPositionAdapter\n*L\n151#1:695,2\n243#1:697,4\n243#1:703\n243#1:701,2\n*E\n"
    }
.end annotation


# instance fields
.field public i:Lcom/kubi/data/entity/SymbolInfoEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;)V
    .locals 1
    .param p1    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "currentSymbol"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "fragment"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget v0, Lcom/kubi/margin/R$layout;->bmargin_item_isolated_position_new:I

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(I)V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->i:Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 18
    .line 19
    iput-object p2, p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 20
    return-void
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
.end method

.method public static synthetic A(Lcom/kubi/margin/api/entity/MarginPosition;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->f0(Lcom/kubi/margin/api/entity/MarginPosition;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;

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
.end method

.method public static synthetic B(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->i0(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V

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
.end method

.method public static synthetic C(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->g0(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V

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
.end method

.method public static synthetic D(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->P(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Landroid/view/View;)V

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
.end method

.method public static synthetic E(Lcom/kubi/margin/api/entity/MarginPosition;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->J(Lcom/kubi/margin/api/entity/MarginPosition;Landroid/view/View;)V

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
.end method

.method public static final G(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;)Lkotlin/Unit;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object p1, p1, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->i:Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    return-object p0

    .line 20
    .line 21
    :cond_0
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    const/16 v6, 0x1c

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static/range {v0 .. v7}, Lg00/f$a;->f(Lg00/f;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 39
    return-object p0
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
.end method

.method public static final H(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/margin/entity/IsolateMarginPositionConfig;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j0(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/margin/entity/IsolateMarginPositionConfig;)V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final I(ILcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 13
    .line 14
    sget v1, Lcom/kubi/margin/R$string;->margin_dialog_profit_loss_tips_new:I

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    new-array v3, v2, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    sget v1, Lcom/kubi/margin/R$string;->i_know:I

    .line 28
    .line 29
    new-array v2, v2, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->T4(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 38
    move-result-object p0

    .line 39
    .line 40
    iget-object p1, p1, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    return-object p0
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
.end method

.method public static final J(Lcom/kubi/margin/api/entity/MarginPosition;Landroid/view/View;)V
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-wide/16 p0, 0x5

    .line 13
    .line 14
    .line 15
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    const/16 v6, 0x1c

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v0 .. v7}, Lg00/a$a;->d(Lg00/a;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 26
    return-void
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
.end method

.method public static final K(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4tradingIsolated"

    .line 6
    .line 7
    const-string v1, "orderManagement"

    .line 8
    .line 9
    const-string v2, "17"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->e0(Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    return-object p0
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
.end method

.method public static final L(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->o0(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object p0
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
.end method

.method public static final M(Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 16

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4tradingIsolated"

    .line 6
    .line 7
    const-string v1, "orderManagement"

    .line 8
    .line 9
    const-string v2, "15"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    sget-object v6, Lf00/a;->a:Lf00/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 19
    move-result-object v8

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    :goto_0
    move-object v7, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :goto_1
    const-string v0, "orderManagement"

    .line 36
    .line 37
    const-string v1, "15"

    .line 38
    .line 39
    const-string v2, "B4tradingIsolated"

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    move-result-object v11

    .line 44
    .line 45
    const/16 v14, 0x60

    .line 46
    const/4 v15, 0x0

    .line 47
    .line 48
    const-string v9, "repay"

    .line 49
    .line 50
    const-string v10, "isolated"

    .line 51
    const/4 v12, 0x0

    .line 52
    const/4 v13, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static/range {v6 .. v15}, Lg00/h$a;->b(Lg00/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 56
    .line 57
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 58
    return-object v0
    .line 59
    .line 60
    .line 61
.end method

.method public static final N(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->X(Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final O(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4tradingIsolated"

    .line 6
    .line 7
    const-string v1, "orderManagement"

    .line 8
    .line 9
    const-string v2, "14"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    iget-object p0, p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;->j4(Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    return-object p0
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
.end method

.method public static final P(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    iget-object p2, p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->i:Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->o0(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    return-void
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
.end method

.method public static final Q(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Z)Lkotlin/Unit;
    .locals 14

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4tradingIsolated"

    .line 6
    .line 7
    const-string v1, "orderManagement"

    .line 8
    .line 9
    const-string v2, "16"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    sget-object v0, Lcom/kubi/share/api/IShareService;->a:Lcom/kubi/share/api/IShareService$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/share/api/IShareService$Companion;->get()Lcom/kubi/share/api/IShareService;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    new-instance v1, Lcom/kubi/share/api/ImageShareParam;

    .line 22
    .line 23
    const/16 v12, 0x3fe

    .line 24
    const/4 v13, 0x0

    .line 25
    .line 26
    const-string v2, "m_p_share"

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x0

    .line 33
    const/4 v11, 0x0

    .line 34
    .line 35
    .line 36
    invoke-direct/range {v1 .. v13}, Lcom/kubi/share/api/ImageShareParam;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;ZLjava/lang/String;Lcom/kubi/share/api/CustomDisplay;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual/range {p0 .. p2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->n0(Lcom/kubi/margin/api/entity/MarginPosition;Z)Landroid/graphics/Bitmap;

    .line 40
    move-result-object p0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p0}, Lcom/kubi/share/api/ImageShareParam;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 44
    const/4 p0, 0x0

    .line 45
    const/4 p1, 0x2

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1, p0, p1, p0}, Lcom/kubi/share/api/IShareService;->c(Lcom/kubi/share/api/IShareService;Lcom/kubi/share/api/ShareParam;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 51
    return-object p0
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
.end method

.method public static final R(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->a0(Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final Y(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;->c4(Lcom/kubi/margin/api/entity/MarginPosition;)V

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
.end method

.method public static final b0(Lcom/kubi/margin/api/entity/MarginPosition;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    const-string v0, "viewHolder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "dialogFragmentHelper"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget v0, Lcom/kubi/margin/R$id;->tv_base:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v2

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 29
    .line 30
    sget v0, Lcom/kubi/margin/R$id;->tv_quote:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v1, v2

    .line 43
    .line 44
    .line 45
    :goto_1
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 46
    .line 47
    sget v0, Lcom/kubi/margin/R$id;->tv_total_base:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Lzo/a;->j(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 57
    move-result-object v1

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move-object v1, v2

    .line 60
    .line 61
    :goto_2
    const-string v3, "-"

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 69
    .line 70
    sget v0, Lcom/kubi/margin/R$id;->tv_total_quote:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, Lzo/a;->j(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 80
    move-result-object v1

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    move-object v1, v2

    .line 83
    .line 84
    .line 85
    :goto_3
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 90
    .line 91
    sget v0, Lcom/kubi/margin/R$id;->tv_freeze_base:I

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Lzo/a;->n(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 101
    move-result-object v1

    .line 102
    goto :goto_4

    .line 103
    :cond_4
    move-object v1, v2

    .line 104
    .line 105
    .line 106
    :goto_4
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 111
    .line 112
    sget v0, Lcom/kubi/margin/R$id;->tv_freeze_quote:I

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 116
    move-result-object v1

    .line 117
    .line 118
    if-eqz v1, :cond_5

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Lzo/a;->n(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 122
    move-result-object v1

    .line 123
    goto :goto_5

    .line 124
    :cond_5
    move-object v1, v2

    .line 125
    .line 126
    .line 127
    :goto_5
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    move-result-object v1

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 132
    .line 133
    sget v0, Lcom/kubi/margin/R$id;->tvAvailableBase:I

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    if-eqz v1, :cond_6

    .line 140
    .line 141
    .line 142
    invoke-static {v1}, Lzo/a;->o(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 143
    move-result-object v1

    .line 144
    goto :goto_6

    .line 145
    :cond_6
    move-object v1, v2

    .line 146
    .line 147
    .line 148
    :goto_6
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    move-result-object v1

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 153
    .line 154
    sget v0, Lcom/kubi/margin/R$id;->tvAvailableQuote:I

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 158
    move-result-object p0

    .line 159
    .line 160
    if-eqz p0, :cond_7

    .line 161
    .line 162
    .line 163
    invoke-static {p0}, Lzo/a;->o(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 164
    move-result-object v2

    .line 165
    .line 166
    .line 167
    :cond_7
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    move-result-object p0

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v0, p0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 172
    .line 173
    sget p0, Lcom/kubi/margin/R$id;->tvTitle:I

    .line 174
    .line 175
    new-instance v0, Lcom/kubi/margin/trade/position/x;

    .line 176
    .line 177
    .line 178
    invoke-direct {v0, p2}, Lcom/kubi/margin/trade/position/x;-><init>(Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p0, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 182
    .line 183
    sget p0, Lcom/kubi/margin/R$id;->tvBtnOk:I

    .line 184
    .line 185
    new-instance v0, Lcom/kubi/margin/trade/position/z;

    .line 186
    .line 187
    .line 188
    invoke-direct {v0, p2}, Lcom/kubi/margin/trade/position/z;-><init>(Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, p0, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 192
    .line 193
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 194
    return-object p0
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
.end method

.method public static final c0(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

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
.end method

.method public static final d0(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

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
.end method

.method public static final f0(Lcom/kubi/margin/api/entity/MarginPosition;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    const-string v0, "viewHolder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "dialogFragmentHelper"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget v0, Lcom/kubi/margin/R$id;->tv_base:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v2

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 29
    .line 30
    sget v0, Lcom/kubi/margin/R$id;->tv_quote:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v1, v2

    .line 43
    .line 44
    .line 45
    :goto_1
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 46
    .line 47
    sget v0, Lcom/kubi/margin/R$id;->tv_total_base:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Lzo/a;->q(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 57
    move-result-object v1

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move-object v1, v2

    .line 60
    .line 61
    :goto_2
    const-string v3, "-"

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 69
    .line 70
    sget v0, Lcom/kubi/margin/R$id;->tv_total_quote:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, Lzo/a;->q(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 80
    move-result-object v1

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    move-object v1, v2

    .line 83
    .line 84
    .line 85
    :goto_3
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 90
    .line 91
    sget v0, Lcom/kubi/margin/R$id;->tv_freeze_base:I

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Lzo/a;->m(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 101
    move-result-object v1

    .line 102
    goto :goto_4

    .line 103
    :cond_4
    move-object v1, v2

    .line 104
    .line 105
    .line 106
    :goto_4
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 111
    .line 112
    sget v0, Lcom/kubi/margin/R$id;->tv_freeze_quote:I

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 116
    move-result-object v1

    .line 117
    .line 118
    if-eqz v1, :cond_5

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Lzo/a;->m(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 122
    move-result-object v1

    .line 123
    goto :goto_5

    .line 124
    :cond_5
    move-object v1, v2

    .line 125
    .line 126
    .line 127
    :goto_5
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    move-result-object v1

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 132
    .line 133
    sget v0, Lcom/kubi/margin/R$id;->tv_debt_base:I

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    if-eqz v1, :cond_6

    .line 140
    .line 141
    .line 142
    invoke-static {v1}, Lzo/a;->j(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 143
    move-result-object v1

    .line 144
    goto :goto_6

    .line 145
    :cond_6
    move-object v1, v2

    .line 146
    .line 147
    .line 148
    :goto_6
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    move-result-object v1

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 153
    .line 154
    sget v0, Lcom/kubi/margin/R$id;->tv_debt_quote:I

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 158
    move-result-object v1

    .line 159
    .line 160
    if-eqz v1, :cond_7

    .line 161
    .line 162
    .line 163
    invoke-static {v1}, Lzo/a;->j(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 164
    move-result-object v1

    .line 165
    goto :goto_7

    .line 166
    :cond_7
    move-object v1, v2

    .line 167
    .line 168
    .line 169
    :goto_7
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    move-result-object v1

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 174
    .line 175
    sget v0, Lcom/kubi/margin/R$id;->tvAvailableBase:I

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 179
    move-result-object v1

    .line 180
    .line 181
    if-eqz v1, :cond_8

    .line 182
    .line 183
    .line 184
    invoke-static {v1}, Lzo/a;->b(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 185
    move-result-object v1

    .line 186
    goto :goto_8

    .line 187
    :cond_8
    move-object v1, v2

    .line 188
    .line 189
    .line 190
    :goto_8
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    move-result-object v1

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 195
    .line 196
    sget v0, Lcom/kubi/margin/R$id;->tvAvailableQuote:I

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 200
    move-result-object v1

    .line 201
    .line 202
    if-eqz v1, :cond_9

    .line 203
    .line 204
    .line 205
    invoke-static {v1}, Lzo/a;->b(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 206
    move-result-object v1

    .line 207
    goto :goto_9

    .line 208
    :cond_9
    move-object v1, v2

    .line 209
    .line 210
    .line 211
    :goto_9
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 212
    move-result-object v1

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 216
    .line 217
    sget v0, Lcom/kubi/margin/R$id;->tvNetBalanceBase:I

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 221
    move-result-object v1

    .line 222
    .line 223
    if-eqz v1, :cond_a

    .line 224
    .line 225
    .line 226
    invoke-static {v1}, Lzo/a;->f(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 227
    move-result-object v1

    .line 228
    goto :goto_a

    .line 229
    :cond_a
    move-object v1, v2

    .line 230
    .line 231
    .line 232
    :goto_a
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    move-result-object v1

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 237
    .line 238
    sget v0, Lcom/kubi/margin/R$id;->tvNetBalanceQuote:I

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 242
    move-result-object v1

    .line 243
    .line 244
    if-eqz v1, :cond_b

    .line 245
    .line 246
    .line 247
    invoke-static {v1}, Lzo/a;->f(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 248
    move-result-object v1

    .line 249
    goto :goto_b

    .line 250
    :cond_b
    move-object v1, v2

    .line 251
    .line 252
    .line 253
    :goto_b
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    move-result-object v1

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 258
    .line 259
    sget v0, Lcom/kubi/margin/R$id;->tvMaxOutBase:I

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 263
    move-result-object v1

    .line 264
    .line 265
    if-eqz v1, :cond_c

    .line 266
    .line 267
    .line 268
    invoke-static {v1}, Lzo/a;->e(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 269
    move-result-object v1

    .line 270
    goto :goto_c

    .line 271
    :cond_c
    move-object v1, v2

    .line 272
    .line 273
    .line 274
    :goto_c
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    move-result-object v1

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 279
    .line 280
    sget v0, Lcom/kubi/margin/R$id;->tvMaxOutQuote:I

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 284
    move-result-object v1

    .line 285
    .line 286
    if-eqz v1, :cond_d

    .line 287
    .line 288
    .line 289
    invoke-static {v1}, Lzo/a;->e(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 290
    move-result-object v2

    .line 291
    .line 292
    .line 293
    :cond_d
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    move-result-object v1

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 298
    .line 299
    sget v0, Lcom/kubi/margin/R$id;->viewMore:I

    .line 300
    .line 301
    new-instance v1, Lcom/kubi/margin/trade/position/a0;

    .line 302
    .line 303
    .line 304
    invoke-direct {v1, p0, p2}, Lcom/kubi/margin/trade/position/a0;-><init>(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 308
    .line 309
    sget p0, Lcom/kubi/margin/R$id;->tvTitle:I

    .line 310
    .line 311
    new-instance v0, Lcom/kubi/margin/trade/position/b0;

    .line 312
    .line 313
    .line 314
    invoke-direct {v0, p2}, Lcom/kubi/margin/trade/position/b0;-><init>(Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1, p0, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 318
    .line 319
    sget p0, Lcom/kubi/margin/R$id;->tvBtnOk:I

    .line 320
    .line 321
    new-instance v0, Lcom/kubi/margin/trade/position/c0;

    .line 322
    .line 323
    .line 324
    invoke-direct {v0, p2}, Lcom/kubi/margin/trade/position/c0;-><init>(Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1, p0, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 328
    .line 329
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 330
    return-object p0
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
.end method

.method public static synthetic g(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->Q(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Z)Lkotlin/Unit;

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
.end method

.method public static final g0(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-wide/16 v2, 0x5

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    const/16 v6, 0x1c

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v0 .. v7}, Lg00/a$a;->d(Lg00/a;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 29
    return-void
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
.end method

.method public static synthetic h(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->Y(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Landroid/content/DialogInterface;I)V

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
.end method

.method public static final h0(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

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
.end method

.method public static synthetic i()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->k0()Lkotlin/Unit;

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
.end method

.method public static final i0(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

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
.end method

.method public static synthetic j(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->h0(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V

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
.end method

.method public static synthetic k(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->c0(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V

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
.end method

.method public static final k0()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static synthetic l(Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->M(Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;

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
.end method

.method public static final l0(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "viewHolder"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "dialogFragmentHelper"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget p1, Lcom/kubi/margin/R$id;->tv_content:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    check-cast p0, Landroid/widget/TextView;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    sget-object p1, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 23
    .line 24
    sget-object v0, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 25
    .line 26
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    .line 27
    .line 28
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 29
    .line 30
    sget v3, Lcom/kubi/margin/R$color;->c_text:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lcom/kubi/utils/c;->a(I)I

    .line 34
    move-result v2

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0, v0, v1}, Lcom/kubi/resources/HighlightTextHelper;->a(Landroid/widget/TextView;Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;Landroid/text/style/CharacterStyle;)V

    .line 41
    :cond_0
    return-void
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
.end method

.method public static synthetic m(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->G(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;)Lkotlin/Unit;

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
.end method

.method public static final m0(Lcom/kubi/data/entity/SymbolInfoEntity;Landroid/content/DialogInterface;I)V
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/TransferJumper;->a:Lcom/kubi/data/coin/TransferJumper$Companion;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p2, p1

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {p2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getSymbol()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    const/16 v8, 0x62

    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    const-string v4, "TRADE"

    .line 32
    .line 33
    const-string v5, "ISOLATED"

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static/range {v0 .. v9}, Lcom/kubi/data/coin/TransferJumper$Companion;->jumpToTransfer$default(Lcom/kubi/data/coin/TransferJumper$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 39
    return-void
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
.end method

.method public static synthetic n(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->O(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;

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
.end method

.method public static synthetic o(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->R(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;

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
.end method

.method public static synthetic p(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->l0(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

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
.end method

.method public static final p0(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/TransferJumper;->a:Lcom/kubi/data/coin/TransferJumper$Companion;

    .line 3
    .line 4
    const-string v1, "orderManagement"

    .line 5
    .line 6
    const-string v2, "13"

    .line 7
    .line 8
    const-string v3, "B4tradingIsolated"

    .line 9
    .line 10
    .line 11
    invoke-static {v3, v1, v2}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v7

    .line 13
    .line 14
    const/16 v8, 0x22

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    const-string v4, "TRADE"

    .line 19
    .line 20
    const-string v5, "ISOLATED"

    .line 21
    const/4 v6, 0x0

    .line 22
    move-object v1, p0

    .line 23
    move-object v3, p1

    .line 24
    .line 25
    .line 26
    invoke-static/range {v0 .. v9}, Lcom/kubi/data/coin/TransferJumper$Companion;->jumpToTransfer$default(Lcom/kubi/data/coin/TransferJumper$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    return-object p0
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
.end method

.method public static synthetic q(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->d0(Lcom/kubi/resources/dialog/DialogFragmentHelper;Landroid/view/View;)V

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
.end method

.method public static synthetic r(ILcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->I(ILcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;)Lkotlin/Unit;

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
.end method

.method public static synthetic s(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->K(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;

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
.end method

.method public static synthetic t(Lcom/kubi/margin/api/entity/MarginPosition;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->b0(Lcom/kubi/margin/api/entity/MarginPosition;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;

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
.end method

.method public static synthetic u(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->p0(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;

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
.end method

.method public static synthetic v(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->L(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;

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
.end method

.method public static synthetic w(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->N(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Unit;

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
.end method

.method public static synthetic x(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/margin/entity/IsolateMarginPositionConfig;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->H(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/margin/entity/IsolateMarginPositionConfig;)Lkotlin/Unit;

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
.end method

.method public static synthetic y(Lcom/kubi/data/entity/SymbolInfoEntity;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->m0(Lcom/kubi/data/entity/SymbolInfoEntity;Landroid/content/DialogInterface;I)V

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
.end method


# virtual methods
.method public F(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/api/entity/MarginPosition;)V
    .locals 28
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/margin/api/entity/MarginPosition;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n",
            "KCCyclomaticComplexityCheck",
            "KCLongMethodCheck"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    if-eqz v2, :cond_10

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_b

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->isOpenStatus()Z

    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    .line 20
    if-eqz v3, :cond_f

    .line 21
    .line 22
    sget v3, Lcom/kubi/margin/R$id;->view_empty:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v3, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 26
    .line 27
    sget v3, Lcom/kubi/margin/R$id;->view_content:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 31
    .line 32
    sget-object v3, Lcom/kubi/margin/trade/MarginConfigManager;->a:Lcom/kubi/margin/trade/MarginConfigManager;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 36
    move-result-object v6

    .line 37
    .line 38
    .line 39
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    move-result-object v6

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v6}, Lcom/kubi/margin/trade/MarginConfigManager;->S0(Ljava/lang/String;)Lcom/kubi/margin/entity/IsolateMarginPositionConfig;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    sget v6, Lcom/kubi/margin/R$id;->iv_arrow:I

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 50
    move-result-object v7

    .line 51
    .line 52
    iget-object v8, v1, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->i:Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 56
    move-result-object v8

    .line 57
    .line 58
    .line 59
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    move-result v7

    .line 61
    xor-int/2addr v7, v4

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 65
    .line 66
    sget v6, Lcom/kubi/margin/R$id;->tvSymbol:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 70
    move-result-object v7

    .line 71
    .line 72
    const-string v13, "getView(...)"

    .line 73
    .line 74
    .line 75
    invoke-static {v7, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    new-instance v10, Lcom/kubi/margin/trade/position/n;

    .line 78
    .line 79
    .line 80
    invoke-direct {v10, v2, v1}, Lcom/kubi/margin/trade/position/n;-><init>(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;)V

    .line 81
    const/4 v11, 0x1

    .line 82
    const/4 v12, 0x0

    .line 83
    .line 84
    const-wide/16 v8, 0x0

    .line 85
    .line 86
    .line 87
    invoke-static/range {v7 .. v12}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getSymbol()Ljava/lang/String;

    .line 91
    move-result-object v7

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v7}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->W(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    move-result-object v7

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getUserLeverage()Ljava/math/BigDecimal;

    .line 102
    move-result-object v6

    .line 103
    .line 104
    if-eqz v6, :cond_1

    .line 105
    .line 106
    sget v6, Lcom/kubi/margin/R$id;->leverage:I

    .line 107
    .line 108
    new-instance v7, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getUserLeverage()Ljava/math/BigDecimal;

    .line 115
    move-result-object v8

    .line 116
    .line 117
    .line 118
    invoke-static {v8}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 119
    move-result-object v14

    .line 120
    .line 121
    const/16 v22, 0x7d

    .line 122
    .line 123
    const/16 v23, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    .line 126
    const/16 v16, 0x4

    .line 127
    .line 128
    const/16 v17, 0x0

    .line 129
    .line 130
    const/16 v18, 0x0

    .line 131
    .line 132
    const/16 v19, 0x0

    .line 133
    .line 134
    const/16 v20, 0x0

    .line 135
    .line 136
    const/16 v21, 0x0

    .line 137
    .line 138
    .line 139
    invoke-static/range {v14 .. v23}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 140
    move-result-object v8

    .line 141
    .line 142
    .line 143
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const/16 v8, 0x78

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    move-result-object v7

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 156
    .line 157
    :cond_1
    sget v6, Lcom/kubi/margin/R$id;->tvType:I

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 161
    move-result-object v6

    .line 162
    .line 163
    check-cast v6, Landroid/widget/TextView;

    .line 164
    .line 165
    .line 166
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v6}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->isShowDirection()Ljava/lang/Boolean;

    .line 173
    move-result-object v7

    .line 174
    .line 175
    const-string v8, "requireContext(...)"

    .line 176
    const/4 v9, 0x2

    .line 177
    const/4 v10, 0x0

    .line 178
    .line 179
    if-eqz v7, :cond_3

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 183
    move-result v11

    .line 184
    .line 185
    .line 186
    invoke-static {v6}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 187
    .line 188
    sget-object v12, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 189
    .line 190
    if-eqz v11, :cond_2

    .line 191
    .line 192
    sget v14, Lcom/kubi/margin/R$string;->multi:I

    .line 193
    goto :goto_0

    .line 194
    .line 195
    :cond_2
    sget v14, Lcom/kubi/margin/R$string;->empty:I

    .line 196
    .line 197
    :goto_0
    new-array v15, v5, [Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v14, v15}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 201
    move-result-object v12

    .line 202
    .line 203
    .line 204
    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    iget-object v12, v1, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 210
    move-result-object v12

    .line 211
    .line 212
    .line 213
    invoke-static {v12, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v12, v11}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 217
    move-result v11

    .line 218
    const/4 v12, 0x0

    .line 219
    .line 220
    .line 221
    invoke-static {v11, v12, v9, v10}, Lcom/kubi/resources/g;->m(IFILjava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    .line 222
    move-result-object v11

    .line 223
    .line 224
    .line 225
    invoke-virtual {v6, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 226
    goto :goto_1

    .line 227
    :cond_3
    move-object v7, v10

    .line 228
    .line 229
    :goto_1
    sget v6, Lcom/kubi/margin/R$id;->divider:I

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 233
    move-result-object v6

    .line 234
    .line 235
    sget v11, Lcom/kubi/margin/R$id;->iv_share:I

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 239
    move-result-object v11

    .line 240
    move-object v14, v11

    .line 241
    .line 242
    check-cast v14, Landroid/widget/ImageView;

    .line 243
    .line 244
    .line 245
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v14}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 249
    .line 250
    .line 251
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    invoke-static {v6}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->isShowDirection()Ljava/lang/Boolean;

    .line 258
    move-result-object v11

    .line 259
    .line 260
    if-eqz v11, :cond_5

    .line 261
    .line 262
    .line 263
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 264
    move-result v11

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getStatus()Ljava/lang/String;

    .line 268
    move-result-object v12

    .line 269
    .line 270
    const-string v15, "IN_AUTO_RENEW"

    .line 271
    .line 272
    .line 273
    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    move-result v12

    .line 275
    .line 276
    if-eqz v12, :cond_4

    .line 277
    .line 278
    .line 279
    invoke-static {v14}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v6}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 283
    goto :goto_2

    .line 284
    .line 285
    .line 286
    :cond_4
    invoke-static {v14}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v6}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 290
    .line 291
    new-instance v6, Lcom/kubi/margin/trade/position/e0;

    .line 292
    .line 293
    .line 294
    invoke-direct {v6, v1, v2, v11}, Lcom/kubi/margin/trade/position/e0;-><init>(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Z)V

    .line 295
    .line 296
    const/16 v18, 0x1

    .line 297
    .line 298
    const/16 v19, 0x0

    .line 299
    .line 300
    const-wide/16 v15, 0x0

    .line 301
    .line 302
    move-object/from16 v17, v6

    .line 303
    .line 304
    .line 305
    invoke-static/range {v14 .. v19}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :cond_5
    :goto_2
    invoke-virtual {v1, v7, v2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->T(Ljava/lang/Boolean;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Pair;

    .line 309
    move-result-object v6

    .line 310
    .line 311
    sget v11, Lcom/kubi/margin/R$id;->tv_debt:I

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 315
    move-result-object v11

    .line 316
    move-object v14, v11

    .line 317
    .line 318
    check-cast v14, Lcom/kubi/resources/widget/DashTextView;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v14, v4}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 322
    .line 323
    new-instance v11, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 327
    .line 328
    sget-object v12, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 329
    .line 330
    sget v15, Lcom/kubi/margin/R$string;->total_debt:I

    .line 331
    .line 332
    new-array v9, v5, [Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v15, v9}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 336
    move-result-object v9

    .line 337
    .line 338
    .line 339
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    const/16 v9, 0x28

    .line 342
    .line 343
    .line 344
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 348
    move-result-object v15

    .line 349
    .line 350
    check-cast v15, Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    const/16 v15, 0x29

    .line 356
    .line 357
    .line 358
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    move-result-object v11

    .line 363
    .line 364
    .line 365
    invoke-virtual {v14, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 366
    .line 367
    .line 368
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 369
    .line 370
    new-instance v11, Lcom/kubi/margin/trade/position/f0;

    .line 371
    .line 372
    .line 373
    invoke-direct {v11, v1, v2}, Lcom/kubi/margin/trade/position/f0;-><init>(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 374
    .line 375
    const/16 v18, 0x1

    .line 376
    .line 377
    const/16 v19, 0x0

    .line 378
    .line 379
    move/from16 v17, v15

    .line 380
    .line 381
    const-wide/16 v15, 0x0

    .line 382
    .line 383
    move/from16 v27, v17

    .line 384
    .line 385
    move-object/from16 v17, v11

    .line 386
    .line 387
    move/from16 v11, v27

    .line 388
    .line 389
    .line 390
    invoke-static/range {v14 .. v19}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 391
    .line 392
    sget v14, Lcom/kubi/margin/R$id;->tv_debt_value:I

    .line 393
    .line 394
    .line 395
    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 396
    move-result-object v6

    .line 397
    .line 398
    check-cast v6, Ljava/lang/CharSequence;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v14, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 402
    .line 403
    sget v6, Lcom/kubi/margin/R$id;->tv_debt_rate:I

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 407
    move-result-object v6

    .line 408
    .line 409
    check-cast v6, Lcom/kubi/resources/widget/DashTextView;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v6, v4}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 413
    .line 414
    .line 415
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 416
    .line 417
    new-instance v15, Lcom/kubi/margin/trade/position/g0;

    .line 418
    .line 419
    .line 420
    invoke-direct {v15, v1, v2, v3}, Lcom/kubi/margin/trade/position/g0;-><init>(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/margin/entity/IsolateMarginPositionConfig;)V

    .line 421
    .line 422
    const/16 v25, 0x1

    .line 423
    .line 424
    const/16 v26, 0x0

    .line 425
    .line 426
    const-wide/16 v22, 0x0

    .line 427
    .line 428
    move-object/from16 v21, v6

    .line 429
    .line 430
    move-object/from16 v24, v15

    .line 431
    .line 432
    .line 433
    invoke-static/range {v21 .. v26}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 434
    .line 435
    sget v6, Lcom/kubi/margin/R$id;->tv_debt_rate_value:I

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 439
    move-result-object v6

    .line 440
    .line 441
    check-cast v6, Landroid/widget/TextView;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1, v2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->U(Lcom/kubi/margin/api/entity/MarginPosition;)Ljava/lang/CharSequence;

    .line 445
    move-result-object v15

    .line 446
    .line 447
    .line 448
    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1, v7, v2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->V(Ljava/lang/Boolean;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Pair;

    .line 452
    move-result-object v6

    .line 453
    .line 454
    sget v7, Lcom/kubi/margin/R$id;->tv_amount:I

    .line 455
    .line 456
    new-instance v15, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 460
    .line 461
    sget v10, Lcom/kubi/margin/R$string;->hold_ptn:I

    .line 462
    .line 463
    new-array v4, v5, [Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12, v10, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 467
    move-result-object v4

    .line 468
    .line 469
    .line 470
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 477
    move-result-object v4

    .line 478
    .line 479
    check-cast v4, Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 489
    move-result-object v4

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0, v7, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 493
    .line 494
    sget v4, Lcom/kubi/margin/R$id;->tv_amount_value:I

    .line 495
    .line 496
    .line 497
    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 498
    move-result-object v6

    .line 499
    .line 500
    check-cast v6, Ljava/lang/CharSequence;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0, v4, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 504
    .line 505
    sget-object v6, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 506
    .line 507
    sget-object v7, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v7}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 511
    move-result-object v7

    .line 512
    .line 513
    const-class v10, Lzf/o0;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v6, v10, v7}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 517
    move-result-object v6

    .line 518
    .line 519
    if-eqz v6, :cond_6

    .line 520
    .line 521
    check-cast v6, Lzf/o0;

    .line 522
    .line 523
    .line 524
    invoke-interface {v6}, Lzf/o0;->a()Z

    .line 525
    move-result v6

    .line 526
    goto :goto_3

    .line 527
    :cond_6
    move v6, v5

    .line 528
    .line 529
    :goto_3
    if-eqz v6, :cond_7

    .line 530
    .line 531
    sget v6, Lcom/kubi/margin/R$string;->kc_trade_pnl_incl_fees:I

    .line 532
    goto :goto_4

    .line 533
    .line 534
    :cond_7
    sget v6, Lcom/kubi/margin/R$string;->margin_profit_loss:I

    .line 535
    .line 536
    :goto_4
    sget v7, Lcom/kubi/margin/R$id;->tv_profit:I

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 540
    move-result-object v7

    .line 541
    .line 542
    check-cast v7, Lcom/kubi/resources/widget/DashTextView;

    .line 543
    .line 544
    new-instance v10, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 548
    .line 549
    new-array v15, v5, [Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v6, v15}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 553
    move-result-object v15

    .line 554
    .line 555
    .line 556
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 563
    move-result-object v15

    .line 564
    .line 565
    if-eqz v15, :cond_8

    .line 566
    .line 567
    .line 568
    invoke-virtual {v15}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 569
    move-result-object v15

    .line 570
    goto :goto_5

    .line 571
    :cond_8
    const/4 v15, 0x0

    .line 572
    .line 573
    .line 574
    :goto_5
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 581
    move-result-object v10

    .line 582
    .line 583
    .line 584
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 585
    const/4 v10, 0x1

    .line 586
    .line 587
    .line 588
    invoke-virtual {v7, v10}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 589
    .line 590
    .line 591
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 592
    .line 593
    new-instance v10, Lcom/kubi/margin/trade/position/h0;

    .line 594
    .line 595
    .line 596
    invoke-direct {v10, v6, v1}, Lcom/kubi/margin/trade/position/h0;-><init>(ILcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;)V

    .line 597
    .line 598
    const/16 v25, 0x1

    .line 599
    .line 600
    const/16 v26, 0x0

    .line 601
    .line 602
    const-wide/16 v22, 0x0

    .line 603
    .line 604
    move-object/from16 v21, v7

    .line 605
    .line 606
    move-object/from16 v24, v10

    .line 607
    .line 608
    .line 609
    invoke-static/range {v21 .. v26}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 610
    .line 611
    sget v6, Lcom/kubi/margin/R$id;->iv_more:I

    .line 612
    .line 613
    new-instance v7, Lcom/kubi/margin/trade/position/i0;

    .line 614
    .line 615
    .line 616
    invoke-direct {v7, v2}, Lcom/kubi/margin/trade/position/i0;-><init>(Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v0, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 620
    .line 621
    sget v6, Lcom/kubi/margin/R$id;->tv_profit_value:I

    .line 622
    .line 623
    .line 624
    invoke-virtual {v0, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 625
    move-result-object v6

    .line 626
    .line 627
    check-cast v6, Landroid/widget/TextView;

    .line 628
    .line 629
    if-eqz v3, :cond_9

    .line 630
    .line 631
    .line 632
    invoke-virtual {v3}, Lcom/kubi/margin/entity/IsolateMarginPositionConfig;->getPnlPrecision()Ljava/lang/Integer;

    .line 633
    move-result-object v7

    .line 634
    goto :goto_6

    .line 635
    :cond_9
    const/4 v7, 0x0

    .line 636
    .line 637
    .line 638
    :goto_6
    invoke-virtual {v2, v7}, Lcom/kubi/margin/api/entity/MarginPosition;->getProfitValueString(Ljava/lang/Integer;)Ljava/lang/String;

    .line 639
    move-result-object v7

    .line 640
    .line 641
    const-string v10, "--"

    .line 642
    .line 643
    .line 644
    invoke-static {v7, v10}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 645
    move-result-object v7

    .line 646
    .line 647
    .line 648
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 649
    .line 650
    iget-object v7, v1, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 654
    move-result-object v7

    .line 655
    .line 656
    .line 657
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->calculatorProfitValue()Ljava/math/BigDecimal;

    .line 661
    move-result-object v8

    .line 662
    move-object v15, v12

    .line 663
    .line 664
    .line 665
    invoke-static {v8}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 666
    move-result-wide v11

    .line 667
    .line 668
    sget v8, Lcom/kubi/margin/R$color;->c_text60:I

    .line 669
    .line 670
    .line 671
    invoke-static {v7, v11, v12, v8}, Lcom/kubi/resources/g;->c(Landroid/content/Context;DI)I

    .line 672
    move-result v7

    .line 673
    .line 674
    .line 675
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 676
    .line 677
    sget v6, Lcom/kubi/margin/R$id;->tv_profit_value_legal:I

    .line 678
    .line 679
    .line 680
    invoke-virtual {v2, v10}, Lcom/kubi/margin/api/entity/MarginPosition;->getProfitValueLegalString(Ljava/lang/String;)Ljava/lang/String;

    .line 681
    move-result-object v7

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 685
    .line 686
    sget v6, Lcom/kubi/margin/R$id;->tv_mark_price_value:I

    .line 687
    .line 688
    .line 689
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getMarkPriceString()Ljava/lang/String;

    .line 690
    move-result-object v7

    .line 691
    .line 692
    .line 693
    invoke-virtual {v0, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 694
    .line 695
    sget v7, Lcom/kubi/margin/R$id;->tv_liquid_price:I

    .line 696
    .line 697
    new-instance v8, Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 701
    .line 702
    sget v10, Lcom/kubi/margin/R$string;->kc_futures_grid_force_price:I

    .line 703
    .line 704
    new-array v11, v5, [Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v15, v10, v11}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 708
    move-result-object v10

    .line 709
    .line 710
    .line 711
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 718
    move-result-object v10

    .line 719
    .line 720
    if-eqz v10, :cond_a

    .line 721
    .line 722
    .line 723
    invoke-virtual {v10}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 724
    move-result-object v10

    .line 725
    goto :goto_7

    .line 726
    :cond_a
    const/4 v10, 0x0

    .line 727
    .line 728
    .line 729
    :goto_7
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    const/16 v11, 0x29

    .line 732
    .line 733
    .line 734
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 738
    move-result-object v8

    .line 739
    .line 740
    .line 741
    invoke-virtual {v0, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 742
    .line 743
    sget v7, Lcom/kubi/margin/R$id;->tv_liquid_price_value:I

    .line 744
    .line 745
    if-eqz v3, :cond_b

    .line 746
    .line 747
    .line 748
    invoke-virtual {v3}, Lcom/kubi/margin/entity/IsolateMarginPositionConfig;->getFlDebtRatio()Ljava/math/BigDecimal;

    .line 749
    move-result-object v3

    .line 750
    goto :goto_8

    .line 751
    :cond_b
    const/4 v3, 0x0

    .line 752
    .line 753
    .line 754
    :goto_8
    invoke-virtual {v2, v3}, Lcom/kubi/margin/api/entity/MarginPosition;->liquidationPriceString(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 755
    move-result-object v3

    .line 756
    .line 757
    .line 758
    invoke-virtual {v0, v7, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 759
    .line 760
    sget v3, Lcom/kubi/margin/R$id;->tv_asset_label:I

    .line 761
    .line 762
    .line 763
    invoke-virtual {v0, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 764
    move-result-object v3

    .line 765
    .line 766
    check-cast v3, Lcom/kubi/resources/widget/DashTextView;

    .line 767
    const/4 v10, 0x1

    .line 768
    .line 769
    .line 770
    invoke-virtual {v3, v10}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 771
    .line 772
    new-instance v8, Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 776
    .line 777
    sget v10, Lcom/kubi/margin/R$string;->total_assets:I

    .line 778
    .line 779
    new-array v11, v5, [Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    invoke-virtual {v15, v10, v11}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 783
    move-result-object v10

    .line 784
    .line 785
    .line 786
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 793
    move-result-object v9

    .line 794
    .line 795
    if-eqz v9, :cond_c

    .line 796
    .line 797
    .line 798
    invoke-virtual {v9}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 799
    move-result-object v9

    .line 800
    goto :goto_9

    .line 801
    :cond_c
    const/4 v9, 0x0

    .line 802
    .line 803
    .line 804
    :goto_9
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    const/16 v11, 0x29

    .line 807
    .line 808
    .line 809
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 813
    move-result-object v8

    .line 814
    .line 815
    .line 816
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 817
    .line 818
    .line 819
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 820
    .line 821
    new-instance v8, Lcom/kubi/margin/trade/position/j0;

    .line 822
    .line 823
    .line 824
    invoke-direct {v8, v1, v2}, Lcom/kubi/margin/trade/position/j0;-><init>(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 825
    .line 826
    const/16 v25, 0x1

    .line 827
    .line 828
    const/16 v26, 0x0

    .line 829
    .line 830
    const-wide/16 v22, 0x0

    .line 831
    .line 832
    move-object/from16 v21, v3

    .line 833
    .line 834
    move-object/from16 v24, v8

    .line 835
    .line 836
    .line 837
    invoke-static/range {v21 .. v26}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 838
    .line 839
    sget v3, Lcom/kubi/margin/R$id;->tv_asset_value:I

    .line 840
    .line 841
    .line 842
    invoke-virtual {v0, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 843
    move-result-object v8

    .line 844
    .line 845
    .line 846
    invoke-static {v8, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 847
    .line 848
    check-cast v8, Landroid/widget/TextView;

    .line 849
    .line 850
    new-instance v9, Lrs/c$a;

    .line 851
    const/4 v10, 0x3

    .line 852
    const/4 v11, 0x0

    .line 853
    .line 854
    .line 855
    invoke-direct {v9, v5, v5, v10, v11}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 856
    const/4 v12, 0x2

    .line 857
    .line 858
    .line 859
    invoke-static {v8, v9, v5, v12, v11}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v0, v14}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 863
    move-result-object v8

    .line 864
    .line 865
    .line 866
    invoke-static {v8, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 867
    .line 868
    check-cast v8, Landroid/widget/TextView;

    .line 869
    .line 870
    new-instance v9, Lrs/c$a;

    .line 871
    .line 872
    .line 873
    invoke-direct {v9, v5, v5, v10, v11}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 874
    .line 875
    .line 876
    invoke-static {v8, v9, v5, v12, v11}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v0, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 880
    move-result-object v4

    .line 881
    .line 882
    .line 883
    invoke-static {v4, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 884
    .line 885
    check-cast v4, Landroid/widget/TextView;

    .line 886
    .line 887
    new-instance v8, Lrs/c$a;

    .line 888
    .line 889
    .line 890
    invoke-direct {v8, v5, v5, v10, v11}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 891
    .line 892
    .line 893
    invoke-static {v4, v8, v5, v12, v11}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 897
    move-result-object v4

    .line 898
    .line 899
    .line 900
    invoke-static {v4, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 901
    .line 902
    check-cast v4, Landroid/widget/TextView;

    .line 903
    .line 904
    .line 905
    invoke-static {v4, v11, v5, v10, v11}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v0, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 909
    move-result-object v4

    .line 910
    .line 911
    .line 912
    invoke-static {v4, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 913
    .line 914
    check-cast v4, Landroid/widget/TextView;

    .line 915
    .line 916
    .line 917
    invoke-static {v4, v11, v5, v10, v11}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 918
    .line 919
    .line 920
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getAssetQuoteBalanceString()Ljava/lang/String;

    .line 921
    move-result-object v4

    .line 922
    .line 923
    .line 924
    invoke-virtual {v0, v3, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 925
    .line 926
    sget v3, Lcom/kubi/margin/R$id;->tv_transfer:I

    .line 927
    .line 928
    .line 929
    invoke-virtual {v0, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 930
    move-result-object v3

    .line 931
    move-object v6, v3

    .line 932
    .line 933
    check-cast v6, Landroid/widget/TextView;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->isTransferEnable()Z

    .line 937
    move-result v3

    .line 938
    .line 939
    .line 940
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 941
    .line 942
    sget v3, Lcom/kubi/margin/R$string;->transfer:I

    .line 943
    .line 944
    new-array v4, v5, [Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    invoke-virtual {v15, v3, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 948
    move-result-object v3

    .line 949
    .line 950
    .line 951
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 952
    .line 953
    .line 954
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 955
    .line 956
    new-instance v9, Lcom/kubi/margin/trade/position/k0;

    .line 957
    .line 958
    .line 959
    invoke-direct {v9, v1, v2}, Lcom/kubi/margin/trade/position/k0;-><init>(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 960
    const/4 v10, 0x1

    .line 961
    const/4 v11, 0x0

    .line 962
    .line 963
    const-wide/16 v7, 0x0

    .line 964
    .line 965
    .line 966
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 967
    .line 968
    sget v3, Lcom/kubi/margin/R$id;->tv_return:I

    .line 969
    .line 970
    .line 971
    invoke-virtual {v0, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 972
    move-result-object v3

    .line 973
    move-object v4, v3

    .line 974
    .line 975
    check-cast v4, Landroid/widget/TextView;

    .line 976
    .line 977
    .line 978
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 979
    .line 980
    new-instance v7, Lcom/kubi/margin/trade/position/o;

    .line 981
    .line 982
    .line 983
    invoke-direct {v7, v2}, Lcom/kubi/margin/trade/position/o;-><init>(Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 984
    const/4 v8, 0x1

    .line 985
    const/4 v9, 0x0

    .line 986
    .line 987
    const-wide/16 v5, 0x0

    .line 988
    .line 989
    .line 990
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 991
    .line 992
    sget v3, Lcom/kubi/margin/R$id;->tv_close_position:I

    .line 993
    .line 994
    .line 995
    invoke-virtual {v0, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 996
    move-result-object v0

    .line 997
    move-object v3, v0

    .line 998
    .line 999
    check-cast v3, Landroid/widget/TextView;

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getStatus()Ljava/lang/String;

    .line 1003
    move-result-object v0

    .line 1004
    .line 1005
    const-string v4, "IN_LIQUIDATION"

    .line 1006
    .line 1007
    .line 1008
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1009
    move-result v0

    .line 1010
    .line 1011
    const-wide/16 v4, 0x12c

    .line 1012
    .line 1013
    if-eqz v0, :cond_d

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getStatusBizType()Ljava/lang/String;

    .line 1017
    move-result-object v0

    .line 1018
    .line 1019
    const-string v6, "ONE_CLICK_LIQUIDATION"

    .line 1020
    .line 1021
    .line 1022
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1023
    move-result v0

    .line 1024
    .line 1025
    if-eqz v0, :cond_d

    .line 1026
    .line 1027
    sget v0, Lcom/kubi/margin/R$string;->margin_cancel_close_position:I

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    .line 1031
    .line 1032
    sget v0, Lcom/kubi/margin/R$drawable;->selector_btn_primary_24r:I

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1036
    .line 1037
    sget v0, Lcom/kubi/margin/R$color;->c_textEmphasis:I

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v15, v0}, Lcom/kubi/utils/c;->a(I)I

    .line 1041
    move-result v0

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1045
    const/4 v10, 0x1

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 1049
    .line 1050
    .line 1051
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1052
    .line 1053
    .line 1054
    invoke-static {v3}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 1055
    .line 1056
    new-instance v0, Lcom/kubi/margin/trade/position/p;

    .line 1057
    .line 1058
    .line 1059
    invoke-direct {v0, v1, v2}, Lcom/kubi/margin/trade/position/p;-><init>(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 1060
    .line 1061
    .line 1062
    invoke-static {v3, v4, v5, v0}, Lcom/kubi/utils/extensions/k;->y(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V

    .line 1063
    .line 1064
    goto/16 :goto_b

    .line 1065
    .line 1066
    :cond_d
    sget v0, Lcom/kubi/margin/R$string;->kumex_liquidation:I

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    .line 1070
    .line 1071
    sget v0, Lcom/kubi/margin/R$drawable;->bmargin_selector_for_btn:I

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1078
    move-result-object v0

    .line 1079
    .line 1080
    sget v6, Lcom/kubi/margin/R$color;->selector_color_for_normal_btn_text:I

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 1084
    move-result-object v0

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 1088
    .line 1089
    const-string v0, "margin_close_position"

    .line 1090
    .line 1091
    :try_start_0
    sget-object v6, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 1092
    .line 1093
    new-instance v6, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter$a;

    .line 1094
    .line 1095
    .line 1096
    invoke-direct {v6}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter$a;-><init>()V

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 1100
    move-result-object v6

    .line 1101
    .line 1102
    const-string v7, "object : TypeToken<T>() {}.type"

    .line 1103
    .line 1104
    .line 1105
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1106
    .line 1107
    .line 1108
    invoke-static {v0, v6}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 1109
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1110
    goto :goto_a

    .line 1111
    :catchall_0
    move-exception v0

    .line 1112
    move-object v7, v0

    .line 1113
    .line 1114
    new-instance v6, Lcom/kubi/config/exception/KCConfigException;

    .line 1115
    .line 1116
    const/16 v11, 0x8

    .line 1117
    const/4 v12, 0x0

    .line 1118
    .line 1119
    const-string v8, "RemoteConfig"

    .line 1120
    const/4 v9, 0x0

    .line 1121
    const/4 v10, 0x0

    .line 1122
    .line 1123
    .line 1124
    invoke-direct/range {v6 .. v12}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1125
    const/4 v11, 0x0

    .line 1126
    const/4 v12, 0x2

    .line 1127
    .line 1128
    .line 1129
    invoke-static {v6, v11, v12, v11}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 1130
    move-object v10, v11

    .line 1131
    .line 1132
    :goto_a
    check-cast v10, Ljava/lang/Boolean;

    .line 1133
    .line 1134
    .line 1135
    invoke-static {v10}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 1136
    move-result v0

    .line 1137
    .line 1138
    if-eqz v0, :cond_e

    .line 1139
    .line 1140
    .line 1141
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1142
    .line 1143
    .line 1144
    invoke-static {v3}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->isCloseEnable()Z

    .line 1148
    move-result v0

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 1152
    .line 1153
    new-instance v0, Lcom/kubi/margin/trade/position/y;

    .line 1154
    .line 1155
    .line 1156
    invoke-direct {v0, v1, v2}, Lcom/kubi/margin/trade/position/y;-><init>(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 1157
    .line 1158
    .line 1159
    invoke-static {v3, v4, v5, v0}, Lcom/kubi/utils/extensions/k;->y(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V

    .line 1160
    goto :goto_b

    .line 1161
    .line 1162
    .line 1163
    :cond_e
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1164
    .line 1165
    .line 1166
    invoke-static {v3}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 1167
    goto :goto_b

    .line 1168
    .line 1169
    .line 1170
    :cond_f
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getSymbol()Ljava/lang/String;

    .line 1171
    move-result-object v3

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v1, v3}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->W(Ljava/lang/String;)Ljava/lang/String;

    .line 1175
    move-result-object v3

    .line 1176
    .line 1177
    sget v4, Lcom/kubi/margin/R$id;->view_empty:I

    .line 1178
    const/4 v10, 0x1

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual {v0, v4, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 1182
    .line 1183
    sget v4, Lcom/kubi/margin/R$id;->view_content:I

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v0, v4, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 1187
    .line 1188
    sget v4, Lcom/kubi/margin/R$id;->symbolName:I

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v0, v4, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 1192
    .line 1193
    sget v4, Lcom/kubi/margin/R$id;->tv_empty_tips:I

    .line 1194
    .line 1195
    sget-object v5, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 1196
    .line 1197
    sget v6, Lcom/kubi/margin/R$string;->margin_account_empty_tips:I

    .line 1198
    .line 1199
    sget v7, Lcom/kubi/margin/R$string;->margin_single_symbol_account:I

    .line 1200
    .line 1201
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1202
    .line 1203
    .line 1204
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 1205
    .line 1206
    const/16 v9, 0x2d

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1216
    move-result-object v3

    .line 1217
    .line 1218
    .line 1219
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1220
    move-result-object v3

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v5, v7, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1224
    move-result-object v3

    .line 1225
    .line 1226
    .line 1227
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1228
    move-result-object v3

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v5, v6, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1232
    move-result-object v3

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v0, v4, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 1236
    .line 1237
    sget v3, Lcom/kubi/margin/R$id;->tv_transfer_empty:I

    .line 1238
    .line 1239
    new-instance v4, Lcom/kubi/margin/trade/position/d0;

    .line 1240
    .line 1241
    .line 1242
    invoke-direct {v4, v1, v2}, Lcom/kubi/margin/trade/position/d0;-><init>(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v0, v3, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 1246
    :cond_10
    :goto_b
    return-void
.end method

.method public final S()Lcom/kubi/data/entity/SymbolInfoEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->i:Lcom/kubi/data/entity/SymbolInfoEntity;

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
.end method

.method public final T(Ljava/lang/Boolean;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Lcom/kubi/margin/api/entity/MarginPosition;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "--"

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {p1, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 8
    move-result v3

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    .line 12
    if-eqz v3, :cond_4

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getLiabilityConversionBalance()Ljava/math/BigDecimal;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 22
    move-result-object v6

    .line 23
    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v6}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getMarkPrice()Ljava/math/BigDecimal;

    .line 28
    move-result-object v6

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v6, v2

    .line 31
    .line 32
    :goto_0
    sget-object v7, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v6, v7}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 36
    move-result-object v3

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v3, v2

    .line 39
    .line 40
    :goto_1
    if-eqz v3, :cond_3

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 44
    move-result-object v6

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 50
    move-result-object v6

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v6, v2

    .line 53
    .line 54
    .line 55
    :goto_2
    invoke-static {v3, v6, v5, v4, v2}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 56
    move-result-object v3

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    move-object v3, v2

    .line 59
    .line 60
    .line 61
    :goto_3
    invoke-static {v3, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    move-result-object v0

    .line 63
    goto :goto_8

    .line 64
    .line 65
    .line 66
    :cond_4
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getLiabilityConversionBalance()Ljava/math/BigDecimal;

    .line 67
    move-result-object v3

    .line 68
    .line 69
    if-eqz v3, :cond_6

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 73
    move-result-object v6

    .line 74
    .line 75
    if-eqz v6, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getMarkPrice()Ljava/math/BigDecimal;

    .line 79
    move-result-object v6

    .line 80
    goto :goto_4

    .line 81
    :cond_5
    move-object v6, v2

    .line 82
    .line 83
    :goto_4
    sget-object v7, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v6, v7}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 87
    move-result-object v3

    .line 88
    goto :goto_5

    .line 89
    :cond_6
    move-object v3, v2

    .line 90
    .line 91
    :goto_5
    if-eqz v3, :cond_8

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 95
    move-result-object v6

    .line 96
    .line 97
    if-eqz v6, :cond_7

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 101
    move-result-object v6

    .line 102
    goto :goto_6

    .line 103
    :cond_7
    move-object v6, v2

    .line 104
    .line 105
    .line 106
    :goto_6
    invoke-static {v3, v6, v5, v4, v2}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 107
    move-result-object v3

    .line 108
    goto :goto_7

    .line 109
    :cond_8
    move-object v3, v2

    .line 110
    .line 111
    .line 112
    :goto_7
    invoke-static {v3, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    .line 115
    .line 116
    :catch_0
    :goto_8
    invoke-static {p1, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 117
    move-result p1

    .line 118
    .line 119
    if-eqz p1, :cond_a

    .line 120
    .line 121
    new-instance p1, Lkotlin/Pair;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 125
    move-result-object p2

    .line 126
    .line 127
    if-eqz p2, :cond_9

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 131
    move-result-object v2

    .line 132
    .line 133
    .line 134
    :cond_9
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    move-result-object p2

    .line 136
    .line 137
    .line 138
    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    goto :goto_9

    .line 140
    .line 141
    :cond_a
    new-instance p1, Lkotlin/Pair;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 145
    move-result-object p2

    .line 146
    .line 147
    if-eqz p2, :cond_b

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 151
    move-result-object v2

    .line 152
    .line 153
    .line 154
    :cond_b
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    move-result-object p2

    .line 156
    .line 157
    .line 158
    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    :goto_9
    return-object p1
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
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
.end method

.method public final U(Lcom/kubi/margin/api/entity/MarginPosition;)Ljava/lang/CharSequence;
    .locals 19

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->calculatorLiabilityRate()Ljava/math/BigDecimal;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 11
    move-result-wide v2

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 21
    move-result-wide v3

    .line 22
    .line 23
    sget-object v2, Lcom/kubi/margin/entity/LeverBean;->a:Lcom/kubi/margin/entity/LeverBean$Companion;

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getRiskGrade()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0}, Lcom/kubi/margin/entity/LeverBean$Companion;->getRiskGradeByString(Ljava/lang/String;)Ljava/util/List;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const-wide v5, 0x3fe3333333333333L    # 0.6

    .line 48
    .line 49
    .line 50
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    const-wide v5, 0x3feccccccccccccdL    # 0.9

    .line 60
    .line 61
    .line 62
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 70
    move-result v5

    .line 71
    const/4 v6, 0x2

    .line 72
    .line 73
    if-ge v5, v6, :cond_2

    .line 74
    .line 75
    const-string v0, "--"

    .line 76
    return-object v0

    .line 77
    .line 78
    .line 79
    :cond_2
    invoke-static {v1}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    .line 83
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getStatus()Ljava/lang/String;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    .line 87
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    move-result-object v5

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 92
    move-result v6

    .line 93
    .line 94
    const/16 v7, 0x20

    .line 95
    const/4 v8, 0x0

    .line 96
    .line 97
    .line 98
    sparse-switch v6, :sswitch_data_0

    .line 99
    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :sswitch_0
    const-string v6, "BANKRUPTCY"

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    move-result v5

    .line 107
    .line 108
    if-nez v5, :cond_6

    .line 109
    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    :sswitch_1
    const-string v6, "FROZEN_RENEW"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    move-result v5

    .line 117
    .line 118
    if-nez v5, :cond_3

    .line 119
    .line 120
    goto/16 :goto_1

    .line 121
    .line 122
    :sswitch_2
    const-string v6, "IN_AUTO_RENEW"

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    move-result v5

    .line 127
    .line 128
    if-nez v5, :cond_3

    .line 129
    .line 130
    goto/16 :goto_1

    .line 131
    .line 132
    :cond_3
    new-instance v0, Lcom/kubi/utils/v0;

    .line 133
    .line 134
    .line 135
    invoke-direct {v0}, Lcom/kubi/utils/v0;-><init>()V

    .line 136
    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 143
    .line 144
    sget v4, Lcom/kubi/margin/R$string;->margin_renew:I

    .line 145
    .line 146
    new-array v5, v8, [Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v4, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    move-result-object v4

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    move-result-object v1

    .line 164
    .line 165
    sget v2, Lcom/kubi/margin/R$color;->secondary:I

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 169
    move-result v2

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 173
    move-result-object v0

    .line 174
    .line 175
    .line 176
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 177
    return-object v0

    .line 178
    .line 179
    :sswitch_3
    const-string v6, "FROZEN_FL"

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    move-result v5

    .line 184
    .line 185
    if-nez v5, :cond_4

    .line 186
    goto :goto_1

    .line 187
    .line 188
    :sswitch_4
    const-string v6, "IN_LIQUIDATION"

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    move-result v5

    .line 193
    .line 194
    if-nez v5, :cond_4

    .line 195
    goto :goto_1

    .line 196
    .line 197
    :cond_4
    new-instance v0, Lcom/kubi/utils/v0;

    .line 198
    .line 199
    .line 200
    invoke-direct {v0}, Lcom/kubi/utils/v0;-><init>()V

    .line 201
    .line 202
    new-instance v2, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 206
    .line 207
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 208
    .line 209
    sget v4, Lcom/kubi/margin/R$string;->margin_liq_ing:I

    .line 210
    .line 211
    new-array v5, v8, [Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3, v4, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 215
    move-result-object v4

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    move-result-object v1

    .line 229
    .line 230
    sget v2, Lcom/kubi/margin/R$color;->secondary:I

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 234
    move-result v2

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 238
    move-result-object v0

    .line 239
    .line 240
    .line 241
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 242
    return-object v0

    .line 243
    .line 244
    :sswitch_5
    const-string v6, "LIABILITY"

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    move-result v5

    .line 249
    .line 250
    if-nez v5, :cond_6

    .line 251
    .line 252
    :goto_1
    new-instance v9, Lcom/kubi/utils/v0;

    .line 253
    .line 254
    .line 255
    invoke-direct {v9}, Lcom/kubi/utils/v0;-><init>()V

    .line 256
    .line 257
    const-wide/16 v5, 0x0

    .line 258
    .line 259
    cmpg-double v5, v5, v3

    .line 260
    .line 261
    if-gtz v5, :cond_5

    .line 262
    .line 263
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 264
    .line 265
    cmpg-double v5, v3, v5

    .line 266
    .line 267
    if-gtz v5, :cond_5

    .line 268
    .line 269
    new-instance v10, Ljava/math/BigDecimal;

    .line 270
    .line 271
    .line 272
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 273
    move-result-object v1

    .line 274
    .line 275
    .line 276
    invoke-direct {v10, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    const/16 v17, 0x2f

    .line 279
    .line 280
    const/16 v18, 0x0

    .line 281
    const/4 v11, 0x0

    .line 282
    const/4 v12, 0x0

    .line 283
    const/4 v13, 0x0

    .line 284
    const/4 v14, 0x0

    .line 285
    const/4 v15, 0x1

    .line 286
    .line 287
    const/16 v16, 0x0

    .line 288
    .line 289
    .line 290
    invoke-static/range {v10 .. v18}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 291
    move-result-object v1

    .line 292
    .line 293
    :cond_5
    sget-object v10, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 294
    .line 295
    .line 296
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    move-result-object v5

    .line 298
    .line 299
    check-cast v5, Ljava/lang/Number;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    .line 303
    move-result-wide v5

    .line 304
    const/4 v7, 0x1

    .line 305
    .line 306
    .line 307
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 308
    move-result-object v0

    .line 309
    .line 310
    check-cast v0, Ljava/lang/Number;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 314
    move-result-wide v7

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v2 .. v8}, Lcom/kubi/margin/entity/LeverBean$Companion;->getColorByRate(DDD)I

    .line 318
    move-result v0

    .line 319
    .line 320
    .line 321
    invoke-virtual {v10, v0}, Lcom/kubi/utils/c;->a(I)I

    .line 322
    move-result v0

    .line 323
    .line 324
    .line 325
    invoke-virtual {v9, v1, v0}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 326
    move-result-object v0

    .line 327
    .line 328
    .line 329
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 330
    return-object v0

    .line 331
    .line 332
    :cond_6
    new-instance v0, Lcom/kubi/utils/v0;

    .line 333
    .line 334
    .line 335
    invoke-direct {v0}, Lcom/kubi/utils/v0;-><init>()V

    .line 336
    .line 337
    new-instance v2, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 343
    .line 344
    sget v4, Lcom/kubi/margin/R$string;->liability:I

    .line 345
    .line 346
    new-array v5, v8, [Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v3, v4, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 350
    move-result-object v4

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    move-result-object v1

    .line 364
    .line 365
    sget v2, Lcom/kubi/margin/R$color;->secondary:I

    .line 366
    .line 367
    .line 368
    invoke-virtual {v3, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 369
    move-result v2

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 373
    move-result-object v0

    .line 374
    .line 375
    .line 376
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 377
    return-object v0

    .line 378
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x793bff13 -> :sswitch_5
        -0x3f3c1d01 -> :sswitch_4
        -0x3e979d3b -> :sswitch_3
        -0x129660c9 -> :sswitch_2
        0x1325040e -> :sswitch_1
        0x571f3379 -> :sswitch_0
    .end sparse-switch
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
.end method

.method public final V(Ljava/lang/Boolean;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Lcom/kubi/margin/api/entity/MarginPosition;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 5
    move-result p1

    .line 6
    .line 7
    const-string v0, "--"

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    new-instance p1, Lkotlin/Pair;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v2, v1

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-static {p2}, Lzo/a;->q(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-static {v1, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object p2

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, v2, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    return-object p1

    .line 47
    .line 48
    :cond_2
    new-instance p1, Lkotlin/Pair;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 58
    move-result-object v2

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move-object v2, v1

    .line 61
    .line 62
    .line 63
    :goto_1
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    move-result-object v2

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 68
    move-result-object p2

    .line 69
    .line 70
    if-eqz p2, :cond_4

    .line 71
    .line 72
    .line 73
    invoke-static {p2}, Lzo/a;->q(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-static {v1, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    move-result-object p2

    .line 79
    .line 80
    .line 81
    invoke-direct {p1, v2, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    return-object p1
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
.end method

.method public final W(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x2

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    const-string v2, "-"

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    const/4 v5, 0x4

    .line 22
    const/4 v6, 0x0

    .line 23
    .line 24
    const-string v2, "-"

    .line 25
    .line 26
    const-string v3, "/"

    .line 27
    const/4 v4, 0x0

    .line 28
    move-object v1, p1

    .line 29
    .line 30
    .line 31
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_1
    move-object v1, p1

    .line 35
    return-object v1

    .line 36
    .line 37
    :cond_2
    :goto_0
    const-string p1, "--"

    .line 38
    return-object p1
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
.end method

.method public final X(Lcom/kubi/margin/api/entity/MarginPosition;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget v1, Lcom/kubi/margin/R$string;->margin_cancel_close_position:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/margin/R$string;->margin_cancel_close_position_desc:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->J4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sget v1, Lcom/kubi/margin/R$string;->cancel:I

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->P4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    sget v1, Lcom/kubi/margin/R$string;->confirm:I

    .line 28
    .line 29
    new-instance v2, Lcom/kubi/margin/trade/position/v;

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, p0, p1}, Lcom/kubi/margin/trade/position/v;-><init>(Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    iget-object v0, p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    const-string v1, "getChildFragmentManager(...)"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    const-string v1, "tips_auto"

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final Z(Lcom/kubi/data/entity/SymbolInfoEntity;)V
    .locals 1
    .param p1    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->i:Lcom/kubi/data/entity/SymbolInfoEntity;

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
.end method

.method public final a0(Lcom/kubi/margin/api/entity/MarginPosition;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/DialogFragmentHelper;->p0:Lcom/kubi/resources/dialog/DialogFragmentHelper$Companion;

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$layout;->bmargin_dialog_isolate_account_debet:I

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/DialogFragmentHelper$Companion;->newInstance(IZ)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Lcom/kubi/margin/trade/position/t;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p1}, Lcom/kubi/margin/trade/position/t;-><init>(Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->f4(Lkotlin/jvm/functions/Function2;)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    const-string v1, "getChildFragmentManager(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    const-string v1, "showAssetDebtDialog"

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 35
    return-void
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
.end method

.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/margin/api/entity/MarginPosition;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->F(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/api/entity/MarginPosition;)V

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
.end method

.method public final e0(Lcom/kubi/margin/api/entity/MarginPosition;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/DialogFragmentHelper;->p0:Lcom/kubi/resources/dialog/DialogFragmentHelper$Companion;

    .line 3
    .line 4
    sget v1, Lcom/kubi/margin/R$layout;->bmargin_dialog_isolate_account_detail:I

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/DialogFragmentHelper$Companion;->newInstance(IZ)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Lcom/kubi/margin/trade/position/u;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p1}, Lcom/kubi/margin/trade/position/u;-><init>(Lcom/kubi/margin/api/entity/MarginPosition;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->f4(Lkotlin/jvm/functions/Function2;)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    const-string v1, "getChildFragmentManager(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    const-string v1, "tv_asset_label"

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 35
    return-void
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
.end method

.method public final j0(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/margin/entity/IsolateMarginPositionConfig;)V
    .locals 23

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    sget-object v1, Lgf/n;->a:Lgf/n;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lgf/n;->B(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iget-object v2, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 15
    .line 16
    sget v3, Lcom/kubi/margin/R$string;->margin_single_symbol_account:I

    .line 17
    .line 18
    new-instance v4, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    const/16 v5, 0x2d

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    const/4 v5, 0x0

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getShowSymbol()Ljava/lang/String;

    .line 33
    move-result-object v6

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v6, v5

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v6

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    .line 49
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 50
    move-result-object v4

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    const-string v3, "getString(...)"

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getStatus()Ljava/lang/String;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 71
    move-result v6

    .line 72
    .line 73
    const-string v7, "IN_LIQUIDATION"

    .line 74
    .line 75
    const-string v8, "FROZEN_FL"

    .line 76
    .line 77
    const-string v9, "LIABILITY"

    .line 78
    .line 79
    const-string v10, "BANKRUPTCY"

    .line 80
    .line 81
    .line 82
    sparse-switch v6, :sswitch_data_0

    .line 83
    goto :goto_1

    .line 84
    .line 85
    .line 86
    :sswitch_0
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    move-result v6

    .line 88
    .line 89
    if-nez v6, :cond_4

    .line 90
    goto :goto_1

    .line 91
    .line 92
    .line 93
    :sswitch_1
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    move-result v6

    .line 95
    .line 96
    if-nez v6, :cond_1

    .line 97
    goto :goto_1

    .line 98
    .line 99
    .line 100
    :sswitch_2
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    move-result v6

    .line 102
    .line 103
    if-nez v6, :cond_1

    .line 104
    goto :goto_1

    .line 105
    .line 106
    :cond_1
    new-instance v6, Lcom/kubi/utils/v0;

    .line 107
    .line 108
    .line 109
    invoke-direct {v6}, Lcom/kubi/utils/v0;-><init>()V

    .line 110
    .line 111
    iget-object v11, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 112
    .line 113
    sget v12, Lcom/kubi/margin/R$string;->margin_dialog_liquidation_tips:I

    .line 114
    .line 115
    .line 116
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    .line 120
    invoke-virtual {v11, v12, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    move-result-object v2

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v2}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 125
    move-result-object v2

    .line 126
    .line 127
    .line 128
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 129
    .line 130
    goto/16 :goto_4

    .line 131
    .line 132
    .line 133
    :sswitch_3
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    move-result v6

    .line 135
    .line 136
    if-nez v6, :cond_4

    .line 137
    .line 138
    :goto_1
    new-instance v2, Lcom/kubi/utils/v0;

    .line 139
    .line 140
    .line 141
    invoke-direct {v2}, Lcom/kubi/utils/v0;-><init>()V

    .line 142
    .line 143
    new-instance v6, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    iget-object v11, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 149
    .line 150
    sget v12, Lcom/kubi/margin/R$string;->kc_margin_riskrate_description:I

    .line 151
    .line 152
    .line 153
    invoke-virtual {v11, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 154
    move-result-object v11

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const/16 v11, 0xa

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    move-result-object v6

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 170
    .line 171
    new-instance v6, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    iget-object v12, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 177
    .line 178
    sget v13, Lcom/kubi/margin/R$string;->kc_margin_pledge_rate_description:I

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v13}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 182
    move-result-object v12

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    move-result-object v6

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 196
    .line 197
    new-instance v6, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    .line 202
    iget-object v12, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 203
    .line 204
    sget v13, Lcom/kubi/margin/R$string;->kc_margin_pledge_rate_description2:I

    .line 205
    .line 206
    if-eqz p2, :cond_2

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/margin/entity/IsolateMarginPositionConfig;->getTransferOutMaxDebtRatio()Ljava/math/BigDecimal;

    .line 210
    move-result-object v14

    .line 211
    .line 212
    if-eqz v14, :cond_2

    .line 213
    .line 214
    const/16 v21, 0x3f

    .line 215
    .line 216
    const/16 v22, 0x0

    .line 217
    const/4 v15, 0x0

    .line 218
    .line 219
    const/16 v16, 0x0

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const/16 v18, 0x0

    .line 224
    .line 225
    const/16 v19, 0x0

    .line 226
    .line 227
    const/16 v20, 0x0

    .line 228
    .line 229
    .line 230
    invoke-static/range {v14 .. v22}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 231
    move-result-object v14

    .line 232
    goto :goto_2

    .line 233
    :cond_2
    move-object v14, v5

    .line 234
    .line 235
    .line 236
    :goto_2
    invoke-static {v14}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 237
    move-result-object v14

    .line 238
    .line 239
    .line 240
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 241
    move-result-object v14

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v13, v14}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 245
    move-result-object v12

    .line 246
    .line 247
    .line 248
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    move-result-object v6

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 259
    .line 260
    new-instance v6, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .line 265
    iget-object v12, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 266
    .line 267
    sget v13, Lcom/kubi/margin/R$string;->kc_margin_riskrate_description2:I

    .line 268
    .line 269
    if-eqz p2, :cond_3

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/margin/entity/IsolateMarginPositionConfig;->getFlDebtRatio()Ljava/math/BigDecimal;

    .line 273
    move-result-object v14

    .line 274
    .line 275
    if-eqz v14, :cond_3

    .line 276
    .line 277
    const/16 v21, 0x3f

    .line 278
    .line 279
    const/16 v22, 0x0

    .line 280
    const/4 v15, 0x0

    .line 281
    .line 282
    const/16 v16, 0x0

    .line 283
    .line 284
    const/16 v17, 0x0

    .line 285
    .line 286
    const/16 v18, 0x0

    .line 287
    .line 288
    const/16 v19, 0x0

    .line 289
    .line 290
    const/16 v20, 0x0

    .line 291
    .line 292
    .line 293
    invoke-static/range {v14 .. v22}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 294
    move-result-object v14

    .line 295
    goto :goto_3

    .line 296
    :cond_3
    move-object v14, v5

    .line 297
    .line 298
    .line 299
    :goto_3
    invoke-static {v14}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    move-result-object v14

    .line 301
    .line 302
    .line 303
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 304
    move-result-object v14

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v13, v14}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 308
    move-result-object v12

    .line 309
    .line 310
    .line 311
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    move-result-object v6

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 322
    goto :goto_4

    .line 323
    .line 324
    :cond_4
    new-instance v6, Lcom/kubi/utils/v0;

    .line 325
    .line 326
    .line 327
    invoke-direct {v6}, Lcom/kubi/utils/v0;-><init>()V

    .line 328
    .line 329
    iget-object v11, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 330
    .line 331
    sget v12, Lcom/kubi/margin/R$string;->margin_dialog_liability_tips:I

    .line 332
    .line 333
    .line 334
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 335
    move-result-object v2

    .line 336
    .line 337
    .line 338
    invoke-virtual {v11, v12, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 339
    move-result-object v2

    .line 340
    .line 341
    .line 342
    invoke-virtual {v6, v2}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 343
    move-result-object v2

    .line 344
    .line 345
    .line 346
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    :goto_4
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 350
    move-result v6

    .line 351
    .line 352
    .line 353
    sparse-switch v6, :sswitch_data_1

    .line 354
    goto :goto_5

    .line 355
    .line 356
    .line 357
    :sswitch_4
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    move-result v6

    .line 359
    .line 360
    if-nez v6, :cond_6

    .line 361
    goto :goto_5

    .line 362
    .line 363
    .line 364
    :sswitch_5
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    move-result v6

    .line 366
    .line 367
    if-nez v6, :cond_5

    .line 368
    goto :goto_5

    .line 369
    .line 370
    .line 371
    :sswitch_6
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    move-result v6

    .line 373
    .line 374
    if-nez v6, :cond_5

    .line 375
    goto :goto_5

    .line 376
    .line 377
    :cond_5
    sget v6, Lcom/kubi/margin/R$string;->margin_liq_ing:I

    .line 378
    goto :goto_6

    .line 379
    .line 380
    .line 381
    :sswitch_7
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    move-result v6

    .line 383
    .line 384
    if-nez v6, :cond_6

    .line 385
    .line 386
    :goto_5
    sget v6, Lcom/kubi/margin/R$string;->debt_ratio:I

    .line 387
    goto :goto_6

    .line 388
    .line 389
    :cond_6
    sget v6, Lcom/kubi/margin/R$string;->liability:I

    .line 390
    .line 391
    :goto_6
    sget v7, Lcom/kubi/margin/R$string;->debt_ratio:I

    .line 392
    .line 393
    if-ne v6, v7, :cond_7

    .line 394
    .line 395
    sget-object v11, Lq30/h;->a:Lq30/h;

    .line 396
    .line 397
    iget-object v1, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v1, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 401
    move-result-object v13

    .line 402
    .line 403
    .line 404
    invoke-static {v13, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 408
    move-result-object v14

    .line 409
    .line 410
    iget-object v1, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 411
    .line 412
    sget v2, Lcom/kubi/margin/R$string;->i_already_know:I

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 416
    move-result-object v15

    .line 417
    .line 418
    .line 419
    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 420
    .line 421
    iget-object v1, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 425
    move-result-object v12

    .line 426
    .line 427
    const-string v1, "getChildFragmentManager(...)"

    .line 428
    .line 429
    .line 430
    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 431
    .line 432
    new-instance v16, Lcom/kubi/margin/trade/position/q;

    .line 433
    .line 434
    .line 435
    invoke-direct/range {v16 .. v16}, Lcom/kubi/margin/trade/position/q;-><init>()V

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v11 .. v16}, Lq30/h;->d(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 439
    return-void

    .line 440
    .line 441
    :cond_7
    sget-object v3, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 445
    move-result-object v3

    .line 446
    .line 447
    .line 448
    invoke-virtual {v3, v6}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 449
    move-result-object v3

    .line 450
    .line 451
    .line 452
    invoke-virtual {v3, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->L4(Landroid/text/SpannableStringBuilder;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 453
    move-result-object v2

    .line 454
    .line 455
    new-instance v3, Lcom/kubi/margin/trade/position/r;

    .line 456
    .line 457
    .line 458
    invoke-direct {v3}, Lcom/kubi/margin/trade/position/r;-><init>()V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2, v3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->G4(Lcom/kubi/resources/dialog/DialogFragmentHelper$b;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 462
    move-result-object v2

    .line 463
    .line 464
    iget-object v3, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 465
    .line 466
    sget v6, Lcom/kubi/margin/R$string;->i_already_know:I

    .line 467
    .line 468
    .line 469
    invoke-virtual {v3, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 470
    move-result-object v3

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2, v3, v5}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->T4(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 474
    move-result-object v2

    .line 475
    .line 476
    if-eqz v1, :cond_a

    .line 477
    .line 478
    .line 479
    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 480
    move-result v3

    .line 481
    .line 482
    if-nez v3, :cond_8

    .line 483
    .line 484
    .line 485
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 486
    move-result v3

    .line 487
    .line 488
    if-eqz v3, :cond_9

    .line 489
    .line 490
    :cond_8
    iget-object v3, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 491
    .line 492
    sget v4, Lcom/kubi/margin/R$string;->go_transfer:I

    .line 493
    .line 494
    .line 495
    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 496
    move-result-object v3

    .line 497
    .line 498
    new-instance v4, Lcom/kubi/margin/trade/position/s;

    .line 499
    .line 500
    .line 501
    invoke-direct {v4, v1}, Lcom/kubi/margin/trade/position/s;-><init>(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2, v3, v4}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->Q4(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 505
    .line 506
    :cond_9
    iget-object v1, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 510
    move-result-object v1

    .line 511
    .line 512
    .line 513
    invoke-virtual {v2, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

    .line 514
    :cond_a
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x793bff13 -> :sswitch_3
        -0x3f3c1d01 -> :sswitch_2
        -0x3e979d3b -> :sswitch_1
        0x571f3379 -> :sswitch_0
    .end sparse-switch

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
    :sswitch_data_1
    .sparse-switch
        -0x793bff13 -> :sswitch_7
        -0x3f3c1d01 -> :sswitch_6
        -0x3e979d3b -> :sswitch_5
        0x571f3379 -> :sswitch_4
    .end sparse-switch
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
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
.end method

.method public final n0(Lcom/kubi/margin/api/entity/MarginPosition;Z)Landroid/graphics/Bitmap;
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p2

    .line 5
    .line 6
    iget-object v2, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    sget v3, Lcom/kubi/margin/R$layout;->bmargin_view_share_margin_position_image:I

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    move-result-object v6

    .line 23
    .line 24
    new-instance v2, Lio/chad/library/adapter/base/BaseViewHolder;

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, v6}, Lio/chad/library/adapter/base/BaseViewHolder;-><init>(Landroid/view/View;)V

    .line 28
    .line 29
    sget v3, Lcom/kubi/margin/R$id;->symbol:I

    .line 30
    .line 31
    new-instance v7, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getSymbol()Ljava/lang/String;

    .line 38
    move-result-object v8

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v8}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->W(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v8

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v8, "  "

    .line 48
    .line 49
    .line 50
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    sget-object v8, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 53
    .line 54
    sget v9, Lcom/kubi/margin/R$string;->lever:I

    .line 55
    .line 56
    new-array v10, v5, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, v9, v10}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    move-result-object v8

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    move-result-object v7

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v3, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 71
    .line 72
    sget v3, Lcom/kubi/margin/R$id;->side:I

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 76
    move-result-object v7

    .line 77
    .line 78
    if-eqz v7, :cond_0

    .line 79
    .line 80
    .line 81
    invoke-static {v7, v1}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 82
    move-result v7

    .line 83
    .line 84
    .line 85
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    move-result-object v7

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    move-object v7, v4

    .line 89
    .line 90
    :goto_0
    sget v8, Lcom/kubi/margin/R$color;->primary:I

    .line 91
    .line 92
    .line 93
    invoke-static {v7, v8}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 94
    move-result v7

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v3, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 98
    .line 99
    sget v3, Lcom/kubi/margin/R$id;->lever:I

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 103
    move-result-object v7

    .line 104
    .line 105
    if-eqz v7, :cond_1

    .line 106
    .line 107
    .line 108
    invoke-static {v7, v1}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 109
    move-result v7

    .line 110
    .line 111
    .line 112
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    move-result-object v7

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    move-object v7, v4

    .line 116
    .line 117
    .line 118
    :goto_1
    invoke-static {v7, v8}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 119
    move-result v7

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v3, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 123
    const/4 v3, 0x2

    .line 124
    const/4 v7, 0x1

    .line 125
    .line 126
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->totalConversionCompat()Ljava/math/BigDecimal;

    .line 133
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    const-string v10, "1"

    .line 136
    .line 137
    if-eqz v9, :cond_3

    .line 138
    .line 139
    .line 140
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->totalConversionCompat()Ljava/math/BigDecimal;

    .line 141
    move-result-object v11

    .line 142
    .line 143
    if-eqz v11, :cond_2

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->liabilityConversionCompat()Ljava/math/BigDecimal;

    .line 147
    move-result-object v12

    .line 148
    .line 149
    .line 150
    invoke-static {v12, v4, v7, v4}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 151
    move-result-object v12

    .line 152
    .line 153
    .line 154
    invoke-virtual {v11, v12}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 155
    move-result-object v11

    .line 156
    goto :goto_2

    .line 157
    :cond_2
    move-object v11, v4

    .line 158
    .line 159
    .line 160
    :goto_2
    invoke-static {v11, v10}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 161
    move-result-object v11

    .line 162
    .line 163
    sget-object v12, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v9, v11, v3, v12}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 167
    move-result-object v9

    .line 168
    goto :goto_3

    .line 169
    :cond_3
    move-object v9, v4

    .line 170
    .line 171
    .line 172
    :goto_3
    invoke-static {v9, v10}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 173
    move-result-object v11

    .line 174
    .line 175
    sget-object v12, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 176
    .line 177
    const/16 v19, 0x7c

    .line 178
    .line 179
    const/16 v20, 0x0

    .line 180
    const/4 v13, 0x1

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    .line 184
    const/16 v16, 0x0

    .line 185
    .line 186
    const/16 v17, 0x0

    .line 187
    .line 188
    const/16 v18, 0x0

    .line 189
    .line 190
    .line 191
    invoke-static/range {v11 .. v20}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 192
    move-result-object v9

    .line 193
    .line 194
    .line 195
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v9, "x "

    .line 198
    .line 199
    .line 200
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    move-result-object v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 205
    goto :goto_4

    .line 206
    .line 207
    :catch_0
    const-string v8, "-"

    .line 208
    .line 209
    :goto_4
    sget v9, Lcom/kubi/margin/R$id;->lever:I

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v9, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 213
    .line 214
    sget v8, Lcom/kubi/margin/R$id;->side:I

    .line 215
    .line 216
    sget-object v9, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 217
    .line 218
    if-eqz v1, :cond_4

    .line 219
    .line 220
    sget v1, Lcom/kubi/margin/R$string;->long_stub:I

    .line 221
    goto :goto_5

    .line 222
    .line 223
    :cond_4
    sget v1, Lcom/kubi/margin/R$string;->short_stub:I

    .line 224
    .line 225
    :goto_5
    const-string v10, ""

    .line 226
    .line 227
    .line 228
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 229
    move-result-object v10

    .line 230
    .line 231
    .line 232
    invoke-virtual {v9, v1, v10}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 233
    move-result-object v1

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v8, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->calculatorProfitPercent()Ljava/math/BigDecimal;

    .line 240
    move-result-object v1

    .line 241
    .line 242
    .line 243
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 244
    move-result-wide v10

    .line 245
    .line 246
    sget v1, Lcom/kubi/margin/R$id;->percent:I

    .line 247
    .line 248
    iget-object v8, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 252
    move-result-object v8

    .line 253
    .line 254
    const-string v12, "requireContext(...)"

    .line 255
    .line 256
    .line 257
    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    sget v12, Lcom/kubi/margin/R$color;->emphasis:I

    .line 260
    .line 261
    .line 262
    invoke-static {v8, v10, v11, v12}, Lcom/kubi/resources/g;->c(Landroid/content/Context;DI)I

    .line 263
    move-result v8

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v1, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getProfitRateString()Ljava/lang/String;

    .line 270
    move-result-object v8

    .line 271
    .line 272
    const-string v12, "--"

    .line 273
    .line 274
    .line 275
    invoke-static {v8, v12}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    move-result-object v8

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v1, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    const-wide v12, 0x3fd3333333333333L    # 0.3

    .line 285
    .line 286
    cmpl-double v1, v10, v12

    .line 287
    .line 288
    if-ltz v1, :cond_5

    .line 289
    .line 290
    sget v1, Lcom/kubi/margin/R$mipmap;->ic_share_back_two:I

    .line 291
    goto :goto_6

    .line 292
    .line 293
    :cond_5
    const-wide/16 v12, 0x0

    .line 294
    .line 295
    cmpl-double v1, v10, v12

    .line 296
    .line 297
    if-ltz v1, :cond_6

    .line 298
    .line 299
    sget v1, Lcom/kubi/margin/R$mipmap;->ic_share_back_one:I

    .line 300
    goto :goto_6

    .line 301
    .line 302
    :cond_6
    sget v1, Lcom/kubi/margin/R$mipmap;->ic_share_back_three:I

    .line 303
    .line 304
    :goto_6
    sget v8, Lcom/kubi/margin/R$id;->image:I

    .line 305
    .line 306
    .line 307
    invoke-static {v9, v1, v4, v3, v4}, Lcom/kubi/utils/c;->d(Lcom/kubi/utils/c;ILjava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/drawable/Drawable;

    .line 308
    move-result-object v1

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v8, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setImageDrawable(ILandroid/graphics/drawable/Drawable;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 312
    .line 313
    sget v1, Lcom/kubi/margin/R$id;->markPrice:I

    .line 314
    .line 315
    new-instance v3, Lcom/kubi/utils/v0;

    .line 316
    .line 317
    .line 318
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 319
    .line 320
    sget v8, Lcom/kubi/margin/R$string;->mark_price:I

    .line 321
    .line 322
    new-array v5, v5, [Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v9, v8, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 326
    move-result-object v5

    .line 327
    .line 328
    .line 329
    invoke-virtual {v3, v5}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 330
    move-result-object v3

    .line 331
    .line 332
    const-string v5, "\n"

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3, v5}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 336
    move-result-object v3

    .line 337
    .line 338
    new-instance v5, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getMarkPriceString()Ljava/lang/String;

    .line 345
    move-result-object v8

    .line 346
    .line 347
    .line 348
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 352
    move-result-object v8

    .line 353
    .line 354
    if-eqz v8, :cond_7

    .line 355
    .line 356
    .line 357
    invoke-virtual {v8}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 358
    move-result-object v4

    .line 359
    .line 360
    .line 361
    :cond_7
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    move-result-object v4

    .line 363
    .line 364
    .line 365
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 369
    move-result-object v4

    .line 370
    .line 371
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    .line 372
    .line 373
    sget v8, Lcom/kubi/margin/R$color;->c_e1e8f5:I

    .line 374
    .line 375
    .line 376
    invoke-virtual {v9, v8}, Lcom/kubi/utils/c;->a(I)I

    .line 377
    move-result v8

    .line 378
    .line 379
    .line 380
    invoke-direct {v5, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 381
    .line 382
    new-instance v8, Landroid/text/style/AbsoluteSizeSpan;

    .line 383
    .line 384
    const/16 v9, 0xe

    .line 385
    .line 386
    .line 387
    invoke-direct {v8, v9, v7}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 388
    .line 389
    .line 390
    filled-new-array {v5, v8}, [Ljava/lang/Object;

    .line 391
    move-result-object v5

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3, v4, v5}, Lcom/kubi/utils/v0;->c(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/kubi/utils/v0;

    .line 395
    move-result-object v3

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 399
    .line 400
    const-string v1, "apply(...)"

    .line 401
    .line 402
    .line 403
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    iget-object v1, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 406
    .line 407
    const/16 v2, 0x168

    .line 408
    .line 409
    .line 410
    invoke-static {v1, v2}, Lcom/kubi/utils/extensions/core/c;->f(Landroidx/fragment/app/Fragment;I)I

    .line 411
    move-result v7

    .line 412
    .line 413
    iget-object v1, v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 414
    .line 415
    const/16 v2, 0x280

    .line 416
    .line 417
    .line 418
    invoke-static {v1, v2}, Lcom/kubi/utils/extensions/core/c;->f(Landroidx/fragment/app/Fragment;I)I

    .line 419
    move-result v8

    .line 420
    const/4 v10, 0x4

    .line 421
    const/4 v11, 0x0

    .line 422
    const/4 v9, 0x0

    .line 423
    .line 424
    .line 425
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/core/ViewExtKt;->x(Landroid/view/View;IIIILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 426
    move-result-object v1

    .line 427
    return-object v1
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
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
.end method

.method public final o0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4tradingIsolated"

    .line 6
    .line 7
    const-string v1, "orderManagement"

    .line 8
    .line 9
    const-string v2, "13"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    sget-object v0, Lcom/kubi/margin/trade/MarginConfigManager;->a:Lcom/kubi/margin/trade/MarginConfigManager;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;->j:Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 18
    .line 19
    new-instance v2, Lcom/kubi/margin/trade/position/w;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p1, p2}, Lcom/kubi/margin/trade/position/w;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lcom/kubi/margin/trade/MarginConfigManager;->Z(Lcom/kubi/sdk/BaseFragment;Lkotlin/jvm/functions/Function0;)V

    .line 26
    return-void
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
.end method
