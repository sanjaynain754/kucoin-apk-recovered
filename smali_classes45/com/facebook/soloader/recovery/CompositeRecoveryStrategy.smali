.class public Lcom/facebook/soloader/recovery/CompositeRecoveryStrategy;
.super Ljava/lang/Object;
.source "CompositeRecoveryStrategy.java"

# interfaces
.implements Lcom/facebook/soloader/recovery/RecoveryStrategy;


# instance fields
.field private mCurrentStrategy:I

.field private final mStrategies:[Lcom/facebook/soloader/recovery/RecoveryStrategy;


# direct methods
.method public varargs constructor <init>([Lcom/facebook/soloader/recovery/RecoveryStrategy;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/soloader/recovery/CompositeRecoveryStrategy;->mStrategies:[Lcom/facebook/soloader/recovery/RecoveryStrategy;

    .line 6
    const/4 p1, 0x0

    .line 7
    .line 8
    iput p1, p0, Lcom/facebook/soloader/recovery/CompositeRecoveryStrategy;->mCurrentStrategy:I

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
.end method


# virtual methods
.method public recover(Ljava/lang/UnsatisfiedLinkError;[Lcom/facebook/soloader/SoSource;)Z
    .locals 3

    .line 1
    .line 2
    :cond_0
    iget v0, p0, Lcom/facebook/soloader/recovery/CompositeRecoveryStrategy;->mCurrentStrategy:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/facebook/soloader/recovery/CompositeRecoveryStrategy;->mStrategies:[Lcom/facebook/soloader/recovery/RecoveryStrategy;

    .line 5
    array-length v2, v1

    .line 6
    .line 7
    if-ge v0, v2, :cond_1

    .line 8
    .line 9
    add-int/lit8 v2, v0, 0x1

    .line 10
    .line 11
    iput v2, p0, Lcom/facebook/soloader/recovery/CompositeRecoveryStrategy;->mCurrentStrategy:I

    .line 12
    .line 13
    aget-object v0, v1, v0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1, p2}, Lcom/facebook/soloader/recovery/RecoveryStrategy;->recover(Ljava/lang/UnsatisfiedLinkError;[Lcom/facebook/soloader/SoSource;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
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
