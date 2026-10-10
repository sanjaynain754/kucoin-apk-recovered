.class Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;
.super Ljava/lang/Object;
.source "Pathfinder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "IntStack"
.end annotation


# static fields
.field private static final MAX_INDEX_STACK_SIZE:I = 0x100


# instance fields
.field private final mStack:[I

.field private mStackSize:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x100

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    iput-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStack:[I

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    iput v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStackSize:I

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public alloc()I
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStackSize:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    iput v1, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStackSize:I

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStack:[I

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    aput v2, v1, v0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public free()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStackSize:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStackSize:I

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 12
    .line 13
    iget v1, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStackSize:I

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    .line 17
    throw v0
.end method

.method public full()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStack:[I

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    iget v1, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStackSize:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public increment(I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStack:[I

    .line 3
    .line 4
    aget v1, v0, p1

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    aput v1, v0, p1

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
.end method

.method public read(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/Pathfinder$IntStack;->mStack:[I

    .line 3
    .line 4
    aget p1, v0, p1

    .line 5
    return p1
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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
