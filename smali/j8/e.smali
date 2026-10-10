.class public Lj8/e;
.super Lj2/c;
.source "GlideAnimationModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lj2/c;-><init>()V

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
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/bumptech/glide/c;Lcom/bumptech/glide/Registry;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/bumptech/glide/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/bumptech/glide/Registry;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Lj2/c;->a(Landroid/content/Context;Lcom/bumptech/glide/c;Lcom/bumptech/glide/Registry;)V

    .line 4
    .line 5
    new-instance p1, Lj8/b;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Lj8/b;-><init>()V

    .line 9
    .line 10
    new-instance v0, Lj8/f;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1}, Lj8/f;-><init>(Lt1/f;)V

    .line 14
    .line 15
    const-class v1, Ljava/io/InputStream;

    .line 16
    .line 17
    const-class v2, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3, v1, v2, v0}, Lcom/bumptech/glide/Registry;->o(Ljava/lang/Class;Ljava/lang/Class;Lt1/f;)Lcom/bumptech/glide/Registry;

    .line 21
    .line 22
    const-class v0, Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, v0, v2, p1}, Lcom/bumptech/glide/Registry;->o(Ljava/lang/Class;Ljava/lang/Class;Lt1/f;)Lcom/bumptech/glide/Registry;

    .line 26
    .line 27
    new-instance p1, Lj8/d;

    .line 28
    .line 29
    .line 30
    invoke-direct {p1}, Lj8/d;-><init>()V

    .line 31
    .line 32
    const-class v0, Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3, v2, v0, p1}, Lcom/bumptech/glide/Registry;->s(Ljava/lang/Class;Ljava/lang/Class;Lh2/e;)Lcom/bumptech/glide/Registry;

    .line 36
    .line 37
    new-instance p1, Lj8/c;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/bumptech/glide/c;->f()Lw1/d;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, p2}, Lj8/c;-><init>(Lw1/d;)V

    .line 45
    .line 46
    const-class p2, Landroid/graphics/Bitmap;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3, v2, p2, p1}, Lcom/bumptech/glide/Registry;->s(Ljava/lang/Class;Ljava/lang/Class;Lh2/e;)Lcom/bumptech/glide/Registry;

    .line 50
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method
