.class public final Lcom/kubi/assets/overview/AssetV2OverviewAdapter;
.super Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.source "AssetV2OverviewAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/overview/AssetV2OverviewAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
        "Lcom/kubi/assets/entity/OverviewItemEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u001d\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001c\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0015J4\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010\u001e\u001a\u00020\u00132\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00020 J\u0016\u0010!\u001a\u00020\"*\u00020\u00182\u0008\u0010#\u001a\u0004\u0018\u00010\u0018H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006%"
    }
    d2 = {
        "Lcom/kubi/assets/overview/AssetV2OverviewAdapter;",
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;",
        "Lcom/kubi/assets/entity/OverviewItemEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "data",
        "",
        "fragment",
        "Lcom/kubi/assets/overview/account/AssetAccountFragment;",
        "<init>",
        "(Ljava/util/List;Lcom/kubi/assets/overview/account/AssetAccountFragment;)V",
        "getFragment",
        "()Lcom/kubi/assets/overview/account/AssetAccountFragment;",
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
        "setAmountAndCurrency",
        "totalBalance",
        "Ljava/math/BigDecimal;",
        "execute",
        "overviewEntity",
        "Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
        "locationId",
        "",
        "setDataList",
        "it",
        "",
        "formatPercent",
        "",
        "total",
        "OverViewIntentListener",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAssetV2OverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2OverviewAdapter.kt\ncom/kubi/assets/overview/AssetV2OverviewAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,353:1\n1#2:354\n136#3:355\n*S KotlinDebug\n*F\n+ 1 AssetV2OverviewAdapter.kt\ncom/kubi/assets/overview/AssetV2OverviewAdapter\n*L\n278#1:355\n*E\n"
    }
.end annotation


# instance fields
.field public final i:Lcom/kubi/assets/overview/account/AssetAccountFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public j:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/kubi/assets/overview/account/AssetAccountFragment;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/assets/overview/account/AssetAccountFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/OverviewItemEntity;",
            ">;",
            "Lcom/kubi/assets/overview/account/AssetAccountFragment;",
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
    const-string v0, "fragment"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 14
    .line 15
    iput-object p2, p0, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->i:Lcom/kubi/assets/overview/account/AssetAccountFragment;

    .line 16
    const/4 p1, 0x1

    .line 17
    .line 18
    sget p2, Lcom/kubi/assets/R$layout;->item_overview:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 22
    const/4 p1, 0x2

    .line 23
    .line 24
    sget p2, Lcom/kubi/assets/R$layout;->item_overview_transtion:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 28
    .line 29
    sget p1, Lcom/kubi/assets/R$layout;->overview_trans_header:I

    .line 30
    const/4 p2, 0x3

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p2, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 34
    const/4 p2, 0x5

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p2, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

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
.end method

.method public static synthetic g()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->i()Lkotlin/Unit;

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
.end method

.method public static final i()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/assets/service/AssetsHelper;->L()V

    .line 6
    .line 7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object v0
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
.end method


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/assets/entity/OverviewItemEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/OverviewItemEntity;)V

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

