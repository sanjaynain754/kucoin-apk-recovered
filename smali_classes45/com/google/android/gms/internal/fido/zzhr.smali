.class public final Lcom/google/android/gms/internal/fido/zzhr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fido@@21.0.0"


# instance fields
.field private final zza:B

.field private final zzb:B


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    and-int/lit16 v0, p1, 0xe0

    .line 6
    int-to-byte v0, v0

    .line 7
    .line 8
    iput-byte v0, p0, Lcom/google/android/gms/internal/fido/zzhr;->zza:B

    .line 9
    .line 10
    and-int/lit8 p1, p1, 0x1f

    .line 11
    int-to-byte p1, p1

    .line 12
    .line 13
    iput-byte p1, p0, Lcom/google/android/gms/internal/fido/zzhr;->zzb:B

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public final zza()B
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p0, Lcom/google/android/gms/internal/fido/zzhr;->zzb:B

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final zzb()B
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p0, Lcom/google/android/gms/internal/fido/zzhr;->zza:B

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final zzc()I
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p0, Lcom/google/android/gms/internal/fido/zzhr;->zza:B

    .line 3
    .line 4
    shr-int/lit8 v0, v0, 0x5

    .line 5
    .line 6
    and-int/lit8 v0, v0, 0x7

    .line 7
    return v0
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
.end method
