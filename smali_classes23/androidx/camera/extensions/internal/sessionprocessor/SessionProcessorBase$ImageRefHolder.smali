.class Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;
.super Ljava/lang/Object;
.source "SessionProcessorBase.java"

# interfaces
.implements Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ImageRefHolder"
.end annotation


# instance fields
.field private final mImage:Landroid/media/Image;

.field private final mImageLock:Ljava/lang/Object;

.field private mRefCount:I


# direct methods
.method public constructor <init>(Landroid/media/Image;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImageLock:Ljava/lang/Object;

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mRefCount:I

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImage:Landroid/media/Image;

    .line 16
    return-void
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
.method public decrement()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImageLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mRefCount:I

    .line 6
    .line 7
    if-gtz v1, :cond_0

    .line 8
    const/4 v1, 0x0

    .line 9
    monitor-exit v0

    .line 10
    return v1

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v2, 0x1

    .line 14
    sub-int/2addr v1, v2

    .line 15
    .line 16
    iput v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mRefCount:I

    .line 17
    .line 18
    if-gtz v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImage:Landroid/media/Image;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/media/Image;->close()V

    .line 24
    :cond_1
    monitor-exit v0

    .line 25
    return v2

    .line 26
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw v1
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
.end method

.method public get()Landroid/media/Image;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImage:Landroid/media/Image;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public increment()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImageLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mRefCount:I

    .line 6
    .line 7
    if-gtz v1, :cond_0

    .line 8
    const/4 v1, 0x0

    .line 9
    monitor-exit v0

    .line 10
    return v1

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v2, 0x1

    .line 14
    add-int/2addr v1, v2

    .line 15
    .line 16
    iput v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mRefCount:I

    .line 17
    monitor-exit v0

    .line 18
    return v2

    .line 19
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw v1
.end method
