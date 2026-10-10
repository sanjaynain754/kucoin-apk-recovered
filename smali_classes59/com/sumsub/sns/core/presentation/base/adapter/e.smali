.class public final Lcom/sumsub/sns/core/presentation/base/adapter/e;
.super Lcom/sumsub/sns/core/presentation/base/adapter/b;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final b:Lcom/sumsub/sns/internal/features/presentation/status/d;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/status/d;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/adapter/b;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/base/adapter/e;->b:Lcom/sumsub/sns/internal/features/presentation/status/d;

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
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/a;

    .line 9
    .line 10
    iget p1, p1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/a;->a:I

    .line 11
    return p1
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
    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/base/adapter/a;

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
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string p2, "Cannot create view holder for SNSDocumentListAdapter"

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 12
    throw p1

    .line 13
    .line 14
    :pswitch_0
    sget p2, Lcom/sumsub/sns/core/presentation/base/adapter/holders/b;->g:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    .line 21
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    sget v1, Lcom/sumsub/sns/R$layout;->sns_layout_status_documents_moderator_comment_item:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    new-instance p2, Lcom/sumsub/sns/core/presentation/base/adapter/holders/b;

    .line 31
    .line 32
    .line 33
    invoke-direct {p2, p1}, Lcom/sumsub/sns/core/presentation/base/adapter/holders/b;-><init>(Landroid/view/View;)V

    .line 34
    return-object p2

    .line 35
    .line 36
    :pswitch_1
    sget p2, Lcom/sumsub/sns/core/presentation/base/adapter/holders/f;->g:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 40
    move-result-object p2

    .line 41
    .line 42
    .line 43
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 44
    move-result-object p2

    .line 45
    .line 46
    sget v1, Lcom/sumsub/sns/R$layout;->sns_layout_status_text_item:I

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    new-instance p2, Lcom/sumsub/sns/core/presentation/base/adapter/holders/f;

    .line 53
    .line 54
    .line 55
    invoke-direct {p2, p1}, Lcom/sumsub/sns/core/presentation/base/adapter/holders/f;-><init>(Landroid/view/View;)V

    .line 56
    return-object p2

    .line 57
    .line 58
    :pswitch_2
    sget p2, Lcom/sumsub/sns/core/presentation/base/adapter/holders/g;->g:I

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    .line 65
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 66
    move-result-object p2

    .line 67
    .line 68
    sget v1, Lcom/sumsub/sns/R$layout;->sns_layout_status_title_item:I

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    new-instance p2, Lcom/sumsub/sns/core/presentation/base/adapter/holders/g;

    .line 75
    .line 76
    .line 77
    invoke-direct {p2, p1}, Lcom/sumsub/sns/core/presentation/base/adapter/holders/g;-><init>(Landroid/view/View;)V

    .line 78
    return-object p2

    .line 79
    .line 80
    :pswitch_3
    sget p2, Lcom/sumsub/sns/core/presentation/base/adapter/holders/c;->g:I

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 84
    move-result-object p2

    .line 85
    .line 86
    .line 87
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 88
    move-result-object p2

    .line 89
    .line 90
    sget v1, Lcom/sumsub/sns/R$layout;->sns_layout_status_image_item:I

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    new-instance p2, Lcom/sumsub/sns/core/presentation/base/adapter/holders/c;

    .line 97
    .line 98
    .line 99
    invoke-direct {p2, p1}, Lcom/sumsub/sns/core/presentation/base/adapter/holders/c;-><init>(Landroid/view/View;)V

    .line 100
    return-object p2

    .line 101
    .line 102
    :pswitch_4
    sget p2, Lcom/sumsub/sns/core/presentation/base/adapter/holders/e;->g:I

    .line 103
    .line 104
    new-instance p2, Lcom/sumsub/sns/core/presentation/base/adapter/d;

    .line 105
    .line 106
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/adapter/e;->b:Lcom/sumsub/sns/internal/features/presentation/status/d;

    .line 107
    .line 108
    .line 109
    invoke-direct {p2, v1}, Lcom/sumsub/sns/core/presentation/base/adapter/d;-><init>(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 113
    move-result-object v1

    .line 114
    .line 115
    .line 116
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 117
    move-result-object v1

    .line 118
    .line 119
    sget v2, Lcom/sumsub/sns/R$layout;->sns_layout_moderator_comment_item:I

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    new-instance v0, Lcom/sumsub/sns/core/presentation/base/adapter/holders/e;

    .line 126
    .line 127
    .line 128
    invoke-direct {v0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/adapter/holders/e;-><init>(Landroid/view/View;Lcom/sumsub/sns/core/presentation/base/adapter/d;)V

    .line 129
    return-object v0

    .line 130
    .line 131
    :pswitch_5
    sget p2, Lcom/sumsub/sns/core/presentation/base/adapter/holders/a;->g:I

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    move-result-object p2

    .line 136
    .line 137
    .line 138
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 139
    move-result-object p2

    .line 140
    .line 141
    sget v1, Lcom/sumsub/sns/R$layout;->sns_layout_status_document_item:I

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 145
    move-result-object p1

    .line 146
    .line 147
    new-instance p2, Lcom/sumsub/sns/core/presentation/base/adapter/holders/a;

    .line 148
    .line 149
    .line 150
    invoke-direct {p2, p1}, Lcom/sumsub/sns/core/presentation/base/adapter/holders/a;-><init>(Landroid/view/View;)V

    .line 151
    return-object p2

    .line 152
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
