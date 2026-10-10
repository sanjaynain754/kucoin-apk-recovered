.class public final Lcom/kubi/assets/main/AssetV2MainAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "AssetV2MainAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/kubi/assets/entity/AccountItemEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0012J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00180\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u0014\"\u0004\u0008\u001a\u0010\u0016R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lcom/kubi/assets/main/AssetV2MainAdapter;",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/assets/entity/AccountItemEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "fragment",
        "Lcom/kubi/assets/main/AssetV2MainFragment;",
        "<init>",
        "(Lcom/kubi/assets/main/AssetV2MainFragment;)V",
        "getFragment",
        "()Lcom/kubi/assets/main/AssetV2MainFragment;",
        "hideNumber",
        "",
        "getHideNumber",
        "()Z",
        "setHideNumber",
        "(Z)V",
        "rateMap",
        "",
        "",
        "getRateMap",
        "()Ljava/util/Map;",
        "setRateMap",
        "(Ljava/util/Map;)V",
        "productsMap",
        "Lcom/kubi/assets/entity/EarnAccountItem;",
        "getProductsMap",
        "setProductsMap",
        "filterText",
        "replaceData",
        "",
        "data",
        "",
        "convert",
        "helper",
        "entity",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final i:Lcom/kubi/assets/main/AssetV2MainFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public j:Z

.field public k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/assets/entity/EarnAccountItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public m:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/assets/main/AssetV2MainFragment;)V
    .locals 1
    .param p1    # Lcom/kubi/assets/main/AssetV2MainFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "fragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget v0, Lcom/kubi/assets/R$layout;->item_asset_main_account:I

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(I)V

    .line 11
    .line 12
    iput-object p1, p0, Lcom/kubi/assets/main/AssetV2MainAdapter;->i:Lcom/kubi/assets/main/AssetV2MainFragment;

    .line 13
    .line 14
    new-instance p1, Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    iput-object p1, p0, Lcom/kubi/assets/main/AssetV2MainAdapter;->k:Ljava/util/Map;

    .line 20
    .line 21
    new-instance p1, Ljava/util/HashMap;

    .line 22
    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    iput-object p1, p0, Lcom/kubi/assets/main/AssetV2MainAdapter;->l:Ljava/util/Map;

    .line 27
    .line 28
    const-string p1, ""

    .line 29
    .line 30
    iput-object p1, p0, Lcom/kubi/assets/main/AssetV2MainAdapter;->m:Ljava/lang/String;

    .line 31
    return-void
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
.end method

