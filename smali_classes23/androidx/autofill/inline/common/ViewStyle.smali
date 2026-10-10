.class public Landroidx/autofill/inline/common/ViewStyle;
.super Landroidx/autofill/inline/common/BundledStyle;
.source "ViewStyle.java"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x1e
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/autofill/inline/common/ViewStyle$Builder;,
        Landroidx/autofill/inline/common/ViewStyle$BaseBuilder;
    }
.end annotation


# static fields
.field private static final KEY_BACKGROUND:Ljava/lang/String; = "background"

.field private static final KEY_BACKGROUND_COLOR:Ljava/lang/String; = "background_color"

.field private static final KEY_LAYOUT_MARGIN:Ljava/lang/String; = "layout_margin"

.field private static final KEY_PADDING:Ljava/lang/String; = "padding"

.field private static final KEY_VIEW_STYLE:Ljava/lang/String; = "view_style"


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/autofill/inline/common/BundledStyle;-><init>(Landroid/os/Bundle;)V

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
.end method


# virtual methods
.method public applyStyleOnViewIfValid(Landroid/view/View;)V
    .locals 9
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/autofill/inline/common/BundledStyle;->isValid()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 11
    .line 12
    const-string v1, "background"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Landroid/graphics/drawable/Icon;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Icon;->loadDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 44
    .line 45
    const-string v1, "background_color"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 49
    move-result v0

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 57
    move-result v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 61
    .line 62
    :cond_2
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 63
    .line 64
    .line 65
    const-string/jumbo v1, "padding"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 69
    move-result v0

    .line 70
    const/4 v2, 0x4

    .line 71
    const/4 v3, 0x3

    .line 72
    const/4 v4, 0x2

    .line 73
    const/4 v5, 0x1

    .line 74
    const/4 v6, 0x0

    .line 75
    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 82
    move-result-object v0

    .line 83
    .line 84
    if-eqz v0, :cond_4

    .line 85
    array-length v1, v0

    .line 86
    .line 87
    if-ne v1, v2, :cond_4

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 91
    move-result v1

    .line 92
    .line 93
    if-nez v1, :cond_3

    .line 94
    .line 95
    aget v1, v0, v6

    .line 96
    .line 97
    aget v7, v0, v5

    .line 98
    .line 99
    aget v8, v0, v4

    .line 100
    .line 101
    aget v0, v0, v3

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v1, v7, v8, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 105
    goto :goto_0

    .line 106
    .line 107
    :cond_3
    aget v1, v0, v4

    .line 108
    .line 109
    aget v7, v0, v5

    .line 110
    .line 111
    aget v8, v0, v6

    .line 112
    .line 113
    aget v0, v0, v3

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v1, v7, v8, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 117
    .line 118
    :cond_4
    :goto_0
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 119
    .line 120
    .line 121
    const-string/jumbo v1, "layout_margin"

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 125
    move-result v0

    .line 126
    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 133
    move-result-object v0

    .line 134
    .line 135
    if-eqz v0, :cond_8

    .line 136
    array-length v1, v0

    .line 137
    .line 138
    if-ne v1, v2, :cond_8

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    if-nez v1, :cond_5

    .line 145
    .line 146
    new-instance v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 147
    const/4 v2, -0x1

    .line 148
    .line 149
    .line 150
    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 151
    goto :goto_1

    .line 152
    .line 153
    :cond_5
    instance-of v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 154
    .line 155
    if-nez v2, :cond_6

    .line 156
    .line 157
    new-instance v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 158
    .line 159
    .line 160
    invoke-direct {v2, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 161
    move-object v1, v2

    .line 162
    .line 163
    :cond_6
    :goto_1
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 167
    move-result v2

    .line 168
    .line 169
    if-nez v2, :cond_7

    .line 170
    .line 171
    aget v2, v0, v6

    .line 172
    .line 173
    aget v5, v0, v5

    .line 174
    .line 175
    aget v4, v0, v4

    .line 176
    .line 177
    aget v0, v0, v3

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v2, v5, v4, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 181
    goto :goto_2

    .line 182
    .line 183
    :cond_7
    aget v2, v0, v4

    .line 184
    .line 185
    aget v4, v0, v5

    .line 186
    .line 187
    aget v5, v0, v6

    .line 188
    .line 189
    aget v0, v0, v3

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v2, v4, v5, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 193
    .line 194
    .line 195
    :goto_2
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 196
    :cond_8
    :goto_3
    return-void
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
.end method

.method public getStyleKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "view_style"

    .line 4
    return-object v0
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
.end method
