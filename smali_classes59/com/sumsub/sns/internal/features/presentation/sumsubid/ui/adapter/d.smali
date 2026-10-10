.class public final Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/d;
.super Lcom/sumsub/sns/core/presentation/base/adapter/b;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/adapter/b;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/d;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    new-instance p1, Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/d;->c:Ljava/util/HashMap;

    .line 13
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/d;ILcom/sumsub/sns/internal/features/presentation/sumsubid/p;)V
    .locals 7

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;

    .line 3
    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/d;->c:Ljava/util/HashMap;

    .line 7
    move-object v1, p2

    .line 8
    .line 9
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;->b:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    return-void

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    move v3, v2

    .line 27
    .line 28
    :cond_1
    :goto_0
    if-ge v3, v1, :cond_5

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    check-cast v4, Ljava/lang/Number;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 40
    move-result v4

    .line 41
    .line 42
    iget-object v5, p0, Lcom/sumsub/sns/core/presentation/base/adapter/b;->a:Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    instance-of v6, v5, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;

    .line 49
    .line 50
    if-eqz v6, :cond_2

    .line 51
    .line 52
    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const/4 v5, 0x0

    .line 55
    .line 56
    :goto_1
    if-eqz v5, :cond_4

    .line 57
    .line 58
    if-ne v4, p1, :cond_3

    .line 59
    const/4 v6, 0x1

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move v6, v2

    .line 62
    .line 63
    :goto_2
    iput-boolean v6, v5, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;->g:Z

    .line 64
    .line 65
    :cond_4
    if-eq v4, p1, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 69
    goto :goto_0

    .line 70
    .line 71
    :cond_5
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/d;->b:Lkotlin/jvm/functions/Function1;

    .line 72
    .line 73
    .line 74
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    return-void
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
.end method


# virtual methods
.method public final getItemViewType(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/adapter/b;->a:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;

    .line 9
    .line 10
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/o;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    .line 16
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    const/4 p1, 0x2

    .line 20
    return p1

    .line 21
    .line 22
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    const/4 p1, 0x3

    .line 26
    return p1

    .line 27
    .line 28
    :cond_2
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/k;

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    const/4 p1, 0x4

    .line 32
    return p1

    .line 33
    .line 34
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 38
    throw p1
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
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/core/presentation/base/adapter/c;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/adapter/b;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/adapter/b;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Lcom/sumsub/sns/core/presentation/base/adapter/c;->a(Ljava/lang/Object;I)V

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
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    if-eq p2, v0, :cond_3

    .line 5
    const/4 v0, 0x2

    .line 6
    .line 7
    if-eq p2, v0, :cond_2

    .line 8
    const/4 v0, 0x3

    .line 9
    .line 10
    if-eq p2, v0, :cond_1

    .line 11
    const/4 v0, 0x4

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    sget p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/e;->g:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 23
    move-result-object p2

    .line 24
    .line 25
    sget v0, Lcom/sumsub/sns/R$layout;->sns_sumsubid_adapter_item_title:I

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/e;

    .line 32
    .line 33
    .line 34
    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/e;-><init>(Landroid/view/View;)V

    .line 35
    return-object p2

    .line 36
    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string p2, "Cannot create view holder for SNSSumsubIdDocumentsAdapter"

    .line 40
    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    throw p1

    .line 44
    .line 45
    :cond_1
    sget p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;->g:I

    .line 46
    .line 47
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/c;

    .line 48
    .line 49
    .line 50
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/d;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    sget v2, Lcom/sumsub/sns/R$layout;->sns_sumsubid_adapter_item_radio_button:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lcom/sumsub/sns/databinding/F;->a(Landroid/view/View;)Lcom/sumsub/sns/databinding/F;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    iget-object v0, p1, Lcom/sumsub/sns/databinding/F;->c:Lcom/sumsub/sns/core/widget/SNSCardRadioButton;

    .line 71
    .line 72
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SUMSUB_ID_CARD_STYLE:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/SNSCardRadioButton;->setCardStyle(Lcom/sumsub/sns/core/theme/SNSMetricElement;)V

    .line 76
    .line 77
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;

    .line 78
    .line 79
    iget-object p1, p1, Lcom/sumsub/sns/databinding/F;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/c;)V

    .line 83
    return-object v0

    .line 84
    .line 85
    :cond_2
    sget p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;->g:I

    .line 86
    .line 87
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/b;

    .line 88
    .line 89
    .line 90
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/d;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    .line 97
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    sget v2, Lcom/sumsub/sns/R$layout;->sns_sumsubid_adapter_item_checkbox:I

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Lcom/sumsub/sns/databinding/E;->a(Landroid/view/View;)Lcom/sumsub/sns/databinding/E;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    iget-object v0, p1, Lcom/sumsub/sns/databinding/E;->b:Lcom/sumsub/sns/core/widget/SNSCardCheckBox;

    .line 111
    .line 112
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SUMSUB_ID_CARD_STYLE:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/SNSCardCheckBox;->setCardStyle(Lcom/sumsub/sns/core/theme/SNSMetricElement;)V

    .line 116
    .line 117
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;

    .line 118
    .line 119
    iget-object p1, p1, Lcom/sumsub/sns/databinding/E;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 120
    .line 121
    .line 122
    invoke-direct {v0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/b;)V

    .line 123
    return-object v0

    .line 124
    .line 125
    :cond_3
    sget p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/g;->g:I

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 129
    move-result-object p2

    .line 130
    .line 131
    .line 132
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 133
    move-result-object p2

    .line 134
    .line 135
    sget v0, Lcom/sumsub/sns/R$layout;->sns_sumsubid_adapter_item_section:I

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/g;

    .line 142
    .line 143
    .line 144
    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/g;-><init>(Landroid/view/View;)V

    .line 145
    return-object p2
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
.end method
