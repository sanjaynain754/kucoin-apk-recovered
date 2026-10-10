.class final Lcom/tencent/bugly/common/replay/ReplayCache$ongoingSegmentFile$2;
.super Lkotlin/jvm/internal/Lambda;
.source "BUGLY"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/common/replay/ReplayCache;-><init>(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Ljava/io/File;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/bugly/common/replay/ReplayCache;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/common/replay/ReplayCache;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/ReplayCache$ongoingSegmentFile$2;->this$0:Lcom/tencent/bugly/common/replay/ReplayCache;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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
.method public final invoke()Ljava/io/File;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/ReplayCache$ongoingSegmentFile$2;->this$0:Lcom/tencent/bugly/common/replay/ReplayCache;

    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/ReplayCache;->getReplayCacheDir$bugly_pro_release()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/tencent/bugly/common/replay/ReplayCache$ongoingSegmentFile$2;->this$0:Lcom/tencent/bugly/common/replay/ReplayCache;

    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/ReplayCache;->getReplayCacheDir$bugly_pro_release()Ljava/io/File;

    move-result-object v1

    const-string v2, ".ongoing_segment"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    :cond_1
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/common/replay/ReplayCache$ongoingSegmentFile$2;->invoke()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
