.class public final Lcom/kubi/home/shortcut/edit/HeaderAdapter;
.super Lcom/kubi/home/common/BaseMultiItemDragQuickAdapter;
.source "HeaderAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/home/common/BaseMultiItemDragQuickAdapter<",
        "Lcom/kubi/home/shortcut/IMenuItem;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0010\u001f\n\u0002\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u001c\u0010\u0014\u001a\u00020\u000f2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/kubi/home/shortcut/edit/HeaderAdapter;",
        "Lcom/kubi/home/common/BaseMultiItemDragQuickAdapter;",
        "Lcom/kubi/home/shortcut/IMenuItem;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "editHomeMenuHelper",
        "Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;",
        "data",
        "",
        "<init>",
        "(Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;Ljava/util/List;)V",
        "getEditHomeMenuHelper",
        "()Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;",
        "setEditHomeMenuHelper",
        "(Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;)V",
        "replaceData",
        "",
        "",
        "onViewAttachedToWindow",
        "holder",
        "uploadItemExpose",
        "convert",
        "helper",
        "item",
        "HomeLib_googleRelease"
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
.field public j:Lcom/kubi/home/shortcut/edit/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/home/shortcut/edit/l;Ljava/util/List;)V
    .locals 1
    .param p1    # Lcom/kubi/home/shortcut/edit/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/home/shortcut/edit/l;",
            "Ljava/util/List<",
            "Lcom/kubi/home/shortcut/IMenuItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "editHomeMenuHelper"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "data"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2}, Lcom/kubi/home/common/BaseMultiItemDragQuickAdapter;-><init>(Ljava/util/List;)V

    .line 14
    .line 15
    iput-object p1, p0, Lcom/kubi/home/shortcut/edit/HeaderAdapter;->j:Lcom/kubi/home/shortcut/edit/l;

    .line 16
    const/4 p1, 0x1

    .line 17
    .line 18
    sget p2, Lcom/kubi/home/R$layout;->home_edit_menu_adapter_item:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Lcom/kubi/home/common/BaseMultiItemDragQuickAdapter;->addItemType(II)V

    .line 22
    const/4 p1, 0x2

    .line 23
    .line 24
    sget p2, Lcom/kubi/home/R$layout;->view_edit_menu_item_empty:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/kubi/home/common/BaseMultiItemDragQuickAdapter;->addItemType(II)V

    .line 28
    return-void
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
.end method


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/home/shortcut/IMenuItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/home/shortcut/edit/HeaderAdapter;->h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/home/shortcut/IMenuItem;)V

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
.end method

.method public bridge synthetic g(Lio/chad/library/adapter/base/BaseViewHolder;Lio/chad/library/adapter/base/entity/MultiItemEntity;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/home/shortcut/IMenuItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/home/shortcut/edit/HeaderAdapter;->h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/home/shortcut/IMenuItem;)V

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
.end method

