.class public Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;
.super Landroidx/recyclerview/widget/GridLayoutManager;
.source "QuickGridLayoutManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tB\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bB\'\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000c\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ$\u0010\u0014\u001a\u00020\u00152\u000c\u0010\u0016\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00112\u000c\u0010\u0017\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0011H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u0014\u0010\u0010\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;",
        "Landroidx/recyclerview/widget/GridLayoutManager;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "defStyleRes",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "spanCount",
        "(Landroid/content/Context;I)V",
        "orientation",
        "reverseLayout",
        "",
        "(Landroid/content/Context;IIZ)V",
        "adapter",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "fullSpanSizeLookup",
        "Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;",
        "onAdapterChanged",
        "",
        "oldAdapter",
        "newAdapter",
        "setSpanSizeLookup",
        "spanSizeLookup",
        "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;",
        "FullSpanSizeLookup",
        "com.github.CymChad.brvah"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private adapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final fullSpanSizeLookup:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 6
    new-instance p1, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;

    invoke-direct {p1, p0}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;-><init>(Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;)V

    iput-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;->fullSpanSizeLookup:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;

    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanSizeLookup()Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->setOriginalSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 8
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IIZ)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    .line 10
    new-instance p1, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;

    invoke-direct {p1, p0}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;-><init>(Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;)V

    iput-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;->fullSpanSizeLookup:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;

    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanSizeLookup()Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->setOriginalSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 12
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
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
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 2
    new-instance p1, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;

    invoke-direct {p1, p0}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;-><init>(Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;)V

    iput-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;->fullSpanSizeLookup:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanSizeLookup()Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->setOriginalSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 4
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    return-void
.end method

.method public static final synthetic access$getAdapter$p(Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;)Landroidx/recyclerview/widget/RecyclerView$Adapter;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;->adapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

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
.end method


# virtual methods
.method public onAdapterChanged(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$Adapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$Adapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
            "*>;",
            "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
            "*>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p2, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;->adapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

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

.method public setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;->fullSpanSizeLookup:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;->setOriginalSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

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
.end method
