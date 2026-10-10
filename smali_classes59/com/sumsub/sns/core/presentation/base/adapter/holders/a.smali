.class public final Lcom/sumsub/sns/core/presentation/base/adapter/holders/a;
.super Lcom/sumsub/sns/core/presentation/base/adapter/c;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic g:I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/presentation/base/adapter/c;-><init>(Landroid/view/View;)V

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
.end method


# virtual methods
.method public final a(Ljava/lang/Object;I)V
    .locals 5

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/a;

    .line 3
    .line 4
    instance-of p2, p1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 11
    .line 12
    instance-of v0, p2, Lcom/sumsub/sns/core/widget/SNSStepView;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p2, Lcom/sumsub/sns/core/widget/SNSStepView;

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object p2, v1

    .line 20
    .line 21
    :goto_0
    if-eqz p2, :cond_5

    .line 22
    .line 23
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    .line 24
    .line 25
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;->c:Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/core/widget/SNSStepView;->setTitle(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 40
    move-result v0

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    const-string v0, "   "

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/core/widget/SNSStepView;->setTitle(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    :cond_2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;->d:Ljava/lang/CharSequence;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    .line 59
    move-result-object v0

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move-object v0, v1

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/core/widget/SNSStepView;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;->f:Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;

    .line 71
    .line 72
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;->a:Lcom/sumsub/sns/internal/core/presentation/base/adapter/SNSDocumentViewTypeInfo$Type;

    .line 73
    .line 74
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/base/adapter/SNSDocumentViewTypeInfo$Type;->VIDEO_IDENTIFICATION:Lcom/sumsub/sns/internal/core/presentation/base/adapter/SNSDocumentViewTypeInfo$Type;

    .line 75
    .line 76
    if-ne v2, v3, :cond_4

    .line 77
    .line 78
    sget-object v2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 85
    .line 86
    const-string v4, "VIDEO_IDENT"

    .line 87
    .line 88
    .line 89
    invoke-direct {v3, v4}, Lcom/sumsub/sns/internal/features/data/model/common/X;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/X;->b()Ljava/lang/String;

    .line 93
    move-result-object v3

    .line 94
    .line 95
    .line 96
    invoke-interface {v2, v0, v3}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 97
    move-result-object v0

    .line 98
    goto :goto_2

    .line 99
    .line 100
    :cond_4
    sget-object v2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    iget-object v3, p1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;->f:Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;

    .line 107
    .line 108
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 112
    move-result-object v3

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/X;->b()Ljava/lang/String;

    .line 116
    move-result-object v3

    .line 117
    .line 118
    .line 119
    invoke-interface {v2, v0, v3}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    :goto_2
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/core/widget/SNSStepView;->setIconStart(Landroid/graphics/drawable/Drawable;)V

    .line 124
    .line 125
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;->b:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 126
    .line 127
    .line 128
    invoke-static {p2, p1}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->setSnsStepState(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, v1}, Lcom/sumsub/sns/core/widget/SNSStepView;->setIconEnd(Landroid/graphics/drawable/Drawable;)V

    .line 132
    :cond_5
    :goto_3
    return-void
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
.end method
