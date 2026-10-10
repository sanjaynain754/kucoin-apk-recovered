.class public final Lcom/kubi/assets/setting/AssetV2SettingAdapter;
.super Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.source "AssetV2SettingAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
        "Lcom/kubi/assets/entity/AssetV2SettingEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001c\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0015J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0003J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0003J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0003R\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u000b\"\u0004\u0008\u0016\u0010\rR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006$"
    }
    d2 = {
        "Lcom/kubi/assets/setting/AssetV2SettingAdapter;",
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;",
        "Lcom/kubi/assets/entity/AssetV2SettingEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "data",
        "",
        "<init>",
        "(Ljava/util/List;)V",
        "switchClicked",
        "",
        "getSwitchClicked",
        "()Z",
        "setSwitchClicked",
        "(Z)V",
        "baseCurrency",
        "",
        "getBaseCurrency",
        "()Ljava/lang/String;",
        "setBaseCurrency",
        "(Ljava/lang/String;)V",
        "hideFlag",
        "getHideFlag",
        "setHideFlag",
        "isShowSubAccount",
        "()Ljava/lang/Boolean;",
        "setShowSubAccount",
        "(Ljava/lang/Boolean;)V",
        "Ljava/lang/Boolean;",
        "convert",
        "",
        "helper",
        "item",
        "handleFiatCurrency",
        "handleBaseCurrency",
        "handleSubHeader",
        "handleCustomHeader",
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
        "SMAP\nAssetV2SettingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2SettingAdapter.kt\ncom/kubi/assets/setting/AssetV2SettingAdapter\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,200:1\n136#2:201\n136#2:202\n126#2,2:203\n126#2,2:205\n*S KotlinDebug\n*F\n+ 1 AssetV2SettingAdapter.kt\ncom/kubi/assets/setting/AssetV2SettingAdapter\n*L\n169#1:201\n153#1:202\n154#1:203,2\n157#1:205,2\n*E\n"
    }
.end annotation


# instance fields
.field public i:Z

.field public j:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public k:Z

.field public l:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/AssetV2SettingEntity;",
            ">;)V"
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
    .line 8
    invoke-direct {p0, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 9
    .line 10
    sget p1, Lcom/kubi/assets/R$layout;->item_setting_text:I

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 15
    const/4 v0, 0x2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 19
    const/4 p1, 0x3

    .line 20
    .line 21
    sget v0, Lcom/kubi/assets/R$layout;->item_asset_setting_sub:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 25
    const/4 p1, 0x4

    .line 26
    .line 27
    sget v0, Lcom/kubi/assets/R$layout;->view_divider_height8:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v0}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 31
    .line 32
    sget p1, Lcom/kubi/assets/R$layout;->item_text:I

    .line 33
    const/4 v0, 0x5

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 37
    const/4 v0, 0x6

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 41
    const/4 p1, 0x7

    .line 42
    .line 43
    sget v0, Lcom/kubi/assets/R$layout;->item_asset_setting_custom_order:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1, v0}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 47
    return-void
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
.end method

.method public static synthetic g(Lcom/kubi/assets/setting/AssetV2SettingAdapter;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->k(Lcom/kubi/assets/setting/AssetV2SettingAdapter;)Lkotlin/Unit;

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

.method public static final k(Lcom/kubi/assets/setting/AssetV2SettingAdapter;)Lkotlin/Unit;
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lsa/a;->a:Lsa/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lsa/a;->a()Ly70/g;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Ly70/a;->d(Ly70/g;Z)Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lsa/a;->a()Ly70/g;

    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 22
    .line 23
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    const/4 v6, 0x4

    .line 25
    const/4 v7, 0x0

    .line 26
    .line 27
    const-string v2, "event_overview_custom_order"

    .line 28
    .line 29
    const-wide/16 v4, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static/range {v2 .. v7}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0}, Lsa/a;->a()Ly70/g;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v2}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 41
    .line 42
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    const/4 v7, 0x4

    .line 44
    const/4 v8, 0x0

    .line 45
    .line 46
    const-string v3, "event_overview_custom_order"

    .line 47
    .line 48
    const-wide/16 v5, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static/range {v3 .. v8}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 57
    return-object p0
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
.end method


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/assets/entity/AssetV2SettingEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetV2SettingEntity;)V

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

