.class public final Lshark/internal/hppc/LongLongScatterMap;
.super Ljava/lang/Object;
.source "LongLongScatterMap.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/internal/hppc/LongLongScatterMap$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0016\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001:\u0001*B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0086\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u000cJ\u001f\u0010\"\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008%\u0010\u0005J\'\u0010(\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008(\u0010)R\u0016\u0010,\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0016\u0010.\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010+R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u00100R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u00100R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u00108R\u0011\u0010<\u001a\u0002048F\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010;R\u0011\u0010?\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>\u00a8\u0006@"
    }
    d2 = {
        "Lshark/internal/hppc/LongLongScatterMap;",
        "",
        "",
        "expectedElements",
        "<init>",
        "(I)V",
        "",
        "key",
        "value",
        "q",
        "(JJ)J",
        "k",
        "(J)I",
        "slot",
        "l",
        "(I)J",
        "i",
        "(J)J",
        "Lshark/internal/hppc/LongLongScatterMap$a;",
        "forEachCallback",
        "",
        "h",
        "(Lshark/internal/hppc/LongLongScatterMap$a;)V",
        "Lkotlin/sequences/Sequence;",
        "Lshark/internal/hppc/c;",
        "g",
        "()Lkotlin/sequences/Sequence;",
        "p",
        "()V",
        "f",
        "m",
        "",
        "fromKeys",
        "fromValues",
        "o",
        "([J[J)V",
        "arraySize",
        "d",
        "pendingKey",
        "pendingValue",
        "e",
        "(IJJ)V",
        "a",
        "[J",
        "keys",
        "b",
        "values",
        "c",
        "I",
        "assigned",
        "mask",
        "resizeAt",
        "",
        "Z",
        "hasEmptyKey",
        "",
        "D",
        "loadFactor",
        "n",
        "()Z",
        "isEmpty",
        "j",
        "()I",
        "size",
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

.field public b:[J

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:D


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    new-array v1, v0, [J

    .line 7
    .line 8
    iput-object v1, p0, Lshark/internal/hppc/LongLongScatterMap;->a:[J

    .line 9
    .line 10
    new-array v0, v0, [J

    .line 11
    .line 12
    iput-object v0, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 13
    .line 14
    const-wide/high16 v0, 0x3fe8000000000000L    # 0.75

    .line 15
    .line 16
    iput-wide v0, p0, Lshark/internal/hppc/LongLongScatterMap;->g:D

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lshark/internal/hppc/LongLongScatterMap;->f(I)V

    .line 20
    return-void
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

.method public static final synthetic a(Lshark/internal/hppc/LongLongScatterMap;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lshark/internal/hppc/LongLongScatterMap;->f:Z

    .line 3
    return p0
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

.method public static final synthetic b(Lshark/internal/hppc/LongLongScatterMap;)[J
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lshark/internal/hppc/LongLongScatterMap;->a:[J

    .line 3
    return-object p0
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

.method public static final synthetic c(Lshark/internal/hppc/LongLongScatterMap;)[J
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 3
    return-object p0
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


# virtual methods
.method public final d(I)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/hppc/LongLongScatterMap;->a:[J

    .line 3
    .line 4
    iget-object v1, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 5
    .line 6
    add-int/lit8 v2, p1, 0x1

    .line 7
    .line 8
    :try_start_0
    new-array v3, v2, [J

    .line 9
    .line 10
    iput-object v3, p0, Lshark/internal/hppc/LongLongScatterMap;->a:[J

    .line 11
    .line 12
    new-array v2, v2, [J

    .line 13
    .line 14
    iput-object v2, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    sget-object v0, Lshark/internal/hppc/a;->a:Lshark/internal/hppc/a;

    .line 17
    .line 18
    iget-wide v1, p0, Lshark/internal/hppc/LongLongScatterMap;->g:D

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, v1, v2}, Lshark/internal/hppc/a;->a(ID)I

    .line 22
    move-result v0

    .line 23
    .line 24
    iput v0, p0, Lshark/internal/hppc/LongLongScatterMap;->e:I

    .line 25
    .line 26
    add-int/lit8 p1, p1, -0x1

    .line 27
    .line 28
    iput p1, p0, Lshark/internal/hppc/LongLongScatterMap;->d:I

    .line 29
    return-void

    .line 30
    :catch_0
    move-exception v2

    .line 31
    .line 32
    iput-object v0, p0, Lshark/internal/hppc/LongLongScatterMap;->a:[J

    .line 33
    .line 34
    iput-object v1, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 35
    .line 36
    new-instance v0, Ljava/lang/RuntimeException;

    .line 37
    .line 38
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 39
    .line 40
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 41
    .line 42
    const-string v3, "Locale.ROOT"

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    iget v3, p0, Lshark/internal/hppc/LongLongScatterMap;->d:I

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    .line 52
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 61
    move-result-object p1

    .line 62
    const/4 v3, 0x2

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    const-string v3, "Not enough memory to allocate buffers for rehashing: %,d -> %,d"

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v3, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    const-string v1, "java.lang.String.format(locale, format, *args)"

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, p1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    throw v0
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

.method public final e(IJJ)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/hppc/LongLongScatterMap;->a:[J

    .line 3
    .line 4
    iget-object v1, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 5
    .line 6
    sget-object v2, Lshark/internal/hppc/a;->a:Lshark/internal/hppc/a;

    .line 7
    .line 8
    iget v3, p0, Lshark/internal/hppc/LongLongScatterMap;->d:I

    .line 9
    .line 10
    add-int/lit8 v3, v3, 0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lshark/internal/hppc/LongLongScatterMap;->j()I

    .line 14
    move-result v4

    .line 15
    .line 16
    iget-wide v5, p0, Lshark/internal/hppc/LongLongScatterMap;->g:D

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, v4, v5, v6}, Lshark/internal/hppc/a;->d(IID)I

    .line 20
    move-result v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lshark/internal/hppc/LongLongScatterMap;->d(I)V

    .line 24
    .line 25
    aput-wide p2, v0, p1

    .line 26
    .line 27
    aput-wide p4, v1, p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lshark/internal/hppc/LongLongScatterMap;->o([J[J)V

    .line 31
    return-void
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
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
.end method

.method public final f(I)V
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lshark/internal/hppc/LongLongScatterMap;->e:I

    .line 3
    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lshark/internal/hppc/LongLongScatterMap;->a:[J

    .line 7
    .line 8
    iget-object v1, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 9
    .line 10
    sget-object v2, Lshark/internal/hppc/a;->a:Lshark/internal/hppc/a;

    .line 11
    .line 12
    iget-wide v3, p0, Lshark/internal/hppc/LongLongScatterMap;->g:D

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p1, v3, v4}, Lshark/internal/hppc/a;->b(ID)I

    .line 16
    move-result p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lshark/internal/hppc/LongLongScatterMap;->d(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lshark/internal/hppc/LongLongScatterMap;->n()Z

    .line 23
    move-result p1

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Lshark/internal/hppc/LongLongScatterMap;->o([J[J)V

    .line 29
    :cond_0
    return-void
    .line 30
.end method

.method public final g()Lkotlin/sequences/Sequence;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lshark/internal/hppc/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lshark/internal/hppc/LongLongScatterMap;->d:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 10
    const/4 v2, -0x1

    .line 11
    .line 12
    iput v2, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 13
    .line 14
    new-instance v2, Lshark/internal/hppc/LongLongScatterMap$entrySequence$1;

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, p0, v1, v0}, Lshark/internal/hppc/LongLongScatterMap$entrySequence$1;-><init>(Lshark/internal/hppc/LongLongScatterMap;Lkotlin/jvm/internal/Ref$IntRef;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/sequences/SequencesKt;->generateSequence(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;

    .line 21
    move-result-object v0

    .line 22
    return-object v0
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
.end method

.method public final h(Lshark/internal/hppc/LongLongScatterMap$a;)V
    .locals 7
    .param p1    # Lshark/internal/hppc/LongLongScatterMap$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lshark/internal/hppc/LongLongScatterMap;->d:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    :goto_0
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    if-ge v1, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    iget-object v4, p0, Lshark/internal/hppc/LongLongScatterMap;->a:[J

    .line 16
    .line 17
    aget-wide v5, v4, v1

    .line 18
    .line 19
    cmp-long v4, v5, v2

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 24
    .line 25
    aget-wide v3, v2, v1

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v5, v6, v3, v4}, Lshark/internal/hppc/LongLongScatterMap$a;->a(JJ)V

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_1
    if-ne v1, v0, :cond_2

    .line 32
    .line 33
    iget-boolean v4, p0, Lshark/internal/hppc/LongLongScatterMap;->f:Z

    .line 34
    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    iget-object v4, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 40
    .line 41
    aget-wide v5, v4, v0

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v2, v3, v5, v6}, Lshark/internal/hppc/LongLongScatterMap$a;->a(JJ)V

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-void
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

.method public final i(J)J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lshark/internal/hppc/LongLongScatterMap;->k(J)I

    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    .line 12
    :goto_0
    if-eqz v1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lshark/internal/hppc/LongLongScatterMap;->l(I)J

    .line 16
    move-result-wide p1

    .line 17
    return-wide p1

    .line 18
    .line 19
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    const-string v1, "Unknown key "

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    throw p2
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
    iget v0, p0, Lshark/internal/hppc/LongLongScatterMap;->c:I

    .line 3
    .line 4
    iget-boolean v1, p0, Lshark/internal/hppc/LongLongScatterMap;->f:Z

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

.method public final k(J)I
    .locals 9

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v2, p1, v0

    .line 5
    const/4 v3, -0x1

    .line 6
    .line 7
    if-nez v2, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Lshark/internal/hppc/LongLongScatterMap;->f:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lshark/internal/hppc/LongLongScatterMap;->d:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    return v3

    .line 18
    .line 19
    :cond_1
    iget-object v2, p0, Lshark/internal/hppc/LongLongScatterMap;->a:[J

    .line 20
    .line 21
    iget v4, p0, Lshark/internal/hppc/LongLongScatterMap;->d:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Lshark/internal/hppc/LongLongScatterMap;->m(J)I

    .line 25
    move-result v5

    .line 26
    and-int/2addr v5, v4

    .line 27
    .line 28
    aget-wide v6, v2, v5

    .line 29
    .line 30
    :goto_0
    cmp-long v8, v6, v0

    .line 31
    .line 32
    if-eqz v8, :cond_3

    .line 33
    .line 34
    cmp-long v6, v6, p1

    .line 35
    .line 36
    if-nez v6, :cond_2

    .line 37
    return v5

    .line 38
    .line 39
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 40
    and-int/2addr v5, v4

    .line 41
    .line 42
    aget-wide v6, v2, v5

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    return v3
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

.method public final l(I)J
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 3
    .line 4
    aget-wide v1, v0, p1

    .line 5
    return-wide v1
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final m(J)I
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

.method public final n()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/internal/hppc/LongLongScatterMap;->j()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public final o([J[J)V
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/hppc/LongLongScatterMap;->a:[J

    .line 3
    .line 4
    iget-object v1, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 5
    .line 6
    iget v2, p0, Lshark/internal/hppc/LongLongScatterMap;->d:I

    .line 7
    array-length v3, p1

    .line 8
    .line 9
    add-int/lit8 v3, v3, -0x1

    .line 10
    array-length v4, v0

    .line 11
    .line 12
    add-int/lit8 v4, v4, -0x1

    .line 13
    .line 14
    aget-wide v5, p1, v3

    .line 15
    .line 16
    aput-wide v5, v0, v4

    .line 17
    array-length v4, v1

    .line 18
    .line 19
    add-int/lit8 v4, v4, -0x1

    .line 20
    .line 21
    aget-wide v5, p2, v3

    .line 22
    .line 23
    aput-wide v5, v1, v4

    .line 24
    .line 25
    :cond_0
    :goto_0
    add-int/lit8 v3, v3, -0x1

    .line 26
    .line 27
    if-ltz v3, :cond_2

    .line 28
    .line 29
    aget-wide v4, p1, v3

    .line 30
    .line 31
    const-wide/16 v6, 0x0

    .line 32
    .line 33
    cmp-long v8, v4, v6

    .line 34
    .line 35
    if-eqz v8, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v4, v5}, Lshark/internal/hppc/LongLongScatterMap;->m(J)I

    .line 39
    move-result v8

    .line 40
    :goto_1
    and-int/2addr v8, v2

    .line 41
    .line 42
    aget-wide v9, v0, v8

    .line 43
    .line 44
    cmp-long v9, v9, v6

    .line 45
    .line 46
    if-eqz v9, :cond_1

    .line 47
    .line 48
    add-int/lit8 v8, v8, 0x1

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_1
    aput-wide v4, v0, v8

    .line 52
    .line 53
    aget-wide v4, p2, v3

    .line 54
    .line 55
    aput-wide v4, v1, v8

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return-void
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
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
.end method

.method public final p()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lshark/internal/hppc/LongLongScatterMap;->c:I

    .line 4
    .line 5
    iput-boolean v0, p0, Lshark/internal/hppc/LongLongScatterMap;->f:Z

    .line 6
    .line 7
    sget-object v0, Lshark/internal/hppc/a;->a:Lshark/internal/hppc/a;

    .line 8
    const/4 v1, 0x4

    .line 9
    .line 10
    iget-wide v2, p0, Lshark/internal/hppc/LongLongScatterMap;->g:D

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, v3}, Lshark/internal/hppc/a;->b(ID)I

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lshark/internal/hppc/LongLongScatterMap;->d(I)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public final q(JJ)J
    .locals 10

    .line 1
    .line 2
    iget v1, p0, Lshark/internal/hppc/LongLongScatterMap;->d:I

    .line 3
    .line 4
    const-wide/16 v6, 0x0

    .line 5
    .line 6
    cmp-long v2, p1, v6

    .line 7
    const/4 v8, 0x1

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iput-boolean v8, p0, Lshark/internal/hppc/LongLongScatterMap;->f:Z

    .line 12
    .line 13
    iget-object v2, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 14
    add-int/2addr v1, v8

    .line 15
    .line 16
    aget-wide v3, v2, v1

    .line 17
    .line 18
    aput-wide p3, v2, v1

    .line 19
    return-wide v3

    .line 20
    .line 21
    :cond_0
    iget-object v9, p0, Lshark/internal/hppc/LongLongScatterMap;->a:[J

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {p0 .. p2}, Lshark/internal/hppc/LongLongScatterMap;->m(J)I

    .line 25
    move-result v2

    .line 26
    and-int/2addr v2, v1

    .line 27
    .line 28
    aget-wide v3, v9, v2

    .line 29
    .line 30
    :goto_0
    cmp-long v5, v3, v6

    .line 31
    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    cmp-long v3, v3, p1

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 39
    .line 40
    aget-wide v3, v1, v2

    .line 41
    .line 42
    aput-wide p3, v1, v2

    .line 43
    return-wide v3

    .line 44
    .line 45
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 46
    and-int/2addr v2, v1

    .line 47
    .line 48
    aget-wide v3, v9, v2

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_2
    iget v1, p0, Lshark/internal/hppc/LongLongScatterMap;->c:I

    .line 52
    .line 53
    iget v3, p0, Lshark/internal/hppc/LongLongScatterMap;->e:I

    .line 54
    .line 55
    if-ne v1, v3, :cond_3

    .line 56
    move-object v0, p0

    .line 57
    move-wide v4, p3

    .line 58
    move v1, v2

    .line 59
    move-wide v2, p1

    .line 60
    .line 61
    .line 62
    invoke-virtual/range {v0 .. v5}, Lshark/internal/hppc/LongLongScatterMap;->e(IJJ)V

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move v1, v2

    .line 65
    .line 66
    aput-wide p1, v9, v1

    .line 67
    .line 68
    iget-object v2, p0, Lshark/internal/hppc/LongLongScatterMap;->b:[J

    .line 69
    .line 70
    aput-wide p3, v2, v1

    .line 71
    .line 72
    :goto_1
    iget v1, p0, Lshark/internal/hppc/LongLongScatterMap;->c:I

    .line 73
    add-int/2addr v1, v8

    .line 74
    .line 75
    iput v1, p0, Lshark/internal/hppc/LongLongScatterMap;->c:I

    .line 76
    return-wide v6
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
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
.end method
