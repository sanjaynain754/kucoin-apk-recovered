.class public final Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;
.super Ljava/lang/Object;
.source "QuickAdapterHelper.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/chad/library/adapter/base/QuickAdapterHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0014\u0010\u000e\u001a\u00020\u00002\u000c\u0010\u0011\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0008J\u0010\u0010\u0012\u001a\u00020\u00002\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0014\u0010\u0012\u001a\u00020\u00002\u000c\u0010\u0011\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;",
        "",
        "contentAdapter",
        "Lcom/chad/library/adapter/base/BaseQuickAdapter;",
        "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V",
        "config",
        "Landroidx/recyclerview/widget/ConcatAdapter$Config;",
        "leadingLoadStateAdapter",
        "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;",
        "trailingLoadStateAdapter",
        "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;",
        "build",
        "Lcom/chad/library/adapter/base/QuickAdapterHelper;",
        "setConfig",
        "setLeadingLoadStateAdapter",
        "loadListener",
        "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;",
        "loadStateAdapter",
        "setTrailingLoadStateAdapter",
        "loadMoreListener",
        "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;",
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
.field private config:Landroidx/recyclerview/widget/ConcatAdapter$Config;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

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

.field private leadingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private trailingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
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
.method public constructor <init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/BaseQuickAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "contentAdapter"

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
    iput-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;->contentAdapter:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 11
    .line 12
    sget-object p1, Landroidx/recyclerview/widget/ConcatAdapter$Config;->DEFAULT:Landroidx/recyclerview/widget/ConcatAdapter$Config;

    .line 13
    .line 14
    const-string v0, "DEFAULT"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    iput-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;->config:Landroidx/recyclerview/widget/ConcatAdapter$Config;

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public final build()Lcom/chad/library/adapter/base/QuickAdapterHelper;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/chad/library/adapter/base/QuickAdapterHelper;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;->contentAdapter:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;->leadingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;->trailingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;->config:Landroidx/recyclerview/widget/ConcatAdapter$Config;

    .line 11
    const/4 v5, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, Lcom/chad/library/adapter/base/QuickAdapterHelper;-><init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/ConcatAdapter$Config;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
.end method

.method public final setConfig(Landroidx/recyclerview/widget/ConcatAdapter$Config;)Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/ConcatAdapter$Config;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;->config:Landroidx/recyclerview/widget/ConcatAdapter$Config;

    .line 8
    return-object p0
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

.method public final setLeadingLoadStateAdapter(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;)Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter;

    invoke-direct {v0}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->setOnLeadingListener(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;)Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    .line 4
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;->setLeadingLoadStateAdapter(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setLeadingLoadStateAdapter(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "*>;)",
            "Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;->leadingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    return-object p0
.end method

.method public final setTrailingLoadStateAdapter(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;)Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;
    .locals 4
    .param p1    # Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->setOnLoadMoreListener(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;)Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    .line 4
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;->setTrailingLoadStateAdapter(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setTrailingLoadStateAdapter(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
            "*>;)",
            "Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;->trailingLoadStateAdapter:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    return-object p0
.end method
