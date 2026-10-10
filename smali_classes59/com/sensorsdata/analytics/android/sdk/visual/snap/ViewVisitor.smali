.class public abstract Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;
.super Ljava/lang/Object;
.source "ViewVisitor.java"

# interfaces
.implements Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$Accumulator;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "SA.ViewVisitor"


# instance fields
.field private final mPath:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$PathElement;",
            ">;"
        }
    .end annotation
.end field

.field private final mPathfinder:Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$PathElement;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;->mPath:Ljava/util/List;

    .line 6
    .line 7
    new-instance p1, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder;-><init>()V

    .line 11
    .line 12
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;->mPathfinder:Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder;

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
    .line 24
    .line 25
.end method


# virtual methods
.method public abstract cleanup()V
.end method

.method public abstract name()Ljava/lang/String;
.end method

.method public visit(Landroid/view/View;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;->mPathfinder:Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;->mPath:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, v1, p0}, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder;->findTargetsInRoot(Landroid/view/View;Ljava/util/List;Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$Accumulator;)V

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
.end method
