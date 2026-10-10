.class public final Lcom/tencent/liteav/base/util/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/base/util/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Ljava/lang/Runnable;

.field public final c:Ljava/lang/Runnable;

.field public final synthetic d:Lcom/tencent/liteav/base/util/m;

.field private final e:J


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/base/util/m;Ljava/lang/Runnable;J)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/base/util/m$a;->d:Lcom/tencent/liteav/base/util/m;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput-object p2, p0, Lcom/tencent/liteav/base/util/m$a;->a:Ljava/lang/Runnable;

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p2}, Lcom/tencent/liteav/base/util/q;->a(Lcom/tencent/liteav/base/util/m$a;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/tencent/liteav/base/util/m$a;->b:Ljava/lang/Runnable;

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/tencent/liteav/base/util/r;->a(Lcom/tencent/liteav/base/util/m$a;)Ljava/lang/Runnable;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    iput-object p1, p0, Lcom/tencent/liteav/base/util/m$a;->c:Ljava/lang/Runnable;

    .line 20
    .line 21
    iput-wide p3, p0, Lcom/tencent/liteav/base/util/m$a;->e:J

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
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/base/util/m$a;->d:Lcom/tencent/liteav/base/util/m;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/liteav/base/util/m;->b:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/base/util/m$a;->c:Ljava/lang/Runnable;

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/tencent/liteav/base/util/m$a;->e:J

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
