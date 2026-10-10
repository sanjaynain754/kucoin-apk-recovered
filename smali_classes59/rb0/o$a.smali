.class public Lrb0/o$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "ScaleGestureDetector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrb0/o;->l(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lrb0/o;


# direct methods
.method public constructor <init>(Lrb0/o;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lrb0/o$a;->b:Lrb0/o;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

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
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lrb0/o$a;->b:Lrb0/o;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lrb0/o;->b(Lrb0/o;F)V

    .line 10
    .line 11
    iget-object v0, p0, Lrb0/o$a;->b:Lrb0/o;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 15
    move-result p1

    .line 16
    .line 17
    .line 18
    invoke-static {v0, p1}, Lrb0/o;->c(Lrb0/o;F)V

    .line 19
    .line 20
    iget-object p1, p0, Lrb0/o$a;->b:Lrb0/o;

    .line 21
    const/4 v0, 0x1

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0}, Lrb0/o;->a(Lrb0/o;I)V

    .line 25
    return v0
.end method
