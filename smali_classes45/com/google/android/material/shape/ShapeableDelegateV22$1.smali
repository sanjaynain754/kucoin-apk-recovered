.class Lcom/google/android/material/shape/ShapeableDelegateV22$1;
.super Landroid/view/ViewOutlineProvider;
.source "ShapeableDelegateV22.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/shape/ShapeableDelegateV22;->initMaskOutlineProvider(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/material/shape/ShapeableDelegateV22;


# direct methods
.method public constructor <init>(Lcom/google/android/material/shape/ShapeableDelegateV22;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/material/shape/ShapeableDelegateV22$1;->this$0:Lcom/google/android/material/shape/ShapeableDelegateV22;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 8

    .line 1
    .line 2
    iget-object p1, p0, Lcom/google/android/material/shape/ShapeableDelegateV22$1;->this$0:Lcom/google/android/material/shape/ShapeableDelegateV22;

    .line 3
    .line 4
    iget-object v0, p1, Lcom/google/android/material/shape/ShapeableDelegate;->shapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p1, p1, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/RectF;->isEmpty()Z

    .line 12
    move-result p1

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/material/shape/ShapeableDelegateV22$1;->this$0:Lcom/google/android/material/shape/ShapeableDelegateV22;

    .line 17
    .line 18
    iget-object v0, p1, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 19
    .line 20
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 21
    float-to-int v3, v1

    .line 22
    .line 23
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 24
    float-to-int v4, v1

    .line 25
    .line 26
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 27
    float-to-int v5, v1

    .line 28
    .line 29
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 30
    float-to-int v6, v0

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lcom/google/android/material/shape/ShapeableDelegateV22;->access$000(Lcom/google/android/material/shape/ShapeableDelegateV22;)F

    .line 34
    move-result v7

    .line 35
    move-object v2, p2

    .line 36
    .line 37
    .line 38
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 39
    :cond_0
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
