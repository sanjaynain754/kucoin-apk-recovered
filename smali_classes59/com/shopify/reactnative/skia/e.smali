.class public Lcom/shopify/reactnative/skia/e;
.super Lcom/facebook/react/TurboReactPackage;
.source "RNSkiaPackage.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/TurboReactPackage;-><init>()V

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
.method public createNativeModules(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/NativeModule;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/shopify/reactnative/skia/RNSkiaModule;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/shopify/reactnative/skia/RNSkiaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 6
    const/4 p1, 0x1

    .line 7
    .line 8
    new-array p1, p1, [Lcom/facebook/react/bridge/NativeModule;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    aput-object v0, p1, v1

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance p1, Lcom/shopify/reactnative/skia/SkiaPictureViewManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {p1}, Lcom/shopify/reactnative/skia/SkiaPictureViewManager;-><init>()V

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    new-array v0, v0, [Lcom/facebook/react/uimanager/ViewManager;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    aput-object p1, v0, v1

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "RNSkiaModule"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    move-result p1

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    new-instance p1, Lcom/shopify/reactnative/skia/RNSkiaModule;

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, p2}, Lcom/shopify/reactnative/skia/RNSkiaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 19
    return-object p1
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

.method public getReactModuleInfoProvider()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/shopify/reactnative/skia/e$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/shopify/reactnative/skia/e$a;-><init>(Lcom/shopify/reactnative/skia/e;)V

    .line 6
    return-object v0
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
