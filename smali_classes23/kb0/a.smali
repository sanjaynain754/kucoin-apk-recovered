.class public Lkb0/a;
.super Ljava/lang/Object;
.source "SimpleBoundaryDecider.java"

# interfaces
.implements Ljb0/j;


# instance fields
.field public a:Landroid/graphics/PointF;

.field public b:Ljb0/j;

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lkb0/a;->c:Z

    .line 7
    return-void
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
.end method


# virtual methods
.method public a(Landroid/view/View;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lkb0/a;->b:Ljb0/j;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljb0/j;->a(Landroid/view/View;)Z

    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lkb0/a;->a:Landroid/graphics/PointF;

    .line 12
    .line 13
    iget-boolean v1, p0, Lkb0/a;->c:Z

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Llb0/b;->a(Landroid/view/View;Landroid/graphics/PointF;Z)Z

    .line 17
    move-result p1

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public b(Landroid/view/View;)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lkb0/a;->b:Ljb0/j;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljb0/j;->b(Landroid/view/View;)Z

    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lkb0/a;->a:Landroid/graphics/PointF;

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Llb0/b;->b(Landroid/view/View;Landroid/graphics/PointF;)Z

    .line 15
    move-result p1

    .line 16
    return p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
