.class public Lai/advance/sdk/global/iqa/lib/GlobalIQAView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lai/advance/sdk/global/iqa/lib/GlobalIQAView$c;
    }
.end annotation


# instance fields
.field public final b:Lai/advance/sdk/global/iqa/lib/g;

.field public final c:Landroid/widget/ImageView;

.field public final d:Ls/x;

.field public e:Ljava/lang/String;

.field public f:Lai/advance/sdk/global/iqa/lib/GlobalIQAView$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    new-instance p2, Lai/advance/sdk/global/iqa/lib/g;

    .line 6
    .line 7
    .line 8
    invoke-direct {p2, p1}, Lai/advance/sdk/global/iqa/lib/g;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    iput-object p2, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b:Lai/advance/sdk/global/iqa/lib/g;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 14
    const/4 p2, 0x4

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    new-instance p2, Landroid/widget/ImageView;

    .line 20
    .line 21
    .line 22
    invoke-direct {p2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    iput-object p2, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->c:Landroid/widget/ImageView;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lk/j;->c()Ljava/lang/String;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->e:Ljava/lang/String;

    .line 34
    .line 35
    new-instance p1, Ls/x;

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, p0}, Ls/x;-><init>(Lai/advance/sdk/global/iqa/lib/GlobalIQAView;)V

    .line 39
    .line 40
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 41
    .line 42
    new-instance p1, Lai/advance/sdk/global/iqa/lib/GlobalIQAView$a;

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView$a;-><init>(Lai/advance/sdk/global/iqa/lib/GlobalIQAView;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    return-void
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
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public static synthetic a(Lai/advance/sdk/global/iqa/lib/GlobalIQAView;)Ls/x;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 3
    return-object p0
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
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    return-void
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

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "GlobalIQAView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0, p2}, Ls/v0;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public d()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ls/x;->r()V

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
.end method

.method public e()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ls/x;->M()V

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
.end method

.method public f()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ls/x;->S()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public g()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ls/x;->U()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getPageId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->e:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public h()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ls/x;->V()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public i()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "notUsePhoto"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ls/x;->Z()V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public j(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ls/x;->d0(Z)V

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
.end method

.method public k()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onFinish"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b(Ljava/lang/String;)V

    .line 7
    return-void
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

.method public l()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onPause"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b(Ljava/lang/String;)V

    .line 7
    return-void
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

.method public m()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onRestart"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ls/x;->e0()V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public n()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onResume"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b(Ljava/lang/String;)V

    .line 7
    return-void
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

.method public o()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onSaveBundle"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b(Ljava/lang/String;)V

    .line 7
    return-void
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

.method public onLayout(ZIIII)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 4
    move-object p1, p0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    :goto_0
    if-ge v1, v0, :cond_2

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    instance-of v3, v2, Lai/advance/sdk/global/iqa/lib/g;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    move-object v3, v2

    .line 21
    .line 22
    check-cast v3, Lai/advance/sdk/global/iqa/lib/g;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->e()D

    .line 26
    move-result-wide v4

    .line 27
    .line 28
    sub-int v6, p4, p2

    .line 29
    int-to-double v6, v6

    .line 30
    mul-double/2addr v4, v6

    .line 31
    double-to-int v4, v4

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->f()D

    .line 35
    move-result-wide v5

    .line 36
    .line 37
    sub-int v7, p5, p3

    .line 38
    int-to-double v7, v7

    .line 39
    mul-double/2addr v5, v7

    .line 40
    double-to-int v5, v5

    .line 41
    neg-int v6, v4

    .line 42
    neg-int v7, v5

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 46
    move-result v8

    .line 47
    add-int/2addr v8, v4

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 51
    move-result v4

    .line 52
    add-int/2addr v4, v5

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v6, v7, v8, v4}, Landroid/view/View;->layout(IIII)V

    .line 56
    .line 57
    :cond_0
    instance-of v3, v2, Landroid/widget/ImageView;

    .line 58
    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    check-cast v2, Landroid/widget/ImageView;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->e()D

    .line 65
    move-result-wide v3

    .line 66
    .line 67
    sub-int v5, p4, p2

    .line 68
    int-to-double v5, v5

    .line 69
    mul-double/2addr v3, v5

    .line 70
    double-to-int v3, v3

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->f()D

    .line 74
    move-result-wide v4

    .line 75
    .line 76
    sub-int v6, p5, p3

    .line 77
    int-to-double v6, v6

    .line 78
    mul-double/2addr v4, v6

    .line 79
    double-to-int v4, v4

    .line 80
    neg-int v5, v3

    .line 81
    neg-int v6, v4

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 85
    move-result v7

    .line 86
    add-int/2addr v7, v3

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 90
    move-result v3

    .line 91
    add-int/2addr v3, v4

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v5, v6, v7, v3}, Landroid/view/View;->layout(IIII)V

    .line 95
    .line 96
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
.end method

