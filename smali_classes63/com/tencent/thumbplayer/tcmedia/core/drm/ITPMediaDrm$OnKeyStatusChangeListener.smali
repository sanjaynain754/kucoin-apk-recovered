.class public interface abstract Lcom/tencent/thumbplayer/tcmedia/core/drm/ITPMediaDrm$OnKeyStatusChangeListener;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/thumbplayer/tcmedia/core/drm/ITPMediaDrm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnKeyStatusChangeListener"
.end annotation


# virtual methods
.method public abstract onKeyStatusChange(Lcom/tencent/thumbplayer/tcmedia/core/drm/ITPMediaDrm;[BLjava/util/List;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/thumbplayer/tcmedia/core/drm/ITPMediaDrm;",
            "[B",
            "Ljava/util/List<",
            "Landroid/media/MediaDrm$KeyStatus;",
            ">;Z)V"
        }
    .end annotation
.end method
