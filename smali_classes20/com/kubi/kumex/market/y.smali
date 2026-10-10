.class public final Lcom/kubi/kumex/market/y;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "RecommendFragment.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u001b\u0010\u000c\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000b\u001a\u0004\u0008\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000b\u001a\u0004\u0008\u0010\u0010\tR\u001b\u0010\u0012\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000b\u001a\u0004\u0008\u0013\u0010\t\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/kubi/kumex/market/QuotesRecommendDecoration;",
        "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;",
        "isHomeRankPosition",
        "",
        "<init>",
        "(Z)V",
        "dp4",
        "",
        "getDp4",
        "()I",
        "dp4$delegate",
        "Lkotlin/Lazy;",
        "dp8",
        "getDp8",
        "dp8$delegate",
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
        "SMAP\nRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/kumex/market/QuotesRecommendDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,466:1\n808#2,11:467\n*S KotlinDebug\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/kumex/market/QuotesRecommendDecoration\n*L\n393#1:467,11\n*E\n"
    }
.end annotation


# instance fields
.field public final d:Z

.field public final e:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/kubi/kumex/market/y;->d:Z

    .line 6
    .line 7
    new-instance p1, Lcom/kubi/kumex/market/u;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Lcom/kubi/kumex/market/u;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iput-object p1, p0, Lcom/kubi/kumex/market/y;->e:Lkotlin/Lazy;

    .line 17
    .line 18
    new-instance p1, Lcom/kubi/kumex/market/v;

    .line 19
    .line 20
    .line 21
    invoke-direct {p1}, Lcom/kubi/kumex/market/v;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    iput-object p1, p0, Lcom/kubi/kumex/market/y;->f:Lkotlin/Lazy;

    .line 28
    .line 29
    new-instance p1, Lcom/kubi/kumex/market/w;

    .line 30
    .line 31
    .line 32
    invoke-direct {p1}, Lcom/kubi/kumex/market/w;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    iput-object p1, p0, Lcom/kubi/kumex/market/y;->g:Lkotlin/Lazy;

    .line 39
    .line 40
    new-instance p1, Lcom/kubi/kumex/market/x;

    .line 41
    .line 42
    .line 43
    invoke-direct {p1}, Lcom/kubi/kumex/market/x;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    iput-object p1, p0, Lcom/kubi/kumex/market/y;->h:Lkotlin/Lazy;

    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
.end method

.method public static synthetic a()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/market/y;->h()I

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
    invoke-static {}, Lcom/kubi/kumex/market/y;->g()I

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
    invoke-static {}, Lcom/kubi/kumex/market/y;->f()I

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

.method public static synthetic d()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/market/y;->e()I

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
    const/16 v1, 0xc

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
    const/16 v1, 0x18

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

.method private static final g()I
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

.method public static final h()I
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
    const/16 v1, 0x8

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

.method private final i()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/market/y;->g:Lkotlin/Lazy;

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

.method private final j()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/market/y;->h:Lkotlin/Lazy;

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

.method private final k()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/market/y;->e:Lkotlin/Lazy;

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


