.class public interface abstract Lcom/google/android/gms/internal/fido/zzm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fido@@21.0.0"

# interfaces
.implements Landroid/os/IInterface;


# virtual methods
.method public abstract zzb(Lcom/google/android/gms/common/api/Status;Landroid/app/PendingIntent;)V
    .param p2    # Landroid/app/PendingIntent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
