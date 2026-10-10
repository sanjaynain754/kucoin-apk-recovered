.class public final Lcom/kubi/kumex/market/g;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "RecommendFragment.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\t\u001a\u0004\u0008\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\t\u001a\u0004\u0008\u000e\u0010\u0007\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/kubi/kumex/market/DrawerRecommendDecoration;",
        "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;",
        "<init>",
        "()V",
        "dp4",
        "",
        "getDp4",
        "()I",
        "dp4$delegate",
        "Lkotlin/Lazy;",
        "dp12",
        "getDp12",
        "dp12$delegate",
        "dp24",
        "getDp24",
        "dp24$delegate",
        "getItemOffsets",
        "",
        "outRect",
        "Landroid/graphics/Rect;",
        "view",
        "Landroid/view/View;",
        "parent",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "state",
        "Landroidx/recyclerview/widget/RecyclerView$State;",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/kumex/market/DrawerRecommendDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,466:1\n808#2,11:467\n*S KotlinDebug\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/kumex/market/DrawerRecommendDecoration\n*L\n446#1:467,11\n*E\n"
    }
.end annotation


# instance fields
.field public final d:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/kumex/market/d;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/kumex/market/d;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/kumex/market/g;->d:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/kumex/market/e;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/kubi/kumex/market/e;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/kumex/market/g;->e:Lkotlin/Lazy;

    .line 26
    .line 27
    new-instance v0, Lcom/kubi/kumex/market/f;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Lcom/kubi/kumex/market/f;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iput-object v0, p0, Lcom/kubi/kumex/market/g;->f:Lkotlin/Lazy;

    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static synthetic a()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/market/g;->f()I

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public static synthetic b()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/market/g;->d()I

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public static synthetic c()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/market/g;->e()I

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public static final d()I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const/16 v1, 0x10

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    return v0
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
.end method

.method public static final e()I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const/16 v1, 0xe

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    return v0
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
.end method

.method public static final f()I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const/high16 v1, 0x40800000    # 4.0f

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->b(Landroid/content/Context;F)F

    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    return v0
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
.end method


# virtual methods
.method public final g()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/market/g;->e:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Number;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 12
    move-result v0

    .line 13
    return v0
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
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 3
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "outRect"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "view"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "parent"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "state"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 24
    move-result p2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 28
    move-result-object p4

    .line 29
    .line 30
    const-string v0, "null cannot be cast to non-null type com.kubi.sdk.BaseAdapter<*>"

    .line 31
    .line 32
    .line 33
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    check-cast p4, Lcom/kubi/sdk/p;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p4, p2}, Lcom/kubi/sdk/p;->getItem(I)Ljava/lang/Object;

    .line 39
    move-result-object p2

    .line 40
    .line 41
    instance-of p4, p2, Lcom/kubi/kumex/record/h;

    .line 42
    .line 43
    const-string v1, "getContext(...)"

    .line 44
    const/4 v2, 0x0

    .line 45
    .line 46
    if-eqz p4, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->g()I

    .line 50
    move-result p2

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->g()I

    .line 54
    move-result p4

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    move-result-object p3

    .line 59
    .line 60
    .line 61
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    const/16 v0, 0xa

    .line 64
    .line 65
    .line 66
    invoke-static {p3, v0}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 67
    move-result p3

    .line 68
    float-to-int p3, p3

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p2, v2, p4, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 72
    return-void

    .line 73
    .line 74
    :cond_0
    instance-of p4, p2, Lcom/kubi/kumex/market/q0;

    .line 75
    .line 76
    if-eqz p4, :cond_7

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 80
    move-result-object p3

    .line 81
    .line 82
    .line 83
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    check-cast p3, Lcom/kubi/sdk/p;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Lcom/kubi/sdk/p;->getData()Ljava/util/List;

    .line 89
    move-result-object p3

    .line 90
    .line 91
    if-eqz p3, :cond_2

    .line 92
    .line 93
    new-instance p4, Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    move-result-object p3

    .line 101
    .line 102
    .line 103
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    move-result v0

    .line 105
    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    .line 109
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    instance-of v1, v0, Lcom/kubi/kumex/market/q0;

    .line 113
    .line 114
    if-eqz v1, :cond_1

    .line 115
    .line 116
    .line 117
    invoke-interface {p4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 118
    goto :goto_0

    .line 119
    .line 120
    .line 121
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 122
    move-result-object p4

    .line 123
    .line 124
    .line 125
    :cond_3
    invoke-interface {p4, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 126
    move-result p2

    .line 127
    .line 128
    rem-int/lit8 p2, p2, 0x2

    .line 129
    .line 130
    if-nez p2, :cond_5

    .line 131
    .line 132
    .line 133
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 134
    move-result p2

    .line 135
    .line 136
    if-eqz p2, :cond_4

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->i()I

    .line 140
    move-result p2

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->g()I

    .line 144
    move-result p3

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->i()I

    .line 148
    move-result p4

    .line 149
    .line 150
    mul-int/lit8 p4, p4, 0x2

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 154
    return-void

    .line 155
    .line 156
    .line 157
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->g()I

    .line 158
    move-result p2

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->i()I

    .line 162
    move-result p3

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->i()I

    .line 166
    move-result p4

    .line 167
    .line 168
    mul-int/lit8 p4, p4, 0x2

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 172
    return-void

    .line 173
    .line 174
    .line 175
    :cond_5
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 176
    move-result p2

    .line 177
    .line 178
    if-eqz p2, :cond_6

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->g()I

    .line 182
    move-result p2

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->i()I

    .line 186
    move-result p3

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->i()I

    .line 190
    move-result p4

    .line 191
    .line 192
    mul-int/lit8 p4, p4, 0x2

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 196
    return-void

    .line 197
    .line 198
    .line 199
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->i()I

    .line 200
    move-result p2

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->g()I

    .line 204
    move-result p3

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->i()I

    .line 208
    move-result p4

    .line 209
    .line 210
    mul-int/lit8 p4, p4, 0x2

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 214
    return-void

    .line 215
    .line 216
    :cond_7
    instance-of p2, p2, Lcom/kubi/kumex/market/a;

    .line 217
    .line 218
    if-eqz p2, :cond_8

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->g()I

    .line 222
    move-result p2

    .line 223
    .line 224
    .line 225
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 226
    move-result-object p3

    .line 227
    .line 228
    .line 229
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .line 231
    const/16 p4, 0x11

    .line 232
    .line 233
    .line 234
    invoke-static {p3, p4}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 235
    move-result p3

    .line 236
    float-to-int p3, p3

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->g()I

    .line 240
    move-result p4

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0}, Lcom/kubi/kumex/market/g;->h()I

    .line 244
    move-result v0

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 248
    :cond_8
    return-void
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
.end method

.method public final h()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/market/g;->f:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Number;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 12
    move-result v0

    .line 13
    return v0
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
.end method

.method public final i()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/market/g;->d:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Number;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 12
    move-result v0

    .line 13
    return v0
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
.end method
