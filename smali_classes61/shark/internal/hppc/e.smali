.class public final Lshark/internal/hppc/e;
.super Ljava/lang/Object;
.source "LongScatterSet.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0016\n\u0002\u0008\u0011\n\u0002\u0010\u0006\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u0005J\r\u0010\u000f\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0005J\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010!R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010!R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010!R\u0016\u0010&\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010%R\u0014\u0010)\u001a\u00020\'8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lshark/internal/hppc/e;",
        "",
        "",
        "expectedElements",
        "<init>",
        "(I)V",
        "",
        "key",
        "",
        "a",
        "(J)Z",
        "d",
        "h",
        "",
        "e",
        "j",
        "()I",
        "f",
        "(J)I",
        "inputGapSlot",
        "i",
        "",
        "fromKeys",
        "g",
        "([J)V",
        "arraySize",
        "b",
        "slot",
        "pendingKey",
        "c",
        "(IJ)V",
        "[J",
        "keys",
        "I",
        "assigned",
        "mask",
        "resizeAt",
        "Z",
        "hasEmptyKey",
        "",
        "D",
        "loadFactor",
        "shark-graph"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field public a:[J

.field public b:I

.field public c:I

.field public d:I

.field public e:Z

.field public final f:D


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [J

    iput-object v0, p0, Lshark/internal/hppc/e;->a:[J

    const-wide/high16 v0, 0x3fe8000000000000L    # 0.75

    .line 3
    iput-wide v0, p0, Lshark/internal/hppc/e;->f:D

    .line 4
    invoke-virtual {p0, p1}, Lshark/internal/hppc/e;->e(I)V

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x4

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lshark/internal/hppc/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)Z
    .locals 9

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v2, p1, v0

    .line 5
    const/4 v3, 0x1

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-boolean p1, p0, Lshark/internal/hppc/e;->e:Z

    .line 10
    xor-int/2addr p1, v3

    .line 11
    .line 12
    iput-boolean v3, p0, Lshark/internal/hppc/e;->e:Z

    .line 13
    return p1

    .line 14
    .line 15
    :cond_0
    iget-object v2, p0, Lshark/internal/hppc/e;->a:[J

    .line 16
    .line 17
    iget v4, p0, Lshark/internal/hppc/e;->c:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Lshark/internal/hppc/e;->f(J)I

    .line 21
    move-result v5

    .line 22
    and-int/2addr v5, v4

    .line 23
    .line 24
    aget-wide v6, v2, v5

    .line 25
    .line 26
    :goto_0
    cmp-long v8, v6, v0

    .line 27
    .line 28
    if-eqz v8, :cond_2

    .line 29
    .line 30
    cmp-long v6, v6, p1

    .line 31
    .line 32
    if-nez v6, :cond_1

    .line 33
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    .line 36
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 37
    and-int/2addr v5, v4

    .line 38
    .line 39
    aget-wide v6, v2, v5

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_2
    iget v0, p0, Lshark/internal/hppc/e;->b:I

    .line 43
    .line 44
    iget v1, p0, Lshark/internal/hppc/e;->d:I

    .line 45
    .line 46
    if-ne v0, v1, :cond_3

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v5, p1, p2}, Lshark/internal/hppc/e;->c(IJ)V

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_3
    aput-wide p1, v2, v5

    .line 53
    .line 54
    :goto_1
    iget p1, p0, Lshark/internal/hppc/e;->b:I

    .line 55
    add-int/2addr p1, v3

    .line 56
    .line 57
    iput p1, p0, Lshark/internal/hppc/e;->b:I

    .line 58
    return v3
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final b(I)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/hppc/e;->a:[J

    .line 3
    .line 4
    add-int/lit8 v1, p1, 0x1

    .line 5
    .line 6
    :try_start_0
    new-array v1, v1, [J

    .line 7
    .line 8
    iput-object v1, p0, Lshark/internal/hppc/e;->a:[J
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    sget-object v0, Lshark/internal/hppc/a;->a:Lshark/internal/hppc/a;

    .line 11
    .line 12
    iget-wide v1, p0, Lshark/internal/hppc/e;->f:D

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1, v1, v2}, Lshark/internal/hppc/a;->a(ID)I

    .line 16
    move-result v0

    .line 17
    .line 18
    iput v0, p0, Lshark/internal/hppc/e;->d:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, -0x1

    .line 21
    .line 22
    iput p1, p0, Lshark/internal/hppc/e;->c:I

    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v1

    .line 25
    .line 26
    iput-object v0, p0, Lshark/internal/hppc/e;->a:[J

    .line 27
    .line 28
    new-instance v0, Ljava/lang/RuntimeException;

    .line 29
    .line 30
    sget-object v2, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 31
    .line 32
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 33
    .line 34
    const-string v3, "Locale.ROOT"

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lshark/internal/hppc/e;->j()I

    .line 41
    move-result v3

    .line 42
    .line 43
    .line 44
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 53
    move-result-object p1

    .line 54
    const/4 v3, 0x2

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    const-string v3, "Not enough memory to allocate buffers for rehashing: %,d -> %,d"

    .line 61
    .line 62
    .line 63
    invoke-static {v2, v3, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    const-string v2, "java.lang.String.format(locale, format, *args)"

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    throw v0
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final c(IJ)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/hppc/e;->a:[J

    .line 3
    .line 4
    sget-object v1, Lshark/internal/hppc/a;->a:Lshark/internal/hppc/a;

    .line 5
    .line 6
    iget v2, p0, Lshark/internal/hppc/e;->c:I

    .line 7
    .line 8
    add-int/lit8 v2, v2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lshark/internal/hppc/e;->j()I

    .line 12
    move-result v3

    .line 13
    .line 14
    iget-wide v4, p0, Lshark/internal/hppc/e;->f:D

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2, v3, v4, v5}, Lshark/internal/hppc/a;->d(IID)I

    .line 18
    move-result v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lshark/internal/hppc/e;->b(I)V

    .line 22
    .line 23
    aput-wide p2, v0, p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lshark/internal/hppc/e;->g([J)V

    .line 27
    return-void
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
.end method

.method public final d(J)Z
    .locals 8

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v2, p1, v0

    .line 5
    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    iget-boolean p1, p0, Lshark/internal/hppc/e;->e:Z

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    iget-object v2, p0, Lshark/internal/hppc/e;->a:[J

    .line 12
    .line 13
    iget v3, p0, Lshark/internal/hppc/e;->c:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, Lshark/internal/hppc/e;->f(J)I

    .line 17
    move-result v4

    .line 18
    and-int/2addr v4, v3

    .line 19
    .line 20
    aget-wide v5, v2, v4

    .line 21
    .line 22
    :goto_0
    cmp-long v7, v5, v0

    .line 23
    .line 24
    if-eqz v7, :cond_2

    .line 25
    .line 26
    cmp-long v5, v5, p1

    .line 27
    const/4 v6, 0x1

    .line 28
    .line 29
    if-nez v5, :cond_1

    .line 30
    return v6

    .line 31
    :cond_1
    add-int/2addr v4, v6

    .line 32
    and-int/2addr v4, v3

    .line 33
    .line 34
    aget-wide v5, v2, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 p1, 0x0

    .line 37
    return p1
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final e(I)V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lshark/internal/hppc/e;->d:I

    .line 3
    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lshark/internal/hppc/e;->a:[J

    .line 7
    .line 8
    sget-object v1, Lshark/internal/hppc/a;->a:Lshark/internal/hppc/a;

    .line 9
    .line 10
    iget-wide v2, p0, Lshark/internal/hppc/e;->f:D

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1, v2, v3}, Lshark/internal/hppc/a;->b(ID)I

    .line 14
    move-result p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lshark/internal/hppc/e;->b(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lshark/internal/hppc/e;->j()I

    .line 21
    move-result p1

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lshark/internal/hppc/e;->g([J)V

    .line 27
    :cond_0
    return-void
    .line 28
    .line 29
    .line 30
.end method

.method public final f(J)I
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lshark/internal/hppc/a;->a:Lshark/internal/hppc/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lshark/internal/hppc/a;->c(J)I

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final g([J)V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/hppc/e;->a:[J

    .line 3
    .line 4
    iget v1, p0, Lshark/internal/hppc/e;->c:I

    .line 5
    array-length v2, p1

    .line 6
    .line 7
    add-int/lit8 v2, v2, -0x1

    .line 8
    .line 9
    :cond_0
    :goto_0
    add-int/lit8 v2, v2, -0x1

    .line 10
    .line 11
    if-ltz v2, :cond_2

    .line 12
    .line 13
    aget-wide v3, p1, v2

    .line 14
    .line 15
    const-wide/16 v5, 0x0

    .line 16
    .line 17
    cmp-long v7, v3, v5

    .line 18
    .line 19
    if-eqz v7, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v3, v4}, Lshark/internal/hppc/e;->f(J)I

    .line 23
    move-result v7

    .line 24
    :goto_1
    and-int/2addr v7, v1

    .line 25
    .line 26
    aget-wide v8, v0, v7

    .line 27
    .line 28
    cmp-long v8, v8, v5

    .line 29
    .line 30
    if-eqz v8, :cond_1

    .line 31
    .line 32
    add-int/lit8 v7, v7, 0x1

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_1
    aput-wide v3, v0, v7

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return-void
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final h(J)Z
    .locals 9

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v2, p1, v0

    .line 5
    const/4 v3, 0x0

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-boolean p1, p0, Lshark/internal/hppc/e;->e:Z

    .line 10
    .line 11
    iput-boolean v3, p0, Lshark/internal/hppc/e;->e:Z

    .line 12
    return p1

    .line 13
    .line 14
    :cond_0
    iget-object v2, p0, Lshark/internal/hppc/e;->a:[J

    .line 15
    .line 16
    iget v4, p0, Lshark/internal/hppc/e;->c:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Lshark/internal/hppc/e;->f(J)I

    .line 20
    move-result v5

    .line 21
    and-int/2addr v5, v4

    .line 22
    .line 23
    aget-wide v6, v2, v5

    .line 24
    .line 25
    :goto_0
    cmp-long v8, v6, v0

    .line 26
    .line 27
    if-eqz v8, :cond_2

    .line 28
    .line 29
    cmp-long v6, v6, p1

    .line 30
    .line 31
    if-nez v6, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v5}, Lshark/internal/hppc/e;->i(I)V

    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    .line 38
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 39
    and-int/2addr v5, v4

    .line 40
    .line 41
    aget-wide v6, v2, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return v3
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final i(I)V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/hppc/e;->a:[J

    .line 3
    .line 4
    iget v1, p0, Lshark/internal/hppc/e;->c:I

    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    .line 8
    :cond_0
    :goto_0
    add-int/lit8 v3, v3, 0x1

    .line 9
    .line 10
    add-int v4, p1, v3

    .line 11
    and-int/2addr v4, v1

    .line 12
    .line 13
    aget-wide v5, v0, v4

    .line 14
    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    cmp-long v9, v5, v7

    .line 18
    .line 19
    if-nez v9, :cond_1

    .line 20
    .line 21
    aput-wide v7, v0, p1

    .line 22
    .line 23
    iget p1, p0, Lshark/internal/hppc/e;->b:I

    .line 24
    .line 25
    add-int/lit8 p1, p1, -0x1

    .line 26
    .line 27
    iput p1, p0, Lshark/internal/hppc/e;->b:I

    .line 28
    return-void

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0, v5, v6}, Lshark/internal/hppc/e;->f(J)I

    .line 32
    move-result v7

    .line 33
    .line 34
    sub-int v7, v4, v7

    .line 35
    and-int/2addr v7, v1

    .line 36
    .line 37
    if-lt v7, v3, :cond_0

    .line 38
    .line 39
    aput-wide v5, v0, p1

    .line 40
    move v3, v2

    .line 41
    move p1, v4

    .line 42
    goto :goto_0
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final j()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lshark/internal/hppc/e;->b:I

    .line 3
    .line 4
    iget-boolean v1, p0, Lshark/internal/hppc/e;->e:Z

    .line 5
    add-int/2addr v0, v1

    .line 6
    return v0
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
.end method
