.class public final Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;
.super Ljava/lang/Object;
.source "LinearCountingRetryPolicy.kt"

# interfaces
.implements Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\u0003H\u0016J\u0008\u0010\n\u001a\u00020\u0001H\u0016J\u0008\u0010\u000b\u001a\u00020\u0001H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;",
        "Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;",
        "retryAttempts",
        "",
        "delayBetweenAttemptsInMs",
        "<init>",
        "(II)V",
        "canRetry",
        "",
        "getDelay",
        "update",
        "copy",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final delayBetweenAttemptsInMs:I

.field private final retryAttempts:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->retryAttempts:I

    .line 6
    .line 7
    iput p2, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->delayBetweenAttemptsInMs:I

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
.method public canRetry()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->retryAttempts:I

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
.end method

.method public copy()Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;

    .line 3
    .line 4
    iget v1, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->retryAttempts:I

    .line 5
    .line 6
    iget v2, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->delayBetweenAttemptsInMs:I

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;-><init>(II)V

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getDelay()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->delayBetweenAttemptsInMs:I

    .line 3
    return v0
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
.end method

.method public update()Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->retryAttempts:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;

    .line 9
    .line 10
    iget v2, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->delayBetweenAttemptsInMs:I

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v0, v2}, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;-><init>(II)V

    .line 14
    return-object v1

    .line 15
    .line 16
    :cond_0
    sget-object v0, Lcom/facebook/react/jstasks/NoRetryPolicy;->INSTANCE:Lcom/facebook/react/jstasks/NoRetryPolicy;

    .line 17
    return-object v0
    .line 18
.end method
