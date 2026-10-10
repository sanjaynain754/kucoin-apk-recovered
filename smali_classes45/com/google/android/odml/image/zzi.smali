.class final Lcom/google/android/odml/image/zzi;
.super Ljava/lang/Object;
.source "com.google.android.odml:image@@1.0.0-beta1"

# interfaces
.implements Lcom/google/android/odml/image/zzg;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x13
.end annotation


# instance fields
.field private final zza:Landroid/media/Image;

.field private final zzb:Lcom/google/android/odml/image/ImageProperties;


# direct methods
.method public constructor <init>(Landroid/media/Image;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/odml/image/zzi;->zza:Landroid/media/Image;

    .line 6
    .line 7
    new-instance v0, Lcom/google/android/odml/image/zzb;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/android/odml/image/zzb;-><init>()V

    .line 11
    const/4 v1, 0x3

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/odml/image/zzh;->zzb(I)Lcom/google/android/odml/image/zzh;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/media/Image;->getFormat()I

    .line 18
    move-result p1

    .line 19
    .line 20
    const/16 v1, 0x2a

    .line 21
    .line 22
    if-ne p1, v1, :cond_0

    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    const/16 v1, 0x29

    .line 27
    .line 28
    if-ne p1, v1, :cond_1

    .line 29
    const/4 p1, 0x2

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_1
    const/16 v1, 0x23

    .line 33
    .line 34
    if-eq p1, v1, :cond_3

    .line 35
    .line 36
    const/16 v1, 0x100

    .line 37
    .line 38
    if-eq p1, v1, :cond_2

    .line 39
    const/4 p1, 0x0

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_2
    const/16 p1, 0x9

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 p1, 0x7

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {v0, p1}, Lcom/google/android/odml/image/zzh;->zza(I)Lcom/google/android/odml/image/zzh;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/google/android/odml/image/zzh;->zzc()Lcom/google/android/odml/image/ImageProperties;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    iput-object p1, p0, Lcom/google/android/odml/image/zzi;->zzb:Lcom/google/android/odml/image/ImageProperties;

    .line 54
    return-void
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


# virtual methods
.method public final zza()Landroid/media/Image;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/odml/image/zzi;->zza:Landroid/media/Image;

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

.method public final zzb()Lcom/google/android/odml/image/ImageProperties;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/odml/image/zzi;->zzb:Lcom/google/android/odml/image/ImageProperties;

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

.method public final zzc()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/odml/image/zzi;->zza:Landroid/media/Image;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/Image;->close()V

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
.end method
