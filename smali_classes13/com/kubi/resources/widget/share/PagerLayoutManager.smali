.class public final Lcom/kubi/resources/widget/share/PagerLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$LayoutManager;
.source "PagerLayoutManager.kt"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/share/PagerLayoutManager$a;,
        Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u000267B6\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012#\u0008\u0002\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010\u001b\u001a\u00020\u001cH\u0016J\u001c\u0010\u001d\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060 R\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u001e2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0008\u0010%\u001a\u00020&H\u0016J$\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\n\u0010\u001f\u001a\u00060 R\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0004H\u0016J)\u0010,\u001a\u00020\u001e2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(.\u0012\u0004\u0012\u00020\u001e0\u0006J\u0006\u0010/\u001a\u00020\u0004J\u0006\u00100\u001a\u00020\u0004J\u0018\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u0002032\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u001c\u00104\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060 R\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0014\u00105\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060 R\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\u0008\u0012\u0004\u0012\u00020\u0012`\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00068"
    }
    d2 = {
        "Lcom/kubi/resources/widget/share/PagerLayoutManager;",
        "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;",
        "Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;",
        "spanCount",
        "",
        "spanSizeLookup",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "position",
        "<init>",
        "(ILkotlin/jvm/functions/Function1;)V",
        "scrollDistance",
        "maxScrollDistance",
        "spanHeight",
        "Landroid/util/SparseIntArray;",
        "frames",
        "Ljava/util/ArrayList;",
        "Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;",
        "Lkotlin/collections/ArrayList;",
        "getFrames",
        "()Ljava/util/ArrayList;",
        "setFrames",
        "(Ljava/util/ArrayList;)V",
        "onLayoutCompleteListener",
        "",
        "Lcom/kubi/resources/widget/share/PagerLayoutManager$LayoutCompleteListener;",
        "generateDefaultLayoutParams",
        "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;",
        "onLayoutChildren",
        "",
        "recycler",
        "Landroidx/recyclerview/widget/RecyclerView$Recycler;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "state",
        "Landroidx/recyclerview/widget/RecyclerView$State;",
        "onLayoutCompleted",
        "canScrollHorizontally",
        "",
        "scrollHorizontallyBy",
        "dx",
        "computeScrollVectorForPosition",
        "Landroid/graphics/PointF;",
        "targetPosition",
        "onLayoutComplete",
        "listener",
        "page",
        "nextPageItemPosition",
        "prePageItemPosition",
        "assignSpans",
        "view",
        "Landroid/view/View;",
        "fill",
        "recycleViewsOutOfBounds",
        "LayoutCompleteListener",
        "VisibleRect",
        "LComponent_googleRelease"
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
        "SMAP\nPagerLayoutManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerLayoutManager.kt\ncom/kubi/resources/widget/share/PagerLayoutManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:I

.field public e:I

.field public final f:Landroid/util/SparseIntArray;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/share/PagerLayoutManager$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lcom/kubi/resources/widget/share/PagerLayoutManager;-><init>(ILkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "spanSizeLookup"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;-><init>()V

    .line 5
    iput p1, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->b:I

    .line 6
    iput-object p2, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->c:Lkotlin/jvm/functions/Function1;

    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    move-result p1

    iput p1, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->e:I

    .line 8
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->f:Landroid/util/SparseIntArray;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->h:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/16 p1, 0xc

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 2
    new-instance p2, Lex/a;

    invoke-direct {p2}, Lex/a;-><init>()V

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/kubi/resources/widget/share/PagerLayoutManager;-><init>(ILkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic a(I)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/resources/widget/share/PagerLayoutManager;->b(I)I

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final b(I)I
    .locals 0

    .line 1
    const/4 p0, 0x3

    .line 2
    return p0
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
.end method


# virtual methods
.method public final c(Landroid/view/View;I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->c:Lkotlin/jvm/functions/Function1;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Number;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 16
    move-result p2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 20
    move-result v0

    .line 21
    mul-int/2addr p2, v0

    .line 22
    .line 23
    iget v0, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->b:I

    .line 24
    div-int/2addr p2, v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    const/high16 v0, 0x40000000    # 2.0f

    .line 31
    .line 32
    .line 33
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 34
    move-result p2

    .line 35
    .line 36
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 37
    return-void
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

.method public canScrollHorizontally()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string v0, "get(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast p1, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;->getVisible()Z

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance p1, Landroid/graphics/PointF;

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 26
    return-object p1

    .line 27
    .line 28
    :cond_0
    new-instance v0, Landroid/graphics/PointF;

    .line 29
    .line 30
    iget p1, p1, Landroid/graphics/RectF;->left:F

    .line 31
    .line 32
    iget v2, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->d:I

    .line 33
    int-to-float v2, v2

    .line 34
    sub-float/2addr p1, v2

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 38
    return-object v0
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
.end method

.method public final d(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 6
    .line 7
    iget v1, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->d:I

    .line 8
    .line 9
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    iput v2, v0, Landroid/graphics/Rect;->top:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 16
    move-result v3

    .line 17
    add-int/2addr v1, v3

    .line 18
    .line 19
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 23
    move-result v1

    .line 24
    .line 25
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 29
    move-result v1

    .line 30
    move v3, v2

    .line 31
    .line 32
    :goto_0
    if-ge v2, v1, :cond_1

    .line 33
    .line 34
    sub-int v4, v2, v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    new-instance v5, Landroid/graphics/Rect;

    .line 43
    .line 44
    .line 45
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedLeft(Landroid/view/View;)I

    .line 49
    move-result v6

    .line 50
    .line 51
    iget v7, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->d:I

    .line 52
    add-int/2addr v6, v7

    .line 53
    .line 54
    iput v6, v5, Landroid/graphics/Rect;->left:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedTop(Landroid/view/View;)I

    .line 58
    move-result v6

    .line 59
    .line 60
    iput v6, v5, Landroid/graphics/Rect;->top:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedRight(Landroid/view/View;)I

    .line 64
    move-result v6

    .line 65
    .line 66
    iget v7, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->d:I

    .line 67
    add-int/2addr v6, v7

    .line 68
    .line 69
    iput v6, v5, Landroid/graphics/Rect;->right:I

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedBottom(Landroid/view/View;)I

    .line 73
    move-result v6

    .line 74
    .line 75
    iput v6, v5, Landroid/graphics/Rect;->bottom:I

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v5}, Landroid/graphics/Rect;->intersects(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 79
    move-result v5

    .line 80
    .line 81
    if-nez v5, :cond_0

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v4, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAndRecycleView(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 85
    .line 86
    add-int/lit8 v3, v3, 0x1

    .line 87
    .line 88
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    return-void
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
.end method

.method public final fill(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$State;->isPreLayout()Z

    .line 10
    move-result p2

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    :cond_0
    move-object v4, p0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_1
    new-instance p2, Landroid/graphics/Rect;

    .line 18
    .line 19
    .line 20
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    iget v0, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->d:I

    .line 23
    .line 24
    iput v0, p2, Landroid/graphics/Rect;->left:I

    .line 25
    const/4 v1, 0x0

    .line 26
    .line 27
    iput v1, p2, Landroid/graphics/Rect;->top:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 31
    move-result v2

    .line 32
    add-int/2addr v0, v2

    .line 33
    .line 34
    iput v0, p2, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 38
    move-result v0

    .line 39
    .line 40
    iput v0, p2, Landroid/graphics/Rect;->bottom:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 44
    move-result v0

    .line 45
    move v2, v1

    .line 46
    .line 47
    :goto_0
    if-ge v2, v0, :cond_0

    .line 48
    .line 49
    iget-object v3, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    check-cast v3, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;->getVisible()Z

    .line 59
    move-result v3

    .line 60
    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    iget-object v3, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    move-result-object v3

    .line 68
    .line 69
    check-cast v3, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;->rect()Landroid/graphics/Rect;

    .line 73
    move-result-object v3

    .line 74
    .line 75
    .line 76
    invoke-static {p2, v3}, Landroid/graphics/Rect;->intersects(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 77
    move-result v3

    .line 78
    .line 79
    if-eqz v3, :cond_2

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$Recycler;->getViewForPosition(I)Landroid/view/View;

    .line 83
    move-result-object v5

    .line 84
    .line 85
    const-string v3, "getViewForPosition(...)"

    .line 86
    .line 87
    .line 88
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v5, v2}, Lcom/kubi/resources/widget/share/PagerLayoutManager;->c(Landroid/view/View;I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v5, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;)V

    .line 98
    .line 99
    iget-object v3, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    move-result-object v3

    .line 104
    .line 105
    check-cast v3, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;

    .line 106
    const/4 v4, 0x1

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v4}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;->setVisible(Z)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;->rect()Landroid/graphics/Rect;

    .line 113
    move-result-object v3

    .line 114
    .line 115
    iget v4, v3, Landroid/graphics/Rect;->left:I

    .line 116
    .line 117
    iget v6, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->d:I

    .line 118
    sub-int/2addr v4, v6

    .line 119
    .line 120
    iget v7, v3, Landroid/graphics/Rect;->top:I

    .line 121
    .line 122
    iget v8, v3, Landroid/graphics/Rect;->right:I

    .line 123
    sub-int/2addr v8, v6

    .line 124
    .line 125
    iget v9, v3, Landroid/graphics/Rect;->bottom:I

    .line 126
    move v6, v4

    .line 127
    move-object v4, p0

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v4 .. v9}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    .line 131
    goto :goto_1

    .line 132
    :cond_2
    move-object v4, p0

    .line 133
    .line 134
    :goto_1
    iget-object v3, v4, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 138
    move-result-object v3

    .line 139
    .line 140
    check-cast v3, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;->getVisible()Z

    .line 144
    move-result v3

    .line 145
    .line 146
    if-eqz v3, :cond_3

    .line 147
    .line 148
    iget-object v3, v4, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    move-result-object v3

    .line 153
    .line 154
    check-cast v3, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;->rect()Landroid/graphics/Rect;

    .line 158
    move-result-object v3

    .line 159
    .line 160
    .line 161
    invoke-static {p2, v3}, Landroid/graphics/Rect;->intersects(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 162
    move-result v3

    .line 163
    .line 164
    if-nez v3, :cond_3

    .line 165
    .line 166
    iget-object v3, v4, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 170
    move-result-object v3

    .line 171
    .line 172
    check-cast v3, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v1}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;->setVisible(Z)V

    .line 176
    .line 177
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    :goto_2
    return-void
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
.end method

.method public generateDefaultLayoutParams()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 3
    const/4 v1, -0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 7
    return-object v0
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
.end method

.method public onLayoutChildren(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 16
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$Recycler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "recycler"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v2, "state"

    .line 12
    .line 13
    move-object/from16 v3, p2

    .line 14
    .line 15
    .line 16
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    const-string v4, "onLayoutChildren with itemCount:"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 30
    move-result v4

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    const-string v4, "PagerLayoutManager"

    .line 40
    .line 41
    .line 42
    invoke-static {v4, v2}, Lro/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 46
    move-result v2

    .line 47
    .line 48
    if-lez v2, :cond_5

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$State;->isPreLayout()Z

    .line 52
    move-result v2

    .line 53
    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_0
    iget-object v2, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 62
    move-result v2

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 66
    move-result v4

    .line 67
    .line 68
    if-eq v2, v4, :cond_4

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 72
    move-result v2

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 76
    move-result v4

    .line 77
    .line 78
    iget-object v5, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 85
    move-result v5

    .line 86
    const/4 v6, 0x0

    .line 87
    move v7, v6

    .line 88
    move v8, v7

    .line 89
    move v9, v8

    .line 90
    .line 91
    :goto_0
    if-ge v7, v5, :cond_4

    .line 92
    .line 93
    iget-object v10, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->c:Lkotlin/jvm/functions/Function1;

    .line 94
    .line 95
    .line 96
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    move-result-object v11

    .line 98
    .line 99
    .line 100
    invoke-interface {v10, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    move-result-object v10

    .line 102
    .line 103
    check-cast v10, Ljava/lang/Number;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 107
    move-result v10

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 111
    move-result v11

    .line 112
    mul-int/2addr v10, v11

    .line 113
    .line 114
    iget v11, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->b:I

    .line 115
    div-int/2addr v10, v11

    .line 116
    .line 117
    iget-object v11, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->f:Landroid/util/SparseIntArray;

    .line 118
    .line 119
    const/high16 v12, -0x80000000

    .line 120
    .line 121
    .line 122
    invoke-virtual {v11, v10, v12}, Landroid/util/SparseIntArray;->get(II)I

    .line 123
    move-result v11

    .line 124
    .line 125
    if-eq v11, v12, :cond_1

    .line 126
    .line 127
    iget-object v11, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->f:Landroid/util/SparseIntArray;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v11, v10}, Landroid/util/SparseIntArray;->get(I)I

    .line 131
    move-result v11

    .line 132
    goto :goto_1

    .line 133
    .line 134
    .line 135
    :cond_1
    invoke-virtual {v1, v7}, Landroidx/recyclerview/widget/RecyclerView$Recycler;->getViewForPosition(I)Landroid/view/View;

    .line 136
    move-result-object v11

    .line 137
    .line 138
    const-string v12, "getViewForPosition(...)"

    .line 139
    .line 140
    .line 141
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v11, v7}, Lcom/kubi/resources/widget/share/PagerLayoutManager;->c(Landroid/view/View;I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v11, v6, v6}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    .line 148
    .line 149
    iget-object v12, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->f:Landroid/util/SparseIntArray;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedMeasuredHeight(Landroid/view/View;)I

    .line 153
    move-result v13

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v10, v13}, Landroid/util/SparseIntArray;->put(II)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v11, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAndRecycleView(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 160
    .line 161
    iget-object v11, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->f:Landroid/util/SparseIntArray;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v11, v10}, Landroid/util/SparseIntArray;->get(I)I

    .line 165
    move-result v11

    .line 166
    .line 167
    :goto_1
    if-lt v2, v10, :cond_2

    .line 168
    .line 169
    iget-object v12, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 170
    .line 171
    new-instance v13, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;

    .line 172
    .line 173
    .line 174
    invoke-direct {v13}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 178
    move-result v14

    .line 179
    mul-int/2addr v14, v9

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 183
    move-result v15

    .line 184
    add-int/2addr v14, v15

    .line 185
    int-to-float v14, v14

    .line 186
    int-to-float v15, v2

    .line 187
    sub-float/2addr v14, v15

    .line 188
    .line 189
    iput v14, v13, Landroid/graphics/RectF;->left:F

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 193
    move-result v14

    .line 194
    int-to-float v14, v14

    .line 195
    int-to-float v15, v4

    .line 196
    sub-float/2addr v14, v15

    .line 197
    .line 198
    iput v14, v13, Landroid/graphics/RectF;->top:F

    .line 199
    .line 200
    iget v15, v13, Landroid/graphics/RectF;->left:F

    .line 201
    int-to-float v6, v10

    .line 202
    add-float/2addr v15, v6

    .line 203
    .line 204
    iput v15, v13, Landroid/graphics/RectF;->right:F

    .line 205
    int-to-float v6, v11

    .line 206
    add-float/2addr v14, v6

    .line 207
    .line 208
    iput v14, v13, Landroid/graphics/RectF;->bottom:F

    .line 209
    .line 210
    .line 211
    invoke-virtual {v13, v9}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;->setPage(I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    invoke-static {v8, v11}, Ljava/lang/Math;->max(II)I

    .line 218
    move-result v6

    .line 219
    sub-int/2addr v2, v10

    .line 220
    move v8, v6

    .line 221
    const/4 v6, 0x0

    .line 222
    goto :goto_2

    .line 223
    :cond_2
    sub-int/2addr v4, v8

    .line 224
    .line 225
    if-ge v4, v11, :cond_3

    .line 226
    .line 227
    add-int/lit8 v9, v9, 0x1

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 231
    move-result v4

    .line 232
    .line 233
    iget v2, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->e:I

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 237
    move-result v6

    .line 238
    add-int/2addr v2, v6

    .line 239
    .line 240
    iput v2, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->e:I

    .line 241
    .line 242
    .line 243
    :cond_3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 244
    move-result v2

    .line 245
    .line 246
    iget-object v6, v0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 247
    .line 248
    new-instance v8, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;

    .line 249
    .line 250
    .line 251
    invoke-direct {v8}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 255
    move-result v12

    .line 256
    mul-int/2addr v12, v9

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 260
    move-result v13

    .line 261
    add-int/2addr v12, v13

    .line 262
    int-to-float v12, v12

    .line 263
    int-to-float v13, v2

    .line 264
    sub-float/2addr v12, v13

    .line 265
    .line 266
    iput v12, v8, Landroid/graphics/RectF;->left:F

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 270
    move-result v12

    .line 271
    int-to-float v12, v12

    .line 272
    int-to-float v13, v4

    .line 273
    sub-float/2addr v12, v13

    .line 274
    .line 275
    iput v12, v8, Landroid/graphics/RectF;->top:F

    .line 276
    .line 277
    iget v13, v8, Landroid/graphics/RectF;->left:F

    .line 278
    int-to-float v14, v10

    .line 279
    add-float/2addr v13, v14

    .line 280
    .line 281
    iput v13, v8, Landroid/graphics/RectF;->right:F

    .line 282
    int-to-float v13, v11

    .line 283
    add-float/2addr v12, v13

    .line 284
    .line 285
    iput v12, v8, Landroid/graphics/RectF;->bottom:F

    .line 286
    .line 287
    .line 288
    invoke-virtual {v8, v9}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;->setPage(I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    const/4 v6, 0x0

    .line 293
    .line 294
    .line 295
    invoke-static {v6, v11}, Ljava/lang/Math;->max(II)I

    .line 296
    move-result v8

    .line 297
    sub-int/2addr v2, v10

    .line 298
    .line 299
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 300
    .line 301
    goto/16 :goto_0

    .line 302
    .line 303
    .line 304
    :cond_4
    invoke-virtual/range {p0 .. p2}, Lcom/kubi/resources/widget/share/PagerLayoutManager;->fill(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 305
    :cond_5
    :goto_3
    return-void
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
.end method

.method public onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 3
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object p1, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->h:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/kubi/resources/widget/share/PagerLayoutManager$a;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    if-lez v1, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->g:Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    check-cast v1, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;->getPage()I

    .line 41
    move-result v2

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-interface {v0, v2}, Lcom/kubi/resources/widget/share/PagerLayoutManager$a;->a(I)V

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
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
.end method

.method public scrollHorizontallyBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 3
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$Recycler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "recycler"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "state"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget v0, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->d:I

    .line 13
    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    if-lez p1, :cond_1

    .line 17
    .line 18
    :cond_0
    iget v1, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->e:I

    .line 19
    .line 20
    if-lt v0, v1, :cond_2

    .line 21
    .line 22
    if-ltz p1, :cond_2

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_2
    add-int v2, v0, p1

    .line 27
    .line 28
    if-gez v2, :cond_3

    .line 29
    neg-int p1, v0

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_3
    add-int v2, v0, p1

    .line 33
    .line 34
    if-le v2, v1, :cond_4

    .line 35
    .line 36
    sub-int p1, v1, v0

    .line 37
    .line 38
    .line 39
    :cond_4
    :goto_0
    invoke-virtual {p0, p2, p3}, Lcom/kubi/resources/widget/share/PagerLayoutManager;->fill(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 40
    neg-int p3, p1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->offsetChildrenHorizontal(I)V

    .line 44
    .line 45
    iget p3, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->d:I

    .line 46
    add-int/2addr p3, p1

    .line 47
    .line 48
    iput p3, p0, Lcom/kubi/resources/widget/share/PagerLayoutManager;->d:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p2}, Lcom/kubi/resources/widget/share/PagerLayoutManager;->d(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 52
    return p1
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
.end method
