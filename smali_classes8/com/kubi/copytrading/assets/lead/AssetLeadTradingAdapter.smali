.class public final Lcom/kubi/copytrading/assets/lead/AssetLeadTradingAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "AssetLeadTradingAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/kubi/copytrading/assets/lead/AssetLeadTradingAdapter;",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "<init>",
        "()V",
        "hideNumber",
        "",
        "getHideNumber",
        "()Z",
        "setHideNumber",
        "(Z)V",
        "convert",
        "",
        "helper",
        "item",
        "CopyTradingLib_googleRelease"
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
        "SMAP\nAssetLeadTradingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetLeadTradingAdapter.kt\ncom/kubi/copytrading/assets/lead/AssetLeadTradingAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"
    }
.end annotation


# instance fields
.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/copytrading/R$layout;->item_asset_lead_trading:I

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(I)V

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
.end method

.method public static synthetic g()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/copytrading/assets/lead/AssetLeadTradingAdapter;->i()Lkotlin/Unit;

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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method public static final i()Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/copytrading/CopyTradingConfig;->a:Lcom/kubi/copytrading/CopyTradingConfig;

    .line 3
    .line 4
    const-string v1, "myLeading"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/kubi/copytrading/CopyTradingConfig;->B(Ljava/lang/String;)Z

    .line 8
    .line 9
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object v0
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
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/copytrading/assets/lead/AssetLeadTradingAdapter;->h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;)V

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
.end method

