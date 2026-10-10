.class public Lcom/tencent/bugly/proguard/ji$d$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/io/FileFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/ji$d;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:[J

.field public final synthetic b:Lcom/tencent/bugly/proguard/ji$d;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/ji$d;[J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ji$d$a;->b:Lcom/tencent/bugly/proguard/ji$d;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/ji$d$a;->a:[J

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public accept(Ljava/io/File;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 5
    move-result-object p1

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/system/Os;->lstat(Ljava/lang/String;)Landroid/system/StructStat;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ji$d$a;->a:[J

    .line 12
    .line 13
    aget-wide v2, v1, v0

    .line 14
    .line 15
    const-wide/16 v4, 0x1

    .line 16
    add-long/2addr v2, v4

    .line 17
    .line 18
    aput-wide v2, v1, v0

    .line 19
    const/4 v2, 0x1

    .line 20
    .line 21
    aget-wide v3, v1, v2

    .line 22
    .line 23
    iget-wide v5, p1, Landroid/system/StructStat;->st_blocks:J

    .line 24
    .line 25
    iget-wide v7, p1, Landroid/system/StructStat;->st_blksize:J

    .line 26
    mul-long/2addr v5, v7

    .line 27
    add-long/2addr v5, v3

    .line 28
    .line 29
    aput-wide v5, v1, v2
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p1

    .line 32
    .line 33
    new-array v1, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    const-string v2, "Matrix.WarmUpDelegate"

    .line 36
    .line 37
    const-string v3, ""

    .line 38
    .line 39
    .line 40
    invoke-static {v2, p1, v3, v1}, Lcom/tencent/bugly/proguard/pb;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    :goto_0
    return v0
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
