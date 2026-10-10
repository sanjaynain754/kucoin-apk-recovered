.class public final Lcom/swmansion/rnscreens/SearchBarView;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "SearchBarView.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;,
        Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u00020\u0001:\u0002[\\B\u0011\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010?\u001a\u00020@J\u0008\u0010A\u001a\u00020@H\u0002J\u0008\u0010B\u001a\u00020@H\u0014J\u0010\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020EH\u0002J\u0012\u0010F\u001a\u00020@2\u0008\u0010G\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020)H\u0002J\u0008\u0010J\u001a\u00020@H\u0002J\u0008\u0010K\u001a\u00020@H\u0002J\u0012\u0010L\u001a\u00020@2\u0008\u0010G\u001a\u0004\u0018\u00010#H\u0002J\u0014\u0010M\u001a\u00020@2\n\u0010N\u001a\u0006\u0012\u0002\u0008\u00030OH\u0002J\u0006\u0010P\u001a\u00020@J\u0006\u0010Q\u001a\u00020@J\u0006\u0010R\u001a\u00020@J\u000e\u0010S\u001a\u00020@2\u0006\u0010T\u001a\u00020)J\u0010\u0010U\u001a\u00020@2\u0008\u0010V\u001a\u0004\u0018\u00010#J\u0006\u0010W\u001a\u00020@J\u0010\u0010X\u001a\u00020@2\u0006\u0010Y\u001a\u00020\u0013H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\u0008\u001a\u0010\u0015\"\u0004\u0008\u001b\u0010\u0017R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\u0008\u001d\u0010\u0015\"\u0004\u0008\u001e\u0010\u0017R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\u0008 \u0010\u0015\"\u0004\u0008!\u0010\u0017R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\u001a\u0010.\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u0010+\"\u0004\u00080\u0010-R\u001a\u00101\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00082\u0010+\"\u0004\u00083\u0010-R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u00107\u001a\u0004\u0018\u0001088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010:R\u0016\u0010;\u001a\u0004\u0018\u00010<8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>R\u000e\u0010Z\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006]"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/SearchBarView;",
        "Lcom/facebook/react/views/view/ReactViewGroup;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactContext;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactContext;)V",
        "inputType",
        "Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;",
        "getInputType",
        "()Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;",
        "setInputType",
        "(Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;)V",
        "autoCapitalize",
        "Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;",
        "getAutoCapitalize",
        "()Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;",
        "setAutoCapitalize",
        "(Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;)V",
        "textColor",
        "",
        "getTextColor",
        "()Ljava/lang/Integer;",
        "setTextColor",
        "(Ljava/lang/Integer;)V",
        "Ljava/lang/Integer;",
        "tintColor",
        "getTintColor",
        "setTintColor",
        "headerIconColor",
        "getHeaderIconColor",
        "setHeaderIconColor",
        "hintTextColor",
        "getHintTextColor",
        "setHintTextColor",
        "placeholder",
        "",
        "getPlaceholder",
        "()Ljava/lang/String;",
        "setPlaceholder",
        "(Ljava/lang/String;)V",
        "shouldOverrideBackButton",
        "",
        "getShouldOverrideBackButton",
        "()Z",
        "setShouldOverrideBackButton",
        "(Z)V",
        "autoFocus",
        "getAutoFocus",
        "setAutoFocus",
        "shouldShowHintSearchIcon",
        "getShouldShowHintSearchIcon",
        "setShouldShowHintSearchIcon",
        "searchViewFormatter",
        "Lcom/swmansion/rnscreens/SearchViewFormatter;",
        "areListenersSet",
        "headerConfig",
        "Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;",
        "getHeaderConfig",
        "()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;",
        "screenStackFragment",
        "Lcom/swmansion/rnscreens/ScreenStackFragment;",
        "getScreenStackFragment",
        "()Lcom/swmansion/rnscreens/ScreenStackFragment;",
        "onUpdate",
        "",
        "setSearchViewProps",
        "onAttachedToWindow",
        "setSearchViewListeners",
        "searchView",
        "Landroidx/appcompat/widget/SearchView;",
        "handleTextChange",
        "newText",
        "handleFocusChange",
        "hasFocus",
        "handleClose",
        "handleOpen",
        "handleTextSubmit",
        "sendEvent",
        "event",
        "Lcom/facebook/react/uimanager/events/Event;",
        "handleClearTextJsRequest",
        "handleFocusJsRequest",
        "handleBlurJsRequest",
        "handleToggleCancelButtonJsRequest",
        "flag",
        "handleSetTextJsRequest",
        "text",
        "handleCancelSearchJsRequest",
        "setToolbarElementsVisibility",
        "visibility",
        "surfaceId",
        "SearchBarAutoCapitalize",
        "SearchBarInputTypes",
        "react-native-screens_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSearchBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBarView.kt\ncom/swmansion/rnscreens/SearchBarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"
    }
