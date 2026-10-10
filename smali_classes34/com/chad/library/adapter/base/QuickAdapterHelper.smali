.class public final Lcom/chad/library/adapter/base/QuickAdapterHelper;
.super Ljava/lang/Object;
.source "QuickAdapterHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001:\u00014B;\u0008\u0002\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010-\u001a\u00020\u00002\u000e\u0010\u000b\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003J\u001e\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u000e\u0010\u000b\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003J\u0016\u00100\u001a\u00020\u00002\u000e\u0010\u000b\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003J\u001e\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u000e\u0010\u000b\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003J\u0006\u00101\u001a\u00020\u0000J\u0006\u00102\u001a\u00020\u0000J\u0016\u00103\u001a\u00020\u00002\u000e\u0010\u000b\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003R\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u001f\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00030\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00030\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0012R\u0019\u0010\u0002\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u0017\u0010\u0004\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u000e\u0010#\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010$\u001a\"\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00030%j\u0010\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003`&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\'\u001a\"\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00030%j\u0010\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003`&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010(\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008)\u0010\u001e\"\u0004\u0008*\u0010 R\u0017\u0010\u0006\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,\u00a8\u00065"
    }
    d2 = {
        "Lcom/chad/library/adapter/base/QuickAdapterHelper;",
        "",
        "contentAdapter",
        "Lcom/chad/library/adapter/base/BaseQuickAdapter;",
        "leadingLoadStateAdapter",
        "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;",
        "trailingLoadStateAdapter",
        "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;",
        "config",
        "Landroidx/recyclerview/widget/ConcatAdapter$Config;",
        "(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/ConcatAdapter$Config;)V",
        "adapter",
        "Landroidx/recyclerview/widget/ConcatAdapter;",
        "getAdapter",
        "()Landroidx/recyclerview/widget/ConcatAdapter;",
        "afterAdapterList",
        "",
        "getAfterAdapterList",
        "()Ljava/util/List;",
        "beforeAdapterList",
        "getBeforeAdapterList",
        "getContentAdapter",
        "()Lcom/chad/library/adapter/base/BaseQuickAdapter;",
        "firstAdapterOnViewAttachChangeListener",
        "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;",
        "lastAdapterOnViewAttachChangeListener",
        "value",
        "Lcom/chad/library/adapter/base/loadState/LoadState;",
        "leadingLoadState",
        "getLeadingLoadState",
        "()Lcom/chad/library/adapter/base/loadState/LoadState;",
        "setLeadingLoadState",
        "(Lcom/chad/library/adapter/base/loadState/LoadState;)V",
        "getLeadingLoadStateAdapter",
        "()Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;",
        "mAdapter",
        "mAfterList",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "mBeforeList",
        "trailingLoadState",
        "getTrailingLoadState",
        "setTrailingLoadState",
        "getTrailingLoadStateAdapter",
        "()Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;",
        "addAfterAdapter",
        "index",
        "",
        "addBeforeAdapter",
        "clearAfterAdapters",
        "clearBeforeAdapters",
        "removeAdapter",
        "Builder",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQuickAdapterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickAdapterHelper.kt\ncom/chad/library/adapter/base/QuickAdapterHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n1#2:344\n1855#3,2:345\n1855#3,2:347\n*S KotlinDebug\n*F\n+ 1 QuickAdapterHelper.kt\ncom/chad/library/adapter/base/QuickAdapterHelper\n*L\n157#1:345,2\n225#1:347,2\n*E\n"
    }
.end annotation


