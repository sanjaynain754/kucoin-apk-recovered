.class final synthetic Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable$withNewBorder$2;
.super Lkotlin/jvm/internal/MutablePropertyReference0Impl;
.source "CompositeBackgroundDrawable.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;->withNewBorder(Lcom/facebook/react/uimanager/drawable/BorderDrawable;)Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 6

    .line 1
    .line 2
    const-string v4, "getBorder()Lcom/facebook/react/uimanager/drawable/BorderDrawable;"

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;

    .line 6
    .line 7
    const-string v3, "border"

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/MutablePropertyReference0Impl;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    return-void
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


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;->getBorder()Lcom/facebook/react/uimanager/drawable/BorderDrawable;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public set(Ljava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;

    .line 5
    .line 6
    check-cast p1, Lcom/facebook/react/uimanager/drawable/BorderDrawable;

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;->access$setBorder$p(Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;Lcom/facebook/react/uimanager/drawable/BorderDrawable;)V

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
.end method