# virtual methods
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
    .line 45
    if-eqz p4, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 49
    move-result p2

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    move-result-object p4

    .line 54
    .line 55
    .line 56
    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    const/16 v0, 0x18

    .line 59
    .line 60
    .line 61
    invoke-static {p4, v0}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 62
    move-result p4

    .line 63
    float-to-int p4, p4

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 67
    move-result v0

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    move-result-object p3

    .line 72
    .line 73
    .line 74
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    const/16 v1, 0x14

    .line 77
    .line 78
    .line 79
    invoke-static {p3, v1}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 80
    move-result p3

    .line 81
    float-to-int p3, p3

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2, p4, v0, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 85
    return-void

    .line 86
    .line 87
    :cond_0
    instance-of p4, p2, Lcom/kubi/kumex/market/q0;

    .line 88
    const/4 v2, 0x0

    .line 89
    .line 90
    if-eqz p4, :cond_a

    .line 91
    .line 92
    .line 93
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 94
    move-result-object p3

    .line 95
    .line 96
    .line 97
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    check-cast p3, Lcom/kubi/sdk/p;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p3}, Lcom/kubi/sdk/p;->getData()Ljava/util/List;

    .line 103
    move-result-object p3

    .line 104
    .line 105
    if-eqz p3, :cond_2

    .line 106
    .line 107
    new-instance p4, Ljava/util/ArrayList;

    .line 108
    .line 109
    .line 110
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    move-result-object p3

    .line 115
    .line 116
    .line 117
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    move-result v0

    .line 119
    .line 120
    if-eqz v0, :cond_3

    .line 121
    .line 122
    .line 123
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    instance-of v1, v0, Lcom/kubi/kumex/market/q0;

    .line 127
    .line 128
    if-eqz v1, :cond_1

    .line 129
    .line 130
    .line 131
    invoke-interface {p4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 132
    goto :goto_0

    .line 133
    .line 134
    .line 135
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 136
    move-result-object p4

    .line 137
    .line 138
    :cond_3
    iget-boolean p3, p0, Lcom/kubi/kumex/market/y;->d:Z

    .line 139
    .line 140
    if-eqz p3, :cond_6

    .line 141
    .line 142
    .line 143
    invoke-interface {p4, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 144
    move-result p2

    .line 145
    .line 146
    rem-int/lit8 p2, p2, 0x2

    .line 147
    .line 148
    if-nez p2, :cond_5

    .line 149
    .line 150
    .line 151
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 152
    move-result p2

    .line 153
    .line 154
    if-eqz p2, :cond_4

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/kubi/kumex/market/y;->l()I

    .line 158
    move-result p2

    .line 159
    .line 160
    .line 161
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 162
    move-result p3

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, p2, v2, v2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 166
    return-void

    .line 167
    .line 168
    .line 169
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/kumex/market/y;->l()I

    .line 170
    move-result p2

    .line 171
    .line 172
    .line 173
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 174
    move-result p3

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v2, v2, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 178
    return-void

    .line 179
    .line 180
    .line 181
    :cond_5
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 182
    move-result p2

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v2, v2, v2, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 186
    return-void

    .line 187
    .line 188
    .line 189
    :cond_6
    invoke-interface {p4, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 190
    move-result p2

    .line 191
    .line 192
    rem-int/lit8 p2, p2, 0x2

    .line 193
    .line 194
    if-nez p2, :cond_8

    .line 195
    .line 196
    .line 197
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 198
    move-result p2

    .line 199
    .line 200
    if-eqz p2, :cond_7

    .line 201
    .line 202
    .line 203
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->k()I

    .line 204
    move-result p2

    .line 205
    .line 206
    .line 207
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 208
    move-result p3

    .line 209
    .line 210
    .line 211
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 212
    move-result p4

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 216
    return-void

    .line 217
    .line 218
    .line 219
    :cond_7
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 220
    move-result p2

    .line 221
    .line 222
    .line 223
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->k()I

    .line 224
    move-result p3

    .line 225
    .line 226
    .line 227
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 228
    move-result p4

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 232
    return-void

    .line 233
    .line 234
    .line 235
    :cond_8
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 236
    move-result p2

    .line 237
    .line 238
    if-eqz p2, :cond_9

    .line 239
    .line 240
    .line 241
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 242
    move-result p2

    .line 243
    .line 244
    .line 245
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->k()I

    .line 246
    move-result p3

    .line 247
    .line 248
    .line 249
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 250
    move-result p4

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 254
    return-void

    .line 255
    .line 256
    .line 257
    :cond_9
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->k()I

    .line 258
    move-result p2

    .line 259
    .line 260
    .line 261
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 262
    move-result p3

    .line 263
    .line 264
    .line 265
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 266
    move-result p4

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 270
    return-void

    .line 271
    .line 272
    :cond_a
    instance-of p2, p2, Lcom/kubi/kumex/market/a;

    .line 273
    .line 274
    if-eqz p2, :cond_c

    .line 275
    .line 276
    iget-boolean p2, p0, Lcom/kubi/kumex/market/y;->d:Z

    .line 277
    .line 278
    if-eqz p2, :cond_b

    .line 279
    .line 280
    .line 281
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 282
    move-result p2

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1, v2, v2, v2, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 286
    return-void

    .line 287
    .line 288
    .line 289
    :cond_b
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 290
    move-result p2

    .line 291
    .line 292
    .line 293
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 294
    move-result-object p3

    .line 295
    .line 296
    .line 297
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    .line 299
    const/16 p4, 0x28

    .line 300
    .line 301
    .line 302
    invoke-static {p3, p4}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 303
    move-result p3

    .line 304
    float-to-int p3, p3

    .line 305
    .line 306
    .line 307
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->i()I

    .line 308
    move-result p4

    .line 309
    .line 310
    .line 311
    invoke-direct {p0}, Lcom/kubi/kumex/market/y;->j()I

    .line 312
    move-result v0

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 316
    :cond_c
    return-void
.end method

.method public final l()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/market/y;->f:Lkotlin/Lazy;

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
