.class public Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;
.super Ljava/lang/Object;
.source "ReactInstanceManagerInspectorTarget.java"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;
    }
.end annotation


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/bridge/ReactBridge;->staticInit()V

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
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$1;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$1;-><init>(Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;->initHybrid(Ljava/util/concurrent/Executor;Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;)Lcom/facebook/jni/HybridData;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;->mHybridData:Lcom/facebook/jni/HybridData;

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
.end method

.method private native initHybrid(Ljava/util/concurrent/Executor;Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;)Lcom/facebook/jni/HybridData;
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    .line 6
    return-void
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
.end method

.method public isValid()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

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
    .line 18
.end method

.method public native sendDebuggerResumeCommand()V
.end method
