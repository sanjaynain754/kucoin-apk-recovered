.class public final Lcom/tencent/bugly/proguard/v4;
.super Ljava/lang/Object;
.source "BUGLY"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "GBK"

    iput-object v0, p0, Lcom/tencent/bugly/proguard/v4;->a:Ljava/lang/String;

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    const-string v0, "GBK"

    iput-object v0, p0, Lcom/tencent/bugly/proguard/v4;->a:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/v4;->a:Ljava/lang/String;

    const/4 p1, 0x0

    return p1
.end method

.method public a()Lcom/tencent/bugly/proguard/ja;
    .locals 7

    const-string/jumbo v0, "type mismatch, simple_list only support byte, tag: "

    const/4 v1, 0x0

    .line 2
    :try_start_0
    new-instance v2, Lcom/tencent/bugly/proguard/ka$a;

    invoke-direct {v2}, Lcom/tencent/bugly/proguard/ka$a;-><init>()V

    .line 3
    iget-object v3, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/ka;->a(Lcom/tencent/bugly/proguard/ka$a;Ljava/nio/ByteBuffer;)I

    .line 4
    iget-byte v3, v2, Lcom/tencent/bugly/proguard/ka$a;->a:B

    const/4 v4, 0x0

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    return-object v1

    .line 5
    :pswitch_1
    iget v3, v2, Lcom/tencent/bugly/proguard/ka$a;->b:I

    .line 6
    iget-object v4, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-static {v2, v4}, Lcom/tencent/bugly/proguard/ka;->a(Lcom/tencent/bugly/proguard/ka$a;Ljava/nio/ByteBuffer;)I

    .line 7
    iget-byte v4, v2, Lcom/tencent/bugly/proguard/ka$a;->a:B

    if-nez v4, :cond_0

    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v4;->a()Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/ld;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ld;->f()I

    move-result v0

    .line 9
    new-array v0, v0, [B

    .line 10
    iget-object v2, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 11
    new-instance v2, Lcom/tencent/bugly/proguard/e2;

    invoke-direct {v2, v0, v3}, Lcom/tencent/bugly/proguard/e2;-><init>([BI)V

    return-object v2

    .line 12
    :cond_0
    new-instance v4, Lcom/tencent/bugly/proguard/ha;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", type: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v0, v2, Lcom/tencent/bugly/proguard/ka$a;->a:B

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/tencent/bugly/proguard/ha;-><init>(Ljava/lang/String;)V

    throw v4

    .line 13
    :pswitch_2
    iget v0, v2, Lcom/tencent/bugly/proguard/ka$a;->b:I

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ja;->a(I)Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    return-object v0

    .line 14
    :pswitch_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    :goto_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v4;->a()Lcom/tencent/bugly/proguard/ja;

    move-result-object v3

    if-nez v3, :cond_1

    .line 16
    new-array v3, v4, [Lcom/tencent/bugly/proguard/ja;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tencent/bugly/proguard/ja;

    iget v2, v2, Lcom/tencent/bugly/proguard/ka$a;->b:I

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/ja;->b([Lcom/tencent/bugly/proguard/ja;I)Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    return-object v0

    .line 17
    :cond_1
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 18
    :pswitch_4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v4;->a()Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/ld;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ld;->f()I

    move-result v0

    .line 19
    new-array v3, v0, [Lcom/tencent/bugly/proguard/ja;

    :goto_1
    if-ge v4, v0, :cond_2

    .line 20
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v4;->a()Lcom/tencent/bugly/proguard/ja;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 21
    :cond_2
    iget v0, v2, Lcom/tencent/bugly/proguard/ka$a;->b:I

    .line 22
    new-instance v2, Lcom/tencent/bugly/proguard/ya;

    invoke-direct {v2, v3, v0}, Lcom/tencent/bugly/proguard/ya;-><init>([Lcom/tencent/bugly/proguard/ja;I)V

    return-object v2

    .line 23
    :pswitch_5
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v4;->a()Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/ld;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ld;->f()I

    move-result v0

    .line 24
    new-array v3, v0, [Lcom/tencent/bugly/proguard/ja;

    .line 25
    new-array v5, v0, [Lcom/tencent/bugly/proguard/ja;

    :goto_2
    if-ge v4, v0, :cond_3

    .line 26
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v4;->a()Lcom/tencent/bugly/proguard/ja;

    move-result-object v6

    aput-object v6, v3, v4

    .line 27
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v4;->a()Lcom/tencent/bugly/proguard/ja;

    move-result-object v6

    aput-object v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 28
    :cond_3
    iget v0, v2, Lcom/tencent/bugly/proguard/ka$a;->b:I

    .line 29
    new-instance v2, Lcom/tencent/bugly/proguard/ob;

    invoke-direct {v2, v3, v5, v0}, Lcom/tencent/bugly/proguard/ob;-><init>([Lcom/tencent/bugly/proguard/ja;[Lcom/tencent/bugly/proguard/ja;I)V

    return-object v2

    .line 30
    :pswitch_6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    invoke-virtual {p0, v2, v0}, Lcom/tencent/bugly/proguard/v4;->a(Lcom/tencent/bugly/proguard/ka$a;I)Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    return-object v0

    .line 31
    :pswitch_7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    if-gez v0, :cond_4

    add-int/lit16 v0, v0, 0x100

    .line 32
    :cond_4
    invoke-virtual {p0, v2, v0}, Lcom/tencent/bugly/proguard/v4;->a(Lcom/tencent/bugly/proguard/ka$a;I)Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    return-object v0

    .line 33
    :pswitch_8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getDouble()D

    move-result-wide v3

    iget v0, v2, Lcom/tencent/bugly/proguard/ka$a;->b:I

    invoke-static {v3, v4, v0}, Lcom/tencent/bugly/proguard/ja;->a(DI)Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    return-object v0

    .line 34
    :pswitch_9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result v0

    iget v2, v2, Lcom/tencent/bugly/proguard/ka$a;->b:I

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/ja;->a(FI)Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    return-object v0

    .line 35
    :pswitch_a
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v3

    iget v0, v2, Lcom/tencent/bugly/proguard/ka$a;->b:I

    invoke-static {v3, v4, v0}, Lcom/tencent/bugly/proguard/ja;->a(JI)Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    return-object v0

    .line 36
    :pswitch_b
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iget v2, v2, Lcom/tencent/bugly/proguard/ka$a;->b:I

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/ja;->a(II)Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    return-object v0

    .line 37
    :pswitch_c
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iget v2, v2, Lcom/tencent/bugly/proguard/ka$a;->b:I

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/ja;->a(SI)Lcom/tencent/bugly/proguard/ja;

    move-result-object v0

    return-object v0

    .line 38
    :pswitch_d
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    iget v2, v2, Lcom/tencent/bugly/proguard/ka$a;->b:I

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/ja;->a(BI)Lcom/tencent/bugly/proguard/ja;

    move-result-object v0
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Lcom/tencent/bugly/proguard/ka$a;I)Lcom/tencent/bugly/proguard/ja;
    .locals 2

    .line 39
    new-array p2, p2, [B

    .line 40
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v4;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 41
    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/v4;->a:Ljava/lang/String;

    invoke-direct {v0, p2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 42
    :catch_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p2}, Ljava/lang/String;-><init>([B)V

    .line 43
    :goto_0
    iget p1, p1, Lcom/tencent/bugly/proguard/ka$a;->b:I

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/ja;->a(Ljava/lang/String;I)Lcom/tencent/bugly/proguard/ja;

    move-result-object p1

    return-object p1
.end method
