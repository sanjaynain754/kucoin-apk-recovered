.class public final Lcom/tencent/liteav/videobase/videobase/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/videobase/videobase/e$a;,
        Lcom/tencent/liteav/videobase/videobase/e$c;,
        Lcom/tencent/liteav/videobase/videobase/e$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/tencent/liteav/videobase/videobase/e$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/tencent/liteav/videobase/videobase/e$c;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/tencent/liteav/videobase/videobase/e$b;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/tencent/liteav/videobase/videobase/e$b;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/videobase/videobase/e$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/liteav/videobase/videobase/e$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/liteav/videobase/videobase/e;->a:Ljava/util/Map;

    .line 8
    .line 9
    new-instance v0, Lcom/tencent/liteav/videobase/videobase/e$2;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/tencent/liteav/videobase/videobase/e$2;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/liteav/videobase/videobase/e;->b:Ljava/util/Map;

    .line 15
    .line 16
    new-instance v0, Lcom/tencent/liteav/videobase/videobase/e$3;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/tencent/liteav/videobase/videobase/e$3;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lcom/tencent/liteav/videobase/videobase/e;->c:Ljava/util/Map;

    .line 22
    .line 23
    new-instance v0, Lcom/tencent/liteav/videobase/videobase/e$4;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/tencent/liteav/videobase/videobase/e$4;-><init>()V

    .line 27
    .line 28
    sput-object v0, Lcom/tencent/liteav/videobase/videobase/e;->d:Ljava/util/Map;

    .line 29
    return-void
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

.method public static a(Lcom/tencent/liteav/videobase/videobase/e$a;)I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/videobase/videobase/e;->a:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
    .line 22
    .line 23
    .line 24
    .line 25
.end method
