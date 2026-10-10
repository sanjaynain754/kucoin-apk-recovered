.class Lcom/reactnativecommunity/blurview/BlurViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "BlurViewManager.java"

# interfaces
.implements Lcom/facebook/react/viewmanagers/AndroidBlurViewManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "AndroidBlurView"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Leightbitlab/com/blurview/BlurView;",
        ">;",
        "Lcom/facebook/react/viewmanagers/AndroidBlurViewManagerInterface<",
        "Leightbitlab/com/blurview/BlurView;",
        ">;"
    }
.end annotation


# instance fields
.field private final mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Leightbitlab/com/blurview/BlurView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    .line 4
    .line 5
    new-instance p1, Lcom/facebook/react/viewmanagers/AndroidBlurViewManagerDelegate;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1, p0}, Lcom/facebook/react/viewmanagers/AndroidBlurViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/reactnativecommunity/blurview/BlurViewManager;->mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    .line 11
    return-void
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
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0
    .param p1    # Lcom/facebook/react/uimanager/ThemedReactContext;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/reactnativecommunity/blurview/BlurViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Leightbitlab/com/blurview/BlurView;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Leightbitlab/com/blurview/BlurView;
    .locals 0
    .param p1    # Lcom/facebook/react/uimanager/ThemedReactContext;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    invoke-static {p1}, Lcom/reactnativecommunity/blurview/a;->a(Lcom/facebook/react/uimanager/ThemedReactContext;)Leightbitlab/com/blurview/BlurView;

    move-result-object p1

    return-object p1
.end method

.method public getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Leightbitlab/com/blurview/BlurView;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/blurview/BlurViewManager;->mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

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

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "AndroidBlurView"

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

.method public bridge synthetic setAutoUpdate(Landroid/view/View;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultBoolean = true
        name = "autoUpdate"
    .end annotation

    .line 1
    check-cast p1, Leightbitlab/com/blurview/BlurView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/blurview/BlurViewManager;->setAutoUpdate(Leightbitlab/com/blurview/BlurView;Z)V

    return-void
.end method

.method public setAutoUpdate(Leightbitlab/com/blurview/BlurView;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultBoolean = true
        name = "autoUpdate"
    .end annotation

    .line 2
    invoke-static {p1, p2}, Lcom/reactnativecommunity/blurview/a;->b(Leightbitlab/com/blurview/BlurView;Z)V

    return-void
.end method

.method public bridge synthetic setBlurAmount(Landroid/view/View;I)V
    .locals 0

    .line 2
    check-cast p1, Leightbitlab/com/blurview/BlurView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/blurview/BlurViewManager;->setBlurAmount(Leightbitlab/com/blurview/BlurView;I)V

    return-void
.end method

.method public setBlurAmount(Leightbitlab/com/blurview/BlurView;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic setBlurRadius(Landroid/view/View;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = 0xa
        name = "blurRadius"
    .end annotation

    .line 1
    check-cast p1, Leightbitlab/com/blurview/BlurView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/blurview/BlurViewManager;->setBlurRadius(Leightbitlab/com/blurview/BlurView;I)V

    return-void
.end method

.method public setBlurRadius(Leightbitlab/com/blurview/BlurView;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = 0xa
        name = "blurRadius"
    .end annotation

    .line 2
    invoke-static {p1, p2}, Lcom/reactnativecommunity/blurview/a;->e(Leightbitlab/com/blurview/BlurView;I)V

    return-void
.end method

.method public bridge synthetic setBlurType(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    check-cast p1, Leightbitlab/com/blurview/BlurView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/blurview/BlurViewManager;->setBlurType(Leightbitlab/com/blurview/BlurView;Ljava/lang/String;)V

    return-void
.end method

.method public setBlurType(Leightbitlab/com/blurview/BlurView;Ljava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    return-void
.end method

.method public bridge synthetic setDownsampleFactor(Landroid/view/View;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = 0xa
        name = "downsampleFactor"
    .end annotation

    .line 2
    check-cast p1, Leightbitlab/com/blurview/BlurView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/blurview/BlurViewManager;->setDownsampleFactor(Leightbitlab/com/blurview/BlurView;I)V

    return-void
.end method

.method public setDownsampleFactor(Leightbitlab/com/blurview/BlurView;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = 0xa
        name = "downsampleFactor"
    .end annotation

    .line 1
    return-void
.end method

.method public bridge synthetic setEnabled(Landroid/view/View;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultBoolean = true
        name = "enabled"
    .end annotation

    .line 1
    check-cast p1, Leightbitlab/com/blurview/BlurView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/blurview/BlurViewManager;->setEnabled(Leightbitlab/com/blurview/BlurView;Z)V

    return-void
.end method

.method public setEnabled(Leightbitlab/com/blurview/BlurView;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultBoolean = true
        name = "enabled"
    .end annotation

    .line 2
    invoke-static {p1, p2}, Lcom/reactnativecommunity/blurview/a;->c(Leightbitlab/com/blurview/BlurView;Z)V

    return-void
.end method

.method public bridge synthetic setOverlayColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "overlayColor"
    .end annotation

    .line 1
    check-cast p1, Leightbitlab/com/blurview/BlurView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/blurview/BlurViewManager;->setOverlayColor(Leightbitlab/com/blurview/BlurView;Ljava/lang/Integer;)V

    return-void
.end method

.method public setOverlayColor(Leightbitlab/com/blurview/BlurView;Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "overlayColor"
    .end annotation

    .line 2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lcom/reactnativecommunity/blurview/a;->d(Leightbitlab/com/blurview/BlurView;I)V

    return-void
.end method
