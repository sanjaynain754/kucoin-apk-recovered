.class public final Lcom/opensource/svgaplayer/SVGAImageView$d;
.super Ljava/lang/Object;
.source "SVGAImageView.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/opensource/svgaplayer/SVGAImageView;->s(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/opensource/svgaplayer/SVGAImageView;

.field public final synthetic c:Lcom/opensource/svgaplayer/SVGAVideoEntity;


# direct methods
.method public constructor <init>(Lcom/opensource/svgaplayer/SVGAImageView;Lcom/opensource/svgaplayer/SVGAVideoEntity;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAImageView$d;->b:Lcom/opensource/svgaplayer/SVGAImageView;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/opensource/svgaplayer/SVGAImageView$d;->c:Lcom/opensource/svgaplayer/SVGAVideoEntity;

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
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView$d;->c:Lcom/opensource/svgaplayer/SVGAVideoEntity;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/opensource/svgaplayer/SVGAImageView$d;->b:Lcom/opensource/svgaplayer/SVGAImageView;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lcom/opensource/svgaplayer/SVGAImageView;->a(Lcom/opensource/svgaplayer/SVGAImageView;)Z

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->x(Z)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView$d;->b:Lcom/opensource/svgaplayer/SVGAImageView;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/opensource/svgaplayer/SVGAImageView$d;->c:Lcom/opensource/svgaplayer/SVGAVideoEntity;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/opensource/svgaplayer/SVGAImageView;->setVideoItem(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView$d;->b:Lcom/opensource/svgaplayer/SVGAImageView;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/opensource/svgaplayer/SVGAImageView;->c(Lcom/opensource/svgaplayer/SVGAImageView;)Lcom/opensource/svgaplayer/d;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Lcom/opensource/svgaplayer/SVGAImageView$d;->b:Lcom/opensource/svgaplayer/SVGAImageView;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    const-string/jumbo v2, "scaleType"

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/opensource/svgaplayer/d;->g(Landroid/widget/ImageView$ScaleType;)V

    .line 42
    .line 43
    :cond_0
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView$d;->b:Lcom/opensource/svgaplayer/SVGAImageView;

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lcom/opensource/svgaplayer/SVGAImageView;->b(Lcom/opensource/svgaplayer/SVGAImageView;)Z

    .line 47
    move-result v0

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView$d;->b:Lcom/opensource/svgaplayer/SVGAImageView;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/opensource/svgaplayer/SVGAImageView;->r()V

    .line 55
    :cond_1
    return-void
    .line 56
    .line 57
.end method
