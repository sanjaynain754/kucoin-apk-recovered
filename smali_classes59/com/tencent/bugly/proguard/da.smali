.class public Lcom/tencent/bugly/proguard/da;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final d:I = 0xc


# instance fields
.field public b:[I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lcom/tencent/bugly/proguard/da;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 6
    new-array p1, v0, [I

    iput-object p1, p0, Lcom/tencent/bugly/proguard/da;->b:[I

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/da;->c(I)[I

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/da;->b:[I

    .line 8
    :goto_0
    iput v0, p0, Lcom/tencent/bugly/proguard/da;->c:I

    return-void
.end method

.method public constructor <init>([II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/da;->b:[I

    .line 3
    array-length p1, p1

    const/4 v0, 0x0

    const-string/jumbo v1, "size"

    invoke-static {p2, v0, p1, v1}, Lcom/tencent/bugly/proguard/da;->a(IIILjava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/tencent/bugly/proguard/da;->c:I

    return-void
.end method

.method public static a(IIILjava/lang/String;)I
    .locals 0

    if-lt p0, p1, :cond_1

    if-gt p0, p2, :cond_0

    return p0

    .line 1
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p3, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 3
    const-string p2, "%s is out of range of [%d, %d] (too high)"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 4
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p3, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 6
    const-string p2, "%s is out of range of [%d, %d] (too low)"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(II)V
    .locals 3

    if-ltz p1, :cond_0

    if-le p0, p1, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "length="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "; index="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(I)[I
    .locals 0

    .line 1
    .line 2
    new-array p0, p0, [I

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
.end method


# virtual methods
.method public a()Lcom/tencent/bugly/proguard/da;
    .locals 3

    .line 18
    new-instance v0, Lcom/tencent/bugly/proguard/da;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/da;->b:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iget v2, p0, Lcom/tencent/bugly/proguard/da;->c:I

    invoke-direct {v0, v1, v2}, Lcom/tencent/bugly/proguard/da;-><init>([II)V

    return-object v0
.end method

.method public a(I)V
    .locals 1

    .line 11
    iget v0, p0, Lcom/tencent/bugly/proguard/da;->c:I

    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/da;->a(II)V

    return-void
.end method

.method public a(II)V
    .locals 3

    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/da;->b(I)V

    .line 13
    iget v1, p0, Lcom/tencent/bugly/proguard/da;->c:I

    sub-int v2, v1, p1

    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Lcom/tencent/bugly/proguard/da;->c:I

    .line 15
    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/da;->b(II)V

    if-eqz v2, :cond_0

    .line 16
    iget-object v0, p0, Lcom/tencent/bugly/proguard/da;->b:[I

    add-int/lit8 v1, p1, 0x1

    invoke-static {v0, p1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/da;->b:[I

    aput p2, v0, p1

    return-void
.end method

.method public a([I)V
    .locals 4

    .line 7
    array-length v0, p1

    .line 8
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/da;->b(I)V

    .line 9
    iget-object v1, p0, Lcom/tencent/bugly/proguard/da;->b:[I

    iget v2, p0, Lcom/tencent/bugly/proguard/da;->c:I

    const/4 v3, 0x0

    invoke-static {p1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 10
    iget p1, p0, Lcom/tencent/bugly/proguard/da;->c:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/tencent/bugly/proguard/da;->c:I

    return-void
.end method

.method public final b(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/tencent/bugly/proguard/da;->c:I

    add-int/2addr p1, v0

    .line 2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/da;->b:[I

    array-length v2, v1

    if-lt p1, v2, :cond_2

    const/4 v2, 0x6

    if-ge v0, v2, :cond_0

    const/16 v2, 0xc

    goto :goto_0

    :cond_0
    shr-int/lit8 v2, v0, 0x1

    :goto_0
    add-int/2addr v2, v0

    if-le v2, p1, :cond_1

    move p1, v2

    .line 3
    :cond_1
    new-array p1, p1, [I

    const/4 v2, 0x0

    .line 4
    invoke-static {v1, v2, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/proguard/da;->b:[I

    :cond_2
    return-void
.end method

.method public b()[I
    .locals 2

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/da;->b:[I

    iget v1, p0, Lcom/tencent/bugly/proguard/da;->c:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/da;->a()Lcom/tencent/bugly/proguard/da;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method
