.class public Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;
.super Ljava/lang/Object;
.source "FabricUIManagerProviderImpl.java"

# interfaces
.implements Lcom/facebook/react/bridge/UIManagerProvider;


# instance fields
.field private final mComponentFactory:Lcom/facebook/react/fabric/ComponentFactory;

.field private final mConfig:Lcom/facebook/react/fabric/ReactNativeConfig;

.field private final mViewManagerRegistry:Lcom/facebook/react/uimanager/ViewManagerRegistry;


# direct methods
.method public constructor <init>(Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/fabric/ReactNativeConfig;Lcom/facebook/react/uimanager/ViewManagerRegistry;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;->mComponentFactory:Lcom/facebook/react/fabric/ComponentFactory;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;->mConfig:Lcom/facebook/react/fabric/ReactNativeConfig;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;->mViewManagerRegistry:Lcom/facebook/react/uimanager/ViewManagerRegistry;

    .line 10
    return-void
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
.end method


# virtual methods
.method public createUIManager(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;
    .locals 10

    .line 1
    .line 2
    const-string v0, "FabricUIManagerProviderImpl.create"

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v2, v0}, Lcom/facebook/systrace/Systrace;->c(JLjava/lang/String;)V

    .line 8
    .line 9
    new-instance v7, Lcom/facebook/react/fabric/events/EventBeatManager;

    .line 10
    .line 11
    .line 12
    invoke-direct {v7}, Lcom/facebook/react/fabric/events/EventBeatManager;-><init>()V

    .line 13
    .line 14
    const-string v0, "FabricUIManagerProviderImpl.createUIManager"

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, v0}, Lcom/facebook/systrace/Systrace;->c(JLjava/lang/String;)V

    .line 18
    .line 19
    new-instance v6, Lcom/facebook/react/fabric/FabricUIManager;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;->mViewManagerRegistry:Lcom/facebook/react/uimanager/ViewManagerRegistry;

    .line 22
    .line 23
    .line 24
    invoke-direct {v6, p1, v0, v7}, Lcom/facebook/react/fabric/FabricUIManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2}, Lcom/facebook/systrace/Systrace;->i(J)V

    .line 28
    .line 29
    const-string v0, "FabricUIManagerProviderImpl.registerBinding"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2, v0}, Lcom/facebook/systrace/Systrace;->c(JLjava/lang/String;)V

    .line 33
    .line 34
    new-instance v3, Lcom/facebook/react/fabric/FabricUIManagerBinding;

    .line 35
    .line 36
    .line 37
    invoke-direct {v3}, Lcom/facebook/react/fabric/FabricUIManagerBinding;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Lcom/facebook/react/bridge/CatalystInstance;->getRuntimeExecutor()Lcom/facebook/react/bridge/RuntimeExecutor;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Lcom/facebook/react/bridge/CatalystInstance;->getRuntimeScheduler()Lcom/facebook/react/bridge/RuntimeScheduler;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    iget-object v8, p0, Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;->mComponentFactory:Lcom/facebook/react/fabric/ComponentFactory;

    .line 56
    .line 57
    iget-object v9, p0, Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;->mConfig:Lcom/facebook/react/fabric/ReactNativeConfig;

    .line 58
    .line 59
    .line 60
    invoke-virtual/range {v3 .. v9}, Lcom/facebook/react/fabric/FabricUIManagerBinding;->register(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/fabric/ReactNativeConfig;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v2}, Lcom/facebook/systrace/Systrace;->i(J)V

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v2}, Lcom/facebook/systrace/Systrace;->i(J)V

    .line 67
    return-object v6

    .line 68
    .line 69
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v0, "Unable to register FabricUIManager with CatalystInstance, runtimeExecutor and runtimeScheduler must not be null"

    .line 72
    .line 73
    .line 74
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    throw p1
    .line 76
    .line 77
    .line 78
.end method
