.class public final Lcom/sumsub/sns/internal/features/presentation/simplepicker/i;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic g:I


# instance fields
.field public final a:Lcom/sumsub/sns/databinding/D;

.field public final b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/databinding/D;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/databinding/D;->a:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/simplepicker/i;->a:Lcom/sumsub/sns/databinding/D;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/simplepicker/i;->b:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iget-object p1, p1, Lcom/sumsub/sns/databinding/D;->a:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 12
    .line 13
    sget-object p2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 17
    move-result-object p2

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-interface {p2}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 24
    move-result-object p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object p2, v0

    .line 27
    .line 28
    :goto_0
    instance-of v1, p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object p2, v0

    .line 35
    .line 36
    :goto_1
    if-eqz p2, :cond_5

    .line 37
    .line 38
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSColorElement;->LIST_SELECTED_ITEM_BACKGROUND:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    .line 50
    move-result v2

    .line 51
    .line 52
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    .line 53
    .line 54
    if-eqz p2, :cond_3

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    .line 65
    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    .line 71
    goto :goto_2

    .line 72
    .line 73
    :cond_2
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move-object p2, v0

    .line 76
    .line 77
    :goto_2
    if-eqz p2, :cond_5

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 81
    move-result p2

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    instance-of v1, p1, Landroid/graphics/drawable/RippleDrawable;

    .line 88
    .line 89
    if-eqz v1, :cond_4

    .line 90
    move-object v0, p1

    .line 91
    .line 92
    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    .line 93
    .line 94
    :cond_4
    if-eqz v0, :cond_5

    .line 95
    .line 96
    .line 97
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 102
    :cond_5
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/simplepicker/i;Lcom/sumsub/sns/internal/features/presentation/simplepicker/h;Landroid/view/View;)V
    .locals 0

    .line 5
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/simplepicker/i;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/simplepicker/h;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/simplepicker/i;->a:Lcom/sumsub/sns/databinding/D;

    iget-object v0, v0, Lcom/sumsub/sns/databinding/D;->b:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 2
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/simplepicker/h;->b:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/simplepicker/l;

    invoke-direct {v1, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/simplepicker/l;-><init>(Lcom/sumsub/sns/internal/features/presentation/simplepicker/i;Lcom/sumsub/sns/internal/features/presentation/simplepicker/h;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
