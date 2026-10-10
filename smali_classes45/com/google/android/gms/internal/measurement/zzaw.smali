.class public final Lcom/google/android/gms/internal/measurement/zzaw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement@@22.5.0"


# instance fields
.field final zza:Ljava/util/Map;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field final zzb:Lcom/google/android/gms/internal/measurement/zzbi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaw;->zza:Ljava/util/Map;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbi;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzbi;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaw;->zzb:Lcom/google/android/gms/internal/measurement/zzbi;

    .line 18
    .line 19
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzau;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzau;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaw;->zza(Lcom/google/android/gms/internal/measurement/zzav;)V

    .line 26
    .line 27
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzax;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzax;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaw;->zza(Lcom/google/android/gms/internal/measurement/zzav;)V

    .line 34
    .line 35
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzay;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzay;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaw;->zza(Lcom/google/android/gms/internal/measurement/zzav;)V

    .line 42
    .line 43
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbb;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzbb;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaw;->zza(Lcom/google/android/gms/internal/measurement/zzav;)V

    .line 50
    .line 51
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbg;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzbg;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaw;->zza(Lcom/google/android/gms/internal/measurement/zzav;)V

    .line 58
    .line 59
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbh;

    .line 60
    .line 61
    .line 62
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzbh;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaw;->zza(Lcom/google/android/gms/internal/measurement/zzav;)V

    .line 66
    .line 67
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbj;

    .line 68
    .line 69
    .line 70
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzbj;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaw;->zza(Lcom/google/android/gms/internal/measurement/zzav;)V

    .line 74
    return-void
    .line 75
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/measurement/zzav;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzav;->zza:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzbk;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzbk;->zzb()Ljava/lang/Integer;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzaw;->zza:Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
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

.method public final zzb(Lcom/google/android/gms/internal/measurement/zzg;Lcom/google/android/gms/internal/measurement/zzao;)Lcom/google/android/gms/internal/measurement/zzao;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzh;->zzl(Lcom/google/android/gms/internal/measurement/zzg;)I

    .line 4
    .line 5
    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/zzap;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p2, Lcom/google/android/gms/internal/measurement/zzap;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzap;->zzg()Ljava/util/ArrayList;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzap;->zzb()Ljava/lang/String;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzaw;->zza:Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 23
    move-result v2

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzav;

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzaw;->zzb:Lcom/google/android/gms/internal/measurement/zzbi;

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {v1, p2, p1, v0}, Lcom/google/android/gms/internal/measurement/zzav;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzg;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/zzao;

    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_1
    return-object p2
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
