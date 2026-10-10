.class final Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;


# direct methods
.method public constructor <init>(Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper$2;->a:Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;

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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
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
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    .line 2
    iget-object p2, p0, Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper$2;->a:Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;->access$300(Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;)Z

    .line 6
    move-result p2

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object p2, p0, Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper$2;->a:Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;->access$400(Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;)Lcom/tencent/liteav/base/util/Size;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    iget p2, p2, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 20
    move-result p3

    .line 21
    .line 22
    if-ne p2, p3, :cond_0

    .line 23
    .line 24
    iget-object p2, p0, Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper$2;->a:Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;->access$400(Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;)Lcom/tencent/liteav/base/util/Size;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    iget p2, p2, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 34
    move-result p1

    .line 35
    .line 36
    if-eq p2, p1, :cond_1

    .line 37
    .line 38
    :cond_0
    iget-object p1, p0, Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper$2;->a:Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;->access$500(Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;)V

    .line 42
    :cond_1
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
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
.end method
