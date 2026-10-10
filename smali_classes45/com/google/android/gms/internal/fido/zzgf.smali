.class public abstract Lcom/google/android/gms/internal/fido/zzgf;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fido@@21.0.0"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/fido/zzgf;

.field private static final zzb:Lcom/google/android/gms/internal/fido/zzgf;

.field private static final zzc:Lcom/google/android/gms/internal/fido/zzgf;

.field private static final zzd:Lcom/google/android/gms/internal/fido/zzgf;

.field private static final zze:Lcom/google/android/gms/internal/fido/zzgf;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/fido/zzgd;

    .line 3
    .line 4
    const/16 v1, 0x3d

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-string v2, "base64()"

    .line 11
    .line 12
    const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/fido/zzgd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    .line 16
    .line 17
    sput-object v0, Lcom/google/android/gms/internal/fido/zzgf;->zza:Lcom/google/android/gms/internal/fido/zzgf;

    .line 18
    .line 19
    new-instance v0, Lcom/google/android/gms/internal/fido/zzgd;

    .line 20
    .line 21
    const-string v2, "base64Url()"

    .line 22
    .line 23
    const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/fido/zzgd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    .line 27
    .line 28
    sput-object v0, Lcom/google/android/gms/internal/fido/zzgf;->zzb:Lcom/google/android/gms/internal/fido/zzgf;

    .line 29
    .line 30
    new-instance v0, Lcom/google/android/gms/internal/fido/zzge;

    .line 31
    .line 32
    const-string v2, "base32()"

    .line 33
    .line 34
    const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/fido/zzge;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    .line 38
    .line 39
    sput-object v0, Lcom/google/android/gms/internal/fido/zzgf;->zzc:Lcom/google/android/gms/internal/fido/zzgf;

    .line 40
    .line 41
    new-instance v0, Lcom/google/android/gms/internal/fido/zzge;

    .line 42
    .line 43
    const-string v2, "base32Hex()"

    .line 44
    .line 45
    const-string v3, "0123456789ABCDEFGHIJKLMNOPQRSTUV"

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/fido/zzge;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    .line 49
    .line 50
    sput-object v0, Lcom/google/android/gms/internal/fido/zzgf;->zzd:Lcom/google/android/gms/internal/fido/zzgf;

    .line 51
    .line 52
    new-instance v0, Lcom/google/android/gms/internal/fido/zzgc;

    .line 53
    .line 54
    const-string v1, "base16()"

    .line 55
    .line 56
    const-string v2, "0123456789ABCDEF"

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/fido/zzgc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    sput-object v0, Lcom/google/android/gms/internal/fido/zzgf;->zze:Lcom/google/android/gms/internal/fido/zzgf;

    .line 62
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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

.method public static zzf()Lcom/google/android/gms/internal/fido/zzgf;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/fido/zzgf;->zze:Lcom/google/android/gms/internal/fido/zzgf;

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
.method public abstract zzb(Ljava/lang/Appendable;[BII)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract zzc(I)I
.end method

.method public abstract zzd()Lcom/google/android/gms/internal/fido/zzgf;
.end method

.method public final zzg([BII)Ljava/lang/String;
    .locals 2

    .line 1
    array-length p2, p1

    .line 2
    const/4 v0, 0x0

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p3, p2}, Lcom/google/android/gms/internal/fido/zzbm;->zze(III)V

    .line 6
    .line 7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/fido/zzgf;->zzc(I)I

    .line 11
    move-result v1

    .line 12
    .line 13
    .line 14
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0, p2, p1, v0, p3}, Lcom/google/android/gms/internal/fido/zzgf;->zzb(Ljava/lang/Appendable;[BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :catch_0
    move-exception p1

    .line 24
    .line 25
    new-instance p2, Ljava/lang/AssertionError;

    .line 26
    .line 27
    .line 28
    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 29
    throw p2
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
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
.end method
