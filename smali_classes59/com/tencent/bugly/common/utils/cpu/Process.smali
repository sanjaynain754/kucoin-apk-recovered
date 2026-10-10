.class public Lcom/tencent/bugly/common/utils/cpu/Process;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:I = 0xff

.field public static final b:I = 0x0

.field public static final c:I = 0x20

.field public static final d:I = 0x9

.field public static final e:I = 0xa

.field public static final f:I = 0x100

.field public static final g:I = 0x200

.field public static final h:I = 0x400

.field public static final i:I = 0x800

.field public static final j:I = 0x1000

.field public static final k:I = 0x2000

.field public static final l:I = 0x4000


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "rmonitor_base"

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 7
    return-void
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

.method public static final a(I)I
    .locals 5

    .line 1
    .line 2
    const-string v0, "Uid:"

    .line 3
    .line 4
    .line 5
    filled-new-array {v0}, [Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    new-array v1, v1, [J

    .line 10
    .line 11
    const-wide/16 v2, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    aput-wide v2, v1, v4

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "/proc/"

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string p0, "/status"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v0, v1}, Lcom/tencent/bugly/common/utils/cpu/Process;->readProcLines(Ljava/lang/String;[Ljava/lang/String;[J)V

    .line 37
    .line 38
    aget-wide v0, v1, v4

    .line 39
    long-to-int p0, v0

    .line 40
    return p0
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

.method public static native getPids(Ljava/lang/String;[I)[I
.end method

.method public static native parseProcLine([BII[I[Ljava/lang/String;[J[F)Z
.end method

.method public static native readProcFile(Ljava/lang/String;[I[Ljava/lang/String;[J[F)Z
.end method

.method public static native readProcLines(Ljava/lang/String;[Ljava/lang/String;[J)V
.end method