.method public h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/OverviewItemEntity;)V
    .locals 18
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/assets/entity/OverviewItemEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KCLongMethodCheck"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    if-eqz p2, :cond_13

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    iget-object v2, v0, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->i:Lcom/kubi/assets/overview/account/AssetAccountFragment;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->G3()Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 16
    move-result-object v4

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getItemType()I

    .line 20
    move-result v2

    .line 21
    const/4 v6, 0x1

    .line 22
    .line 23
    if-eq v2, v6, :cond_5

    .line 24
    const/4 v3, 0x2

    .line 25
    const/4 v4, 0x0

    .line 26
    .line 27
    const-string v5, "mContext"

    .line 28
    .line 29
    if-eq v2, v3, :cond_4

    .line 30
    const/4 v3, 0x5

    .line 31
    .line 32
    if-eq v2, v3, :cond_1

    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :cond_1
    sget v2, Lcom/kubi/assets/R$id;->tv_recent_trans:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 40
    move-result-object v2

    .line 41
    move-object v7, v2

    .line 42
    .line 43
    check-cast v7, Landroid/widget/TextView;

    .line 44
    .line 45
    .line 46
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 47
    .line 48
    new-instance v10, Lcom/kubi/assets/overview/k0;

    .line 49
    .line 50
    .line 51
    invoke-direct {v10}, Lcom/kubi/assets/overview/k0;-><init>()V

    .line 52
    const/4 v11, 0x1

    .line 53
    const/4 v12, 0x0

    .line 54
    .line 55
    const-wide/16 v8, 0x0

    .line 56
    .line 57
    .line 58
    invoke-static/range {v7 .. v12}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 59
    .line 60
    new-instance v2, Lcom/kubi/utils/v0;

    .line 61
    .line 62
    .line 63
    invoke-direct {v2}, Lcom/kubi/utils/v0;-><init>()V

    .line 64
    .line 65
    iget-object v3, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 66
    .line 67
    sget v8, Lcom/kubi/assets/R$string;->assetv2_show_limit:I

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 74
    .line 75
    if-eqz v8, :cond_2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 79
    move-result-object v8

    .line 80
    .line 81
    if-eqz v8, :cond_2

    .line 82
    .line 83
    sget v9, Lcom/kubi/assets/R$color;->emphasis30:I

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getColor(I)I

    .line 87
    move-result v8

    .line 88
    .line 89
    new-instance v9, Landroid/text/style/ForegroundColorSpan;

    .line 90
    .line 91
    .line 92
    invoke-direct {v9, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 93
    goto :goto_0

    .line 94
    :cond_2
    move-object v9, v4

    .line 95
    .line 96
    .line 97
    :goto_0
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 98
    move-result-object v8

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v3, v8}, Lcom/kubi/utils/v0;->c(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/kubi/utils/v0;

    .line 102
    move-result-object v3

    .line 103
    .line 104
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 105
    .line 106
    sget v9, Lcom/kubi/assets/R$string;->view_more:I

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 110
    move-result-object v8

    .line 111
    .line 112
    iget-object v9, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 113
    .line 114
    if-eqz v9, :cond_3

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 118
    move-result-object v9

    .line 119
    .line 120
    if-eqz v9, :cond_3

    .line 121
    .line 122
    sget v4, Lcom/kubi/assets/R$color;->primary:I

    .line 123
    .line 124
    .line 125
    invoke-virtual {v9, v4}, Landroid/content/res/Resources;->getColor(I)I

    .line 126
    move-result v4

    .line 127
    .line 128
    new-instance v9, Landroid/text/style/ForegroundColorSpan;

    .line 129
    .line 130
    .line 131
    invoke-direct {v9, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 132
    move-object v4, v9

    .line 133
    .line 134
    .line 135
    :cond_3
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 136
    move-result-object v4

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v8, v4}, Lcom/kubi/utils/v0;->c(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/kubi/utils/v0;

    .line 140
    .line 141
    iget-object v3, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    const/16 v4, 0x10

    .line 147
    .line 148
    .line 149
    invoke-static {v3, v4}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 150
    move-result v3

    .line 151
    float-to-int v9, v3

    .line 152
    .line 153
    iget-object v3, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v3, v4}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 160
    move-result v3

    .line 161
    float-to-int v11, v3

    .line 162
    const/4 v12, 0x5

    .line 163
    const/4 v13, 0x0

    .line 164
    const/4 v8, 0x0

    .line 165
    const/4 v10, 0x0

    .line 166
    .line 167
    .line 168
    invoke-static/range {v7 .. v13}, Lcom/kubi/utils/extensions/core/ViewExtKt;->p(Landroid/view/View;IIIIILjava/lang/Object;)Landroid/view/View;

    .line 169
    .line 170
    const/high16 v3, 0x41400000    # 12.0f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    .line 181
    goto/16 :goto_1

    .line 182
    .line 183
    .line 184
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getHistoryInfo()Lcom/kubi/assets/entity/HistoryRecordEntity;

    .line 185
    move-result-object v2

    .line 186
    .line 187
    if-eqz v2, :cond_12

    .line 188
    .line 189
    sget v7, Lcom/kubi/assets/R$id;->tv_status:I

    .line 190
    .line 191
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 192
    const/4 v9, 0x0

    .line 193
    .line 194
    .line 195
    invoke-static {v2, v9, v4, v3, v4}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getStatusColor$default(Lcom/kubi/assets/entity/HistoryRecordEntity;ZLcom/kubi/assets/entity/HistoryRecordEntity;ILjava/lang/Object;)I

    .line 196
    move-result v3

    .line 197
    .line 198
    .line 199
    invoke-static {v8, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 200
    move-result v3

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v7, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 204
    move-result-object v3

    .line 205
    .line 206
    sget v4, Lcom/kubi/assets/R$id;->tv_time:I

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getTime()J

    .line 210
    move-result-wide v10

    .line 211
    .line 212
    const/16 v16, 0x9

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    const/4 v12, 0x0

    .line 216
    const/4 v13, 0x1

    .line 217
    const/4 v14, 0x1

    .line 218
    const/4 v15, 0x0

    .line 219
    .line 220
    .line 221
    invoke-static/range {v10 .. v17}, Llf/a;->f(JLjava/util/Locale;ZZLjava/util/TimeZone;ILjava/lang/Object;)Ljava/lang/String;

    .line 222
    move-result-object v8

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v4, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 226
    move-result-object v3

    .line 227
    .line 228
    sget v4, Lcom/kubi/assets/R$id;->tv_amount:I

    .line 229
    .line 230
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 231
    .line 232
    .line 233
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->isWithdraw()Z

    .line 237
    move-result v10

    .line 238
    xor-int/2addr v10, v6

    .line 239
    .line 240
    .line 241
    invoke-static {v8, v10}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 242
    move-result v8

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3, v4, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 246
    move-result-object v3

    .line 247
    .line 248
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 249
    .line 250
    .line 251
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->isWithdraw()Z

    .line 255
    move-result v10

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getHistoryInfo()Lcom/kubi/assets/entity/HistoryRecordEntity;

    .line 259
    move-result-object v11

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v8, v10, v11, v9}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getStatusString(Landroid/content/Context;ZLcom/kubi/assets/entity/HistoryRecordEntity;Z)Ljava/lang/String;

    .line 263
    move-result-object v8

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 267
    move-result-object v3

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getAmountTextString()Ljava/lang/String;

    .line 271
    move-result-object v8

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v4, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 275
    move-result-object v3

    .line 276
    .line 277
    sget v4, Lcom/kubi/assets/R$id;->tv_type:I

    .line 278
    .line 279
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 280
    .line 281
    .line 282
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v8}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getTypeString(Landroid/content/Context;)Ljava/lang/String;

    .line 286
    move-result-object v5

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3, v4, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 290
    move-result-object v3

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->isCompleted()Z

    .line 294
    move-result v4

    .line 295
    xor-int/2addr v4, v6

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3, v7, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setVisible(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 299
    move-result-object v3

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getStatusBackgroundRes()I

    .line 303
    move-result v2

    .line 304
    .line 305
    .line 306
    invoke-virtual {v3, v7, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setBackgroundRes(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 307
    .line 308
    goto/16 :goto_1

    .line 309
    .line 310
    .line 311
    :cond_5
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 312
    move-result-object v2

    .line 313
    .line 314
    if-eqz v2, :cond_6

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getKumex()Lcom/kubi/assets/entity/EquityEntity;

    .line 318
    move-result-object v2

    .line 319
    .line 320
    if-eqz v2, :cond_6

    .line 321
    .line 322
    sget v3, Lcom/kubi/assets/R$id;->tv_name:I

    .line 323
    .line 324
    iget-object v5, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 325
    .line 326
    sget v7, Lcom/kubi/assets/R$string;->futures:I

    .line 327
    .line 328
    .line 329
    invoke-virtual {v5, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 330
    move-result-object v5

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1, v3, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Lcom/kubi/assets/entity/EquityEntity;->getExecute()Ljava/lang/Boolean;

    .line 337
    move-result-object v3

    .line 338
    .line 339
    .line 340
    invoke-static {v3, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 341
    move-result v3

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2}, Lcom/kubi/assets/entity/EquityEntity;->getTotalEquity()Ljava/math/BigDecimal;

    .line 345
    move-result-object v2

    .line 346
    .line 347
    const-string v5, "futureAssetNo"

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    :cond_6
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 354
    move-result-object v0

    .line 355
    .line 356
    if-eqz v0, :cond_7

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getTrade()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 360
    move-result-object v0

    .line 361
    .line 362
    if-eqz v0, :cond_7

    .line 363
    .line 364
    sget v2, Lcom/kubi/assets/R$id;->tv_name:I

    .line 365
    .line 366
    sget v3, Lcom/kubi/assets/R$string;->trading:I

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0}, Lcom/kubi/data/entity/AssetSingleEntity;->getExecute()Ljava/lang/Boolean;

    .line 373
    move-result-object v2

    .line 374
    .line 375
    .line 376
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 377
    move-result v3

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 381
    move-result-object v2

    .line 382
    .line 383
    const-string v5, "tradeAssetNo"

    .line 384
    .line 385
    move-object/from16 v0, p0

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    :cond_7
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 392
    move-result-object v0

    .line 393
    .line 394
    if-eqz v0, :cond_8

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMargin()Lcom/kubi/assets/entity/MarginEntity;

    .line 398
    move-result-object v0

    .line 399
    .line 400
    if-eqz v0, :cond_8

    .line 401
    .line 402
    sget v2, Lcom/kubi/assets/R$id;->tv_name:I

    .line 403
    .line 404
    sget v3, Lcom/kubi/assets/R$string;->lever_margin:I

    .line 405
    .line 406
    .line 407
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0}, Lcom/kubi/assets/entity/MarginEntity;->getExecute()Ljava/lang/Boolean;

    .line 411
    move-result-object v2

    .line 412
    .line 413
    .line 414
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 415
    move-result v3

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0}, Lcom/kubi/assets/entity/MarginEntity;->getTotalBalanceIfExecuted()Ljava/math/BigDecimal;

    .line 419
    move-result-object v2

    .line 420
    .line 421
    const-string v5, "marginAssetNo"

    .line 422
    .line 423
    move-object/from16 v0, p0

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    :cond_8
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 430
    move-result-object v0

    .line 431
    .line 432
    if-eqz v0, :cond_9

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMain()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 436
    move-result-object v0

    .line 437
    .line 438
    if-eqz v0, :cond_9

    .line 439
    .line 440
    sget v2, Lcom/kubi/assets/R$id;->tv_name:I

    .line 441
    .line 442
    sget v3, Lcom/kubi/assets/R$string;->save_account_label:I

    .line 443
    .line 444
    .line 445
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0}, Lcom/kubi/data/entity/AssetSingleEntity;->getExecute()Ljava/lang/Boolean;

    .line 449
    move-result-object v2

    .line 450
    .line 451
    .line 452
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 453
    move-result v3

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 457
    move-result-object v2

    .line 458
    .line 459
    const-string v5, "mainlAssetNo"

    .line 460
    .line 461
    move-object/from16 v0, p0

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    :cond_9
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 468
    move-result-object v0

    .line 469
    .line 470
    if-eqz v0, :cond_a

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getRobot()Lcom/kubi/data/entity/SubAssetEntity;

    .line 474
    move-result-object v0

    .line 475
    .line 476
    if-eqz v0, :cond_a

    .line 477
    .line 478
    sget v2, Lcom/kubi/assets/R$id;->tv_name:I

    .line 479
    .line 480
    sget v3, Lcom/kubi/assets/R$string;->kc_tb_asset_bot:I

    .line 481
    .line 482
    .line 483
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v0}, Lcom/kubi/data/entity/SubAssetEntity;->getExecute()Ljava/lang/Boolean;

    .line 487
    move-result-object v2

    .line 488
    .line 489
    .line 490
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 491
    move-result v3

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0}, Lcom/kubi/data/entity/SubAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 495
    move-result-object v2

    .line 496
    .line 497
    const-string v5, "botAssetNo"

    .line 498
    .line 499
    move-object/from16 v0, p0

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    :cond_a
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 506
    move-result-object v0

    .line 507
    .line 508
    if-eqz v0, :cond_b

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getEarn()Lcom/kubi/assets/entity/EarnBalance;

    .line 512
    move-result-object v0

    .line 513
    .line 514
    if-eqz v0, :cond_b

    .line 515
    .line 516
    sget v2, Lcom/kubi/assets/R$id;->tv_name:I

    .line 517
    .line 518
    sget-object v3, Lcom/kubi/data/coin/AccountType;->FINANCE:Lcom/kubi/data/coin/AccountType;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v3}, Lcom/kubi/data/coin/AccountType;->getNickNameRes()I

    .line 522
    move-result v3

    .line 523
    .line 524
    .line 525
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0}, Lcom/kubi/assets/entity/EarnBalance;->getExecute()Ljava/lang/Boolean;

    .line 529
    move-result-object v2

    .line 530
    .line 531
    .line 532
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 533
    move-result v3

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0}, Lcom/kubi/assets/entity/EarnBalance;->getTotalValue()Ljava/math/BigDecimal;

    .line 537
    move-result-object v2

    .line 538
    .line 539
    const-string v5, "earnAssetNo"

    .line 540
    .line 541
    move-object/from16 v0, p0

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    :cond_b
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 548
    move-result-object v0

    .line 549
    .line 550
    if-eqz v0, :cond_c

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getSub()Lcom/kubi/data/entity/SubAssetEntity;

    .line 554
    move-result-object v0

    .line 555
    .line 556
    if-eqz v0, :cond_c

    .line 557
    .line 558
    sget v2, Lcom/kubi/assets/R$id;->tv_name:I

    .line 559
    .line 560
    sget v3, Lcom/kubi/assets/R$string;->sub_account:I

    .line 561
    .line 562
    .line 563
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0}, Lcom/kubi/data/entity/SubAssetEntity;->getExecute()Ljava/lang/Boolean;

    .line 567
    move-result-object v2

    .line 568
    .line 569
    .line 570
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 571
    move-result v3

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0}, Lcom/kubi/data/entity/SubAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 575
    move-result-object v2

    .line 576
    .line 577
    const-string v5, "subAssetNo"

    .line 578
    .line 579
    move-object/from16 v0, p0

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    :cond_c
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 586
    move-result-object v0

    .line 587
    .line 588
    if-eqz v0, :cond_d

    .line 589
    .line 590
    .line 591
    invoke-virtual {v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getOption()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 592
    move-result-object v0

    .line 593
    .line 594
    if-eqz v0, :cond_d

    .line 595
    .line 596
    sget v2, Lcom/kubi/assets/R$id;->tv_name:I

    .line 597
    .line 598
    sget v3, Lcom/kubi/assets/R$string;->kc_options_title:I

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v0}, Lcom/kubi/assets/entity/CommonAccountEntity;->getExecute()Ljava/lang/Boolean;

    .line 605
    move-result-object v2

    .line 606
    .line 607
    .line 608
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 609
    move-result v3

    .line 610
    .line 611
    .line 612
    invoke-virtual {v0}, Lcom/kubi/assets/entity/CommonAccountEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 613
    move-result-object v2

    .line 614
    .line 615
    const-string v5, "optionsAssetNo"

    .line 616
    .line 617
    move-object/from16 v0, p0

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    :cond_d
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 624
    move-result-object v0

    .line 625
    .line 626
    if-eqz v0, :cond_e

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getCopyTrading()Lcom/kubi/data/entity/SubAssetEntity;

    .line 630
    move-result-object v0

    .line 631
    .line 632
    if-eqz v0, :cond_e

    .line 633
    .line 634
    sget v2, Lcom/kubi/assets/R$id;->tv_name:I

    .line 635
    .line 636
    sget v3, Lcom/kubi/assets/R$string;->copytd_copy_trading:I

    .line 637
    .line 638
    .line 639
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v0}, Lcom/kubi/data/entity/SubAssetEntity;->getExecute()Ljava/lang/Boolean;

    .line 643
    move-result-object v2

    .line 644
    .line 645
    .line 646
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 647
    move-result v3

    .line 648
    .line 649
    .line 650
    invoke-virtual {v0}, Lcom/kubi/data/entity/SubAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 651
    move-result-object v2

    .line 652
    .line 653
    const-string v5, "copyTradingAssetNo"

    .line 654
    .line 655
    move-object/from16 v0, p0

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    :cond_e
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 662
    move-result-object v0

    .line 663
    .line 664
    if-eqz v0, :cond_f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getAlpha()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 668
    move-result-object v0

    .line 669
    .line 670
    if-eqz v0, :cond_f

    .line 671
    .line 672
    sget v2, Lcom/kubi/assets/R$id;->tv_name:I

    .line 673
    .line 674
    sget v3, Lcom/kubi/assets/R$string;->asset_alpha_title:I

    .line 675
    .line 676
    .line 677
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0}, Lcom/kubi/assets/entity/CommonAccountEntity;->getExecute()Ljava/lang/Boolean;

    .line 681
    move-result-object v2

    .line 682
    .line 683
    .line 684
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 685
    move-result v3

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0}, Lcom/kubi/assets/entity/CommonAccountEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 689
    move-result-object v2

    .line 690
    .line 691
    const-string v5, "alphaAssetNo"

    .line 692
    .line 693
    move-object/from16 v0, p0

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    :cond_f
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 700
    move-result-object v0

    .line 701
    .line 702
    if-eqz v0, :cond_10

    .line 703
    .line 704
    .line 705
    invoke-virtual {v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getUnified()Lcom/kubi/data/entity/UnifiedAssetEntity;

    .line 706
    move-result-object v0

    .line 707
    .line 708
    if-eqz v0, :cond_10

    .line 709
    .line 710
    sget v2, Lcom/kubi/assets/R$id;->tv_name:I

    .line 711
    .line 712
    sget v3, Lcom/kubi/assets/R$string;->kc_unify_account:I

    .line 713
    .line 714
    .line 715
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v0}, Lcom/kubi/data/entity/UnifiedAssetEntity;->getExecute()Ljava/lang/Boolean;

    .line 719
    move-result-object v2

    .line 720
    .line 721
    .line 722
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 723
    move-result v3

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0}, Lcom/kubi/data/entity/UnifiedAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 727
    move-result-object v2

    .line 728
    .line 729
    const-string v5, "unifiedTradingAssetNo"

    .line 730
    .line 731
    move-object/from16 v0, p0

    .line 732
    .line 733
    .line 734
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    :cond_10
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 738
    move-result-object v0

    .line 739
    .line 740
    if-eqz v0, :cond_11

    .line 741
    .line 742
    .line 743
    invoke-virtual {v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMining()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 744
    move-result-object v0

    .line 745
    .line 746
    if-eqz v0, :cond_11

    .line 747
    .line 748
    sget v2, Lcom/kubi/assets/R$id;->tv_name:I

    .line 749
    .line 750
    sget v3, Lcom/kubi/assets/R$string;->kc_account_name_mining:I

    .line 751
    .line 752
    .line 753
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v0}, Lcom/kubi/assets/entity/CommonAccountEntity;->getExecute()Ljava/lang/Boolean;

    .line 757
    move-result-object v2

    .line 758
    .line 759
    .line 760
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 761
    move-result v3

    .line 762
    .line 763
    .line 764
    invoke-virtual {v0}, Lcom/kubi/assets/entity/CommonAccountEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 765
    move-result-object v2

    .line 766
    .line 767
    const-string v5, "miningAssetNo"

    .line 768
    .line 769
    move-object/from16 v0, p0

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V

    .line 773
    goto :goto_1

    .line 774
    .line 775
    :cond_11
    move-object/from16 v0, p0

    .line 776
    .line 777
    :cond_12
    :goto_1
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 778
    .line 779
    iget-boolean v2, v0, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->j:Z

    .line 780
    .line 781
    .line 782
    invoke-static {v1, v2}, Lcom/kubi/resources/widget/ShowHideTextView;->d(Landroid/view/View;Z)V

    .line 783
    :cond_13
    :goto_2
    return-void
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

