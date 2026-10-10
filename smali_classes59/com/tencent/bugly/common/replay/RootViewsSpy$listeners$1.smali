.class public final Lcom/tencent/bugly/common/replay/RootViewsSpy$listeners$1;
.super Ljava/util/concurrent/CopyOnWriteArrayList;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/common/replay/RootViewsSpy;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/CopyOnWriteArrayList<",
        "Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/tencent/bugly/common/replay/RootViewsSpy$listeners$1",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;",
        "add",
        "",
        "element",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/bugly/common/replay/RootViewsSpy;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/common/replay/RootViewsSpy;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/RootViewsSpy$listeners$1;->this$0:Lcom/tencent/bugly/common/replay/RootViewsSpy;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

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
.end method


# virtual methods
.method public add(Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;)Z
    .locals 4
    .param p1    # Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/RootViewsSpy$listeners$1;->this$0:Lcom/tencent/bugly/common/replay/RootViewsSpy;

    invoke-static {v0}, Lcom/tencent/bugly/common/replay/RootViewsSpy;->access$getViewListLock$p(Lcom/tencent/bugly/common/replay/RootViewsSpy;)Lcom/tencent/bugly/proguard/u0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u0;->a()Lcom/tencent/bugly/proguard/i8;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/common/replay/RootViewsSpy$listeners$1;->this$0:Lcom/tencent/bugly/common/replay/RootViewsSpy;

    .line 3
    :try_start_0
    invoke-static {v1}, Lcom/tencent/bugly/common/replay/RootViewsSpy;->access$getDelegatingViewList$p(Lcom/tencent/bugly/common/replay/RootViewsSpy;)Ljava/util/ArrayList;

    move-result-object v1

    .line 4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v3, 0x1

    .line 5
    invoke-interface {p1, v2, v3}, Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;->onRootViewsChanged(Landroid/view/View;Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 6
    :cond_1
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    .line 7
    invoke-static {v0, v1}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 8
    invoke-super {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 9
    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/replay/RootViewsSpy$listeners$1;->add(Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;)Z

    move-result p1

    return p1
.end method

.method public bridge contains(Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 2
    :cond_0
    instance-of v0, p1, Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/replay/RootViewsSpy$listeners$1;->contains(Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;)Z

    move-result p1

    return p1
.end method

.method public bridge getSize()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

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
.end method

.method public bridge indexOf(Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 2
    :cond_0
    instance-of v0, p1, Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    check-cast p1, Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/replay/RootViewsSpy$listeners$1;->indexOf(Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;)I

    move-result p1

    return p1
.end method

.method public bridge lastIndexOf(Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 2
    :cond_0
    instance-of v0, p1, Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    check-cast p1, Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/replay/RootViewsSpy$listeners$1;->lastIndexOf(Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;)I

    move-result p1

    return p1
.end method

.method public final bridge remove(I)Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/replay/RootViewsSpy$listeners$1;->removeAt(I)Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;

    move-result-object p1

    return-object p1
.end method

.method public bridge remove(Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;)Z
    .locals 0

    .line 2
    invoke-super {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 3
    :cond_0
    instance-of v0, p1, Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/replay/RootViewsSpy$listeners$1;->remove(Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;)Z

    move-result p1

    return p1
.end method

.method public bridge removeAt(I)Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(I)Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    check-cast p1, Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;

    .line 7
    return-object p1
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
.end method

.method public final bridge size()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/common/replay/RootViewsSpy$listeners$1;->getSize()I

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
.end method