.method public h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/home/shortcut/IMenuItem;)V
    .locals 4
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/home/shortcut/IMenuItem;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/kubi/home/common/BaseMultiItemDragQuickAdapter;->g(Lio/chad/library/adapter/base/BaseViewHolder;Lio/chad/library/adapter/base/entity/MultiItemEntity;)V

    .line 4
    .line 5
    instance-of v0, p2, Lcom/kubi/home/shortcut/FunctionEntity;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/home/shortcut/edit/HeaderAdapter;->j:Lcom/kubi/home/shortcut/edit/l;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/home/shortcut/edit/l;->k()Ljava/util/List;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/kubi/home/shortcut/edit/HeaderAdapter;->j:Lcom/kubi/home/shortcut/edit/l;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/kubi/home/shortcut/edit/l;->k()Ljava/util/List;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    :cond_0
    if-eqz p1, :cond_3

    .line 31
    .line 32
    sget v0, Lcom/kubi/home/R$id;->tv_label:I

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
    move-object v1, p2

    .line 40
    .line 41
    check-cast v1, Lcom/kubi/home/shortcut/FunctionEntity;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/kubi/home/shortcut/FunctionEntity;->getName()Ljava/lang/String;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    iget-object v0, p0, Lcom/kubi/home/shortcut/edit/HeaderAdapter;->j:Lcom/kubi/home/shortcut/edit/l;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/kubi/home/shortcut/FunctionEntity;->getMarks()Ljava/util/List;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1, p1, v2}, Lcom/kubi/home/shortcut/edit/l;->v(Lcom/kubi/home/shortcut/FunctionEntity;Lio/chad/library/adapter/base/BaseViewHolder;Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/kubi/home/shortcut/FunctionEntity;->getEditing()Z

    .line 61
    move-result v0

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    sget v0, Lcom/kubi/home/R$id;->iv_menu_edit_icon:I

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    check-cast v2, Landroid/widget/ImageView;

    .line 72
    .line 73
    sget v3, Lcom/kubi/home/R$drawable;->ic_sub_filled_16:I

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    check-cast v0, Landroid/widget/ImageView;

    .line 83
    .line 84
    iget-object v2, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 85
    .line 86
    sget v3, Lcom/kubi/home/R$color;->secondary:I

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 94
    .line 95
    :cond_1
    sget v0, Lcom/kubi/home/R$id;->iv_menu_edit_icon:I

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Lcom/kubi/home/shortcut/FunctionEntity;->getEditing()Z

    .line 99
    move-result v2

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 103
    .line 104
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 105
    .line 106
    new-instance v2, Lcom/kubi/resources/j;

    .line 107
    .line 108
    new-instance v3, Lcom/kubi/home/shortcut/edit/HeaderAdapter$a;

    .line 109
    .line 110
    .line 111
    invoke-direct {v3, p2, p0, p1}, Lcom/kubi/home/shortcut/edit/HeaderAdapter$a;-><init>(Lcom/kubi/home/shortcut/IMenuItem;Lcom/kubi/home/shortcut/edit/HeaderAdapter;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 112
    .line 113
    .line 114
    invoke-direct {v2, v3}, Lcom/kubi/resources/j;-><init>(Lcom/kubi/resources/j$a;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    .line 119
    iget-object p2, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    invoke-static {p2}, Lxy/a;->a(Landroid/content/Context;)Lxy/d;

    .line 123
    move-result-object p2

    .line 124
    .line 125
    sget-object v0, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/kubi/kucoin/utils/r;->l()Z

    .line 129
    move-result v0

    .line 130
    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Lcom/kubi/home/shortcut/FunctionEntity;->getIcons()Ljava/lang/String;

    .line 135
    move-result-object v0

    .line 136
    goto :goto_0

    .line 137
    .line 138
    .line 139
    :cond_2
    invoke-virtual {v1}, Lcom/kubi/home/shortcut/FunctionEntity;->getDarkIcons()Ljava/lang/String;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    .line 143
    :goto_0
    invoke-virtual {p2, v0}, Lxy/d;->N(Ljava/lang/String;)Lxy/c;

    .line 144
    move-result-object p2

    .line 145
    .line 146
    new-instance v0, Ll2/f;

    .line 147
    .line 148
    .line 149
    invoke-direct {v0}, Ll2/f;-><init>()V

    .line 150
    .line 151
    sget v1, Lcom/kubi/home/R$mipmap;->ic_placeholder:I

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ll2/a;->b0(I)Ll2/a;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    check-cast v0, Ll2/f;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ll2/a;->m(I)Ll2/a;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, v0}, Lxy/c;->R0(Ll2/a;)Lxy/c;

    .line 165
    move-result-object p2

    .line 166
    .line 167
    sget v0, Lcom/kubi/home/R$id;->iv_menu_icon:I

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 171
    move-result-object p1

    .line 172
    .line 173
    check-cast p1, Landroid/widget/ImageView;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/g;->E0(Landroid/widget/ImageView;)Lm2/k;

    .line 177
    :cond_3
    return-void
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
.end method

.method public final i()Lcom/kubi/home/shortcut/edit/l;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/shortcut/edit/HeaderAdapter;->j:Lcom/kubi/home/shortcut/edit/l;

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
.end method

.method public final j(Lio/chad/library/adapter/base/BaseViewHolder;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/kubi/home/shortcut/IMenuItem;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    instance-of v1, v0, Lcom/kubi/home/shortcut/FunctionEntity;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lcom/kubi/home/shortcut/edit/HeaderAdapter;->j:Lcom/kubi/home/shortcut/edit/l;

    .line 19
    .line 20
    check-cast v0, Lcom/kubi/home/shortcut/FunctionEntity;

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 25
    move-result p1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0, v2, p1}, Lcom/kubi/home/shortcut/edit/l;->x(Lcom/kubi/home/shortcut/FunctionEntity;II)V

    .line 29
    :cond_0
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
.end method

.method public bridge synthetic onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p1, Lio/chad/library/adapter/base/BaseViewHolder;

    invoke-virtual {p0, p1}, Lcom/kubi/home/shortcut/edit/HeaderAdapter;->onViewAttachedToWindow(Lio/chad/library/adapter/base/BaseViewHolder;)V

    return-void
.end method

.method public onViewAttachedToWindow(Lio/chad/library/adapter/base/BaseViewHolder;)V
    .locals 1
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->onViewAttachedToWindow(Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/home/shortcut/edit/HeaderAdapter;->j(Lio/chad/library/adapter/base/BaseViewHolder;)V

    return-void
.end method

.method public replaceData(Ljava/util/Collection;)V
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/kubi/home/shortcut/IMenuItem;",
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
    invoke-super {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 9
    return-void
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
.end method