.method public h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetV2SettingEntity;)V
    .locals 2
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/assets/entity/AssetV2SettingEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p2, :cond_7

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getItemType()I

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    if-eq v0, v1, :cond_6

    .line 13
    const/4 v1, 0x2

    .line 14
    .line 15
    if-eq v0, v1, :cond_5

    .line 16
    const/4 v1, 0x3

    .line 17
    .line 18
    if-eq v0, v1, :cond_4

    .line 19
    const/4 v1, 0x5

    .line 20
    .line 21
    if-eq v0, v1, :cond_3

    .line 22
    const/4 v1, 0x6

    .line 23
    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    const/4 v1, 0x7

    .line 26
    .line 27
    if-eq v0, v1, :cond_1

    .line 28
    goto :goto_0

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetV2SettingEntity;)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_2
    sget p2, Lcom/kubi/assets/R$id;->tv_title:I

    .line 35
    .line 36
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 37
    .line 38
    sget v1, Lcom/kubi/assets/R$string;->assetv2_fiat_unit:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 46
    return-void

    .line 47
    .line 48
    :cond_3
    sget p2, Lcom/kubi/assets/R$id;->tv_title:I

    .line 49
    .line 50
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 51
    .line 52
    sget v1, Lcom/kubi/assets/R$string;->assetv2_unit:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 60
    return-void

    .line 61
    .line 62
    .line 63
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetV2SettingEntity;)V

    .line 64
    return-void

    .line 65
    .line 66
    .line 67
    :cond_5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->l(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetV2SettingEntity;)V

    .line 68
    return-void

    .line 69
    .line 70
    .line 71
    :cond_6
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetV2SettingEntity;)V

    .line 72
    :cond_7
    :goto_0
    return-void
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

.method public final i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetV2SettingEntity;)V
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$id;->iv_icon:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 7
    .line 8
    sget v0, Lcom/kubi/assets/R$id;->text:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/widget/TextView;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getSelectEntity()Lcom/kubi/sdk/widget/dialog/a;

    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/kubi/sdk/widget/dialog/a;->getLabel()Ljava/lang/CharSequence;

    .line 25
    move-result-object v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v2, v3

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    iget-object v2, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 33
    .line 34
    const-string v4, "mContext"

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    const/16 v4, 0x8

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v4}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 43
    move-result v2

    .line 44
    float-to-int v2, v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 48
    move-result v5

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    .line 52
    move-result v6

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 56
    move-result v7

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2, v5, v6, v7}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 60
    .line 61
    sget v0, Lcom/kubi/assets/R$id;->view_item:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getSelectEntity()Lcom/kubi/sdk/widget/dialog/a;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Lcom/kubi/sdk/widget/dialog/a;->isChecked()Z

    .line 75
    move-result v2

    .line 76
    .line 77
    .line 78
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 79
    move-result-object v2

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move-object v2, v3

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 85
    move-result v2

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 89
    .line 90
    sget v0, Lcom/kubi/assets/R$id;->image:I

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getSelectEntity()Lcom/kubi/sdk/widget/dialog/a;

    .line 98
    move-result-object p2

    .line 99
    .line 100
    if-eqz p2, :cond_2

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Lcom/kubi/sdk/widget/dialog/a;->isChecked()Z

    .line 104
    move-result p2

    .line 105
    .line 106
    .line 107
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 108
    move-result-object v3

    .line 109
    .line 110
    .line 111
    :cond_2
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 112
    move-result p2

    .line 113
    .line 114
    if-eqz p2, :cond_3

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    move v1, v4

    .line 117
    .line 118
    .line 119
    :goto_2
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 120
    return-void
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

