.class public Lcom/squareup/picasso/u;
.super Lcom/squareup/picasso/t;
.source "ResourceRequestHandler.java"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/squareup/picasso/t;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/squareup/picasso/u;->a:Landroid/content/Context;

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
    .line 24
    .line 25
.end method

.method public static j(Landroid/content/res/Resources;ILcom/squareup/picasso/r;)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, Lcom/squareup/picasso/t;->d(Lcom/squareup/picasso/r;)Landroid/graphics/BitmapFactory$Options;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/squareup/picasso/t;->g(Landroid/graphics/BitmapFactory$Options;)Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0, p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    iget v1, p2, Lcom/squareup/picasso/r;->h:I

    .line 16
    .line 17
    iget v2, p2, Lcom/squareup/picasso/r;->i:I

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2, v0, p2}, Lcom/squareup/picasso/t;->b(IILandroid/graphics/BitmapFactory$Options;Lcom/squareup/picasso/r;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {p0, p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 24
    move-result-object p0

    .line 25
    return-object p0
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
    .line 105
.end method


# virtual methods
.method public c(Lcom/squareup/picasso/r;)Z
    .locals 1

    .line 1
    .line 2
    iget v0, p1, Lcom/squareup/picasso/r;->e:I

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    .line 8
    :cond_0
    iget-object p1, p1, Lcom/squareup/picasso/r;->d:Landroid/net/Uri;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    const-string v0, "android.resource"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    move-result p1

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public f(Lcom/squareup/picasso/r;I)Lcom/squareup/picasso/t$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object p2, p0, Lcom/squareup/picasso/u;->a:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p1}, Lcom/squareup/picasso/y;->m(Landroid/content/Context;Lcom/squareup/picasso/r;)Landroid/content/res/Resources;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    .line 9
    invoke-static {p2, p1}, Lcom/squareup/picasso/y;->l(Landroid/content/res/Resources;Lcom/squareup/picasso/r;)I

    .line 10
    move-result v0

    .line 11
    .line 12
    new-instance v1, Lcom/squareup/picasso/t$a;

    .line 13
    .line 14
    .line 15
    invoke-static {p2, v0, p1}, Lcom/squareup/picasso/u;->j(Landroid/content/res/Resources;ILcom/squareup/picasso/r;)Landroid/graphics/Bitmap;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    sget-object p2, Lcom/squareup/picasso/Picasso$LoadedFrom;->DISK:Lcom/squareup/picasso/Picasso$LoadedFrom;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p1, p2}, Lcom/squareup/picasso/t$a;-><init>(Landroid/graphics/Bitmap;Lcom/squareup/picasso/Picasso$LoadedFrom;)V

    .line 22
    return-object v1
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
.end method
