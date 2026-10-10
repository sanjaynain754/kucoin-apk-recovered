.class public final Lcom/kubi/sdk/log/realtime/RealTimeReporter;
.super Ljava/lang/Object;
.source "RealTimeReporter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0008\u0005*\u0001P\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001SB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\"\u0010\u0003R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010*\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00105R#\u0010=\u001a\n 8*\u0004\u0018\u000107078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010CR\"\u0010K\u001a\u00020E8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008F\u0010G\u001a\u0004\u0008F\u0010H\"\u0004\u0008I\u0010JR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008L\u0010M\u001a\u0004\u0008L\u0010N\"\u0004\u0008O\u0010\u0008R\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010Q\u00a8\u0006T"
    }
    d2 = {
        "Lcom/kubi/sdk/log/realtime/RealTimeReporter;",
        "",
        "<init>",
        "()V",
        "Landroid/app/Application;",
        "context",
        "",
        "q",
        "(Landroid/app/Application;)V",
        "Lcom/kubi/sdk/log/realtime/db/LogData;",
        "message",
        "v",
        "(Lcom/kubi/sdk/log/realtime/db/LogData;)V",
        "m",
        "(Lcom/kubi/sdk/log/realtime/db/LogData;)Lcom/kubi/sdk/log/realtime/db/LogData;",
        "Lcom/kubi/sdk/log/realtime/cache/LogCache$a;",
        "data",
        "s",
        "(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;)V",
        "r",
        "t",
        "Lcom/kubi/network/retrofit/exception/ApiException;",
        "exception",
        "",
        "l",
        "(Lcom/kubi/network/retrofit/exception/ApiException;)Z",
        "p",
        "",
        "throwable",
        "o",
        "(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;Ljava/lang/Throwable;)V",
        "isSuccess",
        "n",
        "(ZLcom/kubi/sdk/log/realtime/cache/LogCache$a;)V",
        "u",
        "",
        "b",
        "J",
        "lastReportTime",
        "Lcom/kubi/sdk/log/realtime/cache/LogCache;",
        "c",
        "Lcom/kubi/sdk/log/realtime/cache/LogCache;",
        "cache",
        "Ljava/util/concurrent/ExecutorService;",
        "d",
        "Ljava/util/concurrent/ExecutorService;",
        "processThread",
        "Landroid/os/HandlerThread;",
        "e",
        "Landroid/os/HandlerThread;",
        "reportThread",
        "Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;",
        "f",
        "Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;",
        "handler",
        "Lpz/a;",
        "kotlin.jvm.PlatformType",
        "g",
        "Lkotlin/Lazy;",
        "i",
        "()Lpz/a;",
        "api",
        "",
        "h",
        "I",
        "rateLimitTimes",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isReport",
        "Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;",
        "j",
        "Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;",
        "()Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;",
        "x",
        "(Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;)V",
        "config",
        "k",
        "Landroid/app/Application;",
        "()Landroid/app/Application;",
        "setContext$Logger_realtime_release",
        "com/kubi/sdk/log/realtime/RealTimeReporter$b",
        "Lcom/kubi/sdk/log/realtime/RealTimeReporter$b;",
        "callback",
        "a",
        "Logger-realtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRealTimeReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeReporter.kt\ncom/kubi/sdk/log/realtime/RealTimeReporter\n+ 2 RealLogger.kt\ncom/kubi/sdk/log/realtime/utils/RealLoggerKt\n+ 3 RealTimeIssue.kt\ncom/kubi/sdk/log/realtime/RealTimeIssueKt\n*L\n1#1,342:1\n16#2,4:343\n16#2,4:347\n16#2,4:351\n16#2,4:355\n16#2,4:359\n16#2,4:363\n16#2,4:372\n16#2,4:376\n36#3,5:367\n*S KotlinDebug\n*F\n+ 1 RealTimeReporter.kt\ncom/kubi/sdk/log/realtime/RealTimeReporter\n*L\n139#1:343,4\n159#1:347,4\n164#1:351,4\n170#1:355,4\n177#1:359,4\n222#1:363,4\n275#1:372,4\n283#1:376,4\n266#1:367,5\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/sdk/log/realtime/RealTimeReporter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:J

.field public static final c:Lcom/kubi/sdk/log/realtime/cache/LogCache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Ljava/util/concurrent/ExecutorService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Landroid/os/HandlerThread;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static f:Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static final g:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static h:I

.field public static i:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static j:Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static k:Landroid/app/Application;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static final l:Lcom/kubi/sdk/log/realtime/RealTimeReporter$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->a:Lcom/kubi/sdk/log/realtime/RealTimeReporter;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    move-result-wide v0

    .line 12
    .line 13
    sput-wide v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->b:J

    .line 14
    .line 15
    new-instance v0, Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Lcom/kubi/sdk/log/realtime/cache/LogCache;-><init>()V

    .line 19
    .line 20
    sput-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->c:Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 21
    .line 22
    const-string v0, "logger-uploader-processor"

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lo00/g;->f(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    sput-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->d:Ljava/util/concurrent/ExecutorService;

    .line 29
    .line 30
    new-instance v0, Landroid/os/HandlerThread;

    .line 31
    .line 32
    const-string v1, "realtime-reporter-handler"

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    sput-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->e:Landroid/os/HandlerThread;

    .line 38
    .line 39
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter$api$2;->INSTANCE:Lcom/kubi/sdk/log/realtime/RealTimeReporter$api$2;

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    sput-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->g:Lkotlin/Lazy;

    .line 46
    .line 47
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    const/4 v1, 0x1

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 52
    .line 53
    sput-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    .line 55
    new-instance v2, Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;

    .line 56
    .line 57
    const/16 v13, 0xff

    .line 58
    const/4 v14, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    .line 64
    const-wide/16 v7, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    .line 67
    const-wide/16 v10, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    .line 70
    .line 71
    invoke-direct/range {v2 .. v14}, Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZJIJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 72
    .line 73
    sput-object v2, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->j:Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;

    .line 74
    .line 75
    new-instance v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter$b;

    .line 76
    .line 77
    .line 78
    invoke-direct {v0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter$b;-><init>()V

    .line 79
    .line 80
    sput-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->l:Lcom/kubi/sdk/log/realtime/RealTimeReporter$b;

    .line 81
    return-void
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

.method public static synthetic a(Lcom/kubi/sdk/log/realtime/db/LogData;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->w(Lcom/kubi/sdk/log/realtime/db/LogData;)V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final synthetic b()Lcom/kubi/sdk/log/realtime/cache/LogCache;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->c:Lcom/kubi/sdk/log/realtime/cache/LogCache;

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

.method public static final synthetic c()Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->f:Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;

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

.method public static final synthetic d()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->b:J

    .line 3
    return-wide v0
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

.method public static final synthetic e()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

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

.method public static final synthetic f(Lcom/kubi/sdk/log/realtime/RealTimeReporter;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->r()V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final synthetic g(Lcom/kubi/sdk/log/realtime/RealTimeReporter;Lcom/kubi/sdk/log/realtime/cache/LogCache$a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->s(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;)V

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
.end method

.method public static final synthetic h(Lcom/kubi/sdk/log/realtime/RealTimeReporter;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->u()V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final w(Lcom/kubi/sdk/log/realtime/db/LogData;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "$message"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->c:Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 8
    .line 9
    sget-object v1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->a:Lcom/kubi/sdk/log/realtime/RealTimeReporter;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->m(Lcom/kubi/sdk/log/realtime/db/LogData;)Lcom/kubi/sdk/log/realtime/db/LogData;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lcom/kubi/sdk/log/realtime/cache/LogCache;->g(Lcom/kubi/sdk/log/realtime/db/LogData;)V

    .line 17
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public final i()Lpz/a;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lpz/a;

    .line 9
    return-object v0
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

.method public final j()Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->j:Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;

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

.method public final k()Landroid/app/Application;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->k:Landroid/app/Application;

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

.method public final l(Lcom/kubi/network/retrofit/exception/ApiException;)Z
    .locals 5

    .line 1
    .line 2
    iget-object v0, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "429"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    const-string v1, "Logger::RealTimeReporter"

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 16
    .line 17
    const-string v3, "403"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    :cond_0
    sget v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->h:I

    .line 26
    add-int/2addr v0, v2

    .line 27
    .line 28
    sput v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->h:I

    .line 29
    const/4 v3, 0x3

    .line 30
    .line 31
    if-lt v0, v3, :cond_2

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    const-string v4, "\u8fde\u7eed\u4e09\u6b21\u6536\u5230"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    iget-object p1, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string p1, "\uff0c\u505c\u6b62\u4e0a\u62a5\u65e5\u5fd7"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-static {v1, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    sget-object p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->f:Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;

    .line 61
    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 66
    :cond_1
    return v2

    .line 67
    .line 68
    :cond_2
    iget-object p1, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 69
    .line 70
    const-string v0, "4001"

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    move-result p1

    .line 75
    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    const-string p1, "\u6536\u52304001\uff0c\u6e05\u7a7a\u7f13\u5b58"

    .line 79
    .line 80
    .line 81
    invoke-static {v1, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    sget-object p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->f:Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    const/4 v0, 0x4

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 90
    :cond_3
    return v2

    .line 91
    :cond_4
    const/4 p1, 0x0

    .line 92
    return p1
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public final m(Lcom/kubi/sdk/log/realtime/db/LogData;)Lcom/kubi/sdk/log/realtime/db/LogData;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/sdk/log/realtime/db/LogData;->getContent()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const/16 v1, 0xbb8

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/kubi/sdk/log/realtime/db/LogData;->setContent(Ljava/lang/String;)V

    .line 14
    return-object p1
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final n(ZLcom/kubi/sdk/log/realtime/cache/LogCache$a;)V
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/kubi/sdk/log/realtime/cache/LogCache$a;->b()Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    sget-object p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->c:Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/kubi/sdk/log/realtime/cache/LogCache$a;->a()Ljava/util/List;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lcom/kubi/sdk/log/realtime/cache/LogCache;->m(Ljava/util/List;)V

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/sdk/log/realtime/cache/LogCache$a;->b()Z

    .line 22
    move-result p1

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    sget-object p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->c:Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/kubi/sdk/log/realtime/cache/LogCache$a;->a()Ljava/util/List;

    .line 30
    move-result-object p2

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Lcom/kubi/sdk/log/realtime/cache/LogCache;->t(Ljava/util/List;)V

    .line 34
    .line 35
    :cond_1
    :goto_0
    sget-object p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->c:Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/kubi/sdk/log/realtime/cache/LogCache;->j()V

    .line 39
    return-void
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
.end method

.method public final o(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;Ljava/lang/Throwable;)V
    .locals 11

    .line 1
    .line 2
    instance-of v0, p2, Ljava/lang/reflect/UndeclaredThrowableException;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Ljava/lang/reflect/UndeclaredThrowableException;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/reflect/UndeclaredThrowableException;->getUndeclaredThrowable()Ljava/lang/Throwable;

    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, p2

    .line 14
    .line 15
    :goto_0
    instance-of v1, v0, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    check-cast v0, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->l(Lcom/kubi/network/retrofit/exception/ApiException;)Z

    .line 25
    move-result v0

    .line 26
    goto :goto_1

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    instance-of v1, v1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    const-string v1, "null cannot be cast to non-null type com.kubi.network.retrofit.exception.ApiException"

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    check-cast v0, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->l(Lcom/kubi/network/retrofit/exception/ApiException;)Z

    .line 49
    move-result v0

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_2
    instance-of v0, v0, Lokhttp3/internal/http2/StreamResetException;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    move v0, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move v0, v3

    .line 58
    .line 59
    :goto_1
    if-eqz v0, :cond_4

    .line 60
    return-void

    .line 61
    .line 62
    .line 63
    :cond_4
    invoke-static {p2}, Lcom/kubi/sdk/log/realtime/b;->a(Ljava/lang/Throwable;)Z

    .line 64
    move-result v0

    .line 65
    .line 66
    if-nez v0, :cond_7

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Lcom/kubi/sdk/log/realtime/b;->a(Ljava/lang/Throwable;)Z

    .line 76
    move-result v0

    .line 77
    .line 78
    if-ne v0, v2, :cond_5

    .line 79
    move v0, v2

    .line 80
    goto :goto_2

    .line 81
    :cond_5
    move v0, v3

    .line 82
    .line 83
    :goto_2
    if-nez v0, :cond_7

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    if-eqz v0, :cond_6

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    .line 98
    invoke-static {v0}, Lcom/kubi/sdk/log/realtime/b;->a(Ljava/lang/Throwable;)Z

    .line 99
    move-result v0

    .line 100
    .line 101
    if-ne v0, v2, :cond_6

    .line 102
    goto :goto_3

    .line 103
    :cond_6
    move v2, v3

    .line 104
    .line 105
    :goto_3
    if-eqz v2, :cond_8

    .line 106
    :cond_7
    move-object v5, p2

    .line 107
    goto :goto_4

    .line 108
    .line 109
    :cond_8
    new-instance v4, Lcom/kubi/sdk/log/realtime/RealTimeLogException;

    .line 110
    .line 111
    const/16 v9, 0x8

    .line 112
    const/4 v10, 0x0

    .line 113
    .line 114
    const-string v6, "\u4e0a\u62a5\u65e5\u5fd7\u5931\u8d25"

    .line 115
    const/4 v7, 0x0

    .line 116
    const/4 v8, 0x0

    .line 117
    move-object v5, p2

    .line 118
    .line 119
    .line 120
    invoke-direct/range {v4 .. v10}, Lcom/kubi/sdk/log/realtime/RealTimeLogException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 121
    const/4 p2, 0x2

    .line 122
    const/4 v0, 0x0

    .line 123
    .line 124
    .line 125
    invoke-static {v4, v0, p2, v0}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 126
    .line 127
    :goto_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    const-string v0, "reportMessage\uff0c\u4e0a\u62a5\u5931\u8d25:: "

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    move-result-object p2

    .line 143
    .line 144
    const-string v0, "Logger::RealTimeReporter"

    .line 145
    .line 146
    .line 147
    invoke-static {v0, p2}, Lro/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v3, p1}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->n(ZLcom/kubi/sdk/log/realtime/cache/LogCache$a;)V

    .line 151
    return-void
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
.end method

.method public final p(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    sput v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->h:I

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->n(ZLcom/kubi/sdk/log/realtime/cache/LogCache$a;)V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final q(Landroid/app/Application;)V
    .locals 2
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sput-object p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->k:Landroid/app/Application;

    .line 8
    .line 9
    new-instance p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter$init$1;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, p0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter$init$1;-><init>(Lcom/kubi/sdk/log/realtime/RealTimeReporter;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/kubi/utils/x0;->d(Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    sget-object p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->j:Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;->isOpen()Z

    .line 21
    move-result p1

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    const-string p1, "Logger::RealTimeReporter"

    .line 26
    .line 27
    const-string v0, "\u672a\u5f00\u542f\u5b9e\u65f6\u65e5\u5fd7\u4e0a\u62a5"

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    return-void

    .line 32
    .line 33
    :cond_0
    sget-object p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->e:Landroid/os/HandlerThread;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 37
    .line 38
    new-instance v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    const-string v1, "reportThread.looper"

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, p1}, Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;-><init>(Landroid/os/Looper;)V

    .line 51
    .line 52
    sput-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->f:Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->u()V

    .line 56
    .line 57
    sget-object p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->c:Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 58
    .line 59
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->l:Lcom/kubi/sdk/log/realtime/RealTimeReporter$b;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lcom/kubi/sdk/log/realtime/cache/LogCache;->q(Lcom/kubi/sdk/log/realtime/cache/LogCache$b;)V

    .line 63
    return-void
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public final r()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->c:Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->j:Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;->getLimitSize()I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/log/realtime/cache/LogCache;->o(I)Lcom/kubi/sdk/log/realtime/cache/LogCache$a;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/sdk/log/realtime/cache/LogCache$a;->a()Ljava/util/List;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->t(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->u()V

    .line 30
    return-void
.end method

.method public final s(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->t(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;)V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final t(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->u()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    move-result-wide v0

    .line 8
    .line 9
    sput-wide v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->b:J

    .line 10
    .line 11
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->k()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    .line 27
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 41
    move-result v2

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    move-object v0, v1

    .line 45
    .line 46
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    move-result v0

    .line 51
    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    const-string v0, "Logger::RealTimeReporter"

    .line 55
    .line 56
    const-string v1, "\u7f51\u7edc\u4e0d\u901a\uff0c\u8df3\u8fc7\u4e0a\u62a5"

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const/4 v0, 0x0

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0, p1}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->n(ZLcom/kubi/sdk/log/realtime/cache/LogCache$a;)V

    .line 64
    return-void

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/sdk/log/realtime/cache/LogCache$a;->a()Ljava/util/List;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    :try_start_1
    invoke-static {v0}, Lcom/blankj/utilcode/util/p;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    const-string v1, "toJson(cacheList)"

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 83
    move-result-object v0

    .line 84
    .line 85
    const-string v2, "this as java.lang.String).getBytes(charset)"

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    const/4 v2, 0x2

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v2}, Landroid/util/Base64;->encode([BI)[B

    .line 93
    move-result-object v0

    .line 94
    .line 95
    const-string v2, "encode(\n                \u2026NO_WRAP\n                )"

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    new-instance v5, Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    invoke-direct {v5, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 104
    .line 105
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 106
    .line 107
    .line 108
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 109
    .line 110
    sget-object v0, Lcom/kubi/log/core/a;->a:Lcom/kubi/log/core/a;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/kubi/log/core/a;->a()Lcom/kubi/log/core/LogConfig;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Lcom/kubi/log/core/LogConfig;->e()Lcom/kubi/log/core/a$a;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    .line 121
    invoke-interface {v1}, Lcom/kubi/log/core/a$a;->a()Ljava/lang/String;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 126
    move-result v1

    .line 127
    .line 128
    if-nez v1, :cond_2

    .line 129
    .line 130
    const-string v1, "uid"

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/kubi/log/core/a;->a()Lcom/kubi/log/core/LogConfig;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/kubi/log/core/LogConfig;->e()Lcom/kubi/log/core/a$a;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    .line 141
    invoke-interface {v0}, Lcom/kubi/log/core/a$a;->a()Ljava/lang/String;

    .line 142
    move-result-object v0

    .line 143
    .line 144
    .line 145
    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    goto :goto_1

    .line 147
    :catchall_1
    move-exception v0

    .line 148
    goto :goto_2

    .line 149
    .line 150
    .line 151
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->i()Lpz/a;

    .line 152
    move-result-object v3

    .line 153
    .line 154
    const-string v0, "api"

    .line 155
    .line 156
    .line 157
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    const/4 v7, 0x4

    .line 159
    const/4 v8, 0x0

    .line 160
    const/4 v6, 0x0

    .line 161
    .line 162
    .line 163
    invoke-static/range {v3 .. v8}, Lpz/a$a;->a(Lpz/a;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/sdk/log/realtime/network/LogResponse;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->p(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;)V

    .line 167
    return-void

    .line 168
    .line 169
    .line 170
    :goto_2
    invoke-virtual {p0, p1, v0}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->o(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;Ljava/lang/Throwable;)V

    .line 171
    return-void
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public final u()V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->f:Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 9
    .line 10
    :cond_0
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->f:Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    sget-object v2, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->j:Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;->getPoolingInterval()J

    .line 18
    move-result-wide v2

    .line 19
    .line 20
    const-wide/16 v4, 0x3e8

    .line 21
    mul-long/2addr v2, v4

    .line 22
    .line 23
    const-wide/16 v4, 0xbb8

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 27
    move-result-wide v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 31
    :cond_1
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
.end method

.method public final v(Lcom/kubi/sdk/log/realtime/db/LogData;)V
    .locals 2
    .param p1    # Lcom/kubi/sdk/log/realtime/db/LogData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "message"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    sget-object v0, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->d:Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    new-instance v1, Lcom/kubi/sdk/log/realtime/c;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p1}, Lcom/kubi/sdk/log/realtime/c;-><init>(Lcom/kubi/sdk/log/realtime/db/LogData;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 25
    return-void
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
.end method

.method public final x(Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sput-object p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->j:Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
