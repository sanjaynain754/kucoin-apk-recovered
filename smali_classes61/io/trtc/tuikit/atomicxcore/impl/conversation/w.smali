.class public final Lio/trtc/tuikit/atomicxcore/impl/conversation/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/w;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/w;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method


# virtual methods
.method public final onError(ILjava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/w;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 3
    .line 4
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->g:Lkotlinx/coroutines/flow/n;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/w;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    const-string p2, "Unknown error"

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 25
    :cond_1
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
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    check-cast p1, Ljava/lang/Number;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/w;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 9
    .line 10
    iput-wide v0, p1, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->j:J

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->a()V

    .line 14
    .line 15
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/w;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 21
    :cond_0
    return-void
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