# instance fields
.field private final contentAdapter:Lcom/chad/library/adapter/base/BaseQuickAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private firstAdapterOnViewAttachChangeListener:Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private lastAdapterOnViewAttachChangeListener:Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final leadingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mAfterList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mBeforeList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final trailingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/ConcatAdapter$Config;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;",
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "*>;",
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
            "*>;",
            "Landroidx/recyclerview/widget/ConcatAdapter$Config;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->contentAdapter:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 4
    iput-object p2, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->leadingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    .line 5
    iput-object p3, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->trailingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    .line 8
    new-instance v0, Landroidx/recyclerview/widget/ConcatAdapter;

    new-array v1, v1, [Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-direct {v0, p4, v1}, Landroidx/recyclerview/widget/ConcatAdapter;-><init>(Landroidx/recyclerview/widget/ConcatAdapter$Config;[Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;

    if-eqz p2, :cond_0

    .line 9
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 10
    new-instance p2, Lcom/chad/library/adapter/base/QuickAdapterHelper$1$1;

    invoke-direct {p2, p0}, Lcom/chad/library/adapter/base/QuickAdapterHelper$1$1;-><init>(Lcom/chad/library/adapter/base/QuickAdapterHelper;)V

    .line 11
    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 12
    iput-object p2, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->firstAdapterOnViewAttachChangeListener:Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;

    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    if-eqz p3, :cond_1

    .line 14
    invoke-virtual {v0, p3}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 15
    new-instance p2, Lcom/chad/library/adapter/base/QuickAdapterHelper$2$1;

    invoke-direct {p2, p0}, Lcom/chad/library/adapter/base/QuickAdapterHelper$2$1;-><init>(Lcom/chad/library/adapter/base/QuickAdapterHelper;)V

    .line 16
    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 17
    iput-object p2, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->lastAdapterOnViewAttachChangeListener:Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;

    :cond_1
    return-void
.end method

.method public synthetic constructor <init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/ConcatAdapter$Config;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/chad/library/adapter/base/QuickAdapterHelper;-><init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/ConcatAdapter$Config;)V

    return-void
.end method


# virtual methods
.method public final addAfterAdapter(ILcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/QuickAdapterHelper;
    .locals 2
    .param p2    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)",
            "Lcom/chad/library/adapter/base/QuickAdapterHelper;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_3

    .line 10
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p1, v0, :cond_3

    .line 11
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 12
    invoke-virtual {p0, p2}, Lcom/chad/library/adapter/base/QuickAdapterHelper;->addAfterAdapter(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/QuickAdapterHelper;

    return-object p0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->trailingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    if-nez v0, :cond_1

    .line 14
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ConcatAdapter;->getAdapters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    sub-int/2addr v0, v1

    add-int/2addr v0, p1

    goto :goto_1

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ConcatAdapter;->getAdapters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    goto :goto_0

    .line 16
    :goto_1
    iget-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {p1, v0, p2}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(ILandroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 17
    iget-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object p0

    .line 18
    :cond_3
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index must be between 0 and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Given:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final addAfterAdapter(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/QuickAdapterHelper;
    .locals 2
    .param p1    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)",
            "Lcom/chad/library/adapter/base/QuickAdapterHelper;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->lastAdapterOnViewAttachChangeListener:Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->contentAdapter:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 5
    :goto_0
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->trailingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    if-nez v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    move-result v0

    goto :goto_1

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ConcatAdapter;->getAdapters()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1, p1}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(ILandroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object p0
.end method

.method public final addBeforeAdapter(ILcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/QuickAdapterHelper;
    .locals 2
    .param p2    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)",
            "Lcom/chad/library/adapter/base/QuickAdapterHelper;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_4

    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p1, v0, :cond_4

    if-nez p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->firstAdapterOnViewAttachChangeListener:Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;

    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->contentAdapter:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 7
    :goto_0
    invoke-virtual {p2, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->leadingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 9
    :goto_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/ConcatAdapter;->addAdapter(ILandroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 10
    iget-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object p0

    .line 11
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index must be between 0 and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Given:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final addBeforeAdapter(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/QuickAdapterHelper;
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)",
            "Lcom/chad/library/adapter/base/QuickAdapterHelper;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/chad/library/adapter/base/QuickAdapterHelper;->addBeforeAdapter(ILcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/QuickAdapterHelper;

    return-object p0
.end method

.method public final clearAfterAdapters()Lcom/chad/library/adapter/base/QuickAdapterHelper;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/ConcatAdapter;->removeAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 24
    .line 25
    iget-object v2, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->lastAdapterOnViewAttachChangeListener:Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 37
    return-object p0
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
.end method

.method public final clearBeforeAdapters()Lcom/chad/library/adapter/base/QuickAdapterHelper;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/ConcatAdapter;->removeAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 24
    .line 25
    iget-object v2, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->firstAdapterOnViewAttachChangeListener:Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 37
    return-object p0
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
.end method

.method public final getAdapter()Landroidx/recyclerview/widget/ConcatAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;

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
.end method

.method public final getAfterAdapterList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    const-string/jumbo v1, "unmodifiableList(mAfterList)"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final getBeforeAdapterList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    const-string/jumbo v1, "unmodifiableList(mBeforeList)"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final getContentAdapter()Lcom/chad/library/adapter/base/BaseQuickAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->contentAdapter:Lcom/chad/library/adapter/base/BaseQuickAdapter;

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
.end method

.method public final getLeadingLoadState()Lcom/chad/library/adapter/base/loadState/LoadState;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->leadingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getLoadState()Lcom/chad/library/adapter/base/loadState/LoadState;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    .line 14
    :cond_1
    :goto_0
    new-instance v0, Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;-><init>(Z)V

    .line 19
    return-object v0
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
.end method

.method public final getLeadingLoadStateAdapter()Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->leadingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

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
.end method

.method public final getTrailingLoadState()Lcom/chad/library/adapter/base/loadState/LoadState;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->trailingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getLoadState()Lcom/chad/library/adapter/base/loadState/LoadState;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    .line 14
    :cond_1
    :goto_0
    new-instance v0, Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;-><init>(Z)V

    .line 19
    return-object v0
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
.end method

.method public final getTrailingLoadStateAdapter()Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->trailingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

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
.end method

.method public final removeAdapter(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/QuickAdapterHelper;
    .locals 2
    .param p1    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)",
            "Lcom/chad/library/adapter/base/QuickAdapterHelper;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "adapter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->contentAdapter:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    goto :goto_1

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAdapter:Landroidx/recyclerview/widget/ConcatAdapter;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ConcatAdapter;->removeAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Z

    .line 20
    .line 21
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 25
    .line 26
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->firstAdapterOnViewAttachChangeListener:Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 37
    .line 38
    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->contentAdapter:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :cond_1
    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mBeforeList:Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    check-cast v1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 62
    .line 63
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->lastAdapterOnViewAttachChangeListener:Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;

    .line 64
    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 69
    .line 70
    iget-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 74
    move-result p1

    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    iget-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->contentAdapter:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 82
    return-object p0

    .line 83
    .line 84
    :cond_3
    iget-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->mAfterList:Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    check-cast p1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addOnViewAttachStateChangeListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;)V

    .line 94
    :cond_4
    :goto_1
    return-object p0
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
.end method

.method public final setLeadingLoadState(Lcom/chad/library/adapter/base/loadState/LoadState;)V
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/loadState/LoadState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "value"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->leadingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->setLoadState(Lcom/chad/library/adapter/base/loadState/LoadState;)V

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setTrailingLoadState(Lcom/chad/library/adapter/base/loadState/LoadState;)V
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/loadState/LoadState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "value"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper;->trailingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->setLoadState(Lcom/chad/library/adapter/base/loadState/LoadState;)V

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
