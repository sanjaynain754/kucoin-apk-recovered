.class public final Lcom/swmansion/rnscreens/ScreenContainer$layoutCallback$1;
.super Ljava/lang/Object;
.source "ScreenContainer.kt"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/ScreenContainer;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/swmansion/rnscreens/ScreenContainer$layoutCallback$1",
        "Landroid/view/Choreographer$FrameCallback;",
        "doFrame",
        "",
        "frameTimeNanos",
        "",
        "react-native-screens_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/rnscreens/ScreenContainer;


# direct methods
.method public constructor <init>(Lcom/swmansion/rnscreens/ScreenContainer;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/swmansion/rnscreens/ScreenContainer$layoutCallback$1;->this$0:Lcom/swmansion/rnscreens/ScreenContainer;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 24
    .line 25
.end method


# virtual methods
.method public doFrame(J)V
    .locals 3

    .line 1
    .line 2
    iget-object p1, p0, Lcom/swmansion/rnscreens/ScreenContainer$layoutCallback$1;->this$0:Lcom/swmansion/rnscreens/ScreenContainer;

    .line 3
    const/4 p2, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, Lcom/swmansion/rnscreens/ScreenContainer;->access$setLayoutEnqueued$p(Lcom/swmansion/rnscreens/ScreenContainer;Z)V

    .line 7
    .line 8
    iget-object p1, p0, Lcom/swmansion/rnscreens/ScreenContainer$layoutCallback$1;->this$0:Lcom/swmansion/rnscreens/ScreenContainer;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 12
    move-result p2

    .line 13
    .line 14
    const/high16 v0, 0x40000000    # 2.0f

    .line 15
    .line 16
    .line 17
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 18
    move-result p2

    .line 19
    .line 20
    iget-object v1, p0, Lcom/swmansion/rnscreens/ScreenContainer$layoutCallback$1;->this$0:Lcom/swmansion/rnscreens/ScreenContainer;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 28
    move-result v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 32
    .line 33
    iget-object p1, p0, Lcom/swmansion/rnscreens/ScreenContainer$layoutCallback$1;->this$0:Lcom/swmansion/rnscreens/ScreenContainer;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 37
    move-result p2

    .line 38
    .line 39
    iget-object v0, p0, Lcom/swmansion/rnscreens/ScreenContainer$layoutCallback$1;->this$0:Lcom/swmansion/rnscreens/ScreenContainer;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 43
    move-result v0

    .line 44
    .line 45
    iget-object v1, p0, Lcom/swmansion/rnscreens/ScreenContainer$layoutCallback$1;->this$0:Lcom/swmansion/rnscreens/ScreenContainer;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 49
    move-result v1

    .line 50
    .line 51
    iget-object v2, p0, Lcom/swmansion/rnscreens/ScreenContainer$layoutCallback$1;->this$0:Lcom/swmansion/rnscreens/ScreenContainer;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 55
    move-result v2

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 59
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
