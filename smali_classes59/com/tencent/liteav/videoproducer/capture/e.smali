.class final synthetic Lcom/tencent/liteav/videoproducer/capture/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field private static final a:Lcom/tencent/liteav/videoproducer/capture/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/videoproducer/capture/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/liteav/videoproducer/capture/e;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/liteav/videoproducer/capture/e;->a:Lcom/tencent/liteav/videoproducer/capture/e;

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
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static a()Ljava/util/Comparator;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/videoproducer/capture/e;->a:Lcom/tencent/liteav/videoproducer/capture/e;

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
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lcom/tencent/liteav/videoproducer/a/a;

    .line 3
    .line 4
    check-cast p2, Lcom/tencent/liteav/videoproducer/a/a;

    .line 5
    .line 6
    iget v0, p1, Lcom/tencent/liteav/videoproducer/a/a;->a:I

    .line 7
    .line 8
    iget v1, p2, Lcom/tencent/liteav/videoproducer/a/a;->a:I

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    const/4 p1, -0x1

    .line 12
    return p1

    .line 13
    .line 14
    :cond_0
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    iget p1, p1, Lcom/tencent/liteav/videoproducer/a/a;->b:I

    .line 17
    .line 18
    iget p2, p2, Lcom/tencent/liteav/videoproducer/a/a;->b:I

    .line 19
    sub-int/2addr p1, p2

    .line 20
    return p1

    .line 21
    :cond_1
    const/4 p1, 0x1

    .line 22
    return p1
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
