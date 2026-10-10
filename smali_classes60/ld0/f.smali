.class public final Lld0/f;
.super Ljava/lang/Object;
.source "GiftTabLayoutManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007J$\u0010\u001a\u001a\u00020\u00142\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/gift/view/GiftTabLayoutManager;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "giftClickListener",
        "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager$GiftClickListener;",
        "tabManager",
        "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryTabManager;",
        "categoryViewManager",
        "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager;",
        "viewPager",
        "Landroidx/viewpager2/widget/ViewPager2;",
        "contentContainer",
        "Landroid/widget/FrameLayout;",
        "giftCategories",
        "",
        "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;",
        "dividerView",
        "Landroid/view/View;",
        "pagerAdapter",
        "Lcom/trtc/uikit/livekit/component/gift/view/adapter/GiftCategoryPagerAdapter;",
        "setGiftClickListener",
        "",
        "listener",
        "createLayout",
        "categories",
        "columns",
        "",
        "rows",
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
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lld0/e$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:Lld0/d;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d:Lld0/e;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public e:Landroidx/viewpager2/widget/ViewPager2;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:Landroid/widget/FrameLayout;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public h:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public i:Lmd0/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lld0/f;->a:Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iput-object p1, p0, Lld0/f;->g:Ljava/util/List;

    .line 17
    return-void
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
.end method

.method public static final synthetic a(Lld0/f;)Lld0/e$a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lld0/f;->b:Lld0/e$a;

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
.end method

.method public static final synthetic b(Lld0/f;)Lld0/d;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lld0/f;->c:Lld0/d;

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
.end method

.method public static final synthetic c(Lld0/f;)Landroidx/viewpager2/widget/ViewPager2;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lld0/f;->e:Landroidx/viewpager2/widget/ViewPager2;

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
.end method


# virtual methods
.method public final d(Ljava/util/List;II)Landroid/view/View;
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;",
            ">;II)",
            "Landroid/view/View;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string p3, "categories"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lld0/f;->g:Ljava/util/List;

    .line 8
    .line 9
    iget-object p3, p0, Lld0/f;->a:Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    move-result-object p3

    .line 14
    .line 15
    sget v0, Lcom/trtc/uikit/livekit/R$layout;->gift_layout_main_layout:I

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 20
    move-result-object p3

    .line 21
    .line 22
    new-instance v0, Lld0/d;

    .line 23
    .line 24
    iget-object v2, p0, Lld0/f;->a:Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v2}, Lld0/d;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    iput-object v0, p0, Lld0/f;->c:Lld0/d;

    .line 30
    .line 31
    new-instance v0, Lld0/e;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Lld0/e;-><init>()V

    .line 35
    .line 36
    new-instance v2, Lld0/f$a;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, p0}, Lld0/f$a;-><init>(Lld0/f;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Lld0/e;->c(Lld0/e$a;)V

    .line 43
    .line 44
    iput-object v0, p0, Lld0/f;->d:Lld0/e;

    .line 45
    .line 46
    sget v0, Lcom/trtc/uikit/livekit/R$id;->ll_tab_container:I

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    check-cast v0, Landroid/widget/LinearLayout;

    .line 53
    .line 54
    sget v2, Lcom/trtc/uikit/livekit/R$id;->view_divider:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    iput-object v2, p0, Lld0/f;->h:Landroid/view/View;

    .line 61
    .line 62
    sget v2, Lcom/trtc/uikit/livekit/R$id;->fl_content_container:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    check-cast v2, Landroid/widget/FrameLayout;

    .line 69
    .line 70
    iput-object v2, p0, Lld0/f;->f:Landroid/widget/FrameLayout;

    .line 71
    .line 72
    new-instance v2, Landroidx/viewpager2/widget/ViewPager2;

    .line 73
    .line 74
    iget-object v3, p0, Lld0/f;->a:Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    invoke-direct {v2, v3}, Landroidx/viewpager2/widget/ViewPager2;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 80
    const/4 v4, -0x1

    .line 81
    .line 82
    .line 83
    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 87
    .line 88
    iput-object v2, p0, Lld0/f;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 89
    .line 90
    iget-object v3, p0, Lld0/f;->f:Landroid/widget/FrameLayout;

    .line 91
    .line 92
    if-eqz v3, :cond_0

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 96
    .line 97
    :cond_0
    new-instance v2, Lmd0/a;

    .line 98
    .line 99
    iget-object v3, p0, Lld0/f;->a:Landroid/content/Context;

    .line 100
    .line 101
    iget-object v4, p0, Lld0/f;->d:Lld0/e;

    .line 102
    .line 103
    .line 104
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v2, v3, p1, p2, v4}, Lmd0/a;-><init>(Landroid/content/Context;Ljava/util/List;ILld0/e;)V

    .line 108
    .line 109
    iput-object v2, p0, Lld0/f;->i:Lmd0/a;

    .line 110
    .line 111
    iget-object p2, p0, Lld0/f;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 112
    .line 113
    if-eqz p2, :cond_1

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, v2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 117
    .line 118
    :cond_1
    iget-object p2, p0, Lld0/f;->c:Lld0/d;

    .line 119
    .line 120
    if-eqz p2, :cond_2

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, p1}, Lld0/d;->b(Ljava/util/List;)Landroid/view/View;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    .line 127
    :cond_2
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 128
    .line 129
    iget-object p1, p0, Lld0/f;->c:Lld0/d;

    .line 130
    .line 131
    if-eqz p1, :cond_3

    .line 132
    .line 133
    new-instance p2, Lld0/f$b;

    .line 134
    .line 135
    .line 136
    invoke-direct {p2, p0}, Lld0/f$b;-><init>(Lld0/f;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, p2}, Lld0/d;->setOnCategorySelectedListener(Lld0/d$a;)V

    .line 140
    .line 141
    :cond_3
    iget-object p1, p0, Lld0/f;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 142
    .line 143
    if-eqz p1, :cond_4

    .line 144
    .line 145
    new-instance p2, Lld0/f$c;

    .line 146
    .line 147
    .line 148
    invoke-direct {p2, p0}, Lld0/f$c;-><init>(Lld0/f;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 152
    .line 153
    .line 154
    :cond_4
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 155
    return-object p3
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
.end method

.method public final e(Lld0/e$a;)V
    .locals 1
    .param p1    # Lld0/e$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lld0/f;->b:Lld0/e$a;

    .line 8
    return-void
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
.end method
