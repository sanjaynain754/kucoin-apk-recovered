.class public final Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "SymbolsListAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0015J\u0018\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001f*\u00020\u00022\u0008\u0008\u0002\u0010 \u001a\u00020\u0014H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018\u00a8\u0006!"
    }
    d2 = {
        "Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "fragment",
        "Lcom/kubi/sdk/base/ui/OldBaseFragment;",
        "toMarket",
        "",
        "symbols",
        "",
        "tradeItemBean",
        "<init>",
        "(Lcom/kubi/sdk/base/ui/OldBaseFragment;ZLjava/lang/String;Lcom/kubi/data/entity/TradeItemBean;)V",
        "getFragment",
        "()Lcom/kubi/sdk/base/ui/OldBaseFragment;",
        "getTradeItemBean",
        "()Lcom/kubi/data/entity/TradeItemBean;",
        "setTradeItemBean",
        "(Lcom/kubi/data/entity/TradeItemBean;)V",
        "indexLongClick",
        "",
        "getIndexLongClick",
        "()I",
        "setIndexLongClick",
        "(I)V",
        "convert",
        "",
        "helper",
        "item",
        "position",
        "getPairShowSymbol",
        "Lcom/kubi/utils/StyledText;",
        "fontSize",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSymbolsListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolsListAdapter.kt\ncom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,181:1\n25#2,2:182\n17#2,2:184\n27#2:186\n17#2,2:187\n43#3,7:189\n*S KotlinDebug\n*F\n+ 1 SymbolsListAdapter.kt\ncom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter\n*L\n59#1:182,2\n62#1:184,2\n59#1:186\n97#1:187,2\n131#1:189,7\n*E\n"
    }
.end annotation


# instance fields
.field public final i:Lcom/kubi/sdk/base/ui/OldBaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Z

.field public final k:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public l:Lcom/kubi/data/entity/TradeItemBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:I


