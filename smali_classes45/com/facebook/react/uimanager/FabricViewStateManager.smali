.class public Lcom/facebook/react/uimanager/FabricViewStateManager;
.super Ljava/lang/Object;
.source "FabricViewStateManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;,
        Lcom/facebook/react/uimanager/FabricViewStateManager$HasFabricViewStateManager;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
    forRemoval = true
    since = "Deprecated class since v0.73.0, please use com.facebook.react.uimanager.StateWrapper instead."
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FabricViewStateManager"


# instance fields
.field private mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    .line 7
    return-void
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

.method private setState(Lcom/facebook/react/uimanager/StateWrapper;Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;I)V
    .locals 1
    .param p1    # Lcom/facebook/react/uimanager/StateWrapper;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 1
    const-string p1, "FabricViewStateManager"

    const-string/jumbo p2, "setState called without a StateWrapper"

    invoke-static {p1, p2}, Lx3/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x3c

    if-le p3, v0, :cond_2

    goto :goto_0

    .line 3
    :cond_2
    invoke-interface {p2}, Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;->getStateUpdate()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    if-nez p2, :cond_3

    :goto_0
    return-void

    .line 4
    :cond_3
    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/StateWrapper;->updateState(Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method


# virtual methods
.method public getStateData()Lcom/facebook/react/bridge/ReadableMap;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/facebook/react/uimanager/StateWrapper;->getStateData()Lcom/facebook/react/bridge/ReadableNativeMap;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public hasStateWrapper()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public setState(Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/facebook/react/uimanager/FabricViewStateManager;->setState(Lcom/facebook/react/uimanager/StateWrapper;Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;I)V

    return-void
.end method

.method public setStateWrapper(Lcom/facebook/react/uimanager/StateWrapper;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

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
.end method