.method public final j(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/CharSequence;
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p2

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/utils/v0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lcom/kubi/utils/v0;-><init>()V

    .line 8
    .line 9
    const-string v2, "ZERO"

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Ljava/math/BigDecimal;->doubleValue()D

    .line 15
    move-result-wide v3

    .line 16
    .line 17
    const-wide/16 v5, 0x0

    .line 18
    .line 19
    cmpg-double v3, v3, v5

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 27
    move-result-wide v3

    .line 28
    .line 29
    cmpg-double v3, v3, v5

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v3, 0x4

    .line 34
    .line 35
    sget-object v4, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 36
    .line 37
    move-object/from16 v7, p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7, v0, v3, v4}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 41
    move-result-object v7

    .line 42
    .line 43
    if-eqz v7, :cond_4

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7}, Ljava/math/BigDecimal;->doubleValue()D

    .line 47
    move-result-wide v3

    .line 48
    .line 49
    cmpg-double v0, v3, v5

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 55
    move-result v0

    .line 56
    .line 57
    const/16 v3, 0x2248

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 67
    .line 68
    .line 69
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    const/16 v11, 0x3f

    .line 72
    const/4 v12, 0x0

    .line 73
    const/4 v5, 0x0

    .line 74
    const/4 v6, 0x0

    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v8, 0x0

    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v10, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static/range {v4 .. v12}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v0}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 96
    return-object v1

    .line 97
    .line 98
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 107
    .line 108
    .line 109
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    const/16 v11, 0x3f

    .line 112
    const/4 v12, 0x0

    .line 113
    const/4 v5, 0x0

    .line 114
    const/4 v6, 0x0

    .line 115
    const/4 v7, 0x0

    .line 116
    const/4 v8, 0x0

    .line 117
    const/4 v9, 0x0

    .line 118
    const/4 v10, 0x0

    .line 119
    .line 120
    .line 121
    invoke-static/range {v4 .. v12}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v0}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 133
    return-object v1

    .line 134
    .line 135
    :cond_3
    const/16 v14, 0x3f

    .line 136
    const/4 v15, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    const/4 v9, 0x0

    .line 139
    const/4 v10, 0x0

    .line 140
    const/4 v11, 0x0

    .line 141
    const/4 v12, 0x0

    .line 142
    const/4 v13, 0x0

    .line 143
    .line 144
    .line 145
    invoke-static/range {v7 .. v15}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 146
    move-result-object v0

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v0}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 150
    :cond_4
    return-object v1

    .line 151
    .line 152
    :cond_5
    :goto_0
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    const/16 v9, 0x3f

    .line 158
    const/4 v10, 0x0

    .line 159
    const/4 v3, 0x0

    .line 160
    const/4 v4, 0x0

    .line 161
    const/4 v5, 0x0

    .line 162
    const/4 v6, 0x0

    .line 163
    const/4 v7, 0x0

    .line 164
    const/4 v8, 0x0

    .line 165
    move-object v2, v0

    .line 166
    .line 167
    .line 168
    invoke-static/range {v2 .. v10}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v0}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 173
    return-object v1
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

