.class public Lio/chad/library/adapter/base/animation/ScaleInAnimation;
.super Ljava/lang/Object;
.source "ScaleInAnimation.java"

# interfaces
.implements Lio/chad/library/adapter/base/animation/BaseAnimation;


# static fields
.field private static final DEFAULT_SCALE_FROM:F = 0.5f


# instance fields
.field private final mFrom:F


# direct methods
.method public constructor <init>()V
    .locals 1

    const/high16 v0, 0x3f000000    # 0.5f

    .line 1
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/animation/ScaleInAnimation;-><init>(F)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lio/chad/library/adapter/base/animation/ScaleInAnimation;->mFrom:F

    return-void
.end method


# virtual methods
.method public getAnimators(Landroid/view/View;)[Landroid/animation/Animator;
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Lio/chad/library/adapter/base/animation/ScaleInAnimation;->mFrom:F

    .line 3
    .line 4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    const/4 v2, 0x2

    .line 6
    .line 7
    new-array v3, v2, [F

    .line 8
    const/4 v4, 0x0

    .line 9
    .line 10
    aput v0, v3, v4

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    aput v1, v3, v0

    .line 14
    .line 15
    const-string v5, "scaleX"

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v5, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    iget v5, p0, Lio/chad/library/adapter/base/animation/ScaleInAnimation;->mFrom:F

    .line 22
    .line 23
    new-array v2, v2, [F

    .line 24
    .line 25
    aput v5, v2, v4

    .line 26
    .line 27
    aput v1, v2, v0

    .line 28
    .line 29
    const-string v0, "scaleY"

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    filled-new-array {v3, p1}, [Landroid/animation/ObjectAnimator;

    .line 37
    move-result-object p1

    .line 38
    return-object p1
    .line 39
.end method
