.class public Lcom/horcrux/svg/ImageView$a;
.super Lt5/b;
.source "ImageView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/horcrux/svg/ImageView;->j(Lcom/facebook/imagepipeline/core/ImagePipeline;Lcom/facebook/imagepipeline/request/ImageRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/horcrux/svg/ImageView;


# direct methods
.method public constructor <init>(Lcom/horcrux/svg/ImageView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/ImageView$a;->a:Lcom/horcrux/svg/ImageView;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lt5/b;-><init>()V

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
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/horcrux/svg/ImageView$a;->a:Lcom/horcrux/svg/ImageView;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/horcrux/svg/VirtualView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    new-instance v1, Lcom/horcrux/svg/events/SvgLoadEvent;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/horcrux/svg/ImageView$a;->a:Lcom/horcrux/svg/ImageView;

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 20
    move-result v2

    .line 21
    .line 22
    iget-object v3, p0, Lcom/horcrux/svg/ImageView$a;->a:Lcom/horcrux/svg/ImageView;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 26
    move-result v3

    .line 27
    .line 28
    iget-object v4, p0, Lcom/horcrux/svg/ImageView$a;->a:Lcom/horcrux/svg/ImageView;

    .line 29
    move-object v5, v4

    .line 30
    .line 31
    iget-object v4, v5, Lcom/horcrux/svg/VirtualView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    .line 32
    .line 33
    .line 34
    invoke-static {v5}, Lcom/horcrux/svg/ImageView;->g(Lcom/horcrux/svg/ImageView;)Ljava/lang/String;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 39
    move-result v6

    .line 40
    int-to-float v6, v6

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 44
    move-result p1

    .line 45
    int-to-float v7, p1

    .line 46
    .line 47
    .line 48
    invoke-direct/range {v1 .. v7}, Lcom/horcrux/svg/events/SvgLoadEvent;-><init>(IILcom/facebook/react/bridge/ReactContext;Ljava/lang/String;FF)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 52
    .line 53
    iget-object p1, p0, Lcom/horcrux/svg/ImageView$a;->a:Lcom/horcrux/svg/ImageView;

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lcom/horcrux/svg/ImageView;->f(Lcom/horcrux/svg/ImageView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    move-result-object p1

    .line 58
    const/4 v0, 0x0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 62
    .line 63
    iget-object p1, p0, Lcom/horcrux/svg/ImageView$a;->a:Lcom/horcrux/svg/ImageView;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    if-eqz p1, :cond_0

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/horcrux/svg/SvgView;->invalidate()V

    .line 73
    :cond_0
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public onFailureImpl(Lf4/b;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/horcrux/svg/ImageView$a;->a:Lcom/horcrux/svg/ImageView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/horcrux/svg/ImageView;->f(Lcom/horcrux/svg/ImageView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lf4/b;->c()Ljava/lang/Throwable;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    const-string v0, "RNSVG: fetchDecodedImage failed!"

    .line 17
    .line 18
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "ReactNative"

    .line 21
    .line 22
    .line 23
    invoke-static {v2, p1, v0, v1}, Lx3/a;->L(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    return-void
.end method
