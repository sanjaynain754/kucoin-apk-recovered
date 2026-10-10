.class public final Lcom/kubi/margin/view/MarginRiskView;
.super Landroid/widget/LinearLayout;
.source "MarginRiskView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/margin/view/MarginRiskView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u0011\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0008J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0003R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/kubi/margin/view/MarginRiskView;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "(Landroid/content/Context;)V",
        "bmarginViewLeverRiskBinding",
        "Lcom/kubi/margin/databinding/BmarginViewLeverRiskBinding;",
        "riskGradeArray",
        "",
        "",
        "setRisk",
        "",
        "riskData",
        "Lcom/kubi/margin/view/MarginRiskView$IRiskData;",
        "showDashboard",
        "",
        "showTipsDialog",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "IRiskData",
        "MarginLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public b:Ldp/w0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, v0}, Lcom/kubi/margin/view/MarginRiskView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-wide v0, 0x3fe3333333333333L    # 0.6

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    const-wide v0, 0x3feccccccccccccdL    # 0.9

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    filled-new-array {p2, v0}, [Ljava/lang/Double;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p2

    iput-object p2, p0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    const/4 p2, 0x0

    .line 3
    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/kubi/margin/R$layout;->bmargin_view_lever_risk:I

    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 5
    sget p1, Lcom/kubi/margin/R$id;->root_view:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Ldp/w0;->a(Landroid/view/View;)Ldp/w0;

    move-result-object p1

    const-string p2, "bind(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    return-void
.end method

.method public static synthetic a(Lcom/kubi/margin/view/MarginRiskView$a;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/margin/view/MarginRiskView;->j(Lcom/kubi/margin/view/MarginRiskView$a;Landroid/content/DialogInterface;I)V

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
.end method

.method public static synthetic b(Lcom/kubi/margin/view/MarginRiskView;Lcom/kubi/margin/view/MarginRiskView$a;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/view/MarginRiskView;->f(Lcom/kubi/margin/view/MarginRiskView;Lcom/kubi/margin/view/MarginRiskView$a;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic c()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/margin/view/MarginRiskView;->h()Lkotlin/Unit;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic d(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/view/MarginRiskView;->i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

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
.end method

.method public static final f(Lcom/kubi/margin/view/MarginRiskView;Lcom/kubi/margin/view/MarginRiskView$a;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lcom/kubi/margin/view/MarginRiskView$a;->H()Landroidx/fragment/app/Fragment;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/kubi/margin/view/MarginRiskView;->g(Landroidx/fragment/app/Fragment;Lcom/kubi/margin/view/MarginRiskView$a;)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final h()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static final i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "viewHolder"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "dialogFragmentHelper"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget p1, Lcom/kubi/margin/R$id;->tv_content:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    check-cast p0, Landroid/widget/TextView;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    sget-object p1, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 23
    .line 24
    sget-object v0, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 25
    .line 26
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    .line 27
    .line 28
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 29
    .line 30
    sget v3, Lcom/kubi/margin/R$color;->c_text:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lcom/kubi/utils/c;->a(I)I

    .line 34
    move-result v2

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0, v0, v1}, Lcom/kubi/resources/HighlightTextHelper;->a(Landroid/widget/TextView;Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;Landroid/text/style/CharacterStyle;)V

    .line 41
    :cond_0
    return-void
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
.end method

.method public static final j(Lcom/kubi/margin/view/MarginRiskView$a;Landroid/content/DialogInterface;I)V
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/TransferJumper;->a:Lcom/kubi/data/coin/TransferJumper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lcom/kubi/margin/view/MarginRiskView$a;->b()Z

    .line 6
    move-result p1

    .line 7
    const/4 p2, 0x0

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Lcom/kubi/margin/view/MarginRiskView$a;->e()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, p2

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    :goto_1
    move-object v1, p1

    .line 27
    goto :goto_2

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-interface {p0}, Lcom/kubi/margin/view/MarginRiskView$a;->a()Ljava/lang/String;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    goto :goto_1

    .line 37
    .line 38
    .line 39
    :goto_2
    invoke-interface {p0}, Lcom/kubi/margin/view/MarginRiskView$a;->e()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getSymbol()Ljava/lang/String;

    .line 46
    move-result-object p2

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-static {p2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    .line 53
    invoke-interface {p0}, Lcom/kubi/margin/view/MarginRiskView$a;->b()Z

    .line 54
    move-result p0

    .line 55
    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    const-string p0, "ISOLATED"

    .line 59
    :goto_3
    move-object v5, p0

    .line 60
    goto :goto_4

    .line 61
    .line 62
    :cond_3
    const-string p0, "MARGIN"

    .line 63
    goto :goto_3

    .line 64
    .line 65
    :goto_4
    const/16 v8, 0x62

    .line 66
    const/4 v9, 0x0

    .line 67
    const/4 v2, 0x0

    .line 68
    .line 69
    const-string v4, "TRADE"

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    .line 73
    .line 74
    invoke-static/range {v0 .. v9}, Lcom/kubi/data/coin/TransferJumper$Companion;->jumpToTransfer$default(Lcom/kubi/data/coin/TransferJumper$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

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
.end method


# virtual methods
.method public final e(Lcom/kubi/margin/view/MarginRiskView$a;Z)V
    .locals 25
    .param p1    # Lcom/kubi/margin/view/MarginRiskView$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KCCyclomaticComplexityCheck"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "riskData"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    sget-object v3, Lcom/kubi/margin/entity/LeverBean;->a:Lcom/kubi/margin/entity/LeverBean$Companion;

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Lcom/kubi/margin/view/MarginRiskView$a;->c()Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v2}, Lcom/kubi/margin/entity/LeverBean$Companion;->getRiskGradeByString(Ljava/lang/String;)Ljava/util/List;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide v4, 0x3fe3333333333333L    # 0.6

    .line 36
    .line 37
    .line 38
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const-wide v4, 0x3feccccccccccccdL    # 0.9

    .line 48
    .line 49
    .line 50
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 51
    move-result-object v4

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    :cond_0
    iput-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    .line 57
    .line 58
    iget-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 59
    .line 60
    iget-object v2, v2, Ldp/w0;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 64
    move-result-object v10

    .line 65
    .line 66
    .line 67
    invoke-interface {v1}, Lcom/kubi/margin/view/MarginRiskView$a;->value()D

    .line 68
    move-result-wide v4

    .line 69
    .line 70
    iget-object v6, v0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    .line 71
    const/4 v11, 0x0

    .line 72
    .line 73
    .line 74
    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    move-result-object v6

    .line 76
    .line 77
    check-cast v6, Ljava/lang/Number;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    .line 81
    move-result-wide v6

    .line 82
    .line 83
    iget-object v8, v0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    .line 84
    const/4 v12, 0x1

    .line 85
    .line 86
    .line 87
    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    move-result-object v8

    .line 89
    .line 90
    check-cast v8, Ljava/lang/Number;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/lang/Number;->doubleValue()D

    .line 94
    move-result-wide v8

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v3 .. v9}, Lcom/kubi/margin/entity/LeverBean$Companion;->getColorByRate(DDD)I

    .line 98
    move-result v4

    .line 99
    .line 100
    .line 101
    invoke-virtual {v10, v4}, Landroid/content/res/Resources;->getColor(I)I

    .line 102
    move-result v4

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 106
    .line 107
    new-instance v13, Ljava/math/BigDecimal;

    .line 108
    .line 109
    .line 110
    invoke-interface {v1}, Lcom/kubi/margin/view/MarginRiskView$a;->value()D

    .line 111
    move-result-wide v4

    .line 112
    .line 113
    .line 114
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 115
    move-result-object v2

    .line 116
    .line 117
    .line 118
    invoke-direct {v13, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    const/16 v20, 0x2f

    .line 121
    .line 122
    const/16 v21, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    .line 126
    const/16 v16, 0x0

    .line 127
    .line 128
    const/16 v17, 0x0

    .line 129
    .line 130
    const/16 v18, 0x1

    .line 131
    .line 132
    const/16 v19, 0x0

    .line 133
    .line 134
    .line 135
    invoke-static/range {v13 .. v21}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    iget-object v4, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 139
    .line 140
    iget-object v4, v4, Ldp/w0;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 141
    .line 142
    .line 143
    invoke-interface {v1}, Lcom/kubi/margin/view/MarginRiskView$a;->status()Ljava/lang/String;

    .line 144
    move-result-object v5

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 148
    move-result v6

    .line 149
    const/4 v7, 0x0

    .line 150
    .line 151
    const-string v10, "LIABILITY"

    .line 152
    .line 153
    const-string v8, "IN_LIQUIDATION"

    .line 154
    .line 155
    const-string v9, "FROZEN_FL"

    .line 156
    .line 157
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 158
    .line 159
    const-string v13, "IN_AUTO_RENEW"

    .line 160
    .line 161
    const-string v14, "FROZEN_RENEW"

    .line 162
    .line 163
    const-wide/16 v19, 0x0

    .line 164
    .line 165
    const-string v15, "BANKRUPTCY"

    .line 166
    .line 167
    .line 168
    sparse-switch v6, :sswitch_data_0

    .line 169
    goto :goto_0

    .line 170
    .line 171
    .line 172
    :sswitch_0
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    move-result v5

    .line 174
    .line 175
    if-nez v5, :cond_2

    .line 176
    goto :goto_0

    .line 177
    .line 178
    .line 179
    :sswitch_1
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    move-result v5

    .line 181
    .line 182
    if-nez v5, :cond_2

    .line 183
    goto :goto_0

    .line 184
    .line 185
    .line 186
    :sswitch_2
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    move-result v5

    .line 188
    .line 189
    if-eqz v5, :cond_1

    .line 190
    goto :goto_1

    .line 191
    .line 192
    .line 193
    :sswitch_3
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    move-result v5

    .line 195
    .line 196
    if-nez v5, :cond_2

    .line 197
    goto :goto_0

    .line 198
    .line 199
    .line 200
    :sswitch_4
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    move-result v5

    .line 202
    .line 203
    if-nez v5, :cond_2

    .line 204
    goto :goto_0

    .line 205
    .line 206
    .line 207
    :sswitch_5
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    move-result v5

    .line 209
    .line 210
    if-nez v5, :cond_2

    .line 211
    .line 212
    .line 213
    :cond_1
    :goto_0
    invoke-interface {v1}, Lcom/kubi/margin/view/MarginRiskView$a;->value()D

    .line 214
    move-result-wide v5

    .line 215
    .line 216
    cmpg-double v16, v19, v5

    .line 217
    .line 218
    if-gtz v16, :cond_2

    .line 219
    .line 220
    cmpg-double v5, v5, v17

    .line 221
    .line 222
    if-gtz v5, :cond_2

    .line 223
    goto :goto_2

    .line 224
    :cond_2
    :goto_1
    move-object v2, v7

    .line 225
    .line 226
    .line 227
    :goto_2
    invoke-static {v2}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    move-result-object v2

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    .line 233
    iget-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 234
    .line 235
    iget-object v2, v2, Ldp/w0;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 236
    .line 237
    .line 238
    invoke-interface {v1}, Lcom/kubi/margin/view/MarginRiskView$a;->value()D

    .line 239
    move-result-wide v4

    .line 240
    .line 241
    const-wide/high16 v6, -0x4000000000000000L    # -2.0

    .line 242
    .line 243
    cmpg-double v4, v4, v6

    .line 244
    .line 245
    if-nez v4, :cond_3

    .line 246
    .line 247
    const/16 v4, 0x8

    .line 248
    goto :goto_3

    .line 249
    :cond_3
    move v4, v11

    .line 250
    .line 251
    .line 252
    :goto_3
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 253
    .line 254
    iget-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 255
    .line 256
    iget-object v2, v2, Ldp/w0;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 260
    move-result-object v4

    .line 261
    move-object v6, v4

    .line 262
    .line 263
    .line 264
    invoke-interface {v1}, Lcom/kubi/margin/view/MarginRiskView$a;->value()D

    .line 265
    move-result-wide v4

    .line 266
    .line 267
    iget-object v7, v0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    .line 268
    .line 269
    .line 270
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    move-result-object v7

    .line 272
    .line 273
    check-cast v7, Ljava/lang/Number;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    .line 277
    move-result-wide v21

    .line 278
    .line 279
    iget-object v7, v0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    .line 280
    .line 281
    .line 282
    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 283
    move-result-object v7

    .line 284
    .line 285
    check-cast v7, Ljava/lang/Number;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    .line 289
    move-result-wide v23

    .line 290
    move-object v1, v6

    .line 291
    move-object v12, v8

    .line 292
    move-object v11, v9

    .line 293
    .line 294
    move-wide/from16 v6, v21

    .line 295
    .line 296
    move-wide/from16 v8, v23

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v3 .. v9}, Lcom/kubi/margin/entity/LeverBean$Companion;->getColorByRate(DDD)I

    .line 300
    move-result v4

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    .line 304
    move-result v1

    .line 305
    .line 306
    const/high16 v4, 0x40800000    # 4.0f

    .line 307
    .line 308
    .line 309
    invoke-static {v1, v4}, Lcom/kubi/resources/g;->l(IF)Landroid/graphics/drawable/GradientDrawable;

    .line 310
    move-result-object v1

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 314
    .line 315
    iget-object v1, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 316
    .line 317
    iget-object v1, v1, Ldp/w0;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 318
    .line 319
    .line 320
    invoke-interface/range {p1 .. p1}, Lcom/kubi/margin/view/MarginRiskView$a;->status()Ljava/lang/String;

    .line 321
    move-result-object v2

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 325
    move-result v5

    .line 326
    .line 327
    .line 328
    sparse-switch v5, :sswitch_data_1

    .line 329
    .line 330
    goto/16 :goto_4

    .line 331
    .line 332
    .line 333
    :sswitch_6
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 334
    move-result v2

    .line 335
    .line 336
    if-nez v2, :cond_6

    .line 337
    .line 338
    goto/16 :goto_4

    .line 339
    .line 340
    .line 341
    :sswitch_7
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    move-result v2

    .line 343
    .line 344
    if-nez v2, :cond_4

    .line 345
    .line 346
    goto/16 :goto_4

    .line 347
    .line 348
    .line 349
    :sswitch_8
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 350
    move-result v2

    .line 351
    .line 352
    if-nez v2, :cond_4

    .line 353
    .line 354
    goto/16 :goto_4

    .line 355
    .line 356
    :cond_4
    iget-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 357
    .line 358
    iget-object v2, v2, Ldp/w0;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 362
    move-result-object v3

    .line 363
    .line 364
    sget v5, Lcom/kubi/margin/R$color;->secondary:I

    .line 365
    .line 366
    .line 367
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    .line 368
    move-result v3

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 372
    .line 373
    iget-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 374
    .line 375
    iget-object v2, v2, Ldp/w0;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 379
    move-result-object v3

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    .line 383
    move-result v3

    .line 384
    .line 385
    .line 386
    invoke-static {v3, v4}, Lcom/kubi/resources/g;->l(IF)Landroid/graphics/drawable/GradientDrawable;

    .line 387
    move-result-object v3

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 394
    move-result-object v2

    .line 395
    .line 396
    sget v3, Lcom/kubi/margin/R$string;->margin_renew:I

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 400
    move-result-object v2

    .line 401
    .line 402
    goto/16 :goto_5

    .line 403
    .line 404
    .line 405
    :sswitch_9
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 406
    move-result v2

    .line 407
    .line 408
    if-nez v2, :cond_5

    .line 409
    goto :goto_4

    .line 410
    .line 411
    .line 412
    :sswitch_a
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 413
    move-result v2

    .line 414
    .line 415
    if-nez v2, :cond_5

    .line 416
    goto :goto_4

    .line 417
    .line 418
    :cond_5
    iget-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 419
    .line 420
    iget-object v2, v2, Ldp/w0;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 424
    move-result-object v3

    .line 425
    .line 426
    sget v5, Lcom/kubi/margin/R$color;->secondary:I

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    .line 430
    move-result v3

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 434
    .line 435
    iget-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 436
    .line 437
    iget-object v2, v2, Ldp/w0;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 441
    move-result-object v3

    .line 442
    .line 443
    .line 444
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    .line 445
    move-result v3

    .line 446
    .line 447
    .line 448
    invoke-static {v3, v4}, Lcom/kubi/resources/g;->l(IF)Landroid/graphics/drawable/GradientDrawable;

    .line 449
    move-result-object v3

    .line 450
    .line 451
    .line 452
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 456
    move-result-object v2

    .line 457
    .line 458
    sget v3, Lcom/kubi/margin/R$string;->margin_liq_ing:I

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 462
    move-result-object v2

    .line 463
    goto :goto_5

    .line 464
    .line 465
    .line 466
    :sswitch_b
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 467
    move-result v2

    .line 468
    .line 469
    if-nez v2, :cond_6

    .line 470
    .line 471
    .line 472
    :goto_4
    invoke-interface/range {p1 .. p1}, Lcom/kubi/margin/view/MarginRiskView$a;->value()D

    .line 473
    move-result-wide v4

    .line 474
    .line 475
    iget-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    .line 476
    const/4 v6, 0x0

    .line 477
    .line 478
    .line 479
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 480
    move-result-object v2

    .line 481
    .line 482
    check-cast v2, Ljava/lang/Number;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 486
    move-result-wide v6

    .line 487
    .line 488
    iget-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    .line 489
    const/4 v8, 0x1

    .line 490
    .line 491
    .line 492
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 493
    move-result-object v2

    .line 494
    .line 495
    check-cast v2, Ljava/lang/Number;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 499
    move-result-wide v8

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v3 .. v9}, Lcom/kubi/margin/entity/LeverBean$Companion;->getTextByRate(DDD)Ljava/lang/String;

    .line 503
    move-result-object v2

    .line 504
    goto :goto_5

    .line 505
    .line 506
    :cond_6
    iget-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 507
    .line 508
    iget-object v2, v2, Ldp/w0;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 512
    move-result-object v3

    .line 513
    .line 514
    sget v5, Lcom/kubi/margin/R$color;->secondary:I

    .line 515
    .line 516
    .line 517
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    .line 518
    move-result v3

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 522
    .line 523
    iget-object v2, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 524
    .line 525
    iget-object v2, v2, Ldp/w0;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 529
    move-result-object v3

    .line 530
    .line 531
    .line 532
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    .line 533
    move-result v3

    .line 534
    .line 535
    .line 536
    invoke-static {v3, v4}, Lcom/kubi/resources/g;->l(IF)Landroid/graphics/drawable/GradientDrawable;

    .line 537
    move-result-object v3

    .line 538
    .line 539
    .line 540
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 544
    move-result-object v2

    .line 545
    .line 546
    sget v3, Lcom/kubi/margin/R$string;->liability:I

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 550
    move-result-object v2

    .line 551
    .line 552
    .line 553
    :goto_5
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 554
    .line 555
    iget-object v1, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 556
    .line 557
    iget-object v1, v1, Ldp/w0;->b:Lcom/kubi/margin/view/DashBoardView;

    .line 558
    .line 559
    const-string v2, "dashboard"

    .line 560
    .line 561
    .line 562
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 563
    const/4 v6, 0x0

    .line 564
    .line 565
    .line 566
    invoke-static {v1, v6}, Lf30/a;->d(Landroid/view/View;Z)V

    .line 567
    .line 568
    iget-object v1, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 569
    .line 570
    iget-object v1, v1, Ldp/w0;->b:Lcom/kubi/margin/view/DashBoardView;

    .line 571
    .line 572
    new-instance v2, Lkotlin/Triple;

    .line 573
    .line 574
    .line 575
    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 576
    move-result-object v3

    .line 577
    .line 578
    iget-object v4, v0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    .line 579
    .line 580
    .line 581
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 582
    move-result-object v4

    .line 583
    .line 584
    sget v5, Lcom/kubi/margin/R$color;->primary:I

    .line 585
    .line 586
    .line 587
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 588
    move-result-object v5

    .line 589
    .line 590
    .line 591
    invoke-direct {v2, v3, v4, v5}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 592
    .line 593
    new-instance v3, Lkotlin/Triple;

    .line 594
    .line 595
    iget-object v4, v0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    .line 596
    .line 597
    .line 598
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 599
    move-result-object v4

    .line 600
    .line 601
    iget-object v5, v0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    .line 602
    const/4 v8, 0x1

    .line 603
    .line 604
    .line 605
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 606
    move-result-object v5

    .line 607
    .line 608
    sget v6, Lcom/kubi/margin/R$color;->complementary:I

    .line 609
    .line 610
    .line 611
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 612
    move-result-object v6

    .line 613
    .line 614
    .line 615
    invoke-direct {v3, v4, v5, v6}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 616
    .line 617
    new-instance v4, Lkotlin/Triple;

    .line 618
    .line 619
    iget-object v5, v0, Lcom/kubi/margin/view/MarginRiskView;->c:Ljava/util/List;

    .line 620
    .line 621
    .line 622
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 623
    move-result-object v5

    .line 624
    .line 625
    .line 626
    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 627
    move-result-object v6

    .line 628
    .line 629
    sget v7, Lcom/kubi/margin/R$color;->secondary:I

    .line 630
    .line 631
    .line 632
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 633
    move-result-object v7

    .line 634
    .line 635
    .line 636
    invoke-direct {v4, v5, v6, v7}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    filled-new-array {v2, v3, v4}, [Lkotlin/Triple;

    .line 640
    move-result-object v2

    .line 641
    .line 642
    .line 643
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 644
    move-result-object v2

    .line 645
    .line 646
    .line 647
    invoke-virtual {v1, v2}, Lcom/kubi/margin/view/DashBoardView;->setData(Ljava/util/List;)V

    .line 648
    .line 649
    iget-object v1, v0, Lcom/kubi/margin/view/MarginRiskView;->b:Ldp/w0;

    .line 650
    .line 651
    iget-object v2, v1, Ldp/w0;->b:Lcom/kubi/margin/view/DashBoardView;

    .line 652
    .line 653
    .line 654
    invoke-interface/range {p1 .. p1}, Lcom/kubi/margin/view/MarginRiskView$a;->status()Ljava/lang/String;

    .line 655
    move-result-object v1

    .line 656
    .line 657
    .line 658
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 659
    move-result v3

    .line 660
    .line 661
    .line 662
    sparse-switch v3, :sswitch_data_2

    .line 663
    goto :goto_6

    .line 664
    .line 665
    .line 666
    :sswitch_c
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 667
    move-result v1

    .line 668
    .line 669
    if-nez v1, :cond_8

    .line 670
    goto :goto_6

    .line 671
    .line 672
    .line 673
    :sswitch_d
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 674
    move-result v1

    .line 675
    .line 676
    if-nez v1, :cond_7

    .line 677
    goto :goto_6

    .line 678
    .line 679
    .line 680
    :sswitch_e
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 681
    move-result v1

    .line 682
    .line 683
    if-nez v1, :cond_7

    .line 684
    goto :goto_6

    .line 685
    .line 686
    :cond_7
    move-wide/from16 v3, v19

    .line 687
    goto :goto_7

    .line 688
    .line 689
    .line 690
    :sswitch_f
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 691
    move-result v1

    .line 692
    .line 693
    if-nez v1, :cond_8

    .line 694
    goto :goto_6

    .line 695
    .line 696
    .line 697
    :sswitch_10
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 698
    move-result v1

    .line 699
    .line 700
    if-nez v1, :cond_8

    .line 701
    goto :goto_6

    .line 702
    .line 703
    .line 704
    :sswitch_11
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 705
    move-result v1

    .line 706
    .line 707
    if-nez v1, :cond_8

    .line 708
    .line 709
    .line 710
    :goto_6
    invoke-interface/range {p1 .. p1}, Lcom/kubi/margin/view/MarginRiskView$a;->value()D

    .line 711
    move-result-wide v3

    .line 712
    .line 713
    .line 714
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 715
    move-result-object v1

    .line 716
    .line 717
    .line 718
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 719
    move-result-wide v13

    .line 720
    move-wide v3, v13

    .line 721
    goto :goto_7

    .line 722
    .line 723
    :cond_8
    move-wide/from16 v3, v17

    .line 724
    :goto_7
    const/4 v6, 0x2

    .line 725
    const/4 v7, 0x0

    .line 726
    const/4 v5, 0x0

    .line 727
    .line 728
    .line 729
    invoke-static/range {v2 .. v7}, Lcom/kubi/margin/view/DashBoardView;->d(Lcom/kubi/margin/view/DashBoardView;DZILjava/lang/Object;)V

    .line 730
    .line 731
    new-instance v3, Lxp/l;

    .line 732
    .line 733
    move-object/from16 v1, p1

    .line 734
    .line 735
    .line 736
    invoke-direct {v3, v0, v1}, Lxp/l;-><init>(Lcom/kubi/margin/view/MarginRiskView;Lcom/kubi/margin/view/MarginRiskView$a;)V

    .line 737
    const/4 v4, 0x1

    .line 738
    const/4 v5, 0x0

    .line 739
    .line 740
    const-wide/16 v1, 0x0

    .line 741
    .line 742
    .line 743
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 744
    return-void

    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    :sswitch_data_0
    .sparse-switch
        -0x793bff13 -> :sswitch_5
        -0x3f3c1d01 -> :sswitch_4
        -0x3e979d3b -> :sswitch_3
        -0x129660c9 -> :sswitch_2
        0x1325040e -> :sswitch_1
        0x571f3379 -> :sswitch_0
    .end sparse-switch

    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    :sswitch_data_1
    .sparse-switch
        -0x793bff13 -> :sswitch_b
        -0x3f3c1d01 -> :sswitch_a
        -0x3e979d3b -> :sswitch_9
        -0x129660c9 -> :sswitch_8
        0x1325040e -> :sswitch_7
        0x571f3379 -> :sswitch_6
    .end sparse-switch

    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    :sswitch_data_2
    .sparse-switch
        -0x793bff13 -> :sswitch_11
        -0x3f3c1d01 -> :sswitch_10
        -0x3e979d3b -> :sswitch_f
        -0x129660c9 -> :sswitch_e
        0x1325040e -> :sswitch_d
        0x571f3379 -> :sswitch_c
    .end sparse-switch
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
.end method

.method public final g(Landroidx/fragment/app/Fragment;Lcom/kubi/margin/view/MarginRiskView$a;)V
    .locals 19
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KCCyclomaticComplexityCheck"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    .line 5
    invoke-interface/range {p2 .. p2}, Lcom/kubi/margin/view/MarginRiskView$a;->b()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "B4tradingIsolated"

    .line 11
    :goto_0
    move-object v2, v1

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_0
    const-string v1, "B4tradingCross"

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :goto_1
    const/16 v6, 0x8

    .line 18
    const/4 v7, 0x0

    .line 19
    .line 20
    const-string v3, "orderManagement"

    .line 21
    .line 22
    const-string v4, "12"

    .line 23
    const/4 v5, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v2 .. v7}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface/range {p2 .. p2}, Lcom/kubi/margin/view/MarginRiskView$a;->b()Z

    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x0

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    sget v1, Lcom/kubi/margin/R$string;->margin_single_symbol_account:I

    .line 36
    .line 37
    new-instance v3, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    const/16 v4, 0x2d

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-interface/range {p2 .. p2}, Lcom/kubi/margin/view/MarginRiskView$a;->e()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 49
    move-result-object v4

    .line 50
    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->getShowSymbol()Ljava/lang/String;

    .line 55
    move-result-object v4

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    move-object v4, v2

    .line 58
    .line 59
    .line 60
    :goto_2
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    move-result-object v4

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    move-result-object v3

    .line 69
    .line 70
    .line 71
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    move-result-object v1

    .line 77
    goto :goto_3

    .line 78
    .line 79
    :cond_2
    sget v1, Lcom/kubi/margin/R$string;->margin_whole_account:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    :goto_3
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-interface/range {p2 .. p2}, Lcom/kubi/margin/view/MarginRiskView$a;->status()Ljava/lang/String;

    .line 90
    move-result-object v3

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 94
    move-result v4

    .line 95
    .line 96
    const-string v5, "IN_LIQUIDATION"

    .line 97
    .line 98
    const-string v6, "FROZEN_FL"

    .line 99
    .line 100
    const-string v7, "LIABILITY"

    .line 101
    .line 102
    const-string v8, "BANKRUPTCY"

    .line 103
    .line 104
    .line 105
    sparse-switch v4, :sswitch_data_0

    .line 106
    goto :goto_4

    .line 107
    .line 108
    .line 109
    :sswitch_0
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    move-result v3

    .line 111
    .line 112
    if-nez v3, :cond_6

    .line 113
    goto :goto_4

    .line 114
    .line 115
    .line 116
    :sswitch_1
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    move-result v3

    .line 118
    .line 119
    if-nez v3, :cond_3

    .line 120
    goto :goto_4

    .line 121
    .line 122
    .line 123
    :sswitch_2
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    move-result v3

    .line 125
    .line 126
    if-nez v3, :cond_3

    .line 127
    goto :goto_4

    .line 128
    .line 129
    :cond_3
    new-instance v3, Lcom/kubi/utils/v0;

    .line 130
    .line 131
    .line 132
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 133
    .line 134
    sget v4, Lcom/kubi/margin/R$string;->margin_dialog_liquidation_tips:I

    .line 135
    .line 136
    .line 137
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 138
    move-result-object v1

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v4, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v1}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 146
    move-result-object v1

    .line 147
    .line 148
    .line 149
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 150
    .line 151
    goto/16 :goto_7

    .line 152
    .line 153
    .line 154
    :sswitch_3
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    move-result v3

    .line 156
    .line 157
    if-nez v3, :cond_6

    .line 158
    .line 159
    :goto_4
    new-instance v1, Lcom/kubi/utils/v0;

    .line 160
    .line 161
    .line 162
    invoke-direct {v1}, Lcom/kubi/utils/v0;-><init>()V

    .line 163
    .line 164
    new-instance v3, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    sget v4, Lcom/kubi/margin/R$string;->kc_margin_riskrate_description:I

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 173
    move-result-object v4

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    const/16 v4, 0xa

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    move-result-object v3

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v3}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 189
    .line 190
    new-instance v3, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    sget v9, Lcom/kubi/margin/R$string;->kc_margin_pledge_rate_description:I

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v9}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 199
    move-result-object v9

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    move-result-object v3

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v3}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 213
    .line 214
    new-instance v3, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    .line 219
    sget v9, Lcom/kubi/margin/R$string;->kc_margin_pledge_rate_description2:I

    .line 220
    .line 221
    .line 222
    invoke-interface/range {p2 .. p2}, Lcom/kubi/margin/view/MarginRiskView$a;->f()Ljava/math/BigDecimal;

    .line 223
    move-result-object v10

    .line 224
    .line 225
    if-eqz v10, :cond_4

    .line 226
    .line 227
    const/16 v17, 0x3f

    .line 228
    .line 229
    const/16 v18, 0x0

    .line 230
    const/4 v11, 0x0

    .line 231
    const/4 v12, 0x0

    .line 232
    const/4 v13, 0x0

    .line 233
    const/4 v14, 0x0

    .line 234
    const/4 v15, 0x0

    .line 235
    .line 236
    const/16 v16, 0x0

    .line 237
    .line 238
    .line 239
    invoke-static/range {v10 .. v18}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 240
    move-result-object v10

    .line 241
    goto :goto_5

    .line 242
    :cond_4
    move-object v10, v2

    .line 243
    .line 244
    .line 245
    :goto_5
    invoke-static {v10}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 246
    move-result-object v10

    .line 247
    .line 248
    .line 249
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 250
    move-result-object v10

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v9, v10}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 254
    move-result-object v9

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    move-result-object v3

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v3}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 268
    .line 269
    new-instance v3, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 273
    .line 274
    sget v9, Lcom/kubi/margin/R$string;->kc_margin_riskrate_description2:I

    .line 275
    .line 276
    .line 277
    invoke-interface/range {p2 .. p2}, Lcom/kubi/margin/view/MarginRiskView$a;->d()Ljava/math/BigDecimal;

    .line 278
    move-result-object v10

    .line 279
    .line 280
    if-eqz v10, :cond_5

    .line 281
    .line 282
    const/16 v17, 0x3f

    .line 283
    .line 284
    const/16 v18, 0x0

    .line 285
    const/4 v11, 0x0

    .line 286
    const/4 v12, 0x0

    .line 287
    const/4 v13, 0x0

    .line 288
    const/4 v14, 0x0

    .line 289
    const/4 v15, 0x0

    .line 290
    .line 291
    const/16 v16, 0x0

    .line 292
    .line 293
    .line 294
    invoke-static/range {v10 .. v18}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 295
    move-result-object v10

    .line 296
    goto :goto_6

    .line 297
    :cond_5
    move-object v10, v2

    .line 298
    .line 299
    .line 300
    :goto_6
    invoke-static {v10}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    move-result-object v10

    .line 302
    .line 303
    .line 304
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 305
    move-result-object v10

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v9, v10}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 309
    move-result-object v9

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    move-result-object v3

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1, v3}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 323
    goto :goto_7

    .line 324
    .line 325
    :cond_6
    new-instance v3, Lcom/kubi/utils/v0;

    .line 326
    .line 327
    .line 328
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 329
    .line 330
    sget v4, Lcom/kubi/margin/R$string;->margin_dialog_liability_tips:I

    .line 331
    .line 332
    .line 333
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 334
    move-result-object v1

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v4, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 338
    move-result-object v1

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3, v1}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 342
    move-result-object v1

    .line 343
    .line 344
    .line 345
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    :goto_7
    invoke-interface/range {p2 .. p2}, Lcom/kubi/margin/view/MarginRiskView$a;->status()Ljava/lang/String;

    .line 349
    move-result-object v3

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 353
    move-result v4

    .line 354
    .line 355
    .line 356
    sparse-switch v4, :sswitch_data_1

    .line 357
    goto :goto_8

    .line 358
    .line 359
    .line 360
    :sswitch_4
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    move-result v3

    .line 362
    .line 363
    if-nez v3, :cond_8

    .line 364
    goto :goto_8

    .line 365
    .line 366
    .line 367
    :sswitch_5
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    move-result v3

    .line 369
    .line 370
    if-nez v3, :cond_7

    .line 371
    goto :goto_8

    .line 372
    .line 373
    .line 374
    :sswitch_6
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    move-result v3

    .line 376
    .line 377
    if-nez v3, :cond_7

    .line 378
    goto :goto_8

    .line 379
    .line 380
    :cond_7
    sget v3, Lcom/kubi/margin/R$string;->margin_liq_ing:I

    .line 381
    goto :goto_9

    .line 382
    .line 383
    .line 384
    :sswitch_7
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    move-result v3

    .line 386
    .line 387
    if-nez v3, :cond_8

    .line 388
    .line 389
    :goto_8
    sget v3, Lcom/kubi/margin/R$string;->debt_ratio:I

    .line 390
    goto :goto_9

    .line 391
    .line 392
    :cond_8
    sget v3, Lcom/kubi/margin/R$string;->liability:I

    .line 393
    .line 394
    :goto_9
    sget v4, Lcom/kubi/margin/R$string;->debt_ratio:I

    .line 395
    .line 396
    if-ne v3, v4, :cond_9

    .line 397
    .line 398
    sget-object v9, Lq30/h;->a:Lq30/h;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 402
    move-result-object v11

    .line 403
    .line 404
    const-string v2, "getString(...)"

    .line 405
    .line 406
    .line 407
    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 411
    move-result-object v12

    .line 412
    .line 413
    sget v1, Lcom/kubi/margin/R$string;->i_already_know:I

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 417
    move-result-object v13

    .line 418
    .line 419
    .line 420
    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 424
    move-result-object v10

    .line 425
    .line 426
    const-string v0, "getChildFragmentManager(...)"

    .line 427
    .line 428
    .line 429
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 430
    .line 431
    new-instance v14, Lxp/m;

    .line 432
    .line 433
    .line 434
    invoke-direct {v14}, Lxp/m;-><init>()V

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v9 .. v14}, Lq30/h;->d(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 438
    return-void

    .line 439
    .line 440
    :cond_9
    sget-object v4, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v4}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 444
    move-result-object v4

    .line 445
    .line 446
    .line 447
    invoke-virtual {v4, v3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 448
    move-result-object v3

    .line 449
    .line 450
    .line 451
    invoke-virtual {v3, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->L4(Landroid/text/SpannableStringBuilder;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 452
    move-result-object v1

    .line 453
    .line 454
    new-instance v3, Lxp/n;

    .line 455
    .line 456
    .line 457
    invoke-direct {v3}, Lxp/n;-><init>()V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v1, v3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->G4(Lcom/kubi/resources/dialog/DialogFragmentHelper$b;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 461
    move-result-object v1

    .line 462
    .line 463
    sget v3, Lcom/kubi/margin/R$string;->i_already_know:I

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 467
    move-result-object v3

    .line 468
    .line 469
    .line 470
    invoke-virtual {v1, v3, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->T4(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 471
    move-result-object v1

    .line 472
    .line 473
    .line 474
    invoke-interface/range {p2 .. p2}, Lcom/kubi/margin/view/MarginRiskView$a;->e()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 475
    move-result-object v2

    .line 476
    .line 477
    if-nez v2, :cond_a

    .line 478
    .line 479
    .line 480
    invoke-interface/range {p2 .. p2}, Lcom/kubi/margin/view/MarginRiskView$a;->a()Ljava/lang/String;

    .line 481
    move-result-object v2

    .line 482
    .line 483
    .line 484
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 485
    move-result v2

    .line 486
    .line 487
    if-nez v2, :cond_c

    .line 488
    .line 489
    .line 490
    :cond_a
    invoke-interface/range {p2 .. p2}, Lcom/kubi/margin/view/MarginRiskView$a;->status()Ljava/lang/String;

    .line 491
    move-result-object v2

    .line 492
    .line 493
    .line 494
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 495
    move-result v2

    .line 496
    .line 497
    if-nez v2, :cond_b

    .line 498
    .line 499
    .line 500
    invoke-interface/range {p2 .. p2}, Lcom/kubi/margin/view/MarginRiskView$a;->status()Ljava/lang/String;

    .line 501
    move-result-object v2

    .line 502
    .line 503
    .line 504
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 505
    move-result v2

    .line 506
    .line 507
    if-eqz v2, :cond_c

    .line 508
    .line 509
    :cond_b
    sget v2, Lcom/kubi/margin/R$string;->go_transfer:I

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 513
    move-result-object v2

    .line 514
    .line 515
    new-instance v3, Lxp/o;

    .line 516
    .line 517
    move-object/from16 v4, p2

    .line 518
    .line 519
    .line 520
    invoke-direct {v3, v4}, Lxp/o;-><init>(Lcom/kubi/margin/view/MarginRiskView$a;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v1, v2, v3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->Q4(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 524
    .line 525
    .line 526
    :cond_c
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 527
    move-result-object v0

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

    .line 531
    return-void

    .line 532
    nop

    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    :sswitch_data_0
    .sparse-switch
        -0x793bff13 -> :sswitch_3
        -0x3f3c1d01 -> :sswitch_2
        -0x3e979d3b -> :sswitch_1
        0x571f3379 -> :sswitch_0
    .end sparse-switch

    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    :sswitch_data_1
    .sparse-switch
        -0x793bff13 -> :sswitch_7
        -0x3f3c1d01 -> :sswitch_6
        -0x3e979d3b -> :sswitch_5
        0x571f3379 -> :sswitch_4
    .end sparse-switch
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
.end method
