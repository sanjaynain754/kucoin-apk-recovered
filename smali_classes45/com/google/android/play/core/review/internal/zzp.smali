.class final Lcom/google/android/play/core/review/internal/zzp;
.super Lcom/google/android/play/core/review/internal/zzj;
.source "com.google.android.play:review@@2.0.2"


# instance fields
.field final synthetic zza:Landroid/os/IBinder;

.field final synthetic zzb:Lcom/google/android/play/core/review/internal/zzr;


# direct methods
.method public constructor <init>(Lcom/google/android/play/core/review/internal/zzr;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    .line 2
    iput-object p2, p0, Lcom/google/android/play/core/review/internal/zzp;->zza:Landroid/os/IBinder;

    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/play/core/review/internal/zzp;->zzb:Lcom/google/android/play/core/review/internal/zzr;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/play/core/review/internal/zzj;-><init>()V

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
    .line 44
    .line 45
.end method


# virtual methods
.method public final zza()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/play/core/review/internal/zzp;->zza:Landroid/os/IBinder;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/play/core/review/internal/zze;->zzb(Landroid/os/IBinder;)Lcom/google/android/play/core/review/internal/zzf;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/play/core/review/internal/zzp;->zzb:Lcom/google/android/play/core/review/internal/zzr;

    .line 9
    .line 10
    iget-object v1, v1, Lcom/google/android/play/core/review/internal/zzr;->zza:Lcom/google/android/play/core/review/internal/zzt;

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/google/android/play/core/review/internal/zzt;->zzm(Lcom/google/android/play/core/review/internal/zzt;Landroid/os/IInterface;)V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/play/core/review/internal/zzp;->zzb:Lcom/google/android/play/core/review/internal/zzr;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/google/android/play/core/review/internal/zzr;->zza:Lcom/google/android/play/core/review/internal/zzt;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/google/android/play/core/review/internal/zzt;->zzq(Lcom/google/android/play/core/review/internal/zzt;)V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/play/core/review/internal/zzp;->zzb:Lcom/google/android/play/core/review/internal/zzr;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/google/android/play/core/review/internal/zzr;->zza:Lcom/google/android/play/core/review/internal/zzt;

    .line 25
    const/4 v1, 0x0

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lcom/google/android/play/core/review/internal/zzt;->zzl(Lcom/google/android/play/core/review/internal/zzt;Z)V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/play/core/review/internal/zzp;->zzb:Lcom/google/android/play/core/review/internal/zzr;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/google/android/play/core/review/internal/zzr;->zza:Lcom/google/android/play/core/review/internal/zzt;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/google/android/play/core/review/internal/zzt;->zzh(Lcom/google/android/play/core/review/internal/zzt;)Ljava/util/List;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    move-result v1

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    check-cast v1, Ljava/lang/Runnable;

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_0
    iget-object v0, p0, Lcom/google/android/play/core/review/internal/zzp;->zzb:Lcom/google/android/play/core/review/internal/zzr;

    .line 59
    .line 60
    iget-object v0, v0, Lcom/google/android/play/core/review/internal/zzr;->zza:Lcom/google/android/play/core/review/internal/zzt;

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lcom/google/android/play/core/review/internal/zzt;->zzh(Lcom/google/android/play/core/review/internal/zzt;)Ljava/util/List;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 68
    return-void
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method
