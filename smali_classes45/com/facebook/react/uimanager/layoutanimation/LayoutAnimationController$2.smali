.class Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController$2;
.super Ljava/lang/Object;
.source "LayoutAnimationController.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;->applyLayoutUpdate(Landroid/view/View;IIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;

.field final synthetic val$reactTag:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController$2;->this$0:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;

    .line 3
    .line 4
    iput p2, p0, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController$2;->val$reactTag:I

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
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController$2;->this$0:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;->a(Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;)Landroid/util/SparseArray;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    iget v0, p0, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController$2;->val$reactTag:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 12
    return-void
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

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController$2;->this$0:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;->a(Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;)Landroid/util/SparseArray;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v1, p0, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController$2;->val$reactTag:I

    .line 9
    .line 10
    check-cast p1, Lcom/facebook/react/uimanager/layoutanimation/LayoutHandlingAnimation;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 14
    return-void
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
