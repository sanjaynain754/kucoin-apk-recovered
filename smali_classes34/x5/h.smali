.class public Lx5/h;
.super Lx5/b;
.source "DefaultCloseableStaticBitmap.java"


# direct methods
.method public constructor <init>(La4/a;Lx5/n;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lx5/n;",
            "II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lx5/b;-><init>(La4/a;Lx5/n;II)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;La4/h;Lx5/n;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "La4/h<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lx5/n;",
            "II)V"
        }
    .end annotation

    .line 2
    invoke-direct/range {p0 .. p5}, Lx5/b;-><init>(Landroid/graphics/Bitmap;La4/h;Lx5/n;II)V

    return-void
.end method


# virtual methods
.method public finalize()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lx5/b;->isClosed()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 19
    move-result v1

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const-string v1, "DefaultCloseableStaticBitmap"

    .line 30
    .line 31
    const-string v2, "finalize: %s %x still open."

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2, v0}, Lx3/a;->K(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :try_start_0
    invoke-virtual {p0}, Lx5/b;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    .line 44
    .line 45
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 46
    throw v0
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
.end method
