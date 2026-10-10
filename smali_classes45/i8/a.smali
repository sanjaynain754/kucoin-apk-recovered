.class public Li8/a;
.super Ljava/lang/Object;
.source "GifWriter.java"

# interfaces
.implements Lcom/github/penfeizhou/animation/io/e;


# instance fields
.field public a:Ljava/nio/IntBuffer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x2800

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Li8/a;->c(I)V

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
.end method


# virtual methods
.method public a()Ljava/nio/IntBuffer;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Li8/a;->a:Ljava/nio/IntBuffer;

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
.end method

.method public b()[I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Li8/a;->a:Ljava/nio/IntBuffer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/IntBuffer;->array()[I

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public c(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Li8/a;->a:Ljava/nio/IntBuffer;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-le p1, v0, :cond_1

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-static {p1}, Ljava/nio/IntBuffer;->allocate(I)Ljava/nio/IntBuffer;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Li8/a;->a:Ljava/nio/IntBuffer;

    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Li8/a;->a:Ljava/nio/IntBuffer;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/nio/IntBuffer;->clear()Ljava/nio/Buffer;

    .line 22
    .line 23
    iget-object v0, p0, Li8/a;->a:Ljava/nio/IntBuffer;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/nio/IntBuffer;->limit(I)Ljava/nio/Buffer;

    .line 27
    .line 28
    iget-object p1, p0, Li8/a;->a:Ljava/nio/IntBuffer;

    .line 29
    const/4 v0, 0x0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/nio/IntBuffer;->position(I)Ljava/nio/Buffer;

    .line 33
    return-void
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
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