.method public onMeasure(II)V
    .locals 16

    .line 1
    .line 2
    .line 3
    invoke-super/range {p0 .. p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    :goto_0
    move-object/from16 v2, p0

    .line 11
    .line 12
    if-ge v1, v0, :cond_2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    instance-of v4, v3, Lai/advance/sdk/global/iqa/lib/g;

    .line 19
    .line 20
    const/high16 v5, 0x40000000    # 2.0f

    .line 21
    .line 22
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 23
    .line 24
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    move-object v4, v3

    .line 28
    .line 29
    check-cast v4, Lai/advance/sdk/global/iqa/lib/g;

    .line 30
    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 33
    move-result v10

    .line 34
    .line 35
    .line 36
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 37
    move-result v11

    .line 38
    int-to-double v12, v10

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->e()D

    .line 42
    move-result-wide v14

    .line 43
    mul-double/2addr v14, v8

    .line 44
    add-double/2addr v14, v6

    .line 45
    mul-double/2addr v12, v14

    .line 46
    double-to-int v10, v12

    .line 47
    .line 48
    .line 49
    invoke-static {v10, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 50
    move-result v10

    .line 51
    int-to-double v11, v11

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->f()D

    .line 55
    move-result-wide v13

    .line 56
    mul-double/2addr v13, v8

    .line 57
    add-double/2addr v13, v6

    .line 58
    mul-double/2addr v11, v13

    .line 59
    double-to-int v11, v11

    .line 60
    .line 61
    .line 62
    invoke-static {v11, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 63
    move-result v11

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v10, v11}, Landroid/view/View;->measure(II)V

    .line 67
    .line 68
    :cond_0
    instance-of v4, v3, Landroid/widget/ImageView;

    .line 69
    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    check-cast v3, Landroid/widget/ImageView;

    .line 73
    .line 74
    .line 75
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 76
    move-result v4

    .line 77
    .line 78
    .line 79
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 80
    move-result v10

    .line 81
    int-to-double v11, v4

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->e()D

    .line 85
    move-result-wide v13

    .line 86
    mul-double/2addr v13, v8

    .line 87
    add-double/2addr v13, v6

    .line 88
    mul-double/2addr v11, v13

    .line 89
    double-to-int v4, v11

    .line 90
    .line 91
    .line 92
    invoke-static {v4, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 93
    move-result v4

    .line 94
    int-to-double v10, v10

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->f()D

    .line 98
    move-result-wide v12

    .line 99
    mul-double/2addr v12, v8

    .line 100
    add-double/2addr v12, v6

    .line 101
    mul-double/2addr v10, v12

    .line 102
    double-to-int v6, v10

    .line 103
    .line 104
    .line 105
    invoke-static {v6, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 106
    move-result v5

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v4, v5}, Landroid/view/View;->measure(II)V

    .line 110
    .line 111
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 112
    goto :goto_0

    .line 113
    :cond_2
    return-void
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
.end method

.method public onSizeChanged(IIII)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 4
    .line 5
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->f:Lai/advance/sdk/global/iqa/lib/GlobalIQAView$c;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3, p4}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView$c;->onSizeChanged(IIII)V

    .line 11
    :cond_0
    return-void
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
.end method

.method public declared-synchronized p(Ls/e;Lu/d;)Ljava/lang/String;
    .locals 1
    .param p1    # Ls/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lu/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 6
    .line 7
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p1, Ls/e;->d:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    const-string/jumbo v0, "startDetectionWithPhotoCapture"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b(Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, Ls/x;->o(Ls/e;Lu/d;)Ljava/lang/String;

    .line 21
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    monitor-exit p0

    .line 23
    return-object p1

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p1
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
.end method

.method public declared-synchronized q(Ls/d;Lu/e;)Ljava/lang/String;
    .locals 2
    .param p1    # Ls/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lu/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 6
    .line 7
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p1, Ls/d;->d:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    const-string/jumbo v0, "startDetectionWithScan"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b(Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 18
    .line 19
    new-instance v1, Lai/advance/sdk/global/iqa/lib/GlobalIQAView$b;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p0, p2}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView$b;-><init>(Lai/advance/sdk/global/iqa/lib/GlobalIQAView;Lu/e;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, v1}, Ls/x;->n(Ls/d;Lu/c;)Ljava/lang/String;

    .line 26
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    monitor-exit p0

    .line 28
    return-object p1

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p1
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
.end method

.method public r(Lu/f;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "takePhoto"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ls/x;->z(Lu/f;)V

    .line 12
    return-void
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

.method public declared-synchronized s()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ls/x;->c0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw v0
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

.method public setOnSizeChangedListener(Lai/advance/sdk/global/iqa/lib/GlobalIQAView$c;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->f:Lai/advance/sdk/global/iqa/lib/GlobalIQAView$c;

    .line 3
    return-void
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
.end method

.method public setPageId(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->e:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public setVoiceRawId(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ls/x;->g0(I)V

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
.end method

.method public t()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ls/x;->h0()V

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
.end method

.method public u(Lu/g;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "usePhoto"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->b(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d:Ls/x;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ls/x;->A(Lu/g;)V

    .line 12
    return-void
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
