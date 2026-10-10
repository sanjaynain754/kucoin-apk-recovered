.class public final Lcom/jumio/ale/swig/AESGCMInputStream;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0008\u0010\u0015\u001a\u00020\u000eH\u0016J\u0008\u0010\u0016\u001a\u00020\u0017H\u0016J\u0008\u0010\u0018\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/jumio/ale/swig/AESGCMInputStream;",
        "Ljava/io/FilterInputStream;",
        "input",
        "Ljava/io/InputStream;",
        "key",
        "",
        "iv",
        "<init>",
        "(Ljava/io/InputStream;[B[B)V",
        "aesgcm",
        "Lcom/jumio/ale/swig/AESGCM;",
        "read",
        "finished",
        "",
        "",
        "buffer",
        "offset",
        "length",
        "skip",
        "",
        "n",
        "available",
        "close",
        "",
        "markSupported",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljava/io/InputStream;

.field public final b:Lcom/jumio/ale/swig/AESGCM;

.field public c:[B

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;[B[B)V
    .locals 2
    .param p1    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "input"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "key"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "iv"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->a:Ljava/io/InputStream;

    .line 21
    .line 22
    new-instance p1, Lcom/jumio/ale/swig/AESGCM;

    .line 23
    .line 24
    .line 25
    invoke-direct {p1}, Lcom/jumio/ale/swig/AESGCM;-><init>()V

    .line 26
    .line 27
    iput-object p1, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->b:Lcom/jumio/ale/swig/AESGCM;

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    new-array v1, v0, [B

    .line 31
    .line 32
    iput-object v1, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->c:[B

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/jumio/ale/swig/AESGCM;->setKey([B)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p3}, Lcom/jumio/ale/swig/AESGCM;->setIV([B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lcom/jumio/ale/swig/AESGCM;->setMode(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/jumio/ale/swig/AESGCM;->init()V

    .line 45
    return-void
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
.end method


# virtual methods
.method public available()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->a:Ljava/io/InputStream;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->a:Ljava/io/InputStream;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

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
.end method

.method public markSupported()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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
.end method

.method public read([B)I
    .locals 2
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/jumio/ale/swig/AESGCMInputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .locals 3
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->c:[B

    array-length v0, v0

    sub-int/2addr p3, p2

    if-ge v0, p3, :cond_0

    .line 3
    new-array v0, p3, [B

    iput-object v0, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->c:[B

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->a:Ljava/io/InputStream;

    iget-object v1, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->c:[B

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p3

    const/4 v0, -0x1

    if-eq p3, v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->b:Lcom/jumio/ale/swig/AESGCM;

    iget-object v1, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->c:[B

    invoke-virtual {v0, v1, p3, p1, p2}, Lcom/jumio/ale/swig/AESGCM;->update([BI[BI)I

    move-result p1

    return p1

    .line 6
    :cond_1
    iget-boolean p3, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->d:Z

    if-eqz p3, :cond_2

    return v0

    :cond_2
    const/4 p3, 0x1

    .line 7
    iput-boolean p3, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->d:Z

    .line 8
    iget-object p3, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->b:Lcom/jumio/ale/swig/AESGCM;

    invoke-virtual {p3, p1, p2}, Lcom/jumio/ale/swig/AESGCM;->finish([BI)I

    move-result p1

    return p1
.end method

.method public skip(J)J
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/ale/swig/AESGCMInputStream;->a:Ljava/io/InputStream;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
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
.end method
