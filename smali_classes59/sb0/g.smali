.class public final Lsb0/g;
.super Ljava/lang/Object;
.source "RNViewConfigurationHelper.kt"

# interfaces
.implements Lrb0/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsb0/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lsb0/g;",
        "Lrb0/q;",
        "<init>",
        "()V",
        "Landroid/view/View;",
        "view",
        "Lcom/swmansion/gesturehandler/core/PointerEventsConfig;",
        "c",
        "(Landroid/view/View;)Lcom/swmansion/gesturehandler/core/PointerEventsConfig;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "index",
        "b",
        "(Landroid/view/ViewGroup;I)Landroid/view/View;",
        "",
        "a",
        "(Landroid/view/ViewGroup;)Z",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;)Z
    .locals 4
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "view"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getClipChildren()Z

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    return v1

    .line 15
    .line 16
    :cond_0
    instance-of v0, p1, Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "visible"

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    check-cast p1, Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/ReactScrollView;->getOverflow()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    move-result p1

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    return v1

    .line 36
    :cond_1
    return v3

    .line 37
    .line 38
    :cond_2
    instance-of v0, p1, Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    check-cast p1, Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;->getOverflow()Ljava/lang/String;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    move-result p1

    .line 51
    .line 52
    if-nez p1, :cond_3

    .line 53
    return v1

    .line 54
    :cond_3
    return v3

    .line 55
    .line 56
    :cond_4
    instance-of v0, p1, Lcom/facebook/react/views/view/ReactViewGroup;

    .line 57
    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    check-cast p1, Lcom/facebook/react/views/view/ReactViewGroup;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/facebook/react/views/view/ReactViewGroup;->getOverflow()Ljava/lang/String;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    const-string v0, "hidden"

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    move-result p1

    .line 71
    return p1

    .line 72
    :cond_5
    return v3
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public b(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "parent"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    instance-of v0, p1, Lcom/facebook/react/views/view/ReactViewGroup;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    move-object v0, p1

    .line 12
    .line 13
    check-cast v0, Lcom/facebook/react/views/view/ReactViewGroup;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Lcom/facebook/react/views/view/ReactViewGroup;->getZIndexMappedChildIndex(I)I

    .line 17
    move-result p2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 25
    return-object p1

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    const-string p2, "getChildAt(...)"

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    return-object p1
    .line 36
    .line 37
.end method

.method public c(Landroid/view/View;)Lcom/swmansion/gesturehandler/core/PointerEventsConfig;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "view"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    instance-of v0, p1, Lcom/facebook/react/uimanager/ReactPointerEventsView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    move-object v0, p1

    .line 12
    .line 13
    check-cast v0, Lcom/facebook/react/uimanager/ReactPointerEventsView;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Lcom/facebook/react/uimanager/ReactPointerEventsView;->getPointerEvents()Lcom/facebook/react/uimanager/PointerEvents;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/PointerEvents;->AUTO:Lcom/facebook/react/uimanager/PointerEvents;

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 27
    move-result p1

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    sget-object p1, Lcom/facebook/react/uimanager/PointerEvents;->AUTO:Lcom/facebook/react/uimanager/PointerEvents;

    .line 32
    .line 33
    if-ne v0, p1, :cond_1

    .line 34
    .line 35
    sget-object p1, Lcom/swmansion/gesturehandler/core/PointerEventsConfig;->BOX_NONE:Lcom/swmansion/gesturehandler/core/PointerEventsConfig;

    .line 36
    return-object p1

    .line 37
    .line 38
    :cond_1
    sget-object p1, Lcom/facebook/react/uimanager/PointerEvents;->BOX_ONLY:Lcom/facebook/react/uimanager/PointerEvents;

    .line 39
    .line 40
    if-ne v0, p1, :cond_2

    .line 41
    .line 42
    sget-object p1, Lcom/swmansion/gesturehandler/core/PointerEventsConfig;->NONE:Lcom/swmansion/gesturehandler/core/PointerEventsConfig;

    .line 43
    return-object p1

    .line 44
    .line 45
    :cond_2
    sget-object p1, Lsb0/g$a;->$EnumSwitchMapping$0:[I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 49
    move-result v0

    .line 50
    .line 51
    aget p1, p1, v0

    .line 52
    const/4 v0, 0x1

    .line 53
    .line 54
    if-eq p1, v0, :cond_6

    .line 55
    const/4 v0, 0x2

    .line 56
    .line 57
    if-eq p1, v0, :cond_5

    .line 58
    const/4 v0, 0x3

    .line 59
    .line 60
    if-eq p1, v0, :cond_4

    .line 61
    const/4 v0, 0x4

    .line 62
    .line 63
    if-ne p1, v0, :cond_3

    .line 64
    .line 65
    sget-object p1, Lcom/swmansion/gesturehandler/core/PointerEventsConfig;->AUTO:Lcom/swmansion/gesturehandler/core/PointerEventsConfig;

    .line 66
    return-object p1

    .line 67
    .line 68
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 69
    .line 70
    .line 71
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 72
    throw p1

    .line 73
    .line 74
    :cond_4
    sget-object p1, Lcom/swmansion/gesturehandler/core/PointerEventsConfig;->NONE:Lcom/swmansion/gesturehandler/core/PointerEventsConfig;

    .line 75
    return-object p1

    .line 76
    .line 77
    :cond_5
    sget-object p1, Lcom/swmansion/gesturehandler/core/PointerEventsConfig;->BOX_NONE:Lcom/swmansion/gesturehandler/core/PointerEventsConfig;

    .line 78
    return-object p1

    .line 79
    .line 80
    :cond_6
    sget-object p1, Lcom/swmansion/gesturehandler/core/PointerEventsConfig;->BOX_ONLY:Lcom/swmansion/gesturehandler/core/PointerEventsConfig;

    .line 81
    return-object p1
.end method
