.class public Lcom/tencent/bugly/proguard/s7;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:[Lcom/tencent/bugly/proguard/e9;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/tencent/bugly/common/heapdump/a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/tencent/bugly/common/heapdump/a;-><init>()V

    .line 11
    const/4 v2, 0x2

    .line 12
    .line 13
    new-array v2, v2, [Lcom/tencent/bugly/proguard/e9;

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    aput-object v0, v2, v3

    .line 17
    const/4 v0, 0x1

    .line 18
    .line 19
    aput-object v1, v2, v0

    .line 20
    .line 21
    sput-object v2, Lcom/tencent/bugly/proguard/s7;->a:[Lcom/tencent/bugly/proguard/e9;

    .line 22
    return-void
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
.end method

.method public constructor <init>()V
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

.method public static a()Lcom/tencent/bugly/proguard/e9;
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/s7;->a:[Lcom/tencent/bugly/proguard/e9;

    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    :goto_0
    if-ge v2, v1, :cond_1

    .line 7
    .line 8
    aget-object v3, v0, v2

    .line 9
    .line 10
    .line 11
    invoke-interface {v3}, Lcom/tencent/bugly/proguard/e9;->a()Z

    .line 12
    move-result v4

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    return-object v3

    .line 16
    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_1
    new-instance v0, Lcom/tencent/bugly/common/heapdump/a;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Lcom/tencent/bugly/common/heapdump/a;-><init>()V

    .line 24
    return-object v0
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
.end method

.method public static b()Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->c()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/tencent/bugly/proguard/s7;->a:[Lcom/tencent/bugly/proguard/e9;

    .line 10
    .line 11
    aget-object v0, v0, v1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lcom/tencent/bugly/proguard/e9;->a()Z

    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/s7;->a:[Lcom/tencent/bugly/proguard/e9;

    .line 19
    array-length v2, v0

    .line 20
    move v3, v1

    .line 21
    .line 22
    :goto_0
    if-ge v3, v2, :cond_2

    .line 23
    .line 24
    aget-object v4, v0, v3

    .line 25
    .line 26
    .line 27
    invoke-interface {v4}, Lcom/tencent/bugly/proguard/e9;->a()Z

    .line 28
    move-result v4

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    .line 34
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return v1
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
.end method
