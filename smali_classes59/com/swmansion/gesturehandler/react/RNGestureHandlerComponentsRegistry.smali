.class public Lcom/swmansion/gesturehandler/react/RNGestureHandlerComponentsRegistry;
.super Ljava/lang/Object;
.source "RNGestureHandlerComponentsRegistry.java"


# annotations
.annotation build Lt6/a;
.end annotation


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Lt6/a;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "fabricjni"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->loadLibrary(Ljava/lang/String;)Z

    .line 6
    .line 7
    const-string v0, "gesturehandler"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->loadLibrary(Ljava/lang/String;)Z

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private constructor <init>(Lcom/facebook/react/fabric/ComponentFactory;)V
    .locals 0
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerComponentsRegistry;->initHybrid(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/jni/HybridData;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/swmansion/gesturehandler/react/RNGestureHandlerComponentsRegistry;->mHybridData:Lcom/facebook/jni/HybridData;

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
.end method

.method private native initHybrid(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/jni/HybridData;
    .annotation build Lt6/a;
    .end annotation
.end method

.method public static register(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerComponentsRegistry;
    .locals 1
    .annotation build Lt6/a;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/gesturehandler/react/RNGestureHandlerComponentsRegistry;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerComponentsRegistry;-><init>(Lcom/facebook/react/fabric/ComponentFactory;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
