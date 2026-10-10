.class final Lcom/tencent/bugly/common/replay/ScreenshotRecorder$capture$1$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BUGLY"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/common/replay/ScreenshotRecorder$capture$1;->invoke$lambda-1$lambda-0(Lcom/tencent/bugly/common/replay/ScreenshotRecorder;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "node",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
        "invoke",
        "(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $blurscreenshot:Landroid/graphics/Bitmap;

.field final synthetic this$0:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/common/replay/ScreenshotRecorder;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/ScreenshotRecorder$capture$1$1$1$1;->this$0:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/common/replay/ScreenshotRecorder$capture$1$1$1$1;->$blurscreenshot:Landroid/graphics/Bitmap;

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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
.end method


# virtual methods
.method public final invoke(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Ljava/lang/Boolean;
    .locals 5
    .param p1    # Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getShouldMask()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getWidth()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getHeight()I

    move-result v0

    if-lez v0, :cond_4

    .line 3
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getVisibleRect()Landroid/graphics/Rect;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;

    const/high16 v1, -0x1000000

    if-eqz v0, :cond_3

    .line 5
    move-object v0, p1

    check-cast v0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;

    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->getLayout()Lcom/tencent/bugly/common/replay/tool/TextLayout;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lcom/tencent/bugly/common/replay/tool/TextLayout;->getDominantTextColor()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->getDominantColor()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 7
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 8
    :cond_2
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->getLayout()Lcom/tencent/bugly/common/replay/tool/TextLayout;

    move-result-object v2

    .line 9
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getVisibleRect()Landroid/graphics/Rect;

    move-result-object p1

    .line 10
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->getPaddingLeft()I

    move-result v3

    .line 11
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->getPaddingTop()I

    move-result v0

    .line 12
    invoke-static {v2, p1, v3, v0}, Lcom/tencent/bugly/common/replay/tool/ViewsKt;->getVisibleRects(Lcom/tencent/bugly/common/replay/tool/TextLayout;Landroid/graphics/Rect;II)Ljava/util/List;

    move-result-object p1

    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 14
    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    goto :goto_1

    .line 15
    :cond_3
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getVisibleRect()Landroid/graphics/Rect;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 16
    :goto_1
    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 17
    iget-object p1, p0, Lcom/tencent/bugly/common/replay/ScreenshotRecorder$capture$1$1$1$1;->this$0:Lcom/tencent/bugly/common/replay/ScreenshotRecorder;

    iget-object v1, p0, Lcom/tencent/bugly/common/replay/ScreenshotRecorder$capture$1$1$1$1;->$blurscreenshot:Landroid/graphics/Bitmap;

    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    .line 19
    invoke-static {p1}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->access$getScreenshot$p(Lcom/tencent/bugly/common/replay/ScreenshotRecorder;)Landroid/graphics/Bitmap;

    move-result-object v3

    const-string/jumbo v4, "screenshot"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->access$getPrescaledMatrix(Lcom/tencent/bugly/common/replay/ScreenshotRecorder;)Landroid/graphics/Matrix;

    move-result-object v4

    invoke-virtual {p1, v2, v4}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->transformRect(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p1, v3, v1, v2}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder;->copyRectPixels(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Rect;)V

    goto :goto_2

    .line 20
    :cond_4
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/replay/ScreenshotRecorder$capture$1$1$1$1;->invoke(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
