.class public final Lcom/reactnativepagerview/PagerViewViewManager$a;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "PagerViewViewManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativepagerview/PagerViewViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativepagerview/NestedScrollableHost;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\'\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "com/reactnativepagerview/PagerViewViewManager$a",
        "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;",
        "",
        "position",
        "",
        "positionOffset",
        "positionOffsetPixels",
        "",
        "onPageScrolled",
        "(IFI)V",
        "onPageSelected",
        "(I)V",
        "state",
        "onPageScrollStateChanged",
        "react-native-pager-view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:Lcom/facebook/react/uimanager/ThemedReactContext;

.field public final synthetic c:Lcom/reactnativepagerview/NestedScrollableHost;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/NestedScrollableHost;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/reactnativepagerview/PagerViewViewManager$a;->b:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/reactnativepagerview/PagerViewViewManager$a;->c:Lcom/reactnativepagerview/NestedScrollableHost;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

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
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageScrollStateChanged(I)V

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    const/4 v0, 0x2

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    .line 14
    const-string/jumbo p1, "settling"

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "Unsupported pageScrollState"

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p1

    .line 24
    .line 25
    :cond_1
    const-string p1, "dragging"

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_2
    const-string p1, "idle"

    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager$a;->b:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/reactnativepagerview/PagerViewViewManager$a;->c:Lcom/reactnativepagerview/NestedScrollableHost;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 36
    move-result v1

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    new-instance v1, Lcom/reactnativepagerview/event/PageScrollStateChangedEvent;

    .line 45
    .line 46
    iget-object v2, p0, Lcom/reactnativepagerview/PagerViewViewManager$a;->c:Lcom/reactnativepagerview/NestedScrollableHost;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 50
    move-result v2

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v2, p1}, Lcom/reactnativepagerview/event/PageScrollStateChangedEvent;-><init>(ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 57
    :cond_3
    return-void
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
.end method

.method public onPageScrolled(IFI)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageScrolled(IFI)V

    .line 4
    .line 5
    iget-object p3, p0, Lcom/reactnativepagerview/PagerViewViewManager$a;->b:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager$a;->c:Lcom/reactnativepagerview/NestedScrollableHost;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 11
    move-result v0

    .line 12
    .line 13
    .line 14
    invoke-static {p3, v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 15
    move-result-object p3

    .line 16
    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    new-instance v0, Lcom/reactnativepagerview/event/PageScrollEvent;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/reactnativepagerview/PagerViewViewManager$a;->c:Lcom/reactnativepagerview/NestedScrollableHost;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 25
    move-result v1

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, p1, p2}, Lcom/reactnativepagerview/event/PageScrollEvent;-><init>(IIF)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p3, v0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 32
    :cond_0
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
.end method

.method public onPageSelected(I)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageSelected(I)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager$a;->b:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/reactnativepagerview/PagerViewViewManager$a;->c:Lcom/reactnativepagerview/NestedScrollableHost;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 11
    move-result v1

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v1, Lcom/reactnativepagerview/event/PageSelectedEvent;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/reactnativepagerview/PagerViewViewManager$a;->c:Lcom/reactnativepagerview/NestedScrollableHost;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 25
    move-result v2

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, p1}, Lcom/reactnativepagerview/event/PageSelectedEvent;-><init>(II)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 32
    :cond_0
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
.end method
