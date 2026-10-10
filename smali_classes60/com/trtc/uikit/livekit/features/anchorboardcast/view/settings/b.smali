.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;
.super Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;
.source "SettingsPanelDialog.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010\u000c\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsPanelDialog;",
        "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;",
        "context",
        "Landroid/content/Context;",
        "liveManager",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;",
        "liveCoreView",
        "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;",
        "liveEntranceConfig",
        "Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;",
        "<init>",
        "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;)V",
        "initView",
        "",
        "initSettingsListView",
        "view",
        "Landroid/view/View;",
        "tuilivekit_googleRelease"
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
.field public final m:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final o:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "liveManager"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "liveCoreView"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x2

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1, v0, v1, v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;-><init>(Landroid/content/Context;Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->m:Landroid/content/Context;

    .line 23
    .line 24
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 25
    .line 26
    iput-object p3, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->o:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 27
    .line 28
    iput-object p4, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->p:Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->D()V

    .line 32
    return-void
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
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
.end method

.method private final D()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->m:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget v1, Lcom/trtc/uikit/livekit/R$layout;->livekit_anchor_settings_panel:I

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->C(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->q(Landroid/view/View;)V

    .line 23
    return-void
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
.end method


# virtual methods
.method public final C(Landroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    sget v0, Lcom/trtc/uikit/livekit/R$id;->rv_settings_list:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string v0, "findViewById(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->m:Landroid/content/Context;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->o:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 22
    .line 23
    iget-object v5, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->p:Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;

    .line 24
    move-object v4, p0

    .line 25
    .line 26
    .line 27
    invoke-direct/range {v0 .. v5}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;-><init>(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->getItemCount()I

    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x1

    .line 33
    const/4 v3, 0x3

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 37
    move-result v1

    .line 38
    .line 39
    new-instance v2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 40
    .line 41
    iget-object v3, v4, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->m:Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, v3, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 48
    .line 49
    iget-object v2, v4, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;->m:Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    invoke-static {v2}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->getScreenWidth(Landroid/content/Context;)I

    .line 53
    move-result v2

    .line 54
    .line 55
    const/high16 v3, 0x42a00000    # 80.0f

    .line 56
    .line 57
    .line 58
    invoke-static {v3}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 59
    move-result v3

    .line 60
    mul-int/2addr v3, v1

    .line 61
    sub-int/2addr v2, v3

    .line 62
    .line 63
    div-int v3, v2, v1

    .line 64
    .line 65
    add-int/lit8 v5, v1, 0x1

    .line 66
    div-int/2addr v2, v5

    .line 67
    .line 68
    new-instance v5, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b$a;

    .line 69
    .line 70
    .line 71
    invoke-direct {v5, v1, v2, v3}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b$a;-><init>(III)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 78
    return-void
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
.end method
