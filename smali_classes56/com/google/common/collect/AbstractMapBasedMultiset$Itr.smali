.class abstract Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;
.super Ljava/lang/Object;
.source "AbstractMapBasedMultiset.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/AbstractMapBasedMultiset;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "Itr"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field entryIndex:I

.field expectedModCount:I

.field final synthetic this$0:Lcom/google/common/collect/AbstractMapBasedMultiset;

.field toRemove:I


# direct methods
.method public constructor <init>(Lcom/google/common/collect/AbstractMapBasedMultiset;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->this$0:Lcom/google/common/collect/AbstractMapBasedMultiset;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iget-object v0, p1, Lcom/google/common/collect/AbstractMapBasedMultiset;->backingMap:Lcom/google/common/collect/ObjectCountHashMap;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/common/collect/ObjectCountHashMap;->firstIndex()I

    .line 11
    move-result v0

    .line 12
    .line 13
    iput v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->entryIndex:I

    .line 14
    const/4 v0, -0x1

    .line 15
    .line 16
    iput v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->toRemove:I

    .line 17
    .line 18
    iget-object p1, p1, Lcom/google/common/collect/AbstractMapBasedMultiset;->backingMap:Lcom/google/common/collect/ObjectCountHashMap;

    .line 19
    .line 20
    iget p1, p1, Lcom/google/common/collect/ObjectCountHashMap;->modCount:I

    .line 21
    .line 22
    iput p1, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->expectedModCount:I

    .line 23
    return-void
    .line 24
.end method

.method private checkForConcurrentModification()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->this$0:Lcom/google/common/collect/AbstractMapBasedMultiset;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/common/collect/AbstractMapBasedMultiset;->backingMap:Lcom/google/common/collect/ObjectCountHashMap;

    .line 5
    .line 6
    iget v0, v0, Lcom/google/common/collect/ObjectCountHashMap;->modCount:I

    .line 7
    .line 8
    iget v1, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->expectedModCount:I

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    return-void

    .line 12
    .line 13
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 17
    throw v0
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
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->checkForConcurrentModification()V

    .line 4
    .line 5
    iget v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->entryIndex:I

    .line 6
    .line 7
    if-ltz v0, :cond_0

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
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation runtime Lcom/google/common/collect/ParametricNullness;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->hasNext()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->entryIndex:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->result(I)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget v1, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->entryIndex:I

    .line 15
    .line 16
    iput v1, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->toRemove:I

    .line 17
    .line 18
    iget-object v2, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->this$0:Lcom/google/common/collect/AbstractMapBasedMultiset;

    .line 19
    .line 20
    iget-object v2, v2, Lcom/google/common/collect/AbstractMapBasedMultiset;->backingMap:Lcom/google/common/collect/ObjectCountHashMap;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Lcom/google/common/collect/ObjectCountHashMap;->nextIndex(I)I

    .line 24
    move-result v1

    .line 25
    .line 26
    iput v1, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->entryIndex:I

    .line 27
    return-object v0

    .line 28
    .line 29
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 33
    throw v0
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
.end method

.method public remove()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->checkForConcurrentModification()V

    .line 4
    .line 5
    iget v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->toRemove:I

    .line 6
    const/4 v1, -0x1

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v0}, Lcom/google/common/collect/CollectPreconditions;->checkRemove(Z)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->this$0:Lcom/google/common/collect/AbstractMapBasedMultiset;

    .line 17
    .line 18
    iget-wide v2, v0, Lcom/google/common/collect/AbstractMapBasedMultiset;->size:J

    .line 19
    .line 20
    iget-object v4, v0, Lcom/google/common/collect/AbstractMapBasedMultiset;->backingMap:Lcom/google/common/collect/ObjectCountHashMap;

    .line 21
    .line 22
    iget v5, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->toRemove:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4, v5}, Lcom/google/common/collect/ObjectCountHashMap;->removeEntry(I)I

    .line 26
    move-result v4

    .line 27
    int-to-long v4, v4

    .line 28
    sub-long/2addr v2, v4

    .line 29
    .line 30
    iput-wide v2, v0, Lcom/google/common/collect/AbstractMapBasedMultiset;->size:J

    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->this$0:Lcom/google/common/collect/AbstractMapBasedMultiset;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/google/common/collect/AbstractMapBasedMultiset;->backingMap:Lcom/google/common/collect/ObjectCountHashMap;

    .line 35
    .line 36
    iget v2, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->entryIndex:I

    .line 37
    .line 38
    iget v3, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->toRemove:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2, v3}, Lcom/google/common/collect/ObjectCountHashMap;->nextIndexAfterRemove(II)I

    .line 42
    move-result v0

    .line 43
    .line 44
    iput v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->entryIndex:I

    .line 45
    .line 46
    iput v1, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->toRemove:I

    .line 47
    .line 48
    iget-object v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->this$0:Lcom/google/common/collect/AbstractMapBasedMultiset;

    .line 49
    .line 50
    iget-object v0, v0, Lcom/google/common/collect/AbstractMapBasedMultiset;->backingMap:Lcom/google/common/collect/ObjectCountHashMap;

    .line 51
    .line 52
    iget v0, v0, Lcom/google/common/collect/ObjectCountHashMap;->modCount:I

    .line 53
    .line 54
    iput v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$Itr;->expectedModCount:I

    .line 55
    return-void
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
.end method

.method public abstract result(I)Ljava/lang/Object;
    .annotation runtime Lcom/google/common/collect/ParametricNullness;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method
