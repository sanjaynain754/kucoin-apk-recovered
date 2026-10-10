.class public abstract Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lcom/airbnb/lottie/LottieAnimationView;)V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_WEAK:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    sget v2, Lcom/sumsub/sns/R$color;->sns_contentWeak:I

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 12
    move-result v1

    .line 13
    .line 14
    sget-object v2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

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
    invoke-interface {v2}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 25
    move-result-object v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v2, v3

    .line 28
    .line 29
    :goto_0
    instance-of v4, v2, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object v2, v3

    .line 36
    .line 37
    :goto_1
    if-eqz v2, :cond_4

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    .line 48
    invoke-static {v4}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    .line 49
    move-result v4

    .line 50
    .line 51
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    .line 70
    goto :goto_2

    .line 71
    .line 72
    :cond_2
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    .line 73
    .line 74
    :cond_3
    :goto_2
    if-eqz v3, :cond_4

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 78
    move-result v1

    .line 79
    .line 80
    :cond_4
    const-string v0, "Chip area"

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v0, v1}, Lcom/sumsub/sns/internal/core/common/X;->a(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;I)V

    .line 84
    .line 85
    const-string v0, "Phone sensor"

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v0, v1}, Lcom/sumsub/sns/internal/core/common/X;->a(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;I)V

    .line 89
    return-void
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
.end method