.method public static synthetic g(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/AssetV2MainAdapter;->l(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;

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
.end method

.method public static synthetic h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AccountItemEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/main/AssetV2MainAdapter;->m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AccountItemEntity;)Lkotlin/Unit;

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
.end method

.method public static synthetic i(Lcom/kubi/assets/entity/AccountItemEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/AssetV2MainAdapter;->k(Lcom/kubi/assets/entity/AccountItemEntity;)Lkotlin/Unit;

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
.end method

.method public static final k(Lcom/kubi/assets/entity/AccountItemEntity;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/main/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/main/c;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lny/b;->c(Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrency()Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    const-string v0, "currency"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 22
    move-result-object p0

    .line 23
    .line 24
    .line 25
    filled-new-array {p0}, [Lkotlin/Pair;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    const-string v0, "B1mainAccount"

    .line 29
    .line 30
    const-string v1, "holdToEarnLabel"

    .line 31
    .line 32
    const-string v2, "1"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1, v2, p0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    return-object p0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static final l(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/assets/holdearn/HoldEarnOpenDialog;->y0:Lcom/kubi/assets/holdearn/HoldEarnOpenDialog$Companion;

    .line 8
    .line 9
    const-string v1, "holdToEarnLabel"

    .line 10
    .line 11
    const-string v2, "1"

    .line 12
    .line 13
    const-string v3, "B1mainAccount"

    .line 14
    .line 15
    .line 16
    invoke-static {v3, v1, v2}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/kubi/assets/holdearn/HoldEarnOpenDialog$Companion;->create(Ljava/lang/String;)Lcom/kubi/assets/holdearn/HoldEarnOpenDialog;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    const-string v1, "getSupportFragmentManager(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    const-string v1, "HoldEarnOpenDialog"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    return-object p0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static final m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AccountItemEntity;)Lkotlin/Unit;
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 4
    move-result p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    new-instance v0, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    sget-object v1, Lgf/n;->a:Lgf/n;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrency()Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v1, v2

    .line 37
    .line 38
    :goto_0
    const-string v3, ""

    .line 39
    .line 40
    if-nez v1, :cond_1

    .line 41
    move-object v1, v3

    .line 42
    .line 43
    :cond_1
    const-string v4, "coin"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    const-string v1, "B1mainAccount"

    .line 50
    .line 51
    const-string v4, "coinList"

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v4, p0, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 55
    .line 56
    sget-object v5, Lcom/kubi/assets/detail/CoinDetailDispatcher;->U:Lcom/kubi/assets/detail/CoinDetailDispatcher$Companion;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrency()Ljava/lang/String;

    .line 60
    move-result-object p0

    .line 61
    .line 62
    if-nez p0, :cond_2

    .line 63
    move-object v7, v3

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move-object v7, p0

    .line 66
    :goto_1
    const/4 v9, 0x4

    .line 67
    const/4 v10, 0x0

    .line 68
    const/4 v6, 0x1

    .line 69
    const/4 v8, 0x0

    .line 70
    .line 71
    .line 72
    invoke-static/range {v5 .. v10}, Lcom/kubi/assets/detail/CoinDetailDispatcher$Companion;->start$default(Lcom/kubi/assets/detail/CoinDetailDispatcher$Companion;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 73
    .line 74
    const-string p0, "page_load_start"

    .line 75
    const/4 p1, 0x4

    .line 76
    .line 77
    const-string v0, "b1overview_asset_detail_load"

    .line 78
    .line 79
    .line 80
    invoke-static {v0, p0, v2, p1, v2}, Lqq/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 83
    return-object p0
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
.end method


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/assets/entity/AccountItemEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/main/AssetV2MainAdapter;->j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AccountItemEntity;)V

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
.end method

.method public j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AccountItemEntity;)V
    .locals 20
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/assets/entity/AccountItemEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

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
    const-string v3, "helper"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v3, "entity"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    sget v3, Lcom/kubi/assets/R$id;->tv_total_amount:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 22
    move-result-object v4

    .line 23
    .line 24
    const-string v5, "getView(...)"

    .line 25
    .line 26
    .line 27
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    check-cast v4, Landroid/widget/TextView;

    .line 30
    .line 31
    new-instance v6, Lrs/c$a;

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x3

    .line 34
    const/4 v9, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct {v6, v7, v7, v8, v9}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v10, 0x2

    .line 39
    .line 40
    .line 41
    invoke-static {v4, v6, v7, v10, v9}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 42
    .line 43
    sget v4, Lcom/kubi/assets/R$id;->tv_fait_price_amount:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 47
    move-result-object v6

    .line 48
    .line 49
    .line 50
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    check-cast v6, Landroid/widget/TextView;

    .line 53
    .line 54
    new-instance v11, Lrs/c$a;

    .line 55
    .line 56
    .line 57
    invoke-direct {v11, v7, v7, v8, v9}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v6, v11, v7, v10, v9}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 61
    .line 62
    sget v6, Lcom/kubi/assets/R$id;->tv_in_order_amount:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 66
    move-result-object v11

    .line 67
    .line 68
    .line 69
    invoke-static {v11, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    check-cast v11, Landroid/widget/TextView;

    .line 72
    .line 73
    new-instance v12, Lrs/c$a;

    .line 74
    .line 75
    .line 76
    invoke-direct {v12, v7, v7, v8, v9}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v11, v12, v7, v10, v9}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 80
    .line 81
    sget v10, Lcom/kubi/assets/R$id;->tv_coin_name:I

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrencyNameStr()Ljava/lang/String;

    .line 85
    move-result-object v11

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v10, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 89
    move-result-object v11

    .line 90
    .line 91
    sget v12, Lcom/kubi/assets/R$id;->tv_currency_full_name:I

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrencyFullNameStr()Ljava/lang/String;

    .line 95
    move-result-object v13

    .line 96
    .line 97
    .line 98
    invoke-virtual {v11, v12, v13}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 99
    move-result-object v11

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->getTotalBalanceStr()Ljava/lang/String;

    .line 103
    move-result-object v13

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11, v3, v13}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 107
    move-result-object v3

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->getTotalBalancePriceStr()Ljava/lang/String;

    .line 111
    move-result-object v11

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v4, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 115
    move-result-object v3

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->getHoldBalanceStr()Ljava/lang/String;

    .line 119
    move-result-object v4

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v6, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 123
    move-result-object v3

    .line 124
    .line 125
    sget v4, Lcom/kubi/assets/R$id;->tv_fiat_lab:I

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->isFiat()Z

    .line 129
    move-result v11

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v4, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 133
    move-result-object v3

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->isOrderVisible()Z

    .line 137
    move-result v4

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v6, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 141
    move-result-object v3

    .line 142
    .line 143
    sget v4, Lcom/kubi/assets/R$id;->tv_in_order_name:I

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->isOrderVisible()Z

    .line 147
    move-result v6

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v4, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 151
    .line 152
    sget-object v3, Lgf/n;->a:Lgf/n;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrency()Ljava/lang/String;

    .line 156
    move-result-object v4

    .line 157
    .line 158
    if-nez v4, :cond_0

    .line 159
    .line 160
    const-string v4, ""

    .line 161
    .line 162
    .line 163
    :cond_0
    invoke-virtual {v3, v4}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 164
    move-result-object v4

    .line 165
    .line 166
    if-eqz v4, :cond_1

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 170
    move-result-object v4

    .line 171
    goto :goto_0

    .line 172
    :cond_1
    move-object v4, v9

    .line 173
    .line 174
    .line 175
    :goto_0
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->getIconUrl()Ljava/lang/String;

    .line 176
    move-result-object v6

    .line 177
    .line 178
    .line 179
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    move-result-object v6

    .line 181
    .line 182
    .line 183
    invoke-static {v4, v6}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    move-result-object v4

    .line 185
    .line 186
    sget v6, Lcom/kubi/assets/R$id;->iv_icon:I

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 190
    move-result-object v6

    .line 191
    .line 192
    check-cast v6, Landroid/widget/ImageView;

    .line 193
    .line 194
    .line 195
    invoke-static {v6, v4}, Lcom/kubi/sdk/util/v;->g(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 196
    .line 197
    sget v4, Lcom/kubi/assets/R$id;->tv_lend:I

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 201
    move-result-object v4

    .line 202
    .line 203
    check-cast v4, Landroid/widget/TextView;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->isFiat()Z

    .line 207
    move-result v6

    .line 208
    const/4 v11, 0x1

    .line 209
    .line 210
    if-eqz v6, :cond_3

    .line 211
    .line 212
    :cond_2
    :goto_1
    const/16 v7, 0x8

    .line 213
    .line 214
    goto/16 :goto_3

    .line 215
    .line 216
    .line 217
    :cond_3
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrency()Ljava/lang/String;

    .line 218
    move-result-object v6

    .line 219
    .line 220
    .line 221
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    move-result-object v6

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v6}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 226
    move-result-object v3

    .line 227
    .line 228
    if-eqz v3, :cond_4

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->isEarnEnabled()Z

    .line 232
    move-result v3

    .line 233
    .line 234
    .line 235
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 236
    move-result-object v3

    .line 237
    goto :goto_2

    .line 238
    :cond_4
    move-object v3, v9

    .line 239
    .line 240
    .line 241
    :goto_2
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 242
    move-result v3

    .line 243
    .line 244
    if-eqz v3, :cond_2

    .line 245
    .line 246
    iget-object v3, v0, Lcom/kubi/assets/main/AssetV2MainAdapter;->i:Lcom/kubi/assets/main/AssetV2MainFragment;

    .line 247
    .line 248
    sget v6, Lcom/kubi/assets/R$string;->earn_coin_percentage_tag:I

    .line 249
    .line 250
    new-instance v14, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 254
    .line 255
    const/16 v15, 0x200f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    iget-object v15, v0, Lcom/kubi/assets/main/AssetV2MainAdapter;->k:Ljava/util/Map;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrency()Ljava/lang/String;

    .line 264
    move-result-object v16

    .line 265
    .line 266
    .line 267
    invoke-static/range {v16 .. v16}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 268
    move-result-object v13

    .line 269
    .line 270
    .line 271
    invoke-interface {v15, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    move-result-object v13

    .line 273
    .line 274
    check-cast v13, Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    invoke-static {v13}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 278
    move-result-object v13

    .line 279
    .line 280
    if-eqz v13, :cond_5

    .line 281
    .line 282
    .line 283
    invoke-static {v13, v7, v7, v11, v9}, Lgf/i;->d(Ljava/math/BigDecimal;IIILjava/lang/Object;)Ljava/lang/String;

    .line 284
    move-result-object v13

    .line 285
    .line 286
    if-eqz v13, :cond_5

    .line 287
    .line 288
    const-string v9, "%"

    .line 289
    .line 290
    .line 291
    invoke-static {v13, v9, v11, v7}, Lnf/b;->f(Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/String;

    .line 292
    move-result-object v9

    .line 293
    .line 294
    .line 295
    :cond_5
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    move-result-object v9

    .line 300
    .line 301
    .line 302
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 303
    move-result-object v9

    .line 304
    .line 305
    .line 306
    invoke-virtual {v3, v6, v9}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 307
    move-result-object v3

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    .line 312
    iget-object v3, v0, Lcom/kubi/assets/main/AssetV2MainAdapter;->k:Ljava/util/Map;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrency()Ljava/lang/String;

    .line 316
    move-result-object v6

    .line 317
    .line 318
    .line 319
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    move-result-object v6

    .line 321
    .line 322
    .line 323
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    move-result-object v3

    .line 325
    .line 326
    check-cast v3, Ljava/lang/CharSequence;

    .line 327
    .line 328
    if-eqz v3, :cond_2

    .line 329
    .line 330
    .line 331
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 332
    move-result v3

    .line 333
    .line 334
    if-nez v3, :cond_6

    .line 335
    goto :goto_1

    .line 336
    .line 337
    .line 338
    :cond_6
    :goto_3
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 339
    .line 340
    sget v3, Lcom/kubi/assets/R$id;->holdEarnTip:I

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 344
    move-result-object v3

    .line 345
    move-object v13, v3

    .line 346
    .line 347
    check-cast v13, Lcom/kubi/assets/holdearn/HoldEarnTipView;

    .line 348
    .line 349
    iget-object v3, v0, Lcom/kubi/assets/main/AssetV2MainAdapter;->l:Ljava/util/Map;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrency()Ljava/lang/String;

    .line 353
    move-result-object v6

    .line 354
    .line 355
    .line 356
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    move-result-object v6

    .line 358
    .line 359
    .line 360
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    move-result-object v3

    .line 362
    .line 363
    check-cast v3, Lcom/kubi/assets/entity/EarnAccountItem;

    .line 364
    .line 365
    if-eqz v3, :cond_9

    .line 366
    .line 367
    .line 368
    invoke-virtual {v3}, Lcom/kubi/assets/entity/EarnAccountItem;->isHoldEarnOpen()Ljava/lang/Integer;

    .line 369
    move-result-object v6

    .line 370
    .line 371
    if-nez v6, :cond_7

    .line 372
    goto :goto_4

    .line 373
    .line 374
    .line 375
    :cond_7
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 376
    move-result v6

    .line 377
    .line 378
    if-eq v6, v11, :cond_9

    .line 379
    .line 380
    .line 381
    :goto_4
    invoke-virtual {v3}, Lcom/kubi/assets/entity/EarnAccountItem;->getHoldEarnApr()Ljava/lang/String;

    .line 382
    move-result-object v6

    .line 383
    .line 384
    if-eqz v6, :cond_9

    .line 385
    .line 386
    .line 387
    invoke-virtual {v3}, Lcom/kubi/assets/entity/EarnAccountItem;->getHoldEarnApr()Ljava/lang/String;

    .line 388
    move-result-object v6

    .line 389
    .line 390
    .line 391
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 392
    move-result-wide v6

    .line 393
    .line 394
    const-wide/16 v14, 0x0

    .line 395
    .line 396
    cmpg-double v6, v6, v14

    .line 397
    .line 398
    if-lez v6, :cond_9

    .line 399
    .line 400
    sget-object v6, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->EARN_HOLD_TO_EARN:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 401
    .line 402
    .line 403
    invoke-static {v6}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 404
    move-result v6

    .line 405
    .line 406
    if-eqz v6, :cond_9

    .line 407
    .line 408
    .line 409
    invoke-static {}, Lcom/kubi/user/config/UserInfo;->c()Lcom/kubi/user/model/LoginUserEntity;

    .line 410
    move-result-object v6

    .line 411
    .line 412
    .line 413
    invoke-virtual {v6}, Lcom/kubi/user/model/LoginUserEntity;->getType()I

    .line 414
    move-result v6

    .line 415
    .line 416
    if-ne v6, v8, :cond_8

    .line 417
    goto :goto_5

    .line 418
    .line 419
    .line 420
    :cond_8
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    invoke-static {v13}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 424
    .line 425
    .line 426
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    invoke-static {v4}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v3}, Lcom/kubi/assets/entity/EarnAccountItem;->getHoldEarnAprText()Ljava/lang/String;

    .line 433
    move-result-object v3

    .line 434
    .line 435
    .line 436
    invoke-virtual {v13, v3}, Lcom/kubi/assets/holdearn/HoldEarnTipView;->setText(Ljava/lang/String;)V

    .line 437
    .line 438
    new-instance v3, Lcom/kubi/assets/main/a;

    .line 439
    .line 440
    .line 441
    invoke-direct {v3, v2}, Lcom/kubi/assets/main/a;-><init>(Lcom/kubi/assets/entity/AccountItemEntity;)V

    .line 442
    .line 443
    const/16 v17, 0x1

    .line 444
    .line 445
    const/16 v18, 0x0

    .line 446
    .line 447
    const-wide/16 v14, 0x0

    .line 448
    .line 449
    move-object/from16 v16, v3

    .line 450
    .line 451
    .line 452
    invoke-static/range {v13 .. v18}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 453
    goto :goto_6

    .line 454
    .line 455
    .line 456
    :cond_9
    :goto_5
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    invoke-static {v13}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 460
    .line 461
    :goto_6
    iget-object v14, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 462
    .line 463
    const-string v3, "itemView"

    .line 464
    .line 465
    .line 466
    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 467
    .line 468
    new-instance v3, Lcom/kubi/assets/main/b;

    .line 469
    .line 470
    .line 471
    invoke-direct {v3, v1, v2}, Lcom/kubi/assets/main/b;-><init>(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AccountItemEntity;)V

    .line 472
    .line 473
    const/16 v18, 0x1

    .line 474
    .line 475
    const/16 v19, 0x0

    .line 476
    .line 477
    const-wide/16 v15, 0x0

    .line 478
    .line 479
    move-object/from16 v17, v3

    .line 480
    .line 481
    .line 482
    invoke-static/range {v14 .. v19}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 483
    .line 484
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 485
    .line 486
    iget-boolean v3, v0, Lcom/kubi/assets/main/AssetV2MainAdapter;->j:Z

    .line 487
    .line 488
    .line 489
    invoke-static {v2, v3}, Lcom/kubi/resources/widget/ShowHideTextView;->d(Landroid/view/View;Z)V

    .line 490
    .line 491
    iget-object v2, v0, Lcom/kubi/assets/main/AssetV2MainAdapter;->m:Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 495
    move-result v2

    .line 496
    .line 497
    if-nez v2, :cond_a

    .line 498
    .line 499
    .line 500
    invoke-virtual {v1, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 501
    move-result-object v2

    .line 502
    .line 503
    .line 504
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 505
    .line 506
    check-cast v2, Landroid/widget/TextView;

    .line 507
    .line 508
    iget-object v3, v0, Lcom/kubi/assets/main/AssetV2MainAdapter;->m:Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    invoke-static {v2, v3}, Le60/b;->c(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v1, v12}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 515
    move-result-object v1

    .line 516
    .line 517
    .line 518
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 519
    .line 520
    check-cast v1, Landroid/widget/TextView;

    .line 521
    .line 522
    iget-object v2, v0, Lcom/kubi/assets/main/AssetV2MainAdapter;->m:Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    invoke-static {v1, v2}, Le60/b;->c(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 526
    :cond_a
    return-void
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
.end method

.method public final n(Ljava/util/Collection;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/kubi/assets/entity/AccountItemEntity;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "filterText"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object p2, p0, Lcom/kubi/assets/main/AssetV2MainAdapter;->m:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 16
    return-void
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
.end method

.method public final o(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/main/AssetV2MainAdapter;->j:Z

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
.end method

.method public final p(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/assets/entity/EarnAccountItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/assets/main/AssetV2MainAdapter;->l:Ljava/util/Map;

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
.end method

.method public final q(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/assets/main/AssetV2MainAdapter;->k:Ljava/util/Map;

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
.end method
