.class public final Lqt/a;
.super Ljava/lang/Object;
.source "GlideUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tJ\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/payment/chat/utils/GlideUtils;",
        "",
        "<init>",
        "()V",
        "loadHeadImage",
        "",
        "imageView",
        "Landroid/widget/ImageView;",
        "avatar",
        "",
        "loadScaledImage",
        "context",
        "Landroid/content/Context;",
        "path",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGlideUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlideUtils.kt\ncom/kubi/payment/chat/utils/GlideUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lqt/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lqt/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lqt/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lqt/a;->a:Lqt/a;

    .line 8
    return-void
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/ImageView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "path"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "imageView"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 21
    const/4 v1, 0x1

    .line 22
    .line 23
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 24
    .line 25
    .line 26
    invoke-static {p2, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 27
    .line 28
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 29
    .line 30
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 31
    int-to-float v3, v0

    .line 32
    int-to-float v4, v2

    .line 33
    div-float/2addr v3, v4

    .line 34
    const/4 v4, 0x0

    .line 35
    .line 36
    cmpg-float v4, v4, v3

    .line 37
    .line 38
    const/16 v5, 0x190

    .line 39
    .line 40
    const/16 v6, 0x64

    .line 41
    .line 42
    if-gtz v4, :cond_2

    .line 43
    .line 44
    const/high16 v4, 0x3e800000    # 0.25f

    .line 45
    .line 46
    cmpg-float v4, v3, v4

    .line 47
    .line 48
    if-gtz v4, :cond_2

    .line 49
    .line 50
    if-le v0, v6, :cond_0

    .line 51
    move v2, v5

    .line 52
    move v0, v6

    .line 53
    goto :goto_2

    .line 54
    .line 55
    :cond_0
    const/16 v2, 0x32

    .line 56
    .line 57
    if-ge v0, v2, :cond_1

    .line 58
    .line 59
    const/16 v0, 0xc8

    .line 60
    :goto_0
    move v7, v2

    .line 61
    move v2, v0

    .line 62
    move v0, v7

    .line 63
    goto :goto_2

    .line 64
    .line 65
    :cond_1
    mul-int/lit8 v2, v0, 0x4

    .line 66
    goto :goto_2

    .line 67
    .line 68
    :cond_2
    const/high16 v4, 0x40400000    # 3.0f

    .line 69
    .line 70
    cmpl-float v4, v3, v4

    .line 71
    .line 72
    if-lez v4, :cond_5

    .line 73
    .line 74
    const/16 v0, 0x12c

    .line 75
    .line 76
    if-le v2, v0, :cond_3

    .line 77
    .line 78
    const/16 v2, 0x384

    .line 79
    goto :goto_0

    .line 80
    .line 81
    :cond_3
    if-ge v2, v6, :cond_4

    .line 82
    :goto_1
    move v2, v6

    .line 83
    goto :goto_2

    .line 84
    .line 85
    :cond_4
    mul-int/lit8 v0, v2, 0x3

    .line 86
    goto :goto_2

    .line 87
    .line 88
    :cond_5
    if-le v2, v5, :cond_6

    .line 89
    int-to-float v0, v5

    .line 90
    mul-float/2addr v0, v3

    .line 91
    float-to-int v0, v0

    .line 92
    move v2, v5

    .line 93
    goto :goto_2

    .line 94
    .line 95
    :cond_6
    if-ge v2, v6, :cond_7

    .line 96
    int-to-float v0, v6

    .line 97
    mul-float/2addr v0, v3

    .line 98
    float-to-int v0, v0

    .line 99
    goto :goto_1

    .line 100
    .line 101
    .line 102
    :cond_7
    :goto_2
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 103
    move-result-object v3

    .line 104
    .line 105
    iput v2, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 106
    .line 107
    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 108
    .line 109
    .line 110
    invoke-virtual {p3, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, Lcom/bumptech/glide/c;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/h;->v(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/g;->E0(Landroid/widget/ImageView;)Lm2/k;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p3, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 125
    return-void
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method
