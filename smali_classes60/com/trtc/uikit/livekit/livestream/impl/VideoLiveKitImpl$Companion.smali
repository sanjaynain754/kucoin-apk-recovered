.class public final Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;
.super Ljava/lang/Object;
.source "VideoLiveKitImpl.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;",
        "",
        "<init>",
        "()V",
        "ROOM_ID",
        "",
        "OWNER_ID",
        "sInstance",
        "Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;",
        "createInstance",
        "context",
        "Landroid/content/Context;",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVideoLiveKitImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoLiveKitImpl.kt\ncom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createInstance(Landroid/content/Context;)Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->d()Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-class v0, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 14
    monitor-enter v0

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-static {}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->d()Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    new-instance v1, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 23
    const/4 v2, 0x0

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, p1, v2}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;-><init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->e(Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    monitor-exit v0

    .line 34
    return-object v1

    .line 35
    :goto_1
    monitor-exit v0

    .line 36
    throw p1

    .line 37
    :cond_1
    return-object v0
    .line 38
    .line 39
.end method
