.class public final Lcom/reactnativepagerview/PagerViewViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "PagerViewViewManager.kt"

# interfaces
.implements Lcom/facebook/react/viewmanagers/RNCViewPagerManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "RNCViewPager"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativepagerview/PagerViewViewManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/reactnativepagerview/NestedScrollableHost;",
        ">;",
        "Lcom/facebook/react/viewmanagers/RNCViewPagerManagerInterface<",
        "Lcom/reactnativepagerview/NestedScrollableHost;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 72\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u00017B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u0014J\u0008\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0018\u0010 \u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0008\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\"H\u0017J\u001c\u0010%\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0008\u0010$\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010&\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\u0019H\u0017J\u001c\u0010\'\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0008\u0010$\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010(\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\u0019H\u0017J\u001a\u0010)\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\u0019H\u0017J\u001c\u0010*\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0008\u0010$\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010+\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\"H\u0017J\u001c\u0010,\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0008\u0010$\u001a\u0004\u0018\u00010\nH\u0017J \u0010-\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\"J\u001a\u00100\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010.\u001a\u00020\u0019H\u0016J\u001a\u00101\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010.\u001a\u00020\u0019H\u0016J\u001a\u00102\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u00103\u001a\u00020\"H\u0016J \u00104\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0605H\u0016R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"
    }
    d2 = {
        "Lcom/reactnativepagerview/PagerViewViewManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/reactnativepagerview/NestedScrollableHost;",
        "Lcom/facebook/react/viewmanagers/RNCViewPagerManagerInterface;",
        "<init>",
        "()V",
        "mDelegate",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "getDelegate",
        "getName",
        "",
        "receiveCommand",
        "",
        "root",
        "commandId",
        "args",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "createViewInstance",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "addView",
        "host",
        "child",
        "Landroid/view/View;",
        "index",
        "",
        "getChildCount",
        "parent",
        "getChildAt",
        "removeView",
        "view",
        "removeAllViews",
        "removeViewAt",
        "needsCustomLayoutForChildren",
        "",
        "setScrollEnabled",
        "value",
        "setLayoutDirection",
        "setInitialPage",
        "setOrientation",
        "setOffscreenPageLimit",
        "setPageMargin",
        "setOverScrollMode",
        "setOverdrag",
        "setKeyboardDismissMode",
        "goTo",
        "selectedPage",
        "scrollWithAnimation",
        "setPage",
        "setPageWithoutAnimation",
        "setScrollEnabledImperatively",
        "scrollEnabled",
        "getExportedCustomDirectEventTypeConstants",
        "",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/reactnativepagerview/PagerViewViewManager$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/reactnativepagerview/NestedScrollableHost;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/reactnativepagerview/PagerViewViewManager$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/reactnativepagerview/PagerViewViewManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/reactnativepagerview/PagerViewViewManager;->Companion:Lcom/reactnativepagerview/PagerViewViewManager$Companion;

    .line 9
    .line 10
    sget-object v0, Lga0/a;->a:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->loadLibrary(Ljava/lang/String;)Z

    .line 16
    :cond_0
    return-void
    .line 17
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/viewmanagers/RNCViewPagerManagerDelegate;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/facebook/react/viewmanagers/RNCViewPagerManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager;->mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic a(Landroidx/viewpager2/widget/ViewPager2;Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/NestedScrollableHost;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->createViewInstance$lambda$0(Landroidx/viewpager2/widget/ViewPager2;Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/NestedScrollableHost;)V

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

.method private static final createViewInstance$lambda$0(Landroidx/viewpager2/widget/ViewPager2;Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/NestedScrollableHost;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/reactnativepagerview/PagerViewViewManager$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager$a;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/NestedScrollableHost;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 12
    move-result v0

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance v0, Lcom/reactnativepagerview/event/PageSelectedEvent;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 24
    move-result p2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 28
    move-result p0

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p2, p0}, Lcom/reactnativepagerview/event/PageSelectedEvent;-><init>(II)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 35
    :cond_0
    return-void
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


# virtual methods
.method public bridge synthetic addView(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2, p3}, Lcom/reactnativepagerview/PagerViewViewManager;->addView(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;I)V

    return-void
.end method

.method public bridge synthetic addView(Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2, p3}, Lcom/reactnativepagerview/PagerViewViewManager;->addView(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;I)V

    return-void
.end method

.method public addView(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;I)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2, p3}, Lga0/g;->d(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;I)V

    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/reactnativepagerview/PagerViewViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativepagerview/NestedScrollableHost;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativepagerview/NestedScrollableHost;
    .locals 4
    .param p1    # Lcom/facebook/react/uimanager/ThemedReactContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-direct {v0, p1}, Lcom/reactnativepagerview/NestedScrollableHost;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 4
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 6
    new-instance v2, Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {v2, p1}, Landroidx/viewpager2/widget/ViewPager2;-><init>(Landroid/content/Context;)V

    .line 7
    new-instance v3, Lcom/reactnativepagerview/a;

    invoke-direct {v3}, Lcom/reactnativepagerview/a;-><init>()V

    invoke-virtual {v2, v3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 8
    invoke-virtual {v2, v1}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 9
    new-instance v1, Lga0/c;

    invoke-direct {v1, v2, p1, v0}, Lga0/c;-><init>(Landroidx/viewpager2/widget/ViewPager2;Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/NestedScrollableHost;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 10
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public bridge synthetic getChildAt(Landroid/view/View;I)Landroid/view/View;
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->getChildAt(Lcom/reactnativepagerview/NestedScrollableHost;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChildAt(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->getChildAt(Lcom/reactnativepagerview/NestedScrollableHost;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildAt(Lcom/reactnativepagerview/NestedScrollableHost;I)Landroid/view/View;
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2}, Lga0/g;->e(Lcom/reactnativepagerview/NestedScrollableHost;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChildCount(Landroid/view/View;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1}, Lcom/reactnativepagerview/PagerViewViewManager;->getChildCount(Lcom/reactnativepagerview/NestedScrollableHost;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getChildCount(Landroid/view/ViewGroup;)I
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1}, Lcom/reactnativepagerview/PagerViewViewManager;->getChildCount(Lcom/reactnativepagerview/NestedScrollableHost;)I

    move-result p1

    return p1
.end method

.method public getChildCount(Lcom/reactnativepagerview/NestedScrollableHost;)I
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1}, Lga0/g;->f(Lcom/reactnativepagerview/NestedScrollableHost;)I

    move-result p1

    return p1
.end method

.method public getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/reactnativepagerview/NestedScrollableHost;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager;->mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

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
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onPageScroll"

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "registrationName"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v0}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    .line 13
    const-string/jumbo v0, "onPageScrollStateChanged"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 17
    move-result-object v5

    .line 18
    .line 19
    .line 20
    const-string/jumbo v0, "onPageSelected"

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 24
    move-result-object v7

    .line 25
    .line 26
    .line 27
    const-string/jumbo v2, "topPageScroll"

    .line 28
    .line 29
    .line 30
    const-string/jumbo v4, "topPageScrollStateChanged"

    .line 31
    .line 32
    .line 33
    const-string/jumbo v6, "topPageSelected"

    .line 34
    .line 35
    .line 36
    invoke-static/range {v2 .. v7}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    const-string/jumbo v1, "of(...)"

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    return-object v0
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

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "RNCViewPager"

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
.end method

.method public final goTo(Lcom/reactnativepagerview/NestedScrollableHost;IZ)V
    .locals 3
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    sget-object v0, Lga0/g;->a:Lga0/g;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lga0/g;->g(Lcom/reactnativepagerview/NestedScrollableHost;)Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    .line 22
    move-result v1

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v1, 0x0

    .line 29
    .line 30
    :goto_0
    if-eqz v1, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 34
    move-result v2

    .line 35
    .line 36
    if-lez v2, :cond_2

    .line 37
    .line 38
    if-ltz p2, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 42
    move-result v1

    .line 43
    .line 44
    if-ge p2, v1, :cond_2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1, p2, p3}, Lga0/g;->n(Landroidx/viewpager2/widget/ViewPager2;IZ)V

    .line 48
    :cond_2
    return-void
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

.method public needsCustomLayoutForChildren()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lga0/g;->a:Lga0/g;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lga0/g;->h()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public bridge synthetic receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2, p3}, Lcom/reactnativepagerview/PagerViewViewManager;->receiveCommand(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public receiveCommand(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/react/bridge/ReadableArray;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string/jumbo v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager;->mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/ViewManagerDelegate;->receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1}, Lcom/reactnativepagerview/PagerViewViewManager;->removeAllViews(Lcom/reactnativepagerview/NestedScrollableHost;)V

    return-void
.end method

.method public removeAllViews(Lcom/reactnativepagerview/NestedScrollableHost;)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1}, Lga0/g;->k(Lcom/reactnativepagerview/NestedScrollableHost;)V

    return-void
.end method

.method public bridge synthetic removeView(Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->removeView(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;)V

    return-void
.end method

.method public removeView(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2}, Lga0/g;->l(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->removeViewAt(Lcom/reactnativepagerview/NestedScrollableHost;I)V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/ViewGroup;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->removeViewAt(Lcom/reactnativepagerview/NestedScrollableHost;I)V

    return-void
.end method

.method public removeViewAt(Lcom/reactnativepagerview/NestedScrollableHost;I)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2}, Lga0/g;->m(Lcom/reactnativepagerview/NestedScrollableHost;I)V

    return-void
.end method

.method public bridge synthetic setInitialPage(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setInitialPage(Lcom/reactnativepagerview/NestedScrollableHost;I)V

    return-void
.end method

.method public setInitialPage(Lcom/reactnativepagerview/NestedScrollableHost;I)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = 0x0
        name = "initialPage"
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2}, Lga0/g;->o(Lcom/reactnativepagerview/NestedScrollableHost;I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setKeyboardDismissMode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setKeyboardDismissMode(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V

    return-void
.end method

.method public setKeyboardDismissMode(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V
    .locals 0
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "keyboardDismissMode"
    .end annotation

    .line 1
    return-void
.end method

.method public bridge synthetic setLayoutDirection(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setLayoutDirection(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V

    return-void
.end method

.method public setLayoutDirection(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "layoutDirection"
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 2
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2}, Lga0/g;->q(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setOffscreenPageLimit(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setOffscreenPageLimit(Lcom/reactnativepagerview/NestedScrollableHost;I)V

    return-void
.end method

.method public setOffscreenPageLimit(Lcom/reactnativepagerview/NestedScrollableHost;I)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = -0x1
        name = "offscreenPageLimit"
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2}, Lga0/g;->r(Lcom/reactnativepagerview/NestedScrollableHost;I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setOrientation(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setOrientation(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V

    return-void
.end method

.method public setOrientation(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "orientation"
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 2
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2}, Lga0/g;->s(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setOverScrollMode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setOverScrollMode(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V

    return-void
.end method

.method public setOverScrollMode(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "overScrollMode"
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 2
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2}, Lga0/g;->t(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setOverdrag(Landroid/view/View;Z)V
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setOverdrag(Lcom/reactnativepagerview/NestedScrollableHost;Z)V

    return-void
.end method

.method public setOverdrag(Lcom/reactnativepagerview/NestedScrollableHost;Z)V
    .locals 0
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "overdrag"
    .end annotation

    .line 1
    return-void
.end method

.method public bridge synthetic setPage(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setPage(Lcom/reactnativepagerview/NestedScrollableHost;I)V

    return-void
.end method

.method public setPage(Lcom/reactnativepagerview/NestedScrollableHost;I)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/reactnativepagerview/PagerViewViewManager;->goTo(Lcom/reactnativepagerview/NestedScrollableHost;IZ)V

    return-void
.end method

.method public bridge synthetic setPageMargin(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setPageMargin(Lcom/reactnativepagerview/NestedScrollableHost;I)V

    return-void
.end method

.method public setPageMargin(Lcom/reactnativepagerview/NestedScrollableHost;I)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = 0x0
        name = "pageMargin"
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2}, Lga0/g;->u(Lcom/reactnativepagerview/NestedScrollableHost;I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setPageWithoutAnimation(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setPageWithoutAnimation(Lcom/reactnativepagerview/NestedScrollableHost;I)V

    return-void
.end method

.method public setPageWithoutAnimation(Lcom/reactnativepagerview/NestedScrollableHost;I)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/reactnativepagerview/PagerViewViewManager;->goTo(Lcom/reactnativepagerview/NestedScrollableHost;IZ)V

    return-void
.end method

.method public bridge synthetic setScrollEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setScrollEnabled(Lcom/reactnativepagerview/NestedScrollableHost;Z)V

    return-void
.end method

.method public setScrollEnabled(Lcom/reactnativepagerview/NestedScrollableHost;Z)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultBoolean = true
        name = "scrollEnabled"
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2}, Lga0/g;->w(Lcom/reactnativepagerview/NestedScrollableHost;Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setScrollEnabledImperatively(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/NestedScrollableHost;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setScrollEnabledImperatively(Lcom/reactnativepagerview/NestedScrollableHost;Z)V

    return-void
.end method

.method public setScrollEnabledImperatively(Lcom/reactnativepagerview/NestedScrollableHost;Z)V
    .locals 1
    .param p1    # Lcom/reactnativepagerview/NestedScrollableHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lga0/g;->a:Lga0/g;

    invoke-virtual {v0, p1, p2}, Lga0/g;->w(Lcom/reactnativepagerview/NestedScrollableHost;Z)V

    :cond_0
    return-void
.end method