.end annotation


# instance fields
.field private areListenersSet:Z

.field private autoCapitalize:Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private autoFocus:Z

.field private headerIconColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private hintTextColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private inputType:Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private placeholder:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private searchViewFormatter:Lcom/swmansion/rnscreens/SearchViewFormatter;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private shouldOverrideBackButton:Z

.field private shouldShowHintSearchIcon:Z

.field private final surfaceId:I

.field private textColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tintColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0
    .param p1    # Lcom/facebook/react/bridge/ReactContext;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    sget-object p1, Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;->TEXT:Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->inputType:Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;

    .line 8
    .line 9
    sget-object p1, Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;->NONE:Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->autoCapitalize:Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;

    .line 12
    .line 13
    const-string p1, ""

    .line 14
    .line 15
    iput-object p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->placeholder:Ljava/lang/String;

    .line 16
    const/4 p1, 0x1

    .line 17
    .line 18
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->shouldOverrideBackButton:Z

    .line 19
    .line 20
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->shouldShowHintSearchIcon:Z

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 24
    move-result p1

    .line 25
    .line 26
    iput p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->surfaceId:I

    .line 27
    return-void
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
.end method

.method public static final synthetic access$handleTextChange(Lcom/swmansion/rnscreens/SearchBarView;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/SearchBarView;->handleTextChange(Ljava/lang/String;)V

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
.end method

.method public static final synthetic access$handleTextSubmit(Lcom/swmansion/rnscreens/SearchBarView;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/SearchBarView;->handleTextSubmit(Ljava/lang/String;)V

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
.end method

.method public static synthetic f(Lcom/swmansion/rnscreens/SearchBarView;Lcom/swmansion/rnscreens/CustomSearchView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/SearchBarView;->onAttachedToWindow$lambda$0(Lcom/swmansion/rnscreens/SearchBarView;Lcom/swmansion/rnscreens/CustomSearchView;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic g(Lcom/swmansion/rnscreens/SearchBarView;Landroid/view/View;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarView;->setSearchViewListeners$lambda$1(Lcom/swmansion/rnscreens/SearchBarView;Landroid/view/View;Z)V

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

.method private final getHeaderConfig()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v1, v0, Lcom/swmansion/rnscreens/ScreenStackHeaderSubview;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lcom/swmansion/rnscreens/ScreenStackHeaderSubview;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/ScreenStackHeaderSubview;->getConfig()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;

    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method private final getScreenStackFragment()Lcom/swmansion/rnscreens/ScreenStackFragment;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->getHeaderConfig()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;->getScreenFragment()Lcom/swmansion/rnscreens/ScreenStackFragment;

    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic h(Lcom/swmansion/rnscreens/SearchBarView;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/swmansion/rnscreens/SearchBarView;->setSearchViewListeners$lambda$2(Lcom/swmansion/rnscreens/SearchBarView;)Z

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
.end method

.method private final handleClose()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/rnscreens/events/SearchBarCloseEvent;

    .line 3
    .line 4
    iget v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->surfaceId:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    move-result v2

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/events/SearchBarCloseEvent;-><init>(II)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/SearchBarView;->sendEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/SearchBarView;->setToolbarElementsVisibility(I)V

    .line 19
    return-void
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
.end method

.method private final handleFocusChange(Z)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    new-instance p1, Lcom/swmansion/rnscreens/events/SearchBarFocusEvent;

    .line 5
    .line 6
    iget v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->surfaceId:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 10
    move-result v1

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, v0, v1}, Lcom/swmansion/rnscreens/events/SearchBarFocusEvent;-><init>(II)V

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    new-instance p1, Lcom/swmansion/rnscreens/events/SearchBarBlurEvent;

    .line 17
    .line 18
    iget v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->surfaceId:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 22
    move-result v1

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v0, v1}, Lcom/swmansion/rnscreens/events/SearchBarBlurEvent;-><init>(II)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/SearchBarView;->sendEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 29
    return-void
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
.end method

.method private final handleOpen()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/rnscreens/events/SearchBarOpenEvent;

    .line 3
    .line 4
    iget v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->surfaceId:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    move-result v2

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/events/SearchBarOpenEvent;-><init>(II)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/SearchBarView;->sendEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/SearchBarView;->setToolbarElementsVisibility(I)V

    .line 20
    return-void
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
.end method

.method private final handleTextChange(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/rnscreens/events/SearchBarChangeTextEvent;

    .line 3
    .line 4
    iget v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->surfaceId:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    move-result v2

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p1}, Lcom/swmansion/rnscreens/events/SearchBarChangeTextEvent;-><init>(IILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/SearchBarView;->sendEvent(Lcom/facebook/react/uimanager/events/Event;)V

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
    .line 24
    .line 25
.end method

.method private final handleTextSubmit(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/rnscreens/events/SearchBarSearchButtonPressEvent;

    .line 3
    .line 4
    iget v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->surfaceId:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    move-result v2

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p1}, Lcom/swmansion/rnscreens/events/SearchBarSearchButtonPressEvent;-><init>(IILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/SearchBarView;->sendEvent(Lcom/facebook/react/uimanager/events/Event;)V

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
    .line 24
    .line 25
.end method

.method public static synthetic i(Lcom/swmansion/rnscreens/SearchBarView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/SearchBarView;->setSearchViewListeners$lambda$3(Lcom/swmansion/rnscreens/SearchBarView;Landroid/view/View;)V

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
.end method

.method private static final onAttachedToWindow$lambda$0(Lcom/swmansion/rnscreens/SearchBarView;Lcom/swmansion/rnscreens/CustomSearchView;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "newSearchView"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->searchViewFormatter:Lcom/swmansion/rnscreens/SearchViewFormatter;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/swmansion/rnscreens/SearchViewFormatter;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/SearchViewFormatter;-><init>(Landroidx/appcompat/widget/SearchView;)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->searchViewFormatter:Lcom/swmansion/rnscreens/SearchViewFormatter;

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->setSearchViewProps()V

    .line 21
    .line 22
    iget-boolean p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->autoFocus:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->getScreenStackFragment()Lcom/swmansion/rnscreens/ScreenStackFragment;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/ScreenStackFragment;->getSearchView()Lcom/swmansion/rnscreens/CustomSearchView;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/CustomSearchView;->focus()V

    .line 40
    .line 41
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 42
    return-object p0
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
.end method

.method private final sendEvent(Lcom/facebook/react/uimanager/events/Event;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/events/Event<",
            "*>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 16
    move-result v1

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 26
    :cond_0
    return-void
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
.end method

.method private final setSearchViewListeners(Landroidx/appcompat/widget/SearchView;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/rnscreens/SearchBarView$setSearchViewListeners$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/SearchBarView$setSearchViewListeners$1;-><init>(Lcom/swmansion/rnscreens/SearchBarView;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$OnQueryTextListener;)V

    .line 9
    .line 10
    new-instance v0, Lcom/swmansion/rnscreens/d0;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/d0;-><init>(Lcom/swmansion/rnscreens/SearchBarView;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 17
    .line 18
    new-instance v0, Lcom/swmansion/rnscreens/e0;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/e0;-><init>(Lcom/swmansion/rnscreens/SearchBarView;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnCloseListener(Landroidx/appcompat/widget/SearchView$OnCloseListener;)V

    .line 25
    .line 26
    new-instance v0, Lcom/swmansion/rnscreens/f0;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/f0;-><init>(Lcom/swmansion/rnscreens/SearchBarView;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnSearchClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    return-void
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

.method private static final setSearchViewListeners$lambda$1(Lcom/swmansion/rnscreens/SearchBarView;Landroid/view/View;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/swmansion/rnscreens/SearchBarView;->handleFocusChange(Z)V

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

.method private static final setSearchViewListeners$lambda$2(Lcom/swmansion/rnscreens/SearchBarView;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->handleClose()V

    .line 4
    const/4 p0, 0x0

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
.end method

.method private static final setSearchViewListeners$lambda$3(Lcom/swmansion/rnscreens/SearchBarView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->handleOpen()V

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
.end method

.method private final setSearchViewProps()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->getScreenStackFragment()Lcom/swmansion/rnscreens/ScreenStackFragment;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/ScreenStackFragment;->getSearchView()Lcom/swmansion/rnscreens/CustomSearchView;

    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    :goto_0
    if-eqz v0, :cond_7

    .line 15
    .line 16
    iget-boolean v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->areListenersSet:Z

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/SearchBarView;->setSearchViewListeners(Landroidx/appcompat/widget/SearchView;)V

    .line 22
    const/4 v1, 0x1

    .line 23
    .line 24
    iput-boolean v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->areListenersSet:Z

    .line 25
    .line 26
    :cond_1
    iget-object v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->inputType:Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/swmansion/rnscreens/SearchBarView;->autoCapitalize:Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;->toAndroidInputType(Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;)I

    .line 32
    move-result v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setInputType(I)V

    .line 36
    .line 37
    iget-object v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->searchViewFormatter:Lcom/swmansion/rnscreens/SearchViewFormatter;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    iget-object v2, p0, Lcom/swmansion/rnscreens/SearchBarView;->textColor:Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/SearchViewFormatter;->setTextColor(Ljava/lang/Integer;)V

    .line 45
    .line 46
    :cond_2
    iget-object v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->searchViewFormatter:Lcom/swmansion/rnscreens/SearchViewFormatter;

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    iget-object v2, p0, Lcom/swmansion/rnscreens/SearchBarView;->tintColor:Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/SearchViewFormatter;->setTintColor(Ljava/lang/Integer;)V

    .line 54
    .line 55
    :cond_3
    iget-object v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->searchViewFormatter:Lcom/swmansion/rnscreens/SearchViewFormatter;

    .line 56
    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    iget-object v2, p0, Lcom/swmansion/rnscreens/SearchBarView;->headerIconColor:Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/SearchViewFormatter;->setHeaderIconColor(Ljava/lang/Integer;)V

    .line 63
    .line 64
    :cond_4
    iget-object v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->searchViewFormatter:Lcom/swmansion/rnscreens/SearchViewFormatter;

    .line 65
    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    iget-object v2, p0, Lcom/swmansion/rnscreens/SearchBarView;->hintTextColor:Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/SearchViewFormatter;->setHintTextColor(Ljava/lang/Integer;)V

    .line 72
    .line 73
    :cond_5
    iget-object v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->searchViewFormatter:Lcom/swmansion/rnscreens/SearchViewFormatter;

    .line 74
    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    iget-object v2, p0, Lcom/swmansion/rnscreens/SearchBarView;->placeholder:Ljava/lang/String;

    .line 78
    .line 79
    iget-boolean v3, p0, Lcom/swmansion/rnscreens/SearchBarView;->shouldShowHintSearchIcon:Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2, v3}, Lcom/swmansion/rnscreens/SearchViewFormatter;->setPlaceholder(Ljava/lang/String;Z)V

    .line 83
    .line 84
    :cond_6
    iget-boolean v1, p0, Lcom/swmansion/rnscreens/SearchBarView;->shouldOverrideBackButton:Z

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/CustomSearchView;->setOverrideBackAction(Z)V

    .line 88
    :cond_7
    return-void
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
.end method

.method private final setToolbarElementsVisibility(I)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->getHeaderConfig()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;->getConfigSubviewsCount()I

    .line 11
    move-result v0

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    .line 17
    :goto_0
    if-ltz v0, :cond_4

    .line 18
    .line 19
    .line 20
    :goto_1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->getHeaderConfig()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;

    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;->getConfigSubview(I)Lcom/swmansion/rnscreens/ScreenStackHeaderSubview;

    .line 28
    move-result-object v2

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    move-object v2, v3

    .line 31
    .line 32
    :goto_2
    if-eqz v2, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/ScreenStackHeaderSubview;->getType()Lcom/swmansion/rnscreens/ScreenStackHeaderSubview$Type;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    :cond_2
    sget-object v4, Lcom/swmansion/rnscreens/ScreenStackHeaderSubview$Type;->SEARCH_BAR:Lcom/swmansion/rnscreens/ScreenStackHeaderSubview$Type;

    .line 39
    .line 40
    if-eq v3, v4, :cond_3

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    :cond_3
    if-eq v1, v0, :cond_4

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    return-void
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


# virtual methods
.method public final getAutoCapitalize()Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->autoCapitalize:Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;

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

.method public final getAutoFocus()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->autoFocus:Z

    .line 3
    return v0
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

.method public final getHeaderIconColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->headerIconColor:Ljava/lang/Integer;

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

.method public final getHintTextColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->hintTextColor:Ljava/lang/Integer;

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

.method public final getInputType()Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->inputType:Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;

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

.method public final getPlaceholder()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->placeholder:Ljava/lang/String;

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

.method public final getShouldOverrideBackButton()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->shouldOverrideBackButton:Z

    .line 3
    return v0
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

.method public final getShouldShowHintSearchIcon()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->shouldShowHintSearchIcon:Z

    .line 3
    return v0
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

.method public final getTextColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->textColor:Ljava/lang/Integer;

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

.method public final getTintColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/rnscreens/SearchBarView;->tintColor:Ljava/lang/Integer;

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

.method public final handleBlurJsRequest()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->getScreenStackFragment()Lcom/swmansion/rnscreens/ScreenStackFragment;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/ScreenStackFragment;->getSearchView()Lcom/swmansion/rnscreens/CustomSearchView;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    .line 16
    :cond_0
    return-void
    .line 17
.end method

.method public final handleCancelSearchJsRequest()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->getScreenStackFragment()Lcom/swmansion/rnscreens/ScreenStackFragment;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/ScreenStackFragment;->getSearchView()Lcom/swmansion/rnscreens/CustomSearchView;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/CustomSearchView;->cancelSearch()V

    .line 16
    :cond_0
    return-void
    .line 17
.end method

.method public final handleClearTextJsRequest()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->getScreenStackFragment()Lcom/swmansion/rnscreens/ScreenStackFragment;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/ScreenStackFragment;->getSearchView()Lcom/swmansion/rnscreens/CustomSearchView;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/CustomSearchView;->clearText()V

    .line 16
    :cond_0
    return-void
    .line 17
.end method

.method public final handleFocusJsRequest()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->getScreenStackFragment()Lcom/swmansion/rnscreens/ScreenStackFragment;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/ScreenStackFragment;->getSearchView()Lcom/swmansion/rnscreens/CustomSearchView;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/CustomSearchView;->focus()V

    .line 16
    :cond_0
    return-void
    .line 17
.end method

.method public final handleSetTextJsRequest(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->getScreenStackFragment()Lcom/swmansion/rnscreens/ScreenStackFragment;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/ScreenStackFragment;->getSearchView()Lcom/swmansion/rnscreens/CustomSearchView;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/swmansion/rnscreens/CustomSearchView;->setText(Ljava/lang/String;)V

    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final handleToggleCancelButtonJsRequest(Z)V
    .locals 0

    .line 1
    return-void
    .line 2
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
.end method

.method public onAttachedToWindow()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->getScreenStackFragment()Lcom/swmansion/rnscreens/ScreenStackFragment;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lcom/swmansion/rnscreens/c0;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p0}, Lcom/swmansion/rnscreens/c0;-><init>(Lcom/swmansion/rnscreens/SearchBarView;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/ScreenStackFragment;->setOnSearchViewCreate(Lkotlin/jvm/functions/Function1;)V

    .line 18
    :cond_0
    return-void
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
.end method

.method public final onUpdate()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/SearchBarView;->setSearchViewProps()V

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

.method public final setAutoCapitalize(Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;)V
    .locals 1
    .param p1    # Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->autoCapitalize:Lcom/swmansion/rnscreens/SearchBarView$SearchBarAutoCapitalize;

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
.end method

.method public final setAutoFocus(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->autoFocus:Z

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
.end method

.method public final setHeaderIconColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->headerIconColor:Ljava/lang/Integer;

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
.end method

.method public final setHintTextColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->hintTextColor:Ljava/lang/Integer;

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
.end method

.method public final setInputType(Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;)V
    .locals 1
    .param p1    # Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->inputType:Lcom/swmansion/rnscreens/SearchBarView$SearchBarInputTypes;

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
.end method

.method public final setPlaceholder(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->placeholder:Ljava/lang/String;

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
.end method

.method public final setShouldOverrideBackButton(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->shouldOverrideBackButton:Z

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
.end method

.method public final setShouldShowHintSearchIcon(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->shouldShowHintSearchIcon:Z

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
.end method

.method public final setTextColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->textColor:Ljava/lang/Integer;

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
.end method

.method public final setTintColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/swmansion/rnscreens/SearchBarView;->tintColor:Ljava/lang/Integer;

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
.end method
