.class Landroidx/camera/core/streamsharing/ResolutionsMerger$CompareAspectRatioByOverlappingAreaToReference;
.super Ljava/lang/Object;
.source "ResolutionsMerger.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/streamsharing/ResolutionsMerger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CompareAspectRatioByOverlappingAreaToReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroid/util/Rational;",
        ">;"
    }
.end annotation


# instance fields
.field private final mReferenceAspectRatio:Landroid/util/Rational;

.field private final mReverse:Z


# direct methods
.method public constructor <init>(Landroid/util/Rational;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/camera/core/streamsharing/ResolutionsMerger$CompareAspectRatioByOverlappingAreaToReference;->mReferenceAspectRatio:Landroid/util/Rational;

    .line 6
    .line 7
    iput-boolean p2, p0, Landroidx/camera/core/streamsharing/ResolutionsMerger$CompareAspectRatioByOverlappingAreaToReference;->mReverse:Z

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public compare(Landroid/util/Rational;Landroid/util/Rational;)I
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/camera/core/streamsharing/ResolutionsMerger$CompareAspectRatioByOverlappingAreaToReference;->mReferenceAspectRatio:Landroid/util/Rational;

    invoke-static {p1, v0}, Landroidx/camera/core/streamsharing/ResolutionsMerger;->access$000(Landroid/util/Rational;Landroid/util/Rational;)F

    move-result p1

    .line 3
    iget-object v0, p0, Landroidx/camera/core/streamsharing/ResolutionsMerger$CompareAspectRatioByOverlappingAreaToReference;->mReferenceAspectRatio:Landroid/util/Rational;

    invoke-static {p2, v0}, Landroidx/camera/core/streamsharing/ResolutionsMerger;->access$000(Landroid/util/Rational;Landroid/util/Rational;)F

    move-result p2

    .line 4
    iget-boolean v0, p0, Landroidx/camera/core/streamsharing/ResolutionsMerger$CompareAspectRatioByOverlappingAreaToReference;->mReverse:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-static {p2, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1

    .line 6
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroid/util/Rational;

    check-cast p2, Landroid/util/Rational;

    invoke-virtual {p0, p1, p2}, Landroidx/camera/core/streamsharing/ResolutionsMerger$CompareAspectRatioByOverlappingAreaToReference;->compare(Landroid/util/Rational;Landroid/util/Rational;)I

    move-result p1

    return p1
.end method
