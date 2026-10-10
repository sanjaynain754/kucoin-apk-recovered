.class public final Lcom/google/android/gms/internal/mlkit_common/zzss;
.super Ljava/lang/Object;
.source "com.google.mlkit:common@@18.11.0"


# static fields
.field private static zza:Lcom/google/android/gms/internal/mlkit_common/zzsr;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public static declared-synchronized zza(Lcom/google/android/gms/internal/mlkit_common/zzsb;)Lcom/google/android/gms/internal/mlkit_common/zzsh;
    .locals 3

    .line 1
    .line 2
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzss;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzss;->zza:Lcom/google/android/gms/internal/mlkit_common/zzsr;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzsr;

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzsr;-><init>(Lcom/google/android/gms/internal/mlkit_common/zzsq;)V

    .line 14
    .line 15
    sput-object v1, Lcom/google/android/gms/internal/mlkit_common/zzss;->zza:Lcom/google/android/gms/internal/mlkit_common/zzsr;

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_0
    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzss;->zza:Lcom/google/android/gms/internal/mlkit_common/zzsr;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Lcom/google/mlkit/common/sdkinternal/LazyInstanceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    check-cast p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    monitor-exit v0

    .line 28
    return-object p0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p0
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

.method public static declared-synchronized zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzsh;
    .locals 1

    .line 1
    .line 2
    const-class p0, Lcom/google/android/gms/internal/mlkit_common/zzss;

    .line 3
    monitor-enter p0

    .line 4
    .line 5
    :try_start_0
    const-string v0, "common"

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_common/zzsb;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzsa;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzsa;->zzd()Lcom/google/android/gms/internal/mlkit_common/zzsb;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_common/zzss;->zza(Lcom/google/android/gms/internal/mlkit_common/zzsb;)Lcom/google/android/gms/internal/mlkit_common/zzsh;

    .line 17
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    monitor-exit p0

    .line 19
    return-object v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw v0
    .line 23
.end method
