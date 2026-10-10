.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$a;
.super Ljava/lang/Object;
.source "MediaStore.kt"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;->e(Ljava/lang/String;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$MediaDevice;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$disableUserMediaDevice$1",
        "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;",
        "onSuccess",
        "",
        "onFailure",
        "code",
        "",
        "desc",
        "",
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


# instance fields
.field public final synthetic a:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$a;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "desc"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$a;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;->a(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    const-string v2, "openRemoteCamera failed:code:"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, ",desc:"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object p2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p2}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    sget-object p2, Lcom/trtc/uikit/livekit/common/ErrorLocalized;->a:Lcom/trtc/uikit/livekit/common/ErrorLocalized$Companion;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p1}, Lcom/trtc/uikit/livekit/common/ErrorLocalized$Companion;->onError(I)V

    .line 45
    return-void
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
.end method

.method public onSuccess()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore$a;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;->a(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "openRemoteCamera:[success]"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    return-void
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
.end method
