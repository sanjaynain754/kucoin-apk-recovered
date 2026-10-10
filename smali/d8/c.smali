.class public Ld8/c;
.super Ljava/lang/Object;
.source "AVIFParser.java"


# direct methods
.method public static a(Lcom/github/penfeizhou/animation/io/Reader;)Z
    .locals 1

    .line 1
    .line 2
    instance-of v0, p0, Le8/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Le8/a;

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    new-instance v0, Le8/a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, Le8/a;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 13
    move-object p0, v0

    .line 14
    .line 15
    .line 16
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Le8/a;->a()Ljava/nio/ByteBuffer;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lorg/aomedia/avif/android/AvifDecoder;->isAvifImage(Ljava/nio/ByteBuffer;)Z

    .line 21
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    return p0

    .line 23
    :catch_0
    const/4 p0, 0x0

    .line 24
    return p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method
