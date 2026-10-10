.class interface abstract Lcom/tencent/thumbplayer/tcmedia/core/drm/reuse/TPDoubleQueueCachedPool$ITPObjectLifecycleMgr;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/thumbplayer/tcmedia/core/drm/reuse/TPDoubleQueueCachedPool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ITPObjectLifecycleMgr"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract create(Lcom/tencent/thumbplayer/tcmedia/core/drm/reuse/TPDoubleQueueCachedPool;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/thumbplayer/tcmedia/core/drm/reuse/TPDoubleQueueCachedPool<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract release(Lcom/tencent/thumbplayer/tcmedia/core/drm/reuse/TPDoubleQueueCachedPool;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/thumbplayer/tcmedia/core/drm/reuse/TPDoubleQueueCachedPool<",
            "TT;>;TT;)V"
        }
    .end annotation
.end method

.method public abstract reset(Lcom/tencent/thumbplayer/tcmedia/core/drm/reuse/TPDoubleQueueCachedPool;Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/thumbplayer/tcmedia/core/drm/reuse/TPDoubleQueueCachedPool<",
            "TT;>;TT;)Z"
        }
    .end annotation
.end method
