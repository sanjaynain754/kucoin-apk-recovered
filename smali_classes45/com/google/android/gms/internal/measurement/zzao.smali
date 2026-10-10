.class public interface abstract Lcom/google/android/gms/internal/measurement/zzao;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement@@22.5.0"


# static fields
.field public static final zzf:Lcom/google/android/gms/internal/measurement/zzao;

.field public static final zzg:Lcom/google/android/gms/internal/measurement/zzao;

.field public static final zzh:Lcom/google/android/gms/internal/measurement/zzao;

.field public static final zzi:Lcom/google/android/gms/internal/measurement/zzao;

.field public static final zzj:Lcom/google/android/gms/internal/measurement/zzao;

.field public static final zzk:Lcom/google/android/gms/internal/measurement/zzao;

.field public static final zzl:Lcom/google/android/gms/internal/measurement/zzao;

.field public static final zzm:Lcom/google/android/gms/internal/measurement/zzao;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzat;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzat;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzao;->zzf:Lcom/google/android/gms/internal/measurement/zzao;

    .line 8
    .line 9
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzam;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzam;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzao;->zzg:Lcom/google/android/gms/internal/measurement/zzao;

    .line 15
    .line 16
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzag;

    .line 17
    .line 18
    const-string v1, "continue"

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzag;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzao;->zzh:Lcom/google/android/gms/internal/measurement/zzao;

    .line 24
    .line 25
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzag;

    .line 26
    .line 27
    const-string v1, "break"

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzag;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzao;->zzi:Lcom/google/android/gms/internal/measurement/zzao;

    .line 33
    .line 34
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzag;

    .line 35
    .line 36
    .line 37
    const-string/jumbo v1, "return"

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzag;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzao;->zzj:Lcom/google/android/gms/internal/measurement/zzao;

    .line 43
    .line 44
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 45
    .line 46
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>(Ljava/lang/Boolean;)V

    .line 50
    .line 51
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzao;->zzk:Lcom/google/android/gms/internal/measurement/zzao;

    .line 52
    .line 53
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 54
    .line 55
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>(Ljava/lang/Boolean;)V

    .line 59
    .line 60
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzao;->zzl:Lcom/google/android/gms/internal/measurement/zzao;

    .line 61
    .line 62
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzas;

    .line 63
    .line 64
    const-string v1, ""

    .line 65
    .line 66
    .line 67
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzao;->zzm:Lcom/google/android/gms/internal/measurement/zzao;

    .line 70
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method


# virtual methods
.method public abstract zzc()Ljava/lang/String;
.end method

.method public abstract zzcA(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzg;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/zzao;
.end method

.method public abstract zzd()Ljava/lang/Double;
.end method

.method public abstract zze()Ljava/lang/Boolean;
.end method

.method public abstract zzf()Ljava/util/Iterator;
.end method

.method public abstract zzt()Lcom/google/android/gms/internal/measurement/zzao;
.end method
