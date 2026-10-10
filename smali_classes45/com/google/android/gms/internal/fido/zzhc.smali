.class public final Lcom/google/android/gms/internal/fido/zzhc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fido@@21.0.0"


# static fields
.field static final zza:Ljava/nio/charset/Charset;

.field static final zzb:Ljava/nio/charset/Charset;

.field static final zzc:Ljava/nio/charset/Charset;

.field public static final zzd:[B

.field public static final zze:Ljava/nio/ByteBuffer;

.field public static final zzf:Lcom/google/android/gms/internal/fido/zzhb;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    const-string v0, "US-ASCII"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lcom/google/android/gms/internal/fido/zzhc;->zza:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    const-string v0, "UTF-8"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lcom/google/android/gms/internal/fido/zzhc;->zzb:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    const-string v0, "ISO-8859-1"

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sput-object v0, Lcom/google/android/gms/internal/fido/zzhc;->zzc:Ljava/nio/charset/Charset;

    .line 25
    const/4 v0, 0x0

    .line 26
    .line 27
    new-array v2, v0, [B

    .line 28
    .line 29
    sput-object v2, Lcom/google/android/gms/internal/fido/zzhc;->zzd:[B

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    sput-object v1, Lcom/google/android/gms/internal/fido/zzhc;->zze:Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    sget v1, Lcom/google/android/gms/internal/fido/zzhb;->zza:I

    .line 38
    .line 39
    new-instance v1, Lcom/google/android/gms/internal/fido/zzgz;

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/fido/zzgz;-><init>([BIIZLcom/google/android/gms/internal/fido/zzgy;)V

    .line 47
    .line 48
    .line 49
    :try_start_0
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/fido/zzgz;->zza(I)I
    :try_end_0
    .catch Lcom/google/android/gms/internal/fido/zzhd; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    sput-object v1, Lcom/google/android/gms/internal/fido/zzhc;->zzf:Lcom/google/android/gms/internal/fido/zzhb;

    .line 52
    return-void

    .line 53
    :catch_0
    move-exception v0

    .line 54
    .line 55
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    .line 58
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 59
    throw v1
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
