.class public Lcom/shopify/reactnative/skia/RNSkiaModule;
.super Lcom/shopify/reactnative/skia/NativeSkiaModuleSpec;
.source "RNSkiaModule.java"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "RNSkiaModule"
.end annotation


# static fields
.field public static final NAME:Ljava/lang/String; = "RNSkiaModule"


# instance fields
.field private skiaManager:Lcom/shopify/reactnative/skia/SkiaManager;

.field private final weakReactContext:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/shopify/reactnative/skia/NativeSkiaModuleSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/shopify/reactnative/skia/RNSkiaModule;->weakReactContext:Ljava/lang/ref/WeakReference;

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
.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "RNSkiaModule"

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

.method public getSkiaManager()Lcom/shopify/reactnative/skia/SkiaManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/shopify/reactnative/skia/RNSkiaModule;->skiaManager:Lcom/shopify/reactnative/skia/SkiaManager;

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

.method public install()Z
    .locals 5
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    .line 1
    .line 2
    const-string v0, "RNSkiaModule"

    .line 3
    .line 4
    iget-object v1, p0, Lcom/shopify/reactnative/skia/RNSkiaModule;->skiaManager:Lcom/shopify/reactnative/skia/SkiaManager;

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    return v2

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    :try_start_0
    const-string/jumbo v3, "rnskia"

    .line 13
    .line 14
    .line 15
    invoke-static {v3}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v3, p0, Lcom/shopify/reactnative/skia/RNSkiaModule;->weakReactContext:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    check-cast v3, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    const-string v2, "React Application Context was null!"

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    return v1

    .line 32
    :catch_0
    move-exception v2

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    new-instance v4, Lcom/shopify/reactnative/skia/SkiaManager;

    .line 36
    .line 37
    .line 38
    invoke-direct {v4, v3}, Lcom/shopify/reactnative/skia/SkiaManager;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 39
    .line 40
    iput-object v4, p0, Lcom/shopify/reactnative/skia/RNSkiaModule;->skiaManager:Lcom/shopify/reactnative/skia/SkiaManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return v2

    .line 42
    .line 43
    :goto_0
    const-string v3, "Failed to initialize Skia Manager!"

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 47
    return v1
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

.method public invalidate()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->invalidate()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/shopify/reactnative/skia/RNSkiaModule;->skiaManager:Lcom/shopify/reactnative/skia/SkiaManager;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/shopify/reactnative/skia/SkiaManager;->invalidate()V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/shopify/reactnative/skia/RNSkiaModule;->skiaManager:Lcom/shopify/reactnative/skia/SkiaManager;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/shopify/reactnative/skia/SkiaManager;->a()V

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    iput-object v0, p0, Lcom/shopify/reactnative/skia/RNSkiaModule;->skiaManager:Lcom/shopify/reactnative/skia/SkiaManager;

    .line 19
    :cond_0
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
