.class public final Lshark/internal/hppc/LongObjectScatterMap;
.super Ljava/lang/Object;
.source "LongObjectScatterMap.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\t\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\"\u0010\u0008\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\r0\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0014J\'\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\"\u0010#R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R$\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u0012\u0004\u0008)\u0010\u0004R\u0016\u0010-\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010,R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010,R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u00104R\u0011\u00108\u001a\u0002008F\u00a2\u0006\u0006\u001a\u0004\u00086\u00107R\u0011\u0010;\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u00089\u0010:\u00a8\u0006<"
    }
    d2 = {
        "Lshark/internal/hppc/LongObjectScatterMap;",
        "T",
        "",
        "<init>",
        "()V",
        "",
        "key",
        "value",
        "m",
        "(JLjava/lang/Object;)Ljava/lang/Object;",
        "h",
        "(J)Ljava/lang/Object;",
        "Lkotlin/sequences/Sequence;",
        "Lshark/internal/hppc/d;",
        "g",
        "()Lkotlin/sequences/Sequence;",
        "",
        "expectedElements",
        "",
        "f",
        "(I)V",
        "j",
        "(J)I",
        "",
        "fromKeys",
        "",
        "fromValues",
        "l",
        "([J[Ljava/lang/Object;)V",
        "arraySize",
        "d",
        "slot",
        "pendingKey",
        "pendingValue",
        "e",
        "(IJLjava/lang/Object;)V",
        "a",
        "[J",
        "keys",
        "b",
        "[Ljava/lang/Object;",
        "getValues$annotations",
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
        "k",
        "()Z",
        "isEmpty",
        "i",
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

.field public b:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:D


# direct methods
.method public constructor <init>()V
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
    iput-object v1, p0, Lshark/internal/hppc/LongObjectScatterMap;->a:[J

    .line 9
    .line 10
    new-array v0, v0, [Ljava/lang/Object;

    .line 11
    .line 12
    iput-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

    .line 13
    .line 14
    const-wide/high16 v0, 0x3fe8000000000000L    # 0.75

    .line 15
    .line 16
    iput-wide v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->g:D

    .line 17
    const/4 v0, 0x4

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lshark/internal/hppc/LongObjectScatterMap;->f(I)V

    .line 21
    return-void
.end method

.method public static final synthetic a(Lshark/internal/hppc/LongObjectScatterMap;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lshark/internal/hppc/LongObjectScatterMap;->f:Z

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

.method public static final synthetic b(Lshark/internal/hppc/LongObjectScatterMap;)[J
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lshark/internal/hppc/LongObjectScatterMap;->a:[J

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

.method public static final synthetic c(Lshark/internal/hppc/LongObjectScatterMap;)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

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
    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->a:[J

    .line 3
    .line 4
    iget-object v1, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

    .line 5
    .line 6
    add-int/lit8 v2, p1, 0x1

    .line 7
    .line 8
    :try_start_0
    new-array v3, v2, [J

    .line 9
    .line 10
    iput-object v3, p0, Lshark/internal/hppc/LongObjectScatterMap;->a:[J

    .line 11
    .line 12
    new-array v2, v2, [Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v2, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    sget-object v0, Lshark/internal/hppc/a;->a:Lshark/internal/hppc/a;

    .line 17
    .line 18
    iget-wide v1, p0, Lshark/internal/hppc/LongObjectScatterMap;->g:D

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, v1, v2}, Lshark/internal/hppc/a;->a(ID)I

    .line 22
    move-result v0

    .line 23
    .line 24
    iput v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->e:I

    .line 25
    .line 26
    add-int/lit8 p1, p1, -0x1

    .line 27
    .line 28
    iput p1, p0, Lshark/internal/hppc/LongObjectScatterMap;->d:I

    .line 29
    return-void

    .line 30
    :catch_0
    move-exception v2

    .line 31
    .line 32
    iput-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->a:[J

    .line 33
    .line 34
    iput-object v1, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

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
    iget v3, p0, Lshark/internal/hppc/LongObjectScatterMap;->d:I

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

.method public final e(IJLjava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJTT;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->a:[J

    .line 3
    .line 4
    iget-object v1, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v2, Lshark/internal/hppc/a;->a:Lshark/internal/hppc/a;

    .line 7
    .line 8
    iget v3, p0, Lshark/internal/hppc/LongObjectScatterMap;->d:I

    .line 9
    .line 10
    add-int/lit8 v3, v3, 0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lshark/internal/hppc/LongObjectScatterMap;->i()I

    .line 14
    move-result v4

    .line 15
    .line 16
    iget-wide v5, p0, Lshark/internal/hppc/LongObjectScatterMap;->g:D

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3, v4, v5, v6}, Lshark/internal/hppc/a;->d(IID)I

    .line 20
    move-result v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lshark/internal/hppc/LongObjectScatterMap;->d(I)V

    .line 24
    .line 25
    aput-wide p2, v0, p1

    .line 26
    .line 27
    aput-object p4, v1, p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lshark/internal/hppc/LongObjectScatterMap;->l([J[Ljava/lang/Object;)V

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
    iget v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->e:I

    .line 3
    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->a:[J

    .line 7
    .line 8
    iget-object v1, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

    .line 9
    .line 10
    sget-object v2, Lshark/internal/hppc/a;->a:Lshark/internal/hppc/a;

    .line 11
    .line 12
    iget-wide v3, p0, Lshark/internal/hppc/LongObjectScatterMap;->g:D

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p1, v3, v4}, Lshark/internal/hppc/a;->b(ID)I

    .line 16
    move-result p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lshark/internal/hppc/LongObjectScatterMap;->d(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lshark/internal/hppc/LongObjectScatterMap;->k()Z

    .line 23
    move-result p1

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Lshark/internal/hppc/LongObjectScatterMap;->l([J[Ljava/lang/Object;)V

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
            "Lshark/internal/hppc/d<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->d:I

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
    new-instance v2, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, p0, v1, v0}, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;-><init>(Lshark/internal/hppc/LongObjectScatterMap;Lkotlin/jvm/internal/Ref$IntRef;I)V

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

.method public final h(J)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

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
    if-nez v2, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Lshark/internal/hppc/LongObjectScatterMap;->f:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

    .line 14
    .line 15
    iget p2, p0, Lshark/internal/hppc/LongObjectScatterMap;->d:I

    .line 16
    .line 17
    add-int/lit8 p2, p2, 0x1

    .line 18
    .line 19
    aget-object p1, p1, p2

    .line 20
    return-object p1

    .line 21
    :cond_0
    return-object v3

    .line 22
    .line 23
    :cond_1
    iget-object v2, p0, Lshark/internal/hppc/LongObjectScatterMap;->a:[J

    .line 24
    .line 25
    iget v4, p0, Lshark/internal/hppc/LongObjectScatterMap;->d:I

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lshark/internal/hppc/LongObjectScatterMap;->j(J)I

    .line 29
    move-result v5

    .line 30
    and-int/2addr v5, v4

    .line 31
    .line 32
    aget-wide v6, v2, v5

    .line 33
    .line 34
    :goto_0
    cmp-long v8, v6, v0

    .line 35
    .line 36
    if-eqz v8, :cond_3

    .line 37
    .line 38
    cmp-long v6, v6, p1

    .line 39
    .line 40
    if-nez v6, :cond_2

    .line 41
    .line 42
    iget-object p1, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

    .line 43
    .line 44
    aget-object p1, p1, v5

    .line 45
    return-object p1

    .line 46
    .line 47
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 48
    and-int/2addr v5, v4

    .line 49
    .line 50
    aget-wide v6, v2, v5

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    return-object v3
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

.method public final i()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->c:I

    .line 3
    .line 4
    iget-boolean v1, p0, Lshark/internal/hppc/LongObjectScatterMap;->f:Z

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

.method public final j(J)I
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

.method public final k()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/internal/hppc/LongObjectScatterMap;->i()I

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

.method public final l([J[Ljava/lang/Object;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J[TT;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->a:[J

    .line 3
    .line 4
    iget-object v1, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

    .line 5
    .line 6
    iget v2, p0, Lshark/internal/hppc/LongObjectScatterMap;->d:I

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
    aget-object v5, p2, v3

    .line 22
    .line 23
    aput-object v5, v1, v4

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
    invoke-virtual {p0, v4, v5}, Lshark/internal/hppc/LongObjectScatterMap;->j(J)I

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
    aget-object v4, p2, v3

    .line 54
    .line 55
    aput-object v4, v1, v8

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

.method public final m(JLjava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTT;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->d:I

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    cmp-long v3, p1, v1

    .line 7
    const/4 v4, 0x1

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    iput-boolean v4, p0, Lshark/internal/hppc/LongObjectScatterMap;->f:Z

    .line 12
    .line 13
    iget-object p1, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

    .line 14
    add-int/2addr v0, v4

    .line 15
    .line 16
    aget-object p2, p1, v0

    .line 17
    .line 18
    aput-object p3, p1, v0

    .line 19
    return-object p2

    .line 20
    .line 21
    :cond_0
    iget-object v3, p0, Lshark/internal/hppc/LongObjectScatterMap;->a:[J

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Lshark/internal/hppc/LongObjectScatterMap;->j(J)I

    .line 25
    move-result v5

    .line 26
    and-int/2addr v5, v0

    .line 27
    .line 28
    aget-wide v6, v3, v5

    .line 29
    .line 30
    :goto_0
    cmp-long v8, v6, v1

    .line 31
    .line 32
    if-eqz v8, :cond_2

    .line 33
    .line 34
    cmp-long v6, v6, p1

    .line 35
    .line 36
    if-nez v6, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

    .line 39
    .line 40
    aget-object p2, p1, v5

    .line 41
    .line 42
    aput-object p3, p1, v5

    .line 43
    return-object p2

    .line 44
    .line 45
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 46
    and-int/2addr v5, v0

    .line 47
    .line 48
    aget-wide v6, v3, v5

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_2
    iget v0, p0, Lshark/internal/hppc/LongObjectScatterMap;->c:I

    .line 52
    .line 53
    iget v1, p0, Lshark/internal/hppc/LongObjectScatterMap;->e:I

    .line 54
    .line 55
    if-ne v0, v1, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v5, p1, p2, p3}, Lshark/internal/hppc/LongObjectScatterMap;->e(IJLjava/lang/Object;)V

    .line 59
    goto :goto_1

    .line 60
    .line 61
    :cond_3
    aput-wide p1, v3, v5

    .line 62
    .line 63
    iget-object p1, p0, Lshark/internal/hppc/LongObjectScatterMap;->b:[Ljava/lang/Object;

    .line 64
    .line 65
    aput-object p3, p1, v5

    .line 66
    .line 67
    :goto_1
    iget p1, p0, Lshark/internal/hppc/LongObjectScatterMap;->c:I

    .line 68
    add-int/2addr p1, v4

    .line 69
    .line 70
    iput p1, p0, Lshark/internal/hppc/LongObjectScatterMap;->c:I

    .line 71
    const/4 p1, 0x0

    .line 72
    return-object p1
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
