.class public final Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/g;
.super Lcom/sumsub/sns/core/presentation/base/adapter/c;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic g:I


# instance fields
.field public final a:Lcom/sumsub/sns/databinding/G;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/presentation/base/adapter/c;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    sget v0, Lcom/sumsub/sns/R$id;->sns_icon:I

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    check-cast v1, Landroid/widget/ImageView;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget v0, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    new-instance v0, Lcom/sumsub/sns/databinding/G;

    .line 26
    .line 27
    check-cast p1, Landroid/widget/LinearLayout;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p1, v1, v2}, Lcom/sumsub/sns/databinding/G;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;)V

    .line 31
    .line 32
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/g;->a:Lcom/sumsub/sns/databinding/G;

    .line 33
    return-void

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    new-instance v0, Ljava/lang/NullPointerException;

    .line 44
    .line 45
    const-string v1, "Missing required view with ID: "

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    throw v0
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


# virtual methods
.method public final a(Ljava/lang/Object;I)V
    .locals 4

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;

    .line 3
    .line 4
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/o;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/o;

    .line 10
    .line 11
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/o;->a:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p2, :cond_5

    .line 14
    .line 15
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/g;->a:Lcom/sumsub/sns/databinding/G;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/sumsub/sns/databinding/G;->b:Landroid/widget/ImageView;

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    sget-object v2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-interface {v3, v1, p2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 40
    move-result-object p2

    .line 41
    const/4 v0, 0x0

    .line 42
    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-interface {p2}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 47
    move-result-object p2

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object p2, v0

    .line 50
    .line 51
    :goto_0
    instance-of v1, p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object p2, v0

    .line 58
    .line 59
    :goto_1
    if-eqz p2, :cond_5

    .line 60
    .line 61
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_WEAK:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 62
    .line 63
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    .line 74
    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    .line 75
    move-result v2

    .line 76
    .line 77
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    .line 78
    .line 79
    if-eqz p2, :cond_4

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    move-result-object p2

    .line 88
    .line 89
    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    .line 90
    .line 91
    if-eqz p2, :cond_4

    .line 92
    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    .line 96
    goto :goto_2

    .line 97
    .line 98
    :cond_3
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    .line 99
    .line 100
    :cond_4
    :goto_2
    if-eqz v0, :cond_5

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 104
    move-result p2

    .line 105
    .line 106
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/g;->a:Lcom/sumsub/sns/databinding/G;

    .line 107
    .line 108
    iget-object v0, v0, Lcom/sumsub/sns/databinding/G;->b:Landroid/widget/ImageView;

    .line 109
    .line 110
    .line 111
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 112
    move-result-object p2

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 116
    .line 117
    :cond_5
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/g;->a:Lcom/sumsub/sns/databinding/G;

    .line 118
    .line 119
    iget-object p2, p2, Lcom/sumsub/sns/databinding/G;->c:Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;

    .line 120
    .line 121
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/o;->b:Ljava/lang/CharSequence;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    return-void
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