# direct methods
.method public constructor <init>(Lcom/kubi/sdk/base/ui/OldBaseFragment;ZLjava/lang/String;Lcom/kubi/data/entity/TradeItemBean;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/base/ui/OldBaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget v0, Lcom/kubi/spot/R$layout;->item_view_toggle_symbols:I

    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(I)V

    .line 4
    iput-object p1, p0, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->i:Lcom/kubi/sdk/base/ui/OldBaseFragment;

    .line 5
    iput-boolean p2, p0, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->j:Z

    .line 6
    iput-object p3, p0, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->k:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->l:Lcom/kubi/data/entity/TradeItemBean;

    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setHasStableIds(Z)V

    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->m:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/sdk/base/ui/OldBaseFragment;ZLjava/lang/String;Lcom/kubi/data/entity/TradeItemBean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 1
    const-string p3, ""

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 2
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;-><init>(Lcom/kubi/sdk/base/ui/OldBaseFragment;ZLjava/lang/String;Lcom/kubi/data/entity/TradeItemBean;)V

    return-void
.end method

.method public static synthetic g(Lcom/kubi/data/entity/TradeItemBean;Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;Lio/chad/library/adapter/base/BaseViewHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->i(Lcom/kubi/data/entity/TradeItemBean;Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;Lio/chad/library/adapter/base/BaseViewHolder;Landroid/view/View;)V

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
.end method

.method public static final i(Lcom/kubi/data/entity/TradeItemBean;Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;Lio/chad/library/adapter/base/BaseViewHolder;Landroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p3}, Lcom/kubi/utils/a1;->a(Landroid/view/View;)Z

    .line 4
    move-result p3

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/data/entity/TradeItemBean;->needPullPreviewInfo()Z

    .line 11
    move-result p3

    .line 12
    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    sget-object p2, Lcom/kubi/spot/api/ISpotService;->a:Lcom/kubi/spot/api/ISpotService$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lcom/kubi/spot/api/ISpotService$Companion;->get()Lcom/kubi/spot/api/ISpotService;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    iget-object v1, p1, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 22
    const/4 v4, 0x4

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    move-object v2, p0

    .line 26
    .line 27
    .line 28
    invoke-static/range {v0 .. v5}, Lcom/kubi/spot/api/ISpotService;->d(Lcom/kubi/spot/api/ISpotService;Landroid/content/Context;Lcom/kubi/data/entity/TradeItemBean;Ljava/lang/String;ILjava/lang/Object;)V

    .line 29
    return-void

    .line 30
    :cond_1
    move-object v2, p0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 34
    move-result p0

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v2, p0}, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->o(Lcom/kubi/data/entity/TradeItemBean;I)V

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
.end method

.method private final k(Lcom/kubi/data/entity/TradeItemBean;I)Lcom/kubi/utils/v0;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/utils/v0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/utils/v0;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p2}, Lcom/kubi/utils/v0;->d(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    const-string v1, " /"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrencyName()Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 45
    .line 46
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 47
    .line 48
    sget v2, Lcom/kubi/spot/R$color;->emphasis40:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 52
    move-result v1

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 56
    .line 57
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    .line 58
    .line 59
    const/16 v2, 0xa

    .line 60
    const/4 v3, 0x1

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, v2, v3}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 64
    .line 65
    .line 66
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p1, v0}, Lcom/kubi/utils/v0;->c(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/kubi/utils/v0;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    const-string p2, "append(...)"

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    return-object p1
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
.end method

.method public static synthetic l(Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;Lcom/kubi/data/entity/TradeItemBean;IILjava/lang/Object;)Lcom/kubi/utils/v0;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x1

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    const/16 p2, 0xe

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->k(Lcom/kubi/data/entity/TradeItemBean;I)Lcom/kubi/utils/v0;

    .line 10
    move-result-object p0

    .line 11
    return-object p0
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
.end method

.method private final o(Lcom/kubi/data/entity/TradeItemBean;I)V
    .locals 11

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->j:Z

    .line 3
    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    sget-object v0, Lcom/kubi/spot/helper/e0;->a:Lcom/kubi/spot/helper/e0;

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/kubi/spot/helper/e0;->a(Lcom/kubi/data/entity/TradeItemBean;Z)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    sget-object v0, Lcom/kubi/spot/helper/m0;->a:Lcom/kubi/spot/helper/m0;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lcom/kubi/spot/helper/m0;->o(Ljava/lang/String;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getDisabledTip()Ljava/lang/String;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    .line 36
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    move-result p2

    .line 38
    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    iget-object p1, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 42
    .line 43
    sget p2, Lcom/kubi/spot/R$string;->current_trade_pause:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 47
    move-result-object p1

    .line 48
    goto :goto_0

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getDisabledTip()Ljava/lang/String;

    .line 52
    move-result-object p1

    .line 53
    :goto_0
    const/4 p2, 0x0

    .line 54
    .line 55
    new-array p2, p2, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    invoke-static {p1, p2}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    return-void

    .line 60
    .line 61
    :cond_1
    sget-object v2, Lf00/a;->a:Lf00/a;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 68
    .line 69
    const/16 v9, 0x3c

    .line 70
    const/4 v10, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v8, 0x0

    .line 75
    .line 76
    .line 77
    invoke-static/range {v2 .. v10}, Lg00/f$a;->l(Lg00/f;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 78
    add-int/2addr p2, v1

    .line 79
    .line 80
    .line 81
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 82
    move-result-object p2

    .line 83
    .line 84
    const-string v0, "symbol"

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    .line 95
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    const-string v1, "B5trading"

    .line 99
    .line 100
    const-string v2, "symbolSelectTabList"

    .line 101
    .line 102
    .line 103
    invoke-static {v1, v2, p2, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 104
    goto :goto_1

    .line 105
    .line 106
    :cond_2
    sget-object v3, Lf00/a;->a:Lf00/a;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 110
    move-result-object v4

    .line 111
    .line 112
    const/16 v8, 0xe

    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, 0x0

    .line 117
    .line 118
    .line 119
    invoke-static/range {v3 .. v9}, Lg00/n$a;->a(Lg00/n;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 120
    :goto_1
    const/4 p2, 0x0

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p2}, Lcom/kubi/data/entity/TradeItemBean;->setSymbolInfoEntity(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 124
    return-void
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
.end method


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/data/entity/TradeItemBean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V

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
.end method

.method public h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V
    .locals 28
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KCCyclomaticComplexityCheck"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v2, p1

    .line 5
    .line 6
    move-object/from16 v3, p2

    .line 7
    .line 8
    const-string v0, "mContext"

    .line 9
    .line 10
    const-string v4, "L"

    .line 11
    .line 12
    const-string v5, "helper"

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    sget v5, Lcom/kubi/spot/R$id;->tv_price:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 24
    move-result-object v6

    .line 25
    .line 26
    const-string v7, "getView(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    check-cast v6, Landroid/widget/TextView;

    .line 32
    const/4 v7, 0x3

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x0

    .line 35
    .line 36
    .line 37
    invoke-static {v6, v8, v9, v7, v8}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 38
    .line 39
    sget-object v6, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 40
    .line 41
    sget-object v7, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 45
    move-result-object v10

    .line 46
    .line 47
    const-class v11, Lzf/k0;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6, v11, v10}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    move-result-object v10

    .line 52
    .line 53
    const-class v11, Leg/a;

    .line 54
    const/4 v12, 0x1

    .line 55
    .line 56
    if-eqz v10, :cond_1

    .line 57
    .line 58
    check-cast v10, Lzf/k0;

    .line 59
    .line 60
    .line 61
    invoke-interface {v10, v2}, Lzf/k0;->a(Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 62
    goto :goto_2

    .line 63
    .line 64
    :cond_1
    sget v10, Lcom/kubi/spot/R$id;->tv_lever:I

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 68
    move-result-object v13

    .line 69
    .line 70
    .line 71
    invoke-virtual {v13}, Lcom/kubi/data/entity/SymbolInfoEntity;->isShowMarginLeverLabel()Z

    .line 72
    move-result v13

    .line 73
    .line 74
    if-eqz v13, :cond_3

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lhf/a;->a()Z

    .line 78
    move-result v13

    .line 79
    .line 80
    if-eqz v13, :cond_3

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 84
    move-result-object v13

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, v11, v13}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    move-result-object v13

    .line 89
    .line 90
    if-eqz v13, :cond_2

    .line 91
    .line 92
    check-cast v13, Leg/a;

    .line 93
    .line 94
    .line 95
    invoke-interface {v13}, Leg/a;->b()Z

    .line 96
    move-result v13

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    move v13, v12

    .line 99
    .line 100
    :goto_0
    if-eqz v13, :cond_3

    .line 101
    move v13, v12

    .line 102
    goto :goto_1

    .line 103
    :cond_3
    move v13, v9

    .line 104
    .line 105
    .line 106
    :goto_1
    invoke-virtual {v2, v10, v13}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 107
    move-result-object v13

    .line 108
    .line 109
    new-instance v14, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    sget-object v15, Lcom/kubi/spot/service/b;->a:Lcom/kubi/spot/service/b;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v15}, Lcom/kubi/spot/service/b;->c()Lcom/kubi/margin/api/IMarginService;

    .line 118
    move-result-object v15

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 122
    move-result-object v8

    .line 123
    .line 124
    const-string v9, "getSymbol(...)"

    .line 125
    .line 126
    .line 127
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v15, v8}, Lcom/kubi/margin/api/IMarginService;->q(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 131
    move-result-object v18

    .line 132
    .line 133
    const/16 v26, 0x7d

    .line 134
    .line 135
    const/16 v27, 0x0

    .line 136
    .line 137
    const/16 v19, 0x0

    .line 138
    .line 139
    const/16 v20, 0x4

    .line 140
    .line 141
    const/16 v21, 0x0

    .line 142
    .line 143
    const/16 v22, 0x0

    .line 144
    .line 145
    const/16 v23, 0x0

    .line 146
    .line 147
    const/16 v24, 0x0

    .line 148
    .line 149
    const/16 v25, 0x0

    .line 150
    .line 151
    .line 152
    invoke-static/range {v18 .. v27}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 153
    move-result-object v8

    .line 154
    .line 155
    .line 156
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const/16 v8, 0x78

    .line 159
    .line 160
    .line 161
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    move-result-object v8

    .line 166
    .line 167
    .line 168
    invoke-virtual {v13, v10, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 169
    .line 170
    :goto_2
    sget v8, Lcom/kubi/spot/R$id;->tv_trade_pair:I

    .line 171
    const/4 v9, 0x0

    .line 172
    const/4 v10, 0x0

    .line 173
    .line 174
    .line 175
    invoke-static {v1, v3, v10, v12, v9}, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->l(Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;Lcom/kubi/data/entity/TradeItemBean;IILjava/lang/Object;)Lcom/kubi/utils/v0;

    .line 176
    move-result-object v13

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v8, v13}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 180
    move-result-object v8

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 184
    move-result-object v13

    .line 185
    .line 186
    .line 187
    invoke-virtual {v13}, Lcom/kubi/data/entity/SymbolInfoEntity;->isPreviewEnableShow()Z

    .line 188
    move-result v13

    .line 189
    .line 190
    if-eqz v13, :cond_4

    .line 191
    .line 192
    const-string v13, "-"

    .line 193
    goto :goto_3

    .line 194
    .line 195
    :cond_4
    new-instance v14, Ljava/math/BigDecimal;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getLastDealPrice()D

    .line 199
    move-result-wide v15

    .line 200
    .line 201
    .line 202
    invoke-static/range {v15 .. v16}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 203
    move-result-object v13

    .line 204
    .line 205
    .line 206
    invoke-direct {v14, v13}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 210
    move-result-object v15

    .line 211
    .line 212
    const/16 v22, 0x7e

    .line 213
    .line 214
    const/16 v23, 0x0

    .line 215
    .line 216
    const/16 v16, 0x0

    .line 217
    .line 218
    const/16 v17, 0x0

    .line 219
    .line 220
    const/16 v18, 0x0

    .line 221
    .line 222
    const/16 v19, 0x0

    .line 223
    .line 224
    const/16 v20, 0x0

    .line 225
    .line 226
    const/16 v21, 0x0

    .line 227
    .line 228
    .line 229
    invoke-static/range {v14 .. v23}, Lgf/j;->d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 230
    move-result-object v13

    .line 231
    .line 232
    .line 233
    :goto_3
    invoke-virtual {v8, v5, v13}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 234
    move-result-object v8

    .line 235
    .line 236
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 240
    move-result-object v13

    .line 241
    .line 242
    const-string v14, "getContext(...)"

    .line 243
    .line 244
    .line 245
    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getChangeRate()Ljava/lang/Double;

    .line 249
    move-result-object v15

    .line 250
    .line 251
    .line 252
    invoke-static {v15}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 253
    move-result-wide v9

    .line 254
    .line 255
    sget v15, Lcom/kubi/spot/R$color;->c_text:I

    .line 256
    .line 257
    .line 258
    invoke-static {v13, v9, v10, v15}, Lcom/kubi/resources/g;->c(Landroid/content/Context;DI)I

    .line 259
    move-result v9

    .line 260
    .line 261
    .line 262
    invoke-virtual {v8, v5, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 263
    move-result-object v5

    .line 264
    .line 265
    sget v8, Lcom/kubi/spot/R$id;->tv_percent:I

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getFormatChangeRateV2()Ljava/lang/String;

    .line 269
    move-result-object v9

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5, v8, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 273
    move-result-object v5

    .line 274
    .line 275
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 279
    move-result-object v9

    .line 280
    .line 281
    .line 282
    invoke-static {v9, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getChangeRate()Ljava/lang/Double;

    .line 286
    move-result-object v10

    .line 287
    .line 288
    .line 289
    invoke-static {v10}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 290
    move-result-wide v13

    .line 291
    .line 292
    sget v10, Lcom/kubi/spot/R$color;->c_text40:I

    .line 293
    .line 294
    .line 295
    invoke-static {v9, v13, v14, v10}, Lcom/kubi/resources/g;->c(Landroid/content/Context;DI)I

    .line 296
    move-result v9

    .line 297
    .line 298
    .line 299
    invoke-virtual {v5, v8, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 300
    move-result-object v5

    .line 301
    .line 302
    sget v8, Lcom/kubi/spot/R$id;->tv_label:I

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getMark()I

    .line 306
    move-result v9

    .line 307
    .line 308
    if-ne v9, v12, :cond_5

    .line 309
    move v9, v12

    .line 310
    goto :goto_4

    .line 311
    :cond_5
    const/4 v9, 0x0

    .line 312
    .line 313
    .line 314
    :goto_4
    invoke-virtual {v5, v8, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 315
    move-result-object v5

    .line 316
    .line 317
    sget v8, Lcom/kubi/spot/R$id;->tv_etf_label:I

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 321
    move-result-object v9

    .line 322
    .line 323
    .line 324
    invoke-virtual {v9}, Lcom/kubi/data/entity/SymbolInfoEntity;->isEtfSymbol()Z

    .line 325
    move-result v9

    .line 326
    .line 327
    if-eqz v9, :cond_7

    .line 328
    .line 329
    .line 330
    invoke-virtual {v7}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 331
    move-result-object v7

    .line 332
    .line 333
    .line 334
    invoke-virtual {v6, v11, v7}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 335
    move-result-object v6

    .line 336
    .line 337
    if-eqz v6, :cond_6

    .line 338
    .line 339
    check-cast v6, Leg/a;

    .line 340
    .line 341
    .line 342
    invoke-interface {v6}, Leg/a;->a()Z

    .line 343
    move-result v6

    .line 344
    goto :goto_5

    .line 345
    :cond_6
    move v6, v12

    .line 346
    .line 347
    :goto_5
    if-eqz v6, :cond_7

    .line 348
    move v6, v12

    .line 349
    goto :goto_6

    .line 350
    :cond_7
    const/4 v6, 0x0

    .line 351
    .line 352
    .line 353
    :goto_6
    invoke-virtual {v5, v8, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 354
    move-result-object v5

    .line 355
    .line 356
    sget v6, Lcom/kubi/spot/R$id;->tv_ready:I

    .line 357
    .line 358
    .line 359
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 360
    move-result-object v7

    .line 361
    .line 362
    .line 363
    invoke-virtual {v7}, Lcom/kubi/data/entity/SymbolInfoEntity;->isPreviewEnableShow()Z

    .line 364
    move-result v7

    .line 365
    .line 366
    .line 367
    invoke-virtual {v5, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 368
    move-result-object v5

    .line 369
    .line 370
    sget v6, Lcom/kubi/spot/R$id;->tvLabel:I

    .line 371
    .line 372
    .line 373
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getCoinLabel()Ljava/lang/String;

    .line 374
    move-result-object v7

    .line 375
    .line 376
    .line 377
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 378
    move-result v7

    .line 379
    xor-int/2addr v7, v12

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 383
    move-result-object v5

    .line 384
    .line 385
    .line 386
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getCoinLabel()Ljava/lang/String;

    .line 387
    move-result-object v7

    .line 388
    .line 389
    .line 390
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 391
    move-result-object v7

    .line 392
    .line 393
    .line 394
    invoke-virtual {v5, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 395
    move-result-object v5

    .line 396
    .line 397
    sget v6, Lcom/kubi/spot/R$id;->iv_fav:I

    .line 398
    .line 399
    .line 400
    invoke-static {v3}, Lcom/kubi/spot/helper/a;->a(Lcom/kubi/data/entity/TradeItemBean;)Z

    .line 401
    move-result v7

    .line 402
    .line 403
    .line 404
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 405
    move-result-object v7

    .line 406
    .line 407
    .line 408
    invoke-static {v7}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 409
    move-result v7

    .line 410
    .line 411
    if-eqz v7, :cond_8

    .line 412
    .line 413
    iget-object v7, v1, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->k:Ljava/lang/String;

    .line 414
    .line 415
    const-string v9, "favor"

    .line 416
    .line 417
    .line 418
    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 419
    move-result v7

    .line 420
    .line 421
    if-nez v7, :cond_8

    .line 422
    move v9, v12

    .line 423
    goto :goto_7

    .line 424
    :cond_8
    const/4 v9, 0x0

    .line 425
    .line 426
    .line 427
    :goto_7
    invoke-virtual {v5, v6, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setVisible(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 428
    move-result-object v5

    .line 429
    .line 430
    sget v6, Lcom/kubi/spot/R$id;->fl_root:I

    .line 431
    .line 432
    new-instance v7, La30/c;

    .line 433
    .line 434
    .line 435
    invoke-direct {v7, v3, v1, v2}, La30/c;-><init>(Lcom/kubi/data/entity/TradeItemBean;Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v5, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 442
    move-result-object v5

    .line 443
    .line 444
    .line 445
    invoke-virtual {v5}, Lcom/kubi/data/entity/SymbolInfoEntity;->isEtfSymbol()Z

    .line 446
    move-result v5

    .line 447
    .line 448
    if-eqz v5, :cond_b

    .line 449
    .line 450
    :try_start_0
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 451
    .line 452
    sget-object v5, Lgf/n;->a:Lgf/n;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 456
    move-result-object v6

    .line 457
    .line 458
    .line 459
    invoke-virtual {v6}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 460
    move-result-object v6

    .line 461
    .line 462
    const-string v7, "getBaseCurrency(...)"

    .line 463
    .line 464
    .line 465
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v5, v6}, Lgf/n;->w(Ljava/lang/String;)Lcom/kubi/data/entity/EtfCoinEntity;

    .line 469
    move-result-object v5

    .line 470
    .line 471
    if-eqz v5, :cond_a

    .line 472
    .line 473
    iget-object v6, v1, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v5}, Lcom/kubi/data/entity/EtfCoinEntity;->getBuyType()Ljava/lang/String;

    .line 477
    move-result-object v7

    .line 478
    .line 479
    .line 480
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 481
    move-result v7

    .line 482
    .line 483
    if-eqz v7, :cond_9

    .line 484
    .line 485
    sget v7, Lcom/kubi/spot/R$string;->etf_label_times_long:I

    .line 486
    goto :goto_8

    .line 487
    :catchall_0
    move-exception v0

    .line 488
    goto :goto_a

    .line 489
    .line 490
    :cond_9
    sget v7, Lcom/kubi/spot/R$string;->etf_label_times_short:I

    .line 491
    .line 492
    .line 493
    :goto_8
    invoke-virtual {v5}, Lcom/kubi/data/entity/EtfCoinEntity;->getMultiple()Ljava/lang/String;

    .line 494
    move-result-object v9

    .line 495
    .line 496
    .line 497
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 498
    move-result-object v9

    .line 499
    .line 500
    .line 501
    invoke-virtual {v6, v7, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 502
    move-result-object v6

    .line 503
    .line 504
    .line 505
    invoke-virtual {v2, v8, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 509
    move-result-object v6

    .line 510
    .line 511
    check-cast v6, Landroid/widget/TextView;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v5}, Lcom/kubi/data/entity/EtfCoinEntity;->getBuyType()Ljava/lang/String;

    .line 515
    move-result-object v7

    .line 516
    .line 517
    .line 518
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 519
    move-result v4

    .line 520
    .line 521
    iget-object v7, v1, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 522
    .line 523
    .line 524
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-static {v7, v4}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 528
    move-result v7

    .line 529
    .line 530
    .line 531
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 532
    .line 533
    iget-object v7, v1, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 534
    .line 535
    .line 536
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    invoke-static {v4, v7}, Lcom/kubi/resources/g;->j(ZLandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 540
    move-result-object v0

    .line 541
    .line 542
    .line 543
    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 544
    goto :goto_9

    .line 545
    :cond_a
    const/4 v5, 0x0

    .line 546
    .line 547
    .line 548
    :goto_9
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 550
    goto :goto_b

    .line 551
    .line 552
    :goto_a
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 553
    .line 554
    .line 555
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 556
    move-result-object v0

    .line 557
    .line 558
    .line 559
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    move-result-object v0

    .line 561
    .line 562
    .line 563
    :goto_b
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 564
    move-result-object v0

    .line 565
    .line 566
    if-eqz v0, :cond_b

    .line 567
    .line 568
    const-string v4, "SymbolsListAdapter-getEtfEntityByCode"

    .line 569
    .line 570
    .line 571
    invoke-static {v0, v4}, Lw20/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    :cond_b
    invoke-static {v3}, La30/d;->a(Lcom/kubi/data/entity/TradeItemBean;)La30/a;

    .line 575
    move-result-object v0

    .line 576
    .line 577
    iget-object v4, v1, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->i:Lcom/kubi/sdk/base/ui/OldBaseFragment;

    .line 578
    .line 579
    .line 580
    invoke-interface {v0, v2, v3, v4}, La30/a;->a(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;Lcom/kubi/sdk/base/ui/OldBaseFragment;)V

    .line 581
    .line 582
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 586
    move-result-object v3

    .line 587
    .line 588
    iget-object v4, v1, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->l:Lcom/kubi/data/entity/TradeItemBean;

    .line 589
    .line 590
    if-eqz v4, :cond_c

    .line 591
    .line 592
    .line 593
    invoke-virtual {v4}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 594
    move-result-object v8

    .line 595
    goto :goto_c

    .line 596
    :cond_c
    const/4 v8, 0x0

    .line 597
    .line 598
    .line 599
    :goto_c
    invoke-static {v3, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 600
    move-result v3

    .line 601
    .line 602
    if-nez v3, :cond_e

    .line 603
    .line 604
    iget v3, v1, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->m:I

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 608
    move-result v2

    .line 609
    .line 610
    if-ne v3, v2, :cond_d

    .line 611
    goto :goto_d

    .line 612
    .line 613
    :cond_d
    sget v2, Lcom/kubi/spot/R$color;->c_bulletLayer:I

    .line 614
    goto :goto_e

    .line 615
    .line 616
    :cond_e
    :goto_d
    sget v2, Lcom/kubi/spot/R$color;->emphasis2:I

    .line 617
    .line 618
    .line 619
    :goto_e
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 620
    return-void
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
.end method

.method public final j()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->m:I

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

.method public final m(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->m:I

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

.method public final n(Lcom/kubi/data/entity/TradeItemBean;)V
    .locals 0
    .param p1    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;->l:Lcom/kubi/data/entity/TradeItemBean;

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
