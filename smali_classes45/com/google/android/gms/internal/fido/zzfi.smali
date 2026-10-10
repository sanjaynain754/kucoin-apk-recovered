.class public final Lcom/google/android/gms/internal/fido/zzfi;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fido@@21.0.0"


# static fields
.field private static final zza:Ljava/util/Comparator;

.field private static final zzb:Ljava/util/Comparator;

.field private static final zzc:Lcom/google/android/gms/internal/fido/zzfi;


# instance fields
.field private final zzd:Lcom/google/android/gms/internal/fido/zzfg;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/fido/zzfa;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/gms/internal/fido/zzfa;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/internal/fido/zzfi;->zza:Ljava/util/Comparator;

    .line 8
    .line 9
    new-instance v0, Lcom/google/android/gms/internal/fido/zzfb;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/google/android/gms/internal/fido/zzfb;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/google/android/gms/internal/fido/zzfi;->zzb:Ljava/util/Comparator;

    .line 15
    .line 16
    new-instance v0, Lcom/google/android/gms/internal/fido/zzfi;

    .line 17
    .line 18
    new-instance v1, Lcom/google/android/gms/internal/fido/zzfg;

    .line 19
    .line 20
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/fido/zzfg;-><init>(Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/fido/zzfi;-><init>(Lcom/google/android/gms/internal/fido/zzfg;)V

    .line 27
    .line 28
    sput-object v0, Lcom/google/android/gms/internal/fido/zzfi;->zzc:Lcom/google/android/gms/internal/fido/zzfi;

    .line 29
    return-void
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
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/fido/zzfg;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/gms/internal/fido/zzfi;->zzd:Lcom/google/android/gms/internal/fido/zzfg;

    .line 6
    return-void
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static zza()Lcom/google/android/gms/internal/fido/zzfi;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/fido/zzfi;->zzc:Lcom/google/android/gms/internal/fido/zzfi;

    .line 3
    return-object v0
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

.method public static bridge synthetic zzb()Ljava/util/Comparator;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/fido/zzfi;->zza:Ljava/util/Comparator;

    .line 3
    return-object v0
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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    .line 1
    .line 2
    instance-of v0, p1, Lcom/google/android/gms/internal/fido/zzfi;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/google/android/gms/internal/fido/zzfi;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/google/android/gms/internal/fido/zzfi;->zzd:Lcom/google/android/gms/internal/fido/zzfg;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/fido/zzfi;->zzd:Lcom/google/android/gms/internal/fido/zzfg;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
    .line 23
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/fido/zzfi;->zzd:Lcom/google/android/gms/internal/fido/zzfg;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/fido/zzfg;->hashCode()I

    .line 6
    move-result v0

    .line 7
    not-int v0, v0

    .line 8
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/fido/zzfi;->zzd:Lcom/google/android/gms/internal/fido/zzfg;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/fido/zzfg;->toString()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
