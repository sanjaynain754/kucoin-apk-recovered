.class public Lcom/tencent/bugly/proguard/na$a;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/na;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:[I


# direct methods
.method public constructor <init>([JI)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    array-length v0, p1

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/bugly/proguard/na$a;->a:I

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lcom/tencent/bugly/proguard/na$a;->c([J)[I

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2, v0}, Lcom/tencent/bugly/proguard/na$a;->a([III)[I

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iput-object p1, p0, Lcom/tencent/bugly/proguard/na$a;->c:[I

    .line 17
    array-length p1, p1

    .line 18
    .line 19
    iput p1, p0, Lcom/tencent/bugly/proguard/na$a;->b:I

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static a(I[I)I
    .locals 0

    .line 17
    aget p0, p1, p0

    return p0
.end method

.method public static a(I[II)I
    .locals 1

    .line 18
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    if-eq p0, v0, :cond_0

    add-int/lit8 p0, p0, 0x1

    .line 19
    aget p0, p1, p0

    return p0

    :cond_0
    return p2
.end method

.method public static a([III)[I
    .locals 11

    .line 5
    array-length v0, p0

    const/4 v1, 0x0

    if-le v0, p1, :cond_0

    .line 6
    invoke-static {p0, v1, p1}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object p0

    return-object p0

    .line 7
    :cond_0
    new-instance v2, Lcom/tencent/bugly/proguard/da;

    .line 8
    invoke-direct {v2, v1}, Lcom/tencent/bugly/proguard/da;-><init>(I)V

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_4

    .line 9
    aget v4, p0, v3

    .line 10
    invoke-static {v3, p0, p2}, Lcom/tencent/bugly/proguard/na$a;->a(I[II)I

    move-result v5

    add-int/lit8 v6, v0, -0x1

    if-eq v3, v6, :cond_1

    .line 11
    div-int v6, p1, v0

    goto :goto_1

    .line 12
    :cond_1
    div-int v7, p1, v0

    mul-int/2addr v7, v6

    sub-int v6, p1, v7

    :goto_1
    sub-int v7, v5, v4

    .line 13
    div-int/2addr v7, v6

    const/4 v8, 0x1

    .line 14
    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    move v8, v1

    :goto_2
    if-ge v8, v6, :cond_3

    mul-int v9, v8, v7

    add-int/2addr v9, v4

    if-lt v9, v5, :cond_2

    goto :goto_3

    .line 15
    :cond_2
    iget v10, v2, Lcom/tencent/bugly/proguard/da;->c:I

    invoke-virtual {v2, v10, v9}, Lcom/tencent/bugly/proguard/da;->a(II)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 16
    :cond_4
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/da;->b()[I

    move-result-object p0

    return-object p0
.end method

.method public static c([J)[I
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/da;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/da;-><init>(I)V

    .line 7
    .line 8
    iget v2, v0, Lcom/tencent/bugly/proguard/da;->c:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/da;->a(II)V

    .line 12
    :cond_0
    :goto_0
    array-length v2, p0

    .line 13
    .line 14
    add-int/lit8 v2, v2, -0x1

    .line 15
    .line 16
    if-ge v1, v2, :cond_1

    .line 17
    .line 18
    aget-wide v2, p0, v1

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    aget-wide v4, p0, v1

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-ltz v2, :cond_0

    .line 27
    .line 28
    iget v2, v0, Lcom/tencent/bugly/proguard/da;->c:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/da;->a(II)V

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/da;->b()[I

    .line 36
    move-result-object p0

    .line 37
    return-object p0
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
.end method


# virtual methods
.method public a([J)[I
    .locals 5

    .line 1
    array-length v0, p1

    iget v1, p0, Lcom/tencent/bugly/proguard/na$a;->a:I

    if-ne v0, v1, :cond_1

    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/na$a;->b:I

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 3
    iget-object v3, p0, Lcom/tencent/bugly/proguard/na$a;->c:[I

    aget v3, v3, v2

    aget-wide v3, p1, v3

    long-to-int v3, v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public b([J)[I
    .locals 8

    .line 1
    array-length v0, p1

    .line 2
    .line 3
    iget v1, p0, Lcom/tencent/bugly/proguard/na$a;->a:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    iget v0, p0, Lcom/tencent/bugly/proguard/na$a;->b:I

    .line 8
    .line 9
    new-array v0, v0, [I

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    :goto_0
    iget v2, p0, Lcom/tencent/bugly/proguard/na$a;->b:I

    .line 13
    .line 14
    if-ge v1, v2, :cond_1

    .line 15
    .line 16
    iget-object v2, p0, Lcom/tencent/bugly/proguard/na$a;->c:[I

    .line 17
    .line 18
    aget v3, v2, v1

    .line 19
    array-length v4, p1

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2, v4}, Lcom/tencent/bugly/proguard/na$a;->a(I[II)I

    .line 23
    move-result v2

    .line 24
    .line 25
    :goto_1
    if-ge v3, v2, :cond_0

    .line 26
    .line 27
    aget v4, v0, v1

    .line 28
    int-to-long v4, v4

    .line 29
    .line 30
    aget-wide v6, p1, v3

    .line 31
    add-long/2addr v4, v6

    .line 32
    long-to-int v4, v4

    .line 33
    .line 34
    aput v4, v0, v1

    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v0

    .line 42
    .line 43
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 47
    throw p1
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
.end method