.method public final k(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/math/BigDecimal;ZLcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;)V
    .locals 29

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p4 .. p4}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotalAssetValue()Ljava/math/BigDecimal;

    .line 11
    move-result-object v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v3, v2

    .line 14
    .line 15
    :goto_0
    if-eqz p4, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p4 .. p4}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 19
    move-result-object v4

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object v4, v2

    .line 22
    .line 23
    :goto_1
    sget v5, Lcom/kubi/assets/R$id;->tv_amount:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 27
    move-result-object v6

    .line 28
    .line 29
    const-string v7, "getView(...)"

    .line 30
    .line 31
    .line 32
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    check-cast v6, Landroid/widget/TextView;

    .line 35
    .line 36
    new-instance v8, Lrs/c$a;

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x3

    .line 39
    .line 40
    .line 41
    invoke-direct {v8, v9, v9, v10, v2}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    const/4 v11, 0x2

    .line 43
    .line 44
    .line 45
    invoke-static {v6, v8, v9, v11, v2}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 46
    .line 47
    sget v6, Lcom/kubi/assets/R$id;->tv_zero_show:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 51
    move-result-object v8

    .line 52
    .line 53
    .line 54
    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    check-cast v8, Landroid/widget/TextView;

    .line 57
    .line 58
    new-instance v7, Lrs/c$a;

    .line 59
    .line 60
    .line 61
    invoke-direct {v7, v9, v9, v10, v2}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v8, v7, v9, v11, v2}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 68
    move-result-wide v7

    .line 69
    .line 70
    const-wide/16 v10, 0x0

    .line 71
    .line 72
    cmpl-double v7, v7, v10

    .line 73
    .line 74
    const/16 v8, 0x8

    .line 75
    .line 76
    if-gtz v7, :cond_3

    .line 77
    .line 78
    if-nez p3, :cond_2

    .line 79
    goto :goto_2

    .line 80
    .line 81
    :cond_2
    sget v7, Lcom/kubi/assets/R$id;->ll_amount_currency:I

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 85
    move-result-object v7

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 92
    move-result-object v6

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6, v9}, Landroid/view/View;->setVisibility(I)V

    .line 96
    goto :goto_3

    .line 97
    .line 98
    :cond_3
    :goto_2
    sget v7, Lcom/kubi/assets/R$id;->ll_amount_currency:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 102
    move-result-object v7

    .line 103
    .line 104
    .line 105
    invoke-virtual {v7, v9}, Landroid/view/View;->setVisibility(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 109
    move-result-object v6

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    .line 113
    :goto_3
    const/4 v6, 0x1

    .line 114
    .line 115
    const-string v7, "--"

    .line 116
    .line 117
    if-eqz p3, :cond_7

    .line 118
    .line 119
    sget-object v8, Lsa/a;->a:Lsa/a;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v8}, Lsa/a;->a()Ly70/g;

    .line 123
    move-result-object v8

    .line 124
    .line 125
    .line 126
    invoke-static {v8, v6}, Ly70/a;->d(Ly70/g;Z)Z

    .line 127
    move-result v8

    .line 128
    .line 129
    if-eqz v8, :cond_5

    .line 130
    .line 131
    if-eqz v1, :cond_4

    .line 132
    .line 133
    .line 134
    invoke-static {v4}, Lcom/kubi/assets/view/q;->b(Ljava/lang/String;)I

    .line 135
    move-result v8

    .line 136
    .line 137
    .line 138
    invoke-static {v1, v4, v8}, Lgf/i;->a(Ljava/math/BigDecimal;Ljava/lang/String;I)Ljava/lang/String;

    .line 139
    move-result-object v8

    .line 140
    goto :goto_4

    .line 141
    :cond_4
    move-object v8, v2

    .line 142
    .line 143
    .line 144
    :goto_4
    invoke-static {v8, v7}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    move-result-object v10

    .line 146
    const/4 v14, 0x6

    .line 147
    const/4 v15, 0x0

    .line 148
    .line 149
    const-string v11, "\u2248"

    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v13, 0x0

    .line 152
    .line 153
    .line 154
    invoke-static/range {v10 .. v15}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 155
    move-result-object v8

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v5, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 159
    .line 160
    sget v5, Lcom/kubi/assets/R$id;->tv_currency:I

    .line 161
    .line 162
    .line 163
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 164
    move-result-wide v10

    .line 165
    .line 166
    .line 167
    invoke-static {v10, v11, v4}, Lkf/a;->m(DLjava/lang/String;)D

    .line 168
    move-result-wide v12

    .line 169
    .line 170
    const/16 v21, 0x3f

    .line 171
    .line 172
    const/16 v22, 0x0

    .line 173
    const/4 v14, 0x0

    .line 174
    .line 175
    const/16 v16, 0x0

    .line 176
    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    const/16 v18, 0x0

    .line 180
    .line 181
    const/16 v19, 0x0

    .line 182
    .line 183
    const/16 v20, 0x1

    .line 184
    .line 185
    .line 186
    invoke-static/range {v12 .. v22}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 187
    move-result-object v4

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v5, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 191
    goto :goto_6

    .line 192
    .line 193
    :cond_5
    sget v8, Lcom/kubi/assets/R$id;->tv_currency:I

    .line 194
    .line 195
    if-eqz v1, :cond_6

    .line 196
    .line 197
    .line 198
    invoke-static {v4}, Lcom/kubi/assets/view/q;->b(Ljava/lang/String;)I

    .line 199
    move-result v10

    .line 200
    .line 201
    .line 202
    invoke-static {v1, v4, v10}, Lgf/i;->a(Ljava/math/BigDecimal;Ljava/lang/String;I)Ljava/lang/String;

    .line 203
    move-result-object v10

    .line 204
    goto :goto_5

    .line 205
    :cond_6
    move-object v10, v2

    .line 206
    .line 207
    .line 208
    :goto_5
    invoke-static {v10, v7}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    move-result-object v10

    .line 210
    .line 211
    .line 212
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    move-result-object v11

    .line 214
    .line 215
    .line 216
    invoke-static {v10, v11, v6, v6}, Lnf/b;->f(Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/String;

    .line 217
    move-result-object v10

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v8, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 221
    .line 222
    .line 223
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 224
    move-result-wide v10

    .line 225
    .line 226
    .line 227
    invoke-static {v10, v11, v4}, Lkf/a;->m(DLjava/lang/String;)D

    .line 228
    move-result-wide v12

    .line 229
    .line 230
    const/16 v21, 0x3f

    .line 231
    .line 232
    const/16 v22, 0x0

    .line 233
    const/4 v14, 0x0

    .line 234
    const/4 v15, 0x0

    .line 235
    .line 236
    const/16 v16, 0x0

    .line 237
    .line 238
    const/16 v17, 0x0

    .line 239
    .line 240
    const/16 v18, 0x0

    .line 241
    .line 242
    const/16 v19, 0x0

    .line 243
    .line 244
    const/16 v20, 0x1

    .line 245
    .line 246
    .line 247
    invoke-static/range {v12 .. v22}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 248
    move-result-object v23

    .line 249
    .line 250
    const/16 v27, 0x6

    .line 251
    .line 252
    const/16 v28, 0x0

    .line 253
    .line 254
    const-string v24, "\u2248"

    .line 255
    .line 256
    const/16 v25, 0x0

    .line 257
    .line 258
    const/16 v26, 0x0

    .line 259
    .line 260
    .line 261
    invoke-static/range {v23 .. v28}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 262
    move-result-object v4

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v5, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 266
    goto :goto_6

    .line 267
    .line 268
    .line 269
    :cond_7
    invoke-virtual {v0, v5, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 270
    .line 271
    sget v4, Lcom/kubi/assets/R$id;->tv_currency:I

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, v4, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 275
    .line 276
    const/16 v14, 0x8

    .line 277
    const/4 v15, 0x0

    .line 278
    .line 279
    const-string v10, "B1overview"

    .line 280
    .line 281
    const-string v11, "errorTips"

    .line 282
    const/4 v13, 0x0

    .line 283
    .line 284
    move-object/from16 v12, p5

    .line 285
    .line 286
    .line 287
    invoke-static/range {v10 .. v15}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 288
    .line 289
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 290
    .line 291
    :goto_6
    sget v4, Lcom/kubi/assets/R$id;->tv_percent:I

    .line 292
    .line 293
    if-eqz p4, :cond_8

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {p4 .. p4}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 297
    move-result-object v5

    .line 298
    .line 299
    if-eqz v5, :cond_8

    .line 300
    .line 301
    .line 302
    invoke-virtual {v5}, Lcom/kubi/data/entity/AssetSingleEntity;->getExecute()Ljava/lang/Boolean;

    .line 303
    move-result-object v5

    .line 304
    .line 305
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 306
    .line 307
    .line 308
    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    move-result v9

    .line 310
    .line 311
    :cond_8
    if-nez v9, :cond_9

    .line 312
    .line 313
    .line 314
    invoke-static {v1, v2, v6, v2}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 315
    move-result-object v1

    .line 316
    .line 317
    move-object/from16 v2, p0

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v1, v3}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->j(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/CharSequence;

    .line 321
    move-result-object v7

    .line 322
    goto :goto_7

    .line 323
    .line 324
    :cond_9
    move-object/from16 v2, p0

    .line 325
    .line 326
    .line 327
    :goto_7
    invoke-virtual {v0, v4, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 328
    return-void
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
.end method

.method public final l(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->j:Z

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
