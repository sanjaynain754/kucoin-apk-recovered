.class public final Lcom/google/android/gms/internal/fido/zzfj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fido@@21.0.0"


# static fields
.field private static final zza:[Ljava/lang/String;

.field private static final zzb:Lcom/google/android/gms/internal/fido/zzfn;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "com.google.common.flogger.util.StackWalkerStackGetter"

    .line 3
    .line 4
    const-string v1, "com.google.common.flogger.util.JavaLangAccessStackGetter"

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sput-object v0, Lcom/google/android/gms/internal/fido/zzfj;->zza:[Ljava/lang/String;

    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    const/4 v2, 0x2

    .line 14
    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    sget-object v2, Lcom/google/android/gms/internal/fido/zzfj;->zza:[Ljava/lang/String;

    .line 18
    .line 19
    aget-object v2, v2, v1

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    const-class v3, Lcom/google/android/gms/internal/fido/zzfn;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    new-array v3, v0, [Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    new-array v3, v0, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    check-cast v2, Lcom/google/android/gms/internal/fido/zzfn;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    const/4 v2, 0x0

    .line 46
    .line 47
    :goto_1
    if-eqz v2, :cond_0

    .line 48
    goto :goto_2

    .line 49
    .line 50
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/fido/zzfo;

    .line 54
    .line 55
    .line 56
    invoke-direct {v2}, Lcom/google/android/gms/internal/fido/zzfo;-><init>()V

    .line 57
    .line 58
    :goto_2
    sput-object v2, Lcom/google/android/gms/internal/fido/zzfj;->zzb:Lcom/google/android/gms/internal/fido/zzfn;

    .line 59
    return-void
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

.method public static zza(Ljava/lang/Class;I)Ljava/lang/StackTraceElement;
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo p1, "target"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/fido/zzfk;->zza(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    sget-object p1, Lcom/google/android/gms/internal/fido/zzfj;->zzb:Lcom/google/android/gms/internal/fido/zzfn;

    .line 9
    const/4 v0, 0x2

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, p0, v0}, Lcom/google/android/gms/internal/fido/zzfn;->zza(Ljava/lang/Class;I)Ljava/lang/StackTraceElement;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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
