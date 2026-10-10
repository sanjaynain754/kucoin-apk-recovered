.class public Lcom/google/android/odml/image/BitmapMlImageBuilder;
.super Ljava/lang/Object;
.source "com.google.android.odml:image@@1.0.0-beta1"


# instance fields
.field private final zza:Landroid/graphics/Bitmap;

.field private zzb:I

.field private zzc:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-static {p1, p2}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/odml/image/BitmapMlImageBuilder;-><init>(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 3
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/odml/image/BitmapMlImageBuilder;->zza:Landroid/graphics/Bitmap;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/odml/image/BitmapMlImageBuilder;->zzb:I

    new-instance v1, Landroid/graphics/Rect;

    .line 2
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    invoke-direct {v1, v0, v0, v2, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v1, p0, Lcom/google/android/odml/image/BitmapMlImageBuilder;->zzc:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/odml/image/MlImage;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/odml/image/MlImage;

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/odml/image/zze;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/android/odml/image/BitmapMlImageBuilder;->zza:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Lcom/google/android/odml/image/zze;-><init>(Landroid/graphics/Bitmap;)V

    .line 10
    .line 11
    iget v2, p0, Lcom/google/android/odml/image/BitmapMlImageBuilder;->zzb:I

    .line 12
    .line 13
    iget-object v3, p0, Lcom/google/android/odml/image/BitmapMlImageBuilder;->zzc:Landroid/graphics/Rect;

    .line 14
    .line 15
    iget-object v4, p0, Lcom/google/android/odml/image/BitmapMlImageBuilder;->zza:Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 19
    move-result v6

    .line 20
    .line 21
    iget-object v4, p0, Lcom/google/android/odml/image/BitmapMlImageBuilder;->zza:Landroid/graphics/Bitmap;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 25
    move-result v7

    .line 26
    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v0 .. v7}, Lcom/google/android/odml/image/MlImage;-><init>(Lcom/google/android/odml/image/zzg;ILandroid/graphics/Rect;JII)V

    .line 31
    return-object v0
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

.method public setRotation(I)Lcom/google/android/odml/image/BitmapMlImageBuilder;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/odml/image/MlImage;->zzc(I)V

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/odml/image/BitmapMlImageBuilder;->zzb:I

    .line 6
    return-object p0
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
