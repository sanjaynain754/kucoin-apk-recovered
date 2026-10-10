.class public Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;
.super Ljava/lang/Object;
.source "TUILoginConfig.java"


# static fields
.field public static final TUI_LOG_DEBUG:I = 0x3

.field public static final TUI_LOG_ERROR:I = 0x6

.field public static final TUI_LOG_INFO:I = 0x4

.field public static final TUI_LOG_NONE:I = 0x0

.field public static final TUI_LOG_WARN:I = 0x5


# instance fields
.field private initLocalStorageOnly:Z

.field private logLevel:I

.field private tuiLogListener:Lcom/tencent/qcloud/tuicore/interfaces/TUILogListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x4

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;->logLevel:I

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;->initLocalStorageOnly:Z

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method


# virtual methods
.method public getLogLevel()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;->logLevel:I

    .line 3
    return v0
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
.end method

.method public getLogListener()Lcom/tencent/qcloud/tuicore/interfaces/TUILogListener;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;->tuiLogListener:Lcom/tencent/qcloud/tuicore/interfaces/TUILogListener;

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
.end method

.method public isInitLocalStorageOnly()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;->initLocalStorageOnly:Z

    .line 3
    return v0
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
.end method

.method public setInitLocalStorageOnly(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;->initLocalStorageOnly:Z

    .line 3
    return-void
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
.end method

.method public setLogLevel(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;->logLevel:I

    .line 3
    return-void
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
.end method

.method public setLogListener(Lcom/tencent/qcloud/tuicore/interfaces/TUILogListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;->tuiLogListener:Lcom/tencent/qcloud/tuicore/interfaces/TUILogListener;

    .line 3
    return-void
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
.end method
