.class Lcom/facebook/react/uimanager/UIImplementation$1;
.super Ljava/lang/Object;
.source "UIImplementation.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/UIImplementation;->registerRootView(Landroid/view/View;ILcom/facebook/react/uimanager/ThemedReactContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/UIImplementation;

.field final synthetic val$rootCSSNode:Lcom/facebook/react/uimanager/ReactShadowNode;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/UIImplementation;Lcom/facebook/react/uimanager/ReactShadowNode;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/UIImplementation$1;->this$0:Lcom/facebook/react/uimanager/UIImplementation;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/react/uimanager/UIImplementation$1;->val$rootCSSNode:Lcom/facebook/react/uimanager/ReactShadowNode;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIImplementation$1;->this$0:Lcom/facebook/react/uimanager/UIImplementation;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/facebook/react/uimanager/UIImplementation;->mShadowNodeRegistry:Lcom/facebook/react/uimanager/ShadowNodeRegistry;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/react/uimanager/UIImplementation$1;->val$rootCSSNode:Lcom/facebook/react/uimanager/ReactShadowNode;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->addRootNode(Lcom/facebook/react/uimanager/ReactShadowNode;)V

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
.end method
