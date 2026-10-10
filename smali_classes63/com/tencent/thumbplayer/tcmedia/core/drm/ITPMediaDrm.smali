.class public interface abstract Lcom/tencent/thumbplayer/tcmedia/core/drm/ITPMediaDrm;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/thumbplayer/tcmedia/core/drm/ITPMediaDrm$OnExpirationUpdateListener;,
        Lcom/tencent/thumbplayer/tcmedia/core/drm/ITPMediaDrm$OnKeyStatusChangeListener;,
        Lcom/tencent/thumbplayer/tcmedia/core/drm/ITPMediaDrm$OnEventListener;
    }
.end annotation


# virtual methods
.method public abstract close()V
.end method

.method public abstract closeSession([B)V
.end method

.method public abstract getKeyRequest([B[BLjava/lang/String;ILjava/util/HashMap;)Landroid/media/MediaDrm$KeyRequest;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B[B",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/media/MediaDrm$KeyRequest;"
        }
    .end annotation
.end method

.method public abstract getPropertyString(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getProvisionRequest()Landroid/media/MediaDrm$ProvisionRequest;
.end method

.method public abstract openSession()[B
.end method

.method public abstract provideKeyResponse([B[B)[B
.end method

.method public abstract provideProvisionResponse([B)V
.end method

.method public abstract queryKeyStatus([B)Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract removeKeys([B)V
.end method

.method public abstract restoreKeys([B[B)V
.end method

.method public abstract setOnExpirationUpdateListener(Lcom/tencent/thumbplayer/tcmedia/core/drm/ITPMediaDrm$OnExpirationUpdateListener;Landroid/os/Handler;)V
.end method

.method public abstract setOnKeyStatusChangeListener(Lcom/tencent/thumbplayer/tcmedia/core/drm/ITPMediaDrm$OnKeyStatusChangeListener;Landroid/os/Handler;)V
.end method

.method public abstract setPropertyString(Ljava/lang/String;Ljava/lang/String;)V
.end method
