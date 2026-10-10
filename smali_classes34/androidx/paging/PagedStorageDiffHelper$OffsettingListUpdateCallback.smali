.class Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;
.super Ljava/lang/Object;
.source "PagedStorageDiffHelper.java"

# interfaces
.implements Landroidx/recyclerview/widget/ListUpdateCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/PagedStorageDiffHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OffsettingListUpdateCallback"
.end annotation


# instance fields
.field private final mCallback:Landroidx/recyclerview/widget/ListUpdateCallback;

.field private final mOffset:I


# direct methods
.method public constructor <init>(ILandroidx/recyclerview/widget/ListUpdateCallback;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;->mOffset:I

    .line 6
    .line 7
    iput-object p2, p0, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;->mCallback:Landroidx/recyclerview/widget/ListUpdateCallback;

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
.end method


# virtual methods
.method public onChanged(IILjava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;->mCallback:Landroidx/recyclerview/widget/ListUpdateCallback;

    .line 3
    .line 4
    iget v1, p0, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;->mOffset:I

    .line 5
    add-int/2addr p1, v1

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1, p2, p3}, Landroidx/recyclerview/widget/ListUpdateCallback;->onChanged(IILjava/lang/Object;)V

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
.end method

.method public onInserted(II)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;->mCallback:Landroidx/recyclerview/widget/ListUpdateCallback;

    .line 3
    .line 4
    iget v1, p0, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;->mOffset:I

    .line 5
    add-int/2addr p1, v1

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Landroidx/recyclerview/widget/ListUpdateCallback;->onInserted(II)V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public onMoved(II)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;->mCallback:Landroidx/recyclerview/widget/ListUpdateCallback;

    .line 3
    .line 4
    iget v1, p0, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;->mOffset:I

    .line 5
    add-int/2addr p1, v1

    .line 6
    add-int/2addr p2, v1

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Landroidx/recyclerview/widget/ListUpdateCallback;->onMoved(II)V

    .line 10
    return-void
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
.end method

.method public onRemoved(II)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;->mCallback:Landroidx/recyclerview/widget/ListUpdateCallback;

    .line 3
    .line 4
    iget v1, p0, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;->mOffset:I

    .line 5
    add-int/2addr p1, v1

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Landroidx/recyclerview/widget/ListUpdateCallback;->onRemoved(II)V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method
