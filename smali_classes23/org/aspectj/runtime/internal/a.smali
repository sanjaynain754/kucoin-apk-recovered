.class public abstract Lorg/aspectj/runtime/internal/a;
.super Ljava/lang/Object;
.source "AroundClosure.java"


# instance fields
.field protected bitflags:I

.field protected preInitializationState:[Ljava/lang/Object;

.field protected state:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x100000

    .line 2
    iput v0, p0, Lorg/aspectj/runtime/internal/a;->bitflags:I

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x100000

    .line 4
    iput v0, p0, Lorg/aspectj/runtime/internal/a;->bitflags:I

    .line 5
    iput-object p1, p0, Lorg/aspectj/runtime/internal/a;->state:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getFlags()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/aspectj/runtime/internal/a;->bitflags:I

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
    .line 19
    .line 20
.end method

.method public getPreInitializationState()[Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/aspectj/runtime/internal/a;->preInitializationState:[Ljava/lang/Object;

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

.method public getState()[Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/aspectj/runtime/internal/a;->state:[Ljava/lang/Object;

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

.method public linkClosureAndJoinPoint()Lorg/aspectj/lang/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/aspectj/runtime/internal/a;->state:[Ljava/lang/Object;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    check-cast v0, Lorg/aspectj/lang/b;

    .line 2
    invoke-interface {v0, p0}, Lorg/aspectj/lang/b;->c(Lorg/aspectj/runtime/internal/a;)V

    return-object v0
.end method

.method public linkClosureAndJoinPoint(I)Lorg/aspectj/lang/b;
    .locals 2

    .line 3
    iget-object v0, p0, Lorg/aspectj/runtime/internal/a;->state:[Ljava/lang/Object;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    check-cast v0, Lorg/aspectj/lang/b;

    .line 4
    invoke-interface {v0, p0}, Lorg/aspectj/lang/b;->c(Lorg/aspectj/runtime/internal/a;)V

    .line 5
    iput p1, p0, Lorg/aspectj/runtime/internal/a;->bitflags:I

    return-object v0
.end method

.method public linkStackClosureAndJoinPoint(I)Lorg/aspectj/lang/b;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/aspectj/runtime/internal/a;->state:[Ljava/lang/Object;

    .line 3
    array-length v1, v0

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    check-cast v0, Lorg/aspectj/lang/b;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p0}, Lorg/aspectj/lang/b;->e(Lorg/aspectj/runtime/internal/a;)V

    .line 13
    .line 14
    iput p1, p0, Lorg/aspectj/runtime/internal/a;->bitflags:I

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public abstract run([Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation
.end method

.method public unlink()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/aspectj/runtime/internal/a;->state:[Ljava/lang/Object;

    .line 3
    array-length v1, v0

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    check-cast v0, Lorg/aspectj/lang/b;

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lorg/aspectj/lang/b;->e(Lorg/aspectj/runtime/internal/a;)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
