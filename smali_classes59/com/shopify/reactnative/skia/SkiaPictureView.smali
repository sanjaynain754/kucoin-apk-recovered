.class public Lcom/shopify/reactnative/skia/SkiaPictureView;
.super Lcom/shopify/reactnative/skia/SkiaBaseView;
.source "SkiaPictureView.java"


# instance fields
.field private mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Lcom/facebook/jni/annotations/DoNotStrip;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/shopify/reactnative/skia/SkiaBaseView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    .line 6
    .line 7
    const-class v0, Lcom/shopify/reactnative/skia/RNSkiaModule;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Lcom/shopify/reactnative/skia/RNSkiaModule;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/shopify/reactnative/skia/RNSkiaModule;->getSkiaManager()Lcom/shopify/reactnative/skia/SkiaManager;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/shopify/reactnative/skia/SkiaPictureView;->initHybrid(Lcom/shopify/reactnative/skia/SkiaManager;)Lcom/facebook/jni/HybridData;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/shopify/reactnative/skia/SkiaPictureView;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 24
    return-void
    .line 25
.end method

.method private native initHybrid(Lcom/shopify/reactnative/skia/SkiaManager;)Lcom/facebook/jni/HybridData;
.end method


# virtual methods
.method public finalize()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/shopify/reactnative/skia/SkiaPictureView;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public native registerView(I)V
.end method

.method public native setBgColor(I)V
.end method

.method public native setDebugMode(Z)V
.end method

.method public native surfaceAvailable(Ljava/lang/Object;IIZ)V
.end method

.method public native surfaceDestroyed()V
.end method

.method public native surfaceSizeChanged(Ljava/lang/Object;IIZ)V
.end method

.method public native unregisterView()V
.end method
