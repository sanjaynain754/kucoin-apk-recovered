.class public interface abstract Lcom/kubi/assets/finance/b0;
.super Ljava/lang/Object;
.source "FinanceSettable.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\r\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/assets/finance/FinanceSettable;",
        "",
        "setKcsLevel",
        "",
        "item",
        "Lcom/kubi/assets/entity/ProductChildEntity;",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "setKcsLevelIcon",
        "kcsLevel",
        "",
        "setKcsLevelStyles",
        "applyRtlConstraints",
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


# virtual methods
.method public b(Lio/chad/library/adapter/base/BaseViewHolder;I)V
    .locals 1

    .line 1
    .line 2
    if-eqz p2, :cond_2

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p2, v0, :cond_2

    .line 6
    const/4 v0, 0x2

    .line 7
    .line 8
    if-eq p2, v0, :cond_1

    .line 9
    const/4 v0, 0x3

    .line 10
    .line 11
    if-eq p2, v0, :cond_0

    .line 12
    .line 13
    sget p2, Lcom/kubi/assets/R$mipmap;->asset_kcs4_icon:I

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    sget p2, Lcom/kubi/assets/R$mipmap;->asset_kcs3_icon:I

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_1
    sget p2, Lcom/kubi/assets/R$mipmap;->asset_kcs2_icon:I

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_2
    sget p2, Lcom/kubi/assets/R$mipmap;->asset_kcs1_icon:I

    .line 23
    .line 24
    :goto_0
    sget v0, Lcom/kubi/assets/R$id;->ivKcsIcon:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->setImageResource(II)Lio/chad/library/adapter/base/BaseViewHolder;

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
.end method

.method public d(Lcom/kubi/assets/entity/ProductChildEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V
    .locals 1
    .param p1    # Lcom/kubi/assets/entity/ProductChildEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "helper"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/kubi/assets/entity/ProductChildEntity;->getKcsRightsBonus()Lcom/kubi/assets/entity/KcsRightsBonusEntity;

    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p1, v0

    .line 15
    .line 16
    :goto_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/assets/entity/KcsRightsBonusEntity;->getKcsLevel()Ljava/lang/Integer;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    :cond_1
    if-nez v0, :cond_2

    .line 23
    .line 24
    sget p1, Lcom/kubi/assets/R$id;->ivKcsIcon:I

    .line 25
    const/4 v0, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 29
    return-void

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/assets/entity/KcsRightsBonusEntity;->getKcsLevel()Ljava/lang/Integer;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 37
    move-result v0

    .line 38
    .line 39
    .line 40
    invoke-interface {p0, p2, v0}, Lcom/kubi/assets/finance/b0;->f(Lio/chad/library/adapter/base/BaseViewHolder;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/kubi/assets/entity/KcsRightsBonusEntity;->getKcsLevel()Ljava/lang/Integer;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 48
    move-result p1

    .line 49
    .line 50
    .line 51
    invoke-interface {p0, p2, p1}, Lcom/kubi/assets/finance/b0;->b(Lio/chad/library/adapter/base/BaseViewHolder;I)V

    .line 52
    return-void
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

.method public e(Lio/chad/library/adapter/base/BaseViewHolder;)V
    .locals 6
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "helper"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_0
    sget v0, Lcom/kubi/assets/R$id;->ivKcsIcon:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Landroid/widget/ImageView;

    .line 21
    .line 22
    sget v1, Lcom/kubi/assets/R$id;->tvAnnualized:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Landroid/widget/TextView;

    .line 29
    .line 30
    new-instance v2, Landroidx/constraintlayout/widget/ConstraintSet;

    .line 31
    .line 32
    .line 33
    invoke-direct {v2}, Landroidx/constraintlayout/widget/ConstraintSet;-><init>()V

    .line 34
    .line 35
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 36
    .line 37
    instance-of v3, p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 p1, 0x0

    .line 44
    .line 45
    :goto_0
    if-nez p1, :cond_2

    .line 46
    :goto_1
    return-void

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {v2, p1}, Landroidx/constraintlayout/widget/ConstraintSet;->clone(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 53
    move-result v3

    .line 54
    const/4 v4, 0x5

    .line 55
    .line 56
    .line 57
    invoke-static {v4}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x7

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3, v5, v4}, Landroidx/constraintlayout/widget/ConstraintSet;->setMargin(III)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 66
    move-result v3

    .line 67
    const/4 v4, 0x0

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v3, v5, v4, v5}, Landroidx/constraintlayout/widget/ConstraintSet;->connect(IIII)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 74
    move-result v0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 78
    move-result v1

    .line 79
    const/4 v3, 0x6

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v0, v5, v1, v3}, Landroidx/constraintlayout/widget/ConstraintSet;->connect(IIII)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, p1}, Landroidx/constraintlayout/widget/ConstraintSet;->applyTo(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 86
    return-void
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

.method public f(Lio/chad/library/adapter/base/BaseViewHolder;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lcom/kubi/assets/finance/b0;->e(Lio/chad/library/adapter/base/BaseViewHolder;)V

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
.end method
