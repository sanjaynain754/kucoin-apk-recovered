.class public final Lcom/tencent/liteav/base/util/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static final b:Lcom/tencent/liteav/base/util/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/liteav/base/util/a<",
            "Lcom/tencent/liteav/base/util/CpuUsageMeasurer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/base/util/a;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/tencent/liteav/base/util/u;->b()Lcom/tencent/liteav/base/util/a$a;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/tencent/liteav/base/util/a;-><init>(Lcom/tencent/liteav/base/util/a$a;)V

    .line 10
    .line 11
    sput-object v0, Lcom/tencent/liteav/base/util/t;->b:Lcom/tencent/liteav/base/util/a;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static a()[I
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/liteav/base/util/t;->a:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    sput-boolean v0, Lcom/tencent/liteav/base/util/t;->a:Z

    .line 8
    .line 9
    sget-object v1, Lcom/tencent/liteav/base/util/t;->b:Lcom/tencent/liteav/base/util/a;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/tencent/liteav/base/util/a;->a()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/liteav/base/util/CpuUsageMeasurer;->a()[I

    .line 16
    .line 17
    .line 18
    filled-new-array {v0, v0}, [I

    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    .line 22
    :cond_0
    sget-object v0, Lcom/tencent/liteav/base/util/t;->b:Lcom/tencent/liteav/base/util/a;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/tencent/liteav/base/util/a;->a()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/tencent/liteav/base/util/CpuUsageMeasurer;->a()[I

    .line 29
    move-result-object v0

    .line 30
    return-object v0
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