.method public final j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetV2SettingEntity;)V
    .locals 23
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
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
    sget v2, Lcom/kubi/assets/R$id;->first_currency:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    check-cast v2, Lcom/kubi/resources/widget/ShowHideTextView;

    .line 13
    .line 14
    sget v3, Lcom/kubi/assets/R$id;->first_currency_unit:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    check-cast v3, Landroid/widget/TextView;

    .line 21
    .line 22
    sget v4, Lcom/kubi/assets/R$id;->second_currency:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    check-cast v4, Lcom/kubi/resources/widget/ShowHideTextView;

    .line 29
    .line 30
    sget v5, Lcom/kubi/assets/R$id;->second_currency_unit:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 34
    move-result-object v5

    .line 35
    .line 36
    check-cast v5, Landroid/widget/TextView;

    .line 37
    .line 38
    sget v6, Lcom/kubi/assets/R$id;->order_switch:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 42
    move-result-object v1

    .line 43
    move-object v6, v1

    .line 44
    .line 45
    check-cast v6, Lcom/kubi/sdk/widget/shape/view/ShapeImageView;

    .line 46
    .line 47
    .line 48
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 49
    .line 50
    new-instance v9, Lcom/kubi/assets/setting/a;

    .line 51
    .line 52
    .line 53
    invoke-direct {v9, v0}, Lcom/kubi/assets/setting/a;-><init>(Lcom/kubi/assets/setting/AssetV2SettingAdapter;)V

    .line 54
    const/4 v10, 0x1

    .line 55
    const/4 v11, 0x0

    .line 56
    .line 57
    const-wide/16 v7, 0x0

    .line 58
    .line 59
    .line 60
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 61
    .line 62
    iget-boolean v1, v0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->k:Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v1}, Lcom/kubi/resources/widget/ShowHideTextView;->setHide(Z)V

    .line 66
    .line 67
    iget-boolean v1, v0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->k:Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v1}, Lcom/kubi/resources/widget/ShowHideTextView;->setHide(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getCustomOrderEntity()Lcom/kubi/data/entity/CustomOrderEntity;

    .line 74
    move-result-object v1

    .line 75
    const/4 v6, 0x0

    .line 76
    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/kubi/data/entity/CustomOrderEntity;->getBaseCurrency()Ljava/lang/String;

    .line 81
    move-result-object v1

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move-object v1, v6

    .line 84
    .line 85
    :goto_0
    iput-object v1, v0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->j:Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getSubAssetEntity()Lcom/kubi/data/entity/SubAssetEntity;

    .line 89
    move-result-object v1

    .line 90
    const/4 v7, 0x0

    .line 91
    .line 92
    if-eqz v1, :cond_1

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Lcom/kubi/data/entity/SubAssetEntity;->getHasSubAccount()Ljava/lang/Boolean;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    move-result v1

    .line 103
    goto :goto_1

    .line 104
    :cond_1
    move v1, v7

    .line 105
    .line 106
    :goto_1
    if-eqz v1, :cond_4

    .line 107
    .line 108
    iget-object v1, v0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->l:Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getSubAssetEntity()Lcom/kubi/data/entity/SubAssetEntity;

    .line 112
    move-result-object v8

    .line 113
    .line 114
    if-eqz v8, :cond_2

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8}, Lcom/kubi/data/entity/SubAssetEntity;->getShowSubAccountBalanceSwitch()Ljava/lang/Boolean;

    .line 118
    move-result-object v8

    .line 119
    goto :goto_2

    .line 120
    :cond_2
    move-object v8, v6

    .line 121
    .line 122
    .line 123
    :goto_2
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 124
    move-result v8

    .line 125
    .line 126
    .line 127
    invoke-static {v1, v8}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 128
    move-result v1

    .line 129
    .line 130
    if-nez v1, :cond_4

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getCustomOrderEntity()Lcom/kubi/data/entity/CustomOrderEntity;

    .line 134
    move-result-object v1

    .line 135
    .line 136
    if-eqz v1, :cond_3

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/kubi/data/entity/CustomOrderEntity;->getTotalBalanceMinusSub()Ljava/math/BigDecimal;

    .line 140
    move-result-object v1

    .line 141
    goto :goto_3

    .line 142
    :cond_3
    move-object v1, v6

    .line 143
    goto :goto_3

    .line 144
    .line 145
    .line 146
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getCustomOrderEntity()Lcom/kubi/data/entity/CustomOrderEntity;

    .line 147
    move-result-object v1

    .line 148
    .line 149
    if-eqz v1, :cond_3

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Lcom/kubi/data/entity/CustomOrderEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    :goto_3
    sget-object v8, Lsa/a;->a:Lsa/a;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8}, Lsa/a;->a()Ly70/g;

    .line 159
    move-result-object v8

    .line 160
    const/4 v9, 0x1

    .line 161
    .line 162
    .line 163
    invoke-static {v8, v9}, Ly70/a;->d(Ly70/g;Z)Z

    .line 164
    move-result v8

    .line 165
    const/4 v9, 0x2

    .line 166
    const/4 v10, 0x3

    .line 167
    .line 168
    const-string v11, "--"

    .line 169
    .line 170
    if-eqz v8, :cond_8

    .line 171
    .line 172
    .line 173
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 174
    .line 175
    new-instance v8, Lrs/c$a;

    .line 176
    .line 177
    .line 178
    invoke-direct {v8, v7, v7, v10, v6}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v2, v8, v7, v9, v6}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 182
    move-result-object v2

    .line 183
    .line 184
    if-eqz v1, :cond_5

    .line 185
    .line 186
    iget-object v7, v0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->j:Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    invoke-static {v7}, Lcom/kubi/assets/view/q;->b(Ljava/lang/String;)I

    .line 190
    move-result v8

    .line 191
    .line 192
    .line 193
    invoke-static {v1, v7, v8}, Lgf/i;->a(Ljava/math/BigDecimal;Ljava/lang/String;I)Ljava/lang/String;

    .line 194
    move-result-object v7

    .line 195
    goto :goto_4

    .line 196
    :cond_5
    move-object v7, v6

    .line 197
    .line 198
    .line 199
    :goto_4
    invoke-static {v7, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    move-result-object v7

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    .line 205
    iget-object v2, v0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->j:Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    invoke-static {v2, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    move-result-object v2

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    .line 214
    if-eqz v1, :cond_7

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getCustomOrderEntity()Lcom/kubi/data/entity/CustomOrderEntity;

    .line 218
    move-result-object v2

    .line 219
    .line 220
    if-eqz v2, :cond_6

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Lcom/kubi/data/entity/CustomOrderEntity;->getBaseCurrency()Ljava/lang/String;

    .line 224
    move-result-object v6

    .line 225
    .line 226
    .line 227
    :cond_6
    invoke-static {v1, v6}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 228
    move-result-wide v12

    .line 229
    .line 230
    const/16 v21, 0x2f

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
    const/16 v18, 0x1

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
    move-result-object v6

    .line 249
    .line 250
    .line 251
    :cond_7
    invoke-static {v6, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 252
    move-result-object v1

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-static {v5}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 262
    return-void

    .line 263
    .line 264
    .line 265
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 266
    .line 267
    new-instance v8, Lrs/c$a;

    .line 268
    .line 269
    .line 270
    invoke-direct {v8, v7, v7, v10, v6}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v2, v8, v7, v9, v6}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 274
    move-result-object v2

    .line 275
    .line 276
    if-eqz v1, :cond_a

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getCustomOrderEntity()Lcom/kubi/data/entity/CustomOrderEntity;

    .line 280
    move-result-object v7

    .line 281
    .line 282
    if-eqz v7, :cond_9

    .line 283
    .line 284
    .line 285
    invoke-virtual {v7}, Lcom/kubi/data/entity/CustomOrderEntity;->getBaseCurrency()Ljava/lang/String;

    .line 286
    move-result-object v7

    .line 287
    goto :goto_5

    .line 288
    :cond_9
    move-object v7, v6

    .line 289
    .line 290
    .line 291
    :goto_5
    invoke-static {v1, v7}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 292
    move-result-wide v12

    .line 293
    .line 294
    const/16 v21, 0x2f

    .line 295
    .line 296
    const/16 v22, 0x0

    .line 297
    const/4 v14, 0x0

    .line 298
    const/4 v15, 0x0

    .line 299
    .line 300
    const/16 v16, 0x0

    .line 301
    .line 302
    const/16 v17, 0x0

    .line 303
    .line 304
    const/16 v18, 0x1

    .line 305
    .line 306
    const/16 v19, 0x0

    .line 307
    .line 308
    const/16 v20, 0x1

    .line 309
    .line 310
    .line 311
    invoke-static/range {v12 .. v22}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 312
    move-result-object v7

    .line 313
    goto :goto_6

    .line 314
    :cond_a
    move-object v7, v6

    .line 315
    .line 316
    .line 317
    :goto_6
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 318
    move-result-object v7

    .line 319
    .line 320
    .line 321
    invoke-static {v7}, Lcom/kubi/assets/AssetExKt;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    move-result-object v7

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    .line 327
    .line 328
    invoke-static {}, Lkf/c;->c()Ljava/lang/String;

    .line 329
    move-result-object v2

    .line 330
    .line 331
    .line 332
    invoke-static {v2, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 333
    move-result-object v2

    .line 334
    .line 335
    .line 336
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 337
    .line 338
    if-eqz v1, :cond_b

    .line 339
    .line 340
    iget-object v2, v0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->j:Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    invoke-static {v2}, Lcom/kubi/assets/view/q;->b(Ljava/lang/String;)I

    .line 344
    move-result v3

    .line 345
    .line 346
    .line 347
    invoke-static {v1, v2, v3}, Lgf/i;->a(Ljava/math/BigDecimal;Ljava/lang/String;I)Ljava/lang/String;

    .line 348
    move-result-object v6

    .line 349
    .line 350
    .line 351
    :cond_b
    invoke-static {v6, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 352
    move-result-object v12

    .line 353
    .line 354
    const/16 v16, 0x6

    .line 355
    .line 356
    const/16 v17, 0x0

    .line 357
    .line 358
    const-string v13, "\u2248"

    .line 359
    const/4 v14, 0x0

    .line 360
    const/4 v15, 0x0

    .line 361
    .line 362
    .line 363
    invoke-static/range {v12 .. v17}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 364
    move-result-object v1

    .line 365
    .line 366
    .line 367
    invoke-static {v1}, Lnf/b;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 368
    move-result-object v1

    .line 369
    .line 370
    .line 371
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 372
    .line 373
    .line 374
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v5}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 378
    .line 379
    iget-object v1, v0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->j:Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    invoke-static {v1, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 383
    move-result-object v1

    .line 384
    .line 385
    .line 386
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 387
    return-void
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

.method public final l(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetV2SettingEntity;)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$id;->iv_icon:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 7
    .line 8
    iget-object v1, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getFiatCurrency()Lcom/kubi/assets/entity/FiatCurrency;

    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/kubi/assets/entity/FiatCurrency;->getIcon()Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v3

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    check-cast v0, Landroid/widget/ImageView;

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2, v0}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 31
    .line 32
    sget v0, Lcom/kubi/assets/R$id;->text:I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    check-cast v0, Landroid/widget/TextView;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getFiatCurrency()Lcom/kubi/assets/entity/FiatCurrency;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/kubi/assets/entity/FiatCurrency;->getName()Ljava/lang/String;

    .line 48
    move-result-object v1

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-object v1, v3

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    iget-object v1, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 56
    .line 57
    const-string v2, "mContext"

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    const/16 v2, 0x8

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v2}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 66
    move-result v1

    .line 67
    float-to-int v1, v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 71
    move-result v4

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    .line 75
    move-result v5

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 79
    move-result v6

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1, v4, v5, v6}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 83
    .line 84
    sget v0, Lcom/kubi/assets/R$id;->view_item:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getFiatCurrency()Lcom/kubi/assets/entity/FiatCurrency;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/kubi/assets/entity/FiatCurrency;->isChecked()Z

    .line 98
    move-result v1

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    move-result-object v1

    .line 103
    goto :goto_2

    .line 104
    :cond_2
    move-object v1, v3

    .line 105
    .line 106
    .line 107
    :goto_2
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 108
    move-result v1

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 112
    .line 113
    sget v0, Lcom/kubi/assets/R$id;->image:I

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getFiatCurrency()Lcom/kubi/assets/entity/FiatCurrency;

    .line 121
    move-result-object p2

    .line 122
    .line 123
    if-eqz p2, :cond_3

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2}, Lcom/kubi/assets/entity/FiatCurrency;->isChecked()Z

    .line 127
    move-result p2

    .line 128
    .line 129
    .line 130
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 131
    move-result-object v3

    .line 132
    .line 133
    .line 134
    :cond_3
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 135
    move-result p2

    .line 136
    .line 137
    if-eqz p2, :cond_4

    .line 138
    const/4 v2, 0x0

    .line 139
    .line 140
    .line 141
    :cond_4
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 142
    return-void
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