.method public h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;)V
    .locals 22
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v1, p1

    .line 3
    .line 4
    const-string v0, "helper"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v0, "item"

    .line 10
    .line 11
    move-object/from16 v2, p2

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p0 .. p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 22
    move-result v3

    .line 23
    sub-int/2addr v0, v3

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {p0 .. p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 31
    move-result v3

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    .line 35
    if-le v3, v5, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual/range {p0 .. p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 43
    move-result v3

    .line 44
    sub-int/2addr v3, v5

    .line 45
    .line 46
    if-ge v0, v3, :cond_0

    .line 47
    move v0, v5

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v0, v4

    .line 50
    .line 51
    :goto_0
    sget v3, Lcom/kubi/copytrading/R$id;->dividerView:I

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    .line 58
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    .line 63
    invoke-static {v3}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 64
    goto :goto_1

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-static {v3}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 68
    :goto_1
    const/4 v3, 0x0

    .line 69
    .line 70
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 71
    .line 72
    sget-object v0, Lcom/kubi/kumex/api/IKuMexService;->a:Lcom/kubi/kumex/api/IKuMexService$Companion;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/kubi/kumex/api/IKuMexService$Companion;->get()Lcom/kubi/kumex/api/IKuMexService;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->getSymbol()Ljava/lang/String;

    .line 80
    move-result-object v6

    .line 81
    .line 82
    if-nez v6, :cond_2

    .line 83
    .line 84
    const-string v6, ""

    .line 85
    goto :goto_2

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    goto :goto_4

    .line 88
    .line 89
    .line 90
    :cond_2
    :goto_2
    invoke-interface {v0, v6}, Lcom/kubi/kumex/api/IKuMexService;->o(Ljava/lang/String;)Ljava/util/Map;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    const-string v6, "settleCurrency"

    .line 94
    .line 95
    .line 96
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 103
    move-result-object v0

    .line 104
    goto :goto_3

    .line 105
    :cond_3
    move-object v0, v3

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    goto :goto_5

    .line 111
    .line 112
    :goto_4
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 113
    .line 114
    .line 115
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    :goto_5
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 124
    move-result v6

    .line 125
    .line 126
    if-eqz v6, :cond_4

    .line 127
    move-object v0, v3

    .line 128
    .line 129
    :cond_4
    check-cast v0, Ljava/lang/String;

    .line 130
    .line 131
    const-string v6, "--"

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v6}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    move-result-object v7

    .line 136
    .line 137
    :try_start_1
    sget-object v0, Lcom/kubi/kumex/api/IKuMexService;->a:Lcom/kubi/kumex/api/IKuMexService$Companion;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/kubi/kumex/api/IKuMexService$Companion;->get()Lcom/kubi/kumex/api/IKuMexService;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    .line 144
    invoke-interface {v0, v7}, Lcom/kubi/kumex/api/IKuMexService;->S(Ljava/lang/String;)Ljava/util/Map;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    const-string v8, "properties"

    .line 148
    .line 149
    .line 150
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    instance-of v8, v0, Ljava/util/Map;

    .line 154
    .line 155
    if-eqz v8, :cond_5

    .line 156
    .line 157
    check-cast v0, Ljava/util/Map;

    .line 158
    goto :goto_6

    .line 159
    :catchall_1
    move-exception v0

    .line 160
    goto :goto_a

    .line 161
    :cond_5
    move-object v0, v3

    .line 162
    .line 163
    :goto_6
    if-eqz v0, :cond_6

    .line 164
    .line 165
    const-string v8, "shortDisplayPrecision"

    .line 166
    .line 167
    .line 168
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    move-result-object v0

    .line 170
    goto :goto_7

    .line 171
    :cond_6
    move-object v0, v3

    .line 172
    .line 173
    :goto_7
    instance-of v8, v0, Ljava/lang/Number;

    .line 174
    .line 175
    if-eqz v8, :cond_7

    .line 176
    .line 177
    check-cast v0, Ljava/lang/Number;

    .line 178
    goto :goto_8

    .line 179
    :cond_7
    move-object v0, v3

    .line 180
    .line 181
    :goto_8
    if-eqz v0, :cond_8

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 185
    move-result v0

    .line 186
    .line 187
    .line 188
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    move-result-object v0

    .line 190
    goto :goto_9

    .line 191
    :cond_8
    move-object v0, v3

    .line 192
    .line 193
    .line 194
    :goto_9
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 196
    goto :goto_b

    .line 197
    .line 198
    :goto_a
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 199
    .line 200
    .line 201
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 202
    move-result-object v0

    .line 203
    .line 204
    .line 205
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    move-result-object v0

    .line 207
    .line 208
    .line 209
    :goto_b
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 210
    move-result v8

    .line 211
    .line 212
    if-eqz v8, :cond_9

    .line 213
    move-object v0, v3

    .line 214
    .line 215
    :cond_9
    check-cast v0, Ljava/lang/Integer;

    .line 216
    const/4 v8, 0x4

    .line 217
    .line 218
    .line 219
    invoke-static {v0, v8}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 220
    move-result v11

    .line 221
    .line 222
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 226
    move-result-object v0

    .line 227
    .line 228
    sget v8, Lcom/kubi/copytrading/R$id;->tvSymbol:I

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->displaySymbolPlain()Ljava/lang/String;

    .line 232
    move-result-object v9

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v8, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 236
    .line 237
    sget v8, Lcom/kubi/copytrading/R$id;->tvDirection:I

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 241
    move-result-object v9

    .line 242
    .line 243
    check-cast v9, Lcom/kubi/resources/widget/BaseTextView;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->getPosition()Ljava/math/BigDecimal;

    .line 247
    move-result-object v10

    .line 248
    .line 249
    if-nez v10, :cond_a

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v8, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v9, v4}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 256
    .line 257
    sget-object v9, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 258
    .line 259
    sget v10, Lcom/kubi/copytrading/R$color;->c_text40:I

    .line 260
    .line 261
    .line 262
    invoke-virtual {v9, v10}, Lcom/kubi/utils/c;->a(I)I

    .line 263
    move-result v9

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, v8, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 267
    goto :goto_f

    .line 268
    .line 269
    .line 270
    :cond_a
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->getPosition()Ljava/math/BigDecimal;

    .line 271
    move-result-object v10

    .line 272
    .line 273
    .line 274
    invoke-static {v10, v3, v5, v3}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 275
    move-result-object v10

    .line 276
    .line 277
    sget-object v12, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v10, v12}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 281
    move-result v10

    .line 282
    .line 283
    if-ltz v10, :cond_b

    .line 284
    move v10, v5

    .line 285
    goto :goto_c

    .line 286
    :cond_b
    move v10, v4

    .line 287
    .line 288
    :goto_c
    if-eqz v10, :cond_c

    .line 289
    .line 290
    sget v12, Lcom/kubi/copytrading/R$string;->multi:I

    .line 291
    goto :goto_d

    .line 292
    .line 293
    :cond_c
    sget v12, Lcom/kubi/copytrading/R$string;->empty:I

    .line 294
    .line 295
    .line 296
    :goto_d
    invoke-virtual {v0, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 297
    move-result-object v12

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v8, v12}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 301
    .line 302
    if-eqz v10, :cond_d

    .line 303
    .line 304
    sget v12, Lcom/kubi/copytrading/R$drawable;->cptd_shape_lead_dir_long_bg:I

    .line 305
    goto :goto_e

    .line 306
    .line 307
    :cond_d
    sget v12, Lcom/kubi/copytrading/R$drawable;->cptd_shape_lead_dir_short_bg:I

    .line 308
    .line 309
    .line 310
    :goto_e
    invoke-virtual {v9, v12}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 311
    .line 312
    .line 313
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v0, v10}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 317
    move-result v9

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1, v8, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 321
    .line 322
    .line 323
    :goto_f
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->getMarginMode()Ljava/lang/String;

    .line 324
    move-result-object v8

    .line 325
    .line 326
    const-string v9, "CROSS"

    .line 327
    .line 328
    .line 329
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    move-result v8

    .line 331
    .line 332
    if-eqz v8, :cond_e

    .line 333
    .line 334
    sget v8, Lcom/kubi/copytrading/R$string;->kumex_cross_position:I

    .line 335
    goto :goto_10

    .line 336
    .line 337
    :cond_e
    sget v8, Lcom/kubi/copytrading/R$string;->kumex_isolate_position:I

    .line 338
    .line 339
    .line 340
    :goto_10
    invoke-virtual {v0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 341
    move-result-object v8

    .line 342
    .line 343
    const-string v9, "getString(...)"

    .line 344
    .line 345
    .line 346
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    sget v9, Lcom/kubi/copytrading/R$id;->modeLeverage:I

    .line 349
    .line 350
    new-instance v10, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    const/16 v8, 0x20

    .line 359
    .line 360
    .line 361
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->getLeverage()Ljava/math/BigDecimal;

    .line 365
    move-result-object v12

    .line 366
    .line 367
    if-eqz v12, :cond_f

    .line 368
    .line 369
    const/16 v20, 0x7d

    .line 370
    .line 371
    const/16 v21, 0x0

    .line 372
    const/4 v13, 0x0

    .line 373
    const/4 v14, 0x4

    .line 374
    const/4 v15, 0x0

    .line 375
    .line 376
    const/16 v16, 0x0

    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    const/16 v18, 0x0

    .line 381
    .line 382
    const/16 v19, 0x0

    .line 383
    .line 384
    .line 385
    invoke-static/range {v12 .. v21}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 386
    move-result-object v12

    .line 387
    goto :goto_11

    .line 388
    :cond_f
    move-object v12, v3

    .line 389
    .line 390
    :goto_11
    const-string v13, "-"

    .line 391
    .line 392
    .line 393
    invoke-static {v12, v13}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 394
    move-result-object v12

    .line 395
    .line 396
    .line 397
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    const/16 v12, 0x78

    .line 400
    .line 401
    .line 402
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    move-result-object v10

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v9, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->getFundsTypeEnum()Lcom/kubi/copytrading/assets/LeadTradingPositionFundsType;

    .line 413
    move-result-object v9

    .line 414
    .line 415
    sget-object v10, Lcom/kubi/copytrading/assets/LeadTradingPositionFundsType;->LEAD_TRIAL:Lcom/kubi/copytrading/assets/LeadTradingPositionFundsType;

    .line 416
    .line 417
    if-ne v9, v10, :cond_10

    .line 418
    move v9, v5

    .line 419
    goto :goto_12

    .line 420
    :cond_10
    move v9, v4

    .line 421
    .line 422
    :goto_12
    sget v10, Lcom/kubi/copytrading/R$id;->tvLeadTrialTag:I

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 426
    move-result-object v10

    .line 427
    .line 428
    .line 429
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 430
    .line 431
    if-eqz v9, :cond_11

    .line 432
    .line 433
    .line 434
    invoke-static {v10}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 435
    goto :goto_13

    .line 436
    .line 437
    .line 438
    :cond_11
    invoke-static {v10}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 439
    .line 440
    :goto_13
    sget v9, Lcom/kubi/copytrading/R$id;->tvPnlLabel:I

    .line 441
    .line 442
    sget v10, Lcom/kubi/copytrading/R$string;->copytd_position_pnl:I

    .line 443
    .line 444
    .line 445
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 446
    move-result-object v12

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0, v10, v12}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 450
    move-result-object v10

    .line 451
    .line 452
    .line 453
    invoke-virtual {v1, v9, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 454
    .line 455
    sget v9, Lcom/kubi/copytrading/R$id;->tvInvestLabel:I

    .line 456
    .line 457
    new-instance v10, Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 461
    .line 462
    sget v12, Lcom/kubi/copytrading/R$string;->margin:I

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 466
    move-result-object v12

    .line 467
    .line 468
    .line 469
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    const/16 v12, 0x28

    .line 472
    .line 473
    .line 474
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    const/16 v7, 0x29

    .line 480
    .line 481
    .line 482
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 486
    move-result-object v10

    .line 487
    .line 488
    .line 489
    invoke-virtual {v1, v9, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 490
    .line 491
    new-instance v9, Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->getPnlRatio()Ljava/math/BigDecimal;

    .line 501
    move-result-object v13

    .line 502
    .line 503
    if-eqz v13, :cond_12

    .line 504
    .line 505
    const/16 v20, 0x37

    .line 506
    .line 507
    const/16 v21, 0x0

    .line 508
    const/4 v14, 0x0

    .line 509
    const/4 v15, 0x0

    .line 510
    .line 511
    const/16 v16, 0x0

    .line 512
    .line 513
    const/16 v17, 0x1

    .line 514
    .line 515
    const/16 v18, 0x0

    .line 516
    .line 517
    const/16 v19, 0x0

    .line 518
    .line 519
    .line 520
    invoke-static/range {v13 .. v21}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 521
    move-result-object v10

    .line 522
    goto :goto_14

    .line 523
    :cond_12
    move-object v10, v3

    .line 524
    .line 525
    .line 526
    :goto_14
    invoke-static {v10}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 527
    move-result-object v10

    .line 528
    .line 529
    .line 530
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 537
    move-result-object v7

    .line 538
    .line 539
    .line 540
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->getPnl()Ljava/math/BigDecimal;

    .line 544
    move-result-object v9

    .line 545
    .line 546
    .line 547
    invoke-static {v9, v3, v5, v3}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 548
    move-result-object v9

    .line 549
    const/4 v10, 0x2

    .line 550
    .line 551
    .line 552
    invoke-static {v0, v9, v4, v10, v3}, Lcom/kubi/resources/g;->g(Landroid/content/Context;Ljava/math/BigDecimal;IILjava/lang/Object;)I

    .line 553
    move-result v0

    .line 554
    .line 555
    new-instance v4, Lcom/kubi/utils/v0;

    .line 556
    .line 557
    .line 558
    invoke-direct {v4}, Lcom/kubi/utils/v0;-><init>()V

    .line 559
    .line 560
    new-instance v9, Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->getPnl()Ljava/math/BigDecimal;

    .line 567
    move-result-object v10

    .line 568
    .line 569
    .line 570
    invoke-static {v10}, Lcom/kubi/utils/extensions/d;->d(Ljava/lang/Number;)Ljava/lang/String;

    .line 571
    move-result-object v10

    .line 572
    .line 573
    .line 574
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    move-object v10, v9

    .line 576
    .line 577
    .line 578
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->getPnl()Ljava/math/BigDecimal;

    .line 579
    move-result-object v9

    .line 580
    .line 581
    if-eqz v9, :cond_13

    .line 582
    .line 583
    const/16 v17, 0x5d

    .line 584
    .line 585
    const/16 v18, 0x0

    .line 586
    move-object v12, v10

    .line 587
    const/4 v10, 0x0

    .line 588
    move-object v13, v12

    .line 589
    const/4 v12, 0x0

    .line 590
    move-object v14, v13

    .line 591
    const/4 v13, 0x0

    .line 592
    move-object v15, v14

    .line 593
    const/4 v14, 0x0

    .line 594
    .line 595
    move-object/from16 v16, v15

    .line 596
    const/4 v15, 0x2

    .line 597
    .line 598
    move-object/from16 v19, v16

    .line 599
    .line 600
    const/16 v16, 0x0

    .line 601
    .line 602
    move-object/from16 v3, v19

    .line 603
    .line 604
    .line 605
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 606
    move-result-object v9

    .line 607
    goto :goto_15

    .line 608
    :cond_13
    move-object v3, v10

    .line 609
    const/4 v9, 0x0

    .line 610
    .line 611
    .line 612
    :goto_15
    invoke-static {v9, v6}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 613
    move-result-object v9

    .line 614
    .line 615
    .line 616
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 623
    move-result-object v3

    .line 624
    .line 625
    .line 626
    invoke-virtual {v4, v3}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 627
    move-result-object v3

    .line 628
    .line 629
    sget v4, Lcom/kubi/copytrading/R$font;->regular:I

    .line 630
    .line 631
    .line 632
    invoke-static {v4, v0}, Lcom/kubi/resources/t;->f(II)Landroid/text/style/CharacterStyle;

    .line 633
    move-result-object v4

    .line 634
    .line 635
    new-instance v8, Landroid/text/style/AbsoluteSizeSpan;

    .line 636
    .line 637
    const/16 v9, 0xc

    .line 638
    .line 639
    .line 640
    invoke-direct {v8, v9, v5}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 641
    .line 642
    .line 643
    filled-new-array {v4, v8}, [Ljava/lang/Object;

    .line 644
    move-result-object v4

    .line 645
    .line 646
    .line 647
    invoke-virtual {v3, v7, v4}, Lcom/kubi/utils/v0;->c(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/kubi/utils/v0;

    .line 648
    move-result-object v3

    .line 649
    .line 650
    sget v4, Lcom/kubi/copytrading/R$id;->tvPnlValue:I

    .line 651
    .line 652
    .line 653
    invoke-virtual {v1, v4, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v1, v4, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 657
    .line 658
    sget v0, Lcom/kubi/copytrading/R$id;->tvInvestValue:I

    .line 659
    .line 660
    .line 661
    invoke-virtual {v2}, Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 662
    move-result-object v9

    .line 663
    .line 664
    if-eqz v9, :cond_14

    .line 665
    .line 666
    sget-object v10, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 667
    .line 668
    const/16 v17, 0x5c

    .line 669
    .line 670
    const/16 v18, 0x0

    .line 671
    const/4 v12, 0x0

    .line 672
    const/4 v13, 0x0

    .line 673
    const/4 v14, 0x0

    .line 674
    const/4 v15, 0x2

    .line 675
    .line 676
    const/16 v16, 0x0

    .line 677
    .line 678
    .line 679
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 680
    move-result-object v3

    .line 681
    goto :goto_16

    .line 682
    :cond_14
    const/4 v3, 0x0

    .line 683
    .line 684
    .line 685
    :goto_16
    invoke-static {v3, v6}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 686
    move-result-object v2

    .line 687
    .line 688
    .line 689
    invoke-virtual {v1, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 690
    .line 691
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 692
    .line 693
    move-object/from16 v2, p0

    .line 694
    .line 695
    iget-boolean v3, v2, Lcom/kubi/copytrading/assets/lead/AssetLeadTradingAdapter;->i:Z

    .line 696
    .line 697
    .line 698
    invoke-static {v0, v3}, Lcom/kubi/resources/widget/ShowHideTextView;->d(Landroid/view/View;Z)V

    .line 699
    .line 700
    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 701
    .line 702
    const-string v0, "itemView"

    .line 703
    .line 704
    .line 705
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 706
    .line 707
    new-instance v7, Lcom/kubi/copytrading/assets/lead/a;

    .line 708
    .line 709
    .line 710
    invoke-direct {v7}, Lcom/kubi/copytrading/assets/lead/a;-><init>()V

    .line 711
    const/4 v8, 0x1

    .line 712
    const/4 v9, 0x0

    .line 713
    .line 714
    const-wide/16 v5, 0x0

    .line 715
    .line 716
    .line 717
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 718
    return-void
.end method

.method public final j(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/copytrading/assets/lead/AssetLeadTradingAdapter;->i:Z

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
.end method
