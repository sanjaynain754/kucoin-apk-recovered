.class final Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;
.super Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;
.source "UIViewOperationQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/UIViewOperationQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "UpdatePropertiesOperation"
.end annotation


# instance fields
.field private final mProps:Lcom/facebook/react/uimanager/ReactStylesDiffMap;

.field final synthetic this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;ILcom/facebook/react/uimanager/ReactStylesDiffMap;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;-><init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;I)V

    .line 4
    iput-object p3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;->mProps:Lcom/facebook/react/uimanager/ReactStylesDiffMap;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;ILcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/k0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;-><init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;ILcom/facebook/react/uimanager/ReactStylesDiffMap;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->d(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$ViewOperation;->mTag:I

    .line 9
    .line 10
    iget-object v2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$UpdatePropertiesOperation;->mProps:Lcom/facebook/react/uimanager/ReactStylesDiffMap;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->updateProperties(ILcom/facebook/react/uimanager/ReactStylesDiffMap;)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
.end method