.method public final m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetV2SettingEntity;)V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$id;->switch_sub:I

    .line 3
    .line 4
    .line 5
    filled-new-array {v0}, [I

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->addOnClickListener([I)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 10
    .line 11
    sget v1, Lcom/kubi/assets/R$id;->tv_sub_account:I

    .line 12
    .line 13
    .line 14
    filled-new-array {v1}, [I

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->addOnClickListener([I)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 19
    .line 20
    iget-boolean v1, p0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->i:Z

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getSubAssetEntity()Lcom/kubi/data/entity/SubAssetEntity;

    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/kubi/data/entity/SubAssetEntity;->getShowSubAccountBalanceSwitch()Ljava/lang/Boolean;

    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v0, v1

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 45
    move-result v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AssetV2SettingEntity;->getSubAssetEntity()Lcom/kubi/data/entity/SubAssetEntity;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/kubi/data/entity/SubAssetEntity;->getShowSubAccountBalanceSwitch()Ljava/lang/Boolean;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 62
    move-result p1

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    iput-object p1, p0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->l:Ljava/lang/Boolean;

    .line 69
    :cond_2
    return-void
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

.method public final n(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->k:Z

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

.method public final o(Ljava/lang/Boolean;)V
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->l:Ljava/lang/Boolean;

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

.method public final p(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/setting/AssetV2SettingAdapter;->i:Z

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
