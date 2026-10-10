.class public abstract Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "BaseMultiItemQuickAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lio/chad/library/adapter/base/entity/MultiItemEntity;",
        "K:",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">",
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "TT;TK;>;"
    }
.end annotation


# static fields
.field private static final DEFAULT_VIEW_TYPE:I = -0xff

.field public static final TYPE_NOT_FOUND:I = -0x194


# instance fields
.field private layouts:Landroid/util/SparseIntArray;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(Ljava/util/List;)V

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
.end method

.method private getLayoutId(I)I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->layouts:Landroid/util/SparseIntArray;

    .line 3
    .line 4
    const/16 v1, -0x194

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    .line 8
    move-result p1

    .line 9
    return p1
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
.end method


# virtual methods
.method public addItemType(II)V
    .locals 1
    .param p2    # I
        .annotation build Landroidx/annotation/LayoutRes;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->layouts:Landroid/util/SparseIntArray;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroid/util/SparseIntArray;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->layouts:Landroid/util/SparseIntArray;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->layouts:Landroid/util/SparseIntArray;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseIntArray;->put(II)V

    .line 17
    return-void
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
.end method

.method public getDefItemViewType(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mData:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Lio/chad/library/adapter/base/entity/MultiItemEntity;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lio/chad/library/adapter/base/entity/MultiItemEntity;->getItemType()I

    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    .line 17
    :cond_0
    const/16 p1, -0xff

    .line 18
    return p1
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
.end method

.method public getParentPositionInAll(I)I
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Lio/chad/library/adapter/base/entity/MultiItemEntity;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->isExpandable(Lio/chad/library/adapter/base/entity/MultiItemEntity;)Z

    .line 14
    move-result v2

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    check-cast v1, Lio/chad/library/adapter/base/entity/IExpandable;

    .line 19
    .line 20
    add-int/lit8 p1, p1, -0x1

    .line 21
    .line 22
    :goto_0
    if-ltz p1, :cond_3

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    check-cast v2, Lio/chad/library/adapter/base/entity/MultiItemEntity;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->isExpandable(Lio/chad/library/adapter/base/entity/MultiItemEntity;)Z

    .line 32
    move-result v3

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Lio/chad/library/adapter/base/entity/IExpandable;->getLevel()I

    .line 38
    move-result v3

    .line 39
    .line 40
    check-cast v2, Lio/chad/library/adapter/base/entity/IExpandable;

    .line 41
    .line 42
    .line 43
    invoke-interface {v2}, Lio/chad/library/adapter/base/entity/IExpandable;->getLevel()I

    .line 44
    move-result v2

    .line 45
    .line 46
    if-le v3, v2, :cond_0

    .line 47
    return p1

    .line 48
    .line 49
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :cond_1
    add-int/lit8 p1, p1, -0x1

    .line 53
    .line 54
    :goto_1
    if-ltz p1, :cond_3

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    check-cast v1, Lio/chad/library/adapter/base/entity/MultiItemEntity;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->isExpandable(Lio/chad/library/adapter/base/entity/MultiItemEntity;)Z

    .line 64
    move-result v1

    .line 65
    .line 66
    if-eqz v1, :cond_2

    .line 67
    return p1

    .line 68
    .line 69
    :cond_2
    add-int/lit8 p1, p1, -0x1

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const/4 p1, -0x1

    .line 72
    return p1
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
.end method

.method public isExpandable(Lio/chad/library/adapter/base/entity/MultiItemEntity;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    instance-of p1, p1, Lio/chad/library/adapter/base/entity/IExpandable;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic isExpandable(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lio/chad/library/adapter/base/entity/MultiItemEntity;

    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->isExpandable(Lio/chad/library/adapter/base/entity/MultiItemEntity;)Z

    move-result p1

    return p1
.end method

.method public onCreateDefViewHolder(Landroid/view/ViewGroup;I)Lio/chad/library/adapter/base/BaseViewHolder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)TK;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->getLayoutId(I)I

    .line 4
    move-result p2

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseQuickAdapter;->createBaseViewHolder(Landroid/view/ViewGroup;I)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
.end method

.method public remove(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mData:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    if-ltz p1, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    move-result v0

    .line 11
    .line 12
    if-lt p1, v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mData:Ljava/util/List;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Lio/chad/library/adapter/base/entity/MultiItemEntity;

    .line 22
    .line 23
    instance-of v1, v0, Lio/chad/library/adapter/base/entity/IExpandable;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    move-object v1, v0

    .line 27
    .line 28
    check-cast v1, Lio/chad/library/adapter/base/entity/IExpandable;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->removeAllChild(Lio/chad/library/adapter/base/entity/IExpandable;I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0, v0}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->removeDataFromParent(Lio/chad/library/adapter/base/entity/MultiItemEntity;)V

    .line 35
    .line 36
    .line 37
    invoke-super {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->remove(I)V

    .line 38
    :cond_2
    :goto_0
    return-void
    .line 39
.end method

.method public removeAllChild(Lio/chad/library/adapter/base/entity/IExpandable;I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lio/chad/library/adapter/base/entity/IExpandable;->isExpanded()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lio/chad/library/adapter/base/entity/IExpandable;->getSubItems()Ljava/util/List;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 23
    move-result p1

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    :goto_0
    if-ge v0, p1, :cond_1

    .line 27
    .line 28
    add-int/lit8 v1, p2, 0x1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->remove(I)V

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
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
.end method

.method public removeDataFromParent(Lio/chad/library/adapter/base/entity/MultiItemEntity;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getParentPosition(Ljava/lang/Object;)I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-ltz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mData:Ljava/util/List;

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lio/chad/library/adapter/base/entity/IExpandable;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lio/chad/library/adapter/base/entity/IExpandable;->getSubItems()Ljava/util/List;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 22
    :cond_0
    return-void
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
.end method

.method public setDefaultViewTypeLayout(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/LayoutRes;
        .end annotation
    .end param

    .line 1
    .line 2
    const/16 v0, -0xff

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

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
.end method
