.class public final Lcom/google/android/gms/internal/fido/zzay;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fido@@21.0.0"


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Ljava/util/Set;

.field private final zzc:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 8

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/fido/zzcf;->zzk()Lcom/google/android/gms/internal/fido/zzcf;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v1, "com.google.android.gms.fido"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/fido/zzay;-><init>(Ljava/lang/String;Ljava/util/Set;ZZZZZ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/Set;ZZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "com.google.android.gms.fido"

    iput-object p1, p0, Lcom/google/android/gms/internal/fido/zzay;->zza:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/fido/zzay;->zzb:Ljava/util/Set;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/fido/zzay;->zzc:Z

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;J)Lcom/google/android/gms/internal/fido/zzaq;
    .locals 13
    .annotation build Lcom/google/android/apps/common/proguard/SideEffectFree;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/fido/zzaq;

    .line 3
    .line 4
    .line 5
    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    move-result-object v3

    .line 7
    .line 8
    new-instance v4, Lcom/google/android/gms/internal/fido/zzak;

    .line 9
    .line 10
    sget-object v11, Lcom/google/android/gms/internal/fido/zzav;->zza:Lcom/google/android/gms/internal/fido/zzav;

    .line 11
    .line 12
    new-instance v12, Lcom/google/android/gms/internal/fido/zzaw;

    .line 13
    .line 14
    const-class v1, Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    invoke-direct {v12, v1}, Lcom/google/android/gms/internal/fido/zzaw;-><init>(Ljava/lang/Class;)V

    .line 18
    .line 19
    iget-boolean v8, p0, Lcom/google/android/gms/internal/fido/zzay;->zzc:Z

    .line 20
    const/4 v9, 0x0

    .line 21
    .line 22
    iget-object v10, p0, Lcom/google/android/gms/internal/fido/zzay;->zzb:Ljava/util/Set;

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v4 .. v12}, Lcom/google/android/gms/internal/fido/zzak;-><init>(ZZZZZLjava/util/Set;Lcom/google/android/gms/internal/fido/zzax;Lcom/google/android/gms/internal/fido/zzax;)V

    .line 29
    .line 30
    iget-object v1, p0, Lcom/google/android/gms/internal/fido/zzay;->zza:Ljava/lang/String;

    .line 31
    const/4 v5, 0x1

    .line 32
    move-object v2, p1

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/fido/zzaq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/google/android/gms/internal/fido/zzak;Z)V

    .line 36
    return-object v0
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

.method public final zzb(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/fido/zzaq;
    .locals 10
    .annotation build Lcom/google/android/apps/common/proguard/SideEffectFree;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/fido/zzaq;

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/gms/internal/fido/zzak;

    .line 5
    .line 6
    sget-object v8, Lcom/google/android/gms/internal/fido/zzat;->zza:Lcom/google/android/gms/internal/fido/zzat;

    .line 7
    .line 8
    new-instance v9, Lcom/google/android/gms/internal/fido/zzau;

    .line 9
    .line 10
    const-class v2, Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-direct {v9, v2}, Lcom/google/android/gms/internal/fido/zzau;-><init>(Ljava/lang/Class;)V

    .line 14
    .line 15
    iget-boolean v5, p0, Lcom/google/android/gms/internal/fido/zzay;->zzc:Z

    .line 16
    const/4 v6, 0x0

    .line 17
    .line 18
    iget-object v7, p0, Lcom/google/android/gms/internal/fido/zzay;->zzb:Ljava/util/Set;

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    .line 23
    .line 24
    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/fido/zzak;-><init>(ZZZZZLjava/util/Set;Lcom/google/android/gms/internal/fido/zzax;Lcom/google/android/gms/internal/fido/zzax;)V

    .line 25
    .line 26
    iget-object v2, p0, Lcom/google/android/gms/internal/fido/zzay;->zza:Ljava/lang/String;

    .line 27
    const/4 v5, 0x1

    .line 28
    move-object v3, p2

    .line 29
    move-object v4, v1

    .line 30
    move-object v1, v2

    .line 31
    move-object v2, p1

    .line 32
    .line 33
    .line 34
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/fido/zzaq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/google/android/gms/internal/fido/zzak;Z)V

    .line 35
    return-object v0
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

.method public final zzc(Ljava/lang/String;Z)Lcom/google/android/gms/internal/fido/zzaq;
    .locals 13
    .annotation build Lcom/google/android/apps/common/proguard/SideEffectFree;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/fido/zzaq;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    move-result-object v3

    .line 7
    .line 8
    new-instance v4, Lcom/google/android/gms/internal/fido/zzak;

    .line 9
    .line 10
    sget-object v11, Lcom/google/android/gms/internal/fido/zzar;->zza:Lcom/google/android/gms/internal/fido/zzar;

    .line 11
    .line 12
    new-instance v12, Lcom/google/android/gms/internal/fido/zzas;

    .line 13
    .line 14
    const-class p2, Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    invoke-direct {v12, p2}, Lcom/google/android/gms/internal/fido/zzas;-><init>(Ljava/lang/Class;)V

    .line 18
    .line 19
    iget-boolean v8, p0, Lcom/google/android/gms/internal/fido/zzay;->zzc:Z

    .line 20
    const/4 v9, 0x0

    .line 21
    .line 22
    iget-object v10, p0, Lcom/google/android/gms/internal/fido/zzay;->zzb:Ljava/util/Set;

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v4 .. v12}, Lcom/google/android/gms/internal/fido/zzak;-><init>(ZZZZZLjava/util/Set;Lcom/google/android/gms/internal/fido/zzax;Lcom/google/android/gms/internal/fido/zzax;)V

    .line 29
    .line 30
    iget-object v1, p0, Lcom/google/android/gms/internal/fido/zzay;->zza:Ljava/lang/String;

    .line 31
    const/4 v5, 0x1

    .line 32
    move-object v2, p1

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/fido/zzaq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/google/android/gms/internal/fido/zzak;Z)V

    .line 36
    return-object v0
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

.method public final zzd()Lcom/google/android/gms/internal/fido/zzay;
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/fido/zzay;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/fido/zzay;->zza:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/android/gms/internal/fido/zzay;->zzb:Ljava/util/Set;

    .line 7
    const/4 v6, 0x1

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/fido/zzay;-><init>(Ljava/lang/String;Ljava/util/Set;ZZZZZ)V

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
.end method

.method public final zze(Ljava/util/Set;)Lcom/google/android/gms/internal/fido/zzay;
    .locals 8

    .line 1
    .line 2
    iget-boolean v6, p0, Lcom/google/android/gms/internal/fido/zzay;->zzc:Z

    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/fido/zzay;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/fido/zzay;->zza:Ljava/lang/String;

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    move-object v2, p1

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/fido/zzay;-><init>(Ljava/lang/String;Ljava/util/Set;ZZZZZ)V

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
