.class public final Lcom/sumsub/sns/internal/features/presentation/camera/G;
.super Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/camera/K;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/G;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;-><init>()V

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
.method public final onSlide(Landroid/view/View;F)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public final onStateChanged(Landroid/view/View;I)V
    .locals 5

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/G;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->j()Landroid/widget/TextView;

    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 13
    move-result-object p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p1, v0

    .line 16
    .line 17
    :goto_0
    if-eqz p1, :cond_7

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 21
    move-result p1

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 p1, 0x3

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    const/16 v2, 0xc

    .line 29
    const/4 v3, 0x4

    .line 30
    .line 31
    if-eq p2, p1, :cond_4

    .line 32
    .line 33
    if-eq p2, v3, :cond_2

    .line 34
    goto :goto_1

    .line 35
    .line 36
    :cond_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/G;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/Screen;->CameraScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 43
    .line 44
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/G;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    .line 48
    move-result-object v4

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p2, v4, v0, v2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/LinkedHashMap;I)V

    .line 52
    .line 53
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/G;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->i()Landroid/widget/TextView;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/G;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->j()Landroid/widget/TextView;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    if-eqz p1, :cond_7

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 74
    return-void

    .line 75
    .line 76
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/G;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/Screen;->CameraScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 83
    .line 84
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/G;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    .line 88
    move-result-object v4

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p2, v4, v0, v2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    .line 92
    .line 93
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/G;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->i()Landroid/widget/TextView;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/G;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->j()Landroid/widget/TextView;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    if-eqz p1, :cond_6

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 114
    .line 115
    :cond_6
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/k0;->getEventHandler()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    if-eqz p1, :cond_7

    .line 122
    .line 123
    sget-object p2, Lcom/sumsub/sns/core/data/listener/SNSEvent$ShowMoreGuidance;->INSTANCE:Lcom/sumsub/sns/core/data/listener/SNSEvent$ShowMoreGuidance;

    .line 124
    .line 125
    .line 126
    invoke-interface {p1, p2}, Lcom/sumsub/sns/core/data/listener/SNSEventHandler;->onEvent(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    .line 127
    :cond_7
    :goto_1
    return-void
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
