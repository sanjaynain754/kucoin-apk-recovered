.class final synthetic Lcom/tencent/liteav/audio2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;


# direct methods
.method private constructor <init>(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/audio2/a;->a:Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;

    .line 6
    return-void
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

.method public static a(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)Ljava/lang/Runnable;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/audio2/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/liteav/audio2/a;-><init>(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V

    .line 6
    return-object v0
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
.method public final run()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/a;->a:Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->lambda$registerAudioRecordingCallback$0(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V

    .line 6
    return-void
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
