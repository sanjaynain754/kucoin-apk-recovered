.class public Lx7/j;
.super Lx7/e;
.source "Program32Header.java"


# direct methods
.method public constructor <init>(Lx7/i;Lx7/d;J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lx7/e;-><init>()V

    .line 4
    const/4 v0, 0x4

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-boolean v1, p2, Lx7/d;->a:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    iget-wide v1, p2, Lx7/d;->c:J

    .line 23
    .line 24
    iget p2, p2, Lx7/d;->e:I

    .line 25
    int-to-long v3, p2

    .line 26
    mul-long/2addr p3, v3

    .line 27
    add-long/2addr v1, p3

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0, v1, v2}, Lx7/i;->m(Ljava/nio/ByteBuffer;J)J

    .line 31
    move-result-wide p2

    .line 32
    .line 33
    iput-wide p2, p0, Lx7/e;->a:J

    .line 34
    .line 35
    const-wide/16 p2, 0x4

    .line 36
    add-long/2addr p2, v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0, p2, p3}, Lx7/i;->m(Ljava/nio/ByteBuffer;J)J

    .line 40
    move-result-wide p2

    .line 41
    .line 42
    iput-wide p2, p0, Lx7/e;->b:J

    .line 43
    .line 44
    const-wide/16 p2, 0x8

    .line 45
    add-long/2addr p2, v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0, p2, p3}, Lx7/i;->m(Ljava/nio/ByteBuffer;J)J

    .line 49
    move-result-wide p2

    .line 50
    .line 51
    iput-wide p2, p0, Lx7/e;->c:J

    .line 52
    .line 53
    const-wide/16 p2, 0x14

    .line 54
    add-long/2addr v1, p2

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0, v1, v2}, Lx7/i;->m(Ljava/nio/ByteBuffer;J)J

    .line 58
    move-result-wide p1

    .line 59
    .line 60
    iput-wide p1, p0, Lx7/e;->d:J

    .line 61
    return-void
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
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
.end method
